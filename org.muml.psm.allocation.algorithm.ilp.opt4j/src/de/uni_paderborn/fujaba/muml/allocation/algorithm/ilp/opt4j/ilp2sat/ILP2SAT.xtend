package de.uni_paderborn.fujaba.muml.allocation.algorithm.ilp.opt4j.ilp2sat

import de.uni_paderborn.fujaba.muml.allocation.ilp.ConstraintExpression
import de.uni_paderborn.fujaba.muml.allocation.ilp.IntegerLinearProgram
import de.uni_paderborn.fujaba.muml.allocation.ilp.VariableExpression
import java.util.List
import java.util.Stack
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtend.lib.annotations.Accessors
import org.opt4j.satdecoding.Constraint
import org.opt4j.satdecoding.Literal
import org.storydriven.core.expressions.Expression
import org.storydriven.core.expressions.common.ArithmeticExpression
import org.storydriven.core.expressions.common.ArithmeticOperator
import org.storydriven.core.expressions.common.ComparingOperator
import org.storydriven.core.expressions.common.LiteralExpression


// XXX: why so complicated...

// no need to inherit from IlpSwitch, because xtend does the
// better dispatching
class ILP2SAT implements IVisitor {
 
	val List<Constraint> constraintList
	val Stack<Expression> stack;
	var double accRHS;
	private static enum State {
		CONSTRAINT_LHS,
		CONSTRAINT_RHS
	}
	
	public def getConstraintList() {
		return constraintList;
	}
	
	
	private State state;
		
	public new() {
		constraintList = newArrayList
		stack = new Stack<Expression>()
		accRHS = 0
		state = null
	}
	
	private def void reduce() {
		stack.push(null)
		System.out.println("reduce: " + stack)
		notEmpty
		var canReduce = true
		while (canReduce && !stack.empty()) {
			val top = stack.pop
			illegalStack(top == null, top)
			notEmpty
			if (stack.peek == null) {
				stack.pop
				expect(typeof(ArithmeticExpression))
				stack.pop
				stack.push(null)
			} else if (stack.peek instanceof ConstraintExpression) {
				canReduce = false
				postProcess
			} else {
				// we are the lhs of an operator
				expect(typeof(ArithmeticExpression))
				stack.push(top)  // top == null
				canReduce = false
			}
		}
	}
	
	private def void postProcess() {
		if (state == State.CONSTRAINT_LHS) {
			state = State.CONSTRAINT_RHS
		} else if (state == State.CONSTRAINT_RHS) {
			state = null
			constraintList.head.rhs = accRHS as int
			accRHS = 0
			stack.pop
		}
		System.out.println("postProcess: " + stack)
	}
	
	public def dispatch visit(ConstraintExpression expression) {
		System.out.println(expression)
		if (!stack.empty()) {
			throw new IllegalStateException("predecessor stack should be empty")
		}
		state = State.CONSTRAINT_LHS
		stack.push(expression)
		constraintList.add(0, new Constraint)
		var Constraint.Operator op = null
		switch (expression.operator) {
			case ComparingOperator.EQUAL: op = Constraint.Operator.EQ
			case ComparingOperator.LESS_OR_EQUAL: op = Constraint.Operator.LE
			case ComparingOperator.GREATER_OR_EQUAL: op = Constraint.Operator.GE
			default: throw new IllegalArgumentException("unsupported operator: " + expression.operator)
		}
		constraintList.head.operator = op
	}
	
	public def dispatch visit(LiteralExpression expression) {
		System.out.println(expression)
		expectOrNull(typeof(Expression))
		val top = stack.peek
		if (top instanceof ArithmeticExpression) {			
			expectOperator(ArithmeticOperator.TIMES, ArithmeticOperator.PLUS)
			val operator = (stack.peek as ArithmeticExpression).operator
			if (operator == ArithmeticOperator.PLUS) {
				accumulateRHS(Double.parseDouble(expression.value))
				reduce
			} else {
				stack.push(expression)
			}
		} else if (top instanceof VariableExpression) {
			stack.pop
			// we could support other operators as well
			expectOperator(ArithmeticOperator.TIMES)
			stack.pop
			addLiteral(top, expression)
			reduce
		} else if (top instanceof ConstraintExpression) {
			accumulateRHS(Double.parseDouble(expression.value))
			reduce
		} else if (top == null) { 
			accumulateRHS(Double.parseDouble(expression.value))
			reduce
		} else {
			illegalStack
		}
	}
	
	private def void accumulateRHS(double value) {
		if (state == State.CONSTRAINT_LHS) {
			accRHS += -1 * value 
		} else {
			accRHS += value
		}
	}
		
	public def dispatch visit(VariableExpression expression) {
		System.out.println(expression)
		expectOrNull(typeof(Expression))
		val top = stack.peek
		if (top instanceof LiteralExpression) {
			stack.pop
			expectOperator(ArithmeticOperator.TIMES)
			stack.pop
			addLiteral(expression, top)
			reduce
		} else if (top instanceof ArithmeticExpression) {
			expectOperator(ArithmeticOperator.PLUS, ArithmeticOperator.TIMES)
			val operator = (stack.peek as ArithmeticExpression).operator
			if (operator == ArithmeticOperator.PLUS) {
				addLiteral(expression, "1")
				reduce
			} else {
				stack.push(expression)
			}
		} else if (top instanceof ConstraintExpression) {
			addLiteral(expression, "1")
			reduce
			// XXX: reduce?
		} else if (top == null) {
			addLiteral(expression, "1")
			reduce
		} else {
			illegalStack
		}
	}
	
	public def dispatch visit(ArithmeticExpression expression) {
		System.out.println(expression)
		expectOrNull(typeof(Expression))
		val top = stack.peek
		if (top instanceof ArithmeticExpression) {
			// just a sanity check
			val arith = top as ArithmeticExpression
			if (arith.operator == ArithmeticOperator.TIMES
					&& expression.operator == ArithmeticOperator.PLUS) {
				throw new IllegalStateException("do the math on your own! (distributivity law)")
			}
		}
		stack.push(expression)
	}
	
	public def dispatch visit(IntegerLinearProgram ilp) {
		
	}
	
	private def void notEmpty() {
		if (stack.empty()) {
			illegalStack("stack must not be empty")
		}
	}
	
	private def void expect(Class<?> clazz) {
		if (stack.empty() || !clazz.isInstance(stack.peek)) {
			illegalStack
		}
	}
	
	private def void expectOrNull(Class<?> clazz) {
		if (!stack.empty() && stack.peek == null) {
			return
		}
		expect(clazz)
	}
	
	private def illegalStack(boolean condition, Expression expression) {
		if (!condition) {
			stack.push(expression)
			illegalStack
		}
	}
	
	private def illegalStack() {
		illegalStack("unsupported stack state: " + stack)
	}
	
	private def illegalStack(String msg) {
		throw new IllegalStateException(msg)
	}
	
	private def void expectOperator(ArithmeticOperator... operators) {
		expect(typeof(ArithmeticExpression))
		val arith = stack.peek as ArithmeticExpression
		var found = false
		for (ArithmeticOperator operator : operators) {
			found = arith.operator == operator || found
		}
		if (!found) {
			illegalStack
		}
	}

	private def addLiteral(VariableExpression variableExpression, LiteralExpression literalExpression) {
		addLiteral(variableExpression, literalExpression.value)
	}
	
	private def addLiteral(VariableExpression variableExpression, String coefficient) {
		// should we support floats?
		var value = Double.parseDouble(coefficient)
		if (Math.ceil(value) - value.intValue > 0) {
			throw new IllegalArgumentException("floating point coefficient is not supported")
		}
		var coeff = value.intValue
		if (state == State.CONSTRAINT_RHS) {
			coeff *= -1
		}
		val literal = new Literal(variableExpression.variable, true)
		constraintList.head.add(coeff, literal)
	}
	
	public def dispatch visit(EObject object) {
		throw new IllegalArgumentException("got unexpected: " + object)
	}
	
}
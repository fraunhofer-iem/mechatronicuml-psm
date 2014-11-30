/*
 * generated by Xtext
 */
package de.uni_paderborn.fujaba.muml.psm.api.apimappinglanguage.scoping;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;

import de.uni_paderborn.fujaba.modelinstance.ModelElementCategory;
import de.uni_paderborn.fujaba.modelinstance.ModelInstancePlugin;
import de.uni_paderborn.fujaba.modelinstance.RootNode;
import de.uni_paderborn.fujaba.muml.behavior.Parameter;
import de.uni_paderborn.fujaba.muml.instance.ContinuousPortInstance;
import de.uni_paderborn.fujaba.muml.instance.InstancePackage;
import de.uni_paderborn.fujaba.muml.psm.apiexpressions.APICallExpression;
import de.uni_paderborn.fujaba.muml.swplatform.APICommand;
import de.uni_paderborn.fujaba.muml.swplatform.EnumerationValue;
import de.uni_paderborn.fujaba.muml.swplatform.SwplatformPackage;
import de.uni_paderborn.fujaba.muml.types.DataType;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#scoping on how and when
 * to use it
 * 
 */
public class APIMappingLanguageScopeProvider extends
		de.uni_paderborn.fujaba.muml.scoping.ActionLanguageScopeProvider {
	private static final String OS_CATEGORY_KEY = "de.uni_paderborn.fujaba.muml.os.category";
	private static final String TYPES_CATEGORY_KEY = "de.uni_paderborn.fujaba.muml.types.category";
	private static final String INSTANCE_CATEGORY_KEY = "de.uni_paderborn.fujaba.muml.instance.category";

	public static RootNode rootNode;

	private List<APICommand> apiCommandList;
	private List<Parameter> parameterList;
	private List<DataType> typeList;
	private List<EnumerationValue> enumerationValues;
	private List<ContinuousPortInstance> continuousPortInstancesList;

	public APIMappingLanguageScopeProvider() {
		super();
	}
	


	IScope scope_ParameterBinding_parameter(Object object, EReference ref){
		APICallExpression apiCallExpression=null;
		if (((EObject) object).eContainer() instanceof APICallExpression
				&& "parameter".equalsIgnoreCase(ref.getName())) {
			apiCallExpression = (APICallExpression) ((EObject) object).eContainer();
		}
		if(object instanceof APICallExpression){
			apiCallExpression = (APICallExpression) object;
		}
		if(apiCallExpression != null){
			parameterList = new ArrayList<Parameter>();
			parameterList.addAll(apiCallExpression
					.getApiCommand().getParameters());

			return createScope(parameterList);
		}
		return super.getScope((EObject) object, ref);
	}
//	
//	IScope scope_ContinuousPortExpression_continuousPort(Object object, EReference ref){
//		continuousPortInstancesList = new ArrayList<ContinuousPortInstance>();
//		if (((EObject) object).eContainer() instanceof ParameterBinding) {
//			PortApiMapping mapping = (PortApiMapping) ((EObject) object).eContainer()
//					.eContainer().eContainer();
//			continuousPortInstancesList.add(mapping.getPort());
//			return createScope(continuousPortInstancesList);
//		}
//		return super.getScope((EObject) object, ref);
//	}
//	

//	
//	IScope scope_ContinuousPortExpression(Object object, EReference ref){
//		ArrayList<ContinuousPortInstance> conInstances = new ArrayList<ContinuousPortInstance>();
//		if (((EObject) object).eContainer() instanceof ParameterBinding) {
//			PortApiMapping mapping = (PortApiMapping) ((EObject) object).eContainer()
//					.eContainer().eContainer();
//			conInstances.add(mapping.getPort());
//			return createScope(conInstances);
//		}
//		return super.getScope((EObject) object, ref);
//	}
//	
//	IScope scope_EnumerationValueExpression(Object object, EReference ref){
//		enumerationValues = new ArrayList<EnumerationValue>();
//		if (((EObject) object).eContainer() instanceof ParameterBinding) {
//			if (((EObject) object).eContainer().eContainer() instanceof APICallExpression) {
//				APICommand cmd = (APICommand) ((EObject) object).eContainer()
//						.eContainer();
//				OperatingSystem os = cmd.getRepository().getSwPlatform();
//				TreeIterator<EObject> iteratror = os.eAllContents();
//				while (iteratror.hasNext()) {
//					EObject element = iteratror.next();
//					if (element instanceof EnumerationValue) {
//						enumerationValues.add((EnumerationValue)element);
//					}
//
//				}
//				return createScope(enumerationValues);
//			}
//	}
//		return super.getScope((EObject) object, ref);
//	}
	


	/**
	 * Creates a corresponding scope from the list of referenceable objects
	 * 
	 * @param list
	 * @return
	 */
	private IScope createScope(List<? extends EObject> list) {
		if (list == null || list.isEmpty()) {
			return IScope.NULLSCOPE;
		}
		IScope scope = Scopes.scopeFor(list);

		/*
		 * for (IEObjectDescription descr : scope.getAllElements()) //debugging
		 * log System.out.println(descr.getQualifiedName().toString());
		 * System.out.println();
		 */
		return scope;
	}

	public void initContiniousPortInstances(List<ContinuousPortInstance> list) {		
		ModelElementCategory modelElementCategory = ModelInstancePlugin.getInstance()
				.getModelElementCategoryRegistry()
				.getModelElementCategory(rootNode, INSTANCE_CATEGORY_KEY);
		final TreeIterator<EObject> allContents = modelElementCategory.eAllContents();
		while (allContents.hasNext()) {
			final EObject eObject = allContents.next();
			if (InstancePackage.Literals.CONTINUOUS_PORT_INSTANCE.isSuperTypeOf(eObject.eClass())) {
				list.add((ContinuousPortInstance) eObject);
			}
		}
	}

	private void initAPICommands() {
		apiCommandList = new ArrayList<APICommand>();
		final TreeIterator<EObject> allContents = rootNode.eResource()
				.getAllContents();
		while (allContents.hasNext()) {
			final EObject eObject = allContents.next();
			if (eObject.eClass() == SwplatformPackage.Literals.API_COMMAND) {
				apiCommandList.add((APICommand) eObject);
			}
		}
	}
	
	private void initDataTypes(RootNode object) {
		typeList = new ArrayList<DataType>();
		ModelElementCategory modelElementCategory = ModelInstancePlugin.getInstance()
				.getModelElementCategoryRegistry()
				.getModelElementCategory(rootNode, TYPES_CATEGORY_KEY);
		for (EObject type : modelElementCategory.getModelElements()) {
			typeList.add((DataType) type);
		}
	}
}

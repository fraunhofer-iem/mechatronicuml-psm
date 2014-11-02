/*
* generated by Xtext
*/
package de.uni_paderborn.fujaba.muml.allocation.language.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import de.uni_paderborn.fujaba.muml.allocation.language.services.AllocationSpecificationLanguageGrammarAccess;

public class AllocationSpecificationLanguageParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private AllocationSpecificationLanguageGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected de.uni_paderborn.fujaba.muml.allocation.language.parser.antlr.internal.InternalAllocationSpecificationLanguageParser createParser(XtextTokenStream stream) {
		return new de.uni_paderborn.fujaba.muml.allocation.language.parser.antlr.internal.InternalAllocationSpecificationLanguageParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Specification";
	}
	
	public AllocationSpecificationLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(AllocationSpecificationLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}

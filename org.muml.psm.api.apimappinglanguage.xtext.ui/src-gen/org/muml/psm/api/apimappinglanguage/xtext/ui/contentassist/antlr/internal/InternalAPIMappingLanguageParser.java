package org.muml.psm.api.apimappinglanguage.xtext.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.muml.psm.api.apimappinglanguage.xtext.services.APIMappingLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAPIMappingLanguageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_NUMBER", "RULE_BOOLEAN", "RULE_STRING", "RULE_MINORMAXKEYWORD", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'||'", "'&&'", "'null'", "'++'", "'--'", "':='", "'+='", "'-='", "'=='", "'<>'", "'<'", "'<='", "'>='", "'>'", "'+'", "'-'", "'*'", "'/'", "'%'", "'not'", "'self'", "'first'", "'last'", "'prev'", "'next'", "'MappingRepository:'", "'{'", "'}'", "','", "'#'", "'import'", "'PortInstance:'", "'execCommand:'", "'initCommand:'", "'enum:'", "'API_Call:'", "'('", "')'", "'port:'", "';'", "'.'", "'for'", "'while'", "'do'", "');'", "'if'", "'else'", "'elseif'", "'return'", "'['", "']'", "'->'", "'const'"
    };
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=7;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=12;
    public static final int RULE_MINORMAXKEYWORD=9;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_NUMBER=6;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalAPIMappingLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAPIMappingLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAPIMappingLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAPIMappingLanguage.g"; }


     
     	private APIMappingLanguageGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(APIMappingLanguageGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleMappingRepository"
    // InternalAPIMappingLanguage.g:60:1: entryRuleMappingRepository : ruleMappingRepository EOF ;
    public final void entryRuleMappingRepository() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:61:1: ( ruleMappingRepository EOF )
            // InternalAPIMappingLanguage.g:62:1: ruleMappingRepository EOF
            {
             before(grammarAccess.getMappingRepositoryRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMappingRepository();

            state._fsp--;

             after(grammarAccess.getMappingRepositoryRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMappingRepository"


    // $ANTLR start "ruleMappingRepository"
    // InternalAPIMappingLanguage.g:69:1: ruleMappingRepository : ( ( rule__MappingRepository__Group__0 ) ) ;
    public final void ruleMappingRepository() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:73:2: ( ( ( rule__MappingRepository__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:74:1: ( ( rule__MappingRepository__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:74:1: ( ( rule__MappingRepository__Group__0 ) )
            // InternalAPIMappingLanguage.g:75:1: ( rule__MappingRepository__Group__0 )
            {
             before(grammarAccess.getMappingRepositoryAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:76:1: ( rule__MappingRepository__Group__0 )
            // InternalAPIMappingLanguage.g:76:2: rule__MappingRepository__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MappingRepository__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMappingRepositoryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMappingRepository"


    // $ANTLR start "entryRuleImport"
    // InternalAPIMappingLanguage.g:88:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:89:1: ( ruleImport EOF )
            // InternalAPIMappingLanguage.g:90:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalAPIMappingLanguage.g:97:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:101:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:102:1: ( ( rule__Import__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:102:1: ( ( rule__Import__Group__0 ) )
            // InternalAPIMappingLanguage.g:103:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:104:1: ( rule__Import__Group__0 )
            // InternalAPIMappingLanguage.g:104:2: rule__Import__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRulePortApiMapping"
    // InternalAPIMappingLanguage.g:116:1: entryRulePortApiMapping : rulePortApiMapping EOF ;
    public final void entryRulePortApiMapping() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:117:1: ( rulePortApiMapping EOF )
            // InternalAPIMappingLanguage.g:118:1: rulePortApiMapping EOF
            {
             before(grammarAccess.getPortApiMappingRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            rulePortApiMapping();

            state._fsp--;

             after(grammarAccess.getPortApiMappingRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePortApiMapping"


    // $ANTLR start "rulePortApiMapping"
    // InternalAPIMappingLanguage.g:125:1: rulePortApiMapping : ( ( rule__PortApiMapping__Group__0 ) ) ;
    public final void rulePortApiMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:129:2: ( ( ( rule__PortApiMapping__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:130:1: ( ( rule__PortApiMapping__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:130:1: ( ( rule__PortApiMapping__Group__0 ) )
            // InternalAPIMappingLanguage.g:131:1: ( rule__PortApiMapping__Group__0 )
            {
             before(grammarAccess.getPortApiMappingAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:132:1: ( rule__PortApiMapping__Group__0 )
            // InternalAPIMappingLanguage.g:132:2: rule__PortApiMapping__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PortApiMapping__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPortApiMappingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePortApiMapping"


    // $ANTLR start "entryRuleExpression"
    // InternalAPIMappingLanguage.g:144:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:145:1: ( ruleExpression EOF )
            // InternalAPIMappingLanguage.g:146:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalAPIMappingLanguage.g:153:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:157:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalAPIMappingLanguage.g:158:1: ( ( rule__Expression__Alternatives ) )
            {
            // InternalAPIMappingLanguage.g:158:1: ( ( rule__Expression__Alternatives ) )
            // InternalAPIMappingLanguage.g:159:1: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalAPIMappingLanguage.g:160:1: ( rule__Expression__Alternatives )
            // InternalAPIMappingLanguage.g:160:2: rule__Expression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Expression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleEnumerationValueExpression"
    // InternalAPIMappingLanguage.g:172:1: entryRuleEnumerationValueExpression : ruleEnumerationValueExpression EOF ;
    public final void entryRuleEnumerationValueExpression() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:173:1: ( ruleEnumerationValueExpression EOF )
            // InternalAPIMappingLanguage.g:174:1: ruleEnumerationValueExpression EOF
            {
             before(grammarAccess.getEnumerationValueExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEnumerationValueExpression();

            state._fsp--;

             after(grammarAccess.getEnumerationValueExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEnumerationValueExpression"


    // $ANTLR start "ruleEnumerationValueExpression"
    // InternalAPIMappingLanguage.g:181:1: ruleEnumerationValueExpression : ( ( rule__EnumerationValueExpression__Group__0 ) ) ;
    public final void ruleEnumerationValueExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:185:2: ( ( ( rule__EnumerationValueExpression__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:186:1: ( ( rule__EnumerationValueExpression__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:186:1: ( ( rule__EnumerationValueExpression__Group__0 ) )
            // InternalAPIMappingLanguage.g:187:1: ( rule__EnumerationValueExpression__Group__0 )
            {
             before(grammarAccess.getEnumerationValueExpressionAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:188:1: ( rule__EnumerationValueExpression__Group__0 )
            // InternalAPIMappingLanguage.g:188:2: rule__EnumerationValueExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumerationValueExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationValueExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumerationValueExpression"


    // $ANTLR start "entryRuleAPICallExpression"
    // InternalAPIMappingLanguage.g:200:1: entryRuleAPICallExpression : ruleAPICallExpression EOF ;
    public final void entryRuleAPICallExpression() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:201:1: ( ruleAPICallExpression EOF )
            // InternalAPIMappingLanguage.g:202:1: ruleAPICallExpression EOF
            {
             before(grammarAccess.getAPICallExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAPICallExpression();

            state._fsp--;

             after(grammarAccess.getAPICallExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAPICallExpression"


    // $ANTLR start "ruleAPICallExpression"
    // InternalAPIMappingLanguage.g:209:1: ruleAPICallExpression : ( ( rule__APICallExpression__Group__0 ) ) ;
    public final void ruleAPICallExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:213:2: ( ( ( rule__APICallExpression__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:214:1: ( ( rule__APICallExpression__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:214:1: ( ( rule__APICallExpression__Group__0 ) )
            // InternalAPIMappingLanguage.g:215:1: ( rule__APICallExpression__Group__0 )
            {
             before(grammarAccess.getAPICallExpressionAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:216:1: ( rule__APICallExpression__Group__0 )
            // InternalAPIMappingLanguage.g:216:2: rule__APICallExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__APICallExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAPICallExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAPICallExpression"


    // $ANTLR start "entryRuleParamaterBinding"
    // InternalAPIMappingLanguage.g:228:1: entryRuleParamaterBinding : ruleParamaterBinding EOF ;
    public final void entryRuleParamaterBinding() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:229:1: ( ruleParamaterBinding EOF )
            // InternalAPIMappingLanguage.g:230:1: ruleParamaterBinding EOF
            {
             before(grammarAccess.getParamaterBindingRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleParamaterBinding();

            state._fsp--;

             after(grammarAccess.getParamaterBindingRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParamaterBinding"


    // $ANTLR start "ruleParamaterBinding"
    // InternalAPIMappingLanguage.g:237:1: ruleParamaterBinding : ( ( rule__ParamaterBinding__Group__0 ) ) ;
    public final void ruleParamaterBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:241:2: ( ( ( rule__ParamaterBinding__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:242:1: ( ( rule__ParamaterBinding__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:242:1: ( ( rule__ParamaterBinding__Group__0 ) )
            // InternalAPIMappingLanguage.g:243:1: ( rule__ParamaterBinding__Group__0 )
            {
             before(grammarAccess.getParamaterBindingAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:244:1: ( rule__ParamaterBinding__Group__0 )
            // InternalAPIMappingLanguage.g:244:2: rule__ParamaterBinding__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParamaterBinding__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParamaterBindingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParamaterBinding"


    // $ANTLR start "entryRuleContiniousPortExpressions"
    // InternalAPIMappingLanguage.g:256:1: entryRuleContiniousPortExpressions : ruleContiniousPortExpressions EOF ;
    public final void entryRuleContiniousPortExpressions() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:257:1: ( ruleContiniousPortExpressions EOF )
            // InternalAPIMappingLanguage.g:258:1: ruleContiniousPortExpressions EOF
            {
             before(grammarAccess.getContiniousPortExpressionsRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleContiniousPortExpressions();

            state._fsp--;

             after(grammarAccess.getContiniousPortExpressionsRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContiniousPortExpressions"


    // $ANTLR start "ruleContiniousPortExpressions"
    // InternalAPIMappingLanguage.g:265:1: ruleContiniousPortExpressions : ( ( rule__ContiniousPortExpressions__Group__0 ) ) ;
    public final void ruleContiniousPortExpressions() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:269:2: ( ( ( rule__ContiniousPortExpressions__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:270:1: ( ( rule__ContiniousPortExpressions__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:270:1: ( ( rule__ContiniousPortExpressions__Group__0 ) )
            // InternalAPIMappingLanguage.g:271:1: ( rule__ContiniousPortExpressions__Group__0 )
            {
             before(grammarAccess.getContiniousPortExpressionsAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:272:1: ( rule__ContiniousPortExpressions__Group__0 )
            // InternalAPIMappingLanguage.g:272:2: rule__ContiniousPortExpressions__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ContiniousPortExpressions__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContiniousPortExpressionsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContiniousPortExpressions"


    // $ANTLR start "entryRuleExpressionStartRule"
    // InternalAPIMappingLanguage.g:284:1: entryRuleExpressionStartRule : ruleExpressionStartRule EOF ;
    public final void entryRuleExpressionStartRule() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:285:1: ( ruleExpressionStartRule EOF )
            // InternalAPIMappingLanguage.g:286:1: ruleExpressionStartRule EOF
            {
             before(grammarAccess.getExpressionStartRuleRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleExpressionStartRule();

            state._fsp--;

             after(grammarAccess.getExpressionStartRuleRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpressionStartRule"


    // $ANTLR start "ruleExpressionStartRule"
    // InternalAPIMappingLanguage.g:293:1: ruleExpressionStartRule : ( ( rule__ExpressionStartRule__Alternatives ) ) ;
    public final void ruleExpressionStartRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:297:2: ( ( ( rule__ExpressionStartRule__Alternatives ) ) )
            // InternalAPIMappingLanguage.g:298:1: ( ( rule__ExpressionStartRule__Alternatives ) )
            {
            // InternalAPIMappingLanguage.g:298:1: ( ( rule__ExpressionStartRule__Alternatives ) )
            // InternalAPIMappingLanguage.g:299:1: ( rule__ExpressionStartRule__Alternatives )
            {
             before(grammarAccess.getExpressionStartRuleAccess().getAlternatives()); 
            // InternalAPIMappingLanguage.g:300:1: ( rule__ExpressionStartRule__Alternatives )
            // InternalAPIMappingLanguage.g:300:2: rule__ExpressionStartRule__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExpressionStartRule__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionStartRuleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionStartRule"


    // $ANTLR start "entryRuleEString"
    // InternalAPIMappingLanguage.g:312:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:313:1: ( ruleEString EOF )
            // InternalAPIMappingLanguage.g:314:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalAPIMappingLanguage.g:321:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:325:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalAPIMappingLanguage.g:326:1: ( ( rule__EString__Alternatives ) )
            {
            // InternalAPIMappingLanguage.g:326:1: ( ( rule__EString__Alternatives ) )
            // InternalAPIMappingLanguage.g:327:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalAPIMappingLanguage.g:328:1: ( rule__EString__Alternatives )
            // InternalAPIMappingLanguage.g:328:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalAPIMappingLanguage.g:340:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:341:1: ( ruleQualifiedName EOF )
            // InternalAPIMappingLanguage.g:342:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalAPIMappingLanguage.g:349:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:353:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:354:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:354:1: ( ( rule__QualifiedName__Group__0 ) )
            // InternalAPIMappingLanguage.g:355:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:356:1: ( rule__QualifiedName__Group__0 )
            // InternalAPIMappingLanguage.g:356:2: rule__QualifiedName__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleEntry"
    // InternalAPIMappingLanguage.g:368:1: entryRuleEntry : ruleEntry EOF ;
    public final void entryRuleEntry() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:369:1: ( ruleEntry EOF )
            // InternalAPIMappingLanguage.g:370:1: ruleEntry EOF
            {
             before(grammarAccess.getEntryRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEntry();

            state._fsp--;

             after(grammarAccess.getEntryRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntry"


    // $ANTLR start "ruleEntry"
    // InternalAPIMappingLanguage.g:377:1: ruleEntry : ( ( rule__Entry__Alternatives ) ) ;
    public final void ruleEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:381:2: ( ( ( rule__Entry__Alternatives ) ) )
            // InternalAPIMappingLanguage.g:382:1: ( ( rule__Entry__Alternatives ) )
            {
            // InternalAPIMappingLanguage.g:382:1: ( ( rule__Entry__Alternatives ) )
            // InternalAPIMappingLanguage.g:383:1: ( rule__Entry__Alternatives )
            {
             before(grammarAccess.getEntryAccess().getAlternatives()); 
            // InternalAPIMappingLanguage.g:384:1: ( rule__Entry__Alternatives )
            // InternalAPIMappingLanguage.g:384:2: rule__Entry__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Entry__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEntryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntry"


    // $ANTLR start "entryRuleBlock"
    // InternalAPIMappingLanguage.g:396:1: entryRuleBlock : ruleBlock EOF ;
    public final void entryRuleBlock() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");

        try {
            // InternalAPIMappingLanguage.g:400:1: ( ruleBlock EOF )
            // InternalAPIMappingLanguage.g:401:1: ruleBlock EOF
            {
             before(grammarAccess.getBlockRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getBlockRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalAPIMappingLanguage.g:411:1: ruleBlock : ( ( rule__Block__Group__0 ) ) ;
    public final void ruleBlock() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:416:2: ( ( ( rule__Block__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:417:1: ( ( rule__Block__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:417:1: ( ( rule__Block__Group__0 ) )
            // InternalAPIMappingLanguage.g:418:1: ( rule__Block__Group__0 )
            {
             before(grammarAccess.getBlockAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:419:1: ( rule__Block__Group__0 )
            // InternalAPIMappingLanguage.g:419:2: rule__Block__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Block__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleForLoop"
    // InternalAPIMappingLanguage.g:432:1: entryRuleForLoop : ruleForLoop EOF ;
    public final void entryRuleForLoop() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:433:1: ( ruleForLoop EOF )
            // InternalAPIMappingLanguage.g:434:1: ruleForLoop EOF
            {
             before(grammarAccess.getForLoopRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleForLoop();

            state._fsp--;

             after(grammarAccess.getForLoopRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleForLoop"


    // $ANTLR start "ruleForLoop"
    // InternalAPIMappingLanguage.g:441:1: ruleForLoop : ( ( rule__ForLoop__Group__0 ) ) ;
    public final void ruleForLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:445:2: ( ( ( rule__ForLoop__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:446:1: ( ( rule__ForLoop__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:446:1: ( ( rule__ForLoop__Group__0 ) )
            // InternalAPIMappingLanguage.g:447:1: ( rule__ForLoop__Group__0 )
            {
             before(grammarAccess.getForLoopAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:448:1: ( rule__ForLoop__Group__0 )
            // InternalAPIMappingLanguage.g:448:2: rule__ForLoop__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ForLoop__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getForLoopAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForLoop"


    // $ANTLR start "entryRuleForLoopCountingExpression"
    // InternalAPIMappingLanguage.g:460:1: entryRuleForLoopCountingExpression : ruleForLoopCountingExpression EOF ;
    public final void entryRuleForLoopCountingExpression() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:461:1: ( ruleForLoopCountingExpression EOF )
            // InternalAPIMappingLanguage.g:462:1: ruleForLoopCountingExpression EOF
            {
             before(grammarAccess.getForLoopCountingExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleForLoopCountingExpression();

            state._fsp--;

             after(grammarAccess.getForLoopCountingExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleForLoopCountingExpression"


    // $ANTLR start "ruleForLoopCountingExpression"
    // InternalAPIMappingLanguage.g:469:1: ruleForLoopCountingExpression : ( ( rule__ForLoopCountingExpression__Group__0 ) ) ;
    public final void ruleForLoopCountingExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:473:2: ( ( ( rule__ForLoopCountingExpression__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:474:1: ( ( rule__ForLoopCountingExpression__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:474:1: ( ( rule__ForLoopCountingExpression__Group__0 ) )
            // InternalAPIMappingLanguage.g:475:1: ( rule__ForLoopCountingExpression__Group__0 )
            {
             before(grammarAccess.getForLoopCountingExpressionAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:476:1: ( rule__ForLoopCountingExpression__Group__0 )
            // InternalAPIMappingLanguage.g:476:2: rule__ForLoopCountingExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ForLoopCountingExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getForLoopCountingExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForLoopCountingExpression"


    // $ANTLR start "entryRuleWhileLoop"
    // InternalAPIMappingLanguage.g:488:1: entryRuleWhileLoop : ruleWhileLoop EOF ;
    public final void entryRuleWhileLoop() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:489:1: ( ruleWhileLoop EOF )
            // InternalAPIMappingLanguage.g:490:1: ruleWhileLoop EOF
            {
             before(grammarAccess.getWhileLoopRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleWhileLoop();

            state._fsp--;

             after(grammarAccess.getWhileLoopRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWhileLoop"


    // $ANTLR start "ruleWhileLoop"
    // InternalAPIMappingLanguage.g:497:1: ruleWhileLoop : ( ( rule__WhileLoop__Group__0 ) ) ;
    public final void ruleWhileLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:501:2: ( ( ( rule__WhileLoop__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:502:1: ( ( rule__WhileLoop__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:502:1: ( ( rule__WhileLoop__Group__0 ) )
            // InternalAPIMappingLanguage.g:503:1: ( rule__WhileLoop__Group__0 )
            {
             before(grammarAccess.getWhileLoopAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:504:1: ( rule__WhileLoop__Group__0 )
            // InternalAPIMappingLanguage.g:504:2: rule__WhileLoop__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__WhileLoop__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWhileLoopAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWhileLoop"


    // $ANTLR start "entryRuleDoWhileLoop"
    // InternalAPIMappingLanguage.g:516:1: entryRuleDoWhileLoop : ruleDoWhileLoop EOF ;
    public final void entryRuleDoWhileLoop() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:517:1: ( ruleDoWhileLoop EOF )
            // InternalAPIMappingLanguage.g:518:1: ruleDoWhileLoop EOF
            {
             before(grammarAccess.getDoWhileLoopRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleDoWhileLoop();

            state._fsp--;

             after(grammarAccess.getDoWhileLoopRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDoWhileLoop"


    // $ANTLR start "ruleDoWhileLoop"
    // InternalAPIMappingLanguage.g:525:1: ruleDoWhileLoop : ( ( rule__DoWhileLoop__Group__0 ) ) ;
    public final void ruleDoWhileLoop() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:529:2: ( ( ( rule__DoWhileLoop__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:530:1: ( ( rule__DoWhileLoop__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:530:1: ( ( rule__DoWhileLoop__Group__0 ) )
            // InternalAPIMappingLanguage.g:531:1: ( rule__DoWhileLoop__Group__0 )
            {
             before(grammarAccess.getDoWhileLoopAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:532:1: ( rule__DoWhileLoop__Group__0 )
            // InternalAPIMappingLanguage.g:532:2: rule__DoWhileLoop__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DoWhileLoop__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDoWhileLoopAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDoWhileLoop"


    // $ANTLR start "entryRuleIfStatement"
    // InternalAPIMappingLanguage.g:544:1: entryRuleIfStatement : ruleIfStatement EOF ;
    public final void entryRuleIfStatement() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:545:1: ( ruleIfStatement EOF )
            // InternalAPIMappingLanguage.g:546:1: ruleIfStatement EOF
            {
             before(grammarAccess.getIfStatementRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleIfStatement();

            state._fsp--;

             after(grammarAccess.getIfStatementRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIfStatement"


    // $ANTLR start "ruleIfStatement"
    // InternalAPIMappingLanguage.g:553:1: ruleIfStatement : ( ( rule__IfStatement__Group__0 ) ) ;
    public final void ruleIfStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:557:2: ( ( ( rule__IfStatement__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:558:1: ( ( rule__IfStatement__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:558:1: ( ( rule__IfStatement__Group__0 ) )
            // InternalAPIMappingLanguage.g:559:1: ( rule__IfStatement__Group__0 )
            {
             before(grammarAccess.getIfStatementAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:560:1: ( rule__IfStatement__Group__0 )
            // InternalAPIMappingLanguage.g:560:2: rule__IfStatement__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IfStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRuleElseIfStatement"
    // InternalAPIMappingLanguage.g:572:1: entryRuleElseIfStatement : ruleElseIfStatement EOF ;
    public final void entryRuleElseIfStatement() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:573:1: ( ruleElseIfStatement EOF )
            // InternalAPIMappingLanguage.g:574:1: ruleElseIfStatement EOF
            {
             before(grammarAccess.getElseIfStatementRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleElseIfStatement();

            state._fsp--;

             after(grammarAccess.getElseIfStatementRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElseIfStatement"


    // $ANTLR start "ruleElseIfStatement"
    // InternalAPIMappingLanguage.g:581:1: ruleElseIfStatement : ( ( rule__ElseIfStatement__Group__0 ) ) ;
    public final void ruleElseIfStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:585:2: ( ( ( rule__ElseIfStatement__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:586:1: ( ( rule__ElseIfStatement__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:586:1: ( ( rule__ElseIfStatement__Group__0 ) )
            // InternalAPIMappingLanguage.g:587:1: ( rule__ElseIfStatement__Group__0 )
            {
             before(grammarAccess.getElseIfStatementAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:588:1: ( rule__ElseIfStatement__Group__0 )
            // InternalAPIMappingLanguage.g:588:2: rule__ElseIfStatement__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ElseIfStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getElseIfStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElseIfStatement"


    // $ANTLR start "entryRuleReturnStatement"
    // InternalAPIMappingLanguage.g:600:1: entryRuleReturnStatement : ruleReturnStatement EOF ;
    public final void entryRuleReturnStatement() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:601:1: ( ruleReturnStatement EOF )
            // InternalAPIMappingLanguage.g:602:1: ruleReturnStatement EOF
            {
             before(grammarAccess.getReturnStatementRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleReturnStatement();

            state._fsp--;

             after(grammarAccess.getReturnStatementRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReturnStatement"


    // $ANTLR start "ruleReturnStatement"
    // InternalAPIMappingLanguage.g:609:1: ruleReturnStatement : ( ( rule__ReturnStatement__Group__0 ) ) ;
    public final void ruleReturnStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:613:2: ( ( ( rule__ReturnStatement__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:614:1: ( ( rule__ReturnStatement__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:614:1: ( ( rule__ReturnStatement__Group__0 ) )
            // InternalAPIMappingLanguage.g:615:1: ( rule__ReturnStatement__Group__0 )
            {
             before(grammarAccess.getReturnStatementAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:616:1: ( rule__ReturnStatement__Group__0 )
            // InternalAPIMappingLanguage.g:616:2: rule__ReturnStatement__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ReturnStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReturnStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReturnStatement"


    // $ANTLR start "entryRuleOperationCallStatement"
    // InternalAPIMappingLanguage.g:628:1: entryRuleOperationCallStatement : ruleOperationCallStatement EOF ;
    public final void entryRuleOperationCallStatement() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:629:1: ( ruleOperationCallStatement EOF )
            // InternalAPIMappingLanguage.g:630:1: ruleOperationCallStatement EOF
            {
             before(grammarAccess.getOperationCallStatementRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleOperationCallStatement();

            state._fsp--;

             after(grammarAccess.getOperationCallStatementRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperationCallStatement"


    // $ANTLR start "ruleOperationCallStatement"
    // InternalAPIMappingLanguage.g:637:1: ruleOperationCallStatement : ( ( rule__OperationCallStatement__Group__0 ) ) ;
    public final void ruleOperationCallStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:641:2: ( ( ( rule__OperationCallStatement__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:642:1: ( ( rule__OperationCallStatement__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:642:1: ( ( rule__OperationCallStatement__Group__0 ) )
            // InternalAPIMappingLanguage.g:643:1: ( rule__OperationCallStatement__Group__0 )
            {
             before(grammarAccess.getOperationCallStatementAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:644:1: ( rule__OperationCallStatement__Group__0 )
            // InternalAPIMappingLanguage.g:644:2: rule__OperationCallStatement__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OperationCallStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperationCallStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperationCallStatement"


    // $ANTLR start "entryRuleAssignment"
    // InternalAPIMappingLanguage.g:656:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:657:1: ( ruleAssignment EOF )
            // InternalAPIMappingLanguage.g:658:1: ruleAssignment EOF
            {
             before(grammarAccess.getAssignmentRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getAssignmentRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalAPIMappingLanguage.g:665:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:669:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:670:1: ( ( rule__Assignment__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:670:1: ( ( rule__Assignment__Group__0 ) )
            // InternalAPIMappingLanguage.g:671:1: ( rule__Assignment__Group__0 )
            {
             before(grammarAccess.getAssignmentAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:672:1: ( rule__Assignment__Group__0 )
            // InternalAPIMappingLanguage.g:672:2: rule__Assignment__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Assignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleInitializeExpression"
    // InternalAPIMappingLanguage.g:684:1: entryRuleInitializeExpression : ruleInitializeExpression EOF ;
    public final void entryRuleInitializeExpression() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:685:1: ( ruleInitializeExpression EOF )
            // InternalAPIMappingLanguage.g:686:1: ruleInitializeExpression EOF
            {
             before(grammarAccess.getInitializeExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleInitializeExpression();

            state._fsp--;

             after(grammarAccess.getInitializeExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInitializeExpression"


    // $ANTLR start "ruleInitializeExpression"
    // InternalAPIMappingLanguage.g:693:1: ruleInitializeExpression : ( ( rule__InitializeExpression__Alternatives ) ) ;
    public final void ruleInitializeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:697:2: ( ( ( rule__InitializeExpression__Alternatives ) ) )
            // InternalAPIMappingLanguage.g:698:1: ( ( rule__InitializeExpression__Alternatives ) )
            {
            // InternalAPIMappingLanguage.g:698:1: ( ( rule__InitializeExpression__Alternatives ) )
            // InternalAPIMappingLanguage.g:699:1: ( rule__InitializeExpression__Alternatives )
            {
             before(grammarAccess.getInitializeExpressionAccess().getAlternatives()); 
            // InternalAPIMappingLanguage.g:700:1: ( rule__InitializeExpression__Alternatives )
            // InternalAPIMappingLanguage.g:700:2: rule__InitializeExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__InitializeExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInitializeExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInitializeExpression"


    // $ANTLR start "entryRuleArrayInitializeExpression"
    // InternalAPIMappingLanguage.g:712:1: entryRuleArrayInitializeExpression : ruleArrayInitializeExpression EOF ;
    public final void entryRuleArrayInitializeExpression() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:713:1: ( ruleArrayInitializeExpression EOF )
            // InternalAPIMappingLanguage.g:714:1: ruleArrayInitializeExpression EOF
            {
             before(grammarAccess.getArrayInitializeExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleArrayInitializeExpression();

            state._fsp--;

             after(grammarAccess.getArrayInitializeExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArrayInitializeExpression"


    // $ANTLR start "ruleArrayInitializeExpression"
    // InternalAPIMappingLanguage.g:721:1: ruleArrayInitializeExpression : ( ( rule__ArrayInitializeExpression__Group__0 ) ) ;
    public final void ruleArrayInitializeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:725:2: ( ( ( rule__ArrayInitializeExpression__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:726:1: ( ( rule__ArrayInitializeExpression__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:726:1: ( ( rule__ArrayInitializeExpression__Group__0 ) )
            // InternalAPIMappingLanguage.g:727:1: ( rule__ArrayInitializeExpression__Group__0 )
            {
             before(grammarAccess.getArrayInitializeExpressionAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:728:1: ( rule__ArrayInitializeExpression__Group__0 )
            // InternalAPIMappingLanguage.g:728:2: rule__ArrayInitializeExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ArrayInitializeExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArrayInitializeExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArrayInitializeExpression"


    // $ANTLR start "entryRuleLocalVariableOrConstantDeclarationStatement"
    // InternalAPIMappingLanguage.g:740:1: entryRuleLocalVariableOrConstantDeclarationStatement : ruleLocalVariableOrConstantDeclarationStatement EOF ;
    public final void entryRuleLocalVariableOrConstantDeclarationStatement() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:741:1: ( ruleLocalVariableOrConstantDeclarationStatement EOF )
            // InternalAPIMappingLanguage.g:742:1: ruleLocalVariableOrConstantDeclarationStatement EOF
            {
             before(grammarAccess.getLocalVariableOrConstantDeclarationStatementRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleLocalVariableOrConstantDeclarationStatement();

            state._fsp--;

             after(grammarAccess.getLocalVariableOrConstantDeclarationStatementRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLocalVariableOrConstantDeclarationStatement"


    // $ANTLR start "ruleLocalVariableOrConstantDeclarationStatement"
    // InternalAPIMappingLanguage.g:749:1: ruleLocalVariableOrConstantDeclarationStatement : ( ( rule__LocalVariableOrConstantDeclarationStatement__VariableAssignment ) ) ;
    public final void ruleLocalVariableOrConstantDeclarationStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:753:2: ( ( ( rule__LocalVariableOrConstantDeclarationStatement__VariableAssignment ) ) )
            // InternalAPIMappingLanguage.g:754:1: ( ( rule__LocalVariableOrConstantDeclarationStatement__VariableAssignment ) )
            {
            // InternalAPIMappingLanguage.g:754:1: ( ( rule__LocalVariableOrConstantDeclarationStatement__VariableAssignment ) )
            // InternalAPIMappingLanguage.g:755:1: ( rule__LocalVariableOrConstantDeclarationStatement__VariableAssignment )
            {
             before(grammarAccess.getLocalVariableOrConstantDeclarationStatementAccess().getVariableAssignment()); 
            // InternalAPIMappingLanguage.g:756:1: ( rule__LocalVariableOrConstantDeclarationStatement__VariableAssignment )
            // InternalAPIMappingLanguage.g:756:2: rule__LocalVariableOrConstantDeclarationStatement__VariableAssignment
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LocalVariableOrConstantDeclarationStatement__VariableAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLocalVariableOrConstantDeclarationStatementAccess().getVariableAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLocalVariableOrConstantDeclarationStatement"


    // $ANTLR start "entryRuleLocalVariableDeclaration"
    // InternalAPIMappingLanguage.g:768:1: entryRuleLocalVariableDeclaration : ruleLocalVariableDeclaration EOF ;
    public final void entryRuleLocalVariableDeclaration() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:769:1: ( ruleLocalVariableDeclaration EOF )
            // InternalAPIMappingLanguage.g:770:1: ruleLocalVariableDeclaration EOF
            {
             before(grammarAccess.getLocalVariableDeclarationRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleLocalVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getLocalVariableDeclarationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLocalVariableDeclaration"


    // $ANTLR start "ruleLocalVariableDeclaration"
    // InternalAPIMappingLanguage.g:777:1: ruleLocalVariableDeclaration : ( ( rule__LocalVariableDeclaration__Group__0 ) ) ;
    public final void ruleLocalVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:781:2: ( ( ( rule__LocalVariableDeclaration__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:782:1: ( ( rule__LocalVariableDeclaration__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:782:1: ( ( rule__LocalVariableDeclaration__Group__0 ) )
            // InternalAPIMappingLanguage.g:783:1: ( rule__LocalVariableDeclaration__Group__0 )
            {
             before(grammarAccess.getLocalVariableDeclarationAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:784:1: ( rule__LocalVariableDeclaration__Group__0 )
            // InternalAPIMappingLanguage.g:784:2: rule__LocalVariableDeclaration__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LocalVariableDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLocalVariableDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLocalVariableDeclaration"


    // $ANTLR start "entryRuleLocalConstantDeclaration"
    // InternalAPIMappingLanguage.g:796:1: entryRuleLocalConstantDeclaration : ruleLocalConstantDeclaration EOF ;
    public final void entryRuleLocalConstantDeclaration() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:797:1: ( ruleLocalConstantDeclaration EOF )
            // InternalAPIMappingLanguage.g:798:1: ruleLocalConstantDeclaration EOF
            {
             before(grammarAccess.getLocalConstantDeclarationRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleLocalConstantDeclaration();

            state._fsp--;

             after(grammarAccess.getLocalConstantDeclarationRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLocalConstantDeclaration"


    // $ANTLR start "ruleLocalConstantDeclaration"
    // InternalAPIMappingLanguage.g:805:1: ruleLocalConstantDeclaration : ( ( rule__LocalConstantDeclaration__Group__0 ) ) ;
    public final void ruleLocalConstantDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:809:2: ( ( ( rule__LocalConstantDeclaration__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:810:1: ( ( rule__LocalConstantDeclaration__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:810:1: ( ( rule__LocalConstantDeclaration__Group__0 ) )
            // InternalAPIMappingLanguage.g:811:1: ( rule__LocalConstantDeclaration__Group__0 )
            {
             before(grammarAccess.getLocalConstantDeclarationAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:812:1: ( rule__LocalConstantDeclaration__Group__0 )
            // InternalAPIMappingLanguage.g:812:2: rule__LocalConstantDeclaration__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LocalConstantDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLocalConstantDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLocalConstantDeclaration"


    // $ANTLR start "entryRuleNondeterministicChoiceExpression"
    // InternalAPIMappingLanguage.g:824:1: entryRuleNondeterministicChoiceExpression : ruleNondeterministicChoiceExpression EOF ;
    public final void entryRuleNondeterministicChoiceExpression() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:825:1: ( ruleNondeterministicChoiceExpression EOF )
            // InternalAPIMappingLanguage.g:826:1: ruleNondeterministicChoiceExpression EOF
            {
             before(grammarAccess.getNondeterministicChoiceExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleNondeterministicChoiceExpression();

            state._fsp--;

             after(grammarAccess.getNondeterministicChoiceExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNondeterministicChoiceExpression"


    // $ANTLR start "ruleNondeterministicChoiceExpression"
    // InternalAPIMappingLanguage.g:833:1: ruleNondeterministicChoiceExpression : ( ( rule__NondeterministicChoiceExpression__Group__0 ) ) ;
    public final void ruleNondeterministicChoiceExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:837:2: ( ( ( rule__NondeterministicChoiceExpression__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:838:1: ( ( rule__NondeterministicChoiceExpression__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:838:1: ( ( rule__NondeterministicChoiceExpression__Group__0 ) )
            // InternalAPIMappingLanguage.g:839:1: ( rule__NondeterministicChoiceExpression__Group__0 )
            {
             before(grammarAccess.getNondeterministicChoiceExpressionAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:840:1: ( rule__NondeterministicChoiceExpression__Group__0 )
            // InternalAPIMappingLanguage.g:840:2: rule__NondeterministicChoiceExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NondeterministicChoiceExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNondeterministicChoiceExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNondeterministicChoiceExpression"


    // $ANTLR start "entryRuleRange"
    // InternalAPIMappingLanguage.g:852:1: entryRuleRange : ruleRange EOF ;
    public final void entryRuleRange() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:853:1: ( ruleRange EOF )
            // InternalAPIMappingLanguage.g:854:1: ruleRange EOF
            {
             before(grammarAccess.getRangeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleRange();

            state._fsp--;

             after(grammarAccess.getRangeRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRange"


    // $ANTLR start "ruleRange"
    // InternalAPIMappingLanguage.g:861:1: ruleRange : ( ( rule__Range__Group__0 ) ) ;
    public final void ruleRange() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:865:2: ( ( ( rule__Range__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:866:1: ( ( rule__Range__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:866:1: ( ( rule__Range__Group__0 ) )
            // InternalAPIMappingLanguage.g:867:1: ( rule__Range__Group__0 )
            {
             before(grammarAccess.getRangeAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:868:1: ( rule__Range__Group__0 )
            // InternalAPIMappingLanguage.g:868:2: rule__Range__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Range__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRangeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRange"


    // $ANTLR start "entryRuleLONG"
    // InternalAPIMappingLanguage.g:880:1: entryRuleLONG : ruleLONG EOF ;
    public final void entryRuleLONG() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:881:1: ( ruleLONG EOF )
            // InternalAPIMappingLanguage.g:882:1: ruleLONG EOF
            {
             before(grammarAccess.getLONGRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleLONG();

            state._fsp--;

             after(grammarAccess.getLONGRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLONG"


    // $ANTLR start "ruleLONG"
    // InternalAPIMappingLanguage.g:889:1: ruleLONG : ( RULE_INT ) ;
    public final void ruleLONG() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:893:2: ( ( RULE_INT ) )
            // InternalAPIMappingLanguage.g:894:1: ( RULE_INT )
            {
            // InternalAPIMappingLanguage.g:894:1: ( RULE_INT )
            // InternalAPIMappingLanguage.g:895:1: RULE_INT
            {
             before(grammarAccess.getLONGAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getLONGAccess().getINTTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLONG"


    // $ANTLR start "entryRuleLogicalExpression"
    // InternalAPIMappingLanguage.g:908:1: entryRuleLogicalExpression : ruleLogicalExpression EOF ;
    public final void entryRuleLogicalExpression() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:909:1: ( ruleLogicalExpression EOF )
            // InternalAPIMappingLanguage.g:910:1: ruleLogicalExpression EOF
            {
             before(grammarAccess.getLogicalExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleLogicalExpression();

            state._fsp--;

             after(grammarAccess.getLogicalExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLogicalExpression"


    // $ANTLR start "ruleLogicalExpression"
    // InternalAPIMappingLanguage.g:917:1: ruleLogicalExpression : ( ruleLogicalOrExpression ) ;
    public final void ruleLogicalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:921:2: ( ( ruleLogicalOrExpression ) )
            // InternalAPIMappingLanguage.g:922:1: ( ruleLogicalOrExpression )
            {
            // InternalAPIMappingLanguage.g:922:1: ( ruleLogicalOrExpression )
            // InternalAPIMappingLanguage.g:923:1: ruleLogicalOrExpression
            {
             before(grammarAccess.getLogicalExpressionAccess().getLogicalOrExpressionParserRuleCall()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleLogicalOrExpression();

            state._fsp--;

             after(grammarAccess.getLogicalExpressionAccess().getLogicalOrExpressionParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogicalExpression"


    // $ANTLR start "entryRuleLogicalOrExpression"
    // InternalAPIMappingLanguage.g:936:1: entryRuleLogicalOrExpression : ruleLogicalOrExpression EOF ;
    public final void entryRuleLogicalOrExpression() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:937:1: ( ruleLogicalOrExpression EOF )
            // InternalAPIMappingLanguage.g:938:1: ruleLogicalOrExpression EOF
            {
             before(grammarAccess.getLogicalOrExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleLogicalOrExpression();

            state._fsp--;

             after(grammarAccess.getLogicalOrExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLogicalOrExpression"


    // $ANTLR start "ruleLogicalOrExpression"
    // InternalAPIMappingLanguage.g:945:1: ruleLogicalOrExpression : ( ( rule__LogicalOrExpression__Group__0 ) ) ;
    public final void ruleLogicalOrExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:949:2: ( ( ( rule__LogicalOrExpression__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:950:1: ( ( rule__LogicalOrExpression__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:950:1: ( ( rule__LogicalOrExpression__Group__0 ) )
            // InternalAPIMappingLanguage.g:951:1: ( rule__LogicalOrExpression__Group__0 )
            {
             before(grammarAccess.getLogicalOrExpressionAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:952:1: ( rule__LogicalOrExpression__Group__0 )
            // InternalAPIMappingLanguage.g:952:2: rule__LogicalOrExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalOrExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLogicalOrExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogicalOrExpression"


    // $ANTLR start "entryRuleLogicalAndExpression"
    // InternalAPIMappingLanguage.g:964:1: entryRuleLogicalAndExpression : ruleLogicalAndExpression EOF ;
    public final void entryRuleLogicalAndExpression() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:965:1: ( ruleLogicalAndExpression EOF )
            // InternalAPIMappingLanguage.g:966:1: ruleLogicalAndExpression EOF
            {
             before(grammarAccess.getLogicalAndExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleLogicalAndExpression();

            state._fsp--;

             after(grammarAccess.getLogicalAndExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLogicalAndExpression"


    // $ANTLR start "ruleLogicalAndExpression"
    // InternalAPIMappingLanguage.g:973:1: ruleLogicalAndExpression : ( ( rule__LogicalAndExpression__Group__0 ) ) ;
    public final void ruleLogicalAndExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:977:2: ( ( ( rule__LogicalAndExpression__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:978:1: ( ( rule__LogicalAndExpression__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:978:1: ( ( rule__LogicalAndExpression__Group__0 ) )
            // InternalAPIMappingLanguage.g:979:1: ( rule__LogicalAndExpression__Group__0 )
            {
             before(grammarAccess.getLogicalAndExpressionAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:980:1: ( rule__LogicalAndExpression__Group__0 )
            // InternalAPIMappingLanguage.g:980:2: rule__LogicalAndExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalAndExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLogicalAndExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogicalAndExpression"


    // $ANTLR start "entryRuleComparisonExpression"
    // InternalAPIMappingLanguage.g:992:1: entryRuleComparisonExpression : ruleComparisonExpression EOF ;
    public final void entryRuleComparisonExpression() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:993:1: ( ruleComparisonExpression EOF )
            // InternalAPIMappingLanguage.g:994:1: ruleComparisonExpression EOF
            {
             before(grammarAccess.getComparisonExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleComparisonExpression();

            state._fsp--;

             after(grammarAccess.getComparisonExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComparisonExpression"


    // $ANTLR start "ruleComparisonExpression"
    // InternalAPIMappingLanguage.g:1001:1: ruleComparisonExpression : ( ( rule__ComparisonExpression__Group__0 ) ) ;
    public final void ruleComparisonExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1005:2: ( ( ( rule__ComparisonExpression__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:1006:1: ( ( rule__ComparisonExpression__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:1006:1: ( ( rule__ComparisonExpression__Group__0 ) )
            // InternalAPIMappingLanguage.g:1007:1: ( rule__ComparisonExpression__Group__0 )
            {
             before(grammarAccess.getComparisonExpressionAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:1008:1: ( rule__ComparisonExpression__Group__0 )
            // InternalAPIMappingLanguage.g:1008:2: rule__ComparisonExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ComparisonExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparisonExpression"


    // $ANTLR start "entryRuleComparisonHigherOpExpression"
    // InternalAPIMappingLanguage.g:1020:1: entryRuleComparisonHigherOpExpression : ruleComparisonHigherOpExpression EOF ;
    public final void entryRuleComparisonHigherOpExpression() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:1021:1: ( ruleComparisonHigherOpExpression EOF )
            // InternalAPIMappingLanguage.g:1022:1: ruleComparisonHigherOpExpression EOF
            {
             before(grammarAccess.getComparisonHigherOpExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleComparisonHigherOpExpression();

            state._fsp--;

             after(grammarAccess.getComparisonHigherOpExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComparisonHigherOpExpression"


    // $ANTLR start "ruleComparisonHigherOpExpression"
    // InternalAPIMappingLanguage.g:1029:1: ruleComparisonHigherOpExpression : ( ( rule__ComparisonHigherOpExpression__Group__0 ) ) ;
    public final void ruleComparisonHigherOpExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1033:2: ( ( ( rule__ComparisonHigherOpExpression__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:1034:1: ( ( rule__ComparisonHigherOpExpression__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:1034:1: ( ( rule__ComparisonHigherOpExpression__Group__0 ) )
            // InternalAPIMappingLanguage.g:1035:1: ( rule__ComparisonHigherOpExpression__Group__0 )
            {
             before(grammarAccess.getComparisonHigherOpExpressionAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:1036:1: ( rule__ComparisonHigherOpExpression__Group__0 )
            // InternalAPIMappingLanguage.g:1036:2: rule__ComparisonHigherOpExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ComparisonHigherOpExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonHigherOpExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparisonHigherOpExpression"


    // $ANTLR start "entryRuleArithmeticExpression"
    // InternalAPIMappingLanguage.g:1048:1: entryRuleArithmeticExpression : ruleArithmeticExpression EOF ;
    public final void entryRuleArithmeticExpression() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:1049:1: ( ruleArithmeticExpression EOF )
            // InternalAPIMappingLanguage.g:1050:1: ruleArithmeticExpression EOF
            {
             before(grammarAccess.getArithmeticExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleArithmeticExpression();

            state._fsp--;

             after(grammarAccess.getArithmeticExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArithmeticExpression"


    // $ANTLR start "ruleArithmeticExpression"
    // InternalAPIMappingLanguage.g:1057:1: ruleArithmeticExpression : ( ruleAdditionExpression ) ;
    public final void ruleArithmeticExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1061:2: ( ( ruleAdditionExpression ) )
            // InternalAPIMappingLanguage.g:1062:1: ( ruleAdditionExpression )
            {
            // InternalAPIMappingLanguage.g:1062:1: ( ruleAdditionExpression )
            // InternalAPIMappingLanguage.g:1063:1: ruleAdditionExpression
            {
             before(grammarAccess.getArithmeticExpressionAccess().getAdditionExpressionParserRuleCall()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAdditionExpression();

            state._fsp--;

             after(grammarAccess.getArithmeticExpressionAccess().getAdditionExpressionParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArithmeticExpression"


    // $ANTLR start "entryRuleAdditionExpression"
    // InternalAPIMappingLanguage.g:1076:1: entryRuleAdditionExpression : ruleAdditionExpression EOF ;
    public final void entryRuleAdditionExpression() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:1077:1: ( ruleAdditionExpression EOF )
            // InternalAPIMappingLanguage.g:1078:1: ruleAdditionExpression EOF
            {
             before(grammarAccess.getAdditionExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAdditionExpression();

            state._fsp--;

             after(grammarAccess.getAdditionExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAdditionExpression"


    // $ANTLR start "ruleAdditionExpression"
    // InternalAPIMappingLanguage.g:1085:1: ruleAdditionExpression : ( ( rule__AdditionExpression__Group__0 ) ) ;
    public final void ruleAdditionExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1089:2: ( ( ( rule__AdditionExpression__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:1090:1: ( ( rule__AdditionExpression__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:1090:1: ( ( rule__AdditionExpression__Group__0 ) )
            // InternalAPIMappingLanguage.g:1091:1: ( rule__AdditionExpression__Group__0 )
            {
             before(grammarAccess.getAdditionExpressionAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:1092:1: ( rule__AdditionExpression__Group__0 )
            // InternalAPIMappingLanguage.g:1092:2: rule__AdditionExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AdditionExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdditionExpression"


    // $ANTLR start "entryRuleMultiplicationExpression"
    // InternalAPIMappingLanguage.g:1104:1: entryRuleMultiplicationExpression : ruleMultiplicationExpression EOF ;
    public final void entryRuleMultiplicationExpression() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:1105:1: ( ruleMultiplicationExpression EOF )
            // InternalAPIMappingLanguage.g:1106:1: ruleMultiplicationExpression EOF
            {
             before(grammarAccess.getMultiplicationExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMultiplicationExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicationExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiplicationExpression"


    // $ANTLR start "ruleMultiplicationExpression"
    // InternalAPIMappingLanguage.g:1113:1: ruleMultiplicationExpression : ( ( rule__MultiplicationExpression__Alternatives ) ) ;
    public final void ruleMultiplicationExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1117:2: ( ( ( rule__MultiplicationExpression__Alternatives ) ) )
            // InternalAPIMappingLanguage.g:1118:1: ( ( rule__MultiplicationExpression__Alternatives ) )
            {
            // InternalAPIMappingLanguage.g:1118:1: ( ( rule__MultiplicationExpression__Alternatives ) )
            // InternalAPIMappingLanguage.g:1119:1: ( rule__MultiplicationExpression__Alternatives )
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getAlternatives()); 
            // InternalAPIMappingLanguage.g:1120:1: ( rule__MultiplicationExpression__Alternatives )
            // InternalAPIMappingLanguage.g:1120:2: rule__MultiplicationExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MultiplicationExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplicationExpression"


    // $ANTLR start "entryRuleUnaryPreExpression"
    // InternalAPIMappingLanguage.g:1132:1: entryRuleUnaryPreExpression : ruleUnaryPreExpression EOF ;
    public final void entryRuleUnaryPreExpression() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:1133:1: ( ruleUnaryPreExpression EOF )
            // InternalAPIMappingLanguage.g:1134:1: ruleUnaryPreExpression EOF
            {
             before(grammarAccess.getUnaryPreExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleUnaryPreExpression();

            state._fsp--;

             after(grammarAccess.getUnaryPreExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnaryPreExpression"


    // $ANTLR start "ruleUnaryPreExpression"
    // InternalAPIMappingLanguage.g:1141:1: ruleUnaryPreExpression : ( ( rule__UnaryPreExpression__Group__0 ) ) ;
    public final void ruleUnaryPreExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1145:2: ( ( ( rule__UnaryPreExpression__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:1146:1: ( ( rule__UnaryPreExpression__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:1146:1: ( ( rule__UnaryPreExpression__Group__0 ) )
            // InternalAPIMappingLanguage.g:1147:1: ( rule__UnaryPreExpression__Group__0 )
            {
             before(grammarAccess.getUnaryPreExpressionAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:1148:1: ( rule__UnaryPreExpression__Group__0 )
            // InternalAPIMappingLanguage.g:1148:2: rule__UnaryPreExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnaryPreExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnaryPreExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnaryPreExpression"


    // $ANTLR start "entryRuleTypeCastExpression"
    // InternalAPIMappingLanguage.g:1160:1: entryRuleTypeCastExpression : ruleTypeCastExpression EOF ;
    public final void entryRuleTypeCastExpression() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:1161:1: ( ruleTypeCastExpression EOF )
            // InternalAPIMappingLanguage.g:1162:1: ruleTypeCastExpression EOF
            {
             before(grammarAccess.getTypeCastExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTypeCastExpression();

            state._fsp--;

             after(grammarAccess.getTypeCastExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypeCastExpression"


    // $ANTLR start "ruleTypeCastExpression"
    // InternalAPIMappingLanguage.g:1169:1: ruleTypeCastExpression : ( ( rule__TypeCastExpression__Alternatives ) ) ;
    public final void ruleTypeCastExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1173:2: ( ( ( rule__TypeCastExpression__Alternatives ) ) )
            // InternalAPIMappingLanguage.g:1174:1: ( ( rule__TypeCastExpression__Alternatives ) )
            {
            // InternalAPIMappingLanguage.g:1174:1: ( ( rule__TypeCastExpression__Alternatives ) )
            // InternalAPIMappingLanguage.g:1175:1: ( rule__TypeCastExpression__Alternatives )
            {
             before(grammarAccess.getTypeCastExpressionAccess().getAlternatives()); 
            // InternalAPIMappingLanguage.g:1176:1: ( rule__TypeCastExpression__Alternatives )
            // InternalAPIMappingLanguage.g:1176:2: rule__TypeCastExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypeCastExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeCastExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeCastExpression"


    // $ANTLR start "entryRuleOperand"
    // InternalAPIMappingLanguage.g:1188:1: entryRuleOperand : ruleOperand EOF ;
    public final void entryRuleOperand() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:1189:1: ( ruleOperand EOF )
            // InternalAPIMappingLanguage.g:1190:1: ruleOperand EOF
            {
             before(grammarAccess.getOperandRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleOperand();

            state._fsp--;

             after(grammarAccess.getOperandRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperand"


    // $ANTLR start "ruleOperand"
    // InternalAPIMappingLanguage.g:1197:1: ruleOperand : ( ( rule__Operand__Alternatives ) ) ;
    public final void ruleOperand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1201:2: ( ( ( rule__Operand__Alternatives ) ) )
            // InternalAPIMappingLanguage.g:1202:1: ( ( rule__Operand__Alternatives ) )
            {
            // InternalAPIMappingLanguage.g:1202:1: ( ( rule__Operand__Alternatives ) )
            // InternalAPIMappingLanguage.g:1203:1: ( rule__Operand__Alternatives )
            {
             before(grammarAccess.getOperandAccess().getAlternatives()); 
            // InternalAPIMappingLanguage.g:1204:1: ( rule__Operand__Alternatives )
            // InternalAPIMappingLanguage.g:1204:2: rule__Operand__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Operand__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperandAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperand"


    // $ANTLR start "entryRuleLiteralExpression"
    // InternalAPIMappingLanguage.g:1216:1: entryRuleLiteralExpression : ruleLiteralExpression EOF ;
    public final void entryRuleLiteralExpression() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:1217:1: ( ruleLiteralExpression EOF )
            // InternalAPIMappingLanguage.g:1218:1: ruleLiteralExpression EOF
            {
             before(grammarAccess.getLiteralExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleLiteralExpression();

            state._fsp--;

             after(grammarAccess.getLiteralExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiteralExpression"


    // $ANTLR start "ruleLiteralExpression"
    // InternalAPIMappingLanguage.g:1225:1: ruleLiteralExpression : ( ( rule__LiteralExpression__Group__0 ) ) ;
    public final void ruleLiteralExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1229:2: ( ( ( rule__LiteralExpression__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:1230:1: ( ( rule__LiteralExpression__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:1230:1: ( ( rule__LiteralExpression__Group__0 ) )
            // InternalAPIMappingLanguage.g:1231:1: ( rule__LiteralExpression__Group__0 )
            {
             before(grammarAccess.getLiteralExpressionAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:1232:1: ( rule__LiteralExpression__Group__0 )
            // InternalAPIMappingLanguage.g:1232:2: rule__LiteralExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LiteralExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLiteralExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteralExpression"


    // $ANTLR start "entryRuleLiteral"
    // InternalAPIMappingLanguage.g:1244:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:1245:1: ( ruleLiteral EOF )
            // InternalAPIMappingLanguage.g:1246:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalAPIMappingLanguage.g:1253:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1257:2: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalAPIMappingLanguage.g:1258:1: ( ( rule__Literal__Alternatives ) )
            {
            // InternalAPIMappingLanguage.g:1258:1: ( ( rule__Literal__Alternatives ) )
            // InternalAPIMappingLanguage.g:1259:1: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // InternalAPIMappingLanguage.g:1260:1: ( rule__Literal__Alternatives )
            // InternalAPIMappingLanguage.g:1260:2: rule__Literal__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Literal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleTimeValueExpression"
    // InternalAPIMappingLanguage.g:1272:1: entryRuleTimeValueExpression : ruleTimeValueExpression EOF ;
    public final void entryRuleTimeValueExpression() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:1273:1: ( ruleTimeValueExpression EOF )
            // InternalAPIMappingLanguage.g:1274:1: ruleTimeValueExpression EOF
            {
             before(grammarAccess.getTimeValueExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTimeValueExpression();

            state._fsp--;

             after(grammarAccess.getTimeValueExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTimeValueExpression"


    // $ANTLR start "ruleTimeValueExpression"
    // InternalAPIMappingLanguage.g:1281:1: ruleTimeValueExpression : ( ( rule__TimeValueExpression__TimeValueAssignment ) ) ;
    public final void ruleTimeValueExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1285:2: ( ( ( rule__TimeValueExpression__TimeValueAssignment ) ) )
            // InternalAPIMappingLanguage.g:1286:1: ( ( rule__TimeValueExpression__TimeValueAssignment ) )
            {
            // InternalAPIMappingLanguage.g:1286:1: ( ( rule__TimeValueExpression__TimeValueAssignment ) )
            // InternalAPIMappingLanguage.g:1287:1: ( rule__TimeValueExpression__TimeValueAssignment )
            {
             before(grammarAccess.getTimeValueExpressionAccess().getTimeValueAssignment()); 
            // InternalAPIMappingLanguage.g:1288:1: ( rule__TimeValueExpression__TimeValueAssignment )
            // InternalAPIMappingLanguage.g:1288:2: rule__TimeValueExpression__TimeValueAssignment
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TimeValueExpression__TimeValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTimeValueExpressionAccess().getTimeValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimeValueExpression"


    // $ANTLR start "entryRuleExtendedTypedNamedElementExpression"
    // InternalAPIMappingLanguage.g:1300:1: entryRuleExtendedTypedNamedElementExpression : ruleExtendedTypedNamedElementExpression EOF ;
    public final void entryRuleExtendedTypedNamedElementExpression() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:1301:1: ( ruleExtendedTypedNamedElementExpression EOF )
            // InternalAPIMappingLanguage.g:1302:1: ruleExtendedTypedNamedElementExpression EOF
            {
             before(grammarAccess.getExtendedTypedNamedElementExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleExtendedTypedNamedElementExpression();

            state._fsp--;

             after(grammarAccess.getExtendedTypedNamedElementExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExtendedTypedNamedElementExpression"


    // $ANTLR start "ruleExtendedTypedNamedElementExpression"
    // InternalAPIMappingLanguage.g:1309:1: ruleExtendedTypedNamedElementExpression : ( ( rule__ExtendedTypedNamedElementExpression__Group__0 ) ) ;
    public final void ruleExtendedTypedNamedElementExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1313:2: ( ( ( rule__ExtendedTypedNamedElementExpression__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:1314:1: ( ( rule__ExtendedTypedNamedElementExpression__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:1314:1: ( ( rule__ExtendedTypedNamedElementExpression__Group__0 ) )
            // InternalAPIMappingLanguage.g:1315:1: ( rule__ExtendedTypedNamedElementExpression__Group__0 )
            {
             before(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:1316:1: ( rule__ExtendedTypedNamedElementExpression__Group__0 )
            // InternalAPIMappingLanguage.g:1316:2: rule__ExtendedTypedNamedElementExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExtendedTypedNamedElementExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExtendedTypedNamedElementExpression"


    // $ANTLR start "entryRuleTypedNamedElementExpression"
    // InternalAPIMappingLanguage.g:1328:1: entryRuleTypedNamedElementExpression : ruleTypedNamedElementExpression EOF ;
    public final void entryRuleTypedNamedElementExpression() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:1329:1: ( ruleTypedNamedElementExpression EOF )
            // InternalAPIMappingLanguage.g:1330:1: ruleTypedNamedElementExpression EOF
            {
             before(grammarAccess.getTypedNamedElementExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTypedNamedElementExpression();

            state._fsp--;

             after(grammarAccess.getTypedNamedElementExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTypedNamedElementExpression"


    // $ANTLR start "ruleTypedNamedElementExpression"
    // InternalAPIMappingLanguage.g:1337:1: ruleTypedNamedElementExpression : ( ( rule__TypedNamedElementExpression__Group__0 ) ) ;
    public final void ruleTypedNamedElementExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1341:2: ( ( ( rule__TypedNamedElementExpression__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:1342:1: ( ( rule__TypedNamedElementExpression__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:1342:1: ( ( rule__TypedNamedElementExpression__Group__0 ) )
            // InternalAPIMappingLanguage.g:1343:1: ( rule__TypedNamedElementExpression__Group__0 )
            {
             before(grammarAccess.getTypedNamedElementExpressionAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:1344:1: ( rule__TypedNamedElementExpression__Group__0 )
            // InternalAPIMappingLanguage.g:1344:2: rule__TypedNamedElementExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypedNamedElementExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypedNamedElementExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypedNamedElementExpression"


    // $ANTLR start "entryRuleArrayIndexExpression"
    // InternalAPIMappingLanguage.g:1356:1: entryRuleArrayIndexExpression : ruleArrayIndexExpression EOF ;
    public final void entryRuleArrayIndexExpression() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:1357:1: ( ruleArrayIndexExpression EOF )
            // InternalAPIMappingLanguage.g:1358:1: ruleArrayIndexExpression EOF
            {
             before(grammarAccess.getArrayIndexExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleArrayIndexExpression();

            state._fsp--;

             after(grammarAccess.getArrayIndexExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArrayIndexExpression"


    // $ANTLR start "ruleArrayIndexExpression"
    // InternalAPIMappingLanguage.g:1365:1: ruleArrayIndexExpression : ( ( rule__ArrayIndexExpression__Group__0 ) ) ;
    public final void ruleArrayIndexExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1369:2: ( ( ( rule__ArrayIndexExpression__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:1370:1: ( ( rule__ArrayIndexExpression__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:1370:1: ( ( rule__ArrayIndexExpression__Group__0 ) )
            // InternalAPIMappingLanguage.g:1371:1: ( rule__ArrayIndexExpression__Group__0 )
            {
             before(grammarAccess.getArrayIndexExpressionAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:1372:1: ( rule__ArrayIndexExpression__Group__0 )
            // InternalAPIMappingLanguage.g:1372:2: rule__ArrayIndexExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ArrayIndexExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArrayIndexExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArrayIndexExpression"


    // $ANTLR start "entryRuleAttributeAccessorExpression"
    // InternalAPIMappingLanguage.g:1384:1: entryRuleAttributeAccessorExpression : ruleAttributeAccessorExpression EOF ;
    public final void entryRuleAttributeAccessorExpression() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:1385:1: ( ruleAttributeAccessorExpression EOF )
            // InternalAPIMappingLanguage.g:1386:1: ruleAttributeAccessorExpression EOF
            {
             before(grammarAccess.getAttributeAccessorExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAttributeAccessorExpression();

            state._fsp--;

             after(grammarAccess.getAttributeAccessorExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributeAccessorExpression"


    // $ANTLR start "ruleAttributeAccessorExpression"
    // InternalAPIMappingLanguage.g:1393:1: ruleAttributeAccessorExpression : ( ( rule__AttributeAccessorExpression__Group__0 ) ) ;
    public final void ruleAttributeAccessorExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1397:2: ( ( ( rule__AttributeAccessorExpression__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:1398:1: ( ( rule__AttributeAccessorExpression__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:1398:1: ( ( rule__AttributeAccessorExpression__Group__0 ) )
            // InternalAPIMappingLanguage.g:1399:1: ( rule__AttributeAccessorExpression__Group__0 )
            {
             before(grammarAccess.getAttributeAccessorExpressionAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:1400:1: ( rule__AttributeAccessorExpression__Group__0 )
            // InternalAPIMappingLanguage.g:1400:2: rule__AttributeAccessorExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeAccessorExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccessorExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeAccessorExpression"


    // $ANTLR start "entryRuleNoAttributeSelectorExpression"
    // InternalAPIMappingLanguage.g:1412:1: entryRuleNoAttributeSelectorExpression : ruleNoAttributeSelectorExpression EOF ;
    public final void entryRuleNoAttributeSelectorExpression() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:1413:1: ( ruleNoAttributeSelectorExpression EOF )
            // InternalAPIMappingLanguage.g:1414:1: ruleNoAttributeSelectorExpression EOF
            {
             before(grammarAccess.getNoAttributeSelectorExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleNoAttributeSelectorExpression();

            state._fsp--;

             after(grammarAccess.getNoAttributeSelectorExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNoAttributeSelectorExpression"


    // $ANTLR start "ruleNoAttributeSelectorExpression"
    // InternalAPIMappingLanguage.g:1421:1: ruleNoAttributeSelectorExpression : ( ( rule__NoAttributeSelectorExpression__PositionAssignment ) ) ;
    public final void ruleNoAttributeSelectorExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1425:2: ( ( ( rule__NoAttributeSelectorExpression__PositionAssignment ) ) )
            // InternalAPIMappingLanguage.g:1426:1: ( ( rule__NoAttributeSelectorExpression__PositionAssignment ) )
            {
            // InternalAPIMappingLanguage.g:1426:1: ( ( rule__NoAttributeSelectorExpression__PositionAssignment ) )
            // InternalAPIMappingLanguage.g:1427:1: ( rule__NoAttributeSelectorExpression__PositionAssignment )
            {
             before(grammarAccess.getNoAttributeSelectorExpressionAccess().getPositionAssignment()); 
            // InternalAPIMappingLanguage.g:1428:1: ( rule__NoAttributeSelectorExpression__PositionAssignment )
            // InternalAPIMappingLanguage.g:1428:2: rule__NoAttributeSelectorExpression__PositionAssignment
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NoAttributeSelectorExpression__PositionAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNoAttributeSelectorExpressionAccess().getPositionAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNoAttributeSelectorExpression"


    // $ANTLR start "entryRulePositionSelectorExpression"
    // InternalAPIMappingLanguage.g:1440:1: entryRulePositionSelectorExpression : rulePositionSelectorExpression EOF ;
    public final void entryRulePositionSelectorExpression() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:1441:1: ( rulePositionSelectorExpression EOF )
            // InternalAPIMappingLanguage.g:1442:1: rulePositionSelectorExpression EOF
            {
             before(grammarAccess.getPositionSelectorExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            rulePositionSelectorExpression();

            state._fsp--;

             after(grammarAccess.getPositionSelectorExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePositionSelectorExpression"


    // $ANTLR start "rulePositionSelectorExpression"
    // InternalAPIMappingLanguage.g:1449:1: rulePositionSelectorExpression : ( ( rule__PositionSelectorExpression__Group__0 ) ) ;
    public final void rulePositionSelectorExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1453:2: ( ( ( rule__PositionSelectorExpression__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:1454:1: ( ( rule__PositionSelectorExpression__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:1454:1: ( ( rule__PositionSelectorExpression__Group__0 ) )
            // InternalAPIMappingLanguage.g:1455:1: ( rule__PositionSelectorExpression__Group__0 )
            {
             before(grammarAccess.getPositionSelectorExpressionAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:1456:1: ( rule__PositionSelectorExpression__Group__0 )
            // InternalAPIMappingLanguage.g:1456:2: rule__PositionSelectorExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PositionSelectorExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPositionSelectorExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePositionSelectorExpression"


    // $ANTLR start "entryRuleOperationCall"
    // InternalAPIMappingLanguage.g:1468:1: entryRuleOperationCall : ruleOperationCall EOF ;
    public final void entryRuleOperationCall() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:1469:1: ( ruleOperationCall EOF )
            // InternalAPIMappingLanguage.g:1470:1: ruleOperationCall EOF
            {
             before(grammarAccess.getOperationCallRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleOperationCall();

            state._fsp--;

             after(grammarAccess.getOperationCallRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperationCall"


    // $ANTLR start "ruleOperationCall"
    // InternalAPIMappingLanguage.g:1477:1: ruleOperationCall : ( ( rule__OperationCall__Group__0 ) ) ;
    public final void ruleOperationCall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1481:2: ( ( ( rule__OperationCall__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:1482:1: ( ( rule__OperationCall__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:1482:1: ( ( rule__OperationCall__Group__0 ) )
            // InternalAPIMappingLanguage.g:1483:1: ( rule__OperationCall__Group__0 )
            {
             before(grammarAccess.getOperationCallAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:1484:1: ( rule__OperationCall__Group__0 )
            // InternalAPIMappingLanguage.g:1484:2: rule__OperationCall__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OperationCall__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperationCallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperationCall"


    // $ANTLR start "entryRuleTriggerMessageExpression"
    // InternalAPIMappingLanguage.g:1496:1: entryRuleTriggerMessageExpression : ruleTriggerMessageExpression EOF ;
    public final void entryRuleTriggerMessageExpression() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:1497:1: ( ruleTriggerMessageExpression EOF )
            // InternalAPIMappingLanguage.g:1498:1: ruleTriggerMessageExpression EOF
            {
             before(grammarAccess.getTriggerMessageExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleTriggerMessageExpression();

            state._fsp--;

             after(grammarAccess.getTriggerMessageExpressionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTriggerMessageExpression"


    // $ANTLR start "ruleTriggerMessageExpression"
    // InternalAPIMappingLanguage.g:1505:1: ruleTriggerMessageExpression : ( ( rule__TriggerMessageExpression__Group__0 ) ) ;
    public final void ruleTriggerMessageExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1509:2: ( ( ( rule__TriggerMessageExpression__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:1510:1: ( ( rule__TriggerMessageExpression__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:1510:1: ( ( rule__TriggerMessageExpression__Group__0 ) )
            // InternalAPIMappingLanguage.g:1511:1: ( rule__TriggerMessageExpression__Group__0 )
            {
             before(grammarAccess.getTriggerMessageExpressionAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:1512:1: ( rule__TriggerMessageExpression__Group__0 )
            // InternalAPIMappingLanguage.g:1512:2: rule__TriggerMessageExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TriggerMessageExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTriggerMessageExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTriggerMessageExpression"


    // $ANTLR start "entryRuleDATATYPE"
    // InternalAPIMappingLanguage.g:1524:1: entryRuleDATATYPE : ruleDATATYPE EOF ;
    public final void entryRuleDATATYPE() throws RecognitionException {
        try {
            // InternalAPIMappingLanguage.g:1525:1: ( ruleDATATYPE EOF )
            // InternalAPIMappingLanguage.g:1526:1: ruleDATATYPE EOF
            {
             before(grammarAccess.getDATATYPERule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            ruleDATATYPE();

            state._fsp--;

             after(grammarAccess.getDATATYPERule()); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDATATYPE"


    // $ANTLR start "ruleDATATYPE"
    // InternalAPIMappingLanguage.g:1533:1: ruleDATATYPE : ( ( rule__DATATYPE__Group__0 ) ) ;
    public final void ruleDATATYPE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1537:2: ( ( ( rule__DATATYPE__Group__0 ) ) )
            // InternalAPIMappingLanguage.g:1538:1: ( ( rule__DATATYPE__Group__0 ) )
            {
            // InternalAPIMappingLanguage.g:1538:1: ( ( rule__DATATYPE__Group__0 ) )
            // InternalAPIMappingLanguage.g:1539:1: ( rule__DATATYPE__Group__0 )
            {
             before(grammarAccess.getDATATYPEAccess().getGroup()); 
            // InternalAPIMappingLanguage.g:1540:1: ( rule__DATATYPE__Group__0 )
            // InternalAPIMappingLanguage.g:1540:2: rule__DATATYPE__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DATATYPE__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDATATYPEAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDATATYPE"


    // $ANTLR start "ruleUnaryPostIncrementDecrementOperator"
    // InternalAPIMappingLanguage.g:1553:1: ruleUnaryPostIncrementDecrementOperator : ( ( rule__UnaryPostIncrementDecrementOperator__Alternatives ) ) ;
    public final void ruleUnaryPostIncrementDecrementOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1557:1: ( ( ( rule__UnaryPostIncrementDecrementOperator__Alternatives ) ) )
            // InternalAPIMappingLanguage.g:1558:1: ( ( rule__UnaryPostIncrementDecrementOperator__Alternatives ) )
            {
            // InternalAPIMappingLanguage.g:1558:1: ( ( rule__UnaryPostIncrementDecrementOperator__Alternatives ) )
            // InternalAPIMappingLanguage.g:1559:1: ( rule__UnaryPostIncrementDecrementOperator__Alternatives )
            {
             before(grammarAccess.getUnaryPostIncrementDecrementOperatorAccess().getAlternatives()); 
            // InternalAPIMappingLanguage.g:1560:1: ( rule__UnaryPostIncrementDecrementOperator__Alternatives )
            // InternalAPIMappingLanguage.g:1560:2: rule__UnaryPostIncrementDecrementOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnaryPostIncrementDecrementOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnaryPostIncrementDecrementOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnaryPostIncrementDecrementOperator"


    // $ANTLR start "ruleIncrementDecrementOperatorExpression"
    // InternalAPIMappingLanguage.g:1572:1: ruleIncrementDecrementOperatorExpression : ( ( rule__IncrementDecrementOperatorExpression__Alternatives ) ) ;
    public final void ruleIncrementDecrementOperatorExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1576:1: ( ( ( rule__IncrementDecrementOperatorExpression__Alternatives ) ) )
            // InternalAPIMappingLanguage.g:1577:1: ( ( rule__IncrementDecrementOperatorExpression__Alternatives ) )
            {
            // InternalAPIMappingLanguage.g:1577:1: ( ( rule__IncrementDecrementOperatorExpression__Alternatives ) )
            // InternalAPIMappingLanguage.g:1578:1: ( rule__IncrementDecrementOperatorExpression__Alternatives )
            {
             before(grammarAccess.getIncrementDecrementOperatorExpressionAccess().getAlternatives()); 
            // InternalAPIMappingLanguage.g:1579:1: ( rule__IncrementDecrementOperatorExpression__Alternatives )
            // InternalAPIMappingLanguage.g:1579:2: rule__IncrementDecrementOperatorExpression__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IncrementDecrementOperatorExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getIncrementDecrementOperatorExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIncrementDecrementOperatorExpression"


    // $ANTLR start "ruleAssignOperator"
    // InternalAPIMappingLanguage.g:1591:1: ruleAssignOperator : ( ( rule__AssignOperator__Alternatives ) ) ;
    public final void ruleAssignOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1595:1: ( ( ( rule__AssignOperator__Alternatives ) ) )
            // InternalAPIMappingLanguage.g:1596:1: ( ( rule__AssignOperator__Alternatives ) )
            {
            // InternalAPIMappingLanguage.g:1596:1: ( ( rule__AssignOperator__Alternatives ) )
            // InternalAPIMappingLanguage.g:1597:1: ( rule__AssignOperator__Alternatives )
            {
             before(grammarAccess.getAssignOperatorAccess().getAlternatives()); 
            // InternalAPIMappingLanguage.g:1598:1: ( rule__AssignOperator__Alternatives )
            // InternalAPIMappingLanguage.g:1598:2: rule__AssignOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AssignOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAssignOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssignOperator"


    // $ANTLR start "ruleLogicalOrOperator"
    // InternalAPIMappingLanguage.g:1610:1: ruleLogicalOrOperator : ( ( '||' ) ) ;
    public final void ruleLogicalOrOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1614:1: ( ( ( '||' ) ) )
            // InternalAPIMappingLanguage.g:1615:1: ( ( '||' ) )
            {
            // InternalAPIMappingLanguage.g:1615:1: ( ( '||' ) )
            // InternalAPIMappingLanguage.g:1616:1: ( '||' )
            {
             before(grammarAccess.getLogicalOrOperatorAccess().getOREnumLiteralDeclaration()); 
            // InternalAPIMappingLanguage.g:1617:1: ( '||' )
            // InternalAPIMappingLanguage.g:1617:3: '||'
            {
            match(input,14,FollowSets000.FOLLOW_2); 

            }

             after(grammarAccess.getLogicalOrOperatorAccess().getOREnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogicalOrOperator"


    // $ANTLR start "ruleLogicalAndOperator"
    // InternalAPIMappingLanguage.g:1630:1: ruleLogicalAndOperator : ( ( '&&' ) ) ;
    public final void ruleLogicalAndOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1634:1: ( ( ( '&&' ) ) )
            // InternalAPIMappingLanguage.g:1635:1: ( ( '&&' ) )
            {
            // InternalAPIMappingLanguage.g:1635:1: ( ( '&&' ) )
            // InternalAPIMappingLanguage.g:1636:1: ( '&&' )
            {
             before(grammarAccess.getLogicalAndOperatorAccess().getANDEnumLiteralDeclaration()); 
            // InternalAPIMappingLanguage.g:1637:1: ( '&&' )
            // InternalAPIMappingLanguage.g:1637:3: '&&'
            {
            match(input,15,FollowSets000.FOLLOW_2); 

            }

             after(grammarAccess.getLogicalAndOperatorAccess().getANDEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogicalAndOperator"


    // $ANTLR start "ruleComparingEQNEQOperator"
    // InternalAPIMappingLanguage.g:1650:1: ruleComparingEQNEQOperator : ( ( rule__ComparingEQNEQOperator__Alternatives ) ) ;
    public final void ruleComparingEQNEQOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1654:1: ( ( ( rule__ComparingEQNEQOperator__Alternatives ) ) )
            // InternalAPIMappingLanguage.g:1655:1: ( ( rule__ComparingEQNEQOperator__Alternatives ) )
            {
            // InternalAPIMappingLanguage.g:1655:1: ( ( rule__ComparingEQNEQOperator__Alternatives ) )
            // InternalAPIMappingLanguage.g:1656:1: ( rule__ComparingEQNEQOperator__Alternatives )
            {
             before(grammarAccess.getComparingEQNEQOperatorAccess().getAlternatives()); 
            // InternalAPIMappingLanguage.g:1657:1: ( rule__ComparingEQNEQOperator__Alternatives )
            // InternalAPIMappingLanguage.g:1657:2: rule__ComparingEQNEQOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ComparingEQNEQOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComparingEQNEQOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparingEQNEQOperator"


    // $ANTLR start "ruleComparingRelOperator"
    // InternalAPIMappingLanguage.g:1669:1: ruleComparingRelOperator : ( ( rule__ComparingRelOperator__Alternatives ) ) ;
    public final void ruleComparingRelOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1673:1: ( ( ( rule__ComparingRelOperator__Alternatives ) ) )
            // InternalAPIMappingLanguage.g:1674:1: ( ( rule__ComparingRelOperator__Alternatives ) )
            {
            // InternalAPIMappingLanguage.g:1674:1: ( ( rule__ComparingRelOperator__Alternatives ) )
            // InternalAPIMappingLanguage.g:1675:1: ( rule__ComparingRelOperator__Alternatives )
            {
             before(grammarAccess.getComparingRelOperatorAccess().getAlternatives()); 
            // InternalAPIMappingLanguage.g:1676:1: ( rule__ComparingRelOperator__Alternatives )
            // InternalAPIMappingLanguage.g:1676:2: rule__ComparingRelOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ComparingRelOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComparingRelOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparingRelOperator"


    // $ANTLR start "ruleAdditionOperator"
    // InternalAPIMappingLanguage.g:1688:1: ruleAdditionOperator : ( ( rule__AdditionOperator__Alternatives ) ) ;
    public final void ruleAdditionOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1692:1: ( ( ( rule__AdditionOperator__Alternatives ) ) )
            // InternalAPIMappingLanguage.g:1693:1: ( ( rule__AdditionOperator__Alternatives ) )
            {
            // InternalAPIMappingLanguage.g:1693:1: ( ( rule__AdditionOperator__Alternatives ) )
            // InternalAPIMappingLanguage.g:1694:1: ( rule__AdditionOperator__Alternatives )
            {
             before(grammarAccess.getAdditionOperatorAccess().getAlternatives()); 
            // InternalAPIMappingLanguage.g:1695:1: ( rule__AdditionOperator__Alternatives )
            // InternalAPIMappingLanguage.g:1695:2: rule__AdditionOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AdditionOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAdditionOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdditionOperator"


    // $ANTLR start "ruleMultiplicationOperator"
    // InternalAPIMappingLanguage.g:1707:1: ruleMultiplicationOperator : ( ( rule__MultiplicationOperator__Alternatives ) ) ;
    public final void ruleMultiplicationOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1711:1: ( ( ( rule__MultiplicationOperator__Alternatives ) ) )
            // InternalAPIMappingLanguage.g:1712:1: ( ( rule__MultiplicationOperator__Alternatives ) )
            {
            // InternalAPIMappingLanguage.g:1712:1: ( ( rule__MultiplicationOperator__Alternatives ) )
            // InternalAPIMappingLanguage.g:1713:1: ( rule__MultiplicationOperator__Alternatives )
            {
             before(grammarAccess.getMultiplicationOperatorAccess().getAlternatives()); 
            // InternalAPIMappingLanguage.g:1714:1: ( rule__MultiplicationOperator__Alternatives )
            // InternalAPIMappingLanguage.g:1714:2: rule__MultiplicationOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MultiplicationOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplicationOperator"


    // $ANTLR start "ruleUnaryPreOperator"
    // InternalAPIMappingLanguage.g:1726:1: ruleUnaryPreOperator : ( ( rule__UnaryPreOperator__Alternatives ) ) ;
    public final void ruleUnaryPreOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1730:1: ( ( ( rule__UnaryPreOperator__Alternatives ) ) )
            // InternalAPIMappingLanguage.g:1731:1: ( ( rule__UnaryPreOperator__Alternatives ) )
            {
            // InternalAPIMappingLanguage.g:1731:1: ( ( rule__UnaryPreOperator__Alternatives ) )
            // InternalAPIMappingLanguage.g:1732:1: ( rule__UnaryPreOperator__Alternatives )
            {
             before(grammarAccess.getUnaryPreOperatorAccess().getAlternatives()); 
            // InternalAPIMappingLanguage.g:1733:1: ( rule__UnaryPreOperator__Alternatives )
            // InternalAPIMappingLanguage.g:1733:2: rule__UnaryPreOperator__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnaryPreOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnaryPreOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnaryPreOperator"


    // $ANTLR start "rulePositionSelectorKind"
    // InternalAPIMappingLanguage.g:1745:1: rulePositionSelectorKind : ( ( rule__PositionSelectorKind__Alternatives ) ) ;
    public final void rulePositionSelectorKind() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1749:1: ( ( ( rule__PositionSelectorKind__Alternatives ) ) )
            // InternalAPIMappingLanguage.g:1750:1: ( ( rule__PositionSelectorKind__Alternatives ) )
            {
            // InternalAPIMappingLanguage.g:1750:1: ( ( rule__PositionSelectorKind__Alternatives ) )
            // InternalAPIMappingLanguage.g:1751:1: ( rule__PositionSelectorKind__Alternatives )
            {
             before(grammarAccess.getPositionSelectorKindAccess().getAlternatives()); 
            // InternalAPIMappingLanguage.g:1752:1: ( rule__PositionSelectorKind__Alternatives )
            // InternalAPIMappingLanguage.g:1752:2: rule__PositionSelectorKind__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PositionSelectorKind__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPositionSelectorKindAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePositionSelectorKind"


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalAPIMappingLanguage.g:1763:1: rule__Expression__Alternatives : ( ( ruleAPICallExpression ) | ( ruleLogicalExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1767:1: ( ( ruleAPICallExpression ) | ( ruleLogicalExpression ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==49) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=RULE_INT && LA1_0<=RULE_BOOLEAN)||LA1_0==RULE_MINORMAXKEYWORD||LA1_0==16||LA1_0==29||(LA1_0>=33 && LA1_0<=38)||LA1_0==50) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalAPIMappingLanguage.g:1768:1: ( ruleAPICallExpression )
                    {
                    // InternalAPIMappingLanguage.g:1768:1: ( ruleAPICallExpression )
                    // InternalAPIMappingLanguage.g:1769:1: ruleAPICallExpression
                    {
                     before(grammarAccess.getExpressionAccess().getAPICallExpressionParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleAPICallExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getAPICallExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:1774:6: ( ruleLogicalExpression )
                    {
                    // InternalAPIMappingLanguage.g:1774:6: ( ruleLogicalExpression )
                    // InternalAPIMappingLanguage.g:1775:1: ruleLogicalExpression
                    {
                     before(grammarAccess.getExpressionAccess().getLogicalExpressionParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleLogicalExpression();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getLogicalExpressionParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__ParamaterBinding__ValueAlternatives_3_0"
    // InternalAPIMappingLanguage.g:1785:1: rule__ParamaterBinding__ValueAlternatives_3_0 : ( ( ruleExpression ) | ( ruleEnumerationValueExpression ) | ( ruleContiniousPortExpressions ) );
    public final void rule__ParamaterBinding__ValueAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1789:1: ( ( ruleExpression ) | ( ruleEnumerationValueExpression ) | ( ruleContiniousPortExpressions ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_ID:
            case RULE_NUMBER:
            case RULE_BOOLEAN:
            case RULE_MINORMAXKEYWORD:
            case 16:
            case 29:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 49:
            case 50:
                {
                alt2=1;
                }
                break;
            case 48:
                {
                alt2=2;
                }
                break;
            case 52:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalAPIMappingLanguage.g:1790:1: ( ruleExpression )
                    {
                    // InternalAPIMappingLanguage.g:1790:1: ( ruleExpression )
                    // InternalAPIMappingLanguage.g:1791:1: ruleExpression
                    {
                     before(grammarAccess.getParamaterBindingAccess().getValueExpressionParserRuleCall_3_0_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleExpression();

                    state._fsp--;

                     after(grammarAccess.getParamaterBindingAccess().getValueExpressionParserRuleCall_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:1796:6: ( ruleEnumerationValueExpression )
                    {
                    // InternalAPIMappingLanguage.g:1796:6: ( ruleEnumerationValueExpression )
                    // InternalAPIMappingLanguage.g:1797:1: ruleEnumerationValueExpression
                    {
                     before(grammarAccess.getParamaterBindingAccess().getValueEnumerationValueExpressionParserRuleCall_3_0_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleEnumerationValueExpression();

                    state._fsp--;

                     after(grammarAccess.getParamaterBindingAccess().getValueEnumerationValueExpressionParserRuleCall_3_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAPIMappingLanguage.g:1802:6: ( ruleContiniousPortExpressions )
                    {
                    // InternalAPIMappingLanguage.g:1802:6: ( ruleContiniousPortExpressions )
                    // InternalAPIMappingLanguage.g:1803:1: ruleContiniousPortExpressions
                    {
                     before(grammarAccess.getParamaterBindingAccess().getValueContiniousPortExpressionsParserRuleCall_3_0_2()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleContiniousPortExpressions();

                    state._fsp--;

                     after(grammarAccess.getParamaterBindingAccess().getValueContiniousPortExpressionsParserRuleCall_3_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamaterBinding__ValueAlternatives_3_0"


    // $ANTLR start "rule__ExpressionStartRule__Alternatives"
    // InternalAPIMappingLanguage.g:1813:1: rule__ExpressionStartRule__Alternatives : ( ( ruleAssignment ) | ( ruleForLoop ) | ( ruleWhileLoop ) | ( ruleDoWhileLoop ) | ( ruleIfStatement ) | ( ruleReturnStatement ) | ( ruleLocalVariableOrConstantDeclarationStatement ) | ( ruleOperationCallStatement ) | ( ( rule__ExpressionStartRule__Group_8__0 ) ) );
    public final void rule__ExpressionStartRule__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1817:1: ( ( ruleAssignment ) | ( ruleForLoop ) | ( ruleWhileLoop ) | ( ruleDoWhileLoop ) | ( ruleIfStatement ) | ( ruleReturnStatement ) | ( ruleLocalVariableOrConstantDeclarationStatement ) | ( ruleOperationCallStatement ) | ( ( rule__ExpressionStartRule__Group_8__0 ) ) )
            int alt3=9;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalAPIMappingLanguage.g:1818:1: ( ruleAssignment )
                    {
                    // InternalAPIMappingLanguage.g:1818:1: ( ruleAssignment )
                    // InternalAPIMappingLanguage.g:1819:1: ruleAssignment
                    {
                     before(grammarAccess.getExpressionStartRuleAccess().getAssignmentParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleAssignment();

                    state._fsp--;

                     after(grammarAccess.getExpressionStartRuleAccess().getAssignmentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:1824:6: ( ruleForLoop )
                    {
                    // InternalAPIMappingLanguage.g:1824:6: ( ruleForLoop )
                    // InternalAPIMappingLanguage.g:1825:1: ruleForLoop
                    {
                     before(grammarAccess.getExpressionStartRuleAccess().getForLoopParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleForLoop();

                    state._fsp--;

                     after(grammarAccess.getExpressionStartRuleAccess().getForLoopParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAPIMappingLanguage.g:1830:6: ( ruleWhileLoop )
                    {
                    // InternalAPIMappingLanguage.g:1830:6: ( ruleWhileLoop )
                    // InternalAPIMappingLanguage.g:1831:1: ruleWhileLoop
                    {
                     before(grammarAccess.getExpressionStartRuleAccess().getWhileLoopParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleWhileLoop();

                    state._fsp--;

                     after(grammarAccess.getExpressionStartRuleAccess().getWhileLoopParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAPIMappingLanguage.g:1836:6: ( ruleDoWhileLoop )
                    {
                    // InternalAPIMappingLanguage.g:1836:6: ( ruleDoWhileLoop )
                    // InternalAPIMappingLanguage.g:1837:1: ruleDoWhileLoop
                    {
                     before(grammarAccess.getExpressionStartRuleAccess().getDoWhileLoopParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleDoWhileLoop();

                    state._fsp--;

                     after(grammarAccess.getExpressionStartRuleAccess().getDoWhileLoopParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAPIMappingLanguage.g:1842:6: ( ruleIfStatement )
                    {
                    // InternalAPIMappingLanguage.g:1842:6: ( ruleIfStatement )
                    // InternalAPIMappingLanguage.g:1843:1: ruleIfStatement
                    {
                     before(grammarAccess.getExpressionStartRuleAccess().getIfStatementParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleIfStatement();

                    state._fsp--;

                     after(grammarAccess.getExpressionStartRuleAccess().getIfStatementParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalAPIMappingLanguage.g:1848:6: ( ruleReturnStatement )
                    {
                    // InternalAPIMappingLanguage.g:1848:6: ( ruleReturnStatement )
                    // InternalAPIMappingLanguage.g:1849:1: ruleReturnStatement
                    {
                     before(grammarAccess.getExpressionStartRuleAccess().getReturnStatementParserRuleCall_5()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleReturnStatement();

                    state._fsp--;

                     after(grammarAccess.getExpressionStartRuleAccess().getReturnStatementParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalAPIMappingLanguage.g:1854:6: ( ruleLocalVariableOrConstantDeclarationStatement )
                    {
                    // InternalAPIMappingLanguage.g:1854:6: ( ruleLocalVariableOrConstantDeclarationStatement )
                    // InternalAPIMappingLanguage.g:1855:1: ruleLocalVariableOrConstantDeclarationStatement
                    {
                     before(grammarAccess.getExpressionStartRuleAccess().getLocalVariableOrConstantDeclarationStatementParserRuleCall_6()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleLocalVariableOrConstantDeclarationStatement();

                    state._fsp--;

                     after(grammarAccess.getExpressionStartRuleAccess().getLocalVariableOrConstantDeclarationStatementParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalAPIMappingLanguage.g:1860:6: ( ruleOperationCallStatement )
                    {
                    // InternalAPIMappingLanguage.g:1860:6: ( ruleOperationCallStatement )
                    // InternalAPIMappingLanguage.g:1861:1: ruleOperationCallStatement
                    {
                     before(grammarAccess.getExpressionStartRuleAccess().getOperationCallStatementParserRuleCall_7()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleOperationCallStatement();

                    state._fsp--;

                     after(grammarAccess.getExpressionStartRuleAccess().getOperationCallStatementParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalAPIMappingLanguage.g:1866:6: ( ( rule__ExpressionStartRule__Group_8__0 ) )
                    {
                    // InternalAPIMappingLanguage.g:1866:6: ( ( rule__ExpressionStartRule__Group_8__0 ) )
                    // InternalAPIMappingLanguage.g:1867:1: ( rule__ExpressionStartRule__Group_8__0 )
                    {
                     before(grammarAccess.getExpressionStartRuleAccess().getGroup_8()); 
                    // InternalAPIMappingLanguage.g:1868:1: ( rule__ExpressionStartRule__Group_8__0 )
                    // InternalAPIMappingLanguage.g:1868:2: rule__ExpressionStartRule__Group_8__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ExpressionStartRule__Group_8__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionStartRuleAccess().getGroup_8()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionStartRule__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalAPIMappingLanguage.g:1877:1: rule__EString__Alternatives : ( ( RULE_ID ) | ( ruleQualifiedName ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1881:1: ( ( RULE_ID ) | ( ruleQualifiedName ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==54) ) {
                    alt4=2;
                }
                else if ( (LA4_1==EOF||LA4_1==40) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalAPIMappingLanguage.g:1882:1: ( RULE_ID )
                    {
                    // InternalAPIMappingLanguage.g:1882:1: ( RULE_ID )
                    // InternalAPIMappingLanguage.g:1883:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:1888:6: ( ruleQualifiedName )
                    {
                    // InternalAPIMappingLanguage.g:1888:6: ( ruleQualifiedName )
                    // InternalAPIMappingLanguage.g:1889:1: ruleQualifiedName
                    {
                     before(grammarAccess.getEStringAccess().getQualifiedNameParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleQualifiedName();

                    state._fsp--;

                     after(grammarAccess.getEStringAccess().getQualifiedNameParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Entry__Alternatives"
    // InternalAPIMappingLanguage.g:1899:1: rule__Entry__Alternatives : ( ( ruleBlock ) | ( ruleExpression ) | ( ruleArrayInitializeExpression ) );
    public final void rule__Entry__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1903:1: ( ( ruleBlock ) | ( ruleExpression ) | ( ruleArrayInitializeExpression ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt5=1;
                }
                break;
            case RULE_INT:
            case RULE_ID:
            case RULE_NUMBER:
            case RULE_BOOLEAN:
            case RULE_MINORMAXKEYWORD:
            case 16:
            case 29:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 49:
            case 50:
                {
                alt5=2;
                }
                break;
            case 63:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalAPIMappingLanguage.g:1904:1: ( ruleBlock )
                    {
                    // InternalAPIMappingLanguage.g:1904:1: ( ruleBlock )
                    // InternalAPIMappingLanguage.g:1905:1: ruleBlock
                    {
                     before(grammarAccess.getEntryAccess().getBlockParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleBlock();

                    state._fsp--;

                     after(grammarAccess.getEntryAccess().getBlockParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:1910:6: ( ruleExpression )
                    {
                    // InternalAPIMappingLanguage.g:1910:6: ( ruleExpression )
                    // InternalAPIMappingLanguage.g:1911:1: ruleExpression
                    {
                     before(grammarAccess.getEntryAccess().getExpressionParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleExpression();

                    state._fsp--;

                     after(grammarAccess.getEntryAccess().getExpressionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAPIMappingLanguage.g:1916:6: ( ruleArrayInitializeExpression )
                    {
                    // InternalAPIMappingLanguage.g:1916:6: ( ruleArrayInitializeExpression )
                    // InternalAPIMappingLanguage.g:1917:1: ruleArrayInitializeExpression
                    {
                     before(grammarAccess.getEntryAccess().getArrayInitializeExpressionParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleArrayInitializeExpression();

                    state._fsp--;

                     after(grammarAccess.getEntryAccess().getArrayInitializeExpressionParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entry__Alternatives"


    // $ANTLR start "rule__ForLoopCountingExpression__Alternatives_1"
    // InternalAPIMappingLanguage.g:1927:1: rule__ForLoopCountingExpression__Alternatives_1 : ( ( ( rule__ForLoopCountingExpression__IncrementDecrementOperatorAssignment_1_0 ) ) | ( ( rule__ForLoopCountingExpression__Group_1_1__0 ) ) );
    public final void rule__ForLoopCountingExpression__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1931:1: ( ( ( rule__ForLoopCountingExpression__IncrementDecrementOperatorAssignment_1_0 ) ) | ( ( rule__ForLoopCountingExpression__Group_1_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=17 && LA6_0<=18)) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=19 && LA6_0<=21)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalAPIMappingLanguage.g:1932:1: ( ( rule__ForLoopCountingExpression__IncrementDecrementOperatorAssignment_1_0 ) )
                    {
                    // InternalAPIMappingLanguage.g:1932:1: ( ( rule__ForLoopCountingExpression__IncrementDecrementOperatorAssignment_1_0 ) )
                    // InternalAPIMappingLanguage.g:1933:1: ( rule__ForLoopCountingExpression__IncrementDecrementOperatorAssignment_1_0 )
                    {
                     before(grammarAccess.getForLoopCountingExpressionAccess().getIncrementDecrementOperatorAssignment_1_0()); 
                    // InternalAPIMappingLanguage.g:1934:1: ( rule__ForLoopCountingExpression__IncrementDecrementOperatorAssignment_1_0 )
                    // InternalAPIMappingLanguage.g:1934:2: rule__ForLoopCountingExpression__IncrementDecrementOperatorAssignment_1_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ForLoopCountingExpression__IncrementDecrementOperatorAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getForLoopCountingExpressionAccess().getIncrementDecrementOperatorAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:1938:6: ( ( rule__ForLoopCountingExpression__Group_1_1__0 ) )
                    {
                    // InternalAPIMappingLanguage.g:1938:6: ( ( rule__ForLoopCountingExpression__Group_1_1__0 ) )
                    // InternalAPIMappingLanguage.g:1939:1: ( rule__ForLoopCountingExpression__Group_1_1__0 )
                    {
                     before(grammarAccess.getForLoopCountingExpressionAccess().getGroup_1_1()); 
                    // InternalAPIMappingLanguage.g:1940:1: ( rule__ForLoopCountingExpression__Group_1_1__0 )
                    // InternalAPIMappingLanguage.g:1940:2: rule__ForLoopCountingExpression__Group_1_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ForLoopCountingExpression__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getForLoopCountingExpressionAccess().getGroup_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoopCountingExpression__Alternatives_1"


    // $ANTLR start "rule__Assignment__Alternatives_1"
    // InternalAPIMappingLanguage.g:1949:1: rule__Assignment__Alternatives_1 : ( ( ( rule__Assignment__Group_1_0__0 ) ) | ( ( rule__Assignment__IncrementDecrementOperatorAssignment_1_1 ) ) );
    public final void rule__Assignment__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1953:1: ( ( ( rule__Assignment__Group_1_0__0 ) ) | ( ( rule__Assignment__IncrementDecrementOperatorAssignment_1_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=19 && LA7_0<=21)) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=17 && LA7_0<=18)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalAPIMappingLanguage.g:1954:1: ( ( rule__Assignment__Group_1_0__0 ) )
                    {
                    // InternalAPIMappingLanguage.g:1954:1: ( ( rule__Assignment__Group_1_0__0 ) )
                    // InternalAPIMappingLanguage.g:1955:1: ( rule__Assignment__Group_1_0__0 )
                    {
                     before(grammarAccess.getAssignmentAccess().getGroup_1_0()); 
                    // InternalAPIMappingLanguage.g:1956:1: ( rule__Assignment__Group_1_0__0 )
                    // InternalAPIMappingLanguage.g:1956:2: rule__Assignment__Group_1_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Assignment__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAssignmentAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:1960:6: ( ( rule__Assignment__IncrementDecrementOperatorAssignment_1_1 ) )
                    {
                    // InternalAPIMappingLanguage.g:1960:6: ( ( rule__Assignment__IncrementDecrementOperatorAssignment_1_1 ) )
                    // InternalAPIMappingLanguage.g:1961:1: ( rule__Assignment__IncrementDecrementOperatorAssignment_1_1 )
                    {
                     before(grammarAccess.getAssignmentAccess().getIncrementDecrementOperatorAssignment_1_1()); 
                    // InternalAPIMappingLanguage.g:1962:1: ( rule__Assignment__IncrementDecrementOperatorAssignment_1_1 )
                    // InternalAPIMappingLanguage.g:1962:2: rule__Assignment__IncrementDecrementOperatorAssignment_1_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Assignment__IncrementDecrementOperatorAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAssignmentAccess().getIncrementDecrementOperatorAssignment_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Alternatives_1"


    // $ANTLR start "rule__InitializeExpression__Alternatives"
    // InternalAPIMappingLanguage.g:1971:1: rule__InitializeExpression__Alternatives : ( ( ruleArrayInitializeExpression ) | ( ruleNondeterministicChoiceExpression ) | ( ruleExpression ) );
    public final void rule__InitializeExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:1975:1: ( ( ruleArrayInitializeExpression ) | ( ruleNondeterministicChoiceExpression ) | ( ruleExpression ) )
            int alt8=3;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalAPIMappingLanguage.g:1976:1: ( ruleArrayInitializeExpression )
                    {
                    // InternalAPIMappingLanguage.g:1976:1: ( ruleArrayInitializeExpression )
                    // InternalAPIMappingLanguage.g:1977:1: ruleArrayInitializeExpression
                    {
                     before(grammarAccess.getInitializeExpressionAccess().getArrayInitializeExpressionParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleArrayInitializeExpression();

                    state._fsp--;

                     after(grammarAccess.getInitializeExpressionAccess().getArrayInitializeExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:1982:6: ( ruleNondeterministicChoiceExpression )
                    {
                    // InternalAPIMappingLanguage.g:1982:6: ( ruleNondeterministicChoiceExpression )
                    // InternalAPIMappingLanguage.g:1983:1: ruleNondeterministicChoiceExpression
                    {
                     before(grammarAccess.getInitializeExpressionAccess().getNondeterministicChoiceExpressionParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleNondeterministicChoiceExpression();

                    state._fsp--;

                     after(grammarAccess.getInitializeExpressionAccess().getNondeterministicChoiceExpressionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAPIMappingLanguage.g:1988:6: ( ruleExpression )
                    {
                    // InternalAPIMappingLanguage.g:1988:6: ( ruleExpression )
                    // InternalAPIMappingLanguage.g:1989:1: ruleExpression
                    {
                     before(grammarAccess.getInitializeExpressionAccess().getExpressionParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleExpression();

                    state._fsp--;

                     after(grammarAccess.getInitializeExpressionAccess().getExpressionParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InitializeExpression__Alternatives"


    // $ANTLR start "rule__LocalVariableOrConstantDeclarationStatement__VariableAlternatives_0"
    // InternalAPIMappingLanguage.g:1999:1: rule__LocalVariableOrConstantDeclarationStatement__VariableAlternatives_0 : ( ( ruleLocalVariableDeclaration ) | ( ruleLocalConstantDeclaration ) );
    public final void rule__LocalVariableOrConstantDeclarationStatement__VariableAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2003:1: ( ( ruleLocalVariableDeclaration ) | ( ruleLocalConstantDeclaration ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            else if ( (LA9_0==66) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalAPIMappingLanguage.g:2004:1: ( ruleLocalVariableDeclaration )
                    {
                    // InternalAPIMappingLanguage.g:2004:1: ( ruleLocalVariableDeclaration )
                    // InternalAPIMappingLanguage.g:2005:1: ruleLocalVariableDeclaration
                    {
                     before(grammarAccess.getLocalVariableOrConstantDeclarationStatementAccess().getVariableLocalVariableDeclarationParserRuleCall_0_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleLocalVariableDeclaration();

                    state._fsp--;

                     after(grammarAccess.getLocalVariableOrConstantDeclarationStatementAccess().getVariableLocalVariableDeclarationParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:2010:6: ( ruleLocalConstantDeclaration )
                    {
                    // InternalAPIMappingLanguage.g:2010:6: ( ruleLocalConstantDeclaration )
                    // InternalAPIMappingLanguage.g:2011:1: ruleLocalConstantDeclaration
                    {
                     before(grammarAccess.getLocalVariableOrConstantDeclarationStatementAccess().getVariableLocalConstantDeclarationParserRuleCall_0_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleLocalConstantDeclaration();

                    state._fsp--;

                     after(grammarAccess.getLocalVariableOrConstantDeclarationStatementAccess().getVariableLocalConstantDeclarationParserRuleCall_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVariableOrConstantDeclarationStatement__VariableAlternatives_0"


    // $ANTLR start "rule__MultiplicationExpression__Alternatives"
    // InternalAPIMappingLanguage.g:2021:1: rule__MultiplicationExpression__Alternatives : ( ( ruleUnaryPreExpression ) | ( ( rule__MultiplicationExpression__Group_1__0 ) ) );
    public final void rule__MultiplicationExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2025:1: ( ( ruleUnaryPreExpression ) | ( ( rule__MultiplicationExpression__Group_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29||LA10_0==33) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=RULE_INT && LA10_0<=RULE_BOOLEAN)||LA10_0==RULE_MINORMAXKEYWORD||LA10_0==16||(LA10_0>=34 && LA10_0<=38)||LA10_0==50) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalAPIMappingLanguage.g:2026:1: ( ruleUnaryPreExpression )
                    {
                    // InternalAPIMappingLanguage.g:2026:1: ( ruleUnaryPreExpression )
                    // InternalAPIMappingLanguage.g:2027:1: ruleUnaryPreExpression
                    {
                     before(grammarAccess.getMultiplicationExpressionAccess().getUnaryPreExpressionParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleUnaryPreExpression();

                    state._fsp--;

                     after(grammarAccess.getMultiplicationExpressionAccess().getUnaryPreExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:2032:6: ( ( rule__MultiplicationExpression__Group_1__0 ) )
                    {
                    // InternalAPIMappingLanguage.g:2032:6: ( ( rule__MultiplicationExpression__Group_1__0 ) )
                    // InternalAPIMappingLanguage.g:2033:1: ( rule__MultiplicationExpression__Group_1__0 )
                    {
                     before(grammarAccess.getMultiplicationExpressionAccess().getGroup_1()); 
                    // InternalAPIMappingLanguage.g:2034:1: ( rule__MultiplicationExpression__Group_1__0 )
                    // InternalAPIMappingLanguage.g:2034:2: rule__MultiplicationExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__MultiplicationExpression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplicationExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Alternatives"


    // $ANTLR start "rule__MultiplicationExpression__RightExpressionAlternatives_1_1_2_0"
    // InternalAPIMappingLanguage.g:2043:1: rule__MultiplicationExpression__RightExpressionAlternatives_1_1_2_0 : ( ( ruleUnaryPreExpression ) | ( ruleTypeCastExpression ) );
    public final void rule__MultiplicationExpression__RightExpressionAlternatives_1_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2047:1: ( ( ruleUnaryPreExpression ) | ( ruleTypeCastExpression ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29||LA11_0==33) ) {
                alt11=1;
            }
            else if ( ((LA11_0>=RULE_INT && LA11_0<=RULE_BOOLEAN)||LA11_0==RULE_MINORMAXKEYWORD||LA11_0==16||(LA11_0>=34 && LA11_0<=38)||LA11_0==50) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalAPIMappingLanguage.g:2048:1: ( ruleUnaryPreExpression )
                    {
                    // InternalAPIMappingLanguage.g:2048:1: ( ruleUnaryPreExpression )
                    // InternalAPIMappingLanguage.g:2049:1: ruleUnaryPreExpression
                    {
                     before(grammarAccess.getMultiplicationExpressionAccess().getRightExpressionUnaryPreExpressionParserRuleCall_1_1_2_0_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleUnaryPreExpression();

                    state._fsp--;

                     after(grammarAccess.getMultiplicationExpressionAccess().getRightExpressionUnaryPreExpressionParserRuleCall_1_1_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:2054:6: ( ruleTypeCastExpression )
                    {
                    // InternalAPIMappingLanguage.g:2054:6: ( ruleTypeCastExpression )
                    // InternalAPIMappingLanguage.g:2055:1: ruleTypeCastExpression
                    {
                     before(grammarAccess.getMultiplicationExpressionAccess().getRightExpressionTypeCastExpressionParserRuleCall_1_1_2_0_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleTypeCastExpression();

                    state._fsp--;

                     after(grammarAccess.getMultiplicationExpressionAccess().getRightExpressionTypeCastExpressionParserRuleCall_1_1_2_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__RightExpressionAlternatives_1_1_2_0"


    // $ANTLR start "rule__TypeCastExpression__Alternatives"
    // InternalAPIMappingLanguage.g:2065:1: rule__TypeCastExpression__Alternatives : ( ( ruleOperand ) | ( ( rule__TypeCastExpression__Group_1__0 ) ) );
    public final void rule__TypeCastExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2069:1: ( ( ruleOperand ) | ( ( rule__TypeCastExpression__Group_1__0 ) ) )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalAPIMappingLanguage.g:2070:1: ( ruleOperand )
                    {
                    // InternalAPIMappingLanguage.g:2070:1: ( ruleOperand )
                    // InternalAPIMappingLanguage.g:2071:1: ruleOperand
                    {
                     before(grammarAccess.getTypeCastExpressionAccess().getOperandParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleOperand();

                    state._fsp--;

                     after(grammarAccess.getTypeCastExpressionAccess().getOperandParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:2076:6: ( ( rule__TypeCastExpression__Group_1__0 ) )
                    {
                    // InternalAPIMappingLanguage.g:2076:6: ( ( rule__TypeCastExpression__Group_1__0 ) )
                    // InternalAPIMappingLanguage.g:2077:1: ( rule__TypeCastExpression__Group_1__0 )
                    {
                     before(grammarAccess.getTypeCastExpressionAccess().getGroup_1()); 
                    // InternalAPIMappingLanguage.g:2078:1: ( rule__TypeCastExpression__Group_1__0 )
                    // InternalAPIMappingLanguage.g:2078:2: rule__TypeCastExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__TypeCastExpression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTypeCastExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeCastExpression__Alternatives"


    // $ANTLR start "rule__Operand__Alternatives"
    // InternalAPIMappingLanguage.g:2087:1: rule__Operand__Alternatives : ( ( ( rule__Operand__Group_0__0 ) ) | ( ruleLiteralExpression ) | ( ruleExtendedTypedNamedElementExpression ) | ( ruleTimeValueExpression ) | ( ruleOperationCall ) | ( ruleTriggerMessageExpression ) | ( ruleNoAttributeSelectorExpression ) );
    public final void rule__Operand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2091:1: ( ( ( rule__Operand__Group_0__0 ) ) | ( ruleLiteralExpression ) | ( ruleExtendedTypedNamedElementExpression ) | ( ruleTimeValueExpression ) | ( ruleOperationCall ) | ( ruleTriggerMessageExpression ) | ( ruleNoAttributeSelectorExpression ) )
            int alt13=7;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalAPIMappingLanguage.g:2092:1: ( ( rule__Operand__Group_0__0 ) )
                    {
                    // InternalAPIMappingLanguage.g:2092:1: ( ( rule__Operand__Group_0__0 ) )
                    // InternalAPIMappingLanguage.g:2093:1: ( rule__Operand__Group_0__0 )
                    {
                     before(grammarAccess.getOperandAccess().getGroup_0()); 
                    // InternalAPIMappingLanguage.g:2094:1: ( rule__Operand__Group_0__0 )
                    // InternalAPIMappingLanguage.g:2094:2: rule__Operand__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Operand__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOperandAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:2098:6: ( ruleLiteralExpression )
                    {
                    // InternalAPIMappingLanguage.g:2098:6: ( ruleLiteralExpression )
                    // InternalAPIMappingLanguage.g:2099:1: ruleLiteralExpression
                    {
                     before(grammarAccess.getOperandAccess().getLiteralExpressionParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleLiteralExpression();

                    state._fsp--;

                     after(grammarAccess.getOperandAccess().getLiteralExpressionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAPIMappingLanguage.g:2104:6: ( ruleExtendedTypedNamedElementExpression )
                    {
                    // InternalAPIMappingLanguage.g:2104:6: ( ruleExtendedTypedNamedElementExpression )
                    // InternalAPIMappingLanguage.g:2105:1: ruleExtendedTypedNamedElementExpression
                    {
                     before(grammarAccess.getOperandAccess().getExtendedTypedNamedElementExpressionParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleExtendedTypedNamedElementExpression();

                    state._fsp--;

                     after(grammarAccess.getOperandAccess().getExtendedTypedNamedElementExpressionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAPIMappingLanguage.g:2110:6: ( ruleTimeValueExpression )
                    {
                    // InternalAPIMappingLanguage.g:2110:6: ( ruleTimeValueExpression )
                    // InternalAPIMappingLanguage.g:2111:1: ruleTimeValueExpression
                    {
                     before(grammarAccess.getOperandAccess().getTimeValueExpressionParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleTimeValueExpression();

                    state._fsp--;

                     after(grammarAccess.getOperandAccess().getTimeValueExpressionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAPIMappingLanguage.g:2116:6: ( ruleOperationCall )
                    {
                    // InternalAPIMappingLanguage.g:2116:6: ( ruleOperationCall )
                    // InternalAPIMappingLanguage.g:2117:1: ruleOperationCall
                    {
                     before(grammarAccess.getOperandAccess().getOperationCallParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleOperationCall();

                    state._fsp--;

                     after(grammarAccess.getOperandAccess().getOperationCallParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalAPIMappingLanguage.g:2122:6: ( ruleTriggerMessageExpression )
                    {
                    // InternalAPIMappingLanguage.g:2122:6: ( ruleTriggerMessageExpression )
                    // InternalAPIMappingLanguage.g:2123:1: ruleTriggerMessageExpression
                    {
                     before(grammarAccess.getOperandAccess().getTriggerMessageExpressionParserRuleCall_5()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleTriggerMessageExpression();

                    state._fsp--;

                     after(grammarAccess.getOperandAccess().getTriggerMessageExpressionParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalAPIMappingLanguage.g:2128:6: ( ruleNoAttributeSelectorExpression )
                    {
                    // InternalAPIMappingLanguage.g:2128:6: ( ruleNoAttributeSelectorExpression )
                    // InternalAPIMappingLanguage.g:2129:1: ruleNoAttributeSelectorExpression
                    {
                     before(grammarAccess.getOperandAccess().getNoAttributeSelectorExpressionParserRuleCall_6()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleNoAttributeSelectorExpression();

                    state._fsp--;

                     after(grammarAccess.getOperandAccess().getNoAttributeSelectorExpressionParserRuleCall_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operand__Alternatives"


    // $ANTLR start "rule__Literal__Alternatives"
    // InternalAPIMappingLanguage.g:2139:1: rule__Literal__Alternatives : ( ( RULE_NUMBER ) | ( RULE_BOOLEAN ) | ( RULE_INT ) | ( 'null' ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2143:1: ( ( RULE_NUMBER ) | ( RULE_BOOLEAN ) | ( RULE_INT ) | ( 'null' ) )
            int alt14=4;
            switch ( input.LA(1) ) {
            case RULE_NUMBER:
                {
                alt14=1;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt14=2;
                }
                break;
            case RULE_INT:
                {
                alt14=3;
                }
                break;
            case 16:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalAPIMappingLanguage.g:2144:1: ( RULE_NUMBER )
                    {
                    // InternalAPIMappingLanguage.g:2144:1: ( RULE_NUMBER )
                    // InternalAPIMappingLanguage.g:2145:1: RULE_NUMBER
                    {
                     before(grammarAccess.getLiteralAccess().getNUMBERTerminalRuleCall_0()); 
                    match(input,RULE_NUMBER,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getLiteralAccess().getNUMBERTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:2150:6: ( RULE_BOOLEAN )
                    {
                    // InternalAPIMappingLanguage.g:2150:6: ( RULE_BOOLEAN )
                    // InternalAPIMappingLanguage.g:2151:1: RULE_BOOLEAN
                    {
                     before(grammarAccess.getLiteralAccess().getBOOLEANTerminalRuleCall_1()); 
                    match(input,RULE_BOOLEAN,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getLiteralAccess().getBOOLEANTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAPIMappingLanguage.g:2156:6: ( RULE_INT )
                    {
                    // InternalAPIMappingLanguage.g:2156:6: ( RULE_INT )
                    // InternalAPIMappingLanguage.g:2157:1: RULE_INT
                    {
                     before(grammarAccess.getLiteralAccess().getINTTerminalRuleCall_2()); 
                    match(input,RULE_INT,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getLiteralAccess().getINTTerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAPIMappingLanguage.g:2162:6: ( 'null' )
                    {
                    // InternalAPIMappingLanguage.g:2162:6: ( 'null' )
                    // InternalAPIMappingLanguage.g:2163:1: 'null'
                    {
                     before(grammarAccess.getLiteralAccess().getNullKeyword_3()); 
                    match(input,16,FollowSets000.FOLLOW_2); 
                     after(grammarAccess.getLiteralAccess().getNullKeyword_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Alternatives"


    // $ANTLR start "rule__ExtendedTypedNamedElementExpression__Alternatives_1"
    // InternalAPIMappingLanguage.g:2175:1: rule__ExtendedTypedNamedElementExpression__Alternatives_1 : ( ( ( rule__ExtendedTypedNamedElementExpression__Group_1_0__0 ) ) | ( ( rule__ExtendedTypedNamedElementExpression__Group_1_1__0 ) ) );
    public final void rule__ExtendedTypedNamedElementExpression__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2179:1: ( ( ( rule__ExtendedTypedNamedElementExpression__Group_1_0__0 ) ) | ( ( rule__ExtendedTypedNamedElementExpression__Group_1_1__0 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==65) ) {
                alt15=1;
            }
            else if ( ((LA15_0>=17 && LA15_0<=18)) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalAPIMappingLanguage.g:2180:1: ( ( rule__ExtendedTypedNamedElementExpression__Group_1_0__0 ) )
                    {
                    // InternalAPIMappingLanguage.g:2180:1: ( ( rule__ExtendedTypedNamedElementExpression__Group_1_0__0 ) )
                    // InternalAPIMappingLanguage.g:2181:1: ( rule__ExtendedTypedNamedElementExpression__Group_1_0__0 )
                    {
                     before(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getGroup_1_0()); 
                    // InternalAPIMappingLanguage.g:2182:1: ( rule__ExtendedTypedNamedElementExpression__Group_1_0__0 )
                    // InternalAPIMappingLanguage.g:2182:2: rule__ExtendedTypedNamedElementExpression__Group_1_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ExtendedTypedNamedElementExpression__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:2186:6: ( ( rule__ExtendedTypedNamedElementExpression__Group_1_1__0 ) )
                    {
                    // InternalAPIMappingLanguage.g:2186:6: ( ( rule__ExtendedTypedNamedElementExpression__Group_1_1__0 ) )
                    // InternalAPIMappingLanguage.g:2187:1: ( rule__ExtendedTypedNamedElementExpression__Group_1_1__0 )
                    {
                     before(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getGroup_1_1()); 
                    // InternalAPIMappingLanguage.g:2188:1: ( rule__ExtendedTypedNamedElementExpression__Group_1_1__0 )
                    // InternalAPIMappingLanguage.g:2188:2: rule__ExtendedTypedNamedElementExpression__Group_1_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ExtendedTypedNamedElementExpression__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getGroup_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedTypedNamedElementExpression__Alternatives_1"


    // $ANTLR start "rule__TypedNamedElementExpression__ElementAccessorsAlternatives_1_0"
    // InternalAPIMappingLanguage.g:2197:1: rule__TypedNamedElementExpression__ElementAccessorsAlternatives_1_0 : ( ( ruleArrayIndexExpression ) | ( ruleAttributeAccessorExpression ) );
    public final void rule__TypedNamedElementExpression__ElementAccessorsAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2201:1: ( ( ruleArrayIndexExpression ) | ( ruleAttributeAccessorExpression ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==63) ) {
                alt16=1;
            }
            else if ( (LA16_0==54) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalAPIMappingLanguage.g:2202:1: ( ruleArrayIndexExpression )
                    {
                    // InternalAPIMappingLanguage.g:2202:1: ( ruleArrayIndexExpression )
                    // InternalAPIMappingLanguage.g:2203:1: ruleArrayIndexExpression
                    {
                     before(grammarAccess.getTypedNamedElementExpressionAccess().getElementAccessorsArrayIndexExpressionParserRuleCall_1_0_0()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleArrayIndexExpression();

                    state._fsp--;

                     after(grammarAccess.getTypedNamedElementExpressionAccess().getElementAccessorsArrayIndexExpressionParserRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:2208:6: ( ruleAttributeAccessorExpression )
                    {
                    // InternalAPIMappingLanguage.g:2208:6: ( ruleAttributeAccessorExpression )
                    // InternalAPIMappingLanguage.g:2209:1: ruleAttributeAccessorExpression
                    {
                     before(grammarAccess.getTypedNamedElementExpressionAccess().getElementAccessorsAttributeAccessorExpressionParserRuleCall_1_0_1()); 
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleAttributeAccessorExpression();

                    state._fsp--;

                     after(grammarAccess.getTypedNamedElementExpressionAccess().getElementAccessorsAttributeAccessorExpressionParserRuleCall_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedNamedElementExpression__ElementAccessorsAlternatives_1_0"


    // $ANTLR start "rule__UnaryPostIncrementDecrementOperator__Alternatives"
    // InternalAPIMappingLanguage.g:2219:1: rule__UnaryPostIncrementDecrementOperator__Alternatives : ( ( ( '++' ) ) | ( ( '--' ) ) );
    public final void rule__UnaryPostIncrementDecrementOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2223:1: ( ( ( '++' ) ) | ( ( '--' ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==17) ) {
                alt17=1;
            }
            else if ( (LA17_0==18) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalAPIMappingLanguage.g:2224:1: ( ( '++' ) )
                    {
                    // InternalAPIMappingLanguage.g:2224:1: ( ( '++' ) )
                    // InternalAPIMappingLanguage.g:2225:1: ( '++' )
                    {
                     before(grammarAccess.getUnaryPostIncrementDecrementOperatorAccess().getINCREMENTEnumLiteralDeclaration_0()); 
                    // InternalAPIMappingLanguage.g:2226:1: ( '++' )
                    // InternalAPIMappingLanguage.g:2226:3: '++'
                    {
                    match(input,17,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getUnaryPostIncrementDecrementOperatorAccess().getINCREMENTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:2231:6: ( ( '--' ) )
                    {
                    // InternalAPIMappingLanguage.g:2231:6: ( ( '--' ) )
                    // InternalAPIMappingLanguage.g:2232:1: ( '--' )
                    {
                     before(grammarAccess.getUnaryPostIncrementDecrementOperatorAccess().getDECREMENTEnumLiteralDeclaration_1()); 
                    // InternalAPIMappingLanguage.g:2233:1: ( '--' )
                    // InternalAPIMappingLanguage.g:2233:3: '--'
                    {
                    match(input,18,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getUnaryPostIncrementDecrementOperatorAccess().getDECREMENTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryPostIncrementDecrementOperator__Alternatives"


    // $ANTLR start "rule__IncrementDecrementOperatorExpression__Alternatives"
    // InternalAPIMappingLanguage.g:2243:1: rule__IncrementDecrementOperatorExpression__Alternatives : ( ( ( '++' ) ) | ( ( '--' ) ) );
    public final void rule__IncrementDecrementOperatorExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2247:1: ( ( ( '++' ) ) | ( ( '--' ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==17) ) {
                alt18=1;
            }
            else if ( (LA18_0==18) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalAPIMappingLanguage.g:2248:1: ( ( '++' ) )
                    {
                    // InternalAPIMappingLanguage.g:2248:1: ( ( '++' ) )
                    // InternalAPIMappingLanguage.g:2249:1: ( '++' )
                    {
                     before(grammarAccess.getIncrementDecrementOperatorExpressionAccess().getINCREMENTEnumLiteralDeclaration_0()); 
                    // InternalAPIMappingLanguage.g:2250:1: ( '++' )
                    // InternalAPIMappingLanguage.g:2250:3: '++'
                    {
                    match(input,17,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getIncrementDecrementOperatorExpressionAccess().getINCREMENTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:2255:6: ( ( '--' ) )
                    {
                    // InternalAPIMappingLanguage.g:2255:6: ( ( '--' ) )
                    // InternalAPIMappingLanguage.g:2256:1: ( '--' )
                    {
                     before(grammarAccess.getIncrementDecrementOperatorExpressionAccess().getDECREMENTEnumLiteralDeclaration_1()); 
                    // InternalAPIMappingLanguage.g:2257:1: ( '--' )
                    // InternalAPIMappingLanguage.g:2257:3: '--'
                    {
                    match(input,18,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getIncrementDecrementOperatorExpressionAccess().getDECREMENTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IncrementDecrementOperatorExpression__Alternatives"


    // $ANTLR start "rule__AssignOperator__Alternatives"
    // InternalAPIMappingLanguage.g:2267:1: rule__AssignOperator__Alternatives : ( ( ( ':=' ) ) | ( ( '+=' ) ) | ( ( '-=' ) ) );
    public final void rule__AssignOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2271:1: ( ( ( ':=' ) ) | ( ( '+=' ) ) | ( ( '-=' ) ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt19=1;
                }
                break;
            case 20:
                {
                alt19=2;
                }
                break;
            case 21:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalAPIMappingLanguage.g:2272:1: ( ( ':=' ) )
                    {
                    // InternalAPIMappingLanguage.g:2272:1: ( ( ':=' ) )
                    // InternalAPIMappingLanguage.g:2273:1: ( ':=' )
                    {
                     before(grammarAccess.getAssignOperatorAccess().getASSIGNEnumLiteralDeclaration_0()); 
                    // InternalAPIMappingLanguage.g:2274:1: ( ':=' )
                    // InternalAPIMappingLanguage.g:2274:3: ':='
                    {
                    match(input,19,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getAssignOperatorAccess().getASSIGNEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:2279:6: ( ( '+=' ) )
                    {
                    // InternalAPIMappingLanguage.g:2279:6: ( ( '+=' ) )
                    // InternalAPIMappingLanguage.g:2280:1: ( '+=' )
                    {
                     before(grammarAccess.getAssignOperatorAccess().getPLUS_EQUALEnumLiteralDeclaration_1()); 
                    // InternalAPIMappingLanguage.g:2281:1: ( '+=' )
                    // InternalAPIMappingLanguage.g:2281:3: '+='
                    {
                    match(input,20,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getAssignOperatorAccess().getPLUS_EQUALEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAPIMappingLanguage.g:2286:6: ( ( '-=' ) )
                    {
                    // InternalAPIMappingLanguage.g:2286:6: ( ( '-=' ) )
                    // InternalAPIMappingLanguage.g:2287:1: ( '-=' )
                    {
                     before(grammarAccess.getAssignOperatorAccess().getMINUS_EQUALEnumLiteralDeclaration_2()); 
                    // InternalAPIMappingLanguage.g:2288:1: ( '-=' )
                    // InternalAPIMappingLanguage.g:2288:3: '-='
                    {
                    match(input,21,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getAssignOperatorAccess().getMINUS_EQUALEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignOperator__Alternatives"


    // $ANTLR start "rule__ComparingEQNEQOperator__Alternatives"
    // InternalAPIMappingLanguage.g:2298:1: rule__ComparingEQNEQOperator__Alternatives : ( ( ( '==' ) ) | ( ( '<>' ) ) );
    public final void rule__ComparingEQNEQOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2302:1: ( ( ( '==' ) ) | ( ( '<>' ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==22) ) {
                alt20=1;
            }
            else if ( (LA20_0==23) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalAPIMappingLanguage.g:2303:1: ( ( '==' ) )
                    {
                    // InternalAPIMappingLanguage.g:2303:1: ( ( '==' ) )
                    // InternalAPIMappingLanguage.g:2304:1: ( '==' )
                    {
                     before(grammarAccess.getComparingEQNEQOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 
                    // InternalAPIMappingLanguage.g:2305:1: ( '==' )
                    // InternalAPIMappingLanguage.g:2305:3: '=='
                    {
                    match(input,22,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getComparingEQNEQOperatorAccess().getEQUALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:2310:6: ( ( '<>' ) )
                    {
                    // InternalAPIMappingLanguage.g:2310:6: ( ( '<>' ) )
                    // InternalAPIMappingLanguage.g:2311:1: ( '<>' )
                    {
                     before(grammarAccess.getComparingEQNEQOperatorAccess().getUNEQUALEnumLiteralDeclaration_1()); 
                    // InternalAPIMappingLanguage.g:2312:1: ( '<>' )
                    // InternalAPIMappingLanguage.g:2312:3: '<>'
                    {
                    match(input,23,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getComparingEQNEQOperatorAccess().getUNEQUALEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparingEQNEQOperator__Alternatives"


    // $ANTLR start "rule__ComparingRelOperator__Alternatives"
    // InternalAPIMappingLanguage.g:2322:1: rule__ComparingRelOperator__Alternatives : ( ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>=' ) ) | ( ( '>' ) ) );
    public final void rule__ComparingRelOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2326:1: ( ( ( '<' ) ) | ( ( '<=' ) ) | ( ( '>=' ) ) | ( ( '>' ) ) )
            int alt21=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt21=1;
                }
                break;
            case 25:
                {
                alt21=2;
                }
                break;
            case 26:
                {
                alt21=3;
                }
                break;
            case 27:
                {
                alt21=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalAPIMappingLanguage.g:2327:1: ( ( '<' ) )
                    {
                    // InternalAPIMappingLanguage.g:2327:1: ( ( '<' ) )
                    // InternalAPIMappingLanguage.g:2328:1: ( '<' )
                    {
                     before(grammarAccess.getComparingRelOperatorAccess().getLESSEnumLiteralDeclaration_0()); 
                    // InternalAPIMappingLanguage.g:2329:1: ( '<' )
                    // InternalAPIMappingLanguage.g:2329:3: '<'
                    {
                    match(input,24,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getComparingRelOperatorAccess().getLESSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:2334:6: ( ( '<=' ) )
                    {
                    // InternalAPIMappingLanguage.g:2334:6: ( ( '<=' ) )
                    // InternalAPIMappingLanguage.g:2335:1: ( '<=' )
                    {
                     before(grammarAccess.getComparingRelOperatorAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1()); 
                    // InternalAPIMappingLanguage.g:2336:1: ( '<=' )
                    // InternalAPIMappingLanguage.g:2336:3: '<='
                    {
                    match(input,25,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getComparingRelOperatorAccess().getLESS_OR_EQUALEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAPIMappingLanguage.g:2341:6: ( ( '>=' ) )
                    {
                    // InternalAPIMappingLanguage.g:2341:6: ( ( '>=' ) )
                    // InternalAPIMappingLanguage.g:2342:1: ( '>=' )
                    {
                     before(grammarAccess.getComparingRelOperatorAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_2()); 
                    // InternalAPIMappingLanguage.g:2343:1: ( '>=' )
                    // InternalAPIMappingLanguage.g:2343:3: '>='
                    {
                    match(input,26,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getComparingRelOperatorAccess().getGREATER_OR_EQUALEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAPIMappingLanguage.g:2348:6: ( ( '>' ) )
                    {
                    // InternalAPIMappingLanguage.g:2348:6: ( ( '>' ) )
                    // InternalAPIMappingLanguage.g:2349:1: ( '>' )
                    {
                     before(grammarAccess.getComparingRelOperatorAccess().getGREATEREnumLiteralDeclaration_3()); 
                    // InternalAPIMappingLanguage.g:2350:1: ( '>' )
                    // InternalAPIMappingLanguage.g:2350:3: '>'
                    {
                    match(input,27,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getComparingRelOperatorAccess().getGREATEREnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparingRelOperator__Alternatives"


    // $ANTLR start "rule__AdditionOperator__Alternatives"
    // InternalAPIMappingLanguage.g:2360:1: rule__AdditionOperator__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );
    public final void rule__AdditionOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2364:1: ( ( ( '+' ) ) | ( ( '-' ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==28) ) {
                alt22=1;
            }
            else if ( (LA22_0==29) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalAPIMappingLanguage.g:2365:1: ( ( '+' ) )
                    {
                    // InternalAPIMappingLanguage.g:2365:1: ( ( '+' ) )
                    // InternalAPIMappingLanguage.g:2366:1: ( '+' )
                    {
                     before(grammarAccess.getAdditionOperatorAccess().getPLUSEnumLiteralDeclaration_0()); 
                    // InternalAPIMappingLanguage.g:2367:1: ( '+' )
                    // InternalAPIMappingLanguage.g:2367:3: '+'
                    {
                    match(input,28,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getAdditionOperatorAccess().getPLUSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:2372:6: ( ( '-' ) )
                    {
                    // InternalAPIMappingLanguage.g:2372:6: ( ( '-' ) )
                    // InternalAPIMappingLanguage.g:2373:1: ( '-' )
                    {
                     before(grammarAccess.getAdditionOperatorAccess().getMINUSEnumLiteralDeclaration_1()); 
                    // InternalAPIMappingLanguage.g:2374:1: ( '-' )
                    // InternalAPIMappingLanguage.g:2374:3: '-'
                    {
                    match(input,29,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getAdditionOperatorAccess().getMINUSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionOperator__Alternatives"


    // $ANTLR start "rule__MultiplicationOperator__Alternatives"
    // InternalAPIMappingLanguage.g:2384:1: rule__MultiplicationOperator__Alternatives : ( ( ( '*' ) ) | ( ( '/' ) ) | ( ( '%' ) ) );
    public final void rule__MultiplicationOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2388:1: ( ( ( '*' ) ) | ( ( '/' ) ) | ( ( '%' ) ) )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt23=1;
                }
                break;
            case 31:
                {
                alt23=2;
                }
                break;
            case 32:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalAPIMappingLanguage.g:2389:1: ( ( '*' ) )
                    {
                    // InternalAPIMappingLanguage.g:2389:1: ( ( '*' ) )
                    // InternalAPIMappingLanguage.g:2390:1: ( '*' )
                    {
                     before(grammarAccess.getMultiplicationOperatorAccess().getTIMESEnumLiteralDeclaration_0()); 
                    // InternalAPIMappingLanguage.g:2391:1: ( '*' )
                    // InternalAPIMappingLanguage.g:2391:3: '*'
                    {
                    match(input,30,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getMultiplicationOperatorAccess().getTIMESEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:2396:6: ( ( '/' ) )
                    {
                    // InternalAPIMappingLanguage.g:2396:6: ( ( '/' ) )
                    // InternalAPIMappingLanguage.g:2397:1: ( '/' )
                    {
                     before(grammarAccess.getMultiplicationOperatorAccess().getDIVIDEEnumLiteralDeclaration_1()); 
                    // InternalAPIMappingLanguage.g:2398:1: ( '/' )
                    // InternalAPIMappingLanguage.g:2398:3: '/'
                    {
                    match(input,31,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getMultiplicationOperatorAccess().getDIVIDEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAPIMappingLanguage.g:2403:6: ( ( '%' ) )
                    {
                    // InternalAPIMappingLanguage.g:2403:6: ( ( '%' ) )
                    // InternalAPIMappingLanguage.g:2404:1: ( '%' )
                    {
                     before(grammarAccess.getMultiplicationOperatorAccess().getMODULOEnumLiteralDeclaration_2()); 
                    // InternalAPIMappingLanguage.g:2405:1: ( '%' )
                    // InternalAPIMappingLanguage.g:2405:3: '%'
                    {
                    match(input,32,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getMultiplicationOperatorAccess().getMODULOEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationOperator__Alternatives"


    // $ANTLR start "rule__UnaryPreOperator__Alternatives"
    // InternalAPIMappingLanguage.g:2415:1: rule__UnaryPreOperator__Alternatives : ( ( ( 'not' ) ) | ( ( '-' ) ) );
    public final void rule__UnaryPreOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2419:1: ( ( ( 'not' ) ) | ( ( '-' ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==33) ) {
                alt24=1;
            }
            else if ( (LA24_0==29) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalAPIMappingLanguage.g:2420:1: ( ( 'not' ) )
                    {
                    // InternalAPIMappingLanguage.g:2420:1: ( ( 'not' ) )
                    // InternalAPIMappingLanguage.g:2421:1: ( 'not' )
                    {
                     before(grammarAccess.getUnaryPreOperatorAccess().getNOTEnumLiteralDeclaration_0()); 
                    // InternalAPIMappingLanguage.g:2422:1: ( 'not' )
                    // InternalAPIMappingLanguage.g:2422:3: 'not'
                    {
                    match(input,33,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getUnaryPreOperatorAccess().getNOTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:2427:6: ( ( '-' ) )
                    {
                    // InternalAPIMappingLanguage.g:2427:6: ( ( '-' ) )
                    // InternalAPIMappingLanguage.g:2428:1: ( '-' )
                    {
                     before(grammarAccess.getUnaryPreOperatorAccess().getMINUSEnumLiteralDeclaration_1()); 
                    // InternalAPIMappingLanguage.g:2429:1: ( '-' )
                    // InternalAPIMappingLanguage.g:2429:3: '-'
                    {
                    match(input,29,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getUnaryPreOperatorAccess().getMINUSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryPreOperator__Alternatives"


    // $ANTLR start "rule__PositionSelectorKind__Alternatives"
    // InternalAPIMappingLanguage.g:2439:1: rule__PositionSelectorKind__Alternatives : ( ( ( 'self' ) ) | ( ( 'first' ) ) | ( ( 'last' ) ) | ( ( 'prev' ) ) | ( ( 'next' ) ) );
    public final void rule__PositionSelectorKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2443:1: ( ( ( 'self' ) ) | ( ( 'first' ) ) | ( ( 'last' ) ) | ( ( 'prev' ) ) | ( ( 'next' ) ) )
            int alt25=5;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt25=1;
                }
                break;
            case 35:
                {
                alt25=2;
                }
                break;
            case 36:
                {
                alt25=3;
                }
                break;
            case 37:
                {
                alt25=4;
                }
                break;
            case 38:
                {
                alt25=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalAPIMappingLanguage.g:2444:1: ( ( 'self' ) )
                    {
                    // InternalAPIMappingLanguage.g:2444:1: ( ( 'self' ) )
                    // InternalAPIMappingLanguage.g:2445:1: ( 'self' )
                    {
                     before(grammarAccess.getPositionSelectorKindAccess().getSELFEnumLiteralDeclaration_0()); 
                    // InternalAPIMappingLanguage.g:2446:1: ( 'self' )
                    // InternalAPIMappingLanguage.g:2446:3: 'self'
                    {
                    match(input,34,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getPositionSelectorKindAccess().getSELFEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAPIMappingLanguage.g:2451:6: ( ( 'first' ) )
                    {
                    // InternalAPIMappingLanguage.g:2451:6: ( ( 'first' ) )
                    // InternalAPIMappingLanguage.g:2452:1: ( 'first' )
                    {
                     before(grammarAccess.getPositionSelectorKindAccess().getFIRSTEnumLiteralDeclaration_1()); 
                    // InternalAPIMappingLanguage.g:2453:1: ( 'first' )
                    // InternalAPIMappingLanguage.g:2453:3: 'first'
                    {
                    match(input,35,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getPositionSelectorKindAccess().getFIRSTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAPIMappingLanguage.g:2458:6: ( ( 'last' ) )
                    {
                    // InternalAPIMappingLanguage.g:2458:6: ( ( 'last' ) )
                    // InternalAPIMappingLanguage.g:2459:1: ( 'last' )
                    {
                     before(grammarAccess.getPositionSelectorKindAccess().getLASTEnumLiteralDeclaration_2()); 
                    // InternalAPIMappingLanguage.g:2460:1: ( 'last' )
                    // InternalAPIMappingLanguage.g:2460:3: 'last'
                    {
                    match(input,36,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getPositionSelectorKindAccess().getLASTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAPIMappingLanguage.g:2465:6: ( ( 'prev' ) )
                    {
                    // InternalAPIMappingLanguage.g:2465:6: ( ( 'prev' ) )
                    // InternalAPIMappingLanguage.g:2466:1: ( 'prev' )
                    {
                     before(grammarAccess.getPositionSelectorKindAccess().getPREVEnumLiteralDeclaration_3()); 
                    // InternalAPIMappingLanguage.g:2467:1: ( 'prev' )
                    // InternalAPIMappingLanguage.g:2467:3: 'prev'
                    {
                    match(input,37,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getPositionSelectorKindAccess().getPREVEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalAPIMappingLanguage.g:2472:6: ( ( 'next' ) )
                    {
                    // InternalAPIMappingLanguage.g:2472:6: ( ( 'next' ) )
                    // InternalAPIMappingLanguage.g:2473:1: ( 'next' )
                    {
                     before(grammarAccess.getPositionSelectorKindAccess().getNEXTEnumLiteralDeclaration_4()); 
                    // InternalAPIMappingLanguage.g:2474:1: ( 'next' )
                    // InternalAPIMappingLanguage.g:2474:3: 'next'
                    {
                    match(input,38,FollowSets000.FOLLOW_2); 

                    }

                     after(grammarAccess.getPositionSelectorKindAccess().getNEXTEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionSelectorKind__Alternatives"


    // $ANTLR start "rule__MappingRepository__Group__0"
    // InternalAPIMappingLanguage.g:2486:1: rule__MappingRepository__Group__0 : rule__MappingRepository__Group__0__Impl rule__MappingRepository__Group__1 ;
    public final void rule__MappingRepository__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2490:1: ( rule__MappingRepository__Group__0__Impl rule__MappingRepository__Group__1 )
            // InternalAPIMappingLanguage.g:2491:2: rule__MappingRepository__Group__0__Impl rule__MappingRepository__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__MappingRepository__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__MappingRepository__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRepository__Group__0"


    // $ANTLR start "rule__MappingRepository__Group__0__Impl"
    // InternalAPIMappingLanguage.g:2498:1: rule__MappingRepository__Group__0__Impl : ( ( rule__MappingRepository__ImportsAssignment_0 )* ) ;
    public final void rule__MappingRepository__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2502:1: ( ( ( rule__MappingRepository__ImportsAssignment_0 )* ) )
            // InternalAPIMappingLanguage.g:2503:1: ( ( rule__MappingRepository__ImportsAssignment_0 )* )
            {
            // InternalAPIMappingLanguage.g:2503:1: ( ( rule__MappingRepository__ImportsAssignment_0 )* )
            // InternalAPIMappingLanguage.g:2504:1: ( rule__MappingRepository__ImportsAssignment_0 )*
            {
             before(grammarAccess.getMappingRepositoryAccess().getImportsAssignment_0()); 
            // InternalAPIMappingLanguage.g:2505:1: ( rule__MappingRepository__ImportsAssignment_0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==44) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalAPIMappingLanguage.g:2505:2: rule__MappingRepository__ImportsAssignment_0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    rule__MappingRepository__ImportsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getMappingRepositoryAccess().getImportsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRepository__Group__0__Impl"


    // $ANTLR start "rule__MappingRepository__Group__1"
    // InternalAPIMappingLanguage.g:2515:1: rule__MappingRepository__Group__1 : rule__MappingRepository__Group__1__Impl rule__MappingRepository__Group__2 ;
    public final void rule__MappingRepository__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2519:1: ( rule__MappingRepository__Group__1__Impl rule__MappingRepository__Group__2 )
            // InternalAPIMappingLanguage.g:2520:2: rule__MappingRepository__Group__1__Impl rule__MappingRepository__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__MappingRepository__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__MappingRepository__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRepository__Group__1"


    // $ANTLR start "rule__MappingRepository__Group__1__Impl"
    // InternalAPIMappingLanguage.g:2527:1: rule__MappingRepository__Group__1__Impl : ( 'MappingRepository:' ) ;
    public final void rule__MappingRepository__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2531:1: ( ( 'MappingRepository:' ) )
            // InternalAPIMappingLanguage.g:2532:1: ( 'MappingRepository:' )
            {
            // InternalAPIMappingLanguage.g:2532:1: ( 'MappingRepository:' )
            // InternalAPIMappingLanguage.g:2533:1: 'MappingRepository:'
            {
             before(grammarAccess.getMappingRepositoryAccess().getMappingRepositoryKeyword_1()); 
            match(input,39,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getMappingRepositoryAccess().getMappingRepositoryKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRepository__Group__1__Impl"


    // $ANTLR start "rule__MappingRepository__Group__2"
    // InternalAPIMappingLanguage.g:2546:1: rule__MappingRepository__Group__2 : rule__MappingRepository__Group__2__Impl rule__MappingRepository__Group__3 ;
    public final void rule__MappingRepository__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2550:1: ( rule__MappingRepository__Group__2__Impl rule__MappingRepository__Group__3 )
            // InternalAPIMappingLanguage.g:2551:2: rule__MappingRepository__Group__2__Impl rule__MappingRepository__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__MappingRepository__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__MappingRepository__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRepository__Group__2"


    // $ANTLR start "rule__MappingRepository__Group__2__Impl"
    // InternalAPIMappingLanguage.g:2558:1: rule__MappingRepository__Group__2__Impl : ( ( rule__MappingRepository__NameAssignment_2 ) ) ;
    public final void rule__MappingRepository__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2562:1: ( ( ( rule__MappingRepository__NameAssignment_2 ) ) )
            // InternalAPIMappingLanguage.g:2563:1: ( ( rule__MappingRepository__NameAssignment_2 ) )
            {
            // InternalAPIMappingLanguage.g:2563:1: ( ( rule__MappingRepository__NameAssignment_2 ) )
            // InternalAPIMappingLanguage.g:2564:1: ( rule__MappingRepository__NameAssignment_2 )
            {
             before(grammarAccess.getMappingRepositoryAccess().getNameAssignment_2()); 
            // InternalAPIMappingLanguage.g:2565:1: ( rule__MappingRepository__NameAssignment_2 )
            // InternalAPIMappingLanguage.g:2565:2: rule__MappingRepository__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MappingRepository__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMappingRepositoryAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRepository__Group__2__Impl"


    // $ANTLR start "rule__MappingRepository__Group__3"
    // InternalAPIMappingLanguage.g:2575:1: rule__MappingRepository__Group__3 : rule__MappingRepository__Group__3__Impl rule__MappingRepository__Group__4 ;
    public final void rule__MappingRepository__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2579:1: ( rule__MappingRepository__Group__3__Impl rule__MappingRepository__Group__4 )
            // InternalAPIMappingLanguage.g:2580:2: rule__MappingRepository__Group__3__Impl rule__MappingRepository__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__MappingRepository__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__MappingRepository__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRepository__Group__3"


    // $ANTLR start "rule__MappingRepository__Group__3__Impl"
    // InternalAPIMappingLanguage.g:2587:1: rule__MappingRepository__Group__3__Impl : ( '{' ) ;
    public final void rule__MappingRepository__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2591:1: ( ( '{' ) )
            // InternalAPIMappingLanguage.g:2592:1: ( '{' )
            {
            // InternalAPIMappingLanguage.g:2592:1: ( '{' )
            // InternalAPIMappingLanguage.g:2593:1: '{'
            {
             before(grammarAccess.getMappingRepositoryAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,40,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getMappingRepositoryAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRepository__Group__3__Impl"


    // $ANTLR start "rule__MappingRepository__Group__4"
    // InternalAPIMappingLanguage.g:2606:1: rule__MappingRepository__Group__4 : rule__MappingRepository__Group__4__Impl rule__MappingRepository__Group__5 ;
    public final void rule__MappingRepository__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2610:1: ( rule__MappingRepository__Group__4__Impl rule__MappingRepository__Group__5 )
            // InternalAPIMappingLanguage.g:2611:2: rule__MappingRepository__Group__4__Impl rule__MappingRepository__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__MappingRepository__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__MappingRepository__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRepository__Group__4"


    // $ANTLR start "rule__MappingRepository__Group__4__Impl"
    // InternalAPIMappingLanguage.g:2618:1: rule__MappingRepository__Group__4__Impl : ( ( rule__MappingRepository__Group_4__0 )? ) ;
    public final void rule__MappingRepository__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2622:1: ( ( ( rule__MappingRepository__Group_4__0 )? ) )
            // InternalAPIMappingLanguage.g:2623:1: ( ( rule__MappingRepository__Group_4__0 )? )
            {
            // InternalAPIMappingLanguage.g:2623:1: ( ( rule__MappingRepository__Group_4__0 )? )
            // InternalAPIMappingLanguage.g:2624:1: ( rule__MappingRepository__Group_4__0 )?
            {
             before(grammarAccess.getMappingRepositoryAccess().getGroup_4()); 
            // InternalAPIMappingLanguage.g:2625:1: ( rule__MappingRepository__Group_4__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==45) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalAPIMappingLanguage.g:2625:2: rule__MappingRepository__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__MappingRepository__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMappingRepositoryAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRepository__Group__4__Impl"


    // $ANTLR start "rule__MappingRepository__Group__5"
    // InternalAPIMappingLanguage.g:2635:1: rule__MappingRepository__Group__5 : rule__MappingRepository__Group__5__Impl rule__MappingRepository__Group__6 ;
    public final void rule__MappingRepository__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2639:1: ( rule__MappingRepository__Group__5__Impl rule__MappingRepository__Group__6 )
            // InternalAPIMappingLanguage.g:2640:2: rule__MappingRepository__Group__5__Impl rule__MappingRepository__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__MappingRepository__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__MappingRepository__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRepository__Group__5"


    // $ANTLR start "rule__MappingRepository__Group__5__Impl"
    // InternalAPIMappingLanguage.g:2647:1: rule__MappingRepository__Group__5__Impl : ( '}' ) ;
    public final void rule__MappingRepository__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2651:1: ( ( '}' ) )
            // InternalAPIMappingLanguage.g:2652:1: ( '}' )
            {
            // InternalAPIMappingLanguage.g:2652:1: ( '}' )
            // InternalAPIMappingLanguage.g:2653:1: '}'
            {
             before(grammarAccess.getMappingRepositoryAccess().getRightCurlyBracketKeyword_5()); 
            match(input,41,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getMappingRepositoryAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRepository__Group__5__Impl"


    // $ANTLR start "rule__MappingRepository__Group__6"
    // InternalAPIMappingLanguage.g:2666:1: rule__MappingRepository__Group__6 : rule__MappingRepository__Group__6__Impl ;
    public final void rule__MappingRepository__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2670:1: ( rule__MappingRepository__Group__6__Impl )
            // InternalAPIMappingLanguage.g:2671:2: rule__MappingRepository__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MappingRepository__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRepository__Group__6"


    // $ANTLR start "rule__MappingRepository__Group__6__Impl"
    // InternalAPIMappingLanguage.g:2677:1: rule__MappingRepository__Group__6__Impl : ( ( rule__MappingRepository__Group_6__0 )? ) ;
    public final void rule__MappingRepository__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2681:1: ( ( ( rule__MappingRepository__Group_6__0 )? ) )
            // InternalAPIMappingLanguage.g:2682:1: ( ( rule__MappingRepository__Group_6__0 )? )
            {
            // InternalAPIMappingLanguage.g:2682:1: ( ( rule__MappingRepository__Group_6__0 )? )
            // InternalAPIMappingLanguage.g:2683:1: ( rule__MappingRepository__Group_6__0 )?
            {
             before(grammarAccess.getMappingRepositoryAccess().getGroup_6()); 
            // InternalAPIMappingLanguage.g:2684:1: ( rule__MappingRepository__Group_6__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==43) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalAPIMappingLanguage.g:2684:2: rule__MappingRepository__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__MappingRepository__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMappingRepositoryAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRepository__Group__6__Impl"


    // $ANTLR start "rule__MappingRepository__Group_4__0"
    // InternalAPIMappingLanguage.g:2708:1: rule__MappingRepository__Group_4__0 : rule__MappingRepository__Group_4__0__Impl rule__MappingRepository__Group_4__1 ;
    public final void rule__MappingRepository__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2712:1: ( rule__MappingRepository__Group_4__0__Impl rule__MappingRepository__Group_4__1 )
            // InternalAPIMappingLanguage.g:2713:2: rule__MappingRepository__Group_4__0__Impl rule__MappingRepository__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__MappingRepository__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__MappingRepository__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRepository__Group_4__0"


    // $ANTLR start "rule__MappingRepository__Group_4__0__Impl"
    // InternalAPIMappingLanguage.g:2720:1: rule__MappingRepository__Group_4__0__Impl : ( ( rule__MappingRepository__PortApiMappingsAssignment_4_0 ) ) ;
    public final void rule__MappingRepository__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2724:1: ( ( ( rule__MappingRepository__PortApiMappingsAssignment_4_0 ) ) )
            // InternalAPIMappingLanguage.g:2725:1: ( ( rule__MappingRepository__PortApiMappingsAssignment_4_0 ) )
            {
            // InternalAPIMappingLanguage.g:2725:1: ( ( rule__MappingRepository__PortApiMappingsAssignment_4_0 ) )
            // InternalAPIMappingLanguage.g:2726:1: ( rule__MappingRepository__PortApiMappingsAssignment_4_0 )
            {
             before(grammarAccess.getMappingRepositoryAccess().getPortApiMappingsAssignment_4_0()); 
            // InternalAPIMappingLanguage.g:2727:1: ( rule__MappingRepository__PortApiMappingsAssignment_4_0 )
            // InternalAPIMappingLanguage.g:2727:2: rule__MappingRepository__PortApiMappingsAssignment_4_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MappingRepository__PortApiMappingsAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getMappingRepositoryAccess().getPortApiMappingsAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRepository__Group_4__0__Impl"


    // $ANTLR start "rule__MappingRepository__Group_4__1"
    // InternalAPIMappingLanguage.g:2737:1: rule__MappingRepository__Group_4__1 : rule__MappingRepository__Group_4__1__Impl ;
    public final void rule__MappingRepository__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2741:1: ( rule__MappingRepository__Group_4__1__Impl )
            // InternalAPIMappingLanguage.g:2742:2: rule__MappingRepository__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MappingRepository__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRepository__Group_4__1"


    // $ANTLR start "rule__MappingRepository__Group_4__1__Impl"
    // InternalAPIMappingLanguage.g:2748:1: rule__MappingRepository__Group_4__1__Impl : ( ( rule__MappingRepository__Group_4_1__0 )* ) ;
    public final void rule__MappingRepository__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2752:1: ( ( ( rule__MappingRepository__Group_4_1__0 )* ) )
            // InternalAPIMappingLanguage.g:2753:1: ( ( rule__MappingRepository__Group_4_1__0 )* )
            {
            // InternalAPIMappingLanguage.g:2753:1: ( ( rule__MappingRepository__Group_4_1__0 )* )
            // InternalAPIMappingLanguage.g:2754:1: ( rule__MappingRepository__Group_4_1__0 )*
            {
             before(grammarAccess.getMappingRepositoryAccess().getGroup_4_1()); 
            // InternalAPIMappingLanguage.g:2755:1: ( rule__MappingRepository__Group_4_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==42) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalAPIMappingLanguage.g:2755:2: rule__MappingRepository__Group_4_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_10);
            	    rule__MappingRepository__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getMappingRepositoryAccess().getGroup_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRepository__Group_4__1__Impl"


    // $ANTLR start "rule__MappingRepository__Group_4_1__0"
    // InternalAPIMappingLanguage.g:2769:1: rule__MappingRepository__Group_4_1__0 : rule__MappingRepository__Group_4_1__0__Impl rule__MappingRepository__Group_4_1__1 ;
    public final void rule__MappingRepository__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2773:1: ( rule__MappingRepository__Group_4_1__0__Impl rule__MappingRepository__Group_4_1__1 )
            // InternalAPIMappingLanguage.g:2774:2: rule__MappingRepository__Group_4_1__0__Impl rule__MappingRepository__Group_4_1__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__MappingRepository__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__MappingRepository__Group_4_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRepository__Group_4_1__0"


    // $ANTLR start "rule__MappingRepository__Group_4_1__0__Impl"
    // InternalAPIMappingLanguage.g:2781:1: rule__MappingRepository__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__MappingRepository__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2785:1: ( ( ',' ) )
            // InternalAPIMappingLanguage.g:2786:1: ( ',' )
            {
            // InternalAPIMappingLanguage.g:2786:1: ( ',' )
            // InternalAPIMappingLanguage.g:2787:1: ','
            {
             before(grammarAccess.getMappingRepositoryAccess().getCommaKeyword_4_1_0()); 
            match(input,42,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getMappingRepositoryAccess().getCommaKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRepository__Group_4_1__0__Impl"


    // $ANTLR start "rule__MappingRepository__Group_4_1__1"
    // InternalAPIMappingLanguage.g:2800:1: rule__MappingRepository__Group_4_1__1 : rule__MappingRepository__Group_4_1__1__Impl ;
    public final void rule__MappingRepository__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2804:1: ( rule__MappingRepository__Group_4_1__1__Impl )
            // InternalAPIMappingLanguage.g:2805:2: rule__MappingRepository__Group_4_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MappingRepository__Group_4_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRepository__Group_4_1__1"


    // $ANTLR start "rule__MappingRepository__Group_4_1__1__Impl"
    // InternalAPIMappingLanguage.g:2811:1: rule__MappingRepository__Group_4_1__1__Impl : ( ( rule__MappingRepository__PortApiMappingsAssignment_4_1_1 ) ) ;
    public final void rule__MappingRepository__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2815:1: ( ( ( rule__MappingRepository__PortApiMappingsAssignment_4_1_1 ) ) )
            // InternalAPIMappingLanguage.g:2816:1: ( ( rule__MappingRepository__PortApiMappingsAssignment_4_1_1 ) )
            {
            // InternalAPIMappingLanguage.g:2816:1: ( ( rule__MappingRepository__PortApiMappingsAssignment_4_1_1 ) )
            // InternalAPIMappingLanguage.g:2817:1: ( rule__MappingRepository__PortApiMappingsAssignment_4_1_1 )
            {
             before(grammarAccess.getMappingRepositoryAccess().getPortApiMappingsAssignment_4_1_1()); 
            // InternalAPIMappingLanguage.g:2818:1: ( rule__MappingRepository__PortApiMappingsAssignment_4_1_1 )
            // InternalAPIMappingLanguage.g:2818:2: rule__MappingRepository__PortApiMappingsAssignment_4_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MappingRepository__PortApiMappingsAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingRepositoryAccess().getPortApiMappingsAssignment_4_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRepository__Group_4_1__1__Impl"


    // $ANTLR start "rule__MappingRepository__Group_6__0"
    // InternalAPIMappingLanguage.g:2832:1: rule__MappingRepository__Group_6__0 : rule__MappingRepository__Group_6__0__Impl rule__MappingRepository__Group_6__1 ;
    public final void rule__MappingRepository__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2836:1: ( rule__MappingRepository__Group_6__0__Impl rule__MappingRepository__Group_6__1 )
            // InternalAPIMappingLanguage.g:2837:2: rule__MappingRepository__Group_6__0__Impl rule__MappingRepository__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__MappingRepository__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__MappingRepository__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRepository__Group_6__0"


    // $ANTLR start "rule__MappingRepository__Group_6__0__Impl"
    // InternalAPIMappingLanguage.g:2844:1: rule__MappingRepository__Group_6__0__Impl : ( '#' ) ;
    public final void rule__MappingRepository__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2848:1: ( ( '#' ) )
            // InternalAPIMappingLanguage.g:2849:1: ( '#' )
            {
            // InternalAPIMappingLanguage.g:2849:1: ( '#' )
            // InternalAPIMappingLanguage.g:2850:1: '#'
            {
             before(grammarAccess.getMappingRepositoryAccess().getNumberSignKeyword_6_0()); 
            match(input,43,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getMappingRepositoryAccess().getNumberSignKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRepository__Group_6__0__Impl"


    // $ANTLR start "rule__MappingRepository__Group_6__1"
    // InternalAPIMappingLanguage.g:2863:1: rule__MappingRepository__Group_6__1 : rule__MappingRepository__Group_6__1__Impl ;
    public final void rule__MappingRepository__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2867:1: ( rule__MappingRepository__Group_6__1__Impl )
            // InternalAPIMappingLanguage.g:2868:2: rule__MappingRepository__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MappingRepository__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRepository__Group_6__1"


    // $ANTLR start "rule__MappingRepository__Group_6__1__Impl"
    // InternalAPIMappingLanguage.g:2874:1: rule__MappingRepository__Group_6__1__Impl : ( ( rule__MappingRepository__CommentAssignment_6_1 ) ) ;
    public final void rule__MappingRepository__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2878:1: ( ( ( rule__MappingRepository__CommentAssignment_6_1 ) ) )
            // InternalAPIMappingLanguage.g:2879:1: ( ( rule__MappingRepository__CommentAssignment_6_1 ) )
            {
            // InternalAPIMappingLanguage.g:2879:1: ( ( rule__MappingRepository__CommentAssignment_6_1 ) )
            // InternalAPIMappingLanguage.g:2880:1: ( rule__MappingRepository__CommentAssignment_6_1 )
            {
             before(grammarAccess.getMappingRepositoryAccess().getCommentAssignment_6_1()); 
            // InternalAPIMappingLanguage.g:2881:1: ( rule__MappingRepository__CommentAssignment_6_1 )
            // InternalAPIMappingLanguage.g:2881:2: rule__MappingRepository__CommentAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MappingRepository__CommentAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingRepositoryAccess().getCommentAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRepository__Group_6__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalAPIMappingLanguage.g:2895:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2899:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalAPIMappingLanguage.g:2900:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalAPIMappingLanguage.g:2907:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2911:1: ( ( 'import' ) )
            // InternalAPIMappingLanguage.g:2912:1: ( 'import' )
            {
            // InternalAPIMappingLanguage.g:2912:1: ( 'import' )
            // InternalAPIMappingLanguage.g:2913:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,44,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalAPIMappingLanguage.g:2926:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2930:1: ( rule__Import__Group__1__Impl )
            // InternalAPIMappingLanguage.g:2931:2: rule__Import__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Import__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalAPIMappingLanguage.g:2937:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportURIAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2941:1: ( ( ( rule__Import__ImportURIAssignment_1 ) ) )
            // InternalAPIMappingLanguage.g:2942:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            {
            // InternalAPIMappingLanguage.g:2942:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            // InternalAPIMappingLanguage.g:2943:1: ( rule__Import__ImportURIAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            // InternalAPIMappingLanguage.g:2944:1: ( rule__Import__ImportURIAssignment_1 )
            // InternalAPIMappingLanguage.g:2944:2: rule__Import__ImportURIAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Import__ImportURIAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportURIAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__PortApiMapping__Group__0"
    // InternalAPIMappingLanguage.g:2958:1: rule__PortApiMapping__Group__0 : rule__PortApiMapping__Group__0__Impl rule__PortApiMapping__Group__1 ;
    public final void rule__PortApiMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2962:1: ( rule__PortApiMapping__Group__0__Impl rule__PortApiMapping__Group__1 )
            // InternalAPIMappingLanguage.g:2963:2: rule__PortApiMapping__Group__0__Impl rule__PortApiMapping__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__PortApiMapping__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__PortApiMapping__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortApiMapping__Group__0"


    // $ANTLR start "rule__PortApiMapping__Group__0__Impl"
    // InternalAPIMappingLanguage.g:2970:1: rule__PortApiMapping__Group__0__Impl : ( 'PortInstance:' ) ;
    public final void rule__PortApiMapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2974:1: ( ( 'PortInstance:' ) )
            // InternalAPIMappingLanguage.g:2975:1: ( 'PortInstance:' )
            {
            // InternalAPIMappingLanguage.g:2975:1: ( 'PortInstance:' )
            // InternalAPIMappingLanguage.g:2976:1: 'PortInstance:'
            {
             before(grammarAccess.getPortApiMappingAccess().getPortInstanceKeyword_0()); 
            match(input,45,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPortApiMappingAccess().getPortInstanceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortApiMapping__Group__0__Impl"


    // $ANTLR start "rule__PortApiMapping__Group__1"
    // InternalAPIMappingLanguage.g:2989:1: rule__PortApiMapping__Group__1 : rule__PortApiMapping__Group__1__Impl rule__PortApiMapping__Group__2 ;
    public final void rule__PortApiMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:2993:1: ( rule__PortApiMapping__Group__1__Impl rule__PortApiMapping__Group__2 )
            // InternalAPIMappingLanguage.g:2994:2: rule__PortApiMapping__Group__1__Impl rule__PortApiMapping__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__PortApiMapping__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__PortApiMapping__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortApiMapping__Group__1"


    // $ANTLR start "rule__PortApiMapping__Group__1__Impl"
    // InternalAPIMappingLanguage.g:3001:1: rule__PortApiMapping__Group__1__Impl : ( ( rule__PortApiMapping__PortAssignment_1 ) ) ;
    public final void rule__PortApiMapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3005:1: ( ( ( rule__PortApiMapping__PortAssignment_1 ) ) )
            // InternalAPIMappingLanguage.g:3006:1: ( ( rule__PortApiMapping__PortAssignment_1 ) )
            {
            // InternalAPIMappingLanguage.g:3006:1: ( ( rule__PortApiMapping__PortAssignment_1 ) )
            // InternalAPIMappingLanguage.g:3007:1: ( rule__PortApiMapping__PortAssignment_1 )
            {
             before(grammarAccess.getPortApiMappingAccess().getPortAssignment_1()); 
            // InternalAPIMappingLanguage.g:3008:1: ( rule__PortApiMapping__PortAssignment_1 )
            // InternalAPIMappingLanguage.g:3008:2: rule__PortApiMapping__PortAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PortApiMapping__PortAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPortApiMappingAccess().getPortAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortApiMapping__Group__1__Impl"


    // $ANTLR start "rule__PortApiMapping__Group__2"
    // InternalAPIMappingLanguage.g:3018:1: rule__PortApiMapping__Group__2 : rule__PortApiMapping__Group__2__Impl rule__PortApiMapping__Group__3 ;
    public final void rule__PortApiMapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3022:1: ( rule__PortApiMapping__Group__2__Impl rule__PortApiMapping__Group__3 )
            // InternalAPIMappingLanguage.g:3023:2: rule__PortApiMapping__Group__2__Impl rule__PortApiMapping__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__PortApiMapping__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__PortApiMapping__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortApiMapping__Group__2"


    // $ANTLR start "rule__PortApiMapping__Group__2__Impl"
    // InternalAPIMappingLanguage.g:3030:1: rule__PortApiMapping__Group__2__Impl : ( '{' ) ;
    public final void rule__PortApiMapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3034:1: ( ( '{' ) )
            // InternalAPIMappingLanguage.g:3035:1: ( '{' )
            {
            // InternalAPIMappingLanguage.g:3035:1: ( '{' )
            // InternalAPIMappingLanguage.g:3036:1: '{'
            {
             before(grammarAccess.getPortApiMappingAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,40,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPortApiMappingAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortApiMapping__Group__2__Impl"


    // $ANTLR start "rule__PortApiMapping__Group__3"
    // InternalAPIMappingLanguage.g:3049:1: rule__PortApiMapping__Group__3 : rule__PortApiMapping__Group__3__Impl rule__PortApiMapping__Group__4 ;
    public final void rule__PortApiMapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3053:1: ( rule__PortApiMapping__Group__3__Impl rule__PortApiMapping__Group__4 )
            // InternalAPIMappingLanguage.g:3054:2: rule__PortApiMapping__Group__3__Impl rule__PortApiMapping__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__PortApiMapping__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__PortApiMapping__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortApiMapping__Group__3"


    // $ANTLR start "rule__PortApiMapping__Group__3__Impl"
    // InternalAPIMappingLanguage.g:3061:1: rule__PortApiMapping__Group__3__Impl : ( 'execCommand:' ) ;
    public final void rule__PortApiMapping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3065:1: ( ( 'execCommand:' ) )
            // InternalAPIMappingLanguage.g:3066:1: ( 'execCommand:' )
            {
            // InternalAPIMappingLanguage.g:3066:1: ( 'execCommand:' )
            // InternalAPIMappingLanguage.g:3067:1: 'execCommand:'
            {
             before(grammarAccess.getPortApiMappingAccess().getExecCommandKeyword_3()); 
            match(input,46,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPortApiMappingAccess().getExecCommandKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortApiMapping__Group__3__Impl"


    // $ANTLR start "rule__PortApiMapping__Group__4"
    // InternalAPIMappingLanguage.g:3080:1: rule__PortApiMapping__Group__4 : rule__PortApiMapping__Group__4__Impl rule__PortApiMapping__Group__5 ;
    public final void rule__PortApiMapping__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3084:1: ( rule__PortApiMapping__Group__4__Impl rule__PortApiMapping__Group__5 )
            // InternalAPIMappingLanguage.g:3085:2: rule__PortApiMapping__Group__4__Impl rule__PortApiMapping__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__PortApiMapping__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__PortApiMapping__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortApiMapping__Group__4"


    // $ANTLR start "rule__PortApiMapping__Group__4__Impl"
    // InternalAPIMappingLanguage.g:3092:1: rule__PortApiMapping__Group__4__Impl : ( ( rule__PortApiMapping__ExecCommandAssignment_4 ) ) ;
    public final void rule__PortApiMapping__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3096:1: ( ( ( rule__PortApiMapping__ExecCommandAssignment_4 ) ) )
            // InternalAPIMappingLanguage.g:3097:1: ( ( rule__PortApiMapping__ExecCommandAssignment_4 ) )
            {
            // InternalAPIMappingLanguage.g:3097:1: ( ( rule__PortApiMapping__ExecCommandAssignment_4 ) )
            // InternalAPIMappingLanguage.g:3098:1: ( rule__PortApiMapping__ExecCommandAssignment_4 )
            {
             before(grammarAccess.getPortApiMappingAccess().getExecCommandAssignment_4()); 
            // InternalAPIMappingLanguage.g:3099:1: ( rule__PortApiMapping__ExecCommandAssignment_4 )
            // InternalAPIMappingLanguage.g:3099:2: rule__PortApiMapping__ExecCommandAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PortApiMapping__ExecCommandAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPortApiMappingAccess().getExecCommandAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortApiMapping__Group__4__Impl"


    // $ANTLR start "rule__PortApiMapping__Group__5"
    // InternalAPIMappingLanguage.g:3109:1: rule__PortApiMapping__Group__5 : rule__PortApiMapping__Group__5__Impl rule__PortApiMapping__Group__6 ;
    public final void rule__PortApiMapping__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3113:1: ( rule__PortApiMapping__Group__5__Impl rule__PortApiMapping__Group__6 )
            // InternalAPIMappingLanguage.g:3114:2: rule__PortApiMapping__Group__5__Impl rule__PortApiMapping__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__PortApiMapping__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__PortApiMapping__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortApiMapping__Group__5"


    // $ANTLR start "rule__PortApiMapping__Group__5__Impl"
    // InternalAPIMappingLanguage.g:3121:1: rule__PortApiMapping__Group__5__Impl : ( ( rule__PortApiMapping__Group_5__0 )? ) ;
    public final void rule__PortApiMapping__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3125:1: ( ( ( rule__PortApiMapping__Group_5__0 )? ) )
            // InternalAPIMappingLanguage.g:3126:1: ( ( rule__PortApiMapping__Group_5__0 )? )
            {
            // InternalAPIMappingLanguage.g:3126:1: ( ( rule__PortApiMapping__Group_5__0 )? )
            // InternalAPIMappingLanguage.g:3127:1: ( rule__PortApiMapping__Group_5__0 )?
            {
             before(grammarAccess.getPortApiMappingAccess().getGroup_5()); 
            // InternalAPIMappingLanguage.g:3128:1: ( rule__PortApiMapping__Group_5__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==47) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalAPIMappingLanguage.g:3128:2: rule__PortApiMapping__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__PortApiMapping__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPortApiMappingAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortApiMapping__Group__5__Impl"


    // $ANTLR start "rule__PortApiMapping__Group__6"
    // InternalAPIMappingLanguage.g:3138:1: rule__PortApiMapping__Group__6 : rule__PortApiMapping__Group__6__Impl ;
    public final void rule__PortApiMapping__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3142:1: ( rule__PortApiMapping__Group__6__Impl )
            // InternalAPIMappingLanguage.g:3143:2: rule__PortApiMapping__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PortApiMapping__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortApiMapping__Group__6"


    // $ANTLR start "rule__PortApiMapping__Group__6__Impl"
    // InternalAPIMappingLanguage.g:3149:1: rule__PortApiMapping__Group__6__Impl : ( '}' ) ;
    public final void rule__PortApiMapping__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3153:1: ( ( '}' ) )
            // InternalAPIMappingLanguage.g:3154:1: ( '}' )
            {
            // InternalAPIMappingLanguage.g:3154:1: ( '}' )
            // InternalAPIMappingLanguage.g:3155:1: '}'
            {
             before(grammarAccess.getPortApiMappingAccess().getRightCurlyBracketKeyword_6()); 
            match(input,41,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPortApiMappingAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortApiMapping__Group__6__Impl"


    // $ANTLR start "rule__PortApiMapping__Group_5__0"
    // InternalAPIMappingLanguage.g:3182:1: rule__PortApiMapping__Group_5__0 : rule__PortApiMapping__Group_5__0__Impl rule__PortApiMapping__Group_5__1 ;
    public final void rule__PortApiMapping__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3186:1: ( rule__PortApiMapping__Group_5__0__Impl rule__PortApiMapping__Group_5__1 )
            // InternalAPIMappingLanguage.g:3187:2: rule__PortApiMapping__Group_5__0__Impl rule__PortApiMapping__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__PortApiMapping__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__PortApiMapping__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortApiMapping__Group_5__0"


    // $ANTLR start "rule__PortApiMapping__Group_5__0__Impl"
    // InternalAPIMappingLanguage.g:3194:1: rule__PortApiMapping__Group_5__0__Impl : ( 'initCommand:' ) ;
    public final void rule__PortApiMapping__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3198:1: ( ( 'initCommand:' ) )
            // InternalAPIMappingLanguage.g:3199:1: ( 'initCommand:' )
            {
            // InternalAPIMappingLanguage.g:3199:1: ( 'initCommand:' )
            // InternalAPIMappingLanguage.g:3200:1: 'initCommand:'
            {
             before(grammarAccess.getPortApiMappingAccess().getInitCommandKeyword_5_0()); 
            match(input,47,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPortApiMappingAccess().getInitCommandKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortApiMapping__Group_5__0__Impl"


    // $ANTLR start "rule__PortApiMapping__Group_5__1"
    // InternalAPIMappingLanguage.g:3213:1: rule__PortApiMapping__Group_5__1 : rule__PortApiMapping__Group_5__1__Impl ;
    public final void rule__PortApiMapping__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3217:1: ( rule__PortApiMapping__Group_5__1__Impl )
            // InternalAPIMappingLanguage.g:3218:2: rule__PortApiMapping__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PortApiMapping__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortApiMapping__Group_5__1"


    // $ANTLR start "rule__PortApiMapping__Group_5__1__Impl"
    // InternalAPIMappingLanguage.g:3224:1: rule__PortApiMapping__Group_5__1__Impl : ( ( rule__PortApiMapping__InitCommandAssignment_5_1 ) ) ;
    public final void rule__PortApiMapping__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3228:1: ( ( ( rule__PortApiMapping__InitCommandAssignment_5_1 ) ) )
            // InternalAPIMappingLanguage.g:3229:1: ( ( rule__PortApiMapping__InitCommandAssignment_5_1 ) )
            {
            // InternalAPIMappingLanguage.g:3229:1: ( ( rule__PortApiMapping__InitCommandAssignment_5_1 ) )
            // InternalAPIMappingLanguage.g:3230:1: ( rule__PortApiMapping__InitCommandAssignment_5_1 )
            {
             before(grammarAccess.getPortApiMappingAccess().getInitCommandAssignment_5_1()); 
            // InternalAPIMappingLanguage.g:3231:1: ( rule__PortApiMapping__InitCommandAssignment_5_1 )
            // InternalAPIMappingLanguage.g:3231:2: rule__PortApiMapping__InitCommandAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PortApiMapping__InitCommandAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getPortApiMappingAccess().getInitCommandAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortApiMapping__Group_5__1__Impl"


    // $ANTLR start "rule__EnumerationValueExpression__Group__0"
    // InternalAPIMappingLanguage.g:3245:1: rule__EnumerationValueExpression__Group__0 : rule__EnumerationValueExpression__Group__0__Impl rule__EnumerationValueExpression__Group__1 ;
    public final void rule__EnumerationValueExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3249:1: ( rule__EnumerationValueExpression__Group__0__Impl rule__EnumerationValueExpression__Group__1 )
            // InternalAPIMappingLanguage.g:3250:2: rule__EnumerationValueExpression__Group__0__Impl rule__EnumerationValueExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__EnumerationValueExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumerationValueExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueExpression__Group__0"


    // $ANTLR start "rule__EnumerationValueExpression__Group__0__Impl"
    // InternalAPIMappingLanguage.g:3257:1: rule__EnumerationValueExpression__Group__0__Impl : ( 'enum:' ) ;
    public final void rule__EnumerationValueExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3261:1: ( ( 'enum:' ) )
            // InternalAPIMappingLanguage.g:3262:1: ( 'enum:' )
            {
            // InternalAPIMappingLanguage.g:3262:1: ( 'enum:' )
            // InternalAPIMappingLanguage.g:3263:1: 'enum:'
            {
             before(grammarAccess.getEnumerationValueExpressionAccess().getEnumKeyword_0()); 
            match(input,48,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getEnumerationValueExpressionAccess().getEnumKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueExpression__Group__0__Impl"


    // $ANTLR start "rule__EnumerationValueExpression__Group__1"
    // InternalAPIMappingLanguage.g:3276:1: rule__EnumerationValueExpression__Group__1 : rule__EnumerationValueExpression__Group__1__Impl ;
    public final void rule__EnumerationValueExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3280:1: ( rule__EnumerationValueExpression__Group__1__Impl )
            // InternalAPIMappingLanguage.g:3281:2: rule__EnumerationValueExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumerationValueExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueExpression__Group__1"


    // $ANTLR start "rule__EnumerationValueExpression__Group__1__Impl"
    // InternalAPIMappingLanguage.g:3287:1: rule__EnumerationValueExpression__Group__1__Impl : ( ( rule__EnumerationValueExpression__EnumValueAssignment_1 ) ) ;
    public final void rule__EnumerationValueExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3291:1: ( ( ( rule__EnumerationValueExpression__EnumValueAssignment_1 ) ) )
            // InternalAPIMappingLanguage.g:3292:1: ( ( rule__EnumerationValueExpression__EnumValueAssignment_1 ) )
            {
            // InternalAPIMappingLanguage.g:3292:1: ( ( rule__EnumerationValueExpression__EnumValueAssignment_1 ) )
            // InternalAPIMappingLanguage.g:3293:1: ( rule__EnumerationValueExpression__EnumValueAssignment_1 )
            {
             before(grammarAccess.getEnumerationValueExpressionAccess().getEnumValueAssignment_1()); 
            // InternalAPIMappingLanguage.g:3294:1: ( rule__EnumerationValueExpression__EnumValueAssignment_1 )
            // InternalAPIMappingLanguage.g:3294:2: rule__EnumerationValueExpression__EnumValueAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EnumerationValueExpression__EnumValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationValueExpressionAccess().getEnumValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueExpression__Group__1__Impl"


    // $ANTLR start "rule__APICallExpression__Group__0"
    // InternalAPIMappingLanguage.g:3308:1: rule__APICallExpression__Group__0 : rule__APICallExpression__Group__0__Impl rule__APICallExpression__Group__1 ;
    public final void rule__APICallExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3312:1: ( rule__APICallExpression__Group__0__Impl rule__APICallExpression__Group__1 )
            // InternalAPIMappingLanguage.g:3313:2: rule__APICallExpression__Group__0__Impl rule__APICallExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__APICallExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__APICallExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICallExpression__Group__0"


    // $ANTLR start "rule__APICallExpression__Group__0__Impl"
    // InternalAPIMappingLanguage.g:3320:1: rule__APICallExpression__Group__0__Impl : ( 'API_Call:' ) ;
    public final void rule__APICallExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3324:1: ( ( 'API_Call:' ) )
            // InternalAPIMappingLanguage.g:3325:1: ( 'API_Call:' )
            {
            // InternalAPIMappingLanguage.g:3325:1: ( 'API_Call:' )
            // InternalAPIMappingLanguage.g:3326:1: 'API_Call:'
            {
             before(grammarAccess.getAPICallExpressionAccess().getAPI_CallKeyword_0()); 
            match(input,49,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAPICallExpressionAccess().getAPI_CallKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICallExpression__Group__0__Impl"


    // $ANTLR start "rule__APICallExpression__Group__1"
    // InternalAPIMappingLanguage.g:3339:1: rule__APICallExpression__Group__1 : rule__APICallExpression__Group__1__Impl rule__APICallExpression__Group__2 ;
    public final void rule__APICallExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3343:1: ( rule__APICallExpression__Group__1__Impl rule__APICallExpression__Group__2 )
            // InternalAPIMappingLanguage.g:3344:2: rule__APICallExpression__Group__1__Impl rule__APICallExpression__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__APICallExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__APICallExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICallExpression__Group__1"


    // $ANTLR start "rule__APICallExpression__Group__1__Impl"
    // InternalAPIMappingLanguage.g:3351:1: rule__APICallExpression__Group__1__Impl : ( ( rule__APICallExpression__ApiCommandAssignment_1 ) ) ;
    public final void rule__APICallExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3355:1: ( ( ( rule__APICallExpression__ApiCommandAssignment_1 ) ) )
            // InternalAPIMappingLanguage.g:3356:1: ( ( rule__APICallExpression__ApiCommandAssignment_1 ) )
            {
            // InternalAPIMappingLanguage.g:3356:1: ( ( rule__APICallExpression__ApiCommandAssignment_1 ) )
            // InternalAPIMappingLanguage.g:3357:1: ( rule__APICallExpression__ApiCommandAssignment_1 )
            {
             before(grammarAccess.getAPICallExpressionAccess().getApiCommandAssignment_1()); 
            // InternalAPIMappingLanguage.g:3358:1: ( rule__APICallExpression__ApiCommandAssignment_1 )
            // InternalAPIMappingLanguage.g:3358:2: rule__APICallExpression__ApiCommandAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__APICallExpression__ApiCommandAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAPICallExpressionAccess().getApiCommandAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICallExpression__Group__1__Impl"


    // $ANTLR start "rule__APICallExpression__Group__2"
    // InternalAPIMappingLanguage.g:3368:1: rule__APICallExpression__Group__2 : rule__APICallExpression__Group__2__Impl rule__APICallExpression__Group__3 ;
    public final void rule__APICallExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3372:1: ( rule__APICallExpression__Group__2__Impl rule__APICallExpression__Group__3 )
            // InternalAPIMappingLanguage.g:3373:2: rule__APICallExpression__Group__2__Impl rule__APICallExpression__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__APICallExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__APICallExpression__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICallExpression__Group__2"


    // $ANTLR start "rule__APICallExpression__Group__2__Impl"
    // InternalAPIMappingLanguage.g:3380:1: rule__APICallExpression__Group__2__Impl : ( '(' ) ;
    public final void rule__APICallExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3384:1: ( ( '(' ) )
            // InternalAPIMappingLanguage.g:3385:1: ( '(' )
            {
            // InternalAPIMappingLanguage.g:3385:1: ( '(' )
            // InternalAPIMappingLanguage.g:3386:1: '('
            {
             before(grammarAccess.getAPICallExpressionAccess().getLeftParenthesisKeyword_2()); 
            match(input,50,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAPICallExpressionAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICallExpression__Group__2__Impl"


    // $ANTLR start "rule__APICallExpression__Group__3"
    // InternalAPIMappingLanguage.g:3399:1: rule__APICallExpression__Group__3 : rule__APICallExpression__Group__3__Impl rule__APICallExpression__Group__4 ;
    public final void rule__APICallExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3403:1: ( rule__APICallExpression__Group__3__Impl rule__APICallExpression__Group__4 )
            // InternalAPIMappingLanguage.g:3404:2: rule__APICallExpression__Group__3__Impl rule__APICallExpression__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__APICallExpression__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__APICallExpression__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICallExpression__Group__3"


    // $ANTLR start "rule__APICallExpression__Group__3__Impl"
    // InternalAPIMappingLanguage.g:3411:1: rule__APICallExpression__Group__3__Impl : ( ( rule__APICallExpression__Group_3__0 )? ) ;
    public final void rule__APICallExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3415:1: ( ( ( rule__APICallExpression__Group_3__0 )? ) )
            // InternalAPIMappingLanguage.g:3416:1: ( ( rule__APICallExpression__Group_3__0 )? )
            {
            // InternalAPIMappingLanguage.g:3416:1: ( ( rule__APICallExpression__Group_3__0 )? )
            // InternalAPIMappingLanguage.g:3417:1: ( rule__APICallExpression__Group_3__0 )?
            {
             before(grammarAccess.getAPICallExpressionAccess().getGroup_3()); 
            // InternalAPIMappingLanguage.g:3418:1: ( rule__APICallExpression__Group_3__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalAPIMappingLanguage.g:3418:2: rule__APICallExpression__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__APICallExpression__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAPICallExpressionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICallExpression__Group__3__Impl"


    // $ANTLR start "rule__APICallExpression__Group__4"
    // InternalAPIMappingLanguage.g:3428:1: rule__APICallExpression__Group__4 : rule__APICallExpression__Group__4__Impl ;
    public final void rule__APICallExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3432:1: ( rule__APICallExpression__Group__4__Impl )
            // InternalAPIMappingLanguage.g:3433:2: rule__APICallExpression__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__APICallExpression__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICallExpression__Group__4"


    // $ANTLR start "rule__APICallExpression__Group__4__Impl"
    // InternalAPIMappingLanguage.g:3439:1: rule__APICallExpression__Group__4__Impl : ( ')' ) ;
    public final void rule__APICallExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3443:1: ( ( ')' ) )
            // InternalAPIMappingLanguage.g:3444:1: ( ')' )
            {
            // InternalAPIMappingLanguage.g:3444:1: ( ')' )
            // InternalAPIMappingLanguage.g:3445:1: ')'
            {
             before(grammarAccess.getAPICallExpressionAccess().getRightParenthesisKeyword_4()); 
            match(input,51,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAPICallExpressionAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICallExpression__Group__4__Impl"


    // $ANTLR start "rule__APICallExpression__Group_3__0"
    // InternalAPIMappingLanguage.g:3468:1: rule__APICallExpression__Group_3__0 : rule__APICallExpression__Group_3__0__Impl rule__APICallExpression__Group_3__1 ;
    public final void rule__APICallExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3472:1: ( rule__APICallExpression__Group_3__0__Impl rule__APICallExpression__Group_3__1 )
            // InternalAPIMappingLanguage.g:3473:2: rule__APICallExpression__Group_3__0__Impl rule__APICallExpression__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__APICallExpression__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__APICallExpression__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICallExpression__Group_3__0"


    // $ANTLR start "rule__APICallExpression__Group_3__0__Impl"
    // InternalAPIMappingLanguage.g:3480:1: rule__APICallExpression__Group_3__0__Impl : ( ( rule__APICallExpression__ParameterBindingsAssignment_3_0 ) ) ;
    public final void rule__APICallExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3484:1: ( ( ( rule__APICallExpression__ParameterBindingsAssignment_3_0 ) ) )
            // InternalAPIMappingLanguage.g:3485:1: ( ( rule__APICallExpression__ParameterBindingsAssignment_3_0 ) )
            {
            // InternalAPIMappingLanguage.g:3485:1: ( ( rule__APICallExpression__ParameterBindingsAssignment_3_0 ) )
            // InternalAPIMappingLanguage.g:3486:1: ( rule__APICallExpression__ParameterBindingsAssignment_3_0 )
            {
             before(grammarAccess.getAPICallExpressionAccess().getParameterBindingsAssignment_3_0()); 
            // InternalAPIMappingLanguage.g:3487:1: ( rule__APICallExpression__ParameterBindingsAssignment_3_0 )
            // InternalAPIMappingLanguage.g:3487:2: rule__APICallExpression__ParameterBindingsAssignment_3_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__APICallExpression__ParameterBindingsAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getAPICallExpressionAccess().getParameterBindingsAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICallExpression__Group_3__0__Impl"


    // $ANTLR start "rule__APICallExpression__Group_3__1"
    // InternalAPIMappingLanguage.g:3497:1: rule__APICallExpression__Group_3__1 : rule__APICallExpression__Group_3__1__Impl ;
    public final void rule__APICallExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3501:1: ( rule__APICallExpression__Group_3__1__Impl )
            // InternalAPIMappingLanguage.g:3502:2: rule__APICallExpression__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__APICallExpression__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICallExpression__Group_3__1"


    // $ANTLR start "rule__APICallExpression__Group_3__1__Impl"
    // InternalAPIMappingLanguage.g:3508:1: rule__APICallExpression__Group_3__1__Impl : ( ( rule__APICallExpression__Group_3_1__0 )* ) ;
    public final void rule__APICallExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3512:1: ( ( ( rule__APICallExpression__Group_3_1__0 )* ) )
            // InternalAPIMappingLanguage.g:3513:1: ( ( rule__APICallExpression__Group_3_1__0 )* )
            {
            // InternalAPIMappingLanguage.g:3513:1: ( ( rule__APICallExpression__Group_3_1__0 )* )
            // InternalAPIMappingLanguage.g:3514:1: ( rule__APICallExpression__Group_3_1__0 )*
            {
             before(grammarAccess.getAPICallExpressionAccess().getGroup_3_1()); 
            // InternalAPIMappingLanguage.g:3515:1: ( rule__APICallExpression__Group_3_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==42) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalAPIMappingLanguage.g:3515:2: rule__APICallExpression__Group_3_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_10);
            	    rule__APICallExpression__Group_3_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getAPICallExpressionAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICallExpression__Group_3__1__Impl"


    // $ANTLR start "rule__APICallExpression__Group_3_1__0"
    // InternalAPIMappingLanguage.g:3529:1: rule__APICallExpression__Group_3_1__0 : rule__APICallExpression__Group_3_1__0__Impl rule__APICallExpression__Group_3_1__1 ;
    public final void rule__APICallExpression__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3533:1: ( rule__APICallExpression__Group_3_1__0__Impl rule__APICallExpression__Group_3_1__1 )
            // InternalAPIMappingLanguage.g:3534:2: rule__APICallExpression__Group_3_1__0__Impl rule__APICallExpression__Group_3_1__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__APICallExpression__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__APICallExpression__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICallExpression__Group_3_1__0"


    // $ANTLR start "rule__APICallExpression__Group_3_1__0__Impl"
    // InternalAPIMappingLanguage.g:3541:1: rule__APICallExpression__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__APICallExpression__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3545:1: ( ( ',' ) )
            // InternalAPIMappingLanguage.g:3546:1: ( ',' )
            {
            // InternalAPIMappingLanguage.g:3546:1: ( ',' )
            // InternalAPIMappingLanguage.g:3547:1: ','
            {
             before(grammarAccess.getAPICallExpressionAccess().getCommaKeyword_3_1_0()); 
            match(input,42,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAPICallExpressionAccess().getCommaKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICallExpression__Group_3_1__0__Impl"


    // $ANTLR start "rule__APICallExpression__Group_3_1__1"
    // InternalAPIMappingLanguage.g:3560:1: rule__APICallExpression__Group_3_1__1 : rule__APICallExpression__Group_3_1__1__Impl ;
    public final void rule__APICallExpression__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3564:1: ( rule__APICallExpression__Group_3_1__1__Impl )
            // InternalAPIMappingLanguage.g:3565:2: rule__APICallExpression__Group_3_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__APICallExpression__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICallExpression__Group_3_1__1"


    // $ANTLR start "rule__APICallExpression__Group_3_1__1__Impl"
    // InternalAPIMappingLanguage.g:3571:1: rule__APICallExpression__Group_3_1__1__Impl : ( ( rule__APICallExpression__ParameterBindingsAssignment_3_1_1 ) ) ;
    public final void rule__APICallExpression__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3575:1: ( ( ( rule__APICallExpression__ParameterBindingsAssignment_3_1_1 ) ) )
            // InternalAPIMappingLanguage.g:3576:1: ( ( rule__APICallExpression__ParameterBindingsAssignment_3_1_1 ) )
            {
            // InternalAPIMappingLanguage.g:3576:1: ( ( rule__APICallExpression__ParameterBindingsAssignment_3_1_1 ) )
            // InternalAPIMappingLanguage.g:3577:1: ( rule__APICallExpression__ParameterBindingsAssignment_3_1_1 )
            {
             before(grammarAccess.getAPICallExpressionAccess().getParameterBindingsAssignment_3_1_1()); 
            // InternalAPIMappingLanguage.g:3578:1: ( rule__APICallExpression__ParameterBindingsAssignment_3_1_1 )
            // InternalAPIMappingLanguage.g:3578:2: rule__APICallExpression__ParameterBindingsAssignment_3_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__APICallExpression__ParameterBindingsAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAPICallExpressionAccess().getParameterBindingsAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICallExpression__Group_3_1__1__Impl"


    // $ANTLR start "rule__ParamaterBinding__Group__0"
    // InternalAPIMappingLanguage.g:3592:1: rule__ParamaterBinding__Group__0 : rule__ParamaterBinding__Group__0__Impl rule__ParamaterBinding__Group__1 ;
    public final void rule__ParamaterBinding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3596:1: ( rule__ParamaterBinding__Group__0__Impl rule__ParamaterBinding__Group__1 )
            // InternalAPIMappingLanguage.g:3597:2: rule__ParamaterBinding__Group__0__Impl rule__ParamaterBinding__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__ParamaterBinding__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParamaterBinding__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamaterBinding__Group__0"


    // $ANTLR start "rule__ParamaterBinding__Group__0__Impl"
    // InternalAPIMappingLanguage.g:3604:1: rule__ParamaterBinding__Group__0__Impl : ( () ) ;
    public final void rule__ParamaterBinding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3608:1: ( ( () ) )
            // InternalAPIMappingLanguage.g:3609:1: ( () )
            {
            // InternalAPIMappingLanguage.g:3609:1: ( () )
            // InternalAPIMappingLanguage.g:3610:1: ()
            {
             before(grammarAccess.getParamaterBindingAccess().getParameterBindingAction_0()); 
            // InternalAPIMappingLanguage.g:3611:1: ()
            // InternalAPIMappingLanguage.g:3613:1: 
            {
            }

             after(grammarAccess.getParamaterBindingAccess().getParameterBindingAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamaterBinding__Group__0__Impl"


    // $ANTLR start "rule__ParamaterBinding__Group__1"
    // InternalAPIMappingLanguage.g:3623:1: rule__ParamaterBinding__Group__1 : rule__ParamaterBinding__Group__1__Impl rule__ParamaterBinding__Group__2 ;
    public final void rule__ParamaterBinding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3627:1: ( rule__ParamaterBinding__Group__1__Impl rule__ParamaterBinding__Group__2 )
            // InternalAPIMappingLanguage.g:3628:2: rule__ParamaterBinding__Group__1__Impl rule__ParamaterBinding__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__ParamaterBinding__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParamaterBinding__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamaterBinding__Group__1"


    // $ANTLR start "rule__ParamaterBinding__Group__1__Impl"
    // InternalAPIMappingLanguage.g:3635:1: rule__ParamaterBinding__Group__1__Impl : ( ( rule__ParamaterBinding__ParameterAssignment_1 ) ) ;
    public final void rule__ParamaterBinding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3639:1: ( ( ( rule__ParamaterBinding__ParameterAssignment_1 ) ) )
            // InternalAPIMappingLanguage.g:3640:1: ( ( rule__ParamaterBinding__ParameterAssignment_1 ) )
            {
            // InternalAPIMappingLanguage.g:3640:1: ( ( rule__ParamaterBinding__ParameterAssignment_1 ) )
            // InternalAPIMappingLanguage.g:3641:1: ( rule__ParamaterBinding__ParameterAssignment_1 )
            {
             before(grammarAccess.getParamaterBindingAccess().getParameterAssignment_1()); 
            // InternalAPIMappingLanguage.g:3642:1: ( rule__ParamaterBinding__ParameterAssignment_1 )
            // InternalAPIMappingLanguage.g:3642:2: rule__ParamaterBinding__ParameterAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParamaterBinding__ParameterAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParamaterBindingAccess().getParameterAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamaterBinding__Group__1__Impl"


    // $ANTLR start "rule__ParamaterBinding__Group__2"
    // InternalAPIMappingLanguage.g:3652:1: rule__ParamaterBinding__Group__2 : rule__ParamaterBinding__Group__2__Impl rule__ParamaterBinding__Group__3 ;
    public final void rule__ParamaterBinding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3656:1: ( rule__ParamaterBinding__Group__2__Impl rule__ParamaterBinding__Group__3 )
            // InternalAPIMappingLanguage.g:3657:2: rule__ParamaterBinding__Group__2__Impl rule__ParamaterBinding__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__ParamaterBinding__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParamaterBinding__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamaterBinding__Group__2"


    // $ANTLR start "rule__ParamaterBinding__Group__2__Impl"
    // InternalAPIMappingLanguage.g:3664:1: rule__ParamaterBinding__Group__2__Impl : ( ':=' ) ;
    public final void rule__ParamaterBinding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3668:1: ( ( ':=' ) )
            // InternalAPIMappingLanguage.g:3669:1: ( ':=' )
            {
            // InternalAPIMappingLanguage.g:3669:1: ( ':=' )
            // InternalAPIMappingLanguage.g:3670:1: ':='
            {
             before(grammarAccess.getParamaterBindingAccess().getColonEqualsSignKeyword_2()); 
            match(input,19,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getParamaterBindingAccess().getColonEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamaterBinding__Group__2__Impl"


    // $ANTLR start "rule__ParamaterBinding__Group__3"
    // InternalAPIMappingLanguage.g:3683:1: rule__ParamaterBinding__Group__3 : rule__ParamaterBinding__Group__3__Impl ;
    public final void rule__ParamaterBinding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3687:1: ( rule__ParamaterBinding__Group__3__Impl )
            // InternalAPIMappingLanguage.g:3688:2: rule__ParamaterBinding__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParamaterBinding__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamaterBinding__Group__3"


    // $ANTLR start "rule__ParamaterBinding__Group__3__Impl"
    // InternalAPIMappingLanguage.g:3694:1: rule__ParamaterBinding__Group__3__Impl : ( ( rule__ParamaterBinding__ValueAssignment_3 ) ) ;
    public final void rule__ParamaterBinding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3698:1: ( ( ( rule__ParamaterBinding__ValueAssignment_3 ) ) )
            // InternalAPIMappingLanguage.g:3699:1: ( ( rule__ParamaterBinding__ValueAssignment_3 ) )
            {
            // InternalAPIMappingLanguage.g:3699:1: ( ( rule__ParamaterBinding__ValueAssignment_3 ) )
            // InternalAPIMappingLanguage.g:3700:1: ( rule__ParamaterBinding__ValueAssignment_3 )
            {
             before(grammarAccess.getParamaterBindingAccess().getValueAssignment_3()); 
            // InternalAPIMappingLanguage.g:3701:1: ( rule__ParamaterBinding__ValueAssignment_3 )
            // InternalAPIMappingLanguage.g:3701:2: rule__ParamaterBinding__ValueAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParamaterBinding__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getParamaterBindingAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamaterBinding__Group__3__Impl"


    // $ANTLR start "rule__ContiniousPortExpressions__Group__0"
    // InternalAPIMappingLanguage.g:3719:1: rule__ContiniousPortExpressions__Group__0 : rule__ContiniousPortExpressions__Group__0__Impl rule__ContiniousPortExpressions__Group__1 ;
    public final void rule__ContiniousPortExpressions__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3723:1: ( rule__ContiniousPortExpressions__Group__0__Impl rule__ContiniousPortExpressions__Group__1 )
            // InternalAPIMappingLanguage.g:3724:2: rule__ContiniousPortExpressions__Group__0__Impl rule__ContiniousPortExpressions__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__ContiniousPortExpressions__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ContiniousPortExpressions__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContiniousPortExpressions__Group__0"


    // $ANTLR start "rule__ContiniousPortExpressions__Group__0__Impl"
    // InternalAPIMappingLanguage.g:3731:1: rule__ContiniousPortExpressions__Group__0__Impl : ( 'port:' ) ;
    public final void rule__ContiniousPortExpressions__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3735:1: ( ( 'port:' ) )
            // InternalAPIMappingLanguage.g:3736:1: ( 'port:' )
            {
            // InternalAPIMappingLanguage.g:3736:1: ( 'port:' )
            // InternalAPIMappingLanguage.g:3737:1: 'port:'
            {
             before(grammarAccess.getContiniousPortExpressionsAccess().getPortKeyword_0()); 
            match(input,52,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getContiniousPortExpressionsAccess().getPortKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContiniousPortExpressions__Group__0__Impl"


    // $ANTLR start "rule__ContiniousPortExpressions__Group__1"
    // InternalAPIMappingLanguage.g:3750:1: rule__ContiniousPortExpressions__Group__1 : rule__ContiniousPortExpressions__Group__1__Impl ;
    public final void rule__ContiniousPortExpressions__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3754:1: ( rule__ContiniousPortExpressions__Group__1__Impl )
            // InternalAPIMappingLanguage.g:3755:2: rule__ContiniousPortExpressions__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ContiniousPortExpressions__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContiniousPortExpressions__Group__1"


    // $ANTLR start "rule__ContiniousPortExpressions__Group__1__Impl"
    // InternalAPIMappingLanguage.g:3761:1: rule__ContiniousPortExpressions__Group__1__Impl : ( ( rule__ContiniousPortExpressions__ContinuousPortAssignment_1 ) ) ;
    public final void rule__ContiniousPortExpressions__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3765:1: ( ( ( rule__ContiniousPortExpressions__ContinuousPortAssignment_1 ) ) )
            // InternalAPIMappingLanguage.g:3766:1: ( ( rule__ContiniousPortExpressions__ContinuousPortAssignment_1 ) )
            {
            // InternalAPIMappingLanguage.g:3766:1: ( ( rule__ContiniousPortExpressions__ContinuousPortAssignment_1 ) )
            // InternalAPIMappingLanguage.g:3767:1: ( rule__ContiniousPortExpressions__ContinuousPortAssignment_1 )
            {
             before(grammarAccess.getContiniousPortExpressionsAccess().getContinuousPortAssignment_1()); 
            // InternalAPIMappingLanguage.g:3768:1: ( rule__ContiniousPortExpressions__ContinuousPortAssignment_1 )
            // InternalAPIMappingLanguage.g:3768:2: rule__ContiniousPortExpressions__ContinuousPortAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ContiniousPortExpressions__ContinuousPortAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getContiniousPortExpressionsAccess().getContinuousPortAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContiniousPortExpressions__Group__1__Impl"


    // $ANTLR start "rule__ExpressionStartRule__Group_8__0"
    // InternalAPIMappingLanguage.g:3782:1: rule__ExpressionStartRule__Group_8__0 : rule__ExpressionStartRule__Group_8__0__Impl rule__ExpressionStartRule__Group_8__1 ;
    public final void rule__ExpressionStartRule__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3786:1: ( rule__ExpressionStartRule__Group_8__0__Impl rule__ExpressionStartRule__Group_8__1 )
            // InternalAPIMappingLanguage.g:3787:2: rule__ExpressionStartRule__Group_8__0__Impl rule__ExpressionStartRule__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__ExpressionStartRule__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExpressionStartRule__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionStartRule__Group_8__0"


    // $ANTLR start "rule__ExpressionStartRule__Group_8__0__Impl"
    // InternalAPIMappingLanguage.g:3794:1: rule__ExpressionStartRule__Group_8__0__Impl : ( ruleAPICallExpression ) ;
    public final void rule__ExpressionStartRule__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3798:1: ( ( ruleAPICallExpression ) )
            // InternalAPIMappingLanguage.g:3799:1: ( ruleAPICallExpression )
            {
            // InternalAPIMappingLanguage.g:3799:1: ( ruleAPICallExpression )
            // InternalAPIMappingLanguage.g:3800:1: ruleAPICallExpression
            {
             before(grammarAccess.getExpressionStartRuleAccess().getAPICallExpressionParserRuleCall_8_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAPICallExpression();

            state._fsp--;

             after(grammarAccess.getExpressionStartRuleAccess().getAPICallExpressionParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionStartRule__Group_8__0__Impl"


    // $ANTLR start "rule__ExpressionStartRule__Group_8__1"
    // InternalAPIMappingLanguage.g:3811:1: rule__ExpressionStartRule__Group_8__1 : rule__ExpressionStartRule__Group_8__1__Impl ;
    public final void rule__ExpressionStartRule__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3815:1: ( rule__ExpressionStartRule__Group_8__1__Impl )
            // InternalAPIMappingLanguage.g:3816:2: rule__ExpressionStartRule__Group_8__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExpressionStartRule__Group_8__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionStartRule__Group_8__1"


    // $ANTLR start "rule__ExpressionStartRule__Group_8__1__Impl"
    // InternalAPIMappingLanguage.g:3822:1: rule__ExpressionStartRule__Group_8__1__Impl : ( ';' ) ;
    public final void rule__ExpressionStartRule__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3826:1: ( ( ';' ) )
            // InternalAPIMappingLanguage.g:3827:1: ( ';' )
            {
            // InternalAPIMappingLanguage.g:3827:1: ( ';' )
            // InternalAPIMappingLanguage.g:3828:1: ';'
            {
             before(grammarAccess.getExpressionStartRuleAccess().getSemicolonKeyword_8_1()); 
            match(input,53,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getExpressionStartRuleAccess().getSemicolonKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpressionStartRule__Group_8__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalAPIMappingLanguage.g:3845:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3849:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalAPIMappingLanguage.g:3850:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalAPIMappingLanguage.g:3857:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3861:1: ( ( RULE_ID ) )
            // InternalAPIMappingLanguage.g:3862:1: ( RULE_ID )
            {
            // InternalAPIMappingLanguage.g:3862:1: ( RULE_ID )
            // InternalAPIMappingLanguage.g:3863:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalAPIMappingLanguage.g:3874:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3878:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalAPIMappingLanguage.g:3879:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalAPIMappingLanguage.g:3885:1: rule__QualifiedName__Group__1__Impl : ( ( ( rule__QualifiedName__Group_1__0 ) ) ( ( rule__QualifiedName__Group_1__0 )* ) ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3889:1: ( ( ( ( rule__QualifiedName__Group_1__0 ) ) ( ( rule__QualifiedName__Group_1__0 )* ) ) )
            // InternalAPIMappingLanguage.g:3890:1: ( ( ( rule__QualifiedName__Group_1__0 ) ) ( ( rule__QualifiedName__Group_1__0 )* ) )
            {
            // InternalAPIMappingLanguage.g:3890:1: ( ( ( rule__QualifiedName__Group_1__0 ) ) ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalAPIMappingLanguage.g:3891:1: ( ( rule__QualifiedName__Group_1__0 ) ) ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalAPIMappingLanguage.g:3891:1: ( ( rule__QualifiedName__Group_1__0 ) )
            // InternalAPIMappingLanguage.g:3892:1: ( rule__QualifiedName__Group_1__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalAPIMappingLanguage.g:3893:1: ( rule__QualifiedName__Group_1__0 )
            // InternalAPIMappingLanguage.g:3893:2: rule__QualifiedName__Group_1__0
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__QualifiedName__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }

            // InternalAPIMappingLanguage.g:3896:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalAPIMappingLanguage.g:3897:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalAPIMappingLanguage.g:3898:1: ( rule__QualifiedName__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==54) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalAPIMappingLanguage.g:3898:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_22);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalAPIMappingLanguage.g:3913:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3917:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalAPIMappingLanguage.g:3918:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalAPIMappingLanguage.g:3925:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3929:1: ( ( '.' ) )
            // InternalAPIMappingLanguage.g:3930:1: ( '.' )
            {
            // InternalAPIMappingLanguage.g:3930:1: ( '.' )
            // InternalAPIMappingLanguage.g:3931:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,54,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalAPIMappingLanguage.g:3944:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3948:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalAPIMappingLanguage.g:3949:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalAPIMappingLanguage.g:3955:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3959:1: ( ( RULE_ID ) )
            // InternalAPIMappingLanguage.g:3960:1: ( RULE_ID )
            {
            // InternalAPIMappingLanguage.g:3960:1: ( RULE_ID )
            // InternalAPIMappingLanguage.g:3961:1: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Block__Group__0"
    // InternalAPIMappingLanguage.g:3976:1: rule__Block__Group__0 : rule__Block__Group__0__Impl rule__Block__Group__1 ;
    public final void rule__Block__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3980:1: ( rule__Block__Group__0__Impl rule__Block__Group__1 )
            // InternalAPIMappingLanguage.g:3981:2: rule__Block__Group__0__Impl rule__Block__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__Block__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Block__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__0"


    // $ANTLR start "rule__Block__Group__0__Impl"
    // InternalAPIMappingLanguage.g:3988:1: rule__Block__Group__0__Impl : ( () ) ;
    public final void rule__Block__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:3992:1: ( ( () ) )
            // InternalAPIMappingLanguage.g:3993:1: ( () )
            {
            // InternalAPIMappingLanguage.g:3993:1: ( () )
            // InternalAPIMappingLanguage.g:3994:1: ()
            {
             before(grammarAccess.getBlockAccess().getBlockAction_0()); 
            // InternalAPIMappingLanguage.g:3995:1: ()
            // InternalAPIMappingLanguage.g:3997:1: 
            {
            }

             after(grammarAccess.getBlockAccess().getBlockAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__0__Impl"


    // $ANTLR start "rule__Block__Group__1"
    // InternalAPIMappingLanguage.g:4007:1: rule__Block__Group__1 : rule__Block__Group__1__Impl rule__Block__Group__2 ;
    public final void rule__Block__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4011:1: ( rule__Block__Group__1__Impl rule__Block__Group__2 )
            // InternalAPIMappingLanguage.g:4012:2: rule__Block__Group__1__Impl rule__Block__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__Block__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Block__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__1"


    // $ANTLR start "rule__Block__Group__1__Impl"
    // InternalAPIMappingLanguage.g:4019:1: rule__Block__Group__1__Impl : ( '{' ) ;
    public final void rule__Block__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4023:1: ( ( '{' ) )
            // InternalAPIMappingLanguage.g:4024:1: ( '{' )
            {
            // InternalAPIMappingLanguage.g:4024:1: ( '{' )
            // InternalAPIMappingLanguage.g:4025:1: '{'
            {
             before(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,40,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__1__Impl"


    // $ANTLR start "rule__Block__Group__2"
    // InternalAPIMappingLanguage.g:4038:1: rule__Block__Group__2 : rule__Block__Group__2__Impl rule__Block__Group__3 ;
    public final void rule__Block__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4042:1: ( rule__Block__Group__2__Impl rule__Block__Group__3 )
            // InternalAPIMappingLanguage.g:4043:2: rule__Block__Group__2__Impl rule__Block__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__Block__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Block__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__2"


    // $ANTLR start "rule__Block__Group__2__Impl"
    // InternalAPIMappingLanguage.g:4050:1: rule__Block__Group__2__Impl : ( ( rule__Block__ExpressionsAssignment_2 )* ) ;
    public final void rule__Block__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4054:1: ( ( ( rule__Block__ExpressionsAssignment_2 )* ) )
            // InternalAPIMappingLanguage.g:4055:1: ( ( rule__Block__ExpressionsAssignment_2 )* )
            {
            // InternalAPIMappingLanguage.g:4055:1: ( ( rule__Block__ExpressionsAssignment_2 )* )
            // InternalAPIMappingLanguage.g:4056:1: ( rule__Block__ExpressionsAssignment_2 )*
            {
             before(grammarAccess.getBlockAccess().getExpressionsAssignment_2()); 
            // InternalAPIMappingLanguage.g:4057:1: ( rule__Block__ExpressionsAssignment_2 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_ID||LA34_0==49||(LA34_0>=55 && LA34_0<=57)||LA34_0==59||LA34_0==62||LA34_0==66) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalAPIMappingLanguage.g:4057:2: rule__Block__ExpressionsAssignment_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_24);
            	    rule__Block__ExpressionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getBlockAccess().getExpressionsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__2__Impl"


    // $ANTLR start "rule__Block__Group__3"
    // InternalAPIMappingLanguage.g:4067:1: rule__Block__Group__3 : rule__Block__Group__3__Impl ;
    public final void rule__Block__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4071:1: ( rule__Block__Group__3__Impl )
            // InternalAPIMappingLanguage.g:4072:2: rule__Block__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Block__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__3"


    // $ANTLR start "rule__Block__Group__3__Impl"
    // InternalAPIMappingLanguage.g:4078:1: rule__Block__Group__3__Impl : ( '}' ) ;
    public final void rule__Block__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4082:1: ( ( '}' ) )
            // InternalAPIMappingLanguage.g:4083:1: ( '}' )
            {
            // InternalAPIMappingLanguage.g:4083:1: ( '}' )
            // InternalAPIMappingLanguage.g:4084:1: '}'
            {
             before(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3()); 
            match(input,41,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__Group__3__Impl"


    // $ANTLR start "rule__ForLoop__Group__0"
    // InternalAPIMappingLanguage.g:4105:1: rule__ForLoop__Group__0 : rule__ForLoop__Group__0__Impl rule__ForLoop__Group__1 ;
    public final void rule__ForLoop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4109:1: ( rule__ForLoop__Group__0__Impl rule__ForLoop__Group__1 )
            // InternalAPIMappingLanguage.g:4110:2: rule__ForLoop__Group__0__Impl rule__ForLoop__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__ForLoop__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ForLoop__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__0"


    // $ANTLR start "rule__ForLoop__Group__0__Impl"
    // InternalAPIMappingLanguage.g:4117:1: rule__ForLoop__Group__0__Impl : ( 'for' ) ;
    public final void rule__ForLoop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4121:1: ( ( 'for' ) )
            // InternalAPIMappingLanguage.g:4122:1: ( 'for' )
            {
            // InternalAPIMappingLanguage.g:4122:1: ( 'for' )
            // InternalAPIMappingLanguage.g:4123:1: 'for'
            {
             before(grammarAccess.getForLoopAccess().getForKeyword_0()); 
            match(input,55,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getForLoopAccess().getForKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__0__Impl"


    // $ANTLR start "rule__ForLoop__Group__1"
    // InternalAPIMappingLanguage.g:4136:1: rule__ForLoop__Group__1 : rule__ForLoop__Group__1__Impl rule__ForLoop__Group__2 ;
    public final void rule__ForLoop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4140:1: ( rule__ForLoop__Group__1__Impl rule__ForLoop__Group__2 )
            // InternalAPIMappingLanguage.g:4141:2: rule__ForLoop__Group__1__Impl rule__ForLoop__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__ForLoop__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ForLoop__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__1"


    // $ANTLR start "rule__ForLoop__Group__1__Impl"
    // InternalAPIMappingLanguage.g:4148:1: rule__ForLoop__Group__1__Impl : ( '(' ) ;
    public final void rule__ForLoop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4152:1: ( ( '(' ) )
            // InternalAPIMappingLanguage.g:4153:1: ( '(' )
            {
            // InternalAPIMappingLanguage.g:4153:1: ( '(' )
            // InternalAPIMappingLanguage.g:4154:1: '('
            {
             before(grammarAccess.getForLoopAccess().getLeftParenthesisKeyword_1()); 
            match(input,50,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getForLoopAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__1__Impl"


    // $ANTLR start "rule__ForLoop__Group__2"
    // InternalAPIMappingLanguage.g:4167:1: rule__ForLoop__Group__2 : rule__ForLoop__Group__2__Impl rule__ForLoop__Group__3 ;
    public final void rule__ForLoop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4171:1: ( rule__ForLoop__Group__2__Impl rule__ForLoop__Group__3 )
            // InternalAPIMappingLanguage.g:4172:2: rule__ForLoop__Group__2__Impl rule__ForLoop__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__ForLoop__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ForLoop__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__2"


    // $ANTLR start "rule__ForLoop__Group__2__Impl"
    // InternalAPIMappingLanguage.g:4179:1: rule__ForLoop__Group__2__Impl : ( ( rule__ForLoop__InitializeExpressionAssignment_2 ) ) ;
    public final void rule__ForLoop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4183:1: ( ( ( rule__ForLoop__InitializeExpressionAssignment_2 ) ) )
            // InternalAPIMappingLanguage.g:4184:1: ( ( rule__ForLoop__InitializeExpressionAssignment_2 ) )
            {
            // InternalAPIMappingLanguage.g:4184:1: ( ( rule__ForLoop__InitializeExpressionAssignment_2 ) )
            // InternalAPIMappingLanguage.g:4185:1: ( rule__ForLoop__InitializeExpressionAssignment_2 )
            {
             before(grammarAccess.getForLoopAccess().getInitializeExpressionAssignment_2()); 
            // InternalAPIMappingLanguage.g:4186:1: ( rule__ForLoop__InitializeExpressionAssignment_2 )
            // InternalAPIMappingLanguage.g:4186:2: rule__ForLoop__InitializeExpressionAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ForLoop__InitializeExpressionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getForLoopAccess().getInitializeExpressionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__2__Impl"


    // $ANTLR start "rule__ForLoop__Group__3"
    // InternalAPIMappingLanguage.g:4196:1: rule__ForLoop__Group__3 : rule__ForLoop__Group__3__Impl rule__ForLoop__Group__4 ;
    public final void rule__ForLoop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4200:1: ( rule__ForLoop__Group__3__Impl rule__ForLoop__Group__4 )
            // InternalAPIMappingLanguage.g:4201:2: rule__ForLoop__Group__3__Impl rule__ForLoop__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__ForLoop__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ForLoop__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__3"


    // $ANTLR start "rule__ForLoop__Group__3__Impl"
    // InternalAPIMappingLanguage.g:4208:1: rule__ForLoop__Group__3__Impl : ( ( rule__ForLoop__LoopTestAssignment_3 ) ) ;
    public final void rule__ForLoop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4212:1: ( ( ( rule__ForLoop__LoopTestAssignment_3 ) ) )
            // InternalAPIMappingLanguage.g:4213:1: ( ( rule__ForLoop__LoopTestAssignment_3 ) )
            {
            // InternalAPIMappingLanguage.g:4213:1: ( ( rule__ForLoop__LoopTestAssignment_3 ) )
            // InternalAPIMappingLanguage.g:4214:1: ( rule__ForLoop__LoopTestAssignment_3 )
            {
             before(grammarAccess.getForLoopAccess().getLoopTestAssignment_3()); 
            // InternalAPIMappingLanguage.g:4215:1: ( rule__ForLoop__LoopTestAssignment_3 )
            // InternalAPIMappingLanguage.g:4215:2: rule__ForLoop__LoopTestAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ForLoop__LoopTestAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getForLoopAccess().getLoopTestAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__3__Impl"


    // $ANTLR start "rule__ForLoop__Group__4"
    // InternalAPIMappingLanguage.g:4225:1: rule__ForLoop__Group__4 : rule__ForLoop__Group__4__Impl rule__ForLoop__Group__5 ;
    public final void rule__ForLoop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4229:1: ( rule__ForLoop__Group__4__Impl rule__ForLoop__Group__5 )
            // InternalAPIMappingLanguage.g:4230:2: rule__ForLoop__Group__4__Impl rule__ForLoop__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__ForLoop__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ForLoop__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__4"


    // $ANTLR start "rule__ForLoop__Group__4__Impl"
    // InternalAPIMappingLanguage.g:4237:1: rule__ForLoop__Group__4__Impl : ( ';' ) ;
    public final void rule__ForLoop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4241:1: ( ( ';' ) )
            // InternalAPIMappingLanguage.g:4242:1: ( ';' )
            {
            // InternalAPIMappingLanguage.g:4242:1: ( ';' )
            // InternalAPIMappingLanguage.g:4243:1: ';'
            {
             before(grammarAccess.getForLoopAccess().getSemicolonKeyword_4()); 
            match(input,53,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getForLoopAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__4__Impl"


    // $ANTLR start "rule__ForLoop__Group__5"
    // InternalAPIMappingLanguage.g:4256:1: rule__ForLoop__Group__5 : rule__ForLoop__Group__5__Impl rule__ForLoop__Group__6 ;
    public final void rule__ForLoop__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4260:1: ( rule__ForLoop__Group__5__Impl rule__ForLoop__Group__6 )
            // InternalAPIMappingLanguage.g:4261:2: rule__ForLoop__Group__5__Impl rule__ForLoop__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_26);
            rule__ForLoop__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ForLoop__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__5"


    // $ANTLR start "rule__ForLoop__Group__5__Impl"
    // InternalAPIMappingLanguage.g:4268:1: rule__ForLoop__Group__5__Impl : ( ( rule__ForLoop__CountingExpressionAssignment_5 ) ) ;
    public final void rule__ForLoop__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4272:1: ( ( ( rule__ForLoop__CountingExpressionAssignment_5 ) ) )
            // InternalAPIMappingLanguage.g:4273:1: ( ( rule__ForLoop__CountingExpressionAssignment_5 ) )
            {
            // InternalAPIMappingLanguage.g:4273:1: ( ( rule__ForLoop__CountingExpressionAssignment_5 ) )
            // InternalAPIMappingLanguage.g:4274:1: ( rule__ForLoop__CountingExpressionAssignment_5 )
            {
             before(grammarAccess.getForLoopAccess().getCountingExpressionAssignment_5()); 
            // InternalAPIMappingLanguage.g:4275:1: ( rule__ForLoop__CountingExpressionAssignment_5 )
            // InternalAPIMappingLanguage.g:4275:2: rule__ForLoop__CountingExpressionAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ForLoop__CountingExpressionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getForLoopAccess().getCountingExpressionAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__5__Impl"


    // $ANTLR start "rule__ForLoop__Group__6"
    // InternalAPIMappingLanguage.g:4285:1: rule__ForLoop__Group__6 : rule__ForLoop__Group__6__Impl rule__ForLoop__Group__7 ;
    public final void rule__ForLoop__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4289:1: ( rule__ForLoop__Group__6__Impl rule__ForLoop__Group__7 )
            // InternalAPIMappingLanguage.g:4290:2: rule__ForLoop__Group__6__Impl rule__ForLoop__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__ForLoop__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ForLoop__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__6"


    // $ANTLR start "rule__ForLoop__Group__6__Impl"
    // InternalAPIMappingLanguage.g:4297:1: rule__ForLoop__Group__6__Impl : ( ')' ) ;
    public final void rule__ForLoop__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4301:1: ( ( ')' ) )
            // InternalAPIMappingLanguage.g:4302:1: ( ')' )
            {
            // InternalAPIMappingLanguage.g:4302:1: ( ')' )
            // InternalAPIMappingLanguage.g:4303:1: ')'
            {
             before(grammarAccess.getForLoopAccess().getRightParenthesisKeyword_6()); 
            match(input,51,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getForLoopAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__6__Impl"


    // $ANTLR start "rule__ForLoop__Group__7"
    // InternalAPIMappingLanguage.g:4316:1: rule__ForLoop__Group__7 : rule__ForLoop__Group__7__Impl ;
    public final void rule__ForLoop__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4320:1: ( rule__ForLoop__Group__7__Impl )
            // InternalAPIMappingLanguage.g:4321:2: rule__ForLoop__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ForLoop__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__7"


    // $ANTLR start "rule__ForLoop__Group__7__Impl"
    // InternalAPIMappingLanguage.g:4327:1: rule__ForLoop__Group__7__Impl : ( ( rule__ForLoop__BlockAssignment_7 ) ) ;
    public final void rule__ForLoop__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4331:1: ( ( ( rule__ForLoop__BlockAssignment_7 ) ) )
            // InternalAPIMappingLanguage.g:4332:1: ( ( rule__ForLoop__BlockAssignment_7 ) )
            {
            // InternalAPIMappingLanguage.g:4332:1: ( ( rule__ForLoop__BlockAssignment_7 ) )
            // InternalAPIMappingLanguage.g:4333:1: ( rule__ForLoop__BlockAssignment_7 )
            {
             before(grammarAccess.getForLoopAccess().getBlockAssignment_7()); 
            // InternalAPIMappingLanguage.g:4334:1: ( rule__ForLoop__BlockAssignment_7 )
            // InternalAPIMappingLanguage.g:4334:2: rule__ForLoop__BlockAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ForLoop__BlockAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getForLoopAccess().getBlockAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__Group__7__Impl"


    // $ANTLR start "rule__ForLoopCountingExpression__Group__0"
    // InternalAPIMappingLanguage.g:4360:1: rule__ForLoopCountingExpression__Group__0 : rule__ForLoopCountingExpression__Group__0__Impl rule__ForLoopCountingExpression__Group__1 ;
    public final void rule__ForLoopCountingExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4364:1: ( rule__ForLoopCountingExpression__Group__0__Impl rule__ForLoopCountingExpression__Group__1 )
            // InternalAPIMappingLanguage.g:4365:2: rule__ForLoopCountingExpression__Group__0__Impl rule__ForLoopCountingExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__ForLoopCountingExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ForLoopCountingExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoopCountingExpression__Group__0"


    // $ANTLR start "rule__ForLoopCountingExpression__Group__0__Impl"
    // InternalAPIMappingLanguage.g:4372:1: rule__ForLoopCountingExpression__Group__0__Impl : ( ( rule__ForLoopCountingExpression__Lhs_typedNamedElementExpressionAssignment_0 ) ) ;
    public final void rule__ForLoopCountingExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4376:1: ( ( ( rule__ForLoopCountingExpression__Lhs_typedNamedElementExpressionAssignment_0 ) ) )
            // InternalAPIMappingLanguage.g:4377:1: ( ( rule__ForLoopCountingExpression__Lhs_typedNamedElementExpressionAssignment_0 ) )
            {
            // InternalAPIMappingLanguage.g:4377:1: ( ( rule__ForLoopCountingExpression__Lhs_typedNamedElementExpressionAssignment_0 ) )
            // InternalAPIMappingLanguage.g:4378:1: ( rule__ForLoopCountingExpression__Lhs_typedNamedElementExpressionAssignment_0 )
            {
             before(grammarAccess.getForLoopCountingExpressionAccess().getLhs_typedNamedElementExpressionAssignment_0()); 
            // InternalAPIMappingLanguage.g:4379:1: ( rule__ForLoopCountingExpression__Lhs_typedNamedElementExpressionAssignment_0 )
            // InternalAPIMappingLanguage.g:4379:2: rule__ForLoopCountingExpression__Lhs_typedNamedElementExpressionAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ForLoopCountingExpression__Lhs_typedNamedElementExpressionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getForLoopCountingExpressionAccess().getLhs_typedNamedElementExpressionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoopCountingExpression__Group__0__Impl"


    // $ANTLR start "rule__ForLoopCountingExpression__Group__1"
    // InternalAPIMappingLanguage.g:4389:1: rule__ForLoopCountingExpression__Group__1 : rule__ForLoopCountingExpression__Group__1__Impl ;
    public final void rule__ForLoopCountingExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4393:1: ( rule__ForLoopCountingExpression__Group__1__Impl )
            // InternalAPIMappingLanguage.g:4394:2: rule__ForLoopCountingExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ForLoopCountingExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoopCountingExpression__Group__1"


    // $ANTLR start "rule__ForLoopCountingExpression__Group__1__Impl"
    // InternalAPIMappingLanguage.g:4400:1: rule__ForLoopCountingExpression__Group__1__Impl : ( ( rule__ForLoopCountingExpression__Alternatives_1 ) ) ;
    public final void rule__ForLoopCountingExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4404:1: ( ( ( rule__ForLoopCountingExpression__Alternatives_1 ) ) )
            // InternalAPIMappingLanguage.g:4405:1: ( ( rule__ForLoopCountingExpression__Alternatives_1 ) )
            {
            // InternalAPIMappingLanguage.g:4405:1: ( ( rule__ForLoopCountingExpression__Alternatives_1 ) )
            // InternalAPIMappingLanguage.g:4406:1: ( rule__ForLoopCountingExpression__Alternatives_1 )
            {
             before(grammarAccess.getForLoopCountingExpressionAccess().getAlternatives_1()); 
            // InternalAPIMappingLanguage.g:4407:1: ( rule__ForLoopCountingExpression__Alternatives_1 )
            // InternalAPIMappingLanguage.g:4407:2: rule__ForLoopCountingExpression__Alternatives_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ForLoopCountingExpression__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getForLoopCountingExpressionAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoopCountingExpression__Group__1__Impl"


    // $ANTLR start "rule__ForLoopCountingExpression__Group_1_1__0"
    // InternalAPIMappingLanguage.g:4421:1: rule__ForLoopCountingExpression__Group_1_1__0 : rule__ForLoopCountingExpression__Group_1_1__0__Impl rule__ForLoopCountingExpression__Group_1_1__1 ;
    public final void rule__ForLoopCountingExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4425:1: ( rule__ForLoopCountingExpression__Group_1_1__0__Impl rule__ForLoopCountingExpression__Group_1_1__1 )
            // InternalAPIMappingLanguage.g:4426:2: rule__ForLoopCountingExpression__Group_1_1__0__Impl rule__ForLoopCountingExpression__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__ForLoopCountingExpression__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ForLoopCountingExpression__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoopCountingExpression__Group_1_1__0"


    // $ANTLR start "rule__ForLoopCountingExpression__Group_1_1__0__Impl"
    // InternalAPIMappingLanguage.g:4433:1: rule__ForLoopCountingExpression__Group_1_1__0__Impl : ( ( rule__ForLoopCountingExpression__AssignOperatorAssignment_1_1_0 ) ) ;
    public final void rule__ForLoopCountingExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4437:1: ( ( ( rule__ForLoopCountingExpression__AssignOperatorAssignment_1_1_0 ) ) )
            // InternalAPIMappingLanguage.g:4438:1: ( ( rule__ForLoopCountingExpression__AssignOperatorAssignment_1_1_0 ) )
            {
            // InternalAPIMappingLanguage.g:4438:1: ( ( rule__ForLoopCountingExpression__AssignOperatorAssignment_1_1_0 ) )
            // InternalAPIMappingLanguage.g:4439:1: ( rule__ForLoopCountingExpression__AssignOperatorAssignment_1_1_0 )
            {
             before(grammarAccess.getForLoopCountingExpressionAccess().getAssignOperatorAssignment_1_1_0()); 
            // InternalAPIMappingLanguage.g:4440:1: ( rule__ForLoopCountingExpression__AssignOperatorAssignment_1_1_0 )
            // InternalAPIMappingLanguage.g:4440:2: rule__ForLoopCountingExpression__AssignOperatorAssignment_1_1_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ForLoopCountingExpression__AssignOperatorAssignment_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getForLoopCountingExpressionAccess().getAssignOperatorAssignment_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoopCountingExpression__Group_1_1__0__Impl"


    // $ANTLR start "rule__ForLoopCountingExpression__Group_1_1__1"
    // InternalAPIMappingLanguage.g:4450:1: rule__ForLoopCountingExpression__Group_1_1__1 : rule__ForLoopCountingExpression__Group_1_1__1__Impl ;
    public final void rule__ForLoopCountingExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4454:1: ( rule__ForLoopCountingExpression__Group_1_1__1__Impl )
            // InternalAPIMappingLanguage.g:4455:2: rule__ForLoopCountingExpression__Group_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ForLoopCountingExpression__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoopCountingExpression__Group_1_1__1"


    // $ANTLR start "rule__ForLoopCountingExpression__Group_1_1__1__Impl"
    // InternalAPIMappingLanguage.g:4461:1: rule__ForLoopCountingExpression__Group_1_1__1__Impl : ( ( rule__ForLoopCountingExpression__Rhs_assignExpressionAssignment_1_1_1 ) ) ;
    public final void rule__ForLoopCountingExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4465:1: ( ( ( rule__ForLoopCountingExpression__Rhs_assignExpressionAssignment_1_1_1 ) ) )
            // InternalAPIMappingLanguage.g:4466:1: ( ( rule__ForLoopCountingExpression__Rhs_assignExpressionAssignment_1_1_1 ) )
            {
            // InternalAPIMappingLanguage.g:4466:1: ( ( rule__ForLoopCountingExpression__Rhs_assignExpressionAssignment_1_1_1 ) )
            // InternalAPIMappingLanguage.g:4467:1: ( rule__ForLoopCountingExpression__Rhs_assignExpressionAssignment_1_1_1 )
            {
             before(grammarAccess.getForLoopCountingExpressionAccess().getRhs_assignExpressionAssignment_1_1_1()); 
            // InternalAPIMappingLanguage.g:4468:1: ( rule__ForLoopCountingExpression__Rhs_assignExpressionAssignment_1_1_1 )
            // InternalAPIMappingLanguage.g:4468:2: rule__ForLoopCountingExpression__Rhs_assignExpressionAssignment_1_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ForLoopCountingExpression__Rhs_assignExpressionAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getForLoopCountingExpressionAccess().getRhs_assignExpressionAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoopCountingExpression__Group_1_1__1__Impl"


    // $ANTLR start "rule__WhileLoop__Group__0"
    // InternalAPIMappingLanguage.g:4482:1: rule__WhileLoop__Group__0 : rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1 ;
    public final void rule__WhileLoop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4486:1: ( rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1 )
            // InternalAPIMappingLanguage.g:4487:2: rule__WhileLoop__Group__0__Impl rule__WhileLoop__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__WhileLoop__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__WhileLoop__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__0"


    // $ANTLR start "rule__WhileLoop__Group__0__Impl"
    // InternalAPIMappingLanguage.g:4494:1: rule__WhileLoop__Group__0__Impl : ( 'while' ) ;
    public final void rule__WhileLoop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4498:1: ( ( 'while' ) )
            // InternalAPIMappingLanguage.g:4499:1: ( 'while' )
            {
            // InternalAPIMappingLanguage.g:4499:1: ( 'while' )
            // InternalAPIMappingLanguage.g:4500:1: 'while'
            {
             before(grammarAccess.getWhileLoopAccess().getWhileKeyword_0()); 
            match(input,56,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getWhileLoopAccess().getWhileKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__0__Impl"


    // $ANTLR start "rule__WhileLoop__Group__1"
    // InternalAPIMappingLanguage.g:4513:1: rule__WhileLoop__Group__1 : rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2 ;
    public final void rule__WhileLoop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4517:1: ( rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2 )
            // InternalAPIMappingLanguage.g:4518:2: rule__WhileLoop__Group__1__Impl rule__WhileLoop__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__WhileLoop__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__WhileLoop__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__1"


    // $ANTLR start "rule__WhileLoop__Group__1__Impl"
    // InternalAPIMappingLanguage.g:4525:1: rule__WhileLoop__Group__1__Impl : ( '(' ) ;
    public final void rule__WhileLoop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4529:1: ( ( '(' ) )
            // InternalAPIMappingLanguage.g:4530:1: ( '(' )
            {
            // InternalAPIMappingLanguage.g:4530:1: ( '(' )
            // InternalAPIMappingLanguage.g:4531:1: '('
            {
             before(grammarAccess.getWhileLoopAccess().getLeftParenthesisKeyword_1()); 
            match(input,50,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getWhileLoopAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__1__Impl"


    // $ANTLR start "rule__WhileLoop__Group__2"
    // InternalAPIMappingLanguage.g:4544:1: rule__WhileLoop__Group__2 : rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3 ;
    public final void rule__WhileLoop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4548:1: ( rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3 )
            // InternalAPIMappingLanguage.g:4549:2: rule__WhileLoop__Group__2__Impl rule__WhileLoop__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_26);
            rule__WhileLoop__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__WhileLoop__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__2"


    // $ANTLR start "rule__WhileLoop__Group__2__Impl"
    // InternalAPIMappingLanguage.g:4556:1: rule__WhileLoop__Group__2__Impl : ( ( rule__WhileLoop__LoopTestAssignment_2 ) ) ;
    public final void rule__WhileLoop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4560:1: ( ( ( rule__WhileLoop__LoopTestAssignment_2 ) ) )
            // InternalAPIMappingLanguage.g:4561:1: ( ( rule__WhileLoop__LoopTestAssignment_2 ) )
            {
            // InternalAPIMappingLanguage.g:4561:1: ( ( rule__WhileLoop__LoopTestAssignment_2 ) )
            // InternalAPIMappingLanguage.g:4562:1: ( rule__WhileLoop__LoopTestAssignment_2 )
            {
             before(grammarAccess.getWhileLoopAccess().getLoopTestAssignment_2()); 
            // InternalAPIMappingLanguage.g:4563:1: ( rule__WhileLoop__LoopTestAssignment_2 )
            // InternalAPIMappingLanguage.g:4563:2: rule__WhileLoop__LoopTestAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__WhileLoop__LoopTestAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getWhileLoopAccess().getLoopTestAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__2__Impl"


    // $ANTLR start "rule__WhileLoop__Group__3"
    // InternalAPIMappingLanguage.g:4573:1: rule__WhileLoop__Group__3 : rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4 ;
    public final void rule__WhileLoop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4577:1: ( rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4 )
            // InternalAPIMappingLanguage.g:4578:2: rule__WhileLoop__Group__3__Impl rule__WhileLoop__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__WhileLoop__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__WhileLoop__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__3"


    // $ANTLR start "rule__WhileLoop__Group__3__Impl"
    // InternalAPIMappingLanguage.g:4585:1: rule__WhileLoop__Group__3__Impl : ( ')' ) ;
    public final void rule__WhileLoop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4589:1: ( ( ')' ) )
            // InternalAPIMappingLanguage.g:4590:1: ( ')' )
            {
            // InternalAPIMappingLanguage.g:4590:1: ( ')' )
            // InternalAPIMappingLanguage.g:4591:1: ')'
            {
             before(grammarAccess.getWhileLoopAccess().getRightParenthesisKeyword_3()); 
            match(input,51,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getWhileLoopAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__3__Impl"


    // $ANTLR start "rule__WhileLoop__Group__4"
    // InternalAPIMappingLanguage.g:4604:1: rule__WhileLoop__Group__4 : rule__WhileLoop__Group__4__Impl ;
    public final void rule__WhileLoop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4608:1: ( rule__WhileLoop__Group__4__Impl )
            // InternalAPIMappingLanguage.g:4609:2: rule__WhileLoop__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__WhileLoop__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__4"


    // $ANTLR start "rule__WhileLoop__Group__4__Impl"
    // InternalAPIMappingLanguage.g:4615:1: rule__WhileLoop__Group__4__Impl : ( ( rule__WhileLoop__BlockAssignment_4 ) ) ;
    public final void rule__WhileLoop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4619:1: ( ( ( rule__WhileLoop__BlockAssignment_4 ) ) )
            // InternalAPIMappingLanguage.g:4620:1: ( ( rule__WhileLoop__BlockAssignment_4 ) )
            {
            // InternalAPIMappingLanguage.g:4620:1: ( ( rule__WhileLoop__BlockAssignment_4 ) )
            // InternalAPIMappingLanguage.g:4621:1: ( rule__WhileLoop__BlockAssignment_4 )
            {
             before(grammarAccess.getWhileLoopAccess().getBlockAssignment_4()); 
            // InternalAPIMappingLanguage.g:4622:1: ( rule__WhileLoop__BlockAssignment_4 )
            // InternalAPIMappingLanguage.g:4622:2: rule__WhileLoop__BlockAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__WhileLoop__BlockAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getWhileLoopAccess().getBlockAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__Group__4__Impl"


    // $ANTLR start "rule__DoWhileLoop__Group__0"
    // InternalAPIMappingLanguage.g:4642:1: rule__DoWhileLoop__Group__0 : rule__DoWhileLoop__Group__0__Impl rule__DoWhileLoop__Group__1 ;
    public final void rule__DoWhileLoop__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4646:1: ( rule__DoWhileLoop__Group__0__Impl rule__DoWhileLoop__Group__1 )
            // InternalAPIMappingLanguage.g:4647:2: rule__DoWhileLoop__Group__0__Impl rule__DoWhileLoop__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__DoWhileLoop__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DoWhileLoop__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhileLoop__Group__0"


    // $ANTLR start "rule__DoWhileLoop__Group__0__Impl"
    // InternalAPIMappingLanguage.g:4654:1: rule__DoWhileLoop__Group__0__Impl : ( 'do' ) ;
    public final void rule__DoWhileLoop__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4658:1: ( ( 'do' ) )
            // InternalAPIMappingLanguage.g:4659:1: ( 'do' )
            {
            // InternalAPIMappingLanguage.g:4659:1: ( 'do' )
            // InternalAPIMappingLanguage.g:4660:1: 'do'
            {
             before(grammarAccess.getDoWhileLoopAccess().getDoKeyword_0()); 
            match(input,57,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDoWhileLoopAccess().getDoKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhileLoop__Group__0__Impl"


    // $ANTLR start "rule__DoWhileLoop__Group__1"
    // InternalAPIMappingLanguage.g:4673:1: rule__DoWhileLoop__Group__1 : rule__DoWhileLoop__Group__1__Impl rule__DoWhileLoop__Group__2 ;
    public final void rule__DoWhileLoop__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4677:1: ( rule__DoWhileLoop__Group__1__Impl rule__DoWhileLoop__Group__2 )
            // InternalAPIMappingLanguage.g:4678:2: rule__DoWhileLoop__Group__1__Impl rule__DoWhileLoop__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_28);
            rule__DoWhileLoop__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DoWhileLoop__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhileLoop__Group__1"


    // $ANTLR start "rule__DoWhileLoop__Group__1__Impl"
    // InternalAPIMappingLanguage.g:4685:1: rule__DoWhileLoop__Group__1__Impl : ( ( rule__DoWhileLoop__BlockAssignment_1 ) ) ;
    public final void rule__DoWhileLoop__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4689:1: ( ( ( rule__DoWhileLoop__BlockAssignment_1 ) ) )
            // InternalAPIMappingLanguage.g:4690:1: ( ( rule__DoWhileLoop__BlockAssignment_1 ) )
            {
            // InternalAPIMappingLanguage.g:4690:1: ( ( rule__DoWhileLoop__BlockAssignment_1 ) )
            // InternalAPIMappingLanguage.g:4691:1: ( rule__DoWhileLoop__BlockAssignment_1 )
            {
             before(grammarAccess.getDoWhileLoopAccess().getBlockAssignment_1()); 
            // InternalAPIMappingLanguage.g:4692:1: ( rule__DoWhileLoop__BlockAssignment_1 )
            // InternalAPIMappingLanguage.g:4692:2: rule__DoWhileLoop__BlockAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DoWhileLoop__BlockAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDoWhileLoopAccess().getBlockAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhileLoop__Group__1__Impl"


    // $ANTLR start "rule__DoWhileLoop__Group__2"
    // InternalAPIMappingLanguage.g:4702:1: rule__DoWhileLoop__Group__2 : rule__DoWhileLoop__Group__2__Impl rule__DoWhileLoop__Group__3 ;
    public final void rule__DoWhileLoop__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4706:1: ( rule__DoWhileLoop__Group__2__Impl rule__DoWhileLoop__Group__3 )
            // InternalAPIMappingLanguage.g:4707:2: rule__DoWhileLoop__Group__2__Impl rule__DoWhileLoop__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__DoWhileLoop__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DoWhileLoop__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhileLoop__Group__2"


    // $ANTLR start "rule__DoWhileLoop__Group__2__Impl"
    // InternalAPIMappingLanguage.g:4714:1: rule__DoWhileLoop__Group__2__Impl : ( 'while' ) ;
    public final void rule__DoWhileLoop__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4718:1: ( ( 'while' ) )
            // InternalAPIMappingLanguage.g:4719:1: ( 'while' )
            {
            // InternalAPIMappingLanguage.g:4719:1: ( 'while' )
            // InternalAPIMappingLanguage.g:4720:1: 'while'
            {
             before(grammarAccess.getDoWhileLoopAccess().getWhileKeyword_2()); 
            match(input,56,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDoWhileLoopAccess().getWhileKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhileLoop__Group__2__Impl"


    // $ANTLR start "rule__DoWhileLoop__Group__3"
    // InternalAPIMappingLanguage.g:4733:1: rule__DoWhileLoop__Group__3 : rule__DoWhileLoop__Group__3__Impl rule__DoWhileLoop__Group__4 ;
    public final void rule__DoWhileLoop__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4737:1: ( rule__DoWhileLoop__Group__3__Impl rule__DoWhileLoop__Group__4 )
            // InternalAPIMappingLanguage.g:4738:2: rule__DoWhileLoop__Group__3__Impl rule__DoWhileLoop__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__DoWhileLoop__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DoWhileLoop__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhileLoop__Group__3"


    // $ANTLR start "rule__DoWhileLoop__Group__3__Impl"
    // InternalAPIMappingLanguage.g:4745:1: rule__DoWhileLoop__Group__3__Impl : ( '(' ) ;
    public final void rule__DoWhileLoop__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4749:1: ( ( '(' ) )
            // InternalAPIMappingLanguage.g:4750:1: ( '(' )
            {
            // InternalAPIMappingLanguage.g:4750:1: ( '(' )
            // InternalAPIMappingLanguage.g:4751:1: '('
            {
             before(grammarAccess.getDoWhileLoopAccess().getLeftParenthesisKeyword_3()); 
            match(input,50,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDoWhileLoopAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhileLoop__Group__3__Impl"


    // $ANTLR start "rule__DoWhileLoop__Group__4"
    // InternalAPIMappingLanguage.g:4764:1: rule__DoWhileLoop__Group__4 : rule__DoWhileLoop__Group__4__Impl rule__DoWhileLoop__Group__5 ;
    public final void rule__DoWhileLoop__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4768:1: ( rule__DoWhileLoop__Group__4__Impl rule__DoWhileLoop__Group__5 )
            // InternalAPIMappingLanguage.g:4769:2: rule__DoWhileLoop__Group__4__Impl rule__DoWhileLoop__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_29);
            rule__DoWhileLoop__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DoWhileLoop__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhileLoop__Group__4"


    // $ANTLR start "rule__DoWhileLoop__Group__4__Impl"
    // InternalAPIMappingLanguage.g:4776:1: rule__DoWhileLoop__Group__4__Impl : ( ( rule__DoWhileLoop__LoopTestAssignment_4 ) ) ;
    public final void rule__DoWhileLoop__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4780:1: ( ( ( rule__DoWhileLoop__LoopTestAssignment_4 ) ) )
            // InternalAPIMappingLanguage.g:4781:1: ( ( rule__DoWhileLoop__LoopTestAssignment_4 ) )
            {
            // InternalAPIMappingLanguage.g:4781:1: ( ( rule__DoWhileLoop__LoopTestAssignment_4 ) )
            // InternalAPIMappingLanguage.g:4782:1: ( rule__DoWhileLoop__LoopTestAssignment_4 )
            {
             before(grammarAccess.getDoWhileLoopAccess().getLoopTestAssignment_4()); 
            // InternalAPIMappingLanguage.g:4783:1: ( rule__DoWhileLoop__LoopTestAssignment_4 )
            // InternalAPIMappingLanguage.g:4783:2: rule__DoWhileLoop__LoopTestAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DoWhileLoop__LoopTestAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDoWhileLoopAccess().getLoopTestAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhileLoop__Group__4__Impl"


    // $ANTLR start "rule__DoWhileLoop__Group__5"
    // InternalAPIMappingLanguage.g:4793:1: rule__DoWhileLoop__Group__5 : rule__DoWhileLoop__Group__5__Impl ;
    public final void rule__DoWhileLoop__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4797:1: ( rule__DoWhileLoop__Group__5__Impl )
            // InternalAPIMappingLanguage.g:4798:2: rule__DoWhileLoop__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DoWhileLoop__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhileLoop__Group__5"


    // $ANTLR start "rule__DoWhileLoop__Group__5__Impl"
    // InternalAPIMappingLanguage.g:4804:1: rule__DoWhileLoop__Group__5__Impl : ( ');' ) ;
    public final void rule__DoWhileLoop__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4808:1: ( ( ');' ) )
            // InternalAPIMappingLanguage.g:4809:1: ( ');' )
            {
            // InternalAPIMappingLanguage.g:4809:1: ( ');' )
            // InternalAPIMappingLanguage.g:4810:1: ');'
            {
             before(grammarAccess.getDoWhileLoopAccess().getRightParenthesisSemicolonKeyword_5()); 
            match(input,58,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDoWhileLoopAccess().getRightParenthesisSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhileLoop__Group__5__Impl"


    // $ANTLR start "rule__IfStatement__Group__0"
    // InternalAPIMappingLanguage.g:4835:1: rule__IfStatement__Group__0 : rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 ;
    public final void rule__IfStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4839:1: ( rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1 )
            // InternalAPIMappingLanguage.g:4840:2: rule__IfStatement__Group__0__Impl rule__IfStatement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__IfStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__IfStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__0"


    // $ANTLR start "rule__IfStatement__Group__0__Impl"
    // InternalAPIMappingLanguage.g:4847:1: rule__IfStatement__Group__0__Impl : ( 'if' ) ;
    public final void rule__IfStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4851:1: ( ( 'if' ) )
            // InternalAPIMappingLanguage.g:4852:1: ( 'if' )
            {
            // InternalAPIMappingLanguage.g:4852:1: ( 'if' )
            // InternalAPIMappingLanguage.g:4853:1: 'if'
            {
             before(grammarAccess.getIfStatementAccess().getIfKeyword_0()); 
            match(input,59,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getIfStatementAccess().getIfKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__0__Impl"


    // $ANTLR start "rule__IfStatement__Group__1"
    // InternalAPIMappingLanguage.g:4866:1: rule__IfStatement__Group__1 : rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 ;
    public final void rule__IfStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4870:1: ( rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2 )
            // InternalAPIMappingLanguage.g:4871:2: rule__IfStatement__Group__1__Impl rule__IfStatement__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__IfStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__IfStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__1"


    // $ANTLR start "rule__IfStatement__Group__1__Impl"
    // InternalAPIMappingLanguage.g:4878:1: rule__IfStatement__Group__1__Impl : ( '(' ) ;
    public final void rule__IfStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4882:1: ( ( '(' ) )
            // InternalAPIMappingLanguage.g:4883:1: ( '(' )
            {
            // InternalAPIMappingLanguage.g:4883:1: ( '(' )
            // InternalAPIMappingLanguage.g:4884:1: '('
            {
             before(grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_1()); 
            match(input,50,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__1__Impl"


    // $ANTLR start "rule__IfStatement__Group__2"
    // InternalAPIMappingLanguage.g:4897:1: rule__IfStatement__Group__2 : rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 ;
    public final void rule__IfStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4901:1: ( rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3 )
            // InternalAPIMappingLanguage.g:4902:2: rule__IfStatement__Group__2__Impl rule__IfStatement__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_26);
            rule__IfStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__IfStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__2"


    // $ANTLR start "rule__IfStatement__Group__2__Impl"
    // InternalAPIMappingLanguage.g:4909:1: rule__IfStatement__Group__2__Impl : ( ( rule__IfStatement__IfConditionAssignment_2 ) ) ;
    public final void rule__IfStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4913:1: ( ( ( rule__IfStatement__IfConditionAssignment_2 ) ) )
            // InternalAPIMappingLanguage.g:4914:1: ( ( rule__IfStatement__IfConditionAssignment_2 ) )
            {
            // InternalAPIMappingLanguage.g:4914:1: ( ( rule__IfStatement__IfConditionAssignment_2 ) )
            // InternalAPIMappingLanguage.g:4915:1: ( rule__IfStatement__IfConditionAssignment_2 )
            {
             before(grammarAccess.getIfStatementAccess().getIfConditionAssignment_2()); 
            // InternalAPIMappingLanguage.g:4916:1: ( rule__IfStatement__IfConditionAssignment_2 )
            // InternalAPIMappingLanguage.g:4916:2: rule__IfStatement__IfConditionAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IfStatement__IfConditionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getIfConditionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__2__Impl"


    // $ANTLR start "rule__IfStatement__Group__3"
    // InternalAPIMappingLanguage.g:4926:1: rule__IfStatement__Group__3 : rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 ;
    public final void rule__IfStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4930:1: ( rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4 )
            // InternalAPIMappingLanguage.g:4931:2: rule__IfStatement__Group__3__Impl rule__IfStatement__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__IfStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__IfStatement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__3"


    // $ANTLR start "rule__IfStatement__Group__3__Impl"
    // InternalAPIMappingLanguage.g:4938:1: rule__IfStatement__Group__3__Impl : ( ')' ) ;
    public final void rule__IfStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4942:1: ( ( ')' ) )
            // InternalAPIMappingLanguage.g:4943:1: ( ')' )
            {
            // InternalAPIMappingLanguage.g:4943:1: ( ')' )
            // InternalAPIMappingLanguage.g:4944:1: ')'
            {
             before(grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_3()); 
            match(input,51,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__3__Impl"


    // $ANTLR start "rule__IfStatement__Group__4"
    // InternalAPIMappingLanguage.g:4957:1: rule__IfStatement__Group__4 : rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5 ;
    public final void rule__IfStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4961:1: ( rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5 )
            // InternalAPIMappingLanguage.g:4962:2: rule__IfStatement__Group__4__Impl rule__IfStatement__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_30);
            rule__IfStatement__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__IfStatement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__4"


    // $ANTLR start "rule__IfStatement__Group__4__Impl"
    // InternalAPIMappingLanguage.g:4969:1: rule__IfStatement__Group__4__Impl : ( ( rule__IfStatement__IfBlockAssignment_4 ) ) ;
    public final void rule__IfStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4973:1: ( ( ( rule__IfStatement__IfBlockAssignment_4 ) ) )
            // InternalAPIMappingLanguage.g:4974:1: ( ( rule__IfStatement__IfBlockAssignment_4 ) )
            {
            // InternalAPIMappingLanguage.g:4974:1: ( ( rule__IfStatement__IfBlockAssignment_4 ) )
            // InternalAPIMappingLanguage.g:4975:1: ( rule__IfStatement__IfBlockAssignment_4 )
            {
             before(grammarAccess.getIfStatementAccess().getIfBlockAssignment_4()); 
            // InternalAPIMappingLanguage.g:4976:1: ( rule__IfStatement__IfBlockAssignment_4 )
            // InternalAPIMappingLanguage.g:4976:2: rule__IfStatement__IfBlockAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IfStatement__IfBlockAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getIfBlockAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__4__Impl"


    // $ANTLR start "rule__IfStatement__Group__5"
    // InternalAPIMappingLanguage.g:4986:1: rule__IfStatement__Group__5 : rule__IfStatement__Group__5__Impl rule__IfStatement__Group__6 ;
    public final void rule__IfStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:4990:1: ( rule__IfStatement__Group__5__Impl rule__IfStatement__Group__6 )
            // InternalAPIMappingLanguage.g:4991:2: rule__IfStatement__Group__5__Impl rule__IfStatement__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_30);
            rule__IfStatement__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__IfStatement__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__5"


    // $ANTLR start "rule__IfStatement__Group__5__Impl"
    // InternalAPIMappingLanguage.g:4998:1: rule__IfStatement__Group__5__Impl : ( ( rule__IfStatement__ElseIfStatementsAssignment_5 )* ) ;
    public final void rule__IfStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5002:1: ( ( ( rule__IfStatement__ElseIfStatementsAssignment_5 )* ) )
            // InternalAPIMappingLanguage.g:5003:1: ( ( rule__IfStatement__ElseIfStatementsAssignment_5 )* )
            {
            // InternalAPIMappingLanguage.g:5003:1: ( ( rule__IfStatement__ElseIfStatementsAssignment_5 )* )
            // InternalAPIMappingLanguage.g:5004:1: ( rule__IfStatement__ElseIfStatementsAssignment_5 )*
            {
             before(grammarAccess.getIfStatementAccess().getElseIfStatementsAssignment_5()); 
            // InternalAPIMappingLanguage.g:5005:1: ( rule__IfStatement__ElseIfStatementsAssignment_5 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==61) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalAPIMappingLanguage.g:5005:2: rule__IfStatement__ElseIfStatementsAssignment_5
            	    {
            	    pushFollow(FollowSets000.FOLLOW_31);
            	    rule__IfStatement__ElseIfStatementsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getIfStatementAccess().getElseIfStatementsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__5__Impl"


    // $ANTLR start "rule__IfStatement__Group__6"
    // InternalAPIMappingLanguage.g:5015:1: rule__IfStatement__Group__6 : rule__IfStatement__Group__6__Impl ;
    public final void rule__IfStatement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5019:1: ( rule__IfStatement__Group__6__Impl )
            // InternalAPIMappingLanguage.g:5020:2: rule__IfStatement__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IfStatement__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__6"


    // $ANTLR start "rule__IfStatement__Group__6__Impl"
    // InternalAPIMappingLanguage.g:5026:1: rule__IfStatement__Group__6__Impl : ( ( rule__IfStatement__Group_6__0 )? ) ;
    public final void rule__IfStatement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5030:1: ( ( ( rule__IfStatement__Group_6__0 )? ) )
            // InternalAPIMappingLanguage.g:5031:1: ( ( rule__IfStatement__Group_6__0 )? )
            {
            // InternalAPIMappingLanguage.g:5031:1: ( ( rule__IfStatement__Group_6__0 )? )
            // InternalAPIMappingLanguage.g:5032:1: ( rule__IfStatement__Group_6__0 )?
            {
             before(grammarAccess.getIfStatementAccess().getGroup_6()); 
            // InternalAPIMappingLanguage.g:5033:1: ( rule__IfStatement__Group_6__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==60) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalAPIMappingLanguage.g:5033:2: rule__IfStatement__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__IfStatement__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getIfStatementAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group__6__Impl"


    // $ANTLR start "rule__IfStatement__Group_6__0"
    // InternalAPIMappingLanguage.g:5057:1: rule__IfStatement__Group_6__0 : rule__IfStatement__Group_6__0__Impl rule__IfStatement__Group_6__1 ;
    public final void rule__IfStatement__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5061:1: ( rule__IfStatement__Group_6__0__Impl rule__IfStatement__Group_6__1 )
            // InternalAPIMappingLanguage.g:5062:2: rule__IfStatement__Group_6__0__Impl rule__IfStatement__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__IfStatement__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__IfStatement__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group_6__0"


    // $ANTLR start "rule__IfStatement__Group_6__0__Impl"
    // InternalAPIMappingLanguage.g:5069:1: rule__IfStatement__Group_6__0__Impl : ( 'else' ) ;
    public final void rule__IfStatement__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5073:1: ( ( 'else' ) )
            // InternalAPIMappingLanguage.g:5074:1: ( 'else' )
            {
            // InternalAPIMappingLanguage.g:5074:1: ( 'else' )
            // InternalAPIMappingLanguage.g:5075:1: 'else'
            {
             before(grammarAccess.getIfStatementAccess().getElseKeyword_6_0()); 
            match(input,60,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getIfStatementAccess().getElseKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group_6__0__Impl"


    // $ANTLR start "rule__IfStatement__Group_6__1"
    // InternalAPIMappingLanguage.g:5088:1: rule__IfStatement__Group_6__1 : rule__IfStatement__Group_6__1__Impl ;
    public final void rule__IfStatement__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5092:1: ( rule__IfStatement__Group_6__1__Impl )
            // InternalAPIMappingLanguage.g:5093:2: rule__IfStatement__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IfStatement__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group_6__1"


    // $ANTLR start "rule__IfStatement__Group_6__1__Impl"
    // InternalAPIMappingLanguage.g:5099:1: rule__IfStatement__Group_6__1__Impl : ( ( rule__IfStatement__ElseBlockAssignment_6_1 ) ) ;
    public final void rule__IfStatement__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5103:1: ( ( ( rule__IfStatement__ElseBlockAssignment_6_1 ) ) )
            // InternalAPIMappingLanguage.g:5104:1: ( ( rule__IfStatement__ElseBlockAssignment_6_1 ) )
            {
            // InternalAPIMappingLanguage.g:5104:1: ( ( rule__IfStatement__ElseBlockAssignment_6_1 ) )
            // InternalAPIMappingLanguage.g:5105:1: ( rule__IfStatement__ElseBlockAssignment_6_1 )
            {
             before(grammarAccess.getIfStatementAccess().getElseBlockAssignment_6_1()); 
            // InternalAPIMappingLanguage.g:5106:1: ( rule__IfStatement__ElseBlockAssignment_6_1 )
            // InternalAPIMappingLanguage.g:5106:2: rule__IfStatement__ElseBlockAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IfStatement__ElseBlockAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getIfStatementAccess().getElseBlockAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__Group_6__1__Impl"


    // $ANTLR start "rule__ElseIfStatement__Group__0"
    // InternalAPIMappingLanguage.g:5120:1: rule__ElseIfStatement__Group__0 : rule__ElseIfStatement__Group__0__Impl rule__ElseIfStatement__Group__1 ;
    public final void rule__ElseIfStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5124:1: ( rule__ElseIfStatement__Group__0__Impl rule__ElseIfStatement__Group__1 )
            // InternalAPIMappingLanguage.g:5125:2: rule__ElseIfStatement__Group__0__Impl rule__ElseIfStatement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__ElseIfStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ElseIfStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfStatement__Group__0"


    // $ANTLR start "rule__ElseIfStatement__Group__0__Impl"
    // InternalAPIMappingLanguage.g:5132:1: rule__ElseIfStatement__Group__0__Impl : ( 'elseif' ) ;
    public final void rule__ElseIfStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5136:1: ( ( 'elseif' ) )
            // InternalAPIMappingLanguage.g:5137:1: ( 'elseif' )
            {
            // InternalAPIMappingLanguage.g:5137:1: ( 'elseif' )
            // InternalAPIMappingLanguage.g:5138:1: 'elseif'
            {
             before(grammarAccess.getElseIfStatementAccess().getElseifKeyword_0()); 
            match(input,61,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getElseIfStatementAccess().getElseifKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfStatement__Group__0__Impl"


    // $ANTLR start "rule__ElseIfStatement__Group__1"
    // InternalAPIMappingLanguage.g:5151:1: rule__ElseIfStatement__Group__1 : rule__ElseIfStatement__Group__1__Impl rule__ElseIfStatement__Group__2 ;
    public final void rule__ElseIfStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5155:1: ( rule__ElseIfStatement__Group__1__Impl rule__ElseIfStatement__Group__2 )
            // InternalAPIMappingLanguage.g:5156:2: rule__ElseIfStatement__Group__1__Impl rule__ElseIfStatement__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__ElseIfStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ElseIfStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfStatement__Group__1"


    // $ANTLR start "rule__ElseIfStatement__Group__1__Impl"
    // InternalAPIMappingLanguage.g:5163:1: rule__ElseIfStatement__Group__1__Impl : ( '(' ) ;
    public final void rule__ElseIfStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5167:1: ( ( '(' ) )
            // InternalAPIMappingLanguage.g:5168:1: ( '(' )
            {
            // InternalAPIMappingLanguage.g:5168:1: ( '(' )
            // InternalAPIMappingLanguage.g:5169:1: '('
            {
             before(grammarAccess.getElseIfStatementAccess().getLeftParenthesisKeyword_1()); 
            match(input,50,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getElseIfStatementAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfStatement__Group__1__Impl"


    // $ANTLR start "rule__ElseIfStatement__Group__2"
    // InternalAPIMappingLanguage.g:5182:1: rule__ElseIfStatement__Group__2 : rule__ElseIfStatement__Group__2__Impl rule__ElseIfStatement__Group__3 ;
    public final void rule__ElseIfStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5186:1: ( rule__ElseIfStatement__Group__2__Impl rule__ElseIfStatement__Group__3 )
            // InternalAPIMappingLanguage.g:5187:2: rule__ElseIfStatement__Group__2__Impl rule__ElseIfStatement__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_26);
            rule__ElseIfStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ElseIfStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfStatement__Group__2"


    // $ANTLR start "rule__ElseIfStatement__Group__2__Impl"
    // InternalAPIMappingLanguage.g:5194:1: rule__ElseIfStatement__Group__2__Impl : ( ( rule__ElseIfStatement__ElseIfConditionAssignment_2 ) ) ;
    public final void rule__ElseIfStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5198:1: ( ( ( rule__ElseIfStatement__ElseIfConditionAssignment_2 ) ) )
            // InternalAPIMappingLanguage.g:5199:1: ( ( rule__ElseIfStatement__ElseIfConditionAssignment_2 ) )
            {
            // InternalAPIMappingLanguage.g:5199:1: ( ( rule__ElseIfStatement__ElseIfConditionAssignment_2 ) )
            // InternalAPIMappingLanguage.g:5200:1: ( rule__ElseIfStatement__ElseIfConditionAssignment_2 )
            {
             before(grammarAccess.getElseIfStatementAccess().getElseIfConditionAssignment_2()); 
            // InternalAPIMappingLanguage.g:5201:1: ( rule__ElseIfStatement__ElseIfConditionAssignment_2 )
            // InternalAPIMappingLanguage.g:5201:2: rule__ElseIfStatement__ElseIfConditionAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ElseIfStatement__ElseIfConditionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getElseIfStatementAccess().getElseIfConditionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfStatement__Group__2__Impl"


    // $ANTLR start "rule__ElseIfStatement__Group__3"
    // InternalAPIMappingLanguage.g:5211:1: rule__ElseIfStatement__Group__3 : rule__ElseIfStatement__Group__3__Impl rule__ElseIfStatement__Group__4 ;
    public final void rule__ElseIfStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5215:1: ( rule__ElseIfStatement__Group__3__Impl rule__ElseIfStatement__Group__4 )
            // InternalAPIMappingLanguage.g:5216:2: rule__ElseIfStatement__Group__3__Impl rule__ElseIfStatement__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__ElseIfStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ElseIfStatement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfStatement__Group__3"


    // $ANTLR start "rule__ElseIfStatement__Group__3__Impl"
    // InternalAPIMappingLanguage.g:5223:1: rule__ElseIfStatement__Group__3__Impl : ( ')' ) ;
    public final void rule__ElseIfStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5227:1: ( ( ')' ) )
            // InternalAPIMappingLanguage.g:5228:1: ( ')' )
            {
            // InternalAPIMappingLanguage.g:5228:1: ( ')' )
            // InternalAPIMappingLanguage.g:5229:1: ')'
            {
             before(grammarAccess.getElseIfStatementAccess().getRightParenthesisKeyword_3()); 
            match(input,51,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getElseIfStatementAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfStatement__Group__3__Impl"


    // $ANTLR start "rule__ElseIfStatement__Group__4"
    // InternalAPIMappingLanguage.g:5242:1: rule__ElseIfStatement__Group__4 : rule__ElseIfStatement__Group__4__Impl ;
    public final void rule__ElseIfStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5246:1: ( rule__ElseIfStatement__Group__4__Impl )
            // InternalAPIMappingLanguage.g:5247:2: rule__ElseIfStatement__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ElseIfStatement__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfStatement__Group__4"


    // $ANTLR start "rule__ElseIfStatement__Group__4__Impl"
    // InternalAPIMappingLanguage.g:5253:1: rule__ElseIfStatement__Group__4__Impl : ( ( rule__ElseIfStatement__ElseIfBlockAssignment_4 ) ) ;
    public final void rule__ElseIfStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5257:1: ( ( ( rule__ElseIfStatement__ElseIfBlockAssignment_4 ) ) )
            // InternalAPIMappingLanguage.g:5258:1: ( ( rule__ElseIfStatement__ElseIfBlockAssignment_4 ) )
            {
            // InternalAPIMappingLanguage.g:5258:1: ( ( rule__ElseIfStatement__ElseIfBlockAssignment_4 ) )
            // InternalAPIMappingLanguage.g:5259:1: ( rule__ElseIfStatement__ElseIfBlockAssignment_4 )
            {
             before(grammarAccess.getElseIfStatementAccess().getElseIfBlockAssignment_4()); 
            // InternalAPIMappingLanguage.g:5260:1: ( rule__ElseIfStatement__ElseIfBlockAssignment_4 )
            // InternalAPIMappingLanguage.g:5260:2: rule__ElseIfStatement__ElseIfBlockAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ElseIfStatement__ElseIfBlockAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getElseIfStatementAccess().getElseIfBlockAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfStatement__Group__4__Impl"


    // $ANTLR start "rule__ReturnStatement__Group__0"
    // InternalAPIMappingLanguage.g:5280:1: rule__ReturnStatement__Group__0 : rule__ReturnStatement__Group__0__Impl rule__ReturnStatement__Group__1 ;
    public final void rule__ReturnStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5284:1: ( rule__ReturnStatement__Group__0__Impl rule__ReturnStatement__Group__1 )
            // InternalAPIMappingLanguage.g:5285:2: rule__ReturnStatement__Group__0__Impl rule__ReturnStatement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_32);
            rule__ReturnStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ReturnStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnStatement__Group__0"


    // $ANTLR start "rule__ReturnStatement__Group__0__Impl"
    // InternalAPIMappingLanguage.g:5292:1: rule__ReturnStatement__Group__0__Impl : ( () ) ;
    public final void rule__ReturnStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5296:1: ( ( () ) )
            // InternalAPIMappingLanguage.g:5297:1: ( () )
            {
            // InternalAPIMappingLanguage.g:5297:1: ( () )
            // InternalAPIMappingLanguage.g:5298:1: ()
            {
             before(grammarAccess.getReturnStatementAccess().getReturnStatementAction_0()); 
            // InternalAPIMappingLanguage.g:5299:1: ()
            // InternalAPIMappingLanguage.g:5301:1: 
            {
            }

             after(grammarAccess.getReturnStatementAccess().getReturnStatementAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnStatement__Group__0__Impl"


    // $ANTLR start "rule__ReturnStatement__Group__1"
    // InternalAPIMappingLanguage.g:5311:1: rule__ReturnStatement__Group__1 : rule__ReturnStatement__Group__1__Impl rule__ReturnStatement__Group__2 ;
    public final void rule__ReturnStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5315:1: ( rule__ReturnStatement__Group__1__Impl rule__ReturnStatement__Group__2 )
            // InternalAPIMappingLanguage.g:5316:2: rule__ReturnStatement__Group__1__Impl rule__ReturnStatement__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__ReturnStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ReturnStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnStatement__Group__1"


    // $ANTLR start "rule__ReturnStatement__Group__1__Impl"
    // InternalAPIMappingLanguage.g:5323:1: rule__ReturnStatement__Group__1__Impl : ( 'return' ) ;
    public final void rule__ReturnStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5327:1: ( ( 'return' ) )
            // InternalAPIMappingLanguage.g:5328:1: ( 'return' )
            {
            // InternalAPIMappingLanguage.g:5328:1: ( 'return' )
            // InternalAPIMappingLanguage.g:5329:1: 'return'
            {
             before(grammarAccess.getReturnStatementAccess().getReturnKeyword_1()); 
            match(input,62,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getReturnStatementAccess().getReturnKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnStatement__Group__1__Impl"


    // $ANTLR start "rule__ReturnStatement__Group__2"
    // InternalAPIMappingLanguage.g:5342:1: rule__ReturnStatement__Group__2 : rule__ReturnStatement__Group__2__Impl rule__ReturnStatement__Group__3 ;
    public final void rule__ReturnStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5346:1: ( rule__ReturnStatement__Group__2__Impl rule__ReturnStatement__Group__3 )
            // InternalAPIMappingLanguage.g:5347:2: rule__ReturnStatement__Group__2__Impl rule__ReturnStatement__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__ReturnStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ReturnStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnStatement__Group__2"


    // $ANTLR start "rule__ReturnStatement__Group__2__Impl"
    // InternalAPIMappingLanguage.g:5354:1: rule__ReturnStatement__Group__2__Impl : ( ( rule__ReturnStatement__ExpressionAssignment_2 ) ) ;
    public final void rule__ReturnStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5358:1: ( ( ( rule__ReturnStatement__ExpressionAssignment_2 ) ) )
            // InternalAPIMappingLanguage.g:5359:1: ( ( rule__ReturnStatement__ExpressionAssignment_2 ) )
            {
            // InternalAPIMappingLanguage.g:5359:1: ( ( rule__ReturnStatement__ExpressionAssignment_2 ) )
            // InternalAPIMappingLanguage.g:5360:1: ( rule__ReturnStatement__ExpressionAssignment_2 )
            {
             before(grammarAccess.getReturnStatementAccess().getExpressionAssignment_2()); 
            // InternalAPIMappingLanguage.g:5361:1: ( rule__ReturnStatement__ExpressionAssignment_2 )
            // InternalAPIMappingLanguage.g:5361:2: rule__ReturnStatement__ExpressionAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ReturnStatement__ExpressionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getReturnStatementAccess().getExpressionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnStatement__Group__2__Impl"


    // $ANTLR start "rule__ReturnStatement__Group__3"
    // InternalAPIMappingLanguage.g:5371:1: rule__ReturnStatement__Group__3 : rule__ReturnStatement__Group__3__Impl ;
    public final void rule__ReturnStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5375:1: ( rule__ReturnStatement__Group__3__Impl )
            // InternalAPIMappingLanguage.g:5376:2: rule__ReturnStatement__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ReturnStatement__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnStatement__Group__3"


    // $ANTLR start "rule__ReturnStatement__Group__3__Impl"
    // InternalAPIMappingLanguage.g:5382:1: rule__ReturnStatement__Group__3__Impl : ( ';' ) ;
    public final void rule__ReturnStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5386:1: ( ( ';' ) )
            // InternalAPIMappingLanguage.g:5387:1: ( ';' )
            {
            // InternalAPIMappingLanguage.g:5387:1: ( ';' )
            // InternalAPIMappingLanguage.g:5388:1: ';'
            {
             before(grammarAccess.getReturnStatementAccess().getSemicolonKeyword_3()); 
            match(input,53,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getReturnStatementAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnStatement__Group__3__Impl"


    // $ANTLR start "rule__OperationCallStatement__Group__0"
    // InternalAPIMappingLanguage.g:5409:1: rule__OperationCallStatement__Group__0 : rule__OperationCallStatement__Group__0__Impl rule__OperationCallStatement__Group__1 ;
    public final void rule__OperationCallStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5413:1: ( rule__OperationCallStatement__Group__0__Impl rule__OperationCallStatement__Group__1 )
            // InternalAPIMappingLanguage.g:5414:2: rule__OperationCallStatement__Group__0__Impl rule__OperationCallStatement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__OperationCallStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__OperationCallStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationCallStatement__Group__0"


    // $ANTLR start "rule__OperationCallStatement__Group__0__Impl"
    // InternalAPIMappingLanguage.g:5421:1: rule__OperationCallStatement__Group__0__Impl : ( ruleOperationCall ) ;
    public final void rule__OperationCallStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5425:1: ( ( ruleOperationCall ) )
            // InternalAPIMappingLanguage.g:5426:1: ( ruleOperationCall )
            {
            // InternalAPIMappingLanguage.g:5426:1: ( ruleOperationCall )
            // InternalAPIMappingLanguage.g:5427:1: ruleOperationCall
            {
             before(grammarAccess.getOperationCallStatementAccess().getOperationCallParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleOperationCall();

            state._fsp--;

             after(grammarAccess.getOperationCallStatementAccess().getOperationCallParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationCallStatement__Group__0__Impl"


    // $ANTLR start "rule__OperationCallStatement__Group__1"
    // InternalAPIMappingLanguage.g:5438:1: rule__OperationCallStatement__Group__1 : rule__OperationCallStatement__Group__1__Impl ;
    public final void rule__OperationCallStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5442:1: ( rule__OperationCallStatement__Group__1__Impl )
            // InternalAPIMappingLanguage.g:5443:2: rule__OperationCallStatement__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OperationCallStatement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationCallStatement__Group__1"


    // $ANTLR start "rule__OperationCallStatement__Group__1__Impl"
    // InternalAPIMappingLanguage.g:5449:1: rule__OperationCallStatement__Group__1__Impl : ( ';' ) ;
    public final void rule__OperationCallStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5453:1: ( ( ';' ) )
            // InternalAPIMappingLanguage.g:5454:1: ( ';' )
            {
            // InternalAPIMappingLanguage.g:5454:1: ( ';' )
            // InternalAPIMappingLanguage.g:5455:1: ';'
            {
             before(grammarAccess.getOperationCallStatementAccess().getSemicolonKeyword_1()); 
            match(input,53,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getOperationCallStatementAccess().getSemicolonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationCallStatement__Group__1__Impl"


    // $ANTLR start "rule__Assignment__Group__0"
    // InternalAPIMappingLanguage.g:5472:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5476:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalAPIMappingLanguage.g:5477:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__Assignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Assignment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__0"


    // $ANTLR start "rule__Assignment__Group__0__Impl"
    // InternalAPIMappingLanguage.g:5484:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__Lhs_typedNamedElementExpressionAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5488:1: ( ( ( rule__Assignment__Lhs_typedNamedElementExpressionAssignment_0 ) ) )
            // InternalAPIMappingLanguage.g:5489:1: ( ( rule__Assignment__Lhs_typedNamedElementExpressionAssignment_0 ) )
            {
            // InternalAPIMappingLanguage.g:5489:1: ( ( rule__Assignment__Lhs_typedNamedElementExpressionAssignment_0 ) )
            // InternalAPIMappingLanguage.g:5490:1: ( rule__Assignment__Lhs_typedNamedElementExpressionAssignment_0 )
            {
             before(grammarAccess.getAssignmentAccess().getLhs_typedNamedElementExpressionAssignment_0()); 
            // InternalAPIMappingLanguage.g:5491:1: ( rule__Assignment__Lhs_typedNamedElementExpressionAssignment_0 )
            // InternalAPIMappingLanguage.g:5491:2: rule__Assignment__Lhs_typedNamedElementExpressionAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Assignment__Lhs_typedNamedElementExpressionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getLhs_typedNamedElementExpressionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__0__Impl"


    // $ANTLR start "rule__Assignment__Group__1"
    // InternalAPIMappingLanguage.g:5501:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5505:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalAPIMappingLanguage.g:5506:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__Assignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Assignment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__1"


    // $ANTLR start "rule__Assignment__Group__1__Impl"
    // InternalAPIMappingLanguage.g:5513:1: rule__Assignment__Group__1__Impl : ( ( rule__Assignment__Alternatives_1 ) ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5517:1: ( ( ( rule__Assignment__Alternatives_1 ) ) )
            // InternalAPIMappingLanguage.g:5518:1: ( ( rule__Assignment__Alternatives_1 ) )
            {
            // InternalAPIMappingLanguage.g:5518:1: ( ( rule__Assignment__Alternatives_1 ) )
            // InternalAPIMappingLanguage.g:5519:1: ( rule__Assignment__Alternatives_1 )
            {
             before(grammarAccess.getAssignmentAccess().getAlternatives_1()); 
            // InternalAPIMappingLanguage.g:5520:1: ( rule__Assignment__Alternatives_1 )
            // InternalAPIMappingLanguage.g:5520:2: rule__Assignment__Alternatives_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Assignment__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__1__Impl"


    // $ANTLR start "rule__Assignment__Group__2"
    // InternalAPIMappingLanguage.g:5530:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5534:1: ( rule__Assignment__Group__2__Impl )
            // InternalAPIMappingLanguage.g:5535:2: rule__Assignment__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Assignment__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__2"


    // $ANTLR start "rule__Assignment__Group__2__Impl"
    // InternalAPIMappingLanguage.g:5541:1: rule__Assignment__Group__2__Impl : ( ';' ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5545:1: ( ( ';' ) )
            // InternalAPIMappingLanguage.g:5546:1: ( ';' )
            {
            // InternalAPIMappingLanguage.g:5546:1: ( ';' )
            // InternalAPIMappingLanguage.g:5547:1: ';'
            {
             before(grammarAccess.getAssignmentAccess().getSemicolonKeyword_2()); 
            match(input,53,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAssignmentAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__2__Impl"


    // $ANTLR start "rule__Assignment__Group_1_0__0"
    // InternalAPIMappingLanguage.g:5566:1: rule__Assignment__Group_1_0__0 : rule__Assignment__Group_1_0__0__Impl rule__Assignment__Group_1_0__1 ;
    public final void rule__Assignment__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5570:1: ( rule__Assignment__Group_1_0__0__Impl rule__Assignment__Group_1_0__1 )
            // InternalAPIMappingLanguage.g:5571:2: rule__Assignment__Group_1_0__0__Impl rule__Assignment__Group_1_0__1
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__Assignment__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Assignment__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_1_0__0"


    // $ANTLR start "rule__Assignment__Group_1_0__0__Impl"
    // InternalAPIMappingLanguage.g:5578:1: rule__Assignment__Group_1_0__0__Impl : ( ( rule__Assignment__AssignOperatorAssignment_1_0_0 ) ) ;
    public final void rule__Assignment__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5582:1: ( ( ( rule__Assignment__AssignOperatorAssignment_1_0_0 ) ) )
            // InternalAPIMappingLanguage.g:5583:1: ( ( rule__Assignment__AssignOperatorAssignment_1_0_0 ) )
            {
            // InternalAPIMappingLanguage.g:5583:1: ( ( rule__Assignment__AssignOperatorAssignment_1_0_0 ) )
            // InternalAPIMappingLanguage.g:5584:1: ( rule__Assignment__AssignOperatorAssignment_1_0_0 )
            {
             before(grammarAccess.getAssignmentAccess().getAssignOperatorAssignment_1_0_0()); 
            // InternalAPIMappingLanguage.g:5585:1: ( rule__Assignment__AssignOperatorAssignment_1_0_0 )
            // InternalAPIMappingLanguage.g:5585:2: rule__Assignment__AssignOperatorAssignment_1_0_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Assignment__AssignOperatorAssignment_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getAssignOperatorAssignment_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_1_0__0__Impl"


    // $ANTLR start "rule__Assignment__Group_1_0__1"
    // InternalAPIMappingLanguage.g:5595:1: rule__Assignment__Group_1_0__1 : rule__Assignment__Group_1_0__1__Impl ;
    public final void rule__Assignment__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5599:1: ( rule__Assignment__Group_1_0__1__Impl )
            // InternalAPIMappingLanguage.g:5600:2: rule__Assignment__Group_1_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Assignment__Group_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_1_0__1"


    // $ANTLR start "rule__Assignment__Group_1_0__1__Impl"
    // InternalAPIMappingLanguage.g:5606:1: rule__Assignment__Group_1_0__1__Impl : ( ( rule__Assignment__Rhs_assignExpressionAssignment_1_0_1 ) ) ;
    public final void rule__Assignment__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5610:1: ( ( ( rule__Assignment__Rhs_assignExpressionAssignment_1_0_1 ) ) )
            // InternalAPIMappingLanguage.g:5611:1: ( ( rule__Assignment__Rhs_assignExpressionAssignment_1_0_1 ) )
            {
            // InternalAPIMappingLanguage.g:5611:1: ( ( rule__Assignment__Rhs_assignExpressionAssignment_1_0_1 ) )
            // InternalAPIMappingLanguage.g:5612:1: ( rule__Assignment__Rhs_assignExpressionAssignment_1_0_1 )
            {
             before(grammarAccess.getAssignmentAccess().getRhs_assignExpressionAssignment_1_0_1()); 
            // InternalAPIMappingLanguage.g:5613:1: ( rule__Assignment__Rhs_assignExpressionAssignment_1_0_1 )
            // InternalAPIMappingLanguage.g:5613:2: rule__Assignment__Rhs_assignExpressionAssignment_1_0_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Assignment__Rhs_assignExpressionAssignment_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getRhs_assignExpressionAssignment_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_1_0__1__Impl"


    // $ANTLR start "rule__ArrayInitializeExpression__Group__0"
    // InternalAPIMappingLanguage.g:5627:1: rule__ArrayInitializeExpression__Group__0 : rule__ArrayInitializeExpression__Group__0__Impl rule__ArrayInitializeExpression__Group__1 ;
    public final void rule__ArrayInitializeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5631:1: ( rule__ArrayInitializeExpression__Group__0__Impl rule__ArrayInitializeExpression__Group__1 )
            // InternalAPIMappingLanguage.g:5632:2: rule__ArrayInitializeExpression__Group__0__Impl rule__ArrayInitializeExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__ArrayInitializeExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ArrayInitializeExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayInitializeExpression__Group__0"


    // $ANTLR start "rule__ArrayInitializeExpression__Group__0__Impl"
    // InternalAPIMappingLanguage.g:5639:1: rule__ArrayInitializeExpression__Group__0__Impl : ( '[' ) ;
    public final void rule__ArrayInitializeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5643:1: ( ( '[' ) )
            // InternalAPIMappingLanguage.g:5644:1: ( '[' )
            {
            // InternalAPIMappingLanguage.g:5644:1: ( '[' )
            // InternalAPIMappingLanguage.g:5645:1: '['
            {
             before(grammarAccess.getArrayInitializeExpressionAccess().getLeftSquareBracketKeyword_0()); 
            match(input,63,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getArrayInitializeExpressionAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayInitializeExpression__Group__0__Impl"


    // $ANTLR start "rule__ArrayInitializeExpression__Group__1"
    // InternalAPIMappingLanguage.g:5658:1: rule__ArrayInitializeExpression__Group__1 : rule__ArrayInitializeExpression__Group__1__Impl rule__ArrayInitializeExpression__Group__2 ;
    public final void rule__ArrayInitializeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5662:1: ( rule__ArrayInitializeExpression__Group__1__Impl rule__ArrayInitializeExpression__Group__2 )
            // InternalAPIMappingLanguage.g:5663:2: rule__ArrayInitializeExpression__Group__1__Impl rule__ArrayInitializeExpression__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_33);
            rule__ArrayInitializeExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ArrayInitializeExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayInitializeExpression__Group__1"


    // $ANTLR start "rule__ArrayInitializeExpression__Group__1__Impl"
    // InternalAPIMappingLanguage.g:5670:1: rule__ArrayInitializeExpression__Group__1__Impl : ( ( rule__ArrayInitializeExpression__ExpressionsAssignment_1 ) ) ;
    public final void rule__ArrayInitializeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5674:1: ( ( ( rule__ArrayInitializeExpression__ExpressionsAssignment_1 ) ) )
            // InternalAPIMappingLanguage.g:5675:1: ( ( rule__ArrayInitializeExpression__ExpressionsAssignment_1 ) )
            {
            // InternalAPIMappingLanguage.g:5675:1: ( ( rule__ArrayInitializeExpression__ExpressionsAssignment_1 ) )
            // InternalAPIMappingLanguage.g:5676:1: ( rule__ArrayInitializeExpression__ExpressionsAssignment_1 )
            {
             before(grammarAccess.getArrayInitializeExpressionAccess().getExpressionsAssignment_1()); 
            // InternalAPIMappingLanguage.g:5677:1: ( rule__ArrayInitializeExpression__ExpressionsAssignment_1 )
            // InternalAPIMappingLanguage.g:5677:2: rule__ArrayInitializeExpression__ExpressionsAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ArrayInitializeExpression__ExpressionsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getArrayInitializeExpressionAccess().getExpressionsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayInitializeExpression__Group__1__Impl"


    // $ANTLR start "rule__ArrayInitializeExpression__Group__2"
    // InternalAPIMappingLanguage.g:5687:1: rule__ArrayInitializeExpression__Group__2 : rule__ArrayInitializeExpression__Group__2__Impl rule__ArrayInitializeExpression__Group__3 ;
    public final void rule__ArrayInitializeExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5691:1: ( rule__ArrayInitializeExpression__Group__2__Impl rule__ArrayInitializeExpression__Group__3 )
            // InternalAPIMappingLanguage.g:5692:2: rule__ArrayInitializeExpression__Group__2__Impl rule__ArrayInitializeExpression__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_33);
            rule__ArrayInitializeExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ArrayInitializeExpression__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayInitializeExpression__Group__2"


    // $ANTLR start "rule__ArrayInitializeExpression__Group__2__Impl"
    // InternalAPIMappingLanguage.g:5699:1: rule__ArrayInitializeExpression__Group__2__Impl : ( ( rule__ArrayInitializeExpression__Group_2__0 )* ) ;
    public final void rule__ArrayInitializeExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5703:1: ( ( ( rule__ArrayInitializeExpression__Group_2__0 )* ) )
            // InternalAPIMappingLanguage.g:5704:1: ( ( rule__ArrayInitializeExpression__Group_2__0 )* )
            {
            // InternalAPIMappingLanguage.g:5704:1: ( ( rule__ArrayInitializeExpression__Group_2__0 )* )
            // InternalAPIMappingLanguage.g:5705:1: ( rule__ArrayInitializeExpression__Group_2__0 )*
            {
             before(grammarAccess.getArrayInitializeExpressionAccess().getGroup_2()); 
            // InternalAPIMappingLanguage.g:5706:1: ( rule__ArrayInitializeExpression__Group_2__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==42) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalAPIMappingLanguage.g:5706:2: rule__ArrayInitializeExpression__Group_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_10);
            	    rule__ArrayInitializeExpression__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             after(grammarAccess.getArrayInitializeExpressionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayInitializeExpression__Group__2__Impl"


    // $ANTLR start "rule__ArrayInitializeExpression__Group__3"
    // InternalAPIMappingLanguage.g:5716:1: rule__ArrayInitializeExpression__Group__3 : rule__ArrayInitializeExpression__Group__3__Impl ;
    public final void rule__ArrayInitializeExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5720:1: ( rule__ArrayInitializeExpression__Group__3__Impl )
            // InternalAPIMappingLanguage.g:5721:2: rule__ArrayInitializeExpression__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ArrayInitializeExpression__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayInitializeExpression__Group__3"


    // $ANTLR start "rule__ArrayInitializeExpression__Group__3__Impl"
    // InternalAPIMappingLanguage.g:5727:1: rule__ArrayInitializeExpression__Group__3__Impl : ( ']' ) ;
    public final void rule__ArrayInitializeExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5731:1: ( ( ']' ) )
            // InternalAPIMappingLanguage.g:5732:1: ( ']' )
            {
            // InternalAPIMappingLanguage.g:5732:1: ( ']' )
            // InternalAPIMappingLanguage.g:5733:1: ']'
            {
             before(grammarAccess.getArrayInitializeExpressionAccess().getRightSquareBracketKeyword_3()); 
            match(input,64,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getArrayInitializeExpressionAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayInitializeExpression__Group__3__Impl"


    // $ANTLR start "rule__ArrayInitializeExpression__Group_2__0"
    // InternalAPIMappingLanguage.g:5754:1: rule__ArrayInitializeExpression__Group_2__0 : rule__ArrayInitializeExpression__Group_2__0__Impl rule__ArrayInitializeExpression__Group_2__1 ;
    public final void rule__ArrayInitializeExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5758:1: ( rule__ArrayInitializeExpression__Group_2__0__Impl rule__ArrayInitializeExpression__Group_2__1 )
            // InternalAPIMappingLanguage.g:5759:2: rule__ArrayInitializeExpression__Group_2__0__Impl rule__ArrayInitializeExpression__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__ArrayInitializeExpression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ArrayInitializeExpression__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayInitializeExpression__Group_2__0"


    // $ANTLR start "rule__ArrayInitializeExpression__Group_2__0__Impl"
    // InternalAPIMappingLanguage.g:5766:1: rule__ArrayInitializeExpression__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ArrayInitializeExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5770:1: ( ( ',' ) )
            // InternalAPIMappingLanguage.g:5771:1: ( ',' )
            {
            // InternalAPIMappingLanguage.g:5771:1: ( ',' )
            // InternalAPIMappingLanguage.g:5772:1: ','
            {
             before(grammarAccess.getArrayInitializeExpressionAccess().getCommaKeyword_2_0()); 
            match(input,42,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getArrayInitializeExpressionAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayInitializeExpression__Group_2__0__Impl"


    // $ANTLR start "rule__ArrayInitializeExpression__Group_2__1"
    // InternalAPIMappingLanguage.g:5785:1: rule__ArrayInitializeExpression__Group_2__1 : rule__ArrayInitializeExpression__Group_2__1__Impl ;
    public final void rule__ArrayInitializeExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5789:1: ( rule__ArrayInitializeExpression__Group_2__1__Impl )
            // InternalAPIMappingLanguage.g:5790:2: rule__ArrayInitializeExpression__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ArrayInitializeExpression__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayInitializeExpression__Group_2__1"


    // $ANTLR start "rule__ArrayInitializeExpression__Group_2__1__Impl"
    // InternalAPIMappingLanguage.g:5796:1: rule__ArrayInitializeExpression__Group_2__1__Impl : ( ( rule__ArrayInitializeExpression__ExpressionsAssignment_2_1 ) ) ;
    public final void rule__ArrayInitializeExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5800:1: ( ( ( rule__ArrayInitializeExpression__ExpressionsAssignment_2_1 ) ) )
            // InternalAPIMappingLanguage.g:5801:1: ( ( rule__ArrayInitializeExpression__ExpressionsAssignment_2_1 ) )
            {
            // InternalAPIMappingLanguage.g:5801:1: ( ( rule__ArrayInitializeExpression__ExpressionsAssignment_2_1 ) )
            // InternalAPIMappingLanguage.g:5802:1: ( rule__ArrayInitializeExpression__ExpressionsAssignment_2_1 )
            {
             before(grammarAccess.getArrayInitializeExpressionAccess().getExpressionsAssignment_2_1()); 
            // InternalAPIMappingLanguage.g:5803:1: ( rule__ArrayInitializeExpression__ExpressionsAssignment_2_1 )
            // InternalAPIMappingLanguage.g:5803:2: rule__ArrayInitializeExpression__ExpressionsAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ArrayInitializeExpression__ExpressionsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getArrayInitializeExpressionAccess().getExpressionsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayInitializeExpression__Group_2__1__Impl"


    // $ANTLR start "rule__LocalVariableDeclaration__Group__0"
    // InternalAPIMappingLanguage.g:5817:1: rule__LocalVariableDeclaration__Group__0 : rule__LocalVariableDeclaration__Group__0__Impl rule__LocalVariableDeclaration__Group__1 ;
    public final void rule__LocalVariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5821:1: ( rule__LocalVariableDeclaration__Group__0__Impl rule__LocalVariableDeclaration__Group__1 )
            // InternalAPIMappingLanguage.g:5822:2: rule__LocalVariableDeclaration__Group__0__Impl rule__LocalVariableDeclaration__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__LocalVariableDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__LocalVariableDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVariableDeclaration__Group__0"


    // $ANTLR start "rule__LocalVariableDeclaration__Group__0__Impl"
    // InternalAPIMappingLanguage.g:5829:1: rule__LocalVariableDeclaration__Group__0__Impl : ( ( rule__LocalVariableDeclaration__DataTypeAssignment_0 ) ) ;
    public final void rule__LocalVariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5833:1: ( ( ( rule__LocalVariableDeclaration__DataTypeAssignment_0 ) ) )
            // InternalAPIMappingLanguage.g:5834:1: ( ( rule__LocalVariableDeclaration__DataTypeAssignment_0 ) )
            {
            // InternalAPIMappingLanguage.g:5834:1: ( ( rule__LocalVariableDeclaration__DataTypeAssignment_0 ) )
            // InternalAPIMappingLanguage.g:5835:1: ( rule__LocalVariableDeclaration__DataTypeAssignment_0 )
            {
             before(grammarAccess.getLocalVariableDeclarationAccess().getDataTypeAssignment_0()); 
            // InternalAPIMappingLanguage.g:5836:1: ( rule__LocalVariableDeclaration__DataTypeAssignment_0 )
            // InternalAPIMappingLanguage.g:5836:2: rule__LocalVariableDeclaration__DataTypeAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LocalVariableDeclaration__DataTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLocalVariableDeclarationAccess().getDataTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVariableDeclaration__Group__0__Impl"


    // $ANTLR start "rule__LocalVariableDeclaration__Group__1"
    // InternalAPIMappingLanguage.g:5846:1: rule__LocalVariableDeclaration__Group__1 : rule__LocalVariableDeclaration__Group__1__Impl rule__LocalVariableDeclaration__Group__2 ;
    public final void rule__LocalVariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5850:1: ( rule__LocalVariableDeclaration__Group__1__Impl rule__LocalVariableDeclaration__Group__2 )
            // InternalAPIMappingLanguage.g:5851:2: rule__LocalVariableDeclaration__Group__1__Impl rule__LocalVariableDeclaration__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_34);
            rule__LocalVariableDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__LocalVariableDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVariableDeclaration__Group__1"


    // $ANTLR start "rule__LocalVariableDeclaration__Group__1__Impl"
    // InternalAPIMappingLanguage.g:5858:1: rule__LocalVariableDeclaration__Group__1__Impl : ( ( rule__LocalVariableDeclaration__NameAssignment_1 ) ) ;
    public final void rule__LocalVariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5862:1: ( ( ( rule__LocalVariableDeclaration__NameAssignment_1 ) ) )
            // InternalAPIMappingLanguage.g:5863:1: ( ( rule__LocalVariableDeclaration__NameAssignment_1 ) )
            {
            // InternalAPIMappingLanguage.g:5863:1: ( ( rule__LocalVariableDeclaration__NameAssignment_1 ) )
            // InternalAPIMappingLanguage.g:5864:1: ( rule__LocalVariableDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getLocalVariableDeclarationAccess().getNameAssignment_1()); 
            // InternalAPIMappingLanguage.g:5865:1: ( rule__LocalVariableDeclaration__NameAssignment_1 )
            // InternalAPIMappingLanguage.g:5865:2: rule__LocalVariableDeclaration__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LocalVariableDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLocalVariableDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVariableDeclaration__Group__1__Impl"


    // $ANTLR start "rule__LocalVariableDeclaration__Group__2"
    // InternalAPIMappingLanguage.g:5875:1: rule__LocalVariableDeclaration__Group__2 : rule__LocalVariableDeclaration__Group__2__Impl rule__LocalVariableDeclaration__Group__3 ;
    public final void rule__LocalVariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5879:1: ( rule__LocalVariableDeclaration__Group__2__Impl rule__LocalVariableDeclaration__Group__3 )
            // InternalAPIMappingLanguage.g:5880:2: rule__LocalVariableDeclaration__Group__2__Impl rule__LocalVariableDeclaration__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_34);
            rule__LocalVariableDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__LocalVariableDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVariableDeclaration__Group__2"


    // $ANTLR start "rule__LocalVariableDeclaration__Group__2__Impl"
    // InternalAPIMappingLanguage.g:5887:1: rule__LocalVariableDeclaration__Group__2__Impl : ( ( rule__LocalVariableDeclaration__Group_2__0 )? ) ;
    public final void rule__LocalVariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5891:1: ( ( ( rule__LocalVariableDeclaration__Group_2__0 )? ) )
            // InternalAPIMappingLanguage.g:5892:1: ( ( rule__LocalVariableDeclaration__Group_2__0 )? )
            {
            // InternalAPIMappingLanguage.g:5892:1: ( ( rule__LocalVariableDeclaration__Group_2__0 )? )
            // InternalAPIMappingLanguage.g:5893:1: ( rule__LocalVariableDeclaration__Group_2__0 )?
            {
             before(grammarAccess.getLocalVariableDeclarationAccess().getGroup_2()); 
            // InternalAPIMappingLanguage.g:5894:1: ( rule__LocalVariableDeclaration__Group_2__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==19) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalAPIMappingLanguage.g:5894:2: rule__LocalVariableDeclaration__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__LocalVariableDeclaration__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLocalVariableDeclarationAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVariableDeclaration__Group__2__Impl"


    // $ANTLR start "rule__LocalVariableDeclaration__Group__3"
    // InternalAPIMappingLanguage.g:5904:1: rule__LocalVariableDeclaration__Group__3 : rule__LocalVariableDeclaration__Group__3__Impl ;
    public final void rule__LocalVariableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5908:1: ( rule__LocalVariableDeclaration__Group__3__Impl )
            // InternalAPIMappingLanguage.g:5909:2: rule__LocalVariableDeclaration__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LocalVariableDeclaration__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVariableDeclaration__Group__3"


    // $ANTLR start "rule__LocalVariableDeclaration__Group__3__Impl"
    // InternalAPIMappingLanguage.g:5915:1: rule__LocalVariableDeclaration__Group__3__Impl : ( ';' ) ;
    public final void rule__LocalVariableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5919:1: ( ( ';' ) )
            // InternalAPIMappingLanguage.g:5920:1: ( ';' )
            {
            // InternalAPIMappingLanguage.g:5920:1: ( ';' )
            // InternalAPIMappingLanguage.g:5921:1: ';'
            {
             before(grammarAccess.getLocalVariableDeclarationAccess().getSemicolonKeyword_3()); 
            match(input,53,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getLocalVariableDeclarationAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVariableDeclaration__Group__3__Impl"


    // $ANTLR start "rule__LocalVariableDeclaration__Group_2__0"
    // InternalAPIMappingLanguage.g:5942:1: rule__LocalVariableDeclaration__Group_2__0 : rule__LocalVariableDeclaration__Group_2__0__Impl rule__LocalVariableDeclaration__Group_2__1 ;
    public final void rule__LocalVariableDeclaration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5946:1: ( rule__LocalVariableDeclaration__Group_2__0__Impl rule__LocalVariableDeclaration__Group_2__1 )
            // InternalAPIMappingLanguage.g:5947:2: rule__LocalVariableDeclaration__Group_2__0__Impl rule__LocalVariableDeclaration__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__LocalVariableDeclaration__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__LocalVariableDeclaration__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVariableDeclaration__Group_2__0"


    // $ANTLR start "rule__LocalVariableDeclaration__Group_2__0__Impl"
    // InternalAPIMappingLanguage.g:5954:1: rule__LocalVariableDeclaration__Group_2__0__Impl : ( ':=' ) ;
    public final void rule__LocalVariableDeclaration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5958:1: ( ( ':=' ) )
            // InternalAPIMappingLanguage.g:5959:1: ( ':=' )
            {
            // InternalAPIMappingLanguage.g:5959:1: ( ':=' )
            // InternalAPIMappingLanguage.g:5960:1: ':='
            {
             before(grammarAccess.getLocalVariableDeclarationAccess().getColonEqualsSignKeyword_2_0()); 
            match(input,19,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getLocalVariableDeclarationAccess().getColonEqualsSignKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVariableDeclaration__Group_2__0__Impl"


    // $ANTLR start "rule__LocalVariableDeclaration__Group_2__1"
    // InternalAPIMappingLanguage.g:5973:1: rule__LocalVariableDeclaration__Group_2__1 : rule__LocalVariableDeclaration__Group_2__1__Impl ;
    public final void rule__LocalVariableDeclaration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5977:1: ( rule__LocalVariableDeclaration__Group_2__1__Impl )
            // InternalAPIMappingLanguage.g:5978:2: rule__LocalVariableDeclaration__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LocalVariableDeclaration__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVariableDeclaration__Group_2__1"


    // $ANTLR start "rule__LocalVariableDeclaration__Group_2__1__Impl"
    // InternalAPIMappingLanguage.g:5984:1: rule__LocalVariableDeclaration__Group_2__1__Impl : ( ( rule__LocalVariableDeclaration__InitializeExpressionAssignment_2_1 ) ) ;
    public final void rule__LocalVariableDeclaration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:5988:1: ( ( ( rule__LocalVariableDeclaration__InitializeExpressionAssignment_2_1 ) ) )
            // InternalAPIMappingLanguage.g:5989:1: ( ( rule__LocalVariableDeclaration__InitializeExpressionAssignment_2_1 ) )
            {
            // InternalAPIMappingLanguage.g:5989:1: ( ( rule__LocalVariableDeclaration__InitializeExpressionAssignment_2_1 ) )
            // InternalAPIMappingLanguage.g:5990:1: ( rule__LocalVariableDeclaration__InitializeExpressionAssignment_2_1 )
            {
             before(grammarAccess.getLocalVariableDeclarationAccess().getInitializeExpressionAssignment_2_1()); 
            // InternalAPIMappingLanguage.g:5991:1: ( rule__LocalVariableDeclaration__InitializeExpressionAssignment_2_1 )
            // InternalAPIMappingLanguage.g:5991:2: rule__LocalVariableDeclaration__InitializeExpressionAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LocalVariableDeclaration__InitializeExpressionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getLocalVariableDeclarationAccess().getInitializeExpressionAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVariableDeclaration__Group_2__1__Impl"


    // $ANTLR start "rule__LocalConstantDeclaration__Group__0"
    // InternalAPIMappingLanguage.g:6005:1: rule__LocalConstantDeclaration__Group__0 : rule__LocalConstantDeclaration__Group__0__Impl rule__LocalConstantDeclaration__Group__1 ;
    public final void rule__LocalConstantDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6009:1: ( rule__LocalConstantDeclaration__Group__0__Impl rule__LocalConstantDeclaration__Group__1 )
            // InternalAPIMappingLanguage.g:6010:2: rule__LocalConstantDeclaration__Group__0__Impl rule__LocalConstantDeclaration__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__LocalConstantDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__LocalConstantDeclaration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalConstantDeclaration__Group__0"


    // $ANTLR start "rule__LocalConstantDeclaration__Group__0__Impl"
    // InternalAPIMappingLanguage.g:6017:1: rule__LocalConstantDeclaration__Group__0__Impl : ( ( rule__LocalConstantDeclaration__ConstantAssignment_0 ) ) ;
    public final void rule__LocalConstantDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6021:1: ( ( ( rule__LocalConstantDeclaration__ConstantAssignment_0 ) ) )
            // InternalAPIMappingLanguage.g:6022:1: ( ( rule__LocalConstantDeclaration__ConstantAssignment_0 ) )
            {
            // InternalAPIMappingLanguage.g:6022:1: ( ( rule__LocalConstantDeclaration__ConstantAssignment_0 ) )
            // InternalAPIMappingLanguage.g:6023:1: ( rule__LocalConstantDeclaration__ConstantAssignment_0 )
            {
             before(grammarAccess.getLocalConstantDeclarationAccess().getConstantAssignment_0()); 
            // InternalAPIMappingLanguage.g:6024:1: ( rule__LocalConstantDeclaration__ConstantAssignment_0 )
            // InternalAPIMappingLanguage.g:6024:2: rule__LocalConstantDeclaration__ConstantAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LocalConstantDeclaration__ConstantAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLocalConstantDeclarationAccess().getConstantAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalConstantDeclaration__Group__0__Impl"


    // $ANTLR start "rule__LocalConstantDeclaration__Group__1"
    // InternalAPIMappingLanguage.g:6034:1: rule__LocalConstantDeclaration__Group__1 : rule__LocalConstantDeclaration__Group__1__Impl rule__LocalConstantDeclaration__Group__2 ;
    public final void rule__LocalConstantDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6038:1: ( rule__LocalConstantDeclaration__Group__1__Impl rule__LocalConstantDeclaration__Group__2 )
            // InternalAPIMappingLanguage.g:6039:2: rule__LocalConstantDeclaration__Group__1__Impl rule__LocalConstantDeclaration__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__LocalConstantDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__LocalConstantDeclaration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalConstantDeclaration__Group__1"


    // $ANTLR start "rule__LocalConstantDeclaration__Group__1__Impl"
    // InternalAPIMappingLanguage.g:6046:1: rule__LocalConstantDeclaration__Group__1__Impl : ( ( rule__LocalConstantDeclaration__DataTypeAssignment_1 ) ) ;
    public final void rule__LocalConstantDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6050:1: ( ( ( rule__LocalConstantDeclaration__DataTypeAssignment_1 ) ) )
            // InternalAPIMappingLanguage.g:6051:1: ( ( rule__LocalConstantDeclaration__DataTypeAssignment_1 ) )
            {
            // InternalAPIMappingLanguage.g:6051:1: ( ( rule__LocalConstantDeclaration__DataTypeAssignment_1 ) )
            // InternalAPIMappingLanguage.g:6052:1: ( rule__LocalConstantDeclaration__DataTypeAssignment_1 )
            {
             before(grammarAccess.getLocalConstantDeclarationAccess().getDataTypeAssignment_1()); 
            // InternalAPIMappingLanguage.g:6053:1: ( rule__LocalConstantDeclaration__DataTypeAssignment_1 )
            // InternalAPIMappingLanguage.g:6053:2: rule__LocalConstantDeclaration__DataTypeAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LocalConstantDeclaration__DataTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLocalConstantDeclarationAccess().getDataTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalConstantDeclaration__Group__1__Impl"


    // $ANTLR start "rule__LocalConstantDeclaration__Group__2"
    // InternalAPIMappingLanguage.g:6063:1: rule__LocalConstantDeclaration__Group__2 : rule__LocalConstantDeclaration__Group__2__Impl rule__LocalConstantDeclaration__Group__3 ;
    public final void rule__LocalConstantDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6067:1: ( rule__LocalConstantDeclaration__Group__2__Impl rule__LocalConstantDeclaration__Group__3 )
            // InternalAPIMappingLanguage.g:6068:2: rule__LocalConstantDeclaration__Group__2__Impl rule__LocalConstantDeclaration__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__LocalConstantDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__LocalConstantDeclaration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalConstantDeclaration__Group__2"


    // $ANTLR start "rule__LocalConstantDeclaration__Group__2__Impl"
    // InternalAPIMappingLanguage.g:6075:1: rule__LocalConstantDeclaration__Group__2__Impl : ( ( rule__LocalConstantDeclaration__NameAssignment_2 ) ) ;
    public final void rule__LocalConstantDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6079:1: ( ( ( rule__LocalConstantDeclaration__NameAssignment_2 ) ) )
            // InternalAPIMappingLanguage.g:6080:1: ( ( rule__LocalConstantDeclaration__NameAssignment_2 ) )
            {
            // InternalAPIMappingLanguage.g:6080:1: ( ( rule__LocalConstantDeclaration__NameAssignment_2 ) )
            // InternalAPIMappingLanguage.g:6081:1: ( rule__LocalConstantDeclaration__NameAssignment_2 )
            {
             before(grammarAccess.getLocalConstantDeclarationAccess().getNameAssignment_2()); 
            // InternalAPIMappingLanguage.g:6082:1: ( rule__LocalConstantDeclaration__NameAssignment_2 )
            // InternalAPIMappingLanguage.g:6082:2: rule__LocalConstantDeclaration__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LocalConstantDeclaration__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLocalConstantDeclarationAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalConstantDeclaration__Group__2__Impl"


    // $ANTLR start "rule__LocalConstantDeclaration__Group__3"
    // InternalAPIMappingLanguage.g:6092:1: rule__LocalConstantDeclaration__Group__3 : rule__LocalConstantDeclaration__Group__3__Impl rule__LocalConstantDeclaration__Group__4 ;
    public final void rule__LocalConstantDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6096:1: ( rule__LocalConstantDeclaration__Group__3__Impl rule__LocalConstantDeclaration__Group__4 )
            // InternalAPIMappingLanguage.g:6097:2: rule__LocalConstantDeclaration__Group__3__Impl rule__LocalConstantDeclaration__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__LocalConstantDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__LocalConstantDeclaration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalConstantDeclaration__Group__3"


    // $ANTLR start "rule__LocalConstantDeclaration__Group__3__Impl"
    // InternalAPIMappingLanguage.g:6104:1: rule__LocalConstantDeclaration__Group__3__Impl : ( ':=' ) ;
    public final void rule__LocalConstantDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6108:1: ( ( ':=' ) )
            // InternalAPIMappingLanguage.g:6109:1: ( ':=' )
            {
            // InternalAPIMappingLanguage.g:6109:1: ( ':=' )
            // InternalAPIMappingLanguage.g:6110:1: ':='
            {
             before(grammarAccess.getLocalConstantDeclarationAccess().getColonEqualsSignKeyword_3()); 
            match(input,19,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getLocalConstantDeclarationAccess().getColonEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalConstantDeclaration__Group__3__Impl"


    // $ANTLR start "rule__LocalConstantDeclaration__Group__4"
    // InternalAPIMappingLanguage.g:6123:1: rule__LocalConstantDeclaration__Group__4 : rule__LocalConstantDeclaration__Group__4__Impl rule__LocalConstantDeclaration__Group__5 ;
    public final void rule__LocalConstantDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6127:1: ( rule__LocalConstantDeclaration__Group__4__Impl rule__LocalConstantDeclaration__Group__5 )
            // InternalAPIMappingLanguage.g:6128:2: rule__LocalConstantDeclaration__Group__4__Impl rule__LocalConstantDeclaration__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__LocalConstantDeclaration__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__LocalConstantDeclaration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalConstantDeclaration__Group__4"


    // $ANTLR start "rule__LocalConstantDeclaration__Group__4__Impl"
    // InternalAPIMappingLanguage.g:6135:1: rule__LocalConstantDeclaration__Group__4__Impl : ( ( rule__LocalConstantDeclaration__InitializeExpressionAssignment_4 ) ) ;
    public final void rule__LocalConstantDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6139:1: ( ( ( rule__LocalConstantDeclaration__InitializeExpressionAssignment_4 ) ) )
            // InternalAPIMappingLanguage.g:6140:1: ( ( rule__LocalConstantDeclaration__InitializeExpressionAssignment_4 ) )
            {
            // InternalAPIMappingLanguage.g:6140:1: ( ( rule__LocalConstantDeclaration__InitializeExpressionAssignment_4 ) )
            // InternalAPIMappingLanguage.g:6141:1: ( rule__LocalConstantDeclaration__InitializeExpressionAssignment_4 )
            {
             before(grammarAccess.getLocalConstantDeclarationAccess().getInitializeExpressionAssignment_4()); 
            // InternalAPIMappingLanguage.g:6142:1: ( rule__LocalConstantDeclaration__InitializeExpressionAssignment_4 )
            // InternalAPIMappingLanguage.g:6142:2: rule__LocalConstantDeclaration__InitializeExpressionAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LocalConstantDeclaration__InitializeExpressionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getLocalConstantDeclarationAccess().getInitializeExpressionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalConstantDeclaration__Group__4__Impl"


    // $ANTLR start "rule__LocalConstantDeclaration__Group__5"
    // InternalAPIMappingLanguage.g:6152:1: rule__LocalConstantDeclaration__Group__5 : rule__LocalConstantDeclaration__Group__5__Impl ;
    public final void rule__LocalConstantDeclaration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6156:1: ( rule__LocalConstantDeclaration__Group__5__Impl )
            // InternalAPIMappingLanguage.g:6157:2: rule__LocalConstantDeclaration__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LocalConstantDeclaration__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalConstantDeclaration__Group__5"


    // $ANTLR start "rule__LocalConstantDeclaration__Group__5__Impl"
    // InternalAPIMappingLanguage.g:6163:1: rule__LocalConstantDeclaration__Group__5__Impl : ( ';' ) ;
    public final void rule__LocalConstantDeclaration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6167:1: ( ( ';' ) )
            // InternalAPIMappingLanguage.g:6168:1: ( ';' )
            {
            // InternalAPIMappingLanguage.g:6168:1: ( ';' )
            // InternalAPIMappingLanguage.g:6169:1: ';'
            {
             before(grammarAccess.getLocalConstantDeclarationAccess().getSemicolonKeyword_5()); 
            match(input,53,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getLocalConstantDeclarationAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalConstantDeclaration__Group__5__Impl"


    // $ANTLR start "rule__NondeterministicChoiceExpression__Group__0"
    // InternalAPIMappingLanguage.g:6194:1: rule__NondeterministicChoiceExpression__Group__0 : rule__NondeterministicChoiceExpression__Group__0__Impl rule__NondeterministicChoiceExpression__Group__1 ;
    public final void rule__NondeterministicChoiceExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6198:1: ( rule__NondeterministicChoiceExpression__Group__0__Impl rule__NondeterministicChoiceExpression__Group__1 )
            // InternalAPIMappingLanguage.g:6199:2: rule__NondeterministicChoiceExpression__Group__0__Impl rule__NondeterministicChoiceExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_35);
            rule__NondeterministicChoiceExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__NondeterministicChoiceExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NondeterministicChoiceExpression__Group__0"


    // $ANTLR start "rule__NondeterministicChoiceExpression__Group__0__Impl"
    // InternalAPIMappingLanguage.g:6206:1: rule__NondeterministicChoiceExpression__Group__0__Impl : ( ( rule__NondeterministicChoiceExpression__DataTypeAssignment_0 ) ) ;
    public final void rule__NondeterministicChoiceExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6210:1: ( ( ( rule__NondeterministicChoiceExpression__DataTypeAssignment_0 ) ) )
            // InternalAPIMappingLanguage.g:6211:1: ( ( rule__NondeterministicChoiceExpression__DataTypeAssignment_0 ) )
            {
            // InternalAPIMappingLanguage.g:6211:1: ( ( rule__NondeterministicChoiceExpression__DataTypeAssignment_0 ) )
            // InternalAPIMappingLanguage.g:6212:1: ( rule__NondeterministicChoiceExpression__DataTypeAssignment_0 )
            {
             before(grammarAccess.getNondeterministicChoiceExpressionAccess().getDataTypeAssignment_0()); 
            // InternalAPIMappingLanguage.g:6213:1: ( rule__NondeterministicChoiceExpression__DataTypeAssignment_0 )
            // InternalAPIMappingLanguage.g:6213:2: rule__NondeterministicChoiceExpression__DataTypeAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NondeterministicChoiceExpression__DataTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNondeterministicChoiceExpressionAccess().getDataTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NondeterministicChoiceExpression__Group__0__Impl"


    // $ANTLR start "rule__NondeterministicChoiceExpression__Group__1"
    // InternalAPIMappingLanguage.g:6223:1: rule__NondeterministicChoiceExpression__Group__1 : rule__NondeterministicChoiceExpression__Group__1__Impl ;
    public final void rule__NondeterministicChoiceExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6227:1: ( rule__NondeterministicChoiceExpression__Group__1__Impl )
            // InternalAPIMappingLanguage.g:6228:2: rule__NondeterministicChoiceExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NondeterministicChoiceExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NondeterministicChoiceExpression__Group__1"


    // $ANTLR start "rule__NondeterministicChoiceExpression__Group__1__Impl"
    // InternalAPIMappingLanguage.g:6234:1: rule__NondeterministicChoiceExpression__Group__1__Impl : ( ( rule__NondeterministicChoiceExpression__RangeAssignment_1 ) ) ;
    public final void rule__NondeterministicChoiceExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6238:1: ( ( ( rule__NondeterministicChoiceExpression__RangeAssignment_1 ) ) )
            // InternalAPIMappingLanguage.g:6239:1: ( ( rule__NondeterministicChoiceExpression__RangeAssignment_1 ) )
            {
            // InternalAPIMappingLanguage.g:6239:1: ( ( rule__NondeterministicChoiceExpression__RangeAssignment_1 ) )
            // InternalAPIMappingLanguage.g:6240:1: ( rule__NondeterministicChoiceExpression__RangeAssignment_1 )
            {
             before(grammarAccess.getNondeterministicChoiceExpressionAccess().getRangeAssignment_1()); 
            // InternalAPIMappingLanguage.g:6241:1: ( rule__NondeterministicChoiceExpression__RangeAssignment_1 )
            // InternalAPIMappingLanguage.g:6241:2: rule__NondeterministicChoiceExpression__RangeAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NondeterministicChoiceExpression__RangeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNondeterministicChoiceExpressionAccess().getRangeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NondeterministicChoiceExpression__Group__1__Impl"


    // $ANTLR start "rule__Range__Group__0"
    // InternalAPIMappingLanguage.g:6255:1: rule__Range__Group__0 : rule__Range__Group__0__Impl rule__Range__Group__1 ;
    public final void rule__Range__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6259:1: ( rule__Range__Group__0__Impl rule__Range__Group__1 )
            // InternalAPIMappingLanguage.g:6260:2: rule__Range__Group__0__Impl rule__Range__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_36);
            rule__Range__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Range__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__0"


    // $ANTLR start "rule__Range__Group__0__Impl"
    // InternalAPIMappingLanguage.g:6267:1: rule__Range__Group__0__Impl : ( '<' ) ;
    public final void rule__Range__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6271:1: ( ( '<' ) )
            // InternalAPIMappingLanguage.g:6272:1: ( '<' )
            {
            // InternalAPIMappingLanguage.g:6272:1: ( '<' )
            // InternalAPIMappingLanguage.g:6273:1: '<'
            {
             before(grammarAccess.getRangeAccess().getLessThanSignKeyword_0()); 
            match(input,24,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getRangeAccess().getLessThanSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__0__Impl"


    // $ANTLR start "rule__Range__Group__1"
    // InternalAPIMappingLanguage.g:6286:1: rule__Range__Group__1 : rule__Range__Group__1__Impl rule__Range__Group__2 ;
    public final void rule__Range__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6290:1: ( rule__Range__Group__1__Impl rule__Range__Group__2 )
            // InternalAPIMappingLanguage.g:6291:2: rule__Range__Group__1__Impl rule__Range__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__Range__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Range__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__1"


    // $ANTLR start "rule__Range__Group__1__Impl"
    // InternalAPIMappingLanguage.g:6298:1: rule__Range__Group__1__Impl : ( ( rule__Range__LowerBoundAssignment_1 ) ) ;
    public final void rule__Range__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6302:1: ( ( ( rule__Range__LowerBoundAssignment_1 ) ) )
            // InternalAPIMappingLanguage.g:6303:1: ( ( rule__Range__LowerBoundAssignment_1 ) )
            {
            // InternalAPIMappingLanguage.g:6303:1: ( ( rule__Range__LowerBoundAssignment_1 ) )
            // InternalAPIMappingLanguage.g:6304:1: ( rule__Range__LowerBoundAssignment_1 )
            {
             before(grammarAccess.getRangeAccess().getLowerBoundAssignment_1()); 
            // InternalAPIMappingLanguage.g:6305:1: ( rule__Range__LowerBoundAssignment_1 )
            // InternalAPIMappingLanguage.g:6305:2: rule__Range__LowerBoundAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Range__LowerBoundAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRangeAccess().getLowerBoundAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__1__Impl"


    // $ANTLR start "rule__Range__Group__2"
    // InternalAPIMappingLanguage.g:6315:1: rule__Range__Group__2 : rule__Range__Group__2__Impl rule__Range__Group__3 ;
    public final void rule__Range__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6319:1: ( rule__Range__Group__2__Impl rule__Range__Group__3 )
            // InternalAPIMappingLanguage.g:6320:2: rule__Range__Group__2__Impl rule__Range__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_36);
            rule__Range__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Range__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__2"


    // $ANTLR start "rule__Range__Group__2__Impl"
    // InternalAPIMappingLanguage.g:6327:1: rule__Range__Group__2__Impl : ( ',' ) ;
    public final void rule__Range__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6331:1: ( ( ',' ) )
            // InternalAPIMappingLanguage.g:6332:1: ( ',' )
            {
            // InternalAPIMappingLanguage.g:6332:1: ( ',' )
            // InternalAPIMappingLanguage.g:6333:1: ','
            {
             before(grammarAccess.getRangeAccess().getCommaKeyword_2()); 
            match(input,42,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getRangeAccess().getCommaKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__2__Impl"


    // $ANTLR start "rule__Range__Group__3"
    // InternalAPIMappingLanguage.g:6346:1: rule__Range__Group__3 : rule__Range__Group__3__Impl rule__Range__Group__4 ;
    public final void rule__Range__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6350:1: ( rule__Range__Group__3__Impl rule__Range__Group__4 )
            // InternalAPIMappingLanguage.g:6351:2: rule__Range__Group__3__Impl rule__Range__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_37);
            rule__Range__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Range__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__3"


    // $ANTLR start "rule__Range__Group__3__Impl"
    // InternalAPIMappingLanguage.g:6358:1: rule__Range__Group__3__Impl : ( ( rule__Range__UpperBoundAssignment_3 ) ) ;
    public final void rule__Range__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6362:1: ( ( ( rule__Range__UpperBoundAssignment_3 ) ) )
            // InternalAPIMappingLanguage.g:6363:1: ( ( rule__Range__UpperBoundAssignment_3 ) )
            {
            // InternalAPIMappingLanguage.g:6363:1: ( ( rule__Range__UpperBoundAssignment_3 ) )
            // InternalAPIMappingLanguage.g:6364:1: ( rule__Range__UpperBoundAssignment_3 )
            {
             before(grammarAccess.getRangeAccess().getUpperBoundAssignment_3()); 
            // InternalAPIMappingLanguage.g:6365:1: ( rule__Range__UpperBoundAssignment_3 )
            // InternalAPIMappingLanguage.g:6365:2: rule__Range__UpperBoundAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Range__UpperBoundAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRangeAccess().getUpperBoundAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__3__Impl"


    // $ANTLR start "rule__Range__Group__4"
    // InternalAPIMappingLanguage.g:6375:1: rule__Range__Group__4 : rule__Range__Group__4__Impl ;
    public final void rule__Range__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6379:1: ( rule__Range__Group__4__Impl )
            // InternalAPIMappingLanguage.g:6380:2: rule__Range__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Range__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__4"


    // $ANTLR start "rule__Range__Group__4__Impl"
    // InternalAPIMappingLanguage.g:6386:1: rule__Range__Group__4__Impl : ( '>' ) ;
    public final void rule__Range__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6390:1: ( ( '>' ) )
            // InternalAPIMappingLanguage.g:6391:1: ( '>' )
            {
            // InternalAPIMappingLanguage.g:6391:1: ( '>' )
            // InternalAPIMappingLanguage.g:6392:1: '>'
            {
             before(grammarAccess.getRangeAccess().getGreaterThanSignKeyword_4()); 
            match(input,27,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getRangeAccess().getGreaterThanSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__Group__4__Impl"


    // $ANTLR start "rule__LogicalOrExpression__Group__0"
    // InternalAPIMappingLanguage.g:6415:1: rule__LogicalOrExpression__Group__0 : rule__LogicalOrExpression__Group__0__Impl rule__LogicalOrExpression__Group__1 ;
    public final void rule__LogicalOrExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6419:1: ( rule__LogicalOrExpression__Group__0__Impl rule__LogicalOrExpression__Group__1 )
            // InternalAPIMappingLanguage.g:6420:2: rule__LogicalOrExpression__Group__0__Impl rule__LogicalOrExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_38);
            rule__LogicalOrExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalOrExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrExpression__Group__0"


    // $ANTLR start "rule__LogicalOrExpression__Group__0__Impl"
    // InternalAPIMappingLanguage.g:6427:1: rule__LogicalOrExpression__Group__0__Impl : ( ruleLogicalAndExpression ) ;
    public final void rule__LogicalOrExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6431:1: ( ( ruleLogicalAndExpression ) )
            // InternalAPIMappingLanguage.g:6432:1: ( ruleLogicalAndExpression )
            {
            // InternalAPIMappingLanguage.g:6432:1: ( ruleLogicalAndExpression )
            // InternalAPIMappingLanguage.g:6433:1: ruleLogicalAndExpression
            {
             before(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleLogicalAndExpression();

            state._fsp--;

             after(grammarAccess.getLogicalOrExpressionAccess().getLogicalAndExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrExpression__Group__0__Impl"


    // $ANTLR start "rule__LogicalOrExpression__Group__1"
    // InternalAPIMappingLanguage.g:6444:1: rule__LogicalOrExpression__Group__1 : rule__LogicalOrExpression__Group__1__Impl ;
    public final void rule__LogicalOrExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6448:1: ( rule__LogicalOrExpression__Group__1__Impl )
            // InternalAPIMappingLanguage.g:6449:2: rule__LogicalOrExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalOrExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrExpression__Group__1"


    // $ANTLR start "rule__LogicalOrExpression__Group__1__Impl"
    // InternalAPIMappingLanguage.g:6455:1: rule__LogicalOrExpression__Group__1__Impl : ( ( rule__LogicalOrExpression__Group_1__0 )* ) ;
    public final void rule__LogicalOrExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6459:1: ( ( ( rule__LogicalOrExpression__Group_1__0 )* ) )
            // InternalAPIMappingLanguage.g:6460:1: ( ( rule__LogicalOrExpression__Group_1__0 )* )
            {
            // InternalAPIMappingLanguage.g:6460:1: ( ( rule__LogicalOrExpression__Group_1__0 )* )
            // InternalAPIMappingLanguage.g:6461:1: ( rule__LogicalOrExpression__Group_1__0 )*
            {
             before(grammarAccess.getLogicalOrExpressionAccess().getGroup_1()); 
            // InternalAPIMappingLanguage.g:6462:1: ( rule__LogicalOrExpression__Group_1__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==14) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalAPIMappingLanguage.g:6462:2: rule__LogicalOrExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_39);
            	    rule__LogicalOrExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getLogicalOrExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrExpression__Group__1__Impl"


    // $ANTLR start "rule__LogicalOrExpression__Group_1__0"
    // InternalAPIMappingLanguage.g:6476:1: rule__LogicalOrExpression__Group_1__0 : rule__LogicalOrExpression__Group_1__0__Impl rule__LogicalOrExpression__Group_1__1 ;
    public final void rule__LogicalOrExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6480:1: ( rule__LogicalOrExpression__Group_1__0__Impl rule__LogicalOrExpression__Group_1__1 )
            // InternalAPIMappingLanguage.g:6481:2: rule__LogicalOrExpression__Group_1__0__Impl rule__LogicalOrExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_38);
            rule__LogicalOrExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalOrExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrExpression__Group_1__0"


    // $ANTLR start "rule__LogicalOrExpression__Group_1__0__Impl"
    // InternalAPIMappingLanguage.g:6488:1: rule__LogicalOrExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__LogicalOrExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6492:1: ( ( () ) )
            // InternalAPIMappingLanguage.g:6493:1: ( () )
            {
            // InternalAPIMappingLanguage.g:6493:1: ( () )
            // InternalAPIMappingLanguage.g:6494:1: ()
            {
             before(grammarAccess.getLogicalOrExpressionAccess().getLogicalExpressionLeftExpressionAction_1_0()); 
            // InternalAPIMappingLanguage.g:6495:1: ()
            // InternalAPIMappingLanguage.g:6497:1: 
            {
            }

             after(grammarAccess.getLogicalOrExpressionAccess().getLogicalExpressionLeftExpressionAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrExpression__Group_1__0__Impl"


    // $ANTLR start "rule__LogicalOrExpression__Group_1__1"
    // InternalAPIMappingLanguage.g:6507:1: rule__LogicalOrExpression__Group_1__1 : rule__LogicalOrExpression__Group_1__1__Impl rule__LogicalOrExpression__Group_1__2 ;
    public final void rule__LogicalOrExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6511:1: ( rule__LogicalOrExpression__Group_1__1__Impl rule__LogicalOrExpression__Group_1__2 )
            // InternalAPIMappingLanguage.g:6512:2: rule__LogicalOrExpression__Group_1__1__Impl rule__LogicalOrExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__LogicalOrExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalOrExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrExpression__Group_1__1"


    // $ANTLR start "rule__LogicalOrExpression__Group_1__1__Impl"
    // InternalAPIMappingLanguage.g:6519:1: rule__LogicalOrExpression__Group_1__1__Impl : ( ( rule__LogicalOrExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__LogicalOrExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6523:1: ( ( ( rule__LogicalOrExpression__OperatorAssignment_1_1 ) ) )
            // InternalAPIMappingLanguage.g:6524:1: ( ( rule__LogicalOrExpression__OperatorAssignment_1_1 ) )
            {
            // InternalAPIMappingLanguage.g:6524:1: ( ( rule__LogicalOrExpression__OperatorAssignment_1_1 ) )
            // InternalAPIMappingLanguage.g:6525:1: ( rule__LogicalOrExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getLogicalOrExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalAPIMappingLanguage.g:6526:1: ( rule__LogicalOrExpression__OperatorAssignment_1_1 )
            // InternalAPIMappingLanguage.g:6526:2: rule__LogicalOrExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalOrExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLogicalOrExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrExpression__Group_1__1__Impl"


    // $ANTLR start "rule__LogicalOrExpression__Group_1__2"
    // InternalAPIMappingLanguage.g:6536:1: rule__LogicalOrExpression__Group_1__2 : rule__LogicalOrExpression__Group_1__2__Impl ;
    public final void rule__LogicalOrExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6540:1: ( rule__LogicalOrExpression__Group_1__2__Impl )
            // InternalAPIMappingLanguage.g:6541:2: rule__LogicalOrExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalOrExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrExpression__Group_1__2"


    // $ANTLR start "rule__LogicalOrExpression__Group_1__2__Impl"
    // InternalAPIMappingLanguage.g:6547:1: rule__LogicalOrExpression__Group_1__2__Impl : ( ( rule__LogicalOrExpression__RightExpressionAssignment_1_2 ) ) ;
    public final void rule__LogicalOrExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6551:1: ( ( ( rule__LogicalOrExpression__RightExpressionAssignment_1_2 ) ) )
            // InternalAPIMappingLanguage.g:6552:1: ( ( rule__LogicalOrExpression__RightExpressionAssignment_1_2 ) )
            {
            // InternalAPIMappingLanguage.g:6552:1: ( ( rule__LogicalOrExpression__RightExpressionAssignment_1_2 ) )
            // InternalAPIMappingLanguage.g:6553:1: ( rule__LogicalOrExpression__RightExpressionAssignment_1_2 )
            {
             before(grammarAccess.getLogicalOrExpressionAccess().getRightExpressionAssignment_1_2()); 
            // InternalAPIMappingLanguage.g:6554:1: ( rule__LogicalOrExpression__RightExpressionAssignment_1_2 )
            // InternalAPIMappingLanguage.g:6554:2: rule__LogicalOrExpression__RightExpressionAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalOrExpression__RightExpressionAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getLogicalOrExpressionAccess().getRightExpressionAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrExpression__Group_1__2__Impl"


    // $ANTLR start "rule__LogicalAndExpression__Group__0"
    // InternalAPIMappingLanguage.g:6570:1: rule__LogicalAndExpression__Group__0 : rule__LogicalAndExpression__Group__0__Impl rule__LogicalAndExpression__Group__1 ;
    public final void rule__LogicalAndExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6574:1: ( rule__LogicalAndExpression__Group__0__Impl rule__LogicalAndExpression__Group__1 )
            // InternalAPIMappingLanguage.g:6575:2: rule__LogicalAndExpression__Group__0__Impl rule__LogicalAndExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_40);
            rule__LogicalAndExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalAndExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndExpression__Group__0"


    // $ANTLR start "rule__LogicalAndExpression__Group__0__Impl"
    // InternalAPIMappingLanguage.g:6582:1: rule__LogicalAndExpression__Group__0__Impl : ( ruleComparisonExpression ) ;
    public final void rule__LogicalAndExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6586:1: ( ( ruleComparisonExpression ) )
            // InternalAPIMappingLanguage.g:6587:1: ( ruleComparisonExpression )
            {
            // InternalAPIMappingLanguage.g:6587:1: ( ruleComparisonExpression )
            // InternalAPIMappingLanguage.g:6588:1: ruleComparisonExpression
            {
             before(grammarAccess.getLogicalAndExpressionAccess().getComparisonExpressionParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleComparisonExpression();

            state._fsp--;

             after(grammarAccess.getLogicalAndExpressionAccess().getComparisonExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndExpression__Group__0__Impl"


    // $ANTLR start "rule__LogicalAndExpression__Group__1"
    // InternalAPIMappingLanguage.g:6599:1: rule__LogicalAndExpression__Group__1 : rule__LogicalAndExpression__Group__1__Impl ;
    public final void rule__LogicalAndExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6603:1: ( rule__LogicalAndExpression__Group__1__Impl )
            // InternalAPIMappingLanguage.g:6604:2: rule__LogicalAndExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalAndExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndExpression__Group__1"


    // $ANTLR start "rule__LogicalAndExpression__Group__1__Impl"
    // InternalAPIMappingLanguage.g:6610:1: rule__LogicalAndExpression__Group__1__Impl : ( ( rule__LogicalAndExpression__Group_1__0 )* ) ;
    public final void rule__LogicalAndExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6614:1: ( ( ( rule__LogicalAndExpression__Group_1__0 )* ) )
            // InternalAPIMappingLanguage.g:6615:1: ( ( rule__LogicalAndExpression__Group_1__0 )* )
            {
            // InternalAPIMappingLanguage.g:6615:1: ( ( rule__LogicalAndExpression__Group_1__0 )* )
            // InternalAPIMappingLanguage.g:6616:1: ( rule__LogicalAndExpression__Group_1__0 )*
            {
             before(grammarAccess.getLogicalAndExpressionAccess().getGroup_1()); 
            // InternalAPIMappingLanguage.g:6617:1: ( rule__LogicalAndExpression__Group_1__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==15) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalAPIMappingLanguage.g:6617:2: rule__LogicalAndExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_41);
            	    rule__LogicalAndExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             after(grammarAccess.getLogicalAndExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndExpression__Group__1__Impl"


    // $ANTLR start "rule__LogicalAndExpression__Group_1__0"
    // InternalAPIMappingLanguage.g:6631:1: rule__LogicalAndExpression__Group_1__0 : rule__LogicalAndExpression__Group_1__0__Impl rule__LogicalAndExpression__Group_1__1 ;
    public final void rule__LogicalAndExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6635:1: ( rule__LogicalAndExpression__Group_1__0__Impl rule__LogicalAndExpression__Group_1__1 )
            // InternalAPIMappingLanguage.g:6636:2: rule__LogicalAndExpression__Group_1__0__Impl rule__LogicalAndExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_40);
            rule__LogicalAndExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalAndExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndExpression__Group_1__0"


    // $ANTLR start "rule__LogicalAndExpression__Group_1__0__Impl"
    // InternalAPIMappingLanguage.g:6643:1: rule__LogicalAndExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__LogicalAndExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6647:1: ( ( () ) )
            // InternalAPIMappingLanguage.g:6648:1: ( () )
            {
            // InternalAPIMappingLanguage.g:6648:1: ( () )
            // InternalAPIMappingLanguage.g:6649:1: ()
            {
             before(grammarAccess.getLogicalAndExpressionAccess().getLogicalExpressionLeftExpressionAction_1_0()); 
            // InternalAPIMappingLanguage.g:6650:1: ()
            // InternalAPIMappingLanguage.g:6652:1: 
            {
            }

             after(grammarAccess.getLogicalAndExpressionAccess().getLogicalExpressionLeftExpressionAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndExpression__Group_1__0__Impl"


    // $ANTLR start "rule__LogicalAndExpression__Group_1__1"
    // InternalAPIMappingLanguage.g:6662:1: rule__LogicalAndExpression__Group_1__1 : rule__LogicalAndExpression__Group_1__1__Impl rule__LogicalAndExpression__Group_1__2 ;
    public final void rule__LogicalAndExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6666:1: ( rule__LogicalAndExpression__Group_1__1__Impl rule__LogicalAndExpression__Group_1__2 )
            // InternalAPIMappingLanguage.g:6667:2: rule__LogicalAndExpression__Group_1__1__Impl rule__LogicalAndExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__LogicalAndExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalAndExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndExpression__Group_1__1"


    // $ANTLR start "rule__LogicalAndExpression__Group_1__1__Impl"
    // InternalAPIMappingLanguage.g:6674:1: rule__LogicalAndExpression__Group_1__1__Impl : ( ( rule__LogicalAndExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__LogicalAndExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6678:1: ( ( ( rule__LogicalAndExpression__OperatorAssignment_1_1 ) ) )
            // InternalAPIMappingLanguage.g:6679:1: ( ( rule__LogicalAndExpression__OperatorAssignment_1_1 ) )
            {
            // InternalAPIMappingLanguage.g:6679:1: ( ( rule__LogicalAndExpression__OperatorAssignment_1_1 ) )
            // InternalAPIMappingLanguage.g:6680:1: ( rule__LogicalAndExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getLogicalAndExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalAPIMappingLanguage.g:6681:1: ( rule__LogicalAndExpression__OperatorAssignment_1_1 )
            // InternalAPIMappingLanguage.g:6681:2: rule__LogicalAndExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalAndExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLogicalAndExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndExpression__Group_1__1__Impl"


    // $ANTLR start "rule__LogicalAndExpression__Group_1__2"
    // InternalAPIMappingLanguage.g:6691:1: rule__LogicalAndExpression__Group_1__2 : rule__LogicalAndExpression__Group_1__2__Impl ;
    public final void rule__LogicalAndExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6695:1: ( rule__LogicalAndExpression__Group_1__2__Impl )
            // InternalAPIMappingLanguage.g:6696:2: rule__LogicalAndExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalAndExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndExpression__Group_1__2"


    // $ANTLR start "rule__LogicalAndExpression__Group_1__2__Impl"
    // InternalAPIMappingLanguage.g:6702:1: rule__LogicalAndExpression__Group_1__2__Impl : ( ( rule__LogicalAndExpression__RightExpressionAssignment_1_2 ) ) ;
    public final void rule__LogicalAndExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6706:1: ( ( ( rule__LogicalAndExpression__RightExpressionAssignment_1_2 ) ) )
            // InternalAPIMappingLanguage.g:6707:1: ( ( rule__LogicalAndExpression__RightExpressionAssignment_1_2 ) )
            {
            // InternalAPIMappingLanguage.g:6707:1: ( ( rule__LogicalAndExpression__RightExpressionAssignment_1_2 ) )
            // InternalAPIMappingLanguage.g:6708:1: ( rule__LogicalAndExpression__RightExpressionAssignment_1_2 )
            {
             before(grammarAccess.getLogicalAndExpressionAccess().getRightExpressionAssignment_1_2()); 
            // InternalAPIMappingLanguage.g:6709:1: ( rule__LogicalAndExpression__RightExpressionAssignment_1_2 )
            // InternalAPIMappingLanguage.g:6709:2: rule__LogicalAndExpression__RightExpressionAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalAndExpression__RightExpressionAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getLogicalAndExpressionAccess().getRightExpressionAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndExpression__Group_1__2__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group__0"
    // InternalAPIMappingLanguage.g:6725:1: rule__ComparisonExpression__Group__0 : rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1 ;
    public final void rule__ComparisonExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6729:1: ( rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1 )
            // InternalAPIMappingLanguage.g:6730:2: rule__ComparisonExpression__Group__0__Impl rule__ComparisonExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_42);
            rule__ComparisonExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ComparisonExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__0"


    // $ANTLR start "rule__ComparisonExpression__Group__0__Impl"
    // InternalAPIMappingLanguage.g:6737:1: rule__ComparisonExpression__Group__0__Impl : ( ruleComparisonHigherOpExpression ) ;
    public final void rule__ComparisonExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6741:1: ( ( ruleComparisonHigherOpExpression ) )
            // InternalAPIMappingLanguage.g:6742:1: ( ruleComparisonHigherOpExpression )
            {
            // InternalAPIMappingLanguage.g:6742:1: ( ruleComparisonHigherOpExpression )
            // InternalAPIMappingLanguage.g:6743:1: ruleComparisonHigherOpExpression
            {
             before(grammarAccess.getComparisonExpressionAccess().getComparisonHigherOpExpressionParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleComparisonHigherOpExpression();

            state._fsp--;

             after(grammarAccess.getComparisonExpressionAccess().getComparisonHigherOpExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__0__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group__1"
    // InternalAPIMappingLanguage.g:6754:1: rule__ComparisonExpression__Group__1 : rule__ComparisonExpression__Group__1__Impl ;
    public final void rule__ComparisonExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6758:1: ( rule__ComparisonExpression__Group__1__Impl )
            // InternalAPIMappingLanguage.g:6759:2: rule__ComparisonExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ComparisonExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__1"


    // $ANTLR start "rule__ComparisonExpression__Group__1__Impl"
    // InternalAPIMappingLanguage.g:6765:1: rule__ComparisonExpression__Group__1__Impl : ( ( rule__ComparisonExpression__Group_1__0 )? ) ;
    public final void rule__ComparisonExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6769:1: ( ( ( rule__ComparisonExpression__Group_1__0 )? ) )
            // InternalAPIMappingLanguage.g:6770:1: ( ( rule__ComparisonExpression__Group_1__0 )? )
            {
            // InternalAPIMappingLanguage.g:6770:1: ( ( rule__ComparisonExpression__Group_1__0 )? )
            // InternalAPIMappingLanguage.g:6771:1: ( rule__ComparisonExpression__Group_1__0 )?
            {
             before(grammarAccess.getComparisonExpressionAccess().getGroup_1()); 
            // InternalAPIMappingLanguage.g:6772:1: ( rule__ComparisonExpression__Group_1__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=22 && LA41_0<=23)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalAPIMappingLanguage.g:6772:2: rule__ComparisonExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ComparisonExpression__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComparisonExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group__1__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group_1__0"
    // InternalAPIMappingLanguage.g:6786:1: rule__ComparisonExpression__Group_1__0 : rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1 ;
    public final void rule__ComparisonExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6790:1: ( rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1 )
            // InternalAPIMappingLanguage.g:6791:2: rule__ComparisonExpression__Group_1__0__Impl rule__ComparisonExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_42);
            rule__ComparisonExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ComparisonExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__0"


    // $ANTLR start "rule__ComparisonExpression__Group_1__0__Impl"
    // InternalAPIMappingLanguage.g:6798:1: rule__ComparisonExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ComparisonExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6802:1: ( ( () ) )
            // InternalAPIMappingLanguage.g:6803:1: ( () )
            {
            // InternalAPIMappingLanguage.g:6803:1: ( () )
            // InternalAPIMappingLanguage.g:6804:1: ()
            {
             before(grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftExpressionAction_1_0()); 
            // InternalAPIMappingLanguage.g:6805:1: ()
            // InternalAPIMappingLanguage.g:6807:1: 
            {
            }

             after(grammarAccess.getComparisonExpressionAccess().getComparisonExpressionLeftExpressionAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__0__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group_1__1"
    // InternalAPIMappingLanguage.g:6817:1: rule__ComparisonExpression__Group_1__1 : rule__ComparisonExpression__Group_1__1__Impl rule__ComparisonExpression__Group_1__2 ;
    public final void rule__ComparisonExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6821:1: ( rule__ComparisonExpression__Group_1__1__Impl rule__ComparisonExpression__Group_1__2 )
            // InternalAPIMappingLanguage.g:6822:2: rule__ComparisonExpression__Group_1__1__Impl rule__ComparisonExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__ComparisonExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ComparisonExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__1"


    // $ANTLR start "rule__ComparisonExpression__Group_1__1__Impl"
    // InternalAPIMappingLanguage.g:6829:1: rule__ComparisonExpression__Group_1__1__Impl : ( ( rule__ComparisonExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ComparisonExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6833:1: ( ( ( rule__ComparisonExpression__OperatorAssignment_1_1 ) ) )
            // InternalAPIMappingLanguage.g:6834:1: ( ( rule__ComparisonExpression__OperatorAssignment_1_1 ) )
            {
            // InternalAPIMappingLanguage.g:6834:1: ( ( rule__ComparisonExpression__OperatorAssignment_1_1 ) )
            // InternalAPIMappingLanguage.g:6835:1: ( rule__ComparisonExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getComparisonExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalAPIMappingLanguage.g:6836:1: ( rule__ComparisonExpression__OperatorAssignment_1_1 )
            // InternalAPIMappingLanguage.g:6836:2: rule__ComparisonExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ComparisonExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getComparisonExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__1__Impl"


    // $ANTLR start "rule__ComparisonExpression__Group_1__2"
    // InternalAPIMappingLanguage.g:6846:1: rule__ComparisonExpression__Group_1__2 : rule__ComparisonExpression__Group_1__2__Impl ;
    public final void rule__ComparisonExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6850:1: ( rule__ComparisonExpression__Group_1__2__Impl )
            // InternalAPIMappingLanguage.g:6851:2: rule__ComparisonExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ComparisonExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__2"


    // $ANTLR start "rule__ComparisonExpression__Group_1__2__Impl"
    // InternalAPIMappingLanguage.g:6857:1: rule__ComparisonExpression__Group_1__2__Impl : ( ( rule__ComparisonExpression__RightExpressionAssignment_1_2 ) ) ;
    public final void rule__ComparisonExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6861:1: ( ( ( rule__ComparisonExpression__RightExpressionAssignment_1_2 ) ) )
            // InternalAPIMappingLanguage.g:6862:1: ( ( rule__ComparisonExpression__RightExpressionAssignment_1_2 ) )
            {
            // InternalAPIMappingLanguage.g:6862:1: ( ( rule__ComparisonExpression__RightExpressionAssignment_1_2 ) )
            // InternalAPIMappingLanguage.g:6863:1: ( rule__ComparisonExpression__RightExpressionAssignment_1_2 )
            {
             before(grammarAccess.getComparisonExpressionAccess().getRightExpressionAssignment_1_2()); 
            // InternalAPIMappingLanguage.g:6864:1: ( rule__ComparisonExpression__RightExpressionAssignment_1_2 )
            // InternalAPIMappingLanguage.g:6864:2: rule__ComparisonExpression__RightExpressionAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ComparisonExpression__RightExpressionAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getComparisonExpressionAccess().getRightExpressionAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__Group_1__2__Impl"


    // $ANTLR start "rule__ComparisonHigherOpExpression__Group__0"
    // InternalAPIMappingLanguage.g:6880:1: rule__ComparisonHigherOpExpression__Group__0 : rule__ComparisonHigherOpExpression__Group__0__Impl rule__ComparisonHigherOpExpression__Group__1 ;
    public final void rule__ComparisonHigherOpExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6884:1: ( rule__ComparisonHigherOpExpression__Group__0__Impl rule__ComparisonHigherOpExpression__Group__1 )
            // InternalAPIMappingLanguage.g:6885:2: rule__ComparisonHigherOpExpression__Group__0__Impl rule__ComparisonHigherOpExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_43);
            rule__ComparisonHigherOpExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ComparisonHigherOpExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonHigherOpExpression__Group__0"


    // $ANTLR start "rule__ComparisonHigherOpExpression__Group__0__Impl"
    // InternalAPIMappingLanguage.g:6892:1: rule__ComparisonHigherOpExpression__Group__0__Impl : ( ruleArithmeticExpression ) ;
    public final void rule__ComparisonHigherOpExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6896:1: ( ( ruleArithmeticExpression ) )
            // InternalAPIMappingLanguage.g:6897:1: ( ruleArithmeticExpression )
            {
            // InternalAPIMappingLanguage.g:6897:1: ( ruleArithmeticExpression )
            // InternalAPIMappingLanguage.g:6898:1: ruleArithmeticExpression
            {
             before(grammarAccess.getComparisonHigherOpExpressionAccess().getArithmeticExpressionParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleArithmeticExpression();

            state._fsp--;

             after(grammarAccess.getComparisonHigherOpExpressionAccess().getArithmeticExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonHigherOpExpression__Group__0__Impl"


    // $ANTLR start "rule__ComparisonHigherOpExpression__Group__1"
    // InternalAPIMappingLanguage.g:6909:1: rule__ComparisonHigherOpExpression__Group__1 : rule__ComparisonHigherOpExpression__Group__1__Impl ;
    public final void rule__ComparisonHigherOpExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6913:1: ( rule__ComparisonHigherOpExpression__Group__1__Impl )
            // InternalAPIMappingLanguage.g:6914:2: rule__ComparisonHigherOpExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ComparisonHigherOpExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonHigherOpExpression__Group__1"


    // $ANTLR start "rule__ComparisonHigherOpExpression__Group__1__Impl"
    // InternalAPIMappingLanguage.g:6920:1: rule__ComparisonHigherOpExpression__Group__1__Impl : ( ( rule__ComparisonHigherOpExpression__Group_1__0 )? ) ;
    public final void rule__ComparisonHigherOpExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6924:1: ( ( ( rule__ComparisonHigherOpExpression__Group_1__0 )? ) )
            // InternalAPIMappingLanguage.g:6925:1: ( ( rule__ComparisonHigherOpExpression__Group_1__0 )? )
            {
            // InternalAPIMappingLanguage.g:6925:1: ( ( rule__ComparisonHigherOpExpression__Group_1__0 )? )
            // InternalAPIMappingLanguage.g:6926:1: ( rule__ComparisonHigherOpExpression__Group_1__0 )?
            {
             before(grammarAccess.getComparisonHigherOpExpressionAccess().getGroup_1()); 
            // InternalAPIMappingLanguage.g:6927:1: ( rule__ComparisonHigherOpExpression__Group_1__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=24 && LA42_0<=27)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalAPIMappingLanguage.g:6927:2: rule__ComparisonHigherOpExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ComparisonHigherOpExpression__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComparisonHigherOpExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonHigherOpExpression__Group__1__Impl"


    // $ANTLR start "rule__ComparisonHigherOpExpression__Group_1__0"
    // InternalAPIMappingLanguage.g:6941:1: rule__ComparisonHigherOpExpression__Group_1__0 : rule__ComparisonHigherOpExpression__Group_1__0__Impl rule__ComparisonHigherOpExpression__Group_1__1 ;
    public final void rule__ComparisonHigherOpExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6945:1: ( rule__ComparisonHigherOpExpression__Group_1__0__Impl rule__ComparisonHigherOpExpression__Group_1__1 )
            // InternalAPIMappingLanguage.g:6946:2: rule__ComparisonHigherOpExpression__Group_1__0__Impl rule__ComparisonHigherOpExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_43);
            rule__ComparisonHigherOpExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ComparisonHigherOpExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonHigherOpExpression__Group_1__0"


    // $ANTLR start "rule__ComparisonHigherOpExpression__Group_1__0__Impl"
    // InternalAPIMappingLanguage.g:6953:1: rule__ComparisonHigherOpExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__ComparisonHigherOpExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6957:1: ( ( () ) )
            // InternalAPIMappingLanguage.g:6958:1: ( () )
            {
            // InternalAPIMappingLanguage.g:6958:1: ( () )
            // InternalAPIMappingLanguage.g:6959:1: ()
            {
             before(grammarAccess.getComparisonHigherOpExpressionAccess().getComparisonExpressionLeftExpressionAction_1_0()); 
            // InternalAPIMappingLanguage.g:6960:1: ()
            // InternalAPIMappingLanguage.g:6962:1: 
            {
            }

             after(grammarAccess.getComparisonHigherOpExpressionAccess().getComparisonExpressionLeftExpressionAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonHigherOpExpression__Group_1__0__Impl"


    // $ANTLR start "rule__ComparisonHigherOpExpression__Group_1__1"
    // InternalAPIMappingLanguage.g:6972:1: rule__ComparisonHigherOpExpression__Group_1__1 : rule__ComparisonHigherOpExpression__Group_1__1__Impl rule__ComparisonHigherOpExpression__Group_1__2 ;
    public final void rule__ComparisonHigherOpExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6976:1: ( rule__ComparisonHigherOpExpression__Group_1__1__Impl rule__ComparisonHigherOpExpression__Group_1__2 )
            // InternalAPIMappingLanguage.g:6977:2: rule__ComparisonHigherOpExpression__Group_1__1__Impl rule__ComparisonHigherOpExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__ComparisonHigherOpExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ComparisonHigherOpExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonHigherOpExpression__Group_1__1"


    // $ANTLR start "rule__ComparisonHigherOpExpression__Group_1__1__Impl"
    // InternalAPIMappingLanguage.g:6984:1: rule__ComparisonHigherOpExpression__Group_1__1__Impl : ( ( rule__ComparisonHigherOpExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__ComparisonHigherOpExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:6988:1: ( ( ( rule__ComparisonHigherOpExpression__OperatorAssignment_1_1 ) ) )
            // InternalAPIMappingLanguage.g:6989:1: ( ( rule__ComparisonHigherOpExpression__OperatorAssignment_1_1 ) )
            {
            // InternalAPIMappingLanguage.g:6989:1: ( ( rule__ComparisonHigherOpExpression__OperatorAssignment_1_1 ) )
            // InternalAPIMappingLanguage.g:6990:1: ( rule__ComparisonHigherOpExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getComparisonHigherOpExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalAPIMappingLanguage.g:6991:1: ( rule__ComparisonHigherOpExpression__OperatorAssignment_1_1 )
            // InternalAPIMappingLanguage.g:6991:2: rule__ComparisonHigherOpExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ComparisonHigherOpExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getComparisonHigherOpExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonHigherOpExpression__Group_1__1__Impl"


    // $ANTLR start "rule__ComparisonHigherOpExpression__Group_1__2"
    // InternalAPIMappingLanguage.g:7001:1: rule__ComparisonHigherOpExpression__Group_1__2 : rule__ComparisonHigherOpExpression__Group_1__2__Impl ;
    public final void rule__ComparisonHigherOpExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7005:1: ( rule__ComparisonHigherOpExpression__Group_1__2__Impl )
            // InternalAPIMappingLanguage.g:7006:2: rule__ComparisonHigherOpExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ComparisonHigherOpExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonHigherOpExpression__Group_1__2"


    // $ANTLR start "rule__ComparisonHigherOpExpression__Group_1__2__Impl"
    // InternalAPIMappingLanguage.g:7012:1: rule__ComparisonHigherOpExpression__Group_1__2__Impl : ( ( rule__ComparisonHigherOpExpression__RightExpressionAssignment_1_2 ) ) ;
    public final void rule__ComparisonHigherOpExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7016:1: ( ( ( rule__ComparisonHigherOpExpression__RightExpressionAssignment_1_2 ) ) )
            // InternalAPIMappingLanguage.g:7017:1: ( ( rule__ComparisonHigherOpExpression__RightExpressionAssignment_1_2 ) )
            {
            // InternalAPIMappingLanguage.g:7017:1: ( ( rule__ComparisonHigherOpExpression__RightExpressionAssignment_1_2 ) )
            // InternalAPIMappingLanguage.g:7018:1: ( rule__ComparisonHigherOpExpression__RightExpressionAssignment_1_2 )
            {
             before(grammarAccess.getComparisonHigherOpExpressionAccess().getRightExpressionAssignment_1_2()); 
            // InternalAPIMappingLanguage.g:7019:1: ( rule__ComparisonHigherOpExpression__RightExpressionAssignment_1_2 )
            // InternalAPIMappingLanguage.g:7019:2: rule__ComparisonHigherOpExpression__RightExpressionAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ComparisonHigherOpExpression__RightExpressionAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getComparisonHigherOpExpressionAccess().getRightExpressionAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonHigherOpExpression__Group_1__2__Impl"


    // $ANTLR start "rule__AdditionExpression__Group__0"
    // InternalAPIMappingLanguage.g:7035:1: rule__AdditionExpression__Group__0 : rule__AdditionExpression__Group__0__Impl rule__AdditionExpression__Group__1 ;
    public final void rule__AdditionExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7039:1: ( rule__AdditionExpression__Group__0__Impl rule__AdditionExpression__Group__1 )
            // InternalAPIMappingLanguage.g:7040:2: rule__AdditionExpression__Group__0__Impl rule__AdditionExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_44);
            rule__AdditionExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__AdditionExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__Group__0"


    // $ANTLR start "rule__AdditionExpression__Group__0__Impl"
    // InternalAPIMappingLanguage.g:7047:1: rule__AdditionExpression__Group__0__Impl : ( ruleMultiplicationExpression ) ;
    public final void rule__AdditionExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7051:1: ( ( ruleMultiplicationExpression ) )
            // InternalAPIMappingLanguage.g:7052:1: ( ruleMultiplicationExpression )
            {
            // InternalAPIMappingLanguage.g:7052:1: ( ruleMultiplicationExpression )
            // InternalAPIMappingLanguage.g:7053:1: ruleMultiplicationExpression
            {
             before(grammarAccess.getAdditionExpressionAccess().getMultiplicationExpressionParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMultiplicationExpression();

            state._fsp--;

             after(grammarAccess.getAdditionExpressionAccess().getMultiplicationExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__Group__0__Impl"


    // $ANTLR start "rule__AdditionExpression__Group__1"
    // InternalAPIMappingLanguage.g:7064:1: rule__AdditionExpression__Group__1 : rule__AdditionExpression__Group__1__Impl ;
    public final void rule__AdditionExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7068:1: ( rule__AdditionExpression__Group__1__Impl )
            // InternalAPIMappingLanguage.g:7069:2: rule__AdditionExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AdditionExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__Group__1"


    // $ANTLR start "rule__AdditionExpression__Group__1__Impl"
    // InternalAPIMappingLanguage.g:7075:1: rule__AdditionExpression__Group__1__Impl : ( ( rule__AdditionExpression__Group_1__0 )* ) ;
    public final void rule__AdditionExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7079:1: ( ( ( rule__AdditionExpression__Group_1__0 )* ) )
            // InternalAPIMappingLanguage.g:7080:1: ( ( rule__AdditionExpression__Group_1__0 )* )
            {
            // InternalAPIMappingLanguage.g:7080:1: ( ( rule__AdditionExpression__Group_1__0 )* )
            // InternalAPIMappingLanguage.g:7081:1: ( rule__AdditionExpression__Group_1__0 )*
            {
             before(grammarAccess.getAdditionExpressionAccess().getGroup_1()); 
            // InternalAPIMappingLanguage.g:7082:1: ( rule__AdditionExpression__Group_1__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=28 && LA43_0<=29)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalAPIMappingLanguage.g:7082:2: rule__AdditionExpression__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_45);
            	    rule__AdditionExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

             after(grammarAccess.getAdditionExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__Group__1__Impl"


    // $ANTLR start "rule__AdditionExpression__Group_1__0"
    // InternalAPIMappingLanguage.g:7096:1: rule__AdditionExpression__Group_1__0 : rule__AdditionExpression__Group_1__0__Impl rule__AdditionExpression__Group_1__1 ;
    public final void rule__AdditionExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7100:1: ( rule__AdditionExpression__Group_1__0__Impl rule__AdditionExpression__Group_1__1 )
            // InternalAPIMappingLanguage.g:7101:2: rule__AdditionExpression__Group_1__0__Impl rule__AdditionExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_44);
            rule__AdditionExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__AdditionExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__Group_1__0"


    // $ANTLR start "rule__AdditionExpression__Group_1__0__Impl"
    // InternalAPIMappingLanguage.g:7108:1: rule__AdditionExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__AdditionExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7112:1: ( ( () ) )
            // InternalAPIMappingLanguage.g:7113:1: ( () )
            {
            // InternalAPIMappingLanguage.g:7113:1: ( () )
            // InternalAPIMappingLanguage.g:7114:1: ()
            {
             before(grammarAccess.getAdditionExpressionAccess().getArithmeticExpressionLeftExpressionAction_1_0()); 
            // InternalAPIMappingLanguage.g:7115:1: ()
            // InternalAPIMappingLanguage.g:7117:1: 
            {
            }

             after(grammarAccess.getAdditionExpressionAccess().getArithmeticExpressionLeftExpressionAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__Group_1__0__Impl"


    // $ANTLR start "rule__AdditionExpression__Group_1__1"
    // InternalAPIMappingLanguage.g:7127:1: rule__AdditionExpression__Group_1__1 : rule__AdditionExpression__Group_1__1__Impl rule__AdditionExpression__Group_1__2 ;
    public final void rule__AdditionExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7131:1: ( rule__AdditionExpression__Group_1__1__Impl rule__AdditionExpression__Group_1__2 )
            // InternalAPIMappingLanguage.g:7132:2: rule__AdditionExpression__Group_1__1__Impl rule__AdditionExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__AdditionExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__AdditionExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__Group_1__1"


    // $ANTLR start "rule__AdditionExpression__Group_1__1__Impl"
    // InternalAPIMappingLanguage.g:7139:1: rule__AdditionExpression__Group_1__1__Impl : ( ( rule__AdditionExpression__OperatorAssignment_1_1 ) ) ;
    public final void rule__AdditionExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7143:1: ( ( ( rule__AdditionExpression__OperatorAssignment_1_1 ) ) )
            // InternalAPIMappingLanguage.g:7144:1: ( ( rule__AdditionExpression__OperatorAssignment_1_1 ) )
            {
            // InternalAPIMappingLanguage.g:7144:1: ( ( rule__AdditionExpression__OperatorAssignment_1_1 ) )
            // InternalAPIMappingLanguage.g:7145:1: ( rule__AdditionExpression__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getAdditionExpressionAccess().getOperatorAssignment_1_1()); 
            // InternalAPIMappingLanguage.g:7146:1: ( rule__AdditionExpression__OperatorAssignment_1_1 )
            // InternalAPIMappingLanguage.g:7146:2: rule__AdditionExpression__OperatorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AdditionExpression__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAdditionExpressionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__Group_1__1__Impl"


    // $ANTLR start "rule__AdditionExpression__Group_1__2"
    // InternalAPIMappingLanguage.g:7156:1: rule__AdditionExpression__Group_1__2 : rule__AdditionExpression__Group_1__2__Impl ;
    public final void rule__AdditionExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7160:1: ( rule__AdditionExpression__Group_1__2__Impl )
            // InternalAPIMappingLanguage.g:7161:2: rule__AdditionExpression__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AdditionExpression__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__Group_1__2"


    // $ANTLR start "rule__AdditionExpression__Group_1__2__Impl"
    // InternalAPIMappingLanguage.g:7167:1: rule__AdditionExpression__Group_1__2__Impl : ( ( rule__AdditionExpression__RightExpressionAssignment_1_2 ) ) ;
    public final void rule__AdditionExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7171:1: ( ( ( rule__AdditionExpression__RightExpressionAssignment_1_2 ) ) )
            // InternalAPIMappingLanguage.g:7172:1: ( ( rule__AdditionExpression__RightExpressionAssignment_1_2 ) )
            {
            // InternalAPIMappingLanguage.g:7172:1: ( ( rule__AdditionExpression__RightExpressionAssignment_1_2 ) )
            // InternalAPIMappingLanguage.g:7173:1: ( rule__AdditionExpression__RightExpressionAssignment_1_2 )
            {
             before(grammarAccess.getAdditionExpressionAccess().getRightExpressionAssignment_1_2()); 
            // InternalAPIMappingLanguage.g:7174:1: ( rule__AdditionExpression__RightExpressionAssignment_1_2 )
            // InternalAPIMappingLanguage.g:7174:2: rule__AdditionExpression__RightExpressionAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AdditionExpression__RightExpressionAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAdditionExpressionAccess().getRightExpressionAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__Group_1__2__Impl"


    // $ANTLR start "rule__MultiplicationExpression__Group_1__0"
    // InternalAPIMappingLanguage.g:7190:1: rule__MultiplicationExpression__Group_1__0 : rule__MultiplicationExpression__Group_1__0__Impl rule__MultiplicationExpression__Group_1__1 ;
    public final void rule__MultiplicationExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7194:1: ( rule__MultiplicationExpression__Group_1__0__Impl rule__MultiplicationExpression__Group_1__1 )
            // InternalAPIMappingLanguage.g:7195:2: rule__MultiplicationExpression__Group_1__0__Impl rule__MultiplicationExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_46);
            rule__MultiplicationExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__MultiplicationExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group_1__0"


    // $ANTLR start "rule__MultiplicationExpression__Group_1__0__Impl"
    // InternalAPIMappingLanguage.g:7202:1: rule__MultiplicationExpression__Group_1__0__Impl : ( ruleTypeCastExpression ) ;
    public final void rule__MultiplicationExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7206:1: ( ( ruleTypeCastExpression ) )
            // InternalAPIMappingLanguage.g:7207:1: ( ruleTypeCastExpression )
            {
            // InternalAPIMappingLanguage.g:7207:1: ( ruleTypeCastExpression )
            // InternalAPIMappingLanguage.g:7208:1: ruleTypeCastExpression
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getTypeCastExpressionParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTypeCastExpression();

            state._fsp--;

             after(grammarAccess.getMultiplicationExpressionAccess().getTypeCastExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group_1__0__Impl"


    // $ANTLR start "rule__MultiplicationExpression__Group_1__1"
    // InternalAPIMappingLanguage.g:7219:1: rule__MultiplicationExpression__Group_1__1 : rule__MultiplicationExpression__Group_1__1__Impl ;
    public final void rule__MultiplicationExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7223:1: ( rule__MultiplicationExpression__Group_1__1__Impl )
            // InternalAPIMappingLanguage.g:7224:2: rule__MultiplicationExpression__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MultiplicationExpression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group_1__1"


    // $ANTLR start "rule__MultiplicationExpression__Group_1__1__Impl"
    // InternalAPIMappingLanguage.g:7230:1: rule__MultiplicationExpression__Group_1__1__Impl : ( ( rule__MultiplicationExpression__Group_1_1__0 )* ) ;
    public final void rule__MultiplicationExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7234:1: ( ( ( rule__MultiplicationExpression__Group_1_1__0 )* ) )
            // InternalAPIMappingLanguage.g:7235:1: ( ( rule__MultiplicationExpression__Group_1_1__0 )* )
            {
            // InternalAPIMappingLanguage.g:7235:1: ( ( rule__MultiplicationExpression__Group_1_1__0 )* )
            // InternalAPIMappingLanguage.g:7236:1: ( rule__MultiplicationExpression__Group_1_1__0 )*
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getGroup_1_1()); 
            // InternalAPIMappingLanguage.g:7237:1: ( rule__MultiplicationExpression__Group_1_1__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( ((LA44_0>=30 && LA44_0<=32)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalAPIMappingLanguage.g:7237:2: rule__MultiplicationExpression__Group_1_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_47);
            	    rule__MultiplicationExpression__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

             after(grammarAccess.getMultiplicationExpressionAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group_1__1__Impl"


    // $ANTLR start "rule__MultiplicationExpression__Group_1_1__0"
    // InternalAPIMappingLanguage.g:7251:1: rule__MultiplicationExpression__Group_1_1__0 : rule__MultiplicationExpression__Group_1_1__0__Impl rule__MultiplicationExpression__Group_1_1__1 ;
    public final void rule__MultiplicationExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7255:1: ( rule__MultiplicationExpression__Group_1_1__0__Impl rule__MultiplicationExpression__Group_1_1__1 )
            // InternalAPIMappingLanguage.g:7256:2: rule__MultiplicationExpression__Group_1_1__0__Impl rule__MultiplicationExpression__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_46);
            rule__MultiplicationExpression__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__MultiplicationExpression__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group_1_1__0"


    // $ANTLR start "rule__MultiplicationExpression__Group_1_1__0__Impl"
    // InternalAPIMappingLanguage.g:7263:1: rule__MultiplicationExpression__Group_1_1__0__Impl : ( () ) ;
    public final void rule__MultiplicationExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7267:1: ( ( () ) )
            // InternalAPIMappingLanguage.g:7268:1: ( () )
            {
            // InternalAPIMappingLanguage.g:7268:1: ( () )
            // InternalAPIMappingLanguage.g:7269:1: ()
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getArithmeticExpressionLeftExpressionAction_1_1_0()); 
            // InternalAPIMappingLanguage.g:7270:1: ()
            // InternalAPIMappingLanguage.g:7272:1: 
            {
            }

             after(grammarAccess.getMultiplicationExpressionAccess().getArithmeticExpressionLeftExpressionAction_1_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group_1_1__0__Impl"


    // $ANTLR start "rule__MultiplicationExpression__Group_1_1__1"
    // InternalAPIMappingLanguage.g:7282:1: rule__MultiplicationExpression__Group_1_1__1 : rule__MultiplicationExpression__Group_1_1__1__Impl rule__MultiplicationExpression__Group_1_1__2 ;
    public final void rule__MultiplicationExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7286:1: ( rule__MultiplicationExpression__Group_1_1__1__Impl rule__MultiplicationExpression__Group_1_1__2 )
            // InternalAPIMappingLanguage.g:7287:2: rule__MultiplicationExpression__Group_1_1__1__Impl rule__MultiplicationExpression__Group_1_1__2
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__MultiplicationExpression__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__MultiplicationExpression__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group_1_1__1"


    // $ANTLR start "rule__MultiplicationExpression__Group_1_1__1__Impl"
    // InternalAPIMappingLanguage.g:7294:1: rule__MultiplicationExpression__Group_1_1__1__Impl : ( ( rule__MultiplicationExpression__OperatorAssignment_1_1_1 ) ) ;
    public final void rule__MultiplicationExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7298:1: ( ( ( rule__MultiplicationExpression__OperatorAssignment_1_1_1 ) ) )
            // InternalAPIMappingLanguage.g:7299:1: ( ( rule__MultiplicationExpression__OperatorAssignment_1_1_1 ) )
            {
            // InternalAPIMappingLanguage.g:7299:1: ( ( rule__MultiplicationExpression__OperatorAssignment_1_1_1 ) )
            // InternalAPIMappingLanguage.g:7300:1: ( rule__MultiplicationExpression__OperatorAssignment_1_1_1 )
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getOperatorAssignment_1_1_1()); 
            // InternalAPIMappingLanguage.g:7301:1: ( rule__MultiplicationExpression__OperatorAssignment_1_1_1 )
            // InternalAPIMappingLanguage.g:7301:2: rule__MultiplicationExpression__OperatorAssignment_1_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MultiplicationExpression__OperatorAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationExpressionAccess().getOperatorAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group_1_1__1__Impl"


    // $ANTLR start "rule__MultiplicationExpression__Group_1_1__2"
    // InternalAPIMappingLanguage.g:7311:1: rule__MultiplicationExpression__Group_1_1__2 : rule__MultiplicationExpression__Group_1_1__2__Impl ;
    public final void rule__MultiplicationExpression__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7315:1: ( rule__MultiplicationExpression__Group_1_1__2__Impl )
            // InternalAPIMappingLanguage.g:7316:2: rule__MultiplicationExpression__Group_1_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MultiplicationExpression__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group_1_1__2"


    // $ANTLR start "rule__MultiplicationExpression__Group_1_1__2__Impl"
    // InternalAPIMappingLanguage.g:7322:1: rule__MultiplicationExpression__Group_1_1__2__Impl : ( ( rule__MultiplicationExpression__RightExpressionAssignment_1_1_2 ) ) ;
    public final void rule__MultiplicationExpression__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7326:1: ( ( ( rule__MultiplicationExpression__RightExpressionAssignment_1_1_2 ) ) )
            // InternalAPIMappingLanguage.g:7327:1: ( ( rule__MultiplicationExpression__RightExpressionAssignment_1_1_2 ) )
            {
            // InternalAPIMappingLanguage.g:7327:1: ( ( rule__MultiplicationExpression__RightExpressionAssignment_1_1_2 ) )
            // InternalAPIMappingLanguage.g:7328:1: ( rule__MultiplicationExpression__RightExpressionAssignment_1_1_2 )
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getRightExpressionAssignment_1_1_2()); 
            // InternalAPIMappingLanguage.g:7329:1: ( rule__MultiplicationExpression__RightExpressionAssignment_1_1_2 )
            // InternalAPIMappingLanguage.g:7329:2: rule__MultiplicationExpression__RightExpressionAssignment_1_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MultiplicationExpression__RightExpressionAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationExpressionAccess().getRightExpressionAssignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__Group_1_1__2__Impl"


    // $ANTLR start "rule__UnaryPreExpression__Group__0"
    // InternalAPIMappingLanguage.g:7345:1: rule__UnaryPreExpression__Group__0 : rule__UnaryPreExpression__Group__0__Impl rule__UnaryPreExpression__Group__1 ;
    public final void rule__UnaryPreExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7349:1: ( rule__UnaryPreExpression__Group__0__Impl rule__UnaryPreExpression__Group__1 )
            // InternalAPIMappingLanguage.g:7350:2: rule__UnaryPreExpression__Group__0__Impl rule__UnaryPreExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_48);
            rule__UnaryPreExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnaryPreExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryPreExpression__Group__0"


    // $ANTLR start "rule__UnaryPreExpression__Group__0__Impl"
    // InternalAPIMappingLanguage.g:7357:1: rule__UnaryPreExpression__Group__0__Impl : ( () ) ;
    public final void rule__UnaryPreExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7361:1: ( ( () ) )
            // InternalAPIMappingLanguage.g:7362:1: ( () )
            {
            // InternalAPIMappingLanguage.g:7362:1: ( () )
            // InternalAPIMappingLanguage.g:7363:1: ()
            {
             before(grammarAccess.getUnaryPreExpressionAccess().getUnaryExpressionAction_0()); 
            // InternalAPIMappingLanguage.g:7364:1: ()
            // InternalAPIMappingLanguage.g:7366:1: 
            {
            }

             after(grammarAccess.getUnaryPreExpressionAccess().getUnaryExpressionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryPreExpression__Group__0__Impl"


    // $ANTLR start "rule__UnaryPreExpression__Group__1"
    // InternalAPIMappingLanguage.g:7376:1: rule__UnaryPreExpression__Group__1 : rule__UnaryPreExpression__Group__1__Impl rule__UnaryPreExpression__Group__2 ;
    public final void rule__UnaryPreExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7380:1: ( rule__UnaryPreExpression__Group__1__Impl rule__UnaryPreExpression__Group__2 )
            // InternalAPIMappingLanguage.g:7381:2: rule__UnaryPreExpression__Group__1__Impl rule__UnaryPreExpression__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__UnaryPreExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnaryPreExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryPreExpression__Group__1"


    // $ANTLR start "rule__UnaryPreExpression__Group__1__Impl"
    // InternalAPIMappingLanguage.g:7388:1: rule__UnaryPreExpression__Group__1__Impl : ( ( rule__UnaryPreExpression__OperatorAssignment_1 ) ) ;
    public final void rule__UnaryPreExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7392:1: ( ( ( rule__UnaryPreExpression__OperatorAssignment_1 ) ) )
            // InternalAPIMappingLanguage.g:7393:1: ( ( rule__UnaryPreExpression__OperatorAssignment_1 ) )
            {
            // InternalAPIMappingLanguage.g:7393:1: ( ( rule__UnaryPreExpression__OperatorAssignment_1 ) )
            // InternalAPIMappingLanguage.g:7394:1: ( rule__UnaryPreExpression__OperatorAssignment_1 )
            {
             before(grammarAccess.getUnaryPreExpressionAccess().getOperatorAssignment_1()); 
            // InternalAPIMappingLanguage.g:7395:1: ( rule__UnaryPreExpression__OperatorAssignment_1 )
            // InternalAPIMappingLanguage.g:7395:2: rule__UnaryPreExpression__OperatorAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnaryPreExpression__OperatorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUnaryPreExpressionAccess().getOperatorAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryPreExpression__Group__1__Impl"


    // $ANTLR start "rule__UnaryPreExpression__Group__2"
    // InternalAPIMappingLanguage.g:7405:1: rule__UnaryPreExpression__Group__2 : rule__UnaryPreExpression__Group__2__Impl ;
    public final void rule__UnaryPreExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7409:1: ( rule__UnaryPreExpression__Group__2__Impl )
            // InternalAPIMappingLanguage.g:7410:2: rule__UnaryPreExpression__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnaryPreExpression__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryPreExpression__Group__2"


    // $ANTLR start "rule__UnaryPreExpression__Group__2__Impl"
    // InternalAPIMappingLanguage.g:7416:1: rule__UnaryPreExpression__Group__2__Impl : ( ( rule__UnaryPreExpression__EnclosedExpressionAssignment_2 ) ) ;
    public final void rule__UnaryPreExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7420:1: ( ( ( rule__UnaryPreExpression__EnclosedExpressionAssignment_2 ) ) )
            // InternalAPIMappingLanguage.g:7421:1: ( ( rule__UnaryPreExpression__EnclosedExpressionAssignment_2 ) )
            {
            // InternalAPIMappingLanguage.g:7421:1: ( ( rule__UnaryPreExpression__EnclosedExpressionAssignment_2 ) )
            // InternalAPIMappingLanguage.g:7422:1: ( rule__UnaryPreExpression__EnclosedExpressionAssignment_2 )
            {
             before(grammarAccess.getUnaryPreExpressionAccess().getEnclosedExpressionAssignment_2()); 
            // InternalAPIMappingLanguage.g:7423:1: ( rule__UnaryPreExpression__EnclosedExpressionAssignment_2 )
            // InternalAPIMappingLanguage.g:7423:2: rule__UnaryPreExpression__EnclosedExpressionAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__UnaryPreExpression__EnclosedExpressionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUnaryPreExpressionAccess().getEnclosedExpressionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryPreExpression__Group__2__Impl"


    // $ANTLR start "rule__TypeCastExpression__Group_1__0"
    // InternalAPIMappingLanguage.g:7439:1: rule__TypeCastExpression__Group_1__0 : rule__TypeCastExpression__Group_1__0__Impl rule__TypeCastExpression__Group_1__1 ;
    public final void rule__TypeCastExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7443:1: ( rule__TypeCastExpression__Group_1__0__Impl rule__TypeCastExpression__Group_1__1 )
            // InternalAPIMappingLanguage.g:7444:2: rule__TypeCastExpression__Group_1__0__Impl rule__TypeCastExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__TypeCastExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypeCastExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeCastExpression__Group_1__0"


    // $ANTLR start "rule__TypeCastExpression__Group_1__0__Impl"
    // InternalAPIMappingLanguage.g:7451:1: rule__TypeCastExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__TypeCastExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7455:1: ( ( () ) )
            // InternalAPIMappingLanguage.g:7456:1: ( () )
            {
            // InternalAPIMappingLanguage.g:7456:1: ( () )
            // InternalAPIMappingLanguage.g:7457:1: ()
            {
             before(grammarAccess.getTypeCastExpressionAccess().getTypeCastExpressionAction_1_0()); 
            // InternalAPIMappingLanguage.g:7458:1: ()
            // InternalAPIMappingLanguage.g:7460:1: 
            {
            }

             after(grammarAccess.getTypeCastExpressionAccess().getTypeCastExpressionAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeCastExpression__Group_1__0__Impl"


    // $ANTLR start "rule__TypeCastExpression__Group_1__1"
    // InternalAPIMappingLanguage.g:7470:1: rule__TypeCastExpression__Group_1__1 : rule__TypeCastExpression__Group_1__1__Impl rule__TypeCastExpression__Group_1__2 ;
    public final void rule__TypeCastExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7474:1: ( rule__TypeCastExpression__Group_1__1__Impl rule__TypeCastExpression__Group_1__2 )
            // InternalAPIMappingLanguage.g:7475:2: rule__TypeCastExpression__Group_1__1__Impl rule__TypeCastExpression__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TypeCastExpression__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypeCastExpression__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeCastExpression__Group_1__1"


    // $ANTLR start "rule__TypeCastExpression__Group_1__1__Impl"
    // InternalAPIMappingLanguage.g:7482:1: rule__TypeCastExpression__Group_1__1__Impl : ( '(' ) ;
    public final void rule__TypeCastExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7486:1: ( ( '(' ) )
            // InternalAPIMappingLanguage.g:7487:1: ( '(' )
            {
            // InternalAPIMappingLanguage.g:7487:1: ( '(' )
            // InternalAPIMappingLanguage.g:7488:1: '('
            {
             before(grammarAccess.getTypeCastExpressionAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,50,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getTypeCastExpressionAccess().getLeftParenthesisKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeCastExpression__Group_1__1__Impl"


    // $ANTLR start "rule__TypeCastExpression__Group_1__2"
    // InternalAPIMappingLanguage.g:7501:1: rule__TypeCastExpression__Group_1__2 : rule__TypeCastExpression__Group_1__2__Impl rule__TypeCastExpression__Group_1__3 ;
    public final void rule__TypeCastExpression__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7505:1: ( rule__TypeCastExpression__Group_1__2__Impl rule__TypeCastExpression__Group_1__3 )
            // InternalAPIMappingLanguage.g:7506:2: rule__TypeCastExpression__Group_1__2__Impl rule__TypeCastExpression__Group_1__3
            {
            pushFollow(FollowSets000.FOLLOW_26);
            rule__TypeCastExpression__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypeCastExpression__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeCastExpression__Group_1__2"


    // $ANTLR start "rule__TypeCastExpression__Group_1__2__Impl"
    // InternalAPIMappingLanguage.g:7513:1: rule__TypeCastExpression__Group_1__2__Impl : ( ( rule__TypeCastExpression__DataTypeAssignment_1_2 ) ) ;
    public final void rule__TypeCastExpression__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7517:1: ( ( ( rule__TypeCastExpression__DataTypeAssignment_1_2 ) ) )
            // InternalAPIMappingLanguage.g:7518:1: ( ( rule__TypeCastExpression__DataTypeAssignment_1_2 ) )
            {
            // InternalAPIMappingLanguage.g:7518:1: ( ( rule__TypeCastExpression__DataTypeAssignment_1_2 ) )
            // InternalAPIMappingLanguage.g:7519:1: ( rule__TypeCastExpression__DataTypeAssignment_1_2 )
            {
             before(grammarAccess.getTypeCastExpressionAccess().getDataTypeAssignment_1_2()); 
            // InternalAPIMappingLanguage.g:7520:1: ( rule__TypeCastExpression__DataTypeAssignment_1_2 )
            // InternalAPIMappingLanguage.g:7520:2: rule__TypeCastExpression__DataTypeAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypeCastExpression__DataTypeAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getTypeCastExpressionAccess().getDataTypeAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeCastExpression__Group_1__2__Impl"


    // $ANTLR start "rule__TypeCastExpression__Group_1__3"
    // InternalAPIMappingLanguage.g:7530:1: rule__TypeCastExpression__Group_1__3 : rule__TypeCastExpression__Group_1__3__Impl rule__TypeCastExpression__Group_1__4 ;
    public final void rule__TypeCastExpression__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7534:1: ( rule__TypeCastExpression__Group_1__3__Impl rule__TypeCastExpression__Group_1__4 )
            // InternalAPIMappingLanguage.g:7535:2: rule__TypeCastExpression__Group_1__3__Impl rule__TypeCastExpression__Group_1__4
            {
            pushFollow(FollowSets000.FOLLOW_49);
            rule__TypeCastExpression__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypeCastExpression__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeCastExpression__Group_1__3"


    // $ANTLR start "rule__TypeCastExpression__Group_1__3__Impl"
    // InternalAPIMappingLanguage.g:7542:1: rule__TypeCastExpression__Group_1__3__Impl : ( ')' ) ;
    public final void rule__TypeCastExpression__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7546:1: ( ( ')' ) )
            // InternalAPIMappingLanguage.g:7547:1: ( ')' )
            {
            // InternalAPIMappingLanguage.g:7547:1: ( ')' )
            // InternalAPIMappingLanguage.g:7548:1: ')'
            {
             before(grammarAccess.getTypeCastExpressionAccess().getRightParenthesisKeyword_1_3()); 
            match(input,51,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getTypeCastExpressionAccess().getRightParenthesisKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeCastExpression__Group_1__3__Impl"


    // $ANTLR start "rule__TypeCastExpression__Group_1__4"
    // InternalAPIMappingLanguage.g:7561:1: rule__TypeCastExpression__Group_1__4 : rule__TypeCastExpression__Group_1__4__Impl ;
    public final void rule__TypeCastExpression__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7565:1: ( rule__TypeCastExpression__Group_1__4__Impl )
            // InternalAPIMappingLanguage.g:7566:2: rule__TypeCastExpression__Group_1__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypeCastExpression__Group_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeCastExpression__Group_1__4"


    // $ANTLR start "rule__TypeCastExpression__Group_1__4__Impl"
    // InternalAPIMappingLanguage.g:7572:1: rule__TypeCastExpression__Group_1__4__Impl : ( ( rule__TypeCastExpression__EnclosedExpressionAssignment_1_4 ) ) ;
    public final void rule__TypeCastExpression__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7576:1: ( ( ( rule__TypeCastExpression__EnclosedExpressionAssignment_1_4 ) ) )
            // InternalAPIMappingLanguage.g:7577:1: ( ( rule__TypeCastExpression__EnclosedExpressionAssignment_1_4 ) )
            {
            // InternalAPIMappingLanguage.g:7577:1: ( ( rule__TypeCastExpression__EnclosedExpressionAssignment_1_4 ) )
            // InternalAPIMappingLanguage.g:7578:1: ( rule__TypeCastExpression__EnclosedExpressionAssignment_1_4 )
            {
             before(grammarAccess.getTypeCastExpressionAccess().getEnclosedExpressionAssignment_1_4()); 
            // InternalAPIMappingLanguage.g:7579:1: ( rule__TypeCastExpression__EnclosedExpressionAssignment_1_4 )
            // InternalAPIMappingLanguage.g:7579:2: rule__TypeCastExpression__EnclosedExpressionAssignment_1_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypeCastExpression__EnclosedExpressionAssignment_1_4();

            state._fsp--;


            }

             after(grammarAccess.getTypeCastExpressionAccess().getEnclosedExpressionAssignment_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeCastExpression__Group_1__4__Impl"


    // $ANTLR start "rule__Operand__Group_0__0"
    // InternalAPIMappingLanguage.g:7599:1: rule__Operand__Group_0__0 : rule__Operand__Group_0__0__Impl rule__Operand__Group_0__1 ;
    public final void rule__Operand__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7603:1: ( rule__Operand__Group_0__0__Impl rule__Operand__Group_0__1 )
            // InternalAPIMappingLanguage.g:7604:2: rule__Operand__Group_0__0__Impl rule__Operand__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__Operand__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Operand__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operand__Group_0__0"


    // $ANTLR start "rule__Operand__Group_0__0__Impl"
    // InternalAPIMappingLanguage.g:7611:1: rule__Operand__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Operand__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7615:1: ( ( '(' ) )
            // InternalAPIMappingLanguage.g:7616:1: ( '(' )
            {
            // InternalAPIMappingLanguage.g:7616:1: ( '(' )
            // InternalAPIMappingLanguage.g:7617:1: '('
            {
             before(grammarAccess.getOperandAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,50,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getOperandAccess().getLeftParenthesisKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operand__Group_0__0__Impl"


    // $ANTLR start "rule__Operand__Group_0__1"
    // InternalAPIMappingLanguage.g:7630:1: rule__Operand__Group_0__1 : rule__Operand__Group_0__1__Impl rule__Operand__Group_0__2 ;
    public final void rule__Operand__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7634:1: ( rule__Operand__Group_0__1__Impl rule__Operand__Group_0__2 )
            // InternalAPIMappingLanguage.g:7635:2: rule__Operand__Group_0__1__Impl rule__Operand__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_26);
            rule__Operand__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__Operand__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operand__Group_0__1"


    // $ANTLR start "rule__Operand__Group_0__1__Impl"
    // InternalAPIMappingLanguage.g:7642:1: rule__Operand__Group_0__1__Impl : ( ruleExpression ) ;
    public final void rule__Operand__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7646:1: ( ( ruleExpression ) )
            // InternalAPIMappingLanguage.g:7647:1: ( ruleExpression )
            {
            // InternalAPIMappingLanguage.g:7647:1: ( ruleExpression )
            // InternalAPIMappingLanguage.g:7648:1: ruleExpression
            {
             before(grammarAccess.getOperandAccess().getExpressionParserRuleCall_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getOperandAccess().getExpressionParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operand__Group_0__1__Impl"


    // $ANTLR start "rule__Operand__Group_0__2"
    // InternalAPIMappingLanguage.g:7659:1: rule__Operand__Group_0__2 : rule__Operand__Group_0__2__Impl ;
    public final void rule__Operand__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7663:1: ( rule__Operand__Group_0__2__Impl )
            // InternalAPIMappingLanguage.g:7664:2: rule__Operand__Group_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Operand__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operand__Group_0__2"


    // $ANTLR start "rule__Operand__Group_0__2__Impl"
    // InternalAPIMappingLanguage.g:7670:1: rule__Operand__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Operand__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7674:1: ( ( ')' ) )
            // InternalAPIMappingLanguage.g:7675:1: ( ')' )
            {
            // InternalAPIMappingLanguage.g:7675:1: ( ')' )
            // InternalAPIMappingLanguage.g:7676:1: ')'
            {
             before(grammarAccess.getOperandAccess().getRightParenthesisKeyword_0_2()); 
            match(input,51,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getOperandAccess().getRightParenthesisKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operand__Group_0__2__Impl"


    // $ANTLR start "rule__LiteralExpression__Group__0"
    // InternalAPIMappingLanguage.g:7695:1: rule__LiteralExpression__Group__0 : rule__LiteralExpression__Group__0__Impl rule__LiteralExpression__Group__1 ;
    public final void rule__LiteralExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7699:1: ( rule__LiteralExpression__Group__0__Impl rule__LiteralExpression__Group__1 )
            // InternalAPIMappingLanguage.g:7700:2: rule__LiteralExpression__Group__0__Impl rule__LiteralExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_50);
            rule__LiteralExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__LiteralExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralExpression__Group__0"


    // $ANTLR start "rule__LiteralExpression__Group__0__Impl"
    // InternalAPIMappingLanguage.g:7707:1: rule__LiteralExpression__Group__0__Impl : ( () ) ;
    public final void rule__LiteralExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7711:1: ( ( () ) )
            // InternalAPIMappingLanguage.g:7712:1: ( () )
            {
            // InternalAPIMappingLanguage.g:7712:1: ( () )
            // InternalAPIMappingLanguage.g:7713:1: ()
            {
             before(grammarAccess.getLiteralExpressionAccess().getLiteralExpressionAction_0()); 
            // InternalAPIMappingLanguage.g:7714:1: ()
            // InternalAPIMappingLanguage.g:7716:1: 
            {
            }

             after(grammarAccess.getLiteralExpressionAccess().getLiteralExpressionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralExpression__Group__0__Impl"


    // $ANTLR start "rule__LiteralExpression__Group__1"
    // InternalAPIMappingLanguage.g:7726:1: rule__LiteralExpression__Group__1 : rule__LiteralExpression__Group__1__Impl ;
    public final void rule__LiteralExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7730:1: ( rule__LiteralExpression__Group__1__Impl )
            // InternalAPIMappingLanguage.g:7731:2: rule__LiteralExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LiteralExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralExpression__Group__1"


    // $ANTLR start "rule__LiteralExpression__Group__1__Impl"
    // InternalAPIMappingLanguage.g:7737:1: rule__LiteralExpression__Group__1__Impl : ( ( rule__LiteralExpression__ValueAssignment_1 ) ) ;
    public final void rule__LiteralExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7741:1: ( ( ( rule__LiteralExpression__ValueAssignment_1 ) ) )
            // InternalAPIMappingLanguage.g:7742:1: ( ( rule__LiteralExpression__ValueAssignment_1 ) )
            {
            // InternalAPIMappingLanguage.g:7742:1: ( ( rule__LiteralExpression__ValueAssignment_1 ) )
            // InternalAPIMappingLanguage.g:7743:1: ( rule__LiteralExpression__ValueAssignment_1 )
            {
             before(grammarAccess.getLiteralExpressionAccess().getValueAssignment_1()); 
            // InternalAPIMappingLanguage.g:7744:1: ( rule__LiteralExpression__ValueAssignment_1 )
            // InternalAPIMappingLanguage.g:7744:2: rule__LiteralExpression__ValueAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LiteralExpression__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLiteralExpressionAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralExpression__Group__1__Impl"


    // $ANTLR start "rule__ExtendedTypedNamedElementExpression__Group__0"
    // InternalAPIMappingLanguage.g:7758:1: rule__ExtendedTypedNamedElementExpression__Group__0 : rule__ExtendedTypedNamedElementExpression__Group__0__Impl rule__ExtendedTypedNamedElementExpression__Group__1 ;
    public final void rule__ExtendedTypedNamedElementExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7762:1: ( rule__ExtendedTypedNamedElementExpression__Group__0__Impl rule__ExtendedTypedNamedElementExpression__Group__1 )
            // InternalAPIMappingLanguage.g:7763:2: rule__ExtendedTypedNamedElementExpression__Group__0__Impl rule__ExtendedTypedNamedElementExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_51);
            rule__ExtendedTypedNamedElementExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExtendedTypedNamedElementExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedTypedNamedElementExpression__Group__0"


    // $ANTLR start "rule__ExtendedTypedNamedElementExpression__Group__0__Impl"
    // InternalAPIMappingLanguage.g:7770:1: rule__ExtendedTypedNamedElementExpression__Group__0__Impl : ( ruleTypedNamedElementExpression ) ;
    public final void rule__ExtendedTypedNamedElementExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7774:1: ( ( ruleTypedNamedElementExpression ) )
            // InternalAPIMappingLanguage.g:7775:1: ( ruleTypedNamedElementExpression )
            {
            // InternalAPIMappingLanguage.g:7775:1: ( ruleTypedNamedElementExpression )
            // InternalAPIMappingLanguage.g:7776:1: ruleTypedNamedElementExpression
            {
             before(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getTypedNamedElementExpressionParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTypedNamedElementExpression();

            state._fsp--;

             after(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getTypedNamedElementExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedTypedNamedElementExpression__Group__0__Impl"


    // $ANTLR start "rule__ExtendedTypedNamedElementExpression__Group__1"
    // InternalAPIMappingLanguage.g:7787:1: rule__ExtendedTypedNamedElementExpression__Group__1 : rule__ExtendedTypedNamedElementExpression__Group__1__Impl ;
    public final void rule__ExtendedTypedNamedElementExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7791:1: ( rule__ExtendedTypedNamedElementExpression__Group__1__Impl )
            // InternalAPIMappingLanguage.g:7792:2: rule__ExtendedTypedNamedElementExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExtendedTypedNamedElementExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedTypedNamedElementExpression__Group__1"


    // $ANTLR start "rule__ExtendedTypedNamedElementExpression__Group__1__Impl"
    // InternalAPIMappingLanguage.g:7798:1: rule__ExtendedTypedNamedElementExpression__Group__1__Impl : ( ( rule__ExtendedTypedNamedElementExpression__Alternatives_1 )? ) ;
    public final void rule__ExtendedTypedNamedElementExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7802:1: ( ( ( rule__ExtendedTypedNamedElementExpression__Alternatives_1 )? ) )
            // InternalAPIMappingLanguage.g:7803:1: ( ( rule__ExtendedTypedNamedElementExpression__Alternatives_1 )? )
            {
            // InternalAPIMappingLanguage.g:7803:1: ( ( rule__ExtendedTypedNamedElementExpression__Alternatives_1 )? )
            // InternalAPIMappingLanguage.g:7804:1: ( rule__ExtendedTypedNamedElementExpression__Alternatives_1 )?
            {
             before(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getAlternatives_1()); 
            // InternalAPIMappingLanguage.g:7805:1: ( rule__ExtendedTypedNamedElementExpression__Alternatives_1 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=17 && LA45_0<=18)||LA45_0==65) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalAPIMappingLanguage.g:7805:2: rule__ExtendedTypedNamedElementExpression__Alternatives_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ExtendedTypedNamedElementExpression__Alternatives_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedTypedNamedElementExpression__Group__1__Impl"


    // $ANTLR start "rule__ExtendedTypedNamedElementExpression__Group_1_0__0"
    // InternalAPIMappingLanguage.g:7819:1: rule__ExtendedTypedNamedElementExpression__Group_1_0__0 : rule__ExtendedTypedNamedElementExpression__Group_1_0__0__Impl rule__ExtendedTypedNamedElementExpression__Group_1_0__1 ;
    public final void rule__ExtendedTypedNamedElementExpression__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7823:1: ( rule__ExtendedTypedNamedElementExpression__Group_1_0__0__Impl rule__ExtendedTypedNamedElementExpression__Group_1_0__1 )
            // InternalAPIMappingLanguage.g:7824:2: rule__ExtendedTypedNamedElementExpression__Group_1_0__0__Impl rule__ExtendedTypedNamedElementExpression__Group_1_0__1
            {
            pushFollow(FollowSets000.FOLLOW_52);
            rule__ExtendedTypedNamedElementExpression__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExtendedTypedNamedElementExpression__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedTypedNamedElementExpression__Group_1_0__0"


    // $ANTLR start "rule__ExtendedTypedNamedElementExpression__Group_1_0__0__Impl"
    // InternalAPIMappingLanguage.g:7831:1: rule__ExtendedTypedNamedElementExpression__Group_1_0__0__Impl : ( () ) ;
    public final void rule__ExtendedTypedNamedElementExpression__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7835:1: ( ( () ) )
            // InternalAPIMappingLanguage.g:7836:1: ( () )
            {
            // InternalAPIMappingLanguage.g:7836:1: ( () )
            // InternalAPIMappingLanguage.g:7837:1: ()
            {
             before(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getDiscreteInteractionEndpointReferenceTypedNamedElementExpressionAction_1_0_0()); 
            // InternalAPIMappingLanguage.g:7838:1: ()
            // InternalAPIMappingLanguage.g:7840:1: 
            {
            }

             after(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getDiscreteInteractionEndpointReferenceTypedNamedElementExpressionAction_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedTypedNamedElementExpression__Group_1_0__0__Impl"


    // $ANTLR start "rule__ExtendedTypedNamedElementExpression__Group_1_0__1"
    // InternalAPIMappingLanguage.g:7850:1: rule__ExtendedTypedNamedElementExpression__Group_1_0__1 : rule__ExtendedTypedNamedElementExpression__Group_1_0__1__Impl rule__ExtendedTypedNamedElementExpression__Group_1_0__2 ;
    public final void rule__ExtendedTypedNamedElementExpression__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7854:1: ( rule__ExtendedTypedNamedElementExpression__Group_1_0__1__Impl rule__ExtendedTypedNamedElementExpression__Group_1_0__2 )
            // InternalAPIMappingLanguage.g:7855:2: rule__ExtendedTypedNamedElementExpression__Group_1_0__1__Impl rule__ExtendedTypedNamedElementExpression__Group_1_0__2
            {
            pushFollow(FollowSets000.FOLLOW_49);
            rule__ExtendedTypedNamedElementExpression__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExtendedTypedNamedElementExpression__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedTypedNamedElementExpression__Group_1_0__1"


    // $ANTLR start "rule__ExtendedTypedNamedElementExpression__Group_1_0__1__Impl"
    // InternalAPIMappingLanguage.g:7862:1: rule__ExtendedTypedNamedElementExpression__Group_1_0__1__Impl : ( '->' ) ;
    public final void rule__ExtendedTypedNamedElementExpression__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7866:1: ( ( '->' ) )
            // InternalAPIMappingLanguage.g:7867:1: ( '->' )
            {
            // InternalAPIMappingLanguage.g:7867:1: ( '->' )
            // InternalAPIMappingLanguage.g:7868:1: '->'
            {
             before(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getHyphenMinusGreaterThanSignKeyword_1_0_1()); 
            match(input,65,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getHyphenMinusGreaterThanSignKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedTypedNamedElementExpression__Group_1_0__1__Impl"


    // $ANTLR start "rule__ExtendedTypedNamedElementExpression__Group_1_0__2"
    // InternalAPIMappingLanguage.g:7881:1: rule__ExtendedTypedNamedElementExpression__Group_1_0__2 : rule__ExtendedTypedNamedElementExpression__Group_1_0__2__Impl ;
    public final void rule__ExtendedTypedNamedElementExpression__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7885:1: ( rule__ExtendedTypedNamedElementExpression__Group_1_0__2__Impl )
            // InternalAPIMappingLanguage.g:7886:2: rule__ExtendedTypedNamedElementExpression__Group_1_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExtendedTypedNamedElementExpression__Group_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedTypedNamedElementExpression__Group_1_0__2"


    // $ANTLR start "rule__ExtendedTypedNamedElementExpression__Group_1_0__2__Impl"
    // InternalAPIMappingLanguage.g:7892:1: rule__ExtendedTypedNamedElementExpression__Group_1_0__2__Impl : ( ( rule__ExtendedTypedNamedElementExpression__PositionAssignment_1_0_2 ) ) ;
    public final void rule__ExtendedTypedNamedElementExpression__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7896:1: ( ( ( rule__ExtendedTypedNamedElementExpression__PositionAssignment_1_0_2 ) ) )
            // InternalAPIMappingLanguage.g:7897:1: ( ( rule__ExtendedTypedNamedElementExpression__PositionAssignment_1_0_2 ) )
            {
            // InternalAPIMappingLanguage.g:7897:1: ( ( rule__ExtendedTypedNamedElementExpression__PositionAssignment_1_0_2 ) )
            // InternalAPIMappingLanguage.g:7898:1: ( rule__ExtendedTypedNamedElementExpression__PositionAssignment_1_0_2 )
            {
             before(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getPositionAssignment_1_0_2()); 
            // InternalAPIMappingLanguage.g:7899:1: ( rule__ExtendedTypedNamedElementExpression__PositionAssignment_1_0_2 )
            // InternalAPIMappingLanguage.g:7899:2: rule__ExtendedTypedNamedElementExpression__PositionAssignment_1_0_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExtendedTypedNamedElementExpression__PositionAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getPositionAssignment_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedTypedNamedElementExpression__Group_1_0__2__Impl"


    // $ANTLR start "rule__ExtendedTypedNamedElementExpression__Group_1_1__0"
    // InternalAPIMappingLanguage.g:7915:1: rule__ExtendedTypedNamedElementExpression__Group_1_1__0 : rule__ExtendedTypedNamedElementExpression__Group_1_1__0__Impl rule__ExtendedTypedNamedElementExpression__Group_1_1__1 ;
    public final void rule__ExtendedTypedNamedElementExpression__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7919:1: ( rule__ExtendedTypedNamedElementExpression__Group_1_1__0__Impl rule__ExtendedTypedNamedElementExpression__Group_1_1__1 )
            // InternalAPIMappingLanguage.g:7920:2: rule__ExtendedTypedNamedElementExpression__Group_1_1__0__Impl rule__ExtendedTypedNamedElementExpression__Group_1_1__1
            {
            pushFollow(FollowSets000.FOLLOW_51);
            rule__ExtendedTypedNamedElementExpression__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExtendedTypedNamedElementExpression__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedTypedNamedElementExpression__Group_1_1__0"


    // $ANTLR start "rule__ExtendedTypedNamedElementExpression__Group_1_1__0__Impl"
    // InternalAPIMappingLanguage.g:7927:1: rule__ExtendedTypedNamedElementExpression__Group_1_1__0__Impl : ( () ) ;
    public final void rule__ExtendedTypedNamedElementExpression__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7931:1: ( ( () ) )
            // InternalAPIMappingLanguage.g:7932:1: ( () )
            {
            // InternalAPIMappingLanguage.g:7932:1: ( () )
            // InternalAPIMappingLanguage.g:7933:1: ()
            {
             before(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getAssignmentLhs_typedNamedElementExpressionAction_1_1_0()); 
            // InternalAPIMappingLanguage.g:7934:1: ()
            // InternalAPIMappingLanguage.g:7936:1: 
            {
            }

             after(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getAssignmentLhs_typedNamedElementExpressionAction_1_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedTypedNamedElementExpression__Group_1_1__0__Impl"


    // $ANTLR start "rule__ExtendedTypedNamedElementExpression__Group_1_1__1"
    // InternalAPIMappingLanguage.g:7946:1: rule__ExtendedTypedNamedElementExpression__Group_1_1__1 : rule__ExtendedTypedNamedElementExpression__Group_1_1__1__Impl ;
    public final void rule__ExtendedTypedNamedElementExpression__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7950:1: ( rule__ExtendedTypedNamedElementExpression__Group_1_1__1__Impl )
            // InternalAPIMappingLanguage.g:7951:2: rule__ExtendedTypedNamedElementExpression__Group_1_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExtendedTypedNamedElementExpression__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedTypedNamedElementExpression__Group_1_1__1"


    // $ANTLR start "rule__ExtendedTypedNamedElementExpression__Group_1_1__1__Impl"
    // InternalAPIMappingLanguage.g:7957:1: rule__ExtendedTypedNamedElementExpression__Group_1_1__1__Impl : ( ( rule__ExtendedTypedNamedElementExpression__IncrementDecrementOperatorAssignment_1_1_1 ) ) ;
    public final void rule__ExtendedTypedNamedElementExpression__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7961:1: ( ( ( rule__ExtendedTypedNamedElementExpression__IncrementDecrementOperatorAssignment_1_1_1 ) ) )
            // InternalAPIMappingLanguage.g:7962:1: ( ( rule__ExtendedTypedNamedElementExpression__IncrementDecrementOperatorAssignment_1_1_1 ) )
            {
            // InternalAPIMappingLanguage.g:7962:1: ( ( rule__ExtendedTypedNamedElementExpression__IncrementDecrementOperatorAssignment_1_1_1 ) )
            // InternalAPIMappingLanguage.g:7963:1: ( rule__ExtendedTypedNamedElementExpression__IncrementDecrementOperatorAssignment_1_1_1 )
            {
             before(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getIncrementDecrementOperatorAssignment_1_1_1()); 
            // InternalAPIMappingLanguage.g:7964:1: ( rule__ExtendedTypedNamedElementExpression__IncrementDecrementOperatorAssignment_1_1_1 )
            // InternalAPIMappingLanguage.g:7964:2: rule__ExtendedTypedNamedElementExpression__IncrementDecrementOperatorAssignment_1_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExtendedTypedNamedElementExpression__IncrementDecrementOperatorAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getIncrementDecrementOperatorAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedTypedNamedElementExpression__Group_1_1__1__Impl"


    // $ANTLR start "rule__TypedNamedElementExpression__Group__0"
    // InternalAPIMappingLanguage.g:7978:1: rule__TypedNamedElementExpression__Group__0 : rule__TypedNamedElementExpression__Group__0__Impl rule__TypedNamedElementExpression__Group__1 ;
    public final void rule__TypedNamedElementExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7982:1: ( rule__TypedNamedElementExpression__Group__0__Impl rule__TypedNamedElementExpression__Group__1 )
            // InternalAPIMappingLanguage.g:7983:2: rule__TypedNamedElementExpression__Group__0__Impl rule__TypedNamedElementExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_53);
            rule__TypedNamedElementExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypedNamedElementExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedNamedElementExpression__Group__0"


    // $ANTLR start "rule__TypedNamedElementExpression__Group__0__Impl"
    // InternalAPIMappingLanguage.g:7990:1: rule__TypedNamedElementExpression__Group__0__Impl : ( ( rule__TypedNamedElementExpression__TypedNamedElementAssignment_0 ) ) ;
    public final void rule__TypedNamedElementExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:7994:1: ( ( ( rule__TypedNamedElementExpression__TypedNamedElementAssignment_0 ) ) )
            // InternalAPIMappingLanguage.g:7995:1: ( ( rule__TypedNamedElementExpression__TypedNamedElementAssignment_0 ) )
            {
            // InternalAPIMappingLanguage.g:7995:1: ( ( rule__TypedNamedElementExpression__TypedNamedElementAssignment_0 ) )
            // InternalAPIMappingLanguage.g:7996:1: ( rule__TypedNamedElementExpression__TypedNamedElementAssignment_0 )
            {
             before(grammarAccess.getTypedNamedElementExpressionAccess().getTypedNamedElementAssignment_0()); 
            // InternalAPIMappingLanguage.g:7997:1: ( rule__TypedNamedElementExpression__TypedNamedElementAssignment_0 )
            // InternalAPIMappingLanguage.g:7997:2: rule__TypedNamedElementExpression__TypedNamedElementAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypedNamedElementExpression__TypedNamedElementAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTypedNamedElementExpressionAccess().getTypedNamedElementAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedNamedElementExpression__Group__0__Impl"


    // $ANTLR start "rule__TypedNamedElementExpression__Group__1"
    // InternalAPIMappingLanguage.g:8007:1: rule__TypedNamedElementExpression__Group__1 : rule__TypedNamedElementExpression__Group__1__Impl ;
    public final void rule__TypedNamedElementExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8011:1: ( rule__TypedNamedElementExpression__Group__1__Impl )
            // InternalAPIMappingLanguage.g:8012:2: rule__TypedNamedElementExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypedNamedElementExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedNamedElementExpression__Group__1"


    // $ANTLR start "rule__TypedNamedElementExpression__Group__1__Impl"
    // InternalAPIMappingLanguage.g:8018:1: rule__TypedNamedElementExpression__Group__1__Impl : ( ( rule__TypedNamedElementExpression__ElementAccessorsAssignment_1 )* ) ;
    public final void rule__TypedNamedElementExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8022:1: ( ( ( rule__TypedNamedElementExpression__ElementAccessorsAssignment_1 )* ) )
            // InternalAPIMappingLanguage.g:8023:1: ( ( rule__TypedNamedElementExpression__ElementAccessorsAssignment_1 )* )
            {
            // InternalAPIMappingLanguage.g:8023:1: ( ( rule__TypedNamedElementExpression__ElementAccessorsAssignment_1 )* )
            // InternalAPIMappingLanguage.g:8024:1: ( rule__TypedNamedElementExpression__ElementAccessorsAssignment_1 )*
            {
             before(grammarAccess.getTypedNamedElementExpressionAccess().getElementAccessorsAssignment_1()); 
            // InternalAPIMappingLanguage.g:8025:1: ( rule__TypedNamedElementExpression__ElementAccessorsAssignment_1 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==54||LA46_0==63) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalAPIMappingLanguage.g:8025:2: rule__TypedNamedElementExpression__ElementAccessorsAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_54);
            	    rule__TypedNamedElementExpression__ElementAccessorsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

             after(grammarAccess.getTypedNamedElementExpressionAccess().getElementAccessorsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedNamedElementExpression__Group__1__Impl"


    // $ANTLR start "rule__ArrayIndexExpression__Group__0"
    // InternalAPIMappingLanguage.g:8039:1: rule__ArrayIndexExpression__Group__0 : rule__ArrayIndexExpression__Group__0__Impl rule__ArrayIndexExpression__Group__1 ;
    public final void rule__ArrayIndexExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8043:1: ( rule__ArrayIndexExpression__Group__0__Impl rule__ArrayIndexExpression__Group__1 )
            // InternalAPIMappingLanguage.g:8044:2: rule__ArrayIndexExpression__Group__0__Impl rule__ArrayIndexExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__ArrayIndexExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ArrayIndexExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayIndexExpression__Group__0"


    // $ANTLR start "rule__ArrayIndexExpression__Group__0__Impl"
    // InternalAPIMappingLanguage.g:8051:1: rule__ArrayIndexExpression__Group__0__Impl : ( '[' ) ;
    public final void rule__ArrayIndexExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8055:1: ( ( '[' ) )
            // InternalAPIMappingLanguage.g:8056:1: ( '[' )
            {
            // InternalAPIMappingLanguage.g:8056:1: ( '[' )
            // InternalAPIMappingLanguage.g:8057:1: '['
            {
             before(grammarAccess.getArrayIndexExpressionAccess().getLeftSquareBracketKeyword_0()); 
            match(input,63,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getArrayIndexExpressionAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayIndexExpression__Group__0__Impl"


    // $ANTLR start "rule__ArrayIndexExpression__Group__1"
    // InternalAPIMappingLanguage.g:8070:1: rule__ArrayIndexExpression__Group__1 : rule__ArrayIndexExpression__Group__1__Impl rule__ArrayIndexExpression__Group__2 ;
    public final void rule__ArrayIndexExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8074:1: ( rule__ArrayIndexExpression__Group__1__Impl rule__ArrayIndexExpression__Group__2 )
            // InternalAPIMappingLanguage.g:8075:2: rule__ArrayIndexExpression__Group__1__Impl rule__ArrayIndexExpression__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_55);
            rule__ArrayIndexExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__ArrayIndexExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayIndexExpression__Group__1"


    // $ANTLR start "rule__ArrayIndexExpression__Group__1__Impl"
    // InternalAPIMappingLanguage.g:8082:1: rule__ArrayIndexExpression__Group__1__Impl : ( ( rule__ArrayIndexExpression__IndexAssignment_1 ) ) ;
    public final void rule__ArrayIndexExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8086:1: ( ( ( rule__ArrayIndexExpression__IndexAssignment_1 ) ) )
            // InternalAPIMappingLanguage.g:8087:1: ( ( rule__ArrayIndexExpression__IndexAssignment_1 ) )
            {
            // InternalAPIMappingLanguage.g:8087:1: ( ( rule__ArrayIndexExpression__IndexAssignment_1 ) )
            // InternalAPIMappingLanguage.g:8088:1: ( rule__ArrayIndexExpression__IndexAssignment_1 )
            {
             before(grammarAccess.getArrayIndexExpressionAccess().getIndexAssignment_1()); 
            // InternalAPIMappingLanguage.g:8089:1: ( rule__ArrayIndexExpression__IndexAssignment_1 )
            // InternalAPIMappingLanguage.g:8089:2: rule__ArrayIndexExpression__IndexAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ArrayIndexExpression__IndexAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getArrayIndexExpressionAccess().getIndexAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayIndexExpression__Group__1__Impl"


    // $ANTLR start "rule__ArrayIndexExpression__Group__2"
    // InternalAPIMappingLanguage.g:8099:1: rule__ArrayIndexExpression__Group__2 : rule__ArrayIndexExpression__Group__2__Impl ;
    public final void rule__ArrayIndexExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8103:1: ( rule__ArrayIndexExpression__Group__2__Impl )
            // InternalAPIMappingLanguage.g:8104:2: rule__ArrayIndexExpression__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ArrayIndexExpression__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayIndexExpression__Group__2"


    // $ANTLR start "rule__ArrayIndexExpression__Group__2__Impl"
    // InternalAPIMappingLanguage.g:8110:1: rule__ArrayIndexExpression__Group__2__Impl : ( ']' ) ;
    public final void rule__ArrayIndexExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8114:1: ( ( ']' ) )
            // InternalAPIMappingLanguage.g:8115:1: ( ']' )
            {
            // InternalAPIMappingLanguage.g:8115:1: ( ']' )
            // InternalAPIMappingLanguage.g:8116:1: ']'
            {
             before(grammarAccess.getArrayIndexExpressionAccess().getRightSquareBracketKeyword_2()); 
            match(input,64,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getArrayIndexExpressionAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayIndexExpression__Group__2__Impl"


    // $ANTLR start "rule__AttributeAccessorExpression__Group__0"
    // InternalAPIMappingLanguage.g:8135:1: rule__AttributeAccessorExpression__Group__0 : rule__AttributeAccessorExpression__Group__0__Impl rule__AttributeAccessorExpression__Group__1 ;
    public final void rule__AttributeAccessorExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8139:1: ( rule__AttributeAccessorExpression__Group__0__Impl rule__AttributeAccessorExpression__Group__1 )
            // InternalAPIMappingLanguage.g:8140:2: rule__AttributeAccessorExpression__Group__0__Impl rule__AttributeAccessorExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__AttributeAccessorExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeAccessorExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAccessorExpression__Group__0"


    // $ANTLR start "rule__AttributeAccessorExpression__Group__0__Impl"
    // InternalAPIMappingLanguage.g:8147:1: rule__AttributeAccessorExpression__Group__0__Impl : ( '.' ) ;
    public final void rule__AttributeAccessorExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8151:1: ( ( '.' ) )
            // InternalAPIMappingLanguage.g:8152:1: ( '.' )
            {
            // InternalAPIMappingLanguage.g:8152:1: ( '.' )
            // InternalAPIMappingLanguage.g:8153:1: '.'
            {
             before(grammarAccess.getAttributeAccessorExpressionAccess().getFullStopKeyword_0()); 
            match(input,54,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAttributeAccessorExpressionAccess().getFullStopKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAccessorExpression__Group__0__Impl"


    // $ANTLR start "rule__AttributeAccessorExpression__Group__1"
    // InternalAPIMappingLanguage.g:8166:1: rule__AttributeAccessorExpression__Group__1 : rule__AttributeAccessorExpression__Group__1__Impl ;
    public final void rule__AttributeAccessorExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8170:1: ( rule__AttributeAccessorExpression__Group__1__Impl )
            // InternalAPIMappingLanguage.g:8171:2: rule__AttributeAccessorExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeAccessorExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAccessorExpression__Group__1"


    // $ANTLR start "rule__AttributeAccessorExpression__Group__1__Impl"
    // InternalAPIMappingLanguage.g:8177:1: rule__AttributeAccessorExpression__Group__1__Impl : ( ( rule__AttributeAccessorExpression__AttributeAssignment_1 ) ) ;
    public final void rule__AttributeAccessorExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8181:1: ( ( ( rule__AttributeAccessorExpression__AttributeAssignment_1 ) ) )
            // InternalAPIMappingLanguage.g:8182:1: ( ( rule__AttributeAccessorExpression__AttributeAssignment_1 ) )
            {
            // InternalAPIMappingLanguage.g:8182:1: ( ( rule__AttributeAccessorExpression__AttributeAssignment_1 ) )
            // InternalAPIMappingLanguage.g:8183:1: ( rule__AttributeAccessorExpression__AttributeAssignment_1 )
            {
             before(grammarAccess.getAttributeAccessorExpressionAccess().getAttributeAssignment_1()); 
            // InternalAPIMappingLanguage.g:8184:1: ( rule__AttributeAccessorExpression__AttributeAssignment_1 )
            // InternalAPIMappingLanguage.g:8184:2: rule__AttributeAccessorExpression__AttributeAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeAccessorExpression__AttributeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccessorExpressionAccess().getAttributeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAccessorExpression__Group__1__Impl"


    // $ANTLR start "rule__PositionSelectorExpression__Group__0"
    // InternalAPIMappingLanguage.g:8198:1: rule__PositionSelectorExpression__Group__0 : rule__PositionSelectorExpression__Group__0__Impl rule__PositionSelectorExpression__Group__1 ;
    public final void rule__PositionSelectorExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8202:1: ( rule__PositionSelectorExpression__Group__0__Impl rule__PositionSelectorExpression__Group__1 )
            // InternalAPIMappingLanguage.g:8203:2: rule__PositionSelectorExpression__Group__0__Impl rule__PositionSelectorExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_52);
            rule__PositionSelectorExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__PositionSelectorExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionSelectorExpression__Group__0"


    // $ANTLR start "rule__PositionSelectorExpression__Group__0__Impl"
    // InternalAPIMappingLanguage.g:8210:1: rule__PositionSelectorExpression__Group__0__Impl : ( ( rule__PositionSelectorExpression__KindAssignment_0 ) ) ;
    public final void rule__PositionSelectorExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8214:1: ( ( ( rule__PositionSelectorExpression__KindAssignment_0 ) ) )
            // InternalAPIMappingLanguage.g:8215:1: ( ( rule__PositionSelectorExpression__KindAssignment_0 ) )
            {
            // InternalAPIMappingLanguage.g:8215:1: ( ( rule__PositionSelectorExpression__KindAssignment_0 ) )
            // InternalAPIMappingLanguage.g:8216:1: ( rule__PositionSelectorExpression__KindAssignment_0 )
            {
             before(grammarAccess.getPositionSelectorExpressionAccess().getKindAssignment_0()); 
            // InternalAPIMappingLanguage.g:8217:1: ( rule__PositionSelectorExpression__KindAssignment_0 )
            // InternalAPIMappingLanguage.g:8217:2: rule__PositionSelectorExpression__KindAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PositionSelectorExpression__KindAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPositionSelectorExpressionAccess().getKindAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionSelectorExpression__Group__0__Impl"


    // $ANTLR start "rule__PositionSelectorExpression__Group__1"
    // InternalAPIMappingLanguage.g:8227:1: rule__PositionSelectorExpression__Group__1 : rule__PositionSelectorExpression__Group__1__Impl ;
    public final void rule__PositionSelectorExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8231:1: ( rule__PositionSelectorExpression__Group__1__Impl )
            // InternalAPIMappingLanguage.g:8232:2: rule__PositionSelectorExpression__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PositionSelectorExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionSelectorExpression__Group__1"


    // $ANTLR start "rule__PositionSelectorExpression__Group__1__Impl"
    // InternalAPIMappingLanguage.g:8238:1: rule__PositionSelectorExpression__Group__1__Impl : ( ( rule__PositionSelectorExpression__Group_1__0 )? ) ;
    public final void rule__PositionSelectorExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8242:1: ( ( ( rule__PositionSelectorExpression__Group_1__0 )? ) )
            // InternalAPIMappingLanguage.g:8243:1: ( ( rule__PositionSelectorExpression__Group_1__0 )? )
            {
            // InternalAPIMappingLanguage.g:8243:1: ( ( rule__PositionSelectorExpression__Group_1__0 )? )
            // InternalAPIMappingLanguage.g:8244:1: ( rule__PositionSelectorExpression__Group_1__0 )?
            {
             before(grammarAccess.getPositionSelectorExpressionAccess().getGroup_1()); 
            // InternalAPIMappingLanguage.g:8245:1: ( rule__PositionSelectorExpression__Group_1__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==65) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalAPIMappingLanguage.g:8245:2: rule__PositionSelectorExpression__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__PositionSelectorExpression__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPositionSelectorExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionSelectorExpression__Group__1__Impl"


    // $ANTLR start "rule__PositionSelectorExpression__Group_1__0"
    // InternalAPIMappingLanguage.g:8259:1: rule__PositionSelectorExpression__Group_1__0 : rule__PositionSelectorExpression__Group_1__0__Impl rule__PositionSelectorExpression__Group_1__1 ;
    public final void rule__PositionSelectorExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8263:1: ( rule__PositionSelectorExpression__Group_1__0__Impl rule__PositionSelectorExpression__Group_1__1 )
            // InternalAPIMappingLanguage.g:8264:2: rule__PositionSelectorExpression__Group_1__0__Impl rule__PositionSelectorExpression__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_49);
            rule__PositionSelectorExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__PositionSelectorExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionSelectorExpression__Group_1__0"


    // $ANTLR start "rule__PositionSelectorExpression__Group_1__0__Impl"
    // InternalAPIMappingLanguage.g:8271:1: rule__PositionSelectorExpression__Group_1__0__Impl : ( '->' ) ;
    public final void rule__PositionSelectorExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8275:1: ( ( '->' ) )
            // InternalAPIMappingLanguage.g:8276:1: ( '->' )
            {
            // InternalAPIMappingLanguage.g:8276:1: ( '->' )
            // InternalAPIMappingLanguage.g:8277:1: '->'
            {
             before(grammarAccess.getPositionSelectorExpressionAccess().getHyphenMinusGreaterThanSignKeyword_1_0()); 
            match(input,65,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getPositionSelectorExpressionAccess().getHyphenMinusGreaterThanSignKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionSelectorExpression__Group_1__0__Impl"


    // $ANTLR start "rule__PositionSelectorExpression__Group_1__1"
    // InternalAPIMappingLanguage.g:8290:1: rule__PositionSelectorExpression__Group_1__1 : rule__PositionSelectorExpression__Group_1__1__Impl ;
    public final void rule__PositionSelectorExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8294:1: ( rule__PositionSelectorExpression__Group_1__1__Impl )
            // InternalAPIMappingLanguage.g:8295:2: rule__PositionSelectorExpression__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PositionSelectorExpression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionSelectorExpression__Group_1__1"


    // $ANTLR start "rule__PositionSelectorExpression__Group_1__1__Impl"
    // InternalAPIMappingLanguage.g:8301:1: rule__PositionSelectorExpression__Group_1__1__Impl : ( ( rule__PositionSelectorExpression__SuccessorAssignment_1_1 ) ) ;
    public final void rule__PositionSelectorExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8305:1: ( ( ( rule__PositionSelectorExpression__SuccessorAssignment_1_1 ) ) )
            // InternalAPIMappingLanguage.g:8306:1: ( ( rule__PositionSelectorExpression__SuccessorAssignment_1_1 ) )
            {
            // InternalAPIMappingLanguage.g:8306:1: ( ( rule__PositionSelectorExpression__SuccessorAssignment_1_1 ) )
            // InternalAPIMappingLanguage.g:8307:1: ( rule__PositionSelectorExpression__SuccessorAssignment_1_1 )
            {
             before(grammarAccess.getPositionSelectorExpressionAccess().getSuccessorAssignment_1_1()); 
            // InternalAPIMappingLanguage.g:8308:1: ( rule__PositionSelectorExpression__SuccessorAssignment_1_1 )
            // InternalAPIMappingLanguage.g:8308:2: rule__PositionSelectorExpression__SuccessorAssignment_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PositionSelectorExpression__SuccessorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPositionSelectorExpressionAccess().getSuccessorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionSelectorExpression__Group_1__1__Impl"


    // $ANTLR start "rule__OperationCall__Group__0"
    // InternalAPIMappingLanguage.g:8322:1: rule__OperationCall__Group__0 : rule__OperationCall__Group__0__Impl rule__OperationCall__Group__1 ;
    public final void rule__OperationCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8326:1: ( rule__OperationCall__Group__0__Impl rule__OperationCall__Group__1 )
            // InternalAPIMappingLanguage.g:8327:2: rule__OperationCall__Group__0__Impl rule__OperationCall__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__OperationCall__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__OperationCall__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationCall__Group__0"


    // $ANTLR start "rule__OperationCall__Group__0__Impl"
    // InternalAPIMappingLanguage.g:8334:1: rule__OperationCall__Group__0__Impl : ( ( rule__OperationCall__OperationAssignment_0 ) ) ;
    public final void rule__OperationCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8338:1: ( ( ( rule__OperationCall__OperationAssignment_0 ) ) )
            // InternalAPIMappingLanguage.g:8339:1: ( ( rule__OperationCall__OperationAssignment_0 ) )
            {
            // InternalAPIMappingLanguage.g:8339:1: ( ( rule__OperationCall__OperationAssignment_0 ) )
            // InternalAPIMappingLanguage.g:8340:1: ( rule__OperationCall__OperationAssignment_0 )
            {
             before(grammarAccess.getOperationCallAccess().getOperationAssignment_0()); 
            // InternalAPIMappingLanguage.g:8341:1: ( rule__OperationCall__OperationAssignment_0 )
            // InternalAPIMappingLanguage.g:8341:2: rule__OperationCall__OperationAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OperationCall__OperationAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOperationCallAccess().getOperationAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationCall__Group__0__Impl"


    // $ANTLR start "rule__OperationCall__Group__1"
    // InternalAPIMappingLanguage.g:8351:1: rule__OperationCall__Group__1 : rule__OperationCall__Group__1__Impl rule__OperationCall__Group__2 ;
    public final void rule__OperationCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8355:1: ( rule__OperationCall__Group__1__Impl rule__OperationCall__Group__2 )
            // InternalAPIMappingLanguage.g:8356:2: rule__OperationCall__Group__1__Impl rule__OperationCall__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__OperationCall__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__OperationCall__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationCall__Group__1"


    // $ANTLR start "rule__OperationCall__Group__1__Impl"
    // InternalAPIMappingLanguage.g:8363:1: rule__OperationCall__Group__1__Impl : ( '(' ) ;
    public final void rule__OperationCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8367:1: ( ( '(' ) )
            // InternalAPIMappingLanguage.g:8368:1: ( '(' )
            {
            // InternalAPIMappingLanguage.g:8368:1: ( '(' )
            // InternalAPIMappingLanguage.g:8369:1: '('
            {
             before(grammarAccess.getOperationCallAccess().getLeftParenthesisKeyword_1()); 
            match(input,50,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getOperationCallAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationCall__Group__1__Impl"


    // $ANTLR start "rule__OperationCall__Group__2"
    // InternalAPIMappingLanguage.g:8382:1: rule__OperationCall__Group__2 : rule__OperationCall__Group__2__Impl rule__OperationCall__Group__3 ;
    public final void rule__OperationCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8386:1: ( rule__OperationCall__Group__2__Impl rule__OperationCall__Group__3 )
            // InternalAPIMappingLanguage.g:8387:2: rule__OperationCall__Group__2__Impl rule__OperationCall__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__OperationCall__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__OperationCall__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationCall__Group__2"


    // $ANTLR start "rule__OperationCall__Group__2__Impl"
    // InternalAPIMappingLanguage.g:8394:1: rule__OperationCall__Group__2__Impl : ( ( rule__OperationCall__Group_2__0 )? ) ;
    public final void rule__OperationCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8398:1: ( ( ( rule__OperationCall__Group_2__0 )? ) )
            // InternalAPIMappingLanguage.g:8399:1: ( ( rule__OperationCall__Group_2__0 )? )
            {
            // InternalAPIMappingLanguage.g:8399:1: ( ( rule__OperationCall__Group_2__0 )? )
            // InternalAPIMappingLanguage.g:8400:1: ( rule__OperationCall__Group_2__0 )?
            {
             before(grammarAccess.getOperationCallAccess().getGroup_2()); 
            // InternalAPIMappingLanguage.g:8401:1: ( rule__OperationCall__Group_2__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalAPIMappingLanguage.g:8401:2: rule__OperationCall__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__OperationCall__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOperationCallAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationCall__Group__2__Impl"


    // $ANTLR start "rule__OperationCall__Group__3"
    // InternalAPIMappingLanguage.g:8411:1: rule__OperationCall__Group__3 : rule__OperationCall__Group__3__Impl ;
    public final void rule__OperationCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8415:1: ( rule__OperationCall__Group__3__Impl )
            // InternalAPIMappingLanguage.g:8416:2: rule__OperationCall__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OperationCall__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationCall__Group__3"


    // $ANTLR start "rule__OperationCall__Group__3__Impl"
    // InternalAPIMappingLanguage.g:8422:1: rule__OperationCall__Group__3__Impl : ( ')' ) ;
    public final void rule__OperationCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8426:1: ( ( ')' ) )
            // InternalAPIMappingLanguage.g:8427:1: ( ')' )
            {
            // InternalAPIMappingLanguage.g:8427:1: ( ')' )
            // InternalAPIMappingLanguage.g:8428:1: ')'
            {
             before(grammarAccess.getOperationCallAccess().getRightParenthesisKeyword_3()); 
            match(input,51,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getOperationCallAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationCall__Group__3__Impl"


    // $ANTLR start "rule__OperationCall__Group_2__0"
    // InternalAPIMappingLanguage.g:8449:1: rule__OperationCall__Group_2__0 : rule__OperationCall__Group_2__0__Impl rule__OperationCall__Group_2__1 ;
    public final void rule__OperationCall__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8453:1: ( rule__OperationCall__Group_2__0__Impl rule__OperationCall__Group_2__1 )
            // InternalAPIMappingLanguage.g:8454:2: rule__OperationCall__Group_2__0__Impl rule__OperationCall__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__OperationCall__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__OperationCall__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationCall__Group_2__0"


    // $ANTLR start "rule__OperationCall__Group_2__0__Impl"
    // InternalAPIMappingLanguage.g:8461:1: rule__OperationCall__Group_2__0__Impl : ( ( rule__OperationCall__ParameterBindingAssignment_2_0 ) ) ;
    public final void rule__OperationCall__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8465:1: ( ( ( rule__OperationCall__ParameterBindingAssignment_2_0 ) ) )
            // InternalAPIMappingLanguage.g:8466:1: ( ( rule__OperationCall__ParameterBindingAssignment_2_0 ) )
            {
            // InternalAPIMappingLanguage.g:8466:1: ( ( rule__OperationCall__ParameterBindingAssignment_2_0 ) )
            // InternalAPIMappingLanguage.g:8467:1: ( rule__OperationCall__ParameterBindingAssignment_2_0 )
            {
             before(grammarAccess.getOperationCallAccess().getParameterBindingAssignment_2_0()); 
            // InternalAPIMappingLanguage.g:8468:1: ( rule__OperationCall__ParameterBindingAssignment_2_0 )
            // InternalAPIMappingLanguage.g:8468:2: rule__OperationCall__ParameterBindingAssignment_2_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OperationCall__ParameterBindingAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getOperationCallAccess().getParameterBindingAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationCall__Group_2__0__Impl"


    // $ANTLR start "rule__OperationCall__Group_2__1"
    // InternalAPIMappingLanguage.g:8478:1: rule__OperationCall__Group_2__1 : rule__OperationCall__Group_2__1__Impl ;
    public final void rule__OperationCall__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8482:1: ( rule__OperationCall__Group_2__1__Impl )
            // InternalAPIMappingLanguage.g:8483:2: rule__OperationCall__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OperationCall__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationCall__Group_2__1"


    // $ANTLR start "rule__OperationCall__Group_2__1__Impl"
    // InternalAPIMappingLanguage.g:8489:1: rule__OperationCall__Group_2__1__Impl : ( ( rule__OperationCall__Group_2_1__0 )* ) ;
    public final void rule__OperationCall__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8493:1: ( ( ( rule__OperationCall__Group_2_1__0 )* ) )
            // InternalAPIMappingLanguage.g:8494:1: ( ( rule__OperationCall__Group_2_1__0 )* )
            {
            // InternalAPIMappingLanguage.g:8494:1: ( ( rule__OperationCall__Group_2_1__0 )* )
            // InternalAPIMappingLanguage.g:8495:1: ( rule__OperationCall__Group_2_1__0 )*
            {
             before(grammarAccess.getOperationCallAccess().getGroup_2_1()); 
            // InternalAPIMappingLanguage.g:8496:1: ( rule__OperationCall__Group_2_1__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==42) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalAPIMappingLanguage.g:8496:2: rule__OperationCall__Group_2_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_10);
            	    rule__OperationCall__Group_2_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

             after(grammarAccess.getOperationCallAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationCall__Group_2__1__Impl"


    // $ANTLR start "rule__OperationCall__Group_2_1__0"
    // InternalAPIMappingLanguage.g:8510:1: rule__OperationCall__Group_2_1__0 : rule__OperationCall__Group_2_1__0__Impl rule__OperationCall__Group_2_1__1 ;
    public final void rule__OperationCall__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8514:1: ( rule__OperationCall__Group_2_1__0__Impl rule__OperationCall__Group_2_1__1 )
            // InternalAPIMappingLanguage.g:8515:2: rule__OperationCall__Group_2_1__0__Impl rule__OperationCall__Group_2_1__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__OperationCall__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__OperationCall__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationCall__Group_2_1__0"


    // $ANTLR start "rule__OperationCall__Group_2_1__0__Impl"
    // InternalAPIMappingLanguage.g:8522:1: rule__OperationCall__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__OperationCall__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8526:1: ( ( ',' ) )
            // InternalAPIMappingLanguage.g:8527:1: ( ',' )
            {
            // InternalAPIMappingLanguage.g:8527:1: ( ',' )
            // InternalAPIMappingLanguage.g:8528:1: ','
            {
             before(grammarAccess.getOperationCallAccess().getCommaKeyword_2_1_0()); 
            match(input,42,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getOperationCallAccess().getCommaKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationCall__Group_2_1__0__Impl"


    // $ANTLR start "rule__OperationCall__Group_2_1__1"
    // InternalAPIMappingLanguage.g:8541:1: rule__OperationCall__Group_2_1__1 : rule__OperationCall__Group_2_1__1__Impl ;
    public final void rule__OperationCall__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8545:1: ( rule__OperationCall__Group_2_1__1__Impl )
            // InternalAPIMappingLanguage.g:8546:2: rule__OperationCall__Group_2_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OperationCall__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationCall__Group_2_1__1"


    // $ANTLR start "rule__OperationCall__Group_2_1__1__Impl"
    // InternalAPIMappingLanguage.g:8552:1: rule__OperationCall__Group_2_1__1__Impl : ( ( rule__OperationCall__ParameterBindingAssignment_2_1_1 ) ) ;
    public final void rule__OperationCall__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8556:1: ( ( ( rule__OperationCall__ParameterBindingAssignment_2_1_1 ) ) )
            // InternalAPIMappingLanguage.g:8557:1: ( ( rule__OperationCall__ParameterBindingAssignment_2_1_1 ) )
            {
            // InternalAPIMappingLanguage.g:8557:1: ( ( rule__OperationCall__ParameterBindingAssignment_2_1_1 ) )
            // InternalAPIMappingLanguage.g:8558:1: ( rule__OperationCall__ParameterBindingAssignment_2_1_1 )
            {
             before(grammarAccess.getOperationCallAccess().getParameterBindingAssignment_2_1_1()); 
            // InternalAPIMappingLanguage.g:8559:1: ( rule__OperationCall__ParameterBindingAssignment_2_1_1 )
            // InternalAPIMappingLanguage.g:8559:2: rule__OperationCall__ParameterBindingAssignment_2_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OperationCall__ParameterBindingAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationCallAccess().getParameterBindingAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationCall__Group_2_1__1__Impl"


    // $ANTLR start "rule__TriggerMessageExpression__Group__0"
    // InternalAPIMappingLanguage.g:8573:1: rule__TriggerMessageExpression__Group__0 : rule__TriggerMessageExpression__Group__0__Impl rule__TriggerMessageExpression__Group__1 ;
    public final void rule__TriggerMessageExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8577:1: ( rule__TriggerMessageExpression__Group__0__Impl rule__TriggerMessageExpression__Group__1 )
            // InternalAPIMappingLanguage.g:8578:2: rule__TriggerMessageExpression__Group__0__Impl rule__TriggerMessageExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_52);
            rule__TriggerMessageExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__TriggerMessageExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerMessageExpression__Group__0"


    // $ANTLR start "rule__TriggerMessageExpression__Group__0__Impl"
    // InternalAPIMappingLanguage.g:8585:1: rule__TriggerMessageExpression__Group__0__Impl : ( ( rule__TriggerMessageExpression__MessageTypeAssignment_0 ) ) ;
    public final void rule__TriggerMessageExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8589:1: ( ( ( rule__TriggerMessageExpression__MessageTypeAssignment_0 ) ) )
            // InternalAPIMappingLanguage.g:8590:1: ( ( rule__TriggerMessageExpression__MessageTypeAssignment_0 ) )
            {
            // InternalAPIMappingLanguage.g:8590:1: ( ( rule__TriggerMessageExpression__MessageTypeAssignment_0 ) )
            // InternalAPIMappingLanguage.g:8591:1: ( rule__TriggerMessageExpression__MessageTypeAssignment_0 )
            {
             before(grammarAccess.getTriggerMessageExpressionAccess().getMessageTypeAssignment_0()); 
            // InternalAPIMappingLanguage.g:8592:1: ( rule__TriggerMessageExpression__MessageTypeAssignment_0 )
            // InternalAPIMappingLanguage.g:8592:2: rule__TriggerMessageExpression__MessageTypeAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TriggerMessageExpression__MessageTypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTriggerMessageExpressionAccess().getMessageTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerMessageExpression__Group__0__Impl"


    // $ANTLR start "rule__TriggerMessageExpression__Group__1"
    // InternalAPIMappingLanguage.g:8602:1: rule__TriggerMessageExpression__Group__1 : rule__TriggerMessageExpression__Group__1__Impl rule__TriggerMessageExpression__Group__2 ;
    public final void rule__TriggerMessageExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8606:1: ( rule__TriggerMessageExpression__Group__1__Impl rule__TriggerMessageExpression__Group__2 )
            // InternalAPIMappingLanguage.g:8607:2: rule__TriggerMessageExpression__Group__1__Impl rule__TriggerMessageExpression__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__TriggerMessageExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__TriggerMessageExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerMessageExpression__Group__1"


    // $ANTLR start "rule__TriggerMessageExpression__Group__1__Impl"
    // InternalAPIMappingLanguage.g:8614:1: rule__TriggerMessageExpression__Group__1__Impl : ( '->' ) ;
    public final void rule__TriggerMessageExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8618:1: ( ( '->' ) )
            // InternalAPIMappingLanguage.g:8619:1: ( '->' )
            {
            // InternalAPIMappingLanguage.g:8619:1: ( '->' )
            // InternalAPIMappingLanguage.g:8620:1: '->'
            {
             before(grammarAccess.getTriggerMessageExpressionAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,65,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getTriggerMessageExpressionAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerMessageExpression__Group__1__Impl"


    // $ANTLR start "rule__TriggerMessageExpression__Group__2"
    // InternalAPIMappingLanguage.g:8633:1: rule__TriggerMessageExpression__Group__2 : rule__TriggerMessageExpression__Group__2__Impl ;
    public final void rule__TriggerMessageExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8637:1: ( rule__TriggerMessageExpression__Group__2__Impl )
            // InternalAPIMappingLanguage.g:8638:2: rule__TriggerMessageExpression__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TriggerMessageExpression__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerMessageExpression__Group__2"


    // $ANTLR start "rule__TriggerMessageExpression__Group__2__Impl"
    // InternalAPIMappingLanguage.g:8644:1: rule__TriggerMessageExpression__Group__2__Impl : ( ( rule__TriggerMessageExpression__ParameterAssignment_2 ) ) ;
    public final void rule__TriggerMessageExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8648:1: ( ( ( rule__TriggerMessageExpression__ParameterAssignment_2 ) ) )
            // InternalAPIMappingLanguage.g:8649:1: ( ( rule__TriggerMessageExpression__ParameterAssignment_2 ) )
            {
            // InternalAPIMappingLanguage.g:8649:1: ( ( rule__TriggerMessageExpression__ParameterAssignment_2 ) )
            // InternalAPIMappingLanguage.g:8650:1: ( rule__TriggerMessageExpression__ParameterAssignment_2 )
            {
             before(grammarAccess.getTriggerMessageExpressionAccess().getParameterAssignment_2()); 
            // InternalAPIMappingLanguage.g:8651:1: ( rule__TriggerMessageExpression__ParameterAssignment_2 )
            // InternalAPIMappingLanguage.g:8651:2: rule__TriggerMessageExpression__ParameterAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TriggerMessageExpression__ParameterAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTriggerMessageExpressionAccess().getParameterAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerMessageExpression__Group__2__Impl"


    // $ANTLR start "rule__DATATYPE__Group__0"
    // InternalAPIMappingLanguage.g:8667:1: rule__DATATYPE__Group__0 : rule__DATATYPE__Group__0__Impl rule__DATATYPE__Group__1 ;
    public final void rule__DATATYPE__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8671:1: ( rule__DATATYPE__Group__0__Impl rule__DATATYPE__Group__1 )
            // InternalAPIMappingLanguage.g:8672:2: rule__DATATYPE__Group__0__Impl rule__DATATYPE__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_56);
            rule__DATATYPE__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DATATYPE__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DATATYPE__Group__0"


    // $ANTLR start "rule__DATATYPE__Group__0__Impl"
    // InternalAPIMappingLanguage.g:8679:1: rule__DATATYPE__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__DATATYPE__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8683:1: ( ( RULE_ID ) )
            // InternalAPIMappingLanguage.g:8684:1: ( RULE_ID )
            {
            // InternalAPIMappingLanguage.g:8684:1: ( RULE_ID )
            // InternalAPIMappingLanguage.g:8685:1: RULE_ID
            {
             before(grammarAccess.getDATATYPEAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDATATYPEAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DATATYPE__Group__0__Impl"


    // $ANTLR start "rule__DATATYPE__Group__1"
    // InternalAPIMappingLanguage.g:8696:1: rule__DATATYPE__Group__1 : rule__DATATYPE__Group__1__Impl ;
    public final void rule__DATATYPE__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8700:1: ( rule__DATATYPE__Group__1__Impl )
            // InternalAPIMappingLanguage.g:8701:2: rule__DATATYPE__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DATATYPE__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DATATYPE__Group__1"


    // $ANTLR start "rule__DATATYPE__Group__1__Impl"
    // InternalAPIMappingLanguage.g:8707:1: rule__DATATYPE__Group__1__Impl : ( ( rule__DATATYPE__Group_1__0 )* ) ;
    public final void rule__DATATYPE__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8711:1: ( ( ( rule__DATATYPE__Group_1__0 )* ) )
            // InternalAPIMappingLanguage.g:8712:1: ( ( rule__DATATYPE__Group_1__0 )* )
            {
            // InternalAPIMappingLanguage.g:8712:1: ( ( rule__DATATYPE__Group_1__0 )* )
            // InternalAPIMappingLanguage.g:8713:1: ( rule__DATATYPE__Group_1__0 )*
            {
             before(grammarAccess.getDATATYPEAccess().getGroup_1()); 
            // InternalAPIMappingLanguage.g:8714:1: ( rule__DATATYPE__Group_1__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==63) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalAPIMappingLanguage.g:8714:2: rule__DATATYPE__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_57);
            	    rule__DATATYPE__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

             after(grammarAccess.getDATATYPEAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DATATYPE__Group__1__Impl"


    // $ANTLR start "rule__DATATYPE__Group_1__0"
    // InternalAPIMappingLanguage.g:8728:1: rule__DATATYPE__Group_1__0 : rule__DATATYPE__Group_1__0__Impl rule__DATATYPE__Group_1__1 ;
    public final void rule__DATATYPE__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8732:1: ( rule__DATATYPE__Group_1__0__Impl rule__DATATYPE__Group_1__1 )
            // InternalAPIMappingLanguage.g:8733:2: rule__DATATYPE__Group_1__0__Impl rule__DATATYPE__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_36);
            rule__DATATYPE__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DATATYPE__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DATATYPE__Group_1__0"


    // $ANTLR start "rule__DATATYPE__Group_1__0__Impl"
    // InternalAPIMappingLanguage.g:8740:1: rule__DATATYPE__Group_1__0__Impl : ( '[' ) ;
    public final void rule__DATATYPE__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8744:1: ( ( '[' ) )
            // InternalAPIMappingLanguage.g:8745:1: ( '[' )
            {
            // InternalAPIMappingLanguage.g:8745:1: ( '[' )
            // InternalAPIMappingLanguage.g:8746:1: '['
            {
             before(grammarAccess.getDATATYPEAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,63,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDATATYPEAccess().getLeftSquareBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DATATYPE__Group_1__0__Impl"


    // $ANTLR start "rule__DATATYPE__Group_1__1"
    // InternalAPIMappingLanguage.g:8759:1: rule__DATATYPE__Group_1__1 : rule__DATATYPE__Group_1__1__Impl rule__DATATYPE__Group_1__2 ;
    public final void rule__DATATYPE__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8763:1: ( rule__DATATYPE__Group_1__1__Impl rule__DATATYPE__Group_1__2 )
            // InternalAPIMappingLanguage.g:8764:2: rule__DATATYPE__Group_1__1__Impl rule__DATATYPE__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_55);
            rule__DATATYPE__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_2);
            rule__DATATYPE__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DATATYPE__Group_1__1"


    // $ANTLR start "rule__DATATYPE__Group_1__1__Impl"
    // InternalAPIMappingLanguage.g:8771:1: rule__DATATYPE__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__DATATYPE__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8775:1: ( ( RULE_INT ) )
            // InternalAPIMappingLanguage.g:8776:1: ( RULE_INT )
            {
            // InternalAPIMappingLanguage.g:8776:1: ( RULE_INT )
            // InternalAPIMappingLanguage.g:8777:1: RULE_INT
            {
             before(grammarAccess.getDATATYPEAccess().getINTTerminalRuleCall_1_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDATATYPEAccess().getINTTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DATATYPE__Group_1__1__Impl"


    // $ANTLR start "rule__DATATYPE__Group_1__2"
    // InternalAPIMappingLanguage.g:8788:1: rule__DATATYPE__Group_1__2 : rule__DATATYPE__Group_1__2__Impl ;
    public final void rule__DATATYPE__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8792:1: ( rule__DATATYPE__Group_1__2__Impl )
            // InternalAPIMappingLanguage.g:8793:2: rule__DATATYPE__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DATATYPE__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DATATYPE__Group_1__2"


    // $ANTLR start "rule__DATATYPE__Group_1__2__Impl"
    // InternalAPIMappingLanguage.g:8799:1: rule__DATATYPE__Group_1__2__Impl : ( ']' ) ;
    public final void rule__DATATYPE__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8803:1: ( ( ']' ) )
            // InternalAPIMappingLanguage.g:8804:1: ( ']' )
            {
            // InternalAPIMappingLanguage.g:8804:1: ( ']' )
            // InternalAPIMappingLanguage.g:8805:1: ']'
            {
             before(grammarAccess.getDATATYPEAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,64,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getDATATYPEAccess().getRightSquareBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DATATYPE__Group_1__2__Impl"


    // $ANTLR start "rule__MappingRepository__ImportsAssignment_0"
    // InternalAPIMappingLanguage.g:8825:1: rule__MappingRepository__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__MappingRepository__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8829:1: ( ( ruleImport ) )
            // InternalAPIMappingLanguage.g:8830:1: ( ruleImport )
            {
            // InternalAPIMappingLanguage.g:8830:1: ( ruleImport )
            // InternalAPIMappingLanguage.g:8831:1: ruleImport
            {
             before(grammarAccess.getMappingRepositoryAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getMappingRepositoryAccess().getImportsImportParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRepository__ImportsAssignment_0"


    // $ANTLR start "rule__MappingRepository__NameAssignment_2"
    // InternalAPIMappingLanguage.g:8840:1: rule__MappingRepository__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__MappingRepository__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8844:1: ( ( ruleEString ) )
            // InternalAPIMappingLanguage.g:8845:1: ( ruleEString )
            {
            // InternalAPIMappingLanguage.g:8845:1: ( ruleEString )
            // InternalAPIMappingLanguage.g:8846:1: ruleEString
            {
             before(grammarAccess.getMappingRepositoryAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMappingRepositoryAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRepository__NameAssignment_2"


    // $ANTLR start "rule__MappingRepository__PortApiMappingsAssignment_4_0"
    // InternalAPIMappingLanguage.g:8855:1: rule__MappingRepository__PortApiMappingsAssignment_4_0 : ( rulePortApiMapping ) ;
    public final void rule__MappingRepository__PortApiMappingsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8859:1: ( ( rulePortApiMapping ) )
            // InternalAPIMappingLanguage.g:8860:1: ( rulePortApiMapping )
            {
            // InternalAPIMappingLanguage.g:8860:1: ( rulePortApiMapping )
            // InternalAPIMappingLanguage.g:8861:1: rulePortApiMapping
            {
             before(grammarAccess.getMappingRepositoryAccess().getPortApiMappingsPortApiMappingParserRuleCall_4_0_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            rulePortApiMapping();

            state._fsp--;

             after(grammarAccess.getMappingRepositoryAccess().getPortApiMappingsPortApiMappingParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRepository__PortApiMappingsAssignment_4_0"


    // $ANTLR start "rule__MappingRepository__PortApiMappingsAssignment_4_1_1"
    // InternalAPIMappingLanguage.g:8870:1: rule__MappingRepository__PortApiMappingsAssignment_4_1_1 : ( rulePortApiMapping ) ;
    public final void rule__MappingRepository__PortApiMappingsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8874:1: ( ( rulePortApiMapping ) )
            // InternalAPIMappingLanguage.g:8875:1: ( rulePortApiMapping )
            {
            // InternalAPIMappingLanguage.g:8875:1: ( rulePortApiMapping )
            // InternalAPIMappingLanguage.g:8876:1: rulePortApiMapping
            {
             before(grammarAccess.getMappingRepositoryAccess().getPortApiMappingsPortApiMappingParserRuleCall_4_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            rulePortApiMapping();

            state._fsp--;

             after(grammarAccess.getMappingRepositoryAccess().getPortApiMappingsPortApiMappingParserRuleCall_4_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRepository__PortApiMappingsAssignment_4_1_1"


    // $ANTLR start "rule__MappingRepository__CommentAssignment_6_1"
    // InternalAPIMappingLanguage.g:8885:1: rule__MappingRepository__CommentAssignment_6_1 : ( ruleEString ) ;
    public final void rule__MappingRepository__CommentAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8889:1: ( ( ruleEString ) )
            // InternalAPIMappingLanguage.g:8890:1: ( ruleEString )
            {
            // InternalAPIMappingLanguage.g:8890:1: ( ruleEString )
            // InternalAPIMappingLanguage.g:8891:1: ruleEString
            {
             before(grammarAccess.getMappingRepositoryAccess().getCommentEStringParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMappingRepositoryAccess().getCommentEStringParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MappingRepository__CommentAssignment_6_1"


    // $ANTLR start "rule__Import__ImportURIAssignment_1"
    // InternalAPIMappingLanguage.g:8900:1: rule__Import__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8904:1: ( ( RULE_STRING ) )
            // InternalAPIMappingLanguage.g:8905:1: ( RULE_STRING )
            {
            // InternalAPIMappingLanguage.g:8905:1: ( RULE_STRING )
            // InternalAPIMappingLanguage.g:8906:1: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportURIAssignment_1"


    // $ANTLR start "rule__PortApiMapping__PortAssignment_1"
    // InternalAPIMappingLanguage.g:8915:1: rule__PortApiMapping__PortAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__PortApiMapping__PortAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8919:1: ( ( ( ruleEString ) ) )
            // InternalAPIMappingLanguage.g:8920:1: ( ( ruleEString ) )
            {
            // InternalAPIMappingLanguage.g:8920:1: ( ( ruleEString ) )
            // InternalAPIMappingLanguage.g:8921:1: ( ruleEString )
            {
             before(grammarAccess.getPortApiMappingAccess().getPortContinuousPortInstanceCrossReference_1_0()); 
            // InternalAPIMappingLanguage.g:8922:1: ( ruleEString )
            // InternalAPIMappingLanguage.g:8923:1: ruleEString
            {
             before(grammarAccess.getPortApiMappingAccess().getPortContinuousPortInstanceEStringParserRuleCall_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPortApiMappingAccess().getPortContinuousPortInstanceEStringParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getPortApiMappingAccess().getPortContinuousPortInstanceCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortApiMapping__PortAssignment_1"


    // $ANTLR start "rule__PortApiMapping__ExecCommandAssignment_4"
    // InternalAPIMappingLanguage.g:8934:1: rule__PortApiMapping__ExecCommandAssignment_4 : ( ruleEntry ) ;
    public final void rule__PortApiMapping__ExecCommandAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8938:1: ( ( ruleEntry ) )
            // InternalAPIMappingLanguage.g:8939:1: ( ruleEntry )
            {
            // InternalAPIMappingLanguage.g:8939:1: ( ruleEntry )
            // InternalAPIMappingLanguage.g:8940:1: ruleEntry
            {
             before(grammarAccess.getPortApiMappingAccess().getExecCommandEntryParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEntry();

            state._fsp--;

             after(grammarAccess.getPortApiMappingAccess().getExecCommandEntryParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortApiMapping__ExecCommandAssignment_4"


    // $ANTLR start "rule__PortApiMapping__InitCommandAssignment_5_1"
    // InternalAPIMappingLanguage.g:8949:1: rule__PortApiMapping__InitCommandAssignment_5_1 : ( ruleEntry ) ;
    public final void rule__PortApiMapping__InitCommandAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8953:1: ( ( ruleEntry ) )
            // InternalAPIMappingLanguage.g:8954:1: ( ruleEntry )
            {
            // InternalAPIMappingLanguage.g:8954:1: ( ruleEntry )
            // InternalAPIMappingLanguage.g:8955:1: ruleEntry
            {
             before(grammarAccess.getPortApiMappingAccess().getInitCommandEntryParserRuleCall_5_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEntry();

            state._fsp--;

             after(grammarAccess.getPortApiMappingAccess().getInitCommandEntryParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PortApiMapping__InitCommandAssignment_5_1"


    // $ANTLR start "rule__EnumerationValueExpression__EnumValueAssignment_1"
    // InternalAPIMappingLanguage.g:8964:1: rule__EnumerationValueExpression__EnumValueAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__EnumerationValueExpression__EnumValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8968:1: ( ( ( RULE_ID ) ) )
            // InternalAPIMappingLanguage.g:8969:1: ( ( RULE_ID ) )
            {
            // InternalAPIMappingLanguage.g:8969:1: ( ( RULE_ID ) )
            // InternalAPIMappingLanguage.g:8970:1: ( RULE_ID )
            {
             before(grammarAccess.getEnumerationValueExpressionAccess().getEnumValueEnumerationValueCrossReference_1_0()); 
            // InternalAPIMappingLanguage.g:8971:1: ( RULE_ID )
            // InternalAPIMappingLanguage.g:8972:1: RULE_ID
            {
             before(grammarAccess.getEnumerationValueExpressionAccess().getEnumValueEnumerationValueIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getEnumerationValueExpressionAccess().getEnumValueEnumerationValueIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getEnumerationValueExpressionAccess().getEnumValueEnumerationValueCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationValueExpression__EnumValueAssignment_1"


    // $ANTLR start "rule__APICallExpression__ApiCommandAssignment_1"
    // InternalAPIMappingLanguage.g:8983:1: rule__APICallExpression__ApiCommandAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__APICallExpression__ApiCommandAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:8987:1: ( ( ( RULE_ID ) ) )
            // InternalAPIMappingLanguage.g:8988:1: ( ( RULE_ID ) )
            {
            // InternalAPIMappingLanguage.g:8988:1: ( ( RULE_ID ) )
            // InternalAPIMappingLanguage.g:8989:1: ( RULE_ID )
            {
             before(grammarAccess.getAPICallExpressionAccess().getApiCommandAPICommandCrossReference_1_0()); 
            // InternalAPIMappingLanguage.g:8990:1: ( RULE_ID )
            // InternalAPIMappingLanguage.g:8991:1: RULE_ID
            {
             before(grammarAccess.getAPICallExpressionAccess().getApiCommandAPICommandIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAPICallExpressionAccess().getApiCommandAPICommandIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getAPICallExpressionAccess().getApiCommandAPICommandCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICallExpression__ApiCommandAssignment_1"


    // $ANTLR start "rule__APICallExpression__ParameterBindingsAssignment_3_0"
    // InternalAPIMappingLanguage.g:9002:1: rule__APICallExpression__ParameterBindingsAssignment_3_0 : ( ruleParamaterBinding ) ;
    public final void rule__APICallExpression__ParameterBindingsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9006:1: ( ( ruleParamaterBinding ) )
            // InternalAPIMappingLanguage.g:9007:1: ( ruleParamaterBinding )
            {
            // InternalAPIMappingLanguage.g:9007:1: ( ruleParamaterBinding )
            // InternalAPIMappingLanguage.g:9008:1: ruleParamaterBinding
            {
             before(grammarAccess.getAPICallExpressionAccess().getParameterBindingsParamaterBindingParserRuleCall_3_0_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleParamaterBinding();

            state._fsp--;

             after(grammarAccess.getAPICallExpressionAccess().getParameterBindingsParamaterBindingParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICallExpression__ParameterBindingsAssignment_3_0"


    // $ANTLR start "rule__APICallExpression__ParameterBindingsAssignment_3_1_1"
    // InternalAPIMappingLanguage.g:9017:1: rule__APICallExpression__ParameterBindingsAssignment_3_1_1 : ( ruleParamaterBinding ) ;
    public final void rule__APICallExpression__ParameterBindingsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9021:1: ( ( ruleParamaterBinding ) )
            // InternalAPIMappingLanguage.g:9022:1: ( ruleParamaterBinding )
            {
            // InternalAPIMappingLanguage.g:9022:1: ( ruleParamaterBinding )
            // InternalAPIMappingLanguage.g:9023:1: ruleParamaterBinding
            {
             before(grammarAccess.getAPICallExpressionAccess().getParameterBindingsParamaterBindingParserRuleCall_3_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleParamaterBinding();

            state._fsp--;

             after(grammarAccess.getAPICallExpressionAccess().getParameterBindingsParamaterBindingParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__APICallExpression__ParameterBindingsAssignment_3_1_1"


    // $ANTLR start "rule__ParamaterBinding__ParameterAssignment_1"
    // InternalAPIMappingLanguage.g:9032:1: rule__ParamaterBinding__ParameterAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ParamaterBinding__ParameterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9036:1: ( ( ( RULE_ID ) ) )
            // InternalAPIMappingLanguage.g:9037:1: ( ( RULE_ID ) )
            {
            // InternalAPIMappingLanguage.g:9037:1: ( ( RULE_ID ) )
            // InternalAPIMappingLanguage.g:9038:1: ( RULE_ID )
            {
             before(grammarAccess.getParamaterBindingAccess().getParameterParameterCrossReference_1_0()); 
            // InternalAPIMappingLanguage.g:9039:1: ( RULE_ID )
            // InternalAPIMappingLanguage.g:9040:1: RULE_ID
            {
             before(grammarAccess.getParamaterBindingAccess().getParameterParameterIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getParamaterBindingAccess().getParameterParameterIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getParamaterBindingAccess().getParameterParameterCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamaterBinding__ParameterAssignment_1"


    // $ANTLR start "rule__ParamaterBinding__ValueAssignment_3"
    // InternalAPIMappingLanguage.g:9051:1: rule__ParamaterBinding__ValueAssignment_3 : ( ( rule__ParamaterBinding__ValueAlternatives_3_0 ) ) ;
    public final void rule__ParamaterBinding__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9055:1: ( ( ( rule__ParamaterBinding__ValueAlternatives_3_0 ) ) )
            // InternalAPIMappingLanguage.g:9056:1: ( ( rule__ParamaterBinding__ValueAlternatives_3_0 ) )
            {
            // InternalAPIMappingLanguage.g:9056:1: ( ( rule__ParamaterBinding__ValueAlternatives_3_0 ) )
            // InternalAPIMappingLanguage.g:9057:1: ( rule__ParamaterBinding__ValueAlternatives_3_0 )
            {
             before(grammarAccess.getParamaterBindingAccess().getValueAlternatives_3_0()); 
            // InternalAPIMappingLanguage.g:9058:1: ( rule__ParamaterBinding__ValueAlternatives_3_0 )
            // InternalAPIMappingLanguage.g:9058:2: rule__ParamaterBinding__ValueAlternatives_3_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParamaterBinding__ValueAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getParamaterBindingAccess().getValueAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamaterBinding__ValueAssignment_3"


    // $ANTLR start "rule__ContiniousPortExpressions__ContinuousPortAssignment_1"
    // InternalAPIMappingLanguage.g:9067:1: rule__ContiniousPortExpressions__ContinuousPortAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ContiniousPortExpressions__ContinuousPortAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9071:1: ( ( ( RULE_ID ) ) )
            // InternalAPIMappingLanguage.g:9072:1: ( ( RULE_ID ) )
            {
            // InternalAPIMappingLanguage.g:9072:1: ( ( RULE_ID ) )
            // InternalAPIMappingLanguage.g:9073:1: ( RULE_ID )
            {
             before(grammarAccess.getContiniousPortExpressionsAccess().getContinuousPortContinuousPortInstanceCrossReference_1_0()); 
            // InternalAPIMappingLanguage.g:9074:1: ( RULE_ID )
            // InternalAPIMappingLanguage.g:9075:1: RULE_ID
            {
             before(grammarAccess.getContiniousPortExpressionsAccess().getContinuousPortContinuousPortInstanceIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getContiniousPortExpressionsAccess().getContinuousPortContinuousPortInstanceIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getContiniousPortExpressionsAccess().getContinuousPortContinuousPortInstanceCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContiniousPortExpressions__ContinuousPortAssignment_1"


    // $ANTLR start "rule__Block__ExpressionsAssignment_2"
    // InternalAPIMappingLanguage.g:9086:1: rule__Block__ExpressionsAssignment_2 : ( ruleExpressionStartRule ) ;
    public final void rule__Block__ExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9090:1: ( ( ruleExpressionStartRule ) )
            // InternalAPIMappingLanguage.g:9091:1: ( ruleExpressionStartRule )
            {
            // InternalAPIMappingLanguage.g:9091:1: ( ruleExpressionStartRule )
            // InternalAPIMappingLanguage.g:9092:1: ruleExpressionStartRule
            {
             before(grammarAccess.getBlockAccess().getExpressionsExpressionStartRuleParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExpressionStartRule();

            state._fsp--;

             after(grammarAccess.getBlockAccess().getExpressionsExpressionStartRuleParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Block__ExpressionsAssignment_2"


    // $ANTLR start "rule__ForLoop__InitializeExpressionAssignment_2"
    // InternalAPIMappingLanguage.g:9101:1: rule__ForLoop__InitializeExpressionAssignment_2 : ( ruleAssignment ) ;
    public final void rule__ForLoop__InitializeExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9105:1: ( ( ruleAssignment ) )
            // InternalAPIMappingLanguage.g:9106:1: ( ruleAssignment )
            {
            // InternalAPIMappingLanguage.g:9106:1: ( ruleAssignment )
            // InternalAPIMappingLanguage.g:9107:1: ruleAssignment
            {
             before(grammarAccess.getForLoopAccess().getInitializeExpressionAssignmentParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getForLoopAccess().getInitializeExpressionAssignmentParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__InitializeExpressionAssignment_2"


    // $ANTLR start "rule__ForLoop__LoopTestAssignment_3"
    // InternalAPIMappingLanguage.g:9116:1: rule__ForLoop__LoopTestAssignment_3 : ( ruleExpression ) ;
    public final void rule__ForLoop__LoopTestAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9120:1: ( ( ruleExpression ) )
            // InternalAPIMappingLanguage.g:9121:1: ( ruleExpression )
            {
            // InternalAPIMappingLanguage.g:9121:1: ( ruleExpression )
            // InternalAPIMappingLanguage.g:9122:1: ruleExpression
            {
             before(grammarAccess.getForLoopAccess().getLoopTestExpressionParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getForLoopAccess().getLoopTestExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__LoopTestAssignment_3"


    // $ANTLR start "rule__ForLoop__CountingExpressionAssignment_5"
    // InternalAPIMappingLanguage.g:9131:1: rule__ForLoop__CountingExpressionAssignment_5 : ( ruleForLoopCountingExpression ) ;
    public final void rule__ForLoop__CountingExpressionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9135:1: ( ( ruleForLoopCountingExpression ) )
            // InternalAPIMappingLanguage.g:9136:1: ( ruleForLoopCountingExpression )
            {
            // InternalAPIMappingLanguage.g:9136:1: ( ruleForLoopCountingExpression )
            // InternalAPIMappingLanguage.g:9137:1: ruleForLoopCountingExpression
            {
             before(grammarAccess.getForLoopAccess().getCountingExpressionForLoopCountingExpressionParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleForLoopCountingExpression();

            state._fsp--;

             after(grammarAccess.getForLoopAccess().getCountingExpressionForLoopCountingExpressionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__CountingExpressionAssignment_5"


    // $ANTLR start "rule__ForLoop__BlockAssignment_7"
    // InternalAPIMappingLanguage.g:9146:1: rule__ForLoop__BlockAssignment_7 : ( ruleBlock ) ;
    public final void rule__ForLoop__BlockAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9150:1: ( ( ruleBlock ) )
            // InternalAPIMappingLanguage.g:9151:1: ( ruleBlock )
            {
            // InternalAPIMappingLanguage.g:9151:1: ( ruleBlock )
            // InternalAPIMappingLanguage.g:9152:1: ruleBlock
            {
             before(grammarAccess.getForLoopAccess().getBlockBlockParserRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getForLoopAccess().getBlockBlockParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoop__BlockAssignment_7"


    // $ANTLR start "rule__ForLoopCountingExpression__Lhs_typedNamedElementExpressionAssignment_0"
    // InternalAPIMappingLanguage.g:9161:1: rule__ForLoopCountingExpression__Lhs_typedNamedElementExpressionAssignment_0 : ( ruleTypedNamedElementExpression ) ;
    public final void rule__ForLoopCountingExpression__Lhs_typedNamedElementExpressionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9165:1: ( ( ruleTypedNamedElementExpression ) )
            // InternalAPIMappingLanguage.g:9166:1: ( ruleTypedNamedElementExpression )
            {
            // InternalAPIMappingLanguage.g:9166:1: ( ruleTypedNamedElementExpression )
            // InternalAPIMappingLanguage.g:9167:1: ruleTypedNamedElementExpression
            {
             before(grammarAccess.getForLoopCountingExpressionAccess().getLhs_typedNamedElementExpressionTypedNamedElementExpressionParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTypedNamedElementExpression();

            state._fsp--;

             after(grammarAccess.getForLoopCountingExpressionAccess().getLhs_typedNamedElementExpressionTypedNamedElementExpressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoopCountingExpression__Lhs_typedNamedElementExpressionAssignment_0"


    // $ANTLR start "rule__ForLoopCountingExpression__IncrementDecrementOperatorAssignment_1_0"
    // InternalAPIMappingLanguage.g:9176:1: rule__ForLoopCountingExpression__IncrementDecrementOperatorAssignment_1_0 : ( ruleUnaryPostIncrementDecrementOperator ) ;
    public final void rule__ForLoopCountingExpression__IncrementDecrementOperatorAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9180:1: ( ( ruleUnaryPostIncrementDecrementOperator ) )
            // InternalAPIMappingLanguage.g:9181:1: ( ruleUnaryPostIncrementDecrementOperator )
            {
            // InternalAPIMappingLanguage.g:9181:1: ( ruleUnaryPostIncrementDecrementOperator )
            // InternalAPIMappingLanguage.g:9182:1: ruleUnaryPostIncrementDecrementOperator
            {
             before(grammarAccess.getForLoopCountingExpressionAccess().getIncrementDecrementOperatorUnaryPostIncrementDecrementOperatorEnumRuleCall_1_0_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleUnaryPostIncrementDecrementOperator();

            state._fsp--;

             after(grammarAccess.getForLoopCountingExpressionAccess().getIncrementDecrementOperatorUnaryPostIncrementDecrementOperatorEnumRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoopCountingExpression__IncrementDecrementOperatorAssignment_1_0"


    // $ANTLR start "rule__ForLoopCountingExpression__AssignOperatorAssignment_1_1_0"
    // InternalAPIMappingLanguage.g:9191:1: rule__ForLoopCountingExpression__AssignOperatorAssignment_1_1_0 : ( ruleAssignOperator ) ;
    public final void rule__ForLoopCountingExpression__AssignOperatorAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9195:1: ( ( ruleAssignOperator ) )
            // InternalAPIMappingLanguage.g:9196:1: ( ruleAssignOperator )
            {
            // InternalAPIMappingLanguage.g:9196:1: ( ruleAssignOperator )
            // InternalAPIMappingLanguage.g:9197:1: ruleAssignOperator
            {
             before(grammarAccess.getForLoopCountingExpressionAccess().getAssignOperatorAssignOperatorEnumRuleCall_1_1_0_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAssignOperator();

            state._fsp--;

             after(grammarAccess.getForLoopCountingExpressionAccess().getAssignOperatorAssignOperatorEnumRuleCall_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoopCountingExpression__AssignOperatorAssignment_1_1_0"


    // $ANTLR start "rule__ForLoopCountingExpression__Rhs_assignExpressionAssignment_1_1_1"
    // InternalAPIMappingLanguage.g:9206:1: rule__ForLoopCountingExpression__Rhs_assignExpressionAssignment_1_1_1 : ( ruleExpression ) ;
    public final void rule__ForLoopCountingExpression__Rhs_assignExpressionAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9210:1: ( ( ruleExpression ) )
            // InternalAPIMappingLanguage.g:9211:1: ( ruleExpression )
            {
            // InternalAPIMappingLanguage.g:9211:1: ( ruleExpression )
            // InternalAPIMappingLanguage.g:9212:1: ruleExpression
            {
             before(grammarAccess.getForLoopCountingExpressionAccess().getRhs_assignExpressionExpressionParserRuleCall_1_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getForLoopCountingExpressionAccess().getRhs_assignExpressionExpressionParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForLoopCountingExpression__Rhs_assignExpressionAssignment_1_1_1"


    // $ANTLR start "rule__WhileLoop__LoopTestAssignment_2"
    // InternalAPIMappingLanguage.g:9221:1: rule__WhileLoop__LoopTestAssignment_2 : ( ruleExpression ) ;
    public final void rule__WhileLoop__LoopTestAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9225:1: ( ( ruleExpression ) )
            // InternalAPIMappingLanguage.g:9226:1: ( ruleExpression )
            {
            // InternalAPIMappingLanguage.g:9226:1: ( ruleExpression )
            // InternalAPIMappingLanguage.g:9227:1: ruleExpression
            {
             before(grammarAccess.getWhileLoopAccess().getLoopTestExpressionParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getWhileLoopAccess().getLoopTestExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__LoopTestAssignment_2"


    // $ANTLR start "rule__WhileLoop__BlockAssignment_4"
    // InternalAPIMappingLanguage.g:9236:1: rule__WhileLoop__BlockAssignment_4 : ( ruleBlock ) ;
    public final void rule__WhileLoop__BlockAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9240:1: ( ( ruleBlock ) )
            // InternalAPIMappingLanguage.g:9241:1: ( ruleBlock )
            {
            // InternalAPIMappingLanguage.g:9241:1: ( ruleBlock )
            // InternalAPIMappingLanguage.g:9242:1: ruleBlock
            {
             before(grammarAccess.getWhileLoopAccess().getBlockBlockParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getWhileLoopAccess().getBlockBlockParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhileLoop__BlockAssignment_4"


    // $ANTLR start "rule__DoWhileLoop__BlockAssignment_1"
    // InternalAPIMappingLanguage.g:9251:1: rule__DoWhileLoop__BlockAssignment_1 : ( ruleBlock ) ;
    public final void rule__DoWhileLoop__BlockAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9255:1: ( ( ruleBlock ) )
            // InternalAPIMappingLanguage.g:9256:1: ( ruleBlock )
            {
            // InternalAPIMappingLanguage.g:9256:1: ( ruleBlock )
            // InternalAPIMappingLanguage.g:9257:1: ruleBlock
            {
             before(grammarAccess.getDoWhileLoopAccess().getBlockBlockParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getDoWhileLoopAccess().getBlockBlockParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhileLoop__BlockAssignment_1"


    // $ANTLR start "rule__DoWhileLoop__LoopTestAssignment_4"
    // InternalAPIMappingLanguage.g:9266:1: rule__DoWhileLoop__LoopTestAssignment_4 : ( ruleExpression ) ;
    public final void rule__DoWhileLoop__LoopTestAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9270:1: ( ( ruleExpression ) )
            // InternalAPIMappingLanguage.g:9271:1: ( ruleExpression )
            {
            // InternalAPIMappingLanguage.g:9271:1: ( ruleExpression )
            // InternalAPIMappingLanguage.g:9272:1: ruleExpression
            {
             before(grammarAccess.getDoWhileLoopAccess().getLoopTestExpressionParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getDoWhileLoopAccess().getLoopTestExpressionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DoWhileLoop__LoopTestAssignment_4"


    // $ANTLR start "rule__IfStatement__IfConditionAssignment_2"
    // InternalAPIMappingLanguage.g:9281:1: rule__IfStatement__IfConditionAssignment_2 : ( ruleExpression ) ;
    public final void rule__IfStatement__IfConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9285:1: ( ( ruleExpression ) )
            // InternalAPIMappingLanguage.g:9286:1: ( ruleExpression )
            {
            // InternalAPIMappingLanguage.g:9286:1: ( ruleExpression )
            // InternalAPIMappingLanguage.g:9287:1: ruleExpression
            {
             before(grammarAccess.getIfStatementAccess().getIfConditionExpressionParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getIfStatementAccess().getIfConditionExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__IfConditionAssignment_2"


    // $ANTLR start "rule__IfStatement__IfBlockAssignment_4"
    // InternalAPIMappingLanguage.g:9296:1: rule__IfStatement__IfBlockAssignment_4 : ( ruleBlock ) ;
    public final void rule__IfStatement__IfBlockAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9300:1: ( ( ruleBlock ) )
            // InternalAPIMappingLanguage.g:9301:1: ( ruleBlock )
            {
            // InternalAPIMappingLanguage.g:9301:1: ( ruleBlock )
            // InternalAPIMappingLanguage.g:9302:1: ruleBlock
            {
             before(grammarAccess.getIfStatementAccess().getIfBlockBlockParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getIfStatementAccess().getIfBlockBlockParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__IfBlockAssignment_4"


    // $ANTLR start "rule__IfStatement__ElseIfStatementsAssignment_5"
    // InternalAPIMappingLanguage.g:9311:1: rule__IfStatement__ElseIfStatementsAssignment_5 : ( ruleElseIfStatement ) ;
    public final void rule__IfStatement__ElseIfStatementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9315:1: ( ( ruleElseIfStatement ) )
            // InternalAPIMappingLanguage.g:9316:1: ( ruleElseIfStatement )
            {
            // InternalAPIMappingLanguage.g:9316:1: ( ruleElseIfStatement )
            // InternalAPIMappingLanguage.g:9317:1: ruleElseIfStatement
            {
             before(grammarAccess.getIfStatementAccess().getElseIfStatementsElseIfStatementParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleElseIfStatement();

            state._fsp--;

             after(grammarAccess.getIfStatementAccess().getElseIfStatementsElseIfStatementParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__ElseIfStatementsAssignment_5"


    // $ANTLR start "rule__IfStatement__ElseBlockAssignment_6_1"
    // InternalAPIMappingLanguage.g:9326:1: rule__IfStatement__ElseBlockAssignment_6_1 : ( ruleBlock ) ;
    public final void rule__IfStatement__ElseBlockAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9330:1: ( ( ruleBlock ) )
            // InternalAPIMappingLanguage.g:9331:1: ( ruleBlock )
            {
            // InternalAPIMappingLanguage.g:9331:1: ( ruleBlock )
            // InternalAPIMappingLanguage.g:9332:1: ruleBlock
            {
             before(grammarAccess.getIfStatementAccess().getElseBlockBlockParserRuleCall_6_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getIfStatementAccess().getElseBlockBlockParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IfStatement__ElseBlockAssignment_6_1"


    // $ANTLR start "rule__ElseIfStatement__ElseIfConditionAssignment_2"
    // InternalAPIMappingLanguage.g:9341:1: rule__ElseIfStatement__ElseIfConditionAssignment_2 : ( ruleExpression ) ;
    public final void rule__ElseIfStatement__ElseIfConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9345:1: ( ( ruleExpression ) )
            // InternalAPIMappingLanguage.g:9346:1: ( ruleExpression )
            {
            // InternalAPIMappingLanguage.g:9346:1: ( ruleExpression )
            // InternalAPIMappingLanguage.g:9347:1: ruleExpression
            {
             before(grammarAccess.getElseIfStatementAccess().getElseIfConditionExpressionParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getElseIfStatementAccess().getElseIfConditionExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfStatement__ElseIfConditionAssignment_2"


    // $ANTLR start "rule__ElseIfStatement__ElseIfBlockAssignment_4"
    // InternalAPIMappingLanguage.g:9356:1: rule__ElseIfStatement__ElseIfBlockAssignment_4 : ( ruleBlock ) ;
    public final void rule__ElseIfStatement__ElseIfBlockAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9360:1: ( ( ruleBlock ) )
            // InternalAPIMappingLanguage.g:9361:1: ( ruleBlock )
            {
            // InternalAPIMappingLanguage.g:9361:1: ( ruleBlock )
            // InternalAPIMappingLanguage.g:9362:1: ruleBlock
            {
             before(grammarAccess.getElseIfStatementAccess().getElseIfBlockBlockParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleBlock();

            state._fsp--;

             after(grammarAccess.getElseIfStatementAccess().getElseIfBlockBlockParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElseIfStatement__ElseIfBlockAssignment_4"


    // $ANTLR start "rule__ReturnStatement__ExpressionAssignment_2"
    // InternalAPIMappingLanguage.g:9371:1: rule__ReturnStatement__ExpressionAssignment_2 : ( ruleExpression ) ;
    public final void rule__ReturnStatement__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9375:1: ( ( ruleExpression ) )
            // InternalAPIMappingLanguage.g:9376:1: ( ruleExpression )
            {
            // InternalAPIMappingLanguage.g:9376:1: ( ruleExpression )
            // InternalAPIMappingLanguage.g:9377:1: ruleExpression
            {
             before(grammarAccess.getReturnStatementAccess().getExpressionExpressionParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getReturnStatementAccess().getExpressionExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReturnStatement__ExpressionAssignment_2"


    // $ANTLR start "rule__Assignment__Lhs_typedNamedElementExpressionAssignment_0"
    // InternalAPIMappingLanguage.g:9386:1: rule__Assignment__Lhs_typedNamedElementExpressionAssignment_0 : ( ruleTypedNamedElementExpression ) ;
    public final void rule__Assignment__Lhs_typedNamedElementExpressionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9390:1: ( ( ruleTypedNamedElementExpression ) )
            // InternalAPIMappingLanguage.g:9391:1: ( ruleTypedNamedElementExpression )
            {
            // InternalAPIMappingLanguage.g:9391:1: ( ruleTypedNamedElementExpression )
            // InternalAPIMappingLanguage.g:9392:1: ruleTypedNamedElementExpression
            {
             before(grammarAccess.getAssignmentAccess().getLhs_typedNamedElementExpressionTypedNamedElementExpressionParserRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTypedNamedElementExpression();

            state._fsp--;

             after(grammarAccess.getAssignmentAccess().getLhs_typedNamedElementExpressionTypedNamedElementExpressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Lhs_typedNamedElementExpressionAssignment_0"


    // $ANTLR start "rule__Assignment__AssignOperatorAssignment_1_0_0"
    // InternalAPIMappingLanguage.g:9401:1: rule__Assignment__AssignOperatorAssignment_1_0_0 : ( ruleAssignOperator ) ;
    public final void rule__Assignment__AssignOperatorAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9405:1: ( ( ruleAssignOperator ) )
            // InternalAPIMappingLanguage.g:9406:1: ( ruleAssignOperator )
            {
            // InternalAPIMappingLanguage.g:9406:1: ( ruleAssignOperator )
            // InternalAPIMappingLanguage.g:9407:1: ruleAssignOperator
            {
             before(grammarAccess.getAssignmentAccess().getAssignOperatorAssignOperatorEnumRuleCall_1_0_0_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAssignOperator();

            state._fsp--;

             after(grammarAccess.getAssignmentAccess().getAssignOperatorAssignOperatorEnumRuleCall_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__AssignOperatorAssignment_1_0_0"


    // $ANTLR start "rule__Assignment__Rhs_assignExpressionAssignment_1_0_1"
    // InternalAPIMappingLanguage.g:9416:1: rule__Assignment__Rhs_assignExpressionAssignment_1_0_1 : ( ruleInitializeExpression ) ;
    public final void rule__Assignment__Rhs_assignExpressionAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9420:1: ( ( ruleInitializeExpression ) )
            // InternalAPIMappingLanguage.g:9421:1: ( ruleInitializeExpression )
            {
            // InternalAPIMappingLanguage.g:9421:1: ( ruleInitializeExpression )
            // InternalAPIMappingLanguage.g:9422:1: ruleInitializeExpression
            {
             before(grammarAccess.getAssignmentAccess().getRhs_assignExpressionInitializeExpressionParserRuleCall_1_0_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleInitializeExpression();

            state._fsp--;

             after(grammarAccess.getAssignmentAccess().getRhs_assignExpressionInitializeExpressionParserRuleCall_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Rhs_assignExpressionAssignment_1_0_1"


    // $ANTLR start "rule__Assignment__IncrementDecrementOperatorAssignment_1_1"
    // InternalAPIMappingLanguage.g:9431:1: rule__Assignment__IncrementDecrementOperatorAssignment_1_1 : ( ruleUnaryPostIncrementDecrementOperator ) ;
    public final void rule__Assignment__IncrementDecrementOperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9435:1: ( ( ruleUnaryPostIncrementDecrementOperator ) )
            // InternalAPIMappingLanguage.g:9436:1: ( ruleUnaryPostIncrementDecrementOperator )
            {
            // InternalAPIMappingLanguage.g:9436:1: ( ruleUnaryPostIncrementDecrementOperator )
            // InternalAPIMappingLanguage.g:9437:1: ruleUnaryPostIncrementDecrementOperator
            {
             before(grammarAccess.getAssignmentAccess().getIncrementDecrementOperatorUnaryPostIncrementDecrementOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleUnaryPostIncrementDecrementOperator();

            state._fsp--;

             after(grammarAccess.getAssignmentAccess().getIncrementDecrementOperatorUnaryPostIncrementDecrementOperatorEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__IncrementDecrementOperatorAssignment_1_1"


    // $ANTLR start "rule__ArrayInitializeExpression__ExpressionsAssignment_1"
    // InternalAPIMappingLanguage.g:9446:1: rule__ArrayInitializeExpression__ExpressionsAssignment_1 : ( ruleInitializeExpression ) ;
    public final void rule__ArrayInitializeExpression__ExpressionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9450:1: ( ( ruleInitializeExpression ) )
            // InternalAPIMappingLanguage.g:9451:1: ( ruleInitializeExpression )
            {
            // InternalAPIMappingLanguage.g:9451:1: ( ruleInitializeExpression )
            // InternalAPIMappingLanguage.g:9452:1: ruleInitializeExpression
            {
             before(grammarAccess.getArrayInitializeExpressionAccess().getExpressionsInitializeExpressionParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleInitializeExpression();

            state._fsp--;

             after(grammarAccess.getArrayInitializeExpressionAccess().getExpressionsInitializeExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayInitializeExpression__ExpressionsAssignment_1"


    // $ANTLR start "rule__ArrayInitializeExpression__ExpressionsAssignment_2_1"
    // InternalAPIMappingLanguage.g:9461:1: rule__ArrayInitializeExpression__ExpressionsAssignment_2_1 : ( ruleInitializeExpression ) ;
    public final void rule__ArrayInitializeExpression__ExpressionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9465:1: ( ( ruleInitializeExpression ) )
            // InternalAPIMappingLanguage.g:9466:1: ( ruleInitializeExpression )
            {
            // InternalAPIMappingLanguage.g:9466:1: ( ruleInitializeExpression )
            // InternalAPIMappingLanguage.g:9467:1: ruleInitializeExpression
            {
             before(grammarAccess.getArrayInitializeExpressionAccess().getExpressionsInitializeExpressionParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleInitializeExpression();

            state._fsp--;

             after(grammarAccess.getArrayInitializeExpressionAccess().getExpressionsInitializeExpressionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayInitializeExpression__ExpressionsAssignment_2_1"


    // $ANTLR start "rule__LocalVariableOrConstantDeclarationStatement__VariableAssignment"
    // InternalAPIMappingLanguage.g:9476:1: rule__LocalVariableOrConstantDeclarationStatement__VariableAssignment : ( ( rule__LocalVariableOrConstantDeclarationStatement__VariableAlternatives_0 ) ) ;
    public final void rule__LocalVariableOrConstantDeclarationStatement__VariableAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9480:1: ( ( ( rule__LocalVariableOrConstantDeclarationStatement__VariableAlternatives_0 ) ) )
            // InternalAPIMappingLanguage.g:9481:1: ( ( rule__LocalVariableOrConstantDeclarationStatement__VariableAlternatives_0 ) )
            {
            // InternalAPIMappingLanguage.g:9481:1: ( ( rule__LocalVariableOrConstantDeclarationStatement__VariableAlternatives_0 ) )
            // InternalAPIMappingLanguage.g:9482:1: ( rule__LocalVariableOrConstantDeclarationStatement__VariableAlternatives_0 )
            {
             before(grammarAccess.getLocalVariableOrConstantDeclarationStatementAccess().getVariableAlternatives_0()); 
            // InternalAPIMappingLanguage.g:9483:1: ( rule__LocalVariableOrConstantDeclarationStatement__VariableAlternatives_0 )
            // InternalAPIMappingLanguage.g:9483:2: rule__LocalVariableOrConstantDeclarationStatement__VariableAlternatives_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LocalVariableOrConstantDeclarationStatement__VariableAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getLocalVariableOrConstantDeclarationStatementAccess().getVariableAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVariableOrConstantDeclarationStatement__VariableAssignment"


    // $ANTLR start "rule__LocalVariableDeclaration__DataTypeAssignment_0"
    // InternalAPIMappingLanguage.g:9492:1: rule__LocalVariableDeclaration__DataTypeAssignment_0 : ( ( ruleDATATYPE ) ) ;
    public final void rule__LocalVariableDeclaration__DataTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9496:1: ( ( ( ruleDATATYPE ) ) )
            // InternalAPIMappingLanguage.g:9497:1: ( ( ruleDATATYPE ) )
            {
            // InternalAPIMappingLanguage.g:9497:1: ( ( ruleDATATYPE ) )
            // InternalAPIMappingLanguage.g:9498:1: ( ruleDATATYPE )
            {
             before(grammarAccess.getLocalVariableDeclarationAccess().getDataTypeDataTypeCrossReference_0_0()); 
            // InternalAPIMappingLanguage.g:9499:1: ( ruleDATATYPE )
            // InternalAPIMappingLanguage.g:9500:1: ruleDATATYPE
            {
             before(grammarAccess.getLocalVariableDeclarationAccess().getDataTypeDataTypeDATATYPEParserRuleCall_0_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleDATATYPE();

            state._fsp--;

             after(grammarAccess.getLocalVariableDeclarationAccess().getDataTypeDataTypeDATATYPEParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getLocalVariableDeclarationAccess().getDataTypeDataTypeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVariableDeclaration__DataTypeAssignment_0"


    // $ANTLR start "rule__LocalVariableDeclaration__NameAssignment_1"
    // InternalAPIMappingLanguage.g:9511:1: rule__LocalVariableDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__LocalVariableDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9515:1: ( ( RULE_ID ) )
            // InternalAPIMappingLanguage.g:9516:1: ( RULE_ID )
            {
            // InternalAPIMappingLanguage.g:9516:1: ( RULE_ID )
            // InternalAPIMappingLanguage.g:9517:1: RULE_ID
            {
             before(grammarAccess.getLocalVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getLocalVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVariableDeclaration__NameAssignment_1"


    // $ANTLR start "rule__LocalVariableDeclaration__InitializeExpressionAssignment_2_1"
    // InternalAPIMappingLanguage.g:9526:1: rule__LocalVariableDeclaration__InitializeExpressionAssignment_2_1 : ( ruleInitializeExpression ) ;
    public final void rule__LocalVariableDeclaration__InitializeExpressionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9530:1: ( ( ruleInitializeExpression ) )
            // InternalAPIMappingLanguage.g:9531:1: ( ruleInitializeExpression )
            {
            // InternalAPIMappingLanguage.g:9531:1: ( ruleInitializeExpression )
            // InternalAPIMappingLanguage.g:9532:1: ruleInitializeExpression
            {
             before(grammarAccess.getLocalVariableDeclarationAccess().getInitializeExpressionInitializeExpressionParserRuleCall_2_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleInitializeExpression();

            state._fsp--;

             after(grammarAccess.getLocalVariableDeclarationAccess().getInitializeExpressionInitializeExpressionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalVariableDeclaration__InitializeExpressionAssignment_2_1"


    // $ANTLR start "rule__LocalConstantDeclaration__ConstantAssignment_0"
    // InternalAPIMappingLanguage.g:9541:1: rule__LocalConstantDeclaration__ConstantAssignment_0 : ( ( 'const' ) ) ;
    public final void rule__LocalConstantDeclaration__ConstantAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9545:1: ( ( ( 'const' ) ) )
            // InternalAPIMappingLanguage.g:9546:1: ( ( 'const' ) )
            {
            // InternalAPIMappingLanguage.g:9546:1: ( ( 'const' ) )
            // InternalAPIMappingLanguage.g:9547:1: ( 'const' )
            {
             before(grammarAccess.getLocalConstantDeclarationAccess().getConstantConstKeyword_0_0()); 
            // InternalAPIMappingLanguage.g:9548:1: ( 'const' )
            // InternalAPIMappingLanguage.g:9549:1: 'const'
            {
             before(grammarAccess.getLocalConstantDeclarationAccess().getConstantConstKeyword_0_0()); 
            match(input,66,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getLocalConstantDeclarationAccess().getConstantConstKeyword_0_0()); 

            }

             after(grammarAccess.getLocalConstantDeclarationAccess().getConstantConstKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalConstantDeclaration__ConstantAssignment_0"


    // $ANTLR start "rule__LocalConstantDeclaration__DataTypeAssignment_1"
    // InternalAPIMappingLanguage.g:9564:1: rule__LocalConstantDeclaration__DataTypeAssignment_1 : ( ( ruleDATATYPE ) ) ;
    public final void rule__LocalConstantDeclaration__DataTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9568:1: ( ( ( ruleDATATYPE ) ) )
            // InternalAPIMappingLanguage.g:9569:1: ( ( ruleDATATYPE ) )
            {
            // InternalAPIMappingLanguage.g:9569:1: ( ( ruleDATATYPE ) )
            // InternalAPIMappingLanguage.g:9570:1: ( ruleDATATYPE )
            {
             before(grammarAccess.getLocalConstantDeclarationAccess().getDataTypeDataTypeCrossReference_1_0()); 
            // InternalAPIMappingLanguage.g:9571:1: ( ruleDATATYPE )
            // InternalAPIMappingLanguage.g:9572:1: ruleDATATYPE
            {
             before(grammarAccess.getLocalConstantDeclarationAccess().getDataTypeDataTypeDATATYPEParserRuleCall_1_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleDATATYPE();

            state._fsp--;

             after(grammarAccess.getLocalConstantDeclarationAccess().getDataTypeDataTypeDATATYPEParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getLocalConstantDeclarationAccess().getDataTypeDataTypeCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalConstantDeclaration__DataTypeAssignment_1"


    // $ANTLR start "rule__LocalConstantDeclaration__NameAssignment_2"
    // InternalAPIMappingLanguage.g:9583:1: rule__LocalConstantDeclaration__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__LocalConstantDeclaration__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9587:1: ( ( RULE_ID ) )
            // InternalAPIMappingLanguage.g:9588:1: ( RULE_ID )
            {
            // InternalAPIMappingLanguage.g:9588:1: ( RULE_ID )
            // InternalAPIMappingLanguage.g:9589:1: RULE_ID
            {
             before(grammarAccess.getLocalConstantDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getLocalConstantDeclarationAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalConstantDeclaration__NameAssignment_2"


    // $ANTLR start "rule__LocalConstantDeclaration__InitializeExpressionAssignment_4"
    // InternalAPIMappingLanguage.g:9598:1: rule__LocalConstantDeclaration__InitializeExpressionAssignment_4 : ( ruleInitializeExpression ) ;
    public final void rule__LocalConstantDeclaration__InitializeExpressionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9602:1: ( ( ruleInitializeExpression ) )
            // InternalAPIMappingLanguage.g:9603:1: ( ruleInitializeExpression )
            {
            // InternalAPIMappingLanguage.g:9603:1: ( ruleInitializeExpression )
            // InternalAPIMappingLanguage.g:9604:1: ruleInitializeExpression
            {
             before(grammarAccess.getLocalConstantDeclarationAccess().getInitializeExpressionInitializeExpressionParserRuleCall_4_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleInitializeExpression();

            state._fsp--;

             after(grammarAccess.getLocalConstantDeclarationAccess().getInitializeExpressionInitializeExpressionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalConstantDeclaration__InitializeExpressionAssignment_4"


    // $ANTLR start "rule__NondeterministicChoiceExpression__DataTypeAssignment_0"
    // InternalAPIMappingLanguage.g:9613:1: rule__NondeterministicChoiceExpression__DataTypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__NondeterministicChoiceExpression__DataTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9617:1: ( ( ( RULE_ID ) ) )
            // InternalAPIMappingLanguage.g:9618:1: ( ( RULE_ID ) )
            {
            // InternalAPIMappingLanguage.g:9618:1: ( ( RULE_ID ) )
            // InternalAPIMappingLanguage.g:9619:1: ( RULE_ID )
            {
             before(grammarAccess.getNondeterministicChoiceExpressionAccess().getDataTypePrimitiveDataTypeCrossReference_0_0()); 
            // InternalAPIMappingLanguage.g:9620:1: ( RULE_ID )
            // InternalAPIMappingLanguage.g:9621:1: RULE_ID
            {
             before(grammarAccess.getNondeterministicChoiceExpressionAccess().getDataTypePrimitiveDataTypeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getNondeterministicChoiceExpressionAccess().getDataTypePrimitiveDataTypeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getNondeterministicChoiceExpressionAccess().getDataTypePrimitiveDataTypeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NondeterministicChoiceExpression__DataTypeAssignment_0"


    // $ANTLR start "rule__NondeterministicChoiceExpression__RangeAssignment_1"
    // InternalAPIMappingLanguage.g:9632:1: rule__NondeterministicChoiceExpression__RangeAssignment_1 : ( ruleRange ) ;
    public final void rule__NondeterministicChoiceExpression__RangeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9636:1: ( ( ruleRange ) )
            // InternalAPIMappingLanguage.g:9637:1: ( ruleRange )
            {
            // InternalAPIMappingLanguage.g:9637:1: ( ruleRange )
            // InternalAPIMappingLanguage.g:9638:1: ruleRange
            {
             before(grammarAccess.getNondeterministicChoiceExpressionAccess().getRangeRangeParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleRange();

            state._fsp--;

             after(grammarAccess.getNondeterministicChoiceExpressionAccess().getRangeRangeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NondeterministicChoiceExpression__RangeAssignment_1"


    // $ANTLR start "rule__Range__LowerBoundAssignment_1"
    // InternalAPIMappingLanguage.g:9647:1: rule__Range__LowerBoundAssignment_1 : ( ruleLONG ) ;
    public final void rule__Range__LowerBoundAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9651:1: ( ( ruleLONG ) )
            // InternalAPIMappingLanguage.g:9652:1: ( ruleLONG )
            {
            // InternalAPIMappingLanguage.g:9652:1: ( ruleLONG )
            // InternalAPIMappingLanguage.g:9653:1: ruleLONG
            {
             before(grammarAccess.getRangeAccess().getLowerBoundLONGParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleLONG();

            state._fsp--;

             after(grammarAccess.getRangeAccess().getLowerBoundLONGParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__LowerBoundAssignment_1"


    // $ANTLR start "rule__Range__UpperBoundAssignment_3"
    // InternalAPIMappingLanguage.g:9662:1: rule__Range__UpperBoundAssignment_3 : ( ruleLONG ) ;
    public final void rule__Range__UpperBoundAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9666:1: ( ( ruleLONG ) )
            // InternalAPIMappingLanguage.g:9667:1: ( ruleLONG )
            {
            // InternalAPIMappingLanguage.g:9667:1: ( ruleLONG )
            // InternalAPIMappingLanguage.g:9668:1: ruleLONG
            {
             before(grammarAccess.getRangeAccess().getUpperBoundLONGParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleLONG();

            state._fsp--;

             after(grammarAccess.getRangeAccess().getUpperBoundLONGParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Range__UpperBoundAssignment_3"


    // $ANTLR start "rule__LogicalOrExpression__OperatorAssignment_1_1"
    // InternalAPIMappingLanguage.g:9677:1: rule__LogicalOrExpression__OperatorAssignment_1_1 : ( ruleLogicalOrOperator ) ;
    public final void rule__LogicalOrExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9681:1: ( ( ruleLogicalOrOperator ) )
            // InternalAPIMappingLanguage.g:9682:1: ( ruleLogicalOrOperator )
            {
            // InternalAPIMappingLanguage.g:9682:1: ( ruleLogicalOrOperator )
            // InternalAPIMappingLanguage.g:9683:1: ruleLogicalOrOperator
            {
             before(grammarAccess.getLogicalOrExpressionAccess().getOperatorLogicalOrOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleLogicalOrOperator();

            state._fsp--;

             after(grammarAccess.getLogicalOrExpressionAccess().getOperatorLogicalOrOperatorEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__LogicalOrExpression__RightExpressionAssignment_1_2"
    // InternalAPIMappingLanguage.g:9692:1: rule__LogicalOrExpression__RightExpressionAssignment_1_2 : ( ruleLogicalAndExpression ) ;
    public final void rule__LogicalOrExpression__RightExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9696:1: ( ( ruleLogicalAndExpression ) )
            // InternalAPIMappingLanguage.g:9697:1: ( ruleLogicalAndExpression )
            {
            // InternalAPIMappingLanguage.g:9697:1: ( ruleLogicalAndExpression )
            // InternalAPIMappingLanguage.g:9698:1: ruleLogicalAndExpression
            {
             before(grammarAccess.getLogicalOrExpressionAccess().getRightExpressionLogicalAndExpressionParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleLogicalAndExpression();

            state._fsp--;

             after(grammarAccess.getLogicalOrExpressionAccess().getRightExpressionLogicalAndExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOrExpression__RightExpressionAssignment_1_2"


    // $ANTLR start "rule__LogicalAndExpression__OperatorAssignment_1_1"
    // InternalAPIMappingLanguage.g:9707:1: rule__LogicalAndExpression__OperatorAssignment_1_1 : ( ruleLogicalAndOperator ) ;
    public final void rule__LogicalAndExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9711:1: ( ( ruleLogicalAndOperator ) )
            // InternalAPIMappingLanguage.g:9712:1: ( ruleLogicalAndOperator )
            {
            // InternalAPIMappingLanguage.g:9712:1: ( ruleLogicalAndOperator )
            // InternalAPIMappingLanguage.g:9713:1: ruleLogicalAndOperator
            {
             before(grammarAccess.getLogicalAndExpressionAccess().getOperatorLogicalAndOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleLogicalAndOperator();

            state._fsp--;

             after(grammarAccess.getLogicalAndExpressionAccess().getOperatorLogicalAndOperatorEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__LogicalAndExpression__RightExpressionAssignment_1_2"
    // InternalAPIMappingLanguage.g:9722:1: rule__LogicalAndExpression__RightExpressionAssignment_1_2 : ( ruleComparisonExpression ) ;
    public final void rule__LogicalAndExpression__RightExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9726:1: ( ( ruleComparisonExpression ) )
            // InternalAPIMappingLanguage.g:9727:1: ( ruleComparisonExpression )
            {
            // InternalAPIMappingLanguage.g:9727:1: ( ruleComparisonExpression )
            // InternalAPIMappingLanguage.g:9728:1: ruleComparisonExpression
            {
             before(grammarAccess.getLogicalAndExpressionAccess().getRightExpressionComparisonExpressionParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleComparisonExpression();

            state._fsp--;

             after(grammarAccess.getLogicalAndExpressionAccess().getRightExpressionComparisonExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalAndExpression__RightExpressionAssignment_1_2"


    // $ANTLR start "rule__ComparisonExpression__OperatorAssignment_1_1"
    // InternalAPIMappingLanguage.g:9737:1: rule__ComparisonExpression__OperatorAssignment_1_1 : ( ruleComparingEQNEQOperator ) ;
    public final void rule__ComparisonExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9741:1: ( ( ruleComparingEQNEQOperator ) )
            // InternalAPIMappingLanguage.g:9742:1: ( ruleComparingEQNEQOperator )
            {
            // InternalAPIMappingLanguage.g:9742:1: ( ruleComparingEQNEQOperator )
            // InternalAPIMappingLanguage.g:9743:1: ruleComparingEQNEQOperator
            {
             before(grammarAccess.getComparisonExpressionAccess().getOperatorComparingEQNEQOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleComparingEQNEQOperator();

            state._fsp--;

             after(grammarAccess.getComparisonExpressionAccess().getOperatorComparingEQNEQOperatorEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__ComparisonExpression__RightExpressionAssignment_1_2"
    // InternalAPIMappingLanguage.g:9752:1: rule__ComparisonExpression__RightExpressionAssignment_1_2 : ( ruleComparisonHigherOpExpression ) ;
    public final void rule__ComparisonExpression__RightExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9756:1: ( ( ruleComparisonHigherOpExpression ) )
            // InternalAPIMappingLanguage.g:9757:1: ( ruleComparisonHigherOpExpression )
            {
            // InternalAPIMappingLanguage.g:9757:1: ( ruleComparisonHigherOpExpression )
            // InternalAPIMappingLanguage.g:9758:1: ruleComparisonHigherOpExpression
            {
             before(grammarAccess.getComparisonExpressionAccess().getRightExpressionComparisonHigherOpExpressionParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleComparisonHigherOpExpression();

            state._fsp--;

             after(grammarAccess.getComparisonExpressionAccess().getRightExpressionComparisonHigherOpExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonExpression__RightExpressionAssignment_1_2"


    // $ANTLR start "rule__ComparisonHigherOpExpression__OperatorAssignment_1_1"
    // InternalAPIMappingLanguage.g:9767:1: rule__ComparisonHigherOpExpression__OperatorAssignment_1_1 : ( ruleComparingRelOperator ) ;
    public final void rule__ComparisonHigherOpExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9771:1: ( ( ruleComparingRelOperator ) )
            // InternalAPIMappingLanguage.g:9772:1: ( ruleComparingRelOperator )
            {
            // InternalAPIMappingLanguage.g:9772:1: ( ruleComparingRelOperator )
            // InternalAPIMappingLanguage.g:9773:1: ruleComparingRelOperator
            {
             before(grammarAccess.getComparisonHigherOpExpressionAccess().getOperatorComparingRelOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleComparingRelOperator();

            state._fsp--;

             after(grammarAccess.getComparisonHigherOpExpressionAccess().getOperatorComparingRelOperatorEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonHigherOpExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__ComparisonHigherOpExpression__RightExpressionAssignment_1_2"
    // InternalAPIMappingLanguage.g:9782:1: rule__ComparisonHigherOpExpression__RightExpressionAssignment_1_2 : ( ruleArithmeticExpression ) ;
    public final void rule__ComparisonHigherOpExpression__RightExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9786:1: ( ( ruleArithmeticExpression ) )
            // InternalAPIMappingLanguage.g:9787:1: ( ruleArithmeticExpression )
            {
            // InternalAPIMappingLanguage.g:9787:1: ( ruleArithmeticExpression )
            // InternalAPIMappingLanguage.g:9788:1: ruleArithmeticExpression
            {
             before(grammarAccess.getComparisonHigherOpExpressionAccess().getRightExpressionArithmeticExpressionParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleArithmeticExpression();

            state._fsp--;

             after(grammarAccess.getComparisonHigherOpExpressionAccess().getRightExpressionArithmeticExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonHigherOpExpression__RightExpressionAssignment_1_2"


    // $ANTLR start "rule__AdditionExpression__OperatorAssignment_1_1"
    // InternalAPIMappingLanguage.g:9797:1: rule__AdditionExpression__OperatorAssignment_1_1 : ( ruleAdditionOperator ) ;
    public final void rule__AdditionExpression__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9801:1: ( ( ruleAdditionOperator ) )
            // InternalAPIMappingLanguage.g:9802:1: ( ruleAdditionOperator )
            {
            // InternalAPIMappingLanguage.g:9802:1: ( ruleAdditionOperator )
            // InternalAPIMappingLanguage.g:9803:1: ruleAdditionOperator
            {
             before(grammarAccess.getAdditionExpressionAccess().getOperatorAdditionOperatorEnumRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAdditionOperator();

            state._fsp--;

             after(grammarAccess.getAdditionExpressionAccess().getOperatorAdditionOperatorEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__OperatorAssignment_1_1"


    // $ANTLR start "rule__AdditionExpression__RightExpressionAssignment_1_2"
    // InternalAPIMappingLanguage.g:9812:1: rule__AdditionExpression__RightExpressionAssignment_1_2 : ( ruleMultiplicationExpression ) ;
    public final void rule__AdditionExpression__RightExpressionAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9816:1: ( ( ruleMultiplicationExpression ) )
            // InternalAPIMappingLanguage.g:9817:1: ( ruleMultiplicationExpression )
            {
            // InternalAPIMappingLanguage.g:9817:1: ( ruleMultiplicationExpression )
            // InternalAPIMappingLanguage.g:9818:1: ruleMultiplicationExpression
            {
             before(grammarAccess.getAdditionExpressionAccess().getRightExpressionMultiplicationExpressionParserRuleCall_1_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMultiplicationExpression();

            state._fsp--;

             after(grammarAccess.getAdditionExpressionAccess().getRightExpressionMultiplicationExpressionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdditionExpression__RightExpressionAssignment_1_2"


    // $ANTLR start "rule__MultiplicationExpression__OperatorAssignment_1_1_1"
    // InternalAPIMappingLanguage.g:9827:1: rule__MultiplicationExpression__OperatorAssignment_1_1_1 : ( ruleMultiplicationOperator ) ;
    public final void rule__MultiplicationExpression__OperatorAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9831:1: ( ( ruleMultiplicationOperator ) )
            // InternalAPIMappingLanguage.g:9832:1: ( ruleMultiplicationOperator )
            {
            // InternalAPIMappingLanguage.g:9832:1: ( ruleMultiplicationOperator )
            // InternalAPIMappingLanguage.g:9833:1: ruleMultiplicationOperator
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getOperatorMultiplicationOperatorEnumRuleCall_1_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMultiplicationOperator();

            state._fsp--;

             after(grammarAccess.getMultiplicationExpressionAccess().getOperatorMultiplicationOperatorEnumRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__OperatorAssignment_1_1_1"


    // $ANTLR start "rule__MultiplicationExpression__RightExpressionAssignment_1_1_2"
    // InternalAPIMappingLanguage.g:9842:1: rule__MultiplicationExpression__RightExpressionAssignment_1_1_2 : ( ( rule__MultiplicationExpression__RightExpressionAlternatives_1_1_2_0 ) ) ;
    public final void rule__MultiplicationExpression__RightExpressionAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9846:1: ( ( ( rule__MultiplicationExpression__RightExpressionAlternatives_1_1_2_0 ) ) )
            // InternalAPIMappingLanguage.g:9847:1: ( ( rule__MultiplicationExpression__RightExpressionAlternatives_1_1_2_0 ) )
            {
            // InternalAPIMappingLanguage.g:9847:1: ( ( rule__MultiplicationExpression__RightExpressionAlternatives_1_1_2_0 ) )
            // InternalAPIMappingLanguage.g:9848:1: ( rule__MultiplicationExpression__RightExpressionAlternatives_1_1_2_0 )
            {
             before(grammarAccess.getMultiplicationExpressionAccess().getRightExpressionAlternatives_1_1_2_0()); 
            // InternalAPIMappingLanguage.g:9849:1: ( rule__MultiplicationExpression__RightExpressionAlternatives_1_1_2_0 )
            // InternalAPIMappingLanguage.g:9849:2: rule__MultiplicationExpression__RightExpressionAlternatives_1_1_2_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MultiplicationExpression__RightExpressionAlternatives_1_1_2_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationExpressionAccess().getRightExpressionAlternatives_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplicationExpression__RightExpressionAssignment_1_1_2"


    // $ANTLR start "rule__UnaryPreExpression__OperatorAssignment_1"
    // InternalAPIMappingLanguage.g:9858:1: rule__UnaryPreExpression__OperatorAssignment_1 : ( ruleUnaryPreOperator ) ;
    public final void rule__UnaryPreExpression__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9862:1: ( ( ruleUnaryPreOperator ) )
            // InternalAPIMappingLanguage.g:9863:1: ( ruleUnaryPreOperator )
            {
            // InternalAPIMappingLanguage.g:9863:1: ( ruleUnaryPreOperator )
            // InternalAPIMappingLanguage.g:9864:1: ruleUnaryPreOperator
            {
             before(grammarAccess.getUnaryPreExpressionAccess().getOperatorUnaryPreOperatorEnumRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleUnaryPreOperator();

            state._fsp--;

             after(grammarAccess.getUnaryPreExpressionAccess().getOperatorUnaryPreOperatorEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryPreExpression__OperatorAssignment_1"


    // $ANTLR start "rule__UnaryPreExpression__EnclosedExpressionAssignment_2"
    // InternalAPIMappingLanguage.g:9873:1: rule__UnaryPreExpression__EnclosedExpressionAssignment_2 : ( ruleTypeCastExpression ) ;
    public final void rule__UnaryPreExpression__EnclosedExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9877:1: ( ( ruleTypeCastExpression ) )
            // InternalAPIMappingLanguage.g:9878:1: ( ruleTypeCastExpression )
            {
            // InternalAPIMappingLanguage.g:9878:1: ( ruleTypeCastExpression )
            // InternalAPIMappingLanguage.g:9879:1: ruleTypeCastExpression
            {
             before(grammarAccess.getUnaryPreExpressionAccess().getEnclosedExpressionTypeCastExpressionParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTypeCastExpression();

            state._fsp--;

             after(grammarAccess.getUnaryPreExpressionAccess().getEnclosedExpressionTypeCastExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryPreExpression__EnclosedExpressionAssignment_2"


    // $ANTLR start "rule__TypeCastExpression__DataTypeAssignment_1_2"
    // InternalAPIMappingLanguage.g:9888:1: rule__TypeCastExpression__DataTypeAssignment_1_2 : ( ( ruleDATATYPE ) ) ;
    public final void rule__TypeCastExpression__DataTypeAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9892:1: ( ( ( ruleDATATYPE ) ) )
            // InternalAPIMappingLanguage.g:9893:1: ( ( ruleDATATYPE ) )
            {
            // InternalAPIMappingLanguage.g:9893:1: ( ( ruleDATATYPE ) )
            // InternalAPIMappingLanguage.g:9894:1: ( ruleDATATYPE )
            {
             before(grammarAccess.getTypeCastExpressionAccess().getDataTypeDataTypeCrossReference_1_2_0()); 
            // InternalAPIMappingLanguage.g:9895:1: ( ruleDATATYPE )
            // InternalAPIMappingLanguage.g:9896:1: ruleDATATYPE
            {
             before(grammarAccess.getTypeCastExpressionAccess().getDataTypeDataTypeDATATYPEParserRuleCall_1_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleDATATYPE();

            state._fsp--;

             after(grammarAccess.getTypeCastExpressionAccess().getDataTypeDataTypeDATATYPEParserRuleCall_1_2_0_1()); 

            }

             after(grammarAccess.getTypeCastExpressionAccess().getDataTypeDataTypeCrossReference_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeCastExpression__DataTypeAssignment_1_2"


    // $ANTLR start "rule__TypeCastExpression__EnclosedExpressionAssignment_1_4"
    // InternalAPIMappingLanguage.g:9907:1: rule__TypeCastExpression__EnclosedExpressionAssignment_1_4 : ( ruleOperand ) ;
    public final void rule__TypeCastExpression__EnclosedExpressionAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9911:1: ( ( ruleOperand ) )
            // InternalAPIMappingLanguage.g:9912:1: ( ruleOperand )
            {
            // InternalAPIMappingLanguage.g:9912:1: ( ruleOperand )
            // InternalAPIMappingLanguage.g:9913:1: ruleOperand
            {
             before(grammarAccess.getTypeCastExpressionAccess().getEnclosedExpressionOperandParserRuleCall_1_4_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleOperand();

            state._fsp--;

             after(grammarAccess.getTypeCastExpressionAccess().getEnclosedExpressionOperandParserRuleCall_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeCastExpression__EnclosedExpressionAssignment_1_4"


    // $ANTLR start "rule__LiteralExpression__ValueAssignment_1"
    // InternalAPIMappingLanguage.g:9922:1: rule__LiteralExpression__ValueAssignment_1 : ( ruleLiteral ) ;
    public final void rule__LiteralExpression__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9926:1: ( ( ruleLiteral ) )
            // InternalAPIMappingLanguage.g:9927:1: ( ruleLiteral )
            {
            // InternalAPIMappingLanguage.g:9927:1: ( ruleLiteral )
            // InternalAPIMappingLanguage.g:9928:1: ruleLiteral
            {
             before(grammarAccess.getLiteralExpressionAccess().getValueLiteralParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralExpressionAccess().getValueLiteralParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LiteralExpression__ValueAssignment_1"


    // $ANTLR start "rule__TimeValueExpression__TimeValueAssignment"
    // InternalAPIMappingLanguage.g:9937:1: rule__TimeValueExpression__TimeValueAssignment : ( ( RULE_MINORMAXKEYWORD ) ) ;
    public final void rule__TimeValueExpression__TimeValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9941:1: ( ( ( RULE_MINORMAXKEYWORD ) ) )
            // InternalAPIMappingLanguage.g:9942:1: ( ( RULE_MINORMAXKEYWORD ) )
            {
            // InternalAPIMappingLanguage.g:9942:1: ( ( RULE_MINORMAXKEYWORD ) )
            // InternalAPIMappingLanguage.g:9943:1: ( RULE_MINORMAXKEYWORD )
            {
             before(grammarAccess.getTimeValueExpressionAccess().getTimeValueTimeValueCrossReference_0()); 
            // InternalAPIMappingLanguage.g:9944:1: ( RULE_MINORMAXKEYWORD )
            // InternalAPIMappingLanguage.g:9945:1: RULE_MINORMAXKEYWORD
            {
             before(grammarAccess.getTimeValueExpressionAccess().getTimeValueTimeValueMINORMAXKEYWORDTerminalRuleCall_0_1()); 
            match(input,RULE_MINORMAXKEYWORD,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getTimeValueExpressionAccess().getTimeValueTimeValueMINORMAXKEYWORDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getTimeValueExpressionAccess().getTimeValueTimeValueCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeValueExpression__TimeValueAssignment"


    // $ANTLR start "rule__ExtendedTypedNamedElementExpression__PositionAssignment_1_0_2"
    // InternalAPIMappingLanguage.g:9956:1: rule__ExtendedTypedNamedElementExpression__PositionAssignment_1_0_2 : ( rulePositionSelectorExpression ) ;
    public final void rule__ExtendedTypedNamedElementExpression__PositionAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9960:1: ( ( rulePositionSelectorExpression ) )
            // InternalAPIMappingLanguage.g:9961:1: ( rulePositionSelectorExpression )
            {
            // InternalAPIMappingLanguage.g:9961:1: ( rulePositionSelectorExpression )
            // InternalAPIMappingLanguage.g:9962:1: rulePositionSelectorExpression
            {
             before(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getPositionPositionSelectorExpressionParserRuleCall_1_0_2_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            rulePositionSelectorExpression();

            state._fsp--;

             after(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getPositionPositionSelectorExpressionParserRuleCall_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedTypedNamedElementExpression__PositionAssignment_1_0_2"


    // $ANTLR start "rule__ExtendedTypedNamedElementExpression__IncrementDecrementOperatorAssignment_1_1_1"
    // InternalAPIMappingLanguage.g:9971:1: rule__ExtendedTypedNamedElementExpression__IncrementDecrementOperatorAssignment_1_1_1 : ( ruleIncrementDecrementOperatorExpression ) ;
    public final void rule__ExtendedTypedNamedElementExpression__IncrementDecrementOperatorAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9975:1: ( ( ruleIncrementDecrementOperatorExpression ) )
            // InternalAPIMappingLanguage.g:9976:1: ( ruleIncrementDecrementOperatorExpression )
            {
            // InternalAPIMappingLanguage.g:9976:1: ( ruleIncrementDecrementOperatorExpression )
            // InternalAPIMappingLanguage.g:9977:1: ruleIncrementDecrementOperatorExpression
            {
             before(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getIncrementDecrementOperatorIncrementDecrementOperatorExpressionEnumRuleCall_1_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleIncrementDecrementOperatorExpression();

            state._fsp--;

             after(grammarAccess.getExtendedTypedNamedElementExpressionAccess().getIncrementDecrementOperatorIncrementDecrementOperatorExpressionEnumRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExtendedTypedNamedElementExpression__IncrementDecrementOperatorAssignment_1_1_1"


    // $ANTLR start "rule__TypedNamedElementExpression__TypedNamedElementAssignment_0"
    // InternalAPIMappingLanguage.g:9986:1: rule__TypedNamedElementExpression__TypedNamedElementAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__TypedNamedElementExpression__TypedNamedElementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:9990:1: ( ( ( RULE_ID ) ) )
            // InternalAPIMappingLanguage.g:9991:1: ( ( RULE_ID ) )
            {
            // InternalAPIMappingLanguage.g:9991:1: ( ( RULE_ID ) )
            // InternalAPIMappingLanguage.g:9992:1: ( RULE_ID )
            {
             before(grammarAccess.getTypedNamedElementExpressionAccess().getTypedNamedElementTypedNamedElementCrossReference_0_0()); 
            // InternalAPIMappingLanguage.g:9993:1: ( RULE_ID )
            // InternalAPIMappingLanguage.g:9994:1: RULE_ID
            {
             before(grammarAccess.getTypedNamedElementExpressionAccess().getTypedNamedElementTypedNamedElementIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getTypedNamedElementExpressionAccess().getTypedNamedElementTypedNamedElementIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getTypedNamedElementExpressionAccess().getTypedNamedElementTypedNamedElementCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedNamedElementExpression__TypedNamedElementAssignment_0"


    // $ANTLR start "rule__TypedNamedElementExpression__ElementAccessorsAssignment_1"
    // InternalAPIMappingLanguage.g:10005:1: rule__TypedNamedElementExpression__ElementAccessorsAssignment_1 : ( ( rule__TypedNamedElementExpression__ElementAccessorsAlternatives_1_0 ) ) ;
    public final void rule__TypedNamedElementExpression__ElementAccessorsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:10009:1: ( ( ( rule__TypedNamedElementExpression__ElementAccessorsAlternatives_1_0 ) ) )
            // InternalAPIMappingLanguage.g:10010:1: ( ( rule__TypedNamedElementExpression__ElementAccessorsAlternatives_1_0 ) )
            {
            // InternalAPIMappingLanguage.g:10010:1: ( ( rule__TypedNamedElementExpression__ElementAccessorsAlternatives_1_0 ) )
            // InternalAPIMappingLanguage.g:10011:1: ( rule__TypedNamedElementExpression__ElementAccessorsAlternatives_1_0 )
            {
             before(grammarAccess.getTypedNamedElementExpressionAccess().getElementAccessorsAlternatives_1_0()); 
            // InternalAPIMappingLanguage.g:10012:1: ( rule__TypedNamedElementExpression__ElementAccessorsAlternatives_1_0 )
            // InternalAPIMappingLanguage.g:10012:2: rule__TypedNamedElementExpression__ElementAccessorsAlternatives_1_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__TypedNamedElementExpression__ElementAccessorsAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getTypedNamedElementExpressionAccess().getElementAccessorsAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypedNamedElementExpression__ElementAccessorsAssignment_1"


    // $ANTLR start "rule__ArrayIndexExpression__IndexAssignment_1"
    // InternalAPIMappingLanguage.g:10021:1: rule__ArrayIndexExpression__IndexAssignment_1 : ( ruleArithmeticExpression ) ;
    public final void rule__ArrayIndexExpression__IndexAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:10025:1: ( ( ruleArithmeticExpression ) )
            // InternalAPIMappingLanguage.g:10026:1: ( ruleArithmeticExpression )
            {
            // InternalAPIMappingLanguage.g:10026:1: ( ruleArithmeticExpression )
            // InternalAPIMappingLanguage.g:10027:1: ruleArithmeticExpression
            {
             before(grammarAccess.getArrayIndexExpressionAccess().getIndexArithmeticExpressionParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleArithmeticExpression();

            state._fsp--;

             after(grammarAccess.getArrayIndexExpressionAccess().getIndexArithmeticExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayIndexExpression__IndexAssignment_1"


    // $ANTLR start "rule__AttributeAccessorExpression__AttributeAssignment_1"
    // InternalAPIMappingLanguage.g:10036:1: rule__AttributeAccessorExpression__AttributeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__AttributeAccessorExpression__AttributeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:10040:1: ( ( ( RULE_ID ) ) )
            // InternalAPIMappingLanguage.g:10041:1: ( ( RULE_ID ) )
            {
            // InternalAPIMappingLanguage.g:10041:1: ( ( RULE_ID ) )
            // InternalAPIMappingLanguage.g:10042:1: ( RULE_ID )
            {
             before(grammarAccess.getAttributeAccessorExpressionAccess().getAttributeAttributeCrossReference_1_0()); 
            // InternalAPIMappingLanguage.g:10043:1: ( RULE_ID )
            // InternalAPIMappingLanguage.g:10044:1: RULE_ID
            {
             before(grammarAccess.getAttributeAccessorExpressionAccess().getAttributeAttributeIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getAttributeAccessorExpressionAccess().getAttributeAttributeIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getAttributeAccessorExpressionAccess().getAttributeAttributeCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeAccessorExpression__AttributeAssignment_1"


    // $ANTLR start "rule__NoAttributeSelectorExpression__PositionAssignment"
    // InternalAPIMappingLanguage.g:10055:1: rule__NoAttributeSelectorExpression__PositionAssignment : ( rulePositionSelectorExpression ) ;
    public final void rule__NoAttributeSelectorExpression__PositionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:10059:1: ( ( rulePositionSelectorExpression ) )
            // InternalAPIMappingLanguage.g:10060:1: ( rulePositionSelectorExpression )
            {
            // InternalAPIMappingLanguage.g:10060:1: ( rulePositionSelectorExpression )
            // InternalAPIMappingLanguage.g:10061:1: rulePositionSelectorExpression
            {
             before(grammarAccess.getNoAttributeSelectorExpressionAccess().getPositionPositionSelectorExpressionParserRuleCall_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            rulePositionSelectorExpression();

            state._fsp--;

             after(grammarAccess.getNoAttributeSelectorExpressionAccess().getPositionPositionSelectorExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NoAttributeSelectorExpression__PositionAssignment"


    // $ANTLR start "rule__PositionSelectorExpression__KindAssignment_0"
    // InternalAPIMappingLanguage.g:10070:1: rule__PositionSelectorExpression__KindAssignment_0 : ( rulePositionSelectorKind ) ;
    public final void rule__PositionSelectorExpression__KindAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:10074:1: ( ( rulePositionSelectorKind ) )
            // InternalAPIMappingLanguage.g:10075:1: ( rulePositionSelectorKind )
            {
            // InternalAPIMappingLanguage.g:10075:1: ( rulePositionSelectorKind )
            // InternalAPIMappingLanguage.g:10076:1: rulePositionSelectorKind
            {
             before(grammarAccess.getPositionSelectorExpressionAccess().getKindPositionSelectorKindEnumRuleCall_0_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            rulePositionSelectorKind();

            state._fsp--;

             after(grammarAccess.getPositionSelectorExpressionAccess().getKindPositionSelectorKindEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionSelectorExpression__KindAssignment_0"


    // $ANTLR start "rule__PositionSelectorExpression__SuccessorAssignment_1_1"
    // InternalAPIMappingLanguage.g:10085:1: rule__PositionSelectorExpression__SuccessorAssignment_1_1 : ( rulePositionSelectorExpression ) ;
    public final void rule__PositionSelectorExpression__SuccessorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:10089:1: ( ( rulePositionSelectorExpression ) )
            // InternalAPIMappingLanguage.g:10090:1: ( rulePositionSelectorExpression )
            {
            // InternalAPIMappingLanguage.g:10090:1: ( rulePositionSelectorExpression )
            // InternalAPIMappingLanguage.g:10091:1: rulePositionSelectorExpression
            {
             before(grammarAccess.getPositionSelectorExpressionAccess().getSuccessorPositionSelectorExpressionParserRuleCall_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            rulePositionSelectorExpression();

            state._fsp--;

             after(grammarAccess.getPositionSelectorExpressionAccess().getSuccessorPositionSelectorExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PositionSelectorExpression__SuccessorAssignment_1_1"


    // $ANTLR start "rule__OperationCall__OperationAssignment_0"
    // InternalAPIMappingLanguage.g:10100:1: rule__OperationCall__OperationAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__OperationCall__OperationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:10104:1: ( ( ( RULE_ID ) ) )
            // InternalAPIMappingLanguage.g:10105:1: ( ( RULE_ID ) )
            {
            // InternalAPIMappingLanguage.g:10105:1: ( ( RULE_ID ) )
            // InternalAPIMappingLanguage.g:10106:1: ( RULE_ID )
            {
             before(grammarAccess.getOperationCallAccess().getOperationOperationCrossReference_0_0()); 
            // InternalAPIMappingLanguage.g:10107:1: ( RULE_ID )
            // InternalAPIMappingLanguage.g:10108:1: RULE_ID
            {
             before(grammarAccess.getOperationCallAccess().getOperationOperationIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getOperationCallAccess().getOperationOperationIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getOperationCallAccess().getOperationOperationCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationCall__OperationAssignment_0"


    // $ANTLR start "rule__OperationCall__ParameterBindingAssignment_2_0"
    // InternalAPIMappingLanguage.g:10119:1: rule__OperationCall__ParameterBindingAssignment_2_0 : ( ruleParamaterBinding ) ;
    public final void rule__OperationCall__ParameterBindingAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:10123:1: ( ( ruleParamaterBinding ) )
            // InternalAPIMappingLanguage.g:10124:1: ( ruleParamaterBinding )
            {
            // InternalAPIMappingLanguage.g:10124:1: ( ruleParamaterBinding )
            // InternalAPIMappingLanguage.g:10125:1: ruleParamaterBinding
            {
             before(grammarAccess.getOperationCallAccess().getParameterBindingParamaterBindingParserRuleCall_2_0_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleParamaterBinding();

            state._fsp--;

             after(grammarAccess.getOperationCallAccess().getParameterBindingParamaterBindingParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationCall__ParameterBindingAssignment_2_0"


    // $ANTLR start "rule__OperationCall__ParameterBindingAssignment_2_1_1"
    // InternalAPIMappingLanguage.g:10134:1: rule__OperationCall__ParameterBindingAssignment_2_1_1 : ( ruleParamaterBinding ) ;
    public final void rule__OperationCall__ParameterBindingAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:10138:1: ( ( ruleParamaterBinding ) )
            // InternalAPIMappingLanguage.g:10139:1: ( ruleParamaterBinding )
            {
            // InternalAPIMappingLanguage.g:10139:1: ( ruleParamaterBinding )
            // InternalAPIMappingLanguage.g:10140:1: ruleParamaterBinding
            {
             before(grammarAccess.getOperationCallAccess().getParameterBindingParamaterBindingParserRuleCall_2_1_1_0()); 
            pushFollow(FollowSets000.FOLLOW_2);
            ruleParamaterBinding();

            state._fsp--;

             after(grammarAccess.getOperationCallAccess().getParameterBindingParamaterBindingParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationCall__ParameterBindingAssignment_2_1_1"


    // $ANTLR start "rule__TriggerMessageExpression__MessageTypeAssignment_0"
    // InternalAPIMappingLanguage.g:10149:1: rule__TriggerMessageExpression__MessageTypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__TriggerMessageExpression__MessageTypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:10153:1: ( ( ( RULE_ID ) ) )
            // InternalAPIMappingLanguage.g:10154:1: ( ( RULE_ID ) )
            {
            // InternalAPIMappingLanguage.g:10154:1: ( ( RULE_ID ) )
            // InternalAPIMappingLanguage.g:10155:1: ( RULE_ID )
            {
             before(grammarAccess.getTriggerMessageExpressionAccess().getMessageTypeMessageTypeCrossReference_0_0()); 
            // InternalAPIMappingLanguage.g:10156:1: ( RULE_ID )
            // InternalAPIMappingLanguage.g:10157:1: RULE_ID
            {
             before(grammarAccess.getTriggerMessageExpressionAccess().getMessageTypeMessageTypeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getTriggerMessageExpressionAccess().getMessageTypeMessageTypeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getTriggerMessageExpressionAccess().getMessageTypeMessageTypeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerMessageExpression__MessageTypeAssignment_0"


    // $ANTLR start "rule__TriggerMessageExpression__ParameterAssignment_2"
    // InternalAPIMappingLanguage.g:10168:1: rule__TriggerMessageExpression__ParameterAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__TriggerMessageExpression__ParameterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAPIMappingLanguage.g:10172:1: ( ( ( RULE_ID ) ) )
            // InternalAPIMappingLanguage.g:10173:1: ( ( RULE_ID ) )
            {
            // InternalAPIMappingLanguage.g:10173:1: ( ( RULE_ID ) )
            // InternalAPIMappingLanguage.g:10174:1: ( RULE_ID )
            {
             before(grammarAccess.getTriggerMessageExpressionAccess().getParameterParameterCrossReference_2_0()); 
            // InternalAPIMappingLanguage.g:10175:1: ( RULE_ID )
            // InternalAPIMappingLanguage.g:10176:1: RULE_ID
            {
             before(grammarAccess.getTriggerMessageExpressionAccess().getParameterParameterIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FollowSets000.FOLLOW_2); 
             after(grammarAccess.getTriggerMessageExpressionAccess().getParameterParameterIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getTriggerMessageExpressionAccess().getParameterParameterCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerMessageExpression__ParameterAssignment_2"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA13 dfa13 = new DFA13(this);
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\2\5\7\uffff\1\4\2\uffff\1\34\1\5";
    static final String dfa_3s = "\1\102\1\77\7\uffff\1\62\2\uffff\1\100\1\77";
    static final String dfa_4s = "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\11\1\uffff\1\1\1\10\2\uffff";
    static final String dfa_5s = "\16\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\53\uffff\1\10\5\uffff\1\2\1\3\1\4\1\uffff\1\5\2\uffff\1\6\3\uffff\1\7",
            "\1\7\13\uffff\5\12\34\uffff\1\13\3\uffff\1\12\10\uffff\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\14\3\12\1\uffff\1\12\6\uffff\1\12\14\uffff\1\12\3\uffff\6\12\13\uffff\1\12",
            "",
            "",
            "\5\12\37\uffff\1\15",
            "\1\7\13\uffff\5\12\40\uffff\1\12\10\uffff\1\11"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1813:1: rule__ExpressionStartRule__Alternatives : ( ( ruleAssignment ) | ( ruleForLoop ) | ( ruleWhileLoop ) | ( ruleDoWhileLoop ) | ( ruleIfStatement ) | ( ruleReturnStatement ) | ( ruleLocalVariableOrConstantDeclarationStatement ) | ( ruleOperationCallStatement ) | ( ( rule__ExpressionStartRule__Group_8__0 ) ) );";
        }
    }
    static final String dfa_7s = "\12\uffff";
    static final String dfa_8s = "\2\uffff\1\3\2\uffff\1\3\2\uffff\1\11\1\uffff";
    static final String dfa_9s = "\1\4\1\uffff\1\16\1\uffff\1\4\1\16\1\4\1\16\1\4\1\uffff";
    static final String dfa_10s = "\1\77\1\uffff\1\101\1\uffff\1\62\1\100\1\77\2\100\1\uffff";
    static final String dfa_11s = "\1\uffff\1\1\1\uffff\1\3\5\uffff\1\2";
    static final String dfa_12s = "\12\uffff}>";
    static final String[] dfa_13s = {
            "\1\3\1\2\2\3\1\uffff\1\3\6\uffff\1\3\14\uffff\1\3\3\uffff\6\3\12\uffff\2\3\14\uffff\1\1",
            "",
            "\2\3\1\uffff\2\3\3\uffff\2\3\1\4\10\3\11\uffff\1\3\7\uffff\1\3\2\uffff\2\3\10\uffff\3\3",
            "",
            "\1\5\3\3\1\uffff\1\3\6\uffff\1\3\14\uffff\1\3\3\uffff\6\3\13\uffff\1\3",
            "\2\3\6\uffff\2\3\4\uffff\5\3\11\uffff\1\6\12\uffff\1\3\12\uffff\1\3",
            "\1\7\3\3\1\uffff\1\3\6\uffff\1\3\14\uffff\1\3\3\uffff\6\3\12\uffff\2\3\14\uffff\1\3",
            "\2\3\6\uffff\5\3\1\10\5\3\11\uffff\1\3\25\uffff\1\3",
            "\4\3\1\uffff\1\3\6\uffff\1\3\14\uffff\1\3\3\uffff\6\3\3\uffff\1\11\7\uffff\1\3\2\uffff\1\11\12\uffff\1\11",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1971:1: rule__InitializeExpression__Alternatives : ( ( ruleArrayInitializeExpression ) | ( ruleNondeterministicChoiceExpression ) | ( ruleExpression ) );";
        }
    }
    static final String dfa_14s = "\11\uffff";
    static final String dfa_15s = "\5\uffff\1\2\3\uffff";
    static final String dfa_16s = "\2\4\1\uffff\1\16\2\4\1\34\1\uffff\1\16";
    static final String dfa_17s = "\2\62\1\uffff\1\101\1\62\2\100\1\uffff\1\101";
    static final String dfa_18s = "\2\uffff\1\1\4\uffff\1\2\1\uffff";
    static final String dfa_19s = "\11\uffff}>";
    static final String[] dfa_20s = {
            "\4\2\1\uffff\1\2\6\uffff\1\2\21\uffff\5\2\13\uffff\1\1",
            "\1\2\1\3\2\2\1\uffff\1\2\6\uffff\1\2\14\uffff\1\2\3\uffff\6\2\12\uffff\2\2",
            "",
            "\2\2\1\uffff\2\2\3\uffff\13\2\21\uffff\1\2\1\5\2\uffff\1\2\10\uffff\1\4\1\uffff\1\2",
            "\1\6\3\2\1\uffff\1\2\6\uffff\1\2\14\uffff\1\2\3\uffff\6\2\13\uffff\1\2",
            "\4\7\1\uffff\1\7\4\uffff\2\2\1\7\5\uffff\13\2\1\uffff\5\7\2\uffff\2\2\4\uffff\1\2\2\uffff\1\7\1\2\1\uffff\1\2\4\uffff\1\2\5\uffff\1\2",
            "\5\2\37\uffff\1\10",
            "",
            "\2\2\1\uffff\2\2\3\uffff\13\2\22\uffff\1\5\2\uffff\1\2\10\uffff\1\4\1\uffff\1\2"
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "2065:1: rule__TypeCastExpression__Alternatives : ( ( ruleOperand ) | ( ( rule__TypeCastExpression__Group_1__0 ) ) );";
        }
    }
    static final String dfa_21s = "\3\uffff\1\6\6\uffff";
    static final String dfa_22s = "\1\4\2\uffff\1\16\3\uffff\1\5\2\uffff";
    static final String dfa_23s = "\1\62\2\uffff\1\101\3\uffff\1\46\2\uffff";
    static final String dfa_24s = "\1\uffff\1\1\1\2\1\uffff\1\4\1\7\1\3\1\uffff\1\5\1\6";
    static final String[] dfa_25s = {
            "\1\2\1\3\2\2\1\uffff\1\4\6\uffff\1\2\21\uffff\5\5\13\uffff\1\1",
            "",
            "",
            "\2\6\1\uffff\2\6\3\uffff\13\6\10\uffff\2\6\4\uffff\1\6\2\uffff\1\10\1\6\1\uffff\2\6\3\uffff\1\6\4\uffff\2\6\1\7",
            "",
            "",
            "",
            "\1\11\34\uffff\5\6",
            "",
            ""
    };
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[][] dfa_25 = unpackEncodedStringArray(dfa_25s);

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_7;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_12;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "2087:1: rule__Operand__Alternatives : ( ( ( rule__Operand__Group_0__0 ) ) | ( ruleLiteralExpression ) | ( ruleExtendedTypedNamedElementExpression ) | ( ruleTimeValueExpression ) | ( ruleOperationCall ) | ( ruleTriggerMessageExpression ) | ( ruleNoAttributeSelectorExpression ) );";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000100000000002L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000220000000000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x8006017E200102F0L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000820000000000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0008000000000020L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0017007E200102F0L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0040000000000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0040000000000002L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x4B82020000000020L,0x0000000000000004L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x4B82000000000022L,0x0000000000000004L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0006007E200102F0L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0008000000000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000000003E0000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0100000000000000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x3000000000000000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x2000000000000002L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x4000000000000000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0020000000080000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x000000000F000000L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000030000000L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000030000002L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x00000001C0000000L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x00000001C0000002L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000220000000L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0004007C000102F0L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x00000000000100D0L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000060000L,0x0000000000000002L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x8040000000000000L});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x8040000000000002L});
        public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x8000000000000000L});
        public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x8000000000000002L});
    }


}
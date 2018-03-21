package de.ubt.ai1.supermod.text.ui.contentassist.antlr.internal; 

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
import de.ubt.ai1.supermod.text.services.LogicalGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalLogicalParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_K_IFF", "RULE_K_IMP", "RULE_K_OR", "RULE_K_XOR", "RULE_K_MINUS", "RULE_K_NAND", "RULE_K_AND", "RULE_P_OPEN", "RULE_P_CLOSE", "RULE_K_BIG_AND", "RULE_COMMA", "RULE_K_BIG_OR", "RULE_K_BIG_XOR", "RULE_K_BIG_NAND", "RULE_K_NOT", "RULE_ID", "RULE_WS", "'unknown'", "'true'", "'false'", "'logical'", "'dimension'", "'{'", "'}'", "'option'", "'invariant'", "'preference'", "'for'", "'default'", "'binding'", "'='"
    };
    public static final int RULE_K_BIG_OR=15;
    public static final int RULE_P_OPEN=11;
    public static final int RULE_K_BIG_NAND=17;
    public static final int RULE_K_MINUS=8;
    public static final int RULE_K_AND=10;
    public static final int RULE_K_XOR=7;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_K_IFF=4;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_K_OR=6;
    public static final int RULE_ID=19;
    public static final int RULE_COMMA=14;
    public static final int RULE_WS=20;
    public static final int RULE_K_BIG_XOR=16;
    public static final int RULE_K_BIG_AND=13;
    public static final int RULE_K_NOT=18;
    public static final int RULE_P_CLOSE=12;
    public static final int RULE_K_NAND=9;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int RULE_K_IMP=5;
    public static final int T__25=25;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalLogicalParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLogicalParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLogicalParser.tokenNames; }
    public String getGrammarFileName() { return "InternalLogical.g"; }


     
     	private LogicalGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(LogicalGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleLogicalDimension"
    // InternalLogical.g:61:1: entryRuleLogicalDimension : ruleLogicalDimension EOF ;
    public final void entryRuleLogicalDimension() throws RecognitionException {
        try {
            // InternalLogical.g:62:1: ( ruleLogicalDimension EOF )
            // InternalLogical.g:63:1: ruleLogicalDimension EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalDimensionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleLogicalDimension();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalDimensionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleLogicalDimension"


    // $ANTLR start "ruleLogicalDimension"
    // InternalLogical.g:70:1: ruleLogicalDimension : ( ( rule__LogicalDimension__Group__0 ) ) ;
    public final void ruleLogicalDimension() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:74:2: ( ( ( rule__LogicalDimension__Group__0 ) ) )
            // InternalLogical.g:75:1: ( ( rule__LogicalDimension__Group__0 ) )
            {
            // InternalLogical.g:75:1: ( ( rule__LogicalDimension__Group__0 ) )
            // InternalLogical.g:76:1: ( rule__LogicalDimension__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalDimensionAccess().getGroup()); 
            }
            // InternalLogical.g:77:1: ( rule__LogicalDimension__Group__0 )
            // InternalLogical.g:77:2: rule__LogicalDimension__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalDimension__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalDimensionAccess().getGroup()); 
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
    // $ANTLR end "ruleLogicalDimension"


    // $ANTLR start "entryRuleOption"
    // InternalLogical.g:89:1: entryRuleOption : ruleOption EOF ;
    public final void entryRuleOption() throws RecognitionException {
        try {
            // InternalLogical.g:90:1: ( ruleOption EOF )
            // InternalLogical.g:91:1: ruleOption EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleOption();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleOption"


    // $ANTLR start "ruleOption"
    // InternalLogical.g:98:1: ruleOption : ( ( rule__Option__Group__0 ) ) ;
    public final void ruleOption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:102:2: ( ( ( rule__Option__Group__0 ) ) )
            // InternalLogical.g:103:1: ( ( rule__Option__Group__0 ) )
            {
            // InternalLogical.g:103:1: ( ( rule__Option__Group__0 ) )
            // InternalLogical.g:104:1: ( rule__Option__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionAccess().getGroup()); 
            }
            // InternalLogical.g:105:1: ( rule__Option__Group__0 )
            // InternalLogical.g:105:2: rule__Option__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Option__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptionAccess().getGroup()); 
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
    // $ANTLR end "ruleOption"


    // $ANTLR start "entryRuleInvariant"
    // InternalLogical.g:117:1: entryRuleInvariant : ruleInvariant EOF ;
    public final void entryRuleInvariant() throws RecognitionException {
        try {
            // InternalLogical.g:118:1: ( ruleInvariant EOF )
            // InternalLogical.g:119:1: ruleInvariant EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInvariantRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleInvariant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInvariantRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleInvariant"


    // $ANTLR start "ruleInvariant"
    // InternalLogical.g:126:1: ruleInvariant : ( ( rule__Invariant__Group__0 ) ) ;
    public final void ruleInvariant() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:130:2: ( ( ( rule__Invariant__Group__0 ) ) )
            // InternalLogical.g:131:1: ( ( rule__Invariant__Group__0 ) )
            {
            // InternalLogical.g:131:1: ( ( rule__Invariant__Group__0 ) )
            // InternalLogical.g:132:1: ( rule__Invariant__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInvariantAccess().getGroup()); 
            }
            // InternalLogical.g:133:1: ( rule__Invariant__Group__0 )
            // InternalLogical.g:133:2: rule__Invariant__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Invariant__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInvariantAccess().getGroup()); 
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
    // $ANTLR end "ruleInvariant"


    // $ANTLR start "entryRulePreference"
    // InternalLogical.g:145:1: entryRulePreference : rulePreference EOF ;
    public final void entryRulePreference() throws RecognitionException {
        try {
            // InternalLogical.g:146:1: ( rulePreference EOF )
            // InternalLogical.g:147:1: rulePreference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            rulePreference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPreferenceRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRulePreference"


    // $ANTLR start "rulePreference"
    // InternalLogical.g:154:1: rulePreference : ( ( rule__Preference__Group__0 ) ) ;
    public final void rulePreference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:158:2: ( ( ( rule__Preference__Group__0 ) ) )
            // InternalLogical.g:159:1: ( ( rule__Preference__Group__0 ) )
            {
            // InternalLogical.g:159:1: ( ( rule__Preference__Group__0 ) )
            // InternalLogical.g:160:1: ( rule__Preference__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreferenceAccess().getGroup()); 
            }
            // InternalLogical.g:161:1: ( rule__Preference__Group__0 )
            // InternalLogical.g:161:2: rule__Preference__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Preference__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPreferenceAccess().getGroup()); 
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
    // $ANTLR end "rulePreference"


    // $ANTLR start "entryRuleDefaultBinding"
    // InternalLogical.g:173:1: entryRuleDefaultBinding : ruleDefaultBinding EOF ;
    public final void entryRuleDefaultBinding() throws RecognitionException {
        try {
            // InternalLogical.g:174:1: ( ruleDefaultBinding EOF )
            // InternalLogical.g:175:1: ruleDefaultBinding EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultBindingRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleDefaultBinding();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefaultBindingRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleDefaultBinding"


    // $ANTLR start "ruleDefaultBinding"
    // InternalLogical.g:182:1: ruleDefaultBinding : ( ( rule__DefaultBinding__Group__0 ) ) ;
    public final void ruleDefaultBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:186:2: ( ( ( rule__DefaultBinding__Group__0 ) ) )
            // InternalLogical.g:187:1: ( ( rule__DefaultBinding__Group__0 ) )
            {
            // InternalLogical.g:187:1: ( ( rule__DefaultBinding__Group__0 ) )
            // InternalLogical.g:188:1: ( rule__DefaultBinding__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultBindingAccess().getGroup()); 
            }
            // InternalLogical.g:189:1: ( rule__DefaultBinding__Group__0 )
            // InternalLogical.g:189:2: rule__DefaultBinding__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DefaultBinding__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefaultBindingAccess().getGroup()); 
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
    // $ANTLR end "ruleDefaultBinding"


    // $ANTLR start "entryRuleOptionExpr"
    // InternalLogical.g:201:1: entryRuleOptionExpr : ruleOptionExpr EOF ;
    public final void entryRuleOptionExpr() throws RecognitionException {
        try {
            // InternalLogical.g:202:1: ( ruleOptionExpr EOF )
            // InternalLogical.g:203:1: ruleOptionExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleOptionExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptionExprRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleOptionExpr"


    // $ANTLR start "ruleOptionExpr"
    // InternalLogical.g:210:1: ruleOptionExpr : ( ( rule__OptionExpr__Alternatives ) ) ;
    public final void ruleOptionExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:214:2: ( ( ( rule__OptionExpr__Alternatives ) ) )
            // InternalLogical.g:215:1: ( ( rule__OptionExpr__Alternatives ) )
            {
            // InternalLogical.g:215:1: ( ( rule__OptionExpr__Alternatives ) )
            // InternalLogical.g:216:1: ( rule__OptionExpr__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionExprAccess().getAlternatives()); 
            }
            // InternalLogical.g:217:1: ( rule__OptionExpr__Alternatives )
            // InternalLogical.g:217:2: rule__OptionExpr__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OptionExpr__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptionExprAccess().getAlternatives()); 
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
    // $ANTLR end "ruleOptionExpr"


    // $ANTLR start "entryRuleBiconditionalExpr"
    // InternalLogical.g:229:1: entryRuleBiconditionalExpr : ruleBiconditionalExpr EOF ;
    public final void entryRuleBiconditionalExpr() throws RecognitionException {
        try {
            // InternalLogical.g:230:1: ( ruleBiconditionalExpr EOF )
            // InternalLogical.g:231:1: ruleBiconditionalExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBiconditionalExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleBiconditionalExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBiconditionalExprRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBiconditionalExpr"


    // $ANTLR start "ruleBiconditionalExpr"
    // InternalLogical.g:238:1: ruleBiconditionalExpr : ( ( rule__BiconditionalExpr__Group__0 ) ) ;
    public final void ruleBiconditionalExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:242:2: ( ( ( rule__BiconditionalExpr__Group__0 ) ) )
            // InternalLogical.g:243:1: ( ( rule__BiconditionalExpr__Group__0 ) )
            {
            // InternalLogical.g:243:1: ( ( rule__BiconditionalExpr__Group__0 ) )
            // InternalLogical.g:244:1: ( rule__BiconditionalExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBiconditionalExprAccess().getGroup()); 
            }
            // InternalLogical.g:245:1: ( rule__BiconditionalExpr__Group__0 )
            // InternalLogical.g:245:2: rule__BiconditionalExpr__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BiconditionalExpr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBiconditionalExprAccess().getGroup()); 
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
    // $ANTLR end "ruleBiconditionalExpr"


    // $ANTLR start "entryRuleImpliesExpr"
    // InternalLogical.g:257:1: entryRuleImpliesExpr : ruleImpliesExpr EOF ;
    public final void entryRuleImpliesExpr() throws RecognitionException {
        try {
            // InternalLogical.g:258:1: ( ruleImpliesExpr EOF )
            // InternalLogical.g:259:1: ruleImpliesExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleImpliesExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImpliesExprRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleImpliesExpr"


    // $ANTLR start "ruleImpliesExpr"
    // InternalLogical.g:266:1: ruleImpliesExpr : ( ( rule__ImpliesExpr__Group__0 ) ) ;
    public final void ruleImpliesExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:270:2: ( ( ( rule__ImpliesExpr__Group__0 ) ) )
            // InternalLogical.g:271:1: ( ( rule__ImpliesExpr__Group__0 ) )
            {
            // InternalLogical.g:271:1: ( ( rule__ImpliesExpr__Group__0 ) )
            // InternalLogical.g:272:1: ( rule__ImpliesExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesExprAccess().getGroup()); 
            }
            // InternalLogical.g:273:1: ( rule__ImpliesExpr__Group__0 )
            // InternalLogical.g:273:2: rule__ImpliesExpr__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ImpliesExpr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImpliesExprAccess().getGroup()); 
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
    // $ANTLR end "ruleImpliesExpr"


    // $ANTLR start "entryRuleOrExpr"
    // InternalLogical.g:285:1: entryRuleOrExpr : ruleOrExpr EOF ;
    public final void entryRuleOrExpr() throws RecognitionException {
        try {
            // InternalLogical.g:286:1: ( ruleOrExpr EOF )
            // InternalLogical.g:287:1: ruleOrExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleOrExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExprRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleOrExpr"


    // $ANTLR start "ruleOrExpr"
    // InternalLogical.g:294:1: ruleOrExpr : ( ( rule__OrExpr__Group__0 ) ) ;
    public final void ruleOrExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:298:2: ( ( ( rule__OrExpr__Group__0 ) ) )
            // InternalLogical.g:299:1: ( ( rule__OrExpr__Group__0 ) )
            {
            // InternalLogical.g:299:1: ( ( rule__OrExpr__Group__0 ) )
            // InternalLogical.g:300:1: ( rule__OrExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExprAccess().getGroup()); 
            }
            // InternalLogical.g:301:1: ( rule__OrExpr__Group__0 )
            // InternalLogical.g:301:2: rule__OrExpr__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OrExpr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExprAccess().getGroup()); 
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
    // $ANTLR end "ruleOrExpr"


    // $ANTLR start "entryRuleXorExpr"
    // InternalLogical.g:313:1: entryRuleXorExpr : ruleXorExpr EOF ;
    public final void entryRuleXorExpr() throws RecognitionException {
        try {
            // InternalLogical.g:314:1: ( ruleXorExpr EOF )
            // InternalLogical.g:315:1: ruleXorExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleXorExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXorExprRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleXorExpr"


    // $ANTLR start "ruleXorExpr"
    // InternalLogical.g:322:1: ruleXorExpr : ( ( rule__XorExpr__Group__0 ) ) ;
    public final void ruleXorExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:326:2: ( ( ( rule__XorExpr__Group__0 ) ) )
            // InternalLogical.g:327:1: ( ( rule__XorExpr__Group__0 ) )
            {
            // InternalLogical.g:327:1: ( ( rule__XorExpr__Group__0 ) )
            // InternalLogical.g:328:1: ( rule__XorExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExprAccess().getGroup()); 
            }
            // InternalLogical.g:329:1: ( rule__XorExpr__Group__0 )
            // InternalLogical.g:329:2: rule__XorExpr__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XorExpr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXorExprAccess().getGroup()); 
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
    // $ANTLR end "ruleXorExpr"


    // $ANTLR start "entryRuleMinusExpr"
    // InternalLogical.g:341:1: entryRuleMinusExpr : ruleMinusExpr EOF ;
    public final void entryRuleMinusExpr() throws RecognitionException {
        try {
            // InternalLogical.g:342:1: ( ruleMinusExpr EOF )
            // InternalLogical.g:343:1: ruleMinusExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinusExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMinusExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinusExprRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMinusExpr"


    // $ANTLR start "ruleMinusExpr"
    // InternalLogical.g:350:1: ruleMinusExpr : ( ( rule__MinusExpr__Group__0 ) ) ;
    public final void ruleMinusExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:354:2: ( ( ( rule__MinusExpr__Group__0 ) ) )
            // InternalLogical.g:355:1: ( ( rule__MinusExpr__Group__0 ) )
            {
            // InternalLogical.g:355:1: ( ( rule__MinusExpr__Group__0 ) )
            // InternalLogical.g:356:1: ( rule__MinusExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinusExprAccess().getGroup()); 
            }
            // InternalLogical.g:357:1: ( rule__MinusExpr__Group__0 )
            // InternalLogical.g:357:2: rule__MinusExpr__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MinusExpr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinusExprAccess().getGroup()); 
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
    // $ANTLR end "ruleMinusExpr"


    // $ANTLR start "entryRuleNandExpr"
    // InternalLogical.g:369:1: entryRuleNandExpr : ruleNandExpr EOF ;
    public final void entryRuleNandExpr() throws RecognitionException {
        try {
            // InternalLogical.g:370:1: ( ruleNandExpr EOF )
            // InternalLogical.g:371:1: ruleNandExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNandExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleNandExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNandExprRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleNandExpr"


    // $ANTLR start "ruleNandExpr"
    // InternalLogical.g:378:1: ruleNandExpr : ( ( rule__NandExpr__Group__0 ) ) ;
    public final void ruleNandExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:382:2: ( ( ( rule__NandExpr__Group__0 ) ) )
            // InternalLogical.g:383:1: ( ( rule__NandExpr__Group__0 ) )
            {
            // InternalLogical.g:383:1: ( ( rule__NandExpr__Group__0 ) )
            // InternalLogical.g:384:1: ( rule__NandExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNandExprAccess().getGroup()); 
            }
            // InternalLogical.g:385:1: ( rule__NandExpr__Group__0 )
            // InternalLogical.g:385:2: rule__NandExpr__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NandExpr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNandExprAccess().getGroup()); 
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
    // $ANTLR end "ruleNandExpr"


    // $ANTLR start "entryRuleAndExpr"
    // InternalLogical.g:397:1: entryRuleAndExpr : ruleAndExpr EOF ;
    public final void entryRuleAndExpr() throws RecognitionException {
        try {
            // InternalLogical.g:398:1: ( ruleAndExpr EOF )
            // InternalLogical.g:399:1: ruleAndExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAndExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExprRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAndExpr"


    // $ANTLR start "ruleAndExpr"
    // InternalLogical.g:406:1: ruleAndExpr : ( ( rule__AndExpr__Group__0 ) ) ;
    public final void ruleAndExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:410:2: ( ( ( rule__AndExpr__Group__0 ) ) )
            // InternalLogical.g:411:1: ( ( rule__AndExpr__Group__0 ) )
            {
            // InternalLogical.g:411:1: ( ( rule__AndExpr__Group__0 ) )
            // InternalLogical.g:412:1: ( rule__AndExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExprAccess().getGroup()); 
            }
            // InternalLogical.g:413:1: ( rule__AndExpr__Group__0 )
            // InternalLogical.g:413:2: rule__AndExpr__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AndExpr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExprAccess().getGroup()); 
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
    // $ANTLR end "ruleAndExpr"


    // $ANTLR start "entryRulePrimaryExpr"
    // InternalLogical.g:425:1: entryRulePrimaryExpr : rulePrimaryExpr EOF ;
    public final void entryRulePrimaryExpr() throws RecognitionException {
        try {
            // InternalLogical.g:426:1: ( rulePrimaryExpr EOF )
            // InternalLogical.g:427:1: rulePrimaryExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            rulePrimaryExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRulePrimaryExpr"


    // $ANTLR start "rulePrimaryExpr"
    // InternalLogical.g:434:1: rulePrimaryExpr : ( ( rule__PrimaryExpr__Alternatives ) ) ;
    public final void rulePrimaryExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:438:2: ( ( ( rule__PrimaryExpr__Alternatives ) ) )
            // InternalLogical.g:439:1: ( ( rule__PrimaryExpr__Alternatives ) )
            {
            // InternalLogical.g:439:1: ( ( rule__PrimaryExpr__Alternatives ) )
            // InternalLogical.g:440:1: ( rule__PrimaryExpr__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getAlternatives()); 
            }
            // InternalLogical.g:441:1: ( rule__PrimaryExpr__Alternatives )
            // InternalLogical.g:441:2: rule__PrimaryExpr__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PrimaryExpr__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprAccess().getAlternatives()); 
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
    // $ANTLR end "rulePrimaryExpr"


    // $ANTLR start "entryRuleBigExpr"
    // InternalLogical.g:453:1: entryRuleBigExpr : ruleBigExpr EOF ;
    public final void entryRuleBigExpr() throws RecognitionException {
        try {
            // InternalLogical.g:454:1: ( ruleBigExpr EOF )
            // InternalLogical.g:455:1: ruleBigExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBigExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleBigExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBigExprRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBigExpr"


    // $ANTLR start "ruleBigExpr"
    // InternalLogical.g:462:1: ruleBigExpr : ( ( rule__BigExpr__Alternatives ) ) ;
    public final void ruleBigExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:466:2: ( ( ( rule__BigExpr__Alternatives ) ) )
            // InternalLogical.g:467:1: ( ( rule__BigExpr__Alternatives ) )
            {
            // InternalLogical.g:467:1: ( ( rule__BigExpr__Alternatives ) )
            // InternalLogical.g:468:1: ( rule__BigExpr__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBigExprAccess().getAlternatives()); 
            }
            // InternalLogical.g:469:1: ( rule__BigExpr__Alternatives )
            // InternalLogical.g:469:2: rule__BigExpr__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BigExpr__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBigExprAccess().getAlternatives()); 
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
    // $ANTLR end "ruleBigExpr"


    // $ANTLR start "entryRuleBigAndExpr"
    // InternalLogical.g:481:1: entryRuleBigAndExpr : ruleBigAndExpr EOF ;
    public final void entryRuleBigAndExpr() throws RecognitionException {
        try {
            // InternalLogical.g:482:1: ( ruleBigAndExpr EOF )
            // InternalLogical.g:483:1: ruleBigAndExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBigAndExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleBigAndExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBigAndExprRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBigAndExpr"


    // $ANTLR start "ruleBigAndExpr"
    // InternalLogical.g:490:1: ruleBigAndExpr : ( ( rule__BigAndExpr__Group__0 ) ) ;
    public final void ruleBigAndExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:494:2: ( ( ( rule__BigAndExpr__Group__0 ) ) )
            // InternalLogical.g:495:1: ( ( rule__BigAndExpr__Group__0 ) )
            {
            // InternalLogical.g:495:1: ( ( rule__BigAndExpr__Group__0 ) )
            // InternalLogical.g:496:1: ( rule__BigAndExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBigAndExprAccess().getGroup()); 
            }
            // InternalLogical.g:497:1: ( rule__BigAndExpr__Group__0 )
            // InternalLogical.g:497:2: rule__BigAndExpr__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BigAndExpr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBigAndExprAccess().getGroup()); 
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
    // $ANTLR end "ruleBigAndExpr"


    // $ANTLR start "entryRuleBigOrExpr"
    // InternalLogical.g:509:1: entryRuleBigOrExpr : ruleBigOrExpr EOF ;
    public final void entryRuleBigOrExpr() throws RecognitionException {
        try {
            // InternalLogical.g:510:1: ( ruleBigOrExpr EOF )
            // InternalLogical.g:511:1: ruleBigOrExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBigOrExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleBigOrExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBigOrExprRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBigOrExpr"


    // $ANTLR start "ruleBigOrExpr"
    // InternalLogical.g:518:1: ruleBigOrExpr : ( ( rule__BigOrExpr__Group__0 ) ) ;
    public final void ruleBigOrExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:522:2: ( ( ( rule__BigOrExpr__Group__0 ) ) )
            // InternalLogical.g:523:1: ( ( rule__BigOrExpr__Group__0 ) )
            {
            // InternalLogical.g:523:1: ( ( rule__BigOrExpr__Group__0 ) )
            // InternalLogical.g:524:1: ( rule__BigOrExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBigOrExprAccess().getGroup()); 
            }
            // InternalLogical.g:525:1: ( rule__BigOrExpr__Group__0 )
            // InternalLogical.g:525:2: rule__BigOrExpr__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BigOrExpr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBigOrExprAccess().getGroup()); 
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
    // $ANTLR end "ruleBigOrExpr"


    // $ANTLR start "entryRuleBigXorExpr"
    // InternalLogical.g:537:1: entryRuleBigXorExpr : ruleBigXorExpr EOF ;
    public final void entryRuleBigXorExpr() throws RecognitionException {
        try {
            // InternalLogical.g:538:1: ( ruleBigXorExpr EOF )
            // InternalLogical.g:539:1: ruleBigXorExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBigXorExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleBigXorExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBigXorExprRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBigXorExpr"


    // $ANTLR start "ruleBigXorExpr"
    // InternalLogical.g:546:1: ruleBigXorExpr : ( ( rule__BigXorExpr__Group__0 ) ) ;
    public final void ruleBigXorExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:550:2: ( ( ( rule__BigXorExpr__Group__0 ) ) )
            // InternalLogical.g:551:1: ( ( rule__BigXorExpr__Group__0 ) )
            {
            // InternalLogical.g:551:1: ( ( rule__BigXorExpr__Group__0 ) )
            // InternalLogical.g:552:1: ( rule__BigXorExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBigXorExprAccess().getGroup()); 
            }
            // InternalLogical.g:553:1: ( rule__BigXorExpr__Group__0 )
            // InternalLogical.g:553:2: rule__BigXorExpr__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BigXorExpr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBigXorExprAccess().getGroup()); 
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
    // $ANTLR end "ruleBigXorExpr"


    // $ANTLR start "entryRuleBigNandExpr"
    // InternalLogical.g:565:1: entryRuleBigNandExpr : ruleBigNandExpr EOF ;
    public final void entryRuleBigNandExpr() throws RecognitionException {
        try {
            // InternalLogical.g:566:1: ( ruleBigNandExpr EOF )
            // InternalLogical.g:567:1: ruleBigNandExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBigNandExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleBigNandExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBigNandExprRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleBigNandExpr"


    // $ANTLR start "ruleBigNandExpr"
    // InternalLogical.g:574:1: ruleBigNandExpr : ( ( rule__BigNandExpr__Group__0 ) ) ;
    public final void ruleBigNandExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:578:2: ( ( ( rule__BigNandExpr__Group__0 ) ) )
            // InternalLogical.g:579:1: ( ( rule__BigNandExpr__Group__0 ) )
            {
            // InternalLogical.g:579:1: ( ( rule__BigNandExpr__Group__0 ) )
            // InternalLogical.g:580:1: ( rule__BigNandExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBigNandExprAccess().getGroup()); 
            }
            // InternalLogical.g:581:1: ( rule__BigNandExpr__Group__0 )
            // InternalLogical.g:581:2: rule__BigNandExpr__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BigNandExpr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBigNandExprAccess().getGroup()); 
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
    // $ANTLR end "ruleBigNandExpr"


    // $ANTLR start "entryRuleOptionRef"
    // InternalLogical.g:593:1: entryRuleOptionRef : ruleOptionRef EOF ;
    public final void entryRuleOptionRef() throws RecognitionException {
        try {
            // InternalLogical.g:594:1: ( ruleOptionRef EOF )
            // InternalLogical.g:595:1: ruleOptionRef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionRefRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleOptionRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptionRefRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleOptionRef"


    // $ANTLR start "ruleOptionRef"
    // InternalLogical.g:602:1: ruleOptionRef : ( ( rule__OptionRef__OptionAssignment ) ) ;
    public final void ruleOptionRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:606:2: ( ( ( rule__OptionRef__OptionAssignment ) ) )
            // InternalLogical.g:607:1: ( ( rule__OptionRef__OptionAssignment ) )
            {
            // InternalLogical.g:607:1: ( ( rule__OptionRef__OptionAssignment ) )
            // InternalLogical.g:608:1: ( rule__OptionRef__OptionAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionRefAccess().getOptionAssignment()); 
            }
            // InternalLogical.g:609:1: ( rule__OptionRef__OptionAssignment )
            // InternalLogical.g:609:2: rule__OptionRef__OptionAssignment
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OptionRef__OptionAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptionRefAccess().getOptionAssignment()); 
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
    // $ANTLR end "ruleOptionRef"


    // $ANTLR start "entryRuleNegExpr"
    // InternalLogical.g:621:1: entryRuleNegExpr : ruleNegExpr EOF ;
    public final void entryRuleNegExpr() throws RecognitionException {
        try {
            // InternalLogical.g:622:1: ( ruleNegExpr EOF )
            // InternalLogical.g:623:1: ruleNegExpr EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleNegExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegExprRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleNegExpr"


    // $ANTLR start "ruleNegExpr"
    // InternalLogical.g:630:1: ruleNegExpr : ( ( rule__NegExpr__Group__0 ) ) ;
    public final void ruleNegExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:634:2: ( ( ( rule__NegExpr__Group__0 ) ) )
            // InternalLogical.g:635:1: ( ( rule__NegExpr__Group__0 ) )
            {
            // InternalLogical.g:635:1: ( ( rule__NegExpr__Group__0 ) )
            // InternalLogical.g:636:1: ( rule__NegExpr__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExprAccess().getGroup()); 
            }
            // InternalLogical.g:637:1: ( rule__NegExpr__Group__0 )
            // InternalLogical.g:637:2: rule__NegExpr__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NegExpr__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegExprAccess().getGroup()); 
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
    // $ANTLR end "ruleNegExpr"


    // $ANTLR start "ruleTristate"
    // InternalLogical.g:650:1: ruleTristate : ( ( rule__Tristate__Alternatives ) ) ;
    public final void ruleTristate() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:654:1: ( ( ( rule__Tristate__Alternatives ) ) )
            // InternalLogical.g:655:1: ( ( rule__Tristate__Alternatives ) )
            {
            // InternalLogical.g:655:1: ( ( rule__Tristate__Alternatives ) )
            // InternalLogical.g:656:1: ( rule__Tristate__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTristateAccess().getAlternatives()); 
            }
            // InternalLogical.g:657:1: ( rule__Tristate__Alternatives )
            // InternalLogical.g:657:2: rule__Tristate__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Tristate__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTristateAccess().getAlternatives()); 
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
    // $ANTLR end "ruleTristate"


    // $ANTLR start "rule__LogicalDimension__Alternatives_5"
    // InternalLogical.g:668:1: rule__LogicalDimension__Alternatives_5 : ( ( ( rule__LogicalDimension__LogicalOptionsAssignment_5_0 ) ) | ( ( rule__LogicalDimension__LogicalInvariantsAssignment_5_1 ) ) | ( ( rule__LogicalDimension__LogicalPreferencesAssignment_5_2 ) ) | ( ( rule__LogicalDimension__LogicalDefaultsAssignment_5_3 ) ) );
    public final void rule__LogicalDimension__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:672:1: ( ( ( rule__LogicalDimension__LogicalOptionsAssignment_5_0 ) ) | ( ( rule__LogicalDimension__LogicalInvariantsAssignment_5_1 ) ) | ( ( rule__LogicalDimension__LogicalPreferencesAssignment_5_2 ) ) | ( ( rule__LogicalDimension__LogicalDefaultsAssignment_5_3 ) ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt1=1;
                }
                break;
            case 29:
                {
                alt1=2;
                }
                break;
            case 30:
                {
                alt1=3;
                }
                break;
            case 32:
                {
                alt1=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalLogical.g:673:1: ( ( rule__LogicalDimension__LogicalOptionsAssignment_5_0 ) )
                    {
                    // InternalLogical.g:673:1: ( ( rule__LogicalDimension__LogicalOptionsAssignment_5_0 ) )
                    // InternalLogical.g:674:1: ( rule__LogicalDimension__LogicalOptionsAssignment_5_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogicalDimensionAccess().getLogicalOptionsAssignment_5_0()); 
                    }
                    // InternalLogical.g:675:1: ( rule__LogicalDimension__LogicalOptionsAssignment_5_0 )
                    // InternalLogical.g:675:2: rule__LogicalDimension__LogicalOptionsAssignment_5_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__LogicalDimension__LogicalOptionsAssignment_5_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLogicalDimensionAccess().getLogicalOptionsAssignment_5_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalLogical.g:679:6: ( ( rule__LogicalDimension__LogicalInvariantsAssignment_5_1 ) )
                    {
                    // InternalLogical.g:679:6: ( ( rule__LogicalDimension__LogicalInvariantsAssignment_5_1 ) )
                    // InternalLogical.g:680:1: ( rule__LogicalDimension__LogicalInvariantsAssignment_5_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogicalDimensionAccess().getLogicalInvariantsAssignment_5_1()); 
                    }
                    // InternalLogical.g:681:1: ( rule__LogicalDimension__LogicalInvariantsAssignment_5_1 )
                    // InternalLogical.g:681:2: rule__LogicalDimension__LogicalInvariantsAssignment_5_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__LogicalDimension__LogicalInvariantsAssignment_5_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLogicalDimensionAccess().getLogicalInvariantsAssignment_5_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalLogical.g:685:6: ( ( rule__LogicalDimension__LogicalPreferencesAssignment_5_2 ) )
                    {
                    // InternalLogical.g:685:6: ( ( rule__LogicalDimension__LogicalPreferencesAssignment_5_2 ) )
                    // InternalLogical.g:686:1: ( rule__LogicalDimension__LogicalPreferencesAssignment_5_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogicalDimensionAccess().getLogicalPreferencesAssignment_5_2()); 
                    }
                    // InternalLogical.g:687:1: ( rule__LogicalDimension__LogicalPreferencesAssignment_5_2 )
                    // InternalLogical.g:687:2: rule__LogicalDimension__LogicalPreferencesAssignment_5_2
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__LogicalDimension__LogicalPreferencesAssignment_5_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLogicalDimensionAccess().getLogicalPreferencesAssignment_5_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalLogical.g:691:6: ( ( rule__LogicalDimension__LogicalDefaultsAssignment_5_3 ) )
                    {
                    // InternalLogical.g:691:6: ( ( rule__LogicalDimension__LogicalDefaultsAssignment_5_3 ) )
                    // InternalLogical.g:692:1: ( rule__LogicalDimension__LogicalDefaultsAssignment_5_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogicalDimensionAccess().getLogicalDefaultsAssignment_5_3()); 
                    }
                    // InternalLogical.g:693:1: ( rule__LogicalDimension__LogicalDefaultsAssignment_5_3 )
                    // InternalLogical.g:693:2: rule__LogicalDimension__LogicalDefaultsAssignment_5_3
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__LogicalDimension__LogicalDefaultsAssignment_5_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLogicalDimensionAccess().getLogicalDefaultsAssignment_5_3()); 
                    }

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
    // $ANTLR end "rule__LogicalDimension__Alternatives_5"


    // $ANTLR start "rule__OptionExpr__Alternatives"
    // InternalLogical.g:702:1: rule__OptionExpr__Alternatives : ( ( ruleBiconditionalExpr ) | ( ruleBigExpr ) );
    public final void rule__OptionExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:706:1: ( ( ruleBiconditionalExpr ) | ( ruleBigExpr ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_P_OPEN||(LA2_0>=RULE_K_NOT && LA2_0<=RULE_ID)) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_K_BIG_AND||(LA2_0>=RULE_K_BIG_OR && LA2_0<=RULE_K_BIG_NAND)) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalLogical.g:707:1: ( ruleBiconditionalExpr )
                    {
                    // InternalLogical.g:707:1: ( ruleBiconditionalExpr )
                    // InternalLogical.g:708:1: ruleBiconditionalExpr
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOptionExprAccess().getBiconditionalExprParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleBiconditionalExpr();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOptionExprAccess().getBiconditionalExprParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalLogical.g:713:6: ( ruleBigExpr )
                    {
                    // InternalLogical.g:713:6: ( ruleBigExpr )
                    // InternalLogical.g:714:1: ruleBigExpr
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOptionExprAccess().getBigExprParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleBigExpr();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOptionExprAccess().getBigExprParserRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__OptionExpr__Alternatives"


    // $ANTLR start "rule__PrimaryExpr__Alternatives"
    // InternalLogical.g:724:1: rule__PrimaryExpr__Alternatives : ( ( ( rule__PrimaryExpr__Group_0__0 ) ) | ( ruleOptionRef ) | ( ruleNegExpr ) );
    public final void rule__PrimaryExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:728:1: ( ( ( rule__PrimaryExpr__Group_0__0 ) ) | ( ruleOptionRef ) | ( ruleNegExpr ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_P_OPEN:
                {
                alt3=1;
                }
                break;
            case RULE_ID:
                {
                alt3=2;
                }
                break;
            case RULE_K_NOT:
                {
                alt3=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalLogical.g:729:1: ( ( rule__PrimaryExpr__Group_0__0 ) )
                    {
                    // InternalLogical.g:729:1: ( ( rule__PrimaryExpr__Group_0__0 ) )
                    // InternalLogical.g:730:1: ( rule__PrimaryExpr__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExprAccess().getGroup_0()); 
                    }
                    // InternalLogical.g:731:1: ( rule__PrimaryExpr__Group_0__0 )
                    // InternalLogical.g:731:2: rule__PrimaryExpr__Group_0__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__PrimaryExpr__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExprAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalLogical.g:735:6: ( ruleOptionRef )
                    {
                    // InternalLogical.g:735:6: ( ruleOptionRef )
                    // InternalLogical.g:736:1: ruleOptionRef
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExprAccess().getOptionRefParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleOptionRef();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExprAccess().getOptionRefParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalLogical.g:741:6: ( ruleNegExpr )
                    {
                    // InternalLogical.g:741:6: ( ruleNegExpr )
                    // InternalLogical.g:742:1: ruleNegExpr
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExprAccess().getNegExprParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleNegExpr();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExprAccess().getNegExprParserRuleCall_2()); 
                    }

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
    // $ANTLR end "rule__PrimaryExpr__Alternatives"


    // $ANTLR start "rule__BigExpr__Alternatives"
    // InternalLogical.g:752:1: rule__BigExpr__Alternatives : ( ( ruleBigAndExpr ) | ( ruleBigOrExpr ) | ( ruleBigXorExpr ) | ( ruleBigNandExpr ) );
    public final void rule__BigExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:756:1: ( ( ruleBigAndExpr ) | ( ruleBigOrExpr ) | ( ruleBigXorExpr ) | ( ruleBigNandExpr ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case RULE_K_BIG_AND:
                {
                alt4=1;
                }
                break;
            case RULE_K_BIG_OR:
                {
                alt4=2;
                }
                break;
            case RULE_K_BIG_XOR:
                {
                alt4=3;
                }
                break;
            case RULE_K_BIG_NAND:
                {
                alt4=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalLogical.g:757:1: ( ruleBigAndExpr )
                    {
                    // InternalLogical.g:757:1: ( ruleBigAndExpr )
                    // InternalLogical.g:758:1: ruleBigAndExpr
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBigExprAccess().getBigAndExprParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleBigAndExpr();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBigExprAccess().getBigAndExprParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalLogical.g:763:6: ( ruleBigOrExpr )
                    {
                    // InternalLogical.g:763:6: ( ruleBigOrExpr )
                    // InternalLogical.g:764:1: ruleBigOrExpr
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBigExprAccess().getBigOrExprParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleBigOrExpr();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBigExprAccess().getBigOrExprParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalLogical.g:769:6: ( ruleBigXorExpr )
                    {
                    // InternalLogical.g:769:6: ( ruleBigXorExpr )
                    // InternalLogical.g:770:1: ruleBigXorExpr
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBigExprAccess().getBigXorExprParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleBigXorExpr();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBigExprAccess().getBigXorExprParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalLogical.g:775:6: ( ruleBigNandExpr )
                    {
                    // InternalLogical.g:775:6: ( ruleBigNandExpr )
                    // InternalLogical.g:776:1: ruleBigNandExpr
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBigExprAccess().getBigNandExprParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleBigNandExpr();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBigExprAccess().getBigNandExprParserRuleCall_3()); 
                    }

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
    // $ANTLR end "rule__BigExpr__Alternatives"


    // $ANTLR start "rule__Tristate__Alternatives"
    // InternalLogical.g:786:1: rule__Tristate__Alternatives : ( ( ( 'unknown' ) ) | ( ( 'true' ) ) | ( ( 'false' ) ) );
    public final void rule__Tristate__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:790:1: ( ( ( 'unknown' ) ) | ( ( 'true' ) ) | ( ( 'false' ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt5=1;
                }
                break;
            case 22:
                {
                alt5=2;
                }
                break;
            case 23:
                {
                alt5=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalLogical.g:791:1: ( ( 'unknown' ) )
                    {
                    // InternalLogical.g:791:1: ( ( 'unknown' ) )
                    // InternalLogical.g:792:1: ( 'unknown' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTristateAccess().getUnknownEnumLiteralDeclaration_0()); 
                    }
                    // InternalLogical.g:793:1: ( 'unknown' )
                    // InternalLogical.g:793:3: 'unknown'
                    {
                    match(input,21,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTristateAccess().getUnknownEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalLogical.g:798:6: ( ( 'true' ) )
                    {
                    // InternalLogical.g:798:6: ( ( 'true' ) )
                    // InternalLogical.g:799:1: ( 'true' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTristateAccess().getTrueEnumLiteralDeclaration_1()); 
                    }
                    // InternalLogical.g:800:1: ( 'true' )
                    // InternalLogical.g:800:3: 'true'
                    {
                    match(input,22,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTristateAccess().getTrueEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalLogical.g:805:6: ( ( 'false' ) )
                    {
                    // InternalLogical.g:805:6: ( ( 'false' ) )
                    // InternalLogical.g:806:1: ( 'false' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTristateAccess().getFalseEnumLiteralDeclaration_2()); 
                    }
                    // InternalLogical.g:807:1: ( 'false' )
                    // InternalLogical.g:807:3: 'false'
                    {
                    match(input,23,FollowSets000.FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTristateAccess().getFalseEnumLiteralDeclaration_2()); 
                    }

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
    // $ANTLR end "rule__Tristate__Alternatives"


    // $ANTLR start "rule__LogicalDimension__Group__0"
    // InternalLogical.g:819:1: rule__LogicalDimension__Group__0 : rule__LogicalDimension__Group__0__Impl rule__LogicalDimension__Group__1 ;
    public final void rule__LogicalDimension__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:823:1: ( rule__LogicalDimension__Group__0__Impl rule__LogicalDimension__Group__1 )
            // InternalLogical.g:824:2: rule__LogicalDimension__Group__0__Impl rule__LogicalDimension__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__LogicalDimension__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalDimension__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalDimension__Group__0"


    // $ANTLR start "rule__LogicalDimension__Group__0__Impl"
    // InternalLogical.g:831:1: rule__LogicalDimension__Group__0__Impl : ( () ) ;
    public final void rule__LogicalDimension__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:835:1: ( ( () ) )
            // InternalLogical.g:836:1: ( () )
            {
            // InternalLogical.g:836:1: ( () )
            // InternalLogical.g:837:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalDimensionAccess().getLogicalDimensionAction_0()); 
            }
            // InternalLogical.g:838:1: ()
            // InternalLogical.g:840:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalDimensionAccess().getLogicalDimensionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalDimension__Group__0__Impl"


    // $ANTLR start "rule__LogicalDimension__Group__1"
    // InternalLogical.g:850:1: rule__LogicalDimension__Group__1 : rule__LogicalDimension__Group__1__Impl rule__LogicalDimension__Group__2 ;
    public final void rule__LogicalDimension__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:854:1: ( rule__LogicalDimension__Group__1__Impl rule__LogicalDimension__Group__2 )
            // InternalLogical.g:855:2: rule__LogicalDimension__Group__1__Impl rule__LogicalDimension__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__LogicalDimension__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalDimension__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalDimension__Group__1"


    // $ANTLR start "rule__LogicalDimension__Group__1__Impl"
    // InternalLogical.g:862:1: rule__LogicalDimension__Group__1__Impl : ( 'logical' ) ;
    public final void rule__LogicalDimension__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:866:1: ( ( 'logical' ) )
            // InternalLogical.g:867:1: ( 'logical' )
            {
            // InternalLogical.g:867:1: ( 'logical' )
            // InternalLogical.g:868:1: 'logical'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalDimensionAccess().getLogicalKeyword_1()); 
            }
            match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalDimensionAccess().getLogicalKeyword_1()); 
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
    // $ANTLR end "rule__LogicalDimension__Group__1__Impl"


    // $ANTLR start "rule__LogicalDimension__Group__2"
    // InternalLogical.g:881:1: rule__LogicalDimension__Group__2 : rule__LogicalDimension__Group__2__Impl rule__LogicalDimension__Group__3 ;
    public final void rule__LogicalDimension__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:885:1: ( rule__LogicalDimension__Group__2__Impl rule__LogicalDimension__Group__3 )
            // InternalLogical.g:886:2: rule__LogicalDimension__Group__2__Impl rule__LogicalDimension__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__LogicalDimension__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalDimension__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalDimension__Group__2"


    // $ANTLR start "rule__LogicalDimension__Group__2__Impl"
    // InternalLogical.g:893:1: rule__LogicalDimension__Group__2__Impl : ( 'dimension' ) ;
    public final void rule__LogicalDimension__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:897:1: ( ( 'dimension' ) )
            // InternalLogical.g:898:1: ( 'dimension' )
            {
            // InternalLogical.g:898:1: ( 'dimension' )
            // InternalLogical.g:899:1: 'dimension'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalDimensionAccess().getDimensionKeyword_2()); 
            }
            match(input,25,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalDimensionAccess().getDimensionKeyword_2()); 
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
    // $ANTLR end "rule__LogicalDimension__Group__2__Impl"


    // $ANTLR start "rule__LogicalDimension__Group__3"
    // InternalLogical.g:912:1: rule__LogicalDimension__Group__3 : rule__LogicalDimension__Group__3__Impl rule__LogicalDimension__Group__4 ;
    public final void rule__LogicalDimension__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:916:1: ( rule__LogicalDimension__Group__3__Impl rule__LogicalDimension__Group__4 )
            // InternalLogical.g:917:2: rule__LogicalDimension__Group__3__Impl rule__LogicalDimension__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__LogicalDimension__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalDimension__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalDimension__Group__3"


    // $ANTLR start "rule__LogicalDimension__Group__3__Impl"
    // InternalLogical.g:924:1: rule__LogicalDimension__Group__3__Impl : ( ( rule__LogicalDimension__DimensionNameAssignment_3 ) ) ;
    public final void rule__LogicalDimension__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:928:1: ( ( ( rule__LogicalDimension__DimensionNameAssignment_3 ) ) )
            // InternalLogical.g:929:1: ( ( rule__LogicalDimension__DimensionNameAssignment_3 ) )
            {
            // InternalLogical.g:929:1: ( ( rule__LogicalDimension__DimensionNameAssignment_3 ) )
            // InternalLogical.g:930:1: ( rule__LogicalDimension__DimensionNameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalDimensionAccess().getDimensionNameAssignment_3()); 
            }
            // InternalLogical.g:931:1: ( rule__LogicalDimension__DimensionNameAssignment_3 )
            // InternalLogical.g:931:2: rule__LogicalDimension__DimensionNameAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalDimension__DimensionNameAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalDimensionAccess().getDimensionNameAssignment_3()); 
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
    // $ANTLR end "rule__LogicalDimension__Group__3__Impl"


    // $ANTLR start "rule__LogicalDimension__Group__4"
    // InternalLogical.g:941:1: rule__LogicalDimension__Group__4 : rule__LogicalDimension__Group__4__Impl rule__LogicalDimension__Group__5 ;
    public final void rule__LogicalDimension__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:945:1: ( rule__LogicalDimension__Group__4__Impl rule__LogicalDimension__Group__5 )
            // InternalLogical.g:946:2: rule__LogicalDimension__Group__4__Impl rule__LogicalDimension__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__LogicalDimension__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalDimension__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalDimension__Group__4"


    // $ANTLR start "rule__LogicalDimension__Group__4__Impl"
    // InternalLogical.g:953:1: rule__LogicalDimension__Group__4__Impl : ( '{' ) ;
    public final void rule__LogicalDimension__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:957:1: ( ( '{' ) )
            // InternalLogical.g:958:1: ( '{' )
            {
            // InternalLogical.g:958:1: ( '{' )
            // InternalLogical.g:959:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalDimensionAccess().getLeftCurlyBracketKeyword_4()); 
            }
            match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalDimensionAccess().getLeftCurlyBracketKeyword_4()); 
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
    // $ANTLR end "rule__LogicalDimension__Group__4__Impl"


    // $ANTLR start "rule__LogicalDimension__Group__5"
    // InternalLogical.g:972:1: rule__LogicalDimension__Group__5 : rule__LogicalDimension__Group__5__Impl rule__LogicalDimension__Group__6 ;
    public final void rule__LogicalDimension__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:976:1: ( rule__LogicalDimension__Group__5__Impl rule__LogicalDimension__Group__6 )
            // InternalLogical.g:977:2: rule__LogicalDimension__Group__5__Impl rule__LogicalDimension__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_7);
            rule__LogicalDimension__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalDimension__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalDimension__Group__5"


    // $ANTLR start "rule__LogicalDimension__Group__5__Impl"
    // InternalLogical.g:984:1: rule__LogicalDimension__Group__5__Impl : ( ( rule__LogicalDimension__Alternatives_5 )* ) ;
    public final void rule__LogicalDimension__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:988:1: ( ( ( rule__LogicalDimension__Alternatives_5 )* ) )
            // InternalLogical.g:989:1: ( ( rule__LogicalDimension__Alternatives_5 )* )
            {
            // InternalLogical.g:989:1: ( ( rule__LogicalDimension__Alternatives_5 )* )
            // InternalLogical.g:990:1: ( rule__LogicalDimension__Alternatives_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalDimensionAccess().getAlternatives_5()); 
            }
            // InternalLogical.g:991:1: ( rule__LogicalDimension__Alternatives_5 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=28 && LA6_0<=30)||LA6_0==32) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalLogical.g:991:2: rule__LogicalDimension__Alternatives_5
            	    {
            	    pushFollow(FollowSets000.FOLLOW_8);
            	    rule__LogicalDimension__Alternatives_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalDimensionAccess().getAlternatives_5()); 
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
    // $ANTLR end "rule__LogicalDimension__Group__5__Impl"


    // $ANTLR start "rule__LogicalDimension__Group__6"
    // InternalLogical.g:1001:1: rule__LogicalDimension__Group__6 : rule__LogicalDimension__Group__6__Impl ;
    public final void rule__LogicalDimension__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:1005:1: ( rule__LogicalDimension__Group__6__Impl )
            // InternalLogical.g:1006:2: rule__LogicalDimension__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__LogicalDimension__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalDimension__Group__6"


    // $ANTLR start "rule__LogicalDimension__Group__6__Impl"
    // InternalLogical.g:1012:1: rule__LogicalDimension__Group__6__Impl : ( '}' ) ;
    public final void rule__LogicalDimension__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:1016:1: ( ( '}' ) )
            // InternalLogical.g:1017:1: ( '}' )
            {
            // InternalLogical.g:1017:1: ( '}' )
            // InternalLogical.g:1018:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalDimensionAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalDimensionAccess().getRightCurlyBracketKeyword_6()); 
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
    // $ANTLR end "rule__LogicalDimension__Group__6__Impl"


    // $ANTLR start "rule__Option__Group__0"
    // InternalLogical.g:1045:1: rule__Option__Group__0 : rule__Option__Group__0__Impl rule__Option__Group__1 ;
    public final void rule__Option__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:1049:1: ( rule__Option__Group__0__Impl rule__Option__Group__1 )
            // InternalLogical.g:1050:2: rule__Option__Group__0__Impl rule__Option__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Option__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Option__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__0"


    // $ANTLR start "rule__Option__Group__0__Impl"
    // InternalLogical.g:1057:1: rule__Option__Group__0__Impl : ( 'option' ) ;
    public final void rule__Option__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:1061:1: ( ( 'option' ) )
            // InternalLogical.g:1062:1: ( 'option' )
            {
            // InternalLogical.g:1062:1: ( 'option' )
            // InternalLogical.g:1063:1: 'option'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionAccess().getOptionKeyword_0()); 
            }
            match(input,28,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptionAccess().getOptionKeyword_0()); 
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
    // $ANTLR end "rule__Option__Group__0__Impl"


    // $ANTLR start "rule__Option__Group__1"
    // InternalLogical.g:1076:1: rule__Option__Group__1 : rule__Option__Group__1__Impl ;
    public final void rule__Option__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:1080:1: ( rule__Option__Group__1__Impl )
            // InternalLogical.g:1081:2: rule__Option__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Option__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__1"


    // $ANTLR start "rule__Option__Group__1__Impl"
    // InternalLogical.g:1087:1: rule__Option__Group__1__Impl : ( ( rule__Option__NameAssignment_1 ) ) ;
    public final void rule__Option__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:1091:1: ( ( ( rule__Option__NameAssignment_1 ) ) )
            // InternalLogical.g:1092:1: ( ( rule__Option__NameAssignment_1 ) )
            {
            // InternalLogical.g:1092:1: ( ( rule__Option__NameAssignment_1 ) )
            // InternalLogical.g:1093:1: ( rule__Option__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionAccess().getNameAssignment_1()); 
            }
            // InternalLogical.g:1094:1: ( rule__Option__NameAssignment_1 )
            // InternalLogical.g:1094:2: rule__Option__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Option__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptionAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__Option__Group__1__Impl"


    // $ANTLR start "rule__Invariant__Group__0"
    // InternalLogical.g:1108:1: rule__Invariant__Group__0 : rule__Invariant__Group__0__Impl rule__Invariant__Group__1 ;
    public final void rule__Invariant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:1112:1: ( rule__Invariant__Group__0__Impl rule__Invariant__Group__1 )
            // InternalLogical.g:1113:2: rule__Invariant__Group__0__Impl rule__Invariant__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Invariant__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Invariant__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__Group__0"


    // $ANTLR start "rule__Invariant__Group__0__Impl"
    // InternalLogical.g:1120:1: rule__Invariant__Group__0__Impl : ( 'invariant' ) ;
    public final void rule__Invariant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:1124:1: ( ( 'invariant' ) )
            // InternalLogical.g:1125:1: ( 'invariant' )
            {
            // InternalLogical.g:1125:1: ( 'invariant' )
            // InternalLogical.g:1126:1: 'invariant'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInvariantAccess().getInvariantKeyword_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInvariantAccess().getInvariantKeyword_0()); 
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
    // $ANTLR end "rule__Invariant__Group__0__Impl"


    // $ANTLR start "rule__Invariant__Group__1"
    // InternalLogical.g:1139:1: rule__Invariant__Group__1 : rule__Invariant__Group__1__Impl rule__Invariant__Group__2 ;
    public final void rule__Invariant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:1143:1: ( rule__Invariant__Group__1__Impl rule__Invariant__Group__2 )
            // InternalLogical.g:1144:2: rule__Invariant__Group__1__Impl rule__Invariant__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__Invariant__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Invariant__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__Group__1"


    // $ANTLR start "rule__Invariant__Group__1__Impl"
    // InternalLogical.g:1151:1: rule__Invariant__Group__1__Impl : ( ( rule__Invariant__NameAssignment_1 ) ) ;
    public final void rule__Invariant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:1155:1: ( ( ( rule__Invariant__NameAssignment_1 ) ) )
            // InternalLogical.g:1156:1: ( ( rule__Invariant__NameAssignment_1 ) )
            {
            // InternalLogical.g:1156:1: ( ( rule__Invariant__NameAssignment_1 ) )
            // InternalLogical.g:1157:1: ( rule__Invariant__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInvariantAccess().getNameAssignment_1()); 
            }
            // InternalLogical.g:1158:1: ( rule__Invariant__NameAssignment_1 )
            // InternalLogical.g:1158:2: rule__Invariant__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Invariant__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInvariantAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__Invariant__Group__1__Impl"


    // $ANTLR start "rule__Invariant__Group__2"
    // InternalLogical.g:1168:1: rule__Invariant__Group__2 : rule__Invariant__Group__2__Impl rule__Invariant__Group__3 ;
    public final void rule__Invariant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:1172:1: ( rule__Invariant__Group__2__Impl rule__Invariant__Group__3 )
            // InternalLogical.g:1173:2: rule__Invariant__Group__2__Impl rule__Invariant__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__Invariant__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Invariant__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__Group__2"


    // $ANTLR start "rule__Invariant__Group__2__Impl"
    // InternalLogical.g:1180:1: rule__Invariant__Group__2__Impl : ( '{' ) ;
    public final void rule__Invariant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:1184:1: ( ( '{' ) )
            // InternalLogical.g:1185:1: ( '{' )
            {
            // InternalLogical.g:1185:1: ( '{' )
            // InternalLogical.g:1186:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInvariantAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInvariantAccess().getLeftCurlyBracketKeyword_2()); 
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
    // $ANTLR end "rule__Invariant__Group__2__Impl"


    // $ANTLR start "rule__Invariant__Group__3"
    // InternalLogical.g:1199:1: rule__Invariant__Group__3 : rule__Invariant__Group__3__Impl rule__Invariant__Group__4 ;
    public final void rule__Invariant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:1203:1: ( rule__Invariant__Group__3__Impl rule__Invariant__Group__4 )
            // InternalLogical.g:1204:2: rule__Invariant__Group__3__Impl rule__Invariant__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__Invariant__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Invariant__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__Group__3"


    // $ANTLR start "rule__Invariant__Group__3__Impl"
    // InternalLogical.g:1211:1: rule__Invariant__Group__3__Impl : ( ( rule__Invariant__OptionExprAssignment_3 ) ) ;
    public final void rule__Invariant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:1215:1: ( ( ( rule__Invariant__OptionExprAssignment_3 ) ) )
            // InternalLogical.g:1216:1: ( ( rule__Invariant__OptionExprAssignment_3 ) )
            {
            // InternalLogical.g:1216:1: ( ( rule__Invariant__OptionExprAssignment_3 ) )
            // InternalLogical.g:1217:1: ( rule__Invariant__OptionExprAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInvariantAccess().getOptionExprAssignment_3()); 
            }
            // InternalLogical.g:1218:1: ( rule__Invariant__OptionExprAssignment_3 )
            // InternalLogical.g:1218:2: rule__Invariant__OptionExprAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Invariant__OptionExprAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getInvariantAccess().getOptionExprAssignment_3()); 
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
    // $ANTLR end "rule__Invariant__Group__3__Impl"


    // $ANTLR start "rule__Invariant__Group__4"
    // InternalLogical.g:1228:1: rule__Invariant__Group__4 : rule__Invariant__Group__4__Impl ;
    public final void rule__Invariant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:1232:1: ( rule__Invariant__Group__4__Impl )
            // InternalLogical.g:1233:2: rule__Invariant__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Invariant__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Invariant__Group__4"


    // $ANTLR start "rule__Invariant__Group__4__Impl"
    // InternalLogical.g:1239:1: rule__Invariant__Group__4__Impl : ( '}' ) ;
    public final void rule__Invariant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:1243:1: ( ( '}' ) )
            // InternalLogical.g:1244:1: ( '}' )
            {
            // InternalLogical.g:1244:1: ( '}' )
            // InternalLogical.g:1245:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInvariantAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInvariantAccess().getRightCurlyBracketKeyword_4()); 
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
    // $ANTLR end "rule__Invariant__Group__4__Impl"


    // $ANTLR start "rule__Preference__Group__0"
    // InternalLogical.g:1268:1: rule__Preference__Group__0 : rule__Preference__Group__0__Impl rule__Preference__Group__1 ;
    public final void rule__Preference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:1272:1: ( rule__Preference__Group__0__Impl rule__Preference__Group__1 )
            // InternalLogical.g:1273:2: rule__Preference__Group__0__Impl rule__Preference__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Preference__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Preference__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preference__Group__0"


    // $ANTLR start "rule__Preference__Group__0__Impl"
    // InternalLogical.g:1280:1: rule__Preference__Group__0__Impl : ( 'preference' ) ;
    public final void rule__Preference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:1284:1: ( ( 'preference' ) )
            // InternalLogical.g:1285:1: ( 'preference' )
            {
            // InternalLogical.g:1285:1: ( 'preference' )
            // InternalLogical.g:1286:1: 'preference'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreferenceAccess().getPreferenceKeyword_0()); 
            }
            match(input,30,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPreferenceAccess().getPreferenceKeyword_0()); 
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
    // $ANTLR end "rule__Preference__Group__0__Impl"


    // $ANTLR start "rule__Preference__Group__1"
    // InternalLogical.g:1299:1: rule__Preference__Group__1 : rule__Preference__Group__1__Impl rule__Preference__Group__2 ;
    public final void rule__Preference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:1303:1: ( rule__Preference__Group__1__Impl rule__Preference__Group__2 )
            // InternalLogical.g:1304:2: rule__Preference__Group__1__Impl rule__Preference__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__Preference__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Preference__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preference__Group__1"


    // $ANTLR start "rule__Preference__Group__1__Impl"
    // InternalLogical.g:1311:1: rule__Preference__Group__1__Impl : ( ( rule__Preference__NameAssignment_1 ) ) ;
    public final void rule__Preference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:1315:1: ( ( ( rule__Preference__NameAssignment_1 ) ) )
            // InternalLogical.g:1316:1: ( ( rule__Preference__NameAssignment_1 ) )
            {
            // InternalLogical.g:1316:1: ( ( rule__Preference__NameAssignment_1 ) )
            // InternalLogical.g:1317:1: ( rule__Preference__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreferenceAccess().getNameAssignment_1()); 
            }
            // InternalLogical.g:1318:1: ( rule__Preference__NameAssignment_1 )
            // InternalLogical.g:1318:2: rule__Preference__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Preference__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPreferenceAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__Preference__Group__1__Impl"


    // $ANTLR start "rule__Preference__Group__2"
    // InternalLogical.g:1328:1: rule__Preference__Group__2 : rule__Preference__Group__2__Impl rule__Preference__Group__3 ;
    public final void rule__Preference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:1332:1: ( rule__Preference__Group__2__Impl rule__Preference__Group__3 )
            // InternalLogical.g:1333:2: rule__Preference__Group__2__Impl rule__Preference__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__Preference__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Preference__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preference__Group__2"


    // $ANTLR start "rule__Preference__Group__2__Impl"
    // InternalLogical.g:1340:1: rule__Preference__Group__2__Impl : ( 'for' ) ;
    public final void rule__Preference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:1344:1: ( ( 'for' ) )
            // InternalLogical.g:1345:1: ( 'for' )
            {
            // InternalLogical.g:1345:1: ( 'for' )
            // InternalLogical.g:1346:1: 'for'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreferenceAccess().getForKeyword_2()); 
            }
            match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPreferenceAccess().getForKeyword_2()); 
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
    // $ANTLR end "rule__Preference__Group__2__Impl"


    // $ANTLR start "rule__Preference__Group__3"
    // InternalLogical.g:1359:1: rule__Preference__Group__3 : rule__Preference__Group__3__Impl rule__Preference__Group__4 ;
    public final void rule__Preference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:1363:1: ( rule__Preference__Group__3__Impl rule__Preference__Group__4 )
            // InternalLogical.g:1364:2: rule__Preference__Group__3__Impl rule__Preference__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__Preference__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Preference__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preference__Group__3"


    // $ANTLR start "rule__Preference__Group__3__Impl"
    // InternalLogical.g:1371:1: rule__Preference__Group__3__Impl : ( ( rule__Preference__OptionAssignment_3 ) ) ;
    public final void rule__Preference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:1375:1: ( ( ( rule__Preference__OptionAssignment_3 ) ) )
            // InternalLogical.g:1376:1: ( ( rule__Preference__OptionAssignment_3 ) )
            {
            // InternalLogical.g:1376:1: ( ( rule__Preference__OptionAssignment_3 ) )
            // InternalLogical.g:1377:1: ( rule__Preference__OptionAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreferenceAccess().getOptionAssignment_3()); 
            }
            // InternalLogical.g:1378:1: ( rule__Preference__OptionAssignment_3 )
            // InternalLogical.g:1378:2: rule__Preference__OptionAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Preference__OptionAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPreferenceAccess().getOptionAssignment_3()); 
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
    // $ANTLR end "rule__Preference__Group__3__Impl"


    // $ANTLR start "rule__Preference__Group__4"
    // InternalLogical.g:1388:1: rule__Preference__Group__4 : rule__Preference__Group__4__Impl rule__Preference__Group__5 ;
    public final void rule__Preference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:1392:1: ( rule__Preference__Group__4__Impl rule__Preference__Group__5 )
            // InternalLogical.g:1393:2: rule__Preference__Group__4__Impl rule__Preference__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__Preference__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Preference__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preference__Group__4"


    // $ANTLR start "rule__Preference__Group__4__Impl"
    // InternalLogical.g:1400:1: rule__Preference__Group__4__Impl : ( '{' ) ;
    public final void rule__Preference__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:1404:1: ( ( '{' ) )
            // InternalLogical.g:1405:1: ( '{' )
            {
            // InternalLogical.g:1405:1: ( '{' )
            // InternalLogical.g:1406:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreferenceAccess().getLeftCurlyBracketKeyword_4()); 
            }
            match(input,26,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPreferenceAccess().getLeftCurlyBracketKeyword_4()); 
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
    // $ANTLR end "rule__Preference__Group__4__Impl"


    // $ANTLR start "rule__Preference__Group__5"
    // InternalLogical.g:1419:1: rule__Preference__Group__5 : rule__Preference__Group__5__Impl rule__Preference__Group__6 ;
    public final void rule__Preference__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:1423:1: ( rule__Preference__Group__5__Impl rule__Preference__Group__6 )
            // InternalLogical.g:1424:2: rule__Preference__Group__5__Impl rule__Preference__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__Preference__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Preference__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preference__Group__5"


    // $ANTLR start "rule__Preference__Group__5__Impl"
    // InternalLogical.g:1431:1: rule__Preference__Group__5__Impl : ( ( rule__Preference__OptionExprAssignment_5 ) ) ;
    public final void rule__Preference__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:1435:1: ( ( ( rule__Preference__OptionExprAssignment_5 ) ) )
            // InternalLogical.g:1436:1: ( ( rule__Preference__OptionExprAssignment_5 ) )
            {
            // InternalLogical.g:1436:1: ( ( rule__Preference__OptionExprAssignment_5 ) )
            // InternalLogical.g:1437:1: ( rule__Preference__OptionExprAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreferenceAccess().getOptionExprAssignment_5()); 
            }
            // InternalLogical.g:1438:1: ( rule__Preference__OptionExprAssignment_5 )
            // InternalLogical.g:1438:2: rule__Preference__OptionExprAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Preference__OptionExprAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPreferenceAccess().getOptionExprAssignment_5()); 
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
    // $ANTLR end "rule__Preference__Group__5__Impl"


    // $ANTLR start "rule__Preference__Group__6"
    // InternalLogical.g:1448:1: rule__Preference__Group__6 : rule__Preference__Group__6__Impl ;
    public final void rule__Preference__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:1452:1: ( rule__Preference__Group__6__Impl )
            // InternalLogical.g:1453:2: rule__Preference__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Preference__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Preference__Group__6"


    // $ANTLR start "rule__Preference__Group__6__Impl"
    // InternalLogical.g:1459:1: rule__Preference__Group__6__Impl : ( '}' ) ;
    public final void rule__Preference__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:1463:1: ( ( '}' ) )
            // InternalLogical.g:1464:1: ( '}' )
            {
            // InternalLogical.g:1464:1: ( '}' )
            // InternalLogical.g:1465:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreferenceAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,27,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPreferenceAccess().getRightCurlyBracketKeyword_6()); 
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
    // $ANTLR end "rule__Preference__Group__6__Impl"


    // $ANTLR start "rule__DefaultBinding__Group__0"
    // InternalLogical.g:1492:1: rule__DefaultBinding__Group__0 : rule__DefaultBinding__Group__0__Impl rule__DefaultBinding__Group__1 ;
    public final void rule__DefaultBinding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:1496:1: ( rule__DefaultBinding__Group__0__Impl rule__DefaultBinding__Group__1 )
            // InternalLogical.g:1497:2: rule__DefaultBinding__Group__0__Impl rule__DefaultBinding__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_12);
            rule__DefaultBinding__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DefaultBinding__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultBinding__Group__0"


    // $ANTLR start "rule__DefaultBinding__Group__0__Impl"
    // InternalLogical.g:1504:1: rule__DefaultBinding__Group__0__Impl : ( 'default' ) ;
    public final void rule__DefaultBinding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:1508:1: ( ( 'default' ) )
            // InternalLogical.g:1509:1: ( 'default' )
            {
            // InternalLogical.g:1509:1: ( 'default' )
            // InternalLogical.g:1510:1: 'default'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultBindingAccess().getDefaultKeyword_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefaultBindingAccess().getDefaultKeyword_0()); 
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
    // $ANTLR end "rule__DefaultBinding__Group__0__Impl"


    // $ANTLR start "rule__DefaultBinding__Group__1"
    // InternalLogical.g:1523:1: rule__DefaultBinding__Group__1 : rule__DefaultBinding__Group__1__Impl rule__DefaultBinding__Group__2 ;
    public final void rule__DefaultBinding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:1527:1: ( rule__DefaultBinding__Group__1__Impl rule__DefaultBinding__Group__2 )
            // InternalLogical.g:1528:2: rule__DefaultBinding__Group__1__Impl rule__DefaultBinding__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__DefaultBinding__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DefaultBinding__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultBinding__Group__1"


    // $ANTLR start "rule__DefaultBinding__Group__1__Impl"
    // InternalLogical.g:1535:1: rule__DefaultBinding__Group__1__Impl : ( 'binding' ) ;
    public final void rule__DefaultBinding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:1539:1: ( ( 'binding' ) )
            // InternalLogical.g:1540:1: ( 'binding' )
            {
            // InternalLogical.g:1540:1: ( 'binding' )
            // InternalLogical.g:1541:1: 'binding'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultBindingAccess().getBindingKeyword_1()); 
            }
            match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefaultBindingAccess().getBindingKeyword_1()); 
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
    // $ANTLR end "rule__DefaultBinding__Group__1__Impl"


    // $ANTLR start "rule__DefaultBinding__Group__2"
    // InternalLogical.g:1554:1: rule__DefaultBinding__Group__2 : rule__DefaultBinding__Group__2__Impl rule__DefaultBinding__Group__3 ;
    public final void rule__DefaultBinding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:1558:1: ( rule__DefaultBinding__Group__2__Impl rule__DefaultBinding__Group__3 )
            // InternalLogical.g:1559:2: rule__DefaultBinding__Group__2__Impl rule__DefaultBinding__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__DefaultBinding__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DefaultBinding__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultBinding__Group__2"


    // $ANTLR start "rule__DefaultBinding__Group__2__Impl"
    // InternalLogical.g:1566:1: rule__DefaultBinding__Group__2__Impl : ( ( rule__DefaultBinding__NameAssignment_2 ) ) ;
    public final void rule__DefaultBinding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:1570:1: ( ( ( rule__DefaultBinding__NameAssignment_2 ) ) )
            // InternalLogical.g:1571:1: ( ( rule__DefaultBinding__NameAssignment_2 ) )
            {
            // InternalLogical.g:1571:1: ( ( rule__DefaultBinding__NameAssignment_2 ) )
            // InternalLogical.g:1572:1: ( rule__DefaultBinding__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultBindingAccess().getNameAssignment_2()); 
            }
            // InternalLogical.g:1573:1: ( rule__DefaultBinding__NameAssignment_2 )
            // InternalLogical.g:1573:2: rule__DefaultBinding__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DefaultBinding__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefaultBindingAccess().getNameAssignment_2()); 
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
    // $ANTLR end "rule__DefaultBinding__Group__2__Impl"


    // $ANTLR start "rule__DefaultBinding__Group__3"
    // InternalLogical.g:1583:1: rule__DefaultBinding__Group__3 : rule__DefaultBinding__Group__3__Impl rule__DefaultBinding__Group__4 ;
    public final void rule__DefaultBinding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:1587:1: ( rule__DefaultBinding__Group__3__Impl rule__DefaultBinding__Group__4 )
            // InternalLogical.g:1588:2: rule__DefaultBinding__Group__3__Impl rule__DefaultBinding__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_5);
            rule__DefaultBinding__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DefaultBinding__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultBinding__Group__3"


    // $ANTLR start "rule__DefaultBinding__Group__3__Impl"
    // InternalLogical.g:1595:1: rule__DefaultBinding__Group__3__Impl : ( 'for' ) ;
    public final void rule__DefaultBinding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:1599:1: ( ( 'for' ) )
            // InternalLogical.g:1600:1: ( 'for' )
            {
            // InternalLogical.g:1600:1: ( 'for' )
            // InternalLogical.g:1601:1: 'for'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultBindingAccess().getForKeyword_3()); 
            }
            match(input,31,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefaultBindingAccess().getForKeyword_3()); 
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
    // $ANTLR end "rule__DefaultBinding__Group__3__Impl"


    // $ANTLR start "rule__DefaultBinding__Group__4"
    // InternalLogical.g:1614:1: rule__DefaultBinding__Group__4 : rule__DefaultBinding__Group__4__Impl rule__DefaultBinding__Group__5 ;
    public final void rule__DefaultBinding__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:1618:1: ( rule__DefaultBinding__Group__4__Impl rule__DefaultBinding__Group__5 )
            // InternalLogical.g:1619:2: rule__DefaultBinding__Group__4__Impl rule__DefaultBinding__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__DefaultBinding__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DefaultBinding__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultBinding__Group__4"


    // $ANTLR start "rule__DefaultBinding__Group__4__Impl"
    // InternalLogical.g:1626:1: rule__DefaultBinding__Group__4__Impl : ( ( rule__DefaultBinding__OptionAssignment_4 ) ) ;
    public final void rule__DefaultBinding__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:1630:1: ( ( ( rule__DefaultBinding__OptionAssignment_4 ) ) )
            // InternalLogical.g:1631:1: ( ( rule__DefaultBinding__OptionAssignment_4 ) )
            {
            // InternalLogical.g:1631:1: ( ( rule__DefaultBinding__OptionAssignment_4 ) )
            // InternalLogical.g:1632:1: ( rule__DefaultBinding__OptionAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultBindingAccess().getOptionAssignment_4()); 
            }
            // InternalLogical.g:1633:1: ( rule__DefaultBinding__OptionAssignment_4 )
            // InternalLogical.g:1633:2: rule__DefaultBinding__OptionAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DefaultBinding__OptionAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefaultBindingAccess().getOptionAssignment_4()); 
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
    // $ANTLR end "rule__DefaultBinding__Group__4__Impl"


    // $ANTLR start "rule__DefaultBinding__Group__5"
    // InternalLogical.g:1643:1: rule__DefaultBinding__Group__5 : rule__DefaultBinding__Group__5__Impl rule__DefaultBinding__Group__6 ;
    public final void rule__DefaultBinding__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:1647:1: ( rule__DefaultBinding__Group__5__Impl rule__DefaultBinding__Group__6 )
            // InternalLogical.g:1648:2: rule__DefaultBinding__Group__5__Impl rule__DefaultBinding__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__DefaultBinding__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DefaultBinding__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultBinding__Group__5"


    // $ANTLR start "rule__DefaultBinding__Group__5__Impl"
    // InternalLogical.g:1655:1: rule__DefaultBinding__Group__5__Impl : ( '=' ) ;
    public final void rule__DefaultBinding__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:1659:1: ( ( '=' ) )
            // InternalLogical.g:1660:1: ( '=' )
            {
            // InternalLogical.g:1660:1: ( '=' )
            // InternalLogical.g:1661:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultBindingAccess().getEqualsSignKeyword_5()); 
            }
            match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefaultBindingAccess().getEqualsSignKeyword_5()); 
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
    // $ANTLR end "rule__DefaultBinding__Group__5__Impl"


    // $ANTLR start "rule__DefaultBinding__Group__6"
    // InternalLogical.g:1674:1: rule__DefaultBinding__Group__6 : rule__DefaultBinding__Group__6__Impl ;
    public final void rule__DefaultBinding__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:1678:1: ( rule__DefaultBinding__Group__6__Impl )
            // InternalLogical.g:1679:2: rule__DefaultBinding__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DefaultBinding__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultBinding__Group__6"


    // $ANTLR start "rule__DefaultBinding__Group__6__Impl"
    // InternalLogical.g:1685:1: rule__DefaultBinding__Group__6__Impl : ( ( rule__DefaultBinding__StateAssignment_6 ) ) ;
    public final void rule__DefaultBinding__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:1689:1: ( ( ( rule__DefaultBinding__StateAssignment_6 ) ) )
            // InternalLogical.g:1690:1: ( ( rule__DefaultBinding__StateAssignment_6 ) )
            {
            // InternalLogical.g:1690:1: ( ( rule__DefaultBinding__StateAssignment_6 ) )
            // InternalLogical.g:1691:1: ( rule__DefaultBinding__StateAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultBindingAccess().getStateAssignment_6()); 
            }
            // InternalLogical.g:1692:1: ( rule__DefaultBinding__StateAssignment_6 )
            // InternalLogical.g:1692:2: rule__DefaultBinding__StateAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DefaultBinding__StateAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefaultBindingAccess().getStateAssignment_6()); 
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
    // $ANTLR end "rule__DefaultBinding__Group__6__Impl"


    // $ANTLR start "rule__BiconditionalExpr__Group__0"
    // InternalLogical.g:1716:1: rule__BiconditionalExpr__Group__0 : rule__BiconditionalExpr__Group__0__Impl rule__BiconditionalExpr__Group__1 ;
    public final void rule__BiconditionalExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:1720:1: ( rule__BiconditionalExpr__Group__0__Impl rule__BiconditionalExpr__Group__1 )
            // InternalLogical.g:1721:2: rule__BiconditionalExpr__Group__0__Impl rule__BiconditionalExpr__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__BiconditionalExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BiconditionalExpr__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BiconditionalExpr__Group__0"


    // $ANTLR start "rule__BiconditionalExpr__Group__0__Impl"
    // InternalLogical.g:1728:1: rule__BiconditionalExpr__Group__0__Impl : ( ruleImpliesExpr ) ;
    public final void rule__BiconditionalExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:1732:1: ( ( ruleImpliesExpr ) )
            // InternalLogical.g:1733:1: ( ruleImpliesExpr )
            {
            // InternalLogical.g:1733:1: ( ruleImpliesExpr )
            // InternalLogical.g:1734:1: ruleImpliesExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBiconditionalExprAccess().getImpliesExprParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleImpliesExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBiconditionalExprAccess().getImpliesExprParserRuleCall_0()); 
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
    // $ANTLR end "rule__BiconditionalExpr__Group__0__Impl"


    // $ANTLR start "rule__BiconditionalExpr__Group__1"
    // InternalLogical.g:1745:1: rule__BiconditionalExpr__Group__1 : rule__BiconditionalExpr__Group__1__Impl ;
    public final void rule__BiconditionalExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:1749:1: ( rule__BiconditionalExpr__Group__1__Impl )
            // InternalLogical.g:1750:2: rule__BiconditionalExpr__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BiconditionalExpr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BiconditionalExpr__Group__1"


    // $ANTLR start "rule__BiconditionalExpr__Group__1__Impl"
    // InternalLogical.g:1756:1: rule__BiconditionalExpr__Group__1__Impl : ( ( rule__BiconditionalExpr__Group_1__0 )* ) ;
    public final void rule__BiconditionalExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:1760:1: ( ( ( rule__BiconditionalExpr__Group_1__0 )* ) )
            // InternalLogical.g:1761:1: ( ( rule__BiconditionalExpr__Group_1__0 )* )
            {
            // InternalLogical.g:1761:1: ( ( rule__BiconditionalExpr__Group_1__0 )* )
            // InternalLogical.g:1762:1: ( rule__BiconditionalExpr__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBiconditionalExprAccess().getGroup_1()); 
            }
            // InternalLogical.g:1763:1: ( rule__BiconditionalExpr__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_K_IFF) ) {
                    int LA7_2 = input.LA(2);

                    if ( (synpred13_InternalLogical()) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // InternalLogical.g:1763:2: rule__BiconditionalExpr__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_16);
            	    rule__BiconditionalExpr__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBiconditionalExprAccess().getGroup_1()); 
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
    // $ANTLR end "rule__BiconditionalExpr__Group__1__Impl"


    // $ANTLR start "rule__BiconditionalExpr__Group_1__0"
    // InternalLogical.g:1777:1: rule__BiconditionalExpr__Group_1__0 : rule__BiconditionalExpr__Group_1__0__Impl rule__BiconditionalExpr__Group_1__1 ;
    public final void rule__BiconditionalExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:1781:1: ( rule__BiconditionalExpr__Group_1__0__Impl rule__BiconditionalExpr__Group_1__1 )
            // InternalLogical.g:1782:2: rule__BiconditionalExpr__Group_1__0__Impl rule__BiconditionalExpr__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__BiconditionalExpr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BiconditionalExpr__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BiconditionalExpr__Group_1__0"


    // $ANTLR start "rule__BiconditionalExpr__Group_1__0__Impl"
    // InternalLogical.g:1789:1: rule__BiconditionalExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__BiconditionalExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:1793:1: ( ( () ) )
            // InternalLogical.g:1794:1: ( () )
            {
            // InternalLogical.g:1794:1: ( () )
            // InternalLogical.g:1795:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBiconditionalExprAccess().getBiconditionalExprLeftAction_1_0()); 
            }
            // InternalLogical.g:1796:1: ()
            // InternalLogical.g:1798:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBiconditionalExprAccess().getBiconditionalExprLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BiconditionalExpr__Group_1__0__Impl"


    // $ANTLR start "rule__BiconditionalExpr__Group_1__1"
    // InternalLogical.g:1808:1: rule__BiconditionalExpr__Group_1__1 : rule__BiconditionalExpr__Group_1__1__Impl rule__BiconditionalExpr__Group_1__2 ;
    public final void rule__BiconditionalExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:1812:1: ( rule__BiconditionalExpr__Group_1__1__Impl rule__BiconditionalExpr__Group_1__2 )
            // InternalLogical.g:1813:2: rule__BiconditionalExpr__Group_1__1__Impl rule__BiconditionalExpr__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__BiconditionalExpr__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BiconditionalExpr__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BiconditionalExpr__Group_1__1"


    // $ANTLR start "rule__BiconditionalExpr__Group_1__1__Impl"
    // InternalLogical.g:1820:1: rule__BiconditionalExpr__Group_1__1__Impl : ( RULE_K_IFF ) ;
    public final void rule__BiconditionalExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:1824:1: ( ( RULE_K_IFF ) )
            // InternalLogical.g:1825:1: ( RULE_K_IFF )
            {
            // InternalLogical.g:1825:1: ( RULE_K_IFF )
            // InternalLogical.g:1826:1: RULE_K_IFF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBiconditionalExprAccess().getK_IFFTerminalRuleCall_1_1()); 
            }
            match(input,RULE_K_IFF,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBiconditionalExprAccess().getK_IFFTerminalRuleCall_1_1()); 
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
    // $ANTLR end "rule__BiconditionalExpr__Group_1__1__Impl"


    // $ANTLR start "rule__BiconditionalExpr__Group_1__2"
    // InternalLogical.g:1837:1: rule__BiconditionalExpr__Group_1__2 : rule__BiconditionalExpr__Group_1__2__Impl ;
    public final void rule__BiconditionalExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:1841:1: ( rule__BiconditionalExpr__Group_1__2__Impl )
            // InternalLogical.g:1842:2: rule__BiconditionalExpr__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BiconditionalExpr__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BiconditionalExpr__Group_1__2"


    // $ANTLR start "rule__BiconditionalExpr__Group_1__2__Impl"
    // InternalLogical.g:1848:1: rule__BiconditionalExpr__Group_1__2__Impl : ( ( rule__BiconditionalExpr__RightAssignment_1_2 ) ) ;
    public final void rule__BiconditionalExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:1852:1: ( ( ( rule__BiconditionalExpr__RightAssignment_1_2 ) ) )
            // InternalLogical.g:1853:1: ( ( rule__BiconditionalExpr__RightAssignment_1_2 ) )
            {
            // InternalLogical.g:1853:1: ( ( rule__BiconditionalExpr__RightAssignment_1_2 ) )
            // InternalLogical.g:1854:1: ( rule__BiconditionalExpr__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBiconditionalExprAccess().getRightAssignment_1_2()); 
            }
            // InternalLogical.g:1855:1: ( rule__BiconditionalExpr__RightAssignment_1_2 )
            // InternalLogical.g:1855:2: rule__BiconditionalExpr__RightAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BiconditionalExpr__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBiconditionalExprAccess().getRightAssignment_1_2()); 
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
    // $ANTLR end "rule__BiconditionalExpr__Group_1__2__Impl"


    // $ANTLR start "rule__ImpliesExpr__Group__0"
    // InternalLogical.g:1871:1: rule__ImpliesExpr__Group__0 : rule__ImpliesExpr__Group__0__Impl rule__ImpliesExpr__Group__1 ;
    public final void rule__ImpliesExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:1875:1: ( rule__ImpliesExpr__Group__0__Impl rule__ImpliesExpr__Group__1 )
            // InternalLogical.g:1876:2: rule__ImpliesExpr__Group__0__Impl rule__ImpliesExpr__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__ImpliesExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ImpliesExpr__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpr__Group__0"


    // $ANTLR start "rule__ImpliesExpr__Group__0__Impl"
    // InternalLogical.g:1883:1: rule__ImpliesExpr__Group__0__Impl : ( ruleOrExpr ) ;
    public final void rule__ImpliesExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:1887:1: ( ( ruleOrExpr ) )
            // InternalLogical.g:1888:1: ( ruleOrExpr )
            {
            // InternalLogical.g:1888:1: ( ruleOrExpr )
            // InternalLogical.g:1889:1: ruleOrExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesExprAccess().getOrExprParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleOrExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImpliesExprAccess().getOrExprParserRuleCall_0()); 
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
    // $ANTLR end "rule__ImpliesExpr__Group__0__Impl"


    // $ANTLR start "rule__ImpliesExpr__Group__1"
    // InternalLogical.g:1900:1: rule__ImpliesExpr__Group__1 : rule__ImpliesExpr__Group__1__Impl ;
    public final void rule__ImpliesExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:1904:1: ( rule__ImpliesExpr__Group__1__Impl )
            // InternalLogical.g:1905:2: rule__ImpliesExpr__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ImpliesExpr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpr__Group__1"


    // $ANTLR start "rule__ImpliesExpr__Group__1__Impl"
    // InternalLogical.g:1911:1: rule__ImpliesExpr__Group__1__Impl : ( ( rule__ImpliesExpr__Group_1__0 )* ) ;
    public final void rule__ImpliesExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:1915:1: ( ( ( rule__ImpliesExpr__Group_1__0 )* ) )
            // InternalLogical.g:1916:1: ( ( rule__ImpliesExpr__Group_1__0 )* )
            {
            // InternalLogical.g:1916:1: ( ( rule__ImpliesExpr__Group_1__0 )* )
            // InternalLogical.g:1917:1: ( rule__ImpliesExpr__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesExprAccess().getGroup_1()); 
            }
            // InternalLogical.g:1918:1: ( rule__ImpliesExpr__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_K_IMP) ) {
                    int LA8_2 = input.LA(2);

                    if ( (synpred14_InternalLogical()) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // InternalLogical.g:1918:2: rule__ImpliesExpr__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_19);
            	    rule__ImpliesExpr__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImpliesExprAccess().getGroup_1()); 
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
    // $ANTLR end "rule__ImpliesExpr__Group__1__Impl"


    // $ANTLR start "rule__ImpliesExpr__Group_1__0"
    // InternalLogical.g:1932:1: rule__ImpliesExpr__Group_1__0 : rule__ImpliesExpr__Group_1__0__Impl rule__ImpliesExpr__Group_1__1 ;
    public final void rule__ImpliesExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:1936:1: ( rule__ImpliesExpr__Group_1__0__Impl rule__ImpliesExpr__Group_1__1 )
            // InternalLogical.g:1937:2: rule__ImpliesExpr__Group_1__0__Impl rule__ImpliesExpr__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__ImpliesExpr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ImpliesExpr__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpr__Group_1__0"


    // $ANTLR start "rule__ImpliesExpr__Group_1__0__Impl"
    // InternalLogical.g:1944:1: rule__ImpliesExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__ImpliesExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:1948:1: ( ( () ) )
            // InternalLogical.g:1949:1: ( () )
            {
            // InternalLogical.g:1949:1: ( () )
            // InternalLogical.g:1950:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesExprAccess().getImpliesExprLeftAction_1_0()); 
            }
            // InternalLogical.g:1951:1: ()
            // InternalLogical.g:1953:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImpliesExprAccess().getImpliesExprLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpr__Group_1__0__Impl"


    // $ANTLR start "rule__ImpliesExpr__Group_1__1"
    // InternalLogical.g:1963:1: rule__ImpliesExpr__Group_1__1 : rule__ImpliesExpr__Group_1__1__Impl rule__ImpliesExpr__Group_1__2 ;
    public final void rule__ImpliesExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:1967:1: ( rule__ImpliesExpr__Group_1__1__Impl rule__ImpliesExpr__Group_1__2 )
            // InternalLogical.g:1968:2: rule__ImpliesExpr__Group_1__1__Impl rule__ImpliesExpr__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__ImpliesExpr__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ImpliesExpr__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpr__Group_1__1"


    // $ANTLR start "rule__ImpliesExpr__Group_1__1__Impl"
    // InternalLogical.g:1975:1: rule__ImpliesExpr__Group_1__1__Impl : ( RULE_K_IMP ) ;
    public final void rule__ImpliesExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:1979:1: ( ( RULE_K_IMP ) )
            // InternalLogical.g:1980:1: ( RULE_K_IMP )
            {
            // InternalLogical.g:1980:1: ( RULE_K_IMP )
            // InternalLogical.g:1981:1: RULE_K_IMP
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesExprAccess().getK_IMPTerminalRuleCall_1_1()); 
            }
            match(input,RULE_K_IMP,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImpliesExprAccess().getK_IMPTerminalRuleCall_1_1()); 
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
    // $ANTLR end "rule__ImpliesExpr__Group_1__1__Impl"


    // $ANTLR start "rule__ImpliesExpr__Group_1__2"
    // InternalLogical.g:1992:1: rule__ImpliesExpr__Group_1__2 : rule__ImpliesExpr__Group_1__2__Impl ;
    public final void rule__ImpliesExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:1996:1: ( rule__ImpliesExpr__Group_1__2__Impl )
            // InternalLogical.g:1997:2: rule__ImpliesExpr__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ImpliesExpr__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImpliesExpr__Group_1__2"


    // $ANTLR start "rule__ImpliesExpr__Group_1__2__Impl"
    // InternalLogical.g:2003:1: rule__ImpliesExpr__Group_1__2__Impl : ( ( rule__ImpliesExpr__RightAssignment_1_2 ) ) ;
    public final void rule__ImpliesExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2007:1: ( ( ( rule__ImpliesExpr__RightAssignment_1_2 ) ) )
            // InternalLogical.g:2008:1: ( ( rule__ImpliesExpr__RightAssignment_1_2 ) )
            {
            // InternalLogical.g:2008:1: ( ( rule__ImpliesExpr__RightAssignment_1_2 ) )
            // InternalLogical.g:2009:1: ( rule__ImpliesExpr__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesExprAccess().getRightAssignment_1_2()); 
            }
            // InternalLogical.g:2010:1: ( rule__ImpliesExpr__RightAssignment_1_2 )
            // InternalLogical.g:2010:2: rule__ImpliesExpr__RightAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ImpliesExpr__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImpliesExprAccess().getRightAssignment_1_2()); 
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
    // $ANTLR end "rule__ImpliesExpr__Group_1__2__Impl"


    // $ANTLR start "rule__OrExpr__Group__0"
    // InternalLogical.g:2026:1: rule__OrExpr__Group__0 : rule__OrExpr__Group__0__Impl rule__OrExpr__Group__1 ;
    public final void rule__OrExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2030:1: ( rule__OrExpr__Group__0__Impl rule__OrExpr__Group__1 )
            // InternalLogical.g:2031:2: rule__OrExpr__Group__0__Impl rule__OrExpr__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__OrExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OrExpr__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpr__Group__0"


    // $ANTLR start "rule__OrExpr__Group__0__Impl"
    // InternalLogical.g:2038:1: rule__OrExpr__Group__0__Impl : ( ruleXorExpr ) ;
    public final void rule__OrExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2042:1: ( ( ruleXorExpr ) )
            // InternalLogical.g:2043:1: ( ruleXorExpr )
            {
            // InternalLogical.g:2043:1: ( ruleXorExpr )
            // InternalLogical.g:2044:1: ruleXorExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExprAccess().getXorExprParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleXorExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExprAccess().getXorExprParserRuleCall_0()); 
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
    // $ANTLR end "rule__OrExpr__Group__0__Impl"


    // $ANTLR start "rule__OrExpr__Group__1"
    // InternalLogical.g:2055:1: rule__OrExpr__Group__1 : rule__OrExpr__Group__1__Impl ;
    public final void rule__OrExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2059:1: ( rule__OrExpr__Group__1__Impl )
            // InternalLogical.g:2060:2: rule__OrExpr__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OrExpr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpr__Group__1"


    // $ANTLR start "rule__OrExpr__Group__1__Impl"
    // InternalLogical.g:2066:1: rule__OrExpr__Group__1__Impl : ( ( rule__OrExpr__Group_1__0 )* ) ;
    public final void rule__OrExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2070:1: ( ( ( rule__OrExpr__Group_1__0 )* ) )
            // InternalLogical.g:2071:1: ( ( rule__OrExpr__Group_1__0 )* )
            {
            // InternalLogical.g:2071:1: ( ( rule__OrExpr__Group_1__0 )* )
            // InternalLogical.g:2072:1: ( rule__OrExpr__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExprAccess().getGroup_1()); 
            }
            // InternalLogical.g:2073:1: ( rule__OrExpr__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_K_OR) ) {
                    int LA9_2 = input.LA(2);

                    if ( (synpred15_InternalLogical()) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // InternalLogical.g:2073:2: rule__OrExpr__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_21);
            	    rule__OrExpr__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExprAccess().getGroup_1()); 
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
    // $ANTLR end "rule__OrExpr__Group__1__Impl"


    // $ANTLR start "rule__OrExpr__Group_1__0"
    // InternalLogical.g:2087:1: rule__OrExpr__Group_1__0 : rule__OrExpr__Group_1__0__Impl rule__OrExpr__Group_1__1 ;
    public final void rule__OrExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2091:1: ( rule__OrExpr__Group_1__0__Impl rule__OrExpr__Group_1__1 )
            // InternalLogical.g:2092:2: rule__OrExpr__Group_1__0__Impl rule__OrExpr__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__OrExpr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OrExpr__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpr__Group_1__0"


    // $ANTLR start "rule__OrExpr__Group_1__0__Impl"
    // InternalLogical.g:2099:1: rule__OrExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__OrExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2103:1: ( ( () ) )
            // InternalLogical.g:2104:1: ( () )
            {
            // InternalLogical.g:2104:1: ( () )
            // InternalLogical.g:2105:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExprAccess().getOrExprLeftAction_1_0()); 
            }
            // InternalLogical.g:2106:1: ()
            // InternalLogical.g:2108:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExprAccess().getOrExprLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpr__Group_1__0__Impl"


    // $ANTLR start "rule__OrExpr__Group_1__1"
    // InternalLogical.g:2118:1: rule__OrExpr__Group_1__1 : rule__OrExpr__Group_1__1__Impl rule__OrExpr__Group_1__2 ;
    public final void rule__OrExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2122:1: ( rule__OrExpr__Group_1__1__Impl rule__OrExpr__Group_1__2 )
            // InternalLogical.g:2123:2: rule__OrExpr__Group_1__1__Impl rule__OrExpr__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__OrExpr__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OrExpr__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpr__Group_1__1"


    // $ANTLR start "rule__OrExpr__Group_1__1__Impl"
    // InternalLogical.g:2130:1: rule__OrExpr__Group_1__1__Impl : ( RULE_K_OR ) ;
    public final void rule__OrExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2134:1: ( ( RULE_K_OR ) )
            // InternalLogical.g:2135:1: ( RULE_K_OR )
            {
            // InternalLogical.g:2135:1: ( RULE_K_OR )
            // InternalLogical.g:2136:1: RULE_K_OR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExprAccess().getK_ORTerminalRuleCall_1_1()); 
            }
            match(input,RULE_K_OR,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExprAccess().getK_ORTerminalRuleCall_1_1()); 
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
    // $ANTLR end "rule__OrExpr__Group_1__1__Impl"


    // $ANTLR start "rule__OrExpr__Group_1__2"
    // InternalLogical.g:2147:1: rule__OrExpr__Group_1__2 : rule__OrExpr__Group_1__2__Impl ;
    public final void rule__OrExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2151:1: ( rule__OrExpr__Group_1__2__Impl )
            // InternalLogical.g:2152:2: rule__OrExpr__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OrExpr__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpr__Group_1__2"


    // $ANTLR start "rule__OrExpr__Group_1__2__Impl"
    // InternalLogical.g:2158:1: rule__OrExpr__Group_1__2__Impl : ( ( rule__OrExpr__RightAssignment_1_2 ) ) ;
    public final void rule__OrExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2162:1: ( ( ( rule__OrExpr__RightAssignment_1_2 ) ) )
            // InternalLogical.g:2163:1: ( ( rule__OrExpr__RightAssignment_1_2 ) )
            {
            // InternalLogical.g:2163:1: ( ( rule__OrExpr__RightAssignment_1_2 ) )
            // InternalLogical.g:2164:1: ( rule__OrExpr__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExprAccess().getRightAssignment_1_2()); 
            }
            // InternalLogical.g:2165:1: ( rule__OrExpr__RightAssignment_1_2 )
            // InternalLogical.g:2165:2: rule__OrExpr__RightAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OrExpr__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExprAccess().getRightAssignment_1_2()); 
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
    // $ANTLR end "rule__OrExpr__Group_1__2__Impl"


    // $ANTLR start "rule__XorExpr__Group__0"
    // InternalLogical.g:2181:1: rule__XorExpr__Group__0 : rule__XorExpr__Group__0__Impl rule__XorExpr__Group__1 ;
    public final void rule__XorExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2185:1: ( rule__XorExpr__Group__0__Impl rule__XorExpr__Group__1 )
            // InternalLogical.g:2186:2: rule__XorExpr__Group__0__Impl rule__XorExpr__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__XorExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XorExpr__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpr__Group__0"


    // $ANTLR start "rule__XorExpr__Group__0__Impl"
    // InternalLogical.g:2193:1: rule__XorExpr__Group__0__Impl : ( ruleMinusExpr ) ;
    public final void rule__XorExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2197:1: ( ( ruleMinusExpr ) )
            // InternalLogical.g:2198:1: ( ruleMinusExpr )
            {
            // InternalLogical.g:2198:1: ( ruleMinusExpr )
            // InternalLogical.g:2199:1: ruleMinusExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExprAccess().getMinusExprParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMinusExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXorExprAccess().getMinusExprParserRuleCall_0()); 
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
    // $ANTLR end "rule__XorExpr__Group__0__Impl"


    // $ANTLR start "rule__XorExpr__Group__1"
    // InternalLogical.g:2210:1: rule__XorExpr__Group__1 : rule__XorExpr__Group__1__Impl ;
    public final void rule__XorExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2214:1: ( rule__XorExpr__Group__1__Impl )
            // InternalLogical.g:2215:2: rule__XorExpr__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XorExpr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpr__Group__1"


    // $ANTLR start "rule__XorExpr__Group__1__Impl"
    // InternalLogical.g:2221:1: rule__XorExpr__Group__1__Impl : ( ( rule__XorExpr__Group_1__0 )* ) ;
    public final void rule__XorExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2225:1: ( ( ( rule__XorExpr__Group_1__0 )* ) )
            // InternalLogical.g:2226:1: ( ( rule__XorExpr__Group_1__0 )* )
            {
            // InternalLogical.g:2226:1: ( ( rule__XorExpr__Group_1__0 )* )
            // InternalLogical.g:2227:1: ( rule__XorExpr__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExprAccess().getGroup_1()); 
            }
            // InternalLogical.g:2228:1: ( rule__XorExpr__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_K_XOR) ) {
                    int LA10_2 = input.LA(2);

                    if ( (synpred16_InternalLogical()) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // InternalLogical.g:2228:2: rule__XorExpr__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_23);
            	    rule__XorExpr__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXorExprAccess().getGroup_1()); 
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
    // $ANTLR end "rule__XorExpr__Group__1__Impl"


    // $ANTLR start "rule__XorExpr__Group_1__0"
    // InternalLogical.g:2242:1: rule__XorExpr__Group_1__0 : rule__XorExpr__Group_1__0__Impl rule__XorExpr__Group_1__1 ;
    public final void rule__XorExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2246:1: ( rule__XorExpr__Group_1__0__Impl rule__XorExpr__Group_1__1 )
            // InternalLogical.g:2247:2: rule__XorExpr__Group_1__0__Impl rule__XorExpr__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__XorExpr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XorExpr__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpr__Group_1__0"


    // $ANTLR start "rule__XorExpr__Group_1__0__Impl"
    // InternalLogical.g:2254:1: rule__XorExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__XorExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2258:1: ( ( () ) )
            // InternalLogical.g:2259:1: ( () )
            {
            // InternalLogical.g:2259:1: ( () )
            // InternalLogical.g:2260:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExprAccess().getXorExprLeftAction_1_0()); 
            }
            // InternalLogical.g:2261:1: ()
            // InternalLogical.g:2263:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXorExprAccess().getXorExprLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpr__Group_1__0__Impl"


    // $ANTLR start "rule__XorExpr__Group_1__1"
    // InternalLogical.g:2273:1: rule__XorExpr__Group_1__1 : rule__XorExpr__Group_1__1__Impl rule__XorExpr__Group_1__2 ;
    public final void rule__XorExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2277:1: ( rule__XorExpr__Group_1__1__Impl rule__XorExpr__Group_1__2 )
            // InternalLogical.g:2278:2: rule__XorExpr__Group_1__1__Impl rule__XorExpr__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__XorExpr__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XorExpr__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpr__Group_1__1"


    // $ANTLR start "rule__XorExpr__Group_1__1__Impl"
    // InternalLogical.g:2285:1: rule__XorExpr__Group_1__1__Impl : ( RULE_K_XOR ) ;
    public final void rule__XorExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2289:1: ( ( RULE_K_XOR ) )
            // InternalLogical.g:2290:1: ( RULE_K_XOR )
            {
            // InternalLogical.g:2290:1: ( RULE_K_XOR )
            // InternalLogical.g:2291:1: RULE_K_XOR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExprAccess().getK_XORTerminalRuleCall_1_1()); 
            }
            match(input,RULE_K_XOR,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXorExprAccess().getK_XORTerminalRuleCall_1_1()); 
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
    // $ANTLR end "rule__XorExpr__Group_1__1__Impl"


    // $ANTLR start "rule__XorExpr__Group_1__2"
    // InternalLogical.g:2302:1: rule__XorExpr__Group_1__2 : rule__XorExpr__Group_1__2__Impl ;
    public final void rule__XorExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2306:1: ( rule__XorExpr__Group_1__2__Impl )
            // InternalLogical.g:2307:2: rule__XorExpr__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XorExpr__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XorExpr__Group_1__2"


    // $ANTLR start "rule__XorExpr__Group_1__2__Impl"
    // InternalLogical.g:2313:1: rule__XorExpr__Group_1__2__Impl : ( ( rule__XorExpr__RightAssignment_1_2 ) ) ;
    public final void rule__XorExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2317:1: ( ( ( rule__XorExpr__RightAssignment_1_2 ) ) )
            // InternalLogical.g:2318:1: ( ( rule__XorExpr__RightAssignment_1_2 ) )
            {
            // InternalLogical.g:2318:1: ( ( rule__XorExpr__RightAssignment_1_2 ) )
            // InternalLogical.g:2319:1: ( rule__XorExpr__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExprAccess().getRightAssignment_1_2()); 
            }
            // InternalLogical.g:2320:1: ( rule__XorExpr__RightAssignment_1_2 )
            // InternalLogical.g:2320:2: rule__XorExpr__RightAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__XorExpr__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getXorExprAccess().getRightAssignment_1_2()); 
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
    // $ANTLR end "rule__XorExpr__Group_1__2__Impl"


    // $ANTLR start "rule__MinusExpr__Group__0"
    // InternalLogical.g:2336:1: rule__MinusExpr__Group__0 : rule__MinusExpr__Group__0__Impl rule__MinusExpr__Group__1 ;
    public final void rule__MinusExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2340:1: ( rule__MinusExpr__Group__0__Impl rule__MinusExpr__Group__1 )
            // InternalLogical.g:2341:2: rule__MinusExpr__Group__0__Impl rule__MinusExpr__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__MinusExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MinusExpr__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinusExpr__Group__0"


    // $ANTLR start "rule__MinusExpr__Group__0__Impl"
    // InternalLogical.g:2348:1: rule__MinusExpr__Group__0__Impl : ( ruleNandExpr ) ;
    public final void rule__MinusExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2352:1: ( ( ruleNandExpr ) )
            // InternalLogical.g:2353:1: ( ruleNandExpr )
            {
            // InternalLogical.g:2353:1: ( ruleNandExpr )
            // InternalLogical.g:2354:1: ruleNandExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinusExprAccess().getNandExprParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleNandExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinusExprAccess().getNandExprParserRuleCall_0()); 
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
    // $ANTLR end "rule__MinusExpr__Group__0__Impl"


    // $ANTLR start "rule__MinusExpr__Group__1"
    // InternalLogical.g:2365:1: rule__MinusExpr__Group__1 : rule__MinusExpr__Group__1__Impl ;
    public final void rule__MinusExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2369:1: ( rule__MinusExpr__Group__1__Impl )
            // InternalLogical.g:2370:2: rule__MinusExpr__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MinusExpr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinusExpr__Group__1"


    // $ANTLR start "rule__MinusExpr__Group__1__Impl"
    // InternalLogical.g:2376:1: rule__MinusExpr__Group__1__Impl : ( ( rule__MinusExpr__Group_1__0 )* ) ;
    public final void rule__MinusExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2380:1: ( ( ( rule__MinusExpr__Group_1__0 )* ) )
            // InternalLogical.g:2381:1: ( ( rule__MinusExpr__Group_1__0 )* )
            {
            // InternalLogical.g:2381:1: ( ( rule__MinusExpr__Group_1__0 )* )
            // InternalLogical.g:2382:1: ( rule__MinusExpr__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinusExprAccess().getGroup_1()); 
            }
            // InternalLogical.g:2383:1: ( rule__MinusExpr__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_K_MINUS) ) {
                    int LA11_2 = input.LA(2);

                    if ( (synpred17_InternalLogical()) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // InternalLogical.g:2383:2: rule__MinusExpr__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_25);
            	    rule__MinusExpr__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinusExprAccess().getGroup_1()); 
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
    // $ANTLR end "rule__MinusExpr__Group__1__Impl"


    // $ANTLR start "rule__MinusExpr__Group_1__0"
    // InternalLogical.g:2397:1: rule__MinusExpr__Group_1__0 : rule__MinusExpr__Group_1__0__Impl rule__MinusExpr__Group_1__1 ;
    public final void rule__MinusExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2401:1: ( rule__MinusExpr__Group_1__0__Impl rule__MinusExpr__Group_1__1 )
            // InternalLogical.g:2402:2: rule__MinusExpr__Group_1__0__Impl rule__MinusExpr__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__MinusExpr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MinusExpr__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinusExpr__Group_1__0"


    // $ANTLR start "rule__MinusExpr__Group_1__0__Impl"
    // InternalLogical.g:2409:1: rule__MinusExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__MinusExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2413:1: ( ( () ) )
            // InternalLogical.g:2414:1: ( () )
            {
            // InternalLogical.g:2414:1: ( () )
            // InternalLogical.g:2415:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinusExprAccess().getMinusExprLeftAction_1_0()); 
            }
            // InternalLogical.g:2416:1: ()
            // InternalLogical.g:2418:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinusExprAccess().getMinusExprLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinusExpr__Group_1__0__Impl"


    // $ANTLR start "rule__MinusExpr__Group_1__1"
    // InternalLogical.g:2428:1: rule__MinusExpr__Group_1__1 : rule__MinusExpr__Group_1__1__Impl rule__MinusExpr__Group_1__2 ;
    public final void rule__MinusExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2432:1: ( rule__MinusExpr__Group_1__1__Impl rule__MinusExpr__Group_1__2 )
            // InternalLogical.g:2433:2: rule__MinusExpr__Group_1__1__Impl rule__MinusExpr__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__MinusExpr__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MinusExpr__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinusExpr__Group_1__1"


    // $ANTLR start "rule__MinusExpr__Group_1__1__Impl"
    // InternalLogical.g:2440:1: rule__MinusExpr__Group_1__1__Impl : ( RULE_K_MINUS ) ;
    public final void rule__MinusExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2444:1: ( ( RULE_K_MINUS ) )
            // InternalLogical.g:2445:1: ( RULE_K_MINUS )
            {
            // InternalLogical.g:2445:1: ( RULE_K_MINUS )
            // InternalLogical.g:2446:1: RULE_K_MINUS
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinusExprAccess().getK_MINUSTerminalRuleCall_1_1()); 
            }
            match(input,RULE_K_MINUS,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinusExprAccess().getK_MINUSTerminalRuleCall_1_1()); 
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
    // $ANTLR end "rule__MinusExpr__Group_1__1__Impl"


    // $ANTLR start "rule__MinusExpr__Group_1__2"
    // InternalLogical.g:2457:1: rule__MinusExpr__Group_1__2 : rule__MinusExpr__Group_1__2__Impl ;
    public final void rule__MinusExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2461:1: ( rule__MinusExpr__Group_1__2__Impl )
            // InternalLogical.g:2462:2: rule__MinusExpr__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MinusExpr__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MinusExpr__Group_1__2"


    // $ANTLR start "rule__MinusExpr__Group_1__2__Impl"
    // InternalLogical.g:2468:1: rule__MinusExpr__Group_1__2__Impl : ( ( rule__MinusExpr__RightAssignment_1_2 ) ) ;
    public final void rule__MinusExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2472:1: ( ( ( rule__MinusExpr__RightAssignment_1_2 ) ) )
            // InternalLogical.g:2473:1: ( ( rule__MinusExpr__RightAssignment_1_2 ) )
            {
            // InternalLogical.g:2473:1: ( ( rule__MinusExpr__RightAssignment_1_2 ) )
            // InternalLogical.g:2474:1: ( rule__MinusExpr__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinusExprAccess().getRightAssignment_1_2()); 
            }
            // InternalLogical.g:2475:1: ( rule__MinusExpr__RightAssignment_1_2 )
            // InternalLogical.g:2475:2: rule__MinusExpr__RightAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MinusExpr__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinusExprAccess().getRightAssignment_1_2()); 
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
    // $ANTLR end "rule__MinusExpr__Group_1__2__Impl"


    // $ANTLR start "rule__NandExpr__Group__0"
    // InternalLogical.g:2491:1: rule__NandExpr__Group__0 : rule__NandExpr__Group__0__Impl rule__NandExpr__Group__1 ;
    public final void rule__NandExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2495:1: ( rule__NandExpr__Group__0__Impl rule__NandExpr__Group__1 )
            // InternalLogical.g:2496:2: rule__NandExpr__Group__0__Impl rule__NandExpr__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_26);
            rule__NandExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NandExpr__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NandExpr__Group__0"


    // $ANTLR start "rule__NandExpr__Group__0__Impl"
    // InternalLogical.g:2503:1: rule__NandExpr__Group__0__Impl : ( ruleAndExpr ) ;
    public final void rule__NandExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2507:1: ( ( ruleAndExpr ) )
            // InternalLogical.g:2508:1: ( ruleAndExpr )
            {
            // InternalLogical.g:2508:1: ( ruleAndExpr )
            // InternalLogical.g:2509:1: ruleAndExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNandExprAccess().getAndExprParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAndExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNandExprAccess().getAndExprParserRuleCall_0()); 
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
    // $ANTLR end "rule__NandExpr__Group__0__Impl"


    // $ANTLR start "rule__NandExpr__Group__1"
    // InternalLogical.g:2520:1: rule__NandExpr__Group__1 : rule__NandExpr__Group__1__Impl ;
    public final void rule__NandExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2524:1: ( rule__NandExpr__Group__1__Impl )
            // InternalLogical.g:2525:2: rule__NandExpr__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NandExpr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NandExpr__Group__1"


    // $ANTLR start "rule__NandExpr__Group__1__Impl"
    // InternalLogical.g:2531:1: rule__NandExpr__Group__1__Impl : ( ( rule__NandExpr__Group_1__0 )* ) ;
    public final void rule__NandExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2535:1: ( ( ( rule__NandExpr__Group_1__0 )* ) )
            // InternalLogical.g:2536:1: ( ( rule__NandExpr__Group_1__0 )* )
            {
            // InternalLogical.g:2536:1: ( ( rule__NandExpr__Group_1__0 )* )
            // InternalLogical.g:2537:1: ( rule__NandExpr__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNandExprAccess().getGroup_1()); 
            }
            // InternalLogical.g:2538:1: ( rule__NandExpr__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_K_NAND) ) {
                    int LA12_2 = input.LA(2);

                    if ( (synpred18_InternalLogical()) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // InternalLogical.g:2538:2: rule__NandExpr__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_27);
            	    rule__NandExpr__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNandExprAccess().getGroup_1()); 
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
    // $ANTLR end "rule__NandExpr__Group__1__Impl"


    // $ANTLR start "rule__NandExpr__Group_1__0"
    // InternalLogical.g:2552:1: rule__NandExpr__Group_1__0 : rule__NandExpr__Group_1__0__Impl rule__NandExpr__Group_1__1 ;
    public final void rule__NandExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2556:1: ( rule__NandExpr__Group_1__0__Impl rule__NandExpr__Group_1__1 )
            // InternalLogical.g:2557:2: rule__NandExpr__Group_1__0__Impl rule__NandExpr__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_26);
            rule__NandExpr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NandExpr__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NandExpr__Group_1__0"


    // $ANTLR start "rule__NandExpr__Group_1__0__Impl"
    // InternalLogical.g:2564:1: rule__NandExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__NandExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2568:1: ( ( () ) )
            // InternalLogical.g:2569:1: ( () )
            {
            // InternalLogical.g:2569:1: ( () )
            // InternalLogical.g:2570:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNandExprAccess().getNandExprLeftAction_1_0()); 
            }
            // InternalLogical.g:2571:1: ()
            // InternalLogical.g:2573:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNandExprAccess().getNandExprLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NandExpr__Group_1__0__Impl"


    // $ANTLR start "rule__NandExpr__Group_1__1"
    // InternalLogical.g:2583:1: rule__NandExpr__Group_1__1 : rule__NandExpr__Group_1__1__Impl rule__NandExpr__Group_1__2 ;
    public final void rule__NandExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2587:1: ( rule__NandExpr__Group_1__1__Impl rule__NandExpr__Group_1__2 )
            // InternalLogical.g:2588:2: rule__NandExpr__Group_1__1__Impl rule__NandExpr__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__NandExpr__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NandExpr__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NandExpr__Group_1__1"


    // $ANTLR start "rule__NandExpr__Group_1__1__Impl"
    // InternalLogical.g:2595:1: rule__NandExpr__Group_1__1__Impl : ( RULE_K_NAND ) ;
    public final void rule__NandExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2599:1: ( ( RULE_K_NAND ) )
            // InternalLogical.g:2600:1: ( RULE_K_NAND )
            {
            // InternalLogical.g:2600:1: ( RULE_K_NAND )
            // InternalLogical.g:2601:1: RULE_K_NAND
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNandExprAccess().getK_NANDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_K_NAND,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNandExprAccess().getK_NANDTerminalRuleCall_1_1()); 
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
    // $ANTLR end "rule__NandExpr__Group_1__1__Impl"


    // $ANTLR start "rule__NandExpr__Group_1__2"
    // InternalLogical.g:2612:1: rule__NandExpr__Group_1__2 : rule__NandExpr__Group_1__2__Impl ;
    public final void rule__NandExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2616:1: ( rule__NandExpr__Group_1__2__Impl )
            // InternalLogical.g:2617:2: rule__NandExpr__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NandExpr__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NandExpr__Group_1__2"


    // $ANTLR start "rule__NandExpr__Group_1__2__Impl"
    // InternalLogical.g:2623:1: rule__NandExpr__Group_1__2__Impl : ( ( rule__NandExpr__RightAssignment_1_2 ) ) ;
    public final void rule__NandExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2627:1: ( ( ( rule__NandExpr__RightAssignment_1_2 ) ) )
            // InternalLogical.g:2628:1: ( ( rule__NandExpr__RightAssignment_1_2 ) )
            {
            // InternalLogical.g:2628:1: ( ( rule__NandExpr__RightAssignment_1_2 ) )
            // InternalLogical.g:2629:1: ( rule__NandExpr__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNandExprAccess().getRightAssignment_1_2()); 
            }
            // InternalLogical.g:2630:1: ( rule__NandExpr__RightAssignment_1_2 )
            // InternalLogical.g:2630:2: rule__NandExpr__RightAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NandExpr__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNandExprAccess().getRightAssignment_1_2()); 
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
    // $ANTLR end "rule__NandExpr__Group_1__2__Impl"


    // $ANTLR start "rule__AndExpr__Group__0"
    // InternalLogical.g:2646:1: rule__AndExpr__Group__0 : rule__AndExpr__Group__0__Impl rule__AndExpr__Group__1 ;
    public final void rule__AndExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2650:1: ( rule__AndExpr__Group__0__Impl rule__AndExpr__Group__1 )
            // InternalLogical.g:2651:2: rule__AndExpr__Group__0__Impl rule__AndExpr__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_28);
            rule__AndExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AndExpr__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpr__Group__0"


    // $ANTLR start "rule__AndExpr__Group__0__Impl"
    // InternalLogical.g:2658:1: rule__AndExpr__Group__0__Impl : ( rulePrimaryExpr ) ;
    public final void rule__AndExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2662:1: ( ( rulePrimaryExpr ) )
            // InternalLogical.g:2663:1: ( rulePrimaryExpr )
            {
            // InternalLogical.g:2663:1: ( rulePrimaryExpr )
            // InternalLogical.g:2664:1: rulePrimaryExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExprAccess().getPrimaryExprParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            rulePrimaryExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExprAccess().getPrimaryExprParserRuleCall_0()); 
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
    // $ANTLR end "rule__AndExpr__Group__0__Impl"


    // $ANTLR start "rule__AndExpr__Group__1"
    // InternalLogical.g:2675:1: rule__AndExpr__Group__1 : rule__AndExpr__Group__1__Impl ;
    public final void rule__AndExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2679:1: ( rule__AndExpr__Group__1__Impl )
            // InternalLogical.g:2680:2: rule__AndExpr__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AndExpr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpr__Group__1"


    // $ANTLR start "rule__AndExpr__Group__1__Impl"
    // InternalLogical.g:2686:1: rule__AndExpr__Group__1__Impl : ( ( rule__AndExpr__Group_1__0 )* ) ;
    public final void rule__AndExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2690:1: ( ( ( rule__AndExpr__Group_1__0 )* ) )
            // InternalLogical.g:2691:1: ( ( rule__AndExpr__Group_1__0 )* )
            {
            // InternalLogical.g:2691:1: ( ( rule__AndExpr__Group_1__0 )* )
            // InternalLogical.g:2692:1: ( rule__AndExpr__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExprAccess().getGroup_1()); 
            }
            // InternalLogical.g:2693:1: ( rule__AndExpr__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_K_AND) ) {
                    int LA13_2 = input.LA(2);

                    if ( (synpred19_InternalLogical()) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // InternalLogical.g:2693:2: rule__AndExpr__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_29);
            	    rule__AndExpr__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExprAccess().getGroup_1()); 
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
    // $ANTLR end "rule__AndExpr__Group__1__Impl"


    // $ANTLR start "rule__AndExpr__Group_1__0"
    // InternalLogical.g:2707:1: rule__AndExpr__Group_1__0 : rule__AndExpr__Group_1__0__Impl rule__AndExpr__Group_1__1 ;
    public final void rule__AndExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2711:1: ( rule__AndExpr__Group_1__0__Impl rule__AndExpr__Group_1__1 )
            // InternalLogical.g:2712:2: rule__AndExpr__Group_1__0__Impl rule__AndExpr__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_28);
            rule__AndExpr__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AndExpr__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpr__Group_1__0"


    // $ANTLR start "rule__AndExpr__Group_1__0__Impl"
    // InternalLogical.g:2719:1: rule__AndExpr__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2723:1: ( ( () ) )
            // InternalLogical.g:2724:1: ( () )
            {
            // InternalLogical.g:2724:1: ( () )
            // InternalLogical.g:2725:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExprAccess().getAndExprLeftAction_1_0()); 
            }
            // InternalLogical.g:2726:1: ()
            // InternalLogical.g:2728:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExprAccess().getAndExprLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpr__Group_1__0__Impl"


    // $ANTLR start "rule__AndExpr__Group_1__1"
    // InternalLogical.g:2738:1: rule__AndExpr__Group_1__1 : rule__AndExpr__Group_1__1__Impl rule__AndExpr__Group_1__2 ;
    public final void rule__AndExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2742:1: ( rule__AndExpr__Group_1__1__Impl rule__AndExpr__Group_1__2 )
            // InternalLogical.g:2743:2: rule__AndExpr__Group_1__1__Impl rule__AndExpr__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__AndExpr__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AndExpr__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpr__Group_1__1"


    // $ANTLR start "rule__AndExpr__Group_1__1__Impl"
    // InternalLogical.g:2750:1: rule__AndExpr__Group_1__1__Impl : ( RULE_K_AND ) ;
    public final void rule__AndExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2754:1: ( ( RULE_K_AND ) )
            // InternalLogical.g:2755:1: ( RULE_K_AND )
            {
            // InternalLogical.g:2755:1: ( RULE_K_AND )
            // InternalLogical.g:2756:1: RULE_K_AND
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExprAccess().getK_ANDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_K_AND,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExprAccess().getK_ANDTerminalRuleCall_1_1()); 
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
    // $ANTLR end "rule__AndExpr__Group_1__1__Impl"


    // $ANTLR start "rule__AndExpr__Group_1__2"
    // InternalLogical.g:2767:1: rule__AndExpr__Group_1__2 : rule__AndExpr__Group_1__2__Impl ;
    public final void rule__AndExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2771:1: ( rule__AndExpr__Group_1__2__Impl )
            // InternalLogical.g:2772:2: rule__AndExpr__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AndExpr__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpr__Group_1__2"


    // $ANTLR start "rule__AndExpr__Group_1__2__Impl"
    // InternalLogical.g:2778:1: rule__AndExpr__Group_1__2__Impl : ( ( rule__AndExpr__RightAssignment_1_2 ) ) ;
    public final void rule__AndExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2782:1: ( ( ( rule__AndExpr__RightAssignment_1_2 ) ) )
            // InternalLogical.g:2783:1: ( ( rule__AndExpr__RightAssignment_1_2 ) )
            {
            // InternalLogical.g:2783:1: ( ( rule__AndExpr__RightAssignment_1_2 ) )
            // InternalLogical.g:2784:1: ( rule__AndExpr__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExprAccess().getRightAssignment_1_2()); 
            }
            // InternalLogical.g:2785:1: ( rule__AndExpr__RightAssignment_1_2 )
            // InternalLogical.g:2785:2: rule__AndExpr__RightAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AndExpr__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExprAccess().getRightAssignment_1_2()); 
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
    // $ANTLR end "rule__AndExpr__Group_1__2__Impl"


    // $ANTLR start "rule__PrimaryExpr__Group_0__0"
    // InternalLogical.g:2801:1: rule__PrimaryExpr__Group_0__0 : rule__PrimaryExpr__Group_0__0__Impl rule__PrimaryExpr__Group_0__1 ;
    public final void rule__PrimaryExpr__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2805:1: ( rule__PrimaryExpr__Group_0__0__Impl rule__PrimaryExpr__Group_0__1 )
            // InternalLogical.g:2806:2: rule__PrimaryExpr__Group_0__0__Impl rule__PrimaryExpr__Group_0__1
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__PrimaryExpr__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PrimaryExpr__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_0__0"


    // $ANTLR start "rule__PrimaryExpr__Group_0__0__Impl"
    // InternalLogical.g:2813:1: rule__PrimaryExpr__Group_0__0__Impl : ( RULE_P_OPEN ) ;
    public final void rule__PrimaryExpr__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2817:1: ( ( RULE_P_OPEN ) )
            // InternalLogical.g:2818:1: ( RULE_P_OPEN )
            {
            // InternalLogical.g:2818:1: ( RULE_P_OPEN )
            // InternalLogical.g:2819:1: RULE_P_OPEN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getP_OPENTerminalRuleCall_0_0()); 
            }
            match(input,RULE_P_OPEN,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprAccess().getP_OPENTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__PrimaryExpr__Group_0__0__Impl"


    // $ANTLR start "rule__PrimaryExpr__Group_0__1"
    // InternalLogical.g:2830:1: rule__PrimaryExpr__Group_0__1 : rule__PrimaryExpr__Group_0__1__Impl rule__PrimaryExpr__Group_0__2 ;
    public final void rule__PrimaryExpr__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2834:1: ( rule__PrimaryExpr__Group_0__1__Impl rule__PrimaryExpr__Group_0__2 )
            // InternalLogical.g:2835:2: rule__PrimaryExpr__Group_0__1__Impl rule__PrimaryExpr__Group_0__2
            {
            pushFollow(FollowSets000.FOLLOW_30);
            rule__PrimaryExpr__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PrimaryExpr__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_0__1"


    // $ANTLR start "rule__PrimaryExpr__Group_0__1__Impl"
    // InternalLogical.g:2842:1: rule__PrimaryExpr__Group_0__1__Impl : ( ruleImpliesExpr ) ;
    public final void rule__PrimaryExpr__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2846:1: ( ( ruleImpliesExpr ) )
            // InternalLogical.g:2847:1: ( ruleImpliesExpr )
            {
            // InternalLogical.g:2847:1: ( ruleImpliesExpr )
            // InternalLogical.g:2848:1: ruleImpliesExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getImpliesExprParserRuleCall_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleImpliesExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprAccess().getImpliesExprParserRuleCall_0_1()); 
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
    // $ANTLR end "rule__PrimaryExpr__Group_0__1__Impl"


    // $ANTLR start "rule__PrimaryExpr__Group_0__2"
    // InternalLogical.g:2859:1: rule__PrimaryExpr__Group_0__2 : rule__PrimaryExpr__Group_0__2__Impl ;
    public final void rule__PrimaryExpr__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2863:1: ( rule__PrimaryExpr__Group_0__2__Impl )
            // InternalLogical.g:2864:2: rule__PrimaryExpr__Group_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__PrimaryExpr__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpr__Group_0__2"


    // $ANTLR start "rule__PrimaryExpr__Group_0__2__Impl"
    // InternalLogical.g:2870:1: rule__PrimaryExpr__Group_0__2__Impl : ( RULE_P_CLOSE ) ;
    public final void rule__PrimaryExpr__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2874:1: ( ( RULE_P_CLOSE ) )
            // InternalLogical.g:2875:1: ( RULE_P_CLOSE )
            {
            // InternalLogical.g:2875:1: ( RULE_P_CLOSE )
            // InternalLogical.g:2876:1: RULE_P_CLOSE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExprAccess().getP_CLOSETerminalRuleCall_0_2()); 
            }
            match(input,RULE_P_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExprAccess().getP_CLOSETerminalRuleCall_0_2()); 
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
    // $ANTLR end "rule__PrimaryExpr__Group_0__2__Impl"


    // $ANTLR start "rule__BigAndExpr__Group__0"
    // InternalLogical.g:2893:1: rule__BigAndExpr__Group__0 : rule__BigAndExpr__Group__0__Impl rule__BigAndExpr__Group__1 ;
    public final void rule__BigAndExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2897:1: ( rule__BigAndExpr__Group__0__Impl rule__BigAndExpr__Group__1 )
            // InternalLogical.g:2898:2: rule__BigAndExpr__Group__0__Impl rule__BigAndExpr__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_31);
            rule__BigAndExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BigAndExpr__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BigAndExpr__Group__0"


    // $ANTLR start "rule__BigAndExpr__Group__0__Impl"
    // InternalLogical.g:2905:1: rule__BigAndExpr__Group__0__Impl : ( RULE_K_BIG_AND ) ;
    public final void rule__BigAndExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2909:1: ( ( RULE_K_BIG_AND ) )
            // InternalLogical.g:2910:1: ( RULE_K_BIG_AND )
            {
            // InternalLogical.g:2910:1: ( RULE_K_BIG_AND )
            // InternalLogical.g:2911:1: RULE_K_BIG_AND
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBigAndExprAccess().getK_BIG_ANDTerminalRuleCall_0()); 
            }
            match(input,RULE_K_BIG_AND,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBigAndExprAccess().getK_BIG_ANDTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__BigAndExpr__Group__0__Impl"


    // $ANTLR start "rule__BigAndExpr__Group__1"
    // InternalLogical.g:2922:1: rule__BigAndExpr__Group__1 : rule__BigAndExpr__Group__1__Impl rule__BigAndExpr__Group__2 ;
    public final void rule__BigAndExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2926:1: ( rule__BigAndExpr__Group__1__Impl rule__BigAndExpr__Group__2 )
            // InternalLogical.g:2927:2: rule__BigAndExpr__Group__1__Impl rule__BigAndExpr__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__BigAndExpr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BigAndExpr__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BigAndExpr__Group__1"


    // $ANTLR start "rule__BigAndExpr__Group__1__Impl"
    // InternalLogical.g:2934:1: rule__BigAndExpr__Group__1__Impl : ( RULE_P_OPEN ) ;
    public final void rule__BigAndExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2938:1: ( ( RULE_P_OPEN ) )
            // InternalLogical.g:2939:1: ( RULE_P_OPEN )
            {
            // InternalLogical.g:2939:1: ( RULE_P_OPEN )
            // InternalLogical.g:2940:1: RULE_P_OPEN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBigAndExprAccess().getP_OPENTerminalRuleCall_1()); 
            }
            match(input,RULE_P_OPEN,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBigAndExprAccess().getP_OPENTerminalRuleCall_1()); 
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
    // $ANTLR end "rule__BigAndExpr__Group__1__Impl"


    // $ANTLR start "rule__BigAndExpr__Group__2"
    // InternalLogical.g:2951:1: rule__BigAndExpr__Group__2 : rule__BigAndExpr__Group__2__Impl rule__BigAndExpr__Group__3 ;
    public final void rule__BigAndExpr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2955:1: ( rule__BigAndExpr__Group__2__Impl rule__BigAndExpr__Group__3 )
            // InternalLogical.g:2956:2: rule__BigAndExpr__Group__2__Impl rule__BigAndExpr__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_32);
            rule__BigAndExpr__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BigAndExpr__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BigAndExpr__Group__2"


    // $ANTLR start "rule__BigAndExpr__Group__2__Impl"
    // InternalLogical.g:2963:1: rule__BigAndExpr__Group__2__Impl : ( ( rule__BigAndExpr__ChildrenAssignment_2 ) ) ;
    public final void rule__BigAndExpr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2967:1: ( ( ( rule__BigAndExpr__ChildrenAssignment_2 ) ) )
            // InternalLogical.g:2968:1: ( ( rule__BigAndExpr__ChildrenAssignment_2 ) )
            {
            // InternalLogical.g:2968:1: ( ( rule__BigAndExpr__ChildrenAssignment_2 ) )
            // InternalLogical.g:2969:1: ( rule__BigAndExpr__ChildrenAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBigAndExprAccess().getChildrenAssignment_2()); 
            }
            // InternalLogical.g:2970:1: ( rule__BigAndExpr__ChildrenAssignment_2 )
            // InternalLogical.g:2970:2: rule__BigAndExpr__ChildrenAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BigAndExpr__ChildrenAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBigAndExprAccess().getChildrenAssignment_2()); 
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
    // $ANTLR end "rule__BigAndExpr__Group__2__Impl"


    // $ANTLR start "rule__BigAndExpr__Group__3"
    // InternalLogical.g:2980:1: rule__BigAndExpr__Group__3 : rule__BigAndExpr__Group__3__Impl rule__BigAndExpr__Group__4 ;
    public final void rule__BigAndExpr__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2984:1: ( rule__BigAndExpr__Group__3__Impl rule__BigAndExpr__Group__4 )
            // InternalLogical.g:2985:2: rule__BigAndExpr__Group__3__Impl rule__BigAndExpr__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_32);
            rule__BigAndExpr__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BigAndExpr__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BigAndExpr__Group__3"


    // $ANTLR start "rule__BigAndExpr__Group__3__Impl"
    // InternalLogical.g:2992:1: rule__BigAndExpr__Group__3__Impl : ( ( rule__BigAndExpr__Group_3__0 )* ) ;
    public final void rule__BigAndExpr__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:2996:1: ( ( ( rule__BigAndExpr__Group_3__0 )* ) )
            // InternalLogical.g:2997:1: ( ( rule__BigAndExpr__Group_3__0 )* )
            {
            // InternalLogical.g:2997:1: ( ( rule__BigAndExpr__Group_3__0 )* )
            // InternalLogical.g:2998:1: ( rule__BigAndExpr__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBigAndExprAccess().getGroup_3()); 
            }
            // InternalLogical.g:2999:1: ( rule__BigAndExpr__Group_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_COMMA) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalLogical.g:2999:2: rule__BigAndExpr__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_33);
            	    rule__BigAndExpr__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBigAndExprAccess().getGroup_3()); 
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
    // $ANTLR end "rule__BigAndExpr__Group__3__Impl"


    // $ANTLR start "rule__BigAndExpr__Group__4"
    // InternalLogical.g:3009:1: rule__BigAndExpr__Group__4 : rule__BigAndExpr__Group__4__Impl ;
    public final void rule__BigAndExpr__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3013:1: ( rule__BigAndExpr__Group__4__Impl )
            // InternalLogical.g:3014:2: rule__BigAndExpr__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BigAndExpr__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BigAndExpr__Group__4"


    // $ANTLR start "rule__BigAndExpr__Group__4__Impl"
    // InternalLogical.g:3020:1: rule__BigAndExpr__Group__4__Impl : ( RULE_P_CLOSE ) ;
    public final void rule__BigAndExpr__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3024:1: ( ( RULE_P_CLOSE ) )
            // InternalLogical.g:3025:1: ( RULE_P_CLOSE )
            {
            // InternalLogical.g:3025:1: ( RULE_P_CLOSE )
            // InternalLogical.g:3026:1: RULE_P_CLOSE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBigAndExprAccess().getP_CLOSETerminalRuleCall_4()); 
            }
            match(input,RULE_P_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBigAndExprAccess().getP_CLOSETerminalRuleCall_4()); 
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
    // $ANTLR end "rule__BigAndExpr__Group__4__Impl"


    // $ANTLR start "rule__BigAndExpr__Group_3__0"
    // InternalLogical.g:3047:1: rule__BigAndExpr__Group_3__0 : rule__BigAndExpr__Group_3__0__Impl rule__BigAndExpr__Group_3__1 ;
    public final void rule__BigAndExpr__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3051:1: ( rule__BigAndExpr__Group_3__0__Impl rule__BigAndExpr__Group_3__1 )
            // InternalLogical.g:3052:2: rule__BigAndExpr__Group_3__0__Impl rule__BigAndExpr__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__BigAndExpr__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BigAndExpr__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BigAndExpr__Group_3__0"


    // $ANTLR start "rule__BigAndExpr__Group_3__0__Impl"
    // InternalLogical.g:3059:1: rule__BigAndExpr__Group_3__0__Impl : ( RULE_COMMA ) ;
    public final void rule__BigAndExpr__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3063:1: ( ( RULE_COMMA ) )
            // InternalLogical.g:3064:1: ( RULE_COMMA )
            {
            // InternalLogical.g:3064:1: ( RULE_COMMA )
            // InternalLogical.g:3065:1: RULE_COMMA
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBigAndExprAccess().getCOMMATerminalRuleCall_3_0()); 
            }
            match(input,RULE_COMMA,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBigAndExprAccess().getCOMMATerminalRuleCall_3_0()); 
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
    // $ANTLR end "rule__BigAndExpr__Group_3__0__Impl"


    // $ANTLR start "rule__BigAndExpr__Group_3__1"
    // InternalLogical.g:3076:1: rule__BigAndExpr__Group_3__1 : rule__BigAndExpr__Group_3__1__Impl ;
    public final void rule__BigAndExpr__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3080:1: ( rule__BigAndExpr__Group_3__1__Impl )
            // InternalLogical.g:3081:2: rule__BigAndExpr__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BigAndExpr__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BigAndExpr__Group_3__1"


    // $ANTLR start "rule__BigAndExpr__Group_3__1__Impl"
    // InternalLogical.g:3087:1: rule__BigAndExpr__Group_3__1__Impl : ( ( rule__BigAndExpr__ChildrenAssignment_3_1 ) ) ;
    public final void rule__BigAndExpr__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3091:1: ( ( ( rule__BigAndExpr__ChildrenAssignment_3_1 ) ) )
            // InternalLogical.g:3092:1: ( ( rule__BigAndExpr__ChildrenAssignment_3_1 ) )
            {
            // InternalLogical.g:3092:1: ( ( rule__BigAndExpr__ChildrenAssignment_3_1 ) )
            // InternalLogical.g:3093:1: ( rule__BigAndExpr__ChildrenAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBigAndExprAccess().getChildrenAssignment_3_1()); 
            }
            // InternalLogical.g:3094:1: ( rule__BigAndExpr__ChildrenAssignment_3_1 )
            // InternalLogical.g:3094:2: rule__BigAndExpr__ChildrenAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BigAndExpr__ChildrenAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBigAndExprAccess().getChildrenAssignment_3_1()); 
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
    // $ANTLR end "rule__BigAndExpr__Group_3__1__Impl"


    // $ANTLR start "rule__BigOrExpr__Group__0"
    // InternalLogical.g:3108:1: rule__BigOrExpr__Group__0 : rule__BigOrExpr__Group__0__Impl rule__BigOrExpr__Group__1 ;
    public final void rule__BigOrExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3112:1: ( rule__BigOrExpr__Group__0__Impl rule__BigOrExpr__Group__1 )
            // InternalLogical.g:3113:2: rule__BigOrExpr__Group__0__Impl rule__BigOrExpr__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_31);
            rule__BigOrExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BigOrExpr__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BigOrExpr__Group__0"


    // $ANTLR start "rule__BigOrExpr__Group__0__Impl"
    // InternalLogical.g:3120:1: rule__BigOrExpr__Group__0__Impl : ( RULE_K_BIG_OR ) ;
    public final void rule__BigOrExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3124:1: ( ( RULE_K_BIG_OR ) )
            // InternalLogical.g:3125:1: ( RULE_K_BIG_OR )
            {
            // InternalLogical.g:3125:1: ( RULE_K_BIG_OR )
            // InternalLogical.g:3126:1: RULE_K_BIG_OR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBigOrExprAccess().getK_BIG_ORTerminalRuleCall_0()); 
            }
            match(input,RULE_K_BIG_OR,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBigOrExprAccess().getK_BIG_ORTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__BigOrExpr__Group__0__Impl"


    // $ANTLR start "rule__BigOrExpr__Group__1"
    // InternalLogical.g:3137:1: rule__BigOrExpr__Group__1 : rule__BigOrExpr__Group__1__Impl rule__BigOrExpr__Group__2 ;
    public final void rule__BigOrExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3141:1: ( rule__BigOrExpr__Group__1__Impl rule__BigOrExpr__Group__2 )
            // InternalLogical.g:3142:2: rule__BigOrExpr__Group__1__Impl rule__BigOrExpr__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__BigOrExpr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BigOrExpr__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BigOrExpr__Group__1"


    // $ANTLR start "rule__BigOrExpr__Group__1__Impl"
    // InternalLogical.g:3149:1: rule__BigOrExpr__Group__1__Impl : ( RULE_P_OPEN ) ;
    public final void rule__BigOrExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3153:1: ( ( RULE_P_OPEN ) )
            // InternalLogical.g:3154:1: ( RULE_P_OPEN )
            {
            // InternalLogical.g:3154:1: ( RULE_P_OPEN )
            // InternalLogical.g:3155:1: RULE_P_OPEN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBigOrExprAccess().getP_OPENTerminalRuleCall_1()); 
            }
            match(input,RULE_P_OPEN,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBigOrExprAccess().getP_OPENTerminalRuleCall_1()); 
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
    // $ANTLR end "rule__BigOrExpr__Group__1__Impl"


    // $ANTLR start "rule__BigOrExpr__Group__2"
    // InternalLogical.g:3166:1: rule__BigOrExpr__Group__2 : rule__BigOrExpr__Group__2__Impl rule__BigOrExpr__Group__3 ;
    public final void rule__BigOrExpr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3170:1: ( rule__BigOrExpr__Group__2__Impl rule__BigOrExpr__Group__3 )
            // InternalLogical.g:3171:2: rule__BigOrExpr__Group__2__Impl rule__BigOrExpr__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_32);
            rule__BigOrExpr__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BigOrExpr__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BigOrExpr__Group__2"


    // $ANTLR start "rule__BigOrExpr__Group__2__Impl"
    // InternalLogical.g:3178:1: rule__BigOrExpr__Group__2__Impl : ( ( rule__BigOrExpr__ChildrenAssignment_2 ) ) ;
    public final void rule__BigOrExpr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3182:1: ( ( ( rule__BigOrExpr__ChildrenAssignment_2 ) ) )
            // InternalLogical.g:3183:1: ( ( rule__BigOrExpr__ChildrenAssignment_2 ) )
            {
            // InternalLogical.g:3183:1: ( ( rule__BigOrExpr__ChildrenAssignment_2 ) )
            // InternalLogical.g:3184:1: ( rule__BigOrExpr__ChildrenAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBigOrExprAccess().getChildrenAssignment_2()); 
            }
            // InternalLogical.g:3185:1: ( rule__BigOrExpr__ChildrenAssignment_2 )
            // InternalLogical.g:3185:2: rule__BigOrExpr__ChildrenAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BigOrExpr__ChildrenAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBigOrExprAccess().getChildrenAssignment_2()); 
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
    // $ANTLR end "rule__BigOrExpr__Group__2__Impl"


    // $ANTLR start "rule__BigOrExpr__Group__3"
    // InternalLogical.g:3195:1: rule__BigOrExpr__Group__3 : rule__BigOrExpr__Group__3__Impl rule__BigOrExpr__Group__4 ;
    public final void rule__BigOrExpr__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3199:1: ( rule__BigOrExpr__Group__3__Impl rule__BigOrExpr__Group__4 )
            // InternalLogical.g:3200:2: rule__BigOrExpr__Group__3__Impl rule__BigOrExpr__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_32);
            rule__BigOrExpr__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BigOrExpr__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BigOrExpr__Group__3"


    // $ANTLR start "rule__BigOrExpr__Group__3__Impl"
    // InternalLogical.g:3207:1: rule__BigOrExpr__Group__3__Impl : ( ( rule__BigOrExpr__Group_3__0 )* ) ;
    public final void rule__BigOrExpr__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3211:1: ( ( ( rule__BigOrExpr__Group_3__0 )* ) )
            // InternalLogical.g:3212:1: ( ( rule__BigOrExpr__Group_3__0 )* )
            {
            // InternalLogical.g:3212:1: ( ( rule__BigOrExpr__Group_3__0 )* )
            // InternalLogical.g:3213:1: ( rule__BigOrExpr__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBigOrExprAccess().getGroup_3()); 
            }
            // InternalLogical.g:3214:1: ( rule__BigOrExpr__Group_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_COMMA) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalLogical.g:3214:2: rule__BigOrExpr__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_33);
            	    rule__BigOrExpr__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBigOrExprAccess().getGroup_3()); 
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
    // $ANTLR end "rule__BigOrExpr__Group__3__Impl"


    // $ANTLR start "rule__BigOrExpr__Group__4"
    // InternalLogical.g:3224:1: rule__BigOrExpr__Group__4 : rule__BigOrExpr__Group__4__Impl ;
    public final void rule__BigOrExpr__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3228:1: ( rule__BigOrExpr__Group__4__Impl )
            // InternalLogical.g:3229:2: rule__BigOrExpr__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BigOrExpr__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BigOrExpr__Group__4"


    // $ANTLR start "rule__BigOrExpr__Group__4__Impl"
    // InternalLogical.g:3235:1: rule__BigOrExpr__Group__4__Impl : ( RULE_P_CLOSE ) ;
    public final void rule__BigOrExpr__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3239:1: ( ( RULE_P_CLOSE ) )
            // InternalLogical.g:3240:1: ( RULE_P_CLOSE )
            {
            // InternalLogical.g:3240:1: ( RULE_P_CLOSE )
            // InternalLogical.g:3241:1: RULE_P_CLOSE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBigOrExprAccess().getP_CLOSETerminalRuleCall_4()); 
            }
            match(input,RULE_P_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBigOrExprAccess().getP_CLOSETerminalRuleCall_4()); 
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
    // $ANTLR end "rule__BigOrExpr__Group__4__Impl"


    // $ANTLR start "rule__BigOrExpr__Group_3__0"
    // InternalLogical.g:3262:1: rule__BigOrExpr__Group_3__0 : rule__BigOrExpr__Group_3__0__Impl rule__BigOrExpr__Group_3__1 ;
    public final void rule__BigOrExpr__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3266:1: ( rule__BigOrExpr__Group_3__0__Impl rule__BigOrExpr__Group_3__1 )
            // InternalLogical.g:3267:2: rule__BigOrExpr__Group_3__0__Impl rule__BigOrExpr__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__BigOrExpr__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BigOrExpr__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BigOrExpr__Group_3__0"


    // $ANTLR start "rule__BigOrExpr__Group_3__0__Impl"
    // InternalLogical.g:3274:1: rule__BigOrExpr__Group_3__0__Impl : ( RULE_COMMA ) ;
    public final void rule__BigOrExpr__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3278:1: ( ( RULE_COMMA ) )
            // InternalLogical.g:3279:1: ( RULE_COMMA )
            {
            // InternalLogical.g:3279:1: ( RULE_COMMA )
            // InternalLogical.g:3280:1: RULE_COMMA
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBigOrExprAccess().getCOMMATerminalRuleCall_3_0()); 
            }
            match(input,RULE_COMMA,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBigOrExprAccess().getCOMMATerminalRuleCall_3_0()); 
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
    // $ANTLR end "rule__BigOrExpr__Group_3__0__Impl"


    // $ANTLR start "rule__BigOrExpr__Group_3__1"
    // InternalLogical.g:3291:1: rule__BigOrExpr__Group_3__1 : rule__BigOrExpr__Group_3__1__Impl ;
    public final void rule__BigOrExpr__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3295:1: ( rule__BigOrExpr__Group_3__1__Impl )
            // InternalLogical.g:3296:2: rule__BigOrExpr__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BigOrExpr__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BigOrExpr__Group_3__1"


    // $ANTLR start "rule__BigOrExpr__Group_3__1__Impl"
    // InternalLogical.g:3302:1: rule__BigOrExpr__Group_3__1__Impl : ( ( rule__BigOrExpr__ChildrenAssignment_3_1 ) ) ;
    public final void rule__BigOrExpr__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3306:1: ( ( ( rule__BigOrExpr__ChildrenAssignment_3_1 ) ) )
            // InternalLogical.g:3307:1: ( ( rule__BigOrExpr__ChildrenAssignment_3_1 ) )
            {
            // InternalLogical.g:3307:1: ( ( rule__BigOrExpr__ChildrenAssignment_3_1 ) )
            // InternalLogical.g:3308:1: ( rule__BigOrExpr__ChildrenAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBigOrExprAccess().getChildrenAssignment_3_1()); 
            }
            // InternalLogical.g:3309:1: ( rule__BigOrExpr__ChildrenAssignment_3_1 )
            // InternalLogical.g:3309:2: rule__BigOrExpr__ChildrenAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BigOrExpr__ChildrenAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBigOrExprAccess().getChildrenAssignment_3_1()); 
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
    // $ANTLR end "rule__BigOrExpr__Group_3__1__Impl"


    // $ANTLR start "rule__BigXorExpr__Group__0"
    // InternalLogical.g:3323:1: rule__BigXorExpr__Group__0 : rule__BigXorExpr__Group__0__Impl rule__BigXorExpr__Group__1 ;
    public final void rule__BigXorExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3327:1: ( rule__BigXorExpr__Group__0__Impl rule__BigXorExpr__Group__1 )
            // InternalLogical.g:3328:2: rule__BigXorExpr__Group__0__Impl rule__BigXorExpr__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_31);
            rule__BigXorExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BigXorExpr__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BigXorExpr__Group__0"


    // $ANTLR start "rule__BigXorExpr__Group__0__Impl"
    // InternalLogical.g:3335:1: rule__BigXorExpr__Group__0__Impl : ( RULE_K_BIG_XOR ) ;
    public final void rule__BigXorExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3339:1: ( ( RULE_K_BIG_XOR ) )
            // InternalLogical.g:3340:1: ( RULE_K_BIG_XOR )
            {
            // InternalLogical.g:3340:1: ( RULE_K_BIG_XOR )
            // InternalLogical.g:3341:1: RULE_K_BIG_XOR
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBigXorExprAccess().getK_BIG_XORTerminalRuleCall_0()); 
            }
            match(input,RULE_K_BIG_XOR,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBigXorExprAccess().getK_BIG_XORTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__BigXorExpr__Group__0__Impl"


    // $ANTLR start "rule__BigXorExpr__Group__1"
    // InternalLogical.g:3352:1: rule__BigXorExpr__Group__1 : rule__BigXorExpr__Group__1__Impl rule__BigXorExpr__Group__2 ;
    public final void rule__BigXorExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3356:1: ( rule__BigXorExpr__Group__1__Impl rule__BigXorExpr__Group__2 )
            // InternalLogical.g:3357:2: rule__BigXorExpr__Group__1__Impl rule__BigXorExpr__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__BigXorExpr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BigXorExpr__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BigXorExpr__Group__1"


    // $ANTLR start "rule__BigXorExpr__Group__1__Impl"
    // InternalLogical.g:3364:1: rule__BigXorExpr__Group__1__Impl : ( RULE_P_OPEN ) ;
    public final void rule__BigXorExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3368:1: ( ( RULE_P_OPEN ) )
            // InternalLogical.g:3369:1: ( RULE_P_OPEN )
            {
            // InternalLogical.g:3369:1: ( RULE_P_OPEN )
            // InternalLogical.g:3370:1: RULE_P_OPEN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBigXorExprAccess().getP_OPENTerminalRuleCall_1()); 
            }
            match(input,RULE_P_OPEN,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBigXorExprAccess().getP_OPENTerminalRuleCall_1()); 
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
    // $ANTLR end "rule__BigXorExpr__Group__1__Impl"


    // $ANTLR start "rule__BigXorExpr__Group__2"
    // InternalLogical.g:3381:1: rule__BigXorExpr__Group__2 : rule__BigXorExpr__Group__2__Impl rule__BigXorExpr__Group__3 ;
    public final void rule__BigXorExpr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3385:1: ( rule__BigXorExpr__Group__2__Impl rule__BigXorExpr__Group__3 )
            // InternalLogical.g:3386:2: rule__BigXorExpr__Group__2__Impl rule__BigXorExpr__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_32);
            rule__BigXorExpr__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BigXorExpr__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BigXorExpr__Group__2"


    // $ANTLR start "rule__BigXorExpr__Group__2__Impl"
    // InternalLogical.g:3393:1: rule__BigXorExpr__Group__2__Impl : ( ( rule__BigXorExpr__ChildrenAssignment_2 ) ) ;
    public final void rule__BigXorExpr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3397:1: ( ( ( rule__BigXorExpr__ChildrenAssignment_2 ) ) )
            // InternalLogical.g:3398:1: ( ( rule__BigXorExpr__ChildrenAssignment_2 ) )
            {
            // InternalLogical.g:3398:1: ( ( rule__BigXorExpr__ChildrenAssignment_2 ) )
            // InternalLogical.g:3399:1: ( rule__BigXorExpr__ChildrenAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBigXorExprAccess().getChildrenAssignment_2()); 
            }
            // InternalLogical.g:3400:1: ( rule__BigXorExpr__ChildrenAssignment_2 )
            // InternalLogical.g:3400:2: rule__BigXorExpr__ChildrenAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BigXorExpr__ChildrenAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBigXorExprAccess().getChildrenAssignment_2()); 
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
    // $ANTLR end "rule__BigXorExpr__Group__2__Impl"


    // $ANTLR start "rule__BigXorExpr__Group__3"
    // InternalLogical.g:3410:1: rule__BigXorExpr__Group__3 : rule__BigXorExpr__Group__3__Impl rule__BigXorExpr__Group__4 ;
    public final void rule__BigXorExpr__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3414:1: ( rule__BigXorExpr__Group__3__Impl rule__BigXorExpr__Group__4 )
            // InternalLogical.g:3415:2: rule__BigXorExpr__Group__3__Impl rule__BigXorExpr__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_32);
            rule__BigXorExpr__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BigXorExpr__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BigXorExpr__Group__3"


    // $ANTLR start "rule__BigXorExpr__Group__3__Impl"
    // InternalLogical.g:3422:1: rule__BigXorExpr__Group__3__Impl : ( ( rule__BigXorExpr__Group_3__0 )* ) ;
    public final void rule__BigXorExpr__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3426:1: ( ( ( rule__BigXorExpr__Group_3__0 )* ) )
            // InternalLogical.g:3427:1: ( ( rule__BigXorExpr__Group_3__0 )* )
            {
            // InternalLogical.g:3427:1: ( ( rule__BigXorExpr__Group_3__0 )* )
            // InternalLogical.g:3428:1: ( rule__BigXorExpr__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBigXorExprAccess().getGroup_3()); 
            }
            // InternalLogical.g:3429:1: ( rule__BigXorExpr__Group_3__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_COMMA) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalLogical.g:3429:2: rule__BigXorExpr__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_33);
            	    rule__BigXorExpr__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBigXorExprAccess().getGroup_3()); 
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
    // $ANTLR end "rule__BigXorExpr__Group__3__Impl"


    // $ANTLR start "rule__BigXorExpr__Group__4"
    // InternalLogical.g:3439:1: rule__BigXorExpr__Group__4 : rule__BigXorExpr__Group__4__Impl ;
    public final void rule__BigXorExpr__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3443:1: ( rule__BigXorExpr__Group__4__Impl )
            // InternalLogical.g:3444:2: rule__BigXorExpr__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BigXorExpr__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BigXorExpr__Group__4"


    // $ANTLR start "rule__BigXorExpr__Group__4__Impl"
    // InternalLogical.g:3450:1: rule__BigXorExpr__Group__4__Impl : ( RULE_P_CLOSE ) ;
    public final void rule__BigXorExpr__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3454:1: ( ( RULE_P_CLOSE ) )
            // InternalLogical.g:3455:1: ( RULE_P_CLOSE )
            {
            // InternalLogical.g:3455:1: ( RULE_P_CLOSE )
            // InternalLogical.g:3456:1: RULE_P_CLOSE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBigXorExprAccess().getP_CLOSETerminalRuleCall_4()); 
            }
            match(input,RULE_P_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBigXorExprAccess().getP_CLOSETerminalRuleCall_4()); 
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
    // $ANTLR end "rule__BigXorExpr__Group__4__Impl"


    // $ANTLR start "rule__BigXorExpr__Group_3__0"
    // InternalLogical.g:3477:1: rule__BigXorExpr__Group_3__0 : rule__BigXorExpr__Group_3__0__Impl rule__BigXorExpr__Group_3__1 ;
    public final void rule__BigXorExpr__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3481:1: ( rule__BigXorExpr__Group_3__0__Impl rule__BigXorExpr__Group_3__1 )
            // InternalLogical.g:3482:2: rule__BigXorExpr__Group_3__0__Impl rule__BigXorExpr__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__BigXorExpr__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BigXorExpr__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BigXorExpr__Group_3__0"


    // $ANTLR start "rule__BigXorExpr__Group_3__0__Impl"
    // InternalLogical.g:3489:1: rule__BigXorExpr__Group_3__0__Impl : ( RULE_COMMA ) ;
    public final void rule__BigXorExpr__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3493:1: ( ( RULE_COMMA ) )
            // InternalLogical.g:3494:1: ( RULE_COMMA )
            {
            // InternalLogical.g:3494:1: ( RULE_COMMA )
            // InternalLogical.g:3495:1: RULE_COMMA
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBigXorExprAccess().getCOMMATerminalRuleCall_3_0()); 
            }
            match(input,RULE_COMMA,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBigXorExprAccess().getCOMMATerminalRuleCall_3_0()); 
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
    // $ANTLR end "rule__BigXorExpr__Group_3__0__Impl"


    // $ANTLR start "rule__BigXorExpr__Group_3__1"
    // InternalLogical.g:3506:1: rule__BigXorExpr__Group_3__1 : rule__BigXorExpr__Group_3__1__Impl ;
    public final void rule__BigXorExpr__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3510:1: ( rule__BigXorExpr__Group_3__1__Impl )
            // InternalLogical.g:3511:2: rule__BigXorExpr__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BigXorExpr__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BigXorExpr__Group_3__1"


    // $ANTLR start "rule__BigXorExpr__Group_3__1__Impl"
    // InternalLogical.g:3517:1: rule__BigXorExpr__Group_3__1__Impl : ( ( rule__BigXorExpr__ChildrenAssignment_3_1 ) ) ;
    public final void rule__BigXorExpr__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3521:1: ( ( ( rule__BigXorExpr__ChildrenAssignment_3_1 ) ) )
            // InternalLogical.g:3522:1: ( ( rule__BigXorExpr__ChildrenAssignment_3_1 ) )
            {
            // InternalLogical.g:3522:1: ( ( rule__BigXorExpr__ChildrenAssignment_3_1 ) )
            // InternalLogical.g:3523:1: ( rule__BigXorExpr__ChildrenAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBigXorExprAccess().getChildrenAssignment_3_1()); 
            }
            // InternalLogical.g:3524:1: ( rule__BigXorExpr__ChildrenAssignment_3_1 )
            // InternalLogical.g:3524:2: rule__BigXorExpr__ChildrenAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BigXorExpr__ChildrenAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBigXorExprAccess().getChildrenAssignment_3_1()); 
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
    // $ANTLR end "rule__BigXorExpr__Group_3__1__Impl"


    // $ANTLR start "rule__BigNandExpr__Group__0"
    // InternalLogical.g:3538:1: rule__BigNandExpr__Group__0 : rule__BigNandExpr__Group__0__Impl rule__BigNandExpr__Group__1 ;
    public final void rule__BigNandExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3542:1: ( rule__BigNandExpr__Group__0__Impl rule__BigNandExpr__Group__1 )
            // InternalLogical.g:3543:2: rule__BigNandExpr__Group__0__Impl rule__BigNandExpr__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_31);
            rule__BigNandExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BigNandExpr__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BigNandExpr__Group__0"


    // $ANTLR start "rule__BigNandExpr__Group__0__Impl"
    // InternalLogical.g:3550:1: rule__BigNandExpr__Group__0__Impl : ( RULE_K_BIG_NAND ) ;
    public final void rule__BigNandExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3554:1: ( ( RULE_K_BIG_NAND ) )
            // InternalLogical.g:3555:1: ( RULE_K_BIG_NAND )
            {
            // InternalLogical.g:3555:1: ( RULE_K_BIG_NAND )
            // InternalLogical.g:3556:1: RULE_K_BIG_NAND
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBigNandExprAccess().getK_BIG_NANDTerminalRuleCall_0()); 
            }
            match(input,RULE_K_BIG_NAND,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBigNandExprAccess().getK_BIG_NANDTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__BigNandExpr__Group__0__Impl"


    // $ANTLR start "rule__BigNandExpr__Group__1"
    // InternalLogical.g:3567:1: rule__BigNandExpr__Group__1 : rule__BigNandExpr__Group__1__Impl rule__BigNandExpr__Group__2 ;
    public final void rule__BigNandExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3571:1: ( rule__BigNandExpr__Group__1__Impl rule__BigNandExpr__Group__2 )
            // InternalLogical.g:3572:2: rule__BigNandExpr__Group__1__Impl rule__BigNandExpr__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__BigNandExpr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BigNandExpr__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BigNandExpr__Group__1"


    // $ANTLR start "rule__BigNandExpr__Group__1__Impl"
    // InternalLogical.g:3579:1: rule__BigNandExpr__Group__1__Impl : ( RULE_P_OPEN ) ;
    public final void rule__BigNandExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3583:1: ( ( RULE_P_OPEN ) )
            // InternalLogical.g:3584:1: ( RULE_P_OPEN )
            {
            // InternalLogical.g:3584:1: ( RULE_P_OPEN )
            // InternalLogical.g:3585:1: RULE_P_OPEN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBigNandExprAccess().getP_OPENTerminalRuleCall_1()); 
            }
            match(input,RULE_P_OPEN,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBigNandExprAccess().getP_OPENTerminalRuleCall_1()); 
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
    // $ANTLR end "rule__BigNandExpr__Group__1__Impl"


    // $ANTLR start "rule__BigNandExpr__Group__2"
    // InternalLogical.g:3596:1: rule__BigNandExpr__Group__2 : rule__BigNandExpr__Group__2__Impl rule__BigNandExpr__Group__3 ;
    public final void rule__BigNandExpr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3600:1: ( rule__BigNandExpr__Group__2__Impl rule__BigNandExpr__Group__3 )
            // InternalLogical.g:3601:2: rule__BigNandExpr__Group__2__Impl rule__BigNandExpr__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_32);
            rule__BigNandExpr__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BigNandExpr__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BigNandExpr__Group__2"


    // $ANTLR start "rule__BigNandExpr__Group__2__Impl"
    // InternalLogical.g:3608:1: rule__BigNandExpr__Group__2__Impl : ( ( rule__BigNandExpr__ChildrenAssignment_2 ) ) ;
    public final void rule__BigNandExpr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3612:1: ( ( ( rule__BigNandExpr__ChildrenAssignment_2 ) ) )
            // InternalLogical.g:3613:1: ( ( rule__BigNandExpr__ChildrenAssignment_2 ) )
            {
            // InternalLogical.g:3613:1: ( ( rule__BigNandExpr__ChildrenAssignment_2 ) )
            // InternalLogical.g:3614:1: ( rule__BigNandExpr__ChildrenAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBigNandExprAccess().getChildrenAssignment_2()); 
            }
            // InternalLogical.g:3615:1: ( rule__BigNandExpr__ChildrenAssignment_2 )
            // InternalLogical.g:3615:2: rule__BigNandExpr__ChildrenAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BigNandExpr__ChildrenAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBigNandExprAccess().getChildrenAssignment_2()); 
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
    // $ANTLR end "rule__BigNandExpr__Group__2__Impl"


    // $ANTLR start "rule__BigNandExpr__Group__3"
    // InternalLogical.g:3625:1: rule__BigNandExpr__Group__3 : rule__BigNandExpr__Group__3__Impl rule__BigNandExpr__Group__4 ;
    public final void rule__BigNandExpr__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3629:1: ( rule__BigNandExpr__Group__3__Impl rule__BigNandExpr__Group__4 )
            // InternalLogical.g:3630:2: rule__BigNandExpr__Group__3__Impl rule__BigNandExpr__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_32);
            rule__BigNandExpr__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BigNandExpr__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BigNandExpr__Group__3"


    // $ANTLR start "rule__BigNandExpr__Group__3__Impl"
    // InternalLogical.g:3637:1: rule__BigNandExpr__Group__3__Impl : ( ( rule__BigNandExpr__Group_3__0 )* ) ;
    public final void rule__BigNandExpr__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3641:1: ( ( ( rule__BigNandExpr__Group_3__0 )* ) )
            // InternalLogical.g:3642:1: ( ( rule__BigNandExpr__Group_3__0 )* )
            {
            // InternalLogical.g:3642:1: ( ( rule__BigNandExpr__Group_3__0 )* )
            // InternalLogical.g:3643:1: ( rule__BigNandExpr__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBigNandExprAccess().getGroup_3()); 
            }
            // InternalLogical.g:3644:1: ( rule__BigNandExpr__Group_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_COMMA) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalLogical.g:3644:2: rule__BigNandExpr__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_33);
            	    rule__BigNandExpr__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBigNandExprAccess().getGroup_3()); 
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
    // $ANTLR end "rule__BigNandExpr__Group__3__Impl"


    // $ANTLR start "rule__BigNandExpr__Group__4"
    // InternalLogical.g:3654:1: rule__BigNandExpr__Group__4 : rule__BigNandExpr__Group__4__Impl ;
    public final void rule__BigNandExpr__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3658:1: ( rule__BigNandExpr__Group__4__Impl )
            // InternalLogical.g:3659:2: rule__BigNandExpr__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BigNandExpr__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BigNandExpr__Group__4"


    // $ANTLR start "rule__BigNandExpr__Group__4__Impl"
    // InternalLogical.g:3665:1: rule__BigNandExpr__Group__4__Impl : ( RULE_P_CLOSE ) ;
    public final void rule__BigNandExpr__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3669:1: ( ( RULE_P_CLOSE ) )
            // InternalLogical.g:3670:1: ( RULE_P_CLOSE )
            {
            // InternalLogical.g:3670:1: ( RULE_P_CLOSE )
            // InternalLogical.g:3671:1: RULE_P_CLOSE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBigNandExprAccess().getP_CLOSETerminalRuleCall_4()); 
            }
            match(input,RULE_P_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBigNandExprAccess().getP_CLOSETerminalRuleCall_4()); 
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
    // $ANTLR end "rule__BigNandExpr__Group__4__Impl"


    // $ANTLR start "rule__BigNandExpr__Group_3__0"
    // InternalLogical.g:3692:1: rule__BigNandExpr__Group_3__0 : rule__BigNandExpr__Group_3__0__Impl rule__BigNandExpr__Group_3__1 ;
    public final void rule__BigNandExpr__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3696:1: ( rule__BigNandExpr__Group_3__0__Impl rule__BigNandExpr__Group_3__1 )
            // InternalLogical.g:3697:2: rule__BigNandExpr__Group_3__0__Impl rule__BigNandExpr__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__BigNandExpr__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BigNandExpr__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BigNandExpr__Group_3__0"


    // $ANTLR start "rule__BigNandExpr__Group_3__0__Impl"
    // InternalLogical.g:3704:1: rule__BigNandExpr__Group_3__0__Impl : ( RULE_COMMA ) ;
    public final void rule__BigNandExpr__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3708:1: ( ( RULE_COMMA ) )
            // InternalLogical.g:3709:1: ( RULE_COMMA )
            {
            // InternalLogical.g:3709:1: ( RULE_COMMA )
            // InternalLogical.g:3710:1: RULE_COMMA
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBigNandExprAccess().getCOMMATerminalRuleCall_3_0()); 
            }
            match(input,RULE_COMMA,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBigNandExprAccess().getCOMMATerminalRuleCall_3_0()); 
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
    // $ANTLR end "rule__BigNandExpr__Group_3__0__Impl"


    // $ANTLR start "rule__BigNandExpr__Group_3__1"
    // InternalLogical.g:3721:1: rule__BigNandExpr__Group_3__1 : rule__BigNandExpr__Group_3__1__Impl ;
    public final void rule__BigNandExpr__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3725:1: ( rule__BigNandExpr__Group_3__1__Impl )
            // InternalLogical.g:3726:2: rule__BigNandExpr__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BigNandExpr__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BigNandExpr__Group_3__1"


    // $ANTLR start "rule__BigNandExpr__Group_3__1__Impl"
    // InternalLogical.g:3732:1: rule__BigNandExpr__Group_3__1__Impl : ( ( rule__BigNandExpr__ChildrenAssignment_3_1 ) ) ;
    public final void rule__BigNandExpr__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3736:1: ( ( ( rule__BigNandExpr__ChildrenAssignment_3_1 ) ) )
            // InternalLogical.g:3737:1: ( ( rule__BigNandExpr__ChildrenAssignment_3_1 ) )
            {
            // InternalLogical.g:3737:1: ( ( rule__BigNandExpr__ChildrenAssignment_3_1 ) )
            // InternalLogical.g:3738:1: ( rule__BigNandExpr__ChildrenAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBigNandExprAccess().getChildrenAssignment_3_1()); 
            }
            // InternalLogical.g:3739:1: ( rule__BigNandExpr__ChildrenAssignment_3_1 )
            // InternalLogical.g:3739:2: rule__BigNandExpr__ChildrenAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BigNandExpr__ChildrenAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBigNandExprAccess().getChildrenAssignment_3_1()); 
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
    // $ANTLR end "rule__BigNandExpr__Group_3__1__Impl"


    // $ANTLR start "rule__NegExpr__Group__0"
    // InternalLogical.g:3753:1: rule__NegExpr__Group__0 : rule__NegExpr__Group__0__Impl rule__NegExpr__Group__1 ;
    public final void rule__NegExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3757:1: ( rule__NegExpr__Group__0__Impl rule__NegExpr__Group__1 )
            // InternalLogical.g:3758:2: rule__NegExpr__Group__0__Impl rule__NegExpr__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__NegExpr__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NegExpr__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegExpr__Group__0"


    // $ANTLR start "rule__NegExpr__Group__0__Impl"
    // InternalLogical.g:3765:1: rule__NegExpr__Group__0__Impl : ( RULE_K_NOT ) ;
    public final void rule__NegExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3769:1: ( ( RULE_K_NOT ) )
            // InternalLogical.g:3770:1: ( RULE_K_NOT )
            {
            // InternalLogical.g:3770:1: ( RULE_K_NOT )
            // InternalLogical.g:3771:1: RULE_K_NOT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExprAccess().getK_NOTTerminalRuleCall_0()); 
            }
            match(input,RULE_K_NOT,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegExprAccess().getK_NOTTerminalRuleCall_0()); 
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
    // $ANTLR end "rule__NegExpr__Group__0__Impl"


    // $ANTLR start "rule__NegExpr__Group__1"
    // InternalLogical.g:3782:1: rule__NegExpr__Group__1 : rule__NegExpr__Group__1__Impl ;
    public final void rule__NegExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3786:1: ( rule__NegExpr__Group__1__Impl )
            // InternalLogical.g:3787:2: rule__NegExpr__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NegExpr__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegExpr__Group__1"


    // $ANTLR start "rule__NegExpr__Group__1__Impl"
    // InternalLogical.g:3793:1: rule__NegExpr__Group__1__Impl : ( ( rule__NegExpr__NegAssignment_1 ) ) ;
    public final void rule__NegExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3797:1: ( ( ( rule__NegExpr__NegAssignment_1 ) ) )
            // InternalLogical.g:3798:1: ( ( rule__NegExpr__NegAssignment_1 ) )
            {
            // InternalLogical.g:3798:1: ( ( rule__NegExpr__NegAssignment_1 ) )
            // InternalLogical.g:3799:1: ( rule__NegExpr__NegAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExprAccess().getNegAssignment_1()); 
            }
            // InternalLogical.g:3800:1: ( rule__NegExpr__NegAssignment_1 )
            // InternalLogical.g:3800:2: rule__NegExpr__NegAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NegExpr__NegAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegExprAccess().getNegAssignment_1()); 
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
    // $ANTLR end "rule__NegExpr__Group__1__Impl"


    // $ANTLR start "rule__LogicalDimension__DimensionNameAssignment_3"
    // InternalLogical.g:3815:1: rule__LogicalDimension__DimensionNameAssignment_3 : ( RULE_ID ) ;
    public final void rule__LogicalDimension__DimensionNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3819:1: ( ( RULE_ID ) )
            // InternalLogical.g:3820:1: ( RULE_ID )
            {
            // InternalLogical.g:3820:1: ( RULE_ID )
            // InternalLogical.g:3821:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalDimensionAccess().getDimensionNameIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalDimensionAccess().getDimensionNameIDTerminalRuleCall_3_0()); 
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
    // $ANTLR end "rule__LogicalDimension__DimensionNameAssignment_3"


    // $ANTLR start "rule__LogicalDimension__LogicalOptionsAssignment_5_0"
    // InternalLogical.g:3830:1: rule__LogicalDimension__LogicalOptionsAssignment_5_0 : ( ruleOption ) ;
    public final void rule__LogicalDimension__LogicalOptionsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3834:1: ( ( ruleOption ) )
            // InternalLogical.g:3835:1: ( ruleOption )
            {
            // InternalLogical.g:3835:1: ( ruleOption )
            // InternalLogical.g:3836:1: ruleOption
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalDimensionAccess().getLogicalOptionsOptionParserRuleCall_5_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleOption();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalDimensionAccess().getLogicalOptionsOptionParserRuleCall_5_0_0()); 
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
    // $ANTLR end "rule__LogicalDimension__LogicalOptionsAssignment_5_0"


    // $ANTLR start "rule__LogicalDimension__LogicalInvariantsAssignment_5_1"
    // InternalLogical.g:3845:1: rule__LogicalDimension__LogicalInvariantsAssignment_5_1 : ( ruleInvariant ) ;
    public final void rule__LogicalDimension__LogicalInvariantsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3849:1: ( ( ruleInvariant ) )
            // InternalLogical.g:3850:1: ( ruleInvariant )
            {
            // InternalLogical.g:3850:1: ( ruleInvariant )
            // InternalLogical.g:3851:1: ruleInvariant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalDimensionAccess().getLogicalInvariantsInvariantParserRuleCall_5_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleInvariant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalDimensionAccess().getLogicalInvariantsInvariantParserRuleCall_5_1_0()); 
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
    // $ANTLR end "rule__LogicalDimension__LogicalInvariantsAssignment_5_1"


    // $ANTLR start "rule__LogicalDimension__LogicalPreferencesAssignment_5_2"
    // InternalLogical.g:3860:1: rule__LogicalDimension__LogicalPreferencesAssignment_5_2 : ( rulePreference ) ;
    public final void rule__LogicalDimension__LogicalPreferencesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3864:1: ( ( rulePreference ) )
            // InternalLogical.g:3865:1: ( rulePreference )
            {
            // InternalLogical.g:3865:1: ( rulePreference )
            // InternalLogical.g:3866:1: rulePreference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalDimensionAccess().getLogicalPreferencesPreferenceParserRuleCall_5_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            rulePreference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalDimensionAccess().getLogicalPreferencesPreferenceParserRuleCall_5_2_0()); 
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
    // $ANTLR end "rule__LogicalDimension__LogicalPreferencesAssignment_5_2"


    // $ANTLR start "rule__LogicalDimension__LogicalDefaultsAssignment_5_3"
    // InternalLogical.g:3875:1: rule__LogicalDimension__LogicalDefaultsAssignment_5_3 : ( ruleDefaultBinding ) ;
    public final void rule__LogicalDimension__LogicalDefaultsAssignment_5_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3879:1: ( ( ruleDefaultBinding ) )
            // InternalLogical.g:3880:1: ( ruleDefaultBinding )
            {
            // InternalLogical.g:3880:1: ( ruleDefaultBinding )
            // InternalLogical.g:3881:1: ruleDefaultBinding
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicalDimensionAccess().getLogicalDefaultsDefaultBindingParserRuleCall_5_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleDefaultBinding();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicalDimensionAccess().getLogicalDefaultsDefaultBindingParserRuleCall_5_3_0()); 
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
    // $ANTLR end "rule__LogicalDimension__LogicalDefaultsAssignment_5_3"


    // $ANTLR start "rule__Option__NameAssignment_1"
    // InternalLogical.g:3890:1: rule__Option__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Option__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3894:1: ( ( RULE_ID ) )
            // InternalLogical.g:3895:1: ( RULE_ID )
            {
            // InternalLogical.g:3895:1: ( RULE_ID )
            // InternalLogical.g:3896:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptionAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Option__NameAssignment_1"


    // $ANTLR start "rule__Invariant__NameAssignment_1"
    // InternalLogical.g:3905:1: rule__Invariant__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Invariant__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3909:1: ( ( RULE_ID ) )
            // InternalLogical.g:3910:1: ( RULE_ID )
            {
            // InternalLogical.g:3910:1: ( RULE_ID )
            // InternalLogical.g:3911:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInvariantAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInvariantAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Invariant__NameAssignment_1"


    // $ANTLR start "rule__Invariant__OptionExprAssignment_3"
    // InternalLogical.g:3920:1: rule__Invariant__OptionExprAssignment_3 : ( ruleOptionExpr ) ;
    public final void rule__Invariant__OptionExprAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3924:1: ( ( ruleOptionExpr ) )
            // InternalLogical.g:3925:1: ( ruleOptionExpr )
            {
            // InternalLogical.g:3925:1: ( ruleOptionExpr )
            // InternalLogical.g:3926:1: ruleOptionExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInvariantAccess().getOptionExprOptionExprParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleOptionExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInvariantAccess().getOptionExprOptionExprParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__Invariant__OptionExprAssignment_3"


    // $ANTLR start "rule__Preference__NameAssignment_1"
    // InternalLogical.g:3935:1: rule__Preference__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Preference__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3939:1: ( ( RULE_ID ) )
            // InternalLogical.g:3940:1: ( RULE_ID )
            {
            // InternalLogical.g:3940:1: ( RULE_ID )
            // InternalLogical.g:3941:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreferenceAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPreferenceAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Preference__NameAssignment_1"


    // $ANTLR start "rule__Preference__OptionAssignment_3"
    // InternalLogical.g:3950:1: rule__Preference__OptionAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Preference__OptionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3954:1: ( ( ( RULE_ID ) ) )
            // InternalLogical.g:3955:1: ( ( RULE_ID ) )
            {
            // InternalLogical.g:3955:1: ( ( RULE_ID ) )
            // InternalLogical.g:3956:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreferenceAccess().getOptionOptionCrossReference_3_0()); 
            }
            // InternalLogical.g:3957:1: ( RULE_ID )
            // InternalLogical.g:3958:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreferenceAccess().getOptionOptionIDTerminalRuleCall_3_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPreferenceAccess().getOptionOptionIDTerminalRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPreferenceAccess().getOptionOptionCrossReference_3_0()); 
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
    // $ANTLR end "rule__Preference__OptionAssignment_3"


    // $ANTLR start "rule__Preference__OptionExprAssignment_5"
    // InternalLogical.g:3969:1: rule__Preference__OptionExprAssignment_5 : ( ruleOptionExpr ) ;
    public final void rule__Preference__OptionExprAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3973:1: ( ( ruleOptionExpr ) )
            // InternalLogical.g:3974:1: ( ruleOptionExpr )
            {
            // InternalLogical.g:3974:1: ( ruleOptionExpr )
            // InternalLogical.g:3975:1: ruleOptionExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPreferenceAccess().getOptionExprOptionExprParserRuleCall_5_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleOptionExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPreferenceAccess().getOptionExprOptionExprParserRuleCall_5_0()); 
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
    // $ANTLR end "rule__Preference__OptionExprAssignment_5"


    // $ANTLR start "rule__DefaultBinding__NameAssignment_2"
    // InternalLogical.g:3984:1: rule__DefaultBinding__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DefaultBinding__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:3988:1: ( ( RULE_ID ) )
            // InternalLogical.g:3989:1: ( RULE_ID )
            {
            // InternalLogical.g:3989:1: ( RULE_ID )
            // InternalLogical.g:3990:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultBindingAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefaultBindingAccess().getNameIDTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__DefaultBinding__NameAssignment_2"


    // $ANTLR start "rule__DefaultBinding__OptionAssignment_4"
    // InternalLogical.g:3999:1: rule__DefaultBinding__OptionAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__DefaultBinding__OptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:4003:1: ( ( ( RULE_ID ) ) )
            // InternalLogical.g:4004:1: ( ( RULE_ID ) )
            {
            // InternalLogical.g:4004:1: ( ( RULE_ID ) )
            // InternalLogical.g:4005:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultBindingAccess().getOptionOptionCrossReference_4_0()); 
            }
            // InternalLogical.g:4006:1: ( RULE_ID )
            // InternalLogical.g:4007:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultBindingAccess().getOptionOptionIDTerminalRuleCall_4_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefaultBindingAccess().getOptionOptionIDTerminalRuleCall_4_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefaultBindingAccess().getOptionOptionCrossReference_4_0()); 
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
    // $ANTLR end "rule__DefaultBinding__OptionAssignment_4"


    // $ANTLR start "rule__DefaultBinding__StateAssignment_6"
    // InternalLogical.g:4018:1: rule__DefaultBinding__StateAssignment_6 : ( ruleTristate ) ;
    public final void rule__DefaultBinding__StateAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:4022:1: ( ( ruleTristate ) )
            // InternalLogical.g:4023:1: ( ruleTristate )
            {
            // InternalLogical.g:4023:1: ( ruleTristate )
            // InternalLogical.g:4024:1: ruleTristate
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDefaultBindingAccess().getStateTristateEnumRuleCall_6_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleTristate();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDefaultBindingAccess().getStateTristateEnumRuleCall_6_0()); 
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
    // $ANTLR end "rule__DefaultBinding__StateAssignment_6"


    // $ANTLR start "rule__BiconditionalExpr__RightAssignment_1_2"
    // InternalLogical.g:4033:1: rule__BiconditionalExpr__RightAssignment_1_2 : ( ruleBiconditionalExpr ) ;
    public final void rule__BiconditionalExpr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:4037:1: ( ( ruleBiconditionalExpr ) )
            // InternalLogical.g:4038:1: ( ruleBiconditionalExpr )
            {
            // InternalLogical.g:4038:1: ( ruleBiconditionalExpr )
            // InternalLogical.g:4039:1: ruleBiconditionalExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBiconditionalExprAccess().getRightBiconditionalExprParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleBiconditionalExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBiconditionalExprAccess().getRightBiconditionalExprParserRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__BiconditionalExpr__RightAssignment_1_2"


    // $ANTLR start "rule__ImpliesExpr__RightAssignment_1_2"
    // InternalLogical.g:4048:1: rule__ImpliesExpr__RightAssignment_1_2 : ( ruleOrExpr ) ;
    public final void rule__ImpliesExpr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:4052:1: ( ( ruleOrExpr ) )
            // InternalLogical.g:4053:1: ( ruleOrExpr )
            {
            // InternalLogical.g:4053:1: ( ruleOrExpr )
            // InternalLogical.g:4054:1: ruleOrExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImpliesExprAccess().getRightOrExprParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleOrExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImpliesExprAccess().getRightOrExprParserRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__ImpliesExpr__RightAssignment_1_2"


    // $ANTLR start "rule__OrExpr__RightAssignment_1_2"
    // InternalLogical.g:4063:1: rule__OrExpr__RightAssignment_1_2 : ( ruleXorExpr ) ;
    public final void rule__OrExpr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:4067:1: ( ( ruleXorExpr ) )
            // InternalLogical.g:4068:1: ( ruleXorExpr )
            {
            // InternalLogical.g:4068:1: ( ruleXorExpr )
            // InternalLogical.g:4069:1: ruleXorExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExprAccess().getRightXorExprParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleXorExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExprAccess().getRightXorExprParserRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__OrExpr__RightAssignment_1_2"


    // $ANTLR start "rule__XorExpr__RightAssignment_1_2"
    // InternalLogical.g:4078:1: rule__XorExpr__RightAssignment_1_2 : ( ruleMinusExpr ) ;
    public final void rule__XorExpr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:4082:1: ( ( ruleMinusExpr ) )
            // InternalLogical.g:4083:1: ( ruleMinusExpr )
            {
            // InternalLogical.g:4083:1: ( ruleMinusExpr )
            // InternalLogical.g:4084:1: ruleMinusExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getXorExprAccess().getRightMinusExprParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMinusExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getXorExprAccess().getRightMinusExprParserRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__XorExpr__RightAssignment_1_2"


    // $ANTLR start "rule__MinusExpr__RightAssignment_1_2"
    // InternalLogical.g:4093:1: rule__MinusExpr__RightAssignment_1_2 : ( ruleNandExpr ) ;
    public final void rule__MinusExpr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:4097:1: ( ( ruleNandExpr ) )
            // InternalLogical.g:4098:1: ( ruleNandExpr )
            {
            // InternalLogical.g:4098:1: ( ruleNandExpr )
            // InternalLogical.g:4099:1: ruleNandExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMinusExprAccess().getRightNandExprParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleNandExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMinusExprAccess().getRightNandExprParserRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__MinusExpr__RightAssignment_1_2"


    // $ANTLR start "rule__NandExpr__RightAssignment_1_2"
    // InternalLogical.g:4108:1: rule__NandExpr__RightAssignment_1_2 : ( ruleAndExpr ) ;
    public final void rule__NandExpr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:4112:1: ( ( ruleAndExpr ) )
            // InternalLogical.g:4113:1: ( ruleAndExpr )
            {
            // InternalLogical.g:4113:1: ( ruleAndExpr )
            // InternalLogical.g:4114:1: ruleAndExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNandExprAccess().getRightAndExprParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAndExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNandExprAccess().getRightAndExprParserRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__NandExpr__RightAssignment_1_2"


    // $ANTLR start "rule__AndExpr__RightAssignment_1_2"
    // InternalLogical.g:4123:1: rule__AndExpr__RightAssignment_1_2 : ( rulePrimaryExpr ) ;
    public final void rule__AndExpr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:4127:1: ( ( rulePrimaryExpr ) )
            // InternalLogical.g:4128:1: ( rulePrimaryExpr )
            {
            // InternalLogical.g:4128:1: ( rulePrimaryExpr )
            // InternalLogical.g:4129:1: rulePrimaryExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExprAccess().getRightPrimaryExprParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            rulePrimaryExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExprAccess().getRightPrimaryExprParserRuleCall_1_2_0()); 
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
    // $ANTLR end "rule__AndExpr__RightAssignment_1_2"


    // $ANTLR start "rule__BigAndExpr__ChildrenAssignment_2"
    // InternalLogical.g:4138:1: rule__BigAndExpr__ChildrenAssignment_2 : ( ruleOptionExpr ) ;
    public final void rule__BigAndExpr__ChildrenAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:4142:1: ( ( ruleOptionExpr ) )
            // InternalLogical.g:4143:1: ( ruleOptionExpr )
            {
            // InternalLogical.g:4143:1: ( ruleOptionExpr )
            // InternalLogical.g:4144:1: ruleOptionExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBigAndExprAccess().getChildrenOptionExprParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleOptionExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBigAndExprAccess().getChildrenOptionExprParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__BigAndExpr__ChildrenAssignment_2"


    // $ANTLR start "rule__BigAndExpr__ChildrenAssignment_3_1"
    // InternalLogical.g:4153:1: rule__BigAndExpr__ChildrenAssignment_3_1 : ( ruleOptionExpr ) ;
    public final void rule__BigAndExpr__ChildrenAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:4157:1: ( ( ruleOptionExpr ) )
            // InternalLogical.g:4158:1: ( ruleOptionExpr )
            {
            // InternalLogical.g:4158:1: ( ruleOptionExpr )
            // InternalLogical.g:4159:1: ruleOptionExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBigAndExprAccess().getChildrenOptionExprParserRuleCall_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleOptionExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBigAndExprAccess().getChildrenOptionExprParserRuleCall_3_1_0()); 
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
    // $ANTLR end "rule__BigAndExpr__ChildrenAssignment_3_1"


    // $ANTLR start "rule__BigOrExpr__ChildrenAssignment_2"
    // InternalLogical.g:4168:1: rule__BigOrExpr__ChildrenAssignment_2 : ( ruleOptionExpr ) ;
    public final void rule__BigOrExpr__ChildrenAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:4172:1: ( ( ruleOptionExpr ) )
            // InternalLogical.g:4173:1: ( ruleOptionExpr )
            {
            // InternalLogical.g:4173:1: ( ruleOptionExpr )
            // InternalLogical.g:4174:1: ruleOptionExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBigOrExprAccess().getChildrenOptionExprParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleOptionExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBigOrExprAccess().getChildrenOptionExprParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__BigOrExpr__ChildrenAssignment_2"


    // $ANTLR start "rule__BigOrExpr__ChildrenAssignment_3_1"
    // InternalLogical.g:4183:1: rule__BigOrExpr__ChildrenAssignment_3_1 : ( ruleOptionExpr ) ;
    public final void rule__BigOrExpr__ChildrenAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:4187:1: ( ( ruleOptionExpr ) )
            // InternalLogical.g:4188:1: ( ruleOptionExpr )
            {
            // InternalLogical.g:4188:1: ( ruleOptionExpr )
            // InternalLogical.g:4189:1: ruleOptionExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBigOrExprAccess().getChildrenOptionExprParserRuleCall_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleOptionExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBigOrExprAccess().getChildrenOptionExprParserRuleCall_3_1_0()); 
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
    // $ANTLR end "rule__BigOrExpr__ChildrenAssignment_3_1"


    // $ANTLR start "rule__BigXorExpr__ChildrenAssignment_2"
    // InternalLogical.g:4198:1: rule__BigXorExpr__ChildrenAssignment_2 : ( ruleOptionExpr ) ;
    public final void rule__BigXorExpr__ChildrenAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:4202:1: ( ( ruleOptionExpr ) )
            // InternalLogical.g:4203:1: ( ruleOptionExpr )
            {
            // InternalLogical.g:4203:1: ( ruleOptionExpr )
            // InternalLogical.g:4204:1: ruleOptionExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBigXorExprAccess().getChildrenOptionExprParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleOptionExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBigXorExprAccess().getChildrenOptionExprParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__BigXorExpr__ChildrenAssignment_2"


    // $ANTLR start "rule__BigXorExpr__ChildrenAssignment_3_1"
    // InternalLogical.g:4213:1: rule__BigXorExpr__ChildrenAssignment_3_1 : ( ruleOptionExpr ) ;
    public final void rule__BigXorExpr__ChildrenAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:4217:1: ( ( ruleOptionExpr ) )
            // InternalLogical.g:4218:1: ( ruleOptionExpr )
            {
            // InternalLogical.g:4218:1: ( ruleOptionExpr )
            // InternalLogical.g:4219:1: ruleOptionExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBigXorExprAccess().getChildrenOptionExprParserRuleCall_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleOptionExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBigXorExprAccess().getChildrenOptionExprParserRuleCall_3_1_0()); 
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
    // $ANTLR end "rule__BigXorExpr__ChildrenAssignment_3_1"


    // $ANTLR start "rule__BigNandExpr__ChildrenAssignment_2"
    // InternalLogical.g:4228:1: rule__BigNandExpr__ChildrenAssignment_2 : ( ruleOptionExpr ) ;
    public final void rule__BigNandExpr__ChildrenAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:4232:1: ( ( ruleOptionExpr ) )
            // InternalLogical.g:4233:1: ( ruleOptionExpr )
            {
            // InternalLogical.g:4233:1: ( ruleOptionExpr )
            // InternalLogical.g:4234:1: ruleOptionExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBigNandExprAccess().getChildrenOptionExprParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleOptionExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBigNandExprAccess().getChildrenOptionExprParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__BigNandExpr__ChildrenAssignment_2"


    // $ANTLR start "rule__BigNandExpr__ChildrenAssignment_3_1"
    // InternalLogical.g:4243:1: rule__BigNandExpr__ChildrenAssignment_3_1 : ( ruleOptionExpr ) ;
    public final void rule__BigNandExpr__ChildrenAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:4247:1: ( ( ruleOptionExpr ) )
            // InternalLogical.g:4248:1: ( ruleOptionExpr )
            {
            // InternalLogical.g:4248:1: ( ruleOptionExpr )
            // InternalLogical.g:4249:1: ruleOptionExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBigNandExprAccess().getChildrenOptionExprParserRuleCall_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleOptionExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBigNandExprAccess().getChildrenOptionExprParserRuleCall_3_1_0()); 
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
    // $ANTLR end "rule__BigNandExpr__ChildrenAssignment_3_1"


    // $ANTLR start "rule__OptionRef__OptionAssignment"
    // InternalLogical.g:4258:1: rule__OptionRef__OptionAssignment : ( ( RULE_ID ) ) ;
    public final void rule__OptionRef__OptionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:4262:1: ( ( ( RULE_ID ) ) )
            // InternalLogical.g:4263:1: ( ( RULE_ID ) )
            {
            // InternalLogical.g:4263:1: ( ( RULE_ID ) )
            // InternalLogical.g:4264:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionRefAccess().getOptionOptionCrossReference_0()); 
            }
            // InternalLogical.g:4265:1: ( RULE_ID )
            // InternalLogical.g:4266:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOptionRefAccess().getOptionOptionIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptionRefAccess().getOptionOptionIDTerminalRuleCall_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOptionRefAccess().getOptionOptionCrossReference_0()); 
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
    // $ANTLR end "rule__OptionRef__OptionAssignment"


    // $ANTLR start "rule__NegExpr__NegAssignment_1"
    // InternalLogical.g:4277:1: rule__NegExpr__NegAssignment_1 : ( ruleOptionExpr ) ;
    public final void rule__NegExpr__NegAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalLogical.g:4281:1: ( ( ruleOptionExpr ) )
            // InternalLogical.g:4282:1: ( ruleOptionExpr )
            {
            // InternalLogical.g:4282:1: ( ruleOptionExpr )
            // InternalLogical.g:4283:1: ruleOptionExpr
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegExprAccess().getNegOptionExprParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleOptionExpr();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegExprAccess().getNegOptionExprParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__NegExpr__NegAssignment_1"

    // $ANTLR start synpred13_InternalLogical
    public final void synpred13_InternalLogical_fragment() throws RecognitionException {   
        // InternalLogical.g:1763:2: ( rule__BiconditionalExpr__Group_1__0 )
        // InternalLogical.g:1763:2: rule__BiconditionalExpr__Group_1__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__BiconditionalExpr__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_InternalLogical

    // $ANTLR start synpred14_InternalLogical
    public final void synpred14_InternalLogical_fragment() throws RecognitionException {   
        // InternalLogical.g:1918:2: ( rule__ImpliesExpr__Group_1__0 )
        // InternalLogical.g:1918:2: rule__ImpliesExpr__Group_1__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__ImpliesExpr__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_InternalLogical

    // $ANTLR start synpred15_InternalLogical
    public final void synpred15_InternalLogical_fragment() throws RecognitionException {   
        // InternalLogical.g:2073:2: ( rule__OrExpr__Group_1__0 )
        // InternalLogical.g:2073:2: rule__OrExpr__Group_1__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__OrExpr__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_InternalLogical

    // $ANTLR start synpred16_InternalLogical
    public final void synpred16_InternalLogical_fragment() throws RecognitionException {   
        // InternalLogical.g:2228:2: ( rule__XorExpr__Group_1__0 )
        // InternalLogical.g:2228:2: rule__XorExpr__Group_1__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__XorExpr__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_InternalLogical

    // $ANTLR start synpred17_InternalLogical
    public final void synpred17_InternalLogical_fragment() throws RecognitionException {   
        // InternalLogical.g:2383:2: ( rule__MinusExpr__Group_1__0 )
        // InternalLogical.g:2383:2: rule__MinusExpr__Group_1__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__MinusExpr__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_InternalLogical

    // $ANTLR start synpred18_InternalLogical
    public final void synpred18_InternalLogical_fragment() throws RecognitionException {   
        // InternalLogical.g:2538:2: ( rule__NandExpr__Group_1__0 )
        // InternalLogical.g:2538:2: rule__NandExpr__Group_1__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__NandExpr__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_InternalLogical

    // $ANTLR start synpred19_InternalLogical
    public final void synpred19_InternalLogical_fragment() throws RecognitionException {   
        // InternalLogical.g:2693:2: ( rule__AndExpr__Group_1__0 )
        // InternalLogical.g:2693:2: rule__AndExpr__Group_1__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__AndExpr__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred19_InternalLogical

    // Delegated rules

    public final boolean synpred19_InternalLogical() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalLogical_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalLogical() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalLogical_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalLogical() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalLogical_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalLogical() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalLogical_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalLogical() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalLogical_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalLogical() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalLogical_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalLogical() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalLogical_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000178000000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000170000002L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000FA800L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000E00000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000000C0800L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000022L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000042L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000082L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000102L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000202L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000400L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000402L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000005000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000004002L});
    }


}
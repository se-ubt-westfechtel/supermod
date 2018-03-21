package de.ubt.ai1.supermod.text.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.ubt.ai1.supermod.text.services.LogicalGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalLogicalParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_K_IFF", "RULE_K_IMP", "RULE_K_OR", "RULE_K_XOR", "RULE_K_MINUS", "RULE_K_NAND", "RULE_K_AND", "RULE_P_OPEN", "RULE_P_CLOSE", "RULE_K_BIG_AND", "RULE_COMMA", "RULE_K_BIG_OR", "RULE_K_BIG_XOR", "RULE_K_BIG_NAND", "RULE_K_NOT", "RULE_WS", "'logical'", "'dimension'", "'{'", "'}'", "'option'", "'invariant'", "'preference'", "'for'", "'default'", "'binding'", "'='", "'unknown'", "'true'", "'false'"
    };
    public static final int RULE_K_BIG_OR=16;
    public static final int RULE_P_OPEN=12;
    public static final int RULE_K_BIG_NAND=18;
    public static final int RULE_K_MINUS=9;
    public static final int RULE_K_AND=11;
    public static final int RULE_K_XOR=8;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_K_IFF=5;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_K_OR=7;
    public static final int RULE_ID=4;
    public static final int RULE_COMMA=15;
    public static final int RULE_WS=20;
    public static final int RULE_K_BIG_XOR=17;
    public static final int RULE_K_BIG_AND=14;
    public static final int RULE_K_NOT=19;
    public static final int RULE_P_CLOSE=13;
    public static final int RULE_K_NAND=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int RULE_K_IMP=6;
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



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private LogicalGrammarAccess grammarAccess;
     	
        public InternalLogicalParser(TokenStream input, LogicalGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "LogicalDimension";	
       	}
       	
       	@Override
       	protected LogicalGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleLogicalDimension"
    // InternalLogical.g:74:1: entryRuleLogicalDimension returns [EObject current=null] : iv_ruleLogicalDimension= ruleLogicalDimension EOF ;
    public final EObject entryRuleLogicalDimension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalDimension = null;


        try {
            // InternalLogical.g:75:2: (iv_ruleLogicalDimension= ruleLogicalDimension EOF )
            // InternalLogical.g:76:2: iv_ruleLogicalDimension= ruleLogicalDimension EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalDimensionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLogicalDimension=ruleLogicalDimension();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalDimension; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicalDimension"


    // $ANTLR start "ruleLogicalDimension"
    // InternalLogical.g:83:1: ruleLogicalDimension returns [EObject current=null] : ( () otherlv_1= 'logical' otherlv_2= 'dimension' ( (lv_dimensionName_3_0= RULE_ID ) ) otherlv_4= '{' ( ( (lv_logicalOptions_5_0= ruleOption ) ) | ( (lv_logicalInvariants_6_0= ruleInvariant ) ) | ( (lv_logicalPreferences_7_0= rulePreference ) ) | ( (lv_logicalDefaults_8_0= ruleDefaultBinding ) ) )* otherlv_9= '}' ) ;
    public final EObject ruleLogicalDimension() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_dimensionName_3_0=null;
        Token otherlv_4=null;
        Token otherlv_9=null;
        EObject lv_logicalOptions_5_0 = null;

        EObject lv_logicalInvariants_6_0 = null;

        EObject lv_logicalPreferences_7_0 = null;

        EObject lv_logicalDefaults_8_0 = null;


         enterRule(); 
            
        try {
            // InternalLogical.g:86:28: ( ( () otherlv_1= 'logical' otherlv_2= 'dimension' ( (lv_dimensionName_3_0= RULE_ID ) ) otherlv_4= '{' ( ( (lv_logicalOptions_5_0= ruleOption ) ) | ( (lv_logicalInvariants_6_0= ruleInvariant ) ) | ( (lv_logicalPreferences_7_0= rulePreference ) ) | ( (lv_logicalDefaults_8_0= ruleDefaultBinding ) ) )* otherlv_9= '}' ) )
            // InternalLogical.g:87:1: ( () otherlv_1= 'logical' otherlv_2= 'dimension' ( (lv_dimensionName_3_0= RULE_ID ) ) otherlv_4= '{' ( ( (lv_logicalOptions_5_0= ruleOption ) ) | ( (lv_logicalInvariants_6_0= ruleInvariant ) ) | ( (lv_logicalPreferences_7_0= rulePreference ) ) | ( (lv_logicalDefaults_8_0= ruleDefaultBinding ) ) )* otherlv_9= '}' )
            {
            // InternalLogical.g:87:1: ( () otherlv_1= 'logical' otherlv_2= 'dimension' ( (lv_dimensionName_3_0= RULE_ID ) ) otherlv_4= '{' ( ( (lv_logicalOptions_5_0= ruleOption ) ) | ( (lv_logicalInvariants_6_0= ruleInvariant ) ) | ( (lv_logicalPreferences_7_0= rulePreference ) ) | ( (lv_logicalDefaults_8_0= ruleDefaultBinding ) ) )* otherlv_9= '}' )
            // InternalLogical.g:87:2: () otherlv_1= 'logical' otherlv_2= 'dimension' ( (lv_dimensionName_3_0= RULE_ID ) ) otherlv_4= '{' ( ( (lv_logicalOptions_5_0= ruleOption ) ) | ( (lv_logicalInvariants_6_0= ruleInvariant ) ) | ( (lv_logicalPreferences_7_0= rulePreference ) ) | ( (lv_logicalDefaults_8_0= ruleDefaultBinding ) ) )* otherlv_9= '}'
            {
            // InternalLogical.g:87:2: ()
            // InternalLogical.g:88:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLogicalDimensionAccess().getLogicalDimensionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,21,FollowSets000.FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLogicalDimensionAccess().getLogicalKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getLogicalDimensionAccess().getDimensionKeyword_2());
                  
            }
            // InternalLogical.g:104:1: ( (lv_dimensionName_3_0= RULE_ID ) )
            // InternalLogical.g:105:1: (lv_dimensionName_3_0= RULE_ID )
            {
            // InternalLogical.g:105:1: (lv_dimensionName_3_0= RULE_ID )
            // InternalLogical.g:106:3: lv_dimensionName_3_0= RULE_ID
            {
            lv_dimensionName_3_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_dimensionName_3_0, grammarAccess.getLogicalDimensionAccess().getDimensionNameIDTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getLogicalDimensionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"dimensionName",
                      		lv_dimensionName_3_0, 
                      		"de.ubt.ai1.supermod.oel.OptionLang.ID");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getLogicalDimensionAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // InternalLogical.g:126:1: ( ( (lv_logicalOptions_5_0= ruleOption ) ) | ( (lv_logicalInvariants_6_0= ruleInvariant ) ) | ( (lv_logicalPreferences_7_0= rulePreference ) ) | ( (lv_logicalDefaults_8_0= ruleDefaultBinding ) ) )*
            loop1:
            do {
                int alt1=5;
                switch ( input.LA(1) ) {
                case 25:
                    {
                    alt1=1;
                    }
                    break;
                case 26:
                    {
                    alt1=2;
                    }
                    break;
                case 27:
                    {
                    alt1=3;
                    }
                    break;
                case 29:
                    {
                    alt1=4;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // InternalLogical.g:126:2: ( (lv_logicalOptions_5_0= ruleOption ) )
            	    {
            	    // InternalLogical.g:126:2: ( (lv_logicalOptions_5_0= ruleOption ) )
            	    // InternalLogical.g:127:1: (lv_logicalOptions_5_0= ruleOption )
            	    {
            	    // InternalLogical.g:127:1: (lv_logicalOptions_5_0= ruleOption )
            	    // InternalLogical.g:128:3: lv_logicalOptions_5_0= ruleOption
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalDimensionAccess().getLogicalOptionsOptionParserRuleCall_5_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_logicalOptions_5_0=ruleOption();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLogicalDimensionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"logicalOptions",
            	              		lv_logicalOptions_5_0, 
            	              		"de.ubt.ai1.supermod.text.Logical.Option");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalLogical.g:145:6: ( (lv_logicalInvariants_6_0= ruleInvariant ) )
            	    {
            	    // InternalLogical.g:145:6: ( (lv_logicalInvariants_6_0= ruleInvariant ) )
            	    // InternalLogical.g:146:1: (lv_logicalInvariants_6_0= ruleInvariant )
            	    {
            	    // InternalLogical.g:146:1: (lv_logicalInvariants_6_0= ruleInvariant )
            	    // InternalLogical.g:147:3: lv_logicalInvariants_6_0= ruleInvariant
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalDimensionAccess().getLogicalInvariantsInvariantParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_logicalInvariants_6_0=ruleInvariant();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLogicalDimensionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"logicalInvariants",
            	              		lv_logicalInvariants_6_0, 
            	              		"de.ubt.ai1.supermod.text.Logical.Invariant");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalLogical.g:164:6: ( (lv_logicalPreferences_7_0= rulePreference ) )
            	    {
            	    // InternalLogical.g:164:6: ( (lv_logicalPreferences_7_0= rulePreference ) )
            	    // InternalLogical.g:165:1: (lv_logicalPreferences_7_0= rulePreference )
            	    {
            	    // InternalLogical.g:165:1: (lv_logicalPreferences_7_0= rulePreference )
            	    // InternalLogical.g:166:3: lv_logicalPreferences_7_0= rulePreference
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalDimensionAccess().getLogicalPreferencesPreferenceParserRuleCall_5_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_logicalPreferences_7_0=rulePreference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLogicalDimensionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"logicalPreferences",
            	              		lv_logicalPreferences_7_0, 
            	              		"de.ubt.ai1.supermod.text.Logical.Preference");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalLogical.g:183:6: ( (lv_logicalDefaults_8_0= ruleDefaultBinding ) )
            	    {
            	    // InternalLogical.g:183:6: ( (lv_logicalDefaults_8_0= ruleDefaultBinding ) )
            	    // InternalLogical.g:184:1: (lv_logicalDefaults_8_0= ruleDefaultBinding )
            	    {
            	    // InternalLogical.g:184:1: (lv_logicalDefaults_8_0= ruleDefaultBinding )
            	    // InternalLogical.g:185:3: lv_logicalDefaults_8_0= ruleDefaultBinding
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalDimensionAccess().getLogicalDefaultsDefaultBindingParserRuleCall_5_3_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_6);
            	    lv_logicalDefaults_8_0=ruleDefaultBinding();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLogicalDimensionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"logicalDefaults",
            	              		lv_logicalDefaults_8_0, 
            	              		"de.ubt.ai1.supermod.text.Logical.DefaultBinding");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_9=(Token)match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getLogicalDimensionAccess().getRightCurlyBracketKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicalDimension"


    // $ANTLR start "entryRuleOption"
    // InternalLogical.g:213:1: entryRuleOption returns [EObject current=null] : iv_ruleOption= ruleOption EOF ;
    public final EObject entryRuleOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOption = null;


        try {
            // InternalLogical.g:214:2: (iv_ruleOption= ruleOption EOF )
            // InternalLogical.g:215:2: iv_ruleOption= ruleOption EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOptionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOption=ruleOption();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOption; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOption"


    // $ANTLR start "ruleOption"
    // InternalLogical.g:222:1: ruleOption returns [EObject current=null] : (otherlv_0= 'option' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // InternalLogical.g:225:28: ( (otherlv_0= 'option' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalLogical.g:226:1: (otherlv_0= 'option' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalLogical.g:226:1: (otherlv_0= 'option' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalLogical.g:226:3: otherlv_0= 'option' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getOptionAccess().getOptionKeyword_0());
                  
            }
            // InternalLogical.g:230:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalLogical.g:231:1: (lv_name_1_0= RULE_ID )
            {
            // InternalLogical.g:231:1: (lv_name_1_0= RULE_ID )
            // InternalLogical.g:232:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getOptionAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getOptionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"de.ubt.ai1.supermod.oel.OptionLang.ID");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOption"


    // $ANTLR start "entryRuleInvariant"
    // InternalLogical.g:256:1: entryRuleInvariant returns [EObject current=null] : iv_ruleInvariant= ruleInvariant EOF ;
    public final EObject entryRuleInvariant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvariant = null;


        try {
            // InternalLogical.g:257:2: (iv_ruleInvariant= ruleInvariant EOF )
            // InternalLogical.g:258:2: iv_ruleInvariant= ruleInvariant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInvariantRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInvariant=ruleInvariant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInvariant; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInvariant"


    // $ANTLR start "ruleInvariant"
    // InternalLogical.g:265:1: ruleInvariant returns [EObject current=null] : (otherlv_0= 'invariant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_optionExpr_3_0= ruleOptionExpr ) ) otherlv_4= '}' ) ;
    public final EObject ruleInvariant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_optionExpr_3_0 = null;


         enterRule(); 
            
        try {
            // InternalLogical.g:268:28: ( (otherlv_0= 'invariant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_optionExpr_3_0= ruleOptionExpr ) ) otherlv_4= '}' ) )
            // InternalLogical.g:269:1: (otherlv_0= 'invariant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_optionExpr_3_0= ruleOptionExpr ) ) otherlv_4= '}' )
            {
            // InternalLogical.g:269:1: (otherlv_0= 'invariant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_optionExpr_3_0= ruleOptionExpr ) ) otherlv_4= '}' )
            // InternalLogical.g:269:3: otherlv_0= 'invariant' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_optionExpr_3_0= ruleOptionExpr ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getInvariantAccess().getInvariantKeyword_0());
                  
            }
            // InternalLogical.g:273:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalLogical.g:274:1: (lv_name_1_0= RULE_ID )
            {
            // InternalLogical.g:274:1: (lv_name_1_0= RULE_ID )
            // InternalLogical.g:275:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getInvariantAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getInvariantRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"de.ubt.ai1.supermod.oel.OptionLang.ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,23,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getInvariantAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // InternalLogical.g:295:1: ( (lv_optionExpr_3_0= ruleOptionExpr ) )
            // InternalLogical.g:296:1: (lv_optionExpr_3_0= ruleOptionExpr )
            {
            // InternalLogical.g:296:1: (lv_optionExpr_3_0= ruleOptionExpr )
            // InternalLogical.g:297:3: lv_optionExpr_3_0= ruleOptionExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInvariantAccess().getOptionExprOptionExprParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_8);
            lv_optionExpr_3_0=ruleOptionExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getInvariantRule());
              	        }
                     		set(
                     			current, 
                     			"optionExpr",
                      		lv_optionExpr_3_0, 
                      		"de.ubt.ai1.supermod.oel.OptionLang.OptionExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getInvariantAccess().getRightCurlyBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInvariant"


    // $ANTLR start "entryRulePreference"
    // InternalLogical.g:325:1: entryRulePreference returns [EObject current=null] : iv_rulePreference= rulePreference EOF ;
    public final EObject entryRulePreference() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreference = null;


        try {
            // InternalLogical.g:326:2: (iv_rulePreference= rulePreference EOF )
            // InternalLogical.g:327:2: iv_rulePreference= rulePreference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPreferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePreference=rulePreference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePreference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePreference"


    // $ANTLR start "rulePreference"
    // InternalLogical.g:334:1: rulePreference returns [EObject current=null] : (otherlv_0= 'preference' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_optionExpr_5_0= ruleOptionExpr ) ) otherlv_6= '}' ) ;
    public final EObject rulePreference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_optionExpr_5_0 = null;


         enterRule(); 
            
        try {
            // InternalLogical.g:337:28: ( (otherlv_0= 'preference' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_optionExpr_5_0= ruleOptionExpr ) ) otherlv_6= '}' ) )
            // InternalLogical.g:338:1: (otherlv_0= 'preference' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_optionExpr_5_0= ruleOptionExpr ) ) otherlv_6= '}' )
            {
            // InternalLogical.g:338:1: (otherlv_0= 'preference' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_optionExpr_5_0= ruleOptionExpr ) ) otherlv_6= '}' )
            // InternalLogical.g:338:3: otherlv_0= 'preference' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_optionExpr_5_0= ruleOptionExpr ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPreferenceAccess().getPreferenceKeyword_0());
                  
            }
            // InternalLogical.g:342:1: ( (lv_name_1_0= RULE_ID ) )
            // InternalLogical.g:343:1: (lv_name_1_0= RULE_ID )
            {
            // InternalLogical.g:343:1: (lv_name_1_0= RULE_ID )
            // InternalLogical.g:344:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getPreferenceAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPreferenceRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"de.ubt.ai1.supermod.oel.OptionLang.ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPreferenceAccess().getForKeyword_2());
                  
            }
            // InternalLogical.g:364:1: ( (otherlv_3= RULE_ID ) )
            // InternalLogical.g:365:1: (otherlv_3= RULE_ID )
            {
            // InternalLogical.g:365:1: (otherlv_3= RULE_ID )
            // InternalLogical.g:366:3: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPreferenceRule());
              	        }
                      
            }
            otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_3, grammarAccess.getPreferenceAccess().getOptionOptionCrossReference_3_0()); 
              	
            }

            }


            }

            otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getPreferenceAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // InternalLogical.g:384:1: ( (lv_optionExpr_5_0= ruleOptionExpr ) )
            // InternalLogical.g:385:1: (lv_optionExpr_5_0= ruleOptionExpr )
            {
            // InternalLogical.g:385:1: (lv_optionExpr_5_0= ruleOptionExpr )
            // InternalLogical.g:386:3: lv_optionExpr_5_0= ruleOptionExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPreferenceAccess().getOptionExprOptionExprParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_8);
            lv_optionExpr_5_0=ruleOptionExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPreferenceRule());
              	        }
                     		set(
                     			current, 
                     			"optionExpr",
                      		lv_optionExpr_5_0, 
                      		"de.ubt.ai1.supermod.oel.OptionLang.OptionExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getPreferenceAccess().getRightCurlyBracketKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePreference"


    // $ANTLR start "entryRuleDefaultBinding"
    // InternalLogical.g:414:1: entryRuleDefaultBinding returns [EObject current=null] : iv_ruleDefaultBinding= ruleDefaultBinding EOF ;
    public final EObject entryRuleDefaultBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefaultBinding = null;


        try {
            // InternalLogical.g:415:2: (iv_ruleDefaultBinding= ruleDefaultBinding EOF )
            // InternalLogical.g:416:2: iv_ruleDefaultBinding= ruleDefaultBinding EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefaultBindingRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDefaultBinding=ruleDefaultBinding();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefaultBinding; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefaultBinding"


    // $ANTLR start "ruleDefaultBinding"
    // InternalLogical.g:423:1: ruleDefaultBinding returns [EObject current=null] : (otherlv_0= 'default' otherlv_1= 'binding' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'for' ( (otherlv_4= RULE_ID ) ) otherlv_5= '=' ( (lv_state_6_0= ruleTristate ) ) ) ;
    public final EObject ruleDefaultBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Enumerator lv_state_6_0 = null;


         enterRule(); 
            
        try {
            // InternalLogical.g:426:28: ( (otherlv_0= 'default' otherlv_1= 'binding' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'for' ( (otherlv_4= RULE_ID ) ) otherlv_5= '=' ( (lv_state_6_0= ruleTristate ) ) ) )
            // InternalLogical.g:427:1: (otherlv_0= 'default' otherlv_1= 'binding' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'for' ( (otherlv_4= RULE_ID ) ) otherlv_5= '=' ( (lv_state_6_0= ruleTristate ) ) )
            {
            // InternalLogical.g:427:1: (otherlv_0= 'default' otherlv_1= 'binding' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'for' ( (otherlv_4= RULE_ID ) ) otherlv_5= '=' ( (lv_state_6_0= ruleTristate ) ) )
            // InternalLogical.g:427:3: otherlv_0= 'default' otherlv_1= 'binding' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'for' ( (otherlv_4= RULE_ID ) ) otherlv_5= '=' ( (lv_state_6_0= ruleTristate ) )
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDefaultBindingAccess().getDefaultKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDefaultBindingAccess().getBindingKeyword_1());
                  
            }
            // InternalLogical.g:435:1: ( (lv_name_2_0= RULE_ID ) )
            // InternalLogical.g:436:1: (lv_name_2_0= RULE_ID )
            {
            // InternalLogical.g:436:1: (lv_name_2_0= RULE_ID )
            // InternalLogical.g:437:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getDefaultBindingAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDefaultBindingRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"de.ubt.ai1.supermod.oel.OptionLang.ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,28,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDefaultBindingAccess().getForKeyword_3());
                  
            }
            // InternalLogical.g:457:1: ( (otherlv_4= RULE_ID ) )
            // InternalLogical.g:458:1: (otherlv_4= RULE_ID )
            {
            // InternalLogical.g:458:1: (otherlv_4= RULE_ID )
            // InternalLogical.g:459:3: otherlv_4= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDefaultBindingRule());
              	        }
                      
            }
            otherlv_4=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_4, grammarAccess.getDefaultBindingAccess().getOptionOptionCrossReference_4_0()); 
              	
            }

            }


            }

            otherlv_5=(Token)match(input,31,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getDefaultBindingAccess().getEqualsSignKeyword_5());
                  
            }
            // InternalLogical.g:477:1: ( (lv_state_6_0= ruleTristate ) )
            // InternalLogical.g:478:1: (lv_state_6_0= ruleTristate )
            {
            // InternalLogical.g:478:1: (lv_state_6_0= ruleTristate )
            // InternalLogical.g:479:3: lv_state_6_0= ruleTristate
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDefaultBindingAccess().getStateTristateEnumRuleCall_6_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_state_6_0=ruleTristate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDefaultBindingRule());
              	        }
                     		set(
                     			current, 
                     			"state",
                      		lv_state_6_0, 
                      		"de.ubt.ai1.supermod.text.Logical.Tristate");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefaultBinding"


    // $ANTLR start "entryRuleOptionExpr"
    // InternalLogical.g:503:1: entryRuleOptionExpr returns [EObject current=null] : iv_ruleOptionExpr= ruleOptionExpr EOF ;
    public final EObject entryRuleOptionExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionExpr = null;


        try {
            // InternalLogical.g:504:2: (iv_ruleOptionExpr= ruleOptionExpr EOF )
            // InternalLogical.g:505:2: iv_ruleOptionExpr= ruleOptionExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOptionExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOptionExpr=ruleOptionExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOptionExpr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOptionExpr"


    // $ANTLR start "ruleOptionExpr"
    // InternalLogical.g:512:1: ruleOptionExpr returns [EObject current=null] : (this_BiconditionalExpr_0= ruleBiconditionalExpr | this_BigExpr_1= ruleBigExpr ) ;
    public final EObject ruleOptionExpr() throws RecognitionException {
        EObject current = null;

        EObject this_BiconditionalExpr_0 = null;

        EObject this_BigExpr_1 = null;


         enterRule(); 
            
        try {
            // InternalLogical.g:515:28: ( (this_BiconditionalExpr_0= ruleBiconditionalExpr | this_BigExpr_1= ruleBigExpr ) )
            // InternalLogical.g:516:1: (this_BiconditionalExpr_0= ruleBiconditionalExpr | this_BigExpr_1= ruleBigExpr )
            {
            // InternalLogical.g:516:1: (this_BiconditionalExpr_0= ruleBiconditionalExpr | this_BigExpr_1= ruleBigExpr )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID||LA2_0==RULE_P_OPEN||LA2_0==RULE_K_NOT) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_K_BIG_AND||(LA2_0>=RULE_K_BIG_OR && LA2_0<=RULE_K_BIG_NAND)) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalLogical.g:517:2: this_BiconditionalExpr_0= ruleBiconditionalExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOptionExprAccess().getBiconditionalExprParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_BiconditionalExpr_0=ruleBiconditionalExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BiconditionalExpr_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalLogical.g:530:2: this_BigExpr_1= ruleBigExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getOptionExprAccess().getBigExprParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_BigExpr_1=ruleBigExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BigExpr_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOptionExpr"


    // $ANTLR start "entryRuleBiconditionalExpr"
    // InternalLogical.g:549:1: entryRuleBiconditionalExpr returns [EObject current=null] : iv_ruleBiconditionalExpr= ruleBiconditionalExpr EOF ;
    public final EObject entryRuleBiconditionalExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBiconditionalExpr = null;


        try {
            // InternalLogical.g:550:2: (iv_ruleBiconditionalExpr= ruleBiconditionalExpr EOF )
            // InternalLogical.g:551:2: iv_ruleBiconditionalExpr= ruleBiconditionalExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBiconditionalExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBiconditionalExpr=ruleBiconditionalExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBiconditionalExpr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBiconditionalExpr"


    // $ANTLR start "ruleBiconditionalExpr"
    // InternalLogical.g:558:1: ruleBiconditionalExpr returns [EObject current=null] : (this_ImpliesExpr_0= ruleImpliesExpr ( () this_K_IFF_2= RULE_K_IFF ( (lv_right_3_0= ruleBiconditionalExpr ) ) )* ) ;
    public final EObject ruleBiconditionalExpr() throws RecognitionException {
        EObject current = null;

        Token this_K_IFF_2=null;
        EObject this_ImpliesExpr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalLogical.g:561:28: ( (this_ImpliesExpr_0= ruleImpliesExpr ( () this_K_IFF_2= RULE_K_IFF ( (lv_right_3_0= ruleBiconditionalExpr ) ) )* ) )
            // InternalLogical.g:562:1: (this_ImpliesExpr_0= ruleImpliesExpr ( () this_K_IFF_2= RULE_K_IFF ( (lv_right_3_0= ruleBiconditionalExpr ) ) )* )
            {
            // InternalLogical.g:562:1: (this_ImpliesExpr_0= ruleImpliesExpr ( () this_K_IFF_2= RULE_K_IFF ( (lv_right_3_0= ruleBiconditionalExpr ) ) )* )
            // InternalLogical.g:563:2: this_ImpliesExpr_0= ruleImpliesExpr ( () this_K_IFF_2= RULE_K_IFF ( (lv_right_3_0= ruleBiconditionalExpr ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBiconditionalExprAccess().getImpliesExprParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_13);
            this_ImpliesExpr_0=ruleImpliesExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ImpliesExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalLogical.g:574:1: ( () this_K_IFF_2= RULE_K_IFF ( (lv_right_3_0= ruleBiconditionalExpr ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_K_IFF) ) {
                    int LA3_2 = input.LA(2);

                    if ( (synpred6_InternalLogical()) ) {
                        alt3=1;
                    }


                }


                switch (alt3) {
            	case 1 :
            	    // InternalLogical.g:574:2: () this_K_IFF_2= RULE_K_IFF ( (lv_right_3_0= ruleBiconditionalExpr ) )
            	    {
            	    // InternalLogical.g:574:2: ()
            	    // InternalLogical.g:575:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getBiconditionalExprAccess().getBiconditionalExprLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    this_K_IFF_2=(Token)match(input,RULE_K_IFF,FollowSets000.FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_K_IFF_2, grammarAccess.getBiconditionalExprAccess().getK_IFFTerminalRuleCall_1_1()); 
            	          
            	    }
            	    // InternalLogical.g:587:1: ( (lv_right_3_0= ruleBiconditionalExpr ) )
            	    // InternalLogical.g:588:1: (lv_right_3_0= ruleBiconditionalExpr )
            	    {
            	    // InternalLogical.g:588:1: (lv_right_3_0= ruleBiconditionalExpr )
            	    // InternalLogical.g:589:3: lv_right_3_0= ruleBiconditionalExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBiconditionalExprAccess().getRightBiconditionalExprParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_13);
            	    lv_right_3_0=ruleBiconditionalExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBiconditionalExprRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"de.ubt.ai1.supermod.oel.OptionLang.BiconditionalExpr");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBiconditionalExpr"


    // $ANTLR start "entryRuleImpliesExpr"
    // InternalLogical.g:613:1: entryRuleImpliesExpr returns [EObject current=null] : iv_ruleImpliesExpr= ruleImpliesExpr EOF ;
    public final EObject entryRuleImpliesExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImpliesExpr = null;


        try {
            // InternalLogical.g:614:2: (iv_ruleImpliesExpr= ruleImpliesExpr EOF )
            // InternalLogical.g:615:2: iv_ruleImpliesExpr= ruleImpliesExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImpliesExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleImpliesExpr=ruleImpliesExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImpliesExpr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImpliesExpr"


    // $ANTLR start "ruleImpliesExpr"
    // InternalLogical.g:622:1: ruleImpliesExpr returns [EObject current=null] : (this_OrExpr_0= ruleOrExpr ( () this_K_IMP_2= RULE_K_IMP ( (lv_right_3_0= ruleOrExpr ) ) )* ) ;
    public final EObject ruleImpliesExpr() throws RecognitionException {
        EObject current = null;

        Token this_K_IMP_2=null;
        EObject this_OrExpr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalLogical.g:625:28: ( (this_OrExpr_0= ruleOrExpr ( () this_K_IMP_2= RULE_K_IMP ( (lv_right_3_0= ruleOrExpr ) ) )* ) )
            // InternalLogical.g:626:1: (this_OrExpr_0= ruleOrExpr ( () this_K_IMP_2= RULE_K_IMP ( (lv_right_3_0= ruleOrExpr ) ) )* )
            {
            // InternalLogical.g:626:1: (this_OrExpr_0= ruleOrExpr ( () this_K_IMP_2= RULE_K_IMP ( (lv_right_3_0= ruleOrExpr ) ) )* )
            // InternalLogical.g:627:2: this_OrExpr_0= ruleOrExpr ( () this_K_IMP_2= RULE_K_IMP ( (lv_right_3_0= ruleOrExpr ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getImpliesExprAccess().getOrExprParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_15);
            this_OrExpr_0=ruleOrExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_OrExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalLogical.g:638:1: ( () this_K_IMP_2= RULE_K_IMP ( (lv_right_3_0= ruleOrExpr ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_K_IMP) ) {
                    int LA4_2 = input.LA(2);

                    if ( (synpred7_InternalLogical()) ) {
                        alt4=1;
                    }


                }


                switch (alt4) {
            	case 1 :
            	    // InternalLogical.g:638:2: () this_K_IMP_2= RULE_K_IMP ( (lv_right_3_0= ruleOrExpr ) )
            	    {
            	    // InternalLogical.g:638:2: ()
            	    // InternalLogical.g:639:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getImpliesExprAccess().getImpliesExprLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    this_K_IMP_2=(Token)match(input,RULE_K_IMP,FollowSets000.FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_K_IMP_2, grammarAccess.getImpliesExprAccess().getK_IMPTerminalRuleCall_1_1()); 
            	          
            	    }
            	    // InternalLogical.g:651:1: ( (lv_right_3_0= ruleOrExpr ) )
            	    // InternalLogical.g:652:1: (lv_right_3_0= ruleOrExpr )
            	    {
            	    // InternalLogical.g:652:1: (lv_right_3_0= ruleOrExpr )
            	    // InternalLogical.g:653:3: lv_right_3_0= ruleOrExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getImpliesExprAccess().getRightOrExprParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_15);
            	    lv_right_3_0=ruleOrExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getImpliesExprRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"de.ubt.ai1.supermod.oel.OptionLang.OrExpr");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImpliesExpr"


    // $ANTLR start "entryRuleOrExpr"
    // InternalLogical.g:677:1: entryRuleOrExpr returns [EObject current=null] : iv_ruleOrExpr= ruleOrExpr EOF ;
    public final EObject entryRuleOrExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpr = null;


        try {
            // InternalLogical.g:678:2: (iv_ruleOrExpr= ruleOrExpr EOF )
            // InternalLogical.g:679:2: iv_ruleOrExpr= ruleOrExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOrExpr=ruleOrExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrExpr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrExpr"


    // $ANTLR start "ruleOrExpr"
    // InternalLogical.g:686:1: ruleOrExpr returns [EObject current=null] : (this_XorExpr_0= ruleXorExpr ( () this_K_OR_2= RULE_K_OR ( (lv_right_3_0= ruleXorExpr ) ) )* ) ;
    public final EObject ruleOrExpr() throws RecognitionException {
        EObject current = null;

        Token this_K_OR_2=null;
        EObject this_XorExpr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalLogical.g:689:28: ( (this_XorExpr_0= ruleXorExpr ( () this_K_OR_2= RULE_K_OR ( (lv_right_3_0= ruleXorExpr ) ) )* ) )
            // InternalLogical.g:690:1: (this_XorExpr_0= ruleXorExpr ( () this_K_OR_2= RULE_K_OR ( (lv_right_3_0= ruleXorExpr ) ) )* )
            {
            // InternalLogical.g:690:1: (this_XorExpr_0= ruleXorExpr ( () this_K_OR_2= RULE_K_OR ( (lv_right_3_0= ruleXorExpr ) ) )* )
            // InternalLogical.g:691:2: this_XorExpr_0= ruleXorExpr ( () this_K_OR_2= RULE_K_OR ( (lv_right_3_0= ruleXorExpr ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOrExprAccess().getXorExprParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_16);
            this_XorExpr_0=ruleXorExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XorExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalLogical.g:702:1: ( () this_K_OR_2= RULE_K_OR ( (lv_right_3_0= ruleXorExpr ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_K_OR) ) {
                    int LA5_2 = input.LA(2);

                    if ( (synpred8_InternalLogical()) ) {
                        alt5=1;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // InternalLogical.g:702:2: () this_K_OR_2= RULE_K_OR ( (lv_right_3_0= ruleXorExpr ) )
            	    {
            	    // InternalLogical.g:702:2: ()
            	    // InternalLogical.g:703:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getOrExprAccess().getOrExprLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    this_K_OR_2=(Token)match(input,RULE_K_OR,FollowSets000.FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_K_OR_2, grammarAccess.getOrExprAccess().getK_ORTerminalRuleCall_1_1()); 
            	          
            	    }
            	    // InternalLogical.g:715:1: ( (lv_right_3_0= ruleXorExpr ) )
            	    // InternalLogical.g:716:1: (lv_right_3_0= ruleXorExpr )
            	    {
            	    // InternalLogical.g:716:1: (lv_right_3_0= ruleXorExpr )
            	    // InternalLogical.g:717:3: lv_right_3_0= ruleXorExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrExprAccess().getRightXorExprParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_16);
            	    lv_right_3_0=ruleXorExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getOrExprRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"de.ubt.ai1.supermod.oel.OptionLang.XorExpr");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrExpr"


    // $ANTLR start "entryRuleXorExpr"
    // InternalLogical.g:741:1: entryRuleXorExpr returns [EObject current=null] : iv_ruleXorExpr= ruleXorExpr EOF ;
    public final EObject entryRuleXorExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXorExpr = null;


        try {
            // InternalLogical.g:742:2: (iv_ruleXorExpr= ruleXorExpr EOF )
            // InternalLogical.g:743:2: iv_ruleXorExpr= ruleXorExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXorExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleXorExpr=ruleXorExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXorExpr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXorExpr"


    // $ANTLR start "ruleXorExpr"
    // InternalLogical.g:750:1: ruleXorExpr returns [EObject current=null] : (this_MinusExpr_0= ruleMinusExpr ( () this_K_XOR_2= RULE_K_XOR ( (lv_right_3_0= ruleMinusExpr ) ) )* ) ;
    public final EObject ruleXorExpr() throws RecognitionException {
        EObject current = null;

        Token this_K_XOR_2=null;
        EObject this_MinusExpr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalLogical.g:753:28: ( (this_MinusExpr_0= ruleMinusExpr ( () this_K_XOR_2= RULE_K_XOR ( (lv_right_3_0= ruleMinusExpr ) ) )* ) )
            // InternalLogical.g:754:1: (this_MinusExpr_0= ruleMinusExpr ( () this_K_XOR_2= RULE_K_XOR ( (lv_right_3_0= ruleMinusExpr ) ) )* )
            {
            // InternalLogical.g:754:1: (this_MinusExpr_0= ruleMinusExpr ( () this_K_XOR_2= RULE_K_XOR ( (lv_right_3_0= ruleMinusExpr ) ) )* )
            // InternalLogical.g:755:2: this_MinusExpr_0= ruleMinusExpr ( () this_K_XOR_2= RULE_K_XOR ( (lv_right_3_0= ruleMinusExpr ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXorExprAccess().getMinusExprParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_17);
            this_MinusExpr_0=ruleMinusExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MinusExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalLogical.g:766:1: ( () this_K_XOR_2= RULE_K_XOR ( (lv_right_3_0= ruleMinusExpr ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_K_XOR) ) {
                    int LA6_2 = input.LA(2);

                    if ( (synpred9_InternalLogical()) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // InternalLogical.g:766:2: () this_K_XOR_2= RULE_K_XOR ( (lv_right_3_0= ruleMinusExpr ) )
            	    {
            	    // InternalLogical.g:766:2: ()
            	    // InternalLogical.g:767:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getXorExprAccess().getXorExprLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    this_K_XOR_2=(Token)match(input,RULE_K_XOR,FollowSets000.FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_K_XOR_2, grammarAccess.getXorExprAccess().getK_XORTerminalRuleCall_1_1()); 
            	          
            	    }
            	    // InternalLogical.g:779:1: ( (lv_right_3_0= ruleMinusExpr ) )
            	    // InternalLogical.g:780:1: (lv_right_3_0= ruleMinusExpr )
            	    {
            	    // InternalLogical.g:780:1: (lv_right_3_0= ruleMinusExpr )
            	    // InternalLogical.g:781:3: lv_right_3_0= ruleMinusExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXorExprAccess().getRightMinusExprParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_17);
            	    lv_right_3_0=ruleMinusExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getXorExprRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"de.ubt.ai1.supermod.oel.OptionLang.MinusExpr");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXorExpr"


    // $ANTLR start "entryRuleMinusExpr"
    // InternalLogical.g:805:1: entryRuleMinusExpr returns [EObject current=null] : iv_ruleMinusExpr= ruleMinusExpr EOF ;
    public final EObject entryRuleMinusExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinusExpr = null;


        try {
            // InternalLogical.g:806:2: (iv_ruleMinusExpr= ruleMinusExpr EOF )
            // InternalLogical.g:807:2: iv_ruleMinusExpr= ruleMinusExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMinusExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMinusExpr=ruleMinusExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMinusExpr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMinusExpr"


    // $ANTLR start "ruleMinusExpr"
    // InternalLogical.g:814:1: ruleMinusExpr returns [EObject current=null] : (this_NandExpr_0= ruleNandExpr ( () this_K_MINUS_2= RULE_K_MINUS ( (lv_right_3_0= ruleNandExpr ) ) )* ) ;
    public final EObject ruleMinusExpr() throws RecognitionException {
        EObject current = null;

        Token this_K_MINUS_2=null;
        EObject this_NandExpr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalLogical.g:817:28: ( (this_NandExpr_0= ruleNandExpr ( () this_K_MINUS_2= RULE_K_MINUS ( (lv_right_3_0= ruleNandExpr ) ) )* ) )
            // InternalLogical.g:818:1: (this_NandExpr_0= ruleNandExpr ( () this_K_MINUS_2= RULE_K_MINUS ( (lv_right_3_0= ruleNandExpr ) ) )* )
            {
            // InternalLogical.g:818:1: (this_NandExpr_0= ruleNandExpr ( () this_K_MINUS_2= RULE_K_MINUS ( (lv_right_3_0= ruleNandExpr ) ) )* )
            // InternalLogical.g:819:2: this_NandExpr_0= ruleNandExpr ( () this_K_MINUS_2= RULE_K_MINUS ( (lv_right_3_0= ruleNandExpr ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMinusExprAccess().getNandExprParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_18);
            this_NandExpr_0=ruleNandExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NandExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalLogical.g:830:1: ( () this_K_MINUS_2= RULE_K_MINUS ( (lv_right_3_0= ruleNandExpr ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_K_MINUS) ) {
                    int LA7_2 = input.LA(2);

                    if ( (synpred10_InternalLogical()) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // InternalLogical.g:830:2: () this_K_MINUS_2= RULE_K_MINUS ( (lv_right_3_0= ruleNandExpr ) )
            	    {
            	    // InternalLogical.g:830:2: ()
            	    // InternalLogical.g:831:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getMinusExprAccess().getMinusExprLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    this_K_MINUS_2=(Token)match(input,RULE_K_MINUS,FollowSets000.FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_K_MINUS_2, grammarAccess.getMinusExprAccess().getK_MINUSTerminalRuleCall_1_1()); 
            	          
            	    }
            	    // InternalLogical.g:843:1: ( (lv_right_3_0= ruleNandExpr ) )
            	    // InternalLogical.g:844:1: (lv_right_3_0= ruleNandExpr )
            	    {
            	    // InternalLogical.g:844:1: (lv_right_3_0= ruleNandExpr )
            	    // InternalLogical.g:845:3: lv_right_3_0= ruleNandExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMinusExprAccess().getRightNandExprParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_18);
            	    lv_right_3_0=ruleNandExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMinusExprRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"de.ubt.ai1.supermod.oel.OptionLang.NandExpr");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMinusExpr"


    // $ANTLR start "entryRuleNandExpr"
    // InternalLogical.g:869:1: entryRuleNandExpr returns [EObject current=null] : iv_ruleNandExpr= ruleNandExpr EOF ;
    public final EObject entryRuleNandExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNandExpr = null;


        try {
            // InternalLogical.g:870:2: (iv_ruleNandExpr= ruleNandExpr EOF )
            // InternalLogical.g:871:2: iv_ruleNandExpr= ruleNandExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNandExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNandExpr=ruleNandExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNandExpr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNandExpr"


    // $ANTLR start "ruleNandExpr"
    // InternalLogical.g:878:1: ruleNandExpr returns [EObject current=null] : (this_AndExpr_0= ruleAndExpr ( () this_K_NAND_2= RULE_K_NAND ( (lv_right_3_0= ruleAndExpr ) ) )* ) ;
    public final EObject ruleNandExpr() throws RecognitionException {
        EObject current = null;

        Token this_K_NAND_2=null;
        EObject this_AndExpr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalLogical.g:881:28: ( (this_AndExpr_0= ruleAndExpr ( () this_K_NAND_2= RULE_K_NAND ( (lv_right_3_0= ruleAndExpr ) ) )* ) )
            // InternalLogical.g:882:1: (this_AndExpr_0= ruleAndExpr ( () this_K_NAND_2= RULE_K_NAND ( (lv_right_3_0= ruleAndExpr ) ) )* )
            {
            // InternalLogical.g:882:1: (this_AndExpr_0= ruleAndExpr ( () this_K_NAND_2= RULE_K_NAND ( (lv_right_3_0= ruleAndExpr ) ) )* )
            // InternalLogical.g:883:2: this_AndExpr_0= ruleAndExpr ( () this_K_NAND_2= RULE_K_NAND ( (lv_right_3_0= ruleAndExpr ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNandExprAccess().getAndExprParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_19);
            this_AndExpr_0=ruleAndExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AndExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalLogical.g:894:1: ( () this_K_NAND_2= RULE_K_NAND ( (lv_right_3_0= ruleAndExpr ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_K_NAND) ) {
                    int LA8_2 = input.LA(2);

                    if ( (synpred11_InternalLogical()) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // InternalLogical.g:894:2: () this_K_NAND_2= RULE_K_NAND ( (lv_right_3_0= ruleAndExpr ) )
            	    {
            	    // InternalLogical.g:894:2: ()
            	    // InternalLogical.g:895:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getNandExprAccess().getNandExprLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    this_K_NAND_2=(Token)match(input,RULE_K_NAND,FollowSets000.FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_K_NAND_2, grammarAccess.getNandExprAccess().getK_NANDTerminalRuleCall_1_1()); 
            	          
            	    }
            	    // InternalLogical.g:907:1: ( (lv_right_3_0= ruleAndExpr ) )
            	    // InternalLogical.g:908:1: (lv_right_3_0= ruleAndExpr )
            	    {
            	    // InternalLogical.g:908:1: (lv_right_3_0= ruleAndExpr )
            	    // InternalLogical.g:909:3: lv_right_3_0= ruleAndExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNandExprAccess().getRightAndExprParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_19);
            	    lv_right_3_0=ruleAndExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getNandExprRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"de.ubt.ai1.supermod.oel.OptionLang.AndExpr");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNandExpr"


    // $ANTLR start "entryRuleAndExpr"
    // InternalLogical.g:933:1: entryRuleAndExpr returns [EObject current=null] : iv_ruleAndExpr= ruleAndExpr EOF ;
    public final EObject entryRuleAndExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpr = null;


        try {
            // InternalLogical.g:934:2: (iv_ruleAndExpr= ruleAndExpr EOF )
            // InternalLogical.g:935:2: iv_ruleAndExpr= ruleAndExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAndExpr=ruleAndExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndExpr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndExpr"


    // $ANTLR start "ruleAndExpr"
    // InternalLogical.g:942:1: ruleAndExpr returns [EObject current=null] : (this_PrimaryExpr_0= rulePrimaryExpr ( () this_K_AND_2= RULE_K_AND ( (lv_right_3_0= rulePrimaryExpr ) ) )* ) ;
    public final EObject ruleAndExpr() throws RecognitionException {
        EObject current = null;

        Token this_K_AND_2=null;
        EObject this_PrimaryExpr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalLogical.g:945:28: ( (this_PrimaryExpr_0= rulePrimaryExpr ( () this_K_AND_2= RULE_K_AND ( (lv_right_3_0= rulePrimaryExpr ) ) )* ) )
            // InternalLogical.g:946:1: (this_PrimaryExpr_0= rulePrimaryExpr ( () this_K_AND_2= RULE_K_AND ( (lv_right_3_0= rulePrimaryExpr ) ) )* )
            {
            // InternalLogical.g:946:1: (this_PrimaryExpr_0= rulePrimaryExpr ( () this_K_AND_2= RULE_K_AND ( (lv_right_3_0= rulePrimaryExpr ) ) )* )
            // InternalLogical.g:947:2: this_PrimaryExpr_0= rulePrimaryExpr ( () this_K_AND_2= RULE_K_AND ( (lv_right_3_0= rulePrimaryExpr ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAndExprAccess().getPrimaryExprParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_20);
            this_PrimaryExpr_0=rulePrimaryExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PrimaryExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalLogical.g:958:1: ( () this_K_AND_2= RULE_K_AND ( (lv_right_3_0= rulePrimaryExpr ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_K_AND) ) {
                    int LA9_2 = input.LA(2);

                    if ( (synpred12_InternalLogical()) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // InternalLogical.g:958:2: () this_K_AND_2= RULE_K_AND ( (lv_right_3_0= rulePrimaryExpr ) )
            	    {
            	    // InternalLogical.g:958:2: ()
            	    // InternalLogical.g:959:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAndExprAccess().getAndExprLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    this_K_AND_2=(Token)match(input,RULE_K_AND,FollowSets000.FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_K_AND_2, grammarAccess.getAndExprAccess().getK_ANDTerminalRuleCall_1_1()); 
            	          
            	    }
            	    // InternalLogical.g:971:1: ( (lv_right_3_0= rulePrimaryExpr ) )
            	    // InternalLogical.g:972:1: (lv_right_3_0= rulePrimaryExpr )
            	    {
            	    // InternalLogical.g:972:1: (lv_right_3_0= rulePrimaryExpr )
            	    // InternalLogical.g:973:3: lv_right_3_0= rulePrimaryExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAndExprAccess().getRightPrimaryExprParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_20);
            	    lv_right_3_0=rulePrimaryExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAndExprRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"de.ubt.ai1.supermod.oel.OptionLang.PrimaryExpr");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndExpr"


    // $ANTLR start "entryRulePrimaryExpr"
    // InternalLogical.g:997:1: entryRulePrimaryExpr returns [EObject current=null] : iv_rulePrimaryExpr= rulePrimaryExpr EOF ;
    public final EObject entryRulePrimaryExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpr = null;


        try {
            // InternalLogical.g:998:2: (iv_rulePrimaryExpr= rulePrimaryExpr EOF )
            // InternalLogical.g:999:2: iv_rulePrimaryExpr= rulePrimaryExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePrimaryExpr=rulePrimaryExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExpr"


    // $ANTLR start "rulePrimaryExpr"
    // InternalLogical.g:1006:1: rulePrimaryExpr returns [EObject current=null] : ( (this_P_OPEN_0= RULE_P_OPEN this_ImpliesExpr_1= ruleImpliesExpr this_P_CLOSE_2= RULE_P_CLOSE ) | this_OptionRef_3= ruleOptionRef | this_NegExpr_4= ruleNegExpr ) ;
    public final EObject rulePrimaryExpr() throws RecognitionException {
        EObject current = null;

        Token this_P_OPEN_0=null;
        Token this_P_CLOSE_2=null;
        EObject this_ImpliesExpr_1 = null;

        EObject this_OptionRef_3 = null;

        EObject this_NegExpr_4 = null;


         enterRule(); 
            
        try {
            // InternalLogical.g:1009:28: ( ( (this_P_OPEN_0= RULE_P_OPEN this_ImpliesExpr_1= ruleImpliesExpr this_P_CLOSE_2= RULE_P_CLOSE ) | this_OptionRef_3= ruleOptionRef | this_NegExpr_4= ruleNegExpr ) )
            // InternalLogical.g:1010:1: ( (this_P_OPEN_0= RULE_P_OPEN this_ImpliesExpr_1= ruleImpliesExpr this_P_CLOSE_2= RULE_P_CLOSE ) | this_OptionRef_3= ruleOptionRef | this_NegExpr_4= ruleNegExpr )
            {
            // InternalLogical.g:1010:1: ( (this_P_OPEN_0= RULE_P_OPEN this_ImpliesExpr_1= ruleImpliesExpr this_P_CLOSE_2= RULE_P_CLOSE ) | this_OptionRef_3= ruleOptionRef | this_NegExpr_4= ruleNegExpr )
            int alt10=3;
            switch ( input.LA(1) ) {
            case RULE_P_OPEN:
                {
                alt10=1;
                }
                break;
            case RULE_ID:
                {
                alt10=2;
                }
                break;
            case RULE_K_NOT:
                {
                alt10=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalLogical.g:1010:2: (this_P_OPEN_0= RULE_P_OPEN this_ImpliesExpr_1= ruleImpliesExpr this_P_CLOSE_2= RULE_P_CLOSE )
                    {
                    // InternalLogical.g:1010:2: (this_P_OPEN_0= RULE_P_OPEN this_ImpliesExpr_1= ruleImpliesExpr this_P_CLOSE_2= RULE_P_CLOSE )
                    // InternalLogical.g:1010:3: this_P_OPEN_0= RULE_P_OPEN this_ImpliesExpr_1= ruleImpliesExpr this_P_CLOSE_2= RULE_P_CLOSE
                    {
                    this_P_OPEN_0=(Token)match(input,RULE_P_OPEN,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_P_OPEN_0, grammarAccess.getPrimaryExprAccess().getP_OPENTerminalRuleCall_0_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExprAccess().getImpliesExprParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_21);
                    this_ImpliesExpr_1=ruleImpliesExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ImpliesExpr_1; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    this_P_CLOSE_2=(Token)match(input,RULE_P_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_P_CLOSE_2, grammarAccess.getPrimaryExprAccess().getP_CLOSETerminalRuleCall_0_2()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalLogical.g:1032:2: this_OptionRef_3= ruleOptionRef
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExprAccess().getOptionRefParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_OptionRef_3=ruleOptionRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_OptionRef_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalLogical.g:1045:2: this_NegExpr_4= ruleNegExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExprAccess().getNegExprParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NegExpr_4=ruleNegExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NegExpr_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryExpr"


    // $ANTLR start "entryRuleBigExpr"
    // InternalLogical.g:1064:1: entryRuleBigExpr returns [EObject current=null] : iv_ruleBigExpr= ruleBigExpr EOF ;
    public final EObject entryRuleBigExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBigExpr = null;


        try {
            // InternalLogical.g:1065:2: (iv_ruleBigExpr= ruleBigExpr EOF )
            // InternalLogical.g:1066:2: iv_ruleBigExpr= ruleBigExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBigExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBigExpr=ruleBigExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBigExpr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBigExpr"


    // $ANTLR start "ruleBigExpr"
    // InternalLogical.g:1073:1: ruleBigExpr returns [EObject current=null] : (this_BigAndExpr_0= ruleBigAndExpr | this_BigOrExpr_1= ruleBigOrExpr | this_BigXorExpr_2= ruleBigXorExpr | this_BigNandExpr_3= ruleBigNandExpr ) ;
    public final EObject ruleBigExpr() throws RecognitionException {
        EObject current = null;

        EObject this_BigAndExpr_0 = null;

        EObject this_BigOrExpr_1 = null;

        EObject this_BigXorExpr_2 = null;

        EObject this_BigNandExpr_3 = null;


         enterRule(); 
            
        try {
            // InternalLogical.g:1076:28: ( (this_BigAndExpr_0= ruleBigAndExpr | this_BigOrExpr_1= ruleBigOrExpr | this_BigXorExpr_2= ruleBigXorExpr | this_BigNandExpr_3= ruleBigNandExpr ) )
            // InternalLogical.g:1077:1: (this_BigAndExpr_0= ruleBigAndExpr | this_BigOrExpr_1= ruleBigOrExpr | this_BigXorExpr_2= ruleBigXorExpr | this_BigNandExpr_3= ruleBigNandExpr )
            {
            // InternalLogical.g:1077:1: (this_BigAndExpr_0= ruleBigAndExpr | this_BigOrExpr_1= ruleBigOrExpr | this_BigXorExpr_2= ruleBigXorExpr | this_BigNandExpr_3= ruleBigNandExpr )
            int alt11=4;
            switch ( input.LA(1) ) {
            case RULE_K_BIG_AND:
                {
                alt11=1;
                }
                break;
            case RULE_K_BIG_OR:
                {
                alt11=2;
                }
                break;
            case RULE_K_BIG_XOR:
                {
                alt11=3;
                }
                break;
            case RULE_K_BIG_NAND:
                {
                alt11=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalLogical.g:1078:2: this_BigAndExpr_0= ruleBigAndExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBigExprAccess().getBigAndExprParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_BigAndExpr_0=ruleBigAndExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BigAndExpr_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalLogical.g:1091:2: this_BigOrExpr_1= ruleBigOrExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBigExprAccess().getBigOrExprParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_BigOrExpr_1=ruleBigOrExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BigOrExpr_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalLogical.g:1104:2: this_BigXorExpr_2= ruleBigXorExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBigExprAccess().getBigXorExprParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_BigXorExpr_2=ruleBigXorExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BigXorExpr_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalLogical.g:1117:2: this_BigNandExpr_3= ruleBigNandExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBigExprAccess().getBigNandExprParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_BigNandExpr_3=ruleBigNandExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BigNandExpr_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBigExpr"


    // $ANTLR start "entryRuleBigAndExpr"
    // InternalLogical.g:1136:1: entryRuleBigAndExpr returns [EObject current=null] : iv_ruleBigAndExpr= ruleBigAndExpr EOF ;
    public final EObject entryRuleBigAndExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBigAndExpr = null;


        try {
            // InternalLogical.g:1137:2: (iv_ruleBigAndExpr= ruleBigAndExpr EOF )
            // InternalLogical.g:1138:2: iv_ruleBigAndExpr= ruleBigAndExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBigAndExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBigAndExpr=ruleBigAndExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBigAndExpr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBigAndExpr"


    // $ANTLR start "ruleBigAndExpr"
    // InternalLogical.g:1145:1: ruleBigAndExpr returns [EObject current=null] : (this_K_BIG_AND_0= RULE_K_BIG_AND this_P_OPEN_1= RULE_P_OPEN ( (lv_children_2_0= ruleOptionExpr ) ) (this_COMMA_3= RULE_COMMA ( (lv_children_4_0= ruleOptionExpr ) ) )* this_P_CLOSE_5= RULE_P_CLOSE ) ;
    public final EObject ruleBigAndExpr() throws RecognitionException {
        EObject current = null;

        Token this_K_BIG_AND_0=null;
        Token this_P_OPEN_1=null;
        Token this_COMMA_3=null;
        Token this_P_CLOSE_5=null;
        EObject lv_children_2_0 = null;

        EObject lv_children_4_0 = null;


         enterRule(); 
            
        try {
            // InternalLogical.g:1148:28: ( (this_K_BIG_AND_0= RULE_K_BIG_AND this_P_OPEN_1= RULE_P_OPEN ( (lv_children_2_0= ruleOptionExpr ) ) (this_COMMA_3= RULE_COMMA ( (lv_children_4_0= ruleOptionExpr ) ) )* this_P_CLOSE_5= RULE_P_CLOSE ) )
            // InternalLogical.g:1149:1: (this_K_BIG_AND_0= RULE_K_BIG_AND this_P_OPEN_1= RULE_P_OPEN ( (lv_children_2_0= ruleOptionExpr ) ) (this_COMMA_3= RULE_COMMA ( (lv_children_4_0= ruleOptionExpr ) ) )* this_P_CLOSE_5= RULE_P_CLOSE )
            {
            // InternalLogical.g:1149:1: (this_K_BIG_AND_0= RULE_K_BIG_AND this_P_OPEN_1= RULE_P_OPEN ( (lv_children_2_0= ruleOptionExpr ) ) (this_COMMA_3= RULE_COMMA ( (lv_children_4_0= ruleOptionExpr ) ) )* this_P_CLOSE_5= RULE_P_CLOSE )
            // InternalLogical.g:1149:2: this_K_BIG_AND_0= RULE_K_BIG_AND this_P_OPEN_1= RULE_P_OPEN ( (lv_children_2_0= ruleOptionExpr ) ) (this_COMMA_3= RULE_COMMA ( (lv_children_4_0= ruleOptionExpr ) ) )* this_P_CLOSE_5= RULE_P_CLOSE
            {
            this_K_BIG_AND_0=(Token)match(input,RULE_K_BIG_AND,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_K_BIG_AND_0, grammarAccess.getBigAndExprAccess().getK_BIG_ANDTerminalRuleCall_0()); 
                  
            }
            this_P_OPEN_1=(Token)match(input,RULE_P_OPEN,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_P_OPEN_1, grammarAccess.getBigAndExprAccess().getP_OPENTerminalRuleCall_1()); 
                  
            }
            // InternalLogical.g:1157:1: ( (lv_children_2_0= ruleOptionExpr ) )
            // InternalLogical.g:1158:1: (lv_children_2_0= ruleOptionExpr )
            {
            // InternalLogical.g:1158:1: (lv_children_2_0= ruleOptionExpr )
            // InternalLogical.g:1159:3: lv_children_2_0= ruleOptionExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBigAndExprAccess().getChildrenOptionExprParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_23);
            lv_children_2_0=ruleOptionExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBigAndExprRule());
              	        }
                     		add(
                     			current, 
                     			"children",
                      		lv_children_2_0, 
                      		"de.ubt.ai1.supermod.oel.OptionLang.OptionExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalLogical.g:1175:2: (this_COMMA_3= RULE_COMMA ( (lv_children_4_0= ruleOptionExpr ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_COMMA) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalLogical.g:1175:3: this_COMMA_3= RULE_COMMA ( (lv_children_4_0= ruleOptionExpr ) )
            	    {
            	    this_COMMA_3=(Token)match(input,RULE_COMMA,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_3, grammarAccess.getBigAndExprAccess().getCOMMATerminalRuleCall_3_0()); 
            	          
            	    }
            	    // InternalLogical.g:1179:1: ( (lv_children_4_0= ruleOptionExpr ) )
            	    // InternalLogical.g:1180:1: (lv_children_4_0= ruleOptionExpr )
            	    {
            	    // InternalLogical.g:1180:1: (lv_children_4_0= ruleOptionExpr )
            	    // InternalLogical.g:1181:3: lv_children_4_0= ruleOptionExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBigAndExprAccess().getChildrenOptionExprParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_23);
            	    lv_children_4_0=ruleOptionExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBigAndExprRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"children",
            	              		lv_children_4_0, 
            	              		"de.ubt.ai1.supermod.oel.OptionLang.OptionExpr");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            this_P_CLOSE_5=(Token)match(input,RULE_P_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_P_CLOSE_5, grammarAccess.getBigAndExprAccess().getP_CLOSETerminalRuleCall_4()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBigAndExpr"


    // $ANTLR start "entryRuleBigOrExpr"
    // InternalLogical.g:1209:1: entryRuleBigOrExpr returns [EObject current=null] : iv_ruleBigOrExpr= ruleBigOrExpr EOF ;
    public final EObject entryRuleBigOrExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBigOrExpr = null;


        try {
            // InternalLogical.g:1210:2: (iv_ruleBigOrExpr= ruleBigOrExpr EOF )
            // InternalLogical.g:1211:2: iv_ruleBigOrExpr= ruleBigOrExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBigOrExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBigOrExpr=ruleBigOrExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBigOrExpr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBigOrExpr"


    // $ANTLR start "ruleBigOrExpr"
    // InternalLogical.g:1218:1: ruleBigOrExpr returns [EObject current=null] : (this_K_BIG_OR_0= RULE_K_BIG_OR this_P_OPEN_1= RULE_P_OPEN ( (lv_children_2_0= ruleOptionExpr ) ) (this_COMMA_3= RULE_COMMA ( (lv_children_4_0= ruleOptionExpr ) ) )* this_P_CLOSE_5= RULE_P_CLOSE ) ;
    public final EObject ruleBigOrExpr() throws RecognitionException {
        EObject current = null;

        Token this_K_BIG_OR_0=null;
        Token this_P_OPEN_1=null;
        Token this_COMMA_3=null;
        Token this_P_CLOSE_5=null;
        EObject lv_children_2_0 = null;

        EObject lv_children_4_0 = null;


         enterRule(); 
            
        try {
            // InternalLogical.g:1221:28: ( (this_K_BIG_OR_0= RULE_K_BIG_OR this_P_OPEN_1= RULE_P_OPEN ( (lv_children_2_0= ruleOptionExpr ) ) (this_COMMA_3= RULE_COMMA ( (lv_children_4_0= ruleOptionExpr ) ) )* this_P_CLOSE_5= RULE_P_CLOSE ) )
            // InternalLogical.g:1222:1: (this_K_BIG_OR_0= RULE_K_BIG_OR this_P_OPEN_1= RULE_P_OPEN ( (lv_children_2_0= ruleOptionExpr ) ) (this_COMMA_3= RULE_COMMA ( (lv_children_4_0= ruleOptionExpr ) ) )* this_P_CLOSE_5= RULE_P_CLOSE )
            {
            // InternalLogical.g:1222:1: (this_K_BIG_OR_0= RULE_K_BIG_OR this_P_OPEN_1= RULE_P_OPEN ( (lv_children_2_0= ruleOptionExpr ) ) (this_COMMA_3= RULE_COMMA ( (lv_children_4_0= ruleOptionExpr ) ) )* this_P_CLOSE_5= RULE_P_CLOSE )
            // InternalLogical.g:1222:2: this_K_BIG_OR_0= RULE_K_BIG_OR this_P_OPEN_1= RULE_P_OPEN ( (lv_children_2_0= ruleOptionExpr ) ) (this_COMMA_3= RULE_COMMA ( (lv_children_4_0= ruleOptionExpr ) ) )* this_P_CLOSE_5= RULE_P_CLOSE
            {
            this_K_BIG_OR_0=(Token)match(input,RULE_K_BIG_OR,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_K_BIG_OR_0, grammarAccess.getBigOrExprAccess().getK_BIG_ORTerminalRuleCall_0()); 
                  
            }
            this_P_OPEN_1=(Token)match(input,RULE_P_OPEN,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_P_OPEN_1, grammarAccess.getBigOrExprAccess().getP_OPENTerminalRuleCall_1()); 
                  
            }
            // InternalLogical.g:1230:1: ( (lv_children_2_0= ruleOptionExpr ) )
            // InternalLogical.g:1231:1: (lv_children_2_0= ruleOptionExpr )
            {
            // InternalLogical.g:1231:1: (lv_children_2_0= ruleOptionExpr )
            // InternalLogical.g:1232:3: lv_children_2_0= ruleOptionExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBigOrExprAccess().getChildrenOptionExprParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_23);
            lv_children_2_0=ruleOptionExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBigOrExprRule());
              	        }
                     		add(
                     			current, 
                     			"children",
                      		lv_children_2_0, 
                      		"de.ubt.ai1.supermod.oel.OptionLang.OptionExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalLogical.g:1248:2: (this_COMMA_3= RULE_COMMA ( (lv_children_4_0= ruleOptionExpr ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_COMMA) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalLogical.g:1248:3: this_COMMA_3= RULE_COMMA ( (lv_children_4_0= ruleOptionExpr ) )
            	    {
            	    this_COMMA_3=(Token)match(input,RULE_COMMA,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_3, grammarAccess.getBigOrExprAccess().getCOMMATerminalRuleCall_3_0()); 
            	          
            	    }
            	    // InternalLogical.g:1252:1: ( (lv_children_4_0= ruleOptionExpr ) )
            	    // InternalLogical.g:1253:1: (lv_children_4_0= ruleOptionExpr )
            	    {
            	    // InternalLogical.g:1253:1: (lv_children_4_0= ruleOptionExpr )
            	    // InternalLogical.g:1254:3: lv_children_4_0= ruleOptionExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBigOrExprAccess().getChildrenOptionExprParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_23);
            	    lv_children_4_0=ruleOptionExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBigOrExprRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"children",
            	              		lv_children_4_0, 
            	              		"de.ubt.ai1.supermod.oel.OptionLang.OptionExpr");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            this_P_CLOSE_5=(Token)match(input,RULE_P_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_P_CLOSE_5, grammarAccess.getBigOrExprAccess().getP_CLOSETerminalRuleCall_4()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBigOrExpr"


    // $ANTLR start "entryRuleBigXorExpr"
    // InternalLogical.g:1282:1: entryRuleBigXorExpr returns [EObject current=null] : iv_ruleBigXorExpr= ruleBigXorExpr EOF ;
    public final EObject entryRuleBigXorExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBigXorExpr = null;


        try {
            // InternalLogical.g:1283:2: (iv_ruleBigXorExpr= ruleBigXorExpr EOF )
            // InternalLogical.g:1284:2: iv_ruleBigXorExpr= ruleBigXorExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBigXorExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBigXorExpr=ruleBigXorExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBigXorExpr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBigXorExpr"


    // $ANTLR start "ruleBigXorExpr"
    // InternalLogical.g:1291:1: ruleBigXorExpr returns [EObject current=null] : (this_K_BIG_XOR_0= RULE_K_BIG_XOR this_P_OPEN_1= RULE_P_OPEN ( (lv_children_2_0= ruleOptionExpr ) ) (this_COMMA_3= RULE_COMMA ( (lv_children_4_0= ruleOptionExpr ) ) )* this_P_CLOSE_5= RULE_P_CLOSE ) ;
    public final EObject ruleBigXorExpr() throws RecognitionException {
        EObject current = null;

        Token this_K_BIG_XOR_0=null;
        Token this_P_OPEN_1=null;
        Token this_COMMA_3=null;
        Token this_P_CLOSE_5=null;
        EObject lv_children_2_0 = null;

        EObject lv_children_4_0 = null;


         enterRule(); 
            
        try {
            // InternalLogical.g:1294:28: ( (this_K_BIG_XOR_0= RULE_K_BIG_XOR this_P_OPEN_1= RULE_P_OPEN ( (lv_children_2_0= ruleOptionExpr ) ) (this_COMMA_3= RULE_COMMA ( (lv_children_4_0= ruleOptionExpr ) ) )* this_P_CLOSE_5= RULE_P_CLOSE ) )
            // InternalLogical.g:1295:1: (this_K_BIG_XOR_0= RULE_K_BIG_XOR this_P_OPEN_1= RULE_P_OPEN ( (lv_children_2_0= ruleOptionExpr ) ) (this_COMMA_3= RULE_COMMA ( (lv_children_4_0= ruleOptionExpr ) ) )* this_P_CLOSE_5= RULE_P_CLOSE )
            {
            // InternalLogical.g:1295:1: (this_K_BIG_XOR_0= RULE_K_BIG_XOR this_P_OPEN_1= RULE_P_OPEN ( (lv_children_2_0= ruleOptionExpr ) ) (this_COMMA_3= RULE_COMMA ( (lv_children_4_0= ruleOptionExpr ) ) )* this_P_CLOSE_5= RULE_P_CLOSE )
            // InternalLogical.g:1295:2: this_K_BIG_XOR_0= RULE_K_BIG_XOR this_P_OPEN_1= RULE_P_OPEN ( (lv_children_2_0= ruleOptionExpr ) ) (this_COMMA_3= RULE_COMMA ( (lv_children_4_0= ruleOptionExpr ) ) )* this_P_CLOSE_5= RULE_P_CLOSE
            {
            this_K_BIG_XOR_0=(Token)match(input,RULE_K_BIG_XOR,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_K_BIG_XOR_0, grammarAccess.getBigXorExprAccess().getK_BIG_XORTerminalRuleCall_0()); 
                  
            }
            this_P_OPEN_1=(Token)match(input,RULE_P_OPEN,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_P_OPEN_1, grammarAccess.getBigXorExprAccess().getP_OPENTerminalRuleCall_1()); 
                  
            }
            // InternalLogical.g:1303:1: ( (lv_children_2_0= ruleOptionExpr ) )
            // InternalLogical.g:1304:1: (lv_children_2_0= ruleOptionExpr )
            {
            // InternalLogical.g:1304:1: (lv_children_2_0= ruleOptionExpr )
            // InternalLogical.g:1305:3: lv_children_2_0= ruleOptionExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBigXorExprAccess().getChildrenOptionExprParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_23);
            lv_children_2_0=ruleOptionExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBigXorExprRule());
              	        }
                     		add(
                     			current, 
                     			"children",
                      		lv_children_2_0, 
                      		"de.ubt.ai1.supermod.oel.OptionLang.OptionExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalLogical.g:1321:2: (this_COMMA_3= RULE_COMMA ( (lv_children_4_0= ruleOptionExpr ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_COMMA) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalLogical.g:1321:3: this_COMMA_3= RULE_COMMA ( (lv_children_4_0= ruleOptionExpr ) )
            	    {
            	    this_COMMA_3=(Token)match(input,RULE_COMMA,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_3, grammarAccess.getBigXorExprAccess().getCOMMATerminalRuleCall_3_0()); 
            	          
            	    }
            	    // InternalLogical.g:1325:1: ( (lv_children_4_0= ruleOptionExpr ) )
            	    // InternalLogical.g:1326:1: (lv_children_4_0= ruleOptionExpr )
            	    {
            	    // InternalLogical.g:1326:1: (lv_children_4_0= ruleOptionExpr )
            	    // InternalLogical.g:1327:3: lv_children_4_0= ruleOptionExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBigXorExprAccess().getChildrenOptionExprParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_23);
            	    lv_children_4_0=ruleOptionExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBigXorExprRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"children",
            	              		lv_children_4_0, 
            	              		"de.ubt.ai1.supermod.oel.OptionLang.OptionExpr");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            this_P_CLOSE_5=(Token)match(input,RULE_P_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_P_CLOSE_5, grammarAccess.getBigXorExprAccess().getP_CLOSETerminalRuleCall_4()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBigXorExpr"


    // $ANTLR start "entryRuleBigNandExpr"
    // InternalLogical.g:1355:1: entryRuleBigNandExpr returns [EObject current=null] : iv_ruleBigNandExpr= ruleBigNandExpr EOF ;
    public final EObject entryRuleBigNandExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBigNandExpr = null;


        try {
            // InternalLogical.g:1356:2: (iv_ruleBigNandExpr= ruleBigNandExpr EOF )
            // InternalLogical.g:1357:2: iv_ruleBigNandExpr= ruleBigNandExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBigNandExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBigNandExpr=ruleBigNandExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBigNandExpr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBigNandExpr"


    // $ANTLR start "ruleBigNandExpr"
    // InternalLogical.g:1364:1: ruleBigNandExpr returns [EObject current=null] : (this_K_BIG_NAND_0= RULE_K_BIG_NAND this_P_OPEN_1= RULE_P_OPEN ( (lv_children_2_0= ruleOptionExpr ) ) (this_COMMA_3= RULE_COMMA ( (lv_children_4_0= ruleOptionExpr ) ) )* this_P_CLOSE_5= RULE_P_CLOSE ) ;
    public final EObject ruleBigNandExpr() throws RecognitionException {
        EObject current = null;

        Token this_K_BIG_NAND_0=null;
        Token this_P_OPEN_1=null;
        Token this_COMMA_3=null;
        Token this_P_CLOSE_5=null;
        EObject lv_children_2_0 = null;

        EObject lv_children_4_0 = null;


         enterRule(); 
            
        try {
            // InternalLogical.g:1367:28: ( (this_K_BIG_NAND_0= RULE_K_BIG_NAND this_P_OPEN_1= RULE_P_OPEN ( (lv_children_2_0= ruleOptionExpr ) ) (this_COMMA_3= RULE_COMMA ( (lv_children_4_0= ruleOptionExpr ) ) )* this_P_CLOSE_5= RULE_P_CLOSE ) )
            // InternalLogical.g:1368:1: (this_K_BIG_NAND_0= RULE_K_BIG_NAND this_P_OPEN_1= RULE_P_OPEN ( (lv_children_2_0= ruleOptionExpr ) ) (this_COMMA_3= RULE_COMMA ( (lv_children_4_0= ruleOptionExpr ) ) )* this_P_CLOSE_5= RULE_P_CLOSE )
            {
            // InternalLogical.g:1368:1: (this_K_BIG_NAND_0= RULE_K_BIG_NAND this_P_OPEN_1= RULE_P_OPEN ( (lv_children_2_0= ruleOptionExpr ) ) (this_COMMA_3= RULE_COMMA ( (lv_children_4_0= ruleOptionExpr ) ) )* this_P_CLOSE_5= RULE_P_CLOSE )
            // InternalLogical.g:1368:2: this_K_BIG_NAND_0= RULE_K_BIG_NAND this_P_OPEN_1= RULE_P_OPEN ( (lv_children_2_0= ruleOptionExpr ) ) (this_COMMA_3= RULE_COMMA ( (lv_children_4_0= ruleOptionExpr ) ) )* this_P_CLOSE_5= RULE_P_CLOSE
            {
            this_K_BIG_NAND_0=(Token)match(input,RULE_K_BIG_NAND,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_K_BIG_NAND_0, grammarAccess.getBigNandExprAccess().getK_BIG_NANDTerminalRuleCall_0()); 
                  
            }
            this_P_OPEN_1=(Token)match(input,RULE_P_OPEN,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_P_OPEN_1, grammarAccess.getBigNandExprAccess().getP_OPENTerminalRuleCall_1()); 
                  
            }
            // InternalLogical.g:1376:1: ( (lv_children_2_0= ruleOptionExpr ) )
            // InternalLogical.g:1377:1: (lv_children_2_0= ruleOptionExpr )
            {
            // InternalLogical.g:1377:1: (lv_children_2_0= ruleOptionExpr )
            // InternalLogical.g:1378:3: lv_children_2_0= ruleOptionExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBigNandExprAccess().getChildrenOptionExprParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_23);
            lv_children_2_0=ruleOptionExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getBigNandExprRule());
              	        }
                     		add(
                     			current, 
                     			"children",
                      		lv_children_2_0, 
                      		"de.ubt.ai1.supermod.oel.OptionLang.OptionExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalLogical.g:1394:2: (this_COMMA_3= RULE_COMMA ( (lv_children_4_0= ruleOptionExpr ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_COMMA) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalLogical.g:1394:3: this_COMMA_3= RULE_COMMA ( (lv_children_4_0= ruleOptionExpr ) )
            	    {
            	    this_COMMA_3=(Token)match(input,RULE_COMMA,FollowSets000.FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_3, grammarAccess.getBigNandExprAccess().getCOMMATerminalRuleCall_3_0()); 
            	          
            	    }
            	    // InternalLogical.g:1398:1: ( (lv_children_4_0= ruleOptionExpr ) )
            	    // InternalLogical.g:1399:1: (lv_children_4_0= ruleOptionExpr )
            	    {
            	    // InternalLogical.g:1399:1: (lv_children_4_0= ruleOptionExpr )
            	    // InternalLogical.g:1400:3: lv_children_4_0= ruleOptionExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBigNandExprAccess().getChildrenOptionExprParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_23);
            	    lv_children_4_0=ruleOptionExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBigNandExprRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"children",
            	              		lv_children_4_0, 
            	              		"de.ubt.ai1.supermod.oel.OptionLang.OptionExpr");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            this_P_CLOSE_5=(Token)match(input,RULE_P_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_P_CLOSE_5, grammarAccess.getBigNandExprAccess().getP_CLOSETerminalRuleCall_4()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBigNandExpr"


    // $ANTLR start "entryRuleOptionRef"
    // InternalLogical.g:1428:1: entryRuleOptionRef returns [EObject current=null] : iv_ruleOptionRef= ruleOptionRef EOF ;
    public final EObject entryRuleOptionRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionRef = null;


        try {
            // InternalLogical.g:1429:2: (iv_ruleOptionRef= ruleOptionRef EOF )
            // InternalLogical.g:1430:2: iv_ruleOptionRef= ruleOptionRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOptionRefRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOptionRef=ruleOptionRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOptionRef; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOptionRef"


    // $ANTLR start "ruleOptionRef"
    // InternalLogical.g:1437:1: ruleOptionRef returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleOptionRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // InternalLogical.g:1440:28: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalLogical.g:1441:1: ( (otherlv_0= RULE_ID ) )
            {
            // InternalLogical.g:1441:1: ( (otherlv_0= RULE_ID ) )
            // InternalLogical.g:1442:1: (otherlv_0= RULE_ID )
            {
            // InternalLogical.g:1442:1: (otherlv_0= RULE_ID )
            // InternalLogical.g:1443:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {
               
              		  /* */ 
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getOptionRefRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getOptionRefAccess().getOptionOptionCrossReference_0()); 
              	
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOptionRef"


    // $ANTLR start "entryRuleNegExpr"
    // InternalLogical.g:1465:1: entryRuleNegExpr returns [EObject current=null] : iv_ruleNegExpr= ruleNegExpr EOF ;
    public final EObject entryRuleNegExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegExpr = null;


        try {
            // InternalLogical.g:1466:2: (iv_ruleNegExpr= ruleNegExpr EOF )
            // InternalLogical.g:1467:2: iv_ruleNegExpr= ruleNegExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNegExprRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNegExpr=ruleNegExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNegExpr; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNegExpr"


    // $ANTLR start "ruleNegExpr"
    // InternalLogical.g:1474:1: ruleNegExpr returns [EObject current=null] : (this_K_NOT_0= RULE_K_NOT ( (lv_neg_1_0= ruleOptionExpr ) ) ) ;
    public final EObject ruleNegExpr() throws RecognitionException {
        EObject current = null;

        Token this_K_NOT_0=null;
        EObject lv_neg_1_0 = null;


         enterRule(); 
            
        try {
            // InternalLogical.g:1477:28: ( (this_K_NOT_0= RULE_K_NOT ( (lv_neg_1_0= ruleOptionExpr ) ) ) )
            // InternalLogical.g:1478:1: (this_K_NOT_0= RULE_K_NOT ( (lv_neg_1_0= ruleOptionExpr ) ) )
            {
            // InternalLogical.g:1478:1: (this_K_NOT_0= RULE_K_NOT ( (lv_neg_1_0= ruleOptionExpr ) ) )
            // InternalLogical.g:1478:2: this_K_NOT_0= RULE_K_NOT ( (lv_neg_1_0= ruleOptionExpr ) )
            {
            this_K_NOT_0=(Token)match(input,RULE_K_NOT,FollowSets000.FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_K_NOT_0, grammarAccess.getNegExprAccess().getK_NOTTerminalRuleCall_0()); 
                  
            }
            // InternalLogical.g:1482:1: ( (lv_neg_1_0= ruleOptionExpr ) )
            // InternalLogical.g:1483:1: (lv_neg_1_0= ruleOptionExpr )
            {
            // InternalLogical.g:1483:1: (lv_neg_1_0= ruleOptionExpr )
            // InternalLogical.g:1484:3: lv_neg_1_0= ruleOptionExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNegExprAccess().getNegOptionExprParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_neg_1_0=ruleOptionExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNegExprRule());
              	        }
                     		set(
                     			current, 
                     			"neg",
                      		lv_neg_1_0, 
                      		"de.ubt.ai1.supermod.oel.OptionLang.OptionExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNegExpr"


    // $ANTLR start "ruleTristate"
    // InternalLogical.g:1508:1: ruleTristate returns [Enumerator current=null] : ( (enumLiteral_0= 'unknown' ) | (enumLiteral_1= 'true' ) | (enumLiteral_2= 'false' ) ) ;
    public final Enumerator ruleTristate() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // InternalLogical.g:1510:28: ( ( (enumLiteral_0= 'unknown' ) | (enumLiteral_1= 'true' ) | (enumLiteral_2= 'false' ) ) )
            // InternalLogical.g:1511:1: ( (enumLiteral_0= 'unknown' ) | (enumLiteral_1= 'true' ) | (enumLiteral_2= 'false' ) )
            {
            // InternalLogical.g:1511:1: ( (enumLiteral_0= 'unknown' ) | (enumLiteral_1= 'true' ) | (enumLiteral_2= 'false' ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt16=1;
                }
                break;
            case 33:
                {
                alt16=2;
                }
                break;
            case 34:
                {
                alt16=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalLogical.g:1511:2: (enumLiteral_0= 'unknown' )
                    {
                    // InternalLogical.g:1511:2: (enumLiteral_0= 'unknown' )
                    // InternalLogical.g:1511:4: enumLiteral_0= 'unknown'
                    {
                    enumLiteral_0=(Token)match(input,32,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTristateAccess().getUnknownEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getTristateAccess().getUnknownEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalLogical.g:1517:6: (enumLiteral_1= 'true' )
                    {
                    // InternalLogical.g:1517:6: (enumLiteral_1= 'true' )
                    // InternalLogical.g:1517:8: enumLiteral_1= 'true'
                    {
                    enumLiteral_1=(Token)match(input,33,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTristateAccess().getTrueEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getTristateAccess().getTrueEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalLogical.g:1523:6: (enumLiteral_2= 'false' )
                    {
                    // InternalLogical.g:1523:6: (enumLiteral_2= 'false' )
                    // InternalLogical.g:1523:8: enumLiteral_2= 'false'
                    {
                    enumLiteral_2=(Token)match(input,34,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getTristateAccess().getFalseEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getTristateAccess().getFalseEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTristate"

    // $ANTLR start synpred6_InternalLogical
    public final void synpred6_InternalLogical_fragment() throws RecognitionException {   
        Token this_K_IFF_2=null;
        EObject lv_right_3_0 = null;


        // InternalLogical.g:574:2: ( () this_K_IFF_2= RULE_K_IFF ( (lv_right_3_0= ruleBiconditionalExpr ) ) )
        // InternalLogical.g:574:2: () this_K_IFF_2= RULE_K_IFF ( (lv_right_3_0= ruleBiconditionalExpr ) )
        {
        // InternalLogical.g:574:2: ()
        // InternalLogical.g:575:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        this_K_IFF_2=(Token)match(input,RULE_K_IFF,FollowSets000.FOLLOW_14); if (state.failed) return ;
        // InternalLogical.g:587:1: ( (lv_right_3_0= ruleBiconditionalExpr ) )
        // InternalLogical.g:588:1: (lv_right_3_0= ruleBiconditionalExpr )
        {
        // InternalLogical.g:588:1: (lv_right_3_0= ruleBiconditionalExpr )
        // InternalLogical.g:589:3: lv_right_3_0= ruleBiconditionalExpr
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getBiconditionalExprAccess().getRightBiconditionalExprParserRuleCall_1_2_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_right_3_0=ruleBiconditionalExpr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred6_InternalLogical

    // $ANTLR start synpred7_InternalLogical
    public final void synpred7_InternalLogical_fragment() throws RecognitionException {   
        Token this_K_IMP_2=null;
        EObject lv_right_3_0 = null;


        // InternalLogical.g:638:2: ( () this_K_IMP_2= RULE_K_IMP ( (lv_right_3_0= ruleOrExpr ) ) )
        // InternalLogical.g:638:2: () this_K_IMP_2= RULE_K_IMP ( (lv_right_3_0= ruleOrExpr ) )
        {
        // InternalLogical.g:638:2: ()
        // InternalLogical.g:639:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        this_K_IMP_2=(Token)match(input,RULE_K_IMP,FollowSets000.FOLLOW_14); if (state.failed) return ;
        // InternalLogical.g:651:1: ( (lv_right_3_0= ruleOrExpr ) )
        // InternalLogical.g:652:1: (lv_right_3_0= ruleOrExpr )
        {
        // InternalLogical.g:652:1: (lv_right_3_0= ruleOrExpr )
        // InternalLogical.g:653:3: lv_right_3_0= ruleOrExpr
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getImpliesExprAccess().getRightOrExprParserRuleCall_1_2_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_right_3_0=ruleOrExpr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred7_InternalLogical

    // $ANTLR start synpred8_InternalLogical
    public final void synpred8_InternalLogical_fragment() throws RecognitionException {   
        Token this_K_OR_2=null;
        EObject lv_right_3_0 = null;


        // InternalLogical.g:702:2: ( () this_K_OR_2= RULE_K_OR ( (lv_right_3_0= ruleXorExpr ) ) )
        // InternalLogical.g:702:2: () this_K_OR_2= RULE_K_OR ( (lv_right_3_0= ruleXorExpr ) )
        {
        // InternalLogical.g:702:2: ()
        // InternalLogical.g:703:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        this_K_OR_2=(Token)match(input,RULE_K_OR,FollowSets000.FOLLOW_14); if (state.failed) return ;
        // InternalLogical.g:715:1: ( (lv_right_3_0= ruleXorExpr ) )
        // InternalLogical.g:716:1: (lv_right_3_0= ruleXorExpr )
        {
        // InternalLogical.g:716:1: (lv_right_3_0= ruleXorExpr )
        // InternalLogical.g:717:3: lv_right_3_0= ruleXorExpr
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getOrExprAccess().getRightXorExprParserRuleCall_1_2_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_right_3_0=ruleXorExpr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred8_InternalLogical

    // $ANTLR start synpred9_InternalLogical
    public final void synpred9_InternalLogical_fragment() throws RecognitionException {   
        Token this_K_XOR_2=null;
        EObject lv_right_3_0 = null;


        // InternalLogical.g:766:2: ( () this_K_XOR_2= RULE_K_XOR ( (lv_right_3_0= ruleMinusExpr ) ) )
        // InternalLogical.g:766:2: () this_K_XOR_2= RULE_K_XOR ( (lv_right_3_0= ruleMinusExpr ) )
        {
        // InternalLogical.g:766:2: ()
        // InternalLogical.g:767:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        this_K_XOR_2=(Token)match(input,RULE_K_XOR,FollowSets000.FOLLOW_14); if (state.failed) return ;
        // InternalLogical.g:779:1: ( (lv_right_3_0= ruleMinusExpr ) )
        // InternalLogical.g:780:1: (lv_right_3_0= ruleMinusExpr )
        {
        // InternalLogical.g:780:1: (lv_right_3_0= ruleMinusExpr )
        // InternalLogical.g:781:3: lv_right_3_0= ruleMinusExpr
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getXorExprAccess().getRightMinusExprParserRuleCall_1_2_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_right_3_0=ruleMinusExpr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred9_InternalLogical

    // $ANTLR start synpred10_InternalLogical
    public final void synpred10_InternalLogical_fragment() throws RecognitionException {   
        Token this_K_MINUS_2=null;
        EObject lv_right_3_0 = null;


        // InternalLogical.g:830:2: ( () this_K_MINUS_2= RULE_K_MINUS ( (lv_right_3_0= ruleNandExpr ) ) )
        // InternalLogical.g:830:2: () this_K_MINUS_2= RULE_K_MINUS ( (lv_right_3_0= ruleNandExpr ) )
        {
        // InternalLogical.g:830:2: ()
        // InternalLogical.g:831:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        this_K_MINUS_2=(Token)match(input,RULE_K_MINUS,FollowSets000.FOLLOW_14); if (state.failed) return ;
        // InternalLogical.g:843:1: ( (lv_right_3_0= ruleNandExpr ) )
        // InternalLogical.g:844:1: (lv_right_3_0= ruleNandExpr )
        {
        // InternalLogical.g:844:1: (lv_right_3_0= ruleNandExpr )
        // InternalLogical.g:845:3: lv_right_3_0= ruleNandExpr
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getMinusExprAccess().getRightNandExprParserRuleCall_1_2_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_right_3_0=ruleNandExpr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred10_InternalLogical

    // $ANTLR start synpred11_InternalLogical
    public final void synpred11_InternalLogical_fragment() throws RecognitionException {   
        Token this_K_NAND_2=null;
        EObject lv_right_3_0 = null;


        // InternalLogical.g:894:2: ( () this_K_NAND_2= RULE_K_NAND ( (lv_right_3_0= ruleAndExpr ) ) )
        // InternalLogical.g:894:2: () this_K_NAND_2= RULE_K_NAND ( (lv_right_3_0= ruleAndExpr ) )
        {
        // InternalLogical.g:894:2: ()
        // InternalLogical.g:895:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        this_K_NAND_2=(Token)match(input,RULE_K_NAND,FollowSets000.FOLLOW_14); if (state.failed) return ;
        // InternalLogical.g:907:1: ( (lv_right_3_0= ruleAndExpr ) )
        // InternalLogical.g:908:1: (lv_right_3_0= ruleAndExpr )
        {
        // InternalLogical.g:908:1: (lv_right_3_0= ruleAndExpr )
        // InternalLogical.g:909:3: lv_right_3_0= ruleAndExpr
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getNandExprAccess().getRightAndExprParserRuleCall_1_2_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_right_3_0=ruleAndExpr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred11_InternalLogical

    // $ANTLR start synpred12_InternalLogical
    public final void synpred12_InternalLogical_fragment() throws RecognitionException {   
        Token this_K_AND_2=null;
        EObject lv_right_3_0 = null;


        // InternalLogical.g:958:2: ( () this_K_AND_2= RULE_K_AND ( (lv_right_3_0= rulePrimaryExpr ) ) )
        // InternalLogical.g:958:2: () this_K_AND_2= RULE_K_AND ( (lv_right_3_0= rulePrimaryExpr ) )
        {
        // InternalLogical.g:958:2: ()
        // InternalLogical.g:959:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        this_K_AND_2=(Token)match(input,RULE_K_AND,FollowSets000.FOLLOW_14); if (state.failed) return ;
        // InternalLogical.g:971:1: ( (lv_right_3_0= rulePrimaryExpr ) )
        // InternalLogical.g:972:1: (lv_right_3_0= rulePrimaryExpr )
        {
        // InternalLogical.g:972:1: (lv_right_3_0= rulePrimaryExpr )
        // InternalLogical.g:973:3: lv_right_3_0= rulePrimaryExpr
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getAndExprAccess().getRightPrimaryExprParserRuleCall_1_2_0()); 
          	    
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_right_3_0=rulePrimaryExpr();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred12_InternalLogical

    // Delegated rules

    public final boolean synpred8_InternalLogical() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalLogical_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalLogical() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalLogical_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalLogical() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalLogical_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalLogical() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalLogical_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalLogical() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalLogical_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalLogical() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalLogical_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_InternalLogical() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_InternalLogical_fragment(); // can never throw exception
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
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000002F000000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000F5010L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000700000000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000022L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000081010L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000042L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000082L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000102L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000202L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000402L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000000000A000L});
    }


}
package de.ubt.ai1.supermod.oel.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.ubt.ai1.supermod.oel.services.OptionLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalOptionLangParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_K_IFF", "RULE_K_IMP", "RULE_K_OR", "RULE_K_XOR", "RULE_K_MINUS", "RULE_K_NAND", "RULE_K_AND", "RULE_P_OPEN", "RULE_P_CLOSE", "RULE_K_BIG_AND", "RULE_COMMA", "RULE_K_BIG_OR", "RULE_K_BIG_XOR", "RULE_K_BIG_NAND", "RULE_ID", "RULE_K_NOT", "RULE_WS"
    };
    public static final int RULE_K_BIG_OR=15;
    public static final int RULE_P_OPEN=11;
    public static final int RULE_K_BIG_NAND=17;
    public static final int RULE_K_MINUS=8;
    public static final int RULE_K_AND=10;
    public static final int RULE_K_XOR=7;
    public static final int EOF=-1;
    public static final int RULE_K_IFF=4;
    public static final int RULE_K_OR=6;
    public static final int RULE_ID=18;
    public static final int RULE_COMMA=14;
    public static final int RULE_WS=20;
    public static final int RULE_K_BIG_XOR=16;
    public static final int RULE_K_BIG_AND=13;
    public static final int RULE_K_NOT=19;
    public static final int RULE_P_CLOSE=12;
    public static final int RULE_K_NAND=9;
    public static final int RULE_K_IMP=5;

    // delegates
    // delegators


        public InternalOptionLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalOptionLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalOptionLangParser.tokenNames; }
    public String getGrammarFileName() { return "InternalOptionLang.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private OptionLangGrammarAccess grammarAccess;
     	
        public InternalOptionLangParser(TokenStream input, OptionLangGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "OptionExpr";	
       	}
       	
       	@Override
       	protected OptionLangGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleOptionExpr"
    // InternalOptionLang.g:73:1: entryRuleOptionExpr returns [EObject current=null] : iv_ruleOptionExpr= ruleOptionExpr EOF ;
    public final EObject entryRuleOptionExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionExpr = null;


        try {
            // InternalOptionLang.g:74:2: (iv_ruleOptionExpr= ruleOptionExpr EOF )
            // InternalOptionLang.g:75:2: iv_ruleOptionExpr= ruleOptionExpr EOF
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
    // InternalOptionLang.g:82:1: ruleOptionExpr returns [EObject current=null] : (this_BiconditionalExpr_0= ruleBiconditionalExpr | this_BigExpr_1= ruleBigExpr ) ;
    public final EObject ruleOptionExpr() throws RecognitionException {
        EObject current = null;

        EObject this_BiconditionalExpr_0 = null;

        EObject this_BigExpr_1 = null;


         enterRule(); 
            
        try {
            // InternalOptionLang.g:85:28: ( (this_BiconditionalExpr_0= ruleBiconditionalExpr | this_BigExpr_1= ruleBigExpr ) )
            // InternalOptionLang.g:86:1: (this_BiconditionalExpr_0= ruleBiconditionalExpr | this_BigExpr_1= ruleBigExpr )
            {
            // InternalOptionLang.g:86:1: (this_BiconditionalExpr_0= ruleBiconditionalExpr | this_BigExpr_1= ruleBigExpr )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_P_OPEN||(LA1_0>=RULE_ID && LA1_0<=RULE_K_NOT)) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_K_BIG_AND||(LA1_0>=RULE_K_BIG_OR && LA1_0<=RULE_K_BIG_NAND)) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalOptionLang.g:87:2: this_BiconditionalExpr_0= ruleBiconditionalExpr
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
                    // InternalOptionLang.g:100:2: this_BigExpr_1= ruleBigExpr
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
    // InternalOptionLang.g:119:1: entryRuleBiconditionalExpr returns [EObject current=null] : iv_ruleBiconditionalExpr= ruleBiconditionalExpr EOF ;
    public final EObject entryRuleBiconditionalExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBiconditionalExpr = null;


        try {
            // InternalOptionLang.g:120:2: (iv_ruleBiconditionalExpr= ruleBiconditionalExpr EOF )
            // InternalOptionLang.g:121:2: iv_ruleBiconditionalExpr= ruleBiconditionalExpr EOF
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
    // InternalOptionLang.g:128:1: ruleBiconditionalExpr returns [EObject current=null] : (this_ImpliesExpr_0= ruleImpliesExpr ( () this_K_IFF_2= RULE_K_IFF ( (lv_right_3_0= ruleBiconditionalExpr ) ) )* ) ;
    public final EObject ruleBiconditionalExpr() throws RecognitionException {
        EObject current = null;

        Token this_K_IFF_2=null;
        EObject this_ImpliesExpr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalOptionLang.g:131:28: ( (this_ImpliesExpr_0= ruleImpliesExpr ( () this_K_IFF_2= RULE_K_IFF ( (lv_right_3_0= ruleBiconditionalExpr ) ) )* ) )
            // InternalOptionLang.g:132:1: (this_ImpliesExpr_0= ruleImpliesExpr ( () this_K_IFF_2= RULE_K_IFF ( (lv_right_3_0= ruleBiconditionalExpr ) ) )* )
            {
            // InternalOptionLang.g:132:1: (this_ImpliesExpr_0= ruleImpliesExpr ( () this_K_IFF_2= RULE_K_IFF ( (lv_right_3_0= ruleBiconditionalExpr ) ) )* )
            // InternalOptionLang.g:133:2: this_ImpliesExpr_0= ruleImpliesExpr ( () this_K_IFF_2= RULE_K_IFF ( (lv_right_3_0= ruleBiconditionalExpr ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getBiconditionalExprAccess().getImpliesExprParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_3);
            this_ImpliesExpr_0=ruleImpliesExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ImpliesExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalOptionLang.g:144:1: ( () this_K_IFF_2= RULE_K_IFF ( (lv_right_3_0= ruleBiconditionalExpr ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_K_IFF) ) {
                    int LA2_2 = input.LA(2);

                    if ( (synpred2_InternalOptionLang()) ) {
                        alt2=1;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // InternalOptionLang.g:144:2: () this_K_IFF_2= RULE_K_IFF ( (lv_right_3_0= ruleBiconditionalExpr ) )
            	    {
            	    // InternalOptionLang.g:144:2: ()
            	    // InternalOptionLang.g:145:2: 
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

            	    this_K_IFF_2=(Token)match(input,RULE_K_IFF,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_K_IFF_2, grammarAccess.getBiconditionalExprAccess().getK_IFFTerminalRuleCall_1_1()); 
            	          
            	    }
            	    // InternalOptionLang.g:157:1: ( (lv_right_3_0= ruleBiconditionalExpr ) )
            	    // InternalOptionLang.g:158:1: (lv_right_3_0= ruleBiconditionalExpr )
            	    {
            	    // InternalOptionLang.g:158:1: (lv_right_3_0= ruleBiconditionalExpr )
            	    // InternalOptionLang.g:159:3: lv_right_3_0= ruleBiconditionalExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBiconditionalExprAccess().getRightBiconditionalExprParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_3);
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
            	    break loop2;
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
    // InternalOptionLang.g:183:1: entryRuleImpliesExpr returns [EObject current=null] : iv_ruleImpliesExpr= ruleImpliesExpr EOF ;
    public final EObject entryRuleImpliesExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImpliesExpr = null;


        try {
            // InternalOptionLang.g:184:2: (iv_ruleImpliesExpr= ruleImpliesExpr EOF )
            // InternalOptionLang.g:185:2: iv_ruleImpliesExpr= ruleImpliesExpr EOF
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
    // InternalOptionLang.g:192:1: ruleImpliesExpr returns [EObject current=null] : (this_OrExpr_0= ruleOrExpr ( () this_K_IMP_2= RULE_K_IMP ( (lv_right_3_0= ruleOrExpr ) ) )* ) ;
    public final EObject ruleImpliesExpr() throws RecognitionException {
        EObject current = null;

        Token this_K_IMP_2=null;
        EObject this_OrExpr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalOptionLang.g:195:28: ( (this_OrExpr_0= ruleOrExpr ( () this_K_IMP_2= RULE_K_IMP ( (lv_right_3_0= ruleOrExpr ) ) )* ) )
            // InternalOptionLang.g:196:1: (this_OrExpr_0= ruleOrExpr ( () this_K_IMP_2= RULE_K_IMP ( (lv_right_3_0= ruleOrExpr ) ) )* )
            {
            // InternalOptionLang.g:196:1: (this_OrExpr_0= ruleOrExpr ( () this_K_IMP_2= RULE_K_IMP ( (lv_right_3_0= ruleOrExpr ) ) )* )
            // InternalOptionLang.g:197:2: this_OrExpr_0= ruleOrExpr ( () this_K_IMP_2= RULE_K_IMP ( (lv_right_3_0= ruleOrExpr ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getImpliesExprAccess().getOrExprParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_5);
            this_OrExpr_0=ruleOrExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_OrExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalOptionLang.g:208:1: ( () this_K_IMP_2= RULE_K_IMP ( (lv_right_3_0= ruleOrExpr ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_K_IMP) ) {
                    int LA3_2 = input.LA(2);

                    if ( (synpred3_InternalOptionLang()) ) {
                        alt3=1;
                    }


                }


                switch (alt3) {
            	case 1 :
            	    // InternalOptionLang.g:208:2: () this_K_IMP_2= RULE_K_IMP ( (lv_right_3_0= ruleOrExpr ) )
            	    {
            	    // InternalOptionLang.g:208:2: ()
            	    // InternalOptionLang.g:209:2: 
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

            	    this_K_IMP_2=(Token)match(input,RULE_K_IMP,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_K_IMP_2, grammarAccess.getImpliesExprAccess().getK_IMPTerminalRuleCall_1_1()); 
            	          
            	    }
            	    // InternalOptionLang.g:221:1: ( (lv_right_3_0= ruleOrExpr ) )
            	    // InternalOptionLang.g:222:1: (lv_right_3_0= ruleOrExpr )
            	    {
            	    // InternalOptionLang.g:222:1: (lv_right_3_0= ruleOrExpr )
            	    // InternalOptionLang.g:223:3: lv_right_3_0= ruleOrExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getImpliesExprAccess().getRightOrExprParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_5);
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
    // $ANTLR end "ruleImpliesExpr"


    // $ANTLR start "entryRuleOrExpr"
    // InternalOptionLang.g:247:1: entryRuleOrExpr returns [EObject current=null] : iv_ruleOrExpr= ruleOrExpr EOF ;
    public final EObject entryRuleOrExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpr = null;


        try {
            // InternalOptionLang.g:248:2: (iv_ruleOrExpr= ruleOrExpr EOF )
            // InternalOptionLang.g:249:2: iv_ruleOrExpr= ruleOrExpr EOF
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
    // InternalOptionLang.g:256:1: ruleOrExpr returns [EObject current=null] : (this_XorExpr_0= ruleXorExpr ( () this_K_OR_2= RULE_K_OR ( (lv_right_3_0= ruleXorExpr ) ) )* ) ;
    public final EObject ruleOrExpr() throws RecognitionException {
        EObject current = null;

        Token this_K_OR_2=null;
        EObject this_XorExpr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalOptionLang.g:259:28: ( (this_XorExpr_0= ruleXorExpr ( () this_K_OR_2= RULE_K_OR ( (lv_right_3_0= ruleXorExpr ) ) )* ) )
            // InternalOptionLang.g:260:1: (this_XorExpr_0= ruleXorExpr ( () this_K_OR_2= RULE_K_OR ( (lv_right_3_0= ruleXorExpr ) ) )* )
            {
            // InternalOptionLang.g:260:1: (this_XorExpr_0= ruleXorExpr ( () this_K_OR_2= RULE_K_OR ( (lv_right_3_0= ruleXorExpr ) ) )* )
            // InternalOptionLang.g:261:2: this_XorExpr_0= ruleXorExpr ( () this_K_OR_2= RULE_K_OR ( (lv_right_3_0= ruleXorExpr ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOrExprAccess().getXorExprParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_6);
            this_XorExpr_0=ruleXorExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_XorExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalOptionLang.g:272:1: ( () this_K_OR_2= RULE_K_OR ( (lv_right_3_0= ruleXorExpr ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_K_OR) ) {
                    int LA4_2 = input.LA(2);

                    if ( (synpred4_InternalOptionLang()) ) {
                        alt4=1;
                    }


                }


                switch (alt4) {
            	case 1 :
            	    // InternalOptionLang.g:272:2: () this_K_OR_2= RULE_K_OR ( (lv_right_3_0= ruleXorExpr ) )
            	    {
            	    // InternalOptionLang.g:272:2: ()
            	    // InternalOptionLang.g:273:2: 
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

            	    this_K_OR_2=(Token)match(input,RULE_K_OR,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_K_OR_2, grammarAccess.getOrExprAccess().getK_ORTerminalRuleCall_1_1()); 
            	          
            	    }
            	    // InternalOptionLang.g:285:1: ( (lv_right_3_0= ruleXorExpr ) )
            	    // InternalOptionLang.g:286:1: (lv_right_3_0= ruleXorExpr )
            	    {
            	    // InternalOptionLang.g:286:1: (lv_right_3_0= ruleXorExpr )
            	    // InternalOptionLang.g:287:3: lv_right_3_0= ruleXorExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrExprAccess().getRightXorExprParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_6);
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
    // $ANTLR end "ruleOrExpr"


    // $ANTLR start "entryRuleXorExpr"
    // InternalOptionLang.g:311:1: entryRuleXorExpr returns [EObject current=null] : iv_ruleXorExpr= ruleXorExpr EOF ;
    public final EObject entryRuleXorExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXorExpr = null;


        try {
            // InternalOptionLang.g:312:2: (iv_ruleXorExpr= ruleXorExpr EOF )
            // InternalOptionLang.g:313:2: iv_ruleXorExpr= ruleXorExpr EOF
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
    // InternalOptionLang.g:320:1: ruleXorExpr returns [EObject current=null] : (this_MinusExpr_0= ruleMinusExpr ( () this_K_XOR_2= RULE_K_XOR ( (lv_right_3_0= ruleMinusExpr ) ) )* ) ;
    public final EObject ruleXorExpr() throws RecognitionException {
        EObject current = null;

        Token this_K_XOR_2=null;
        EObject this_MinusExpr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalOptionLang.g:323:28: ( (this_MinusExpr_0= ruleMinusExpr ( () this_K_XOR_2= RULE_K_XOR ( (lv_right_3_0= ruleMinusExpr ) ) )* ) )
            // InternalOptionLang.g:324:1: (this_MinusExpr_0= ruleMinusExpr ( () this_K_XOR_2= RULE_K_XOR ( (lv_right_3_0= ruleMinusExpr ) ) )* )
            {
            // InternalOptionLang.g:324:1: (this_MinusExpr_0= ruleMinusExpr ( () this_K_XOR_2= RULE_K_XOR ( (lv_right_3_0= ruleMinusExpr ) ) )* )
            // InternalOptionLang.g:325:2: this_MinusExpr_0= ruleMinusExpr ( () this_K_XOR_2= RULE_K_XOR ( (lv_right_3_0= ruleMinusExpr ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getXorExprAccess().getMinusExprParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_7);
            this_MinusExpr_0=ruleMinusExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MinusExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalOptionLang.g:336:1: ( () this_K_XOR_2= RULE_K_XOR ( (lv_right_3_0= ruleMinusExpr ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_K_XOR) ) {
                    int LA5_2 = input.LA(2);

                    if ( (synpred5_InternalOptionLang()) ) {
                        alt5=1;
                    }


                }


                switch (alt5) {
            	case 1 :
            	    // InternalOptionLang.g:336:2: () this_K_XOR_2= RULE_K_XOR ( (lv_right_3_0= ruleMinusExpr ) )
            	    {
            	    // InternalOptionLang.g:336:2: ()
            	    // InternalOptionLang.g:337:2: 
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

            	    this_K_XOR_2=(Token)match(input,RULE_K_XOR,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_K_XOR_2, grammarAccess.getXorExprAccess().getK_XORTerminalRuleCall_1_1()); 
            	          
            	    }
            	    // InternalOptionLang.g:349:1: ( (lv_right_3_0= ruleMinusExpr ) )
            	    // InternalOptionLang.g:350:1: (lv_right_3_0= ruleMinusExpr )
            	    {
            	    // InternalOptionLang.g:350:1: (lv_right_3_0= ruleMinusExpr )
            	    // InternalOptionLang.g:351:3: lv_right_3_0= ruleMinusExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getXorExprAccess().getRightMinusExprParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_7);
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
    // $ANTLR end "ruleXorExpr"


    // $ANTLR start "entryRuleMinusExpr"
    // InternalOptionLang.g:375:1: entryRuleMinusExpr returns [EObject current=null] : iv_ruleMinusExpr= ruleMinusExpr EOF ;
    public final EObject entryRuleMinusExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinusExpr = null;


        try {
            // InternalOptionLang.g:376:2: (iv_ruleMinusExpr= ruleMinusExpr EOF )
            // InternalOptionLang.g:377:2: iv_ruleMinusExpr= ruleMinusExpr EOF
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
    // InternalOptionLang.g:384:1: ruleMinusExpr returns [EObject current=null] : (this_NandExpr_0= ruleNandExpr ( () this_K_MINUS_2= RULE_K_MINUS ( (lv_right_3_0= ruleNandExpr ) ) )* ) ;
    public final EObject ruleMinusExpr() throws RecognitionException {
        EObject current = null;

        Token this_K_MINUS_2=null;
        EObject this_NandExpr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalOptionLang.g:387:28: ( (this_NandExpr_0= ruleNandExpr ( () this_K_MINUS_2= RULE_K_MINUS ( (lv_right_3_0= ruleNandExpr ) ) )* ) )
            // InternalOptionLang.g:388:1: (this_NandExpr_0= ruleNandExpr ( () this_K_MINUS_2= RULE_K_MINUS ( (lv_right_3_0= ruleNandExpr ) ) )* )
            {
            // InternalOptionLang.g:388:1: (this_NandExpr_0= ruleNandExpr ( () this_K_MINUS_2= RULE_K_MINUS ( (lv_right_3_0= ruleNandExpr ) ) )* )
            // InternalOptionLang.g:389:2: this_NandExpr_0= ruleNandExpr ( () this_K_MINUS_2= RULE_K_MINUS ( (lv_right_3_0= ruleNandExpr ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMinusExprAccess().getNandExprParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_8);
            this_NandExpr_0=ruleNandExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NandExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalOptionLang.g:400:1: ( () this_K_MINUS_2= RULE_K_MINUS ( (lv_right_3_0= ruleNandExpr ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_K_MINUS) ) {
                    int LA6_2 = input.LA(2);

                    if ( (synpred6_InternalOptionLang()) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // InternalOptionLang.g:400:2: () this_K_MINUS_2= RULE_K_MINUS ( (lv_right_3_0= ruleNandExpr ) )
            	    {
            	    // InternalOptionLang.g:400:2: ()
            	    // InternalOptionLang.g:401:2: 
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

            	    this_K_MINUS_2=(Token)match(input,RULE_K_MINUS,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_K_MINUS_2, grammarAccess.getMinusExprAccess().getK_MINUSTerminalRuleCall_1_1()); 
            	          
            	    }
            	    // InternalOptionLang.g:413:1: ( (lv_right_3_0= ruleNandExpr ) )
            	    // InternalOptionLang.g:414:1: (lv_right_3_0= ruleNandExpr )
            	    {
            	    // InternalOptionLang.g:414:1: (lv_right_3_0= ruleNandExpr )
            	    // InternalOptionLang.g:415:3: lv_right_3_0= ruleNandExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMinusExprAccess().getRightNandExprParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_8);
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
    // $ANTLR end "ruleMinusExpr"


    // $ANTLR start "entryRuleNandExpr"
    // InternalOptionLang.g:439:1: entryRuleNandExpr returns [EObject current=null] : iv_ruleNandExpr= ruleNandExpr EOF ;
    public final EObject entryRuleNandExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNandExpr = null;


        try {
            // InternalOptionLang.g:440:2: (iv_ruleNandExpr= ruleNandExpr EOF )
            // InternalOptionLang.g:441:2: iv_ruleNandExpr= ruleNandExpr EOF
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
    // InternalOptionLang.g:448:1: ruleNandExpr returns [EObject current=null] : (this_AndExpr_0= ruleAndExpr ( () this_K_NAND_2= RULE_K_NAND ( (lv_right_3_0= ruleAndExpr ) ) )* ) ;
    public final EObject ruleNandExpr() throws RecognitionException {
        EObject current = null;

        Token this_K_NAND_2=null;
        EObject this_AndExpr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalOptionLang.g:451:28: ( (this_AndExpr_0= ruleAndExpr ( () this_K_NAND_2= RULE_K_NAND ( (lv_right_3_0= ruleAndExpr ) ) )* ) )
            // InternalOptionLang.g:452:1: (this_AndExpr_0= ruleAndExpr ( () this_K_NAND_2= RULE_K_NAND ( (lv_right_3_0= ruleAndExpr ) ) )* )
            {
            // InternalOptionLang.g:452:1: (this_AndExpr_0= ruleAndExpr ( () this_K_NAND_2= RULE_K_NAND ( (lv_right_3_0= ruleAndExpr ) ) )* )
            // InternalOptionLang.g:453:2: this_AndExpr_0= ruleAndExpr ( () this_K_NAND_2= RULE_K_NAND ( (lv_right_3_0= ruleAndExpr ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getNandExprAccess().getAndExprParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_9);
            this_AndExpr_0=ruleAndExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AndExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalOptionLang.g:464:1: ( () this_K_NAND_2= RULE_K_NAND ( (lv_right_3_0= ruleAndExpr ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_K_NAND) ) {
                    int LA7_2 = input.LA(2);

                    if ( (synpred7_InternalOptionLang()) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // InternalOptionLang.g:464:2: () this_K_NAND_2= RULE_K_NAND ( (lv_right_3_0= ruleAndExpr ) )
            	    {
            	    // InternalOptionLang.g:464:2: ()
            	    // InternalOptionLang.g:465:2: 
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

            	    this_K_NAND_2=(Token)match(input,RULE_K_NAND,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_K_NAND_2, grammarAccess.getNandExprAccess().getK_NANDTerminalRuleCall_1_1()); 
            	          
            	    }
            	    // InternalOptionLang.g:477:1: ( (lv_right_3_0= ruleAndExpr ) )
            	    // InternalOptionLang.g:478:1: (lv_right_3_0= ruleAndExpr )
            	    {
            	    // InternalOptionLang.g:478:1: (lv_right_3_0= ruleAndExpr )
            	    // InternalOptionLang.g:479:3: lv_right_3_0= ruleAndExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getNandExprAccess().getRightAndExprParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_9);
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
    // $ANTLR end "ruleNandExpr"


    // $ANTLR start "entryRuleAndExpr"
    // InternalOptionLang.g:503:1: entryRuleAndExpr returns [EObject current=null] : iv_ruleAndExpr= ruleAndExpr EOF ;
    public final EObject entryRuleAndExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpr = null;


        try {
            // InternalOptionLang.g:504:2: (iv_ruleAndExpr= ruleAndExpr EOF )
            // InternalOptionLang.g:505:2: iv_ruleAndExpr= ruleAndExpr EOF
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
    // InternalOptionLang.g:512:1: ruleAndExpr returns [EObject current=null] : (this_PrimaryExpr_0= rulePrimaryExpr ( () this_K_AND_2= RULE_K_AND ( (lv_right_3_0= rulePrimaryExpr ) ) )* ) ;
    public final EObject ruleAndExpr() throws RecognitionException {
        EObject current = null;

        Token this_K_AND_2=null;
        EObject this_PrimaryExpr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // InternalOptionLang.g:515:28: ( (this_PrimaryExpr_0= rulePrimaryExpr ( () this_K_AND_2= RULE_K_AND ( (lv_right_3_0= rulePrimaryExpr ) ) )* ) )
            // InternalOptionLang.g:516:1: (this_PrimaryExpr_0= rulePrimaryExpr ( () this_K_AND_2= RULE_K_AND ( (lv_right_3_0= rulePrimaryExpr ) ) )* )
            {
            // InternalOptionLang.g:516:1: (this_PrimaryExpr_0= rulePrimaryExpr ( () this_K_AND_2= RULE_K_AND ( (lv_right_3_0= rulePrimaryExpr ) ) )* )
            // InternalOptionLang.g:517:2: this_PrimaryExpr_0= rulePrimaryExpr ( () this_K_AND_2= RULE_K_AND ( (lv_right_3_0= rulePrimaryExpr ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAndExprAccess().getPrimaryExprParserRuleCall_0()); 
                  
            }
            pushFollow(FollowSets000.FOLLOW_10);
            this_PrimaryExpr_0=rulePrimaryExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PrimaryExpr_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // InternalOptionLang.g:528:1: ( () this_K_AND_2= RULE_K_AND ( (lv_right_3_0= rulePrimaryExpr ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_K_AND) ) {
                    int LA8_2 = input.LA(2);

                    if ( (synpred8_InternalOptionLang()) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // InternalOptionLang.g:528:2: () this_K_AND_2= RULE_K_AND ( (lv_right_3_0= rulePrimaryExpr ) )
            	    {
            	    // InternalOptionLang.g:528:2: ()
            	    // InternalOptionLang.g:529:2: 
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

            	    this_K_AND_2=(Token)match(input,RULE_K_AND,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_K_AND_2, grammarAccess.getAndExprAccess().getK_ANDTerminalRuleCall_1_1()); 
            	          
            	    }
            	    // InternalOptionLang.g:541:1: ( (lv_right_3_0= rulePrimaryExpr ) )
            	    // InternalOptionLang.g:542:1: (lv_right_3_0= rulePrimaryExpr )
            	    {
            	    // InternalOptionLang.g:542:1: (lv_right_3_0= rulePrimaryExpr )
            	    // InternalOptionLang.g:543:3: lv_right_3_0= rulePrimaryExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAndExprAccess().getRightPrimaryExprParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_10);
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
    // $ANTLR end "ruleAndExpr"


    // $ANTLR start "entryRulePrimaryExpr"
    // InternalOptionLang.g:567:1: entryRulePrimaryExpr returns [EObject current=null] : iv_rulePrimaryExpr= rulePrimaryExpr EOF ;
    public final EObject entryRulePrimaryExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpr = null;


        try {
            // InternalOptionLang.g:568:2: (iv_rulePrimaryExpr= rulePrimaryExpr EOF )
            // InternalOptionLang.g:569:2: iv_rulePrimaryExpr= rulePrimaryExpr EOF
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
    // InternalOptionLang.g:576:1: rulePrimaryExpr returns [EObject current=null] : ( (this_P_OPEN_0= RULE_P_OPEN this_ImpliesExpr_1= ruleImpliesExpr this_P_CLOSE_2= RULE_P_CLOSE ) | this_OptionRef_3= ruleOptionRef | this_NegExpr_4= ruleNegExpr ) ;
    public final EObject rulePrimaryExpr() throws RecognitionException {
        EObject current = null;

        Token this_P_OPEN_0=null;
        Token this_P_CLOSE_2=null;
        EObject this_ImpliesExpr_1 = null;

        EObject this_OptionRef_3 = null;

        EObject this_NegExpr_4 = null;


         enterRule(); 
            
        try {
            // InternalOptionLang.g:579:28: ( ( (this_P_OPEN_0= RULE_P_OPEN this_ImpliesExpr_1= ruleImpliesExpr this_P_CLOSE_2= RULE_P_CLOSE ) | this_OptionRef_3= ruleOptionRef | this_NegExpr_4= ruleNegExpr ) )
            // InternalOptionLang.g:580:1: ( (this_P_OPEN_0= RULE_P_OPEN this_ImpliesExpr_1= ruleImpliesExpr this_P_CLOSE_2= RULE_P_CLOSE ) | this_OptionRef_3= ruleOptionRef | this_NegExpr_4= ruleNegExpr )
            {
            // InternalOptionLang.g:580:1: ( (this_P_OPEN_0= RULE_P_OPEN this_ImpliesExpr_1= ruleImpliesExpr this_P_CLOSE_2= RULE_P_CLOSE ) | this_OptionRef_3= ruleOptionRef | this_NegExpr_4= ruleNegExpr )
            int alt9=3;
            switch ( input.LA(1) ) {
            case RULE_P_OPEN:
                {
                alt9=1;
                }
                break;
            case RULE_ID:
                {
                alt9=2;
                }
                break;
            case RULE_K_NOT:
                {
                alt9=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalOptionLang.g:580:2: (this_P_OPEN_0= RULE_P_OPEN this_ImpliesExpr_1= ruleImpliesExpr this_P_CLOSE_2= RULE_P_CLOSE )
                    {
                    // InternalOptionLang.g:580:2: (this_P_OPEN_0= RULE_P_OPEN this_ImpliesExpr_1= ruleImpliesExpr this_P_CLOSE_2= RULE_P_CLOSE )
                    // InternalOptionLang.g:580:3: this_P_OPEN_0= RULE_P_OPEN this_ImpliesExpr_1= ruleImpliesExpr this_P_CLOSE_2= RULE_P_CLOSE
                    {
                    this_P_OPEN_0=(Token)match(input,RULE_P_OPEN,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_P_OPEN_0, grammarAccess.getPrimaryExprAccess().getP_OPENTerminalRuleCall_0_0()); 
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExprAccess().getImpliesExprParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_11);
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
                    // InternalOptionLang.g:602:2: this_OptionRef_3= ruleOptionRef
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
                    // InternalOptionLang.g:615:2: this_NegExpr_4= ruleNegExpr
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
    // InternalOptionLang.g:634:1: entryRuleBigExpr returns [EObject current=null] : iv_ruleBigExpr= ruleBigExpr EOF ;
    public final EObject entryRuleBigExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBigExpr = null;


        try {
            // InternalOptionLang.g:635:2: (iv_ruleBigExpr= ruleBigExpr EOF )
            // InternalOptionLang.g:636:2: iv_ruleBigExpr= ruleBigExpr EOF
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
    // InternalOptionLang.g:643:1: ruleBigExpr returns [EObject current=null] : (this_BigAndExpr_0= ruleBigAndExpr | this_BigOrExpr_1= ruleBigOrExpr | this_BigXorExpr_2= ruleBigXorExpr | this_BigNandExpr_3= ruleBigNandExpr ) ;
    public final EObject ruleBigExpr() throws RecognitionException {
        EObject current = null;

        EObject this_BigAndExpr_0 = null;

        EObject this_BigOrExpr_1 = null;

        EObject this_BigXorExpr_2 = null;

        EObject this_BigNandExpr_3 = null;


         enterRule(); 
            
        try {
            // InternalOptionLang.g:646:28: ( (this_BigAndExpr_0= ruleBigAndExpr | this_BigOrExpr_1= ruleBigOrExpr | this_BigXorExpr_2= ruleBigXorExpr | this_BigNandExpr_3= ruleBigNandExpr ) )
            // InternalOptionLang.g:647:1: (this_BigAndExpr_0= ruleBigAndExpr | this_BigOrExpr_1= ruleBigOrExpr | this_BigXorExpr_2= ruleBigXorExpr | this_BigNandExpr_3= ruleBigNandExpr )
            {
            // InternalOptionLang.g:647:1: (this_BigAndExpr_0= ruleBigAndExpr | this_BigOrExpr_1= ruleBigOrExpr | this_BigXorExpr_2= ruleBigXorExpr | this_BigNandExpr_3= ruleBigNandExpr )
            int alt10=4;
            switch ( input.LA(1) ) {
            case RULE_K_BIG_AND:
                {
                alt10=1;
                }
                break;
            case RULE_K_BIG_OR:
                {
                alt10=2;
                }
                break;
            case RULE_K_BIG_XOR:
                {
                alt10=3;
                }
                break;
            case RULE_K_BIG_NAND:
                {
                alt10=4;
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
                    // InternalOptionLang.g:648:2: this_BigAndExpr_0= ruleBigAndExpr
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
                    // InternalOptionLang.g:661:2: this_BigOrExpr_1= ruleBigOrExpr
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
                    // InternalOptionLang.g:674:2: this_BigXorExpr_2= ruleBigXorExpr
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
                    // InternalOptionLang.g:687:2: this_BigNandExpr_3= ruleBigNandExpr
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
    // InternalOptionLang.g:706:1: entryRuleBigAndExpr returns [EObject current=null] : iv_ruleBigAndExpr= ruleBigAndExpr EOF ;
    public final EObject entryRuleBigAndExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBigAndExpr = null;


        try {
            // InternalOptionLang.g:707:2: (iv_ruleBigAndExpr= ruleBigAndExpr EOF )
            // InternalOptionLang.g:708:2: iv_ruleBigAndExpr= ruleBigAndExpr EOF
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
    // InternalOptionLang.g:715:1: ruleBigAndExpr returns [EObject current=null] : (this_K_BIG_AND_0= RULE_K_BIG_AND this_P_OPEN_1= RULE_P_OPEN ( (lv_children_2_0= ruleOptionExpr ) ) (this_COMMA_3= RULE_COMMA ( (lv_children_4_0= ruleOptionExpr ) ) )* this_P_CLOSE_5= RULE_P_CLOSE ) ;
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
            // InternalOptionLang.g:718:28: ( (this_K_BIG_AND_0= RULE_K_BIG_AND this_P_OPEN_1= RULE_P_OPEN ( (lv_children_2_0= ruleOptionExpr ) ) (this_COMMA_3= RULE_COMMA ( (lv_children_4_0= ruleOptionExpr ) ) )* this_P_CLOSE_5= RULE_P_CLOSE ) )
            // InternalOptionLang.g:719:1: (this_K_BIG_AND_0= RULE_K_BIG_AND this_P_OPEN_1= RULE_P_OPEN ( (lv_children_2_0= ruleOptionExpr ) ) (this_COMMA_3= RULE_COMMA ( (lv_children_4_0= ruleOptionExpr ) ) )* this_P_CLOSE_5= RULE_P_CLOSE )
            {
            // InternalOptionLang.g:719:1: (this_K_BIG_AND_0= RULE_K_BIG_AND this_P_OPEN_1= RULE_P_OPEN ( (lv_children_2_0= ruleOptionExpr ) ) (this_COMMA_3= RULE_COMMA ( (lv_children_4_0= ruleOptionExpr ) ) )* this_P_CLOSE_5= RULE_P_CLOSE )
            // InternalOptionLang.g:719:2: this_K_BIG_AND_0= RULE_K_BIG_AND this_P_OPEN_1= RULE_P_OPEN ( (lv_children_2_0= ruleOptionExpr ) ) (this_COMMA_3= RULE_COMMA ( (lv_children_4_0= ruleOptionExpr ) ) )* this_P_CLOSE_5= RULE_P_CLOSE
            {
            this_K_BIG_AND_0=(Token)match(input,RULE_K_BIG_AND,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_K_BIG_AND_0, grammarAccess.getBigAndExprAccess().getK_BIG_ANDTerminalRuleCall_0()); 
                  
            }
            this_P_OPEN_1=(Token)match(input,RULE_P_OPEN,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_P_OPEN_1, grammarAccess.getBigAndExprAccess().getP_OPENTerminalRuleCall_1()); 
                  
            }
            // InternalOptionLang.g:727:1: ( (lv_children_2_0= ruleOptionExpr ) )
            // InternalOptionLang.g:728:1: (lv_children_2_0= ruleOptionExpr )
            {
            // InternalOptionLang.g:728:1: (lv_children_2_0= ruleOptionExpr )
            // InternalOptionLang.g:729:3: lv_children_2_0= ruleOptionExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBigAndExprAccess().getChildrenOptionExprParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_14);
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

            // InternalOptionLang.g:745:2: (this_COMMA_3= RULE_COMMA ( (lv_children_4_0= ruleOptionExpr ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_COMMA) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalOptionLang.g:745:3: this_COMMA_3= RULE_COMMA ( (lv_children_4_0= ruleOptionExpr ) )
            	    {
            	    this_COMMA_3=(Token)match(input,RULE_COMMA,FollowSets000.FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_3, grammarAccess.getBigAndExprAccess().getCOMMATerminalRuleCall_3_0()); 
            	          
            	    }
            	    // InternalOptionLang.g:749:1: ( (lv_children_4_0= ruleOptionExpr ) )
            	    // InternalOptionLang.g:750:1: (lv_children_4_0= ruleOptionExpr )
            	    {
            	    // InternalOptionLang.g:750:1: (lv_children_4_0= ruleOptionExpr )
            	    // InternalOptionLang.g:751:3: lv_children_4_0= ruleOptionExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBigAndExprAccess().getChildrenOptionExprParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_14);
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
            	    break loop11;
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
    // InternalOptionLang.g:779:1: entryRuleBigOrExpr returns [EObject current=null] : iv_ruleBigOrExpr= ruleBigOrExpr EOF ;
    public final EObject entryRuleBigOrExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBigOrExpr = null;


        try {
            // InternalOptionLang.g:780:2: (iv_ruleBigOrExpr= ruleBigOrExpr EOF )
            // InternalOptionLang.g:781:2: iv_ruleBigOrExpr= ruleBigOrExpr EOF
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
    // InternalOptionLang.g:788:1: ruleBigOrExpr returns [EObject current=null] : (this_K_BIG_OR_0= RULE_K_BIG_OR this_P_OPEN_1= RULE_P_OPEN ( (lv_children_2_0= ruleOptionExpr ) ) (this_COMMA_3= RULE_COMMA ( (lv_children_4_0= ruleOptionExpr ) ) )* this_P_CLOSE_5= RULE_P_CLOSE ) ;
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
            // InternalOptionLang.g:791:28: ( (this_K_BIG_OR_0= RULE_K_BIG_OR this_P_OPEN_1= RULE_P_OPEN ( (lv_children_2_0= ruleOptionExpr ) ) (this_COMMA_3= RULE_COMMA ( (lv_children_4_0= ruleOptionExpr ) ) )* this_P_CLOSE_5= RULE_P_CLOSE ) )
            // InternalOptionLang.g:792:1: (this_K_BIG_OR_0= RULE_K_BIG_OR this_P_OPEN_1= RULE_P_OPEN ( (lv_children_2_0= ruleOptionExpr ) ) (this_COMMA_3= RULE_COMMA ( (lv_children_4_0= ruleOptionExpr ) ) )* this_P_CLOSE_5= RULE_P_CLOSE )
            {
            // InternalOptionLang.g:792:1: (this_K_BIG_OR_0= RULE_K_BIG_OR this_P_OPEN_1= RULE_P_OPEN ( (lv_children_2_0= ruleOptionExpr ) ) (this_COMMA_3= RULE_COMMA ( (lv_children_4_0= ruleOptionExpr ) ) )* this_P_CLOSE_5= RULE_P_CLOSE )
            // InternalOptionLang.g:792:2: this_K_BIG_OR_0= RULE_K_BIG_OR this_P_OPEN_1= RULE_P_OPEN ( (lv_children_2_0= ruleOptionExpr ) ) (this_COMMA_3= RULE_COMMA ( (lv_children_4_0= ruleOptionExpr ) ) )* this_P_CLOSE_5= RULE_P_CLOSE
            {
            this_K_BIG_OR_0=(Token)match(input,RULE_K_BIG_OR,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_K_BIG_OR_0, grammarAccess.getBigOrExprAccess().getK_BIG_ORTerminalRuleCall_0()); 
                  
            }
            this_P_OPEN_1=(Token)match(input,RULE_P_OPEN,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_P_OPEN_1, grammarAccess.getBigOrExprAccess().getP_OPENTerminalRuleCall_1()); 
                  
            }
            // InternalOptionLang.g:800:1: ( (lv_children_2_0= ruleOptionExpr ) )
            // InternalOptionLang.g:801:1: (lv_children_2_0= ruleOptionExpr )
            {
            // InternalOptionLang.g:801:1: (lv_children_2_0= ruleOptionExpr )
            // InternalOptionLang.g:802:3: lv_children_2_0= ruleOptionExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBigOrExprAccess().getChildrenOptionExprParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_14);
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

            // InternalOptionLang.g:818:2: (this_COMMA_3= RULE_COMMA ( (lv_children_4_0= ruleOptionExpr ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_COMMA) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalOptionLang.g:818:3: this_COMMA_3= RULE_COMMA ( (lv_children_4_0= ruleOptionExpr ) )
            	    {
            	    this_COMMA_3=(Token)match(input,RULE_COMMA,FollowSets000.FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_3, grammarAccess.getBigOrExprAccess().getCOMMATerminalRuleCall_3_0()); 
            	          
            	    }
            	    // InternalOptionLang.g:822:1: ( (lv_children_4_0= ruleOptionExpr ) )
            	    // InternalOptionLang.g:823:1: (lv_children_4_0= ruleOptionExpr )
            	    {
            	    // InternalOptionLang.g:823:1: (lv_children_4_0= ruleOptionExpr )
            	    // InternalOptionLang.g:824:3: lv_children_4_0= ruleOptionExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBigOrExprAccess().getChildrenOptionExprParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_14);
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
            	    break loop12;
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
    // InternalOptionLang.g:852:1: entryRuleBigXorExpr returns [EObject current=null] : iv_ruleBigXorExpr= ruleBigXorExpr EOF ;
    public final EObject entryRuleBigXorExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBigXorExpr = null;


        try {
            // InternalOptionLang.g:853:2: (iv_ruleBigXorExpr= ruleBigXorExpr EOF )
            // InternalOptionLang.g:854:2: iv_ruleBigXorExpr= ruleBigXorExpr EOF
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
    // InternalOptionLang.g:861:1: ruleBigXorExpr returns [EObject current=null] : (this_K_BIG_XOR_0= RULE_K_BIG_XOR this_P_OPEN_1= RULE_P_OPEN ( (lv_children_2_0= ruleOptionExpr ) ) (this_COMMA_3= RULE_COMMA ( (lv_children_4_0= ruleOptionExpr ) ) )* this_P_CLOSE_5= RULE_P_CLOSE ) ;
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
            // InternalOptionLang.g:864:28: ( (this_K_BIG_XOR_0= RULE_K_BIG_XOR this_P_OPEN_1= RULE_P_OPEN ( (lv_children_2_0= ruleOptionExpr ) ) (this_COMMA_3= RULE_COMMA ( (lv_children_4_0= ruleOptionExpr ) ) )* this_P_CLOSE_5= RULE_P_CLOSE ) )
            // InternalOptionLang.g:865:1: (this_K_BIG_XOR_0= RULE_K_BIG_XOR this_P_OPEN_1= RULE_P_OPEN ( (lv_children_2_0= ruleOptionExpr ) ) (this_COMMA_3= RULE_COMMA ( (lv_children_4_0= ruleOptionExpr ) ) )* this_P_CLOSE_5= RULE_P_CLOSE )
            {
            // InternalOptionLang.g:865:1: (this_K_BIG_XOR_0= RULE_K_BIG_XOR this_P_OPEN_1= RULE_P_OPEN ( (lv_children_2_0= ruleOptionExpr ) ) (this_COMMA_3= RULE_COMMA ( (lv_children_4_0= ruleOptionExpr ) ) )* this_P_CLOSE_5= RULE_P_CLOSE )
            // InternalOptionLang.g:865:2: this_K_BIG_XOR_0= RULE_K_BIG_XOR this_P_OPEN_1= RULE_P_OPEN ( (lv_children_2_0= ruleOptionExpr ) ) (this_COMMA_3= RULE_COMMA ( (lv_children_4_0= ruleOptionExpr ) ) )* this_P_CLOSE_5= RULE_P_CLOSE
            {
            this_K_BIG_XOR_0=(Token)match(input,RULE_K_BIG_XOR,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_K_BIG_XOR_0, grammarAccess.getBigXorExprAccess().getK_BIG_XORTerminalRuleCall_0()); 
                  
            }
            this_P_OPEN_1=(Token)match(input,RULE_P_OPEN,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_P_OPEN_1, grammarAccess.getBigXorExprAccess().getP_OPENTerminalRuleCall_1()); 
                  
            }
            // InternalOptionLang.g:873:1: ( (lv_children_2_0= ruleOptionExpr ) )
            // InternalOptionLang.g:874:1: (lv_children_2_0= ruleOptionExpr )
            {
            // InternalOptionLang.g:874:1: (lv_children_2_0= ruleOptionExpr )
            // InternalOptionLang.g:875:3: lv_children_2_0= ruleOptionExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBigXorExprAccess().getChildrenOptionExprParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_14);
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

            // InternalOptionLang.g:891:2: (this_COMMA_3= RULE_COMMA ( (lv_children_4_0= ruleOptionExpr ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_COMMA) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalOptionLang.g:891:3: this_COMMA_3= RULE_COMMA ( (lv_children_4_0= ruleOptionExpr ) )
            	    {
            	    this_COMMA_3=(Token)match(input,RULE_COMMA,FollowSets000.FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_3, grammarAccess.getBigXorExprAccess().getCOMMATerminalRuleCall_3_0()); 
            	          
            	    }
            	    // InternalOptionLang.g:895:1: ( (lv_children_4_0= ruleOptionExpr ) )
            	    // InternalOptionLang.g:896:1: (lv_children_4_0= ruleOptionExpr )
            	    {
            	    // InternalOptionLang.g:896:1: (lv_children_4_0= ruleOptionExpr )
            	    // InternalOptionLang.g:897:3: lv_children_4_0= ruleOptionExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBigXorExprAccess().getChildrenOptionExprParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_14);
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
            	    break loop13;
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
    // InternalOptionLang.g:925:1: entryRuleBigNandExpr returns [EObject current=null] : iv_ruleBigNandExpr= ruleBigNandExpr EOF ;
    public final EObject entryRuleBigNandExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBigNandExpr = null;


        try {
            // InternalOptionLang.g:926:2: (iv_ruleBigNandExpr= ruleBigNandExpr EOF )
            // InternalOptionLang.g:927:2: iv_ruleBigNandExpr= ruleBigNandExpr EOF
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
    // InternalOptionLang.g:934:1: ruleBigNandExpr returns [EObject current=null] : (this_K_BIG_NAND_0= RULE_K_BIG_NAND this_P_OPEN_1= RULE_P_OPEN ( (lv_children_2_0= ruleOptionExpr ) ) (this_COMMA_3= RULE_COMMA ( (lv_children_4_0= ruleOptionExpr ) ) )* this_P_CLOSE_5= RULE_P_CLOSE ) ;
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
            // InternalOptionLang.g:937:28: ( (this_K_BIG_NAND_0= RULE_K_BIG_NAND this_P_OPEN_1= RULE_P_OPEN ( (lv_children_2_0= ruleOptionExpr ) ) (this_COMMA_3= RULE_COMMA ( (lv_children_4_0= ruleOptionExpr ) ) )* this_P_CLOSE_5= RULE_P_CLOSE ) )
            // InternalOptionLang.g:938:1: (this_K_BIG_NAND_0= RULE_K_BIG_NAND this_P_OPEN_1= RULE_P_OPEN ( (lv_children_2_0= ruleOptionExpr ) ) (this_COMMA_3= RULE_COMMA ( (lv_children_4_0= ruleOptionExpr ) ) )* this_P_CLOSE_5= RULE_P_CLOSE )
            {
            // InternalOptionLang.g:938:1: (this_K_BIG_NAND_0= RULE_K_BIG_NAND this_P_OPEN_1= RULE_P_OPEN ( (lv_children_2_0= ruleOptionExpr ) ) (this_COMMA_3= RULE_COMMA ( (lv_children_4_0= ruleOptionExpr ) ) )* this_P_CLOSE_5= RULE_P_CLOSE )
            // InternalOptionLang.g:938:2: this_K_BIG_NAND_0= RULE_K_BIG_NAND this_P_OPEN_1= RULE_P_OPEN ( (lv_children_2_0= ruleOptionExpr ) ) (this_COMMA_3= RULE_COMMA ( (lv_children_4_0= ruleOptionExpr ) ) )* this_P_CLOSE_5= RULE_P_CLOSE
            {
            this_K_BIG_NAND_0=(Token)match(input,RULE_K_BIG_NAND,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_K_BIG_NAND_0, grammarAccess.getBigNandExprAccess().getK_BIG_NANDTerminalRuleCall_0()); 
                  
            }
            this_P_OPEN_1=(Token)match(input,RULE_P_OPEN,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_P_OPEN_1, grammarAccess.getBigNandExprAccess().getP_OPENTerminalRuleCall_1()); 
                  
            }
            // InternalOptionLang.g:946:1: ( (lv_children_2_0= ruleOptionExpr ) )
            // InternalOptionLang.g:947:1: (lv_children_2_0= ruleOptionExpr )
            {
            // InternalOptionLang.g:947:1: (lv_children_2_0= ruleOptionExpr )
            // InternalOptionLang.g:948:3: lv_children_2_0= ruleOptionExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getBigNandExprAccess().getChildrenOptionExprParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_14);
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

            // InternalOptionLang.g:964:2: (this_COMMA_3= RULE_COMMA ( (lv_children_4_0= ruleOptionExpr ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_COMMA) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalOptionLang.g:964:3: this_COMMA_3= RULE_COMMA ( (lv_children_4_0= ruleOptionExpr ) )
            	    {
            	    this_COMMA_3=(Token)match(input,RULE_COMMA,FollowSets000.FOLLOW_13); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_COMMA_3, grammarAccess.getBigNandExprAccess().getCOMMATerminalRuleCall_3_0()); 
            	          
            	    }
            	    // InternalOptionLang.g:968:1: ( (lv_children_4_0= ruleOptionExpr ) )
            	    // InternalOptionLang.g:969:1: (lv_children_4_0= ruleOptionExpr )
            	    {
            	    // InternalOptionLang.g:969:1: (lv_children_4_0= ruleOptionExpr )
            	    // InternalOptionLang.g:970:3: lv_children_4_0= ruleOptionExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBigNandExprAccess().getChildrenOptionExprParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_14);
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
            	    break loop14;
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
    // InternalOptionLang.g:998:1: entryRuleOptionRef returns [EObject current=null] : iv_ruleOptionRef= ruleOptionRef EOF ;
    public final EObject entryRuleOptionRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionRef = null;


        try {
            // InternalOptionLang.g:999:2: (iv_ruleOptionRef= ruleOptionRef EOF )
            // InternalOptionLang.g:1000:2: iv_ruleOptionRef= ruleOptionRef EOF
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
    // InternalOptionLang.g:1007:1: ruleOptionRef returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleOptionRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // InternalOptionLang.g:1010:28: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalOptionLang.g:1011:1: ( (otherlv_0= RULE_ID ) )
            {
            // InternalOptionLang.g:1011:1: ( (otherlv_0= RULE_ID ) )
            // InternalOptionLang.g:1012:1: (otherlv_0= RULE_ID )
            {
            // InternalOptionLang.g:1012:1: (otherlv_0= RULE_ID )
            // InternalOptionLang.g:1013:3: otherlv_0= RULE_ID
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
    // InternalOptionLang.g:1035:1: entryRuleNegExpr returns [EObject current=null] : iv_ruleNegExpr= ruleNegExpr EOF ;
    public final EObject entryRuleNegExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegExpr = null;


        try {
            // InternalOptionLang.g:1036:2: (iv_ruleNegExpr= ruleNegExpr EOF )
            // InternalOptionLang.g:1037:2: iv_ruleNegExpr= ruleNegExpr EOF
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
    // InternalOptionLang.g:1044:1: ruleNegExpr returns [EObject current=null] : (this_K_NOT_0= RULE_K_NOT ( (lv_neg_1_0= ruleOptionExpr ) ) ) ;
    public final EObject ruleNegExpr() throws RecognitionException {
        EObject current = null;

        Token this_K_NOT_0=null;
        EObject lv_neg_1_0 = null;


         enterRule(); 
            
        try {
            // InternalOptionLang.g:1047:28: ( (this_K_NOT_0= RULE_K_NOT ( (lv_neg_1_0= ruleOptionExpr ) ) ) )
            // InternalOptionLang.g:1048:1: (this_K_NOT_0= RULE_K_NOT ( (lv_neg_1_0= ruleOptionExpr ) ) )
            {
            // InternalOptionLang.g:1048:1: (this_K_NOT_0= RULE_K_NOT ( (lv_neg_1_0= ruleOptionExpr ) ) )
            // InternalOptionLang.g:1048:2: this_K_NOT_0= RULE_K_NOT ( (lv_neg_1_0= ruleOptionExpr ) )
            {
            this_K_NOT_0=(Token)match(input,RULE_K_NOT,FollowSets000.FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_K_NOT_0, grammarAccess.getNegExprAccess().getK_NOTTerminalRuleCall_0()); 
                  
            }
            // InternalOptionLang.g:1052:1: ( (lv_neg_1_0= ruleOptionExpr ) )
            // InternalOptionLang.g:1053:1: (lv_neg_1_0= ruleOptionExpr )
            {
            // InternalOptionLang.g:1053:1: (lv_neg_1_0= ruleOptionExpr )
            // InternalOptionLang.g:1054:3: lv_neg_1_0= ruleOptionExpr
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

    // $ANTLR start synpred2_InternalOptionLang
    public final void synpred2_InternalOptionLang_fragment() throws RecognitionException {   
        Token this_K_IFF_2=null;
        EObject lv_right_3_0 = null;


        // InternalOptionLang.g:144:2: ( () this_K_IFF_2= RULE_K_IFF ( (lv_right_3_0= ruleBiconditionalExpr ) ) )
        // InternalOptionLang.g:144:2: () this_K_IFF_2= RULE_K_IFF ( (lv_right_3_0= ruleBiconditionalExpr ) )
        {
        // InternalOptionLang.g:144:2: ()
        // InternalOptionLang.g:145:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        this_K_IFF_2=(Token)match(input,RULE_K_IFF,FollowSets000.FOLLOW_4); if (state.failed) return ;
        // InternalOptionLang.g:157:1: ( (lv_right_3_0= ruleBiconditionalExpr ) )
        // InternalOptionLang.g:158:1: (lv_right_3_0= ruleBiconditionalExpr )
        {
        // InternalOptionLang.g:158:1: (lv_right_3_0= ruleBiconditionalExpr )
        // InternalOptionLang.g:159:3: lv_right_3_0= ruleBiconditionalExpr
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
    // $ANTLR end synpred2_InternalOptionLang

    // $ANTLR start synpred3_InternalOptionLang
    public final void synpred3_InternalOptionLang_fragment() throws RecognitionException {   
        Token this_K_IMP_2=null;
        EObject lv_right_3_0 = null;


        // InternalOptionLang.g:208:2: ( () this_K_IMP_2= RULE_K_IMP ( (lv_right_3_0= ruleOrExpr ) ) )
        // InternalOptionLang.g:208:2: () this_K_IMP_2= RULE_K_IMP ( (lv_right_3_0= ruleOrExpr ) )
        {
        // InternalOptionLang.g:208:2: ()
        // InternalOptionLang.g:209:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        this_K_IMP_2=(Token)match(input,RULE_K_IMP,FollowSets000.FOLLOW_4); if (state.failed) return ;
        // InternalOptionLang.g:221:1: ( (lv_right_3_0= ruleOrExpr ) )
        // InternalOptionLang.g:222:1: (lv_right_3_0= ruleOrExpr )
        {
        // InternalOptionLang.g:222:1: (lv_right_3_0= ruleOrExpr )
        // InternalOptionLang.g:223:3: lv_right_3_0= ruleOrExpr
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
    // $ANTLR end synpred3_InternalOptionLang

    // $ANTLR start synpred4_InternalOptionLang
    public final void synpred4_InternalOptionLang_fragment() throws RecognitionException {   
        Token this_K_OR_2=null;
        EObject lv_right_3_0 = null;


        // InternalOptionLang.g:272:2: ( () this_K_OR_2= RULE_K_OR ( (lv_right_3_0= ruleXorExpr ) ) )
        // InternalOptionLang.g:272:2: () this_K_OR_2= RULE_K_OR ( (lv_right_3_0= ruleXorExpr ) )
        {
        // InternalOptionLang.g:272:2: ()
        // InternalOptionLang.g:273:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        this_K_OR_2=(Token)match(input,RULE_K_OR,FollowSets000.FOLLOW_4); if (state.failed) return ;
        // InternalOptionLang.g:285:1: ( (lv_right_3_0= ruleXorExpr ) )
        // InternalOptionLang.g:286:1: (lv_right_3_0= ruleXorExpr )
        {
        // InternalOptionLang.g:286:1: (lv_right_3_0= ruleXorExpr )
        // InternalOptionLang.g:287:3: lv_right_3_0= ruleXorExpr
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
    // $ANTLR end synpred4_InternalOptionLang

    // $ANTLR start synpred5_InternalOptionLang
    public final void synpred5_InternalOptionLang_fragment() throws RecognitionException {   
        Token this_K_XOR_2=null;
        EObject lv_right_3_0 = null;


        // InternalOptionLang.g:336:2: ( () this_K_XOR_2= RULE_K_XOR ( (lv_right_3_0= ruleMinusExpr ) ) )
        // InternalOptionLang.g:336:2: () this_K_XOR_2= RULE_K_XOR ( (lv_right_3_0= ruleMinusExpr ) )
        {
        // InternalOptionLang.g:336:2: ()
        // InternalOptionLang.g:337:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        this_K_XOR_2=(Token)match(input,RULE_K_XOR,FollowSets000.FOLLOW_4); if (state.failed) return ;
        // InternalOptionLang.g:349:1: ( (lv_right_3_0= ruleMinusExpr ) )
        // InternalOptionLang.g:350:1: (lv_right_3_0= ruleMinusExpr )
        {
        // InternalOptionLang.g:350:1: (lv_right_3_0= ruleMinusExpr )
        // InternalOptionLang.g:351:3: lv_right_3_0= ruleMinusExpr
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
    // $ANTLR end synpred5_InternalOptionLang

    // $ANTLR start synpred6_InternalOptionLang
    public final void synpred6_InternalOptionLang_fragment() throws RecognitionException {   
        Token this_K_MINUS_2=null;
        EObject lv_right_3_0 = null;


        // InternalOptionLang.g:400:2: ( () this_K_MINUS_2= RULE_K_MINUS ( (lv_right_3_0= ruleNandExpr ) ) )
        // InternalOptionLang.g:400:2: () this_K_MINUS_2= RULE_K_MINUS ( (lv_right_3_0= ruleNandExpr ) )
        {
        // InternalOptionLang.g:400:2: ()
        // InternalOptionLang.g:401:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        this_K_MINUS_2=(Token)match(input,RULE_K_MINUS,FollowSets000.FOLLOW_4); if (state.failed) return ;
        // InternalOptionLang.g:413:1: ( (lv_right_3_0= ruleNandExpr ) )
        // InternalOptionLang.g:414:1: (lv_right_3_0= ruleNandExpr )
        {
        // InternalOptionLang.g:414:1: (lv_right_3_0= ruleNandExpr )
        // InternalOptionLang.g:415:3: lv_right_3_0= ruleNandExpr
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
    // $ANTLR end synpred6_InternalOptionLang

    // $ANTLR start synpred7_InternalOptionLang
    public final void synpred7_InternalOptionLang_fragment() throws RecognitionException {   
        Token this_K_NAND_2=null;
        EObject lv_right_3_0 = null;


        // InternalOptionLang.g:464:2: ( () this_K_NAND_2= RULE_K_NAND ( (lv_right_3_0= ruleAndExpr ) ) )
        // InternalOptionLang.g:464:2: () this_K_NAND_2= RULE_K_NAND ( (lv_right_3_0= ruleAndExpr ) )
        {
        // InternalOptionLang.g:464:2: ()
        // InternalOptionLang.g:465:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        this_K_NAND_2=(Token)match(input,RULE_K_NAND,FollowSets000.FOLLOW_4); if (state.failed) return ;
        // InternalOptionLang.g:477:1: ( (lv_right_3_0= ruleAndExpr ) )
        // InternalOptionLang.g:478:1: (lv_right_3_0= ruleAndExpr )
        {
        // InternalOptionLang.g:478:1: (lv_right_3_0= ruleAndExpr )
        // InternalOptionLang.g:479:3: lv_right_3_0= ruleAndExpr
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
    // $ANTLR end synpred7_InternalOptionLang

    // $ANTLR start synpred8_InternalOptionLang
    public final void synpred8_InternalOptionLang_fragment() throws RecognitionException {   
        Token this_K_AND_2=null;
        EObject lv_right_3_0 = null;


        // InternalOptionLang.g:528:2: ( () this_K_AND_2= RULE_K_AND ( (lv_right_3_0= rulePrimaryExpr ) ) )
        // InternalOptionLang.g:528:2: () this_K_AND_2= RULE_K_AND ( (lv_right_3_0= rulePrimaryExpr ) )
        {
        // InternalOptionLang.g:528:2: ()
        // InternalOptionLang.g:529:2: 
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }

        }

        this_K_AND_2=(Token)match(input,RULE_K_AND,FollowSets000.FOLLOW_4); if (state.failed) return ;
        // InternalOptionLang.g:541:1: ( (lv_right_3_0= rulePrimaryExpr ) )
        // InternalOptionLang.g:542:1: (lv_right_3_0= rulePrimaryExpr )
        {
        // InternalOptionLang.g:542:1: (lv_right_3_0= rulePrimaryExpr )
        // InternalOptionLang.g:543:3: lv_right_3_0= rulePrimaryExpr
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
    // $ANTLR end synpred8_InternalOptionLang

    // Delegated rules

    public final boolean synpred7_InternalOptionLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalOptionLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalOptionLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalOptionLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalOptionLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalOptionLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalOptionLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalOptionLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalOptionLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalOptionLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalOptionLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalOptionLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalOptionLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalOptionLang_fragment(); // can never throw exception
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
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000000C0800L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000022L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000042L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000082L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000102L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000202L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000402L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000FA800L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000005000L});
    }


}
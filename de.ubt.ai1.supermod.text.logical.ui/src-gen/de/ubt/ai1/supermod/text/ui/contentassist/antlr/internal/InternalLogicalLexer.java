package de.ubt.ai1.supermod.text.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLogicalLexer extends Lexer {
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

    public InternalLogicalLexer() {;} 
    public InternalLogicalLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalLogicalLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalLogical.g"; }

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLogical.g:11:7: ( 'unknown' )
            // InternalLogical.g:11:9: 'unknown'
            {
            match("unknown"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLogical.g:12:7: ( 'true' )
            // InternalLogical.g:12:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLogical.g:13:7: ( 'false' )
            // InternalLogical.g:13:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLogical.g:14:7: ( 'logical' )
            // InternalLogical.g:14:9: 'logical'
            {
            match("logical"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLogical.g:15:7: ( 'dimension' )
            // InternalLogical.g:15:9: 'dimension'
            {
            match("dimension"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLogical.g:16:7: ( '{' )
            // InternalLogical.g:16:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLogical.g:17:7: ( '}' )
            // InternalLogical.g:17:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLogical.g:18:7: ( 'option' )
            // InternalLogical.g:18:9: 'option'
            {
            match("option"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLogical.g:19:7: ( 'invariant' )
            // InternalLogical.g:19:9: 'invariant'
            {
            match("invariant"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLogical.g:20:7: ( 'preference' )
            // InternalLogical.g:20:9: 'preference'
            {
            match("preference"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLogical.g:21:7: ( 'for' )
            // InternalLogical.g:21:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLogical.g:22:7: ( 'default' )
            // InternalLogical.g:22:9: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLogical.g:23:7: ( 'binding' )
            // InternalLogical.g:23:9: 'binding'
            {
            match("binding"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLogical.g:24:7: ( '=' )
            // InternalLogical.g:24:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "RULE_P_OPEN"
    public final void mRULE_P_OPEN() throws RecognitionException {
        try {
            int _type = RULE_P_OPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLogical.g:4293:13: ( '(' )
            // InternalLogical.g:4293:15: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_P_OPEN"

    // $ANTLR start "RULE_P_CLOSE"
    public final void mRULE_P_CLOSE() throws RecognitionException {
        try {
            int _type = RULE_P_CLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLogical.g:4295:14: ( ')' )
            // InternalLogical.g:4295:16: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_P_CLOSE"

    // $ANTLR start "RULE_K_NOT"
    public final void mRULE_K_NOT() throws RecognitionException {
        try {
            int _type = RULE_K_NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLogical.g:4297:12: ( 'not' )
            // InternalLogical.g:4297:14: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_K_NOT"

    // $ANTLR start "RULE_K_AND"
    public final void mRULE_K_AND() throws RecognitionException {
        try {
            int _type = RULE_K_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLogical.g:4299:12: ( 'and' )
            // InternalLogical.g:4299:14: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_K_AND"

    // $ANTLR start "RULE_K_OR"
    public final void mRULE_K_OR() throws RecognitionException {
        try {
            int _type = RULE_K_OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLogical.g:4301:11: ( 'or' )
            // InternalLogical.g:4301:13: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_K_OR"

    // $ANTLR start "RULE_K_XOR"
    public final void mRULE_K_XOR() throws RecognitionException {
        try {
            int _type = RULE_K_XOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLogical.g:4303:12: ( 'xor' )
            // InternalLogical.g:4303:14: 'xor'
            {
            match("xor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_K_XOR"

    // $ANTLR start "RULE_K_IMP"
    public final void mRULE_K_IMP() throws RecognitionException {
        try {
            int _type = RULE_K_IMP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLogical.g:4305:12: ( 'implies' )
            // InternalLogical.g:4305:14: 'implies'
            {
            match("implies"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_K_IMP"

    // $ANTLR start "RULE_K_IFF"
    public final void mRULE_K_IFF() throws RecognitionException {
        try {
            int _type = RULE_K_IFF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLogical.g:4307:12: ( 'iff' )
            // InternalLogical.g:4307:14: 'iff'
            {
            match("iff"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_K_IFF"

    // $ANTLR start "RULE_K_MINUS"
    public final void mRULE_K_MINUS() throws RecognitionException {
        try {
            int _type = RULE_K_MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLogical.g:4309:14: ( 'minus' )
            // InternalLogical.g:4309:16: 'minus'
            {
            match("minus"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_K_MINUS"

    // $ANTLR start "RULE_K_NAND"
    public final void mRULE_K_NAND() throws RecognitionException {
        try {
            int _type = RULE_K_NAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLogical.g:4311:13: ( 'nand' )
            // InternalLogical.g:4311:15: 'nand'
            {
            match("nand"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_K_NAND"

    // $ANTLR start "RULE_K_BIG_AND"
    public final void mRULE_K_BIG_AND() throws RecognitionException {
        try {
            int _type = RULE_K_BIG_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLogical.g:4313:16: ( 'AND' )
            // InternalLogical.g:4313:18: 'AND'
            {
            match("AND"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_K_BIG_AND"

    // $ANTLR start "RULE_K_BIG_OR"
    public final void mRULE_K_BIG_OR() throws RecognitionException {
        try {
            int _type = RULE_K_BIG_OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLogical.g:4315:15: ( 'OR' )
            // InternalLogical.g:4315:17: 'OR'
            {
            match("OR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_K_BIG_OR"

    // $ANTLR start "RULE_K_BIG_XOR"
    public final void mRULE_K_BIG_XOR() throws RecognitionException {
        try {
            int _type = RULE_K_BIG_XOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLogical.g:4317:16: ( 'XOR' )
            // InternalLogical.g:4317:18: 'XOR'
            {
            match("XOR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_K_BIG_XOR"

    // $ANTLR start "RULE_K_BIG_NAND"
    public final void mRULE_K_BIG_NAND() throws RecognitionException {
        try {
            int _type = RULE_K_BIG_NAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLogical.g:4319:17: ( 'NAND' )
            // InternalLogical.g:4319:19: 'NAND'
            {
            match("NAND"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_K_BIG_NAND"

    // $ANTLR start "RULE_COMMA"
    public final void mRULE_COMMA() throws RecognitionException {
        try {
            int _type = RULE_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLogical.g:4321:12: ( ',' )
            // InternalLogical.g:4321:14: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMA"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLogical.g:4323:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )* )
            // InternalLogical.g:4323:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )*
            {
            if ( input.LA(1)=='-'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalLogical.g:4323:39: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='-'||(LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLogical.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalLogical.g:4325:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalLogical.g:4325:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalLogical.g:4325:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\t' && LA2_0<='\n')||LA2_0=='\r'||LA2_0==' ') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalLogical.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    public void mTokens() throws RecognitionException {
        // InternalLogical.g:1:8: ( T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | RULE_P_OPEN | RULE_P_CLOSE | RULE_K_NOT | RULE_K_AND | RULE_K_OR | RULE_K_XOR | RULE_K_IMP | RULE_K_IFF | RULE_K_MINUS | RULE_K_NAND | RULE_K_BIG_AND | RULE_K_BIG_OR | RULE_K_BIG_XOR | RULE_K_BIG_NAND | RULE_COMMA | RULE_ID | RULE_WS )
        int alt3=31;
        alt3 = dfa3.predict(input);
        switch (alt3) {
            case 1 :
                // InternalLogical.g:1:10: T__21
                {
                mT__21(); 

                }
                break;
            case 2 :
                // InternalLogical.g:1:16: T__22
                {
                mT__22(); 

                }
                break;
            case 3 :
                // InternalLogical.g:1:22: T__23
                {
                mT__23(); 

                }
                break;
            case 4 :
                // InternalLogical.g:1:28: T__24
                {
                mT__24(); 

                }
                break;
            case 5 :
                // InternalLogical.g:1:34: T__25
                {
                mT__25(); 

                }
                break;
            case 6 :
                // InternalLogical.g:1:40: T__26
                {
                mT__26(); 

                }
                break;
            case 7 :
                // InternalLogical.g:1:46: T__27
                {
                mT__27(); 

                }
                break;
            case 8 :
                // InternalLogical.g:1:52: T__28
                {
                mT__28(); 

                }
                break;
            case 9 :
                // InternalLogical.g:1:58: T__29
                {
                mT__29(); 

                }
                break;
            case 10 :
                // InternalLogical.g:1:64: T__30
                {
                mT__30(); 

                }
                break;
            case 11 :
                // InternalLogical.g:1:70: T__31
                {
                mT__31(); 

                }
                break;
            case 12 :
                // InternalLogical.g:1:76: T__32
                {
                mT__32(); 

                }
                break;
            case 13 :
                // InternalLogical.g:1:82: T__33
                {
                mT__33(); 

                }
                break;
            case 14 :
                // InternalLogical.g:1:88: T__34
                {
                mT__34(); 

                }
                break;
            case 15 :
                // InternalLogical.g:1:94: RULE_P_OPEN
                {
                mRULE_P_OPEN(); 

                }
                break;
            case 16 :
                // InternalLogical.g:1:106: RULE_P_CLOSE
                {
                mRULE_P_CLOSE(); 

                }
                break;
            case 17 :
                // InternalLogical.g:1:119: RULE_K_NOT
                {
                mRULE_K_NOT(); 

                }
                break;
            case 18 :
                // InternalLogical.g:1:130: RULE_K_AND
                {
                mRULE_K_AND(); 

                }
                break;
            case 19 :
                // InternalLogical.g:1:141: RULE_K_OR
                {
                mRULE_K_OR(); 

                }
                break;
            case 20 :
                // InternalLogical.g:1:151: RULE_K_XOR
                {
                mRULE_K_XOR(); 

                }
                break;
            case 21 :
                // InternalLogical.g:1:162: RULE_K_IMP
                {
                mRULE_K_IMP(); 

                }
                break;
            case 22 :
                // InternalLogical.g:1:173: RULE_K_IFF
                {
                mRULE_K_IFF(); 

                }
                break;
            case 23 :
                // InternalLogical.g:1:184: RULE_K_MINUS
                {
                mRULE_K_MINUS(); 

                }
                break;
            case 24 :
                // InternalLogical.g:1:197: RULE_K_NAND
                {
                mRULE_K_NAND(); 

                }
                break;
            case 25 :
                // InternalLogical.g:1:209: RULE_K_BIG_AND
                {
                mRULE_K_BIG_AND(); 

                }
                break;
            case 26 :
                // InternalLogical.g:1:224: RULE_K_BIG_OR
                {
                mRULE_K_BIG_OR(); 

                }
                break;
            case 27 :
                // InternalLogical.g:1:238: RULE_K_BIG_XOR
                {
                mRULE_K_BIG_XOR(); 

                }
                break;
            case 28 :
                // InternalLogical.g:1:253: RULE_K_BIG_NAND
                {
                mRULE_K_BIG_NAND(); 

                }
                break;
            case 29 :
                // InternalLogical.g:1:269: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 30 :
                // InternalLogical.g:1:280: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 31 :
                // InternalLogical.g:1:288: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA3_eotS =
        "\1\uffff\5\30\2\uffff\4\30\3\uffff\10\30\3\uffff\10\30\1\71\13\30\1\105\5\30\1\113\4\30\1\uffff\2\30\1\122\2\30\1\125\1\30\1\127\1\130\1\30\1\132\1\uffff\1\133\2\30\1\136\1\30\1\uffff\6\30\1\uffff\2\30\1\uffff\1\150\2\uffff\1\30\2\uffff\1\152\1\30\1\uffff\1\154\10\30\1\uffff\1\165\1\uffff\1\30\1\uffff\3\30\1\172\4\30\1\uffff\1\177\1\u0080\1\30\1\u0082\1\uffff\1\30\1\u0084\1\30\1\u0086\2\uffff\1\30\1\uffff\1\30\1\uffff\1\30\1\uffff\1\u008a\1\u008b\1\30\2\uffff\1\u008d\1\uffff";
    static final String DFA3_eofS =
        "\u008e\uffff";
    static final String DFA3_minS =
        "\1\11\1\156\1\162\1\141\1\157\1\145\2\uffff\1\160\1\146\1\162\1\151\3\uffff\1\141\1\156\1\157\1\151\1\116\1\122\1\117\1\101\3\uffff\1\153\1\165\1\154\1\162\1\147\1\155\1\146\1\164\1\55\1\166\1\160\1\146\1\145\1\156\1\164\1\156\1\144\1\162\1\156\1\104\1\55\1\122\1\116\1\156\1\145\1\163\1\55\1\151\1\145\1\141\1\151\1\uffff\1\141\1\154\1\55\1\146\1\144\1\55\1\144\2\55\1\165\1\55\1\uffff\1\55\1\104\1\157\1\55\1\145\1\uffff\1\143\1\156\1\165\1\157\1\162\1\151\1\uffff\1\145\1\151\1\uffff\1\55\2\uffff\1\163\2\uffff\1\55\1\167\1\uffff\1\55\1\141\1\163\1\154\1\156\1\151\1\145\1\162\1\156\1\uffff\1\55\1\uffff\1\156\1\uffff\1\154\1\151\1\164\1\55\1\141\1\163\1\145\1\147\1\uffff\2\55\1\157\1\55\1\uffff\1\156\1\55\1\156\1\55\2\uffff\1\156\1\uffff\1\164\1\uffff\1\143\1\uffff\2\55\1\145\2\uffff\1\55\1\uffff";
    static final String DFA3_maxS =
        "\1\175\1\156\1\162\2\157\1\151\2\uffff\1\162\1\156\1\162\1\151\3\uffff\1\157\1\156\1\157\1\151\1\116\1\122\1\117\1\101\3\uffff\1\153\1\165\1\154\1\162\1\147\1\155\1\146\1\164\1\172\1\166\1\160\1\146\1\145\1\156\1\164\1\156\1\144\1\162\1\156\1\104\1\172\1\122\1\116\1\156\1\145\1\163\1\172\1\151\1\145\1\141\1\151\1\uffff\1\141\1\154\1\172\1\146\1\144\1\172\1\144\2\172\1\165\1\172\1\uffff\1\172\1\104\1\157\1\172\1\145\1\uffff\1\143\1\156\1\165\1\157\1\162\1\151\1\uffff\1\145\1\151\1\uffff\1\172\2\uffff\1\163\2\uffff\1\172\1\167\1\uffff\1\172\1\141\1\163\1\154\1\156\1\151\1\145\1\162\1\156\1\uffff\1\172\1\uffff\1\156\1\uffff\1\154\1\151\1\164\1\172\1\141\1\163\1\145\1\147\1\uffff\2\172\1\157\1\172\1\uffff\1\156\1\172\1\156\1\172\2\uffff\1\156\1\uffff\1\164\1\uffff\1\143\1\uffff\2\172\1\145\2\uffff\1\172\1\uffff";
    static final String DFA3_acceptS =
        "\6\uffff\1\6\1\7\4\uffff\1\16\1\17\1\20\10\uffff\1\35\1\36\1\37\37\uffff\1\23\13\uffff\1\32\5\uffff\1\13\6\uffff\1\26\2\uffff\1\21\1\uffff\1\22\1\24\1\uffff\1\31\1\33\2\uffff\1\2\11\uffff\1\30\1\uffff\1\34\1\uffff\1\3\10\uffff\1\27\4\uffff\1\10\4\uffff\1\1\1\4\1\uffff\1\14\1\uffff\1\25\1\uffff\1\15\3\uffff\1\5\1\11\1\uffff\1\12";
    static final String DFA3_specialS =
        "\u008e\uffff}>";
    static final String[] DFA3_transitionS = {
            "\2\31\2\uffff\1\31\22\uffff\1\31\7\uffff\1\15\1\16\2\uffff\1\27\1\30\17\uffff\1\14\3\uffff\1\23\14\30\1\26\1\24\10\30\1\25\2\30\4\uffff\1\30\1\uffff\1\20\1\13\1\30\1\5\1\30\1\3\2\30\1\11\2\30\1\4\1\22\1\17\1\10\1\12\3\30\1\2\1\1\2\30\1\21\2\30\1\6\1\uffff\1\7",
            "\1\32",
            "\1\33",
            "\1\34\15\uffff\1\35",
            "\1\36",
            "\1\40\3\uffff\1\37",
            "",
            "",
            "\1\41\1\uffff\1\42",
            "\1\45\6\uffff\1\44\1\43",
            "\1\46",
            "\1\47",
            "",
            "",
            "",
            "\1\51\15\uffff\1\50",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "",
            "",
            "",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "",
            "\1\120",
            "\1\121",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\123",
            "\1\124",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\126",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\131",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\134",
            "\1\135",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\137",
            "",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "",
            "\1\146",
            "\1\147",
            "",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "",
            "\1\151",
            "",
            "",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\153",
            "",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\1\166",
            "",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u0081",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "\1\u0083",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u0085",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "",
            "",
            "\1\u0087",
            "",
            "\1\u0088",
            "",
            "\1\u0089",
            "",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            "\1\u008c",
            "",
            "",
            "\1\30\2\uffff\12\30\7\uffff\32\30\4\uffff\1\30\1\uffff\32\30",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | RULE_P_OPEN | RULE_P_CLOSE | RULE_K_NOT | RULE_K_AND | RULE_K_OR | RULE_K_XOR | RULE_K_IMP | RULE_K_IFF | RULE_K_MINUS | RULE_K_NAND | RULE_K_BIG_AND | RULE_K_BIG_OR | RULE_K_BIG_XOR | RULE_K_BIG_NAND | RULE_COMMA | RULE_ID | RULE_WS );";
        }
    }
 

}
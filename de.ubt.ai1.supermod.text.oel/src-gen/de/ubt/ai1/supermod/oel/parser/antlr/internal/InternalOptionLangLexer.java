package de.ubt.ai1.supermod.oel.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOptionLangLexer extends Lexer {
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

    public InternalOptionLangLexer() {;} 
    public InternalOptionLangLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalOptionLangLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalOptionLang.g"; }

    // $ANTLR start "RULE_P_OPEN"
    public final void mRULE_P_OPEN() throws RecognitionException {
        try {
            int _type = RULE_P_OPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalOptionLang.g:1077:13: ( '(' )
            // InternalOptionLang.g:1077:15: '('
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
            // InternalOptionLang.g:1079:14: ( ')' )
            // InternalOptionLang.g:1079:16: ')'
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
            // InternalOptionLang.g:1081:12: ( 'not' )
            // InternalOptionLang.g:1081:14: 'not'
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
            // InternalOptionLang.g:1083:12: ( 'and' )
            // InternalOptionLang.g:1083:14: 'and'
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
            // InternalOptionLang.g:1085:11: ( 'or' )
            // InternalOptionLang.g:1085:13: 'or'
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
            // InternalOptionLang.g:1087:12: ( 'xor' )
            // InternalOptionLang.g:1087:14: 'xor'
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
            // InternalOptionLang.g:1089:12: ( 'implies' )
            // InternalOptionLang.g:1089:14: 'implies'
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
            // InternalOptionLang.g:1091:12: ( 'iff' )
            // InternalOptionLang.g:1091:14: 'iff'
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
            // InternalOptionLang.g:1093:14: ( 'minus' )
            // InternalOptionLang.g:1093:16: 'minus'
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
            // InternalOptionLang.g:1095:13: ( 'nand' )
            // InternalOptionLang.g:1095:15: 'nand'
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
            // InternalOptionLang.g:1097:16: ( 'AND' )
            // InternalOptionLang.g:1097:18: 'AND'
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
            // InternalOptionLang.g:1099:15: ( 'OR' )
            // InternalOptionLang.g:1099:17: 'OR'
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
            // InternalOptionLang.g:1101:16: ( 'XOR' )
            // InternalOptionLang.g:1101:18: 'XOR'
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
            // InternalOptionLang.g:1103:17: ( 'NAND' )
            // InternalOptionLang.g:1103:19: 'NAND'
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
            // InternalOptionLang.g:1105:12: ( ',' )
            // InternalOptionLang.g:1105:14: ','
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
            // InternalOptionLang.g:1107:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )* )
            // InternalOptionLang.g:1107:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )*
            {
            if ( input.LA(1)=='-'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalOptionLang.g:1107:39: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='-'||(LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalOptionLang.g:
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
            // InternalOptionLang.g:1109:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalOptionLang.g:1109:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalOptionLang.g:1109:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // InternalOptionLang.g:
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
        // InternalOptionLang.g:1:8: ( RULE_P_OPEN | RULE_P_CLOSE | RULE_K_NOT | RULE_K_AND | RULE_K_OR | RULE_K_XOR | RULE_K_IMP | RULE_K_IFF | RULE_K_MINUS | RULE_K_NAND | RULE_K_BIG_AND | RULE_K_BIG_OR | RULE_K_BIG_XOR | RULE_K_BIG_NAND | RULE_COMMA | RULE_ID | RULE_WS )
        int alt3=17;
        alt3 = dfa3.predict(input);
        switch (alt3) {
            case 1 :
                // InternalOptionLang.g:1:10: RULE_P_OPEN
                {
                mRULE_P_OPEN(); 

                }
                break;
            case 2 :
                // InternalOptionLang.g:1:22: RULE_P_CLOSE
                {
                mRULE_P_CLOSE(); 

                }
                break;
            case 3 :
                // InternalOptionLang.g:1:35: RULE_K_NOT
                {
                mRULE_K_NOT(); 

                }
                break;
            case 4 :
                // InternalOptionLang.g:1:46: RULE_K_AND
                {
                mRULE_K_AND(); 

                }
                break;
            case 5 :
                // InternalOptionLang.g:1:57: RULE_K_OR
                {
                mRULE_K_OR(); 

                }
                break;
            case 6 :
                // InternalOptionLang.g:1:67: RULE_K_XOR
                {
                mRULE_K_XOR(); 

                }
                break;
            case 7 :
                // InternalOptionLang.g:1:78: RULE_K_IMP
                {
                mRULE_K_IMP(); 

                }
                break;
            case 8 :
                // InternalOptionLang.g:1:89: RULE_K_IFF
                {
                mRULE_K_IFF(); 

                }
                break;
            case 9 :
                // InternalOptionLang.g:1:100: RULE_K_MINUS
                {
                mRULE_K_MINUS(); 

                }
                break;
            case 10 :
                // InternalOptionLang.g:1:113: RULE_K_NAND
                {
                mRULE_K_NAND(); 

                }
                break;
            case 11 :
                // InternalOptionLang.g:1:125: RULE_K_BIG_AND
                {
                mRULE_K_BIG_AND(); 

                }
                break;
            case 12 :
                // InternalOptionLang.g:1:140: RULE_K_BIG_OR
                {
                mRULE_K_BIG_OR(); 

                }
                break;
            case 13 :
                // InternalOptionLang.g:1:154: RULE_K_BIG_XOR
                {
                mRULE_K_BIG_XOR(); 

                }
                break;
            case 14 :
                // InternalOptionLang.g:1:169: RULE_K_BIG_NAND
                {
                mRULE_K_BIG_NAND(); 

                }
                break;
            case 15 :
                // InternalOptionLang.g:1:185: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 16 :
                // InternalOptionLang.g:1:196: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 17 :
                // InternalOptionLang.g:1:204: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA3_eotS =
        "\3\uffff\12\16\3\uffff\3\16\1\37\5\16\1\45\2\16\1\50\1\16\1\52\1\uffff\1\53\1\16\1\55\1\16\1\57\1\uffff\1\60\1\16\1\uffff\1\62\2\uffff\1\16\1\uffff\1\16\2\uffff\1\65\1\uffff\1\16\1\67\1\uffff\1\16\1\uffff\1\71\1\uffff";
    static final String DFA3_eofS =
        "\72\uffff";
    static final String DFA3_minS =
        "\1\11\2\uffff\1\141\1\156\1\162\1\157\1\146\1\151\1\116\1\122\1\117\1\101\3\uffff\1\164\1\156\1\144\1\55\1\162\1\160\1\146\1\156\1\104\1\55\1\122\1\116\1\55\1\144\1\55\1\uffff\1\55\1\154\1\55\1\165\1\55\1\uffff\1\55\1\104\1\uffff\1\55\2\uffff\1\151\1\uffff\1\163\2\uffff\1\55\1\uffff\1\145\1\55\1\uffff\1\163\1\uffff\1\55\1\uffff";
    static final String DFA3_maxS =
        "\1\172\2\uffff\1\157\1\156\1\162\1\157\1\155\1\151\1\116\1\122\1\117\1\101\3\uffff\1\164\1\156\1\144\1\172\1\162\1\160\1\146\1\156\1\104\1\172\1\122\1\116\1\172\1\144\1\172\1\uffff\1\172\1\154\1\172\1\165\1\172\1\uffff\1\172\1\104\1\uffff\1\172\2\uffff\1\151\1\uffff\1\163\2\uffff\1\172\1\uffff\1\145\1\172\1\uffff\1\163\1\uffff\1\172\1\uffff";
    static final String DFA3_acceptS =
        "\1\uffff\1\1\1\2\12\uffff\1\17\1\20\1\21\17\uffff\1\5\5\uffff\1\14\2\uffff\1\3\1\uffff\1\4\1\6\1\uffff\1\10\1\uffff\1\13\1\15\1\uffff\1\12\2\uffff\1\16\1\uffff\1\11\1\uffff\1\7";
    static final String DFA3_specialS =
        "\72\uffff}>";
    static final String[] DFA3_transitionS = {
            "\2\17\2\uffff\1\17\22\uffff\1\17\7\uffff\1\1\1\2\2\uffff\1\15\1\16\23\uffff\1\11\14\16\1\14\1\12\10\16\1\13\2\16\4\uffff\1\16\1\uffff\1\4\7\16\1\7\3\16\1\10\1\3\1\5\10\16\1\6\2\16",
            "",
            "",
            "\1\21\15\uffff\1\20",
            "\1\22",
            "\1\23",
            "\1\24",
            "\1\26\6\uffff\1\25",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\32",
            "\1\33",
            "",
            "",
            "",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\16\2\uffff\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\16\2\uffff\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "\1\46",
            "\1\47",
            "\1\16\2\uffff\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "\1\51",
            "\1\16\2\uffff\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "",
            "\1\16\2\uffff\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "\1\54",
            "\1\16\2\uffff\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "\1\56",
            "\1\16\2\uffff\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "",
            "\1\16\2\uffff\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "\1\61",
            "",
            "\1\16\2\uffff\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "",
            "",
            "\1\63",
            "",
            "\1\64",
            "",
            "",
            "\1\16\2\uffff\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "",
            "\1\66",
            "\1\16\2\uffff\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
            "",
            "\1\70",
            "",
            "\1\16\2\uffff\12\16\7\uffff\32\16\4\uffff\1\16\1\uffff\32\16",
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
            return "1:1: Tokens : ( RULE_P_OPEN | RULE_P_CLOSE | RULE_K_NOT | RULE_K_AND | RULE_K_OR | RULE_K_XOR | RULE_K_IMP | RULE_K_IFF | RULE_K_MINUS | RULE_K_NAND | RULE_K_BIG_AND | RULE_K_BIG_OR | RULE_K_BIG_XOR | RULE_K_BIG_NAND | RULE_COMMA | RULE_ID | RULE_WS );";
        }
    }
 

}
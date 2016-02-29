// Generated from res/Grammars/scanner.g4 by ANTLR 4.5.2
package com.CSCI468.ANTLROut;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class scannerLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, WS=11, SYSTEMFUNCTION=12, CONDITIONAL=13, KEYWORD=14, NUMTYPE=15, 
		COMMENT=16, OPERATOR=17, MATHOPERATOR=18, COMPARISONOPERATOR=19, STRINGLITERAL=20, 
		INTLITERAL=21, FLOATLITERAL=22, IDENTIFIER=23;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "WS", "SYSTEMFUNCTION", "CONDITIONAL", "KEYWORD", "NUMTYPE", "COMMENT", 
		"OPERATOR", "MATHOPERATOR", "COMPARISONOPERATOR", "STRINGLITERAL", "INTLITERAL", 
		"FLOATLITERAL", "IDENTIFIER"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'PROGRAM'", "'STRING'", "':='", "';'", "'FUNCTION'", "'VOID'", 
		"'('", "')'", "'RETURN'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "WS", 
		"SYSTEMFUNCTION", "CONDITIONAL", "KEYWORD", "NUMTYPE", "COMMENT", "OPERATOR", 
		"MATHOPERATOR", "COMPARISONOPERATOR", "STRINGLITERAL", "INTLITERAL", "FLOATLITERAL", 
		"IDENTIFIER"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public scannerLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "scanner.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\31\u00ed\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\6\fb\n\f\r\f\16\fc"+
		"\3\f\5\fg\n\f\3\f\7\fj\n\f\f\f\16\fm\13\f\6\fo\n\f\r\f\16\fp\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r|\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u0085\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u00a0\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00aa\n"+
		"\20\3\21\3\21\3\21\3\21\7\21\u00b0\n\21\f\21\16\21\u00b3\13\21\3\21\3"+
		"\21\3\22\3\22\3\22\5\22\u00ba\n\22\3\23\3\23\3\23\3\23\5\23\u00c0\n\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00cc\n\24\3\25"+
		"\3\25\7\25\u00d0\n\25\f\25\16\25\u00d3\13\25\3\25\3\25\3\26\6\26\u00d8"+
		"\n\26\r\26\16\26\u00d9\3\27\6\27\u00dd\n\27\r\27\16\27\u00de\3\27\3\27"+
		"\6\27\u00e3\n\27\r\27\16\27\u00e4\3\30\3\30\7\30\u00e9\n\30\f\30\16\30"+
		"\u00ec\13\30\2\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\3\2\f\5\2\13"+
		"\f\17\17\"\"\4\2\f\f\17\17\4\2*+..\5\2,-//\61\61\4\2>>@@\3\2$$\3\2\62"+
		";\3\2\60\60\4\2C\\c|\5\2\62;C\\c|\u0105\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\59\3\2\2\2\7@\3"+
		"\2\2\2\tC\3\2\2\2\13E\3\2\2\2\rN\3\2\2\2\17S\3\2\2\2\21U\3\2\2\2\23W\3"+
		"\2\2\2\25^\3\2\2\2\27n\3\2\2\2\31{\3\2\2\2\33\u0084\3\2\2\2\35\u009f\3"+
		"\2\2\2\37\u00a9\3\2\2\2!\u00ab\3\2\2\2#\u00b9\3\2\2\2%\u00bf\3\2\2\2\'"+
		"\u00cb\3\2\2\2)\u00cd\3\2\2\2+\u00d7\3\2\2\2-\u00dc\3\2\2\2/\u00e6\3\2"+
		"\2\2\61\62\7R\2\2\62\63\7T\2\2\63\64\7Q\2\2\64\65\7I\2\2\65\66\7T\2\2"+
		"\66\67\7C\2\2\678\7O\2\28\4\3\2\2\29:\7U\2\2:;\7V\2\2;<\7T\2\2<=\7K\2"+
		"\2=>\7P\2\2>?\7I\2\2?\6\3\2\2\2@A\7<\2\2AB\7?\2\2B\b\3\2\2\2CD\7=\2\2"+
		"D\n\3\2\2\2EF\7H\2\2FG\7W\2\2GH\7P\2\2HI\7E\2\2IJ\7V\2\2JK\7K\2\2KL\7"+
		"Q\2\2LM\7P\2\2M\f\3\2\2\2NO\7X\2\2OP\7Q\2\2PQ\7K\2\2QR\7F\2\2R\16\3\2"+
		"\2\2ST\7*\2\2T\20\3\2\2\2UV\7+\2\2V\22\3\2\2\2WX\7T\2\2XY\7G\2\2YZ\7V"+
		"\2\2Z[\7W\2\2[\\\7T\2\2\\]\7P\2\2]\24\3\2\2\2^_\7.\2\2_\26\3\2\2\2`b\t"+
		"\2\2\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2df\3\2\2\2eg\5!\21\2fe\3"+
		"\2\2\2fg\3\2\2\2gk\3\2\2\2hj\t\2\2\2ih\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3"+
		"\2\2\2lo\3\2\2\2mk\3\2\2\2na\3\2\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\30"+
		"\3\2\2\2rs\7T\2\2st\7G\2\2tu\7C\2\2u|\7F\2\2vw\7Y\2\2wx\7T\2\2xy\7K\2"+
		"\2yz\7V\2\2z|\7G\2\2{r\3\2\2\2{v\3\2\2\2|\32\3\2\2\2}~\7K\2\2~\u0085\7"+
		"H\2\2\177\u0080\7Y\2\2\u0080\u0081\7J\2\2\u0081\u0082\7K\2\2\u0082\u0083"+
		"\7N\2\2\u0083\u0085\7G\2\2\u0084}\3\2\2\2\u0084\177\3\2\2\2\u0085\34\3"+
		"\2\2\2\u0086\u0087\7D\2\2\u0087\u0088\7G\2\2\u0088\u0089\7I\2\2\u0089"+
		"\u008a\7K\2\2\u008a\u00a0\7P\2\2\u008b\u008c\7G\2\2\u008c\u008d\7P\2\2"+
		"\u008d\u00a0\7F\2\2\u008e\u008f\7G\2\2\u008f\u0090\7P\2\2\u0090\u0091"+
		"\7F\2\2\u0091\u0092\7K\2\2\u0092\u00a0\7H\2\2\u0093\u0094\7G\2\2\u0094"+
		"\u0095\7N\2\2\u0095\u0096\7U\2\2\u0096\u00a0\7G\2\2\u0097\u0098\7G\2\2"+
		"\u0098\u0099\7P\2\2\u0099\u009a\7F\2\2\u009a\u009b\7Y\2\2\u009b\u009c"+
		"\7J\2\2\u009c\u009d\7K\2\2\u009d\u009e\7N\2\2\u009e\u00a0\7G\2\2\u009f"+
		"\u0086\3\2\2\2\u009f\u008b\3\2\2\2\u009f\u008e\3\2\2\2\u009f\u0093\3\2"+
		"\2\2\u009f\u0097\3\2\2\2\u00a0\36\3\2\2\2\u00a1\u00a2\7K\2\2\u00a2\u00a3"+
		"\7P\2\2\u00a3\u00aa\7V\2\2\u00a4\u00a5\7H\2\2\u00a5\u00a6\7N\2\2\u00a6"+
		"\u00a7\7Q\2\2\u00a7\u00a8\7C\2\2\u00a8\u00aa\7V\2\2\u00a9\u00a1\3\2\2"+
		"\2\u00a9\u00a4\3\2\2\2\u00aa \3\2\2\2\u00ab\u00ac\7/\2\2\u00ac\u00ad\7"+
		"/\2\2\u00ad\u00b1\3\2\2\2\u00ae\u00b0\n\3\2\2\u00af\u00ae\3\2\2\2\u00b0"+
		"\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2"+
		"\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5\b\21\2\2\u00b5\"\3\2\2\2\u00b6\u00ba"+
		"\t\4\2\2\u00b7\u00b8\7<\2\2\u00b8\u00ba\7?\2\2\u00b9\u00b6\3\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00ba$\3\2\2\2\u00bb\u00c0\t\5\2\2\u00bc\u00bd\7(\2\2\u00bd"+
		"\u00c0\7(\2\2\u00be\u00c0\7~\2\2\u00bf\u00bb\3\2\2\2\u00bf\u00bc\3\2\2"+
		"\2\u00bf\u00be\3\2\2\2\u00c0&\3\2\2\2\u00c1\u00cc\t\6\2\2\u00c2\u00c3"+
		"\7@\2\2\u00c3\u00cc\7?\2\2\u00c4\u00c5\7>\2\2\u00c5\u00cc\7?\2\2\u00c6"+
		"\u00c7\7#\2\2\u00c7\u00cc\7?\2\2\u00c8\u00c9\7?\2\2\u00c9\u00cc\7?\2\2"+
		"\u00ca\u00cc\7?\2\2\u00cb\u00c1\3\2\2\2\u00cb\u00c2\3\2\2\2\u00cb\u00c4"+
		"\3\2\2\2\u00cb\u00c6\3\2\2\2\u00cb\u00c8\3\2\2\2\u00cb\u00ca\3\2\2\2\u00cc"+
		"(\3\2\2\2\u00cd\u00d1\7$\2\2\u00ce\u00d0\n\7\2\2\u00cf\u00ce\3\2\2\2\u00d0"+
		"\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\3\2"+
		"\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d5\7$\2\2\u00d5*\3\2\2\2\u00d6\u00d8"+
		"\t\b\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9"+
		"\u00da\3\2\2\2\u00da,\3\2\2\2\u00db\u00dd\t\b\2\2\u00dc\u00db\3\2\2\2"+
		"\u00dd\u00de\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0"+
		"\3\2\2\2\u00e0\u00e2\t\t\2\2\u00e1\u00e3\t\b\2\2\u00e2\u00e1\3\2\2\2\u00e3"+
		"\u00e4\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5.\3\2\2\2"+
		"\u00e6\u00ea\t\n\2\2\u00e7\u00e9\t\13\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ec"+
		"\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\60\3\2\2\2\u00ec"+
		"\u00ea\3\2\2\2\24\2cfkp{\u0084\u009f\u00a9\u00b1\u00b9\u00bf\u00cb\u00d1"+
		"\u00d9\u00de\u00e4\u00ea\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
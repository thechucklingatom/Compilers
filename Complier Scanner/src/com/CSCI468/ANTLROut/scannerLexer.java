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
		WS=10, SYSTEMFUNCTION=11, CONDITIONAL=12, KEYWORD=13, TYPE=14, COMMENT=15, 
		OPERATOR=16, MATHOPERATOR=17, COMPARISONOPERATOR=18, STRINGLITERAL=19, 
		INTLITERAL=20, FLOATLITERAL=21, IDENTIFIER=22;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"WS", "SYSTEMFUNCTION", "CONDITIONAL", "KEYWORD", "TYPE", "COMMENT", "OPERATOR", 
		"MATHOPERATOR", "COMPARISONOPERATOR", "STRINGLITERAL", "INTLITERAL", "FLOATLITERAL", 
		"IDENTIFIER"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'PROGRAM'", "':='", "';'", "'FUNCTION'", "'VOID'", "'('", "')'", 
		"'RETURN'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "WS", "SYSTEMFUNCTION", 
		"CONDITIONAL", "KEYWORD", "TYPE", "COMMENT", "OPERATOR", "MATHOPERATOR", 
		"COMPARISONOPERATOR", "STRINGLITERAL", "INTLITERAL", "FLOATLITERAL", "IDENTIFIER"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\30\u00ea\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\13\6\13Y\n\13\r\13\16\13Z\3\13\5\13^\n\13\3\13\7\13a\n\13\f\13"+
		"\16\13d\13\13\6\13f\n\13\r\13\16\13g\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\5\fs\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r|\n\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0097\n\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00a7\n\17\3\20"+
		"\3\20\3\20\3\20\7\20\u00ad\n\20\f\20\16\20\u00b0\13\20\3\20\3\20\3\21"+
		"\3\21\3\21\5\21\u00b7\n\21\3\22\3\22\3\22\3\22\5\22\u00bd\n\22\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00c9\n\23\3\24\3\24"+
		"\7\24\u00cd\n\24\f\24\16\24\u00d0\13\24\3\24\3\24\3\25\6\25\u00d5\n\25"+
		"\r\25\16\25\u00d6\3\26\6\26\u00da\n\26\r\26\16\26\u00db\3\26\3\26\6\26"+
		"\u00e0\n\26\r\26\16\26\u00e1\3\27\3\27\7\27\u00e6\n\27\f\27\16\27\u00e9"+
		"\13\27\2\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30\3\2\f\5\2\13\f\17\17\""+
		"\"\4\2\f\f\17\17\4\2*+..\5\2,-//\61\61\4\2>>@@\3\2$$\3\2\62;\3\2\60\60"+
		"\4\2C\\c|\5\2\62;C\\c|\u0103\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\67\3\2\2\2\7:\3\2\2\2\t<\3\2\2\2\13E\3"+
		"\2\2\2\rJ\3\2\2\2\17L\3\2\2\2\21N\3\2\2\2\23U\3\2\2\2\25e\3\2\2\2\27r"+
		"\3\2\2\2\31{\3\2\2\2\33\u0096\3\2\2\2\35\u00a6\3\2\2\2\37\u00a8\3\2\2"+
		"\2!\u00b6\3\2\2\2#\u00bc\3\2\2\2%\u00c8\3\2\2\2\'\u00ca\3\2\2\2)\u00d4"+
		"\3\2\2\2+\u00d9\3\2\2\2-\u00e3\3\2\2\2/\60\7R\2\2\60\61\7T\2\2\61\62\7"+
		"Q\2\2\62\63\7I\2\2\63\64\7T\2\2\64\65\7C\2\2\65\66\7O\2\2\66\4\3\2\2\2"+
		"\678\7<\2\289\7?\2\29\6\3\2\2\2:;\7=\2\2;\b\3\2\2\2<=\7H\2\2=>\7W\2\2"+
		">?\7P\2\2?@\7E\2\2@A\7V\2\2AB\7K\2\2BC\7Q\2\2CD\7P\2\2D\n\3\2\2\2EF\7"+
		"X\2\2FG\7Q\2\2GH\7K\2\2HI\7F\2\2I\f\3\2\2\2JK\7*\2\2K\16\3\2\2\2LM\7+"+
		"\2\2M\20\3\2\2\2NO\7T\2\2OP\7G\2\2PQ\7V\2\2QR\7W\2\2RS\7T\2\2ST\7P\2\2"+
		"T\22\3\2\2\2UV\7.\2\2V\24\3\2\2\2WY\t\2\2\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2"+
		"\2\2Z[\3\2\2\2[]\3\2\2\2\\^\5\37\20\2]\\\3\2\2\2]^\3\2\2\2^b\3\2\2\2_"+
		"a\t\2\2\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2cf\3\2\2\2db\3\2\2\2"+
		"eX\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh\3\2\2\2h\26\3\2\2\2ij\7T\2\2jk\7G\2\2"+
		"kl\7C\2\2ls\7F\2\2mn\7Y\2\2no\7T\2\2op\7K\2\2pq\7V\2\2qs\7G\2\2ri\3\2"+
		"\2\2rm\3\2\2\2s\30\3\2\2\2tu\7K\2\2u|\7H\2\2vw\7Y\2\2wx\7J\2\2xy\7K\2"+
		"\2yz\7N\2\2z|\7G\2\2{t\3\2\2\2{v\3\2\2\2|\32\3\2\2\2}~\7D\2\2~\177\7G"+
		"\2\2\177\u0080\7I\2\2\u0080\u0081\7K\2\2\u0081\u0097\7P\2\2\u0082\u0083"+
		"\7G\2\2\u0083\u0084\7P\2\2\u0084\u0097\7F\2\2\u0085\u0086\7G\2\2\u0086"+
		"\u0087\7P\2\2\u0087\u0088\7F\2\2\u0088\u0089\7K\2\2\u0089\u0097\7H\2\2"+
		"\u008a\u008b\7G\2\2\u008b\u008c\7N\2\2\u008c\u008d\7U\2\2\u008d\u0097"+
		"\7G\2\2\u008e\u008f\7G\2\2\u008f\u0090\7P\2\2\u0090\u0091\7F\2\2\u0091"+
		"\u0092\7Y\2\2\u0092\u0093\7J\2\2\u0093\u0094\7K\2\2\u0094\u0095\7N\2\2"+
		"\u0095\u0097\7G\2\2\u0096}\3\2\2\2\u0096\u0082\3\2\2\2\u0096\u0085\3\2"+
		"\2\2\u0096\u008a\3\2\2\2\u0096\u008e\3\2\2\2\u0097\34\3\2\2\2\u0098\u0099"+
		"\7K\2\2\u0099\u009a\7P\2\2\u009a\u00a7\7V\2\2\u009b\u009c\7H\2\2\u009c"+
		"\u009d\7N\2\2\u009d\u009e\7Q\2\2\u009e\u009f\7C\2\2\u009f\u00a7\7V\2\2"+
		"\u00a0\u00a1\7U\2\2\u00a1\u00a2\7V\2\2\u00a2\u00a3\7T\2\2\u00a3\u00a4"+
		"\7K\2\2\u00a4\u00a5\7P\2\2\u00a5\u00a7\7I\2\2\u00a6\u0098\3\2\2\2\u00a6"+
		"\u009b\3\2\2\2\u00a6\u00a0\3\2\2\2\u00a7\36\3\2\2\2\u00a8\u00a9\7/\2\2"+
		"\u00a9\u00aa\7/\2\2\u00aa\u00ae\3\2\2\2\u00ab\u00ad\n\3\2\2\u00ac\u00ab"+
		"\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\u00b1\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\b\20\2\2\u00b2 \3\2\2\2"+
		"\u00b3\u00b7\t\4\2\2\u00b4\u00b5\7<\2\2\u00b5\u00b7\7?\2\2\u00b6\u00b3"+
		"\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\"\3\2\2\2\u00b8\u00bd\t\5\2\2\u00b9"+
		"\u00ba\7(\2\2\u00ba\u00bd\7(\2\2\u00bb\u00bd\7~\2\2\u00bc\u00b8\3\2\2"+
		"\2\u00bc\u00b9\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd$\3\2\2\2\u00be\u00c9"+
		"\t\6\2\2\u00bf\u00c0\7@\2\2\u00c0\u00c9\7?\2\2\u00c1\u00c2\7>\2\2\u00c2"+
		"\u00c9\7?\2\2\u00c3\u00c4\7#\2\2\u00c4\u00c9\7?\2\2\u00c5\u00c6\7?\2\2"+
		"\u00c6\u00c9\7?\2\2\u00c7\u00c9\7?\2\2\u00c8\u00be\3\2\2\2\u00c8\u00bf"+
		"\3\2\2\2\u00c8\u00c1\3\2\2\2\u00c8\u00c3\3\2\2\2\u00c8\u00c5\3\2\2\2\u00c8"+
		"\u00c7\3\2\2\2\u00c9&\3\2\2\2\u00ca\u00ce\7$\2\2\u00cb\u00cd\n\7\2\2\u00cc"+
		"\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2"+
		"\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\7$\2\2\u00d2"+
		"(\3\2\2\2\u00d3\u00d5\t\b\2\2\u00d4\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2"+
		"\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7*\3\2\2\2\u00d8\u00da\t"+
		"\b\2\2\u00d9\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00d9\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\t\t\2\2\u00de\u00e0\t\b"+
		"\2\2\u00df\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2,\3\2\2\2\u00e3\u00e7\t\n\2\2\u00e4\u00e6\t\13\2\2"+
		"\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8"+
		"\3\2\2\2\u00e8.\3\2\2\2\u00e9\u00e7\3\2\2\2\24\2Z]bgr{\u0096\u00a6\u00ae"+
		"\u00b6\u00bc\u00c8\u00ce\u00d6\u00db\u00e1\u00e7\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
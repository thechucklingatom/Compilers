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
		T__0=1, WS=2, KEYWORD=3, COMMENT=4, OPERATOR=5, STRINGLITERAL=6, INTLITERAL=7, 
		FLOATLITERAL=8, IDENTIFIER=9;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "WS", "KEYWORD", "COMMENT", "OPERATOR", "STRINGLITERAL", "INTLITERAL", 
		"FLOATLITERAL", "IDENTIFIER"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'ELSE'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "WS", "KEYWORD", "COMMENT", "OPERATOR", "STRINGLITERAL", "INTLITERAL", 
		"FLOATLITERAL", "IDENTIFIER"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\13\u00ae\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\6\3\34\n\3\r\3\16\3\35\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\5\4p\n\4\3\5\3\5\3\5\3\5\7\5v\n\5\f\5\16\5y\13\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5"+
		"\6\u008d\n\6\3\7\3\7\7\7\u0091\n\7\f\7\16\7\u0094\13\7\3\7\3\7\3\b\6\b"+
		"\u0099\n\b\r\b\16\b\u009a\3\t\6\t\u009e\n\t\r\t\16\t\u009f\3\t\3\t\6\t"+
		"\u00a4\n\t\r\t\16\t\u00a5\3\n\3\n\7\n\u00aa\n\n\f\n\16\n\u00ad\13\n\2"+
		"\2\13\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\3\2\f\5\2\13\f\17\17\""+
		"\"\4\2\f\f\17\17\6\2--//=>@@\5\2*+..~~\4\2,,\61\61\3\2$$\3\2\62;\3\2\60"+
		"\60\4\2C\\c|\5\2\62;C\\c|\u00cc\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\3\25\3\2\2\2\5\33\3\2\2\2\7o\3\2\2\2\tq\3\2\2\2\13\u008c\3\2\2\2"+
		"\r\u008e\3\2\2\2\17\u0098\3\2\2\2\21\u009d\3\2\2\2\23\u00a7\3\2\2\2\25"+
		"\26\7G\2\2\26\27\7N\2\2\27\30\7U\2\2\30\31\7G\2\2\31\4\3\2\2\2\32\34\t"+
		"\2\2\2\33\32\3\2\2\2\34\35\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36\6\3"+
		"\2\2\2\37 \7R\2\2 !\7T\2\2!\"\7Q\2\2\"#\7I\2\2#$\7T\2\2$%\7C\2\2%p\7O"+
		"\2\2&\'\7D\2\2\'(\7G\2\2()\7I\2\2)*\7K\2\2*p\7P\2\2+,\7U\2\2,-\7V\2\2"+
		"-.\7T\2\2./\7K\2\2/\60\7P\2\2\60p\7I\2\2\61\62\7Y\2\2\62\63\7J\2\2\63"+
		"\64\7K\2\2\64\65\7N\2\2\65p\7G\2\2\66\67\7K\2\2\678\7P\2\28p\7V\2\29:"+
		"\7Y\2\2:;\7T\2\2;<\7K\2\2<=\7V\2\2=p\7G\2\2>?\7T\2\2?@\7G\2\2@A\7C\2\2"+
		"Ap\7F\2\2BC\7K\2\2Cp\7H\2\2DE\7G\2\2EF\7N\2\2FG\7U\2\2Gp\7G\2\2HI\7G\2"+
		"\2IJ\7P\2\2JK\7F\2\2KL\7K\2\2Lp\7H\2\2MN\7G\2\2NO\7P\2\2OP\7F\2\2PQ\7"+
		"Y\2\2QR\7J\2\2RS\7K\2\2ST\7N\2\2Tp\7G\2\2UV\7G\2\2VW\7P\2\2Wp\7F\2\2X"+
		"Y\7X\2\2YZ\7Q\2\2Z[\7K\2\2[p\7F\2\2\\]\7H\2\2]^\7W\2\2^_\7P\2\2_`\7E\2"+
		"\2`a\7V\2\2ab\7K\2\2bc\7Q\2\2cp\7P\2\2de\7T\2\2ef\7G\2\2fg\7V\2\2gh\7"+
		"W\2\2hi\7T\2\2ip\7P\2\2jk\7H\2\2kl\7N\2\2lm\7Q\2\2mn\7C\2\2np\7V\2\2o"+
		"\37\3\2\2\2o&\3\2\2\2o+\3\2\2\2o\61\3\2\2\2o\66\3\2\2\2o9\3\2\2\2o>\3"+
		"\2\2\2oB\3\2\2\2oD\3\2\2\2oH\3\2\2\2oM\3\2\2\2oU\3\2\2\2oX\3\2\2\2o\\"+
		"\3\2\2\2od\3\2\2\2oj\3\2\2\2p\b\3\2\2\2qr\7/\2\2rs\7/\2\2sw\3\2\2\2tv"+
		"\n\3\2\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2yw\3\2\2\2z"+
		"{\b\5\2\2{\n\3\2\2\2|\u008d\t\4\2\2}~\7@\2\2~\u008d\7?\2\2\177\u0080\7"+
		">\2\2\u0080\u008d\7?\2\2\u0081\u0082\7#\2\2\u0082\u008d\7?\2\2\u0083\u0084"+
		"\7?\2\2\u0084\u008d\7?\2\2\u0085\u008d\t\5\2\2\u0086\u0087\7(\2\2\u0087"+
		"\u008d\7(\2\2\u0088\u008d\t\6\2\2\u0089\u008a\7<\2\2\u008a\u008d\7?\2"+
		"\2\u008b\u008d\7?\2\2\u008c|\3\2\2\2\u008c}\3\2\2\2\u008c\177\3\2\2\2"+
		"\u008c\u0081\3\2\2\2\u008c\u0083\3\2\2\2\u008c\u0085\3\2\2\2\u008c\u0086"+
		"\3\2\2\2\u008c\u0088\3\2\2\2\u008c\u0089\3\2\2\2\u008c\u008b\3\2\2\2\u008d"+
		"\f\3\2\2\2\u008e\u0092\7$\2\2\u008f\u0091\n\7\2\2\u0090\u008f\3\2\2\2"+
		"\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095"+
		"\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0096\7$\2\2\u0096\16\3\2\2\2\u0097"+
		"\u0099\t\b\2\2\u0098\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u0098\3\2"+
		"\2\2\u009a\u009b\3\2\2\2\u009b\20\3\2\2\2\u009c\u009e\t\b\2\2\u009d\u009c"+
		"\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\u00a3\t\t\2\2\u00a2\u00a4\t\b\2\2\u00a3\u00a2\3\2"+
		"\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\22\3\2\2\2\u00a7\u00ab\t\n\2\2\u00a8\u00aa\t\13\2\2\u00a9\u00a8\3\2\2"+
		"\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\24"+
		"\3\2\2\2\u00ad\u00ab\3\2\2\2\f\2\35ow\u008c\u0092\u009a\u009f\u00a5\u00ab"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
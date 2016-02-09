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
		WS=1, KEYWORD=2, COMMENT=3, OPERATOR=4, STRINGLITERAL=5, INTLITERAL=6, 
		FLOATLITERAL=7, IDENTIFIER=8;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WS", "KEYWORD", "COMMENT", "OPERATOR", "STRINGLITERAL", "INTLITERAL", 
		"FLOATLITERAL", "IDENTIFIER"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "KEYWORD", "COMMENT", "OPERATOR", "STRINGLITERAL", "INTLITERAL", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\n\u00a9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\6\2\25"+
		"\n\2\r\2\16\2\26\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3k"+
		"\n\3\3\4\3\4\3\4\3\4\7\4q\n\4\f\4\16\4t\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0088\n\5\3\6\3\6\7"+
		"\6\u008c\n\6\f\6\16\6\u008f\13\6\3\6\3\6\3\7\6\7\u0094\n\7\r\7\16\7\u0095"+
		"\3\b\6\b\u0099\n\b\r\b\16\b\u009a\3\b\3\b\6\b\u009f\n\b\r\b\16\b\u00a0"+
		"\3\t\3\t\7\t\u00a5\n\t\f\t\16\t\u00a8\13\t\2\2\n\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\3\2\f\5\2\13\f\17\17\"\"\4\2\f\f\17\17\6\2--//=>@@\5\2"+
		"*+..~~\4\2,,\61\61\3\2$$\3\2\62;\3\2\60\60\4\2C\\c|\5\2\62;C\\c|\u00c7"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\3\24\3\2\2\2\5j\3\2\2\2\7l\3\2\2\2\t\u0087"+
		"\3\2\2\2\13\u0089\3\2\2\2\r\u0093\3\2\2\2\17\u0098\3\2\2\2\21\u00a2\3"+
		"\2\2\2\23\25\t\2\2\2\24\23\3\2\2\2\25\26\3\2\2\2\26\24\3\2\2\2\26\27\3"+
		"\2\2\2\27\30\3\2\2\2\30\31\b\2\2\2\31\4\3\2\2\2\32\33\7R\2\2\33\34\7T"+
		"\2\2\34\35\7Q\2\2\35\36\7I\2\2\36\37\7T\2\2\37 \7C\2\2 k\7O\2\2!\"\7D"+
		"\2\2\"#\7G\2\2#$\7I\2\2$%\7K\2\2%k\7P\2\2&\'\7U\2\2\'(\7V\2\2()\7T\2\2"+
		")*\7K\2\2*+\7P\2\2+k\7I\2\2,-\7Y\2\2-.\7J\2\2./\7K\2\2/\60\7N\2\2\60k"+
		"\7G\2\2\61\62\7K\2\2\62\63\7P\2\2\63k\7V\2\2\64\65\7Y\2\2\65\66\7T\2\2"+
		"\66\67\7K\2\2\678\7V\2\28k\7G\2\29:\7T\2\2:;\7G\2\2;<\7C\2\2<k\7F\2\2"+
		"=>\7K\2\2>k\7H\2\2?@\7G\2\2@A\7N\2\2AB\7U\2\2Bk\7G\2\2CD\7G\2\2DE\7P\2"+
		"\2EF\7F\2\2FG\7K\2\2Gk\7H\2\2HI\7G\2\2IJ\7P\2\2JK\7F\2\2KL\7Y\2\2LM\7"+
		"J\2\2MN\7K\2\2NO\7N\2\2Ok\7G\2\2PQ\7G\2\2QR\7P\2\2Rk\7F\2\2ST\7X\2\2T"+
		"U\7Q\2\2UV\7K\2\2Vk\7F\2\2WX\7H\2\2XY\7W\2\2YZ\7P\2\2Z[\7E\2\2[\\\7V\2"+
		"\2\\]\7K\2\2]^\7Q\2\2^k\7P\2\2_`\7T\2\2`a\7G\2\2ab\7V\2\2bc\7W\2\2cd\7"+
		"T\2\2dk\7P\2\2ef\7H\2\2fg\7N\2\2gh\7Q\2\2hi\7C\2\2ik\7V\2\2j\32\3\2\2"+
		"\2j!\3\2\2\2j&\3\2\2\2j,\3\2\2\2j\61\3\2\2\2j\64\3\2\2\2j9\3\2\2\2j=\3"+
		"\2\2\2j?\3\2\2\2jC\3\2\2\2jH\3\2\2\2jP\3\2\2\2jS\3\2\2\2jW\3\2\2\2j_\3"+
		"\2\2\2je\3\2\2\2k\6\3\2\2\2lm\7/\2\2mn\7/\2\2nr\3\2\2\2oq\n\3\2\2po\3"+
		"\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2tr\3\2\2\2uv\b\4\2\2v\b"+
		"\3\2\2\2w\u0088\t\4\2\2xy\7@\2\2y\u0088\7?\2\2z{\7>\2\2{\u0088\7?\2\2"+
		"|}\7#\2\2}\u0088\7?\2\2~\177\7?\2\2\177\u0088\7?\2\2\u0080\u0088\t\5\2"+
		"\2\u0081\u0082\7(\2\2\u0082\u0088\7(\2\2\u0083\u0088\t\6\2\2\u0084\u0085"+
		"\7<\2\2\u0085\u0088\7?\2\2\u0086\u0088\7?\2\2\u0087w\3\2\2\2\u0087x\3"+
		"\2\2\2\u0087z\3\2\2\2\u0087|\3\2\2\2\u0087~\3\2\2\2\u0087\u0080\3\2\2"+
		"\2\u0087\u0081\3\2\2\2\u0087\u0083\3\2\2\2\u0087\u0084\3\2\2\2\u0087\u0086"+
		"\3\2\2\2\u0088\n\3\2\2\2\u0089\u008d\7$\2\2\u008a\u008c\n\7\2\2\u008b"+
		"\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2"+
		"\2\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091\7$\2\2\u0091"+
		"\f\3\2\2\2\u0092\u0094\t\b\2\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2"+
		"\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\16\3\2\2\2\u0097\u0099"+
		"\t\b\2\2\u0098\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u0098\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\t\t\2\2\u009d\u009f\t\b"+
		"\2\2\u009e\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\20\3\2\2\2\u00a2\u00a6\t\n\2\2\u00a3\u00a5\t\13\2"+
		"\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7"+
		"\3\2\2\2\u00a7\22\3\2\2\2\u00a8\u00a6\3\2\2\2\f\2\26jr\u0087\u008d\u0095"+
		"\u009a\u00a0\u00a6\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
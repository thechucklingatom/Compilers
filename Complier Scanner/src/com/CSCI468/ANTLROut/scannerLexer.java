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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\n\u00a7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\6\2\25"+
		"\n\2\r\2\16\2\26\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3i\n\3\3\4"+
		"\3\4\3\4\3\4\7\4o\n\4\f\4\16\4r\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0086\n\5\3\6\3\6\7\6\u008a"+
		"\n\6\f\6\16\6\u008d\13\6\3\6\3\6\3\7\6\7\u0092\n\7\r\7\16\7\u0093\3\b"+
		"\6\b\u0097\n\b\r\b\16\b\u0098\3\b\3\b\6\b\u009d\n\b\r\b\16\b\u009e\3\t"+
		"\3\t\7\t\u00a3\n\t\f\t\16\t\u00a6\13\t\2\2\n\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\3\2\f\5\2\13\f\17\17\"\"\4\2\f\f\17\17\6\2--//=>@@\5\2*+.."+
		"~~\4\2,,\61\61\3\2$$\3\2\62;\3\2\60\60\4\2C\\c|\5\2\62;C\\c|\u00c5\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\3\24\3\2\2\2\5h\3\2\2\2\7j\3\2\2\2\t\u0085"+
		"\3\2\2\2\13\u0087\3\2\2\2\r\u0091\3\2\2\2\17\u0096\3\2\2\2\21\u00a0\3"+
		"\2\2\2\23\25\t\2\2\2\24\23\3\2\2\2\25\26\3\2\2\2\26\24\3\2\2\2\26\27\3"+
		"\2\2\2\27\4\3\2\2\2\30\31\7R\2\2\31\32\7T\2\2\32\33\7Q\2\2\33\34\7I\2"+
		"\2\34\35\7T\2\2\35\36\7C\2\2\36i\7O\2\2\37 \7D\2\2 !\7G\2\2!\"\7I\2\2"+
		"\"#\7K\2\2#i\7P\2\2$%\7U\2\2%&\7V\2\2&\'\7T\2\2\'(\7K\2\2()\7P\2\2)i\7"+
		"I\2\2*+\7Y\2\2+,\7J\2\2,-\7K\2\2-.\7N\2\2.i\7G\2\2/\60\7K\2\2\60\61\7"+
		"P\2\2\61i\7V\2\2\62\63\7Y\2\2\63\64\7T\2\2\64\65\7K\2\2\65\66\7V\2\2\66"+
		"i\7G\2\2\678\7T\2\289\7G\2\29:\7C\2\2:i\7F\2\2;<\7K\2\2<i\7H\2\2=>\7G"+
		"\2\2>?\7N\2\2?@\7U\2\2@i\7G\2\2AB\7G\2\2BC\7P\2\2CD\7F\2\2DE\7K\2\2Ei"+
		"\7H\2\2FG\7G\2\2GH\7P\2\2HI\7F\2\2IJ\7Y\2\2JK\7J\2\2KL\7K\2\2LM\7N\2\2"+
		"Mi\7G\2\2NO\7G\2\2OP\7P\2\2Pi\7F\2\2QR\7X\2\2RS\7Q\2\2ST\7K\2\2Ti\7F\2"+
		"\2UV\7H\2\2VW\7W\2\2WX\7P\2\2XY\7E\2\2YZ\7V\2\2Z[\7K\2\2[\\\7Q\2\2\\i"+
		"\7P\2\2]^\7T\2\2^_\7G\2\2_`\7V\2\2`a\7W\2\2ab\7T\2\2bi\7P\2\2cd\7H\2\2"+
		"de\7N\2\2ef\7Q\2\2fg\7C\2\2gi\7V\2\2h\30\3\2\2\2h\37\3\2\2\2h$\3\2\2\2"+
		"h*\3\2\2\2h/\3\2\2\2h\62\3\2\2\2h\67\3\2\2\2h;\3\2\2\2h=\3\2\2\2hA\3\2"+
		"\2\2hF\3\2\2\2hN\3\2\2\2hQ\3\2\2\2hU\3\2\2\2h]\3\2\2\2hc\3\2\2\2i\6\3"+
		"\2\2\2jk\7/\2\2kl\7/\2\2lp\3\2\2\2mo\n\3\2\2nm\3\2\2\2or\3\2\2\2pn\3\2"+
		"\2\2pq\3\2\2\2qs\3\2\2\2rp\3\2\2\2st\b\4\2\2t\b\3\2\2\2u\u0086\t\4\2\2"+
		"vw\7@\2\2w\u0086\7?\2\2xy\7>\2\2y\u0086\7?\2\2z{\7#\2\2{\u0086\7?\2\2"+
		"|}\7?\2\2}\u0086\7?\2\2~\u0086\t\5\2\2\177\u0080\7(\2\2\u0080\u0086\7"+
		"(\2\2\u0081\u0086\t\6\2\2\u0082\u0083\7<\2\2\u0083\u0086\7?\2\2\u0084"+
		"\u0086\7?\2\2\u0085u\3\2\2\2\u0085v\3\2\2\2\u0085x\3\2\2\2\u0085z\3\2"+
		"\2\2\u0085|\3\2\2\2\u0085~\3\2\2\2\u0085\177\3\2\2\2\u0085\u0081\3\2\2"+
		"\2\u0085\u0082\3\2\2\2\u0085\u0084\3\2\2\2\u0086\n\3\2\2\2\u0087\u008b"+
		"\7$\2\2\u0088\u008a\n\7\2\2\u0089\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2"+
		"\2\2\u008e\u008f\7$\2\2\u008f\f\3\2\2\2\u0090\u0092\t\b\2\2\u0091\u0090"+
		"\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\16\3\2\2\2\u0095\u0097\t\b\2\2\u0096\u0095\3\2\2\2\u0097\u0098\3\2\2"+
		"\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009c"+
		"\t\t\2\2\u009b\u009d\t\b\2\2\u009c\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\20\3\2\2\2\u00a0\u00a4\t\n\2"+
		"\2\u00a1\u00a3\t\13\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4"+
		"\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\22\3\2\2\2\u00a6\u00a4\3\2\2"+
		"\2\f\2\26hp\u0085\u008b\u0093\u0098\u009e\u00a4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
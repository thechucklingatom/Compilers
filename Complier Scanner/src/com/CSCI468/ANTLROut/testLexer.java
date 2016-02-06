// Generated from res/Grammars/test.g4 by ANTLR 4.5.2
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
public class testLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID=1, KEYWORD=2, OPERATOR=3, STATEMENT=4, IDENTIFIER=5, LITERAL=6, ASSIGNMENT=7, 
		STRINGLITERAL=8, FLOATLITERAL=9, INTLITERAL=10, ENDOFLINE=11, WS=12;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ID", "KEYWORD", "OPERATOR", "STATEMENT", "IDENTIFIER", "LITERAL", "ASSIGNMENT", 
		"STRINGLITERAL", "FLOATLITERAL", "INTLITERAL", "ENDOFLINE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, "':='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ID", "KEYWORD", "OPERATOR", "STATEMENT", "IDENTIFIER", "LITERAL", 
		"ASSIGNMENT", "STRINGLITERAL", "FLOATLITERAL", "INTLITERAL", "ENDOFLINE", 
		"WS"
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


	public testLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "test.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 0:
			ID_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void ID_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			System.out.println("found something");
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\16\u00c5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\3\2\6\2\35\n\2\r\2\16\2\36\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3s\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0084\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0094\n\5\3\6\6\6\u0097\n\6\r\6\16"+
		"\6\u0098\3\7\3\7\3\7\5\7\u009e\n\7\3\b\3\b\3\b\3\t\3\t\7\t\u00a5\n\t\f"+
		"\t\16\t\u00a8\13\t\3\t\3\t\3\n\6\n\u00ad\n\n\r\n\16\n\u00ae\3\n\3\n\6"+
		"\n\u00b3\n\n\r\n\16\n\u00b4\3\13\6\13\u00b8\n\13\r\13\16\13\u00b9\3\f"+
		"\3\f\3\f\5\f\u00bf\n\f\3\r\6\r\u00c2\n\r\r\r\16\r\u00c3\2\2\16\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\3\2\r\5\2\"\"C\\c|\5"+
		"\2--==??\5\2//>>@@\5\2*+..~~\4\2,,\61\61\6\2\"\"\60\60<<^^\3\2\62;\3\2"+
		"\60\60\3\2==\4\2\f\f\17\17\4\2\13\13\"\"\u00e7\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3\34\3\2\2"+
		"\2\5r\3\2\2\2\7\u0083\3\2\2\2\t\u0093\3\2\2\2\13\u0096\3\2\2\2\r\u009d"+
		"\3\2\2\2\17\u009f\3\2\2\2\21\u00a2\3\2\2\2\23\u00ac\3\2\2\2\25\u00b7\3"+
		"\2\2\2\27\u00be\3\2\2\2\31\u00c1\3\2\2\2\33\35\t\2\2\2\34\33\3\2\2\2\35"+
		"\36\3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37 \3\2\2\2 !\b\2\2\2!\4\3\2\2"+
		"\2\"#\7R\2\2#$\7T\2\2$%\7Q\2\2%&\7I\2\2&\'\7T\2\2\'(\7C\2\2(s\7O\2\2)"+
		"*\7U\2\2*+\7V\2\2+,\7T\2\2,-\7K\2\2-.\7P\2\2.s\7I\2\2/\60\7D\2\2\60\61"+
		"\7G\2\2\61\62\7I\2\2\62\63\7K\2\2\63s\7P\2\2\64\65\7G\2\2\65\66\7P\2\2"+
		"\66s\7F\2\2\678\7K\2\289\7P\2\29s\7V\2\2:;\7H\2\2;<\7W\2\2<=\7P\2\2=>"+
		"\7E\2\2>?\7V\2\2?@\7K\2\2@A\7Q\2\2As\7P\2\2BC\7X\2\2CD\7Q\2\2DE\7K\2\2"+
		"Es\7F\2\2FG\7Y\2\2GH\7J\2\2HI\7K\2\2IJ\7N\2\2Js\7G\2\2KL\7Y\2\2LM\7T\2"+
		"\2MN\7K\2\2NO\7V\2\2Os\7G\2\2PQ\7H\2\2QR\7N\2\2RS\7Q\2\2ST\7C\2\2Ts\7"+
		"V\2\2UV\7T\2\2VW\7G\2\2WX\7C\2\2Xs\7F\2\2YZ\7G\2\2Z[\7P\2\2[\\\7F\2\2"+
		"\\]\7Y\2\2]^\7J\2\2^_\7K\2\2_`\7N\2\2`s\7G\2\2ab\7G\2\2bc\7P\2\2cd\7F"+
		"\2\2de\7K\2\2es\7H\2\2fg\7K\2\2gs\7H\2\2hi\7T\2\2ij\7G\2\2jk\7V\2\2kl"+
		"\7W\2\2lm\7T\2\2ms\7P\2\2no\7G\2\2op\7N\2\2pq\7U\2\2qs\7G\2\2r\"\3\2\2"+
		"\2r)\3\2\2\2r/\3\2\2\2r\64\3\2\2\2r\67\3\2\2\2r:\3\2\2\2rB\3\2\2\2rF\3"+
		"\2\2\2rK\3\2\2\2rP\3\2\2\2rU\3\2\2\2rY\3\2\2\2ra\3\2\2\2rf\3\2\2\2rh\3"+
		"\2\2\2rn\3\2\2\2s\6\3\2\2\2t\u0084\t\3\2\2u\u0084\5\17\b\2v\u0084\t\4"+
		"\2\2wx\7@\2\2x\u0084\7?\2\2yz\7>\2\2z\u0084\7?\2\2{|\7#\2\2|\u0084\7?"+
		"\2\2}~\7?\2\2~\u0084\7?\2\2\177\u0084\t\5\2\2\u0080\u0081\7(\2\2\u0081"+
		"\u0084\7(\2\2\u0082\u0084\t\6\2\2\u0083t\3\2\2\2\u0083u\3\2\2\2\u0083"+
		"v\3\2\2\2\u0083w\3\2\2\2\u0083y\3\2\2\2\u0083{\3\2\2\2\u0083}\3\2\2\2"+
		"\u0083\177\3\2\2\2\u0083\u0080\3\2\2\2\u0083\u0082\3\2\2\2\u0084\b\3\2"+
		"\2\2\u0085\u0086\5\5\3\2\u0086\u0087\5\31\r\2\u0087\u0088\5\13\6\2\u0088"+
		"\u0089\5\31\r\2\u0089\u008a\5\17\b\2\u008a\u008b\5\31\r\2\u008b\u008c"+
		"\5\r\7\2\u008c\u008d\5\27\f\2\u008d\u0094\3\2\2\2\u008e\u008f\5\5\3\2"+
		"\u008f\u0090\5\31\r\2\u0090\u0091\5\13\6\2\u0091\u0092\5\27\f\2\u0092"+
		"\u0094\3\2\2\2\u0093\u0085\3\2\2\2\u0093\u008e\3\2\2\2\u0094\n\3\2\2\2"+
		"\u0095\u0097\t\2\2\2\u0096\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096"+
		"\3\2\2\2\u0098\u0099\3\2\2\2\u0099\f\3\2\2\2\u009a\u009e\5\21\t\2\u009b"+
		"\u009e\5\23\n\2\u009c\u009e\5\25\13\2\u009d\u009a\3\2\2\2\u009d\u009b"+
		"\3\2\2\2\u009d\u009c\3\2\2\2\u009e\16\3\2\2\2\u009f\u00a0\7<\2\2\u00a0"+
		"\u00a1\7?\2\2\u00a1\20\3\2\2\2\u00a2\u00a6\7$\2\2\u00a3\u00a5\t\7\2\2"+
		"\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7"+
		"\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\7$\2\2\u00aa"+
		"\22\3\2\2\2\u00ab\u00ad\t\b\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3\2\2"+
		"\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2"+
		"\t\t\2\2\u00b1\u00b3\t\b\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\24\3\2\2\2\u00b6\u00b8\t\b\2"+
		"\2\u00b7\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba"+
		"\3\2\2\2\u00ba\26\3\2\2\2\u00bb\u00bc\t\n\2\2\u00bc\u00bf\t\13\2\2\u00bd"+
		"\u00bf\t\13\2\2\u00be\u00bb\3\2\2\2\u00be\u00bd\3\2\2\2\u00bf\30\3\2\2"+
		"\2\u00c0\u00c2\t\f\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c1"+
		"\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\32\3\2\2\2\17\2\36r\u0083\u0093\u0098"+
		"\u009d\u00a6\u00ae\u00b4\u00b9\u00be\u00c3\3\3\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
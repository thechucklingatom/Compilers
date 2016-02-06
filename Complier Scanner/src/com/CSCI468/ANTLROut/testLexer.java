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
		ID=1, KEYWORD=2, OPERATOR=3, STRINGLITERAL=4, FLOATLITERAL=5, INTLITERAL=6, 
		WS=7, FILEEND=8;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ID", "KEYWORD", "OPERATOR", "STRINGLITERAL", "FLOATLITERAL", "INTLITERAL", 
		"WS", "FILEEND"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ID", "KEYWORD", "OPERATOR", "STRINGLITERAL", "FLOATLITERAL", "INTLITERAL", 
		"WS", "FILEEND"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\n\u009e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\6\2\25"+
		"\n\2\r\2\16\2\26\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3k"+
		"\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5"+
		"\4}\n\4\3\5\3\5\7\5\u0081\n\5\f\5\16\5\u0084\13\5\3\5\3\5\3\6\6\6\u0089"+
		"\n\6\r\6\16\6\u008a\3\6\3\6\6\6\u008f\n\6\r\6\16\6\u0090\3\7\6\7\u0094"+
		"\n\7\r\7\16\7\u0095\3\b\6\b\u0099\n\b\r\b\16\b\u009a\3\t\3\t\3\u0082\2"+
		"\n\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\3\2\n\5\2\"\"C\\c|\5\2--==??\5\2"+
		"//>>@@\5\2*+..~~\4\2,,\61\61\3\2\62;\3\2\60\60\5\2\13\f\17\17\"\"\u00bb"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\3\24\3\2\2\2\5j\3\2\2\2\7|\3\2\2\2\t~\3"+
		"\2\2\2\13\u0088\3\2\2\2\r\u0093\3\2\2\2\17\u0098\3\2\2\2\21\u009c\3\2"+
		"\2\2\23\25\t\2\2\2\24\23\3\2\2\2\25\26\3\2\2\2\26\24\3\2\2\2\26\27\3\2"+
		"\2\2\27\30\3\2\2\2\30\31\b\2\2\2\31\4\3\2\2\2\32\33\7R\2\2\33\34\7T\2"+
		"\2\34\35\7Q\2\2\35\36\7I\2\2\36\37\7T\2\2\37 \7C\2\2 k\7O\2\2!\"\7U\2"+
		"\2\"#\7V\2\2#$\7T\2\2$%\7K\2\2%&\7P\2\2&k\7I\2\2\'(\7D\2\2()\7G\2\2)*"+
		"\7I\2\2*+\7K\2\2+k\7P\2\2,-\7G\2\2-.\7P\2\2.k\7F\2\2/\60\7K\2\2\60\61"+
		"\7P\2\2\61k\7V\2\2\62\63\7H\2\2\63\64\7W\2\2\64\65\7P\2\2\65\66\7E\2\2"+
		"\66\67\7V\2\2\678\7K\2\289\7Q\2\29k\7P\2\2:;\7X\2\2;<\7Q\2\2<=\7K\2\2"+
		"=k\7F\2\2>?\7Y\2\2?@\7J\2\2@A\7K\2\2AB\7N\2\2Bk\7G\2\2CD\7Y\2\2DE\7T\2"+
		"\2EF\7K\2\2FG\7V\2\2Gk\7G\2\2HI\7H\2\2IJ\7N\2\2JK\7Q\2\2KL\7C\2\2Lk\7"+
		"V\2\2MN\7T\2\2NO\7G\2\2OP\7C\2\2Pk\7F\2\2QR\7G\2\2RS\7P\2\2ST\7F\2\2T"+
		"U\7Y\2\2UV\7J\2\2VW\7K\2\2WX\7N\2\2Xk\7G\2\2YZ\7G\2\2Z[\7P\2\2[\\\7F\2"+
		"\2\\]\7K\2\2]k\7H\2\2^_\7K\2\2_k\7H\2\2`a\7T\2\2ab\7G\2\2bc\7V\2\2cd\7"+
		"W\2\2de\7T\2\2ek\7P\2\2fg\7G\2\2gh\7N\2\2hi\7U\2\2ik\7G\2\2j\32\3\2\2"+
		"\2j!\3\2\2\2j\'\3\2\2\2j,\3\2\2\2j/\3\2\2\2j\62\3\2\2\2j:\3\2\2\2j>\3"+
		"\2\2\2jC\3\2\2\2jH\3\2\2\2jM\3\2\2\2jQ\3\2\2\2jY\3\2\2\2j^\3\2\2\2j`\3"+
		"\2\2\2jf\3\2\2\2k\6\3\2\2\2l}\t\3\2\2mn\7<\2\2n}\7?\2\2o}\t\4\2\2pq\7"+
		"@\2\2q}\7?\2\2rs\7>\2\2s}\7?\2\2tu\7#\2\2u}\7?\2\2vw\7?\2\2w}\7?\2\2x"+
		"}\t\5\2\2yz\7(\2\2z}\7(\2\2{}\t\6\2\2|l\3\2\2\2|m\3\2\2\2|o\3\2\2\2|p"+
		"\3\2\2\2|r\3\2\2\2|t\3\2\2\2|v\3\2\2\2|x\3\2\2\2|y\3\2\2\2|{\3\2\2\2}"+
		"\b\3\2\2\2~\u0082\7$\2\2\177\u0081\13\2\2\2\u0080\177\3\2\2\2\u0081\u0084"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0085\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0085\u0086\7$\2\2\u0086\n\3\2\2\2\u0087\u0089\t\7\2\2"+
		"\u0088\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b"+
		"\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\t\b\2\2\u008d\u008f\t\7\2\2\u008e"+
		"\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2"+
		"\2\2\u0091\f\3\2\2\2\u0092\u0094\t\7\2\2\u0093\u0092\3\2\2\2\u0094\u0095"+
		"\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\16\3\2\2\2\u0097"+
		"\u0099\t\t\2\2\u0098\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u0098\3\2"+
		"\2\2\u009a\u009b\3\2\2\2\u009b\20\3\2\2\2\u009c\u009d\7\2\2\3\u009d\22"+
		"\3\2\2\2\13\2\26j|\u0082\u008a\u0090\u0095\u009a\3\3\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
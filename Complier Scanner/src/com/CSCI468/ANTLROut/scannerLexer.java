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
		WS=1, KEYWORD=2, OPERATOR=3, STRINGLITERAL=4, INTLITERAL=5, IDENTIFIER=6;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WS", "KEYWORD", "OPERATOR", "STRINGLITERAL", "INTLITERAL", "IDENTIFIER"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "KEYWORD", "OPERATOR", "STRINGLITERAL", "INTLITERAL", "IDENTIFIER"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\bL\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\6\2\21\n\2\r\2\16\2\22\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3.\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4\66\n\4"+
		"\3\5\3\5\7\5:\n\5\f\5\16\5=\13\5\3\5\3\5\3\6\6\6B\n\6\r\6\16\6C\3\7\3"+
		"\7\7\7H\n\7\f\7\16\7K\13\7\2\2\b\3\3\5\4\7\5\t\6\13\7\r\b\3\2\t\5\2\13"+
		"\f\17\17\"\"\4\2*+==\4\2-/??\3\2$$\3\2\62;\4\2C\\c|\5\2\62;C\\c|U\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\3\20\3\2\2\2\5-\3\2\2\2\7\65\3\2\2\2\t\67\3\2\2\2\13A\3\2\2\2\rE\3\2"+
		"\2\2\17\21\t\2\2\2\20\17\3\2\2\2\21\22\3\2\2\2\22\20\3\2\2\2\22\23\3\2"+
		"\2\2\23\24\3\2\2\2\24\25\b\2\2\2\25\4\3\2\2\2\26\27\7R\2\2\27\30\7T\2"+
		"\2\30\31\7Q\2\2\31\32\7I\2\2\32\33\7T\2\2\33\34\7C\2\2\34.\7O\2\2\35\36"+
		"\7D\2\2\36\37\7G\2\2\37 \7I\2\2 !\7K\2\2!.\7P\2\2\"#\7U\2\2#$\7V\2\2$"+
		"%\7T\2\2%&\7K\2\2&\'\7P\2\2\'.\7I\2\2()\7Y\2\2)*\7J\2\2*+\7K\2\2+,\7N"+
		"\2\2,.\7G\2\2-\26\3\2\2\2-\35\3\2\2\2-\"\3\2\2\2-(\3\2\2\2.\6\3\2\2\2"+
		"/\60\7<\2\2\60\66\7?\2\2\61\66\t\3\2\2\62\63\7#\2\2\63\66\7?\2\2\64\66"+
		"\t\4\2\2\65/\3\2\2\2\65\61\3\2\2\2\65\62\3\2\2\2\65\64\3\2\2\2\66\b\3"+
		"\2\2\2\67;\7$\2\28:\n\5\2\298\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<>"+
		"\3\2\2\2=;\3\2\2\2>?\7$\2\2?\n\3\2\2\2@B\t\6\2\2A@\3\2\2\2BC\3\2\2\2C"+
		"A\3\2\2\2CD\3\2\2\2D\f\3\2\2\2EI\t\7\2\2FH\t\b\2\2GF\3\2\2\2HK\3\2\2\2"+
		"IG\3\2\2\2IJ\3\2\2\2J\16\3\2\2\2KI\3\2\2\2\t\2\22-\65;CI\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
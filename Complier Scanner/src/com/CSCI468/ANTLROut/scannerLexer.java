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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\bI\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\6\2\21\n\2\r\2\16\2\22\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\5\3,\n\3\3\4\3\4\3\4\3\4\3\4\5\4\63\n\4\3\5\3\5\7\5"+
		"\67\n\5\f\5\16\5:\13\5\3\5\3\5\3\6\6\6?\n\6\r\6\16\6@\3\7\3\7\7\7E\n\7"+
		"\f\7\16\7H\13\7\38\2\b\3\3\5\4\7\5\t\6\13\7\r\b\3\2\7\5\2\13\f\17\17\""+
		"\"\4\2*+==\3\2\62;\4\2C\\c|\5\2\62;C\\c|Q\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\3\20\3\2\2\2\5+\3\2\2\2"+
		"\7\62\3\2\2\2\t\64\3\2\2\2\13>\3\2\2\2\rB\3\2\2\2\17\21\t\2\2\2\20\17"+
		"\3\2\2\2\21\22\3\2\2\2\22\20\3\2\2\2\22\23\3\2\2\2\23\4\3\2\2\2\24\25"+
		"\7R\2\2\25\26\7T\2\2\26\27\7Q\2\2\27\30\7I\2\2\30\31\7T\2\2\31\32\7C\2"+
		"\2\32,\7O\2\2\33\34\7D\2\2\34\35\7G\2\2\35\36\7I\2\2\36\37\7K\2\2\37,"+
		"\7P\2\2 !\7U\2\2!\"\7V\2\2\"#\7T\2\2#$\7K\2\2$%\7P\2\2%,\7I\2\2&\'\7Y"+
		"\2\2\'(\7J\2\2()\7K\2\2)*\7N\2\2*,\7G\2\2+\24\3\2\2\2+\33\3\2\2\2+ \3"+
		"\2\2\2+&\3\2\2\2,\6\3\2\2\2-.\7<\2\2.\63\7?\2\2/\63\t\3\2\2\60\61\7#\2"+
		"\2\61\63\7?\2\2\62-\3\2\2\2\62/\3\2\2\2\62\60\3\2\2\2\63\b\3\2\2\2\64"+
		"8\7$\2\2\65\67\13\2\2\2\66\65\3\2\2\2\67:\3\2\2\289\3\2\2\28\66\3\2\2"+
		"\29;\3\2\2\2:8\3\2\2\2;<\7$\2\2<\n\3\2\2\2=?\t\4\2\2>=\3\2\2\2?@\3\2\2"+
		"\2@>\3\2\2\2@A\3\2\2\2A\f\3\2\2\2BF\t\5\2\2CE\t\6\2\2DC\3\2\2\2EH\3\2"+
		"\2\2FD\3\2\2\2FG\3\2\2\2G\16\3\2\2\2HF\3\2\2\2\t\2\22+\628@F\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
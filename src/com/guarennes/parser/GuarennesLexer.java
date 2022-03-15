// Generated from .\Guarennes.g4 by ANTLR 4.9.2
package com.guarennes.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GuarennesLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, FUNCOPEN=6, FUNCCLOSE=7, INITIAL=8, 
		PRINT=9, INT=10, MULT=11, DIV=12, SUM=13, SUB=14, NUM=15, ID=16, WS=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "FUNCOPEN", "FUNCCLOSE", "INITIAL", 
			"PRINT", "INT", "MULT", "DIV", "SUM", "SUB", "NUM", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "':'", "';'", "'='", "'__func'", "'func__'", "'initial'", 
			"'tanganana'", "'tangananica'", "'*'", "'/'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "FUNCOPEN", "FUNCCLOSE", "INITIAL", 
			"PRINT", "INT", "MULT", "DIV", "SUM", "SUB", "NUM", "ID", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public GuarennesLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Guarennes.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23t\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\6\20e\n\20"+
		"\r\20\16\20f\3\21\6\21j\n\21\r\21\16\21k\3\22\6\22o\n\22\r\22\16\22p\3"+
		"\22\3\22\2\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23\3\2\5\3\2\62;\4\2C\\c|\5\2\13\f\17\17\""+
		"\"\2v\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r"+
		"\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2"+
		"\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2"+
		"#\3\2\2\2\3%\3\2\2\2\5\'\3\2\2\2\7)\3\2\2\2\t+\3\2\2\2\13-\3\2\2\2\r/"+
		"\3\2\2\2\17\66\3\2\2\2\21=\3\2\2\2\23E\3\2\2\2\25O\3\2\2\2\27[\3\2\2\2"+
		"\31]\3\2\2\2\33_\3\2\2\2\35a\3\2\2\2\37d\3\2\2\2!i\3\2\2\2#n\3\2\2\2%"+
		"&\7*\2\2&\4\3\2\2\2\'(\7+\2\2(\6\3\2\2\2)*\7<\2\2*\b\3\2\2\2+,\7=\2\2"+
		",\n\3\2\2\2-.\7?\2\2.\f\3\2\2\2/\60\7a\2\2\60\61\7a\2\2\61\62\7h\2\2\62"+
		"\63\7w\2\2\63\64\7p\2\2\64\65\7e\2\2\65\16\3\2\2\2\66\67\7h\2\2\678\7"+
		"w\2\289\7p\2\29:\7e\2\2:;\7a\2\2;<\7a\2\2<\20\3\2\2\2=>\7k\2\2>?\7p\2"+
		"\2?@\7k\2\2@A\7v\2\2AB\7k\2\2BC\7c\2\2CD\7n\2\2D\22\3\2\2\2EF\7v\2\2F"+
		"G\7c\2\2GH\7p\2\2HI\7i\2\2IJ\7c\2\2JK\7p\2\2KL\7c\2\2LM\7p\2\2MN\7c\2"+
		"\2N\24\3\2\2\2OP\7v\2\2PQ\7c\2\2QR\7p\2\2RS\7i\2\2ST\7c\2\2TU\7p\2\2U"+
		"V\7c\2\2VW\7p\2\2WX\7k\2\2XY\7e\2\2YZ\7c\2\2Z\26\3\2\2\2[\\\7,\2\2\\\30"+
		"\3\2\2\2]^\7\61\2\2^\32\3\2\2\2_`\7-\2\2`\34\3\2\2\2ab\7/\2\2b\36\3\2"+
		"\2\2ce\t\2\2\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2g \3\2\2\2hj\t\3"+
		"\2\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\"\3\2\2\2mo\t\4\2\2nm\3"+
		"\2\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2qr\3\2\2\2rs\b\22\2\2s$\3\2\2\2\6"+
		"\2fkp\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
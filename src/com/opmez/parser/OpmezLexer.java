// Generated from .\Opmez.g4 by ANTLR 4.9.2
package com.opmez.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OpmezLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, DEFINEFUNC=2, INITIAL=3, KO=4, KC=5, PO=6, PC=7, IF=8, ELSE=9, 
		ELIF=10, FOR=11, SCOL=12, ASSIGN=13, PRINT=14, DECLARE=15, EQT=16, NEQT=17, 
		GT=18, LT=19, GEQT=20, LEQT=21, AND=22, OR=23, TRUE=24, FALSE=25, NOT=26, 
		MULT=27, DIV=28, SUM=29, SUB=30, INT=31, DOUBLE=32, ID=33, STRING=34, 
		LINECOM=35, MULTILINECOM=36, WS=37;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "DEFINEFUNC", "INITIAL", "KO", "KC", "PO", "PC", "IF", "ELSE", 
			"ELIF", "FOR", "SCOL", "ASSIGN", "PRINT", "DECLARE", "EQT", "NEQT", "GT", 
			"LT", "GEQT", "LEQT", "AND", "OR", "TRUE", "FALSE", "NOT", "MULT", "DIV", 
			"SUM", "SUB", "INT", "DOUBLE", "ID", "STRING", "LINECOM", "MULTILINECOM", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'while'", "'#'", "'initial'", "'->'", "'<-'", "'('", "')'", "'if'", 
			"'else'", "'elif'", "'for'", "';'", "'='", "'systalk'", "'use'", "'=='", 
			"'!='", "'>'", "'<'", "'>='", "'<='", "'&&'", "'||'", "'true'", "'false'", 
			"'!'", "'*'", "'/'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "DEFINEFUNC", "INITIAL", "KO", "KC", "PO", "PC", "IF", "ELSE", 
			"ELIF", "FOR", "SCOL", "ASSIGN", "PRINT", "DECLARE", "EQT", "NEQT", "GT", 
			"LT", "GEQT", "LEQT", "AND", "OR", "TRUE", "FALSE", "NOT", "MULT", "DIV", 
			"SUM", "SUB", "INT", "DOUBLE", "ID", "STRING", "LINECOM", "MULTILINECOM", 
			"WS"
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


	public OpmezLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Opmez.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u00f7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3"+
		"\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3"+
		"\36\3\36\3\37\3\37\3 \6 \u00b5\n \r \16 \u00b6\3!\6!\u00ba\n!\r!\16!\u00bb"+
		"\3!\3!\6!\u00c0\n!\r!\16!\u00c1\3\"\6\"\u00c5\n\"\r\"\16\"\u00c6\3\"\7"+
		"\"\u00ca\n\"\f\"\16\"\u00cd\13\"\3#\3#\7#\u00d1\n#\f#\16#\u00d4\13#\3"+
		"#\3#\3$\3$\7$\u00da\n$\f$\16$\u00dd\13$\3$\3$\3$\3$\3%\3%\3%\3%\7%\u00e7"+
		"\n%\f%\16%\u00ea\13%\3%\3%\3%\3%\3%\3&\6&\u00f2\n&\r&\16&\u00f3\3&\3&"+
		"\6\u00c1\u00d2\u00db\u00e8\2\'\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'\3\2\6\3\2\62;\4\2C\\c"+
		"|\5\2\62;C\\c|\5\2\13\f\17\17\"\"\2\u00ff\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\3M"+
		"\3\2\2\2\5S\3\2\2\2\7U\3\2\2\2\t]\3\2\2\2\13`\3\2\2\2\rc\3\2\2\2\17e\3"+
		"\2\2\2\21g\3\2\2\2\23j\3\2\2\2\25o\3\2\2\2\27t\3\2\2\2\31x\3\2\2\2\33"+
		"z\3\2\2\2\35|\3\2\2\2\37\u0084\3\2\2\2!\u0088\3\2\2\2#\u008b\3\2\2\2%"+
		"\u008e\3\2\2\2\'\u0090\3\2\2\2)\u0092\3\2\2\2+\u0095\3\2\2\2-\u0098\3"+
		"\2\2\2/\u009b\3\2\2\2\61\u009e\3\2\2\2\63\u00a3\3\2\2\2\65\u00a9\3\2\2"+
		"\2\67\u00ab\3\2\2\29\u00ad\3\2\2\2;\u00af\3\2\2\2=\u00b1\3\2\2\2?\u00b4"+
		"\3\2\2\2A\u00b9\3\2\2\2C\u00c4\3\2\2\2E\u00ce\3\2\2\2G\u00d7\3\2\2\2I"+
		"\u00e2\3\2\2\2K\u00f1\3\2\2\2MN\7y\2\2NO\7j\2\2OP\7k\2\2PQ\7n\2\2QR\7"+
		"g\2\2R\4\3\2\2\2ST\7%\2\2T\6\3\2\2\2UV\7k\2\2VW\7p\2\2WX\7k\2\2XY\7v\2"+
		"\2YZ\7k\2\2Z[\7c\2\2[\\\7n\2\2\\\b\3\2\2\2]^\7/\2\2^_\7@\2\2_\n\3\2\2"+
		"\2`a\7>\2\2ab\7/\2\2b\f\3\2\2\2cd\7*\2\2d\16\3\2\2\2ef\7+\2\2f\20\3\2"+
		"\2\2gh\7k\2\2hi\7h\2\2i\22\3\2\2\2jk\7g\2\2kl\7n\2\2lm\7u\2\2mn\7g\2\2"+
		"n\24\3\2\2\2op\7g\2\2pq\7n\2\2qr\7k\2\2rs\7h\2\2s\26\3\2\2\2tu\7h\2\2"+
		"uv\7q\2\2vw\7t\2\2w\30\3\2\2\2xy\7=\2\2y\32\3\2\2\2z{\7?\2\2{\34\3\2\2"+
		"\2|}\7u\2\2}~\7{\2\2~\177\7u\2\2\177\u0080\7v\2\2\u0080\u0081\7c\2\2\u0081"+
		"\u0082\7n\2\2\u0082\u0083\7m\2\2\u0083\36\3\2\2\2\u0084\u0085\7w\2\2\u0085"+
		"\u0086\7u\2\2\u0086\u0087\7g\2\2\u0087 \3\2\2\2\u0088\u0089\7?\2\2\u0089"+
		"\u008a\7?\2\2\u008a\"\3\2\2\2\u008b\u008c\7#\2\2\u008c\u008d\7?\2\2\u008d"+
		"$\3\2\2\2\u008e\u008f\7@\2\2\u008f&\3\2\2\2\u0090\u0091\7>\2\2\u0091("+
		"\3\2\2\2\u0092\u0093\7@\2\2\u0093\u0094\7?\2\2\u0094*\3\2\2\2\u0095\u0096"+
		"\7>\2\2\u0096\u0097\7?\2\2\u0097,\3\2\2\2\u0098\u0099\7(\2\2\u0099\u009a"+
		"\7(\2\2\u009a.\3\2\2\2\u009b\u009c\7~\2\2\u009c\u009d\7~\2\2\u009d\60"+
		"\3\2\2\2\u009e\u009f\7v\2\2\u009f\u00a0\7t\2\2\u00a0\u00a1\7w\2\2\u00a1"+
		"\u00a2\7g\2\2\u00a2\62\3\2\2\2\u00a3\u00a4\7h\2\2\u00a4\u00a5\7c\2\2\u00a5"+
		"\u00a6\7n\2\2\u00a6\u00a7\7u\2\2\u00a7\u00a8\7g\2\2\u00a8\64\3\2\2\2\u00a9"+
		"\u00aa\7#\2\2\u00aa\66\3\2\2\2\u00ab\u00ac\7,\2\2\u00ac8\3\2\2\2\u00ad"+
		"\u00ae\7\61\2\2\u00ae:\3\2\2\2\u00af\u00b0\7-\2\2\u00b0<\3\2\2\2\u00b1"+
		"\u00b2\7/\2\2\u00b2>\3\2\2\2\u00b3\u00b5\t\2\2\2\u00b4\u00b3\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7@\3\2\2\2"+
		"\u00b8\u00ba\t\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9"+
		"\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bf\7\60\2\2"+
		"\u00be\u00c0\t\2\2\2\u00bf\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2"+
		"\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2B\3\2\2\2\u00c3\u00c5\t\3\2\2\u00c4"+
		"\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2"+
		"\2\2\u00c7\u00cb\3\2\2\2\u00c8\u00ca\t\4\2\2\u00c9\u00c8\3\2\2\2\u00ca"+
		"\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00ccD\3\2\2\2"+
		"\u00cd\u00cb\3\2\2\2\u00ce\u00d2\7$\2\2\u00cf\u00d1\13\2\2\2\u00d0\u00cf"+
		"\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3"+
		"\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\7$\2\2\u00d6F\3\2\2\2\u00d7"+
		"\u00db\7B\2\2\u00d8\u00da\13\2\2\2\u00d9\u00d8\3\2\2\2\u00da\u00dd\3\2"+
		"\2\2\u00db\u00dc\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd"+
		"\u00db\3\2\2\2\u00de\u00df\7\f\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\b$"+
		"\2\2\u00e1H\3\2\2\2\u00e2\u00e3\7B\2\2\u00e3\u00e4\7}\2\2\u00e4\u00e8"+
		"\3\2\2\2\u00e5\u00e7\13\2\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00ea\3\2\2\2"+
		"\u00e8\u00e9\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00e8"+
		"\3\2\2\2\u00eb\u00ec\7\177\2\2\u00ec\u00ed\7B\2\2\u00ed\u00ee\3\2\2\2"+
		"\u00ee\u00ef\b%\2\2\u00efJ\3\2\2\2\u00f0\u00f2\t\5\2\2\u00f1\u00f0\3\2"+
		"\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\u00f5\3\2\2\2\u00f5\u00f6\b&\2\2\u00f6L\3\2\2\2\f\2\u00b6\u00bb\u00c1"+
		"\u00c6\u00cb\u00d2\u00db\u00e8\u00f3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
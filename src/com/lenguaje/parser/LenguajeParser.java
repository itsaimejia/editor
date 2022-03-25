// Generated from .\Lenguaje.g4 by ANTLR 4.9.2
package com.lenguaje.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LenguajeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VOID=1, MAIN=2, PO=3, PC=4, KO=5, KC=6, PRINTF=7, INT=8, IF=9, ELSE=10, 
		MULT=11, DIV=12, SUM=13, SUB=14, ASSIGN=15, SCOL=16, EQT=17, NEQT=18, 
		GT=19, LT=20, GEQT=21, LEQT=22, AND=23, OR=24, TRUE=25, FALSE=26, NOT=27, 
		NUM=28, ID=29, LINECOM=30, MULTILINECOM=31, WS=32;
	public static final int
		RULE_program = 0, RULE_file = 1, RULE_body = 2, RULE_elif_sentence = 3, 
		RULE_if_sentence = 4, RULE_else_sentence = 5, RULE_condition = 6, RULE_expr = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "file", "body", "elif_sentence", "if_sentence", "else_sentence", 
			"condition", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'void'", "'main'", "'('", "')'", "'{'", "'}'", "'printf'", "'int'", 
			"'if'", "'else'", "'*'", "'/'", "'+'", "'-'", "'='", "';'", "'=='", "'!='", 
			"'>'", "'<'", "'>='", "'<='", "'&&'", "'||'", "'true'", "'false'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "VOID", "MAIN", "PO", "PC", "KO", "KC", "PRINTF", "INT", "IF", 
			"ELSE", "MULT", "DIV", "SUM", "SUB", "ASSIGN", "SCOL", "EQT", "NEQT", 
			"GT", "LT", "GEQT", "LEQT", "AND", "OR", "TRUE", "FALSE", "NOT", "NUM", 
			"ID", "LINECOM", "MULTILINECOM", "WS"
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

	@Override
	public String getGrammarFileName() { return "Lenguaje.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LenguajeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public FileContext file() {
			return getRuleContext(FileContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			file();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileContext extends ParserRuleContext {
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
	 
		public FileContext() { }
		public void copyFrom(FileContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArchivoContext extends FileContext {
		public TerminalNode VOID() { return getToken(LenguajeParser.VOID, 0); }
		public TerminalNode MAIN() { return getToken(LenguajeParser.MAIN, 0); }
		public TerminalNode PO() { return getToken(LenguajeParser.PO, 0); }
		public TerminalNode PC() { return getToken(LenguajeParser.PC, 0); }
		public TerminalNode KO() { return getToken(LenguajeParser.KO, 0); }
		public TerminalNode KC() { return getToken(LenguajeParser.KC, 0); }
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public ArchivoContext(FileContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitArchivo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_file);
		int _la;
		try {
			_localctx = new ArchivoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(VOID);
			setState(19);
			match(MAIN);
			setState(20);
			match(PO);
			setState(21);
			match(PC);
			setState(22);
			match(KO);
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINTF) | (1L << INT) | (1L << IF) | (1L << ID))) != 0)) {
				{
				{
				setState(23);
				body();
				}
				}
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(29);
			match(KC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyContext extends ParserRuleContext {
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
	 
		public BodyContext() { }
		public void copyFrom(BodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AsignacionContext extends BodyContext {
		public TerminalNode ID() { return getToken(LenguajeParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(LenguajeParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(LenguajeParser.SCOL, 0); }
		public AsignacionContext(BodyContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclaracionContext extends BodyContext {
		public TerminalNode INT() { return getToken(LenguajeParser.INT, 0); }
		public TerminalNode ID() { return getToken(LenguajeParser.ID, 0); }
		public TerminalNode SCOL() { return getToken(LenguajeParser.SCOL, 0); }
		public DeclaracionContext(BodyContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ImpresionContext extends BodyContext {
		public TerminalNode PRINTF() { return getToken(LenguajeParser.PRINTF, 0); }
		public TerminalNode PO() { return getToken(LenguajeParser.PO, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PC() { return getToken(LenguajeParser.PC, 0); }
		public TerminalNode SCOL() { return getToken(LenguajeParser.SCOL, 0); }
		public ImpresionContext(BodyContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitImpresion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfElseContext extends BodyContext {
		public If_sentenceContext if_sentence() {
			return getRuleContext(If_sentenceContext.class,0);
		}
		public Elif_sentenceContext elif_sentence() {
			return getRuleContext(Elif_sentenceContext.class,0);
		}
		public Else_sentenceContext else_sentence() {
			return getRuleContext(Else_sentenceContext.class,0);
		}
		public IfElseContext(BodyContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitIfElse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AsigDeclarContext extends BodyContext {
		public TerminalNode INT() { return getToken(LenguajeParser.INT, 0); }
		public TerminalNode ID() { return getToken(LenguajeParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(LenguajeParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(LenguajeParser.SCOL, 0); }
		public AsigDeclarContext(BodyContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitAsigDeclar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_body);
		try {
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new ImpresionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				match(PRINTF);
				setState(32);
				match(PO);
				setState(33);
				expr(0);
				setState(34);
				match(PC);
				setState(35);
				match(SCOL);
				}
				break;
			case 2:
				_localctx = new IfElseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				if_sentence();
				setState(40);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(38);
					elif_sentence();
					}
					break;
				case 2:
					{
					setState(39);
					else_sentence();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new AsigDeclarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				match(INT);
				setState(43);
				match(ID);
				setState(44);
				match(ASSIGN);
				setState(45);
				expr(0);
				setState(46);
				match(SCOL);
				}
				break;
			case 4:
				_localctx = new DeclaracionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(48);
				match(INT);
				setState(49);
				match(ID);
				setState(50);
				match(SCOL);
				}
				break;
			case 5:
				_localctx = new AsignacionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(51);
				match(ID);
				setState(52);
				match(ASSIGN);
				setState(53);
				expr(0);
				setState(54);
				match(SCOL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Elif_sentenceContext extends ParserRuleContext {
		public Elif_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elif_sentence; }
	 
		public Elif_sentenceContext() { }
		public void copyFrom(Elif_sentenceContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SentenciaElifContext extends Elif_sentenceContext {
		public TerminalNode ELSE() { return getToken(LenguajeParser.ELSE, 0); }
		public If_sentenceContext if_sentence() {
			return getRuleContext(If_sentenceContext.class,0);
		}
		public Elif_sentenceContext elif_sentence() {
			return getRuleContext(Elif_sentenceContext.class,0);
		}
		public Else_sentenceContext else_sentence() {
			return getRuleContext(Else_sentenceContext.class,0);
		}
		public SentenciaElifContext(Elif_sentenceContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitSentenciaElif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elif_sentenceContext elif_sentence() throws RecognitionException {
		Elif_sentenceContext _localctx = new Elif_sentenceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_elif_sentence);
		try {
			_localctx = new SentenciaElifContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(ELSE);
			setState(59);
			if_sentence();
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(60);
				elif_sentence();
				}
				break;
			case 2:
				{
				setState(61);
				else_sentence();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_sentenceContext extends ParserRuleContext {
		public If_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_sentence; }
	 
		public If_sentenceContext() { }
		public void copyFrom(If_sentenceContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SentenceIfContext extends If_sentenceContext {
		public TerminalNode IF() { return getToken(LenguajeParser.IF, 0); }
		public TerminalNode PO() { return getToken(LenguajeParser.PO, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode PC() { return getToken(LenguajeParser.PC, 0); }
		public TerminalNode KO() { return getToken(LenguajeParser.KO, 0); }
		public TerminalNode KC() { return getToken(LenguajeParser.KC, 0); }
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public SentenceIfContext(If_sentenceContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitSentenceIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_sentenceContext if_sentence() throws RecognitionException {
		If_sentenceContext _localctx = new If_sentenceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_if_sentence);
		int _la;
		try {
			_localctx = new SentenceIfContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(IF);
			setState(65);
			match(PO);
			setState(66);
			condition(0);
			setState(67);
			match(PC);
			setState(68);
			match(KO);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINTF) | (1L << INT) | (1L << IF) | (1L << ID))) != 0)) {
				{
				{
				setState(69);
				body();
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
			match(KC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_sentenceContext extends ParserRuleContext {
		public Else_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_sentence; }
	 
		public Else_sentenceContext() { }
		public void copyFrom(Else_sentenceContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SentenciaElseContext extends Else_sentenceContext {
		public TerminalNode ELSE() { return getToken(LenguajeParser.ELSE, 0); }
		public TerminalNode KO() { return getToken(LenguajeParser.KO, 0); }
		public TerminalNode KC() { return getToken(LenguajeParser.KC, 0); }
		public List<BodyContext> body() {
			return getRuleContexts(BodyContext.class);
		}
		public BodyContext body(int i) {
			return getRuleContext(BodyContext.class,i);
		}
		public SentenciaElseContext(Else_sentenceContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitSentenciaElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_sentenceContext else_sentence() throws RecognitionException {
		Else_sentenceContext _localctx = new Else_sentenceContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_else_sentence);
		int _la;
		try {
			_localctx = new SentenciaElseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(ELSE);
			setState(78);
			match(KO);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINTF) | (1L << INT) | (1L << IF) | (1L << ID))) != 0)) {
				{
				{
				setState(79);
				body();
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(85);
			match(KC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpresionContext extends ConditionContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExpresionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondicionNegacionContext extends ConditionContext {
		public TerminalNode NOT() { return getToken(LenguajeParser.NOT, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public CondicionNegacionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitCondicionNegacion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondicionParentesisContext extends ConditionContext {
		public TerminalNode PO() { return getToken(LenguajeParser.PO, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode PC() { return getToken(LenguajeParser.PC, 0); }
		public CondicionParentesisContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitCondicionParentesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalsoContext extends ConditionContext {
		public TerminalNode FALSE() { return getToken(LenguajeParser.FALSE, 0); }
		public FalsoContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitFalso(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondicionesIgualdadContext extends ConditionContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode EQT() { return getToken(LenguajeParser.EQT, 0); }
		public TerminalNode NEQT() { return getToken(LenguajeParser.NEQT, 0); }
		public CondicionesIgualdadContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitCondicionesIgualdad(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondicionOContext extends ConditionContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode OR() { return getToken(LenguajeParser.OR, 0); }
		public CondicionOContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitCondicionO(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondicionYContext extends ConditionContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode AND() { return getToken(LenguajeParser.AND, 0); }
		public CondicionYContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitCondicionY(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VerdaderoContext extends ConditionContext {
		public TerminalNode TRUE() { return getToken(LenguajeParser.TRUE, 0); }
		public VerdaderoContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitVerdadero(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondicionesRelacionalContext extends ConditionContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode GT() { return getToken(LenguajeParser.GT, 0); }
		public TerminalNode LT() { return getToken(LenguajeParser.LT, 0); }
		public TerminalNode GEQT() { return getToken(LenguajeParser.GEQT, 0); }
		public TerminalNode LEQT() { return getToken(LenguajeParser.LEQT, 0); }
		public CondicionesRelacionalContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitCondicionesRelacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_condition, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				_localctx = new CondicionNegacionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(88);
				match(NOT);
				setState(89);
				condition(9);
				}
				break;
			case 2:
				{
				_localctx = new VerdaderoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(90);
				match(TRUE);
				}
				break;
			case 3:
				{
				_localctx = new FalsoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(91);
				match(FALSE);
				}
				break;
			case 4:
				{
				_localctx = new CondicionParentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(92);
				match(PO);
				setState(93);
				condition(0);
				setState(94);
				match(PC);
				}
				break;
			case 5:
				{
				_localctx = new ExpresionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(96);
				expr(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(111);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new CondicionesIgualdadContext(new ConditionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(99);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(100);
						_la = _input.LA(1);
						if ( !(_la==EQT || _la==NEQT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(101);
						condition(9);
						}
						break;
					case 2:
						{
						_localctx = new CondicionesRelacionalContext(new ConditionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(102);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(103);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GEQT) | (1L << LEQT))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(104);
						condition(8);
						}
						break;
					case 3:
						{
						_localctx = new CondicionYContext(new ConditionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(105);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(106);
						match(AND);
						setState(107);
						condition(7);
						}
						break;
					case 4:
						{
						_localctx = new CondicionOContext(new ConditionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(108);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(109);
						match(OR);
						setState(110);
						condition(6);
						}
						break;
					}
					} 
				}
				setState(115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParentesisContext extends ExprContext {
		public TerminalNode PO() { return getToken(LenguajeParser.PO, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PC() { return getToken(LenguajeParser.PC, 0); }
		public ParentesisContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitParentesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultDivContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULT() { return getToken(LenguajeParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(LenguajeParser.DIV, 0); }
		public MultDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitMultDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SumSubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SUM() { return getToken(LenguajeParser.SUM, 0); }
		public TerminalNode SUB() { return getToken(LenguajeParser.SUB, 0); }
		public SumSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitSumSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumContext extends ExprContext {
		public TerminalNode NUM() { return getToken(LenguajeParser.NUM, 0); }
		public TerminalNode SUB() { return getToken(LenguajeParser.SUB, 0); }
		public NumContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends ExprContext {
		public TerminalNode ID() { return getToken(LenguajeParser.ID, 0); }
		public IdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LenguajeVisitor ) return ((LenguajeVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUB:
			case NUM:
				{
				_localctx = new NumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(117);
					match(SUB);
					}
				}

				setState(120);
				match(NUM);
				}
				break;
			case ID:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(121);
				match(ID);
				}
				break;
			case PO:
				{
				_localctx = new ParentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(122);
				match(PO);
				setState(123);
				expr(0);
				setState(124);
				match(PC);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(136);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(134);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(128);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(129);
						((MultDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIV) ) {
							((MultDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(130);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new SumSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(131);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(132);
						((SumSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==SUM || _la==SUB) ) {
							((SumSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(133);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(138);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		case 7:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u008e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\7\3\33\n\3\f\3\16\3\36\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4+\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4;\n\4\3\5\3\5\3\5\3\5\5\5A\n\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\7\6I\n\6\f\6\16\6L\13\6\3\6\3\6\3\7\3\7\3\7\7\7S\n\7\f\7\16\7V\13\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bd\n\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\br\n\b\f\b\16\bu\13\b\3\t\3\t\5"+
		"\ty\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0081\n\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\7\t\u0089\n\t\f\t\16\t\u008c\13\t\3\t\2\4\16\20\n\2\4\6\b\n\f\16\20\2"+
		"\6\3\2\23\24\3\2\25\30\3\2\r\16\3\2\17\20\2\u009d\2\22\3\2\2\2\4\24\3"+
		"\2\2\2\6:\3\2\2\2\b<\3\2\2\2\nB\3\2\2\2\fO\3\2\2\2\16c\3\2\2\2\20\u0080"+
		"\3\2\2\2\22\23\5\4\3\2\23\3\3\2\2\2\24\25\7\3\2\2\25\26\7\4\2\2\26\27"+
		"\7\5\2\2\27\30\7\6\2\2\30\34\7\7\2\2\31\33\5\6\4\2\32\31\3\2\2\2\33\36"+
		"\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\37\3\2\2\2\36\34\3\2\2\2\37 \7"+
		"\b\2\2 \5\3\2\2\2!\"\7\t\2\2\"#\7\5\2\2#$\5\20\t\2$%\7\6\2\2%&\7\22\2"+
		"\2&;\3\2\2\2\'*\5\n\6\2(+\5\b\5\2)+\5\f\7\2*(\3\2\2\2*)\3\2\2\2*+\3\2"+
		"\2\2+;\3\2\2\2,-\7\n\2\2-.\7\37\2\2./\7\21\2\2/\60\5\20\t\2\60\61\7\22"+
		"\2\2\61;\3\2\2\2\62\63\7\n\2\2\63\64\7\37\2\2\64;\7\22\2\2\65\66\7\37"+
		"\2\2\66\67\7\21\2\2\678\5\20\t\289\7\22\2\29;\3\2\2\2:!\3\2\2\2:\'\3\2"+
		"\2\2:,\3\2\2\2:\62\3\2\2\2:\65\3\2\2\2;\7\3\2\2\2<=\7\f\2\2=@\5\n\6\2"+
		">A\5\b\5\2?A\5\f\7\2@>\3\2\2\2@?\3\2\2\2@A\3\2\2\2A\t\3\2\2\2BC\7\13\2"+
		"\2CD\7\5\2\2DE\5\16\b\2EF\7\6\2\2FJ\7\7\2\2GI\5\6\4\2HG\3\2\2\2IL\3\2"+
		"\2\2JH\3\2\2\2JK\3\2\2\2KM\3\2\2\2LJ\3\2\2\2MN\7\b\2\2N\13\3\2\2\2OP\7"+
		"\f\2\2PT\7\7\2\2QS\5\6\4\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3"+
		"\2\2\2VT\3\2\2\2WX\7\b\2\2X\r\3\2\2\2YZ\b\b\1\2Z[\7\35\2\2[d\5\16\b\13"+
		"\\d\7\33\2\2]d\7\34\2\2^_\7\5\2\2_`\5\16\b\2`a\7\6\2\2ad\3\2\2\2bd\5\20"+
		"\t\2cY\3\2\2\2c\\\3\2\2\2c]\3\2\2\2c^\3\2\2\2cb\3\2\2\2ds\3\2\2\2ef\f"+
		"\n\2\2fg\t\2\2\2gr\5\16\b\13hi\f\t\2\2ij\t\3\2\2jr\5\16\b\nkl\f\b\2\2"+
		"lm\7\31\2\2mr\5\16\b\tno\f\7\2\2op\7\32\2\2pr\5\16\b\bqe\3\2\2\2qh\3\2"+
		"\2\2qk\3\2\2\2qn\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t\17\3\2\2\2us\3"+
		"\2\2\2vx\b\t\1\2wy\7\20\2\2xw\3\2\2\2xy\3\2\2\2yz\3\2\2\2z\u0081\7\36"+
		"\2\2{\u0081\7\37\2\2|}\7\5\2\2}~\5\20\t\2~\177\7\6\2\2\177\u0081\3\2\2"+
		"\2\u0080v\3\2\2\2\u0080{\3\2\2\2\u0080|\3\2\2\2\u0081\u008a\3\2\2\2\u0082"+
		"\u0083\f\7\2\2\u0083\u0084\t\4\2\2\u0084\u0089\5\20\t\b\u0085\u0086\f"+
		"\6\2\2\u0086\u0087\t\5\2\2\u0087\u0089\5\20\t\7\u0088\u0082\3\2\2\2\u0088"+
		"\u0085\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2"+
		"\2\2\u008b\21\3\2\2\2\u008c\u008a\3\2\2\2\17\34*:@JTcqsx\u0080\u0088\u008a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
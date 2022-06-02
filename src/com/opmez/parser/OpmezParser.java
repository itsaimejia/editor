// Generated from .\Opmez.g4 by ANTLR 4.9.2
package com.opmez.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OpmezParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_instructions = 1, RULE_elif_sentence = 2, RULE_elif_frag_condition = 3, 
		RULE_if_sentence = 4, RULE_else_sentence = 5, RULE_body = 6, RULE_condition = 7, 
		RULE_string = 8, RULE_expr = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "instructions", "elif_sentence", "elif_frag_condition", "if_sentence", 
			"else_sentence", "body", "condition", "string", "expr"
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

	@Override
	public String getGrammarFileName() { return "Opmez.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public OpmezParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	 
		public ProgramContext() { }
		public void copyFrom(ProgramContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CuerpoContext extends ProgramContext {
		public TerminalNode DEFINEFUNC() { return getToken(OpmezParser.DEFINEFUNC, 0); }
		public TerminalNode INITIAL() { return getToken(OpmezParser.INITIAL, 0); }
		public TerminalNode PO() { return getToken(OpmezParser.PO, 0); }
		public TerminalNode PC() { return getToken(OpmezParser.PC, 0); }
		public TerminalNode KO() { return getToken(OpmezParser.KO, 0); }
		public TerminalNode KC() { return getToken(OpmezParser.KC, 0); }
		public List<InstructionsContext> instructions() {
			return getRuleContexts(InstructionsContext.class);
		}
		public InstructionsContext instructions(int i) {
			return getRuleContext(InstructionsContext.class,i);
		}
		public CuerpoContext(ProgramContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitCuerpo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			_localctx = new CuerpoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(DEFINEFUNC);
			setState(21);
			match(INITIAL);
			setState(22);
			match(PO);
			setState(23);
			match(PC);
			setState(24);
			match(KO);
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IF) | (1L << PRINT) | (1L << DECLARE) | (1L << ID))) != 0)) {
				{
				{
				setState(25);
				instructions();
				}
				}
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(31);
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

	public static class InstructionsContext extends ParserRuleContext {
		public InstructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructions; }
	 
		public InstructionsContext() { }
		public void copyFrom(InstructionsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AsignacionContext extends InstructionsContext {
		public TerminalNode ID() { return getToken(OpmezParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(OpmezParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(OpmezParser.SCOL, 0); }
		public AsignacionContext(InstructionsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CicleContext extends InstructionsContext {
		public TerminalNode PO() { return getToken(OpmezParser.PO, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode PC() { return getToken(OpmezParser.PC, 0); }
		public TerminalNode KO() { return getToken(OpmezParser.KO, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode KC() { return getToken(OpmezParser.KC, 0); }
		public CicleContext(InstructionsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitCicle(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclaracionContext extends InstructionsContext {
		public TerminalNode DECLARE() { return getToken(OpmezParser.DECLARE, 0); }
		public TerminalNode ID() { return getToken(OpmezParser.ID, 0); }
		public TerminalNode SCOL() { return getToken(OpmezParser.SCOL, 0); }
		public DeclaracionContext(InstructionsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ImpresionStringContext extends InstructionsContext {
		public TerminalNode PRINT() { return getToken(OpmezParser.PRINT, 0); }
		public TerminalNode PO() { return getToken(OpmezParser.PO, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode PC() { return getToken(OpmezParser.PC, 0); }
		public TerminalNode SCOL() { return getToken(OpmezParser.SCOL, 0); }
		public ImpresionStringContext(InstructionsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitImpresionString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ImpresionExprContext extends InstructionsContext {
		public TerminalNode PRINT() { return getToken(OpmezParser.PRINT, 0); }
		public TerminalNode PO() { return getToken(OpmezParser.PO, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PC() { return getToken(OpmezParser.PC, 0); }
		public TerminalNode SCOL() { return getToken(OpmezParser.SCOL, 0); }
		public ImpresionExprContext(InstructionsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitImpresionExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfElseContext extends InstructionsContext {
		public If_sentenceContext if_sentence() {
			return getRuleContext(If_sentenceContext.class,0);
		}
		public Elif_sentenceContext elif_sentence() {
			return getRuleContext(Elif_sentenceContext.class,0);
		}
		public Else_sentenceContext else_sentence() {
			return getRuleContext(Else_sentenceContext.class,0);
		}
		public IfElseContext(InstructionsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitIfElse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AsigDeclarContext extends InstructionsContext {
		public TerminalNode DECLARE() { return getToken(OpmezParser.DECLARE, 0); }
		public TerminalNode ID() { return getToken(OpmezParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(OpmezParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(OpmezParser.SCOL, 0); }
		public AsigDeclarContext(InstructionsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitAsigDeclar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionsContext instructions() throws RecognitionException {
		InstructionsContext _localctx = new InstructionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instructions);
		try {
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new ImpresionExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				match(PRINT);
				setState(34);
				match(PO);
				setState(35);
				expr(0);
				setState(36);
				match(PC);
				setState(37);
				match(SCOL);
				}
				break;
			case 2:
				_localctx = new ImpresionStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				match(PRINT);
				setState(40);
				match(PO);
				setState(41);
				string();
				setState(42);
				match(PC);
				setState(43);
				match(SCOL);
				}
				break;
			case 3:
				_localctx = new IfElseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				if_sentence();
				setState(48);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ELIF:
					{
					setState(46);
					elif_sentence();
					}
					break;
				case ELSE:
					{
					setState(47);
					else_sentence();
					}
					break;
				case T__0:
				case KC:
				case IF:
				case PRINT:
				case DECLARE:
				case ID:
					break;
				default:
					break;
				}
				}
				break;
			case 4:
				_localctx = new DeclaracionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(50);
				match(DECLARE);
				setState(51);
				match(ID);
				setState(52);
				match(SCOL);
				}
				break;
			case 5:
				_localctx = new AsignacionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(53);
				match(ID);
				setState(54);
				match(ASSIGN);
				setState(55);
				expr(0);
				setState(56);
				match(SCOL);
				}
				break;
			case 6:
				_localctx = new AsigDeclarContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(58);
				match(DECLARE);
				setState(59);
				match(ID);
				setState(60);
				match(ASSIGN);
				setState(61);
				expr(0);
				setState(62);
				match(SCOL);
				}
				break;
			case 7:
				_localctx = new CicleContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(64);
				match(T__0);
				setState(65);
				match(PO);
				setState(66);
				condition(0);
				setState(67);
				match(PC);
				setState(68);
				match(KO);
				setState(69);
				body();
				setState(70);
				match(KC);
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
		public Elif_frag_conditionContext elif_frag_condition() {
			return getRuleContext(Elif_frag_conditionContext.class,0);
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
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitSentenciaElif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elif_sentenceContext elif_sentence() throws RecognitionException {
		Elif_sentenceContext _localctx = new Elif_sentenceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_elif_sentence);
		try {
			_localctx = new SentenciaElifContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			elif_frag_condition();
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELIF:
				{
				setState(75);
				elif_sentence();
				}
				break;
			case ELSE:
				{
				setState(76);
				else_sentence();
				}
				break;
			case T__0:
			case KC:
			case IF:
			case PRINT:
			case DECLARE:
			case ID:
				break;
			default:
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

	public static class Elif_frag_conditionContext extends ParserRuleContext {
		public Elif_frag_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elif_frag_condition; }
	 
		public Elif_frag_conditionContext() { }
		public void copyFrom(Elif_frag_conditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CondicionElifContext extends Elif_frag_conditionContext {
		public TerminalNode ELIF() { return getToken(OpmezParser.ELIF, 0); }
		public TerminalNode PO() { return getToken(OpmezParser.PO, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode PC() { return getToken(OpmezParser.PC, 0); }
		public TerminalNode KO() { return getToken(OpmezParser.KO, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode KC() { return getToken(OpmezParser.KC, 0); }
		public CondicionElifContext(Elif_frag_conditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitCondicionElif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elif_frag_conditionContext elif_frag_condition() throws RecognitionException {
		Elif_frag_conditionContext _localctx = new Elif_frag_conditionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_elif_frag_condition);
		try {
			_localctx = new CondicionElifContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(ELIF);
			setState(80);
			match(PO);
			setState(81);
			condition(0);
			setState(82);
			match(PC);
			setState(83);
			match(KO);
			setState(84);
			body();
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
	public static class SentenciaIfContext extends If_sentenceContext {
		public TerminalNode IF() { return getToken(OpmezParser.IF, 0); }
		public TerminalNode PO() { return getToken(OpmezParser.PO, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode PC() { return getToken(OpmezParser.PC, 0); }
		public TerminalNode KO() { return getToken(OpmezParser.KO, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode KC() { return getToken(OpmezParser.KC, 0); }
		public SentenciaIfContext(If_sentenceContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitSentenciaIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_sentenceContext if_sentence() throws RecognitionException {
		If_sentenceContext _localctx = new If_sentenceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_if_sentence);
		try {
			_localctx = new SentenciaIfContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(IF);
			setState(88);
			match(PO);
			setState(89);
			condition(0);
			setState(90);
			match(PC);
			setState(91);
			match(KO);
			setState(92);
			body();
			setState(93);
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
		public TerminalNode ELSE() { return getToken(OpmezParser.ELSE, 0); }
		public TerminalNode KO() { return getToken(OpmezParser.KO, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode KC() { return getToken(OpmezParser.KC, 0); }
		public SentenciaElseContext(Else_sentenceContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitSentenciaElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_sentenceContext else_sentence() throws RecognitionException {
		Else_sentenceContext _localctx = new Else_sentenceContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_else_sentence);
		try {
			_localctx = new SentenciaElseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(ELSE);
			setState(96);
			match(KO);
			setState(97);
			body();
			setState(98);
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
	public static class CuerpoScopeContext extends BodyContext {
		public List<InstructionsContext> instructions() {
			return getRuleContexts(InstructionsContext.class);
		}
		public InstructionsContext instructions(int i) {
			return getRuleContext(InstructionsContext.class,i);
		}
		public CuerpoScopeContext(BodyContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitCuerpoScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_body);
		int _la;
		try {
			_localctx = new CuerpoScopeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << IF) | (1L << PRINT) | (1L << DECLARE) | (1L << ID))) != 0)) {
				{
				{
				setState(100);
				instructions();
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondicionNegacionContext extends ConditionContext {
		public TerminalNode NOT() { return getToken(OpmezParser.NOT, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public CondicionNegacionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitCondicionNegacion(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondicionParentesisContext extends ConditionContext {
		public TerminalNode PO() { return getToken(OpmezParser.PO, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode PC() { return getToken(OpmezParser.PC, 0); }
		public CondicionParentesisContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitCondicionParentesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondicionesMayMenContext extends ConditionContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode GT() { return getToken(OpmezParser.GT, 0); }
		public TerminalNode LT() { return getToken(OpmezParser.LT, 0); }
		public CondicionesMayMenContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitCondicionesMayMen(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalsoContext extends ConditionContext {
		public TerminalNode FALSE() { return getToken(OpmezParser.FALSE, 0); }
		public FalsoContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitFalso(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondicionesIgualdadContext extends ConditionContext {
		public Token op;
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode EQT() { return getToken(OpmezParser.EQT, 0); }
		public TerminalNode NEQT() { return getToken(OpmezParser.NEQT, 0); }
		public CondicionesIgualdadContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitCondicionesIgualdad(this);
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
		public TerminalNode OR() { return getToken(OpmezParser.OR, 0); }
		public CondicionOContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitCondicionO(this);
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
		public TerminalNode AND() { return getToken(OpmezParser.AND, 0); }
		public CondicionYContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitCondicionY(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondicionesIgualdadExprContext extends ConditionContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQT() { return getToken(OpmezParser.EQT, 0); }
		public TerminalNode NEQT() { return getToken(OpmezParser.NEQT, 0); }
		public CondicionesIgualdadExprContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitCondicionesIgualdadExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CondicionesMayMenIgualContext extends ConditionContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode GEQT() { return getToken(OpmezParser.GEQT, 0); }
		public TerminalNode LEQT() { return getToken(OpmezParser.LEQT, 0); }
		public CondicionesMayMenIgualContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitCondicionesMayMenIgual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VerdaderoContext extends ConditionContext {
		public TerminalNode TRUE() { return getToken(OpmezParser.TRUE, 0); }
		public VerdaderoContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitVerdadero(this);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_condition, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				_localctx = new CondicionNegacionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(107);
				match(NOT);
				setState(108);
				condition(11);
				}
				break;
			case 2:
				{
				_localctx = new CondicionesIgualdadExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(109);
				expr(0);
				setState(110);
				((CondicionesIgualdadExprContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==EQT || _la==NEQT) ) {
					((CondicionesIgualdadExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(111);
				expr(0);
				}
				break;
			case 3:
				{
				_localctx = new CondicionesMayMenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(113);
				expr(0);
				setState(114);
				((CondicionesMayMenContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==GT || _la==LT) ) {
					((CondicionesMayMenContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(115);
				expr(0);
				}
				break;
			case 4:
				{
				_localctx = new CondicionesMayMenIgualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(117);
				expr(0);
				setState(118);
				((CondicionesMayMenIgualContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==GEQT || _la==LEQT) ) {
					((CondicionesMayMenIgualContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(119);
				expr(0);
				}
				break;
			case 5:
				{
				_localctx = new CondicionParentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(121);
				match(PO);
				setState(122);
				condition(0);
				setState(123);
				match(PC);
				}
				break;
			case 6:
				{
				_localctx = new VerdaderoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(125);
				match(TRUE);
				}
				break;
			case 7:
				{
				_localctx = new FalsoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(126);
				match(FALSE);
				}
				break;
			case 8:
				{
				_localctx = new ExpresionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(127);
				expr(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(141);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(139);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new CondicionesIgualdadContext(new ConditionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(130);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(131);
						((CondicionesIgualdadContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQT || _la==NEQT) ) {
							((CondicionesIgualdadContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(132);
						condition(10);
						}
						break;
					case 2:
						{
						_localctx = new CondicionYContext(new ConditionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(133);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(134);
						match(AND);
						setState(135);
						condition(7);
						}
						break;
					case 3:
						{
						_localctx = new CondicionOContext(new ConditionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(136);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(137);
						match(OR);
						setState(138);
						condition(6);
						}
						break;
					}
					} 
				}
				setState(143);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class StringContext extends ParserRuleContext {
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	 
		public StringContext() { }
		public void copyFrom(StringContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CadenaTextoContext extends StringContext {
		public TerminalNode STRING() { return getToken(OpmezParser.STRING, 0); }
		public CadenaTextoContext(StringContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitCadenaTexto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_string);
		try {
			_localctx = new CadenaTextoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(STRING);
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
		public TerminalNode PO() { return getToken(OpmezParser.PO, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PC() { return getToken(OpmezParser.PC, 0); }
		public ParentesisContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitParentesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumeroContext extends ExprContext {
		public TerminalNode INT() { return getToken(OpmezParser.INT, 0); }
		public TerminalNode SUB() { return getToken(OpmezParser.SUB, 0); }
		public NumeroContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitNumero(this);
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
		public TerminalNode MULT() { return getToken(OpmezParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(OpmezParser.DIV, 0); }
		public MultDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitMultDiv(this);
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
		public TerminalNode SUM() { return getToken(OpmezParser.SUM, 0); }
		public TerminalNode SUB() { return getToken(OpmezParser.SUB, 0); }
		public SumSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitSumSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends ExprContext {
		public TerminalNode ID() { return getToken(OpmezParser.ID, 0); }
		public TerminalNode SUB() { return getToken(OpmezParser.SUB, 0); }
		public IdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitId(this);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				_localctx = new NumeroContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(147);
					match(SUB);
					}
				}

				setState(150);
				match(INT);
				}
				break;
			case 2:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(151);
					match(SUB);
					}
				}

				setState(154);
				match(ID);
				}
				break;
			case 3:
				{
				_localctx = new ParentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(155);
				match(PO);
				setState(156);
				expr(0);
				setState(157);
				match(PC);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(167);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(161);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(162);
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
						setState(163);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new SumSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(164);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(165);
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
						setState(166);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(171);
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
		case 7:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		case 9:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u00af\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\2\3\2\3\2\3\2\7\2\35\n\2\f\2\16\2 \13\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\63\n\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3K\n\3\3\4\3\4\3\4\5\4P\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\7\bh\n\b"+
		"\f\b\16\bk\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0083\n\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\7\t\u008e\n\t\f\t\16\t\u0091\13\t\3\n\3\n\3\13\3\13\5\13"+
		"\u0097\n\13\3\13\3\13\5\13\u009b\n\13\3\13\3\13\3\13\3\13\3\13\5\13\u00a2"+
		"\n\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00aa\n\13\f\13\16\13\u00ad\13"+
		"\13\3\13\2\4\20\24\f\2\4\6\b\n\f\16\20\22\24\2\7\3\2\22\23\3\2\24\25\3"+
		"\2\26\27\3\2\35\36\3\2\37 \2\u00c0\2\26\3\2\2\2\4J\3\2\2\2\6L\3\2\2\2"+
		"\bQ\3\2\2\2\nY\3\2\2\2\fa\3\2\2\2\16i\3\2\2\2\20\u0082\3\2\2\2\22\u0092"+
		"\3\2\2\2\24\u00a1\3\2\2\2\26\27\7\4\2\2\27\30\7\5\2\2\30\31\7\b\2\2\31"+
		"\32\7\t\2\2\32\36\7\6\2\2\33\35\5\4\3\2\34\33\3\2\2\2\35 \3\2\2\2\36\34"+
		"\3\2\2\2\36\37\3\2\2\2\37!\3\2\2\2 \36\3\2\2\2!\"\7\7\2\2\"\3\3\2\2\2"+
		"#$\7\20\2\2$%\7\b\2\2%&\5\24\13\2&\'\7\t\2\2\'(\7\16\2\2(K\3\2\2\2)*\7"+
		"\20\2\2*+\7\b\2\2+,\5\22\n\2,-\7\t\2\2-.\7\16\2\2.K\3\2\2\2/\62\5\n\6"+
		"\2\60\63\5\6\4\2\61\63\5\f\7\2\62\60\3\2\2\2\62\61\3\2\2\2\62\63\3\2\2"+
		"\2\63K\3\2\2\2\64\65\7\21\2\2\65\66\7#\2\2\66K\7\16\2\2\678\7#\2\289\7"+
		"\17\2\29:\5\24\13\2:;\7\16\2\2;K\3\2\2\2<=\7\21\2\2=>\7#\2\2>?\7\17\2"+
		"\2?@\5\24\13\2@A\7\16\2\2AK\3\2\2\2BC\7\3\2\2CD\7\b\2\2DE\5\20\t\2EF\7"+
		"\t\2\2FG\7\6\2\2GH\5\16\b\2HI\7\7\2\2IK\3\2\2\2J#\3\2\2\2J)\3\2\2\2J/"+
		"\3\2\2\2J\64\3\2\2\2J\67\3\2\2\2J<\3\2\2\2JB\3\2\2\2K\5\3\2\2\2LO\5\b"+
		"\5\2MP\5\6\4\2NP\5\f\7\2OM\3\2\2\2ON\3\2\2\2OP\3\2\2\2P\7\3\2\2\2QR\7"+
		"\f\2\2RS\7\b\2\2ST\5\20\t\2TU\7\t\2\2UV\7\6\2\2VW\5\16\b\2WX\7\7\2\2X"+
		"\t\3\2\2\2YZ\7\n\2\2Z[\7\b\2\2[\\\5\20\t\2\\]\7\t\2\2]^\7\6\2\2^_\5\16"+
		"\b\2_`\7\7\2\2`\13\3\2\2\2ab\7\13\2\2bc\7\6\2\2cd\5\16\b\2de\7\7\2\2e"+
		"\r\3\2\2\2fh\5\4\3\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2j\17\3\2\2"+
		"\2ki\3\2\2\2lm\b\t\1\2mn\7\34\2\2n\u0083\5\20\t\rop\5\24\13\2pq\t\2\2"+
		"\2qr\5\24\13\2r\u0083\3\2\2\2st\5\24\13\2tu\t\3\2\2uv\5\24\13\2v\u0083"+
		"\3\2\2\2wx\5\24\13\2xy\t\4\2\2yz\5\24\13\2z\u0083\3\2\2\2{|\7\b\2\2|}"+
		"\5\20\t\2}~\7\t\2\2~\u0083\3\2\2\2\177\u0083\7\32\2\2\u0080\u0083\7\33"+
		"\2\2\u0081\u0083\5\24\13\2\u0082l\3\2\2\2\u0082o\3\2\2\2\u0082s\3\2\2"+
		"\2\u0082w\3\2\2\2\u0082{\3\2\2\2\u0082\177\3\2\2\2\u0082\u0080\3\2\2\2"+
		"\u0082\u0081\3\2\2\2\u0083\u008f\3\2\2\2\u0084\u0085\f\13\2\2\u0085\u0086"+
		"\t\2\2\2\u0086\u008e\5\20\t\f\u0087\u0088\f\b\2\2\u0088\u0089\7\30\2\2"+
		"\u0089\u008e\5\20\t\t\u008a\u008b\f\7\2\2\u008b\u008c\7\31\2\2\u008c\u008e"+
		"\5\20\t\b\u008d\u0084\3\2\2\2\u008d\u0087\3\2\2\2\u008d\u008a\3\2\2\2"+
		"\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\21"+
		"\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0093\7$\2\2\u0093\23\3\2\2\2\u0094"+
		"\u0096\b\13\1\2\u0095\u0097\7 \2\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2"+
		"\2\2\u0097\u0098\3\2\2\2\u0098\u00a2\7!\2\2\u0099\u009b\7 \2\2\u009a\u0099"+
		"\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u00a2\7#\2\2\u009d"+
		"\u009e\7\b\2\2\u009e\u009f\5\24\13\2\u009f\u00a0\7\t\2\2\u00a0\u00a2\3"+
		"\2\2\2\u00a1\u0094\3\2\2\2\u00a1\u009a\3\2\2\2\u00a1\u009d\3\2\2\2\u00a2"+
		"\u00ab\3\2\2\2\u00a3\u00a4\f\7\2\2\u00a4\u00a5\t\5\2\2\u00a5\u00aa\5\24"+
		"\13\b\u00a6\u00a7\f\6\2\2\u00a7\u00a8\t\6\2\2\u00a8\u00aa\5\24\13\7\u00a9"+
		"\u00a3\3\2\2\2\u00a9\u00a6\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab\u00a9\3\2"+
		"\2\2\u00ab\u00ac\3\2\2\2\u00ac\25\3\2\2\2\u00ad\u00ab\3\2\2\2\17\36\62"+
		"JOi\u0082\u008d\u008f\u0096\u009a\u00a1\u00a9\u00ab";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
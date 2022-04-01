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
		DEFINEFUNC=1, INITIAL=2, KO=3, KC=4, PO=5, PC=6, IF=7, ELSE=8, ELIF=9, 
		SCOL=10, ASSIGN=11, PRINT=12, DECLARE=13, EQT=14, NEQT=15, GT=16, LT=17, 
		GEQT=18, LEQT=19, AND=20, OR=21, TRUE=22, FALSE=23, NOT=24, MULT=25, DIV=26, 
		SUM=27, SUB=28, INT=29, DOUBLE=30, ID=31, LINECOM=32, MULTILINECOM=33, 
		WS=34;
	public static final int
		RULE_program = 0, RULE_instructions = 1, RULE_elif_sentence = 2, RULE_elif_frag_condition = 3, 
		RULE_if_sentence = 4, RULE_else_sentence = 5, RULE_body = 6, RULE_condition = 7, 
		RULE_expr = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "instructions", "elif_sentence", "elif_frag_condition", "if_sentence", 
			"else_sentence", "body", "condition", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'#'", "'initial'", "'->'", "'<-'", "'('", "')'", "'if'", "'else'", 
			"'elif'", "';'", "'='", "'systalk'", "'use'", "'=='", "'!='", "'>'", 
			"'<'", "'>='", "'<='", "'&&'", "'||'", "'true'", "'false'", "'!'", "'*'", 
			"'/'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DEFINEFUNC", "INITIAL", "KO", "KC", "PO", "PC", "IF", "ELSE", 
			"ELIF", "SCOL", "ASSIGN", "PRINT", "DECLARE", "EQT", "NEQT", "GT", "LT", 
			"GEQT", "LEQT", "AND", "OR", "TRUE", "FALSE", "NOT", "MULT", "DIV", "SUM", 
			"SUB", "INT", "DOUBLE", "ID", "LINECOM", "MULTILINECOM", "WS"
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
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode KC() { return getToken(OpmezParser.KC, 0); }
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
		try {
			_localctx = new CuerpoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(DEFINEFUNC);
			setState(19);
			match(INITIAL);
			setState(20);
			match(PO);
			setState(21);
			match(PC);
			setState(22);
			match(KO);
			setState(23);
			body();
			setState(24);
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
	public static class ImpresionContext extends InstructionsContext {
		public TerminalNode PRINT() { return getToken(OpmezParser.PRINT, 0); }
		public TerminalNode PO() { return getToken(OpmezParser.PO, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PC() { return getToken(OpmezParser.PC, 0); }
		public TerminalNode SCOL() { return getToken(OpmezParser.SCOL, 0); }
		public ImpresionContext(InstructionsContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitImpresion(this);
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
			setState(51);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new ImpresionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(26);
				match(PRINT);
				setState(27);
				match(PO);
				setState(28);
				expr(0);
				setState(29);
				match(PC);
				setState(30);
				match(SCOL);
				}
				break;
			case 2:
				_localctx = new IfElseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				if_sentence();
				setState(35);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ELIF:
					{
					setState(33);
					elif_sentence();
					}
					break;
				case ELSE:
					{
					setState(34);
					else_sentence();
					}
					break;
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
			case 3:
				_localctx = new DeclaracionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				match(DECLARE);
				setState(38);
				match(ID);
				setState(39);
				match(SCOL);
				}
				break;
			case 4:
				_localctx = new AsignacionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(40);
				match(ID);
				setState(41);
				match(ASSIGN);
				setState(42);
				expr(0);
				setState(43);
				match(SCOL);
				}
				break;
			case 5:
				_localctx = new AsigDeclarContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(45);
				match(DECLARE);
				setState(46);
				match(ID);
				setState(47);
				match(ASSIGN);
				setState(48);
				expr(0);
				setState(49);
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
			setState(53);
			elif_frag_condition();
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELIF:
				{
				setState(54);
				elif_sentence();
				}
				break;
			case ELSE:
				{
				setState(55);
				else_sentence();
				}
				break;
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
			setState(58);
			match(ELIF);
			setState(59);
			match(PO);
			setState(60);
			condition(0);
			setState(61);
			match(PC);
			setState(62);
			match(KO);
			setState(63);
			body();
			setState(64);
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
			setState(66);
			match(IF);
			setState(67);
			match(PO);
			setState(68);
			condition(0);
			setState(69);
			match(PC);
			setState(70);
			match(KO);
			setState(71);
			body();
			setState(72);
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
			setState(74);
			match(ELSE);
			setState(75);
			match(KO);
			setState(76);
			body();
			setState(77);
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
		public List<InstructionsContext> instructions() {
			return getRuleContexts(InstructionsContext.class);
		}
		public InstructionsContext instructions(int i) {
			return getRuleContext(InstructionsContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OpmezVisitor ) return ((OpmezVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << DECLARE) | (1L << ID))) != 0)) {
				{
				{
				setState(79);
				instructions();
				}
				}
				setState(84);
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
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new CondicionNegacionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(86);
				match(NOT);
				setState(87);
				condition(11);
				}
				break;
			case 2:
				{
				_localctx = new CondicionesIgualdadExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(88);
				expr(0);
				setState(89);
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
				setState(90);
				expr(0);
				}
				break;
			case 3:
				{
				_localctx = new CondicionesMayMenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(92);
				expr(0);
				setState(93);
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
				setState(94);
				expr(0);
				}
				break;
			case 4:
				{
				_localctx = new CondicionesMayMenIgualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(96);
				expr(0);
				setState(97);
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
				setState(98);
				expr(0);
				}
				break;
			case 5:
				{
				_localctx = new CondicionParentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(100);
				match(PO);
				setState(101);
				condition(0);
				setState(102);
				match(PC);
				}
				break;
			case 6:
				{
				_localctx = new VerdaderoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(104);
				match(TRUE);
				}
				break;
			case 7:
				{
				_localctx = new FalsoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(105);
				match(FALSE);
				}
				break;
			case 8:
				{
				_localctx = new ExpresionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(106);
				expr(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(118);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new CondicionesIgualdadContext(new ConditionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(109);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(110);
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
						setState(111);
						condition(10);
						}
						break;
					case 2:
						{
						_localctx = new CondicionYContext(new ConditionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(112);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(113);
						match(AND);
						setState(114);
						condition(7);
						}
						break;
					case 3:
						{
						_localctx = new CondicionOContext(new ConditionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(115);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(116);
						match(OR);
						setState(117);
						condition(6);
						}
						break;
					}
					} 
				}
				setState(122);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		public Token op;
		public TerminalNode INT() { return getToken(OpmezParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(OpmezParser.DOUBLE, 0); }
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new NumeroContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(124);
					match(SUB);
					}
				}

				setState(127);
				((NumeroContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==DOUBLE) ) {
					((NumeroContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SUB) {
					{
					setState(128);
					match(SUB);
					}
				}

				setState(131);
				match(ID);
				}
				break;
			case 3:
				{
				_localctx = new ParentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(132);
				match(PO);
				setState(133);
				expr(0);
				setState(134);
				match(PC);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(146);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(144);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(138);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(139);
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
						setState(140);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new SumSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(141);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(142);
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
						setState(143);
						expr(5);
						}
						break;
					}
					} 
				}
				setState(148);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		case 8:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u0098\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3&\n\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\66\n\3\3"+
		"\4\3\4\3\4\5\4;\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\7\bS\n\b\f\b\16\bV\13\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\5\tn\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\ty\n\t\f\t\16"+
		"\t|\13\t\3\n\3\n\5\n\u0080\n\n\3\n\3\n\5\n\u0084\n\n\3\n\3\n\3\n\3\n\3"+
		"\n\5\n\u008b\n\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0093\n\n\f\n\16\n\u0096"+
		"\13\n\3\n\2\4\20\22\13\2\4\6\b\n\f\16\20\22\2\b\3\2\20\21\3\2\22\23\3"+
		"\2\24\25\3\2\37 \3\2\33\34\3\2\35\36\2\u00a7\2\24\3\2\2\2\4\65\3\2\2\2"+
		"\6\67\3\2\2\2\b<\3\2\2\2\nD\3\2\2\2\fL\3\2\2\2\16T\3\2\2\2\20m\3\2\2\2"+
		"\22\u008a\3\2\2\2\24\25\7\3\2\2\25\26\7\4\2\2\26\27\7\7\2\2\27\30\7\b"+
		"\2\2\30\31\7\5\2\2\31\32\5\16\b\2\32\33\7\6\2\2\33\3\3\2\2\2\34\35\7\16"+
		"\2\2\35\36\7\7\2\2\36\37\5\22\n\2\37 \7\b\2\2 !\7\f\2\2!\66\3\2\2\2\""+
		"%\5\n\6\2#&\5\6\4\2$&\5\f\7\2%#\3\2\2\2%$\3\2\2\2%&\3\2\2\2&\66\3\2\2"+
		"\2\'(\7\17\2\2()\7!\2\2)\66\7\f\2\2*+\7!\2\2+,\7\r\2\2,-\5\22\n\2-.\7"+
		"\f\2\2.\66\3\2\2\2/\60\7\17\2\2\60\61\7!\2\2\61\62\7\r\2\2\62\63\5\22"+
		"\n\2\63\64\7\f\2\2\64\66\3\2\2\2\65\34\3\2\2\2\65\"\3\2\2\2\65\'\3\2\2"+
		"\2\65*\3\2\2\2\65/\3\2\2\2\66\5\3\2\2\2\67:\5\b\5\28;\5\6\4\29;\5\f\7"+
		"\2:8\3\2\2\2:9\3\2\2\2:;\3\2\2\2;\7\3\2\2\2<=\7\13\2\2=>\7\7\2\2>?\5\20"+
		"\t\2?@\7\b\2\2@A\7\5\2\2AB\5\16\b\2BC\7\6\2\2C\t\3\2\2\2DE\7\t\2\2EF\7"+
		"\7\2\2FG\5\20\t\2GH\7\b\2\2HI\7\5\2\2IJ\5\16\b\2JK\7\6\2\2K\13\3\2\2\2"+
		"LM\7\n\2\2MN\7\5\2\2NO\5\16\b\2OP\7\6\2\2P\r\3\2\2\2QS\5\4\3\2RQ\3\2\2"+
		"\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\17\3\2\2\2VT\3\2\2\2WX\b\t\1\2XY\7\32"+
		"\2\2Yn\5\20\t\rZ[\5\22\n\2[\\\t\2\2\2\\]\5\22\n\2]n\3\2\2\2^_\5\22\n\2"+
		"_`\t\3\2\2`a\5\22\n\2an\3\2\2\2bc\5\22\n\2cd\t\4\2\2de\5\22\n\2en\3\2"+
		"\2\2fg\7\7\2\2gh\5\20\t\2hi\7\b\2\2in\3\2\2\2jn\7\30\2\2kn\7\31\2\2ln"+
		"\5\22\n\2mW\3\2\2\2mZ\3\2\2\2m^\3\2\2\2mb\3\2\2\2mf\3\2\2\2mj\3\2\2\2"+
		"mk\3\2\2\2ml\3\2\2\2nz\3\2\2\2op\f\13\2\2pq\t\2\2\2qy\5\20\t\frs\f\b\2"+
		"\2st\7\26\2\2ty\5\20\t\tuv\f\7\2\2vw\7\27\2\2wy\5\20\t\bxo\3\2\2\2xr\3"+
		"\2\2\2xu\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\21\3\2\2\2|z\3\2\2\2}"+
		"\177\b\n\1\2~\u0080\7\36\2\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\u008b\t\5\2\2\u0082\u0084\7\36\2\2\u0083\u0082\3\2\2\2"+
		"\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u008b\7!\2\2\u0086\u0087"+
		"\7\7\2\2\u0087\u0088\5\22\n\2\u0088\u0089\7\b\2\2\u0089\u008b\3\2\2\2"+
		"\u008a}\3\2\2\2\u008a\u0083\3\2\2\2\u008a\u0086\3\2\2\2\u008b\u0094\3"+
		"\2\2\2\u008c\u008d\f\7\2\2\u008d\u008e\t\6\2\2\u008e\u0093\5\22\n\b\u008f"+
		"\u0090\f\6\2\2\u0090\u0091\t\7\2\2\u0091\u0093\5\22\n\7\u0092\u008c\3"+
		"\2\2\2\u0092\u008f\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\23\3\2\2\2\u0096\u0094\3\2\2\2\16%\65:Tmxz\177\u0083"+
		"\u008a\u0092\u0094";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
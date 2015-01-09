// Generated from Acode.g4 by ANTLR 4.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AcodeParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__14=1, T__13=2, T__12=3, T__11=4, T__10=5, T__9=6, T__8=7, T__7=8, T__6=9, 
		T__5=10, T__4=11, T__3=12, T__2=13, T__1=14, T__0=15, AND=16, OR=17, NOT=18, 
		NEWLINE=19, ASSIGN=20, BLOCK_START=21, BLOCK_END=22, IF=23, ELSE=24, WHILE=25, 
		FOR=26, PAREN_OPEN=27, PAREN_CLOSE=28, BOOL=29, STRING=30, INT=31, DOUBLE=32, 
		STR=33, CHAR=34, NUMBER=35, DIGIT=36, WHITESPACE=37, ADD=38, SUB=39, MUL=40, 
		DIV=41, MOD=42, EXP=43, ADD_A=44, SUB_A=45, MUL_A=46, DIV_A=47, MOD_A=48, 
		EXP_A=49, EQ=50, NE=51, LE=52, GE=53, GT=54, LT=55;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "'extern'", "'bool'", "','", "'['", "'int'", "';'", 
		"'ret'", "'void'", "'def'", "'double'", "'break'", "'str'", "'elseif'", 
		"'char'", "AND", "OR", "'not'", "'\n'", "':='", "'{'", "'}'", "'if'", 
		"'else'", "'while'", "'for'", "'('", "')'", "BOOL", "STRING", "INT", "DOUBLE", 
		"STR", "CHAR", "NUMBER", "DIGIT", "WHITESPACE", "'+'", "'-'", "'*'", "'/'", 
		"'%'", "'^'", "'+='", "'-='", "'*='", "'/='", "'%='", "'^='", "'=='", 
		"'!='", "'<='", "'>='", "'>'", "'<'"
	};
	public static final int
		RULE_init = 0, RULE_statements = 1, RULE_statement = 2, RULE_block = 3, 
		RULE_assign_var = 4, RULE_own_assign = 5, RULE_args = 6, RULE_lvalue = 7, 
		RULE_name = 8, RULE_type = 9, RULE_param_call = 10, RULE_expression = 11;
	public static final String[] ruleNames = {
		"init", "statements", "statement", "block", "assign_var", "own_assign", 
		"args", "lvalue", "name", "type", "param_call", "expression"
	};

	@Override
	public String getGrammarFileName() { return "Acode.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public AcodeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InitContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24); statements();
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

	public static class StatementsContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(AcodeParser.NEWLINE); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode NEWLINE(int i) {
			return getToken(AcodeParser.NEWLINE, i);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26); statement();
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(27); match(NEWLINE);
				setState(28); statement();
				}
				}
				setState(33);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EmpContext extends StatementContext {
		public EmpContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterEmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitEmp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitEmp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExternContext extends StatementContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public ExternContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterExtern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitExtern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitExtern(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignContext extends StatementContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(AcodeParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileContext extends StatementContext {
		public TerminalNode WHILE() { return getToken(AcodeParser.WHILE, 0); }
		public TerminalNode PAREN_CLOSE() { return getToken(AcodeParser.PAREN_CLOSE, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(AcodeParser.PAREN_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Own_assContext extends StatementContext {
		public Own_assignContext own_assign() {
			return getRuleContext(Own_assignContext.class,0);
		}
		public Own_assContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterOwn_ass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitOwn_ass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitOwn_ass(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Block_stContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Block_stContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterBlock_st(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitBlock_st(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitBlock_st(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BreakContext extends StatementContext {
		public BreakContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitBreak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitBreak(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionDefContext extends StatementContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public FunctionDefContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterFunctionDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitFunctionDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitFunctionDef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssVarContext extends StatementContext {
		public Assign_varContext assign_var() {
			return getRuleContext(Assign_varContext.class,0);
		}
		public AssVarContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterAssVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitAssVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitAssVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForContext extends StatementContext {
		public Token op;
		public TerminalNode LE() { return getToken(AcodeParser.LE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode EQ() { return getToken(AcodeParser.EQ, 0); }
		public TerminalNode GE() { return getToken(AcodeParser.GE, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PAREN_CLOSE() { return getToken(AcodeParser.PAREN_CLOSE, 0); }
		public Assign_varContext assign_var() {
			return getRuleContext(Assign_varContext.class,0);
		}
		public Own_assignContext own_assign() {
			return getRuleContext(Own_assignContext.class,0);
		}
		public TerminalNode FOR() { return getToken(AcodeParser.FOR, 0); }
		public TerminalNode LT() { return getToken(AcodeParser.LT, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(AcodeParser.PAREN_OPEN, 0); }
		public TerminalNode NE() { return getToken(AcodeParser.NE, 0); }
		public TerminalNode GT() { return getToken(AcodeParser.GT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfContext extends StatementContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IF() { return getToken(AcodeParser.IF, 0); }
		public TerminalNode PAREN_CLOSE() { return getToken(AcodeParser.PAREN_CLOSE, 0); }
		public TerminalNode LT() { return getToken(AcodeParser.LT, 0); }
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode LE() { return getToken(AcodeParser.LE, 0); }
		public TerminalNode NE() { return getToken(AcodeParser.NE, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(AcodeParser.PAREN_OPEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode GT() { return getToken(AcodeParser.GT, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public TerminalNode GE() { return getToken(AcodeParser.GE, 0); }
		public TerminalNode EQ() { return getToken(AcodeParser.EQ, 0); }
		public IfContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RetContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RetContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterRet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitRet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitRet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		int _la;
		try {
			setState(105);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new AssVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(34); assign_var();
				}
				break;

			case 2:
				_localctx = new Own_assContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(35); own_assign();
				}
				break;

			case 3:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(36); lvalue();
				setState(37); match(ASSIGN);
				setState(38); expression(0);
				setState(39); match(7);
				}
				break;

			case 4:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(41); expression(0);
				}
				break;

			case 5:
				_localctx = new RetContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(42); match(8);
				setState(44);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << PAREN_OPEN) | (1L << BOOL) | (1L << STRING) | (1L << INT) | (1L << ADD) | (1L << SUB))) != 0)) {
					{
					setState(43); expression(0);
					}
				}

				setState(46); match(7);
				}
				break;

			case 6:
				_localctx = new Block_stContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(47); block();
				}
				break;

			case 7:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(48); match(IF);
				setState(49); match(PAREN_OPEN);
				setState(50); expression(0);
				setState(51);
				((IfContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NE) | (1L << LE) | (1L << GE) | (1L << GT) | (1L << LT))) != 0)) ) {
					((IfContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(52); expression(0);
				setState(53); match(PAREN_CLOSE);
				setState(54); block();
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==14) {
					{
					{
					setState(55); match(14);
					setState(56); expression(0);
					setState(57); block();
					}
					}
					setState(63);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(66);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(64); match(ELSE);
					setState(65); block();
					}
				}

				}
				break;

			case 8:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(68); match(WHILE);
				setState(69); match(PAREN_OPEN);
				setState(70); expression(0);
				setState(71); match(PAREN_CLOSE);
				setState(72); block();
				}
				break;

			case 9:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(74); match(FOR);
				setState(75); match(PAREN_OPEN);
				setState(76); assign_var();
				setState(77); expression(0);
				setState(78);
				((ForContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NE) | (1L << LE) | (1L << GE) | (1L << GT) | (1L << LT))) != 0)) ) {
					((ForContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(79); expression(0);
				setState(80); match(7);
				setState(81); own_assign();
				setState(82); match(PAREN_CLOSE);
				setState(83); block();
				}
				break;

			case 10:
				_localctx = new FunctionDefContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(85); match(10);
				setState(86); type(0);
				setState(87); name();
				setState(88); match(PAREN_OPEN);
				setState(89); args();
				setState(90); match(PAREN_CLOSE);
				setState(91); block();
				}
				break;

			case 11:
				_localctx = new EmpContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				}
				break;

			case 12:
				_localctx = new ExternContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(94); match(2);
				setState(95); match(10);
				setState(96); type(0);
				setState(97); name();
				setState(98); match(PAREN_OPEN);
				setState(99); args();
				setState(100); match(PAREN_CLOSE);
				setState(101); match(7);
				}
				break;

			case 13:
				_localctx = new BreakContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(103); match(12);
				setState(104); match(7);
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

	public static class BlockContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode BLOCK_END() { return getToken(AcodeParser.BLOCK_END, 0); }
		public TerminalNode BLOCK_START() { return getToken(AcodeParser.BLOCK_START, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107); match(BLOCK_START);
			setState(108); statements();
			setState(109); match(BLOCK_END);
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

	public static class Assign_varContext extends ParserRuleContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(AcodeParser.ASSIGN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Assign_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterAssign_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitAssign_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitAssign_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_varContext assign_var() throws RecognitionException {
		Assign_varContext _localctx = new Assign_varContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assign_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111); type(0);
			setState(112); lvalue();
			setState(115);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(113); match(ASSIGN);
				setState(114); expression(0);
				}
			}

			setState(117); match(7);
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

	public static class Own_assignContext extends ParserRuleContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EXP_A() { return getToken(AcodeParser.EXP_A, 0); }
		public TerminalNode DIV_A() { return getToken(AcodeParser.DIV_A, 0); }
		public TerminalNode MOD_A() { return getToken(AcodeParser.MOD_A, 0); }
		public TerminalNode SUB_A() { return getToken(AcodeParser.SUB_A, 0); }
		public TerminalNode MUL_A() { return getToken(AcodeParser.MUL_A, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode ADD_A() { return getToken(AcodeParser.ADD_A, 0); }
		public Own_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_own_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterOwn_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitOwn_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitOwn_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Own_assignContext own_assign() throws RecognitionException {
		Own_assignContext _localctx = new Own_assignContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_own_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119); expression(0);
			setState(120);
			((Own_assignContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD_A) | (1L << SUB_A) | (1L << MUL_A) | (1L << DIV_A) | (1L << MOD_A) | (1L << EXP_A))) != 0)) ) {
				((Own_assignContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(121); expression(0);
			setState(123);
			_la = _input.LA(1);
			if (_la==7) {
				{
				setState(122); match(7);
				}
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

	public static class ArgsContext extends ParserRuleContext {
		public LvalueContext lvalue(int i) {
			return getRuleContext(LvalueContext.class,i);
		}
		public List<LvalueContext> lvalue() {
			return getRuleContexts(LvalueContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 6) | (1L << 9) | (1L << 11) | (1L << 13) | (1L << 15))) != 0)) {
				{
				setState(125); type(0);
				setState(126); lvalue();
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==4) {
					{
					{
					setState(127); match(4);
					setState(128); type(0);
					setState(129); lvalue();
					}
					}
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class LvalueContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode STRING() { return getToken(AcodeParser.STRING, 0); }
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterLvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitLvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitLvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LvalueContext lvalue() throws RecognitionException {
		LvalueContext _localctx = new LvalueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lvalue);
		try {
			int _alt;
			setState(155);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138); match(STRING);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(139); match(STRING);
				setState(142); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(140); match(5);
						setState(141); match(1);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(144); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(146); match(STRING);
				setState(151); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(147); match(5);
						setState(148); expression(0);
						setState(149); match(1);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(153); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(AcodeParser.STRING, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157); match(STRING);
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

	public static class TypeContext extends ParserRuleContext {
		public int _p;
		public TypeContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TypeContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class Alloc_arrayContext extends TypeContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public Alloc_arrayContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterAlloc_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitAlloc_array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitAlloc_array(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BasicTypeContext extends TypeContext {
		public BasicTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterBasicType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitBasicType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitBasicType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayContext extends TypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArrayContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState, _p);
		TypeContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, RULE_type);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new BasicTypeContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(160);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 6) | (1L << 9) | (1L << 11) | (1L << 13) | (1L << 15))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
			_ctx.stop = _input.LT(-1);
			setState(180);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(178);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ArrayContext(new TypeContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(162);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(165); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(163); match(5);
								setState(164); match(1);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(167); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
						} while ( _alt!=2 && _alt!=-1 );
						}
						break;

					case 2:
						{
						_localctx = new Alloc_arrayContext(new TypeContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(169);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(174); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(170); match(5);
								setState(171); expression(0);
								setState(172); match(1);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(176); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
						} while ( _alt!=2 && _alt!=-1 );
						}
						break;
					}
					} 
				}
				setState(182);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class Param_callContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public Param_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterParam_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitParam_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitParam_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_callContext param_call() throws RecognitionException {
		Param_callContext _localctx = new Param_callContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_param_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << PAREN_OPEN) | (1L << BOOL) | (1L << STRING) | (1L << INT) | (1L << ADD) | (1L << SUB))) != 0)) {
				{
				setState(183); expression(0);
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==4) {
					{
					{
					setState(184); match(4);
					setState(185); expression(0);
					}
					}
					setState(190);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class ExpressionContext extends ParserRuleContext {
		public int _p;
		public ExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class BoolContext extends ExpressionContext {
		public TerminalNode BOOL() { return getToken(AcodeParser.BOOL, 0); }
		public BoolContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterUna(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitUna(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitUna(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncCallContext extends ExpressionContext {
		public Param_callContext param_call() {
			return getRuleContext(Param_callContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public FuncCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParContext extends ExpressionContext {
		public TerminalNode PAREN_CLOSE() { return getToken(AcodeParser.PAREN_CLOSE, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(AcodeParser.PAREN_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitPar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotContext extends ExpressionContext {
		public Token op;
		public TerminalNode NOT() { return getToken(AcodeParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EXP() { return getToken(AcodeParser.EXP, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(AcodeParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(AcodeParser.DIV, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode MOD() { return getToken(AcodeParser.MOD, 0); }
		public MulContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitMul(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CmpContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LT() { return getToken(AcodeParser.LT, 0); }
		public TerminalNode LE() { return getToken(AcodeParser.LE, 0); }
		public TerminalNode NE() { return getToken(AcodeParser.NE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode GT() { return getToken(AcodeParser.GT, 0); }
		public TerminalNode GE() { return getToken(AcodeParser.GE, 0); }
		public TerminalNode EQ() { return getToken(AcodeParser.EQ, 0); }
		public CmpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterCmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitCmp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitCmp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(AcodeParser.OR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public OrContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode SUB() { return getToken(AcodeParser.SUB, 0); }
		public TerminalNode ADD() { return getToken(AcodeParser.ADD, 0); }
		public AddContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValContext extends ExpressionContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public ValContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitVal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends ExpressionContext {
		public TerminalNode INT() { return getToken(AcodeParser.INT, 0); }
		public IntContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(AcodeParser.STRING, 0); }
		public VarContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(AcodeParser.AND, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public AndContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState, _p);
		ExpressionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				_localctx = new UnaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(194);
				((UnaContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
					((UnaContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(195); expression(14);
				}
				break;

			case 2:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(196); ((NotContext)_localctx).op = match(NOT);
				setState(197); expression(9);
				}
				break;

			case 3:
				{
				_localctx = new FuncCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(198); name();
				setState(199); match(PAREN_OPEN);
				setState(200); param_call();
				setState(201); match(PAREN_CLOSE);
				setState(203);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(202); match(7);
					}
					break;
				}
				}
				break;

			case 4:
				{
				_localctx = new ParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(205); match(PAREN_OPEN);
				setState(206); expression(0);
				setState(207); match(PAREN_CLOSE);
				}
				break;

			case 5:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(209); match(BOOL);
				}
				break;

			case 6:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(210); match(STRING);
				}
				break;

			case 7:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(211); match(INT);
				}
				break;

			case 8:
				{
				_localctx = new ValContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(212); lvalue();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(235);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(233);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(215);
						if (!(12 >= _localctx._p)) throw new FailedPredicateException(this, "12 >= $_p");
						setState(216); ((ExpContext)_localctx).op = match(EXP);
						setState(217); expression(12);
						}
						break;

					case 2:
						{
						_localctx = new MulContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(218);
						if (!(11 >= _localctx._p)) throw new FailedPredicateException(this, "11 >= $_p");
						setState(219);
						((MulContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((MulContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(220); expression(12);
						}
						break;

					case 3:
						{
						_localctx = new AddContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(221);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(222);
						((AddContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(223); expression(11);
						}
						break;

					case 4:
						{
						_localctx = new AndContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(224);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(225); ((AndContext)_localctx).op = match(AND);
						setState(226); expression(9);
						}
						break;

					case 5:
						{
						_localctx = new OrContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(227);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(228); ((OrContext)_localctx).op = match(OR);
						setState(229); expression(8);
						}
						break;

					case 6:
						{
						_localctx = new CmpContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(230);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(231);
						((CmpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NE) | (1L << LE) | (1L << GE) | (1L << GT) | (1L << LT))) != 0)) ) {
							((CmpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(232); expression(7);
						}
						break;
					}
					} 
				}
				setState(237);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
		case 9: return type_sempred((TypeContext)_localctx, predIndex);

		case 11: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return 12 >= _localctx._p;

		case 3: return 11 >= _localctx._p;

		case 4: return 10 >= _localctx._p;

		case 5: return 8 >= _localctx._p;

		case 6: return 7 >= _localctx._p;

		case 7: return 6 >= _localctx._p;
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 2 >= _localctx._p;

		case 1: return 1 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\39\u00f1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\3\7\3 \n\3\f\3\16\3#\13\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4/\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4>\n\4\f\4\16\4A\13\4\3\4\3\4\5\4E\n\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\4l\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6v\n\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\5\7~\n\7\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0086\n\b\f\b\16\b\u0089"+
		"\13\b\5\b\u008b\n\b\3\t\3\t\3\t\3\t\6\t\u0091\n\t\r\t\16\t\u0092\3\t\3"+
		"\t\3\t\3\t\3\t\6\t\u009a\n\t\r\t\16\t\u009b\5\t\u009e\n\t\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\6\13\u00a8\n\13\r\13\16\13\u00a9\3\13\3\13\3"+
		"\13\3\13\3\13\6\13\u00b1\n\13\r\13\16\13\u00b2\7\13\u00b5\n\13\f\13\16"+
		"\13\u00b8\13\13\3\f\3\f\3\f\7\f\u00bd\n\f\f\f\16\f\u00c0\13\f\5\f\u00c2"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ce\n\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\5\r\u00d8\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00ec\n\r\f\r\16\r\u00ef\13\r"+
		"\3\r\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\7\3\2\649\3\2.\63\b\2\5\5\b"+
		"\b\13\13\r\r\17\17\21\21\3\2()\3\2*,\u0110\2\32\3\2\2\2\4\34\3\2\2\2\6"+
		"k\3\2\2\2\bm\3\2\2\2\nq\3\2\2\2\fy\3\2\2\2\16\u008a\3\2\2\2\20\u009d\3"+
		"\2\2\2\22\u009f\3\2\2\2\24\u00a1\3\2\2\2\26\u00c1\3\2\2\2\30\u00d7\3\2"+
		"\2\2\32\33\5\4\3\2\33\3\3\2\2\2\34!\5\6\4\2\35\36\7\25\2\2\36 \5\6\4\2"+
		"\37\35\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"\5\3\2\2\2#!\3\2\2\2"+
		"$l\5\n\6\2%l\5\f\7\2&\'\5\20\t\2\'(\7\26\2\2()\5\30\r\2)*\7\t\2\2*l\3"+
		"\2\2\2+l\5\30\r\2,.\7\n\2\2-/\5\30\r\2.-\3\2\2\2./\3\2\2\2/\60\3\2\2\2"+
		"\60l\7\t\2\2\61l\5\b\5\2\62\63\7\31\2\2\63\64\7\35\2\2\64\65\5\30\r\2"+
		"\65\66\t\2\2\2\66\67\5\30\r\2\678\7\36\2\28?\5\b\5\29:\7\20\2\2:;\5\30"+
		"\r\2;<\5\b\5\2<>\3\2\2\2=9\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@D\3\2"+
		"\2\2A?\3\2\2\2BC\7\32\2\2CE\5\b\5\2DB\3\2\2\2DE\3\2\2\2El\3\2\2\2FG\7"+
		"\33\2\2GH\7\35\2\2HI\5\30\r\2IJ\7\36\2\2JK\5\b\5\2Kl\3\2\2\2LM\7\34\2"+
		"\2MN\7\35\2\2NO\5\n\6\2OP\5\30\r\2PQ\t\2\2\2QR\5\30\r\2RS\7\t\2\2ST\5"+
		"\f\7\2TU\7\36\2\2UV\5\b\5\2Vl\3\2\2\2WX\7\f\2\2XY\5\24\13\2YZ\5\22\n\2"+
		"Z[\7\35\2\2[\\\5\16\b\2\\]\7\36\2\2]^\5\b\5\2^l\3\2\2\2_l\3\2\2\2`a\7"+
		"\4\2\2ab\7\f\2\2bc\5\24\13\2cd\5\22\n\2de\7\35\2\2ef\5\16\b\2fg\7\36\2"+
		"\2gh\7\t\2\2hl\3\2\2\2ij\7\16\2\2jl\7\t\2\2k$\3\2\2\2k%\3\2\2\2k&\3\2"+
		"\2\2k+\3\2\2\2k,\3\2\2\2k\61\3\2\2\2k\62\3\2\2\2kF\3\2\2\2kL\3\2\2\2k"+
		"W\3\2\2\2k_\3\2\2\2k`\3\2\2\2ki\3\2\2\2l\7\3\2\2\2mn\7\27\2\2no\5\4\3"+
		"\2op\7\30\2\2p\t\3\2\2\2qr\5\24\13\2ru\5\20\t\2st\7\26\2\2tv\5\30\r\2"+
		"us\3\2\2\2uv\3\2\2\2vw\3\2\2\2wx\7\t\2\2x\13\3\2\2\2yz\5\30\r\2z{\t\3"+
		"\2\2{}\5\30\r\2|~\7\t\2\2}|\3\2\2\2}~\3\2\2\2~\r\3\2\2\2\177\u0080\5\24"+
		"\13\2\u0080\u0087\5\20\t\2\u0081\u0082\7\6\2\2\u0082\u0083\5\24\13\2\u0083"+
		"\u0084\5\20\t\2\u0084\u0086\3\2\2\2\u0085\u0081\3\2\2\2\u0086\u0089\3"+
		"\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008b\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u008a\177\3\2\2\2\u008a\u008b\3\2\2\2\u008b\17\3\2\2\2"+
		"\u008c\u009e\7 \2\2\u008d\u0090\7 \2\2\u008e\u008f\7\7\2\2\u008f\u0091"+
		"\7\3\2\2\u0090\u008e\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092"+
		"\u0093\3\2\2\2\u0093\u009e\3\2\2\2\u0094\u0099\7 \2\2\u0095\u0096\7\7"+
		"\2\2\u0096\u0097\5\30\r\2\u0097\u0098\7\3\2\2\u0098\u009a\3\2\2\2\u0099"+
		"\u0095\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2"+
		"\2\2\u009c\u009e\3\2\2\2\u009d\u008c\3\2\2\2\u009d\u008d\3\2\2\2\u009d"+
		"\u0094\3\2\2\2\u009e\21\3\2\2\2\u009f\u00a0\7 \2\2\u00a0\23\3\2\2\2\u00a1"+
		"\u00a2\b\13\1\2\u00a2\u00a3\t\4\2\2\u00a3\u00b6\3\2\2\2\u00a4\u00a7\6"+
		"\13\2\3\u00a5\u00a6\7\7\2\2\u00a6\u00a8\7\3\2\2\u00a7\u00a5\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00b5\3\2"+
		"\2\2\u00ab\u00b0\6\13\3\3\u00ac\u00ad\7\7\2\2\u00ad\u00ae\5\30\r\2\u00ae"+
		"\u00af\7\3\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ac\3\2\2\2\u00b1\u00b2\3\2"+
		"\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4"+
		"\u00a4\3\2\2\2\u00b4\u00ab\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2"+
		"\2\2\u00b6\u00b7\3\2\2\2\u00b7\25\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00be"+
		"\5\30\r\2\u00ba\u00bb\7\6\2\2\u00bb\u00bd\5\30\r\2\u00bc\u00ba\3\2\2\2"+
		"\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c2"+
		"\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00b9\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\27\3\2\2\2\u00c3\u00c4\b\r\1\2\u00c4\u00c5\t\5\2\2\u00c5\u00d8\5\30\r"+
		"\2\u00c6\u00c7\7\24\2\2\u00c7\u00d8\5\30\r\2\u00c8\u00c9\5\22\n\2\u00c9"+
		"\u00ca\7\35\2\2\u00ca\u00cb\5\26\f\2\u00cb\u00cd\7\36\2\2\u00cc\u00ce"+
		"\7\t\2\2\u00cd\u00cc\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d8\3\2\2\2\u00cf"+
		"\u00d0\7\35\2\2\u00d0\u00d1\5\30\r\2\u00d1\u00d2\7\36\2\2\u00d2\u00d8"+
		"\3\2\2\2\u00d3\u00d8\7\37\2\2\u00d4\u00d8\7 \2\2\u00d5\u00d8\7!\2\2\u00d6"+
		"\u00d8\5\20\t\2\u00d7\u00c3\3\2\2\2\u00d7\u00c6\3\2\2\2\u00d7\u00c8\3"+
		"\2\2\2\u00d7\u00cf\3\2\2\2\u00d7\u00d3\3\2\2\2\u00d7\u00d4\3\2\2\2\u00d7"+
		"\u00d5\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8\u00ed\3\2\2\2\u00d9\u00da\6\r"+
		"\4\3\u00da\u00db\7-\2\2\u00db\u00ec\5\30\r\2\u00dc\u00dd\6\r\5\3\u00dd"+
		"\u00de\t\6\2\2\u00de\u00ec\5\30\r\2\u00df\u00e0\6\r\6\3\u00e0\u00e1\t"+
		"\5\2\2\u00e1\u00ec\5\30\r\2\u00e2\u00e3\6\r\7\3\u00e3\u00e4\7\22\2\2\u00e4"+
		"\u00ec\5\30\r\2\u00e5\u00e6\6\r\b\3\u00e6\u00e7\7\23\2\2\u00e7\u00ec\5"+
		"\30\r\2\u00e8\u00e9\6\r\t\3\u00e9\u00ea\t\2\2\2\u00ea\u00ec\5\30\r\2\u00eb"+
		"\u00d9\3\2\2\2\u00eb\u00dc\3\2\2\2\u00eb\u00df\3\2\2\2\u00eb\u00e2\3\2"+
		"\2\2\u00eb\u00e5\3\2\2\2\u00eb\u00e8\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\31\3\2\2\2\u00ef\u00ed\3\2\2"+
		"\2\30!.?Dku}\u0087\u008a\u0092\u009b\u009d\u00a9\u00b2\u00b4\u00b6\u00be"+
		"\u00c1\u00cd\u00d7\u00eb\u00ed";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
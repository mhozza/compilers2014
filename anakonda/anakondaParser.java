// Generated from anakonda.g4 by ANTLR 4.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class anakondaParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__7=1, T__6=2, T__5=3, T__4=4, T__3=5, T__2=6, T__1=7, T__0=8, PRINT=9, 
		READ=10, LCURLY=11, RCURLY=12, LROUND=13, RROUND=14, LSQUARE=15, RSQUARE=16, 
		SEMICOLON=17, BREAK=18, CONTINUE=19, RET=20, VOID=21, BOOL=22, INCREASE=23, 
		DECREASE=24, ADD=25, SUBTRACT=26, MULTIPLY=27, DIVIDE=28, MODULO=29, ADDASS=30, 
		SUBASS=31, MULASS=32, DIVASS=33, MODASS=34, GREATERTHAN=35, LESSTHAN=36, 
		LESSEQUAL=37, GREATEREQUAL=38, EQUAL=39, NOTEEQUAL=40, FOR=41, WHILE=42, 
		IF=43, ELIF=44, ELSE=45, AND=46, OR=47, NOT=48, INT=49, IN=50, CISLO=51, 
		VARNAME=52, CHAR=53, STRING=54, COMMENT=55, WHITESPACE=56, NEWLINE=57;
	public static final String[] tokenNames = {
		"<INVALID>", "'def'", "'bool'", "','", "'string'", "':'", "'='", "'~'", 
		"'char'", "'print'", "'read'", "'{'", "'}'", "'('", "')'", "'['", "']'", 
		"';'", "'break'", "'continue'", "'return'", "'void'", "BOOL", "'++'", 
		"'--'", "'+'", "'-'", "'*'", "'/'", "'%'", "'+='", "'-='", "'*='", "'/='", 
		"'%='", "'>'", "'<'", "'<='", "'>='", "'=='", "'!='", "'for'", "'while'", 
		"'if'", "'elif'", "'else'", "AND", "OR", "NOT", "'int'", "'in'", "CISLO", 
		"VARNAME", "CHAR", "STRING", "COMMENT", "WHITESPACE", "'\n'"
	};
	public static final int
		RULE_init = 0, RULE_block = 1, RULE_statement = 2, RULE_oneline_statement = 3, 
		RULE_block_statement = 4, RULE_var = 5, RULE_value = 6, RULE_type = 7, 
		RULE_normal_assign = 8, RULE_combined_assign = 9, RULE_assign = 10, RULE_increment = 11, 
		RULE_decrement = 12, RULE_define_fun = 13, RULE_extern_func_def = 14, 
		RULE_arguments = 15, RULE_typelist = 16, RULE_call_fun = 17, RULE_define_var = 18, 
		RULE_ret = 19, RULE_forcycle = 20, RULE_whilecycle = 21, RULE_ifblock = 22, 
		RULE_list = 23, RULE_parameters = 24, RULE_range = 25, RULE_print = 26, 
		RULE_read = 27, RULE_expression = 28;
	public static final String[] ruleNames = {
		"init", "block", "statement", "oneline_statement", "block_statement", 
		"var", "value", "type", "normal_assign", "combined_assign", "assign", 
		"increment", "decrement", "define_fun", "extern_func_def", "arguments", 
		"typelist", "call_fun", "define_var", "ret", "forcycle", "whilecycle", 
		"ifblock", "list", "parameters", "range", "print", "read", "expression"
	};

	@Override
	public String getGrammarFileName() { return "anakonda.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public anakondaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InitContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(anakondaParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(anakondaParser.SEMICOLON, i);
		}
		public List<Extern_func_defContext> extern_func_def() {
			return getRuleContexts(Extern_func_defContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Extern_func_defContext extern_func_def(int i) {
			return getRuleContext(Extern_func_defContext.class,i);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).exitInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof anakondaVisitor ) return ((anakondaVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(58); extern_func_def();
					setState(59); match(SEMICOLON);
					}
					} 
				}
				setState(65);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 4) | (1L << 8) | (1L << PRINT) | (1L << READ) | (1L << LCURLY) | (1L << LROUND) | (1L << LSQUARE) | (1L << BREAK) | (1L << CONTINUE) | (1L << RET) | (1L << VOID) | (1L << BOOL) | (1L << ADD) | (1L << SUBTRACT) | (1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << NOT) | (1L << INT) | (1L << CISLO) | (1L << VARNAME) | (1L << CHAR) | (1L << STRING))) != 0)) {
				{
				{
				setState(66); statement();
				}
				}
				setState(71);
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode LCURLY() { return getToken(anakondaParser.LCURLY, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode RCURLY() { return getToken(anakondaParser.RCURLY, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof anakondaVisitor ) return ((anakondaVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72); match(LCURLY);
			setState(74); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(73); statement();
				}
				}
				setState(76); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 4) | (1L << 8) | (1L << PRINT) | (1L << READ) | (1L << LCURLY) | (1L << LROUND) | (1L << LSQUARE) | (1L << BREAK) | (1L << CONTINUE) | (1L << RET) | (1L << VOID) | (1L << BOOL) | (1L << ADD) | (1L << SUBTRACT) | (1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << NOT) | (1L << INT) | (1L << CISLO) | (1L << VARNAME) | (1L << CHAR) | (1L << STRING))) != 0) );
			setState(78); match(RCURLY);
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
		public Block_statementContext block_statement() {
			return getRuleContext(Block_statementContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(anakondaParser.SEMICOLON, 0); }
		public Oneline_statementContext oneline_statement() {
			return getRuleContext(Oneline_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof anakondaVisitor ) return ((anakondaVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(84);
			switch (_input.LA(1)) {
			case 2:
			case 4:
			case 8:
			case PRINT:
			case READ:
			case LROUND:
			case LSQUARE:
			case BREAK:
			case CONTINUE:
			case RET:
			case VOID:
			case BOOL:
			case ADD:
			case SUBTRACT:
			case NOT:
			case INT:
			case CISLO:
			case VARNAME:
			case CHAR:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(80); oneline_statement();
				setState(81); match(SEMICOLON);
				}
				break;
			case 1:
			case LCURLY:
			case FOR:
			case WHILE:
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(83); block_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Oneline_statementContext extends ParserRuleContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(anakondaParser.BREAK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Define_varContext define_var() {
			return getRuleContext(Define_varContext.class,0);
		}
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public RetContext ret() {
			return getRuleContext(RetContext.class,0);
		}
		public TerminalNode CONTINUE() { return getToken(anakondaParser.CONTINUE, 0); }
		public Oneline_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oneline_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).enterOneline_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).exitOneline_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof anakondaVisitor ) return ((anakondaVisitor<? extends T>)visitor).visitOneline_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Oneline_statementContext oneline_statement() throws RecognitionException {
		Oneline_statementContext _localctx = new Oneline_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_oneline_statement);
		try {
			setState(94);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86); assign();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87); define_var();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(88); expression(0);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(89); ret();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(90); print();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(91); read();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(92); match(BREAK);
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(93); match(CONTINUE);
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

	public static class Block_statementContext extends ParserRuleContext {
		public IfblockContext ifblock() {
			return getRuleContext(IfblockContext.class,0);
		}
		public ForcycleContext forcycle() {
			return getRuleContext(ForcycleContext.class,0);
		}
		public WhilecycleContext whilecycle() {
			return getRuleContext(WhilecycleContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Define_funContext define_fun() {
			return getRuleContext(Define_funContext.class,0);
		}
		public Block_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).enterBlock_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).exitBlock_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof anakondaVisitor ) return ((anakondaVisitor<? extends T>)visitor).visitBlock_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_statementContext block_statement() throws RecognitionException {
		Block_statementContext _localctx = new Block_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block_statement);
		try {
			setState(101);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(96); forcycle();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(97); whilecycle();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(98); ifblock();
				}
				break;
			case 1:
				enterOuterAlt(_localctx, 4);
				{
				setState(99); define_fun();
				}
				break;
			case LCURLY:
				enterOuterAlt(_localctx, 5);
				{
				setState(100); block();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class VarContext extends ParserRuleContext {
		public int _p;
		public VarContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public VarContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_var; }
	 
		public VarContext() { }
		public void copyFrom(VarContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class VarListContext extends VarContext {
		public TerminalNode RSQUARE() { return getToken(anakondaParser.RSQUARE, 0); }
		public TerminalNode LSQUARE() { return getToken(anakondaParser.LSQUARE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public VarListContext(VarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).enterVarList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).exitVarList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof anakondaVisitor ) return ((anakondaVisitor<? extends T>)visitor).visitVarList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarNameContext extends VarContext {
		public TerminalNode VARNAME() { return getToken(anakondaParser.VARNAME, 0); }
		public VarNameContext(VarContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).enterVarName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).exitVarName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof anakondaVisitor ) return ((anakondaVisitor<? extends T>)visitor).visitVarName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VarContext _localctx = new VarContext(_ctx, _parentState, _p);
		VarContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, RULE_var);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new VarNameContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(104); match(VARNAME);
			}
			_ctx.stop = _input.LT(-1);
			setState(113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VarListContext(new VarContext(_parentctx, _parentState, _p));
					pushNewRecursionContext(_localctx, _startState, RULE_var);
					setState(106);
					if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
					setState(107); match(LSQUARE);
					setState(108); expression(0);
					setState(109); match(RSQUARE);
					}
					} 
				}
				setState(115);
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

	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValListContext extends ValueContext {
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ValListContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).enterValList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).exitValList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof anakondaVisitor ) return ((anakondaVisitor<? extends T>)visitor).visitValList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValRangeContext extends ValueContext {
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public ValRangeContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).enterValRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).exitValRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof anakondaVisitor ) return ((anakondaVisitor<? extends T>)visitor).visitValRange(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValVoidContext extends ValueContext {
		public TerminalNode VOID() { return getToken(anakondaParser.VOID, 0); }
		public ValVoidContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).enterValVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).exitValVoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof anakondaVisitor ) return ((anakondaVisitor<? extends T>)visitor).visitValVoid(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValBoolContext extends ValueContext {
		public TerminalNode BOOL() { return getToken(anakondaParser.BOOL, 0); }
		public ValBoolContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).enterValBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).exitValBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof anakondaVisitor ) return ((anakondaVisitor<? extends T>)visitor).visitValBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValVarContext extends ValueContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ValVarContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).enterValVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).exitValVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof anakondaVisitor ) return ((anakondaVisitor<? extends T>)visitor).visitValVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValIntContext extends ValueContext {
		public TerminalNode CISLO() { return getToken(anakondaParser.CISLO, 0); }
		public ValIntContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).enterValInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).exitValInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof anakondaVisitor ) return ((anakondaVisitor<? extends T>)visitor).visitValInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValStringContext extends ValueContext {
		public TerminalNode STRING() { return getToken(anakondaParser.STRING, 0); }
		public ValStringContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).enterValString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).exitValString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof anakondaVisitor ) return ((anakondaVisitor<? extends T>)visitor).visitValString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValCharContext extends ValueContext {
		public TerminalNode CHAR() { return getToken(anakondaParser.CHAR, 0); }
		public ValCharContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).enterValChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).exitValChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof anakondaVisitor ) return ((anakondaVisitor<? extends T>)visitor).visitValChar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_value);
		try {
			setState(124);
			switch (_input.LA(1)) {
			case VARNAME:
				_localctx = new ValVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(116); var(0);
				}
				break;
			case VOID:
				_localctx = new ValVoidContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(117); match(VOID);
				}
				break;
			case BOOL:
				_localctx = new ValBoolContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(118); match(BOOL);
				}
				break;
			case CISLO:
				_localctx = new ValIntContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(119); match(CISLO);
				}
				break;
			case CHAR:
				_localctx = new ValCharContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(120); match(CHAR);
				}
				break;
			case STRING:
				_localctx = new ValStringContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(121); match(STRING);
				}
				break;
			case LSQUARE:
				_localctx = new ValListContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(122); list();
				}
				break;
			case LROUND:
				_localctx = new ValRangeContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(123); range();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class PrimitiveTypeContext extends TypeContext {
		public PrimitiveTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof anakondaVisitor ) return ((anakondaVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeListContext extends TypeContext {
		public TerminalNode RSQUARE() { return getToken(anakondaParser.RSQUARE, 0); }
		public TerminalNode LSQUARE() { return getToken(anakondaParser.LSQUARE, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeListContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).exitTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof anakondaVisitor ) return ((anakondaVisitor<? extends T>)visitor).visitTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState, _p);
		TypeContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, RULE_type);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PrimitiveTypeContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(127);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 4) | (1L << 8) | (1L << VOID) | (1L << INT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
			_ctx.stop = _input.LT(-1);
			setState(134);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeListContext(new TypeContext(_parentctx, _parentState, _p));
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(129);
					if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
					setState(130); match(LSQUARE);
					setState(131); match(RSQUARE);
					}
					} 
				}
				setState(136);
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

	public static class Normal_assignContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Normal_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normal_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).enterNormal_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).exitNormal_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof anakondaVisitor ) return ((anakondaVisitor<? extends T>)visitor).visitNormal_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Normal_assignContext normal_assign() throws RecognitionException {
		Normal_assignContext _localctx = new Normal_assignContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_normal_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137); var(0);
			setState(138); match(6);
			setState(139); expression(0);
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

	public static class Combined_assignContext extends ParserRuleContext {
		public Token op;
		public TerminalNode MULASS() { return getToken(anakondaParser.MULASS, 0); }
		public TerminalNode SUBASS() { return getToken(anakondaParser.SUBASS, 0); }
		public TerminalNode DIVASS() { return getToken(anakondaParser.DIVASS, 0); }
		public TerminalNode MODASS() { return getToken(anakondaParser.MODASS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ADDASS() { return getToken(anakondaParser.ADDASS, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Combined_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_combined_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).enterCombined_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).exitCombined_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof anakondaVisitor ) return ((anakondaVisitor<? extends T>)visitor).visitCombined_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Combined_assignContext combined_assign() throws RecognitionException {
		Combined_assignContext _localctx = new Combined_assignContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_combined_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141); var(0);
			setState(142);
			((Combined_assignContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADDASS) | (1L << SUBASS) | (1L << MULASS) | (1L << DIVASS) | (1L << MODASS))) != 0)) ) {
				((Combined_assignContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(143); expression(0);
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

	public static class AssignContext extends ParserRuleContext {
		public Combined_assignContext combined_assign() {
			return getRuleContext(Combined_assignContext.class,0);
		}
		public Normal_assignContext normal_assign() {
			return getRuleContext(Normal_assignContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof anakondaVisitor ) return ((anakondaVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assign);
		try {
			setState(147);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145); normal_assign();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146); combined_assign();
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

	public static class IncrementContext extends ParserRuleContext {
		public TerminalNode INCREASE() { return getToken(anakondaParser.INCREASE, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public IncrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_increment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).enterIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).exitIncrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof anakondaVisitor ) return ((anakondaVisitor<? extends T>)visitor).visitIncrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrementContext increment() throws RecognitionException {
		IncrementContext _localctx = new IncrementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_increment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149); var(0);
			setState(150); match(INCREASE);
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

	public static class DecrementContext extends ParserRuleContext {
		public TerminalNode DECREASE() { return getToken(anakondaParser.DECREASE, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public DecrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decrement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).enterDecrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).exitDecrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof anakondaVisitor ) return ((anakondaVisitor<? extends T>)visitor).visitDecrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecrementContext decrement() throws RecognitionException {
		DecrementContext _localctx = new DecrementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_decrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152); var(0);
			setState(153); match(DECREASE);
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

	public static class Define_funContext extends ParserRuleContext {
		public TerminalNode RROUND() { return getToken(anakondaParser.RROUND, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode VARNAME() { return getToken(anakondaParser.VARNAME, 0); }
		public TerminalNode LROUND() { return getToken(anakondaParser.LROUND, 0); }
		public Define_funContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_fun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).enterDefine_fun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).exitDefine_fun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof anakondaVisitor ) return ((anakondaVisitor<? extends T>)visitor).visitDefine_fun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Define_funContext define_fun() throws RecognitionException {
		Define_funContext _localctx = new Define_funContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_define_fun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155); match(1);
			setState(156); type(0);
			setState(157); match(VARNAME);
			setState(158); match(LROUND);
			setState(159); arguments();
			setState(160); match(RROUND);
			setState(161); block();
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

	public static class Extern_func_defContext extends ParserRuleContext {
		public TypelistContext typelist() {
			return getRuleContext(TypelistContext.class,0);
		}
		public TerminalNode RROUND() { return getToken(anakondaParser.RROUND, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VARNAME() { return getToken(anakondaParser.VARNAME, 0); }
		public TerminalNode LROUND() { return getToken(anakondaParser.LROUND, 0); }
		public Extern_func_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extern_func_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).enterExtern_func_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).exitExtern_func_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof anakondaVisitor ) return ((anakondaVisitor<? extends T>)visitor).visitExtern_func_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Extern_func_defContext extern_func_def() throws RecognitionException {
		Extern_func_defContext _localctx = new Extern_func_defContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_extern_func_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163); type(0);
			setState(164); match(7);
			setState(165); match(VARNAME);
			setState(166); match(LROUND);
			setState(167); typelist();
			setState(168); match(RROUND);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	 
		public ArgumentsContext() { }
		public void copyFrom(ArgumentsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArgsContext extends ArgumentsContext {
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public List<TerminalNode> VARNAME() { return getTokens(anakondaParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(anakondaParser.VARNAME, i);
		}
		public ArgsContext(ArgumentsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof anakondaVisitor ) return ((anakondaVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arguments);
		int _la;
		try {
			_localctx = new ArgsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 4) | (1L << 8) | (1L << VOID) | (1L << INT))) != 0)) {
				{
				setState(170); type(0);
				setState(171); match(VARNAME);
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==3) {
					{
					{
					setState(172); match(3);
					setState(173); type(0);
					setState(174); match(VARNAME);
					}
					}
					setState(180);
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

	public static class TypelistContext extends ParserRuleContext {
		public TypelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typelist; }
	 
		public TypelistContext() { }
		public void copyFrom(TypelistContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypesContext extends TypelistContext {
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypesContext(TypelistContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).enterTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).exitTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof anakondaVisitor ) return ((anakondaVisitor<? extends T>)visitor).visitTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypelistContext typelist() throws RecognitionException {
		TypelistContext _localctx = new TypelistContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typelist);
		int _la;
		try {
			_localctx = new TypesContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 4) | (1L << 8) | (1L << VOID) | (1L << INT))) != 0)) {
				{
				setState(183); type(0);
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==3) {
					{
					{
					setState(184); match(3);
					setState(185); type(0);
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

	public static class Call_funContext extends ParserRuleContext {
		public TerminalNode RROUND() { return getToken(anakondaParser.RROUND, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode VARNAME() { return getToken(anakondaParser.VARNAME, 0); }
		public TerminalNode LROUND() { return getToken(anakondaParser.LROUND, 0); }
		public Call_funContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_fun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).enterCall_fun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).exitCall_fun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof anakondaVisitor ) return ((anakondaVisitor<? extends T>)visitor).visitCall_fun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_funContext call_fun() throws RecognitionException {
		Call_funContext _localctx = new Call_funContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_call_fun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193); match(VARNAME);
			setState(194); match(LROUND);
			setState(195); parameters();
			setState(196); match(RROUND);
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

	public static class Define_varContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode VARNAME() { return getToken(anakondaParser.VARNAME, 0); }
		public Define_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).enterDefine_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).exitDefine_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof anakondaVisitor ) return ((anakondaVisitor<? extends T>)visitor).visitDefine_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Define_varContext define_var() throws RecognitionException {
		Define_varContext _localctx = new Define_varContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_define_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198); type(0);
			setState(199); match(VARNAME);
			setState(202);
			_la = _input.LA(1);
			if (_la==6) {
				{
				setState(200); match(6);
				setState(201); expression(0);
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

	public static class RetContext extends ParserRuleContext {
		public TerminalNode RET() { return getToken(anakondaParser.RET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ret; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).enterRet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).exitRet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof anakondaVisitor ) return ((anakondaVisitor<? extends T>)visitor).visitRet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetContext ret() throws RecognitionException {
		RetContext _localctx = new RetContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ret);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204); match(RET);
			setState(206);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << READ) | (1L << LROUND) | (1L << LSQUARE) | (1L << VOID) | (1L << BOOL) | (1L << ADD) | (1L << SUBTRACT) | (1L << NOT) | (1L << CISLO) | (1L << VARNAME) | (1L << CHAR) | (1L << STRING))) != 0)) {
				{
				setState(205); expression(0);
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

	public static class ForcycleContext extends ParserRuleContext {
		public List<TerminalNode> SEMICOLON() { return getTokens(anakondaParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(anakondaParser.SEMICOLON, i);
		}
		public TerminalNode RROUND() { return getToken(anakondaParser.RROUND, 0); }
		public TerminalNode FOR() { return getToken(anakondaParser.FOR, 0); }
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Define_varContext define_var() {
			return getRuleContext(Define_varContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode LROUND() { return getToken(anakondaParser.LROUND, 0); }
		public ForcycleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forcycle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).enterForcycle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).exitForcycle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof anakondaVisitor ) return ((anakondaVisitor<? extends T>)visitor).visitForcycle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForcycleContext forcycle() throws RecognitionException {
		ForcycleContext _localctx = new ForcycleContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_forcycle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208); match(FOR);
			setState(209); match(LROUND);
			setState(210); define_var();
			setState(211); match(SEMICOLON);
			setState(212); expression(0);
			setState(213); match(SEMICOLON);
			setState(214); assign();
			setState(215); match(RROUND);
			setState(216); block();
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

	public static class WhilecycleContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(anakondaParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhilecycleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilecycle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).enterWhilecycle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).exitWhilecycle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof anakondaVisitor ) return ((anakondaVisitor<? extends T>)visitor).visitWhilecycle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhilecycleContext whilecycle() throws RecognitionException {
		WhilecycleContext _localctx = new WhilecycleContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_whilecycle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218); match(WHILE);
			setState(219); expression(0);
			setState(220); block();
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

	public static class IfblockContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IF() { return getToken(anakondaParser.IF, 0); }
		public TerminalNode ELSE() { return getToken(anakondaParser.ELSE, 0); }
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode ELIF(int i) {
			return getToken(anakondaParser.ELIF, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public List<TerminalNode> ELIF() { return getTokens(anakondaParser.ELIF); }
		public IfblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).enterIfblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).exitIfblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof anakondaVisitor ) return ((anakondaVisitor<? extends T>)visitor).visitIfblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfblockContext ifblock() throws RecognitionException {
		IfblockContext _localctx = new IfblockContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_ifblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222); match(IF);
			setState(223); expression(0);
			setState(224); block();
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(225); match(ELIF);
				setState(226); expression(0);
				setState(227); block();
				}
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(236);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(234); match(ELSE);
				setState(235); block();
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

	public static class ListContext extends ParserRuleContext {
		public TerminalNode RSQUARE() { return getToken(anakondaParser.RSQUARE, 0); }
		public TerminalNode LSQUARE() { return getToken(anakondaParser.LSQUARE, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).exitList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof anakondaVisitor ) return ((anakondaVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238); match(LSQUARE);
			setState(239); parameters();
			setState(240); match(RSQUARE);
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

	public static class ParametersContext extends ParserRuleContext {
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
	 
		public ParametersContext() { }
		public void copyFrom(ParametersContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParamsContext extends ParametersContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ParamsContext(ParametersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof anakondaVisitor ) return ((anakondaVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_parameters);
		int _la;
		try {
			_localctx = new ParamsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << READ) | (1L << LROUND) | (1L << LSQUARE) | (1L << VOID) | (1L << BOOL) | (1L << ADD) | (1L << SUBTRACT) | (1L << NOT) | (1L << CISLO) | (1L << VARNAME) | (1L << CHAR) | (1L << STRING))) != 0)) {
				{
				setState(242); expression(0);
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==3) {
					{
					{
					setState(243); match(3);
					setState(244); expression(0);
					}
					}
					setState(249);
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

	public static class RangeContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RROUND() { return getToken(anakondaParser.RROUND, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode LROUND() { return getToken(anakondaParser.LROUND, 0); }
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).exitRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof anakondaVisitor ) return ((anakondaVisitor<? extends T>)visitor).visitRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_range);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252); match(LROUND);
			setState(253); expression(0);
			setState(254); match(5);
			setState(255); expression(0);
			setState(258);
			_la = _input.LA(1);
			if (_la==5) {
				{
				setState(256); match(5);
				setState(257); expression(0);
				}
			}

			setState(260); match(RROUND);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(anakondaParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof anakondaVisitor ) return ((anakondaVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262); match(PRINT);
			setState(263); expression(0);
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

	public static class ReadContext extends ParserRuleContext {
		public TerminalNode RROUND() { return getToken(anakondaParser.RROUND, 0); }
		public TerminalNode READ() { return getToken(anakondaParser.READ, 0); }
		public TerminalNode LROUND() { return getToken(anakondaParser.LROUND, 0); }
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).exitRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof anakondaVisitor ) return ((anakondaVisitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265); match(READ);
			setState(266); match(LROUND);
			setState(267); match(RROUND);
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
	public static class ReadpressionContext extends ExpressionContext {
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public ReadpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).enterReadpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).exitReadpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof anakondaVisitor ) return ((anakondaVisitor<? extends T>)visitor).visitReadpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrpressionContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(anakondaParser.OR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public OrpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).enterOrpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).exitOrpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof anakondaVisitor ) return ((anakondaVisitor<? extends T>)visitor).visitOrpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListIndexContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RSQUARE() { return getToken(anakondaParser.RSQUARE, 0); }
		public TerminalNode LSQUARE() { return getToken(anakondaParser.LSQUARE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ListIndexContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).enterListIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).exitListIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof anakondaVisitor ) return ((anakondaVisitor<? extends T>)visitor).visitListIndex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultipressionContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MODULO() { return getToken(anakondaParser.MODULO, 0); }
		public TerminalNode MULTIPLY() { return getToken(anakondaParser.MULTIPLY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode DIVIDE() { return getToken(anakondaParser.DIVIDE, 0); }
		public MultipressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).enterMultipression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).exitMultipression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof anakondaVisitor ) return ((anakondaVisitor<? extends T>)visitor).visitMultipression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DecpressionContext extends ExpressionContext {
		public DecrementContext decrement() {
			return getRuleContext(DecrementContext.class,0);
		}
		public DecpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).enterDecpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).exitDecpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof anakondaVisitor ) return ((anakondaVisitor<? extends T>)visitor).visitDecpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValpressionContext extends ExpressionContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ValpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).enterValpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).exitValpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof anakondaVisitor ) return ((anakondaVisitor<? extends T>)visitor).visitValpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SUBTRACT() { return getToken(anakondaParser.SUBTRACT, 0); }
		public TerminalNode ADD() { return getToken(anakondaParser.ADD, 0); }
		public UnaryContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).enterUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).exitUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof anakondaVisitor ) return ((anakondaVisitor<? extends T>)visitor).visitUnary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddpressionContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode SUBTRACT() { return getToken(anakondaParser.SUBTRACT, 0); }
		public TerminalNode ADD() { return getToken(anakondaParser.ADD, 0); }
		public AddpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).enterAddpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).exitAddpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof anakondaVisitor ) return ((anakondaVisitor<? extends T>)visitor).visitAddpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompressionContext extends ExpressionContext {
		public Token op;
		public TerminalNode LESSTHAN() { return getToken(anakondaParser.LESSTHAN, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GREATEREQUAL() { return getToken(anakondaParser.GREATEREQUAL, 0); }
		public TerminalNode GREATERTHAN() { return getToken(anakondaParser.GREATERTHAN, 0); }
		public TerminalNode NOTEEQUAL() { return getToken(anakondaParser.NOTEEQUAL, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode EQUAL() { return getToken(anakondaParser.EQUAL, 0); }
		public TerminalNode LESSEQUAL() { return getToken(anakondaParser.LESSEQUAL, 0); }
		public CompressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).enterCompression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).exitCompression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof anakondaVisitor ) return ((anakondaVisitor<? extends T>)visitor).visitCompression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrecedenceContext extends ExpressionContext {
		public TerminalNode RROUND() { return getToken(anakondaParser.RROUND, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LROUND() { return getToken(anakondaParser.LROUND, 0); }
		public PrecedenceContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).enterPrecedence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).exitPrecedence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof anakondaVisitor ) return ((anakondaVisitor<? extends T>)visitor).visitPrecedence(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndpressionContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(anakondaParser.AND, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public AndpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).enterAndpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).exitAndpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof anakondaVisitor ) return ((anakondaVisitor<? extends T>)visitor).visitAndpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotpressionContext extends ExpressionContext {
		public Token op;
		public TerminalNode NOT() { return getToken(anakondaParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).enterNotpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).exitNotpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof anakondaVisitor ) return ((anakondaVisitor<? extends T>)visitor).visitNotpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallFunContext extends ExpressionContext {
		public Call_funContext call_fun() {
			return getRuleContext(Call_funContext.class,0);
		}
		public CallFunContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).enterCallFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).exitCallFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof anakondaVisitor ) return ((anakondaVisitor<? extends T>)visitor).visitCallFun(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IncpressionContext extends ExpressionContext {
		public IncrementContext increment() {
			return getRuleContext(IncrementContext.class,0);
		}
		public IncpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).enterIncpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof anakondaListener ) ((anakondaListener)listener).exitIncpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof anakondaVisitor ) return ((anakondaVisitor<? extends T>)visitor).visitIncpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState, _p);
		ExpressionContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(270);
				((UnaryContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUBTRACT) ) {
					((UnaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(271); expression(8);
				}
				break;

			case 2:
				{
				_localctx = new NotpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(272); ((NotpressionContext)_localctx).op = match(NOT);
				setState(273); expression(4);
				}
				break;

			case 3:
				{
				_localctx = new PrecedenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(274); match(LROUND);
				setState(275); expression(0);
				setState(276); match(RROUND);
				}
				break;

			case 4:
				{
				_localctx = new IncpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(278); increment();
				}
				break;

			case 5:
				{
				_localctx = new ReadpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(279); read();
				}
				break;

			case 6:
				{
				_localctx = new DecpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(280); decrement();
				}
				break;

			case 7:
				{
				_localctx = new CallFunContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(281); call_fun();
				}
				break;

			case 8:
				{
				_localctx = new ValpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(282); value();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(307);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(305);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new MultipressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(285);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(286);
						((MultipressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLY) | (1L << DIVIDE) | (1L << MODULO))) != 0)) ) {
							((MultipressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(287); expression(8);
						}
						break;

					case 2:
						{
						_localctx = new AddpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(288);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(289);
						((AddpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUBTRACT) ) {
							((AddpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(290); expression(7);
						}
						break;

					case 3:
						{
						_localctx = new CompressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(291);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(292);
						((CompressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GREATERTHAN) | (1L << LESSTHAN) | (1L << LESSEQUAL) | (1L << GREATEREQUAL) | (1L << EQUAL) | (1L << NOTEEQUAL))) != 0)) ) {
							((CompressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(293); expression(6);
						}
						break;

					case 4:
						{
						_localctx = new AndpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(294);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(295); ((AndpressionContext)_localctx).op = match(AND);
						setState(296); expression(4);
						}
						break;

					case 5:
						{
						_localctx = new OrpressionContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(297);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(298); ((OrpressionContext)_localctx).op = match(OR);
						setState(299); expression(3);
						}
						break;

					case 6:
						{
						_localctx = new ListIndexContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(300);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(301); match(LSQUARE);
						setState(302); expression(0);
						setState(303); match(RSQUARE);
						}
						break;
					}
					} 
				}
				setState(309);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
		case 5: return var_sempred((VarContext)_localctx, predIndex);

		case 7: return type_sempred((TypeContext)_localctx, predIndex);

		case 28: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return 7 >= _localctx._p;

		case 3: return 6 >= _localctx._p;

		case 4: return 5 >= _localctx._p;

		case 5: return 3 >= _localctx._p;

		case 6: return 2 >= _localctx._p;

		case 7: return 9 >= _localctx._p;
		}
		return true;
	}
	private boolean var_sempred(VarContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 1 >= _localctx._p;
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return 2 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3;\u0139\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\7\2@\n"+
		"\2\f\2\16\2C\13\2\3\2\7\2F\n\2\f\2\16\2I\13\2\3\3\3\3\6\3M\n\3\r\3\16"+
		"\3N\3\3\3\3\3\4\3\4\3\4\3\4\5\4W\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\5a\n\5\3\6\3\6\3\6\3\6\3\6\5\6h\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7"+
		"\7r\n\7\f\7\16\7u\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\177\n\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\7\t\u0087\n\t\f\t\16\t\u008a\13\t\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\5\f\u0096\n\f\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00b3\n\21\f\21\16\21\u00b6\13"+
		"\21\5\21\u00b8\n\21\3\22\3\22\3\22\7\22\u00bd\n\22\f\22\16\22\u00c0\13"+
		"\22\5\22\u00c2\n\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\5\24"+
		"\u00cd\n\24\3\25\3\25\5\25\u00d1\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\7\30\u00e8\n\30\f\30\16\30\u00eb\13\30\3\30\3\30\5\30\u00ef\n\30\3"+
		"\31\3\31\3\31\3\31\3\32\3\32\3\32\7\32\u00f8\n\32\f\32\16\32\u00fb\13"+
		"\32\5\32\u00fd\n\32\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0105\n\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u011e\n\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\7\36\u0134\n\36\f\36\16\36\u0137\13\36\3\36\2\37\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2\7\7\2\4\4\6"+
		"\6\n\n\27\27\63\63\3\2 $\3\2\33\34\3\2\35\37\3\2%*\u014c\2A\3\2\2\2\4"+
		"J\3\2\2\2\6V\3\2\2\2\b`\3\2\2\2\ng\3\2\2\2\fi\3\2\2\2\16~\3\2\2\2\20\u0080"+
		"\3\2\2\2\22\u008b\3\2\2\2\24\u008f\3\2\2\2\26\u0095\3\2\2\2\30\u0097\3"+
		"\2\2\2\32\u009a\3\2\2\2\34\u009d\3\2\2\2\36\u00a5\3\2\2\2 \u00b7\3\2\2"+
		"\2\"\u00c1\3\2\2\2$\u00c3\3\2\2\2&\u00c8\3\2\2\2(\u00ce\3\2\2\2*\u00d2"+
		"\3\2\2\2,\u00dc\3\2\2\2.\u00e0\3\2\2\2\60\u00f0\3\2\2\2\62\u00fc\3\2\2"+
		"\2\64\u00fe\3\2\2\2\66\u0108\3\2\2\28\u010b\3\2\2\2:\u011d\3\2\2\2<=\5"+
		"\36\20\2=>\7\23\2\2>@\3\2\2\2?<\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2"+
		"BG\3\2\2\2CA\3\2\2\2DF\5\6\4\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2"+
		"H\3\3\2\2\2IG\3\2\2\2JL\7\r\2\2KM\5\6\4\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2"+
		"\2NO\3\2\2\2OP\3\2\2\2PQ\7\16\2\2Q\5\3\2\2\2RS\5\b\5\2ST\7\23\2\2TW\3"+
		"\2\2\2UW\5\n\6\2VR\3\2\2\2VU\3\2\2\2W\7\3\2\2\2Xa\5\26\f\2Ya\5&\24\2Z"+
		"a\5:\36\2[a\5(\25\2\\a\5\66\34\2]a\58\35\2^a\7\24\2\2_a\7\25\2\2`X\3\2"+
		"\2\2`Y\3\2\2\2`Z\3\2\2\2`[\3\2\2\2`\\\3\2\2\2`]\3\2\2\2`^\3\2\2\2`_\3"+
		"\2\2\2a\t\3\2\2\2bh\5*\26\2ch\5,\27\2dh\5.\30\2eh\5\34\17\2fh\5\4\3\2"+
		"gb\3\2\2\2gc\3\2\2\2gd\3\2\2\2ge\3\2\2\2gf\3\2\2\2h\13\3\2\2\2ij\b\7\1"+
		"\2jk\7\66\2\2ks\3\2\2\2lm\6\7\2\3mn\7\21\2\2no\5:\36\2op\7\22\2\2pr\3"+
		"\2\2\2ql\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t\r\3\2\2\2us\3\2\2\2v\177"+
		"\5\f\7\2w\177\7\27\2\2x\177\7\30\2\2y\177\7\65\2\2z\177\7\67\2\2{\177"+
		"\78\2\2|\177\5\60\31\2}\177\5\64\33\2~v\3\2\2\2~w\3\2\2\2~x\3\2\2\2~y"+
		"\3\2\2\2~z\3\2\2\2~{\3\2\2\2~|\3\2\2\2~}\3\2\2\2\177\17\3\2\2\2\u0080"+
		"\u0081\b\t\1\2\u0081\u0082\t\2\2\2\u0082\u0088\3\2\2\2\u0083\u0084\6\t"+
		"\3\3\u0084\u0085\7\21\2\2\u0085\u0087\7\22\2\2\u0086\u0083\3\2\2\2\u0087"+
		"\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\21\3\2\2"+
		"\2\u008a\u0088\3\2\2\2\u008b\u008c\5\f\7\2\u008c\u008d\7\b\2\2\u008d\u008e"+
		"\5:\36\2\u008e\23\3\2\2\2\u008f\u0090\5\f\7\2\u0090\u0091\t\3\2\2\u0091"+
		"\u0092\5:\36\2\u0092\25\3\2\2\2\u0093\u0096\5\22\n\2\u0094\u0096\5\24"+
		"\13\2\u0095\u0093\3\2\2\2\u0095\u0094\3\2\2\2\u0096\27\3\2\2\2\u0097\u0098"+
		"\5\f\7\2\u0098\u0099\7\31\2\2\u0099\31\3\2\2\2\u009a\u009b\5\f\7\2\u009b"+
		"\u009c\7\32\2\2\u009c\33\3\2\2\2\u009d\u009e\7\3\2\2\u009e\u009f\5\20"+
		"\t\2\u009f\u00a0\7\66\2\2\u00a0\u00a1\7\17\2\2\u00a1\u00a2\5 \21\2\u00a2"+
		"\u00a3\7\20\2\2\u00a3\u00a4\5\4\3\2\u00a4\35\3\2\2\2\u00a5\u00a6\5\20"+
		"\t\2\u00a6\u00a7\7\t\2\2\u00a7\u00a8\7\66\2\2\u00a8\u00a9\7\17\2\2\u00a9"+
		"\u00aa\5\"\22\2\u00aa\u00ab\7\20\2\2\u00ab\37\3\2\2\2\u00ac\u00ad\5\20"+
		"\t\2\u00ad\u00b4\7\66\2\2\u00ae\u00af\7\5\2\2\u00af\u00b0\5\20\t\2\u00b0"+
		"\u00b1\7\66\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00ae\3\2\2\2\u00b3\u00b6\3"+
		"\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b7\u00ac\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8!\3\2\2\2"+
		"\u00b9\u00be\5\20\t\2\u00ba\u00bb\7\5\2\2\u00bb\u00bd\5\20\t\2\u00bc\u00ba"+
		"\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		"\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00b9\3\2\2\2\u00c1\u00c2\3\2"+
		"\2\2\u00c2#\3\2\2\2\u00c3\u00c4\7\66\2\2\u00c4\u00c5\7\17\2\2\u00c5\u00c6"+
		"\5\62\32\2\u00c6\u00c7\7\20\2\2\u00c7%\3\2\2\2\u00c8\u00c9\5\20\t\2\u00c9"+
		"\u00cc\7\66\2\2\u00ca\u00cb\7\b\2\2\u00cb\u00cd\5:\36\2\u00cc\u00ca\3"+
		"\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\'\3\2\2\2\u00ce\u00d0\7\26\2\2\u00cf"+
		"\u00d1\5:\36\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1)\3\2\2\2"+
		"\u00d2\u00d3\7+\2\2\u00d3\u00d4\7\17\2\2\u00d4\u00d5\5&\24\2\u00d5\u00d6"+
		"\7\23\2\2\u00d6\u00d7\5:\36\2\u00d7\u00d8\7\23\2\2\u00d8\u00d9\5\26\f"+
		"\2\u00d9\u00da\7\20\2\2\u00da\u00db\5\4\3\2\u00db+\3\2\2\2\u00dc\u00dd"+
		"\7,\2\2\u00dd\u00de\5:\36\2\u00de\u00df\5\4\3\2\u00df-\3\2\2\2\u00e0\u00e1"+
		"\7-\2\2\u00e1\u00e2\5:\36\2\u00e2\u00e9\5\4\3\2\u00e3\u00e4\7.\2\2\u00e4"+
		"\u00e5\5:\36\2\u00e5\u00e6\5\4\3\2\u00e6\u00e8\3\2\2\2\u00e7\u00e3\3\2"+
		"\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"\u00ee\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ed\7/\2\2\u00ed\u00ef\5\4"+
		"\3\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef/\3\2\2\2\u00f0\u00f1"+
		"\7\21\2\2\u00f1\u00f2\5\62\32\2\u00f2\u00f3\7\22\2\2\u00f3\61\3\2\2\2"+
		"\u00f4\u00f9\5:\36\2\u00f5\u00f6\7\5\2\2\u00f6\u00f8\5:\36\2\u00f7\u00f5"+
		"\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		"\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00f4\3\2\2\2\u00fc\u00fd\3\2"+
		"\2\2\u00fd\63\3\2\2\2\u00fe\u00ff\7\17\2\2\u00ff\u0100\5:\36\2\u0100\u0101"+
		"\7\7\2\2\u0101\u0104\5:\36\2\u0102\u0103\7\7\2\2\u0103\u0105\5:\36\2\u0104"+
		"\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\7\20"+
		"\2\2\u0107\65\3\2\2\2\u0108\u0109\7\13\2\2\u0109\u010a\5:\36\2\u010a\67"+
		"\3\2\2\2\u010b\u010c\7\f\2\2\u010c\u010d\7\17\2\2\u010d\u010e\7\20\2\2"+
		"\u010e9\3\2\2\2\u010f\u0110\b\36\1\2\u0110\u0111\t\4\2\2\u0111\u011e\5"+
		":\36\2\u0112\u0113\7\62\2\2\u0113\u011e\5:\36\2\u0114\u0115\7\17\2\2\u0115"+
		"\u0116\5:\36\2\u0116\u0117\7\20\2\2\u0117\u011e\3\2\2\2\u0118\u011e\5"+
		"\30\r\2\u0119\u011e\58\35\2\u011a\u011e\5\32\16\2\u011b\u011e\5$\23\2"+
		"\u011c\u011e\5\16\b\2\u011d\u010f\3\2\2\2\u011d\u0112\3\2\2\2\u011d\u0114"+
		"\3\2\2\2\u011d\u0118\3\2\2\2\u011d\u0119\3\2\2\2\u011d\u011a\3\2\2\2\u011d"+
		"\u011b\3\2\2\2\u011d\u011c\3\2\2\2\u011e\u0135\3\2\2\2\u011f\u0120\6\36"+
		"\4\3\u0120\u0121\t\5\2\2\u0121\u0134\5:\36\2\u0122\u0123\6\36\5\3\u0123"+
		"\u0124\t\4\2\2\u0124\u0134\5:\36\2\u0125\u0126\6\36\6\3\u0126\u0127\t"+
		"\6\2\2\u0127\u0134\5:\36\2\u0128\u0129\6\36\7\3\u0129\u012a\7\60\2\2\u012a"+
		"\u0134\5:\36\2\u012b\u012c\6\36\b\3\u012c\u012d\7\61\2\2\u012d\u0134\5"+
		":\36\2\u012e\u012f\6\36\t\3\u012f\u0130\7\21\2\2\u0130\u0131\5:\36\2\u0131"+
		"\u0132\7\22\2\2\u0132\u0134\3\2\2\2\u0133\u011f\3\2\2\2\u0133\u0122\3"+
		"\2\2\2\u0133\u0125\3\2\2\2\u0133\u0128\3\2\2\2\u0133\u012b\3\2\2\2\u0133"+
		"\u012e\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2"+
		"\2\2\u0136;\3\2\2\2\u0137\u0135\3\2\2\2\32AGNV`gs~\u0088\u0095\u00b4\u00b7"+
		"\u00be\u00c1\u00cc\u00d0\u00e9\u00ee\u00f9\u00fc\u0104\u011d\u0133\u0135";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
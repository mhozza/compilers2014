// Generated from src/Omnomnom.g4 by ANTLR 4.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OmnomnomParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__14=1, T__13=2, T__12=3, T__11=4, T__10=5, T__9=6, T__8=7, T__7=8, T__6=9, 
		T__5=10, T__4=11, T__3=12, T__2=13, T__1=14, T__0=15, WHILE=16, FOR=17, 
		IF=18, ELIF=19, ELSE=20, WRITE=21, READ=22, RET=23, EQ=24, NE=25, LE=26, 
		GE=27, GT=28, LT=29, ASSIGN=30, INC=31, DEC=32, MUL=33, DIV=34, ADD=35, 
		SUB=36, EXP=37, REM=38, ATTR=39, AND=40, OR=41, NOT=42, PAREN_OPEN=43, 
		PAREN_CLOSE=44, END_LINE=45, END_BLOCK=46, BOOL=47, INT=48, FLOAT=49, 
		NAME=50, STRING=51, WHITESPACE=52, DIGIT=53;
	public static final String[] tokenNames = {
		"<INVALID>", "'b'", "']'", "'a'", "','", "'_'", "'['", "'s'", "'d'", "'r'", 
		"'f'", "'l'", "'{'", "'i'", "'}'", "'g'", "'@'", "'#'", "'?'", "'!?'", 
		"'!'", "'<<'", "'>>'", "'ggwp'", "'=='", "'/='", "'<='", "'=>'", "'>'", 
		"'<'", "'='", "'++'", "'--'", "'*'", "'/'", "'+'", "'-'", "'^'", "'%'", 
		"'->'", "'&'", "'|'", "'~'", "'('", "')'", "';'", "'.'", "BOOL", "INT", 
		"FLOAT", "NAME", "STRING", "WHITESPACE", "DIGIT"
	};
	public static final int
		RULE_init = 0, RULE_block = 1, RULE_var = 2, RULE_id = 3, RULE_paramlist = 4, 
		RULE_arglist = 5, RULE_typelist = 6, RULE_extern = 7, RULE_function = 8, 
		RULE_fblock = 9, RULE_type = 10, RULE_val = 11, RULE_statement = 12, RULE_block_statement = 13, 
		RULE_inline_statement = 14, RULE_initialization = 15, RULE_definition = 16, 
		RULE_assignment = 17, RULE_expression = 18;
	public static final String[] ruleNames = {
		"init", "block", "var", "id", "paramlist", "arglist", "typelist", "extern", 
		"function", "fblock", "type", "val", "statement", "block_statement", "inline_statement", 
		"initialization", "definition", "assignment", "expression"
	};

	@Override
	public String getGrammarFileName() { return "Omnomnom.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public OmnomnomParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InitContext extends ParserRuleContext {
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public ExternContext extern(int i) {
			return getRuleContext(ExternContext.class,i);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public TerminalNode END_LINE(int i) {
			return getToken(OmnomnomParser.END_LINE, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> END_LINE() { return getTokens(OmnomnomParser.END_LINE); }
		public List<ExternContext> extern() {
			return getRuleContexts(ExternContext.class);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).exitInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OmnomnomVisitor ) return ((OmnomnomVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(38); extern();
					setState(39); match(END_LINE);
					}
					} 
				}
				setState(45);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(49);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(46); function();
					}
					} 
				}
				setState(51);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(52); block();
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
		public TerminalNode END_BLOCK() { return getToken(OmnomnomParser.END_BLOCK, 0); }
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OmnomnomVisitor ) return ((OmnomnomVisitor<? extends T>)visitor).visitBlock(this);
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
			setState(55); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(54); statement();
				}
				}
				setState(57); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 6) | (1L << 7) | (1L << 10) | (1L << 12) | (1L << 13) | (1L << WHILE) | (1L << FOR) | (1L << IF) | (1L << WRITE) | (1L << READ) | (1L << RET) | (1L << ADD) | (1L << SUB) | (1L << NOT) | (1L << PAREN_OPEN) | (1L << END_LINE) | (1L << BOOL) | (1L << INT) | (1L << FLOAT) | (1L << NAME) | (1L << STRING))) != 0) );
			setState(59); match(END_BLOCK);
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
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OmnomnomVisitor ) return ((OmnomnomVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61); type();
			setState(62); match(5);
			setState(63); id();
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

	public static class IdContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(OmnomnomParser.NAME, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OmnomnomVisitor ) return ((OmnomnomVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65); match(NAME);
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

	public static class ParamlistContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ParamlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).enterParamlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).exitParamlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OmnomnomVisitor ) return ((OmnomnomVisitor<? extends T>)visitor).visitParamlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamlistContext paramlist() throws RecognitionException {
		ParamlistContext _localctx = new ParamlistContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_paramlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); expression(0);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(68); match(4);
				setState(69); expression(0);
				}
				}
				setState(74);
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

	public static class ArglistContext extends ParserRuleContext {
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public ArglistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arglist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).enterArglist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).exitArglist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OmnomnomVisitor ) return ((OmnomnomVisitor<? extends T>)visitor).visitArglist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArglistContext arglist() throws RecognitionException {
		ArglistContext _localctx = new ArglistContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_arglist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75); var();
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(76); match(4);
				setState(77); var();
				}
				}
				setState(82);
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

	public static class TypelistContext extends ParserRuleContext {
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typelist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).enterTypelist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).exitTypelist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OmnomnomVisitor ) return ((OmnomnomVisitor<? extends T>)visitor).visitTypelist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypelistContext typelist() throws RecognitionException {
		TypelistContext _localctx = new TypelistContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_typelist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83); type();
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(84); match(4);
				setState(85); type();
				}
				}
				setState(90);
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

	public static class ExternContext extends ParserRuleContext {
		public TypelistContext typelist() {
			return getRuleContext(TypelistContext.class,0);
		}
		public TerminalNode PAREN_CLOSE() { return getToken(OmnomnomParser.PAREN_CLOSE, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(OmnomnomParser.PAREN_OPEN, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ExternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).enterExtern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).exitExtern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OmnomnomVisitor ) return ((OmnomnomVisitor<? extends T>)visitor).visitExtern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExternContext extern() throws RecognitionException {
		ExternContext _localctx = new ExternContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_extern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91); match(NOT);
			setState(92); var();
			setState(93); match(PAREN_OPEN);
			setState(95);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 6) | (1L << 7) | (1L << 10) | (1L << 12) | (1L << 13))) != 0)) {
				{
				setState(94); typelist();
				}
			}

			setState(97); match(PAREN_CLOSE);
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode PAREN_CLOSE() { return getToken(OmnomnomParser.PAREN_CLOSE, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(OmnomnomParser.PAREN_OPEN, 0); }
		public FblockContext fblock() {
			return getRuleContext(FblockContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ArglistContext arglist() {
			return getRuleContext(ArglistContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OmnomnomVisitor ) return ((OmnomnomVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99); var();
			setState(100); match(PAREN_OPEN);
			setState(102);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 6) | (1L << 7) | (1L << 10) | (1L << 12) | (1L << 13))) != 0)) {
				{
				setState(101); arglist();
				}
			}

			setState(104); match(PAREN_CLOSE);
			setState(105); fblock();
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

	public static class FblockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).enterFblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).exitFblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OmnomnomVisitor ) return ((OmnomnomVisitor<? extends T>)visitor).visitFblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FblockContext fblock() throws RecognitionException {
		FblockContext _localctx = new FblockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_fblock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107); block();
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
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypeBasicContext extends TypeContext {
		public TypeBasicContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).enterTypeBasic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).exitTypeBasic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OmnomnomVisitor ) return ((OmnomnomVisitor<? extends T>)visitor).visitTypeBasic(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeTupleContext extends TypeContext {
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeTupleContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).enterTypeTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).exitTypeTuple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OmnomnomVisitor ) return ((OmnomnomVisitor<? extends T>)visitor).visitTypeTuple(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeArrayContext extends TypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeArrayContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).enterTypeArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).exitTypeArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OmnomnomVisitor ) return ((OmnomnomVisitor<? extends T>)visitor).visitTypeArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_type);
		int _la;
		try {
			setState(120);
			switch (_input.LA(1)) {
			case 12:
				_localctx = new TypeArrayContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(109); match(12);
				setState(110); type();
				setState(111); match(14);
				}
				break;
			case 6:
				_localctx = new TypeTupleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(113); match(6);
				setState(114); type();
				setState(115); match(4);
				setState(116); type();
				setState(117); match(2);
				}
				break;
			case 1:
			case 7:
			case 10:
			case 13:
				_localctx = new TypeBasicContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 7) | (1L << 10) | (1L << 13))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
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

	public static class ValContext extends ParserRuleContext {
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
	 
		public ValContext() { }
		public void copyFrom(ValContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValTupleContext extends ValContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ValTupleContext(ValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).enterValTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).exitValTuple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OmnomnomVisitor ) return ((OmnomnomVisitor<? extends T>)visitor).visitValTuple(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValIdContext extends ValContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ValIdContext(ValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).enterValId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).exitValId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OmnomnomVisitor ) return ((OmnomnomVisitor<? extends T>)visitor).visitValId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValBoolContext extends ValContext {
		public TerminalNode BOOL() { return getToken(OmnomnomParser.BOOL, 0); }
		public ValBoolContext(ValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).enterValBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).exitValBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OmnomnomVisitor ) return ((OmnomnomVisitor<? extends T>)visitor).visitValBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValFloatContext extends ValContext {
		public TerminalNode FLOAT() { return getToken(OmnomnomParser.FLOAT, 0); }
		public ValFloatContext(ValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).enterValFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).exitValFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OmnomnomVisitor ) return ((OmnomnomVisitor<? extends T>)visitor).visitValFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValIntContext extends ValContext {
		public TerminalNode INT() { return getToken(OmnomnomParser.INT, 0); }
		public ValIntContext(ValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).enterValInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).exitValInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OmnomnomVisitor ) return ((OmnomnomVisitor<? extends T>)visitor).visitValInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValStringContext extends ValContext {
		public TerminalNode STRING() { return getToken(OmnomnomParser.STRING, 0); }
		public ValStringContext(ValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).enterValString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).exitValString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OmnomnomVisitor ) return ((OmnomnomVisitor<? extends T>)visitor).visitValString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValArrayContext extends ValContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ValArrayContext(ValContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).enterValArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).exitValArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OmnomnomVisitor ) return ((OmnomnomVisitor<? extends T>)visitor).visitValArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_val);
		int _la;
		try {
			setState(145);
			switch (_input.LA(1)) {
			case NAME:
				_localctx = new ValIdContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(122); id();
				}
				break;
			case INT:
				_localctx = new ValIntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(123); match(INT);
				}
				break;
			case FLOAT:
				_localctx = new ValFloatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(124); match(FLOAT);
				}
				break;
			case STRING:
				_localctx = new ValStringContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(125); match(STRING);
				}
				break;
			case BOOL:
				_localctx = new ValBoolContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(126); match(BOOL);
				}
				break;
			case 12:
				_localctx = new ValArrayContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(127); match(12);
				setState(136);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 12) | (1L << ADD) | (1L << SUB) | (1L << NOT) | (1L << PAREN_OPEN) | (1L << BOOL) | (1L << INT) | (1L << FLOAT) | (1L << NAME) | (1L << STRING))) != 0)) {
					{
					setState(128); expression(0);
					setState(133);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==4) {
						{
						{
						setState(129); match(4);
						setState(130); expression(0);
						}
						}
						setState(135);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(138); match(14);
				}
				break;
			case 6:
				_localctx = new ValTupleContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(139); match(6);
				setState(140); expression(0);
				setState(141); match(4);
				setState(142); expression(0);
				setState(143); match(2);
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

	public static class StatementContext extends ParserRuleContext {
		public Block_statementContext block_statement() {
			return getRuleContext(Block_statementContext.class,0);
		}
		public TerminalNode END_LINE() { return getToken(OmnomnomParser.END_LINE, 0); }
		public Inline_statementContext inline_statement() {
			return getRuleContext(Inline_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OmnomnomVisitor ) return ((OmnomnomVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statement);
		try {
			setState(151);
			switch (_input.LA(1)) {
			case 1:
			case 6:
			case 7:
			case 10:
			case 12:
			case 13:
			case WRITE:
			case READ:
			case RET:
			case ADD:
			case SUB:
			case NOT:
			case PAREN_OPEN:
			case END_LINE:
			case BOOL:
			case INT:
			case FLOAT:
			case NAME:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(147); inline_statement();
				setState(148); match(END_LINE);
				}
				break;
			case WHILE:
			case FOR:
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(150); block_statement();
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

	public static class Block_statementContext extends ParserRuleContext {
		public Block_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_statement; }
	 
		public Block_statementContext() { }
		public void copyFrom(Block_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileContext extends Block_statementContext {
		public TerminalNode WHILE() { return getToken(OmnomnomParser.WHILE, 0); }
		public TerminalNode PAREN_CLOSE() { return getToken(OmnomnomParser.PAREN_CLOSE, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(OmnomnomParser.PAREN_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileContext(Block_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OmnomnomVisitor ) return ((OmnomnomVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForContext extends Block_statementContext {
		public TerminalNode PAREN_CLOSE() { return getToken(OmnomnomParser.PAREN_CLOSE, 0); }
		public TerminalNode FOR() { return getToken(OmnomnomParser.FOR, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode PAREN_OPEN() { return getToken(OmnomnomParser.PAREN_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public InitializationContext initialization() {
			return getRuleContext(InitializationContext.class,0);
		}
		public ForContext(Block_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OmnomnomVisitor ) return ((OmnomnomVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfContext extends Block_statementContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IF() { return getToken(OmnomnomParser.IF, 0); }
		public TerminalNode ELSE() { return getToken(OmnomnomParser.ELSE, 0); }
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode ELIF(int i) {
			return getToken(OmnomnomParser.ELIF, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public List<TerminalNode> ELIF() { return getTokens(OmnomnomParser.ELIF); }
		public IfContext(Block_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OmnomnomVisitor ) return ((OmnomnomVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_statementContext block_statement() throws RecognitionException {
		Block_statementContext _localctx = new Block_statementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_block_statement);
		int _la;
		try {
			setState(185);
			switch (_input.LA(1)) {
			case IF:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(153); match(IF);
				setState(154); expression(0);
				setState(155); block();
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELIF) {
					{
					{
					setState(156); match(ELIF);
					setState(157); expression(0);
					setState(158); block();
					}
					}
					setState(164);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(167);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(165); match(ELSE);
					setState(166); block();
					}
				}

				}
				break;
			case WHILE:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(169); match(WHILE);
				setState(170); match(PAREN_OPEN);
				setState(171); expression(0);
				setState(172); match(PAREN_CLOSE);
				setState(173); block();
				}
				break;
			case FOR:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(175); match(FOR);
				setState(176); match(PAREN_OPEN);
				setState(177); initialization();
				setState(178); match(4);
				setState(179); expression(0);
				setState(180); match(4);
				setState(181); assignment();
				setState(182); match(PAREN_CLOSE);
				setState(183); block();
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

	public static class Inline_statementContext extends ParserRuleContext {
		public Inline_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inline_statement; }
	 
		public Inline_statementContext() { }
		public void copyFrom(Inline_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpContext extends Inline_statementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpContext(Inline_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OmnomnomVisitor ) return ((OmnomnomVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EmpContext extends Inline_statementContext {
		public EmpContext(Inline_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).enterEmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).exitEmp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OmnomnomVisitor ) return ((OmnomnomVisitor<? extends T>)visitor).visitEmp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignContext extends Inline_statementContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignContext(Inline_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OmnomnomVisitor ) return ((OmnomnomVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WriteContext extends Inline_statementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode WRITE() { return getToken(OmnomnomParser.WRITE, 0); }
		public WriteContext(Inline_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).enterWrite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).exitWrite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OmnomnomVisitor ) return ((OmnomnomVisitor<? extends T>)visitor).visitWrite(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReadContext extends Inline_statementContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode READ() { return getToken(OmnomnomParser.READ, 0); }
		public ReadContext(Inline_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).exitRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OmnomnomVisitor ) return ((OmnomnomVisitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RemoveContext extends Inline_statementContext {
		public TerminalNode PAREN_CLOSE() { return getToken(OmnomnomParser.PAREN_CLOSE, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode PAREN_OPEN() { return getToken(OmnomnomParser.PAREN_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ATTR() { return getToken(OmnomnomParser.ATTR, 0); }
		public RemoveContext(Inline_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).enterRemove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).exitRemove(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OmnomnomVisitor ) return ((OmnomnomVisitor<? extends T>)visitor).visitRemove(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AppendContext extends Inline_statementContext {
		public TerminalNode PAREN_CLOSE() { return getToken(OmnomnomParser.PAREN_CLOSE, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode PAREN_OPEN() { return getToken(OmnomnomParser.PAREN_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ATTR() { return getToken(OmnomnomParser.ATTR, 0); }
		public AppendContext(Inline_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).enterAppend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).exitAppend(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OmnomnomVisitor ) return ((OmnomnomVisitor<? extends T>)visitor).visitAppend(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeleteContext extends Inline_statementContext {
		public TerminalNode PAREN_CLOSE() { return getToken(OmnomnomParser.PAREN_CLOSE, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode PAREN_OPEN() { return getToken(OmnomnomParser.PAREN_OPEN, 0); }
		public TerminalNode ATTR() { return getToken(OmnomnomParser.ATTR, 0); }
		public DeleteContext(Inline_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).enterDelete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).exitDelete(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OmnomnomVisitor ) return ((OmnomnomVisitor<? extends T>)visitor).visitDelete(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetContext extends Inline_statementContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PAREN_CLOSE() { return getToken(OmnomnomParser.PAREN_CLOSE, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode PAREN_OPEN() { return getToken(OmnomnomParser.PAREN_OPEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode ATTR() { return getToken(OmnomnomParser.ATTR, 0); }
		public SetContext(Inline_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).enterSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).exitSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OmnomnomVisitor ) return ((OmnomnomVisitor<? extends T>)visitor).visitSet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DefContext extends Inline_statementContext {
		public DefinitionContext definition() {
			return getRuleContext(DefinitionContext.class,0);
		}
		public DefContext(Inline_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).enterDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).exitDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OmnomnomVisitor ) return ((OmnomnomVisitor<? extends T>)visitor).visitDef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RetContext extends Inline_statementContext {
		public TerminalNode RET() { return getToken(OmnomnomParser.RET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RetContext(Inline_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).enterRet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).exitRet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OmnomnomVisitor ) return ((OmnomnomVisitor<? extends T>)visitor).visitRet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inline_statementContext inline_statement() throws RecognitionException {
		Inline_statementContext _localctx = new Inline_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_inline_statement);
		int _la;
		try {
			setState(228);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new ReadContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(187); match(READ);
				setState(188); id();
				}
				break;

			case 2:
				_localctx = new WriteContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(189); match(WRITE);
				setState(190); expression(0);
				}
				break;

			case 3:
				_localctx = new DefContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(191); definition();
				}
				break;

			case 4:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(192); assignment();
				}
				break;

			case 5:
				_localctx = new ExpContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(193); expression(0);
				}
				break;

			case 6:
				_localctx = new RetContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(194); match(RET);
				setState(196);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 12) | (1L << ADD) | (1L << SUB) | (1L << NOT) | (1L << PAREN_OPEN) | (1L << BOOL) | (1L << INT) | (1L << FLOAT) | (1L << NAME) | (1L << STRING))) != 0)) {
					{
					setState(195); expression(0);
					}
				}

				}
				break;

			case 7:
				_localctx = new RemoveContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(198); id();
				setState(199); match(ATTR);
				setState(200); match(9);
				setState(201); match(PAREN_OPEN);
				setState(202); expression(0);
				setState(203); match(PAREN_CLOSE);
				}
				break;

			case 8:
				_localctx = new AppendContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(205); id();
				setState(206); match(ATTR);
				setState(207); match(3);
				setState(208); match(PAREN_OPEN);
				setState(209); expression(0);
				setState(210); match(PAREN_CLOSE);
				}
				break;

			case 9:
				_localctx = new DeleteContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(212); id();
				setState(213); match(ATTR);
				setState(214); match(8);
				setState(215); match(PAREN_OPEN);
				setState(216); match(PAREN_CLOSE);
				}
				break;

			case 10:
				_localctx = new SetContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(218); id();
				setState(219); match(ATTR);
				setState(220); match(7);
				setState(221); match(PAREN_OPEN);
				setState(222); expression(0);
				setState(223); match(4);
				setState(224); expression(0);
				setState(225); match(PAREN_CLOSE);
				}
				break;

			case 11:
				_localctx = new EmpContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
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

	public static class InitializationContext extends ParserRuleContext {
		public DefinitionContext definition() {
			return getRuleContext(DefinitionContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public InitializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).enterInitialization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).exitInitialization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OmnomnomVisitor ) return ((OmnomnomVisitor<? extends T>)visitor).visitInitialization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializationContext initialization() throws RecognitionException {
		InitializationContext _localctx = new InitializationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_initialization);
		try {
			setState(232);
			switch (_input.LA(1)) {
			case 1:
			case 6:
			case 7:
			case 10:
			case 12:
			case 13:
				enterOuterAlt(_localctx, 1);
				{
				setState(230); definition();
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(231); assignment();
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

	public static class DefinitionContext extends ParserRuleContext {
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
	 
		public DefinitionContext() { }
		public void copyFrom(DefinitionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarDefContext extends DefinitionContext {
		public TerminalNode ASSIGN() { return getToken(OmnomnomParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public VarDefContext(DefinitionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).enterVarDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).exitVarDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OmnomnomVisitor ) return ((OmnomnomVisitor<? extends T>)visitor).visitVarDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_definition);
		int _la;
		try {
			_localctx = new VarDefContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(234); var();
			setState(237);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(235); match(ASSIGN);
				setState(236); expression(0);
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

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SimpleAssignContext extends AssignmentContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(OmnomnomParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SimpleAssignContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).enterSimpleAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).exitSimpleAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OmnomnomVisitor ) return ((OmnomnomVisitor<? extends T>)visitor).visitSimpleAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IncContext extends AssignmentContext {
		public Token op;
		public TerminalNode INC() { return getToken(OmnomnomParser.INC, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode DEC() { return getToken(OmnomnomParser.DEC, 0); }
		public IncContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).enterInc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).exitInc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OmnomnomVisitor ) return ((OmnomnomVisitor<? extends T>)visitor).visitInc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assignment);
		int _la;
		try {
			setState(246);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new SimpleAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(239); id();
				setState(240); match(ASSIGN);
				setState(241); expression(0);
				}
				break;

			case 2:
				_localctx = new IncContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(243); id();
				setState(244);
				((IncContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INC || _la==DEC) ) {
					((IncContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
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
	public static class BinContext extends ExpressionContext {
		public Token op;
		public TerminalNode MUL() { return getToken(OmnomnomParser.MUL, 0); }
		public TerminalNode AND() { return getToken(OmnomnomParser.AND, 0); }
		public TerminalNode OR() { return getToken(OmnomnomParser.OR, 0); }
		public TerminalNode LE() { return getToken(OmnomnomParser.LE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode GE() { return getToken(OmnomnomParser.GE, 0); }
		public TerminalNode ADD() { return getToken(OmnomnomParser.ADD, 0); }
		public TerminalNode EQ() { return getToken(OmnomnomParser.EQ, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode DIV() { return getToken(OmnomnomParser.DIV, 0); }
		public TerminalNode LT() { return getToken(OmnomnomParser.LT, 0); }
		public TerminalNode NE() { return getToken(OmnomnomParser.NE, 0); }
		public TerminalNode GT() { return getToken(OmnomnomParser.GT, 0); }
		public TerminalNode REM() { return getToken(OmnomnomParser.REM, 0); }
		public TerminalNode SUB() { return getToken(OmnomnomParser.SUB, 0); }
		public BinContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).enterBin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).exitBin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OmnomnomVisitor ) return ((OmnomnomVisitor<? extends T>)visitor).visitBin(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValueContext extends ExpressionContext {
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public ValueContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OmnomnomVisitor ) return ((OmnomnomVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FCallContext extends ExpressionContext {
		public TerminalNode PAREN_CLOSE() { return getToken(OmnomnomParser.PAREN_CLOSE, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ParamlistContext paramlist() {
			return getRuleContext(ParamlistContext.class,0);
		}
		public TerminalNode PAREN_OPEN() { return getToken(OmnomnomParser.PAREN_OPEN, 0); }
		public FCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).enterFCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).exitFCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OmnomnomVisitor ) return ((OmnomnomVisitor<? extends T>)visitor).visitFCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExponContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EXP() { return getToken(OmnomnomParser.EXP, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExponContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).enterExpon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).exitExpon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OmnomnomVisitor ) return ((OmnomnomVisitor<? extends T>)visitor).visitExpon(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LengthContext extends ExpressionContext {
		public TerminalNode PAREN_CLOSE() { return getToken(OmnomnomParser.PAREN_CLOSE, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode PAREN_OPEN() { return getToken(OmnomnomParser.PAREN_OPEN, 0); }
		public TerminalNode ATTR() { return getToken(OmnomnomParser.ATTR, 0); }
		public LengthContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).enterLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).exitLength(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OmnomnomVisitor ) return ((OmnomnomVisitor<? extends T>)visitor).visitLength(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaContext extends ExpressionContext {
		public Token op;
		public TerminalNode NOT() { return getToken(OmnomnomParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SUB() { return getToken(OmnomnomParser.SUB, 0); }
		public TerminalNode ADD() { return getToken(OmnomnomParser.ADD, 0); }
		public UnaContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).enterUna(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).exitUna(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OmnomnomVisitor ) return ((OmnomnomVisitor<? extends T>)visitor).visitUna(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GetTupleContext extends ExpressionContext {
		public Token op;
		public TerminalNode PAREN_CLOSE() { return getToken(OmnomnomParser.PAREN_CLOSE, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode PAREN_OPEN() { return getToken(OmnomnomParser.PAREN_OPEN, 0); }
		public TerminalNode ATTR() { return getToken(OmnomnomParser.ATTR, 0); }
		public GetTupleContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).enterGetTuple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).exitGetTuple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OmnomnomVisitor ) return ((OmnomnomVisitor<? extends T>)visitor).visitGetTuple(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParContext extends ExpressionContext {
		public TerminalNode PAREN_CLOSE() { return getToken(OmnomnomParser.PAREN_CLOSE, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(OmnomnomParser.PAREN_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).enterPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).exitPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OmnomnomVisitor ) return ((OmnomnomVisitor<? extends T>)visitor).visitPar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GetContext extends ExpressionContext {
		public TerminalNode PAREN_CLOSE() { return getToken(OmnomnomParser.PAREN_CLOSE, 0); }
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public TerminalNode PAREN_OPEN() { return getToken(OmnomnomParser.PAREN_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ATTR() { return getToken(OmnomnomParser.ATTR, 0); }
		public GetContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).enterGet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OmnomnomListener ) ((OmnomnomListener)listener).exitGet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OmnomnomVisitor ) return ((OmnomnomVisitor<? extends T>)visitor).visitGet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState, _p);
		ExpressionContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				_localctx = new UnaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(249);
				((UnaContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUB) | (1L << NOT))) != 0)) ) {
					((UnaContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(250); expression(2);
				}
				break;

			case 2:
				{
				_localctx = new ParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(251); match(PAREN_OPEN);
				setState(252); expression(0);
				setState(253); match(PAREN_CLOSE);
				}
				break;

			case 3:
				{
				_localctx = new FCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(255); id();
				setState(256); match(PAREN_OPEN);
				setState(258);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 12) | (1L << ADD) | (1L << SUB) | (1L << NOT) | (1L << PAREN_OPEN) | (1L << BOOL) | (1L << INT) | (1L << FLOAT) | (1L << NAME) | (1L << STRING))) != 0)) {
					{
					setState(257); paramlist();
					}
				}

				setState(260); match(PAREN_CLOSE);
				}
				break;

			case 4:
				{
				_localctx = new GetContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(262); id();
				setState(263); match(ATTR);
				setState(264); match(15);
				setState(265); match(PAREN_OPEN);
				setState(266); expression(0);
				setState(267); match(PAREN_CLOSE);
				}
				break;

			case 5:
				{
				_localctx = new LengthContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(269); id();
				setState(270); match(ATTR);
				setState(271); match(11);
				setState(272); match(PAREN_OPEN);
				setState(273); match(PAREN_CLOSE);
				}
				break;

			case 6:
				{
				_localctx = new GetTupleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(275); id();
				setState(276); match(ATTR);
				setState(277);
				((GetTupleContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==7 || _la==10) ) {
					((GetTupleContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(278); match(PAREN_OPEN);
				setState(279); match(PAREN_CLOSE);
				}
				break;

			case 7:
				{
				_localctx = new ValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(281); val();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(292);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(290);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new BinContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(284);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(285);
						((BinContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NE) | (1L << LE) | (1L << GE) | (1L << GT) | (1L << LT) | (1L << MUL) | (1L << DIV) | (1L << ADD) | (1L << SUB) | (1L << REM) | (1L << AND) | (1L << OR))) != 0)) ) {
							((BinContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(286); expression(5);
						}
						break;

					case 2:
						{
						_localctx = new ExponContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(287);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(288); ((ExponContext)_localctx).op = match(EXP);
						setState(289); expression(3);
						}
						break;
					}
					} 
				}
				setState(294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		case 18: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 4 >= _localctx._p;

		case 1: return 3 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\67\u012a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\7\2,\n\2\f\2\16\2/\13\2\3\2\7\2\62\n"+
		"\2\f\2\16\2\65\13\2\3\2\3\2\3\3\6\3:\n\3\r\3\16\3;\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\6\7\6I\n\6\f\6\16\6L\13\6\3\7\3\7\3\7\7\7Q\n\7"+
		"\f\7\16\7T\13\7\3\b\3\b\3\b\7\bY\n\b\f\b\16\b\\\13\b\3\t\3\t\3\t\3\t\5"+
		"\tb\n\t\3\t\3\t\3\n\3\n\3\n\5\ni\n\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f{\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\7\r\u0086\n\r\f\r\16\r\u0089\13\r\5\r\u008b\n\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\5\r\u0094\n\r\3\16\3\16\3\16\3\16\5\16\u009a\n\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00a3\n\17\f\17\16\17\u00a6\13\17"+
		"\3\17\3\17\5\17\u00aa\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00bc\n\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u00c7\n\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00e7\n\20\3\21"+
		"\3\21\5\21\u00eb\n\21\3\22\3\22\3\22\5\22\u00f0\n\22\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\5\23\u00f9\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\5\24\u0105\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\5\24\u011d\n\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0125\n\24\f\24\16"+
		"\24\u0128\13\24\3\24\2\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&"+
		"\2\7\6\2\3\3\t\t\f\f\17\17\3\2!\"\4\2%&,,\4\2\t\t\f\f\6\2\32\37#&((*+"+
		"\u0144\2-\3\2\2\2\49\3\2\2\2\6?\3\2\2\2\bC\3\2\2\2\nE\3\2\2\2\fM\3\2\2"+
		"\2\16U\3\2\2\2\20]\3\2\2\2\22e\3\2\2\2\24m\3\2\2\2\26z\3\2\2\2\30\u0093"+
		"\3\2\2\2\32\u0099\3\2\2\2\34\u00bb\3\2\2\2\36\u00e6\3\2\2\2 \u00ea\3\2"+
		"\2\2\"\u00ec\3\2\2\2$\u00f8\3\2\2\2&\u011c\3\2\2\2()\5\20\t\2)*\7/\2\2"+
		"*,\3\2\2\2+(\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\63\3\2\2\2/-\3\2\2"+
		"\2\60\62\5\22\n\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2"+
		"\2\2\64\66\3\2\2\2\65\63\3\2\2\2\66\67\5\4\3\2\67\3\3\2\2\28:\5\32\16"+
		"\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<=\3\2\2\2=>\7\60\2\2>\5\3\2"+
		"\2\2?@\5\26\f\2@A\7\7\2\2AB\5\b\5\2B\7\3\2\2\2CD\7\64\2\2D\t\3\2\2\2E"+
		"J\5&\24\2FG\7\6\2\2GI\5&\24\2HF\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2"+
		"K\13\3\2\2\2LJ\3\2\2\2MR\5\6\4\2NO\7\6\2\2OQ\5\6\4\2PN\3\2\2\2QT\3\2\2"+
		"\2RP\3\2\2\2RS\3\2\2\2S\r\3\2\2\2TR\3\2\2\2UZ\5\26\f\2VW\7\6\2\2WY\5\26"+
		"\f\2XV\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\17\3\2\2\2\\Z\3\2\2\2]"+
		"^\7,\2\2^_\5\6\4\2_a\7-\2\2`b\5\16\b\2a`\3\2\2\2ab\3\2\2\2bc\3\2\2\2c"+
		"d\7.\2\2d\21\3\2\2\2ef\5\6\4\2fh\7-\2\2gi\5\f\7\2hg\3\2\2\2hi\3\2\2\2"+
		"ij\3\2\2\2jk\7.\2\2kl\5\24\13\2l\23\3\2\2\2mn\5\4\3\2n\25\3\2\2\2op\7"+
		"\16\2\2pq\5\26\f\2qr\7\20\2\2r{\3\2\2\2st\7\b\2\2tu\5\26\f\2uv\7\6\2\2"+
		"vw\5\26\f\2wx\7\4\2\2x{\3\2\2\2y{\t\2\2\2zo\3\2\2\2zs\3\2\2\2zy\3\2\2"+
		"\2{\27\3\2\2\2|\u0094\5\b\5\2}\u0094\7\62\2\2~\u0094\7\63\2\2\177\u0094"+
		"\7\65\2\2\u0080\u0094\7\61\2\2\u0081\u008a\7\16\2\2\u0082\u0087\5&\24"+
		"\2\u0083\u0084\7\6\2\2\u0084\u0086\5&\24\2\u0085\u0083\3\2\2\2\u0086\u0089"+
		"\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008b\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u008a\u0082\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2"+
		"\2\2\u008c\u0094\7\20\2\2\u008d\u008e\7\b\2\2\u008e\u008f\5&\24\2\u008f"+
		"\u0090\7\6\2\2\u0090\u0091\5&\24\2\u0091\u0092\7\4\2\2\u0092\u0094\3\2"+
		"\2\2\u0093|\3\2\2\2\u0093}\3\2\2\2\u0093~\3\2\2\2\u0093\177\3\2\2\2\u0093"+
		"\u0080\3\2\2\2\u0093\u0081\3\2\2\2\u0093\u008d\3\2\2\2\u0094\31\3\2\2"+
		"\2\u0095\u0096\5\36\20\2\u0096\u0097\7/\2\2\u0097\u009a\3\2\2\2\u0098"+
		"\u009a\5\34\17\2\u0099\u0095\3\2\2\2\u0099\u0098\3\2\2\2\u009a\33\3\2"+
		"\2\2\u009b\u009c\7\24\2\2\u009c\u009d\5&\24\2\u009d\u00a4\5\4\3\2\u009e"+
		"\u009f\7\25\2\2\u009f\u00a0\5&\24\2\u00a0\u00a1\5\4\3\2\u00a1\u00a3\3"+
		"\2\2\2\u00a2\u009e\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4"+
		"\u00a5\3\2\2\2\u00a5\u00a9\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a8\7\26"+
		"\2\2\u00a8\u00aa\5\4\3\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00bc\3\2\2\2\u00ab\u00ac\7\22\2\2\u00ac\u00ad\7-\2\2\u00ad\u00ae\5&"+
		"\24\2\u00ae\u00af\7.\2\2\u00af\u00b0\5\4\3\2\u00b0\u00bc\3\2\2\2\u00b1"+
		"\u00b2\7\23\2\2\u00b2\u00b3\7-\2\2\u00b3\u00b4\5 \21\2\u00b4\u00b5\7\6"+
		"\2\2\u00b5\u00b6\5&\24\2\u00b6\u00b7\7\6\2\2\u00b7\u00b8\5$\23\2\u00b8"+
		"\u00b9\7.\2\2\u00b9\u00ba\5\4\3\2\u00ba\u00bc\3\2\2\2\u00bb\u009b\3\2"+
		"\2\2\u00bb\u00ab\3\2\2\2\u00bb\u00b1\3\2\2\2\u00bc\35\3\2\2\2\u00bd\u00be"+
		"\7\30\2\2\u00be\u00e7\5\b\5\2\u00bf\u00c0\7\27\2\2\u00c0\u00e7\5&\24\2"+
		"\u00c1\u00e7\5\"\22\2\u00c2\u00e7\5$\23\2\u00c3\u00e7\5&\24\2\u00c4\u00c6"+
		"\7\31\2\2\u00c5\u00c7\5&\24\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2"+
		"\u00c7\u00e7\3\2\2\2\u00c8\u00c9\5\b\5\2\u00c9\u00ca\7)\2\2\u00ca\u00cb"+
		"\7\13\2\2\u00cb\u00cc\7-\2\2\u00cc\u00cd\5&\24\2\u00cd\u00ce\7.\2\2\u00ce"+
		"\u00e7\3\2\2\2\u00cf\u00d0\5\b\5\2\u00d0\u00d1\7)\2\2\u00d1\u00d2\7\5"+
		"\2\2\u00d2\u00d3\7-\2\2\u00d3\u00d4\5&\24\2\u00d4\u00d5\7.\2\2\u00d5\u00e7"+
		"\3\2\2\2\u00d6\u00d7\5\b\5\2\u00d7\u00d8\7)\2\2\u00d8\u00d9\7\n\2\2\u00d9"+
		"\u00da\7-\2\2\u00da\u00db\7.\2\2\u00db\u00e7\3\2\2\2\u00dc\u00dd\5\b\5"+
		"\2\u00dd\u00de\7)\2\2\u00de\u00df\7\t\2\2\u00df\u00e0\7-\2\2\u00e0\u00e1"+
		"\5&\24\2\u00e1\u00e2\7\6\2\2\u00e2\u00e3\5&\24\2\u00e3\u00e4\7.\2\2\u00e4"+
		"\u00e7\3\2\2\2\u00e5\u00e7\3\2\2\2\u00e6\u00bd\3\2\2\2\u00e6\u00bf\3\2"+
		"\2\2\u00e6\u00c1\3\2\2\2\u00e6\u00c2\3\2\2\2\u00e6\u00c3\3\2\2\2\u00e6"+
		"\u00c4\3\2\2\2\u00e6\u00c8\3\2\2\2\u00e6\u00cf\3\2\2\2\u00e6\u00d6\3\2"+
		"\2\2\u00e6\u00dc\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7\37\3\2\2\2\u00e8\u00eb"+
		"\5\"\22\2\u00e9\u00eb\5$\23\2\u00ea\u00e8\3\2\2\2\u00ea\u00e9\3\2\2\2"+
		"\u00eb!\3\2\2\2\u00ec\u00ef\5\6\4\2\u00ed\u00ee\7 \2\2\u00ee\u00f0\5&"+
		"\24\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0#\3\2\2\2\u00f1\u00f2"+
		"\5\b\5\2\u00f2\u00f3\7 \2\2\u00f3\u00f4\5&\24\2\u00f4\u00f9\3\2\2\2\u00f5"+
		"\u00f6\5\b\5\2\u00f6\u00f7\t\3\2\2\u00f7\u00f9\3\2\2\2\u00f8\u00f1\3\2"+
		"\2\2\u00f8\u00f5\3\2\2\2\u00f9%\3\2\2\2\u00fa\u00fb\b\24\1\2\u00fb\u00fc"+
		"\t\4\2\2\u00fc\u011d\5&\24\2\u00fd\u00fe\7-\2\2\u00fe\u00ff\5&\24\2\u00ff"+
		"\u0100\7.\2\2\u0100\u011d\3\2\2\2\u0101\u0102\5\b\5\2\u0102\u0104\7-\2"+
		"\2\u0103\u0105\5\n\6\2\u0104\u0103\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106"+
		"\3\2\2\2\u0106\u0107\7.\2\2\u0107\u011d\3\2\2\2\u0108\u0109\5\b\5\2\u0109"+
		"\u010a\7)\2\2\u010a\u010b\7\21\2\2\u010b\u010c\7-\2\2\u010c\u010d\5&\24"+
		"\2\u010d\u010e\7.\2\2\u010e\u011d\3\2\2\2\u010f\u0110\5\b\5\2\u0110\u0111"+
		"\7)\2\2\u0111\u0112\7\r\2\2\u0112\u0113\7-\2\2\u0113\u0114\7.\2\2\u0114"+
		"\u011d\3\2\2\2\u0115\u0116\5\b\5\2\u0116\u0117\7)\2\2\u0117\u0118\t\5"+
		"\2\2\u0118\u0119\7-\2\2\u0119\u011a\7.\2\2\u011a\u011d\3\2\2\2\u011b\u011d"+
		"\5\30\r\2\u011c\u00fa\3\2\2\2\u011c\u00fd\3\2\2\2\u011c\u0101\3\2\2\2"+
		"\u011c\u0108\3\2\2\2\u011c\u010f\3\2\2\2\u011c\u0115\3\2\2\2\u011c\u011b"+
		"\3\2\2\2\u011d\u0126\3\2\2\2\u011e\u011f\6\24\2\3\u011f\u0120\t\6\2\2"+
		"\u0120\u0125\5&\24\2\u0121\u0122\6\24\3\3\u0122\u0123\7\'\2\2\u0123\u0125"+
		"\5&\24\2\u0124\u011e\3\2\2\2\u0124\u0121\3\2\2\2\u0125\u0128\3\2\2\2\u0126"+
		"\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\'\3\2\2\2\u0128\u0126\3\2\2\2"+
		"\33-\63;JRZahz\u0087\u008a\u0093\u0099\u00a4\u00a9\u00bb\u00c6\u00e6\u00ea"+
		"\u00ef\u00f8\u0104\u011c\u0124\u0126";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from ./Arrows.g4 by ANTLR 4.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ArrowsParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__2=1, T__1=2, T__0=3, COMMENT=4, SPACES=5, NEWLINE=6, LA=7, LPA=8, LSA=9, 
		LDA=10, LMA=11, LRA=12, RA=13, RPA=14, RSA=15, RDA=16, RMA=17, RRA=18, 
		SWAP=19, IS=20, ISL=21, OS=22, OL=23, OSL=24, RET=25, INT=26, MUL=27, 
		DIV=28, ADD=29, SUB=30, LR=31, RR=32, DOTS=33, WHITESPACE=34, EQ=35, PEQ=36, 
		IF=37, ELSE=38, WHILE=39, FOR=40, PASS=41, AND=42, OR=43, NOT=44, PAREN_OPEN=45, 
		PAREN_CLOSE=46, STRING=47, ANYSTRING=48, COMMA=49, QUOT=50, QO=51, INDENT=52, 
		DEDENT=53;
	public static final String[] tokenNames = {
		"<INVALID>", "':'", "'--'", "'++'", "COMMENT", "SPACES", "NEWLINE", "'>>'", 
		"'+>'", "'->'", "'/>'", "'*>'", "'&>'", "'<<'", "'<+'", "'<-'", "'</'", 
		"'<*'", "'<&'", "'<->'", "'@>'", "'$>'", "'<@'", "'<!'", "'<$'", "'ret'", 
		"INT", "'*'", "'/'", "'+'", "'-'", "'['", "']'", "'..'", "WHITESPACE", 
		"'='", "'=='", "'if'", "'else'", "'while'", "'for'", "'pass'", "'&'", 
		"'|'", "'!'", "'('", "')'", "STRING", "ANYSTRING", "','", "'\"'", "'?'", 
		"INDENT", "DEDENT"
	};
	public static final int
		RULE_init = 0, RULE_functions = 1, RULE_function = 2, RULE_statements = 3, 
		RULE_block = 4, RULE_statement = 5, RULE_expression = 6, RULE_lvalue = 7, 
		RULE_args = 8, RULE_params = 9, RULE_arrow = 10, RULE_range = 11;
	public static final String[] ruleNames = {
		"init", "functions", "function", "statements", "block", "statement", "expression", 
		"lvalue", "args", "params", "arrow", "range"
	};

	@Override
	public String getGrammarFileName() { return "Arrows.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public ArrowsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InitContext extends ParserRuleContext {
		public FunctionsContext functions() {
			return getRuleContext(FunctionsContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24); functions();
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

	public static class FunctionsContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(ArrowsParser.NEWLINE); }
		public TerminalNode EOF() { return getToken(ArrowsParser.EOF, 0); }
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public TerminalNode NEWLINE(int i) {
			return getToken(ArrowsParser.NEWLINE, i);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public FunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitFunctions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionsContext functions() throws RecognitionException {
		FunctionsContext _localctx = new FunctionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_functions);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(26); match(NEWLINE);
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32); function();
			setState(42);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(36);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(33); match(NEWLINE);
						}
						}
						setState(38);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(39); function();
					}
					} 
				}
				setState(44);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(45); match(NEWLINE);
				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(51); match(EOF);
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
		public TerminalNode NEWLINE() { return getToken(ArrowsParser.NEWLINE, 0); }
		public TerminalNode PAREN_CLOSE() { return getToken(ArrowsParser.PAREN_CLOSE, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode PAREN_OPEN() { return getToken(ArrowsParser.PAREN_OPEN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53); lvalue();
			setState(54); match(PAREN_OPEN);
			setState(55); args();
			setState(56); match(PAREN_CLOSE);
			setState(57); match(NEWLINE);
			setState(58); block();
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
		public List<TerminalNode> NEWLINE() { return getTokens(ArrowsParser.NEWLINE); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode NEWLINE(int i) {
			return getToken(ArrowsParser.NEWLINE, i);
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
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60); statement();
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(61); match(NEWLINE);
				setState(62); statement();
				}
				}
				setState(67);
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
		public TerminalNode INDENT() { return getToken(ArrowsParser.INDENT, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(ArrowsParser.DEDENT, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68); match(INDENT);
			setState(69); statements();
			setState(70); match(DEDENT);
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
	public static class IoContext extends StatementContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrowContext arrow(int i) {
			return getRuleContext(ArrowContext.class,i);
		}
		public List<ArrowContext> arrow() {
			return getRuleContexts(ArrowContext.class);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public IoContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterIo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitIo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitIo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlckContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlckContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterBlck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitBlck(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitBlck(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileContext extends StatementContext {
		public TerminalNode NEWLINE() { return getToken(ArrowsParser.NEWLINE, 0); }
		public TerminalNode WHILE() { return getToken(ArrowsParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArwContext extends StatementContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrowContext arrow(int i) {
			return getRuleContext(ArrowContext.class,i);
		}
		public List<ArrowContext> arrow() {
			return getRuleContexts(ArrowContext.class);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ArwContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterArw(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitArw(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitArw(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnContext extends StatementContext {
		public TerminalNode RET() { return getToken(ArrowsParser.RET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForContext extends StatementContext {
		public TerminalNode NEWLINE() { return getToken(ArrowsParser.NEWLINE, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode FOR() { return getToken(ArrowsParser.FOR, 0); }
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfContext extends StatementContext {
		public BlockContext tr;
		public BlockContext fa;
		public List<TerminalNode> NEWLINE() { return getTokens(ArrowsParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ArrowsParser.NEWLINE, i);
		}
		public TerminalNode ELSE() { return getToken(ArrowsParser.ELSE, 0); }
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public IfContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PassContext extends StatementContext {
		public TerminalNode PASS() { return getToken(ArrowsParser.PASS, 0); }
		public PassContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterPass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitPass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitPass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		int _la;
		try {
			setState(128);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new ArwContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(72); expression(0);
				setState(73); arrow();
				setState(74); expression(0);
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LA) | (1L << LPA) | (1L << LSA) | (1L << LDA) | (1L << LMA) | (1L << LRA) | (1L << RA) | (1L << RPA) | (1L << RSA) | (1L << RDA) | (1L << RMA) | (1L << RRA) | (1L << SWAP) | (1L << IS) | (1L << ISL) | (1L << OS) | (1L << OL) | (1L << OSL))) != 0)) {
					{
					{
					setState(75); arrow();
					setState(76); expression(0);
					}
					}
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 2:
				_localctx = new IoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(83); arrow();
				setState(84); expression(0);
				{
				setState(85); match(COMMA);
				setState(86); expression(0);
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LA) | (1L << LPA) | (1L << LSA) | (1L << LDA) | (1L << LMA) | (1L << LRA) | (1L << RA) | (1L << RPA) | (1L << RSA) | (1L << RDA) | (1L << RMA) | (1L << RRA) | (1L << SWAP) | (1L << IS) | (1L << ISL) | (1L << OS) | (1L << OL) | (1L << OSL))) != 0)) {
					{
					{
					setState(88); arrow();
					setState(89); expression(0);
					setState(94);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(90); match(COMMA);
						setState(91); expression(0);
						}
						}
						setState(96);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(101);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;

			case 3:
				_localctx = new BlckContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(102); block();
				}
				break;

			case 4:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(103); expression(0);
				setState(104); match(1);
				setState(105); match(NEWLINE);
				setState(106); ((IfContext)_localctx).tr = block();
				setState(110);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(107); match(ELSE);
					setState(108); match(NEWLINE);
					setState(109); ((IfContext)_localctx).fa = block();
					}
				}

				}
				break;

			case 5:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(112); match(WHILE);
				setState(113); expression(0);
				setState(114); match(1);
				setState(115); match(NEWLINE);
				setState(116); block();
				}
				break;

			case 6:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(118); match(FOR);
				setState(119); lvalue();
				setState(120); range();
				setState(121); match(1);
				setState(122); match(NEWLINE);
				setState(123); block();
				}
				break;

			case 7:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(125); match(RET);
				setState(126); expression(0);
				}
				break;

			case 8:
				_localctx = new PassContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(127); match(PASS);
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
	public static class CallContext extends ExpressionContext {
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public CallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitCall(this);
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
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterUna(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitUna(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitUna(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParContext extends ExpressionContext {
		public TerminalNode PAREN_CLOSE() { return getToken(ArrowsParser.PAREN_CLOSE, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(ArrowsParser.PAREN_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitPar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PostIncContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PostIncContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterPostInc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitPostInc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitPostInc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotContext extends ExpressionContext {
		public Token op;
		public TerminalNode NOT() { return getToken(ArrowsParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode PEQ() { return getToken(ArrowsParser.PEQ, 0); }
		public EqContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitEq(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(ArrowsParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(ArrowsParser.DIV, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public MulContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitMul(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends ExpressionContext {
		public Token content;
		public TerminalNode ANYSTRING(int i) {
			return getToken(ArrowsParser.ANYSTRING, i);
		}
		public List<TerminalNode> ANYSTRING() { return getTokens(ArrowsParser.ANYSTRING); }
		public TerminalNode STRING(int i) {
			return getToken(ArrowsParser.STRING, i);
		}
		public TerminalNode QUOT(int i) {
			return getToken(ArrowsParser.QUOT, i);
		}
		public List<TerminalNode> QUOT() { return getTokens(ArrowsParser.QUOT); }
		public List<TerminalNode> STRING() { return getTokens(ArrowsParser.STRING); }
		public StringContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(ArrowsParser.OR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public OrContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitOr(this);
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
		public TerminalNode SUB() { return getToken(ArrowsParser.SUB, 0); }
		public TerminalNode ADD() { return getToken(ArrowsParser.ADD, 0); }
		public AddContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarContext extends ExpressionContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public VarContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends ExpressionContext {
		public TerminalNode INT() { return getToken(ArrowsParser.INT, 0); }
		public IntContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(ArrowsParser.AND, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public AndContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PreIncContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PreIncContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterPreInc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitPreInc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitPreInc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState, _p);
		ExpressionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				_localctx = new PreIncContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(131);
				((PreIncContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==2 || _la==3) ) {
					((PreIncContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(132); expression(15);
				}
				break;

			case 2:
				{
				_localctx = new UnaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(133);
				((UnaContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
					((UnaContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(134); expression(13);
				}
				break;

			case 3:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(135); ((NotContext)_localctx).op = match(NOT);
				setState(136); expression(10);
				}
				break;

			case 4:
				{
				_localctx = new ParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(137); match(PAREN_OPEN);
				setState(138); expression(0);
				setState(139); match(PAREN_CLOSE);
				}
				break;

			case 5:
				{
				_localctx = new CallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(141); lvalue();
				setState(142); match(PAREN_OPEN);
				setState(143); params();
				setState(144); match(PAREN_CLOSE);
				}
				break;

			case 6:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(146); lvalue();
				setState(148);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(147); range();
					}
					break;
				}
				}
				break;

			case 7:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(150); match(INT);
				}
				break;

			case 8:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(151); match(QUOT);
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==STRING || _la==ANYSTRING) {
					{
					{
					setState(152);
					((StringContext)_localctx).content = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==STRING || _la==ANYSTRING) ) {
						((StringContext)_localctx).content = (Token)_errHandler.recoverInline(this);
					}
					consume();
					}
					}
					setState(157);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(158); match(QUOT);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(183);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(181);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new MulContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(161);
						if (!(12 >= _localctx._p)) throw new FailedPredicateException(this, "12 >= $_p");
						setState(162);
						((MulContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((MulContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(163); expression(13);
						}
						break;

					case 2:
						{
						_localctx = new AddContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(164);
						if (!(11 >= _localctx._p)) throw new FailedPredicateException(this, "11 >= $_p");
						setState(165);
						((AddContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(166); expression(12);
						}
						break;

					case 3:
						{
						_localctx = new AndContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(167);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(168); ((AndContext)_localctx).op = match(AND);
						setState(169); expression(10);
						}
						break;

					case 4:
						{
						_localctx = new OrContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(170);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(171); ((OrContext)_localctx).op = match(OR);
						setState(172); expression(9);
						}
						break;

					case 5:
						{
						_localctx = new EqContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(173);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(174); ((EqContext)_localctx).op = match(EQ);
						setState(175); expression(8);
						}
						break;

					case 6:
						{
						_localctx = new EqContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(176);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(177); ((EqContext)_localctx).op = match(PEQ);
						setState(178); expression(7);
						}
						break;

					case 7:
						{
						_localctx = new PostIncContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(179);
						if (!(14 >= _localctx._p)) throw new FailedPredicateException(this, "14 >= $_p");
						setState(180);
						((PostIncContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==2 || _la==3) ) {
							((PostIncContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						}
						break;
					}
					} 
				}
				setState(185);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class LvalueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ArrowsParser.STRING, 0); }
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterLvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitLvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitLvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LvalueContext lvalue() throws RecognitionException {
		LvalueContext _localctx = new LvalueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186); match(STRING);
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
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(188); lvalue();
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(189); match(COMMA);
					setState(190); lvalue();
					}
					}
					setState(195);
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

	public static class ParamsContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 3) | (1L << INT) | (1L << ADD) | (1L << SUB) | (1L << NOT) | (1L << PAREN_OPEN) | (1L << STRING) | (1L << QUOT))) != 0)) {
				{
				setState(198); expression(0);
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(199); match(COMMA);
					setState(200); expression(0);
					}
					}
					setState(205);
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

	public static class ArrowContext extends ParserRuleContext {
		public TerminalNode OL() { return getToken(ArrowsParser.OL, 0); }
		public TerminalNode RA() { return getToken(ArrowsParser.RA, 0); }
		public TerminalNode RSA() { return getToken(ArrowsParser.RSA, 0); }
		public TerminalNode LPA() { return getToken(ArrowsParser.LPA, 0); }
		public TerminalNode IS() { return getToken(ArrowsParser.IS, 0); }
		public TerminalNode LDA() { return getToken(ArrowsParser.LDA, 0); }
		public TerminalNode RDA() { return getToken(ArrowsParser.RDA, 0); }
		public TerminalNode LRA() { return getToken(ArrowsParser.LRA, 0); }
		public TerminalNode SWAP() { return getToken(ArrowsParser.SWAP, 0); }
		public TerminalNode LMA() { return getToken(ArrowsParser.LMA, 0); }
		public TerminalNode ISL() { return getToken(ArrowsParser.ISL, 0); }
		public TerminalNode RRA() { return getToken(ArrowsParser.RRA, 0); }
		public TerminalNode OS() { return getToken(ArrowsParser.OS, 0); }
		public TerminalNode LSA() { return getToken(ArrowsParser.LSA, 0); }
		public TerminalNode OSL() { return getToken(ArrowsParser.OSL, 0); }
		public TerminalNode RMA() { return getToken(ArrowsParser.RMA, 0); }
		public TerminalNode LA() { return getToken(ArrowsParser.LA, 0); }
		public TerminalNode RPA() { return getToken(ArrowsParser.RPA, 0); }
		public ArrowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterArrow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitArrow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitArrow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowContext arrow() throws RecognitionException {
		ArrowContext _localctx = new ArrowContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_arrow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LA) | (1L << LPA) | (1L << LSA) | (1L << LDA) | (1L << LMA) | (1L << LRA) | (1L << RA) | (1L << RPA) | (1L << RSA) | (1L << RDA) | (1L << RMA) | (1L << RRA) | (1L << SWAP) | (1L << IS) | (1L << ISL) | (1L << OS) | (1L << OL) | (1L << OSL))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		public TerminalNode LR() { return getToken(ArrowsParser.LR, 0); }
		public TerminalNode DOTS() { return getToken(ArrowsParser.DOTS, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RR() { return getToken(ArrowsParser.RR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode SUB() { return getToken(ArrowsParser.SUB, 0); }
		public TerminalNode ADD() { return getToken(ArrowsParser.ADD, 0); }
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_range);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210); match(LR);
			setState(211); expression(0);
			setState(215);
			switch (_input.LA(1)) {
			case ADD:
			case SUB:
				{
				setState(212);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case DOTS:
				{
				{
				setState(213); match(DOTS);
				setState(214); expression(0);
				}
				}
				break;
			case RR:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(217); match(RR);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 12 >= _localctx._p;

		case 1: return 11 >= _localctx._p;

		case 2: return 9 >= _localctx._p;

		case 3: return 8 >= _localctx._p;

		case 4: return 7 >= _localctx._p;

		case 5: return 6 >= _localctx._p;

		case 6: return 14 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\67\u00de\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\7\3\36\n\3\f\3\16\3!\13\3\3\3\3\3\7"+
		"\3%\n\3\f\3\16\3(\13\3\3\3\7\3+\n\3\f\3\16\3.\13\3\3\3\7\3\61\n\3\f\3"+
		"\16\3\64\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\7\5B\n\5"+
		"\f\5\16\5E\13\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7Q\n\7\f\7\16"+
		"\7T\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7_\n\7\f\7\16\7b\13\7\7"+
		"\7d\n\7\f\7\16\7g\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7q\n\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0083\n"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\b\u0097\n\b\3\b\3\b\3\b\7\b\u009c\n\b\f\b\16\b\u009f\13\b\3\b\5"+
		"\b\u00a2\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\7\b\u00b8\n\b\f\b\16\b\u00bb\13\b\3\t\3\t\3\n\3"+
		"\n\3\n\7\n\u00c2\n\n\f\n\16\n\u00c5\13\n\5\n\u00c7\n\n\3\13\3\13\3\13"+
		"\7\13\u00cc\n\13\f\13\16\13\u00cf\13\13\5\13\u00d1\n\13\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\5\r\u00da\n\r\3\r\3\r\3\r\2\16\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\2\7\3\2\4\5\3\2\37 \3\2\61\62\3\2\35\36\3\2\t\32\u00f7\2\32\3\2"+
		"\2\2\4\37\3\2\2\2\6\67\3\2\2\2\b>\3\2\2\2\nF\3\2\2\2\f\u0082\3\2\2\2\16"+
		"\u00a1\3\2\2\2\20\u00bc\3\2\2\2\22\u00c6\3\2\2\2\24\u00d0\3\2\2\2\26\u00d2"+
		"\3\2\2\2\30\u00d4\3\2\2\2\32\33\5\4\3\2\33\3\3\2\2\2\34\36\7\b\2\2\35"+
		"\34\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \"\3\2\2\2!\37\3\2\2"+
		"\2\",\5\6\4\2#%\7\b\2\2$#\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\')\3"+
		"\2\2\2(&\3\2\2\2)+\5\6\4\2*&\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\62"+
		"\3\2\2\2.,\3\2\2\2/\61\7\b\2\2\60/\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2"+
		"\62\63\3\2\2\2\63\65\3\2\2\2\64\62\3\2\2\2\65\66\7\2\2\3\66\5\3\2\2\2"+
		"\678\5\20\t\289\7/\2\29:\5\22\n\2:;\7\60\2\2;<\7\b\2\2<=\5\n\6\2=\7\3"+
		"\2\2\2>C\5\f\7\2?@\7\b\2\2@B\5\f\7\2A?\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3"+
		"\2\2\2D\t\3\2\2\2EC\3\2\2\2FG\7\66\2\2GH\5\b\5\2HI\7\67\2\2I\13\3\2\2"+
		"\2JK\5\16\b\2KL\5\26\f\2LR\5\16\b\2MN\5\26\f\2NO\5\16\b\2OQ\3\2\2\2PM"+
		"\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\u0083\3\2\2\2TR\3\2\2\2UV\5\26"+
		"\f\2VW\5\16\b\2WX\7\63\2\2XY\5\16\b\2Ye\3\2\2\2Z[\5\26\f\2[`\5\16\b\2"+
		"\\]\7\63\2\2]_\5\16\b\2^\\\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ad\3\2"+
		"\2\2b`\3\2\2\2cZ\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\u0083\3\2\2\2"+
		"ge\3\2\2\2h\u0083\5\n\6\2ij\5\16\b\2jk\7\3\2\2kl\7\b\2\2lp\5\n\6\2mn\7"+
		"(\2\2no\7\b\2\2oq\5\n\6\2pm\3\2\2\2pq\3\2\2\2q\u0083\3\2\2\2rs\7)\2\2"+
		"st\5\16\b\2tu\7\3\2\2uv\7\b\2\2vw\5\n\6\2w\u0083\3\2\2\2xy\7*\2\2yz\5"+
		"\20\t\2z{\5\30\r\2{|\7\3\2\2|}\7\b\2\2}~\5\n\6\2~\u0083\3\2\2\2\177\u0080"+
		"\7\33\2\2\u0080\u0083\5\16\b\2\u0081\u0083\7+\2\2\u0082J\3\2\2\2\u0082"+
		"U\3\2\2\2\u0082h\3\2\2\2\u0082i\3\2\2\2\u0082r\3\2\2\2\u0082x\3\2\2\2"+
		"\u0082\177\3\2\2\2\u0082\u0081\3\2\2\2\u0083\r\3\2\2\2\u0084\u0085\b\b"+
		"\1\2\u0085\u0086\t\2\2\2\u0086\u00a2\5\16\b\2\u0087\u0088\t\3\2\2\u0088"+
		"\u00a2\5\16\b\2\u0089\u008a\7.\2\2\u008a\u00a2\5\16\b\2\u008b\u008c\7"+
		"/\2\2\u008c\u008d\5\16\b\2\u008d\u008e\7\60\2\2\u008e\u00a2\3\2\2\2\u008f"+
		"\u0090\5\20\t\2\u0090\u0091\7/\2\2\u0091\u0092\5\24\13\2\u0092\u0093\7"+
		"\60\2\2\u0093\u00a2\3\2\2\2\u0094\u0096\5\20\t\2\u0095\u0097\5\30\r\2"+
		"\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u00a2\3\2\2\2\u0098\u00a2"+
		"\7\34\2\2\u0099\u009d\7\64\2\2\u009a\u009c\t\4\2\2\u009b\u009a\3\2\2\2"+
		"\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0"+
		"\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a2\7\64\2\2\u00a1\u0084\3\2\2\2"+
		"\u00a1\u0087\3\2\2\2\u00a1\u0089\3\2\2\2\u00a1\u008b\3\2\2\2\u00a1\u008f"+
		"\3\2\2\2\u00a1\u0094\3\2\2\2\u00a1\u0098\3\2\2\2\u00a1\u0099\3\2\2\2\u00a2"+
		"\u00b9\3\2\2\2\u00a3\u00a4\6\b\2\3\u00a4\u00a5\t\5\2\2\u00a5\u00b8\5\16"+
		"\b\2\u00a6\u00a7\6\b\3\3\u00a7\u00a8\t\3\2\2\u00a8\u00b8\5\16\b\2\u00a9"+
		"\u00aa\6\b\4\3\u00aa\u00ab\7,\2\2\u00ab\u00b8\5\16\b\2\u00ac\u00ad\6\b"+
		"\5\3\u00ad\u00ae\7-\2\2\u00ae\u00b8\5\16\b\2\u00af\u00b0\6\b\6\3\u00b0"+
		"\u00b1\7%\2\2\u00b1\u00b8\5\16\b\2\u00b2\u00b3\6\b\7\3\u00b3\u00b4\7&"+
		"\2\2\u00b4\u00b8\5\16\b\2\u00b5\u00b6\6\b\b\3\u00b6\u00b8\t\2\2\2\u00b7"+
		"\u00a3\3\2\2\2\u00b7\u00a6\3\2\2\2\u00b7\u00a9\3\2\2\2\u00b7\u00ac\3\2"+
		"\2\2\u00b7\u00af\3\2\2\2\u00b7\u00b2\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8"+
		"\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\17\3\2\2"+
		"\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd\7\61\2\2\u00bd\21\3\2\2\2\u00be\u00c3"+
		"\5\20\t\2\u00bf\u00c0\7\63\2\2\u00c0\u00c2\5\20\t\2\u00c1\u00bf\3\2\2"+
		"\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c7"+
		"\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00be\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\23\3\2\2\2\u00c8\u00cd\5\16\b\2\u00c9\u00ca\7\63\2\2\u00ca\u00cc\5\16"+
		"\b\2\u00cb\u00c9\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00c8\3\2"+
		"\2\2\u00d0\u00d1\3\2\2\2\u00d1\25\3\2\2\2\u00d2\u00d3\t\6\2\2\u00d3\27"+
		"\3\2\2\2\u00d4\u00d5\7!\2\2\u00d5\u00d9\5\16\b\2\u00d6\u00da\t\3\2\2\u00d7"+
		"\u00d8\7#\2\2\u00d8\u00da\5\16\b\2\u00d9\u00d6\3\2\2\2\u00d9\u00d7\3\2"+
		"\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\7\"\2\2\u00dc"+
		"\31\3\2\2\2\26\37&,\62CR`ep\u0082\u0096\u009d\u00a1\u00b7\u00b9\u00c3"+
		"\u00c6\u00cd\u00d0\u00d9";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
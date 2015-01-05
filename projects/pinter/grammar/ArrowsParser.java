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
		COMMENT=1, SPACES=2, NEWLINE=3, COLON=4, LA=5, LPA=6, LSA=7, LDA=8, LMA=9, 
		LRA=10, RA=11, RPA=12, RSA=13, RDA=14, RMA=15, RRA=16, SWAP=17, IS=18, 
		ISL=19, OS=20, OL=21, OSL=22, RET=23, INT=24, INT32=25, INC=26, DEC=27, 
		MUL=28, DIV=29, ADD=30, SUB=31, LR=32, RR=33, DOTS=34, WHITESPACE=35, 
		EQ=36, PEQ=37, IF=38, ELSE=39, WHILE=40, FOR=41, PASS=42, AND=43, OR=44, 
		NOT=45, PAREN_OPEN=46, PAREN_CLOSE=47, STRING=48, ANYSTRING=49, COMMA=50, 
		QUOT=51, QO=52, INDENT=53, DEDENT=54;
	public static final String[] tokenNames = {
		"<INVALID>", "COMMENT", "SPACES", "NEWLINE", "':'", "'>>'", "'+>'", "'->'", 
		"'/>'", "'*>'", "'&>'", "'<<'", "'<+'", "'<-'", "'</'", "'<*'", "'<&'", 
		"'<->'", "'@>'", "'$>'", "'<@'", "'<!'", "'<$'", "'ret'", "INT", "INT32", 
		"'++'", "'--'", "'*'", "'/'", "'+'", "'-'", "'['", "']'", "'..'", "WHITESPACE", 
		"'='", "'=='", "'if'", "'else'", "'while'", "'for'", "'pass'", "'&'", 
		"'|'", "'!'", "'('", "')'", "STRING", "ANYSTRING", "','", "'\"'", "'?'", 
		"INDENT", "DEDENT"
	};
	public static final int
		RULE_init = 0, RULE_function = 1, RULE_statements = 2, RULE_block = 3, 
		RULE_statement = 4, RULE_expression = 5, RULE_singleInput = 6, RULE_singleOutput = 7, 
		RULE_quotedString = 8, RULE_lvalue = 9, RULE_args = 10, RULE_params = 11, 
		RULE_arrow = 12, RULE_inputArrow = 13, RULE_outputArrow = 14, RULE_otherArrow = 15, 
		RULE_range = 16;
	public static final String[] ruleNames = {
		"init", "function", "statements", "block", "statement", "expression", 
		"singleInput", "singleOutput", "quotedString", "lvalue", "args", "params", 
		"arrow", "inputArrow", "outputArrow", "otherArrow", "range"
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
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
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
			setState(34); statements();
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
		public TerminalNode COLON() { return getToken(ArrowsParser.COLON, 0); }
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
		enterRule(_localctx, 2, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36); lvalue();
			setState(37); match(PAREN_OPEN);
			setState(38); args();
			setState(39); match(PAREN_CLOSE);
			setState(40); match(COLON);
			setState(41); match(NEWLINE);
			setState(42); block();
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(ArrowsParser.NEWLINE); }
		public TerminalNode EOF() { return getToken(ArrowsParser.EOF, 0); }
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
		enterRule(_localctx, 4, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(44); match(NEWLINE);
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(50); statement();
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(51); match(NEWLINE);
					}
					}
					setState(56);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(59); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LA) | (1L << RA) | (1L << IS) | (1L << ISL) | (1L << OS) | (1L << OL) | (1L << OSL) | (1L << RET) | (1L << INT) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB) | (1L << WHILE) | (1L << FOR) | (1L << PASS) | (1L << NOT) | (1L << PAREN_OPEN) | (1L << STRING) | (1L << QUOT) | (1L << INDENT))) != 0) );
			setState(61); match(EOF);
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
		enterRule(_localctx, 6, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63); match(INDENT);
			setState(64); statements();
			setState(65); match(DEDENT);
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
	public static class InputContext extends StatementContext {
		public SingleInputContext singleInput(int i) {
			return getRuleContext(SingleInputContext.class,i);
		}
		public List<SingleInputContext> singleInput() {
			return getRuleContexts(SingleInputContext.class);
		}
		public InputContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitInput(this);
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
		public TerminalNode COLON() { return getToken(ArrowsParser.COLON, 0); }
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
	public static class OutputContext extends StatementContext {
		public List<SingleOutputContext> singleOutput() {
			return getRuleContexts(SingleOutputContext.class);
		}
		public SingleOutputContext singleOutput(int i) {
			return getRuleContext(SingleOutputContext.class,i);
		}
		public OutputContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitOutput(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForContext extends StatementContext {
		public Token op;
		public TerminalNode NEWLINE() { return getToken(ArrowsParser.NEWLINE, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode RA() { return getToken(ArrowsParser.RA, 0); }
		public TerminalNode FOR() { return getToken(ArrowsParser.FOR, 0); }
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ArrowsParser.COLON, 0); }
		public TerminalNode LA() { return getToken(ArrowsParser.LA, 0); }
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
		public TerminalNode COLON() { return getToken(ArrowsParser.COLON, 0); }
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
		enterRule(_localctx, 8, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(115);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new ArwContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(67); expression(0);
				setState(68); arrow();
				setState(69); expression(0);
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(70); arrow();
						setState(71); expression(0);
						}
						} 
					}
					setState(77);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				}
				break;

			case 2:
				_localctx = new InputContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(79); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(78); singleInput();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(81); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				}
				break;

			case 3:
				_localctx = new OutputContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(84); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(83); singleOutput();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(86); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				}
				break;

			case 4:
				_localctx = new BlckContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(88); block();
				}
				break;

			case 5:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(89); expression(0);
				setState(90); match(COLON);
				setState(91); match(NEWLINE);
				setState(92); ((IfContext)_localctx).tr = block();
				setState(96);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(93); match(ELSE);
					setState(94); match(NEWLINE);
					setState(95); ((IfContext)_localctx).fa = block();
					}
				}

				}
				break;

			case 6:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(98); match(WHILE);
				setState(99); expression(0);
				setState(100); match(COLON);
				setState(101); match(NEWLINE);
				setState(102); block();
				}
				break;

			case 7:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(104); match(FOR);
				setState(105); lvalue();
				setState(106);
				((ForContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LA || _la==RA) ) {
					((ForContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(107); range();
				setState(108); match(COLON);
				setState(109); match(NEWLINE);
				setState(110); block();
				}
				break;

			case 8:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(112); match(RET);
				setState(113); expression(0);
				}
				break;

			case 9:
				_localctx = new PassContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(114); match(PASS);
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
	public static class QstrContext extends ExpressionContext {
		public QuotedStringContext quotedString() {
			return getRuleContext(QuotedStringContext.class,0);
		}
		public QstrContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterQstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitQstr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitQstr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PostIncContext extends ExpressionContext {
		public Token op;
		public TerminalNode INC() { return getToken(ArrowsParser.INC, 0); }
		public TerminalNode DEC() { return getToken(ArrowsParser.DEC, 0); }
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
		public TerminalNode EQ() { return getToken(ArrowsParser.EQ, 0); }
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
		public RangeContext range(int i) {
			return getRuleContext(RangeContext.class,i);
		}
		public List<RangeContext> range() {
			return getRuleContexts(RangeContext.class);
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
		public TerminalNode INC() { return getToken(ArrowsParser.INC, 0); }
		public TerminalNode DEC() { return getToken(ArrowsParser.DEC, 0); }
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
		int _startState = 10;
		enterRecursionRule(_localctx, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new PreIncContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(118);
				((PreIncContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INC || _la==DEC) ) {
					((PreIncContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(119); expression(14);
				}
				break;

			case 2:
				{
				_localctx = new UnaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(120);
				((UnaContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
					((UnaContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(121); expression(12);
				}
				break;

			case 3:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(122); ((NotContext)_localctx).op = match(NOT);
				setState(123); expression(9);
				}
				break;

			case 4:
				{
				_localctx = new ParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(124); match(PAREN_OPEN);
				setState(125); expression(0);
				setState(126); match(PAREN_CLOSE);
				}
				break;

			case 5:
				{
				_localctx = new CallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(128); lvalue();
				setState(129); match(PAREN_OPEN);
				setState(130); params();
				setState(131); match(PAREN_CLOSE);
				}
				break;

			case 6:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(133); lvalue();
				setState(137);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(134); range();
						}
						} 
					}
					setState(139);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				}
				break;

			case 7:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(140); match(INT);
				}
				break;

			case 8:
				{
				_localctx = new QstrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(141); quotedString();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(161);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new MulContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(144);
						if (!(11 >= _localctx._p)) throw new FailedPredicateException(this, "11 >= $_p");
						setState(145);
						((MulContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((MulContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(146); expression(12);
						}
						break;

					case 2:
						{
						_localctx = new AddContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(147);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(148);
						((AddContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(149); expression(11);
						}
						break;

					case 3:
						{
						_localctx = new AndContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(150);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(151); ((AndContext)_localctx).op = match(AND);
						setState(152); expression(9);
						}
						break;

					case 4:
						{
						_localctx = new OrContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(153);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(154); ((OrContext)_localctx).op = match(OR);
						setState(155); expression(8);
						}
						break;

					case 5:
						{
						_localctx = new EqContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(156);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(157); ((EqContext)_localctx).op = match(EQ);
						setState(158); expression(7);
						}
						break;

					case 6:
						{
						_localctx = new PostIncContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(159);
						if (!(13 >= _localctx._p)) throw new FailedPredicateException(this, "13 >= $_p");
						setState(160);
						((PostIncContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==INC || _la==DEC) ) {
							((PostIncContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						}
						break;
					}
					} 
				}
				setState(165);
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

	public static class SingleInputContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public InputArrowContext inputArrow() {
			return getRuleContext(InputArrowContext.class,0);
		}
		public SingleInputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleInput; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterSingleInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitSingleInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitSingleInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleInputContext singleInput() throws RecognitionException {
		SingleInputContext _localctx = new SingleInputContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_singleInput);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166); inputArrow();
			setState(167); expression(0);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(168); match(COMMA);
				setState(169); expression(0);
				}
				}
				setState(174);
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

	public static class SingleOutputContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public QuotedStringContext quotedString() {
			return getRuleContext(QuotedStringContext.class,0);
		}
		public OutputArrowContext outputArrow() {
			return getRuleContext(OutputArrowContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode COLON() { return getToken(ArrowsParser.COLON, 0); }
		public SingleOutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleOutput; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterSingleOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitSingleOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitSingleOutput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleOutputContext singleOutput() throws RecognitionException {
		SingleOutputContext _localctx = new SingleOutputContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_singleOutput);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175); outputArrow();
			setState(176); expression(0);
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(177); match(COMMA);
				setState(178); expression(0);
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			{
			setState(184); match(COLON);
			setState(185); quotedString();
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

	public static class QuotedStringContext extends ParserRuleContext {
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
		public QuotedStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterQuotedString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitQuotedString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitQuotedString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuotedStringContext quotedString() throws RecognitionException {
		QuotedStringContext _localctx = new QuotedStringContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_quotedString);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187); match(QUOT);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STRING || _la==ANYSTRING) {
				{
				{
				setState(188);
				((QuotedStringContext)_localctx).content = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==STRING || _la==ANYSTRING) ) {
					((QuotedStringContext)_localctx).content = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(194); match(QUOT);
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
		enterRule(_localctx, 18, RULE_lvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196); match(STRING);
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
		enterRule(_localctx, 20, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(198); lvalue();
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(199); match(COMMA);
					setState(200); lvalue();
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
		enterRule(_localctx, 22, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << INC) | (1L << DEC) | (1L << ADD) | (1L << SUB) | (1L << NOT) | (1L << PAREN_OPEN) | (1L << STRING) | (1L << QUOT))) != 0)) {
				{
				setState(208); expression(0);
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(209); match(COMMA);
					setState(210); expression(0);
					}
					}
					setState(215);
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
		public OtherArrowContext otherArrow() {
			return getRuleContext(OtherArrowContext.class,0);
		}
		public OutputArrowContext outputArrow() {
			return getRuleContext(OutputArrowContext.class,0);
		}
		public InputArrowContext inputArrow() {
			return getRuleContext(InputArrowContext.class,0);
		}
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
		enterRule(_localctx, 24, RULE_arrow);
		try {
			setState(221);
			switch (_input.LA(1)) {
			case LA:
			case IS:
			case ISL:
				enterOuterAlt(_localctx, 1);
				{
				setState(218); inputArrow();
				}
				break;
			case RA:
			case OS:
			case OL:
			case OSL:
				enterOuterAlt(_localctx, 2);
				{
				setState(219); outputArrow();
				}
				break;
			case LPA:
			case LSA:
			case LDA:
			case LMA:
			case LRA:
			case RPA:
			case RSA:
			case RDA:
			case RMA:
			case RRA:
			case SWAP:
				enterOuterAlt(_localctx, 3);
				{
				setState(220); otherArrow();
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

	public static class InputArrowContext extends ParserRuleContext {
		public TerminalNode ISL() { return getToken(ArrowsParser.ISL, 0); }
		public TerminalNode IS() { return getToken(ArrowsParser.IS, 0); }
		public TerminalNode LA() { return getToken(ArrowsParser.LA, 0); }
		public InputArrowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputArrow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterInputArrow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitInputArrow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitInputArrow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputArrowContext inputArrow() throws RecognitionException {
		InputArrowContext _localctx = new InputArrowContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_inputArrow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LA) | (1L << IS) | (1L << ISL))) != 0)) ) {
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

	public static class OutputArrowContext extends ParserRuleContext {
		public TerminalNode OL() { return getToken(ArrowsParser.OL, 0); }
		public TerminalNode RA() { return getToken(ArrowsParser.RA, 0); }
		public TerminalNode OS() { return getToken(ArrowsParser.OS, 0); }
		public TerminalNode OSL() { return getToken(ArrowsParser.OSL, 0); }
		public OutputArrowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputArrow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterOutputArrow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitOutputArrow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitOutputArrow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputArrowContext outputArrow() throws RecognitionException {
		OutputArrowContext _localctx = new OutputArrowContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_outputArrow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << RA) | (1L << OS) | (1L << OL) | (1L << OSL))) != 0)) ) {
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

	public static class OtherArrowContext extends ParserRuleContext {
		public TerminalNode LRA() { return getToken(ArrowsParser.LRA, 0); }
		public TerminalNode RSA() { return getToken(ArrowsParser.RSA, 0); }
		public TerminalNode SWAP() { return getToken(ArrowsParser.SWAP, 0); }
		public TerminalNode LMA() { return getToken(ArrowsParser.LMA, 0); }
		public TerminalNode RRA() { return getToken(ArrowsParser.RRA, 0); }
		public TerminalNode LPA() { return getToken(ArrowsParser.LPA, 0); }
		public TerminalNode LDA() { return getToken(ArrowsParser.LDA, 0); }
		public TerminalNode LSA() { return getToken(ArrowsParser.LSA, 0); }
		public TerminalNode RMA() { return getToken(ArrowsParser.RMA, 0); }
		public TerminalNode RDA() { return getToken(ArrowsParser.RDA, 0); }
		public TerminalNode RPA() { return getToken(ArrowsParser.RPA, 0); }
		public OtherArrowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherArrow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterOtherArrow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitOtherArrow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitOtherArrow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtherArrowContext otherArrow() throws RecognitionException {
		OtherArrowContext _localctx = new OtherArrowContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_otherArrow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPA) | (1L << LSA) | (1L << LDA) | (1L << LMA) | (1L << LRA) | (1L << RPA) | (1L << RSA) | (1L << RDA) | (1L << RMA) | (1L << RRA) | (1L << SWAP))) != 0)) ) {
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
		public TerminalNode INT() { return getToken(ArrowsParser.INT, 0); }
		public TerminalNode RR() { return getToken(ArrowsParser.RR, 0); }
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
		enterRule(_localctx, 32, RULE_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229); match(LR);
			setState(230); match(INT);
			setState(231); match(RR);
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
		case 5: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 11 >= _localctx._p;

		case 1: return 10 >= _localctx._p;

		case 2: return 8 >= _localctx._p;

		case 3: return 7 >= _localctx._p;

		case 4: return 6 >= _localctx._p;

		case 5: return 13 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\38\u00ec\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\7\4\60\n\4\f\4\16\4\63\13"+
		"\4\3\4\3\4\7\4\67\n\4\f\4\16\4:\13\4\6\4<\n\4\r\4\16\4=\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6L\n\6\f\6\16\6O\13\6\3\6\6\6R\n"+
		"\6\r\6\16\6S\3\6\6\6W\n\6\r\6\16\6X\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5"+
		"\6c\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\5\6v\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\7\7\u008a\n\7\f\7\16\7\u008d\13\7\3\7\3\7\5\7\u0091"+
		"\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\7\7\u00a4\n\7\f\7\16\7\u00a7\13\7\3\b\3\b\3\b\3\b\7\b\u00ad\n\b\f\b"+
		"\16\b\u00b0\13\b\3\t\3\t\3\t\3\t\7\t\u00b6\n\t\f\t\16\t\u00b9\13\t\3\t"+
		"\3\t\3\t\3\n\3\n\7\n\u00c0\n\n\f\n\16\n\u00c3\13\n\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\f\7\f\u00cc\n\f\f\f\16\f\u00cf\13\f\5\f\u00d1\n\f\3\r\3\r\3\r"+
		"\7\r\u00d6\n\r\f\r\16\r\u00d9\13\r\5\r\u00db\n\r\3\16\3\16\3\16\5\16\u00e0"+
		"\n\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\2\23\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\n\4\2\7\7\r\r\3\2\34\35\3\2 "+
		"!\3\2\36\37\3\2\62\63\4\2\7\7\24\25\4\2\r\r\26\30\4\2\b\f\16\23\u0100"+
		"\2$\3\2\2\2\4&\3\2\2\2\6\61\3\2\2\2\bA\3\2\2\2\nu\3\2\2\2\f\u0090\3\2"+
		"\2\2\16\u00a8\3\2\2\2\20\u00b1\3\2\2\2\22\u00bd\3\2\2\2\24\u00c6\3\2\2"+
		"\2\26\u00d0\3\2\2\2\30\u00da\3\2\2\2\32\u00df\3\2\2\2\34\u00e1\3\2\2\2"+
		"\36\u00e3\3\2\2\2 \u00e5\3\2\2\2\"\u00e7\3\2\2\2$%\5\6\4\2%\3\3\2\2\2"+
		"&\'\5\24\13\2\'(\7\60\2\2()\5\26\f\2)*\7\61\2\2*+\7\6\2\2+,\7\5\2\2,-"+
		"\5\b\5\2-\5\3\2\2\2.\60\7\5\2\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61"+
		"\62\3\2\2\2\62;\3\2\2\2\63\61\3\2\2\2\648\5\n\6\2\65\67\7\5\2\2\66\65"+
		"\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29<\3\2\2\2:8\3\2\2\2;\64\3\2"+
		"\2\2<=\3\2\2\2=;\3\2\2\2=>\3\2\2\2>?\3\2\2\2?@\7\2\2\3@\7\3\2\2\2AB\7"+
		"\67\2\2BC\5\6\4\2CD\78\2\2D\t\3\2\2\2EF\5\f\7\2FG\5\32\16\2GM\5\f\7\2"+
		"HI\5\32\16\2IJ\5\f\7\2JL\3\2\2\2KH\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2"+
		"\2Nv\3\2\2\2OM\3\2\2\2PR\5\16\b\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2"+
		"\2\2Tv\3\2\2\2UW\5\20\t\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2Yv\3"+
		"\2\2\2Zv\5\b\5\2[\\\5\f\7\2\\]\7\6\2\2]^\7\5\2\2^b\5\b\5\2_`\7)\2\2`a"+
		"\7\5\2\2ac\5\b\5\2b_\3\2\2\2bc\3\2\2\2cv\3\2\2\2de\7*\2\2ef\5\f\7\2fg"+
		"\7\6\2\2gh\7\5\2\2hi\5\b\5\2iv\3\2\2\2jk\7+\2\2kl\5\24\13\2lm\t\2\2\2"+
		"mn\5\"\22\2no\7\6\2\2op\7\5\2\2pq\5\b\5\2qv\3\2\2\2rs\7\31\2\2sv\5\f\7"+
		"\2tv\7,\2\2uE\3\2\2\2uQ\3\2\2\2uV\3\2\2\2uZ\3\2\2\2u[\3\2\2\2ud\3\2\2"+
		"\2uj\3\2\2\2ur\3\2\2\2ut\3\2\2\2v\13\3\2\2\2wx\b\7\1\2xy\t\3\2\2y\u0091"+
		"\5\f\7\2z{\t\4\2\2{\u0091\5\f\7\2|}\7/\2\2}\u0091\5\f\7\2~\177\7\60\2"+
		"\2\177\u0080\5\f\7\2\u0080\u0081\7\61\2\2\u0081\u0091\3\2\2\2\u0082\u0083"+
		"\5\24\13\2\u0083\u0084\7\60\2\2\u0084\u0085\5\30\r\2\u0085\u0086\7\61"+
		"\2\2\u0086\u0091\3\2\2\2\u0087\u008b\5\24\13\2\u0088\u008a\5\"\22\2\u0089"+
		"\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2"+
		"\2\2\u008c\u0091\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u0091\7\32\2\2\u008f"+
		"\u0091\5\22\n\2\u0090w\3\2\2\2\u0090z\3\2\2\2\u0090|\3\2\2\2\u0090~\3"+
		"\2\2\2\u0090\u0082\3\2\2\2\u0090\u0087\3\2\2\2\u0090\u008e\3\2\2\2\u0090"+
		"\u008f\3\2\2\2\u0091\u00a5\3\2\2\2\u0092\u0093\6\7\2\3\u0093\u0094\t\5"+
		"\2\2\u0094\u00a4\5\f\7\2\u0095\u0096\6\7\3\3\u0096\u0097\t\4\2\2\u0097"+
		"\u00a4\5\f\7\2\u0098\u0099\6\7\4\3\u0099\u009a\7-\2\2\u009a\u00a4\5\f"+
		"\7\2\u009b\u009c\6\7\5\3\u009c\u009d\7.\2\2\u009d\u00a4\5\f\7\2\u009e"+
		"\u009f\6\7\6\3\u009f\u00a0\7&\2\2\u00a0\u00a4\5\f\7\2\u00a1\u00a2\6\7"+
		"\7\3\u00a2\u00a4\t\3\2\2\u00a3\u0092\3\2\2\2\u00a3\u0095\3\2\2\2\u00a3"+
		"\u0098\3\2\2\2\u00a3\u009b\3\2\2\2\u00a3\u009e\3\2\2\2\u00a3\u00a1\3\2"+
		"\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\r\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\5\34\17\2\u00a9\u00ae\5\f\7"+
		"\2\u00aa\u00ab\7\64\2\2\u00ab\u00ad\5\f\7\2\u00ac\u00aa\3\2\2\2\u00ad"+
		"\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\17\3\2\2"+
		"\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\5\36\20\2\u00b2\u00b7\5\f\7\2\u00b3"+
		"\u00b4\7\64\2\2\u00b4\u00b6\5\f\7\2\u00b5\u00b3\3\2\2\2\u00b6\u00b9\3"+
		"\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00ba\u00bb\7\6\2\2\u00bb\u00bc\5\22\n\2\u00bc\21\3\2\2"+
		"\2\u00bd\u00c1\7\65\2\2\u00be\u00c0\t\6\2\2\u00bf\u00be\3\2\2\2\u00c0"+
		"\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c4\3\2"+
		"\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5\7\65\2\2\u00c5\23\3\2\2\2\u00c6\u00c7"+
		"\7\62\2\2\u00c7\25\3\2\2\2\u00c8\u00cd\5\24\13\2\u00c9\u00ca\7\64\2\2"+
		"\u00ca\u00cc\5\24\13\2\u00cb\u00c9\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb"+
		"\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0"+
		"\u00c8\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\27\3\2\2\2\u00d2\u00d7\5\f\7"+
		"\2\u00d3\u00d4\7\64\2\2\u00d4\u00d6\5\f\7\2\u00d5\u00d3\3\2\2\2\u00d6"+
		"\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00db\3\2"+
		"\2\2\u00d9\u00d7\3\2\2\2\u00da\u00d2\3\2\2\2\u00da\u00db\3\2\2\2\u00db"+
		"\31\3\2\2\2\u00dc\u00e0\5\34\17\2\u00dd\u00e0\5\36\20\2\u00de\u00e0\5"+
		" \21\2\u00df\u00dc\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00de\3\2\2\2\u00e0"+
		"\33\3\2\2\2\u00e1\u00e2\t\7\2\2\u00e2\35\3\2\2\2\u00e3\u00e4\t\b\2\2\u00e4"+
		"\37\3\2\2\2\u00e5\u00e6\t\t\2\2\u00e6!\3\2\2\2\u00e7\u00e8\7\"\2\2\u00e8"+
		"\u00e9\7\32\2\2\u00e9\u00ea\7#\2\2\u00ea#\3\2\2\2\26\618=MSXbu\u008b\u0090"+
		"\u00a3\u00a5\u00ae\u00b7\u00c1\u00cd\u00d0\u00d7\u00da\u00df";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
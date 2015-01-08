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
		DEF=1, INDENT=2, DEDENT=3, COLON=4, SEMICOLON=5, LA=6, RA=7, LPA=8, LSA=9, 
		LDA=10, LMA=11, LRA=12, RPA=13, RSA=14, RDA=15, RMA=16, RRA=17, SWAP=18, 
		IS=19, ISL=20, OS=21, OL=22, OSL=23, RET=24, INT=25, MUL=26, DIV=27, ADD=28, 
		SUB=29, LR=30, RR=31, DOTS=32, WHITESPACE=33, EQ=34, NEQ=35, GEQ=36, SEQ=37, 
		GT=38, ST=39, IF=40, ELSE=41, WHILE=42, FOR=43, PASS=44, AND=45, OR=46, 
		NOT=47, PAREN_OPEN=48, PAREN_CLOSE=49, COMMA=50, QUOT=51, QO=52, STRING=53, 
		NEWLINE=54, ANYSTRING=55, COMMENT=56, SPACES=57;
	public static final String[] tokenNames = {
		"<INVALID>", "'def'", "'{'", "'}'", "':'", "';'", "'>>'", "'<<'", "'+>'", 
		"'->'", "'/>'", "'*>'", "'&>'", "'<+'", "'<-'", "'</'", "'<*'", "'<&'", 
		"'<->'", "'@>'", "'$>'", "'<@'", "'<!'", "'<$'", "'ret'", "INT", "'*'", 
		"'/'", "'+'", "'-'", "'['", "']'", "'..'", "WHITESPACE", "'='", "'!='", 
		"'>='", "'<='", "'>'", "'<'", "'if'", "'else'", "'while'", "'for'", "'pass'", 
		"'&'", "'|'", "'!'", "'('", "')'", "','", "'\"'", "'?'", "STRING", "'\n'", 
		"ANYSTRING", "COMMENT", "SPACES"
	};
	public static final int
		RULE_init = 0, RULE_fun = 1, RULE_statements = 2, RULE_block = 3, RULE_statement = 4, 
		RULE_singleInput = 5, RULE_singleOutput = 6, RULE_arrow = 7, RULE_inputArrow = 8, 
		RULE_outputArrow = 9, RULE_otherArrow = 10, RULE_expression = 11, RULE_variable = 12, 
		RULE_quotedString = 13, RULE_lvalue = 14, RULE_args = 15, RULE_params = 16, 
		RULE_range = 17, RULE_singleRange = 18, RULE_boundedRange = 19;
	public static final String[] ruleNames = {
		"init", "fun", "statements", "block", "statement", "singleInput", "singleOutput", 
		"arrow", "inputArrow", "outputArrow", "otherArrow", "expression", "variable", 
		"quotedString", "lvalue", "args", "params", "range", "singleRange", "boundedRange"
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
		public List<TerminalNode> NEWLINE() { return getTokens(ArrowsParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ArrowsParser.NEWLINE, i);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public List<FunContext> fun() {
			return getRuleContexts(FunContext.class);
		}
		public FunContext fun(int i) {
			return getRuleContext(FunContext.class,i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DEF) {
				{
				{
				setState(40); fun();
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(46); match(NEWLINE);
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(52); statements();
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

	public static class FunContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode PAREN_CLOSE() { return getToken(ArrowsParser.PAREN_CLOSE, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode DEF() { return getToken(ArrowsParser.DEF, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(ArrowsParser.PAREN_OPEN, 0); }
		public TerminalNode COLON() { return getToken(ArrowsParser.COLON, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public FunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterFun(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitFun(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitFun(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunContext fun() throws RecognitionException {
		FunContext _localctx = new FunContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_fun);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54); match(DEF);
			setState(55); lvalue();
			setState(56); match(PAREN_OPEN);
			setState(57); args();
			setState(58); match(PAREN_CLOSE);
			setState(59); match(COLON);
			setState(60); statement();
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
		enterRule(_localctx, 4, RULE_statements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(62); statement();
			setState(67);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(63); match(NEWLINE);
					setState(64); statement();
					}
					} 
				}
				setState(69);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
		public List<TerminalNode> NEWLINE() { return getTokens(ArrowsParser.NEWLINE); }
		public TerminalNode INDENT() { return getToken(ArrowsParser.INDENT, 0); }
		public TerminalNode NEWLINE(int i) {
			return getToken(ArrowsParser.NEWLINE, i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70); match(INDENT);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(71); match(NEWLINE);
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77); statements();
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(78); match(NEWLINE);
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84); match(DEDENT);
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
	public static class EeContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public EeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterEe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitEe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitEe(this);
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
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(ArrowsParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode RA() { return getToken(ArrowsParser.RA, 0); }
		public TerminalNode FOR() { return getToken(ArrowsParser.FOR, 0); }
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		public StatementContext tr;
		public StatementContext fa;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode ELSE() { return getToken(ArrowsParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(130);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new InputContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(87); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(86); singleInput();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(89); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				}
				break;

			case 2:
				_localctx = new OutputContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(92); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(91); singleOutput();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(94); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				}
				break;

			case 3:
				_localctx = new ArwContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(96); expression(0);
				setState(97); arrow();
				setState(98); expression(0);
				setState(104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(99); arrow();
						setState(100); expression(0);
						}
						} 
					}
					setState(106);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				}
				break;

			case 4:
				_localctx = new BlckContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(107); block();
				}
				break;

			case 5:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(108); expression(0);
				setState(109); match(COLON);
				setState(110); ((IfContext)_localctx).tr = statement();
				setState(113);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(111); match(ELSE);
					setState(112); ((IfContext)_localctx).fa = statement();
					}
					break;
				}
				}
				break;

			case 6:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(115); match(WHILE);
				setState(116); expression(0);
				setState(117); match(COLON);
				setState(118); statement();
				}
				break;

			case 7:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(120); match(FOR);
				setState(121); expression(0);
				setState(122);
				((ForContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LA || _la==RA) ) {
					((ForContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(123); range();
				setState(124); match(COLON);
				setState(125); statement();
				}
				break;

			case 8:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(127); match(RET);
				setState(128); expression(0);
				}
				break;

			case 9:
				_localctx = new EeContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(129); expression(0);
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

	public static class SingleInputContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(ArrowsParser.COMMA); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public InputArrowContext inputArrow() {
			return getRuleContext(InputArrowContext.class,0);
		}
		public TerminalNode COMMA(int i) {
			return getToken(ArrowsParser.COMMA, i);
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
		enterRule(_localctx, 10, RULE_singleInput);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132); inputArrow();
			setState(133); variable();
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(134); match(COMMA);
				setState(135); variable();
				}
				}
				setState(140);
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
		public List<TerminalNode> COMMA() { return getTokens(ArrowsParser.COMMA); }
		public OutputArrowContext outputArrow() {
			return getRuleContext(OutputArrowContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode COLON() { return getToken(ArrowsParser.COLON, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(ArrowsParser.COMMA, i);
		}
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
		enterRule(_localctx, 12, RULE_singleOutput);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141); outputArrow();
			setState(142); expression(0);
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(143); match(COMMA);
				setState(144); expression(0);
				}
				}
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(152);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(150); match(COLON);
				setState(151); quotedString();
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
		enterRule(_localctx, 14, RULE_arrow);
		try {
			setState(157);
			switch (_input.LA(1)) {
			case LA:
			case IS:
				enterOuterAlt(_localctx, 1);
				{
				setState(154); inputArrow();
				}
				break;
			case RA:
			case OS:
				enterOuterAlt(_localctx, 2);
				{
				setState(155); outputArrow();
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
				setState(156); otherArrow();
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
		public Token op;
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
		enterRule(_localctx, 16, RULE_inputArrow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			((InputArrowContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==LA || _la==IS) ) {
				((InputArrowContext)_localctx).op = (Token)_errHandler.recoverInline(this);
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
		public Token op;
		public TerminalNode RA() { return getToken(ArrowsParser.RA, 0); }
		public TerminalNode OS() { return getToken(ArrowsParser.OS, 0); }
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
		enterRule(_localctx, 18, RULE_outputArrow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			((OutputArrowContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==RA || _la==OS) ) {
				((OutputArrowContext)_localctx).op = (Token)_errHandler.recoverInline(this);
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
		public Token op;
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
		enterRule(_localctx, 20, RULE_otherArrow);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			((OtherArrowContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPA) | (1L << LSA) | (1L << LDA) | (1L << LMA) | (1L << LRA) | (1L << RPA) | (1L << RSA) | (1L << RDA) | (1L << RMA) | (1L << RRA) | (1L << SWAP))) != 0)) ) {
				((OtherArrowContext)_localctx).op = (Token)_errHandler.recoverInline(this);
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
	public static class EqContext extends ExpressionContext {
		public Token op;
		public TerminalNode NEQ() { return getToken(ArrowsParser.NEQ, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ST() { return getToken(ArrowsParser.ST, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode GT() { return getToken(ArrowsParser.GT, 0); }
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
	public static class VarContext extends ExpressionContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
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
			setState(182);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				_localctx = new UnaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(166);
				((UnaContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
					((UnaContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(167); expression(12);
				}
				break;

			case 2:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(168); ((NotContext)_localctx).op = match(NOT);
				setState(169); expression(9);
				}
				break;

			case 3:
				{
				_localctx = new ParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(170); match(PAREN_OPEN);
				setState(171); expression(0);
				setState(172); match(PAREN_CLOSE);
				}
				break;

			case 4:
				{
				_localctx = new CallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(174); lvalue();
				setState(175); match(PAREN_OPEN);
				setState(176); params();
				setState(177); match(PAREN_CLOSE);
				}
				break;

			case 5:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(179); variable();
				}
				break;

			case 6:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(180); match(INT);
				}
				break;

			case 7:
				{
				_localctx = new QstrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(181); quotedString();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(201);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(199);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new MulContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(184);
						if (!(11 >= _localctx._p)) throw new FailedPredicateException(this, "11 >= $_p");
						setState(185);
						((MulContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((MulContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(186); expression(12);
						}
						break;

					case 2:
						{
						_localctx = new AddContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(187);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(188);
						((AddContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(189); expression(11);
						}
						break;

					case 3:
						{
						_localctx = new AndContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(190);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(191); ((AndContext)_localctx).op = match(AND);
						setState(192); expression(9);
						}
						break;

					case 4:
						{
						_localctx = new OrContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(193);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(194); ((OrContext)_localctx).op = match(OR);
						setState(195); expression(8);
						}
						break;

					case 5:
						{
						_localctx = new EqContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(196);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(197);
						((EqContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NEQ) | (1L << GT) | (1L << ST))) != 0)) ) {
							((EqContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(198); expression(7);
						}
						break;
					}
					} 
				}
				setState(203);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class VariableContext extends ParserRuleContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public RangeContext range(int i) {
			return getRuleContext(RangeContext.class,i);
		}
		public List<RangeContext> range() {
			return getRuleContexts(RangeContext.class);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(204); lvalue();
			setState(208);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(205); range();
					}
					} 
				}
				setState(210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		public TerminalNode ANYSTRING() { return getToken(ArrowsParser.ANYSTRING, 0); }
		public TerminalNode QUOT(int i) {
			return getToken(ArrowsParser.QUOT, i);
		}
		public List<TerminalNode> QUOT() { return getTokens(ArrowsParser.QUOT); }
		public TerminalNode STRING() { return getToken(ArrowsParser.STRING, 0); }
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
		enterRule(_localctx, 26, RULE_quotedString);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211); match(QUOT);
			setState(213);
			_la = _input.LA(1);
			if (_la==STRING || _la==ANYSTRING) {
				{
				setState(212);
				((QuotedStringContext)_localctx).content = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==STRING || _la==ANYSTRING) ) {
					((QuotedStringContext)_localctx).content = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(215); match(QUOT);
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
		enterRule(_localctx, 28, RULE_lvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217); match(STRING);
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
		public List<TerminalNode> COMMA() { return getTokens(ArrowsParser.COMMA); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(ArrowsParser.COMMA, i);
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
		enterRule(_localctx, 30, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(219); variable();
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(220); match(COMMA);
					setState(221); variable();
					}
					}
					setState(226);
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
		public List<TerminalNode> COMMA() { return getTokens(ArrowsParser.COMMA); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(ArrowsParser.COMMA, i);
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
		enterRule(_localctx, 32, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << ADD) | (1L << SUB) | (1L << NOT) | (1L << PAREN_OPEN) | (1L << QUOT) | (1L << STRING))) != 0)) {
				{
				setState(229); expression(0);
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(230); match(COMMA);
					setState(231); expression(0);
					}
					}
					setState(236);
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
		public BoundedRangeContext boundedRange() {
			return getRuleContext(BoundedRangeContext.class,0);
		}
		public SingleRangeContext singleRange() {
			return getRuleContext(SingleRangeContext.class,0);
		}
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
		enterRule(_localctx, 34, RULE_range);
		try {
			setState(241);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(239); singleRange();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(240); boundedRange();
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

	public static class SingleRangeContext extends ParserRuleContext {
		public TerminalNode LR() { return getToken(ArrowsParser.LR, 0); }
		public TerminalNode RR() { return getToken(ArrowsParser.RR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SingleRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleRange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterSingleRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitSingleRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitSingleRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleRangeContext singleRange() throws RecognitionException {
		SingleRangeContext _localctx = new SingleRangeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_singleRange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243); match(LR);
			setState(244); expression(0);
			setState(245); match(RR);
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

	public static class BoundedRangeContext extends ParserRuleContext {
		public TerminalNode LR() { return getToken(ArrowsParser.LR, 0); }
		public TerminalNode DOTS() { return getToken(ArrowsParser.DOTS, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RR() { return getToken(ArrowsParser.RR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public BoundedRangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boundedRange; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).enterBoundedRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ArrowsListener ) ((ArrowsListener)listener).exitBoundedRange(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ArrowsVisitor ) return ((ArrowsVisitor<? extends T>)visitor).visitBoundedRange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoundedRangeContext boundedRange() throws RecognitionException {
		BoundedRangeContext _localctx = new BoundedRangeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_boundedRange);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247); match(LR);
			setState(248); expression(0);
			setState(249); match(DOTS);
			setState(250); expression(0);
			setState(251); match(RR);
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
		case 11: return expression_sempred((ExpressionContext)_localctx, predIndex);
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
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3;\u0100\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\7\2,\n\2\f\2\16\2/\13\2\3\2\7\2\62"+
		"\n\2\f\2\16\2\65\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\7\4D\n\4\f\4\16\4G\13\4\3\5\3\5\7\5K\n\5\f\5\16\5N\13\5\3\5\3\5\7"+
		"\5R\n\5\f\5\16\5U\13\5\3\5\3\5\3\6\6\6Z\n\6\r\6\16\6[\3\6\6\6_\n\6\r\6"+
		"\16\6`\3\6\3\6\3\6\3\6\3\6\3\6\7\6i\n\6\f\6\16\6l\13\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\5\6t\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\5\6\u0085\n\6\3\7\3\7\3\7\3\7\7\7\u008b\n\7\f\7\16\7\u008e\13"+
		"\7\3\b\3\b\3\b\3\b\7\b\u0094\n\b\f\b\16\b\u0097\13\b\3\b\3\b\5\b\u009b"+
		"\n\b\3\t\3\t\3\t\5\t\u00a0\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00b9\n\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00ca\n"+
		"\r\f\r\16\r\u00cd\13\r\3\16\3\16\7\16\u00d1\n\16\f\16\16\16\u00d4\13\16"+
		"\3\17\3\17\5\17\u00d8\n\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\7\21\u00e1"+
		"\n\21\f\21\16\21\u00e4\13\21\5\21\u00e6\n\21\3\22\3\22\3\22\7\22\u00eb"+
		"\n\22\f\22\16\22\u00ee\13\22\5\22\u00f0\n\22\3\23\3\23\5\23\u00f4\n\23"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\2\26\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(\2\n\3\2\b\t\4\2\b\b\25\25\4\2\t\t"+
		"\27\27\3\2\n\24\3\2\36\37\3\2\34\35\4\2$%()\4\2\67\6799\u0113\2-\3\2\2"+
		"\2\48\3\2\2\2\6@\3\2\2\2\bH\3\2\2\2\n\u0084\3\2\2\2\f\u0086\3\2\2\2\16"+
		"\u008f\3\2\2\2\20\u009f\3\2\2\2\22\u00a1\3\2\2\2\24\u00a3\3\2\2\2\26\u00a5"+
		"\3\2\2\2\30\u00b8\3\2\2\2\32\u00ce\3\2\2\2\34\u00d5\3\2\2\2\36\u00db\3"+
		"\2\2\2 \u00e5\3\2\2\2\"\u00ef\3\2\2\2$\u00f3\3\2\2\2&\u00f5\3\2\2\2(\u00f9"+
		"\3\2\2\2*,\5\4\3\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\63\3\2\2\2"+
		"/-\3\2\2\2\60\62\78\2\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64"+
		"\3\2\2\2\64\66\3\2\2\2\65\63\3\2\2\2\66\67\5\6\4\2\67\3\3\2\2\289\7\3"+
		"\2\29:\5\36\20\2:;\7\62\2\2;<\5 \21\2<=\7\63\2\2=>\7\6\2\2>?\5\n\6\2?"+
		"\5\3\2\2\2@E\5\n\6\2AB\78\2\2BD\5\n\6\2CA\3\2\2\2DG\3\2\2\2EC\3\2\2\2"+
		"EF\3\2\2\2F\7\3\2\2\2GE\3\2\2\2HL\7\4\2\2IK\78\2\2JI\3\2\2\2KN\3\2\2\2"+
		"LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2NL\3\2\2\2OS\5\6\4\2PR\78\2\2QP\3\2\2\2"+
		"RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2TV\3\2\2\2US\3\2\2\2VW\7\5\2\2W\t\3\2\2"+
		"\2XZ\5\f\7\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\u0085\3\2\2\2"+
		"]_\5\16\b\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\u0085\3\2\2\2bc\5"+
		"\30\r\2cd\5\20\t\2dj\5\30\r\2ef\5\20\t\2fg\5\30\r\2gi\3\2\2\2he\3\2\2"+
		"\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\u0085\3\2\2\2lj\3\2\2\2m\u0085\5\b\5"+
		"\2no\5\30\r\2op\7\6\2\2ps\5\n\6\2qr\7+\2\2rt\5\n\6\2sq\3\2\2\2st\3\2\2"+
		"\2t\u0085\3\2\2\2uv\7,\2\2vw\5\30\r\2wx\7\6\2\2xy\5\n\6\2y\u0085\3\2\2"+
		"\2z{\7-\2\2{|\5\30\r\2|}\t\2\2\2}~\5$\23\2~\177\7\6\2\2\177\u0080\5\n"+
		"\6\2\u0080\u0085\3\2\2\2\u0081\u0082\7\32\2\2\u0082\u0085\5\30\r\2\u0083"+
		"\u0085\5\30\r\2\u0084Y\3\2\2\2\u0084^\3\2\2\2\u0084b\3\2\2\2\u0084m\3"+
		"\2\2\2\u0084n\3\2\2\2\u0084u\3\2\2\2\u0084z\3\2\2\2\u0084\u0081\3\2\2"+
		"\2\u0084\u0083\3\2\2\2\u0085\13\3\2\2\2\u0086\u0087\5\22\n\2\u0087\u008c"+
		"\5\32\16\2\u0088\u0089\7\64\2\2\u0089\u008b\5\32\16\2\u008a\u0088\3\2"+
		"\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\r\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\5\24\13\2\u0090\u0095\5\30"+
		"\r\2\u0091\u0092\7\64\2\2\u0092\u0094\5\30\r\2\u0093\u0091\3\2\2\2\u0094"+
		"\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u009a\3\2"+
		"\2\2\u0097\u0095\3\2\2\2\u0098\u0099\7\6\2\2\u0099\u009b\5\34\17\2\u009a"+
		"\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\17\3\2\2\2\u009c\u00a0\5\22\n"+
		"\2\u009d\u00a0\5\24\13\2\u009e\u00a0\5\26\f\2\u009f\u009c\3\2\2\2\u009f"+
		"\u009d\3\2\2\2\u009f\u009e\3\2\2\2\u00a0\21\3\2\2\2\u00a1\u00a2\t\3\2"+
		"\2\u00a2\23\3\2\2\2\u00a3\u00a4\t\4\2\2\u00a4\25\3\2\2\2\u00a5\u00a6\t"+
		"\5\2\2\u00a6\27\3\2\2\2\u00a7\u00a8\b\r\1\2\u00a8\u00a9\t\6\2\2\u00a9"+
		"\u00b9\5\30\r\2\u00aa\u00ab\7\61\2\2\u00ab\u00b9\5\30\r\2\u00ac\u00ad"+
		"\7\62\2\2\u00ad\u00ae\5\30\r\2\u00ae\u00af\7\63\2\2\u00af\u00b9\3\2\2"+
		"\2\u00b0\u00b1\5\36\20\2\u00b1\u00b2\7\62\2\2\u00b2\u00b3\5\"\22\2\u00b3"+
		"\u00b4\7\63\2\2\u00b4\u00b9\3\2\2\2\u00b5\u00b9\5\32\16\2\u00b6\u00b9"+
		"\7\33\2\2\u00b7\u00b9\5\34\17\2\u00b8\u00a7\3\2\2\2\u00b8\u00aa\3\2\2"+
		"\2\u00b8\u00ac\3\2\2\2\u00b8\u00b0\3\2\2\2\u00b8\u00b5\3\2\2\2\u00b8\u00b6"+
		"\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00cb\3\2\2\2\u00ba\u00bb\6\r\2\3\u00bb"+
		"\u00bc\t\7\2\2\u00bc\u00ca\5\30\r\2\u00bd\u00be\6\r\3\3\u00be\u00bf\t"+
		"\6\2\2\u00bf\u00ca\5\30\r\2\u00c0\u00c1\6\r\4\3\u00c1\u00c2\7/\2\2\u00c2"+
		"\u00ca\5\30\r\2\u00c3\u00c4\6\r\5\3\u00c4\u00c5\7\60\2\2\u00c5\u00ca\5"+
		"\30\r\2\u00c6\u00c7\6\r\6\3\u00c7\u00c8\t\b\2\2\u00c8\u00ca\5\30\r\2\u00c9"+
		"\u00ba\3\2\2\2\u00c9\u00bd\3\2\2\2\u00c9\u00c0\3\2\2\2\u00c9\u00c3\3\2"+
		"\2\2\u00c9\u00c6\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\31\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00d2\5\36\20"+
		"\2\u00cf\u00d1\5$\23\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0"+
		"\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\33\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5"+
		"\u00d7\7\65\2\2\u00d6\u00d8\t\t\2\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8\3"+
		"\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\7\65\2\2\u00da\35\3\2\2\2\u00db"+
		"\u00dc\7\67\2\2\u00dc\37\3\2\2\2\u00dd\u00e2\5\32\16\2\u00de\u00df\7\64"+
		"\2\2\u00df\u00e1\5\32\16\2\u00e0\u00de\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2"+
		"\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2"+
		"\2\2\u00e5\u00dd\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6!\3\2\2\2\u00e7\u00ec"+
		"\5\30\r\2\u00e8\u00e9\7\64\2\2\u00e9\u00eb\5\30\r\2\u00ea\u00e8\3\2\2"+
		"\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00f0"+
		"\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00e7\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"#\3\2\2\2\u00f1\u00f4\5&\24\2\u00f2\u00f4\5(\25\2\u00f3\u00f1\3\2\2\2"+
		"\u00f3\u00f2\3\2\2\2\u00f4%\3\2\2\2\u00f5\u00f6\7 \2\2\u00f6\u00f7\5\30"+
		"\r\2\u00f7\u00f8\7!\2\2\u00f8\'\3\2\2\2\u00f9\u00fa\7 \2\2\u00fa\u00fb"+
		"\5\30\r\2\u00fb\u00fc\7\"\2\2\u00fc\u00fd\5\30\r\2\u00fd\u00fe\7!\2\2"+
		"\u00fe)\3\2\2\2\32-\63ELS[`js\u0084\u008c\u0095\u009a\u009f\u00b8\u00c9"+
		"\u00cb\u00d2\u00d7\u00e2\u00e5\u00ec\u00ef\u00f3";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
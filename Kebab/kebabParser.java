// Generated from kebab.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class kebabParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__12=1, T__11=2, T__10=3, T__9=4, T__8=5, T__7=6, T__6=7, T__5=8, T__4=9, 
		T__3=10, T__2=11, T__1=12, T__0=13, COMMENT=14, LINE_COMMENT=15, ELSEIF=16, 
		SEMICOLON=17, HASHMAP=18, SIZE=19, CONTAINS=20, FOREACH=21, AS=22, REMOVE=23, 
		DOT=24, SET=25, INSERT=26, INSERT_UNIQUE=27, FUNCTION=28, DO=29, SWITCH=30, 
		CASE=31, DEFAULT=32, FOR=33, TRUE=34, FALSE=35, GR=36, GRT=37, LR=38, 
		LRT=39, EQ=40, NEQ=41, TYPE_BOOLEAN=42, TYPE_BYTE=43, TYPE_SHORT=44, TYPE_INT=45, 
		TYPE_LONG=46, TYPE_FLOAT=47, TYPE_DOUBLE=48, TYPE_CHAR=49, TYPE_ARRAY=50, 
		TYPE_STRING=51, TYPE_SET=52, TYPE_HASHMAP=53, LONG=54, DOUBLE=55, MOD=56, 
		MUL=57, DIV=58, ADD=59, SUB=60, EXP=61, WHITESPACE=62, NEWLINE=63, ASSIGN=64, 
		BLOCK_START=65, BLOCK_END=66, IF=67, ELSE=68, WHILE=69, AND=70, OR=71, 
		NOT=72, PAREN_OPEN=73, PAREN_CLOSE=74, STRING=75, CHAR=76;
	public static final String[] tokenNames = {
		"<INVALID>", "'return'", "'class'", "'FloatToInt'", "'readString'", "'\"'", 
		"'IntToFloat'", "'print'", "','", "'readChar'", "':'", "'['", "']'", "'readInt'", 
		"COMMENT", "LINE_COMMENT", "'elseif'", "';'", "HASHMAP", "'size'", "'contains'", 
		"'foreach'", "'as'", "'remove'", "'.'", "SET", "'insert'", "'insertUnique'", 
		"'function'", "'do'", "'switch'", "'case'", "'default'", "'for'", "'true'", 
		"'false'", "'>'", "'>='", "'<'", "'<='", "'=='", "'!='", "'boolean'", 
		"'byte'", "'short'", "'int'", "'long'", "'float'", "'double'", "'char'", 
		"'array'", "'string'", "TYPE_SET", "TYPE_HASHMAP", "LONG", "DOUBLE", "'%'", 
		"'*'", "'/'", "'+'", "'-'", "'^'", "WHITESPACE", "'\n'", "'='", "'{'", 
		"'}'", "'if'", "'else'", "'while'", "'and'", "'or'", "'not'", "'('", "')'", 
		"STRING", "CHAR"
	};
	public static final int
		RULE_init = 0, RULE_statements = 1, RULE_param_call = 2, RULE_primitive_typesaaa = 3, 
		RULE_primitive_types = 4, RULE_func_call = 5, RULE_param_decl = 6, RULE_func_decl = 7, 
		RULE_hash_map_declare = 8, RULE_set_declare = 9, RULE_string_declare = 10, 
		RULE_array_declare = 11, RULE_primitive_declare = 12, RULE_string_assign = 13, 
		RULE_set_remove = 14, RULE_set_assign = 15, RULE_hash_map_assign = 16, 
		RULE_set_assign_unique = 17, RULE_array_assign = 18, RULE_primitive_assign = 19, 
		RULE_primitive_declare_and_assign = 20, RULE_string_declare_and_assign = 21, 
		RULE_statement = 22, RULE_lvalue = 23, RULE_expression = 24;
	public static final String[] ruleNames = {
		"init", "statements", "param_call", "primitive_typesaaa", "primitive_types", 
		"func_call", "param_decl", "func_decl", "hash_map_declare", "set_declare", 
		"string_declare", "array_declare", "primitive_declare", "string_assign", 
		"set_remove", "set_assign", "hash_map_assign", "set_assign_unique", "array_assign", 
		"primitive_assign", "primitive_declare_and_assign", "string_declare_and_assign", 
		"statement", "lvalue", "expression"
	};

	@Override
	public String getGrammarFileName() { return "kebab.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public kebabParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InitContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50); match(T__11);
			setState(51); lvalue();
			setState(52); match(BLOCK_START);
			setState(53); statements();
			setState(54); match(BLOCK_END);
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
		public List<TerminalNode> SEMICOLON() { return getTokens(kebabParser.SEMICOLON); }
		public List<TerminalNode> NEWLINE() { return getTokens(kebabParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(kebabParser.NEWLINE, i);
		}
		public TerminalNode SEMICOLON(int i) {
			return getToken(kebabParser.SEMICOLON, i);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(56); statement();
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON || _la==NEWLINE) {
				{
				{
				setState(58); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(57);
						_la = _input.LA(1);
						if ( !(_la==SEMICOLON || _la==NEWLINE) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(60); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterParam_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitParam_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitParam_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_callContext param_call() throws RecognitionException {
		Param_callContext _localctx = new Param_callContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_param_call);
		int _la;
		try {
			setState(77);
			switch (_input.LA(1)) {
			case T__10:
			case T__9:
			case T__7:
			case T__4:
			case T__0:
			case TRUE:
			case FALSE:
			case LONG:
			case DOUBLE:
			case ADD:
			case SUB:
			case NOT:
			case PAREN_OPEN:
			case STRING:
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(68); expression(0);
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(69); match(T__5);
					setState(70); expression(0);
					}
					}
					setState(75);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case PAREN_CLOSE:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Primitive_typesaaaContext extends ParserRuleContext {
		public TerminalNode TYPE_BOOLEAN() { return getToken(kebabParser.TYPE_BOOLEAN, 0); }
		public TerminalNode TYPE_SHORT() { return getToken(kebabParser.TYPE_SHORT, 0); }
		public TerminalNode TYPE_LONG() { return getToken(kebabParser.TYPE_LONG, 0); }
		public TerminalNode TYPE_INT() { return getToken(kebabParser.TYPE_INT, 0); }
		public TerminalNode TYPE_CHAR() { return getToken(kebabParser.TYPE_CHAR, 0); }
		public TerminalNode TYPE_BYTE() { return getToken(kebabParser.TYPE_BYTE, 0); }
		public TerminalNode TYPE_FLOAT() { return getToken(kebabParser.TYPE_FLOAT, 0); }
		public TerminalNode TYPE_DOUBLE() { return getToken(kebabParser.TYPE_DOUBLE, 0); }
		public Primitive_typesaaaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive_typesaaa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterPrimitive_typesaaa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitPrimitive_typesaaa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitPrimitive_typesaaa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primitive_typesaaaContext primitive_typesaaa() throws RecognitionException {
		Primitive_typesaaaContext _localctx = new Primitive_typesaaaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_primitive_typesaaa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE_BOOLEAN) | (1L << TYPE_BYTE) | (1L << TYPE_SHORT) | (1L << TYPE_INT) | (1L << TYPE_LONG) | (1L << TYPE_FLOAT) | (1L << TYPE_DOUBLE) | (1L << TYPE_CHAR))) != 0)) ) {
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

	public static class Primitive_typesContext extends ParserRuleContext {
		public Token type;
		public Primitive_typesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive_types; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterPrimitive_types(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitPrimitive_types(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitPrimitive_types(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primitive_typesContext primitive_types() throws RecognitionException {
		Primitive_typesContext _localctx = new Primitive_typesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_primitive_types);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			((Primitive_typesContext)_localctx).type = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE_BOOLEAN) | (1L << TYPE_BYTE) | (1L << TYPE_SHORT) | (1L << TYPE_INT) | (1L << TYPE_LONG) | (1L << TYPE_FLOAT) | (1L << TYPE_DOUBLE) | (1L << TYPE_CHAR))) != 0)) ) {
				((Primitive_typesContext)_localctx).type = (Token)_errHandler.recoverInline(this);
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

	public static class Func_callContext extends ParserRuleContext {
		public Param_callContext param_call() {
			return getRuleContext(Param_callContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterFunc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitFunc_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitFunc_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_func_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83); lvalue();
			setState(84); match(PAREN_OPEN);
			setState(85); param_call();
			setState(86); match(PAREN_CLOSE);
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

	public static class Param_declContext extends ParserRuleContext {
		public Primitive_typesContext primitive_types(int i) {
			return getRuleContext(Primitive_typesContext.class,i);
		}
		public List<LvalueContext> lvalue() {
			return getRuleContexts(LvalueContext.class);
		}
		public LvalueContext lvalue(int i) {
			return getRuleContext(LvalueContext.class,i);
		}
		public List<Primitive_typesContext> primitive_types() {
			return getRuleContexts(Primitive_typesContext.class);
		}
		public Param_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterParam_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitParam_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitParam_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_declContext param_decl() throws RecognitionException {
		Param_declContext _localctx = new Param_declContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_param_decl);
		int _la;
		try {
			setState(100);
			switch (_input.LA(1)) {
			case TYPE_BOOLEAN:
			case TYPE_BYTE:
			case TYPE_SHORT:
			case TYPE_INT:
			case TYPE_LONG:
			case TYPE_FLOAT:
			case TYPE_DOUBLE:
			case TYPE_CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(88); primitive_types();
				setState(89); lvalue();
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(90); match(T__5);
					setState(91); primitive_types();
					setState(92); lvalue();
					}
					}
					setState(98);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case PAREN_CLOSE:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Func_declContext extends ParserRuleContext {
		public Token type;
		public TerminalNode FUNCTION() { return getToken(kebabParser.FUNCTION, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode BLOCK_END() { return getToken(kebabParser.BLOCK_END, 0); }
		public Param_declContext param_decl() {
			return getRuleContext(Param_declContext.class,0);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode BLOCK_START() { return getToken(kebabParser.BLOCK_START, 0); }
		public Func_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterFunc_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitFunc_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitFunc_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_declContext func_decl() throws RecognitionException {
		Func_declContext _localctx = new Func_declContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_func_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			((Func_declContext)_localctx).type = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE_BOOLEAN) | (1L << TYPE_BYTE) | (1L << TYPE_SHORT) | (1L << TYPE_INT) | (1L << TYPE_LONG) | (1L << TYPE_FLOAT) | (1L << TYPE_DOUBLE) | (1L << TYPE_CHAR))) != 0)) ) {
				((Func_declContext)_localctx).type = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(103); match(FUNCTION);
			setState(104); lvalue();
			setState(105); match(PAREN_OPEN);
			setState(106); param_decl();
			setState(107); match(PAREN_CLOSE);
			setState(108); match(BLOCK_START);
			setState(109); statements();
			setState(110); match(BLOCK_END);
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

	public static class Hash_map_declareContext extends ParserRuleContext {
		public Token type_key;
		public Token type_value;
		public TerminalNode HASHMAP() { return getToken(kebabParser.HASHMAP, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public Hash_map_declareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hash_map_declare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterHash_map_declare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitHash_map_declare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitHash_map_declare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Hash_map_declareContext hash_map_declare() throws RecognitionException {
		Hash_map_declareContext _localctx = new Hash_map_declareContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_hash_map_declare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112); match(HASHMAP);
			setState(113); match(LR);
			setState(114);
			((Hash_map_declareContext)_localctx).type_key = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE_BOOLEAN) | (1L << TYPE_BYTE) | (1L << TYPE_SHORT) | (1L << TYPE_INT) | (1L << TYPE_LONG) | (1L << TYPE_FLOAT) | (1L << TYPE_DOUBLE) | (1L << TYPE_CHAR))) != 0)) ) {
				((Hash_map_declareContext)_localctx).type_key = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(115); match(T__5);
			setState(116);
			((Hash_map_declareContext)_localctx).type_value = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE_BOOLEAN) | (1L << TYPE_BYTE) | (1L << TYPE_SHORT) | (1L << TYPE_INT) | (1L << TYPE_LONG) | (1L << TYPE_FLOAT) | (1L << TYPE_DOUBLE) | (1L << TYPE_CHAR))) != 0)) ) {
				((Hash_map_declareContext)_localctx).type_value = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(117); match(GR);
			setState(118); lvalue();
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

	public static class Set_declareContext extends ParserRuleContext {
		public Token type;
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode SET() { return getToken(kebabParser.SET, 0); }
		public Set_declareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_declare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterSet_declare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitSet_declare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitSet_declare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_declareContext set_declare() throws RecognitionException {
		Set_declareContext _localctx = new Set_declareContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_set_declare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120); match(SET);
			setState(121); match(LR);
			setState(122);
			((Set_declareContext)_localctx).type = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE_BOOLEAN) | (1L << TYPE_BYTE) | (1L << TYPE_SHORT) | (1L << TYPE_INT) | (1L << TYPE_LONG) | (1L << TYPE_FLOAT) | (1L << TYPE_DOUBLE) | (1L << TYPE_CHAR))) != 0)) ) {
				((Set_declareContext)_localctx).type = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(123); match(GR);
			setState(124); lvalue();
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

	public static class String_declareContext extends ParserRuleContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public String_declareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_declare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterString_declare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitString_declare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitString_declare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_declareContext string_declare() throws RecognitionException {
		String_declareContext _localctx = new String_declareContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_string_declare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126); match(TYPE_STRING);
			setState(127); lvalue();
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

	public static class Array_declareContext extends ParserRuleContext {
		public Token type;
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Array_declareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_declare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterArray_declare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitArray_declare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitArray_declare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_declareContext array_declare() throws RecognitionException {
		Array_declareContext _localctx = new Array_declareContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_array_declare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			((Array_declareContext)_localctx).type = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE_BOOLEAN) | (1L << TYPE_BYTE) | (1L << TYPE_SHORT) | (1L << TYPE_INT) | (1L << TYPE_LONG) | (1L << TYPE_FLOAT) | (1L << TYPE_DOUBLE) | (1L << TYPE_CHAR))) != 0)) ) {
				((Array_declareContext)_localctx).type = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(130); match(T__2);
			setState(131); expression(0);
			setState(132); match(T__1);
			setState(133); lvalue();
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

	public static class Primitive_declareContext extends ParserRuleContext {
		public Token type;
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public Primitive_declareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive_declare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterPrimitive_declare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitPrimitive_declare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitPrimitive_declare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primitive_declareContext primitive_declare() throws RecognitionException {
		Primitive_declareContext _localctx = new Primitive_declareContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_primitive_declare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			((Primitive_declareContext)_localctx).type = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE_BOOLEAN) | (1L << TYPE_BYTE) | (1L << TYPE_SHORT) | (1L << TYPE_INT) | (1L << TYPE_LONG) | (1L << TYPE_FLOAT) | (1L << TYPE_DOUBLE) | (1L << TYPE_CHAR))) != 0)) ) {
				((Primitive_declareContext)_localctx).type = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(136); lvalue();
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

	public static class String_assignContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(kebabParser.ASSIGN, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode STRING() { return getToken(kebabParser.STRING, 0); }
		public String_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterString_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitString_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitString_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_assignContext string_assign() throws RecognitionException {
		String_assignContext _localctx = new String_assignContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_string_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138); lvalue();
			setState(139); match(ASSIGN);
			setState(140); match(T__8);
			setState(141); match(STRING);
			setState(142); match(T__8);
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

	public static class Set_removeContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(kebabParser.DOT, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode REMOVE() { return getToken(kebabParser.REMOVE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Set_removeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_remove; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterSet_remove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitSet_remove(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitSet_remove(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_removeContext set_remove() throws RecognitionException {
		Set_removeContext _localctx = new Set_removeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_set_remove);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144); lvalue();
			setState(145); match(DOT);
			setState(146); match(REMOVE);
			setState(147); match(PAREN_OPEN);
			setState(148); expression(0);
			setState(149); match(PAREN_CLOSE);
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

	public static class Set_assignContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(kebabParser.DOT, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INSERT() { return getToken(kebabParser.INSERT, 0); }
		public Set_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterSet_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitSet_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitSet_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_assignContext set_assign() throws RecognitionException {
		Set_assignContext _localctx = new Set_assignContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_set_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151); lvalue();
			setState(152); match(DOT);
			setState(153); match(INSERT);
			setState(154); match(PAREN_OPEN);
			setState(155); expression(0);
			setState(156); match(PAREN_CLOSE);
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

	public static class Hash_map_assignContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(kebabParser.DOT, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode INSERT() { return getToken(kebabParser.INSERT, 0); }
		public Hash_map_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hash_map_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterHash_map_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitHash_map_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitHash_map_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Hash_map_assignContext hash_map_assign() throws RecognitionException {
		Hash_map_assignContext _localctx = new Hash_map_assignContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_hash_map_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158); lvalue();
			setState(159); match(DOT);
			setState(160); match(INSERT);
			setState(161); match(PAREN_OPEN);
			setState(162); expression(0);
			setState(163); match(T__5);
			setState(164); expression(0);
			setState(165); match(PAREN_CLOSE);
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

	public static class Set_assign_uniqueContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(kebabParser.DOT, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INSERT_UNIQUE() { return getToken(kebabParser.INSERT_UNIQUE, 0); }
		public Set_assign_uniqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_assign_unique; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterSet_assign_unique(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitSet_assign_unique(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitSet_assign_unique(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_assign_uniqueContext set_assign_unique() throws RecognitionException {
		Set_assign_uniqueContext _localctx = new Set_assign_uniqueContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_set_assign_unique);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167); lvalue();
			setState(168); match(DOT);
			setState(169); match(INSERT_UNIQUE);
			setState(170); match(PAREN_OPEN);
			setState(171); expression(0);
			setState(172); match(PAREN_CLOSE);
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

	public static class Array_assignContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(kebabParser.ASSIGN, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public Array_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterArray_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitArray_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitArray_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_assignContext array_assign() throws RecognitionException {
		Array_assignContext _localctx = new Array_assignContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_array_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174); lvalue();
			setState(175); match(T__2);
			setState(176); expression(0);
			setState(177); match(T__1);
			setState(178); match(ASSIGN);
			setState(179); expression(0);
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

	public static class Primitive_assignContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(kebabParser.ASSIGN, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Primitive_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterPrimitive_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitPrimitive_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitPrimitive_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primitive_assignContext primitive_assign() throws RecognitionException {
		Primitive_assignContext _localctx = new Primitive_assignContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_primitive_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181); lvalue();
			setState(182); match(ASSIGN);
			setState(183); expression(0);
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

	public static class Primitive_declare_and_assignContext extends ParserRuleContext {
		public Token type;
		public TerminalNode ASSIGN() { return getToken(kebabParser.ASSIGN, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Primitive_declare_and_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive_declare_and_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterPrimitive_declare_and_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitPrimitive_declare_and_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitPrimitive_declare_and_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Primitive_declare_and_assignContext primitive_declare_and_assign() throws RecognitionException {
		Primitive_declare_and_assignContext _localctx = new Primitive_declare_and_assignContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_primitive_declare_and_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			((Primitive_declare_and_assignContext)_localctx).type = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE_BOOLEAN) | (1L << TYPE_BYTE) | (1L << TYPE_SHORT) | (1L << TYPE_INT) | (1L << TYPE_LONG) | (1L << TYPE_FLOAT) | (1L << TYPE_DOUBLE) | (1L << TYPE_CHAR))) != 0)) ) {
				((Primitive_declare_and_assignContext)_localctx).type = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(186); lvalue();
			setState(187); match(ASSIGN);
			setState(188); expression(0);
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

	public static class String_declare_and_assignContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(kebabParser.ASSIGN, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode STRING() { return getToken(kebabParser.STRING, 0); }
		public String_declare_and_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_declare_and_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterString_declare_and_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitString_declare_and_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitString_declare_and_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_declare_and_assignContext string_declare_and_assign() throws RecognitionException {
		String_declare_and_assignContext _localctx = new String_declare_and_assignContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_string_declare_and_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190); match(TYPE_STRING);
			setState(191); lvalue();
			setState(192); match(ASSIGN);
			setState(193); match(T__8);
			setState(194); match(STRING);
			setState(195); match(T__8);
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
	public static class NoPrintContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NoPrintContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterNoPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitNoPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitNoPrint(this);
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
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterRet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitRet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitRet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EmpContext extends StatementContext {
		public EmpContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterEmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitEmp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitEmp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoWhileContext extends StatementContext {
		public TerminalNode DO() { return getToken(kebabParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(kebabParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DoWhileContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterDoWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitDoWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitDoWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RemoveContext extends StatementContext {
		public Set_removeContext set_remove() {
			return getRuleContext(Set_removeContext.class,0);
		}
		public RemoveContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterRemove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitRemove(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitRemove(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclareContext extends StatementContext {
		public Primitive_declareContext primitive_declare() {
			return getRuleContext(Primitive_declareContext.class,0);
		}
		public Set_declareContext set_declare() {
			return getRuleContext(Set_declareContext.class,0);
		}
		public Array_declareContext array_declare() {
			return getRuleContext(Array_declareContext.class,0);
		}
		public Hash_map_declareContext hash_map_declare() {
			return getRuleContext(Hash_map_declareContext.class,0);
		}
		public String_declareContext string_declare() {
			return getRuleContext(String_declareContext.class,0);
		}
		public DeclareContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitDeclare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitDeclare(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileDoContext extends StatementContext {
		public TerminalNode DO() { return getToken(kebabParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(kebabParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhileDoContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterWhileDo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitWhileDo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitWhileDo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForCyclusContext extends StatementContext {
		public List<TerminalNode> SEMICOLON() { return getTokens(kebabParser.SEMICOLON); }
		public TerminalNode FOR() { return getToken(kebabParser.FOR, 0); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(kebabParser.SEMICOLON, i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<Primitive_assignContext> primitive_assign() {
			return getRuleContexts(Primitive_assignContext.class);
		}
		public Primitive_assignContext primitive_assign(int i) {
			return getRuleContext(Primitive_assignContext.class,i);
		}
		public ForCyclusContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterForCyclus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitForCyclus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitForCyclus(this);
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
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SwitchContext extends StatementContext {
		public List<TerminalNode> CASE() { return getTokens(kebabParser.CASE); }
		public TerminalNode SWITCH() { return getToken(kebabParser.SWITCH, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(kebabParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(kebabParser.NEWLINE, i);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode DEFAULT() { return getToken(kebabParser.DEFAULT, 0); }
		public TerminalNode CASE(int i) {
			return getToken(kebabParser.CASE, i);
		}
		public SwitchContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterSwitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitSwitch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitSwitch(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockContext extends StatementContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode BLOCK_END() { return getToken(kebabParser.BLOCK_END, 0); }
		public TerminalNode BLOCK_START() { return getToken(kebabParser.BLOCK_START, 0); }
		public BlockContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForeachContext extends StatementContext {
		public TerminalNode FOREACH() { return getToken(kebabParser.FOREACH, 0); }
		public List<LvalueContext> lvalue() {
			return getRuleContexts(LvalueContext.class);
		}
		public LvalueContext lvalue(int i) {
			return getRuleContext(LvalueContext.class,i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode AS() { return getToken(kebabParser.AS, 0); }
		public ForeachContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterForeach(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitForeach(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitForeach(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignContext extends StatementContext {
		public Set_assignContext set_assign() {
			return getRuleContext(Set_assignContext.class,0);
		}
		public Array_assignContext array_assign() {
			return getRuleContext(Array_assignContext.class,0);
		}
		public String_assignContext string_assign() {
			return getRuleContext(String_assignContext.class,0);
		}
		public Set_assign_uniqueContext set_assign_unique() {
			return getRuleContext(Set_assign_uniqueContext.class,0);
		}
		public Primitive_assignContext primitive_assign() {
			return getRuleContext(Primitive_assignContext.class,0);
		}
		public AssignContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfContext extends StatementContext {
		public List<TerminalNode> ELSE() { return getTokens(kebabParser.ELSE); }
		public List<TerminalNode> ELSEIF() { return getTokens(kebabParser.ELSEIF); }
		public List<TerminalNode> IF() { return getTokens(kebabParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(kebabParser.IF, i);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ELSEIF(int i) {
			return getToken(kebabParser.ELSEIF, i);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode ELSE(int i) {
			return getToken(kebabParser.ELSE, i);
		}
		public IfContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncDeclContext extends StatementContext {
		public Func_declContext func_decl() {
			return getRuleContext(Func_declContext.class,0);
		}
		public FuncDeclContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterFuncDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitFuncDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitFuncDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclareAndAssignContext extends StatementContext {
		public Primitive_declare_and_assignContext primitive_declare_and_assign() {
			return getRuleContext(Primitive_declare_and_assignContext.class,0);
		}
		public String_declare_and_assignContext string_declare_and_assign() {
			return getRuleContext(String_declare_and_assignContext.class,0);
		}
		public DeclareAndAssignContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterDeclareAndAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitDeclareAndAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitDeclareAndAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(320);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new RemoveContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(197); set_remove();
				}
				}
				break;
			case 2:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(198); set_assign_unique();
					}
					break;
				case 2:
					{
					setState(199); set_assign();
					}
					break;
				case 3:
					{
					setState(200); string_assign();
					}
					break;
				case 4:
					{
					setState(201); array_assign();
					}
					break;
				case 5:
					{
					setState(202); primitive_assign();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new DeclareContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(210);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(205); hash_map_declare();
					}
					break;
				case 2:
					{
					setState(206); set_declare();
					}
					break;
				case 3:
					{
					setState(207); string_declare();
					}
					break;
				case 4:
					{
					setState(208); array_declare();
					}
					break;
				case 5:
					{
					setState(209); primitive_declare();
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new DeclareAndAssignContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(214);
				switch (_input.LA(1)) {
				case TYPE_BOOLEAN:
				case TYPE_BYTE:
				case TYPE_SHORT:
				case TYPE_INT:
				case TYPE_LONG:
				case TYPE_FLOAT:
				case TYPE_DOUBLE:
				case TYPE_CHAR:
					{
					setState(212); primitive_declare_and_assign();
					}
					break;
				case TYPE_STRING:
					{
					setState(213); string_declare_and_assign();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 5:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(216); match(T__6);
				setState(217); match(PAREN_OPEN);
				setState(218); expression(0);
				setState(219); match(PAREN_CLOSE);
				}
				break;
			case 6:
				_localctx = new NoPrintContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(221); expression(0);
				}
				break;
			case 7:
				_localctx = new BlockContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(222); match(BLOCK_START);
				setState(223); statements();
				setState(224); match(BLOCK_END);
				}
				break;
			case 8:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(226); match(IF);
				setState(227); match(PAREN_OPEN);
				setState(228); expression(0);
				setState(229); match(PAREN_CLOSE);
				setState(230); statement();
				setState(243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(234);
						switch (_input.LA(1)) {
						case ELSE:
							{
							setState(231); match(ELSE);
							setState(232); match(IF);
							}
							break;
						case ELSEIF:
							{
							setState(233); match(ELSEIF);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(236); match(PAREN_OPEN);
						setState(237); expression(0);
						setState(238); match(PAREN_CLOSE);
						setState(239); statement();
						}
						} 
					}
					setState(245);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				setState(248);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(246); match(ELSE);
					setState(247); statement();
					}
					break;
				}
				}
				break;
			case 9:
				_localctx = new SwitchContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(250); match(SWITCH);
				setState(251); match(PAREN_OPEN);
				setState(252); expression(0);
				setState(253); match(PAREN_CLOSE);
				setState(254); match(BLOCK_START);
				setState(265); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(256); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(255); match(NEWLINE);
							}
							}
							setState(258); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==NEWLINE );
						setState(260); match(CASE);
						setState(261); expression(0);
						setState(262); match(T__3);
						setState(263); statement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(267); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(270); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(269); match(NEWLINE);
					}
					}
					setState(272); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(274); match(DEFAULT);
				setState(275); match(T__3);
				setState(276); statement();
				setState(278); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(277); match(NEWLINE);
					}
					}
					setState(280); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(282); match(BLOCK_END);
				}
				break;
			case 10:
				_localctx = new WhileDoContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(284); match(WHILE);
				setState(285); match(PAREN_OPEN);
				setState(286); expression(0);
				setState(287); match(PAREN_CLOSE);
				setState(288); match(DO);
				setState(289); statement();
				}
				break;
			case 11:
				_localctx = new DoWhileContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(291); match(DO);
				setState(292); statement();
				setState(293); match(WHILE);
				setState(294); match(PAREN_OPEN);
				setState(295); expression(0);
				setState(296); match(PAREN_CLOSE);
				}
				break;
			case 12:
				_localctx = new ForCyclusContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(298); match(FOR);
				setState(299); match(PAREN_OPEN);
				setState(300); primitive_assign();
				setState(301); match(SEMICOLON);
				setState(302); expression(0);
				setState(303); match(SEMICOLON);
				setState(304); primitive_assign();
				setState(305); match(PAREN_CLOSE);
				setState(306); statement();
				}
				break;
			case 13:
				_localctx = new ForeachContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(308); match(FOREACH);
				setState(309); match(PAREN_OPEN);
				setState(310); lvalue();
				setState(311); match(AS);
				setState(312); lvalue();
				setState(313); match(PAREN_CLOSE);
				setState(314); statement();
				}
				break;
			case 14:
				_localctx = new FuncDeclContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(316); func_decl();
				}
				break;
			case 15:
				_localctx = new RetContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(317); match(T__12);
				setState(318); expression(0);
				}
				break;
			case 16:
				_localctx = new EmpContext(_localctx);
				enterOuterAlt(_localctx, 16);
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

	public static class LvalueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(kebabParser.STRING, 0); }
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterLvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitLvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitLvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LvalueContext lvalue() throws RecognitionException {
		LvalueContext _localctx = new LvalueContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_lvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322); match(STRING);
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
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParContext extends ExpressionContext {
		public TerminalNode PAREN_CLOSE() { return getToken(kebabParser.PAREN_CLOSE, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(kebabParser.PAREN_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitPar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatToIntContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FloatToIntContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterFloatToInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitFloatToInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitFloatToInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddContext extends ExpressionContext {
		public Token op;
		public TerminalNode SUB() { return getToken(kebabParser.SUB, 0); }
		public TerminalNode ADD() { return getToken(kebabParser.ADD, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public AddContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(kebabParser.OR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public OrContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReadIntContext extends ExpressionContext {
		public ReadIntContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterReadInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitReadInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitReadInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(kebabParser.STRING, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitVar(this);
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
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterUna(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitUna(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitUna(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(kebabParser.STRING, 0); }
		public StringContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolContext extends ExpressionContext {
		public Token bool;
		public BoolContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharContext extends ExpressionContext {
		public TerminalNode CHAR() { return getToken(kebabParser.CHAR, 0); }
		public CharContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitChar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PairContext extends ExpressionContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public PairContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitPair(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MOD() { return getToken(kebabParser.MOD, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ModContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitMod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode DIV() { return getToken(kebabParser.DIV, 0); }
		public TerminalNode MUL() { return getToken(kebabParser.MUL, 0); }
		public MulContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitMul(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReadStringContext extends ExpressionContext {
		public ReadStringContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterReadString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitReadString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitReadString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CmpContext extends ExpressionContext {
		public Token op;
		public TerminalNode NEQ() { return getToken(kebabParser.NEQ, 0); }
		public TerminalNode LRT() { return getToken(kebabParser.LRT, 0); }
		public TerminalNode GR() { return getToken(kebabParser.GR, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQ() { return getToken(kebabParser.EQ, 0); }
		public TerminalNode GRT() { return getToken(kebabParser.GRT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode LR() { return getToken(kebabParser.LR, 0); }
		public CmpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterCmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitCmp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitCmp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetContainsContext extends ExpressionContext {
		public TerminalNode DOT() { return getToken(kebabParser.DOT, 0); }
		public TerminalNode CONTAINS() { return getToken(kebabParser.CONTAINS, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SetContainsContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterSetContains(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitSetContains(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitSetContains(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetSizeContext extends ExpressionContext {
		public TerminalNode DOT() { return getToken(kebabParser.DOT, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode SIZE() { return getToken(kebabParser.SIZE, 0); }
		public SetSizeContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterSetSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitSetSize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitSetSize(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleContext extends ExpressionContext {
		public TerminalNode DOUBLE() { return getToken(kebabParser.DOUBLE, 0); }
		public DoubleContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitDouble(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncCallContext extends ExpressionContext {
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public FuncCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntToFloatContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IntToFloatContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterIntToFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitIntToFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitIntToFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReadCharContext extends ExpressionContext {
		public ReadCharContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterReadChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitReadChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitReadChar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotContext extends ExpressionContext {
		public Token op;
		public TerminalNode NOT() { return getToken(kebabParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(kebabParser.AND, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public AndContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LongContext extends ExpressionContext {
		public TerminalNode LONG() { return getToken(kebabParser.LONG, 0); }
		public LongContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterLong(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitLong(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitLong(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpContext extends ExpressionContext {
		public Token op;
		public TerminalNode EXP() { return getToken(kebabParser.EXP, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof kebabListener ) ((kebabListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof kebabVisitor ) return ((kebabVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				_localctx = new UnaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(325);
				((UnaContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
					((UnaContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(326); expression(25);
				}
				break;
			case 2:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(327); ((NotContext)_localctx).op = match(NOT);
				setState(328); expression(21);
				}
				break;
			case 3:
				{
				_localctx = new ParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(329); match(PAREN_OPEN);
				setState(330); expression(0);
				setState(331); match(PAREN_CLOSE);
				}
				break;
			case 4:
				{
				_localctx = new PairContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(333); match(PAREN_OPEN);
				setState(334); expression(0);
				setState(335); match(T__5);
				setState(336); expression(0);
				setState(337); match(PAREN_CLOSE);
				}
				break;
			case 5:
				{
				_localctx = new FuncCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(339); func_call();
				}
				break;
			case 6:
				{
				_localctx = new FloatToIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(340); match(T__10);
				setState(341); match(PAREN_OPEN);
				setState(342); expression(0);
				setState(343); match(PAREN_CLOSE);
				}
				break;
			case 7:
				{
				_localctx = new IntToFloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(345); match(T__7);
				setState(346); match(PAREN_OPEN);
				setState(347); expression(0);
				setState(348); match(PAREN_CLOSE);
				}
				break;
			case 8:
				{
				_localctx = new ReadIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(350); match(T__0);
				setState(351); match(PAREN_OPEN);
				setState(352); match(PAREN_CLOSE);
				}
				break;
			case 9:
				{
				_localctx = new ReadCharContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(353); match(T__4);
				setState(354); match(PAREN_OPEN);
				setState(355); match(PAREN_CLOSE);
				}
				break;
			case 10:
				{
				_localctx = new ReadStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(356); match(T__9);
				setState(357); match(PAREN_OPEN);
				setState(358); match(PAREN_CLOSE);
				}
				break;
			case 11:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(359); match(STRING);
				setState(364);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(360); match(T__2);
					setState(361); expression(0);
					setState(362); match(T__1);
					}
					break;
				}
				}
				break;
			case 12:
				{
				_localctx = new BoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(366);
				((BoolContext)_localctx).bool = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
					((BoolContext)_localctx).bool = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case 13:
				{
				_localctx = new LongContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(367); match(LONG);
				}
				break;
			case 14:
				{
				_localctx = new DoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(368); match(DOUBLE);
				}
				break;
			case 15:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(369); match(STRING);
				}
				break;
			case 16:
				{
				_localctx = new CharContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(370); match(CHAR);
				}
				break;
			case 17:
				{
				_localctx = new SetContainsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(371); lvalue();
				setState(372); match(DOT);
				setState(373); match(CONTAINS);
				setState(374); match(PAREN_OPEN);
				setState(375); expression(0);
				setState(376); match(PAREN_CLOSE);
				}
				break;
			case 18:
				{
				_localctx = new SetSizeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(378); lvalue();
				setState(379); match(DOT);
				setState(380); match(SIZE);
				setState(381); match(PAREN_OPEN);
				setState(382); match(PAREN_CLOSE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(409);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(407);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(386);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(387); ((ExpContext)_localctx).op = match(EXP);
						setState(388); expression(25);
						}
						break;
					case 2:
						{
						_localctx = new MulContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(389);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(390);
						((MulContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((MulContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(391); expression(24);
						}
						break;
					case 3:
						{
						_localctx = new AddContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(392);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(393);
						((AddContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(394); expression(23);
						}
						break;
					case 4:
						{
						_localctx = new ModContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(395);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(396); ((ModContext)_localctx).op = match(MOD);
						setState(397); expression(21);
						}
						break;
					case 5:
						{
						_localctx = new AndContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(398);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(399); ((AndContext)_localctx).op = match(AND);
						setState(400); expression(20);
						}
						break;
					case 6:
						{
						_localctx = new OrContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(401);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(402); ((OrContext)_localctx).op = match(OR);
						setState(403); expression(19);
						}
						break;
					case 7:
						{
						_localctx = new CmpContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(404);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(405);
						((CmpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GR) | (1L << GRT) | (1L << LR) | (1L << LRT) | (1L << EQ) | (1L << NEQ))) != 0)) ) {
							((CmpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(406); expression(18);
						}
						break;
					}
					} 
				}
				setState(411);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		case 24: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 24);
		case 1: return precpred(_ctx, 23);
		case 2: return precpred(_ctx, 22);
		case 3: return precpred(_ctx, 20);
		case 4: return precpred(_ctx, 19);
		case 5: return precpred(_ctx, 18);
		case 6: return precpred(_ctx, 17);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3N\u019f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\6\3=\n\3\r\3\16\3>\3\3\7\3"+
		"B\n\3\f\3\16\3E\13\3\3\4\3\4\3\4\7\4J\n\4\f\4\16\4M\13\4\3\4\5\4P\n\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\7\ba\n\b"+
		"\f\b\16\bd\13\b\3\b\5\bg\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\5\30\u00ce\n\30\3\30\3\30\3\30\3\30\3\30\5\30\u00d5\n"+
		"\30\3\30\3\30\5\30\u00d9\n\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00ed\n\30\3\30"+
		"\3\30\3\30\3\30\3\30\7\30\u00f4\n\30\f\30\16\30\u00f7\13\30\3\30\3\30"+
		"\5\30\u00fb\n\30\3\30\3\30\3\30\3\30\3\30\3\30\6\30\u0103\n\30\r\30\16"+
		"\30\u0104\3\30\3\30\3\30\3\30\3\30\6\30\u010c\n\30\r\30\16\30\u010d\3"+
		"\30\6\30\u0111\n\30\r\30\16\30\u0112\3\30\3\30\3\30\3\30\6\30\u0119\n"+
		"\30\r\30\16\30\u011a\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\5\30\u0143\n\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\5\32\u016f\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0183\n\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u019a\n\32\f\32\16\32\u019d\13\32"+
		"\3\32\2\3\62\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\2\b\4\2\23\23AA\3\2,\63\3\2=>\3\2$%\3\2;<\3\2&+\u01c3\2\64\3\2\2\2\4"+
		":\3\2\2\2\6O\3\2\2\2\bQ\3\2\2\2\nS\3\2\2\2\fU\3\2\2\2\16f\3\2\2\2\20h"+
		"\3\2\2\2\22r\3\2\2\2\24z\3\2\2\2\26\u0080\3\2\2\2\30\u0083\3\2\2\2\32"+
		"\u0089\3\2\2\2\34\u008c\3\2\2\2\36\u0092\3\2\2\2 \u0099\3\2\2\2\"\u00a0"+
		"\3\2\2\2$\u00a9\3\2\2\2&\u00b0\3\2\2\2(\u00b7\3\2\2\2*\u00bb\3\2\2\2,"+
		"\u00c0\3\2\2\2.\u0142\3\2\2\2\60\u0144\3\2\2\2\62\u0182\3\2\2\2\64\65"+
		"\7\4\2\2\65\66\5\60\31\2\66\67\7C\2\2\678\5\4\3\289\7D\2\29\3\3\2\2\2"+
		":C\5.\30\2;=\t\2\2\2<;\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?@\3\2\2\2"+
		"@B\5.\30\2A<\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\5\3\2\2\2EC\3\2\2"+
		"\2FK\5\62\32\2GH\7\n\2\2HJ\5\62\32\2IG\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3"+
		"\2\2\2LP\3\2\2\2MK\3\2\2\2NP\3\2\2\2OF\3\2\2\2ON\3\2\2\2P\7\3\2\2\2QR"+
		"\t\3\2\2R\t\3\2\2\2ST\t\3\2\2T\13\3\2\2\2UV\5\60\31\2VW\7K\2\2WX\5\6\4"+
		"\2XY\7L\2\2Y\r\3\2\2\2Z[\5\n\6\2[b\5\60\31\2\\]\7\n\2\2]^\5\n\6\2^_\5"+
		"\60\31\2_a\3\2\2\2`\\\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2cg\3\2\2\2"+
		"db\3\2\2\2eg\3\2\2\2fZ\3\2\2\2fe\3\2\2\2g\17\3\2\2\2hi\t\3\2\2ij\7\36"+
		"\2\2jk\5\60\31\2kl\7K\2\2lm\5\16\b\2mn\7L\2\2no\7C\2\2op\5\4\3\2pq\7D"+
		"\2\2q\21\3\2\2\2rs\7\24\2\2st\7(\2\2tu\t\3\2\2uv\7\n\2\2vw\t\3\2\2wx\7"+
		"&\2\2xy\5\60\31\2y\23\3\2\2\2z{\7\33\2\2{|\7(\2\2|}\t\3\2\2}~\7&\2\2~"+
		"\177\5\60\31\2\177\25\3\2\2\2\u0080\u0081\7\65\2\2\u0081\u0082\5\60\31"+
		"\2\u0082\27\3\2\2\2\u0083\u0084\t\3\2\2\u0084\u0085\7\r\2\2\u0085\u0086"+
		"\5\62\32\2\u0086\u0087\7\16\2\2\u0087\u0088\5\60\31\2\u0088\31\3\2\2\2"+
		"\u0089\u008a\t\3\2\2\u008a\u008b\5\60\31\2\u008b\33\3\2\2\2\u008c\u008d"+
		"\5\60\31\2\u008d\u008e\7B\2\2\u008e\u008f\7\7\2\2\u008f\u0090\7M\2\2\u0090"+
		"\u0091\7\7\2\2\u0091\35\3\2\2\2\u0092\u0093\5\60\31\2\u0093\u0094\7\32"+
		"\2\2\u0094\u0095\7\31\2\2\u0095\u0096\7K\2\2\u0096\u0097\5\62\32\2\u0097"+
		"\u0098\7L\2\2\u0098\37\3\2\2\2\u0099\u009a\5\60\31\2\u009a\u009b\7\32"+
		"\2\2\u009b\u009c\7\34\2\2\u009c\u009d\7K\2\2\u009d\u009e\5\62\32\2\u009e"+
		"\u009f\7L\2\2\u009f!\3\2\2\2\u00a0\u00a1\5\60\31\2\u00a1\u00a2\7\32\2"+
		"\2\u00a2\u00a3\7\34\2\2\u00a3\u00a4\7K\2\2\u00a4\u00a5\5\62\32\2\u00a5"+
		"\u00a6\7\n\2\2\u00a6\u00a7\5\62\32\2\u00a7\u00a8\7L\2\2\u00a8#\3\2\2\2"+
		"\u00a9\u00aa\5\60\31\2\u00aa\u00ab\7\32\2\2\u00ab\u00ac\7\35\2\2\u00ac"+
		"\u00ad\7K\2\2\u00ad\u00ae\5\62\32\2\u00ae\u00af\7L\2\2\u00af%\3\2\2\2"+
		"\u00b0\u00b1\5\60\31\2\u00b1\u00b2\7\r\2\2\u00b2\u00b3\5\62\32\2\u00b3"+
		"\u00b4\7\16\2\2\u00b4\u00b5\7B\2\2\u00b5\u00b6\5\62\32\2\u00b6\'\3\2\2"+
		"\2\u00b7\u00b8\5\60\31\2\u00b8\u00b9\7B\2\2\u00b9\u00ba\5\62\32\2\u00ba"+
		")\3\2\2\2\u00bb\u00bc\t\3\2\2\u00bc\u00bd\5\60\31\2\u00bd\u00be\7B\2\2"+
		"\u00be\u00bf\5\62\32\2\u00bf+\3\2\2\2\u00c0\u00c1\7\65\2\2\u00c1\u00c2"+
		"\5\60\31\2\u00c2\u00c3\7B\2\2\u00c3\u00c4\7\7\2\2\u00c4\u00c5\7M\2\2\u00c5"+
		"\u00c6\7\7\2\2\u00c6-\3\2\2\2\u00c7\u0143\5\36\20\2\u00c8\u00ce\5$\23"+
		"\2\u00c9\u00ce\5 \21\2\u00ca\u00ce\5\34\17\2\u00cb\u00ce\5&\24\2\u00cc"+
		"\u00ce\5(\25\2\u00cd\u00c8\3\2\2\2\u00cd\u00c9\3\2\2\2\u00cd\u00ca\3\2"+
		"\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00cc\3\2\2\2\u00ce\u0143\3\2\2\2\u00cf"+
		"\u00d5\5\22\n\2\u00d0\u00d5\5\24\13\2\u00d1\u00d5\5\26\f\2\u00d2\u00d5"+
		"\5\30\r\2\u00d3\u00d5\5\32\16\2\u00d4\u00cf\3\2\2\2\u00d4\u00d0\3\2\2"+
		"\2\u00d4\u00d1\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\u0143"+
		"\3\2\2\2\u00d6\u00d9\5*\26\2\u00d7\u00d9\5,\27\2\u00d8\u00d6\3\2\2\2\u00d8"+
		"\u00d7\3\2\2\2\u00d9\u0143\3\2\2\2\u00da\u00db\7\t\2\2\u00db\u00dc\7K"+
		"\2\2\u00dc\u00dd\5\62\32\2\u00dd\u00de\7L\2\2\u00de\u0143\3\2\2\2\u00df"+
		"\u0143\5\62\32\2\u00e0\u00e1\7C\2\2\u00e1\u00e2\5\4\3\2\u00e2\u00e3\7"+
		"D\2\2\u00e3\u0143\3\2\2\2\u00e4\u00e5\7E\2\2\u00e5\u00e6\7K\2\2\u00e6"+
		"\u00e7\5\62\32\2\u00e7\u00e8\7L\2\2\u00e8\u00f5\5.\30\2\u00e9\u00ea\7"+
		"F\2\2\u00ea\u00ed\7E\2\2\u00eb\u00ed\7\22\2\2\u00ec\u00e9\3\2\2\2\u00ec"+
		"\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\7K\2\2\u00ef\u00f0\5\62"+
		"\32\2\u00f0\u00f1\7L\2\2\u00f1\u00f2\5.\30\2\u00f2\u00f4\3\2\2\2\u00f3"+
		"\u00ec\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2"+
		"\2\2\u00f6\u00fa\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00f9\7F\2\2\u00f9"+
		"\u00fb\5.\30\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u0143\3\2"+
		"\2\2\u00fc\u00fd\7 \2\2\u00fd\u00fe\7K\2\2\u00fe\u00ff\5\62\32\2\u00ff"+
		"\u0100\7L\2\2\u0100\u010b\7C\2\2\u0101\u0103\7A\2\2\u0102\u0101\3\2\2"+
		"\2\u0103\u0104\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106"+
		"\3\2\2\2\u0106\u0107\7!\2\2\u0107\u0108\5\62\32\2\u0108\u0109\7\f\2\2"+
		"\u0109\u010a\5.\30\2\u010a\u010c\3\2\2\2\u010b\u0102\3\2\2\2\u010c\u010d"+
		"\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0110\3\2\2\2\u010f"+
		"\u0111\7A\2\2\u0110\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0110\3\2"+
		"\2\2\u0112\u0113\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\7\"\2\2\u0115"+
		"\u0116\7\f\2\2\u0116\u0118\5.\30\2\u0117\u0119\7A\2\2\u0118\u0117\3\2"+
		"\2\2\u0119\u011a\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b"+
		"\u011c\3\2\2\2\u011c\u011d\7D\2\2\u011d\u0143\3\2\2\2\u011e\u011f\7G\2"+
		"\2\u011f\u0120\7K\2\2\u0120\u0121\5\62\32\2\u0121\u0122\7L\2\2\u0122\u0123"+
		"\7\37\2\2\u0123\u0124\5.\30\2\u0124\u0143\3\2\2\2\u0125\u0126\7\37\2\2"+
		"\u0126\u0127\5.\30\2\u0127\u0128\7G\2\2\u0128\u0129\7K\2\2\u0129\u012a"+
		"\5\62\32\2\u012a\u012b\7L\2\2\u012b\u0143\3\2\2\2\u012c\u012d\7#\2\2\u012d"+
		"\u012e\7K\2\2\u012e\u012f\5(\25\2\u012f\u0130\7\23\2\2\u0130\u0131\5\62"+
		"\32\2\u0131\u0132\7\23\2\2\u0132\u0133\5(\25\2\u0133\u0134\7L\2\2\u0134"+
		"\u0135\5.\30\2\u0135\u0143\3\2\2\2\u0136\u0137\7\27\2\2\u0137\u0138\7"+
		"K\2\2\u0138\u0139\5\60\31\2\u0139\u013a\7\30\2\2\u013a\u013b\5\60\31\2"+
		"\u013b\u013c\7L\2\2\u013c\u013d\5.\30\2\u013d\u0143\3\2\2\2\u013e\u0143"+
		"\5\20\t\2\u013f\u0140\7\3\2\2\u0140\u0143\5\62\32\2\u0141\u0143\3\2\2"+
		"\2\u0142\u00c7\3\2\2\2\u0142\u00cd\3\2\2\2\u0142\u00d4\3\2\2\2\u0142\u00d8"+
		"\3\2\2\2\u0142\u00da\3\2\2\2\u0142\u00df\3\2\2\2\u0142\u00e0\3\2\2\2\u0142"+
		"\u00e4\3\2\2\2\u0142\u00fc\3\2\2\2\u0142\u011e\3\2\2\2\u0142\u0125\3\2"+
		"\2\2\u0142\u012c\3\2\2\2\u0142\u0136\3\2\2\2\u0142\u013e\3\2\2\2\u0142"+
		"\u013f\3\2\2\2\u0142\u0141\3\2\2\2\u0143/\3\2\2\2\u0144\u0145\7M\2\2\u0145"+
		"\61\3\2\2\2\u0146\u0147\b\32\1\2\u0147\u0148\t\4\2\2\u0148\u0183\5\62"+
		"\32\33\u0149\u014a\7J\2\2\u014a\u0183\5\62\32\27\u014b\u014c\7K\2\2\u014c"+
		"\u014d\5\62\32\2\u014d\u014e\7L\2\2\u014e\u0183\3\2\2\2\u014f\u0150\7"+
		"K\2\2\u0150\u0151\5\62\32\2\u0151\u0152\7\n\2\2\u0152\u0153\5\62\32\2"+
		"\u0153\u0154\7L\2\2\u0154\u0183\3\2\2\2\u0155\u0183\5\f\7\2\u0156\u0157"+
		"\7\5\2\2\u0157\u0158\7K\2\2\u0158\u0159\5\62\32\2\u0159\u015a\7L\2\2\u015a"+
		"\u0183\3\2\2\2\u015b\u015c\7\b\2\2\u015c\u015d\7K\2\2\u015d\u015e\5\62"+
		"\32\2\u015e\u015f\7L\2\2\u015f\u0183\3\2\2\2\u0160\u0161\7\17\2\2\u0161"+
		"\u0162\7K\2\2\u0162\u0183\7L\2\2\u0163\u0164\7\13\2\2\u0164\u0165\7K\2"+
		"\2\u0165\u0183\7L\2\2\u0166\u0167\7\6\2\2\u0167\u0168\7K\2\2\u0168\u0183"+
		"\7L\2\2\u0169\u016e\7M\2\2\u016a\u016b\7\r\2\2\u016b\u016c\5\62\32\2\u016c"+
		"\u016d\7\16\2\2\u016d\u016f\3\2\2\2\u016e\u016a\3\2\2\2\u016e\u016f\3"+
		"\2\2\2\u016f\u0183\3\2\2\2\u0170\u0183\t\5\2\2\u0171\u0183\78\2\2\u0172"+
		"\u0183\79\2\2\u0173\u0183\7M\2\2\u0174\u0183\7N\2\2\u0175\u0176\5\60\31"+
		"\2\u0176\u0177\7\32\2\2\u0177\u0178\7\26\2\2\u0178\u0179\7K\2\2\u0179"+
		"\u017a\5\62\32\2\u017a\u017b\7L\2\2\u017b\u0183\3\2\2\2\u017c\u017d\5"+
		"\60\31\2\u017d\u017e\7\32\2\2\u017e\u017f\7\25\2\2\u017f\u0180\7K\2\2"+
		"\u0180\u0181\7L\2\2\u0181\u0183\3\2\2\2\u0182\u0146\3\2\2\2\u0182\u0149"+
		"\3\2\2\2\u0182\u014b\3\2\2\2\u0182\u014f\3\2\2\2\u0182\u0155\3\2\2\2\u0182"+
		"\u0156\3\2\2\2\u0182\u015b\3\2\2\2\u0182\u0160\3\2\2\2\u0182\u0163\3\2"+
		"\2\2\u0182\u0166\3\2\2\2\u0182\u0169\3\2\2\2\u0182\u0170\3\2\2\2\u0182"+
		"\u0171\3\2\2\2\u0182\u0172\3\2\2\2\u0182\u0173\3\2\2\2\u0182\u0174\3\2"+
		"\2\2\u0182\u0175\3\2\2\2\u0182\u017c\3\2\2\2\u0183\u019b\3\2\2\2\u0184"+
		"\u0185\f\32\2\2\u0185\u0186\7?\2\2\u0186\u019a\5\62\32\33\u0187\u0188"+
		"\f\31\2\2\u0188\u0189\t\6\2\2\u0189\u019a\5\62\32\32\u018a\u018b\f\30"+
		"\2\2\u018b\u018c\t\4\2\2\u018c\u019a\5\62\32\31\u018d\u018e\f\26\2\2\u018e"+
		"\u018f\7:\2\2\u018f\u019a\5\62\32\27\u0190\u0191\f\25\2\2\u0191\u0192"+
		"\7H\2\2\u0192\u019a\5\62\32\26\u0193\u0194\f\24\2\2\u0194\u0195\7I\2\2"+
		"\u0195\u019a\5\62\32\25\u0196\u0197\f\23\2\2\u0197\u0198\t\7\2\2\u0198"+
		"\u019a\5\62\32\24\u0199\u0184\3\2\2\2\u0199\u0187\3\2\2\2\u0199\u018a"+
		"\3\2\2\2\u0199\u018d\3\2\2\2\u0199\u0190\3\2\2\2\u0199\u0193\3\2\2\2\u0199"+
		"\u0196\3\2\2\2\u019a\u019d\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2"+
		"\2\2\u019c\63\3\2\2\2\u019d\u019b\3\2\2\2\27>CKObf\u00cd\u00d4\u00d8\u00ec"+
		"\u00f5\u00fa\u0104\u010d\u0112\u011a\u0142\u016e\u0182\u0199\u019b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from ./Arrows.g4 by ANTLR 4.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ArrowsLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'def'", "'{'", "'}'", "':'", "';'", "'>>'", "'<<'", "'+>'", "'->'", "'/>'", 
		"'*>'", "'&>'", "'<+'", "'<-'", "'</'", "'<*'", "'<&'", "'<->'", "'@>'", 
		"'$>'", "'<@'", "'<!'", "'<$'", "'ret'", "INT", "'*'", "'/'", "'+'", "'-'", 
		"'['", "']'", "'..'", "WHITESPACE", "'='", "'!='", "'>='", "'<='", "'>'", 
		"'<'", "'if'", "'else'", "'while'", "'for'", "'pass'", "'&'", "'|'", "'!'", 
		"'('", "')'", "','", "'\"'", "'?'", "STRING", "'\n'", "ANYSTRING", "COMMENT", 
		"SPACES"
	};
	public static final String[] ruleNames = {
		"DEF", "INDENT", "DEDENT", "COLON", "SEMICOLON", "LA", "RA", "LPA", "LSA", 
		"LDA", "LMA", "LRA", "RPA", "RSA", "RDA", "RMA", "RRA", "SWAP", "IS", 
		"ISL", "OS", "OL", "OSL", "RET", "INT", "MUL", "DIV", "ADD", "SUB", "LR", 
		"RR", "DOTS", "WHITESPACE", "EQ", "NEQ", "GEQ", "SEQ", "GT", "ST", "IF", 
		"ELSE", "WHILE", "FOR", "PASS", "AND", "OR", "NOT", "PAREN_OPEN", "PAREN_CLOSE", 
		"COMMA", "QUOT", "QO", "STRING", "NEWLINE", "ANYSTRING", "COMMENT", "SPACES", 
		"DIGIT"
	};


	public ArrowsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Arrows.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 32: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;

		case 55: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 56: SPACES_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WHITESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}
	private void SPACES_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2;\u012b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\6\32\u00c0\n\32\r\32\16\32\u00c1"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3\""+
		"\3\"\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\3"+
		"*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3/\3"+
		"/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66"+
		"\7\66\u010f\n\66\f\66\16\66\u0112\13\66\3\67\3\67\38\68\u0117\n8\r8\16"+
		"8\u0118\39\39\69\u011d\n9\r9\169\u011e\39\39\3:\6:\u0124\n:\r:\16:\u0125"+
		"\3:\3:\3;\3;\4\u0118\u011e<\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t"+
		"\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1"+
		"#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67"+
		"\35\19\36\1;\37\1= \1?!\1A\"\1C#\2E$\1G%\1I&\1K\'\1M(\1O)\1Q*\1S+\1U,"+
		"\1W-\1Y.\1[/\1]\60\1_\61\1a\62\1c\63\1e\64\1g\65\1i\66\1k\67\1m8\1o9\1"+
		"q:\3s;\4u\2\1\3\2\b\4\2\13\13\"\"\4\2C\\c|\5\2\62;C\\c|\5\2\f\f\17\17"+
		"$$\4\2\f\f\17\17\3\2\62;\u012e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3"+
		"\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2"+
		"\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2"+
		"i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\3w\3"+
		"\2\2\2\5{\3\2\2\2\7}\3\2\2\2\t\177\3\2\2\2\13\u0081\3\2\2\2\r\u0083\3"+
		"\2\2\2\17\u0086\3\2\2\2\21\u0089\3\2\2\2\23\u008c\3\2\2\2\25\u008f\3\2"+
		"\2\2\27\u0092\3\2\2\2\31\u0095\3\2\2\2\33\u0098\3\2\2\2\35\u009b\3\2\2"+
		"\2\37\u009e\3\2\2\2!\u00a1\3\2\2\2#\u00a4\3\2\2\2%\u00a7\3\2\2\2\'\u00ab"+
		"\3\2\2\2)\u00ae\3\2\2\2+\u00b1\3\2\2\2-\u00b4\3\2\2\2/\u00b7\3\2\2\2\61"+
		"\u00ba\3\2\2\2\63\u00bf\3\2\2\2\65\u00c3\3\2\2\2\67\u00c5\3\2\2\29\u00c7"+
		"\3\2\2\2;\u00c9\3\2\2\2=\u00cb\3\2\2\2?\u00cd\3\2\2\2A\u00cf\3\2\2\2C"+
		"\u00d2\3\2\2\2E\u00d6\3\2\2\2G\u00d8\3\2\2\2I\u00db\3\2\2\2K\u00de\3\2"+
		"\2\2M\u00e1\3\2\2\2O\u00e3\3\2\2\2Q\u00e5\3\2\2\2S\u00e8\3\2\2\2U\u00ed"+
		"\3\2\2\2W\u00f3\3\2\2\2Y\u00f7\3\2\2\2[\u00fc\3\2\2\2]\u00fe\3\2\2\2_"+
		"\u0100\3\2\2\2a\u0102\3\2\2\2c\u0104\3\2\2\2e\u0106\3\2\2\2g\u0108\3\2"+
		"\2\2i\u010a\3\2\2\2k\u010c\3\2\2\2m\u0113\3\2\2\2o\u0116\3\2\2\2q\u011a"+
		"\3\2\2\2s\u0123\3\2\2\2u\u0129\3\2\2\2wx\7f\2\2xy\7g\2\2yz\7h\2\2z\4\3"+
		"\2\2\2{|\7}\2\2|\6\3\2\2\2}~\7\177\2\2~\b\3\2\2\2\177\u0080\7<\2\2\u0080"+
		"\n\3\2\2\2\u0081\u0082\7=\2\2\u0082\f\3\2\2\2\u0083\u0084\7@\2\2\u0084"+
		"\u0085\7@\2\2\u0085\16\3\2\2\2\u0086\u0087\7>\2\2\u0087\u0088\7>\2\2\u0088"+
		"\20\3\2\2\2\u0089\u008a\7-\2\2\u008a\u008b\7@\2\2\u008b\22\3\2\2\2\u008c"+
		"\u008d\7/\2\2\u008d\u008e\7@\2\2\u008e\24\3\2\2\2\u008f\u0090\7\61\2\2"+
		"\u0090\u0091\7@\2\2\u0091\26\3\2\2\2\u0092\u0093\7,\2\2\u0093\u0094\7"+
		"@\2\2\u0094\30\3\2\2\2\u0095\u0096\7(\2\2\u0096\u0097\7@\2\2\u0097\32"+
		"\3\2\2\2\u0098\u0099\7>\2\2\u0099\u009a\7-\2\2\u009a\34\3\2\2\2\u009b"+
		"\u009c\7>\2\2\u009c\u009d\7/\2\2\u009d\36\3\2\2\2\u009e\u009f\7>\2\2\u009f"+
		"\u00a0\7\61\2\2\u00a0 \3\2\2\2\u00a1\u00a2\7>\2\2\u00a2\u00a3\7,\2\2\u00a3"+
		"\"\3\2\2\2\u00a4\u00a5\7>\2\2\u00a5\u00a6\7(\2\2\u00a6$\3\2\2\2\u00a7"+
		"\u00a8\7>\2\2\u00a8\u00a9\7/\2\2\u00a9\u00aa\7@\2\2\u00aa&\3\2\2\2\u00ab"+
		"\u00ac\7B\2\2\u00ac\u00ad\7@\2\2\u00ad(\3\2\2\2\u00ae\u00af\7&\2\2\u00af"+
		"\u00b0\7@\2\2\u00b0*\3\2\2\2\u00b1\u00b2\7>\2\2\u00b2\u00b3\7B\2\2\u00b3"+
		",\3\2\2\2\u00b4\u00b5\7>\2\2\u00b5\u00b6\7#\2\2\u00b6.\3\2\2\2\u00b7\u00b8"+
		"\7>\2\2\u00b8\u00b9\7&\2\2\u00b9\60\3\2\2\2\u00ba\u00bb\7t\2\2\u00bb\u00bc"+
		"\7g\2\2\u00bc\u00bd\7v\2\2\u00bd\62\3\2\2\2\u00be\u00c0\5u;\2\u00bf\u00be"+
		"\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\64\3\2\2\2\u00c3\u00c4\7,\2\2\u00c4\66\3\2\2\2\u00c5\u00c6\7\61\2\2\u00c6"+
		"8\3\2\2\2\u00c7\u00c8\7-\2\2\u00c8:\3\2\2\2\u00c9\u00ca\7/\2\2\u00ca<"+
		"\3\2\2\2\u00cb\u00cc\7]\2\2\u00cc>\3\2\2\2\u00cd\u00ce\7_\2\2\u00ce@\3"+
		"\2\2\2\u00cf\u00d0\7\60\2\2\u00d0\u00d1\7\60\2\2\u00d1B\3\2\2\2\u00d2"+
		"\u00d3\t\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\b\"\2\2\u00d5D\3\2\2\2"+
		"\u00d6\u00d7\7?\2\2\u00d7F\3\2\2\2\u00d8\u00d9\7#\2\2\u00d9\u00da\7?\2"+
		"\2\u00daH\3\2\2\2\u00db\u00dc\7@\2\2\u00dc\u00dd\7?\2\2\u00ddJ\3\2\2\2"+
		"\u00de\u00df\7>\2\2\u00df\u00e0\7?\2\2\u00e0L\3\2\2\2\u00e1\u00e2\7@\2"+
		"\2\u00e2N\3\2\2\2\u00e3\u00e4\7>\2\2\u00e4P\3\2\2\2\u00e5\u00e6\7k\2\2"+
		"\u00e6\u00e7\7h\2\2\u00e7R\3\2\2\2\u00e8\u00e9\7g\2\2\u00e9\u00ea\7n\2"+
		"\2\u00ea\u00eb\7u\2\2\u00eb\u00ec\7g\2\2\u00ecT\3\2\2\2\u00ed\u00ee\7"+
		"y\2\2\u00ee\u00ef\7j\2\2\u00ef\u00f0\7k\2\2\u00f0\u00f1\7n\2\2\u00f1\u00f2"+
		"\7g\2\2\u00f2V\3\2\2\2\u00f3\u00f4\7h\2\2\u00f4\u00f5\7q\2\2\u00f5\u00f6"+
		"\7t\2\2\u00f6X\3\2\2\2\u00f7\u00f8\7r\2\2\u00f8\u00f9\7c\2\2\u00f9\u00fa"+
		"\7u\2\2\u00fa\u00fb\7u\2\2\u00fbZ\3\2\2\2\u00fc\u00fd\7(\2\2\u00fd\\\3"+
		"\2\2\2\u00fe\u00ff\7~\2\2\u00ff^\3\2\2\2\u0100\u0101\7#\2\2\u0101`\3\2"+
		"\2\2\u0102\u0103\7*\2\2\u0103b\3\2\2\2\u0104\u0105\7+\2\2\u0105d\3\2\2"+
		"\2\u0106\u0107\7.\2\2\u0107f\3\2\2\2\u0108\u0109\7$\2\2\u0109h\3\2\2\2"+
		"\u010a\u010b\7A\2\2\u010bj\3\2\2\2\u010c\u0110\t\3\2\2\u010d\u010f\t\4"+
		"\2\2\u010e\u010d\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110"+
		"\u0111\3\2\2\2\u0111l\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0114\7\f\2\2"+
		"\u0114n\3\2\2\2\u0115\u0117\n\5\2\2\u0116\u0115\3\2\2\2\u0117\u0118\3"+
		"\2\2\2\u0118\u0119\3\2\2\2\u0118\u0116\3\2\2\2\u0119p\3\2\2\2\u011a\u011c"+
		"\7%\2\2\u011b\u011d\n\6\2\2\u011c\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0121\b9"+
		"\3\2\u0121r\3\2\2\2\u0122\u0124\t\2\2\2\u0123\u0122\3\2\2\2\u0124\u0125"+
		"\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127\3\2\2\2\u0127"+
		"\u0128\b:\4\2\u0128t\3\2\2\2\u0129\u012a\t\7\2\2\u012av\3\2\2\2\b\2\u00c1"+
		"\u0110\u0118\u011e\u0125";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
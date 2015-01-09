// Generated from anakonda.g4 by ANTLR 4.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class anakondaLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'def'", "'bool'", "','", "'string'", "':'", "'='", "'~'", "'char'", "'print'", 
		"'read'", "'{'", "'}'", "'('", "')'", "'['", "']'", "';'", "'break'", 
		"'continue'", "'return'", "'void'", "BOOL", "'++'", "'--'", "'+'", "'-'", 
		"'*'", "'/'", "'%'", "'+='", "'-='", "'*='", "'/='", "'%='", "'>'", "'<'", 
		"'<='", "'>='", "'=='", "'!='", "'for'", "'while'", "'if'", "'elif'", 
		"'else'", "AND", "OR", "NOT", "'int'", "'in'", "CISLO", "VARNAME", "CHAR", 
		"STRING", "COMMENT", "WHITESPACE", "'\n'"
	};
	public static final String[] ruleNames = {
		"T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "PRINT", 
		"READ", "LCURLY", "RCURLY", "LROUND", "RROUND", "LSQUARE", "RSQUARE", 
		"SEMICOLON", "BREAK", "CONTINUE", "RET", "VOID", "BOOL", "INCREASE", "DECREASE", 
		"ADD", "SUBTRACT", "MULTIPLY", "DIVIDE", "MODULO", "ADDASS", "SUBASS", 
		"MULASS", "DIVASS", "MODASS", "GREATERTHAN", "LESSTHAN", "LESSEQUAL", 
		"GREATEREQUAL", "EQUAL", "NOTEEQUAL", "FOR", "WHILE", "IF", "ELIF", "ELSE", 
		"AND", "OR", "NOT", "INT", "IN", "CISLO", "VARNAME", "CHAR", "STRING", 
		"COMMENT", "WHITESPACE", "NEWLINE", "NUMBER"
	};


	public anakondaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "anakonda.g4"; }

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
		case 54: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 55: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;

		case 56: NEWLINE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WHITESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}
	private void NEWLINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: skip();  break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2;\u016e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00d2\n\27\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36"+
		"\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3%\3"+
		"%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3+\3"+
		"+\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\5/\u011f\n/\3"+
		"\60\3\60\3\60\3\60\5\60\u0125\n\60\3\61\3\61\3\61\3\61\5\61\u012b\n\61"+
		"\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\6\64\u0137\n\64\r\64"+
		"\16\64\u0138\5\64\u013b\n\64\3\65\3\65\7\65\u013f\n\65\f\65\16\65\u0142"+
		"\13\65\3\66\3\66\3\66\3\66\3\67\3\67\7\67\u014a\n\67\f\67\16\67\u014d"+
		"\13\67\3\67\3\67\38\38\38\38\78\u0155\n8\f8\168\u0158\138\38\38\38\38"+
		"\39\39\39\39\3:\3:\3:\3:\3;\3;\3;\6;\u0169\n;\r;\16;\u016a\5;\u016d\n"+
		";\4\u014b\u0156<\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23"+
		"\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1"+
		"\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34\1\67\35\19\36\1"+
		";\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\1K\'\1M(\1O)\1Q*\1S+\1U,\1W-\1Y.\1["+
		"/\1]\60\1_\61\1a\62\1c\63\1e\64\1g\65\1i\66\1k\67\1m8\1o9\2q:\3s;\4u\2"+
		"\1\3\2\5\4\2C\\c|\5\2\62;C\\c|\4\2\13\13\"\"\u0177\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2"+
		"\2\2s\3\2\2\2\3w\3\2\2\2\5{\3\2\2\2\7\u0080\3\2\2\2\t\u0082\3\2\2\2\13"+
		"\u0089\3\2\2\2\r\u008b\3\2\2\2\17\u008d\3\2\2\2\21\u008f\3\2\2\2\23\u0094"+
		"\3\2\2\2\25\u009a\3\2\2\2\27\u009f\3\2\2\2\31\u00a1\3\2\2\2\33\u00a3\3"+
		"\2\2\2\35\u00a5\3\2\2\2\37\u00a7\3\2\2\2!\u00a9\3\2\2\2#\u00ab\3\2\2\2"+
		"%\u00ad\3\2\2\2\'\u00b3\3\2\2\2)\u00bc\3\2\2\2+\u00c3\3\2\2\2-\u00d1\3"+
		"\2\2\2/\u00d3\3\2\2\2\61\u00d6\3\2\2\2\63\u00d9\3\2\2\2\65\u00db\3\2\2"+
		"\2\67\u00dd\3\2\2\29\u00df\3\2\2\2;\u00e1\3\2\2\2=\u00e3\3\2\2\2?\u00e6"+
		"\3\2\2\2A\u00e9\3\2\2\2C\u00ec\3\2\2\2E\u00ef\3\2\2\2G\u00f2\3\2\2\2I"+
		"\u00f4\3\2\2\2K\u00f6\3\2\2\2M\u00f9\3\2\2\2O\u00fc\3\2\2\2Q\u00ff\3\2"+
		"\2\2S\u0102\3\2\2\2U\u0106\3\2\2\2W\u010c\3\2\2\2Y\u010f\3\2\2\2[\u0114"+
		"\3\2\2\2]\u011e\3\2\2\2_\u0124\3\2\2\2a\u012a\3\2\2\2c\u012c\3\2\2\2e"+
		"\u0130\3\2\2\2g\u013a\3\2\2\2i\u013c\3\2\2\2k\u0143\3\2\2\2m\u0147\3\2"+
		"\2\2o\u0150\3\2\2\2q\u015d\3\2\2\2s\u0161\3\2\2\2u\u016c\3\2\2\2wx\7f"+
		"\2\2xy\7g\2\2yz\7h\2\2z\4\3\2\2\2{|\7d\2\2|}\7q\2\2}~\7q\2\2~\177\7n\2"+
		"\2\177\6\3\2\2\2\u0080\u0081\7.\2\2\u0081\b\3\2\2\2\u0082\u0083\7u\2\2"+
		"\u0083\u0084\7v\2\2\u0084\u0085\7t\2\2\u0085\u0086\7k\2\2\u0086\u0087"+
		"\7p\2\2\u0087\u0088\7i\2\2\u0088\n\3\2\2\2\u0089\u008a\7<\2\2\u008a\f"+
		"\3\2\2\2\u008b\u008c\7?\2\2\u008c\16\3\2\2\2\u008d\u008e\7\u0080\2\2\u008e"+
		"\20\3\2\2\2\u008f\u0090\7e\2\2\u0090\u0091\7j\2\2\u0091\u0092\7c\2\2\u0092"+
		"\u0093\7t\2\2\u0093\22\3\2\2\2\u0094\u0095\7r\2\2\u0095\u0096\7t\2\2\u0096"+
		"\u0097\7k\2\2\u0097\u0098\7p\2\2\u0098\u0099\7v\2\2\u0099\24\3\2\2\2\u009a"+
		"\u009b\7t\2\2\u009b\u009c\7g\2\2\u009c\u009d\7c\2\2\u009d\u009e\7f\2\2"+
		"\u009e\26\3\2\2\2\u009f\u00a0\7}\2\2\u00a0\30\3\2\2\2\u00a1\u00a2\7\177"+
		"\2\2\u00a2\32\3\2\2\2\u00a3\u00a4\7*\2\2\u00a4\34\3\2\2\2\u00a5\u00a6"+
		"\7+\2\2\u00a6\36\3\2\2\2\u00a7\u00a8\7]\2\2\u00a8 \3\2\2\2\u00a9\u00aa"+
		"\7_\2\2\u00aa\"\3\2\2\2\u00ab\u00ac\7=\2\2\u00ac$\3\2\2\2\u00ad\u00ae"+
		"\7d\2\2\u00ae\u00af\7t\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7c\2\2\u00b1"+
		"\u00b2\7m\2\2\u00b2&\3\2\2\2\u00b3\u00b4\7e\2\2\u00b4\u00b5\7q\2\2\u00b5"+
		"\u00b6\7p\2\2\u00b6\u00b7\7v\2\2\u00b7\u00b8\7k\2\2\u00b8\u00b9\7p\2\2"+
		"\u00b9\u00ba\7w\2\2\u00ba\u00bb\7g\2\2\u00bb(\3\2\2\2\u00bc\u00bd\7t\2"+
		"\2\u00bd\u00be\7g\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7w\2\2\u00c0\u00c1"+
		"\7t\2\2\u00c1\u00c2\7p\2\2\u00c2*\3\2\2\2\u00c3\u00c4\7x\2\2\u00c4\u00c5"+
		"\7q\2\2\u00c5\u00c6\7k\2\2\u00c6\u00c7\7f\2\2\u00c7,\3\2\2\2\u00c8\u00c9"+
		"\7h\2\2\u00c9\u00ca\7c\2\2\u00ca\u00cb\7n\2\2\u00cb\u00cc\7u\2\2\u00cc"+
		"\u00d2\7g\2\2\u00cd\u00ce\7v\2\2\u00ce\u00cf\7t\2\2\u00cf\u00d0\7w\2\2"+
		"\u00d0\u00d2\7g\2\2\u00d1\u00c8\3\2\2\2\u00d1\u00cd\3\2\2\2\u00d2.\3\2"+
		"\2\2\u00d3\u00d4\7-\2\2\u00d4\u00d5\7-\2\2\u00d5\60\3\2\2\2\u00d6\u00d7"+
		"\7/\2\2\u00d7\u00d8\7/\2\2\u00d8\62\3\2\2\2\u00d9\u00da\7-\2\2\u00da\64"+
		"\3\2\2\2\u00db\u00dc\7/\2\2\u00dc\66\3\2\2\2\u00dd\u00de\7,\2\2\u00de"+
		"8\3\2\2\2\u00df\u00e0\7\61\2\2\u00e0:\3\2\2\2\u00e1\u00e2\7\'\2\2\u00e2"+
		"<\3\2\2\2\u00e3\u00e4\7-\2\2\u00e4\u00e5\7?\2\2\u00e5>\3\2\2\2\u00e6\u00e7"+
		"\7/\2\2\u00e7\u00e8\7?\2\2\u00e8@\3\2\2\2\u00e9\u00ea\7,\2\2\u00ea\u00eb"+
		"\7?\2\2\u00ebB\3\2\2\2\u00ec\u00ed\7\61\2\2\u00ed\u00ee\7?\2\2\u00eeD"+
		"\3\2\2\2\u00ef\u00f0\7\'\2\2\u00f0\u00f1\7?\2\2\u00f1F\3\2\2\2\u00f2\u00f3"+
		"\7@\2\2\u00f3H\3\2\2\2\u00f4\u00f5\7>\2\2\u00f5J\3\2\2\2\u00f6\u00f7\7"+
		">\2\2\u00f7\u00f8\7?\2\2\u00f8L\3\2\2\2\u00f9\u00fa\7@\2\2\u00fa\u00fb"+
		"\7?\2\2\u00fbN\3\2\2\2\u00fc\u00fd\7?\2\2\u00fd\u00fe\7?\2\2\u00feP\3"+
		"\2\2\2\u00ff\u0100\7#\2\2\u0100\u0101\7?\2\2\u0101R\3\2\2\2\u0102\u0103"+
		"\7h\2\2\u0103\u0104\7q\2\2\u0104\u0105\7t\2\2\u0105T\3\2\2\2\u0106\u0107"+
		"\7y\2\2\u0107\u0108\7j\2\2\u0108\u0109\7k\2\2\u0109\u010a\7n\2\2\u010a"+
		"\u010b\7g\2\2\u010bV\3\2\2\2\u010c\u010d\7k\2\2\u010d\u010e\7h\2\2\u010e"+
		"X\3\2\2\2\u010f\u0110\7g\2\2\u0110\u0111\7n\2\2\u0111\u0112\7k\2\2\u0112"+
		"\u0113\7h\2\2\u0113Z\3\2\2\2\u0114\u0115\7g\2\2\u0115\u0116\7n\2\2\u0116"+
		"\u0117\7u\2\2\u0117\u0118\7g\2\2\u0118\\\3\2\2\2\u0119\u011a\7c\2\2\u011a"+
		"\u011b\7p\2\2\u011b\u011f\7f\2\2\u011c\u011d\7(\2\2\u011d\u011f\7(\2\2"+
		"\u011e\u0119\3\2\2\2\u011e\u011c\3\2\2\2\u011f^\3\2\2\2\u0120\u0121\7"+
		"q\2\2\u0121\u0125\7t\2\2\u0122\u0123\7~\2\2\u0123\u0125\7~\2\2\u0124\u0120"+
		"\3\2\2\2\u0124\u0122\3\2\2\2\u0125`\3\2\2\2\u0126\u0127\7p\2\2\u0127\u0128"+
		"\7q\2\2\u0128\u012b\7v\2\2\u0129\u012b\7#\2\2\u012a\u0126\3\2\2\2\u012a"+
		"\u0129\3\2\2\2\u012bb\3\2\2\2\u012c\u012d\7k\2\2\u012d\u012e\7p\2\2\u012e"+
		"\u012f\7v\2\2\u012fd\3\2\2\2\u0130\u0131\7k\2\2\u0131\u0132\7p\2\2\u0132"+
		"f\3\2\2\2\u0133\u013b\4\62;\2\u0134\u0136\4\63;\2\u0135\u0137\4\62;\2"+
		"\u0136\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139"+
		"\3\2\2\2\u0139\u013b\3\2\2\2\u013a\u0133\3\2\2\2\u013a\u0134\3\2\2\2\u013b"+
		"h\3\2\2\2\u013c\u0140\t\2\2\2\u013d\u013f\t\3\2\2\u013e\u013d\3\2\2\2"+
		"\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141j\3"+
		"\2\2\2\u0142\u0140\3\2\2\2\u0143\u0144\7)\2\2\u0144\u0145\13\2\2\2\u0145"+
		"\u0146\7)\2\2\u0146l\3\2\2\2\u0147\u014b\7$\2\2\u0148\u014a\13\2\2\2\u0149"+
		"\u0148\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u014c\3\2\2\2\u014b\u0149\3\2"+
		"\2\2\u014c\u014e\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u014f\7$\2\2\u014f"+
		"n\3\2\2\2\u0150\u0151\7\61\2\2\u0151\u0152\7\61\2\2\u0152\u0156\3\2\2"+
		"\2\u0153\u0155\13\2\2\2\u0154\u0153\3\2\2\2\u0155\u0158\3\2\2\2\u0156"+
		"\u0157\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u0159\3\2\2\2\u0158\u0156\3\2"+
		"\2\2\u0159\u015a\7\f\2\2\u015a\u015b\3\2\2\2\u015b\u015c\b8\2\2\u015c"+
		"p\3\2\2\2\u015d\u015e\t\4\2\2\u015e\u015f\3\2\2\2\u015f\u0160\b9\3\2\u0160"+
		"r\3\2\2\2\u0161\u0162\7\f\2\2\u0162\u0163\3\2\2\2\u0163\u0164\b:\4\2\u0164"+
		"t\3\2\2\2\u0165\u016d\4\62;\2\u0166\u0168\4\63;\2\u0167\u0169\4\62;\2"+
		"\u0168\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b"+
		"\3\2\2\2\u016b\u016d\3\2\2\2\u016c\u0165\3\2\2\2\u016c\u0166\3\2\2\2\u016d"+
		"v\3\2\2\2\16\2\u00d1\u011e\u0124\u012a\u0138\u013a\u0140\u014b\u0156\u016a"+
		"\u016c";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
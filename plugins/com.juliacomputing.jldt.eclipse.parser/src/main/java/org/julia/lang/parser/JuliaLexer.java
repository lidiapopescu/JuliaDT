// Generated from org/julia/lang/parser/Julia.g4 by ANTLR 4.5.1
package org.julia.lang.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JuliaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, OR=5, AND=6, MINUS=7, NOT=8, BITWISE_NOT=9, 
		SUB_TYPE=10, AMPERSAND=11, ASSIGNMENT_OPERATOR=12, CONDITIONAL_OPERATOR=13, 
		ARROW_OPERATOR=14, RELATIONAL_OPERATOR=15, PIPE_OPERATOR=16, INSTANCE_OF=17, 
		COLON=18, PLUS=19, ADDITIVE_OPERATOR=20, BIT_SHIFT_OPERATOR=21, TIMES=22, 
		MULTIPLICATIVE_OPERATOR=23, RATIONAL_OPERATOR=24, POWER_OPERATOR=25, EQ=26, 
		DOLLAR=27, DOT=28, BEGIN=29, WHILE=30, IMPORT_ALL=31, IMPORT=32, IF=33, 
		FOR=34, TRY=35, RETURN=36, BREAK=37, CONTINUE=38, FUNCTION=39, STAGED_FUNCTION=40, 
		MACRO=41, QUOTE=42, LET=43, LOCAL=44, GLOBAL=45, CONST=46, ABSTRACT=47, 
		TYPE_ALIAS=48, TYPE=49, BITS_TYPE=50, IMMUTABLE=51, CCALL=52, MODULE=53, 
		BARE_MODULE=54, USING=55, EXPORT=56, DO=57, CATCH=58, ARROW=59, AT=60, 
		SEMI_COLON=61, ELLIPSE=62, ELSE_IF=63, ELSE=64, COMMA=65, END=66, END_LITERAL=67, 
		INF16=68, INF32=69, INF=70, MINUS_INF16=71, MINUS_INF32=72, MINUS_INF=73, 
		NAN16=74, NAN32=75, NAN=76, LEFT_PARENTHESIS=77, RIGHT_PARENTHESIS=78, 
		LEFT_BRACE=79, RIGHT_BRACE=80, LEFT_BRACKET=81, RIGHT_BRACKET=82, REGEX=83, 
		INT_LITERAL=84, BINARY=85, OCTAL=86, HEX=87, FLOAT32_LITERAL=88, FLOAT64_LITERAL=89, 
		FQN=90, ID=91, CHARACTER_LITERAL=92, STRING=93, WS=94, EOL=95, COMMENT=96, 
		LINE_COMMENT=97, SIZE=98;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "OR", "AND", "MINUS", "NOT", "BITWISE_NOT", 
		"SUB_TYPE", "AMPERSAND", "ASSIGNMENT_OPERATOR", "CONDITIONAL_OPERATOR", 
		"ARROW_OPERATOR", "RELATIONAL_OPERATOR", "PIPE_OPERATOR", "INSTANCE_OF", 
		"COLON", "PLUS", "ADDITIVE_OPERATOR", "BIT_SHIFT_OPERATOR", "TIMES", "MULTIPLICATIVE_OPERATOR", 
		"RATIONAL_OPERATOR", "POWER_OPERATOR", "EQ", "DOLLAR", "DOT", "BEGIN", 
		"WHILE", "IMPORT_ALL", "IMPORT", "IF", "FOR", "TRY", "RETURN", "BREAK", 
		"CONTINUE", "FUNCTION", "STAGED_FUNCTION", "MACRO", "QUOTE", "LET", "LOCAL", 
		"GLOBAL", "CONST", "ABSTRACT", "TYPE_ALIAS", "TYPE", "BITS_TYPE", "IMMUTABLE", 
		"CCALL", "MODULE", "BARE_MODULE", "USING", "EXPORT", "DO", "CATCH", "ARROW", 
		"AT", "SEMI_COLON", "ELLIPSE", "ELSE_IF", "ELSE", "COMMA", "END", "END_LITERAL", 
		"INF16", "INF32", "INF", "MINUS_INF16", "MINUS_INF32", "MINUS_INF", "NAN16", 
		"NAN32", "NAN", "LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", "LEFT_BRACE", 
		"RIGHT_BRACE", "LEFT_BRACKET", "RIGHT_BRACKET", "REGEX", "INT_LITERAL", 
		"BINARY", "OCTAL", "HEX", "FLOAT32_LITERAL", "EXP32", "FLOAT64_LITERAL", 
		"EXP64", "FQN", "ID", "CHARACTER_LITERAL", "STRING", "SPACES", "WS", "EOL", 
		"COMMENT", "LINE_COMMENT", "Identifier", "DEC_DGT", "BIN_DGT", "OCT_DGT", 
		"HEX_DGT", "SIZE", "UNi"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'in'", "'true'", "'false'", "'Union'", "'||'", "'&&'", "'-'", "'!'", 
		"'~'", "'<:'", "'&'", null, "'?'", null, null, null, "'::'", "':'", "'+'", 
		null, null, "'*'", null, null, null, "'='", "'$'", "'.'", "'begin'", "'while'", 
		"'importall'", "'import'", "'if'", "'for'", "'try'", "'return'", "'break'", 
		"'continue'", "'function'", "'stagedfunction'", "'macro'", "'quote'", 
		"'let'", "'local'", "'global'", "'const'", "'abstract'", "'typealias'", 
		"'type'", "'bitstype'", "'immutable'", "'ccall'", "'module'", "'baremodule'", 
		"'using'", "'export'", "'do'", "'catch'", "'->'", "'@'", "';'", "'...'", 
		"'elseif'", "'else'", "','", null, null, "'Inf16'", "'Inf32'", "'Inf'", 
		"'-Inf16'", "'-Inf32'", "'-Inf'", "'NaN16'", "'NaN32'", "'NaN'", "'('", 
		"')'", "'{'", "'}'", "'['", "']'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "OR", "AND", "MINUS", "NOT", "BITWISE_NOT", 
		"SUB_TYPE", "AMPERSAND", "ASSIGNMENT_OPERATOR", "CONDITIONAL_OPERATOR", 
		"ARROW_OPERATOR", "RELATIONAL_OPERATOR", "PIPE_OPERATOR", "INSTANCE_OF", 
		"COLON", "PLUS", "ADDITIVE_OPERATOR", "BIT_SHIFT_OPERATOR", "TIMES", "MULTIPLICATIVE_OPERATOR", 
		"RATIONAL_OPERATOR", "POWER_OPERATOR", "EQ", "DOLLAR", "DOT", "BEGIN", 
		"WHILE", "IMPORT_ALL", "IMPORT", "IF", "FOR", "TRY", "RETURN", "BREAK", 
		"CONTINUE", "FUNCTION", "STAGED_FUNCTION", "MACRO", "QUOTE", "LET", "LOCAL", 
		"GLOBAL", "CONST", "ABSTRACT", "TYPE_ALIAS", "TYPE", "BITS_TYPE", "IMMUTABLE", 
		"CCALL", "MODULE", "BARE_MODULE", "USING", "EXPORT", "DO", "CATCH", "ARROW", 
		"AT", "SEMI_COLON", "ELLIPSE", "ELSE_IF", "ELSE", "COMMA", "END", "END_LITERAL", 
		"INF16", "INF32", "INF", "MINUS_INF16", "MINUS_INF32", "MINUS_INF", "NAN16", 
		"NAN32", "NAN", "LEFT_PARENTHESIS", "RIGHT_PARENTHESIS", "LEFT_BRACE", 
		"RIGHT_BRACE", "LEFT_BRACKET", "RIGHT_BRACKET", "REGEX", "INT_LITERAL", 
		"BINARY", "OCTAL", "HEX", "FLOAT32_LITERAL", "FLOAT64_LITERAL", "FQN", 
		"ID", "CHARACTER_LITERAL", "STRING", "WS", "EOL", "COMMENT", "LINE_COMMENT", 
		"SIZE"
	};
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


	   int nesting = 0;
	   int bracketNesting = 0;


	public JuliaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Julia.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 76:
			LEFT_PARENTHESIS_action((RuleContext)_localctx, actionIndex);
			break;
		case 77:
			RIGHT_PARENTHESIS_action((RuleContext)_localctx, actionIndex);
			break;
		case 78:
			LEFT_BRACE_action((RuleContext)_localctx, actionIndex);
			break;
		case 79:
			RIGHT_BRACE_action((RuleContext)_localctx, actionIndex);
			break;
		case 80:
			LEFT_BRACKET_action((RuleContext)_localctx, actionIndex);
			break;
		case 81:
			RIGHT_BRACKET_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void LEFT_PARENTHESIS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			nesting++;
			break;
		}
	}
	private void RIGHT_PARENTHESIS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			nesting--;
			break;
		}
	}
	private void LEFT_BRACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			nesting++;
			break;
		}
	}
	private void RIGHT_BRACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			nesting--;
			break;
		}
	}
	private void LEFT_BRACKET_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			nesting++;bracketNesting++;
			break;
		}
	}
	private void RIGHT_BRACKET_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			nesting--;bracketNesting--;
			break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 65:
			return END_sempred((RuleContext)_localctx, predIndex);
		case 66:
			return END_LITERAL_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean END_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return bracketNesting==0;
		}
		return true;
	}
	private boolean END_LITERAL_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return bracketNesting>0;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2d\u03de\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u013d\n\r"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\5\17\u0146\n\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u0178\n\20\3\21\3\21\3\21\3\21\5\21\u017e\n\21\3\22\3"+
		"\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\5\25\u018c\n\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\5\26\u019f\n\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u01af\n\30\3\31\3\31\3\31\3\31\3\31"+
		"\5\31\u01b6\n\31\3\32\3\32\3\32\5\32\u01bb\n\32\3\33\3\33\3\34\3\34\3"+
		"\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3#\3#\3"+
		"#\3#\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3"+
		",\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\39\39"+
		"\39\39\39\39\39\3:\3:\3:\3;\3;\3;\3;\3;\3;\3<\3<\3<\3=\3=\3>\3>\3?\3?"+
		"\3?\3?\3@\3@\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3B\3B\3C\3C\3C\3C\3C\3C\3D"+
		"\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3G\3G\3G\3G\3H\3H"+
		"\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3I\3J\3J\3J\3J\3J\3K\3K\3K\3K\3K\3K"+
		"\3L\3L\3L\3L\3L\3L\3M\3M\3M\3M\3N\3N\3N\3O\3O\3O\3P\3P\3P\3Q\3Q\3Q\3R"+
		"\3R\3R\3S\3S\3S\3T\3T\3T\3U\6U\u0303\nU\rU\16U\u0304\3V\3V\3V\3V\6V\u030b"+
		"\nV\rV\16V\u030c\3W\3W\3W\3W\6W\u0313\nW\rW\16W\u0314\3X\3X\3X\3X\6X\u031b"+
		"\nX\rX\16X\u031c\3Y\6Y\u0320\nY\rY\16Y\u0321\3Y\3Y\7Y\u0326\nY\fY\16Y"+
		"\u0329\13Y\3Y\5Y\u032c\nY\3Y\3Y\7Y\u0330\nY\fY\16Y\u0333\13Y\3Y\5Y\u0336"+
		"\nY\5Y\u0338\nY\3Z\3Z\5Z\u033c\nZ\3Z\6Z\u033f\nZ\rZ\16Z\u0340\3[\6[\u0344"+
		"\n[\r[\16[\u0345\3[\3[\7[\u034a\n[\f[\16[\u034d\13[\3[\5[\u0350\n[\3["+
		"\3[\7[\u0354\n[\f[\16[\u0357\13[\3[\5[\u035a\n[\5[\u035c\n[\3\\\3\\\5"+
		"\\\u0360\n\\\3\\\6\\\u0363\n\\\r\\\16\\\u0364\3]\3]\3]\3]\6]\u036b\n]"+
		"\r]\16]\u036c\3]\3]\3^\3^\3^\7^\u0374\n^\f^\16^\u0377\13^\3^\5^\u037a"+
		"\n^\3_\3_\3_\3_\3_\3_\3_\5_\u0383\n_\3`\3`\3`\3`\7`\u0389\n`\f`\16`\u038c"+
		"\13`\3`\3`\3a\6a\u0391\na\ra\16a\u0392\3b\3b\3b\3b\3c\5c\u039a\nc\3c\3"+
		"c\3c\3c\3d\3d\3d\3d\7d\u03a4\nd\fd\16d\u03a7\13d\3d\3d\3d\3d\3d\3e\3e"+
		"\7e\u03b0\ne\fe\16e\u03b3\13e\3e\3e\3f\3f\5f\u03b9\nf\3f\3f\3f\7f\u03be"+
		"\nf\ff\16f\u03c1\13f\3g\3g\3h\3h\3i\3i\3j\3j\3k\3k\3k\3k\3k\3k\3k\3k\3"+
		"k\3k\3k\3k\3k\3k\3k\3k\5k\u03db\nk\3l\3l\3\u03a5\2m\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177"+
		"A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093"+
		"K\u0095L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\u00a5T\u00a7"+
		"U\u00a9V\u00abW\u00adX\u00afY\u00b1Z\u00b3\2\u00b5[\u00b7\2\u00b9\\\u00bb"+
		"]\u00bd^\u00bf_\u00c1\2\u00c3`\u00c5a\u00c7b\u00c9c\u00cb\2\u00cd\2\u00cf"+
		"\2\u00d1\2\u00d3\2\u00d5d\u00d7\2\3\2\22\4\2>>@@\35\2~~\u00b3\u00b3\u2215"+
		"\u2216\u223a\u223a\u2244\u2244\u2251\u2251\u2290\u2290\u2296\u2296\u22bd"+
		"\u22bd\u22bf\u22bf\u22d0\u22d0\u22d5\u22d5\u29fc\u29fd\u2a0a\u2a0a\u2a24"+
		"\u2a30\u2a3b\u2a3c\u2a43\u2a44\u2a47\u2a47\u2a4c\u2a4c\u2a4e\u2a4e\u2a51"+
		"\u2a52\u2a54\u2a54\u2a56\u2a56\u2a58\u2a59\u2a5d\u2a5d\u2a5f\u2a5f\u2a63"+
		"\u2a65\7\2\'\'\u00d9\u00d9\u00f9\u00f9\u221a\u221a\u22c7\u22c7\4\2\60"+
		"\60^^\3\2hh\4\2--//\3\2gg\3\2))\3\2$$\4\2\13\13\"\"\4\2\f\f\17\17\3\2"+
		"\62;\3\2\62\63\3\2\629\4\2\62;CH\17\2C\\c|\u00c2\u00d8\u00da\u00f8\u00fa"+
		"\u0301\u0372\u037f\u0381\u2001\u200e\u200f\u2072\u2191\u2c02\u2ff1\u3003"+
		"\ud801\uf902\ufdd1\ufdf2\uffff\u043d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2"+
		"\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2"+
		"\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2"+
		"\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089"+
		"\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2"+
		"\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b"+
		"\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2"+
		"\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad"+
		"\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b5\3\2\2\2\2\u00b9\3\2\2"+
		"\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2\2\2\u00c3\3\2\2\2\2\u00c5"+
		"\3\2\2\2\2\u00c7\3\2\2\2\2\u00c9\3\2\2\2\2\u00d5\3\2\2\2\3\u00d9\3\2\2"+
		"\2\5\u00dc\3\2\2\2\7\u00e1\3\2\2\2\t\u00e7\3\2\2\2\13\u00ed\3\2\2\2\r"+
		"\u00f0\3\2\2\2\17\u00f3\3\2\2\2\21\u00f5\3\2\2\2\23\u00f7\3\2\2\2\25\u00f9"+
		"\3\2\2\2\27\u00fc\3\2\2\2\31\u013c\3\2\2\2\33\u013e\3\2\2\2\35\u0145\3"+
		"\2\2\2\37\u0177\3\2\2\2!\u017d\3\2\2\2#\u017f\3\2\2\2%\u0182\3\2\2\2\'"+
		"\u0184\3\2\2\2)\u018b\3\2\2\2+\u019e\3\2\2\2-\u01a0\3\2\2\2/\u01ae\3\2"+
		"\2\2\61\u01b5\3\2\2\2\63\u01ba\3\2\2\2\65\u01bc\3\2\2\2\67\u01be\3\2\2"+
		"\29\u01c0\3\2\2\2;\u01c2\3\2\2\2=\u01c8\3\2\2\2?\u01ce\3\2\2\2A\u01d8"+
		"\3\2\2\2C\u01df\3\2\2\2E\u01e2\3\2\2\2G\u01e6\3\2\2\2I\u01ea\3\2\2\2K"+
		"\u01f1\3\2\2\2M\u01f7\3\2\2\2O\u0200\3\2\2\2Q\u0209\3\2\2\2S\u0218\3\2"+
		"\2\2U\u021e\3\2\2\2W\u0224\3\2\2\2Y\u0228\3\2\2\2[\u022e\3\2\2\2]\u0235"+
		"\3\2\2\2_\u023b\3\2\2\2a\u0244\3\2\2\2c\u024e\3\2\2\2e\u0253\3\2\2\2g"+
		"\u025c\3\2\2\2i\u0266\3\2\2\2k\u026c\3\2\2\2m\u0273\3\2\2\2o\u027e\3\2"+
		"\2\2q\u0284\3\2\2\2s\u028b\3\2\2\2u\u028e\3\2\2\2w\u0294\3\2\2\2y\u0297"+
		"\3\2\2\2{\u0299\3\2\2\2}\u029b\3\2\2\2\177\u029f\3\2\2\2\u0081\u02a6\3"+
		"\2\2\2\u0083\u02ab\3\2\2\2\u0085\u02ad\3\2\2\2\u0087\u02b3\3\2\2\2\u0089"+
		"\u02b9\3\2\2\2\u008b\u02bf\3\2\2\2\u008d\u02c5\3\2\2\2\u008f\u02c9\3\2"+
		"\2\2\u0091\u02d0\3\2\2\2\u0093\u02d7\3\2\2\2\u0095\u02dc\3\2\2\2\u0097"+
		"\u02e2\3\2\2\2\u0099\u02e8\3\2\2\2\u009b\u02ec\3\2\2\2\u009d\u02ef\3\2"+
		"\2\2\u009f\u02f2\3\2\2\2\u00a1\u02f5\3\2\2\2\u00a3\u02f8\3\2\2\2\u00a5"+
		"\u02fb\3\2\2\2\u00a7\u02fe\3\2\2\2\u00a9\u0302\3\2\2\2\u00ab\u0306\3\2"+
		"\2\2\u00ad\u030e\3\2\2\2\u00af\u0316\3\2\2\2\u00b1\u0337\3\2\2\2\u00b3"+
		"\u0339\3\2\2\2\u00b5\u035b\3\2\2\2\u00b7\u035d\3\2\2\2\u00b9\u036a\3\2"+
		"\2\2\u00bb\u0370\3\2\2\2\u00bd\u0382\3\2\2\2\u00bf\u0384\3\2\2\2\u00c1"+
		"\u0390\3\2\2\2\u00c3\u0394\3\2\2\2\u00c5\u0399\3\2\2\2\u00c7\u039f\3\2"+
		"\2\2\u00c9\u03ad\3\2\2\2\u00cb\u03b8\3\2\2\2\u00cd\u03c2\3\2\2\2\u00cf"+
		"\u03c4\3\2\2\2\u00d1\u03c6\3\2\2\2\u00d3\u03c8\3\2\2\2\u00d5\u03da\3\2"+
		"\2\2\u00d7\u03dc\3\2\2\2\u00d9\u00da\7k\2\2\u00da\u00db\7p\2\2\u00db\4"+
		"\3\2\2\2\u00dc\u00dd\7v\2\2\u00dd\u00de\7t\2\2\u00de\u00df\7w\2\2\u00df"+
		"\u00e0\7g\2\2\u00e0\6\3\2\2\2\u00e1\u00e2\7h\2\2\u00e2\u00e3\7c\2\2\u00e3"+
		"\u00e4\7n\2\2\u00e4\u00e5\7u\2\2\u00e5\u00e6\7g\2\2\u00e6\b\3\2\2\2\u00e7"+
		"\u00e8\7W\2\2\u00e8\u00e9\7p\2\2\u00e9\u00ea\7k\2\2\u00ea\u00eb\7q\2\2"+
		"\u00eb\u00ec\7p\2\2\u00ec\n\3\2\2\2\u00ed\u00ee\7~\2\2\u00ee\u00ef\7~"+
		"\2\2\u00ef\f\3\2\2\2\u00f0\u00f1\7(\2\2\u00f1\u00f2\7(\2\2\u00f2\16\3"+
		"\2\2\2\u00f3\u00f4\7/\2\2\u00f4\20\3\2\2\2\u00f5\u00f6\7#\2\2\u00f6\22"+
		"\3\2\2\2\u00f7\u00f8\7\u0080\2\2\u00f8\24\3\2\2\2\u00f9\u00fa\7>\2\2\u00fa"+
		"\u00fb\7<\2\2\u00fb\26\3\2\2\2\u00fc\u00fd\7(\2\2\u00fd\30\3\2\2\2\u00fe"+
		"\u00ff\7<\2\2\u00ff\u013d\7?\2\2\u0100\u0101\7-\2\2\u0101\u013d\7?\2\2"+
		"\u0102\u0103\7/\2\2\u0103\u013d\7?\2\2\u0104\u0105\7,\2\2\u0105\u013d"+
		"\7?\2\2\u0106\u0107\7\61\2\2\u0107\u013d\7?\2\2\u0108\u0109\7\61\2\2\u0109"+
		"\u010a\7\61\2\2\u010a\u013d\7?\2\2\u010b\u010c\7\60\2\2\u010c\u010d\7"+
		"\61\2\2\u010d\u010e\7\61\2\2\u010e\u013d\7?\2\2\u010f\u0110\7\60\2\2\u0110"+
		"\u0111\7,\2\2\u0111\u013d\7?\2\2\u0112\u0113\7\60\2\2\u0113\u0114\7\61"+
		"\2\2\u0114\u013d\7?\2\2\u0115\u0116\7^\2\2\u0116\u013d\7?\2\2\u0117\u0118"+
		"\7\60\2\2\u0118\u0119\7^\2\2\u0119\u013d\7?\2\2\u011a\u011b\7`\2\2\u011b"+
		"\u013d\7?\2\2\u011c\u011d\7\60\2\2\u011d\u011e\7`\2\2\u011e\u013d\7?\2"+
		"\2\u011f\u0120\7\'\2\2\u0120\u013d\7?\2\2\u0121\u0122\7\60\2\2\u0122\u0123"+
		"\7\'\2\2\u0123\u013d\7?\2\2\u0124\u0125\7~\2\2\u0125\u013d\7?\2\2\u0126"+
		"\u0127\7(\2\2\u0127\u013d\7?\2\2\u0128\u0129\7&\2\2\u0129\u013d\7?\2\2"+
		"\u012a\u012b\7?\2\2\u012b\u013d\7@\2\2\u012c\u012d\7>\2\2\u012d\u012e"+
		"\7>\2\2\u012e\u013d\7?\2\2\u012f\u0130\7@\2\2\u0130\u0131\7@\2\2\u0131"+
		"\u013d\7?\2\2\u0132\u0133\7@\2\2\u0133\u0134\7@\2\2\u0134\u0135\7@\2\2"+
		"\u0135\u013d\7?\2\2\u0136\u0137\7\60\2\2\u0137\u0138\7-\2\2\u0138\u013d"+
		"\7?\2\2\u0139\u013a\7\60\2\2\u013a\u013b\7/\2\2\u013b\u013d\7?\2\2\u013c"+
		"\u00fe\3\2\2\2\u013c\u0100\3\2\2\2\u013c\u0102\3\2\2\2\u013c\u0104\3\2"+
		"\2\2\u013c\u0106\3\2\2\2\u013c\u0108\3\2\2\2\u013c\u010b\3\2\2\2\u013c"+
		"\u010f\3\2\2\2\u013c\u0112\3\2\2\2\u013c\u0115\3\2\2\2\u013c\u0117\3\2"+
		"\2\2\u013c\u011a\3\2\2\2\u013c\u011c\3\2\2\2\u013c\u011f\3\2\2\2\u013c"+
		"\u0121\3\2\2\2\u013c\u0124\3\2\2\2\u013c\u0126\3\2\2\2\u013c\u0128\3\2"+
		"\2\2\u013c\u012a\3\2\2\2\u013c\u012c\3\2\2\2\u013c\u012f\3\2\2\2\u013c"+
		"\u0132\3\2\2\2\u013c\u0136\3\2\2\2\u013c\u0139\3\2\2\2\u013d\32\3\2\2"+
		"\2\u013e\u013f\7A\2\2\u013f\34\3\2\2\2\u0140\u0141\7/\2\2\u0141\u0146"+
		"\7/\2\2\u0142\u0143\7/\2\2\u0143\u0144\7/\2\2\u0144\u0146\7@\2\2\u0145"+
		"\u0140\3\2\2\2\u0145\u0142\3\2\2\2\u0146\36\3\2\2\2\u0147\u0148\7@\2\2"+
		"\u0148\u0178\7<\2\2\u0149\u0178\t\2\2\2\u014a\u014b\7@\2\2\u014b\u0178"+
		"\7?\2\2\u014c\u0178\7\u2267\2\2\u014d\u014e\7>\2\2\u014e\u0178\7?\2\2"+
		"\u014f\u0178\7\u2266\2\2\u0150\u0151\7?\2\2\u0151\u0178\7?\2\2\u0152\u0153"+
		"\7?\2\2\u0153\u0154\7?\2\2\u0154\u0178\7?\2\2\u0155\u0178\7\u2263\2\2"+
		"\u0156\u0157\7#\2\2\u0157\u0178\7?\2\2\u0158\u0178\7\u2262\2\2\u0159\u015a"+
		"\7#\2\2\u015a\u015b\7?\2\2\u015b\u0178\7?\2\2\u015c\u0178\7\u2264\2\2"+
		"\u015d\u015e\7\60\2\2\u015e\u0178\7@\2\2\u015f\u0160\7\60\2\2\u0160\u0178"+
		"\7>\2\2\u0161\u0162\7\60\2\2\u0162\u0163\7@\2\2\u0163\u0178\7?\2\2\u0164"+
		"\u0165\7\60\2\2\u0165\u0178\7\u2267\2\2\u0166\u0167\7\60\2\2\u0167\u0168"+
		"\7>\2\2\u0168\u0178\7?\2\2\u0169\u016a\7\60\2\2\u016a\u0178\7\u2266\2"+
		"\2\u016b\u016c\7\60\2\2\u016c\u016d\7?\2\2\u016d\u0178\7?\2\2\u016e\u016f"+
		"\7\60\2\2\u016f\u0170\7#\2\2\u0170\u0178\7?\2\2\u0171\u0172\7\60\2\2\u0172"+
		"\u0178\7\u2262\2\2\u0173\u0174\7\60\2\2\u0174\u0178\7?\2\2\u0175\u0176"+
		"\7\60\2\2\u0176\u0178\7#\2\2\u0177\u0147\3\2\2\2\u0177\u0149\3\2\2\2\u0177"+
		"\u014a\3\2\2\2\u0177\u014c\3\2\2\2\u0177\u014d\3\2\2\2\u0177\u014f\3\2"+
		"\2\2\u0177\u0150\3\2\2\2\u0177\u0152\3\2\2\2\u0177\u0155\3\2\2\2\u0177"+
		"\u0156\3\2\2\2\u0177\u0158\3\2\2\2\u0177\u0159\3\2\2\2\u0177\u015c\3\2"+
		"\2\2\u0177\u015d\3\2\2\2\u0177\u015f\3\2\2\2\u0177\u0161\3\2\2\2\u0177"+
		"\u0164\3\2\2\2\u0177\u0166\3\2\2\2\u0177\u0169\3\2\2\2\u0177\u016b\3\2"+
		"\2\2\u0177\u016e\3\2\2\2\u0177\u0171\3\2\2\2\u0177\u0173\3\2\2\2\u0177"+
		"\u0175\3\2\2\2\u0178 \3\2\2\2\u0179\u017a\7~\2\2\u017a\u017e\7@\2\2\u017b"+
		"\u017c\7>\2\2\u017c\u017e\7~\2\2\u017d\u0179\3\2\2\2\u017d\u017b\3\2\2"+
		"\2\u017e\"\3\2\2\2\u017f\u0180\7<\2\2\u0180\u0181\7<\2\2\u0181$\3\2\2"+
		"\2\u0182\u0183\7<\2\2\u0183&\3\2\2\2\u0184\u0185\7-\2\2\u0185(\3\2\2\2"+
		"\u0186\u0187\7\60\2\2\u0187\u018c\7-\2\2\u0188\u0189\7\60\2\2\u0189\u018c"+
		"\7/\2\2\u018a\u018c\t\3\2\2\u018b\u0186\3\2\2\2\u018b\u0188\3\2\2\2\u018b"+
		"\u018a\3\2\2\2\u018c*\3\2\2\2\u018d\u018e\7>\2\2\u018e\u019f\7>\2\2\u018f"+
		"\u0190\7@\2\2\u0190\u019f\7@\2\2\u0191\u0192\7@\2\2\u0192\u0193\7@\2\2"+
		"\u0193\u019f\7@\2\2\u0194\u0195\7\60\2\2\u0195\u0196\7>\2\2\u0196\u019f"+
		"\7>\2\2\u0197\u0198\7\60\2\2\u0198\u0199\7@\2\2\u0199\u019f\7@\2\2\u019a"+
		"\u019b\7\60\2\2\u019b\u019c\7@\2\2\u019c\u019d\7@\2\2\u019d\u019f\7@\2"+
		"\2\u019e\u018d\3\2\2\2\u019e\u018f\3\2\2\2\u019e\u0191\3\2\2\2\u019e\u0194"+
		"\3\2\2\2\u019e\u0197\3\2\2\2\u019e\u019a\3\2\2\2\u019f,\3\2\2\2\u01a0"+
		"\u01a1\7,\2\2\u01a1.\3\2\2\2\u01a2\u01af\7\61\2\2\u01a3\u01a4\7\60\2\2"+
		"\u01a4\u01af\7\61\2\2\u01a5\u01af\t\4\2\2\u01a6\u01a7\7\60\2\2\u01a7\u01af"+
		"\7\'\2\2\u01a8\u01a9\7\60\2\2\u01a9\u01af\7,\2\2\u01aa\u01af\7^\2\2\u01ab"+
		"\u01ac\7\60\2\2\u01ac\u01af\7^\2\2\u01ad\u01af\7(\2\2\u01ae\u01a2\3\2"+
		"\2\2\u01ae\u01a3\3\2\2\2\u01ae\u01a5\3\2\2\2\u01ae\u01a6\3\2\2\2\u01ae"+
		"\u01a8\3\2\2\2\u01ae\u01aa\3\2\2\2\u01ae\u01ab\3\2\2\2\u01ae\u01ad\3\2"+
		"\2\2\u01af\60\3\2\2\2\u01b0\u01b1\7\61\2\2\u01b1\u01b6\7\61\2\2\u01b2"+
		"\u01b3\7\60\2\2\u01b3\u01b4\7\61\2\2\u01b4\u01b6\7\61\2\2\u01b5\u01b0"+
		"\3\2\2\2\u01b5\u01b2\3\2\2\2\u01b6\62\3\2\2\2\u01b7\u01bb\7`\2\2\u01b8"+
		"\u01b9\7\60\2\2\u01b9\u01bb\7`\2\2\u01ba\u01b7\3\2\2\2\u01ba\u01b8\3\2"+
		"\2\2\u01bb\64\3\2\2\2\u01bc\u01bd\7?\2\2\u01bd\66\3\2\2\2\u01be\u01bf"+
		"\7&\2\2\u01bf8\3\2\2\2\u01c0\u01c1\7\60\2\2\u01c1:\3\2\2\2\u01c2\u01c3"+
		"\7d\2\2\u01c3\u01c4\7g\2\2\u01c4\u01c5\7i\2\2\u01c5\u01c6\7k\2\2\u01c6"+
		"\u01c7\7p\2\2\u01c7<\3\2\2\2\u01c8\u01c9\7y\2\2\u01c9\u01ca\7j\2\2\u01ca"+
		"\u01cb\7k\2\2\u01cb\u01cc\7n\2\2\u01cc\u01cd\7g\2\2\u01cd>\3\2\2\2\u01ce"+
		"\u01cf\7k\2\2\u01cf\u01d0\7o\2\2\u01d0\u01d1\7r\2\2\u01d1\u01d2\7q\2\2"+
		"\u01d2\u01d3\7t\2\2\u01d3\u01d4\7v\2\2\u01d4\u01d5\7c\2\2\u01d5\u01d6"+
		"\7n\2\2\u01d6\u01d7\7n\2\2\u01d7@\3\2\2\2\u01d8\u01d9\7k\2\2\u01d9\u01da"+
		"\7o\2\2\u01da\u01db\7r\2\2\u01db\u01dc\7q\2\2\u01dc\u01dd\7t\2\2\u01dd"+
		"\u01de\7v\2\2\u01deB\3\2\2\2\u01df\u01e0\7k\2\2\u01e0\u01e1\7h\2\2\u01e1"+
		"D\3\2\2\2\u01e2\u01e3\7h\2\2\u01e3\u01e4\7q\2\2\u01e4\u01e5\7t\2\2\u01e5"+
		"F\3\2\2\2\u01e6\u01e7\7v\2\2\u01e7\u01e8\7t\2\2\u01e8\u01e9\7{\2\2\u01e9"+
		"H\3\2\2\2\u01ea\u01eb\7t\2\2\u01eb\u01ec\7g\2\2\u01ec\u01ed\7v\2\2\u01ed"+
		"\u01ee\7w\2\2\u01ee\u01ef\7t\2\2\u01ef\u01f0\7p\2\2\u01f0J\3\2\2\2\u01f1"+
		"\u01f2\7d\2\2\u01f2\u01f3\7t\2\2\u01f3\u01f4\7g\2\2\u01f4\u01f5\7c\2\2"+
		"\u01f5\u01f6\7m\2\2\u01f6L\3\2\2\2\u01f7\u01f8\7e\2\2\u01f8\u01f9\7q\2"+
		"\2\u01f9\u01fa\7p\2\2\u01fa\u01fb\7v\2\2\u01fb\u01fc\7k\2\2\u01fc\u01fd"+
		"\7p\2\2\u01fd\u01fe\7w\2\2\u01fe\u01ff\7g\2\2\u01ffN\3\2\2\2\u0200\u0201"+
		"\7h\2\2\u0201\u0202\7w\2\2\u0202\u0203\7p\2\2\u0203\u0204\7e\2\2\u0204"+
		"\u0205\7v\2\2\u0205\u0206\7k\2\2\u0206\u0207\7q\2\2\u0207\u0208\7p\2\2"+
		"\u0208P\3\2\2\2\u0209\u020a\7u\2\2\u020a\u020b\7v\2\2\u020b\u020c\7c\2"+
		"\2\u020c\u020d\7i\2\2\u020d\u020e\7g\2\2\u020e\u020f\7f\2\2\u020f\u0210"+
		"\7h\2\2\u0210\u0211\7w\2\2\u0211\u0212\7p\2\2\u0212\u0213\7e\2\2\u0213"+
		"\u0214\7v\2\2\u0214\u0215\7k\2\2\u0215\u0216\7q\2\2\u0216\u0217\7p\2\2"+
		"\u0217R\3\2\2\2\u0218\u0219\7o\2\2\u0219\u021a\7c\2\2\u021a\u021b\7e\2"+
		"\2\u021b\u021c\7t\2\2\u021c\u021d\7q\2\2\u021dT\3\2\2\2\u021e\u021f\7"+
		"s\2\2\u021f\u0220\7w\2\2\u0220\u0221\7q\2\2\u0221\u0222\7v\2\2\u0222\u0223"+
		"\7g\2\2\u0223V\3\2\2\2\u0224\u0225\7n\2\2\u0225\u0226\7g\2\2\u0226\u0227"+
		"\7v\2\2\u0227X\3\2\2\2\u0228\u0229\7n\2\2\u0229\u022a\7q\2\2\u022a\u022b"+
		"\7e\2\2\u022b\u022c\7c\2\2\u022c\u022d\7n\2\2\u022dZ\3\2\2\2\u022e\u022f"+
		"\7i\2\2\u022f\u0230\7n\2\2\u0230\u0231\7q\2\2\u0231\u0232\7d\2\2\u0232"+
		"\u0233\7c\2\2\u0233\u0234\7n\2\2\u0234\\\3\2\2\2\u0235\u0236\7e\2\2\u0236"+
		"\u0237\7q\2\2\u0237\u0238\7p\2\2\u0238\u0239\7u\2\2\u0239\u023a\7v\2\2"+
		"\u023a^\3\2\2\2\u023b\u023c\7c\2\2\u023c\u023d\7d\2\2\u023d\u023e\7u\2"+
		"\2\u023e\u023f\7v\2\2\u023f\u0240\7t\2\2\u0240\u0241\7c\2\2\u0241\u0242"+
		"\7e\2\2\u0242\u0243\7v\2\2\u0243`\3\2\2\2\u0244\u0245\7v\2\2\u0245\u0246"+
		"\7{\2\2\u0246\u0247\7r\2\2\u0247\u0248\7g\2\2\u0248\u0249\7c\2\2\u0249"+
		"\u024a\7n\2\2\u024a\u024b\7k\2\2\u024b\u024c\7c\2\2\u024c\u024d\7u\2\2"+
		"\u024db\3\2\2\2\u024e\u024f\7v\2\2\u024f\u0250\7{\2\2\u0250\u0251\7r\2"+
		"\2\u0251\u0252\7g\2\2\u0252d\3\2\2\2\u0253\u0254\7d\2\2\u0254\u0255\7"+
		"k\2\2\u0255\u0256\7v\2\2\u0256\u0257\7u\2\2\u0257\u0258\7v\2\2\u0258\u0259"+
		"\7{\2\2\u0259\u025a\7r\2\2\u025a\u025b\7g\2\2\u025bf\3\2\2\2\u025c\u025d"+
		"\7k\2\2\u025d\u025e\7o\2\2\u025e\u025f\7o\2\2\u025f\u0260\7w\2\2\u0260"+
		"\u0261\7v\2\2\u0261\u0262\7c\2\2\u0262\u0263\7d\2\2\u0263\u0264\7n\2\2"+
		"\u0264\u0265\7g\2\2\u0265h\3\2\2\2\u0266\u0267\7e\2\2\u0267\u0268\7e\2"+
		"\2\u0268\u0269\7c\2\2\u0269\u026a\7n\2\2\u026a\u026b\7n\2\2\u026bj\3\2"+
		"\2\2\u026c\u026d\7o\2\2\u026d\u026e\7q\2\2\u026e\u026f\7f\2\2\u026f\u0270"+
		"\7w\2\2\u0270\u0271\7n\2\2\u0271\u0272\7g\2\2\u0272l\3\2\2\2\u0273\u0274"+
		"\7d\2\2\u0274\u0275\7c\2\2\u0275\u0276\7t\2\2\u0276\u0277\7g\2\2\u0277"+
		"\u0278\7o\2\2\u0278\u0279\7q\2\2\u0279\u027a\7f\2\2\u027a\u027b\7w\2\2"+
		"\u027b\u027c\7n\2\2\u027c\u027d\7g\2\2\u027dn\3\2\2\2\u027e\u027f\7w\2"+
		"\2\u027f\u0280\7u\2\2\u0280\u0281\7k\2\2\u0281\u0282\7p\2\2\u0282\u0283"+
		"\7i\2\2\u0283p\3\2\2\2\u0284\u0285\7g\2\2\u0285\u0286\7z\2\2\u0286\u0287"+
		"\7r\2\2\u0287\u0288\7q\2\2\u0288\u0289\7t\2\2\u0289\u028a\7v\2\2\u028a"+
		"r\3\2\2\2\u028b\u028c\7f\2\2\u028c\u028d\7q\2\2\u028dt\3\2\2\2\u028e\u028f"+
		"\7e\2\2\u028f\u0290\7c\2\2\u0290\u0291\7v\2\2\u0291\u0292\7e\2\2\u0292"+
		"\u0293\7j\2\2\u0293v\3\2\2\2\u0294\u0295\7/\2\2\u0295\u0296\7@\2\2\u0296"+
		"x\3\2\2\2\u0297\u0298\7B\2\2\u0298z\3\2\2\2\u0299\u029a\7=\2\2\u029a|"+
		"\3\2\2\2\u029b\u029c\7\60\2\2\u029c\u029d\7\60\2\2\u029d\u029e\7\60\2"+
		"\2\u029e~\3\2\2\2\u029f\u02a0\7g\2\2\u02a0\u02a1\7n\2\2\u02a1\u02a2\7"+
		"u\2\2\u02a2\u02a3\7g\2\2\u02a3\u02a4\7k\2\2\u02a4\u02a5\7h\2\2\u02a5\u0080"+
		"\3\2\2\2\u02a6\u02a7\7g\2\2\u02a7\u02a8\7n\2\2\u02a8\u02a9\7u\2\2\u02a9"+
		"\u02aa\7g\2\2\u02aa\u0082\3\2\2\2\u02ab\u02ac\7.\2\2\u02ac\u0084\3\2\2"+
		"\2\u02ad\u02ae\7g\2\2\u02ae\u02af\7p\2\2\u02af\u02b0\7f\2\2\u02b0\u02b1"+
		"\3\2\2\2\u02b1\u02b2\6C\2\2\u02b2\u0086\3\2\2\2\u02b3\u02b4\7g\2\2\u02b4"+
		"\u02b5\7p\2\2\u02b5\u02b6\7f\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02b8\6D\3"+
		"\2\u02b8\u0088\3\2\2\2\u02b9\u02ba\7K\2\2\u02ba\u02bb\7p\2\2\u02bb\u02bc"+
		"\7h\2\2\u02bc\u02bd\7\63\2\2\u02bd\u02be\78\2\2\u02be\u008a\3\2\2\2\u02bf"+
		"\u02c0\7K\2\2\u02c0\u02c1\7p\2\2\u02c1\u02c2\7h\2\2\u02c2\u02c3\7\65\2"+
		"\2\u02c3\u02c4\7\64\2\2\u02c4\u008c\3\2\2\2\u02c5\u02c6\7K\2\2\u02c6\u02c7"+
		"\7p\2\2\u02c7\u02c8\7h\2\2\u02c8\u008e\3\2\2\2\u02c9\u02ca\7/\2\2\u02ca"+
		"\u02cb\7K\2\2\u02cb\u02cc\7p\2\2\u02cc\u02cd\7h\2\2\u02cd\u02ce\7\63\2"+
		"\2\u02ce\u02cf\78\2\2\u02cf\u0090\3\2\2\2\u02d0\u02d1\7/\2\2\u02d1\u02d2"+
		"\7K\2\2\u02d2\u02d3\7p\2\2\u02d3\u02d4\7h\2\2\u02d4\u02d5\7\65\2\2\u02d5"+
		"\u02d6\7\64\2\2\u02d6\u0092\3\2\2\2\u02d7\u02d8\7/\2\2\u02d8\u02d9\7K"+
		"\2\2\u02d9\u02da\7p\2\2\u02da\u02db\7h\2\2\u02db\u0094\3\2\2\2\u02dc\u02dd"+
		"\7P\2\2\u02dd\u02de\7c\2\2\u02de\u02df\7P\2\2\u02df\u02e0\7\63\2\2\u02e0"+
		"\u02e1\78\2\2\u02e1\u0096\3\2\2\2\u02e2\u02e3\7P\2\2\u02e3\u02e4\7c\2"+
		"\2\u02e4\u02e5\7P\2\2\u02e5\u02e6\7\65\2\2\u02e6\u02e7\7\64\2\2\u02e7"+
		"\u0098\3\2\2\2\u02e8\u02e9\7P\2\2\u02e9\u02ea\7c\2\2\u02ea\u02eb\7P\2"+
		"\2\u02eb\u009a\3\2\2\2\u02ec\u02ed\7*\2\2\u02ed\u02ee\bN\2\2\u02ee\u009c"+
		"\3\2\2\2\u02ef\u02f0\7+\2\2\u02f0\u02f1\bO\3\2\u02f1\u009e\3\2\2\2\u02f2"+
		"\u02f3\7}\2\2\u02f3\u02f4\bP\4\2\u02f4\u00a0\3\2\2\2\u02f5\u02f6\7\177"+
		"\2\2\u02f6\u02f7\bQ\5\2\u02f7\u00a2\3\2\2\2\u02f8\u02f9\7]\2\2\u02f9\u02fa"+
		"\bR\6\2\u02fa\u00a4\3\2\2\2\u02fb\u02fc\7_\2\2\u02fc\u02fd\bS\7\2\u02fd"+
		"\u00a6\3\2\2\2\u02fe\u02ff\7t\2\2\u02ff\u0300\5\u00bf`\2\u0300\u00a8\3"+
		"\2\2\2\u0301\u0303\5\u00cdg\2\u0302\u0301\3\2\2\2\u0303\u0304\3\2\2\2"+
		"\u0304\u0302\3\2\2\2\u0304\u0305\3\2\2\2\u0305\u00aa\3\2\2\2\u0306\u0307"+
		"\7\62\2\2\u0307\u0308\7d\2\2\u0308\u030a\3\2\2\2\u0309\u030b\5\u00cfh"+
		"\2\u030a\u0309\3\2\2\2\u030b\u030c\3\2\2\2\u030c\u030a\3\2\2\2\u030c\u030d"+
		"\3\2\2\2\u030d\u00ac\3\2\2\2\u030e\u030f\7\62\2\2\u030f\u0310\7q\2\2\u0310"+
		"\u0312\3\2\2\2\u0311\u0313\5\u00d1i\2\u0312\u0311\3\2\2\2\u0313\u0314"+
		"\3\2\2\2\u0314\u0312\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u00ae\3\2\2\2\u0316"+
		"\u0317\7\62\2\2\u0317\u0318\7z\2\2\u0318\u031a\3\2\2\2\u0319\u031b\5\u00d3"+
		"j\2\u031a\u0319\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u031a\3\2\2\2\u031c"+
		"\u031d\3\2\2\2\u031d\u00b0\3\2\2\2\u031e\u0320\5\u00cdg\2\u031f\u031e"+
		"\3\2\2\2\u0320\u0321\3\2\2\2\u0321\u031f\3\2\2\2\u0321\u0322\3\2\2\2\u0322"+
		"\u0323\3\2\2\2\u0323\u0327\t\5\2\2\u0324\u0326\5\u00cdg\2\u0325\u0324"+
		"\3\2\2\2\u0326\u0329\3\2\2\2\u0327\u0325\3\2\2\2\u0327\u0328\3\2\2\2\u0328"+
		"\u032b\3\2\2\2\u0329\u0327\3\2\2\2\u032a\u032c\5\u00b3Z\2\u032b\u032a"+
		"\3\2\2\2\u032b\u032c\3\2\2\2\u032c\u0338\3\2\2\2\u032d\u0331\7\60\2\2"+
		"\u032e\u0330\5\u00cdg\2\u032f\u032e\3\2\2\2\u0330\u0333\3\2\2\2\u0331"+
		"\u032f\3\2\2\2\u0331\u0332\3\2\2\2\u0332\u0335\3\2\2\2\u0333\u0331\3\2"+
		"\2\2\u0334\u0336\5\u00b3Z\2\u0335\u0334\3\2\2\2\u0335\u0336\3\2\2\2\u0336"+
		"\u0338\3\2\2\2\u0337\u031f\3\2\2\2\u0337\u032d\3\2\2\2\u0338\u00b2\3\2"+
		"\2\2\u0339\u033b\t\6\2\2\u033a\u033c\t\7\2\2\u033b\u033a\3\2\2\2\u033b"+
		"\u033c\3\2\2\2\u033c\u033e\3\2\2\2\u033d\u033f\5\u00cdg\2\u033e\u033d"+
		"\3\2\2\2\u033f\u0340\3\2\2\2\u0340\u033e\3\2\2\2\u0340\u0341\3\2\2\2\u0341"+
		"\u00b4\3\2\2\2\u0342\u0344\5\u00cdg\2\u0343\u0342\3\2\2\2\u0344\u0345"+
		"\3\2\2\2\u0345\u0343\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u0347\3\2\2\2\u0347"+
		"\u034b\t\5\2\2\u0348\u034a\5\u00cdg\2\u0349\u0348\3\2\2\2\u034a\u034d"+
		"\3\2\2\2\u034b\u0349\3\2\2\2\u034b\u034c\3\2\2\2\u034c\u034f\3\2\2\2\u034d"+
		"\u034b\3\2\2\2\u034e\u0350\5\u00b7\\\2\u034f\u034e\3\2\2\2\u034f\u0350"+
		"\3\2\2\2\u0350\u035c\3\2\2\2\u0351\u0355\7\60\2\2\u0352\u0354\5\u00cd"+
		"g\2\u0353\u0352\3\2\2\2\u0354\u0357\3\2\2\2\u0355\u0353\3\2\2\2\u0355"+
		"\u0356\3\2\2\2\u0356\u0359\3\2\2\2\u0357\u0355\3\2\2\2\u0358\u035a\5\u00b7"+
		"\\\2\u0359\u0358\3\2\2\2\u0359\u035a\3\2\2\2\u035a\u035c\3\2\2\2\u035b"+
		"\u0343\3\2\2\2\u035b\u0351\3\2\2\2\u035c\u00b6\3\2\2\2\u035d\u035f\t\b"+
		"\2\2\u035e\u0360\t\7\2\2\u035f\u035e\3\2\2\2\u035f\u0360\3\2\2\2\u0360"+
		"\u0362\3\2\2\2\u0361\u0363\5\u00cdg\2\u0362\u0361\3\2\2\2\u0363\u0364"+
		"\3\2\2\2\u0364\u0362\3\2\2\2\u0364\u0365\3\2\2\2\u0365\u00b8\3\2\2\2\u0366"+
		"\u0367\5\u00cbf\2\u0367\u0368\7^\2\2\u0368\u0369\7\60\2\2\u0369\u036b"+
		"\3\2\2\2\u036a\u0366\3\2\2\2\u036b\u036c\3\2\2\2\u036c\u036a\3\2\2\2\u036c"+
		"\u036d\3\2\2\2\u036d\u036e\3\2\2\2\u036e\u036f\5\u00bb^\2\u036f\u00ba"+
		"\3\2\2\2\u0370\u0375\5\u00cbf\2\u0371\u0374\5\u00cbf\2\u0372\u0374\5\u00cd"+
		"g\2\u0373\u0371\3\2\2\2\u0373\u0372\3\2\2\2\u0374\u0377\3\2\2\2\u0375"+
		"\u0373\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u0379\3\2\2\2\u0377\u0375\3\2"+
		"\2\2\u0378\u037a\7#\2\2\u0379\u0378\3\2\2\2\u0379\u037a\3\2\2\2\u037a"+
		"\u00bc\3\2\2\2\u037b\u037c\7)\2\2\u037c\u037d\n\t\2\2\u037d\u0383\7)\2"+
		"\2\u037e\u037f\7)\2\2\u037f\u0380\7^\2\2\u0380\u0381\13\2\2\2\u0381\u0383"+
		"\7)\2\2\u0382\u037b\3\2\2\2\u0382\u037e\3\2\2\2\u0383\u00be\3\2\2\2\u0384"+
		"\u038a\7$\2\2\u0385\u0386\7^\2\2\u0386\u0389\7$\2\2\u0387\u0389\n\n\2"+
		"\2\u0388\u0385\3\2\2\2\u0388\u0387\3\2\2\2\u0389\u038c\3\2\2\2\u038a\u0388"+
		"\3\2\2\2\u038a\u038b\3\2\2\2\u038b\u038d\3\2\2\2\u038c\u038a\3\2\2\2\u038d"+
		"\u038e\7$\2\2\u038e\u00c0\3\2\2\2\u038f\u0391\t\13\2\2\u0390\u038f\3\2"+
		"\2\2\u0391\u0392\3\2\2\2\u0392\u0390\3\2\2\2\u0392\u0393\3\2\2\2\u0393"+
		"\u00c2\3\2\2\2\u0394\u0395\5\u00c1a\2\u0395\u0396\3\2\2\2\u0396\u0397"+
		"\bb\b\2\u0397\u00c4\3\2\2\2\u0398\u039a\7\17\2\2\u0399\u0398\3\2\2\2\u0399"+
		"\u039a\3\2\2\2\u039a\u039b\3\2\2\2\u039b\u039c\7\f\2\2\u039c\u039d\3\2"+
		"\2\2\u039d\u039e\bc\b\2\u039e\u00c6\3\2\2\2\u039f\u03a0\7%\2\2\u03a0\u03a1"+
		"\7?\2\2\u03a1\u03a5\3\2\2\2\u03a2\u03a4\13\2\2\2\u03a3\u03a2\3\2\2\2\u03a4"+
		"\u03a7\3\2\2\2\u03a5\u03a6\3\2\2\2\u03a5\u03a3\3\2\2\2\u03a6\u03a8\3\2"+
		"\2\2\u03a7\u03a5\3\2\2\2\u03a8\u03a9\7?\2\2\u03a9\u03aa\7%\2\2\u03aa\u03ab"+
		"\3\2\2\2\u03ab\u03ac\bd\b\2\u03ac\u00c8\3\2\2\2\u03ad\u03b1\7%\2\2\u03ae"+
		"\u03b0\n\f\2\2\u03af\u03ae\3\2\2\2\u03b0\u03b3\3\2\2\2\u03b1\u03af\3\2"+
		"\2\2\u03b1\u03b2\3\2\2\2\u03b2\u03b4\3\2\2\2\u03b3\u03b1\3\2\2\2\u03b4"+
		"\u03b5\be\b\2\u03b5\u00ca\3\2\2\2\u03b6\u03b9\7a\2\2\u03b7\u03b9\5\u00d7"+
		"l\2\u03b8\u03b6\3\2\2\2\u03b8\u03b7\3\2\2\2\u03b9\u03bf\3\2\2\2\u03ba"+
		"\u03be\7a\2\2\u03bb\u03be\5\u00d7l\2\u03bc\u03be\5\u00cdg\2\u03bd\u03ba"+
		"\3\2\2\2\u03bd\u03bb\3\2\2\2\u03bd\u03bc\3\2\2\2\u03be\u03c1\3\2\2\2\u03bf"+
		"\u03bd\3\2\2\2\u03bf\u03c0\3\2\2\2\u03c0\u00cc\3\2\2\2\u03c1\u03bf\3\2"+
		"\2\2\u03c2\u03c3\t\r\2\2\u03c3\u00ce\3\2\2\2\u03c4\u03c5\t\16\2\2\u03c5"+
		"\u00d0\3\2\2\2\u03c6\u03c7\t\17\2\2\u03c7\u00d2\3\2\2\2\u03c8\u03c9\t"+
		"\20\2\2\u03c9\u00d4\3\2\2\2\u03ca\u03db\7:\2\2\u03cb\u03cc\7\63\2\2\u03cc"+
		"\u03db\78\2\2\u03cd\u03ce\7\65\2\2\u03ce\u03db\7\64\2\2\u03cf\u03d0\7"+
		"8\2\2\u03d0\u03db\7\66\2\2\u03d1\u03d2\7\63\2\2\u03d2\u03d3\7\64\2\2\u03d3"+
		"\u03db\7:\2\2\u03d4\u03d5\7\64\2\2\u03d5\u03d6\7\67\2\2\u03d6\u03db\7"+
		"8\2\2\u03d7\u03d8\7\67\2\2\u03d8\u03d9\7\63\2\2\u03d9\u03db\7\64\2\2\u03da"+
		"\u03ca\3\2\2\2\u03da\u03cb\3\2\2\2\u03da\u03cd\3\2\2\2\u03da\u03cf\3\2"+
		"\2\2\u03da\u03d1\3\2\2\2\u03da\u03d4\3\2\2\2\u03da\u03d7\3\2\2\2\u03db"+
		"\u00d6\3\2\2\2\u03dc\u03dd\t\21\2\2\u03dd\u00d8\3\2\2\2/\2\u013c\u0145"+
		"\u0177\u017d\u018b\u019e\u01ae\u01b5\u01ba\u0304\u030c\u0314\u031c\u0321"+
		"\u0327\u032b\u0331\u0335\u0337\u033b\u0340\u0345\u034b\u034f\u0355\u0359"+
		"\u035b\u035f\u0364\u036c\u0373\u0375\u0379\u0382\u0388\u038a\u0392\u0399"+
		"\u03a5\u03b1\u03b8\u03bd\u03bf\u03da\t\3N\2\3O\3\3P\4\3Q\5\3R\6\3S\7\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
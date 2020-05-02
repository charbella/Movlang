// Generated from movlang.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class movlangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, REG=3, MEM=4, NUM=5, CONST=6, WS=7;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_regToReg = 2, RULE_regToMem = 3, 
		RULE_memToReg = 4, RULE_conToReg = 5, RULE_conToMem = 6;
	public static final String[] ruleNames = {
		"program", "statement", "regToReg", "regToMem", "memToReg", "conToReg", 
		"conToMem"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'mov'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "REG", "MEM", "NUM", "CONST", "WS"
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

	@Override
	public String getGrammarFileName() { return "movlang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public movlangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof movlangListener ) ((movlangListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof movlangListener ) ((movlangListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(14);
				statement();
				}
				}
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
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
		public RegToRegContext regToReg() {
			return getRuleContext(RegToRegContext.class,0);
		}
		public RegToMemContext regToMem() {
			return getRuleContext(RegToMemContext.class,0);
		}
		public MemToRegContext memToReg() {
			return getRuleContext(MemToRegContext.class,0);
		}
		public ConToRegContext conToReg() {
			return getRuleContext(ConToRegContext.class,0);
		}
		public ConToMemContext conToMem() {
			return getRuleContext(ConToMemContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof movlangListener ) ((movlangListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof movlangListener ) ((movlangListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(24);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(19);
				regToReg();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(20);
				regToMem();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(21);
				memToReg();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(22);
				conToReg();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(23);
				conToMem();
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

	public static class RegToRegContext extends ParserRuleContext {
		public List<TerminalNode> REG() { return getTokens(movlangParser.REG); }
		public TerminalNode REG(int i) {
			return getToken(movlangParser.REG, i);
		}
		public RegToRegContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regToReg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof movlangListener ) ((movlangListener)listener).enterRegToReg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof movlangListener ) ((movlangListener)listener).exitRegToReg(this);
		}
	}

	public final RegToRegContext regToReg() throws RecognitionException {
		RegToRegContext _localctx = new RegToRegContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_regToReg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(T__0);
			setState(27);
			match(REG);
			setState(28);
			match(T__1);
			setState(29);
			match(REG);
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

	public static class RegToMemContext extends ParserRuleContext {
		public TerminalNode MEM() { return getToken(movlangParser.MEM, 0); }
		public TerminalNode REG() { return getToken(movlangParser.REG, 0); }
		public RegToMemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regToMem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof movlangListener ) ((movlangListener)listener).enterRegToMem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof movlangListener ) ((movlangListener)listener).exitRegToMem(this);
		}
	}

	public final RegToMemContext regToMem() throws RecognitionException {
		RegToMemContext _localctx = new RegToMemContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_regToMem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(T__0);
			setState(32);
			match(MEM);
			setState(33);
			match(T__1);
			setState(34);
			match(REG);
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

	public static class MemToRegContext extends ParserRuleContext {
		public TerminalNode REG() { return getToken(movlangParser.REG, 0); }
		public TerminalNode MEM() { return getToken(movlangParser.MEM, 0); }
		public MemToRegContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memToReg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof movlangListener ) ((movlangListener)listener).enterMemToReg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof movlangListener ) ((movlangListener)listener).exitMemToReg(this);
		}
	}

	public final MemToRegContext memToReg() throws RecognitionException {
		MemToRegContext _localctx = new MemToRegContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_memToReg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(T__0);
			setState(37);
			match(REG);
			setState(38);
			match(T__1);
			setState(39);
			match(MEM);
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

	public static class ConToRegContext extends ParserRuleContext {
		public TerminalNode REG() { return getToken(movlangParser.REG, 0); }
		public TerminalNode CONST() { return getToken(movlangParser.CONST, 0); }
		public ConToRegContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conToReg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof movlangListener ) ((movlangListener)listener).enterConToReg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof movlangListener ) ((movlangListener)listener).exitConToReg(this);
		}
	}

	public final ConToRegContext conToReg() throws RecognitionException {
		ConToRegContext _localctx = new ConToRegContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_conToReg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(T__0);
			setState(42);
			match(REG);
			setState(43);
			match(T__1);
			setState(44);
			match(CONST);
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

	public static class ConToMemContext extends ParserRuleContext {
		public TerminalNode MEM() { return getToken(movlangParser.MEM, 0); }
		public TerminalNode CONST() { return getToken(movlangParser.CONST, 0); }
		public ConToMemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conToMem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof movlangListener ) ((movlangListener)listener).enterConToMem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof movlangListener ) ((movlangListener)listener).exitConToMem(this);
		}
	}

	public final ConToMemContext conToMem() throws RecognitionException {
		ConToMemContext _localctx = new ConToMemContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_conToMem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(T__0);
			setState(47);
			match(MEM);
			setState(48);
			match(T__1);
			setState(49);
			match(CONST);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\t\66\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\6\2\22\n\2\r\2\16\2\23"+
		"\3\3\3\3\3\3\3\3\3\3\5\3\33\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\2\2"+
		"\t\2\4\6\b\n\f\16\2\2\2\63\2\21\3\2\2\2\4\32\3\2\2\2\6\34\3\2\2\2\b!\3"+
		"\2\2\2\n&\3\2\2\2\f+\3\2\2\2\16\60\3\2\2\2\20\22\5\4\3\2\21\20\3\2\2\2"+
		"\22\23\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\3\3\2\2\2\25\33\5\6\4\2"+
		"\26\33\5\b\5\2\27\33\5\n\6\2\30\33\5\f\7\2\31\33\5\16\b\2\32\25\3\2\2"+
		"\2\32\26\3\2\2\2\32\27\3\2\2\2\32\30\3\2\2\2\32\31\3\2\2\2\33\5\3\2\2"+
		"\2\34\35\7\3\2\2\35\36\7\5\2\2\36\37\7\4\2\2\37 \7\5\2\2 \7\3\2\2\2!\""+
		"\7\3\2\2\"#\7\6\2\2#$\7\4\2\2$%\7\5\2\2%\t\3\2\2\2&\'\7\3\2\2\'(\7\5\2"+
		"\2()\7\4\2\2)*\7\6\2\2*\13\3\2\2\2+,\7\3\2\2,-\7\5\2\2-.\7\4\2\2./\7\b"+
		"\2\2/\r\3\2\2\2\60\61\7\3\2\2\61\62\7\6\2\2\62\63\7\4\2\2\63\64\7\b\2"+
		"\2\64\17\3\2\2\2\4\23\32";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
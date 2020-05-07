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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		REG=10, CONST=11, WS=12;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_regToReg = 2, RULE_regToMem = 3, 
		RULE_memToReg = 4, RULE_conToReg = 5, RULE_conToMem = 6, RULE_mem = 7, 
		RULE_address = 8;
	public static final String[] ruleNames = {
		"program", "statement", "regToReg", "regToMem", "memToReg", "conToReg", 
		"conToMem", "mem", "address"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'mov'", "','", "'['", "']'", "'BYTE PTR ['", "'WORD PTR ['", "'DWORD PTR ['", 
		"'+'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "REG", "CONST", 
		"WS"
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
			setState(19); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(18);
				statement();
				}
				}
				setState(21); 
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
			setState(28);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(23);
				regToReg();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(24);
				regToMem();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(25);
				memToReg();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(26);
				conToReg();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(27);
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
			setState(30);
			match(T__0);
			setState(31);
			match(REG);
			setState(32);
			match(T__1);
			setState(33);
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
		public MemContext mem() {
			return getRuleContext(MemContext.class,0);
		}
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
			setState(35);
			match(T__0);
			setState(36);
			mem();
			setState(37);
			match(T__1);
			setState(38);
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
		public MemContext mem() {
			return getRuleContext(MemContext.class,0);
		}
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
			setState(40);
			match(T__0);
			setState(41);
			match(REG);
			setState(42);
			match(T__1);
			setState(43);
			mem();
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
			setState(45);
			match(T__0);
			setState(46);
			match(REG);
			setState(47);
			match(T__1);
			setState(48);
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
		public MemContext mem() {
			return getRuleContext(MemContext.class,0);
		}
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
			setState(50);
			match(T__0);
			setState(51);
			mem();
			setState(52);
			match(T__1);
			setState(53);
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

	public static class MemContext extends ParserRuleContext {
		public AddressContext address() {
			return getRuleContext(AddressContext.class,0);
		}
		public MemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof movlangListener ) ((movlangListener)listener).enterMem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof movlangListener ) ((movlangListener)listener).exitMem(this);
		}
	}

	public final MemContext mem() throws RecognitionException {
		MemContext _localctx = new MemContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mem);
		try {
			setState(71);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				match(T__2);
				setState(56);
				address();
				setState(57);
				match(T__3);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				match(T__4);
				setState(60);
				address();
				setState(61);
				match(T__3);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				match(T__5);
				setState(64);
				address();
				setState(65);
				match(T__3);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(67);
				match(T__6);
				setState(68);
				address();
				setState(69);
				match(T__3);
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

	public static class AddressContext extends ParserRuleContext {
		public List<TerminalNode> REG() { return getTokens(movlangParser.REG); }
		public TerminalNode REG(int i) {
			return getToken(movlangParser.REG, i);
		}
		public TerminalNode CONST() { return getToken(movlangParser.CONST, 0); }
		public AddressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_address; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof movlangListener ) ((movlangListener)listener).enterAddress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof movlangListener ) ((movlangListener)listener).exitAddress(this);
		}
	}

	public final AddressContext address() throws RecognitionException {
		AddressContext _localctx = new AddressContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_address);
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(REG);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(REG);
				setState(75);
				match(T__7);
				setState(76);
				match(CONST);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				match(REG);
				setState(78);
				match(T__8);
				setState(79);
				match(CONST);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(80);
				match(REG);
				setState(81);
				match(T__7);
				setState(82);
				match(REG);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(83);
				match(REG);
				setState(84);
				match(T__8);
				setState(85);
				match(REG);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16[\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\6\2\26"+
		"\n\2\r\2\16\2\27\3\3\3\3\3\3\3\3\3\3\5\3\37\n\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\5\tJ\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nY\n"+
		"\n\3\n\2\2\13\2\4\6\b\n\f\16\20\22\2\2\2]\2\25\3\2\2\2\4\36\3\2\2\2\6"+
		" \3\2\2\2\b%\3\2\2\2\n*\3\2\2\2\f/\3\2\2\2\16\64\3\2\2\2\20I\3\2\2\2\22"+
		"X\3\2\2\2\24\26\5\4\3\2\25\24\3\2\2\2\26\27\3\2\2\2\27\25\3\2\2\2\27\30"+
		"\3\2\2\2\30\3\3\2\2\2\31\37\5\6\4\2\32\37\5\b\5\2\33\37\5\n\6\2\34\37"+
		"\5\f\7\2\35\37\5\16\b\2\36\31\3\2\2\2\36\32\3\2\2\2\36\33\3\2\2\2\36\34"+
		"\3\2\2\2\36\35\3\2\2\2\37\5\3\2\2\2 !\7\3\2\2!\"\7\f\2\2\"#\7\4\2\2#$"+
		"\7\f\2\2$\7\3\2\2\2%&\7\3\2\2&\'\5\20\t\2\'(\7\4\2\2()\7\f\2\2)\t\3\2"+
		"\2\2*+\7\3\2\2+,\7\f\2\2,-\7\4\2\2-.\5\20\t\2.\13\3\2\2\2/\60\7\3\2\2"+
		"\60\61\7\f\2\2\61\62\7\4\2\2\62\63\7\r\2\2\63\r\3\2\2\2\64\65\7\3\2\2"+
		"\65\66\5\20\t\2\66\67\7\4\2\2\678\7\r\2\28\17\3\2\2\29:\7\5\2\2:;\5\22"+
		"\n\2;<\7\6\2\2<J\3\2\2\2=>\7\7\2\2>?\5\22\n\2?@\7\6\2\2@J\3\2\2\2AB\7"+
		"\b\2\2BC\5\22\n\2CD\7\6\2\2DJ\3\2\2\2EF\7\t\2\2FG\5\22\n\2GH\7\6\2\2H"+
		"J\3\2\2\2I9\3\2\2\2I=\3\2\2\2IA\3\2\2\2IE\3\2\2\2J\21\3\2\2\2KY\7\f\2"+
		"\2LM\7\f\2\2MN\7\n\2\2NY\7\r\2\2OP\7\f\2\2PQ\7\13\2\2QY\7\r\2\2RS\7\f"+
		"\2\2ST\7\n\2\2TY\7\f\2\2UV\7\f\2\2VW\7\13\2\2WY\7\f\2\2XK\3\2\2\2XL\3"+
		"\2\2\2XO\3\2\2\2XR\3\2\2\2XU\3\2\2\2Y\23\3\2\2\2\6\27\36IX";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
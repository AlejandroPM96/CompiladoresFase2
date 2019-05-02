// Generated from C:/Users/yoa_a/Desktop/CompiladoresFase2\gramm.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class grammParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, QUANTITATIVE=9, 
		OBJECT=10, RELOP=11, STATUS=12, TIMEUNIT=13, LOGICALOPERATOR=14, STATUSUSER=15, 
		XML=16, SUBCHECK=17, INT=18, ID=19, WS=20, IP=21;
	public static final int
		RULE_corrule = 0, RULE_check = 1, RULE_query = 2, RULE_queryObject = 3, 
		RULE_cond = 4, RULE_mainCondition = 5, RULE_complement = 6, RULE_events = 7, 
		RULE_condition = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"corrule", "check", "query", "queryObject", "cond", "mainCondition", 
			"complement", "events", "condition"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'for'", "'Login Attempts from the Same Source'", "'of'", 
			"'is the ip address'", "'is'", "'events occur'", "'having'", null, null, 
			null, null, null, null, null, null, "'subcheck-Validation'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "QUANTITATIVE", 
			"OBJECT", "RELOP", "STATUS", "TIMEUNIT", "LOGICALOPERATOR", "STATUSUSER", 
			"XML", "SUBCHECK", "INT", "ID", "WS", "IP"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "gramm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public grammParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CorruleContext extends ParserRuleContext {
		public TerminalNode XML() { return getToken(grammParser.XML, 0); }
		public List<CheckContext> check() {
			return getRuleContexts(CheckContext.class);
		}
		public CheckContext check(int i) {
			return getRuleContext(CheckContext.class,i);
		}
		public List<QueryContext> query() {
			return getRuleContexts(QueryContext.class);
		}
		public QueryContext query(int i) {
			return getRuleContext(QueryContext.class,i);
		}
		public CorruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corrule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).enterCorrule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).exitCorrule(this);
		}
	}

	public final CorruleContext corrule() throws RecognitionException {
		CorruleContext _localctx = new CorruleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_corrule);
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
				check();
				}
				}
				setState(21); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(23);
			match(XML);
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(24);
				query();
				}
				}
				setState(29);
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

	public static class CheckContext extends ParserRuleContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public List<TerminalNode> LOGICALOPERATOR() { return getTokens(grammParser.LOGICALOPERATOR); }
		public TerminalNode LOGICALOPERATOR(int i) {
			return getToken(grammParser.LOGICALOPERATOR, i);
		}
		public List<ComplementContext> complement() {
			return getRuleContexts(ComplementContext.class);
		}
		public ComplementContext complement(int i) {
			return getRuleContext(ComplementContext.class,i);
		}
		public CheckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_check; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).enterCheck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).exitCheck(this);
		}
	}

	public final CheckContext check() throws RecognitionException {
		CheckContext _localctx = new CheckContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_check);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(T__0);
			setState(31);
			cond();
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICALOPERATOR) {
				{
				{
				setState(32);
				match(LOGICALOPERATOR);
				setState(33);
				match(T__0);
				setState(34);
				complement();
				}
				}
				setState(39);
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

	public static class QueryContext extends ParserRuleContext {
		public TerminalNode STATUS() { return getToken(grammParser.STATUS, 0); }
		public QueryObjectContext queryObject() {
			return getRuleContext(QueryObjectContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).exitQuery(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(T__1);
			setState(41);
			match(STATUS);
			setState(42);
			queryObject();
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

	public static class QueryObjectContext extends ParserRuleContext {
		public QueryObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).enterQueryObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).exitQueryObject(this);
		}
	}

	public final QueryObjectContext queryObject() throws RecognitionException {
		QueryObjectContext _localctx = new QueryObjectContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_queryObject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(T__2);
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

	public static class CondContext extends ParserRuleContext {
		public TerminalNode QUANTITATIVE() { return getToken(grammParser.QUANTITATIVE, 0); }
		public MainConditionContext mainCondition() {
			return getRuleContext(MainConditionContext.class,0);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).exitCond(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(QUANTITATIVE);
			setState(47);
			match(T__3);
			setState(48);
			mainCondition();
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

	public static class MainConditionContext extends ParserRuleContext {
		public TerminalNode SUBCHECK() { return getToken(grammParser.SUBCHECK, 0); }
		public TerminalNode STATUS() { return getToken(grammParser.STATUS, 0); }
		public MainConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).enterMainCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).exitMainCondition(this);
		}
	}

	public final MainConditionContext mainCondition() throws RecognitionException {
		MainConditionContext _localctx = new MainConditionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mainCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(SUBCHECK);
			setState(51);
			match(STATUS);
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

	public static class ComplementContext extends ParserRuleContext {
		public TerminalNode RELOP() { return getToken(grammParser.RELOP, 0); }
		public TerminalNode INT() { return getToken(grammParser.INT, 0); }
		public TerminalNode TIMEUNIT() { return getToken(grammParser.TIMEUNIT, 0); }
		public EventsContext events() {
			return getRuleContext(EventsContext.class,0);
		}
		public TerminalNode IP() { return getToken(grammParser.IP, 0); }
		public TerminalNode ID() { return getToken(grammParser.ID, 0); }
		public TerminalNode STATUSUSER() { return getToken(grammParser.STATUSUSER, 0); }
		public ComplementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).enterComplement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).exitComplement(this);
		}
	}

	public final ComplementContext complement() throws RecognitionException {
		ComplementContext _localctx = new ComplementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_complement);
		try {
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RELOP:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				match(RELOP);
				setState(54);
				match(INT);
				setState(55);
				match(TIMEUNIT);
				setState(56);
				events();
				}
				break;
			case IP:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				match(IP);
				setState(58);
				match(T__4);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				match(ID);
				setState(60);
				match(T__5);
				setState(61);
				match(STATUSUSER);
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

	public static class EventsContext extends ParserRuleContext {
		public TerminalNode RELOP() { return getToken(grammParser.RELOP, 0); }
		public TerminalNode INT() { return getToken(grammParser.INT, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public EventsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_events; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).enterEvents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).exitEvents(this);
		}
	}

	public final EventsContext events() throws RecognitionException {
		EventsContext _localctx = new EventsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_events);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(RELOP);
			setState(65);
			match(INT);
			setState(66);
			match(T__6);
			setState(68); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(67);
					condition();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(70); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode QUANTITATIVE() { return getToken(grammParser.QUANTITATIVE, 0); }
		public TerminalNode OBJECT() { return getToken(grammParser.OBJECT, 0); }
		public List<TerminalNode> LOGICALOPERATOR() { return getTokens(grammParser.LOGICALOPERATOR); }
		public TerminalNode LOGICALOPERATOR(int i) {
			return getToken(grammParser.LOGICALOPERATOR, i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammListener ) ((grammListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICALOPERATOR) {
				{
				{
				setState(72);
				match(LOGICALOPERATOR);
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(78);
			match(T__7);
			setState(79);
			match(QUANTITATIVE);
			setState(80);
			match(OBJECT);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27U\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\6\2\26"+
		"\n\2\r\2\16\2\27\3\2\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\3\3\3\3\3\3\3\3"+
		"\3\7\3&\n\3\f\3\16\3)\13\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bA\n\b\3\t\3\t\3\t\3\t"+
		"\6\tG\n\t\r\t\16\tH\3\n\7\nL\n\n\f\n\16\nO\13\n\3\n\3\n\3\n\3\n\3\n\2"+
		"\2\13\2\4\6\b\n\f\16\20\22\2\2\2R\2\25\3\2\2\2\4 \3\2\2\2\6*\3\2\2\2\b"+
		".\3\2\2\2\n\60\3\2\2\2\f\64\3\2\2\2\16@\3\2\2\2\20B\3\2\2\2\22M\3\2\2"+
		"\2\24\26\5\4\3\2\25\24\3\2\2\2\26\27\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2"+
		"\2\30\31\3\2\2\2\31\35\7\22\2\2\32\34\5\6\4\2\33\32\3\2\2\2\34\37\3\2"+
		"\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36\3\3\2\2\2\37\35\3\2\2\2 !\7\3\2\2"+
		"!\'\5\n\6\2\"#\7\20\2\2#$\7\3\2\2$&\5\16\b\2%\"\3\2\2\2&)\3\2\2\2\'%\3"+
		"\2\2\2\'(\3\2\2\2(\5\3\2\2\2)\'\3\2\2\2*+\7\4\2\2+,\7\16\2\2,-\5\b\5\2"+
		"-\7\3\2\2\2./\7\5\2\2/\t\3\2\2\2\60\61\7\13\2\2\61\62\7\6\2\2\62\63\5"+
		"\f\7\2\63\13\3\2\2\2\64\65\7\23\2\2\65\66\7\16\2\2\66\r\3\2\2\2\678\7"+
		"\r\2\289\7\24\2\29:\7\17\2\2:A\5\20\t\2;<\7\27\2\2<A\7\7\2\2=>\7\25\2"+
		"\2>?\7\b\2\2?A\7\21\2\2@\67\3\2\2\2@;\3\2\2\2@=\3\2\2\2A\17\3\2\2\2BC"+
		"\7\r\2\2CD\7\24\2\2DF\7\t\2\2EG\5\22\n\2FE\3\2\2\2GH\3\2\2\2HF\3\2\2\2"+
		"HI\3\2\2\2I\21\3\2\2\2JL\7\20\2\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2"+
		"\2\2NP\3\2\2\2OM\3\2\2\2PQ\7\n\2\2QR\7\13\2\2RS\7\f\2\2S\23\3\2\2\2\b"+
		"\27\35\'@HM";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
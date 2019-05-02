// Generated from /home/alejandro/Documents/Escuela/8vo/Compiladores/proyecto/gramm.g4 by ANTLR 4.7.1
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
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

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
	public static final String[] ruleNames = {
		"corrule", "check", "query", "queryObject", "cond", "mainCondition", "complement", 
		"events", "condition"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'if'", "'is the ip address'", "'is'", "'for'", "'Login Attempts from the Same Source'", 
		"'of'", "'events occur'", "'having'", null, null, null, null, null, null, 
		null, null, "'subcheck-Validation'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "QUANTITATIVE", 
		"OBJECT", "RELOP", "STATUS", "TIMEUNIT", "LOGICALOPERATOR", "STATUSUSER", 
		"XML", "SUBCHECK", "INT", "ID", "WS", "IP"
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
			while (_la==T__3) {
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
		public TerminalNode IP() { return getToken(grammParser.IP, 0); }
		public TerminalNode ID() { return getToken(grammParser.ID, 0); }
		public TerminalNode STATUSUSER() { return getToken(grammParser.STATUSUSER, 0); }
		public CheckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_check; }
	}

	public final CheckContext check() throws RecognitionException {
		CheckContext _localctx = new CheckContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_check);
		int _la;
		try {
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
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
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				match(T__0);
				setState(41);
				match(IP);
				setState(42);
				match(T__1);
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOGICALOPERATOR) {
					{
					{
					setState(43);
					match(LOGICALOPERATOR);
					setState(44);
					complement();
					}
					}
					setState(49);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				match(T__0);
				setState(51);
				match(ID);
				setState(52);
				match(T__2);
				setState(53);
				match(STATUSUSER);
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

	public static class QueryContext extends ParserRuleContext {
		public TerminalNode STATUS() { return getToken(grammParser.STATUS, 0); }
		public QueryObjectContext queryObject() {
			return getRuleContext(QueryObjectContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__3);
			setState(57);
			match(STATUS);
			setState(58);
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
	}

	public final QueryObjectContext queryObject() throws RecognitionException {
		QueryObjectContext _localctx = new QueryObjectContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_queryObject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__4);
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
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(QUANTITATIVE);
			setState(63);
			match(T__5);
			setState(64);
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
	}

	public final MainConditionContext mainCondition() throws RecognitionException {
		MainConditionContext _localctx = new MainConditionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mainCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(SUBCHECK);
			setState(67);
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
		public ComplementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complement; }
	}

	public final ComplementContext complement() throws RecognitionException {
		ComplementContext _localctx = new ComplementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_complement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(RELOP);
			setState(70);
			match(INT);
			setState(71);
			match(TIMEUNIT);
			setState(72);
			events();
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
	}

	public final EventsContext events() throws RecognitionException {
		EventsContext _localctx = new EventsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_events);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(RELOP);
			setState(75);
			match(INT);
			setState(76);
			match(T__6);
			setState(80);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(77);
					condition();
					}
					} 
				}
				setState(82);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOGICALOPERATOR) {
				{
				{
				setState(83);
				match(LOGICALOPERATOR);
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
			match(T__7);
			setState(90);
			match(QUANTITATIVE);
			setState(91);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27`\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\6\2\26"+
		"\n\2\r\2\16\2\27\3\2\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\3\3\3\3\3\3\3\3"+
		"\3\7\3&\n\3\f\3\16\3)\13\3\3\3\3\3\3\3\3\3\3\3\7\3\60\n\3\f\3\16\3\63"+
		"\13\3\3\3\3\3\3\3\3\3\5\39\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\7\tQ\n\t\f\t\16\tT\13"+
		"\t\3\n\7\nW\n\n\f\n\16\nZ\13\n\3\n\3\n\3\n\3\n\3\n\2\2\13\2\4\6\b\n\f"+
		"\16\20\22\2\2\2^\2\25\3\2\2\2\48\3\2\2\2\6:\3\2\2\2\b>\3\2\2\2\n@\3\2"+
		"\2\2\fD\3\2\2\2\16G\3\2\2\2\20L\3\2\2\2\22X\3\2\2\2\24\26\5\4\3\2\25\24"+
		"\3\2\2\2\26\27\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\31\3\2\2\2\31\35"+
		"\7\22\2\2\32\34\5\6\4\2\33\32\3\2\2\2\34\37\3\2\2\2\35\33\3\2\2\2\35\36"+
		"\3\2\2\2\36\3\3\2\2\2\37\35\3\2\2\2 !\7\3\2\2!\'\5\n\6\2\"#\7\20\2\2#"+
		"$\7\3\2\2$&\5\16\b\2%\"\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(9\3\2"+
		"\2\2)\'\3\2\2\2*+\7\3\2\2+,\7\27\2\2,\61\7\4\2\2-.\7\20\2\2.\60\5\16\b"+
		"\2/-\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\629\3\2\2\2\63\61"+
		"\3\2\2\2\64\65\7\3\2\2\65\66\7\25\2\2\66\67\7\5\2\2\679\7\21\2\28 \3\2"+
		"\2\28*\3\2\2\28\64\3\2\2\29\5\3\2\2\2:;\7\6\2\2;<\7\16\2\2<=\5\b\5\2="+
		"\7\3\2\2\2>?\7\7\2\2?\t\3\2\2\2@A\7\13\2\2AB\7\b\2\2BC\5\f\7\2C\13\3\2"+
		"\2\2DE\7\23\2\2EF\7\16\2\2F\r\3\2\2\2GH\7\r\2\2HI\7\24\2\2IJ\7\17\2\2"+
		"JK\5\20\t\2K\17\3\2\2\2LM\7\r\2\2MN\7\24\2\2NR\7\t\2\2OQ\5\22\n\2PO\3"+
		"\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\21\3\2\2\2TR\3\2\2\2UW\7\20\2\2"+
		"VU\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[\\\7\n\2"+
		"\2\\]\7\13\2\2]^\7\f\2\2^\23\3\2\2\2\t\27\35\'\618RX";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
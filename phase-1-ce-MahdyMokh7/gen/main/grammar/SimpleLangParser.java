// Generated from C:/Users/NoteBook/Desktop/programing/Compiler/Final Project/phase-1-ce-MahdyMokh7/src/main/grammar/SimpleLang.g4 by ANTLR 4.13.2
package main.grammar;

    import main.ast.nodes.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SimpleLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Break=1, Char=2, Const=3, Continue=4, Do=5, Double=6, Else=7, Float=8, 
		For=9, If=10, Int=11, Long=12, Return=13, Short=14, Signed=15, Sizeof=16, 
		Switch=17, Typedef=18, Unsigned=19, Void=20, While=21, Bool=22, LeftParen=23, 
		RightParen=24, LeftBracket=25, RightBracket=26, LeftBrace=27, RightBrace=28, 
		Less=29, LessEqual=30, Greater=31, GreaterEqual=32, LeftShift=33, RightShift=34, 
		Plus=35, PlusPlus=36, Minus=37, MinusMinus=38, Star=39, Div=40, Mod=41, 
		And=42, Or=43, AndAnd=44, OrOr=45, Xor=46, Not=47, Tilde=48, Question=49, 
		Colon=50, Semi=51, Comma=52, Assign=53, StarAssign=54, DivAssign=55, ModAssign=56, 
		PlusAssign=57, MinusAssign=58, LeftShiftAssign=59, RightShiftAssign=60, 
		AndAssign=61, XorAssign=62, OrAssign=63, Equal=64, NotEqual=65, Arrow=66, 
		Dot=67, Identifier=68, Constant=69, DigitSequence=70, StringLiteral=71, 
		MultiLineMacro=72, Directive=73, Whitespace=74, Newline=75, BlockComment=76, 
		LineComment=77;
	public static final int
		RULE_program = 0, RULE_translationUnit = 1, RULE_externalDeclaration = 2, 
		RULE_functionDefinition = 3, RULE_declarationList = 4, RULE_expression = 5, 
		RULE_argumentExpressionList = 6, RULE_unaryOperator = 7, RULE_castExpression = 8, 
		RULE_assignmentOperator = 9, RULE_declaration = 10, RULE_declarationSpecifiers = 11, 
		RULE_declarationSpecifier = 12, RULE_initDeclaratorList = 13, RULE_initDeclarator = 14, 
		RULE_typeSpecifier = 15, RULE_specifierQualifierList = 16, RULE_declarator = 17, 
		RULE_directDeclarator = 18, RULE_pointer = 19, RULE_parameterList = 20, 
		RULE_parameterDeclaration = 21, RULE_identifierList = 22, RULE_typeName = 23, 
		RULE_abstractDeclarator = 24, RULE_directAbstractDeclarator = 25, RULE_initializer = 26, 
		RULE_initializerList = 27, RULE_designation = 28, RULE_designator = 29, 
		RULE_statement = 30, RULE_compoundStatement = 31, RULE_blockItem = 32, 
		RULE_expressionStatement = 33, RULE_selectionStatement = 34, RULE_iterationStatement = 35, 
		RULE_forCondition = 36, RULE_forDeclaration = 37, RULE_forExpression = 38, 
		RULE_jumpStatement = 39;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "translationUnit", "externalDeclaration", "functionDefinition", 
			"declarationList", "expression", "argumentExpressionList", "unaryOperator", 
			"castExpression", "assignmentOperator", "declaration", "declarationSpecifiers", 
			"declarationSpecifier", "initDeclaratorList", "initDeclarator", "typeSpecifier", 
			"specifierQualifierList", "declarator", "directDeclarator", "pointer", 
			"parameterList", "parameterDeclaration", "identifierList", "typeName", 
			"abstractDeclarator", "directAbstractDeclarator", "initializer", "initializerList", 
			"designation", "designator", "statement", "compoundStatement", "blockItem", 
			"expressionStatement", "selectionStatement", "iterationStatement", "forCondition", 
			"forDeclaration", "forExpression", "jumpStatement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'break'", "'char'", "'const'", "'continue'", "'do'", "'double'", 
			"'else'", "'float'", "'for'", "'if'", "'int'", "'long'", "'return'", 
			"'short'", "'signed'", "'sizeof'", "'switch'", "'typedef'", "'unsigned'", 
			"'void'", "'while'", "'bool'", "'('", "')'", "'['", "']'", "'{'", "'}'", 
			"'<'", "'<='", "'>'", "'>='", "'<<'", "'>>'", "'+'", "'++'", "'-'", "'--'", 
			"'*'", "'/'", "'%'", "'&'", "'|'", "'&&'", "'||'", "'^'", "'!'", "'~'", 
			"'?'", "':'", "';'", "','", "'='", "'*='", "'/='", "'%='", "'+='", "'-='", 
			"'<<='", "'>>='", "'&='", "'^='", "'|='", "'=='", "'!='", "'->'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Break", "Char", "Const", "Continue", "Do", "Double", "Else", "Float", 
			"For", "If", "Int", "Long", "Return", "Short", "Signed", "Sizeof", "Switch", 
			"Typedef", "Unsigned", "Void", "While", "Bool", "LeftParen", "RightParen", 
			"LeftBracket", "RightBracket", "LeftBrace", "RightBrace", "Less", "LessEqual", 
			"Greater", "GreaterEqual", "LeftShift", "RightShift", "Plus", "PlusPlus", 
			"Minus", "MinusMinus", "Star", "Div", "Mod", "And", "Or", "AndAnd", "OrOr", 
			"Xor", "Not", "Tilde", "Question", "Colon", "Semi", "Comma", "Assign", 
			"StarAssign", "DivAssign", "ModAssign", "PlusAssign", "MinusAssign", 
			"LeftShiftAssign", "RightShiftAssign", "AndAssign", "XorAssign", "OrAssign", 
			"Equal", "NotEqual", "Arrow", "Dot", "Identifier", "Constant", "DigitSequence", 
			"StringLiteral", "MultiLineMacro", "Directive", "Whitespace", "Newline", 
			"BlockComment", "LineComment"
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
	public String getGrammarFileName() { return "SimpleLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SimpleLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public Program programRet;
		public TranslationUnitContext t;
		public TerminalNode EOF() { return getToken(SimpleLangParser.EOF, 0); }
		public TranslationUnitContext translationUnit() {
			return getRuleContext(TranslationUnitContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((ProgramContext)_localctx).programRet =  new Program(); 
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2252349583972684L) != 0) || _la==Identifier) {
				{
				setState(81);
				((ProgramContext)_localctx).t = translationUnit();

				        _localctx.programRet.setTranslationUnit(((ProgramContext)_localctx).t.translationUnitRet);
				        _localctx.programRet.setLine(((ProgramContext)_localctx).t.translationUnitRet.getLine());
				    
				}
			}

			setState(86);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TranslationUnitContext extends ParserRuleContext {
		public TranslationUnit translationUnitRet;
		public ExternalDeclarationContext ext;
		public List<ExternalDeclarationContext> externalDeclaration() {
			return getRuleContexts(ExternalDeclarationContext.class);
		}
		public ExternalDeclarationContext externalDeclaration(int i) {
			return getRuleContext(ExternalDeclarationContext.class,i);
		}
		public TranslationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterTranslationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitTranslationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitTranslationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TranslationUnitContext translationUnit() throws RecognitionException {
		TranslationUnitContext _localctx = new TranslationUnitContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_translationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((TranslationUnitContext)_localctx).translationUnitRet =  new TranslationUnit(); 
			setState(92); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(89);
				((TranslationUnitContext)_localctx).ext = externalDeclaration();

				        _localctx.translationUnitRet.addExternalDeclaration(((TranslationUnitContext)_localctx).ext.externalDeclarationRet);
				        if (_localctx.translationUnitRet.getLine() == 0)
				            _localctx.translationUnitRet.setLine(((TranslationUnitContext)_localctx).ext.externalDeclarationRet.getLine());
				    
				}
				}
				setState(94); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2252349583972684L) != 0) || _la==Identifier );
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExternalDeclarationContext extends ParserRuleContext {
		public ExternalDeclaration externalDeclarationRet;
		public FunctionDefinitionContext f;
		public DeclarationContext d;
		public Token Semi;
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode Semi() { return getToken(SimpleLangParser.Semi, 0); }
		public ExternalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterExternalDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitExternalDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitExternalDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExternalDeclarationContext externalDeclaration() throws RecognitionException {
		ExternalDeclarationContext _localctx = new ExternalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_externalDeclaration);
		try {
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(96);
				((ExternalDeclarationContext)_localctx).f = functionDefinition();

				        ((ExternalDeclarationContext)_localctx).externalDeclarationRet =  ((ExternalDeclarationContext)_localctx).f.functionDefinitionRet;
				        _localctx.externalDeclarationRet.setLine(((ExternalDeclarationContext)_localctx).f.functionDefinitionRet.getLine());
				    
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(99);
				((ExternalDeclarationContext)_localctx).d = declaration();

				        ((ExternalDeclarationContext)_localctx).externalDeclarationRet =  ((ExternalDeclarationContext)_localctx).d.declarationRet;
				        _localctx.externalDeclarationRet.setLine(((ExternalDeclarationContext)_localctx).d.declarationRet.getLine());
				    
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
				((ExternalDeclarationContext)_localctx).Semi = match(Semi);

				        ((ExternalDeclarationContext)_localctx).externalDeclarationRet =  new StraySemicolonNode();
				        _localctx.externalDeclarationRet.setLine((((ExternalDeclarationContext)_localctx).Semi!=null?((ExternalDeclarationContext)_localctx).Semi.getLine():0));
				    
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDefinitionContext extends ParserRuleContext {
		public FunctionDefinition functionDefinitionRet;
		public DeclarationSpecifiersContext ds;
		public DeclaratorContext d;
		public DeclarationListContext dl;
		public CompoundStatementContext cs;
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_functionDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((FunctionDefinitionContext)_localctx).functionDefinitionRet =  new FunctionDefinition(); 
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(107);
				((FunctionDefinitionContext)_localctx).ds = declarationSpecifiers();

				        _localctx.functionDefinitionRet.setDeclarationSpecifiers(((FunctionDefinitionContext)_localctx).ds.declarationSpecifiersRet);
				    
				}
				break;
			}
			{
			setState(112);
			((FunctionDefinitionContext)_localctx).d = declarator();

			        _localctx.functionDefinitionRet.setDeclarator(((FunctionDefinitionContext)_localctx).d.declaratorRet);
			        _localctx.functionDefinitionRet.setLine(((FunctionDefinitionContext)_localctx).d.declaratorRet.getLine());
			    
			}
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6084940L) != 0) || _la==Identifier) {
				{
				setState(115);
				((FunctionDefinitionContext)_localctx).dl = declarationList();

				        _localctx.functionDefinitionRet.setDeclarationList(((FunctionDefinitionContext)_localctx).dl.declarationListRet);
				    
				}
			}

			{
			setState(120);
			((FunctionDefinitionContext)_localctx).cs = compoundStatement();

			        _localctx.functionDefinitionRet.setCompoundStatement(((FunctionDefinitionContext)_localctx).cs.compoundStatementRet);
			    
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationListContext extends ParserRuleContext {
		public DeclarationList declarationListRet;
		public DeclarationContext d;
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public DeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitDeclarationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationListContext declarationList() throws RecognitionException {
		DeclarationListContext _localctx = new DeclarationListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((DeclarationListContext)_localctx).declarationListRet =  new DeclarationList(); 
			setState(127); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(124);
				((DeclarationListContext)_localctx).d = declaration();

				        _localctx.declarationListRet.addDeclaration(((DeclarationListContext)_localctx).d.declarationRet);
				        if (_localctx.declarationListRet.getLine() == 0)
				            _localctx.declarationListRet.setLine(((DeclarationListContext)_localctx).d.declarationRet.getLine());
				    
				}
				}
				setState(129); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 6084940L) != 0) || _la==Identifier );
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Expression expressionRet;
		public ExpressionContext arr;
		public ExpressionContext func;
		public ExpressionContext operand;
		public ExpressionContext left;
		public ExpressionContext condition;
		public ExpressionContext firstexp;
		public Token id;
		public Token c;
		public Token s;
		public ExpressionContext e;
		public TypeNameContext t;
		public InitializerListContext i;
		public Token op;
		public Token cons;
		public UnaryOperatorContext u;
		public CastExpressionContext cex;
		public CastExpressionContext cexpr;
		public ExpressionContext right;
		public ExpressionContext ifTrue;
		public ExpressionContext ifFalse;
		public AssignmentOperatorContext oppp;
		public ExpressionContext index;
		public ArgumentExpressionListContext a;
		public ExpressionContext expression;
		public List<ExpressionContext> rest = new ArrayList<ExpressionContext>();
		public TerminalNode Identifier() { return getToken(SimpleLangParser.Identifier, 0); }
		public TerminalNode Constant() { return getToken(SimpleLangParser.Constant, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(SimpleLangParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(SimpleLangParser.StringLiteral, i);
		}
		public TerminalNode LeftParen() { return getToken(SimpleLangParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(SimpleLangParser.RightParen, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LeftBrace() { return getToken(SimpleLangParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(SimpleLangParser.RightBrace, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public List<TerminalNode> Comma() { return getTokens(SimpleLangParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SimpleLangParser.Comma, i);
		}
		public List<TerminalNode> Sizeof() { return getTokens(SimpleLangParser.Sizeof); }
		public TerminalNode Sizeof(int i) {
			return getToken(SimpleLangParser.Sizeof, i);
		}
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public List<TerminalNode> PlusPlus() { return getTokens(SimpleLangParser.PlusPlus); }
		public TerminalNode PlusPlus(int i) {
			return getToken(SimpleLangParser.PlusPlus, i);
		}
		public List<TerminalNode> MinusMinus() { return getTokens(SimpleLangParser.MinusMinus); }
		public TerminalNode MinusMinus(int i) {
			return getToken(SimpleLangParser.MinusMinus, i);
		}
		public TerminalNode Star() { return getToken(SimpleLangParser.Star, 0); }
		public TerminalNode Div() { return getToken(SimpleLangParser.Div, 0); }
		public TerminalNode Mod() { return getToken(SimpleLangParser.Mod, 0); }
		public TerminalNode Plus() { return getToken(SimpleLangParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(SimpleLangParser.Minus, 0); }
		public TerminalNode LeftShift() { return getToken(SimpleLangParser.LeftShift, 0); }
		public TerminalNode RightShift() { return getToken(SimpleLangParser.RightShift, 0); }
		public TerminalNode Less() { return getToken(SimpleLangParser.Less, 0); }
		public TerminalNode Greater() { return getToken(SimpleLangParser.Greater, 0); }
		public TerminalNode LessEqual() { return getToken(SimpleLangParser.LessEqual, 0); }
		public TerminalNode GreaterEqual() { return getToken(SimpleLangParser.GreaterEqual, 0); }
		public TerminalNode Equal() { return getToken(SimpleLangParser.Equal, 0); }
		public TerminalNode NotEqual() { return getToken(SimpleLangParser.NotEqual, 0); }
		public TerminalNode And() { return getToken(SimpleLangParser.And, 0); }
		public TerminalNode Xor() { return getToken(SimpleLangParser.Xor, 0); }
		public TerminalNode Or() { return getToken(SimpleLangParser.Or, 0); }
		public TerminalNode AndAnd() { return getToken(SimpleLangParser.AndAnd, 0); }
		public TerminalNode OrOr() { return getToken(SimpleLangParser.OrOr, 0); }
		public TerminalNode Question() { return getToken(SimpleLangParser.Question, 0); }
		public TerminalNode Colon() { return getToken(SimpleLangParser.Colon, 0); }
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(SimpleLangParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(SimpleLangParser.RightBracket, 0); }
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitExpression(this);
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				{
				setState(132);
				((ExpressionContext)_localctx).id = match(Identifier);

				      ((ExpressionContext)_localctx).expressionRet =  new Identifier(((ExpressionContext)_localctx).id.getText());
				      _localctx.expressionRet.setLine((((ExpressionContext)_localctx).id!=null?((ExpressionContext)_localctx).id.getLine():0));
				    
				}
				}
				break;
			case 2:
				{
				{
				setState(134);
				((ExpressionContext)_localctx).c = match(Constant);

				      ((ExpressionContext)_localctx).expressionRet =  new ConstantExpression(((ExpressionContext)_localctx).c.getText());
				      _localctx.expressionRet.setLine((((ExpressionContext)_localctx).c!=null?((ExpressionContext)_localctx).c.getLine():0));
				    
				}
				}
				break;
			case 3:
				{
				 ((ExpressionContext)_localctx).expressionRet =  new StringLiteralExpression(); 
				setState(139); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(137);
						((ExpressionContext)_localctx).s = match(StringLiteral);

						      ((StringLiteralExpression)_localctx.expressionRet).addPart(((ExpressionContext)_localctx).s.getText());
						      _localctx.expressionRet.setLine((((ExpressionContext)_localctx).s!=null?((ExpressionContext)_localctx).s.getLine():0));
						    
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(141); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 4:
				{
				setState(143);
				match(LeftParen);
				{
				setState(144);
				((ExpressionContext)_localctx).e = expression(0);

				        ((ExpressionContext)_localctx).expressionRet =  ((ExpressionContext)_localctx).e.expressionRet;
				        _localctx.expressionRet.setLine(((ExpressionContext)_localctx).e.expressionRet.getLine());
				    
				}
				setState(147);
				match(RightParen);
				}
				break;
			case 5:
				{
				setState(149);
				match(LeftParen);
				setState(150);
				((ExpressionContext)_localctx).t = typeName();
				setState(151);
				match(RightParen);
				setState(152);
				match(LeftBrace);
				setState(153);
				((ExpressionContext)_localctx).i = initializerList();
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(154);
					match(Comma);
					}
				}

				setState(157);
				match(RightBrace);

				      ((ExpressionContext)_localctx).expressionRet =  new CompoundLiteralExpression(((ExpressionContext)_localctx).t.typeNameRet, ((ExpressionContext)_localctx).i.initializerListRet);
				      _localctx.expressionRet.setLine(((ExpressionContext)_localctx).t.typeNameRet.getLine());
				    
				}
				break;
			case 6:
				{
				 ((ExpressionContext)_localctx).expressionRet =  new UnaryPrefixExpression(); 
				setState(165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(161);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 343597449216L) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}

						         ((UnaryPrefixExpression) _localctx.expressionRet).addOperator(((ExpressionContext)_localctx).op.getText());
						         if (_localctx.expressionRet.getLine() == 0) _localctx.expressionRet.setLine((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getLine():0));
						     
						}
						} 
					}
					setState(167);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				setState(206);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(168);
					((ExpressionContext)_localctx).id = match(Identifier);

					           ((UnaryPrefixExpression) _localctx.expressionRet).setOperand(new Identifier(((ExpressionContext)_localctx).id.getText()));
					           if (_localctx.expressionRet.getLine() == 0) _localctx.expressionRet.setLine((((ExpressionContext)_localctx).id!=null?((ExpressionContext)_localctx).id.getLine():0));
					       
					}
					break;
				case 2:
					{
					setState(170);
					((ExpressionContext)_localctx).cons = match(Constant);

					           ((UnaryPrefixExpression) _localctx.expressionRet).setOperand(new ConstantExpression(((ExpressionContext)_localctx).cons.getText()));
					           if (_localctx.expressionRet.getLine() == 0) _localctx.expressionRet.setLine((((ExpressionContext)_localctx).cons!=null?((ExpressionContext)_localctx).cons.getLine():0));
					       
					}
					break;
				case 3:
					{
					 StringLiteralExpression sle = new StringLiteralExpression(); 
					setState(175); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(173);
							((ExpressionContext)_localctx).s = match(StringLiteral);
							 sle.addPart(((ExpressionContext)_localctx).s.getText()); 
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(177); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );

					           ((UnaryPrefixExpression) _localctx.expressionRet).setOperand(sle);
					           _localctx.expressionRet.setLine((((ExpressionContext)_localctx).s!=null?((ExpressionContext)_localctx).s.getLine():0)); // from first matched string literal
					       
					}
					break;
				case 4:
					{
					setState(180);
					match(LeftParen);
					setState(181);
					((ExpressionContext)_localctx).e = expression(0);
					setState(182);
					match(RightParen);

					           ((UnaryPrefixExpression) _localctx.expressionRet).setOperand(((ExpressionContext)_localctx).e.expressionRet);
					           if (_localctx.expressionRet.getLine() == 0) _localctx.expressionRet.setLine(((ExpressionContext)_localctx).e.expressionRet.getLine());
					       
					}
					break;
				case 5:
					{
					setState(185);
					match(LeftParen);
					setState(186);
					((ExpressionContext)_localctx).t = typeName();
					setState(187);
					match(RightParen);
					setState(188);
					match(LeftBrace);
					setState(189);
					((ExpressionContext)_localctx).i = initializerList();
					setState(191);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(190);
						match(Comma);
						}
					}

					setState(193);
					match(RightBrace);

					           ((UnaryPrefixExpression) _localctx.expressionRet).setOperand(
					               new CompoundLiteralExpression(((ExpressionContext)_localctx).t.typeNameRet, ((ExpressionContext)_localctx).i.initializerListRet)
					           );
					           if (_localctx.expressionRet.getLine() == 0) _localctx.expressionRet.setLine(((ExpressionContext)_localctx).t.typeNameRet.getLine());
					       
					}
					break;
				case 6:
					{
					setState(196);
					((ExpressionContext)_localctx).u = unaryOperator();
					setState(197);
					((ExpressionContext)_localctx).cex = castExpression();

					           UnaryOperatorCastExpression uoce = new UnaryOperatorCastExpression(((ExpressionContext)_localctx).u.unaryOperatorRet, ((ExpressionContext)_localctx).cex.castExpressionRet);
					           uoce.setLine(((ExpressionContext)_localctx).u.unaryOperatorRet.getLine());
					           ((UnaryPrefixExpression) _localctx.expressionRet).setOperand(uoce);
					           if (_localctx.expressionRet.getLine() == 0) _localctx.expressionRet.setLine(uoce.getLine()); // optional fallback
					       
					}
					break;
				case 7:
					{
					setState(200);
					match(Sizeof);
					setState(201);
					match(LeftParen);
					setState(202);
					((ExpressionContext)_localctx).t = typeName();
					setState(203);
					match(RightParen);

					           ((UnaryPrefixExpression) _localctx.expressionRet).setOperand(new SizeofTypeExpression(((ExpressionContext)_localctx).t.typeNameRet));
					           if (_localctx.expressionRet.getLine() == 0) _localctx.expressionRet.setLine(((ExpressionContext)_localctx).t.typeNameRet.getLine());
					       
					}
					break;
				}
				}
				break;
			case 7:
				{
				setState(208);
				match(LeftParen);
				setState(209);
				((ExpressionContext)_localctx).t = typeName();
				setState(210);
				match(RightParen);
				setState(211);
				((ExpressionContext)_localctx).cexpr = castExpression();

				        TypedCast typed = new TypedCast();
				        typed.setType(((ExpressionContext)_localctx).t.typeNameRet);
				        typed.setCastExpression(((ExpressionContext)_localctx).cexpr.castExpressionRet);
				        typed.setLine(((ExpressionContext)_localctx).t.typeNameRet.getLine());
				        ((ExpressionContext)_localctx).expressionRet =  typed;
				    
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(310);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(308);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(216);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(217);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3848290697216L) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(218);
						((ExpressionContext)_localctx).right = expression(14);

						                BinaryExpression bin = new BinaryExpression();
						                bin.setLeft(((ExpressionContext)_localctx).left.expressionRet);
						                bin.setOperator(((ExpressionContext)_localctx).op.getText());
						                bin.setRight(((ExpressionContext)_localctx).right.expressionRet);
						                bin.setLine((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getLine():0));
						                ((ExpressionContext)_localctx).expressionRet =  bin;
						              
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(221);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(222);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Plus || _la==Minus) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(223);
						((ExpressionContext)_localctx).right = expression(13);

						                  BinaryExpression bin = new BinaryExpression();
						                  bin.setLeft(((ExpressionContext)_localctx).left.expressionRet);
						                  bin.setOperator(((ExpressionContext)_localctx).op.getText());
						                  bin.setRight(((ExpressionContext)_localctx).right.expressionRet);
						                  bin.setLine((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getLine():0));
						                  ((ExpressionContext)_localctx).expressionRet =  bin;
						                
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(226);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(227);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==LeftShift || _la==RightShift) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(228);
						((ExpressionContext)_localctx).right = expression(12);

						                  BinaryExpression bin = new BinaryExpression();
						                  bin.setLeft(((ExpressionContext)_localctx).left.expressionRet);
						                  bin.setOperator(((ExpressionContext)_localctx).op.getText());
						                  bin.setRight(((ExpressionContext)_localctx).right.expressionRet);
						                  bin.setLine((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getLine():0));
						                  ((ExpressionContext)_localctx).expressionRet =  bin;
						                
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(231);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(232);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8053063680L) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(233);
						((ExpressionContext)_localctx).right = expression(11);

						                BinaryExpression bin = new BinaryExpression();
						                bin.setLeft(((ExpressionContext)_localctx).left.expressionRet);
						                bin.setOperator(((ExpressionContext)_localctx).op.getText());
						                bin.setRight(((ExpressionContext)_localctx).right.expressionRet);
						                bin.setLine((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getLine():0));
						                ((ExpressionContext)_localctx).expressionRet =  bin;
						              
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(236);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(237);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Equal || _la==NotEqual) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(238);
						((ExpressionContext)_localctx).right = expression(10);

						                BinaryExpression bin = new BinaryExpression();
						                bin.setLeft(((ExpressionContext)_localctx).left.expressionRet);
						                bin.setOperator(((ExpressionContext)_localctx).op.getText());
						                bin.setRight(((ExpressionContext)_localctx).right.expressionRet);
						                bin.setLine((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getLine():0));
						                ((ExpressionContext)_localctx).expressionRet =  bin;
						              
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(241);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(242);
						((ExpressionContext)_localctx).op = match(And);
						setState(243);
						((ExpressionContext)_localctx).right = expression(9);

						                BinaryExpression bin = new BinaryExpression();
						                bin.setLeft(((ExpressionContext)_localctx).left.expressionRet);
						                bin.setOperator(((ExpressionContext)_localctx).op.getText());
						                bin.setRight(((ExpressionContext)_localctx).right.expressionRet);
						                bin.setLine((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getLine():0));
						                ((ExpressionContext)_localctx).expressionRet =  bin;
						              
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(246);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(247);
						((ExpressionContext)_localctx).op = match(Xor);
						setState(248);
						((ExpressionContext)_localctx).right = expression(8);

						                BinaryExpression bin = new BinaryExpression(); // Bitwise XOR
						                bin.setLeft(((ExpressionContext)_localctx).left.expressionRet);
						                bin.setOperator(((ExpressionContext)_localctx).op.getText());
						                bin.setRight(((ExpressionContext)_localctx).right.expressionRet);
						                bin.setLine((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getLine():0));
						                ((ExpressionContext)_localctx).expressionRet =  bin;
						              
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(251);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(252);
						((ExpressionContext)_localctx).op = match(Or);
						setState(253);
						((ExpressionContext)_localctx).right = expression(7);

						                BinaryExpression bin = new BinaryExpression(); // Bitwise OR
						                bin.setLeft(((ExpressionContext)_localctx).left.expressionRet);
						                bin.setOperator(((ExpressionContext)_localctx).op.getText());
						                bin.setRight(((ExpressionContext)_localctx).right.expressionRet);
						                bin.setLine((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getLine():0));
						                ((ExpressionContext)_localctx).expressionRet =  bin;
						              
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(256);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(257);
						((ExpressionContext)_localctx).op = match(AndAnd);
						setState(258);
						((ExpressionContext)_localctx).right = expression(6);

						                BinaryExpression bin = new BinaryExpression(); // Logical AND
						                bin.setLeft(((ExpressionContext)_localctx).left.expressionRet);
						                bin.setOperator(((ExpressionContext)_localctx).op.getText());
						                bin.setRight(((ExpressionContext)_localctx).right.expressionRet);
						                bin.setLine((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getLine():0));
						                ((ExpressionContext)_localctx).expressionRet =  bin;
						              
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(261);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(262);
						((ExpressionContext)_localctx).op = match(OrOr);
						setState(263);
						((ExpressionContext)_localctx).right = expression(5);

						                BinaryExpression bin = new BinaryExpression(); // Logical OR
						                bin.setLeft(((ExpressionContext)_localctx).left.expressionRet);
						                bin.setOperator(((ExpressionContext)_localctx).op.getText());
						                bin.setRight(((ExpressionContext)_localctx).right.expressionRet);
						                bin.setLine((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getLine():0));
						                ((ExpressionContext)_localctx).expressionRet =  bin;
						              
						}
						break;
					case 11:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.condition = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(266);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(267);
						match(Question);
						setState(268);
						((ExpressionContext)_localctx).ifTrue = expression(0);
						setState(269);
						match(Colon);
						setState(270);
						((ExpressionContext)_localctx).ifFalse = expression(4);

						                  ConditionalExpression cond = new ConditionalExpression();
						                  cond.setCondition(((ExpressionContext)_localctx).condition.expressionRet);
						                  cond.setIfTrue(((ExpressionContext)_localctx).ifTrue.expressionRet);
						                  cond.setIfFalse(((ExpressionContext)_localctx).ifFalse.expressionRet);
						                  cond.setLine(((ExpressionContext)_localctx).condition.expressionRet.getLine());
						                  ((ExpressionContext)_localctx).expressionRet =  cond;
						                
						}
						break;
					case 12:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(273);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(274);
						((ExpressionContext)_localctx).oppp = assignmentOperator();
						setState(275);
						((ExpressionContext)_localctx).right = expression(3);

						                  AssignmentExpression assign = new AssignmentExpression();
						                  assign.setLeft(((ExpressionContext)_localctx).left.expressionRet);
						                  assign.setOperator(((ExpressionContext)_localctx).oppp.assignmentOperatorRet);
						                  assign.setRight(((ExpressionContext)_localctx).right.expressionRet);
						                  assign.setLine((((ExpressionContext)_localctx).oppp!=null?(((ExpressionContext)_localctx).oppp.start):null).getLine());
						                  ((ExpressionContext)_localctx).expressionRet =  assign;
						                
						}
						break;
					case 13:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.arr = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(278);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(279);
						match(LeftBracket);
						setState(280);
						((ExpressionContext)_localctx).index = expression(0);
						setState(281);
						match(RightBracket);

						                ((ExpressionContext)_localctx).expressionRet =  new ArrayAccessExpression(((ExpressionContext)_localctx).arr.expressionRet, ((ExpressionContext)_localctx).index.expressionRet);
						                _localctx.expressionRet.setLine(((ExpressionContext)_localctx).arr.expressionRet.getLine());
						              
						}
						break;
					case 14:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.func = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(284);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(285);
						match(LeftParen);
						setState(289);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & 49539602426888321L) != 0)) {
							{
							setState(286);
							((ExpressionContext)_localctx).a = argumentExpressionList();

							                ((ExpressionContext)_localctx).expressionRet =  new FunctionCallExpression();
							                ((FunctionCallExpression) _localctx.expressionRet).setFunction(((ExpressionContext)_localctx).func.expressionRet);
							                ((FunctionCallExpression) _localctx.expressionRet).setArguments(((ExpressionContext)_localctx).a.argumentExpressionListRet);
							                _localctx.expressionRet.setLine(((ExpressionContext)_localctx).func.expressionRet.getLine());
							              
							}
						}

						setState(291);
						match(RightParen);

						                if (_localctx.expressionRet == null) {
						                  FunctionCallExpression call = new FunctionCallExpression();
						                  call.setFunction(((ExpressionContext)_localctx).func.expressionRet);
						                  call.setArguments(null);
						                  call.setLine(((ExpressionContext)_localctx).func.expressionRet.getLine());
						                  ((ExpressionContext)_localctx).expressionRet =  call;
						                }
						              
						}
						break;
					case 15:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.operand = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(293);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(294);
						((ExpressionContext)_localctx).op = match(PlusPlus);

						                UnaryPostfixExpression postfix = new UnaryPostfixExpression();
						                postfix.setOperand(((ExpressionContext)_localctx).operand.expressionRet);
						                postfix.setOperator(((ExpressionContext)_localctx).op.getText());
						                postfix.setLine((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getLine():0));
						                ((ExpressionContext)_localctx).expressionRet =  postfix;
						              
						}
						break;
					case 16:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.operand = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(296);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(297);
						((ExpressionContext)_localctx).op = match(MinusMinus);

						                UnaryPostfixExpression postfix = new UnaryPostfixExpression();
						                postfix.setOperand(((ExpressionContext)_localctx).operand.expressionRet);
						                postfix.setOperator(((ExpressionContext)_localctx).op.getText());
						                postfix.setLine((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getLine():0));
						                ((ExpressionContext)_localctx).expressionRet =  postfix;
						              
						}
						break;
					case 17:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.firstexp = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(299);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(302); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(300);
								match(Comma);
								setState(301);
								((ExpressionContext)_localctx).expression = expression(0);
								((ExpressionContext)_localctx).rest.add(((ExpressionContext)_localctx).expression);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(304); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );

						                  CommaExpression comma = new CommaExpression();
						                  comma.addExpression(((ExpressionContext)_localctx).firstexp.expressionRet);
						                  for (ExpressionContext exprCtx : ((ExpressionContext)_localctx).rest)
						                      comma.addExpression(exprCtx.expressionRet);
						                  comma.setLine(((ExpressionContext)_localctx).firstexp.expressionRet.getLine());
						                  ((ExpressionContext)_localctx).expressionRet =  comma;
						                
						}
						break;
					}
					} 
				}
				setState(312);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentExpressionListContext extends ParserRuleContext {
		public ArgumentExpressionList argumentExpressionListRet;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SimpleLangParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SimpleLangParser.Comma, i);
		}
		public ArgumentExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentExpressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterArgumentExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitArgumentExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitArgumentExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentExpressionListContext argumentExpressionList() throws RecognitionException {
		ArgumentExpressionListContext _localctx = new ArgumentExpressionListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_argumentExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((ArgumentExpressionListContext)_localctx).argumentExpressionListRet =  new ArgumentExpressionList(); 
			setState(314);
			((ArgumentExpressionListContext)_localctx).e1 = expression(0);

			      _localctx.argumentExpressionListRet.setFirst(((ArgumentExpressionListContext)_localctx).e1.expressionRet);
			      _localctx.argumentExpressionListRet.setLine(((ArgumentExpressionListContext)_localctx).e1.expressionRet.getLine());
			    
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(316);
				match(Comma);
				setState(317);
				((ArgumentExpressionListContext)_localctx).e2 = expression(0);

				      _localctx.argumentExpressionListRet.addRest(((ArgumentExpressionListContext)_localctx).e2.expressionRet);
				    
				}
				}
				setState(324);
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

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryOperatorContext extends ParserRuleContext {
		public UnaryOperator unaryOperatorRet;
		public Token And;
		public Token Star;
		public Token Plus;
		public Token Minus;
		public Token Tilde;
		public Token Not;
		public TerminalNode And() { return getToken(SimpleLangParser.And, 0); }
		public TerminalNode Star() { return getToken(SimpleLangParser.Star, 0); }
		public TerminalNode Plus() { return getToken(SimpleLangParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(SimpleLangParser.Minus, 0); }
		public TerminalNode Tilde() { return getToken(SimpleLangParser.Tilde, 0); }
		public TerminalNode Not() { return getToken(SimpleLangParser.Not, 0); }
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitUnaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_unaryOperator);
		try {
			setState(343);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case And:
				enterOuterAlt(_localctx, 1);
				{
				 ((UnaryOperatorContext)_localctx).unaryOperatorRet =  new UnaryOperator(); 
				{
				setState(326);
				((UnaryOperatorContext)_localctx).And = match(And);
				 _localctx.unaryOperatorRet.setOperator(((UnaryOperatorContext)_localctx).And.getText()); _localctx.unaryOperatorRet.setLine((((UnaryOperatorContext)_localctx).And!=null?((UnaryOperatorContext)_localctx).And.getLine():0)); 
				}
				}
				break;
			case Star:
				enterOuterAlt(_localctx, 2);
				{
				 ((UnaryOperatorContext)_localctx).unaryOperatorRet =  new UnaryOperator(); 
				{
				setState(329);
				((UnaryOperatorContext)_localctx).Star = match(Star);
				 _localctx.unaryOperatorRet.setOperator(((UnaryOperatorContext)_localctx).Star.getText()); _localctx.unaryOperatorRet.setLine((((UnaryOperatorContext)_localctx).Star!=null?((UnaryOperatorContext)_localctx).Star.getLine():0)); 
				}
				}
				break;
			case Plus:
				enterOuterAlt(_localctx, 3);
				{
				 ((UnaryOperatorContext)_localctx).unaryOperatorRet =  new UnaryOperator(); 
				{
				setState(332);
				((UnaryOperatorContext)_localctx).Plus = match(Plus);
				 _localctx.unaryOperatorRet.setOperator(((UnaryOperatorContext)_localctx).Plus.getText()); _localctx.unaryOperatorRet.setLine((((UnaryOperatorContext)_localctx).Plus!=null?((UnaryOperatorContext)_localctx).Plus.getLine():0)); 
				}
				}
				break;
			case Minus:
				enterOuterAlt(_localctx, 4);
				{
				 ((UnaryOperatorContext)_localctx).unaryOperatorRet =  new UnaryOperator(); 
				{
				setState(335);
				((UnaryOperatorContext)_localctx).Minus = match(Minus);
				 _localctx.unaryOperatorRet.setOperator(((UnaryOperatorContext)_localctx).Minus.getText()); _localctx.unaryOperatorRet.setLine((((UnaryOperatorContext)_localctx).Minus!=null?((UnaryOperatorContext)_localctx).Minus.getLine():0)); 
				}
				}
				break;
			case Tilde:
				enterOuterAlt(_localctx, 5);
				{
				 ((UnaryOperatorContext)_localctx).unaryOperatorRet =  new UnaryOperator(); 
				{
				setState(338);
				((UnaryOperatorContext)_localctx).Tilde = match(Tilde);
				 _localctx.unaryOperatorRet.setOperator(((UnaryOperatorContext)_localctx).Tilde.getText()); _localctx.unaryOperatorRet.setLine((((UnaryOperatorContext)_localctx).Tilde!=null?((UnaryOperatorContext)_localctx).Tilde.getLine():0)); 
				}
				}
				break;
			case Not:
				enterOuterAlt(_localctx, 6);
				{
				 ((UnaryOperatorContext)_localctx).unaryOperatorRet =  new UnaryOperator(); 
				{
				setState(341);
				((UnaryOperatorContext)_localctx).Not = match(Not);
				 _localctx.unaryOperatorRet.setOperator(((UnaryOperatorContext)_localctx).Not.getText()); _localctx.unaryOperatorRet.setLine((((UnaryOperatorContext)_localctx).Not!=null?((UnaryOperatorContext)_localctx).Not.getLine():0)); 
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class CastExpressionContext extends ParserRuleContext {
		public CastExpression castExpressionRet;
		public TypeNameContext t;
		public CastExpressionContext c;
		public ExpressionContext e;
		public Token d;
		public TerminalNode LeftParen() { return getToken(SimpleLangParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(SimpleLangParser.RightParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DigitSequence() { return getToken(SimpleLangParser.DigitSequence, 0); }
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitCastExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_castExpression);
		try {
			setState(356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				match(LeftParen);
				setState(346);
				((CastExpressionContext)_localctx).t = typeName();
				setState(347);
				match(RightParen);
				setState(348);
				((CastExpressionContext)_localctx).c = castExpression();

				      ((CastExpressionContext)_localctx).castExpressionRet =  new TypedCastExpression(((CastExpressionContext)_localctx).t.typeNameRet, ((CastExpressionContext)_localctx).c.castExpressionRet);
				      _localctx.castExpressionRet.setLine(((CastExpressionContext)_localctx).t.typeNameRet.getLine());
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(351);
				((CastExpressionContext)_localctx).e = expression(0);

				      ((CastExpressionContext)_localctx).castExpressionRet =  ((CastExpressionContext)_localctx).e.expressionRet;
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(354);
				((CastExpressionContext)_localctx).d = match(DigitSequence);

				      ((CastExpressionContext)_localctx).castExpressionRet =  new DigitSequenceCast(((CastExpressionContext)_localctx).d.getText());
				      _localctx.castExpressionRet.setLine((((CastExpressionContext)_localctx).d!=null?((CastExpressionContext)_localctx).d.getLine():0));
				    
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentOperatorContext extends ParserRuleContext {
		public AssignmentOperator assignmentOperatorRet;
		public Token Assign;
		public Token StarAssign;
		public Token DivAssign;
		public Token ModAssign;
		public Token PlusAssign;
		public Token MinusAssign;
		public Token LeftShiftAssign;
		public Token RightShiftAssign;
		public Token AndAssign;
		public Token XorAssign;
		public Token OrAssign;
		public TerminalNode Assign() { return getToken(SimpleLangParser.Assign, 0); }
		public TerminalNode StarAssign() { return getToken(SimpleLangParser.StarAssign, 0); }
		public TerminalNode DivAssign() { return getToken(SimpleLangParser.DivAssign, 0); }
		public TerminalNode ModAssign() { return getToken(SimpleLangParser.ModAssign, 0); }
		public TerminalNode PlusAssign() { return getToken(SimpleLangParser.PlusAssign, 0); }
		public TerminalNode MinusAssign() { return getToken(SimpleLangParser.MinusAssign, 0); }
		public TerminalNode LeftShiftAssign() { return getToken(SimpleLangParser.LeftShiftAssign, 0); }
		public TerminalNode RightShiftAssign() { return getToken(SimpleLangParser.RightShiftAssign, 0); }
		public TerminalNode AndAssign() { return getToken(SimpleLangParser.AndAssign, 0); }
		public TerminalNode XorAssign() { return getToken(SimpleLangParser.XorAssign, 0); }
		public TerminalNode OrAssign() { return getToken(SimpleLangParser.OrAssign, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitAssignmentOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignmentOperator);
		try {
			setState(380);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Assign:
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				((AssignmentOperatorContext)_localctx).Assign = match(Assign);
				 ((AssignmentOperatorContext)_localctx).assignmentOperatorRet =  new AssignmentOperator(((AssignmentOperatorContext)_localctx).Assign.getText()); _localctx.assignmentOperatorRet.setLine((((AssignmentOperatorContext)_localctx).Assign!=null?((AssignmentOperatorContext)_localctx).Assign.getLine():0)); 
				}
				break;
			case StarAssign:
				enterOuterAlt(_localctx, 2);
				{
				setState(360);
				((AssignmentOperatorContext)_localctx).StarAssign = match(StarAssign);
				 ((AssignmentOperatorContext)_localctx).assignmentOperatorRet =  new AssignmentOperator(((AssignmentOperatorContext)_localctx).StarAssign.getText()); _localctx.assignmentOperatorRet.setLine((((AssignmentOperatorContext)_localctx).StarAssign!=null?((AssignmentOperatorContext)_localctx).StarAssign.getLine():0)); 
				}
				break;
			case DivAssign:
				enterOuterAlt(_localctx, 3);
				{
				setState(362);
				((AssignmentOperatorContext)_localctx).DivAssign = match(DivAssign);
				 ((AssignmentOperatorContext)_localctx).assignmentOperatorRet =  new AssignmentOperator(((AssignmentOperatorContext)_localctx).DivAssign.getText()); _localctx.assignmentOperatorRet.setLine((((AssignmentOperatorContext)_localctx).DivAssign!=null?((AssignmentOperatorContext)_localctx).DivAssign.getLine():0)); 
				}
				break;
			case ModAssign:
				enterOuterAlt(_localctx, 4);
				{
				setState(364);
				((AssignmentOperatorContext)_localctx).ModAssign = match(ModAssign);
				 ((AssignmentOperatorContext)_localctx).assignmentOperatorRet =  new AssignmentOperator(((AssignmentOperatorContext)_localctx).ModAssign.getText()); _localctx.assignmentOperatorRet.setLine((((AssignmentOperatorContext)_localctx).ModAssign!=null?((AssignmentOperatorContext)_localctx).ModAssign.getLine():0)); 
				}
				break;
			case PlusAssign:
				enterOuterAlt(_localctx, 5);
				{
				setState(366);
				((AssignmentOperatorContext)_localctx).PlusAssign = match(PlusAssign);
				 ((AssignmentOperatorContext)_localctx).assignmentOperatorRet =  new AssignmentOperator(((AssignmentOperatorContext)_localctx).PlusAssign.getText()); _localctx.assignmentOperatorRet.setLine((((AssignmentOperatorContext)_localctx).PlusAssign!=null?((AssignmentOperatorContext)_localctx).PlusAssign.getLine():0)); 
				}
				break;
			case MinusAssign:
				enterOuterAlt(_localctx, 6);
				{
				setState(368);
				((AssignmentOperatorContext)_localctx).MinusAssign = match(MinusAssign);
				 ((AssignmentOperatorContext)_localctx).assignmentOperatorRet =  new AssignmentOperator(((AssignmentOperatorContext)_localctx).MinusAssign.getText()); _localctx.assignmentOperatorRet.setLine((((AssignmentOperatorContext)_localctx).MinusAssign!=null?((AssignmentOperatorContext)_localctx).MinusAssign.getLine():0)); 
				}
				break;
			case LeftShiftAssign:
				enterOuterAlt(_localctx, 7);
				{
				setState(370);
				((AssignmentOperatorContext)_localctx).LeftShiftAssign = match(LeftShiftAssign);
				 ((AssignmentOperatorContext)_localctx).assignmentOperatorRet =  new AssignmentOperator(((AssignmentOperatorContext)_localctx).LeftShiftAssign.getText()); _localctx.assignmentOperatorRet.setLine((((AssignmentOperatorContext)_localctx).LeftShiftAssign!=null?((AssignmentOperatorContext)_localctx).LeftShiftAssign.getLine():0)); 
				}
				break;
			case RightShiftAssign:
				enterOuterAlt(_localctx, 8);
				{
				setState(372);
				((AssignmentOperatorContext)_localctx).RightShiftAssign = match(RightShiftAssign);
				 ((AssignmentOperatorContext)_localctx).assignmentOperatorRet =  new AssignmentOperator(((AssignmentOperatorContext)_localctx).RightShiftAssign.getText()); _localctx.assignmentOperatorRet.setLine((((AssignmentOperatorContext)_localctx).RightShiftAssign!=null?((AssignmentOperatorContext)_localctx).RightShiftAssign.getLine():0)); 
				}
				break;
			case AndAssign:
				enterOuterAlt(_localctx, 9);
				{
				setState(374);
				((AssignmentOperatorContext)_localctx).AndAssign = match(AndAssign);
				 ((AssignmentOperatorContext)_localctx).assignmentOperatorRet =  new AssignmentOperator(((AssignmentOperatorContext)_localctx).AndAssign.getText()); _localctx.assignmentOperatorRet.setLine((((AssignmentOperatorContext)_localctx).AndAssign!=null?((AssignmentOperatorContext)_localctx).AndAssign.getLine():0)); 
				}
				break;
			case XorAssign:
				enterOuterAlt(_localctx, 10);
				{
				setState(376);
				((AssignmentOperatorContext)_localctx).XorAssign = match(XorAssign);
				 ((AssignmentOperatorContext)_localctx).assignmentOperatorRet =  new AssignmentOperator(((AssignmentOperatorContext)_localctx).XorAssign.getText()); _localctx.assignmentOperatorRet.setLine((((AssignmentOperatorContext)_localctx).XorAssign!=null?((AssignmentOperatorContext)_localctx).XorAssign.getLine():0)); 
				}
				break;
			case OrAssign:
				enterOuterAlt(_localctx, 11);
				{
				setState(378);
				((AssignmentOperatorContext)_localctx).OrAssign = match(OrAssign);
				 ((AssignmentOperatorContext)_localctx).assignmentOperatorRet =  new AssignmentOperator(((AssignmentOperatorContext)_localctx).OrAssign.getText()); _localctx.assignmentOperatorRet.setLine((((AssignmentOperatorContext)_localctx).OrAssign!=null?((AssignmentOperatorContext)_localctx).OrAssign.getLine():0)); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public Declaration declarationRet;
		public DeclarationSpecifiersContext ds;
		public InitDeclaratorListContext idl;
		public TerminalNode Semi() { return getToken(SimpleLangParser.Semi, 0); }
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			((DeclarationContext)_localctx).ds = declarationSpecifiers();
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & 35184372154369L) != 0)) {
				{
				setState(383);
				((DeclarationContext)_localctx).idl = initDeclaratorList();
				 ((DeclarationContext)_localctx).declarationRet =  new Declaration(((DeclarationContext)_localctx).ds.declarationSpecifiersRet, ((DeclarationContext)_localctx).idl.initDeclaratorListRet); 
				}
			}

			setState(388);
			match(Semi);

			      if (_localctx.declarationRet == null)
			        ((DeclarationContext)_localctx).declarationRet =  new Declaration(((DeclarationContext)_localctx).ds.declarationSpecifiersRet, null);
			      _localctx.declarationRet.setLine(((DeclarationContext)_localctx).ds.declarationSpecifiersRet.getLine());
			    
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationSpecifiersContext extends ParserRuleContext {
		public DeclarationSpecifiers declarationSpecifiersRet;
		public DeclarationSpecifierContext first;
		public DeclarationSpecifierContext declarationSpecifier;
		public List<DeclarationSpecifierContext> rest = new ArrayList<DeclarationSpecifierContext>();
		public List<DeclarationSpecifierContext> declarationSpecifier() {
			return getRuleContexts(DeclarationSpecifierContext.class);
		}
		public DeclarationSpecifierContext declarationSpecifier(int i) {
			return getRuleContext(DeclarationSpecifierContext.class,i);
		}
		public DeclarationSpecifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterDeclarationSpecifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitDeclarationSpecifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitDeclarationSpecifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationSpecifiersContext declarationSpecifiers() throws RecognitionException {
		DeclarationSpecifiersContext _localctx = new DeclarationSpecifiersContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declarationSpecifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			((DeclarationSpecifiersContext)_localctx).first = declarationSpecifier();
			setState(395);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(392);
					((DeclarationSpecifiersContext)_localctx).declarationSpecifier = declarationSpecifier();
					((DeclarationSpecifiersContext)_localctx).rest.add(((DeclarationSpecifiersContext)_localctx).declarationSpecifier);
					}
					} 
				}
				setState(397);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}

			    DeclarationSpecifiers specs = new DeclarationSpecifiers();
			    specs.addSpecifier(((DeclarationSpecifiersContext)_localctx).first.declarationSpecifierRet);
			    for (DeclarationSpecifierContext r : ((DeclarationSpecifiersContext)_localctx).rest)
			        specs.addSpecifier(r.declarationSpecifierRet);
			    specs.setLine(((DeclarationSpecifiersContext)_localctx).first.declarationSpecifierRet.getLine());
			    ((DeclarationSpecifiersContext)_localctx).declarationSpecifiersRet =  specs;
			  
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationSpecifierContext extends ParserRuleContext {
		public DeclarationSpecifier declarationSpecifierRet;
		public Token t;
		public Token c;
		public TypeSpecifierContext ts;
		public TerminalNode Typedef() { return getToken(SimpleLangParser.Typedef, 0); }
		public TerminalNode Const() { return getToken(SimpleLangParser.Const, 0); }
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public DeclarationSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterDeclarationSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitDeclarationSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitDeclarationSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationSpecifierContext declarationSpecifier() throws RecognitionException {
		DeclarationSpecifierContext _localctx = new DeclarationSpecifierContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declarationSpecifier);
		try {
			setState(407);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Typedef:
				enterOuterAlt(_localctx, 1);
				{
				setState(400);
				((DeclarationSpecifierContext)_localctx).t = match(Typedef);
				 ((DeclarationSpecifierContext)_localctx).declarationSpecifierRet =  new KeywordSpecifier(((DeclarationSpecifierContext)_localctx).t.getText()); _localctx.declarationSpecifierRet.setLine((((DeclarationSpecifierContext)_localctx).t!=null?((DeclarationSpecifierContext)_localctx).t.getLine():0)); 
				}
				break;
			case Const:
				enterOuterAlt(_localctx, 2);
				{
				setState(402);
				((DeclarationSpecifierContext)_localctx).c = match(Const);
				 ((DeclarationSpecifierContext)_localctx).declarationSpecifierRet =  new KeywordSpecifier(((DeclarationSpecifierContext)_localctx).c.getText()); _localctx.declarationSpecifierRet.setLine((((DeclarationSpecifierContext)_localctx).c!=null?((DeclarationSpecifierContext)_localctx).c.getLine():0)); 
				}
				break;
			case Char:
			case Double:
			case Float:
			case Int:
			case Long:
			case Short:
			case Signed:
			case Unsigned:
			case Void:
			case Bool:
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(404);
				((DeclarationSpecifierContext)_localctx).ts = typeSpecifier();
				 ((DeclarationSpecifierContext)_localctx).declarationSpecifierRet =  ((DeclarationSpecifierContext)_localctx).ts.typeSpecifierRet; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class InitDeclaratorListContext extends ParserRuleContext {
		public InitDeclaratorList initDeclaratorListRet;
		public InitDeclaratorContext firstini;
		public InitDeclaratorContext initDeclarator;
		public List<InitDeclaratorContext> rest = new ArrayList<InitDeclaratorContext>();
		public List<InitDeclaratorContext> initDeclarator() {
			return getRuleContexts(InitDeclaratorContext.class);
		}
		public InitDeclaratorContext initDeclarator(int i) {
			return getRuleContext(InitDeclaratorContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SimpleLangParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SimpleLangParser.Comma, i);
		}
		public InitDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterInitDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitInitDeclaratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitInitDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitDeclaratorListContext initDeclaratorList() throws RecognitionException {
		InitDeclaratorListContext _localctx = new InitDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_initDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			((InitDeclaratorListContext)_localctx).firstini = initDeclarator();
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(410);
				match(Comma);
				setState(411);
				((InitDeclaratorListContext)_localctx).initDeclarator = initDeclarator();
				((InitDeclaratorListContext)_localctx).rest.add(((InitDeclaratorListContext)_localctx).initDeclarator);
				}
				}
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			    InitDeclaratorList list = new InitDeclaratorList();
			    list.addInitDeclarator(((InitDeclaratorListContext)_localctx).firstini.initDeclaratorRet);
			    for (InitDeclaratorContext i : ((InitDeclaratorListContext)_localctx).rest)
			        list.addInitDeclarator(i.initDeclaratorRet);
			    list.setLine(((InitDeclaratorListContext)_localctx).firstini.initDeclaratorRet.getLine());
			    ((InitDeclaratorListContext)_localctx).initDeclaratorListRet =  list;
			  
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

	@SuppressWarnings("CheckReturnValue")
	public static class InitDeclaratorContext extends ParserRuleContext {
		public InitDeclarator initDeclaratorRet;
		public DeclaratorContext d;
		public InitializerContext i;
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode Assign() { return getToken(SimpleLangParser.Assign, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public InitDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterInitDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitInitDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitInitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitDeclaratorContext initDeclarator() throws RecognitionException {
		InitDeclaratorContext _localctx = new InitDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_initDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			((InitDeclaratorContext)_localctx).d = declarator();
			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(420);
				match(Assign);
				setState(421);
				((InitDeclaratorContext)_localctx).i = initializer();

				      ((InitDeclaratorContext)_localctx).initDeclaratorRet =  new InitDeclarator(((InitDeclaratorContext)_localctx).d.declaratorRet, ((InitDeclaratorContext)_localctx).i.initializerRet);
				      _localctx.initDeclaratorRet.setLine(((InitDeclaratorContext)_localctx).d.declaratorRet.getLine());
				    
				}
			}


			    if (_localctx.initDeclaratorRet == null) {
			      ((InitDeclaratorContext)_localctx).initDeclaratorRet =  new InitDeclarator(((InitDeclaratorContext)_localctx).d.declaratorRet, null);
			      _localctx.initDeclaratorRet.setLine(((InitDeclaratorContext)_localctx).d.declaratorRet.getLine());
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeSpecifierContext extends ParserRuleContext {
		public TypeSpecifier typeSpecifierRet;
		public Token Void;
		public Token Char;
		public Token Short;
		public Token Int;
		public Token Long;
		public Token Float;
		public Token Double;
		public Token Signed;
		public Token Unsigned;
		public Token Bool;
		public Token id;
		public TerminalNode Void() { return getToken(SimpleLangParser.Void, 0); }
		public TerminalNode Char() { return getToken(SimpleLangParser.Char, 0); }
		public TerminalNode Short() { return getToken(SimpleLangParser.Short, 0); }
		public TerminalNode Int() { return getToken(SimpleLangParser.Int, 0); }
		public TerminalNode Long() { return getToken(SimpleLangParser.Long, 0); }
		public TerminalNode Float() { return getToken(SimpleLangParser.Float, 0); }
		public TerminalNode Double() { return getToken(SimpleLangParser.Double, 0); }
		public TerminalNode Signed() { return getToken(SimpleLangParser.Signed, 0); }
		public TerminalNode Unsigned() { return getToken(SimpleLangParser.Unsigned, 0); }
		public TerminalNode Bool() { return getToken(SimpleLangParser.Bool, 0); }
		public TerminalNode Identifier() { return getToken(SimpleLangParser.Identifier, 0); }
		public TypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_typeSpecifier);
		try {
			setState(450);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Void:
				enterOuterAlt(_localctx, 1);
				{
				setState(428);
				((TypeSpecifierContext)_localctx).Void = match(Void);
				 ((TypeSpecifierContext)_localctx).typeSpecifierRet =  new VoidType(); _localctx.typeSpecifierRet.setLine((((TypeSpecifierContext)_localctx).Void!=null?((TypeSpecifierContext)_localctx).Void.getLine():0)); 
				}
				break;
			case Char:
				enterOuterAlt(_localctx, 2);
				{
				setState(430);
				((TypeSpecifierContext)_localctx).Char = match(Char);
				 ((TypeSpecifierContext)_localctx).typeSpecifierRet =  new CharType(); _localctx.typeSpecifierRet.setLine((((TypeSpecifierContext)_localctx).Char!=null?((TypeSpecifierContext)_localctx).Char.getLine():0)); 
				}
				break;
			case Short:
				enterOuterAlt(_localctx, 3);
				{
				setState(432);
				((TypeSpecifierContext)_localctx).Short = match(Short);
				 ((TypeSpecifierContext)_localctx).typeSpecifierRet =  new ShortType(); _localctx.typeSpecifierRet.setLine((((TypeSpecifierContext)_localctx).Short!=null?((TypeSpecifierContext)_localctx).Short.getLine():0)); 
				}
				break;
			case Int:
				enterOuterAlt(_localctx, 4);
				{
				setState(434);
				((TypeSpecifierContext)_localctx).Int = match(Int);
				 ((TypeSpecifierContext)_localctx).typeSpecifierRet =  new IntType(); _localctx.typeSpecifierRet.setLine((((TypeSpecifierContext)_localctx).Int!=null?((TypeSpecifierContext)_localctx).Int.getLine():0)); 
				}
				break;
			case Long:
				enterOuterAlt(_localctx, 5);
				{
				setState(436);
				((TypeSpecifierContext)_localctx).Long = match(Long);
				 ((TypeSpecifierContext)_localctx).typeSpecifierRet =  new LongType(); _localctx.typeSpecifierRet.setLine((((TypeSpecifierContext)_localctx).Long!=null?((TypeSpecifierContext)_localctx).Long.getLine():0)); 
				}
				break;
			case Float:
				enterOuterAlt(_localctx, 6);
				{
				setState(438);
				((TypeSpecifierContext)_localctx).Float = match(Float);
				 ((TypeSpecifierContext)_localctx).typeSpecifierRet =  new FloatType(); _localctx.typeSpecifierRet.setLine((((TypeSpecifierContext)_localctx).Float!=null?((TypeSpecifierContext)_localctx).Float.getLine():0)); 
				}
				break;
			case Double:
				enterOuterAlt(_localctx, 7);
				{
				setState(440);
				((TypeSpecifierContext)_localctx).Double = match(Double);
				 ((TypeSpecifierContext)_localctx).typeSpecifierRet =  new DoubleType(); _localctx.typeSpecifierRet.setLine((((TypeSpecifierContext)_localctx).Double!=null?((TypeSpecifierContext)_localctx).Double.getLine():0)); 
				}
				break;
			case Signed:
				enterOuterAlt(_localctx, 8);
				{
				setState(442);
				((TypeSpecifierContext)_localctx).Signed = match(Signed);
				 ((TypeSpecifierContext)_localctx).typeSpecifierRet =  new SignedType(); _localctx.typeSpecifierRet.setLine((((TypeSpecifierContext)_localctx).Signed!=null?((TypeSpecifierContext)_localctx).Signed.getLine():0)); 
				}
				break;
			case Unsigned:
				enterOuterAlt(_localctx, 9);
				{
				setState(444);
				((TypeSpecifierContext)_localctx).Unsigned = match(Unsigned);
				 ((TypeSpecifierContext)_localctx).typeSpecifierRet =  new UnsignedType(); _localctx.typeSpecifierRet.setLine((((TypeSpecifierContext)_localctx).Unsigned!=null?((TypeSpecifierContext)_localctx).Unsigned.getLine():0)); 
				}
				break;
			case Bool:
				enterOuterAlt(_localctx, 10);
				{
				setState(446);
				((TypeSpecifierContext)_localctx).Bool = match(Bool);
				 ((TypeSpecifierContext)_localctx).typeSpecifierRet =  new BoolType(); _localctx.typeSpecifierRet.setLine((((TypeSpecifierContext)_localctx).Bool!=null?((TypeSpecifierContext)_localctx).Bool.getLine():0)); 
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 11);
				{
				setState(448);
				((TypeSpecifierContext)_localctx).id = match(Identifier);
				 ((TypeSpecifierContext)_localctx).typeSpecifierRet =  new Identifier(((TypeSpecifierContext)_localctx).id.getText()); _localctx.typeSpecifierRet.setLine((((TypeSpecifierContext)_localctx).id!=null?((TypeSpecifierContext)_localctx).id.getLine():0)); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class SpecifierQualifierListContext extends ParserRuleContext {
		public SpecifierQualifierList specifierQualifierListRet;
		public TypeSpecifierContext ts;
		public Token c;
		public SpecifierQualifierListContext rest;
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TerminalNode Const() { return getToken(SimpleLangParser.Const, 0); }
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public SpecifierQualifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specifierQualifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterSpecifierQualifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitSpecifierQualifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitSpecifierQualifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecifierQualifierListContext specifierQualifierList() throws RecognitionException {
		SpecifierQualifierListContext _localctx = new SpecifierQualifierListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_specifierQualifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Char:
			case Double:
			case Float:
			case Int:
			case Long:
			case Short:
			case Signed:
			case Unsigned:
			case Void:
			case Bool:
			case Identifier:
				{
				setState(452);
				((SpecifierQualifierListContext)_localctx).ts = typeSpecifier();

				        ((SpecifierQualifierListContext)_localctx).specifierQualifierListRet =  new SpecifierQualifierList();
				        _localctx.specifierQualifierListRet.addSpecifier(((SpecifierQualifierListContext)_localctx).ts.typeSpecifierRet);
				        _localctx.specifierQualifierListRet.setLine(((SpecifierQualifierListContext)_localctx).ts.typeSpecifierRet.getLine());
				    
				}
				break;
			case Const:
				{
				setState(455);
				((SpecifierQualifierListContext)_localctx).c = match(Const);

				        ((SpecifierQualifierListContext)_localctx).specifierQualifierListRet =  new SpecifierQualifierList();
				        KeywordSpecifier ks = new KeywordSpecifier(((SpecifierQualifierListContext)_localctx).c.getText());
				        ks.setLine((((SpecifierQualifierListContext)_localctx).c!=null?((SpecifierQualifierListContext)_localctx).c.getLine():0));
				        _localctx.specifierQualifierListRet.addSpecifier(ks);
				        _localctx.specifierQualifierListRet.setLine((((SpecifierQualifierListContext)_localctx).c!=null?((SpecifierQualifierListContext)_localctx).c.getLine():0));
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5822796L) != 0) || _la==Identifier) {
				{
				setState(459);
				((SpecifierQualifierListContext)_localctx).rest = specifierQualifierList();

				        _localctx.specifierQualifierListRet.addAll(((SpecifierQualifierListContext)_localctx).rest.specifierQualifierListRet);
				    
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaratorContext extends ParserRuleContext {
		public Declarator declaratorRet;
		public PointerContext p;
		public DirectDeclaratorContext ddir;
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Star) {
				{
				setState(464);
				((DeclaratorContext)_localctx).p = pointer();

				        Declarator d = new Declarator();
				        d.setPointer(((DeclaratorContext)_localctx).p.pointerRet);
				        d.setLine(((DeclaratorContext)_localctx).p.pointerRet.getLine());
				        ((DeclaratorContext)_localctx).declaratorRet =  d;
				    
				}
			}

			setState(469);
			((DeclaratorContext)_localctx).ddir = directDeclarator(0);

			    if (_localctx.declaratorRet == null) {
			      ((DeclaratorContext)_localctx).declaratorRet =  new Declarator();
			      _localctx.declaratorRet.setLine(((DeclaratorContext)_localctx).ddir.directDeclaratorRet.getLine());
			    }
			    _localctx.declaratorRet.setDirectDeclarator(((DeclaratorContext)_localctx).ddir.directDeclaratorRet);
			  
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

	@SuppressWarnings("CheckReturnValue")
	public static class DirectDeclaratorContext extends ParserRuleContext {
		public DirectDeclarator directDeclaratorRet;
		public DirectDeclaratorContext base;
		public Token id;
		public DeclaratorContext d;
		public ExpressionContext e;
		public ParameterListContext plist;
		public IdentifierListContext idlist;
		public TerminalNode Identifier() { return getToken(SimpleLangParser.Identifier, 0); }
		public TerminalNode LeftParen() { return getToken(SimpleLangParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(SimpleLangParser.RightParen, 0); }
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(SimpleLangParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(SimpleLangParser.RightBracket, 0); }
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public DirectDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterDirectDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitDirectDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitDirectDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectDeclaratorContext directDeclarator() throws RecognitionException {
		return directDeclarator(0);
	}

	private DirectDeclaratorContext directDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DirectDeclaratorContext _localctx = new DirectDeclaratorContext(_ctx, _parentState);
		DirectDeclaratorContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_directDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(473);
				((DirectDeclaratorContext)_localctx).id = match(Identifier);

				      ((DirectDeclaratorContext)_localctx).directDeclaratorRet =  new Identifier(((DirectDeclaratorContext)_localctx).id.getText());
				      _localctx.directDeclaratorRet.setLine((((DirectDeclaratorContext)_localctx).id!=null?((DirectDeclaratorContext)_localctx).id.getLine():0));
				    
				}
				break;
			case LeftParen:
				{
				setState(475);
				match(LeftParen);
				setState(476);
				((DirectDeclaratorContext)_localctx).d = declarator();
				setState(477);
				match(RightParen);

				      ((DirectDeclaratorContext)_localctx).directDeclaratorRet =  new DirectDeclaratorParen(((DirectDeclaratorContext)_localctx).d.declaratorRet);
				      _localctx.directDeclaratorRet.setLine(((DirectDeclaratorContext)_localctx).d.declaratorRet.getLine());
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(505);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(503);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						_localctx.base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(482);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(483);
						match(LeftBracket);
						setState(487);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & 49539602426888321L) != 0)) {
							{
							setState(484);
							((DirectDeclaratorContext)_localctx).e = expression(0);

							                  ((DirectDeclaratorContext)_localctx).directDeclaratorRet =  new DirectDeclaratorArray(((DirectDeclaratorContext)_localctx).base.directDeclaratorRet, ((DirectDeclaratorContext)_localctx).e.expressionRet);
							                  _localctx.directDeclaratorRet.setLine(((DirectDeclaratorContext)_localctx).base.directDeclaratorRet.getLine());
							                
							}
						}

						setState(489);
						match(RightBracket);

						                if (_localctx.directDeclaratorRet == null) {
						                  ((DirectDeclaratorContext)_localctx).directDeclaratorRet =  new DirectDeclaratorArray(((DirectDeclaratorContext)_localctx).base.directDeclaratorRet, null);
						                  _localctx.directDeclaratorRet.setLine(((DirectDeclaratorContext)_localctx).base.directDeclaratorRet.getLine());
						                }
						              
						}
						break;
					case 2:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						_localctx.base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(491);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(492);
						match(LeftParen);
						setState(499);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
						case 1:
							{
							setState(493);
							((DirectDeclaratorContext)_localctx).plist = parameterList();

							                    ((DirectDeclaratorContext)_localctx).directDeclaratorRet =  new DirectDeclaratorFunctionParams(((DirectDeclaratorContext)_localctx).base.directDeclaratorRet, ((DirectDeclaratorContext)_localctx).plist.parameterListRet);
							                    _localctx.directDeclaratorRet.setLine(((DirectDeclaratorContext)_localctx).base.directDeclaratorRet.getLine());
							                  
							}
							break;
						case 2:
							{
							setState(496);
							((DirectDeclaratorContext)_localctx).idlist = identifierList();

							                    ((DirectDeclaratorContext)_localctx).directDeclaratorRet =  new DirectDeclaratorFunctionIds(((DirectDeclaratorContext)_localctx).base.directDeclaratorRet, ((DirectDeclaratorContext)_localctx).idlist.identifierListRet);
							                    _localctx.directDeclaratorRet.setLine(((DirectDeclaratorContext)_localctx).base.directDeclaratorRet.getLine());
							                  
							}
							break;
						}
						setState(501);
						match(RightParen);

						                if (_localctx.directDeclaratorRet == null) {
						                  ((DirectDeclaratorContext)_localctx).directDeclaratorRet =  new DirectDeclaratorFunctionEmpty(((DirectDeclaratorContext)_localctx).base.directDeclaratorRet);
						                  _localctx.directDeclaratorRet.setLine(((DirectDeclaratorContext)_localctx).base.directDeclaratorRet.getLine());
						                }
						              
						}
						break;
					}
					} 
				}
				setState(507);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PointerContext extends ParserRuleContext {
		public Pointer pointerRet;
		public Token s;
		public Token Const;
		public List<Token> c = new ArrayList<Token>();
		public List<TerminalNode> Star() { return getTokens(SimpleLangParser.Star); }
		public TerminalNode Star(int i) {
			return getToken(SimpleLangParser.Star, i);
		}
		public List<TerminalNode> Const() { return getTokens(SimpleLangParser.Const); }
		public TerminalNode Const(int i) {
			return getToken(SimpleLangParser.Const, i);
		}
		public PointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterPointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitPointer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitPointer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointerContext pointer() throws RecognitionException {
		PointerContext _localctx = new PointerContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_pointer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(516); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(508);
				((PointerContext)_localctx).s = match(Star);
				setState(512);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(509);
						((PointerContext)_localctx).Const = match(Const);
						((PointerContext)_localctx).c.add(((PointerContext)_localctx).Const);
						}
						} 
					}
					setState(514);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}

				      if (_localctx.pointerRet == null)
				        ((PointerContext)_localctx).pointerRet =  new Pointer();
				      _localctx.pointerRet.addLevel(!((PointerContext)_localctx).c.isEmpty());
				      if (_localctx.pointerRet.getLine() == 0) _localctx.pointerRet.setLine((((PointerContext)_localctx).s!=null?((PointerContext)_localctx).s.getLine():0));
				    
				}
				}
				setState(518); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Star );
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterListContext extends ParserRuleContext {
		public ParameterList parameterListRet;
		public ParameterDeclarationContext first;
		public ParameterDeclarationContext parameterDeclaration;
		public List<ParameterDeclarationContext> rest = new ArrayList<ParameterDeclarationContext>();
		public List<ParameterDeclarationContext> parameterDeclaration() {
			return getRuleContexts(ParameterDeclarationContext.class);
		}
		public ParameterDeclarationContext parameterDeclaration(int i) {
			return getRuleContext(ParameterDeclarationContext.class,i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			((ParameterListContext)_localctx).first = parameterDeclaration();
			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6084940L) != 0) || _la==Identifier) {
				{
				{
				setState(521);
				((ParameterListContext)_localctx).parameterDeclaration = parameterDeclaration();
				((ParameterListContext)_localctx).rest.add(((ParameterListContext)_localctx).parameterDeclaration);
				}
				}
				setState(526);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			    ParameterList list = new ParameterList();
			    list.addParameter(((ParameterListContext)_localctx).first.parameterDeclarationRet);
			    for (ParameterDeclarationContext p : ((ParameterListContext)_localctx).rest)
			        list.addParameter(p.parameterDeclarationRet);
			    list.setLine(((ParameterListContext)_localctx).first.parameterDeclarationRet.getLine());
			    ((ParameterListContext)_localctx).parameterListRet =  list;
			  
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterDeclarationContext extends ParserRuleContext {
		public ParameterDeclaration parameterDeclarationRet;
		public DeclarationSpecifiersContext ds;
		public DeclaratorContext d;
		public AbstractDeclaratorContext ad;
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterParameterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitParameterDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitParameterDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_parameterDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			((ParameterDeclarationContext)_localctx).ds = declarationSpecifiers();
			setState(536);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(530);
				((ParameterDeclarationContext)_localctx).d = declarator();

				        ((ParameterDeclarationContext)_localctx).parameterDeclarationRet =  new ParameterDeclaration(((ParameterDeclarationContext)_localctx).ds.declarationSpecifiersRet, ((ParameterDeclarationContext)_localctx).d.declaratorRet, null);
				        _localctx.parameterDeclarationRet.setLine(((ParameterDeclarationContext)_localctx).d.declaratorRet.getLine());
				      
				}
				break;
			case 2:
				{
				setState(533);
				((ParameterDeclarationContext)_localctx).ad = abstractDeclarator();

				        ((ParameterDeclarationContext)_localctx).parameterDeclarationRet =  new ParameterDeclaration(((ParameterDeclarationContext)_localctx).ds.declarationSpecifiersRet, null, ((ParameterDeclarationContext)_localctx).ad.abstractDeclaratorRet);
				        _localctx.parameterDeclarationRet.setLine(((ParameterDeclarationContext)_localctx).ad.abstractDeclaratorRet.getLine());
				      
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierListContext extends ParserRuleContext {
		public IdentifierList identifierListRet;
		public Token first;
		public Token Identifier;
		public List<Token> rest = new ArrayList<Token>();
		public List<TerminalNode> Identifier() { return getTokens(SimpleLangParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(SimpleLangParser.Identifier, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			((IdentifierListContext)_localctx).first = match(Identifier);
			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(539);
				((IdentifierListContext)_localctx).Identifier = match(Identifier);
				((IdentifierListContext)_localctx).rest.add(((IdentifierListContext)_localctx).Identifier);
				}
				}
				setState(544);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			      ((IdentifierListContext)_localctx).identifierListRet =  new IdentifierList();
			      _localctx.identifierListRet.addIdentifier(((IdentifierListContext)_localctx).first.getText());
			      for (Token t : ((IdentifierListContext)_localctx).rest)
			          _localctx.identifierListRet.addIdentifier(t.getText());
			      _localctx.identifierListRet.setLine((((IdentifierListContext)_localctx).first!=null?((IdentifierListContext)_localctx).first.getLine():0));
			  
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeNameContext extends ParserRuleContext {
		public TypeName typeNameRet;
		public SpecifierQualifierListContext sq;
		public AbstractDeclaratorContext ad;
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_typeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			((TypeNameContext)_localctx).sq = specifierQualifierList();
			setState(551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 549797756928L) != 0)) {
				{
				setState(548);
				((TypeNameContext)_localctx).ad = abstractDeclarator();

				      ((TypeNameContext)_localctx).typeNameRet =  new TypeName(((TypeNameContext)_localctx).sq.specifierQualifierListRet, ((TypeNameContext)_localctx).ad.abstractDeclaratorRet);
				      _localctx.typeNameRet.setLine(((TypeNameContext)_localctx).sq.specifierQualifierListRet.getLine());
				    
				}
			}


			      if (_localctx.typeNameRet == null) {
			        ((TypeNameContext)_localctx).typeNameRet =  new TypeName(((TypeNameContext)_localctx).sq.specifierQualifierListRet, null);
			        _localctx.typeNameRet.setLine(((TypeNameContext)_localctx).sq.specifierQualifierListRet.getLine());
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

	@SuppressWarnings("CheckReturnValue")
	public static class AbstractDeclaratorContext extends ParserRuleContext {
		public AbstractDeclarator abstractDeclaratorRet;
		public PointerContext p;
		public DirectAbstractDeclaratorContext d;
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public DirectAbstractDeclaratorContext directAbstractDeclarator() {
			return getRuleContext(DirectAbstractDeclaratorContext.class,0);
		}
		public AbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterAbstractDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitAbstractDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitAbstractDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbstractDeclaratorContext abstractDeclarator() throws RecognitionException {
		AbstractDeclaratorContext _localctx = new AbstractDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_abstractDeclarator);
		try {
			setState(565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(555);
				((AbstractDeclaratorContext)_localctx).p = pointer();

				      ((AbstractDeclaratorContext)_localctx).abstractDeclaratorRet =  new AbstractDeclaratorPointer(((AbstractDeclaratorContext)_localctx).p.pointerRet);
				      _localctx.abstractDeclaratorRet.setLine(((AbstractDeclaratorContext)_localctx).p.pointerRet.getLine());
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(558);
				((AbstractDeclaratorContext)_localctx).d = directAbstractDeclarator(0);

				      ((AbstractDeclaratorContext)_localctx).abstractDeclaratorRet =  new AbstractDeclaratorDirect(((AbstractDeclaratorContext)_localctx).d.directAbstractDeclaratorRet);
				      _localctx.abstractDeclaratorRet.setLine(((AbstractDeclaratorContext)_localctx).d.directAbstractDeclaratorRet.getLine());
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(561);
				((AbstractDeclaratorContext)_localctx).p = pointer();
				setState(562);
				((AbstractDeclaratorContext)_localctx).d = directAbstractDeclarator(0);

				      ((AbstractDeclaratorContext)_localctx).abstractDeclaratorRet =  new AbstractDeclaratorPointerDirect(((AbstractDeclaratorContext)_localctx).p.pointerRet, ((AbstractDeclaratorContext)_localctx).d.directAbstractDeclaratorRet);
				      _localctx.abstractDeclaratorRet.setLine(((AbstractDeclaratorContext)_localctx).p.pointerRet.getLine());
				    
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

	@SuppressWarnings("CheckReturnValue")
	public static class DirectAbstractDeclaratorContext extends ParserRuleContext {
		public DirectAbstractDeclarator directAbstractDeclaratorRet;
		public DirectAbstractDeclaratorContext base;
		public ExpressionContext e;
		public AbstractDeclaratorContext ad;
		public ParameterListContext plist;
		public TerminalNode LeftBracket() { return getToken(SimpleLangParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(SimpleLangParser.RightBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(SimpleLangParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(SimpleLangParser.RightParen, 0); }
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public DirectAbstractDeclaratorContext directAbstractDeclarator() {
			return getRuleContext(DirectAbstractDeclaratorContext.class,0);
		}
		public DirectAbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directAbstractDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterDirectAbstractDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitDirectAbstractDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitDirectAbstractDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectAbstractDeclaratorContext directAbstractDeclarator() throws RecognitionException {
		return directAbstractDeclarator(0);
	}

	private DirectAbstractDeclaratorContext directAbstractDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DirectAbstractDeclaratorContext _localctx = new DirectAbstractDeclaratorContext(_ctx, _parentState);
		DirectAbstractDeclaratorContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_directAbstractDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBracket:
				{
				setState(568);
				match(LeftBracket);
				setState(572);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & 49539602426888321L) != 0)) {
					{
					setState(569);
					((DirectAbstractDeclaratorContext)_localctx).e = expression(0);

					      ((DirectAbstractDeclaratorContext)_localctx).directAbstractDeclaratorRet =  new DirectAbstractDeclaratorArray(((DirectAbstractDeclaratorContext)_localctx).e.expressionRet);
					      _localctx.directAbstractDeclaratorRet.setLine(((DirectAbstractDeclaratorContext)_localctx).e.expressionRet.getLine());
					    
					}
				}

				setState(574);
				match(RightBracket);

				      if (_localctx.directAbstractDeclaratorRet == null) {
				        ((DirectAbstractDeclaratorContext)_localctx).directAbstractDeclaratorRet =  new DirectAbstractDeclaratorArray(null);
				      }
				    
				}
				break;
			case LeftParen:
				{
				setState(576);
				match(LeftParen);
				setState(583);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LeftParen:
				case LeftBracket:
				case Star:
					{
					setState(577);
					((DirectAbstractDeclaratorContext)_localctx).ad = abstractDeclarator();

					          ((DirectAbstractDeclaratorContext)_localctx).directAbstractDeclaratorRet =  new DirectAbstractDeclaratorParen(null, ((DirectAbstractDeclaratorContext)_localctx).ad.abstractDeclaratorRet);
					          _localctx.directAbstractDeclaratorRet.setLine(((DirectAbstractDeclaratorContext)_localctx).ad.abstractDeclaratorRet.getLine());
					        
					}
					break;
				case Char:
				case Const:
				case Double:
				case Float:
				case Int:
				case Long:
				case Short:
				case Signed:
				case Typedef:
				case Unsigned:
				case Void:
				case Bool:
				case Identifier:
					{
					setState(580);
					((DirectAbstractDeclaratorContext)_localctx).plist = parameterList();

					          ((DirectAbstractDeclaratorContext)_localctx).directAbstractDeclaratorRet =  new DirectAbstractDeclaratorParen(((DirectAbstractDeclaratorContext)_localctx).plist.parameterListRet, null);
					          _localctx.directAbstractDeclaratorRet.setLine(((DirectAbstractDeclaratorContext)_localctx).plist.parameterListRet.getLine());
					        
					}
					break;
				case RightParen:
					break;
				default:
					break;
				}
				setState(585);
				match(RightParen);

				      if (_localctx.directAbstractDeclaratorRet == null) {
				        ((DirectAbstractDeclaratorContext)_localctx).directAbstractDeclaratorRet =  new DirectAbstractDeclaratorParen(null, null);
				      }
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(609);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(607);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
					case 1:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						_localctx.base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(589);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(590);
						match(LeftBracket);
						setState(594);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & 49539602426888321L) != 0)) {
							{
							setState(591);
							((DirectAbstractDeclaratorContext)_localctx).e = expression(0);

							                  ((DirectAbstractDeclaratorContext)_localctx).directAbstractDeclaratorRet =  new DirectAbstractDeclaratorArrayRecursive(((DirectAbstractDeclaratorContext)_localctx).base.directAbstractDeclaratorRet, ((DirectAbstractDeclaratorContext)_localctx).e.expressionRet);
							                  _localctx.directAbstractDeclaratorRet.setLine(((DirectAbstractDeclaratorContext)_localctx).base.directAbstractDeclaratorRet.getLine());
							                
							}
						}

						setState(596);
						match(RightBracket);

						                if (_localctx.directAbstractDeclaratorRet == null) {
						                  ((DirectAbstractDeclaratorContext)_localctx).directAbstractDeclaratorRet =  new DirectAbstractDeclaratorArrayRecursive(((DirectAbstractDeclaratorContext)_localctx).base.directAbstractDeclaratorRet, null);
						                  _localctx.directAbstractDeclaratorRet.setLine(((DirectAbstractDeclaratorContext)_localctx).base.directAbstractDeclaratorRet.getLine());
						                }
						              
						}
						break;
					case 2:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						_localctx.base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(598);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(599);
						match(LeftParen);
						setState(603);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6084940L) != 0) || _la==Identifier) {
							{
							setState(600);
							((DirectAbstractDeclaratorContext)_localctx).plist = parameterList();

							                  ((DirectAbstractDeclaratorContext)_localctx).directAbstractDeclaratorRet =  new DirectAbstractDeclaratorCallRecursive(((DirectAbstractDeclaratorContext)_localctx).base.directAbstractDeclaratorRet, ((DirectAbstractDeclaratorContext)_localctx).plist.parameterListRet);
							                  _localctx.directAbstractDeclaratorRet.setLine(((DirectAbstractDeclaratorContext)_localctx).base.directAbstractDeclaratorRet.getLine());
							                
							}
						}

						setState(605);
						match(RightParen);

						                if (_localctx.directAbstractDeclaratorRet == null) {
						                  ((DirectAbstractDeclaratorContext)_localctx).directAbstractDeclaratorRet =  new DirectAbstractDeclaratorCallRecursive(((DirectAbstractDeclaratorContext)_localctx).base.directAbstractDeclaratorRet, null);
						                  _localctx.directAbstractDeclaratorRet.setLine(((DirectAbstractDeclaratorContext)_localctx).base.directAbstractDeclaratorRet.getLine());
						                }
						              
						}
						break;
					}
					} 
				}
				setState(611);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InitializerContext extends ParserRuleContext {
		public Initializer initializerRet;
		public ExpressionContext e;
		public InitializerListContext il;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(SimpleLangParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(SimpleLangParser.RightBrace, 0); }
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(SimpleLangParser.Comma, 0); }
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_initializer);
		int _la;
		try {
			setState(623);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Sizeof:
			case LeftParen:
			case Plus:
			case PlusPlus:
			case Minus:
			case MinusMinus:
			case Star:
			case And:
			case Not:
			case Tilde:
			case Identifier:
			case Constant:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(612);
				((InitializerContext)_localctx).e = expression(0);

				      ((InitializerContext)_localctx).initializerRet =  ((InitializerContext)_localctx).e.expressionRet;
				    
				}
				break;
			case LeftBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(615);
				match(LeftBrace);
				setState(616);
				((InitializerContext)_localctx).il = initializerList();
				setState(618);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(617);
					match(Comma);
					}
				}

				setState(620);
				match(RightBrace);

				      ((InitializerContext)_localctx).initializerRet =  new InitializerListWrapper(((InitializerContext)_localctx).il.initializerListRet);
				      _localctx.initializerRet.setLine(((InitializerContext)_localctx).il.initializerListRet.getLine());
				    
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

	@SuppressWarnings("CheckReturnValue")
	public static class InitializerListContext extends ParserRuleContext {
		public InitializerList initializerListRet;
		public DesignationContext d1;
		public InitializerContext i1;
		public DesignationContext d2;
		public InitializerContext i2;
		public List<DesignationContext> designation() {
			return getRuleContexts(DesignationContext.class);
		}
		public DesignationContext designation(int i) {
			return getRuleContext(DesignationContext.class,i);
		}
		public List<InitializerContext> initializer() {
			return getRuleContexts(InitializerContext.class);
		}
		public InitializerContext initializer(int i) {
			return getRuleContext(InitializerContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SimpleLangParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SimpleLangParser.Comma, i);
		}
		public InitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterInitializerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitInitializerList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitInitializerList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerListContext initializerList() throws RecognitionException {
		InitializerListContext _localctx = new InitializerListContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_initializerList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{

			      ((InitializerListContext)_localctx).initializerListRet =  new InitializerList();
			    
			setState(633);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBracket:
			case Dot:
				{
				setState(626);
				((InitializerListContext)_localctx).d1 = designation();
				setState(627);
				((InitializerListContext)_localctx).i1 = initializer();

				        _localctx.initializerListRet.addEntry(((InitializerListContext)_localctx).d1.designationRet, ((InitializerListContext)_localctx).i1.initializerRet);
				        _localctx.initializerListRet.setLine(((InitializerListContext)_localctx).d1.designationRet.getLine());
				     
				}
				break;
			case Sizeof:
			case LeftParen:
			case LeftBrace:
			case Plus:
			case PlusPlus:
			case Minus:
			case MinusMinus:
			case Star:
			case And:
			case Not:
			case Tilde:
			case Identifier:
			case Constant:
			case StringLiteral:
				{
				setState(630);
				((InitializerListContext)_localctx).i1 = initializer();

				        _localctx.initializerListRet.addEntry(null, ((InitializerListContext)_localctx).i1.initializerRet);
				        _localctx.initializerListRet.setLine(((InitializerListContext)_localctx).i1.initializerRet.getLine());
				     
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(647);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(635);
					match(Comma);
					setState(643);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LeftBracket:
					case Dot:
						{
						setState(636);
						((InitializerListContext)_localctx).d2 = designation();
						setState(637);
						((InitializerListContext)_localctx).i2 = initializer();

						            _localctx.initializerListRet.addEntry(((InitializerListContext)_localctx).d2.designationRet, ((InitializerListContext)_localctx).i2.initializerRet);
						        
						}
						break;
					case Sizeof:
					case LeftParen:
					case LeftBrace:
					case Plus:
					case PlusPlus:
					case Minus:
					case MinusMinus:
					case Star:
					case And:
					case Not:
					case Tilde:
					case Identifier:
					case Constant:
					case StringLiteral:
						{
						setState(640);
						((InitializerListContext)_localctx).i2 = initializer();

						            _localctx.initializerListRet.addEntry(null, ((InitializerListContext)_localctx).i2.initializerRet);
						        
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(649);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DesignationContext extends ParserRuleContext {
		public Designation designationRet;
		public DesignatorContext designator;
		public List<DesignatorContext> ds = new ArrayList<DesignatorContext>();
		public TerminalNode Assign() { return getToken(SimpleLangParser.Assign, 0); }
		public List<DesignatorContext> designator() {
			return getRuleContexts(DesignatorContext.class);
		}
		public DesignatorContext designator(int i) {
			return getRuleContext(DesignatorContext.class,i);
		}
		public DesignationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterDesignation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitDesignation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitDesignation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesignationContext designation() throws RecognitionException {
		DesignationContext _localctx = new DesignationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_designation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(650);
				((DesignationContext)_localctx).designator = designator();
				((DesignationContext)_localctx).ds.add(((DesignationContext)_localctx).designator);
				}
				}
				setState(653); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LeftBracket || _la==Dot );
			setState(655);
			match(Assign);

			      ((DesignationContext)_localctx).designationRet =  new Designation();
			      for (DesignatorContext d : ((DesignationContext)_localctx).ds)
			          _localctx.designationRet.addDesignator(d.designatorRet);
			      _localctx.designationRet.setLine(((DesignationContext)_localctx).ds.get(0).designatorRet.getLine());
			  
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

	@SuppressWarnings("CheckReturnValue")
	public static class DesignatorContext extends ParserRuleContext {
		public Designator designatorRet;
		public ExpressionContext e;
		public Token id;
		public TerminalNode LeftBracket() { return getToken(SimpleLangParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(SimpleLangParser.RightBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Dot() { return getToken(SimpleLangParser.Dot, 0); }
		public TerminalNode Identifier() { return getToken(SimpleLangParser.Identifier, 0); }
		public DesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterDesignator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitDesignator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitDesignator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesignatorContext designator() throws RecognitionException {
		DesignatorContext _localctx = new DesignatorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_designator);
		try {
			setState(666);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(658);
				match(LeftBracket);
				setState(659);
				((DesignatorContext)_localctx).e = expression(0);
				setState(660);
				match(RightBracket);

				      ((DesignatorContext)_localctx).designatorRet =  new ArrayIndexDesignator(((DesignatorContext)_localctx).e.expressionRet);
				      _localctx.designatorRet.setLine(((DesignatorContext)_localctx).e.expressionRet.getLine());
				    
				}
				break;
			case Dot:
				enterOuterAlt(_localctx, 2);
				{
				setState(663);
				match(Dot);
				setState(664);
				((DesignatorContext)_localctx).id = match(Identifier);

				      ((DesignatorContext)_localctx).designatorRet =  new FieldDesignator(((DesignatorContext)_localctx).id.getText());
				      _localctx.designatorRet.setLine((((DesignatorContext)_localctx).id!=null?((DesignatorContext)_localctx).id.getLine():0));
				    
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public Statement statementRet;
		public CompoundStatementContext cs;
		public ExpressionStatementContext es;
		public SelectionStatementContext ss;
		public IterationStatementContext is;
		public JumpStatementContext js;
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public SelectionStatementContext selectionStatement() {
			return getRuleContext(SelectionStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public JumpStatementContext jumpStatement() {
			return getRuleContext(JumpStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_statement);
		try {
			setState(683);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBrace:
				enterOuterAlt(_localctx, 1);
				{
				setState(668);
				((StatementContext)_localctx).cs = compoundStatement();

				      ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).cs.compoundStatementRet;
				    
				}
				break;
			case Sizeof:
			case LeftParen:
			case Plus:
			case PlusPlus:
			case Minus:
			case MinusMinus:
			case Star:
			case And:
			case Not:
			case Tilde:
			case Semi:
			case Identifier:
			case Constant:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(671);
				((StatementContext)_localctx).es = expressionStatement();

				      ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).es.expressionStatementRet;
				    
				}
				break;
			case If:
				enterOuterAlt(_localctx, 3);
				{
				setState(674);
				((StatementContext)_localctx).ss = selectionStatement();

				      ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).ss.selectionStatementRet;
				    
				}
				break;
			case Do:
			case For:
			case While:
				enterOuterAlt(_localctx, 4);
				{
				setState(677);
				((StatementContext)_localctx).is = iterationStatement();

				      ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).is.iterationStatementRet;
				    
				}
				break;
			case Break:
			case Continue:
			case Return:
				enterOuterAlt(_localctx, 5);
				{
				setState(680);
				((StatementContext)_localctx).js = jumpStatement();

				      ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).js.jumpStatementRet;
				    
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

	@SuppressWarnings("CheckReturnValue")
	public static class CompoundStatementContext extends ParserRuleContext {
		public CompoundStatement compoundStatementRet;
		public BlockItemContext blockItem;
		public List<BlockItemContext> items = new ArrayList<BlockItemContext>();
		public TerminalNode LeftBrace() { return getToken(SimpleLangParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(SimpleLangParser.RightBrace, 0); }
		public List<BlockItemContext> blockItem() {
			return getRuleContexts(BlockItemContext.class);
		}
		public BlockItemContext blockItem(int i) {
			return getRuleContext(BlockItemContext.class,i);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitCompoundStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitCompoundStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(685);
			match(LeftBrace);
			setState(693);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2679475628015486L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 11L) != 0)) {
				{
				setState(687); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(686);
					((CompoundStatementContext)_localctx).blockItem = blockItem();
					((CompoundStatementContext)_localctx).items.add(((CompoundStatementContext)_localctx).blockItem);
					}
					}
					setState(689); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2679475628015486L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 11L) != 0) );

				      ((CompoundStatementContext)_localctx).compoundStatementRet =  new CompoundStatement();
				      for (BlockItemContext item : ((CompoundStatementContext)_localctx).items)
				          _localctx.compoundStatementRet.addBlockItem(item.blockItemRet);
				      _localctx.compoundStatementRet.setLine(((CompoundStatementContext)_localctx).items.get(0).blockItemRet.getLine());
				    
				}
			}

			setState(695);
			match(RightBrace);

			      if (_localctx.compoundStatementRet == null) {
			        ((CompoundStatementContext)_localctx).compoundStatementRet =  new CompoundStatement();
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockItemContext extends ParserRuleContext {
		public BlockItem blockItemRet;
		public StatementContext s;
		public DeclarationContext d;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public BlockItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterBlockItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitBlockItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitBlockItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockItemContext blockItem() throws RecognitionException {
		BlockItemContext _localctx = new BlockItemContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_blockItem);
		try {
			setState(704);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(698);
				((BlockItemContext)_localctx).s = statement();
				 ((BlockItemContext)_localctx).blockItemRet =  ((BlockItemContext)_localctx).s.statementRet; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(701);
				((BlockItemContext)_localctx).d = declaration();
				 ((BlockItemContext)_localctx).blockItemRet =  ((BlockItemContext)_localctx).d.declarationRet; 
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionStatement expressionStatementRet;
		public ExpressionContext e;
		public TerminalNode Semi() { return getToken(SimpleLangParser.Semi, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & 49539602426888321L) != 0)) {
				{
				setState(706);
				((ExpressionStatementContext)_localctx).e = expression(0);

				      ((ExpressionStatementContext)_localctx).expressionStatementRet =  new ExpressionStatement(((ExpressionStatementContext)_localctx).e.expressionRet);
				      _localctx.expressionStatementRet.setLine(((ExpressionStatementContext)_localctx).e.expressionRet.getLine());
				    
				}
			}

			setState(711);
			match(Semi);

			      if (_localctx.expressionStatementRet == null) {
			        ((ExpressionStatementContext)_localctx).expressionStatementRet =  new ExpressionStatement(null);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelectionStatementContext extends ParserRuleContext {
		public SelectionStatement selectionStatementRet;
		public Token ifTok;
		public ExpressionContext cond;
		public StatementContext thenStmt;
		public Token elseTok;
		public StatementContext elseStmt;
		public TerminalNode LeftParen() { return getToken(SimpleLangParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(SimpleLangParser.RightParen, 0); }
		public TerminalNode If() { return getToken(SimpleLangParser.If, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(SimpleLangParser.Else, 0); }
		public SelectionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterSelectionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitSelectionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitSelectionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectionStatementContext selectionStatement() throws RecognitionException {
		SelectionStatementContext _localctx = new SelectionStatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_selectionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(714);
			((SelectionStatementContext)_localctx).ifTok = match(If);
			setState(715);
			match(LeftParen);
			setState(716);
			((SelectionStatementContext)_localctx).cond = expression(0);
			setState(717);
			match(RightParen);
			setState(718);
			((SelectionStatementContext)_localctx).thenStmt = statement();
			setState(723);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(719);
				((SelectionStatementContext)_localctx).elseTok = match(Else);
				setState(720);
				((SelectionStatementContext)_localctx).elseStmt = statement();

				      ((SelectionStatementContext)_localctx).selectionStatementRet =  new SelectionStatement(((SelectionStatementContext)_localctx).cond.expressionRet, ((SelectionStatementContext)_localctx).thenStmt.statementRet, ((SelectionStatementContext)_localctx).elseStmt.statementRet);

				      if (((SelectionStatementContext)_localctx).elseStmt.statementRet != null)
				          ((SelectionStatementContext)_localctx).elseStmt.statementRet.setLine(((SelectionStatementContext)_localctx).elseTok.getLine());

				      _localctx.selectionStatementRet.setLine(((SelectionStatementContext)_localctx).ifTok.getLine());
				    
				}
				break;
			}

			      if (_localctx.selectionStatementRet == null) {
			        ((SelectionStatementContext)_localctx).selectionStatementRet =  new SelectionStatement(((SelectionStatementContext)_localctx).cond.expressionRet, ((SelectionStatementContext)_localctx).thenStmt.statementRet, null);
			        _localctx.selectionStatementRet.setLine(((SelectionStatementContext)_localctx).ifTok.getLine());
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

	@SuppressWarnings("CheckReturnValue")
	public static class IterationStatementContext extends ParserRuleContext {
		public IterationStatement iterationStatementRet;
		public Token whileTok;
		public ExpressionContext cond;
		public StatementContext body;
		public Token doTok;
		public Token forTok;
		public ForConditionContext fc;
		public TerminalNode LeftParen() { return getToken(SimpleLangParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(SimpleLangParser.RightParen, 0); }
		public TerminalNode While() { return getToken(SimpleLangParser.While, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Semi() { return getToken(SimpleLangParser.Semi, 0); }
		public TerminalNode Do() { return getToken(SimpleLangParser.Do, 0); }
		public TerminalNode For() { return getToken(SimpleLangParser.For, 0); }
		public ForConditionContext forCondition() {
			return getRuleContext(ForConditionContext.class,0);
		}
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterIterationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitIterationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitIterationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_iterationStatement);
		try {
			setState(750);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case While:
				enterOuterAlt(_localctx, 1);
				{
				setState(727);
				((IterationStatementContext)_localctx).whileTok = match(While);
				setState(728);
				match(LeftParen);
				setState(729);
				((IterationStatementContext)_localctx).cond = expression(0);
				setState(730);
				match(RightParen);
				setState(731);
				((IterationStatementContext)_localctx).body = statement();

				      ((IterationStatementContext)_localctx).iterationStatementRet =  new WhileStatement(((IterationStatementContext)_localctx).cond.expressionRet, ((IterationStatementContext)_localctx).body.statementRet);
				      _localctx.iterationStatementRet.setLine(((IterationStatementContext)_localctx).whileTok.getLine());
				    
				}
				break;
			case Do:
				enterOuterAlt(_localctx, 2);
				{
				setState(734);
				((IterationStatementContext)_localctx).doTok = match(Do);
				setState(735);
				((IterationStatementContext)_localctx).body = statement();
				setState(736);
				match(While);
				setState(737);
				match(LeftParen);
				setState(738);
				((IterationStatementContext)_localctx).cond = expression(0);
				setState(739);
				match(RightParen);
				setState(740);
				match(Semi);

				      ((IterationStatementContext)_localctx).iterationStatementRet =  new DoWhileStatement(((IterationStatementContext)_localctx).cond.expressionRet, ((IterationStatementContext)_localctx).body.statementRet);
				      _localctx.iterationStatementRet.setLine(((IterationStatementContext)_localctx).doTok.getLine());
				    
				}
				break;
			case For:
				enterOuterAlt(_localctx, 3);
				{
				setState(743);
				((IterationStatementContext)_localctx).forTok = match(For);
				setState(744);
				match(LeftParen);
				setState(745);
				((IterationStatementContext)_localctx).fc = forCondition();
				setState(746);
				match(RightParen);
				setState(747);
				((IterationStatementContext)_localctx).body = statement();

				      ((IterationStatementContext)_localctx).iterationStatementRet =  new ForStatement(((IterationStatementContext)_localctx).fc.forConditionRet, ((IterationStatementContext)_localctx).body.statementRet);
				      _localctx.iterationStatementRet.setLine(((IterationStatementContext)_localctx).forTok.getLine());
				    
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForConditionContext extends ParserRuleContext {
		public ForCondition forConditionRet;
		public ForDeclarationContext fd;
		public ForExpressionContext fe1;
		public ForExpressionContext fe2;
		public ExpressionContext e;
		public List<TerminalNode> Semi() { return getTokens(SimpleLangParser.Semi); }
		public TerminalNode Semi(int i) {
			return getToken(SimpleLangParser.Semi, i);
		}
		public ForDeclarationContext forDeclaration() {
			return getRuleContext(ForDeclarationContext.class,0);
		}
		public List<ForExpressionContext> forExpression() {
			return getRuleContexts(ForExpressionContext.class);
		}
		public ForExpressionContext forExpression(int i) {
			return getRuleContext(ForExpressionContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterForCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitForCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitForCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForConditionContext forCondition() throws RecognitionException {
		ForConditionContext _localctx = new ForConditionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_forCondition);
		try {
			setState(808);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(752);
				((ForConditionContext)_localctx).fd = forDeclaration();
				setState(753);
				match(Semi);
				setState(769);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(754);
					((ForConditionContext)_localctx).fe1 = forExpression();
					setState(755);
					match(Semi);
					setState(756);
					((ForConditionContext)_localctx).fe2 = forExpression();

					        ((ForConditionContext)_localctx).forConditionRet =  new ForCondition(((ForConditionContext)_localctx).fd.forDeclarationRet, null, ((ForConditionContext)_localctx).fe1.forExpressionRet, ((ForConditionContext)_localctx).fe2.forExpressionRet);
					        _localctx.forConditionRet.setLine(((ForConditionContext)_localctx).fd.forDeclarationRet.getLine());
					    
					}
					break;
				case 2:
					{
					setState(759);
					((ForConditionContext)_localctx).fe1 = forExpression();
					setState(760);
					match(Semi);

					        ((ForConditionContext)_localctx).forConditionRet =  new ForCondition(((ForConditionContext)_localctx).fd.forDeclarationRet, null, ((ForConditionContext)_localctx).fe1.forExpressionRet, null);
					        _localctx.forConditionRet.setLine(((ForConditionContext)_localctx).fd.forDeclarationRet.getLine());
					    
					}
					break;
				case 3:
					{
					setState(763);
					match(Semi);
					setState(764);
					((ForConditionContext)_localctx).fe2 = forExpression();

					        ((ForConditionContext)_localctx).forConditionRet =  new ForCondition(((ForConditionContext)_localctx).fd.forDeclarationRet, null, null, ((ForConditionContext)_localctx).fe2.forExpressionRet);
					        _localctx.forConditionRet.setLine(((ForConditionContext)_localctx).fd.forDeclarationRet.getLine());
					    
					}
					break;
				case 4:
					{
					setState(767);
					match(Semi);

					        ((ForConditionContext)_localctx).forConditionRet =  new ForCondition(((ForConditionContext)_localctx).fd.forDeclarationRet, null, null, null);
					        _localctx.forConditionRet.setLine(((ForConditionContext)_localctx).fd.forDeclarationRet.getLine());
					    
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(771);
				((ForConditionContext)_localctx).e = expression(0);
				setState(772);
				match(Semi);
				setState(788);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(773);
					((ForConditionContext)_localctx).fe1 = forExpression();
					setState(774);
					match(Semi);
					setState(775);
					((ForConditionContext)_localctx).fe2 = forExpression();

					        ((ForConditionContext)_localctx).forConditionRet =  new ForCondition(null, ((ForConditionContext)_localctx).e.expressionRet, ((ForConditionContext)_localctx).fe1.forExpressionRet, ((ForConditionContext)_localctx).fe2.forExpressionRet);
					        _localctx.forConditionRet.setLine(((ForConditionContext)_localctx).e.expressionRet.getLine());
					    
					}
					break;
				case 2:
					{
					setState(778);
					((ForConditionContext)_localctx).fe1 = forExpression();
					setState(779);
					match(Semi);

					        ((ForConditionContext)_localctx).forConditionRet =  new ForCondition(null, ((ForConditionContext)_localctx).e.expressionRet, ((ForConditionContext)_localctx).fe1.forExpressionRet, null);
					        _localctx.forConditionRet.setLine(((ForConditionContext)_localctx).e.expressionRet.getLine());
					    
					}
					break;
				case 3:
					{
					setState(782);
					match(Semi);
					setState(783);
					((ForConditionContext)_localctx).fe2 = forExpression();

					        ((ForConditionContext)_localctx).forConditionRet =  new ForCondition(null, ((ForConditionContext)_localctx).e.expressionRet, null, ((ForConditionContext)_localctx).fe2.forExpressionRet);
					        _localctx.forConditionRet.setLine(((ForConditionContext)_localctx).e.expressionRet.getLine());
					    
					}
					break;
				case 4:
					{
					setState(786);
					match(Semi);

					        ((ForConditionContext)_localctx).forConditionRet =  new ForCondition(null, ((ForConditionContext)_localctx).e.expressionRet, null, null);
					        _localctx.forConditionRet.setLine(((ForConditionContext)_localctx).e.expressionRet.getLine());
					    
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(790);
				match(Semi);
				setState(806);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(791);
					((ForConditionContext)_localctx).fe1 = forExpression();
					setState(792);
					match(Semi);
					setState(793);
					((ForConditionContext)_localctx).fe2 = forExpression();

					        ((ForConditionContext)_localctx).forConditionRet =  new ForCondition(null, null, ((ForConditionContext)_localctx).fe1.forExpressionRet, ((ForConditionContext)_localctx).fe2.forExpressionRet);
					        _localctx.forConditionRet.setLine(((ForConditionContext)_localctx).fe1.forExpressionRet.getLine());
					    
					}
					break;
				case 2:
					{
					setState(796);
					((ForConditionContext)_localctx).fe1 = forExpression();
					setState(797);
					match(Semi);

					        ((ForConditionContext)_localctx).forConditionRet =  new ForCondition(null, null, ((ForConditionContext)_localctx).fe1.forExpressionRet, null);
					        _localctx.forConditionRet.setLine(((ForConditionContext)_localctx).fe1.forExpressionRet.getLine());
					    
					}
					break;
				case 3:
					{
					setState(800);
					match(Semi);
					setState(801);
					((ForConditionContext)_localctx).fe2 = forExpression();

					        ((ForConditionContext)_localctx).forConditionRet =  new ForCondition(null, null, null, ((ForConditionContext)_localctx).fe2.forExpressionRet);
					        _localctx.forConditionRet.setLine(((ForConditionContext)_localctx).fe2.forExpressionRet.getLine());
					    
					}
					break;
				case 4:
					{
					setState(804);
					match(Semi);

					        ((ForConditionContext)_localctx).forConditionRet =  new ForCondition(null, null, null, null);
					    
					}
					break;
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForDeclarationContext extends ParserRuleContext {
		public ForDeclaration forDeclarationRet;
		public DeclarationSpecifiersContext ds;
		public InitDeclaratorListContext idl;
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public ForDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterForDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitForDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitForDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForDeclarationContext forDeclaration() throws RecognitionException {
		ForDeclarationContext _localctx = new ForDeclarationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_forDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(810);
			((ForDeclarationContext)_localctx).ds = declarationSpecifiers();
			setState(814);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & 35184372154369L) != 0)) {
				{
				setState(811);
				((ForDeclarationContext)_localctx).idl = initDeclaratorList();

				      ((ForDeclarationContext)_localctx).forDeclarationRet =  new ForDeclaration(((ForDeclarationContext)_localctx).ds.declarationSpecifiersRet, ((ForDeclarationContext)_localctx).idl.initDeclaratorListRet);
				      _localctx.forDeclarationRet.setLine(((ForDeclarationContext)_localctx).ds.declarationSpecifiersRet.getLine());
				    
				}
			}


			      if (_localctx.forDeclarationRet == null) {
			        ((ForDeclarationContext)_localctx).forDeclarationRet =  new ForDeclaration(((ForDeclarationContext)_localctx).ds.declarationSpecifiersRet, null);
			        _localctx.forDeclarationRet.setLine(((ForDeclarationContext)_localctx).ds.declarationSpecifiersRet.getLine());
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForExpressionContext extends ParserRuleContext {
		public ForExpression forExpressionRet;
		public ExpressionContext e1;
		public ExpressionContext e2;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(SimpleLangParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(SimpleLangParser.Comma, i);
		}
		public ForExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterForExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitForExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitForExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForExpressionContext forExpression() throws RecognitionException {
		ForExpressionContext _localctx = new ForExpressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_forExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818);
			((ForExpressionContext)_localctx).e1 = expression(0);

			      ((ForExpressionContext)_localctx).forExpressionRet =  new ForExpression();
			      _localctx.forExpressionRet.addExpression(((ForExpressionContext)_localctx).e1.expressionRet);
			      _localctx.forExpressionRet.setLine(((ForExpressionContext)_localctx).e1.expressionRet.getLine());
			    
			setState(826);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(820);
				match(Comma);
				setState(821);
				((ForExpressionContext)_localctx).e2 = expression(0);

				      _localctx.forExpressionRet.addExpression(((ForExpressionContext)_localctx).e2.expressionRet);
				    
				}
				}
				setState(828);
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

	@SuppressWarnings("CheckReturnValue")
	public static class JumpStatementContext extends ParserRuleContext {
		public JumpStatement jumpStatementRet;
		public Token Continue;
		public Token Break;
		public Token Return;
		public ExpressionContext e;
		public TerminalNode Continue() { return getToken(SimpleLangParser.Continue, 0); }
		public TerminalNode Semi() { return getToken(SimpleLangParser.Semi, 0); }
		public TerminalNode Break() { return getToken(SimpleLangParser.Break, 0); }
		public TerminalNode Return() { return getToken(SimpleLangParser.Return, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).enterJumpStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SimpleLangListener ) ((SimpleLangListener)listener).exitJumpStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SimpleLangVisitor ) return ((SimpleLangVisitor<? extends T>)visitor).visitJumpStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_jumpStatement);
		int _la;
		try {
			setState(843);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Continue:
				enterOuterAlt(_localctx, 1);
				{
				setState(829);
				((JumpStatementContext)_localctx).Continue = match(Continue);
				setState(830);
				match(Semi);

				      ((JumpStatementContext)_localctx).jumpStatementRet =  new ContinueStatement();
				      _localctx.jumpStatementRet.setLine((((JumpStatementContext)_localctx).Continue!=null?((JumpStatementContext)_localctx).Continue.getLine():0));
				    
				}
				break;
			case Break:
				enterOuterAlt(_localctx, 2);
				{
				setState(832);
				((JumpStatementContext)_localctx).Break = match(Break);
				setState(833);
				match(Semi);

				      ((JumpStatementContext)_localctx).jumpStatementRet =  new BreakStatement();
				      _localctx.jumpStatementRet.setLine((((JumpStatementContext)_localctx).Break!=null?((JumpStatementContext)_localctx).Break.getLine():0));
				    
				}
				break;
			case Return:
				enterOuterAlt(_localctx, 3);
				{
				setState(835);
				((JumpStatementContext)_localctx).Return = match(Return);
				setState(839);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 16)) & ~0x3f) == 0 && ((1L << (_la - 16)) & 49539602426888321L) != 0)) {
					{
					setState(836);
					((JumpStatementContext)_localctx).e = expression(0);

					      ((JumpStatementContext)_localctx).jumpStatementRet =  new ReturnStatement(((JumpStatementContext)_localctx).e.expressionRet);
					      _localctx.jumpStatementRet.setLine(((JumpStatementContext)_localctx).e.expressionRet.getLine());
					    
					}
				}

				setState(841);
				match(Semi);

				      if (_localctx.jumpStatementRet == null) {
				        ((JumpStatementContext)_localctx).jumpStatementRet =  new ReturnStatement(null);
				        _localctx.jumpStatementRet.setLine((((JumpStatementContext)_localctx).Return!=null?((JumpStatementContext)_localctx).Return.getLine():0));
				      }
				    
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 18:
			return directDeclarator_sempred((DirectDeclaratorContext)_localctx, predIndex);
		case 25:
			return directAbstractDeclarator_sempred((DirectAbstractDeclaratorContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 6);
		case 8:
			return precpred(_ctx, 5);
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 2);
		case 12:
			return precpred(_ctx, 19);
		case 13:
			return precpred(_ctx, 18);
		case 14:
			return precpred(_ctx, 17);
		case 15:
			return precpred(_ctx, 16);
		case 16:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean directDeclarator_sempred(DirectDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return precpred(_ctx, 2);
		case 18:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean directAbstractDeclarator_sempred(DirectAbstractDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return precpred(_ctx, 2);
		case 20:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001M\u034e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000U\b\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004"+
		"\u0001]\b\u0001\u000b\u0001\f\u0001^\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"i\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"o\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003w\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004\u0080\b\u0004"+
		"\u000b\u0004\f\u0004\u0081\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005\u008c\b\u0005"+
		"\u000b\u0005\f\u0005\u008d\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u009c\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00a4\b\u0005"+
		"\n\u0005\f\u0005\u00a7\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005\u00b0\b\u0005\u000b"+
		"\u0005\f\u0005\u00b1\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005\u00c0\b\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00cf"+
		"\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u00d7\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0122\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0004\u0005\u012f"+
		"\b\u0005\u000b\u0005\f\u0005\u0130\u0001\u0005\u0001\u0005\u0005\u0005"+
		"\u0135\b\u0005\n\u0005\f\u0005\u0138\t\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0141"+
		"\b\u0006\n\u0006\f\u0006\u0144\t\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0158\b\u0007\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\u0165\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u017d"+
		"\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0183\b\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\u000b\u0001\u000b\u0005\u000b\u018a\b\u000b\n\u000b\f\u000b"+
		"\u018d\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0003\f\u0198\b\f\u0001\r\u0001\r\u0001\r\u0005"+
		"\r\u019d\b\r\n\r\f\r\u01a0\t\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u01a9\b\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u01c3\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u01ca\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u01cf\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u01d4\b"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u01e1\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u01e8\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u01f4\b\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u01f8"+
		"\b\u0012\n\u0012\f\u0012\u01fb\t\u0012\u0001\u0013\u0001\u0013\u0005\u0013"+
		"\u01ff\b\u0013\n\u0013\f\u0013\u0202\t\u0013\u0001\u0013\u0004\u0013\u0205"+
		"\b\u0013\u000b\u0013\f\u0013\u0206\u0001\u0014\u0001\u0014\u0005\u0014"+
		"\u020b\b\u0014\n\u0014\f\u0014\u020e\t\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u0219\b\u0015\u0001\u0016\u0001\u0016\u0005\u0016\u021d"+
		"\b\u0016\n\u0016\f\u0016\u0220\t\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0228\b\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018"+
		"\u0236\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u023d\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019"+
		"\u0248\b\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u024c\b\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0253"+
		"\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u025c\b\u0019\u0001\u0019\u0001\u0019\u0005"+
		"\u0019\u0260\b\u0019\n\u0019\f\u0019\u0263\t\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u026b\b\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0270\b\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0003\u001b\u027a\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b"+
		"\u0284\b\u001b\u0005\u001b\u0286\b\u001b\n\u001b\f\u001b\u0289\t\u001b"+
		"\u0001\u001c\u0004\u001c\u028c\b\u001c\u000b\u001c\f\u001c\u028d\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u029b"+
		"\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u02ac\b\u001e\u0001"+
		"\u001f\u0001\u001f\u0004\u001f\u02b0\b\u001f\u000b\u001f\f\u001f\u02b1"+
		"\u0001\u001f\u0001\u001f\u0003\u001f\u02b6\b\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u02c1\b"+
		" \u0001!\u0001!\u0001!\u0003!\u02c6\b!\u0001!\u0001!\u0001!\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u02d4"+
		"\b\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#"+
		"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u02ef\b#\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0003$\u0302\b$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0003$\u0315\b$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0003$\u0327\b$\u0003$\u0329\b$\u0001%\u0001%\u0001%\u0001"+
		"%\u0003%\u032f\b%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0005&\u0339\b&\n&\f&\u033c\t&\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u0348\b\'\u0001\'\u0001"+
		"\'\u0003\'\u034c\b\'\u0001\'\u0000\u0003\n$2(\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@BDFHJLN\u0000\u0006\u0003\u0000\u0010\u0010$$&&\u0001\u0000\'"+
		")\u0002\u0000##%%\u0001\u0000!\"\u0001\u0000\u001d \u0001\u0000@A\u03ad"+
		"\u0000P\u0001\u0000\u0000\u0000\u0002X\u0001\u0000\u0000\u0000\u0004h"+
		"\u0001\u0000\u0000\u0000\u0006j\u0001\u0000\u0000\u0000\b{\u0001\u0000"+
		"\u0000\u0000\n\u00d6\u0001\u0000\u0000\u0000\f\u0139\u0001\u0000\u0000"+
		"\u0000\u000e\u0157\u0001\u0000\u0000\u0000\u0010\u0164\u0001\u0000\u0000"+
		"\u0000\u0012\u017c\u0001\u0000\u0000\u0000\u0014\u017e\u0001\u0000\u0000"+
		"\u0000\u0016\u0187\u0001\u0000\u0000\u0000\u0018\u0197\u0001\u0000\u0000"+
		"\u0000\u001a\u0199\u0001\u0000\u0000\u0000\u001c\u01a3\u0001\u0000\u0000"+
		"\u0000\u001e\u01c2\u0001\u0000\u0000\u0000 \u01c9\u0001\u0000\u0000\u0000"+
		"\"\u01d3\u0001\u0000\u0000\u0000$\u01e0\u0001\u0000\u0000\u0000&\u0204"+
		"\u0001\u0000\u0000\u0000(\u0208\u0001\u0000\u0000\u0000*\u0211\u0001\u0000"+
		"\u0000\u0000,\u021a\u0001\u0000\u0000\u0000.\u0223\u0001\u0000\u0000\u0000"+
		"0\u0235\u0001\u0000\u0000\u00002\u024b\u0001\u0000\u0000\u00004\u026f"+
		"\u0001\u0000\u0000\u00006\u0271\u0001\u0000\u0000\u00008\u028b\u0001\u0000"+
		"\u0000\u0000:\u029a\u0001\u0000\u0000\u0000<\u02ab\u0001\u0000\u0000\u0000"+
		">\u02ad\u0001\u0000\u0000\u0000@\u02c0\u0001\u0000\u0000\u0000B\u02c5"+
		"\u0001\u0000\u0000\u0000D\u02ca\u0001\u0000\u0000\u0000F\u02ee\u0001\u0000"+
		"\u0000\u0000H\u0328\u0001\u0000\u0000\u0000J\u032a\u0001\u0000\u0000\u0000"+
		"L\u0332\u0001\u0000\u0000\u0000N\u034b\u0001\u0000\u0000\u0000PT\u0006"+
		"\u0000\uffff\uffff\u0000QR\u0003\u0002\u0001\u0000RS\u0006\u0000\uffff"+
		"\uffff\u0000SU\u0001\u0000\u0000\u0000TQ\u0001\u0000\u0000\u0000TU\u0001"+
		"\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VW\u0005\u0000\u0000\u0001"+
		"W\u0001\u0001\u0000\u0000\u0000X\\\u0006\u0001\uffff\uffff\u0000YZ\u0003"+
		"\u0004\u0002\u0000Z[\u0006\u0001\uffff\uffff\u0000[]\u0001\u0000\u0000"+
		"\u0000\\Y\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^\\\u0001\u0000"+
		"\u0000\u0000^_\u0001\u0000\u0000\u0000_\u0003\u0001\u0000\u0000\u0000"+
		"`a\u0003\u0006\u0003\u0000ab\u0006\u0002\uffff\uffff\u0000bi\u0001\u0000"+
		"\u0000\u0000cd\u0003\u0014\n\u0000de\u0006\u0002\uffff\uffff\u0000ei\u0001"+
		"\u0000\u0000\u0000fg\u00053\u0000\u0000gi\u0006\u0002\uffff\uffff\u0000"+
		"h`\u0001\u0000\u0000\u0000hc\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000"+
		"\u0000i\u0005\u0001\u0000\u0000\u0000jn\u0006\u0003\uffff\uffff\u0000"+
		"kl\u0003\u0016\u000b\u0000lm\u0006\u0003\uffff\uffff\u0000mo\u0001\u0000"+
		"\u0000\u0000nk\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000op\u0001"+
		"\u0000\u0000\u0000pq\u0003\"\u0011\u0000qr\u0006\u0003\uffff\uffff\u0000"+
		"rv\u0001\u0000\u0000\u0000st\u0003\b\u0004\u0000tu\u0006\u0003\uffff\uffff"+
		"\u0000uw\u0001\u0000\u0000\u0000vs\u0001\u0000\u0000\u0000vw\u0001\u0000"+
		"\u0000\u0000wx\u0001\u0000\u0000\u0000xy\u0003>\u001f\u0000yz\u0006\u0003"+
		"\uffff\uffff\u0000z\u0007\u0001\u0000\u0000\u0000{\u007f\u0006\u0004\uffff"+
		"\uffff\u0000|}\u0003\u0014\n\u0000}~\u0006\u0004\uffff\uffff\u0000~\u0080"+
		"\u0001\u0000\u0000\u0000\u007f|\u0001\u0000\u0000\u0000\u0080\u0081\u0001"+
		"\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001"+
		"\u0000\u0000\u0000\u0082\t\u0001\u0000\u0000\u0000\u0083\u0084\u0006\u0005"+
		"\uffff\uffff\u0000\u0084\u0085\u0005D\u0000\u0000\u0085\u00d7\u0006\u0005"+
		"\uffff\uffff\u0000\u0086\u0087\u0005E\u0000\u0000\u0087\u00d7\u0006\u0005"+
		"\uffff\uffff\u0000\u0088\u008b\u0006\u0005\uffff\uffff\u0000\u0089\u008a"+
		"\u0005G\u0000\u0000\u008a\u008c\u0006\u0005\uffff\uffff\u0000\u008b\u0089"+
		"\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008b"+
		"\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u00d7"+
		"\u0001\u0000\u0000\u0000\u008f\u0090\u0005\u0017\u0000\u0000\u0090\u0091"+
		"\u0003\n\u0005\u0000\u0091\u0092\u0006\u0005\uffff\uffff\u0000\u0092\u0093"+
		"\u0001\u0000\u0000\u0000\u0093\u0094\u0005\u0018\u0000\u0000\u0094\u00d7"+
		"\u0001\u0000\u0000\u0000\u0095\u0096\u0005\u0017\u0000\u0000\u0096\u0097"+
		"\u0003.\u0017\u0000\u0097\u0098\u0005\u0018\u0000\u0000\u0098\u0099\u0005"+
		"\u001b\u0000\u0000\u0099\u009b\u00036\u001b\u0000\u009a\u009c\u00054\u0000"+
		"\u0000\u009b\u009a\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000"+
		"\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009e\u0005\u001c\u0000"+
		"\u0000\u009e\u009f\u0006\u0005\uffff\uffff\u0000\u009f\u00d7\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a5\u0006\u0005\uffff\uffff\u0000\u00a1\u00a2\u0007"+
		"\u0000\u0000\u0000\u00a2\u00a4\u0006\u0005\uffff\uffff\u0000\u00a3\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000\u00a5\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00ce"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8\u00a9"+
		"\u0005D\u0000\u0000\u00a9\u00cf\u0006\u0005\uffff\uffff\u0000\u00aa\u00ab"+
		"\u0005E\u0000\u0000\u00ab\u00cf\u0006\u0005\uffff\uffff\u0000\u00ac\u00af"+
		"\u0006\u0005\uffff\uffff\u0000\u00ad\u00ae\u0005G\u0000\u0000\u00ae\u00b0"+
		"\u0006\u0005\uffff\uffff\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00b0"+
		"\u00b1\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b1"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3"+
		"\u00cf\u0006\u0005\uffff\uffff\u0000\u00b4\u00b5\u0005\u0017\u0000\u0000"+
		"\u00b5\u00b6\u0003\n\u0005\u0000\u00b6\u00b7\u0005\u0018\u0000\u0000\u00b7"+
		"\u00b8\u0006\u0005\uffff\uffff\u0000\u00b8\u00cf\u0001\u0000\u0000\u0000"+
		"\u00b9\u00ba\u0005\u0017\u0000\u0000\u00ba\u00bb\u0003.\u0017\u0000\u00bb"+
		"\u00bc\u0005\u0018\u0000\u0000\u00bc\u00bd\u0005\u001b\u0000\u0000\u00bd"+
		"\u00bf\u00036\u001b\u0000\u00be\u00c0\u00054\u0000\u0000\u00bf\u00be\u0001"+
		"\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c2\u0005\u001c\u0000\u0000\u00c2\u00c3\u0006"+
		"\u0005\uffff\uffff\u0000\u00c3\u00cf\u0001\u0000\u0000\u0000\u00c4\u00c5"+
		"\u0003\u000e\u0007\u0000\u00c5\u00c6\u0003\u0010\b\u0000\u00c6\u00c7\u0006"+
		"\u0005\uffff\uffff\u0000\u00c7\u00cf\u0001\u0000\u0000\u0000\u00c8\u00c9"+
		"\u0005\u0010\u0000\u0000\u00c9\u00ca\u0005\u0017\u0000\u0000\u00ca\u00cb"+
		"\u0003.\u0017\u0000\u00cb\u00cc\u0005\u0018\u0000\u0000\u00cc\u00cd\u0006"+
		"\u0005\uffff\uffff\u0000\u00cd\u00cf\u0001\u0000\u0000\u0000\u00ce\u00a8"+
		"\u0001\u0000\u0000\u0000\u00ce\u00aa\u0001\u0000\u0000\u0000\u00ce\u00ac"+
		"\u0001\u0000\u0000\u0000\u00ce\u00b4\u0001\u0000\u0000\u0000\u00ce\u00b9"+
		"\u0001\u0000\u0000\u0000\u00ce\u00c4\u0001\u0000\u0000\u0000\u00ce\u00c8"+
		"\u0001\u0000\u0000\u0000\u00cf\u00d7\u0001\u0000\u0000\u0000\u00d0\u00d1"+
		"\u0005\u0017\u0000\u0000\u00d1\u00d2\u0003.\u0017\u0000\u00d2\u00d3\u0005"+
		"\u0018\u0000\u0000\u00d3\u00d4\u0003\u0010\b\u0000\u00d4\u00d5\u0006\u0005"+
		"\uffff\uffff\u0000\u00d5\u00d7\u0001\u0000\u0000\u0000\u00d6\u0083\u0001"+
		"\u0000\u0000\u0000\u00d6\u0086\u0001\u0000\u0000\u0000\u00d6\u0088\u0001"+
		"\u0000\u0000\u0000\u00d6\u008f\u0001\u0000\u0000\u0000\u00d6\u0095\u0001"+
		"\u0000\u0000\u0000\u00d6\u00a0\u0001\u0000\u0000\u0000\u00d6\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d7\u0136\u0001\u0000\u0000\u0000\u00d8\u00d9\n\r"+
		"\u0000\u0000\u00d9\u00da\u0007\u0001\u0000\u0000\u00da\u00db\u0003\n\u0005"+
		"\u000e\u00db\u00dc\u0006\u0005\uffff\uffff\u0000\u00dc\u0135\u0001\u0000"+
		"\u0000\u0000\u00dd\u00de\n\f\u0000\u0000\u00de\u00df\u0007\u0002\u0000"+
		"\u0000\u00df\u00e0\u0003\n\u0005\r\u00e0\u00e1\u0006\u0005\uffff\uffff"+
		"\u0000\u00e1\u0135\u0001\u0000\u0000\u0000\u00e2\u00e3\n\u000b\u0000\u0000"+
		"\u00e3\u00e4\u0007\u0003\u0000\u0000\u00e4\u00e5\u0003\n\u0005\f\u00e5"+
		"\u00e6\u0006\u0005\uffff\uffff\u0000\u00e6\u0135\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e8\n\n\u0000\u0000\u00e8\u00e9\u0007\u0004\u0000\u0000\u00e9"+
		"\u00ea\u0003\n\u0005\u000b\u00ea\u00eb\u0006\u0005\uffff\uffff\u0000\u00eb"+
		"\u0135\u0001\u0000\u0000\u0000\u00ec\u00ed\n\t\u0000\u0000\u00ed\u00ee"+
		"\u0007\u0005\u0000\u0000\u00ee\u00ef\u0003\n\u0005\n\u00ef\u00f0\u0006"+
		"\u0005\uffff\uffff\u0000\u00f0\u0135\u0001\u0000\u0000\u0000\u00f1\u00f2"+
		"\n\b\u0000\u0000\u00f2\u00f3\u0005*\u0000\u0000\u00f3\u00f4\u0003\n\u0005"+
		"\t\u00f4\u00f5\u0006\u0005\uffff\uffff\u0000\u00f5\u0135\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f7\n\u0007\u0000\u0000\u00f7\u00f8\u0005.\u0000\u0000"+
		"\u00f8\u00f9\u0003\n\u0005\b\u00f9\u00fa\u0006\u0005\uffff\uffff\u0000"+
		"\u00fa\u0135\u0001\u0000\u0000\u0000\u00fb\u00fc\n\u0006\u0000\u0000\u00fc"+
		"\u00fd\u0005+\u0000\u0000\u00fd\u00fe\u0003\n\u0005\u0007\u00fe\u00ff"+
		"\u0006\u0005\uffff\uffff\u0000\u00ff\u0135\u0001\u0000\u0000\u0000\u0100"+
		"\u0101\n\u0005\u0000\u0000\u0101\u0102\u0005,\u0000\u0000\u0102\u0103"+
		"\u0003\n\u0005\u0006\u0103\u0104\u0006\u0005\uffff\uffff\u0000\u0104\u0135"+
		"\u0001\u0000\u0000\u0000\u0105\u0106\n\u0004\u0000\u0000\u0106\u0107\u0005"+
		"-\u0000\u0000\u0107\u0108\u0003\n\u0005\u0005\u0108\u0109\u0006\u0005"+
		"\uffff\uffff\u0000\u0109\u0135\u0001\u0000\u0000\u0000\u010a\u010b\n\u0003"+
		"\u0000\u0000\u010b\u010c\u00051\u0000\u0000\u010c\u010d\u0003\n\u0005"+
		"\u0000\u010d\u010e\u00052\u0000\u0000\u010e\u010f\u0003\n\u0005\u0004"+
		"\u010f\u0110\u0006\u0005\uffff\uffff\u0000\u0110\u0135\u0001\u0000\u0000"+
		"\u0000\u0111\u0112\n\u0002\u0000\u0000\u0112\u0113\u0003\u0012\t\u0000"+
		"\u0113\u0114\u0003\n\u0005\u0003\u0114\u0115\u0006\u0005\uffff\uffff\u0000"+
		"\u0115\u0135\u0001\u0000\u0000\u0000\u0116\u0117\n\u0013\u0000\u0000\u0117"+
		"\u0118\u0005\u0019\u0000\u0000\u0118\u0119\u0003\n\u0005\u0000\u0119\u011a"+
		"\u0005\u001a\u0000\u0000\u011a\u011b\u0006\u0005\uffff\uffff\u0000\u011b"+
		"\u0135\u0001\u0000\u0000\u0000\u011c\u011d\n\u0012\u0000\u0000\u011d\u0121"+
		"\u0005\u0017\u0000\u0000\u011e\u011f\u0003\f\u0006\u0000\u011f\u0120\u0006"+
		"\u0005\uffff\uffff\u0000\u0120\u0122\u0001\u0000\u0000\u0000\u0121\u011e"+
		"\u0001\u0000\u0000\u0000\u0121\u0122\u0001\u0000\u0000\u0000\u0122\u0123"+
		"\u0001\u0000\u0000\u0000\u0123\u0124\u0005\u0018\u0000\u0000\u0124\u0135"+
		"\u0006\u0005\uffff\uffff\u0000\u0125\u0126\n\u0011\u0000\u0000\u0126\u0127"+
		"\u0005$\u0000\u0000\u0127\u0135\u0006\u0005\uffff\uffff\u0000\u0128\u0129"+
		"\n\u0010\u0000\u0000\u0129\u012a\u0005&\u0000\u0000\u012a\u0135\u0006"+
		"\u0005\uffff\uffff\u0000\u012b\u012e\n\u0001\u0000\u0000\u012c\u012d\u0005"+
		"4\u0000\u0000\u012d\u012f\u0003\n\u0005\u0000\u012e\u012c\u0001\u0000"+
		"\u0000\u0000\u012f\u0130\u0001\u0000\u0000\u0000\u0130\u012e\u0001\u0000"+
		"\u0000\u0000\u0130\u0131\u0001\u0000\u0000\u0000\u0131\u0132\u0001\u0000"+
		"\u0000\u0000\u0132\u0133\u0006\u0005\uffff\uffff\u0000\u0133\u0135\u0001"+
		"\u0000\u0000\u0000\u0134\u00d8\u0001\u0000\u0000\u0000\u0134\u00dd\u0001"+
		"\u0000\u0000\u0000\u0134\u00e2\u0001\u0000\u0000\u0000\u0134\u00e7\u0001"+
		"\u0000\u0000\u0000\u0134\u00ec\u0001\u0000\u0000\u0000\u0134\u00f1\u0001"+
		"\u0000\u0000\u0000\u0134\u00f6\u0001\u0000\u0000\u0000\u0134\u00fb\u0001"+
		"\u0000\u0000\u0000\u0134\u0100\u0001\u0000\u0000\u0000\u0134\u0105\u0001"+
		"\u0000\u0000\u0000\u0134\u010a\u0001\u0000\u0000\u0000\u0134\u0111\u0001"+
		"\u0000\u0000\u0000\u0134\u0116\u0001\u0000\u0000\u0000\u0134\u011c\u0001"+
		"\u0000\u0000\u0000\u0134\u0125\u0001\u0000\u0000\u0000\u0134\u0128\u0001"+
		"\u0000\u0000\u0000\u0134\u012b\u0001\u0000\u0000\u0000\u0135\u0138\u0001"+
		"\u0000\u0000\u0000\u0136\u0134\u0001\u0000\u0000\u0000\u0136\u0137\u0001"+
		"\u0000\u0000\u0000\u0137\u000b\u0001\u0000\u0000\u0000\u0138\u0136\u0001"+
		"\u0000\u0000\u0000\u0139\u013a\u0006\u0006\uffff\uffff\u0000\u013a\u013b"+
		"\u0003\n\u0005\u0000\u013b\u0142\u0006\u0006\uffff\uffff\u0000\u013c\u013d"+
		"\u00054\u0000\u0000\u013d\u013e\u0003\n\u0005\u0000\u013e\u013f\u0006"+
		"\u0006\uffff\uffff\u0000\u013f\u0141\u0001\u0000\u0000\u0000\u0140\u013c"+
		"\u0001\u0000\u0000\u0000\u0141\u0144\u0001\u0000\u0000\u0000\u0142\u0140"+
		"\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000\u0000\u0000\u0143\r\u0001"+
		"\u0000\u0000\u0000\u0144\u0142\u0001\u0000\u0000\u0000\u0145\u0146\u0006"+
		"\u0007\uffff\uffff\u0000\u0146\u0147\u0005*\u0000\u0000\u0147\u0158\u0006"+
		"\u0007\uffff\uffff\u0000\u0148\u0149\u0006\u0007\uffff\uffff\u0000\u0149"+
		"\u014a\u0005\'\u0000\u0000\u014a\u0158\u0006\u0007\uffff\uffff\u0000\u014b"+
		"\u014c\u0006\u0007\uffff\uffff\u0000\u014c\u014d\u0005#\u0000\u0000\u014d"+
		"\u0158\u0006\u0007\uffff\uffff\u0000\u014e\u014f\u0006\u0007\uffff\uffff"+
		"\u0000\u014f\u0150\u0005%\u0000\u0000\u0150\u0158\u0006\u0007\uffff\uffff"+
		"\u0000\u0151\u0152\u0006\u0007\uffff\uffff\u0000\u0152\u0153\u00050\u0000"+
		"\u0000\u0153\u0158\u0006\u0007\uffff\uffff\u0000\u0154\u0155\u0006\u0007"+
		"\uffff\uffff\u0000\u0155\u0156\u0005/\u0000\u0000\u0156\u0158\u0006\u0007"+
		"\uffff\uffff\u0000\u0157\u0145\u0001\u0000\u0000\u0000\u0157\u0148\u0001"+
		"\u0000\u0000\u0000\u0157\u014b\u0001\u0000\u0000\u0000\u0157\u014e\u0001"+
		"\u0000\u0000\u0000\u0157\u0151\u0001\u0000\u0000\u0000\u0157\u0154\u0001"+
		"\u0000\u0000\u0000\u0158\u000f\u0001\u0000\u0000\u0000\u0159\u015a\u0005"+
		"\u0017\u0000\u0000\u015a\u015b\u0003.\u0017\u0000\u015b\u015c\u0005\u0018"+
		"\u0000\u0000\u015c\u015d\u0003\u0010\b\u0000\u015d\u015e\u0006\b\uffff"+
		"\uffff\u0000\u015e\u0165\u0001\u0000\u0000\u0000\u015f\u0160\u0003\n\u0005"+
		"\u0000\u0160\u0161\u0006\b\uffff\uffff\u0000\u0161\u0165\u0001\u0000\u0000"+
		"\u0000\u0162\u0163\u0005F\u0000\u0000\u0163\u0165\u0006\b\uffff\uffff"+
		"\u0000\u0164\u0159\u0001\u0000\u0000\u0000\u0164\u015f\u0001\u0000\u0000"+
		"\u0000\u0164\u0162\u0001\u0000\u0000\u0000\u0165\u0011\u0001\u0000\u0000"+
		"\u0000\u0166\u0167\u00055\u0000\u0000\u0167\u017d\u0006\t\uffff\uffff"+
		"\u0000\u0168\u0169\u00056\u0000\u0000\u0169\u017d\u0006\t\uffff\uffff"+
		"\u0000\u016a\u016b\u00057\u0000\u0000\u016b\u017d\u0006\t\uffff\uffff"+
		"\u0000\u016c\u016d\u00058\u0000\u0000\u016d\u017d\u0006\t\uffff\uffff"+
		"\u0000\u016e\u016f\u00059\u0000\u0000\u016f\u017d\u0006\t\uffff\uffff"+
		"\u0000\u0170\u0171\u0005:\u0000\u0000\u0171\u017d\u0006\t\uffff\uffff"+
		"\u0000\u0172\u0173\u0005;\u0000\u0000\u0173\u017d\u0006\t\uffff\uffff"+
		"\u0000\u0174\u0175\u0005<\u0000\u0000\u0175\u017d\u0006\t\uffff\uffff"+
		"\u0000\u0176\u0177\u0005=\u0000\u0000\u0177\u017d\u0006\t\uffff\uffff"+
		"\u0000\u0178\u0179\u0005>\u0000\u0000\u0179\u017d\u0006\t\uffff\uffff"+
		"\u0000\u017a\u017b\u0005?\u0000\u0000\u017b\u017d\u0006\t\uffff\uffff"+
		"\u0000\u017c\u0166\u0001\u0000\u0000\u0000\u017c\u0168\u0001\u0000\u0000"+
		"\u0000\u017c\u016a\u0001\u0000\u0000\u0000\u017c\u016c\u0001\u0000\u0000"+
		"\u0000\u017c\u016e\u0001\u0000\u0000\u0000\u017c\u0170\u0001\u0000\u0000"+
		"\u0000\u017c\u0172\u0001\u0000\u0000\u0000\u017c\u0174\u0001\u0000\u0000"+
		"\u0000\u017c\u0176\u0001\u0000\u0000\u0000\u017c\u0178\u0001\u0000\u0000"+
		"\u0000\u017c\u017a\u0001\u0000\u0000\u0000\u017d\u0013\u0001\u0000\u0000"+
		"\u0000\u017e\u0182\u0003\u0016\u000b\u0000\u017f\u0180\u0003\u001a\r\u0000"+
		"\u0180\u0181\u0006\n\uffff\uffff\u0000\u0181\u0183\u0001\u0000\u0000\u0000"+
		"\u0182\u017f\u0001\u0000\u0000\u0000\u0182\u0183\u0001\u0000\u0000\u0000"+
		"\u0183\u0184\u0001\u0000\u0000\u0000\u0184\u0185\u00053\u0000\u0000\u0185"+
		"\u0186\u0006\n\uffff\uffff\u0000\u0186\u0015\u0001\u0000\u0000\u0000\u0187"+
		"\u018b\u0003\u0018\f\u0000\u0188\u018a\u0003\u0018\f\u0000\u0189\u0188"+
		"\u0001\u0000\u0000\u0000\u018a\u018d\u0001\u0000\u0000\u0000\u018b\u0189"+
		"\u0001\u0000\u0000\u0000\u018b\u018c\u0001\u0000\u0000\u0000\u018c\u018e"+
		"\u0001\u0000\u0000\u0000\u018d\u018b\u0001\u0000\u0000\u0000\u018e\u018f"+
		"\u0006\u000b\uffff\uffff\u0000\u018f\u0017\u0001\u0000\u0000\u0000\u0190"+
		"\u0191\u0005\u0012\u0000\u0000\u0191\u0198\u0006\f\uffff\uffff\u0000\u0192"+
		"\u0193\u0005\u0003\u0000\u0000\u0193\u0198\u0006\f\uffff\uffff\u0000\u0194"+
		"\u0195\u0003\u001e\u000f\u0000\u0195\u0196\u0006\f\uffff\uffff\u0000\u0196"+
		"\u0198\u0001\u0000\u0000\u0000\u0197\u0190\u0001\u0000\u0000\u0000\u0197"+
		"\u0192\u0001\u0000\u0000\u0000\u0197\u0194\u0001\u0000\u0000\u0000\u0198"+
		"\u0019\u0001\u0000\u0000\u0000\u0199\u019e\u0003\u001c\u000e\u0000\u019a"+
		"\u019b\u00054\u0000\u0000\u019b\u019d\u0003\u001c\u000e\u0000\u019c\u019a"+
		"\u0001\u0000\u0000\u0000\u019d\u01a0\u0001\u0000\u0000\u0000\u019e\u019c"+
		"\u0001\u0000\u0000\u0000\u019e\u019f\u0001\u0000\u0000\u0000\u019f\u01a1"+
		"\u0001\u0000\u0000\u0000\u01a0\u019e\u0001\u0000\u0000\u0000\u01a1\u01a2"+
		"\u0006\r\uffff\uffff\u0000\u01a2\u001b\u0001\u0000\u0000\u0000\u01a3\u01a8"+
		"\u0003\"\u0011\u0000\u01a4\u01a5\u00055\u0000\u0000\u01a5\u01a6\u0003"+
		"4\u001a\u0000\u01a6\u01a7\u0006\u000e\uffff\uffff\u0000\u01a7\u01a9\u0001"+
		"\u0000\u0000\u0000\u01a8\u01a4\u0001\u0000\u0000\u0000\u01a8\u01a9\u0001"+
		"\u0000\u0000\u0000\u01a9\u01aa\u0001\u0000\u0000\u0000\u01aa\u01ab\u0006"+
		"\u000e\uffff\uffff\u0000\u01ab\u001d\u0001\u0000\u0000\u0000\u01ac\u01ad"+
		"\u0005\u0014\u0000\u0000\u01ad\u01c3\u0006\u000f\uffff\uffff\u0000\u01ae"+
		"\u01af\u0005\u0002\u0000\u0000\u01af\u01c3\u0006\u000f\uffff\uffff\u0000"+
		"\u01b0\u01b1\u0005\u000e\u0000\u0000\u01b1\u01c3\u0006\u000f\uffff\uffff"+
		"\u0000\u01b2\u01b3\u0005\u000b\u0000\u0000\u01b3\u01c3\u0006\u000f\uffff"+
		"\uffff\u0000\u01b4\u01b5\u0005\f\u0000\u0000\u01b5\u01c3\u0006\u000f\uffff"+
		"\uffff\u0000\u01b6\u01b7\u0005\b\u0000\u0000\u01b7\u01c3\u0006\u000f\uffff"+
		"\uffff\u0000\u01b8\u01b9\u0005\u0006\u0000\u0000\u01b9\u01c3\u0006\u000f"+
		"\uffff\uffff\u0000\u01ba\u01bb\u0005\u000f\u0000\u0000\u01bb\u01c3\u0006"+
		"\u000f\uffff\uffff\u0000\u01bc\u01bd\u0005\u0013\u0000\u0000\u01bd\u01c3"+
		"\u0006\u000f\uffff\uffff\u0000\u01be\u01bf\u0005\u0016\u0000\u0000\u01bf"+
		"\u01c3\u0006\u000f\uffff\uffff\u0000\u01c0\u01c1\u0005D\u0000\u0000\u01c1"+
		"\u01c3\u0006\u000f\uffff\uffff\u0000\u01c2\u01ac\u0001\u0000\u0000\u0000"+
		"\u01c2\u01ae\u0001\u0000\u0000\u0000\u01c2\u01b0\u0001\u0000\u0000\u0000"+
		"\u01c2\u01b2\u0001\u0000\u0000\u0000\u01c2\u01b4\u0001\u0000\u0000\u0000"+
		"\u01c2\u01b6\u0001\u0000\u0000\u0000\u01c2\u01b8\u0001\u0000\u0000\u0000"+
		"\u01c2\u01ba\u0001\u0000\u0000\u0000\u01c2\u01bc\u0001\u0000\u0000\u0000"+
		"\u01c2\u01be\u0001\u0000\u0000\u0000\u01c2\u01c0\u0001\u0000\u0000\u0000"+
		"\u01c3\u001f\u0001\u0000\u0000\u0000\u01c4\u01c5\u0003\u001e\u000f\u0000"+
		"\u01c5\u01c6\u0006\u0010\uffff\uffff\u0000\u01c6\u01ca\u0001\u0000\u0000"+
		"\u0000\u01c7\u01c8\u0005\u0003\u0000\u0000\u01c8\u01ca\u0006\u0010\uffff"+
		"\uffff\u0000\u01c9\u01c4\u0001\u0000\u0000\u0000\u01c9\u01c7\u0001\u0000"+
		"\u0000\u0000\u01ca\u01ce\u0001\u0000\u0000\u0000\u01cb\u01cc\u0003 \u0010"+
		"\u0000\u01cc\u01cd\u0006\u0010\uffff\uffff\u0000\u01cd\u01cf\u0001\u0000"+
		"\u0000\u0000\u01ce\u01cb\u0001\u0000\u0000\u0000\u01ce\u01cf\u0001\u0000"+
		"\u0000\u0000\u01cf!\u0001\u0000\u0000\u0000\u01d0\u01d1\u0003&\u0013\u0000"+
		"\u01d1\u01d2\u0006\u0011\uffff\uffff\u0000\u01d2\u01d4\u0001\u0000\u0000"+
		"\u0000\u01d3\u01d0\u0001\u0000\u0000\u0000\u01d3\u01d4\u0001\u0000\u0000"+
		"\u0000\u01d4\u01d5\u0001\u0000\u0000\u0000\u01d5\u01d6\u0003$\u0012\u0000"+
		"\u01d6\u01d7\u0006\u0011\uffff\uffff\u0000\u01d7#\u0001\u0000\u0000\u0000"+
		"\u01d8\u01d9\u0006\u0012\uffff\uffff\u0000\u01d9\u01da\u0005D\u0000\u0000"+
		"\u01da\u01e1\u0006\u0012\uffff\uffff\u0000\u01db\u01dc\u0005\u0017\u0000"+
		"\u0000\u01dc\u01dd\u0003\"\u0011\u0000\u01dd\u01de\u0005\u0018\u0000\u0000"+
		"\u01de\u01df\u0006\u0012\uffff\uffff\u0000\u01df\u01e1\u0001\u0000\u0000"+
		"\u0000\u01e0\u01d8\u0001\u0000\u0000\u0000\u01e0\u01db\u0001\u0000\u0000"+
		"\u0000\u01e1\u01f9\u0001\u0000\u0000\u0000\u01e2\u01e3\n\u0002\u0000\u0000"+
		"\u01e3\u01e7\u0005\u0019\u0000\u0000\u01e4\u01e5\u0003\n\u0005\u0000\u01e5"+
		"\u01e6\u0006\u0012\uffff\uffff\u0000\u01e6\u01e8\u0001\u0000\u0000\u0000"+
		"\u01e7\u01e4\u0001\u0000\u0000\u0000\u01e7\u01e8\u0001\u0000\u0000\u0000"+
		"\u01e8\u01e9\u0001\u0000\u0000\u0000\u01e9\u01ea\u0005\u001a\u0000\u0000"+
		"\u01ea\u01f8\u0006\u0012\uffff\uffff\u0000\u01eb\u01ec\n\u0001\u0000\u0000"+
		"\u01ec\u01f3\u0005\u0017\u0000\u0000\u01ed\u01ee\u0003(\u0014\u0000\u01ee"+
		"\u01ef\u0006\u0012\uffff\uffff\u0000\u01ef\u01f4\u0001\u0000\u0000\u0000"+
		"\u01f0\u01f1\u0003,\u0016\u0000\u01f1\u01f2\u0006\u0012\uffff\uffff\u0000"+
		"\u01f2\u01f4\u0001\u0000\u0000\u0000\u01f3\u01ed\u0001\u0000\u0000\u0000"+
		"\u01f3\u01f0\u0001\u0000\u0000\u0000\u01f3\u01f4\u0001\u0000\u0000\u0000"+
		"\u01f4\u01f5\u0001\u0000\u0000\u0000\u01f5\u01f6\u0005\u0018\u0000\u0000"+
		"\u01f6\u01f8\u0006\u0012\uffff\uffff\u0000\u01f7\u01e2\u0001\u0000\u0000"+
		"\u0000\u01f7\u01eb\u0001\u0000\u0000\u0000\u01f8\u01fb\u0001\u0000\u0000"+
		"\u0000\u01f9\u01f7\u0001\u0000\u0000\u0000\u01f9\u01fa\u0001\u0000\u0000"+
		"\u0000\u01fa%\u0001\u0000\u0000\u0000\u01fb\u01f9\u0001\u0000\u0000\u0000"+
		"\u01fc\u0200\u0005\'\u0000\u0000\u01fd\u01ff\u0005\u0003\u0000\u0000\u01fe"+
		"\u01fd\u0001\u0000\u0000\u0000\u01ff\u0202\u0001\u0000\u0000\u0000\u0200"+
		"\u01fe\u0001\u0000\u0000\u0000\u0200\u0201\u0001\u0000\u0000\u0000\u0201"+
		"\u0203\u0001\u0000\u0000\u0000\u0202\u0200\u0001\u0000\u0000\u0000\u0203"+
		"\u0205\u0006\u0013\uffff\uffff\u0000\u0204\u01fc\u0001\u0000\u0000\u0000"+
		"\u0205\u0206\u0001\u0000\u0000\u0000\u0206\u0204\u0001\u0000\u0000\u0000"+
		"\u0206\u0207\u0001\u0000\u0000\u0000\u0207\'\u0001\u0000\u0000\u0000\u0208"+
		"\u020c\u0003*\u0015\u0000\u0209\u020b\u0003*\u0015\u0000\u020a\u0209\u0001"+
		"\u0000\u0000\u0000\u020b\u020e\u0001\u0000\u0000\u0000\u020c\u020a\u0001"+
		"\u0000\u0000\u0000\u020c\u020d\u0001\u0000\u0000\u0000\u020d\u020f\u0001"+
		"\u0000\u0000\u0000\u020e\u020c\u0001\u0000\u0000\u0000\u020f\u0210\u0006"+
		"\u0014\uffff\uffff\u0000\u0210)\u0001\u0000\u0000\u0000\u0211\u0218\u0003"+
		"\u0016\u000b\u0000\u0212\u0213\u0003\"\u0011\u0000\u0213\u0214\u0006\u0015"+
		"\uffff\uffff\u0000\u0214\u0219\u0001\u0000\u0000\u0000\u0215\u0216\u0003"+
		"0\u0018\u0000\u0216\u0217\u0006\u0015\uffff\uffff\u0000\u0217\u0219\u0001"+
		"\u0000\u0000\u0000\u0218\u0212\u0001\u0000\u0000\u0000\u0218\u0215\u0001"+
		"\u0000\u0000\u0000\u0219+\u0001\u0000\u0000\u0000\u021a\u021e\u0005D\u0000"+
		"\u0000\u021b\u021d\u0005D\u0000\u0000\u021c\u021b\u0001\u0000\u0000\u0000"+
		"\u021d\u0220\u0001\u0000\u0000\u0000\u021e\u021c\u0001\u0000\u0000\u0000"+
		"\u021e\u021f\u0001\u0000\u0000\u0000\u021f\u0221\u0001\u0000\u0000\u0000"+
		"\u0220\u021e\u0001\u0000\u0000\u0000\u0221\u0222\u0006\u0016\uffff\uffff"+
		"\u0000\u0222-\u0001\u0000\u0000\u0000\u0223\u0227\u0003 \u0010\u0000\u0224"+
		"\u0225\u00030\u0018\u0000\u0225\u0226\u0006\u0017\uffff\uffff\u0000\u0226"+
		"\u0228\u0001\u0000\u0000\u0000\u0227\u0224\u0001\u0000\u0000\u0000\u0227"+
		"\u0228\u0001\u0000\u0000\u0000\u0228\u0229\u0001\u0000\u0000\u0000\u0229"+
		"\u022a\u0006\u0017\uffff\uffff\u0000\u022a/\u0001\u0000\u0000\u0000\u022b"+
		"\u022c\u0003&\u0013\u0000\u022c\u022d\u0006\u0018\uffff\uffff\u0000\u022d"+
		"\u0236\u0001\u0000\u0000\u0000\u022e\u022f\u00032\u0019\u0000\u022f\u0230"+
		"\u0006\u0018\uffff\uffff\u0000\u0230\u0236\u0001\u0000\u0000\u0000\u0231"+
		"\u0232\u0003&\u0013\u0000\u0232\u0233\u00032\u0019\u0000\u0233\u0234\u0006"+
		"\u0018\uffff\uffff\u0000\u0234\u0236\u0001\u0000\u0000\u0000\u0235\u022b"+
		"\u0001\u0000\u0000\u0000\u0235\u022e\u0001\u0000\u0000\u0000\u0235\u0231"+
		"\u0001\u0000\u0000\u0000\u02361\u0001\u0000\u0000\u0000\u0237\u0238\u0006"+
		"\u0019\uffff\uffff\u0000\u0238\u023c\u0005\u0019\u0000\u0000\u0239\u023a"+
		"\u0003\n\u0005\u0000\u023a\u023b\u0006\u0019\uffff\uffff\u0000\u023b\u023d"+
		"\u0001\u0000\u0000\u0000\u023c\u0239\u0001\u0000\u0000\u0000\u023c\u023d"+
		"\u0001\u0000\u0000\u0000\u023d\u023e\u0001\u0000\u0000\u0000\u023e\u023f"+
		"\u0005\u001a\u0000\u0000\u023f\u024c\u0006\u0019\uffff\uffff\u0000\u0240"+
		"\u0247\u0005\u0017\u0000\u0000\u0241\u0242\u00030\u0018\u0000\u0242\u0243"+
		"\u0006\u0019\uffff\uffff\u0000\u0243\u0248\u0001\u0000\u0000\u0000\u0244"+
		"\u0245\u0003(\u0014\u0000\u0245\u0246\u0006\u0019\uffff\uffff\u0000\u0246"+
		"\u0248\u0001\u0000\u0000\u0000\u0247\u0241\u0001\u0000\u0000\u0000\u0247"+
		"\u0244\u0001\u0000\u0000\u0000\u0247\u0248\u0001\u0000\u0000\u0000\u0248"+
		"\u0249\u0001\u0000\u0000\u0000\u0249\u024a\u0005\u0018\u0000\u0000\u024a"+
		"\u024c\u0006\u0019\uffff\uffff\u0000\u024b\u0237\u0001\u0000\u0000\u0000"+
		"\u024b\u0240\u0001\u0000\u0000\u0000\u024c\u0261\u0001\u0000\u0000\u0000"+
		"\u024d\u024e\n\u0002\u0000\u0000\u024e\u0252\u0005\u0019\u0000\u0000\u024f"+
		"\u0250\u0003\n\u0005\u0000\u0250\u0251\u0006\u0019\uffff\uffff\u0000\u0251"+
		"\u0253\u0001\u0000\u0000\u0000\u0252\u024f\u0001\u0000\u0000\u0000\u0252"+
		"\u0253\u0001\u0000\u0000\u0000\u0253\u0254\u0001\u0000\u0000\u0000\u0254"+
		"\u0255\u0005\u001a\u0000\u0000\u0255\u0260\u0006\u0019\uffff\uffff\u0000"+
		"\u0256\u0257\n\u0001\u0000\u0000\u0257\u025b\u0005\u0017\u0000\u0000\u0258"+
		"\u0259\u0003(\u0014\u0000\u0259\u025a\u0006\u0019\uffff\uffff\u0000\u025a"+
		"\u025c\u0001\u0000\u0000\u0000\u025b\u0258\u0001\u0000\u0000\u0000\u025b"+
		"\u025c\u0001\u0000\u0000\u0000\u025c\u025d\u0001\u0000\u0000\u0000\u025d"+
		"\u025e\u0005\u0018\u0000\u0000\u025e\u0260\u0006\u0019\uffff\uffff\u0000"+
		"\u025f\u024d\u0001\u0000\u0000\u0000\u025f\u0256\u0001\u0000\u0000\u0000"+
		"\u0260\u0263\u0001\u0000\u0000\u0000\u0261\u025f\u0001\u0000\u0000\u0000"+
		"\u0261\u0262\u0001\u0000\u0000\u0000\u02623\u0001\u0000\u0000\u0000\u0263"+
		"\u0261\u0001\u0000\u0000\u0000\u0264\u0265\u0003\n\u0005\u0000\u0265\u0266"+
		"\u0006\u001a\uffff\uffff\u0000\u0266\u0270\u0001\u0000\u0000\u0000\u0267"+
		"\u0268\u0005\u001b\u0000\u0000\u0268\u026a\u00036\u001b\u0000\u0269\u026b"+
		"\u00054\u0000\u0000\u026a\u0269\u0001\u0000\u0000\u0000\u026a\u026b\u0001"+
		"\u0000\u0000\u0000\u026b\u026c\u0001\u0000\u0000\u0000\u026c\u026d\u0005"+
		"\u001c\u0000\u0000\u026d\u026e\u0006\u001a\uffff\uffff\u0000\u026e\u0270"+
		"\u0001\u0000\u0000\u0000\u026f\u0264\u0001\u0000\u0000\u0000\u026f\u0267"+
		"\u0001\u0000\u0000\u0000\u02705\u0001\u0000\u0000\u0000\u0271\u0279\u0006"+
		"\u001b\uffff\uffff\u0000\u0272\u0273\u00038\u001c\u0000\u0273\u0274\u0003"+
		"4\u001a\u0000\u0274\u0275\u0006\u001b\uffff\uffff\u0000\u0275\u027a\u0001"+
		"\u0000\u0000\u0000\u0276\u0277\u00034\u001a\u0000\u0277\u0278\u0006\u001b"+
		"\uffff\uffff\u0000\u0278\u027a\u0001\u0000\u0000\u0000\u0279\u0272\u0001"+
		"\u0000\u0000\u0000\u0279\u0276\u0001\u0000\u0000\u0000\u027a\u0287\u0001"+
		"\u0000\u0000\u0000\u027b\u0283\u00054\u0000\u0000\u027c\u027d\u00038\u001c"+
		"\u0000\u027d\u027e\u00034\u001a\u0000\u027e\u027f\u0006\u001b\uffff\uffff"+
		"\u0000\u027f\u0284\u0001\u0000\u0000\u0000\u0280\u0281\u00034\u001a\u0000"+
		"\u0281\u0282\u0006\u001b\uffff\uffff\u0000\u0282\u0284\u0001\u0000\u0000"+
		"\u0000\u0283\u027c\u0001\u0000\u0000\u0000\u0283\u0280\u0001\u0000\u0000"+
		"\u0000\u0284\u0286\u0001\u0000\u0000\u0000\u0285\u027b\u0001\u0000\u0000"+
		"\u0000\u0286\u0289\u0001\u0000\u0000\u0000\u0287\u0285\u0001\u0000\u0000"+
		"\u0000\u0287\u0288\u0001\u0000\u0000\u0000\u02887\u0001\u0000\u0000\u0000"+
		"\u0289\u0287\u0001\u0000\u0000\u0000\u028a\u028c\u0003:\u001d\u0000\u028b"+
		"\u028a\u0001\u0000\u0000\u0000\u028c\u028d\u0001\u0000\u0000\u0000\u028d"+
		"\u028b\u0001\u0000\u0000\u0000\u028d\u028e\u0001\u0000\u0000\u0000\u028e"+
		"\u028f\u0001\u0000\u0000\u0000\u028f\u0290\u00055\u0000\u0000\u0290\u0291"+
		"\u0006\u001c\uffff\uffff\u0000\u02919\u0001\u0000\u0000\u0000\u0292\u0293"+
		"\u0005\u0019\u0000\u0000\u0293\u0294\u0003\n\u0005\u0000\u0294\u0295\u0005"+
		"\u001a\u0000\u0000\u0295\u0296\u0006\u001d\uffff\uffff\u0000\u0296\u029b"+
		"\u0001\u0000\u0000\u0000\u0297\u0298\u0005C\u0000\u0000\u0298\u0299\u0005"+
		"D\u0000\u0000\u0299\u029b\u0006\u001d\uffff\uffff\u0000\u029a\u0292\u0001"+
		"\u0000\u0000\u0000\u029a\u0297\u0001\u0000\u0000\u0000\u029b;\u0001\u0000"+
		"\u0000\u0000\u029c\u029d\u0003>\u001f\u0000\u029d\u029e\u0006\u001e\uffff"+
		"\uffff\u0000\u029e\u02ac\u0001\u0000\u0000\u0000\u029f\u02a0\u0003B!\u0000"+
		"\u02a0\u02a1\u0006\u001e\uffff\uffff\u0000\u02a1\u02ac\u0001\u0000\u0000"+
		"\u0000\u02a2\u02a3\u0003D\"\u0000\u02a3\u02a4\u0006\u001e\uffff\uffff"+
		"\u0000\u02a4\u02ac\u0001\u0000\u0000\u0000\u02a5\u02a6\u0003F#\u0000\u02a6"+
		"\u02a7\u0006\u001e\uffff\uffff\u0000\u02a7\u02ac\u0001\u0000\u0000\u0000"+
		"\u02a8\u02a9\u0003N\'\u0000\u02a9\u02aa\u0006\u001e\uffff\uffff\u0000"+
		"\u02aa\u02ac\u0001\u0000\u0000\u0000\u02ab\u029c\u0001\u0000\u0000\u0000"+
		"\u02ab\u029f\u0001\u0000\u0000\u0000\u02ab\u02a2\u0001\u0000\u0000\u0000"+
		"\u02ab\u02a5\u0001\u0000\u0000\u0000\u02ab\u02a8\u0001\u0000\u0000\u0000"+
		"\u02ac=\u0001\u0000\u0000\u0000\u02ad\u02b5\u0005\u001b\u0000\u0000\u02ae"+
		"\u02b0\u0003@ \u0000\u02af\u02ae\u0001\u0000\u0000\u0000\u02b0\u02b1\u0001"+
		"\u0000\u0000\u0000\u02b1\u02af\u0001\u0000\u0000\u0000\u02b1\u02b2\u0001"+
		"\u0000\u0000\u0000\u02b2\u02b3\u0001\u0000\u0000\u0000\u02b3\u02b4\u0006"+
		"\u001f\uffff\uffff\u0000\u02b4\u02b6\u0001\u0000\u0000\u0000\u02b5\u02af"+
		"\u0001\u0000\u0000\u0000\u02b5\u02b6\u0001\u0000\u0000\u0000\u02b6\u02b7"+
		"\u0001\u0000\u0000\u0000\u02b7\u02b8\u0005\u001c\u0000\u0000\u02b8\u02b9"+
		"\u0006\u001f\uffff\uffff\u0000\u02b9?\u0001\u0000\u0000\u0000\u02ba\u02bb"+
		"\u0003<\u001e\u0000\u02bb\u02bc\u0006 \uffff\uffff\u0000\u02bc\u02c1\u0001"+
		"\u0000\u0000\u0000\u02bd\u02be\u0003\u0014\n\u0000\u02be\u02bf\u0006 "+
		"\uffff\uffff\u0000\u02bf\u02c1\u0001\u0000\u0000\u0000\u02c0\u02ba\u0001"+
		"\u0000\u0000\u0000\u02c0\u02bd\u0001\u0000\u0000\u0000\u02c1A\u0001\u0000"+
		"\u0000\u0000\u02c2\u02c3\u0003\n\u0005\u0000\u02c3\u02c4\u0006!\uffff"+
		"\uffff\u0000\u02c4\u02c6\u0001\u0000\u0000\u0000\u02c5\u02c2\u0001\u0000"+
		"\u0000\u0000\u02c5\u02c6\u0001\u0000\u0000\u0000\u02c6\u02c7\u0001\u0000"+
		"\u0000\u0000\u02c7\u02c8\u00053\u0000\u0000\u02c8\u02c9\u0006!\uffff\uffff"+
		"\u0000\u02c9C\u0001\u0000\u0000\u0000\u02ca\u02cb\u0005\n\u0000\u0000"+
		"\u02cb\u02cc\u0005\u0017\u0000\u0000\u02cc\u02cd\u0003\n\u0005\u0000\u02cd"+
		"\u02ce\u0005\u0018\u0000\u0000\u02ce\u02d3\u0003<\u001e\u0000\u02cf\u02d0"+
		"\u0005\u0007\u0000\u0000\u02d0\u02d1\u0003<\u001e\u0000\u02d1\u02d2\u0006"+
		"\"\uffff\uffff\u0000\u02d2\u02d4\u0001\u0000\u0000\u0000\u02d3\u02cf\u0001"+
		"\u0000\u0000\u0000\u02d3\u02d4\u0001\u0000\u0000\u0000\u02d4\u02d5\u0001"+
		"\u0000\u0000\u0000\u02d5\u02d6\u0006\"\uffff\uffff\u0000\u02d6E\u0001"+
		"\u0000\u0000\u0000\u02d7\u02d8\u0005\u0015\u0000\u0000\u02d8\u02d9\u0005"+
		"\u0017\u0000\u0000\u02d9\u02da\u0003\n\u0005\u0000\u02da\u02db\u0005\u0018"+
		"\u0000\u0000\u02db\u02dc\u0003<\u001e\u0000\u02dc\u02dd\u0006#\uffff\uffff"+
		"\u0000\u02dd\u02ef\u0001\u0000\u0000\u0000\u02de\u02df\u0005\u0005\u0000"+
		"\u0000\u02df\u02e0\u0003<\u001e\u0000\u02e0\u02e1\u0005\u0015\u0000\u0000"+
		"\u02e1\u02e2\u0005\u0017\u0000\u0000\u02e2\u02e3\u0003\n\u0005\u0000\u02e3"+
		"\u02e4\u0005\u0018\u0000\u0000\u02e4\u02e5\u00053\u0000\u0000\u02e5\u02e6"+
		"\u0006#\uffff\uffff\u0000\u02e6\u02ef\u0001\u0000\u0000\u0000\u02e7\u02e8"+
		"\u0005\t\u0000\u0000\u02e8\u02e9\u0005\u0017\u0000\u0000\u02e9\u02ea\u0003"+
		"H$\u0000\u02ea\u02eb\u0005\u0018\u0000\u0000\u02eb\u02ec\u0003<\u001e"+
		"\u0000\u02ec\u02ed\u0006#\uffff\uffff\u0000\u02ed\u02ef\u0001\u0000\u0000"+
		"\u0000\u02ee\u02d7\u0001\u0000\u0000\u0000\u02ee\u02de\u0001\u0000\u0000"+
		"\u0000\u02ee\u02e7\u0001\u0000\u0000\u0000\u02efG\u0001\u0000\u0000\u0000"+
		"\u02f0\u02f1\u0003J%\u0000\u02f1\u0301\u00053\u0000\u0000\u02f2\u02f3"+
		"\u0003L&\u0000\u02f3\u02f4\u00053\u0000\u0000\u02f4\u02f5\u0003L&\u0000"+
		"\u02f5\u02f6\u0006$\uffff\uffff\u0000\u02f6\u0302\u0001\u0000\u0000\u0000"+
		"\u02f7\u02f8\u0003L&\u0000\u02f8\u02f9\u00053\u0000\u0000\u02f9\u02fa"+
		"\u0006$\uffff\uffff\u0000\u02fa\u0302\u0001\u0000\u0000\u0000\u02fb\u02fc"+
		"\u00053\u0000\u0000\u02fc\u02fd\u0003L&\u0000\u02fd\u02fe\u0006$\uffff"+
		"\uffff\u0000\u02fe\u0302\u0001\u0000\u0000\u0000\u02ff\u0300\u00053\u0000"+
		"\u0000\u0300\u0302\u0006$\uffff\uffff\u0000\u0301\u02f2\u0001\u0000\u0000"+
		"\u0000\u0301\u02f7\u0001\u0000\u0000\u0000\u0301\u02fb\u0001\u0000\u0000"+
		"\u0000\u0301\u02ff\u0001\u0000\u0000\u0000\u0302\u0329\u0001\u0000\u0000"+
		"\u0000\u0303\u0304\u0003\n\u0005\u0000\u0304\u0314\u00053\u0000\u0000"+
		"\u0305\u0306\u0003L&\u0000\u0306\u0307\u00053\u0000\u0000\u0307\u0308"+
		"\u0003L&\u0000\u0308\u0309\u0006$\uffff\uffff\u0000\u0309\u0315\u0001"+
		"\u0000\u0000\u0000\u030a\u030b\u0003L&\u0000\u030b\u030c\u00053\u0000"+
		"\u0000\u030c\u030d\u0006$\uffff\uffff\u0000\u030d\u0315\u0001\u0000\u0000"+
		"\u0000\u030e\u030f\u00053\u0000\u0000\u030f\u0310\u0003L&\u0000\u0310"+
		"\u0311\u0006$\uffff\uffff\u0000\u0311\u0315\u0001\u0000\u0000\u0000\u0312"+
		"\u0313\u00053\u0000\u0000\u0313\u0315\u0006$\uffff\uffff\u0000\u0314\u0305"+
		"\u0001\u0000\u0000\u0000\u0314\u030a\u0001\u0000\u0000\u0000\u0314\u030e"+
		"\u0001\u0000\u0000\u0000\u0314\u0312\u0001\u0000\u0000\u0000\u0315\u0329"+
		"\u0001\u0000\u0000\u0000\u0316\u0326\u00053\u0000\u0000\u0317\u0318\u0003"+
		"L&\u0000\u0318\u0319\u00053\u0000\u0000\u0319\u031a\u0003L&\u0000\u031a"+
		"\u031b\u0006$\uffff\uffff\u0000\u031b\u0327\u0001\u0000\u0000\u0000\u031c"+
		"\u031d\u0003L&\u0000\u031d\u031e\u00053\u0000\u0000\u031e\u031f\u0006"+
		"$\uffff\uffff\u0000\u031f\u0327\u0001\u0000\u0000\u0000\u0320\u0321\u0005"+
		"3\u0000\u0000\u0321\u0322\u0003L&\u0000\u0322\u0323\u0006$\uffff\uffff"+
		"\u0000\u0323\u0327\u0001\u0000\u0000\u0000\u0324\u0325\u00053\u0000\u0000"+
		"\u0325\u0327\u0006$\uffff\uffff\u0000\u0326\u0317\u0001\u0000\u0000\u0000"+
		"\u0326\u031c\u0001\u0000\u0000\u0000\u0326\u0320\u0001\u0000\u0000\u0000"+
		"\u0326\u0324\u0001\u0000\u0000\u0000\u0327\u0329\u0001\u0000\u0000\u0000"+
		"\u0328\u02f0\u0001\u0000\u0000\u0000\u0328\u0303\u0001\u0000\u0000\u0000"+
		"\u0328\u0316\u0001\u0000\u0000\u0000\u0329I\u0001\u0000\u0000\u0000\u032a"+
		"\u032e\u0003\u0016\u000b\u0000\u032b\u032c\u0003\u001a\r\u0000\u032c\u032d"+
		"\u0006%\uffff\uffff\u0000\u032d\u032f\u0001\u0000\u0000\u0000\u032e\u032b"+
		"\u0001\u0000\u0000\u0000\u032e\u032f\u0001\u0000\u0000\u0000\u032f\u0330"+
		"\u0001\u0000\u0000\u0000\u0330\u0331\u0006%\uffff\uffff\u0000\u0331K\u0001"+
		"\u0000\u0000\u0000\u0332\u0333\u0003\n\u0005\u0000\u0333\u033a\u0006&"+
		"\uffff\uffff\u0000\u0334\u0335\u00054\u0000\u0000\u0335\u0336\u0003\n"+
		"\u0005\u0000\u0336\u0337\u0006&\uffff\uffff\u0000\u0337\u0339\u0001\u0000"+
		"\u0000\u0000\u0338\u0334\u0001\u0000\u0000\u0000\u0339\u033c\u0001\u0000"+
		"\u0000\u0000\u033a\u0338\u0001\u0000\u0000\u0000\u033a\u033b\u0001\u0000"+
		"\u0000\u0000\u033bM\u0001\u0000\u0000\u0000\u033c\u033a\u0001\u0000\u0000"+
		"\u0000\u033d\u033e\u0005\u0004\u0000\u0000\u033e\u033f\u00053\u0000\u0000"+
		"\u033f\u034c\u0006\'\uffff\uffff\u0000\u0340\u0341\u0005\u0001\u0000\u0000"+
		"\u0341\u0342\u00053\u0000\u0000\u0342\u034c\u0006\'\uffff\uffff\u0000"+
		"\u0343\u0347\u0005\r\u0000\u0000\u0344\u0345\u0003\n\u0005\u0000\u0345"+
		"\u0346\u0006\'\uffff\uffff\u0000\u0346\u0348\u0001\u0000\u0000\u0000\u0347"+
		"\u0344\u0001\u0000\u0000\u0000\u0347\u0348\u0001\u0000\u0000\u0000\u0348"+
		"\u0349\u0001\u0000\u0000\u0000\u0349\u034a\u00053\u0000\u0000\u034a\u034c"+
		"\u0006\'\uffff\uffff\u0000\u034b\u033d\u0001\u0000\u0000\u0000\u034b\u0340"+
		"\u0001\u0000\u0000\u0000\u034b\u0343\u0001\u0000\u0000\u0000\u034cO\u0001"+
		"\u0000\u0000\u0000GT^hnv\u0081\u008d\u009b\u00a5\u00b1\u00bf\u00ce\u00d6"+
		"\u0121\u0130\u0134\u0136\u0142\u0157\u0164\u017c\u0182\u018b\u0197\u019e"+
		"\u01a8\u01c2\u01c9\u01ce\u01d3\u01e0\u01e7\u01f3\u01f7\u01f9\u0200\u0206"+
		"\u020c\u0218\u021e\u0227\u0235\u023c\u0247\u024b\u0252\u025b\u025f\u0261"+
		"\u026a\u026f\u0279\u0283\u0287\u028d\u029a\u02ab\u02b1\u02b5\u02c0\u02c5"+
		"\u02d3\u02ee\u0301\u0314\u0326\u0328\u032e\u033a\u0347\u034b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
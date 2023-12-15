// $ANTLR 3.5.1 C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g 2023-12-15 15:51:00

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class while_astParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CONS", "DO", "Dec", "ELSE", "END", 
		"EXPR", "EXPRBASE", "FOR", "FOREACH", "FUNCDEF", "FUNCTION", "HD", "IF", 
		"IN", "INPUTS", "LIST", "Maj", "Min", "OUTPUT", "PROGRAM", "START", "Symbol", 
		"THEN", "TL", "VARDEF", "VARIABLES", "Variable", "WHILE", "WS", "'%'", 
		"'('", "')'", "','", "':'", "':='", "';'", "'=?'", "'cons '", "'do'", 
		"'else'", "'fi'", "'for'", "'foreach'", "'function '", "'hd '", "'if'", 
		"'in'", "'list '", "'nil'", "'nop'", "'od'", "'read'", "'then'", "'tl '", 
		"'while'", "'write '"
	};
	public static final int EOF=-1;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int T__52=52;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int T__58=58;
	public static final int T__59=59;
	public static final int CONS=4;
	public static final int DO=5;
	public static final int Dec=6;
	public static final int ELSE=7;
	public static final int END=8;
	public static final int EXPR=9;
	public static final int EXPRBASE=10;
	public static final int FOR=11;
	public static final int FOREACH=12;
	public static final int FUNCDEF=13;
	public static final int FUNCTION=14;
	public static final int HD=15;
	public static final int IF=16;
	public static final int IN=17;
	public static final int INPUTS=18;
	public static final int LIST=19;
	public static final int Maj=20;
	public static final int Min=21;
	public static final int OUTPUT=22;
	public static final int PROGRAM=23;
	public static final int START=24;
	public static final int Symbol=25;
	public static final int THEN=26;
	public static final int TL=27;
	public static final int VARDEF=28;
	public static final int VARIABLES=29;
	public static final int Variable=30;
	public static final int WHILE=31;
	public static final int WS=32;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "foreach_", "while_", "exprs", "definition", "function", 
		"variable", "commands", "cons", "do_", "inputSub", "output", "expression", 
		"decl", "hd", "program", "nil_", "then_", "tl", "exprBase", "startProgram", 
		"symbolExpr", "if_", "input", "list", "else_", "command", "vars", "for_", 
		"lExpr"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public while_astParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public while_astParser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this,port,adaptor);
		setDebugListener(proxy);
		setTokenStream(new DebugTokenStream(input,proxy));
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
		TreeAdaptor adap = new CommonTreeAdaptor();
		setTreeAdaptor(adap);
		proxy.setTreeAdaptor(adap);
	}

	public while_astParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg);
		 
		TreeAdaptor adap = new CommonTreeAdaptor();
		setTreeAdaptor(adap);

	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

		protected DebugTreeAdaptor adaptor;
		public void setTreeAdaptor(TreeAdaptor adaptor) {
			this.adaptor = new DebugTreeAdaptor(dbg,adaptor);
		}
		public TreeAdaptor getTreeAdaptor() {
			return adaptor;
		}
	@Override public String[] getTokenNames() { return while_astParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g"; }


	public static class startProgram_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "startProgram"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:34:1: startProgram : program -> ^( START program ) ;
	public final while_astParser.startProgram_return startProgram() throws RecognitionException {
		while_astParser.startProgram_return retval = new while_astParser.startProgram_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope program1 =null;

		RewriteRuleSubtreeStream stream_program=new RewriteRuleSubtreeStream(adaptor,"rule program");

		try { dbg.enterRule(getGrammarFileName(), "startProgram");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(34, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:35:5: ( program -> ^( START program ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:35:7: program
			{
			dbg.location(35,7);
			pushFollow(FOLLOW_program_in_startProgram201);
			program1=program();
			state._fsp--;

			stream_program.add(program1.getTree());
			// AST REWRITE
			// elements: program
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 35:15: -> ^( START program )
			{
				dbg.location(35,18);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:35:18: ^( START program )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(35,20);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(START, "START"), root_1);
				dbg.location(35,26);
				adaptor.addChild(root_1, stream_program.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(36, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "startProgram");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "startProgram"


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:46:1: program : function ( program )? -> ^( PROGRAM function ( program )? ) ;
	public final while_astParser.program_return program() throws RecognitionException {
		while_astParser.program_return retval = new while_astParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope function2 =null;
		ParserRuleReturnScope program3 =null;

		RewriteRuleSubtreeStream stream_function=new RewriteRuleSubtreeStream(adaptor,"rule function");
		RewriteRuleSubtreeStream stream_program=new RewriteRuleSubtreeStream(adaptor,"rule program");

		try { dbg.enterRule(getGrammarFileName(), "program");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(46, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:47:5: ( function ( program )? -> ^( PROGRAM function ( program )? ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:47:7: function ( program )?
			{
			dbg.location(47,7);
			pushFollow(FOLLOW_function_in_program351);
			function2=function();
			state._fsp--;

			stream_function.add(function2.getTree());dbg.location(47,16);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:47:16: ( program )?
			int alt1=2;
			try { dbg.enterSubRule(1);
			try { dbg.enterDecision(1, decisionCanBacktrack[1]);

			int LA1_0 = input.LA(1);
			if ( (LA1_0==47) ) {
				alt1=1;
			}
			} finally {dbg.exitDecision(1);}

			switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:47:16: program
					{
					dbg.location(47,16);
					pushFollow(FOLLOW_program_in_program353);
					program3=program();
					state._fsp--;

					stream_program.add(program3.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(1);}

			// AST REWRITE
			// elements: program, function
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 47:25: -> ^( PROGRAM function ( program )? )
			{
				dbg.location(47,28);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:47:28: ^( PROGRAM function ( program )? )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(47,30);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);
				dbg.location(47,38);
				adaptor.addChild(root_1, stream_function.nextTree());dbg.location(47,47);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:47:47: ( program )?
				if ( stream_program.hasNext() ) {
					dbg.location(47,47);
					adaptor.addChild(root_1, stream_program.nextTree());
				}
				stream_program.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(48, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "program");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "program"


	public static class function_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "function"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:50:1: function : 'function ' Symbol ( WS )* ':' ( WS )* definition -> ^( FUNCDEF Symbol definition END ) ;
	public final while_astParser.function_return function() throws RecognitionException {
		while_astParser.function_return retval = new while_astParser.function_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal4=null;
		Token Symbol5=null;
		Token WS6=null;
		Token char_literal7=null;
		Token WS8=null;
		ParserRuleReturnScope definition9 =null;

		Object string_literal4_tree=null;
		Object Symbol5_tree=null;
		Object WS6_tree=null;
		Object char_literal7_tree=null;
		Object WS8_tree=null;
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleTokenStream stream_Symbol=new RewriteRuleTokenStream(adaptor,"token Symbol");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"rule definition");

		try { dbg.enterRule(getGrammarFileName(), "function");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(50, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:51:5: ( 'function ' Symbol ( WS )* ':' ( WS )* definition -> ^( FUNCDEF Symbol definition END ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:51:7: 'function ' Symbol ( WS )* ':' ( WS )* definition
			{
			dbg.location(51,7);
			string_literal4=(Token)match(input,47,FOLLOW_47_in_function382);  
			stream_47.add(string_literal4);
			dbg.location(51,19);
			Symbol5=(Token)match(input,Symbol,FOLLOW_Symbol_in_function384);  
			stream_Symbol.add(Symbol5);
			dbg.location(51,26);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:51:26: ( WS )*
			try { dbg.enterSubRule(2);

			loop2:
			while (true) {
				int alt2=2;
				try { dbg.enterDecision(2, decisionCanBacktrack[2]);

				int LA2_0 = input.LA(1);
				if ( (LA2_0==WS) ) {
					alt2=1;
				}

				} finally {dbg.exitDecision(2);}

				switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:51:26: WS
					{
					dbg.location(51,26);
					WS6=(Token)match(input,WS,FOLLOW_WS_in_function386);  
					stream_WS.add(WS6);

					}
					break;

				default :
					break loop2;
				}
			}
			} finally {dbg.exitSubRule(2);}
			dbg.location(51,30);
			char_literal7=(Token)match(input,37,FOLLOW_37_in_function389);  
			stream_37.add(char_literal7);
			dbg.location(51,34);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:51:34: ( WS )*
			try { dbg.enterSubRule(3);

			loop3:
			while (true) {
				int alt3=2;
				try { dbg.enterDecision(3, decisionCanBacktrack[3]);

				int LA3_0 = input.LA(1);
				if ( (LA3_0==WS) ) {
					alt3=1;
				}

				} finally {dbg.exitDecision(3);}

				switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:51:34: WS
					{
					dbg.location(51,34);
					WS8=(Token)match(input,WS,FOLLOW_WS_in_function391);  
					stream_WS.add(WS8);

					}
					break;

				default :
					break loop3;
				}
			}
			} finally {dbg.exitSubRule(3);}
			dbg.location(51,38);
			pushFollow(FOLLOW_definition_in_function394);
			definition9=definition();
			state._fsp--;

			stream_definition.add(definition9.getTree());
			// AST REWRITE
			// elements: definition, Symbol
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 51:49: -> ^( FUNCDEF Symbol definition END )
			{
				dbg.location(51,52);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:51:52: ^( FUNCDEF Symbol definition END )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(51,54);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCDEF, "FUNCDEF"), root_1);
				dbg.location(51,62);
				adaptor.addChild(root_1, stream_Symbol.nextNode());dbg.location(51,69);
				adaptor.addChild(root_1, stream_definition.nextTree());dbg.location(51,80);
				adaptor.addChild(root_1, (Object)adaptor.create(END, "END"));
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(52, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "function");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "function"


	public static class definition_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "definition"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:54:1: definition : 'read' ( WS )* input '%' ( WS )* commands ( WS )* '%' ( WS )* 'write ' output -> ^( FUNCTION input commands output ) ;
	public final while_astParser.definition_return definition() throws RecognitionException {
		while_astParser.definition_return retval = new while_astParser.definition_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal10=null;
		Token WS11=null;
		Token char_literal13=null;
		Token WS14=null;
		Token WS16=null;
		Token char_literal17=null;
		Token WS18=null;
		Token string_literal19=null;
		ParserRuleReturnScope input12 =null;
		ParserRuleReturnScope commands15 =null;
		ParserRuleReturnScope output20 =null;

		Object string_literal10_tree=null;
		Object WS11_tree=null;
		Object char_literal13_tree=null;
		Object WS14_tree=null;
		Object WS16_tree=null;
		Object char_literal17_tree=null;
		Object WS18_tree=null;
		Object string_literal19_tree=null;
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");
		RewriteRuleSubtreeStream stream_input=new RewriteRuleSubtreeStream(adaptor,"rule input");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try { dbg.enterRule(getGrammarFileName(), "definition");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(54, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:55:5: ( 'read' ( WS )* input '%' ( WS )* commands ( WS )* '%' ( WS )* 'write ' output -> ^( FUNCTION input commands output ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:55:7: 'read' ( WS )* input '%' ( WS )* commands ( WS )* '%' ( WS )* 'write ' output
			{
			dbg.location(55,7);
			string_literal10=(Token)match(input,55,FOLLOW_55_in_definition423);  
			stream_55.add(string_literal10);
			dbg.location(55,14);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:55:14: ( WS )*
			try { dbg.enterSubRule(4);

			loop4:
			while (true) {
				int alt4=2;
				try { dbg.enterDecision(4, decisionCanBacktrack[4]);

				int LA4_0 = input.LA(1);
				if ( (LA4_0==WS) ) {
					alt4=1;
				}

				} finally {dbg.exitDecision(4);}

				switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:55:14: WS
					{
					dbg.location(55,14);
					WS11=(Token)match(input,WS,FOLLOW_WS_in_definition425);  
					stream_WS.add(WS11);

					}
					break;

				default :
					break loop4;
				}
			}
			} finally {dbg.exitSubRule(4);}
			dbg.location(55,18);
			pushFollow(FOLLOW_input_in_definition428);
			input12=input();
			state._fsp--;

			stream_input.add(input12.getTree());dbg.location(55,24);
			char_literal13=(Token)match(input,33,FOLLOW_33_in_definition430);  
			stream_33.add(char_literal13);
			dbg.location(55,28);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:55:28: ( WS )*
			try { dbg.enterSubRule(5);

			loop5:
			while (true) {
				int alt5=2;
				try { dbg.enterDecision(5, decisionCanBacktrack[5]);

				int LA5_0 = input.LA(1);
				if ( (LA5_0==WS) ) {
					alt5=1;
				}

				} finally {dbg.exitDecision(5);}

				switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:55:28: WS
					{
					dbg.location(55,28);
					WS14=(Token)match(input,WS,FOLLOW_WS_in_definition432);  
					stream_WS.add(WS14);

					}
					break;

				default :
					break loop5;
				}
			}
			} finally {dbg.exitSubRule(5);}
			dbg.location(55,32);
			pushFollow(FOLLOW_commands_in_definition435);
			commands15=commands();
			state._fsp--;

			stream_commands.add(commands15.getTree());dbg.location(55,41);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:55:41: ( WS )*
			try { dbg.enterSubRule(6);

			loop6:
			while (true) {
				int alt6=2;
				try { dbg.enterDecision(6, decisionCanBacktrack[6]);

				int LA6_0 = input.LA(1);
				if ( (LA6_0==WS) ) {
					alt6=1;
				}

				} finally {dbg.exitDecision(6);}

				switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:55:41: WS
					{
					dbg.location(55,41);
					WS16=(Token)match(input,WS,FOLLOW_WS_in_definition437);  
					stream_WS.add(WS16);

					}
					break;

				default :
					break loop6;
				}
			}
			} finally {dbg.exitSubRule(6);}
			dbg.location(55,44);
			char_literal17=(Token)match(input,33,FOLLOW_33_in_definition439);  
			stream_33.add(char_literal17);
			dbg.location(55,48);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:55:48: ( WS )*
			try { dbg.enterSubRule(7);

			loop7:
			while (true) {
				int alt7=2;
				try { dbg.enterDecision(7, decisionCanBacktrack[7]);

				int LA7_0 = input.LA(1);
				if ( (LA7_0==WS) ) {
					alt7=1;
				}

				} finally {dbg.exitDecision(7);}

				switch (alt7) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:55:48: WS
					{
					dbg.location(55,48);
					WS18=(Token)match(input,WS,FOLLOW_WS_in_definition441);  
					stream_WS.add(WS18);

					}
					break;

				default :
					break loop7;
				}
			}
			} finally {dbg.exitSubRule(7);}
			dbg.location(55,52);
			string_literal19=(Token)match(input,59,FOLLOW_59_in_definition444);  
			stream_59.add(string_literal19);
			dbg.location(55,61);
			pushFollow(FOLLOW_output_in_definition446);
			output20=output();
			state._fsp--;

			stream_output.add(output20.getTree());
			// AST REWRITE
			// elements: input, commands, output
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 55:68: -> ^( FUNCTION input commands output )
			{
				dbg.location(55,71);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:55:71: ^( FUNCTION input commands output )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(55,73);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION, "FUNCTION"), root_1);
				dbg.location(55,82);
				adaptor.addChild(root_1, stream_input.nextTree());dbg.location(55,88);
				adaptor.addChild(root_1, stream_commands.nextTree());dbg.location(55,97);
				adaptor.addChild(root_1, stream_output.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(56, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "definition");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "definition"


	public static class input_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "input"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:58:1: input : ( inputSub )? -> ^( INPUTS ( inputSub )? ) ;
	public final while_astParser.input_return input() throws RecognitionException {
		while_astParser.input_return retval = new while_astParser.input_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope inputSub21 =null;

		RewriteRuleSubtreeStream stream_inputSub=new RewriteRuleSubtreeStream(adaptor,"rule inputSub");

		try { dbg.enterRule(getGrammarFileName(), "input");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(58, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:59:5: ( ( inputSub )? -> ^( INPUTS ( inputSub )? ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:59:7: ( inputSub )?
			{
			dbg.location(59,7);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:59:7: ( inputSub )?
			int alt8=2;
			try { dbg.enterSubRule(8);
			try { dbg.enterDecision(8, decisionCanBacktrack[8]);

			int LA8_0 = input.LA(1);
			if ( (LA8_0==Variable) ) {
				alt8=1;
			}
			} finally {dbg.exitDecision(8);}

			switch (alt8) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:59:7: inputSub
					{
					dbg.location(59,7);
					pushFollow(FOLLOW_inputSub_in_input475);
					inputSub21=inputSub();
					state._fsp--;

					stream_inputSub.add(inputSub21.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(8);}

			// AST REWRITE
			// elements: inputSub
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 59:17: -> ^( INPUTS ( inputSub )? )
			{
				dbg.location(59,21);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:59:21: ^( INPUTS ( inputSub )? )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(59,23);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INPUTS, "INPUTS"), root_1);
				dbg.location(59,30);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:59:30: ( inputSub )?
				if ( stream_inputSub.hasNext() ) {
					dbg.location(59,30);
					adaptor.addChild(root_1, stream_inputSub.nextTree());
				}
				stream_inputSub.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(60, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "input");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "input"


	public static class inputSub_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "inputSub"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:62:1: inputSub : Variable ( WS )* ( ',' ( WS )* inputSub )? -> Variable ( inputSub )? ;
	public final while_astParser.inputSub_return inputSub() throws RecognitionException {
		while_astParser.inputSub_return retval = new while_astParser.inputSub_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Variable22=null;
		Token WS23=null;
		Token char_literal24=null;
		Token WS25=null;
		ParserRuleReturnScope inputSub26 =null;

		Object Variable22_tree=null;
		Object WS23_tree=null;
		Object char_literal24_tree=null;
		Object WS25_tree=null;
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_inputSub=new RewriteRuleSubtreeStream(adaptor,"rule inputSub");

		try { dbg.enterRule(getGrammarFileName(), "inputSub");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(62, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:63:5: ( Variable ( WS )* ( ',' ( WS )* inputSub )? -> Variable ( inputSub )? )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:63:7: Variable ( WS )* ( ',' ( WS )* inputSub )?
			{
			dbg.location(63,7);
			Variable22=(Token)match(input,Variable,FOLLOW_Variable_in_inputSub503);  
			stream_Variable.add(Variable22);
			dbg.location(63,16);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:63:16: ( WS )*
			try { dbg.enterSubRule(9);

			loop9:
			while (true) {
				int alt9=2;
				try { dbg.enterDecision(9, decisionCanBacktrack[9]);

				int LA9_0 = input.LA(1);
				if ( (LA9_0==WS) ) {
					alt9=1;
				}

				} finally {dbg.exitDecision(9);}

				switch (alt9) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:63:16: WS
					{
					dbg.location(63,16);
					WS23=(Token)match(input,WS,FOLLOW_WS_in_inputSub505);  
					stream_WS.add(WS23);

					}
					break;

				default :
					break loop9;
				}
			}
			} finally {dbg.exitSubRule(9);}
			dbg.location(63,20);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:63:20: ( ',' ( WS )* inputSub )?
			int alt11=2;
			try { dbg.enterSubRule(11);
			try { dbg.enterDecision(11, decisionCanBacktrack[11]);

			int LA11_0 = input.LA(1);
			if ( (LA11_0==36) ) {
				alt11=1;
			}
			} finally {dbg.exitDecision(11);}

			switch (alt11) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:63:21: ',' ( WS )* inputSub
					{
					dbg.location(63,21);
					char_literal24=(Token)match(input,36,FOLLOW_36_in_inputSub509);  
					stream_36.add(char_literal24);
					dbg.location(63,25);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:63:25: ( WS )*
					try { dbg.enterSubRule(10);

					loop10:
					while (true) {
						int alt10=2;
						try { dbg.enterDecision(10, decisionCanBacktrack[10]);

						int LA10_0 = input.LA(1);
						if ( (LA10_0==WS) ) {
							alt10=1;
						}

						} finally {dbg.exitDecision(10);}

						switch (alt10) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:63:25: WS
							{
							dbg.location(63,25);
							WS25=(Token)match(input,WS,FOLLOW_WS_in_inputSub511);  
							stream_WS.add(WS25);

							}
							break;

						default :
							break loop10;
						}
					}
					} finally {dbg.exitSubRule(10);}
					dbg.location(63,29);
					pushFollow(FOLLOW_inputSub_in_inputSub514);
					inputSub26=inputSub();
					state._fsp--;

					stream_inputSub.add(inputSub26.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(11);}

			// AST REWRITE
			// elements: inputSub, Variable
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 63:40: -> Variable ( inputSub )?
			{
				dbg.location(63,43);
				adaptor.addChild(root_0, stream_Variable.nextNode());dbg.location(63,52);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:63:52: ( inputSub )?
				if ( stream_inputSub.hasNext() ) {
					dbg.location(63,52);
					adaptor.addChild(root_0, stream_inputSub.nextTree());
				}
				stream_inputSub.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(64, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "inputSub");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "inputSub"


	public static class output_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "output"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:66:1: output : Variable ( ',' output )? -> ^( OUTPUT Variable ( output )? ) ;
	public final while_astParser.output_return output() throws RecognitionException {
		while_astParser.output_return retval = new while_astParser.output_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Variable27=null;
		Token char_literal28=null;
		ParserRuleReturnScope output29 =null;

		Object Variable27_tree=null;
		Object char_literal28_tree=null;
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");

		try { dbg.enterRule(getGrammarFileName(), "output");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(66, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:67:5: ( Variable ( ',' output )? -> ^( OUTPUT Variable ( output )? ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:67:7: Variable ( ',' output )?
			{
			dbg.location(67,7);
			Variable27=(Token)match(input,Variable,FOLLOW_Variable_in_output540);  
			stream_Variable.add(Variable27);
			dbg.location(67,16);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:67:16: ( ',' output )?
			int alt12=2;
			try { dbg.enterSubRule(12);
			try { dbg.enterDecision(12, decisionCanBacktrack[12]);

			int LA12_0 = input.LA(1);
			if ( (LA12_0==36) ) {
				alt12=1;
			}
			} finally {dbg.exitDecision(12);}

			switch (alt12) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:67:17: ',' output
					{
					dbg.location(67,17);
					char_literal28=(Token)match(input,36,FOLLOW_36_in_output543);  
					stream_36.add(char_literal28);
					dbg.location(67,21);
					pushFollow(FOLLOW_output_in_output545);
					output29=output();
					state._fsp--;

					stream_output.add(output29.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(12);}

			// AST REWRITE
			// elements: Variable, output
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 67:30: -> ^( OUTPUT Variable ( output )? )
			{
				dbg.location(67,33);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:67:33: ^( OUTPUT Variable ( output )? )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(67,35);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OUTPUT, "OUTPUT"), root_1);
				dbg.location(67,42);
				adaptor.addChild(root_1, stream_Variable.nextNode());dbg.location(67,51);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:67:51: ( output )?
				if ( stream_output.hasNext() ) {
					dbg.location(67,51);
					adaptor.addChild(root_1, stream_output.nextTree());
				}
				stream_output.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(68, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "output");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "output"


	public static class commands_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "commands"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:70:1: commands : command ( ( WS )* ';' ( WS )* commands )? -> command ( commands )? ;
	public final while_astParser.commands_return commands() throws RecognitionException {
		while_astParser.commands_return retval = new while_astParser.commands_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WS31=null;
		Token char_literal32=null;
		Token WS33=null;
		ParserRuleReturnScope command30 =null;
		ParserRuleReturnScope commands34 =null;

		Object WS31_tree=null;
		Object char_literal32_tree=null;
		Object WS33_tree=null;
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_command=new RewriteRuleSubtreeStream(adaptor,"rule command");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try { dbg.enterRule(getGrammarFileName(), "commands");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(70, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:71:5: ( command ( ( WS )* ';' ( WS )* commands )? -> command ( commands )? )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:71:7: command ( ( WS )* ';' ( WS )* commands )?
			{
			dbg.location(71,7);
			pushFollow(FOLLOW_command_in_commands575);
			command30=command();
			state._fsp--;

			stream_command.add(command30.getTree());dbg.location(71,15);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:71:15: ( ( WS )* ';' ( WS )* commands )?
			int alt15=2;
			try { dbg.enterSubRule(15);
			try { dbg.enterDecision(15, decisionCanBacktrack[15]);

			try {
				isCyclicDecision = true;
				alt15 = dfa15.predict(input);
			}
			catch (NoViableAltException nvae) {
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(15);}

			switch (alt15) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:71:17: ( WS )* ';' ( WS )* commands
					{
					dbg.location(71,17);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:71:17: ( WS )*
					try { dbg.enterSubRule(13);

					loop13:
					while (true) {
						int alt13=2;
						try { dbg.enterDecision(13, decisionCanBacktrack[13]);

						int LA13_0 = input.LA(1);
						if ( (LA13_0==WS) ) {
							alt13=1;
						}

						} finally {dbg.exitDecision(13);}

						switch (alt13) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:71:17: WS
							{
							dbg.location(71,17);
							WS31=(Token)match(input,WS,FOLLOW_WS_in_commands579);  
							stream_WS.add(WS31);

							}
							break;

						default :
							break loop13;
						}
					}
					} finally {dbg.exitSubRule(13);}
					dbg.location(71,21);
					char_literal32=(Token)match(input,39,FOLLOW_39_in_commands582);  
					stream_39.add(char_literal32);
					dbg.location(71,25);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:71:25: ( WS )*
					try { dbg.enterSubRule(14);

					loop14:
					while (true) {
						int alt14=2;
						try { dbg.enterDecision(14, decisionCanBacktrack[14]);

						int LA14_0 = input.LA(1);
						if ( (LA14_0==WS) ) {
							alt14=1;
						}

						} finally {dbg.exitDecision(14);}

						switch (alt14) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:71:25: WS
							{
							dbg.location(71,25);
							WS33=(Token)match(input,WS,FOLLOW_WS_in_commands584);  
							stream_WS.add(WS33);

							}
							break;

						default :
							break loop14;
						}
					}
					} finally {dbg.exitSubRule(14);}
					dbg.location(71,29);
					pushFollow(FOLLOW_commands_in_commands587);
					commands34=commands();
					state._fsp--;

					stream_commands.add(commands34.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(15);}

			// AST REWRITE
			// elements: command, commands
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 71:40: -> command ( commands )?
			{
				dbg.location(71,43);
				adaptor.addChild(root_0, stream_command.nextTree());dbg.location(71,51);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:71:51: ( commands )?
				if ( stream_commands.hasNext() ) {
					dbg.location(71,51);
					adaptor.addChild(root_0, stream_commands.nextTree());
				}
				stream_commands.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(72, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "commands");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "commands"


	public static class command_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "command"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:74:1: command : ( 'nop' | decl | if_ | for_ | while_ | foreach_ );
	public final while_astParser.command_return command() throws RecognitionException {
		while_astParser.command_return retval = new while_astParser.command_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal35=null;
		ParserRuleReturnScope decl36 =null;
		ParserRuleReturnScope if_37 =null;
		ParserRuleReturnScope for_38 =null;
		ParserRuleReturnScope while_39 =null;
		ParserRuleReturnScope foreach_40 =null;

		Object string_literal35_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "command");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(74, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:75:5: ( 'nop' | decl | if_ | for_ | while_ | foreach_ )
			int alt16=6;
			try { dbg.enterDecision(16, decisionCanBacktrack[16]);

			switch ( input.LA(1) ) {
			case 53:
				{
				alt16=1;
				}
				break;
			case Variable:
				{
				alt16=2;
				}
				break;
			case 49:
				{
				alt16=3;
				}
				break;
			case 45:
				{
				alt16=4;
				}
				break;
			case 58:
				{
				alt16=5;
				}
				break;
			case 46:
				{
				alt16=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(16);}

			switch (alt16) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:75:7: 'nop'
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(75,7);
					string_literal35=(Token)match(input,53,FOLLOW_53_in_command614); 
					string_literal35_tree = (Object)adaptor.create(string_literal35);
					adaptor.addChild(root_0, string_literal35_tree);

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:75:15: decl
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(75,15);
					pushFollow(FOLLOW_decl_in_command618);
					decl36=decl();
					state._fsp--;

					adaptor.addChild(root_0, decl36.getTree());

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:75:22: if_
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(75,22);
					pushFollow(FOLLOW_if__in_command622);
					if_37=if_();
					state._fsp--;

					adaptor.addChild(root_0, if_37.getTree());

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:75:28: for_
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(75,28);
					pushFollow(FOLLOW_for__in_command626);
					for_38=for_();
					state._fsp--;

					adaptor.addChild(root_0, for_38.getTree());

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:75:35: while_
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(75,35);
					pushFollow(FOLLOW_while__in_command630);
					while_39=while_();
					state._fsp--;

					adaptor.addChild(root_0, while_39.getTree());

					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:75:44: foreach_
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(75,44);
					pushFollow(FOLLOW_foreach__in_command634);
					foreach_40=foreach_();
					state._fsp--;

					adaptor.addChild(root_0, foreach_40.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(75, 52);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "command");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "command"


	public static class decl_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "decl"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:77:1: decl : ( vars ( WS )* ':=' ( WS )* exprs ) -> ^( VARDEF vars exprs ) ;
	public final while_astParser.decl_return decl() throws RecognitionException {
		while_astParser.decl_return retval = new while_astParser.decl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WS42=null;
		Token string_literal43=null;
		Token WS44=null;
		ParserRuleReturnScope vars41 =null;
		ParserRuleReturnScope exprs45 =null;

		Object WS42_tree=null;
		Object string_literal43_tree=null;
		Object WS44_tree=null;
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");
		RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");

		try { dbg.enterRule(getGrammarFileName(), "decl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(77, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:78:5: ( ( vars ( WS )* ':=' ( WS )* exprs ) -> ^( VARDEF vars exprs ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:78:7: ( vars ( WS )* ':=' ( WS )* exprs )
			{
			dbg.location(78,7);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:78:7: ( vars ( WS )* ':=' ( WS )* exprs )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:78:8: vars ( WS )* ':=' ( WS )* exprs
			{
			dbg.location(78,8);
			pushFollow(FOLLOW_vars_in_decl648);
			vars41=vars();
			state._fsp--;

			stream_vars.add(vars41.getTree());dbg.location(78,13);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:78:13: ( WS )*
			try { dbg.enterSubRule(17);

			loop17:
			while (true) {
				int alt17=2;
				try { dbg.enterDecision(17, decisionCanBacktrack[17]);

				int LA17_0 = input.LA(1);
				if ( (LA17_0==WS) ) {
					alt17=1;
				}

				} finally {dbg.exitDecision(17);}

				switch (alt17) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:78:13: WS
					{
					dbg.location(78,13);
					WS42=(Token)match(input,WS,FOLLOW_WS_in_decl650);  
					stream_WS.add(WS42);

					}
					break;

				default :
					break loop17;
				}
			}
			} finally {dbg.exitSubRule(17);}
			dbg.location(78,17);
			string_literal43=(Token)match(input,38,FOLLOW_38_in_decl653);  
			stream_38.add(string_literal43);
			dbg.location(78,22);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:78:22: ( WS )*
			try { dbg.enterSubRule(18);

			loop18:
			while (true) {
				int alt18=2;
				try { dbg.enterDecision(18, decisionCanBacktrack[18]);

				int LA18_0 = input.LA(1);
				if ( (LA18_0==WS) ) {
					alt18=1;
				}

				} finally {dbg.exitDecision(18);}

				switch (alt18) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:78:22: WS
					{
					dbg.location(78,22);
					WS44=(Token)match(input,WS,FOLLOW_WS_in_decl655);  
					stream_WS.add(WS44);

					}
					break;

				default :
					break loop18;
				}
			}
			} finally {dbg.exitSubRule(18);}
			dbg.location(78,26);
			pushFollow(FOLLOW_exprs_in_decl658);
			exprs45=exprs();
			state._fsp--;

			stream_exprs.add(exprs45.getTree());
			}

			// AST REWRITE
			// elements: vars, exprs
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 78:33: -> ^( VARDEF vars exprs )
			{
				dbg.location(78,36);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:78:36: ^( VARDEF vars exprs )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(78,38);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARDEF, "VARDEF"), root_1);
				dbg.location(78,45);
				adaptor.addChild(root_1, stream_vars.nextTree());dbg.location(78,50);
				adaptor.addChild(root_1, stream_exprs.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(79, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "decl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "decl"


	public static class if__return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "if_"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:81:1: if_ : ( 'if' ( WS )* expression ( WS )* then_ ( WS )* else_ 'fi' ) -> ^( IF expression then_ ( else_ )? END ) ;
	public final while_astParser.if__return if_() throws RecognitionException {
		while_astParser.if__return retval = new while_astParser.if__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal46=null;
		Token WS47=null;
		Token WS49=null;
		Token WS51=null;
		Token string_literal53=null;
		ParserRuleReturnScope expression48 =null;
		ParserRuleReturnScope then_50 =null;
		ParserRuleReturnScope else_52 =null;

		Object string_literal46_tree=null;
		Object WS47_tree=null;
		Object WS49_tree=null;
		Object WS51_tree=null;
		Object string_literal53_tree=null;
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_then_=new RewriteRuleSubtreeStream(adaptor,"rule then_");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_else_=new RewriteRuleSubtreeStream(adaptor,"rule else_");

		try { dbg.enterRule(getGrammarFileName(), "if_");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(81, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:82:5: ( ( 'if' ( WS )* expression ( WS )* then_ ( WS )* else_ 'fi' ) -> ^( IF expression then_ ( else_ )? END ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:82:7: ( 'if' ( WS )* expression ( WS )* then_ ( WS )* else_ 'fi' )
			{
			dbg.location(82,7);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:82:7: ( 'if' ( WS )* expression ( WS )* then_ ( WS )* else_ 'fi' )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:82:8: 'if' ( WS )* expression ( WS )* then_ ( WS )* else_ 'fi'
			{
			dbg.location(82,8);
			string_literal46=(Token)match(input,49,FOLLOW_49_in_if_687);  
			stream_49.add(string_literal46);
			dbg.location(82,13);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:82:13: ( WS )*
			try { dbg.enterSubRule(19);

			loop19:
			while (true) {
				int alt19=2;
				try { dbg.enterDecision(19, decisionCanBacktrack[19]);

				int LA19_0 = input.LA(1);
				if ( (LA19_0==WS) ) {
					alt19=1;
				}

				} finally {dbg.exitDecision(19);}

				switch (alt19) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:82:13: WS
					{
					dbg.location(82,13);
					WS47=(Token)match(input,WS,FOLLOW_WS_in_if_689);  
					stream_WS.add(WS47);

					}
					break;

				default :
					break loop19;
				}
			}
			} finally {dbg.exitSubRule(19);}
			dbg.location(82,17);
			pushFollow(FOLLOW_expression_in_if_692);
			expression48=expression();
			state._fsp--;

			stream_expression.add(expression48.getTree());dbg.location(82,28);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:82:28: ( WS )*
			try { dbg.enterSubRule(20);

			loop20:
			while (true) {
				int alt20=2;
				try { dbg.enterDecision(20, decisionCanBacktrack[20]);

				int LA20_0 = input.LA(1);
				if ( (LA20_0==WS) ) {
					alt20=1;
				}

				} finally {dbg.exitDecision(20);}

				switch (alt20) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:82:28: WS
					{
					dbg.location(82,28);
					WS49=(Token)match(input,WS,FOLLOW_WS_in_if_694);  
					stream_WS.add(WS49);

					}
					break;

				default :
					break loop20;
				}
			}
			} finally {dbg.exitSubRule(20);}
			dbg.location(82,32);
			pushFollow(FOLLOW_then__in_if_697);
			then_50=then_();
			state._fsp--;

			stream_then_.add(then_50.getTree());dbg.location(82,39);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:82:39: ( WS )*
			try { dbg.enterSubRule(21);

			loop21:
			while (true) {
				int alt21=2;
				try { dbg.enterDecision(21, decisionCanBacktrack[21]);

				int LA21_0 = input.LA(1);
				if ( (LA21_0==WS) ) {
					alt21=1;
				}

				} finally {dbg.exitDecision(21);}

				switch (alt21) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:82:39: WS
					{
					dbg.location(82,39);
					WS51=(Token)match(input,WS,FOLLOW_WS_in_if_700);  
					stream_WS.add(WS51);

					}
					break;

				default :
					break loop21;
				}
			}
			} finally {dbg.exitSubRule(21);}
			dbg.location(82,43);
			pushFollow(FOLLOW_else__in_if_703);
			else_52=else_();
			state._fsp--;

			stream_else_.add(else_52.getTree());dbg.location(82,49);
			string_literal53=(Token)match(input,44,FOLLOW_44_in_if_705);  
			stream_44.add(string_literal53);

			}

			// AST REWRITE
			// elements: expression, else_, then_
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 82:55: -> ^( IF expression then_ ( else_ )? END )
			{
				dbg.location(82,58);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:82:58: ^( IF expression then_ ( else_ )? END )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(82,60);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);
				dbg.location(82,63);
				adaptor.addChild(root_1, stream_expression.nextTree());dbg.location(82,74);
				adaptor.addChild(root_1, stream_then_.nextTree());dbg.location(82,80);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:82:80: ( else_ )?
				if ( stream_else_.hasNext() ) {
					dbg.location(82,80);
					adaptor.addChild(root_1, stream_else_.nextTree());
				}
				stream_else_.reset();
				dbg.location(82,87);
				adaptor.addChild(root_1, (Object)adaptor.create(END, "END"));
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(83, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "if_");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "if_"


	public static class then__return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "then_"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:85:1: then_ : 'then' ( WS )* commands ( WS )* -> ^( THEN commands ) ;
	public final while_astParser.then__return then_() throws RecognitionException {
		while_astParser.then__return retval = new while_astParser.then__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal54=null;
		Token WS55=null;
		Token WS57=null;
		ParserRuleReturnScope commands56 =null;

		Object string_literal54_tree=null;
		Object WS55_tree=null;
		Object WS57_tree=null;
		RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try { dbg.enterRule(getGrammarFileName(), "then_");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(85, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:85:7: ( 'then' ( WS )* commands ( WS )* -> ^( THEN commands ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:85:9: 'then' ( WS )* commands ( WS )*
			{
			dbg.location(85,9);
			string_literal54=(Token)match(input,56,FOLLOW_56_in_then_738);  
			stream_56.add(string_literal54);
			dbg.location(85,16);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:85:16: ( WS )*
			try { dbg.enterSubRule(22);

			loop22:
			while (true) {
				int alt22=2;
				try { dbg.enterDecision(22, decisionCanBacktrack[22]);

				int LA22_0 = input.LA(1);
				if ( (LA22_0==WS) ) {
					alt22=1;
				}

				} finally {dbg.exitDecision(22);}

				switch (alt22) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:85:16: WS
					{
					dbg.location(85,16);
					WS55=(Token)match(input,WS,FOLLOW_WS_in_then_740);  
					stream_WS.add(WS55);

					}
					break;

				default :
					break loop22;
				}
			}
			} finally {dbg.exitSubRule(22);}
			dbg.location(85,20);
			pushFollow(FOLLOW_commands_in_then_743);
			commands56=commands();
			state._fsp--;

			stream_commands.add(commands56.getTree());dbg.location(85,29);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:85:29: ( WS )*
			try { dbg.enterSubRule(23);

			loop23:
			while (true) {
				int alt23=2;
				try { dbg.enterDecision(23, decisionCanBacktrack[23]);

				int LA23_0 = input.LA(1);
				if ( (LA23_0==WS) ) {
					alt23=1;
				}

				} finally {dbg.exitDecision(23);}

				switch (alt23) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:85:29: WS
					{
					dbg.location(85,29);
					WS57=(Token)match(input,WS,FOLLOW_WS_in_then_745);  
					stream_WS.add(WS57);

					}
					break;

				default :
					break loop23;
				}
			}
			} finally {dbg.exitSubRule(23);}

			// AST REWRITE
			// elements: commands
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 85:33: -> ^( THEN commands )
			{
				dbg.location(85,36);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:85:36: ^( THEN commands )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(85,38);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(THEN, "THEN"), root_1);
				dbg.location(85,43);
				adaptor.addChild(root_1, stream_commands.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(85, 51);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "then_");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "then_"


	public static class else__return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "else_"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:87:1: else_ : ( 'else' ( WS )* commands )? -> ^( ELSE commands ) ;
	public final while_astParser.else__return else_() throws RecognitionException {
		while_astParser.else__return retval = new while_astParser.else__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal58=null;
		Token WS59=null;
		ParserRuleReturnScope commands60 =null;

		Object string_literal58_tree=null;
		Object WS59_tree=null;
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try { dbg.enterRule(getGrammarFileName(), "else_");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(87, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:87:7: ( ( 'else' ( WS )* commands )? -> ^( ELSE commands ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:87:9: ( 'else' ( WS )* commands )?
			{
			dbg.location(87,9);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:87:9: ( 'else' ( WS )* commands )?
			int alt25=2;
			try { dbg.enterSubRule(25);
			try { dbg.enterDecision(25, decisionCanBacktrack[25]);

			int LA25_0 = input.LA(1);
			if ( (LA25_0==43) ) {
				alt25=1;
			}
			} finally {dbg.exitDecision(25);}

			switch (alt25) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:87:10: 'else' ( WS )* commands
					{
					dbg.location(87,10);
					string_literal58=(Token)match(input,43,FOLLOW_43_in_else_763);  
					stream_43.add(string_literal58);
					dbg.location(87,17);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:87:17: ( WS )*
					try { dbg.enterSubRule(24);

					loop24:
					while (true) {
						int alt24=2;
						try { dbg.enterDecision(24, decisionCanBacktrack[24]);

						int LA24_0 = input.LA(1);
						if ( (LA24_0==WS) ) {
							alt24=1;
						}

						} finally {dbg.exitDecision(24);}

						switch (alt24) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:87:17: WS
							{
							dbg.location(87,17);
							WS59=(Token)match(input,WS,FOLLOW_WS_in_else_765);  
							stream_WS.add(WS59);

							}
							break;

						default :
							break loop24;
						}
					}
					} finally {dbg.exitSubRule(24);}
					dbg.location(87,21);
					pushFollow(FOLLOW_commands_in_else_768);
					commands60=commands();
					state._fsp--;

					stream_commands.add(commands60.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(25);}

			// AST REWRITE
			// elements: commands
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 87:32: -> ^( ELSE commands )
			{
				dbg.location(87,35);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:87:35: ^( ELSE commands )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(87,37);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ELSE, "ELSE"), root_1);
				dbg.location(87,42);
				adaptor.addChild(root_1, stream_commands.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(87, 50);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "else_");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "else_"


	public static class while__return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "while_"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:89:1: while_ : ( 'while' ( WS )* expression ( WS )* do_ ) -> ^( WHILE expression do_ END ) ;
	public final while_astParser.while__return while_() throws RecognitionException {
		while_astParser.while__return retval = new while_astParser.while__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal61=null;
		Token WS62=null;
		Token WS64=null;
		ParserRuleReturnScope expression63 =null;
		ParserRuleReturnScope do_65 =null;

		Object string_literal61_tree=null;
		Object WS62_tree=null;
		Object WS64_tree=null;
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_do_=new RewriteRuleSubtreeStream(adaptor,"rule do_");

		try { dbg.enterRule(getGrammarFileName(), "while_");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(89, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:90:5: ( ( 'while' ( WS )* expression ( WS )* do_ ) -> ^( WHILE expression do_ END ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:90:7: ( 'while' ( WS )* expression ( WS )* do_ )
			{
			dbg.location(90,7);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:90:7: ( 'while' ( WS )* expression ( WS )* do_ )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:90:8: 'while' ( WS )* expression ( WS )* do_
			{
			dbg.location(90,8);
			string_literal61=(Token)match(input,58,FOLLOW_58_in_while_791);  
			stream_58.add(string_literal61);
			dbg.location(90,16);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:90:16: ( WS )*
			try { dbg.enterSubRule(26);

			loop26:
			while (true) {
				int alt26=2;
				try { dbg.enterDecision(26, decisionCanBacktrack[26]);

				int LA26_0 = input.LA(1);
				if ( (LA26_0==WS) ) {
					alt26=1;
				}

				} finally {dbg.exitDecision(26);}

				switch (alt26) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:90:16: WS
					{
					dbg.location(90,16);
					WS62=(Token)match(input,WS,FOLLOW_WS_in_while_793);  
					stream_WS.add(WS62);

					}
					break;

				default :
					break loop26;
				}
			}
			} finally {dbg.exitSubRule(26);}
			dbg.location(90,20);
			pushFollow(FOLLOW_expression_in_while_796);
			expression63=expression();
			state._fsp--;

			stream_expression.add(expression63.getTree());dbg.location(90,31);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:90:31: ( WS )*
			try { dbg.enterSubRule(27);

			loop27:
			while (true) {
				int alt27=2;
				try { dbg.enterDecision(27, decisionCanBacktrack[27]);

				int LA27_0 = input.LA(1);
				if ( (LA27_0==WS) ) {
					alt27=1;
				}

				} finally {dbg.exitDecision(27);}

				switch (alt27) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:90:31: WS
					{
					dbg.location(90,31);
					WS64=(Token)match(input,WS,FOLLOW_WS_in_while_798);  
					stream_WS.add(WS64);

					}
					break;

				default :
					break loop27;
				}
			}
			} finally {dbg.exitSubRule(27);}
			dbg.location(90,35);
			pushFollow(FOLLOW_do__in_while_801);
			do_65=do_();
			state._fsp--;

			stream_do_.add(do_65.getTree());
			}

			// AST REWRITE
			// elements: do_, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 90:40: -> ^( WHILE expression do_ END )
			{
				dbg.location(90,43);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:90:43: ^( WHILE expression do_ END )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(90,45);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WHILE, "WHILE"), root_1);
				dbg.location(90,51);
				adaptor.addChild(root_1, stream_expression.nextTree());dbg.location(90,62);
				adaptor.addChild(root_1, stream_do_.nextTree());dbg.location(90,66);
				adaptor.addChild(root_1, (Object)adaptor.create(END, "END"));
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(91, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "while_");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "while_"


	public static class do__return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "do_"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:93:1: do_ : 'do' ( WS )* commands ( WS )* 'od' -> ^( DO commands ) ;
	public final while_astParser.do__return do_() throws RecognitionException {
		while_astParser.do__return retval = new while_astParser.do__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal66=null;
		Token WS67=null;
		Token WS69=null;
		Token string_literal70=null;
		ParserRuleReturnScope commands68 =null;

		Object string_literal66_tree=null;
		Object WS67_tree=null;
		Object WS69_tree=null;
		Object string_literal70_tree=null;
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try { dbg.enterRule(getGrammarFileName(), "do_");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(93, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:93:6: ( 'do' ( WS )* commands ( WS )* 'od' -> ^( DO commands ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:93:8: 'do' ( WS )* commands ( WS )* 'od'
			{
			dbg.location(93,8);
			string_literal66=(Token)match(input,42,FOLLOW_42_in_do_832);  
			stream_42.add(string_literal66);
			dbg.location(93,13);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:93:13: ( WS )*
			try { dbg.enterSubRule(28);

			loop28:
			while (true) {
				int alt28=2;
				try { dbg.enterDecision(28, decisionCanBacktrack[28]);

				int LA28_0 = input.LA(1);
				if ( (LA28_0==WS) ) {
					alt28=1;
				}

				} finally {dbg.exitDecision(28);}

				switch (alt28) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:93:13: WS
					{
					dbg.location(93,13);
					WS67=(Token)match(input,WS,FOLLOW_WS_in_do_834);  
					stream_WS.add(WS67);

					}
					break;

				default :
					break loop28;
				}
			}
			} finally {dbg.exitSubRule(28);}
			dbg.location(93,17);
			pushFollow(FOLLOW_commands_in_do_837);
			commands68=commands();
			state._fsp--;

			stream_commands.add(commands68.getTree());dbg.location(93,26);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:93:26: ( WS )*
			try { dbg.enterSubRule(29);

			loop29:
			while (true) {
				int alt29=2;
				try { dbg.enterDecision(29, decisionCanBacktrack[29]);

				int LA29_0 = input.LA(1);
				if ( (LA29_0==WS) ) {
					alt29=1;
				}

				} finally {dbg.exitDecision(29);}

				switch (alt29) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:93:26: WS
					{
					dbg.location(93,26);
					WS69=(Token)match(input,WS,FOLLOW_WS_in_do_839);  
					stream_WS.add(WS69);

					}
					break;

				default :
					break loop29;
				}
			}
			} finally {dbg.exitSubRule(29);}
			dbg.location(93,30);
			string_literal70=(Token)match(input,54,FOLLOW_54_in_do_842);  
			stream_54.add(string_literal70);

			// AST REWRITE
			// elements: commands
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 93:35: -> ^( DO commands )
			{
				dbg.location(93,38);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:93:38: ^( DO commands )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(93,40);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DO, "DO"), root_1);
				dbg.location(93,43);
				adaptor.addChild(root_1, stream_commands.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(93, 51);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "do_");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "do_"


	public static class for__return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "for_"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:95:1: for_ : ( 'for' ( WS )* expression ( WS )* do_ ) -> ^( FOR expression do_ END ) ;
	public final while_astParser.for__return for_() throws RecognitionException {
		while_astParser.for__return retval = new while_astParser.for__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal71=null;
		Token WS72=null;
		Token WS74=null;
		ParserRuleReturnScope expression73 =null;
		ParserRuleReturnScope do_75 =null;

		Object string_literal71_tree=null;
		Object WS72_tree=null;
		Object WS74_tree=null;
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_do_=new RewriteRuleSubtreeStream(adaptor,"rule do_");

		try { dbg.enterRule(getGrammarFileName(), "for_");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(95, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:96:5: ( ( 'for' ( WS )* expression ( WS )* do_ ) -> ^( FOR expression do_ END ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:96:7: ( 'for' ( WS )* expression ( WS )* do_ )
			{
			dbg.location(96,7);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:96:7: ( 'for' ( WS )* expression ( WS )* do_ )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:96:8: 'for' ( WS )* expression ( WS )* do_
			{
			dbg.location(96,8);
			string_literal71=(Token)match(input,45,FOLLOW_45_in_for_863);  
			stream_45.add(string_literal71);
			dbg.location(96,14);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:96:14: ( WS )*
			try { dbg.enterSubRule(30);

			loop30:
			while (true) {
				int alt30=2;
				try { dbg.enterDecision(30, decisionCanBacktrack[30]);

				int LA30_0 = input.LA(1);
				if ( (LA30_0==WS) ) {
					alt30=1;
				}

				} finally {dbg.exitDecision(30);}

				switch (alt30) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:96:14: WS
					{
					dbg.location(96,14);
					WS72=(Token)match(input,WS,FOLLOW_WS_in_for_865);  
					stream_WS.add(WS72);

					}
					break;

				default :
					break loop30;
				}
			}
			} finally {dbg.exitSubRule(30);}
			dbg.location(96,18);
			pushFollow(FOLLOW_expression_in_for_868);
			expression73=expression();
			state._fsp--;

			stream_expression.add(expression73.getTree());dbg.location(96,29);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:96:29: ( WS )*
			try { dbg.enterSubRule(31);

			loop31:
			while (true) {
				int alt31=2;
				try { dbg.enterDecision(31, decisionCanBacktrack[31]);

				int LA31_0 = input.LA(1);
				if ( (LA31_0==WS) ) {
					alt31=1;
				}

				} finally {dbg.exitDecision(31);}

				switch (alt31) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:96:29: WS
					{
					dbg.location(96,29);
					WS74=(Token)match(input,WS,FOLLOW_WS_in_for_870);  
					stream_WS.add(WS74);

					}
					break;

				default :
					break loop31;
				}
			}
			} finally {dbg.exitSubRule(31);}
			dbg.location(96,33);
			pushFollow(FOLLOW_do__in_for_873);
			do_75=do_();
			state._fsp--;

			stream_do_.add(do_75.getTree());
			}

			// AST REWRITE
			// elements: expression, do_
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 96:38: -> ^( FOR expression do_ END )
			{
				dbg.location(96,41);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:96:41: ^( FOR expression do_ END )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(96,43);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOR, "FOR"), root_1);
				dbg.location(96,47);
				adaptor.addChild(root_1, stream_expression.nextTree());dbg.location(96,58);
				adaptor.addChild(root_1, stream_do_.nextTree());dbg.location(96,62);
				adaptor.addChild(root_1, (Object)adaptor.create(END, "END"));
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(97, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "for_");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "for_"


	public static class foreach__return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "foreach_"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:1: foreach_ : ( 'foreach' ( WS )* Variable ( WS )* 'in' ( WS )* expression ( WS )* do_ ) -> ^( FOREACH ^( IN Variable expression ) do_ END ) ;
	public final while_astParser.foreach__return foreach_() throws RecognitionException {
		while_astParser.foreach__return retval = new while_astParser.foreach__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal76=null;
		Token WS77=null;
		Token Variable78=null;
		Token WS79=null;
		Token string_literal80=null;
		Token WS81=null;
		Token WS83=null;
		ParserRuleReturnScope expression82 =null;
		ParserRuleReturnScope do_84 =null;

		Object string_literal76_tree=null;
		Object WS77_tree=null;
		Object Variable78_tree=null;
		Object WS79_tree=null;
		Object string_literal80_tree=null;
		Object WS81_tree=null;
		Object WS83_tree=null;
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_do_=new RewriteRuleSubtreeStream(adaptor,"rule do_");

		try { dbg.enterRule(getGrammarFileName(), "foreach_");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(99, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:100:5: ( ( 'foreach' ( WS )* Variable ( WS )* 'in' ( WS )* expression ( WS )* do_ ) -> ^( FOREACH ^( IN Variable expression ) do_ END ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:100:7: ( 'foreach' ( WS )* Variable ( WS )* 'in' ( WS )* expression ( WS )* do_ )
			{
			dbg.location(100,7);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:100:7: ( 'foreach' ( WS )* Variable ( WS )* 'in' ( WS )* expression ( WS )* do_ )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:100:8: 'foreach' ( WS )* Variable ( WS )* 'in' ( WS )* expression ( WS )* do_
			{
			dbg.location(100,8);
			string_literal76=(Token)match(input,46,FOLLOW_46_in_foreach_904);  
			stream_46.add(string_literal76);
			dbg.location(100,18);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:100:18: ( WS )*
			try { dbg.enterSubRule(32);

			loop32:
			while (true) {
				int alt32=2;
				try { dbg.enterDecision(32, decisionCanBacktrack[32]);

				int LA32_0 = input.LA(1);
				if ( (LA32_0==WS) ) {
					alt32=1;
				}

				} finally {dbg.exitDecision(32);}

				switch (alt32) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:100:18: WS
					{
					dbg.location(100,18);
					WS77=(Token)match(input,WS,FOLLOW_WS_in_foreach_906);  
					stream_WS.add(WS77);

					}
					break;

				default :
					break loop32;
				}
			}
			} finally {dbg.exitSubRule(32);}
			dbg.location(100,22);
			Variable78=(Token)match(input,Variable,FOLLOW_Variable_in_foreach_909);  
			stream_Variable.add(Variable78);
			dbg.location(100,31);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:100:31: ( WS )*
			try { dbg.enterSubRule(33);

			loop33:
			while (true) {
				int alt33=2;
				try { dbg.enterDecision(33, decisionCanBacktrack[33]);

				int LA33_0 = input.LA(1);
				if ( (LA33_0==WS) ) {
					alt33=1;
				}

				} finally {dbg.exitDecision(33);}

				switch (alt33) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:100:31: WS
					{
					dbg.location(100,31);
					WS79=(Token)match(input,WS,FOLLOW_WS_in_foreach_911);  
					stream_WS.add(WS79);

					}
					break;

				default :
					break loop33;
				}
			}
			} finally {dbg.exitSubRule(33);}
			dbg.location(100,35);
			string_literal80=(Token)match(input,50,FOLLOW_50_in_foreach_914);  
			stream_50.add(string_literal80);
			dbg.location(100,40);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:100:40: ( WS )*
			try { dbg.enterSubRule(34);

			loop34:
			while (true) {
				int alt34=2;
				try { dbg.enterDecision(34, decisionCanBacktrack[34]);

				int LA34_0 = input.LA(1);
				if ( (LA34_0==WS) ) {
					alt34=1;
				}

				} finally {dbg.exitDecision(34);}

				switch (alt34) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:100:40: WS
					{
					dbg.location(100,40);
					WS81=(Token)match(input,WS,FOLLOW_WS_in_foreach_916);  
					stream_WS.add(WS81);

					}
					break;

				default :
					break loop34;
				}
			}
			} finally {dbg.exitSubRule(34);}
			dbg.location(100,44);
			pushFollow(FOLLOW_expression_in_foreach_919);
			expression82=expression();
			state._fsp--;

			stream_expression.add(expression82.getTree());dbg.location(100,55);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:100:55: ( WS )*
			try { dbg.enterSubRule(35);

			loop35:
			while (true) {
				int alt35=2;
				try { dbg.enterDecision(35, decisionCanBacktrack[35]);

				int LA35_0 = input.LA(1);
				if ( (LA35_0==WS) ) {
					alt35=1;
				}

				} finally {dbg.exitDecision(35);}

				switch (alt35) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:100:55: WS
					{
					dbg.location(100,55);
					WS83=(Token)match(input,WS,FOLLOW_WS_in_foreach_921);  
					stream_WS.add(WS83);

					}
					break;

				default :
					break loop35;
				}
			}
			} finally {dbg.exitSubRule(35);}
			dbg.location(100,59);
			pushFollow(FOLLOW_do__in_foreach_924);
			do_84=do_();
			state._fsp--;

			stream_do_.add(do_84.getTree());
			}

			// AST REWRITE
			// elements: expression, do_, Variable
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 100:64: -> ^( FOREACH ^( IN Variable expression ) do_ END )
			{
				dbg.location(100,67);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:100:67: ^( FOREACH ^( IN Variable expression ) do_ END )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(100,69);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOREACH, "FOREACH"), root_1);
				dbg.location(100,77);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:100:77: ^( IN Variable expression )
				{
				Object root_2 = (Object)adaptor.nil();
				dbg.location(100,79);
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(IN, "IN"), root_2);
				dbg.location(100,82);
				adaptor.addChild(root_2, stream_Variable.nextNode());dbg.location(100,91);
				adaptor.addChild(root_2, stream_expression.nextTree());
				adaptor.addChild(root_1, root_2);
				}
				dbg.location(100,103);
				adaptor.addChild(root_1, stream_do_.nextTree());dbg.location(100,107);
				adaptor.addChild(root_1, (Object)adaptor.create(END, "END"));
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(101, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "foreach_");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "foreach_"


	public static class vars_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "vars"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:103:1: vars : Variable ( ',' vars )? -> ^( VARIABLES Variable ( vars )* ) ;
	public final while_astParser.vars_return vars() throws RecognitionException {
		while_astParser.vars_return retval = new while_astParser.vars_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Variable85=null;
		Token char_literal86=null;
		ParserRuleReturnScope vars87 =null;

		Object Variable85_tree=null;
		Object char_literal86_tree=null;
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");

		try { dbg.enterRule(getGrammarFileName(), "vars");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(103, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:104:5: ( Variable ( ',' vars )? -> ^( VARIABLES Variable ( vars )* ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:104:7: Variable ( ',' vars )?
			{
			dbg.location(104,7);
			Variable85=(Token)match(input,Variable,FOLLOW_Variable_in_vars960);  
			stream_Variable.add(Variable85);
			dbg.location(104,16);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:104:16: ( ',' vars )?
			int alt36=2;
			try { dbg.enterSubRule(36);
			try { dbg.enterDecision(36, decisionCanBacktrack[36]);

			int LA36_0 = input.LA(1);
			if ( (LA36_0==36) ) {
				alt36=1;
			}
			} finally {dbg.exitDecision(36);}

			switch (alt36) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:104:17: ',' vars
					{
					dbg.location(104,17);
					char_literal86=(Token)match(input,36,FOLLOW_36_in_vars963);  
					stream_36.add(char_literal86);
					dbg.location(104,21);
					pushFollow(FOLLOW_vars_in_vars965);
					vars87=vars();
					state._fsp--;

					stream_vars.add(vars87.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(36);}

			// AST REWRITE
			// elements: Variable, vars
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 104:28: -> ^( VARIABLES Variable ( vars )* )
			{
				dbg.location(104,31);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:104:31: ^( VARIABLES Variable ( vars )* )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(104,33);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARIABLES, "VARIABLES"), root_1);
				dbg.location(104,43);
				adaptor.addChild(root_1, stream_Variable.nextNode());dbg.location(104,52);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:104:52: ( vars )*
				while ( stream_vars.hasNext() ) {
					dbg.location(104,52);
					adaptor.addChild(root_1, stream_vars.nextTree());
				}
				stream_vars.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(105, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "vars");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "vars"


	public static class exprs_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprs"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:107:1: exprs : expression ( ',' exprs )? -> expression ( exprs )* ;
	public final while_astParser.exprs_return exprs() throws RecognitionException {
		while_astParser.exprs_return retval = new while_astParser.exprs_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal89=null;
		ParserRuleReturnScope expression88 =null;
		ParserRuleReturnScope exprs90 =null;

		Object char_literal89_tree=null;
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");

		try { dbg.enterRule(getGrammarFileName(), "exprs");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(107, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:108:5: ( expression ( ',' exprs )? -> expression ( exprs )* )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:108:7: expression ( ',' exprs )?
			{
			dbg.location(108,7);
			pushFollow(FOLLOW_expression_in_exprs995);
			expression88=expression();
			state._fsp--;

			stream_expression.add(expression88.getTree());dbg.location(108,18);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:108:18: ( ',' exprs )?
			int alt37=2;
			try { dbg.enterSubRule(37);
			try { dbg.enterDecision(37, decisionCanBacktrack[37]);

			int LA37_0 = input.LA(1);
			if ( (LA37_0==36) ) {
				alt37=1;
			}
			} finally {dbg.exitDecision(37);}

			switch (alt37) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:108:19: ',' exprs
					{
					dbg.location(108,19);
					char_literal89=(Token)match(input,36,FOLLOW_36_in_exprs998);  
					stream_36.add(char_literal89);
					dbg.location(108,23);
					pushFollow(FOLLOW_exprs_in_exprs1000);
					exprs90=exprs();
					state._fsp--;

					stream_exprs.add(exprs90.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(37);}

			// AST REWRITE
			// elements: exprs, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 108:31: -> expression ( exprs )*
			{
				dbg.location(108,34);
				adaptor.addChild(root_0, stream_expression.nextTree());dbg.location(108,45);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:108:45: ( exprs )*
				while ( stream_exprs.hasNext() ) {
					dbg.location(108,45);
					adaptor.addChild(root_0, stream_exprs.nextTree());
				}
				stream_exprs.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(109, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "exprs");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "exprs"


	public static class exprBase_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprBase"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:111:1: exprBase : ( nil_ | variable | cons | list | hd | tl | symbolExpr );
	public final while_astParser.exprBase_return exprBase() throws RecognitionException {
		while_astParser.exprBase_return retval = new while_astParser.exprBase_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope nil_91 =null;
		ParserRuleReturnScope variable92 =null;
		ParserRuleReturnScope cons93 =null;
		ParserRuleReturnScope list94 =null;
		ParserRuleReturnScope hd95 =null;
		ParserRuleReturnScope tl96 =null;
		ParserRuleReturnScope symbolExpr97 =null;


		try { dbg.enterRule(getGrammarFileName(), "exprBase");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(111, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:111:12: ( nil_ | variable | cons | list | hd | tl | symbolExpr )
			int alt38=7;
			try { dbg.enterDecision(38, decisionCanBacktrack[38]);

			try {
				isCyclicDecision = true;
				alt38 = dfa38.predict(input);
			}
			catch (NoViableAltException nvae) {
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(38);}

			switch (alt38) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:111:15: nil_
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(111,15);
					pushFollow(FOLLOW_nil__in_exprBase1025);
					nil_91=nil_();
					state._fsp--;

					adaptor.addChild(root_0, nil_91.getTree());

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:112:7: variable
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(112,7);
					pushFollow(FOLLOW_variable_in_exprBase1033);
					variable92=variable();
					state._fsp--;

					adaptor.addChild(root_0, variable92.getTree());

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:113:7: cons
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(113,7);
					pushFollow(FOLLOW_cons_in_exprBase1041);
					cons93=cons();
					state._fsp--;

					adaptor.addChild(root_0, cons93.getTree());

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:113:14: list
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(113,14);
					pushFollow(FOLLOW_list_in_exprBase1045);
					list94=list();
					state._fsp--;

					adaptor.addChild(root_0, list94.getTree());

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:114:7: hd
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(114,7);
					pushFollow(FOLLOW_hd_in_exprBase1053);
					hd95=hd();
					state._fsp--;

					adaptor.addChild(root_0, hd95.getTree());

					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:114:12: tl
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(114,12);
					pushFollow(FOLLOW_tl_in_exprBase1057);
					tl96=tl();
					state._fsp--;

					adaptor.addChild(root_0, tl96.getTree());

					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:115:7: symbolExpr
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(115,7);
					pushFollow(FOLLOW_symbolExpr_in_exprBase1065);
					symbolExpr97=symbolExpr();
					state._fsp--;

					adaptor.addChild(root_0, symbolExpr97.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(116, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "exprBase");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "exprBase"


	public static class nil__return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "nil_"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:118:1: nil_ : ( 'nil' ( WS )* ) -> 'nil' ;
	public final while_astParser.nil__return nil_() throws RecognitionException {
		while_astParser.nil__return retval = new while_astParser.nil__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal98=null;
		Token WS99=null;

		Object string_literal98_tree=null;
		Object WS99_tree=null;
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");

		try { dbg.enterRule(getGrammarFileName(), "nil_");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(118, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:118:6: ( ( 'nil' ( WS )* ) -> 'nil' )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:118:8: ( 'nil' ( WS )* )
			{
			dbg.location(118,8);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:118:8: ( 'nil' ( WS )* )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:118:9: 'nil' ( WS )*
			{
			dbg.location(118,9);
			string_literal98=(Token)match(input,52,FOLLOW_52_in_nil_1084);  
			stream_52.add(string_literal98);
			dbg.location(118,14);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:118:14: ( WS )*
			try { dbg.enterSubRule(39);

			loop39:
			while (true) {
				int alt39=2;
				try { dbg.enterDecision(39, decisionCanBacktrack[39]);

				int LA39_0 = input.LA(1);
				if ( (LA39_0==WS) ) {
					alt39=1;
				}

				} finally {dbg.exitDecision(39);}

				switch (alt39) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:118:14: WS
					{
					dbg.location(118,14);
					WS99=(Token)match(input,WS,FOLLOW_WS_in_nil_1085);  
					stream_WS.add(WS99);

					}
					break;

				default :
					break loop39;
				}
			}
			} finally {dbg.exitSubRule(39);}

			}

			// AST REWRITE
			// elements: 52
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 118:19: -> 'nil'
			{
				dbg.location(118,22);
				adaptor.addChild(root_0, stream_52.nextNode());
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(118, 26);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "nil_");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "nil_"


	public static class variable_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "variable"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:120:1: variable : Variable -> Variable ;
	public final while_astParser.variable_return variable() throws RecognitionException {
		while_astParser.variable_return retval = new while_astParser.variable_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Variable100=null;

		Object Variable100_tree=null;
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");

		try { dbg.enterRule(getGrammarFileName(), "variable");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(120, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:120:9: ( Variable -> Variable )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:120:11: Variable
			{
			dbg.location(120,11);
			Variable100=(Token)match(input,Variable,FOLLOW_Variable_in_variable1102);  
			stream_Variable.add(Variable100);

			// AST REWRITE
			// elements: Variable
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 120:20: -> Variable
			{
				dbg.location(120,23);
				adaptor.addChild(root_0, stream_Variable.nextNode());
			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(120, 30);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "variable");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "variable"


	public static class cons_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "cons"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:122:1: cons : '(' ( WS )* 'cons ' lExpr ( WS )* ')' -> ^( CONS lExpr ) ;
	public final while_astParser.cons_return cons() throws RecognitionException {
		while_astParser.cons_return retval = new while_astParser.cons_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal101=null;
		Token WS102=null;
		Token string_literal103=null;
		Token WS105=null;
		Token char_literal106=null;
		ParserRuleReturnScope lExpr104 =null;

		Object char_literal101_tree=null;
		Object WS102_tree=null;
		Object string_literal103_tree=null;
		Object WS105_tree=null;
		Object char_literal106_tree=null;
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleSubtreeStream stream_lExpr=new RewriteRuleSubtreeStream(adaptor,"rule lExpr");

		try { dbg.enterRule(getGrammarFileName(), "cons");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(122, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:122:6: ( '(' ( WS )* 'cons ' lExpr ( WS )* ')' -> ^( CONS lExpr ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:122:8: '(' ( WS )* 'cons ' lExpr ( WS )* ')'
			{
			dbg.location(122,8);
			char_literal101=(Token)match(input,34,FOLLOW_34_in_cons1114);  
			stream_34.add(char_literal101);
			dbg.location(122,12);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:122:12: ( WS )*
			try { dbg.enterSubRule(40);

			loop40:
			while (true) {
				int alt40=2;
				try { dbg.enterDecision(40, decisionCanBacktrack[40]);

				int LA40_0 = input.LA(1);
				if ( (LA40_0==WS) ) {
					alt40=1;
				}

				} finally {dbg.exitDecision(40);}

				switch (alt40) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:122:12: WS
					{
					dbg.location(122,12);
					WS102=(Token)match(input,WS,FOLLOW_WS_in_cons1116);  
					stream_WS.add(WS102);

					}
					break;

				default :
					break loop40;
				}
			}
			} finally {dbg.exitSubRule(40);}
			dbg.location(122,16);
			string_literal103=(Token)match(input,41,FOLLOW_41_in_cons1119);  
			stream_41.add(string_literal103);
			dbg.location(122,24);
			pushFollow(FOLLOW_lExpr_in_cons1121);
			lExpr104=lExpr();
			state._fsp--;

			stream_lExpr.add(lExpr104.getTree());dbg.location(122,30);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:122:30: ( WS )*
			try { dbg.enterSubRule(41);

			loop41:
			while (true) {
				int alt41=2;
				try { dbg.enterDecision(41, decisionCanBacktrack[41]);

				int LA41_0 = input.LA(1);
				if ( (LA41_0==WS) ) {
					alt41=1;
				}

				} finally {dbg.exitDecision(41);}

				switch (alt41) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:122:30: WS
					{
					dbg.location(122,30);
					WS105=(Token)match(input,WS,FOLLOW_WS_in_cons1123);  
					stream_WS.add(WS105);

					}
					break;

				default :
					break loop41;
				}
			}
			} finally {dbg.exitSubRule(41);}
			dbg.location(122,34);
			char_literal106=(Token)match(input,35,FOLLOW_35_in_cons1126);  
			stream_35.add(char_literal106);

			// AST REWRITE
			// elements: lExpr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 122:38: -> ^( CONS lExpr )
			{
				dbg.location(122,41);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:122:41: ^( CONS lExpr )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(122,43);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONS, "CONS"), root_1);
				dbg.location(122,48);
				adaptor.addChild(root_1, stream_lExpr.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(122, 53);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "cons");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "cons"


	public static class list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "list"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:124:1: list : '(' ( WS )* 'list ' lExpr ( WS )* ')' -> ^( LIST lExpr ) ;
	public final while_astParser.list_return list() throws RecognitionException {
		while_astParser.list_return retval = new while_astParser.list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal107=null;
		Token WS108=null;
		Token string_literal109=null;
		Token WS111=null;
		Token char_literal112=null;
		ParserRuleReturnScope lExpr110 =null;

		Object char_literal107_tree=null;
		Object WS108_tree=null;
		Object string_literal109_tree=null;
		Object WS111_tree=null;
		Object char_literal112_tree=null;
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_lExpr=new RewriteRuleSubtreeStream(adaptor,"rule lExpr");

		try { dbg.enterRule(getGrammarFileName(), "list");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(124, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:124:6: ( '(' ( WS )* 'list ' lExpr ( WS )* ')' -> ^( LIST lExpr ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:124:8: '(' ( WS )* 'list ' lExpr ( WS )* ')'
			{
			dbg.location(124,8);
			char_literal107=(Token)match(input,34,FOLLOW_34_in_list1142);  
			stream_34.add(char_literal107);
			dbg.location(124,11);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:124:11: ( WS )*
			try { dbg.enterSubRule(42);

			loop42:
			while (true) {
				int alt42=2;
				try { dbg.enterDecision(42, decisionCanBacktrack[42]);

				int LA42_0 = input.LA(1);
				if ( (LA42_0==WS) ) {
					alt42=1;
				}

				} finally {dbg.exitDecision(42);}

				switch (alt42) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:124:11: WS
					{
					dbg.location(124,11);
					WS108=(Token)match(input,WS,FOLLOW_WS_in_list1143);  
					stream_WS.add(WS108);

					}
					break;

				default :
					break loop42;
				}
			}
			} finally {dbg.exitSubRule(42);}
			dbg.location(124,15);
			string_literal109=(Token)match(input,51,FOLLOW_51_in_list1146);  
			stream_51.add(string_literal109);
			dbg.location(124,23);
			pushFollow(FOLLOW_lExpr_in_list1148);
			lExpr110=lExpr();
			state._fsp--;

			stream_lExpr.add(lExpr110.getTree());dbg.location(124,29);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:124:29: ( WS )*
			try { dbg.enterSubRule(43);

			loop43:
			while (true) {
				int alt43=2;
				try { dbg.enterDecision(43, decisionCanBacktrack[43]);

				int LA43_0 = input.LA(1);
				if ( (LA43_0==WS) ) {
					alt43=1;
				}

				} finally {dbg.exitDecision(43);}

				switch (alt43) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:124:29: WS
					{
					dbg.location(124,29);
					WS111=(Token)match(input,WS,FOLLOW_WS_in_list1150);  
					stream_WS.add(WS111);

					}
					break;

				default :
					break loop43;
				}
			}
			} finally {dbg.exitSubRule(43);}
			dbg.location(124,33);
			char_literal112=(Token)match(input,35,FOLLOW_35_in_list1153);  
			stream_35.add(char_literal112);

			// AST REWRITE
			// elements: lExpr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 124:37: -> ^( LIST lExpr )
			{
				dbg.location(124,40);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:124:40: ^( LIST lExpr )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(124,42);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);
				dbg.location(124,47);
				adaptor.addChild(root_1, stream_lExpr.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(124, 52);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "list");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "list"


	public static class hd_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "hd"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:126:1: hd : '(' ( WS )* 'hd ' exprBase ( WS )* ')' -> ^( HD exprBase ) ;
	public final while_astParser.hd_return hd() throws RecognitionException {
		while_astParser.hd_return retval = new while_astParser.hd_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal113=null;
		Token WS114=null;
		Token string_literal115=null;
		Token WS117=null;
		Token char_literal118=null;
		ParserRuleReturnScope exprBase116 =null;

		Object char_literal113_tree=null;
		Object WS114_tree=null;
		Object string_literal115_tree=null;
		Object WS117_tree=null;
		Object char_literal118_tree=null;
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");

		try { dbg.enterRule(getGrammarFileName(), "hd");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(126, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:126:4: ( '(' ( WS )* 'hd ' exprBase ( WS )* ')' -> ^( HD exprBase ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:126:6: '(' ( WS )* 'hd ' exprBase ( WS )* ')'
			{
			dbg.location(126,6);
			char_literal113=(Token)match(input,34,FOLLOW_34_in_hd1169);  
			stream_34.add(char_literal113);
			dbg.location(126,9);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:126:9: ( WS )*
			try { dbg.enterSubRule(44);

			loop44:
			while (true) {
				int alt44=2;
				try { dbg.enterDecision(44, decisionCanBacktrack[44]);

				int LA44_0 = input.LA(1);
				if ( (LA44_0==WS) ) {
					alt44=1;
				}

				} finally {dbg.exitDecision(44);}

				switch (alt44) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:126:9: WS
					{
					dbg.location(126,9);
					WS114=(Token)match(input,WS,FOLLOW_WS_in_hd1170);  
					stream_WS.add(WS114);

					}
					break;

				default :
					break loop44;
				}
			}
			} finally {dbg.exitSubRule(44);}
			dbg.location(126,13);
			string_literal115=(Token)match(input,48,FOLLOW_48_in_hd1173);  
			stream_48.add(string_literal115);
			dbg.location(126,19);
			pushFollow(FOLLOW_exprBase_in_hd1175);
			exprBase116=exprBase();
			state._fsp--;

			stream_exprBase.add(exprBase116.getTree());dbg.location(126,28);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:126:28: ( WS )*
			try { dbg.enterSubRule(45);

			loop45:
			while (true) {
				int alt45=2;
				try { dbg.enterDecision(45, decisionCanBacktrack[45]);

				int LA45_0 = input.LA(1);
				if ( (LA45_0==WS) ) {
					alt45=1;
				}

				} finally {dbg.exitDecision(45);}

				switch (alt45) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:126:28: WS
					{
					dbg.location(126,28);
					WS117=(Token)match(input,WS,FOLLOW_WS_in_hd1177);  
					stream_WS.add(WS117);

					}
					break;

				default :
					break loop45;
				}
			}
			} finally {dbg.exitSubRule(45);}
			dbg.location(126,31);
			char_literal118=(Token)match(input,35,FOLLOW_35_in_hd1179);  
			stream_35.add(char_literal118);

			// AST REWRITE
			// elements: exprBase
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 126:35: -> ^( HD exprBase )
			{
				dbg.location(126,38);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:126:38: ^( HD exprBase )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(126,40);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(HD, "HD"), root_1);
				dbg.location(126,43);
				adaptor.addChild(root_1, stream_exprBase.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(126, 51);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "hd");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "hd"


	public static class tl_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "tl"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:128:1: tl : '(' ( WS )* 'tl ' exprBase ( WS )* ')' -> ^( TL exprBase ) ;
	public final while_astParser.tl_return tl() throws RecognitionException {
		while_astParser.tl_return retval = new while_astParser.tl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal119=null;
		Token WS120=null;
		Token string_literal121=null;
		Token WS123=null;
		Token char_literal124=null;
		ParserRuleReturnScope exprBase122 =null;

		Object char_literal119_tree=null;
		Object WS120_tree=null;
		Object string_literal121_tree=null;
		Object WS123_tree=null;
		Object char_literal124_tree=null;
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");

		try { dbg.enterRule(getGrammarFileName(), "tl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(128, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:128:4: ( '(' ( WS )* 'tl ' exprBase ( WS )* ')' -> ^( TL exprBase ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:128:6: '(' ( WS )* 'tl ' exprBase ( WS )* ')'
			{
			dbg.location(128,6);
			char_literal119=(Token)match(input,34,FOLLOW_34_in_tl1195);  
			stream_34.add(char_literal119);
			dbg.location(128,10);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:128:10: ( WS )*
			try { dbg.enterSubRule(46);

			loop46:
			while (true) {
				int alt46=2;
				try { dbg.enterDecision(46, decisionCanBacktrack[46]);

				int LA46_0 = input.LA(1);
				if ( (LA46_0==WS) ) {
					alt46=1;
				}

				} finally {dbg.exitDecision(46);}

				switch (alt46) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:128:10: WS
					{
					dbg.location(128,10);
					WS120=(Token)match(input,WS,FOLLOW_WS_in_tl1197);  
					stream_WS.add(WS120);

					}
					break;

				default :
					break loop46;
				}
			}
			} finally {dbg.exitSubRule(46);}
			dbg.location(128,13);
			string_literal121=(Token)match(input,57,FOLLOW_57_in_tl1199);  
			stream_57.add(string_literal121);
			dbg.location(128,19);
			pushFollow(FOLLOW_exprBase_in_tl1201);
			exprBase122=exprBase();
			state._fsp--;

			stream_exprBase.add(exprBase122.getTree());dbg.location(128,28);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:128:28: ( WS )*
			try { dbg.enterSubRule(47);

			loop47:
			while (true) {
				int alt47=2;
				try { dbg.enterDecision(47, decisionCanBacktrack[47]);

				int LA47_0 = input.LA(1);
				if ( (LA47_0==WS) ) {
					alt47=1;
				}

				} finally {dbg.exitDecision(47);}

				switch (alt47) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:128:28: WS
					{
					dbg.location(128,28);
					WS123=(Token)match(input,WS,FOLLOW_WS_in_tl1203);  
					stream_WS.add(WS123);

					}
					break;

				default :
					break loop47;
				}
			}
			} finally {dbg.exitSubRule(47);}
			dbg.location(128,31);
			char_literal124=(Token)match(input,35,FOLLOW_35_in_tl1205);  
			stream_35.add(char_literal124);

			// AST REWRITE
			// elements: exprBase
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 128:35: -> ^( TL exprBase )
			{
				dbg.location(128,38);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:128:38: ^( TL exprBase )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(128,40);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TL, "TL"), root_1);
				dbg.location(128,43);
				adaptor.addChild(root_1, stream_exprBase.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(128, 51);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "tl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "tl"


	public static class symbolExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "symbolExpr"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:130:1: symbolExpr : '(' Symbol ( WS )* ( lExpr )? ')' -> Symbol ( lExpr )? ;
	public final while_astParser.symbolExpr_return symbolExpr() throws RecognitionException {
		while_astParser.symbolExpr_return retval = new while_astParser.symbolExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal125=null;
		Token Symbol126=null;
		Token WS127=null;
		Token char_literal129=null;
		ParserRuleReturnScope lExpr128 =null;

		Object char_literal125_tree=null;
		Object Symbol126_tree=null;
		Object WS127_tree=null;
		Object char_literal129_tree=null;
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_Symbol=new RewriteRuleTokenStream(adaptor,"token Symbol");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_lExpr=new RewriteRuleSubtreeStream(adaptor,"rule lExpr");

		try { dbg.enterRule(getGrammarFileName(), "symbolExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(130, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:131:2: ( '(' Symbol ( WS )* ( lExpr )? ')' -> Symbol ( lExpr )? )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:131:4: '(' Symbol ( WS )* ( lExpr )? ')'
			{
			dbg.location(131,4);
			char_literal125=(Token)match(input,34,FOLLOW_34_in_symbolExpr1222);  
			stream_34.add(char_literal125);
			dbg.location(131,8);
			Symbol126=(Token)match(input,Symbol,FOLLOW_Symbol_in_symbolExpr1224);  
			stream_Symbol.add(Symbol126);
			dbg.location(131,15);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:131:15: ( WS )*
			try { dbg.enterSubRule(48);

			loop48:
			while (true) {
				int alt48=2;
				try { dbg.enterDecision(48, decisionCanBacktrack[48]);

				int LA48_0 = input.LA(1);
				if ( (LA48_0==WS) ) {
					alt48=1;
				}

				} finally {dbg.exitDecision(48);}

				switch (alt48) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:131:15: WS
					{
					dbg.location(131,15);
					WS127=(Token)match(input,WS,FOLLOW_WS_in_symbolExpr1226);  
					stream_WS.add(WS127);

					}
					break;

				default :
					break loop48;
				}
			}
			} finally {dbg.exitSubRule(48);}
			dbg.location(131,19);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:131:19: ( lExpr )?
			int alt49=2;
			try { dbg.enterSubRule(49);
			try { dbg.enterDecision(49, decisionCanBacktrack[49]);

			int LA49_0 = input.LA(1);
			if ( (LA49_0==Variable||LA49_0==34||LA49_0==52) ) {
				alt49=1;
			}
			} finally {dbg.exitDecision(49);}

			switch (alt49) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:131:19: lExpr
					{
					dbg.location(131,19);
					pushFollow(FOLLOW_lExpr_in_symbolExpr1229);
					lExpr128=lExpr();
					state._fsp--;

					stream_lExpr.add(lExpr128.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(49);}
			dbg.location(131,26);
			char_literal129=(Token)match(input,35,FOLLOW_35_in_symbolExpr1232);  
			stream_35.add(char_literal129);

			// AST REWRITE
			// elements: lExpr, Symbol
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 131:30: -> Symbol ( lExpr )?
			{
				dbg.location(131,33);
				adaptor.addChild(root_0, stream_Symbol.nextNode());dbg.location(131,40);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:131:40: ( lExpr )?
				if ( stream_lExpr.hasNext() ) {
					dbg.location(131,40);
					adaptor.addChild(root_0, stream_lExpr.nextTree());
				}
				stream_lExpr.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(131, 45);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "symbolExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "symbolExpr"


	public static class expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:133:1: expression : exprBase ( WS )* ( '=?' ( WS )* exprBase )? -> ^( EXPR exprBase ( exprBase )? ) ;
	public final while_astParser.expression_return expression() throws RecognitionException {
		while_astParser.expression_return retval = new while_astParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WS131=null;
		Token string_literal132=null;
		Token WS133=null;
		ParserRuleReturnScope exprBase130 =null;
		ParserRuleReturnScope exprBase134 =null;

		Object WS131_tree=null;
		Object string_literal132_tree=null;
		Object WS133_tree=null;
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");

		try { dbg.enterRule(getGrammarFileName(), "expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(133, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:134:5: ( exprBase ( WS )* ( '=?' ( WS )* exprBase )? -> ^( EXPR exprBase ( exprBase )? ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:134:7: exprBase ( WS )* ( '=?' ( WS )* exprBase )?
			{
			dbg.location(134,7);
			pushFollow(FOLLOW_exprBase_in_expression1251);
			exprBase130=exprBase();
			state._fsp--;

			stream_exprBase.add(exprBase130.getTree());dbg.location(134,16);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:134:16: ( WS )*
			try { dbg.enterSubRule(50);

			loop50:
			while (true) {
				int alt50=2;
				try { dbg.enterDecision(50, decisionCanBacktrack[50]);

				int LA50_0 = input.LA(1);
				if ( (LA50_0==WS) ) {
					alt50=1;
				}

				} finally {dbg.exitDecision(50);}

				switch (alt50) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:134:16: WS
					{
					dbg.location(134,16);
					WS131=(Token)match(input,WS,FOLLOW_WS_in_expression1253);  
					stream_WS.add(WS131);

					}
					break;

				default :
					break loop50;
				}
			}
			} finally {dbg.exitSubRule(50);}
			dbg.location(134,19);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:134:19: ( '=?' ( WS )* exprBase )?
			int alt52=2;
			try { dbg.enterSubRule(52);
			try { dbg.enterDecision(52, decisionCanBacktrack[52]);

			int LA52_0 = input.LA(1);
			if ( (LA52_0==40) ) {
				alt52=1;
			}
			} finally {dbg.exitDecision(52);}

			switch (alt52) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:134:20: '=?' ( WS )* exprBase
					{
					dbg.location(134,20);
					string_literal132=(Token)match(input,40,FOLLOW_40_in_expression1256);  
					stream_40.add(string_literal132);
					dbg.location(134,25);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:134:25: ( WS )*
					try { dbg.enterSubRule(51);

					loop51:
					while (true) {
						int alt51=2;
						try { dbg.enterDecision(51, decisionCanBacktrack[51]);

						int LA51_0 = input.LA(1);
						if ( (LA51_0==WS) ) {
							alt51=1;
						}

						} finally {dbg.exitDecision(51);}

						switch (alt51) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:134:25: WS
							{
							dbg.location(134,25);
							WS133=(Token)match(input,WS,FOLLOW_WS_in_expression1258);  
							stream_WS.add(WS133);

							}
							break;

						default :
							break loop51;
						}
					}
					} finally {dbg.exitSubRule(51);}
					dbg.location(134,29);
					pushFollow(FOLLOW_exprBase_in_expression1261);
					exprBase134=exprBase();
					state._fsp--;

					stream_exprBase.add(exprBase134.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(52);}

			// AST REWRITE
			// elements: exprBase, exprBase
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 134:40: -> ^( EXPR exprBase ( exprBase )? )
			{
				dbg.location(134,43);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:134:43: ^( EXPR exprBase ( exprBase )? )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(134,45);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR, "EXPR"), root_1);
				dbg.location(134,50);
				adaptor.addChild(root_1, stream_exprBase.nextTree());dbg.location(134,59);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:134:59: ( exprBase )?
				if ( stream_exprBase.hasNext() ) {
					dbg.location(134,59);
					adaptor.addChild(root_1, stream_exprBase.nextTree());
				}
				stream_exprBase.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(135, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "expression"


	public static class lExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "lExpr"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:138:1: lExpr : exprBase ( WS )* ( lExpr )? -> exprBase ( lExpr )? ;
	public final while_astParser.lExpr_return lExpr() throws RecognitionException {
		while_astParser.lExpr_return retval = new while_astParser.lExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WS136=null;
		ParserRuleReturnScope exprBase135 =null;
		ParserRuleReturnScope lExpr137 =null;

		Object WS136_tree=null;
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");
		RewriteRuleSubtreeStream stream_lExpr=new RewriteRuleSubtreeStream(adaptor,"rule lExpr");

		try { dbg.enterRule(getGrammarFileName(), "lExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(138, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:139:5: ( exprBase ( WS )* ( lExpr )? -> exprBase ( lExpr )? )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:139:7: exprBase ( WS )* ( lExpr )?
			{
			dbg.location(139,7);
			pushFollow(FOLLOW_exprBase_in_lExpr1295);
			exprBase135=exprBase();
			state._fsp--;

			stream_exprBase.add(exprBase135.getTree());dbg.location(139,16);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:139:16: ( WS )*
			try { dbg.enterSubRule(53);

			loop53:
			while (true) {
				int alt53=2;
				try { dbg.enterDecision(53, decisionCanBacktrack[53]);

				int LA53_0 = input.LA(1);
				if ( (LA53_0==WS) ) {
					alt53=1;
				}

				} finally {dbg.exitDecision(53);}

				switch (alt53) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:139:16: WS
					{
					dbg.location(139,16);
					WS136=(Token)match(input,WS,FOLLOW_WS_in_lExpr1297);  
					stream_WS.add(WS136);

					}
					break;

				default :
					break loop53;
				}
			}
			} finally {dbg.exitSubRule(53);}
			dbg.location(139,20);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:139:20: ( lExpr )?
			int alt54=2;
			try { dbg.enterSubRule(54);
			try { dbg.enterDecision(54, decisionCanBacktrack[54]);

			int LA54_0 = input.LA(1);
			if ( (LA54_0==Variable||LA54_0==34||LA54_0==52) ) {
				alt54=1;
			}
			} finally {dbg.exitDecision(54);}

			switch (alt54) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:139:20: lExpr
					{
					dbg.location(139,20);
					pushFollow(FOLLOW_lExpr_in_lExpr1300);
					lExpr137=lExpr();
					state._fsp--;

					stream_lExpr.add(lExpr137.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(54);}

			// AST REWRITE
			// elements: lExpr, exprBase
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 139:27: -> exprBase ( lExpr )?
			{
				dbg.location(139,30);
				adaptor.addChild(root_0, stream_exprBase.nextTree());dbg.location(139,39);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:139:39: ( lExpr )?
				if ( stream_lExpr.hasNext() ) {
					dbg.location(139,39);
					adaptor.addChild(root_0, stream_lExpr.nextTree());
				}
				stream_lExpr.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(140, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "lExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "lExpr"

	// Delegated rules


	protected DFA15 dfa15 = new DFA15(this);
	protected DFA38 dfa38 = new DFA38(this);
	static final String DFA15_eotS =
		"\4\uffff";
	static final String DFA15_eofS =
		"\4\uffff";
	static final String DFA15_minS =
		"\2\40\2\uffff";
	static final String DFA15_maxS =
		"\2\66\2\uffff";
	static final String DFA15_acceptS =
		"\2\uffff\1\1\1\2";
	static final String DFA15_specialS =
		"\4\uffff}>";
	static final String[] DFA15_transitionS = {
			"\1\1\1\3\5\uffff\1\2\3\uffff\2\3\11\uffff\1\3",
			"\1\1\1\3\5\uffff\1\2\3\uffff\2\3\11\uffff\1\3",
			"",
			""
	};

	static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
	static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
	static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
	static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
	static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
	static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
	static final short[][] DFA15_transition;

	static {
		int numStates = DFA15_transitionS.length;
		DFA15_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
		}
	}

	protected class DFA15 extends DFA {

		public DFA15(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 15;
			this.eot = DFA15_eot;
			this.eof = DFA15_eof;
			this.min = DFA15_min;
			this.max = DFA15_max;
			this.accept = DFA15_accept;
			this.special = DFA15_special;
			this.transition = DFA15_transition;
		}
		@Override
		public String getDescription() {
			return "71:15: ( ( WS )* ';' ( WS )* commands )?";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	static final String DFA38_eotS =
		"\12\uffff";
	static final String DFA38_eofS =
		"\12\uffff";
	static final String DFA38_minS =
		"\1\36\2\uffff\1\31\1\uffff\1\40\4\uffff";
	static final String DFA38_maxS =
		"\1\64\2\uffff\1\71\1\uffff\1\71\4\uffff";
	static final String DFA38_acceptS =
		"\1\uffff\1\1\1\2\1\uffff\1\7\1\uffff\1\3\1\4\1\5\1\6";
	static final String DFA38_specialS =
		"\12\uffff}>";
	static final String[] DFA38_transitionS = {
			"\1\2\3\uffff\1\3\21\uffff\1\1",
			"",
			"",
			"\1\4\6\uffff\1\5\10\uffff\1\6\6\uffff\1\10\2\uffff\1\7\5\uffff\1\11",
			"",
			"\1\5\10\uffff\1\6\6\uffff\1\10\2\uffff\1\7\5\uffff\1\11",
			"",
			"",
			"",
			""
	};

	static final short[] DFA38_eot = DFA.unpackEncodedString(DFA38_eotS);
	static final short[] DFA38_eof = DFA.unpackEncodedString(DFA38_eofS);
	static final char[] DFA38_min = DFA.unpackEncodedStringToUnsignedChars(DFA38_minS);
	static final char[] DFA38_max = DFA.unpackEncodedStringToUnsignedChars(DFA38_maxS);
	static final short[] DFA38_accept = DFA.unpackEncodedString(DFA38_acceptS);
	static final short[] DFA38_special = DFA.unpackEncodedString(DFA38_specialS);
	static final short[][] DFA38_transition;

	static {
		int numStates = DFA38_transitionS.length;
		DFA38_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA38_transition[i] = DFA.unpackEncodedString(DFA38_transitionS[i]);
		}
	}

	protected class DFA38 extends DFA {

		public DFA38(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 38;
			this.eot = DFA38_eot;
			this.eof = DFA38_eof;
			this.min = DFA38_min;
			this.max = DFA38_max;
			this.accept = DFA38_accept;
			this.special = DFA38_special;
			this.transition = DFA38_transition;
		}
		@Override
		public String getDescription() {
			return "111:1: exprBase : ( nil_ | variable | cons | list | hd | tl | symbolExpr );";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	public static final BitSet FOLLOW_program_in_startProgram201 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_in_program351 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_program_in_program353 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_function382 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_Symbol_in_function384 = new BitSet(new long[]{0x0000002100000000L});
	public static final BitSet FOLLOW_WS_in_function386 = new BitSet(new long[]{0x0000002100000000L});
	public static final BitSet FOLLOW_37_in_function389 = new BitSet(new long[]{0x0080000100000000L});
	public static final BitSet FOLLOW_WS_in_function391 = new BitSet(new long[]{0x0080000100000000L});
	public static final BitSet FOLLOW_definition_in_function394 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_definition423 = new BitSet(new long[]{0x0000000340000000L});
	public static final BitSet FOLLOW_WS_in_definition425 = new BitSet(new long[]{0x0000000340000000L});
	public static final BitSet FOLLOW_input_in_definition428 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_definition430 = new BitSet(new long[]{0x0422600140000000L});
	public static final BitSet FOLLOW_WS_in_definition432 = new BitSet(new long[]{0x0422600140000000L});
	public static final BitSet FOLLOW_commands_in_definition435 = new BitSet(new long[]{0x0000000300000000L});
	public static final BitSet FOLLOW_WS_in_definition437 = new BitSet(new long[]{0x0000000300000000L});
	public static final BitSet FOLLOW_33_in_definition439 = new BitSet(new long[]{0x0800000100000000L});
	public static final BitSet FOLLOW_WS_in_definition441 = new BitSet(new long[]{0x0800000100000000L});
	public static final BitSet FOLLOW_59_in_definition444 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_output_in_definition446 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inputSub_in_input475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_inputSub503 = new BitSet(new long[]{0x0000001100000002L});
	public static final BitSet FOLLOW_WS_in_inputSub505 = new BitSet(new long[]{0x0000001100000002L});
	public static final BitSet FOLLOW_36_in_inputSub509 = new BitSet(new long[]{0x0000000140000000L});
	public static final BitSet FOLLOW_WS_in_inputSub511 = new BitSet(new long[]{0x0000000140000000L});
	public static final BitSet FOLLOW_inputSub_in_inputSub514 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_output540 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_36_in_output543 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_output_in_output545 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_in_commands575 = new BitSet(new long[]{0x0000008100000002L});
	public static final BitSet FOLLOW_WS_in_commands579 = new BitSet(new long[]{0x0000008100000000L});
	public static final BitSet FOLLOW_39_in_commands582 = new BitSet(new long[]{0x0422600140000000L});
	public static final BitSet FOLLOW_WS_in_commands584 = new BitSet(new long[]{0x0422600140000000L});
	public static final BitSet FOLLOW_commands_in_commands587 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_command614 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decl_in_command618 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if__in_command622 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_for__in_command626 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_while__in_command630 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foreach__in_command634 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vars_in_decl648 = new BitSet(new long[]{0x0000004100000000L});
	public static final BitSet FOLLOW_WS_in_decl650 = new BitSet(new long[]{0x0000004100000000L});
	public static final BitSet FOLLOW_38_in_decl653 = new BitSet(new long[]{0x0010000540000000L});
	public static final BitSet FOLLOW_WS_in_decl655 = new BitSet(new long[]{0x0010000540000000L});
	public static final BitSet FOLLOW_exprs_in_decl658 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_if_687 = new BitSet(new long[]{0x0010000540000000L});
	public static final BitSet FOLLOW_WS_in_if_689 = new BitSet(new long[]{0x0010000540000000L});
	public static final BitSet FOLLOW_expression_in_if_692 = new BitSet(new long[]{0x0100000100000000L});
	public static final BitSet FOLLOW_WS_in_if_694 = new BitSet(new long[]{0x0100000100000000L});
	public static final BitSet FOLLOW_then__in_if_697 = new BitSet(new long[]{0x0000180100000000L});
	public static final BitSet FOLLOW_WS_in_if_700 = new BitSet(new long[]{0x0000180100000000L});
	public static final BitSet FOLLOW_else__in_if_703 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_if_705 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_then_738 = new BitSet(new long[]{0x0422600140000000L});
	public static final BitSet FOLLOW_WS_in_then_740 = new BitSet(new long[]{0x0422600140000000L});
	public static final BitSet FOLLOW_commands_in_then_743 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_WS_in_then_745 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_43_in_else_763 = new BitSet(new long[]{0x0422600140000000L});
	public static final BitSet FOLLOW_WS_in_else_765 = new BitSet(new long[]{0x0422600140000000L});
	public static final BitSet FOLLOW_commands_in_else_768 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_while_791 = new BitSet(new long[]{0x0010000540000000L});
	public static final BitSet FOLLOW_WS_in_while_793 = new BitSet(new long[]{0x0010000540000000L});
	public static final BitSet FOLLOW_expression_in_while_796 = new BitSet(new long[]{0x0000040100000000L});
	public static final BitSet FOLLOW_WS_in_while_798 = new BitSet(new long[]{0x0000040100000000L});
	public static final BitSet FOLLOW_do__in_while_801 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_do_832 = new BitSet(new long[]{0x0422600140000000L});
	public static final BitSet FOLLOW_WS_in_do_834 = new BitSet(new long[]{0x0422600140000000L});
	public static final BitSet FOLLOW_commands_in_do_837 = new BitSet(new long[]{0x0040000100000000L});
	public static final BitSet FOLLOW_WS_in_do_839 = new BitSet(new long[]{0x0040000100000000L});
	public static final BitSet FOLLOW_54_in_do_842 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_for_863 = new BitSet(new long[]{0x0010000540000000L});
	public static final BitSet FOLLOW_WS_in_for_865 = new BitSet(new long[]{0x0010000540000000L});
	public static final BitSet FOLLOW_expression_in_for_868 = new BitSet(new long[]{0x0000040100000000L});
	public static final BitSet FOLLOW_WS_in_for_870 = new BitSet(new long[]{0x0000040100000000L});
	public static final BitSet FOLLOW_do__in_for_873 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_foreach_904 = new BitSet(new long[]{0x0000000140000000L});
	public static final BitSet FOLLOW_WS_in_foreach_906 = new BitSet(new long[]{0x0000000140000000L});
	public static final BitSet FOLLOW_Variable_in_foreach_909 = new BitSet(new long[]{0x0004000100000000L});
	public static final BitSet FOLLOW_WS_in_foreach_911 = new BitSet(new long[]{0x0004000100000000L});
	public static final BitSet FOLLOW_50_in_foreach_914 = new BitSet(new long[]{0x0010000540000000L});
	public static final BitSet FOLLOW_WS_in_foreach_916 = new BitSet(new long[]{0x0010000540000000L});
	public static final BitSet FOLLOW_expression_in_foreach_919 = new BitSet(new long[]{0x0000040100000000L});
	public static final BitSet FOLLOW_WS_in_foreach_921 = new BitSet(new long[]{0x0000040100000000L});
	public static final BitSet FOLLOW_do__in_foreach_924 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_vars960 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_36_in_vars963 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_vars_in_vars965 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_exprs995 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_36_in_exprs998 = new BitSet(new long[]{0x0010000440000000L});
	public static final BitSet FOLLOW_exprs_in_exprs1000 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nil__in_exprBase1025 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_exprBase1033 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cons_in_exprBase1041 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_list_in_exprBase1045 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_hd_in_exprBase1053 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tl_in_exprBase1057 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_symbolExpr_in_exprBase1065 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_nil_1084 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_WS_in_nil_1085 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_Variable_in_variable1102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_cons1114 = new BitSet(new long[]{0x0000020100000000L});
	public static final BitSet FOLLOW_WS_in_cons1116 = new BitSet(new long[]{0x0000020100000000L});
	public static final BitSet FOLLOW_41_in_cons1119 = new BitSet(new long[]{0x0010000440000000L});
	public static final BitSet FOLLOW_lExpr_in_cons1121 = new BitSet(new long[]{0x0000000900000000L});
	public static final BitSet FOLLOW_WS_in_cons1123 = new BitSet(new long[]{0x0000000900000000L});
	public static final BitSet FOLLOW_35_in_cons1126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_list1142 = new BitSet(new long[]{0x0008000100000000L});
	public static final BitSet FOLLOW_WS_in_list1143 = new BitSet(new long[]{0x0008000100000000L});
	public static final BitSet FOLLOW_51_in_list1146 = new BitSet(new long[]{0x0010000440000000L});
	public static final BitSet FOLLOW_lExpr_in_list1148 = new BitSet(new long[]{0x0000000900000000L});
	public static final BitSet FOLLOW_WS_in_list1150 = new BitSet(new long[]{0x0000000900000000L});
	public static final BitSet FOLLOW_35_in_list1153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_hd1169 = new BitSet(new long[]{0x0001000100000000L});
	public static final BitSet FOLLOW_WS_in_hd1170 = new BitSet(new long[]{0x0001000100000000L});
	public static final BitSet FOLLOW_48_in_hd1173 = new BitSet(new long[]{0x0010000440000000L});
	public static final BitSet FOLLOW_exprBase_in_hd1175 = new BitSet(new long[]{0x0000000900000000L});
	public static final BitSet FOLLOW_WS_in_hd1177 = new BitSet(new long[]{0x0000000900000000L});
	public static final BitSet FOLLOW_35_in_hd1179 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_tl1195 = new BitSet(new long[]{0x0200000100000000L});
	public static final BitSet FOLLOW_WS_in_tl1197 = new BitSet(new long[]{0x0200000100000000L});
	public static final BitSet FOLLOW_57_in_tl1199 = new BitSet(new long[]{0x0010000440000000L});
	public static final BitSet FOLLOW_exprBase_in_tl1201 = new BitSet(new long[]{0x0000000900000000L});
	public static final BitSet FOLLOW_WS_in_tl1203 = new BitSet(new long[]{0x0000000900000000L});
	public static final BitSet FOLLOW_35_in_tl1205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_symbolExpr1222 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_Symbol_in_symbolExpr1224 = new BitSet(new long[]{0x0010000D40000000L});
	public static final BitSet FOLLOW_WS_in_symbolExpr1226 = new BitSet(new long[]{0x0010000D40000000L});
	public static final BitSet FOLLOW_lExpr_in_symbolExpr1229 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_symbolExpr1232 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprBase_in_expression1251 = new BitSet(new long[]{0x0000010100000002L});
	public static final BitSet FOLLOW_WS_in_expression1253 = new BitSet(new long[]{0x0000010100000002L});
	public static final BitSet FOLLOW_40_in_expression1256 = new BitSet(new long[]{0x0010000540000000L});
	public static final BitSet FOLLOW_WS_in_expression1258 = new BitSet(new long[]{0x0010000540000000L});
	public static final BitSet FOLLOW_exprBase_in_expression1261 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprBase_in_lExpr1295 = new BitSet(new long[]{0x0010000540000002L});
	public static final BitSet FOLLOW_WS_in_lExpr1297 = new BitSet(new long[]{0x0010000540000002L});
	public static final BitSet FOLLOW_lExpr_in_lExpr1300 = new BitSet(new long[]{0x0000000000000002L});
}

// $ANTLR 3.5.1 C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g 2023-11-20 18:04:01

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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CONS", "DO", "Dec", "ELSE", "EXPR", 
		"EXPRBASE", "FOR", "FOREACH", "FUNCDEF", "FUNCTION", "HD", "IF", "IN", 
		"INPUTS", "LIST", "Maj", "Min", "OUTPUT", "PROGRAM", "START", "Symbol", 
		"THEN", "TL", "VARDEF", "VARIABLES", "Variable", "WHILE", "WS", "'%'", 
		"'('", "')'", "','", "':'", "':='", "';'", "'=?'", "'cons '", "'do'", 
		"'else'", "'fi'", "'for'", "'foreach'", "'function '", "'hd '", "'if'", 
		"'in'", "'list '", "'nil'", "'nop'", "'od'", "'read'", "'then'", "'tl '", 
		"'while'", "'write '"
	};
	public static final int EOF=-1;
	public static final int T__32=32;
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
	public static final int CONS=4;
	public static final int DO=5;
	public static final int Dec=6;
	public static final int ELSE=7;
	public static final int EXPR=8;
	public static final int EXPRBASE=9;
	public static final int FOR=10;
	public static final int FOREACH=11;
	public static final int FUNCDEF=12;
	public static final int FUNCTION=13;
	public static final int HD=14;
	public static final int IF=15;
	public static final int IN=16;
	public static final int INPUTS=17;
	public static final int LIST=18;
	public static final int Maj=19;
	public static final int Min=20;
	public static final int OUTPUT=21;
	public static final int PROGRAM=22;
	public static final int START=23;
	public static final int Symbol=24;
	public static final int THEN=25;
	public static final int TL=26;
	public static final int VARDEF=27;
	public static final int VARIABLES=28;
	public static final int Variable=29;
	public static final int WHILE=30;
	public static final int WS=31;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "decl", "exprs", "then_", "variable", "while_", "lExpr", 
		"output", "commands", "for_", "command", "function", "program", "if_", 
		"do_", "foreach_", "list", "definition", "cons", "input", "else_", "symbolExpr", 
		"inputSub", "exprBase", "hd", "expression", "nil_", "vars", "startProgram", 
		"tl"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:41:1: startProgram : program -> ^( START program ) ;
	public final while_astParser.startProgram_return startProgram() throws RecognitionException {
		while_astParser.startProgram_return retval = new while_astParser.startProgram_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope program1 =null;

		RewriteRuleSubtreeStream stream_program=new RewriteRuleSubtreeStream(adaptor,"rule program");

		try { dbg.enterRule(getGrammarFileName(), "startProgram");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(41, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:42:5: ( program -> ^( START program ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:42:7: program
			{
			dbg.location(42,7);
			pushFollow(FOLLOW_program_in_startProgram319);
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
			// 42:15: -> ^( START program )
			{
				dbg.location(42,18);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:42:18: ^( START program )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(42,20);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(START, "START"), root_1);
				dbg.location(42,26);
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
		dbg.location(43, 4);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:45:1: program : function ( program )? -> ^( PROGRAM function ( program )? ) ;
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
		dbg.location(45, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:46:5: ( function ( program )? -> ^( PROGRAM function ( program )? ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:46:7: function ( program )?
			{
			dbg.location(46,7);
			pushFollow(FOLLOW_function_in_program344);
			function2=function();
			state._fsp--;

			stream_function.add(function2.getTree());dbg.location(46,16);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:46:16: ( program )?
			int alt1=2;
			try { dbg.enterSubRule(1);
			try { dbg.enterDecision(1, decisionCanBacktrack[1]);

			int LA1_0 = input.LA(1);
			if ( (LA1_0==46) ) {
				alt1=1;
			}
			} finally {dbg.exitDecision(1);}

			switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:46:16: program
					{
					dbg.location(46,16);
					pushFollow(FOLLOW_program_in_program346);
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
			// 46:25: -> ^( PROGRAM function ( program )? )
			{
				dbg.location(46,28);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:46:28: ^( PROGRAM function ( program )? )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(46,30);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);
				dbg.location(46,38);
				adaptor.addChild(root_1, stream_function.nextTree());dbg.location(46,47);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:46:47: ( program )?
				if ( stream_program.hasNext() ) {
					dbg.location(46,47);
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
		dbg.location(47, 4);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:49:1: function : 'function ' Symbol ( WS )* ':' definition -> ^( FUNCDEF Symbol definition ) ;
	public final while_astParser.function_return function() throws RecognitionException {
		while_astParser.function_return retval = new while_astParser.function_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal4=null;
		Token Symbol5=null;
		Token WS6=null;
		Token char_literal7=null;
		ParserRuleReturnScope definition8 =null;

		Object string_literal4_tree=null;
		Object Symbol5_tree=null;
		Object WS6_tree=null;
		Object char_literal7_tree=null;
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_Symbol=new RewriteRuleTokenStream(adaptor,"token Symbol");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"rule definition");

		try { dbg.enterRule(getGrammarFileName(), "function");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(49, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:50:5: ( 'function ' Symbol ( WS )* ':' definition -> ^( FUNCDEF Symbol definition ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:50:7: 'function ' Symbol ( WS )* ':' definition
			{
			dbg.location(50,7);
			string_literal4=(Token)match(input,46,FOLLOW_46_in_function375);  
			stream_46.add(string_literal4);
			dbg.location(50,19);
			Symbol5=(Token)match(input,Symbol,FOLLOW_Symbol_in_function377);  
			stream_Symbol.add(Symbol5);
			dbg.location(50,26);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:50:26: ( WS )*
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:50:26: WS
					{
					dbg.location(50,26);
					WS6=(Token)match(input,WS,FOLLOW_WS_in_function379);  
					stream_WS.add(WS6);

					}
					break;

				default :
					break loop2;
				}
			}
			} finally {dbg.exitSubRule(2);}
			dbg.location(50,30);
			char_literal7=(Token)match(input,36,FOLLOW_36_in_function382);  
			stream_36.add(char_literal7);
			dbg.location(50,34);
			pushFollow(FOLLOW_definition_in_function384);
			definition8=definition();
			state._fsp--;

			stream_definition.add(definition8.getTree());
			// AST REWRITE
			// elements: Symbol, definition
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 50:45: -> ^( FUNCDEF Symbol definition )
			{
				dbg.location(50,48);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:50:48: ^( FUNCDEF Symbol definition )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(50,50);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCDEF, "FUNCDEF"), root_1);
				dbg.location(50,58);
				adaptor.addChild(root_1, stream_Symbol.nextNode());dbg.location(50,65);
				adaptor.addChild(root_1, stream_definition.nextTree());
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
		dbg.location(51, 4);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:53:1: definition : 'read' ( WS )* input '%' ( WS )* commands ( WS )* '%' ( WS )* 'write ' output -> ^( FUNCTION input commands output ) ;
	public final while_astParser.definition_return definition() throws RecognitionException {
		while_astParser.definition_return retval = new while_astParser.definition_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal9=null;
		Token WS10=null;
		Token char_literal12=null;
		Token WS13=null;
		Token WS15=null;
		Token char_literal16=null;
		Token WS17=null;
		Token string_literal18=null;
		ParserRuleReturnScope input11 =null;
		ParserRuleReturnScope commands14 =null;
		ParserRuleReturnScope output19 =null;

		Object string_literal9_tree=null;
		Object WS10_tree=null;
		Object char_literal12_tree=null;
		Object WS13_tree=null;
		Object WS15_tree=null;
		Object char_literal16_tree=null;
		Object WS17_tree=null;
		Object string_literal18_tree=null;
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
		RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");
		RewriteRuleSubtreeStream stream_input=new RewriteRuleSubtreeStream(adaptor,"rule input");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try { dbg.enterRule(getGrammarFileName(), "definition");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(53, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:54:5: ( 'read' ( WS )* input '%' ( WS )* commands ( WS )* '%' ( WS )* 'write ' output -> ^( FUNCTION input commands output ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:54:7: 'read' ( WS )* input '%' ( WS )* commands ( WS )* '%' ( WS )* 'write ' output
			{
			dbg.location(54,7);
			string_literal9=(Token)match(input,54,FOLLOW_54_in_definition411);  
			stream_54.add(string_literal9);
			dbg.location(54,14);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:54:14: ( WS )*
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:54:14: WS
					{
					dbg.location(54,14);
					WS10=(Token)match(input,WS,FOLLOW_WS_in_definition413);  
					stream_WS.add(WS10);

					}
					break;

				default :
					break loop3;
				}
			}
			} finally {dbg.exitSubRule(3);}
			dbg.location(54,18);
			pushFollow(FOLLOW_input_in_definition416);
			input11=input();
			state._fsp--;

			stream_input.add(input11.getTree());dbg.location(54,24);
			char_literal12=(Token)match(input,32,FOLLOW_32_in_definition418);  
			stream_32.add(char_literal12);
			dbg.location(54,28);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:54:28: ( WS )*
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:54:28: WS
					{
					dbg.location(54,28);
					WS13=(Token)match(input,WS,FOLLOW_WS_in_definition420);  
					stream_WS.add(WS13);

					}
					break;

				default :
					break loop4;
				}
			}
			} finally {dbg.exitSubRule(4);}
			dbg.location(54,32);
			pushFollow(FOLLOW_commands_in_definition423);
			commands14=commands();
			state._fsp--;

			stream_commands.add(commands14.getTree());dbg.location(54,41);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:54:41: ( WS )*
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:54:41: WS
					{
					dbg.location(54,41);
					WS15=(Token)match(input,WS,FOLLOW_WS_in_definition425);  
					stream_WS.add(WS15);

					}
					break;

				default :
					break loop5;
				}
			}
			} finally {dbg.exitSubRule(5);}
			dbg.location(54,44);
			char_literal16=(Token)match(input,32,FOLLOW_32_in_definition427);  
			stream_32.add(char_literal16);
			dbg.location(54,48);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:54:48: ( WS )*
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:54:48: WS
					{
					dbg.location(54,48);
					WS17=(Token)match(input,WS,FOLLOW_WS_in_definition429);  
					stream_WS.add(WS17);

					}
					break;

				default :
					break loop6;
				}
			}
			} finally {dbg.exitSubRule(6);}
			dbg.location(54,52);
			string_literal18=(Token)match(input,58,FOLLOW_58_in_definition432);  
			stream_58.add(string_literal18);
			dbg.location(54,61);
			pushFollow(FOLLOW_output_in_definition434);
			output19=output();
			state._fsp--;

			stream_output.add(output19.getTree());
			// AST REWRITE
			// elements: output, commands, input
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 54:68: -> ^( FUNCTION input commands output )
			{
				dbg.location(54,71);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:54:71: ^( FUNCTION input commands output )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(54,73);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION, "FUNCTION"), root_1);
				dbg.location(54,82);
				adaptor.addChild(root_1, stream_input.nextTree());dbg.location(54,88);
				adaptor.addChild(root_1, stream_commands.nextTree());dbg.location(54,97);
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
		dbg.location(55, 4);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:57:1: input : ( inputSub )? -> ^( INPUTS ( inputSub )? ) ;
	public final while_astParser.input_return input() throws RecognitionException {
		while_astParser.input_return retval = new while_astParser.input_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope inputSub20 =null;

		RewriteRuleSubtreeStream stream_inputSub=new RewriteRuleSubtreeStream(adaptor,"rule inputSub");

		try { dbg.enterRule(getGrammarFileName(), "input");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(57, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:58:5: ( ( inputSub )? -> ^( INPUTS ( inputSub )? ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:58:7: ( inputSub )?
			{
			dbg.location(58,7);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:58:7: ( inputSub )?
			int alt7=2;
			try { dbg.enterSubRule(7);
			try { dbg.enterDecision(7, decisionCanBacktrack[7]);

			int LA7_0 = input.LA(1);
			if ( (LA7_0==Variable) ) {
				alt7=1;
			}
			} finally {dbg.exitDecision(7);}

			switch (alt7) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:58:7: inputSub
					{
					dbg.location(58,7);
					pushFollow(FOLLOW_inputSub_in_input463);
					inputSub20=inputSub();
					state._fsp--;

					stream_inputSub.add(inputSub20.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(7);}

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
			// 58:17: -> ^( INPUTS ( inputSub )? )
			{
				dbg.location(58,21);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:58:21: ^( INPUTS ( inputSub )? )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(58,23);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INPUTS, "INPUTS"), root_1);
				dbg.location(58,30);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:58:30: ( inputSub )?
				if ( stream_inputSub.hasNext() ) {
					dbg.location(58,30);
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
		dbg.location(59, 4);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:61:1: inputSub : Variable ( WS )* ( ',' ( WS )* inputSub )? -> Variable ( inputSub )? ;
	public final while_astParser.inputSub_return inputSub() throws RecognitionException {
		while_astParser.inputSub_return retval = new while_astParser.inputSub_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Variable21=null;
		Token WS22=null;
		Token char_literal23=null;
		Token WS24=null;
		ParserRuleReturnScope inputSub25 =null;

		Object Variable21_tree=null;
		Object WS22_tree=null;
		Object char_literal23_tree=null;
		Object WS24_tree=null;
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_inputSub=new RewriteRuleSubtreeStream(adaptor,"rule inputSub");

		try { dbg.enterRule(getGrammarFileName(), "inputSub");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(61, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:62:5: ( Variable ( WS )* ( ',' ( WS )* inputSub )? -> Variable ( inputSub )? )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:62:7: Variable ( WS )* ( ',' ( WS )* inputSub )?
			{
			dbg.location(62,7);
			Variable21=(Token)match(input,Variable,FOLLOW_Variable_in_inputSub491);  
			stream_Variable.add(Variable21);
			dbg.location(62,16);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:62:16: ( WS )*
			try { dbg.enterSubRule(8);

			loop8:
			while (true) {
				int alt8=2;
				try { dbg.enterDecision(8, decisionCanBacktrack[8]);

				int LA8_0 = input.LA(1);
				if ( (LA8_0==WS) ) {
					alt8=1;
				}

				} finally {dbg.exitDecision(8);}

				switch (alt8) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:62:16: WS
					{
					dbg.location(62,16);
					WS22=(Token)match(input,WS,FOLLOW_WS_in_inputSub493);  
					stream_WS.add(WS22);

					}
					break;

				default :
					break loop8;
				}
			}
			} finally {dbg.exitSubRule(8);}
			dbg.location(62,20);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:62:20: ( ',' ( WS )* inputSub )?
			int alt10=2;
			try { dbg.enterSubRule(10);
			try { dbg.enterDecision(10, decisionCanBacktrack[10]);

			int LA10_0 = input.LA(1);
			if ( (LA10_0==35) ) {
				alt10=1;
			}
			} finally {dbg.exitDecision(10);}

			switch (alt10) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:62:21: ',' ( WS )* inputSub
					{
					dbg.location(62,21);
					char_literal23=(Token)match(input,35,FOLLOW_35_in_inputSub497);  
					stream_35.add(char_literal23);
					dbg.location(62,25);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:62:25: ( WS )*
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

							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:62:25: WS
							{
							dbg.location(62,25);
							WS24=(Token)match(input,WS,FOLLOW_WS_in_inputSub499);  
							stream_WS.add(WS24);

							}
							break;

						default :
							break loop9;
						}
					}
					} finally {dbg.exitSubRule(9);}
					dbg.location(62,29);
					pushFollow(FOLLOW_inputSub_in_inputSub502);
					inputSub25=inputSub();
					state._fsp--;

					stream_inputSub.add(inputSub25.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(10);}

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
			// 62:40: -> Variable ( inputSub )?
			{
				dbg.location(62,43);
				adaptor.addChild(root_0, stream_Variable.nextNode());dbg.location(62,52);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:62:52: ( inputSub )?
				if ( stream_inputSub.hasNext() ) {
					dbg.location(62,52);
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
		dbg.location(63, 4);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:65:1: output : Variable ( ',' output )? -> ^( OUTPUT Variable ( output )? ) ;
	public final while_astParser.output_return output() throws RecognitionException {
		while_astParser.output_return retval = new while_astParser.output_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Variable26=null;
		Token char_literal27=null;
		ParserRuleReturnScope output28 =null;

		Object Variable26_tree=null;
		Object char_literal27_tree=null;
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");

		try { dbg.enterRule(getGrammarFileName(), "output");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(65, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:66:5: ( Variable ( ',' output )? -> ^( OUTPUT Variable ( output )? ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:66:7: Variable ( ',' output )?
			{
			dbg.location(66,7);
			Variable26=(Token)match(input,Variable,FOLLOW_Variable_in_output528);  
			stream_Variable.add(Variable26);
			dbg.location(66,16);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:66:16: ( ',' output )?
			int alt11=2;
			try { dbg.enterSubRule(11);
			try { dbg.enterDecision(11, decisionCanBacktrack[11]);

			int LA11_0 = input.LA(1);
			if ( (LA11_0==35) ) {
				alt11=1;
			}
			} finally {dbg.exitDecision(11);}

			switch (alt11) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:66:17: ',' output
					{
					dbg.location(66,17);
					char_literal27=(Token)match(input,35,FOLLOW_35_in_output531);  
					stream_35.add(char_literal27);
					dbg.location(66,21);
					pushFollow(FOLLOW_output_in_output533);
					output28=output();
					state._fsp--;

					stream_output.add(output28.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(11);}

			// AST REWRITE
			// elements: output, Variable
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 66:30: -> ^( OUTPUT Variable ( output )? )
			{
				dbg.location(66,33);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:66:33: ^( OUTPUT Variable ( output )? )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(66,35);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OUTPUT, "OUTPUT"), root_1);
				dbg.location(66,42);
				adaptor.addChild(root_1, stream_Variable.nextNode());dbg.location(66,51);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:66:51: ( output )?
				if ( stream_output.hasNext() ) {
					dbg.location(66,51);
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
		dbg.location(67, 4);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:69:1: commands : command ( ( WS )* ';' ( WS )* commands )? -> command ( commands )? ;
	public final while_astParser.commands_return commands() throws RecognitionException {
		while_astParser.commands_return retval = new while_astParser.commands_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WS30=null;
		Token char_literal31=null;
		Token WS32=null;
		ParserRuleReturnScope command29 =null;
		ParserRuleReturnScope commands33 =null;

		Object WS30_tree=null;
		Object char_literal31_tree=null;
		Object WS32_tree=null;
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_command=new RewriteRuleSubtreeStream(adaptor,"rule command");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try { dbg.enterRule(getGrammarFileName(), "commands");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(69, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:70:5: ( command ( ( WS )* ';' ( WS )* commands )? -> command ( commands )? )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:70:7: command ( ( WS )* ';' ( WS )* commands )?
			{
			dbg.location(70,7);
			pushFollow(FOLLOW_command_in_commands563);
			command29=command();
			state._fsp--;

			stream_command.add(command29.getTree());dbg.location(70,15);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:70:15: ( ( WS )* ';' ( WS )* commands )?
			int alt14=2;
			try { dbg.enterSubRule(14);
			try { dbg.enterDecision(14, decisionCanBacktrack[14]);

			try {
				isCyclicDecision = true;
				alt14 = dfa14.predict(input);
			}
			catch (NoViableAltException nvae) {
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(14);}

			switch (alt14) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:70:17: ( WS )* ';' ( WS )* commands
					{
					dbg.location(70,17);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:70:17: ( WS )*
					try { dbg.enterSubRule(12);

					loop12:
					while (true) {
						int alt12=2;
						try { dbg.enterDecision(12, decisionCanBacktrack[12]);

						int LA12_0 = input.LA(1);
						if ( (LA12_0==WS) ) {
							alt12=1;
						}

						} finally {dbg.exitDecision(12);}

						switch (alt12) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:70:17: WS
							{
							dbg.location(70,17);
							WS30=(Token)match(input,WS,FOLLOW_WS_in_commands567);  
							stream_WS.add(WS30);

							}
							break;

						default :
							break loop12;
						}
					}
					} finally {dbg.exitSubRule(12);}
					dbg.location(70,21);
					char_literal31=(Token)match(input,38,FOLLOW_38_in_commands570);  
					stream_38.add(char_literal31);
					dbg.location(70,25);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:70:25: ( WS )*
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

							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:70:25: WS
							{
							dbg.location(70,25);
							WS32=(Token)match(input,WS,FOLLOW_WS_in_commands572);  
							stream_WS.add(WS32);

							}
							break;

						default :
							break loop13;
						}
					}
					} finally {dbg.exitSubRule(13);}
					dbg.location(70,29);
					pushFollow(FOLLOW_commands_in_commands575);
					commands33=commands();
					state._fsp--;

					stream_commands.add(commands33.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(14);}

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
			// 70:40: -> command ( commands )?
			{
				dbg.location(70,43);
				adaptor.addChild(root_0, stream_command.nextTree());dbg.location(70,51);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:70:51: ( commands )?
				if ( stream_commands.hasNext() ) {
					dbg.location(70,51);
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
		dbg.location(71, 4);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:73:1: command : ( 'nop' | decl | if_ | for_ | while_ | foreach_ );
	public final while_astParser.command_return command() throws RecognitionException {
		while_astParser.command_return retval = new while_astParser.command_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal34=null;
		ParserRuleReturnScope decl35 =null;
		ParserRuleReturnScope if_36 =null;
		ParserRuleReturnScope for_37 =null;
		ParserRuleReturnScope while_38 =null;
		ParserRuleReturnScope foreach_39 =null;

		Object string_literal34_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "command");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(73, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:74:5: ( 'nop' | decl | if_ | for_ | while_ | foreach_ )
			int alt15=6;
			try { dbg.enterDecision(15, decisionCanBacktrack[15]);

			switch ( input.LA(1) ) {
			case 52:
				{
				alt15=1;
				}
				break;
			case Variable:
				{
				alt15=2;
				}
				break;
			case 48:
				{
				alt15=3;
				}
				break;
			case 44:
				{
				alt15=4;
				}
				break;
			case 57:
				{
				alt15=5;
				}
				break;
			case 45:
				{
				alt15=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(15);}

			switch (alt15) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:74:7: 'nop'
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(74,7);
					string_literal34=(Token)match(input,52,FOLLOW_52_in_command602); 
					string_literal34_tree = (Object)adaptor.create(string_literal34);
					adaptor.addChild(root_0, string_literal34_tree);

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:74:15: decl
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(74,15);
					pushFollow(FOLLOW_decl_in_command606);
					decl35=decl();
					state._fsp--;

					adaptor.addChild(root_0, decl35.getTree());

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:74:22: if_
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(74,22);
					pushFollow(FOLLOW_if__in_command610);
					if_36=if_();
					state._fsp--;

					adaptor.addChild(root_0, if_36.getTree());

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:74:28: for_
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(74,28);
					pushFollow(FOLLOW_for__in_command614);
					for_37=for_();
					state._fsp--;

					adaptor.addChild(root_0, for_37.getTree());

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:74:35: while_
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(74,35);
					pushFollow(FOLLOW_while__in_command618);
					while_38=while_();
					state._fsp--;

					adaptor.addChild(root_0, while_38.getTree());

					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:74:44: foreach_
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(74,44);
					pushFollow(FOLLOW_foreach__in_command622);
					foreach_39=foreach_();
					state._fsp--;

					adaptor.addChild(root_0, foreach_39.getTree());

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
		dbg.location(74, 52);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:76:1: decl : ( vars ( WS )* ':=' ( WS )* exprs ) -> ^( VARDEF vars exprs ) ;
	public final while_astParser.decl_return decl() throws RecognitionException {
		while_astParser.decl_return retval = new while_astParser.decl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WS41=null;
		Token string_literal42=null;
		Token WS43=null;
		ParserRuleReturnScope vars40 =null;
		ParserRuleReturnScope exprs44 =null;

		Object WS41_tree=null;
		Object string_literal42_tree=null;
		Object WS43_tree=null;
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");
		RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");

		try { dbg.enterRule(getGrammarFileName(), "decl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(76, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:77:5: ( ( vars ( WS )* ':=' ( WS )* exprs ) -> ^( VARDEF vars exprs ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:77:7: ( vars ( WS )* ':=' ( WS )* exprs )
			{
			dbg.location(77,7);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:77:7: ( vars ( WS )* ':=' ( WS )* exprs )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:77:8: vars ( WS )* ':=' ( WS )* exprs
			{
			dbg.location(77,8);
			pushFollow(FOLLOW_vars_in_decl636);
			vars40=vars();
			state._fsp--;

			stream_vars.add(vars40.getTree());dbg.location(77,13);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:77:13: ( WS )*
			try { dbg.enterSubRule(16);

			loop16:
			while (true) {
				int alt16=2;
				try { dbg.enterDecision(16, decisionCanBacktrack[16]);

				int LA16_0 = input.LA(1);
				if ( (LA16_0==WS) ) {
					alt16=1;
				}

				} finally {dbg.exitDecision(16);}

				switch (alt16) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:77:13: WS
					{
					dbg.location(77,13);
					WS41=(Token)match(input,WS,FOLLOW_WS_in_decl638);  
					stream_WS.add(WS41);

					}
					break;

				default :
					break loop16;
				}
			}
			} finally {dbg.exitSubRule(16);}
			dbg.location(77,17);
			string_literal42=(Token)match(input,37,FOLLOW_37_in_decl641);  
			stream_37.add(string_literal42);
			dbg.location(77,22);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:77:22: ( WS )*
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:77:22: WS
					{
					dbg.location(77,22);
					WS43=(Token)match(input,WS,FOLLOW_WS_in_decl643);  
					stream_WS.add(WS43);

					}
					break;

				default :
					break loop17;
				}
			}
			} finally {dbg.exitSubRule(17);}
			dbg.location(77,26);
			pushFollow(FOLLOW_exprs_in_decl646);
			exprs44=exprs();
			state._fsp--;

			stream_exprs.add(exprs44.getTree());
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
			// 77:33: -> ^( VARDEF vars exprs )
			{
				dbg.location(77,36);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:77:36: ^( VARDEF vars exprs )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(77,38);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARDEF, "VARDEF"), root_1);
				dbg.location(77,45);
				adaptor.addChild(root_1, stream_vars.nextTree());dbg.location(77,50);
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
		dbg.location(78, 4);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:80:1: if_ : ( 'if' ( WS )* expression ( WS )* then_ ( WS )* else_ 'fi' ) -> ^( IF expression then_ ( else_ )? ) ;
	public final while_astParser.if__return if_() throws RecognitionException {
		while_astParser.if__return retval = new while_astParser.if__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal45=null;
		Token WS46=null;
		Token WS48=null;
		Token WS50=null;
		Token string_literal52=null;
		ParserRuleReturnScope expression47 =null;
		ParserRuleReturnScope then_49 =null;
		ParserRuleReturnScope else_51 =null;

		Object string_literal45_tree=null;
		Object WS46_tree=null;
		Object WS48_tree=null;
		Object WS50_tree=null;
		Object string_literal52_tree=null;
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_then_=new RewriteRuleSubtreeStream(adaptor,"rule then_");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_else_=new RewriteRuleSubtreeStream(adaptor,"rule else_");

		try { dbg.enterRule(getGrammarFileName(), "if_");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(80, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:81:5: ( ( 'if' ( WS )* expression ( WS )* then_ ( WS )* else_ 'fi' ) -> ^( IF expression then_ ( else_ )? ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:81:7: ( 'if' ( WS )* expression ( WS )* then_ ( WS )* else_ 'fi' )
			{
			dbg.location(81,7);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:81:7: ( 'if' ( WS )* expression ( WS )* then_ ( WS )* else_ 'fi' )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:81:8: 'if' ( WS )* expression ( WS )* then_ ( WS )* else_ 'fi'
			{
			dbg.location(81,8);
			string_literal45=(Token)match(input,48,FOLLOW_48_in_if_675);  
			stream_48.add(string_literal45);
			dbg.location(81,13);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:81:13: ( WS )*
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:81:13: WS
					{
					dbg.location(81,13);
					WS46=(Token)match(input,WS,FOLLOW_WS_in_if_677);  
					stream_WS.add(WS46);

					}
					break;

				default :
					break loop18;
				}
			}
			} finally {dbg.exitSubRule(18);}
			dbg.location(81,17);
			pushFollow(FOLLOW_expression_in_if_680);
			expression47=expression();
			state._fsp--;

			stream_expression.add(expression47.getTree());dbg.location(81,28);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:81:28: ( WS )*
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:81:28: WS
					{
					dbg.location(81,28);
					WS48=(Token)match(input,WS,FOLLOW_WS_in_if_682);  
					stream_WS.add(WS48);

					}
					break;

				default :
					break loop19;
				}
			}
			} finally {dbg.exitSubRule(19);}
			dbg.location(81,32);
			pushFollow(FOLLOW_then__in_if_685);
			then_49=then_();
			state._fsp--;

			stream_then_.add(then_49.getTree());dbg.location(81,39);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:81:39: ( WS )*
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:81:39: WS
					{
					dbg.location(81,39);
					WS50=(Token)match(input,WS,FOLLOW_WS_in_if_688);  
					stream_WS.add(WS50);

					}
					break;

				default :
					break loop20;
				}
			}
			} finally {dbg.exitSubRule(20);}
			dbg.location(81,43);
			pushFollow(FOLLOW_else__in_if_691);
			else_51=else_();
			state._fsp--;

			stream_else_.add(else_51.getTree());dbg.location(81,49);
			string_literal52=(Token)match(input,43,FOLLOW_43_in_if_693);  
			stream_43.add(string_literal52);

			}

			// AST REWRITE
			// elements: expression, then_, else_
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 81:55: -> ^( IF expression then_ ( else_ )? )
			{
				dbg.location(81,58);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:81:58: ^( IF expression then_ ( else_ )? )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(81,60);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);
				dbg.location(81,63);
				adaptor.addChild(root_1, stream_expression.nextTree());dbg.location(81,74);
				adaptor.addChild(root_1, stream_then_.nextTree());dbg.location(81,80);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:81:80: ( else_ )?
				if ( stream_else_.hasNext() ) {
					dbg.location(81,80);
					adaptor.addChild(root_1, stream_else_.nextTree());
				}
				stream_else_.reset();

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
		dbg.location(82, 4);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:84:1: then_ : 'then' ( WS )* commands ( WS )* -> ^( THEN commands ) ;
	public final while_astParser.then__return then_() throws RecognitionException {
		while_astParser.then__return retval = new while_astParser.then__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal53=null;
		Token WS54=null;
		Token WS56=null;
		ParserRuleReturnScope commands55 =null;

		Object string_literal53_tree=null;
		Object WS54_tree=null;
		Object WS56_tree=null;
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try { dbg.enterRule(getGrammarFileName(), "then_");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(84, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:84:7: ( 'then' ( WS )* commands ( WS )* -> ^( THEN commands ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:84:9: 'then' ( WS )* commands ( WS )*
			{
			dbg.location(84,9);
			string_literal53=(Token)match(input,55,FOLLOW_55_in_then_724);  
			stream_55.add(string_literal53);
			dbg.location(84,16);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:84:16: ( WS )*
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:84:16: WS
					{
					dbg.location(84,16);
					WS54=(Token)match(input,WS,FOLLOW_WS_in_then_726);  
					stream_WS.add(WS54);

					}
					break;

				default :
					break loop21;
				}
			}
			} finally {dbg.exitSubRule(21);}
			dbg.location(84,20);
			pushFollow(FOLLOW_commands_in_then_729);
			commands55=commands();
			state._fsp--;

			stream_commands.add(commands55.getTree());dbg.location(84,29);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:84:29: ( WS )*
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:84:29: WS
					{
					dbg.location(84,29);
					WS56=(Token)match(input,WS,FOLLOW_WS_in_then_731);  
					stream_WS.add(WS56);

					}
					break;

				default :
					break loop22;
				}
			}
			} finally {dbg.exitSubRule(22);}

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
			// 84:33: -> ^( THEN commands )
			{
				dbg.location(84,36);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:84:36: ^( THEN commands )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(84,38);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(THEN, "THEN"), root_1);
				dbg.location(84,43);
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
		dbg.location(84, 51);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:86:1: else_ : ( 'else' ( WS )* commands )? -> ^( ELSE commands ) ;
	public final while_astParser.else__return else_() throws RecognitionException {
		while_astParser.else__return retval = new while_astParser.else__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal57=null;
		Token WS58=null;
		ParserRuleReturnScope commands59 =null;

		Object string_literal57_tree=null;
		Object WS58_tree=null;
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try { dbg.enterRule(getGrammarFileName(), "else_");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(86, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:86:7: ( ( 'else' ( WS )* commands )? -> ^( ELSE commands ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:86:9: ( 'else' ( WS )* commands )?
			{
			dbg.location(86,9);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:86:9: ( 'else' ( WS )* commands )?
			int alt24=2;
			try { dbg.enterSubRule(24);
			try { dbg.enterDecision(24, decisionCanBacktrack[24]);

			int LA24_0 = input.LA(1);
			if ( (LA24_0==42) ) {
				alt24=1;
			}
			} finally {dbg.exitDecision(24);}

			switch (alt24) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:86:10: 'else' ( WS )* commands
					{
					dbg.location(86,10);
					string_literal57=(Token)match(input,42,FOLLOW_42_in_else_749);  
					stream_42.add(string_literal57);
					dbg.location(86,17);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:86:17: ( WS )*
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

							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:86:17: WS
							{
							dbg.location(86,17);
							WS58=(Token)match(input,WS,FOLLOW_WS_in_else_751);  
							stream_WS.add(WS58);

							}
							break;

						default :
							break loop23;
						}
					}
					} finally {dbg.exitSubRule(23);}
					dbg.location(86,21);
					pushFollow(FOLLOW_commands_in_else_754);
					commands59=commands();
					state._fsp--;

					stream_commands.add(commands59.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(24);}

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
			// 86:32: -> ^( ELSE commands )
			{
				dbg.location(86,35);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:86:35: ^( ELSE commands )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(86,37);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ELSE, "ELSE"), root_1);
				dbg.location(86,42);
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
		dbg.location(86, 50);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:88:1: while_ : ( 'while' ( WS )* expression ( WS )* do_ ) -> ^( WHILE expression do_ ) ;
	public final while_astParser.while__return while_() throws RecognitionException {
		while_astParser.while__return retval = new while_astParser.while__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal60=null;
		Token WS61=null;
		Token WS63=null;
		ParserRuleReturnScope expression62 =null;
		ParserRuleReturnScope do_64 =null;

		Object string_literal60_tree=null;
		Object WS61_tree=null;
		Object WS63_tree=null;
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_do_=new RewriteRuleSubtreeStream(adaptor,"rule do_");

		try { dbg.enterRule(getGrammarFileName(), "while_");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(88, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:89:5: ( ( 'while' ( WS )* expression ( WS )* do_ ) -> ^( WHILE expression do_ ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:89:7: ( 'while' ( WS )* expression ( WS )* do_ )
			{
			dbg.location(89,7);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:89:7: ( 'while' ( WS )* expression ( WS )* do_ )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:89:8: 'while' ( WS )* expression ( WS )* do_
			{
			dbg.location(89,8);
			string_literal60=(Token)match(input,57,FOLLOW_57_in_while_777);  
			stream_57.add(string_literal60);
			dbg.location(89,16);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:89:16: ( WS )*
			try { dbg.enterSubRule(25);

			loop25:
			while (true) {
				int alt25=2;
				try { dbg.enterDecision(25, decisionCanBacktrack[25]);

				int LA25_0 = input.LA(1);
				if ( (LA25_0==WS) ) {
					alt25=1;
				}

				} finally {dbg.exitDecision(25);}

				switch (alt25) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:89:16: WS
					{
					dbg.location(89,16);
					WS61=(Token)match(input,WS,FOLLOW_WS_in_while_779);  
					stream_WS.add(WS61);

					}
					break;

				default :
					break loop25;
				}
			}
			} finally {dbg.exitSubRule(25);}
			dbg.location(89,20);
			pushFollow(FOLLOW_expression_in_while_782);
			expression62=expression();
			state._fsp--;

			stream_expression.add(expression62.getTree());dbg.location(89,31);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:89:31: ( WS )*
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:89:31: WS
					{
					dbg.location(89,31);
					WS63=(Token)match(input,WS,FOLLOW_WS_in_while_784);  
					stream_WS.add(WS63);

					}
					break;

				default :
					break loop26;
				}
			}
			} finally {dbg.exitSubRule(26);}
			dbg.location(89,35);
			pushFollow(FOLLOW_do__in_while_787);
			do_64=do_();
			state._fsp--;

			stream_do_.add(do_64.getTree());
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
			// 89:40: -> ^( WHILE expression do_ )
			{
				dbg.location(89,43);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:89:43: ^( WHILE expression do_ )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(89,45);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WHILE, "WHILE"), root_1);
				dbg.location(89,51);
				adaptor.addChild(root_1, stream_expression.nextTree());dbg.location(89,62);
				adaptor.addChild(root_1, stream_do_.nextTree());
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
		dbg.location(90, 4);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:92:1: do_ : 'do' ( WS )* commands ( WS )* 'od' -> ^( DO commands ) ;
	public final while_astParser.do__return do_() throws RecognitionException {
		while_astParser.do__return retval = new while_astParser.do__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal65=null;
		Token WS66=null;
		Token WS68=null;
		Token string_literal69=null;
		ParserRuleReturnScope commands67 =null;

		Object string_literal65_tree=null;
		Object WS66_tree=null;
		Object WS68_tree=null;
		Object string_literal69_tree=null;
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try { dbg.enterRule(getGrammarFileName(), "do_");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(92, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:92:6: ( 'do' ( WS )* commands ( WS )* 'od' -> ^( DO commands ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:92:8: 'do' ( WS )* commands ( WS )* 'od'
			{
			dbg.location(92,8);
			string_literal65=(Token)match(input,41,FOLLOW_41_in_do_816);  
			stream_41.add(string_literal65);
			dbg.location(92,13);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:92:13: ( WS )*
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:92:13: WS
					{
					dbg.location(92,13);
					WS66=(Token)match(input,WS,FOLLOW_WS_in_do_818);  
					stream_WS.add(WS66);

					}
					break;

				default :
					break loop27;
				}
			}
			} finally {dbg.exitSubRule(27);}
			dbg.location(92,17);
			pushFollow(FOLLOW_commands_in_do_821);
			commands67=commands();
			state._fsp--;

			stream_commands.add(commands67.getTree());dbg.location(92,26);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:92:26: ( WS )*
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:92:26: WS
					{
					dbg.location(92,26);
					WS68=(Token)match(input,WS,FOLLOW_WS_in_do_823);  
					stream_WS.add(WS68);

					}
					break;

				default :
					break loop28;
				}
			}
			} finally {dbg.exitSubRule(28);}
			dbg.location(92,30);
			string_literal69=(Token)match(input,53,FOLLOW_53_in_do_826);  
			stream_53.add(string_literal69);

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
			// 92:35: -> ^( DO commands )
			{
				dbg.location(92,38);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:92:38: ^( DO commands )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(92,40);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DO, "DO"), root_1);
				dbg.location(92,43);
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
		dbg.location(92, 51);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:94:1: for_ : ( 'for' ( WS )* expression ( WS )* do_ ) -> ^( FOR expression do_ ) ;
	public final while_astParser.for__return for_() throws RecognitionException {
		while_astParser.for__return retval = new while_astParser.for__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal70=null;
		Token WS71=null;
		Token WS73=null;
		ParserRuleReturnScope expression72 =null;
		ParserRuleReturnScope do_74 =null;

		Object string_literal70_tree=null;
		Object WS71_tree=null;
		Object WS73_tree=null;
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_do_=new RewriteRuleSubtreeStream(adaptor,"rule do_");

		try { dbg.enterRule(getGrammarFileName(), "for_");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(94, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:95:5: ( ( 'for' ( WS )* expression ( WS )* do_ ) -> ^( FOR expression do_ ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:95:7: ( 'for' ( WS )* expression ( WS )* do_ )
			{
			dbg.location(95,7);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:95:7: ( 'for' ( WS )* expression ( WS )* do_ )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:95:8: 'for' ( WS )* expression ( WS )* do_
			{
			dbg.location(95,8);
			string_literal70=(Token)match(input,44,FOLLOW_44_in_for_847);  
			stream_44.add(string_literal70);
			dbg.location(95,14);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:95:14: ( WS )*
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:95:14: WS
					{
					dbg.location(95,14);
					WS71=(Token)match(input,WS,FOLLOW_WS_in_for_849);  
					stream_WS.add(WS71);

					}
					break;

				default :
					break loop29;
				}
			}
			} finally {dbg.exitSubRule(29);}
			dbg.location(95,18);
			pushFollow(FOLLOW_expression_in_for_852);
			expression72=expression();
			state._fsp--;

			stream_expression.add(expression72.getTree());dbg.location(95,29);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:95:29: ( WS )*
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:95:29: WS
					{
					dbg.location(95,29);
					WS73=(Token)match(input,WS,FOLLOW_WS_in_for_854);  
					stream_WS.add(WS73);

					}
					break;

				default :
					break loop30;
				}
			}
			} finally {dbg.exitSubRule(30);}
			dbg.location(95,33);
			pushFollow(FOLLOW_do__in_for_857);
			do_74=do_();
			state._fsp--;

			stream_do_.add(do_74.getTree());
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
			// 95:38: -> ^( FOR expression do_ )
			{
				dbg.location(95,41);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:95:41: ^( FOR expression do_ )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(95,43);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOR, "FOR"), root_1);
				dbg.location(95,47);
				adaptor.addChild(root_1, stream_expression.nextTree());dbg.location(95,58);
				adaptor.addChild(root_1, stream_do_.nextTree());
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
		dbg.location(96, 4);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:98:1: foreach_ : ( 'foreach' ( WS )* Variable ( WS )* 'in' ( WS )* expression ( WS )* do_ ) -> ^( FOREACH ^( IN Variable expression ) do_ ) ;
	public final while_astParser.foreach__return foreach_() throws RecognitionException {
		while_astParser.foreach__return retval = new while_astParser.foreach__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal75=null;
		Token WS76=null;
		Token Variable77=null;
		Token WS78=null;
		Token string_literal79=null;
		Token WS80=null;
		Token WS82=null;
		ParserRuleReturnScope expression81 =null;
		ParserRuleReturnScope do_83 =null;

		Object string_literal75_tree=null;
		Object WS76_tree=null;
		Object Variable77_tree=null;
		Object WS78_tree=null;
		Object string_literal79_tree=null;
		Object WS80_tree=null;
		Object WS82_tree=null;
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_do_=new RewriteRuleSubtreeStream(adaptor,"rule do_");

		try { dbg.enterRule(getGrammarFileName(), "foreach_");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(98, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:5: ( ( 'foreach' ( WS )* Variable ( WS )* 'in' ( WS )* expression ( WS )* do_ ) -> ^( FOREACH ^( IN Variable expression ) do_ ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:7: ( 'foreach' ( WS )* Variable ( WS )* 'in' ( WS )* expression ( WS )* do_ )
			{
			dbg.location(99,7);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:7: ( 'foreach' ( WS )* Variable ( WS )* 'in' ( WS )* expression ( WS )* do_ )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:8: 'foreach' ( WS )* Variable ( WS )* 'in' ( WS )* expression ( WS )* do_
			{
			dbg.location(99,8);
			string_literal75=(Token)match(input,45,FOLLOW_45_in_foreach_886);  
			stream_45.add(string_literal75);
			dbg.location(99,18);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:18: ( WS )*
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:18: WS
					{
					dbg.location(99,18);
					WS76=(Token)match(input,WS,FOLLOW_WS_in_foreach_888);  
					stream_WS.add(WS76);

					}
					break;

				default :
					break loop31;
				}
			}
			} finally {dbg.exitSubRule(31);}
			dbg.location(99,22);
			Variable77=(Token)match(input,Variable,FOLLOW_Variable_in_foreach_891);  
			stream_Variable.add(Variable77);
			dbg.location(99,31);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:31: ( WS )*
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:31: WS
					{
					dbg.location(99,31);
					WS78=(Token)match(input,WS,FOLLOW_WS_in_foreach_893);  
					stream_WS.add(WS78);

					}
					break;

				default :
					break loop32;
				}
			}
			} finally {dbg.exitSubRule(32);}
			dbg.location(99,35);
			string_literal79=(Token)match(input,49,FOLLOW_49_in_foreach_896);  
			stream_49.add(string_literal79);
			dbg.location(99,40);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:40: ( WS )*
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:40: WS
					{
					dbg.location(99,40);
					WS80=(Token)match(input,WS,FOLLOW_WS_in_foreach_898);  
					stream_WS.add(WS80);

					}
					break;

				default :
					break loop33;
				}
			}
			} finally {dbg.exitSubRule(33);}
			dbg.location(99,44);
			pushFollow(FOLLOW_expression_in_foreach_901);
			expression81=expression();
			state._fsp--;

			stream_expression.add(expression81.getTree());dbg.location(99,55);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:55: ( WS )*
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:55: WS
					{
					dbg.location(99,55);
					WS82=(Token)match(input,WS,FOLLOW_WS_in_foreach_903);  
					stream_WS.add(WS82);

					}
					break;

				default :
					break loop34;
				}
			}
			} finally {dbg.exitSubRule(34);}
			dbg.location(99,59);
			pushFollow(FOLLOW_do__in_foreach_906);
			do_83=do_();
			state._fsp--;

			stream_do_.add(do_83.getTree());
			}

			// AST REWRITE
			// elements: expression, Variable, do_
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 99:64: -> ^( FOREACH ^( IN Variable expression ) do_ )
			{
				dbg.location(99,67);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:67: ^( FOREACH ^( IN Variable expression ) do_ )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(99,69);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOREACH, "FOREACH"), root_1);
				dbg.location(99,77);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:77: ^( IN Variable expression )
				{
				Object root_2 = (Object)adaptor.nil();
				dbg.location(99,79);
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(IN, "IN"), root_2);
				dbg.location(99,82);
				adaptor.addChild(root_2, stream_Variable.nextNode());dbg.location(99,91);
				adaptor.addChild(root_2, stream_expression.nextTree());
				adaptor.addChild(root_1, root_2);
				}
				dbg.location(99,103);
				adaptor.addChild(root_1, stream_do_.nextTree());
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
		dbg.location(100, 4);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:102:1: vars : Variable ( ',' vars )? -> ^( VARIABLES Variable ( vars )* ) ;
	public final while_astParser.vars_return vars() throws RecognitionException {
		while_astParser.vars_return retval = new while_astParser.vars_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Variable84=null;
		Token char_literal85=null;
		ParserRuleReturnScope vars86 =null;

		Object Variable84_tree=null;
		Object char_literal85_tree=null;
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");

		try { dbg.enterRule(getGrammarFileName(), "vars");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(102, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:103:5: ( Variable ( ',' vars )? -> ^( VARIABLES Variable ( vars )* ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:103:7: Variable ( ',' vars )?
			{
			dbg.location(103,7);
			Variable84=(Token)match(input,Variable,FOLLOW_Variable_in_vars940);  
			stream_Variable.add(Variable84);
			dbg.location(103,16);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:103:16: ( ',' vars )?
			int alt35=2;
			try { dbg.enterSubRule(35);
			try { dbg.enterDecision(35, decisionCanBacktrack[35]);

			int LA35_0 = input.LA(1);
			if ( (LA35_0==35) ) {
				alt35=1;
			}
			} finally {dbg.exitDecision(35);}

			switch (alt35) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:103:17: ',' vars
					{
					dbg.location(103,17);
					char_literal85=(Token)match(input,35,FOLLOW_35_in_vars943);  
					stream_35.add(char_literal85);
					dbg.location(103,21);
					pushFollow(FOLLOW_vars_in_vars945);
					vars86=vars();
					state._fsp--;

					stream_vars.add(vars86.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(35);}

			// AST REWRITE
			// elements: vars, Variable
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 103:28: -> ^( VARIABLES Variable ( vars )* )
			{
				dbg.location(103,31);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:103:31: ^( VARIABLES Variable ( vars )* )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(103,33);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARIABLES, "VARIABLES"), root_1);
				dbg.location(103,43);
				adaptor.addChild(root_1, stream_Variable.nextNode());dbg.location(103,52);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:103:52: ( vars )*
				while ( stream_vars.hasNext() ) {
					dbg.location(103,52);
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
		dbg.location(104, 4);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:106:1: exprs : expression ( ',' exprs )? -> expression ( exprs )* ;
	public final while_astParser.exprs_return exprs() throws RecognitionException {
		while_astParser.exprs_return retval = new while_astParser.exprs_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal88=null;
		ParserRuleReturnScope expression87 =null;
		ParserRuleReturnScope exprs89 =null;

		Object char_literal88_tree=null;
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");

		try { dbg.enterRule(getGrammarFileName(), "exprs");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(106, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:107:5: ( expression ( ',' exprs )? -> expression ( exprs )* )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:107:7: expression ( ',' exprs )?
			{
			dbg.location(107,7);
			pushFollow(FOLLOW_expression_in_exprs975);
			expression87=expression();
			state._fsp--;

			stream_expression.add(expression87.getTree());dbg.location(107,18);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:107:18: ( ',' exprs )?
			int alt36=2;
			try { dbg.enterSubRule(36);
			try { dbg.enterDecision(36, decisionCanBacktrack[36]);

			int LA36_0 = input.LA(1);
			if ( (LA36_0==35) ) {
				alt36=1;
			}
			} finally {dbg.exitDecision(36);}

			switch (alt36) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:107:19: ',' exprs
					{
					dbg.location(107,19);
					char_literal88=(Token)match(input,35,FOLLOW_35_in_exprs978);  
					stream_35.add(char_literal88);
					dbg.location(107,23);
					pushFollow(FOLLOW_exprs_in_exprs980);
					exprs89=exprs();
					state._fsp--;

					stream_exprs.add(exprs89.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(36);}

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
			// 107:31: -> expression ( exprs )*
			{
				dbg.location(107,34);
				adaptor.addChild(root_0, stream_expression.nextTree());dbg.location(107,45);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:107:45: ( exprs )*
				while ( stream_exprs.hasNext() ) {
					dbg.location(107,45);
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
		dbg.location(108, 4);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:110:1: exprBase : ( nil_ | variable | cons | list | hd | tl | symbolExpr );
	public final while_astParser.exprBase_return exprBase() throws RecognitionException {
		while_astParser.exprBase_return retval = new while_astParser.exprBase_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope nil_90 =null;
		ParserRuleReturnScope variable91 =null;
		ParserRuleReturnScope cons92 =null;
		ParserRuleReturnScope list93 =null;
		ParserRuleReturnScope hd94 =null;
		ParserRuleReturnScope tl95 =null;
		ParserRuleReturnScope symbolExpr96 =null;


		try { dbg.enterRule(getGrammarFileName(), "exprBase");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(110, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:110:12: ( nil_ | variable | cons | list | hd | tl | symbolExpr )
			int alt37=7;
			try { dbg.enterDecision(37, decisionCanBacktrack[37]);

			try {
				isCyclicDecision = true;
				alt37 = dfa37.predict(input);
			}
			catch (NoViableAltException nvae) {
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(37);}

			switch (alt37) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:110:15: nil_
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(110,15);
					pushFollow(FOLLOW_nil__in_exprBase1005);
					nil_90=nil_();
					state._fsp--;

					adaptor.addChild(root_0, nil_90.getTree());

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:111:7: variable
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(111,7);
					pushFollow(FOLLOW_variable_in_exprBase1013);
					variable91=variable();
					state._fsp--;

					adaptor.addChild(root_0, variable91.getTree());

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:112:7: cons
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(112,7);
					pushFollow(FOLLOW_cons_in_exprBase1021);
					cons92=cons();
					state._fsp--;

					adaptor.addChild(root_0, cons92.getTree());

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:112:14: list
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(112,14);
					pushFollow(FOLLOW_list_in_exprBase1025);
					list93=list();
					state._fsp--;

					adaptor.addChild(root_0, list93.getTree());

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:113:7: hd
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(113,7);
					pushFollow(FOLLOW_hd_in_exprBase1033);
					hd94=hd();
					state._fsp--;

					adaptor.addChild(root_0, hd94.getTree());

					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:113:12: tl
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(113,12);
					pushFollow(FOLLOW_tl_in_exprBase1037);
					tl95=tl();
					state._fsp--;

					adaptor.addChild(root_0, tl95.getTree());

					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:114:7: symbolExpr
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(114,7);
					pushFollow(FOLLOW_symbolExpr_in_exprBase1045);
					symbolExpr96=symbolExpr();
					state._fsp--;

					adaptor.addChild(root_0, symbolExpr96.getTree());

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
		dbg.location(115, 4);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:117:1: nil_ : ( 'nil' ( WS )* ) -> 'nil' ;
	public final while_astParser.nil__return nil_() throws RecognitionException {
		while_astParser.nil__return retval = new while_astParser.nil__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal97=null;
		Token WS98=null;

		Object string_literal97_tree=null;
		Object WS98_tree=null;
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");

		try { dbg.enterRule(getGrammarFileName(), "nil_");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(117, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:117:6: ( ( 'nil' ( WS )* ) -> 'nil' )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:117:8: ( 'nil' ( WS )* )
			{
			dbg.location(117,8);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:117:8: ( 'nil' ( WS )* )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:117:9: 'nil' ( WS )*
			{
			dbg.location(117,9);
			string_literal97=(Token)match(input,51,FOLLOW_51_in_nil_1064);  
			stream_51.add(string_literal97);
			dbg.location(117,14);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:117:14: ( WS )*
			try { dbg.enterSubRule(38);

			loop38:
			while (true) {
				int alt38=2;
				try { dbg.enterDecision(38, decisionCanBacktrack[38]);

				int LA38_0 = input.LA(1);
				if ( (LA38_0==WS) ) {
					alt38=1;
				}

				} finally {dbg.exitDecision(38);}

				switch (alt38) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:117:14: WS
					{
					dbg.location(117,14);
					WS98=(Token)match(input,WS,FOLLOW_WS_in_nil_1065);  
					stream_WS.add(WS98);

					}
					break;

				default :
					break loop38;
				}
			}
			} finally {dbg.exitSubRule(38);}

			}

			// AST REWRITE
			// elements: 51
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 117:19: -> 'nil'
			{
				dbg.location(117,22);
				adaptor.addChild(root_0, stream_51.nextNode());
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
		dbg.location(117, 26);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:119:1: variable : Variable -> Variable ;
	public final while_astParser.variable_return variable() throws RecognitionException {
		while_astParser.variable_return retval = new while_astParser.variable_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Variable99=null;

		Object Variable99_tree=null;
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");

		try { dbg.enterRule(getGrammarFileName(), "variable");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(119, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:119:9: ( Variable -> Variable )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:119:11: Variable
			{
			dbg.location(119,11);
			Variable99=(Token)match(input,Variable,FOLLOW_Variable_in_variable1082);  
			stream_Variable.add(Variable99);

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
			// 119:20: -> Variable
			{
				dbg.location(119,23);
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
		dbg.location(119, 30);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:121:1: cons : '(' ( WS )* 'cons ' lExpr ( WS )* ')' -> ^( CONS lExpr ) ;
	public final while_astParser.cons_return cons() throws RecognitionException {
		while_astParser.cons_return retval = new while_astParser.cons_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal100=null;
		Token WS101=null;
		Token string_literal102=null;
		Token WS104=null;
		Token char_literal105=null;
		ParserRuleReturnScope lExpr103 =null;

		Object char_literal100_tree=null;
		Object WS101_tree=null;
		Object string_literal102_tree=null;
		Object WS104_tree=null;
		Object char_literal105_tree=null;
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleSubtreeStream stream_lExpr=new RewriteRuleSubtreeStream(adaptor,"rule lExpr");

		try { dbg.enterRule(getGrammarFileName(), "cons");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(121, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:121:6: ( '(' ( WS )* 'cons ' lExpr ( WS )* ')' -> ^( CONS lExpr ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:121:8: '(' ( WS )* 'cons ' lExpr ( WS )* ')'
			{
			dbg.location(121,8);
			char_literal100=(Token)match(input,33,FOLLOW_33_in_cons1094);  
			stream_33.add(char_literal100);
			dbg.location(121,12);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:121:12: ( WS )*
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:121:12: WS
					{
					dbg.location(121,12);
					WS101=(Token)match(input,WS,FOLLOW_WS_in_cons1096);  
					stream_WS.add(WS101);

					}
					break;

				default :
					break loop39;
				}
			}
			} finally {dbg.exitSubRule(39);}
			dbg.location(121,16);
			string_literal102=(Token)match(input,40,FOLLOW_40_in_cons1099);  
			stream_40.add(string_literal102);
			dbg.location(121,24);
			pushFollow(FOLLOW_lExpr_in_cons1101);
			lExpr103=lExpr();
			state._fsp--;

			stream_lExpr.add(lExpr103.getTree());dbg.location(121,30);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:121:30: ( WS )*
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:121:30: WS
					{
					dbg.location(121,30);
					WS104=(Token)match(input,WS,FOLLOW_WS_in_cons1103);  
					stream_WS.add(WS104);

					}
					break;

				default :
					break loop40;
				}
			}
			} finally {dbg.exitSubRule(40);}
			dbg.location(121,34);
			char_literal105=(Token)match(input,34,FOLLOW_34_in_cons1106);  
			stream_34.add(char_literal105);

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
			// 121:38: -> ^( CONS lExpr )
			{
				dbg.location(121,41);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:121:41: ^( CONS lExpr )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(121,43);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONS, "CONS"), root_1);
				dbg.location(121,48);
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
		dbg.location(121, 53);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:123:1: list : '(' ( WS )* 'list ' lExpr ( WS )* ')' -> ^( LIST lExpr ) ;
	public final while_astParser.list_return list() throws RecognitionException {
		while_astParser.list_return retval = new while_astParser.list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal106=null;
		Token WS107=null;
		Token string_literal108=null;
		Token WS110=null;
		Token char_literal111=null;
		ParserRuleReturnScope lExpr109 =null;

		Object char_literal106_tree=null;
		Object WS107_tree=null;
		Object string_literal108_tree=null;
		Object WS110_tree=null;
		Object char_literal111_tree=null;
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_lExpr=new RewriteRuleSubtreeStream(adaptor,"rule lExpr");

		try { dbg.enterRule(getGrammarFileName(), "list");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(123, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:123:6: ( '(' ( WS )* 'list ' lExpr ( WS )* ')' -> ^( LIST lExpr ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:123:8: '(' ( WS )* 'list ' lExpr ( WS )* ')'
			{
			dbg.location(123,8);
			char_literal106=(Token)match(input,33,FOLLOW_33_in_list1122);  
			stream_33.add(char_literal106);
			dbg.location(123,11);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:123:11: ( WS )*
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:123:11: WS
					{
					dbg.location(123,11);
					WS107=(Token)match(input,WS,FOLLOW_WS_in_list1123);  
					stream_WS.add(WS107);

					}
					break;

				default :
					break loop41;
				}
			}
			} finally {dbg.exitSubRule(41);}
			dbg.location(123,15);
			string_literal108=(Token)match(input,50,FOLLOW_50_in_list1126);  
			stream_50.add(string_literal108);
			dbg.location(123,23);
			pushFollow(FOLLOW_lExpr_in_list1128);
			lExpr109=lExpr();
			state._fsp--;

			stream_lExpr.add(lExpr109.getTree());dbg.location(123,29);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:123:29: ( WS )*
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:123:29: WS
					{
					dbg.location(123,29);
					WS110=(Token)match(input,WS,FOLLOW_WS_in_list1130);  
					stream_WS.add(WS110);

					}
					break;

				default :
					break loop42;
				}
			}
			} finally {dbg.exitSubRule(42);}
			dbg.location(123,33);
			char_literal111=(Token)match(input,34,FOLLOW_34_in_list1133);  
			stream_34.add(char_literal111);

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
			// 123:37: -> ^( LIST lExpr )
			{
				dbg.location(123,40);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:123:40: ^( LIST lExpr )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(123,42);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);
				dbg.location(123,47);
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
		dbg.location(123, 52);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:125:1: hd : '(' ( WS )* 'hd ' exprBase ( WS )* ')' -> ^( HD exprBase ) ;
	public final while_astParser.hd_return hd() throws RecognitionException {
		while_astParser.hd_return retval = new while_astParser.hd_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal112=null;
		Token WS113=null;
		Token string_literal114=null;
		Token WS116=null;
		Token char_literal117=null;
		ParserRuleReturnScope exprBase115 =null;

		Object char_literal112_tree=null;
		Object WS113_tree=null;
		Object string_literal114_tree=null;
		Object WS116_tree=null;
		Object char_literal117_tree=null;
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");

		try { dbg.enterRule(getGrammarFileName(), "hd");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(125, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:125:4: ( '(' ( WS )* 'hd ' exprBase ( WS )* ')' -> ^( HD exprBase ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:125:6: '(' ( WS )* 'hd ' exprBase ( WS )* ')'
			{
			dbg.location(125,6);
			char_literal112=(Token)match(input,33,FOLLOW_33_in_hd1149);  
			stream_33.add(char_literal112);
			dbg.location(125,9);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:125:9: ( WS )*
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:125:9: WS
					{
					dbg.location(125,9);
					WS113=(Token)match(input,WS,FOLLOW_WS_in_hd1150);  
					stream_WS.add(WS113);

					}
					break;

				default :
					break loop43;
				}
			}
			} finally {dbg.exitSubRule(43);}
			dbg.location(125,13);
			string_literal114=(Token)match(input,47,FOLLOW_47_in_hd1153);  
			stream_47.add(string_literal114);
			dbg.location(125,19);
			pushFollow(FOLLOW_exprBase_in_hd1155);
			exprBase115=exprBase();
			state._fsp--;

			stream_exprBase.add(exprBase115.getTree());dbg.location(125,28);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:125:28: ( WS )*
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:125:28: WS
					{
					dbg.location(125,28);
					WS116=(Token)match(input,WS,FOLLOW_WS_in_hd1157);  
					stream_WS.add(WS116);

					}
					break;

				default :
					break loop44;
				}
			}
			} finally {dbg.exitSubRule(44);}
			dbg.location(125,31);
			char_literal117=(Token)match(input,34,FOLLOW_34_in_hd1159);  
			stream_34.add(char_literal117);

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
			// 125:35: -> ^( HD exprBase )
			{
				dbg.location(125,38);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:125:38: ^( HD exprBase )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(125,40);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(HD, "HD"), root_1);
				dbg.location(125,43);
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
		dbg.location(125, 51);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:127:1: tl : '(' ( WS )* 'tl ' exprBase ( WS )* ')' -> ^( TL exprBase ) ;
	public final while_astParser.tl_return tl() throws RecognitionException {
		while_astParser.tl_return retval = new while_astParser.tl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal118=null;
		Token WS119=null;
		Token string_literal120=null;
		Token WS122=null;
		Token char_literal123=null;
		ParserRuleReturnScope exprBase121 =null;

		Object char_literal118_tree=null;
		Object WS119_tree=null;
		Object string_literal120_tree=null;
		Object WS122_tree=null;
		Object char_literal123_tree=null;
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");

		try { dbg.enterRule(getGrammarFileName(), "tl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(127, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:127:4: ( '(' ( WS )* 'tl ' exprBase ( WS )* ')' -> ^( TL exprBase ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:127:6: '(' ( WS )* 'tl ' exprBase ( WS )* ')'
			{
			dbg.location(127,6);
			char_literal118=(Token)match(input,33,FOLLOW_33_in_tl1175);  
			stream_33.add(char_literal118);
			dbg.location(127,10);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:127:10: ( WS )*
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:127:10: WS
					{
					dbg.location(127,10);
					WS119=(Token)match(input,WS,FOLLOW_WS_in_tl1177);  
					stream_WS.add(WS119);

					}
					break;

				default :
					break loop45;
				}
			}
			} finally {dbg.exitSubRule(45);}
			dbg.location(127,13);
			string_literal120=(Token)match(input,56,FOLLOW_56_in_tl1179);  
			stream_56.add(string_literal120);
			dbg.location(127,19);
			pushFollow(FOLLOW_exprBase_in_tl1181);
			exprBase121=exprBase();
			state._fsp--;

			stream_exprBase.add(exprBase121.getTree());dbg.location(127,28);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:127:28: ( WS )*
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:127:28: WS
					{
					dbg.location(127,28);
					WS122=(Token)match(input,WS,FOLLOW_WS_in_tl1183);  
					stream_WS.add(WS122);

					}
					break;

				default :
					break loop46;
				}
			}
			} finally {dbg.exitSubRule(46);}
			dbg.location(127,31);
			char_literal123=(Token)match(input,34,FOLLOW_34_in_tl1185);  
			stream_34.add(char_literal123);

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
			// 127:35: -> ^( TL exprBase )
			{
				dbg.location(127,38);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:127:38: ^( TL exprBase )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(127,40);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TL, "TL"), root_1);
				dbg.location(127,43);
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
		dbg.location(127, 51);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:129:1: symbolExpr : '(' Symbol ( WS )* ( lExpr )? ')' -> Symbol ( lExpr )? ;
	public final while_astParser.symbolExpr_return symbolExpr() throws RecognitionException {
		while_astParser.symbolExpr_return retval = new while_astParser.symbolExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal124=null;
		Token Symbol125=null;
		Token WS126=null;
		Token char_literal128=null;
		ParserRuleReturnScope lExpr127 =null;

		Object char_literal124_tree=null;
		Object Symbol125_tree=null;
		Object WS126_tree=null;
		Object char_literal128_tree=null;
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_Symbol=new RewriteRuleTokenStream(adaptor,"token Symbol");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_lExpr=new RewriteRuleSubtreeStream(adaptor,"rule lExpr");

		try { dbg.enterRule(getGrammarFileName(), "symbolExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(129, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:130:2: ( '(' Symbol ( WS )* ( lExpr )? ')' -> Symbol ( lExpr )? )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:130:4: '(' Symbol ( WS )* ( lExpr )? ')'
			{
			dbg.location(130,4);
			char_literal124=(Token)match(input,33,FOLLOW_33_in_symbolExpr1202);  
			stream_33.add(char_literal124);
			dbg.location(130,8);
			Symbol125=(Token)match(input,Symbol,FOLLOW_Symbol_in_symbolExpr1204);  
			stream_Symbol.add(Symbol125);
			dbg.location(130,15);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:130:15: ( WS )*
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:130:15: WS
					{
					dbg.location(130,15);
					WS126=(Token)match(input,WS,FOLLOW_WS_in_symbolExpr1206);  
					stream_WS.add(WS126);

					}
					break;

				default :
					break loop47;
				}
			}
			} finally {dbg.exitSubRule(47);}
			dbg.location(130,19);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:130:19: ( lExpr )?
			int alt48=2;
			try { dbg.enterSubRule(48);
			try { dbg.enterDecision(48, decisionCanBacktrack[48]);

			int LA48_0 = input.LA(1);
			if ( (LA48_0==Variable||LA48_0==33||LA48_0==51) ) {
				alt48=1;
			}
			} finally {dbg.exitDecision(48);}

			switch (alt48) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:130:19: lExpr
					{
					dbg.location(130,19);
					pushFollow(FOLLOW_lExpr_in_symbolExpr1209);
					lExpr127=lExpr();
					state._fsp--;

					stream_lExpr.add(lExpr127.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(48);}
			dbg.location(130,26);
			char_literal128=(Token)match(input,34,FOLLOW_34_in_symbolExpr1212);  
			stream_34.add(char_literal128);

			// AST REWRITE
			// elements: Symbol, lExpr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 130:30: -> Symbol ( lExpr )?
			{
				dbg.location(130,33);
				adaptor.addChild(root_0, stream_Symbol.nextNode());dbg.location(130,40);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:130:40: ( lExpr )?
				if ( stream_lExpr.hasNext() ) {
					dbg.location(130,40);
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
		dbg.location(130, 45);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:132:1: expression : exprBase ( WS )* ( '=?' ( WS )* exprBase )? -> ^( EXPR exprBase ( exprBase )? ) ;
	public final while_astParser.expression_return expression() throws RecognitionException {
		while_astParser.expression_return retval = new while_astParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WS130=null;
		Token string_literal131=null;
		Token WS132=null;
		ParserRuleReturnScope exprBase129 =null;
		ParserRuleReturnScope exprBase133 =null;

		Object WS130_tree=null;
		Object string_literal131_tree=null;
		Object WS132_tree=null;
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");

		try { dbg.enterRule(getGrammarFileName(), "expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(132, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:133:5: ( exprBase ( WS )* ( '=?' ( WS )* exprBase )? -> ^( EXPR exprBase ( exprBase )? ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:133:7: exprBase ( WS )* ( '=?' ( WS )* exprBase )?
			{
			dbg.location(133,7);
			pushFollow(FOLLOW_exprBase_in_expression1231);
			exprBase129=exprBase();
			state._fsp--;

			stream_exprBase.add(exprBase129.getTree());dbg.location(133,16);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:133:16: ( WS )*
			try { dbg.enterSubRule(49);

			loop49:
			while (true) {
				int alt49=2;
				try { dbg.enterDecision(49, decisionCanBacktrack[49]);

				int LA49_0 = input.LA(1);
				if ( (LA49_0==WS) ) {
					alt49=1;
				}

				} finally {dbg.exitDecision(49);}

				switch (alt49) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:133:16: WS
					{
					dbg.location(133,16);
					WS130=(Token)match(input,WS,FOLLOW_WS_in_expression1233);  
					stream_WS.add(WS130);

					}
					break;

				default :
					break loop49;
				}
			}
			} finally {dbg.exitSubRule(49);}
			dbg.location(133,19);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:133:19: ( '=?' ( WS )* exprBase )?
			int alt51=2;
			try { dbg.enterSubRule(51);
			try { dbg.enterDecision(51, decisionCanBacktrack[51]);

			int LA51_0 = input.LA(1);
			if ( (LA51_0==39) ) {
				alt51=1;
			}
			} finally {dbg.exitDecision(51);}

			switch (alt51) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:133:20: '=?' ( WS )* exprBase
					{
					dbg.location(133,20);
					string_literal131=(Token)match(input,39,FOLLOW_39_in_expression1236);  
					stream_39.add(string_literal131);
					dbg.location(133,25);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:133:25: ( WS )*
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

							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:133:25: WS
							{
							dbg.location(133,25);
							WS132=(Token)match(input,WS,FOLLOW_WS_in_expression1238);  
							stream_WS.add(WS132);

							}
							break;

						default :
							break loop50;
						}
					}
					} finally {dbg.exitSubRule(50);}
					dbg.location(133,29);
					pushFollow(FOLLOW_exprBase_in_expression1241);
					exprBase133=exprBase();
					state._fsp--;

					stream_exprBase.add(exprBase133.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(51);}

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
			// 133:40: -> ^( EXPR exprBase ( exprBase )? )
			{
				dbg.location(133,43);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:133:43: ^( EXPR exprBase ( exprBase )? )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(133,45);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR, "EXPR"), root_1);
				dbg.location(133,50);
				adaptor.addChild(root_1, stream_exprBase.nextTree());dbg.location(133,59);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:133:59: ( exprBase )?
				if ( stream_exprBase.hasNext() ) {
					dbg.location(133,59);
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
		dbg.location(134, 4);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:137:1: lExpr : exprBase ( WS )* ( lExpr )? -> exprBase ( lExpr )? ;
	public final while_astParser.lExpr_return lExpr() throws RecognitionException {
		while_astParser.lExpr_return retval = new while_astParser.lExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WS135=null;
		ParserRuleReturnScope exprBase134 =null;
		ParserRuleReturnScope lExpr136 =null;

		Object WS135_tree=null;
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");
		RewriteRuleSubtreeStream stream_lExpr=new RewriteRuleSubtreeStream(adaptor,"rule lExpr");

		try { dbg.enterRule(getGrammarFileName(), "lExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(137, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:138:5: ( exprBase ( WS )* ( lExpr )? -> exprBase ( lExpr )? )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:138:7: exprBase ( WS )* ( lExpr )?
			{
			dbg.location(138,7);
			pushFollow(FOLLOW_exprBase_in_lExpr1275);
			exprBase134=exprBase();
			state._fsp--;

			stream_exprBase.add(exprBase134.getTree());dbg.location(138,16);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:138:16: ( WS )*
			try { dbg.enterSubRule(52);

			loop52:
			while (true) {
				int alt52=2;
				try { dbg.enterDecision(52, decisionCanBacktrack[52]);

				int LA52_0 = input.LA(1);
				if ( (LA52_0==WS) ) {
					alt52=1;
				}

				} finally {dbg.exitDecision(52);}

				switch (alt52) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:138:16: WS
					{
					dbg.location(138,16);
					WS135=(Token)match(input,WS,FOLLOW_WS_in_lExpr1277);  
					stream_WS.add(WS135);

					}
					break;

				default :
					break loop52;
				}
			}
			} finally {dbg.exitSubRule(52);}
			dbg.location(138,20);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:138:20: ( lExpr )?
			int alt53=2;
			try { dbg.enterSubRule(53);
			try { dbg.enterDecision(53, decisionCanBacktrack[53]);

			int LA53_0 = input.LA(1);
			if ( (LA53_0==Variable||LA53_0==33||LA53_0==51) ) {
				alt53=1;
			}
			} finally {dbg.exitDecision(53);}

			switch (alt53) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:138:20: lExpr
					{
					dbg.location(138,20);
					pushFollow(FOLLOW_lExpr_in_lExpr1280);
					lExpr136=lExpr();
					state._fsp--;

					stream_lExpr.add(lExpr136.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(53);}

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
			// 138:27: -> exprBase ( lExpr )?
			{
				dbg.location(138,30);
				adaptor.addChild(root_0, stream_exprBase.nextTree());dbg.location(138,39);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:138:39: ( lExpr )?
				if ( stream_lExpr.hasNext() ) {
					dbg.location(138,39);
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
		dbg.location(139, 4);

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


	protected DFA14 dfa14 = new DFA14(this);
	protected DFA37 dfa37 = new DFA37(this);
	static final String DFA14_eotS =
		"\4\uffff";
	static final String DFA14_eofS =
		"\4\uffff";
	static final String DFA14_minS =
		"\2\37\2\uffff";
	static final String DFA14_maxS =
		"\2\65\2\uffff";
	static final String DFA14_acceptS =
		"\2\uffff\1\1\1\2";
	static final String DFA14_specialS =
		"\4\uffff}>";
	static final String[] DFA14_transitionS = {
			"\1\1\1\3\5\uffff\1\2\3\uffff\2\3\11\uffff\1\3",
			"\1\1\1\3\5\uffff\1\2\3\uffff\2\3\11\uffff\1\3",
			"",
			""
	};

	static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
	static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
	static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
	static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
	static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
	static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
	static final short[][] DFA14_transition;

	static {
		int numStates = DFA14_transitionS.length;
		DFA14_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
		}
	}

	protected class DFA14 extends DFA {

		public DFA14(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 14;
			this.eot = DFA14_eot;
			this.eof = DFA14_eof;
			this.min = DFA14_min;
			this.max = DFA14_max;
			this.accept = DFA14_accept;
			this.special = DFA14_special;
			this.transition = DFA14_transition;
		}
		@Override
		public String getDescription() {
			return "70:15: ( ( WS )* ';' ( WS )* commands )?";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	static final String DFA37_eotS =
		"\12\uffff";
	static final String DFA37_eofS =
		"\12\uffff";
	static final String DFA37_minS =
		"\1\35\2\uffff\1\30\1\uffff\1\37\4\uffff";
	static final String DFA37_maxS =
		"\1\63\2\uffff\1\70\1\uffff\1\70\4\uffff";
	static final String DFA37_acceptS =
		"\1\uffff\1\1\1\2\1\uffff\1\7\1\uffff\1\3\1\4\1\5\1\6";
	static final String DFA37_specialS =
		"\12\uffff}>";
	static final String[] DFA37_transitionS = {
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

	static final short[] DFA37_eot = DFA.unpackEncodedString(DFA37_eotS);
	static final short[] DFA37_eof = DFA.unpackEncodedString(DFA37_eofS);
	static final char[] DFA37_min = DFA.unpackEncodedStringToUnsignedChars(DFA37_minS);
	static final char[] DFA37_max = DFA.unpackEncodedStringToUnsignedChars(DFA37_maxS);
	static final short[] DFA37_accept = DFA.unpackEncodedString(DFA37_acceptS);
	static final short[] DFA37_special = DFA.unpackEncodedString(DFA37_specialS);
	static final short[][] DFA37_transition;

	static {
		int numStates = DFA37_transitionS.length;
		DFA37_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA37_transition[i] = DFA.unpackEncodedString(DFA37_transitionS[i]);
		}
	}

	protected class DFA37 extends DFA {

		public DFA37(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 37;
			this.eot = DFA37_eot;
			this.eof = DFA37_eof;
			this.min = DFA37_min;
			this.max = DFA37_max;
			this.accept = DFA37_accept;
			this.special = DFA37_special;
			this.transition = DFA37_transition;
		}
		@Override
		public String getDescription() {
			return "110:1: exprBase : ( nil_ | variable | cons | list | hd | tl | symbolExpr );";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	public static final BitSet FOLLOW_program_in_startProgram319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_in_program344 = new BitSet(new long[]{0x0000400000000002L});
	public static final BitSet FOLLOW_program_in_program346 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_function375 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_Symbol_in_function377 = new BitSet(new long[]{0x0000001080000000L});
	public static final BitSet FOLLOW_WS_in_function379 = new BitSet(new long[]{0x0000001080000000L});
	public static final BitSet FOLLOW_36_in_function382 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_definition_in_function384 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_definition411 = new BitSet(new long[]{0x00000001A0000000L});
	public static final BitSet FOLLOW_WS_in_definition413 = new BitSet(new long[]{0x00000001A0000000L});
	public static final BitSet FOLLOW_input_in_definition416 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_definition418 = new BitSet(new long[]{0x02113000A0000000L});
	public static final BitSet FOLLOW_WS_in_definition420 = new BitSet(new long[]{0x02113000A0000000L});
	public static final BitSet FOLLOW_commands_in_definition423 = new BitSet(new long[]{0x0000000180000000L});
	public static final BitSet FOLLOW_WS_in_definition425 = new BitSet(new long[]{0x0000000180000000L});
	public static final BitSet FOLLOW_32_in_definition427 = new BitSet(new long[]{0x0400000080000000L});
	public static final BitSet FOLLOW_WS_in_definition429 = new BitSet(new long[]{0x0400000080000000L});
	public static final BitSet FOLLOW_58_in_definition432 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_output_in_definition434 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inputSub_in_input463 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_inputSub491 = new BitSet(new long[]{0x0000000880000002L});
	public static final BitSet FOLLOW_WS_in_inputSub493 = new BitSet(new long[]{0x0000000880000002L});
	public static final BitSet FOLLOW_35_in_inputSub497 = new BitSet(new long[]{0x00000000A0000000L});
	public static final BitSet FOLLOW_WS_in_inputSub499 = new BitSet(new long[]{0x00000000A0000000L});
	public static final BitSet FOLLOW_inputSub_in_inputSub502 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_output528 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_35_in_output531 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_output_in_output533 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_in_commands563 = new BitSet(new long[]{0x0000004080000002L});
	public static final BitSet FOLLOW_WS_in_commands567 = new BitSet(new long[]{0x0000004080000000L});
	public static final BitSet FOLLOW_38_in_commands570 = new BitSet(new long[]{0x02113000A0000000L});
	public static final BitSet FOLLOW_WS_in_commands572 = new BitSet(new long[]{0x02113000A0000000L});
	public static final BitSet FOLLOW_commands_in_commands575 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_command602 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decl_in_command606 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if__in_command610 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_for__in_command614 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_while__in_command618 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foreach__in_command622 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vars_in_decl636 = new BitSet(new long[]{0x0000002080000000L});
	public static final BitSet FOLLOW_WS_in_decl638 = new BitSet(new long[]{0x0000002080000000L});
	public static final BitSet FOLLOW_37_in_decl641 = new BitSet(new long[]{0x00080002A0000000L});
	public static final BitSet FOLLOW_WS_in_decl643 = new BitSet(new long[]{0x00080002A0000000L});
	public static final BitSet FOLLOW_exprs_in_decl646 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_if_675 = new BitSet(new long[]{0x00080002A0000000L});
	public static final BitSet FOLLOW_WS_in_if_677 = new BitSet(new long[]{0x00080002A0000000L});
	public static final BitSet FOLLOW_expression_in_if_680 = new BitSet(new long[]{0x0080000080000000L});
	public static final BitSet FOLLOW_WS_in_if_682 = new BitSet(new long[]{0x0080000080000000L});
	public static final BitSet FOLLOW_then__in_if_685 = new BitSet(new long[]{0x00000C0080000000L});
	public static final BitSet FOLLOW_WS_in_if_688 = new BitSet(new long[]{0x00000C0080000000L});
	public static final BitSet FOLLOW_else__in_if_691 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_if_693 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_then_724 = new BitSet(new long[]{0x02113000A0000000L});
	public static final BitSet FOLLOW_WS_in_then_726 = new BitSet(new long[]{0x02113000A0000000L});
	public static final BitSet FOLLOW_commands_in_then_729 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_WS_in_then_731 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_42_in_else_749 = new BitSet(new long[]{0x02113000A0000000L});
	public static final BitSet FOLLOW_WS_in_else_751 = new BitSet(new long[]{0x02113000A0000000L});
	public static final BitSet FOLLOW_commands_in_else_754 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_while_777 = new BitSet(new long[]{0x00080002A0000000L});
	public static final BitSet FOLLOW_WS_in_while_779 = new BitSet(new long[]{0x00080002A0000000L});
	public static final BitSet FOLLOW_expression_in_while_782 = new BitSet(new long[]{0x0000020080000000L});
	public static final BitSet FOLLOW_WS_in_while_784 = new BitSet(new long[]{0x0000020080000000L});
	public static final BitSet FOLLOW_do__in_while_787 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_do_816 = new BitSet(new long[]{0x02113000A0000000L});
	public static final BitSet FOLLOW_WS_in_do_818 = new BitSet(new long[]{0x02113000A0000000L});
	public static final BitSet FOLLOW_commands_in_do_821 = new BitSet(new long[]{0x0020000080000000L});
	public static final BitSet FOLLOW_WS_in_do_823 = new BitSet(new long[]{0x0020000080000000L});
	public static final BitSet FOLLOW_53_in_do_826 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_for_847 = new BitSet(new long[]{0x00080002A0000000L});
	public static final BitSet FOLLOW_WS_in_for_849 = new BitSet(new long[]{0x00080002A0000000L});
	public static final BitSet FOLLOW_expression_in_for_852 = new BitSet(new long[]{0x0000020080000000L});
	public static final BitSet FOLLOW_WS_in_for_854 = new BitSet(new long[]{0x0000020080000000L});
	public static final BitSet FOLLOW_do__in_for_857 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_foreach_886 = new BitSet(new long[]{0x00000000A0000000L});
	public static final BitSet FOLLOW_WS_in_foreach_888 = new BitSet(new long[]{0x00000000A0000000L});
	public static final BitSet FOLLOW_Variable_in_foreach_891 = new BitSet(new long[]{0x0002000080000000L});
	public static final BitSet FOLLOW_WS_in_foreach_893 = new BitSet(new long[]{0x0002000080000000L});
	public static final BitSet FOLLOW_49_in_foreach_896 = new BitSet(new long[]{0x00080002A0000000L});
	public static final BitSet FOLLOW_WS_in_foreach_898 = new BitSet(new long[]{0x00080002A0000000L});
	public static final BitSet FOLLOW_expression_in_foreach_901 = new BitSet(new long[]{0x0000020080000000L});
	public static final BitSet FOLLOW_WS_in_foreach_903 = new BitSet(new long[]{0x0000020080000000L});
	public static final BitSet FOLLOW_do__in_foreach_906 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_vars940 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_35_in_vars943 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_vars_in_vars945 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_exprs975 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_35_in_exprs978 = new BitSet(new long[]{0x0008000220000000L});
	public static final BitSet FOLLOW_exprs_in_exprs980 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nil__in_exprBase1005 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_exprBase1013 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cons_in_exprBase1021 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_list_in_exprBase1025 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_hd_in_exprBase1033 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tl_in_exprBase1037 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_symbolExpr_in_exprBase1045 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_nil_1064 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_WS_in_nil_1065 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_Variable_in_variable1082 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_cons1094 = new BitSet(new long[]{0x0000010080000000L});
	public static final BitSet FOLLOW_WS_in_cons1096 = new BitSet(new long[]{0x0000010080000000L});
	public static final BitSet FOLLOW_40_in_cons1099 = new BitSet(new long[]{0x0008000220000000L});
	public static final BitSet FOLLOW_lExpr_in_cons1101 = new BitSet(new long[]{0x0000000480000000L});
	public static final BitSet FOLLOW_WS_in_cons1103 = new BitSet(new long[]{0x0000000480000000L});
	public static final BitSet FOLLOW_34_in_cons1106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_list1122 = new BitSet(new long[]{0x0004000080000000L});
	public static final BitSet FOLLOW_WS_in_list1123 = new BitSet(new long[]{0x0004000080000000L});
	public static final BitSet FOLLOW_50_in_list1126 = new BitSet(new long[]{0x0008000220000000L});
	public static final BitSet FOLLOW_lExpr_in_list1128 = new BitSet(new long[]{0x0000000480000000L});
	public static final BitSet FOLLOW_WS_in_list1130 = new BitSet(new long[]{0x0000000480000000L});
	public static final BitSet FOLLOW_34_in_list1133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_hd1149 = new BitSet(new long[]{0x0000800080000000L});
	public static final BitSet FOLLOW_WS_in_hd1150 = new BitSet(new long[]{0x0000800080000000L});
	public static final BitSet FOLLOW_47_in_hd1153 = new BitSet(new long[]{0x0008000220000000L});
	public static final BitSet FOLLOW_exprBase_in_hd1155 = new BitSet(new long[]{0x0000000480000000L});
	public static final BitSet FOLLOW_WS_in_hd1157 = new BitSet(new long[]{0x0000000480000000L});
	public static final BitSet FOLLOW_34_in_hd1159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_tl1175 = new BitSet(new long[]{0x0100000080000000L});
	public static final BitSet FOLLOW_WS_in_tl1177 = new BitSet(new long[]{0x0100000080000000L});
	public static final BitSet FOLLOW_56_in_tl1179 = new BitSet(new long[]{0x0008000220000000L});
	public static final BitSet FOLLOW_exprBase_in_tl1181 = new BitSet(new long[]{0x0000000480000000L});
	public static final BitSet FOLLOW_WS_in_tl1183 = new BitSet(new long[]{0x0000000480000000L});
	public static final BitSet FOLLOW_34_in_tl1185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_symbolExpr1202 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_Symbol_in_symbolExpr1204 = new BitSet(new long[]{0x00080006A0000000L});
	public static final BitSet FOLLOW_WS_in_symbolExpr1206 = new BitSet(new long[]{0x00080006A0000000L});
	public static final BitSet FOLLOW_lExpr_in_symbolExpr1209 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_symbolExpr1212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprBase_in_expression1231 = new BitSet(new long[]{0x0000008080000002L});
	public static final BitSet FOLLOW_WS_in_expression1233 = new BitSet(new long[]{0x0000008080000002L});
	public static final BitSet FOLLOW_39_in_expression1236 = new BitSet(new long[]{0x00080002A0000000L});
	public static final BitSet FOLLOW_WS_in_expression1238 = new BitSet(new long[]{0x00080002A0000000L});
	public static final BitSet FOLLOW_exprBase_in_expression1241 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprBase_in_lExpr1275 = new BitSet(new long[]{0x00080002A0000002L});
	public static final BitSet FOLLOW_WS_in_lExpr1277 = new BitSet(new long[]{0x00080002A0000002L});
	public static final BitSet FOLLOW_lExpr_in_lExpr1280 = new BitSet(new long[]{0x0000000000000002L});
}

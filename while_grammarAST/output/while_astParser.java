<<<<<<< Updated upstream
// $ANTLR 3.5.1 C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g 2023-11-19 22:06:27
=======
// $ANTLR 3.5.1 C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g 2023-12-21 10:49:59
>>>>>>> Stashed changes

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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "DEF", "Dec", "EXPR", "EXPRBASE", 
		"FOR", "FOREACH", "FUNCDEF", "IF", "IN", "Maj", "Min", "Symbol", "VARDEF", 
		"VARIABLES", "Variable", "WHILE", "WS", "'%'", "'('", "')'", "','", "':'", 
		"':='", "';'", "'=?'", "'cons '", "'do'", "'else'", "'fi'", "'for'", "'foreach'", 
		"'function '", "'hd '", "'if'", "'in'", "'list '", "'nil'", "'nop'", "'od'", 
		"'read'", "'then'", "'tl '", "'while'", "'write '"
	};
	public static final int EOF=-1;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
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
	public static final int DEF=4;
	public static final int Dec=5;
	public static final int EXPR=6;
	public static final int EXPRBASE=7;
	public static final int FOR=8;
	public static final int FOREACH=9;
	public static final int FUNCDEF=10;
	public static final int IF=11;
	public static final int IN=12;
	public static final int Maj=13;
	public static final int Min=14;
	public static final int Symbol=15;
	public static final int VARDEF=16;
	public static final int VARIABLES=17;
	public static final int Variable=18;
	public static final int WHILE=19;
	public static final int WS=20;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "input", "foreach_", "commands", "for_", "decl", "startProgram", 
		"vars", "command", "expression", "exprBase", "function", "definition", 
		"while_", "exprs", "output", "if_", "program", "lExpr", "inputSub"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
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


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:30:1: program : function ( program )? ;
	public final while_astParser.program_return program() throws RecognitionException {
		while_astParser.program_return retval = new while_astParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope function1 =null;
		ParserRuleReturnScope program2 =null;


		try { dbg.enterRule(getGrammarFileName(), "program");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(30, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:31:5: ( function ( program )? )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:31:7: function ( program )?
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(31,7);
			pushFollow(FOLLOW_function_in_program242);
			function1=function();
			state._fsp--;

			adaptor.addChild(root_0, function1.getTree());
			dbg.location(31,16);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:31:16: ( program )?
			int alt1=2;
			try { dbg.enterSubRule(1);
			try { dbg.enterDecision(1, decisionCanBacktrack[1]);

			int LA1_0 = input.LA(1);
			if ( (LA1_0==35) ) {
				alt1=1;
			}
			} finally {dbg.exitDecision(1);}

			switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:31:16: program
					{
					dbg.location(31,16);
					pushFollow(FOLLOW_program_in_program244);
					program2=program();
					state._fsp--;

					adaptor.addChild(root_0, program2.getTree());

					}
					break;

			}
			} finally {dbg.exitSubRule(1);}

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
		dbg.location(32, 4);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:34:1: function : 'function ' Symbol ( WS )? ':' definition -> ^( FUNCDEF Symbol definition ) ;
	public final while_astParser.function_return function() throws RecognitionException {
		while_astParser.function_return retval = new while_astParser.function_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal3=null;
		Token Symbol4=null;
		Token WS5=null;
		Token char_literal6=null;
		ParserRuleReturnScope definition7 =null;

		Object string_literal3_tree=null;
		Object Symbol4_tree=null;
		Object WS5_tree=null;
		Object char_literal6_tree=null;
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
		RewriteRuleTokenStream stream_Symbol=new RewriteRuleTokenStream(adaptor,"token Symbol");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"rule definition");

		try { dbg.enterRule(getGrammarFileName(), "function");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(34, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:35:5: ( 'function ' Symbol ( WS )? ':' definition -> ^( FUNCDEF Symbol definition ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:35:7: 'function ' Symbol ( WS )? ':' definition
			{
			dbg.location(35,7);
			string_literal3=(Token)match(input,35,FOLLOW_35_in_function262);  
			stream_35.add(string_literal3);
			dbg.location(35,19);
			Symbol4=(Token)match(input,Symbol,FOLLOW_Symbol_in_function264);  
			stream_Symbol.add(Symbol4);
			dbg.location(35,26);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:35:26: ( WS )?
			int alt2=2;
			try { dbg.enterSubRule(2);
			try { dbg.enterDecision(2, decisionCanBacktrack[2]);

			int LA2_0 = input.LA(1);
			if ( (LA2_0==WS) ) {
				alt2=1;
			}
			} finally {dbg.exitDecision(2);}

			switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:35:26: WS
					{
					dbg.location(35,26);
					WS5=(Token)match(input,WS,FOLLOW_WS_in_function266);  
					stream_WS.add(WS5);

					}
					break;

			}
			} finally {dbg.exitSubRule(2);}
			dbg.location(35,30);
			char_literal6=(Token)match(input,25,FOLLOW_25_in_function269);  
			stream_25.add(char_literal6);
			dbg.location(35,34);
			pushFollow(FOLLOW_definition_in_function271);
			definition7=definition();
			state._fsp--;

			stream_definition.add(definition7.getTree());
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
			// 35:45: -> ^( FUNCDEF Symbol definition )
			{
				dbg.location(35,48);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:35:48: ^( FUNCDEF Symbol definition )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(35,50);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCDEF, "FUNCDEF"), root_1);
				dbg.location(35,58);
				adaptor.addChild(root_1, stream_Symbol.nextNode());dbg.location(35,65);
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
		dbg.location(36, 4);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:38:1: definition : 'read' ( WS )? input '%' commands '%' 'write ' output -> ^( DEF input commands output ) ;
	public final while_astParser.definition_return definition() throws RecognitionException {
		while_astParser.definition_return retval = new while_astParser.definition_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal8=null;
		Token WS9=null;
		Token char_literal11=null;
		Token char_literal13=null;
		Token string_literal14=null;
		ParserRuleReturnScope input10 =null;
		ParserRuleReturnScope commands12 =null;
		ParserRuleReturnScope output15 =null;

		Object string_literal8_tree=null;
		Object WS9_tree=null;
		Object char_literal11_tree=null;
		Object char_literal13_tree=null;
		Object string_literal14_tree=null;
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleTokenStream stream_21=new RewriteRuleTokenStream(adaptor,"token 21");
		RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");
		RewriteRuleSubtreeStream stream_input=new RewriteRuleSubtreeStream(adaptor,"rule input");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try { dbg.enterRule(getGrammarFileName(), "definition");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(38, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:39:5: ( 'read' ( WS )? input '%' commands '%' 'write ' output -> ^( DEF input commands output ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:39:7: 'read' ( WS )? input '%' commands '%' 'write ' output
			{
			dbg.location(39,7);
			string_literal8=(Token)match(input,43,FOLLOW_43_in_definition298);  
			stream_43.add(string_literal8);
			dbg.location(39,14);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:39:14: ( WS )?
			int alt3=2;
			try { dbg.enterSubRule(3);
			try { dbg.enterDecision(3, decisionCanBacktrack[3]);

			int LA3_0 = input.LA(1);
			if ( (LA3_0==WS) ) {
				alt3=1;
			}
			} finally {dbg.exitDecision(3);}

			switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:39:14: WS
					{
					dbg.location(39,14);
					WS9=(Token)match(input,WS,FOLLOW_WS_in_definition300);  
					stream_WS.add(WS9);

					}
					break;

			}
			} finally {dbg.exitSubRule(3);}
			dbg.location(39,18);
			pushFollow(FOLLOW_input_in_definition303);
			input10=input();
			state._fsp--;

			stream_input.add(input10.getTree());dbg.location(39,24);
			char_literal11=(Token)match(input,21,FOLLOW_21_in_definition305);  
			stream_21.add(char_literal11);
			dbg.location(39,28);
			pushFollow(FOLLOW_commands_in_definition307);
			commands12=commands();
			state._fsp--;

			stream_commands.add(commands12.getTree());dbg.location(39,37);
			char_literal13=(Token)match(input,21,FOLLOW_21_in_definition309);  
			stream_21.add(char_literal13);
			dbg.location(39,41);
			string_literal14=(Token)match(input,47,FOLLOW_47_in_definition311);  
			stream_47.add(string_literal14);
			dbg.location(39,50);
			pushFollow(FOLLOW_output_in_definition313);
			output15=output();
			state._fsp--;

			stream_output.add(output15.getTree());
			// AST REWRITE
			// elements: output, input, commands
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 39:57: -> ^( DEF input commands output )
			{
				dbg.location(39,60);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:39:60: ^( DEF input commands output )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(39,62);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DEF, "DEF"), root_1);
				dbg.location(39,66);
				adaptor.addChild(root_1, stream_input.nextTree());dbg.location(39,72);
				adaptor.addChild(root_1, stream_commands.nextTree());dbg.location(39,81);
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
		dbg.location(40, 4);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:42:1: input : ( inputSub )? ;
	public final while_astParser.input_return input() throws RecognitionException {
		while_astParser.input_return retval = new while_astParser.input_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope inputSub16 =null;


		try { dbg.enterRule(getGrammarFileName(), "input");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(42, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:43:5: ( ( inputSub )? )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:43:7: ( inputSub )?
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(43,7);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:43:7: ( inputSub )?
			int alt4=2;
			try { dbg.enterSubRule(4);
			try { dbg.enterDecision(4, decisionCanBacktrack[4]);

			int LA4_0 = input.LA(1);
			if ( (LA4_0==Variable) ) {
				alt4=1;
			}
			} finally {dbg.exitDecision(4);}

			switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:43:7: inputSub
					{
					dbg.location(43,7);
					pushFollow(FOLLOW_inputSub_in_input342);
					inputSub16=inputSub();
					state._fsp--;

					adaptor.addChild(root_0, inputSub16.getTree());

					}
					break;

			}
			} finally {dbg.exitSubRule(4);}

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
		dbg.location(44, 4);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:46:1: inputSub : Variable ( WS )? ( ',' ( WS )? inputSub )? ;
	public final while_astParser.inputSub_return inputSub() throws RecognitionException {
		while_astParser.inputSub_return retval = new while_astParser.inputSub_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Variable17=null;
		Token WS18=null;
		Token char_literal19=null;
		Token WS20=null;
		ParserRuleReturnScope inputSub21 =null;

		Object Variable17_tree=null;
		Object WS18_tree=null;
		Object char_literal19_tree=null;
		Object WS20_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "inputSub");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(46, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:47:5: ( Variable ( WS )? ( ',' ( WS )? inputSub )? )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:47:7: Variable ( WS )? ( ',' ( WS )? inputSub )?
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(47,7);
			Variable17=(Token)match(input,Variable,FOLLOW_Variable_in_inputSub360); 
			Variable17_tree = (Object)adaptor.create(Variable17);
			adaptor.addChild(root_0, Variable17_tree);
			dbg.location(47,16);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:47:16: ( WS )?
			int alt5=2;
			try { dbg.enterSubRule(5);
			try { dbg.enterDecision(5, decisionCanBacktrack[5]);

			int LA5_0 = input.LA(1);
			if ( (LA5_0==WS) ) {
				alt5=1;
			}
			} finally {dbg.exitDecision(5);}

			switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:47:16: WS
					{
					dbg.location(47,16);
					WS18=(Token)match(input,WS,FOLLOW_WS_in_inputSub362); 
					WS18_tree = (Object)adaptor.create(WS18);
					adaptor.addChild(root_0, WS18_tree);

					}
					break;

			}
			} finally {dbg.exitSubRule(5);}
			dbg.location(47,20);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:47:20: ( ',' ( WS )? inputSub )?
			int alt7=2;
			try { dbg.enterSubRule(7);
			try { dbg.enterDecision(7, decisionCanBacktrack[7]);

			int LA7_0 = input.LA(1);
			if ( (LA7_0==24) ) {
				alt7=1;
			}
			} finally {dbg.exitDecision(7);}

			switch (alt7) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:47:21: ',' ( WS )? inputSub
					{
					dbg.location(47,21);
					char_literal19=(Token)match(input,24,FOLLOW_24_in_inputSub366); 
					char_literal19_tree = (Object)adaptor.create(char_literal19);
					adaptor.addChild(root_0, char_literal19_tree);
					dbg.location(47,25);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:47:25: ( WS )?
					int alt6=2;
					try { dbg.enterSubRule(6);
					try { dbg.enterDecision(6, decisionCanBacktrack[6]);

					int LA6_0 = input.LA(1);
					if ( (LA6_0==WS) ) {
						alt6=1;
					}
					} finally {dbg.exitDecision(6);}

					switch (alt6) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:47:25: WS
							{
							dbg.location(47,25);
							WS20=(Token)match(input,WS,FOLLOW_WS_in_inputSub368); 
							WS20_tree = (Object)adaptor.create(WS20);
							adaptor.addChild(root_0, WS20_tree);

							}
							break;

					}
					} finally {dbg.exitSubRule(6);}
					dbg.location(47,29);
					pushFollow(FOLLOW_inputSub_in_inputSub371);
					inputSub21=inputSub();
					state._fsp--;

					adaptor.addChild(root_0, inputSub21.getTree());

					}
					break;

			}
			} finally {dbg.exitSubRule(7);}

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:50:1: output : Variable ( ',' output )? ;
	public final while_astParser.output_return output() throws RecognitionException {
		while_astParser.output_return retval = new while_astParser.output_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Variable22=null;
		Token char_literal23=null;
		ParserRuleReturnScope output24 =null;

		Object Variable22_tree=null;
		Object char_literal23_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "output");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(50, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:51:5: ( Variable ( ',' output )? )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:51:7: Variable ( ',' output )?
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(51,7);
			Variable22=(Token)match(input,Variable,FOLLOW_Variable_in_output390); 
			Variable22_tree = (Object)adaptor.create(Variable22);
			adaptor.addChild(root_0, Variable22_tree);
			dbg.location(51,16);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:51:16: ( ',' output )?
			int alt8=2;
			try { dbg.enterSubRule(8);
			try { dbg.enterDecision(8, decisionCanBacktrack[8]);

			int LA8_0 = input.LA(1);
			if ( (LA8_0==24) ) {
				alt8=1;
			}
			} finally {dbg.exitDecision(8);}

			switch (alt8) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:51:17: ',' output
					{
					dbg.location(51,17);
					char_literal23=(Token)match(input,24,FOLLOW_24_in_output393); 
					char_literal23_tree = (Object)adaptor.create(char_literal23);
					adaptor.addChild(root_0, char_literal23_tree);
					dbg.location(51,21);
					pushFollow(FOLLOW_output_in_output395);
					output24=output();
					state._fsp--;

					adaptor.addChild(root_0, output24.getTree());

					}
					break;

			}
			} finally {dbg.exitSubRule(8);}

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:54:1: commands : command ( ';' commands )? ;
	public final while_astParser.commands_return commands() throws RecognitionException {
		while_astParser.commands_return retval = new while_astParser.commands_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal26=null;
		ParserRuleReturnScope command25 =null;
		ParserRuleReturnScope commands27 =null;

		Object char_literal26_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "commands");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(54, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:55:5: ( command ( ';' commands )? )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:55:7: command ( ';' commands )?
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(55,7);
			pushFollow(FOLLOW_command_in_commands414);
			command25=command();
			state._fsp--;

			adaptor.addChild(root_0, command25.getTree());
			dbg.location(55,15);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:55:15: ( ';' commands )?
			int alt9=2;
			try { dbg.enterSubRule(9);
			try { dbg.enterDecision(9, decisionCanBacktrack[9]);

			int LA9_0 = input.LA(1);
			if ( (LA9_0==27) ) {
				alt9=1;
			}
			} finally {dbg.exitDecision(9);}

			switch (alt9) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:55:16: ';' commands
					{
					dbg.location(55,16);
					char_literal26=(Token)match(input,27,FOLLOW_27_in_commands417); 
					char_literal26_tree = (Object)adaptor.create(char_literal26);
					adaptor.addChild(root_0, char_literal26_tree);
					dbg.location(55,20);
					pushFollow(FOLLOW_commands_in_commands419);
					commands27=commands();
					state._fsp--;

					adaptor.addChild(root_0, commands27.getTree());

					}
					break;

			}
			} finally {dbg.exitSubRule(9);}

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:58:1: command : ( 'nop' | decl | if_ | while_ | foreach_ );
	public final while_astParser.command_return command() throws RecognitionException {
		while_astParser.command_return retval = new while_astParser.command_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal28=null;
		ParserRuleReturnScope decl29 =null;
		ParserRuleReturnScope if_30 =null;
		ParserRuleReturnScope while_31 =null;
		ParserRuleReturnScope foreach_32 =null;

		Object string_literal28_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "command");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(58, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:59:5: ( 'nop' | decl | if_ | while_ | foreach_ )
			int alt10=5;
			try { dbg.enterDecision(10, decisionCanBacktrack[10]);

			switch ( input.LA(1) ) {
			case 41:
				{
				alt10=1;
				}
				break;
			case Variable:
				{
				alt10=2;
				}
				break;
			case 37:
				{
				alt10=3;
				}
				break;
			case 46:
				{
				alt10=4;
				}
				break;
			case 34:
				{
				alt10=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(10);}

			switch (alt10) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:59:7: 'nop'
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(59,7);
					string_literal28=(Token)match(input,41,FOLLOW_41_in_command438); 
					string_literal28_tree = (Object)adaptor.create(string_literal28);
					adaptor.addChild(root_0, string_literal28_tree);

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:59:15: decl
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(59,15);
					pushFollow(FOLLOW_decl_in_command442);
					decl29=decl();
					state._fsp--;

					adaptor.addChild(root_0, decl29.getTree());

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:59:22: if_
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(59,22);
					pushFollow(FOLLOW_if__in_command446);
					if_30=if_();
					state._fsp--;

					adaptor.addChild(root_0, if_30.getTree());

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:59:28: while_
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(59,28);
					pushFollow(FOLLOW_while__in_command450);
					while_31=while_();
					state._fsp--;

					adaptor.addChild(root_0, while_31.getTree());

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:59:37: foreach_
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(59,37);
					pushFollow(FOLLOW_foreach__in_command454);
					foreach_32=foreach_();
					state._fsp--;

					adaptor.addChild(root_0, foreach_32.getTree());

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
		dbg.location(60, 4);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:62:1: decl : ( vars ( WS )? ':=' ( WS )? exprs ) -> ^( VARDEF vars exprs ) ;
	public final while_astParser.decl_return decl() throws RecognitionException {
		while_astParser.decl_return retval = new while_astParser.decl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WS34=null;
		Token string_literal35=null;
		Token WS36=null;
		ParserRuleReturnScope vars33 =null;
		ParserRuleReturnScope exprs37 =null;

		Object WS34_tree=null;
		Object string_literal35_tree=null;
		Object WS36_tree=null;
		RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");
		RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");

		try { dbg.enterRule(getGrammarFileName(), "decl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(62, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:63:5: ( ( vars ( WS )? ':=' ( WS )? exprs ) -> ^( VARDEF vars exprs ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:63:7: ( vars ( WS )? ':=' ( WS )? exprs )
			{
			dbg.location(63,7);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:63:7: ( vars ( WS )? ':=' ( WS )? exprs )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:63:8: vars ( WS )? ':=' ( WS )? exprs
			{
			dbg.location(63,8);
			pushFollow(FOLLOW_vars_in_decl472);
			vars33=vars();
			state._fsp--;

			stream_vars.add(vars33.getTree());dbg.location(63,13);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:63:13: ( WS )?
			int alt11=2;
			try { dbg.enterSubRule(11);
			try { dbg.enterDecision(11, decisionCanBacktrack[11]);

			int LA11_0 = input.LA(1);
			if ( (LA11_0==WS) ) {
				alt11=1;
			}
			} finally {dbg.exitDecision(11);}

			switch (alt11) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:63:13: WS
					{
					dbg.location(63,13);
					WS34=(Token)match(input,WS,FOLLOW_WS_in_decl474);  
					stream_WS.add(WS34);

					}
					break;

			}
			} finally {dbg.exitSubRule(11);}
			dbg.location(63,17);
			string_literal35=(Token)match(input,26,FOLLOW_26_in_decl477);  
			stream_26.add(string_literal35);
			dbg.location(63,22);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:63:22: ( WS )?
			int alt12=2;
			try { dbg.enterSubRule(12);
			try { dbg.enterDecision(12, decisionCanBacktrack[12]);

			int LA12_0 = input.LA(1);
			if ( (LA12_0==WS) ) {
				alt12=1;
			}
			} finally {dbg.exitDecision(12);}

			switch (alt12) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:63:22: WS
					{
					dbg.location(63,22);
					WS36=(Token)match(input,WS,FOLLOW_WS_in_decl479);  
					stream_WS.add(WS36);

					}
					break;

			}
			} finally {dbg.exitSubRule(12);}
			dbg.location(63,26);
			pushFollow(FOLLOW_exprs_in_decl482);
			exprs37=exprs();
			state._fsp--;

			stream_exprs.add(exprs37.getTree());
			}

			// AST REWRITE
			// elements: exprs, vars
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 63:33: -> ^( VARDEF vars exprs )
			{
				dbg.location(63,36);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:63:36: ^( VARDEF vars exprs )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(63,38);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARDEF, "VARDEF"), root_1);
				dbg.location(63,45);
				adaptor.addChild(root_1, stream_vars.nextTree());dbg.location(63,50);
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
		dbg.location(64, 4);

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
<<<<<<< Updated upstream
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:66:1: if_ : ( 'if' ( WS )? expression ( WS )? 'then' ( WS )? commands ( WS )? ( 'else' ( WS )? commands )? ( WS )? 'fi' ) -> ^( IF expression commands ) ;
=======
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:81:1: if_ : ( 'if' ( WS )* expression ( WS )* then_ ( WS )* else_ ( WS )* 'fi' ) -> ^( IF expression then_ ( else_ )? END ) ;
>>>>>>> Stashed changes
	public final while_astParser.if__return if_() throws RecognitionException {
		while_astParser.if__return retval = new while_astParser.if__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal38=null;
		Token WS39=null;
		Token WS41=null;
		Token string_literal42=null;
		Token WS43=null;
		Token WS45=null;
		Token string_literal46=null;
		Token WS47=null;
		Token WS49=null;
<<<<<<< Updated upstream
		Token string_literal50=null;
		ParserRuleReturnScope expression40 =null;
		ParserRuleReturnScope commands44 =null;
		ParserRuleReturnScope commands48 =null;
=======
		Token WS51=null;
		Token WS53=null;
		Token string_literal54=null;
		ParserRuleReturnScope expression48 =null;
		ParserRuleReturnScope then_50 =null;
		ParserRuleReturnScope else_52 =null;
>>>>>>> Stashed changes

		Object string_literal38_tree=null;
		Object WS39_tree=null;
		Object WS41_tree=null;
		Object string_literal42_tree=null;
		Object WS43_tree=null;
		Object WS45_tree=null;
		Object string_literal46_tree=null;
		Object WS47_tree=null;
		Object WS49_tree=null;
<<<<<<< Updated upstream
		Object string_literal50_tree=null;
=======
		Object WS51_tree=null;
		Object WS53_tree=null;
		Object string_literal54_tree=null;
>>>>>>> Stashed changes
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
		RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try { dbg.enterRule(getGrammarFileName(), "if_");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(66, 0);

		try {
<<<<<<< Updated upstream
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:67:5: ( ( 'if' ( WS )? expression ( WS )? 'then' ( WS )? commands ( WS )? ( 'else' ( WS )? commands )? ( WS )? 'fi' ) -> ^( IF expression commands ) )
			dbg.enterAlt(1);
=======
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:82:5: ( ( 'if' ( WS )* expression ( WS )* then_ ( WS )* else_ ( WS )* 'fi' ) -> ^( IF expression then_ ( else_ )? END ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:82:7: ( 'if' ( WS )* expression ( WS )* then_ ( WS )* else_ ( WS )* 'fi' )
			{
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:82:7: ( 'if' ( WS )* expression ( WS )* then_ ( WS )* else_ ( WS )* 'fi' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:82:8: 'if' ( WS )* expression ( WS )* then_ ( WS )* else_ ( WS )* 'fi'
			{
			string_literal46=(Token)match(input,49,FOLLOW_49_in_if_691);  
			stream_49.add(string_literal46);
>>>>>>> Stashed changes

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:67:7: ( 'if' ( WS )? expression ( WS )? 'then' ( WS )? commands ( WS )? ( 'else' ( WS )? commands )? ( WS )? 'fi' )
			{
			dbg.location(67,7);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:67:7: ( 'if' ( WS )? expression ( WS )? 'then' ( WS )? commands ( WS )? ( 'else' ( WS )? commands )? ( WS )? 'fi' )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:67:8: 'if' ( WS )? expression ( WS )? 'then' ( WS )? commands ( WS )? ( 'else' ( WS )? commands )? ( WS )? 'fi'
			{
			dbg.location(67,8);
			string_literal38=(Token)match(input,37,FOLLOW_37_in_if_511);  
			stream_37.add(string_literal38);
			dbg.location(67,13);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:67:13: ( WS )?
			int alt13=2;
			try { dbg.enterSubRule(13);
			try { dbg.enterDecision(13, decisionCanBacktrack[13]);

			int LA13_0 = input.LA(1);
			if ( (LA13_0==WS) ) {
				alt13=1;
			}
			} finally {dbg.exitDecision(13);}

			switch (alt13) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:67:13: WS
					{
					dbg.location(67,13);
					WS39=(Token)match(input,WS,FOLLOW_WS_in_if_513);  
					stream_WS.add(WS39);

					}
					break;

			}
			} finally {dbg.exitSubRule(13);}
			dbg.location(67,17);
			pushFollow(FOLLOW_expression_in_if_516);
			expression40=expression();
			state._fsp--;

			stream_expression.add(expression40.getTree());dbg.location(67,28);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:67:28: ( WS )?
			int alt14=2;
			try { dbg.enterSubRule(14);
			try { dbg.enterDecision(14, decisionCanBacktrack[14]);

			int LA14_0 = input.LA(1);
			if ( (LA14_0==WS) ) {
				alt14=1;
			}
			} finally {dbg.exitDecision(14);}

			switch (alt14) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:67:28: WS
					{
					dbg.location(67,28);
					WS41=(Token)match(input,WS,FOLLOW_WS_in_if_518);  
					stream_WS.add(WS41);

					}
					break;

			}
			} finally {dbg.exitSubRule(14);}
			dbg.location(67,32);
			string_literal42=(Token)match(input,44,FOLLOW_44_in_if_521);  
			stream_44.add(string_literal42);
			dbg.location(67,39);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:67:39: ( WS )?
			int alt15=2;
			try { dbg.enterSubRule(15);
			try { dbg.enterDecision(15, decisionCanBacktrack[15]);

			int LA15_0 = input.LA(1);
			if ( (LA15_0==WS) ) {
				alt15=1;
			}
			} finally {dbg.exitDecision(15);}

			switch (alt15) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:67:39: WS
					{
					dbg.location(67,39);
					WS43=(Token)match(input,WS,FOLLOW_WS_in_if_523);  
					stream_WS.add(WS43);

					}
					break;

			}
			} finally {dbg.exitSubRule(15);}
			dbg.location(67,43);
			pushFollow(FOLLOW_commands_in_if_526);
			commands44=commands();
			state._fsp--;

			stream_commands.add(commands44.getTree());dbg.location(67,52);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:67:52: ( WS )?
			int alt16=2;
			try { dbg.enterSubRule(16);
			try { dbg.enterDecision(16, decisionCanBacktrack[16]);

			int LA16_0 = input.LA(1);
			if ( (LA16_0==WS) ) {
				alt16=1;
			}
			} finally {dbg.exitDecision(16);}

			switch (alt16) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:67:52: WS
					{
					dbg.location(67,52);
					WS45=(Token)match(input,WS,FOLLOW_WS_in_if_528);  
					stream_WS.add(WS45);

					}
					break;

			}
			} finally {dbg.exitSubRule(16);}
			dbg.location(67,56);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:67:56: ( 'else' ( WS )? commands )?
			int alt18=2;
			try { dbg.enterSubRule(18);
			try { dbg.enterDecision(18, decisionCanBacktrack[18]);

			int LA18_0 = input.LA(1);
			if ( (LA18_0==31) ) {
				alt18=1;
			}
			} finally {dbg.exitDecision(18);}

			switch (alt18) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:67:57: 'else' ( WS )? commands
					{
					dbg.location(67,57);
					string_literal46=(Token)match(input,31,FOLLOW_31_in_if_532);  
					stream_31.add(string_literal46);
					dbg.location(67,64);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:67:64: ( WS )?
					int alt17=2;
					try { dbg.enterSubRule(17);
					try { dbg.enterDecision(17, decisionCanBacktrack[17]);

					int LA17_0 = input.LA(1);
					if ( (LA17_0==WS) ) {
						alt17=1;
					}
					} finally {dbg.exitDecision(17);}

					switch (alt17) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:67:64: WS
							{
							dbg.location(67,64);
							WS47=(Token)match(input,WS,FOLLOW_WS_in_if_534);  
							stream_WS.add(WS47);

							}
							break;

					}
					} finally {dbg.exitSubRule(17);}
					dbg.location(67,68);
					pushFollow(FOLLOW_commands_in_if_537);
					commands48=commands();
					state._fsp--;

					stream_commands.add(commands48.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(18);}
			dbg.location(67,79);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:67:79: ( WS )?
			int alt19=2;
			try { dbg.enterSubRule(19);
			try { dbg.enterDecision(19, decisionCanBacktrack[19]);

			int LA19_0 = input.LA(1);
			if ( (LA19_0==WS) ) {
				alt19=1;
			}
			} finally {dbg.exitDecision(19);}

			switch (alt19) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:67:79: WS
					{
					dbg.location(67,79);
					WS49=(Token)match(input,WS,FOLLOW_WS_in_if_541);  
					stream_WS.add(WS49);

					}
					break;

			}
<<<<<<< Updated upstream
			} finally {dbg.exitSubRule(19);}
			dbg.location(67,83);
			string_literal50=(Token)match(input,32,FOLLOW_32_in_if_544);  
			stream_32.add(string_literal50);
=======

			pushFollow(FOLLOW_then__in_if_701);
			then_50=then_();
			state._fsp--;

			stream_then_.add(then_50.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:82:39: ( WS )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==WS) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:82:39: WS
					{
					WS51=(Token)match(input,WS,FOLLOW_WS_in_if_704);  
					stream_WS.add(WS51);

					}
					break;

				default :
					break loop21;
				}
			}

			pushFollow(FOLLOW_else__in_if_707);
			else_52=else_();
			state._fsp--;

			stream_else_.add(else_52.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:82:49: ( WS )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==WS) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:82:49: WS
					{
					WS53=(Token)match(input,WS,FOLLOW_WS_in_if_709);  
					stream_WS.add(WS53);

					}
					break;

				default :
					break loop22;
				}
			}

			string_literal54=(Token)match(input,44,FOLLOW_44_in_if_712);  
			stream_44.add(string_literal54);
>>>>>>> Stashed changes

			}

			// AST REWRITE
<<<<<<< Updated upstream
			// elements: expression, commands
=======
			// elements: expression, else_, then_
>>>>>>> Stashed changes
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
<<<<<<< Updated upstream
			// 67:89: -> ^( IF expression commands )
			{
				dbg.location(67,92);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:67:92: ^( IF expression commands )
=======
			// 82:59: -> ^( IF expression then_ ( else_ )? END )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:82:62: ^( IF expression then_ ( else_ )? END )
>>>>>>> Stashed changes
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(67,94);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);
<<<<<<< Updated upstream
				dbg.location(67,97);
				adaptor.addChild(root_1, stream_expression.nextTree());dbg.location(67,108);
				adaptor.addChild(root_1, stream_commands.nextTree());
=======
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_1, stream_then_.nextTree());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:82:84: ( else_ )?
				if ( stream_else_.hasNext() ) {
					adaptor.addChild(root_1, stream_else_.nextTree());
				}
				stream_else_.reset();

				adaptor.addChild(root_1, (Object)adaptor.create(END, "END"));
>>>>>>> Stashed changes
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
			dbg.exitRule(getGrammarFileName(), "if_");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "if_"


<<<<<<< Updated upstream
=======
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

		Token string_literal55=null;
		Token WS56=null;
		Token WS58=null;
		ParserRuleReturnScope commands57 =null;

		Object string_literal55_tree=null;
		Object WS56_tree=null;
		Object WS58_tree=null;
		RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:85:7: ( 'then' ( WS )* commands ( WS )* -> ^( THEN commands ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:85:9: 'then' ( WS )* commands ( WS )*
			{
			string_literal55=(Token)match(input,56,FOLLOW_56_in_then_745);  
			stream_56.add(string_literal55);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:85:16: ( WS )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==WS) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:85:16: WS
					{
					WS56=(Token)match(input,WS,FOLLOW_WS_in_then_747);  
					stream_WS.add(WS56);

					}
					break;

				default :
					break loop23;
				}
			}

			pushFollow(FOLLOW_commands_in_then_750);
			commands57=commands();
			state._fsp--;

			stream_commands.add(commands57.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:85:29: ( WS )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==WS) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:85:29: WS
					{
					WS58=(Token)match(input,WS,FOLLOW_WS_in_then_752);  
					stream_WS.add(WS58);

					}
					break;

				default :
					break loop24;
				}
			}

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
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:85:36: ^( THEN commands )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(THEN, "THEN"), root_1);
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

		Token string_literal59=null;
		Token WS60=null;
		ParserRuleReturnScope commands61 =null;

		Object string_literal59_tree=null;
		Object WS60_tree=null;
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:87:7: ( ( 'else' ( WS )* commands )? -> ^( ELSE commands ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:87:9: ( 'else' ( WS )* commands )?
			{
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:87:9: ( 'else' ( WS )* commands )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==43) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:87:10: 'else' ( WS )* commands
					{
					string_literal59=(Token)match(input,43,FOLLOW_43_in_else_770);  
					stream_43.add(string_literal59);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:87:17: ( WS )*
					loop25:
					while (true) {
						int alt25=2;
						int LA25_0 = input.LA(1);
						if ( (LA25_0==WS) ) {
							alt25=1;
						}

						switch (alt25) {
						case 1 :
							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:87:17: WS
							{
							WS60=(Token)match(input,WS,FOLLOW_WS_in_else_772);  
							stream_WS.add(WS60);

							}
							break;

						default :
							break loop25;
						}
					}

					pushFollow(FOLLOW_commands_in_else_775);
					commands61=commands();
					state._fsp--;

					stream_commands.add(commands61.getTree());
					}
					break;

			}

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
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:87:35: ^( ELSE commands )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ELSE, "ELSE"), root_1);
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
		return retval;
	}
	// $ANTLR end "else_"


>>>>>>> Stashed changes
	public static class while__return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "while_"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:70:1: while_ : ( 'while' ( WS )? expression ( WS )? 'do' ( WS )? commands ( WS )? 'od' ) -> ^( WHILE expression commands ) ;
	public final while_astParser.while__return while_() throws RecognitionException {
		while_astParser.while__return retval = new while_astParser.while__return();
		retval.start = input.LT(1);

		Object root_0 = null;

<<<<<<< Updated upstream
		Token string_literal51=null;
		Token WS52=null;
		Token WS54=null;
		Token string_literal55=null;
		Token WS56=null;
		Token WS58=null;
		Token string_literal59=null;
		ParserRuleReturnScope expression53 =null;
		ParserRuleReturnScope commands57 =null;

		Object string_literal51_tree=null;
		Object WS52_tree=null;
		Object WS54_tree=null;
		Object string_literal55_tree=null;
		Object WS56_tree=null;
		Object WS58_tree=null;
		Object string_literal59_tree=null;
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
=======
		Token string_literal62=null;
		Token WS63=null;
		Token WS65=null;
		ParserRuleReturnScope expression64 =null;
		ParserRuleReturnScope do_66 =null;

		Object string_literal62_tree=null;
		Object WS63_tree=null;
		Object WS65_tree=null;
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_do_=new RewriteRuleSubtreeStream(adaptor,"rule do_");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:90:5: ( ( 'while' ( WS )* expression ( WS )* do_ ) -> ^( WHILE expression do_ END ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:90:7: ( 'while' ( WS )* expression ( WS )* do_ )
			{
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:90:7: ( 'while' ( WS )* expression ( WS )* do_ )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:90:8: 'while' ( WS )* expression ( WS )* do_
			{
			string_literal62=(Token)match(input,58,FOLLOW_58_in_while_798);  
			stream_58.add(string_literal62);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:90:16: ( WS )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==WS) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:90:16: WS
					{
					WS63=(Token)match(input,WS,FOLLOW_WS_in_while_800);  
					stream_WS.add(WS63);

					}
					break;

				default :
					break loop27;
				}
			}

			pushFollow(FOLLOW_expression_in_while_803);
			expression64=expression();
			state._fsp--;

			stream_expression.add(expression64.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:90:31: ( WS )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==WS) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:90:31: WS
					{
					WS65=(Token)match(input,WS,FOLLOW_WS_in_while_805);  
					stream_WS.add(WS65);

					}
					break;

				default :
					break loop28;
				}
			}

			pushFollow(FOLLOW_do__in_while_808);
			do_66=do_();
			state._fsp--;

			stream_do_.add(do_66.getTree());
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
			// 90:40: -> ^( WHILE expression do_ END )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:90:43: ^( WHILE expression do_ END )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WHILE, "WHILE"), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_1, stream_do_.nextTree());
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

		Token string_literal67=null;
		Token WS68=null;
		Token WS70=null;
		Token string_literal71=null;
		ParserRuleReturnScope commands69 =null;

		Object string_literal67_tree=null;
		Object WS68_tree=null;
		Object WS70_tree=null;
		Object string_literal71_tree=null;
>>>>>>> Stashed changes
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try { dbg.enterRule(getGrammarFileName(), "while_");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(70, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:71:5: ( ( 'while' ( WS )? expression ( WS )? 'do' ( WS )? commands ( WS )? 'od' ) -> ^( WHILE expression commands ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:71:7: ( 'while' ( WS )? expression ( WS )? 'do' ( WS )? commands ( WS )? 'od' )
			{
<<<<<<< Updated upstream
			dbg.location(71,7);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:71:7: ( 'while' ( WS )? expression ( WS )? 'do' ( WS )? commands ( WS )? 'od' )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:71:8: 'while' ( WS )? expression ( WS )? 'do' ( WS )? commands ( WS )? 'od'
			{
			dbg.location(71,8);
			string_literal51=(Token)match(input,46,FOLLOW_46_in_while_573);  
			stream_46.add(string_literal51);
			dbg.location(71,16);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:71:16: ( WS )?
			int alt20=2;
			try { dbg.enterSubRule(20);
			try { dbg.enterDecision(20, decisionCanBacktrack[20]);

			int LA20_0 = input.LA(1);
			if ( (LA20_0==WS) ) {
				alt20=1;
			}
			} finally {dbg.exitDecision(20);}

			switch (alt20) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:71:16: WS
					{
					dbg.location(71,16);
					WS52=(Token)match(input,WS,FOLLOW_WS_in_while_575);  
					stream_WS.add(WS52);

					}
					break;

			}
			} finally {dbg.exitSubRule(20);}
			dbg.location(71,20);
			pushFollow(FOLLOW_expression_in_while_578);
			expression53=expression();
			state._fsp--;

			stream_expression.add(expression53.getTree());dbg.location(71,31);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:71:31: ( WS )?
			int alt21=2;
			try { dbg.enterSubRule(21);
			try { dbg.enterDecision(21, decisionCanBacktrack[21]);
=======
			string_literal67=(Token)match(input,42,FOLLOW_42_in_do_839);  
			stream_42.add(string_literal67);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:93:13: ( WS )*
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==WS) ) {
					alt29=1;
				}
>>>>>>> Stashed changes

			int LA21_0 = input.LA(1);
			if ( (LA21_0==WS) ) {
				alt21=1;
			}
			} finally {dbg.exitDecision(21);}

			switch (alt21) {
				case 1 :
<<<<<<< Updated upstream
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:71:31: WS
					{
					dbg.location(71,31);
					WS54=(Token)match(input,WS,FOLLOW_WS_in_while_580);  
					stream_WS.add(WS54);
=======
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:93:13: WS
					{
					WS68=(Token)match(input,WS,FOLLOW_WS_in_do_841);  
					stream_WS.add(WS68);
>>>>>>> Stashed changes

					}
					break;

			}
			} finally {dbg.exitSubRule(21);}
			dbg.location(71,35);
			string_literal55=(Token)match(input,30,FOLLOW_30_in_while_583);  
			stream_30.add(string_literal55);
			dbg.location(71,40);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:71:40: ( WS )?
			int alt22=2;
			try { dbg.enterSubRule(22);
			try { dbg.enterDecision(22, decisionCanBacktrack[22]);

			int LA22_0 = input.LA(1);
			if ( (LA22_0==WS) ) {
				alt22=1;
			}
			} finally {dbg.exitDecision(22);}

			switch (alt22) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:71:40: WS
					{
					dbg.location(71,40);
					WS56=(Token)match(input,WS,FOLLOW_WS_in_while_585);  
					stream_WS.add(WS56);

					}
					break;

			}
			} finally {dbg.exitSubRule(22);}
			dbg.location(71,44);
			pushFollow(FOLLOW_commands_in_while_588);
			commands57=commands();
			state._fsp--;

			stream_commands.add(commands57.getTree());dbg.location(71,53);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:71:53: ( WS )?
			int alt23=2;
			try { dbg.enterSubRule(23);
			try { dbg.enterDecision(23, decisionCanBacktrack[23]);

			int LA23_0 = input.LA(1);
			if ( (LA23_0==WS) ) {
				alt23=1;
			}
			} finally {dbg.exitDecision(23);}

			switch (alt23) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:71:53: WS
					{
					dbg.location(71,53);
					WS58=(Token)match(input,WS,FOLLOW_WS_in_while_590);  
					stream_WS.add(WS58);

					}
					break;

			}
			} finally {dbg.exitSubRule(23);}
			dbg.location(71,57);
			string_literal59=(Token)match(input,42,FOLLOW_42_in_while_593);  
			stream_42.add(string_literal59);

			}

<<<<<<< Updated upstream
=======
			pushFollow(FOLLOW_commands_in_do_844);
			commands69=commands();
			state._fsp--;

			stream_commands.add(commands69.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:93:26: ( WS )*
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==WS) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:93:26: WS
					{
					WS70=(Token)match(input,WS,FOLLOW_WS_in_do_846);  
					stream_WS.add(WS70);

					}
					break;

				default :
					break loop30;
				}
			}

			string_literal71=(Token)match(input,54,FOLLOW_54_in_do_849);  
			stream_54.add(string_literal71);

>>>>>>> Stashed changes
			// AST REWRITE
			// elements: commands, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 71:63: -> ^( WHILE expression commands )
			{
				dbg.location(71,66);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:71:66: ^( WHILE expression commands )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(71,68);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WHILE, "WHILE"), root_1);
				dbg.location(71,74);
				adaptor.addChild(root_1, stream_expression.nextTree());dbg.location(71,85);
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
		dbg.location(72, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "while_");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "while_"


	public static class for__return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "for_"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:74:1: for_ : ( 'for' ( WS )? expression ( WS )? 'do' ( WS )? commands ( WS )? 'od' ) -> ^( FOR expression commands ) ;
	public final while_astParser.for__return for_() throws RecognitionException {
		while_astParser.for__return retval = new while_astParser.for__return();
		retval.start = input.LT(1);

		Object root_0 = null;

<<<<<<< Updated upstream
		Token string_literal60=null;
		Token WS61=null;
		Token WS63=null;
		Token string_literal64=null;
		Token WS65=null;
		Token WS67=null;
		Token string_literal68=null;
		ParserRuleReturnScope expression62 =null;
		ParserRuleReturnScope commands66 =null;

		Object string_literal60_tree=null;
		Object WS61_tree=null;
		Object WS63_tree=null;
		Object string_literal64_tree=null;
		Object WS65_tree=null;
		Object WS67_tree=null;
		Object string_literal68_tree=null;
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
=======
		Token string_literal72=null;
		Token WS73=null;
		Token WS75=null;
		ParserRuleReturnScope expression74 =null;
		ParserRuleReturnScope do_76 =null;

		Object string_literal72_tree=null;
		Object WS73_tree=null;
		Object WS75_tree=null;
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
>>>>>>> Stashed changes
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try { dbg.enterRule(getGrammarFileName(), "for_");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(74, 0);

		try {
<<<<<<< Updated upstream
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:75:5: ( ( 'for' ( WS )? expression ( WS )? 'do' ( WS )? commands ( WS )? 'od' ) -> ^( FOR expression commands ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:75:7: ( 'for' ( WS )? expression ( WS )? 'do' ( WS )? commands ( WS )? 'od' )
			{
			dbg.location(75,7);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:75:7: ( 'for' ( WS )? expression ( WS )? 'do' ( WS )? commands ( WS )? 'od' )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:75:8: 'for' ( WS )? expression ( WS )? 'do' ( WS )? commands ( WS )? 'od'
			{
			dbg.location(75,8);
			string_literal60=(Token)match(input,33,FOLLOW_33_in_for_622);  
			stream_33.add(string_literal60);
			dbg.location(75,14);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:75:14: ( WS )?
			int alt24=2;
			try { dbg.enterSubRule(24);
			try { dbg.enterDecision(24, decisionCanBacktrack[24]);

			int LA24_0 = input.LA(1);
			if ( (LA24_0==WS) ) {
				alt24=1;
			}
			} finally {dbg.exitDecision(24);}

			switch (alt24) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:75:14: WS
					{
					dbg.location(75,14);
					WS61=(Token)match(input,WS,FOLLOW_WS_in_for_624);  
					stream_WS.add(WS61);

					}
					break;

			}
			} finally {dbg.exitSubRule(24);}
			dbg.location(75,18);
			pushFollow(FOLLOW_expression_in_for_627);
			expression62=expression();
			state._fsp--;

			stream_expression.add(expression62.getTree());dbg.location(75,29);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:75:29: ( WS )?
			int alt25=2;
			try { dbg.enterSubRule(25);
			try { dbg.enterDecision(25, decisionCanBacktrack[25]);
=======
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:96:5: ( ( 'for' ( WS )* expression ( WS )* do_ ) -> ^( FOR expression do_ END ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:96:7: ( 'for' ( WS )* expression ( WS )* do_ )
			{
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:96:7: ( 'for' ( WS )* expression ( WS )* do_ )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:96:8: 'for' ( WS )* expression ( WS )* do_
			{
			string_literal72=(Token)match(input,45,FOLLOW_45_in_for_870);  
			stream_45.add(string_literal72);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:96:14: ( WS )*
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==WS) ) {
					alt31=1;
				}
>>>>>>> Stashed changes

			int LA25_0 = input.LA(1);
			if ( (LA25_0==WS) ) {
				alt25=1;
			}
			} finally {dbg.exitDecision(25);}

			switch (alt25) {
				case 1 :
<<<<<<< Updated upstream
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:75:29: WS
					{
					dbg.location(75,29);
					WS63=(Token)match(input,WS,FOLLOW_WS_in_for_629);  
					stream_WS.add(WS63);
=======
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:96:14: WS
					{
					WS73=(Token)match(input,WS,FOLLOW_WS_in_for_872);  
					stream_WS.add(WS73);
>>>>>>> Stashed changes

					}
					break;

			}
			} finally {dbg.exitSubRule(25);}
			dbg.location(75,33);
			string_literal64=(Token)match(input,30,FOLLOW_30_in_for_632);  
			stream_30.add(string_literal64);
			dbg.location(75,38);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:75:38: ( WS )?
			int alt26=2;
			try { dbg.enterSubRule(26);
			try { dbg.enterDecision(26, decisionCanBacktrack[26]);

<<<<<<< Updated upstream
			int LA26_0 = input.LA(1);
			if ( (LA26_0==WS) ) {
				alt26=1;
			}
			} finally {dbg.exitDecision(26);}

			switch (alt26) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:75:38: WS
					{
					dbg.location(75,38);
					WS65=(Token)match(input,WS,FOLLOW_WS_in_for_634);  
					stream_WS.add(WS65);

					}
					break;

			}
			} finally {dbg.exitSubRule(26);}
			dbg.location(75,42);
			pushFollow(FOLLOW_commands_in_for_637);
			commands66=commands();
			state._fsp--;

			stream_commands.add(commands66.getTree());dbg.location(75,51);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:75:51: ( WS )?
			int alt27=2;
			try { dbg.enterSubRule(27);
			try { dbg.enterDecision(27, decisionCanBacktrack[27]);

			int LA27_0 = input.LA(1);
			if ( (LA27_0==WS) ) {
				alt27=1;
			}
			} finally {dbg.exitDecision(27);}

			switch (alt27) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:75:51: WS
					{
					dbg.location(75,51);
					WS67=(Token)match(input,WS,FOLLOW_WS_in_for_639);  
					stream_WS.add(WS67);
=======
			pushFollow(FOLLOW_expression_in_for_875);
			expression74=expression();
			state._fsp--;

			stream_expression.add(expression74.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:96:29: ( WS )*
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==WS) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:96:29: WS
					{
					WS75=(Token)match(input,WS,FOLLOW_WS_in_for_877);  
					stream_WS.add(WS75);
>>>>>>> Stashed changes

					}
					break;

<<<<<<< Updated upstream
			}
			} finally {dbg.exitSubRule(27);}
			dbg.location(75,55);
			string_literal68=(Token)match(input,42,FOLLOW_42_in_for_642);  
			stream_42.add(string_literal68);

=======
				default :
					break loop32;
				}
			}

			pushFollow(FOLLOW_do__in_for_880);
			do_76=do_();
			state._fsp--;

			stream_do_.add(do_76.getTree());
>>>>>>> Stashed changes
			}

			// AST REWRITE
			// elements: commands, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 75:61: -> ^( FOR expression commands )
			{
				dbg.location(75,64);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:75:64: ^( FOR expression commands )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(75,66);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOR, "FOR"), root_1);
				dbg.location(75,70);
				adaptor.addChild(root_1, stream_expression.nextTree());dbg.location(75,81);
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
		dbg.location(76, 4);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:78:1: foreach_ : ( 'foreach' ( WS )? Variable ( WS )? 'in' ( WS )? expression ( WS )? 'do' ( WS )? commands ( WS )? 'od' ) -> ^( FOREACH ^( IN Variable expression ) commands ) ;
	public final while_astParser.foreach__return foreach_() throws RecognitionException {
		while_astParser.foreach__return retval = new while_astParser.foreach__return();
		retval.start = input.LT(1);

		Object root_0 = null;

<<<<<<< Updated upstream
		Token string_literal69=null;
		Token WS70=null;
		Token Variable71=null;
		Token WS72=null;
		Token string_literal73=null;
		Token WS74=null;
		Token WS76=null;
		Token string_literal77=null;
		Token WS78=null;
		Token WS80=null;
		Token string_literal81=null;
		ParserRuleReturnScope expression75 =null;
		ParserRuleReturnScope commands79 =null;

		Object string_literal69_tree=null;
		Object WS70_tree=null;
		Object Variable71_tree=null;
		Object WS72_tree=null;
		Object string_literal73_tree=null;
		Object WS74_tree=null;
		Object WS76_tree=null;
		Object string_literal77_tree=null;
		Object WS78_tree=null;
		Object WS80_tree=null;
		Object string_literal81_tree=null;
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
=======
		Token string_literal77=null;
		Token WS78=null;
		Token Variable79=null;
		Token WS80=null;
		Token string_literal81=null;
		Token WS82=null;
		Token WS84=null;
		ParserRuleReturnScope expression83 =null;
		ParserRuleReturnScope do_85 =null;

		Object string_literal77_tree=null;
		Object WS78_tree=null;
		Object Variable79_tree=null;
		Object WS80_tree=null;
		Object string_literal81_tree=null;
		Object WS82_tree=null;
		Object WS84_tree=null;
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
>>>>>>> Stashed changes
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try { dbg.enterRule(getGrammarFileName(), "foreach_");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(78, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:79:5: ( ( 'foreach' ( WS )? Variable ( WS )? 'in' ( WS )? expression ( WS )? 'do' ( WS )? commands ( WS )? 'od' ) -> ^( FOREACH ^( IN Variable expression ) commands ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:79:7: ( 'foreach' ( WS )? Variable ( WS )? 'in' ( WS )? expression ( WS )? 'do' ( WS )? commands ( WS )? 'od' )
			{
			dbg.location(79,7);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:79:7: ( 'foreach' ( WS )? Variable ( WS )? 'in' ( WS )? expression ( WS )? 'do' ( WS )? commands ( WS )? 'od' )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:79:8: 'foreach' ( WS )? Variable ( WS )? 'in' ( WS )? expression ( WS )? 'do' ( WS )? commands ( WS )? 'od'
			{
<<<<<<< Updated upstream
			dbg.location(79,8);
			string_literal69=(Token)match(input,34,FOLLOW_34_in_foreach_671);  
			stream_34.add(string_literal69);
			dbg.location(79,18);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:79:18: ( WS )?
			int alt28=2;
			try { dbg.enterSubRule(28);
			try { dbg.enterDecision(28, decisionCanBacktrack[28]);

			int LA28_0 = input.LA(1);
			if ( (LA28_0==WS) ) {
				alt28=1;
			}
			} finally {dbg.exitDecision(28);}

			switch (alt28) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:79:18: WS
					{
					dbg.location(79,18);
					WS70=(Token)match(input,WS,FOLLOW_WS_in_foreach_673);  
					stream_WS.add(WS70);

					}
					break;

			}
			} finally {dbg.exitSubRule(28);}
			dbg.location(79,22);
			Variable71=(Token)match(input,Variable,FOLLOW_Variable_in_foreach_676);  
			stream_Variable.add(Variable71);
			dbg.location(79,31);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:79:31: ( WS )?
			int alt29=2;
			try { dbg.enterSubRule(29);
			try { dbg.enterDecision(29, decisionCanBacktrack[29]);

			int LA29_0 = input.LA(1);
			if ( (LA29_0==WS) ) {
				alt29=1;
			}
			} finally {dbg.exitDecision(29);}

			switch (alt29) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:79:31: WS
					{
					dbg.location(79,31);
					WS72=(Token)match(input,WS,FOLLOW_WS_in_foreach_678);  
					stream_WS.add(WS72);
=======
			string_literal77=(Token)match(input,46,FOLLOW_46_in_foreach_911);  
			stream_46.add(string_literal77);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:100:18: ( WS )*
			loop33:
			while (true) {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==WS) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:100:18: WS
					{
					WS78=(Token)match(input,WS,FOLLOW_WS_in_foreach_913);  
					stream_WS.add(WS78);
>>>>>>> Stashed changes

					}
					break;

			}
			} finally {dbg.exitSubRule(29);}
			dbg.location(79,35);
			string_literal73=(Token)match(input,38,FOLLOW_38_in_foreach_681);  
			stream_38.add(string_literal73);
			dbg.location(79,40);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:79:40: ( WS )?
			int alt30=2;
			try { dbg.enterSubRule(30);
			try { dbg.enterDecision(30, decisionCanBacktrack[30]);

<<<<<<< Updated upstream
			int LA30_0 = input.LA(1);
			if ( (LA30_0==WS) ) {
				alt30=1;
			}
			} finally {dbg.exitDecision(30);}

			switch (alt30) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:79:40: WS
					{
					dbg.location(79,40);
					WS74=(Token)match(input,WS,FOLLOW_WS_in_foreach_683);  
					stream_WS.add(WS74);
=======
			Variable79=(Token)match(input,Variable,FOLLOW_Variable_in_foreach_916);  
			stream_Variable.add(Variable79);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:100:31: ( WS )*
			loop34:
			while (true) {
				int alt34=2;
				int LA34_0 = input.LA(1);
				if ( (LA34_0==WS) ) {
					alt34=1;
				}

				switch (alt34) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:100:31: WS
					{
					WS80=(Token)match(input,WS,FOLLOW_WS_in_foreach_918);  
					stream_WS.add(WS80);
>>>>>>> Stashed changes

					}
					break;

			}
<<<<<<< Updated upstream
			} finally {dbg.exitSubRule(30);}
			dbg.location(79,44);
			pushFollow(FOLLOW_expression_in_foreach_686);
			expression75=expression();
			state._fsp--;

			stream_expression.add(expression75.getTree());dbg.location(79,55);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:79:55: ( WS )?
			int alt31=2;
			try { dbg.enterSubRule(31);
			try { dbg.enterDecision(31, decisionCanBacktrack[31]);
=======

			string_literal81=(Token)match(input,50,FOLLOW_50_in_foreach_921);  
			stream_50.add(string_literal81);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:100:40: ( WS )*
			loop35:
			while (true) {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==WS) ) {
					alt35=1;
				}
>>>>>>> Stashed changes

			int LA31_0 = input.LA(1);
			if ( (LA31_0==WS) ) {
				alt31=1;
			}
			} finally {dbg.exitDecision(31);}

			switch (alt31) {
				case 1 :
<<<<<<< Updated upstream
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:79:55: WS
					{
					dbg.location(79,55);
					WS76=(Token)match(input,WS,FOLLOW_WS_in_foreach_688);  
					stream_WS.add(WS76);
=======
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:100:40: WS
					{
					WS82=(Token)match(input,WS,FOLLOW_WS_in_foreach_923);  
					stream_WS.add(WS82);
>>>>>>> Stashed changes

					}
					break;

			}
			} finally {dbg.exitSubRule(31);}
			dbg.location(79,59);
			string_literal77=(Token)match(input,30,FOLLOW_30_in_foreach_691);  
			stream_30.add(string_literal77);
			dbg.location(79,64);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:79:64: ( WS )?
			int alt32=2;
			try { dbg.enterSubRule(32);
			try { dbg.enterDecision(32, decisionCanBacktrack[32]);

<<<<<<< Updated upstream
			int LA32_0 = input.LA(1);
			if ( (LA32_0==WS) ) {
				alt32=1;
			}
			} finally {dbg.exitDecision(32);}

			switch (alt32) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:79:64: WS
					{
					dbg.location(79,64);
					WS78=(Token)match(input,WS,FOLLOW_WS_in_foreach_693);  
					stream_WS.add(WS78);

					}
					break;

			}
			} finally {dbg.exitSubRule(32);}
			dbg.location(79,68);
			pushFollow(FOLLOW_commands_in_foreach_696);
			commands79=commands();
			state._fsp--;

			stream_commands.add(commands79.getTree());dbg.location(79,77);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:79:77: ( WS )?
			int alt33=2;
			try { dbg.enterSubRule(33);
			try { dbg.enterDecision(33, decisionCanBacktrack[33]);

			int LA33_0 = input.LA(1);
			if ( (LA33_0==WS) ) {
				alt33=1;
			}
			} finally {dbg.exitDecision(33);}

			switch (alt33) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:79:77: WS
					{
					dbg.location(79,77);
					WS80=(Token)match(input,WS,FOLLOW_WS_in_foreach_698);  
					stream_WS.add(WS80);
=======
			pushFollow(FOLLOW_expression_in_foreach_926);
			expression83=expression();
			state._fsp--;

			stream_expression.add(expression83.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:100:55: ( WS )*
			loop36:
			while (true) {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( (LA36_0==WS) ) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:100:55: WS
					{
					WS84=(Token)match(input,WS,FOLLOW_WS_in_foreach_928);  
					stream_WS.add(WS84);
>>>>>>> Stashed changes

					}
					break;

<<<<<<< Updated upstream
			}
			} finally {dbg.exitSubRule(33);}
			dbg.location(79,81);
			string_literal81=(Token)match(input,42,FOLLOW_42_in_foreach_701);  
			stream_42.add(string_literal81);

			}

			// AST REWRITE
			// elements: Variable, expression, commands
=======
				default :
					break loop36;
				}
			}

			pushFollow(FOLLOW_do__in_foreach_931);
			do_85=do_();
			state._fsp--;

			stream_do_.add(do_85.getTree());
			}

			// AST REWRITE
			// elements: do_, Variable, expression
>>>>>>> Stashed changes
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 79:87: -> ^( FOREACH ^( IN Variable expression ) commands )
			{
				dbg.location(79,90);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:79:90: ^( FOREACH ^( IN Variable expression ) commands )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(79,92);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOREACH, "FOREACH"), root_1);
				dbg.location(79,100);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:79:100: ^( IN Variable expression )
				{
				Object root_2 = (Object)adaptor.nil();
				dbg.location(79,102);
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(IN, "IN"), root_2);
				dbg.location(79,105);
				adaptor.addChild(root_2, stream_Variable.nextNode());dbg.location(79,114);
				adaptor.addChild(root_2, stream_expression.nextTree());
				adaptor.addChild(root_1, root_2);
				}
				dbg.location(79,126);
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
		dbg.location(80, 4);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:82:1: vars : Variable ( ',' vars )? -> ^( VARIABLES Variable ( vars )* ) ;
	public final while_astParser.vars_return vars() throws RecognitionException {
		while_astParser.vars_return retval = new while_astParser.vars_return();
		retval.start = input.LT(1);

		Object root_0 = null;

<<<<<<< Updated upstream
		Token Variable82=null;
		Token char_literal83=null;
		ParserRuleReturnScope vars84 =null;

		Object Variable82_tree=null;
		Object char_literal83_tree=null;
		RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
=======
		Token Variable86=null;
		Token char_literal87=null;
		Token WS88=null;
		ParserRuleReturnScope vars89 =null;

		Object Variable86_tree=null;
		Object char_literal87_tree=null;
		Object WS88_tree=null;
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
>>>>>>> Stashed changes
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");

		try { dbg.enterRule(getGrammarFileName(), "vars");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(82, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:83:5: ( Variable ( ',' vars )? -> ^( VARIABLES Variable ( vars )* ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:83:7: Variable ( ',' vars )?
			{
<<<<<<< Updated upstream
			dbg.location(83,7);
			Variable82=(Token)match(input,Variable,FOLLOW_Variable_in_vars735);  
			stream_Variable.add(Variable82);
			dbg.location(83,16);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:83:16: ( ',' vars )?
			int alt34=2;
			try { dbg.enterSubRule(34);
			try { dbg.enterDecision(34, decisionCanBacktrack[34]);

			int LA34_0 = input.LA(1);
			if ( (LA34_0==24) ) {
				alt34=1;
			}
			} finally {dbg.exitDecision(34);}

			switch (alt34) {
=======
			Variable86=(Token)match(input,Variable,FOLLOW_Variable_in_vars967);  
			stream_Variable.add(Variable86);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:104:16: ( ',' ( WS )* vars )?
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==36) ) {
				alt38=1;
			}
			switch (alt38) {
>>>>>>> Stashed changes
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:83:17: ',' vars
					{
<<<<<<< Updated upstream
					dbg.location(83,17);
					char_literal83=(Token)match(input,24,FOLLOW_24_in_vars738);  
					stream_24.add(char_literal83);
					dbg.location(83,21);
					pushFollow(FOLLOW_vars_in_vars740);
					vars84=vars();
					state._fsp--;

					stream_vars.add(vars84.getTree());
=======
					char_literal87=(Token)match(input,36,FOLLOW_36_in_vars970);  
					stream_36.add(char_literal87);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:104:20: ( WS )*
					loop37:
					while (true) {
						int alt37=2;
						int LA37_0 = input.LA(1);
						if ( (LA37_0==WS) ) {
							alt37=1;
						}

						switch (alt37) {
						case 1 :
							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:104:20: WS
							{
							WS88=(Token)match(input,WS,FOLLOW_WS_in_vars971);  
							stream_WS.add(WS88);

							}
							break;

						default :
							break loop37;
						}
					}

					pushFollow(FOLLOW_vars_in_vars974);
					vars89=vars();
					state._fsp--;

					stream_vars.add(vars89.getTree());
>>>>>>> Stashed changes
					}
					break;

			}
			} finally {dbg.exitSubRule(34);}

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
			// 83:28: -> ^( VARIABLES Variable ( vars )* )
			{
				dbg.location(83,31);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:83:31: ^( VARIABLES Variable ( vars )* )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(83,33);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARIABLES, "VARIABLES"), root_1);
				dbg.location(83,43);
				adaptor.addChild(root_1, stream_Variable.nextNode());dbg.location(83,52);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:83:52: ( vars )*
				while ( stream_vars.hasNext() ) {
					dbg.location(83,52);
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
		dbg.location(84, 4);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:86:1: exprs : expression ( ',' exprs )? -> ^( EXPR expression ( exprs )* ) ;
	public final while_astParser.exprs_return exprs() throws RecognitionException {
		while_astParser.exprs_return retval = new while_astParser.exprs_return();
		retval.start = input.LT(1);

		Object root_0 = null;

<<<<<<< Updated upstream
		Token char_literal86=null;
		ParserRuleReturnScope expression85 =null;
		ParserRuleReturnScope exprs87 =null;

		Object char_literal86_tree=null;
		RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
=======
		Token char_literal91=null;
		Token WS92=null;
		ParserRuleReturnScope expression90 =null;
		ParserRuleReturnScope exprs93 =null;

		Object char_literal91_tree=null;
		Object WS92_tree=null;
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
>>>>>>> Stashed changes
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");

		try { dbg.enterRule(getGrammarFileName(), "exprs");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(86, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:87:5: ( expression ( ',' exprs )? -> ^( EXPR expression ( exprs )* ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:87:7: expression ( ',' exprs )?
			{
<<<<<<< Updated upstream
			dbg.location(87,7);
			pushFollow(FOLLOW_expression_in_exprs770);
			expression85=expression();
			state._fsp--;

			stream_expression.add(expression85.getTree());dbg.location(87,18);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:87:18: ( ',' exprs )?
			int alt35=2;
			try { dbg.enterSubRule(35);
			try { dbg.enterDecision(35, decisionCanBacktrack[35]);

			int LA35_0 = input.LA(1);
			if ( (LA35_0==24) ) {
				alt35=1;
			}
			} finally {dbg.exitDecision(35);}

			switch (alt35) {
=======
			pushFollow(FOLLOW_expression_in_exprs1000);
			expression90=expression();
			state._fsp--;

			stream_expression.add(expression90.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:108:18: ( ',' ( WS )* exprs )?
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==36) ) {
				alt40=1;
			}
			switch (alt40) {
>>>>>>> Stashed changes
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:87:19: ',' exprs
					{
<<<<<<< Updated upstream
					dbg.location(87,19);
					char_literal86=(Token)match(input,24,FOLLOW_24_in_exprs773);  
					stream_24.add(char_literal86);
					dbg.location(87,23);
					pushFollow(FOLLOW_exprs_in_exprs775);
					exprs87=exprs();
					state._fsp--;

					stream_exprs.add(exprs87.getTree());
=======
					char_literal91=(Token)match(input,36,FOLLOW_36_in_exprs1003);  
					stream_36.add(char_literal91);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:108:22: ( WS )*
					loop39:
					while (true) {
						int alt39=2;
						int LA39_0 = input.LA(1);
						if ( (LA39_0==WS) ) {
							alt39=1;
						}

						switch (alt39) {
						case 1 :
							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:108:22: WS
							{
							WS92=(Token)match(input,WS,FOLLOW_WS_in_exprs1004);  
							stream_WS.add(WS92);

							}
							break;

						default :
							break loop39;
						}
					}

					pushFollow(FOLLOW_exprs_in_exprs1007);
					exprs93=exprs();
					state._fsp--;

					stream_exprs.add(exprs93.getTree());
>>>>>>> Stashed changes
					}
					break;

			}
			} finally {dbg.exitSubRule(35);}

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
			// 87:31: -> ^( EXPR expression ( exprs )* )
			{
				dbg.location(87,34);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:87:34: ^( EXPR expression ( exprs )* )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(87,36);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR, "EXPR"), root_1);
				dbg.location(87,41);
				adaptor.addChild(root_1, stream_expression.nextTree());dbg.location(87,52);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:87:52: ( exprs )*
				while ( stream_exprs.hasNext() ) {
					dbg.location(87,52);
					adaptor.addChild(root_1, stream_exprs.nextTree());
				}
				stream_exprs.reset();

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
		dbg.location(88, 4);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:90:1: exprBase : ( 'nil' ( WS )? | Variable | Symbol | ( '(' 'cons ' lExpr ')' ) | ( '(' 'list ' lExpr ')' ) | ( '(' 'hd ' exprBase ')' ) | ( '(' 'tl ' exprBase ')' ) | ( '(' Symbol ( WS )? lExpr ')' ) -> ^( EXPRBASE Variable Symbol lExpr ) );
	public final while_astParser.exprBase_return exprBase() throws RecognitionException {
		while_astParser.exprBase_return retval = new while_astParser.exprBase_return();
		retval.start = input.LT(1);

		Object root_0 = null;

<<<<<<< Updated upstream
		Token string_literal88=null;
		Token WS89=null;
		Token Variable90=null;
		Token Symbol91=null;
		Token char_literal92=null;
		Token string_literal93=null;
		Token char_literal95=null;
		Token char_literal96=null;
		Token string_literal97=null;
		Token char_literal99=null;
		Token char_literal100=null;
		Token string_literal101=null;
		Token char_literal103=null;
		Token char_literal104=null;
		Token string_literal105=null;
		Token char_literal107=null;
		Token char_literal108=null;
		Token Symbol109=null;
		Token WS110=null;
		Token char_literal112=null;
		ParserRuleReturnScope lExpr94 =null;
		ParserRuleReturnScope lExpr98 =null;
		ParserRuleReturnScope exprBase102 =null;
		ParserRuleReturnScope exprBase106 =null;
		ParserRuleReturnScope lExpr111 =null;

		Object string_literal88_tree=null;
		Object WS89_tree=null;
		Object Variable90_tree=null;
		Object Symbol91_tree=null;
		Object char_literal92_tree=null;
		Object string_literal93_tree=null;
		Object char_literal95_tree=null;
		Object char_literal96_tree=null;
		Object string_literal97_tree=null;
		Object char_literal99_tree=null;
		Object char_literal100_tree=null;
		Object string_literal101_tree=null;
		Object char_literal103_tree=null;
		Object char_literal104_tree=null;
		Object string_literal105_tree=null;
		Object char_literal107_tree=null;
		Object char_literal108_tree=null;
		Object Symbol109_tree=null;
		Object WS110_tree=null;
		Object char_literal112_tree=null;
		RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
		RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
=======
		ParserRuleReturnScope nil_94 =null;
		ParserRuleReturnScope variable95 =null;
		ParserRuleReturnScope cons96 =null;
		ParserRuleReturnScope list97 =null;
		ParserRuleReturnScope hd98 =null;
		ParserRuleReturnScope tl99 =null;
		ParserRuleReturnScope symbolExpr100 =null;


		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:111:12: ( nil_ | variable | cons | list | hd | tl | symbolExpr )
			int alt41=7;
			alt41 = dfa41.predict(input);
			switch (alt41) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:111:15: nil_
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_nil__in_exprBase1032);
					nil_94=nil_();
					state._fsp--;

					adaptor.addChild(root_0, nil_94.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:112:7: variable
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_variable_in_exprBase1040);
					variable95=variable();
					state._fsp--;

					adaptor.addChild(root_0, variable95.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:113:7: cons
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_cons_in_exprBase1048);
					cons96=cons();
					state._fsp--;

					adaptor.addChild(root_0, cons96.getTree());

					}
					break;
				case 4 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:113:14: list
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_list_in_exprBase1052);
					list97=list();
					state._fsp--;

					adaptor.addChild(root_0, list97.getTree());

					}
					break;
				case 5 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:114:7: hd
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_hd_in_exprBase1060);
					hd98=hd();
					state._fsp--;

					adaptor.addChild(root_0, hd98.getTree());

					}
					break;
				case 6 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:114:12: tl
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_tl_in_exprBase1064);
					tl99=tl();
					state._fsp--;

					adaptor.addChild(root_0, tl99.getTree());

					}
					break;
				case 7 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:115:7: symbolExpr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_symbolExpr_in_exprBase1072);
					symbolExpr100=symbolExpr();
					state._fsp--;

					adaptor.addChild(root_0, symbolExpr100.getTree());

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

		Token string_literal101=null;
		Token WS102=null;

		Object string_literal101_tree=null;
		Object WS102_tree=null;
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:118:6: ( ( 'nil' ( WS )* ) -> 'nil' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:118:8: ( 'nil' ( WS )* )
			{
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:118:8: ( 'nil' ( WS )* )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:118:9: 'nil' ( WS )*
			{
			string_literal101=(Token)match(input,52,FOLLOW_52_in_nil_1091);  
			stream_52.add(string_literal101);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:118:14: ( WS )*
			loop42:
			while (true) {
				int alt42=2;
				int LA42_0 = input.LA(1);
				if ( (LA42_0==WS) ) {
					alt42=1;
				}

				switch (alt42) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:118:14: WS
					{
					WS102=(Token)match(input,WS,FOLLOW_WS_in_nil_1092);  
					stream_WS.add(WS102);

					}
					break;

				default :
					break loop42;
				}
			}

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

		Token Variable103=null;

		Object Variable103_tree=null;
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:120:9: ( Variable -> Variable )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:120:11: Variable
			{
			Variable103=(Token)match(input,Variable,FOLLOW_Variable_in_variable1109);  
			stream_Variable.add(Variable103);

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

		Token char_literal104=null;
		Token WS105=null;
		Token string_literal106=null;
		Token WS108=null;
		Token char_literal109=null;
		ParserRuleReturnScope lExpr107 =null;

		Object char_literal104_tree=null;
		Object WS105_tree=null;
		Object string_literal106_tree=null;
		Object WS108_tree=null;
		Object char_literal109_tree=null;
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleSubtreeStream stream_lExpr=new RewriteRuleSubtreeStream(adaptor,"rule lExpr");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:122:6: ( '(' ( WS )* 'cons ' lExpr ( WS )* ')' -> ^( CONS lExpr ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:122:8: '(' ( WS )* 'cons ' lExpr ( WS )* ')'
			{
			char_literal104=(Token)match(input,34,FOLLOW_34_in_cons1121);  
			stream_34.add(char_literal104);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:122:12: ( WS )*
			loop43:
			while (true) {
				int alt43=2;
				int LA43_0 = input.LA(1);
				if ( (LA43_0==WS) ) {
					alt43=1;
				}

				switch (alt43) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:122:12: WS
					{
					WS105=(Token)match(input,WS,FOLLOW_WS_in_cons1123);  
					stream_WS.add(WS105);

					}
					break;

				default :
					break loop43;
				}
			}

			string_literal106=(Token)match(input,41,FOLLOW_41_in_cons1126);  
			stream_41.add(string_literal106);

			pushFollow(FOLLOW_lExpr_in_cons1128);
			lExpr107=lExpr();
			state._fsp--;

			stream_lExpr.add(lExpr107.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:122:30: ( WS )*
			loop44:
			while (true) {
				int alt44=2;
				int LA44_0 = input.LA(1);
				if ( (LA44_0==WS) ) {
					alt44=1;
				}

				switch (alt44) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:122:30: WS
					{
					WS108=(Token)match(input,WS,FOLLOW_WS_in_cons1130);  
					stream_WS.add(WS108);

					}
					break;

				default :
					break loop44;
				}
			}

			char_literal109=(Token)match(input,35,FOLLOW_35_in_cons1133);  
			stream_35.add(char_literal109);

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
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:122:41: ^( CONS lExpr )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONS, "CONS"), root_1);
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

		Token char_literal110=null;
		Token WS111=null;
		Token string_literal112=null;
		Token WS114=null;
		Token char_literal115=null;
		ParserRuleReturnScope lExpr113 =null;

		Object char_literal110_tree=null;
		Object WS111_tree=null;
		Object string_literal112_tree=null;
		Object WS114_tree=null;
		Object char_literal115_tree=null;
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_lExpr=new RewriteRuleSubtreeStream(adaptor,"rule lExpr");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:124:6: ( '(' ( WS )* 'list ' lExpr ( WS )* ')' -> ^( LIST lExpr ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:124:8: '(' ( WS )* 'list ' lExpr ( WS )* ')'
			{
			char_literal110=(Token)match(input,34,FOLLOW_34_in_list1149);  
			stream_34.add(char_literal110);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:124:11: ( WS )*
			loop45:
			while (true) {
				int alt45=2;
				int LA45_0 = input.LA(1);
				if ( (LA45_0==WS) ) {
					alt45=1;
				}

				switch (alt45) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:124:11: WS
					{
					WS111=(Token)match(input,WS,FOLLOW_WS_in_list1150);  
					stream_WS.add(WS111);

					}
					break;

				default :
					break loop45;
				}
			}

			string_literal112=(Token)match(input,51,FOLLOW_51_in_list1153);  
			stream_51.add(string_literal112);

			pushFollow(FOLLOW_lExpr_in_list1155);
			lExpr113=lExpr();
			state._fsp--;

			stream_lExpr.add(lExpr113.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:124:29: ( WS )*
			loop46:
			while (true) {
				int alt46=2;
				int LA46_0 = input.LA(1);
				if ( (LA46_0==WS) ) {
					alt46=1;
				}

				switch (alt46) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:124:29: WS
					{
					WS114=(Token)match(input,WS,FOLLOW_WS_in_list1157);  
					stream_WS.add(WS114);

					}
					break;

				default :
					break loop46;
				}
			}

			char_literal115=(Token)match(input,35,FOLLOW_35_in_list1160);  
			stream_35.add(char_literal115);

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
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:124:40: ^( LIST lExpr )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);
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

		Token char_literal116=null;
		Token WS117=null;
		Token string_literal118=null;
		Token WS120=null;
		Token char_literal121=null;
		ParserRuleReturnScope exprBase119 =null;

		Object char_literal116_tree=null;
		Object WS117_tree=null;
		Object string_literal118_tree=null;
		Object WS120_tree=null;
		Object char_literal121_tree=null;
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:126:4: ( '(' ( WS )* 'hd ' exprBase ( WS )* ')' -> ^( HD exprBase ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:126:6: '(' ( WS )* 'hd ' exprBase ( WS )* ')'
			{
			char_literal116=(Token)match(input,34,FOLLOW_34_in_hd1176);  
			stream_34.add(char_literal116);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:126:9: ( WS )*
			loop47:
			while (true) {
				int alt47=2;
				int LA47_0 = input.LA(1);
				if ( (LA47_0==WS) ) {
					alt47=1;
				}

				switch (alt47) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:126:9: WS
					{
					WS117=(Token)match(input,WS,FOLLOW_WS_in_hd1177);  
					stream_WS.add(WS117);

					}
					break;

				default :
					break loop47;
				}
			}

			string_literal118=(Token)match(input,48,FOLLOW_48_in_hd1180);  
			stream_48.add(string_literal118);

			pushFollow(FOLLOW_exprBase_in_hd1182);
			exprBase119=exprBase();
			state._fsp--;

			stream_exprBase.add(exprBase119.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:126:28: ( WS )*
			loop48:
			while (true) {
				int alt48=2;
				int LA48_0 = input.LA(1);
				if ( (LA48_0==WS) ) {
					alt48=1;
				}

				switch (alt48) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:126:28: WS
					{
					WS120=(Token)match(input,WS,FOLLOW_WS_in_hd1184);  
					stream_WS.add(WS120);

					}
					break;

				default :
					break loop48;
				}
			}

			char_literal121=(Token)match(input,35,FOLLOW_35_in_hd1186);  
			stream_35.add(char_literal121);

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
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:126:38: ^( HD exprBase )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(HD, "HD"), root_1);
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

		Token char_literal122=null;
		Token WS123=null;
		Token string_literal124=null;
		Token WS126=null;
		Token char_literal127=null;
		ParserRuleReturnScope exprBase125 =null;

		Object char_literal122_tree=null;
		Object WS123_tree=null;
		Object string_literal124_tree=null;
		Object WS126_tree=null;
		Object char_literal127_tree=null;
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:128:4: ( '(' ( WS )* 'tl ' exprBase ( WS )* ')' -> ^( TL exprBase ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:128:6: '(' ( WS )* 'tl ' exprBase ( WS )* ')'
			{
			char_literal122=(Token)match(input,34,FOLLOW_34_in_tl1202);  
			stream_34.add(char_literal122);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:128:10: ( WS )*
			loop49:
			while (true) {
				int alt49=2;
				int LA49_0 = input.LA(1);
				if ( (LA49_0==WS) ) {
					alt49=1;
				}

				switch (alt49) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:128:10: WS
					{
					WS123=(Token)match(input,WS,FOLLOW_WS_in_tl1204);  
					stream_WS.add(WS123);

					}
					break;

				default :
					break loop49;
				}
			}

			string_literal124=(Token)match(input,57,FOLLOW_57_in_tl1206);  
			stream_57.add(string_literal124);

			pushFollow(FOLLOW_exprBase_in_tl1208);
			exprBase125=exprBase();
			state._fsp--;

			stream_exprBase.add(exprBase125.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:128:28: ( WS )*
			loop50:
			while (true) {
				int alt50=2;
				int LA50_0 = input.LA(1);
				if ( (LA50_0==WS) ) {
					alt50=1;
				}

				switch (alt50) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:128:28: WS
					{
					WS126=(Token)match(input,WS,FOLLOW_WS_in_tl1210);  
					stream_WS.add(WS126);

					}
					break;

				default :
					break loop50;
				}
			}

			char_literal127=(Token)match(input,35,FOLLOW_35_in_tl1212);  
			stream_35.add(char_literal127);

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
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:128:38: ^( TL exprBase )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TL, "TL"), root_1);
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

		Token char_literal128=null;
		Token Symbol129=null;
		Token WS130=null;
		Token char_literal132=null;
		ParserRuleReturnScope lExpr131 =null;

		Object char_literal128_tree=null;
		Object Symbol129_tree=null;
		Object WS130_tree=null;
		Object char_literal132_tree=null;
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
>>>>>>> Stashed changes
		RewriteRuleTokenStream stream_Symbol=new RewriteRuleTokenStream(adaptor,"token Symbol");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_lExpr=new RewriteRuleSubtreeStream(adaptor,"rule lExpr");

		try { dbg.enterRule(getGrammarFileName(), "exprBase");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(90, 0);

		try {
<<<<<<< Updated upstream
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:91:5: ( 'nil' ( WS )? | Variable | Symbol | ( '(' 'cons ' lExpr ')' ) | ( '(' 'list ' lExpr ')' ) | ( '(' 'hd ' exprBase ')' ) | ( '(' 'tl ' exprBase ')' ) | ( '(' Symbol ( WS )? lExpr ')' ) -> ^( EXPRBASE Variable Symbol lExpr ) )
			int alt38=8;
			try { dbg.enterDecision(38, decisionCanBacktrack[38]);

			switch ( input.LA(1) ) {
			case 40:
				{
				alt38=1;
				}
				break;
			case Variable:
				{
				alt38=2;
				}
				break;
			case Symbol:
				{
				alt38=3;
				}
				break;
			case 22:
				{
				switch ( input.LA(2) ) {
				case 29:
					{
					alt38=4;
					}
					break;
				case 39:
					{
					alt38=5;
					}
					break;
				case 36:
					{
					alt38=6;
					}
					break;
				case 45:
					{
					alt38=7;
					}
					break;
				case Symbol:
					{
					alt38=8;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 38, 4, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 38, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(38);}

			switch (alt38) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:91:7: 'nil' ( WS )?
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(91,7);
					string_literal88=(Token)match(input,40,FOLLOW_40_in_exprBase805); 
					string_literal88_tree = (Object)adaptor.create(string_literal88);
					adaptor.addChild(root_0, string_literal88_tree);
					dbg.location(91,13);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:91:13: ( WS )?
					int alt36=2;
					try { dbg.enterSubRule(36);
					try { dbg.enterDecision(36, decisionCanBacktrack[36]);

					int LA36_0 = input.LA(1);
					if ( (LA36_0==WS) ) {
						alt36=1;
					}
					} finally {dbg.exitDecision(36);}

					switch (alt36) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:91:13: WS
							{
							dbg.location(91,13);
							WS89=(Token)match(input,WS,FOLLOW_WS_in_exprBase807); 
							WS89_tree = (Object)adaptor.create(WS89);
							adaptor.addChild(root_0, WS89_tree);

							}
							break;

					}
					} finally {dbg.exitSubRule(36);}
=======
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:131:2: ( '(' Symbol ( WS )* ( lExpr )? ')' -> Symbol ( lExpr )? )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:131:4: '(' Symbol ( WS )* ( lExpr )? ')'
			{
			char_literal128=(Token)match(input,34,FOLLOW_34_in_symbolExpr1229);  
			stream_34.add(char_literal128);

			Symbol129=(Token)match(input,Symbol,FOLLOW_Symbol_in_symbolExpr1231);  
			stream_Symbol.add(Symbol129);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:131:15: ( WS )*
			loop51:
			while (true) {
				int alt51=2;
				int LA51_0 = input.LA(1);
				if ( (LA51_0==WS) ) {
					alt51=1;
				}

				switch (alt51) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:131:15: WS
					{
					WS130=(Token)match(input,WS,FOLLOW_WS_in_symbolExpr1233);  
					stream_WS.add(WS130);
>>>>>>> Stashed changes

					}
					break;
				case 2 :
					dbg.enterAlt(2);

<<<<<<< Updated upstream
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:92:7: Variable
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(92,7);
					Variable90=(Token)match(input,Variable,FOLLOW_Variable_in_exprBase816); 
					Variable90_tree = (Object)adaptor.create(Variable90);
					adaptor.addChild(root_0, Variable90_tree);

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:93:7: Symbol
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(93,7);
					Symbol91=(Token)match(input,Symbol,FOLLOW_Symbol_in_exprBase824); 
					Symbol91_tree = (Object)adaptor.create(Symbol91);
					adaptor.addChild(root_0, Symbol91_tree);

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:94:7: ( '(' 'cons ' lExpr ')' )
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(94,7);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:94:7: ( '(' 'cons ' lExpr ')' )
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:94:8: '(' 'cons ' lExpr ')'
					{
					dbg.location(94,8);
					char_literal92=(Token)match(input,22,FOLLOW_22_in_exprBase833); 
					char_literal92_tree = (Object)adaptor.create(char_literal92);
					adaptor.addChild(root_0, char_literal92_tree);
					dbg.location(94,12);
					string_literal93=(Token)match(input,29,FOLLOW_29_in_exprBase835); 
					string_literal93_tree = (Object)adaptor.create(string_literal93);
					adaptor.addChild(root_0, string_literal93_tree);
					dbg.location(94,20);
					pushFollow(FOLLOW_lExpr_in_exprBase837);
					lExpr94=lExpr();
					state._fsp--;

					adaptor.addChild(root_0, lExpr94.getTree());
					dbg.location(94,26);
					char_literal95=(Token)match(input,23,FOLLOW_23_in_exprBase839); 
					char_literal95_tree = (Object)adaptor.create(char_literal95);
					adaptor.addChild(root_0, char_literal95_tree);

					}

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:94:33: ( '(' 'list ' lExpr ')' )
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(94,33);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:94:33: ( '(' 'list ' lExpr ')' )
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:94:34: '(' 'list ' lExpr ')'
					{
					dbg.location(94,34);
					char_literal96=(Token)match(input,22,FOLLOW_22_in_exprBase845); 
					char_literal96_tree = (Object)adaptor.create(char_literal96);
					adaptor.addChild(root_0, char_literal96_tree);
					dbg.location(94,38);
					string_literal97=(Token)match(input,39,FOLLOW_39_in_exprBase847); 
					string_literal97_tree = (Object)adaptor.create(string_literal97);
					adaptor.addChild(root_0, string_literal97_tree);
					dbg.location(94,46);
					pushFollow(FOLLOW_lExpr_in_exprBase849);
					lExpr98=lExpr();
					state._fsp--;

					adaptor.addChild(root_0, lExpr98.getTree());
					dbg.location(94,52);
					char_literal99=(Token)match(input,23,FOLLOW_23_in_exprBase851); 
					char_literal99_tree = (Object)adaptor.create(char_literal99);
					adaptor.addChild(root_0, char_literal99_tree);

					}

					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:95:7: ( '(' 'hd ' exprBase ')' )
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(95,7);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:95:7: ( '(' 'hd ' exprBase ')' )
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:95:8: '(' 'hd ' exprBase ')'
					{
					dbg.location(95,8);
					char_literal100=(Token)match(input,22,FOLLOW_22_in_exprBase861); 
					char_literal100_tree = (Object)adaptor.create(char_literal100);
					adaptor.addChild(root_0, char_literal100_tree);
					dbg.location(95,12);
					string_literal101=(Token)match(input,36,FOLLOW_36_in_exprBase863); 
					string_literal101_tree = (Object)adaptor.create(string_literal101);
					adaptor.addChild(root_0, string_literal101_tree);
					dbg.location(95,18);
					pushFollow(FOLLOW_exprBase_in_exprBase865);
					exprBase102=exprBase();
					state._fsp--;

					adaptor.addChild(root_0, exprBase102.getTree());
					dbg.location(95,27);
					char_literal103=(Token)match(input,23,FOLLOW_23_in_exprBase867); 
					char_literal103_tree = (Object)adaptor.create(char_literal103);
					adaptor.addChild(root_0, char_literal103_tree);

					}

					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:95:34: ( '(' 'tl ' exprBase ')' )
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(95,34);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:95:34: ( '(' 'tl ' exprBase ')' )
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:95:35: '(' 'tl ' exprBase ')'
					{
					dbg.location(95,35);
					char_literal104=(Token)match(input,22,FOLLOW_22_in_exprBase873); 
					char_literal104_tree = (Object)adaptor.create(char_literal104);
					adaptor.addChild(root_0, char_literal104_tree);
					dbg.location(95,39);
					string_literal105=(Token)match(input,45,FOLLOW_45_in_exprBase875); 
					string_literal105_tree = (Object)adaptor.create(string_literal105);
					adaptor.addChild(root_0, string_literal105_tree);
					dbg.location(95,45);
					pushFollow(FOLLOW_exprBase_in_exprBase877);
					exprBase106=exprBase();
					state._fsp--;

					adaptor.addChild(root_0, exprBase106.getTree());
					dbg.location(95,54);
					char_literal107=(Token)match(input,23,FOLLOW_23_in_exprBase879); 
					char_literal107_tree = (Object)adaptor.create(char_literal107);
					adaptor.addChild(root_0, char_literal107_tree);

					}

					}
					break;
				case 8 :
					dbg.enterAlt(8);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:96:7: ( '(' Symbol ( WS )? lExpr ')' )
					{
					dbg.location(96,7);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:96:7: ( '(' Symbol ( WS )? lExpr ')' )
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:96:8: '(' Symbol ( WS )? lExpr ')'
					{
					dbg.location(96,8);
					char_literal108=(Token)match(input,22,FOLLOW_22_in_exprBase889);  
					stream_22.add(char_literal108);
					dbg.location(96,12);
					Symbol109=(Token)match(input,Symbol,FOLLOW_Symbol_in_exprBase891);  
					stream_Symbol.add(Symbol109);
					dbg.location(96,19);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:96:19: ( WS )?
					int alt37=2;
					try { dbg.enterSubRule(37);
					try { dbg.enterDecision(37, decisionCanBacktrack[37]);

					int LA37_0 = input.LA(1);
					if ( (LA37_0==WS) ) {
						alt37=1;
					}
					} finally {dbg.exitDecision(37);}

					switch (alt37) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:96:19: WS
							{
							dbg.location(96,19);
							WS110=(Token)match(input,WS,FOLLOW_WS_in_exprBase893);  
							stream_WS.add(WS110);

							}
							break;

					}
					} finally {dbg.exitSubRule(37);}
					dbg.location(96,23);
					pushFollow(FOLLOW_lExpr_in_exprBase896);
					lExpr111=lExpr();
					state._fsp--;

					stream_lExpr.add(lExpr111.getTree());dbg.location(96,29);
					char_literal112=(Token)match(input,23,FOLLOW_23_in_exprBase898);  
					stream_23.add(char_literal112);

					}

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
					// 96:34: -> ^( EXPRBASE Variable Symbol lExpr )
					{
						dbg.location(96,37);
						// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:96:37: ^( EXPRBASE Variable Symbol lExpr )
						{
						Object root_1 = (Object)adaptor.nil();
						dbg.location(96,39);
						root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPRBASE, "EXPRBASE"), root_1);
						dbg.location(96,48);
						adaptor.addChild(root_1, (Object)adaptor.create(Variable, "Variable"));dbg.location(96,57);
						adaptor.addChild(root_1, stream_Symbol.nextNode());dbg.location(96,64);
						adaptor.addChild(root_1, stream_lExpr.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

=======
				default :
					break loop51;
				}
			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:131:19: ( lExpr )?
			int alt52=2;
			int LA52_0 = input.LA(1);
			if ( (LA52_0==Variable||LA52_0==34||LA52_0==52) ) {
				alt52=1;
			}
			switch (alt52) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:131:19: lExpr
					{
					pushFollow(FOLLOW_lExpr_in_symbolExpr1236);
					lExpr131=lExpr();
					state._fsp--;

					stream_lExpr.add(lExpr131.getTree());
>>>>>>> Stashed changes
					}
					break;

			}
<<<<<<< Updated upstream
=======

			char_literal132=(Token)match(input,35,FOLLOW_35_in_symbolExpr1239);  
			stream_35.add(char_literal132);

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
				adaptor.addChild(root_0, stream_Symbol.nextNode());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:131:40: ( lExpr )?
				if ( stream_lExpr.hasNext() ) {
					adaptor.addChild(root_0, stream_lExpr.nextTree());
				}
				stream_lExpr.reset();

			}


			retval.tree = root_0;

			}

>>>>>>> Stashed changes
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
			dbg.exitRule(getGrammarFileName(), "exprBase");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "exprBase"


	public static class expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:1: expression : exprBase ( WS )? ( '=?' ( WS )? exprBase )? -> ^( EXPR exprBase ) ;
	public final while_astParser.expression_return expression() throws RecognitionException {
		while_astParser.expression_return retval = new while_astParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

<<<<<<< Updated upstream
		Token WS114=null;
		Token string_literal115=null;
		Token WS116=null;
		ParserRuleReturnScope exprBase113 =null;
		ParserRuleReturnScope exprBase117 =null;

		Object WS114_tree=null;
		Object string_literal115_tree=null;
		Object WS116_tree=null;
		RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
=======
		Token WS134=null;
		Token string_literal135=null;
		Token WS136=null;
		ParserRuleReturnScope lExpr133 =null;
		ParserRuleReturnScope lExpr137 =null;

		Object WS134_tree=null;
		Object string_literal135_tree=null;
		Object WS136_tree=null;
>>>>>>> Stashed changes
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");

		try { dbg.enterRule(getGrammarFileName(), "expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(99, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:100:5: ( exprBase ( WS )? ( '=?' ( WS )? exprBase )? -> ^( EXPR exprBase ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:100:7: exprBase ( WS )? ( '=?' ( WS )? exprBase )?
			{
<<<<<<< Updated upstream
			dbg.location(100,7);
			pushFollow(FOLLOW_exprBase_in_expression928);
			exprBase113=exprBase();
			state._fsp--;

			stream_exprBase.add(exprBase113.getTree());dbg.location(100,16);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:100:16: ( WS )?
			int alt39=2;
			try { dbg.enterSubRule(39);
			try { dbg.enterDecision(39, decisionCanBacktrack[39]);

			int LA39_0 = input.LA(1);
			if ( (LA39_0==WS) ) {
				alt39=1;
			}
			} finally {dbg.exitDecision(39);}

			switch (alt39) {
=======
			pushFollow(FOLLOW_lExpr_in_expression1258);
			lExpr133=lExpr();
			state._fsp--;

			stream_lExpr.add(lExpr133.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:134:13: ( WS )*
			loop53:
			while (true) {
				int alt53=2;
				int LA53_0 = input.LA(1);
				if ( (LA53_0==WS) ) {
					alt53=1;
				}

				switch (alt53) {
>>>>>>> Stashed changes
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:100:16: WS
					{
<<<<<<< Updated upstream
					dbg.location(100,16);
					WS114=(Token)match(input,WS,FOLLOW_WS_in_expression930);  
					stream_WS.add(WS114);
=======
					WS134=(Token)match(input,WS,FOLLOW_WS_in_expression1260);  
					stream_WS.add(WS134);
>>>>>>> Stashed changes

					}
					break;

<<<<<<< Updated upstream
=======
				default :
					break loop53;
				}
>>>>>>> Stashed changes
			}
			} finally {dbg.exitSubRule(39);}
			dbg.location(100,19);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:100:19: ( '=?' ( WS )? exprBase )?
			int alt41=2;
			try { dbg.enterSubRule(41);
			try { dbg.enterDecision(41, decisionCanBacktrack[41]);

<<<<<<< Updated upstream
			int LA41_0 = input.LA(1);
			if ( (LA41_0==28) ) {
				alt41=1;
			}
			} finally {dbg.exitDecision(41);}

			switch (alt41) {
=======
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:134:16: ( '=?' ( WS )* lExpr )?
			int alt55=2;
			int LA55_0 = input.LA(1);
			if ( (LA55_0==40) ) {
				alt55=1;
			}
			switch (alt55) {
>>>>>>> Stashed changes
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:100:20: '=?' ( WS )? exprBase
					{
<<<<<<< Updated upstream
					dbg.location(100,20);
					string_literal115=(Token)match(input,28,FOLLOW_28_in_expression933);  
					stream_28.add(string_literal115);
					dbg.location(100,25);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:100:25: ( WS )?
					int alt40=2;
					try { dbg.enterSubRule(40);
					try { dbg.enterDecision(40, decisionCanBacktrack[40]);

					int LA40_0 = input.LA(1);
					if ( (LA40_0==WS) ) {
						alt40=1;
					}
					} finally {dbg.exitDecision(40);}

					switch (alt40) {
=======
					string_literal135=(Token)match(input,40,FOLLOW_40_in_expression1263);  
					stream_40.add(string_literal135);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:134:22: ( WS )*
					loop54:
					while (true) {
						int alt54=2;
						int LA54_0 = input.LA(1);
						if ( (LA54_0==WS) ) {
							alt54=1;
						}

						switch (alt54) {
>>>>>>> Stashed changes
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:100:25: WS
							{
<<<<<<< Updated upstream
							dbg.location(100,25);
							WS116=(Token)match(input,WS,FOLLOW_WS_in_expression935);  
							stream_WS.add(WS116);
=======
							WS136=(Token)match(input,WS,FOLLOW_WS_in_expression1265);  
							stream_WS.add(WS136);
>>>>>>> Stashed changes

							}
							break;

<<<<<<< Updated upstream
					}
					} finally {dbg.exitSubRule(40);}
					dbg.location(100,29);
					pushFollow(FOLLOW_exprBase_in_expression938);
					exprBase117=exprBase();
					state._fsp--;

					stream_exprBase.add(exprBase117.getTree());
=======
						default :
							break loop54;
						}
					}

					pushFollow(FOLLOW_lExpr_in_expression1268);
					lExpr137=lExpr();
					state._fsp--;

					stream_lExpr.add(lExpr137.getTree());
>>>>>>> Stashed changes
					}
					break;

			}
			} finally {dbg.exitSubRule(41);}

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
			// 100:40: -> ^( EXPR exprBase )
			{
				dbg.location(100,43);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:100:43: ^( EXPR exprBase )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(100,45);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR, "EXPR"), root_1);
				dbg.location(100,50);
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
		dbg.location(101, 4);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:104:1: lExpr : exprBase ( WS )? ( lExpr )? ;
	public final while_astParser.lExpr_return lExpr() throws RecognitionException {
		while_astParser.lExpr_return retval = new while_astParser.lExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

<<<<<<< Updated upstream
		Token WS119=null;
		ParserRuleReturnScope exprBase118 =null;
		ParserRuleReturnScope lExpr120 =null;

		Object WS119_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "lExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(104, 0);
=======
		Token WS139=null;
		ParserRuleReturnScope exprBase138 =null;
		ParserRuleReturnScope lExpr140 =null;

		Object WS139_tree=null;
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");
		RewriteRuleSubtreeStream stream_lExpr=new RewriteRuleSubtreeStream(adaptor,"rule lExpr");
>>>>>>> Stashed changes

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:105:5: ( exprBase ( WS )? ( lExpr )? )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:105:7: exprBase ( WS )? ( lExpr )?
			{
<<<<<<< Updated upstream
			root_0 = (Object)adaptor.nil();


			dbg.location(105,7);
			pushFollow(FOLLOW_exprBase_in_lExpr969);
			exprBase118=exprBase();
			state._fsp--;

			adaptor.addChild(root_0, exprBase118.getTree());
			dbg.location(105,16);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:105:16: ( WS )?
			int alt42=2;
			try { dbg.enterSubRule(42);
			try { dbg.enterDecision(42, decisionCanBacktrack[42]);

			int LA42_0 = input.LA(1);
			if ( (LA42_0==WS) ) {
				alt42=1;
			}
			} finally {dbg.exitDecision(42);}

			switch (alt42) {
=======
			pushFollow(FOLLOW_exprBase_in_lExpr1302);
			exprBase138=exprBase();
			state._fsp--;

			stream_exprBase.add(exprBase138.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:139:16: ( WS )*
			loop56:
			while (true) {
				int alt56=2;
				int LA56_0 = input.LA(1);
				if ( (LA56_0==WS) ) {
					alt56=1;
				}

				switch (alt56) {
>>>>>>> Stashed changes
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:105:16: WS
					{
<<<<<<< Updated upstream
					dbg.location(105,16);
					WS119=(Token)match(input,WS,FOLLOW_WS_in_lExpr971); 
					WS119_tree = (Object)adaptor.create(WS119);
					adaptor.addChild(root_0, WS119_tree);
=======
					WS139=(Token)match(input,WS,FOLLOW_WS_in_lExpr1304);  
					stream_WS.add(WS139);
>>>>>>> Stashed changes

					}
					break;

<<<<<<< Updated upstream
=======
				default :
					break loop56;
				}
>>>>>>> Stashed changes
			}
			} finally {dbg.exitSubRule(42);}
			dbg.location(105,20);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:105:20: ( lExpr )?
			int alt43=2;
			try { dbg.enterSubRule(43);
			try { dbg.enterDecision(43, decisionCanBacktrack[43]);

<<<<<<< Updated upstream
			int LA43_0 = input.LA(1);
			if ( (LA43_0==Symbol||LA43_0==Variable||LA43_0==22||LA43_0==40) ) {
				alt43=1;
			}
			} finally {dbg.exitDecision(43);}

			switch (alt43) {
=======
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:139:20: ( lExpr )?
			int alt57=2;
			int LA57_0 = input.LA(1);
			if ( (LA57_0==Variable||LA57_0==34||LA57_0==52) ) {
				alt57=1;
			}
			switch (alt57) {
>>>>>>> Stashed changes
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:105:20: lExpr
					{
<<<<<<< Updated upstream
					dbg.location(105,20);
					pushFollow(FOLLOW_lExpr_in_lExpr974);
					lExpr120=lExpr();
					state._fsp--;

					adaptor.addChild(root_0, lExpr120.getTree());

=======
					pushFollow(FOLLOW_lExpr_in_lExpr1307);
					lExpr140=lExpr();
					state._fsp--;

					stream_lExpr.add(lExpr140.getTree());
>>>>>>> Stashed changes
					}
					break;

			}
			} finally {dbg.exitSubRule(43);}

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
		dbg.location(106, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "lExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "lExpr"


	public static class startProgram_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "startProgram"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:108:1: startProgram : program ;
	public final while_astParser.startProgram_return startProgram() throws RecognitionException {
		while_astParser.startProgram_return retval = new while_astParser.startProgram_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope program121 =null;


		try { dbg.enterRule(getGrammarFileName(), "startProgram");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(108, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:109:5: ( program )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:109:7: program
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(109,7);
			pushFollow(FOLLOW_program_in_startProgram992);
			program121=program();
			state._fsp--;

			adaptor.addChild(root_0, program121.getTree());

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
		dbg.location(110, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "startProgram");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "startProgram"

	// Delegated rules


<<<<<<< Updated upstream

	public static final BitSet FOLLOW_function_in_program242 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_program_in_program244 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_function262 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Symbol_in_function264 = new BitSet(new long[]{0x0000000002100000L});
	public static final BitSet FOLLOW_WS_in_function266 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_function269 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_definition_in_function271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_definition298 = new BitSet(new long[]{0x0000000000340000L});
	public static final BitSet FOLLOW_WS_in_definition300 = new BitSet(new long[]{0x0000000000240000L});
	public static final BitSet FOLLOW_input_in_definition303 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_definition305 = new BitSet(new long[]{0x0000422400040000L});
	public static final BitSet FOLLOW_commands_in_definition307 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_definition309 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_definition311 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_output_in_definition313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inputSub_in_input342 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_inputSub360 = new BitSet(new long[]{0x0000000001100002L});
	public static final BitSet FOLLOW_WS_in_inputSub362 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_24_in_inputSub366 = new BitSet(new long[]{0x0000000000140000L});
	public static final BitSet FOLLOW_WS_in_inputSub368 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_inputSub_in_inputSub371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_output390 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_24_in_output393 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_output_in_output395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_in_commands414 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_27_in_commands417 = new BitSet(new long[]{0x0000422400040000L});
	public static final BitSet FOLLOW_commands_in_commands419 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_command438 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decl_in_command442 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if__in_command446 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_while__in_command450 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foreach__in_command454 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vars_in_decl472 = new BitSet(new long[]{0x0000000004100000L});
	public static final BitSet FOLLOW_WS_in_decl474 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_decl477 = new BitSet(new long[]{0x0000010000548000L});
	public static final BitSet FOLLOW_WS_in_decl479 = new BitSet(new long[]{0x0000010000448000L});
	public static final BitSet FOLLOW_exprs_in_decl482 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_if_511 = new BitSet(new long[]{0x0000010000548000L});
	public static final BitSet FOLLOW_WS_in_if_513 = new BitSet(new long[]{0x0000010000448000L});
	public static final BitSet FOLLOW_expression_in_if_516 = new BitSet(new long[]{0x0000100000100000L});
	public static final BitSet FOLLOW_WS_in_if_518 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_if_521 = new BitSet(new long[]{0x0000422400140000L});
	public static final BitSet FOLLOW_WS_in_if_523 = new BitSet(new long[]{0x0000422400040000L});
	public static final BitSet FOLLOW_commands_in_if_526 = new BitSet(new long[]{0x0000000180100000L});
	public static final BitSet FOLLOW_WS_in_if_528 = new BitSet(new long[]{0x0000000180100000L});
	public static final BitSet FOLLOW_31_in_if_532 = new BitSet(new long[]{0x0000422400140000L});
	public static final BitSet FOLLOW_WS_in_if_534 = new BitSet(new long[]{0x0000422400040000L});
	public static final BitSet FOLLOW_commands_in_if_537 = new BitSet(new long[]{0x0000000100100000L});
	public static final BitSet FOLLOW_WS_in_if_541 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_if_544 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_while_573 = new BitSet(new long[]{0x0000010000548000L});
	public static final BitSet FOLLOW_WS_in_while_575 = new BitSet(new long[]{0x0000010000448000L});
	public static final BitSet FOLLOW_expression_in_while_578 = new BitSet(new long[]{0x0000000040100000L});
	public static final BitSet FOLLOW_WS_in_while_580 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_while_583 = new BitSet(new long[]{0x0000422400140000L});
	public static final BitSet FOLLOW_WS_in_while_585 = new BitSet(new long[]{0x0000422400040000L});
	public static final BitSet FOLLOW_commands_in_while_588 = new BitSet(new long[]{0x0000040000100000L});
	public static final BitSet FOLLOW_WS_in_while_590 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_while_593 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_for_622 = new BitSet(new long[]{0x0000010000548000L});
	public static final BitSet FOLLOW_WS_in_for_624 = new BitSet(new long[]{0x0000010000448000L});
	public static final BitSet FOLLOW_expression_in_for_627 = new BitSet(new long[]{0x0000000040100000L});
	public static final BitSet FOLLOW_WS_in_for_629 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_for_632 = new BitSet(new long[]{0x0000422400140000L});
	public static final BitSet FOLLOW_WS_in_for_634 = new BitSet(new long[]{0x0000422400040000L});
	public static final BitSet FOLLOW_commands_in_for_637 = new BitSet(new long[]{0x0000040000100000L});
	public static final BitSet FOLLOW_WS_in_for_639 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_for_642 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_foreach_671 = new BitSet(new long[]{0x0000000000140000L});
	public static final BitSet FOLLOW_WS_in_foreach_673 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_Variable_in_foreach_676 = new BitSet(new long[]{0x0000004000100000L});
	public static final BitSet FOLLOW_WS_in_foreach_678 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_foreach_681 = new BitSet(new long[]{0x0000010000548000L});
	public static final BitSet FOLLOW_WS_in_foreach_683 = new BitSet(new long[]{0x0000010000448000L});
	public static final BitSet FOLLOW_expression_in_foreach_686 = new BitSet(new long[]{0x0000000040100000L});
	public static final BitSet FOLLOW_WS_in_foreach_688 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_foreach_691 = new BitSet(new long[]{0x0000422400140000L});
	public static final BitSet FOLLOW_WS_in_foreach_693 = new BitSet(new long[]{0x0000422400040000L});
	public static final BitSet FOLLOW_commands_in_foreach_696 = new BitSet(new long[]{0x0000040000100000L});
	public static final BitSet FOLLOW_WS_in_foreach_698 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_foreach_701 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_vars735 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_24_in_vars738 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_vars_in_vars740 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_exprs770 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_24_in_exprs773 = new BitSet(new long[]{0x0000010000448000L});
	public static final BitSet FOLLOW_exprs_in_exprs775 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_exprBase805 = new BitSet(new long[]{0x0000000000100002L});
	public static final BitSet FOLLOW_WS_in_exprBase807 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_exprBase816 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Symbol_in_exprBase824 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_exprBase833 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_exprBase835 = new BitSet(new long[]{0x0000010000448000L});
	public static final BitSet FOLLOW_lExpr_in_exprBase837 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_exprBase839 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_exprBase845 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_exprBase847 = new BitSet(new long[]{0x0000010000448000L});
	public static final BitSet FOLLOW_lExpr_in_exprBase849 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_exprBase851 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_exprBase861 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_exprBase863 = new BitSet(new long[]{0x0000010000448000L});
	public static final BitSet FOLLOW_exprBase_in_exprBase865 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_exprBase867 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_exprBase873 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_exprBase875 = new BitSet(new long[]{0x0000010000448000L});
	public static final BitSet FOLLOW_exprBase_in_exprBase877 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_exprBase879 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_exprBase889 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Symbol_in_exprBase891 = new BitSet(new long[]{0x0000010000548000L});
	public static final BitSet FOLLOW_WS_in_exprBase893 = new BitSet(new long[]{0x0000010000448000L});
	public static final BitSet FOLLOW_lExpr_in_exprBase896 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_exprBase898 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprBase_in_expression928 = new BitSet(new long[]{0x0000000010100002L});
	public static final BitSet FOLLOW_WS_in_expression930 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_28_in_expression933 = new BitSet(new long[]{0x0000010000548000L});
	public static final BitSet FOLLOW_WS_in_expression935 = new BitSet(new long[]{0x0000010000448000L});
	public static final BitSet FOLLOW_exprBase_in_expression938 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprBase_in_lExpr969 = new BitSet(new long[]{0x0000010000548002L});
	public static final BitSet FOLLOW_WS_in_lExpr971 = new BitSet(new long[]{0x0000010000448002L});
	public static final BitSet FOLLOW_lExpr_in_lExpr974 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_program_in_startProgram992 = new BitSet(new long[]{0x0000000000000002L});
=======
	protected DFA15 dfa15 = new DFA15(this);
	protected DFA41 dfa41 = new DFA41(this);
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
	}

	static final String DFA41_eotS =
		"\12\uffff";
	static final String DFA41_eofS =
		"\12\uffff";
	static final String DFA41_minS =
		"\1\36\2\uffff\1\31\1\uffff\1\40\4\uffff";
	static final String DFA41_maxS =
		"\1\64\2\uffff\1\71\1\uffff\1\71\4\uffff";
	static final String DFA41_acceptS =
		"\1\uffff\1\1\1\2\1\uffff\1\7\1\uffff\1\3\1\4\1\5\1\6";
	static final String DFA41_specialS =
		"\12\uffff}>";
	static final String[] DFA41_transitionS = {
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

	static final short[] DFA41_eot = DFA.unpackEncodedString(DFA41_eotS);
	static final short[] DFA41_eof = DFA.unpackEncodedString(DFA41_eofS);
	static final char[] DFA41_min = DFA.unpackEncodedStringToUnsignedChars(DFA41_minS);
	static final char[] DFA41_max = DFA.unpackEncodedStringToUnsignedChars(DFA41_maxS);
	static final short[] DFA41_accept = DFA.unpackEncodedString(DFA41_acceptS);
	static final short[] DFA41_special = DFA.unpackEncodedString(DFA41_specialS);
	static final short[][] DFA41_transition;

	static {
		int numStates = DFA41_transitionS.length;
		DFA41_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA41_transition[i] = DFA.unpackEncodedString(DFA41_transitionS[i]);
		}
	}

	protected class DFA41 extends DFA {

		public DFA41(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 41;
			this.eot = DFA41_eot;
			this.eof = DFA41_eof;
			this.min = DFA41_min;
			this.max = DFA41_max;
			this.accept = DFA41_accept;
			this.special = DFA41_special;
			this.transition = DFA41_transition;
		}
		@Override
		public String getDescription() {
			return "111:1: exprBase : ( nil_ | variable | cons | list | hd | tl | symbolExpr );";
		}
	}

	public static final BitSet FOLLOW_program_in_startProgram201 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_in_program355 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_program_in_program357 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_function386 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_Symbol_in_function388 = new BitSet(new long[]{0x0000002100000000L});
	public static final BitSet FOLLOW_WS_in_function390 = new BitSet(new long[]{0x0000002100000000L});
	public static final BitSet FOLLOW_37_in_function393 = new BitSet(new long[]{0x0080000100000000L});
	public static final BitSet FOLLOW_WS_in_function395 = new BitSet(new long[]{0x0080000100000000L});
	public static final BitSet FOLLOW_definition_in_function398 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_definition427 = new BitSet(new long[]{0x0000000340000000L});
	public static final BitSet FOLLOW_WS_in_definition429 = new BitSet(new long[]{0x0000000340000000L});
	public static final BitSet FOLLOW_input_in_definition432 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_definition434 = new BitSet(new long[]{0x0422600140000000L});
	public static final BitSet FOLLOW_WS_in_definition436 = new BitSet(new long[]{0x0422600140000000L});
	public static final BitSet FOLLOW_commands_in_definition439 = new BitSet(new long[]{0x0000000300000000L});
	public static final BitSet FOLLOW_WS_in_definition441 = new BitSet(new long[]{0x0000000300000000L});
	public static final BitSet FOLLOW_33_in_definition443 = new BitSet(new long[]{0x0800000100000000L});
	public static final BitSet FOLLOW_WS_in_definition445 = new BitSet(new long[]{0x0800000100000000L});
	public static final BitSet FOLLOW_59_in_definition448 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_output_in_definition450 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inputSub_in_input479 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_inputSub507 = new BitSet(new long[]{0x0000001100000002L});
	public static final BitSet FOLLOW_WS_in_inputSub509 = new BitSet(new long[]{0x0000001100000002L});
	public static final BitSet FOLLOW_36_in_inputSub513 = new BitSet(new long[]{0x0000000140000000L});
	public static final BitSet FOLLOW_WS_in_inputSub515 = new BitSet(new long[]{0x0000000140000000L});
	public static final BitSet FOLLOW_inputSub_in_inputSub518 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_output544 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_36_in_output547 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_output_in_output549 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_in_commands579 = new BitSet(new long[]{0x0000008100000002L});
	public static final BitSet FOLLOW_WS_in_commands583 = new BitSet(new long[]{0x0000008100000000L});
	public static final BitSet FOLLOW_39_in_commands586 = new BitSet(new long[]{0x0422600140000000L});
	public static final BitSet FOLLOW_WS_in_commands588 = new BitSet(new long[]{0x0422600140000000L});
	public static final BitSet FOLLOW_commands_in_commands591 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_command618 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decl_in_command622 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if__in_command626 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_for__in_command630 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_while__in_command634 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foreach__in_command638 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vars_in_decl652 = new BitSet(new long[]{0x0000004100000000L});
	public static final BitSet FOLLOW_WS_in_decl654 = new BitSet(new long[]{0x0000004100000000L});
	public static final BitSet FOLLOW_38_in_decl657 = new BitSet(new long[]{0x0010000540000000L});
	public static final BitSet FOLLOW_WS_in_decl659 = new BitSet(new long[]{0x0010000540000000L});
	public static final BitSet FOLLOW_exprs_in_decl662 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_if_691 = new BitSet(new long[]{0x0010000540000000L});
	public static final BitSet FOLLOW_WS_in_if_693 = new BitSet(new long[]{0x0010000540000000L});
	public static final BitSet FOLLOW_expression_in_if_696 = new BitSet(new long[]{0x0100000100000000L});
	public static final BitSet FOLLOW_WS_in_if_698 = new BitSet(new long[]{0x0100000100000000L});
	public static final BitSet FOLLOW_then__in_if_701 = new BitSet(new long[]{0x0000180100000000L});
	public static final BitSet FOLLOW_WS_in_if_704 = new BitSet(new long[]{0x0000180100000000L});
	public static final BitSet FOLLOW_else__in_if_707 = new BitSet(new long[]{0x0000100100000000L});
	public static final BitSet FOLLOW_WS_in_if_709 = new BitSet(new long[]{0x0000100100000000L});
	public static final BitSet FOLLOW_44_in_if_712 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_then_745 = new BitSet(new long[]{0x0422600140000000L});
	public static final BitSet FOLLOW_WS_in_then_747 = new BitSet(new long[]{0x0422600140000000L});
	public static final BitSet FOLLOW_commands_in_then_750 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_WS_in_then_752 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_43_in_else_770 = new BitSet(new long[]{0x0422600140000000L});
	public static final BitSet FOLLOW_WS_in_else_772 = new BitSet(new long[]{0x0422600140000000L});
	public static final BitSet FOLLOW_commands_in_else_775 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_while_798 = new BitSet(new long[]{0x0010000540000000L});
	public static final BitSet FOLLOW_WS_in_while_800 = new BitSet(new long[]{0x0010000540000000L});
	public static final BitSet FOLLOW_expression_in_while_803 = new BitSet(new long[]{0x0000040100000000L});
	public static final BitSet FOLLOW_WS_in_while_805 = new BitSet(new long[]{0x0000040100000000L});
	public static final BitSet FOLLOW_do__in_while_808 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_do_839 = new BitSet(new long[]{0x0422600140000000L});
	public static final BitSet FOLLOW_WS_in_do_841 = new BitSet(new long[]{0x0422600140000000L});
	public static final BitSet FOLLOW_commands_in_do_844 = new BitSet(new long[]{0x0040000100000000L});
	public static final BitSet FOLLOW_WS_in_do_846 = new BitSet(new long[]{0x0040000100000000L});
	public static final BitSet FOLLOW_54_in_do_849 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_for_870 = new BitSet(new long[]{0x0010000540000000L});
	public static final BitSet FOLLOW_WS_in_for_872 = new BitSet(new long[]{0x0010000540000000L});
	public static final BitSet FOLLOW_expression_in_for_875 = new BitSet(new long[]{0x0000040100000000L});
	public static final BitSet FOLLOW_WS_in_for_877 = new BitSet(new long[]{0x0000040100000000L});
	public static final BitSet FOLLOW_do__in_for_880 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_foreach_911 = new BitSet(new long[]{0x0000000140000000L});
	public static final BitSet FOLLOW_WS_in_foreach_913 = new BitSet(new long[]{0x0000000140000000L});
	public static final BitSet FOLLOW_Variable_in_foreach_916 = new BitSet(new long[]{0x0004000100000000L});
	public static final BitSet FOLLOW_WS_in_foreach_918 = new BitSet(new long[]{0x0004000100000000L});
	public static final BitSet FOLLOW_50_in_foreach_921 = new BitSet(new long[]{0x0010000540000000L});
	public static final BitSet FOLLOW_WS_in_foreach_923 = new BitSet(new long[]{0x0010000540000000L});
	public static final BitSet FOLLOW_expression_in_foreach_926 = new BitSet(new long[]{0x0000040100000000L});
	public static final BitSet FOLLOW_WS_in_foreach_928 = new BitSet(new long[]{0x0000040100000000L});
	public static final BitSet FOLLOW_do__in_foreach_931 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_vars967 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_36_in_vars970 = new BitSet(new long[]{0x0000000140000000L});
	public static final BitSet FOLLOW_WS_in_vars971 = new BitSet(new long[]{0x0000000140000000L});
	public static final BitSet FOLLOW_vars_in_vars974 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_exprs1000 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_36_in_exprs1003 = new BitSet(new long[]{0x0010000540000000L});
	public static final BitSet FOLLOW_WS_in_exprs1004 = new BitSet(new long[]{0x0010000540000000L});
	public static final BitSet FOLLOW_exprs_in_exprs1007 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nil__in_exprBase1032 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_exprBase1040 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cons_in_exprBase1048 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_list_in_exprBase1052 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_hd_in_exprBase1060 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tl_in_exprBase1064 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_symbolExpr_in_exprBase1072 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_nil_1091 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_WS_in_nil_1092 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_Variable_in_variable1109 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_cons1121 = new BitSet(new long[]{0x0000020100000000L});
	public static final BitSet FOLLOW_WS_in_cons1123 = new BitSet(new long[]{0x0000020100000000L});
	public static final BitSet FOLLOW_41_in_cons1126 = new BitSet(new long[]{0x0010000440000000L});
	public static final BitSet FOLLOW_lExpr_in_cons1128 = new BitSet(new long[]{0x0000000900000000L});
	public static final BitSet FOLLOW_WS_in_cons1130 = new BitSet(new long[]{0x0000000900000000L});
	public static final BitSet FOLLOW_35_in_cons1133 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_list1149 = new BitSet(new long[]{0x0008000100000000L});
	public static final BitSet FOLLOW_WS_in_list1150 = new BitSet(new long[]{0x0008000100000000L});
	public static final BitSet FOLLOW_51_in_list1153 = new BitSet(new long[]{0x0010000440000000L});
	public static final BitSet FOLLOW_lExpr_in_list1155 = new BitSet(new long[]{0x0000000900000000L});
	public static final BitSet FOLLOW_WS_in_list1157 = new BitSet(new long[]{0x0000000900000000L});
	public static final BitSet FOLLOW_35_in_list1160 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_hd1176 = new BitSet(new long[]{0x0001000100000000L});
	public static final BitSet FOLLOW_WS_in_hd1177 = new BitSet(new long[]{0x0001000100000000L});
	public static final BitSet FOLLOW_48_in_hd1180 = new BitSet(new long[]{0x0010000440000000L});
	public static final BitSet FOLLOW_exprBase_in_hd1182 = new BitSet(new long[]{0x0000000900000000L});
	public static final BitSet FOLLOW_WS_in_hd1184 = new BitSet(new long[]{0x0000000900000000L});
	public static final BitSet FOLLOW_35_in_hd1186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_tl1202 = new BitSet(new long[]{0x0200000100000000L});
	public static final BitSet FOLLOW_WS_in_tl1204 = new BitSet(new long[]{0x0200000100000000L});
	public static final BitSet FOLLOW_57_in_tl1206 = new BitSet(new long[]{0x0010000440000000L});
	public static final BitSet FOLLOW_exprBase_in_tl1208 = new BitSet(new long[]{0x0000000900000000L});
	public static final BitSet FOLLOW_WS_in_tl1210 = new BitSet(new long[]{0x0000000900000000L});
	public static final BitSet FOLLOW_35_in_tl1212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_34_in_symbolExpr1229 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_Symbol_in_symbolExpr1231 = new BitSet(new long[]{0x0010000D40000000L});
	public static final BitSet FOLLOW_WS_in_symbolExpr1233 = new BitSet(new long[]{0x0010000D40000000L});
	public static final BitSet FOLLOW_lExpr_in_symbolExpr1236 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_symbolExpr1239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lExpr_in_expression1258 = new BitSet(new long[]{0x0000010100000002L});
	public static final BitSet FOLLOW_WS_in_expression1260 = new BitSet(new long[]{0x0000010100000002L});
	public static final BitSet FOLLOW_40_in_expression1263 = new BitSet(new long[]{0x0010000540000000L});
	public static final BitSet FOLLOW_WS_in_expression1265 = new BitSet(new long[]{0x0010000540000000L});
	public static final BitSet FOLLOW_lExpr_in_expression1268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprBase_in_lExpr1302 = new BitSet(new long[]{0x0010000540000002L});
	public static final BitSet FOLLOW_WS_in_lExpr1304 = new BitSet(new long[]{0x0010000540000002L});
	public static final BitSet FOLLOW_lExpr_in_lExpr1307 = new BitSet(new long[]{0x0000000000000002L});
>>>>>>> Stashed changes
}

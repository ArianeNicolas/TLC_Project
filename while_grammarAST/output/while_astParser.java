// $ANTLR 3.5.1 C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g 2023-11-14 18:01:28

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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "Dec", "EXPR", "FOR", "FOREACH", 
		"FUNCDEF", "IF", "IN", "Maj", "Min", "Symbol", "VARDEF", "VARIABLES", 
		"Variable", "WHILE", "WS", "'%'", "'('", "')'", "','", "':'", "':='", 
		"';'", "'=?'", "'cons '", "'do'", "'else'", "'fi'", "'for'", "'foreach'", 
		"'function '", "'hd '", "'if'", "'in'", "'list '", "'nil'", "'nop'", "'od'", 
		"'read'", "'then'", "'tl '", "'while'", "'write '"
	};
	public static final int EOF=-1;
	public static final int T__19=19;
	public static final int T__20=20;
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
	public static final int Dec=4;
	public static final int EXPR=5;
	public static final int FOR=6;
	public static final int FOREACH=7;
	public static final int FUNCDEF=8;
	public static final int IF=9;
	public static final int IN=10;
	public static final int Maj=11;
	public static final int Min=12;
	public static final int Symbol=13;
	public static final int VARDEF=14;
	public static final int VARIABLES=15;
	public static final int Variable=16;
	public static final int WHILE=17;
	public static final int WS=18;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "if", "lExpr", "definition", "exprs", "inputSub", "for", 
		"decl", "vars", "startProgram", "input", "output", "while", "function", 
		"program", "commands", "command", "foreach", "exprBase", "expression"
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:27:1: program : function ( program )? ;
	public final while_astParser.program_return program() throws RecognitionException {
		while_astParser.program_return retval = new while_astParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope function1 =null;
		ParserRuleReturnScope program2 =null;


		try { dbg.enterRule(getGrammarFileName(), "program");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(27, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:27:9: ( function ( program )? )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:27:11: function ( program )?
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(27,11);
			pushFollow(FOLLOW_function_in_program147);
			function1=function();
			state._fsp--;

			adaptor.addChild(root_0, function1.getTree());
			dbg.location(27,20);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:27:20: ( program )?
			int alt1=2;
			try { dbg.enterSubRule(1);
			try { dbg.enterDecision(1, decisionCanBacktrack[1]);

			int LA1_0 = input.LA(1);
			if ( (LA1_0==33) ) {
				alt1=1;
			}
			} finally {dbg.exitDecision(1);}

			switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:27:20: program
					{
					dbg.location(27,20);
					pushFollow(FOLLOW_program_in_program149);
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
		dbg.location(27, 27);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:28:1: function : 'function ' Symbol ( WS )? ':' definition -> ^( FUNCDEF Symbol definition ) ;
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
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
		RewriteRuleTokenStream stream_Symbol=new RewriteRuleTokenStream(adaptor,"token Symbol");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"rule definition");

		try { dbg.enterRule(getGrammarFileName(), "function");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(28, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:28:9: ( 'function ' Symbol ( WS )? ':' definition -> ^( FUNCDEF Symbol definition ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:28:12: 'function ' Symbol ( WS )? ':' definition
			{
			dbg.location(28,12);
			string_literal3=(Token)match(input,33,FOLLOW_33_in_function157);  
			stream_33.add(string_literal3);
			dbg.location(28,24);
			Symbol4=(Token)match(input,Symbol,FOLLOW_Symbol_in_function159);  
			stream_Symbol.add(Symbol4);
			dbg.location(28,31);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:28:31: ( WS )?
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:28:31: WS
					{
					dbg.location(28,31);
					WS5=(Token)match(input,WS,FOLLOW_WS_in_function161);  
					stream_WS.add(WS5);

					}
					break;

			}
			} finally {dbg.exitSubRule(2);}
			dbg.location(28,34);
			char_literal6=(Token)match(input,23,FOLLOW_23_in_function163);  
			stream_23.add(char_literal6);
			dbg.location(28,38);
			pushFollow(FOLLOW_definition_in_function165);
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
			// 28:49: -> ^( FUNCDEF Symbol definition )
			{
				dbg.location(28,52);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:28:52: ^( FUNCDEF Symbol definition )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(28,54);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCDEF, "FUNCDEF"), root_1);
				dbg.location(28,62);
				adaptor.addChild(root_1, stream_Symbol.nextNode());dbg.location(28,69);
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
		dbg.location(28, 79);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:29:1: definition : 'read' ( WS )? input '%' commands '%' 'write ' output -> WS ;
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
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_19=new RewriteRuleTokenStream(adaptor,"token 19");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");
		RewriteRuleSubtreeStream stream_input=new RewriteRuleSubtreeStream(adaptor,"rule input");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try { dbg.enterRule(getGrammarFileName(), "definition");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(29, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:29:11: ( 'read' ( WS )? input '%' commands '%' 'write ' output -> WS )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:29:14: 'read' ( WS )? input '%' commands '%' 'write ' output
			{
			dbg.location(29,14);
			string_literal8=(Token)match(input,41,FOLLOW_41_in_definition182);  
			stream_41.add(string_literal8);
			dbg.location(29,22);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:29:22: ( WS )?
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:29:22: WS
					{
					dbg.location(29,22);
					WS9=(Token)match(input,WS,FOLLOW_WS_in_definition185);  
					stream_WS.add(WS9);

					}
					break;

			}
			} finally {dbg.exitSubRule(3);}
			dbg.location(29,26);
			pushFollow(FOLLOW_input_in_definition188);
			input10=input();
			state._fsp--;

			stream_input.add(input10.getTree());dbg.location(29,32);
			char_literal11=(Token)match(input,19,FOLLOW_19_in_definition190);  
			stream_19.add(char_literal11);
			dbg.location(29,36);
			pushFollow(FOLLOW_commands_in_definition192);
			commands12=commands();
			state._fsp--;

			stream_commands.add(commands12.getTree());dbg.location(29,45);
			char_literal13=(Token)match(input,19,FOLLOW_19_in_definition194);  
			stream_19.add(char_literal13);
			dbg.location(29,49);
			string_literal14=(Token)match(input,45,FOLLOW_45_in_definition196);  
			stream_45.add(string_literal14);
			dbg.location(29,58);
			pushFollow(FOLLOW_output_in_definition198);
			output15=output();
			state._fsp--;

			stream_output.add(output15.getTree());
			// AST REWRITE
			// elements: WS
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 29:65: -> WS
			{
				dbg.location(29,68);
				adaptor.addChild(root_0, stream_WS.nextNode());
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
		dbg.location(29, 69);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:30:1: input : ( inputSub )? ;
	public final while_astParser.input_return input() throws RecognitionException {
		while_astParser.input_return retval = new while_astParser.input_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope inputSub16 =null;


		try { dbg.enterRule(getGrammarFileName(), "input");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(30, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:30:7: ( ( inputSub )? )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:30:10: ( inputSub )?
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(30,10);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:30:10: ( inputSub )?
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:30:10: inputSub
					{
					dbg.location(30,10);
					pushFollow(FOLLOW_inputSub_in_input210);
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
		dbg.location(30, 18);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:31:1: inputSub : Variable ( WS )? ( ',' ( WS )? inputSub )? ;
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
		dbg.location(31, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:32:2: ( Variable ( WS )? ( ',' ( WS )? inputSub )? )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:32:4: Variable ( WS )? ( ',' ( WS )? inputSub )?
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(32,4);
			Variable17=(Token)match(input,Variable,FOLLOW_Variable_in_inputSub220); 
			Variable17_tree = (Object)adaptor.create(Variable17);
			adaptor.addChild(root_0, Variable17_tree);
			dbg.location(32,13);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:32:13: ( WS )?
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:32:13: WS
					{
					dbg.location(32,13);
					WS18=(Token)match(input,WS,FOLLOW_WS_in_inputSub222); 
					WS18_tree = (Object)adaptor.create(WS18);
					adaptor.addChild(root_0, WS18_tree);

					}
					break;

			}
			} finally {dbg.exitSubRule(5);}
			dbg.location(32,17);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:32:17: ( ',' ( WS )? inputSub )?
			int alt7=2;
			try { dbg.enterSubRule(7);
			try { dbg.enterDecision(7, decisionCanBacktrack[7]);

			int LA7_0 = input.LA(1);
			if ( (LA7_0==22) ) {
				alt7=1;
			}
			} finally {dbg.exitDecision(7);}

			switch (alt7) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:32:18: ',' ( WS )? inputSub
					{
					dbg.location(32,18);
					char_literal19=(Token)match(input,22,FOLLOW_22_in_inputSub226); 
					char_literal19_tree = (Object)adaptor.create(char_literal19);
					adaptor.addChild(root_0, char_literal19_tree);
					dbg.location(32,21);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:32:21: ( WS )?
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

							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:32:21: WS
							{
							dbg.location(32,21);
							WS20=(Token)match(input,WS,FOLLOW_WS_in_inputSub227); 
							WS20_tree = (Object)adaptor.create(WS20);
							adaptor.addChild(root_0, WS20_tree);

							}
							break;

					}
					} finally {dbg.exitSubRule(6);}
					dbg.location(32,25);
					pushFollow(FOLLOW_inputSub_in_inputSub230);
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
		dbg.location(32, 34);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:33:1: output : Variable ( ',' output )? ;
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
		dbg.location(33, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:33:9: ( Variable ( ',' output )? )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:33:11: Variable ( ',' output )?
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(33,11);
			Variable22=(Token)match(input,Variable,FOLLOW_Variable_in_output240); 
			Variable22_tree = (Object)adaptor.create(Variable22);
			adaptor.addChild(root_0, Variable22_tree);
			dbg.location(33,20);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:33:20: ( ',' output )?
			int alt8=2;
			try { dbg.enterSubRule(8);
			try { dbg.enterDecision(8, decisionCanBacktrack[8]);

			int LA8_0 = input.LA(1);
			if ( (LA8_0==22) ) {
				alt8=1;
			}
			} finally {dbg.exitDecision(8);}

			switch (alt8) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:33:21: ',' output
					{
					dbg.location(33,21);
					char_literal23=(Token)match(input,22,FOLLOW_22_in_output243); 
					char_literal23_tree = (Object)adaptor.create(char_literal23);
					adaptor.addChild(root_0, char_literal23_tree);
					dbg.location(33,25);
					pushFollow(FOLLOW_output_in_output245);
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
		dbg.location(33, 32);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:34:1: commands : command ( ';' commands )? ;
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
		dbg.location(34, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:34:9: ( command ( ';' commands )? )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:34:11: command ( ';' commands )?
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(34,11);
			pushFollow(FOLLOW_command_in_commands253);
			command25=command();
			state._fsp--;

			adaptor.addChild(root_0, command25.getTree());
			dbg.location(34,19);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:34:19: ( ';' commands )?
			int alt9=2;
			try { dbg.enterSubRule(9);
			try { dbg.enterDecision(9, decisionCanBacktrack[9]);

			int LA9_0 = input.LA(1);
			if ( (LA9_0==25) ) {
				alt9=1;
			}
			} finally {dbg.exitDecision(9);}

			switch (alt9) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:34:20: ';' commands
					{
					dbg.location(34,20);
					char_literal26=(Token)match(input,25,FOLLOW_25_in_commands256); 
					char_literal26_tree = (Object)adaptor.create(char_literal26);
					adaptor.addChild(root_0, char_literal26_tree);
					dbg.location(34,24);
					pushFollow(FOLLOW_commands_in_commands258);
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
		dbg.location(34, 33);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:35:1: command : ( 'nop' | decl | if | while | foreach );
	public final while_astParser.command_return command() throws RecognitionException {
		while_astParser.command_return retval = new while_astParser.command_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal28=null;
		ParserRuleReturnScope decl29 =null;
		ParserRuleReturnScope if30 =null;
		ParserRuleReturnScope while31 =null;
		ParserRuleReturnScope foreach32 =null;

		Object string_literal28_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "command");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(35, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:35:9: ( 'nop' | decl | if | while | foreach )
			int alt10=5;
			try { dbg.enterDecision(10, decisionCanBacktrack[10]);

			switch ( input.LA(1) ) {
			case 39:
				{
				alt10=1;
				}
				break;
			case Variable:
				{
				alt10=2;
				}
				break;
			case 35:
				{
				alt10=3;
				}
				break;
			case 44:
				{
				alt10=4;
				}
				break;
			case 32:
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:35:12: 'nop'
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(35,12);
					string_literal28=(Token)match(input,39,FOLLOW_39_in_command268); 
					string_literal28_tree = (Object)adaptor.create(string_literal28);
					adaptor.addChild(root_0, string_literal28_tree);

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:35:18: decl
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(35,18);
					pushFollow(FOLLOW_decl_in_command270);
					decl29=decl();
					state._fsp--;

					adaptor.addChild(root_0, decl29.getTree());

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:35:23: if
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(35,23);
					pushFollow(FOLLOW_if_in_command272);
					if30=if();
					state._fsp--;

					adaptor.addChild(root_0, if30.getTree());

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:35:26: while
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(35,26);
					pushFollow(FOLLOW_while_in_command274);
					while31=while();
					state._fsp--;

					adaptor.addChild(root_0, while31.getTree());

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:35:32: foreach
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(35,32);
					pushFollow(FOLLOW_foreach_in_command276);
					foreach32=foreach();
					state._fsp--;

					adaptor.addChild(root_0, foreach32.getTree());

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
		dbg.location(35, 38);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:37:1: decl : ( vars ( WS )? ':=' ( WS )? exprs ) -> ^( VARDEF vars exprs ) ;
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
		RewriteRuleTokenStream stream_24=new RewriteRuleTokenStream(adaptor,"token 24");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");
		RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");

		try { dbg.enterRule(getGrammarFileName(), "decl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(37, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:37:6: ( ( vars ( WS )? ':=' ( WS )? exprs ) -> ^( VARDEF vars exprs ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:37:8: ( vars ( WS )? ':=' ( WS )? exprs )
			{
			dbg.location(37,8);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:37:8: ( vars ( WS )? ':=' ( WS )? exprs )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:37:9: vars ( WS )? ':=' ( WS )? exprs
			{
			dbg.location(37,9);
			pushFollow(FOLLOW_vars_in_decl287);
			vars33=vars();
			state._fsp--;

			stream_vars.add(vars33.getTree());dbg.location(37,14);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:37:14: ( WS )?
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:37:14: WS
					{
					dbg.location(37,14);
					WS34=(Token)match(input,WS,FOLLOW_WS_in_decl289);  
					stream_WS.add(WS34);

					}
					break;

			}
			} finally {dbg.exitSubRule(11);}
			dbg.location(37,17);
			string_literal35=(Token)match(input,24,FOLLOW_24_in_decl291);  
			stream_24.add(string_literal35);
			dbg.location(37,21);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:37:21: ( WS )?
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:37:21: WS
					{
					dbg.location(37,21);
					WS36=(Token)match(input,WS,FOLLOW_WS_in_decl292);  
					stream_WS.add(WS36);

					}
					break;

			}
			} finally {dbg.exitSubRule(12);}
			dbg.location(37,25);
			pushFollow(FOLLOW_exprs_in_decl295);
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
			// 37:32: -> ^( VARDEF vars exprs )
			{
				dbg.location(37,35);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:37:35: ^( VARDEF vars exprs )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(37,37);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARDEF, "VARDEF"), root_1);
				dbg.location(37,44);
				adaptor.addChild(root_1, stream_vars.nextTree());dbg.location(37,49);
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
		dbg.location(37, 55);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "decl");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "decl"


	public static class if_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "if"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:38:1: if : ( 'if' ( WS )? expression ( WS )? 'then' ( WS )? commands ( WS )? ( 'else' ( WS )? commands )? ( WS )? 'fi' ) -> ^( IF expression commands ) ;
	public final while_astParser.if_return if() throws RecognitionException {
		while_astParser.if_return retval = new while_astParser.if_return();
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
		Token string_literal50=null;
		ParserRuleReturnScope expression40 =null;
		ParserRuleReturnScope commands44 =null;
		ParserRuleReturnScope commands48 =null;

		Object string_literal38_tree=null;
		Object WS39_tree=null;
		Object WS41_tree=null;
		Object string_literal42_tree=null;
		Object WS43_tree=null;
		Object WS45_tree=null;
		Object string_literal46_tree=null;
		Object WS47_tree=null;
		Object WS49_tree=null;
		Object string_literal50_tree=null;
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try { dbg.enterRule(getGrammarFileName(), "if");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(38, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:38:4: ( ( 'if' ( WS )? expression ( WS )? 'then' ( WS )? commands ( WS )? ( 'else' ( WS )? commands )? ( WS )? 'fi' ) -> ^( IF expression commands ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:38:6: ( 'if' ( WS )? expression ( WS )? 'then' ( WS )? commands ( WS )? ( 'else' ( WS )? commands )? ( WS )? 'fi' )
			{
			dbg.location(38,6);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:38:6: ( 'if' ( WS )? expression ( WS )? 'then' ( WS )? commands ( WS )? ( 'else' ( WS )? commands )? ( WS )? 'fi' )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:38:7: 'if' ( WS )? expression ( WS )? 'then' ( WS )? commands ( WS )? ( 'else' ( WS )? commands )? ( WS )? 'fi'
			{
			dbg.location(38,7);
			string_literal38=(Token)match(input,35,FOLLOW_35_in_if315);  
			stream_35.add(string_literal38);
			dbg.location(38,12);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:38:12: ( WS )?
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:38:12: WS
					{
					dbg.location(38,12);
					WS39=(Token)match(input,WS,FOLLOW_WS_in_if317);  
					stream_WS.add(WS39);

					}
					break;

			}
			} finally {dbg.exitSubRule(13);}
			dbg.location(38,17);
			pushFollow(FOLLOW_expression_in_if321);
			expression40=expression();
			state._fsp--;

			stream_expression.add(expression40.getTree());dbg.location(38,29);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:38:29: ( WS )?
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:38:29: WS
					{
					dbg.location(38,29);
					WS41=(Token)match(input,WS,FOLLOW_WS_in_if324);  
					stream_WS.add(WS41);

					}
					break;

			}
			} finally {dbg.exitSubRule(14);}
			dbg.location(38,33);
			string_literal42=(Token)match(input,42,FOLLOW_42_in_if327);  
			stream_42.add(string_literal42);
			dbg.location(38,40);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:38:40: ( WS )?
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:38:40: WS
					{
					dbg.location(38,40);
					WS43=(Token)match(input,WS,FOLLOW_WS_in_if329);  
					stream_WS.add(WS43);

					}
					break;

			}
			} finally {dbg.exitSubRule(15);}
			dbg.location(38,44);
			pushFollow(FOLLOW_commands_in_if332);
			commands44=commands();
			state._fsp--;

			stream_commands.add(commands44.getTree());dbg.location(38,54);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:38:54: ( WS )?
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:38:54: WS
					{
					dbg.location(38,54);
					WS45=(Token)match(input,WS,FOLLOW_WS_in_if335);  
					stream_WS.add(WS45);

					}
					break;

			}
			} finally {dbg.exitSubRule(16);}
			dbg.location(38,58);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:38:58: ( 'else' ( WS )? commands )?
			int alt18=2;
			try { dbg.enterSubRule(18);
			try { dbg.enterDecision(18, decisionCanBacktrack[18]);

			int LA18_0 = input.LA(1);
			if ( (LA18_0==29) ) {
				alt18=1;
			}
			} finally {dbg.exitDecision(18);}

			switch (alt18) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:38:59: 'else' ( WS )? commands
					{
					dbg.location(38,59);
					string_literal46=(Token)match(input,29,FOLLOW_29_in_if339);  
					stream_29.add(string_literal46);
					dbg.location(38,66);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:38:66: ( WS )?
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

							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:38:66: WS
							{
							dbg.location(38,66);
							WS47=(Token)match(input,WS,FOLLOW_WS_in_if341);  
							stream_WS.add(WS47);

							}
							break;

					}
					} finally {dbg.exitSubRule(17);}
					dbg.location(38,70);
					pushFollow(FOLLOW_commands_in_if344);
					commands48=commands();
					state._fsp--;

					stream_commands.add(commands48.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(18);}
			dbg.location(38,82);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:38:82: ( WS )?
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:38:82: WS
					{
					dbg.location(38,82);
					WS49=(Token)match(input,WS,FOLLOW_WS_in_if349);  
					stream_WS.add(WS49);

					}
					break;

			}
			} finally {dbg.exitSubRule(19);}
			dbg.location(38,86);
			string_literal50=(Token)match(input,30,FOLLOW_30_in_if352);  
			stream_30.add(string_literal50);

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
			// 38:92: -> ^( IF expression commands )
			{
				dbg.location(38,95);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:38:95: ^( IF expression commands )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(38,97);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);
				dbg.location(38,100);
				adaptor.addChild(root_1, stream_expression.nextTree());dbg.location(38,111);
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
		dbg.location(38, 119);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "if");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "if"


	public static class while_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "while"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:39:1: while : ( 'while' ( WS )? expression ( WS )? 'do' ( WS )? commands ( WS )? 'od' ) -> ^( WHILE expression commands ) ;
	public final while_astParser.while_return while() throws RecognitionException {
		while_astParser.while_return retval = new while_astParser.while_return();
		retval.start = input.LT(1);

		Object root_0 = null;

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
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try { dbg.enterRule(getGrammarFileName(), "while");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(39, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:39:7: ( ( 'while' ( WS )? expression ( WS )? 'do' ( WS )? commands ( WS )? 'od' ) -> ^( WHILE expression commands ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:39:9: ( 'while' ( WS )? expression ( WS )? 'do' ( WS )? commands ( WS )? 'od' )
			{
			dbg.location(39,9);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:39:9: ( 'while' ( WS )? expression ( WS )? 'do' ( WS )? commands ( WS )? 'od' )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:39:10: 'while' ( WS )? expression ( WS )? 'do' ( WS )? commands ( WS )? 'od'
			{
			dbg.location(39,10);
			string_literal51=(Token)match(input,44,FOLLOW_44_in_while371);  
			stream_44.add(string_literal51);
			dbg.location(39,18);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:39:18: ( WS )?
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:39:18: WS
					{
					dbg.location(39,18);
					WS52=(Token)match(input,WS,FOLLOW_WS_in_while373);  
					stream_WS.add(WS52);

					}
					break;

			}
			} finally {dbg.exitSubRule(20);}
			dbg.location(39,22);
			pushFollow(FOLLOW_expression_in_while376);
			expression53=expression();
			state._fsp--;

			stream_expression.add(expression53.getTree());dbg.location(39,34);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:39:34: ( WS )?
			int alt21=2;
			try { dbg.enterSubRule(21);
			try { dbg.enterDecision(21, decisionCanBacktrack[21]);

			int LA21_0 = input.LA(1);
			if ( (LA21_0==WS) ) {
				alt21=1;
			}
			} finally {dbg.exitDecision(21);}

			switch (alt21) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:39:34: WS
					{
					dbg.location(39,34);
					WS54=(Token)match(input,WS,FOLLOW_WS_in_while379);  
					stream_WS.add(WS54);

					}
					break;

			}
			} finally {dbg.exitSubRule(21);}
			dbg.location(39,38);
			string_literal55=(Token)match(input,28,FOLLOW_28_in_while382);  
			stream_28.add(string_literal55);
			dbg.location(39,43);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:39:43: ( WS )?
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:39:43: WS
					{
					dbg.location(39,43);
					WS56=(Token)match(input,WS,FOLLOW_WS_in_while384);  
					stream_WS.add(WS56);

					}
					break;

			}
			} finally {dbg.exitSubRule(22);}
			dbg.location(39,47);
			pushFollow(FOLLOW_commands_in_while387);
			commands57=commands();
			state._fsp--;

			stream_commands.add(commands57.getTree());dbg.location(39,57);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:39:57: ( WS )?
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:39:57: WS
					{
					dbg.location(39,57);
					WS58=(Token)match(input,WS,FOLLOW_WS_in_while390);  
					stream_WS.add(WS58);

					}
					break;

			}
			} finally {dbg.exitSubRule(23);}
			dbg.location(39,61);
			string_literal59=(Token)match(input,40,FOLLOW_40_in_while393);  
			stream_40.add(string_literal59);

			}

			// AST REWRITE
			// elements: expression, commands
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 39:66: -> ^( WHILE expression commands )
			{
				dbg.location(39,69);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:39:69: ^( WHILE expression commands )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(39,71);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WHILE, "WHILE"), root_1);
				dbg.location(39,77);
				adaptor.addChild(root_1, stream_expression.nextTree());dbg.location(39,88);
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
		dbg.location(39, 96);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "while");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "while"


	public static class for_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "for"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:40:1: for : ( 'for' ( WS )? expression ( WS )? 'do' ( WS )? commands ( WS )? 'od' ) -> ^( FOR expression commands ) ;
	public final while_astParser.for_return for() throws RecognitionException {
		while_astParser.for_return retval = new while_astParser.for_return();
		retval.start = input.LT(1);

		Object root_0 = null;

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
		RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try { dbg.enterRule(getGrammarFileName(), "for");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(40, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:40:5: ( ( 'for' ( WS )? expression ( WS )? 'do' ( WS )? commands ( WS )? 'od' ) -> ^( FOR expression commands ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:40:7: ( 'for' ( WS )? expression ( WS )? 'do' ( WS )? commands ( WS )? 'od' )
			{
			dbg.location(40,7);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:40:7: ( 'for' ( WS )? expression ( WS )? 'do' ( WS )? commands ( WS )? 'od' )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:40:8: 'for' ( WS )? expression ( WS )? 'do' ( WS )? commands ( WS )? 'od'
			{
			dbg.location(40,8);
			string_literal60=(Token)match(input,31,FOLLOW_31_in_for411);  
			stream_31.add(string_literal60);
			dbg.location(40,14);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:40:14: ( WS )?
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:40:14: WS
					{
					dbg.location(40,14);
					WS61=(Token)match(input,WS,FOLLOW_WS_in_for413);  
					stream_WS.add(WS61);

					}
					break;

			}
			} finally {dbg.exitSubRule(24);}
			dbg.location(40,19);
			pushFollow(FOLLOW_expression_in_for417);
			expression62=expression();
			state._fsp--;

			stream_expression.add(expression62.getTree());dbg.location(40,30);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:40:30: ( WS )?
			int alt25=2;
			try { dbg.enterSubRule(25);
			try { dbg.enterDecision(25, decisionCanBacktrack[25]);

			int LA25_0 = input.LA(1);
			if ( (LA25_0==WS) ) {
				alt25=1;
			}
			} finally {dbg.exitDecision(25);}

			switch (alt25) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:40:30: WS
					{
					dbg.location(40,30);
					WS63=(Token)match(input,WS,FOLLOW_WS_in_for419);  
					stream_WS.add(WS63);

					}
					break;

			}
			} finally {dbg.exitSubRule(25);}
			dbg.location(40,34);
			string_literal64=(Token)match(input,28,FOLLOW_28_in_for422);  
			stream_28.add(string_literal64);
			dbg.location(40,39);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:40:39: ( WS )?
			int alt26=2;
			try { dbg.enterSubRule(26);
			try { dbg.enterDecision(26, decisionCanBacktrack[26]);

			int LA26_0 = input.LA(1);
			if ( (LA26_0==WS) ) {
				alt26=1;
			}
			} finally {dbg.exitDecision(26);}

			switch (alt26) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:40:39: WS
					{
					dbg.location(40,39);
					WS65=(Token)match(input,WS,FOLLOW_WS_in_for424);  
					stream_WS.add(WS65);

					}
					break;

			}
			} finally {dbg.exitSubRule(26);}
			dbg.location(40,43);
			pushFollow(FOLLOW_commands_in_for427);
			commands66=commands();
			state._fsp--;

			stream_commands.add(commands66.getTree());dbg.location(40,53);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:40:53: ( WS )?
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:40:53: WS
					{
					dbg.location(40,53);
					WS67=(Token)match(input,WS,FOLLOW_WS_in_for430);  
					stream_WS.add(WS67);

					}
					break;

			}
			} finally {dbg.exitSubRule(27);}
			dbg.location(40,57);
			string_literal68=(Token)match(input,40,FOLLOW_40_in_for433);  
			stream_40.add(string_literal68);

			}

			// AST REWRITE
			// elements: expression, commands
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 40:62: -> ^( FOR expression commands )
			{
				dbg.location(40,65);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:40:65: ^( FOR expression commands )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(40,67);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOR, "FOR"), root_1);
				dbg.location(40,71);
				adaptor.addChild(root_1, stream_expression.nextTree());dbg.location(40,82);
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
		dbg.location(40, 90);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "for");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "for"


	public static class foreach_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "foreach"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:41:1: foreach : ( 'foreach' ( WS )? Variable ( WS )? 'in' ( WS )? expression ( WS )? 'do' ( WS )? commands ( WS )? 'od' ) -> ^( FOREACH ^( IN Variable expression ) commands ) ;
	public final while_astParser.foreach_return foreach() throws RecognitionException {
		while_astParser.foreach_return retval = new while_astParser.foreach_return();
		retval.start = input.LT(1);

		Object root_0 = null;

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
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try { dbg.enterRule(getGrammarFileName(), "foreach");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(41, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:41:9: ( ( 'foreach' ( WS )? Variable ( WS )? 'in' ( WS )? expression ( WS )? 'do' ( WS )? commands ( WS )? 'od' ) -> ^( FOREACH ^( IN Variable expression ) commands ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:41:11: ( 'foreach' ( WS )? Variable ( WS )? 'in' ( WS )? expression ( WS )? 'do' ( WS )? commands ( WS )? 'od' )
			{
			dbg.location(41,11);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:41:11: ( 'foreach' ( WS )? Variable ( WS )? 'in' ( WS )? expression ( WS )? 'do' ( WS )? commands ( WS )? 'od' )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:41:12: 'foreach' ( WS )? Variable ( WS )? 'in' ( WS )? expression ( WS )? 'do' ( WS )? commands ( WS )? 'od'
			{
			dbg.location(41,12);
			string_literal69=(Token)match(input,32,FOLLOW_32_in_foreach451);  
			stream_32.add(string_literal69);
			dbg.location(41,22);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:41:22: ( WS )?
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:41:22: WS
					{
					dbg.location(41,22);
					WS70=(Token)match(input,WS,FOLLOW_WS_in_foreach453);  
					stream_WS.add(WS70);

					}
					break;

			}
			} finally {dbg.exitSubRule(28);}
			dbg.location(41,26);
			Variable71=(Token)match(input,Variable,FOLLOW_Variable_in_foreach456);  
			stream_Variable.add(Variable71);
			dbg.location(41,35);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:41:35: ( WS )?
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:41:35: WS
					{
					dbg.location(41,35);
					WS72=(Token)match(input,WS,FOLLOW_WS_in_foreach458);  
					stream_WS.add(WS72);

					}
					break;

			}
			} finally {dbg.exitSubRule(29);}
			dbg.location(41,39);
			string_literal73=(Token)match(input,36,FOLLOW_36_in_foreach461);  
			stream_36.add(string_literal73);
			dbg.location(41,44);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:41:44: ( WS )?
			int alt30=2;
			try { dbg.enterSubRule(30);
			try { dbg.enterDecision(30, decisionCanBacktrack[30]);

			int LA30_0 = input.LA(1);
			if ( (LA30_0==WS) ) {
				alt30=1;
			}
			} finally {dbg.exitDecision(30);}

			switch (alt30) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:41:44: WS
					{
					dbg.location(41,44);
					WS74=(Token)match(input,WS,FOLLOW_WS_in_foreach463);  
					stream_WS.add(WS74);

					}
					break;

			}
			} finally {dbg.exitSubRule(30);}
			dbg.location(41,48);
			pushFollow(FOLLOW_expression_in_foreach466);
			expression75=expression();
			state._fsp--;

			stream_expression.add(expression75.getTree());dbg.location(41,59);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:41:59: ( WS )?
			int alt31=2;
			try { dbg.enterSubRule(31);
			try { dbg.enterDecision(31, decisionCanBacktrack[31]);

			int LA31_0 = input.LA(1);
			if ( (LA31_0==WS) ) {
				alt31=1;
			}
			} finally {dbg.exitDecision(31);}

			switch (alt31) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:41:59: WS
					{
					dbg.location(41,59);
					WS76=(Token)match(input,WS,FOLLOW_WS_in_foreach468);  
					stream_WS.add(WS76);

					}
					break;

			}
			} finally {dbg.exitSubRule(31);}
			dbg.location(41,63);
			string_literal77=(Token)match(input,28,FOLLOW_28_in_foreach471);  
			stream_28.add(string_literal77);
			dbg.location(41,68);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:41:68: ( WS )?
			int alt32=2;
			try { dbg.enterSubRule(32);
			try { dbg.enterDecision(32, decisionCanBacktrack[32]);

			int LA32_0 = input.LA(1);
			if ( (LA32_0==WS) ) {
				alt32=1;
			}
			} finally {dbg.exitDecision(32);}

			switch (alt32) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:41:68: WS
					{
					dbg.location(41,68);
					WS78=(Token)match(input,WS,FOLLOW_WS_in_foreach473);  
					stream_WS.add(WS78);

					}
					break;

			}
			} finally {dbg.exitSubRule(32);}
			dbg.location(41,72);
			pushFollow(FOLLOW_commands_in_foreach476);
			commands79=commands();
			state._fsp--;

			stream_commands.add(commands79.getTree());dbg.location(41,81);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:41:81: ( WS )?
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:41:81: WS
					{
					dbg.location(41,81);
					WS80=(Token)match(input,WS,FOLLOW_WS_in_foreach478);  
					stream_WS.add(WS80);

					}
					break;

			}
			} finally {dbg.exitSubRule(33);}
			dbg.location(41,85);
			string_literal81=(Token)match(input,40,FOLLOW_40_in_foreach481);  
			stream_40.add(string_literal81);

			}

			// AST REWRITE
			// elements: expression, Variable, commands
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 41:90: -> ^( FOREACH ^( IN Variable expression ) commands )
			{
				dbg.location(41,93);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:41:93: ^( FOREACH ^( IN Variable expression ) commands )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(41,95);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOREACH, "FOREACH"), root_1);
				dbg.location(41,103);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:41:103: ^( IN Variable expression )
				{
				Object root_2 = (Object)adaptor.nil();
				dbg.location(41,105);
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(IN, "IN"), root_2);
				dbg.location(41,108);
				adaptor.addChild(root_2, stream_Variable.nextNode());dbg.location(41,117);
				adaptor.addChild(root_2, stream_expression.nextTree());
				adaptor.addChild(root_1, root_2);
				}
				dbg.location(41,129);
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
		dbg.location(41, 137);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "foreach");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "foreach"


	public static class vars_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "vars"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:43:1: vars : Variable ( ',' vars )? -> ^( VARIABLES Variable ( vars )* ) ;
	public final while_astParser.vars_return vars() throws RecognitionException {
		while_astParser.vars_return retval = new while_astParser.vars_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Variable82=null;
		Token char_literal83=null;
		ParserRuleReturnScope vars84 =null;

		Object Variable82_tree=null;
		Object char_literal83_tree=null;
		RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");

		try { dbg.enterRule(getGrammarFileName(), "vars");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(43, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:43:7: ( Variable ( ',' vars )? -> ^( VARIABLES Variable ( vars )* ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:43:9: Variable ( ',' vars )?
			{
			dbg.location(43,9);
			Variable82=(Token)match(input,Variable,FOLLOW_Variable_in_vars508);  
			stream_Variable.add(Variable82);
			dbg.location(43,18);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:43:18: ( ',' vars )?
			int alt34=2;
			try { dbg.enterSubRule(34);
			try { dbg.enterDecision(34, decisionCanBacktrack[34]);

			int LA34_0 = input.LA(1);
			if ( (LA34_0==22) ) {
				alt34=1;
			}
			} finally {dbg.exitDecision(34);}

			switch (alt34) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:43:19: ',' vars
					{
					dbg.location(43,19);
					char_literal83=(Token)match(input,22,FOLLOW_22_in_vars511);  
					stream_22.add(char_literal83);
					dbg.location(43,23);
					pushFollow(FOLLOW_vars_in_vars513);
					vars84=vars();
					state._fsp--;

					stream_vars.add(vars84.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(34);}

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
			// 43:30: -> ^( VARIABLES Variable ( vars )* )
			{
				dbg.location(43,33);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:43:33: ^( VARIABLES Variable ( vars )* )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(43,35);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARIABLES, "VARIABLES"), root_1);
				dbg.location(43,45);
				adaptor.addChild(root_1, stream_Variable.nextNode());dbg.location(43,54);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:43:54: ( vars )*
				while ( stream_vars.hasNext() ) {
					dbg.location(43,54);
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
		dbg.location(43, 59);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:45:1: exprs : expression ( ',' exprs )? -> ^( EXPR expression ( exprs )* ) ;
	public final while_astParser.exprs_return exprs() throws RecognitionException {
		while_astParser.exprs_return retval = new while_astParser.exprs_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal86=null;
		ParserRuleReturnScope expression85 =null;
		ParserRuleReturnScope exprs87 =null;

		Object char_literal86_tree=null;
		RewriteRuleTokenStream stream_22=new RewriteRuleTokenStream(adaptor,"token 22");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");

		try { dbg.enterRule(getGrammarFileName(), "exprs");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(45, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:45:7: ( expression ( ',' exprs )? -> ^( EXPR expression ( exprs )* ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:45:9: expression ( ',' exprs )?
			{
			dbg.location(45,9);
			pushFollow(FOLLOW_expression_in_exprs534);
			expression85=expression();
			state._fsp--;

			stream_expression.add(expression85.getTree());dbg.location(45,20);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:45:20: ( ',' exprs )?
			int alt35=2;
			try { dbg.enterSubRule(35);
			try { dbg.enterDecision(35, decisionCanBacktrack[35]);

			int LA35_0 = input.LA(1);
			if ( (LA35_0==22) ) {
				alt35=1;
			}
			} finally {dbg.exitDecision(35);}

			switch (alt35) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:45:21: ',' exprs
					{
					dbg.location(45,21);
					char_literal86=(Token)match(input,22,FOLLOW_22_in_exprs537);  
					stream_22.add(char_literal86);
					dbg.location(45,25);
					pushFollow(FOLLOW_exprs_in_exprs539);
					exprs87=exprs();
					state._fsp--;

					stream_exprs.add(exprs87.getTree());
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
			// 45:33: -> ^( EXPR expression ( exprs )* )
			{
				dbg.location(45,36);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:45:36: ^( EXPR expression ( exprs )* )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(45,38);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR, "EXPR"), root_1);
				dbg.location(45,43);
				adaptor.addChild(root_1, stream_expression.nextTree());dbg.location(45,54);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:45:54: ( exprs )*
				while ( stream_exprs.hasNext() ) {
					dbg.location(45,54);
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
		dbg.location(45, 60);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:47:1: exprBase : ( 'nil' ( WS )? | Variable | Symbol | ( '(' 'cons ' lExpr ')' ) | ( '(' 'list ' lExpr ')' ) | ( '(' 'hd ' exprBase ')' ) | ( '(' 'tl ' exprBase ')' ) | ( '(' Symbol ( WS )? lExpr ')' ) );
	public final while_astParser.exprBase_return exprBase() throws RecognitionException {
		while_astParser.exprBase_return retval = new while_astParser.exprBase_return();
		retval.start = input.LT(1);

		Object root_0 = null;

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

		try { dbg.enterRule(getGrammarFileName(), "exprBase");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(47, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:47:9: ( 'nil' ( WS )? | Variable | Symbol | ( '(' 'cons ' lExpr ')' ) | ( '(' 'list ' lExpr ')' ) | ( '(' 'hd ' exprBase ')' ) | ( '(' 'tl ' exprBase ')' ) | ( '(' Symbol ( WS )? lExpr ')' ) )
			int alt38=8;
			try { dbg.enterDecision(38, decisionCanBacktrack[38]);

			switch ( input.LA(1) ) {
			case 38:
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
			case 20:
				{
				switch ( input.LA(2) ) {
				case 27:
					{
					alt38=4;
					}
					break;
				case 37:
					{
					alt38=5;
					}
					break;
				case 34:
					{
					alt38=6;
					}
					break;
				case 43:
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:47:12: 'nil' ( WS )?
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(47,12);
					string_literal88=(Token)match(input,38,FOLLOW_38_in_exprBase560); 
					string_literal88_tree = (Object)adaptor.create(string_literal88);
					adaptor.addChild(root_0, string_literal88_tree);
					dbg.location(47,17);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:47:17: ( WS )?
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

							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:47:17: WS
							{
							dbg.location(47,17);
							WS89=(Token)match(input,WS,FOLLOW_WS_in_exprBase561); 
							WS89_tree = (Object)adaptor.create(WS89);
							adaptor.addChild(root_0, WS89_tree);

							}
							break;

					}
					} finally {dbg.exitSubRule(36);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:48:3: Variable
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(48,3);
					Variable90=(Token)match(input,Variable,FOLLOW_Variable_in_exprBase569); 
					Variable90_tree = (Object)adaptor.create(Variable90);
					adaptor.addChild(root_0, Variable90_tree);

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:49:3: Symbol
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(49,3);
					Symbol91=(Token)match(input,Symbol,FOLLOW_Symbol_in_exprBase575); 
					Symbol91_tree = (Object)adaptor.create(Symbol91);
					adaptor.addChild(root_0, Symbol91_tree);

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:50:3: ( '(' 'cons ' lExpr ')' )
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(50,3);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:50:3: ( '(' 'cons ' lExpr ')' )
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:50:4: '(' 'cons ' lExpr ')'
					{
					dbg.location(50,4);
					char_literal92=(Token)match(input,20,FOLLOW_20_in_exprBase581); 
					char_literal92_tree = (Object)adaptor.create(char_literal92);
					adaptor.addChild(root_0, char_literal92_tree);
					dbg.location(50,8);
					string_literal93=(Token)match(input,27,FOLLOW_27_in_exprBase583); 
					string_literal93_tree = (Object)adaptor.create(string_literal93);
					adaptor.addChild(root_0, string_literal93_tree);
					dbg.location(50,16);
					pushFollow(FOLLOW_lExpr_in_exprBase585);
					lExpr94=lExpr();
					state._fsp--;

					adaptor.addChild(root_0, lExpr94.getTree());
					dbg.location(50,22);
					char_literal95=(Token)match(input,21,FOLLOW_21_in_exprBase587); 
					char_literal95_tree = (Object)adaptor.create(char_literal95);
					adaptor.addChild(root_0, char_literal95_tree);

					}

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:50:29: ( '(' 'list ' lExpr ')' )
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(50,29);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:50:29: ( '(' 'list ' lExpr ')' )
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:50:30: '(' 'list ' lExpr ')'
					{
					dbg.location(50,30);
					char_literal96=(Token)match(input,20,FOLLOW_20_in_exprBase593); 
					char_literal96_tree = (Object)adaptor.create(char_literal96);
					adaptor.addChild(root_0, char_literal96_tree);
					dbg.location(50,34);
					string_literal97=(Token)match(input,37,FOLLOW_37_in_exprBase595); 
					string_literal97_tree = (Object)adaptor.create(string_literal97);
					adaptor.addChild(root_0, string_literal97_tree);
					dbg.location(50,42);
					pushFollow(FOLLOW_lExpr_in_exprBase597);
					lExpr98=lExpr();
					state._fsp--;

					adaptor.addChild(root_0, lExpr98.getTree());
					dbg.location(50,48);
					char_literal99=(Token)match(input,21,FOLLOW_21_in_exprBase599); 
					char_literal99_tree = (Object)adaptor.create(char_literal99);
					adaptor.addChild(root_0, char_literal99_tree);

					}

					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:51:3: ( '(' 'hd ' exprBase ')' )
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(51,3);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:51:3: ( '(' 'hd ' exprBase ')' )
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:51:4: '(' 'hd ' exprBase ')'
					{
					dbg.location(51,4);
					char_literal100=(Token)match(input,20,FOLLOW_20_in_exprBase606); 
					char_literal100_tree = (Object)adaptor.create(char_literal100);
					adaptor.addChild(root_0, char_literal100_tree);
					dbg.location(51,8);
					string_literal101=(Token)match(input,34,FOLLOW_34_in_exprBase608); 
					string_literal101_tree = (Object)adaptor.create(string_literal101);
					adaptor.addChild(root_0, string_literal101_tree);
					dbg.location(51,14);
					pushFollow(FOLLOW_exprBase_in_exprBase610);
					exprBase102=exprBase();
					state._fsp--;

					adaptor.addChild(root_0, exprBase102.getTree());
					dbg.location(51,23);
					char_literal103=(Token)match(input,21,FOLLOW_21_in_exprBase612); 
					char_literal103_tree = (Object)adaptor.create(char_literal103);
					adaptor.addChild(root_0, char_literal103_tree);

					}

					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:51:30: ( '(' 'tl ' exprBase ')' )
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(51,30);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:51:30: ( '(' 'tl ' exprBase ')' )
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:51:31: '(' 'tl ' exprBase ')'
					{
					dbg.location(51,31);
					char_literal104=(Token)match(input,20,FOLLOW_20_in_exprBase618); 
					char_literal104_tree = (Object)adaptor.create(char_literal104);
					adaptor.addChild(root_0, char_literal104_tree);
					dbg.location(51,35);
					string_literal105=(Token)match(input,43,FOLLOW_43_in_exprBase620); 
					string_literal105_tree = (Object)adaptor.create(string_literal105);
					adaptor.addChild(root_0, string_literal105_tree);
					dbg.location(51,41);
					pushFollow(FOLLOW_exprBase_in_exprBase622);
					exprBase106=exprBase();
					state._fsp--;

					adaptor.addChild(root_0, exprBase106.getTree());
					dbg.location(51,50);
					char_literal107=(Token)match(input,21,FOLLOW_21_in_exprBase624); 
					char_literal107_tree = (Object)adaptor.create(char_literal107);
					adaptor.addChild(root_0, char_literal107_tree);

					}

					}
					break;
				case 8 :
					dbg.enterAlt(8);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:52:3: ( '(' Symbol ( WS )? lExpr ')' )
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(52,3);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:52:3: ( '(' Symbol ( WS )? lExpr ')' )
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:52:4: '(' Symbol ( WS )? lExpr ')'
					{
					dbg.location(52,4);
					char_literal108=(Token)match(input,20,FOLLOW_20_in_exprBase631); 
					char_literal108_tree = (Object)adaptor.create(char_literal108);
					adaptor.addChild(root_0, char_literal108_tree);
					dbg.location(52,8);
					Symbol109=(Token)match(input,Symbol,FOLLOW_Symbol_in_exprBase633); 
					Symbol109_tree = (Object)adaptor.create(Symbol109);
					adaptor.addChild(root_0, Symbol109_tree);
					dbg.location(52,15);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:52:15: ( WS )?
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

							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:52:15: WS
							{
							dbg.location(52,15);
							WS110=(Token)match(input,WS,FOLLOW_WS_in_exprBase635); 
							WS110_tree = (Object)adaptor.create(WS110);
							adaptor.addChild(root_0, WS110_tree);

							}
							break;

					}
					} finally {dbg.exitSubRule(37);}
					dbg.location(52,19);
					pushFollow(FOLLOW_lExpr_in_exprBase638);
					lExpr111=lExpr();
					state._fsp--;

					adaptor.addChild(root_0, lExpr111.getTree());
					dbg.location(52,25);
					char_literal112=(Token)match(input,21,FOLLOW_21_in_exprBase640); 
					char_literal112_tree = (Object)adaptor.create(char_literal112);
					adaptor.addChild(root_0, char_literal112_tree);

					}

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
		dbg.location(52, 28);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:54:1: expression : exprBase ( WS )? ( '=?' ( WS )? exprBase )? ;
	public final while_astParser.expression_return expression() throws RecognitionException {
		while_astParser.expression_return retval = new while_astParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WS114=null;
		Token string_literal115=null;
		Token WS116=null;
		ParserRuleReturnScope exprBase113 =null;
		ParserRuleReturnScope exprBase117 =null;

		Object WS114_tree=null;
		Object string_literal115_tree=null;
		Object WS116_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(54, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:55:2: ( exprBase ( WS )? ( '=?' ( WS )? exprBase )? )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:55:4: exprBase ( WS )? ( '=?' ( WS )? exprBase )?
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(55,4);
			pushFollow(FOLLOW_exprBase_in_expression651);
			exprBase113=exprBase();
			state._fsp--;

			adaptor.addChild(root_0, exprBase113.getTree());
			dbg.location(55,13);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:55:13: ( WS )?
			int alt39=2;
			try { dbg.enterSubRule(39);
			try { dbg.enterDecision(39, decisionCanBacktrack[39]);

			int LA39_0 = input.LA(1);
			if ( (LA39_0==WS) ) {
				alt39=1;
			}
			} finally {dbg.exitDecision(39);}

			switch (alt39) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:55:13: WS
					{
					dbg.location(55,13);
					WS114=(Token)match(input,WS,FOLLOW_WS_in_expression653); 
					WS114_tree = (Object)adaptor.create(WS114);
					adaptor.addChild(root_0, WS114_tree);

					}
					break;

			}
			} finally {dbg.exitSubRule(39);}
			dbg.location(55,16);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:55:16: ( '=?' ( WS )? exprBase )?
			int alt41=2;
			try { dbg.enterSubRule(41);
			try { dbg.enterDecision(41, decisionCanBacktrack[41]);

			int LA41_0 = input.LA(1);
			if ( (LA41_0==26) ) {
				alt41=1;
			}
			} finally {dbg.exitDecision(41);}

			switch (alt41) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:55:17: '=?' ( WS )? exprBase
					{
					dbg.location(55,17);
					string_literal115=(Token)match(input,26,FOLLOW_26_in_expression656); 
					string_literal115_tree = (Object)adaptor.create(string_literal115);
					adaptor.addChild(root_0, string_literal115_tree);
					dbg.location(55,22);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:55:22: ( WS )?
					int alt40=2;
					try { dbg.enterSubRule(40);
					try { dbg.enterDecision(40, decisionCanBacktrack[40]);

					int LA40_0 = input.LA(1);
					if ( (LA40_0==WS) ) {
						alt40=1;
					}
					} finally {dbg.exitDecision(40);}

					switch (alt40) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:55:22: WS
							{
							dbg.location(55,22);
							WS116=(Token)match(input,WS,FOLLOW_WS_in_expression658); 
							WS116_tree = (Object)adaptor.create(WS116);
							adaptor.addChild(root_0, WS116_tree);

							}
							break;

					}
					} finally {dbg.exitSubRule(40);}
					dbg.location(55,26);
					pushFollow(FOLLOW_exprBase_in_expression661);
					exprBase117=exprBase();
					state._fsp--;

					adaptor.addChild(root_0, exprBase117.getTree());

					}
					break;

			}
			} finally {dbg.exitSubRule(41);}

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
		dbg.location(55, 35);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:57:1: lExpr : exprBase ( WS )? ( lExpr )? ;
	public final while_astParser.lExpr_return lExpr() throws RecognitionException {
		while_astParser.lExpr_return retval = new while_astParser.lExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WS119=null;
		ParserRuleReturnScope exprBase118 =null;
		ParserRuleReturnScope lExpr120 =null;

		Object WS119_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "lExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(57, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:57:7: ( exprBase ( WS )? ( lExpr )? )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:57:9: exprBase ( WS )? ( lExpr )?
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(57,9);
			pushFollow(FOLLOW_exprBase_in_lExpr671);
			exprBase118=exprBase();
			state._fsp--;

			adaptor.addChild(root_0, exprBase118.getTree());
			dbg.location(57,19);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:57:19: ( WS )?
			int alt42=2;
			try { dbg.enterSubRule(42);
			try { dbg.enterDecision(42, decisionCanBacktrack[42]);

			int LA42_0 = input.LA(1);
			if ( (LA42_0==WS) ) {
				alt42=1;
			}
			} finally {dbg.exitDecision(42);}

			switch (alt42) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:57:19: WS
					{
					dbg.location(57,19);
					WS119=(Token)match(input,WS,FOLLOW_WS_in_lExpr674); 
					WS119_tree = (Object)adaptor.create(WS119);
					adaptor.addChild(root_0, WS119_tree);

					}
					break;

			}
			} finally {dbg.exitSubRule(42);}
			dbg.location(57,23);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:57:23: ( lExpr )?
			int alt43=2;
			try { dbg.enterSubRule(43);
			try { dbg.enterDecision(43, decisionCanBacktrack[43]);

			int LA43_0 = input.LA(1);
			if ( (LA43_0==Symbol||LA43_0==Variable||LA43_0==20||LA43_0==38) ) {
				alt43=1;
			}
			} finally {dbg.exitDecision(43);}

			switch (alt43) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:57:23: lExpr
					{
					dbg.location(57,23);
					pushFollow(FOLLOW_lExpr_in_lExpr677);
					lExpr120=lExpr();
					state._fsp--;

					adaptor.addChild(root_0, lExpr120.getTree());

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
		dbg.location(57, 28);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:59:1: startProgram : program ;
	public final while_astParser.startProgram_return startProgram() throws RecognitionException {
		while_astParser.startProgram_return retval = new while_astParser.startProgram_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope program121 =null;


		try { dbg.enterRule(getGrammarFileName(), "startProgram");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(59, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:60:2: ( program )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:60:4: program
			{
			root_0 = (Object)adaptor.nil();


			dbg.location(60,4);
			pushFollow(FOLLOW_program_in_startProgram687);
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
		dbg.location(60, 10);

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



	public static final BitSet FOLLOW_function_in_program147 = new BitSet(new long[]{0x0000000200000002L});
	public static final BitSet FOLLOW_program_in_program149 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_function157 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_Symbol_in_function159 = new BitSet(new long[]{0x0000000000840000L});
	public static final BitSet FOLLOW_WS_in_function161 = new BitSet(new long[]{0x0000000000800000L});
	public static final BitSet FOLLOW_23_in_function163 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_definition_in_function165 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_definition182 = new BitSet(new long[]{0x00000000000D0000L});
	public static final BitSet FOLLOW_WS_in_definition185 = new BitSet(new long[]{0x0000000000090000L});
	public static final BitSet FOLLOW_input_in_definition188 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_definition190 = new BitSet(new long[]{0x0000108900010000L});
	public static final BitSet FOLLOW_commands_in_definition192 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_definition194 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_definition196 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_output_in_definition198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inputSub_in_input210 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_inputSub220 = new BitSet(new long[]{0x0000000000440002L});
	public static final BitSet FOLLOW_WS_in_inputSub222 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_22_in_inputSub226 = new BitSet(new long[]{0x0000000000050000L});
	public static final BitSet FOLLOW_WS_in_inputSub227 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_inputSub_in_inputSub230 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_output240 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_22_in_output243 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_output_in_output245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_in_commands253 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_25_in_commands256 = new BitSet(new long[]{0x0000108900010000L});
	public static final BitSet FOLLOW_commands_in_commands258 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_command268 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decl_in_command270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_in_command272 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_while_in_command274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foreach_in_command276 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vars_in_decl287 = new BitSet(new long[]{0x0000000001040000L});
	public static final BitSet FOLLOW_WS_in_decl289 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_decl291 = new BitSet(new long[]{0x0000004000152000L});
	public static final BitSet FOLLOW_WS_in_decl292 = new BitSet(new long[]{0x0000004000112000L});
	public static final BitSet FOLLOW_exprs_in_decl295 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_if315 = new BitSet(new long[]{0x0000004000152000L});
	public static final BitSet FOLLOW_WS_in_if317 = new BitSet(new long[]{0x0000004000112000L});
	public static final BitSet FOLLOW_expression_in_if321 = new BitSet(new long[]{0x0000040000040000L});
	public static final BitSet FOLLOW_WS_in_if324 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_42_in_if327 = new BitSet(new long[]{0x0000108900050000L});
	public static final BitSet FOLLOW_WS_in_if329 = new BitSet(new long[]{0x0000108900010000L});
	public static final BitSet FOLLOW_commands_in_if332 = new BitSet(new long[]{0x0000000060040000L});
	public static final BitSet FOLLOW_WS_in_if335 = new BitSet(new long[]{0x0000000060040000L});
	public static final BitSet FOLLOW_29_in_if339 = new BitSet(new long[]{0x0000108900050000L});
	public static final BitSet FOLLOW_WS_in_if341 = new BitSet(new long[]{0x0000108900010000L});
	public static final BitSet FOLLOW_commands_in_if344 = new BitSet(new long[]{0x0000000040040000L});
	public static final BitSet FOLLOW_WS_in_if349 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_if352 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_while371 = new BitSet(new long[]{0x0000004000152000L});
	public static final BitSet FOLLOW_WS_in_while373 = new BitSet(new long[]{0x0000004000112000L});
	public static final BitSet FOLLOW_expression_in_while376 = new BitSet(new long[]{0x0000000010040000L});
	public static final BitSet FOLLOW_WS_in_while379 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_while382 = new BitSet(new long[]{0x0000108900050000L});
	public static final BitSet FOLLOW_WS_in_while384 = new BitSet(new long[]{0x0000108900010000L});
	public static final BitSet FOLLOW_commands_in_while387 = new BitSet(new long[]{0x0000010000040000L});
	public static final BitSet FOLLOW_WS_in_while390 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_while393 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_for411 = new BitSet(new long[]{0x0000004000152000L});
	public static final BitSet FOLLOW_WS_in_for413 = new BitSet(new long[]{0x0000004000112000L});
	public static final BitSet FOLLOW_expression_in_for417 = new BitSet(new long[]{0x0000000010040000L});
	public static final BitSet FOLLOW_WS_in_for419 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_for422 = new BitSet(new long[]{0x0000108900050000L});
	public static final BitSet FOLLOW_WS_in_for424 = new BitSet(new long[]{0x0000108900010000L});
	public static final BitSet FOLLOW_commands_in_for427 = new BitSet(new long[]{0x0000010000040000L});
	public static final BitSet FOLLOW_WS_in_for430 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_for433 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_foreach451 = new BitSet(new long[]{0x0000000000050000L});
	public static final BitSet FOLLOW_WS_in_foreach453 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_Variable_in_foreach456 = new BitSet(new long[]{0x0000001000040000L});
	public static final BitSet FOLLOW_WS_in_foreach458 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_foreach461 = new BitSet(new long[]{0x0000004000152000L});
	public static final BitSet FOLLOW_WS_in_foreach463 = new BitSet(new long[]{0x0000004000112000L});
	public static final BitSet FOLLOW_expression_in_foreach466 = new BitSet(new long[]{0x0000000010040000L});
	public static final BitSet FOLLOW_WS_in_foreach468 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_foreach471 = new BitSet(new long[]{0x0000108900050000L});
	public static final BitSet FOLLOW_WS_in_foreach473 = new BitSet(new long[]{0x0000108900010000L});
	public static final BitSet FOLLOW_commands_in_foreach476 = new BitSet(new long[]{0x0000010000040000L});
	public static final BitSet FOLLOW_WS_in_foreach478 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_40_in_foreach481 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_vars508 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_22_in_vars511 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_vars_in_vars513 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_exprs534 = new BitSet(new long[]{0x0000000000400002L});
	public static final BitSet FOLLOW_22_in_exprs537 = new BitSet(new long[]{0x0000004000112000L});
	public static final BitSet FOLLOW_exprs_in_exprs539 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_exprBase560 = new BitSet(new long[]{0x0000000000040002L});
	public static final BitSet FOLLOW_WS_in_exprBase561 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_exprBase569 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Symbol_in_exprBase575 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_exprBase581 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_exprBase583 = new BitSet(new long[]{0x0000004000112000L});
	public static final BitSet FOLLOW_lExpr_in_exprBase585 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_exprBase587 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_exprBase593 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_exprBase595 = new BitSet(new long[]{0x0000004000112000L});
	public static final BitSet FOLLOW_lExpr_in_exprBase597 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_exprBase599 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_exprBase606 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_exprBase608 = new BitSet(new long[]{0x0000004000112000L});
	public static final BitSet FOLLOW_exprBase_in_exprBase610 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_exprBase612 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_exprBase618 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_exprBase620 = new BitSet(new long[]{0x0000004000112000L});
	public static final BitSet FOLLOW_exprBase_in_exprBase622 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_exprBase624 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_exprBase631 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_Symbol_in_exprBase633 = new BitSet(new long[]{0x0000004000152000L});
	public static final BitSet FOLLOW_WS_in_exprBase635 = new BitSet(new long[]{0x0000004000112000L});
	public static final BitSet FOLLOW_lExpr_in_exprBase638 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_exprBase640 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprBase_in_expression651 = new BitSet(new long[]{0x0000000004040002L});
	public static final BitSet FOLLOW_WS_in_expression653 = new BitSet(new long[]{0x0000000004000002L});
	public static final BitSet FOLLOW_26_in_expression656 = new BitSet(new long[]{0x0000004000152000L});
	public static final BitSet FOLLOW_WS_in_expression658 = new BitSet(new long[]{0x0000004000112000L});
	public static final BitSet FOLLOW_exprBase_in_expression661 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprBase_in_lExpr671 = new BitSet(new long[]{0x0000004000152002L});
	public static final BitSet FOLLOW_WS_in_lExpr674 = new BitSet(new long[]{0x0000004000112002L});
	public static final BitSet FOLLOW_lExpr_in_lExpr677 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_program_in_startProgram687 = new BitSet(new long[]{0x0000000000000002L});
}
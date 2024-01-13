// $ANTLR 3.5.1 C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g 2024-01-13 17:18:28

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
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CALL", "COMMENT", "CONS", "Comment", 
		"DO", "Dec", "ELSE", "END", "EXPR", "EXPRBASE", "FOR", "FOREACH", "FUNCDEF", 
		"FUNCTION", "HD", "IF", "IN", "INPUTS", "LIST", "Maj", "Min", "NOT", "OUTPUT", 
		"PROGRAM", "START", "Symbol", "THEN", "TL", "VARDEF", "VARIABLES", "Variable", 
		"WHILE", "WS", "' '", "'%'", "'('", "')'", "','", "':'", "':='", "';'", 
		"'=?'", "'cons '", "'do'", "'else'", "'fi'", "'for'", "'foreach'", "'function'", 
		"'hd '", "'if'", "'in'", "'list '", "'nil'", "'nop'", "'od'", "'read'", 
		"'then'", "'tl '", "'while'", "'write '"
	};
	public static final int EOF=-1;
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
	public static final int T__60=60;
	public static final int T__61=61;
	public static final int T__62=62;
	public static final int T__63=63;
	public static final int T__64=64;
	public static final int CALL=4;
	public static final int COMMENT=5;
	public static final int CONS=6;
	public static final int Comment=7;
	public static final int DO=8;
	public static final int Dec=9;
	public static final int ELSE=10;
	public static final int END=11;
	public static final int EXPR=12;
	public static final int EXPRBASE=13;
	public static final int FOR=14;
	public static final int FOREACH=15;
	public static final int FUNCDEF=16;
	public static final int FUNCTION=17;
	public static final int HD=18;
	public static final int IF=19;
	public static final int IN=20;
	public static final int INPUTS=21;
	public static final int LIST=22;
	public static final int Maj=23;
	public static final int Min=24;
	public static final int NOT=25;
	public static final int OUTPUT=26;
	public static final int PROGRAM=27;
	public static final int START=28;
	public static final int Symbol=29;
	public static final int THEN=30;
	public static final int TL=31;
	public static final int VARDEF=32;
	public static final int VARIABLES=33;
	public static final int Variable=34;
	public static final int WHILE=35;
	public static final int WS=36;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "symbol", "lExpr", "list", "input", "getComment", "vars", 
		"variable", "symbolExpr", "function", "else_", "definition", "tl", "for_", 
		"nil_", "inputSub", "if_", "startProgram", "do_", "program", "hd", "cons", 
		"decl", "output", "while_", "command", "foreach_", "commands", "then_", 
		"exprBase", "exprs", "expression"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:37:1: startProgram : program -> ^( START program ) ;
	public final while_astParser.startProgram_return startProgram() throws RecognitionException {
		while_astParser.startProgram_return retval = new while_astParser.startProgram_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope program1 =null;

		RewriteRuleSubtreeStream stream_program=new RewriteRuleSubtreeStream(adaptor,"rule program");

		try { dbg.enterRule(getGrammarFileName(), "startProgram");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(37, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:38:5: ( program -> ^( START program ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:38:7: program
			{
			dbg.location(38,7);
			pushFollow(FOLLOW_program_in_startProgram223);
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
			// 38:15: -> ^( START program )
			{
				dbg.location(38,18);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:38:18: ^( START program )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(38,20);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(START, "START"), root_1);
				dbg.location(38,26);
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
		dbg.location(39, 4);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "startProgram");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "startProgram"


	public static class getComment_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "getComment"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:52:1: getComment : Comment -> ^( COMMENT Comment ) ;
	public final while_astParser.getComment_return getComment() throws RecognitionException {
		while_astParser.getComment_return retval = new while_astParser.getComment_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Comment2=null;

		Object Comment2_tree=null;
		RewriteRuleTokenStream stream_Comment=new RewriteRuleTokenStream(adaptor,"token Comment");

		try { dbg.enterRule(getGrammarFileName(), "getComment");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(52, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:53:2: ( Comment -> ^( COMMENT Comment ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:53:4: Comment
			{
			dbg.location(53,4);
			Comment2=(Token)match(input,Comment,FOLLOW_Comment_in_getComment402);  
			stream_Comment.add(Comment2);

			// AST REWRITE
			// elements: Comment
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 53:12: -> ^( COMMENT Comment )
			{
				dbg.location(53,15);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:53:15: ^( COMMENT Comment )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(53,17);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMMENT, "COMMENT"), root_1);
				dbg.location(53,25);
				adaptor.addChild(root_1, stream_Comment.nextNode());
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
		dbg.location(53, 32);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "getComment");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "getComment"


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:55:1: program : function ( WS )* ( program )? -> ^( PROGRAM function ( program )? ) ;
	public final while_astParser.program_return program() throws RecognitionException {
		while_astParser.program_return retval = new while_astParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WS4=null;
		ParserRuleReturnScope function3 =null;
		ParserRuleReturnScope program5 =null;

		Object WS4_tree=null;
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_function=new RewriteRuleSubtreeStream(adaptor,"rule function");
		RewriteRuleSubtreeStream stream_program=new RewriteRuleSubtreeStream(adaptor,"rule program");

		try { dbg.enterRule(getGrammarFileName(), "program");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(55, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:56:5: ( function ( WS )* ( program )? -> ^( PROGRAM function ( program )? ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:56:7: function ( WS )* ( program )?
			{
			dbg.location(56,7);
			pushFollow(FOLLOW_function_in_program422);
			function3=function();
			state._fsp--;

			stream_function.add(function3.getTree());dbg.location(56,16);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:56:16: ( WS )*
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( (LA1_0==WS) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:56:16: WS
					{
					dbg.location(56,16);
					WS4=(Token)match(input,WS,FOLLOW_WS_in_program424);  
					stream_WS.add(WS4);

					}
					break;

				default :
					break loop1;
				}
			}
			} finally {dbg.exitSubRule(1);}
			dbg.location(56,20);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:56:20: ( program )?
			int alt2=2;
			try { dbg.enterSubRule(2);
			try { dbg.enterDecision(2, decisionCanBacktrack[2]);

			int LA2_0 = input.LA(1);
			if ( (LA2_0==Comment||LA2_0==52) ) {
				alt2=1;
			}
			} finally {dbg.exitDecision(2);}

			switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:56:20: program
					{
					dbg.location(56,20);
					pushFollow(FOLLOW_program_in_program427);
					program5=program();
					state._fsp--;

					stream_program.add(program5.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(2);}

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
			// 56:29: -> ^( PROGRAM function ( program )? )
			{
				dbg.location(56,32);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:56:32: ^( PROGRAM function ( program )? )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(56,34);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);
				dbg.location(56,42);
				adaptor.addChild(root_1, stream_function.nextTree());dbg.location(56,51);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:56:51: ( program )?
				if ( stream_program.hasNext() ) {
					dbg.location(56,51);
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
		dbg.location(57, 4);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:59:1: function : ( getComment )? 'function' ( WS )* symbol ( WS )* ':' ( getComment )? ( WS )* definition -> ^( FUNCDEF symbol definition ( getComment )? END ) ;
	public final while_astParser.function_return function() throws RecognitionException {
		while_astParser.function_return retval = new while_astParser.function_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal7=null;
		Token WS8=null;
		Token WS10=null;
		Token char_literal11=null;
		Token WS13=null;
		ParserRuleReturnScope getComment6 =null;
		ParserRuleReturnScope symbol9 =null;
		ParserRuleReturnScope getComment12 =null;
		ParserRuleReturnScope definition14 =null;

		Object string_literal7_tree=null;
		Object WS8_tree=null;
		Object WS10_tree=null;
		Object char_literal11_tree=null;
		Object WS13_tree=null;
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleSubtreeStream stream_symbol=new RewriteRuleSubtreeStream(adaptor,"rule symbol");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");
		RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"rule definition");

		try { dbg.enterRule(getGrammarFileName(), "function");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(59, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:60:5: ( ( getComment )? 'function' ( WS )* symbol ( WS )* ':' ( getComment )? ( WS )* definition -> ^( FUNCDEF symbol definition ( getComment )? END ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:60:7: ( getComment )? 'function' ( WS )* symbol ( WS )* ':' ( getComment )? ( WS )* definition
			{
			dbg.location(60,7);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:60:7: ( getComment )?
			int alt3=2;
			try { dbg.enterSubRule(3);
			try { dbg.enterDecision(3, decisionCanBacktrack[3]);

			int LA3_0 = input.LA(1);
			if ( (LA3_0==Comment) ) {
				alt3=1;
			}
			} finally {dbg.exitDecision(3);}

			switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:60:7: getComment
					{
					dbg.location(60,7);
					pushFollow(FOLLOW_getComment_in_function458);
					getComment6=getComment();
					state._fsp--;

					stream_getComment.add(getComment6.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(3);}
			dbg.location(60,19);
			string_literal7=(Token)match(input,52,FOLLOW_52_in_function461);  
			stream_52.add(string_literal7);
			dbg.location(60,30);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:60:30: ( WS )*
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:60:30: WS
					{
					dbg.location(60,30);
					WS8=(Token)match(input,WS,FOLLOW_WS_in_function463);  
					stream_WS.add(WS8);

					}
					break;

				default :
					break loop4;
				}
			}
			} finally {dbg.exitSubRule(4);}
			dbg.location(60,34);
			pushFollow(FOLLOW_symbol_in_function466);
			symbol9=symbol();
			state._fsp--;

			stream_symbol.add(symbol9.getTree());dbg.location(60,41);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:60:41: ( WS )*
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:60:41: WS
					{
					dbg.location(60,41);
					WS10=(Token)match(input,WS,FOLLOW_WS_in_function468);  
					stream_WS.add(WS10);

					}
					break;

				default :
					break loop5;
				}
			}
			} finally {dbg.exitSubRule(5);}
			dbg.location(60,45);
			char_literal11=(Token)match(input,42,FOLLOW_42_in_function471);  
			stream_42.add(char_literal11);
			dbg.location(60,49);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:60:49: ( getComment )?
			int alt6=2;
			try { dbg.enterSubRule(6);
			try { dbg.enterDecision(6, decisionCanBacktrack[6]);

			int LA6_0 = input.LA(1);
			if ( (LA6_0==Comment) ) {
				alt6=1;
			}
			} finally {dbg.exitDecision(6);}

			switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:60:49: getComment
					{
					dbg.location(60,49);
					pushFollow(FOLLOW_getComment_in_function473);
					getComment12=getComment();
					state._fsp--;

					stream_getComment.add(getComment12.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(6);}
			dbg.location(60,61);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:60:61: ( WS )*
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:60:61: WS
					{
					dbg.location(60,61);
					WS13=(Token)match(input,WS,FOLLOW_WS_in_function476);  
					stream_WS.add(WS13);

					}
					break;

				default :
					break loop7;
				}
			}
			} finally {dbg.exitSubRule(7);}
			dbg.location(60,65);
			pushFollow(FOLLOW_definition_in_function479);
			definition14=definition();
			state._fsp--;

			stream_definition.add(definition14.getTree());
			// AST REWRITE
			// elements: getComment, definition, symbol
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 60:76: -> ^( FUNCDEF symbol definition ( getComment )? END )
			{
				dbg.location(60,79);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:60:79: ^( FUNCDEF symbol definition ( getComment )? END )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(60,81);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCDEF, "FUNCDEF"), root_1);
				dbg.location(60,89);
				adaptor.addChild(root_1, stream_symbol.nextTree());dbg.location(60,96);
				adaptor.addChild(root_1, stream_definition.nextTree());dbg.location(60,107);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:60:107: ( getComment )?
				if ( stream_getComment.hasNext() ) {
					dbg.location(60,107);
					adaptor.addChild(root_1, stream_getComment.nextTree());
				}
				stream_getComment.reset();
				dbg.location(60,119);
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
		dbg.location(61, 4);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:63:1: definition : 'read' ( WS )* input '%' ( getComment )? ( WS )* commands ( WS )* '%' ( getComment )? ( WS )* 'write ' output ( getComment )? -> ^( FUNCTION input commands output ( getComment )? ) ;
	public final while_astParser.definition_return definition() throws RecognitionException {
		while_astParser.definition_return retval = new while_astParser.definition_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal15=null;
		Token WS16=null;
		Token char_literal18=null;
		Token WS20=null;
		Token WS22=null;
		Token char_literal23=null;
		Token WS25=null;
		Token string_literal26=null;
		ParserRuleReturnScope input17 =null;
		ParserRuleReturnScope getComment19 =null;
		ParserRuleReturnScope commands21 =null;
		ParserRuleReturnScope getComment24 =null;
		ParserRuleReturnScope output27 =null;
		ParserRuleReturnScope getComment28 =null;

		Object string_literal15_tree=null;
		Object WS16_tree=null;
		Object char_literal18_tree=null;
		Object WS20_tree=null;
		Object WS22_tree=null;
		Object char_literal23_tree=null;
		Object WS25_tree=null;
		Object string_literal26_tree=null;
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
		RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");
		RewriteRuleSubtreeStream stream_input=new RewriteRuleSubtreeStream(adaptor,"rule input");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try { dbg.enterRule(getGrammarFileName(), "definition");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(63, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:64:5: ( 'read' ( WS )* input '%' ( getComment )? ( WS )* commands ( WS )* '%' ( getComment )? ( WS )* 'write ' output ( getComment )? -> ^( FUNCTION input commands output ( getComment )? ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:64:7: 'read' ( WS )* input '%' ( getComment )? ( WS )* commands ( WS )* '%' ( getComment )? ( WS )* 'write ' output ( getComment )?
			{
			dbg.location(64,7);
			string_literal15=(Token)match(input,60,FOLLOW_60_in_definition512);  
			stream_60.add(string_literal15);
			dbg.location(64,14);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:64:14: ( WS )*
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:64:14: WS
					{
					dbg.location(64,14);
					WS16=(Token)match(input,WS,FOLLOW_WS_in_definition514);  
					stream_WS.add(WS16);

					}
					break;

				default :
					break loop8;
				}
			}
			} finally {dbg.exitSubRule(8);}
			dbg.location(64,18);
			pushFollow(FOLLOW_input_in_definition517);
			input17=input();
			state._fsp--;

			stream_input.add(input17.getTree());dbg.location(64,24);
			char_literal18=(Token)match(input,38,FOLLOW_38_in_definition519);  
			stream_38.add(char_literal18);
			dbg.location(64,28);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:64:28: ( getComment )?
			int alt9=2;
			try { dbg.enterSubRule(9);
			try { dbg.enterDecision(9, decisionCanBacktrack[9]);

			int LA9_0 = input.LA(1);
			if ( (LA9_0==Comment) ) {
				alt9=1;
			}
			} finally {dbg.exitDecision(9);}

			switch (alt9) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:64:28: getComment
					{
					dbg.location(64,28);
					pushFollow(FOLLOW_getComment_in_definition521);
					getComment19=getComment();
					state._fsp--;

					stream_getComment.add(getComment19.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(9);}
			dbg.location(64,40);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:64:40: ( WS )*
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:64:40: WS
					{
					dbg.location(64,40);
					WS20=(Token)match(input,WS,FOLLOW_WS_in_definition524);  
					stream_WS.add(WS20);

					}
					break;

				default :
					break loop10;
				}
			}
			} finally {dbg.exitSubRule(10);}
			dbg.location(64,44);
			pushFollow(FOLLOW_commands_in_definition527);
			commands21=commands();
			state._fsp--;

			stream_commands.add(commands21.getTree());dbg.location(64,53);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:64:53: ( WS )*
			try { dbg.enterSubRule(11);

			loop11:
			while (true) {
				int alt11=2;
				try { dbg.enterDecision(11, decisionCanBacktrack[11]);

				int LA11_0 = input.LA(1);
				if ( (LA11_0==WS) ) {
					alt11=1;
				}

				} finally {dbg.exitDecision(11);}

				switch (alt11) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:64:53: WS
					{
					dbg.location(64,53);
					WS22=(Token)match(input,WS,FOLLOW_WS_in_definition529);  
					stream_WS.add(WS22);

					}
					break;

				default :
					break loop11;
				}
			}
			} finally {dbg.exitSubRule(11);}
			dbg.location(64,57);
			char_literal23=(Token)match(input,38,FOLLOW_38_in_definition532);  
			stream_38.add(char_literal23);
			dbg.location(64,61);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:64:61: ( getComment )?
			int alt12=2;
			try { dbg.enterSubRule(12);
			try { dbg.enterDecision(12, decisionCanBacktrack[12]);

			int LA12_0 = input.LA(1);
			if ( (LA12_0==Comment) ) {
				alt12=1;
			}
			} finally {dbg.exitDecision(12);}

			switch (alt12) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:64:61: getComment
					{
					dbg.location(64,61);
					pushFollow(FOLLOW_getComment_in_definition534);
					getComment24=getComment();
					state._fsp--;

					stream_getComment.add(getComment24.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(12);}
			dbg.location(64,73);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:64:73: ( WS )*
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:64:73: WS
					{
					dbg.location(64,73);
					WS25=(Token)match(input,WS,FOLLOW_WS_in_definition537);  
					stream_WS.add(WS25);

					}
					break;

				default :
					break loop13;
				}
			}
			} finally {dbg.exitSubRule(13);}
			dbg.location(64,77);
			string_literal26=(Token)match(input,64,FOLLOW_64_in_definition540);  
			stream_64.add(string_literal26);
			dbg.location(64,86);
			pushFollow(FOLLOW_output_in_definition542);
			output27=output();
			state._fsp--;

			stream_output.add(output27.getTree());dbg.location(64,93);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:64:93: ( getComment )?
			int alt14=2;
			try { dbg.enterSubRule(14);
			try { dbg.enterDecision(14, decisionCanBacktrack[14]);

			int LA14_0 = input.LA(1);
			if ( (LA14_0==Comment) ) {
				alt14=1;
			}
			} finally {dbg.exitDecision(14);}

			switch (alt14) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:64:93: getComment
					{
					dbg.location(64,93);
					pushFollow(FOLLOW_getComment_in_definition544);
					getComment28=getComment();
					state._fsp--;

					stream_getComment.add(getComment28.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(14);}

			// AST REWRITE
			// elements: input, getComment, commands, output
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 64:104: -> ^( FUNCTION input commands output ( getComment )? )
			{
				dbg.location(64,107);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:64:107: ^( FUNCTION input commands output ( getComment )? )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(64,109);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION, "FUNCTION"), root_1);
				dbg.location(64,118);
				adaptor.addChild(root_1, stream_input.nextTree());dbg.location(64,124);
				adaptor.addChild(root_1, stream_commands.nextTree());dbg.location(64,133);
				adaptor.addChild(root_1, stream_output.nextTree());dbg.location(64,140);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:64:140: ( getComment )?
				if ( stream_getComment.hasNext() ) {
					dbg.location(64,140);
					adaptor.addChild(root_1, stream_getComment.nextTree());
				}
				stream_getComment.reset();

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
		dbg.location(65, 4);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:67:1: input : ( inputSub )? ( getComment )? -> ^( INPUTS ( inputSub )? ( getComment )? ) ;
	public final while_astParser.input_return input() throws RecognitionException {
		while_astParser.input_return retval = new while_astParser.input_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope inputSub29 =null;
		ParserRuleReturnScope getComment30 =null;

		RewriteRuleSubtreeStream stream_inputSub=new RewriteRuleSubtreeStream(adaptor,"rule inputSub");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");

		try { dbg.enterRule(getGrammarFileName(), "input");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(67, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:68:5: ( ( inputSub )? ( getComment )? -> ^( INPUTS ( inputSub )? ( getComment )? ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:68:7: ( inputSub )? ( getComment )?
			{
			dbg.location(68,7);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:68:7: ( inputSub )?
			int alt15=2;
			try { dbg.enterSubRule(15);
			try { dbg.enterDecision(15, decisionCanBacktrack[15]);

			int LA15_0 = input.LA(1);
			if ( (LA15_0==Variable) ) {
				alt15=1;
			}
			} finally {dbg.exitDecision(15);}

			switch (alt15) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:68:7: inputSub
					{
					dbg.location(68,7);
					pushFollow(FOLLOW_inputSub_in_input576);
					inputSub29=inputSub();
					state._fsp--;

					stream_inputSub.add(inputSub29.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(15);}
			dbg.location(68,17);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:68:17: ( getComment )?
			int alt16=2;
			try { dbg.enterSubRule(16);
			try { dbg.enterDecision(16, decisionCanBacktrack[16]);

			int LA16_0 = input.LA(1);
			if ( (LA16_0==Comment) ) {
				alt16=1;
			}
			} finally {dbg.exitDecision(16);}

			switch (alt16) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:68:17: getComment
					{
					dbg.location(68,17);
					pushFollow(FOLLOW_getComment_in_input579);
					getComment30=getComment();
					state._fsp--;

					stream_getComment.add(getComment30.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(16);}

			// AST REWRITE
			// elements: getComment, inputSub
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 68:29: -> ^( INPUTS ( inputSub )? ( getComment )? )
			{
				dbg.location(68,33);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:68:33: ^( INPUTS ( inputSub )? ( getComment )? )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(68,35);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INPUTS, "INPUTS"), root_1);
				dbg.location(68,42);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:68:42: ( inputSub )?
				if ( stream_inputSub.hasNext() ) {
					dbg.location(68,42);
					adaptor.addChild(root_1, stream_inputSub.nextTree());
				}
				stream_inputSub.reset();
				dbg.location(68,52);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:68:52: ( getComment )?
				if ( stream_getComment.hasNext() ) {
					dbg.location(68,52);
					adaptor.addChild(root_1, stream_getComment.nextTree());
				}
				stream_getComment.reset();

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
		dbg.location(69, 4);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:71:1: inputSub : variable ( WS )* ( ',' ( WS )* inputSub )? -> variable ( inputSub )? ;
	public final while_astParser.inputSub_return inputSub() throws RecognitionException {
		while_astParser.inputSub_return retval = new while_astParser.inputSub_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WS32=null;
		Token char_literal33=null;
		Token WS34=null;
		ParserRuleReturnScope variable31 =null;
		ParserRuleReturnScope inputSub35 =null;

		Object WS32_tree=null;
		Object char_literal33_tree=null;
		Object WS34_tree=null;
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
		RewriteRuleSubtreeStream stream_inputSub=new RewriteRuleSubtreeStream(adaptor,"rule inputSub");

		try { dbg.enterRule(getGrammarFileName(), "inputSub");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(71, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:72:5: ( variable ( WS )* ( ',' ( WS )* inputSub )? -> variable ( inputSub )? )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:72:7: variable ( WS )* ( ',' ( WS )* inputSub )?
			{
			dbg.location(72,7);
			pushFollow(FOLLOW_variable_in_inputSub610);
			variable31=variable();
			state._fsp--;

			stream_variable.add(variable31.getTree());dbg.location(72,16);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:72:16: ( WS )*
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:72:16: WS
					{
					dbg.location(72,16);
					WS32=(Token)match(input,WS,FOLLOW_WS_in_inputSub612);  
					stream_WS.add(WS32);

					}
					break;

				default :
					break loop17;
				}
			}
			} finally {dbg.exitSubRule(17);}
			dbg.location(72,20);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:72:20: ( ',' ( WS )* inputSub )?
			int alt19=2;
			try { dbg.enterSubRule(19);
			try { dbg.enterDecision(19, decisionCanBacktrack[19]);

			int LA19_0 = input.LA(1);
			if ( (LA19_0==41) ) {
				alt19=1;
			}
			} finally {dbg.exitDecision(19);}

			switch (alt19) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:72:21: ',' ( WS )* inputSub
					{
					dbg.location(72,21);
					char_literal33=(Token)match(input,41,FOLLOW_41_in_inputSub616);  
					stream_41.add(char_literal33);
					dbg.location(72,25);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:72:25: ( WS )*
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

							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:72:25: WS
							{
							dbg.location(72,25);
							WS34=(Token)match(input,WS,FOLLOW_WS_in_inputSub618);  
							stream_WS.add(WS34);

							}
							break;

						default :
							break loop18;
						}
					}
					} finally {dbg.exitSubRule(18);}
					dbg.location(72,29);
					pushFollow(FOLLOW_inputSub_in_inputSub621);
					inputSub35=inputSub();
					state._fsp--;

					stream_inputSub.add(inputSub35.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(19);}

			// AST REWRITE
			// elements: variable, inputSub
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 72:40: -> variable ( inputSub )?
			{
				dbg.location(72,43);
				adaptor.addChild(root_0, stream_variable.nextTree());dbg.location(72,52);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:72:52: ( inputSub )?
				if ( stream_inputSub.hasNext() ) {
					dbg.location(72,52);
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
		dbg.location(73, 4);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:75:1: output : variable ( WS )* ( ',' ( WS )* output )? -> ^( OUTPUT variable ( output )? ) ;
	public final while_astParser.output_return output() throws RecognitionException {
		while_astParser.output_return retval = new while_astParser.output_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WS37=null;
		Token char_literal38=null;
		Token WS39=null;
		ParserRuleReturnScope variable36 =null;
		ParserRuleReturnScope output40 =null;

		Object WS37_tree=null;
		Object char_literal38_tree=null;
		Object WS39_tree=null;
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");
		RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");

		try { dbg.enterRule(getGrammarFileName(), "output");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(75, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:76:5: ( variable ( WS )* ( ',' ( WS )* output )? -> ^( OUTPUT variable ( output )? ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:76:7: variable ( WS )* ( ',' ( WS )* output )?
			{
			dbg.location(76,7);
			pushFollow(FOLLOW_variable_in_output648);
			variable36=variable();
			state._fsp--;

			stream_variable.add(variable36.getTree());dbg.location(76,16);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:76:16: ( WS )*
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:76:16: WS
					{
					dbg.location(76,16);
					WS37=(Token)match(input,WS,FOLLOW_WS_in_output650);  
					stream_WS.add(WS37);

					}
					break;

				default :
					break loop20;
				}
			}
			} finally {dbg.exitSubRule(20);}
			dbg.location(76,20);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:76:20: ( ',' ( WS )* output )?
			int alt22=2;
			try { dbg.enterSubRule(22);
			try { dbg.enterDecision(22, decisionCanBacktrack[22]);

			int LA22_0 = input.LA(1);
			if ( (LA22_0==41) ) {
				alt22=1;
			}
			} finally {dbg.exitDecision(22);}

			switch (alt22) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:76:21: ',' ( WS )* output
					{
					dbg.location(76,21);
					char_literal38=(Token)match(input,41,FOLLOW_41_in_output654);  
					stream_41.add(char_literal38);
					dbg.location(76,25);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:76:25: ( WS )*
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

							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:76:25: WS
							{
							dbg.location(76,25);
							WS39=(Token)match(input,WS,FOLLOW_WS_in_output656);  
							stream_WS.add(WS39);

							}
							break;

						default :
							break loop21;
						}
					}
					} finally {dbg.exitSubRule(21);}
					dbg.location(76,29);
					pushFollow(FOLLOW_output_in_output659);
					output40=output();
					state._fsp--;

					stream_output.add(output40.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(22);}

			// AST REWRITE
			// elements: output, variable
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 76:38: -> ^( OUTPUT variable ( output )? )
			{
				dbg.location(76,41);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:76:41: ^( OUTPUT variable ( output )? )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(76,43);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OUTPUT, "OUTPUT"), root_1);
				dbg.location(76,50);
				adaptor.addChild(root_1, stream_variable.nextTree());dbg.location(76,59);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:76:59: ( output )?
				if ( stream_output.hasNext() ) {
					dbg.location(76,59);
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
		dbg.location(77, 4);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:79:1: commands : command ( ( WS )* ';' ( WS )* commands )? -> command ( commands )? ;
	public final while_astParser.commands_return commands() throws RecognitionException {
		while_astParser.commands_return retval = new while_astParser.commands_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WS42=null;
		Token char_literal43=null;
		Token WS44=null;
		ParserRuleReturnScope command41 =null;
		ParserRuleReturnScope commands45 =null;

		Object WS42_tree=null;
		Object char_literal43_tree=null;
		Object WS44_tree=null;
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_command=new RewriteRuleSubtreeStream(adaptor,"rule command");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try { dbg.enterRule(getGrammarFileName(), "commands");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(79, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:80:5: ( command ( ( WS )* ';' ( WS )* commands )? -> command ( commands )? )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:80:7: command ( ( WS )* ';' ( WS )* commands )?
			{
			dbg.location(80,7);
			pushFollow(FOLLOW_command_in_commands689);
			command41=command();
			state._fsp--;

			stream_command.add(command41.getTree());dbg.location(80,15);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:80:15: ( ( WS )* ';' ( WS )* commands )?
			int alt25=2;
			try { dbg.enterSubRule(25);
			try { dbg.enterDecision(25, decisionCanBacktrack[25]);

			try {
				isCyclicDecision = true;
				alt25 = dfa25.predict(input);
			}
			catch (NoViableAltException nvae) {
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(25);}

			switch (alt25) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:80:17: ( WS )* ';' ( WS )* commands
					{
					dbg.location(80,17);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:80:17: ( WS )*
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

							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:80:17: WS
							{
							dbg.location(80,17);
							WS42=(Token)match(input,WS,FOLLOW_WS_in_commands693);  
							stream_WS.add(WS42);

							}
							break;

						default :
							break loop23;
						}
					}
					} finally {dbg.exitSubRule(23);}
					dbg.location(80,21);
					char_literal43=(Token)match(input,44,FOLLOW_44_in_commands696);  
					stream_44.add(char_literal43);
					dbg.location(80,25);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:80:25: ( WS )*
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

							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:80:25: WS
							{
							dbg.location(80,25);
							WS44=(Token)match(input,WS,FOLLOW_WS_in_commands698);  
							stream_WS.add(WS44);

							}
							break;

						default :
							break loop24;
						}
					}
					} finally {dbg.exitSubRule(24);}
					dbg.location(80,29);
					pushFollow(FOLLOW_commands_in_commands701);
					commands45=commands();
					state._fsp--;

					stream_commands.add(commands45.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(25);}

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
			// 80:40: -> command ( commands )?
			{
				dbg.location(80,43);
				adaptor.addChild(root_0, stream_command.nextTree());dbg.location(80,51);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:80:51: ( commands )?
				if ( stream_commands.hasNext() ) {
					dbg.location(80,51);
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
		dbg.location(81, 4);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:83:1: command : ( 'nop' | decl | if_ | for_ | while_ | foreach_ | expression );
	public final while_astParser.command_return command() throws RecognitionException {
		while_astParser.command_return retval = new while_astParser.command_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal46=null;
		ParserRuleReturnScope decl47 =null;
		ParserRuleReturnScope if_48 =null;
		ParserRuleReturnScope for_49 =null;
		ParserRuleReturnScope while_50 =null;
		ParserRuleReturnScope foreach_51 =null;
		ParserRuleReturnScope expression52 =null;

		Object string_literal46_tree=null;

		try { dbg.enterRule(getGrammarFileName(), "command");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(83, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:84:5: ( 'nop' | decl | if_ | for_ | while_ | foreach_ | expression )
			int alt26=7;
			try { dbg.enterDecision(26, decisionCanBacktrack[26]);

			try {
				isCyclicDecision = true;
				alt26 = dfa26.predict(input);
			}
			catch (NoViableAltException nvae) {
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(26);}

			switch (alt26) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:84:7: 'nop'
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(84,7);
					string_literal46=(Token)match(input,58,FOLLOW_58_in_command728); 
					string_literal46_tree = (Object)adaptor.create(string_literal46);
					adaptor.addChild(root_0, string_literal46_tree);

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:84:15: decl
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(84,15);
					pushFollow(FOLLOW_decl_in_command732);
					decl47=decl();
					state._fsp--;

					adaptor.addChild(root_0, decl47.getTree());

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:84:22: if_
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(84,22);
					pushFollow(FOLLOW_if__in_command736);
					if_48=if_();
					state._fsp--;

					adaptor.addChild(root_0, if_48.getTree());

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:84:28: for_
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(84,28);
					pushFollow(FOLLOW_for__in_command740);
					for_49=for_();
					state._fsp--;

					adaptor.addChild(root_0, for_49.getTree());

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:84:35: while_
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(84,35);
					pushFollow(FOLLOW_while__in_command744);
					while_50=while_();
					state._fsp--;

					adaptor.addChild(root_0, while_50.getTree());

					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:84:44: foreach_
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(84,44);
					pushFollow(FOLLOW_foreach__in_command748);
					foreach_51=foreach_();
					state._fsp--;

					adaptor.addChild(root_0, foreach_51.getTree());

					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:84:55: expression
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(84,55);
					pushFollow(FOLLOW_expression_in_command752);
					expression52=expression();
					state._fsp--;

					adaptor.addChild(root_0, expression52.getTree());

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
		dbg.location(84, 64);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:86:1: decl : ( vars ( WS )* ':=' ( WS )* exprs ) ( getComment )? -> ^( VARDEF vars exprs ( getComment )? ) ;
	public final while_astParser.decl_return decl() throws RecognitionException {
		while_astParser.decl_return retval = new while_astParser.decl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WS54=null;
		Token string_literal55=null;
		Token WS56=null;
		ParserRuleReturnScope vars53 =null;
		ParserRuleReturnScope exprs57 =null;
		ParserRuleReturnScope getComment58 =null;

		Object WS54_tree=null;
		Object string_literal55_tree=null;
		Object WS56_tree=null;
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");
		RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");

		try { dbg.enterRule(getGrammarFileName(), "decl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(86, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:87:5: ( ( vars ( WS )* ':=' ( WS )* exprs ) ( getComment )? -> ^( VARDEF vars exprs ( getComment )? ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:87:7: ( vars ( WS )* ':=' ( WS )* exprs ) ( getComment )?
			{
			dbg.location(87,7);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:87:7: ( vars ( WS )* ':=' ( WS )* exprs )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:87:8: vars ( WS )* ':=' ( WS )* exprs
			{
			dbg.location(87,8);
			pushFollow(FOLLOW_vars_in_decl765);
			vars53=vars();
			state._fsp--;

			stream_vars.add(vars53.getTree());dbg.location(87,13);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:87:13: ( WS )*
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:87:13: WS
					{
					dbg.location(87,13);
					WS54=(Token)match(input,WS,FOLLOW_WS_in_decl767);  
					stream_WS.add(WS54);

					}
					break;

				default :
					break loop27;
				}
			}
			} finally {dbg.exitSubRule(27);}
			dbg.location(87,17);
			string_literal55=(Token)match(input,43,FOLLOW_43_in_decl770);  
			stream_43.add(string_literal55);
			dbg.location(87,22);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:87:22: ( WS )*
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:87:22: WS
					{
					dbg.location(87,22);
					WS56=(Token)match(input,WS,FOLLOW_WS_in_decl772);  
					stream_WS.add(WS56);

					}
					break;

				default :
					break loop28;
				}
			}
			} finally {dbg.exitSubRule(28);}
			dbg.location(87,26);
			pushFollow(FOLLOW_exprs_in_decl775);
			exprs57=exprs();
			state._fsp--;

			stream_exprs.add(exprs57.getTree());
			}
			dbg.location(87,33);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:87:33: ( getComment )?
			int alt29=2;
			try { dbg.enterSubRule(29);
			try { dbg.enterDecision(29, decisionCanBacktrack[29]);

			int LA29_0 = input.LA(1);
			if ( (LA29_0==Comment) ) {
				alt29=1;
			}
			} finally {dbg.exitDecision(29);}

			switch (alt29) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:87:33: getComment
					{
					dbg.location(87,33);
					pushFollow(FOLLOW_getComment_in_decl778);
					getComment58=getComment();
					state._fsp--;

					stream_getComment.add(getComment58.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(29);}

			// AST REWRITE
			// elements: exprs, getComment, vars
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 87:45: -> ^( VARDEF vars exprs ( getComment )? )
			{
				dbg.location(87,48);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:87:48: ^( VARDEF vars exprs ( getComment )? )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(87,50);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARDEF, "VARDEF"), root_1);
				dbg.location(87,57);
				adaptor.addChild(root_1, stream_vars.nextTree());dbg.location(87,62);
				adaptor.addChild(root_1, stream_exprs.nextTree());dbg.location(87,68);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:87:68: ( getComment )?
				if ( stream_getComment.hasNext() ) {
					dbg.location(87,68);
					adaptor.addChild(root_1, stream_getComment.nextTree());
				}
				stream_getComment.reset();

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:90:1: if_ : ( 'if' ( WS )* expression ( WS )* then_ ( WS )* ( else_ ( WS )* )? 'fi' ( getComment )? ) -> ^( IF expression then_ ( else_ )? ( getComment )? END ) ;
	public final while_astParser.if__return if_() throws RecognitionException {
		while_astParser.if__return retval = new while_astParser.if__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal59=null;
		Token WS60=null;
		Token WS62=null;
		Token WS64=null;
		Token WS66=null;
		Token string_literal67=null;
		ParserRuleReturnScope expression61 =null;
		ParserRuleReturnScope then_63 =null;
		ParserRuleReturnScope else_65 =null;
		ParserRuleReturnScope getComment68 =null;

		Object string_literal59_tree=null;
		Object WS60_tree=null;
		Object WS62_tree=null;
		Object WS64_tree=null;
		Object WS66_tree=null;
		Object string_literal67_tree=null;
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_then_=new RewriteRuleSubtreeStream(adaptor,"rule then_");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_else_=new RewriteRuleSubtreeStream(adaptor,"rule else_");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");

		try { dbg.enterRule(getGrammarFileName(), "if_");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(90, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:91:5: ( ( 'if' ( WS )* expression ( WS )* then_ ( WS )* ( else_ ( WS )* )? 'fi' ( getComment )? ) -> ^( IF expression then_ ( else_ )? ( getComment )? END ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:91:7: ( 'if' ( WS )* expression ( WS )* then_ ( WS )* ( else_ ( WS )* )? 'fi' ( getComment )? )
			{
			dbg.location(91,7);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:91:7: ( 'if' ( WS )* expression ( WS )* then_ ( WS )* ( else_ ( WS )* )? 'fi' ( getComment )? )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:91:8: 'if' ( WS )* expression ( WS )* then_ ( WS )* ( else_ ( WS )* )? 'fi' ( getComment )?
			{
			dbg.location(91,8);
			string_literal59=(Token)match(input,54,FOLLOW_54_in_if_812);  
			stream_54.add(string_literal59);
			dbg.location(91,13);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:91:13: ( WS )*
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:91:13: WS
					{
					dbg.location(91,13);
					WS60=(Token)match(input,WS,FOLLOW_WS_in_if_814);  
					stream_WS.add(WS60);

					}
					break;

				default :
					break loop30;
				}
			}
			} finally {dbg.exitSubRule(30);}
			dbg.location(91,17);
			pushFollow(FOLLOW_expression_in_if_817);
			expression61=expression();
			state._fsp--;

			stream_expression.add(expression61.getTree());dbg.location(91,28);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:91:28: ( WS )*
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:91:28: WS
					{
					dbg.location(91,28);
					WS62=(Token)match(input,WS,FOLLOW_WS_in_if_819);  
					stream_WS.add(WS62);

					}
					break;

				default :
					break loop31;
				}
			}
			} finally {dbg.exitSubRule(31);}
			dbg.location(91,32);
			pushFollow(FOLLOW_then__in_if_822);
			then_63=then_();
			state._fsp--;

			stream_then_.add(then_63.getTree());dbg.location(91,38);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:91:38: ( WS )*
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:91:38: WS
					{
					dbg.location(91,38);
					WS64=(Token)match(input,WS,FOLLOW_WS_in_if_824);  
					stream_WS.add(WS64);

					}
					break;

				default :
					break loop32;
				}
			}
			} finally {dbg.exitSubRule(32);}
			dbg.location(91,42);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:91:42: ( else_ ( WS )* )?
			int alt34=2;
			try { dbg.enterSubRule(34);
			try { dbg.enterDecision(34, decisionCanBacktrack[34]);

			int LA34_0 = input.LA(1);
			if ( (LA34_0==48) ) {
				alt34=1;
			}
			} finally {dbg.exitDecision(34);}

			switch (alt34) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:91:43: else_ ( WS )*
					{
					dbg.location(91,43);
					pushFollow(FOLLOW_else__in_if_828);
					else_65=else_();
					state._fsp--;

					stream_else_.add(else_65.getTree());dbg.location(91,49);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:91:49: ( WS )*
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

							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:91:49: WS
							{
							dbg.location(91,49);
							WS66=(Token)match(input,WS,FOLLOW_WS_in_if_830);  
							stream_WS.add(WS66);

							}
							break;

						default :
							break loop33;
						}
					}
					} finally {dbg.exitSubRule(33);}

					}
					break;

			}
			} finally {dbg.exitSubRule(34);}
			dbg.location(91,55);
			string_literal67=(Token)match(input,49,FOLLOW_49_in_if_835);  
			stream_49.add(string_literal67);
			dbg.location(91,60);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:91:60: ( getComment )?
			int alt35=2;
			try { dbg.enterSubRule(35);
			try { dbg.enterDecision(35, decisionCanBacktrack[35]);

			int LA35_0 = input.LA(1);
			if ( (LA35_0==Comment) ) {
				alt35=1;
			}
			} finally {dbg.exitDecision(35);}

			switch (alt35) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:91:60: getComment
					{
					dbg.location(91,60);
					pushFollow(FOLLOW_getComment_in_if_837);
					getComment68=getComment();
					state._fsp--;

					stream_getComment.add(getComment68.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(35);}

			}

			// AST REWRITE
			// elements: else_, then_, getComment, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 91:73: -> ^( IF expression then_ ( else_ )? ( getComment )? END )
			{
				dbg.location(91,76);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:91:76: ^( IF expression then_ ( else_ )? ( getComment )? END )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(91,78);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);
				dbg.location(91,81);
				adaptor.addChild(root_1, stream_expression.nextTree());dbg.location(91,92);
				adaptor.addChild(root_1, stream_then_.nextTree());dbg.location(91,98);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:91:98: ( else_ )?
				if ( stream_else_.hasNext() ) {
					dbg.location(91,98);
					adaptor.addChild(root_1, stream_else_.nextTree());
				}
				stream_else_.reset();
				dbg.location(91,105);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:91:105: ( getComment )?
				if ( stream_getComment.hasNext() ) {
					dbg.location(91,105);
					adaptor.addChild(root_1, stream_getComment.nextTree());
				}
				stream_getComment.reset();
				dbg.location(91,117);
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
		dbg.location(92, 4);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:94:1: then_ : 'then' ( getComment )? ( WS )* commands -> ^( THEN commands ( getComment )? ) ;
	public final while_astParser.then__return then_() throws RecognitionException {
		while_astParser.then__return retval = new while_astParser.then__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal69=null;
		Token WS71=null;
		ParserRuleReturnScope getComment70 =null;
		ParserRuleReturnScope commands72 =null;

		Object string_literal69_tree=null;
		Object WS71_tree=null;
		RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try { dbg.enterRule(getGrammarFileName(), "then_");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(94, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:94:7: ( 'then' ( getComment )? ( WS )* commands -> ^( THEN commands ( getComment )? ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:94:9: 'then' ( getComment )? ( WS )* commands
			{
			dbg.location(94,9);
			string_literal69=(Token)match(input,61,FOLLOW_61_in_then_875);  
			stream_61.add(string_literal69);
			dbg.location(94,16);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:94:16: ( getComment )?
			int alt36=2;
			try { dbg.enterSubRule(36);
			try { dbg.enterDecision(36, decisionCanBacktrack[36]);

			int LA36_0 = input.LA(1);
			if ( (LA36_0==Comment) ) {
				alt36=1;
			}
			} finally {dbg.exitDecision(36);}

			switch (alt36) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:94:16: getComment
					{
					dbg.location(94,16);
					pushFollow(FOLLOW_getComment_in_then_877);
					getComment70=getComment();
					state._fsp--;

					stream_getComment.add(getComment70.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(36);}
			dbg.location(94,28);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:94:28: ( WS )*
			try { dbg.enterSubRule(37);

			loop37:
			while (true) {
				int alt37=2;
				try { dbg.enterDecision(37, decisionCanBacktrack[37]);

				int LA37_0 = input.LA(1);
				if ( (LA37_0==WS) ) {
					alt37=1;
				}

				} finally {dbg.exitDecision(37);}

				switch (alt37) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:94:28: WS
					{
					dbg.location(94,28);
					WS71=(Token)match(input,WS,FOLLOW_WS_in_then_880);  
					stream_WS.add(WS71);

					}
					break;

				default :
					break loop37;
				}
			}
			} finally {dbg.exitSubRule(37);}
			dbg.location(94,32);
			pushFollow(FOLLOW_commands_in_then_883);
			commands72=commands();
			state._fsp--;

			stream_commands.add(commands72.getTree());
			// AST REWRITE
			// elements: commands, getComment
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 94:41: -> ^( THEN commands ( getComment )? )
			{
				dbg.location(94,44);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:94:44: ^( THEN commands ( getComment )? )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(94,46);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(THEN, "THEN"), root_1);
				dbg.location(94,51);
				adaptor.addChild(root_1, stream_commands.nextTree());dbg.location(94,60);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:94:60: ( getComment )?
				if ( stream_getComment.hasNext() ) {
					dbg.location(94,60);
					adaptor.addChild(root_1, stream_getComment.nextTree());
				}
				stream_getComment.reset();

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
		dbg.location(94, 71);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:96:1: else_ : 'else' ( getComment )? ( WS )* commands -> ^( ELSE commands ( getComment )? ) ;
	public final while_astParser.else__return else_() throws RecognitionException {
		while_astParser.else__return retval = new while_astParser.else__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal73=null;
		Token WS75=null;
		ParserRuleReturnScope getComment74 =null;
		ParserRuleReturnScope commands76 =null;

		Object string_literal73_tree=null;
		Object WS75_tree=null;
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try { dbg.enterRule(getGrammarFileName(), "else_");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(96, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:96:7: ( 'else' ( getComment )? ( WS )* commands -> ^( ELSE commands ( getComment )? ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:96:9: 'else' ( getComment )? ( WS )* commands
			{
			dbg.location(96,9);
			string_literal73=(Token)match(input,48,FOLLOW_48_in_else_903);  
			stream_48.add(string_literal73);
			dbg.location(96,16);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:96:16: ( getComment )?
			int alt38=2;
			try { dbg.enterSubRule(38);
			try { dbg.enterDecision(38, decisionCanBacktrack[38]);

			int LA38_0 = input.LA(1);
			if ( (LA38_0==Comment) ) {
				alt38=1;
			}
			} finally {dbg.exitDecision(38);}

			switch (alt38) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:96:16: getComment
					{
					dbg.location(96,16);
					pushFollow(FOLLOW_getComment_in_else_905);
					getComment74=getComment();
					state._fsp--;

					stream_getComment.add(getComment74.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(38);}
			dbg.location(96,28);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:96:28: ( WS )*
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:96:28: WS
					{
					dbg.location(96,28);
					WS75=(Token)match(input,WS,FOLLOW_WS_in_else_908);  
					stream_WS.add(WS75);

					}
					break;

				default :
					break loop39;
				}
			}
			} finally {dbg.exitSubRule(39);}
			dbg.location(96,32);
			pushFollow(FOLLOW_commands_in_else_911);
			commands76=commands();
			state._fsp--;

			stream_commands.add(commands76.getTree());
			// AST REWRITE
			// elements: getComment, commands
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 96:41: -> ^( ELSE commands ( getComment )? )
			{
				dbg.location(96,44);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:96:44: ^( ELSE commands ( getComment )? )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(96,46);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ELSE, "ELSE"), root_1);
				dbg.location(96,51);
				adaptor.addChild(root_1, stream_commands.nextTree());dbg.location(96,60);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:96:60: ( getComment )?
				if ( stream_getComment.hasNext() ) {
					dbg.location(96,60);
					adaptor.addChild(root_1, stream_getComment.nextTree());
				}
				stream_getComment.reset();

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
		dbg.location(96, 71);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:98:1: while_ : ( 'while' ( WS )* expression ( getComment )? ( WS )* do_ ) -> ^( WHILE expression ( getComment )? do_ END ) ;
	public final while_astParser.while__return while_() throws RecognitionException {
		while_astParser.while__return retval = new while_astParser.while__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal77=null;
		Token WS78=null;
		Token WS81=null;
		ParserRuleReturnScope expression79 =null;
		ParserRuleReturnScope getComment80 =null;
		ParserRuleReturnScope do_82 =null;

		Object string_literal77_tree=null;
		Object WS78_tree=null;
		Object WS81_tree=null;
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_do_=new RewriteRuleSubtreeStream(adaptor,"rule do_");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");

		try { dbg.enterRule(getGrammarFileName(), "while_");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(98, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:5: ( ( 'while' ( WS )* expression ( getComment )? ( WS )* do_ ) -> ^( WHILE expression ( getComment )? do_ END ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:7: ( 'while' ( WS )* expression ( getComment )? ( WS )* do_ )
			{
			dbg.location(99,7);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:7: ( 'while' ( WS )* expression ( getComment )? ( WS )* do_ )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:8: 'while' ( WS )* expression ( getComment )? ( WS )* do_
			{
			dbg.location(99,8);
			string_literal77=(Token)match(input,63,FOLLOW_63_in_while_937);  
			stream_63.add(string_literal77);
			dbg.location(99,16);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:16: ( WS )*
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:16: WS
					{
					dbg.location(99,16);
					WS78=(Token)match(input,WS,FOLLOW_WS_in_while_939);  
					stream_WS.add(WS78);

					}
					break;

				default :
					break loop40;
				}
			}
			} finally {dbg.exitSubRule(40);}
			dbg.location(99,20);
			pushFollow(FOLLOW_expression_in_while_942);
			expression79=expression();
			state._fsp--;

			stream_expression.add(expression79.getTree());dbg.location(99,31);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:31: ( getComment )?
			int alt41=2;
			try { dbg.enterSubRule(41);
			try { dbg.enterDecision(41, decisionCanBacktrack[41]);

			int LA41_0 = input.LA(1);
			if ( (LA41_0==Comment) ) {
				alt41=1;
			}
			} finally {dbg.exitDecision(41);}

			switch (alt41) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:31: getComment
					{
					dbg.location(99,31);
					pushFollow(FOLLOW_getComment_in_while_944);
					getComment80=getComment();
					state._fsp--;

					stream_getComment.add(getComment80.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(41);}
			dbg.location(99,43);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:43: ( WS )*
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:43: WS
					{
					dbg.location(99,43);
					WS81=(Token)match(input,WS,FOLLOW_WS_in_while_947);  
					stream_WS.add(WS81);

					}
					break;

				default :
					break loop42;
				}
			}
			} finally {dbg.exitSubRule(42);}
			dbg.location(99,47);
			pushFollow(FOLLOW_do__in_while_950);
			do_82=do_();
			state._fsp--;

			stream_do_.add(do_82.getTree());
			}

			// AST REWRITE
			// elements: do_, getComment, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 99:52: -> ^( WHILE expression ( getComment )? do_ END )
			{
				dbg.location(99,55);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:55: ^( WHILE expression ( getComment )? do_ END )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(99,57);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WHILE, "WHILE"), root_1);
				dbg.location(99,63);
				adaptor.addChild(root_1, stream_expression.nextTree());dbg.location(99,74);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:74: ( getComment )?
				if ( stream_getComment.hasNext() ) {
					dbg.location(99,74);
					adaptor.addChild(root_1, stream_getComment.nextTree());
				}
				stream_getComment.reset();
				dbg.location(99,86);
				adaptor.addChild(root_1, stream_do_.nextTree());dbg.location(99,90);
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
		dbg.location(100, 4);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:102:1: do_ : 'do' ( getComment )? ( WS )* commands ( WS )* 'od' ( getComment )? -> ^( DO commands ( getComment )? ) ;
	public final while_astParser.do__return do_() throws RecognitionException {
		while_astParser.do__return retval = new while_astParser.do__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal83=null;
		Token WS85=null;
		Token WS87=null;
		Token string_literal88=null;
		ParserRuleReturnScope getComment84 =null;
		ParserRuleReturnScope commands86 =null;
		ParserRuleReturnScope getComment89 =null;

		Object string_literal83_tree=null;
		Object WS85_tree=null;
		Object WS87_tree=null;
		Object string_literal88_tree=null;
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try { dbg.enterRule(getGrammarFileName(), "do_");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(102, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:102:6: ( 'do' ( getComment )? ( WS )* commands ( WS )* 'od' ( getComment )? -> ^( DO commands ( getComment )? ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:102:8: 'do' ( getComment )? ( WS )* commands ( WS )* 'od' ( getComment )?
			{
			dbg.location(102,8);
			string_literal83=(Token)match(input,47,FOLLOW_47_in_do_984);  
			stream_47.add(string_literal83);
			dbg.location(102,13);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:102:13: ( getComment )?
			int alt43=2;
			try { dbg.enterSubRule(43);
			try { dbg.enterDecision(43, decisionCanBacktrack[43]);

			int LA43_0 = input.LA(1);
			if ( (LA43_0==Comment) ) {
				alt43=1;
			}
			} finally {dbg.exitDecision(43);}

			switch (alt43) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:102:13: getComment
					{
					dbg.location(102,13);
					pushFollow(FOLLOW_getComment_in_do_986);
					getComment84=getComment();
					state._fsp--;

					stream_getComment.add(getComment84.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(43);}
			dbg.location(102,25);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:102:25: ( WS )*
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:102:25: WS
					{
					dbg.location(102,25);
					WS85=(Token)match(input,WS,FOLLOW_WS_in_do_989);  
					stream_WS.add(WS85);

					}
					break;

				default :
					break loop44;
				}
			}
			} finally {dbg.exitSubRule(44);}
			dbg.location(102,29);
			pushFollow(FOLLOW_commands_in_do_992);
			commands86=commands();
			state._fsp--;

			stream_commands.add(commands86.getTree());dbg.location(102,38);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:102:38: ( WS )*
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:102:38: WS
					{
					dbg.location(102,38);
					WS87=(Token)match(input,WS,FOLLOW_WS_in_do_994);  
					stream_WS.add(WS87);

					}
					break;

				default :
					break loop45;
				}
			}
			} finally {dbg.exitSubRule(45);}
			dbg.location(102,42);
			string_literal88=(Token)match(input,59,FOLLOW_59_in_do_997);  
			stream_59.add(string_literal88);
			dbg.location(102,47);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:102:47: ( getComment )?
			int alt46=2;
			try { dbg.enterSubRule(46);
			try { dbg.enterDecision(46, decisionCanBacktrack[46]);

			int LA46_0 = input.LA(1);
			if ( (LA46_0==Comment) ) {
				alt46=1;
			}
			} finally {dbg.exitDecision(46);}

			switch (alt46) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:102:47: getComment
					{
					dbg.location(102,47);
					pushFollow(FOLLOW_getComment_in_do_999);
					getComment89=getComment();
					state._fsp--;

					stream_getComment.add(getComment89.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(46);}

			// AST REWRITE
			// elements: getComment, commands
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 102:59: -> ^( DO commands ( getComment )? )
			{
				dbg.location(102,62);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:102:62: ^( DO commands ( getComment )? )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(102,64);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DO, "DO"), root_1);
				dbg.location(102,67);
				adaptor.addChild(root_1, stream_commands.nextTree());dbg.location(102,77);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:102:77: ( getComment )?
				if ( stream_getComment.hasNext() ) {
					dbg.location(102,77);
					adaptor.addChild(root_1, stream_getComment.nextTree());
				}
				stream_getComment.reset();

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
		dbg.location(102, 88);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:104:1: for_ : ( 'for' ( WS )* expression ( getComment )? ( WS )* do_ ) -> ^( FOR expression do_ END ) ;
	public final while_astParser.for__return for_() throws RecognitionException {
		while_astParser.for__return retval = new while_astParser.for__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal90=null;
		Token WS91=null;
		Token WS94=null;
		ParserRuleReturnScope expression92 =null;
		ParserRuleReturnScope getComment93 =null;
		ParserRuleReturnScope do_95 =null;

		Object string_literal90_tree=null;
		Object WS91_tree=null;
		Object WS94_tree=null;
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_do_=new RewriteRuleSubtreeStream(adaptor,"rule do_");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");

		try { dbg.enterRule(getGrammarFileName(), "for_");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(104, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:105:5: ( ( 'for' ( WS )* expression ( getComment )? ( WS )* do_ ) -> ^( FOR expression do_ END ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:105:7: ( 'for' ( WS )* expression ( getComment )? ( WS )* do_ )
			{
			dbg.location(105,7);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:105:7: ( 'for' ( WS )* expression ( getComment )? ( WS )* do_ )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:105:8: 'for' ( WS )* expression ( getComment )? ( WS )* do_
			{
			dbg.location(105,8);
			string_literal90=(Token)match(input,50,FOLLOW_50_in_for_1025);  
			stream_50.add(string_literal90);
			dbg.location(105,14);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:105:14: ( WS )*
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:105:14: WS
					{
					dbg.location(105,14);
					WS91=(Token)match(input,WS,FOLLOW_WS_in_for_1027);  
					stream_WS.add(WS91);

					}
					break;

				default :
					break loop47;
				}
			}
			} finally {dbg.exitSubRule(47);}
			dbg.location(105,18);
			pushFollow(FOLLOW_expression_in_for_1030);
			expression92=expression();
			state._fsp--;

			stream_expression.add(expression92.getTree());dbg.location(105,29);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:105:29: ( getComment )?
			int alt48=2;
			try { dbg.enterSubRule(48);
			try { dbg.enterDecision(48, decisionCanBacktrack[48]);

			int LA48_0 = input.LA(1);
			if ( (LA48_0==Comment) ) {
				alt48=1;
			}
			} finally {dbg.exitDecision(48);}

			switch (alt48) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:105:29: getComment
					{
					dbg.location(105,29);
					pushFollow(FOLLOW_getComment_in_for_1032);
					getComment93=getComment();
					state._fsp--;

					stream_getComment.add(getComment93.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(48);}
			dbg.location(105,41);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:105:41: ( WS )*
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:105:41: WS
					{
					dbg.location(105,41);
					WS94=(Token)match(input,WS,FOLLOW_WS_in_for_1035);  
					stream_WS.add(WS94);

					}
					break;

				default :
					break loop49;
				}
			}
			} finally {dbg.exitSubRule(49);}
			dbg.location(105,45);
			pushFollow(FOLLOW_do__in_for_1038);
			do_95=do_();
			state._fsp--;

			stream_do_.add(do_95.getTree());
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
			// 105:50: -> ^( FOR expression do_ END )
			{
				dbg.location(105,53);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:105:53: ^( FOR expression do_ END )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(105,55);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOR, "FOR"), root_1);
				dbg.location(105,59);
				adaptor.addChild(root_1, stream_expression.nextTree());dbg.location(105,70);
				adaptor.addChild(root_1, stream_do_.nextTree());dbg.location(105,74);
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
		dbg.location(106, 4);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:108:1: foreach_ : ( 'foreach' ( WS )* variable ( WS )* 'in' ( WS )* expression ( getComment )? ( WS )* do_ ) -> ^( FOREACH ^( IN variable expression ) ( getComment )? do_ END ) ;
	public final while_astParser.foreach__return foreach_() throws RecognitionException {
		while_astParser.foreach__return retval = new while_astParser.foreach__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal96=null;
		Token WS97=null;
		Token WS99=null;
		Token string_literal100=null;
		Token WS101=null;
		Token WS104=null;
		ParserRuleReturnScope variable98 =null;
		ParserRuleReturnScope expression102 =null;
		ParserRuleReturnScope getComment103 =null;
		ParserRuleReturnScope do_105 =null;

		Object string_literal96_tree=null;
		Object WS97_tree=null;
		Object WS99_tree=null;
		Object string_literal100_tree=null;
		Object WS101_tree=null;
		Object WS104_tree=null;
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_do_=new RewriteRuleSubtreeStream(adaptor,"rule do_");
		RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");

		try { dbg.enterRule(getGrammarFileName(), "foreach_");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(108, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:109:5: ( ( 'foreach' ( WS )* variable ( WS )* 'in' ( WS )* expression ( getComment )? ( WS )* do_ ) -> ^( FOREACH ^( IN variable expression ) ( getComment )? do_ END ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:109:7: ( 'foreach' ( WS )* variable ( WS )* 'in' ( WS )* expression ( getComment )? ( WS )* do_ )
			{
			dbg.location(109,7);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:109:7: ( 'foreach' ( WS )* variable ( WS )* 'in' ( WS )* expression ( getComment )? ( WS )* do_ )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:109:8: 'foreach' ( WS )* variable ( WS )* 'in' ( WS )* expression ( getComment )? ( WS )* do_
			{
			dbg.location(109,8);
			string_literal96=(Token)match(input,51,FOLLOW_51_in_foreach_1069);  
			stream_51.add(string_literal96);
			dbg.location(109,18);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:109:18: ( WS )*
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:109:18: WS
					{
					dbg.location(109,18);
					WS97=(Token)match(input,WS,FOLLOW_WS_in_foreach_1071);  
					stream_WS.add(WS97);

					}
					break;

				default :
					break loop50;
				}
			}
			} finally {dbg.exitSubRule(50);}
			dbg.location(109,22);
			pushFollow(FOLLOW_variable_in_foreach_1074);
			variable98=variable();
			state._fsp--;

			stream_variable.add(variable98.getTree());dbg.location(109,31);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:109:31: ( WS )*
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:109:31: WS
					{
					dbg.location(109,31);
					WS99=(Token)match(input,WS,FOLLOW_WS_in_foreach_1076);  
					stream_WS.add(WS99);

					}
					break;

				default :
					break loop51;
				}
			}
			} finally {dbg.exitSubRule(51);}
			dbg.location(109,35);
			string_literal100=(Token)match(input,55,FOLLOW_55_in_foreach_1079);  
			stream_55.add(string_literal100);
			dbg.location(109,40);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:109:40: ( WS )*
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

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:109:40: WS
					{
					dbg.location(109,40);
					WS101=(Token)match(input,WS,FOLLOW_WS_in_foreach_1081);  
					stream_WS.add(WS101);

					}
					break;

				default :
					break loop52;
				}
			}
			} finally {dbg.exitSubRule(52);}
			dbg.location(109,44);
			pushFollow(FOLLOW_expression_in_foreach_1084);
			expression102=expression();
			state._fsp--;

			stream_expression.add(expression102.getTree());dbg.location(109,55);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:109:55: ( getComment )?
			int alt53=2;
			try { dbg.enterSubRule(53);
			try { dbg.enterDecision(53, decisionCanBacktrack[53]);

			int LA53_0 = input.LA(1);
			if ( (LA53_0==Comment) ) {
				alt53=1;
			}
			} finally {dbg.exitDecision(53);}

			switch (alt53) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:109:55: getComment
					{
					dbg.location(109,55);
					pushFollow(FOLLOW_getComment_in_foreach_1086);
					getComment103=getComment();
					state._fsp--;

					stream_getComment.add(getComment103.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(53);}
			dbg.location(109,67);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:109:67: ( WS )*
			try { dbg.enterSubRule(54);

			loop54:
			while (true) {
				int alt54=2;
				try { dbg.enterDecision(54, decisionCanBacktrack[54]);

				int LA54_0 = input.LA(1);
				if ( (LA54_0==WS) ) {
					alt54=1;
				}

				} finally {dbg.exitDecision(54);}

				switch (alt54) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:109:67: WS
					{
					dbg.location(109,67);
					WS104=(Token)match(input,WS,FOLLOW_WS_in_foreach_1089);  
					stream_WS.add(WS104);

					}
					break;

				default :
					break loop54;
				}
			}
			} finally {dbg.exitSubRule(54);}
			dbg.location(109,71);
			pushFollow(FOLLOW_do__in_foreach_1092);
			do_105=do_();
			state._fsp--;

			stream_do_.add(do_105.getTree());
			}

			// AST REWRITE
			// elements: getComment, do_, variable, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 109:76: -> ^( FOREACH ^( IN variable expression ) ( getComment )? do_ END )
			{
				dbg.location(109,79);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:109:79: ^( FOREACH ^( IN variable expression ) ( getComment )? do_ END )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(109,81);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOREACH, "FOREACH"), root_1);
				dbg.location(109,89);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:109:89: ^( IN variable expression )
				{
				Object root_2 = (Object)adaptor.nil();
				dbg.location(109,91);
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(IN, "IN"), root_2);
				dbg.location(109,94);
				adaptor.addChild(root_2, stream_variable.nextTree());dbg.location(109,103);
				adaptor.addChild(root_2, stream_expression.nextTree());
				adaptor.addChild(root_1, root_2);
				}
				dbg.location(109,115);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:109:115: ( getComment )?
				if ( stream_getComment.hasNext() ) {
					dbg.location(109,115);
					adaptor.addChild(root_1, stream_getComment.nextTree());
				}
				stream_getComment.reset();
				dbg.location(109,127);
				adaptor.addChild(root_1, stream_do_.nextTree());dbg.location(109,131);
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
		dbg.location(110, 4);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:112:1: vars : variable ( WS )* ( ',' ( WS )* vars )? -> variable ( vars )* ;
	public final while_astParser.vars_return vars() throws RecognitionException {
		while_astParser.vars_return retval = new while_astParser.vars_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WS107=null;
		Token char_literal108=null;
		Token WS109=null;
		ParserRuleReturnScope variable106 =null;
		ParserRuleReturnScope vars110 =null;

		Object WS107_tree=null;
		Object char_literal108_tree=null;
		Object WS109_tree=null;
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");
		RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");

		try { dbg.enterRule(getGrammarFileName(), "vars");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(112, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:113:5: ( variable ( WS )* ( ',' ( WS )* vars )? -> variable ( vars )* )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:113:7: variable ( WS )* ( ',' ( WS )* vars )?
			{
			dbg.location(113,7);
			pushFollow(FOLLOW_variable_in_vars1131);
			variable106=variable();
			state._fsp--;

			stream_variable.add(variable106.getTree());dbg.location(113,16);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:113:16: ( WS )*
			try { dbg.enterSubRule(55);

			loop55:
			while (true) {
				int alt55=2;
				try { dbg.enterDecision(55, decisionCanBacktrack[55]);

				int LA55_0 = input.LA(1);
				if ( (LA55_0==WS) ) {
					alt55=1;
				}

				} finally {dbg.exitDecision(55);}

				switch (alt55) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:113:16: WS
					{
					dbg.location(113,16);
					WS107=(Token)match(input,WS,FOLLOW_WS_in_vars1133);  
					stream_WS.add(WS107);

					}
					break;

				default :
					break loop55;
				}
			}
			} finally {dbg.exitSubRule(55);}
			dbg.location(113,20);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:113:20: ( ',' ( WS )* vars )?
			int alt57=2;
			try { dbg.enterSubRule(57);
			try { dbg.enterDecision(57, decisionCanBacktrack[57]);

			int LA57_0 = input.LA(1);
			if ( (LA57_0==41) ) {
				alt57=1;
			}
			} finally {dbg.exitDecision(57);}

			switch (alt57) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:113:21: ',' ( WS )* vars
					{
					dbg.location(113,21);
					char_literal108=(Token)match(input,41,FOLLOW_41_in_vars1137);  
					stream_41.add(char_literal108);
					dbg.location(113,24);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:113:24: ( WS )*
					try { dbg.enterSubRule(56);

					loop56:
					while (true) {
						int alt56=2;
						try { dbg.enterDecision(56, decisionCanBacktrack[56]);

						int LA56_0 = input.LA(1);
						if ( (LA56_0==WS) ) {
							alt56=1;
						}

						} finally {dbg.exitDecision(56);}

						switch (alt56) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:113:24: WS
							{
							dbg.location(113,24);
							WS109=(Token)match(input,WS,FOLLOW_WS_in_vars1138);  
							stream_WS.add(WS109);

							}
							break;

						default :
							break loop56;
						}
					}
					} finally {dbg.exitSubRule(56);}
					dbg.location(113,28);
					pushFollow(FOLLOW_vars_in_vars1141);
					vars110=vars();
					state._fsp--;

					stream_vars.add(vars110.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(57);}

			// AST REWRITE
			// elements: variable, vars
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 113:35: -> variable ( vars )*
			{
				dbg.location(113,38);
				adaptor.addChild(root_0, stream_variable.nextTree());dbg.location(113,47);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:113:47: ( vars )*
				while ( stream_vars.hasNext() ) {
					dbg.location(113,47);
					adaptor.addChild(root_0, stream_vars.nextTree());
				}
				stream_vars.reset();

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
		dbg.location(114, 4);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:116:1: exprs : expression ( WS )* ( ',' ( WS )* exprs )? -> expression ( exprs )* ;
	public final while_astParser.exprs_return exprs() throws RecognitionException {
		while_astParser.exprs_return retval = new while_astParser.exprs_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WS112=null;
		Token char_literal113=null;
		Token WS114=null;
		ParserRuleReturnScope expression111 =null;
		ParserRuleReturnScope exprs115 =null;

		Object WS112_tree=null;
		Object char_literal113_tree=null;
		Object WS114_tree=null;
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");

		try { dbg.enterRule(getGrammarFileName(), "exprs");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(116, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:117:5: ( expression ( WS )* ( ',' ( WS )* exprs )? -> expression ( exprs )* )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:117:7: expression ( WS )* ( ',' ( WS )* exprs )?
			{
			dbg.location(117,7);
			pushFollow(FOLLOW_expression_in_exprs1167);
			expression111=expression();
			state._fsp--;

			stream_expression.add(expression111.getTree());dbg.location(117,18);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:117:18: ( WS )*
			try { dbg.enterSubRule(58);

			loop58:
			while (true) {
				int alt58=2;
				try { dbg.enterDecision(58, decisionCanBacktrack[58]);

				int LA58_0 = input.LA(1);
				if ( (LA58_0==WS) ) {
					alt58=1;
				}

				} finally {dbg.exitDecision(58);}

				switch (alt58) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:117:18: WS
					{
					dbg.location(117,18);
					WS112=(Token)match(input,WS,FOLLOW_WS_in_exprs1169);  
					stream_WS.add(WS112);

					}
					break;

				default :
					break loop58;
				}
			}
			} finally {dbg.exitSubRule(58);}
			dbg.location(117,22);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:117:22: ( ',' ( WS )* exprs )?
			int alt60=2;
			try { dbg.enterSubRule(60);
			try { dbg.enterDecision(60, decisionCanBacktrack[60]);

			int LA60_0 = input.LA(1);
			if ( (LA60_0==41) ) {
				alt60=1;
			}
			} finally {dbg.exitDecision(60);}

			switch (alt60) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:117:23: ',' ( WS )* exprs
					{
					dbg.location(117,23);
					char_literal113=(Token)match(input,41,FOLLOW_41_in_exprs1173);  
					stream_41.add(char_literal113);
					dbg.location(117,26);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:117:26: ( WS )*
					try { dbg.enterSubRule(59);

					loop59:
					while (true) {
						int alt59=2;
						try { dbg.enterDecision(59, decisionCanBacktrack[59]);

						int LA59_0 = input.LA(1);
						if ( (LA59_0==WS) ) {
							alt59=1;
						}

						} finally {dbg.exitDecision(59);}

						switch (alt59) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:117:26: WS
							{
							dbg.location(117,26);
							WS114=(Token)match(input,WS,FOLLOW_WS_in_exprs1174);  
							stream_WS.add(WS114);

							}
							break;

						default :
							break loop59;
						}
					}
					} finally {dbg.exitSubRule(59);}
					dbg.location(117,30);
					pushFollow(FOLLOW_exprs_in_exprs1177);
					exprs115=exprs();
					state._fsp--;

					stream_exprs.add(exprs115.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(60);}

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
			// 117:38: -> expression ( exprs )*
			{
				dbg.location(117,41);
				adaptor.addChild(root_0, stream_expression.nextTree());dbg.location(117,52);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:117:52: ( exprs )*
				while ( stream_exprs.hasNext() ) {
					dbg.location(117,52);
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
		dbg.location(118, 4);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:120:1: exprBase : ( nil_ | variable | symbol | cons | list | hd | tl | symbolExpr );
	public final while_astParser.exprBase_return exprBase() throws RecognitionException {
		while_astParser.exprBase_return retval = new while_astParser.exprBase_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope nil_116 =null;
		ParserRuleReturnScope variable117 =null;
		ParserRuleReturnScope symbol118 =null;
		ParserRuleReturnScope cons119 =null;
		ParserRuleReturnScope list120 =null;
		ParserRuleReturnScope hd121 =null;
		ParserRuleReturnScope tl122 =null;
		ParserRuleReturnScope symbolExpr123 =null;


		try { dbg.enterRule(getGrammarFileName(), "exprBase");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(120, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:120:12: ( nil_ | variable | symbol | cons | list | hd | tl | symbolExpr )
			int alt61=8;
			try { dbg.enterDecision(61, decisionCanBacktrack[61]);

			try {
				isCyclicDecision = true;
				alt61 = dfa61.predict(input);
			}
			catch (NoViableAltException nvae) {
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(61);}

			switch (alt61) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:120:15: nil_
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(120,15);
					pushFollow(FOLLOW_nil__in_exprBase1202);
					nil_116=nil_();
					state._fsp--;

					adaptor.addChild(root_0, nil_116.getTree());

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:121:7: variable
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(121,7);
					pushFollow(FOLLOW_variable_in_exprBase1210);
					variable117=variable();
					state._fsp--;

					adaptor.addChild(root_0, variable117.getTree());

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:121:18: symbol
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(121,18);
					pushFollow(FOLLOW_symbol_in_exprBase1214);
					symbol118=symbol();
					state._fsp--;

					adaptor.addChild(root_0, symbol118.getTree());

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:122:7: cons
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(122,7);
					pushFollow(FOLLOW_cons_in_exprBase1222);
					cons119=cons();
					state._fsp--;

					adaptor.addChild(root_0, cons119.getTree());

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:122:14: list
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(122,14);
					pushFollow(FOLLOW_list_in_exprBase1226);
					list120=list();
					state._fsp--;

					adaptor.addChild(root_0, list120.getTree());

					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:123:7: hd
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(123,7);
					pushFollow(FOLLOW_hd_in_exprBase1234);
					hd121=hd();
					state._fsp--;

					adaptor.addChild(root_0, hd121.getTree());

					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:123:12: tl
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(123,12);
					pushFollow(FOLLOW_tl_in_exprBase1238);
					tl122=tl();
					state._fsp--;

					adaptor.addChild(root_0, tl122.getTree());

					}
					break;
				case 8 :
					dbg.enterAlt(8);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:124:7: symbolExpr
					{
					root_0 = (Object)adaptor.nil();


					dbg.location(124,7);
					pushFollow(FOLLOW_symbolExpr_in_exprBase1246);
					symbolExpr123=symbolExpr();
					state._fsp--;

					adaptor.addChild(root_0, symbolExpr123.getTree());

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
		dbg.location(125, 4);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:127:1: nil_ : ( 'nil' ) -> 'nil' ;
	public final while_astParser.nil__return nil_() throws RecognitionException {
		while_astParser.nil__return retval = new while_astParser.nil__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal124=null;

		Object string_literal124_tree=null;
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");

		try { dbg.enterRule(getGrammarFileName(), "nil_");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(127, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:127:6: ( ( 'nil' ) -> 'nil' )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:127:8: ( 'nil' )
			{
			dbg.location(127,8);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:127:8: ( 'nil' )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:127:9: 'nil'
			{
			dbg.location(127,9);
			string_literal124=(Token)match(input,57,FOLLOW_57_in_nil_1264);  
			stream_57.add(string_literal124);

			}

			// AST REWRITE
			// elements: 57
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 127:16: -> 'nil'
			{
				dbg.location(127,19);
				adaptor.addChild(root_0, stream_57.nextNode());
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
		dbg.location(127, 23);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:129:1: variable : Variable -> Variable ;
	public final while_astParser.variable_return variable() throws RecognitionException {
		while_astParser.variable_return retval = new while_astParser.variable_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Variable125=null;

		Object Variable125_tree=null;
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");

		try { dbg.enterRule(getGrammarFileName(), "variable");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(129, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:129:9: ( Variable -> Variable )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:129:11: Variable
			{
			dbg.location(129,11);
			Variable125=(Token)match(input,Variable,FOLLOW_Variable_in_variable1281);  
			stream_Variable.add(Variable125);

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
			// 129:20: -> Variable
			{
				dbg.location(129,23);
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
		dbg.location(129, 30);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "variable");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "variable"


	public static class symbol_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "symbol"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:131:1: symbol : Symbol -> Symbol ;
	public final while_astParser.symbol_return symbol() throws RecognitionException {
		while_astParser.symbol_return retval = new while_astParser.symbol_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Symbol126=null;

		Object Symbol126_tree=null;
		RewriteRuleTokenStream stream_Symbol=new RewriteRuleTokenStream(adaptor,"token Symbol");

		try { dbg.enterRule(getGrammarFileName(), "symbol");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(131, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:131:8: ( Symbol -> Symbol )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:131:10: Symbol
			{
			dbg.location(131,10);
			Symbol126=(Token)match(input,Symbol,FOLLOW_Symbol_in_symbol1293);  
			stream_Symbol.add(Symbol126);

			// AST REWRITE
			// elements: Symbol
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 131:17: -> Symbol
			{
				dbg.location(131,20);
				adaptor.addChild(root_0, stream_Symbol.nextNode());
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
		dbg.location(131, 25);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "symbol");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "symbol"


	public static class cons_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "cons"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:133:1: cons : '(' ( WS )* 'cons ' lExpr ( WS )* ')' -> ^( CONS lExpr ) ;
	public final while_astParser.cons_return cons() throws RecognitionException {
		while_astParser.cons_return retval = new while_astParser.cons_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal127=null;
		Token WS128=null;
		Token string_literal129=null;
		Token WS131=null;
		Token char_literal132=null;
		ParserRuleReturnScope lExpr130 =null;

		Object char_literal127_tree=null;
		Object WS128_tree=null;
		Object string_literal129_tree=null;
		Object WS131_tree=null;
		Object char_literal132_tree=null;
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_lExpr=new RewriteRuleSubtreeStream(adaptor,"rule lExpr");

		try { dbg.enterRule(getGrammarFileName(), "cons");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(133, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:133:6: ( '(' ( WS )* 'cons ' lExpr ( WS )* ')' -> ^( CONS lExpr ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:133:8: '(' ( WS )* 'cons ' lExpr ( WS )* ')'
			{
			dbg.location(133,8);
			char_literal127=(Token)match(input,39,FOLLOW_39_in_cons1305);  
			stream_39.add(char_literal127);
			dbg.location(133,12);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:133:12: ( WS )*
			try { dbg.enterSubRule(62);

			loop62:
			while (true) {
				int alt62=2;
				try { dbg.enterDecision(62, decisionCanBacktrack[62]);

				int LA62_0 = input.LA(1);
				if ( (LA62_0==WS) ) {
					alt62=1;
				}

				} finally {dbg.exitDecision(62);}

				switch (alt62) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:133:12: WS
					{
					dbg.location(133,12);
					WS128=(Token)match(input,WS,FOLLOW_WS_in_cons1307);  
					stream_WS.add(WS128);

					}
					break;

				default :
					break loop62;
				}
			}
			} finally {dbg.exitSubRule(62);}
			dbg.location(133,16);
			string_literal129=(Token)match(input,46,FOLLOW_46_in_cons1310);  
			stream_46.add(string_literal129);
			dbg.location(133,24);
			pushFollow(FOLLOW_lExpr_in_cons1312);
			lExpr130=lExpr();
			state._fsp--;

			stream_lExpr.add(lExpr130.getTree());dbg.location(133,30);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:133:30: ( WS )*
			try { dbg.enterSubRule(63);

			loop63:
			while (true) {
				int alt63=2;
				try { dbg.enterDecision(63, decisionCanBacktrack[63]);

				int LA63_0 = input.LA(1);
				if ( (LA63_0==WS) ) {
					alt63=1;
				}

				} finally {dbg.exitDecision(63);}

				switch (alt63) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:133:30: WS
					{
					dbg.location(133,30);
					WS131=(Token)match(input,WS,FOLLOW_WS_in_cons1314);  
					stream_WS.add(WS131);

					}
					break;

				default :
					break loop63;
				}
			}
			} finally {dbg.exitSubRule(63);}
			dbg.location(133,34);
			char_literal132=(Token)match(input,40,FOLLOW_40_in_cons1317);  
			stream_40.add(char_literal132);

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
			// 133:38: -> ^( CONS lExpr )
			{
				dbg.location(133,41);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:133:41: ^( CONS lExpr )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(133,43);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONS, "CONS"), root_1);
				dbg.location(133,48);
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
		dbg.location(133, 53);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:134:1: list : '(' ( WS )* 'list ' lExpr ( WS )* ')' -> ^( LIST lExpr ) ;
	public final while_astParser.list_return list() throws RecognitionException {
		while_astParser.list_return retval = new while_astParser.list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal133=null;
		Token WS134=null;
		Token string_literal135=null;
		Token WS137=null;
		Token char_literal138=null;
		ParserRuleReturnScope lExpr136 =null;

		Object char_literal133_tree=null;
		Object WS134_tree=null;
		Object string_literal135_tree=null;
		Object WS137_tree=null;
		Object char_literal138_tree=null;
		RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_lExpr=new RewriteRuleSubtreeStream(adaptor,"rule lExpr");

		try { dbg.enterRule(getGrammarFileName(), "list");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(134, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:134:6: ( '(' ( WS )* 'list ' lExpr ( WS )* ')' -> ^( LIST lExpr ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:134:8: '(' ( WS )* 'list ' lExpr ( WS )* ')'
			{
			dbg.location(134,8);
			char_literal133=(Token)match(input,39,FOLLOW_39_in_list1333);  
			stream_39.add(char_literal133);
			dbg.location(134,11);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:134:11: ( WS )*
			try { dbg.enterSubRule(64);

			loop64:
			while (true) {
				int alt64=2;
				try { dbg.enterDecision(64, decisionCanBacktrack[64]);

				int LA64_0 = input.LA(1);
				if ( (LA64_0==WS) ) {
					alt64=1;
				}

				} finally {dbg.exitDecision(64);}

				switch (alt64) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:134:11: WS
					{
					dbg.location(134,11);
					WS134=(Token)match(input,WS,FOLLOW_WS_in_list1334);  
					stream_WS.add(WS134);

					}
					break;

				default :
					break loop64;
				}
			}
			} finally {dbg.exitSubRule(64);}
			dbg.location(134,15);
			string_literal135=(Token)match(input,56,FOLLOW_56_in_list1337);  
			stream_56.add(string_literal135);
			dbg.location(134,23);
			pushFollow(FOLLOW_lExpr_in_list1339);
			lExpr136=lExpr();
			state._fsp--;

			stream_lExpr.add(lExpr136.getTree());dbg.location(134,29);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:134:29: ( WS )*
			try { dbg.enterSubRule(65);

			loop65:
			while (true) {
				int alt65=2;
				try { dbg.enterDecision(65, decisionCanBacktrack[65]);

				int LA65_0 = input.LA(1);
				if ( (LA65_0==WS) ) {
					alt65=1;
				}

				} finally {dbg.exitDecision(65);}

				switch (alt65) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:134:29: WS
					{
					dbg.location(134,29);
					WS137=(Token)match(input,WS,FOLLOW_WS_in_list1341);  
					stream_WS.add(WS137);

					}
					break;

				default :
					break loop65;
				}
			}
			} finally {dbg.exitSubRule(65);}
			dbg.location(134,33);
			char_literal138=(Token)match(input,40,FOLLOW_40_in_list1344);  
			stream_40.add(char_literal138);

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
			// 134:37: -> ^( LIST lExpr )
			{
				dbg.location(134,40);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:134:40: ^( LIST lExpr )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(134,42);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);
				dbg.location(134,47);
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
		dbg.location(134, 52);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:136:1: hd : '(' ( WS )* 'hd ' exprBase ( WS )* ')' -> ^( HD exprBase ) ;
	public final while_astParser.hd_return hd() throws RecognitionException {
		while_astParser.hd_return retval = new while_astParser.hd_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal139=null;
		Token WS140=null;
		Token string_literal141=null;
		Token WS143=null;
		Token char_literal144=null;
		ParserRuleReturnScope exprBase142 =null;

		Object char_literal139_tree=null;
		Object WS140_tree=null;
		Object string_literal141_tree=null;
		Object WS143_tree=null;
		Object char_literal144_tree=null;
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");

		try { dbg.enterRule(getGrammarFileName(), "hd");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(136, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:136:4: ( '(' ( WS )* 'hd ' exprBase ( WS )* ')' -> ^( HD exprBase ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:136:6: '(' ( WS )* 'hd ' exprBase ( WS )* ')'
			{
			dbg.location(136,6);
			char_literal139=(Token)match(input,39,FOLLOW_39_in_hd1360);  
			stream_39.add(char_literal139);
			dbg.location(136,9);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:136:9: ( WS )*
			try { dbg.enterSubRule(66);

			loop66:
			while (true) {
				int alt66=2;
				try { dbg.enterDecision(66, decisionCanBacktrack[66]);

				int LA66_0 = input.LA(1);
				if ( (LA66_0==WS) ) {
					alt66=1;
				}

				} finally {dbg.exitDecision(66);}

				switch (alt66) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:136:9: WS
					{
					dbg.location(136,9);
					WS140=(Token)match(input,WS,FOLLOW_WS_in_hd1361);  
					stream_WS.add(WS140);

					}
					break;

				default :
					break loop66;
				}
			}
			} finally {dbg.exitSubRule(66);}
			dbg.location(136,13);
			string_literal141=(Token)match(input,53,FOLLOW_53_in_hd1364);  
			stream_53.add(string_literal141);
			dbg.location(136,19);
			pushFollow(FOLLOW_exprBase_in_hd1366);
			exprBase142=exprBase();
			state._fsp--;

			stream_exprBase.add(exprBase142.getTree());dbg.location(136,28);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:136:28: ( WS )*
			try { dbg.enterSubRule(67);

			loop67:
			while (true) {
				int alt67=2;
				try { dbg.enterDecision(67, decisionCanBacktrack[67]);

				int LA67_0 = input.LA(1);
				if ( (LA67_0==WS) ) {
					alt67=1;
				}

				} finally {dbg.exitDecision(67);}

				switch (alt67) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:136:28: WS
					{
					dbg.location(136,28);
					WS143=(Token)match(input,WS,FOLLOW_WS_in_hd1368);  
					stream_WS.add(WS143);

					}
					break;

				default :
					break loop67;
				}
			}
			} finally {dbg.exitSubRule(67);}
			dbg.location(136,31);
			char_literal144=(Token)match(input,40,FOLLOW_40_in_hd1370);  
			stream_40.add(char_literal144);

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
			// 136:35: -> ^( HD exprBase )
			{
				dbg.location(136,38);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:136:38: ^( HD exprBase )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(136,40);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(HD, "HD"), root_1);
				dbg.location(136,43);
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
		dbg.location(136, 51);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:138:1: tl : '(' ( WS )* 'tl ' exprBase ( WS )* ')' -> ^( TL exprBase ) ;
	public final while_astParser.tl_return tl() throws RecognitionException {
		while_astParser.tl_return retval = new while_astParser.tl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal145=null;
		Token WS146=null;
		Token string_literal147=null;
		Token WS149=null;
		Token char_literal150=null;
		ParserRuleReturnScope exprBase148 =null;

		Object char_literal145_tree=null;
		Object WS146_tree=null;
		Object string_literal147_tree=null;
		Object WS149_tree=null;
		Object char_literal150_tree=null;
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
		RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");

		try { dbg.enterRule(getGrammarFileName(), "tl");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(138, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:138:4: ( '(' ( WS )* 'tl ' exprBase ( WS )* ')' -> ^( TL exprBase ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:138:6: '(' ( WS )* 'tl ' exprBase ( WS )* ')'
			{
			dbg.location(138,6);
			char_literal145=(Token)match(input,39,FOLLOW_39_in_tl1386);  
			stream_39.add(char_literal145);
			dbg.location(138,10);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:138:10: ( WS )*
			try { dbg.enterSubRule(68);

			loop68:
			while (true) {
				int alt68=2;
				try { dbg.enterDecision(68, decisionCanBacktrack[68]);

				int LA68_0 = input.LA(1);
				if ( (LA68_0==WS) ) {
					alt68=1;
				}

				} finally {dbg.exitDecision(68);}

				switch (alt68) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:138:10: WS
					{
					dbg.location(138,10);
					WS146=(Token)match(input,WS,FOLLOW_WS_in_tl1388);  
					stream_WS.add(WS146);

					}
					break;

				default :
					break loop68;
				}
			}
			} finally {dbg.exitSubRule(68);}
			dbg.location(138,13);
			string_literal147=(Token)match(input,62,FOLLOW_62_in_tl1390);  
			stream_62.add(string_literal147);
			dbg.location(138,19);
			pushFollow(FOLLOW_exprBase_in_tl1392);
			exprBase148=exprBase();
			state._fsp--;

			stream_exprBase.add(exprBase148.getTree());dbg.location(138,28);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:138:28: ( WS )*
			try { dbg.enterSubRule(69);

			loop69:
			while (true) {
				int alt69=2;
				try { dbg.enterDecision(69, decisionCanBacktrack[69]);

				int LA69_0 = input.LA(1);
				if ( (LA69_0==WS) ) {
					alt69=1;
				}

				} finally {dbg.exitDecision(69);}

				switch (alt69) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:138:28: WS
					{
					dbg.location(138,28);
					WS149=(Token)match(input,WS,FOLLOW_WS_in_tl1394);  
					stream_WS.add(WS149);

					}
					break;

				default :
					break loop69;
				}
			}
			} finally {dbg.exitSubRule(69);}
			dbg.location(138,31);
			char_literal150=(Token)match(input,40,FOLLOW_40_in_tl1396);  
			stream_40.add(char_literal150);

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
			// 138:35: -> ^( TL exprBase )
			{
				dbg.location(138,38);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:138:38: ^( TL exprBase )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(138,40);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TL, "TL"), root_1);
				dbg.location(138,43);
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
		dbg.location(138, 51);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:140:1: symbolExpr : '(' ( WS )* Symbol ( WS )* ( lExpr )? ( ' ' )* ')' -> ^( CALL Symbol ( lExpr )? ) ;
	public final while_astParser.symbolExpr_return symbolExpr() throws RecognitionException {
		while_astParser.symbolExpr_return retval = new while_astParser.symbolExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal151=null;
		Token WS152=null;
		Token Symbol153=null;
		Token WS154=null;
		Token char_literal156=null;
		Token char_literal157=null;
		ParserRuleReturnScope lExpr155 =null;

		Object char_literal151_tree=null;
		Object WS152_tree=null;
		Object Symbol153_tree=null;
		Object WS154_tree=null;
		Object char_literal156_tree=null;
		Object char_literal157_tree=null;
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_Symbol=new RewriteRuleTokenStream(adaptor,"token Symbol");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_lExpr=new RewriteRuleSubtreeStream(adaptor,"rule lExpr");

		try { dbg.enterRule(getGrammarFileName(), "symbolExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(140, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:141:2: ( '(' ( WS )* Symbol ( WS )* ( lExpr )? ( ' ' )* ')' -> ^( CALL Symbol ( lExpr )? ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:141:4: '(' ( WS )* Symbol ( WS )* ( lExpr )? ( ' ' )* ')'
			{
			dbg.location(141,4);
			char_literal151=(Token)match(input,39,FOLLOW_39_in_symbolExpr1413);  
			stream_39.add(char_literal151);
			dbg.location(141,8);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:141:8: ( WS )*
			try { dbg.enterSubRule(70);

			loop70:
			while (true) {
				int alt70=2;
				try { dbg.enterDecision(70, decisionCanBacktrack[70]);

				int LA70_0 = input.LA(1);
				if ( (LA70_0==WS) ) {
					alt70=1;
				}

				} finally {dbg.exitDecision(70);}

				switch (alt70) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:141:8: WS
					{
					dbg.location(141,8);
					WS152=(Token)match(input,WS,FOLLOW_WS_in_symbolExpr1415);  
					stream_WS.add(WS152);

					}
					break;

				default :
					break loop70;
				}
			}
			} finally {dbg.exitSubRule(70);}
			dbg.location(141,12);
			Symbol153=(Token)match(input,Symbol,FOLLOW_Symbol_in_symbolExpr1418);  
			stream_Symbol.add(Symbol153);
			dbg.location(141,19);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:141:19: ( WS )*
			try { dbg.enterSubRule(71);

			loop71:
			while (true) {
				int alt71=2;
				try { dbg.enterDecision(71, decisionCanBacktrack[71]);

				int LA71_0 = input.LA(1);
				if ( (LA71_0==WS) ) {
					alt71=1;
				}

				} finally {dbg.exitDecision(71);}

				switch (alt71) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:141:19: WS
					{
					dbg.location(141,19);
					WS154=(Token)match(input,WS,FOLLOW_WS_in_symbolExpr1420);  
					stream_WS.add(WS154);

					}
					break;

				default :
					break loop71;
				}
			}
			} finally {dbg.exitSubRule(71);}
			dbg.location(141,23);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:141:23: ( lExpr )?
			int alt72=2;
			try { dbg.enterSubRule(72);
			try { dbg.enterDecision(72, decisionCanBacktrack[72]);

			int LA72_0 = input.LA(1);
			if ( (LA72_0==Symbol||LA72_0==Variable||LA72_0==39||LA72_0==57) ) {
				alt72=1;
			}
			} finally {dbg.exitDecision(72);}

			switch (alt72) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:141:23: lExpr
					{
					dbg.location(141,23);
					pushFollow(FOLLOW_lExpr_in_symbolExpr1423);
					lExpr155=lExpr();
					state._fsp--;

					stream_lExpr.add(lExpr155.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(72);}
			dbg.location(141,30);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:141:30: ( ' ' )*
			try { dbg.enterSubRule(73);

			loop73:
			while (true) {
				int alt73=2;
				try { dbg.enterDecision(73, decisionCanBacktrack[73]);

				int LA73_0 = input.LA(1);
				if ( (LA73_0==37) ) {
					alt73=1;
				}

				} finally {dbg.exitDecision(73);}

				switch (alt73) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:141:30: ' '
					{
					dbg.location(141,30);
					char_literal156=(Token)match(input,37,FOLLOW_37_in_symbolExpr1426);  
					stream_37.add(char_literal156);

					}
					break;

				default :
					break loop73;
				}
			}
			} finally {dbg.exitSubRule(73);}
			dbg.location(141,34);
			char_literal157=(Token)match(input,40,FOLLOW_40_in_symbolExpr1428);  
			stream_40.add(char_literal157);

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
			// 141:38: -> ^( CALL Symbol ( lExpr )? )
			{
				dbg.location(141,41);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:141:41: ^( CALL Symbol ( lExpr )? )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(141,43);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CALL, "CALL"), root_1);
				dbg.location(141,48);
				adaptor.addChild(root_1, stream_Symbol.nextNode());dbg.location(141,55);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:141:55: ( lExpr )?
				if ( stream_lExpr.hasNext() ) {
					dbg.location(141,55);
					adaptor.addChild(root_1, stream_lExpr.nextTree());
				}
				stream_lExpr.reset();

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
		dbg.location(141, 61);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:144:1: expression : lExpr ( ( WS )* '=?' ( WS )* exprBase )? -> ^( EXPR lExpr ( exprBase )? ) ;
	public final while_astParser.expression_return expression() throws RecognitionException {
		while_astParser.expression_return retval = new while_astParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WS159=null;
		Token string_literal160=null;
		Token WS161=null;
		ParserRuleReturnScope lExpr158 =null;
		ParserRuleReturnScope exprBase162 =null;

		Object WS159_tree=null;
		Object string_literal160_tree=null;
		Object WS161_tree=null;
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");
		RewriteRuleSubtreeStream stream_lExpr=new RewriteRuleSubtreeStream(adaptor,"rule lExpr");

		try { dbg.enterRule(getGrammarFileName(), "expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(144, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:145:5: ( lExpr ( ( WS )* '=?' ( WS )* exprBase )? -> ^( EXPR lExpr ( exprBase )? ) )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:145:7: lExpr ( ( WS )* '=?' ( WS )* exprBase )?
			{
			dbg.location(145,7);
			pushFollow(FOLLOW_lExpr_in_expression1454);
			lExpr158=lExpr();
			state._fsp--;

			stream_lExpr.add(lExpr158.getTree());dbg.location(145,13);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:145:13: ( ( WS )* '=?' ( WS )* exprBase )?
			int alt76=2;
			try { dbg.enterSubRule(76);
			try { dbg.enterDecision(76, decisionCanBacktrack[76]);

			try {
				isCyclicDecision = true;
				alt76 = dfa76.predict(input);
			}
			catch (NoViableAltException nvae) {
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(76);}

			switch (alt76) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:145:14: ( WS )* '=?' ( WS )* exprBase
					{
					dbg.location(145,14);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:145:14: ( WS )*
					try { dbg.enterSubRule(74);

					loop74:
					while (true) {
						int alt74=2;
						try { dbg.enterDecision(74, decisionCanBacktrack[74]);

						int LA74_0 = input.LA(1);
						if ( (LA74_0==WS) ) {
							alt74=1;
						}

						} finally {dbg.exitDecision(74);}

						switch (alt74) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:145:14: WS
							{
							dbg.location(145,14);
							WS159=(Token)match(input,WS,FOLLOW_WS_in_expression1457);  
							stream_WS.add(WS159);

							}
							break;

						default :
							break loop74;
						}
					}
					} finally {dbg.exitSubRule(74);}
					dbg.location(145,18);
					string_literal160=(Token)match(input,45,FOLLOW_45_in_expression1460);  
					stream_45.add(string_literal160);
					dbg.location(145,23);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:145:23: ( WS )*
					try { dbg.enterSubRule(75);

					loop75:
					while (true) {
						int alt75=2;
						try { dbg.enterDecision(75, decisionCanBacktrack[75]);

						int LA75_0 = input.LA(1);
						if ( (LA75_0==WS) ) {
							alt75=1;
						}

						} finally {dbg.exitDecision(75);}

						switch (alt75) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:145:23: WS
							{
							dbg.location(145,23);
							WS161=(Token)match(input,WS,FOLLOW_WS_in_expression1462);  
							stream_WS.add(WS161);

							}
							break;

						default :
							break loop75;
						}
					}
					} finally {dbg.exitSubRule(75);}
					dbg.location(145,27);
					pushFollow(FOLLOW_exprBase_in_expression1465);
					exprBase162=exprBase();
					state._fsp--;

					stream_exprBase.add(exprBase162.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(76);}

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
			// 145:38: -> ^( EXPR lExpr ( exprBase )? )
			{
				dbg.location(145,41);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:145:41: ^( EXPR lExpr ( exprBase )? )
				{
				Object root_1 = (Object)adaptor.nil();
				dbg.location(145,43);
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR, "EXPR"), root_1);
				dbg.location(145,48);
				adaptor.addChild(root_1, stream_lExpr.nextTree());dbg.location(145,54);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:145:54: ( exprBase )?
				if ( stream_exprBase.hasNext() ) {
					dbg.location(145,54);
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
		dbg.location(146, 4);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:149:1: lExpr : exprBase ( ( WS )* lExpr )? -> exprBase ( lExpr )? ;
	public final while_astParser.lExpr_return lExpr() throws RecognitionException {
		while_astParser.lExpr_return retval = new while_astParser.lExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WS164=null;
		ParserRuleReturnScope exprBase163 =null;
		ParserRuleReturnScope lExpr165 =null;

		Object WS164_tree=null;
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");
		RewriteRuleSubtreeStream stream_lExpr=new RewriteRuleSubtreeStream(adaptor,"rule lExpr");

		try { dbg.enterRule(getGrammarFileName(), "lExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(149, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:150:5: ( exprBase ( ( WS )* lExpr )? -> exprBase ( lExpr )? )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:150:7: exprBase ( ( WS )* lExpr )?
			{
			dbg.location(150,7);
			pushFollow(FOLLOW_exprBase_in_lExpr1500);
			exprBase163=exprBase();
			state._fsp--;

			stream_exprBase.add(exprBase163.getTree());dbg.location(150,16);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:150:16: ( ( WS )* lExpr )?
			int alt78=2;
			try { dbg.enterSubRule(78);
			try { dbg.enterDecision(78, decisionCanBacktrack[78]);

			try {
				isCyclicDecision = true;
				alt78 = dfa78.predict(input);
			}
			catch (NoViableAltException nvae) {
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(78);}

			switch (alt78) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:150:17: ( WS )* lExpr
					{
					dbg.location(150,17);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:150:17: ( WS )*
					try { dbg.enterSubRule(77);

					loop77:
					while (true) {
						int alt77=2;
						try { dbg.enterDecision(77, decisionCanBacktrack[77]);

						int LA77_0 = input.LA(1);
						if ( (LA77_0==WS) ) {
							alt77=1;
						}

						} finally {dbg.exitDecision(77);}

						switch (alt77) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:150:17: WS
							{
							dbg.location(150,17);
							WS164=(Token)match(input,WS,FOLLOW_WS_in_lExpr1503);  
							stream_WS.add(WS164);

							}
							break;

						default :
							break loop77;
						}
					}
					} finally {dbg.exitSubRule(77);}
					dbg.location(150,21);
					pushFollow(FOLLOW_lExpr_in_lExpr1506);
					lExpr165=lExpr();
					state._fsp--;

					stream_lExpr.add(lExpr165.getTree());
					}
					break;

			}
			} finally {dbg.exitSubRule(78);}

			// AST REWRITE
			// elements: exprBase, lExpr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 150:29: -> exprBase ( lExpr )?
			{
				dbg.location(150,32);
				adaptor.addChild(root_0, stream_exprBase.nextTree());dbg.location(150,41);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:150:41: ( lExpr )?
				if ( stream_lExpr.hasNext() ) {
					dbg.location(150,41);
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
		dbg.location(151, 4);

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


	protected DFA25 dfa25 = new DFA25(this);
	protected DFA26 dfa26 = new DFA26(this);
	protected DFA61 dfa61 = new DFA61(this);
	protected DFA76 dfa76 = new DFA76(this);
	protected DFA78 dfa78 = new DFA78(this);
	static final String DFA25_eotS =
		"\4\uffff";
	static final String DFA25_eofS =
		"\4\uffff";
	static final String DFA25_minS =
		"\2\44\2\uffff";
	static final String DFA25_maxS =
		"\2\73\2\uffff";
	static final String DFA25_acceptS =
		"\2\uffff\1\1\1\2";
	static final String DFA25_specialS =
		"\4\uffff}>";
	static final String[] DFA25_transitionS = {
			"\1\1\1\uffff\1\3\5\uffff\1\2\3\uffff\2\3\11\uffff\1\3",
			"\1\1\1\uffff\1\3\5\uffff\1\2\3\uffff\2\3\11\uffff\1\3",
			"",
			""
	};

	static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
	static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
	static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
	static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
	static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
	static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
	static final short[][] DFA25_transition;

	static {
		int numStates = DFA25_transitionS.length;
		DFA25_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
		}
	}

	protected class DFA25 extends DFA {

		public DFA25(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 25;
			this.eot = DFA25_eot;
			this.eof = DFA25_eof;
			this.min = DFA25_min;
			this.max = DFA25_max;
			this.accept = DFA25_accept;
			this.special = DFA25_special;
			this.transition = DFA25_transition;
		}
		@Override
		public String getDescription() {
			return "80:15: ( ( WS )* ';' ( WS )* commands )?";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	static final String DFA26_eotS =
		"\12\uffff";
	static final String DFA26_eofS =
		"\12\uffff";
	static final String DFA26_minS =
		"\1\35\1\uffff\1\35\5\uffff\1\35\1\uffff";
	static final String DFA26_maxS =
		"\1\77\1\uffff\1\73\5\uffff\1\73\1\uffff";
	static final String DFA26_acceptS =
		"\1\uffff\1\1\1\uffff\1\3\1\4\1\5\1\6\1\7\1\uffff\1\2";
	static final String DFA26_specialS =
		"\12\uffff}>";
	static final String[] DFA26_transitionS = {
			"\1\7\4\uffff\1\2\4\uffff\1\7\12\uffff\1\4\1\6\2\uffff\1\3\2\uffff\1\7"+
			"\1\1\4\uffff\1\5",
			"",
			"\1\7\4\uffff\1\7\1\uffff\1\10\1\uffff\2\7\1\uffff\1\11\1\uffff\1\11"+
			"\2\7\2\uffff\2\7\7\uffff\1\7\1\uffff\1\7",
			"",
			"",
			"",
			"",
			"",
			"\1\7\4\uffff\1\7\1\uffff\1\10\1\uffff\2\7\1\uffff\1\11\1\uffff\1\11"+
			"\2\7\2\uffff\2\7\7\uffff\1\7\1\uffff\1\7",
			""
	};

	static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
	static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
	static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
	static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
	static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
	static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
	static final short[][] DFA26_transition;

	static {
		int numStates = DFA26_transitionS.length;
		DFA26_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
		}
	}

	protected class DFA26 extends DFA {

		public DFA26(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 26;
			this.eot = DFA26_eot;
			this.eof = DFA26_eof;
			this.min = DFA26_min;
			this.max = DFA26_max;
			this.accept = DFA26_accept;
			this.special = DFA26_special;
			this.transition = DFA26_transition;
		}
		@Override
		public String getDescription() {
			return "83:1: command : ( 'nop' | decl | if_ | for_ | while_ | foreach_ | expression );";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	static final String DFA61_eotS =
		"\13\uffff";
	static final String DFA61_eofS =
		"\13\uffff";
	static final String DFA61_minS =
		"\1\35\3\uffff\2\35\5\uffff";
	static final String DFA61_maxS =
		"\1\71\3\uffff\2\76\5\uffff";
	static final String DFA61_acceptS =
		"\1\uffff\1\1\1\2\1\3\2\uffff\1\4\1\5\1\6\1\7\1\10";
	static final String DFA61_specialS =
		"\13\uffff}>";
	static final String[] DFA61_transitionS = {
			"\1\3\4\uffff\1\2\4\uffff\1\4\21\uffff\1\1",
			"",
			"",
			"",
			"\1\12\6\uffff\1\5\11\uffff\1\6\6\uffff\1\10\2\uffff\1\7\5\uffff\1\11",
			"\1\12\6\uffff\1\5\11\uffff\1\6\6\uffff\1\10\2\uffff\1\7\5\uffff\1\11",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA61_eot = DFA.unpackEncodedString(DFA61_eotS);
	static final short[] DFA61_eof = DFA.unpackEncodedString(DFA61_eofS);
	static final char[] DFA61_min = DFA.unpackEncodedStringToUnsignedChars(DFA61_minS);
	static final char[] DFA61_max = DFA.unpackEncodedStringToUnsignedChars(DFA61_maxS);
	static final short[] DFA61_accept = DFA.unpackEncodedString(DFA61_acceptS);
	static final short[] DFA61_special = DFA.unpackEncodedString(DFA61_specialS);
	static final short[][] DFA61_transition;

	static {
		int numStates = DFA61_transitionS.length;
		DFA61_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA61_transition[i] = DFA.unpackEncodedString(DFA61_transitionS[i]);
		}
	}

	protected class DFA61 extends DFA {

		public DFA61(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 61;
			this.eot = DFA61_eot;
			this.eof = DFA61_eof;
			this.min = DFA61_min;
			this.max = DFA61_max;
			this.accept = DFA61_accept;
			this.special = DFA61_special;
			this.transition = DFA61_transition;
		}
		@Override
		public String getDescription() {
			return "120:1: exprBase : ( nil_ | variable | symbol | cons | list | hd | tl | symbolExpr );";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	static final String DFA76_eotS =
		"\4\uffff";
	static final String DFA76_eofS =
		"\4\uffff";
	static final String DFA76_minS =
		"\2\7\2\uffff";
	static final String DFA76_maxS =
		"\2\75\2\uffff";
	static final String DFA76_acceptS =
		"\2\uffff\1\1\1\2";
	static final String DFA76_specialS =
		"\4\uffff}>";
	static final String[] DFA76_transitionS = {
			"\1\3\34\uffff\1\1\1\uffff\1\3\2\uffff\1\3\2\uffff\1\3\1\2\1\uffff\3\3"+
			"\11\uffff\1\3\1\uffff\1\3",
			"\1\3\34\uffff\1\1\1\uffff\1\3\2\uffff\1\3\2\uffff\1\3\1\2\1\uffff\3"+
			"\3\11\uffff\1\3\1\uffff\1\3",
			"",
			""
	};

	static final short[] DFA76_eot = DFA.unpackEncodedString(DFA76_eotS);
	static final short[] DFA76_eof = DFA.unpackEncodedString(DFA76_eofS);
	static final char[] DFA76_min = DFA.unpackEncodedStringToUnsignedChars(DFA76_minS);
	static final char[] DFA76_max = DFA.unpackEncodedStringToUnsignedChars(DFA76_maxS);
	static final short[] DFA76_accept = DFA.unpackEncodedString(DFA76_acceptS);
	static final short[] DFA76_special = DFA.unpackEncodedString(DFA76_specialS);
	static final short[][] DFA76_transition;

	static {
		int numStates = DFA76_transitionS.length;
		DFA76_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA76_transition[i] = DFA.unpackEncodedString(DFA76_transitionS[i]);
		}
	}

	protected class DFA76 extends DFA {

		public DFA76(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 76;
			this.eot = DFA76_eot;
			this.eof = DFA76_eof;
			this.min = DFA76_min;
			this.max = DFA76_max;
			this.accept = DFA76_accept;
			this.special = DFA76_special;
			this.transition = DFA76_transition;
		}
		@Override
		public String getDescription() {
			return "145:13: ( ( WS )* '=?' ( WS )* exprBase )?";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	static final String DFA78_eotS =
		"\4\uffff";
	static final String DFA78_eofS =
		"\4\uffff";
	static final String DFA78_minS =
		"\2\7\2\uffff";
	static final String DFA78_maxS =
		"\2\75\2\uffff";
	static final String DFA78_acceptS =
		"\2\uffff\1\1\1\2";
	static final String DFA78_specialS =
		"\4\uffff}>";
	static final String[] DFA78_transitionS = {
			"\1\3\25\uffff\1\2\4\uffff\1\2\1\uffff\1\1\2\3\1\2\2\3\2\uffff\2\3\1\uffff"+
			"\3\3\7\uffff\1\2\1\uffff\1\3\1\uffff\1\3",
			"\1\3\25\uffff\1\2\4\uffff\1\2\1\uffff\1\1\1\uffff\1\3\1\2\2\3\2\uffff"+
			"\2\3\1\uffff\3\3\7\uffff\1\2\1\uffff\1\3\1\uffff\1\3",
			"",
			""
	};

	static final short[] DFA78_eot = DFA.unpackEncodedString(DFA78_eotS);
	static final short[] DFA78_eof = DFA.unpackEncodedString(DFA78_eofS);
	static final char[] DFA78_min = DFA.unpackEncodedStringToUnsignedChars(DFA78_minS);
	static final char[] DFA78_max = DFA.unpackEncodedStringToUnsignedChars(DFA78_maxS);
	static final short[] DFA78_accept = DFA.unpackEncodedString(DFA78_acceptS);
	static final short[] DFA78_special = DFA.unpackEncodedString(DFA78_specialS);
	static final short[][] DFA78_transition;

	static {
		int numStates = DFA78_transitionS.length;
		DFA78_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA78_transition[i] = DFA.unpackEncodedString(DFA78_transitionS[i]);
		}
	}

	protected class DFA78 extends DFA {

		public DFA78(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 78;
			this.eot = DFA78_eot;
			this.eof = DFA78_eof;
			this.min = DFA78_min;
			this.max = DFA78_max;
			this.accept = DFA78_accept;
			this.special = DFA78_special;
			this.transition = DFA78_transition;
		}
		@Override
		public String getDescription() {
			return "150:16: ( ( WS )* lExpr )?";
		}
		public void error(NoViableAltException nvae) {
			dbg.recognitionException(nvae);
		}
	}

	public static final BitSet FOLLOW_program_in_startProgram223 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Comment_in_getComment402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_in_program422 = new BitSet(new long[]{0x0010001000000082L});
	public static final BitSet FOLLOW_WS_in_program424 = new BitSet(new long[]{0x0010001000000082L});
	public static final BitSet FOLLOW_program_in_program427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getComment_in_function458 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_52_in_function461 = new BitSet(new long[]{0x0000001020000000L});
	public static final BitSet FOLLOW_WS_in_function463 = new BitSet(new long[]{0x0000001020000000L});
	public static final BitSet FOLLOW_symbol_in_function466 = new BitSet(new long[]{0x0000041000000000L});
	public static final BitSet FOLLOW_WS_in_function468 = new BitSet(new long[]{0x0000041000000000L});
	public static final BitSet FOLLOW_42_in_function471 = new BitSet(new long[]{0x1000001000000080L});
	public static final BitSet FOLLOW_getComment_in_function473 = new BitSet(new long[]{0x1000001000000000L});
	public static final BitSet FOLLOW_WS_in_function476 = new BitSet(new long[]{0x1000001000000000L});
	public static final BitSet FOLLOW_definition_in_function479 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_60_in_definition512 = new BitSet(new long[]{0x0000005400000080L});
	public static final BitSet FOLLOW_WS_in_definition514 = new BitSet(new long[]{0x0000005400000080L});
	public static final BitSet FOLLOW_input_in_definition517 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_definition519 = new BitSet(new long[]{0x864C009420000080L});
	public static final BitSet FOLLOW_getComment_in_definition521 = new BitSet(new long[]{0x864C009420000000L});
	public static final BitSet FOLLOW_WS_in_definition524 = new BitSet(new long[]{0x864C009420000000L});
	public static final BitSet FOLLOW_commands_in_definition527 = new BitSet(new long[]{0x0000005000000000L});
	public static final BitSet FOLLOW_WS_in_definition529 = new BitSet(new long[]{0x0000005000000000L});
	public static final BitSet FOLLOW_38_in_definition532 = new BitSet(new long[]{0x0000001000000080L,0x0000000000000001L});
	public static final BitSet FOLLOW_getComment_in_definition534 = new BitSet(new long[]{0x0000001000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_WS_in_definition537 = new BitSet(new long[]{0x0000001000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_definition540 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_output_in_definition542 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_getComment_in_definition544 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inputSub_in_input576 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_getComment_in_input579 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_inputSub610 = new BitSet(new long[]{0x0000021000000002L});
	public static final BitSet FOLLOW_WS_in_inputSub612 = new BitSet(new long[]{0x0000021000000002L});
	public static final BitSet FOLLOW_41_in_inputSub616 = new BitSet(new long[]{0x0000001400000000L});
	public static final BitSet FOLLOW_WS_in_inputSub618 = new BitSet(new long[]{0x0000001400000000L});
	public static final BitSet FOLLOW_inputSub_in_inputSub621 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_output648 = new BitSet(new long[]{0x0000021000000002L});
	public static final BitSet FOLLOW_WS_in_output650 = new BitSet(new long[]{0x0000021000000002L});
	public static final BitSet FOLLOW_41_in_output654 = new BitSet(new long[]{0x0000001400000000L});
	public static final BitSet FOLLOW_WS_in_output656 = new BitSet(new long[]{0x0000001400000000L});
	public static final BitSet FOLLOW_output_in_output659 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_in_commands689 = new BitSet(new long[]{0x0000101000000002L});
	public static final BitSet FOLLOW_WS_in_commands693 = new BitSet(new long[]{0x0000101000000000L});
	public static final BitSet FOLLOW_44_in_commands696 = new BitSet(new long[]{0x864C009420000000L});
	public static final BitSet FOLLOW_WS_in_commands698 = new BitSet(new long[]{0x864C009420000000L});
	public static final BitSet FOLLOW_commands_in_commands701 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_command728 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decl_in_command732 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if__in_command736 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_for__in_command740 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_while__in_command744 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foreach__in_command748 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_command752 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vars_in_decl765 = new BitSet(new long[]{0x0000081000000000L});
	public static final BitSet FOLLOW_WS_in_decl767 = new BitSet(new long[]{0x0000081000000000L});
	public static final BitSet FOLLOW_43_in_decl770 = new BitSet(new long[]{0x0200009420000000L});
	public static final BitSet FOLLOW_WS_in_decl772 = new BitSet(new long[]{0x0200009420000000L});
	public static final BitSet FOLLOW_exprs_in_decl775 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_getComment_in_decl778 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_if_812 = new BitSet(new long[]{0x0200009420000000L});
	public static final BitSet FOLLOW_WS_in_if_814 = new BitSet(new long[]{0x0200009420000000L});
	public static final BitSet FOLLOW_expression_in_if_817 = new BitSet(new long[]{0x2000001000000000L});
	public static final BitSet FOLLOW_WS_in_if_819 = new BitSet(new long[]{0x2000001000000000L});
	public static final BitSet FOLLOW_then__in_if_822 = new BitSet(new long[]{0x0003001000000000L});
	public static final BitSet FOLLOW_WS_in_if_824 = new BitSet(new long[]{0x0003001000000000L});
	public static final BitSet FOLLOW_else__in_if_828 = new BitSet(new long[]{0x0002001000000000L});
	public static final BitSet FOLLOW_WS_in_if_830 = new BitSet(new long[]{0x0002001000000000L});
	public static final BitSet FOLLOW_49_in_if_835 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_getComment_in_if_837 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_61_in_then_875 = new BitSet(new long[]{0x864C009420000080L});
	public static final BitSet FOLLOW_getComment_in_then_877 = new BitSet(new long[]{0x864C009420000000L});
	public static final BitSet FOLLOW_WS_in_then_880 = new BitSet(new long[]{0x864C009420000000L});
	public static final BitSet FOLLOW_commands_in_then_883 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_else_903 = new BitSet(new long[]{0x864C009420000080L});
	public static final BitSet FOLLOW_getComment_in_else_905 = new BitSet(new long[]{0x864C009420000000L});
	public static final BitSet FOLLOW_WS_in_else_908 = new BitSet(new long[]{0x864C009420000000L});
	public static final BitSet FOLLOW_commands_in_else_911 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_while_937 = new BitSet(new long[]{0x0200009420000000L});
	public static final BitSet FOLLOW_WS_in_while_939 = new BitSet(new long[]{0x0200009420000000L});
	public static final BitSet FOLLOW_expression_in_while_942 = new BitSet(new long[]{0x0000801000000080L});
	public static final BitSet FOLLOW_getComment_in_while_944 = new BitSet(new long[]{0x0000801000000000L});
	public static final BitSet FOLLOW_WS_in_while_947 = new BitSet(new long[]{0x0000801000000000L});
	public static final BitSet FOLLOW_do__in_while_950 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_do_984 = new BitSet(new long[]{0x864C009420000080L});
	public static final BitSet FOLLOW_getComment_in_do_986 = new BitSet(new long[]{0x864C009420000000L});
	public static final BitSet FOLLOW_WS_in_do_989 = new BitSet(new long[]{0x864C009420000000L});
	public static final BitSet FOLLOW_commands_in_do_992 = new BitSet(new long[]{0x0800001000000000L});
	public static final BitSet FOLLOW_WS_in_do_994 = new BitSet(new long[]{0x0800001000000000L});
	public static final BitSet FOLLOW_59_in_do_997 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_getComment_in_do_999 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_for_1025 = new BitSet(new long[]{0x0200009420000000L});
	public static final BitSet FOLLOW_WS_in_for_1027 = new BitSet(new long[]{0x0200009420000000L});
	public static final BitSet FOLLOW_expression_in_for_1030 = new BitSet(new long[]{0x0000801000000080L});
	public static final BitSet FOLLOW_getComment_in_for_1032 = new BitSet(new long[]{0x0000801000000000L});
	public static final BitSet FOLLOW_WS_in_for_1035 = new BitSet(new long[]{0x0000801000000000L});
	public static final BitSet FOLLOW_do__in_for_1038 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_foreach_1069 = new BitSet(new long[]{0x0000001400000000L});
	public static final BitSet FOLLOW_WS_in_foreach_1071 = new BitSet(new long[]{0x0000001400000000L});
	public static final BitSet FOLLOW_variable_in_foreach_1074 = new BitSet(new long[]{0x0080001000000000L});
	public static final BitSet FOLLOW_WS_in_foreach_1076 = new BitSet(new long[]{0x0080001000000000L});
	public static final BitSet FOLLOW_55_in_foreach_1079 = new BitSet(new long[]{0x0200009420000000L});
	public static final BitSet FOLLOW_WS_in_foreach_1081 = new BitSet(new long[]{0x0200009420000000L});
	public static final BitSet FOLLOW_expression_in_foreach_1084 = new BitSet(new long[]{0x0000801000000080L});
	public static final BitSet FOLLOW_getComment_in_foreach_1086 = new BitSet(new long[]{0x0000801000000000L});
	public static final BitSet FOLLOW_WS_in_foreach_1089 = new BitSet(new long[]{0x0000801000000000L});
	public static final BitSet FOLLOW_do__in_foreach_1092 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_vars1131 = new BitSet(new long[]{0x0000021000000002L});
	public static final BitSet FOLLOW_WS_in_vars1133 = new BitSet(new long[]{0x0000021000000002L});
	public static final BitSet FOLLOW_41_in_vars1137 = new BitSet(new long[]{0x0000001400000000L});
	public static final BitSet FOLLOW_WS_in_vars1138 = new BitSet(new long[]{0x0000001400000000L});
	public static final BitSet FOLLOW_vars_in_vars1141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_exprs1167 = new BitSet(new long[]{0x0000021000000002L});
	public static final BitSet FOLLOW_WS_in_exprs1169 = new BitSet(new long[]{0x0000021000000002L});
	public static final BitSet FOLLOW_41_in_exprs1173 = new BitSet(new long[]{0x0200009420000000L});
	public static final BitSet FOLLOW_WS_in_exprs1174 = new BitSet(new long[]{0x0200009420000000L});
	public static final BitSet FOLLOW_exprs_in_exprs1177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nil__in_exprBase1202 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_exprBase1210 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_symbol_in_exprBase1214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cons_in_exprBase1222 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_list_in_exprBase1226 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_hd_in_exprBase1234 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tl_in_exprBase1238 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_symbolExpr_in_exprBase1246 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_nil_1264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_variable1281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Symbol_in_symbol1293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_cons1305 = new BitSet(new long[]{0x0000401000000000L});
	public static final BitSet FOLLOW_WS_in_cons1307 = new BitSet(new long[]{0x0000401000000000L});
	public static final BitSet FOLLOW_46_in_cons1310 = new BitSet(new long[]{0x0200008420000000L});
	public static final BitSet FOLLOW_lExpr_in_cons1312 = new BitSet(new long[]{0x0000011000000000L});
	public static final BitSet FOLLOW_WS_in_cons1314 = new BitSet(new long[]{0x0000011000000000L});
	public static final BitSet FOLLOW_40_in_cons1317 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_list1333 = new BitSet(new long[]{0x0100001000000000L});
	public static final BitSet FOLLOW_WS_in_list1334 = new BitSet(new long[]{0x0100001000000000L});
	public static final BitSet FOLLOW_56_in_list1337 = new BitSet(new long[]{0x0200008420000000L});
	public static final BitSet FOLLOW_lExpr_in_list1339 = new BitSet(new long[]{0x0000011000000000L});
	public static final BitSet FOLLOW_WS_in_list1341 = new BitSet(new long[]{0x0000011000000000L});
	public static final BitSet FOLLOW_40_in_list1344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_hd1360 = new BitSet(new long[]{0x0020001000000000L});
	public static final BitSet FOLLOW_WS_in_hd1361 = new BitSet(new long[]{0x0020001000000000L});
	public static final BitSet FOLLOW_53_in_hd1364 = new BitSet(new long[]{0x0200008420000000L});
	public static final BitSet FOLLOW_exprBase_in_hd1366 = new BitSet(new long[]{0x0000011000000000L});
	public static final BitSet FOLLOW_WS_in_hd1368 = new BitSet(new long[]{0x0000011000000000L});
	public static final BitSet FOLLOW_40_in_hd1370 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_tl1386 = new BitSet(new long[]{0x4000001000000000L});
	public static final BitSet FOLLOW_WS_in_tl1388 = new BitSet(new long[]{0x4000001000000000L});
	public static final BitSet FOLLOW_62_in_tl1390 = new BitSet(new long[]{0x0200008420000000L});
	public static final BitSet FOLLOW_exprBase_in_tl1392 = new BitSet(new long[]{0x0000011000000000L});
	public static final BitSet FOLLOW_WS_in_tl1394 = new BitSet(new long[]{0x0000011000000000L});
	public static final BitSet FOLLOW_40_in_tl1396 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_39_in_symbolExpr1413 = new BitSet(new long[]{0x0000001020000000L});
	public static final BitSet FOLLOW_WS_in_symbolExpr1415 = new BitSet(new long[]{0x0000001020000000L});
	public static final BitSet FOLLOW_Symbol_in_symbolExpr1418 = new BitSet(new long[]{0x020001B420000000L});
	public static final BitSet FOLLOW_WS_in_symbolExpr1420 = new BitSet(new long[]{0x020001B420000000L});
	public static final BitSet FOLLOW_lExpr_in_symbolExpr1423 = new BitSet(new long[]{0x0000012000000000L});
	public static final BitSet FOLLOW_37_in_symbolExpr1426 = new BitSet(new long[]{0x0000012000000000L});
	public static final BitSet FOLLOW_40_in_symbolExpr1428 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lExpr_in_expression1454 = new BitSet(new long[]{0x0000201000000002L});
	public static final BitSet FOLLOW_WS_in_expression1457 = new BitSet(new long[]{0x0000201000000000L});
	public static final BitSet FOLLOW_45_in_expression1460 = new BitSet(new long[]{0x0200009420000000L});
	public static final BitSet FOLLOW_WS_in_expression1462 = new BitSet(new long[]{0x0200009420000000L});
	public static final BitSet FOLLOW_exprBase_in_expression1465 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprBase_in_lExpr1500 = new BitSet(new long[]{0x0200009420000002L});
	public static final BitSet FOLLOW_WS_in_lExpr1503 = new BitSet(new long[]{0x0200009420000000L});
	public static final BitSet FOLLOW_lExpr_in_lExpr1506 = new BitSet(new long[]{0x0000000000000002L});
}

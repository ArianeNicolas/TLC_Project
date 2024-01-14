// $ANTLR 3.5.1 C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g 2024-01-14 14:06:10

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class while_astParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CALL", "COMMENT", "CONS", "Comment", 
		"DO", "Dec", "ELSE", "END", "EXPR", "EXPRBASE", "FOR", "FOREACH", "FUNCDEF", 
		"FUNCTION", "HD", "IF", "IN", "INPUTS", "LIST", "Maj", "Min", "NOT", "OUTPUT", 
		"PROGRAM", "START", "Symbol", "THEN", "TL", "VARDEF", "VARIABLES", "Variable", 
		"WHILE", "WS", "'%'", "'('", "')'", "','", "':'", "':='", "';'", "'=?'", 
		"'cons'", "'do'", "'else'", "'fi'", "'for'", "'foreach'", "'function'", 
		"'hd'", "'if'", "'in'", "'list'", "'nil'", "'nop'", "'od'", "'read'", 
		"'then'", "'tl'", "'while'", "'write'"
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


	public while_astParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public while_astParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return while_astParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g"; }


	public static class startProgram_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "startProgram"
	// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:37:1: startProgram : program -> ^( START program ) ;
	public final while_astParser.startProgram_return startProgram() throws RecognitionException {
		while_astParser.startProgram_return retval = new while_astParser.startProgram_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope program1 =null;

		RewriteRuleSubtreeStream stream_program=new RewriteRuleSubtreeStream(adaptor,"rule program");

		try {
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:38:5: ( program -> ^( START program ) )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:38:7: program
			{
			pushFollow(FOLLOW_program_in_startProgram224);
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
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:38:18: ^( START program )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(START, "START"), root_1);
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
		return retval;
	}
	// $ANTLR end "startProgram"


	public static class getComment_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "getComment"
	// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:51:1: getComment : Comment -> ^( COMMENT Comment ) ;
	public final while_astParser.getComment_return getComment() throws RecognitionException {
		while_astParser.getComment_return retval = new while_astParser.getComment_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Comment2=null;

		Object Comment2_tree=null;
		RewriteRuleTokenStream stream_Comment=new RewriteRuleTokenStream(adaptor,"token Comment");

		try {
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:52:2: ( Comment -> ^( COMMENT Comment ) )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:52:4: Comment
			{
			Comment2=(Token)match(input,Comment,FOLLOW_Comment_in_getComment406);  
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
			// 52:12: -> ^( COMMENT Comment )
			{
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:52:15: ^( COMMENT Comment )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMMENT, "COMMENT"), root_1);
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
		return retval;
	}
	// $ANTLR end "getComment"


	public static class variable_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "variable"
	// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:54:1: variable : Variable -> Variable ;
	public final while_astParser.variable_return variable() throws RecognitionException {
		while_astParser.variable_return retval = new while_astParser.variable_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Variable3=null;

		Object Variable3_tree=null;
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");

		try {
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:54:9: ( Variable -> Variable )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:54:11: Variable
			{
			Variable3=(Token)match(input,Variable,FOLLOW_Variable_in_variable422);  
			stream_Variable.add(Variable3);

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
			// 54:20: -> Variable
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


	public static class symbol_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "symbol"
	// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:56:1: symbol : Symbol -> Symbol ;
	public final while_astParser.symbol_return symbol() throws RecognitionException {
		while_astParser.symbol_return retval = new while_astParser.symbol_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Symbol4=null;

		Object Symbol4_tree=null;
		RewriteRuleTokenStream stream_Symbol=new RewriteRuleTokenStream(adaptor,"token Symbol");

		try {
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:56:8: ( Symbol -> Symbol )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:56:10: Symbol
			{
			Symbol4=(Token)match(input,Symbol,FOLLOW_Symbol_in_symbol434);  
			stream_Symbol.add(Symbol4);

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
			// 56:17: -> Symbol
			{
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
		return retval;
	}
	// $ANTLR end "symbol"


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:58:1: program : function ( WS )* ( program )? -> ^( PROGRAM function ( program )? ) ;
	public final while_astParser.program_return program() throws RecognitionException {
		while_astParser.program_return retval = new while_astParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WS6=null;
		ParserRuleReturnScope function5 =null;
		ParserRuleReturnScope program7 =null;

		Object WS6_tree=null;
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_function=new RewriteRuleSubtreeStream(adaptor,"rule function");
		RewriteRuleSubtreeStream stream_program=new RewriteRuleSubtreeStream(adaptor,"rule program");

		try {
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:59:5: ( function ( WS )* ( program )? -> ^( PROGRAM function ( program )? ) )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:59:7: function ( WS )* ( program )?
			{
			pushFollow(FOLLOW_function_in_program450);
			function5=function();
			state._fsp--;

			stream_function.add(function5.getTree());
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:59:16: ( WS )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==WS) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:59:16: WS
					{
					WS6=(Token)match(input,WS,FOLLOW_WS_in_program452);  
					stream_WS.add(WS6);

					}
					break;

				default :
					break loop1;
				}
			}

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:59:20: ( program )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==Comment||LA2_0==WS||LA2_0==51) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:59:20: program
					{
					pushFollow(FOLLOW_program_in_program455);
					program7=program();
					state._fsp--;

					stream_program.add(program7.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: function, program
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 59:29: -> ^( PROGRAM function ( program )? )
			{
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:59:32: ^( PROGRAM function ( program )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);
				adaptor.addChild(root_1, stream_function.nextTree());
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:59:51: ( program )?
				if ( stream_program.hasNext() ) {
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
		return retval;
	}
	// $ANTLR end "program"


	public static class function_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "function"
	// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:62:1: function : ( WS )* ( getComment )? 'function' WS Symbol ( WS )* ':' ( WS )* ( getComment )? ( WS )* definition -> ^( FUNCDEF Symbol definition END ) ;
	public final while_astParser.function_return function() throws RecognitionException {
		while_astParser.function_return retval = new while_astParser.function_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WS8=null;
		Token string_literal10=null;
		Token WS11=null;
		Token Symbol12=null;
		Token WS13=null;
		Token char_literal14=null;
		Token WS15=null;
		Token WS17=null;
		ParserRuleReturnScope getComment9 =null;
		ParserRuleReturnScope getComment16 =null;
		ParserRuleReturnScope definition18 =null;

		Object WS8_tree=null;
		Object string_literal10_tree=null;
		Object WS11_tree=null;
		Object Symbol12_tree=null;
		Object WS13_tree=null;
		Object char_literal14_tree=null;
		Object WS15_tree=null;
		Object WS17_tree=null;
		RewriteRuleTokenStream stream_Symbol=new RewriteRuleTokenStream(adaptor,"token Symbol");
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");
		RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"rule definition");

		try {
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:63:5: ( ( WS )* ( getComment )? 'function' WS Symbol ( WS )* ':' ( WS )* ( getComment )? ( WS )* definition -> ^( FUNCDEF Symbol definition END ) )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:63:7: ( WS )* ( getComment )? 'function' WS Symbol ( WS )* ':' ( WS )* ( getComment )? ( WS )* definition
			{
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:63:7: ( WS )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==WS) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:63:7: WS
					{
					WS8=(Token)match(input,WS,FOLLOW_WS_in_function486);  
					stream_WS.add(WS8);

					}
					break;

				default :
					break loop3;
				}
			}

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:63:11: ( getComment )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==Comment) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:63:11: getComment
					{
					pushFollow(FOLLOW_getComment_in_function489);
					getComment9=getComment();
					state._fsp--;

					stream_getComment.add(getComment9.getTree());
					}
					break;

			}

			string_literal10=(Token)match(input,51,FOLLOW_51_in_function492);  
			stream_51.add(string_literal10);

			WS11=(Token)match(input,WS,FOLLOW_WS_in_function494);  
			stream_WS.add(WS11);

			Symbol12=(Token)match(input,Symbol,FOLLOW_Symbol_in_function496);  
			stream_Symbol.add(Symbol12);

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:63:44: ( WS )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==WS) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:63:44: WS
					{
					WS13=(Token)match(input,WS,FOLLOW_WS_in_function498);  
					stream_WS.add(WS13);

					}
					break;

				default :
					break loop5;
				}
			}

			char_literal14=(Token)match(input,41,FOLLOW_41_in_function501);  
			stream_41.add(char_literal14);

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:63:52: ( WS )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==WS) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:63:52: WS
					{
					WS15=(Token)match(input,WS,FOLLOW_WS_in_function503);  
					stream_WS.add(WS15);

					}
					break;

				default :
					break loop6;
				}
			}

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:63:56: ( getComment )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==Comment) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:63:56: getComment
					{
					pushFollow(FOLLOW_getComment_in_function506);
					getComment16=getComment();
					state._fsp--;

					stream_getComment.add(getComment16.getTree());
					}
					break;

			}

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:63:68: ( WS )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==WS) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:63:68: WS
					{
					WS17=(Token)match(input,WS,FOLLOW_WS_in_function509);  
					stream_WS.add(WS17);

					}
					break;

				default :
					break loop8;
				}
			}

			pushFollow(FOLLOW_definition_in_function512);
			definition18=definition();
			state._fsp--;

			stream_definition.add(definition18.getTree());
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
			// 63:83: -> ^( FUNCDEF Symbol definition END )
			{
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:63:86: ^( FUNCDEF Symbol definition END )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCDEF, "FUNCDEF"), root_1);
				adaptor.addChild(root_1, stream_Symbol.nextNode());
				adaptor.addChild(root_1, stream_definition.nextTree());
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
	// $ANTLR end "function"


	public static class definition_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "definition"
	// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:66:1: definition : 'read' ( WS )* input '%' ( WS )* ( getComment )? ( WS )* commands ( WS )* '%' ( WS )* ( getComment )? ( WS )* 'write' ( WS )* output ( WS )* ( getComment )? -> ^( FUNCTION input commands output ) ;
	public final while_astParser.definition_return definition() throws RecognitionException {
		while_astParser.definition_return retval = new while_astParser.definition_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal19=null;
		Token WS20=null;
		Token char_literal22=null;
		Token WS23=null;
		Token WS25=null;
		Token WS27=null;
		Token char_literal28=null;
		Token WS29=null;
		Token WS31=null;
		Token string_literal32=null;
		Token WS33=null;
		Token WS35=null;
		ParserRuleReturnScope input21 =null;
		ParserRuleReturnScope getComment24 =null;
		ParserRuleReturnScope commands26 =null;
		ParserRuleReturnScope getComment30 =null;
		ParserRuleReturnScope output34 =null;
		ParserRuleReturnScope getComment36 =null;

		Object string_literal19_tree=null;
		Object WS20_tree=null;
		Object char_literal22_tree=null;
		Object WS23_tree=null;
		Object WS25_tree=null;
		Object WS27_tree=null;
		Object char_literal28_tree=null;
		Object WS29_tree=null;
		Object WS31_tree=null;
		Object string_literal32_tree=null;
		Object WS33_tree=null;
		Object WS35_tree=null;
		RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
		RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");
		RewriteRuleSubtreeStream stream_input=new RewriteRuleSubtreeStream(adaptor,"rule input");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:67:5: ( 'read' ( WS )* input '%' ( WS )* ( getComment )? ( WS )* commands ( WS )* '%' ( WS )* ( getComment )? ( WS )* 'write' ( WS )* output ( WS )* ( getComment )? -> ^( FUNCTION input commands output ) )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:67:7: 'read' ( WS )* input '%' ( WS )* ( getComment )? ( WS )* commands ( WS )* '%' ( WS )* ( getComment )? ( WS )* 'write' ( WS )* output ( WS )* ( getComment )?
			{
			string_literal19=(Token)match(input,59,FOLLOW_59_in_definition542);  
			stream_59.add(string_literal19);

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:67:14: ( WS )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==WS) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:67:14: WS
					{
					WS20=(Token)match(input,WS,FOLLOW_WS_in_definition544);  
					stream_WS.add(WS20);

					}
					break;

				default :
					break loop9;
				}
			}

			pushFollow(FOLLOW_input_in_definition547);
			input21=input();
			state._fsp--;

			stream_input.add(input21.getTree());
			char_literal22=(Token)match(input,37,FOLLOW_37_in_definition549);  
			stream_37.add(char_literal22);

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:67:28: ( WS )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==WS) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:67:28: WS
					{
					WS23=(Token)match(input,WS,FOLLOW_WS_in_definition551);  
					stream_WS.add(WS23);

					}
					break;

				default :
					break loop10;
				}
			}

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:67:32: ( getComment )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==Comment) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:67:32: getComment
					{
					pushFollow(FOLLOW_getComment_in_definition554);
					getComment24=getComment();
					state._fsp--;

					stream_getComment.add(getComment24.getTree());
					}
					break;

			}

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:67:44: ( WS )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==WS) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:67:44: WS
					{
					WS25=(Token)match(input,WS,FOLLOW_WS_in_definition557);  
					stream_WS.add(WS25);

					}
					break;

				default :
					break loop12;
				}
			}

			pushFollow(FOLLOW_commands_in_definition560);
			commands26=commands();
			state._fsp--;

			stream_commands.add(commands26.getTree());
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:67:57: ( WS )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==WS) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:67:57: WS
					{
					WS27=(Token)match(input,WS,FOLLOW_WS_in_definition562);  
					stream_WS.add(WS27);

					}
					break;

				default :
					break loop13;
				}
			}

			char_literal28=(Token)match(input,37,FOLLOW_37_in_definition565);  
			stream_37.add(char_literal28);

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:67:65: ( WS )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==WS) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:67:65: WS
					{
					WS29=(Token)match(input,WS,FOLLOW_WS_in_definition567);  
					stream_WS.add(WS29);

					}
					break;

				default :
					break loop14;
				}
			}

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:67:69: ( getComment )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==Comment) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:67:69: getComment
					{
					pushFollow(FOLLOW_getComment_in_definition570);
					getComment30=getComment();
					state._fsp--;

					stream_getComment.add(getComment30.getTree());
					}
					break;

			}

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:67:81: ( WS )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==WS) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:67:81: WS
					{
					WS31=(Token)match(input,WS,FOLLOW_WS_in_definition573);  
					stream_WS.add(WS31);

					}
					break;

				default :
					break loop16;
				}
			}

			string_literal32=(Token)match(input,63,FOLLOW_63_in_definition576);  
			stream_63.add(string_literal32);

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:67:93: ( WS )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==WS) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:67:93: WS
					{
					WS33=(Token)match(input,WS,FOLLOW_WS_in_definition578);  
					stream_WS.add(WS33);

					}
					break;

				default :
					break loop17;
				}
			}

			pushFollow(FOLLOW_output_in_definition581);
			output34=output();
			state._fsp--;

			stream_output.add(output34.getTree());
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:67:104: ( WS )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==WS) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:67:104: WS
					{
					WS35=(Token)match(input,WS,FOLLOW_WS_in_definition583);  
					stream_WS.add(WS35);

					}
					break;

				default :
					break loop18;
				}
			}

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:67:108: ( getComment )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==Comment) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:67:108: getComment
					{
					pushFollow(FOLLOW_getComment_in_definition586);
					getComment36=getComment();
					state._fsp--;

					stream_getComment.add(getComment36.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: input, output, commands
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 67:119: -> ^( FUNCTION input commands output )
			{
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:67:122: ^( FUNCTION input commands output )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION, "FUNCTION"), root_1);
				adaptor.addChild(root_1, stream_input.nextTree());
				adaptor.addChild(root_1, stream_commands.nextTree());
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
		return retval;
	}
	// $ANTLR end "definition"


	public static class input_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "input"
	// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:70:1: input : ( inputSub )? ( WS )* ( getComment )? -> ^( INPUTS ( inputSub )? ) ;
	public final while_astParser.input_return input() throws RecognitionException {
		while_astParser.input_return retval = new while_astParser.input_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WS38=null;
		ParserRuleReturnScope inputSub37 =null;
		ParserRuleReturnScope getComment39 =null;

		Object WS38_tree=null;
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_inputSub=new RewriteRuleSubtreeStream(adaptor,"rule inputSub");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");

		try {
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:71:5: ( ( inputSub )? ( WS )* ( getComment )? -> ^( INPUTS ( inputSub )? ) )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:71:7: ( inputSub )? ( WS )* ( getComment )?
			{
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:71:7: ( inputSub )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==Variable) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:71:7: inputSub
					{
					pushFollow(FOLLOW_inputSub_in_input616);
					inputSub37=inputSub();
					state._fsp--;

					stream_inputSub.add(inputSub37.getTree());
					}
					break;

			}

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:71:17: ( WS )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==WS) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:71:17: WS
					{
					WS38=(Token)match(input,WS,FOLLOW_WS_in_input619);  
					stream_WS.add(WS38);

					}
					break;

				default :
					break loop21;
				}
			}

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:71:21: ( getComment )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==Comment) ) {
				alt22=1;
			}
			switch (alt22) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:71:21: getComment
					{
					pushFollow(FOLLOW_getComment_in_input622);
					getComment39=getComment();
					state._fsp--;

					stream_getComment.add(getComment39.getTree());
					}
					break;

			}

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
			// 71:33: -> ^( INPUTS ( inputSub )? )
			{
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:71:37: ^( INPUTS ( inputSub )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INPUTS, "INPUTS"), root_1);
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:71:46: ( inputSub )?
				if ( stream_inputSub.hasNext() ) {
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
		return retval;
	}
	// $ANTLR end "input"


	public static class inputSub_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "inputSub"
	// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:74:1: inputSub : Variable ( WS )* ( ',' ( WS )* inputSub )? -> Variable ( inputSub )? ;
	public final while_astParser.inputSub_return inputSub() throws RecognitionException {
		while_astParser.inputSub_return retval = new while_astParser.inputSub_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Variable40=null;
		Token WS41=null;
		Token char_literal42=null;
		Token WS43=null;
		ParserRuleReturnScope inputSub44 =null;

		Object Variable40_tree=null;
		Object WS41_tree=null;
		Object char_literal42_tree=null;
		Object WS43_tree=null;
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_inputSub=new RewriteRuleSubtreeStream(adaptor,"rule inputSub");

		try {
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:75:5: ( Variable ( WS )* ( ',' ( WS )* inputSub )? -> Variable ( inputSub )? )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:75:7: Variable ( WS )* ( ',' ( WS )* inputSub )?
			{
			Variable40=(Token)match(input,Variable,FOLLOW_Variable_in_inputSub650);  
			stream_Variable.add(Variable40);

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:75:16: ( WS )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==WS) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:75:16: WS
					{
					WS41=(Token)match(input,WS,FOLLOW_WS_in_inputSub652);  
					stream_WS.add(WS41);

					}
					break;

				default :
					break loop23;
				}
			}

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:75:20: ( ',' ( WS )* inputSub )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==40) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:75:21: ',' ( WS )* inputSub
					{
					char_literal42=(Token)match(input,40,FOLLOW_40_in_inputSub656);  
					stream_40.add(char_literal42);

					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:75:25: ( WS )*
					loop24:
					while (true) {
						int alt24=2;
						int LA24_0 = input.LA(1);
						if ( (LA24_0==WS) ) {
							alt24=1;
						}

						switch (alt24) {
						case 1 :
							// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:75:25: WS
							{
							WS43=(Token)match(input,WS,FOLLOW_WS_in_inputSub658);  
							stream_WS.add(WS43);

							}
							break;

						default :
							break loop24;
						}
					}

					pushFollow(FOLLOW_inputSub_in_inputSub661);
					inputSub44=inputSub();
					state._fsp--;

					stream_inputSub.add(inputSub44.getTree());
					}
					break;

			}

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
			// 75:40: -> Variable ( inputSub )?
			{
				adaptor.addChild(root_0, stream_Variable.nextNode());
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:75:52: ( inputSub )?
				if ( stream_inputSub.hasNext() ) {
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
		return retval;
	}
	// $ANTLR end "inputSub"


	public static class output_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "output"
	// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:78:1: output : Variable ( WS )* ( ',' ( WS )* output )? -> ^( OUTPUT Variable ( output )? ) ;
	public final while_astParser.output_return output() throws RecognitionException {
		while_astParser.output_return retval = new while_astParser.output_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Variable45=null;
		Token WS46=null;
		Token char_literal47=null;
		Token WS48=null;
		ParserRuleReturnScope output49 =null;

		Object Variable45_tree=null;
		Object WS46_tree=null;
		Object char_literal47_tree=null;
		Object WS48_tree=null;
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");

		try {
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:79:5: ( Variable ( WS )* ( ',' ( WS )* output )? -> ^( OUTPUT Variable ( output )? ) )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:79:7: Variable ( WS )* ( ',' ( WS )* output )?
			{
			Variable45=(Token)match(input,Variable,FOLLOW_Variable_in_output689);  
			stream_Variable.add(Variable45);

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:79:16: ( WS )*
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==WS) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:79:16: WS
					{
					WS46=(Token)match(input,WS,FOLLOW_WS_in_output691);  
					stream_WS.add(WS46);

					}
					break;

				default :
					break loop26;
				}
			}

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:79:20: ( ',' ( WS )* output )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==40) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:79:21: ',' ( WS )* output
					{
					char_literal47=(Token)match(input,40,FOLLOW_40_in_output695);  
					stream_40.add(char_literal47);

					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:79:25: ( WS )*
					loop27:
					while (true) {
						int alt27=2;
						int LA27_0 = input.LA(1);
						if ( (LA27_0==WS) ) {
							alt27=1;
						}

						switch (alt27) {
						case 1 :
							// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:79:25: WS
							{
							WS48=(Token)match(input,WS,FOLLOW_WS_in_output697);  
							stream_WS.add(WS48);

							}
							break;

						default :
							break loop27;
						}
					}

					pushFollow(FOLLOW_output_in_output700);
					output49=output();
					state._fsp--;

					stream_output.add(output49.getTree());
					}
					break;

			}

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
			// 79:38: -> ^( OUTPUT Variable ( output )? )
			{
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:79:41: ^( OUTPUT Variable ( output )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OUTPUT, "OUTPUT"), root_1);
				adaptor.addChild(root_1, stream_Variable.nextNode());
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:79:59: ( output )?
				if ( stream_output.hasNext() ) {
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
		return retval;
	}
	// $ANTLR end "output"


	public static class commands_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "commands"
	// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:82:1: commands : command ( ( WS )* ';' ( WS )* ( getComment )? commands )? -> command ( commands )? ;
	public final while_astParser.commands_return commands() throws RecognitionException {
		while_astParser.commands_return retval = new while_astParser.commands_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WS51=null;
		Token char_literal52=null;
		Token WS53=null;
		ParserRuleReturnScope command50 =null;
		ParserRuleReturnScope getComment54 =null;
		ParserRuleReturnScope commands55 =null;

		Object WS51_tree=null;
		Object char_literal52_tree=null;
		Object WS53_tree=null;
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");
		RewriteRuleSubtreeStream stream_command=new RewriteRuleSubtreeStream(adaptor,"rule command");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:83:5: ( command ( ( WS )* ';' ( WS )* ( getComment )? commands )? -> command ( commands )? )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:83:7: command ( ( WS )* ';' ( WS )* ( getComment )? commands )?
			{
			pushFollow(FOLLOW_command_in_commands730);
			command50=command();
			state._fsp--;

			stream_command.add(command50.getTree());
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:83:15: ( ( WS )* ';' ( WS )* ( getComment )? commands )?
			int alt32=2;
			alt32 = dfa32.predict(input);
			switch (alt32) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:83:17: ( WS )* ';' ( WS )* ( getComment )? commands
					{
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:83:17: ( WS )*
					loop29:
					while (true) {
						int alt29=2;
						int LA29_0 = input.LA(1);
						if ( (LA29_0==WS) ) {
							alt29=1;
						}

						switch (alt29) {
						case 1 :
							// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:83:17: WS
							{
							WS51=(Token)match(input,WS,FOLLOW_WS_in_commands734);  
							stream_WS.add(WS51);

							}
							break;

						default :
							break loop29;
						}
					}

					char_literal52=(Token)match(input,43,FOLLOW_43_in_commands737);  
					stream_43.add(char_literal52);

					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:83:25: ( WS )*
					loop30:
					while (true) {
						int alt30=2;
						int LA30_0 = input.LA(1);
						if ( (LA30_0==WS) ) {
							alt30=1;
						}

						switch (alt30) {
						case 1 :
							// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:83:25: WS
							{
							WS53=(Token)match(input,WS,FOLLOW_WS_in_commands739);  
							stream_WS.add(WS53);

							}
							break;

						default :
							break loop30;
						}
					}

					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:83:29: ( getComment )?
					int alt31=2;
					int LA31_0 = input.LA(1);
					if ( (LA31_0==Comment) ) {
						alt31=1;
					}
					switch (alt31) {
						case 1 :
							// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:83:29: getComment
							{
							pushFollow(FOLLOW_getComment_in_commands742);
							getComment54=getComment();
							state._fsp--;

							stream_getComment.add(getComment54.getTree());
							}
							break;

					}

					pushFollow(FOLLOW_commands_in_commands745);
					commands55=commands();
					state._fsp--;

					stream_commands.add(commands55.getTree());
					}
					break;

			}

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
			// 83:52: -> command ( commands )?
			{
				adaptor.addChild(root_0, stream_command.nextTree());
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:83:63: ( commands )?
				if ( stream_commands.hasNext() ) {
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
		return retval;
	}
	// $ANTLR end "commands"


	public static class command_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "command"
	// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:86:1: command : ( 'nop' | decl | if_ | for_ | while_ | foreach_ );
	public final while_astParser.command_return command() throws RecognitionException {
		while_astParser.command_return retval = new while_astParser.command_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal56=null;
		ParserRuleReturnScope decl57 =null;
		ParserRuleReturnScope if_58 =null;
		ParserRuleReturnScope for_59 =null;
		ParserRuleReturnScope while_60 =null;
		ParserRuleReturnScope foreach_61 =null;

		Object string_literal56_tree=null;

		try {
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:87:5: ( 'nop' | decl | if_ | for_ | while_ | foreach_ )
			int alt33=6;
			switch ( input.LA(1) ) {
			case 57:
				{
				alt33=1;
				}
				break;
			case Variable:
				{
				alt33=2;
				}
				break;
			case 53:
				{
				alt33=3;
				}
				break;
			case 49:
				{
				alt33=4;
				}
				break;
			case 62:
				{
				alt33=5;
				}
				break;
			case 50:
				{
				alt33=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}
			switch (alt33) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:87:7: 'nop'
					{
					root_0 = (Object)adaptor.nil();


					string_literal56=(Token)match(input,57,FOLLOW_57_in_command772); 
					string_literal56_tree = (Object)adaptor.create(string_literal56);
					adaptor.addChild(root_0, string_literal56_tree);

					}
					break;
				case 2 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:87:15: decl
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_decl_in_command776);
					decl57=decl();
					state._fsp--;

					adaptor.addChild(root_0, decl57.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:87:22: if_
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_if__in_command780);
					if_58=if_();
					state._fsp--;

					adaptor.addChild(root_0, if_58.getTree());

					}
					break;
				case 4 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:87:28: for_
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_for__in_command784);
					for_59=for_();
					state._fsp--;

					adaptor.addChild(root_0, for_59.getTree());

					}
					break;
				case 5 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:87:35: while_
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_while__in_command788);
					while_60=while_();
					state._fsp--;

					adaptor.addChild(root_0, while_60.getTree());

					}
					break;
				case 6 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:87:44: foreach_
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_foreach__in_command792);
					foreach_61=foreach_();
					state._fsp--;

					adaptor.addChild(root_0, foreach_61.getTree());

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
	// $ANTLR end "command"


	public static class decl_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "decl"
	// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:89:1: decl : ( vars ( WS )* ':=' ( WS )* exprs ) ( WS )* ( getComment )? -> ^( VARDEF vars exprs ) ;
	public final while_astParser.decl_return decl() throws RecognitionException {
		while_astParser.decl_return retval = new while_astParser.decl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WS63=null;
		Token string_literal64=null;
		Token WS65=null;
		Token WS67=null;
		ParserRuleReturnScope vars62 =null;
		ParserRuleReturnScope exprs66 =null;
		ParserRuleReturnScope getComment68 =null;

		Object WS63_tree=null;
		Object string_literal64_tree=null;
		Object WS65_tree=null;
		Object WS67_tree=null;
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");
		RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");

		try {
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:90:5: ( ( vars ( WS )* ':=' ( WS )* exprs ) ( WS )* ( getComment )? -> ^( VARDEF vars exprs ) )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:90:7: ( vars ( WS )* ':=' ( WS )* exprs ) ( WS )* ( getComment )?
			{
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:90:7: ( vars ( WS )* ':=' ( WS )* exprs )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:90:8: vars ( WS )* ':=' ( WS )* exprs
			{
			pushFollow(FOLLOW_vars_in_decl806);
			vars62=vars();
			state._fsp--;

			stream_vars.add(vars62.getTree());
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:90:13: ( WS )*
			loop34:
			while (true) {
				int alt34=2;
				int LA34_0 = input.LA(1);
				if ( (LA34_0==WS) ) {
					alt34=1;
				}

				switch (alt34) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:90:13: WS
					{
					WS63=(Token)match(input,WS,FOLLOW_WS_in_decl808);  
					stream_WS.add(WS63);

					}
					break;

				default :
					break loop34;
				}
			}

			string_literal64=(Token)match(input,42,FOLLOW_42_in_decl811);  
			stream_42.add(string_literal64);

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:90:22: ( WS )*
			loop35:
			while (true) {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==WS) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:90:22: WS
					{
					WS65=(Token)match(input,WS,FOLLOW_WS_in_decl813);  
					stream_WS.add(WS65);

					}
					break;

				default :
					break loop35;
				}
			}

			pushFollow(FOLLOW_exprs_in_decl816);
			exprs66=exprs();
			state._fsp--;

			stream_exprs.add(exprs66.getTree());
			}

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:90:33: ( WS )*
			loop36:
			while (true) {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( (LA36_0==WS) ) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:90:33: WS
					{
					WS67=(Token)match(input,WS,FOLLOW_WS_in_decl819);  
					stream_WS.add(WS67);

					}
					break;

				default :
					break loop36;
				}
			}

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:90:37: ( getComment )?
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==Comment) ) {
				alt37=1;
			}
			switch (alt37) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:90:37: getComment
					{
					pushFollow(FOLLOW_getComment_in_decl822);
					getComment68=getComment();
					state._fsp--;

					stream_getComment.add(getComment68.getTree());
					}
					break;

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
			// 90:49: -> ^( VARDEF vars exprs )
			{
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:90:52: ^( VARDEF vars exprs )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARDEF, "VARDEF"), root_1);
				adaptor.addChild(root_1, stream_vars.nextTree());
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
		return retval;
	}
	// $ANTLR end "decl"


	public static class if__return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "if_"
	// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:93:1: if_ : ( 'if' ( WS )* expression ( WS )* then_ ( WS )* ( else_ ( WS )* )? 'fi' ( WS )* ( getComment )? ) -> ^( IF expression then_ ( else_ )? END ) ;
	public final while_astParser.if__return if_() throws RecognitionException {
		while_astParser.if__return retval = new while_astParser.if__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal69=null;
		Token WS70=null;
		Token WS72=null;
		Token WS74=null;
		Token WS76=null;
		Token string_literal77=null;
		Token WS78=null;
		ParserRuleReturnScope expression71 =null;
		ParserRuleReturnScope then_73 =null;
		ParserRuleReturnScope else_75 =null;
		ParserRuleReturnScope getComment79 =null;

		Object string_literal69_tree=null;
		Object WS70_tree=null;
		Object WS72_tree=null;
		Object WS74_tree=null;
		Object WS76_tree=null;
		Object string_literal77_tree=null;
		Object WS78_tree=null;
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleSubtreeStream stream_then_=new RewriteRuleSubtreeStream(adaptor,"rule then_");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_else_=new RewriteRuleSubtreeStream(adaptor,"rule else_");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");

		try {
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:94:5: ( ( 'if' ( WS )* expression ( WS )* then_ ( WS )* ( else_ ( WS )* )? 'fi' ( WS )* ( getComment )? ) -> ^( IF expression then_ ( else_ )? END ) )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:94:7: ( 'if' ( WS )* expression ( WS )* then_ ( WS )* ( else_ ( WS )* )? 'fi' ( WS )* ( getComment )? )
			{
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:94:7: ( 'if' ( WS )* expression ( WS )* then_ ( WS )* ( else_ ( WS )* )? 'fi' ( WS )* ( getComment )? )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:94:8: 'if' ( WS )* expression ( WS )* then_ ( WS )* ( else_ ( WS )* )? 'fi' ( WS )* ( getComment )?
			{
			string_literal69=(Token)match(input,53,FOLLOW_53_in_if_853);  
			stream_53.add(string_literal69);

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:94:13: ( WS )*
			loop38:
			while (true) {
				int alt38=2;
				int LA38_0 = input.LA(1);
				if ( (LA38_0==WS) ) {
					alt38=1;
				}

				switch (alt38) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:94:13: WS
					{
					WS70=(Token)match(input,WS,FOLLOW_WS_in_if_855);  
					stream_WS.add(WS70);

					}
					break;

				default :
					break loop38;
				}
			}

			pushFollow(FOLLOW_expression_in_if_858);
			expression71=expression();
			state._fsp--;

			stream_expression.add(expression71.getTree());
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:94:28: ( WS )*
			loop39:
			while (true) {
				int alt39=2;
				int LA39_0 = input.LA(1);
				if ( (LA39_0==WS) ) {
					alt39=1;
				}

				switch (alt39) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:94:28: WS
					{
					WS72=(Token)match(input,WS,FOLLOW_WS_in_if_860);  
					stream_WS.add(WS72);

					}
					break;

				default :
					break loop39;
				}
			}

			pushFollow(FOLLOW_then__in_if_863);
			then_73=then_();
			state._fsp--;

			stream_then_.add(then_73.getTree());
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:94:38: ( WS )*
			loop40:
			while (true) {
				int alt40=2;
				int LA40_0 = input.LA(1);
				if ( (LA40_0==WS) ) {
					alt40=1;
				}

				switch (alt40) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:94:38: WS
					{
					WS74=(Token)match(input,WS,FOLLOW_WS_in_if_865);  
					stream_WS.add(WS74);

					}
					break;

				default :
					break loop40;
				}
			}

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:94:42: ( else_ ( WS )* )?
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0==47) ) {
				alt42=1;
			}
			switch (alt42) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:94:43: else_ ( WS )*
					{
					pushFollow(FOLLOW_else__in_if_869);
					else_75=else_();
					state._fsp--;

					stream_else_.add(else_75.getTree());
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:94:49: ( WS )*
					loop41:
					while (true) {
						int alt41=2;
						int LA41_0 = input.LA(1);
						if ( (LA41_0==WS) ) {
							alt41=1;
						}

						switch (alt41) {
						case 1 :
							// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:94:49: WS
							{
							WS76=(Token)match(input,WS,FOLLOW_WS_in_if_871);  
							stream_WS.add(WS76);

							}
							break;

						default :
							break loop41;
						}
					}

					}
					break;

			}

			string_literal77=(Token)match(input,48,FOLLOW_48_in_if_876);  
			stream_48.add(string_literal77);

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:94:60: ( WS )*
			loop43:
			while (true) {
				int alt43=2;
				int LA43_0 = input.LA(1);
				if ( (LA43_0==WS) ) {
					alt43=1;
				}

				switch (alt43) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:94:60: WS
					{
					WS78=(Token)match(input,WS,FOLLOW_WS_in_if_878);  
					stream_WS.add(WS78);

					}
					break;

				default :
					break loop43;
				}
			}

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:94:64: ( getComment )?
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==Comment) ) {
				alt44=1;
			}
			switch (alt44) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:94:64: getComment
					{
					pushFollow(FOLLOW_getComment_in_if_881);
					getComment79=getComment();
					state._fsp--;

					stream_getComment.add(getComment79.getTree());
					}
					break;

			}

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
			// 94:77: -> ^( IF expression then_ ( else_ )? END )
			{
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:94:80: ^( IF expression then_ ( else_ )? END )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_1, stream_then_.nextTree());
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:94:102: ( else_ )?
				if ( stream_else_.hasNext() ) {
					adaptor.addChild(root_1, stream_else_.nextTree());
				}
				stream_else_.reset();

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
	// $ANTLR end "if_"


	public static class then__return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "then_"
	// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:97:1: then_ : 'then' ( WS )* ( getComment )? ( WS )* commands -> ^( THEN commands ) ;
	public final while_astParser.then__return then_() throws RecognitionException {
		while_astParser.then__return retval = new while_astParser.then__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal80=null;
		Token WS81=null;
		Token WS83=null;
		ParserRuleReturnScope getComment82 =null;
		ParserRuleReturnScope commands84 =null;

		Object string_literal80_tree=null;
		Object WS81_tree=null;
		Object WS83_tree=null;
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:97:7: ( 'then' ( WS )* ( getComment )? ( WS )* commands -> ^( THEN commands ) )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:97:9: 'then' ( WS )* ( getComment )? ( WS )* commands
			{
			string_literal80=(Token)match(input,60,FOLLOW_60_in_then_916);  
			stream_60.add(string_literal80);

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:97:16: ( WS )*
			loop45:
			while (true) {
				int alt45=2;
				int LA45_0 = input.LA(1);
				if ( (LA45_0==WS) ) {
					alt45=1;
				}

				switch (alt45) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:97:16: WS
					{
					WS81=(Token)match(input,WS,FOLLOW_WS_in_then_918);  
					stream_WS.add(WS81);

					}
					break;

				default :
					break loop45;
				}
			}

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:97:20: ( getComment )?
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==Comment) ) {
				alt46=1;
			}
			switch (alt46) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:97:20: getComment
					{
					pushFollow(FOLLOW_getComment_in_then_921);
					getComment82=getComment();
					state._fsp--;

					stream_getComment.add(getComment82.getTree());
					}
					break;

			}

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:97:32: ( WS )*
			loop47:
			while (true) {
				int alt47=2;
				int LA47_0 = input.LA(1);
				if ( (LA47_0==WS) ) {
					alt47=1;
				}

				switch (alt47) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:97:32: WS
					{
					WS83=(Token)match(input,WS,FOLLOW_WS_in_then_924);  
					stream_WS.add(WS83);

					}
					break;

				default :
					break loop47;
				}
			}

			pushFollow(FOLLOW_commands_in_then_927);
			commands84=commands();
			state._fsp--;

			stream_commands.add(commands84.getTree());
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
			// 97:45: -> ^( THEN commands )
			{
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:97:48: ^( THEN commands )
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
	// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:99:1: else_ : 'else' ( WS )* ( getComment )? ( WS )* commands -> ^( ELSE commands ) ;
	public final while_astParser.else__return else_() throws RecognitionException {
		while_astParser.else__return retval = new while_astParser.else__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal85=null;
		Token WS86=null;
		Token WS88=null;
		ParserRuleReturnScope getComment87 =null;
		ParserRuleReturnScope commands89 =null;

		Object string_literal85_tree=null;
		Object WS86_tree=null;
		Object WS88_tree=null;
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:99:7: ( 'else' ( WS )* ( getComment )? ( WS )* commands -> ^( ELSE commands ) )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:99:9: 'else' ( WS )* ( getComment )? ( WS )* commands
			{
			string_literal85=(Token)match(input,47,FOLLOW_47_in_else_944);  
			stream_47.add(string_literal85);

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:99:16: ( WS )*
			loop48:
			while (true) {
				int alt48=2;
				int LA48_0 = input.LA(1);
				if ( (LA48_0==WS) ) {
					alt48=1;
				}

				switch (alt48) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:99:16: WS
					{
					WS86=(Token)match(input,WS,FOLLOW_WS_in_else_946);  
					stream_WS.add(WS86);

					}
					break;

				default :
					break loop48;
				}
			}

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:99:20: ( getComment )?
			int alt49=2;
			int LA49_0 = input.LA(1);
			if ( (LA49_0==Comment) ) {
				alt49=1;
			}
			switch (alt49) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:99:20: getComment
					{
					pushFollow(FOLLOW_getComment_in_else_949);
					getComment87=getComment();
					state._fsp--;

					stream_getComment.add(getComment87.getTree());
					}
					break;

			}

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:99:32: ( WS )*
			loop50:
			while (true) {
				int alt50=2;
				int LA50_0 = input.LA(1);
				if ( (LA50_0==WS) ) {
					alt50=1;
				}

				switch (alt50) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:99:32: WS
					{
					WS88=(Token)match(input,WS,FOLLOW_WS_in_else_952);  
					stream_WS.add(WS88);

					}
					break;

				default :
					break loop50;
				}
			}

			pushFollow(FOLLOW_commands_in_else_955);
			commands89=commands();
			state._fsp--;

			stream_commands.add(commands89.getTree());
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
			// 99:45: -> ^( ELSE commands )
			{
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:99:48: ^( ELSE commands )
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


	public static class while__return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "while_"
	// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:101:1: while_ : ( 'while' ( WS )* expression ( WS )* ( getComment )? ( WS )* do_ ) -> ^( WHILE expression do_ END ) ;
	public final while_astParser.while__return while_() throws RecognitionException {
		while_astParser.while__return retval = new while_astParser.while__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal90=null;
		Token WS91=null;
		Token WS93=null;
		Token WS95=null;
		ParserRuleReturnScope expression92 =null;
		ParserRuleReturnScope getComment94 =null;
		ParserRuleReturnScope do_96 =null;

		Object string_literal90_tree=null;
		Object WS91_tree=null;
		Object WS93_tree=null;
		Object WS95_tree=null;
		RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_do_=new RewriteRuleSubtreeStream(adaptor,"rule do_");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");

		try {
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:102:5: ( ( 'while' ( WS )* expression ( WS )* ( getComment )? ( WS )* do_ ) -> ^( WHILE expression do_ END ) )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:102:7: ( 'while' ( WS )* expression ( WS )* ( getComment )? ( WS )* do_ )
			{
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:102:7: ( 'while' ( WS )* expression ( WS )* ( getComment )? ( WS )* do_ )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:102:8: 'while' ( WS )* expression ( WS )* ( getComment )? ( WS )* do_
			{
			string_literal90=(Token)match(input,62,FOLLOW_62_in_while_978);  
			stream_62.add(string_literal90);

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:102:16: ( WS )*
			loop51:
			while (true) {
				int alt51=2;
				int LA51_0 = input.LA(1);
				if ( (LA51_0==WS) ) {
					alt51=1;
				}

				switch (alt51) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:102:16: WS
					{
					WS91=(Token)match(input,WS,FOLLOW_WS_in_while_980);  
					stream_WS.add(WS91);

					}
					break;

				default :
					break loop51;
				}
			}

			pushFollow(FOLLOW_expression_in_while_983);
			expression92=expression();
			state._fsp--;

			stream_expression.add(expression92.getTree());
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:102:31: ( WS )*
			loop52:
			while (true) {
				int alt52=2;
				int LA52_0 = input.LA(1);
				if ( (LA52_0==WS) ) {
					alt52=1;
				}

				switch (alt52) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:102:31: WS
					{
					WS93=(Token)match(input,WS,FOLLOW_WS_in_while_985);  
					stream_WS.add(WS93);

					}
					break;

				default :
					break loop52;
				}
			}

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:102:35: ( getComment )?
			int alt53=2;
			int LA53_0 = input.LA(1);
			if ( (LA53_0==Comment) ) {
				alt53=1;
			}
			switch (alt53) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:102:35: getComment
					{
					pushFollow(FOLLOW_getComment_in_while_988);
					getComment94=getComment();
					state._fsp--;

					stream_getComment.add(getComment94.getTree());
					}
					break;

			}

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:102:47: ( WS )*
			loop54:
			while (true) {
				int alt54=2;
				int LA54_0 = input.LA(1);
				if ( (LA54_0==WS) ) {
					alt54=1;
				}

				switch (alt54) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:102:47: WS
					{
					WS95=(Token)match(input,WS,FOLLOW_WS_in_while_991);  
					stream_WS.add(WS95);

					}
					break;

				default :
					break loop54;
				}
			}

			pushFollow(FOLLOW_do__in_while_994);
			do_96=do_();
			state._fsp--;

			stream_do_.add(do_96.getTree());
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
			// 102:56: -> ^( WHILE expression do_ END )
			{
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:102:59: ^( WHILE expression do_ END )
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
	// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:105:1: do_ : 'do' ( WS )* ( getComment )? ( WS )* commands ( WS )* 'od' ( WS )* ( getComment )? -> ^( DO commands ) ;
	public final while_astParser.do__return do_() throws RecognitionException {
		while_astParser.do__return retval = new while_astParser.do__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal97=null;
		Token WS98=null;
		Token WS100=null;
		Token WS102=null;
		Token string_literal103=null;
		Token WS104=null;
		ParserRuleReturnScope getComment99 =null;
		ParserRuleReturnScope commands101 =null;
		ParserRuleReturnScope getComment105 =null;

		Object string_literal97_tree=null;
		Object WS98_tree=null;
		Object WS100_tree=null;
		Object WS102_tree=null;
		Object string_literal103_tree=null;
		Object WS104_tree=null;
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:105:6: ( 'do' ( WS )* ( getComment )? ( WS )* commands ( WS )* 'od' ( WS )* ( getComment )? -> ^( DO commands ) )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:105:8: 'do' ( WS )* ( getComment )? ( WS )* commands ( WS )* 'od' ( WS )* ( getComment )?
			{
			string_literal97=(Token)match(input,46,FOLLOW_46_in_do_1026);  
			stream_46.add(string_literal97);

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:105:13: ( WS )*
			loop55:
			while (true) {
				int alt55=2;
				int LA55_0 = input.LA(1);
				if ( (LA55_0==WS) ) {
					alt55=1;
				}

				switch (alt55) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:105:13: WS
					{
					WS98=(Token)match(input,WS,FOLLOW_WS_in_do_1028);  
					stream_WS.add(WS98);

					}
					break;

				default :
					break loop55;
				}
			}

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:105:17: ( getComment )?
			int alt56=2;
			int LA56_0 = input.LA(1);
			if ( (LA56_0==Comment) ) {
				alt56=1;
			}
			switch (alt56) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:105:17: getComment
					{
					pushFollow(FOLLOW_getComment_in_do_1031);
					getComment99=getComment();
					state._fsp--;

					stream_getComment.add(getComment99.getTree());
					}
					break;

			}

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:105:29: ( WS )*
			loop57:
			while (true) {
				int alt57=2;
				int LA57_0 = input.LA(1);
				if ( (LA57_0==WS) ) {
					alt57=1;
				}

				switch (alt57) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:105:29: WS
					{
					WS100=(Token)match(input,WS,FOLLOW_WS_in_do_1034);  
					stream_WS.add(WS100);

					}
					break;

				default :
					break loop57;
				}
			}

			pushFollow(FOLLOW_commands_in_do_1037);
			commands101=commands();
			state._fsp--;

			stream_commands.add(commands101.getTree());
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:105:42: ( WS )*
			loop58:
			while (true) {
				int alt58=2;
				int LA58_0 = input.LA(1);
				if ( (LA58_0==WS) ) {
					alt58=1;
				}

				switch (alt58) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:105:42: WS
					{
					WS102=(Token)match(input,WS,FOLLOW_WS_in_do_1039);  
					stream_WS.add(WS102);

					}
					break;

				default :
					break loop58;
				}
			}

			string_literal103=(Token)match(input,58,FOLLOW_58_in_do_1042);  
			stream_58.add(string_literal103);

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:105:51: ( WS )*
			loop59:
			while (true) {
				int alt59=2;
				int LA59_0 = input.LA(1);
				if ( (LA59_0==WS) ) {
					alt59=1;
				}

				switch (alt59) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:105:51: WS
					{
					WS104=(Token)match(input,WS,FOLLOW_WS_in_do_1044);  
					stream_WS.add(WS104);

					}
					break;

				default :
					break loop59;
				}
			}

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:105:55: ( getComment )?
			int alt60=2;
			int LA60_0 = input.LA(1);
			if ( (LA60_0==Comment) ) {
				alt60=1;
			}
			switch (alt60) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:105:55: getComment
					{
					pushFollow(FOLLOW_getComment_in_do_1047);
					getComment105=getComment();
					state._fsp--;

					stream_getComment.add(getComment105.getTree());
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
			// 105:67: -> ^( DO commands )
			{
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:105:70: ^( DO commands )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DO, "DO"), root_1);
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
	// $ANTLR end "do_"


	public static class for__return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "for_"
	// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:107:1: for_ : ( 'for' ( WS )* expression ( WS )* ( getComment )? ( WS )* do_ ) -> ^( FOR expression do_ END ) ;
	public final while_astParser.for__return for_() throws RecognitionException {
		while_astParser.for__return retval = new while_astParser.for__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal106=null;
		Token WS107=null;
		Token WS109=null;
		Token WS111=null;
		ParserRuleReturnScope expression108 =null;
		ParserRuleReturnScope getComment110 =null;
		ParserRuleReturnScope do_112 =null;

		Object string_literal106_tree=null;
		Object WS107_tree=null;
		Object WS109_tree=null;
		Object WS111_tree=null;
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_do_=new RewriteRuleSubtreeStream(adaptor,"rule do_");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");

		try {
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:108:5: ( ( 'for' ( WS )* expression ( WS )* ( getComment )? ( WS )* do_ ) -> ^( FOR expression do_ END ) )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:108:7: ( 'for' ( WS )* expression ( WS )* ( getComment )? ( WS )* do_ )
			{
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:108:7: ( 'for' ( WS )* expression ( WS )* ( getComment )? ( WS )* do_ )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:108:8: 'for' ( WS )* expression ( WS )* ( getComment )? ( WS )* do_
			{
			string_literal106=(Token)match(input,49,FOLLOW_49_in_for_1069);  
			stream_49.add(string_literal106);

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:108:14: ( WS )*
			loop61:
			while (true) {
				int alt61=2;
				int LA61_0 = input.LA(1);
				if ( (LA61_0==WS) ) {
					alt61=1;
				}

				switch (alt61) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:108:14: WS
					{
					WS107=(Token)match(input,WS,FOLLOW_WS_in_for_1071);  
					stream_WS.add(WS107);

					}
					break;

				default :
					break loop61;
				}
			}

			pushFollow(FOLLOW_expression_in_for_1074);
			expression108=expression();
			state._fsp--;

			stream_expression.add(expression108.getTree());
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:108:29: ( WS )*
			loop62:
			while (true) {
				int alt62=2;
				int LA62_0 = input.LA(1);
				if ( (LA62_0==WS) ) {
					alt62=1;
				}

				switch (alt62) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:108:29: WS
					{
					WS109=(Token)match(input,WS,FOLLOW_WS_in_for_1076);  
					stream_WS.add(WS109);

					}
					break;

				default :
					break loop62;
				}
			}

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:108:33: ( getComment )?
			int alt63=2;
			int LA63_0 = input.LA(1);
			if ( (LA63_0==Comment) ) {
				alt63=1;
			}
			switch (alt63) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:108:33: getComment
					{
					pushFollow(FOLLOW_getComment_in_for_1079);
					getComment110=getComment();
					state._fsp--;

					stream_getComment.add(getComment110.getTree());
					}
					break;

			}

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:108:45: ( WS )*
			loop64:
			while (true) {
				int alt64=2;
				int LA64_0 = input.LA(1);
				if ( (LA64_0==WS) ) {
					alt64=1;
				}

				switch (alt64) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:108:45: WS
					{
					WS111=(Token)match(input,WS,FOLLOW_WS_in_for_1082);  
					stream_WS.add(WS111);

					}
					break;

				default :
					break loop64;
				}
			}

			pushFollow(FOLLOW_do__in_for_1085);
			do_112=do_();
			state._fsp--;

			stream_do_.add(do_112.getTree());
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
			// 108:54: -> ^( FOR expression do_ END )
			{
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:108:57: ^( FOR expression do_ END )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOR, "FOR"), root_1);
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
	// $ANTLR end "for_"


	public static class foreach__return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "foreach_"
	// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:111:1: foreach_ : ( 'foreach' ( WS )* Variable ( WS )* 'in' ( WS )* expression ( WS )* ( getComment )? ( WS )* do_ ) -> ^( FOREACH ^( IN Variable expression ) do_ END ) ;
	public final while_astParser.foreach__return foreach_() throws RecognitionException {
		while_astParser.foreach__return retval = new while_astParser.foreach__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal113=null;
		Token WS114=null;
		Token Variable115=null;
		Token WS116=null;
		Token string_literal117=null;
		Token WS118=null;
		Token WS120=null;
		Token WS122=null;
		ParserRuleReturnScope expression119 =null;
		ParserRuleReturnScope getComment121 =null;
		ParserRuleReturnScope do_123 =null;

		Object string_literal113_tree=null;
		Object WS114_tree=null;
		Object Variable115_tree=null;
		Object WS116_tree=null;
		Object string_literal117_tree=null;
		Object WS118_tree=null;
		Object WS120_tree=null;
		Object WS122_tree=null;
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_do_=new RewriteRuleSubtreeStream(adaptor,"rule do_");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");

		try {
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:112:5: ( ( 'foreach' ( WS )* Variable ( WS )* 'in' ( WS )* expression ( WS )* ( getComment )? ( WS )* do_ ) -> ^( FOREACH ^( IN Variable expression ) do_ END ) )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:112:7: ( 'foreach' ( WS )* Variable ( WS )* 'in' ( WS )* expression ( WS )* ( getComment )? ( WS )* do_ )
			{
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:112:7: ( 'foreach' ( WS )* Variable ( WS )* 'in' ( WS )* expression ( WS )* ( getComment )? ( WS )* do_ )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:112:8: 'foreach' ( WS )* Variable ( WS )* 'in' ( WS )* expression ( WS )* ( getComment )? ( WS )* do_
			{
			string_literal113=(Token)match(input,50,FOLLOW_50_in_foreach_1116);  
			stream_50.add(string_literal113);

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:112:18: ( WS )*
			loop65:
			while (true) {
				int alt65=2;
				int LA65_0 = input.LA(1);
				if ( (LA65_0==WS) ) {
					alt65=1;
				}

				switch (alt65) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:112:18: WS
					{
					WS114=(Token)match(input,WS,FOLLOW_WS_in_foreach_1118);  
					stream_WS.add(WS114);

					}
					break;

				default :
					break loop65;
				}
			}

			Variable115=(Token)match(input,Variable,FOLLOW_Variable_in_foreach_1121);  
			stream_Variable.add(Variable115);

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:112:31: ( WS )*
			loop66:
			while (true) {
				int alt66=2;
				int LA66_0 = input.LA(1);
				if ( (LA66_0==WS) ) {
					alt66=1;
				}

				switch (alt66) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:112:31: WS
					{
					WS116=(Token)match(input,WS,FOLLOW_WS_in_foreach_1123);  
					stream_WS.add(WS116);

					}
					break;

				default :
					break loop66;
				}
			}

			string_literal117=(Token)match(input,54,FOLLOW_54_in_foreach_1126);  
			stream_54.add(string_literal117);

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:112:40: ( WS )*
			loop67:
			while (true) {
				int alt67=2;
				int LA67_0 = input.LA(1);
				if ( (LA67_0==WS) ) {
					alt67=1;
				}

				switch (alt67) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:112:40: WS
					{
					WS118=(Token)match(input,WS,FOLLOW_WS_in_foreach_1128);  
					stream_WS.add(WS118);

					}
					break;

				default :
					break loop67;
				}
			}

			pushFollow(FOLLOW_expression_in_foreach_1131);
			expression119=expression();
			state._fsp--;

			stream_expression.add(expression119.getTree());
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:112:55: ( WS )*
			loop68:
			while (true) {
				int alt68=2;
				int LA68_0 = input.LA(1);
				if ( (LA68_0==WS) ) {
					alt68=1;
				}

				switch (alt68) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:112:55: WS
					{
					WS120=(Token)match(input,WS,FOLLOW_WS_in_foreach_1133);  
					stream_WS.add(WS120);

					}
					break;

				default :
					break loop68;
				}
			}

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:112:59: ( getComment )?
			int alt69=2;
			int LA69_0 = input.LA(1);
			if ( (LA69_0==Comment) ) {
				alt69=1;
			}
			switch (alt69) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:112:59: getComment
					{
					pushFollow(FOLLOW_getComment_in_foreach_1136);
					getComment121=getComment();
					state._fsp--;

					stream_getComment.add(getComment121.getTree());
					}
					break;

			}

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:112:71: ( WS )*
			loop70:
			while (true) {
				int alt70=2;
				int LA70_0 = input.LA(1);
				if ( (LA70_0==WS) ) {
					alt70=1;
				}

				switch (alt70) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:112:71: WS
					{
					WS122=(Token)match(input,WS,FOLLOW_WS_in_foreach_1139);  
					stream_WS.add(WS122);

					}
					break;

				default :
					break loop70;
				}
			}

			pushFollow(FOLLOW_do__in_foreach_1142);
			do_123=do_();
			state._fsp--;

			stream_do_.add(do_123.getTree());
			}

			// AST REWRITE
			// elements: Variable, expression, do_
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 112:80: -> ^( FOREACH ^( IN Variable expression ) do_ END )
			{
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:112:83: ^( FOREACH ^( IN Variable expression ) do_ END )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOREACH, "FOREACH"), root_1);
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:112:93: ^( IN Variable expression )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(IN, "IN"), root_2);
				adaptor.addChild(root_2, stream_Variable.nextNode());
				adaptor.addChild(root_2, stream_expression.nextTree());
				adaptor.addChild(root_1, root_2);
				}

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
	// $ANTLR end "foreach_"


	public static class vars_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "vars"
	// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:115:1: vars : Variable ( WS )* ( ',' ( WS )* vars )? -> Variable ( vars )* ;
	public final while_astParser.vars_return vars() throws RecognitionException {
		while_astParser.vars_return retval = new while_astParser.vars_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Variable124=null;
		Token WS125=null;
		Token char_literal126=null;
		Token WS127=null;
		ParserRuleReturnScope vars128 =null;

		Object Variable124_tree=null;
		Object WS125_tree=null;
		Object char_literal126_tree=null;
		Object WS127_tree=null;
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");

		try {
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:116:5: ( Variable ( WS )* ( ',' ( WS )* vars )? -> Variable ( vars )* )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:116:7: Variable ( WS )* ( ',' ( WS )* vars )?
			{
			Variable124=(Token)match(input,Variable,FOLLOW_Variable_in_vars1178);  
			stream_Variable.add(Variable124);

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:116:16: ( WS )*
			loop71:
			while (true) {
				int alt71=2;
				int LA71_0 = input.LA(1);
				if ( (LA71_0==WS) ) {
					alt71=1;
				}

				switch (alt71) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:116:16: WS
					{
					WS125=(Token)match(input,WS,FOLLOW_WS_in_vars1180);  
					stream_WS.add(WS125);

					}
					break;

				default :
					break loop71;
				}
			}

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:116:20: ( ',' ( WS )* vars )?
			int alt73=2;
			int LA73_0 = input.LA(1);
			if ( (LA73_0==40) ) {
				alt73=1;
			}
			switch (alt73) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:116:21: ',' ( WS )* vars
					{
					char_literal126=(Token)match(input,40,FOLLOW_40_in_vars1184);  
					stream_40.add(char_literal126);

					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:116:24: ( WS )*
					loop72:
					while (true) {
						int alt72=2;
						int LA72_0 = input.LA(1);
						if ( (LA72_0==WS) ) {
							alt72=1;
						}

						switch (alt72) {
						case 1 :
							// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:116:24: WS
							{
							WS127=(Token)match(input,WS,FOLLOW_WS_in_vars1185);  
							stream_WS.add(WS127);

							}
							break;

						default :
							break loop72;
						}
					}

					pushFollow(FOLLOW_vars_in_vars1188);
					vars128=vars();
					state._fsp--;

					stream_vars.add(vars128.getTree());
					}
					break;

			}

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
			// 116:35: -> Variable ( vars )*
			{
				adaptor.addChild(root_0, stream_Variable.nextNode());
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:116:47: ( vars )*
				while ( stream_vars.hasNext() ) {
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
		return retval;
	}
	// $ANTLR end "vars"


	public static class exprs_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprs"
	// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:119:1: exprs : expression ( WS )* ( ',' ( WS )* exprs )? -> expression ( exprs )* ;
	public final while_astParser.exprs_return exprs() throws RecognitionException {
		while_astParser.exprs_return retval = new while_astParser.exprs_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WS130=null;
		Token char_literal131=null;
		Token WS132=null;
		ParserRuleReturnScope expression129 =null;
		ParserRuleReturnScope exprs133 =null;

		Object WS130_tree=null;
		Object char_literal131_tree=null;
		Object WS132_tree=null;
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");

		try {
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:120:5: ( expression ( WS )* ( ',' ( WS )* exprs )? -> expression ( exprs )* )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:120:7: expression ( WS )* ( ',' ( WS )* exprs )?
			{
			pushFollow(FOLLOW_expression_in_exprs1214);
			expression129=expression();
			state._fsp--;

			stream_expression.add(expression129.getTree());
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:120:18: ( WS )*
			loop74:
			while (true) {
				int alt74=2;
				int LA74_0 = input.LA(1);
				if ( (LA74_0==WS) ) {
					alt74=1;
				}

				switch (alt74) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:120:18: WS
					{
					WS130=(Token)match(input,WS,FOLLOW_WS_in_exprs1216);  
					stream_WS.add(WS130);

					}
					break;

				default :
					break loop74;
				}
			}

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:120:22: ( ',' ( WS )* exprs )?
			int alt76=2;
			int LA76_0 = input.LA(1);
			if ( (LA76_0==40) ) {
				alt76=1;
			}
			switch (alt76) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:120:23: ',' ( WS )* exprs
					{
					char_literal131=(Token)match(input,40,FOLLOW_40_in_exprs1220);  
					stream_40.add(char_literal131);

					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:120:26: ( WS )*
					loop75:
					while (true) {
						int alt75=2;
						int LA75_0 = input.LA(1);
						if ( (LA75_0==WS) ) {
							alt75=1;
						}

						switch (alt75) {
						case 1 :
							// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:120:26: WS
							{
							WS132=(Token)match(input,WS,FOLLOW_WS_in_exprs1221);  
							stream_WS.add(WS132);

							}
							break;

						default :
							break loop75;
						}
					}

					pushFollow(FOLLOW_exprs_in_exprs1224);
					exprs133=exprs();
					state._fsp--;

					stream_exprs.add(exprs133.getTree());
					}
					break;

			}

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
			// 120:38: -> expression ( exprs )*
			{
				adaptor.addChild(root_0, stream_expression.nextTree());
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:120:52: ( exprs )*
				while ( stream_exprs.hasNext() ) {
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
		return retval;
	}
	// $ANTLR end "exprs"


	public static class exprBase_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exprBase"
	// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:123:1: exprBase : ( nil_ | variable | symbol | cons | list | hd | tl | symbolExpr );
	public final while_astParser.exprBase_return exprBase() throws RecognitionException {
		while_astParser.exprBase_return retval = new while_astParser.exprBase_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope nil_134 =null;
		ParserRuleReturnScope variable135 =null;
		ParserRuleReturnScope symbol136 =null;
		ParserRuleReturnScope cons137 =null;
		ParserRuleReturnScope list138 =null;
		ParserRuleReturnScope hd139 =null;
		ParserRuleReturnScope tl140 =null;
		ParserRuleReturnScope symbolExpr141 =null;


		try {
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:123:12: ( nil_ | variable | symbol | cons | list | hd | tl | symbolExpr )
			int alt77=8;
			alt77 = dfa77.predict(input);
			switch (alt77) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:123:15: nil_
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_nil__in_exprBase1249);
					nil_134=nil_();
					state._fsp--;

					adaptor.addChild(root_0, nil_134.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:124:7: variable
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_variable_in_exprBase1257);
					variable135=variable();
					state._fsp--;

					adaptor.addChild(root_0, variable135.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:124:18: symbol
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_symbol_in_exprBase1261);
					symbol136=symbol();
					state._fsp--;

					adaptor.addChild(root_0, symbol136.getTree());

					}
					break;
				case 4 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:125:7: cons
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_cons_in_exprBase1269);
					cons137=cons();
					state._fsp--;

					adaptor.addChild(root_0, cons137.getTree());

					}
					break;
				case 5 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:125:14: list
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_list_in_exprBase1273);
					list138=list();
					state._fsp--;

					adaptor.addChild(root_0, list138.getTree());

					}
					break;
				case 6 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:126:7: hd
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_hd_in_exprBase1281);
					hd139=hd();
					state._fsp--;

					adaptor.addChild(root_0, hd139.getTree());

					}
					break;
				case 7 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:126:12: tl
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_tl_in_exprBase1285);
					tl140=tl();
					state._fsp--;

					adaptor.addChild(root_0, tl140.getTree());

					}
					break;
				case 8 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:127:7: symbolExpr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_symbolExpr_in_exprBase1293);
					symbolExpr141=symbolExpr();
					state._fsp--;

					adaptor.addChild(root_0, symbolExpr141.getTree());

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
	// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:130:1: nil_ : ( 'nil' ) -> 'nil' ;
	public final while_astParser.nil__return nil_() throws RecognitionException {
		while_astParser.nil__return retval = new while_astParser.nil__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal142=null;

		Object string_literal142_tree=null;
		RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");

		try {
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:130:6: ( ( 'nil' ) -> 'nil' )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:130:8: ( 'nil' )
			{
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:130:8: ( 'nil' )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:130:9: 'nil'
			{
			string_literal142=(Token)match(input,56,FOLLOW_56_in_nil_1311);  
			stream_56.add(string_literal142);

			}

			// AST REWRITE
			// elements: 56
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 130:16: -> 'nil'
			{
				adaptor.addChild(root_0, stream_56.nextNode());
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


	public static class cons_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "cons"
	// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:132:1: cons : '(' ( WS )* 'cons' ( WS )* ( lExpr )? ( WS )* ')' -> ^( CONS ( lExpr )? ) ;
	public final while_astParser.cons_return cons() throws RecognitionException {
		while_astParser.cons_return retval = new while_astParser.cons_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal143=null;
		Token WS144=null;
		Token string_literal145=null;
		Token WS146=null;
		Token WS148=null;
		Token char_literal149=null;
		ParserRuleReturnScope lExpr147 =null;

		Object char_literal143_tree=null;
		Object WS144_tree=null;
		Object string_literal145_tree=null;
		Object WS146_tree=null;
		Object WS148_tree=null;
		Object char_literal149_tree=null;
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_lExpr=new RewriteRuleSubtreeStream(adaptor,"rule lExpr");

		try {
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:132:6: ( '(' ( WS )* 'cons' ( WS )* ( lExpr )? ( WS )* ')' -> ^( CONS ( lExpr )? ) )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:132:8: '(' ( WS )* 'cons' ( WS )* ( lExpr )? ( WS )* ')'
			{
			char_literal143=(Token)match(input,38,FOLLOW_38_in_cons1325);  
			stream_38.add(char_literal143);

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:132:12: ( WS )*
			loop78:
			while (true) {
				int alt78=2;
				int LA78_0 = input.LA(1);
				if ( (LA78_0==WS) ) {
					alt78=1;
				}

				switch (alt78) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:132:12: WS
					{
					WS144=(Token)match(input,WS,FOLLOW_WS_in_cons1327);  
					stream_WS.add(WS144);

					}
					break;

				default :
					break loop78;
				}
			}

			string_literal145=(Token)match(input,45,FOLLOW_45_in_cons1330);  
			stream_45.add(string_literal145);

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:132:23: ( WS )*
			loop79:
			while (true) {
				int alt79=2;
				int LA79_0 = input.LA(1);
				if ( (LA79_0==WS) ) {
					alt79=1;
				}

				switch (alt79) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:132:23: WS
					{
					WS146=(Token)match(input,WS,FOLLOW_WS_in_cons1332);  
					stream_WS.add(WS146);

					}
					break;

				default :
					break loop79;
				}
			}

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:132:27: ( lExpr )?
			int alt80=2;
			int LA80_0 = input.LA(1);
			if ( (LA80_0==Symbol||LA80_0==Variable||LA80_0==38||LA80_0==56) ) {
				alt80=1;
			}
			switch (alt80) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:132:27: lExpr
					{
					pushFollow(FOLLOW_lExpr_in_cons1335);
					lExpr147=lExpr();
					state._fsp--;

					stream_lExpr.add(lExpr147.getTree());
					}
					break;

			}

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:132:34: ( WS )*
			loop81:
			while (true) {
				int alt81=2;
				int LA81_0 = input.LA(1);
				if ( (LA81_0==WS) ) {
					alt81=1;
				}

				switch (alt81) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:132:34: WS
					{
					WS148=(Token)match(input,WS,FOLLOW_WS_in_cons1338);  
					stream_WS.add(WS148);

					}
					break;

				default :
					break loop81;
				}
			}

			char_literal149=(Token)match(input,39,FOLLOW_39_in_cons1341);  
			stream_39.add(char_literal149);

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
			// 132:42: -> ^( CONS ( lExpr )? )
			{
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:132:45: ^( CONS ( lExpr )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONS, "CONS"), root_1);
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:132:52: ( lExpr )?
				if ( stream_lExpr.hasNext() ) {
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
		return retval;
	}
	// $ANTLR end "cons"


	public static class list_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "list"
	// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:133:1: list : '(' ( WS )* 'list' ( WS )* ( lExpr )? ( WS )* ')' -> ^( LIST lExpr ) ;
	public final while_astParser.list_return list() throws RecognitionException {
		while_astParser.list_return retval = new while_astParser.list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal150=null;
		Token WS151=null;
		Token string_literal152=null;
		Token WS153=null;
		Token WS155=null;
		Token char_literal156=null;
		ParserRuleReturnScope lExpr154 =null;

		Object char_literal150_tree=null;
		Object WS151_tree=null;
		Object string_literal152_tree=null;
		Object WS153_tree=null;
		Object WS155_tree=null;
		Object char_literal156_tree=null;
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_lExpr=new RewriteRuleSubtreeStream(adaptor,"rule lExpr");

		try {
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:133:6: ( '(' ( WS )* 'list' ( WS )* ( lExpr )? ( WS )* ')' -> ^( LIST lExpr ) )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:133:8: '(' ( WS )* 'list' ( WS )* ( lExpr )? ( WS )* ')'
			{
			char_literal150=(Token)match(input,38,FOLLOW_38_in_list1358);  
			stream_38.add(char_literal150);

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:133:11: ( WS )*
			loop82:
			while (true) {
				int alt82=2;
				int LA82_0 = input.LA(1);
				if ( (LA82_0==WS) ) {
					alt82=1;
				}

				switch (alt82) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:133:11: WS
					{
					WS151=(Token)match(input,WS,FOLLOW_WS_in_list1359);  
					stream_WS.add(WS151);

					}
					break;

				default :
					break loop82;
				}
			}

			string_literal152=(Token)match(input,55,FOLLOW_55_in_list1362);  
			stream_55.add(string_literal152);

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:133:22: ( WS )*
			loop83:
			while (true) {
				int alt83=2;
				int LA83_0 = input.LA(1);
				if ( (LA83_0==WS) ) {
					alt83=1;
				}

				switch (alt83) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:133:22: WS
					{
					WS153=(Token)match(input,WS,FOLLOW_WS_in_list1364);  
					stream_WS.add(WS153);

					}
					break;

				default :
					break loop83;
				}
			}

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:133:26: ( lExpr )?
			int alt84=2;
			int LA84_0 = input.LA(1);
			if ( (LA84_0==Symbol||LA84_0==Variable||LA84_0==38||LA84_0==56) ) {
				alt84=1;
			}
			switch (alt84) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:133:26: lExpr
					{
					pushFollow(FOLLOW_lExpr_in_list1367);
					lExpr154=lExpr();
					state._fsp--;

					stream_lExpr.add(lExpr154.getTree());
					}
					break;

			}

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:133:33: ( WS )*
			loop85:
			while (true) {
				int alt85=2;
				int LA85_0 = input.LA(1);
				if ( (LA85_0==WS) ) {
					alt85=1;
				}

				switch (alt85) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:133:33: WS
					{
					WS155=(Token)match(input,WS,FOLLOW_WS_in_list1370);  
					stream_WS.add(WS155);

					}
					break;

				default :
					break loop85;
				}
			}

			char_literal156=(Token)match(input,39,FOLLOW_39_in_list1373);  
			stream_39.add(char_literal156);

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
			// 133:41: -> ^( LIST lExpr )
			{
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:133:44: ^( LIST lExpr )
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
	// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:135:1: hd : '(' ( WS )* 'hd' ( WS )* exprBase ( WS )* ')' -> ^( HD exprBase ) ;
	public final while_astParser.hd_return hd() throws RecognitionException {
		while_astParser.hd_return retval = new while_astParser.hd_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal157=null;
		Token WS158=null;
		Token string_literal159=null;
		Token WS160=null;
		Token WS162=null;
		Token char_literal163=null;
		ParserRuleReturnScope exprBase161 =null;

		Object char_literal157_tree=null;
		Object WS158_tree=null;
		Object string_literal159_tree=null;
		Object WS160_tree=null;
		Object WS162_tree=null;
		Object char_literal163_tree=null;
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
		RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");

		try {
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:135:4: ( '(' ( WS )* 'hd' ( WS )* exprBase ( WS )* ')' -> ^( HD exprBase ) )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:135:6: '(' ( WS )* 'hd' ( WS )* exprBase ( WS )* ')'
			{
			char_literal157=(Token)match(input,38,FOLLOW_38_in_hd1389);  
			stream_38.add(char_literal157);

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:135:9: ( WS )*
			loop86:
			while (true) {
				int alt86=2;
				int LA86_0 = input.LA(1);
				if ( (LA86_0==WS) ) {
					alt86=1;
				}

				switch (alt86) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:135:9: WS
					{
					WS158=(Token)match(input,WS,FOLLOW_WS_in_hd1390);  
					stream_WS.add(WS158);

					}
					break;

				default :
					break loop86;
				}
			}

			string_literal159=(Token)match(input,52,FOLLOW_52_in_hd1393);  
			stream_52.add(string_literal159);

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:135:18: ( WS )*
			loop87:
			while (true) {
				int alt87=2;
				int LA87_0 = input.LA(1);
				if ( (LA87_0==WS) ) {
					alt87=1;
				}

				switch (alt87) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:135:18: WS
					{
					WS160=(Token)match(input,WS,FOLLOW_WS_in_hd1395);  
					stream_WS.add(WS160);

					}
					break;

				default :
					break loop87;
				}
			}

			pushFollow(FOLLOW_exprBase_in_hd1398);
			exprBase161=exprBase();
			state._fsp--;

			stream_exprBase.add(exprBase161.getTree());
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:135:31: ( WS )*
			loop88:
			while (true) {
				int alt88=2;
				int LA88_0 = input.LA(1);
				if ( (LA88_0==WS) ) {
					alt88=1;
				}

				switch (alt88) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:135:31: WS
					{
					WS162=(Token)match(input,WS,FOLLOW_WS_in_hd1400);  
					stream_WS.add(WS162);

					}
					break;

				default :
					break loop88;
				}
			}

			char_literal163=(Token)match(input,39,FOLLOW_39_in_hd1402);  
			stream_39.add(char_literal163);

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
			// 135:38: -> ^( HD exprBase )
			{
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:135:41: ^( HD exprBase )
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
	// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:137:1: tl : '(' ( WS )* 'tl' ( WS )* exprBase ( WS )* ')' -> ^( TL exprBase ) ;
	public final while_astParser.tl_return tl() throws RecognitionException {
		while_astParser.tl_return retval = new while_astParser.tl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal164=null;
		Token WS165=null;
		Token string_literal166=null;
		Token WS167=null;
		Token WS169=null;
		Token char_literal170=null;
		ParserRuleReturnScope exprBase168 =null;

		Object char_literal164_tree=null;
		Object WS165_tree=null;
		Object string_literal166_tree=null;
		Object WS167_tree=null;
		Object WS169_tree=null;
		Object char_literal170_tree=null;
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");

		try {
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:137:4: ( '(' ( WS )* 'tl' ( WS )* exprBase ( WS )* ')' -> ^( TL exprBase ) )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:137:6: '(' ( WS )* 'tl' ( WS )* exprBase ( WS )* ')'
			{
			char_literal164=(Token)match(input,38,FOLLOW_38_in_tl1418);  
			stream_38.add(char_literal164);

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:137:10: ( WS )*
			loop89:
			while (true) {
				int alt89=2;
				int LA89_0 = input.LA(1);
				if ( (LA89_0==WS) ) {
					alt89=1;
				}

				switch (alt89) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:137:10: WS
					{
					WS165=(Token)match(input,WS,FOLLOW_WS_in_tl1420);  
					stream_WS.add(WS165);

					}
					break;

				default :
					break loop89;
				}
			}

			string_literal166=(Token)match(input,61,FOLLOW_61_in_tl1422);  
			stream_61.add(string_literal166);

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:137:18: ( WS )*
			loop90:
			while (true) {
				int alt90=2;
				int LA90_0 = input.LA(1);
				if ( (LA90_0==WS) ) {
					alt90=1;
				}

				switch (alt90) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:137:18: WS
					{
					WS167=(Token)match(input,WS,FOLLOW_WS_in_tl1424);  
					stream_WS.add(WS167);

					}
					break;

				default :
					break loop90;
				}
			}

			pushFollow(FOLLOW_exprBase_in_tl1427);
			exprBase168=exprBase();
			state._fsp--;

			stream_exprBase.add(exprBase168.getTree());
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:137:31: ( WS )*
			loop91:
			while (true) {
				int alt91=2;
				int LA91_0 = input.LA(1);
				if ( (LA91_0==WS) ) {
					alt91=1;
				}

				switch (alt91) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:137:31: WS
					{
					WS169=(Token)match(input,WS,FOLLOW_WS_in_tl1429);  
					stream_WS.add(WS169);

					}
					break;

				default :
					break loop91;
				}
			}

			char_literal170=(Token)match(input,39,FOLLOW_39_in_tl1431);  
			stream_39.add(char_literal170);

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
			// 137:38: -> ^( TL exprBase )
			{
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:137:41: ^( TL exprBase )
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
	// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:139:1: symbolExpr : '(' ( WS )* Symbol ( WS )* ( lExpr )? ( WS )* ')' -> ^( CALL Symbol ( lExpr )? ) ;
	public final while_astParser.symbolExpr_return symbolExpr() throws RecognitionException {
		while_astParser.symbolExpr_return retval = new while_astParser.symbolExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal171=null;
		Token WS172=null;
		Token Symbol173=null;
		Token WS174=null;
		Token WS176=null;
		Token char_literal177=null;
		ParserRuleReturnScope lExpr175 =null;

		Object char_literal171_tree=null;
		Object WS172_tree=null;
		Object Symbol173_tree=null;
		Object WS174_tree=null;
		Object WS176_tree=null;
		Object char_literal177_tree=null;
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_Symbol=new RewriteRuleTokenStream(adaptor,"token Symbol");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_lExpr=new RewriteRuleSubtreeStream(adaptor,"rule lExpr");

		try {
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:140:2: ( '(' ( WS )* Symbol ( WS )* ( lExpr )? ( WS )* ')' -> ^( CALL Symbol ( lExpr )? ) )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:140:4: '(' ( WS )* Symbol ( WS )* ( lExpr )? ( WS )* ')'
			{
			char_literal171=(Token)match(input,38,FOLLOW_38_in_symbolExpr1448);  
			stream_38.add(char_literal171);

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:140:8: ( WS )*
			loop92:
			while (true) {
				int alt92=2;
				int LA92_0 = input.LA(1);
				if ( (LA92_0==WS) ) {
					alt92=1;
				}

				switch (alt92) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:140:8: WS
					{
					WS172=(Token)match(input,WS,FOLLOW_WS_in_symbolExpr1450);  
					stream_WS.add(WS172);

					}
					break;

				default :
					break loop92;
				}
			}

			Symbol173=(Token)match(input,Symbol,FOLLOW_Symbol_in_symbolExpr1453);  
			stream_Symbol.add(Symbol173);

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:140:19: ( WS )*
			loop93:
			while (true) {
				int alt93=2;
				int LA93_0 = input.LA(1);
				if ( (LA93_0==WS) ) {
					alt93=1;
				}

				switch (alt93) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:140:19: WS
					{
					WS174=(Token)match(input,WS,FOLLOW_WS_in_symbolExpr1455);  
					stream_WS.add(WS174);

					}
					break;

				default :
					break loop93;
				}
			}

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:140:23: ( lExpr )?
			int alt94=2;
			int LA94_0 = input.LA(1);
			if ( (LA94_0==Symbol||LA94_0==Variable||LA94_0==38||LA94_0==56) ) {
				alt94=1;
			}
			switch (alt94) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:140:23: lExpr
					{
					pushFollow(FOLLOW_lExpr_in_symbolExpr1458);
					lExpr175=lExpr();
					state._fsp--;

					stream_lExpr.add(lExpr175.getTree());
					}
					break;

			}

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:140:30: ( WS )*
			loop95:
			while (true) {
				int alt95=2;
				int LA95_0 = input.LA(1);
				if ( (LA95_0==WS) ) {
					alt95=1;
				}

				switch (alt95) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:140:30: WS
					{
					WS176=(Token)match(input,WS,FOLLOW_WS_in_symbolExpr1461);  
					stream_WS.add(WS176);

					}
					break;

				default :
					break loop95;
				}
			}

			char_literal177=(Token)match(input,39,FOLLOW_39_in_symbolExpr1463);  
			stream_39.add(char_literal177);

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
			// 140:37: -> ^( CALL Symbol ( lExpr )? )
			{
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:140:40: ^( CALL Symbol ( lExpr )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CALL, "CALL"), root_1);
				adaptor.addChild(root_1, stream_Symbol.nextNode());
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:140:54: ( lExpr )?
				if ( stream_lExpr.hasNext() ) {
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
		return retval;
	}
	// $ANTLR end "symbolExpr"


	public static class expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:142:1: expression : exprBase ( ( WS )* '=?' ( WS )* exprBase )? -> ^( EXPR exprBase ( exprBase )? ) ;
	public final while_astParser.expression_return expression() throws RecognitionException {
		while_astParser.expression_return retval = new while_astParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WS179=null;
		Token string_literal180=null;
		Token WS181=null;
		ParserRuleReturnScope exprBase178 =null;
		ParserRuleReturnScope exprBase182 =null;

		Object WS179_tree=null;
		Object string_literal180_tree=null;
		Object WS181_tree=null;
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");

		try {
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:143:5: ( exprBase ( ( WS )* '=?' ( WS )* exprBase )? -> ^( EXPR exprBase ( exprBase )? ) )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:143:7: exprBase ( ( WS )* '=?' ( WS )* exprBase )?
			{
			pushFollow(FOLLOW_exprBase_in_expression1487);
			exprBase178=exprBase();
			state._fsp--;

			stream_exprBase.add(exprBase178.getTree());
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:143:16: ( ( WS )* '=?' ( WS )* exprBase )?
			int alt98=2;
			alt98 = dfa98.predict(input);
			switch (alt98) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:143:17: ( WS )* '=?' ( WS )* exprBase
					{
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:143:17: ( WS )*
					loop96:
					while (true) {
						int alt96=2;
						int LA96_0 = input.LA(1);
						if ( (LA96_0==WS) ) {
							alt96=1;
						}

						switch (alt96) {
						case 1 :
							// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:143:17: WS
							{
							WS179=(Token)match(input,WS,FOLLOW_WS_in_expression1490);  
							stream_WS.add(WS179);

							}
							break;

						default :
							break loop96;
						}
					}

					string_literal180=(Token)match(input,44,FOLLOW_44_in_expression1493);  
					stream_44.add(string_literal180);

					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:143:26: ( WS )*
					loop97:
					while (true) {
						int alt97=2;
						int LA97_0 = input.LA(1);
						if ( (LA97_0==WS) ) {
							alt97=1;
						}

						switch (alt97) {
						case 1 :
							// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:143:26: WS
							{
							WS181=(Token)match(input,WS,FOLLOW_WS_in_expression1495);  
							stream_WS.add(WS181);

							}
							break;

						default :
							break loop97;
						}
					}

					pushFollow(FOLLOW_exprBase_in_expression1498);
					exprBase182=exprBase();
					state._fsp--;

					stream_exprBase.add(exprBase182.getTree());
					}
					break;

			}

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
			// 143:41: -> ^( EXPR exprBase ( exprBase )? )
			{
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:143:44: ^( EXPR exprBase ( exprBase )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR, "EXPR"), root_1);
				adaptor.addChild(root_1, stream_exprBase.nextTree());
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:143:60: ( exprBase )?
				if ( stream_exprBase.hasNext() ) {
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
		return retval;
	}
	// $ANTLR end "expression"


	public static class lExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "lExpr"
	// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:147:1: lExpr : exprBase ( ( WS )* lExpr )? -> exprBase ( lExpr )? ;
	public final while_astParser.lExpr_return lExpr() throws RecognitionException {
		while_astParser.lExpr_return retval = new while_astParser.lExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WS184=null;
		ParserRuleReturnScope exprBase183 =null;
		ParserRuleReturnScope lExpr185 =null;

		Object WS184_tree=null;
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");
		RewriteRuleSubtreeStream stream_lExpr=new RewriteRuleSubtreeStream(adaptor,"rule lExpr");

		try {
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:148:5: ( exprBase ( ( WS )* lExpr )? -> exprBase ( lExpr )? )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:148:7: exprBase ( ( WS )* lExpr )?
			{
			pushFollow(FOLLOW_exprBase_in_lExpr1533);
			exprBase183=exprBase();
			state._fsp--;

			stream_exprBase.add(exprBase183.getTree());
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:148:16: ( ( WS )* lExpr )?
			int alt100=2;
			alt100 = dfa100.predict(input);
			switch (alt100) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:148:17: ( WS )* lExpr
					{
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:148:17: ( WS )*
					loop99:
					while (true) {
						int alt99=2;
						int LA99_0 = input.LA(1);
						if ( (LA99_0==WS) ) {
							alt99=1;
						}

						switch (alt99) {
						case 1 :
							// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:148:17: WS
							{
							WS184=(Token)match(input,WS,FOLLOW_WS_in_lExpr1536);  
							stream_WS.add(WS184);

							}
							break;

						default :
							break loop99;
						}
					}

					pushFollow(FOLLOW_lExpr_in_lExpr1539);
					lExpr185=lExpr();
					state._fsp--;

					stream_lExpr.add(lExpr185.getTree());
					}
					break;

			}

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
			// 148:29: -> exprBase ( lExpr )?
			{
				adaptor.addChild(root_0, stream_exprBase.nextTree());
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:148:41: ( lExpr )?
				if ( stream_lExpr.hasNext() ) {
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
		return retval;
	}
	// $ANTLR end "lExpr"

	// Delegated rules


	protected DFA32 dfa32 = new DFA32(this);
	protected DFA77 dfa77 = new DFA77(this);
	protected DFA98 dfa98 = new DFA98(this);
	protected DFA100 dfa100 = new DFA100(this);
	static final String DFA32_eotS =
		"\4\uffff";
	static final String DFA32_eofS =
		"\4\uffff";
	static final String DFA32_minS =
		"\2\44\2\uffff";
	static final String DFA32_maxS =
		"\2\72\2\uffff";
	static final String DFA32_acceptS =
		"\2\uffff\1\1\1\2";
	static final String DFA32_specialS =
		"\4\uffff}>";
	static final String[] DFA32_transitionS = {
			"\1\1\1\3\5\uffff\1\2\3\uffff\2\3\11\uffff\1\3",
			"\1\1\1\3\5\uffff\1\2\3\uffff\2\3\11\uffff\1\3",
			"",
			""
	};

	static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
	static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
	static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
	static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
	static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
	static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
	static final short[][] DFA32_transition;

	static {
		int numStates = DFA32_transitionS.length;
		DFA32_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
		}
	}

	protected class DFA32 extends DFA {

		public DFA32(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 32;
			this.eot = DFA32_eot;
			this.eof = DFA32_eof;
			this.min = DFA32_min;
			this.max = DFA32_max;
			this.accept = DFA32_accept;
			this.special = DFA32_special;
			this.transition = DFA32_transition;
		}
		@Override
		public String getDescription() {
			return "83:15: ( ( WS )* ';' ( WS )* ( getComment )? commands )?";
		}
	}

	static final String DFA77_eotS =
		"\13\uffff";
	static final String DFA77_eofS =
		"\13\uffff";
	static final String DFA77_minS =
		"\1\35\3\uffff\2\35\5\uffff";
	static final String DFA77_maxS =
		"\1\70\3\uffff\2\75\5\uffff";
	static final String DFA77_acceptS =
		"\1\uffff\1\1\1\2\1\3\2\uffff\1\4\1\5\1\6\1\7\1\10";
	static final String DFA77_specialS =
		"\13\uffff}>";
	static final String[] DFA77_transitionS = {
			"\1\3\4\uffff\1\2\3\uffff\1\4\21\uffff\1\1",
			"",
			"",
			"",
			"\1\12\6\uffff\1\5\10\uffff\1\6\6\uffff\1\10\2\uffff\1\7\5\uffff\1\11",
			"\1\12\6\uffff\1\5\10\uffff\1\6\6\uffff\1\10\2\uffff\1\7\5\uffff\1\11",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA77_eot = DFA.unpackEncodedString(DFA77_eotS);
	static final short[] DFA77_eof = DFA.unpackEncodedString(DFA77_eofS);
	static final char[] DFA77_min = DFA.unpackEncodedStringToUnsignedChars(DFA77_minS);
	static final char[] DFA77_max = DFA.unpackEncodedStringToUnsignedChars(DFA77_maxS);
	static final short[] DFA77_accept = DFA.unpackEncodedString(DFA77_acceptS);
	static final short[] DFA77_special = DFA.unpackEncodedString(DFA77_specialS);
	static final short[][] DFA77_transition;

	static {
		int numStates = DFA77_transitionS.length;
		DFA77_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA77_transition[i] = DFA.unpackEncodedString(DFA77_transitionS[i]);
		}
	}

	protected class DFA77 extends DFA {

		public DFA77(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 77;
			this.eot = DFA77_eot;
			this.eof = DFA77_eof;
			this.min = DFA77_min;
			this.max = DFA77_max;
			this.accept = DFA77_accept;
			this.special = DFA77_special;
			this.transition = DFA77_transition;
		}
		@Override
		public String getDescription() {
			return "123:1: exprBase : ( nil_ | variable | symbol | cons | list | hd | tl | symbolExpr );";
		}
	}

	static final String DFA98_eotS =
		"\4\uffff";
	static final String DFA98_eofS =
		"\4\uffff";
	static final String DFA98_minS =
		"\2\7\2\uffff";
	static final String DFA98_maxS =
		"\2\74\2\uffff";
	static final String DFA98_acceptS =
		"\2\uffff\1\1\1\2";
	static final String DFA98_specialS =
		"\4\uffff}>";
	static final String[] DFA98_transitionS = {
			"\1\3\34\uffff\1\1\1\3\2\uffff\1\3\2\uffff\1\3\1\2\1\uffff\3\3\11\uffff"+
			"\1\3\1\uffff\1\3",
			"\1\3\34\uffff\1\1\1\3\2\uffff\1\3\2\uffff\1\3\1\2\1\uffff\3\3\11\uffff"+
			"\1\3\1\uffff\1\3",
			"",
			""
	};

	static final short[] DFA98_eot = DFA.unpackEncodedString(DFA98_eotS);
	static final short[] DFA98_eof = DFA.unpackEncodedString(DFA98_eofS);
	static final char[] DFA98_min = DFA.unpackEncodedStringToUnsignedChars(DFA98_minS);
	static final char[] DFA98_max = DFA.unpackEncodedStringToUnsignedChars(DFA98_maxS);
	static final short[] DFA98_accept = DFA.unpackEncodedString(DFA98_acceptS);
	static final short[] DFA98_special = DFA.unpackEncodedString(DFA98_specialS);
	static final short[][] DFA98_transition;

	static {
		int numStates = DFA98_transitionS.length;
		DFA98_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA98_transition[i] = DFA.unpackEncodedString(DFA98_transitionS[i]);
		}
	}

	protected class DFA98 extends DFA {

		public DFA98(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 98;
			this.eot = DFA98_eot;
			this.eof = DFA98_eof;
			this.min = DFA98_min;
			this.max = DFA98_max;
			this.accept = DFA98_accept;
			this.special = DFA98_special;
			this.transition = DFA98_transition;
		}
		@Override
		public String getDescription() {
			return "143:16: ( ( WS )* '=?' ( WS )* exprBase )?";
		}
	}

	static final String DFA100_eotS =
		"\4\uffff";
	static final String DFA100_eofS =
		"\4\uffff";
	static final String DFA100_minS =
		"\2\35\2\uffff";
	static final String DFA100_maxS =
		"\2\70\2\uffff";
	static final String DFA100_acceptS =
		"\2\uffff\1\1\1\2";
	static final String DFA100_specialS =
		"\4\uffff}>";
	static final String[] DFA100_transitionS = {
			"\1\2\4\uffff\1\2\1\uffff\1\1\1\uffff\1\2\1\3\20\uffff\1\2",
			"\1\2\4\uffff\1\2\1\uffff\1\1\1\uffff\1\2\1\3\20\uffff\1\2",
			"",
			""
	};

	static final short[] DFA100_eot = DFA.unpackEncodedString(DFA100_eotS);
	static final short[] DFA100_eof = DFA.unpackEncodedString(DFA100_eofS);
	static final char[] DFA100_min = DFA.unpackEncodedStringToUnsignedChars(DFA100_minS);
	static final char[] DFA100_max = DFA.unpackEncodedStringToUnsignedChars(DFA100_maxS);
	static final short[] DFA100_accept = DFA.unpackEncodedString(DFA100_acceptS);
	static final short[] DFA100_special = DFA.unpackEncodedString(DFA100_specialS);
	static final short[][] DFA100_transition;

	static {
		int numStates = DFA100_transitionS.length;
		DFA100_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA100_transition[i] = DFA.unpackEncodedString(DFA100_transitionS[i]);
		}
	}

	protected class DFA100 extends DFA {

		public DFA100(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 100;
			this.eot = DFA100_eot;
			this.eof = DFA100_eof;
			this.min = DFA100_min;
			this.max = DFA100_max;
			this.accept = DFA100_accept;
			this.special = DFA100_special;
			this.transition = DFA100_transition;
		}
		@Override
		public String getDescription() {
			return "148:16: ( ( WS )* lExpr )?";
		}
	}

	public static final BitSet FOLLOW_program_in_startProgram224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Comment_in_getComment406 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_variable422 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Symbol_in_symbol434 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_in_program450 = new BitSet(new long[]{0x0008001000000082L});
	public static final BitSet FOLLOW_WS_in_program452 = new BitSet(new long[]{0x0008001000000082L});
	public static final BitSet FOLLOW_program_in_program455 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WS_in_function486 = new BitSet(new long[]{0x0008001000000080L});
	public static final BitSet FOLLOW_getComment_in_function489 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_function492 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_WS_in_function494 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_Symbol_in_function496 = new BitSet(new long[]{0x0000021000000000L});
	public static final BitSet FOLLOW_WS_in_function498 = new BitSet(new long[]{0x0000021000000000L});
	public static final BitSet FOLLOW_41_in_function501 = new BitSet(new long[]{0x0800001000000080L});
	public static final BitSet FOLLOW_WS_in_function503 = new BitSet(new long[]{0x0800001000000080L});
	public static final BitSet FOLLOW_getComment_in_function506 = new BitSet(new long[]{0x0800001000000000L});
	public static final BitSet FOLLOW_WS_in_function509 = new BitSet(new long[]{0x0800001000000000L});
	public static final BitSet FOLLOW_definition_in_function512 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_definition542 = new BitSet(new long[]{0x0000003400000080L});
	public static final BitSet FOLLOW_WS_in_definition544 = new BitSet(new long[]{0x0000003400000080L});
	public static final BitSet FOLLOW_input_in_definition547 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_definition549 = new BitSet(new long[]{0x4226001400000080L});
	public static final BitSet FOLLOW_WS_in_definition551 = new BitSet(new long[]{0x4226001400000080L});
	public static final BitSet FOLLOW_getComment_in_definition554 = new BitSet(new long[]{0x4226001400000000L});
	public static final BitSet FOLLOW_WS_in_definition557 = new BitSet(new long[]{0x4226001400000000L});
	public static final BitSet FOLLOW_commands_in_definition560 = new BitSet(new long[]{0x0000003000000000L});
	public static final BitSet FOLLOW_WS_in_definition562 = new BitSet(new long[]{0x0000003000000000L});
	public static final BitSet FOLLOW_37_in_definition565 = new BitSet(new long[]{0x8000001000000080L});
	public static final BitSet FOLLOW_WS_in_definition567 = new BitSet(new long[]{0x8000001000000080L});
	public static final BitSet FOLLOW_getComment_in_definition570 = new BitSet(new long[]{0x8000001000000000L});
	public static final BitSet FOLLOW_WS_in_definition573 = new BitSet(new long[]{0x8000001000000000L});
	public static final BitSet FOLLOW_63_in_definition576 = new BitSet(new long[]{0x0000001400000000L});
	public static final BitSet FOLLOW_WS_in_definition578 = new BitSet(new long[]{0x0000001400000000L});
	public static final BitSet FOLLOW_output_in_definition581 = new BitSet(new long[]{0x0000001000000082L});
	public static final BitSet FOLLOW_WS_in_definition583 = new BitSet(new long[]{0x0000001000000082L});
	public static final BitSet FOLLOW_getComment_in_definition586 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inputSub_in_input616 = new BitSet(new long[]{0x0000001000000082L});
	public static final BitSet FOLLOW_WS_in_input619 = new BitSet(new long[]{0x0000001000000082L});
	public static final BitSet FOLLOW_getComment_in_input622 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_inputSub650 = new BitSet(new long[]{0x0000011000000002L});
	public static final BitSet FOLLOW_WS_in_inputSub652 = new BitSet(new long[]{0x0000011000000002L});
	public static final BitSet FOLLOW_40_in_inputSub656 = new BitSet(new long[]{0x0000001400000000L});
	public static final BitSet FOLLOW_WS_in_inputSub658 = new BitSet(new long[]{0x0000001400000000L});
	public static final BitSet FOLLOW_inputSub_in_inputSub661 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_output689 = new BitSet(new long[]{0x0000011000000002L});
	public static final BitSet FOLLOW_WS_in_output691 = new BitSet(new long[]{0x0000011000000002L});
	public static final BitSet FOLLOW_40_in_output695 = new BitSet(new long[]{0x0000001400000000L});
	public static final BitSet FOLLOW_WS_in_output697 = new BitSet(new long[]{0x0000001400000000L});
	public static final BitSet FOLLOW_output_in_output700 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_in_commands730 = new BitSet(new long[]{0x0000081000000002L});
	public static final BitSet FOLLOW_WS_in_commands734 = new BitSet(new long[]{0x0000081000000000L});
	public static final BitSet FOLLOW_43_in_commands737 = new BitSet(new long[]{0x4226001400000080L});
	public static final BitSet FOLLOW_WS_in_commands739 = new BitSet(new long[]{0x4226001400000080L});
	public static final BitSet FOLLOW_getComment_in_commands742 = new BitSet(new long[]{0x4226000400000000L});
	public static final BitSet FOLLOW_commands_in_commands745 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_command772 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decl_in_command776 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if__in_command780 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_for__in_command784 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_while__in_command788 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foreach__in_command792 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vars_in_decl806 = new BitSet(new long[]{0x0000041000000000L});
	public static final BitSet FOLLOW_WS_in_decl808 = new BitSet(new long[]{0x0000041000000000L});
	public static final BitSet FOLLOW_42_in_decl811 = new BitSet(new long[]{0x0100005420000000L});
	public static final BitSet FOLLOW_WS_in_decl813 = new BitSet(new long[]{0x0100005420000000L});
	public static final BitSet FOLLOW_exprs_in_decl816 = new BitSet(new long[]{0x0000001000000082L});
	public static final BitSet FOLLOW_WS_in_decl819 = new BitSet(new long[]{0x0000001000000082L});
	public static final BitSet FOLLOW_getComment_in_decl822 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_if_853 = new BitSet(new long[]{0x0100005420000000L});
	public static final BitSet FOLLOW_WS_in_if_855 = new BitSet(new long[]{0x0100005420000000L});
	public static final BitSet FOLLOW_expression_in_if_858 = new BitSet(new long[]{0x1000001000000000L});
	public static final BitSet FOLLOW_WS_in_if_860 = new BitSet(new long[]{0x1000001000000000L});
	public static final BitSet FOLLOW_then__in_if_863 = new BitSet(new long[]{0x0001801000000000L});
	public static final BitSet FOLLOW_WS_in_if_865 = new BitSet(new long[]{0x0001801000000000L});
	public static final BitSet FOLLOW_else__in_if_869 = new BitSet(new long[]{0x0001001000000000L});
	public static final BitSet FOLLOW_WS_in_if_871 = new BitSet(new long[]{0x0001001000000000L});
	public static final BitSet FOLLOW_48_in_if_876 = new BitSet(new long[]{0x0000001000000082L});
	public static final BitSet FOLLOW_WS_in_if_878 = new BitSet(new long[]{0x0000001000000082L});
	public static final BitSet FOLLOW_getComment_in_if_881 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_60_in_then_916 = new BitSet(new long[]{0x4226001400000080L});
	public static final BitSet FOLLOW_WS_in_then_918 = new BitSet(new long[]{0x4226001400000080L});
	public static final BitSet FOLLOW_getComment_in_then_921 = new BitSet(new long[]{0x4226001400000000L});
	public static final BitSet FOLLOW_WS_in_then_924 = new BitSet(new long[]{0x4226001400000000L});
	public static final BitSet FOLLOW_commands_in_then_927 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_else_944 = new BitSet(new long[]{0x4226001400000080L});
	public static final BitSet FOLLOW_WS_in_else_946 = new BitSet(new long[]{0x4226001400000080L});
	public static final BitSet FOLLOW_getComment_in_else_949 = new BitSet(new long[]{0x4226001400000000L});
	public static final BitSet FOLLOW_WS_in_else_952 = new BitSet(new long[]{0x4226001400000000L});
	public static final BitSet FOLLOW_commands_in_else_955 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_62_in_while_978 = new BitSet(new long[]{0x0100005420000000L});
	public static final BitSet FOLLOW_WS_in_while_980 = new BitSet(new long[]{0x0100005420000000L});
	public static final BitSet FOLLOW_expression_in_while_983 = new BitSet(new long[]{0x0000401000000080L});
	public static final BitSet FOLLOW_WS_in_while_985 = new BitSet(new long[]{0x0000401000000080L});
	public static final BitSet FOLLOW_getComment_in_while_988 = new BitSet(new long[]{0x0000401000000000L});
	public static final BitSet FOLLOW_WS_in_while_991 = new BitSet(new long[]{0x0000401000000000L});
	public static final BitSet FOLLOW_do__in_while_994 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_do_1026 = new BitSet(new long[]{0x4226001400000080L});
	public static final BitSet FOLLOW_WS_in_do_1028 = new BitSet(new long[]{0x4226001400000080L});
	public static final BitSet FOLLOW_getComment_in_do_1031 = new BitSet(new long[]{0x4226001400000000L});
	public static final BitSet FOLLOW_WS_in_do_1034 = new BitSet(new long[]{0x4226001400000000L});
	public static final BitSet FOLLOW_commands_in_do_1037 = new BitSet(new long[]{0x0400001000000000L});
	public static final BitSet FOLLOW_WS_in_do_1039 = new BitSet(new long[]{0x0400001000000000L});
	public static final BitSet FOLLOW_58_in_do_1042 = new BitSet(new long[]{0x0000001000000082L});
	public static final BitSet FOLLOW_WS_in_do_1044 = new BitSet(new long[]{0x0000001000000082L});
	public static final BitSet FOLLOW_getComment_in_do_1047 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_for_1069 = new BitSet(new long[]{0x0100005420000000L});
	public static final BitSet FOLLOW_WS_in_for_1071 = new BitSet(new long[]{0x0100005420000000L});
	public static final BitSet FOLLOW_expression_in_for_1074 = new BitSet(new long[]{0x0000401000000080L});
	public static final BitSet FOLLOW_WS_in_for_1076 = new BitSet(new long[]{0x0000401000000080L});
	public static final BitSet FOLLOW_getComment_in_for_1079 = new BitSet(new long[]{0x0000401000000000L});
	public static final BitSet FOLLOW_WS_in_for_1082 = new BitSet(new long[]{0x0000401000000000L});
	public static final BitSet FOLLOW_do__in_for_1085 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_foreach_1116 = new BitSet(new long[]{0x0000001400000000L});
	public static final BitSet FOLLOW_WS_in_foreach_1118 = new BitSet(new long[]{0x0000001400000000L});
	public static final BitSet FOLLOW_Variable_in_foreach_1121 = new BitSet(new long[]{0x0040001000000000L});
	public static final BitSet FOLLOW_WS_in_foreach_1123 = new BitSet(new long[]{0x0040001000000000L});
	public static final BitSet FOLLOW_54_in_foreach_1126 = new BitSet(new long[]{0x0100005420000000L});
	public static final BitSet FOLLOW_WS_in_foreach_1128 = new BitSet(new long[]{0x0100005420000000L});
	public static final BitSet FOLLOW_expression_in_foreach_1131 = new BitSet(new long[]{0x0000401000000080L});
	public static final BitSet FOLLOW_WS_in_foreach_1133 = new BitSet(new long[]{0x0000401000000080L});
	public static final BitSet FOLLOW_getComment_in_foreach_1136 = new BitSet(new long[]{0x0000401000000000L});
	public static final BitSet FOLLOW_WS_in_foreach_1139 = new BitSet(new long[]{0x0000401000000000L});
	public static final BitSet FOLLOW_do__in_foreach_1142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_vars1178 = new BitSet(new long[]{0x0000011000000002L});
	public static final BitSet FOLLOW_WS_in_vars1180 = new BitSet(new long[]{0x0000011000000002L});
	public static final BitSet FOLLOW_40_in_vars1184 = new BitSet(new long[]{0x0000001400000000L});
	public static final BitSet FOLLOW_WS_in_vars1185 = new BitSet(new long[]{0x0000001400000000L});
	public static final BitSet FOLLOW_vars_in_vars1188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_exprs1214 = new BitSet(new long[]{0x0000011000000002L});
	public static final BitSet FOLLOW_WS_in_exprs1216 = new BitSet(new long[]{0x0000011000000002L});
	public static final BitSet FOLLOW_40_in_exprs1220 = new BitSet(new long[]{0x0100005420000000L});
	public static final BitSet FOLLOW_WS_in_exprs1221 = new BitSet(new long[]{0x0100005420000000L});
	public static final BitSet FOLLOW_exprs_in_exprs1224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nil__in_exprBase1249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_exprBase1257 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_symbol_in_exprBase1261 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cons_in_exprBase1269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_list_in_exprBase1273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_hd_in_exprBase1281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tl_in_exprBase1285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_symbolExpr_in_exprBase1293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_nil_1311 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_cons1325 = new BitSet(new long[]{0x0000201000000000L});
	public static final BitSet FOLLOW_WS_in_cons1327 = new BitSet(new long[]{0x0000201000000000L});
	public static final BitSet FOLLOW_45_in_cons1330 = new BitSet(new long[]{0x010000D420000000L});
	public static final BitSet FOLLOW_WS_in_cons1332 = new BitSet(new long[]{0x010000D420000000L});
	public static final BitSet FOLLOW_lExpr_in_cons1335 = new BitSet(new long[]{0x0000009000000000L});
	public static final BitSet FOLLOW_WS_in_cons1338 = new BitSet(new long[]{0x0000009000000000L});
	public static final BitSet FOLLOW_39_in_cons1341 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_list1358 = new BitSet(new long[]{0x0080001000000000L});
	public static final BitSet FOLLOW_WS_in_list1359 = new BitSet(new long[]{0x0080001000000000L});
	public static final BitSet FOLLOW_55_in_list1362 = new BitSet(new long[]{0x010000D420000000L});
	public static final BitSet FOLLOW_WS_in_list1364 = new BitSet(new long[]{0x010000D420000000L});
	public static final BitSet FOLLOW_lExpr_in_list1367 = new BitSet(new long[]{0x0000009000000000L});
	public static final BitSet FOLLOW_WS_in_list1370 = new BitSet(new long[]{0x0000009000000000L});
	public static final BitSet FOLLOW_39_in_list1373 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_hd1389 = new BitSet(new long[]{0x0010001000000000L});
	public static final BitSet FOLLOW_WS_in_hd1390 = new BitSet(new long[]{0x0010001000000000L});
	public static final BitSet FOLLOW_52_in_hd1393 = new BitSet(new long[]{0x0100005420000000L});
	public static final BitSet FOLLOW_WS_in_hd1395 = new BitSet(new long[]{0x0100005420000000L});
	public static final BitSet FOLLOW_exprBase_in_hd1398 = new BitSet(new long[]{0x0000009000000000L});
	public static final BitSet FOLLOW_WS_in_hd1400 = new BitSet(new long[]{0x0000009000000000L});
	public static final BitSet FOLLOW_39_in_hd1402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_tl1418 = new BitSet(new long[]{0x2000001000000000L});
	public static final BitSet FOLLOW_WS_in_tl1420 = new BitSet(new long[]{0x2000001000000000L});
	public static final BitSet FOLLOW_61_in_tl1422 = new BitSet(new long[]{0x0100005420000000L});
	public static final BitSet FOLLOW_WS_in_tl1424 = new BitSet(new long[]{0x0100005420000000L});
	public static final BitSet FOLLOW_exprBase_in_tl1427 = new BitSet(new long[]{0x0000009000000000L});
	public static final BitSet FOLLOW_WS_in_tl1429 = new BitSet(new long[]{0x0000009000000000L});
	public static final BitSet FOLLOW_39_in_tl1431 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_symbolExpr1448 = new BitSet(new long[]{0x0000001020000000L});
	public static final BitSet FOLLOW_WS_in_symbolExpr1450 = new BitSet(new long[]{0x0000001020000000L});
	public static final BitSet FOLLOW_Symbol_in_symbolExpr1453 = new BitSet(new long[]{0x010000D420000000L});
	public static final BitSet FOLLOW_WS_in_symbolExpr1455 = new BitSet(new long[]{0x010000D420000000L});
	public static final BitSet FOLLOW_lExpr_in_symbolExpr1458 = new BitSet(new long[]{0x0000009000000000L});
	public static final BitSet FOLLOW_WS_in_symbolExpr1461 = new BitSet(new long[]{0x0000009000000000L});
	public static final BitSet FOLLOW_39_in_symbolExpr1463 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprBase_in_expression1487 = new BitSet(new long[]{0x0000101000000002L});
	public static final BitSet FOLLOW_WS_in_expression1490 = new BitSet(new long[]{0x0000101000000000L});
	public static final BitSet FOLLOW_44_in_expression1493 = new BitSet(new long[]{0x0100005420000000L});
	public static final BitSet FOLLOW_WS_in_expression1495 = new BitSet(new long[]{0x0100005420000000L});
	public static final BitSet FOLLOW_exprBase_in_expression1498 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprBase_in_lExpr1533 = new BitSet(new long[]{0x0100005420000002L});
	public static final BitSet FOLLOW_WS_in_lExpr1536 = new BitSet(new long[]{0x0100005420000000L});
	public static final BitSet FOLLOW_lExpr_in_lExpr1539 = new BitSet(new long[]{0x0000000000000002L});
}

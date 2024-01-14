// $ANTLR 3.5.1 C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g 2024-01-14 11:14:22

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
		"'cons '", "'do'", "'else'", "'fi'", "'for'", "'foreach'", "'function'", 
		"'hd '", "'if'", "'in'", "'list '", "'nil'", "'nop'", "'not'", "'od'", 
		"'read'", "'then'", "'tl '", "'while'", "'write '"
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

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:38:5: ( program -> ^( START program ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:38:7: program
			{
			pushFollow(FOLLOW_program_in_startProgram222);
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
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:38:18: ^( START program )
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:51:1: getComment : Comment -> ^( COMMENT Comment ) ;
	public final while_astParser.getComment_return getComment() throws RecognitionException {
		while_astParser.getComment_return retval = new while_astParser.getComment_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Comment2=null;

		Object Comment2_tree=null;
		RewriteRuleTokenStream stream_Comment=new RewriteRuleTokenStream(adaptor,"token Comment");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:52:2: ( Comment -> ^( COMMENT Comment ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:52:4: Comment
			{
			Comment2=(Token)match(input,Comment,FOLLOW_Comment_in_getComment407);  
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
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:52:15: ^( COMMENT Comment )
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:54:1: variable : Variable -> Variable ;
	public final while_astParser.variable_return variable() throws RecognitionException {
		while_astParser.variable_return retval = new while_astParser.variable_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Variable3=null;

		Object Variable3_tree=null;
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:54:9: ( Variable -> Variable )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:54:11: Variable
			{
			Variable3=(Token)match(input,Variable,FOLLOW_Variable_in_variable423);  
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:56:1: symbol : Symbol -> Symbol ;
	public final while_astParser.symbol_return symbol() throws RecognitionException {
		while_astParser.symbol_return retval = new while_astParser.symbol_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Symbol4=null;

		Object Symbol4_tree=null;
		RewriteRuleTokenStream stream_Symbol=new RewriteRuleTokenStream(adaptor,"token Symbol");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:56:8: ( Symbol -> Symbol )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:56:10: Symbol
			{
			Symbol4=(Token)match(input,Symbol,FOLLOW_Symbol_in_symbol435);  
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:58:1: program : function ( WS )* ( program )? -> ^( PROGRAM function ( program )? ) ;
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
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:59:5: ( function ( WS )* ( program )? -> ^( PROGRAM function ( program )? ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:59:7: function ( WS )* ( program )?
			{
			pushFollow(FOLLOW_function_in_program451);
			function5=function();
			state._fsp--;

			stream_function.add(function5.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:59:16: ( WS )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==WS) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:59:16: WS
					{
					WS6=(Token)match(input,WS,FOLLOW_WS_in_program453);  
					stream_WS.add(WS6);

					}
					break;

				default :
					break loop1;
				}
			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:59:20: ( program )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==Comment||LA2_0==51) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:59:20: program
					{
					pushFollow(FOLLOW_program_in_program456);
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
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:59:32: ^( PROGRAM function ( program )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);
				adaptor.addChild(root_1, stream_function.nextTree());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:59:51: ( program )?
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:62:1: function : ( getComment )? 'function' WS Symbol ( WS )* ':' ( getComment )? ( WS )* definition -> ^( FUNCDEF Symbol definition ( getComment )? END ) ;
	public final while_astParser.function_return function() throws RecognitionException {
		while_astParser.function_return retval = new while_astParser.function_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal9=null;
		Token WS10=null;
		Token Symbol11=null;
		Token WS12=null;
		Token char_literal13=null;
		Token WS15=null;
		ParserRuleReturnScope getComment8 =null;
		ParserRuleReturnScope getComment14 =null;
		ParserRuleReturnScope definition16 =null;

		Object string_literal9_tree=null;
		Object WS10_tree=null;
		Object Symbol11_tree=null;
		Object WS12_tree=null;
		Object char_literal13_tree=null;
		Object WS15_tree=null;
		RewriteRuleTokenStream stream_Symbol=new RewriteRuleTokenStream(adaptor,"token Symbol");
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");
		RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"rule definition");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:63:5: ( ( getComment )? 'function' WS Symbol ( WS )* ':' ( getComment )? ( WS )* definition -> ^( FUNCDEF Symbol definition ( getComment )? END ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:63:7: ( getComment )? 'function' WS Symbol ( WS )* ':' ( getComment )? ( WS )* definition
			{
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:63:7: ( getComment )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==Comment) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:63:7: getComment
					{
					pushFollow(FOLLOW_getComment_in_function487);
					getComment8=getComment();
					state._fsp--;

					stream_getComment.add(getComment8.getTree());
					}
					break;

			}

			string_literal9=(Token)match(input,51,FOLLOW_51_in_function490);  
			stream_51.add(string_literal9);

			WS10=(Token)match(input,WS,FOLLOW_WS_in_function492);  
			stream_WS.add(WS10);

			Symbol11=(Token)match(input,Symbol,FOLLOW_Symbol_in_function494);  
			stream_Symbol.add(Symbol11);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:63:40: ( WS )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==WS) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:63:40: WS
					{
					WS12=(Token)match(input,WS,FOLLOW_WS_in_function496);  
					stream_WS.add(WS12);

					}
					break;

				default :
					break loop4;
				}
			}

			char_literal13=(Token)match(input,41,FOLLOW_41_in_function499);  
			stream_41.add(char_literal13);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:63:48: ( getComment )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==Comment) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:63:48: getComment
					{
					pushFollow(FOLLOW_getComment_in_function501);
					getComment14=getComment();
					state._fsp--;

					stream_getComment.add(getComment14.getTree());
					}
					break;

			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:63:60: ( WS )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==WS) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:63:60: WS
					{
					WS15=(Token)match(input,WS,FOLLOW_WS_in_function504);  
					stream_WS.add(WS15);

					}
					break;

				default :
					break loop6;
				}
			}

			pushFollow(FOLLOW_definition_in_function507);
			definition16=definition();
			state._fsp--;

			stream_definition.add(definition16.getTree());
			// AST REWRITE
			// elements: getComment, Symbol, definition
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 63:75: -> ^( FUNCDEF Symbol definition ( getComment )? END )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:63:78: ^( FUNCDEF Symbol definition ( getComment )? END )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCDEF, "FUNCDEF"), root_1);
				adaptor.addChild(root_1, stream_Symbol.nextNode());
				adaptor.addChild(root_1, stream_definition.nextTree());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:63:106: ( getComment )?
				if ( stream_getComment.hasNext() ) {
					adaptor.addChild(root_1, stream_getComment.nextTree());
				}
				stream_getComment.reset();

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:66:1: definition : 'read' ( WS )* input '%' ( getComment )? ( WS )* commands ( WS )* '%' ( getComment )? ( WS )* 'write ' output ( getComment )? -> ^( FUNCTION input commands output ( getComment )? ) ;
	public final while_astParser.definition_return definition() throws RecognitionException {
		while_astParser.definition_return retval = new while_astParser.definition_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal17=null;
		Token WS18=null;
		Token char_literal20=null;
		Token WS22=null;
		Token WS24=null;
		Token char_literal25=null;
		Token WS27=null;
		Token string_literal28=null;
		ParserRuleReturnScope input19 =null;
		ParserRuleReturnScope getComment21 =null;
		ParserRuleReturnScope commands23 =null;
		ParserRuleReturnScope getComment26 =null;
		ParserRuleReturnScope output29 =null;
		ParserRuleReturnScope getComment30 =null;

		Object string_literal17_tree=null;
		Object WS18_tree=null;
		Object char_literal20_tree=null;
		Object WS22_tree=null;
		Object WS24_tree=null;
		Object char_literal25_tree=null;
		Object WS27_tree=null;
		Object string_literal28_tree=null;
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
		RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");
		RewriteRuleSubtreeStream stream_input=new RewriteRuleSubtreeStream(adaptor,"rule input");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:67:5: ( 'read' ( WS )* input '%' ( getComment )? ( WS )* commands ( WS )* '%' ( getComment )? ( WS )* 'write ' output ( getComment )? -> ^( FUNCTION input commands output ( getComment )? ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:67:7: 'read' ( WS )* input '%' ( getComment )? ( WS )* commands ( WS )* '%' ( getComment )? ( WS )* 'write ' output ( getComment )?
			{
			string_literal17=(Token)match(input,60,FOLLOW_60_in_definition540);  
			stream_60.add(string_literal17);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:67:14: ( WS )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==WS) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:67:14: WS
					{
					WS18=(Token)match(input,WS,FOLLOW_WS_in_definition542);  
					stream_WS.add(WS18);

					}
					break;

				default :
					break loop7;
				}
			}

			pushFollow(FOLLOW_input_in_definition545);
			input19=input();
			state._fsp--;

			stream_input.add(input19.getTree());
			char_literal20=(Token)match(input,37,FOLLOW_37_in_definition547);  
			stream_37.add(char_literal20);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:67:28: ( getComment )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==Comment) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:67:28: getComment
					{
					pushFollow(FOLLOW_getComment_in_definition549);
					getComment21=getComment();
					state._fsp--;

					stream_getComment.add(getComment21.getTree());
					}
					break;

			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:67:40: ( WS )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==WS) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:67:40: WS
					{
					WS22=(Token)match(input,WS,FOLLOW_WS_in_definition552);  
					stream_WS.add(WS22);

					}
					break;

				default :
					break loop9;
				}
			}

			pushFollow(FOLLOW_commands_in_definition555);
			commands23=commands();
			state._fsp--;

			stream_commands.add(commands23.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:67:53: ( WS )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==WS) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:67:53: WS
					{
					WS24=(Token)match(input,WS,FOLLOW_WS_in_definition557);  
					stream_WS.add(WS24);

					}
					break;

				default :
					break loop10;
				}
			}

			char_literal25=(Token)match(input,37,FOLLOW_37_in_definition560);  
			stream_37.add(char_literal25);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:67:61: ( getComment )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==Comment) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:67:61: getComment
					{
					pushFollow(FOLLOW_getComment_in_definition562);
					getComment26=getComment();
					state._fsp--;

					stream_getComment.add(getComment26.getTree());
					}
					break;

			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:67:73: ( WS )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==WS) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:67:73: WS
					{
					WS27=(Token)match(input,WS,FOLLOW_WS_in_definition565);  
					stream_WS.add(WS27);

					}
					break;

				default :
					break loop12;
				}
			}

			string_literal28=(Token)match(input,64,FOLLOW_64_in_definition568);  
			stream_64.add(string_literal28);

			pushFollow(FOLLOW_output_in_definition570);
			output29=output();
			state._fsp--;

			stream_output.add(output29.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:67:93: ( getComment )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==Comment) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:67:93: getComment
					{
					pushFollow(FOLLOW_getComment_in_definition572);
					getComment30=getComment();
					state._fsp--;

					stream_getComment.add(getComment30.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: getComment, commands, output, input
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 67:104: -> ^( FUNCTION input commands output ( getComment )? )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:67:107: ^( FUNCTION input commands output ( getComment )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION, "FUNCTION"), root_1);
				adaptor.addChild(root_1, stream_input.nextTree());
				adaptor.addChild(root_1, stream_commands.nextTree());
				adaptor.addChild(root_1, stream_output.nextTree());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:67:140: ( getComment )?
				if ( stream_getComment.hasNext() ) {
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
		return retval;
	}
	// $ANTLR end "definition"


	public static class input_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "input"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:70:1: input : ( inputSub )? ( getComment )? -> ^( INPUTS ( inputSub )? ( getComment )? ) ;
	public final while_astParser.input_return input() throws RecognitionException {
		while_astParser.input_return retval = new while_astParser.input_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope inputSub31 =null;
		ParserRuleReturnScope getComment32 =null;

		RewriteRuleSubtreeStream stream_inputSub=new RewriteRuleSubtreeStream(adaptor,"rule inputSub");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:71:5: ( ( inputSub )? ( getComment )? -> ^( INPUTS ( inputSub )? ( getComment )? ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:71:7: ( inputSub )? ( getComment )?
			{
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:71:7: ( inputSub )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==Variable) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:71:7: inputSub
					{
					pushFollow(FOLLOW_inputSub_in_input604);
					inputSub31=inputSub();
					state._fsp--;

					stream_inputSub.add(inputSub31.getTree());
					}
					break;

			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:71:17: ( getComment )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==Comment) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:71:17: getComment
					{
					pushFollow(FOLLOW_getComment_in_input607);
					getComment32=getComment();
					state._fsp--;

					stream_getComment.add(getComment32.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: inputSub, getComment
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 71:29: -> ^( INPUTS ( inputSub )? ( getComment )? )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:71:33: ^( INPUTS ( inputSub )? ( getComment )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INPUTS, "INPUTS"), root_1);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:71:42: ( inputSub )?
				if ( stream_inputSub.hasNext() ) {
					adaptor.addChild(root_1, stream_inputSub.nextTree());
				}
				stream_inputSub.reset();

				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:71:52: ( getComment )?
				if ( stream_getComment.hasNext() ) {
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
		return retval;
	}
	// $ANTLR end "input"


	public static class inputSub_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "inputSub"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:74:1: inputSub : Variable ( WS )* ( ',' ( WS )* inputSub )? -> Variable ( inputSub )? ;
	public final while_astParser.inputSub_return inputSub() throws RecognitionException {
		while_astParser.inputSub_return retval = new while_astParser.inputSub_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Variable33=null;
		Token WS34=null;
		Token char_literal35=null;
		Token WS36=null;
		ParserRuleReturnScope inputSub37 =null;

		Object Variable33_tree=null;
		Object WS34_tree=null;
		Object char_literal35_tree=null;
		Object WS36_tree=null;
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_inputSub=new RewriteRuleSubtreeStream(adaptor,"rule inputSub");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:75:5: ( Variable ( WS )* ( ',' ( WS )* inputSub )? -> Variable ( inputSub )? )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:75:7: Variable ( WS )* ( ',' ( WS )* inputSub )?
			{
			Variable33=(Token)match(input,Variable,FOLLOW_Variable_in_inputSub638);  
			stream_Variable.add(Variable33);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:75:16: ( WS )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==WS) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:75:16: WS
					{
					WS34=(Token)match(input,WS,FOLLOW_WS_in_inputSub640);  
					stream_WS.add(WS34);

					}
					break;

				default :
					break loop16;
				}
			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:75:20: ( ',' ( WS )* inputSub )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==40) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:75:21: ',' ( WS )* inputSub
					{
					char_literal35=(Token)match(input,40,FOLLOW_40_in_inputSub644);  
					stream_40.add(char_literal35);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:75:25: ( WS )*
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( (LA17_0==WS) ) {
							alt17=1;
						}

						switch (alt17) {
						case 1 :
							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:75:25: WS
							{
							WS36=(Token)match(input,WS,FOLLOW_WS_in_inputSub646);  
							stream_WS.add(WS36);

							}
							break;

						default :
							break loop17;
						}
					}

					pushFollow(FOLLOW_inputSub_in_inputSub649);
					inputSub37=inputSub();
					state._fsp--;

					stream_inputSub.add(inputSub37.getTree());
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
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:75:52: ( inputSub )?
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:78:1: output : Variable ( WS )* ( ',' ( WS )* output )? -> ^( OUTPUT Variable ( output )? ) ;
	public final while_astParser.output_return output() throws RecognitionException {
		while_astParser.output_return retval = new while_astParser.output_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Variable38=null;
		Token WS39=null;
		Token char_literal40=null;
		Token WS41=null;
		ParserRuleReturnScope output42 =null;

		Object Variable38_tree=null;
		Object WS39_tree=null;
		Object char_literal40_tree=null;
		Object WS41_tree=null;
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:79:5: ( Variable ( WS )* ( ',' ( WS )* output )? -> ^( OUTPUT Variable ( output )? ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:79:7: Variable ( WS )* ( ',' ( WS )* output )?
			{
			Variable38=(Token)match(input,Variable,FOLLOW_Variable_in_output677);  
			stream_Variable.add(Variable38);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:79:16: ( WS )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==WS) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:79:16: WS
					{
					WS39=(Token)match(input,WS,FOLLOW_WS_in_output679);  
					stream_WS.add(WS39);

					}
					break;

				default :
					break loop19;
				}
			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:79:20: ( ',' ( WS )* output )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==40) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:79:21: ',' ( WS )* output
					{
					char_literal40=(Token)match(input,40,FOLLOW_40_in_output683);  
					stream_40.add(char_literal40);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:79:25: ( WS )*
					loop20:
					while (true) {
						int alt20=2;
						int LA20_0 = input.LA(1);
						if ( (LA20_0==WS) ) {
							alt20=1;
						}

						switch (alt20) {
						case 1 :
							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:79:25: WS
							{
							WS41=(Token)match(input,WS,FOLLOW_WS_in_output685);  
							stream_WS.add(WS41);

							}
							break;

						default :
							break loop20;
						}
					}

					pushFollow(FOLLOW_output_in_output688);
					output42=output();
					state._fsp--;

					stream_output.add(output42.getTree());
					}
					break;

			}

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
			// 79:38: -> ^( OUTPUT Variable ( output )? )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:79:41: ^( OUTPUT Variable ( output )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OUTPUT, "OUTPUT"), root_1);
				adaptor.addChild(root_1, stream_Variable.nextNode());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:79:59: ( output )?
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:82:1: commands : command ( ( WS )* ';' ( WS )* commands )? -> command ( commands )? ;
	public final while_astParser.commands_return commands() throws RecognitionException {
		while_astParser.commands_return retval = new while_astParser.commands_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WS44=null;
		Token char_literal45=null;
		Token WS46=null;
		ParserRuleReturnScope command43 =null;
		ParserRuleReturnScope commands47 =null;

		Object WS44_tree=null;
		Object char_literal45_tree=null;
		Object WS46_tree=null;
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_command=new RewriteRuleSubtreeStream(adaptor,"rule command");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:83:5: ( command ( ( WS )* ';' ( WS )* commands )? -> command ( commands )? )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:83:7: command ( ( WS )* ';' ( WS )* commands )?
			{
			pushFollow(FOLLOW_command_in_commands718);
			command43=command();
			state._fsp--;

			stream_command.add(command43.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:83:15: ( ( WS )* ';' ( WS )* commands )?
			int alt24=2;
			alt24 = dfa24.predict(input);
			switch (alt24) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:83:17: ( WS )* ';' ( WS )* commands
					{
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:83:17: ( WS )*
					loop22:
					while (true) {
						int alt22=2;
						int LA22_0 = input.LA(1);
						if ( (LA22_0==WS) ) {
							alt22=1;
						}

						switch (alt22) {
						case 1 :
							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:83:17: WS
							{
							WS44=(Token)match(input,WS,FOLLOW_WS_in_commands722);  
							stream_WS.add(WS44);

							}
							break;

						default :
							break loop22;
						}
					}

					char_literal45=(Token)match(input,43,FOLLOW_43_in_commands725);  
					stream_43.add(char_literal45);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:83:25: ( WS )*
					loop23:
					while (true) {
						int alt23=2;
						int LA23_0 = input.LA(1);
						if ( (LA23_0==WS) ) {
							alt23=1;
						}

						switch (alt23) {
						case 1 :
							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:83:25: WS
							{
							WS46=(Token)match(input,WS,FOLLOW_WS_in_commands727);  
							stream_WS.add(WS46);

							}
							break;

						default :
							break loop23;
						}
					}

					pushFollow(FOLLOW_commands_in_commands730);
					commands47=commands();
					state._fsp--;

					stream_commands.add(commands47.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: commands, command
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 83:40: -> command ( commands )?
			{
				adaptor.addChild(root_0, stream_command.nextTree());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:83:51: ( commands )?
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:86:1: command : ( 'nop' | decl | if_ | for_ | while_ | foreach_ );
	public final while_astParser.command_return command() throws RecognitionException {
		while_astParser.command_return retval = new while_astParser.command_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal48=null;
		ParserRuleReturnScope decl49 =null;
		ParserRuleReturnScope if_50 =null;
		ParserRuleReturnScope for_51 =null;
		ParserRuleReturnScope while_52 =null;
		ParserRuleReturnScope foreach_53 =null;

		Object string_literal48_tree=null;

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:87:5: ( 'nop' | decl | if_ | for_ | while_ | foreach_ )
			int alt25=6;
			switch ( input.LA(1) ) {
			case 57:
				{
				alt25=1;
				}
				break;
			case Variable:
				{
				alt25=2;
				}
				break;
			case 53:
				{
				alt25=3;
				}
				break;
			case 49:
				{
				alt25=4;
				}
				break;
			case 63:
				{
				alt25=5;
				}
				break;
			case 50:
				{
				alt25=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}
			switch (alt25) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:87:7: 'nop'
					{
					root_0 = (Object)adaptor.nil();


					string_literal48=(Token)match(input,57,FOLLOW_57_in_command757); 
					string_literal48_tree = (Object)adaptor.create(string_literal48);
					adaptor.addChild(root_0, string_literal48_tree);

					}
					break;
				case 2 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:87:15: decl
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_decl_in_command761);
					decl49=decl();
					state._fsp--;

					adaptor.addChild(root_0, decl49.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:87:22: if_
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_if__in_command765);
					if_50=if_();
					state._fsp--;

					adaptor.addChild(root_0, if_50.getTree());

					}
					break;
				case 4 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:87:28: for_
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_for__in_command769);
					for_51=for_();
					state._fsp--;

					adaptor.addChild(root_0, for_51.getTree());

					}
					break;
				case 5 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:87:35: while_
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_while__in_command773);
					while_52=while_();
					state._fsp--;

					adaptor.addChild(root_0, while_52.getTree());

					}
					break;
				case 6 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:87:44: foreach_
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_foreach__in_command777);
					foreach_53=foreach_();
					state._fsp--;

					adaptor.addChild(root_0, foreach_53.getTree());

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:89:1: decl : ( vars ( WS )* ':=' ( WS )* exprs ) ( getComment )? -> ^( VARDEF vars exprs ( getComment )? ) ;
	public final while_astParser.decl_return decl() throws RecognitionException {
		while_astParser.decl_return retval = new while_astParser.decl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WS55=null;
		Token string_literal56=null;
		Token WS57=null;
		ParserRuleReturnScope vars54 =null;
		ParserRuleReturnScope exprs58 =null;
		ParserRuleReturnScope getComment59 =null;

		Object WS55_tree=null;
		Object string_literal56_tree=null;
		Object WS57_tree=null;
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");
		RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:90:5: ( ( vars ( WS )* ':=' ( WS )* exprs ) ( getComment )? -> ^( VARDEF vars exprs ( getComment )? ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:90:7: ( vars ( WS )* ':=' ( WS )* exprs ) ( getComment )?
			{
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:90:7: ( vars ( WS )* ':=' ( WS )* exprs )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:90:8: vars ( WS )* ':=' ( WS )* exprs
			{
			pushFollow(FOLLOW_vars_in_decl791);
			vars54=vars();
			state._fsp--;

			stream_vars.add(vars54.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:90:13: ( WS )*
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==WS) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:90:13: WS
					{
					WS55=(Token)match(input,WS,FOLLOW_WS_in_decl793);  
					stream_WS.add(WS55);

					}
					break;

				default :
					break loop26;
				}
			}

			string_literal56=(Token)match(input,42,FOLLOW_42_in_decl796);  
			stream_42.add(string_literal56);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:90:22: ( WS )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==WS) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:90:22: WS
					{
					WS57=(Token)match(input,WS,FOLLOW_WS_in_decl798);  
					stream_WS.add(WS57);

					}
					break;

				default :
					break loop27;
				}
			}

			pushFollow(FOLLOW_exprs_in_decl801);
			exprs58=exprs();
			state._fsp--;

			stream_exprs.add(exprs58.getTree());
			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:90:33: ( getComment )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==Comment) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:90:33: getComment
					{
					pushFollow(FOLLOW_getComment_in_decl804);
					getComment59=getComment();
					state._fsp--;

					stream_getComment.add(getComment59.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: vars, exprs, getComment
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 90:45: -> ^( VARDEF vars exprs ( getComment )? )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:90:48: ^( VARDEF vars exprs ( getComment )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARDEF, "VARDEF"), root_1);
				adaptor.addChild(root_1, stream_vars.nextTree());
				adaptor.addChild(root_1, stream_exprs.nextTree());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:90:68: ( getComment )?
				if ( stream_getComment.hasNext() ) {
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
		return retval;
	}
	// $ANTLR end "decl"


	public static class if__return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "if_"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:93:1: if_ : ( 'if' ( WS )* expression ( WS )* then_ ( WS )* ( else_ ( WS )* )? 'fi' ( getComment )? ) -> ^( IF expression then_ ( else_ )? ( getComment )? END ) ;
	public final while_astParser.if__return if_() throws RecognitionException {
		while_astParser.if__return retval = new while_astParser.if__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal60=null;
		Token WS61=null;
		Token WS63=null;
		Token WS65=null;
		Token WS67=null;
		Token string_literal68=null;
		ParserRuleReturnScope expression62 =null;
		ParserRuleReturnScope then_64 =null;
		ParserRuleReturnScope else_66 =null;
		ParserRuleReturnScope getComment69 =null;

		Object string_literal60_tree=null;
		Object WS61_tree=null;
		Object WS63_tree=null;
		Object WS65_tree=null;
		Object WS67_tree=null;
		Object string_literal68_tree=null;
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleSubtreeStream stream_then_=new RewriteRuleSubtreeStream(adaptor,"rule then_");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_else_=new RewriteRuleSubtreeStream(adaptor,"rule else_");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:94:5: ( ( 'if' ( WS )* expression ( WS )* then_ ( WS )* ( else_ ( WS )* )? 'fi' ( getComment )? ) -> ^( IF expression then_ ( else_ )? ( getComment )? END ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:94:7: ( 'if' ( WS )* expression ( WS )* then_ ( WS )* ( else_ ( WS )* )? 'fi' ( getComment )? )
			{
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:94:7: ( 'if' ( WS )* expression ( WS )* then_ ( WS )* ( else_ ( WS )* )? 'fi' ( getComment )? )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:94:8: 'if' ( WS )* expression ( WS )* then_ ( WS )* ( else_ ( WS )* )? 'fi' ( getComment )?
			{
			string_literal60=(Token)match(input,53,FOLLOW_53_in_if_838);  
			stream_53.add(string_literal60);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:94:13: ( WS )*
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==WS) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:94:13: WS
					{
					WS61=(Token)match(input,WS,FOLLOW_WS_in_if_840);  
					stream_WS.add(WS61);

					}
					break;

				default :
					break loop29;
				}
			}

			pushFollow(FOLLOW_expression_in_if_843);
			expression62=expression();
			state._fsp--;

			stream_expression.add(expression62.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:94:28: ( WS )*
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==WS) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:94:28: WS
					{
					WS63=(Token)match(input,WS,FOLLOW_WS_in_if_845);  
					stream_WS.add(WS63);

					}
					break;

				default :
					break loop30;
				}
			}

			pushFollow(FOLLOW_then__in_if_848);
			then_64=then_();
			state._fsp--;

			stream_then_.add(then_64.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:94:38: ( WS )*
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==WS) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:94:38: WS
					{
					WS65=(Token)match(input,WS,FOLLOW_WS_in_if_850);  
					stream_WS.add(WS65);

					}
					break;

				default :
					break loop31;
				}
			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:94:42: ( else_ ( WS )* )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==47) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:94:43: else_ ( WS )*
					{
					pushFollow(FOLLOW_else__in_if_854);
					else_66=else_();
					state._fsp--;

					stream_else_.add(else_66.getTree());
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:94:49: ( WS )*
					loop32:
					while (true) {
						int alt32=2;
						int LA32_0 = input.LA(1);
						if ( (LA32_0==WS) ) {
							alt32=1;
						}

						switch (alt32) {
						case 1 :
							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:94:49: WS
							{
							WS67=(Token)match(input,WS,FOLLOW_WS_in_if_856);  
							stream_WS.add(WS67);

							}
							break;

						default :
							break loop32;
						}
					}

					}
					break;

			}

			string_literal68=(Token)match(input,48,FOLLOW_48_in_if_861);  
			stream_48.add(string_literal68);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:94:60: ( getComment )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==Comment) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:94:60: getComment
					{
					pushFollow(FOLLOW_getComment_in_if_863);
					getComment69=getComment();
					state._fsp--;

					stream_getComment.add(getComment69.getTree());
					}
					break;

			}

			}

			// AST REWRITE
			// elements: then_, else_, expression, getComment
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 94:73: -> ^( IF expression then_ ( else_ )? ( getComment )? END )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:94:76: ^( IF expression then_ ( else_ )? ( getComment )? END )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_1, stream_then_.nextTree());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:94:98: ( else_ )?
				if ( stream_else_.hasNext() ) {
					adaptor.addChild(root_1, stream_else_.nextTree());
				}
				stream_else_.reset();

				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:94:105: ( getComment )?
				if ( stream_getComment.hasNext() ) {
					adaptor.addChild(root_1, stream_getComment.nextTree());
				}
				stream_getComment.reset();

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:97:1: then_ : 'then' ( getComment )? ( WS )* commands -> ^( THEN commands ( getComment )? ) ;
	public final while_astParser.then__return then_() throws RecognitionException {
		while_astParser.then__return retval = new while_astParser.then__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal70=null;
		Token WS72=null;
		ParserRuleReturnScope getComment71 =null;
		ParserRuleReturnScope commands73 =null;

		Object string_literal70_tree=null;
		Object WS72_tree=null;
		RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:97:7: ( 'then' ( getComment )? ( WS )* commands -> ^( THEN commands ( getComment )? ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:97:9: 'then' ( getComment )? ( WS )* commands
			{
			string_literal70=(Token)match(input,61,FOLLOW_61_in_then_901);  
			stream_61.add(string_literal70);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:97:16: ( getComment )?
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==Comment) ) {
				alt35=1;
			}
			switch (alt35) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:97:16: getComment
					{
					pushFollow(FOLLOW_getComment_in_then_903);
					getComment71=getComment();
					state._fsp--;

					stream_getComment.add(getComment71.getTree());
					}
					break;

			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:97:28: ( WS )*
			loop36:
			while (true) {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( (LA36_0==WS) ) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:97:28: WS
					{
					WS72=(Token)match(input,WS,FOLLOW_WS_in_then_906);  
					stream_WS.add(WS72);

					}
					break;

				default :
					break loop36;
				}
			}

			pushFollow(FOLLOW_commands_in_then_909);
			commands73=commands();
			state._fsp--;

			stream_commands.add(commands73.getTree());
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
			// 97:41: -> ^( THEN commands ( getComment )? )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:97:44: ^( THEN commands ( getComment )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(THEN, "THEN"), root_1);
				adaptor.addChild(root_1, stream_commands.nextTree());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:97:60: ( getComment )?
				if ( stream_getComment.hasNext() ) {
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
		return retval;
	}
	// $ANTLR end "then_"


	public static class else__return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "else_"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:1: else_ : 'else' ( getComment )? ( WS )* commands -> ^( ELSE commands ( getComment )? ) ;
	public final while_astParser.else__return else_() throws RecognitionException {
		while_astParser.else__return retval = new while_astParser.else__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal74=null;
		Token WS76=null;
		ParserRuleReturnScope getComment75 =null;
		ParserRuleReturnScope commands77 =null;

		Object string_literal74_tree=null;
		Object WS76_tree=null;
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:7: ( 'else' ( getComment )? ( WS )* commands -> ^( ELSE commands ( getComment )? ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:9: 'else' ( getComment )? ( WS )* commands
			{
			string_literal74=(Token)match(input,47,FOLLOW_47_in_else_929);  
			stream_47.add(string_literal74);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:16: ( getComment )?
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==Comment) ) {
				alt37=1;
			}
			switch (alt37) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:16: getComment
					{
					pushFollow(FOLLOW_getComment_in_else_931);
					getComment75=getComment();
					state._fsp--;

					stream_getComment.add(getComment75.getTree());
					}
					break;

			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:28: ( WS )*
			loop38:
			while (true) {
				int alt38=2;
				int LA38_0 = input.LA(1);
				if ( (LA38_0==WS) ) {
					alt38=1;
				}

				switch (alt38) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:28: WS
					{
					WS76=(Token)match(input,WS,FOLLOW_WS_in_else_934);  
					stream_WS.add(WS76);

					}
					break;

				default :
					break loop38;
				}
			}

			pushFollow(FOLLOW_commands_in_else_937);
			commands77=commands();
			state._fsp--;

			stream_commands.add(commands77.getTree());
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
			// 99:41: -> ^( ELSE commands ( getComment )? )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:44: ^( ELSE commands ( getComment )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ELSE, "ELSE"), root_1);
				adaptor.addChild(root_1, stream_commands.nextTree());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:60: ( getComment )?
				if ( stream_getComment.hasNext() ) {
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
		return retval;
	}
	// $ANTLR end "else_"


	public static class while__return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "while_"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:101:1: while_ : ( 'while' ( WS )* expression ( getComment )? ( WS )* do_ ) -> ^( WHILE expression ( getComment )? do_ END ) ;
	public final while_astParser.while__return while_() throws RecognitionException {
		while_astParser.while__return retval = new while_astParser.while__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal78=null;
		Token WS79=null;
		Token WS82=null;
		ParserRuleReturnScope expression80 =null;
		ParserRuleReturnScope getComment81 =null;
		ParserRuleReturnScope do_83 =null;

		Object string_literal78_tree=null;
		Object WS79_tree=null;
		Object WS82_tree=null;
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_do_=new RewriteRuleSubtreeStream(adaptor,"rule do_");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:102:5: ( ( 'while' ( WS )* expression ( getComment )? ( WS )* do_ ) -> ^( WHILE expression ( getComment )? do_ END ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:102:7: ( 'while' ( WS )* expression ( getComment )? ( WS )* do_ )
			{
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:102:7: ( 'while' ( WS )* expression ( getComment )? ( WS )* do_ )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:102:8: 'while' ( WS )* expression ( getComment )? ( WS )* do_
			{
			string_literal78=(Token)match(input,63,FOLLOW_63_in_while_963);  
			stream_63.add(string_literal78);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:102:16: ( WS )*
			loop39:
			while (true) {
				int alt39=2;
				int LA39_0 = input.LA(1);
				if ( (LA39_0==WS) ) {
					alt39=1;
				}

				switch (alt39) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:102:16: WS
					{
					WS79=(Token)match(input,WS,FOLLOW_WS_in_while_965);  
					stream_WS.add(WS79);

					}
					break;

				default :
					break loop39;
				}
			}

			pushFollow(FOLLOW_expression_in_while_968);
			expression80=expression();
			state._fsp--;

			stream_expression.add(expression80.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:102:31: ( getComment )?
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==Comment) ) {
				alt40=1;
			}
			switch (alt40) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:102:31: getComment
					{
					pushFollow(FOLLOW_getComment_in_while_970);
					getComment81=getComment();
					state._fsp--;

					stream_getComment.add(getComment81.getTree());
					}
					break;

			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:102:43: ( WS )*
			loop41:
			while (true) {
				int alt41=2;
				int LA41_0 = input.LA(1);
				if ( (LA41_0==WS) ) {
					alt41=1;
				}

				switch (alt41) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:102:43: WS
					{
					WS82=(Token)match(input,WS,FOLLOW_WS_in_while_973);  
					stream_WS.add(WS82);

					}
					break;

				default :
					break loop41;
				}
			}

			pushFollow(FOLLOW_do__in_while_976);
			do_83=do_();
			state._fsp--;

			stream_do_.add(do_83.getTree());
			}

			// AST REWRITE
			// elements: getComment, expression, do_
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 102:52: -> ^( WHILE expression ( getComment )? do_ END )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:102:55: ^( WHILE expression ( getComment )? do_ END )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WHILE, "WHILE"), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:102:74: ( getComment )?
				if ( stream_getComment.hasNext() ) {
					adaptor.addChild(root_1, stream_getComment.nextTree());
				}
				stream_getComment.reset();

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:105:1: do_ : 'do' ( getComment )? ( WS )* commands ( WS )* 'od' ( getComment )? -> ^( DO commands ( getComment )? ) ;
	public final while_astParser.do__return do_() throws RecognitionException {
		while_astParser.do__return retval = new while_astParser.do__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal84=null;
		Token WS86=null;
		Token WS88=null;
		Token string_literal89=null;
		ParserRuleReturnScope getComment85 =null;
		ParserRuleReturnScope commands87 =null;
		ParserRuleReturnScope getComment90 =null;

		Object string_literal84_tree=null;
		Object WS86_tree=null;
		Object WS88_tree=null;
		Object string_literal89_tree=null;
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:105:6: ( 'do' ( getComment )? ( WS )* commands ( WS )* 'od' ( getComment )? -> ^( DO commands ( getComment )? ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:105:8: 'do' ( getComment )? ( WS )* commands ( WS )* 'od' ( getComment )?
			{
			string_literal84=(Token)match(input,46,FOLLOW_46_in_do_1011);  
			stream_46.add(string_literal84);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:105:13: ( getComment )?
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0==Comment) ) {
				alt42=1;
			}
			switch (alt42) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:105:13: getComment
					{
					pushFollow(FOLLOW_getComment_in_do_1013);
					getComment85=getComment();
					state._fsp--;

					stream_getComment.add(getComment85.getTree());
					}
					break;

			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:105:25: ( WS )*
			loop43:
			while (true) {
				int alt43=2;
				int LA43_0 = input.LA(1);
				if ( (LA43_0==WS) ) {
					alt43=1;
				}

				switch (alt43) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:105:25: WS
					{
					WS86=(Token)match(input,WS,FOLLOW_WS_in_do_1016);  
					stream_WS.add(WS86);

					}
					break;

				default :
					break loop43;
				}
			}

			pushFollow(FOLLOW_commands_in_do_1019);
			commands87=commands();
			state._fsp--;

			stream_commands.add(commands87.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:105:38: ( WS )*
			loop44:
			while (true) {
				int alt44=2;
				int LA44_0 = input.LA(1);
				if ( (LA44_0==WS) ) {
					alt44=1;
				}

				switch (alt44) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:105:38: WS
					{
					WS88=(Token)match(input,WS,FOLLOW_WS_in_do_1021);  
					stream_WS.add(WS88);

					}
					break;

				default :
					break loop44;
				}
			}

			string_literal89=(Token)match(input,59,FOLLOW_59_in_do_1024);  
			stream_59.add(string_literal89);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:105:47: ( getComment )?
			int alt45=2;
			int LA45_0 = input.LA(1);
			if ( (LA45_0==Comment) ) {
				alt45=1;
			}
			switch (alt45) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:105:47: getComment
					{
					pushFollow(FOLLOW_getComment_in_do_1026);
					getComment90=getComment();
					state._fsp--;

					stream_getComment.add(getComment90.getTree());
					}
					break;

			}

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
			// 105:59: -> ^( DO commands ( getComment )? )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:105:62: ^( DO commands ( getComment )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DO, "DO"), root_1);
				adaptor.addChild(root_1, stream_commands.nextTree());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:105:77: ( getComment )?
				if ( stream_getComment.hasNext() ) {
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
		return retval;
	}
	// $ANTLR end "do_"


	public static class for__return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "for_"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:107:1: for_ : ( 'for' ( WS )* expression ( getComment )? ( WS )* do_ ) -> ^( FOR expression do_ END ) ;
	public final while_astParser.for__return for_() throws RecognitionException {
		while_astParser.for__return retval = new while_astParser.for__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal91=null;
		Token WS92=null;
		Token WS95=null;
		ParserRuleReturnScope expression93 =null;
		ParserRuleReturnScope getComment94 =null;
		ParserRuleReturnScope do_96 =null;

		Object string_literal91_tree=null;
		Object WS92_tree=null;
		Object WS95_tree=null;
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_do_=new RewriteRuleSubtreeStream(adaptor,"rule do_");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:108:5: ( ( 'for' ( WS )* expression ( getComment )? ( WS )* do_ ) -> ^( FOR expression do_ END ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:108:7: ( 'for' ( WS )* expression ( getComment )? ( WS )* do_ )
			{
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:108:7: ( 'for' ( WS )* expression ( getComment )? ( WS )* do_ )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:108:8: 'for' ( WS )* expression ( getComment )? ( WS )* do_
			{
			string_literal91=(Token)match(input,49,FOLLOW_49_in_for_1052);  
			stream_49.add(string_literal91);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:108:14: ( WS )*
			loop46:
			while (true) {
				int alt46=2;
				int LA46_0 = input.LA(1);
				if ( (LA46_0==WS) ) {
					alt46=1;
				}

				switch (alt46) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:108:14: WS
					{
					WS92=(Token)match(input,WS,FOLLOW_WS_in_for_1054);  
					stream_WS.add(WS92);

					}
					break;

				default :
					break loop46;
				}
			}

			pushFollow(FOLLOW_expression_in_for_1057);
			expression93=expression();
			state._fsp--;

			stream_expression.add(expression93.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:108:29: ( getComment )?
			int alt47=2;
			int LA47_0 = input.LA(1);
			if ( (LA47_0==Comment) ) {
				alt47=1;
			}
			switch (alt47) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:108:29: getComment
					{
					pushFollow(FOLLOW_getComment_in_for_1059);
					getComment94=getComment();
					state._fsp--;

					stream_getComment.add(getComment94.getTree());
					}
					break;

			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:108:41: ( WS )*
			loop48:
			while (true) {
				int alt48=2;
				int LA48_0 = input.LA(1);
				if ( (LA48_0==WS) ) {
					alt48=1;
				}

				switch (alt48) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:108:41: WS
					{
					WS95=(Token)match(input,WS,FOLLOW_WS_in_for_1062);  
					stream_WS.add(WS95);

					}
					break;

				default :
					break loop48;
				}
			}

			pushFollow(FOLLOW_do__in_for_1065);
			do_96=do_();
			state._fsp--;

			stream_do_.add(do_96.getTree());
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
			// 108:50: -> ^( FOR expression do_ END )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:108:53: ^( FOR expression do_ END )
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:111:1: foreach_ : ( 'foreach' ( WS )* Variable ( WS )* 'in' ( WS )* expression ( getComment )? ( WS )* do_ ) -> ^( FOREACH ^( IN Variable expression ) ( getComment )? do_ END ) ;
	public final while_astParser.foreach__return foreach_() throws RecognitionException {
		while_astParser.foreach__return retval = new while_astParser.foreach__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal97=null;
		Token WS98=null;
		Token Variable99=null;
		Token WS100=null;
		Token string_literal101=null;
		Token WS102=null;
		Token WS105=null;
		ParserRuleReturnScope expression103 =null;
		ParserRuleReturnScope getComment104 =null;
		ParserRuleReturnScope do_106 =null;

		Object string_literal97_tree=null;
		Object WS98_tree=null;
		Object Variable99_tree=null;
		Object WS100_tree=null;
		Object string_literal101_tree=null;
		Object WS102_tree=null;
		Object WS105_tree=null;
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_do_=new RewriteRuleSubtreeStream(adaptor,"rule do_");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:112:5: ( ( 'foreach' ( WS )* Variable ( WS )* 'in' ( WS )* expression ( getComment )? ( WS )* do_ ) -> ^( FOREACH ^( IN Variable expression ) ( getComment )? do_ END ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:112:7: ( 'foreach' ( WS )* Variable ( WS )* 'in' ( WS )* expression ( getComment )? ( WS )* do_ )
			{
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:112:7: ( 'foreach' ( WS )* Variable ( WS )* 'in' ( WS )* expression ( getComment )? ( WS )* do_ )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:112:8: 'foreach' ( WS )* Variable ( WS )* 'in' ( WS )* expression ( getComment )? ( WS )* do_
			{
			string_literal97=(Token)match(input,50,FOLLOW_50_in_foreach_1096);  
			stream_50.add(string_literal97);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:112:18: ( WS )*
			loop49:
			while (true) {
				int alt49=2;
				int LA49_0 = input.LA(1);
				if ( (LA49_0==WS) ) {
					alt49=1;
				}

				switch (alt49) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:112:18: WS
					{
					WS98=(Token)match(input,WS,FOLLOW_WS_in_foreach_1098);  
					stream_WS.add(WS98);

					}
					break;

				default :
					break loop49;
				}
			}

			Variable99=(Token)match(input,Variable,FOLLOW_Variable_in_foreach_1101);  
			stream_Variable.add(Variable99);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:112:31: ( WS )*
			loop50:
			while (true) {
				int alt50=2;
				int LA50_0 = input.LA(1);
				if ( (LA50_0==WS) ) {
					alt50=1;
				}

				switch (alt50) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:112:31: WS
					{
					WS100=(Token)match(input,WS,FOLLOW_WS_in_foreach_1103);  
					stream_WS.add(WS100);

					}
					break;

				default :
					break loop50;
				}
			}

			string_literal101=(Token)match(input,54,FOLLOW_54_in_foreach_1106);  
			stream_54.add(string_literal101);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:112:40: ( WS )*
			loop51:
			while (true) {
				int alt51=2;
				int LA51_0 = input.LA(1);
				if ( (LA51_0==WS) ) {
					alt51=1;
				}

				switch (alt51) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:112:40: WS
					{
					WS102=(Token)match(input,WS,FOLLOW_WS_in_foreach_1108);  
					stream_WS.add(WS102);

					}
					break;

				default :
					break loop51;
				}
			}

			pushFollow(FOLLOW_expression_in_foreach_1111);
			expression103=expression();
			state._fsp--;

			stream_expression.add(expression103.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:112:55: ( getComment )?
			int alt52=2;
			int LA52_0 = input.LA(1);
			if ( (LA52_0==Comment) ) {
				alt52=1;
			}
			switch (alt52) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:112:55: getComment
					{
					pushFollow(FOLLOW_getComment_in_foreach_1113);
					getComment104=getComment();
					state._fsp--;

					stream_getComment.add(getComment104.getTree());
					}
					break;

			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:112:67: ( WS )*
			loop53:
			while (true) {
				int alt53=2;
				int LA53_0 = input.LA(1);
				if ( (LA53_0==WS) ) {
					alt53=1;
				}

				switch (alt53) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:112:67: WS
					{
					WS105=(Token)match(input,WS,FOLLOW_WS_in_foreach_1116);  
					stream_WS.add(WS105);

					}
					break;

				default :
					break loop53;
				}
			}

			pushFollow(FOLLOW_do__in_foreach_1119);
			do_106=do_();
			state._fsp--;

			stream_do_.add(do_106.getTree());
			}

			// AST REWRITE
			// elements: getComment, expression, do_, Variable
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 112:76: -> ^( FOREACH ^( IN Variable expression ) ( getComment )? do_ END )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:112:79: ^( FOREACH ^( IN Variable expression ) ( getComment )? do_ END )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOREACH, "FOREACH"), root_1);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:112:89: ^( IN Variable expression )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(IN, "IN"), root_2);
				adaptor.addChild(root_2, stream_Variable.nextNode());
				adaptor.addChild(root_2, stream_expression.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:112:115: ( getComment )?
				if ( stream_getComment.hasNext() ) {
					adaptor.addChild(root_1, stream_getComment.nextTree());
				}
				stream_getComment.reset();

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:115:1: vars : Variable ( WS )* ( ',' ( WS )* vars )? -> Variable ( vars )* ;
	public final while_astParser.vars_return vars() throws RecognitionException {
		while_astParser.vars_return retval = new while_astParser.vars_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Variable107=null;
		Token WS108=null;
		Token char_literal109=null;
		Token WS110=null;
		ParserRuleReturnScope vars111 =null;

		Object Variable107_tree=null;
		Object WS108_tree=null;
		Object char_literal109_tree=null;
		Object WS110_tree=null;
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:116:5: ( Variable ( WS )* ( ',' ( WS )* vars )? -> Variable ( vars )* )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:116:7: Variable ( WS )* ( ',' ( WS )* vars )?
			{
			Variable107=(Token)match(input,Variable,FOLLOW_Variable_in_vars1158);  
			stream_Variable.add(Variable107);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:116:16: ( WS )*
			loop54:
			while (true) {
				int alt54=2;
				int LA54_0 = input.LA(1);
				if ( (LA54_0==WS) ) {
					alt54=1;
				}

				switch (alt54) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:116:16: WS
					{
					WS108=(Token)match(input,WS,FOLLOW_WS_in_vars1160);  
					stream_WS.add(WS108);

					}
					break;

				default :
					break loop54;
				}
			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:116:20: ( ',' ( WS )* vars )?
			int alt56=2;
			int LA56_0 = input.LA(1);
			if ( (LA56_0==40) ) {
				alt56=1;
			}
			switch (alt56) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:116:21: ',' ( WS )* vars
					{
					char_literal109=(Token)match(input,40,FOLLOW_40_in_vars1164);  
					stream_40.add(char_literal109);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:116:24: ( WS )*
					loop55:
					while (true) {
						int alt55=2;
						int LA55_0 = input.LA(1);
						if ( (LA55_0==WS) ) {
							alt55=1;
						}

						switch (alt55) {
						case 1 :
							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:116:24: WS
							{
							WS110=(Token)match(input,WS,FOLLOW_WS_in_vars1165);  
							stream_WS.add(WS110);

							}
							break;

						default :
							break loop55;
						}
					}

					pushFollow(FOLLOW_vars_in_vars1168);
					vars111=vars();
					state._fsp--;

					stream_vars.add(vars111.getTree());
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
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:116:47: ( vars )*
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:119:1: exprs : expression ( WS )* ( ',' ( WS )* exprs )? -> expression ( exprs )* ;
	public final while_astParser.exprs_return exprs() throws RecognitionException {
		while_astParser.exprs_return retval = new while_astParser.exprs_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WS113=null;
		Token char_literal114=null;
		Token WS115=null;
		ParserRuleReturnScope expression112 =null;
		ParserRuleReturnScope exprs116 =null;

		Object WS113_tree=null;
		Object char_literal114_tree=null;
		Object WS115_tree=null;
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:120:5: ( expression ( WS )* ( ',' ( WS )* exprs )? -> expression ( exprs )* )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:120:7: expression ( WS )* ( ',' ( WS )* exprs )?
			{
			pushFollow(FOLLOW_expression_in_exprs1194);
			expression112=expression();
			state._fsp--;

			stream_expression.add(expression112.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:120:18: ( WS )*
			loop57:
			while (true) {
				int alt57=2;
				int LA57_0 = input.LA(1);
				if ( (LA57_0==WS) ) {
					alt57=1;
				}

				switch (alt57) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:120:18: WS
					{
					WS113=(Token)match(input,WS,FOLLOW_WS_in_exprs1196);  
					stream_WS.add(WS113);

					}
					break;

				default :
					break loop57;
				}
			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:120:22: ( ',' ( WS )* exprs )?
			int alt59=2;
			int LA59_0 = input.LA(1);
			if ( (LA59_0==40) ) {
				alt59=1;
			}
			switch (alt59) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:120:23: ',' ( WS )* exprs
					{
					char_literal114=(Token)match(input,40,FOLLOW_40_in_exprs1200);  
					stream_40.add(char_literal114);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:120:26: ( WS )*
					loop58:
					while (true) {
						int alt58=2;
						int LA58_0 = input.LA(1);
						if ( (LA58_0==WS) ) {
							alt58=1;
						}

						switch (alt58) {
						case 1 :
							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:120:26: WS
							{
							WS115=(Token)match(input,WS,FOLLOW_WS_in_exprs1201);  
							stream_WS.add(WS115);

							}
							break;

						default :
							break loop58;
						}
					}

					pushFollow(FOLLOW_exprs_in_exprs1204);
					exprs116=exprs();
					state._fsp--;

					stream_exprs.add(exprs116.getTree());
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
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:120:52: ( exprs )*
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:123:1: exprBase : ( nil_ | variable | symbol | cons | list | hd | tl | symbolExpr | notVar );
	public final while_astParser.exprBase_return exprBase() throws RecognitionException {
		while_astParser.exprBase_return retval = new while_astParser.exprBase_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope nil_117 =null;
		ParserRuleReturnScope variable118 =null;
		ParserRuleReturnScope symbol119 =null;
		ParserRuleReturnScope cons120 =null;
		ParserRuleReturnScope list121 =null;
		ParserRuleReturnScope hd122 =null;
		ParserRuleReturnScope tl123 =null;
		ParserRuleReturnScope symbolExpr124 =null;
		ParserRuleReturnScope notVar125 =null;


		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:123:12: ( nil_ | variable | symbol | cons | list | hd | tl | symbolExpr | notVar )
			int alt60=9;
			alt60 = dfa60.predict(input);
			switch (alt60) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:123:15: nil_
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_nil__in_exprBase1229);
					nil_117=nil_();
					state._fsp--;

					adaptor.addChild(root_0, nil_117.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:124:7: variable
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_variable_in_exprBase1237);
					variable118=variable();
					state._fsp--;

					adaptor.addChild(root_0, variable118.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:124:18: symbol
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_symbol_in_exprBase1241);
					symbol119=symbol();
					state._fsp--;

					adaptor.addChild(root_0, symbol119.getTree());

					}
					break;
				case 4 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:125:7: cons
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_cons_in_exprBase1249);
					cons120=cons();
					state._fsp--;

					adaptor.addChild(root_0, cons120.getTree());

					}
					break;
				case 5 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:125:14: list
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_list_in_exprBase1253);
					list121=list();
					state._fsp--;

					adaptor.addChild(root_0, list121.getTree());

					}
					break;
				case 6 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:126:7: hd
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_hd_in_exprBase1261);
					hd122=hd();
					state._fsp--;

					adaptor.addChild(root_0, hd122.getTree());

					}
					break;
				case 7 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:126:12: tl
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_tl_in_exprBase1265);
					tl123=tl();
					state._fsp--;

					adaptor.addChild(root_0, tl123.getTree());

					}
					break;
				case 8 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:127:7: symbolExpr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_symbolExpr_in_exprBase1273);
					symbolExpr124=symbolExpr();
					state._fsp--;

					adaptor.addChild(root_0, symbolExpr124.getTree());

					}
					break;
				case 9 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:128:7: notVar
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_notVar_in_exprBase1281);
					notVar125=notVar();
					state._fsp--;

					adaptor.addChild(root_0, notVar125.getTree());

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:131:1: nil_ : ( 'nil' ) -> 'nil' ;
	public final while_astParser.nil__return nil_() throws RecognitionException {
		while_astParser.nil__return retval = new while_astParser.nil__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal126=null;

		Object string_literal126_tree=null;
		RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:131:6: ( ( 'nil' ) -> 'nil' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:131:8: ( 'nil' )
			{
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:131:8: ( 'nil' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:131:9: 'nil'
			{
			string_literal126=(Token)match(input,56,FOLLOW_56_in_nil_1299);  
			stream_56.add(string_literal126);

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
			// 131:16: -> 'nil'
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:133:1: cons : '(' ( WS )* 'cons ' ( lExpr )? ( WS )* ')' -> ^( CONS lExpr ) ;
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
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_lExpr=new RewriteRuleSubtreeStream(adaptor,"rule lExpr");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:133:6: ( '(' ( WS )* 'cons ' ( lExpr )? ( WS )* ')' -> ^( CONS lExpr ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:133:8: '(' ( WS )* 'cons ' ( lExpr )? ( WS )* ')'
			{
			char_literal127=(Token)match(input,38,FOLLOW_38_in_cons1313);  
			stream_38.add(char_literal127);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:133:12: ( WS )*
			loop61:
			while (true) {
				int alt61=2;
				int LA61_0 = input.LA(1);
				if ( (LA61_0==WS) ) {
					alt61=1;
				}

				switch (alt61) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:133:12: WS
					{
					WS128=(Token)match(input,WS,FOLLOW_WS_in_cons1315);  
					stream_WS.add(WS128);

					}
					break;

				default :
					break loop61;
				}
			}

			string_literal129=(Token)match(input,45,FOLLOW_45_in_cons1318);  
			stream_45.add(string_literal129);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:133:24: ( lExpr )?
			int alt62=2;
			int LA62_0 = input.LA(1);
			if ( (LA62_0==Symbol||LA62_0==Variable||LA62_0==38||LA62_0==56) ) {
				alt62=1;
			}
			switch (alt62) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:133:24: lExpr
					{
					pushFollow(FOLLOW_lExpr_in_cons1320);
					lExpr130=lExpr();
					state._fsp--;

					stream_lExpr.add(lExpr130.getTree());
					}
					break;

			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:133:31: ( WS )*
			loop63:
			while (true) {
				int alt63=2;
				int LA63_0 = input.LA(1);
				if ( (LA63_0==WS) ) {
					alt63=1;
				}

				switch (alt63) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:133:31: WS
					{
					WS131=(Token)match(input,WS,FOLLOW_WS_in_cons1323);  
					stream_WS.add(WS131);

					}
					break;

				default :
					break loop63;
				}
			}

			char_literal132=(Token)match(input,39,FOLLOW_39_in_cons1326);  
			stream_39.add(char_literal132);

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
			// 133:39: -> ^( CONS lExpr )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:133:42: ^( CONS lExpr )
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:134:1: list : '(' ( WS )* 'list ' ( lExpr )? ( WS )* ')' -> ^( LIST lExpr ) ;
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
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_lExpr=new RewriteRuleSubtreeStream(adaptor,"rule lExpr");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:134:6: ( '(' ( WS )* 'list ' ( lExpr )? ( WS )* ')' -> ^( LIST lExpr ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:134:8: '(' ( WS )* 'list ' ( lExpr )? ( WS )* ')'
			{
			char_literal133=(Token)match(input,38,FOLLOW_38_in_list1342);  
			stream_38.add(char_literal133);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:134:11: ( WS )*
			loop64:
			while (true) {
				int alt64=2;
				int LA64_0 = input.LA(1);
				if ( (LA64_0==WS) ) {
					alt64=1;
				}

				switch (alt64) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:134:11: WS
					{
					WS134=(Token)match(input,WS,FOLLOW_WS_in_list1343);  
					stream_WS.add(WS134);

					}
					break;

				default :
					break loop64;
				}
			}

			string_literal135=(Token)match(input,55,FOLLOW_55_in_list1346);  
			stream_55.add(string_literal135);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:134:23: ( lExpr )?
			int alt65=2;
			int LA65_0 = input.LA(1);
			if ( (LA65_0==Symbol||LA65_0==Variable||LA65_0==38||LA65_0==56) ) {
				alt65=1;
			}
			switch (alt65) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:134:23: lExpr
					{
					pushFollow(FOLLOW_lExpr_in_list1348);
					lExpr136=lExpr();
					state._fsp--;

					stream_lExpr.add(lExpr136.getTree());
					}
					break;

			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:134:30: ( WS )*
			loop66:
			while (true) {
				int alt66=2;
				int LA66_0 = input.LA(1);
				if ( (LA66_0==WS) ) {
					alt66=1;
				}

				switch (alt66) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:134:30: WS
					{
					WS137=(Token)match(input,WS,FOLLOW_WS_in_list1351);  
					stream_WS.add(WS137);

					}
					break;

				default :
					break loop66;
				}
			}

			char_literal138=(Token)match(input,39,FOLLOW_39_in_list1354);  
			stream_39.add(char_literal138);

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
			// 134:38: -> ^( LIST lExpr )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:134:41: ^( LIST lExpr )
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
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
		RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:136:4: ( '(' ( WS )* 'hd ' exprBase ( WS )* ')' -> ^( HD exprBase ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:136:6: '(' ( WS )* 'hd ' exprBase ( WS )* ')'
			{
			char_literal139=(Token)match(input,38,FOLLOW_38_in_hd1370);  
			stream_38.add(char_literal139);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:136:9: ( WS )*
			loop67:
			while (true) {
				int alt67=2;
				int LA67_0 = input.LA(1);
				if ( (LA67_0==WS) ) {
					alt67=1;
				}

				switch (alt67) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:136:9: WS
					{
					WS140=(Token)match(input,WS,FOLLOW_WS_in_hd1371);  
					stream_WS.add(WS140);

					}
					break;

				default :
					break loop67;
				}
			}

			string_literal141=(Token)match(input,52,FOLLOW_52_in_hd1374);  
			stream_52.add(string_literal141);

			pushFollow(FOLLOW_exprBase_in_hd1376);
			exprBase142=exprBase();
			state._fsp--;

			stream_exprBase.add(exprBase142.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:136:28: ( WS )*
			loop68:
			while (true) {
				int alt68=2;
				int LA68_0 = input.LA(1);
				if ( (LA68_0==WS) ) {
					alt68=1;
				}

				switch (alt68) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:136:28: WS
					{
					WS143=(Token)match(input,WS,FOLLOW_WS_in_hd1378);  
					stream_WS.add(WS143);

					}
					break;

				default :
					break loop68;
				}
			}

			char_literal144=(Token)match(input,39,FOLLOW_39_in_hd1380);  
			stream_39.add(char_literal144);

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
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:136:38: ^( HD exprBase )
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
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
		RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:138:4: ( '(' ( WS )* 'tl ' exprBase ( WS )* ')' -> ^( TL exprBase ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:138:6: '(' ( WS )* 'tl ' exprBase ( WS )* ')'
			{
			char_literal145=(Token)match(input,38,FOLLOW_38_in_tl1396);  
			stream_38.add(char_literal145);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:138:10: ( WS )*
			loop69:
			while (true) {
				int alt69=2;
				int LA69_0 = input.LA(1);
				if ( (LA69_0==WS) ) {
					alt69=1;
				}

				switch (alt69) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:138:10: WS
					{
					WS146=(Token)match(input,WS,FOLLOW_WS_in_tl1398);  
					stream_WS.add(WS146);

					}
					break;

				default :
					break loop69;
				}
			}

			string_literal147=(Token)match(input,62,FOLLOW_62_in_tl1400);  
			stream_62.add(string_literal147);

			pushFollow(FOLLOW_exprBase_in_tl1402);
			exprBase148=exprBase();
			state._fsp--;

			stream_exprBase.add(exprBase148.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:138:28: ( WS )*
			loop70:
			while (true) {
				int alt70=2;
				int LA70_0 = input.LA(1);
				if ( (LA70_0==WS) ) {
					alt70=1;
				}

				switch (alt70) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:138:28: WS
					{
					WS149=(Token)match(input,WS,FOLLOW_WS_in_tl1404);  
					stream_WS.add(WS149);

					}
					break;

				default :
					break loop70;
				}
			}

			char_literal150=(Token)match(input,39,FOLLOW_39_in_tl1406);  
			stream_39.add(char_literal150);

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
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:138:38: ^( TL exprBase )
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:140:1: symbolExpr : '(' ( WS )* Symbol ( WS )* ( lExpr )? ( WS )* ')' -> ^( CALL Symbol ( lExpr )? ) ;
	public final while_astParser.symbolExpr_return symbolExpr() throws RecognitionException {
		while_astParser.symbolExpr_return retval = new while_astParser.symbolExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal151=null;
		Token WS152=null;
		Token Symbol153=null;
		Token WS154=null;
		Token WS156=null;
		Token char_literal157=null;
		ParserRuleReturnScope lExpr155 =null;

		Object char_literal151_tree=null;
		Object WS152_tree=null;
		Object Symbol153_tree=null;
		Object WS154_tree=null;
		Object WS156_tree=null;
		Object char_literal157_tree=null;
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_Symbol=new RewriteRuleTokenStream(adaptor,"token Symbol");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_lExpr=new RewriteRuleSubtreeStream(adaptor,"rule lExpr");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:141:2: ( '(' ( WS )* Symbol ( WS )* ( lExpr )? ( WS )* ')' -> ^( CALL Symbol ( lExpr )? ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:141:4: '(' ( WS )* Symbol ( WS )* ( lExpr )? ( WS )* ')'
			{
			char_literal151=(Token)match(input,38,FOLLOW_38_in_symbolExpr1423);  
			stream_38.add(char_literal151);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:141:8: ( WS )*
			loop71:
			while (true) {
				int alt71=2;
				int LA71_0 = input.LA(1);
				if ( (LA71_0==WS) ) {
					alt71=1;
				}

				switch (alt71) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:141:8: WS
					{
					WS152=(Token)match(input,WS,FOLLOW_WS_in_symbolExpr1425);  
					stream_WS.add(WS152);

					}
					break;

				default :
					break loop71;
				}
			}

			Symbol153=(Token)match(input,Symbol,FOLLOW_Symbol_in_symbolExpr1428);  
			stream_Symbol.add(Symbol153);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:141:19: ( WS )*
			loop72:
			while (true) {
				int alt72=2;
				int LA72_0 = input.LA(1);
				if ( (LA72_0==WS) ) {
					alt72=1;
				}

				switch (alt72) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:141:19: WS
					{
					WS154=(Token)match(input,WS,FOLLOW_WS_in_symbolExpr1430);  
					stream_WS.add(WS154);

					}
					break;

				default :
					break loop72;
				}
			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:141:23: ( lExpr )?
			int alt73=2;
			int LA73_0 = input.LA(1);
			if ( (LA73_0==Symbol||LA73_0==Variable||LA73_0==38||LA73_0==56) ) {
				alt73=1;
			}
			switch (alt73) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:141:23: lExpr
					{
					pushFollow(FOLLOW_lExpr_in_symbolExpr1433);
					lExpr155=lExpr();
					state._fsp--;

					stream_lExpr.add(lExpr155.getTree());
					}
					break;

			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:141:30: ( WS )*
			loop74:
			while (true) {
				int alt74=2;
				int LA74_0 = input.LA(1);
				if ( (LA74_0==WS) ) {
					alt74=1;
				}

				switch (alt74) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:141:30: WS
					{
					WS156=(Token)match(input,WS,FOLLOW_WS_in_symbolExpr1436);  
					stream_WS.add(WS156);

					}
					break;

				default :
					break loop74;
				}
			}

			char_literal157=(Token)match(input,39,FOLLOW_39_in_symbolExpr1438);  
			stream_39.add(char_literal157);

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
			// 141:37: -> ^( CALL Symbol ( lExpr )? )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:141:40: ^( CALL Symbol ( lExpr )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CALL, "CALL"), root_1);
				adaptor.addChild(root_1, stream_Symbol.nextNode());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:141:54: ( lExpr )?
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


	public static class notVar_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "notVar"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:143:1: notVar : '(' ( WS )* 'not' ( WS )* Variable ( WS )* ')' -> ^( NOT Variable ) ;
	public final while_astParser.notVar_return notVar() throws RecognitionException {
		while_astParser.notVar_return retval = new while_astParser.notVar_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal158=null;
		Token WS159=null;
		Token string_literal160=null;
		Token WS161=null;
		Token Variable162=null;
		Token WS163=null;
		Token char_literal164=null;

		Object char_literal158_tree=null;
		Object WS159_tree=null;
		Object string_literal160_tree=null;
		Object WS161_tree=null;
		Object Variable162_tree=null;
		Object WS163_tree=null;
		Object char_literal164_tree=null;
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:143:8: ( '(' ( WS )* 'not' ( WS )* Variable ( WS )* ')' -> ^( NOT Variable ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:143:10: '(' ( WS )* 'not' ( WS )* Variable ( WS )* ')'
			{
			char_literal158=(Token)match(input,38,FOLLOW_38_in_notVar1459);  
			stream_38.add(char_literal158);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:143:13: ( WS )*
			loop75:
			while (true) {
				int alt75=2;
				int LA75_0 = input.LA(1);
				if ( (LA75_0==WS) ) {
					alt75=1;
				}

				switch (alt75) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:143:13: WS
					{
					WS159=(Token)match(input,WS,FOLLOW_WS_in_notVar1460);  
					stream_WS.add(WS159);

					}
					break;

				default :
					break loop75;
				}
			}

			string_literal160=(Token)match(input,58,FOLLOW_58_in_notVar1462);  
			stream_58.add(string_literal160);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:143:22: ( WS )*
			loop76:
			while (true) {
				int alt76=2;
				int LA76_0 = input.LA(1);
				if ( (LA76_0==WS) ) {
					alt76=1;
				}

				switch (alt76) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:143:22: WS
					{
					WS161=(Token)match(input,WS,FOLLOW_WS_in_notVar1464);  
					stream_WS.add(WS161);

					}
					break;

				default :
					break loop76;
				}
			}

			Variable162=(Token)match(input,Variable,FOLLOW_Variable_in_notVar1467);  
			stream_Variable.add(Variable162);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:143:35: ( WS )*
			loop77:
			while (true) {
				int alt77=2;
				int LA77_0 = input.LA(1);
				if ( (LA77_0==WS) ) {
					alt77=1;
				}

				switch (alt77) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:143:35: WS
					{
					WS163=(Token)match(input,WS,FOLLOW_WS_in_notVar1469);  
					stream_WS.add(WS163);

					}
					break;

				default :
					break loop77;
				}
			}

			char_literal164=(Token)match(input,39,FOLLOW_39_in_notVar1471);  
			stream_39.add(char_literal164);

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
			// 143:42: -> ^( NOT Variable )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:143:45: ^( NOT Variable )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NOT, "NOT"), root_1);
				adaptor.addChild(root_1, stream_Variable.nextNode());
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
	// $ANTLR end "notVar"


	public static class expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:145:1: expression : exprBase ( ( WS )* '=?' ( WS )* exprBase )? -> ^( EXPR exprBase ( exprBase )? ) ;
	public final while_astParser.expression_return expression() throws RecognitionException {
		while_astParser.expression_return retval = new while_astParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WS166=null;
		Token string_literal167=null;
		Token WS168=null;
		ParserRuleReturnScope exprBase165 =null;
		ParserRuleReturnScope exprBase169 =null;

		Object WS166_tree=null;
		Object string_literal167_tree=null;
		Object WS168_tree=null;
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:146:5: ( exprBase ( ( WS )* '=?' ( WS )* exprBase )? -> ^( EXPR exprBase ( exprBase )? ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:146:7: exprBase ( ( WS )* '=?' ( WS )* exprBase )?
			{
			pushFollow(FOLLOW_exprBase_in_expression1492);
			exprBase165=exprBase();
			state._fsp--;

			stream_exprBase.add(exprBase165.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:146:16: ( ( WS )* '=?' ( WS )* exprBase )?
			int alt80=2;
			alt80 = dfa80.predict(input);
			switch (alt80) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:146:17: ( WS )* '=?' ( WS )* exprBase
					{
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:146:17: ( WS )*
					loop78:
					while (true) {
						int alt78=2;
						int LA78_0 = input.LA(1);
						if ( (LA78_0==WS) ) {
							alt78=1;
						}

						switch (alt78) {
						case 1 :
							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:146:17: WS
							{
							WS166=(Token)match(input,WS,FOLLOW_WS_in_expression1495);  
							stream_WS.add(WS166);

							}
							break;

						default :
							break loop78;
						}
					}

					string_literal167=(Token)match(input,44,FOLLOW_44_in_expression1498);  
					stream_44.add(string_literal167);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:146:26: ( WS )*
					loop79:
					while (true) {
						int alt79=2;
						int LA79_0 = input.LA(1);
						if ( (LA79_0==WS) ) {
							alt79=1;
						}

						switch (alt79) {
						case 1 :
							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:146:26: WS
							{
							WS168=(Token)match(input,WS,FOLLOW_WS_in_expression1500);  
							stream_WS.add(WS168);

							}
							break;

						default :
							break loop79;
						}
					}

					pushFollow(FOLLOW_exprBase_in_expression1503);
					exprBase169=exprBase();
					state._fsp--;

					stream_exprBase.add(exprBase169.getTree());
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
			// 146:41: -> ^( EXPR exprBase ( exprBase )? )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:146:44: ^( EXPR exprBase ( exprBase )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR, "EXPR"), root_1);
				adaptor.addChild(root_1, stream_exprBase.nextTree());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:146:60: ( exprBase )?
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:150:1: lExpr : exprBase ( ( WS )* lExpr )? -> exprBase ( lExpr )? ;
	public final while_astParser.lExpr_return lExpr() throws RecognitionException {
		while_astParser.lExpr_return retval = new while_astParser.lExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WS171=null;
		ParserRuleReturnScope exprBase170 =null;
		ParserRuleReturnScope lExpr172 =null;

		Object WS171_tree=null;
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");
		RewriteRuleSubtreeStream stream_lExpr=new RewriteRuleSubtreeStream(adaptor,"rule lExpr");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:151:5: ( exprBase ( ( WS )* lExpr )? -> exprBase ( lExpr )? )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:151:7: exprBase ( ( WS )* lExpr )?
			{
			pushFollow(FOLLOW_exprBase_in_lExpr1538);
			exprBase170=exprBase();
			state._fsp--;

			stream_exprBase.add(exprBase170.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:151:16: ( ( WS )* lExpr )?
			int alt82=2;
			alt82 = dfa82.predict(input);
			switch (alt82) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:151:17: ( WS )* lExpr
					{
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:151:17: ( WS )*
					loop81:
					while (true) {
						int alt81=2;
						int LA81_0 = input.LA(1);
						if ( (LA81_0==WS) ) {
							alt81=1;
						}

						switch (alt81) {
						case 1 :
							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:151:17: WS
							{
							WS171=(Token)match(input,WS,FOLLOW_WS_in_lExpr1541);  
							stream_WS.add(WS171);

							}
							break;

						default :
							break loop81;
						}
					}

					pushFollow(FOLLOW_lExpr_in_lExpr1544);
					lExpr172=lExpr();
					state._fsp--;

					stream_lExpr.add(lExpr172.getTree());
					}
					break;

			}

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
			// 151:29: -> exprBase ( lExpr )?
			{
				adaptor.addChild(root_0, stream_exprBase.nextTree());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:151:41: ( lExpr )?
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


	protected DFA24 dfa24 = new DFA24(this);
	protected DFA60 dfa60 = new DFA60(this);
	protected DFA80 dfa80 = new DFA80(this);
	protected DFA82 dfa82 = new DFA82(this);
	static final String DFA24_eotS =
		"\4\uffff";
	static final String DFA24_eofS =
		"\4\uffff";
	static final String DFA24_minS =
		"\2\44\2\uffff";
	static final String DFA24_maxS =
		"\2\73\2\uffff";
	static final String DFA24_acceptS =
		"\2\uffff\1\1\1\2";
	static final String DFA24_specialS =
		"\4\uffff}>";
	static final String[] DFA24_transitionS = {
			"\1\1\1\3\5\uffff\1\2\3\uffff\2\3\12\uffff\1\3",
			"\1\1\1\3\5\uffff\1\2\3\uffff\2\3\12\uffff\1\3",
			"",
			""
	};

	static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
	static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
	static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
	static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
	static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
	static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
	static final short[][] DFA24_transition;

	static {
		int numStates = DFA24_transitionS.length;
		DFA24_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
		}
	}

	protected class DFA24 extends DFA {

		public DFA24(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 24;
			this.eot = DFA24_eot;
			this.eof = DFA24_eof;
			this.min = DFA24_min;
			this.max = DFA24_max;
			this.accept = DFA24_accept;
			this.special = DFA24_special;
			this.transition = DFA24_transition;
		}
		@Override
		public String getDescription() {
			return "83:15: ( ( WS )* ';' ( WS )* commands )?";
		}
	}

	static final String DFA60_eotS =
		"\14\uffff";
	static final String DFA60_eofS =
		"\14\uffff";
	static final String DFA60_minS =
		"\1\35\3\uffff\2\35\6\uffff";
	static final String DFA60_maxS =
		"\1\70\3\uffff\2\76\6\uffff";
	static final String DFA60_acceptS =
		"\1\uffff\1\1\1\2\1\3\2\uffff\1\4\1\5\1\6\1\7\1\10\1\11";
	static final String DFA60_specialS =
		"\14\uffff}>";
	static final String[] DFA60_transitionS = {
			"\1\3\4\uffff\1\2\3\uffff\1\4\21\uffff\1\1",
			"",
			"",
			"",
			"\1\12\6\uffff\1\5\10\uffff\1\6\6\uffff\1\10\2\uffff\1\7\2\uffff\1\13"+
			"\3\uffff\1\11",
			"\1\12\6\uffff\1\5\10\uffff\1\6\6\uffff\1\10\2\uffff\1\7\2\uffff\1\13"+
			"\3\uffff\1\11",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA60_eot = DFA.unpackEncodedString(DFA60_eotS);
	static final short[] DFA60_eof = DFA.unpackEncodedString(DFA60_eofS);
	static final char[] DFA60_min = DFA.unpackEncodedStringToUnsignedChars(DFA60_minS);
	static final char[] DFA60_max = DFA.unpackEncodedStringToUnsignedChars(DFA60_maxS);
	static final short[] DFA60_accept = DFA.unpackEncodedString(DFA60_acceptS);
	static final short[] DFA60_special = DFA.unpackEncodedString(DFA60_specialS);
	static final short[][] DFA60_transition;

	static {
		int numStates = DFA60_transitionS.length;
		DFA60_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA60_transition[i] = DFA.unpackEncodedString(DFA60_transitionS[i]);
		}
	}

	protected class DFA60 extends DFA {

		public DFA60(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 60;
			this.eot = DFA60_eot;
			this.eof = DFA60_eof;
			this.min = DFA60_min;
			this.max = DFA60_max;
			this.accept = DFA60_accept;
			this.special = DFA60_special;
			this.transition = DFA60_transition;
		}
		@Override
		public String getDescription() {
			return "123:1: exprBase : ( nil_ | variable | symbol | cons | list | hd | tl | symbolExpr | notVar );";
		}
	}

	static final String DFA80_eotS =
		"\4\uffff";
	static final String DFA80_eofS =
		"\4\uffff";
	static final String DFA80_minS =
		"\2\7\2\uffff";
	static final String DFA80_maxS =
		"\2\75\2\uffff";
	static final String DFA80_acceptS =
		"\2\uffff\1\1\1\2";
	static final String DFA80_specialS =
		"\4\uffff}>";
	static final String[] DFA80_transitionS = {
			"\1\3\34\uffff\1\1\1\3\2\uffff\1\3\2\uffff\1\3\1\2\1\uffff\3\3\12\uffff"+
			"\1\3\1\uffff\1\3",
			"\1\3\34\uffff\1\1\1\3\2\uffff\1\3\2\uffff\1\3\1\2\1\uffff\3\3\12\uffff"+
			"\1\3\1\uffff\1\3",
			"",
			""
	};

	static final short[] DFA80_eot = DFA.unpackEncodedString(DFA80_eotS);
	static final short[] DFA80_eof = DFA.unpackEncodedString(DFA80_eofS);
	static final char[] DFA80_min = DFA.unpackEncodedStringToUnsignedChars(DFA80_minS);
	static final char[] DFA80_max = DFA.unpackEncodedStringToUnsignedChars(DFA80_maxS);
	static final short[] DFA80_accept = DFA.unpackEncodedString(DFA80_acceptS);
	static final short[] DFA80_special = DFA.unpackEncodedString(DFA80_specialS);
	static final short[][] DFA80_transition;

	static {
		int numStates = DFA80_transitionS.length;
		DFA80_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA80_transition[i] = DFA.unpackEncodedString(DFA80_transitionS[i]);
		}
	}

	protected class DFA80 extends DFA {

		public DFA80(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 80;
			this.eot = DFA80_eot;
			this.eof = DFA80_eof;
			this.min = DFA80_min;
			this.max = DFA80_max;
			this.accept = DFA80_accept;
			this.special = DFA80_special;
			this.transition = DFA80_transition;
		}
		@Override
		public String getDescription() {
			return "146:16: ( ( WS )* '=?' ( WS )* exprBase )?";
		}
	}

	static final String DFA82_eotS =
		"\4\uffff";
	static final String DFA82_eofS =
		"\4\uffff";
	static final String DFA82_minS =
		"\2\35\2\uffff";
	static final String DFA82_maxS =
		"\2\70\2\uffff";
	static final String DFA82_acceptS =
		"\2\uffff\1\1\1\2";
	static final String DFA82_specialS =
		"\4\uffff}>";
	static final String[] DFA82_transitionS = {
			"\1\2\4\uffff\1\2\1\uffff\1\1\1\uffff\1\2\1\3\20\uffff\1\2",
			"\1\2\4\uffff\1\2\1\uffff\1\1\1\uffff\1\2\1\3\20\uffff\1\2",
			"",
			""
	};

	static final short[] DFA82_eot = DFA.unpackEncodedString(DFA82_eotS);
	static final short[] DFA82_eof = DFA.unpackEncodedString(DFA82_eofS);
	static final char[] DFA82_min = DFA.unpackEncodedStringToUnsignedChars(DFA82_minS);
	static final char[] DFA82_max = DFA.unpackEncodedStringToUnsignedChars(DFA82_maxS);
	static final short[] DFA82_accept = DFA.unpackEncodedString(DFA82_acceptS);
	static final short[] DFA82_special = DFA.unpackEncodedString(DFA82_specialS);
	static final short[][] DFA82_transition;

	static {
		int numStates = DFA82_transitionS.length;
		DFA82_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA82_transition[i] = DFA.unpackEncodedString(DFA82_transitionS[i]);
		}
	}

	protected class DFA82 extends DFA {

		public DFA82(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 82;
			this.eot = DFA82_eot;
			this.eof = DFA82_eof;
			this.min = DFA82_min;
			this.max = DFA82_max;
			this.accept = DFA82_accept;
			this.special = DFA82_special;
			this.transition = DFA82_transition;
		}
		@Override
		public String getDescription() {
			return "151:16: ( ( WS )* lExpr )?";
		}
	}

	public static final BitSet FOLLOW_program_in_startProgram222 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Comment_in_getComment407 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_variable423 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Symbol_in_symbol435 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_in_program451 = new BitSet(new long[]{0x0008001000000082L});
	public static final BitSet FOLLOW_WS_in_program453 = new BitSet(new long[]{0x0008001000000082L});
	public static final BitSet FOLLOW_program_in_program456 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getComment_in_function487 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_function490 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_WS_in_function492 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_Symbol_in_function494 = new BitSet(new long[]{0x0000021000000000L});
	public static final BitSet FOLLOW_WS_in_function496 = new BitSet(new long[]{0x0000021000000000L});
	public static final BitSet FOLLOW_41_in_function499 = new BitSet(new long[]{0x1000001000000080L});
	public static final BitSet FOLLOW_getComment_in_function501 = new BitSet(new long[]{0x1000001000000000L});
	public static final BitSet FOLLOW_WS_in_function504 = new BitSet(new long[]{0x1000001000000000L});
	public static final BitSet FOLLOW_definition_in_function507 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_60_in_definition540 = new BitSet(new long[]{0x0000003400000080L});
	public static final BitSet FOLLOW_WS_in_definition542 = new BitSet(new long[]{0x0000003400000080L});
	public static final BitSet FOLLOW_input_in_definition545 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_definition547 = new BitSet(new long[]{0x8226001400000080L});
	public static final BitSet FOLLOW_getComment_in_definition549 = new BitSet(new long[]{0x8226001400000000L});
	public static final BitSet FOLLOW_WS_in_definition552 = new BitSet(new long[]{0x8226001400000000L});
	public static final BitSet FOLLOW_commands_in_definition555 = new BitSet(new long[]{0x0000003000000000L});
	public static final BitSet FOLLOW_WS_in_definition557 = new BitSet(new long[]{0x0000003000000000L});
	public static final BitSet FOLLOW_37_in_definition560 = new BitSet(new long[]{0x0000001000000080L,0x0000000000000001L});
	public static final BitSet FOLLOW_getComment_in_definition562 = new BitSet(new long[]{0x0000001000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_WS_in_definition565 = new BitSet(new long[]{0x0000001000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_definition568 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_output_in_definition570 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_getComment_in_definition572 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inputSub_in_input604 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_getComment_in_input607 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_inputSub638 = new BitSet(new long[]{0x0000011000000002L});
	public static final BitSet FOLLOW_WS_in_inputSub640 = new BitSet(new long[]{0x0000011000000002L});
	public static final BitSet FOLLOW_40_in_inputSub644 = new BitSet(new long[]{0x0000001400000000L});
	public static final BitSet FOLLOW_WS_in_inputSub646 = new BitSet(new long[]{0x0000001400000000L});
	public static final BitSet FOLLOW_inputSub_in_inputSub649 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_output677 = new BitSet(new long[]{0x0000011000000002L});
	public static final BitSet FOLLOW_WS_in_output679 = new BitSet(new long[]{0x0000011000000002L});
	public static final BitSet FOLLOW_40_in_output683 = new BitSet(new long[]{0x0000001400000000L});
	public static final BitSet FOLLOW_WS_in_output685 = new BitSet(new long[]{0x0000001400000000L});
	public static final BitSet FOLLOW_output_in_output688 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_in_commands718 = new BitSet(new long[]{0x0000081000000002L});
	public static final BitSet FOLLOW_WS_in_commands722 = new BitSet(new long[]{0x0000081000000000L});
	public static final BitSet FOLLOW_43_in_commands725 = new BitSet(new long[]{0x8226001400000000L});
	public static final BitSet FOLLOW_WS_in_commands727 = new BitSet(new long[]{0x8226001400000000L});
	public static final BitSet FOLLOW_commands_in_commands730 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_command757 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decl_in_command761 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if__in_command765 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_for__in_command769 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_while__in_command773 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foreach__in_command777 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vars_in_decl791 = new BitSet(new long[]{0x0000041000000000L});
	public static final BitSet FOLLOW_WS_in_decl793 = new BitSet(new long[]{0x0000041000000000L});
	public static final BitSet FOLLOW_42_in_decl796 = new BitSet(new long[]{0x0100005420000000L});
	public static final BitSet FOLLOW_WS_in_decl798 = new BitSet(new long[]{0x0100005420000000L});
	public static final BitSet FOLLOW_exprs_in_decl801 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_getComment_in_decl804 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_if_838 = new BitSet(new long[]{0x0100005420000000L});
	public static final BitSet FOLLOW_WS_in_if_840 = new BitSet(new long[]{0x0100005420000000L});
	public static final BitSet FOLLOW_expression_in_if_843 = new BitSet(new long[]{0x2000001000000000L});
	public static final BitSet FOLLOW_WS_in_if_845 = new BitSet(new long[]{0x2000001000000000L});
	public static final BitSet FOLLOW_then__in_if_848 = new BitSet(new long[]{0x0001801000000000L});
	public static final BitSet FOLLOW_WS_in_if_850 = new BitSet(new long[]{0x0001801000000000L});
	public static final BitSet FOLLOW_else__in_if_854 = new BitSet(new long[]{0x0001001000000000L});
	public static final BitSet FOLLOW_WS_in_if_856 = new BitSet(new long[]{0x0001001000000000L});
	public static final BitSet FOLLOW_48_in_if_861 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_getComment_in_if_863 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_61_in_then_901 = new BitSet(new long[]{0x8226001400000080L});
	public static final BitSet FOLLOW_getComment_in_then_903 = new BitSet(new long[]{0x8226001400000000L});
	public static final BitSet FOLLOW_WS_in_then_906 = new BitSet(new long[]{0x8226001400000000L});
	public static final BitSet FOLLOW_commands_in_then_909 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_else_929 = new BitSet(new long[]{0x8226001400000080L});
	public static final BitSet FOLLOW_getComment_in_else_931 = new BitSet(new long[]{0x8226001400000000L});
	public static final BitSet FOLLOW_WS_in_else_934 = new BitSet(new long[]{0x8226001400000000L});
	public static final BitSet FOLLOW_commands_in_else_937 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_while_963 = new BitSet(new long[]{0x0100005420000000L});
	public static final BitSet FOLLOW_WS_in_while_965 = new BitSet(new long[]{0x0100005420000000L});
	public static final BitSet FOLLOW_expression_in_while_968 = new BitSet(new long[]{0x0000401000000080L});
	public static final BitSet FOLLOW_getComment_in_while_970 = new BitSet(new long[]{0x0000401000000000L});
	public static final BitSet FOLLOW_WS_in_while_973 = new BitSet(new long[]{0x0000401000000000L});
	public static final BitSet FOLLOW_do__in_while_976 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_do_1011 = new BitSet(new long[]{0x8226001400000080L});
	public static final BitSet FOLLOW_getComment_in_do_1013 = new BitSet(new long[]{0x8226001400000000L});
	public static final BitSet FOLLOW_WS_in_do_1016 = new BitSet(new long[]{0x8226001400000000L});
	public static final BitSet FOLLOW_commands_in_do_1019 = new BitSet(new long[]{0x0800001000000000L});
	public static final BitSet FOLLOW_WS_in_do_1021 = new BitSet(new long[]{0x0800001000000000L});
	public static final BitSet FOLLOW_59_in_do_1024 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_getComment_in_do_1026 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_for_1052 = new BitSet(new long[]{0x0100005420000000L});
	public static final BitSet FOLLOW_WS_in_for_1054 = new BitSet(new long[]{0x0100005420000000L});
	public static final BitSet FOLLOW_expression_in_for_1057 = new BitSet(new long[]{0x0000401000000080L});
	public static final BitSet FOLLOW_getComment_in_for_1059 = new BitSet(new long[]{0x0000401000000000L});
	public static final BitSet FOLLOW_WS_in_for_1062 = new BitSet(new long[]{0x0000401000000000L});
	public static final BitSet FOLLOW_do__in_for_1065 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_foreach_1096 = new BitSet(new long[]{0x0000001400000000L});
	public static final BitSet FOLLOW_WS_in_foreach_1098 = new BitSet(new long[]{0x0000001400000000L});
	public static final BitSet FOLLOW_Variable_in_foreach_1101 = new BitSet(new long[]{0x0040001000000000L});
	public static final BitSet FOLLOW_WS_in_foreach_1103 = new BitSet(new long[]{0x0040001000000000L});
	public static final BitSet FOLLOW_54_in_foreach_1106 = new BitSet(new long[]{0x0100005420000000L});
	public static final BitSet FOLLOW_WS_in_foreach_1108 = new BitSet(new long[]{0x0100005420000000L});
	public static final BitSet FOLLOW_expression_in_foreach_1111 = new BitSet(new long[]{0x0000401000000080L});
	public static final BitSet FOLLOW_getComment_in_foreach_1113 = new BitSet(new long[]{0x0000401000000000L});
	public static final BitSet FOLLOW_WS_in_foreach_1116 = new BitSet(new long[]{0x0000401000000000L});
	public static final BitSet FOLLOW_do__in_foreach_1119 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_vars1158 = new BitSet(new long[]{0x0000011000000002L});
	public static final BitSet FOLLOW_WS_in_vars1160 = new BitSet(new long[]{0x0000011000000002L});
	public static final BitSet FOLLOW_40_in_vars1164 = new BitSet(new long[]{0x0000001400000000L});
	public static final BitSet FOLLOW_WS_in_vars1165 = new BitSet(new long[]{0x0000001400000000L});
	public static final BitSet FOLLOW_vars_in_vars1168 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_exprs1194 = new BitSet(new long[]{0x0000011000000002L});
	public static final BitSet FOLLOW_WS_in_exprs1196 = new BitSet(new long[]{0x0000011000000002L});
	public static final BitSet FOLLOW_40_in_exprs1200 = new BitSet(new long[]{0x0100005420000000L});
	public static final BitSet FOLLOW_WS_in_exprs1201 = new BitSet(new long[]{0x0100005420000000L});
	public static final BitSet FOLLOW_exprs_in_exprs1204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nil__in_exprBase1229 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_exprBase1237 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_symbol_in_exprBase1241 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cons_in_exprBase1249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_list_in_exprBase1253 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_hd_in_exprBase1261 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tl_in_exprBase1265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_symbolExpr_in_exprBase1273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_notVar_in_exprBase1281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_nil_1299 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_cons1313 = new BitSet(new long[]{0x0000201000000000L});
	public static final BitSet FOLLOW_WS_in_cons1315 = new BitSet(new long[]{0x0000201000000000L});
	public static final BitSet FOLLOW_45_in_cons1318 = new BitSet(new long[]{0x010000D420000000L});
	public static final BitSet FOLLOW_lExpr_in_cons1320 = new BitSet(new long[]{0x0000009000000000L});
	public static final BitSet FOLLOW_WS_in_cons1323 = new BitSet(new long[]{0x0000009000000000L});
	public static final BitSet FOLLOW_39_in_cons1326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_list1342 = new BitSet(new long[]{0x0080001000000000L});
	public static final BitSet FOLLOW_WS_in_list1343 = new BitSet(new long[]{0x0080001000000000L});
	public static final BitSet FOLLOW_55_in_list1346 = new BitSet(new long[]{0x010000D420000000L});
	public static final BitSet FOLLOW_lExpr_in_list1348 = new BitSet(new long[]{0x0000009000000000L});
	public static final BitSet FOLLOW_WS_in_list1351 = new BitSet(new long[]{0x0000009000000000L});
	public static final BitSet FOLLOW_39_in_list1354 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_hd1370 = new BitSet(new long[]{0x0010001000000000L});
	public static final BitSet FOLLOW_WS_in_hd1371 = new BitSet(new long[]{0x0010001000000000L});
	public static final BitSet FOLLOW_52_in_hd1374 = new BitSet(new long[]{0x0100004420000000L});
	public static final BitSet FOLLOW_exprBase_in_hd1376 = new BitSet(new long[]{0x0000009000000000L});
	public static final BitSet FOLLOW_WS_in_hd1378 = new BitSet(new long[]{0x0000009000000000L});
	public static final BitSet FOLLOW_39_in_hd1380 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_tl1396 = new BitSet(new long[]{0x4000001000000000L});
	public static final BitSet FOLLOW_WS_in_tl1398 = new BitSet(new long[]{0x4000001000000000L});
	public static final BitSet FOLLOW_62_in_tl1400 = new BitSet(new long[]{0x0100004420000000L});
	public static final BitSet FOLLOW_exprBase_in_tl1402 = new BitSet(new long[]{0x0000009000000000L});
	public static final BitSet FOLLOW_WS_in_tl1404 = new BitSet(new long[]{0x0000009000000000L});
	public static final BitSet FOLLOW_39_in_tl1406 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_symbolExpr1423 = new BitSet(new long[]{0x0000001020000000L});
	public static final BitSet FOLLOW_WS_in_symbolExpr1425 = new BitSet(new long[]{0x0000001020000000L});
	public static final BitSet FOLLOW_Symbol_in_symbolExpr1428 = new BitSet(new long[]{0x010000D420000000L});
	public static final BitSet FOLLOW_WS_in_symbolExpr1430 = new BitSet(new long[]{0x010000D420000000L});
	public static final BitSet FOLLOW_lExpr_in_symbolExpr1433 = new BitSet(new long[]{0x0000009000000000L});
	public static final BitSet FOLLOW_WS_in_symbolExpr1436 = new BitSet(new long[]{0x0000009000000000L});
	public static final BitSet FOLLOW_39_in_symbolExpr1438 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_notVar1459 = new BitSet(new long[]{0x0400001000000000L});
	public static final BitSet FOLLOW_WS_in_notVar1460 = new BitSet(new long[]{0x0400001000000000L});
	public static final BitSet FOLLOW_58_in_notVar1462 = new BitSet(new long[]{0x0000001400000000L});
	public static final BitSet FOLLOW_WS_in_notVar1464 = new BitSet(new long[]{0x0000001400000000L});
	public static final BitSet FOLLOW_Variable_in_notVar1467 = new BitSet(new long[]{0x0000009000000000L});
	public static final BitSet FOLLOW_WS_in_notVar1469 = new BitSet(new long[]{0x0000009000000000L});
	public static final BitSet FOLLOW_39_in_notVar1471 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprBase_in_expression1492 = new BitSet(new long[]{0x0000101000000002L});
	public static final BitSet FOLLOW_WS_in_expression1495 = new BitSet(new long[]{0x0000101000000000L});
	public static final BitSet FOLLOW_44_in_expression1498 = new BitSet(new long[]{0x0100005420000000L});
	public static final BitSet FOLLOW_WS_in_expression1500 = new BitSet(new long[]{0x0100005420000000L});
	public static final BitSet FOLLOW_exprBase_in_expression1503 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprBase_in_lExpr1538 = new BitSet(new long[]{0x0100005420000002L});
	public static final BitSet FOLLOW_WS_in_lExpr1541 = new BitSet(new long[]{0x0100005420000000L});
	public static final BitSet FOLLOW_lExpr_in_lExpr1544 = new BitSet(new long[]{0x0000000000000002L});
}

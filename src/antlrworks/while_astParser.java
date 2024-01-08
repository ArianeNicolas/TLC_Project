package antlrworks;
// $ANTLR 3.5.1 C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g 2024-01-06 16:21:18

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class while_astParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "CONS", "Comment", 
		"DO", "Dec", "ELSE", "END", "EXPR", "EXPRBASE", "FOR", "FOREACH", "FUNCDEF", 
		"FUNCTION", "HD", "IF", "IN", "INPUTS", "LIST", "Maj", "Min", "OUTPUT", 
		"PROGRAM", "START", "Symbol", "THEN", "TL", "VARDEF", "VARIABLES", "Variable", 
		"WHILE", "WS", "'%'", "'('", "')'", "','", "':'", "':='", "';'", "'=?'", 
		"'cons '", "'do'", "'else'", "'fi'", "'for'", "'foreach'", "'function '", 
		"'hd '", "'if'", "'in'", "'list '", "'nil'", "'nop'", "'od'", "'read'", 
		"'then'", "'tl '", "'while'", "'write '"
	};
	public static final int EOF=-1;
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
	public static final int T__60=60;
	public static final int T__61=61;
	public static final int COMMENT=4;
	public static final int CONS=5;
	public static final int Comment=6;
	public static final int DO=7;
	public static final int Dec=8;
	public static final int ELSE=9;
	public static final int END=10;
	public static final int EXPR=11;
	public static final int EXPRBASE=12;
	public static final int FOR=13;
	public static final int FOREACH=14;
	public static final int FUNCDEF=15;
	public static final int FUNCTION=16;
	public static final int HD=17;
	public static final int IF=18;
	public static final int IN=19;
	public static final int INPUTS=20;
	public static final int LIST=21;
	public static final int Maj=22;
	public static final int Min=23;
	public static final int OUTPUT=24;
	public static final int PROGRAM=25;
	public static final int START=26;
	public static final int Symbol=27;
	public static final int THEN=28;
	public static final int TL=29;
	public static final int VARDEF=30;
	public static final int VARIABLES=31;
	public static final int Variable=32;
	public static final int WHILE=33;
	public static final int WS=34;

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:35:1: startProgram : program -> ^( START program ) ;
	public final while_astParser.startProgram_return startProgram() throws RecognitionException {
		while_astParser.startProgram_return retval = new while_astParser.startProgram_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope program1 =null;

		RewriteRuleSubtreeStream stream_program=new RewriteRuleSubtreeStream(adaptor,"rule program");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:36:5: ( program -> ^( START program ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:36:7: program
			{
			pushFollow(FOLLOW_program_in_startProgram208);
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
			// 36:15: -> ^( START program )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:36:18: ^( START program )
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:49:1: getComment : Comment -> ^( COMMENT Comment ) ;
	public final while_astParser.getComment_return getComment() throws RecognitionException {
		while_astParser.getComment_return retval = new while_astParser.getComment_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Comment2=null;

		Object Comment2_tree=null;
		RewriteRuleTokenStream stream_Comment=new RewriteRuleTokenStream(adaptor,"token Comment");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:50:2: ( Comment -> ^( COMMENT Comment ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:50:4: Comment
			{
			Comment2=(Token)match(input,Comment,FOLLOW_Comment_in_getComment387);  
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
			// 50:12: -> ^( COMMENT Comment )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:50:15: ^( COMMENT Comment )
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


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:52:1: program : function ( program )? -> ^( PROGRAM function ( program )? ) ;
	public final while_astParser.program_return program() throws RecognitionException {
		while_astParser.program_return retval = new while_astParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope function3 =null;
		ParserRuleReturnScope program4 =null;

		RewriteRuleSubtreeStream stream_function=new RewriteRuleSubtreeStream(adaptor,"rule function");
		RewriteRuleSubtreeStream stream_program=new RewriteRuleSubtreeStream(adaptor,"rule program");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:53:5: ( function ( program )? -> ^( PROGRAM function ( program )? ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:53:7: function ( program )?
			{
			pushFollow(FOLLOW_function_in_program407);
			function3=function();
			state._fsp--;

			stream_function.add(function3.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:53:16: ( program )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==Comment||LA1_0==49) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:53:16: program
					{
					pushFollow(FOLLOW_program_in_program409);
					program4=program();
					state._fsp--;

					stream_program.add(program4.getTree());
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
			// 53:25: -> ^( PROGRAM function ( program )? )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:53:28: ^( PROGRAM function ( program )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);
				adaptor.addChild(root_1, stream_function.nextTree());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:53:47: ( program )?
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:56:1: function : ( getComment )? 'function ' Symbol ( WS )* ':' ( getComment )? ( WS )* definition -> ^( FUNCDEF Symbol definition ( getComment )? END ) ;
	public final while_astParser.function_return function() throws RecognitionException {
		while_astParser.function_return retval = new while_astParser.function_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal6=null;
		Token Symbol7=null;
		Token WS8=null;
		Token char_literal9=null;
		Token WS11=null;
		ParserRuleReturnScope getComment5 =null;
		ParserRuleReturnScope getComment10 =null;
		ParserRuleReturnScope definition12 =null;

		Object string_literal6_tree=null;
		Object Symbol7_tree=null;
		Object WS8_tree=null;
		Object char_literal9_tree=null;
		Object WS11_tree=null;
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_Symbol=new RewriteRuleTokenStream(adaptor,"token Symbol");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");
		RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"rule definition");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:57:5: ( ( getComment )? 'function ' Symbol ( WS )* ':' ( getComment )? ( WS )* definition -> ^( FUNCDEF Symbol definition ( getComment )? END ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:57:7: ( getComment )? 'function ' Symbol ( WS )* ':' ( getComment )? ( WS )* definition
			{
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:57:7: ( getComment )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==Comment) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:57:7: getComment
					{
					pushFollow(FOLLOW_getComment_in_function439);
					getComment5=getComment();
					state._fsp--;

					stream_getComment.add(getComment5.getTree());
					}
					break;

			}

			string_literal6=(Token)match(input,49,FOLLOW_49_in_function442);  
			stream_49.add(string_literal6);

			Symbol7=(Token)match(input,Symbol,FOLLOW_Symbol_in_function444);  
			stream_Symbol.add(Symbol7);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:57:38: ( WS )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==WS) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:57:38: WS
					{
					WS8=(Token)match(input,WS,FOLLOW_WS_in_function446);  
					stream_WS.add(WS8);

					}
					break;

				default :
					break loop3;
				}
			}

			char_literal9=(Token)match(input,39,FOLLOW_39_in_function449);  
			stream_39.add(char_literal9);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:57:46: ( getComment )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==Comment) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:57:46: getComment
					{
					pushFollow(FOLLOW_getComment_in_function451);
					getComment10=getComment();
					state._fsp--;

					stream_getComment.add(getComment10.getTree());
					}
					break;

			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:57:58: ( WS )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==WS) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:57:58: WS
					{
					WS11=(Token)match(input,WS,FOLLOW_WS_in_function454);  
					stream_WS.add(WS11);

					}
					break;

				default :
					break loop5;
				}
			}

			pushFollow(FOLLOW_definition_in_function457);
			definition12=definition();
			state._fsp--;

			stream_definition.add(definition12.getTree());
			// AST REWRITE
			// elements: Symbol, definition, getComment
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 57:73: -> ^( FUNCDEF Symbol definition ( getComment )? END )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:57:76: ^( FUNCDEF Symbol definition ( getComment )? END )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCDEF, "FUNCDEF"), root_1);
				adaptor.addChild(root_1, stream_Symbol.nextNode());
				adaptor.addChild(root_1, stream_definition.nextTree());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:57:104: ( getComment )?
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:60:1: definition : 'read' ( WS )* input '%' ( getComment )? ( WS )* commands ( WS )* '%' ( getComment )? ( WS )* 'write ' output ( getComment )? -> ^( FUNCTION input commands output ( getComment )? ) ;
	public final while_astParser.definition_return definition() throws RecognitionException {
		while_astParser.definition_return retval = new while_astParser.definition_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal13=null;
		Token WS14=null;
		Token char_literal16=null;
		Token WS18=null;
		Token WS20=null;
		Token char_literal21=null;
		Token WS23=null;
		Token string_literal24=null;
		ParserRuleReturnScope input15 =null;
		ParserRuleReturnScope getComment17 =null;
		ParserRuleReturnScope commands19 =null;
		ParserRuleReturnScope getComment22 =null;
		ParserRuleReturnScope output25 =null;
		ParserRuleReturnScope getComment26 =null;

		Object string_literal13_tree=null;
		Object WS14_tree=null;
		Object char_literal16_tree=null;
		Object WS18_tree=null;
		Object WS20_tree=null;
		Object char_literal21_tree=null;
		Object WS23_tree=null;
		Object string_literal24_tree=null;
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");
		RewriteRuleSubtreeStream stream_input=new RewriteRuleSubtreeStream(adaptor,"rule input");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:61:5: ( 'read' ( WS )* input '%' ( getComment )? ( WS )* commands ( WS )* '%' ( getComment )? ( WS )* 'write ' output ( getComment )? -> ^( FUNCTION input commands output ( getComment )? ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:61:7: 'read' ( WS )* input '%' ( getComment )? ( WS )* commands ( WS )* '%' ( getComment )? ( WS )* 'write ' output ( getComment )?
			{
			string_literal13=(Token)match(input,57,FOLLOW_57_in_definition490);  
			stream_57.add(string_literal13);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:61:14: ( WS )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==WS) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:61:14: WS
					{
					WS14=(Token)match(input,WS,FOLLOW_WS_in_definition492);  
					stream_WS.add(WS14);

					}
					break;

				default :
					break loop6;
				}
			}

			pushFollow(FOLLOW_input_in_definition495);
			input15=input();
			state._fsp--;

			stream_input.add(input15.getTree());
			char_literal16=(Token)match(input,35,FOLLOW_35_in_definition497);  
			stream_35.add(char_literal16);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:61:28: ( getComment )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==Comment) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:61:28: getComment
					{
					pushFollow(FOLLOW_getComment_in_definition499);
					getComment17=getComment();
					state._fsp--;

					stream_getComment.add(getComment17.getTree());
					}
					break;

			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:61:40: ( WS )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==WS) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:61:40: WS
					{
					WS18=(Token)match(input,WS,FOLLOW_WS_in_definition502);  
					stream_WS.add(WS18);

					}
					break;

				default :
					break loop8;
				}
			}

			pushFollow(FOLLOW_commands_in_definition505);
			commands19=commands();
			state._fsp--;

			stream_commands.add(commands19.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:61:53: ( WS )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==WS) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:61:53: WS
					{
					WS20=(Token)match(input,WS,FOLLOW_WS_in_definition507);  
					stream_WS.add(WS20);

					}
					break;

				default :
					break loop9;
				}
			}

			char_literal21=(Token)match(input,35,FOLLOW_35_in_definition510);  
			stream_35.add(char_literal21);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:61:61: ( getComment )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==Comment) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:61:61: getComment
					{
					pushFollow(FOLLOW_getComment_in_definition512);
					getComment22=getComment();
					state._fsp--;

					stream_getComment.add(getComment22.getTree());
					}
					break;

			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:61:73: ( WS )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==WS) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:61:73: WS
					{
					WS23=(Token)match(input,WS,FOLLOW_WS_in_definition515);  
					stream_WS.add(WS23);

					}
					break;

				default :
					break loop11;
				}
			}

			string_literal24=(Token)match(input,61,FOLLOW_61_in_definition518);  
			stream_61.add(string_literal24);

			pushFollow(FOLLOW_output_in_definition520);
			output25=output();
			state._fsp--;

			stream_output.add(output25.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:61:93: ( getComment )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==Comment) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:61:93: getComment
					{
					pushFollow(FOLLOW_getComment_in_definition522);
					getComment26=getComment();
					state._fsp--;

					stream_getComment.add(getComment26.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: output, input, commands, getComment
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 61:104: -> ^( FUNCTION input commands output ( getComment )? )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:61:107: ^( FUNCTION input commands output ( getComment )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION, "FUNCTION"), root_1);
				adaptor.addChild(root_1, stream_input.nextTree());
				adaptor.addChild(root_1, stream_commands.nextTree());
				adaptor.addChild(root_1, stream_output.nextTree());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:61:140: ( getComment )?
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:64:1: input : ( inputSub )? ( getComment )? -> ^( INPUTS ( inputSub )? ( getComment )? ) ;
	public final while_astParser.input_return input() throws RecognitionException {
		while_astParser.input_return retval = new while_astParser.input_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope inputSub27 =null;
		ParserRuleReturnScope getComment28 =null;

		RewriteRuleSubtreeStream stream_inputSub=new RewriteRuleSubtreeStream(adaptor,"rule inputSub");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:65:5: ( ( inputSub )? ( getComment )? -> ^( INPUTS ( inputSub )? ( getComment )? ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:65:7: ( inputSub )? ( getComment )?
			{
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:65:7: ( inputSub )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==Variable) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:65:7: inputSub
					{
					pushFollow(FOLLOW_inputSub_in_input554);
					inputSub27=inputSub();
					state._fsp--;

					stream_inputSub.add(inputSub27.getTree());
					}
					break;

			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:65:17: ( getComment )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==Comment) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:65:17: getComment
					{
					pushFollow(FOLLOW_getComment_in_input557);
					getComment28=getComment();
					state._fsp--;

					stream_getComment.add(getComment28.getTree());
					}
					break;

			}

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
			// 65:29: -> ^( INPUTS ( inputSub )? ( getComment )? )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:65:33: ^( INPUTS ( inputSub )? ( getComment )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INPUTS, "INPUTS"), root_1);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:65:42: ( inputSub )?
				if ( stream_inputSub.hasNext() ) {
					adaptor.addChild(root_1, stream_inputSub.nextTree());
				}
				stream_inputSub.reset();

				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:65:52: ( getComment )?
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:68:1: inputSub : Variable ( WS )* ( ',' ( WS )* inputSub )? -> Variable ( inputSub )? ;
	public final while_astParser.inputSub_return inputSub() throws RecognitionException {
		while_astParser.inputSub_return retval = new while_astParser.inputSub_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Variable29=null;
		Token WS30=null;
		Token char_literal31=null;
		Token WS32=null;
		ParserRuleReturnScope inputSub33 =null;

		Object Variable29_tree=null;
		Object WS30_tree=null;
		Object char_literal31_tree=null;
		Object WS32_tree=null;
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_inputSub=new RewriteRuleSubtreeStream(adaptor,"rule inputSub");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:69:5: ( Variable ( WS )* ( ',' ( WS )* inputSub )? -> Variable ( inputSub )? )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:69:7: Variable ( WS )* ( ',' ( WS )* inputSub )?
			{
			Variable29=(Token)match(input,Variable,FOLLOW_Variable_in_inputSub588);  
			stream_Variable.add(Variable29);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:69:16: ( WS )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==WS) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:69:16: WS
					{
					WS30=(Token)match(input,WS,FOLLOW_WS_in_inputSub590);  
					stream_WS.add(WS30);

					}
					break;

				default :
					break loop15;
				}
			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:69:20: ( ',' ( WS )* inputSub )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==38) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:69:21: ',' ( WS )* inputSub
					{
					char_literal31=(Token)match(input,38,FOLLOW_38_in_inputSub594);  
					stream_38.add(char_literal31);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:69:25: ( WS )*
					loop16:
					while (true) {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( (LA16_0==WS) ) {
							alt16=1;
						}

						switch (alt16) {
						case 1 :
							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:69:25: WS
							{
							WS32=(Token)match(input,WS,FOLLOW_WS_in_inputSub596);  
							stream_WS.add(WS32);

							}
							break;

						default :
							break loop16;
						}
					}

					pushFollow(FOLLOW_inputSub_in_inputSub599);
					inputSub33=inputSub();
					state._fsp--;

					stream_inputSub.add(inputSub33.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: Variable, inputSub
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 69:40: -> Variable ( inputSub )?
			{
				adaptor.addChild(root_0, stream_Variable.nextNode());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:69:52: ( inputSub )?
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:72:1: output : Variable ( ',' output )? -> ^( OUTPUT Variable ( output )? ) ;
	public final while_astParser.output_return output() throws RecognitionException {
		while_astParser.output_return retval = new while_astParser.output_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Variable34=null;
		Token char_literal35=null;
		ParserRuleReturnScope output36 =null;

		Object Variable34_tree=null;
		Object char_literal35_tree=null;
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:73:5: ( Variable ( ',' output )? -> ^( OUTPUT Variable ( output )? ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:73:7: Variable ( ',' output )?
			{
			Variable34=(Token)match(input,Variable,FOLLOW_Variable_in_output626);  
			stream_Variable.add(Variable34);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:73:16: ( ',' output )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==38) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:73:17: ',' output
					{
					char_literal35=(Token)match(input,38,FOLLOW_38_in_output629);  
					stream_38.add(char_literal35);

					pushFollow(FOLLOW_output_in_output631);
					output36=output();
					state._fsp--;

					stream_output.add(output36.getTree());
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
			// 73:30: -> ^( OUTPUT Variable ( output )? )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:73:33: ^( OUTPUT Variable ( output )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OUTPUT, "OUTPUT"), root_1);
				adaptor.addChild(root_1, stream_Variable.nextNode());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:73:51: ( output )?
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:76:1: commands : command ( ( WS )* ';' ( WS )* commands )? -> command ( commands )? ;
	public final while_astParser.commands_return commands() throws RecognitionException {
		while_astParser.commands_return retval = new while_astParser.commands_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WS38=null;
		Token char_literal39=null;
		Token WS40=null;
		ParserRuleReturnScope command37 =null;
		ParserRuleReturnScope commands41 =null;

		Object WS38_tree=null;
		Object char_literal39_tree=null;
		Object WS40_tree=null;
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleSubtreeStream stream_command=new RewriteRuleSubtreeStream(adaptor,"rule command");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:77:5: ( command ( ( WS )* ';' ( WS )* commands )? -> command ( commands )? )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:77:7: command ( ( WS )* ';' ( WS )* commands )?
			{
			pushFollow(FOLLOW_command_in_commands661);
			command37=command();
			state._fsp--;

			stream_command.add(command37.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:77:15: ( ( WS )* ';' ( WS )* commands )?
			int alt21=2;
			alt21 = dfa21.predict(input);
			switch (alt21) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:77:17: ( WS )* ';' ( WS )* commands
					{
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:77:17: ( WS )*
					loop19:
					while (true) {
						int alt19=2;
						int LA19_0 = input.LA(1);
						if ( (LA19_0==WS) ) {
							alt19=1;
						}

						switch (alt19) {
						case 1 :
							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:77:17: WS
							{
							WS38=(Token)match(input,WS,FOLLOW_WS_in_commands665);  
							stream_WS.add(WS38);

							}
							break;

						default :
							break loop19;
						}
					}

					char_literal39=(Token)match(input,41,FOLLOW_41_in_commands668);  
					stream_41.add(char_literal39);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:77:25: ( WS )*
					loop20:
					while (true) {
						int alt20=2;
						int LA20_0 = input.LA(1);
						if ( (LA20_0==WS) ) {
							alt20=1;
						}

						switch (alt20) {
						case 1 :
							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:77:25: WS
							{
							WS40=(Token)match(input,WS,FOLLOW_WS_in_commands670);  
							stream_WS.add(WS40);

							}
							break;

						default :
							break loop20;
						}
					}

					pushFollow(FOLLOW_commands_in_commands673);
					commands41=commands();
					state._fsp--;

					stream_commands.add(commands41.getTree());
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
			// 77:40: -> command ( commands )?
			{
				adaptor.addChild(root_0, stream_command.nextTree());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:77:51: ( commands )?
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:80:1: command : ( 'nop' | decl | if_ | for_ | while_ | foreach_ );
	public final while_astParser.command_return command() throws RecognitionException {
		while_astParser.command_return retval = new while_astParser.command_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal42=null;
		ParserRuleReturnScope decl43 =null;
		ParserRuleReturnScope if_44 =null;
		ParserRuleReturnScope for_45 =null;
		ParserRuleReturnScope while_46 =null;
		ParserRuleReturnScope foreach_47 =null;

		Object string_literal42_tree=null;

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:81:5: ( 'nop' | decl | if_ | for_ | while_ | foreach_ )
			int alt22=6;
			switch ( input.LA(1) ) {
			case 55:
				{
				alt22=1;
				}
				break;
			case Variable:
				{
				alt22=2;
				}
				break;
			case 51:
				{
				alt22=3;
				}
				break;
			case 47:
				{
				alt22=4;
				}
				break;
			case 60:
				{
				alt22=5;
				}
				break;
			case 48:
				{
				alt22=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}
			switch (alt22) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:81:7: 'nop'
					{
					root_0 = (Object)adaptor.nil();


					string_literal42=(Token)match(input,55,FOLLOW_55_in_command700); 
					string_literal42_tree = (Object)adaptor.create(string_literal42);
					adaptor.addChild(root_0, string_literal42_tree);

					}
					break;
				case 2 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:81:15: decl
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_decl_in_command704);
					decl43=decl();
					state._fsp--;

					adaptor.addChild(root_0, decl43.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:81:22: if_
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_if__in_command708);
					if_44=if_();
					state._fsp--;

					adaptor.addChild(root_0, if_44.getTree());

					}
					break;
				case 4 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:81:28: for_
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_for__in_command712);
					for_45=for_();
					state._fsp--;

					adaptor.addChild(root_0, for_45.getTree());

					}
					break;
				case 5 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:81:35: while_
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_while__in_command716);
					while_46=while_();
					state._fsp--;

					adaptor.addChild(root_0, while_46.getTree());

					}
					break;
				case 6 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:81:44: foreach_
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_foreach__in_command720);
					foreach_47=foreach_();
					state._fsp--;

					adaptor.addChild(root_0, foreach_47.getTree());

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:83:1: decl : ( vars ( WS )* ':=' ( WS )* exprs ) ( getComment )? -> ^( VARDEF vars exprs ( getComment )? ) ;
	public final while_astParser.decl_return decl() throws RecognitionException {
		while_astParser.decl_return retval = new while_astParser.decl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WS49=null;
		Token string_literal50=null;
		Token WS51=null;
		ParserRuleReturnScope vars48 =null;
		ParserRuleReturnScope exprs52 =null;
		ParserRuleReturnScope getComment53 =null;

		Object WS49_tree=null;
		Object string_literal50_tree=null;
		Object WS51_tree=null;
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");
		RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:84:5: ( ( vars ( WS )* ':=' ( WS )* exprs ) ( getComment )? -> ^( VARDEF vars exprs ( getComment )? ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:84:7: ( vars ( WS )* ':=' ( WS )* exprs ) ( getComment )?
			{
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:84:7: ( vars ( WS )* ':=' ( WS )* exprs )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:84:8: vars ( WS )* ':=' ( WS )* exprs
			{
			pushFollow(FOLLOW_vars_in_decl734);
			vars48=vars();
			state._fsp--;

			stream_vars.add(vars48.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:84:13: ( WS )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==WS) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:84:13: WS
					{
					WS49=(Token)match(input,WS,FOLLOW_WS_in_decl736);  
					stream_WS.add(WS49);

					}
					break;

				default :
					break loop23;
				}
			}

			string_literal50=(Token)match(input,40,FOLLOW_40_in_decl739);  
			stream_40.add(string_literal50);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:84:22: ( WS )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==WS) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:84:22: WS
					{
					WS51=(Token)match(input,WS,FOLLOW_WS_in_decl741);  
					stream_WS.add(WS51);

					}
					break;

				default :
					break loop24;
				}
			}

			pushFollow(FOLLOW_exprs_in_decl744);
			exprs52=exprs();
			state._fsp--;

			stream_exprs.add(exprs52.getTree());
			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:84:33: ( getComment )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==Comment) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:84:33: getComment
					{
					pushFollow(FOLLOW_getComment_in_decl747);
					getComment53=getComment();
					state._fsp--;

					stream_getComment.add(getComment53.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: exprs, vars, getComment
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 84:45: -> ^( VARDEF vars exprs ( getComment )? )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:84:48: ^( VARDEF vars exprs ( getComment )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARDEF, "VARDEF"), root_1);
				adaptor.addChild(root_1, stream_vars.nextTree());
				adaptor.addChild(root_1, stream_exprs.nextTree());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:84:68: ( getComment )?
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:87:1: if_ : ( 'if' ( WS )* expression ( WS )* then_ ( WS )* ( else_ ( WS )* )? 'fi' ( getComment )? ) -> ^( IF expression then_ ( else_ )? ( getComment )? END ) ;
	public final while_astParser.if__return if_() throws RecognitionException {
		while_astParser.if__return retval = new while_astParser.if__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal54=null;
		Token WS55=null;
		Token WS57=null;
		Token WS59=null;
		Token WS61=null;
		Token string_literal62=null;
		ParserRuleReturnScope expression56 =null;
		ParserRuleReturnScope then_58 =null;
		ParserRuleReturnScope else_60 =null;
		ParserRuleReturnScope getComment63 =null;

		Object string_literal54_tree=null;
		Object WS55_tree=null;
		Object WS57_tree=null;
		Object WS59_tree=null;
		Object WS61_tree=null;
		Object string_literal62_tree=null;
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_then_=new RewriteRuleSubtreeStream(adaptor,"rule then_");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_else_=new RewriteRuleSubtreeStream(adaptor,"rule else_");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:88:5: ( ( 'if' ( WS )* expression ( WS )* then_ ( WS )* ( else_ ( WS )* )? 'fi' ( getComment )? ) -> ^( IF expression then_ ( else_ )? ( getComment )? END ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:88:7: ( 'if' ( WS )* expression ( WS )* then_ ( WS )* ( else_ ( WS )* )? 'fi' ( getComment )? )
			{
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:88:7: ( 'if' ( WS )* expression ( WS )* then_ ( WS )* ( else_ ( WS )* )? 'fi' ( getComment )? )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:88:8: 'if' ( WS )* expression ( WS )* then_ ( WS )* ( else_ ( WS )* )? 'fi' ( getComment )?
			{
			string_literal54=(Token)match(input,51,FOLLOW_51_in_if_781);  
			stream_51.add(string_literal54);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:88:13: ( WS )*
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==WS) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:88:13: WS
					{
					WS55=(Token)match(input,WS,FOLLOW_WS_in_if_783);  
					stream_WS.add(WS55);

					}
					break;

				default :
					break loop26;
				}
			}

			pushFollow(FOLLOW_expression_in_if_786);
			expression56=expression();
			state._fsp--;

			stream_expression.add(expression56.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:88:28: ( WS )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==WS) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:88:28: WS
					{
					WS57=(Token)match(input,WS,FOLLOW_WS_in_if_788);  
					stream_WS.add(WS57);

					}
					break;

				default :
					break loop27;
				}
			}

			pushFollow(FOLLOW_then__in_if_791);
			then_58=then_();
			state._fsp--;

			stream_then_.add(then_58.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:88:38: ( WS )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==WS) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:88:38: WS
					{
					WS59=(Token)match(input,WS,FOLLOW_WS_in_if_793);  
					stream_WS.add(WS59);

					}
					break;

				default :
					break loop28;
				}
			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:88:42: ( else_ ( WS )* )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==45) ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:88:43: else_ ( WS )*
					{
					pushFollow(FOLLOW_else__in_if_797);
					else_60=else_();
					state._fsp--;

					stream_else_.add(else_60.getTree());
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:88:49: ( WS )*
					loop29:
					while (true) {
						int alt29=2;
						int LA29_0 = input.LA(1);
						if ( (LA29_0==WS) ) {
							alt29=1;
						}

						switch (alt29) {
						case 1 :
							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:88:49: WS
							{
							WS61=(Token)match(input,WS,FOLLOW_WS_in_if_799);  
							stream_WS.add(WS61);

							}
							break;

						default :
							break loop29;
						}
					}

					}
					break;

			}

			string_literal62=(Token)match(input,46,FOLLOW_46_in_if_804);  
			stream_46.add(string_literal62);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:88:60: ( getComment )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==Comment) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:88:60: getComment
					{
					pushFollow(FOLLOW_getComment_in_if_806);
					getComment63=getComment();
					state._fsp--;

					stream_getComment.add(getComment63.getTree());
					}
					break;

			}

			}

			// AST REWRITE
			// elements: expression, else_, getComment, then_
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 88:73: -> ^( IF expression then_ ( else_ )? ( getComment )? END )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:88:76: ^( IF expression then_ ( else_ )? ( getComment )? END )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_1, stream_then_.nextTree());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:88:98: ( else_ )?
				if ( stream_else_.hasNext() ) {
					adaptor.addChild(root_1, stream_else_.nextTree());
				}
				stream_else_.reset();

				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:88:105: ( getComment )?
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:91:1: then_ : 'then' ( getComment )? ( WS )* commands -> ^( THEN commands ( getComment )? ) ;
	public final while_astParser.then__return then_() throws RecognitionException {
		while_astParser.then__return retval = new while_astParser.then__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal64=null;
		Token WS66=null;
		ParserRuleReturnScope getComment65 =null;
		ParserRuleReturnScope commands67 =null;

		Object string_literal64_tree=null;
		Object WS66_tree=null;
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:91:7: ( 'then' ( getComment )? ( WS )* commands -> ^( THEN commands ( getComment )? ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:91:9: 'then' ( getComment )? ( WS )* commands
			{
			string_literal64=(Token)match(input,58,FOLLOW_58_in_then_844);  
			stream_58.add(string_literal64);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:91:16: ( getComment )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==Comment) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:91:16: getComment
					{
					pushFollow(FOLLOW_getComment_in_then_846);
					getComment65=getComment();
					state._fsp--;

					stream_getComment.add(getComment65.getTree());
					}
					break;

			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:91:28: ( WS )*
			loop33:
			while (true) {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==WS) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:91:28: WS
					{
					WS66=(Token)match(input,WS,FOLLOW_WS_in_then_849);  
					stream_WS.add(WS66);

					}
					break;

				default :
					break loop33;
				}
			}

			pushFollow(FOLLOW_commands_in_then_852);
			commands67=commands();
			state._fsp--;

			stream_commands.add(commands67.getTree());
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
			// 91:41: -> ^( THEN commands ( getComment )? )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:91:44: ^( THEN commands ( getComment )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(THEN, "THEN"), root_1);
				adaptor.addChild(root_1, stream_commands.nextTree());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:91:60: ( getComment )?
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:93:1: else_ : 'else' ( getComment )? ( WS )* commands -> ^( ELSE commands ( getComment )? ) ;
	public final while_astParser.else__return else_() throws RecognitionException {
		while_astParser.else__return retval = new while_astParser.else__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal68=null;
		Token WS70=null;
		ParserRuleReturnScope getComment69 =null;
		ParserRuleReturnScope commands71 =null;

		Object string_literal68_tree=null;
		Object WS70_tree=null;
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:93:7: ( 'else' ( getComment )? ( WS )* commands -> ^( ELSE commands ( getComment )? ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:93:9: 'else' ( getComment )? ( WS )* commands
			{
			string_literal68=(Token)match(input,45,FOLLOW_45_in_else_872);  
			stream_45.add(string_literal68);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:93:16: ( getComment )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==Comment) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:93:16: getComment
					{
					pushFollow(FOLLOW_getComment_in_else_874);
					getComment69=getComment();
					state._fsp--;

					stream_getComment.add(getComment69.getTree());
					}
					break;

			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:93:28: ( WS )*
			loop35:
			while (true) {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==WS) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:93:28: WS
					{
					WS70=(Token)match(input,WS,FOLLOW_WS_in_else_877);  
					stream_WS.add(WS70);

					}
					break;

				default :
					break loop35;
				}
			}

			pushFollow(FOLLOW_commands_in_else_880);
			commands71=commands();
			state._fsp--;

			stream_commands.add(commands71.getTree());
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
			// 93:41: -> ^( ELSE commands ( getComment )? )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:93:44: ^( ELSE commands ( getComment )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ELSE, "ELSE"), root_1);
				adaptor.addChild(root_1, stream_commands.nextTree());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:93:60: ( getComment )?
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:95:1: while_ : ( 'while' ( WS )* expression ( getComment )? ( WS )* do_ ) -> ^( WHILE expression ( getComment )? do_ END ) ;
	public final while_astParser.while__return while_() throws RecognitionException {
		while_astParser.while__return retval = new while_astParser.while__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal72=null;
		Token WS73=null;
		Token WS76=null;
		ParserRuleReturnScope expression74 =null;
		ParserRuleReturnScope getComment75 =null;
		ParserRuleReturnScope do_77 =null;

		Object string_literal72_tree=null;
		Object WS73_tree=null;
		Object WS76_tree=null;
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_do_=new RewriteRuleSubtreeStream(adaptor,"rule do_");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:96:5: ( ( 'while' ( WS )* expression ( getComment )? ( WS )* do_ ) -> ^( WHILE expression ( getComment )? do_ END ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:96:7: ( 'while' ( WS )* expression ( getComment )? ( WS )* do_ )
			{
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:96:7: ( 'while' ( WS )* expression ( getComment )? ( WS )* do_ )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:96:8: 'while' ( WS )* expression ( getComment )? ( WS )* do_
			{
			string_literal72=(Token)match(input,60,FOLLOW_60_in_while_906);  
			stream_60.add(string_literal72);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:96:16: ( WS )*
			loop36:
			while (true) {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( (LA36_0==WS) ) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:96:16: WS
					{
					WS73=(Token)match(input,WS,FOLLOW_WS_in_while_908);  
					stream_WS.add(WS73);

					}
					break;

				default :
					break loop36;
				}
			}

			pushFollow(FOLLOW_expression_in_while_911);
			expression74=expression();
			state._fsp--;

			stream_expression.add(expression74.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:96:31: ( getComment )?
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==Comment) ) {
				alt37=1;
			}
			switch (alt37) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:96:31: getComment
					{
					pushFollow(FOLLOW_getComment_in_while_913);
					getComment75=getComment();
					state._fsp--;

					stream_getComment.add(getComment75.getTree());
					}
					break;

			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:96:43: ( WS )*
			loop38:
			while (true) {
				int alt38=2;
				int LA38_0 = input.LA(1);
				if ( (LA38_0==WS) ) {
					alt38=1;
				}

				switch (alt38) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:96:43: WS
					{
					WS76=(Token)match(input,WS,FOLLOW_WS_in_while_916);  
					stream_WS.add(WS76);

					}
					break;

				default :
					break loop38;
				}
			}

			pushFollow(FOLLOW_do__in_while_919);
			do_77=do_();
			state._fsp--;

			stream_do_.add(do_77.getTree());
			}

			// AST REWRITE
			// elements: expression, getComment, do_
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 96:52: -> ^( WHILE expression ( getComment )? do_ END )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:96:55: ^( WHILE expression ( getComment )? do_ END )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WHILE, "WHILE"), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:96:74: ( getComment )?
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:1: do_ : 'do' ( getComment )? ( WS )* commands ( WS )* 'od' ( getComment )? -> ^( DO commands ( getComment )? ) ;
	public final while_astParser.do__return do_() throws RecognitionException {
		while_astParser.do__return retval = new while_astParser.do__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal78=null;
		Token WS80=null;
		Token WS82=null;
		Token string_literal83=null;
		ParserRuleReturnScope getComment79 =null;
		ParserRuleReturnScope commands81 =null;
		ParserRuleReturnScope getComment84 =null;

		Object string_literal78_tree=null;
		Object WS80_tree=null;
		Object WS82_tree=null;
		Object string_literal83_tree=null;
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:6: ( 'do' ( getComment )? ( WS )* commands ( WS )* 'od' ( getComment )? -> ^( DO commands ( getComment )? ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:8: 'do' ( getComment )? ( WS )* commands ( WS )* 'od' ( getComment )?
			{
			string_literal78=(Token)match(input,44,FOLLOW_44_in_do_953);  
			stream_44.add(string_literal78);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:13: ( getComment )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==Comment) ) {
				alt39=1;
			}
			switch (alt39) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:13: getComment
					{
					pushFollow(FOLLOW_getComment_in_do_955);
					getComment79=getComment();
					state._fsp--;

					stream_getComment.add(getComment79.getTree());
					}
					break;

			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:25: ( WS )*
			loop40:
			while (true) {
				int alt40=2;
				int LA40_0 = input.LA(1);
				if ( (LA40_0==WS) ) {
					alt40=1;
				}

				switch (alt40) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:25: WS
					{
					WS80=(Token)match(input,WS,FOLLOW_WS_in_do_958);  
					stream_WS.add(WS80);

					}
					break;

				default :
					break loop40;
				}
			}

			pushFollow(FOLLOW_commands_in_do_961);
			commands81=commands();
			state._fsp--;

			stream_commands.add(commands81.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:38: ( WS )*
			loop41:
			while (true) {
				int alt41=2;
				int LA41_0 = input.LA(1);
				if ( (LA41_0==WS) ) {
					alt41=1;
				}

				switch (alt41) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:38: WS
					{
					WS82=(Token)match(input,WS,FOLLOW_WS_in_do_963);  
					stream_WS.add(WS82);

					}
					break;

				default :
					break loop41;
				}
			}

			string_literal83=(Token)match(input,56,FOLLOW_56_in_do_966);  
			stream_56.add(string_literal83);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:47: ( getComment )?
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0==Comment) ) {
				alt42=1;
			}
			switch (alt42) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:47: getComment
					{
					pushFollow(FOLLOW_getComment_in_do_968);
					getComment84=getComment();
					state._fsp--;

					stream_getComment.add(getComment84.getTree());
					}
					break;

			}

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
			// 99:59: -> ^( DO commands ( getComment )? )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:62: ^( DO commands ( getComment )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DO, "DO"), root_1);
				adaptor.addChild(root_1, stream_commands.nextTree());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:77: ( getComment )?
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:101:1: for_ : ( 'for' ( WS )* expression ( getComment )? ( WS )* do_ ) -> ^( FOR expression do_ END ) ;
	public final while_astParser.for__return for_() throws RecognitionException {
		while_astParser.for__return retval = new while_astParser.for__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal85=null;
		Token WS86=null;
		Token WS89=null;
		ParserRuleReturnScope expression87 =null;
		ParserRuleReturnScope getComment88 =null;
		ParserRuleReturnScope do_90 =null;

		Object string_literal85_tree=null;
		Object WS86_tree=null;
		Object WS89_tree=null;
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_do_=new RewriteRuleSubtreeStream(adaptor,"rule do_");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:102:5: ( ( 'for' ( WS )* expression ( getComment )? ( WS )* do_ ) -> ^( FOR expression do_ END ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:102:7: ( 'for' ( WS )* expression ( getComment )? ( WS )* do_ )
			{
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:102:7: ( 'for' ( WS )* expression ( getComment )? ( WS )* do_ )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:102:8: 'for' ( WS )* expression ( getComment )? ( WS )* do_
			{
			string_literal85=(Token)match(input,47,FOLLOW_47_in_for_994);  
			stream_47.add(string_literal85);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:102:14: ( WS )*
			loop43:
			while (true) {
				int alt43=2;
				int LA43_0 = input.LA(1);
				if ( (LA43_0==WS) ) {
					alt43=1;
				}

				switch (alt43) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:102:14: WS
					{
					WS86=(Token)match(input,WS,FOLLOW_WS_in_for_996);  
					stream_WS.add(WS86);

					}
					break;

				default :
					break loop43;
				}
			}

			pushFollow(FOLLOW_expression_in_for_999);
			expression87=expression();
			state._fsp--;

			stream_expression.add(expression87.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:102:29: ( getComment )?
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==Comment) ) {
				alt44=1;
			}
			switch (alt44) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:102:29: getComment
					{
					pushFollow(FOLLOW_getComment_in_for_1001);
					getComment88=getComment();
					state._fsp--;

					stream_getComment.add(getComment88.getTree());
					}
					break;

			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:102:41: ( WS )*
			loop45:
			while (true) {
				int alt45=2;
				int LA45_0 = input.LA(1);
				if ( (LA45_0==WS) ) {
					alt45=1;
				}

				switch (alt45) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:102:41: WS
					{
					WS89=(Token)match(input,WS,FOLLOW_WS_in_for_1004);  
					stream_WS.add(WS89);

					}
					break;

				default :
					break loop45;
				}
			}

			pushFollow(FOLLOW_do__in_for_1007);
			do_90=do_();
			state._fsp--;

			stream_do_.add(do_90.getTree());
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
			// 102:50: -> ^( FOR expression do_ END )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:102:53: ^( FOR expression do_ END )
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:105:1: foreach_ : ( 'foreach' ( WS )* Variable ( WS )* 'in' ( WS )* expression ( getComment )? ( WS )* do_ ) -> ^( FOREACH ^( IN Variable expression ) ( getComment )? do_ END ) ;
	public final while_astParser.foreach__return foreach_() throws RecognitionException {
		while_astParser.foreach__return retval = new while_astParser.foreach__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal91=null;
		Token WS92=null;
		Token Variable93=null;
		Token WS94=null;
		Token string_literal95=null;
		Token WS96=null;
		Token WS99=null;
		ParserRuleReturnScope expression97 =null;
		ParserRuleReturnScope getComment98 =null;
		ParserRuleReturnScope do_100 =null;

		Object string_literal91_tree=null;
		Object WS92_tree=null;
		Object Variable93_tree=null;
		Object WS94_tree=null;
		Object string_literal95_tree=null;
		Object WS96_tree=null;
		Object WS99_tree=null;
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_do_=new RewriteRuleSubtreeStream(adaptor,"rule do_");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:106:5: ( ( 'foreach' ( WS )* Variable ( WS )* 'in' ( WS )* expression ( getComment )? ( WS )* do_ ) -> ^( FOREACH ^( IN Variable expression ) ( getComment )? do_ END ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:106:7: ( 'foreach' ( WS )* Variable ( WS )* 'in' ( WS )* expression ( getComment )? ( WS )* do_ )
			{
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:106:7: ( 'foreach' ( WS )* Variable ( WS )* 'in' ( WS )* expression ( getComment )? ( WS )* do_ )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:106:8: 'foreach' ( WS )* Variable ( WS )* 'in' ( WS )* expression ( getComment )? ( WS )* do_
			{
			string_literal91=(Token)match(input,48,FOLLOW_48_in_foreach_1038);  
			stream_48.add(string_literal91);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:106:18: ( WS )*
			loop46:
			while (true) {
				int alt46=2;
				int LA46_0 = input.LA(1);
				if ( (LA46_0==WS) ) {
					alt46=1;
				}

				switch (alt46) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:106:18: WS
					{
					WS92=(Token)match(input,WS,FOLLOW_WS_in_foreach_1040);  
					stream_WS.add(WS92);

					}
					break;

				default :
					break loop46;
				}
			}

			Variable93=(Token)match(input,Variable,FOLLOW_Variable_in_foreach_1043);  
			stream_Variable.add(Variable93);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:106:31: ( WS )*
			loop47:
			while (true) {
				int alt47=2;
				int LA47_0 = input.LA(1);
				if ( (LA47_0==WS) ) {
					alt47=1;
				}

				switch (alt47) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:106:31: WS
					{
					WS94=(Token)match(input,WS,FOLLOW_WS_in_foreach_1045);  
					stream_WS.add(WS94);

					}
					break;

				default :
					break loop47;
				}
			}

			string_literal95=(Token)match(input,52,FOLLOW_52_in_foreach_1048);  
			stream_52.add(string_literal95);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:106:40: ( WS )*
			loop48:
			while (true) {
				int alt48=2;
				int LA48_0 = input.LA(1);
				if ( (LA48_0==WS) ) {
					alt48=1;
				}

				switch (alt48) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:106:40: WS
					{
					WS96=(Token)match(input,WS,FOLLOW_WS_in_foreach_1050);  
					stream_WS.add(WS96);

					}
					break;

				default :
					break loop48;
				}
			}

			pushFollow(FOLLOW_expression_in_foreach_1053);
			expression97=expression();
			state._fsp--;

			stream_expression.add(expression97.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:106:55: ( getComment )?
			int alt49=2;
			int LA49_0 = input.LA(1);
			if ( (LA49_0==Comment) ) {
				alt49=1;
			}
			switch (alt49) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:106:55: getComment
					{
					pushFollow(FOLLOW_getComment_in_foreach_1055);
					getComment98=getComment();
					state._fsp--;

					stream_getComment.add(getComment98.getTree());
					}
					break;

			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:106:67: ( WS )*
			loop50:
			while (true) {
				int alt50=2;
				int LA50_0 = input.LA(1);
				if ( (LA50_0==WS) ) {
					alt50=1;
				}

				switch (alt50) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:106:67: WS
					{
					WS99=(Token)match(input,WS,FOLLOW_WS_in_foreach_1058);  
					stream_WS.add(WS99);

					}
					break;

				default :
					break loop50;
				}
			}

			pushFollow(FOLLOW_do__in_foreach_1061);
			do_100=do_();
			state._fsp--;

			stream_do_.add(do_100.getTree());
			}

			// AST REWRITE
			// elements: getComment, do_, Variable, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 106:76: -> ^( FOREACH ^( IN Variable expression ) ( getComment )? do_ END )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:106:79: ^( FOREACH ^( IN Variable expression ) ( getComment )? do_ END )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOREACH, "FOREACH"), root_1);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:106:89: ^( IN Variable expression )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(IN, "IN"), root_2);
				adaptor.addChild(root_2, stream_Variable.nextNode());
				adaptor.addChild(root_2, stream_expression.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:106:115: ( getComment )?
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:109:1: vars : Variable ( ',' ( WS )* vars )? -> Variable ( vars )* ;
	public final while_astParser.vars_return vars() throws RecognitionException {
		while_astParser.vars_return retval = new while_astParser.vars_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Variable101=null;
		Token char_literal102=null;
		Token WS103=null;
		ParserRuleReturnScope vars104 =null;

		Object Variable101_tree=null;
		Object char_literal102_tree=null;
		Object WS103_tree=null;
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:110:5: ( Variable ( ',' ( WS )* vars )? -> Variable ( vars )* )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:110:7: Variable ( ',' ( WS )* vars )?
			{
			Variable101=(Token)match(input,Variable,FOLLOW_Variable_in_vars1100);  
			stream_Variable.add(Variable101);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:110:16: ( ',' ( WS )* vars )?
			int alt52=2;
			int LA52_0 = input.LA(1);
			if ( (LA52_0==38) ) {
				alt52=1;
			}
			switch (alt52) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:110:17: ',' ( WS )* vars
					{
					char_literal102=(Token)match(input,38,FOLLOW_38_in_vars1103);  
					stream_38.add(char_literal102);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:110:20: ( WS )*
					loop51:
					while (true) {
						int alt51=2;
						int LA51_0 = input.LA(1);
						if ( (LA51_0==WS) ) {
							alt51=1;
						}

						switch (alt51) {
						case 1 :
							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:110:20: WS
							{
							WS103=(Token)match(input,WS,FOLLOW_WS_in_vars1104);  
							stream_WS.add(WS103);

							}
							break;

						default :
							break loop51;
						}
					}

					pushFollow(FOLLOW_vars_in_vars1107);
					vars104=vars();
					state._fsp--;

					stream_vars.add(vars104.getTree());
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
			// 110:31: -> Variable ( vars )*
			{
				adaptor.addChild(root_0, stream_Variable.nextNode());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:110:43: ( vars )*
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:113:1: exprs : expression ( ',' ( WS )* exprs )? -> expression ( exprs )* ;
	public final while_astParser.exprs_return exprs() throws RecognitionException {
		while_astParser.exprs_return retval = new while_astParser.exprs_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal106=null;
		Token WS107=null;
		ParserRuleReturnScope expression105 =null;
		ParserRuleReturnScope exprs108 =null;

		Object char_literal106_tree=null;
		Object WS107_tree=null;
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:114:5: ( expression ( ',' ( WS )* exprs )? -> expression ( exprs )* )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:114:7: expression ( ',' ( WS )* exprs )?
			{
			pushFollow(FOLLOW_expression_in_exprs1133);
			expression105=expression();
			state._fsp--;

			stream_expression.add(expression105.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:114:18: ( ',' ( WS )* exprs )?
			int alt54=2;
			int LA54_0 = input.LA(1);
			if ( (LA54_0==38) ) {
				alt54=1;
			}
			switch (alt54) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:114:19: ',' ( WS )* exprs
					{
					char_literal106=(Token)match(input,38,FOLLOW_38_in_exprs1136);  
					stream_38.add(char_literal106);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:114:22: ( WS )*
					loop53:
					while (true) {
						int alt53=2;
						int LA53_0 = input.LA(1);
						if ( (LA53_0==WS) ) {
							alt53=1;
						}

						switch (alt53) {
						case 1 :
							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:114:22: WS
							{
							WS107=(Token)match(input,WS,FOLLOW_WS_in_exprs1137);  
							stream_WS.add(WS107);

							}
							break;

						default :
							break loop53;
						}
					}

					pushFollow(FOLLOW_exprs_in_exprs1140);
					exprs108=exprs();
					state._fsp--;

					stream_exprs.add(exprs108.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: expression, exprs
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 114:34: -> expression ( exprs )*
			{
				adaptor.addChild(root_0, stream_expression.nextTree());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:114:48: ( exprs )*
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:117:1: exprBase : ( nil_ | variable | cons | list | hd | tl | symbolExpr );
	public final while_astParser.exprBase_return exprBase() throws RecognitionException {
		while_astParser.exprBase_return retval = new while_astParser.exprBase_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope nil_109 =null;
		ParserRuleReturnScope variable110 =null;
		ParserRuleReturnScope cons111 =null;
		ParserRuleReturnScope list112 =null;
		ParserRuleReturnScope hd113 =null;
		ParserRuleReturnScope tl114 =null;
		ParserRuleReturnScope symbolExpr115 =null;


		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:117:12: ( nil_ | variable | cons | list | hd | tl | symbolExpr )
			int alt55=7;
			alt55 = dfa55.predict(input);
			switch (alt55) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:117:15: nil_
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_nil__in_exprBase1165);
					nil_109=nil_();
					state._fsp--;

					adaptor.addChild(root_0, nil_109.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:118:7: variable
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_variable_in_exprBase1173);
					variable110=variable();
					state._fsp--;

					adaptor.addChild(root_0, variable110.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:119:7: cons
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_cons_in_exprBase1181);
					cons111=cons();
					state._fsp--;

					adaptor.addChild(root_0, cons111.getTree());

					}
					break;
				case 4 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:119:14: list
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_list_in_exprBase1185);
					list112=list();
					state._fsp--;

					adaptor.addChild(root_0, list112.getTree());

					}
					break;
				case 5 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:120:7: hd
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_hd_in_exprBase1193);
					hd113=hd();
					state._fsp--;

					adaptor.addChild(root_0, hd113.getTree());

					}
					break;
				case 6 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:120:12: tl
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_tl_in_exprBase1197);
					tl114=tl();
					state._fsp--;

					adaptor.addChild(root_0, tl114.getTree());

					}
					break;
				case 7 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:121:7: symbolExpr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_symbolExpr_in_exprBase1205);
					symbolExpr115=symbolExpr();
					state._fsp--;

					adaptor.addChild(root_0, symbolExpr115.getTree());

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:124:1: nil_ : ( 'nil' ) -> 'nil' ;
	public final while_astParser.nil__return nil_() throws RecognitionException {
		while_astParser.nil__return retval = new while_astParser.nil__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal116=null;

		Object string_literal116_tree=null;
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:124:6: ( ( 'nil' ) -> 'nil' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:124:8: ( 'nil' )
			{
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:124:8: ( 'nil' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:124:9: 'nil'
			{
			string_literal116=(Token)match(input,54,FOLLOW_54_in_nil_1224);  
			stream_54.add(string_literal116);

			}

			// AST REWRITE
			// elements: 54
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 124:16: -> 'nil'
			{
				adaptor.addChild(root_0, stream_54.nextNode());
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:126:1: variable : Variable -> Variable ;
	public final while_astParser.variable_return variable() throws RecognitionException {
		while_astParser.variable_return retval = new while_astParser.variable_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Variable117=null;

		Object Variable117_tree=null;
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:126:9: ( Variable -> Variable )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:126:11: Variable
			{
			Variable117=(Token)match(input,Variable,FOLLOW_Variable_in_variable1241);  
			stream_Variable.add(Variable117);

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
			// 126:20: -> Variable
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:128:1: cons : '(' ( WS )* 'cons ' lExpr ( WS )* ')' -> ^( CONS lExpr ) ;
	public final while_astParser.cons_return cons() throws RecognitionException {
		while_astParser.cons_return retval = new while_astParser.cons_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal118=null;
		Token WS119=null;
		Token string_literal120=null;
		Token WS122=null;
		Token char_literal123=null;
		ParserRuleReturnScope lExpr121 =null;

		Object char_literal118_tree=null;
		Object WS119_tree=null;
		Object string_literal120_tree=null;
		Object WS122_tree=null;
		Object char_literal123_tree=null;
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_lExpr=new RewriteRuleSubtreeStream(adaptor,"rule lExpr");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:128:6: ( '(' ( WS )* 'cons ' lExpr ( WS )* ')' -> ^( CONS lExpr ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:128:8: '(' ( WS )* 'cons ' lExpr ( WS )* ')'
			{
			char_literal118=(Token)match(input,36,FOLLOW_36_in_cons1253);  
			stream_36.add(char_literal118);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:128:12: ( WS )*
			loop56:
			while (true) {
				int alt56=2;
				int LA56_0 = input.LA(1);
				if ( (LA56_0==WS) ) {
					alt56=1;
				}

				switch (alt56) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:128:12: WS
					{
					WS119=(Token)match(input,WS,FOLLOW_WS_in_cons1255);  
					stream_WS.add(WS119);

					}
					break;

				default :
					break loop56;
				}
			}

			string_literal120=(Token)match(input,43,FOLLOW_43_in_cons1258);  
			stream_43.add(string_literal120);

			pushFollow(FOLLOW_lExpr_in_cons1260);
			lExpr121=lExpr();
			state._fsp--;

			stream_lExpr.add(lExpr121.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:128:30: ( WS )*
			loop57:
			while (true) {
				int alt57=2;
				int LA57_0 = input.LA(1);
				if ( (LA57_0==WS) ) {
					alt57=1;
				}

				switch (alt57) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:128:30: WS
					{
					WS122=(Token)match(input,WS,FOLLOW_WS_in_cons1262);  
					stream_WS.add(WS122);

					}
					break;

				default :
					break loop57;
				}
			}

			char_literal123=(Token)match(input,37,FOLLOW_37_in_cons1265);  
			stream_37.add(char_literal123);

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
			// 128:38: -> ^( CONS lExpr )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:128:41: ^( CONS lExpr )
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:129:1: list : '(' ( WS )* 'list ' lExpr ( WS )* ')' -> ^( LIST lExpr ) ;
	public final while_astParser.list_return list() throws RecognitionException {
		while_astParser.list_return retval = new while_astParser.list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal124=null;
		Token WS125=null;
		Token string_literal126=null;
		Token WS128=null;
		Token char_literal129=null;
		ParserRuleReturnScope lExpr127 =null;

		Object char_literal124_tree=null;
		Object WS125_tree=null;
		Object string_literal126_tree=null;
		Object WS128_tree=null;
		Object char_literal129_tree=null;
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleSubtreeStream stream_lExpr=new RewriteRuleSubtreeStream(adaptor,"rule lExpr");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:129:6: ( '(' ( WS )* 'list ' lExpr ( WS )* ')' -> ^( LIST lExpr ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:129:8: '(' ( WS )* 'list ' lExpr ( WS )* ')'
			{
			char_literal124=(Token)match(input,36,FOLLOW_36_in_list1281);  
			stream_36.add(char_literal124);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:129:11: ( WS )*
			loop58:
			while (true) {
				int alt58=2;
				int LA58_0 = input.LA(1);
				if ( (LA58_0==WS) ) {
					alt58=1;
				}

				switch (alt58) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:129:11: WS
					{
					WS125=(Token)match(input,WS,FOLLOW_WS_in_list1282);  
					stream_WS.add(WS125);

					}
					break;

				default :
					break loop58;
				}
			}

			string_literal126=(Token)match(input,53,FOLLOW_53_in_list1285);  
			stream_53.add(string_literal126);

			pushFollow(FOLLOW_lExpr_in_list1287);
			lExpr127=lExpr();
			state._fsp--;

			stream_lExpr.add(lExpr127.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:129:29: ( WS )*
			loop59:
			while (true) {
				int alt59=2;
				int LA59_0 = input.LA(1);
				if ( (LA59_0==WS) ) {
					alt59=1;
				}

				switch (alt59) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:129:29: WS
					{
					WS128=(Token)match(input,WS,FOLLOW_WS_in_list1289);  
					stream_WS.add(WS128);

					}
					break;

				default :
					break loop59;
				}
			}

			char_literal129=(Token)match(input,37,FOLLOW_37_in_list1292);  
			stream_37.add(char_literal129);

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
			// 129:37: -> ^( LIST lExpr )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:129:40: ^( LIST lExpr )
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:131:1: hd : '(' ( WS )* 'hd ' exprBase ( WS )* ')' -> ^( HD exprBase ) ;
	public final while_astParser.hd_return hd() throws RecognitionException {
		while_astParser.hd_return retval = new while_astParser.hd_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal130=null;
		Token WS131=null;
		Token string_literal132=null;
		Token WS134=null;
		Token char_literal135=null;
		ParserRuleReturnScope exprBase133 =null;

		Object char_literal130_tree=null;
		Object WS131_tree=null;
		Object string_literal132_tree=null;
		Object WS134_tree=null;
		Object char_literal135_tree=null;
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:131:4: ( '(' ( WS )* 'hd ' exprBase ( WS )* ')' -> ^( HD exprBase ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:131:6: '(' ( WS )* 'hd ' exprBase ( WS )* ')'
			{
			char_literal130=(Token)match(input,36,FOLLOW_36_in_hd1308);  
			stream_36.add(char_literal130);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:131:9: ( WS )*
			loop60:
			while (true) {
				int alt60=2;
				int LA60_0 = input.LA(1);
				if ( (LA60_0==WS) ) {
					alt60=1;
				}

				switch (alt60) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:131:9: WS
					{
					WS131=(Token)match(input,WS,FOLLOW_WS_in_hd1309);  
					stream_WS.add(WS131);

					}
					break;

				default :
					break loop60;
				}
			}

			string_literal132=(Token)match(input,50,FOLLOW_50_in_hd1312);  
			stream_50.add(string_literal132);

			pushFollow(FOLLOW_exprBase_in_hd1314);
			exprBase133=exprBase();
			state._fsp--;

			stream_exprBase.add(exprBase133.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:131:28: ( WS )*
			loop61:
			while (true) {
				int alt61=2;
				int LA61_0 = input.LA(1);
				if ( (LA61_0==WS) ) {
					alt61=1;
				}

				switch (alt61) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:131:28: WS
					{
					WS134=(Token)match(input,WS,FOLLOW_WS_in_hd1316);  
					stream_WS.add(WS134);

					}
					break;

				default :
					break loop61;
				}
			}

			char_literal135=(Token)match(input,37,FOLLOW_37_in_hd1318);  
			stream_37.add(char_literal135);

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
			// 131:35: -> ^( HD exprBase )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:131:38: ^( HD exprBase )
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:133:1: tl : '(' ( WS )* 'tl ' exprBase ( WS )* ')' -> ^( TL exprBase ) ;
	public final while_astParser.tl_return tl() throws RecognitionException {
		while_astParser.tl_return retval = new while_astParser.tl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal136=null;
		Token WS137=null;
		Token string_literal138=null;
		Token WS140=null;
		Token char_literal141=null;
		ParserRuleReturnScope exprBase139 =null;

		Object char_literal136_tree=null;
		Object WS137_tree=null;
		Object string_literal138_tree=null;
		Object WS140_tree=null;
		Object char_literal141_tree=null;
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:133:4: ( '(' ( WS )* 'tl ' exprBase ( WS )* ')' -> ^( TL exprBase ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:133:6: '(' ( WS )* 'tl ' exprBase ( WS )* ')'
			{
			char_literal136=(Token)match(input,36,FOLLOW_36_in_tl1334);  
			stream_36.add(char_literal136);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:133:10: ( WS )*
			loop62:
			while (true) {
				int alt62=2;
				int LA62_0 = input.LA(1);
				if ( (LA62_0==WS) ) {
					alt62=1;
				}

				switch (alt62) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:133:10: WS
					{
					WS137=(Token)match(input,WS,FOLLOW_WS_in_tl1336);  
					stream_WS.add(WS137);

					}
					break;

				default :
					break loop62;
				}
			}

			string_literal138=(Token)match(input,59,FOLLOW_59_in_tl1338);  
			stream_59.add(string_literal138);

			pushFollow(FOLLOW_exprBase_in_tl1340);
			exprBase139=exprBase();
			state._fsp--;

			stream_exprBase.add(exprBase139.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:133:28: ( WS )*
			loop63:
			while (true) {
				int alt63=2;
				int LA63_0 = input.LA(1);
				if ( (LA63_0==WS) ) {
					alt63=1;
				}

				switch (alt63) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:133:28: WS
					{
					WS140=(Token)match(input,WS,FOLLOW_WS_in_tl1342);  
					stream_WS.add(WS140);

					}
					break;

				default :
					break loop63;
				}
			}

			char_literal141=(Token)match(input,37,FOLLOW_37_in_tl1344);  
			stream_37.add(char_literal141);

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
			// 133:35: -> ^( TL exprBase )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:133:38: ^( TL exprBase )
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:135:1: symbolExpr : '(' Symbol ( WS )* ( lExpr )? ')' -> Symbol ( lExpr )? ;
	public final while_astParser.symbolExpr_return symbolExpr() throws RecognitionException {
		while_astParser.symbolExpr_return retval = new while_astParser.symbolExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal142=null;
		Token Symbol143=null;
		Token WS144=null;
		Token char_literal146=null;
		ParserRuleReturnScope lExpr145 =null;

		Object char_literal142_tree=null;
		Object Symbol143_tree=null;
		Object WS144_tree=null;
		Object char_literal146_tree=null;
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleTokenStream stream_Symbol=new RewriteRuleTokenStream(adaptor,"token Symbol");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_lExpr=new RewriteRuleSubtreeStream(adaptor,"rule lExpr");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:136:2: ( '(' Symbol ( WS )* ( lExpr )? ')' -> Symbol ( lExpr )? )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:136:4: '(' Symbol ( WS )* ( lExpr )? ')'
			{
			char_literal142=(Token)match(input,36,FOLLOW_36_in_symbolExpr1361);  
			stream_36.add(char_literal142);

			Symbol143=(Token)match(input,Symbol,FOLLOW_Symbol_in_symbolExpr1363);  
			stream_Symbol.add(Symbol143);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:136:15: ( WS )*
			loop64:
			while (true) {
				int alt64=2;
				int LA64_0 = input.LA(1);
				if ( (LA64_0==WS) ) {
					alt64=1;
				}

				switch (alt64) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:136:15: WS
					{
					WS144=(Token)match(input,WS,FOLLOW_WS_in_symbolExpr1365);  
					stream_WS.add(WS144);

					}
					break;

				default :
					break loop64;
				}
			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:136:19: ( lExpr )?
			int alt65=2;
			int LA65_0 = input.LA(1);
			if ( (LA65_0==Variable||LA65_0==36||LA65_0==54) ) {
				alt65=1;
			}
			switch (alt65) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:136:19: lExpr
					{
					pushFollow(FOLLOW_lExpr_in_symbolExpr1368);
					lExpr145=lExpr();
					state._fsp--;

					stream_lExpr.add(lExpr145.getTree());
					}
					break;

			}

			char_literal146=(Token)match(input,37,FOLLOW_37_in_symbolExpr1371);  
			stream_37.add(char_literal146);

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
			// 136:30: -> Symbol ( lExpr )?
			{
				adaptor.addChild(root_0, stream_Symbol.nextNode());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:136:40: ( lExpr )?
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
	// $ANTLR end "symbolExpr"


	public static class expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:138:1: expression : lExpr ( ( WS )* '=?' ( WS )* lExpr )? -> ^( EXPR lExpr ( lExpr )? ) ;
	public final while_astParser.expression_return expression() throws RecognitionException {
		while_astParser.expression_return retval = new while_astParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WS148=null;
		Token string_literal149=null;
		Token WS150=null;
		ParserRuleReturnScope lExpr147 =null;
		ParserRuleReturnScope lExpr151 =null;

		Object WS148_tree=null;
		Object string_literal149_tree=null;
		Object WS150_tree=null;
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleSubtreeStream stream_lExpr=new RewriteRuleSubtreeStream(adaptor,"rule lExpr");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:139:5: ( lExpr ( ( WS )* '=?' ( WS )* lExpr )? -> ^( EXPR lExpr ( lExpr )? ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:139:7: lExpr ( ( WS )* '=?' ( WS )* lExpr )?
			{
			pushFollow(FOLLOW_lExpr_in_expression1391);
			lExpr147=lExpr();
			state._fsp--;

			stream_lExpr.add(lExpr147.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:139:13: ( ( WS )* '=?' ( WS )* lExpr )?
			int alt68=2;
			alt68 = dfa68.predict(input);
			switch (alt68) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:139:14: ( WS )* '=?' ( WS )* lExpr
					{
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:139:14: ( WS )*
					loop66:
					while (true) {
						int alt66=2;
						int LA66_0 = input.LA(1);
						if ( (LA66_0==WS) ) {
							alt66=1;
						}

						switch (alt66) {
						case 1 :
							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:139:14: WS
							{
							WS148=(Token)match(input,WS,FOLLOW_WS_in_expression1394);  
							stream_WS.add(WS148);

							}
							break;

						default :
							break loop66;
						}
					}

					string_literal149=(Token)match(input,42,FOLLOW_42_in_expression1397);  
					stream_42.add(string_literal149);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:139:23: ( WS )*
					loop67:
					while (true) {
						int alt67=2;
						int LA67_0 = input.LA(1);
						if ( (LA67_0==WS) ) {
							alt67=1;
						}

						switch (alt67) {
						case 1 :
							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:139:23: WS
							{
							WS150=(Token)match(input,WS,FOLLOW_WS_in_expression1399);  
							stream_WS.add(WS150);

							}
							break;

						default :
							break loop67;
						}
					}

					pushFollow(FOLLOW_lExpr_in_expression1402);
					lExpr151=lExpr();
					state._fsp--;

					stream_lExpr.add(lExpr151.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: lExpr, lExpr
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 139:35: -> ^( EXPR lExpr ( lExpr )? )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:139:38: ^( EXPR lExpr ( lExpr )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR, "EXPR"), root_1);
				adaptor.addChild(root_1, stream_lExpr.nextTree());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:139:51: ( lExpr )?
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
	// $ANTLR end "expression"


	public static class lExpr_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "lExpr"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:143:1: lExpr : exprBase ( ( WS )* lExpr )? -> exprBase ( lExpr )? ;
	public final while_astParser.lExpr_return lExpr() throws RecognitionException {
		while_astParser.lExpr_return retval = new while_astParser.lExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WS153=null;
		ParserRuleReturnScope exprBase152 =null;
		ParserRuleReturnScope lExpr154 =null;

		Object WS153_tree=null;
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");
		RewriteRuleSubtreeStream stream_lExpr=new RewriteRuleSubtreeStream(adaptor,"rule lExpr");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:144:5: ( exprBase ( ( WS )* lExpr )? -> exprBase ( lExpr )? )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:144:7: exprBase ( ( WS )* lExpr )?
			{
			pushFollow(FOLLOW_exprBase_in_lExpr1437);
			exprBase152=exprBase();
			state._fsp--;

			stream_exprBase.add(exprBase152.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:144:16: ( ( WS )* lExpr )?
			int alt70=2;
			alt70 = dfa70.predict(input);
			switch (alt70) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:144:17: ( WS )* lExpr
					{
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:144:17: ( WS )*
					loop69:
					while (true) {
						int alt69=2;
						int LA69_0 = input.LA(1);
						if ( (LA69_0==WS) ) {
							alt69=1;
						}

						switch (alt69) {
						case 1 :
							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:144:17: WS
							{
							WS153=(Token)match(input,WS,FOLLOW_WS_in_lExpr1440);  
							stream_WS.add(WS153);

							}
							break;

						default :
							break loop69;
						}
					}

					pushFollow(FOLLOW_lExpr_in_lExpr1443);
					lExpr154=lExpr();
					state._fsp--;

					stream_lExpr.add(lExpr154.getTree());
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
			// 144:29: -> exprBase ( lExpr )?
			{
				adaptor.addChild(root_0, stream_exprBase.nextTree());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:144:41: ( lExpr )?
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


	protected DFA21 dfa21 = new DFA21(this);
	protected DFA55 dfa55 = new DFA55(this);
	protected DFA68 dfa68 = new DFA68(this);
	protected DFA70 dfa70 = new DFA70(this);
	static final String DFA21_eotS =
		"\4\uffff";
	static final String DFA21_eofS =
		"\4\uffff";
	static final String DFA21_minS =
		"\2\42\2\uffff";
	static final String DFA21_maxS =
		"\2\70\2\uffff";
	static final String DFA21_acceptS =
		"\2\uffff\1\1\1\2";
	static final String DFA21_specialS =
		"\4\uffff}>";
	static final String[] DFA21_transitionS = {
			"\1\1\1\3\5\uffff\1\2\3\uffff\2\3\11\uffff\1\3",
			"\1\1\1\3\5\uffff\1\2\3\uffff\2\3\11\uffff\1\3",
			"",
			""
	};

	static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
	static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
	static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
	static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
	static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
	static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
	static final short[][] DFA21_transition;

	static {
		int numStates = DFA21_transitionS.length;
		DFA21_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
		}
	}

	protected class DFA21 extends DFA {

		public DFA21(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 21;
			this.eot = DFA21_eot;
			this.eof = DFA21_eof;
			this.min = DFA21_min;
			this.max = DFA21_max;
			this.accept = DFA21_accept;
			this.special = DFA21_special;
			this.transition = DFA21_transition;
		}
		@Override
		public String getDescription() {
			return "77:15: ( ( WS )* ';' ( WS )* commands )?";
		}
	}

	static final String DFA55_eotS =
		"\12\uffff";
	static final String DFA55_eofS =
		"\12\uffff";
	static final String DFA55_minS =
		"\1\40\2\uffff\1\33\1\uffff\1\42\4\uffff";
	static final String DFA55_maxS =
		"\1\66\2\uffff\1\73\1\uffff\1\73\4\uffff";
	static final String DFA55_acceptS =
		"\1\uffff\1\1\1\2\1\uffff\1\7\1\uffff\1\3\1\4\1\5\1\6";
	static final String DFA55_specialS =
		"\12\uffff}>";
	static final String[] DFA55_transitionS = {
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

	static final short[] DFA55_eot = DFA.unpackEncodedString(DFA55_eotS);
	static final short[] DFA55_eof = DFA.unpackEncodedString(DFA55_eofS);
	static final char[] DFA55_min = DFA.unpackEncodedStringToUnsignedChars(DFA55_minS);
	static final char[] DFA55_max = DFA.unpackEncodedStringToUnsignedChars(DFA55_maxS);
	static final short[] DFA55_accept = DFA.unpackEncodedString(DFA55_acceptS);
	static final short[] DFA55_special = DFA.unpackEncodedString(DFA55_specialS);
	static final short[][] DFA55_transition;

	static {
		int numStates = DFA55_transitionS.length;
		DFA55_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA55_transition[i] = DFA.unpackEncodedString(DFA55_transitionS[i]);
		}
	}

	protected class DFA55 extends DFA {

		public DFA55(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 55;
			this.eot = DFA55_eot;
			this.eof = DFA55_eof;
			this.min = DFA55_min;
			this.max = DFA55_max;
			this.accept = DFA55_accept;
			this.special = DFA55_special;
			this.transition = DFA55_transition;
		}
		@Override
		public String getDescription() {
			return "117:1: exprBase : ( nil_ | variable | cons | list | hd | tl | symbolExpr );";
		}
	}

	static final String DFA68_eotS =
		"\4\uffff";
	static final String DFA68_eofS =
		"\4\uffff";
	static final String DFA68_minS =
		"\1\6\1\42\2\uffff";
	static final String DFA68_maxS =
		"\2\72\2\uffff";
	static final String DFA68_acceptS =
		"\2\uffff\1\1\1\2";
	static final String DFA68_specialS =
		"\4\uffff}>";
	static final String[] DFA68_transitionS = {
			"\1\3\33\uffff\1\1\1\3\2\uffff\1\3\2\uffff\1\3\1\2\1\uffff\3\3\11\uffff"+
			"\1\3\1\uffff\1\3",
			"\1\1\1\3\5\uffff\1\3\1\2\1\uffff\3\3\11\uffff\1\3\1\uffff\1\3",
			"",
			""
	};

	static final short[] DFA68_eot = DFA.unpackEncodedString(DFA68_eotS);
	static final short[] DFA68_eof = DFA.unpackEncodedString(DFA68_eofS);
	static final char[] DFA68_min = DFA.unpackEncodedStringToUnsignedChars(DFA68_minS);
	static final char[] DFA68_max = DFA.unpackEncodedStringToUnsignedChars(DFA68_maxS);
	static final short[] DFA68_accept = DFA.unpackEncodedString(DFA68_acceptS);
	static final short[] DFA68_special = DFA.unpackEncodedString(DFA68_specialS);
	static final short[][] DFA68_transition;

	static {
		int numStates = DFA68_transitionS.length;
		DFA68_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA68_transition[i] = DFA.unpackEncodedString(DFA68_transitionS[i]);
		}
	}

	protected class DFA68 extends DFA {

		public DFA68(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 68;
			this.eot = DFA68_eot;
			this.eof = DFA68_eof;
			this.min = DFA68_min;
			this.max = DFA68_max;
			this.accept = DFA68_accept;
			this.special = DFA68_special;
			this.transition = DFA68_transition;
		}
		@Override
		public String getDescription() {
			return "139:13: ( ( WS )* '=?' ( WS )* lExpr )?";
		}
	}

	static final String DFA70_eotS =
		"\4\uffff";
	static final String DFA70_eofS =
		"\4\uffff";
	static final String DFA70_minS =
		"\1\6\1\40\2\uffff";
	static final String DFA70_maxS =
		"\2\72\2\uffff";
	static final String DFA70_acceptS =
		"\2\uffff\1\1\1\2";
	static final String DFA70_specialS =
		"\4\uffff}>";
	static final String[] DFA70_transitionS = {
			"\1\3\31\uffff\1\2\1\uffff\1\1\1\3\1\2\2\3\2\uffff\2\3\1\uffff\3\3\7\uffff"+
			"\1\2\1\uffff\1\3\1\uffff\1\3",
			"\1\2\1\uffff\1\1\1\3\1\2\1\3\3\uffff\2\3\1\uffff\3\3\7\uffff\1\2\1\uffff"+
			"\1\3\1\uffff\1\3",
			"",
			""
	};

	static final short[] DFA70_eot = DFA.unpackEncodedString(DFA70_eotS);
	static final short[] DFA70_eof = DFA.unpackEncodedString(DFA70_eofS);
	static final char[] DFA70_min = DFA.unpackEncodedStringToUnsignedChars(DFA70_minS);
	static final char[] DFA70_max = DFA.unpackEncodedStringToUnsignedChars(DFA70_maxS);
	static final short[] DFA70_accept = DFA.unpackEncodedString(DFA70_acceptS);
	static final short[] DFA70_special = DFA.unpackEncodedString(DFA70_specialS);
	static final short[][] DFA70_transition;

	static {
		int numStates = DFA70_transitionS.length;
		DFA70_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA70_transition[i] = DFA.unpackEncodedString(DFA70_transitionS[i]);
		}
	}

	protected class DFA70 extends DFA {

		public DFA70(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 70;
			this.eot = DFA70_eot;
			this.eof = DFA70_eof;
			this.min = DFA70_min;
			this.max = DFA70_max;
			this.accept = DFA70_accept;
			this.special = DFA70_special;
			this.transition = DFA70_transition;
		}
		@Override
		public String getDescription() {
			return "144:16: ( ( WS )* lExpr )?";
		}
	}

	public static final BitSet FOLLOW_program_in_startProgram208 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Comment_in_getComment387 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_in_program407 = new BitSet(new long[]{0x0002000000000042L});
	public static final BitSet FOLLOW_program_in_program409 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getComment_in_function439 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_49_in_function442 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_Symbol_in_function444 = new BitSet(new long[]{0x0000008400000000L});
	public static final BitSet FOLLOW_WS_in_function446 = new BitSet(new long[]{0x0000008400000000L});
	public static final BitSet FOLLOW_39_in_function449 = new BitSet(new long[]{0x0200000400000040L});
	public static final BitSet FOLLOW_getComment_in_function451 = new BitSet(new long[]{0x0200000400000000L});
	public static final BitSet FOLLOW_WS_in_function454 = new BitSet(new long[]{0x0200000400000000L});
	public static final BitSet FOLLOW_definition_in_function457 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_definition490 = new BitSet(new long[]{0x0000000D00000040L});
	public static final BitSet FOLLOW_WS_in_definition492 = new BitSet(new long[]{0x0000000D00000040L});
	public static final BitSet FOLLOW_input_in_definition495 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_definition497 = new BitSet(new long[]{0x1089800500000040L});
	public static final BitSet FOLLOW_getComment_in_definition499 = new BitSet(new long[]{0x1089800500000000L});
	public static final BitSet FOLLOW_WS_in_definition502 = new BitSet(new long[]{0x1089800500000000L});
	public static final BitSet FOLLOW_commands_in_definition505 = new BitSet(new long[]{0x0000000C00000000L});
	public static final BitSet FOLLOW_WS_in_definition507 = new BitSet(new long[]{0x0000000C00000000L});
	public static final BitSet FOLLOW_35_in_definition510 = new BitSet(new long[]{0x2000000400000040L});
	public static final BitSet FOLLOW_getComment_in_definition512 = new BitSet(new long[]{0x2000000400000000L});
	public static final BitSet FOLLOW_WS_in_definition515 = new BitSet(new long[]{0x2000000400000000L});
	public static final BitSet FOLLOW_61_in_definition518 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_output_in_definition520 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_getComment_in_definition522 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inputSub_in_input554 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_getComment_in_input557 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_inputSub588 = new BitSet(new long[]{0x0000004400000002L});
	public static final BitSet FOLLOW_WS_in_inputSub590 = new BitSet(new long[]{0x0000004400000002L});
	public static final BitSet FOLLOW_38_in_inputSub594 = new BitSet(new long[]{0x0000000500000000L});
	public static final BitSet FOLLOW_WS_in_inputSub596 = new BitSet(new long[]{0x0000000500000000L});
	public static final BitSet FOLLOW_inputSub_in_inputSub599 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_output626 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_38_in_output629 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_output_in_output631 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_in_commands661 = new BitSet(new long[]{0x0000020400000002L});
	public static final BitSet FOLLOW_WS_in_commands665 = new BitSet(new long[]{0x0000020400000000L});
	public static final BitSet FOLLOW_41_in_commands668 = new BitSet(new long[]{0x1089800500000000L});
	public static final BitSet FOLLOW_WS_in_commands670 = new BitSet(new long[]{0x1089800500000000L});
	public static final BitSet FOLLOW_commands_in_commands673 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_command700 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decl_in_command704 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if__in_command708 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_for__in_command712 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_while__in_command716 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foreach__in_command720 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vars_in_decl734 = new BitSet(new long[]{0x0000010400000000L});
	public static final BitSet FOLLOW_WS_in_decl736 = new BitSet(new long[]{0x0000010400000000L});
	public static final BitSet FOLLOW_40_in_decl739 = new BitSet(new long[]{0x0040001500000000L});
	public static final BitSet FOLLOW_WS_in_decl741 = new BitSet(new long[]{0x0040001500000000L});
	public static final BitSet FOLLOW_exprs_in_decl744 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_getComment_in_decl747 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_if_781 = new BitSet(new long[]{0x0040001500000000L});
	public static final BitSet FOLLOW_WS_in_if_783 = new BitSet(new long[]{0x0040001500000000L});
	public static final BitSet FOLLOW_expression_in_if_786 = new BitSet(new long[]{0x0400000400000000L});
	public static final BitSet FOLLOW_WS_in_if_788 = new BitSet(new long[]{0x0400000400000000L});
	public static final BitSet FOLLOW_then__in_if_791 = new BitSet(new long[]{0x0000600400000000L});
	public static final BitSet FOLLOW_WS_in_if_793 = new BitSet(new long[]{0x0000600400000000L});
	public static final BitSet FOLLOW_else__in_if_797 = new BitSet(new long[]{0x0000400400000000L});
	public static final BitSet FOLLOW_WS_in_if_799 = new BitSet(new long[]{0x0000400400000000L});
	public static final BitSet FOLLOW_46_in_if_804 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_getComment_in_if_806 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_58_in_then_844 = new BitSet(new long[]{0x1089800500000040L});
	public static final BitSet FOLLOW_getComment_in_then_846 = new BitSet(new long[]{0x1089800500000000L});
	public static final BitSet FOLLOW_WS_in_then_849 = new BitSet(new long[]{0x1089800500000000L});
	public static final BitSet FOLLOW_commands_in_then_852 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_else_872 = new BitSet(new long[]{0x1089800500000040L});
	public static final BitSet FOLLOW_getComment_in_else_874 = new BitSet(new long[]{0x1089800500000000L});
	public static final BitSet FOLLOW_WS_in_else_877 = new BitSet(new long[]{0x1089800500000000L});
	public static final BitSet FOLLOW_commands_in_else_880 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_60_in_while_906 = new BitSet(new long[]{0x0040001500000000L});
	public static final BitSet FOLLOW_WS_in_while_908 = new BitSet(new long[]{0x0040001500000000L});
	public static final BitSet FOLLOW_expression_in_while_911 = new BitSet(new long[]{0x0000100400000040L});
	public static final BitSet FOLLOW_getComment_in_while_913 = new BitSet(new long[]{0x0000100400000000L});
	public static final BitSet FOLLOW_WS_in_while_916 = new BitSet(new long[]{0x0000100400000000L});
	public static final BitSet FOLLOW_do__in_while_919 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_do_953 = new BitSet(new long[]{0x1089800500000040L});
	public static final BitSet FOLLOW_getComment_in_do_955 = new BitSet(new long[]{0x1089800500000000L});
	public static final BitSet FOLLOW_WS_in_do_958 = new BitSet(new long[]{0x1089800500000000L});
	public static final BitSet FOLLOW_commands_in_do_961 = new BitSet(new long[]{0x0100000400000000L});
	public static final BitSet FOLLOW_WS_in_do_963 = new BitSet(new long[]{0x0100000400000000L});
	public static final BitSet FOLLOW_56_in_do_966 = new BitSet(new long[]{0x0000000000000042L});
	public static final BitSet FOLLOW_getComment_in_do_968 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_for_994 = new BitSet(new long[]{0x0040001500000000L});
	public static final BitSet FOLLOW_WS_in_for_996 = new BitSet(new long[]{0x0040001500000000L});
	public static final BitSet FOLLOW_expression_in_for_999 = new BitSet(new long[]{0x0000100400000040L});
	public static final BitSet FOLLOW_getComment_in_for_1001 = new BitSet(new long[]{0x0000100400000000L});
	public static final BitSet FOLLOW_WS_in_for_1004 = new BitSet(new long[]{0x0000100400000000L});
	public static final BitSet FOLLOW_do__in_for_1007 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_foreach_1038 = new BitSet(new long[]{0x0000000500000000L});
	public static final BitSet FOLLOW_WS_in_foreach_1040 = new BitSet(new long[]{0x0000000500000000L});
	public static final BitSet FOLLOW_Variable_in_foreach_1043 = new BitSet(new long[]{0x0010000400000000L});
	public static final BitSet FOLLOW_WS_in_foreach_1045 = new BitSet(new long[]{0x0010000400000000L});
	public static final BitSet FOLLOW_52_in_foreach_1048 = new BitSet(new long[]{0x0040001500000000L});
	public static final BitSet FOLLOW_WS_in_foreach_1050 = new BitSet(new long[]{0x0040001500000000L});
	public static final BitSet FOLLOW_expression_in_foreach_1053 = new BitSet(new long[]{0x0000100400000040L});
	public static final BitSet FOLLOW_getComment_in_foreach_1055 = new BitSet(new long[]{0x0000100400000000L});
	public static final BitSet FOLLOW_WS_in_foreach_1058 = new BitSet(new long[]{0x0000100400000000L});
	public static final BitSet FOLLOW_do__in_foreach_1061 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_vars1100 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_38_in_vars1103 = new BitSet(new long[]{0x0000000500000000L});
	public static final BitSet FOLLOW_WS_in_vars1104 = new BitSet(new long[]{0x0000000500000000L});
	public static final BitSet FOLLOW_vars_in_vars1107 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_exprs1133 = new BitSet(new long[]{0x0000004000000002L});
	public static final BitSet FOLLOW_38_in_exprs1136 = new BitSet(new long[]{0x0040001500000000L});
	public static final BitSet FOLLOW_WS_in_exprs1137 = new BitSet(new long[]{0x0040001500000000L});
	public static final BitSet FOLLOW_exprs_in_exprs1140 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nil__in_exprBase1165 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_exprBase1173 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cons_in_exprBase1181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_list_in_exprBase1185 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_hd_in_exprBase1193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tl_in_exprBase1197 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_symbolExpr_in_exprBase1205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_nil_1224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_variable1241 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_cons1253 = new BitSet(new long[]{0x0000080400000000L});
	public static final BitSet FOLLOW_WS_in_cons1255 = new BitSet(new long[]{0x0000080400000000L});
	public static final BitSet FOLLOW_43_in_cons1258 = new BitSet(new long[]{0x0040001100000000L});
	public static final BitSet FOLLOW_lExpr_in_cons1260 = new BitSet(new long[]{0x0000002400000000L});
	public static final BitSet FOLLOW_WS_in_cons1262 = new BitSet(new long[]{0x0000002400000000L});
	public static final BitSet FOLLOW_37_in_cons1265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_list1281 = new BitSet(new long[]{0x0020000400000000L});
	public static final BitSet FOLLOW_WS_in_list1282 = new BitSet(new long[]{0x0020000400000000L});
	public static final BitSet FOLLOW_53_in_list1285 = new BitSet(new long[]{0x0040001100000000L});
	public static final BitSet FOLLOW_lExpr_in_list1287 = new BitSet(new long[]{0x0000002400000000L});
	public static final BitSet FOLLOW_WS_in_list1289 = new BitSet(new long[]{0x0000002400000000L});
	public static final BitSet FOLLOW_37_in_list1292 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_hd1308 = new BitSet(new long[]{0x0004000400000000L});
	public static final BitSet FOLLOW_WS_in_hd1309 = new BitSet(new long[]{0x0004000400000000L});
	public static final BitSet FOLLOW_50_in_hd1312 = new BitSet(new long[]{0x0040001100000000L});
	public static final BitSet FOLLOW_exprBase_in_hd1314 = new BitSet(new long[]{0x0000002400000000L});
	public static final BitSet FOLLOW_WS_in_hd1316 = new BitSet(new long[]{0x0000002400000000L});
	public static final BitSet FOLLOW_37_in_hd1318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_tl1334 = new BitSet(new long[]{0x0800000400000000L});
	public static final BitSet FOLLOW_WS_in_tl1336 = new BitSet(new long[]{0x0800000400000000L});
	public static final BitSet FOLLOW_59_in_tl1338 = new BitSet(new long[]{0x0040001100000000L});
	public static final BitSet FOLLOW_exprBase_in_tl1340 = new BitSet(new long[]{0x0000002400000000L});
	public static final BitSet FOLLOW_WS_in_tl1342 = new BitSet(new long[]{0x0000002400000000L});
	public static final BitSet FOLLOW_37_in_tl1344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_36_in_symbolExpr1361 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_Symbol_in_symbolExpr1363 = new BitSet(new long[]{0x0040003500000000L});
	public static final BitSet FOLLOW_WS_in_symbolExpr1365 = new BitSet(new long[]{0x0040003500000000L});
	public static final BitSet FOLLOW_lExpr_in_symbolExpr1368 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_symbolExpr1371 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lExpr_in_expression1391 = new BitSet(new long[]{0x0000040400000002L});
	public static final BitSet FOLLOW_WS_in_expression1394 = new BitSet(new long[]{0x0000040400000000L});
	public static final BitSet FOLLOW_42_in_expression1397 = new BitSet(new long[]{0x0040001500000000L});
	public static final BitSet FOLLOW_WS_in_expression1399 = new BitSet(new long[]{0x0040001500000000L});
	public static final BitSet FOLLOW_lExpr_in_expression1402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprBase_in_lExpr1437 = new BitSet(new long[]{0x0040001500000002L});
	public static final BitSet FOLLOW_WS_in_lExpr1440 = new BitSet(new long[]{0x0040001500000000L});
	public static final BitSet FOLLOW_lExpr_in_lExpr1443 = new BitSet(new long[]{0x0000000000000002L});
}

package antlrworks;
// $ANTLR 3.5.1 C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g 2024-01-09 12:59:46

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
		"'cons '", "'do'", "'else'", "'fi'", "'for'", "'foreach'", "'function '", 
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
			Comment2=(Token)match(input,Comment,FOLLOW_Comment_in_getComment401);  
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


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:54:1: program : function ( WS )* ( program )? -> ^( PROGRAM function ( program )? ) ;
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

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:55:5: ( function ( WS )* ( program )? -> ^( PROGRAM function ( program )? ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:55:7: function ( WS )* ( program )?
			{
			pushFollow(FOLLOW_function_in_program421);
			function3=function();
			state._fsp--;

			stream_function.add(function3.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:55:16: ( WS )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==WS) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:55:16: WS
					{
					WS4=(Token)match(input,WS,FOLLOW_WS_in_program423);  
					stream_WS.add(WS4);

					}
					break;

				default :
					break loop1;
				}
			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:55:20: ( program )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==Comment||LA2_0==51) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:55:20: program
					{
					pushFollow(FOLLOW_program_in_program426);
					program5=program();
					state._fsp--;

					stream_program.add(program5.getTree());
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
			// 55:29: -> ^( PROGRAM function ( program )? )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:55:32: ^( PROGRAM function ( program )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);
				adaptor.addChild(root_1, stream_function.nextTree());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:55:51: ( program )?
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:58:1: function : ( getComment )? 'function ' Symbol ( WS )* ':' ( getComment )? ( WS )* definition -> ^( FUNCDEF Symbol definition ( getComment )? END ) ;
	public final while_astParser.function_return function() throws RecognitionException {
		while_astParser.function_return retval = new while_astParser.function_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal7=null;
		Token Symbol8=null;
		Token WS9=null;
		Token char_literal10=null;
		Token WS12=null;
		ParserRuleReturnScope getComment6 =null;
		ParserRuleReturnScope getComment11 =null;
		ParserRuleReturnScope definition13 =null;

		Object string_literal7_tree=null;
		Object Symbol8_tree=null;
		Object WS9_tree=null;
		Object char_literal10_tree=null;
		Object WS12_tree=null;
		RewriteRuleTokenStream stream_Symbol=new RewriteRuleTokenStream(adaptor,"token Symbol");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");
		RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"rule definition");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:59:5: ( ( getComment )? 'function ' Symbol ( WS )* ':' ( getComment )? ( WS )* definition -> ^( FUNCDEF Symbol definition ( getComment )? END ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:59:7: ( getComment )? 'function ' Symbol ( WS )* ':' ( getComment )? ( WS )* definition
			{
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:59:7: ( getComment )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==Comment) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:59:7: getComment
					{
					pushFollow(FOLLOW_getComment_in_function456);
					getComment6=getComment();
					state._fsp--;

					stream_getComment.add(getComment6.getTree());
					}
					break;

			}

			string_literal7=(Token)match(input,51,FOLLOW_51_in_function459);  
			stream_51.add(string_literal7);

			Symbol8=(Token)match(input,Symbol,FOLLOW_Symbol_in_function461);  
			stream_Symbol.add(Symbol8);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:59:38: ( WS )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==WS) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:59:38: WS
					{
					WS9=(Token)match(input,WS,FOLLOW_WS_in_function463);  
					stream_WS.add(WS9);

					}
					break;

				default :
					break loop4;
				}
			}

			char_literal10=(Token)match(input,41,FOLLOW_41_in_function466);  
			stream_41.add(char_literal10);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:59:46: ( getComment )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==Comment) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:59:46: getComment
					{
					pushFollow(FOLLOW_getComment_in_function468);
					getComment11=getComment();
					state._fsp--;

					stream_getComment.add(getComment11.getTree());
					}
					break;

			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:59:58: ( WS )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==WS) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:59:58: WS
					{
					WS12=(Token)match(input,WS,FOLLOW_WS_in_function471);  
					stream_WS.add(WS12);

					}
					break;

				default :
					break loop6;
				}
			}

			pushFollow(FOLLOW_definition_in_function474);
			definition13=definition();
			state._fsp--;

			stream_definition.add(definition13.getTree());
			// AST REWRITE
			// elements: definition, Symbol, getComment
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 59:73: -> ^( FUNCDEF Symbol definition ( getComment )? END )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:59:76: ^( FUNCDEF Symbol definition ( getComment )? END )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCDEF, "FUNCDEF"), root_1);
				adaptor.addChild(root_1, stream_Symbol.nextNode());
				adaptor.addChild(root_1, stream_definition.nextTree());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:59:104: ( getComment )?
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:62:1: definition : 'read' ( WS )* input '%' ( getComment )? ( WS )* commands ( WS )* '%' ( getComment )? ( WS )* 'write ' output ( getComment )? -> ^( FUNCTION input commands output ( getComment )? ) ;
	public final while_astParser.definition_return definition() throws RecognitionException {
		while_astParser.definition_return retval = new while_astParser.definition_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal14=null;
		Token WS15=null;
		Token char_literal17=null;
		Token WS19=null;
		Token WS21=null;
		Token char_literal22=null;
		Token WS24=null;
		Token string_literal25=null;
		ParserRuleReturnScope input16 =null;
		ParserRuleReturnScope getComment18 =null;
		ParserRuleReturnScope commands20 =null;
		ParserRuleReturnScope getComment23 =null;
		ParserRuleReturnScope output26 =null;
		ParserRuleReturnScope getComment27 =null;

		Object string_literal14_tree=null;
		Object WS15_tree=null;
		Object char_literal17_tree=null;
		Object WS19_tree=null;
		Object WS21_tree=null;
		Object char_literal22_tree=null;
		Object WS24_tree=null;
		Object string_literal25_tree=null;
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
		RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");
		RewriteRuleSubtreeStream stream_input=new RewriteRuleSubtreeStream(adaptor,"rule input");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:63:5: ( 'read' ( WS )* input '%' ( getComment )? ( WS )* commands ( WS )* '%' ( getComment )? ( WS )* 'write ' output ( getComment )? -> ^( FUNCTION input commands output ( getComment )? ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:63:7: 'read' ( WS )* input '%' ( getComment )? ( WS )* commands ( WS )* '%' ( getComment )? ( WS )* 'write ' output ( getComment )?
			{
			string_literal14=(Token)match(input,60,FOLLOW_60_in_definition507);  
			stream_60.add(string_literal14);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:63:14: ( WS )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==WS) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:63:14: WS
					{
					WS15=(Token)match(input,WS,FOLLOW_WS_in_definition509);  
					stream_WS.add(WS15);

					}
					break;

				default :
					break loop7;
				}
			}

			pushFollow(FOLLOW_input_in_definition512);
			input16=input();
			state._fsp--;

			stream_input.add(input16.getTree());
			char_literal17=(Token)match(input,37,FOLLOW_37_in_definition514);  
			stream_37.add(char_literal17);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:63:28: ( getComment )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==Comment) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:63:28: getComment
					{
					pushFollow(FOLLOW_getComment_in_definition516);
					getComment18=getComment();
					state._fsp--;

					stream_getComment.add(getComment18.getTree());
					}
					break;

			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:63:40: ( WS )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==WS) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:63:40: WS
					{
					WS19=(Token)match(input,WS,FOLLOW_WS_in_definition519);  
					stream_WS.add(WS19);

					}
					break;

				default :
					break loop9;
				}
			}

			pushFollow(FOLLOW_commands_in_definition522);
			commands20=commands();
			state._fsp--;

			stream_commands.add(commands20.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:63:53: ( WS )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==WS) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:63:53: WS
					{
					WS21=(Token)match(input,WS,FOLLOW_WS_in_definition524);  
					stream_WS.add(WS21);

					}
					break;

				default :
					break loop10;
				}
			}

			char_literal22=(Token)match(input,37,FOLLOW_37_in_definition527);  
			stream_37.add(char_literal22);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:63:61: ( getComment )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==Comment) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:63:61: getComment
					{
					pushFollow(FOLLOW_getComment_in_definition529);
					getComment23=getComment();
					state._fsp--;

					stream_getComment.add(getComment23.getTree());
					}
					break;

			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:63:73: ( WS )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==WS) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:63:73: WS
					{
					WS24=(Token)match(input,WS,FOLLOW_WS_in_definition532);  
					stream_WS.add(WS24);

					}
					break;

				default :
					break loop12;
				}
			}

			string_literal25=(Token)match(input,64,FOLLOW_64_in_definition535);  
			stream_64.add(string_literal25);

			pushFollow(FOLLOW_output_in_definition537);
			output26=output();
			state._fsp--;

			stream_output.add(output26.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:63:93: ( getComment )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==Comment) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:63:93: getComment
					{
					pushFollow(FOLLOW_getComment_in_definition539);
					getComment27=getComment();
					state._fsp--;

					stream_getComment.add(getComment27.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: input, commands, output, getComment
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 63:104: -> ^( FUNCTION input commands output ( getComment )? )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:63:107: ^( FUNCTION input commands output ( getComment )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION, "FUNCTION"), root_1);
				adaptor.addChild(root_1, stream_input.nextTree());
				adaptor.addChild(root_1, stream_commands.nextTree());
				adaptor.addChild(root_1, stream_output.nextTree());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:63:140: ( getComment )?
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:66:1: input : ( inputSub )? ( getComment )? -> ^( INPUTS ( inputSub )? ( getComment )? ) ;
	public final while_astParser.input_return input() throws RecognitionException {
		while_astParser.input_return retval = new while_astParser.input_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope inputSub28 =null;
		ParserRuleReturnScope getComment29 =null;

		RewriteRuleSubtreeStream stream_inputSub=new RewriteRuleSubtreeStream(adaptor,"rule inputSub");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:67:5: ( ( inputSub )? ( getComment )? -> ^( INPUTS ( inputSub )? ( getComment )? ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:67:7: ( inputSub )? ( getComment )?
			{
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:67:7: ( inputSub )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==Variable) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:67:7: inputSub
					{
					pushFollow(FOLLOW_inputSub_in_input571);
					inputSub28=inputSub();
					state._fsp--;

					stream_inputSub.add(inputSub28.getTree());
					}
					break;

			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:67:17: ( getComment )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==Comment) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:67:17: getComment
					{
					pushFollow(FOLLOW_getComment_in_input574);
					getComment29=getComment();
					state._fsp--;

					stream_getComment.add(getComment29.getTree());
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
			// 67:29: -> ^( INPUTS ( inputSub )? ( getComment )? )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:67:33: ^( INPUTS ( inputSub )? ( getComment )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INPUTS, "INPUTS"), root_1);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:67:42: ( inputSub )?
				if ( stream_inputSub.hasNext() ) {
					adaptor.addChild(root_1, stream_inputSub.nextTree());
				}
				stream_inputSub.reset();

				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:67:52: ( getComment )?
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:70:1: inputSub : Variable ( WS )* ( ',' ( WS )* inputSub )? -> Variable ( inputSub )? ;
	public final while_astParser.inputSub_return inputSub() throws RecognitionException {
		while_astParser.inputSub_return retval = new while_astParser.inputSub_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Variable30=null;
		Token WS31=null;
		Token char_literal32=null;
		Token WS33=null;
		ParserRuleReturnScope inputSub34 =null;

		Object Variable30_tree=null;
		Object WS31_tree=null;
		Object char_literal32_tree=null;
		Object WS33_tree=null;
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_inputSub=new RewriteRuleSubtreeStream(adaptor,"rule inputSub");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:71:5: ( Variable ( WS )* ( ',' ( WS )* inputSub )? -> Variable ( inputSub )? )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:71:7: Variable ( WS )* ( ',' ( WS )* inputSub )?
			{
			Variable30=(Token)match(input,Variable,FOLLOW_Variable_in_inputSub605);  
			stream_Variable.add(Variable30);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:71:16: ( WS )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==WS) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:71:16: WS
					{
					WS31=(Token)match(input,WS,FOLLOW_WS_in_inputSub607);  
					stream_WS.add(WS31);

					}
					break;

				default :
					break loop16;
				}
			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:71:20: ( ',' ( WS )* inputSub )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==40) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:71:21: ',' ( WS )* inputSub
					{
					char_literal32=(Token)match(input,40,FOLLOW_40_in_inputSub611);  
					stream_40.add(char_literal32);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:71:25: ( WS )*
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( (LA17_0==WS) ) {
							alt17=1;
						}

						switch (alt17) {
						case 1 :
							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:71:25: WS
							{
							WS33=(Token)match(input,WS,FOLLOW_WS_in_inputSub613);  
							stream_WS.add(WS33);

							}
							break;

						default :
							break loop17;
						}
					}

					pushFollow(FOLLOW_inputSub_in_inputSub616);
					inputSub34=inputSub();
					state._fsp--;

					stream_inputSub.add(inputSub34.getTree());
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
			// 71:40: -> Variable ( inputSub )?
			{
				adaptor.addChild(root_0, stream_Variable.nextNode());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:71:52: ( inputSub )?
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:74:1: output : Variable ( ',' output )? -> ^( OUTPUT Variable ( output )? ) ;
	public final while_astParser.output_return output() throws RecognitionException {
		while_astParser.output_return retval = new while_astParser.output_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Variable35=null;
		Token char_literal36=null;
		ParserRuleReturnScope output37 =null;

		Object Variable35_tree=null;
		Object char_literal36_tree=null;
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:75:5: ( Variable ( ',' output )? -> ^( OUTPUT Variable ( output )? ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:75:7: Variable ( ',' output )?
			{
			Variable35=(Token)match(input,Variable,FOLLOW_Variable_in_output643);  
			stream_Variable.add(Variable35);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:75:16: ( ',' output )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==40) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:75:17: ',' output
					{
					char_literal36=(Token)match(input,40,FOLLOW_40_in_output646);  
					stream_40.add(char_literal36);

					pushFollow(FOLLOW_output_in_output648);
					output37=output();
					state._fsp--;

					stream_output.add(output37.getTree());
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
			// 75:30: -> ^( OUTPUT Variable ( output )? )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:75:33: ^( OUTPUT Variable ( output )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OUTPUT, "OUTPUT"), root_1);
				adaptor.addChild(root_1, stream_Variable.nextNode());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:75:51: ( output )?
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:78:1: commands : command ( ( WS )* ';' ( WS )* commands )? -> command ( commands )? ;
	public final while_astParser.commands_return commands() throws RecognitionException {
		while_astParser.commands_return retval = new while_astParser.commands_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WS39=null;
		Token char_literal40=null;
		Token WS41=null;
		ParserRuleReturnScope command38 =null;
		ParserRuleReturnScope commands42 =null;

		Object WS39_tree=null;
		Object char_literal40_tree=null;
		Object WS41_tree=null;
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_command=new RewriteRuleSubtreeStream(adaptor,"rule command");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:79:5: ( command ( ( WS )* ';' ( WS )* commands )? -> command ( commands )? )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:79:7: command ( ( WS )* ';' ( WS )* commands )?
			{
			pushFollow(FOLLOW_command_in_commands678);
			command38=command();
			state._fsp--;

			stream_command.add(command38.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:79:15: ( ( WS )* ';' ( WS )* commands )?
			int alt22=2;
			alt22 = dfa22.predict(input);
			switch (alt22) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:79:17: ( WS )* ';' ( WS )* commands
					{
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:79:17: ( WS )*
					loop20:
					while (true) {
						int alt20=2;
						int LA20_0 = input.LA(1);
						if ( (LA20_0==WS) ) {
							alt20=1;
						}

						switch (alt20) {
						case 1 :
							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:79:17: WS
							{
							WS39=(Token)match(input,WS,FOLLOW_WS_in_commands682);  
							stream_WS.add(WS39);

							}
							break;

						default :
							break loop20;
						}
					}

					char_literal40=(Token)match(input,43,FOLLOW_43_in_commands685);  
					stream_43.add(char_literal40);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:79:25: ( WS )*
					loop21:
					while (true) {
						int alt21=2;
						int LA21_0 = input.LA(1);
						if ( (LA21_0==WS) ) {
							alt21=1;
						}

						switch (alt21) {
						case 1 :
							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:79:25: WS
							{
							WS41=(Token)match(input,WS,FOLLOW_WS_in_commands687);  
							stream_WS.add(WS41);

							}
							break;

						default :
							break loop21;
						}
					}

					pushFollow(FOLLOW_commands_in_commands690);
					commands42=commands();
					state._fsp--;

					stream_commands.add(commands42.getTree());
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
			// 79:40: -> command ( commands )?
			{
				adaptor.addChild(root_0, stream_command.nextTree());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:79:51: ( commands )?
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:82:1: command : ( 'nop' | decl | if_ | for_ | while_ | foreach_ );
	public final while_astParser.command_return command() throws RecognitionException {
		while_astParser.command_return retval = new while_astParser.command_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal43=null;
		ParserRuleReturnScope decl44 =null;
		ParserRuleReturnScope if_45 =null;
		ParserRuleReturnScope for_46 =null;
		ParserRuleReturnScope while_47 =null;
		ParserRuleReturnScope foreach_48 =null;

		Object string_literal43_tree=null;

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:83:5: ( 'nop' | decl | if_ | for_ | while_ | foreach_ )
			int alt23=6;
			switch ( input.LA(1) ) {
			case 57:
				{
				alt23=1;
				}
				break;
			case Variable:
				{
				alt23=2;
				}
				break;
			case 53:
				{
				alt23=3;
				}
				break;
			case 49:
				{
				alt23=4;
				}
				break;
			case 63:
				{
				alt23=5;
				}
				break;
			case 50:
				{
				alt23=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}
			switch (alt23) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:83:7: 'nop'
					{
					root_0 = (Object)adaptor.nil();


					string_literal43=(Token)match(input,57,FOLLOW_57_in_command717); 
					string_literal43_tree = (Object)adaptor.create(string_literal43);
					adaptor.addChild(root_0, string_literal43_tree);

					}
					break;
				case 2 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:83:15: decl
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_decl_in_command721);
					decl44=decl();
					state._fsp--;

					adaptor.addChild(root_0, decl44.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:83:22: if_
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_if__in_command725);
					if_45=if_();
					state._fsp--;

					adaptor.addChild(root_0, if_45.getTree());

					}
					break;
				case 4 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:83:28: for_
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_for__in_command729);
					for_46=for_();
					state._fsp--;

					adaptor.addChild(root_0, for_46.getTree());

					}
					break;
				case 5 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:83:35: while_
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_while__in_command733);
					while_47=while_();
					state._fsp--;

					adaptor.addChild(root_0, while_47.getTree());

					}
					break;
				case 6 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:83:44: foreach_
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_foreach__in_command737);
					foreach_48=foreach_();
					state._fsp--;

					adaptor.addChild(root_0, foreach_48.getTree());

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:85:1: decl : ( vars ( WS )* ':=' ( WS )* exprs ) ( getComment )? -> ^( VARDEF vars exprs ( getComment )? ) ;
	public final while_astParser.decl_return decl() throws RecognitionException {
		while_astParser.decl_return retval = new while_astParser.decl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WS50=null;
		Token string_literal51=null;
		Token WS52=null;
		ParserRuleReturnScope vars49 =null;
		ParserRuleReturnScope exprs53 =null;
		ParserRuleReturnScope getComment54 =null;

		Object WS50_tree=null;
		Object string_literal51_tree=null;
		Object WS52_tree=null;
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");
		RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:86:5: ( ( vars ( WS )* ':=' ( WS )* exprs ) ( getComment )? -> ^( VARDEF vars exprs ( getComment )? ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:86:7: ( vars ( WS )* ':=' ( WS )* exprs ) ( getComment )?
			{
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:86:7: ( vars ( WS )* ':=' ( WS )* exprs )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:86:8: vars ( WS )* ':=' ( WS )* exprs
			{
			pushFollow(FOLLOW_vars_in_decl751);
			vars49=vars();
			state._fsp--;

			stream_vars.add(vars49.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:86:13: ( WS )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==WS) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:86:13: WS
					{
					WS50=(Token)match(input,WS,FOLLOW_WS_in_decl753);  
					stream_WS.add(WS50);

					}
					break;

				default :
					break loop24;
				}
			}

			string_literal51=(Token)match(input,42,FOLLOW_42_in_decl756);  
			stream_42.add(string_literal51);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:86:22: ( WS )*
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==WS) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:86:22: WS
					{
					WS52=(Token)match(input,WS,FOLLOW_WS_in_decl758);  
					stream_WS.add(WS52);

					}
					break;

				default :
					break loop25;
				}
			}

			pushFollow(FOLLOW_exprs_in_decl761);
			exprs53=exprs();
			state._fsp--;

			stream_exprs.add(exprs53.getTree());
			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:86:33: ( getComment )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==Comment) ) {
				alt26=1;
			}
			switch (alt26) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:86:33: getComment
					{
					pushFollow(FOLLOW_getComment_in_decl764);
					getComment54=getComment();
					state._fsp--;

					stream_getComment.add(getComment54.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: getComment, exprs, vars
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 86:45: -> ^( VARDEF vars exprs ( getComment )? )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:86:48: ^( VARDEF vars exprs ( getComment )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARDEF, "VARDEF"), root_1);
				adaptor.addChild(root_1, stream_vars.nextTree());
				adaptor.addChild(root_1, stream_exprs.nextTree());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:86:68: ( getComment )?
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:89:1: if_ : ( 'if' ( WS )* expression ( WS )* then_ ( WS )* ( else_ ( WS )* )? 'fi' ( getComment )? ) -> ^( IF expression then_ ( else_ )? ( getComment )? END ) ;
	public final while_astParser.if__return if_() throws RecognitionException {
		while_astParser.if__return retval = new while_astParser.if__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal55=null;
		Token WS56=null;
		Token WS58=null;
		Token WS60=null;
		Token WS62=null;
		Token string_literal63=null;
		ParserRuleReturnScope expression57 =null;
		ParserRuleReturnScope then_59 =null;
		ParserRuleReturnScope else_61 =null;
		ParserRuleReturnScope getComment64 =null;

		Object string_literal55_tree=null;
		Object WS56_tree=null;
		Object WS58_tree=null;
		Object WS60_tree=null;
		Object WS62_tree=null;
		Object string_literal63_tree=null;
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleSubtreeStream stream_then_=new RewriteRuleSubtreeStream(adaptor,"rule then_");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_else_=new RewriteRuleSubtreeStream(adaptor,"rule else_");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:90:5: ( ( 'if' ( WS )* expression ( WS )* then_ ( WS )* ( else_ ( WS )* )? 'fi' ( getComment )? ) -> ^( IF expression then_ ( else_ )? ( getComment )? END ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:90:7: ( 'if' ( WS )* expression ( WS )* then_ ( WS )* ( else_ ( WS )* )? 'fi' ( getComment )? )
			{
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:90:7: ( 'if' ( WS )* expression ( WS )* then_ ( WS )* ( else_ ( WS )* )? 'fi' ( getComment )? )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:90:8: 'if' ( WS )* expression ( WS )* then_ ( WS )* ( else_ ( WS )* )? 'fi' ( getComment )?
			{
			string_literal55=(Token)match(input,53,FOLLOW_53_in_if_798);  
			stream_53.add(string_literal55);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:90:13: ( WS )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==WS) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:90:13: WS
					{
					WS56=(Token)match(input,WS,FOLLOW_WS_in_if_800);  
					stream_WS.add(WS56);

					}
					break;

				default :
					break loop27;
				}
			}

			pushFollow(FOLLOW_expression_in_if_803);
			expression57=expression();
			state._fsp--;

			stream_expression.add(expression57.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:90:28: ( WS )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==WS) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:90:28: WS
					{
					WS58=(Token)match(input,WS,FOLLOW_WS_in_if_805);  
					stream_WS.add(WS58);

					}
					break;

				default :
					break loop28;
				}
			}

			pushFollow(FOLLOW_then__in_if_808);
			then_59=then_();
			state._fsp--;

			stream_then_.add(then_59.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:90:38: ( WS )*
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==WS) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:90:38: WS
					{
					WS60=(Token)match(input,WS,FOLLOW_WS_in_if_810);  
					stream_WS.add(WS60);

					}
					break;

				default :
					break loop29;
				}
			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:90:42: ( else_ ( WS )* )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==47) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:90:43: else_ ( WS )*
					{
					pushFollow(FOLLOW_else__in_if_814);
					else_61=else_();
					state._fsp--;

					stream_else_.add(else_61.getTree());
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:90:49: ( WS )*
					loop30:
					while (true) {
						int alt30=2;
						int LA30_0 = input.LA(1);
						if ( (LA30_0==WS) ) {
							alt30=1;
						}

						switch (alt30) {
						case 1 :
							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:90:49: WS
							{
							WS62=(Token)match(input,WS,FOLLOW_WS_in_if_816);  
							stream_WS.add(WS62);

							}
							break;

						default :
							break loop30;
						}
					}

					}
					break;

			}

			string_literal63=(Token)match(input,48,FOLLOW_48_in_if_821);  
			stream_48.add(string_literal63);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:90:60: ( getComment )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==Comment) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:90:60: getComment
					{
					pushFollow(FOLLOW_getComment_in_if_823);
					getComment64=getComment();
					state._fsp--;

					stream_getComment.add(getComment64.getTree());
					}
					break;

			}

			}

			// AST REWRITE
			// elements: then_, else_, getComment, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 90:73: -> ^( IF expression then_ ( else_ )? ( getComment )? END )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:90:76: ^( IF expression then_ ( else_ )? ( getComment )? END )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_1, stream_then_.nextTree());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:90:98: ( else_ )?
				if ( stream_else_.hasNext() ) {
					adaptor.addChild(root_1, stream_else_.nextTree());
				}
				stream_else_.reset();

				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:90:105: ( getComment )?
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:93:1: then_ : 'then' ( getComment )? ( WS )* commands -> ^( THEN commands ( getComment )? ) ;
	public final while_astParser.then__return then_() throws RecognitionException {
		while_astParser.then__return retval = new while_astParser.then__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal65=null;
		Token WS67=null;
		ParserRuleReturnScope getComment66 =null;
		ParserRuleReturnScope commands68 =null;

		Object string_literal65_tree=null;
		Object WS67_tree=null;
		RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:93:7: ( 'then' ( getComment )? ( WS )* commands -> ^( THEN commands ( getComment )? ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:93:9: 'then' ( getComment )? ( WS )* commands
			{
			string_literal65=(Token)match(input,61,FOLLOW_61_in_then_861);  
			stream_61.add(string_literal65);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:93:16: ( getComment )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==Comment) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:93:16: getComment
					{
					pushFollow(FOLLOW_getComment_in_then_863);
					getComment66=getComment();
					state._fsp--;

					stream_getComment.add(getComment66.getTree());
					}
					break;

			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:93:28: ( WS )*
			loop34:
			while (true) {
				int alt34=2;
				int LA34_0 = input.LA(1);
				if ( (LA34_0==WS) ) {
					alt34=1;
				}

				switch (alt34) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:93:28: WS
					{
					WS67=(Token)match(input,WS,FOLLOW_WS_in_then_866);  
					stream_WS.add(WS67);

					}
					break;

				default :
					break loop34;
				}
			}

			pushFollow(FOLLOW_commands_in_then_869);
			commands68=commands();
			state._fsp--;

			stream_commands.add(commands68.getTree());
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
			// 93:41: -> ^( THEN commands ( getComment )? )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:93:44: ^( THEN commands ( getComment )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(THEN, "THEN"), root_1);
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
	// $ANTLR end "then_"


	public static class else__return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "else_"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:95:1: else_ : 'else' ( getComment )? ( WS )* commands -> ^( ELSE commands ( getComment )? ) ;
	public final while_astParser.else__return else_() throws RecognitionException {
		while_astParser.else__return retval = new while_astParser.else__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal69=null;
		Token WS71=null;
		ParserRuleReturnScope getComment70 =null;
		ParserRuleReturnScope commands72 =null;

		Object string_literal69_tree=null;
		Object WS71_tree=null;
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:95:7: ( 'else' ( getComment )? ( WS )* commands -> ^( ELSE commands ( getComment )? ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:95:9: 'else' ( getComment )? ( WS )* commands
			{
			string_literal69=(Token)match(input,47,FOLLOW_47_in_else_889);  
			stream_47.add(string_literal69);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:95:16: ( getComment )?
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==Comment) ) {
				alt35=1;
			}
			switch (alt35) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:95:16: getComment
					{
					pushFollow(FOLLOW_getComment_in_else_891);
					getComment70=getComment();
					state._fsp--;

					stream_getComment.add(getComment70.getTree());
					}
					break;

			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:95:28: ( WS )*
			loop36:
			while (true) {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( (LA36_0==WS) ) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:95:28: WS
					{
					WS71=(Token)match(input,WS,FOLLOW_WS_in_else_894);  
					stream_WS.add(WS71);

					}
					break;

				default :
					break loop36;
				}
			}

			pushFollow(FOLLOW_commands_in_else_897);
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
			// 95:41: -> ^( ELSE commands ( getComment )? )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:95:44: ^( ELSE commands ( getComment )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ELSE, "ELSE"), root_1);
				adaptor.addChild(root_1, stream_commands.nextTree());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:95:60: ( getComment )?
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:97:1: while_ : ( 'while' ( WS )* expression ( getComment )? ( WS )* do_ ) -> ^( WHILE expression ( getComment )? do_ END ) ;
	public final while_astParser.while__return while_() throws RecognitionException {
		while_astParser.while__return retval = new while_astParser.while__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal73=null;
		Token WS74=null;
		Token WS77=null;
		ParserRuleReturnScope expression75 =null;
		ParserRuleReturnScope getComment76 =null;
		ParserRuleReturnScope do_78 =null;

		Object string_literal73_tree=null;
		Object WS74_tree=null;
		Object WS77_tree=null;
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_do_=new RewriteRuleSubtreeStream(adaptor,"rule do_");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:98:5: ( ( 'while' ( WS )* expression ( getComment )? ( WS )* do_ ) -> ^( WHILE expression ( getComment )? do_ END ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:98:7: ( 'while' ( WS )* expression ( getComment )? ( WS )* do_ )
			{
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:98:7: ( 'while' ( WS )* expression ( getComment )? ( WS )* do_ )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:98:8: 'while' ( WS )* expression ( getComment )? ( WS )* do_
			{
			string_literal73=(Token)match(input,63,FOLLOW_63_in_while_923);  
			stream_63.add(string_literal73);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:98:16: ( WS )*
			loop37:
			while (true) {
				int alt37=2;
				int LA37_0 = input.LA(1);
				if ( (LA37_0==WS) ) {
					alt37=1;
				}

				switch (alt37) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:98:16: WS
					{
					WS74=(Token)match(input,WS,FOLLOW_WS_in_while_925);  
					stream_WS.add(WS74);

					}
					break;

				default :
					break loop37;
				}
			}

			pushFollow(FOLLOW_expression_in_while_928);
			expression75=expression();
			state._fsp--;

			stream_expression.add(expression75.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:98:31: ( getComment )?
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==Comment) ) {
				alt38=1;
			}
			switch (alt38) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:98:31: getComment
					{
					pushFollow(FOLLOW_getComment_in_while_930);
					getComment76=getComment();
					state._fsp--;

					stream_getComment.add(getComment76.getTree());
					}
					break;

			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:98:43: ( WS )*
			loop39:
			while (true) {
				int alt39=2;
				int LA39_0 = input.LA(1);
				if ( (LA39_0==WS) ) {
					alt39=1;
				}

				switch (alt39) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:98:43: WS
					{
					WS77=(Token)match(input,WS,FOLLOW_WS_in_while_933);  
					stream_WS.add(WS77);

					}
					break;

				default :
					break loop39;
				}
			}

			pushFollow(FOLLOW_do__in_while_936);
			do_78=do_();
			state._fsp--;

			stream_do_.add(do_78.getTree());
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
			// 98:52: -> ^( WHILE expression ( getComment )? do_ END )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:98:55: ^( WHILE expression ( getComment )? do_ END )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WHILE, "WHILE"), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:98:74: ( getComment )?
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:101:1: do_ : 'do' ( getComment )? ( WS )* commands ( WS )* 'od' ( getComment )? -> ^( DO commands ( getComment )? ) ;
	public final while_astParser.do__return do_() throws RecognitionException {
		while_astParser.do__return retval = new while_astParser.do__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal79=null;
		Token WS81=null;
		Token WS83=null;
		Token string_literal84=null;
		ParserRuleReturnScope getComment80 =null;
		ParserRuleReturnScope commands82 =null;
		ParserRuleReturnScope getComment85 =null;

		Object string_literal79_tree=null;
		Object WS81_tree=null;
		Object WS83_tree=null;
		Object string_literal84_tree=null;
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:101:6: ( 'do' ( getComment )? ( WS )* commands ( WS )* 'od' ( getComment )? -> ^( DO commands ( getComment )? ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:101:8: 'do' ( getComment )? ( WS )* commands ( WS )* 'od' ( getComment )?
			{
			string_literal79=(Token)match(input,46,FOLLOW_46_in_do_970);  
			stream_46.add(string_literal79);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:101:13: ( getComment )?
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==Comment) ) {
				alt40=1;
			}
			switch (alt40) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:101:13: getComment
					{
					pushFollow(FOLLOW_getComment_in_do_972);
					getComment80=getComment();
					state._fsp--;

					stream_getComment.add(getComment80.getTree());
					}
					break;

			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:101:25: ( WS )*
			loop41:
			while (true) {
				int alt41=2;
				int LA41_0 = input.LA(1);
				if ( (LA41_0==WS) ) {
					alt41=1;
				}

				switch (alt41) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:101:25: WS
					{
					WS81=(Token)match(input,WS,FOLLOW_WS_in_do_975);  
					stream_WS.add(WS81);

					}
					break;

				default :
					break loop41;
				}
			}

			pushFollow(FOLLOW_commands_in_do_978);
			commands82=commands();
			state._fsp--;

			stream_commands.add(commands82.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:101:38: ( WS )*
			loop42:
			while (true) {
				int alt42=2;
				int LA42_0 = input.LA(1);
				if ( (LA42_0==WS) ) {
					alt42=1;
				}

				switch (alt42) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:101:38: WS
					{
					WS83=(Token)match(input,WS,FOLLOW_WS_in_do_980);  
					stream_WS.add(WS83);

					}
					break;

				default :
					break loop42;
				}
			}

			string_literal84=(Token)match(input,59,FOLLOW_59_in_do_983);  
			stream_59.add(string_literal84);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:101:47: ( getComment )?
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==Comment) ) {
				alt43=1;
			}
			switch (alt43) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:101:47: getComment
					{
					pushFollow(FOLLOW_getComment_in_do_985);
					getComment85=getComment();
					state._fsp--;

					stream_getComment.add(getComment85.getTree());
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
			// 101:59: -> ^( DO commands ( getComment )? )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:101:62: ^( DO commands ( getComment )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DO, "DO"), root_1);
				adaptor.addChild(root_1, stream_commands.nextTree());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:101:77: ( getComment )?
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:103:1: for_ : ( 'for' ( WS )* expression ( getComment )? ( WS )* do_ ) -> ^( FOR expression do_ END ) ;
	public final while_astParser.for__return for_() throws RecognitionException {
		while_astParser.for__return retval = new while_astParser.for__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal86=null;
		Token WS87=null;
		Token WS90=null;
		ParserRuleReturnScope expression88 =null;
		ParserRuleReturnScope getComment89 =null;
		ParserRuleReturnScope do_91 =null;

		Object string_literal86_tree=null;
		Object WS87_tree=null;
		Object WS90_tree=null;
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_do_=new RewriteRuleSubtreeStream(adaptor,"rule do_");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:104:5: ( ( 'for' ( WS )* expression ( getComment )? ( WS )* do_ ) -> ^( FOR expression do_ END ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:104:7: ( 'for' ( WS )* expression ( getComment )? ( WS )* do_ )
			{
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:104:7: ( 'for' ( WS )* expression ( getComment )? ( WS )* do_ )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:104:8: 'for' ( WS )* expression ( getComment )? ( WS )* do_
			{
			string_literal86=(Token)match(input,49,FOLLOW_49_in_for_1011);  
			stream_49.add(string_literal86);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:104:14: ( WS )*
			loop44:
			while (true) {
				int alt44=2;
				int LA44_0 = input.LA(1);
				if ( (LA44_0==WS) ) {
					alt44=1;
				}

				switch (alt44) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:104:14: WS
					{
					WS87=(Token)match(input,WS,FOLLOW_WS_in_for_1013);  
					stream_WS.add(WS87);

					}
					break;

				default :
					break loop44;
				}
			}

			pushFollow(FOLLOW_expression_in_for_1016);
			expression88=expression();
			state._fsp--;

			stream_expression.add(expression88.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:104:29: ( getComment )?
			int alt45=2;
			int LA45_0 = input.LA(1);
			if ( (LA45_0==Comment) ) {
				alt45=1;
			}
			switch (alt45) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:104:29: getComment
					{
					pushFollow(FOLLOW_getComment_in_for_1018);
					getComment89=getComment();
					state._fsp--;

					stream_getComment.add(getComment89.getTree());
					}
					break;

			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:104:41: ( WS )*
			loop46:
			while (true) {
				int alt46=2;
				int LA46_0 = input.LA(1);
				if ( (LA46_0==WS) ) {
					alt46=1;
				}

				switch (alt46) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:104:41: WS
					{
					WS90=(Token)match(input,WS,FOLLOW_WS_in_for_1021);  
					stream_WS.add(WS90);

					}
					break;

				default :
					break loop46;
				}
			}

			pushFollow(FOLLOW_do__in_for_1024);
			do_91=do_();
			state._fsp--;

			stream_do_.add(do_91.getTree());
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
			// 104:50: -> ^( FOR expression do_ END )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:104:53: ^( FOR expression do_ END )
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:107:1: foreach_ : ( 'foreach' ( WS )* Variable ( WS )* 'in' ( WS )* expression ( getComment )? ( WS )* do_ ) -> ^( FOREACH ^( IN Variable expression ) ( getComment )? do_ END ) ;
	public final while_astParser.foreach__return foreach_() throws RecognitionException {
		while_astParser.foreach__return retval = new while_astParser.foreach__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal92=null;
		Token WS93=null;
		Token Variable94=null;
		Token WS95=null;
		Token string_literal96=null;
		Token WS97=null;
		Token WS100=null;
		ParserRuleReturnScope expression98 =null;
		ParserRuleReturnScope getComment99 =null;
		ParserRuleReturnScope do_101 =null;

		Object string_literal92_tree=null;
		Object WS93_tree=null;
		Object Variable94_tree=null;
		Object WS95_tree=null;
		Object string_literal96_tree=null;
		Object WS97_tree=null;
		Object WS100_tree=null;
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_do_=new RewriteRuleSubtreeStream(adaptor,"rule do_");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:108:5: ( ( 'foreach' ( WS )* Variable ( WS )* 'in' ( WS )* expression ( getComment )? ( WS )* do_ ) -> ^( FOREACH ^( IN Variable expression ) ( getComment )? do_ END ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:108:7: ( 'foreach' ( WS )* Variable ( WS )* 'in' ( WS )* expression ( getComment )? ( WS )* do_ )
			{
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:108:7: ( 'foreach' ( WS )* Variable ( WS )* 'in' ( WS )* expression ( getComment )? ( WS )* do_ )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:108:8: 'foreach' ( WS )* Variable ( WS )* 'in' ( WS )* expression ( getComment )? ( WS )* do_
			{
			string_literal92=(Token)match(input,50,FOLLOW_50_in_foreach_1055);  
			stream_50.add(string_literal92);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:108:18: ( WS )*
			loop47:
			while (true) {
				int alt47=2;
				int LA47_0 = input.LA(1);
				if ( (LA47_0==WS) ) {
					alt47=1;
				}

				switch (alt47) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:108:18: WS
					{
					WS93=(Token)match(input,WS,FOLLOW_WS_in_foreach_1057);  
					stream_WS.add(WS93);

					}
					break;

				default :
					break loop47;
				}
			}

			Variable94=(Token)match(input,Variable,FOLLOW_Variable_in_foreach_1060);  
			stream_Variable.add(Variable94);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:108:31: ( WS )*
			loop48:
			while (true) {
				int alt48=2;
				int LA48_0 = input.LA(1);
				if ( (LA48_0==WS) ) {
					alt48=1;
				}

				switch (alt48) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:108:31: WS
					{
					WS95=(Token)match(input,WS,FOLLOW_WS_in_foreach_1062);  
					stream_WS.add(WS95);

					}
					break;

				default :
					break loop48;
				}
			}

			string_literal96=(Token)match(input,54,FOLLOW_54_in_foreach_1065);  
			stream_54.add(string_literal96);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:108:40: ( WS )*
			loop49:
			while (true) {
				int alt49=2;
				int LA49_0 = input.LA(1);
				if ( (LA49_0==WS) ) {
					alt49=1;
				}

				switch (alt49) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:108:40: WS
					{
					WS97=(Token)match(input,WS,FOLLOW_WS_in_foreach_1067);  
					stream_WS.add(WS97);

					}
					break;

				default :
					break loop49;
				}
			}

			pushFollow(FOLLOW_expression_in_foreach_1070);
			expression98=expression();
			state._fsp--;

			stream_expression.add(expression98.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:108:55: ( getComment )?
			int alt50=2;
			int LA50_0 = input.LA(1);
			if ( (LA50_0==Comment) ) {
				alt50=1;
			}
			switch (alt50) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:108:55: getComment
					{
					pushFollow(FOLLOW_getComment_in_foreach_1072);
					getComment99=getComment();
					state._fsp--;

					stream_getComment.add(getComment99.getTree());
					}
					break;

			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:108:67: ( WS )*
			loop51:
			while (true) {
				int alt51=2;
				int LA51_0 = input.LA(1);
				if ( (LA51_0==WS) ) {
					alt51=1;
				}

				switch (alt51) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:108:67: WS
					{
					WS100=(Token)match(input,WS,FOLLOW_WS_in_foreach_1075);  
					stream_WS.add(WS100);

					}
					break;

				default :
					break loop51;
				}
			}

			pushFollow(FOLLOW_do__in_foreach_1078);
			do_101=do_();
			state._fsp--;

			stream_do_.add(do_101.getTree());
			}

			// AST REWRITE
			// elements: expression, getComment, do_, Variable
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 108:76: -> ^( FOREACH ^( IN Variable expression ) ( getComment )? do_ END )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:108:79: ^( FOREACH ^( IN Variable expression ) ( getComment )? do_ END )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOREACH, "FOREACH"), root_1);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:108:89: ^( IN Variable expression )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(IN, "IN"), root_2);
				adaptor.addChild(root_2, stream_Variable.nextNode());
				adaptor.addChild(root_2, stream_expression.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:108:115: ( getComment )?
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:111:1: vars : Variable ( ',' ( WS )* vars )? -> Variable ( vars )* ;
	public final while_astParser.vars_return vars() throws RecognitionException {
		while_astParser.vars_return retval = new while_astParser.vars_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Variable102=null;
		Token char_literal103=null;
		Token WS104=null;
		ParserRuleReturnScope vars105 =null;

		Object Variable102_tree=null;
		Object char_literal103_tree=null;
		Object WS104_tree=null;
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:112:5: ( Variable ( ',' ( WS )* vars )? -> Variable ( vars )* )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:112:7: Variable ( ',' ( WS )* vars )?
			{
			Variable102=(Token)match(input,Variable,FOLLOW_Variable_in_vars1117);  
			stream_Variable.add(Variable102);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:112:16: ( ',' ( WS )* vars )?
			int alt53=2;
			int LA53_0 = input.LA(1);
			if ( (LA53_0==40) ) {
				alt53=1;
			}
			switch (alt53) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:112:17: ',' ( WS )* vars
					{
					char_literal103=(Token)match(input,40,FOLLOW_40_in_vars1120);  
					stream_40.add(char_literal103);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:112:20: ( WS )*
					loop52:
					while (true) {
						int alt52=2;
						int LA52_0 = input.LA(1);
						if ( (LA52_0==WS) ) {
							alt52=1;
						}

						switch (alt52) {
						case 1 :
							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:112:20: WS
							{
							WS104=(Token)match(input,WS,FOLLOW_WS_in_vars1121);  
							stream_WS.add(WS104);

							}
							break;

						default :
							break loop52;
						}
					}

					pushFollow(FOLLOW_vars_in_vars1124);
					vars105=vars();
					state._fsp--;

					stream_vars.add(vars105.getTree());
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
			// 112:31: -> Variable ( vars )*
			{
				adaptor.addChild(root_0, stream_Variable.nextNode());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:112:43: ( vars )*
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:115:1: exprs : expression ( ',' ( WS )* exprs )? -> expression ( exprs )* ;
	public final while_astParser.exprs_return exprs() throws RecognitionException {
		while_astParser.exprs_return retval = new while_astParser.exprs_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal107=null;
		Token WS108=null;
		ParserRuleReturnScope expression106 =null;
		ParserRuleReturnScope exprs109 =null;

		Object char_literal107_tree=null;
		Object WS108_tree=null;
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:116:5: ( expression ( ',' ( WS )* exprs )? -> expression ( exprs )* )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:116:7: expression ( ',' ( WS )* exprs )?
			{
			pushFollow(FOLLOW_expression_in_exprs1150);
			expression106=expression();
			state._fsp--;

			stream_expression.add(expression106.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:116:18: ( ',' ( WS )* exprs )?
			int alt55=2;
			int LA55_0 = input.LA(1);
			if ( (LA55_0==40) ) {
				alt55=1;
			}
			switch (alt55) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:116:19: ',' ( WS )* exprs
					{
					char_literal107=(Token)match(input,40,FOLLOW_40_in_exprs1153);  
					stream_40.add(char_literal107);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:116:22: ( WS )*
					loop54:
					while (true) {
						int alt54=2;
						int LA54_0 = input.LA(1);
						if ( (LA54_0==WS) ) {
							alt54=1;
						}

						switch (alt54) {
						case 1 :
							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:116:22: WS
							{
							WS108=(Token)match(input,WS,FOLLOW_WS_in_exprs1154);  
							stream_WS.add(WS108);

							}
							break;

						default :
							break loop54;
						}
					}

					pushFollow(FOLLOW_exprs_in_exprs1157);
					exprs109=exprs();
					state._fsp--;

					stream_exprs.add(exprs109.getTree());
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
			// 116:34: -> expression ( exprs )*
			{
				adaptor.addChild(root_0, stream_expression.nextTree());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:116:48: ( exprs )*
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:119:1: exprBase : ( nil_ | variable | cons | list | hd | tl | symbolExpr | notVar );
	public final while_astParser.exprBase_return exprBase() throws RecognitionException {
		while_astParser.exprBase_return retval = new while_astParser.exprBase_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope nil_110 =null;
		ParserRuleReturnScope variable111 =null;
		ParserRuleReturnScope cons112 =null;
		ParserRuleReturnScope list113 =null;
		ParserRuleReturnScope hd114 =null;
		ParserRuleReturnScope tl115 =null;
		ParserRuleReturnScope symbolExpr116 =null;
		ParserRuleReturnScope notVar117 =null;


		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:119:12: ( nil_ | variable | cons | list | hd | tl | symbolExpr | notVar )
			int alt56=8;
			alt56 = dfa56.predict(input);
			switch (alt56) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:119:15: nil_
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_nil__in_exprBase1182);
					nil_110=nil_();
					state._fsp--;

					adaptor.addChild(root_0, nil_110.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:120:7: variable
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_variable_in_exprBase1190);
					variable111=variable();
					state._fsp--;

					adaptor.addChild(root_0, variable111.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:121:7: cons
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_cons_in_exprBase1198);
					cons112=cons();
					state._fsp--;

					adaptor.addChild(root_0, cons112.getTree());

					}
					break;
				case 4 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:121:14: list
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_list_in_exprBase1202);
					list113=list();
					state._fsp--;

					adaptor.addChild(root_0, list113.getTree());

					}
					break;
				case 5 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:122:7: hd
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_hd_in_exprBase1210);
					hd114=hd();
					state._fsp--;

					adaptor.addChild(root_0, hd114.getTree());

					}
					break;
				case 6 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:122:12: tl
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_tl_in_exprBase1214);
					tl115=tl();
					state._fsp--;

					adaptor.addChild(root_0, tl115.getTree());

					}
					break;
				case 7 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:123:7: symbolExpr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_symbolExpr_in_exprBase1222);
					symbolExpr116=symbolExpr();
					state._fsp--;

					adaptor.addChild(root_0, symbolExpr116.getTree());

					}
					break;
				case 8 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:124:7: notVar
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_notVar_in_exprBase1230);
					notVar117=notVar();
					state._fsp--;

					adaptor.addChild(root_0, notVar117.getTree());

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:127:1: nil_ : ( 'nil' ) -> 'nil' ;
	public final while_astParser.nil__return nil_() throws RecognitionException {
		while_astParser.nil__return retval = new while_astParser.nil__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal118=null;

		Object string_literal118_tree=null;
		RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:127:6: ( ( 'nil' ) -> 'nil' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:127:8: ( 'nil' )
			{
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:127:8: ( 'nil' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:127:9: 'nil'
			{
			string_literal118=(Token)match(input,56,FOLLOW_56_in_nil_1248);  
			stream_56.add(string_literal118);

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
			// 127:16: -> 'nil'
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

		Token Variable119=null;

		Object Variable119_tree=null;
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:129:9: ( Variable -> Variable )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:129:11: Variable
			{
			Variable119=(Token)match(input,Variable,FOLLOW_Variable_in_variable1265);  
			stream_Variable.add(Variable119);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:131:1: cons : '(' ( WS )* 'cons ' lExpr ( WS )* ')' -> ^( CONS lExpr ) ;
	public final while_astParser.cons_return cons() throws RecognitionException {
		while_astParser.cons_return retval = new while_astParser.cons_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal120=null;
		Token WS121=null;
		Token string_literal122=null;
		Token WS124=null;
		Token char_literal125=null;
		ParserRuleReturnScope lExpr123 =null;

		Object char_literal120_tree=null;
		Object WS121_tree=null;
		Object string_literal122_tree=null;
		Object WS124_tree=null;
		Object char_literal125_tree=null;
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_lExpr=new RewriteRuleSubtreeStream(adaptor,"rule lExpr");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:131:6: ( '(' ( WS )* 'cons ' lExpr ( WS )* ')' -> ^( CONS lExpr ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:131:8: '(' ( WS )* 'cons ' lExpr ( WS )* ')'
			{
			char_literal120=(Token)match(input,38,FOLLOW_38_in_cons1277);  
			stream_38.add(char_literal120);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:131:12: ( WS )*
			loop57:
			while (true) {
				int alt57=2;
				int LA57_0 = input.LA(1);
				if ( (LA57_0==WS) ) {
					alt57=1;
				}

				switch (alt57) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:131:12: WS
					{
					WS121=(Token)match(input,WS,FOLLOW_WS_in_cons1279);  
					stream_WS.add(WS121);

					}
					break;

				default :
					break loop57;
				}
			}

			string_literal122=(Token)match(input,45,FOLLOW_45_in_cons1282);  
			stream_45.add(string_literal122);

			pushFollow(FOLLOW_lExpr_in_cons1284);
			lExpr123=lExpr();
			state._fsp--;

			stream_lExpr.add(lExpr123.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:131:30: ( WS )*
			loop58:
			while (true) {
				int alt58=2;
				int LA58_0 = input.LA(1);
				if ( (LA58_0==WS) ) {
					alt58=1;
				}

				switch (alt58) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:131:30: WS
					{
					WS124=(Token)match(input,WS,FOLLOW_WS_in_cons1286);  
					stream_WS.add(WS124);

					}
					break;

				default :
					break loop58;
				}
			}

			char_literal125=(Token)match(input,39,FOLLOW_39_in_cons1289);  
			stream_39.add(char_literal125);

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
			// 131:38: -> ^( CONS lExpr )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:131:41: ^( CONS lExpr )
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:132:1: list : '(' ( WS )* 'list ' lExpr ( WS )* ')' -> ^( LIST lExpr ) ;
	public final while_astParser.list_return list() throws RecognitionException {
		while_astParser.list_return retval = new while_astParser.list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal126=null;
		Token WS127=null;
		Token string_literal128=null;
		Token WS130=null;
		Token char_literal131=null;
		ParserRuleReturnScope lExpr129 =null;

		Object char_literal126_tree=null;
		Object WS127_tree=null;
		Object string_literal128_tree=null;
		Object WS130_tree=null;
		Object char_literal131_tree=null;
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_lExpr=new RewriteRuleSubtreeStream(adaptor,"rule lExpr");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:132:6: ( '(' ( WS )* 'list ' lExpr ( WS )* ')' -> ^( LIST lExpr ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:132:8: '(' ( WS )* 'list ' lExpr ( WS )* ')'
			{
			char_literal126=(Token)match(input,38,FOLLOW_38_in_list1305);  
			stream_38.add(char_literal126);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:132:11: ( WS )*
			loop59:
			while (true) {
				int alt59=2;
				int LA59_0 = input.LA(1);
				if ( (LA59_0==WS) ) {
					alt59=1;
				}

				switch (alt59) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:132:11: WS
					{
					WS127=(Token)match(input,WS,FOLLOW_WS_in_list1306);  
					stream_WS.add(WS127);

					}
					break;

				default :
					break loop59;
				}
			}

			string_literal128=(Token)match(input,55,FOLLOW_55_in_list1309);  
			stream_55.add(string_literal128);

			pushFollow(FOLLOW_lExpr_in_list1311);
			lExpr129=lExpr();
			state._fsp--;

			stream_lExpr.add(lExpr129.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:132:29: ( WS )*
			loop60:
			while (true) {
				int alt60=2;
				int LA60_0 = input.LA(1);
				if ( (LA60_0==WS) ) {
					alt60=1;
				}

				switch (alt60) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:132:29: WS
					{
					WS130=(Token)match(input,WS,FOLLOW_WS_in_list1313);  
					stream_WS.add(WS130);

					}
					break;

				default :
					break loop60;
				}
			}

			char_literal131=(Token)match(input,39,FOLLOW_39_in_list1316);  
			stream_39.add(char_literal131);

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
			// 132:37: -> ^( LIST lExpr )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:132:40: ^( LIST lExpr )
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:134:1: hd : '(' ( WS )* 'hd ' exprBase ( WS )* ')' -> ^( HD exprBase ) ;
	public final while_astParser.hd_return hd() throws RecognitionException {
		while_astParser.hd_return retval = new while_astParser.hd_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal132=null;
		Token WS133=null;
		Token string_literal134=null;
		Token WS136=null;
		Token char_literal137=null;
		ParserRuleReturnScope exprBase135 =null;

		Object char_literal132_tree=null;
		Object WS133_tree=null;
		Object string_literal134_tree=null;
		Object WS136_tree=null;
		Object char_literal137_tree=null;
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
		RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:134:4: ( '(' ( WS )* 'hd ' exprBase ( WS )* ')' -> ^( HD exprBase ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:134:6: '(' ( WS )* 'hd ' exprBase ( WS )* ')'
			{
			char_literal132=(Token)match(input,38,FOLLOW_38_in_hd1332);  
			stream_38.add(char_literal132);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:134:9: ( WS )*
			loop61:
			while (true) {
				int alt61=2;
				int LA61_0 = input.LA(1);
				if ( (LA61_0==WS) ) {
					alt61=1;
				}

				switch (alt61) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:134:9: WS
					{
					WS133=(Token)match(input,WS,FOLLOW_WS_in_hd1333);  
					stream_WS.add(WS133);

					}
					break;

				default :
					break loop61;
				}
			}

			string_literal134=(Token)match(input,52,FOLLOW_52_in_hd1336);  
			stream_52.add(string_literal134);

			pushFollow(FOLLOW_exprBase_in_hd1338);
			exprBase135=exprBase();
			state._fsp--;

			stream_exprBase.add(exprBase135.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:134:28: ( WS )*
			loop62:
			while (true) {
				int alt62=2;
				int LA62_0 = input.LA(1);
				if ( (LA62_0==WS) ) {
					alt62=1;
				}

				switch (alt62) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:134:28: WS
					{
					WS136=(Token)match(input,WS,FOLLOW_WS_in_hd1340);  
					stream_WS.add(WS136);

					}
					break;

				default :
					break loop62;
				}
			}

			char_literal137=(Token)match(input,39,FOLLOW_39_in_hd1342);  
			stream_39.add(char_literal137);

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
			// 134:35: -> ^( HD exprBase )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:134:38: ^( HD exprBase )
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:136:1: tl : '(' ( WS )* 'tl ' exprBase ( WS )* ')' -> ^( TL exprBase ) ;
	public final while_astParser.tl_return tl() throws RecognitionException {
		while_astParser.tl_return retval = new while_astParser.tl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal138=null;
		Token WS139=null;
		Token string_literal140=null;
		Token WS142=null;
		Token char_literal143=null;
		ParserRuleReturnScope exprBase141 =null;

		Object char_literal138_tree=null;
		Object WS139_tree=null;
		Object string_literal140_tree=null;
		Object WS142_tree=null;
		Object char_literal143_tree=null;
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
		RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:136:4: ( '(' ( WS )* 'tl ' exprBase ( WS )* ')' -> ^( TL exprBase ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:136:6: '(' ( WS )* 'tl ' exprBase ( WS )* ')'
			{
			char_literal138=(Token)match(input,38,FOLLOW_38_in_tl1358);  
			stream_38.add(char_literal138);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:136:10: ( WS )*
			loop63:
			while (true) {
				int alt63=2;
				int LA63_0 = input.LA(1);
				if ( (LA63_0==WS) ) {
					alt63=1;
				}

				switch (alt63) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:136:10: WS
					{
					WS139=(Token)match(input,WS,FOLLOW_WS_in_tl1360);  
					stream_WS.add(WS139);

					}
					break;

				default :
					break loop63;
				}
			}

			string_literal140=(Token)match(input,62,FOLLOW_62_in_tl1362);  
			stream_62.add(string_literal140);

			pushFollow(FOLLOW_exprBase_in_tl1364);
			exprBase141=exprBase();
			state._fsp--;

			stream_exprBase.add(exprBase141.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:136:28: ( WS )*
			loop64:
			while (true) {
				int alt64=2;
				int LA64_0 = input.LA(1);
				if ( (LA64_0==WS) ) {
					alt64=1;
				}

				switch (alt64) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:136:28: WS
					{
					WS142=(Token)match(input,WS,FOLLOW_WS_in_tl1366);  
					stream_WS.add(WS142);

					}
					break;

				default :
					break loop64;
				}
			}

			char_literal143=(Token)match(input,39,FOLLOW_39_in_tl1368);  
			stream_39.add(char_literal143);

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
			// 136:35: -> ^( TL exprBase )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:136:38: ^( TL exprBase )
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:138:1: symbolExpr : '(' ( WS )* Symbol ( WS )* ( lExpr )? ( WS )* ')' -> ^( CALL Symbol ( lExpr )? ) ;
	public final while_astParser.symbolExpr_return symbolExpr() throws RecognitionException {
		while_astParser.symbolExpr_return retval = new while_astParser.symbolExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal144=null;
		Token WS145=null;
		Token Symbol146=null;
		Token WS147=null;
		Token WS149=null;
		Token char_literal150=null;
		ParserRuleReturnScope lExpr148 =null;

		Object char_literal144_tree=null;
		Object WS145_tree=null;
		Object Symbol146_tree=null;
		Object WS147_tree=null;
		Object WS149_tree=null;
		Object char_literal150_tree=null;
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_Symbol=new RewriteRuleTokenStream(adaptor,"token Symbol");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_lExpr=new RewriteRuleSubtreeStream(adaptor,"rule lExpr");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:139:2: ( '(' ( WS )* Symbol ( WS )* ( lExpr )? ( WS )* ')' -> ^( CALL Symbol ( lExpr )? ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:139:4: '(' ( WS )* Symbol ( WS )* ( lExpr )? ( WS )* ')'
			{
			char_literal144=(Token)match(input,38,FOLLOW_38_in_symbolExpr1385);  
			stream_38.add(char_literal144);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:139:8: ( WS )*
			loop65:
			while (true) {
				int alt65=2;
				int LA65_0 = input.LA(1);
				if ( (LA65_0==WS) ) {
					alt65=1;
				}

				switch (alt65) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:139:8: WS
					{
					WS145=(Token)match(input,WS,FOLLOW_WS_in_symbolExpr1387);  
					stream_WS.add(WS145);

					}
					break;

				default :
					break loop65;
				}
			}

			Symbol146=(Token)match(input,Symbol,FOLLOW_Symbol_in_symbolExpr1390);  
			stream_Symbol.add(Symbol146);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:139:19: ( WS )*
			loop66:
			while (true) {
				int alt66=2;
				int LA66_0 = input.LA(1);
				if ( (LA66_0==WS) ) {
					alt66=1;
				}

				switch (alt66) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:139:19: WS
					{
					WS147=(Token)match(input,WS,FOLLOW_WS_in_symbolExpr1392);  
					stream_WS.add(WS147);

					}
					break;

				default :
					break loop66;
				}
			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:139:23: ( lExpr )?
			int alt67=2;
			int LA67_0 = input.LA(1);
			if ( (LA67_0==Variable||LA67_0==38||LA67_0==56) ) {
				alt67=1;
			}
			switch (alt67) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:139:23: lExpr
					{
					pushFollow(FOLLOW_lExpr_in_symbolExpr1395);
					lExpr148=lExpr();
					state._fsp--;

					stream_lExpr.add(lExpr148.getTree());
					}
					break;

			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:139:30: ( WS )*
			loop68:
			while (true) {
				int alt68=2;
				int LA68_0 = input.LA(1);
				if ( (LA68_0==WS) ) {
					alt68=1;
				}

				switch (alt68) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:139:30: WS
					{
					WS149=(Token)match(input,WS,FOLLOW_WS_in_symbolExpr1398);  
					stream_WS.add(WS149);

					}
					break;

				default :
					break loop68;
				}
			}

			char_literal150=(Token)match(input,39,FOLLOW_39_in_symbolExpr1400);  
			stream_39.add(char_literal150);

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
			// 139:37: -> ^( CALL Symbol ( lExpr )? )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:139:40: ^( CALL Symbol ( lExpr )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CALL, "CALL"), root_1);
				adaptor.addChild(root_1, stream_Symbol.nextNode());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:139:54: ( lExpr )?
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:141:1: notVar : '(' ( WS )* 'not' ( WS )* Variable ( WS )* ')' -> ^( NOT Variable ) ;
	public final while_astParser.notVar_return notVar() throws RecognitionException {
		while_astParser.notVar_return retval = new while_astParser.notVar_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal151=null;
		Token WS152=null;
		Token string_literal153=null;
		Token WS154=null;
		Token Variable155=null;
		Token WS156=null;
		Token char_literal157=null;

		Object char_literal151_tree=null;
		Object WS152_tree=null;
		Object string_literal153_tree=null;
		Object WS154_tree=null;
		Object Variable155_tree=null;
		Object WS156_tree=null;
		Object char_literal157_tree=null;
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:141:8: ( '(' ( WS )* 'not' ( WS )* Variable ( WS )* ')' -> ^( NOT Variable ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:141:10: '(' ( WS )* 'not' ( WS )* Variable ( WS )* ')'
			{
			char_literal151=(Token)match(input,38,FOLLOW_38_in_notVar1420);  
			stream_38.add(char_literal151);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:141:13: ( WS )*
			loop69:
			while (true) {
				int alt69=2;
				int LA69_0 = input.LA(1);
				if ( (LA69_0==WS) ) {
					alt69=1;
				}

				switch (alt69) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:141:13: WS
					{
					WS152=(Token)match(input,WS,FOLLOW_WS_in_notVar1421);  
					stream_WS.add(WS152);

					}
					break;

				default :
					break loop69;
				}
			}

			string_literal153=(Token)match(input,58,FOLLOW_58_in_notVar1423);  
			stream_58.add(string_literal153);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:141:22: ( WS )*
			loop70:
			while (true) {
				int alt70=2;
				int LA70_0 = input.LA(1);
				if ( (LA70_0==WS) ) {
					alt70=1;
				}

				switch (alt70) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:141:22: WS
					{
					WS154=(Token)match(input,WS,FOLLOW_WS_in_notVar1425);  
					stream_WS.add(WS154);

					}
					break;

				default :
					break loop70;
				}
			}

			Variable155=(Token)match(input,Variable,FOLLOW_Variable_in_notVar1428);  
			stream_Variable.add(Variable155);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:141:35: ( WS )*
			loop71:
			while (true) {
				int alt71=2;
				int LA71_0 = input.LA(1);
				if ( (LA71_0==WS) ) {
					alt71=1;
				}

				switch (alt71) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:141:35: WS
					{
					WS156=(Token)match(input,WS,FOLLOW_WS_in_notVar1430);  
					stream_WS.add(WS156);

					}
					break;

				default :
					break loop71;
				}
			}

			char_literal157=(Token)match(input,39,FOLLOW_39_in_notVar1432);  
			stream_39.add(char_literal157);

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
			// 141:42: -> ^( NOT Variable )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:141:45: ^( NOT Variable )
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:143:1: expression : lExpr ( ( WS )* '=?' ( WS )* lExpr )? -> ^( EXPR lExpr ( lExpr )? ) ;
	public final while_astParser.expression_return expression() throws RecognitionException {
		while_astParser.expression_return retval = new while_astParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WS159=null;
		Token string_literal160=null;
		Token WS161=null;
		ParserRuleReturnScope lExpr158 =null;
		ParserRuleReturnScope lExpr162 =null;

		Object WS159_tree=null;
		Object string_literal160_tree=null;
		Object WS161_tree=null;
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_lExpr=new RewriteRuleSubtreeStream(adaptor,"rule lExpr");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:144:5: ( lExpr ( ( WS )* '=?' ( WS )* lExpr )? -> ^( EXPR lExpr ( lExpr )? ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:144:7: lExpr ( ( WS )* '=?' ( WS )* lExpr )?
			{
			pushFollow(FOLLOW_lExpr_in_expression1453);
			lExpr158=lExpr();
			state._fsp--;

			stream_lExpr.add(lExpr158.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:144:13: ( ( WS )* '=?' ( WS )* lExpr )?
			int alt74=2;
			alt74 = dfa74.predict(input);
			switch (alt74) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:144:14: ( WS )* '=?' ( WS )* lExpr
					{
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:144:14: ( WS )*
					loop72:
					while (true) {
						int alt72=2;
						int LA72_0 = input.LA(1);
						if ( (LA72_0==WS) ) {
							alt72=1;
						}

						switch (alt72) {
						case 1 :
							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:144:14: WS
							{
							WS159=(Token)match(input,WS,FOLLOW_WS_in_expression1456);  
							stream_WS.add(WS159);

							}
							break;

						default :
							break loop72;
						}
					}

					string_literal160=(Token)match(input,44,FOLLOW_44_in_expression1459);  
					stream_44.add(string_literal160);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:144:23: ( WS )*
					loop73:
					while (true) {
						int alt73=2;
						int LA73_0 = input.LA(1);
						if ( (LA73_0==WS) ) {
							alt73=1;
						}

						switch (alt73) {
						case 1 :
							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:144:23: WS
							{
							WS161=(Token)match(input,WS,FOLLOW_WS_in_expression1461);  
							stream_WS.add(WS161);

							}
							break;

						default :
							break loop73;
						}
					}

					pushFollow(FOLLOW_lExpr_in_expression1464);
					lExpr162=lExpr();
					state._fsp--;

					stream_lExpr.add(lExpr162.getTree());
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
			// 144:35: -> ^( EXPR lExpr ( lExpr )? )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:144:38: ^( EXPR lExpr ( lExpr )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR, "EXPR"), root_1);
				adaptor.addChild(root_1, stream_lExpr.nextTree());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:144:51: ( lExpr )?
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:148:1: lExpr : exprBase ( ( WS )* lExpr )? -> exprBase ( lExpr )? ;
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

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:149:5: ( exprBase ( ( WS )* lExpr )? -> exprBase ( lExpr )? )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:149:7: exprBase ( ( WS )* lExpr )?
			{
			pushFollow(FOLLOW_exprBase_in_lExpr1499);
			exprBase163=exprBase();
			state._fsp--;

			stream_exprBase.add(exprBase163.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:149:16: ( ( WS )* lExpr )?
			int alt76=2;
			alt76 = dfa76.predict(input);
			switch (alt76) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:149:17: ( WS )* lExpr
					{
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:149:17: ( WS )*
					loop75:
					while (true) {
						int alt75=2;
						int LA75_0 = input.LA(1);
						if ( (LA75_0==WS) ) {
							alt75=1;
						}

						switch (alt75) {
						case 1 :
							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:149:17: WS
							{
							WS164=(Token)match(input,WS,FOLLOW_WS_in_lExpr1502);  
							stream_WS.add(WS164);

							}
							break;

						default :
							break loop75;
						}
					}

					pushFollow(FOLLOW_lExpr_in_lExpr1505);
					lExpr165=lExpr();
					state._fsp--;

					stream_lExpr.add(lExpr165.getTree());
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
			// 149:29: -> exprBase ( lExpr )?
			{
				adaptor.addChild(root_0, stream_exprBase.nextTree());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:149:41: ( lExpr )?
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


	protected DFA22 dfa22 = new DFA22(this);
	protected DFA56 dfa56 = new DFA56(this);
	protected DFA74 dfa74 = new DFA74(this);
	protected DFA76 dfa76 = new DFA76(this);
	static final String DFA22_eotS =
		"\4\uffff";
	static final String DFA22_eofS =
		"\4\uffff";
	static final String DFA22_minS =
		"\2\44\2\uffff";
	static final String DFA22_maxS =
		"\2\73\2\uffff";
	static final String DFA22_acceptS =
		"\2\uffff\1\1\1\2";
	static final String DFA22_specialS =
		"\4\uffff}>";
	static final String[] DFA22_transitionS = {
			"\1\1\1\3\5\uffff\1\2\3\uffff\2\3\12\uffff\1\3",
			"\1\1\1\3\5\uffff\1\2\3\uffff\2\3\12\uffff\1\3",
			"",
			""
	};

	static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
	static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
	static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
	static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
	static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
	static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
	static final short[][] DFA22_transition;

	static {
		int numStates = DFA22_transitionS.length;
		DFA22_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
		}
	}

	protected class DFA22 extends DFA {

		public DFA22(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 22;
			this.eot = DFA22_eot;
			this.eof = DFA22_eof;
			this.min = DFA22_min;
			this.max = DFA22_max;
			this.accept = DFA22_accept;
			this.special = DFA22_special;
			this.transition = DFA22_transition;
		}
		@Override
		public String getDescription() {
			return "79:15: ( ( WS )* ';' ( WS )* commands )?";
		}
	}

	static final String DFA56_eotS =
		"\13\uffff";
	static final String DFA56_eofS =
		"\13\uffff";
	static final String DFA56_minS =
		"\1\42\2\uffff\2\35\6\uffff";
	static final String DFA56_maxS =
		"\1\70\2\uffff\2\76\6\uffff";
	static final String DFA56_acceptS =
		"\1\uffff\1\1\1\2\2\uffff\1\3\1\4\1\5\1\6\1\7\1\10";
	static final String DFA56_specialS =
		"\13\uffff}>";
	static final String[] DFA56_transitionS = {
			"\1\2\3\uffff\1\3\21\uffff\1\1",
			"",
			"",
			"\1\11\6\uffff\1\4\10\uffff\1\5\6\uffff\1\7\2\uffff\1\6\2\uffff\1\12"+
			"\3\uffff\1\10",
			"\1\11\6\uffff\1\4\10\uffff\1\5\6\uffff\1\7\2\uffff\1\6\2\uffff\1\12"+
			"\3\uffff\1\10",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA56_eot = DFA.unpackEncodedString(DFA56_eotS);
	static final short[] DFA56_eof = DFA.unpackEncodedString(DFA56_eofS);
	static final char[] DFA56_min = DFA.unpackEncodedStringToUnsignedChars(DFA56_minS);
	static final char[] DFA56_max = DFA.unpackEncodedStringToUnsignedChars(DFA56_maxS);
	static final short[] DFA56_accept = DFA.unpackEncodedString(DFA56_acceptS);
	static final short[] DFA56_special = DFA.unpackEncodedString(DFA56_specialS);
	static final short[][] DFA56_transition;

	static {
		int numStates = DFA56_transitionS.length;
		DFA56_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA56_transition[i] = DFA.unpackEncodedString(DFA56_transitionS[i]);
		}
	}

	protected class DFA56 extends DFA {

		public DFA56(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 56;
			this.eot = DFA56_eot;
			this.eof = DFA56_eof;
			this.min = DFA56_min;
			this.max = DFA56_max;
			this.accept = DFA56_accept;
			this.special = DFA56_special;
			this.transition = DFA56_transition;
		}
		@Override
		public String getDescription() {
			return "119:1: exprBase : ( nil_ | variable | cons | list | hd | tl | symbolExpr | notVar );";
		}
	}

	static final String DFA74_eotS =
		"\4\uffff";
	static final String DFA74_eofS =
		"\4\uffff";
	static final String DFA74_minS =
		"\1\7\1\44\2\uffff";
	static final String DFA74_maxS =
		"\2\75\2\uffff";
	static final String DFA74_acceptS =
		"\2\uffff\1\1\1\2";
	static final String DFA74_specialS =
		"\4\uffff}>";
	static final String[] DFA74_transitionS = {
			"\1\3\34\uffff\1\1\1\3\2\uffff\1\3\2\uffff\1\3\1\2\1\uffff\3\3\12\uffff"+
			"\1\3\1\uffff\1\3",
			"\1\1\1\3\5\uffff\1\3\1\2\1\uffff\3\3\12\uffff\1\3\1\uffff\1\3",
			"",
			""
	};

	static final short[] DFA74_eot = DFA.unpackEncodedString(DFA74_eotS);
	static final short[] DFA74_eof = DFA.unpackEncodedString(DFA74_eofS);
	static final char[] DFA74_min = DFA.unpackEncodedStringToUnsignedChars(DFA74_minS);
	static final char[] DFA74_max = DFA.unpackEncodedStringToUnsignedChars(DFA74_maxS);
	static final short[] DFA74_accept = DFA.unpackEncodedString(DFA74_acceptS);
	static final short[] DFA74_special = DFA.unpackEncodedString(DFA74_specialS);
	static final short[][] DFA74_transition;

	static {
		int numStates = DFA74_transitionS.length;
		DFA74_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA74_transition[i] = DFA.unpackEncodedString(DFA74_transitionS[i]);
		}
	}

	protected class DFA74 extends DFA {

		public DFA74(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 74;
			this.eot = DFA74_eot;
			this.eof = DFA74_eof;
			this.min = DFA74_min;
			this.max = DFA74_max;
			this.accept = DFA74_accept;
			this.special = DFA74_special;
			this.transition = DFA74_transition;
		}
		@Override
		public String getDescription() {
			return "144:13: ( ( WS )* '=?' ( WS )* lExpr )?";
		}
	}

	static final String DFA76_eotS =
		"\4\uffff";
	static final String DFA76_eofS =
		"\4\uffff";
	static final String DFA76_minS =
		"\1\7\1\42\2\uffff";
	static final String DFA76_maxS =
		"\2\75\2\uffff";
	static final String DFA76_acceptS =
		"\2\uffff\1\1\1\2";
	static final String DFA76_specialS =
		"\4\uffff}>";
	static final String[] DFA76_transitionS = {
			"\1\3\32\uffff\1\2\1\uffff\1\1\1\3\1\2\2\3\2\uffff\2\3\1\uffff\3\3\7\uffff"+
			"\1\2\2\uffff\1\3\1\uffff\1\3",
			"\1\2\1\uffff\1\1\1\3\1\2\1\3\3\uffff\2\3\1\uffff\3\3\7\uffff\1\2\2\uffff"+
			"\1\3\1\uffff\1\3",
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
			return "149:16: ( ( WS )* lExpr )?";
		}
	}

	public static final BitSet FOLLOW_program_in_startProgram222 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Comment_in_getComment401 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_in_program421 = new BitSet(new long[]{0x0008001000000082L});
	public static final BitSet FOLLOW_WS_in_program423 = new BitSet(new long[]{0x0008001000000082L});
	public static final BitSet FOLLOW_program_in_program426 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getComment_in_function456 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_function459 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_Symbol_in_function461 = new BitSet(new long[]{0x0000021000000000L});
	public static final BitSet FOLLOW_WS_in_function463 = new BitSet(new long[]{0x0000021000000000L});
	public static final BitSet FOLLOW_41_in_function466 = new BitSet(new long[]{0x1000001000000080L});
	public static final BitSet FOLLOW_getComment_in_function468 = new BitSet(new long[]{0x1000001000000000L});
	public static final BitSet FOLLOW_WS_in_function471 = new BitSet(new long[]{0x1000001000000000L});
	public static final BitSet FOLLOW_definition_in_function474 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_60_in_definition507 = new BitSet(new long[]{0x0000003400000080L});
	public static final BitSet FOLLOW_WS_in_definition509 = new BitSet(new long[]{0x0000003400000080L});
	public static final BitSet FOLLOW_input_in_definition512 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_definition514 = new BitSet(new long[]{0x8226001400000080L});
	public static final BitSet FOLLOW_getComment_in_definition516 = new BitSet(new long[]{0x8226001400000000L});
	public static final BitSet FOLLOW_WS_in_definition519 = new BitSet(new long[]{0x8226001400000000L});
	public static final BitSet FOLLOW_commands_in_definition522 = new BitSet(new long[]{0x0000003000000000L});
	public static final BitSet FOLLOW_WS_in_definition524 = new BitSet(new long[]{0x0000003000000000L});
	public static final BitSet FOLLOW_37_in_definition527 = new BitSet(new long[]{0x0000001000000080L,0x0000000000000001L});
	public static final BitSet FOLLOW_getComment_in_definition529 = new BitSet(new long[]{0x0000001000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_WS_in_definition532 = new BitSet(new long[]{0x0000001000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_64_in_definition535 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_output_in_definition537 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_getComment_in_definition539 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inputSub_in_input571 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_getComment_in_input574 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_inputSub605 = new BitSet(new long[]{0x0000011000000002L});
	public static final BitSet FOLLOW_WS_in_inputSub607 = new BitSet(new long[]{0x0000011000000002L});
	public static final BitSet FOLLOW_40_in_inputSub611 = new BitSet(new long[]{0x0000001400000000L});
	public static final BitSet FOLLOW_WS_in_inputSub613 = new BitSet(new long[]{0x0000001400000000L});
	public static final BitSet FOLLOW_inputSub_in_inputSub616 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_output643 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_40_in_output646 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_output_in_output648 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_in_commands678 = new BitSet(new long[]{0x0000081000000002L});
	public static final BitSet FOLLOW_WS_in_commands682 = new BitSet(new long[]{0x0000081000000000L});
	public static final BitSet FOLLOW_43_in_commands685 = new BitSet(new long[]{0x8226001400000000L});
	public static final BitSet FOLLOW_WS_in_commands687 = new BitSet(new long[]{0x8226001400000000L});
	public static final BitSet FOLLOW_commands_in_commands690 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_command717 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decl_in_command721 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if__in_command725 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_for__in_command729 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_while__in_command733 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foreach__in_command737 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vars_in_decl751 = new BitSet(new long[]{0x0000041000000000L});
	public static final BitSet FOLLOW_WS_in_decl753 = new BitSet(new long[]{0x0000041000000000L});
	public static final BitSet FOLLOW_42_in_decl756 = new BitSet(new long[]{0x0100005400000000L});
	public static final BitSet FOLLOW_WS_in_decl758 = new BitSet(new long[]{0x0100005400000000L});
	public static final BitSet FOLLOW_exprs_in_decl761 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_getComment_in_decl764 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_if_798 = new BitSet(new long[]{0x0100005400000000L});
	public static final BitSet FOLLOW_WS_in_if_800 = new BitSet(new long[]{0x0100005400000000L});
	public static final BitSet FOLLOW_expression_in_if_803 = new BitSet(new long[]{0x2000001000000000L});
	public static final BitSet FOLLOW_WS_in_if_805 = new BitSet(new long[]{0x2000001000000000L});
	public static final BitSet FOLLOW_then__in_if_808 = new BitSet(new long[]{0x0001801000000000L});
	public static final BitSet FOLLOW_WS_in_if_810 = new BitSet(new long[]{0x0001801000000000L});
	public static final BitSet FOLLOW_else__in_if_814 = new BitSet(new long[]{0x0001001000000000L});
	public static final BitSet FOLLOW_WS_in_if_816 = new BitSet(new long[]{0x0001001000000000L});
	public static final BitSet FOLLOW_48_in_if_821 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_getComment_in_if_823 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_61_in_then_861 = new BitSet(new long[]{0x8226001400000080L});
	public static final BitSet FOLLOW_getComment_in_then_863 = new BitSet(new long[]{0x8226001400000000L});
	public static final BitSet FOLLOW_WS_in_then_866 = new BitSet(new long[]{0x8226001400000000L});
	public static final BitSet FOLLOW_commands_in_then_869 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_else_889 = new BitSet(new long[]{0x8226001400000080L});
	public static final BitSet FOLLOW_getComment_in_else_891 = new BitSet(new long[]{0x8226001400000000L});
	public static final BitSet FOLLOW_WS_in_else_894 = new BitSet(new long[]{0x8226001400000000L});
	public static final BitSet FOLLOW_commands_in_else_897 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_63_in_while_923 = new BitSet(new long[]{0x0100005400000000L});
	public static final BitSet FOLLOW_WS_in_while_925 = new BitSet(new long[]{0x0100005400000000L});
	public static final BitSet FOLLOW_expression_in_while_928 = new BitSet(new long[]{0x0000401000000080L});
	public static final BitSet FOLLOW_getComment_in_while_930 = new BitSet(new long[]{0x0000401000000000L});
	public static final BitSet FOLLOW_WS_in_while_933 = new BitSet(new long[]{0x0000401000000000L});
	public static final BitSet FOLLOW_do__in_while_936 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_do_970 = new BitSet(new long[]{0x8226001400000080L});
	public static final BitSet FOLLOW_getComment_in_do_972 = new BitSet(new long[]{0x8226001400000000L});
	public static final BitSet FOLLOW_WS_in_do_975 = new BitSet(new long[]{0x8226001400000000L});
	public static final BitSet FOLLOW_commands_in_do_978 = new BitSet(new long[]{0x0800001000000000L});
	public static final BitSet FOLLOW_WS_in_do_980 = new BitSet(new long[]{0x0800001000000000L});
	public static final BitSet FOLLOW_59_in_do_983 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_getComment_in_do_985 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_for_1011 = new BitSet(new long[]{0x0100005400000000L});
	public static final BitSet FOLLOW_WS_in_for_1013 = new BitSet(new long[]{0x0100005400000000L});
	public static final BitSet FOLLOW_expression_in_for_1016 = new BitSet(new long[]{0x0000401000000080L});
	public static final BitSet FOLLOW_getComment_in_for_1018 = new BitSet(new long[]{0x0000401000000000L});
	public static final BitSet FOLLOW_WS_in_for_1021 = new BitSet(new long[]{0x0000401000000000L});
	public static final BitSet FOLLOW_do__in_for_1024 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_foreach_1055 = new BitSet(new long[]{0x0000001400000000L});
	public static final BitSet FOLLOW_WS_in_foreach_1057 = new BitSet(new long[]{0x0000001400000000L});
	public static final BitSet FOLLOW_Variable_in_foreach_1060 = new BitSet(new long[]{0x0040001000000000L});
	public static final BitSet FOLLOW_WS_in_foreach_1062 = new BitSet(new long[]{0x0040001000000000L});
	public static final BitSet FOLLOW_54_in_foreach_1065 = new BitSet(new long[]{0x0100005400000000L});
	public static final BitSet FOLLOW_WS_in_foreach_1067 = new BitSet(new long[]{0x0100005400000000L});
	public static final BitSet FOLLOW_expression_in_foreach_1070 = new BitSet(new long[]{0x0000401000000080L});
	public static final BitSet FOLLOW_getComment_in_foreach_1072 = new BitSet(new long[]{0x0000401000000000L});
	public static final BitSet FOLLOW_WS_in_foreach_1075 = new BitSet(new long[]{0x0000401000000000L});
	public static final BitSet FOLLOW_do__in_foreach_1078 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_vars1117 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_40_in_vars1120 = new BitSet(new long[]{0x0000001400000000L});
	public static final BitSet FOLLOW_WS_in_vars1121 = new BitSet(new long[]{0x0000001400000000L});
	public static final BitSet FOLLOW_vars_in_vars1124 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_exprs1150 = new BitSet(new long[]{0x0000010000000002L});
	public static final BitSet FOLLOW_40_in_exprs1153 = new BitSet(new long[]{0x0100005400000000L});
	public static final BitSet FOLLOW_WS_in_exprs1154 = new BitSet(new long[]{0x0100005400000000L});
	public static final BitSet FOLLOW_exprs_in_exprs1157 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nil__in_exprBase1182 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_exprBase1190 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cons_in_exprBase1198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_list_in_exprBase1202 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_hd_in_exprBase1210 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tl_in_exprBase1214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_symbolExpr_in_exprBase1222 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_notVar_in_exprBase1230 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_nil_1248 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_variable1265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_cons1277 = new BitSet(new long[]{0x0000201000000000L});
	public static final BitSet FOLLOW_WS_in_cons1279 = new BitSet(new long[]{0x0000201000000000L});
	public static final BitSet FOLLOW_45_in_cons1282 = new BitSet(new long[]{0x0100004400000000L});
	public static final BitSet FOLLOW_lExpr_in_cons1284 = new BitSet(new long[]{0x0000009000000000L});
	public static final BitSet FOLLOW_WS_in_cons1286 = new BitSet(new long[]{0x0000009000000000L});
	public static final BitSet FOLLOW_39_in_cons1289 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_list1305 = new BitSet(new long[]{0x0080001000000000L});
	public static final BitSet FOLLOW_WS_in_list1306 = new BitSet(new long[]{0x0080001000000000L});
	public static final BitSet FOLLOW_55_in_list1309 = new BitSet(new long[]{0x0100004400000000L});
	public static final BitSet FOLLOW_lExpr_in_list1311 = new BitSet(new long[]{0x0000009000000000L});
	public static final BitSet FOLLOW_WS_in_list1313 = new BitSet(new long[]{0x0000009000000000L});
	public static final BitSet FOLLOW_39_in_list1316 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_hd1332 = new BitSet(new long[]{0x0010001000000000L});
	public static final BitSet FOLLOW_WS_in_hd1333 = new BitSet(new long[]{0x0010001000000000L});
	public static final BitSet FOLLOW_52_in_hd1336 = new BitSet(new long[]{0x0100004400000000L});
	public static final BitSet FOLLOW_exprBase_in_hd1338 = new BitSet(new long[]{0x0000009000000000L});
	public static final BitSet FOLLOW_WS_in_hd1340 = new BitSet(new long[]{0x0000009000000000L});
	public static final BitSet FOLLOW_39_in_hd1342 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_tl1358 = new BitSet(new long[]{0x4000001000000000L});
	public static final BitSet FOLLOW_WS_in_tl1360 = new BitSet(new long[]{0x4000001000000000L});
	public static final BitSet FOLLOW_62_in_tl1362 = new BitSet(new long[]{0x0100004400000000L});
	public static final BitSet FOLLOW_exprBase_in_tl1364 = new BitSet(new long[]{0x0000009000000000L});
	public static final BitSet FOLLOW_WS_in_tl1366 = new BitSet(new long[]{0x0000009000000000L});
	public static final BitSet FOLLOW_39_in_tl1368 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_symbolExpr1385 = new BitSet(new long[]{0x0000001020000000L});
	public static final BitSet FOLLOW_WS_in_symbolExpr1387 = new BitSet(new long[]{0x0000001020000000L});
	public static final BitSet FOLLOW_Symbol_in_symbolExpr1390 = new BitSet(new long[]{0x010000D400000000L});
	public static final BitSet FOLLOW_WS_in_symbolExpr1392 = new BitSet(new long[]{0x010000D400000000L});
	public static final BitSet FOLLOW_lExpr_in_symbolExpr1395 = new BitSet(new long[]{0x0000009000000000L});
	public static final BitSet FOLLOW_WS_in_symbolExpr1398 = new BitSet(new long[]{0x0000009000000000L});
	public static final BitSet FOLLOW_39_in_symbolExpr1400 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_notVar1420 = new BitSet(new long[]{0x0400001000000000L});
	public static final BitSet FOLLOW_WS_in_notVar1421 = new BitSet(new long[]{0x0400001000000000L});
	public static final BitSet FOLLOW_58_in_notVar1423 = new BitSet(new long[]{0x0000001400000000L});
	public static final BitSet FOLLOW_WS_in_notVar1425 = new BitSet(new long[]{0x0000001400000000L});
	public static final BitSet FOLLOW_Variable_in_notVar1428 = new BitSet(new long[]{0x0000009000000000L});
	public static final BitSet FOLLOW_WS_in_notVar1430 = new BitSet(new long[]{0x0000009000000000L});
	public static final BitSet FOLLOW_39_in_notVar1432 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lExpr_in_expression1453 = new BitSet(new long[]{0x0000101000000002L});
	public static final BitSet FOLLOW_WS_in_expression1456 = new BitSet(new long[]{0x0000101000000000L});
	public static final BitSet FOLLOW_44_in_expression1459 = new BitSet(new long[]{0x0100005400000000L});
	public static final BitSet FOLLOW_WS_in_expression1461 = new BitSet(new long[]{0x0100005400000000L});
	public static final BitSet FOLLOW_lExpr_in_expression1464 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprBase_in_lExpr1499 = new BitSet(new long[]{0x0100005400000002L});
	public static final BitSet FOLLOW_WS_in_lExpr1502 = new BitSet(new long[]{0x0100005400000000L});
	public static final BitSet FOLLOW_lExpr_in_lExpr1505 = new BitSet(new long[]{0x0000000000000002L});
}

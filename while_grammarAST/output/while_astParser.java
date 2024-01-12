// $ANTLR 3.5.1 C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g 2024-01-12 14:45:33

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
	@Override public String getGrammarFileName() { return "C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g"; }


	public static class startProgram_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "startProgram"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:37:1: startProgram : program -> ^( START program ) ;
	public final while_astParser.startProgram_return startProgram() throws RecognitionException {
		while_astParser.startProgram_return retval = new while_astParser.startProgram_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope program1 =null;

		RewriteRuleSubtreeStream stream_program=new RewriteRuleSubtreeStream(adaptor,"rule program");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:38:5: ( program -> ^( START program ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:38:7: program
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
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:38:18: ^( START program )
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:51:1: getComment : Comment -> ^( COMMENT Comment ) ;
	public final while_astParser.getComment_return getComment() throws RecognitionException {
		while_astParser.getComment_return retval = new while_astParser.getComment_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Comment2=null;

		Object Comment2_tree=null;
		RewriteRuleTokenStream stream_Comment=new RewriteRuleTokenStream(adaptor,"token Comment");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:52:2: ( Comment -> ^( COMMENT Comment ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:52:4: Comment
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
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:52:15: ^( COMMENT Comment )
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:54:1: program : function ( WS )* ( program )? -> ^( PROGRAM function ( program )? ) ;
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
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:55:5: ( function ( WS )* ( program )? -> ^( PROGRAM function ( program )? ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:55:7: function ( WS )* ( program )?
			{
			pushFollow(FOLLOW_function_in_program421);
			function3=function();
			state._fsp--;

			stream_function.add(function3.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:55:16: ( WS )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==WS) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:55:16: WS
					{
					WS4=(Token)match(input,WS,FOLLOW_WS_in_program423);  
					stream_WS.add(WS4);

					}
					break;

				default :
					break loop1;
				}
			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:55:20: ( program )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==Comment||LA2_0==51) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:55:20: program
					{
					pushFollow(FOLLOW_program_in_program426);
					program5=program();
					state._fsp--;

					stream_program.add(program5.getTree());
					}
					break;

			}

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
			// 55:29: -> ^( PROGRAM function ( program )? )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:55:32: ^( PROGRAM function ( program )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);
				adaptor.addChild(root_1, stream_function.nextTree());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:55:51: ( program )?
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:58:1: function : ( getComment )? 'function ' Symbol ( WS )* ':' ( getComment )? ( WS )* definition -> ^( FUNCDEF Symbol definition ( getComment )? END ) ;
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
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:59:5: ( ( getComment )? 'function ' Symbol ( WS )* ':' ( getComment )? ( WS )* definition -> ^( FUNCDEF Symbol definition ( getComment )? END ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:59:7: ( getComment )? 'function ' Symbol ( WS )* ':' ( getComment )? ( WS )* definition
			{
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:59:7: ( getComment )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==Comment) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:59:7: getComment
					{
					pushFollow(FOLLOW_getComment_in_function457);
					getComment6=getComment();
					state._fsp--;

					stream_getComment.add(getComment6.getTree());
					}
					break;

			}

			string_literal7=(Token)match(input,51,FOLLOW_51_in_function460);  
			stream_51.add(string_literal7);

			Symbol8=(Token)match(input,Symbol,FOLLOW_Symbol_in_function462);  
			stream_Symbol.add(Symbol8);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:59:38: ( WS )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==WS) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:59:38: WS
					{
					WS9=(Token)match(input,WS,FOLLOW_WS_in_function464);  
					stream_WS.add(WS9);

					}
					break;

				default :
					break loop4;
				}
			}

			char_literal10=(Token)match(input,41,FOLLOW_41_in_function467);  
			stream_41.add(char_literal10);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:59:46: ( getComment )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==Comment) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:59:46: getComment
					{
					pushFollow(FOLLOW_getComment_in_function469);
					getComment11=getComment();
					state._fsp--;

					stream_getComment.add(getComment11.getTree());
					}
					break;

			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:59:58: ( WS )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==WS) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:59:58: WS
					{
					WS12=(Token)match(input,WS,FOLLOW_WS_in_function472);  
					stream_WS.add(WS12);

					}
					break;

				default :
					break loop6;
				}
			}

			pushFollow(FOLLOW_definition_in_function475);
			definition13=definition();
			state._fsp--;

			stream_definition.add(definition13.getTree());
			// AST REWRITE
			// elements: Symbol, getComment, definition
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
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:59:76: ^( FUNCDEF Symbol definition ( getComment )? END )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCDEF, "FUNCDEF"), root_1);
				adaptor.addChild(root_1, stream_Symbol.nextNode());
				adaptor.addChild(root_1, stream_definition.nextTree());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:59:104: ( getComment )?
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:62:1: definition : 'read' ( WS )* input '%' ( getComment )? ( WS )* commands ( WS )* '%' ( getComment )? ( WS )* 'write ' output ( getComment )? -> ^( FUNCTION input commands output ( getComment )? ) ;
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
		RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
		RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");
		RewriteRuleSubtreeStream stream_input=new RewriteRuleSubtreeStream(adaptor,"rule input");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:63:5: ( 'read' ( WS )* input '%' ( getComment )? ( WS )* commands ( WS )* '%' ( getComment )? ( WS )* 'write ' output ( getComment )? -> ^( FUNCTION input commands output ( getComment )? ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:63:7: 'read' ( WS )* input '%' ( getComment )? ( WS )* commands ( WS )* '%' ( getComment )? ( WS )* 'write ' output ( getComment )?
			{
			string_literal14=(Token)match(input,59,FOLLOW_59_in_definition508);  
			stream_59.add(string_literal14);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:63:14: ( WS )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==WS) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:63:14: WS
					{
					WS15=(Token)match(input,WS,FOLLOW_WS_in_definition510);  
					stream_WS.add(WS15);

					}
					break;

				default :
					break loop7;
				}
			}

			pushFollow(FOLLOW_input_in_definition513);
			input16=input();
			state._fsp--;

			stream_input.add(input16.getTree());
			char_literal17=(Token)match(input,37,FOLLOW_37_in_definition515);  
			stream_37.add(char_literal17);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:63:28: ( getComment )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==Comment) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:63:28: getComment
					{
					pushFollow(FOLLOW_getComment_in_definition517);
					getComment18=getComment();
					state._fsp--;

					stream_getComment.add(getComment18.getTree());
					}
					break;

			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:63:40: ( WS )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==WS) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:63:40: WS
					{
					WS19=(Token)match(input,WS,FOLLOW_WS_in_definition520);  
					stream_WS.add(WS19);

					}
					break;

				default :
					break loop9;
				}
			}

			pushFollow(FOLLOW_commands_in_definition523);
			commands20=commands();
			state._fsp--;

			stream_commands.add(commands20.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:63:53: ( WS )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==WS) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:63:53: WS
					{
					WS21=(Token)match(input,WS,FOLLOW_WS_in_definition525);  
					stream_WS.add(WS21);

					}
					break;

				default :
					break loop10;
				}
			}

			char_literal22=(Token)match(input,37,FOLLOW_37_in_definition528);  
			stream_37.add(char_literal22);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:63:61: ( getComment )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==Comment) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:63:61: getComment
					{
					pushFollow(FOLLOW_getComment_in_definition530);
					getComment23=getComment();
					state._fsp--;

					stream_getComment.add(getComment23.getTree());
					}
					break;

			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:63:73: ( WS )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==WS) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:63:73: WS
					{
					WS24=(Token)match(input,WS,FOLLOW_WS_in_definition533);  
					stream_WS.add(WS24);

					}
					break;

				default :
					break loop12;
				}
			}

			string_literal25=(Token)match(input,63,FOLLOW_63_in_definition536);  
			stream_63.add(string_literal25);

			pushFollow(FOLLOW_output_in_definition538);
			output26=output();
			state._fsp--;

			stream_output.add(output26.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:63:93: ( getComment )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==Comment) ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:63:93: getComment
					{
					pushFollow(FOLLOW_getComment_in_definition540);
					getComment27=getComment();
					state._fsp--;

					stream_getComment.add(getComment27.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: getComment, commands, input, output
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
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:63:107: ^( FUNCTION input commands output ( getComment )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCTION, "FUNCTION"), root_1);
				adaptor.addChild(root_1, stream_input.nextTree());
				adaptor.addChild(root_1, stream_commands.nextTree());
				adaptor.addChild(root_1, stream_output.nextTree());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:63:140: ( getComment )?
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:66:1: input : ( inputSub )? ( getComment )? -> ^( INPUTS ( inputSub )? ( getComment )? ) ;
	public final while_astParser.input_return input() throws RecognitionException {
		while_astParser.input_return retval = new while_astParser.input_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope inputSub28 =null;
		ParserRuleReturnScope getComment29 =null;

		RewriteRuleSubtreeStream stream_inputSub=new RewriteRuleSubtreeStream(adaptor,"rule inputSub");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:67:5: ( ( inputSub )? ( getComment )? -> ^( INPUTS ( inputSub )? ( getComment )? ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:67:7: ( inputSub )? ( getComment )?
			{
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:67:7: ( inputSub )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==Variable) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:67:7: inputSub
					{
					pushFollow(FOLLOW_inputSub_in_input572);
					inputSub28=inputSub();
					state._fsp--;

					stream_inputSub.add(inputSub28.getTree());
					}
					break;

			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:67:17: ( getComment )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==Comment) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:67:17: getComment
					{
					pushFollow(FOLLOW_getComment_in_input575);
					getComment29=getComment();
					state._fsp--;

					stream_getComment.add(getComment29.getTree());
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
			// 67:29: -> ^( INPUTS ( inputSub )? ( getComment )? )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:67:33: ^( INPUTS ( inputSub )? ( getComment )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INPUTS, "INPUTS"), root_1);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:67:42: ( inputSub )?
				if ( stream_inputSub.hasNext() ) {
					adaptor.addChild(root_1, stream_inputSub.nextTree());
				}
				stream_inputSub.reset();

				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:67:52: ( getComment )?
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:70:1: inputSub : Variable ( WS )* ( ',' ( WS )* inputSub )? -> Variable ( inputSub )? ;
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
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:71:5: ( Variable ( WS )* ( ',' ( WS )* inputSub )? -> Variable ( inputSub )? )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:71:7: Variable ( WS )* ( ',' ( WS )* inputSub )?
			{
			Variable30=(Token)match(input,Variable,FOLLOW_Variable_in_inputSub606);  
			stream_Variable.add(Variable30);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:71:16: ( WS )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==WS) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:71:16: WS
					{
					WS31=(Token)match(input,WS,FOLLOW_WS_in_inputSub608);  
					stream_WS.add(WS31);

					}
					break;

				default :
					break loop16;
				}
			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:71:20: ( ',' ( WS )* inputSub )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==40) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:71:21: ',' ( WS )* inputSub
					{
					char_literal32=(Token)match(input,40,FOLLOW_40_in_inputSub612);  
					stream_40.add(char_literal32);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:71:25: ( WS )*
					loop17:
					while (true) {
						int alt17=2;
						int LA17_0 = input.LA(1);
						if ( (LA17_0==WS) ) {
							alt17=1;
						}

						switch (alt17) {
						case 1 :
							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:71:25: WS
							{
							WS33=(Token)match(input,WS,FOLLOW_WS_in_inputSub614);  
							stream_WS.add(WS33);

							}
							break;

						default :
							break loop17;
						}
					}

					pushFollow(FOLLOW_inputSub_in_inputSub617);
					inputSub34=inputSub();
					state._fsp--;

					stream_inputSub.add(inputSub34.getTree());
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
			// 71:40: -> Variable ( inputSub )?
			{
				adaptor.addChild(root_0, stream_Variable.nextNode());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:71:52: ( inputSub )?
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:74:1: output : Variable ( WS )* ( ',' ( WS )* output )? -> ^( OUTPUT Variable ( output )? ) ;
	public final while_astParser.output_return output() throws RecognitionException {
		while_astParser.output_return retval = new while_astParser.output_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Variable35=null;
		Token WS36=null;
		Token char_literal37=null;
		Token WS38=null;
		ParserRuleReturnScope output39 =null;

		Object Variable35_tree=null;
		Object WS36_tree=null;
		Object char_literal37_tree=null;
		Object WS38_tree=null;
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:75:5: ( Variable ( WS )* ( ',' ( WS )* output )? -> ^( OUTPUT Variable ( output )? ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:75:7: Variable ( WS )* ( ',' ( WS )* output )?
			{
			Variable35=(Token)match(input,Variable,FOLLOW_Variable_in_output644);  
			stream_Variable.add(Variable35);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:75:16: ( WS )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==WS) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:75:16: WS
					{
					WS36=(Token)match(input,WS,FOLLOW_WS_in_output646);  
					stream_WS.add(WS36);

					}
					break;

				default :
					break loop19;
				}
			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:75:20: ( ',' ( WS )* output )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==40) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:75:21: ',' ( WS )* output
					{
					char_literal37=(Token)match(input,40,FOLLOW_40_in_output650);  
					stream_40.add(char_literal37);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:75:25: ( WS )*
					loop20:
					while (true) {
						int alt20=2;
						int LA20_0 = input.LA(1);
						if ( (LA20_0==WS) ) {
							alt20=1;
						}

						switch (alt20) {
						case 1 :
							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:75:25: WS
							{
							WS38=(Token)match(input,WS,FOLLOW_WS_in_output652);  
							stream_WS.add(WS38);

							}
							break;

						default :
							break loop20;
						}
					}

					pushFollow(FOLLOW_output_in_output655);
					output39=output();
					state._fsp--;

					stream_output.add(output39.getTree());
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
			// 75:38: -> ^( OUTPUT Variable ( output )? )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:75:41: ^( OUTPUT Variable ( output )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OUTPUT, "OUTPUT"), root_1);
				adaptor.addChild(root_1, stream_Variable.nextNode());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:75:59: ( output )?
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:78:1: commands : command ( ( WS )* ';' ( WS )* commands )? -> command ( commands )? ;
	public final while_astParser.commands_return commands() throws RecognitionException {
		while_astParser.commands_return retval = new while_astParser.commands_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WS41=null;
		Token char_literal42=null;
		Token WS43=null;
		ParserRuleReturnScope command40 =null;
		ParserRuleReturnScope commands44 =null;

		Object WS41_tree=null;
		Object char_literal42_tree=null;
		Object WS43_tree=null;
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_command=new RewriteRuleSubtreeStream(adaptor,"rule command");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:79:5: ( command ( ( WS )* ';' ( WS )* commands )? -> command ( commands )? )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:79:7: command ( ( WS )* ';' ( WS )* commands )?
			{
			pushFollow(FOLLOW_command_in_commands685);
			command40=command();
			state._fsp--;

			stream_command.add(command40.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:79:15: ( ( WS )* ';' ( WS )* commands )?
			int alt24=2;
			alt24 = dfa24.predict(input);
			switch (alt24) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:79:17: ( WS )* ';' ( WS )* commands
					{
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:79:17: ( WS )*
					loop22:
					while (true) {
						int alt22=2;
						int LA22_0 = input.LA(1);
						if ( (LA22_0==WS) ) {
							alt22=1;
						}

						switch (alt22) {
						case 1 :
							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:79:17: WS
							{
							WS41=(Token)match(input,WS,FOLLOW_WS_in_commands689);  
							stream_WS.add(WS41);

							}
							break;

						default :
							break loop22;
						}
					}

					char_literal42=(Token)match(input,43,FOLLOW_43_in_commands692);  
					stream_43.add(char_literal42);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:79:25: ( WS )*
					loop23:
					while (true) {
						int alt23=2;
						int LA23_0 = input.LA(1);
						if ( (LA23_0==WS) ) {
							alt23=1;
						}

						switch (alt23) {
						case 1 :
							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:79:25: WS
							{
							WS43=(Token)match(input,WS,FOLLOW_WS_in_commands694);  
							stream_WS.add(WS43);

							}
							break;

						default :
							break loop23;
						}
					}

					pushFollow(FOLLOW_commands_in_commands697);
					commands44=commands();
					state._fsp--;

					stream_commands.add(commands44.getTree());
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
			// 79:40: -> command ( commands )?
			{
				adaptor.addChild(root_0, stream_command.nextTree());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:79:51: ( commands )?
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:82:1: command : ( 'nop' | decl | if_ | for_ | while_ | foreach_ );
	public final while_astParser.command_return command() throws RecognitionException {
		while_astParser.command_return retval = new while_astParser.command_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal45=null;
		ParserRuleReturnScope decl46 =null;
		ParserRuleReturnScope if_47 =null;
		ParserRuleReturnScope for_48 =null;
		ParserRuleReturnScope while_49 =null;
		ParserRuleReturnScope foreach_50 =null;

		Object string_literal45_tree=null;

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:83:5: ( 'nop' | decl | if_ | for_ | while_ | foreach_ )
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
			case 62:
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
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:83:7: 'nop'
					{
					root_0 = (Object)adaptor.nil();


					string_literal45=(Token)match(input,57,FOLLOW_57_in_command724); 
					string_literal45_tree = (Object)adaptor.create(string_literal45);
					adaptor.addChild(root_0, string_literal45_tree);

					}
					break;
				case 2 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:83:15: decl
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_decl_in_command728);
					decl46=decl();
					state._fsp--;

					adaptor.addChild(root_0, decl46.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:83:22: if_
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_if__in_command732);
					if_47=if_();
					state._fsp--;

					adaptor.addChild(root_0, if_47.getTree());

					}
					break;
				case 4 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:83:28: for_
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_for__in_command736);
					for_48=for_();
					state._fsp--;

					adaptor.addChild(root_0, for_48.getTree());

					}
					break;
				case 5 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:83:35: while_
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_while__in_command740);
					while_49=while_();
					state._fsp--;

					adaptor.addChild(root_0, while_49.getTree());

					}
					break;
				case 6 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:83:44: foreach_
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_foreach__in_command744);
					foreach_50=foreach_();
					state._fsp--;

					adaptor.addChild(root_0, foreach_50.getTree());

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:85:1: decl : ( vars ( WS )* ':=' ( WS )* exprs ) ( getComment )? -> ^( VARDEF vars exprs ( getComment )? ) ;
	public final while_astParser.decl_return decl() throws RecognitionException {
		while_astParser.decl_return retval = new while_astParser.decl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WS52=null;
		Token string_literal53=null;
		Token WS54=null;
		ParserRuleReturnScope vars51 =null;
		ParserRuleReturnScope exprs55 =null;
		ParserRuleReturnScope getComment56 =null;

		Object WS52_tree=null;
		Object string_literal53_tree=null;
		Object WS54_tree=null;
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");
		RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:86:5: ( ( vars ( WS )* ':=' ( WS )* exprs ) ( getComment )? -> ^( VARDEF vars exprs ( getComment )? ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:86:7: ( vars ( WS )* ':=' ( WS )* exprs ) ( getComment )?
			{
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:86:7: ( vars ( WS )* ':=' ( WS )* exprs )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:86:8: vars ( WS )* ':=' ( WS )* exprs
			{
			pushFollow(FOLLOW_vars_in_decl758);
			vars51=vars();
			state._fsp--;

			stream_vars.add(vars51.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:86:13: ( WS )*
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==WS) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:86:13: WS
					{
					WS52=(Token)match(input,WS,FOLLOW_WS_in_decl760);  
					stream_WS.add(WS52);

					}
					break;

				default :
					break loop26;
				}
			}

			string_literal53=(Token)match(input,42,FOLLOW_42_in_decl763);  
			stream_42.add(string_literal53);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:86:22: ( WS )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==WS) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:86:22: WS
					{
					WS54=(Token)match(input,WS,FOLLOW_WS_in_decl765);  
					stream_WS.add(WS54);

					}
					break;

				default :
					break loop27;
				}
			}

			pushFollow(FOLLOW_exprs_in_decl768);
			exprs55=exprs();
			state._fsp--;

			stream_exprs.add(exprs55.getTree());
			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:86:33: ( getComment )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==Comment) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:86:33: getComment
					{
					pushFollow(FOLLOW_getComment_in_decl771);
					getComment56=getComment();
					state._fsp--;

					stream_getComment.add(getComment56.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: getComment, vars, exprs
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
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:86:48: ^( VARDEF vars exprs ( getComment )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARDEF, "VARDEF"), root_1);
				adaptor.addChild(root_1, stream_vars.nextTree());
				adaptor.addChild(root_1, stream_exprs.nextTree());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:86:68: ( getComment )?
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:89:1: if_ : ( 'if' ( WS )* expression ( WS )* then_ ( WS )* ( else_ ( WS )* )? 'fi' ( getComment )? ) -> ^( IF expression then_ ( else_ )? ( getComment )? END ) ;
	public final while_astParser.if__return if_() throws RecognitionException {
		while_astParser.if__return retval = new while_astParser.if__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal57=null;
		Token WS58=null;
		Token WS60=null;
		Token WS62=null;
		Token WS64=null;
		Token string_literal65=null;
		ParserRuleReturnScope expression59 =null;
		ParserRuleReturnScope then_61 =null;
		ParserRuleReturnScope else_63 =null;
		ParserRuleReturnScope getComment66 =null;

		Object string_literal57_tree=null;
		Object WS58_tree=null;
		Object WS60_tree=null;
		Object WS62_tree=null;
		Object WS64_tree=null;
		Object string_literal65_tree=null;
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleSubtreeStream stream_then_=new RewriteRuleSubtreeStream(adaptor,"rule then_");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_else_=new RewriteRuleSubtreeStream(adaptor,"rule else_");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:90:5: ( ( 'if' ( WS )* expression ( WS )* then_ ( WS )* ( else_ ( WS )* )? 'fi' ( getComment )? ) -> ^( IF expression then_ ( else_ )? ( getComment )? END ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:90:7: ( 'if' ( WS )* expression ( WS )* then_ ( WS )* ( else_ ( WS )* )? 'fi' ( getComment )? )
			{
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:90:7: ( 'if' ( WS )* expression ( WS )* then_ ( WS )* ( else_ ( WS )* )? 'fi' ( getComment )? )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:90:8: 'if' ( WS )* expression ( WS )* then_ ( WS )* ( else_ ( WS )* )? 'fi' ( getComment )?
			{
			string_literal57=(Token)match(input,53,FOLLOW_53_in_if_805);  
			stream_53.add(string_literal57);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:90:13: ( WS )*
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==WS) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:90:13: WS
					{
					WS58=(Token)match(input,WS,FOLLOW_WS_in_if_807);  
					stream_WS.add(WS58);

					}
					break;

				default :
					break loop29;
				}
			}

			pushFollow(FOLLOW_expression_in_if_810);
			expression59=expression();
			state._fsp--;

			stream_expression.add(expression59.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:90:28: ( WS )*
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==WS) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:90:28: WS
					{
					WS60=(Token)match(input,WS,FOLLOW_WS_in_if_812);  
					stream_WS.add(WS60);

					}
					break;

				default :
					break loop30;
				}
			}

			pushFollow(FOLLOW_then__in_if_815);
			then_61=then_();
			state._fsp--;

			stream_then_.add(then_61.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:90:38: ( WS )*
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==WS) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:90:38: WS
					{
					WS62=(Token)match(input,WS,FOLLOW_WS_in_if_817);  
					stream_WS.add(WS62);

					}
					break;

				default :
					break loop31;
				}
			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:90:42: ( else_ ( WS )* )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==47) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:90:43: else_ ( WS )*
					{
					pushFollow(FOLLOW_else__in_if_821);
					else_63=else_();
					state._fsp--;

					stream_else_.add(else_63.getTree());
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:90:49: ( WS )*
					loop32:
					while (true) {
						int alt32=2;
						int LA32_0 = input.LA(1);
						if ( (LA32_0==WS) ) {
							alt32=1;
						}

						switch (alt32) {
						case 1 :
							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:90:49: WS
							{
							WS64=(Token)match(input,WS,FOLLOW_WS_in_if_823);  
							stream_WS.add(WS64);

							}
							break;

						default :
							break loop32;
						}
					}

					}
					break;

			}

			string_literal65=(Token)match(input,48,FOLLOW_48_in_if_828);  
			stream_48.add(string_literal65);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:90:60: ( getComment )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==Comment) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:90:60: getComment
					{
					pushFollow(FOLLOW_getComment_in_if_830);
					getComment66=getComment();
					state._fsp--;

					stream_getComment.add(getComment66.getTree());
					}
					break;

			}

			}

			// AST REWRITE
			// elements: else_, getComment, expression, then_
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
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:90:76: ^( IF expression then_ ( else_ )? ( getComment )? END )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_1, stream_then_.nextTree());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:90:98: ( else_ )?
				if ( stream_else_.hasNext() ) {
					adaptor.addChild(root_1, stream_else_.nextTree());
				}
				stream_else_.reset();

				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:90:105: ( getComment )?
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:93:1: then_ : 'then' ( getComment )? ( WS )* commands -> ^( THEN commands ( getComment )? ) ;
	public final while_astParser.then__return then_() throws RecognitionException {
		while_astParser.then__return retval = new while_astParser.then__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal67=null;
		Token WS69=null;
		ParserRuleReturnScope getComment68 =null;
		ParserRuleReturnScope commands70 =null;

		Object string_literal67_tree=null;
		Object WS69_tree=null;
		RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:93:7: ( 'then' ( getComment )? ( WS )* commands -> ^( THEN commands ( getComment )? ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:93:9: 'then' ( getComment )? ( WS )* commands
			{
			string_literal67=(Token)match(input,60,FOLLOW_60_in_then_868);  
			stream_60.add(string_literal67);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:93:16: ( getComment )?
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==Comment) ) {
				alt35=1;
			}
			switch (alt35) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:93:16: getComment
					{
					pushFollow(FOLLOW_getComment_in_then_870);
					getComment68=getComment();
					state._fsp--;

					stream_getComment.add(getComment68.getTree());
					}
					break;

			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:93:28: ( WS )*
			loop36:
			while (true) {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( (LA36_0==WS) ) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:93:28: WS
					{
					WS69=(Token)match(input,WS,FOLLOW_WS_in_then_873);  
					stream_WS.add(WS69);

					}
					break;

				default :
					break loop36;
				}
			}

			pushFollow(FOLLOW_commands_in_then_876);
			commands70=commands();
			state._fsp--;

			stream_commands.add(commands70.getTree());
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
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:93:44: ^( THEN commands ( getComment )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(THEN, "THEN"), root_1);
				adaptor.addChild(root_1, stream_commands.nextTree());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:93:60: ( getComment )?
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:95:1: else_ : 'else' ( getComment )? ( WS )* commands -> ^( ELSE commands ( getComment )? ) ;
	public final while_astParser.else__return else_() throws RecognitionException {
		while_astParser.else__return retval = new while_astParser.else__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal71=null;
		Token WS73=null;
		ParserRuleReturnScope getComment72 =null;
		ParserRuleReturnScope commands74 =null;

		Object string_literal71_tree=null;
		Object WS73_tree=null;
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:95:7: ( 'else' ( getComment )? ( WS )* commands -> ^( ELSE commands ( getComment )? ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:95:9: 'else' ( getComment )? ( WS )* commands
			{
			string_literal71=(Token)match(input,47,FOLLOW_47_in_else_896);  
			stream_47.add(string_literal71);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:95:16: ( getComment )?
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==Comment) ) {
				alt37=1;
			}
			switch (alt37) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:95:16: getComment
					{
					pushFollow(FOLLOW_getComment_in_else_898);
					getComment72=getComment();
					state._fsp--;

					stream_getComment.add(getComment72.getTree());
					}
					break;

			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:95:28: ( WS )*
			loop38:
			while (true) {
				int alt38=2;
				int LA38_0 = input.LA(1);
				if ( (LA38_0==WS) ) {
					alt38=1;
				}

				switch (alt38) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:95:28: WS
					{
					WS73=(Token)match(input,WS,FOLLOW_WS_in_else_901);  
					stream_WS.add(WS73);

					}
					break;

				default :
					break loop38;
				}
			}

			pushFollow(FOLLOW_commands_in_else_904);
			commands74=commands();
			state._fsp--;

			stream_commands.add(commands74.getTree());
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
			// 95:41: -> ^( ELSE commands ( getComment )? )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:95:44: ^( ELSE commands ( getComment )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ELSE, "ELSE"), root_1);
				adaptor.addChild(root_1, stream_commands.nextTree());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:95:60: ( getComment )?
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:97:1: while_ : ( 'while' ( WS )* expression ( getComment )? ( WS )* do_ ) -> ^( WHILE expression ( getComment )? do_ END ) ;
	public final while_astParser.while__return while_() throws RecognitionException {
		while_astParser.while__return retval = new while_astParser.while__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal75=null;
		Token WS76=null;
		Token WS79=null;
		ParserRuleReturnScope expression77 =null;
		ParserRuleReturnScope getComment78 =null;
		ParserRuleReturnScope do_80 =null;

		Object string_literal75_tree=null;
		Object WS76_tree=null;
		Object WS79_tree=null;
		RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_do_=new RewriteRuleSubtreeStream(adaptor,"rule do_");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:98:5: ( ( 'while' ( WS )* expression ( getComment )? ( WS )* do_ ) -> ^( WHILE expression ( getComment )? do_ END ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:98:7: ( 'while' ( WS )* expression ( getComment )? ( WS )* do_ )
			{
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:98:7: ( 'while' ( WS )* expression ( getComment )? ( WS )* do_ )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:98:8: 'while' ( WS )* expression ( getComment )? ( WS )* do_
			{
			string_literal75=(Token)match(input,62,FOLLOW_62_in_while_930);  
			stream_62.add(string_literal75);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:98:16: ( WS )*
			loop39:
			while (true) {
				int alt39=2;
				int LA39_0 = input.LA(1);
				if ( (LA39_0==WS) ) {
					alt39=1;
				}

				switch (alt39) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:98:16: WS
					{
					WS76=(Token)match(input,WS,FOLLOW_WS_in_while_932);  
					stream_WS.add(WS76);

					}
					break;

				default :
					break loop39;
				}
			}

			pushFollow(FOLLOW_expression_in_while_935);
			expression77=expression();
			state._fsp--;

			stream_expression.add(expression77.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:98:31: ( getComment )?
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==Comment) ) {
				alt40=1;
			}
			switch (alt40) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:98:31: getComment
					{
					pushFollow(FOLLOW_getComment_in_while_937);
					getComment78=getComment();
					state._fsp--;

					stream_getComment.add(getComment78.getTree());
					}
					break;

			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:98:43: ( WS )*
			loop41:
			while (true) {
				int alt41=2;
				int LA41_0 = input.LA(1);
				if ( (LA41_0==WS) ) {
					alt41=1;
				}

				switch (alt41) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:98:43: WS
					{
					WS79=(Token)match(input,WS,FOLLOW_WS_in_while_940);  
					stream_WS.add(WS79);

					}
					break;

				default :
					break loop41;
				}
			}

			pushFollow(FOLLOW_do__in_while_943);
			do_80=do_();
			state._fsp--;

			stream_do_.add(do_80.getTree());
			}

			// AST REWRITE
			// elements: getComment, do_, expression
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
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:98:55: ^( WHILE expression ( getComment )? do_ END )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WHILE, "WHILE"), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:98:74: ( getComment )?
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:101:1: do_ : 'do' ( getComment )? ( WS )* commands ( WS )* 'od' ( getComment )? -> ^( DO commands ( getComment )? ) ;
	public final while_astParser.do__return do_() throws RecognitionException {
		while_astParser.do__return retval = new while_astParser.do__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal81=null;
		Token WS83=null;
		Token WS85=null;
		Token string_literal86=null;
		ParserRuleReturnScope getComment82 =null;
		ParserRuleReturnScope commands84 =null;
		ParserRuleReturnScope getComment87 =null;

		Object string_literal81_tree=null;
		Object WS83_tree=null;
		Object WS85_tree=null;
		Object string_literal86_tree=null;
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:101:6: ( 'do' ( getComment )? ( WS )* commands ( WS )* 'od' ( getComment )? -> ^( DO commands ( getComment )? ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:101:8: 'do' ( getComment )? ( WS )* commands ( WS )* 'od' ( getComment )?
			{
			string_literal81=(Token)match(input,46,FOLLOW_46_in_do_977);  
			stream_46.add(string_literal81);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:101:13: ( getComment )?
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0==Comment) ) {
				alt42=1;
			}
			switch (alt42) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:101:13: getComment
					{
					pushFollow(FOLLOW_getComment_in_do_979);
					getComment82=getComment();
					state._fsp--;

					stream_getComment.add(getComment82.getTree());
					}
					break;

			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:101:25: ( WS )*
			loop43:
			while (true) {
				int alt43=2;
				int LA43_0 = input.LA(1);
				if ( (LA43_0==WS) ) {
					alt43=1;
				}

				switch (alt43) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:101:25: WS
					{
					WS83=(Token)match(input,WS,FOLLOW_WS_in_do_982);  
					stream_WS.add(WS83);

					}
					break;

				default :
					break loop43;
				}
			}

			pushFollow(FOLLOW_commands_in_do_985);
			commands84=commands();
			state._fsp--;

			stream_commands.add(commands84.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:101:38: ( WS )*
			loop44:
			while (true) {
				int alt44=2;
				int LA44_0 = input.LA(1);
				if ( (LA44_0==WS) ) {
					alt44=1;
				}

				switch (alt44) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:101:38: WS
					{
					WS85=(Token)match(input,WS,FOLLOW_WS_in_do_987);  
					stream_WS.add(WS85);

					}
					break;

				default :
					break loop44;
				}
			}

			string_literal86=(Token)match(input,58,FOLLOW_58_in_do_990);  
			stream_58.add(string_literal86);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:101:47: ( getComment )?
			int alt45=2;
			int LA45_0 = input.LA(1);
			if ( (LA45_0==Comment) ) {
				alt45=1;
			}
			switch (alt45) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:101:47: getComment
					{
					pushFollow(FOLLOW_getComment_in_do_992);
					getComment87=getComment();
					state._fsp--;

					stream_getComment.add(getComment87.getTree());
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
			// 101:59: -> ^( DO commands ( getComment )? )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:101:62: ^( DO commands ( getComment )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DO, "DO"), root_1);
				adaptor.addChild(root_1, stream_commands.nextTree());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:101:77: ( getComment )?
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:103:1: for_ : ( 'for' ( WS )* expression ( getComment )? ( WS )* do_ ) -> ^( FOR expression do_ END ) ;
	public final while_astParser.for__return for_() throws RecognitionException {
		while_astParser.for__return retval = new while_astParser.for__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal88=null;
		Token WS89=null;
		Token WS92=null;
		ParserRuleReturnScope expression90 =null;
		ParserRuleReturnScope getComment91 =null;
		ParserRuleReturnScope do_93 =null;

		Object string_literal88_tree=null;
		Object WS89_tree=null;
		Object WS92_tree=null;
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_do_=new RewriteRuleSubtreeStream(adaptor,"rule do_");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:104:5: ( ( 'for' ( WS )* expression ( getComment )? ( WS )* do_ ) -> ^( FOR expression do_ END ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:104:7: ( 'for' ( WS )* expression ( getComment )? ( WS )* do_ )
			{
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:104:7: ( 'for' ( WS )* expression ( getComment )? ( WS )* do_ )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:104:8: 'for' ( WS )* expression ( getComment )? ( WS )* do_
			{
			string_literal88=(Token)match(input,49,FOLLOW_49_in_for_1018);  
			stream_49.add(string_literal88);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:104:14: ( WS )*
			loop46:
			while (true) {
				int alt46=2;
				int LA46_0 = input.LA(1);
				if ( (LA46_0==WS) ) {
					alt46=1;
				}

				switch (alt46) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:104:14: WS
					{
					WS89=(Token)match(input,WS,FOLLOW_WS_in_for_1020);  
					stream_WS.add(WS89);

					}
					break;

				default :
					break loop46;
				}
			}

			pushFollow(FOLLOW_expression_in_for_1023);
			expression90=expression();
			state._fsp--;

			stream_expression.add(expression90.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:104:29: ( getComment )?
			int alt47=2;
			int LA47_0 = input.LA(1);
			if ( (LA47_0==Comment) ) {
				alt47=1;
			}
			switch (alt47) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:104:29: getComment
					{
					pushFollow(FOLLOW_getComment_in_for_1025);
					getComment91=getComment();
					state._fsp--;

					stream_getComment.add(getComment91.getTree());
					}
					break;

			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:104:41: ( WS )*
			loop48:
			while (true) {
				int alt48=2;
				int LA48_0 = input.LA(1);
				if ( (LA48_0==WS) ) {
					alt48=1;
				}

				switch (alt48) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:104:41: WS
					{
					WS92=(Token)match(input,WS,FOLLOW_WS_in_for_1028);  
					stream_WS.add(WS92);

					}
					break;

				default :
					break loop48;
				}
			}

			pushFollow(FOLLOW_do__in_for_1031);
			do_93=do_();
			state._fsp--;

			stream_do_.add(do_93.getTree());
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
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:104:53: ^( FOR expression do_ END )
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:107:1: foreach_ : ( 'foreach' ( WS )* Variable ( WS )* 'in' ( WS )* expression ( getComment )? ( WS )* do_ ) -> ^( FOREACH ^( IN Variable expression ) ( getComment )? do_ END ) ;
	public final while_astParser.foreach__return foreach_() throws RecognitionException {
		while_astParser.foreach__return retval = new while_astParser.foreach__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal94=null;
		Token WS95=null;
		Token Variable96=null;
		Token WS97=null;
		Token string_literal98=null;
		Token WS99=null;
		Token WS102=null;
		ParserRuleReturnScope expression100 =null;
		ParserRuleReturnScope getComment101 =null;
		ParserRuleReturnScope do_103 =null;

		Object string_literal94_tree=null;
		Object WS95_tree=null;
		Object Variable96_tree=null;
		Object WS97_tree=null;
		Object string_literal98_tree=null;
		Object WS99_tree=null;
		Object WS102_tree=null;
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_do_=new RewriteRuleSubtreeStream(adaptor,"rule do_");
		RewriteRuleSubtreeStream stream_getComment=new RewriteRuleSubtreeStream(adaptor,"rule getComment");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:108:5: ( ( 'foreach' ( WS )* Variable ( WS )* 'in' ( WS )* expression ( getComment )? ( WS )* do_ ) -> ^( FOREACH ^( IN Variable expression ) ( getComment )? do_ END ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:108:7: ( 'foreach' ( WS )* Variable ( WS )* 'in' ( WS )* expression ( getComment )? ( WS )* do_ )
			{
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:108:7: ( 'foreach' ( WS )* Variable ( WS )* 'in' ( WS )* expression ( getComment )? ( WS )* do_ )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:108:8: 'foreach' ( WS )* Variable ( WS )* 'in' ( WS )* expression ( getComment )? ( WS )* do_
			{
			string_literal94=(Token)match(input,50,FOLLOW_50_in_foreach_1062);  
			stream_50.add(string_literal94);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:108:18: ( WS )*
			loop49:
			while (true) {
				int alt49=2;
				int LA49_0 = input.LA(1);
				if ( (LA49_0==WS) ) {
					alt49=1;
				}

				switch (alt49) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:108:18: WS
					{
					WS95=(Token)match(input,WS,FOLLOW_WS_in_foreach_1064);  
					stream_WS.add(WS95);

					}
					break;

				default :
					break loop49;
				}
			}

			Variable96=(Token)match(input,Variable,FOLLOW_Variable_in_foreach_1067);  
			stream_Variable.add(Variable96);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:108:31: ( WS )*
			loop50:
			while (true) {
				int alt50=2;
				int LA50_0 = input.LA(1);
				if ( (LA50_0==WS) ) {
					alt50=1;
				}

				switch (alt50) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:108:31: WS
					{
					WS97=(Token)match(input,WS,FOLLOW_WS_in_foreach_1069);  
					stream_WS.add(WS97);

					}
					break;

				default :
					break loop50;
				}
			}

			string_literal98=(Token)match(input,54,FOLLOW_54_in_foreach_1072);  
			stream_54.add(string_literal98);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:108:40: ( WS )*
			loop51:
			while (true) {
				int alt51=2;
				int LA51_0 = input.LA(1);
				if ( (LA51_0==WS) ) {
					alt51=1;
				}

				switch (alt51) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:108:40: WS
					{
					WS99=(Token)match(input,WS,FOLLOW_WS_in_foreach_1074);  
					stream_WS.add(WS99);

					}
					break;

				default :
					break loop51;
				}
			}

			pushFollow(FOLLOW_expression_in_foreach_1077);
			expression100=expression();
			state._fsp--;

			stream_expression.add(expression100.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:108:55: ( getComment )?
			int alt52=2;
			int LA52_0 = input.LA(1);
			if ( (LA52_0==Comment) ) {
				alt52=1;
			}
			switch (alt52) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:108:55: getComment
					{
					pushFollow(FOLLOW_getComment_in_foreach_1079);
					getComment101=getComment();
					state._fsp--;

					stream_getComment.add(getComment101.getTree());
					}
					break;

			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:108:67: ( WS )*
			loop53:
			while (true) {
				int alt53=2;
				int LA53_0 = input.LA(1);
				if ( (LA53_0==WS) ) {
					alt53=1;
				}

				switch (alt53) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:108:67: WS
					{
					WS102=(Token)match(input,WS,FOLLOW_WS_in_foreach_1082);  
					stream_WS.add(WS102);

					}
					break;

				default :
					break loop53;
				}
			}

			pushFollow(FOLLOW_do__in_foreach_1085);
			do_103=do_();
			state._fsp--;

			stream_do_.add(do_103.getTree());
			}

			// AST REWRITE
			// elements: Variable, expression, do_, getComment
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
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:108:79: ^( FOREACH ^( IN Variable expression ) ( getComment )? do_ END )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOREACH, "FOREACH"), root_1);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:108:89: ^( IN Variable expression )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(IN, "IN"), root_2);
				adaptor.addChild(root_2, stream_Variable.nextNode());
				adaptor.addChild(root_2, stream_expression.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:108:115: ( getComment )?
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:111:1: vars : Variable ( WS )* ( ',' ( WS )* vars )? -> Variable ( vars )* ;
	public final while_astParser.vars_return vars() throws RecognitionException {
		while_astParser.vars_return retval = new while_astParser.vars_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Variable104=null;
		Token WS105=null;
		Token char_literal106=null;
		Token WS107=null;
		ParserRuleReturnScope vars108 =null;

		Object Variable104_tree=null;
		Object WS105_tree=null;
		Object char_literal106_tree=null;
		Object WS107_tree=null;
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:112:5: ( Variable ( WS )* ( ',' ( WS )* vars )? -> Variable ( vars )* )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:112:7: Variable ( WS )* ( ',' ( WS )* vars )?
			{
			Variable104=(Token)match(input,Variable,FOLLOW_Variable_in_vars1124);  
			stream_Variable.add(Variable104);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:112:16: ( WS )*
			loop54:
			while (true) {
				int alt54=2;
				int LA54_0 = input.LA(1);
				if ( (LA54_0==WS) ) {
					alt54=1;
				}

				switch (alt54) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:112:16: WS
					{
					WS105=(Token)match(input,WS,FOLLOW_WS_in_vars1126);  
					stream_WS.add(WS105);

					}
					break;

				default :
					break loop54;
				}
			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:112:20: ( ',' ( WS )* vars )?
			int alt56=2;
			int LA56_0 = input.LA(1);
			if ( (LA56_0==40) ) {
				alt56=1;
			}
			switch (alt56) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:112:21: ',' ( WS )* vars
					{
					char_literal106=(Token)match(input,40,FOLLOW_40_in_vars1130);  
					stream_40.add(char_literal106);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:112:24: ( WS )*
					loop55:
					while (true) {
						int alt55=2;
						int LA55_0 = input.LA(1);
						if ( (LA55_0==WS) ) {
							alt55=1;
						}

						switch (alt55) {
						case 1 :
							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:112:24: WS
							{
							WS107=(Token)match(input,WS,FOLLOW_WS_in_vars1131);  
							stream_WS.add(WS107);

							}
							break;

						default :
							break loop55;
						}
					}

					pushFollow(FOLLOW_vars_in_vars1134);
					vars108=vars();
					state._fsp--;

					stream_vars.add(vars108.getTree());
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
			// 112:35: -> Variable ( vars )*
			{
				adaptor.addChild(root_0, stream_Variable.nextNode());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:112:47: ( vars )*
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:115:1: exprs : expression ( WS )* ( ',' ( WS )* exprs )? -> expression ( exprs )* ;
	public final while_astParser.exprs_return exprs() throws RecognitionException {
		while_astParser.exprs_return retval = new while_astParser.exprs_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WS110=null;
		Token char_literal111=null;
		Token WS112=null;
		ParserRuleReturnScope expression109 =null;
		ParserRuleReturnScope exprs113 =null;

		Object WS110_tree=null;
		Object char_literal111_tree=null;
		Object WS112_tree=null;
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:116:5: ( expression ( WS )* ( ',' ( WS )* exprs )? -> expression ( exprs )* )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:116:7: expression ( WS )* ( ',' ( WS )* exprs )?
			{
			pushFollow(FOLLOW_expression_in_exprs1160);
			expression109=expression();
			state._fsp--;

			stream_expression.add(expression109.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:116:18: ( WS )*
			loop57:
			while (true) {
				int alt57=2;
				int LA57_0 = input.LA(1);
				if ( (LA57_0==WS) ) {
					alt57=1;
				}

				switch (alt57) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:116:18: WS
					{
					WS110=(Token)match(input,WS,FOLLOW_WS_in_exprs1162);  
					stream_WS.add(WS110);

					}
					break;

				default :
					break loop57;
				}
			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:116:22: ( ',' ( WS )* exprs )?
			int alt59=2;
			int LA59_0 = input.LA(1);
			if ( (LA59_0==40) ) {
				alt59=1;
			}
			switch (alt59) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:116:23: ',' ( WS )* exprs
					{
					char_literal111=(Token)match(input,40,FOLLOW_40_in_exprs1166);  
					stream_40.add(char_literal111);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:116:26: ( WS )*
					loop58:
					while (true) {
						int alt58=2;
						int LA58_0 = input.LA(1);
						if ( (LA58_0==WS) ) {
							alt58=1;
						}

						switch (alt58) {
						case 1 :
							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:116:26: WS
							{
							WS112=(Token)match(input,WS,FOLLOW_WS_in_exprs1167);  
							stream_WS.add(WS112);

							}
							break;

						default :
							break loop58;
						}
					}

					pushFollow(FOLLOW_exprs_in_exprs1170);
					exprs113=exprs();
					state._fsp--;

					stream_exprs.add(exprs113.getTree());
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
			// 116:38: -> expression ( exprs )*
			{
				adaptor.addChild(root_0, stream_expression.nextTree());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:116:52: ( exprs )*
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:119:1: exprBase : ( nil_ | variable | symbol | cons | list | hd | tl | symbolExpr );
	public final while_astParser.exprBase_return exprBase() throws RecognitionException {
		while_astParser.exprBase_return retval = new while_astParser.exprBase_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope nil_114 =null;
		ParserRuleReturnScope variable115 =null;
		ParserRuleReturnScope symbol116 =null;
		ParserRuleReturnScope cons117 =null;
		ParserRuleReturnScope list118 =null;
		ParserRuleReturnScope hd119 =null;
		ParserRuleReturnScope tl120 =null;
		ParserRuleReturnScope symbolExpr121 =null;


		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:119:12: ( nil_ | variable | symbol | cons | list | hd | tl | symbolExpr )
			int alt60=8;
			alt60 = dfa60.predict(input);
			switch (alt60) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:119:15: nil_
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_nil__in_exprBase1195);
					nil_114=nil_();
					state._fsp--;

					adaptor.addChild(root_0, nil_114.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:120:7: variable
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_variable_in_exprBase1203);
					variable115=variable();
					state._fsp--;

					adaptor.addChild(root_0, variable115.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:120:18: symbol
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_symbol_in_exprBase1207);
					symbol116=symbol();
					state._fsp--;

					adaptor.addChild(root_0, symbol116.getTree());

					}
					break;
				case 4 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:121:7: cons
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_cons_in_exprBase1215);
					cons117=cons();
					state._fsp--;

					adaptor.addChild(root_0, cons117.getTree());

					}
					break;
				case 5 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:121:14: list
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_list_in_exprBase1219);
					list118=list();
					state._fsp--;

					adaptor.addChild(root_0, list118.getTree());

					}
					break;
				case 6 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:122:7: hd
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_hd_in_exprBase1227);
					hd119=hd();
					state._fsp--;

					adaptor.addChild(root_0, hd119.getTree());

					}
					break;
				case 7 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:122:12: tl
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_tl_in_exprBase1231);
					tl120=tl();
					state._fsp--;

					adaptor.addChild(root_0, tl120.getTree());

					}
					break;
				case 8 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:123:7: symbolExpr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_symbolExpr_in_exprBase1239);
					symbolExpr121=symbolExpr();
					state._fsp--;

					adaptor.addChild(root_0, symbolExpr121.getTree());

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:126:1: nil_ : ( 'nil' ) -> 'nil' ;
	public final while_astParser.nil__return nil_() throws RecognitionException {
		while_astParser.nil__return retval = new while_astParser.nil__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal122=null;

		Object string_literal122_tree=null;
		RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:126:6: ( ( 'nil' ) -> 'nil' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:126:8: ( 'nil' )
			{
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:126:8: ( 'nil' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:126:9: 'nil'
			{
			string_literal122=(Token)match(input,56,FOLLOW_56_in_nil_1257);  
			stream_56.add(string_literal122);

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
			// 126:16: -> 'nil'
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:128:1: variable : Variable -> Variable ;
	public final while_astParser.variable_return variable() throws RecognitionException {
		while_astParser.variable_return retval = new while_astParser.variable_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Variable123=null;

		Object Variable123_tree=null;
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:128:9: ( Variable -> Variable )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:128:11: Variable
			{
			Variable123=(Token)match(input,Variable,FOLLOW_Variable_in_variable1274);  
			stream_Variable.add(Variable123);

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
			// 128:20: -> Variable
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:130:1: symbol : Symbol -> Symbol ;
	public final while_astParser.symbol_return symbol() throws RecognitionException {
		while_astParser.symbol_return retval = new while_astParser.symbol_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Symbol124=null;

		Object Symbol124_tree=null;
		RewriteRuleTokenStream stream_Symbol=new RewriteRuleTokenStream(adaptor,"token Symbol");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:130:8: ( Symbol -> Symbol )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:130:10: Symbol
			{
			Symbol124=(Token)match(input,Symbol,FOLLOW_Symbol_in_symbol1286);  
			stream_Symbol.add(Symbol124);

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
			// 130:17: -> Symbol
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


	public static class cons_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "cons"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:132:1: cons : '(' ( WS )* 'cons ' lExpr ( WS )* ')' -> ^( CONS lExpr ) ;
	public final while_astParser.cons_return cons() throws RecognitionException {
		while_astParser.cons_return retval = new while_astParser.cons_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal125=null;
		Token WS126=null;
		Token string_literal127=null;
		Token WS129=null;
		Token char_literal130=null;
		ParserRuleReturnScope lExpr128 =null;

		Object char_literal125_tree=null;
		Object WS126_tree=null;
		Object string_literal127_tree=null;
		Object WS129_tree=null;
		Object char_literal130_tree=null;
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_lExpr=new RewriteRuleSubtreeStream(adaptor,"rule lExpr");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:132:6: ( '(' ( WS )* 'cons ' lExpr ( WS )* ')' -> ^( CONS lExpr ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:132:8: '(' ( WS )* 'cons ' lExpr ( WS )* ')'
			{
			char_literal125=(Token)match(input,38,FOLLOW_38_in_cons1298);  
			stream_38.add(char_literal125);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:132:12: ( WS )*
			loop61:
			while (true) {
				int alt61=2;
				int LA61_0 = input.LA(1);
				if ( (LA61_0==WS) ) {
					alt61=1;
				}

				switch (alt61) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:132:12: WS
					{
					WS126=(Token)match(input,WS,FOLLOW_WS_in_cons1300);  
					stream_WS.add(WS126);

					}
					break;

				default :
					break loop61;
				}
			}

			string_literal127=(Token)match(input,45,FOLLOW_45_in_cons1303);  
			stream_45.add(string_literal127);

			pushFollow(FOLLOW_lExpr_in_cons1305);
			lExpr128=lExpr();
			state._fsp--;

			stream_lExpr.add(lExpr128.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:132:30: ( WS )*
			loop62:
			while (true) {
				int alt62=2;
				int LA62_0 = input.LA(1);
				if ( (LA62_0==WS) ) {
					alt62=1;
				}

				switch (alt62) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:132:30: WS
					{
					WS129=(Token)match(input,WS,FOLLOW_WS_in_cons1307);  
					stream_WS.add(WS129);

					}
					break;

				default :
					break loop62;
				}
			}

			char_literal130=(Token)match(input,39,FOLLOW_39_in_cons1310);  
			stream_39.add(char_literal130);

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
			// 132:38: -> ^( CONS lExpr )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:132:41: ^( CONS lExpr )
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:133:1: list : '(' ( WS )* 'list ' lExpr ( WS )* ')' -> ^( LIST lExpr ) ;
	public final while_astParser.list_return list() throws RecognitionException {
		while_astParser.list_return retval = new while_astParser.list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal131=null;
		Token WS132=null;
		Token string_literal133=null;
		Token WS135=null;
		Token char_literal136=null;
		ParserRuleReturnScope lExpr134 =null;

		Object char_literal131_tree=null;
		Object WS132_tree=null;
		Object string_literal133_tree=null;
		Object WS135_tree=null;
		Object char_literal136_tree=null;
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_lExpr=new RewriteRuleSubtreeStream(adaptor,"rule lExpr");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:133:6: ( '(' ( WS )* 'list ' lExpr ( WS )* ')' -> ^( LIST lExpr ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:133:8: '(' ( WS )* 'list ' lExpr ( WS )* ')'
			{
			char_literal131=(Token)match(input,38,FOLLOW_38_in_list1326);  
			stream_38.add(char_literal131);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:133:11: ( WS )*
			loop63:
			while (true) {
				int alt63=2;
				int LA63_0 = input.LA(1);
				if ( (LA63_0==WS) ) {
					alt63=1;
				}

				switch (alt63) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:133:11: WS
					{
					WS132=(Token)match(input,WS,FOLLOW_WS_in_list1327);  
					stream_WS.add(WS132);

					}
					break;

				default :
					break loop63;
				}
			}

			string_literal133=(Token)match(input,55,FOLLOW_55_in_list1330);  
			stream_55.add(string_literal133);

			pushFollow(FOLLOW_lExpr_in_list1332);
			lExpr134=lExpr();
			state._fsp--;

			stream_lExpr.add(lExpr134.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:133:29: ( WS )*
			loop64:
			while (true) {
				int alt64=2;
				int LA64_0 = input.LA(1);
				if ( (LA64_0==WS) ) {
					alt64=1;
				}

				switch (alt64) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:133:29: WS
					{
					WS135=(Token)match(input,WS,FOLLOW_WS_in_list1334);  
					stream_WS.add(WS135);

					}
					break;

				default :
					break loop64;
				}
			}

			char_literal136=(Token)match(input,39,FOLLOW_39_in_list1337);  
			stream_39.add(char_literal136);

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
			// 133:37: -> ^( LIST lExpr )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:133:40: ^( LIST lExpr )
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:135:1: hd : '(' ( WS )* 'hd ' exprBase ( WS )* ')' -> ^( HD exprBase ) ;
	public final while_astParser.hd_return hd() throws RecognitionException {
		while_astParser.hd_return retval = new while_astParser.hd_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal137=null;
		Token WS138=null;
		Token string_literal139=null;
		Token WS141=null;
		Token char_literal142=null;
		ParserRuleReturnScope exprBase140 =null;

		Object char_literal137_tree=null;
		Object WS138_tree=null;
		Object string_literal139_tree=null;
		Object WS141_tree=null;
		Object char_literal142_tree=null;
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
		RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:135:4: ( '(' ( WS )* 'hd ' exprBase ( WS )* ')' -> ^( HD exprBase ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:135:6: '(' ( WS )* 'hd ' exprBase ( WS )* ')'
			{
			char_literal137=(Token)match(input,38,FOLLOW_38_in_hd1353);  
			stream_38.add(char_literal137);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:135:9: ( WS )*
			loop65:
			while (true) {
				int alt65=2;
				int LA65_0 = input.LA(1);
				if ( (LA65_0==WS) ) {
					alt65=1;
				}

				switch (alt65) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:135:9: WS
					{
					WS138=(Token)match(input,WS,FOLLOW_WS_in_hd1354);  
					stream_WS.add(WS138);

					}
					break;

				default :
					break loop65;
				}
			}

			string_literal139=(Token)match(input,52,FOLLOW_52_in_hd1357);  
			stream_52.add(string_literal139);

			pushFollow(FOLLOW_exprBase_in_hd1359);
			exprBase140=exprBase();
			state._fsp--;

			stream_exprBase.add(exprBase140.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:135:28: ( WS )*
			loop66:
			while (true) {
				int alt66=2;
				int LA66_0 = input.LA(1);
				if ( (LA66_0==WS) ) {
					alt66=1;
				}

				switch (alt66) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:135:28: WS
					{
					WS141=(Token)match(input,WS,FOLLOW_WS_in_hd1361);  
					stream_WS.add(WS141);

					}
					break;

				default :
					break loop66;
				}
			}

			char_literal142=(Token)match(input,39,FOLLOW_39_in_hd1363);  
			stream_39.add(char_literal142);

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
			// 135:35: -> ^( HD exprBase )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:135:38: ^( HD exprBase )
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:137:1: tl : '(' ( WS )* 'tl ' exprBase ( WS )* ')' -> ^( TL exprBase ) ;
	public final while_astParser.tl_return tl() throws RecognitionException {
		while_astParser.tl_return retval = new while_astParser.tl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal143=null;
		Token WS144=null;
		Token string_literal145=null;
		Token WS147=null;
		Token char_literal148=null;
		ParserRuleReturnScope exprBase146 =null;

		Object char_literal143_tree=null;
		Object WS144_tree=null;
		Object string_literal145_tree=null;
		Object WS147_tree=null;
		Object char_literal148_tree=null;
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:137:4: ( '(' ( WS )* 'tl ' exprBase ( WS )* ')' -> ^( TL exprBase ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:137:6: '(' ( WS )* 'tl ' exprBase ( WS )* ')'
			{
			char_literal143=(Token)match(input,38,FOLLOW_38_in_tl1379);  
			stream_38.add(char_literal143);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:137:10: ( WS )*
			loop67:
			while (true) {
				int alt67=2;
				int LA67_0 = input.LA(1);
				if ( (LA67_0==WS) ) {
					alt67=1;
				}

				switch (alt67) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:137:10: WS
					{
					WS144=(Token)match(input,WS,FOLLOW_WS_in_tl1381);  
					stream_WS.add(WS144);

					}
					break;

				default :
					break loop67;
				}
			}

			string_literal145=(Token)match(input,61,FOLLOW_61_in_tl1383);  
			stream_61.add(string_literal145);

			pushFollow(FOLLOW_exprBase_in_tl1385);
			exprBase146=exprBase();
			state._fsp--;

			stream_exprBase.add(exprBase146.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:137:28: ( WS )*
			loop68:
			while (true) {
				int alt68=2;
				int LA68_0 = input.LA(1);
				if ( (LA68_0==WS) ) {
					alt68=1;
				}

				switch (alt68) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:137:28: WS
					{
					WS147=(Token)match(input,WS,FOLLOW_WS_in_tl1387);  
					stream_WS.add(WS147);

					}
					break;

				default :
					break loop68;
				}
			}

			char_literal148=(Token)match(input,39,FOLLOW_39_in_tl1389);  
			stream_39.add(char_literal148);

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
			// 137:35: -> ^( TL exprBase )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:137:38: ^( TL exprBase )
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:139:1: symbolExpr : '(' ( WS )* Symbol ( WS )* ( lExpr )? ( WS )* ')' -> ^( CALL Symbol ( lExpr )? ) ;
	public final while_astParser.symbolExpr_return symbolExpr() throws RecognitionException {
		while_astParser.symbolExpr_return retval = new while_astParser.symbolExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal149=null;
		Token WS150=null;
		Token Symbol151=null;
		Token WS152=null;
		Token WS154=null;
		Token char_literal155=null;
		ParserRuleReturnScope lExpr153 =null;

		Object char_literal149_tree=null;
		Object WS150_tree=null;
		Object Symbol151_tree=null;
		Object WS152_tree=null;
		Object WS154_tree=null;
		Object char_literal155_tree=null;
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_Symbol=new RewriteRuleTokenStream(adaptor,"token Symbol");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_lExpr=new RewriteRuleSubtreeStream(adaptor,"rule lExpr");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:140:2: ( '(' ( WS )* Symbol ( WS )* ( lExpr )? ( WS )* ')' -> ^( CALL Symbol ( lExpr )? ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:140:4: '(' ( WS )* Symbol ( WS )* ( lExpr )? ( WS )* ')'
			{
			char_literal149=(Token)match(input,38,FOLLOW_38_in_symbolExpr1406);  
			stream_38.add(char_literal149);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:140:8: ( WS )*
			loop69:
			while (true) {
				int alt69=2;
				int LA69_0 = input.LA(1);
				if ( (LA69_0==WS) ) {
					alt69=1;
				}

				switch (alt69) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:140:8: WS
					{
					WS150=(Token)match(input,WS,FOLLOW_WS_in_symbolExpr1408);  
					stream_WS.add(WS150);

					}
					break;

				default :
					break loop69;
				}
			}

			Symbol151=(Token)match(input,Symbol,FOLLOW_Symbol_in_symbolExpr1411);  
			stream_Symbol.add(Symbol151);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:140:19: ( WS )*
			loop70:
			while (true) {
				int alt70=2;
				int LA70_0 = input.LA(1);
				if ( (LA70_0==WS) ) {
					alt70=1;
				}

				switch (alt70) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:140:19: WS
					{
					WS152=(Token)match(input,WS,FOLLOW_WS_in_symbolExpr1413);  
					stream_WS.add(WS152);

					}
					break;

				default :
					break loop70;
				}
			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:140:23: ( lExpr )?
			int alt71=2;
			int LA71_0 = input.LA(1);
			if ( (LA71_0==Symbol||LA71_0==Variable||LA71_0==38||LA71_0==56) ) {
				alt71=1;
			}
			switch (alt71) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:140:23: lExpr
					{
					pushFollow(FOLLOW_lExpr_in_symbolExpr1416);
					lExpr153=lExpr();
					state._fsp--;

					stream_lExpr.add(lExpr153.getTree());
					}
					break;

			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:140:30: ( WS )*
			loop72:
			while (true) {
				int alt72=2;
				int LA72_0 = input.LA(1);
				if ( (LA72_0==WS) ) {
					alt72=1;
				}

				switch (alt72) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:140:30: WS
					{
					WS154=(Token)match(input,WS,FOLLOW_WS_in_symbolExpr1419);  
					stream_WS.add(WS154);

					}
					break;

				default :
					break loop72;
				}
			}

			char_literal155=(Token)match(input,39,FOLLOW_39_in_symbolExpr1421);  
			stream_39.add(char_literal155);

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
			// 140:37: -> ^( CALL Symbol ( lExpr )? )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:140:40: ^( CALL Symbol ( lExpr )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CALL, "CALL"), root_1);
				adaptor.addChild(root_1, stream_Symbol.nextNode());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:140:54: ( lExpr )?
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:143:1: expression : lExpr ( ( WS )* '=?' ( WS )* lExpr )? -> ^( EXPR lExpr ( lExpr )? ) ;
	public final while_astParser.expression_return expression() throws RecognitionException {
		while_astParser.expression_return retval = new while_astParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WS157=null;
		Token string_literal158=null;
		Token WS159=null;
		ParserRuleReturnScope lExpr156 =null;
		ParserRuleReturnScope lExpr160 =null;

		Object WS157_tree=null;
		Object string_literal158_tree=null;
		Object WS159_tree=null;
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_lExpr=new RewriteRuleSubtreeStream(adaptor,"rule lExpr");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:144:5: ( lExpr ( ( WS )* '=?' ( WS )* lExpr )? -> ^( EXPR lExpr ( lExpr )? ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:144:7: lExpr ( ( WS )* '=?' ( WS )* lExpr )?
			{
			pushFollow(FOLLOW_lExpr_in_expression1447);
			lExpr156=lExpr();
			state._fsp--;

			stream_lExpr.add(lExpr156.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:144:13: ( ( WS )* '=?' ( WS )* lExpr )?
			int alt75=2;
			alt75 = dfa75.predict(input);
			switch (alt75) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:144:14: ( WS )* '=?' ( WS )* lExpr
					{
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:144:14: ( WS )*
					loop73:
					while (true) {
						int alt73=2;
						int LA73_0 = input.LA(1);
						if ( (LA73_0==WS) ) {
							alt73=1;
						}

						switch (alt73) {
						case 1 :
							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:144:14: WS
							{
							WS157=(Token)match(input,WS,FOLLOW_WS_in_expression1450);  
							stream_WS.add(WS157);

							}
							break;

						default :
							break loop73;
						}
					}

					string_literal158=(Token)match(input,44,FOLLOW_44_in_expression1453);  
					stream_44.add(string_literal158);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:144:23: ( WS )*
					loop74:
					while (true) {
						int alt74=2;
						int LA74_0 = input.LA(1);
						if ( (LA74_0==WS) ) {
							alt74=1;
						}

						switch (alt74) {
						case 1 :
							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:144:23: WS
							{
							WS159=(Token)match(input,WS,FOLLOW_WS_in_expression1455);  
							stream_WS.add(WS159);

							}
							break;

						default :
							break loop74;
						}
					}

					pushFollow(FOLLOW_lExpr_in_expression1458);
					lExpr160=lExpr();
					state._fsp--;

					stream_lExpr.add(lExpr160.getTree());
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
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:144:38: ^( EXPR lExpr ( lExpr )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR, "EXPR"), root_1);
				adaptor.addChild(root_1, stream_lExpr.nextTree());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:144:51: ( lExpr )?
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:148:1: lExpr : exprBase ( ( WS )* lExpr )? -> exprBase ( lExpr )? ;
	public final while_astParser.lExpr_return lExpr() throws RecognitionException {
		while_astParser.lExpr_return retval = new while_astParser.lExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WS162=null;
		ParserRuleReturnScope exprBase161 =null;
		ParserRuleReturnScope lExpr163 =null;

		Object WS162_tree=null;
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");
		RewriteRuleSubtreeStream stream_lExpr=new RewriteRuleSubtreeStream(adaptor,"rule lExpr");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:149:5: ( exprBase ( ( WS )* lExpr )? -> exprBase ( lExpr )? )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:149:7: exprBase ( ( WS )* lExpr )?
			{
			pushFollow(FOLLOW_exprBase_in_lExpr1493);
			exprBase161=exprBase();
			state._fsp--;

			stream_exprBase.add(exprBase161.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:149:16: ( ( WS )* lExpr )?
			int alt77=2;
			alt77 = dfa77.predict(input);
			switch (alt77) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:149:17: ( WS )* lExpr
					{
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:149:17: ( WS )*
					loop76:
					while (true) {
						int alt76=2;
						int LA76_0 = input.LA(1);
						if ( (LA76_0==WS) ) {
							alt76=1;
						}

						switch (alt76) {
						case 1 :
							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:149:17: WS
							{
							WS162=(Token)match(input,WS,FOLLOW_WS_in_lExpr1496);  
							stream_WS.add(WS162);

							}
							break;

						default :
							break loop76;
						}
					}

					pushFollow(FOLLOW_lExpr_in_lExpr1499);
					lExpr163=lExpr();
					state._fsp--;

					stream_lExpr.add(lExpr163.getTree());
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
			// 149:29: -> exprBase ( lExpr )?
			{
				adaptor.addChild(root_0, stream_exprBase.nextTree());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet2\\while_grammarAST\\while_ast.g:149:41: ( lExpr )?
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
	protected DFA75 dfa75 = new DFA75(this);
	protected DFA77 dfa77 = new DFA77(this);
	static final String DFA24_eotS =
		"\4\uffff";
	static final String DFA24_eofS =
		"\4\uffff";
	static final String DFA24_minS =
		"\2\44\2\uffff";
	static final String DFA24_maxS =
		"\2\72\2\uffff";
	static final String DFA24_acceptS =
		"\2\uffff\1\1\1\2";
	static final String DFA24_specialS =
		"\4\uffff}>";
	static final String[] DFA24_transitionS = {
			"\1\1\1\3\5\uffff\1\2\3\uffff\2\3\11\uffff\1\3",
			"\1\1\1\3\5\uffff\1\2\3\uffff\2\3\11\uffff\1\3",
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
			return "79:15: ( ( WS )* ';' ( WS )* commands )?";
		}
	}

	static final String DFA60_eotS =
		"\13\uffff";
	static final String DFA60_eofS =
		"\13\uffff";
	static final String DFA60_minS =
		"\1\35\3\uffff\2\35\5\uffff";
	static final String DFA60_maxS =
		"\1\70\3\uffff\2\75\5\uffff";
	static final String DFA60_acceptS =
		"\1\uffff\1\1\1\2\1\3\2\uffff\1\4\1\5\1\6\1\7\1\10";
	static final String DFA60_specialS =
		"\13\uffff}>";
	static final String[] DFA60_transitionS = {
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
			return "119:1: exprBase : ( nil_ | variable | symbol | cons | list | hd | tl | symbolExpr );";
		}
	}

	static final String DFA75_eotS =
		"\4\uffff";
	static final String DFA75_eofS =
		"\4\uffff";
	static final String DFA75_minS =
		"\2\7\2\uffff";
	static final String DFA75_maxS =
		"\2\74\2\uffff";
	static final String DFA75_acceptS =
		"\2\uffff\1\1\1\2";
	static final String DFA75_specialS =
		"\4\uffff}>";
	static final String[] DFA75_transitionS = {
			"\1\3\34\uffff\1\1\1\3\2\uffff\1\3\2\uffff\1\3\1\2\1\uffff\3\3\11\uffff"+
			"\1\3\1\uffff\1\3",
			"\1\3\34\uffff\1\1\1\3\2\uffff\1\3\2\uffff\1\3\1\2\1\uffff\3\3\11\uffff"+
			"\1\3\1\uffff\1\3",
			"",
			""
	};

	static final short[] DFA75_eot = DFA.unpackEncodedString(DFA75_eotS);
	static final short[] DFA75_eof = DFA.unpackEncodedString(DFA75_eofS);
	static final char[] DFA75_min = DFA.unpackEncodedStringToUnsignedChars(DFA75_minS);
	static final char[] DFA75_max = DFA.unpackEncodedStringToUnsignedChars(DFA75_maxS);
	static final short[] DFA75_accept = DFA.unpackEncodedString(DFA75_acceptS);
	static final short[] DFA75_special = DFA.unpackEncodedString(DFA75_specialS);
	static final short[][] DFA75_transition;

	static {
		int numStates = DFA75_transitionS.length;
		DFA75_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA75_transition[i] = DFA.unpackEncodedString(DFA75_transitionS[i]);
		}
	}

	protected class DFA75 extends DFA {

		public DFA75(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 75;
			this.eot = DFA75_eot;
			this.eof = DFA75_eof;
			this.min = DFA75_min;
			this.max = DFA75_max;
			this.accept = DFA75_accept;
			this.special = DFA75_special;
			this.transition = DFA75_transition;
		}
		@Override
		public String getDescription() {
			return "144:13: ( ( WS )* '=?' ( WS )* lExpr )?";
		}
	}

	static final String DFA77_eotS =
		"\4\uffff";
	static final String DFA77_eofS =
		"\4\uffff";
	static final String DFA77_minS =
		"\2\7\2\uffff";
	static final String DFA77_maxS =
		"\2\74\2\uffff";
	static final String DFA77_acceptS =
		"\2\uffff\1\1\1\2";
	static final String DFA77_specialS =
		"\4\uffff}>";
	static final String[] DFA77_transitionS = {
			"\1\3\25\uffff\1\2\4\uffff\1\2\1\uffff\1\1\1\3\1\2\2\3\2\uffff\2\3\1\uffff"+
			"\3\3\7\uffff\1\2\1\uffff\1\3\1\uffff\1\3",
			"\1\3\25\uffff\1\2\4\uffff\1\2\1\uffff\1\1\1\3\1\2\2\3\2\uffff\2\3\1"+
			"\uffff\3\3\7\uffff\1\2\1\uffff\1\3\1\uffff\1\3",
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
			return "149:16: ( ( WS )* lExpr )?";
		}
	}

	public static final BitSet FOLLOW_program_in_startProgram222 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Comment_in_getComment401 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_in_program421 = new BitSet(new long[]{0x0008001000000082L});
	public static final BitSet FOLLOW_WS_in_program423 = new BitSet(new long[]{0x0008001000000082L});
	public static final BitSet FOLLOW_program_in_program426 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getComment_in_function457 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_51_in_function460 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_Symbol_in_function462 = new BitSet(new long[]{0x0000021000000000L});
	public static final BitSet FOLLOW_WS_in_function464 = new BitSet(new long[]{0x0000021000000000L});
	public static final BitSet FOLLOW_41_in_function467 = new BitSet(new long[]{0x0800001000000080L});
	public static final BitSet FOLLOW_getComment_in_function469 = new BitSet(new long[]{0x0800001000000000L});
	public static final BitSet FOLLOW_WS_in_function472 = new BitSet(new long[]{0x0800001000000000L});
	public static final BitSet FOLLOW_definition_in_function475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_59_in_definition508 = new BitSet(new long[]{0x0000003400000080L});
	public static final BitSet FOLLOW_WS_in_definition510 = new BitSet(new long[]{0x0000003400000080L});
	public static final BitSet FOLLOW_input_in_definition513 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_definition515 = new BitSet(new long[]{0x4226001400000080L});
	public static final BitSet FOLLOW_getComment_in_definition517 = new BitSet(new long[]{0x4226001400000000L});
	public static final BitSet FOLLOW_WS_in_definition520 = new BitSet(new long[]{0x4226001400000000L});
	public static final BitSet FOLLOW_commands_in_definition523 = new BitSet(new long[]{0x0000003000000000L});
	public static final BitSet FOLLOW_WS_in_definition525 = new BitSet(new long[]{0x0000003000000000L});
	public static final BitSet FOLLOW_37_in_definition528 = new BitSet(new long[]{0x8000001000000080L});
	public static final BitSet FOLLOW_getComment_in_definition530 = new BitSet(new long[]{0x8000001000000000L});
	public static final BitSet FOLLOW_WS_in_definition533 = new BitSet(new long[]{0x8000001000000000L});
	public static final BitSet FOLLOW_63_in_definition536 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_output_in_definition538 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_getComment_in_definition540 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inputSub_in_input572 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_getComment_in_input575 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_inputSub606 = new BitSet(new long[]{0x0000011000000002L});
	public static final BitSet FOLLOW_WS_in_inputSub608 = new BitSet(new long[]{0x0000011000000002L});
	public static final BitSet FOLLOW_40_in_inputSub612 = new BitSet(new long[]{0x0000001400000000L});
	public static final BitSet FOLLOW_WS_in_inputSub614 = new BitSet(new long[]{0x0000001400000000L});
	public static final BitSet FOLLOW_inputSub_in_inputSub617 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_output644 = new BitSet(new long[]{0x0000011000000002L});
	public static final BitSet FOLLOW_WS_in_output646 = new BitSet(new long[]{0x0000011000000002L});
	public static final BitSet FOLLOW_40_in_output650 = new BitSet(new long[]{0x0000001400000000L});
	public static final BitSet FOLLOW_WS_in_output652 = new BitSet(new long[]{0x0000001400000000L});
	public static final BitSet FOLLOW_output_in_output655 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_in_commands685 = new BitSet(new long[]{0x0000081000000002L});
	public static final BitSet FOLLOW_WS_in_commands689 = new BitSet(new long[]{0x0000081000000000L});
	public static final BitSet FOLLOW_43_in_commands692 = new BitSet(new long[]{0x4226001400000000L});
	public static final BitSet FOLLOW_WS_in_commands694 = new BitSet(new long[]{0x4226001400000000L});
	public static final BitSet FOLLOW_commands_in_commands697 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_command724 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decl_in_command728 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if__in_command732 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_for__in_command736 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_while__in_command740 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foreach__in_command744 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vars_in_decl758 = new BitSet(new long[]{0x0000041000000000L});
	public static final BitSet FOLLOW_WS_in_decl760 = new BitSet(new long[]{0x0000041000000000L});
	public static final BitSet FOLLOW_42_in_decl763 = new BitSet(new long[]{0x0100005420000000L});
	public static final BitSet FOLLOW_WS_in_decl765 = new BitSet(new long[]{0x0100005420000000L});
	public static final BitSet FOLLOW_exprs_in_decl768 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_getComment_in_decl771 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_53_in_if_805 = new BitSet(new long[]{0x0100005420000000L});
	public static final BitSet FOLLOW_WS_in_if_807 = new BitSet(new long[]{0x0100005420000000L});
	public static final BitSet FOLLOW_expression_in_if_810 = new BitSet(new long[]{0x1000001000000000L});
	public static final BitSet FOLLOW_WS_in_if_812 = new BitSet(new long[]{0x1000001000000000L});
	public static final BitSet FOLLOW_then__in_if_815 = new BitSet(new long[]{0x0001801000000000L});
	public static final BitSet FOLLOW_WS_in_if_817 = new BitSet(new long[]{0x0001801000000000L});
	public static final BitSet FOLLOW_else__in_if_821 = new BitSet(new long[]{0x0001001000000000L});
	public static final BitSet FOLLOW_WS_in_if_823 = new BitSet(new long[]{0x0001001000000000L});
	public static final BitSet FOLLOW_48_in_if_828 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_getComment_in_if_830 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_60_in_then_868 = new BitSet(new long[]{0x4226001400000080L});
	public static final BitSet FOLLOW_getComment_in_then_870 = new BitSet(new long[]{0x4226001400000000L});
	public static final BitSet FOLLOW_WS_in_then_873 = new BitSet(new long[]{0x4226001400000000L});
	public static final BitSet FOLLOW_commands_in_then_876 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_47_in_else_896 = new BitSet(new long[]{0x4226001400000080L});
	public static final BitSet FOLLOW_getComment_in_else_898 = new BitSet(new long[]{0x4226001400000000L});
	public static final BitSet FOLLOW_WS_in_else_901 = new BitSet(new long[]{0x4226001400000000L});
	public static final BitSet FOLLOW_commands_in_else_904 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_62_in_while_930 = new BitSet(new long[]{0x0100005420000000L});
	public static final BitSet FOLLOW_WS_in_while_932 = new BitSet(new long[]{0x0100005420000000L});
	public static final BitSet FOLLOW_expression_in_while_935 = new BitSet(new long[]{0x0000401000000080L});
	public static final BitSet FOLLOW_getComment_in_while_937 = new BitSet(new long[]{0x0000401000000000L});
	public static final BitSet FOLLOW_WS_in_while_940 = new BitSet(new long[]{0x0000401000000000L});
	public static final BitSet FOLLOW_do__in_while_943 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_do_977 = new BitSet(new long[]{0x4226001400000080L});
	public static final BitSet FOLLOW_getComment_in_do_979 = new BitSet(new long[]{0x4226001400000000L});
	public static final BitSet FOLLOW_WS_in_do_982 = new BitSet(new long[]{0x4226001400000000L});
	public static final BitSet FOLLOW_commands_in_do_985 = new BitSet(new long[]{0x0400001000000000L});
	public static final BitSet FOLLOW_WS_in_do_987 = new BitSet(new long[]{0x0400001000000000L});
	public static final BitSet FOLLOW_58_in_do_990 = new BitSet(new long[]{0x0000000000000082L});
	public static final BitSet FOLLOW_getComment_in_do_992 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_for_1018 = new BitSet(new long[]{0x0100005420000000L});
	public static final BitSet FOLLOW_WS_in_for_1020 = new BitSet(new long[]{0x0100005420000000L});
	public static final BitSet FOLLOW_expression_in_for_1023 = new BitSet(new long[]{0x0000401000000080L});
	public static final BitSet FOLLOW_getComment_in_for_1025 = new BitSet(new long[]{0x0000401000000000L});
	public static final BitSet FOLLOW_WS_in_for_1028 = new BitSet(new long[]{0x0000401000000000L});
	public static final BitSet FOLLOW_do__in_for_1031 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_foreach_1062 = new BitSet(new long[]{0x0000001400000000L});
	public static final BitSet FOLLOW_WS_in_foreach_1064 = new BitSet(new long[]{0x0000001400000000L});
	public static final BitSet FOLLOW_Variable_in_foreach_1067 = new BitSet(new long[]{0x0040001000000000L});
	public static final BitSet FOLLOW_WS_in_foreach_1069 = new BitSet(new long[]{0x0040001000000000L});
	public static final BitSet FOLLOW_54_in_foreach_1072 = new BitSet(new long[]{0x0100005420000000L});
	public static final BitSet FOLLOW_WS_in_foreach_1074 = new BitSet(new long[]{0x0100005420000000L});
	public static final BitSet FOLLOW_expression_in_foreach_1077 = new BitSet(new long[]{0x0000401000000080L});
	public static final BitSet FOLLOW_getComment_in_foreach_1079 = new BitSet(new long[]{0x0000401000000000L});
	public static final BitSet FOLLOW_WS_in_foreach_1082 = new BitSet(new long[]{0x0000401000000000L});
	public static final BitSet FOLLOW_do__in_foreach_1085 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_vars1124 = new BitSet(new long[]{0x0000011000000002L});
	public static final BitSet FOLLOW_WS_in_vars1126 = new BitSet(new long[]{0x0000011000000002L});
	public static final BitSet FOLLOW_40_in_vars1130 = new BitSet(new long[]{0x0000001400000000L});
	public static final BitSet FOLLOW_WS_in_vars1131 = new BitSet(new long[]{0x0000001400000000L});
	public static final BitSet FOLLOW_vars_in_vars1134 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_exprs1160 = new BitSet(new long[]{0x0000011000000002L});
	public static final BitSet FOLLOW_WS_in_exprs1162 = new BitSet(new long[]{0x0000011000000002L});
	public static final BitSet FOLLOW_40_in_exprs1166 = new BitSet(new long[]{0x0100005420000000L});
	public static final BitSet FOLLOW_WS_in_exprs1167 = new BitSet(new long[]{0x0100005420000000L});
	public static final BitSet FOLLOW_exprs_in_exprs1170 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nil__in_exprBase1195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_exprBase1203 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_symbol_in_exprBase1207 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cons_in_exprBase1215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_list_in_exprBase1219 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_hd_in_exprBase1227 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tl_in_exprBase1231 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_symbolExpr_in_exprBase1239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_56_in_nil_1257 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_variable1274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Symbol_in_symbol1286 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_cons1298 = new BitSet(new long[]{0x0000201000000000L});
	public static final BitSet FOLLOW_WS_in_cons1300 = new BitSet(new long[]{0x0000201000000000L});
	public static final BitSet FOLLOW_45_in_cons1303 = new BitSet(new long[]{0x0100004420000000L});
	public static final BitSet FOLLOW_lExpr_in_cons1305 = new BitSet(new long[]{0x0000009000000000L});
	public static final BitSet FOLLOW_WS_in_cons1307 = new BitSet(new long[]{0x0000009000000000L});
	public static final BitSet FOLLOW_39_in_cons1310 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_list1326 = new BitSet(new long[]{0x0080001000000000L});
	public static final BitSet FOLLOW_WS_in_list1327 = new BitSet(new long[]{0x0080001000000000L});
	public static final BitSet FOLLOW_55_in_list1330 = new BitSet(new long[]{0x0100004420000000L});
	public static final BitSet FOLLOW_lExpr_in_list1332 = new BitSet(new long[]{0x0000009000000000L});
	public static final BitSet FOLLOW_WS_in_list1334 = new BitSet(new long[]{0x0000009000000000L});
	public static final BitSet FOLLOW_39_in_list1337 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_hd1353 = new BitSet(new long[]{0x0010001000000000L});
	public static final BitSet FOLLOW_WS_in_hd1354 = new BitSet(new long[]{0x0010001000000000L});
	public static final BitSet FOLLOW_52_in_hd1357 = new BitSet(new long[]{0x0100004420000000L});
	public static final BitSet FOLLOW_exprBase_in_hd1359 = new BitSet(new long[]{0x0000009000000000L});
	public static final BitSet FOLLOW_WS_in_hd1361 = new BitSet(new long[]{0x0000009000000000L});
	public static final BitSet FOLLOW_39_in_hd1363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_tl1379 = new BitSet(new long[]{0x2000001000000000L});
	public static final BitSet FOLLOW_WS_in_tl1381 = new BitSet(new long[]{0x2000001000000000L});
	public static final BitSet FOLLOW_61_in_tl1383 = new BitSet(new long[]{0x0100004420000000L});
	public static final BitSet FOLLOW_exprBase_in_tl1385 = new BitSet(new long[]{0x0000009000000000L});
	public static final BitSet FOLLOW_WS_in_tl1387 = new BitSet(new long[]{0x0000009000000000L});
	public static final BitSet FOLLOW_39_in_tl1389 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_38_in_symbolExpr1406 = new BitSet(new long[]{0x0000001020000000L});
	public static final BitSet FOLLOW_WS_in_symbolExpr1408 = new BitSet(new long[]{0x0000001020000000L});
	public static final BitSet FOLLOW_Symbol_in_symbolExpr1411 = new BitSet(new long[]{0x010000D420000000L});
	public static final BitSet FOLLOW_WS_in_symbolExpr1413 = new BitSet(new long[]{0x010000D420000000L});
	public static final BitSet FOLLOW_lExpr_in_symbolExpr1416 = new BitSet(new long[]{0x0000009000000000L});
	public static final BitSet FOLLOW_WS_in_symbolExpr1419 = new BitSet(new long[]{0x0000009000000000L});
	public static final BitSet FOLLOW_39_in_symbolExpr1421 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lExpr_in_expression1447 = new BitSet(new long[]{0x0000101000000002L});
	public static final BitSet FOLLOW_WS_in_expression1450 = new BitSet(new long[]{0x0000101000000000L});
	public static final BitSet FOLLOW_44_in_expression1453 = new BitSet(new long[]{0x0100005420000000L});
	public static final BitSet FOLLOW_WS_in_expression1455 = new BitSet(new long[]{0x0100005420000000L});
	public static final BitSet FOLLOW_lExpr_in_expression1458 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprBase_in_lExpr1493 = new BitSet(new long[]{0x0100005420000002L});
	public static final BitSet FOLLOW_WS_in_lExpr1496 = new BitSet(new long[]{0x0100005420000000L});
	public static final BitSet FOLLOW_lExpr_in_lExpr1499 = new BitSet(new long[]{0x0000000000000002L});
}

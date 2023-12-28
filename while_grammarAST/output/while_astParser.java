// $ANTLR 3.5.1 C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g 2023-12-28 16:48:46

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class while_astParser extends Parser {
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:34:1: startProgram : program -> ^( START program ) ;
	public final while_astParser.startProgram_return startProgram() throws RecognitionException {
		while_astParser.startProgram_return retval = new while_astParser.startProgram_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope program1 =null;

		RewriteRuleSubtreeStream stream_program=new RewriteRuleSubtreeStream(adaptor,"rule program");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:35:5: ( program -> ^( START program ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:35:7: program
			{
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
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:35:18: ^( START program )
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

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:47:5: ( function ( program )? -> ^( PROGRAM function ( program )? ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:47:7: function ( program )?
			{
			pushFollow(FOLLOW_function_in_program355);
			function2=function();
			state._fsp--;

			stream_function.add(function2.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:47:16: ( program )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==47) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:47:16: program
					{
					pushFollow(FOLLOW_program_in_program357);
					program3=program();
					state._fsp--;

					stream_program.add(program3.getTree());
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
			// 47:25: -> ^( PROGRAM function ( program )? )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:47:28: ^( PROGRAM function ( program )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);
				adaptor.addChild(root_1, stream_function.nextTree());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:47:47: ( program )?
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

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:51:5: ( 'function ' Symbol ( WS )* ':' ( WS )* definition -> ^( FUNCDEF Symbol definition END ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:51:7: 'function ' Symbol ( WS )* ':' ( WS )* definition
			{
			string_literal4=(Token)match(input,47,FOLLOW_47_in_function386);  
			stream_47.add(string_literal4);

			Symbol5=(Token)match(input,Symbol,FOLLOW_Symbol_in_function388);  
			stream_Symbol.add(Symbol5);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:51:26: ( WS )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==WS) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:51:26: WS
					{
					WS6=(Token)match(input,WS,FOLLOW_WS_in_function390);  
					stream_WS.add(WS6);

					}
					break;

				default :
					break loop2;
				}
			}

			char_literal7=(Token)match(input,37,FOLLOW_37_in_function393);  
			stream_37.add(char_literal7);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:51:34: ( WS )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==WS) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:51:34: WS
					{
					WS8=(Token)match(input,WS,FOLLOW_WS_in_function395);  
					stream_WS.add(WS8);

					}
					break;

				default :
					break loop3;
				}
			}

			pushFollow(FOLLOW_definition_in_function398);
			definition9=definition();
			state._fsp--;

			stream_definition.add(definition9.getTree());
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
			// 51:49: -> ^( FUNCDEF Symbol definition END )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:51:52: ^( FUNCDEF Symbol definition END )
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

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:55:5: ( 'read' ( WS )* input '%' ( WS )* commands ( WS )* '%' ( WS )* 'write ' output -> ^( FUNCTION input commands output ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:55:7: 'read' ( WS )* input '%' ( WS )* commands ( WS )* '%' ( WS )* 'write ' output
			{
			string_literal10=(Token)match(input,55,FOLLOW_55_in_definition427);  
			stream_55.add(string_literal10);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:55:14: ( WS )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==WS) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:55:14: WS
					{
					WS11=(Token)match(input,WS,FOLLOW_WS_in_definition429);  
					stream_WS.add(WS11);

					}
					break;

				default :
					break loop4;
				}
			}

			pushFollow(FOLLOW_input_in_definition432);
			input12=input();
			state._fsp--;

			stream_input.add(input12.getTree());
			char_literal13=(Token)match(input,33,FOLLOW_33_in_definition434);  
			stream_33.add(char_literal13);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:55:28: ( WS )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==WS) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:55:28: WS
					{
					WS14=(Token)match(input,WS,FOLLOW_WS_in_definition436);  
					stream_WS.add(WS14);

					}
					break;

				default :
					break loop5;
				}
			}

			pushFollow(FOLLOW_commands_in_definition439);
			commands15=commands();
			state._fsp--;

			stream_commands.add(commands15.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:55:41: ( WS )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==WS) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:55:41: WS
					{
					WS16=(Token)match(input,WS,FOLLOW_WS_in_definition441);  
					stream_WS.add(WS16);

					}
					break;

				default :
					break loop6;
				}
			}

			char_literal17=(Token)match(input,33,FOLLOW_33_in_definition443);  
			stream_33.add(char_literal17);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:55:48: ( WS )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==WS) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:55:48: WS
					{
					WS18=(Token)match(input,WS,FOLLOW_WS_in_definition445);  
					stream_WS.add(WS18);

					}
					break;

				default :
					break loop7;
				}
			}

			string_literal19=(Token)match(input,59,FOLLOW_59_in_definition448);  
			stream_59.add(string_literal19);

			pushFollow(FOLLOW_output_in_definition450);
			output20=output();
			state._fsp--;

			stream_output.add(output20.getTree());
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
			// 55:68: -> ^( FUNCTION input commands output )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:55:71: ^( FUNCTION input commands output )
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:58:1: input : ( inputSub )? -> ^( INPUTS ( inputSub )? ) ;
	public final while_astParser.input_return input() throws RecognitionException {
		while_astParser.input_return retval = new while_astParser.input_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope inputSub21 =null;

		RewriteRuleSubtreeStream stream_inputSub=new RewriteRuleSubtreeStream(adaptor,"rule inputSub");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:59:5: ( ( inputSub )? -> ^( INPUTS ( inputSub )? ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:59:7: ( inputSub )?
			{
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:59:7: ( inputSub )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==Variable) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:59:7: inputSub
					{
					pushFollow(FOLLOW_inputSub_in_input479);
					inputSub21=inputSub();
					state._fsp--;

					stream_inputSub.add(inputSub21.getTree());
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
			// 59:17: -> ^( INPUTS ( inputSub )? )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:59:21: ^( INPUTS ( inputSub )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INPUTS, "INPUTS"), root_1);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:59:30: ( inputSub )?
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

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:63:5: ( Variable ( WS )* ( ',' ( WS )* inputSub )? -> Variable ( inputSub )? )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:63:7: Variable ( WS )* ( ',' ( WS )* inputSub )?
			{
			Variable22=(Token)match(input,Variable,FOLLOW_Variable_in_inputSub507);  
			stream_Variable.add(Variable22);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:63:16: ( WS )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==WS) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:63:16: WS
					{
					WS23=(Token)match(input,WS,FOLLOW_WS_in_inputSub509);  
					stream_WS.add(WS23);

					}
					break;

				default :
					break loop9;
				}
			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:63:20: ( ',' ( WS )* inputSub )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==36) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:63:21: ',' ( WS )* inputSub
					{
					char_literal24=(Token)match(input,36,FOLLOW_36_in_inputSub513);  
					stream_36.add(char_literal24);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:63:25: ( WS )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==WS) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:63:25: WS
							{
							WS25=(Token)match(input,WS,FOLLOW_WS_in_inputSub515);  
							stream_WS.add(WS25);

							}
							break;

						default :
							break loop10;
						}
					}

					pushFollow(FOLLOW_inputSub_in_inputSub518);
					inputSub26=inputSub();
					state._fsp--;

					stream_inputSub.add(inputSub26.getTree());
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
			// 63:40: -> Variable ( inputSub )?
			{
				adaptor.addChild(root_0, stream_Variable.nextNode());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:63:52: ( inputSub )?
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

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:67:5: ( Variable ( ',' output )? -> ^( OUTPUT Variable ( output )? ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:67:7: Variable ( ',' output )?
			{
			Variable27=(Token)match(input,Variable,FOLLOW_Variable_in_output544);  
			stream_Variable.add(Variable27);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:67:16: ( ',' output )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==36) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:67:17: ',' output
					{
					char_literal28=(Token)match(input,36,FOLLOW_36_in_output547);  
					stream_36.add(char_literal28);

					pushFollow(FOLLOW_output_in_output549);
					output29=output();
					state._fsp--;

					stream_output.add(output29.getTree());
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
			// 67:30: -> ^( OUTPUT Variable ( output )? )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:67:33: ^( OUTPUT Variable ( output )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OUTPUT, "OUTPUT"), root_1);
				adaptor.addChild(root_1, stream_Variable.nextNode());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:67:51: ( output )?
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

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:71:5: ( command ( ( WS )* ';' ( WS )* commands )? -> command ( commands )? )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:71:7: command ( ( WS )* ';' ( WS )* commands )?
			{
			pushFollow(FOLLOW_command_in_commands579);
			command30=command();
			state._fsp--;

			stream_command.add(command30.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:71:15: ( ( WS )* ';' ( WS )* commands )?
			int alt15=2;
			alt15 = dfa15.predict(input);
			switch (alt15) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:71:17: ( WS )* ';' ( WS )* commands
					{
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:71:17: ( WS )*
					loop13:
					while (true) {
						int alt13=2;
						int LA13_0 = input.LA(1);
						if ( (LA13_0==WS) ) {
							alt13=1;
						}

						switch (alt13) {
						case 1 :
							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:71:17: WS
							{
							WS31=(Token)match(input,WS,FOLLOW_WS_in_commands583);  
							stream_WS.add(WS31);

							}
							break;

						default :
							break loop13;
						}
					}

					char_literal32=(Token)match(input,39,FOLLOW_39_in_commands586);  
					stream_39.add(char_literal32);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:71:25: ( WS )*
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0==WS) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:71:25: WS
							{
							WS33=(Token)match(input,WS,FOLLOW_WS_in_commands588);  
							stream_WS.add(WS33);

							}
							break;

						default :
							break loop14;
						}
					}

					pushFollow(FOLLOW_commands_in_commands591);
					commands34=commands();
					state._fsp--;

					stream_commands.add(commands34.getTree());
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
			// 71:40: -> command ( commands )?
			{
				adaptor.addChild(root_0, stream_command.nextTree());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:71:51: ( commands )?
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

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:75:5: ( 'nop' | decl | if_ | for_ | while_ | foreach_ )
			int alt16=6;
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
				throw nvae;
			}
			switch (alt16) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:75:7: 'nop'
					{
					root_0 = (Object)adaptor.nil();


					string_literal35=(Token)match(input,53,FOLLOW_53_in_command618); 
					string_literal35_tree = (Object)adaptor.create(string_literal35);
					adaptor.addChild(root_0, string_literal35_tree);

					}
					break;
				case 2 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:75:15: decl
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_decl_in_command622);
					decl36=decl();
					state._fsp--;

					adaptor.addChild(root_0, decl36.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:75:22: if_
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_if__in_command626);
					if_37=if_();
					state._fsp--;

					adaptor.addChild(root_0, if_37.getTree());

					}
					break;
				case 4 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:75:28: for_
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_for__in_command630);
					for_38=for_();
					state._fsp--;

					adaptor.addChild(root_0, for_38.getTree());

					}
					break;
				case 5 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:75:35: while_
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_while__in_command634);
					while_39=while_();
					state._fsp--;

					adaptor.addChild(root_0, while_39.getTree());

					}
					break;
				case 6 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:75:44: foreach_
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_foreach__in_command638);
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

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:78:5: ( ( vars ( WS )* ':=' ( WS )* exprs ) -> ^( VARDEF vars exprs ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:78:7: ( vars ( WS )* ':=' ( WS )* exprs )
			{
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:78:7: ( vars ( WS )* ':=' ( WS )* exprs )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:78:8: vars ( WS )* ':=' ( WS )* exprs
			{
			pushFollow(FOLLOW_vars_in_decl652);
			vars41=vars();
			state._fsp--;

			stream_vars.add(vars41.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:78:13: ( WS )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==WS) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:78:13: WS
					{
					WS42=(Token)match(input,WS,FOLLOW_WS_in_decl654);  
					stream_WS.add(WS42);

					}
					break;

				default :
					break loop17;
				}
			}

			string_literal43=(Token)match(input,38,FOLLOW_38_in_decl657);  
			stream_38.add(string_literal43);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:78:22: ( WS )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==WS) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:78:22: WS
					{
					WS44=(Token)match(input,WS,FOLLOW_WS_in_decl659);  
					stream_WS.add(WS44);

					}
					break;

				default :
					break loop18;
				}
			}

			pushFollow(FOLLOW_exprs_in_decl662);
			exprs45=exprs();
			state._fsp--;

			stream_exprs.add(exprs45.getTree());
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
			// 78:33: -> ^( VARDEF vars exprs )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:78:36: ^( VARDEF vars exprs )
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:81:1: if_ : ( 'if' ( WS )* expression ( WS )* then_ ( WS )* else_ 'fi' ( WS )* ) -> ^( IF expression then_ ( else_ )? END ) ;
	public final while_astParser.if__return if_() throws RecognitionException {
		while_astParser.if__return retval = new while_astParser.if__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal46=null;
		Token WS47=null;
		Token WS49=null;
		Token WS51=null;
		Token string_literal53=null;
		Token WS54=null;
		ParserRuleReturnScope expression48 =null;
		ParserRuleReturnScope then_50 =null;
		ParserRuleReturnScope else_52 =null;

		Object string_literal46_tree=null;
		Object WS47_tree=null;
		Object WS49_tree=null;
		Object WS51_tree=null;
		Object string_literal53_tree=null;
		Object WS54_tree=null;
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_then_=new RewriteRuleSubtreeStream(adaptor,"rule then_");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_else_=new RewriteRuleSubtreeStream(adaptor,"rule else_");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:82:5: ( ( 'if' ( WS )* expression ( WS )* then_ ( WS )* else_ 'fi' ( WS )* ) -> ^( IF expression then_ ( else_ )? END ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:82:7: ( 'if' ( WS )* expression ( WS )* then_ ( WS )* else_ 'fi' ( WS )* )
			{
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:82:7: ( 'if' ( WS )* expression ( WS )* then_ ( WS )* else_ 'fi' ( WS )* )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:82:8: 'if' ( WS )* expression ( WS )* then_ ( WS )* else_ 'fi' ( WS )*
			{
			string_literal46=(Token)match(input,49,FOLLOW_49_in_if_691);  
			stream_49.add(string_literal46);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:82:13: ( WS )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==WS) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:82:13: WS
					{
					WS47=(Token)match(input,WS,FOLLOW_WS_in_if_693);  
					stream_WS.add(WS47);

					}
					break;

				default :
					break loop19;
				}
			}

			pushFollow(FOLLOW_expression_in_if_696);
			expression48=expression();
			state._fsp--;

			stream_expression.add(expression48.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:82:28: ( WS )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==WS) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:82:28: WS
					{
					WS49=(Token)match(input,WS,FOLLOW_WS_in_if_698);  
					stream_WS.add(WS49);

					}
					break;

				default :
					break loop20;
				}
			}

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
			string_literal53=(Token)match(input,44,FOLLOW_44_in_if_709);  
			stream_44.add(string_literal53);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:82:54: ( WS )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==WS) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:82:54: WS
					{
					WS54=(Token)match(input,WS,FOLLOW_WS_in_if_711);  
					stream_WS.add(WS54);

					}
					break;

				default :
					break loop22;
				}
			}

			}

			// AST REWRITE
			// elements: then_, else_, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 82:59: -> ^( IF expression then_ ( else_ )? END )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:82:62: ^( IF expression then_ ( else_ )? END )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_1, stream_then_.nextTree());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:82:84: ( else_ )?
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
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:93:6: ( 'do' ( WS )* commands ( WS )* 'od' -> ^( DO commands ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:93:8: 'do' ( WS )* commands ( WS )* 'od'
			{
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

				switch (alt29) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:93:13: WS
					{
					WS68=(Token)match(input,WS,FOLLOW_WS_in_do_841);  
					stream_WS.add(WS68);

					}
					break;

				default :
					break loop29;
				}
			}

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
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:93:38: ^( DO commands )
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:95:1: for_ : ( 'for' ( WS )* expression ( WS )* do_ ) -> ^( FOR expression do_ END ) ;
	public final while_astParser.for__return for_() throws RecognitionException {
		while_astParser.for__return retval = new while_astParser.for__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal72=null;
		Token WS73=null;
		Token WS75=null;
		ParserRuleReturnScope expression74 =null;
		ParserRuleReturnScope do_76 =null;

		Object string_literal72_tree=null;
		Object WS73_tree=null;
		Object WS75_tree=null;
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_do_=new RewriteRuleSubtreeStream(adaptor,"rule do_");

		try {
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

				switch (alt31) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:96:14: WS
					{
					WS73=(Token)match(input,WS,FOLLOW_WS_in_for_872);  
					stream_WS.add(WS73);

					}
					break;

				default :
					break loop31;
				}
			}

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

					}
					break;

				default :
					break loop32;
				}
			}

			pushFollow(FOLLOW_do__in_for_880);
			do_76=do_();
			state._fsp--;

			stream_do_.add(do_76.getTree());
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
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:96:41: ^( FOR expression do_ END )
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:1: foreach_ : ( 'foreach' ( WS )* Variable ( WS )* 'in' ( WS )* expression ( WS )* do_ ) -> ^( FOREACH ^( IN Variable expression ) do_ END ) ;
	public final while_astParser.foreach__return foreach_() throws RecognitionException {
		while_astParser.foreach__return retval = new while_astParser.foreach__return();
		retval.start = input.LT(1);

		Object root_0 = null;

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
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_do_=new RewriteRuleSubtreeStream(adaptor,"rule do_");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:100:5: ( ( 'foreach' ( WS )* Variable ( WS )* 'in' ( WS )* expression ( WS )* do_ ) -> ^( FOREACH ^( IN Variable expression ) do_ END ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:100:7: ( 'foreach' ( WS )* Variable ( WS )* 'in' ( WS )* expression ( WS )* do_ )
			{
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:100:7: ( 'foreach' ( WS )* Variable ( WS )* 'in' ( WS )* expression ( WS )* do_ )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:100:8: 'foreach' ( WS )* Variable ( WS )* 'in' ( WS )* expression ( WS )* do_
			{
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

					}
					break;

				default :
					break loop33;
				}
			}

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

					}
					break;

				default :
					break loop34;
				}
			}

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

				switch (alt35) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:100:40: WS
					{
					WS82=(Token)match(input,WS,FOLLOW_WS_in_foreach_923);  
					stream_WS.add(WS82);

					}
					break;

				default :
					break loop35;
				}
			}

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

					}
					break;

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
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:100:67: ^( FOREACH ^( IN Variable expression ) do_ END )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOREACH, "FOREACH"), root_1);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:100:77: ^( IN Variable expression )
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:103:1: vars : Variable ( ',' ( WS )* vars )? -> Variable ( vars )* ;
	public final while_astParser.vars_return vars() throws RecognitionException {
		while_astParser.vars_return retval = new while_astParser.vars_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Variable86=null;
		Token char_literal87=null;
		Token WS88=null;
		ParserRuleReturnScope vars89 =null;

		Object Variable86_tree=null;
		Object char_literal87_tree=null;
		Object WS88_tree=null;
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:104:5: ( Variable ( ',' ( WS )* vars )? -> Variable ( vars )* )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:104:7: Variable ( ',' ( WS )* vars )?
			{
			Variable86=(Token)match(input,Variable,FOLLOW_Variable_in_vars967);  
			stream_Variable.add(Variable86);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:104:16: ( ',' ( WS )* vars )?
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==36) ) {
				alt38=1;
			}
			switch (alt38) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:104:17: ',' ( WS )* vars
					{
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
			// 104:31: -> Variable ( vars )*
			{
				adaptor.addChild(root_0, stream_Variable.nextNode());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:104:43: ( vars )*
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:107:1: exprs : expression ( ',' ( WS )* exprs )? -> expression ( exprs )* ;
	public final while_astParser.exprs_return exprs() throws RecognitionException {
		while_astParser.exprs_return retval = new while_astParser.exprs_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal91=null;
		Token WS92=null;
		ParserRuleReturnScope expression90 =null;
		ParserRuleReturnScope exprs93 =null;

		Object char_literal91_tree=null;
		Object WS92_tree=null;
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:108:5: ( expression ( ',' ( WS )* exprs )? -> expression ( exprs )* )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:108:7: expression ( ',' ( WS )* exprs )?
			{
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
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:108:19: ',' ( WS )* exprs
					{
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
			// 108:34: -> expression ( exprs )*
			{
				adaptor.addChild(root_0, stream_expression.nextTree());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:108:48: ( exprs )*
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:111:1: exprBase : ( nil_ | variable | cons | list | hd | tl | symbolExpr );
	public final while_astParser.exprBase_return exprBase() throws RecognitionException {
		while_astParser.exprBase_return retval = new while_astParser.exprBase_return();
		retval.start = input.LT(1);

		Object root_0 = null;

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
		RewriteRuleTokenStream stream_Symbol=new RewriteRuleTokenStream(adaptor,"token Symbol");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_lExpr=new RewriteRuleSubtreeStream(adaptor,"rule lExpr");

		try {
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

					}
					break;

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
					}
					break;

			}

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

			retval.stop = input.LT(-1);

			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:133:1: expression : lExpr ( WS )* ( '=?' ( WS )* lExpr )? -> ^( EXPR lExpr ( lExpr )? ) ;
	public final while_astParser.expression_return expression() throws RecognitionException {
		while_astParser.expression_return retval = new while_astParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WS134=null;
		Token string_literal135=null;
		Token WS136=null;
		ParserRuleReturnScope lExpr133 =null;
		ParserRuleReturnScope lExpr137 =null;

		Object WS134_tree=null;
		Object string_literal135_tree=null;
		Object WS136_tree=null;
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleSubtreeStream stream_lExpr=new RewriteRuleSubtreeStream(adaptor,"rule lExpr");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:134:5: ( lExpr ( WS )* ( '=?' ( WS )* lExpr )? -> ^( EXPR lExpr ( lExpr )? ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:134:7: lExpr ( WS )* ( '=?' ( WS )* lExpr )?
			{
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
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:134:13: WS
					{
					WS134=(Token)match(input,WS,FOLLOW_WS_in_expression1260);  
					stream_WS.add(WS134);

					}
					break;

				default :
					break loop53;
				}
			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:134:16: ( '=?' ( WS )* lExpr )?
			int alt55=2;
			int LA55_0 = input.LA(1);
			if ( (LA55_0==40) ) {
				alt55=1;
			}
			switch (alt55) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:134:17: '=?' ( WS )* lExpr
					{
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
						case 1 :
							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:134:22: WS
							{
							WS136=(Token)match(input,WS,FOLLOW_WS_in_expression1265);  
							stream_WS.add(WS136);

							}
							break;

						default :
							break loop54;
						}
					}

					pushFollow(FOLLOW_lExpr_in_expression1268);
					lExpr137=lExpr();
					state._fsp--;

					stream_lExpr.add(lExpr137.getTree());
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
			// 134:34: -> ^( EXPR lExpr ( lExpr )? )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:134:37: ^( EXPR lExpr ( lExpr )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR, "EXPR"), root_1);
				adaptor.addChild(root_1, stream_lExpr.nextTree());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:134:50: ( lExpr )?
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:138:1: lExpr : exprBase ( WS )* ( lExpr )? -> exprBase ( lExpr )? ;
	public final while_astParser.lExpr_return lExpr() throws RecognitionException {
		while_astParser.lExpr_return retval = new while_astParser.lExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WS139=null;
		ParserRuleReturnScope exprBase138 =null;
		ParserRuleReturnScope lExpr140 =null;

		Object WS139_tree=null;
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");
		RewriteRuleSubtreeStream stream_lExpr=new RewriteRuleSubtreeStream(adaptor,"rule lExpr");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:139:5: ( exprBase ( WS )* ( lExpr )? -> exprBase ( lExpr )? )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:139:7: exprBase ( WS )* ( lExpr )?
			{
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
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:139:16: WS
					{
					WS139=(Token)match(input,WS,FOLLOW_WS_in_lExpr1304);  
					stream_WS.add(WS139);

					}
					break;

				default :
					break loop56;
				}
			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:139:20: ( lExpr )?
			int alt57=2;
			int LA57_0 = input.LA(1);
			if ( (LA57_0==Variable||LA57_0==34||LA57_0==52) ) {
				alt57=1;
			}
			switch (alt57) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:139:20: lExpr
					{
					pushFollow(FOLLOW_lExpr_in_lExpr1307);
					lExpr140=lExpr();
					state._fsp--;

					stream_lExpr.add(lExpr140.getTree());
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
			// 139:27: -> exprBase ( lExpr )?
			{
				adaptor.addChild(root_0, stream_exprBase.nextTree());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:139:39: ( lExpr )?
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
	public static final BitSet FOLLOW_else__in_if_707 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_44_in_if_709 = new BitSet(new long[]{0x0000000100000002L});
	public static final BitSet FOLLOW_WS_in_if_711 = new BitSet(new long[]{0x0000000100000002L});
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
}

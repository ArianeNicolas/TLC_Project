// $ANTLR 3.5.1 C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g 2023-11-28 10:29:00

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class while_astParser extends Parser {
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:33:1: startProgram : program -> ^( START program ) ;
	public final while_astParser.startProgram_return startProgram() throws RecognitionException {
		while_astParser.startProgram_return retval = new while_astParser.startProgram_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope program1 =null;

		RewriteRuleSubtreeStream stream_program=new RewriteRuleSubtreeStream(adaptor,"rule program");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:34:5: ( program -> ^( START program ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:34:7: program
			{
			pushFollow(FOLLOW_program_in_startProgram194);
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
			// 34:15: -> ^( START program )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:34:18: ^( START program )
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:45:1: program : function ( program )? -> ^( PROGRAM function ( program )? ) ;
	public final while_astParser.program_return program() throws RecognitionException {
		while_astParser.program_return retval = new while_astParser.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope function2 =null;
		ParserRuleReturnScope program3 =null;

		RewriteRuleSubtreeStream stream_function=new RewriteRuleSubtreeStream(adaptor,"rule function");
		RewriteRuleSubtreeStream stream_program=new RewriteRuleSubtreeStream(adaptor,"rule program");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:46:5: ( function ( program )? -> ^( PROGRAM function ( program )? ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:46:7: function ( program )?
			{
			pushFollow(FOLLOW_function_in_program344);
			function2=function();
			state._fsp--;

			stream_function.add(function2.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:46:16: ( program )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==46) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:46:16: program
					{
					pushFollow(FOLLOW_program_in_program346);
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
			// 46:25: -> ^( PROGRAM function ( program )? )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:46:28: ^( PROGRAM function ( program )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROGRAM, "PROGRAM"), root_1);
				adaptor.addChild(root_1, stream_function.nextTree());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:46:47: ( program )?
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:49:1: function : 'function ' Symbol ( WS )* ':' ( WS )* definition -> ^( FUNCDEF Symbol definition ) ;
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
		RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
		RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
		RewriteRuleTokenStream stream_Symbol=new RewriteRuleTokenStream(adaptor,"token Symbol");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_definition=new RewriteRuleSubtreeStream(adaptor,"rule definition");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:50:5: ( 'function ' Symbol ( WS )* ':' ( WS )* definition -> ^( FUNCDEF Symbol definition ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:50:7: 'function ' Symbol ( WS )* ':' ( WS )* definition
			{
			string_literal4=(Token)match(input,46,FOLLOW_46_in_function375);  
			stream_46.add(string_literal4);

			Symbol5=(Token)match(input,Symbol,FOLLOW_Symbol_in_function377);  
			stream_Symbol.add(Symbol5);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:50:26: ( WS )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==WS) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:50:26: WS
					{
					WS6=(Token)match(input,WS,FOLLOW_WS_in_function379);  
					stream_WS.add(WS6);

					}
					break;

				default :
					break loop2;
				}
			}

			char_literal7=(Token)match(input,36,FOLLOW_36_in_function382);  
			stream_36.add(char_literal7);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:50:34: ( WS )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==WS) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:50:34: WS
					{
					WS8=(Token)match(input,WS,FOLLOW_WS_in_function384);  
					stream_WS.add(WS8);

					}
					break;

				default :
					break loop3;
				}
			}

			pushFollow(FOLLOW_definition_in_function387);
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
			// 50:49: -> ^( FUNCDEF Symbol definition )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:50:52: ^( FUNCDEF Symbol definition )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNCDEF, "FUNCDEF"), root_1);
				adaptor.addChild(root_1, stream_Symbol.nextNode());
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
		RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
		RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
		RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");
		RewriteRuleSubtreeStream stream_input=new RewriteRuleSubtreeStream(adaptor,"rule input");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:54:5: ( 'read' ( WS )* input '%' ( WS )* commands ( WS )* '%' ( WS )* 'write ' output -> ^( FUNCTION input commands output ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:54:7: 'read' ( WS )* input '%' ( WS )* commands ( WS )* '%' ( WS )* 'write ' output
			{
			string_literal10=(Token)match(input,54,FOLLOW_54_in_definition414);  
			stream_54.add(string_literal10);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:54:14: ( WS )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==WS) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:54:14: WS
					{
					WS11=(Token)match(input,WS,FOLLOW_WS_in_definition416);  
					stream_WS.add(WS11);

					}
					break;

				default :
					break loop4;
				}
			}

			pushFollow(FOLLOW_input_in_definition419);
			input12=input();
			state._fsp--;

			stream_input.add(input12.getTree());
			char_literal13=(Token)match(input,32,FOLLOW_32_in_definition421);  
			stream_32.add(char_literal13);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:54:28: ( WS )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==WS) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:54:28: WS
					{
					WS14=(Token)match(input,WS,FOLLOW_WS_in_definition423);  
					stream_WS.add(WS14);

					}
					break;

				default :
					break loop5;
				}
			}

			pushFollow(FOLLOW_commands_in_definition426);
			commands15=commands();
			state._fsp--;

			stream_commands.add(commands15.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:54:41: ( WS )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==WS) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:54:41: WS
					{
					WS16=(Token)match(input,WS,FOLLOW_WS_in_definition428);  
					stream_WS.add(WS16);

					}
					break;

				default :
					break loop6;
				}
			}

			char_literal17=(Token)match(input,32,FOLLOW_32_in_definition430);  
			stream_32.add(char_literal17);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:54:48: ( WS )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==WS) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:54:48: WS
					{
					WS18=(Token)match(input,WS,FOLLOW_WS_in_definition432);  
					stream_WS.add(WS18);

					}
					break;

				default :
					break loop7;
				}
			}

			string_literal19=(Token)match(input,58,FOLLOW_58_in_definition435);  
			stream_58.add(string_literal19);

			pushFollow(FOLLOW_output_in_definition437);
			output20=output();
			state._fsp--;

			stream_output.add(output20.getTree());
			// AST REWRITE
			// elements: commands, input, output
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
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:54:71: ^( FUNCTION input commands output )
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:57:1: input : ( inputSub )? -> ^( INPUTS ( inputSub )? ) ;
	public final while_astParser.input_return input() throws RecognitionException {
		while_astParser.input_return retval = new while_astParser.input_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope inputSub21 =null;

		RewriteRuleSubtreeStream stream_inputSub=new RewriteRuleSubtreeStream(adaptor,"rule inputSub");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:58:5: ( ( inputSub )? -> ^( INPUTS ( inputSub )? ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:58:7: ( inputSub )?
			{
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:58:7: ( inputSub )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==Variable) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:58:7: inputSub
					{
					pushFollow(FOLLOW_inputSub_in_input466);
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
			// 58:17: -> ^( INPUTS ( inputSub )? )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:58:21: ^( INPUTS ( inputSub )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INPUTS, "INPUTS"), root_1);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:58:30: ( inputSub )?
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:61:1: inputSub : Variable ( WS )* ( ',' ( WS )* inputSub )? -> Variable ( inputSub )? ;
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
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_inputSub=new RewriteRuleSubtreeStream(adaptor,"rule inputSub");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:62:5: ( Variable ( WS )* ( ',' ( WS )* inputSub )? -> Variable ( inputSub )? )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:62:7: Variable ( WS )* ( ',' ( WS )* inputSub )?
			{
			Variable22=(Token)match(input,Variable,FOLLOW_Variable_in_inputSub494);  
			stream_Variable.add(Variable22);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:62:16: ( WS )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==WS) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:62:16: WS
					{
					WS23=(Token)match(input,WS,FOLLOW_WS_in_inputSub496);  
					stream_WS.add(WS23);

					}
					break;

				default :
					break loop9;
				}
			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:62:20: ( ',' ( WS )* inputSub )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==35) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:62:21: ',' ( WS )* inputSub
					{
					char_literal24=(Token)match(input,35,FOLLOW_35_in_inputSub500);  
					stream_35.add(char_literal24);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:62:25: ( WS )*
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==WS) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:62:25: WS
							{
							WS25=(Token)match(input,WS,FOLLOW_WS_in_inputSub502);  
							stream_WS.add(WS25);

							}
							break;

						default :
							break loop10;
						}
					}

					pushFollow(FOLLOW_inputSub_in_inputSub505);
					inputSub26=inputSub();
					state._fsp--;

					stream_inputSub.add(inputSub26.getTree());
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
			// 62:40: -> Variable ( inputSub )?
			{
				adaptor.addChild(root_0, stream_Variable.nextNode());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:62:52: ( inputSub )?
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:65:1: output : Variable ( ',' output )? -> ^( OUTPUT Variable ( output )? ) ;
	public final while_astParser.output_return output() throws RecognitionException {
		while_astParser.output_return retval = new while_astParser.output_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Variable27=null;
		Token char_literal28=null;
		ParserRuleReturnScope output29 =null;

		Object Variable27_tree=null;
		Object char_literal28_tree=null;
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleSubtreeStream stream_output=new RewriteRuleSubtreeStream(adaptor,"rule output");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:66:5: ( Variable ( ',' output )? -> ^( OUTPUT Variable ( output )? ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:66:7: Variable ( ',' output )?
			{
			Variable27=(Token)match(input,Variable,FOLLOW_Variable_in_output531);  
			stream_Variable.add(Variable27);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:66:16: ( ',' output )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==35) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:66:17: ',' output
					{
					char_literal28=(Token)match(input,35,FOLLOW_35_in_output534);  
					stream_35.add(char_literal28);

					pushFollow(FOLLOW_output_in_output536);
					output29=output();
					state._fsp--;

					stream_output.add(output29.getTree());
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
			// 66:30: -> ^( OUTPUT Variable ( output )? )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:66:33: ^( OUTPUT Variable ( output )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OUTPUT, "OUTPUT"), root_1);
				adaptor.addChild(root_1, stream_Variable.nextNode());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:66:51: ( output )?
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:69:1: commands : command ( ( WS )* ';' ( WS )* commands )? -> command ( commands )? ;
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
		RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_command=new RewriteRuleSubtreeStream(adaptor,"rule command");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:70:5: ( command ( ( WS )* ';' ( WS )* commands )? -> command ( commands )? )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:70:7: command ( ( WS )* ';' ( WS )* commands )?
			{
			pushFollow(FOLLOW_command_in_commands566);
			command30=command();
			state._fsp--;

			stream_command.add(command30.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:70:15: ( ( WS )* ';' ( WS )* commands )?
			int alt15=2;
			alt15 = dfa15.predict(input);
			switch (alt15) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:70:17: ( WS )* ';' ( WS )* commands
					{
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:70:17: ( WS )*
					loop13:
					while (true) {
						int alt13=2;
						int LA13_0 = input.LA(1);
						if ( (LA13_0==WS) ) {
							alt13=1;
						}

						switch (alt13) {
						case 1 :
							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:70:17: WS
							{
							WS31=(Token)match(input,WS,FOLLOW_WS_in_commands570);  
							stream_WS.add(WS31);

							}
							break;

						default :
							break loop13;
						}
					}

					char_literal32=(Token)match(input,38,FOLLOW_38_in_commands573);  
					stream_38.add(char_literal32);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:70:25: ( WS )*
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0==WS) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:70:25: WS
							{
							WS33=(Token)match(input,WS,FOLLOW_WS_in_commands575);  
							stream_WS.add(WS33);

							}
							break;

						default :
							break loop14;
						}
					}

					pushFollow(FOLLOW_commands_in_commands578);
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
			// 70:40: -> command ( commands )?
			{
				adaptor.addChild(root_0, stream_command.nextTree());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:70:51: ( commands )?
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:73:1: command : ( 'nop' | decl | if_ | for_ | while_ | foreach_ );
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
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:74:5: ( 'nop' | decl | if_ | for_ | while_ | foreach_ )
			int alt16=6;
			switch ( input.LA(1) ) {
			case 52:
				{
				alt16=1;
				}
				break;
			case Variable:
				{
				alt16=2;
				}
				break;
			case 48:
				{
				alt16=3;
				}
				break;
			case 44:
				{
				alt16=4;
				}
				break;
			case 57:
				{
				alt16=5;
				}
				break;
			case 45:
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
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:74:7: 'nop'
					{
					root_0 = (Object)adaptor.nil();


					string_literal35=(Token)match(input,52,FOLLOW_52_in_command605); 
					string_literal35_tree = (Object)adaptor.create(string_literal35);
					adaptor.addChild(root_0, string_literal35_tree);

					}
					break;
				case 2 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:74:15: decl
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_decl_in_command609);
					decl36=decl();
					state._fsp--;

					adaptor.addChild(root_0, decl36.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:74:22: if_
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_if__in_command613);
					if_37=if_();
					state._fsp--;

					adaptor.addChild(root_0, if_37.getTree());

					}
					break;
				case 4 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:74:28: for_
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_for__in_command617);
					for_38=for_();
					state._fsp--;

					adaptor.addChild(root_0, for_38.getTree());

					}
					break;
				case 5 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:74:35: while_
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_while__in_command621);
					while_39=while_();
					state._fsp--;

					adaptor.addChild(root_0, while_39.getTree());

					}
					break;
				case 6 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:74:44: foreach_
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_foreach__in_command625);
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:76:1: decl : ( vars ( WS )* ':=' ( WS )* exprs ) -> ^( VARDEF vars exprs ) ;
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
		RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");
		RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:77:5: ( ( vars ( WS )* ':=' ( WS )* exprs ) -> ^( VARDEF vars exprs ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:77:7: ( vars ( WS )* ':=' ( WS )* exprs )
			{
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:77:7: ( vars ( WS )* ':=' ( WS )* exprs )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:77:8: vars ( WS )* ':=' ( WS )* exprs
			{
			pushFollow(FOLLOW_vars_in_decl639);
			vars41=vars();
			state._fsp--;

			stream_vars.add(vars41.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:77:13: ( WS )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==WS) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:77:13: WS
					{
					WS42=(Token)match(input,WS,FOLLOW_WS_in_decl641);  
					stream_WS.add(WS42);

					}
					break;

				default :
					break loop17;
				}
			}

			string_literal43=(Token)match(input,37,FOLLOW_37_in_decl644);  
			stream_37.add(string_literal43);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:77:22: ( WS )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==WS) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:77:22: WS
					{
					WS44=(Token)match(input,WS,FOLLOW_WS_in_decl646);  
					stream_WS.add(WS44);

					}
					break;

				default :
					break loop18;
				}
			}

			pushFollow(FOLLOW_exprs_in_decl649);
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
			// 77:33: -> ^( VARDEF vars exprs )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:77:36: ^( VARDEF vars exprs )
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:80:1: if_ : ( 'if' ( WS )* expression ( WS )* then_ ( WS )* else_ 'fi' ) -> ^( IF expression then_ ( else_ )? ) ;
	public final while_astParser.if__return if_() throws RecognitionException {
		while_astParser.if__return retval = new while_astParser.if__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal46=null;
		Token WS47=null;
		Token WS49=null;
		Token WS51=null;
		Token string_literal53=null;
		ParserRuleReturnScope expression48 =null;
		ParserRuleReturnScope then_50 =null;
		ParserRuleReturnScope else_52 =null;

		Object string_literal46_tree=null;
		Object WS47_tree=null;
		Object WS49_tree=null;
		Object WS51_tree=null;
		Object string_literal53_tree=null;
		RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
		RewriteRuleSubtreeStream stream_then_=new RewriteRuleSubtreeStream(adaptor,"rule then_");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_else_=new RewriteRuleSubtreeStream(adaptor,"rule else_");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:81:5: ( ( 'if' ( WS )* expression ( WS )* then_ ( WS )* else_ 'fi' ) -> ^( IF expression then_ ( else_ )? ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:81:7: ( 'if' ( WS )* expression ( WS )* then_ ( WS )* else_ 'fi' )
			{
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:81:7: ( 'if' ( WS )* expression ( WS )* then_ ( WS )* else_ 'fi' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:81:8: 'if' ( WS )* expression ( WS )* then_ ( WS )* else_ 'fi'
			{
			string_literal46=(Token)match(input,48,FOLLOW_48_in_if_678);  
			stream_48.add(string_literal46);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:81:13: ( WS )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==WS) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:81:13: WS
					{
					WS47=(Token)match(input,WS,FOLLOW_WS_in_if_680);  
					stream_WS.add(WS47);

					}
					break;

				default :
					break loop19;
				}
			}

			pushFollow(FOLLOW_expression_in_if_683);
			expression48=expression();
			state._fsp--;

			stream_expression.add(expression48.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:81:28: ( WS )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==WS) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:81:28: WS
					{
					WS49=(Token)match(input,WS,FOLLOW_WS_in_if_685);  
					stream_WS.add(WS49);

					}
					break;

				default :
					break loop20;
				}
			}

			pushFollow(FOLLOW_then__in_if_688);
			then_50=then_();
			state._fsp--;

			stream_then_.add(then_50.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:81:39: ( WS )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==WS) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:81:39: WS
					{
					WS51=(Token)match(input,WS,FOLLOW_WS_in_if_691);  
					stream_WS.add(WS51);

					}
					break;

				default :
					break loop21;
				}
			}

			pushFollow(FOLLOW_else__in_if_694);
			else_52=else_();
			state._fsp--;

			stream_else_.add(else_52.getTree());
			string_literal53=(Token)match(input,43,FOLLOW_43_in_if_696);  
			stream_43.add(string_literal53);

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
			// 81:55: -> ^( IF expression then_ ( else_ )? )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:81:58: ^( IF expression then_ ( else_ )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_1, stream_then_.nextTree());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:81:80: ( else_ )?
				if ( stream_else_.hasNext() ) {
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

		Token string_literal54=null;
		Token WS55=null;
		Token WS57=null;
		ParserRuleReturnScope commands56 =null;

		Object string_literal54_tree=null;
		Object WS55_tree=null;
		Object WS57_tree=null;
		RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:84:7: ( 'then' ( WS )* commands ( WS )* -> ^( THEN commands ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:84:9: 'then' ( WS )* commands ( WS )*
			{
			string_literal54=(Token)match(input,55,FOLLOW_55_in_then_727);  
			stream_55.add(string_literal54);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:84:16: ( WS )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==WS) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:84:16: WS
					{
					WS55=(Token)match(input,WS,FOLLOW_WS_in_then_729);  
					stream_WS.add(WS55);

					}
					break;

				default :
					break loop22;
				}
			}

			pushFollow(FOLLOW_commands_in_then_732);
			commands56=commands();
			state._fsp--;

			stream_commands.add(commands56.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:84:29: ( WS )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==WS) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:84:29: WS
					{
					WS57=(Token)match(input,WS,FOLLOW_WS_in_then_734);  
					stream_WS.add(WS57);

					}
					break;

				default :
					break loop23;
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
			// 84:33: -> ^( THEN commands )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:84:36: ^( THEN commands )
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:86:1: else_ : ( 'else' ( WS )* commands )? -> ^( ELSE commands ) ;
	public final while_astParser.else__return else_() throws RecognitionException {
		while_astParser.else__return retval = new while_astParser.else__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal58=null;
		Token WS59=null;
		ParserRuleReturnScope commands60 =null;

		Object string_literal58_tree=null;
		Object WS59_tree=null;
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:86:7: ( ( 'else' ( WS )* commands )? -> ^( ELSE commands ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:86:9: ( 'else' ( WS )* commands )?
			{
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:86:9: ( 'else' ( WS )* commands )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==42) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:86:10: 'else' ( WS )* commands
					{
					string_literal58=(Token)match(input,42,FOLLOW_42_in_else_752);  
					stream_42.add(string_literal58);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:86:17: ( WS )*
					loop24:
					while (true) {
						int alt24=2;
						int LA24_0 = input.LA(1);
						if ( (LA24_0==WS) ) {
							alt24=1;
						}

						switch (alt24) {
						case 1 :
							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:86:17: WS
							{
							WS59=(Token)match(input,WS,FOLLOW_WS_in_else_754);  
							stream_WS.add(WS59);

							}
							break;

						default :
							break loop24;
						}
					}

					pushFollow(FOLLOW_commands_in_else_757);
					commands60=commands();
					state._fsp--;

					stream_commands.add(commands60.getTree());
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
			// 86:32: -> ^( ELSE commands )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:86:35: ^( ELSE commands )
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:88:1: while_ : ( 'while' ( WS )* expression ( WS )* do_ ) -> ^( WHILE expression do_ ) ;
	public final while_astParser.while__return while_() throws RecognitionException {
		while_astParser.while__return retval = new while_astParser.while__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal61=null;
		Token WS62=null;
		Token WS64=null;
		ParserRuleReturnScope expression63 =null;
		ParserRuleReturnScope do_65 =null;

		Object string_literal61_tree=null;
		Object WS62_tree=null;
		Object WS64_tree=null;
		RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_do_=new RewriteRuleSubtreeStream(adaptor,"rule do_");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:89:5: ( ( 'while' ( WS )* expression ( WS )* do_ ) -> ^( WHILE expression do_ ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:89:7: ( 'while' ( WS )* expression ( WS )* do_ )
			{
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:89:7: ( 'while' ( WS )* expression ( WS )* do_ )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:89:8: 'while' ( WS )* expression ( WS )* do_
			{
			string_literal61=(Token)match(input,57,FOLLOW_57_in_while_780);  
			stream_57.add(string_literal61);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:89:16: ( WS )*
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==WS) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:89:16: WS
					{
					WS62=(Token)match(input,WS,FOLLOW_WS_in_while_782);  
					stream_WS.add(WS62);

					}
					break;

				default :
					break loop26;
				}
			}

			pushFollow(FOLLOW_expression_in_while_785);
			expression63=expression();
			state._fsp--;

			stream_expression.add(expression63.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:89:31: ( WS )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==WS) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:89:31: WS
					{
					WS64=(Token)match(input,WS,FOLLOW_WS_in_while_787);  
					stream_WS.add(WS64);

					}
					break;

				default :
					break loop27;
				}
			}

			pushFollow(FOLLOW_do__in_while_790);
			do_65=do_();
			state._fsp--;

			stream_do_.add(do_65.getTree());
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
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:89:43: ^( WHILE expression do_ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WHILE, "WHILE"), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
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

		Token string_literal66=null;
		Token WS67=null;
		Token WS69=null;
		Token string_literal70=null;
		ParserRuleReturnScope commands68 =null;

		Object string_literal66_tree=null;
		Object WS67_tree=null;
		Object WS69_tree=null;
		Object string_literal70_tree=null;
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
		RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
		RewriteRuleSubtreeStream stream_commands=new RewriteRuleSubtreeStream(adaptor,"rule commands");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:92:6: ( 'do' ( WS )* commands ( WS )* 'od' -> ^( DO commands ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:92:8: 'do' ( WS )* commands ( WS )* 'od'
			{
			string_literal66=(Token)match(input,41,FOLLOW_41_in_do_819);  
			stream_41.add(string_literal66);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:92:13: ( WS )*
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( (LA28_0==WS) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:92:13: WS
					{
					WS67=(Token)match(input,WS,FOLLOW_WS_in_do_821);  
					stream_WS.add(WS67);

					}
					break;

				default :
					break loop28;
				}
			}

			pushFollow(FOLLOW_commands_in_do_824);
			commands68=commands();
			state._fsp--;

			stream_commands.add(commands68.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:92:26: ( WS )*
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==WS) ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:92:26: WS
					{
					WS69=(Token)match(input,WS,FOLLOW_WS_in_do_826);  
					stream_WS.add(WS69);

					}
					break;

				default :
					break loop29;
				}
			}

			string_literal70=(Token)match(input,53,FOLLOW_53_in_do_829);  
			stream_53.add(string_literal70);

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
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:92:38: ^( DO commands )
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:94:1: for_ : ( 'for' ( WS )* expression ( WS )* do_ ) -> ^( FOR expression do_ ) ;
	public final while_astParser.for__return for_() throws RecognitionException {
		while_astParser.for__return retval = new while_astParser.for__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal71=null;
		Token WS72=null;
		Token WS74=null;
		ParserRuleReturnScope expression73 =null;
		ParserRuleReturnScope do_75 =null;

		Object string_literal71_tree=null;
		Object WS72_tree=null;
		Object WS74_tree=null;
		RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_do_=new RewriteRuleSubtreeStream(adaptor,"rule do_");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:95:5: ( ( 'for' ( WS )* expression ( WS )* do_ ) -> ^( FOR expression do_ ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:95:7: ( 'for' ( WS )* expression ( WS )* do_ )
			{
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:95:7: ( 'for' ( WS )* expression ( WS )* do_ )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:95:8: 'for' ( WS )* expression ( WS )* do_
			{
			string_literal71=(Token)match(input,44,FOLLOW_44_in_for_850);  
			stream_44.add(string_literal71);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:95:14: ( WS )*
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==WS) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:95:14: WS
					{
					WS72=(Token)match(input,WS,FOLLOW_WS_in_for_852);  
					stream_WS.add(WS72);

					}
					break;

				default :
					break loop30;
				}
			}

			pushFollow(FOLLOW_expression_in_for_855);
			expression73=expression();
			state._fsp--;

			stream_expression.add(expression73.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:95:29: ( WS )*
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==WS) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:95:29: WS
					{
					WS74=(Token)match(input,WS,FOLLOW_WS_in_for_857);  
					stream_WS.add(WS74);

					}
					break;

				default :
					break loop31;
				}
			}

			pushFollow(FOLLOW_do__in_for_860);
			do_75=do_();
			state._fsp--;

			stream_do_.add(do_75.getTree());
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
			// 95:38: -> ^( FOR expression do_ )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:95:41: ^( FOR expression do_ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOR, "FOR"), root_1);
				adaptor.addChild(root_1, stream_expression.nextTree());
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

		Token string_literal76=null;
		Token WS77=null;
		Token Variable78=null;
		Token WS79=null;
		Token string_literal80=null;
		Token WS81=null;
		Token WS83=null;
		ParserRuleReturnScope expression82 =null;
		ParserRuleReturnScope do_84 =null;

		Object string_literal76_tree=null;
		Object WS77_tree=null;
		Object Variable78_tree=null;
		Object WS79_tree=null;
		Object string_literal80_tree=null;
		Object WS81_tree=null;
		Object WS83_tree=null;
		RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_do_=new RewriteRuleSubtreeStream(adaptor,"rule do_");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:5: ( ( 'foreach' ( WS )* Variable ( WS )* 'in' ( WS )* expression ( WS )* do_ ) -> ^( FOREACH ^( IN Variable expression ) do_ ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:7: ( 'foreach' ( WS )* Variable ( WS )* 'in' ( WS )* expression ( WS )* do_ )
			{
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:7: ( 'foreach' ( WS )* Variable ( WS )* 'in' ( WS )* expression ( WS )* do_ )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:8: 'foreach' ( WS )* Variable ( WS )* 'in' ( WS )* expression ( WS )* do_
			{
			string_literal76=(Token)match(input,45,FOLLOW_45_in_foreach_889);  
			stream_45.add(string_literal76);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:18: ( WS )*
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==WS) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:18: WS
					{
					WS77=(Token)match(input,WS,FOLLOW_WS_in_foreach_891);  
					stream_WS.add(WS77);

					}
					break;

				default :
					break loop32;
				}
			}

			Variable78=(Token)match(input,Variable,FOLLOW_Variable_in_foreach_894);  
			stream_Variable.add(Variable78);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:31: ( WS )*
			loop33:
			while (true) {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==WS) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:31: WS
					{
					WS79=(Token)match(input,WS,FOLLOW_WS_in_foreach_896);  
					stream_WS.add(WS79);

					}
					break;

				default :
					break loop33;
				}
			}

			string_literal80=(Token)match(input,49,FOLLOW_49_in_foreach_899);  
			stream_49.add(string_literal80);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:40: ( WS )*
			loop34:
			while (true) {
				int alt34=2;
				int LA34_0 = input.LA(1);
				if ( (LA34_0==WS) ) {
					alt34=1;
				}

				switch (alt34) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:40: WS
					{
					WS81=(Token)match(input,WS,FOLLOW_WS_in_foreach_901);  
					stream_WS.add(WS81);

					}
					break;

				default :
					break loop34;
				}
			}

			pushFollow(FOLLOW_expression_in_foreach_904);
			expression82=expression();
			state._fsp--;

			stream_expression.add(expression82.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:55: ( WS )*
			loop35:
			while (true) {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==WS) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:55: WS
					{
					WS83=(Token)match(input,WS,FOLLOW_WS_in_foreach_906);  
					stream_WS.add(WS83);

					}
					break;

				default :
					break loop35;
				}
			}

			pushFollow(FOLLOW_do__in_foreach_909);
			do_84=do_();
			state._fsp--;

			stream_do_.add(do_84.getTree());
			}

			// AST REWRITE
			// elements: Variable, do_, expression
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
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:67: ^( FOREACH ^( IN Variable expression ) do_ )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FOREACH, "FOREACH"), root_1);
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:99:77: ^( IN Variable expression )
				{
				Object root_2 = (Object)adaptor.nil();
				root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(IN, "IN"), root_2);
				adaptor.addChild(root_2, stream_Variable.nextNode());
				adaptor.addChild(root_2, stream_expression.nextTree());
				adaptor.addChild(root_1, root_2);
				}

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

		Token Variable85=null;
		Token char_literal86=null;
		ParserRuleReturnScope vars87 =null;

		Object Variable85_tree=null;
		Object char_literal86_tree=null;
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");
		RewriteRuleSubtreeStream stream_vars=new RewriteRuleSubtreeStream(adaptor,"rule vars");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:103:5: ( Variable ( ',' vars )? -> ^( VARIABLES Variable ( vars )* ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:103:7: Variable ( ',' vars )?
			{
			Variable85=(Token)match(input,Variable,FOLLOW_Variable_in_vars943);  
			stream_Variable.add(Variable85);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:103:16: ( ',' vars )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==35) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:103:17: ',' vars
					{
					char_literal86=(Token)match(input,35,FOLLOW_35_in_vars946);  
					stream_35.add(char_literal86);

					pushFollow(FOLLOW_vars_in_vars948);
					vars87=vars();
					state._fsp--;

					stream_vars.add(vars87.getTree());
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
			// 103:28: -> ^( VARIABLES Variable ( vars )* )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:103:31: ^( VARIABLES Variable ( vars )* )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARIABLES, "VARIABLES"), root_1);
				adaptor.addChild(root_1, stream_Variable.nextNode());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:103:52: ( vars )*
				while ( stream_vars.hasNext() ) {
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

		Token char_literal89=null;
		ParserRuleReturnScope expression88 =null;
		ParserRuleReturnScope exprs90 =null;

		Object char_literal89_tree=null;
		RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_exprs=new RewriteRuleSubtreeStream(adaptor,"rule exprs");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:107:5: ( expression ( ',' exprs )? -> expression ( exprs )* )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:107:7: expression ( ',' exprs )?
			{
			pushFollow(FOLLOW_expression_in_exprs978);
			expression88=expression();
			state._fsp--;

			stream_expression.add(expression88.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:107:18: ( ',' exprs )?
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==35) ) {
				alt37=1;
			}
			switch (alt37) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:107:19: ',' exprs
					{
					char_literal89=(Token)match(input,35,FOLLOW_35_in_exprs981);  
					stream_35.add(char_literal89);

					pushFollow(FOLLOW_exprs_in_exprs983);
					exprs90=exprs();
					state._fsp--;

					stream_exprs.add(exprs90.getTree());
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
			// 107:31: -> expression ( exprs )*
			{
				adaptor.addChild(root_0, stream_expression.nextTree());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:107:45: ( exprs )*
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:110:1: exprBase : ( nil_ | variable | cons | list | hd | tl | symbolExpr );
	public final while_astParser.exprBase_return exprBase() throws RecognitionException {
		while_astParser.exprBase_return retval = new while_astParser.exprBase_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope nil_91 =null;
		ParserRuleReturnScope variable92 =null;
		ParserRuleReturnScope cons93 =null;
		ParserRuleReturnScope list94 =null;
		ParserRuleReturnScope hd95 =null;
		ParserRuleReturnScope tl96 =null;
		ParserRuleReturnScope symbolExpr97 =null;


		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:110:12: ( nil_ | variable | cons | list | hd | tl | symbolExpr )
			int alt38=7;
			alt38 = dfa38.predict(input);
			switch (alt38) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:110:15: nil_
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_nil__in_exprBase1008);
					nil_91=nil_();
					state._fsp--;

					adaptor.addChild(root_0, nil_91.getTree());

					}
					break;
				case 2 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:111:7: variable
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_variable_in_exprBase1016);
					variable92=variable();
					state._fsp--;

					adaptor.addChild(root_0, variable92.getTree());

					}
					break;
				case 3 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:112:7: cons
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_cons_in_exprBase1024);
					cons93=cons();
					state._fsp--;

					adaptor.addChild(root_0, cons93.getTree());

					}
					break;
				case 4 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:112:14: list
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_list_in_exprBase1028);
					list94=list();
					state._fsp--;

					adaptor.addChild(root_0, list94.getTree());

					}
					break;
				case 5 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:113:7: hd
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_hd_in_exprBase1036);
					hd95=hd();
					state._fsp--;

					adaptor.addChild(root_0, hd95.getTree());

					}
					break;
				case 6 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:113:12: tl
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_tl_in_exprBase1040);
					tl96=tl();
					state._fsp--;

					adaptor.addChild(root_0, tl96.getTree());

					}
					break;
				case 7 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:114:7: symbolExpr
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_symbolExpr_in_exprBase1048);
					symbolExpr97=symbolExpr();
					state._fsp--;

					adaptor.addChild(root_0, symbolExpr97.getTree());

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:117:1: nil_ : ( 'nil' ( WS )* ) -> 'nil' ;
	public final while_astParser.nil__return nil_() throws RecognitionException {
		while_astParser.nil__return retval = new while_astParser.nil__return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal98=null;
		Token WS99=null;

		Object string_literal98_tree=null;
		Object WS99_tree=null;
		RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:117:6: ( ( 'nil' ( WS )* ) -> 'nil' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:117:8: ( 'nil' ( WS )* )
			{
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:117:8: ( 'nil' ( WS )* )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:117:9: 'nil' ( WS )*
			{
			string_literal98=(Token)match(input,51,FOLLOW_51_in_nil_1067);  
			stream_51.add(string_literal98);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:117:14: ( WS )*
			loop39:
			while (true) {
				int alt39=2;
				int LA39_0 = input.LA(1);
				if ( (LA39_0==WS) ) {
					alt39=1;
				}

				switch (alt39) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:117:14: WS
					{
					WS99=(Token)match(input,WS,FOLLOW_WS_in_nil_1068);  
					stream_WS.add(WS99);

					}
					break;

				default :
					break loop39;
				}
			}

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

		Token Variable100=null;

		Object Variable100_tree=null;
		RewriteRuleTokenStream stream_Variable=new RewriteRuleTokenStream(adaptor,"token Variable");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:119:9: ( Variable -> Variable )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:119:11: Variable
			{
			Variable100=(Token)match(input,Variable,FOLLOW_Variable_in_variable1085);  
			stream_Variable.add(Variable100);

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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:121:1: cons : '(' ( WS )* 'cons ' lExpr ( WS )* ')' -> ^( CONS lExpr ) ;
	public final while_astParser.cons_return cons() throws RecognitionException {
		while_astParser.cons_return retval = new while_astParser.cons_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal101=null;
		Token WS102=null;
		Token string_literal103=null;
		Token WS105=null;
		Token char_literal106=null;
		ParserRuleReturnScope lExpr104 =null;

		Object char_literal101_tree=null;
		Object WS102_tree=null;
		Object string_literal103_tree=null;
		Object WS105_tree=null;
		Object char_literal106_tree=null;
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
		RewriteRuleSubtreeStream stream_lExpr=new RewriteRuleSubtreeStream(adaptor,"rule lExpr");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:121:6: ( '(' ( WS )* 'cons ' lExpr ( WS )* ')' -> ^( CONS lExpr ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:121:8: '(' ( WS )* 'cons ' lExpr ( WS )* ')'
			{
			char_literal101=(Token)match(input,33,FOLLOW_33_in_cons1097);  
			stream_33.add(char_literal101);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:121:12: ( WS )*
			loop40:
			while (true) {
				int alt40=2;
				int LA40_0 = input.LA(1);
				if ( (LA40_0==WS) ) {
					alt40=1;
				}

				switch (alt40) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:121:12: WS
					{
					WS102=(Token)match(input,WS,FOLLOW_WS_in_cons1099);  
					stream_WS.add(WS102);

					}
					break;

				default :
					break loop40;
				}
			}

			string_literal103=(Token)match(input,40,FOLLOW_40_in_cons1102);  
			stream_40.add(string_literal103);

			pushFollow(FOLLOW_lExpr_in_cons1104);
			lExpr104=lExpr();
			state._fsp--;

			stream_lExpr.add(lExpr104.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:121:30: ( WS )*
			loop41:
			while (true) {
				int alt41=2;
				int LA41_0 = input.LA(1);
				if ( (LA41_0==WS) ) {
					alt41=1;
				}

				switch (alt41) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:121:30: WS
					{
					WS105=(Token)match(input,WS,FOLLOW_WS_in_cons1106);  
					stream_WS.add(WS105);

					}
					break;

				default :
					break loop41;
				}
			}

			char_literal106=(Token)match(input,34,FOLLOW_34_in_cons1109);  
			stream_34.add(char_literal106);

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
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:121:41: ^( CONS lExpr )
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:123:1: list : '(' ( WS )* 'list ' lExpr ( WS )* ')' -> ^( LIST lExpr ) ;
	public final while_astParser.list_return list() throws RecognitionException {
		while_astParser.list_return retval = new while_astParser.list_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal107=null;
		Token WS108=null;
		Token string_literal109=null;
		Token WS111=null;
		Token char_literal112=null;
		ParserRuleReturnScope lExpr110 =null;

		Object char_literal107_tree=null;
		Object WS108_tree=null;
		Object string_literal109_tree=null;
		Object WS111_tree=null;
		Object char_literal112_tree=null;
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_lExpr=new RewriteRuleSubtreeStream(adaptor,"rule lExpr");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:123:6: ( '(' ( WS )* 'list ' lExpr ( WS )* ')' -> ^( LIST lExpr ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:123:8: '(' ( WS )* 'list ' lExpr ( WS )* ')'
			{
			char_literal107=(Token)match(input,33,FOLLOW_33_in_list1125);  
			stream_33.add(char_literal107);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:123:11: ( WS )*
			loop42:
			while (true) {
				int alt42=2;
				int LA42_0 = input.LA(1);
				if ( (LA42_0==WS) ) {
					alt42=1;
				}

				switch (alt42) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:123:11: WS
					{
					WS108=(Token)match(input,WS,FOLLOW_WS_in_list1126);  
					stream_WS.add(WS108);

					}
					break;

				default :
					break loop42;
				}
			}

			string_literal109=(Token)match(input,50,FOLLOW_50_in_list1129);  
			stream_50.add(string_literal109);

			pushFollow(FOLLOW_lExpr_in_list1131);
			lExpr110=lExpr();
			state._fsp--;

			stream_lExpr.add(lExpr110.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:123:29: ( WS )*
			loop43:
			while (true) {
				int alt43=2;
				int LA43_0 = input.LA(1);
				if ( (LA43_0==WS) ) {
					alt43=1;
				}

				switch (alt43) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:123:29: WS
					{
					WS111=(Token)match(input,WS,FOLLOW_WS_in_list1133);  
					stream_WS.add(WS111);

					}
					break;

				default :
					break loop43;
				}
			}

			char_literal112=(Token)match(input,34,FOLLOW_34_in_list1136);  
			stream_34.add(char_literal112);

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
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:123:40: ^( LIST lExpr )
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:125:1: hd : '(' ( WS )* 'hd ' exprBase ( WS )* ')' -> ^( HD exprBase ) ;
	public final while_astParser.hd_return hd() throws RecognitionException {
		while_astParser.hd_return retval = new while_astParser.hd_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal113=null;
		Token WS114=null;
		Token string_literal115=null;
		Token WS117=null;
		Token char_literal118=null;
		ParserRuleReturnScope exprBase116 =null;

		Object char_literal113_tree=null;
		Object WS114_tree=null;
		Object string_literal115_tree=null;
		Object WS117_tree=null;
		Object char_literal118_tree=null;
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:125:4: ( '(' ( WS )* 'hd ' exprBase ( WS )* ')' -> ^( HD exprBase ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:125:6: '(' ( WS )* 'hd ' exprBase ( WS )* ')'
			{
			char_literal113=(Token)match(input,33,FOLLOW_33_in_hd1152);  
			stream_33.add(char_literal113);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:125:9: ( WS )*
			loop44:
			while (true) {
				int alt44=2;
				int LA44_0 = input.LA(1);
				if ( (LA44_0==WS) ) {
					alt44=1;
				}

				switch (alt44) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:125:9: WS
					{
					WS114=(Token)match(input,WS,FOLLOW_WS_in_hd1153);  
					stream_WS.add(WS114);

					}
					break;

				default :
					break loop44;
				}
			}

			string_literal115=(Token)match(input,47,FOLLOW_47_in_hd1156);  
			stream_47.add(string_literal115);

			pushFollow(FOLLOW_exprBase_in_hd1158);
			exprBase116=exprBase();
			state._fsp--;

			stream_exprBase.add(exprBase116.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:125:28: ( WS )*
			loop45:
			while (true) {
				int alt45=2;
				int LA45_0 = input.LA(1);
				if ( (LA45_0==WS) ) {
					alt45=1;
				}

				switch (alt45) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:125:28: WS
					{
					WS117=(Token)match(input,WS,FOLLOW_WS_in_hd1160);  
					stream_WS.add(WS117);

					}
					break;

				default :
					break loop45;
				}
			}

			char_literal118=(Token)match(input,34,FOLLOW_34_in_hd1162);  
			stream_34.add(char_literal118);

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
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:125:38: ^( HD exprBase )
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:127:1: tl : '(' ( WS )* 'tl ' exprBase ( WS )* ')' -> ^( TL exprBase ) ;
	public final while_astParser.tl_return tl() throws RecognitionException {
		while_astParser.tl_return retval = new while_astParser.tl_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal119=null;
		Token WS120=null;
		Token string_literal121=null;
		Token WS123=null;
		Token char_literal124=null;
		ParserRuleReturnScope exprBase122 =null;

		Object char_literal119_tree=null;
		Object WS120_tree=null;
		Object string_literal121_tree=null;
		Object WS123_tree=null;
		Object char_literal124_tree=null;
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:127:4: ( '(' ( WS )* 'tl ' exprBase ( WS )* ')' -> ^( TL exprBase ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:127:6: '(' ( WS )* 'tl ' exprBase ( WS )* ')'
			{
			char_literal119=(Token)match(input,33,FOLLOW_33_in_tl1178);  
			stream_33.add(char_literal119);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:127:10: ( WS )*
			loop46:
			while (true) {
				int alt46=2;
				int LA46_0 = input.LA(1);
				if ( (LA46_0==WS) ) {
					alt46=1;
				}

				switch (alt46) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:127:10: WS
					{
					WS120=(Token)match(input,WS,FOLLOW_WS_in_tl1180);  
					stream_WS.add(WS120);

					}
					break;

				default :
					break loop46;
				}
			}

			string_literal121=(Token)match(input,56,FOLLOW_56_in_tl1182);  
			stream_56.add(string_literal121);

			pushFollow(FOLLOW_exprBase_in_tl1184);
			exprBase122=exprBase();
			state._fsp--;

			stream_exprBase.add(exprBase122.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:127:28: ( WS )*
			loop47:
			while (true) {
				int alt47=2;
				int LA47_0 = input.LA(1);
				if ( (LA47_0==WS) ) {
					alt47=1;
				}

				switch (alt47) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:127:28: WS
					{
					WS123=(Token)match(input,WS,FOLLOW_WS_in_tl1186);  
					stream_WS.add(WS123);

					}
					break;

				default :
					break loop47;
				}
			}

			char_literal124=(Token)match(input,34,FOLLOW_34_in_tl1188);  
			stream_34.add(char_literal124);

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
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:127:38: ^( TL exprBase )
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:129:1: symbolExpr : '(' Symbol ( WS )* ( lExpr )? ')' -> Symbol ( lExpr )? ;
	public final while_astParser.symbolExpr_return symbolExpr() throws RecognitionException {
		while_astParser.symbolExpr_return retval = new while_astParser.symbolExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token char_literal125=null;
		Token Symbol126=null;
		Token WS127=null;
		Token char_literal129=null;
		ParserRuleReturnScope lExpr128 =null;

		Object char_literal125_tree=null;
		Object Symbol126_tree=null;
		Object WS127_tree=null;
		Object char_literal129_tree=null;
		RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
		RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
		RewriteRuleTokenStream stream_Symbol=new RewriteRuleTokenStream(adaptor,"token Symbol");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_lExpr=new RewriteRuleSubtreeStream(adaptor,"rule lExpr");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:130:2: ( '(' Symbol ( WS )* ( lExpr )? ')' -> Symbol ( lExpr )? )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:130:4: '(' Symbol ( WS )* ( lExpr )? ')'
			{
			char_literal125=(Token)match(input,33,FOLLOW_33_in_symbolExpr1205);  
			stream_33.add(char_literal125);

			Symbol126=(Token)match(input,Symbol,FOLLOW_Symbol_in_symbolExpr1207);  
			stream_Symbol.add(Symbol126);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:130:15: ( WS )*
			loop48:
			while (true) {
				int alt48=2;
				int LA48_0 = input.LA(1);
				if ( (LA48_0==WS) ) {
					alt48=1;
				}

				switch (alt48) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:130:15: WS
					{
					WS127=(Token)match(input,WS,FOLLOW_WS_in_symbolExpr1209);  
					stream_WS.add(WS127);

					}
					break;

				default :
					break loop48;
				}
			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:130:19: ( lExpr )?
			int alt49=2;
			int LA49_0 = input.LA(1);
			if ( (LA49_0==Variable||LA49_0==33||LA49_0==51) ) {
				alt49=1;
			}
			switch (alt49) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:130:19: lExpr
					{
					pushFollow(FOLLOW_lExpr_in_symbolExpr1212);
					lExpr128=lExpr();
					state._fsp--;

					stream_lExpr.add(lExpr128.getTree());
					}
					break;

			}

			char_literal129=(Token)match(input,34,FOLLOW_34_in_symbolExpr1215);  
			stream_34.add(char_literal129);

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
				adaptor.addChild(root_0, stream_Symbol.nextNode());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:130:40: ( lExpr )?
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:132:1: expression : exprBase ( WS )* ( '=?' ( WS )* exprBase )? -> ^( EXPR exprBase ( exprBase )? ) ;
	public final while_astParser.expression_return expression() throws RecognitionException {
		while_astParser.expression_return retval = new while_astParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WS131=null;
		Token string_literal132=null;
		Token WS133=null;
		ParserRuleReturnScope exprBase130 =null;
		ParserRuleReturnScope exprBase134 =null;

		Object WS131_tree=null;
		Object string_literal132_tree=null;
		Object WS133_tree=null;
		RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:133:5: ( exprBase ( WS )* ( '=?' ( WS )* exprBase )? -> ^( EXPR exprBase ( exprBase )? ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:133:7: exprBase ( WS )* ( '=?' ( WS )* exprBase )?
			{
			pushFollow(FOLLOW_exprBase_in_expression1234);
			exprBase130=exprBase();
			state._fsp--;

			stream_exprBase.add(exprBase130.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:133:16: ( WS )*
			loop50:
			while (true) {
				int alt50=2;
				int LA50_0 = input.LA(1);
				if ( (LA50_0==WS) ) {
					alt50=1;
				}

				switch (alt50) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:133:16: WS
					{
					WS131=(Token)match(input,WS,FOLLOW_WS_in_expression1236);  
					stream_WS.add(WS131);

					}
					break;

				default :
					break loop50;
				}
			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:133:19: ( '=?' ( WS )* exprBase )?
			int alt52=2;
			int LA52_0 = input.LA(1);
			if ( (LA52_0==39) ) {
				alt52=1;
			}
			switch (alt52) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:133:20: '=?' ( WS )* exprBase
					{
					string_literal132=(Token)match(input,39,FOLLOW_39_in_expression1239);  
					stream_39.add(string_literal132);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:133:25: ( WS )*
					loop51:
					while (true) {
						int alt51=2;
						int LA51_0 = input.LA(1);
						if ( (LA51_0==WS) ) {
							alt51=1;
						}

						switch (alt51) {
						case 1 :
							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:133:25: WS
							{
							WS133=(Token)match(input,WS,FOLLOW_WS_in_expression1241);  
							stream_WS.add(WS133);

							}
							break;

						default :
							break loop51;
						}
					}

					pushFollow(FOLLOW_exprBase_in_expression1244);
					exprBase134=exprBase();
					state._fsp--;

					stream_exprBase.add(exprBase134.getTree());
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
			// 133:40: -> ^( EXPR exprBase ( exprBase )? )
			{
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:133:43: ^( EXPR exprBase ( exprBase )? )
				{
				Object root_1 = (Object)adaptor.nil();
				root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXPR, "EXPR"), root_1);
				adaptor.addChild(root_1, stream_exprBase.nextTree());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:133:59: ( exprBase )?
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
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:137:1: lExpr : exprBase ( WS )* ( lExpr )? -> exprBase ( lExpr )? ;
	public final while_astParser.lExpr_return lExpr() throws RecognitionException {
		while_astParser.lExpr_return retval = new while_astParser.lExpr_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WS136=null;
		ParserRuleReturnScope exprBase135 =null;
		ParserRuleReturnScope lExpr137 =null;

		Object WS136_tree=null;
		RewriteRuleTokenStream stream_WS=new RewriteRuleTokenStream(adaptor,"token WS");
		RewriteRuleSubtreeStream stream_exprBase=new RewriteRuleSubtreeStream(adaptor,"rule exprBase");
		RewriteRuleSubtreeStream stream_lExpr=new RewriteRuleSubtreeStream(adaptor,"rule lExpr");

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:138:5: ( exprBase ( WS )* ( lExpr )? -> exprBase ( lExpr )? )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:138:7: exprBase ( WS )* ( lExpr )?
			{
			pushFollow(FOLLOW_exprBase_in_lExpr1278);
			exprBase135=exprBase();
			state._fsp--;

			stream_exprBase.add(exprBase135.getTree());
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:138:16: ( WS )*
			loop53:
			while (true) {
				int alt53=2;
				int LA53_0 = input.LA(1);
				if ( (LA53_0==WS) ) {
					alt53=1;
				}

				switch (alt53) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:138:16: WS
					{
					WS136=(Token)match(input,WS,FOLLOW_WS_in_lExpr1280);  
					stream_WS.add(WS136);

					}
					break;

				default :
					break loop53;
				}
			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:138:20: ( lExpr )?
			int alt54=2;
			int LA54_0 = input.LA(1);
			if ( (LA54_0==Variable||LA54_0==33||LA54_0==51) ) {
				alt54=1;
			}
			switch (alt54) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:138:20: lExpr
					{
					pushFollow(FOLLOW_lExpr_in_lExpr1283);
					lExpr137=lExpr();
					state._fsp--;

					stream_lExpr.add(lExpr137.getTree());
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
			// 138:27: -> exprBase ( lExpr )?
			{
				adaptor.addChild(root_0, stream_exprBase.nextTree());
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:138:39: ( lExpr )?
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
	protected DFA38 dfa38 = new DFA38(this);
	static final String DFA15_eotS =
		"\4\uffff";
	static final String DFA15_eofS =
		"\4\uffff";
	static final String DFA15_minS =
		"\2\37\2\uffff";
	static final String DFA15_maxS =
		"\2\65\2\uffff";
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
			return "70:15: ( ( WS )* ';' ( WS )* commands )?";
		}
	}

	static final String DFA38_eotS =
		"\12\uffff";
	static final String DFA38_eofS =
		"\12\uffff";
	static final String DFA38_minS =
		"\1\35\2\uffff\1\30\1\uffff\1\37\4\uffff";
	static final String DFA38_maxS =
		"\1\63\2\uffff\1\70\1\uffff\1\70\4\uffff";
	static final String DFA38_acceptS =
		"\1\uffff\1\1\1\2\1\uffff\1\7\1\uffff\1\3\1\4\1\5\1\6";
	static final String DFA38_specialS =
		"\12\uffff}>";
	static final String[] DFA38_transitionS = {
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

	static final short[] DFA38_eot = DFA.unpackEncodedString(DFA38_eotS);
	static final short[] DFA38_eof = DFA.unpackEncodedString(DFA38_eofS);
	static final char[] DFA38_min = DFA.unpackEncodedStringToUnsignedChars(DFA38_minS);
	static final char[] DFA38_max = DFA.unpackEncodedStringToUnsignedChars(DFA38_maxS);
	static final short[] DFA38_accept = DFA.unpackEncodedString(DFA38_acceptS);
	static final short[] DFA38_special = DFA.unpackEncodedString(DFA38_specialS);
	static final short[][] DFA38_transition;

	static {
		int numStates = DFA38_transitionS.length;
		DFA38_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA38_transition[i] = DFA.unpackEncodedString(DFA38_transitionS[i]);
		}
	}

	protected class DFA38 extends DFA {

		public DFA38(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 38;
			this.eot = DFA38_eot;
			this.eof = DFA38_eof;
			this.min = DFA38_min;
			this.max = DFA38_max;
			this.accept = DFA38_accept;
			this.special = DFA38_special;
			this.transition = DFA38_transition;
		}
		@Override
		public String getDescription() {
			return "110:1: exprBase : ( nil_ | variable | cons | list | hd | tl | symbolExpr );";
		}
	}

	public static final BitSet FOLLOW_program_in_startProgram194 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_in_program344 = new BitSet(new long[]{0x0000400000000002L});
	public static final BitSet FOLLOW_program_in_program346 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_function375 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_Symbol_in_function377 = new BitSet(new long[]{0x0000001080000000L});
	public static final BitSet FOLLOW_WS_in_function379 = new BitSet(new long[]{0x0000001080000000L});
	public static final BitSet FOLLOW_36_in_function382 = new BitSet(new long[]{0x0040000080000000L});
	public static final BitSet FOLLOW_WS_in_function384 = new BitSet(new long[]{0x0040000080000000L});
	public static final BitSet FOLLOW_definition_in_function387 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_definition414 = new BitSet(new long[]{0x00000001A0000000L});
	public static final BitSet FOLLOW_WS_in_definition416 = new BitSet(new long[]{0x00000001A0000000L});
	public static final BitSet FOLLOW_input_in_definition419 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_definition421 = new BitSet(new long[]{0x02113000A0000000L});
	public static final BitSet FOLLOW_WS_in_definition423 = new BitSet(new long[]{0x02113000A0000000L});
	public static final BitSet FOLLOW_commands_in_definition426 = new BitSet(new long[]{0x0000000180000000L});
	public static final BitSet FOLLOW_WS_in_definition428 = new BitSet(new long[]{0x0000000180000000L});
	public static final BitSet FOLLOW_32_in_definition430 = new BitSet(new long[]{0x0400000080000000L});
	public static final BitSet FOLLOW_WS_in_definition432 = new BitSet(new long[]{0x0400000080000000L});
	public static final BitSet FOLLOW_58_in_definition435 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_output_in_definition437 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inputSub_in_input466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_inputSub494 = new BitSet(new long[]{0x0000000880000002L});
	public static final BitSet FOLLOW_WS_in_inputSub496 = new BitSet(new long[]{0x0000000880000002L});
	public static final BitSet FOLLOW_35_in_inputSub500 = new BitSet(new long[]{0x00000000A0000000L});
	public static final BitSet FOLLOW_WS_in_inputSub502 = new BitSet(new long[]{0x00000000A0000000L});
	public static final BitSet FOLLOW_inputSub_in_inputSub505 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_output531 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_35_in_output534 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_output_in_output536 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_in_commands566 = new BitSet(new long[]{0x0000004080000002L});
	public static final BitSet FOLLOW_WS_in_commands570 = new BitSet(new long[]{0x0000004080000000L});
	public static final BitSet FOLLOW_38_in_commands573 = new BitSet(new long[]{0x02113000A0000000L});
	public static final BitSet FOLLOW_WS_in_commands575 = new BitSet(new long[]{0x02113000A0000000L});
	public static final BitSet FOLLOW_commands_in_commands578 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_command605 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decl_in_command609 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if__in_command613 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_for__in_command617 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_while__in_command621 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_foreach__in_command625 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vars_in_decl639 = new BitSet(new long[]{0x0000002080000000L});
	public static final BitSet FOLLOW_WS_in_decl641 = new BitSet(new long[]{0x0000002080000000L});
	public static final BitSet FOLLOW_37_in_decl644 = new BitSet(new long[]{0x00080002A0000000L});
	public static final BitSet FOLLOW_WS_in_decl646 = new BitSet(new long[]{0x00080002A0000000L});
	public static final BitSet FOLLOW_exprs_in_decl649 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_if_678 = new BitSet(new long[]{0x00080002A0000000L});
	public static final BitSet FOLLOW_WS_in_if_680 = new BitSet(new long[]{0x00080002A0000000L});
	public static final BitSet FOLLOW_expression_in_if_683 = new BitSet(new long[]{0x0080000080000000L});
	public static final BitSet FOLLOW_WS_in_if_685 = new BitSet(new long[]{0x0080000080000000L});
	public static final BitSet FOLLOW_then__in_if_688 = new BitSet(new long[]{0x00000C0080000000L});
	public static final BitSet FOLLOW_WS_in_if_691 = new BitSet(new long[]{0x00000C0080000000L});
	public static final BitSet FOLLOW_else__in_if_694 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_if_696 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_55_in_then_727 = new BitSet(new long[]{0x02113000A0000000L});
	public static final BitSet FOLLOW_WS_in_then_729 = new BitSet(new long[]{0x02113000A0000000L});
	public static final BitSet FOLLOW_commands_in_then_732 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_WS_in_then_734 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_42_in_else_752 = new BitSet(new long[]{0x02113000A0000000L});
	public static final BitSet FOLLOW_WS_in_else_754 = new BitSet(new long[]{0x02113000A0000000L});
	public static final BitSet FOLLOW_commands_in_else_757 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_57_in_while_780 = new BitSet(new long[]{0x00080002A0000000L});
	public static final BitSet FOLLOW_WS_in_while_782 = new BitSet(new long[]{0x00080002A0000000L});
	public static final BitSet FOLLOW_expression_in_while_785 = new BitSet(new long[]{0x0000020080000000L});
	public static final BitSet FOLLOW_WS_in_while_787 = new BitSet(new long[]{0x0000020080000000L});
	public static final BitSet FOLLOW_do__in_while_790 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_do_819 = new BitSet(new long[]{0x02113000A0000000L});
	public static final BitSet FOLLOW_WS_in_do_821 = new BitSet(new long[]{0x02113000A0000000L});
	public static final BitSet FOLLOW_commands_in_do_824 = new BitSet(new long[]{0x0020000080000000L});
	public static final BitSet FOLLOW_WS_in_do_826 = new BitSet(new long[]{0x0020000080000000L});
	public static final BitSet FOLLOW_53_in_do_829 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_for_850 = new BitSet(new long[]{0x00080002A0000000L});
	public static final BitSet FOLLOW_WS_in_for_852 = new BitSet(new long[]{0x00080002A0000000L});
	public static final BitSet FOLLOW_expression_in_for_855 = new BitSet(new long[]{0x0000020080000000L});
	public static final BitSet FOLLOW_WS_in_for_857 = new BitSet(new long[]{0x0000020080000000L});
	public static final BitSet FOLLOW_do__in_for_860 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_foreach_889 = new BitSet(new long[]{0x00000000A0000000L});
	public static final BitSet FOLLOW_WS_in_foreach_891 = new BitSet(new long[]{0x00000000A0000000L});
	public static final BitSet FOLLOW_Variable_in_foreach_894 = new BitSet(new long[]{0x0002000080000000L});
	public static final BitSet FOLLOW_WS_in_foreach_896 = new BitSet(new long[]{0x0002000080000000L});
	public static final BitSet FOLLOW_49_in_foreach_899 = new BitSet(new long[]{0x00080002A0000000L});
	public static final BitSet FOLLOW_WS_in_foreach_901 = new BitSet(new long[]{0x00080002A0000000L});
	public static final BitSet FOLLOW_expression_in_foreach_904 = new BitSet(new long[]{0x0000020080000000L});
	public static final BitSet FOLLOW_WS_in_foreach_906 = new BitSet(new long[]{0x0000020080000000L});
	public static final BitSet FOLLOW_do__in_foreach_909 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_vars943 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_35_in_vars946 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_vars_in_vars948 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_exprs978 = new BitSet(new long[]{0x0000000800000002L});
	public static final BitSet FOLLOW_35_in_exprs981 = new BitSet(new long[]{0x0008000220000000L});
	public static final BitSet FOLLOW_exprs_in_exprs983 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nil__in_exprBase1008 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_exprBase1016 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_cons_in_exprBase1024 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_list_in_exprBase1028 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_hd_in_exprBase1036 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tl_in_exprBase1040 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_symbolExpr_in_exprBase1048 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_51_in_nil_1067 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_WS_in_nil_1068 = new BitSet(new long[]{0x0000000080000002L});
	public static final BitSet FOLLOW_Variable_in_variable1085 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_cons1097 = new BitSet(new long[]{0x0000010080000000L});
	public static final BitSet FOLLOW_WS_in_cons1099 = new BitSet(new long[]{0x0000010080000000L});
	public static final BitSet FOLLOW_40_in_cons1102 = new BitSet(new long[]{0x0008000220000000L});
	public static final BitSet FOLLOW_lExpr_in_cons1104 = new BitSet(new long[]{0x0000000480000000L});
	public static final BitSet FOLLOW_WS_in_cons1106 = new BitSet(new long[]{0x0000000480000000L});
	public static final BitSet FOLLOW_34_in_cons1109 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_list1125 = new BitSet(new long[]{0x0004000080000000L});
	public static final BitSet FOLLOW_WS_in_list1126 = new BitSet(new long[]{0x0004000080000000L});
	public static final BitSet FOLLOW_50_in_list1129 = new BitSet(new long[]{0x0008000220000000L});
	public static final BitSet FOLLOW_lExpr_in_list1131 = new BitSet(new long[]{0x0000000480000000L});
	public static final BitSet FOLLOW_WS_in_list1133 = new BitSet(new long[]{0x0000000480000000L});
	public static final BitSet FOLLOW_34_in_list1136 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_hd1152 = new BitSet(new long[]{0x0000800080000000L});
	public static final BitSet FOLLOW_WS_in_hd1153 = new BitSet(new long[]{0x0000800080000000L});
	public static final BitSet FOLLOW_47_in_hd1156 = new BitSet(new long[]{0x0008000220000000L});
	public static final BitSet FOLLOW_exprBase_in_hd1158 = new BitSet(new long[]{0x0000000480000000L});
	public static final BitSet FOLLOW_WS_in_hd1160 = new BitSet(new long[]{0x0000000480000000L});
	public static final BitSet FOLLOW_34_in_hd1162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_tl1178 = new BitSet(new long[]{0x0100000080000000L});
	public static final BitSet FOLLOW_WS_in_tl1180 = new BitSet(new long[]{0x0100000080000000L});
	public static final BitSet FOLLOW_56_in_tl1182 = new BitSet(new long[]{0x0008000220000000L});
	public static final BitSet FOLLOW_exprBase_in_tl1184 = new BitSet(new long[]{0x0000000480000000L});
	public static final BitSet FOLLOW_WS_in_tl1186 = new BitSet(new long[]{0x0000000480000000L});
	public static final BitSet FOLLOW_34_in_tl1188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_33_in_symbolExpr1205 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_Symbol_in_symbolExpr1207 = new BitSet(new long[]{0x00080006A0000000L});
	public static final BitSet FOLLOW_WS_in_symbolExpr1209 = new BitSet(new long[]{0x00080006A0000000L});
	public static final BitSet FOLLOW_lExpr_in_symbolExpr1212 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_symbolExpr1215 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprBase_in_expression1234 = new BitSet(new long[]{0x0000008080000002L});
	public static final BitSet FOLLOW_WS_in_expression1236 = new BitSet(new long[]{0x0000008080000002L});
	public static final BitSet FOLLOW_39_in_expression1239 = new BitSet(new long[]{0x00080002A0000000L});
	public static final BitSet FOLLOW_WS_in_expression1241 = new BitSet(new long[]{0x00080002A0000000L});
	public static final BitSet FOLLOW_exprBase_in_expression1244 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprBase_in_lExpr1278 = new BitSet(new long[]{0x00080002A0000002L});
	public static final BitSet FOLLOW_WS_in_lExpr1280 = new BitSet(new long[]{0x00080002A0000002L});
	public static final BitSet FOLLOW_lExpr_in_lExpr1283 = new BitSet(new long[]{0x0000000000000002L});
}

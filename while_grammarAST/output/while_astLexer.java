// $ANTLR 3.5.1 C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g 2024-01-14 11:14:22

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class while_astLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public while_astLexer() {} 
	public while_astLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public while_astLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g"; }

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:2:7: ( '%' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:2:9: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:3:7: ( '(' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:3:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:4:7: ( ')' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:4:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:5:7: ( ',' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:5:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:6:7: ( ':' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:6:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:7:7: ( ':=' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:7:9: ':='
			{
			match(":="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:8:7: ( ';' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:8:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:9:7: ( '=?' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:9:9: '=?'
			{
			match("=?"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:10:7: ( 'cons ' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:10:9: 'cons '
			{
			match("cons "); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:11:7: ( 'do' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:11:9: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__46"

	// $ANTLR start "T__47"
	public final void mT__47() throws RecognitionException {
		try {
			int _type = T__47;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:12:7: ( 'else' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:12:9: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__47"

	// $ANTLR start "T__48"
	public final void mT__48() throws RecognitionException {
		try {
			int _type = T__48;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:13:7: ( 'fi' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:13:9: 'fi'
			{
			match("fi"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__48"

	// $ANTLR start "T__49"
	public final void mT__49() throws RecognitionException {
		try {
			int _type = T__49;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:14:7: ( 'for' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:14:9: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__49"

	// $ANTLR start "T__50"
	public final void mT__50() throws RecognitionException {
		try {
			int _type = T__50;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:15:7: ( 'foreach' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:15:9: 'foreach'
			{
			match("foreach"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__50"

	// $ANTLR start "T__51"
	public final void mT__51() throws RecognitionException {
		try {
			int _type = T__51;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:16:7: ( 'function' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:16:9: 'function'
			{
			match("function"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__51"

	// $ANTLR start "T__52"
	public final void mT__52() throws RecognitionException {
		try {
			int _type = T__52;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:17:7: ( 'hd ' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:17:9: 'hd '
			{
			match("hd "); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__52"

	// $ANTLR start "T__53"
	public final void mT__53() throws RecognitionException {
		try {
			int _type = T__53;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:18:7: ( 'if' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:18:9: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__53"

	// $ANTLR start "T__54"
	public final void mT__54() throws RecognitionException {
		try {
			int _type = T__54;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:19:7: ( 'in' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:19:9: 'in'
			{
			match("in"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__54"

	// $ANTLR start "T__55"
	public final void mT__55() throws RecognitionException {
		try {
			int _type = T__55;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:20:7: ( 'list ' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:20:9: 'list '
			{
			match("list "); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__55"

	// $ANTLR start "T__56"
	public final void mT__56() throws RecognitionException {
		try {
			int _type = T__56;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:21:7: ( 'nil' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:21:9: 'nil'
			{
			match("nil"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__56"

	// $ANTLR start "T__57"
	public final void mT__57() throws RecognitionException {
		try {
			int _type = T__57;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:22:7: ( 'nop' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:22:9: 'nop'
			{
			match("nop"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__57"

	// $ANTLR start "T__58"
	public final void mT__58() throws RecognitionException {
		try {
			int _type = T__58;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:23:7: ( 'not' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:23:9: 'not'
			{
			match("not"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__58"

	// $ANTLR start "T__59"
	public final void mT__59() throws RecognitionException {
		try {
			int _type = T__59;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:24:7: ( 'od' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:24:9: 'od'
			{
			match("od"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__59"

	// $ANTLR start "T__60"
	public final void mT__60() throws RecognitionException {
		try {
			int _type = T__60;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:25:7: ( 'read' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:25:9: 'read'
			{
			match("read"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__60"

	// $ANTLR start "T__61"
	public final void mT__61() throws RecognitionException {
		try {
			int _type = T__61;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:26:7: ( 'then' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:26:9: 'then'
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__61"

	// $ANTLR start "T__62"
	public final void mT__62() throws RecognitionException {
		try {
			int _type = T__62;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:27:7: ( 'tl ' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:27:9: 'tl '
			{
			match("tl "); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__62"

	// $ANTLR start "T__63"
	public final void mT__63() throws RecognitionException {
		try {
			int _type = T__63;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:28:7: ( 'while' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:28:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__63"

	// $ANTLR start "T__64"
	public final void mT__64() throws RecognitionException {
		try {
			int _type = T__64;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:29:7: ( 'write ' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:29:9: 'write '
			{
			match("write "); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__64"

	// $ANTLR start "Maj"
	public final void mMaj() throws RecognitionException {
		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:41:18: ( ( 'A' .. 'Z' ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Maj"

	// $ANTLR start "Min"
	public final void mMin() throws RecognitionException {
		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:42:18: ( ( 'a' .. 'z' ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:
			{
			if ( (input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Min"

	// $ANTLR start "Dec"
	public final void mDec() throws RecognitionException {
		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:43:18: ( ( '0' .. '9' ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Dec"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:44:9: ( ' ' | '\\n' | '\\r' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:
			{
			if ( input.LA(1)=='\n'||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "Variable"
	public final void mVariable() throws RecognitionException {
		try {
			int _type = Variable;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:46:13: ( Maj ( Maj | Min | Dec )* ( '!' | '?' )? )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:46:15: Maj ( Maj | Min | Dec )* ( '!' | '?' )?
			{
			mMaj(); 

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:46:19: ( Maj | Min | Dec )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:46:38: ( '!' | '?' )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='!'||LA2_0=='?') ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:
					{
					if ( input.LA(1)=='!'||input.LA(1)=='?' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Variable"

	// $ANTLR start "Symbol"
	public final void mSymbol() throws RecognitionException {
		try {
			int _type = Symbol;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:47:13: ( Min ( Maj | Min | Dec )* ( '!' | '?' )? )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:47:15: Min ( Maj | Min | Dec )* ( '!' | '?' )?
			{
			mMin(); 

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:47:19: ( Maj | Min | Dec )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop3;
				}
			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:47:38: ( '!' | '?' )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='!'||LA4_0=='?') ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:
					{
					if ( input.LA(1)=='!'||input.LA(1)=='?' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Symbol"

	// $ANTLR start "Comment"
	public final void mComment() throws RecognitionException {
		try {
			int _type = Comment;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:49:9: ( ( ' ' )* '/' '/' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:49:11: ( ' ' )* '/' '/' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
			{
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:49:11: ( ' ' )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==' ') ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:49:11: ' '
					{
					match(' '); 
					}
					break;

				default :
					break loop5;
				}
			}

			match('/'); 
			match('/'); 
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:49:23: (~ ( '\\n' | '\\r' ) )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '\u0000' && LA6_0 <= '\t')||(LA6_0 >= '\u000B' && LA6_0 <= '\f')||(LA6_0 >= '\u000E' && LA6_0 <= '\uFFFF')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop6;
				}
			}

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:49:37: ( '\\r' )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='\r') ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:49:37: '\\r'
					{
					match('\r'); 
					}
					break;

			}

			match('\n'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Comment"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:1:8: ( T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | WS | Variable | Symbol | Comment )
		int alt8=32;
		alt8 = dfa8.predict(input);
		switch (alt8) {
			case 1 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:1:10: T__37
				{
				mT__37(); 

				}
				break;
			case 2 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:1:16: T__38
				{
				mT__38(); 

				}
				break;
			case 3 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:1:22: T__39
				{
				mT__39(); 

				}
				break;
			case 4 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:1:28: T__40
				{
				mT__40(); 

				}
				break;
			case 5 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:1:34: T__41
				{
				mT__41(); 

				}
				break;
			case 6 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:1:40: T__42
				{
				mT__42(); 

				}
				break;
			case 7 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:1:46: T__43
				{
				mT__43(); 

				}
				break;
			case 8 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:1:52: T__44
				{
				mT__44(); 

				}
				break;
			case 9 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:1:58: T__45
				{
				mT__45(); 

				}
				break;
			case 10 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:1:64: T__46
				{
				mT__46(); 

				}
				break;
			case 11 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:1:70: T__47
				{
				mT__47(); 

				}
				break;
			case 12 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:1:76: T__48
				{
				mT__48(); 

				}
				break;
			case 13 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:1:82: T__49
				{
				mT__49(); 

				}
				break;
			case 14 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:1:88: T__50
				{
				mT__50(); 

				}
				break;
			case 15 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:1:94: T__51
				{
				mT__51(); 

				}
				break;
			case 16 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:1:100: T__52
				{
				mT__52(); 

				}
				break;
			case 17 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:1:106: T__53
				{
				mT__53(); 

				}
				break;
			case 18 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:1:112: T__54
				{
				mT__54(); 

				}
				break;
			case 19 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:1:118: T__55
				{
				mT__55(); 

				}
				break;
			case 20 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:1:124: T__56
				{
				mT__56(); 

				}
				break;
			case 21 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:1:130: T__57
				{
				mT__57(); 

				}
				break;
			case 22 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:1:136: T__58
				{
				mT__58(); 

				}
				break;
			case 23 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:1:142: T__59
				{
				mT__59(); 

				}
				break;
			case 24 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:1:148: T__60
				{
				mT__60(); 

				}
				break;
			case 25 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:1:154: T__61
				{
				mT__61(); 

				}
				break;
			case 26 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:1:160: T__62
				{
				mT__62(); 

				}
				break;
			case 27 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:1:166: T__63
				{
				mT__63(); 

				}
				break;
			case 28 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:1:172: T__64
				{
				mT__64(); 

				}
				break;
			case 29 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:1:178: WS
				{
				mWS(); 

				}
				break;
			case 30 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:1:181: Variable
				{
				mVariable(); 

				}
				break;
			case 31 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:1:190: Symbol
				{
				mSymbol(); 

				}
				break;
			case 32 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammarAST\\while_ast.g:1:197: Comment
				{
				mComment(); 

				}
				break;

		}
	}


	protected DFA8 dfa8 = new DFA8(this);
	static final String DFA8_eotS =
		"\5\uffff\1\32\2\uffff\14\26\1\27\6\uffff\1\26\1\56\1\26\1\60\3\26\1\64"+
		"\1\65\3\26\1\72\6\26\1\uffff\1\26\1\uffff\1\103\1\26\3\uffff\1\26\1\106"+
		"\1\107\1\110\1\uffff\2\26\1\uffff\3\26\1\116\1\26\1\uffff\2\26\3\uffff"+
		"\1\122\1\123\2\26\2\uffff\2\26\3\uffff\1\130\3\26\2\uffff\1\134\1\26\1"+
		"\uffff\1\136\1\uffff";
	static final String DFA8_eofS =
		"\137\uffff";
	static final String DFA8_minS =
		"\1\12\4\uffff\1\75\2\uffff\2\157\1\154\1\151\1\144\1\146\2\151\1\144\1"+
		"\145\2\150\1\40\6\uffff\1\156\1\41\1\163\1\41\1\162\1\156\1\40\2\41\1"+
		"\163\1\154\1\160\1\41\1\141\1\145\1\40\2\151\1\163\1\uffff\1\145\1\uffff"+
		"\1\41\1\143\3\uffff\1\164\3\41\1\uffff\1\144\1\156\1\uffff\1\154\1\164"+
		"\1\40\1\41\1\141\1\uffff\1\164\1\40\3\uffff\2\41\2\145\2\uffff\1\143\1"+
		"\151\3\uffff\1\41\1\40\1\150\1\157\2\uffff\1\41\1\156\1\uffff\1\41\1\uffff";
	static final String DFA8_maxS =
		"\1\172\4\uffff\1\75\2\uffff\2\157\1\154\1\165\1\144\1\156\1\151\1\157"+
		"\1\144\1\145\1\154\1\162\1\57\6\uffff\1\156\1\172\1\163\1\172\1\162\1"+
		"\156\1\40\2\172\1\163\1\154\1\164\1\172\1\141\1\145\1\40\2\151\1\163\1"+
		"\uffff\1\145\1\uffff\1\172\1\143\3\uffff\1\164\3\172\1\uffff\1\144\1\156"+
		"\1\uffff\1\154\1\164\1\40\1\172\1\141\1\uffff\1\164\1\40\3\uffff\2\172"+
		"\2\145\2\uffff\1\143\1\151\3\uffff\1\172\1\40\1\150\1\157\2\uffff\1\172"+
		"\1\156\1\uffff\1\172\1\uffff";
	static final String DFA8_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\7\1\10\15\uffff\1\36\1\37\1\35\1\40"+
		"\1\6\1\5\23\uffff\1\12\1\uffff\1\14\2\uffff\1\20\1\21\1\22\4\uffff\1\27"+
		"\2\uffff\1\32\5\uffff\1\15\2\uffff\1\24\1\25\1\26\4\uffff\1\11\1\13\2"+
		"\uffff\1\23\1\30\1\31\4\uffff\1\33\1\34\2\uffff\1\16\1\uffff\1\17";
	static final String DFA8_specialS =
		"\137\uffff}>";
	static final String[] DFA8_transitionS = {
			"\1\27\2\uffff\1\27\22\uffff\1\24\4\uffff\1\1\2\uffff\1\2\1\3\2\uffff"+
			"\1\4\2\uffff\1\30\12\uffff\1\5\1\6\1\uffff\1\7\3\uffff\32\25\6\uffff"+
			"\2\26\1\10\1\11\1\12\1\13\1\26\1\14\1\15\2\26\1\16\1\26\1\17\1\20\2\26"+
			"\1\21\1\26\1\22\2\26\1\23\3\26",
			"",
			"",
			"",
			"",
			"\1\31",
			"",
			"",
			"\1\33",
			"\1\34",
			"\1\35",
			"\1\36\5\uffff\1\37\5\uffff\1\40",
			"\1\41",
			"\1\42\7\uffff\1\43",
			"\1\44",
			"\1\45\5\uffff\1\46",
			"\1\47",
			"\1\50",
			"\1\51\3\uffff\1\52",
			"\1\53\11\uffff\1\54",
			"\1\30\16\uffff\1\30",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\55",
			"\1\26\16\uffff\12\26\5\uffff\1\26\1\uffff\32\26\6\uffff\32\26",
			"\1\57",
			"\1\26\16\uffff\12\26\5\uffff\1\26\1\uffff\32\26\6\uffff\32\26",
			"\1\61",
			"\1\62",
			"\1\63",
			"\1\26\16\uffff\12\26\5\uffff\1\26\1\uffff\32\26\6\uffff\32\26",
			"\1\26\16\uffff\12\26\5\uffff\1\26\1\uffff\32\26\6\uffff\32\26",
			"\1\66",
			"\1\67",
			"\1\70\3\uffff\1\71",
			"\1\26\16\uffff\12\26\5\uffff\1\26\1\uffff\32\26\6\uffff\32\26",
			"\1\73",
			"\1\74",
			"\1\75",
			"\1\76",
			"\1\77",
			"\1\100",
			"",
			"\1\101",
			"",
			"\1\26\16\uffff\12\26\5\uffff\1\26\1\uffff\32\26\6\uffff\4\26\1\102\25"+
			"\26",
			"\1\104",
			"",
			"",
			"",
			"\1\105",
			"\1\26\16\uffff\12\26\5\uffff\1\26\1\uffff\32\26\6\uffff\32\26",
			"\1\26\16\uffff\12\26\5\uffff\1\26\1\uffff\32\26\6\uffff\32\26",
			"\1\26\16\uffff\12\26\5\uffff\1\26\1\uffff\32\26\6\uffff\32\26",
			"",
			"\1\111",
			"\1\112",
			"",
			"\1\113",
			"\1\114",
			"\1\115",
			"\1\26\16\uffff\12\26\5\uffff\1\26\1\uffff\32\26\6\uffff\32\26",
			"\1\117",
			"",
			"\1\120",
			"\1\121",
			"",
			"",
			"",
			"\1\26\16\uffff\12\26\5\uffff\1\26\1\uffff\32\26\6\uffff\32\26",
			"\1\26\16\uffff\12\26\5\uffff\1\26\1\uffff\32\26\6\uffff\32\26",
			"\1\124",
			"\1\125",
			"",
			"",
			"\1\126",
			"\1\127",
			"",
			"",
			"",
			"\1\26\16\uffff\12\26\5\uffff\1\26\1\uffff\32\26\6\uffff\32\26",
			"\1\131",
			"\1\132",
			"\1\133",
			"",
			"",
			"\1\26\16\uffff\12\26\5\uffff\1\26\1\uffff\32\26\6\uffff\32\26",
			"\1\135",
			"",
			"\1\26\16\uffff\12\26\5\uffff\1\26\1\uffff\32\26\6\uffff\32\26",
			""
	};

	static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
	static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
	static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
	static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
	static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
	static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
	static final short[][] DFA8_transition;

	static {
		int numStates = DFA8_transitionS.length;
		DFA8_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
		}
	}

	protected class DFA8 extends DFA {

		public DFA8(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 8;
			this.eot = DFA8_eot;
			this.eof = DFA8_eof;
			this.min = DFA8_min;
			this.max = DFA8_max;
			this.accept = DFA8_accept;
			this.special = DFA8_special;
			this.transition = DFA8_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | WS | Variable | Symbol | Comment );";
		}
	}

}

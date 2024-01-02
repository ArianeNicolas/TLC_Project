// $ANTLR 3.5.1 C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g 2024-01-02 21:43:54

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class while_astLexer extends Lexer {
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
	@Override public String getGrammarFileName() { return "C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g"; }

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:2:7: ( '%' )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:2:9: '%'
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
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:3:7: ( '(' )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:3:9: '('
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
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:4:7: ( ')' )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:4:9: ')'
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
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:5:7: ( ',' )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:5:9: ','
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
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:6:7: ( ':' )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:6:9: ':'
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
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:7:7: ( ':=' )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:7:9: ':='
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
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:8:7: ( ';' )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:8:9: ';'
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
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:9:7: ( '=?' )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:9:9: '=?'
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
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:10:7: ( 'cons ' )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:10:9: 'cons '
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
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:11:7: ( 'do' )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:11:9: 'do'
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
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:12:7: ( 'else' )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:12:9: 'else'
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
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:13:7: ( 'fi' )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:13:9: 'fi'
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
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:14:7: ( 'for' )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:14:9: 'for'
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
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:15:7: ( 'foreach' )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:15:9: 'foreach'
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
	// $ANTLR end "T__46"

	// $ANTLR start "T__47"
	public final void mT__47() throws RecognitionException {
		try {
			int _type = T__47;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:16:7: ( 'function ' )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:16:9: 'function '
			{
			match("function "); 

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
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:17:7: ( 'hd ' )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:17:9: 'hd '
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
	// $ANTLR end "T__48"

	// $ANTLR start "T__49"
	public final void mT__49() throws RecognitionException {
		try {
			int _type = T__49;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:18:7: ( 'if' )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:18:9: 'if'
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
	// $ANTLR end "T__49"

	// $ANTLR start "T__50"
	public final void mT__50() throws RecognitionException {
		try {
			int _type = T__50;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:19:7: ( 'in' )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:19:9: 'in'
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
	// $ANTLR end "T__50"

	// $ANTLR start "T__51"
	public final void mT__51() throws RecognitionException {
		try {
			int _type = T__51;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:20:7: ( 'list ' )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:20:9: 'list '
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
	// $ANTLR end "T__51"

	// $ANTLR start "T__52"
	public final void mT__52() throws RecognitionException {
		try {
			int _type = T__52;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:21:7: ( 'nil' )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:21:9: 'nil'
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
	// $ANTLR end "T__52"

	// $ANTLR start "T__53"
	public final void mT__53() throws RecognitionException {
		try {
			int _type = T__53;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:22:7: ( 'nop' )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:22:9: 'nop'
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
	// $ANTLR end "T__53"

	// $ANTLR start "T__54"
	public final void mT__54() throws RecognitionException {
		try {
			int _type = T__54;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:23:7: ( 'od' )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:23:9: 'od'
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
	// $ANTLR end "T__54"

	// $ANTLR start "T__55"
	public final void mT__55() throws RecognitionException {
		try {
			int _type = T__55;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:24:7: ( 'read' )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:24:9: 'read'
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
	// $ANTLR end "T__55"

	// $ANTLR start "T__56"
	public final void mT__56() throws RecognitionException {
		try {
			int _type = T__56;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:25:7: ( 'then' )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:25:9: 'then'
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
	// $ANTLR end "T__56"

	// $ANTLR start "T__57"
	public final void mT__57() throws RecognitionException {
		try {
			int _type = T__57;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:26:7: ( 'tl ' )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:26:9: 'tl '
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
	// $ANTLR end "T__57"

	// $ANTLR start "T__58"
	public final void mT__58() throws RecognitionException {
		try {
			int _type = T__58;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:27:7: ( 'while' )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:27:9: 'while'
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
	// $ANTLR end "T__58"

	// $ANTLR start "T__59"
	public final void mT__59() throws RecognitionException {
		try {
			int _type = T__59;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:28:7: ( 'write ' )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:28:9: 'write '
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
	// $ANTLR end "T__59"

	// $ANTLR start "Maj"
	public final void mMaj() throws RecognitionException {
		try {
			int _type = Maj;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:38:9: ( ( 'A' .. 'Z' ) )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:
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

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Maj"

	// $ANTLR start "Min"
	public final void mMin() throws RecognitionException {
		try {
			int _type = Min;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:39:9: ( ( 'a' .. 'z' ) )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:
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

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Min"

	// $ANTLR start "Dec"
	public final void mDec() throws RecognitionException {
		try {
			int _type = Dec;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:40:9: ( ( '0' .. '9' ) )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:
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

			state.type = _type;
			state.channel = _channel;
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
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:41:9: ( ' ' | '\\n' | '\\r' )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:
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
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:43:13: ( Maj ( Maj | Min | Dec )* ( '!' | '?' )? )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:43:15: Maj ( Maj | Min | Dec )* ( '!' | '?' )?
			{
			mMaj(); 

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:43:19: ( Maj | Min | Dec )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:
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

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:43:38: ( '!' | '?' )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='!'||LA2_0=='?') ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:
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
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:44:13: ( Min ( Maj | Min | Dec )* ( '!' | '?' )? )
			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:44:15: Min ( Maj | Min | Dec )* ( '!' | '?' )?
			{
			mMin(); 

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:44:19: ( Maj | Min | Dec )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:
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

			// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:44:38: ( '!' | '?' )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='!'||LA4_0=='?') ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:
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

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:1:8: ( T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | Maj | Min | Dec | WS | Variable | Symbol )
		int alt5=33;
		alt5 = dfa5.predict(input);
		switch (alt5) {
			case 1 :
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:1:10: T__33
				{
				mT__33(); 

				}
				break;
			case 2 :
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:1:16: T__34
				{
				mT__34(); 

				}
				break;
			case 3 :
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:1:22: T__35
				{
				mT__35(); 

				}
				break;
			case 4 :
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:1:28: T__36
				{
				mT__36(); 

				}
				break;
			case 5 :
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:1:34: T__37
				{
				mT__37(); 

				}
				break;
			case 6 :
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:1:40: T__38
				{
				mT__38(); 

				}
				break;
			case 7 :
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:1:46: T__39
				{
				mT__39(); 

				}
				break;
			case 8 :
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:1:52: T__40
				{
				mT__40(); 

				}
				break;
			case 9 :
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:1:58: T__41
				{
				mT__41(); 

				}
				break;
			case 10 :
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:1:64: T__42
				{
				mT__42(); 

				}
				break;
			case 11 :
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:1:70: T__43
				{
				mT__43(); 

				}
				break;
			case 12 :
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:1:76: T__44
				{
				mT__44(); 

				}
				break;
			case 13 :
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:1:82: T__45
				{
				mT__45(); 

				}
				break;
			case 14 :
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:1:88: T__46
				{
				mT__46(); 

				}
				break;
			case 15 :
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:1:94: T__47
				{
				mT__47(); 

				}
				break;
			case 16 :
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:1:100: T__48
				{
				mT__48(); 

				}
				break;
			case 17 :
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:1:106: T__49
				{
				mT__49(); 

				}
				break;
			case 18 :
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:1:112: T__50
				{
				mT__50(); 

				}
				break;
			case 19 :
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:1:118: T__51
				{
				mT__51(); 

				}
				break;
			case 20 :
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:1:124: T__52
				{
				mT__52(); 

				}
				break;
			case 21 :
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:1:130: T__53
				{
				mT__53(); 

				}
				break;
			case 22 :
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:1:136: T__54
				{
				mT__54(); 

				}
				break;
			case 23 :
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:1:142: T__55
				{
				mT__55(); 

				}
				break;
			case 24 :
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:1:148: T__56
				{
				mT__56(); 

				}
				break;
			case 25 :
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:1:154: T__57
				{
				mT__57(); 

				}
				break;
			case 26 :
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:1:160: T__58
				{
				mT__58(); 

				}
				break;
			case 27 :
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:1:166: T__59
				{
				mT__59(); 

				}
				break;
			case 28 :
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:1:172: Maj
				{
				mMaj(); 

				}
				break;
			case 29 :
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:1:176: Min
				{
				mMin(); 

				}
				break;
			case 30 :
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:1:180: Dec
				{
				mDec(); 

				}
				break;
			case 31 :
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:1:184: WS
				{
				mWS(); 

				}
				break;
			case 32 :
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:1:187: Variable
				{
				mVariable(); 

				}
				break;
			case 33 :
				// C:\\Users\\PC\\Desktop\\projet-tlc\\while_grammarAST\\while_ast.g:1:196: Symbol
				{
				mSymbol(); 

				}
				break;

		}
	}


	protected DFA5 dfa5 = new DFA5(this);
	static final String DFA5_eotS =
		"\5\uffff\1\31\2\uffff\14\33\1\56\1\33\4\uffff\1\34\2\uffff\1\61\1\34\1"+
		"\63\3\34\1\67\1\70\3\34\1\74\5\34\2\uffff\1\34\1\uffff\1\34\1\uffff\1"+
		"\105\1\34\3\uffff\1\34\1\110\1\111\1\uffff\2\34\1\uffff\3\34\1\117\1\34"+
		"\1\uffff\2\34\2\uffff\1\123\1\124\2\34\2\uffff\2\34\3\uffff\1\131\3\34"+
		"\2\uffff\1\135\1\34\1\uffff\1\34\1\uffff";
	static final String DFA5_eofS =
		"\140\uffff";
	static final String DFA5_minS =
		"\1\12\4\uffff\1\75\2\uffff\16\41\4\uffff\1\156\2\uffff\1\41\1\163\1\41"+
		"\1\162\1\156\1\40\2\41\1\163\1\154\1\160\1\41\1\141\1\145\1\40\2\151\2"+
		"\uffff\1\163\1\uffff\1\145\1\uffff\1\41\1\143\3\uffff\1\164\2\41\1\uffff"+
		"\1\144\1\156\1\uffff\1\154\1\164\1\40\1\41\1\141\1\uffff\1\164\1\40\2"+
		"\uffff\2\41\2\145\2\uffff\1\143\1\151\3\uffff\1\41\1\40\1\150\1\157\2"+
		"\uffff\1\41\1\156\1\uffff\1\40\1\uffff";
	static final String DFA5_maxS =
		"\1\172\4\uffff\1\75\2\uffff\16\172\4\uffff\1\156\2\uffff\1\172\1\163\1"+
		"\172\1\162\1\156\1\40\2\172\1\163\1\154\1\160\1\172\1\141\1\145\1\40\2"+
		"\151\2\uffff\1\163\1\uffff\1\145\1\uffff\1\172\1\143\3\uffff\1\164\2\172"+
		"\1\uffff\1\144\1\156\1\uffff\1\154\1\164\1\40\1\172\1\141\1\uffff\1\164"+
		"\1\40\2\uffff\2\172\2\145\2\uffff\1\143\1\151\3\uffff\1\172\1\40\1\150"+
		"\1\157\2\uffff\1\172\1\156\1\uffff\1\40\1\uffff";
	static final String DFA5_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\7\1\10\16\uffff\1\36\1\37\1\6\1\5\1"+
		"\uffff\1\35\1\41\21\uffff\1\34\1\40\1\uffff\1\12\1\uffff\1\14\2\uffff"+
		"\1\20\1\21\1\22\3\uffff\1\26\2\uffff\1\31\5\uffff\1\15\2\uffff\1\24\1"+
		"\25\4\uffff\1\11\1\13\2\uffff\1\23\1\27\1\30\4\uffff\1\32\1\33\2\uffff"+
		"\1\16\1\uffff\1\17";
	static final String DFA5_specialS =
		"\140\uffff}>";
	static final String[] DFA5_transitionS = {
			"\1\27\2\uffff\1\27\22\uffff\1\27\4\uffff\1\1\2\uffff\1\2\1\3\2\uffff"+
			"\1\4\3\uffff\12\26\1\5\1\6\1\uffff\1\7\3\uffff\32\24\6\uffff\2\25\1\10"+
			"\1\11\1\12\1\13\1\25\1\14\1\15\2\25\1\16\1\25\1\17\1\20\2\25\1\21\1\25"+
			"\1\22\2\25\1\23\3\25",
			"",
			"",
			"",
			"",
			"\1\30",
			"",
			"",
			"\1\34\16\uffff\12\34\5\uffff\1\34\1\uffff\32\34\6\uffff\16\34\1\32\13"+
			"\34",
			"\1\34\16\uffff\12\34\5\uffff\1\34\1\uffff\32\34\6\uffff\16\34\1\35\13"+
			"\34",
			"\1\34\16\uffff\12\34\5\uffff\1\34\1\uffff\32\34\6\uffff\13\34\1\36\16"+
			"\34",
			"\1\34\16\uffff\12\34\5\uffff\1\34\1\uffff\32\34\6\uffff\10\34\1\37\5"+
			"\34\1\40\5\34\1\41\5\34",
			"\1\34\16\uffff\12\34\5\uffff\1\34\1\uffff\32\34\6\uffff\3\34\1\42\26"+
			"\34",
			"\1\34\16\uffff\12\34\5\uffff\1\34\1\uffff\32\34\6\uffff\5\34\1\43\7"+
			"\34\1\44\14\34",
			"\1\34\16\uffff\12\34\5\uffff\1\34\1\uffff\32\34\6\uffff\10\34\1\45\21"+
			"\34",
			"\1\34\16\uffff\12\34\5\uffff\1\34\1\uffff\32\34\6\uffff\10\34\1\46\5"+
			"\34\1\47\13\34",
			"\1\34\16\uffff\12\34\5\uffff\1\34\1\uffff\32\34\6\uffff\3\34\1\50\26"+
			"\34",
			"\1\34\16\uffff\12\34\5\uffff\1\34\1\uffff\32\34\6\uffff\4\34\1\51\25"+
			"\34",
			"\1\34\16\uffff\12\34\5\uffff\1\34\1\uffff\32\34\6\uffff\7\34\1\52\3"+
			"\34\1\53\16\34",
			"\1\34\16\uffff\12\34\5\uffff\1\34\1\uffff\32\34\6\uffff\7\34\1\54\11"+
			"\34\1\55\10\34",
			"\1\57\16\uffff\12\57\5\uffff\1\57\1\uffff\32\57\6\uffff\32\57",
			"\1\34\16\uffff\12\34\5\uffff\1\34\1\uffff\32\34\6\uffff\32\34",
			"",
			"",
			"",
			"",
			"\1\60",
			"",
			"",
			"\1\34\16\uffff\12\34\5\uffff\1\34\1\uffff\32\34\6\uffff\32\34",
			"\1\62",
			"\1\34\16\uffff\12\34\5\uffff\1\34\1\uffff\32\34\6\uffff\32\34",
			"\1\64",
			"\1\65",
			"\1\66",
			"\1\34\16\uffff\12\34\5\uffff\1\34\1\uffff\32\34\6\uffff\32\34",
			"\1\34\16\uffff\12\34\5\uffff\1\34\1\uffff\32\34\6\uffff\32\34",
			"\1\71",
			"\1\72",
			"\1\73",
			"\1\34\16\uffff\12\34\5\uffff\1\34\1\uffff\32\34\6\uffff\32\34",
			"\1\75",
			"\1\76",
			"\1\77",
			"\1\100",
			"\1\101",
			"",
			"",
			"\1\102",
			"",
			"\1\103",
			"",
			"\1\34\16\uffff\12\34\5\uffff\1\34\1\uffff\32\34\6\uffff\4\34\1\104\25"+
			"\34",
			"\1\106",
			"",
			"",
			"",
			"\1\107",
			"\1\34\16\uffff\12\34\5\uffff\1\34\1\uffff\32\34\6\uffff\32\34",
			"\1\34\16\uffff\12\34\5\uffff\1\34\1\uffff\32\34\6\uffff\32\34",
			"",
			"\1\112",
			"\1\113",
			"",
			"\1\114",
			"\1\115",
			"\1\116",
			"\1\34\16\uffff\12\34\5\uffff\1\34\1\uffff\32\34\6\uffff\32\34",
			"\1\120",
			"",
			"\1\121",
			"\1\122",
			"",
			"",
			"\1\34\16\uffff\12\34\5\uffff\1\34\1\uffff\32\34\6\uffff\32\34",
			"\1\34\16\uffff\12\34\5\uffff\1\34\1\uffff\32\34\6\uffff\32\34",
			"\1\125",
			"\1\126",
			"",
			"",
			"\1\127",
			"\1\130",
			"",
			"",
			"",
			"\1\34\16\uffff\12\34\5\uffff\1\34\1\uffff\32\34\6\uffff\32\34",
			"\1\132",
			"\1\133",
			"\1\134",
			"",
			"",
			"\1\34\16\uffff\12\34\5\uffff\1\34\1\uffff\32\34\6\uffff\32\34",
			"\1\136",
			"",
			"\1\137",
			""
	};

	static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
	static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
	static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
	static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
	static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
	static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
	static final short[][] DFA5_transition;

	static {
		int numStates = DFA5_transitionS.length;
		DFA5_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
		}
	}

	protected class DFA5 extends DFA {

		public DFA5(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 5;
			this.eot = DFA5_eot;
			this.eof = DFA5_eof;
			this.min = DFA5_min;
			this.max = DFA5_max;
			this.accept = DFA5_accept;
			this.special = DFA5_special;
			this.transition = DFA5_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | Maj | Min | Dec | WS | Variable | Symbol );";
		}
	}

}

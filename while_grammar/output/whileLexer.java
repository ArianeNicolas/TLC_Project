// $ANTLR 3.5.1 C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g 2023-11-19 21:56:19

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class whileLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int Dec=4;
	public static final int Maj=5;
	public static final int Min=6;
	public static final int Symbol=7;
	public static final int Variable=8;
	public static final int WS=9;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public whileLexer() {} 
	public whileLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public whileLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g"; }

	// $ANTLR start "T__10"
	public final void mT__10() throws RecognitionException {
		try {
			int _type = T__10;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:2:7: ( '%' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:2:9: '%'
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
	// $ANTLR end "T__10"

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:3:7: ( '(' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:3:9: '('
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
	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:4:7: ( ')' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:4:9: ')'
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
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:5:7: ( ',' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:5:9: ','
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
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:6:7: ( ':' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:6:9: ':'
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
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:7:7: ( ':=' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:7:9: ':='
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
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:8:7: ( ';' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:8:9: ';'
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
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:9:7: ( '=?' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:9:9: '=?'
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
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:10:7: ( 'cons ' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:10:9: 'cons '
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
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:11:7: ( 'do' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:11:9: 'do'
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
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:12:7: ( 'else' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:12:9: 'else'
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
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:13:7: ( 'fi' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:13:9: 'fi'
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
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:14:7: ( 'for' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:14:9: 'for'
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
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:15:7: ( 'foreach' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:15:9: 'foreach'
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
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:16:7: ( 'function ' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:16:9: 'function '
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
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:17:7: ( 'hd ' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:17:9: 'hd '
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
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:18:7: ( 'if' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:18:9: 'if'
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
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:19:7: ( 'in' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:19:9: 'in'
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
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:20:7: ( 'list ' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:20:9: 'list '
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
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:21:7: ( 'nil' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:21:9: 'nil'
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
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:22:7: ( 'nop' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:22:9: 'nop'
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
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:23:7: ( 'od' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:23:9: 'od'
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
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:24:7: ( 'read' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:24:9: 'read'
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
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:25:7: ( 'then' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:25:9: 'then'
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
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:26:7: ( 'tl ' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:26:9: 'tl '
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
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:27:7: ( 'while' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:27:9: 'while'
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
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:28:7: ( 'write ' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:28:9: 'write '
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
	// $ANTLR end "T__36"

	// $ANTLR start "Maj"
	public final void mMaj() throws RecognitionException {
		try {
			int _type = Maj;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:3:5: ( ( 'A' .. 'Z' ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:
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
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:4:5: ( ( 'a' .. 'z' ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:
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
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:5:5: ( ( '0' .. '9' ) )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:
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
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:6:4: ( ' ' )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:6:6: ' '
			{
			match(' '); 
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
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:8:9: ( Maj ( Maj | Min | Dec )* ( '!' | '?' )? )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:8:12: Maj ( Maj | Min | Dec )* ( '!' | '?' )?
			{
			mMaj(); 

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:8:16: ( Maj | Min | Dec )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:
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

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:8:30: ( '!' | '?' )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='!'||LA2_0=='?') ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:
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
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:9:8: ( Min ( Maj | Min | Dec )* ( '!' | '?' )? )
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:9:11: Min ( Maj | Min | Dec )* ( '!' | '?' )?
			{
			mMin(); 

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:9:15: ( Maj | Min | Dec )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:
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

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:9:29: ( '!' | '?' )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='!'||LA4_0=='?') ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:
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
		// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:1:8: ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | Maj | Min | Dec | WS | Variable | Symbol )
		int alt5=33;
		alt5 = dfa5.predict(input);
		switch (alt5) {
			case 1 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:1:10: T__10
				{
				mT__10(); 

				}
				break;
			case 2 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:1:16: T__11
				{
				mT__11(); 

				}
				break;
			case 3 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:1:22: T__12
				{
				mT__12(); 

				}
				break;
			case 4 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:1:28: T__13
				{
				mT__13(); 

				}
				break;
			case 5 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:1:34: T__14
				{
				mT__14(); 

				}
				break;
			case 6 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:1:40: T__15
				{
				mT__15(); 

				}
				break;
			case 7 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:1:46: T__16
				{
				mT__16(); 

				}
				break;
			case 8 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:1:52: T__17
				{
				mT__17(); 

				}
				break;
			case 9 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:1:58: T__18
				{
				mT__18(); 

				}
				break;
			case 10 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:1:64: T__19
				{
				mT__19(); 

				}
				break;
			case 11 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:1:70: T__20
				{
				mT__20(); 

				}
				break;
			case 12 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:1:76: T__21
				{
				mT__21(); 

				}
				break;
			case 13 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:1:82: T__22
				{
				mT__22(); 

				}
				break;
			case 14 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:1:88: T__23
				{
				mT__23(); 

				}
				break;
			case 15 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:1:94: T__24
				{
				mT__24(); 

				}
				break;
			case 16 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:1:100: T__25
				{
				mT__25(); 

				}
				break;
			case 17 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:1:106: T__26
				{
				mT__26(); 

				}
				break;
			case 18 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:1:112: T__27
				{
				mT__27(); 

				}
				break;
			case 19 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:1:118: T__28
				{
				mT__28(); 

				}
				break;
			case 20 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:1:124: T__29
				{
				mT__29(); 

				}
				break;
			case 21 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:1:130: T__30
				{
				mT__30(); 

				}
				break;
			case 22 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:1:136: T__31
				{
				mT__31(); 

				}
				break;
			case 23 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:1:142: T__32
				{
				mT__32(); 

				}
				break;
			case 24 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:1:148: T__33
				{
				mT__33(); 

				}
				break;
			case 25 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:1:154: T__34
				{
				mT__34(); 

				}
				break;
			case 26 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:1:160: T__35
				{
				mT__35(); 

				}
				break;
			case 27 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:1:166: T__36
				{
				mT__36(); 

				}
				break;
			case 28 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:1:172: Maj
				{
				mMaj(); 

				}
				break;
			case 29 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:1:176: Min
				{
				mMin(); 

				}
				break;
			case 30 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:1:180: Dec
				{
				mDec(); 

				}
				break;
			case 31 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:1:184: WS
				{
				mWS(); 

				}
				break;
			case 32 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:1:187: Variable
				{
				mVariable(); 

				}
				break;
			case 33 :
				// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:1:196: Symbol
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
		"\1\40\4\uffff\1\75\2\uffff\16\41\4\uffff\1\156\2\uffff\1\41\1\163\1\41"+
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
			"\1\27\4\uffff\1\1\2\uffff\1\2\1\3\2\uffff\1\4\3\uffff\12\26\1\5\1\6\1"+
			"\uffff\1\7\3\uffff\32\24\6\uffff\2\25\1\10\1\11\1\12\1\13\1\25\1\14\1"+
			"\15\2\25\1\16\1\25\1\17\1\20\2\25\1\21\1\25\1\22\2\25\1\23\3\25",
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
			return "1:1: Tokens : ( T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | Maj | Min | Dec | WS | Variable | Symbol );";
		}
	}

}

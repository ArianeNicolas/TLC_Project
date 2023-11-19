// $ANTLR 3.5.1 C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g 2023-11-19 21:56:19

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class whileParser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "Dec", "Maj", "Min", "Symbol", 
		"Variable", "WS", "'%'", "'('", "')'", "','", "':'", "':='", "';'", "'=?'", 
		"'cons '", "'do'", "'else'", "'fi'", "'for'", "'foreach'", "'function '", 
		"'hd '", "'if'", "'in'", "'list '", "'nil'", "'nop'", "'od'", "'read'", 
		"'then'", "'tl '", "'while'", "'write '"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "exprs", "commands", "program", "inputSub", "lExpr", "expression", 
		"startProgram", "input", "command", "definition", "output", "function", 
		"vars", "exprBase"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false, false, false, false, false, false, false, false, 
		    false, false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public whileParser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public whileParser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this, port, null);

		setDebugListener(proxy);
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
	}

	public whileParser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg, new RecognizerSharedState());
	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

	@Override public String[] getTokenNames() { return whileParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g"; }



	// $ANTLR start "program"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:11:1: program : function ( program )? ;
	public final void program() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "program");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(11, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:11:9: ( function ( program )? )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:11:11: function ( program )?
			{
			dbg.location(11,11);
			pushFollow(FOLLOW_function_in_program97);
			function();
			state._fsp--;
			dbg.location(11,20);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:11:20: ( program )?
			int alt1=2;
			try { dbg.enterSubRule(1);
			try { dbg.enterDecision(1, decisionCanBacktrack[1]);

			int LA1_0 = input.LA(1);
			if ( (LA1_0==24) ) {
				alt1=1;
			}
			} finally {dbg.exitDecision(1);}

			switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:11:20: program
					{
					dbg.location(11,20);
					pushFollow(FOLLOW_program_in_program99);
					program();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(1);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(11, 27);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "program");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "program"



	// $ANTLR start "function"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:12:1: function : 'function ' Symbol ( WS )? ':' definition ;
	public final void function() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "function");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(12, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:12:9: ( 'function ' Symbol ( WS )? ':' definition )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:12:12: 'function ' Symbol ( WS )? ':' definition
			{
			dbg.location(12,12);
			match(input,24,FOLLOW_24_in_function107); dbg.location(12,24);
			match(input,Symbol,FOLLOW_Symbol_in_function109); dbg.location(12,31);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:12:31: ( WS )?
			int alt2=2;
			try { dbg.enterSubRule(2);
			try { dbg.enterDecision(2, decisionCanBacktrack[2]);

			int LA2_0 = input.LA(1);
			if ( (LA2_0==WS) ) {
				alt2=1;
			}
			} finally {dbg.exitDecision(2);}

			switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:12:31: WS
					{
					dbg.location(12,31);
					match(input,WS,FOLLOW_WS_in_function111); 
					}
					break;

			}
			} finally {dbg.exitSubRule(2);}
			dbg.location(12,34);
			match(input,14,FOLLOW_14_in_function113); dbg.location(12,38);
			pushFollow(FOLLOW_definition_in_function115);
			definition();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(12, 47);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "function");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "function"



	// $ANTLR start "definition"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:13:1: definition : 'read' ( WS )? input '%' commands '%' 'write ' output ;
	public final void definition() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "definition");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(13, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:13:11: ( 'read' ( WS )? input '%' commands '%' 'write ' output )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:13:14: 'read' ( WS )? input '%' commands '%' 'write ' output
			{
			dbg.location(13,14);
			match(input,32,FOLLOW_32_in_definition122); dbg.location(13,22);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:13:22: ( WS )?
			int alt3=2;
			try { dbg.enterSubRule(3);
			try { dbg.enterDecision(3, decisionCanBacktrack[3]);

			int LA3_0 = input.LA(1);
			if ( (LA3_0==WS) ) {
				alt3=1;
			}
			} finally {dbg.exitDecision(3);}

			switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:13:22: WS
					{
					dbg.location(13,22);
					match(input,WS,FOLLOW_WS_in_definition125); 
					}
					break;

			}
			} finally {dbg.exitSubRule(3);}
			dbg.location(13,26);
			pushFollow(FOLLOW_input_in_definition128);
			input();
			state._fsp--;
			dbg.location(13,32);
			match(input,10,FOLLOW_10_in_definition130); dbg.location(13,36);
			pushFollow(FOLLOW_commands_in_definition132);
			commands();
			state._fsp--;
			dbg.location(13,45);
			match(input,10,FOLLOW_10_in_definition134); dbg.location(13,49);
			match(input,36,FOLLOW_36_in_definition136); dbg.location(13,58);
			pushFollow(FOLLOW_output_in_definition138);
			output();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(13, 63);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "definition");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "definition"



	// $ANTLR start "input"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:14:1: input : ( inputSub )? ;
	public final void input() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "input");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(14, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:14:7: ( ( inputSub )? )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:14:10: ( inputSub )?
			{
			dbg.location(14,10);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:14:10: ( inputSub )?
			int alt4=2;
			try { dbg.enterSubRule(4);
			try { dbg.enterDecision(4, decisionCanBacktrack[4]);

			int LA4_0 = input.LA(1);
			if ( (LA4_0==Variable) ) {
				alt4=1;
			}
			} finally {dbg.exitDecision(4);}

			switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:14:10: inputSub
					{
					dbg.location(14,10);
					pushFollow(FOLLOW_inputSub_in_input146);
					inputSub();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(4);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(14, 18);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "input");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "input"



	// $ANTLR start "inputSub"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:15:1: inputSub : Variable ( WS )? ( ',' ( WS )? inputSub )? ;
	public final void inputSub() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "inputSub");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(15, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:16:2: ( Variable ( WS )? ( ',' ( WS )? inputSub )? )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:16:4: Variable ( WS )? ( ',' ( WS )? inputSub )?
			{
			dbg.location(16,4);
			match(input,Variable,FOLLOW_Variable_in_inputSub156); dbg.location(16,13);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:16:13: ( WS )?
			int alt5=2;
			try { dbg.enterSubRule(5);
			try { dbg.enterDecision(5, decisionCanBacktrack[5]);

			int LA5_0 = input.LA(1);
			if ( (LA5_0==WS) ) {
				alt5=1;
			}
			} finally {dbg.exitDecision(5);}

			switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:16:13: WS
					{
					dbg.location(16,13);
					match(input,WS,FOLLOW_WS_in_inputSub158); 
					}
					break;

			}
			} finally {dbg.exitSubRule(5);}
			dbg.location(16,17);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:16:17: ( ',' ( WS )? inputSub )?
			int alt7=2;
			try { dbg.enterSubRule(7);
			try { dbg.enterDecision(7, decisionCanBacktrack[7]);

			int LA7_0 = input.LA(1);
			if ( (LA7_0==13) ) {
				alt7=1;
			}
			} finally {dbg.exitDecision(7);}

			switch (alt7) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:16:18: ',' ( WS )? inputSub
					{
					dbg.location(16,18);
					match(input,13,FOLLOW_13_in_inputSub162); dbg.location(16,21);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:16:21: ( WS )?
					int alt6=2;
					try { dbg.enterSubRule(6);
					try { dbg.enterDecision(6, decisionCanBacktrack[6]);

					int LA6_0 = input.LA(1);
					if ( (LA6_0==WS) ) {
						alt6=1;
					}
					} finally {dbg.exitDecision(6);}

					switch (alt6) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:16:21: WS
							{
							dbg.location(16,21);
							match(input,WS,FOLLOW_WS_in_inputSub163); 
							}
							break;

					}
					} finally {dbg.exitSubRule(6);}
					dbg.location(16,25);
					pushFollow(FOLLOW_inputSub_in_inputSub166);
					inputSub();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(7);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(16, 34);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "inputSub");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "inputSub"



	// $ANTLR start "output"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:17:1: output : Variable ( ',' output )? ;
	public final void output() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "output");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(17, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:17:9: ( Variable ( ',' output )? )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:17:11: Variable ( ',' output )?
			{
			dbg.location(17,11);
			match(input,Variable,FOLLOW_Variable_in_output176); dbg.location(17,20);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:17:20: ( ',' output )?
			int alt8=2;
			try { dbg.enterSubRule(8);
			try { dbg.enterDecision(8, decisionCanBacktrack[8]);

			int LA8_0 = input.LA(1);
			if ( (LA8_0==13) ) {
				alt8=1;
			}
			} finally {dbg.exitDecision(8);}

			switch (alt8) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:17:21: ',' output
					{
					dbg.location(17,21);
					match(input,13,FOLLOW_13_in_output179); dbg.location(17,25);
					pushFollow(FOLLOW_output_in_output181);
					output();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(8);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(17, 32);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "output");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "output"



	// $ANTLR start "commands"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:18:1: commands : command ( ';' commands )? ;
	public final void commands() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "commands");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(18, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:18:9: ( command ( ';' commands )? )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:18:11: command ( ';' commands )?
			{
			dbg.location(18,11);
			pushFollow(FOLLOW_command_in_commands189);
			command();
			state._fsp--;
			dbg.location(18,19);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:18:19: ( ';' commands )?
			int alt9=2;
			try { dbg.enterSubRule(9);
			try { dbg.enterDecision(9, decisionCanBacktrack[9]);

			int LA9_0 = input.LA(1);
			if ( (LA9_0==16) ) {
				alt9=1;
			}
			} finally {dbg.exitDecision(9);}

			switch (alt9) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:18:20: ';' commands
					{
					dbg.location(18,20);
					match(input,16,FOLLOW_16_in_commands192); dbg.location(18,24);
					pushFollow(FOLLOW_commands_in_commands194);
					commands();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(9);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(18, 33);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "commands");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "commands"



	// $ANTLR start "command"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:19:1: command : ( 'nop' | ( vars ( WS )? ':=' ( WS )? exprs ) | ( 'if' ( WS )? expression ( WS )? 'then' ( WS )? commands ( WS )? ( 'else' ( WS )? commands )? ( WS )? 'fi' ) | ( 'while' ( WS )? expression ( WS )? 'do' ( WS )? commands ( WS )? 'od' ) | ( 'for' ( WS )? expression ( WS )? 'do' ( WS )? commands ( WS )? 'od' ) | ( 'foreach' ( WS )? Variable ( WS )? 'in' ( WS )? expression ( WS )? 'do' ( WS )? commands ( WS )? 'od' ) );
	public final void command() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "command");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(19, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:20:2: ( 'nop' | ( vars ( WS )? ':=' ( WS )? exprs ) | ( 'if' ( WS )? expression ( WS )? 'then' ( WS )? commands ( WS )? ( 'else' ( WS )? commands )? ( WS )? 'fi' ) | ( 'while' ( WS )? expression ( WS )? 'do' ( WS )? commands ( WS )? 'od' ) | ( 'for' ( WS )? expression ( WS )? 'do' ( WS )? commands ( WS )? 'od' ) | ( 'foreach' ( WS )? Variable ( WS )? 'in' ( WS )? expression ( WS )? 'do' ( WS )? commands ( WS )? 'od' ) )
			int alt33=6;
			try { dbg.enterDecision(33, decisionCanBacktrack[33]);

			switch ( input.LA(1) ) {
			case 30:
				{
				alt33=1;
				}
				break;
			case Variable:
				{
				alt33=2;
				}
				break;
			case 26:
				{
				alt33=3;
				}
				break;
			case 35:
				{
				alt33=4;
				}
				break;
			case 22:
				{
				alt33=5;
				}
				break;
			case 23:
				{
				alt33=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 33, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(33);}

			switch (alt33) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:20:5: 'nop'
					{
					dbg.location(20,5);
					match(input,30,FOLLOW_30_in_command206); 
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:21:3: ( vars ( WS )? ':=' ( WS )? exprs )
					{
					dbg.location(21,3);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:21:3: ( vars ( WS )? ':=' ( WS )? exprs )
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:21:4: vars ( WS )? ':=' ( WS )? exprs
					{
					dbg.location(21,4);
					pushFollow(FOLLOW_vars_in_command212);
					vars();
					state._fsp--;
					dbg.location(21,9);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:21:9: ( WS )?
					int alt10=2;
					try { dbg.enterSubRule(10);
					try { dbg.enterDecision(10, decisionCanBacktrack[10]);

					int LA10_0 = input.LA(1);
					if ( (LA10_0==WS) ) {
						alt10=1;
					}
					} finally {dbg.exitDecision(10);}

					switch (alt10) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:21:9: WS
							{
							dbg.location(21,9);
							match(input,WS,FOLLOW_WS_in_command214); 
							}
							break;

					}
					} finally {dbg.exitSubRule(10);}
					dbg.location(21,12);
					match(input,15,FOLLOW_15_in_command216); dbg.location(21,16);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:21:16: ( WS )?
					int alt11=2;
					try { dbg.enterSubRule(11);
					try { dbg.enterDecision(11, decisionCanBacktrack[11]);

					int LA11_0 = input.LA(1);
					if ( (LA11_0==WS) ) {
						alt11=1;
					}
					} finally {dbg.exitDecision(11);}

					switch (alt11) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:21:16: WS
							{
							dbg.location(21,16);
							match(input,WS,FOLLOW_WS_in_command217); 
							}
							break;

					}
					} finally {dbg.exitSubRule(11);}
					dbg.location(21,20);
					pushFollow(FOLLOW_exprs_in_command220);
					exprs();
					state._fsp--;

					}

					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:22:3: ( 'if' ( WS )? expression ( WS )? 'then' ( WS )? commands ( WS )? ( 'else' ( WS )? commands )? ( WS )? 'fi' )
					{
					dbg.location(22,3);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:22:3: ( 'if' ( WS )? expression ( WS )? 'then' ( WS )? commands ( WS )? ( 'else' ( WS )? commands )? ( WS )? 'fi' )
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:22:4: 'if' ( WS )? expression ( WS )? 'then' ( WS )? commands ( WS )? ( 'else' ( WS )? commands )? ( WS )? 'fi'
					{
					dbg.location(22,4);
					match(input,26,FOLLOW_26_in_command227); dbg.location(22,9);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:22:9: ( WS )?
					int alt12=2;
					try { dbg.enterSubRule(12);
					try { dbg.enterDecision(12, decisionCanBacktrack[12]);

					int LA12_0 = input.LA(1);
					if ( (LA12_0==WS) ) {
						alt12=1;
					}
					} finally {dbg.exitDecision(12);}

					switch (alt12) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:22:9: WS
							{
							dbg.location(22,9);
							match(input,WS,FOLLOW_WS_in_command229); 
							}
							break;

					}
					} finally {dbg.exitSubRule(12);}
					dbg.location(22,14);
					pushFollow(FOLLOW_expression_in_command233);
					expression();
					state._fsp--;
					dbg.location(22,26);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:22:26: ( WS )?
					int alt13=2;
					try { dbg.enterSubRule(13);
					try { dbg.enterDecision(13, decisionCanBacktrack[13]);

					int LA13_0 = input.LA(1);
					if ( (LA13_0==WS) ) {
						alt13=1;
					}
					} finally {dbg.exitDecision(13);}

					switch (alt13) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:22:26: WS
							{
							dbg.location(22,26);
							match(input,WS,FOLLOW_WS_in_command236); 
							}
							break;

					}
					} finally {dbg.exitSubRule(13);}
					dbg.location(22,30);
					match(input,33,FOLLOW_33_in_command239); dbg.location(22,37);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:22:37: ( WS )?
					int alt14=2;
					try { dbg.enterSubRule(14);
					try { dbg.enterDecision(14, decisionCanBacktrack[14]);

					int LA14_0 = input.LA(1);
					if ( (LA14_0==WS) ) {
						alt14=1;
					}
					} finally {dbg.exitDecision(14);}

					switch (alt14) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:22:37: WS
							{
							dbg.location(22,37);
							match(input,WS,FOLLOW_WS_in_command241); 
							}
							break;

					}
					} finally {dbg.exitSubRule(14);}
					dbg.location(22,41);
					pushFollow(FOLLOW_commands_in_command244);
					commands();
					state._fsp--;
					dbg.location(22,51);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:22:51: ( WS )?
					int alt15=2;
					try { dbg.enterSubRule(15);
					try { dbg.enterDecision(15, decisionCanBacktrack[15]);

					int LA15_0 = input.LA(1);
					if ( (LA15_0==WS) ) {
						alt15=1;
					}
					} finally {dbg.exitDecision(15);}

					switch (alt15) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:22:51: WS
							{
							dbg.location(22,51);
							match(input,WS,FOLLOW_WS_in_command247); 
							}
							break;

					}
					} finally {dbg.exitSubRule(15);}
					dbg.location(22,55);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:22:55: ( 'else' ( WS )? commands )?
					int alt17=2;
					try { dbg.enterSubRule(17);
					try { dbg.enterDecision(17, decisionCanBacktrack[17]);

					int LA17_0 = input.LA(1);
					if ( (LA17_0==20) ) {
						alt17=1;
					}
					} finally {dbg.exitDecision(17);}

					switch (alt17) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:22:56: 'else' ( WS )? commands
							{
							dbg.location(22,56);
							match(input,20,FOLLOW_20_in_command251); dbg.location(22,63);
							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:22:63: ( WS )?
							int alt16=2;
							try { dbg.enterSubRule(16);
							try { dbg.enterDecision(16, decisionCanBacktrack[16]);

							int LA16_0 = input.LA(1);
							if ( (LA16_0==WS) ) {
								alt16=1;
							}
							} finally {dbg.exitDecision(16);}

							switch (alt16) {
								case 1 :
									dbg.enterAlt(1);

									// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:22:63: WS
									{
									dbg.location(22,63);
									match(input,WS,FOLLOW_WS_in_command253); 
									}
									break;

							}
							} finally {dbg.exitSubRule(16);}
							dbg.location(22,67);
							pushFollow(FOLLOW_commands_in_command256);
							commands();
							state._fsp--;

							}
							break;

					}
					} finally {dbg.exitSubRule(17);}
					dbg.location(22,79);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:22:79: ( WS )?
					int alt18=2;
					try { dbg.enterSubRule(18);
					try { dbg.enterDecision(18, decisionCanBacktrack[18]);

					int LA18_0 = input.LA(1);
					if ( (LA18_0==WS) ) {
						alt18=1;
					}
					} finally {dbg.exitDecision(18);}

					switch (alt18) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:22:79: WS
							{
							dbg.location(22,79);
							match(input,WS,FOLLOW_WS_in_command261); 
							}
							break;

					}
					} finally {dbg.exitSubRule(18);}
					dbg.location(22,83);
					match(input,21,FOLLOW_21_in_command264); 
					}

					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:23:3: ( 'while' ( WS )? expression ( WS )? 'do' ( WS )? commands ( WS )? 'od' )
					{
					dbg.location(23,3);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:23:3: ( 'while' ( WS )? expression ( WS )? 'do' ( WS )? commands ( WS )? 'od' )
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:23:4: 'while' ( WS )? expression ( WS )? 'do' ( WS )? commands ( WS )? 'od'
					{
					dbg.location(23,4);
					match(input,35,FOLLOW_35_in_command271); dbg.location(23,12);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:23:12: ( WS )?
					int alt19=2;
					try { dbg.enterSubRule(19);
					try { dbg.enterDecision(19, decisionCanBacktrack[19]);

					int LA19_0 = input.LA(1);
					if ( (LA19_0==WS) ) {
						alt19=1;
					}
					} finally {dbg.exitDecision(19);}

					switch (alt19) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:23:12: WS
							{
							dbg.location(23,12);
							match(input,WS,FOLLOW_WS_in_command273); 
							}
							break;

					}
					} finally {dbg.exitSubRule(19);}
					dbg.location(23,16);
					pushFollow(FOLLOW_expression_in_command276);
					expression();
					state._fsp--;
					dbg.location(23,28);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:23:28: ( WS )?
					int alt20=2;
					try { dbg.enterSubRule(20);
					try { dbg.enterDecision(20, decisionCanBacktrack[20]);

					int LA20_0 = input.LA(1);
					if ( (LA20_0==WS) ) {
						alt20=1;
					}
					} finally {dbg.exitDecision(20);}

					switch (alt20) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:23:28: WS
							{
							dbg.location(23,28);
							match(input,WS,FOLLOW_WS_in_command279); 
							}
							break;

					}
					} finally {dbg.exitSubRule(20);}
					dbg.location(23,32);
					match(input,19,FOLLOW_19_in_command282); dbg.location(23,37);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:23:37: ( WS )?
					int alt21=2;
					try { dbg.enterSubRule(21);
					try { dbg.enterDecision(21, decisionCanBacktrack[21]);

					int LA21_0 = input.LA(1);
					if ( (LA21_0==WS) ) {
						alt21=1;
					}
					} finally {dbg.exitDecision(21);}

					switch (alt21) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:23:37: WS
							{
							dbg.location(23,37);
							match(input,WS,FOLLOW_WS_in_command284); 
							}
							break;

					}
					} finally {dbg.exitSubRule(21);}
					dbg.location(23,41);
					pushFollow(FOLLOW_commands_in_command287);
					commands();
					state._fsp--;
					dbg.location(23,51);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:23:51: ( WS )?
					int alt22=2;
					try { dbg.enterSubRule(22);
					try { dbg.enterDecision(22, decisionCanBacktrack[22]);

					int LA22_0 = input.LA(1);
					if ( (LA22_0==WS) ) {
						alt22=1;
					}
					} finally {dbg.exitDecision(22);}

					switch (alt22) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:23:51: WS
							{
							dbg.location(23,51);
							match(input,WS,FOLLOW_WS_in_command290); 
							}
							break;

					}
					} finally {dbg.exitSubRule(22);}
					dbg.location(23,55);
					match(input,31,FOLLOW_31_in_command293); 
					}

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:24:3: ( 'for' ( WS )? expression ( WS )? 'do' ( WS )? commands ( WS )? 'od' )
					{
					dbg.location(24,3);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:24:3: ( 'for' ( WS )? expression ( WS )? 'do' ( WS )? commands ( WS )? 'od' )
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:24:4: 'for' ( WS )? expression ( WS )? 'do' ( WS )? commands ( WS )? 'od'
					{
					dbg.location(24,4);
					match(input,22,FOLLOW_22_in_command300); dbg.location(24,10);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:24:10: ( WS )?
					int alt23=2;
					try { dbg.enterSubRule(23);
					try { dbg.enterDecision(23, decisionCanBacktrack[23]);

					int LA23_0 = input.LA(1);
					if ( (LA23_0==WS) ) {
						alt23=1;
					}
					} finally {dbg.exitDecision(23);}

					switch (alt23) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:24:10: WS
							{
							dbg.location(24,10);
							match(input,WS,FOLLOW_WS_in_command302); 
							}
							break;

					}
					} finally {dbg.exitSubRule(23);}
					dbg.location(24,15);
					pushFollow(FOLLOW_expression_in_command306);
					expression();
					state._fsp--;
					dbg.location(24,26);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:24:26: ( WS )?
					int alt24=2;
					try { dbg.enterSubRule(24);
					try { dbg.enterDecision(24, decisionCanBacktrack[24]);

					int LA24_0 = input.LA(1);
					if ( (LA24_0==WS) ) {
						alt24=1;
					}
					} finally {dbg.exitDecision(24);}

					switch (alt24) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:24:26: WS
							{
							dbg.location(24,26);
							match(input,WS,FOLLOW_WS_in_command308); 
							}
							break;

					}
					} finally {dbg.exitSubRule(24);}
					dbg.location(24,30);
					match(input,19,FOLLOW_19_in_command311); dbg.location(24,35);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:24:35: ( WS )?
					int alt25=2;
					try { dbg.enterSubRule(25);
					try { dbg.enterDecision(25, decisionCanBacktrack[25]);

					int LA25_0 = input.LA(1);
					if ( (LA25_0==WS) ) {
						alt25=1;
					}
					} finally {dbg.exitDecision(25);}

					switch (alt25) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:24:35: WS
							{
							dbg.location(24,35);
							match(input,WS,FOLLOW_WS_in_command313); 
							}
							break;

					}
					} finally {dbg.exitSubRule(25);}
					dbg.location(24,39);
					pushFollow(FOLLOW_commands_in_command316);
					commands();
					state._fsp--;
					dbg.location(24,49);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:24:49: ( WS )?
					int alt26=2;
					try { dbg.enterSubRule(26);
					try { dbg.enterDecision(26, decisionCanBacktrack[26]);

					int LA26_0 = input.LA(1);
					if ( (LA26_0==WS) ) {
						alt26=1;
					}
					} finally {dbg.exitDecision(26);}

					switch (alt26) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:24:49: WS
							{
							dbg.location(24,49);
							match(input,WS,FOLLOW_WS_in_command319); 
							}
							break;

					}
					} finally {dbg.exitSubRule(26);}
					dbg.location(24,53);
					match(input,31,FOLLOW_31_in_command322); 
					}

					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:25:3: ( 'foreach' ( WS )? Variable ( WS )? 'in' ( WS )? expression ( WS )? 'do' ( WS )? commands ( WS )? 'od' )
					{
					dbg.location(25,3);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:25:3: ( 'foreach' ( WS )? Variable ( WS )? 'in' ( WS )? expression ( WS )? 'do' ( WS )? commands ( WS )? 'od' )
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:25:4: 'foreach' ( WS )? Variable ( WS )? 'in' ( WS )? expression ( WS )? 'do' ( WS )? commands ( WS )? 'od'
					{
					dbg.location(25,4);
					match(input,23,FOLLOW_23_in_command329); dbg.location(25,14);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:25:14: ( WS )?
					int alt27=2;
					try { dbg.enterSubRule(27);
					try { dbg.enterDecision(27, decisionCanBacktrack[27]);

					int LA27_0 = input.LA(1);
					if ( (LA27_0==WS) ) {
						alt27=1;
					}
					} finally {dbg.exitDecision(27);}

					switch (alt27) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:25:14: WS
							{
							dbg.location(25,14);
							match(input,WS,FOLLOW_WS_in_command331); 
							}
							break;

					}
					} finally {dbg.exitSubRule(27);}
					dbg.location(25,18);
					match(input,Variable,FOLLOW_Variable_in_command334); dbg.location(25,27);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:25:27: ( WS )?
					int alt28=2;
					try { dbg.enterSubRule(28);
					try { dbg.enterDecision(28, decisionCanBacktrack[28]);

					int LA28_0 = input.LA(1);
					if ( (LA28_0==WS) ) {
						alt28=1;
					}
					} finally {dbg.exitDecision(28);}

					switch (alt28) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:25:27: WS
							{
							dbg.location(25,27);
							match(input,WS,FOLLOW_WS_in_command336); 
							}
							break;

					}
					} finally {dbg.exitSubRule(28);}
					dbg.location(25,31);
					match(input,27,FOLLOW_27_in_command339); dbg.location(25,36);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:25:36: ( WS )?
					int alt29=2;
					try { dbg.enterSubRule(29);
					try { dbg.enterDecision(29, decisionCanBacktrack[29]);

					int LA29_0 = input.LA(1);
					if ( (LA29_0==WS) ) {
						alt29=1;
					}
					} finally {dbg.exitDecision(29);}

					switch (alt29) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:25:36: WS
							{
							dbg.location(25,36);
							match(input,WS,FOLLOW_WS_in_command341); 
							}
							break;

					}
					} finally {dbg.exitSubRule(29);}
					dbg.location(25,40);
					pushFollow(FOLLOW_expression_in_command344);
					expression();
					state._fsp--;
					dbg.location(25,51);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:25:51: ( WS )?
					int alt30=2;
					try { dbg.enterSubRule(30);
					try { dbg.enterDecision(30, decisionCanBacktrack[30]);

					int LA30_0 = input.LA(1);
					if ( (LA30_0==WS) ) {
						alt30=1;
					}
					} finally {dbg.exitDecision(30);}

					switch (alt30) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:25:51: WS
							{
							dbg.location(25,51);
							match(input,WS,FOLLOW_WS_in_command346); 
							}
							break;

					}
					} finally {dbg.exitSubRule(30);}
					dbg.location(25,55);
					match(input,19,FOLLOW_19_in_command349); dbg.location(25,60);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:25:60: ( WS )?
					int alt31=2;
					try { dbg.enterSubRule(31);
					try { dbg.enterDecision(31, decisionCanBacktrack[31]);

					int LA31_0 = input.LA(1);
					if ( (LA31_0==WS) ) {
						alt31=1;
					}
					} finally {dbg.exitDecision(31);}

					switch (alt31) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:25:60: WS
							{
							dbg.location(25,60);
							match(input,WS,FOLLOW_WS_in_command351); 
							}
							break;

					}
					} finally {dbg.exitSubRule(31);}
					dbg.location(25,64);
					pushFollow(FOLLOW_commands_in_command354);
					commands();
					state._fsp--;
					dbg.location(25,73);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:25:73: ( WS )?
					int alt32=2;
					try { dbg.enterSubRule(32);
					try { dbg.enterDecision(32, decisionCanBacktrack[32]);

					int LA32_0 = input.LA(1);
					if ( (LA32_0==WS) ) {
						alt32=1;
					}
					} finally {dbg.exitDecision(32);}

					switch (alt32) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:25:73: WS
							{
							dbg.location(25,73);
							match(input,WS,FOLLOW_WS_in_command356); 
							}
							break;

					}
					} finally {dbg.exitSubRule(32);}
					dbg.location(25,77);
					match(input,31,FOLLOW_31_in_command359); 
					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(25, 81);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "command");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "command"



	// $ANTLR start "vars"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:27:1: vars : Variable ( ',' vars )? ;
	public final void vars() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "vars");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(27, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:27:7: ( Variable ( ',' vars )? )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:27:9: Variable ( ',' vars )?
			{
			dbg.location(27,9);
			match(input,Variable,FOLLOW_Variable_in_vars371); dbg.location(27,18);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:27:18: ( ',' vars )?
			int alt34=2;
			try { dbg.enterSubRule(34);
			try { dbg.enterDecision(34, decisionCanBacktrack[34]);

			int LA34_0 = input.LA(1);
			if ( (LA34_0==13) ) {
				alt34=1;
			}
			} finally {dbg.exitDecision(34);}

			switch (alt34) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:27:19: ',' vars
					{
					dbg.location(27,19);
					match(input,13,FOLLOW_13_in_vars374); dbg.location(27,23);
					pushFollow(FOLLOW_vars_in_vars376);
					vars();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(34);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(27, 28);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "vars");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "vars"



	// $ANTLR start "exprs"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:29:1: exprs : expression ( ',' exprs )? ;
	public final void exprs() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "exprs");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(29, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:29:7: ( expression ( ',' exprs )? )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:29:9: expression ( ',' exprs )?
			{
			dbg.location(29,9);
			pushFollow(FOLLOW_expression_in_exprs386);
			expression();
			state._fsp--;
			dbg.location(29,20);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:29:20: ( ',' exprs )?
			int alt35=2;
			try { dbg.enterSubRule(35);
			try { dbg.enterDecision(35, decisionCanBacktrack[35]);

			int LA35_0 = input.LA(1);
			if ( (LA35_0==13) ) {
				alt35=1;
			}
			} finally {dbg.exitDecision(35);}

			switch (alt35) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:29:21: ',' exprs
					{
					dbg.location(29,21);
					match(input,13,FOLLOW_13_in_exprs389); dbg.location(29,25);
					pushFollow(FOLLOW_exprs_in_exprs391);
					exprs();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(35);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(29, 31);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "exprs");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "exprs"



	// $ANTLR start "exprBase"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:31:1: exprBase : ( 'nil' ( WS )? | Variable | Symbol | ( '(' 'cons ' lExpr ')' ) | ( '(' 'list ' lExpr ')' ) | ( '(' 'hd ' exprBase ')' ) | ( '(' 'tl ' exprBase ')' ) | ( '(' Symbol ( WS )? lExpr ')' ) );
	public final void exprBase() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "exprBase");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(31, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:31:9: ( 'nil' ( WS )? | Variable | Symbol | ( '(' 'cons ' lExpr ')' ) | ( '(' 'list ' lExpr ')' ) | ( '(' 'hd ' exprBase ')' ) | ( '(' 'tl ' exprBase ')' ) | ( '(' Symbol ( WS )? lExpr ')' ) )
			int alt38=8;
			try { dbg.enterDecision(38, decisionCanBacktrack[38]);

			switch ( input.LA(1) ) {
			case 29:
				{
				alt38=1;
				}
				break;
			case Variable:
				{
				alt38=2;
				}
				break;
			case Symbol:
				{
				alt38=3;
				}
				break;
			case 11:
				{
				switch ( input.LA(2) ) {
				case 18:
					{
					alt38=4;
					}
					break;
				case 28:
					{
					alt38=5;
					}
					break;
				case 25:
					{
					alt38=6;
					}
					break;
				case 34:
					{
					alt38=7;
					}
					break;
				case Symbol:
					{
					alt38=8;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 38, 4, input);
						dbg.recognitionException(nvae);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 38, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}
			} finally {dbg.exitDecision(38);}

			switch (alt38) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:31:12: 'nil' ( WS )?
					{
					dbg.location(31,12);
					match(input,29,FOLLOW_29_in_exprBase401); dbg.location(31,17);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:31:17: ( WS )?
					int alt36=2;
					try { dbg.enterSubRule(36);
					try { dbg.enterDecision(36, decisionCanBacktrack[36]);

					int LA36_0 = input.LA(1);
					if ( (LA36_0==WS) ) {
						alt36=1;
					}
					} finally {dbg.exitDecision(36);}

					switch (alt36) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:31:17: WS
							{
							dbg.location(31,17);
							match(input,WS,FOLLOW_WS_in_exprBase402); 
							}
							break;

					}
					} finally {dbg.exitSubRule(36);}

					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:32:3: Variable
					{
					dbg.location(32,3);
					match(input,Variable,FOLLOW_Variable_in_exprBase410); 
					}
					break;
				case 3 :
					dbg.enterAlt(3);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:33:3: Symbol
					{
					dbg.location(33,3);
					match(input,Symbol,FOLLOW_Symbol_in_exprBase416); 
					}
					break;
				case 4 :
					dbg.enterAlt(4);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:34:3: ( '(' 'cons ' lExpr ')' )
					{
					dbg.location(34,3);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:34:3: ( '(' 'cons ' lExpr ')' )
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:34:4: '(' 'cons ' lExpr ')'
					{
					dbg.location(34,4);
					match(input,11,FOLLOW_11_in_exprBase422); dbg.location(34,8);
					match(input,18,FOLLOW_18_in_exprBase424); dbg.location(34,16);
					pushFollow(FOLLOW_lExpr_in_exprBase426);
					lExpr();
					state._fsp--;
					dbg.location(34,22);
					match(input,12,FOLLOW_12_in_exprBase428); 
					}

					}
					break;
				case 5 :
					dbg.enterAlt(5);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:34:29: ( '(' 'list ' lExpr ')' )
					{
					dbg.location(34,29);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:34:29: ( '(' 'list ' lExpr ')' )
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:34:30: '(' 'list ' lExpr ')'
					{
					dbg.location(34,30);
					match(input,11,FOLLOW_11_in_exprBase434); dbg.location(34,34);
					match(input,28,FOLLOW_28_in_exprBase436); dbg.location(34,42);
					pushFollow(FOLLOW_lExpr_in_exprBase438);
					lExpr();
					state._fsp--;
					dbg.location(34,48);
					match(input,12,FOLLOW_12_in_exprBase440); 
					}

					}
					break;
				case 6 :
					dbg.enterAlt(6);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:35:3: ( '(' 'hd ' exprBase ')' )
					{
					dbg.location(35,3);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:35:3: ( '(' 'hd ' exprBase ')' )
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:35:4: '(' 'hd ' exprBase ')'
					{
					dbg.location(35,4);
					match(input,11,FOLLOW_11_in_exprBase447); dbg.location(35,8);
					match(input,25,FOLLOW_25_in_exprBase449); dbg.location(35,14);
					pushFollow(FOLLOW_exprBase_in_exprBase451);
					exprBase();
					state._fsp--;
					dbg.location(35,23);
					match(input,12,FOLLOW_12_in_exprBase453); 
					}

					}
					break;
				case 7 :
					dbg.enterAlt(7);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:35:30: ( '(' 'tl ' exprBase ')' )
					{
					dbg.location(35,30);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:35:30: ( '(' 'tl ' exprBase ')' )
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:35:31: '(' 'tl ' exprBase ')'
					{
					dbg.location(35,31);
					match(input,11,FOLLOW_11_in_exprBase459); dbg.location(35,35);
					match(input,34,FOLLOW_34_in_exprBase461); dbg.location(35,41);
					pushFollow(FOLLOW_exprBase_in_exprBase463);
					exprBase();
					state._fsp--;
					dbg.location(35,50);
					match(input,12,FOLLOW_12_in_exprBase465); 
					}

					}
					break;
				case 8 :
					dbg.enterAlt(8);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:36:3: ( '(' Symbol ( WS )? lExpr ')' )
					{
					dbg.location(36,3);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:36:3: ( '(' Symbol ( WS )? lExpr ')' )
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:36:4: '(' Symbol ( WS )? lExpr ')'
					{
					dbg.location(36,4);
					match(input,11,FOLLOW_11_in_exprBase472); dbg.location(36,8);
					match(input,Symbol,FOLLOW_Symbol_in_exprBase474); dbg.location(36,15);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:36:15: ( WS )?
					int alt37=2;
					try { dbg.enterSubRule(37);
					try { dbg.enterDecision(37, decisionCanBacktrack[37]);

					int LA37_0 = input.LA(1);
					if ( (LA37_0==WS) ) {
						alt37=1;
					}
					} finally {dbg.exitDecision(37);}

					switch (alt37) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:36:15: WS
							{
							dbg.location(36,15);
							match(input,WS,FOLLOW_WS_in_exprBase476); 
							}
							break;

					}
					} finally {dbg.exitSubRule(37);}
					dbg.location(36,19);
					pushFollow(FOLLOW_lExpr_in_exprBase479);
					lExpr();
					state._fsp--;
					dbg.location(36,25);
					match(input,12,FOLLOW_12_in_exprBase481); 
					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(36, 28);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "exprBase");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "exprBase"



	// $ANTLR start "expression"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:38:1: expression : exprBase ( WS )? ( '=?' ( WS )? exprBase )? ;
	public final void expression() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "expression");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(38, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:39:2: ( exprBase ( WS )? ( '=?' ( WS )? exprBase )? )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:39:4: exprBase ( WS )? ( '=?' ( WS )? exprBase )?
			{
			dbg.location(39,4);
			pushFollow(FOLLOW_exprBase_in_expression492);
			exprBase();
			state._fsp--;
			dbg.location(39,13);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:39:13: ( WS )?
			int alt39=2;
			try { dbg.enterSubRule(39);
			try { dbg.enterDecision(39, decisionCanBacktrack[39]);

			int LA39_0 = input.LA(1);
			if ( (LA39_0==WS) ) {
				alt39=1;
			}
			} finally {dbg.exitDecision(39);}

			switch (alt39) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:39:13: WS
					{
					dbg.location(39,13);
					match(input,WS,FOLLOW_WS_in_expression494); 
					}
					break;

			}
			} finally {dbg.exitSubRule(39);}
			dbg.location(39,16);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:39:16: ( '=?' ( WS )? exprBase )?
			int alt41=2;
			try { dbg.enterSubRule(41);
			try { dbg.enterDecision(41, decisionCanBacktrack[41]);

			int LA41_0 = input.LA(1);
			if ( (LA41_0==17) ) {
				alt41=1;
			}
			} finally {dbg.exitDecision(41);}

			switch (alt41) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:39:17: '=?' ( WS )? exprBase
					{
					dbg.location(39,17);
					match(input,17,FOLLOW_17_in_expression497); dbg.location(39,22);
					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:39:22: ( WS )?
					int alt40=2;
					try { dbg.enterSubRule(40);
					try { dbg.enterDecision(40, decisionCanBacktrack[40]);

					int LA40_0 = input.LA(1);
					if ( (LA40_0==WS) ) {
						alt40=1;
					}
					} finally {dbg.exitDecision(40);}

					switch (alt40) {
						case 1 :
							dbg.enterAlt(1);

							// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:39:22: WS
							{
							dbg.location(39,22);
							match(input,WS,FOLLOW_WS_in_expression499); 
							}
							break;

					}
					} finally {dbg.exitSubRule(40);}
					dbg.location(39,26);
					pushFollow(FOLLOW_exprBase_in_expression502);
					exprBase();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(41);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(39, 35);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expression");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "expression"



	// $ANTLR start "lExpr"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:41:1: lExpr : exprBase ( WS )? ( lExpr )? ;
	public final void lExpr() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "lExpr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(41, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:41:7: ( exprBase ( WS )? ( lExpr )? )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:41:9: exprBase ( WS )? ( lExpr )?
			{
			dbg.location(41,9);
			pushFollow(FOLLOW_exprBase_in_lExpr512);
			exprBase();
			state._fsp--;
			dbg.location(41,19);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:41:19: ( WS )?
			int alt42=2;
			try { dbg.enterSubRule(42);
			try { dbg.enterDecision(42, decisionCanBacktrack[42]);

			int LA42_0 = input.LA(1);
			if ( (LA42_0==WS) ) {
				alt42=1;
			}
			} finally {dbg.exitDecision(42);}

			switch (alt42) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:41:19: WS
					{
					dbg.location(41,19);
					match(input,WS,FOLLOW_WS_in_lExpr515); 
					}
					break;

			}
			} finally {dbg.exitSubRule(42);}
			dbg.location(41,23);
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:41:23: ( lExpr )?
			int alt43=2;
			try { dbg.enterSubRule(43);
			try { dbg.enterDecision(43, decisionCanBacktrack[43]);

			int LA43_0 = input.LA(1);
			if ( ((LA43_0 >= Symbol && LA43_0 <= Variable)||LA43_0==11||LA43_0==29) ) {
				alt43=1;
			}
			} finally {dbg.exitDecision(43);}

			switch (alt43) {
				case 1 :
					dbg.enterAlt(1);

					// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:41:23: lExpr
					{
					dbg.location(41,23);
					pushFollow(FOLLOW_lExpr_in_lExpr518);
					lExpr();
					state._fsp--;

					}
					break;

			}
			} finally {dbg.exitSubRule(43);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(41, 28);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "lExpr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "lExpr"



	// $ANTLR start "startProgram"
	// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:43:1: startProgram : program ;
	public final void startProgram() throws RecognitionException {
		try { dbg.enterRule(getGrammarFileName(), "startProgram");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(43, 0);

		try {
			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:44:2: ( program )
			dbg.enterAlt(1);

			// C:\\Users\\Axel\\OneDrive\\Documents\\tlc-projet\\while_grammar\\while.g:44:4: program
			{
			dbg.location(44,4);
			pushFollow(FOLLOW_program_in_startProgram528);
			program();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(44, 10);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "startProgram");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "startProgram"

	// Delegated rules



	public static final BitSet FOLLOW_function_in_program97 = new BitSet(new long[]{0x0000000001000002L});
	public static final BitSet FOLLOW_program_in_program99 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_function107 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_Symbol_in_function109 = new BitSet(new long[]{0x0000000000004200L});
	public static final BitSet FOLLOW_WS_in_function111 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_function113 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_definition_in_function115 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_definition122 = new BitSet(new long[]{0x0000000000000700L});
	public static final BitSet FOLLOW_WS_in_definition125 = new BitSet(new long[]{0x0000000000000500L});
	public static final BitSet FOLLOW_input_in_definition128 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_definition130 = new BitSet(new long[]{0x0000000844C00100L});
	public static final BitSet FOLLOW_commands_in_definition132 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_definition134 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_definition136 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_output_in_definition138 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inputSub_in_input146 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_inputSub156 = new BitSet(new long[]{0x0000000000002202L});
	public static final BitSet FOLLOW_WS_in_inputSub158 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_13_in_inputSub162 = new BitSet(new long[]{0x0000000000000300L});
	public static final BitSet FOLLOW_WS_in_inputSub163 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_inputSub_in_inputSub166 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_output176 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_13_in_output179 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_output_in_output181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_command_in_commands189 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_16_in_commands192 = new BitSet(new long[]{0x0000000844C00100L});
	public static final BitSet FOLLOW_commands_in_commands194 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_command206 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_vars_in_command212 = new BitSet(new long[]{0x0000000000008200L});
	public static final BitSet FOLLOW_WS_in_command214 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_command216 = new BitSet(new long[]{0x0000000020000B80L});
	public static final BitSet FOLLOW_WS_in_command217 = new BitSet(new long[]{0x0000000020000980L});
	public static final BitSet FOLLOW_exprs_in_command220 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_command227 = new BitSet(new long[]{0x0000000020000B80L});
	public static final BitSet FOLLOW_WS_in_command229 = new BitSet(new long[]{0x0000000020000980L});
	public static final BitSet FOLLOW_expression_in_command233 = new BitSet(new long[]{0x0000000200000200L});
	public static final BitSet FOLLOW_WS_in_command236 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_33_in_command239 = new BitSet(new long[]{0x0000000844C00300L});
	public static final BitSet FOLLOW_WS_in_command241 = new BitSet(new long[]{0x0000000844C00100L});
	public static final BitSet FOLLOW_commands_in_command244 = new BitSet(new long[]{0x0000000000300200L});
	public static final BitSet FOLLOW_WS_in_command247 = new BitSet(new long[]{0x0000000000300200L});
	public static final BitSet FOLLOW_20_in_command251 = new BitSet(new long[]{0x0000000844C00300L});
	public static final BitSet FOLLOW_WS_in_command253 = new BitSet(new long[]{0x0000000844C00100L});
	public static final BitSet FOLLOW_commands_in_command256 = new BitSet(new long[]{0x0000000000200200L});
	public static final BitSet FOLLOW_WS_in_command261 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_command264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_35_in_command271 = new BitSet(new long[]{0x0000000020000B80L});
	public static final BitSet FOLLOW_WS_in_command273 = new BitSet(new long[]{0x0000000020000980L});
	public static final BitSet FOLLOW_expression_in_command276 = new BitSet(new long[]{0x0000000000080200L});
	public static final BitSet FOLLOW_WS_in_command279 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_command282 = new BitSet(new long[]{0x0000000844C00300L});
	public static final BitSet FOLLOW_WS_in_command284 = new BitSet(new long[]{0x0000000844C00100L});
	public static final BitSet FOLLOW_commands_in_command287 = new BitSet(new long[]{0x0000000080000200L});
	public static final BitSet FOLLOW_WS_in_command290 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_command293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_command300 = new BitSet(new long[]{0x0000000020000B80L});
	public static final BitSet FOLLOW_WS_in_command302 = new BitSet(new long[]{0x0000000020000980L});
	public static final BitSet FOLLOW_expression_in_command306 = new BitSet(new long[]{0x0000000000080200L});
	public static final BitSet FOLLOW_WS_in_command308 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_command311 = new BitSet(new long[]{0x0000000844C00300L});
	public static final BitSet FOLLOW_WS_in_command313 = new BitSet(new long[]{0x0000000844C00100L});
	public static final BitSet FOLLOW_commands_in_command316 = new BitSet(new long[]{0x0000000080000200L});
	public static final BitSet FOLLOW_WS_in_command319 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_command322 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_command329 = new BitSet(new long[]{0x0000000000000300L});
	public static final BitSet FOLLOW_WS_in_command331 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_Variable_in_command334 = new BitSet(new long[]{0x0000000008000200L});
	public static final BitSet FOLLOW_WS_in_command336 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_command339 = new BitSet(new long[]{0x0000000020000B80L});
	public static final BitSet FOLLOW_WS_in_command341 = new BitSet(new long[]{0x0000000020000980L});
	public static final BitSet FOLLOW_expression_in_command344 = new BitSet(new long[]{0x0000000000080200L});
	public static final BitSet FOLLOW_WS_in_command346 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_19_in_command349 = new BitSet(new long[]{0x0000000844C00300L});
	public static final BitSet FOLLOW_WS_in_command351 = new BitSet(new long[]{0x0000000844C00100L});
	public static final BitSet FOLLOW_commands_in_command354 = new BitSet(new long[]{0x0000000080000200L});
	public static final BitSet FOLLOW_WS_in_command356 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_command359 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_vars371 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_13_in_vars374 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_vars_in_vars376 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_exprs386 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_13_in_exprs389 = new BitSet(new long[]{0x0000000020000980L});
	public static final BitSet FOLLOW_exprs_in_exprs391 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_exprBase401 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_WS_in_exprBase402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Variable_in_exprBase410 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Symbol_in_exprBase416 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_11_in_exprBase422 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_exprBase424 = new BitSet(new long[]{0x0000000020000980L});
	public static final BitSet FOLLOW_lExpr_in_exprBase426 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_exprBase428 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_11_in_exprBase434 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_exprBase436 = new BitSet(new long[]{0x0000000020000980L});
	public static final BitSet FOLLOW_lExpr_in_exprBase438 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_exprBase440 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_11_in_exprBase447 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_exprBase449 = new BitSet(new long[]{0x0000000020000980L});
	public static final BitSet FOLLOW_exprBase_in_exprBase451 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_exprBase453 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_11_in_exprBase459 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_34_in_exprBase461 = new BitSet(new long[]{0x0000000020000980L});
	public static final BitSet FOLLOW_exprBase_in_exprBase463 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_exprBase465 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_11_in_exprBase472 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_Symbol_in_exprBase474 = new BitSet(new long[]{0x0000000020000B80L});
	public static final BitSet FOLLOW_WS_in_exprBase476 = new BitSet(new long[]{0x0000000020000980L});
	public static final BitSet FOLLOW_lExpr_in_exprBase479 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_exprBase481 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprBase_in_expression492 = new BitSet(new long[]{0x0000000000020202L});
	public static final BitSet FOLLOW_WS_in_expression494 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_17_in_expression497 = new BitSet(new long[]{0x0000000020000B80L});
	public static final BitSet FOLLOW_WS_in_expression499 = new BitSet(new long[]{0x0000000020000980L});
	public static final BitSet FOLLOW_exprBase_in_expression502 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprBase_in_lExpr512 = new BitSet(new long[]{0x0000000020000B82L});
	public static final BitSet FOLLOW_WS_in_lExpr515 = new BitSet(new long[]{0x0000000020000982L});
	public static final BitSet FOLLOW_lExpr_in_lExpr518 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_program_in_startProgram528 = new BitSet(new long[]{0x0000000000000002L});
}

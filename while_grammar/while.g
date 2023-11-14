grammar while;

Maj	:	('A'..'Z');
Min	:	('a'..'z');
Dec	:	('0'..'9');
WS	:	' ';

Variable:	 Maj (Maj|Min|Dec)*('!'|'?')?;
Symbol	:	 Min (Maj|Min|Dec)*('!'|'?')?;

program	:	function program?;
function:	 'function ' Symbol WS?':' definition;
definition:	 'read'  WS? input '%' commands '%' 'write ' output;
input	:	 inputSub?;
inputSub 
	:	Variable WS? (','WS? inputSub)?;
output 	:	Variable (',' output)?;
commands:	command (';' commands)?;
command 
	:	 'nop'|
		(vars WS?':='WS? exprs)|
		('if' WS?  expression  WS? 'then' WS? commands  WS? ('else' WS? commands)?  WS? 'fi')|
		('while' WS? expression  WS? 'do' WS? commands  WS? 'od')|
		('for' WS?  expression WS? 'do' WS? commands  WS? 'od')|
		('foreach' WS? Variable WS? 'in' WS? expression WS? 'do' WS? commands WS? 'od');
		
vars 	:	Variable (',' vars)?;

exprs	:	expression (',' exprs)?;

exprBase:	 'nil'WS? | 
		Variable| 
		Symbol|
		('(' 'cons ' lExpr ')') | ('(' 'list ' lExpr ')')|
		('(' 'hd ' exprBase ')') | ('(' 'tl ' exprBase ')')|
		('(' Symbol WS? lExpr ')');

expression 
	:	exprBase WS?('=?' WS? exprBase)?;

lExpr	:	exprBase  WS? lExpr?;

startProgram
	:	program;



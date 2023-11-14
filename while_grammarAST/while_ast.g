grammar while_ast;
options
{
	output=AST;
}
tokens
{
	FUNCDEF;
	VARDEF;
	VARIABLES;
	EXPR;
	IF;
	WHILE;
	FOR;
	FOREACH;
	IN;
}

Maj	:	('A'..'Z');
Min	:	('a'..'z');
Dec	:	('0'..'9');
WS	:	' ';

Variable:	 Maj (Maj|Min|Dec)*('!'|'?')?;
Symbol	:	 Min (Maj|Min|Dec)*('!'|'?')?;

program	:	function program?;
function:	 'function ' Symbol WS?':' definition -> ^(FUNCDEF Symbol definition);
definition:	 'read'  WS? input '%' commands '%' 'write ' output -> WS;
input	:	 inputSub?;
inputSub 
	:	Variable WS? (','WS? inputSub)?;
output 	:	Variable (',' output)?;
commands:	command (';' commands)?;
command :	 'nop'|decl|if|while|foreach;
		
decl	:	(vars WS?':='WS? exprs) -> ^(VARDEF vars exprs) ;
if	:	('if' WS?  expression  WS? 'then' WS? commands  WS? ('else' WS? commands)?  WS? 'fi') -> ^(IF expression commands);
while	:	('while' WS? expression  WS? 'do' WS? commands  WS? 'od')-> ^(WHILE expression commands);
for	:	('for' WS?  expression WS? 'do' WS? commands  WS? 'od')-> ^(FOR expression commands);
foreach	:	('foreach' WS? Variable WS? 'in' WS? expression WS? 'do' WS? commands WS? 'od')-> ^(FOREACH ^(IN Variable expression) commands);
		
vars 	:	Variable (',' vars)? -> ^(VARIABLES Variable vars*);

exprs	:	expression (',' exprs)? -> ^(EXPR expression exprs*);

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



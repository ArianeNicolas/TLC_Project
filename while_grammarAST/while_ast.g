grammar while_ast;

options {
    output=AST;
}

tokens {
    START;
    FUNCTION;
    FUNCDEF;
    VARDEF;
    VARIABLES;
    EXPR;
    IF;
    WHILE;
    FOR;
    FOREACH;
    IN;
    EXPR;
    EXPRBASE;
    CONS;
    LIST;
    HD;
    TL;
    PROGRAM;
    OUTPUT;
    THEN;
    ELSE;
    DO;
    INPUTS;
    COMMENT;
    END;
    CALL;
}

startProgram
    : program -> ^(START program) 
    ;

Maj     : ('A'..'Z');
Min     : ('a'..'z');
Dec     : ('0'..'9');
WS      : ' '|'\n'|'\r'; 

Variable    : Maj (Maj | Min | Dec)* ('!' | '?')?;
Symbol      : Min (Maj | Min | Dec)* ('!' | '?')?;

Comment	:	' '* '/''/' ~('\n'|'\r')* '\r'? '\n'; 

getComment
	:	Comment -> ^(COMMENT Comment);

program
    : function WS* program? -> ^(PROGRAM function program?)
    ; 

function
    : getComment? 'function ' Symbol WS* ':' getComment? WS* definition -> ^(FUNCDEF Symbol definition getComment? END) 
    ;

definition
    : 'read' WS* input '%' getComment? WS* commands WS* '%' getComment? WS* 'write ' output getComment?-> ^(FUNCTION input commands output getComment?)
    ;

input
    : inputSub? getComment? ->  ^(INPUTS inputSub? getComment?)
    ;

inputSub
    : Variable WS* (',' WS* inputSub)? -> Variable inputSub? 
    ;

output
    : Variable (',' output)? -> ^(OUTPUT Variable output?)
    ;

commands
    : command ( WS* ';' WS* commands)? -> command commands? 
    ;

command
    : 'nop' | decl | if_ | for_ | while_ | foreach_ ;

decl
    : (vars WS* ':=' WS* exprs) getComment? -> ^(VARDEF vars exprs getComment?) 
    ;

if_ 
    : ('if' WS* expression WS* then_ WS* (else_ WS*)? 'fi' getComment?) -> ^(IF expression then_ else_? getComment? END) 
    ;
    
then_	:	'then' getComment? WS* commands -> ^(THEN commands getComment?); 

else_	:	'else' getComment? WS* commands -> ^(ELSE commands getComment?);  

while_
    : ('while' WS* expression getComment? WS* do_) -> ^(WHILE expression getComment? do_ END)
    ;
    
do_ 	: 'do' getComment? WS* commands WS* 'od' getComment? -> ^(DO commands  getComment?);

for_
    : ('for' WS* expression getComment? WS* do_) -> ^(FOR expression do_ END)
    ;

foreach_
    : ('foreach' WS* Variable WS* 'in' WS* expression getComment? WS* do_) -> ^(FOREACH ^(IN Variable expression) getComment? do_ END)
    ;

vars
    : Variable (','WS* vars)? -> Variable vars*
    ;

exprs
    : expression (','WS* exprs)? -> expression exprs*
    ;

exprBase   :  nil_
    | variable
    | cons | list
    | hd | tl
    | symbolExpr 
    ;
    
nil_	:	('nil') -> 'nil'; 
    
variable:	Variable -> Variable;

cons	:	'(' WS* 'cons ' lExpr WS* ')' -> ^(CONS lExpr); 
list	:	'('WS* 'list ' lExpr WS* ')' -> ^(LIST lExpr);

hd	:	'('WS* 'hd ' exprBase WS*')' -> ^(HD exprBase);

tl	:	'(' WS*'tl ' exprBase WS*')' -> ^(TL exprBase);

symbolExpr
	:	'(' Symbol WS* lExpr? ')' -> ^(CALL Symbol lExpr?); 

expression
    : lExpr (WS* '=?' WS* lExpr)? -> ^(EXPR lExpr lExpr?) 
    ;
   

lExpr
    : exprBase (WS* lExpr)? -> exprBase lExpr?
    ;
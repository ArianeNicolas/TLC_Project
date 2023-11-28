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
    END;
}

startProgram
    : program -> ^(START program)
    ;

Maj     : ('A'..'Z');
Min     : ('a'..'z');
Dec     : ('0'..'9');
WS      : ' ';

Variable    : Maj (Maj | Min | Dec)* ('!' | '?')?;
Symbol      : Min (Maj | Min | Dec)* ('!' | '?')?;

program
    : function program? -> ^(PROGRAM function program?)
    ;

function
    : 'function ' Symbol WS* ':' WS* definition -> ^(FUNCDEF Symbol definition END)
    ;

definition
    : 'read' WS* input '%' WS* commands WS*'%' WS* 'write ' output -> ^(FUNCTION input commands output)
    ;

input
    : inputSub? ->  ^(INPUTS inputSub?)
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
    : (vars WS* ':=' WS* exprs) -> ^(VARDEF vars exprs)
    ;

if_
    : ('if' WS* expression WS* then_  WS* else_ 'fi') -> ^(IF expression then_ else_? END)
    ;
    
then_	:	'then' WS* commands WS* -> ^(THEN commands);

else_	:	('else' WS* commands)? -> ^(ELSE commands);

while_
    : ('while' WS* expression WS* do_) -> ^(WHILE expression do_ END)
    ;
    
do_ 	: 'do' WS* commands WS* 'od' -> ^(DO commands);

for_
    : ('for' WS* expression WS* do_) -> ^(FOR expression do_ END)
    ;

foreach_
    : ('foreach' WS* Variable WS* 'in' WS* expression WS* do_) -> ^(FOREACH ^(IN Variable expression) do_ END)
    ;

vars
    : Variable (',' vars)? -> ^(VARIABLES Variable vars*)
    ;

exprs
    : expression (',' exprs)? -> expression exprs*
    ;

exprBase   :  nil_
    | variable
    | cons | list
    | hd | tl
    | symbolExpr 
    ;
    
nil_	:	('nil'WS*) -> 'nil';
    
variable:	Variable -> Variable;

cons	:	'(' WS* 'cons ' lExpr WS* ')' -> ^(CONS lExpr);

list	:	'('WS* 'list ' lExpr WS* ')' -> ^(LIST lExpr);

hd	:	'('WS* 'hd ' exprBase WS*')' -> ^(HD exprBase);

tl	:	'(' WS*'tl ' exprBase WS*')' -> ^(TL exprBase);

symbolExpr
	:	'(' Symbol WS* lExpr? ')' -> Symbol lExpr?;

expression
    : exprBase WS*('=?' WS* exprBase)? -> ^(EXPR exprBase exprBase?)
    ;
   

lExpr
    : exprBase WS* lExpr? -> exprBase lExpr?
    ;
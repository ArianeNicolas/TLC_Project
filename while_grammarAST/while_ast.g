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
    NOT;
}

startProgram
    : program -> ^(START program) 
    ;

fragment Maj     : ('A'..'Z');
fragment Min     : ('a'..'z');
fragment Dec     : ('0'..'9');
WS      : ' '|'\n'|'\r'; 

Variable    : Maj (Maj | Min | Dec)* ('!' | '?')?;
Symbol      : Min (Maj | Min | Dec)* ('!' | '?')?;

Comment	:	'/''/' ~('\n'|'\r')* '\r'? '\n'; 

getComment
	:	Comment -> ^(COMMENT Comment);
	
variable:	Variable -> Variable;

symbol	:	Symbol -> Symbol;

program
    : function WS* program? -> ^(PROGRAM function program?) 
    ; 

function
    : WS* getComment? 'function' WS Symbol WS* ':' WS* getComment? WS* definition -> ^(FUNCDEF Symbol definition END) 
    ;

definition
    : 'read' WS* input '%' WS* getComment? WS* commands WS* '%' WS* getComment? WS* 'write' WS* output WS* getComment?-> ^(FUNCTION input commands output )
    ;

input
    : inputSub? WS* getComment? ->  ^(INPUTS inputSub?)
    ;

inputSub
    : Variable WS* (',' WS* inputSub)? -> Variable inputSub? 
    ;

output 
    : Variable WS* (',' WS* output)? -> ^(OUTPUT Variable output?)
    ;

commands
    : command ( WS* ';' WS* getComment? commands)? -> command commands? 
    ;

command
    : 'nop' | decl | if_ | for_ | while_ | foreach_ ;

decl
    : (vars WS* ':=' WS* exprs) WS* getComment? -> ^(VARDEF vars exprs) 
    ;

if_ 
    : ('if' WS* expression WS* then_ WS* (else_ WS*)? 'fi' WS* getComment?) -> ^(IF expression then_ else_? END) 
    ;
    
then_	:	'then' WS* getComment? WS* commands -> ^(THEN commands); 

else_	:	'else' WS* getComment? WS* commands -> ^(ELSE commands);  

while_
    : ('while' WS* expression WS* getComment? WS* do_) -> ^(WHILE expression do_ END)
    ; 
    
do_ 	: 'do' WS* getComment? WS* commands WS* 'od' WS* getComment? -> ^(DO commands);

for_
    : ('for' WS* expression WS* getComment? WS* do_) -> ^(FOR expression do_ END)
    ;

foreach_
    : ('foreach' WS* Variable WS* 'in' WS* expression WS* getComment? WS* do_) -> ^(FOREACH ^(IN Variable expression) do_ END)
    ;

vars
    : Variable WS* (','WS* vars)? -> Variable vars*
    ;

exprs
    : expression WS* (','WS* exprs)? -> expression exprs*
    ;

exprBase   :  nil_
    | variable | symbol
    | cons | list
    | hd | tl
    | symbolExpr
    ;
    
nil_	:	('nil') -> 'nil'; 

cons	:	'(' WS* 'cons' WS* lExpr? WS* ')' -> ^(CONS lExpr?); 
list	:	'('WS* 'list' WS* lExpr? WS* ')' -> ^(LIST lExpr);

hd	:	'('WS* 'hd' WS* exprBase WS*')' -> ^(HD exprBase);

tl	:	'(' WS*'tl' WS* exprBase WS*')' -> ^(TL exprBase);

symbolExpr
	:	'(' WS* Symbol WS* lExpr? WS*')' -> ^(CALL Symbol lExpr?); 

expression
    : exprBase (WS* '=?' WS* exprBase)? -> ^(EXPR exprBase exprBase?) 
    ;
   

lExpr
    : exprBase (WS* lExpr)? -> exprBase lExpr?
    ;
#include "while_tree.h"
#include "output.h"
#include <stddef.h>
#include <stdio.h>
#include <stdlib.h>

void add_while(Tree* Result, Tree Op1, Tree Op2){
*Result = Op1;
FOR:
Tree Reg_0 = cons(nil, nilv, *Result);
*Result = Reg_0;

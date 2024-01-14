#include "while_tree.h"
#include <stddef.h>
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
void add_while(Tree Result, Tree Op1, Tree Op2) {
Result = Op1;
int i0;
for(i0=0; i0<intTree(Op2); i0++){
Tree Reg_0 = cons(nil, nilv, Result);
Result = Reg_0;
}
}

void oneForeach_while(Tree Result, Tree Op1, Tree Op2) {
Tree Reg_1 = cons(Op2, nilv, nil);
Tree Reg_2 = cons(Op1, nilv, Reg_1);
int i1;
Tree V1 = Reg_2;
Tree Var = Reg_2;
for(i1=0; i1<intTree(Reg_2); i1++){
V1 = Reg_2->r;
Var = Reg_2->l;
Result = Var;
}
}


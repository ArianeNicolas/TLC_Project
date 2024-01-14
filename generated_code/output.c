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


#include "while_tree.h"
#include "output.h"
#include <stddef.h>
#include <stdio.h>
#include <stdlib.h>

void add_while(Tree* Result, Tree Op1, Tree Op2){
*Result = Op1;
if(equals(nil, Op2)){
goto block1;
}
block0:
Tree Reg_0 = cons(nil, nilv, *Result);
*Result = Reg_0;
Op2 = Op2->r;
if(!equals(nil, Op2)){
goto block0;
}
block1:
}

int main(int argc, char *argv[]) {
Tree t[argc];
for (int i = 1; i < argc; i++)
{
    t[i-1] = parsArgs(argv[i]);
}
main_while();
return 0;
}

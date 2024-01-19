#include "while_tree.h"
#include "output.h"
#include <stddef.h>
#include <stdio.h>
#include <stdlib.h>

void main_while(Tree* Result, Tree Op1, Tree Op2){
Op1 = Op1->r;
if(!boolTree(Op1)){
goto block0;
}
*Result = Op1;
goto block1;
block0:
*Result = Op2;
block1:
}

int main(int argc, char *argv[]) {
Tree t[100] = { nil };
if(argc > 100)
{
    fprintf(stderr, "Too many arguments (max 100)\n");
    return 1;
}
if (argc-1 > 0){
    for (int i = 1; i < argc; i++){
        t[i-1] = parsArgs(argv[i]);}}
Tree Result;
main_while(&Result, t[0], t[1]);
pp(Result);
return 0;
}

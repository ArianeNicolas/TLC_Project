#include "while_tree.h"
#include "output.h"
#include <stddef.h>
#include <stdio.h>
#include <stdlib.h>

void main_while(Tree* Result){
*Result = nil;
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
main_while(&Result);
pp(Result);
return 0;
}

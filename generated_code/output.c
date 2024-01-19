#include "while_tree.h"
#include "output.h"
#include <stddef.h>
#include <stdio.h>
#include <stdlib.h>

void test_while(Tree* Result, Tree Var1, Tree Var2){
Tree Reg_0 = cons(Var1, nilv, Var2);
*Result = Reg_0;
}

void main_while(Tree* Test1, Tree* Test2, Tree* Test3, Tree* Test4, Tree* Test5, Tree* Test6, Tree* Test7, Tree* Test8, Tree* Test9, Tree Var1, Tree Var2, Tree Var3, Tree Var4){
Tree Reg_1 = cons(cons(nil, "un", nil), nilv, cons(nil, "texte", nil));
Tree Reg_2 = cons(cons(nil, "est", nil), nilv, Reg_1);
Tree Reg_3 = cons(cons(nil, "ceci", nil), nilv, Reg_2);
Tree Reg_4 = cons(cons(nil, "string", nil), nilv, Reg_3);
*Test1 = Reg_4;
Tree Reg_5 = cons(cons(nil, "bool", nil), nilv, nil);
*Test2 = Reg_5;
Tree Reg_6 = cons(nil, nilv, nil);
Tree Reg_7 = cons(nil, nilv, Reg_6);
Tree Reg_8 = cons(cons(nil, "int", nil), nilv, Reg_7);
*Test3 = Reg_8;
Tree Reg_9;
test_while(&Reg_9, *Test1, *Test2);
*Test4 = Reg_9;
if(boolTree(equals(nil, Var1))){
goto block1;
}
block0:
Tree Reg_10 = cons(nil, nilv, nil);
*Test5 = Reg_10;
Var1 = Var1->r;
if(!boolTree(equals(nil, Var1))){
goto block0;
}
block1:
Tree Reg_11 = cons(nil, nilv, nil);
*Test5 = Reg_11;
*Test6 = nil;
if(boolTree(equals(nil, Var2))){
goto block3;
}
Tree Reg_13 = Var2;
Tree VFor = Var2;
block2:
VFor = Reg_13->r;
Tree Reg_12 = cons(*Test6, nilv, VFor);
*Test6 = Reg_12;
Reg_13 = Reg_13->l;
if(!boolTree(equals(nil, Reg_13))){
goto block2;
}
block3:
Var4 = Var4->r;
if(!boolTree(Var4)){
goto block6;
}
Tree Reg_14 = cons(nil, nilv, nil);
*Test7 = Reg_14;
*Test7 = nil;
goto block7;
block6:
block7:
Tree Reg_15 = cons(Var3, nilv, nil);
Tree Reg_16 = cons(cons(nil, "ah", nil), nilv, Reg_15);
Tree Reg_17 = cons(cons(nil, "ah", nil), nilv, Reg_16);
Tree Reg_18 = cons(cons(nil, "ah", nil), nilv, Reg_17);
Tree Reg_19 = cons(cons(nil, "ah", nil), nilv, Reg_18);
Tree Reg_20 = cons(cons(nil, "ah", nil), nilv, Reg_19);
Tree Reg_21 = cons(cons(nil, "ah", nil), nilv, Reg_20);
Tree Reg_22 = cons(cons(nil, "ah", nil), nilv, Reg_21);
*Test7 = Reg_22;
Tree Reg_23 = (*Test7)->r;
Tree Reg_24 = (*Test7)->l;
*Test8 = Reg_23;
*Test9 = Reg_24;
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
Tree Test1;
Tree Test2;
Tree Test3;
Tree Test4;
Tree Test5;
Tree Test6;
Tree Test7;
Tree Test8;
Tree Test9;
main_while(&Test1, &Test2, &Test3, &Test4, &Test5, &Test6, &Test7, &Test8, &Test9, t[0], t[1], t[2], t[3]);
pp(Test1);
pp(Test2);
pp(Test3);
pp(Test4);
pp(Test5);
pp(Test6);
pp(Test7);
pp(Test8);
pp(Test9);
return 0;
}

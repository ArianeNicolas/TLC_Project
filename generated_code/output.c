#include "while_tree.h"
#include "output.h"
#include <stddef.h>
#include <stdio.h>
#include <stdlib.h>

void add_while(Tree* Result, Tree Op1, Tree Op2){
*Result = Op1;
if(boolTree(equals(nil, Op2))){
goto block1;
}
block0:
Tree Reg_0 = cons(nil, nilv, *Result);
*Result = Reg_0;
Op2 = Op2->r;
if(!boolTree(equals(nil, Op2))){
goto block0;
}
block1:
}

void test_while(Tree* Result, Tree Op1, Tree Op2){
Tree Reg_1 = nil;
*Result = Reg_1;
Tree Reg_2 = nil;
Tree Reg_3;
add_while(&Reg_3, *Result, Reg_2);
*Result = Reg_3;
Tree Reg_4 = nil;
Tree Reg_5;
add_while(&Reg_5, *Result, Reg_4);
*Result = Reg_5;
Tree Reg_6 = nil;
Tree Reg_7;
add_while(&Reg_7, *Result, Reg_6);
*Result = Reg_7;
Tree Reg_8 = nil;
Tree Reg_9;
add_while(&Reg_9, *Result, Reg_8);
*Result = Reg_9;
Tree Reg_10 = (*Result)->r;
*Result = Reg_10;
Tree Reg_11 = (*Result)->l;
*Result = Reg_11;
Tree Reg_12 = cons(*Result, nilv, nil);
Tree Reg_13 = cons(*Result, nilv, Reg_12);
Tree Reg_14 = cons(*Result, nilv, Reg_13);
Tree Reg_15 = cons(*Result, nilv, Reg_14);
*Result = Reg_15;
Tree Reg_16 = *Result;
Tree Reg_17 = cons(*Result, nilv, Reg_16);
Tree Reg_18 = cons(*Result, nilv, Reg_17);
Tree Reg_19 = cons(*Result, nilv, Reg_18);
*Result = Reg_19;
Tree Reg_20 = cons(*Result, nilv, nil);
*Result = Reg_20;
Tree Reg_21 = nil;
Tree Test = Reg_21;
Tree Reg_22 = nil;
Tree Reg_23;
add_while(&Reg_23, *Result, Reg_22);
Tree Reg_24 = cons(*Result, nilv, Reg_23);
Tree Reg_25 = nil;
*Result = Reg_25;
Tree Reg_26 = nil;
Test = Reg_26;
}

void sub_while(Tree* Result, Tree Op1, Tree Op2){
*Result = Op1;
if(boolTree(equals(nil, Op2))){
goto block7;
}
block6:
Tree Reg_27 = (*Result)->r;
*Result = Reg_27;
Op2 = Op2->r;
if(!boolTree(equals(nil, Op2))){
goto block6;
}
block7:
}

void mul_while(Tree* Result, Tree Op1, Tree Op2){
if(boolTree(equals(nil, Op1))){
goto block9;
}
block8:
Tree Reg_28;
add_while(&Reg_28, *Result, Op2);
*Result = Reg_28;
Op1 = Op1->r;
if(!boolTree(equals(nil, Op1))){
goto block8;
}
block9:
}

void test2_while(Tree* Result, Tree Op1, Tree Op2){
Tree Reg_29 = nil;
*Result = Reg_29;
Tree Reg_30 = nil;
Tree Reg_31;
add_while(&Reg_31, *Result, Reg_30);
*Result = Reg_31;
Tree Reg_32 = nil;
Tree Reg_33;
add_while(&Reg_33, *Result, Reg_32);
*Result = Reg_33;
Tree Reg_34 = nil;
Tree Reg_35;
add_while(&Reg_35, *Result, Reg_34);
*Result = Reg_35;
Tree Reg_36 = nil;
Tree Reg_37;
add_while(&Reg_37, *Result, Reg_36);
*Result = Reg_37;
}

void true_while(Tree* Result){
Tree Reg_38 = cons(nil, nilv, nil);
*Result = Reg_38;
}

void false_while(Tree* Result){
*Result = nil;
}

void not_while(Tree* Result, Tree Op1){
Op1 = Op1->r;
if(!boolTree(Op1)){
goto block10;
}
Tree Reg_39;
false_while(&Reg_39);
*Result = Reg_39;
goto block11;
block10:
Tree Reg_40;
true_while(&Reg_40);
*Result = Reg_40;
block11:
}

void and_while(Tree* Result, Tree Op1, Tree Op2){
Tree Reg_41;
not_while(&Reg_41, Op1);
Reg_41 = Reg_41->r;
if(!boolTree(Reg_41)){
goto block14;
}
Tree Reg_42;
false_while(&Reg_42);
*Result = Reg_42;
goto block15;
block14:
Tree Reg_43;
not_while(&Reg_43, Op2);
Reg_43 = Reg_43->r;
if(!boolTree(Reg_43)){
goto block12;
}
Tree Reg_44;
false_while(&Reg_44);
*Result = Reg_44;
goto block13;
block12:
Tree Reg_45;
true_while(&Reg_45);
*Result = Reg_45;
block13:
block15:
}

void testRetourMultiple_while(Tree* V1, Tree* V2, Tree Op1, Tree Op2){
*V1 = Op1;
*V2 = Op2;
}

void jeVeuxMourir_while(Tree* Test1, Tree* Test2, Tree Op1, Tree Op2){
Tree Reg_46;
Tree Reg_47;
testRetourMultiple_while(&Reg_46, &Reg_47, Op1, Op2);
Tree Reg_48 = nil;
*Test1 = Reg_46;
*Test2 = Reg_47;
Tree Test3 = Reg_48;
Tree Reg_49 = cons(cons(nil, "b", nil), nilv, nil);
Tree Reg_50 = cons(cons(nil, "a", nil), nilv, Reg_49);
Tree Test4 = Reg_50;
}

void testForeachetComm_while(Tree* Test1, Tree* Test2, Tree Op1, Tree Op2, Tree Op3){
Tree Reg_51 = nil;
*Test1 = Reg_51;
if(boolTree(equals(nil, Op2))){
goto block17;
}
Tree Reg_53 = Op2;
Tree VFor = Op2;
block16:
VFor = Reg_53->r;
Tree Reg_52 = cons(VFor, nilv, *Test1);
*Test1 = Reg_52;
Reg_53 = Reg_53->l;
if(!boolTree(equals(nil, Reg_53))){
goto block16;
}
block17:
Tree Reg_54 = nil;
Tree Reg_55 = equals(Reg_54, *Test1);
*Test2 = Reg_55;
}

void main_while(Tree* Result1, Tree* Result2){
Tree Op1 = nil;
Tree Op2 = nil;
Tree Op3 = nil;
Tree Reg_56;
Tree Reg_57;
testForeachetComm_while(&Reg_56, &Reg_57, Op1, Op2, Op3);
*Result1 = Reg_56;
*Result2 = Reg_57;
}

int main(int argc, char *argv[]) {
Tree t[100] = { nil };
if(argc > 100)
{
    fprintf(stderr, "Too many arguments (max 100)\n");
    return 1;
}
if (argc-1 > 0)
    for (int i = 1; i < argc; i++)
        t[i-1] = parsArgs(argv[i]);
Tree Result1;
Tree Result2;
main_while(&Result1, &Result2);
pp(Result1);
pp(Result2);
return 0;
}

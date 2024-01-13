#include "while_tree.h"
#include <stddef.h>
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

int main(int argc, char *argv[]) {
    Tree t = parsArgs(argc, argv);
    displayString(t);
    //printf("intArg : %d \n", intTree(t));
    test();
	return 0;
}

void test(void)
{
    
    Tree t = cons(cons(nil, nil, cons(nil, "OMG", nil)), nil, cons(cons(nil, "MDR", nil), nil, cons(nil, "JPP", nil)));
    Tree t2 = cons(cons(nil, nil, cons(nil, "M", nil)), nil, cons(cons(nil, "D", nil), nil, cons(nil, "R", nil)));
    //printf("bool : %d \n", boolTree(t));
    //printf("int : %d \n", intTree(t));
    //displayString(cons(t, nilv, t2));
    displayString(t);
    printf("%d", boolTree(equals(t, t2)));
    deleteTree(t);
}
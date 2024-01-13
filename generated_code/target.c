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
    
    Tree t = cons(cons(nil, nilv, cons(nil, "OMG", nil)), nilv, cons(cons(nil, "MDR", nil), nilv, cons(nil, "JPP\n", nil)));
    //Tree t2 = cons(cons(nil, nilv, cons(nil, 'M', nil)), nilv, cons(cons(nil, 'D', nil), nilv, cons(nil, 'R', nil)));
    //printf("bool : %d \n", boolTree(t));
    //printf("int : %d \n", intTree(t));
    //displayString(cons(t, nilv, t2));
    displayString(t);
    deleteTree(t);
}
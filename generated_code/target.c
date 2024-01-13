#include "while_tree.h"
#include <stddef.h>
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

int main(int argc, char *argv[]) {
    displayString(parsArgs(argc, argv));
    test();
	return 0;
}

void test(void)
{
    
    Tree t = cons(cons(nil, nilv, cons(nil, 'O', nil)), nilv, cons(cons(nil, 'M', nil), nilv, cons(nil, 'G', nil)));
    Tree t2 = cons(cons(nil, nilv, cons(nil, 'M', nil)), nilv, cons(cons(nil, 'D', nil), nilv, cons(nil, 'R', nil)));
    printf("bool : %d \n", boolTree(t));
    printf("int : %d \n", intTree(t));
    displayString(cons(t, nilv, t2));
    
    deleteTree(t);
}
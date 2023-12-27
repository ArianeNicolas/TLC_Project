#include "while_tree.h"
#include <stddef.h>
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

int main(void) {
    test();
	return 0;
}

void test(void)
{
    Tree t = node(node(NULL, 'M', NULL), 'O', node(NULL, 'G', NULL));
    Tree t2 = node(node(NULL, 'D', NULL), 'M', node(NULL, 'R', NULL));
    printf("bool : %d \n", boolTree(t));
    printf("int : %d \n", intTree(t));
    Tree sum = add(t, t2);
    displayString(sum);
    printf("\n");
    printf("int : %d \n", intTree(sum));
    Tree subt = sub(sum, node(node(NULL, 'L', NULL), 'K', node(NULL, 'M', NULL)));
    printf("int sub : %d \n", intTree(subt));

    deleteTree(t);
}
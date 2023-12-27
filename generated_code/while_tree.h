#include <stdbool.h>

typedef struct linkTree
{
	struct linkTree *l;
	char v;
	struct linkTree *r;

}LinkTree, *Tree;

Tree node(Tree l, char v, Tree r);
void deleteTree(Tree t);
void displayString(Tree t);
bool isEmpty(Tree t);
bool isLeaf(Tree t);
bool boolTree(Tree t);
int intTree(Tree t);
Tree copy(Tree t);
Tree add(Tree t1, Tree t2);

void test(void);
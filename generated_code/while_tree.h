#include <stdbool.h>

typedef struct linkTree
{
	struct linkTree *l;
	char v;
	struct linkTree *r;

}Node, *Tree;

Tree nil;
Tree cons(Tree l, char* v, Tree r); //create a node
void deleteTree(Tree t); //delete a tree
void displayString(Tree t); //display a tree
bool isEmpty(Tree t); 
bool isLeaf(Tree t);
bool boolTree(Tree t); //return true if the root node is a tree
int intTree(Tree t); // convert the tree into an integer. The integer corresponds to the tree height
Tree copy(Tree t); // copy a tree
/*Tree concatenate(Tree t1, Tree t2);//Concatenate two strings
Tree add(Tree t1, Tree t2);//add two ints
Tree sub(Tree t1, Tree t2);//sub two ints*/

void test(void);
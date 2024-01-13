#include <stdbool.h>

typedef struct linkTree
{
	struct linkTree *l;
	char v;
	struct linkTree *r;

}Node, *Tree;

#define nil NULL //For null Tree
#define nilv '\0' //For null value in a Tree

//Trees handling
Tree cons(Tree l, char v, Tree r); //create a node
void deleteTree(Tree t); //delete a tree
void displayString(Tree t); //display a tree
bool isEmpty(Tree t); 
bool isLeaf(Tree t);
bool boolTree(Tree t); //return true if the root node is a tree
int intTree(Tree t); // convert the tree into an integer. The integer corresponds to the tree height
Tree copy(Tree t); // copy a tree
Tree buildTreeByInt(int nbT); // build a tree that represents a int

//Parsing
Tree parsArgs(int argc, char *argv[]); // parse a tree passed in argument
Tree buildTreeByString(char str[], unsigned int start, unsigned int end);// build a tree with a string
bool cmpStrWithSubString(char str[], unsigned int start, unsigned int end, char cmp[]); // compare string (cmp) with a substring (str), true if same else false

//Tests
void test(void);
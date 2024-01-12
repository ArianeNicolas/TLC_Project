#include "while_tree.h"
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>


Tree cons(Tree l, char v, Tree r) 
{
	Node *m;
	m = malloc(sizeof(Node));

	m->l= l;
	m->v = v;
	m->r= r;
	
	return m;
}

void displayString(Tree t)
{
	if (isEmpty(t)) return;
	if (t->v != nilv) printf("%c", t->v);
	displayString(t->l);
	displayString(t->r);
}

void deleteTree(Tree t)
{
	if (isEmpty(t)) return;
	deleteTree(t->l);
	deleteTree(t->r);
	free(t);
}

bool isEmpty(Tree t)
{
	return t == nil;
}

bool isLeaf(Tree t)
{
	return t->l == nil && t->r == nil;
}

bool boolTree(Tree t)
{
	if (isEmpty(t)) return false;
	if (isLeaf(t)) return false;
	return true;
}

int intTree(Tree t)
{
	if (isLeaf(t)) return 0;
	return intTree(t->r)+1;
}

Tree copy(Tree t)
{
	if (isEmpty(t)) return nil;
	return cons(copy(t->l), t->v, copy(t->r));
}

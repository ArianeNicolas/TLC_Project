#include "while_tree.h"
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

Tree node(Tree l, char v, Tree r) 
{
	LinkTree *m;
	m = malloc(sizeof(LinkTree));

	m->l= l;
	m->v = v;
	m->r= r;
	
	return m;
}

void displayString(Tree t)
{
	if (isEmpty(t)) return;
	printf("%c", t->v);
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
	return t == NULL;
}

bool isLeaf(Tree t)
{
	return t->l == NULL && t->r == NULL;
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
	if (isEmpty(t)) return NULL;
	return node(copy(t->l), t->v, copy(t->r));
}

Tree add(Tree t1, Tree t2)
{
	Tree ct1 = copy(t1);
	Tree ct2 = copy(t2);
	Tree root = ct1;

	while (!isEmpty(ct1->r)) ct1 = ct1->r;
	
	ct1->r = ct2;

	return root;
}
#include "while_tree.h"
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

nil = NULL;

Tree cons(Tree l, char* v, Tree r) 
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

/*Tree concatenate(Tree t1, Tree t2)
{
	Tree ct1 = copy(t1);
	Tree ct2 = copy(t2);
	Tree root = ct1;

	while (!isEmpty(ct1->r)) ct1 = ct1->r;
	
	ct1->r = ct2;

	return root;
}

Tree add(Tree t1, Tree t2)
{
	Tree ct1 = copy(t1);
	Tree ct2 = copy(t2);
	Tree root = ct1;

	while (!isEmpty(ct1->r)) ct1 = ct1->r;
	
	ct1->l = ct2->l;
	ct1->r = ct2->r;

	return root;
}

Tree sub(Tree t1, Tree t2)
{
	Tree root = NULL;
	int intT1 = intTree(t1);
	int intT2 = intTree(t2);
	if(intT1 < intT2) {
		int h = intT2-intT1;
		Tree ct2 = copy(t2);
		root = ct2;
		for (int i = 0; i < h; i++)
		{
			ct2 = ct2->r;
		}
		deleteTree(ct2->r);
		deleteTree(ct2->l);
		ct2->r = NULL;
		ct2->l = NULL;
		
	} else {
		
		int h = intT1-intT2;
		Tree ct1 = copy(t1);
		root = ct1;
		for (int i = 0; i < h; i++)
		{
			ct1 = ct1->r;
			
		}
		deleteTree(ct1->r);
		deleteTree(ct1->l);
		ct1->r = NULL;
		ct1->l = NULL;
	}
	return root;
}*/
#include "while_tree.h"
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>
#include <regex.h>

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

Tree parsArgs(int argc, char *argv[]) 
{
	//PRECONDITIONS//
	if (argc < 2) return nil;

	if (argc > 2) 
	{
		fprintf(stderr, "Too many arguments ! Put \"\" around the argument \n");
		exit(1);
	}

	//\(cons\s+((?:[^()]|\((?1)\))+)\s+((?:[^()]|\((?2)\))+)\)
	return buildTreeByString(argv[1], 0, strlen(argv[1]));
}




Tree buildTreeByString(char str[], unsigned char start, unsigned char end)
{	
	//STOP CONDITION// 
	if(cmpStrWithSubString(str, start, end, "nil")) return nil;
	if(str[start] != '(') return cons(nil, str[start], nil);

	//INITIALISATION//
	unsigned char  i = start;
	unsigned char parenthesesStack= 0;
	unsigned char spacesStack= 0;
    unsigned char startSubStr1 = 0, startSubStr2 = 0, endSubStr1 = 0, endSubStr2 = 0;
	bool isSubStr1 = true;

	//PROCESSING//
	//extract the two substrings of (cons A B) (extract A and B for build trees A, B and AB tree)
	while (i < end) 
	{
		if (i >= 255) {
			fprintf(stderr, "Argument too long ! Max 256 chars \n");
			exit(1);
		}

		if (str[i] == '(') ++parenthesesStack;
		if (str[i] == ' ' && parenthesesStack == 1) 
		{
			++spacesStack;
			if (spacesStack == 1) {
				startSubStr1 = i+1;
			} else if (spacesStack > 1) {
				endSubStr1 = i;
				startSubStr2 = i+1;
			} 
		}

		if (str[i] == ')') 
		{
			--parenthesesStack;
			if (parenthesesStack < 1 ) {
				endSubStr2 = i;
				break;
			}
			
		}
		++i;
	}
	
	Tree left = buildTreeByString(str, startSubStr1, endSubStr1);
	Tree right = buildTreeByString(str, startSubStr2, endSubStr2);
	return cons(left, nilv, right);
}

bool cmpStrWithSubString(char str[], unsigned char start, unsigned char end, char cmp[]) {
	if (end-start > strlen(cmp)) return false; 

	for(int i = 0; i<strlen(cmp); ++i)
	{
		if(str[i+start] != cmp[i]) return false;
	}
	
	return true;
}
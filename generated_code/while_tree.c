#include "while_tree.h"
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>
#include <regex.h>

Tree cons(Tree l, char v[], Tree r) 
{
	char *tmp = NULL;
	if(v != NULL) {
		tmp = (char*)malloc(sizeof(char) * (strlen(v) + 1));
		if(tmp != NULL)
			strcpy(tmp, v);
	}
	
	Node *m = NULL;
	m = malloc(sizeof(Node));
	if(m != NULL)
	{
		m->l= l;
		m->v = tmp;
		m->r= r;
	}
	return m;
}

void displayString(Tree t)
{
	if (isEmpty(t)) return;
	if (t->v != nil) printf("%s", t->v);
	displayString(t->l);
	displayString(t->r);
}

void pp(Tree t) 
{
	if (isEmpty(t))
	{
		printf("nil\n");
		return;
	}

	if (!isEmpty(t->l) && t->l->v != nil) 
	{
		if (strcmp(t->l->v, "int")==0)
		{
			t = t->r;
			printf("%d\n", intTree(t));
			return;

		} else if (strcmp(t->l->v, "bool")==0) 
		{
			t = t->r;
			if (boolTree(t)) 
			{
				printf("true\n");
			} else printf("false\n");
			return;
		} else if (strcmp(t->l->v, "string")==0)
		{
			t = t->r;
			displayString(t);
			printf("\n");
			return;
		}
	}
	
	//default
	if (boolTree(t)) 
	{
		printf("bool : true\n");
	} else printf("bool : false\n");
	printf("int : %d\n", intTree(t));
	displayString(t);
	printf("\n");
}

void deleteTree(Tree t)
{
	if (isEmpty(t)) return;
	deleteTree(t->l);
	deleteTree(t->r);
	if(t->v != NULL) free(t->v);
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
	if (isEmpty(t)) return 0;
	if (isLeaf(t)) return 0;
	return intTree(t->r)+1;
}

Tree copy(Tree t)
{
	if (isEmpty(t)) return nil;
	return cons(copy(t->l), t->v, copy(t->r));
}

Tree equals(Tree t1, Tree t2)
{
	if(equalsRec(t1, t2)) return cons(nil, nil, cons(nil, nil, nil));
	return cons(nil, nil, nil);
}

bool equalsRec(Tree t1, Tree t2)
{
	if(isEmpty(t1) && isEmpty(t2)) return true;
	if(isLeaf(t1) && isLeaf(t2))
	{
		if (t1->v != nil && t2->v != nil)
		{
			if(strcmp( t1->v, t2->v ) != 0)
			{
				return false;
			} else return true;
		} else if(t1->v == nil && t2->v == nil) return true;
		return false;
	}
	equalsRec(t1->l, t2->l);
	equalsRec(t1->r, t2->r);
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

	char str[strlen(argv[1])];
	strcpy(str, argv[1]);


	//\(cons\s+((?:[^()]|\((?1)\))+)\s+((?:[^()]|\((?2)\))+)\)
	int intTree = 0;
	if (sscanf (str, "%i", &intTree) != 1) 
    	return buildTreeByString(str, 0, strlen(str));
	return buildTreeByInt(intTree);
}

Tree buildTreeByInt(int nbT)
{
	if (nbT <= 0) return cons(nil, nil, nil);
	return cons(nil, nil, buildTreeByInt(--nbT));
}

Tree buildTreeByString(char str[], unsigned int start, unsigned int end)
{	
	//STOP CONDITION// 
	int delta = end-start;
	if(cmpStrWithSubString(str, start, end, "nil")) return nil;
	if(str[start] != '(') 
	{
		//char *tmp = (char*)malloc(sizeof(char) * (delta)+1);
		char tmp[delta+1];
		for (size_t i = 0; i < delta; i++)
			tmp[i] = str[start+i];
		tmp[delta] = '\0';
		return cons(nil, tmp, nil);
	}
	

	//INITIALISATION//
	unsigned int  i = start;
	unsigned int parenthesesStack= 0;
	unsigned int spacesStack= 0;
    unsigned int startSubStr1 = 0, startSubStr2 = 0, endSubStr1 = 0, endSubStr2 = 0;
	bool isSubStr1 = true;

	//PROCESSING//
	//extract the two substrings of (cons A B) (extract A and B for build trees A, B and AB tree)
	while (i < end) 
	{
		/*if (i >= 255) {
			fprintf(stderr, "Argument too long ! Max 256 chars \n");
			exit(1);
		}*/

		if (str[i] == '(') ++parenthesesStack;
		if (str[i] == ' ' && parenthesesStack == 1 && i > 0 && str[i-1] != '(' && str[i-1] != ' ') 
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
	return cons(left, nil, right);
}

bool cmpStrWithSubString(char str[], unsigned int start, unsigned int end, char cmp[]) {
	if (end-start > strlen(cmp)) return false; 

	for(int i = 0; i<strlen(cmp); ++i)
	{
		if(str[i+start] != cmp[i]) return false;
	}
	
	return true;
}
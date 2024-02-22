#ifndef LINKEDLIST_H
#define LINKEDLIST_H

#include "Account.h"

using namespace std;

class LinkedList 
{
private:
	Account* head;

public:
	LinkedList();
	~LinkedList();
	void AddNode(int, float);
	void DeleteNode(int);
	void DisplayList();
	void DisplayNode(int);
	int CountList();
	bool IsEmpty();
	bool IsFull();
	void DestroyList();
};
#endif
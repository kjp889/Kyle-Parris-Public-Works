#include "LinkedList.h"

using namespace std;

// Implementing the default Constructor
LinkedList::LinkedList()
{
	head = NULL;
}

LinkedList::~LinkedList()
{
	DestroyList();
}

// Creating of the AddNode Method
void LinkedList::AddNode(int aNum, float aBal)
{
	// Create a new node
	Account* node = new Account(aNum, aBal);

	if (node != NULL)
	{
		if (head == NULL)
		{
			head = node;
		}
		else
		{
			Account* temp = head;

			while (temp->getNext() != NULL)
				temp = temp->getNext();
			temp->setNext(node);
		}
	}
	else
	{
		cout << "Error - Run out of memory while creating a new Node. " << endl;
	}
}

void LinkedList::AddNode(int aNum, float aBal)
{
	// Create a new node
	Account* node = new Account(aNum, aBal);

	if (node != NULL)
	{
		if (head == NULL)
		{
			head = node;
		}
		else
		{
			Account* temp = head;

			while (temp->getNext() != NULL)
				temp = temp->getNext();
			temp->setNext(node);
		}
	}
	else
	{
		cout << "Error - Run out of memory while creating a new Node. " << endl;
	}
}


// Creation of the DeleteNode Method
void LinkedList::DeleteNode(int key)
{
	Account* temp = head;
	Account* previousNode = NULL;

	while (temp != NULL)
	{
		if (temp->getAccountNum() == key)
		{
			if (temp == head)
			{
				head = temp->getNext();
				delete temp;
				return;
			}
			else
			{
				previousNode->setNext(temp->getNext());
				delete temp;
				return;
			}
		}
		previousNode = temp;
		temp = temp->getNext();
	}
}

	// Implementing the DisplayList Method
	void LinkedList::DisplayList()
	{
		Account* temp = head;
		while (temp != NULL)
		{
			temp->Display();
			temp = temp->getNext();
		}
	}

	// Implmenting the DisplayNode Method
	void LinkedList::DisplayNode(int key)
	{
		Account* temp = head;

		while (temp != NULL)
		{
			if (temp->getAccountNum() == key)
			{
				temp->Display();
				return;
			}
			temp = temp->getNext();
		}
		cout << "The requested Node was not found in the Linked List. " << endl;
	}

	int LinkedList::CountList()
	{
		int count = 0;

		Account* temp = head;

		while (temp != NULL)
		{
			temp = temp->getNext();
			++count;
		}
		return count;
	}

	// Implementing the IsEmpty Method
	bool LinkedList::IsEmpty()
	{
		if (head == NULL)
			return true;
		else 
			return false;
	}

	// Implementing the IsFull Method
	bool LinkedList::IsFull()
	{
		Account* node = new Account(0, 00.0);

		if (node == NULL)
			return true;
		else
		{
			delete node;
			return false;
		}
	}

	// Implement the DestroyList Method
	void LinkedList::DestroyList()
	{
		Account* temp;

		while (head != NULL)
		{
			temp = head;
			head = head->getNext();
			delete temp;
		}
	}
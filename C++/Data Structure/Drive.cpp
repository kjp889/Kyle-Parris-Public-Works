#include <iostream>
#include "LinkedList.h"


using namespace std;

int main()
{
	LinkedList account; // Create an empty linkedList

	int aNum;
	float aBal;

	cout << "Please enter information for 5 accounts " << endl;  // Please enter both account Number and Account Balance

	for (int count = 0; count < 5; count++)
	{
		cout << "Please enter account number : " << count + 1 << endl;
		cin >> aNum;
		cout << "\nPlease enter account balance : " << endl;
		cin >> aBal;

		account.AddNode(aNum, aBal);
	}

	// Display all nodes in the list
	account.DisplayList();
	

	// Call the CountList to see the amount of Nodes are in the list
	account.CountList();

	// Checking to  see if the list is Empty
	if (account.IsEmpty())
		cout << "The list is empty " << endl;
	else
		cout << "The list is not empty " << endl;


	// checking to see is the list Is Full
	if (account.IsFull())
		cout << "The list is Full" << endl;
	else
		cout << "The list is not full" << endl;




	return 0;
}
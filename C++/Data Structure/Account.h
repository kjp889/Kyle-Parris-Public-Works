#ifndef ACCOUNT_H
#define ACCOUNT_H

#include <iostream>

using namespace std;

class Account
{
private:
	int accountNum;
	float accountBal;
	Account* next;

	// Add methods without implementation
public:
	Account();
	Account(int, float);
	Account(Account&);
	~Account();// Destructor 
	int getAccountNum();
	void setAccountNum(int);
	float getAccountBal();
	void setAccountBal(float);
	Account* getNext();
	void setNext(Account*);
	void Display();
};
#endif
#include <iostream>

#include "Account.h"


using namespace std;

// Implementing the Default constructor
Account::Account()
{
	accountNum = 2001;
	accountBal = 2990.0f;
	next = NULL;
}

// Implementing the primary constructor
Account::Account(int accountNum, float accountBal)
{
	this->accountNum = accountNum;
	this->accountBal = accountBal;
	this->next = NULL;
}

// Implementing the Primary Constructor
Account::Account(Account& obj)
{
	this->accountNum = obj.accountNum;
	this->accountBal = obj.accountBal;
	this->next = NULL;
}

// Implementing the Destructor
Account::~Account()
{
	delete next;
	cout << "\n Delete node " << getAccountNum() << "," << getAccountBal() << endl;
}

// Implementing the gettets and setters or the accessors and mutators
int Account::getAccountNum()
{
	return accountNum;
}

void Account::setAccountNum(int accountNum)
{
	this->accountNum = accountNum;
}

float Account::getAccountBal()
{
	return accountBal;
}

void Account::setAccountBal(float accountBal)
{
	this->accountBal = accountBal;
}

Account* Account::getNext()
{
	return next;
}

void Account::setNext(Account* next)
{
	this->next = next;
}

// Implementation of the Display Method
void Account::Display()
{
	cout << "The Account number is :" << accountNum << endl;
	cout << "The Account Balance is : " << accountBal << endl;
}
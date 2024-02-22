/*
 * OfficeWorker.h
 *
 *  Created on: 28 Jan 2022
 *      Author: Kyle
 */

#ifndef OFFICEWORKER_H_
#define OFFICEWORKER_H_

#include "Date.h"

class OfficeWorker{
private:
	int employeeNumber;
	string firstName;
	string lastName;
	string department;
	Date doe; //date of employment
public:
	//Constructor
	OfficeWorker(int employeeNumber, string firstName, string lastName, string department, int day, int month, int year)
		: doe(day,month,year) {
		this->employeeNumber = employeeNumber;
		this->firstName = firstName;
		this->lastName = lastName;
		this->department = department;
	}

	//Destructor
	~OfficeWorker(){
		cout << "Destructor called" << endl;
	}


	//Mutators
	void setEmployeeNumber(int employeeNumber){
		this->employeeNumber = employeeNumber;
	}

	//Accessors
	int getEmployeeNumber(){
		return this->employeeNumber;
	}
	void display(){
		cout << "Employee Number: " << employeeNumber << endl;
		cout << "First Name: " << firstName << endl;
		cout << "Last Name: " << lastName << endl;
		cout << "Department: " << department << endl;
		cout << "Date Of Employment: "; doe.display();
	}

};



#endif /* OFFICEWORKER_H_ */

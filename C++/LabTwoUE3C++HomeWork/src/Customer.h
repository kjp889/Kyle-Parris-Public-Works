/*
 * Customer.h
 *
 *  Created on: 31 Jan 2022
 *      Author: Kyle
 */

#ifndef CUSTOMER_H_
#define CUSTOMER_H_

#include "Agent.h"

class Customer{
private:
	string firstName;
	string lastName;
	string address;
	int idNum;
	Agent agent;

public:
	//Constructor
	Customer(string firstName, string lastName, string address, int idNum, string agentName, string teleNumber) : agent(agentName, teleNumber) {
		this->firstName = firstName;
		this->lastName = lastName;
		this->address = address;
		this->idNum = idNum;
	}

	//Destructor
	~Customer(){
		cout << "Program End" << endl;
	}

	//Mutators or Setters
	void setFirstName(string firstName) {
		this->firstName = firstName;
	}
	void setLastName(string lastName) {
		this->lastName = lastName;
	}
	void setAddress(string address) {
		this->address = address;
	}
	void setIdNum(int idNum) {
		this->idNum = idNum;
	}

	//Accessors or Getters
	string getFirstName() {
		return firstName;
	}
	string getLastName() {
		return lastName;
	}
	string getAddress() {
		return address;
	}
	int getIdNum() {
		return idNum;
	}

	void display(){
		cout << "Name: " << firstName << " " << lastName << endl;
		cout << "Address: " << address << endl;
		cout << "ID Number: " << idNum << endl;
		agent.display();
	}

};




#endif /* CUSTOMER_H_ */

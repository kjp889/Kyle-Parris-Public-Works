/*
 * Main.cpp
 *
 *  Created on: 28 Jan 2022
 *      Author: Kyle
 */

#include <iostream>
using namespace std;

#include "OfficeWorker.h"

int main(){

	OfficeWorker obj1(1001,"Kyle","Parris","SCIT",28,1,2022);
	obj1.display();
	obj1.setEmployeeNumber(1002);
	obj1.display();
	int idNum = obj1.getEmployeeNumber();
	cout << "ID: " << idNum << endl;

	return 0;
}

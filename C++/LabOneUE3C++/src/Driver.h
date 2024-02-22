/*
 * Driver.h
 *
 *  Created on: 21 Jan 2022
 *      Author: Kyle
 */
#include <iostream>
using namespace std;

#ifndef DRIVER_H_
#define DRIVER_H_

class Driver{
private:
	int licenseNumber;
	int points;

public:
	Driver(int licenseNumber, int points){
		this->licenseNumber = licenseNumber;
		this->points = points;
	}
	void addPoints(int points){
		this->points += points;
	}
	void clearPoints(){
		this->points = 0;
	}
	void viewTotalPoints(){
		cout << "License No: " << licenseNumber << endl;
		cout << "Total Points Accumulated: " << points << endl;
	}
	void subtractPoints(int points){
		this->points -= points;
	}

};



#endif /* DRIVER_H_ */

/*
 * TransponderUnit.h
 *
 *  Created on: 4 Feb 2022
 *      Author: Kyle
 */

#ifndef TRANSPONDERUNIT_H_
#define TRANSPONDERUNIT_H_

#include <iostream>
using namespace std;

class TransponderUnit{

private:
	static int totalNumberUnits;
public:
	TransponderUnit(){
		++totalNumberUnits;
	}
	TransponderUnit(int totalNumberUnits){
		this->totalNumberUnits = totalNumberUnits;
	}
	TransponderUnit(TransponderUnit &transponderUnit){
		this->totalNumberUnits = transponderUnit.totalNumberUnits;
	}
	void send(){
	}
	void recieve(){
	}
	void display(){
		cout << "Total Number of Units on Grid: " << totalNumberUnits << endl << endl;
	}
	void setTotalNumberUnits(int totalNumberUnits){
		this->totalNumberUnits = totalNumberUnits;
	}
	int getTotalNumberUnits(){
		return totalNumberUnits;
	}
};

//Initializing static member outside the class
int TransponderUnit::totalNumberUnits = 0;

#endif /* TRANSPONDERUNIT_H_ */

/*
 * Main.cpp
 *
 *  Created on: 21 Jan 2022
 *      Author: Kyle
 */

#include "Driver.h"

int main(){
	Driver A(12345, 0);
	A.viewTotalPoints();
	A.addPoints(5);
	A.viewTotalPoints();
	A.addPoints(3);
	A.viewTotalPoints();
	A.clearPoints();
	A.viewTotalPoints();

	cout << endl;//adds blank line

	Driver *B = new Driver(6789, 0);
	B->viewTotalPoints();
	B->addPoints(1);
	B->viewTotalPoints();

	return 0;
}



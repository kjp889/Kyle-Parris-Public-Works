/*
 * MeterDriver.cpp
 *
 *  Created on: 4 Feb 2022
 *      Author: Kyle
 */

#include<iostream>
using namespace std;
#include "ExperimentalSmartPowerMeter.h"

int main(){

	ExperimentalSmartPowerMeter meter_A;
	meter_A.display();

	ExperimentalSmartPowerMeter *meterA = new ExperimentalSmartPowerMeter();
	meterA->display();

	ExperimentalSmartPowerMeter *meterB = new ExperimentalSmartPowerMeter("12345", 500);
	meterB->display();

	ExperimentalSmartPowerMeter *meterC = new ExperimentalSmartPowerMeter(*meterB);
	meterC->display();

	return 0;
}



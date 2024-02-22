/*
 * ExperimentalSmartPowerMeter.h
 *
 *  Created on: 4 Feb 2022
 *      Author: Kyle
 */

#ifndef EXPERIMENTALSMARTPOWERMETER_H_
#define EXPERIMENTALSMARTPOWERMETER_H_

#include <iostream>
using namespace std;
#include"TransponderUnit.h"

class ExperimentalSmartPowerMeter{

private:
	string serialNumber;
	int electricityConsumption;
	TransponderUnit transponderUnit;

public:
	ExperimentalSmartPowerMeter(){
		serialNumber = "000000";
		electricityConsumption = 0;
		transponderUnit.setTotalNumberUnits(transponderUnit.getTotalNumberUnits());
	}
	ExperimentalSmartPowerMeter(string serialNumber, int electricityConsumption){
		this->electricityConsumption = electricityConsumption;
		this->serialNumber = serialNumber;
		transponderUnit.getTotalNumberUnits();
	}
	ExperimentalSmartPowerMeter(ExperimentalSmartPowerMeter &obj){
		this->electricityConsumption = obj.electricityConsumption;
		this->serialNumber = obj.serialNumber;
		transponderUnit.setTotalNumberUnits(obj.transponderUnit.getTotalNumberUnits());
	}
	void increment(){
		++electricityConsumption;
	}
	void display(){
		cout << "Serial Number: " << serialNumber << endl;
		cout << "Electricity Consumption: " << electricityConsumption << endl;
		transponderUnit.display();
	}
	void setSerialNumber(string serialNumber){
		this->serialNumber = serialNumber;
	}
	string getSerialNumber(){
		return serialNumber;
	}
	void setElectricityConsumption(int electricityConsumption){
		this->electricityConsumption = electricityConsumption;
	}
	int getElectricityConsumption(){
		return electricityConsumption;
	}

};



#endif /* EXPERIMENTALSMARTPOWERMETER_H_ */

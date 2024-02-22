/*
 * Date.h
 *
 *  Created on: 28 Feb 2022
 *      Author: Kyle
 */

#ifndef SRC_DATE_H_
#define SRC_DATE_H_

#include <iostream>
#include <string>

using namespace std;

class Date{
private:
	int day;
	int month;
	int year;

public:
	Date(){
		this->day = 1;
		this->month = 1;
		this->year = 1999;
	}

	Date(int day, int month, int year){
		this->day = day;
		this->month = month;
		this->year = year;
	}

	Date(Date &date){
			this->day = date.day;
			this->month = date.month;
			this->year = date.year;
		}

	int getDay(){
		return day;
	}

	void setDay(int day) {
		this->day = day;
	}

	int getMonth(){
		return month;
	}

	void setMonth(int month) {
		this->month = month;
	}

	int getYear() {
		return year;
	}

	void setYear(int year) {
		this->year = year;
	}

	string toString(){
		return to_string(day) + "/" + to_string(month) + "/" + to_string(year) + "\n";
	}

	void show() {
		cout << "Date: " << day << "/" << month << "/" << year << endl;
	}
};



#endif /* SRC_DATE_H_ */

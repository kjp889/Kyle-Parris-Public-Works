/*
 * Date.h
 *
 *  Created on: 28 Jan 2022
 *      Author: Kyle
 */

#ifndef DATE_H_
#define DATE_H_

class Date{
private:
	int day;
	int month;
	int year;
public:
	Date(int day, int month, int year){
		this->day = day;
		this->month = month;
		this->year = year;
	}
	void display(){
		cout << day << "/" << month << "/" << year << endl;
	}
};




#endif /* DATE_H_ */

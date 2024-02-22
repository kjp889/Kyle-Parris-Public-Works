/*
 * Fraction.h
 *
 *  Created on: 4 Feb 2022
 *      Author: Kyle
 */

#ifndef FRACTION_H_
#define FRACTION_H_

#include <iostream>
using namespace std;

class Fraction{

private:
	int numerator;
	int denominator;

public:
	Fraction(){
		denominator = 4;
		numerator = 1;
	}

	Fraction(int denominator, int numerator){
		this->denominator = denominator;
		this->numerator = numerator;
	}

	Fraction(Fraction &f){
		this->denominator = f.denominator;
		this->numerator = f.numerator;
	}

	int getDenominator(){
		return denominator;
	}

	void setDenominator(int denominator) {
		this->denominator = denominator;
	}

	int getNumerator(){
		return numerator;
	}

	void setNumerator(int numerator) {
		this->numerator = numerator;
	}

	Fraction simplify(){

	}

	void display(){
		cout << toString()  << endl;
	}

	string toString(){
		return " " + numerator + "/" + denominator;
	}


};

#endif

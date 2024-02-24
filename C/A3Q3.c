//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 15/10/2020
//DESCRIPTION: Portfolio Continuous Assessment 3 Question 2

#include <stdio.h>
int main()
{ //Identifies the start of the function

	float income, rate, rate1, tax, net; // Defines the variable
	
	//Output Statement
	printf ("Enter income: "); 
	//Input Statement
	scanf ("%f" ,&income);

	//Selection Statements
	if (income < 796536)
		{ rate=0; }
	else
		if (income > 6000000)
			{ rate=30; }
		else	
			{ rate=25; }
	rate1 = rate/100;
	tax = income * rate1;
	net = income - tax;
	printf ("Income is $%.2f, Tax Rate is %.2f%%, Tax is $%.2f, Salary is $%.2f", income, rate, tax, net);

	return 0;
} //Ends the function

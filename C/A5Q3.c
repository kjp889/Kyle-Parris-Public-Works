//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 1/11/2020
//DESCRIPTION: Portfolio Continuous Assessment 5 Question 3

#include <stdio.h>
int main()
{ //Identifies the start of the function
	int num = 1; 
	float sum = 0, gpa, avg; // Defines the variables
	
	// Processing Statements
	while (num <= 10)
	{
		printf ("Enter student's G.P.A ");
		scanf ("%f", &gpa);
		sum = sum + gpa;
		num = num + 1;
	}
	
	avg = sum / 10;
	printf ("Class average is %.2f", avg);
	
	return 0;
} //Ends the function

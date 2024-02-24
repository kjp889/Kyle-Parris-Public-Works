//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 15/10/2020
//DESCRIPTION: Portfolio Continuous Assessment 3 Question 2

#include <stdio.h>
int main()
{ //Identifies the start of the function

	float angle; // Defines the variable
	
	//Output Statement
	printf ("Enter the largest angle in the triangle: "); 
	//Input Statement
	scanf ("%f" ,&angle);

	//Selection Statements
	if (angle < 90 )
		{ printf ("ACUTE TRIANGLE"); }
	else
		if (angle > 90 )
			{ printf ("OBTUSE TRIANGLE"); }
		else	
			{ printf ("RIGHT ANGLE TRIANGLE"); }
	
	return 0;
} //Ends the function

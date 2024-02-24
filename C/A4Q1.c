//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 25/10/2020
//DESCRIPTION: Portfolio Continuous Assessment 4 Question 1

#include <stdio.h>
int main()
{ //Identifies the start of the function

	float length, height; // Defines the variables
	
	//Output Statement
	printf ("Enter vehicle length: "); 
	//Input Statement
	scanf ("%f" ,&length);
	//Output Statement
	printf ("Enter vehicle height: "); 
	//Input Statement
	scanf ("%f" ,&height);
	
	//Processing Statements
	if (height < 1.7)
		{ printf ("Class 1"); }
	else
		if (length < 5.5)
			{ printf ("Class 2"); }
		else	
			{ printf ("Class 3"); }
	
	return 0;
} //Ends the function

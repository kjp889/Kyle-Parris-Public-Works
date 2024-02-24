//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 25/09/2020
//DESCRIPTION: Portfolio Continuous Assessment 2 Question 4

#include <stdio.h>

int main()
{ //Identifies the start of the function

	float clevel, used; // Defines the variables num as FLOAT
	
	//Output Statement
	printf ("Current level of water: "); 
	//Input Statement
	scanf ("%f",&clevel); 
	
	//Output Statement
	printf ("The amount of water used: ");
	//Input Statement
	scanf ("%f",&used);
	
	//Calculations
	clevel= clevel-used;
	
	//Selection Statements
	if (clevel <= 80)
		{
			printf ("ALERT water level below 80Mgal, %fMgal remaining.", clevel);
		}
	else
		{
			printf ("Water level is satisfactory, %fMgal remaining.", clevel);
		}
		
	return 0;
} //Ends the function

//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 25/09/2020
//DESCRIPTION: Portfolio Continuous Assessment 2 Question 2

#include <stdio.h>

int main()
{//Identifies the start of the function

	float gpa;// Defines the variables num as REAL
	
	//Output Statement
	printf ("Enter the student's GPA: ");//Prompts the user to enter the GPA
	
	//Input Statement
	scanf ("%f",&gpa);//Reads the number enters by the user
	
	//Selection Statements
	if (gpa>=3.45)
		{
			printf ("First Class Honours");
		}
			
	return 0;
}//Ends the function

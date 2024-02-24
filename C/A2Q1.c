//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 25/09/2020
//DESCRIPTION: Portfolio Continuous Assessment 2 Question 1

#include <stdio.h>

int main()
{//Identifies the start of the function

	int num;// Defines the variables num as INTEGER
	
	//Output Statement
	printf ("Enter a NUMBER: ");//Prompts the user to enter a number
	
	//Input Statement
	scanf ("%d",&num);//Reads the number enters by the user
	
	//Selection Statements
	if (num%2==0)
		{
			printf ("EVEN");
		}
	else
		{
			printf ("ODD");
		}
		
	return 0;
}//Ends the function

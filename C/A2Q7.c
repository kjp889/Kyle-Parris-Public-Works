//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 25/09/2020
//DESCRIPTION: Portfolio Continuous Assessment 2 Question 7

#include <stdio.h>
int main()
{ //Identifies the start of the function

	int num1,num2,num3,num4; // Defines the variables num1, num2, num3, num4 as INTEGER
	
	//Output Statement
	printf ("Enter Four Numbers: "); 
	//Input Statement
	scanf ("%d%d%d%d" ,&num1,&num2,&num3,&num4);

	//Selection Statements
	if (num1>=5)
		{ num1=9-num1; }
	if (num2>=5)
		{ num2=9-num2; }
	if (num3>=5)
		{ num3=9-num3; }
	if (num4>=5)
		{ num4=9-num4; }
	
	//Output Statement
	printf ("%d,%d,%d,%d" ,num1,num2,num3,num4);
	return 0;
} //Ends the function

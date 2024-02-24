//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 25/09/2020
//DESCRIPTION: Portfolio Continuous Assessment 2 Question 8

#include <stdio.h>
int main()
{ //Identifies the start of the function

	char vacType; // Defines the variable vacType as CHARACTER
	
	//Output Statement
	printf ("Enter vacType: "); 
	//Input Statement
	scanf ("%c" ,&vacType);

	//Selection Statements
	if (vacType == 'C'|| vacType =='c')
		{ printf ("Cruise"); }
	if (vacType == 'H'|| vacType =='h')
		{ printf ("Hotel"); }
	if (vacType == 'F'|| vacType =='f')
		{ printf ("Flight"); }
	if (vacType != 'F'&& vacType !='f'&& vacType != 'H'&& vacType !='h'&& vacType != 'C'&& vacType !='c')
		{ printf ("Invalid"); }
	
	return 0;
} //Ends the function

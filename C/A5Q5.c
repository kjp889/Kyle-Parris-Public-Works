//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 1/11/2020
//DESCRIPTION: Portfolio Continuous Assessment 5 Question 5

#include <stdio.h>
int main()
{ //Identifies the start of the function
	int num = 1, inte; 
	
	printf ("Enter an integer: ");
	scanf ("%d", &inte);
	while (num <= inte)
	{
		if (inte % num == 0)
			{ printf ("%d is a factor\n", num);}
		num = num + 1;
	}
	
	return 0;
} //Ends the function

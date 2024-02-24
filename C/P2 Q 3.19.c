//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 05/09/2021
//DESCRIPTION: Question 3.19

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>

int main()
{
	float sales;
	printf ("Enter sales in dollars (-1 to end): ");
	scanf ("%f",&sales);
	while (sales != -1)
	{
		printf ("Salary is: %.2f",200+(0.09*sales));
		printf ("\nEnter sales in dollars (-1 to end): ");
		scanf ("%f",&sales);
	}
	return 0;
}

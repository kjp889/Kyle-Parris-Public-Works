//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 05/09/2021
//DESCRIPTION: Question 3.20

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>

int main()
{
	float principal, rate, days;
	printf ("Enter loan principal (-1 to end): ");
	scanf ("%f",&principal);
	while (principal != -1)
	{
		printf ("Enter interest rate: ");
		scanf ("%f",&rate);
		printf ("Enter term of the loan in days: ");
		scanf ("%f",&days);
		printf ("The interest charge is $%.2f",(principal*rate*days)/365);
		printf ("\nEnter loan principal (-1 to end): ");
		scanf ("%f",&principal);
	}
	return 0;
}

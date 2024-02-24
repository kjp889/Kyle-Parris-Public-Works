//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 05/09/2021
//DESCRIPTION: Question 3.21

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>

int main()
{
	float hours, overTime, rate;
	printf ("Enter # of hours worked (-1 to end): ");
	scanf ("%f",&hours);
	while (hours != -1)
	{
		printf ("Enter hourly rate of the worker ($00.00): ");
		scanf ("%f",&rate);
		overTime = hours - 40;
		if (overTime >= 0)
		{
			printf ("Salary is $%.2f",((hours*rate)+(overTime*rate*.5)));
		}
		else
		{
			printf ("Salary is $%.2f",(hours*rate));
		}
		printf ("\nEnter # of hours worked (-1 to end): ");
		scanf ("%f",&hours);
	}
	return 0;
}

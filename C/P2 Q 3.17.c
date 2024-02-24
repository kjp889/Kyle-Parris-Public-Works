//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 05/09/2021
//DESCRIPTION: Question 3.17

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>

int main()
{
	float gal= 0,mile = 0,totMile=0,totGal=0;
	printf ("please enter gallon used (-1 to end): ");
	scanf ("%f",&gal);
	while (gal>-1)
	{
		printf ("please enter the miles driven: ");
		scanf ("%f", &mile);
		printf ("The miles/gallon for this tank was %.2f",mile/gal);
		totMile = totMile + mile;
		totGal = totGal + gal;
		printf ("\nplease enter gallon used (-1 to end): ");
		scanf ("%f",&gal);
	}
	printf("the overall avereage miles/gallon was %.2f",totMile/totGal);
	return 0;
}

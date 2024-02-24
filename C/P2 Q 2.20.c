//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 30/09/2021
//DESCRIPTION: Question 2.20

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>

int main()
{
	float radi, dia, circum, area;
	const pi = 3.14159;
	
	printf ("Enter Circle Radius: ");
	scanf ("%f", &radi);
	
	printf("Diameter is %.2f \nCircumference is %.2f \nArea is %.2f",2*radi,2*pi*radi,pi*radi*radi);
}

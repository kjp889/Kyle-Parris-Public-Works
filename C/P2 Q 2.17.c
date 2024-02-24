//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 30/09/2021
//DESCRIPTION: Question 2.17

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>

int main()
{
	float u, a, t, v, s;//variable descriptions
	
	//INPUT
	printf ("Enter the INITIAL VELOCITY (u) of the object: ");
	scanf ("%f", &u);
	printf ("Enter the ACCELERATION (a) of the object: ");
	scanf ("%f", &a);
	printf ("Enter the ELAPSED TIME (t): ");
	scanf ("%f", &t);
	
	//ARITHMETICS
	v = u + a*t;
	s = (u*t)+(0.5*a*t*t);
	
	//OUTPUT
	printf ("The FINAL VELOCITY (v) = %.2f \nThe DISTANCE TRAVELED (s) = %.2f",v,s);
}

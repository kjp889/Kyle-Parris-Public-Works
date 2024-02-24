//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 08/10/2021
//DESCRIPTION: 5.15

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>
#include <math.h>

double hypotenuse(double num1, double num2);

int main()
{
	double width, height, hypot;
	
	printf ("Enter the Height of the Triangle: ");
	scanf ("%lf",&height);
	printf ("Enter the Width of the Triangle: ");
	scanf ("%lf",&width);
	
	hypot=hypotenuse(height, width);
	
	printf("The Hypotenuse of the triangle is %.2lf",hypot);
	
	return 0;
}

double hypotenuse(double num1, double num2)
{
	double hypoten,sqnum1,sqnum2,sqhypot;
	
	sqnum1 = num1*num1;
	sqnum2 = pow(num2,2);
	sqhypot = sqnum1+sqnum2;
	hypoten = pow(sqhypot,.5);
	
	return hypoten;
}

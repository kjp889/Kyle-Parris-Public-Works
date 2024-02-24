//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 30/09/2021
//DESCRIPTION: Question 2.23

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>

int main()
{
	int num1, num2, num3, num4, num5, small, large;
	
	printf ("Enter five numbers: ");
	scanf ("%d%d%d%d%d",&num1,&num2,&num3,&num4,&num5);
	
	small = num1;
	if (num2 < small)
	{
		small = num2;
	}
	if (num3 < small)
	{
		small = num3;
	}
	if (num4 < small)
	{
		small = num4;
	}
	if (num5 < small)
	{
		small = num5;
	}
	
	large = num1;
	if (num2 > large)
	{
		large = num2;
	}
	if (num3 > large)
	{
		large = num3;
	}
	if (num4 > large)
	{
		large = num4;
	}
	if (num5 > large)
	{
		large = num5;
	}
	
	printf ("LARGEST is %d \nSMALLEST is %d",large,small);
}

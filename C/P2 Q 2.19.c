//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 30/09/2021
//DESCRIPTION: Question 2.19

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>

int main()
{
	int num1, num2, num3, sum, ave, prod, small, large;
	
	printf ("Input three different integers: ");
	scanf ("%d%d%d",&num1,&num2,&num3);
	
	sum = num1+num2+num3;
	ave = sum/3;
	prod = num1*num2*num3;
	
	small = num1;
	if (num2 < small)
	{
		small = num2;
	}
	if (num3 < small)
	{
		small = num3;
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
	
	printf ("Sum is %d \nAverage is %d \nProduct is %d \nSmallest is %d \nLargest is %d",sum,ave,prod,small,large);
}

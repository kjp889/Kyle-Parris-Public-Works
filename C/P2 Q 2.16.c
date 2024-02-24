//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 30/09/2021
//DESCRIPTION: Question 2.16

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>

int main()
{
	int num1, num2, sum, diff, prod, qout, mod;//variables descriptions
	
	printf ("Enter two numbers:");// promts user
	scanf ("%d%d",&num1,&num2);//stores user data
	
	//Arithmetics
	sum = num1+num2;
	diff = num1-num2;
	prod = num1*num2;
	qout = num1/num2;
	mod = num1%num2;
	
	//Output
	printf ("Sum = %d \nDifference = %d \nProduct = %d \nQuotient = %d \nRemainder = %d",sum,diff,prod,qout,mod);
}

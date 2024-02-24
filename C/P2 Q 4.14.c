//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 12/09/2021
//DESCRIPTION: Question 4.14

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>
#include <math.h>

int main()
{
	int num, prod=1;
	for (num=1;num<=5;num+=1)
	{
		prod *= num;
		printf ("the factorial of %d = %d\n",num,prod);	
	}
	return 0;
}

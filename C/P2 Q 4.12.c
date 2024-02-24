//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 10/09/2021
//DESCRIPTION: Question 4.12

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>
#include <math.h>

int main()
{
	int num, sum=0;
	for (num=2;num<=30;num+=2)
	{
		printf ("%d ",num);
		sum += num;
	}
	printf ("\n= %d",sum);
	return 0;
}

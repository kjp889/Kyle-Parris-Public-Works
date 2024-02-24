//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 08/10/2021
//DESCRIPTION: 5.17

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>
#include <math.h>

int multiple(int num1,int num2);

int main()
{
	int value1,value2,ans;
	printf("Enter first value(press '0' to exit): ");
	scanf("%d",&value1);
	
	while (value1!=0)
	{
		printf("Enter second value: ");
		scanf("%d",&value2);
		
		ans=multiple(value1,value2);
		
		if(ans==1)
		{
			printf("True");
		}
		else
		{
			printf("False");
		}
		
		printf("\nEnter first value(press '0' to exit): ");
		scanf("%d",&value1);	
	}
	
	return 0;
}

int multiple(int num1,int num2)
{
	if(num1%num2==0)
	{
		return 1;
	}
	else
	{
		return 0;
	}
}

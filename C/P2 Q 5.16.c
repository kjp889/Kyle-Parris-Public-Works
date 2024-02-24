//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 08/10/2021
//DESCRIPTION: 5.16

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>
#include <math.h>

int integerPower(int base, int exponent);

int main()
{
	int base,exponent,ans;
	
	printf("Enter the base number: ");
	scanf("%d",&base);
	printf("Enter the exponent: ");
	scanf("%d",&exponent);
	
	ans=integerPower(base,exponent);
	
	printf("The Answer is %d",ans);
	
	return 0;
}

int integerPower(int base, int exponent)
{
	int i,value=1;
	
	for(i=0;i<exponent;i++)
	{
		value = value * base;
	}
	
	return value;
}

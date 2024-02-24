//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 08/10/2021
//DESCRIPTION: 5.16 miss

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
	if(exponent==0)
	{
		return 1;
	}
	else
	{
		integerPower(base,exponent-1);
	}
}

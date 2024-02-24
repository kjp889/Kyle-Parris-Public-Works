//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 08/10/2021
//DESCRIPTION: 5.18

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>
#include <math.h>

int even(int num);

int main()
{
	int num,ans;
	
	do
	{
		printf("Enter a number (Press 0 to end): ");
		scanf("%d",&num);
		
		ans=even(num);
		
		if(num==0)
		{
			break;
		}
		else if(ans==0) 
		{
			printf("%d is ODD\n",num);
		}
		else
		{
			printf("%d is EVEN\n",num);
		}	
	}while(num!=0);
	
	
	return 0;
}

int even(int num)
{
	if(num%2==0)
	{
		return 1;
	}
	else
	{
		return 0;
	}
}

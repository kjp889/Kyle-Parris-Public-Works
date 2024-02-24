//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 24/09/2021
//DESCRIPTION: Question 6.11 Answer

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>
#include <math.h>

int main()
{
	int i,sum=0,large,small,arr[7];
	
	for(i=0;i<7;i++)
	{
		printf("Enter a number: ");
		scanf("%d",&arr[i]);
	}
	
	printf("Values are:");
	for(i=0;i<7;i++)
	{
		printf(" %d",arr[i]);
	}
	
	for(i=0;i<7;i++)
	{
		sum += arr[i];
	}
	printf("\nSum is %d",sum);
	
	large=arr[0];
	small=arr[0];
	for(i=1;i<7;i++)
	{
		if(arr[i]>large)
		{
			large=arr[i];
		}
		if(arr[i]<small)
		{
			small=arr[i];
		}
	}
	printf("\nLargest is %d \nSmallest is %d",large,small);
	
	printf("\nRevese Order is:");
	for(i=6;i>=0;i--)
	{
		printf(" %d",arr[i]);
	}
	
	return 0;	
}

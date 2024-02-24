//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 01/10/2021
//DESCRIPTION: Class Work

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>
#include <math.h>
#define SIZE 10

int main()
{
	int arr[SIZE],reverse[SIZE],i,Dcount=SIZE-1,num,index[SIZE],k=0;
	
	printf("Populate the array: ");
	for(i=0;i<SIZE;i++)
	{
		scanf("%d",&arr[i]);
	}
	
	printf("Array in order entered:");
	for(i=0;i<SIZE;i++)
	{
		printf("%d, ",arr[i]);
	}
	printf("\n");
	
	for(i=0;i<SIZE;i++)
	{
		reverse[i]=arr[Dcount];
		Dcount--;
	}
	
	printf("Array in reverse order:");
	for(i=0;i<SIZE;i++)
	{
		printf("%d, ",reverse[i]);
	}
	printf("\n");
	
	printf("Search for: ");
	scanf("%d",&num);
	for(i=0;i<SIZE;i++)
	{
		if(num==arr[i])
		{
			index[k]=i;
			k++;
		}
	}
	if(k==0)
	{
		printf("Value not found");
	}
	else
	{
		printf("Index of the search value is: ");
		for(i=0;i<k;i++)
		{
			printf("%d, ",index[i]);
		}
	}
	return 0;
}

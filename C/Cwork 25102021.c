//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 08/10/2021
//DESCRIPTION: Cwork 25/10/2021

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>
#include <math.h>

void exchange(int *num1Ptr,int *num2Ptr);
void ordered(int *num1Ptr,int *num2Ptr,int *num3Ptr);

int main()
{
	int num1,num2,num3;
	int *num1Ptr,*num2Ptr,*num3Ptr;
	
	printf("enter a number: ");
	scanf("%d",&num1);
	printf("enter another number: ");
	scanf("%d",&num2);
	
	num1Ptr = &num1;
	num2Ptr = &num2;
	
	printf("value %d the address of num1 before switch is %p\n",num1,num1Ptr);
	printf("value %d the address of num2 before switch is %p\n",num2,num2Ptr);
	
	exchange(num1Ptr,num2Ptr);
	
	printf("value %d the address of num1 after switch is %p\n",num1,num1Ptr);
	printf("value %d the address of num2 after switch is %p\n",num2,num2Ptr);
	
	printf("enter another number: ");
	scanf("%d",&num3);
	num3Ptr = &num3;
	
	printf("order before call:%d, %d, %d\n",*num1Ptr,*num2Ptr,*num3Ptr);
	ordered(num1Ptr,num2Ptr,num3Ptr);
	printf("order After call:%d, %d, %d\n",*num1Ptr,*num2Ptr,*num3Ptr);
	return 0;
}

void exchange(int *num1Ptr, int *num2Ptr)
{
	int hold;
	
	hold= *num1Ptr;
	*num1Ptr = *num2Ptr;
	*num2Ptr = hold;
}


void ordered(int *num1Ptr,int *num2Ptr,int *num3Ptr)
{
	int smallest,largest,middle;
	
	smallest=*num1Ptr;
	largest=*num3Ptr;
	
	if(*num2Ptr<smallest)
	{
		smallest = *num2Ptr;
	}
	else if(*num3Ptr<smallest)
	{
		smallest = *num3Ptr;
	}
	
	if(*num2Ptr>largest)
	{
		largest = *num2Ptr;
	}
	else if(*num1Ptr>largest)
	{
		largest = *num1Ptr;
	}
	
	
	if((*num2Ptr<largest)&&(*num2Ptr>smallest))
	{
		middle = *num2Ptr;
	}
	else if((*num3Ptr<largest)&&(*num3Ptr>smallest))
	{
		middle = *num3Ptr;
	}
	else if((*num1Ptr<largest)&&(*num1Ptr>smallest))
	{
		middle = *num1Ptr;
	}	
	
	*num1Ptr = smallest;
	*num2Ptr = middle;
	*num3Ptr = largest;
}

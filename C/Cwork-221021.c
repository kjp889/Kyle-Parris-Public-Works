#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>
#include <math.h>
#define SIZE 10

int total(int arr[]);
void update(int arry[]);

int main()
{
	int i,sum,num,numCount=1,numArray[SIZE];
	char ans;
	printf("Your are to enter TEN numbers\n");
	for(i=0;i<SIZE;i++)
	{
		printf("Enter Number %d: ",numCount++);
		scanf("%d",&num);
		numArray[i]=num;
	}
	do
	{
		sum=total(numArray);
		printf("Total of numbers in array is %d",sum);
		printf("\n____________________________________________\n");
		printf("\nDo you want to go again? \nEnter 'y' for yes and 'n' for no: ");
		ans=getch();
		printf("\n____________________________________________\n");
		if(ans == 'y')
		{
			system("@cls||clear");
			update(numArray);
		}
	}while(ans!='n');
	
	return 0;
}

int total(int arr[])
{
	int i,sum=0;
	for(i=0;i<SIZE;i++)
	{
		sum+=arr[i];	
	}
	return sum;
}

void update(int arry[])
{
	int i,numCount=1,num;
	printf("Enter a new set of numbers\n");
	for(i=0;i<SIZE;i++)
	{
		printf("Enter Number %d: ",numCount++);
		scanf("%d",&num);
		arry[i]=num;
	}
}


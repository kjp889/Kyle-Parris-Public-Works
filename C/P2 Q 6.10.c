//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 19/09/2021
//DESCRIPTION: Question 6.10

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>
#include <math.h>
#define BONUS 0.09
#define PAY 200

int main()
{
	int i,num,peop[9]={0};
	float sales,net;
	
	printf("Enter the number of salesperson: ");
	scanf ("%d",&num);
	
	for(i=0;i<num;i++)
	{
		printf("Enter the Sales made: ");
		scanf ("%f",&sales);
		
		net=PAY+(sales*BONUS);
		
		if(net>=200 && net<300)
		{
			peop[0]=peop[0]+1;
		}
		if(net>=300 && net<400)
		{
			peop[1]=peop[1]+1;
		}
		if(net>=400 && net<500)
		{
			peop[2]=peop[2]+1;
		}
		if(net>=500 && net<600)
		{
			peop[3]=peop[3]+1;
		}
		if(net>=600 && net<700)
		{
			peop[4]=peop[4]+1;
		}
		if(net>=700 && net<800)
		{
			peop[5]=peop[5]+1;
		}
		if(net>=800 && net<900)
		{
			peop[6]=peop[6]+1;
		}
		if(net>=900 && net<1000)
		{
			peop[7]=peop[7]+1;
		}
		if(net>=1000)
		{
			peop[8]=peop[8]+1;
		}
	}
	
	printf("\n$200-299\t%d\n$300-399\t%d\n$400-499\t%d\n$500-599\t%d\n",peop[0],peop[1],peop[2],peop[3]);
	printf("$600-699\t%d\n$700-799\t%d\n$800-899\t%d\n$900-999\t%d\n$1000 and over\t%d",peop[4],peop[5],peop[6],peop[7],peop[8]);
	
	return 0;
}

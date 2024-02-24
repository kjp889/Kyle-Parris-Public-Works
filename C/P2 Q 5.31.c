//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 15/10/2021
//DESCRIPTION: Question 5.31

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>
#include <math.h>

int flip(void);

int main()
{
	int count,coin,heads=0,tails=0;
	
	for(count=0;count<100;count++)
	{
		coin=flip();
		
		if(coin==1)
		{
			heads=heads+1;
		}
		else
		{
			tails=tails+1;
		}
	}
	
	printf("Number of Heads is %d\nNumber of Tails is %d",heads,tails);
	
	return 0;
}

int flip(void)
{
	if(rand()%2==0)
	{
		return 0;
	}
	else
	{
		return 1;
	}
}


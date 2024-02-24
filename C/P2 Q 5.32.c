//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 15/10/2021
//DESCRIPTION: Question 5.32

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>
#include <math.h>

int main()
{
	int num,genNum,again;
	char ans;
	
	genNum=rand()%1000+1;
	printf("%d\n",genNum);
	
	printf("I HAVE A NUMBER BETWEEN 1 and 1000\n");
	printf("Can you guess my number?\n");
	printf("Please type your first guess: ");
	scanf("%d",&num);
		
	while (num!=0)
	{
		if (genNum == num)
		{
			printf("Excellent! You guessed the number!\n");
			printf("Would you like to play again (y or n)?");
			ans=getch();
			if(ans=='y')
			{
				system("@cls||clear");
				again=main();
			}
			else
			{
				num=0;
			}
		}
		else if(genNum<num)
		{
			printf("Too high. Try again.");
			scanf("%d",&num);
		}
		else 
		{
			printf("Too low. Try again.");
			scanf("%d",&num);
		}
	}
	return 0;
}

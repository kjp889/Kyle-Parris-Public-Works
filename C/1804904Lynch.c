//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 09/10/2021
//DESCRIPTION: P2 Lab Test 1

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>
#include <math.h>

int main()
{
	int category,numItems,itemCount,i,c,foodCategory;
	float prices[99],weight[99],tax,totalPrice,totalWeight,ClothesBill,NonPerishFoodBill,PerishFoodBill,FinalBill=0;
	
	printf("Welcome to Turbo Shipping Company\n");
	printf("************************************************************\n");
	printf("Select the category of items you wish to ship:\n");
	printf("************ 1 for Clothing Items ************\n");
	printf("************ 2 for Food Items ****************\n");
	printf("************ 0 to Exit ***********************\n");
	printf("************************************************************\n");
	scanf("%d",&category);
	system("@cls||clear");
	
	while (category!=0)
	{
		NonPerishFoodBill=PerishFoodBill=ClothesBill=0;
		switch(category)
		{
			case 1:
				printf("Enter the number of clothing you wish to ship: ");
				scanf("%d",&numItems);
				itemCount=1;
				totalPrice=0;
				for(i=0;i<numItems;i++)
				{
					printf("Enter the price of the item%d: ",itemCount++);
					scanf("%f",&prices[i]);
					totalPrice+=prices[i];
				}
				if(totalPrice<20)
				{
					tax=0;
				}
				else
				{
					tax=totalPrice*.15;
				}
				ClothesBill=tax+totalPrice;
				printf("Your current bill for %d clothing items is $%.2f",numItems,ClothesBill);
				printf("\nPress ENTER to continue...");
			    while ((c = getchar()) != '\n' && c != EOF);
			    getchar();
			    system("@cls||clear");
				break;
				
			case 2:
				printf("************ 1 for Perishable Foods ************\n");
				printf("************ 2 for Non-Perishable Foods ********\n");
				printf("Select the category of food items you wish to ship:\n");
				scanf("%d",&foodCategory);
				system("@cls||clear");
				
				switch(foodCategory)
				{
					case 1:
						printf("Enter the number of perishable foods you wish to ship: ");
						scanf("%d",&numItems);
						itemCount=1;
						totalPrice=0;
						totalWeight=0;
						for(i=0;i<numItems;i++)
						{
							printf("Enter the price of the item%d: ",itemCount);
							scanf("%f",&prices[i]);
							printf("Enter the weight of the item%d: ",itemCount++);
							scanf("%f",&weight[i]);
							totalPrice+=prices[i];
							totalWeight+=weight[i];
						}
						
						if(totalPrice>30&&totalWeight<6)
						{
							tax=0;
						}
						else
						{
							tax=totalPrice*.10;
						}
						PerishFoodBill=tax+totalPrice;
						printf("Your current bill for %d perishable foods items of weight %.2fkg is $%.2f",numItems,totalWeight,PerishFoodBill);
						printf("\nPress ENTER to continue...");
					    while ((c = getchar()) != '\n' && c != EOF);
					    getchar();
					    system("@cls||clear");
						break;
						
					case 2:
						printf("Enter the number of non-perishable foods you wish to ship: ");
						scanf("%d",&numItems);
						itemCount=1;
						totalPrice=0;
						totalWeight=0;
						for(i=0;i<numItems;i++)
						{
							printf("Enter the price of the item%d: ",itemCount);
							scanf("%f",&prices[i]);
							printf("Enter the weight of the item%d: ",itemCount++);
							scanf("%f",&weight[i]);
							totalPrice+=prices[i];
							totalWeight+=weight[i];
						}
						
						if(totalPrice>=20&&totalWeight<6)
						{
							tax=0;
						}
						else if(totalPrice<25)
						{
							tax=totalPrice*.05;
						}
						else if(totalPrice<30)
						{
							tax=totalPrice*.10;
						}
						else if(totalPrice<40)
						{
							tax=totalPrice*.30;
						}
						else 
						{
							tax=totalPrice*.30;
						}
						NonPerishFoodBill=tax+totalPrice;
						printf("Your current bill for %d non-perishable foods items of weight %.2fkg is $%.2f",numItems,totalWeight,NonPerishFoodBill);
						printf("\nPress ENTER to continue...");
					    while ((c = getchar()) != '\n' && c != EOF);
					    getchar();
					    system("@cls||clear");
						break;
					default:
						printf("Not an exceptable category");
						printf("\nPress ENTER to continue...");
					    while ((c = getchar()) != '\n' && c != EOF);
					    getchar();
					    system("@cls||clear");
				}
				break;
				
			default:
				printf("Not an exceptable category");
				printf("\nPress ENTER to continue...");
			    while ((c = getchar()) != '\n' && c != EOF);
			    getchar();
			    system("@cls||clear");
		}
	FinalBill+=NonPerishFoodBill+PerishFoodBill+ClothesBill;
	printf("Select the category of items you wish to ship:\n");
	printf("************ 1 for Clothing Items ************\n");
	printf("************ 2 for Food Items ****************\n");
	printf("************ 0 to Exit ***********************\n");
	printf("************************************************************\n");
	scanf("%d",&category);
	system("@cls||clear");	
	}
	printf("Your final shipping bill amounts is $%.2f",FinalBill);
	
	return 0;
}

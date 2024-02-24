//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 09/10/2021
//DESCRIPTION: P2 Lab Test 1

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>
#include <math.h>

typedef struct{
	int day;
	int month;
	int year;
}DATE;

typedef struct{
	char fName[30];
	char lName[30];
}NAME;

typedef struct cust_rec{
	NAME name;
	char contact[30];
	double AccBalance;
	DATE DateOfLastPayment;
}CUSTOMER;

void get_records(CUSTOMER cust_arr[], int arr_size);
void show_record(CUSTOMER customer);
void show_customers(CUSTOMER *Ptr);

int main()
{
	int c,i,numData=40;
	CUSTOMER customerdata[40];
	CUSTOMER *custPtr;
	
	custPtr=customerdata;
	
	for(i=0;i<40;i++)
	{
		strcpy(customerdata[i].name.fName,"\0");
		strcpy(customerdata[i].name.lName,"\0");
		strcpy(customerdata[i].contact,"\0");
		customerdata[i].AccBalance=0;
		customerdata[i].DateOfLastPayment.day=0;
		customerdata[i].DateOfLastPayment.month=0;
		customerdata[i].DateOfLastPayment.year=0;
	}
	
	printf("Enter the number of customer records you wish to enter(less than 40): ");
	scanf("%d",&numData);
	
	get_records(customerdata, numData);
	
	printf("\nPress ENTER to continue...");
	while ((c = getchar()) != '\n' && c != EOF);
		getchar();
	system("@cls||clear");
	
	show_customers(custPtr);
}

void get_records(CUSTOMER cust_arr[], int arr_size)
{
	int i;
	
	for(i=0;i<arr_size;i++)
	{
		printf("Enter the customer's name eg.(Firstname Lastname): ");
		scanf("%s %s",cust_arr[i].name.fName,cust_arr[i].name.lName);
		printf("Enter the customer's contact(email or telephone): ");
		scanf("%s",cust_arr[i].contact);
		printf("Enter the customer's account balance: ");
		scanf("%ld",&cust_arr[i].AccBalance);
		printf("Enter the date of last payment(DD/MM/YYYY): ");
		scanf("%d/%d/%d",&cust_arr[i].DateOfLastPayment.day,&cust_arr[i].DateOfLastPayment.month,&cust_arr[i].DateOfLastPayment.year);
		printf("\n__________________________________________________________\n");
	}
}

void show_record(CUSTOMER customer)
{
	printf("Name: %s %s",customer.name.fName,customer.name.lName);
	printf("\nContact: %s",customer.contact);
	printf("\nAccount Balance: %ld",customer.AccBalance);
	printf("\nDate of Last Payment: %d/%d/%d",customer.DateOfLastPayment.day,customer.DateOfLastPayment.month,customer.DateOfLastPayment.year);
	printf("\n__________________________________________________________\n");
}

void show_customers(CUSTOMER *Ptr)
{
	while(Ptr->name.fName!='\0')
	{
		show_record(*Ptr);
		Ptr++;
	}
}



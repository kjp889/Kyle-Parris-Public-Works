#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>
#include <math.h>

typedef struct{
	int DAY;
	int MONTH;
	int YEAR;
}DATE;

typedef struct{
	char fName[30];
	char lName[30];
}NAME;

typedef struct{
	NAME StuName;
	DATE DOB;
	char Course[30];
	DATE DateOfEnrollment;
}RECORD;

RECORD student[10];

void dataEntry(void);
void printData(void);

int main()
{
	int choice;
	do
	{
		printf("1 For Data Entry\n2 For Data Viewing\n0 To Exit\nPlease select an option: ");
		scanf("%d",&choice);
		system("@cls||clear");
		
		switch(choice)
		{
			case 1:
				dataEntry();
				break;
			case 2:
				printData();
				break;
			case 0:
				return 0;
				break;
			default:
				printf("Invalid Selection");
		}		
	}while(choice!=0);
}

void dataEntry(void)
{
	int i;

	for(i=0;i<10;i++)
	{
		printf("Enter the students Name: ");
		scanf("%s %s",student[i].StuName.fName,student[i].StuName.lName);
		printf("Enter the %s's Date of Birth(dd/mm/yyyy): ",student[i].StuName.fName);
		scanf("%2d/%2d/%4d",&student[i].DOB.DAY,&student[i].DOB.MONTH,&student[i].DOB.YEAR);
		printf("Enter the students Course of Study: ");
		scanf("%s",student[i].Course);
		printf("Enter the student's Date of Enrollment(dd/mm/yyyy): ");
		scanf("%2d/%2d/%4d",&student[i].DateOfEnrollment.DAY,&student[i].DateOfEnrollment.MONTH,&student[i].DateOfEnrollment.YEAR);
		system("@cls||clear");
	}	
}

void printData(void)
{
	char c;
	int i;
	
	system("@cls||clear");
	
	for(i=0;i<10;i++)
	{
		printf("Students Name: %s %s",student[i].StuName.fName,student[i].StuName.lName);
		printf("\nStudents Date of Birth: %d/%d/%d",student[i].DOB.DAY,student[i].DOB.MONTH,student[i].DOB.YEAR);
		printf("\nStudents Course of Study: %s",student[i].Course);
		printf("\nStudents Date of Enrollment: %d/%d/%d",student[i].DateOfEnrollment.DAY,student[i].DateOfEnrollment.MONTH,student[i].DateOfEnrollment.YEAR);
		printf("\n_____________________________________________\n");
	}
	
	printf("\nPress ENTER to continue...");
	while ((c = getchar()) != '\n' && c != EOF);
	    getchar();
	system("@cls||clear");	
}

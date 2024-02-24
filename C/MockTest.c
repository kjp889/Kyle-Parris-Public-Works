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
	int idNum;
	NAME name;
	DATE dob;
}Student;

void display(Student *Ptr);
void findStudent(Student *Ptr, int id);

int main()
{
	Student students[3];
	Student *stuPtr;
	
	stuPtr=students;
	
	students[0].idNum=100;
	strcpy(students[0].name.fName,"Tom");
	strcpy(students[0].name.lName,"Jones");
	students[0].dob.DAY=25;
	students[0].dob.MONTH=12;
	students[0].dob.YEAR=2003;
	
	students[1].idNum=101;
	strcpy(students[1].name.fName,"Paul");
	strcpy(students[1].name.lName,"Brown");
	students[1].dob.DAY=05;
	students[1].dob.MONTH=01;
	students[1].dob.YEAR=2001;
	
	students[2].idNum=102;
	strcpy(students[2].name.fName,"Ava");
	strcpy(students[2].name.lName,"Carty");
	students[2].dob.DAY=25;
	students[2].dob.MONTH=12;
	students[2].dob.YEAR=1996;
	
	display(stuPtr);
	
	findStudent(stuPtr,101);
}

/*void display(Student *Ptr)
{
	int i;
	
	for(i=0;i<3;i++)
	{
		printf("ID: %d",Ptr[i].idNum);
		printf("\nName: %s %s",Ptr[i].name.fName,Ptr[i].name.lName);
		printf("\nDate of Birth: %d/%d/%d",Ptr[i].dob.DAY,Ptr[i].dob.MONTH,Ptr[i].dob.YEAR);
		printf("\n________________________________________\n");
	}
}*/

void display(Student *Ptr)
{
	int i;
	
	for(i=0;i<3;i++)
	{
		printf("ID: %d",Ptr->idNum);
		printf("\nName: %s %s",Ptr->name.fName,Ptr->name.lName);
		printf("\nDate of Birth: %d/%d/%d",Ptr->dob.DAY,Ptr->dob.MONTH,Ptr->dob.YEAR);
		printf("\n________________________________________\n");
		Ptr++;
	}
}

void findStudent(Student *Ptr, int id)
{
	int i;
	
	for(i=0;i<3;i++)
	{
		if(Ptr[i].idNum==id)
		{
			printf("ID: %d",Ptr[i].idNum);
			printf("\nName: %s %s",Ptr[i].name.fName,Ptr[i].name.lName);
			printf("\nDate of Birth: %d/%d/%d",Ptr[i].dob.DAY,Ptr[i].dob.MONTH,Ptr[i].dob.YEAR);	
		}
	}
}

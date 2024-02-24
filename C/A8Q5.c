//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 25/11/2020
//DESCRIPTION: Portfolio Continuous Assessment 8 Question 5

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>

int main()
{
	int clas, stu;
	float grade1, grade2, grade3, grades, stuAvg, classAvg, avg = 0;
	char fname[50], lname[60];
	
	for (clas = 1; clas <= 3; clas ++)
	{
		for (stu = 1; stu <= 10; stu ++)
		{
			printf ("Enter Students First Name:");
			scanf ("%s",fname);
			printf ("Enter Students Last Name:");
			scanf ("%s",lname);
			printf ("Enter Students 1ST grade:");
			scanf ("%f",&grade1);
			printf ("Enter Students 2ND grade:");
			scanf ("%f",&grade2);
			printf ("Enter Students 3RD grade: ");
			scanf ("%f",&grade3);
			grades = grade1 + grade2 + grade3;
			stuAvg = grades / 3;
			avg = stuAvg + avg;
			printf ("Class: %d\nStudent#: %d\nName: %s %s\n1ST Grade: %.2f\n2ND Grade: %.2f\n3RD Grade: %.2f\nAverage: %.2f\n",clas,stu,fname,lname,grade1,grade2,grade3,stuAvg);
			printf ("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯\n");
		}
		classAvg = avg / 10;
		printf ("____________________________________________________\n");
		printf ("Class Average-----------------------------%.2f", classAvg);
	}
	
	return 0;
}

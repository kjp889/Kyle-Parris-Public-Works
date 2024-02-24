//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 10/12/2020
//DESCRIPTION: PROGRAMMING 1 FINAL ASSESSMENT

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>

int main()
{
	int gold = 0, dia = 0, plat = 0, spin = 0, ma = 0, count = 1, count1 = 1, numclass1, numclass2, ids[99];
	char extra, memcodes[99], lnames[99][50], fnames[99][50], class[99][25];
	float total, excost1, excost2, ecost, scost, fcost, gcost, dcost, pcost, cost[99];
	
	printf ("Enter 'XXX' for the LAST NAME to Exit!\n");
	printf ("%d)Enter Customers LAST NAME: ",count);
	scanf ("%s", lnames[count]);
	while ((strcmp(lnames[count], "XXX") != 0) && (strcmp(lnames[count], "xxx") != 0))
	{
		printf ("Enter Customers FIRST NAME: ");
		scanf ("%s", fnames[count]);
		printf ("Enter Customers ID NUMBERS: ");
		scanf ("%d", &ids[count]);
		printf ("Enter Customers MEMBERSHIP PACKAGE CODE; \n(G) - GOLD, (D) - DIAMOND, (P) - PLATINUM: ");
		scanf ("%c", &memcodes[count]);
		scanf ("%c", &memcodes[count]);
		switch (memcodes[count])
		{
			case 'G':
			case 'g':
				gcost = 4000;
				cost[count] = gcost;
				gold = gold + 1;
			break;
			case 'D':
			case 'd':
				dcost = 7500;
				cost[count] = dcost;
				dia = dia + 1;
			break;
			case 'P':
			case 'p':
				pcost = 10000;
				cost[count] = pcost;
				plat = plat + 1;
			break;
			default:
				printf ("INVALID CODE\n");
				count = count - 1;
			break;
		}
		printf ("Customers Extra Lessons; (S) SPINNING, (F) MARTIAL ARTS, (B) BOTH: ");
		scanf ("%c", &extra);
		scanf ("%c", &extra);
		switch (extra)
		{
			case 'S':
			case 's':
				spin = spin + 1;
				excost1 = 900;
				printf ("How many lessons a month? ");
				scanf ("%d", &numclass1);
				ecost = excost1 * numclass1;
				cost[count] = cost[count] + ecost;
				scost = scost + ecost;
				strcpy (class[count], "Spinning");
			break;
			case 'F':
			case 'f':
				ma = ma + 1;
				excost1 = 1100;
				printf ("How many lessons a month? ");
				scanf ("%d", &numclass1);
				ecost = excost1 * numclass1;
				fcost = fcost + ecost;
				cost[count] = cost[count] + ecost;
				strcpy (class[count], "Martial_Arts");
			break;
			case 'B':
			case 'b':
				spin = spin + 1;
				excost1 = 900;
				ma = ma + 1;
				excost2 = 1100;
				printf ("How many SPINNING lessons a month? ");
				scanf ("%d", &numclass1);
				printf ("How many MARTIAL ARTS lessons a month? ");
				scanf ("%d", &numclass2);
				ecost = ((excost1 * numclass1) + (excost2 * numclass2));
				fcost = (fcost + (excost2 * numclass2));
				scost = (scost + (excost1 * numclass1));
				cost[count] = cost[count] + ecost;
				strcpy (class[count], "Spinning_&_Martial_Arts");
			break;
			default:
				printf ("NONE\n");
				strcpy (class[count], "NONE");
			break;
		}
		count = count + 1;
		printf ("%d)Enter Customers LAST NAME: ",count);
		scanf ("%s", lnames[count]);
	}
	printf ("\nID\tFIRSTNAME\tLASTNAME\tLESSONS\t MONTHLYCOST\n");
	printf ("---------------------------------------------------------------------------------------------\n");
	for (count1 = 1; count1 <= (count - 1); count1 ++)
	{
		printf ("%d\t %s\t \t %s\t \t%s\t $%.2f\n", ids[count1], fnames[count1], lnames[count1], class[count1],cost[count1]);
		total = total + cost[count1];
	}
	printf ("---------------------------------------------------------------------------------------------\n");
	printf ("TOTAL COST: $%.2f\n", total);
	printf ("TOTAL COST for SPINNING LESSONS: $%.2f\n", scost);
	printf ("TOTAL COST for MARTIAL ARTS LESSONS: $%.2f\n", fcost);
	printf ("# OF CUSTOMERS: %d\n", (count - 1));
	printf ("# OF GOLD CUSTOMERS and COST: %d - $%.2f\n", gold, gold * gcost);
	printf ("# OF DIAMOND CUSTOMERS and COST: %d - $%.2f\n", dia, dia * dcost);
	printf ("# OF PLATINUM CUSTOMERS and COST: %d - $%.2f\n", plat, plat * pcost);
	printf ("# OF CUSTOMERS in SPINNING LESSONS: %d\n", spin);
	printf ("# OF CUSTOMERS in MARTIAL ARTS LESSONS: %d\n", ma);
	
	return 0;
}

//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 25/10/2020
//DESCRIPTION: Portfolio Continuous Assessment 4 Question 7

#include <stdio.h>
int main()
{ //Identifies the start of the function

	char name[30]; // Defines the variables
	float cost = 1500, bill; // Defines the variables
	char code, assist;
	int id;
	
	//Prompt Statement
	printf ("Enter Paitent's name: "); //Output Statement
	scanf ("%[^\n]", &name); //Input Statement
	printf ("Enter %s I.D: ", name); //Output Statement
	scanf ("%d", &id); //Input Statement
	printf ("Enter Referral code: "); //Output Statement
	scanf ("%c", &code);	//Input Statement
	scanf ("%c", &code);
	scanf ("%c", &assist);
	
	//Processing Statements
    switch(code)
    {
    	case 'D':
		case 'd': 
			bill = cost + 1500;
	    	printf ("%c, Patient referred to Doctor on Duty", code);
		break; 			
		case 'N':
		case 'n':
			bill = cost + 700; 
	        printf ("%c, HotelPatient referred to Nurses Treatment room", code);
	    break; 		
		case 'H':
		case 'h':
			bill = cost + 100; 
	    	printf ("%c, Patient referred to Health Centre", code);
	    break;
		case 'r':
		case 'R':
			printf ("Is ambulance assistance required? (Y) YES, (N) NO: ");
			scanf ("%c", &assist);
			if (assist == 'Y'|| assist == 'y')
				{
				printf ("%c, Patient referred to Regional Hospital with Ambulance Assistance", code);
				bill = cost + 4500;
				}
			else	
				{
				printf ("%c, Patient referred to Regional Hospital without Ambulance Assistance", code);
				bill = cost + 500;
				}
	    break;               
 		default:
            printf("Invalid");
    }
	printf ("\nName: %s, \nID: %d, \nBill: $%.2f", name, id, bill); 
	
	return 0;
} //Ends the function



/*	A4Q6
	if (gpa >= 3.5)
		{
		amount = tuition * 0.80;
		printf ("Scholarship Eligible");
		}
	else
		if (gpa >= 3) 
			{
			amount = tuition * 0.60;
			if (tuition > 550000)
				{ printf ("Grant Eligible"); }
			else
				{ printf ("Loan Eligible"); }
			}
		else
			if (gpa >= 2.7)
				{
				amount = tuition * 0.10;
				printf ("Textbook Voucher Eligible");
				}
			else
				{ printf ("Not Eligible"); }

	printf ("\nStudent's Name: %s", name);
	printf ("\nG.P.A: %.2f", gpa);
	printf ("\nTuition is $%.2f", tuition);
	printf ("\nGrant Amount is $%.2f", amount);
*/	

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define NAME_LENGTH 31

typedef struct
{
    int day;
    int month;
    int year;
} Date;

struct child
{
    char guardian_id[7];
    char gender;
    char section;
    Date dob;
};

struct guardian
{
    char relationship[NAME_LENGTH];
    char email[NAME_LENGTH];
    long int telephone;
};

struct caregiver
{
    char gender;
    char section;
    char *age_range;
};

union person_type
{
    struct child child;
    struct caregiver caregiver;
    struct guardian guardian;
};

typedef struct
{
    int guardian_id;
    int child_id;
    char first_name[NAME_LENGTH];
    char last_name[NAME_LENGTH];
    char address[NAME_LENGTH];
    union person_type type;
    
} Person;

enum record_categories {GUARDIAN = 1, CHILD, CAREGIVER};

//prototypes
void initalizer();
void wait();
void add_records();
void clear_output();

void set_name(Person* );
void set_email(Person* );
void set_address(Person* );
void print_person(Person* );
void set_telephone(Person* );
void set_person_data(Person* );
int print_category_menu();
void set_relationship(Person* );

void set_guardian_id(Person* );
void set_guardian_data(Person* );
void print_guardian(Person* );

void set_child_id(Person* );
void set_child_data(Person* );
void print_child(Person* );

void set_caregiver_id(Person* );
void set_caregiver_data(Person* );
void print_caregiver(Person* );

int main()
{
    int main_menu_choice;
    
    initalizer();
        
    //Displays Main Menu and Reads users choice
    do {
        clear_output();
        printf("1. Add Records\n2. Update Records\n3. Delete Records\n4. Reports\n0. Exit\n");
        printf("\nSelect a number from 0-4: ");
        scanf("%d", &main_menu_choice);

        switch (main_menu_choice) {
            case 1:
                add_records();
                break;
            case 2:
                //updateRecord();
                break;
            case 3:
                //deleteRecord();
                break;
            case 4:
                //listReports();
                break;
            case 0:
                printf("\nExiting...\n");
                break;
            default:
                printf("Invalid menu item selected.");
        }
    } while (main_menu_choice != 0);
}

/**
 * Handles the process of adding new records to the system.
*/
void add_records()
{
    int category_choice, sentinel_value = 0;

    do {
        Person record, *record_ptr = &record;
        category_choice = print_category_menu();

        switch (category_choice) {
            case GUARDIAN:
            	printf("%50s","Enter PARENT/GUARDIAN Data");
                set_guardian_id(record_ptr);
                set_guardian_data(record_ptr);
                print_guardian(record_ptr);
                wait();
                    
                break;
            case CHILD:
               printf("%50s","Enter CHILD Data");
               set_child_id(record_ptr);
               set_child_data(record_ptr);
               print_child(record_ptr);
               wait();
                
                break;
            case CAREGIVER:
                //printf("%50s","Enter CAREGIVER Data");
                //set_caregiver_id(record_ptr);
                //set_caregiver_data(record_ptr);
                //print_caregiver(record_ptr);
                //wait();
                
                break;
            case 0: 
                // do nothing execution to main
                break;
            default:
                //print_message("");
                break;
        }
       
    } while (category_choice != 0);
}

/**
 * Displays the record category selection menu.
 * 
 * @param char* Text asking the user for input. It is printed after the menu.
 * @returns The number for the menu item selected by the user.
*/
int print_category_menu()
{
    int choice;

    clear_output();
    printf("1. Parent/Guardian\n2. Child\n3. Caregiver\n0. Return to main menu\n");
    printf("Select a record category:");
    scanf("%d", &choice);
    printf("------------------------------------------------------------------------\n");
    
    return choice;
}

/**
 * Allows the user to enter a record ID or a value to indicate end of input.
 * 
 * @param Person* A reference to the record on which to set the Id
*/
void set_guardian_id(Person *record)
{
    record->guardian_id += 1;
}

/**
 * Gathers data for a parent/guardian record by prompting the user.
 * 
 * @param Person* A reference to the record on which to set the collected data.
*/
void set_guardian_data(Person *record)
{
    set_person_data(record);
    
    printf("\nWhat is %s\'s relationship to the child? ", record->first_name);
    scanf("%30s", record->type.guardian.relationship);
    
    printf("\nEnter %s\'s phone number: ", record->first_name);
    scanf("%ld", &record->type.guardian.telephone);
    
    printf("\nEnter an email address for %s: ", record->first_name);
    scanf("%30s", record->type.guardian.email);
}

/**
 * Allows the user to enter a record ID or a value to indicate end of input.
 * 
 * @param Person* A reference to the record on which to set the Id
*/
void set_child_id(Person *record)
{
    record->child_id += 1;
}

/**
 * Gathers data for a child record by prompting the user.
 * 
 * @param Person* A reference to the record on which to set the collected data.
*/
void set_child_data(Person *record)
{
    set_person_data(record);
    
    printf("\nWhat is %s\'s GUARDIAN'S ID? ", record->first_name);
    scanf("%30s", record->type.child.guardian_id);
    
    printf("\nEnter %s\'s gender: ", record->first_name);
    record->type.child.gender= getch();
    
    printf("\nEnter %s\'s section: ", record->first_name);
    record->type.child.section=getch();
    
    printf("\nEnter %s\'s Date of Birth: ", record->first_name);
    scanf("%30s", record->type.child.dob);
}

/**
 * Prompts the user for a first and last name then assign the names to the given record.
 * 
 * @param Person* The record to which the names are assigned.
*/
void set_name(Person *record)
{
    printf("\nEnter a first and last name separated by a space e.g. Mickey Mouse: ");
    scanf("%s %s", record->first_name, record->last_name);
}

/**
 * Set the address field of a record by prompting the user.
 * 
 * @param Person* The record on which to set the given address.
*/
void set_address(Person *record)
{
    printf("\nEnter %s\'s address e.g. Kingston: ", record->first_name);
    scanf("%30s", record->address);
}

/**
 * Gathers data common to all record types via a series of user prompts.
 * 
 * @param Person* A reference to the record on which to set the collected data.
*/
void set_person_data(Person *record)
{
    set_name(record);
    set_address(record);
}

void print_person(Person *record)
{
    clear_output();
    printf("\n%-15s %s", "NAME:", strcat(strcat(record->first_name, " "), record->last_name));
}

void print_guardian(Person *record)
{
    print_person(record);
    printf("\n%-15s %s%04d", "ID#:","GRD", record->guardian_id);
    printf("\n%-15s %s", "RELATIONSHIP:", record->type.guardian.relationship);
    printf("\n%-15s %s", "EMAIL:", record->type.guardian.email);
    printf("\n%-15s %ld", "TELEPHONE:", record->type.guardian.telephone);
    printf("\n");
}

void print_child(Person *record)
{
    print_person(record);
    printf("\n%-15s %s%04d", "ID#:","CLD", record->child_id);
    printf("\n%-15s %c", "GENDER:", record->type.child.gender);
    printf("\n%-15s %c", "SECTION:", record->type.child.section);
    printf("\n%-15s %d", "DOB:", record->type.child.dob);
    printf("\n%-15s %s", "GUARDIAN ID#:", record->type.child.guardian_id);
    printf("\n");
}

/**
 * Initalizes the system by creating the required system files
 * if they do not exist.
*/
void initalizer()
{
	FILE *filePtr=NULL;//File pointer to hold reference to our file
    
    //Test to verify if the file already exist
    if (filePtr = fopen("Kids Plus_DB.dbx", "r")) 
    {
        fclose(filePtr);
        printf("file exists");
    }
    else
    {
    	filePtr = fopen("Kids Plus_DB.dbx", "w");
    	fclose(filePtr);
        printf("file doesn't exist");
    }
    
}

/**
 * Clear program output
 */
void clear_output()
{
    system("@cls||clear");
}


/**
 * Pause execution until the user hits the enter key.
*/
void wait()
{
    int c;
    printf("\nPress ENTER to continue...");
    while ((c = getchar()) != '\n' && c != EOF);
    getchar();
}

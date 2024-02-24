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
    int guardian_id;
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
    int id;
    char first_name[NAME_LENGTH];
    char last_name[NAME_LENGTH];
    char address[NAME_LENGTH];
    union person_type type;
    
} Person;

enum record_categories {GUARDIAN = 1, CHILD, CAREGIVER};

void init();
void wait();
void add_records();
void clear_output();
void set_id(Person* );
void set_name(Person* );
void set_email(Person* );
void print_message(char* );
void set_address(Person* );
void print_person(Person* );
void set_telephone(Person* );
void print_guardian(Person* );
void set_person_data(Person* );
int print_category_menu(char* );
void set_relationship(Person* );
void set_guardian_data(Person* );

int main()
{
    int main_menu_choice;
    init();

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
                printf("\nupdateRecord()");
                break;
            case 3:
                printf("\ndeleteRecord()");
                break;
            case 4:
                printf("\nlistReports()");
                break;
            case 0:
                printf("\nExiting...\n");
                break;
            default:
                print_message("Invalid menu item selected.");
        }
    } while (main_menu_choice != 0);
}

/**
 * Handles the process of adding new records to the system.
*/
void add_records()
{
    int category_choice, sentinel_value = 0;
    char *category_prompt = "Select a record category: ";

    do {
        Person record, *record_ptr = &record;
        category_choice = print_category_menu(category_prompt);

        switch (category_choice) {
            case GUARDIAN:
                set_id(record_ptr);
                set_guardian_data(record_ptr);
                print_guardian(record_ptr);
                wait();
                    
                //set_id(record_ptr);

                break;
            case CHILD:
                printf("\nchild");
                break;
            case CAREGIVER:
                printf("\ncaregiver");
                break;
            case 0: 
                // do nothing execution to main
                break;
            default:
                print_message("");
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
int print_category_menu(char *prompt)
{
    int choice, res;

    clear_output();
    printf("1. Parent/Guardian\n2. Child\n3. Caregiver\n0. Return to main menu\n");
    printf("\n%s", prompt);
    scanf("%d", &choice);
    
    return choice;
}

/**
 * Allows the user to enter a record ID or a value to indicate end of input.
 * 
 * @param Person* A reference to the record on which to set the Id
*/
void set_id(Person *record)
{
    record->id += 1;
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
 * Set the relationship field of a parent/guardian record by prompting the user.
 * 
 * @param Person* The record on which to set the given relationship.
*/
void set_relationship(Person *record)
{
    printf("\nWhat is %s\'s relationship to the child? ", record->first_name);
    scanf("%30s", record->type.guardian.relationship);
}

/**
 * Set the email field of a parent/guardian record by prompting the user.
 * 
 * @param Person* The record on which to set the given email address.
*/
void set_email(Person *record)
{
    printf("\nEnter an email address for %s: ", record->first_name);
    scanf("%30s", record->type.guardian.email);
}

/**
 * Set the telephone field of a parent/guardian record by prompting the user.
 * 
 * @param Person* The record on which to set the given telephone number.
*/
void set_telephone(Person *record)
{
    printf("\nEnter %s\'s phone number: ", record->first_name);
    scanf("%ld", &record->type.guardian.telephone);
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

/**
 * Gathers data for a parent/guardian record by prompting the user.
 * 
 * @param Person* A reference to the record on which to set the collected data.
*/
void set_guardian_data(Person *record)
{
    set_person_data(record);
    set_relationship(record);
    set_telephone(record);
    set_email(record);
}

void print_person(Person *record)
{
    clear_output();
    printf("\n%-15s %s", "NAME:", strcat(strcat(record->first_name, " "), record->last_name));
}

void print_guardian(Person *record)
{
    print_person(record);
    printf("\n%-15s %s%04d", "ID#:","GRD", record->id);
    printf("\n%-15s %s", "RELATIONSHIP:", record->type.guardian.relationship);
    printf("\n%-15s %s", "EMAIL:", record->type.guardian.email);
    printf("\n%-15s %ld", "TELEPHONE:", record->type.guardian.telephone);
    printf("\n");
}

/**
 * Initalizes the system by creating the required system files
 * if they do not exist.
*/
void init()
{}

/**
 * Clear program output
 */
void clear_output()
{
    system("@cls||clear");
}

/**
 * Display the given message and then wait for user confirmation.
 * 
 * @param char* The message to print
 * @returns void
*/
void print_message(char *message)
{
    puts("\n");

    if (message != NULL && message != "") {
        puts(message);
    }

    wait();
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

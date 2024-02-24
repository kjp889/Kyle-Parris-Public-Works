//
//  main.c
//  rand_file
//
//  Created by Tyrone Edwards on 04/07/2016.
//  Copyright © 2016 Tyrone Edwards. All rights reserved.
//

#include <stdio.h>

struct student{
    int id;
    char first_name[25];
    char last_name[25];
    float gpa;
};

typedef struct student STUDENT;

void initialize(int);
void list_records();
void print_record(STUDENT);
void save_record(STUDENT);
STUDENT retrieve_record(int);
void update_record();
void delete_record(int);

int main(int argc, const char * argv[]) {
    
    //initialize(10);
    //list_records();
    STUDENT stu2;
    //STUDENT stu1 = {8,"Roger","Francis",3.25f};
    
    //save_record(stu1);
    
    delete_record(8);
    
    stu2 = retrieve_record(8);
    
    if(stu2.id != 0){
        print_record(stu2);
    }else{
        printf("\nRecord does not exist for student with id = 8\n");
    }
    
    //update_record();
    
    return 0;
}

void delete_record(int search_id){
    FILE * file = NULL;
    STUDENT blank = {0,"first","last",0.0f};
    
    file = fopen("student-db.dbx","r+b");
    
    if(file != NULL)
    {
        //position file pointer to start of record
        fseek(file, sizeof(STUDENT) * (search_id - 1), SEEK_SET);
        
        //delete record by writing blank record to the file
        fwrite(&blank, sizeof(STUDENT), 1, file);
        
        fclose(file);
    }
    else
    {
        printf("\nError deleting record from database!!");
    }
}

void update_record(){
    int search_id;
    STUDENT record;
    
    //need student's id
    printf("\nPlease enter student id: ");
    scanf("%d",&search_id);
    
    //retreive the student's record
    record = retrieve_record(search_id);
    
    if(record.id == search_id)
    {
        //update necessary fields
        printf("\nOriginal value [%s] - enter updated value: ",record.first_name);
        scanf("%s",record.first_name);
        printf("\nOriginal value [%s] - enter updated value: ",record.last_name);
        scanf("%s",record.last_name);
        printf("\nOriginal value [%0.2f] - enter updated value: ",record.gpa);
        scanf("%f",&record.gpa);
        
        //save update(s) to file
        save_record(record);
    }else{
        printf("\nError no record with id [%d]", search_id);
    }
}


STUDENT retrieve_record(int search_id){
    FILE * file = NULL;
    STUDENT record;
    
    file = fopen("student-db.dbx","rb");
    
    if(file != NULL)
    {
        //position file pointer to start of record
        fseek(file, sizeof(STUDENT) * (search_id - 1), SEEK_SET);
        
        //read record from the file
        fread(&record, sizeof(STUDENT), 1, file);
        
        fclose(file);
    }
    else
    {
        printf("\nError reading record from database!!");
    }
    
    return record;
}

void save_record(STUDENT record){
    FILE * file = NULL;
    
    file = fopen("student-db.dbx","r+b");
    
    if(file != NULL)
    {
        //position file pointer to start of record
        fseek(file, sizeof(STUDENT) * (record.id - 1), SEEK_SET);
     
        //write blank record to the file
        fwrite(&record, sizeof(STUDENT), 1, file);
        
        fclose(file);
    }
    else
    {
        printf("\nError writing record to database!!");
    }
}

void print_record(STUDENT record){
    printf("\nI.D.      : %d", record.id);
    printf("\nFirst Name: %s", record.first_name);
    printf("\nLast Name : %s", record.last_name);
    printf("\nG.P.A     : %0.2f\n", record.gpa);
}

void list_records()
{
    FILE * file = NULL;
    STUDENT record;
    int counter;
    
    file = fopen("student-db.dbx","rb");
    
    if(file != NULL)
    {
        counter = 1;
        
        while(1)
        {
            //position file pointer to start of record
            fseek(file, sizeof(STUDENT) * (counter - 1), SEEK_SET);
            //write blank record to the file
            fread(&record, sizeof(STUDENT), 1, file);
            if(feof(file)){
                break;
            }
            print_record(record);
            counter++;
        }
        
        fclose(file);
    }
    else
    {
        printf("\nError accessing database!!");
    }
}

void initialize(int max_record_count)
{
    FILE * file = NULL;
    STUDENT blank_record = {0,"first","last",0.0f};
    int counter;
    
    file = fopen("student-db.dbx","wb");
    
    if(file != NULL)
    {
        //use a loop to write blank records to the file
        for(counter = 1; counter < max_record_count; counter++)
        {
            //position file pointer to start of record
            fseek(file, sizeof(STUDENT) * (counter - 1), SEEK_SET);
            //write blank record to the file
            fwrite(&blank_record, sizeof(STUDENT), 1, file);
        }
        fclose(file);
    }
    else
    {
        printf("\nError initializing database!!");
    }
}

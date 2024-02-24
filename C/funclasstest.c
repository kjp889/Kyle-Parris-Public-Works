#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>
#include <math.h>


struct staff{
  char fName[20];
  char lName[20];
  char course[50];
  int age;
};

union student{
  char fName[20];
  char lName[20];
  char course[50];
  int age;
}st1;

int main()
{
  printf("Size of struct %ld \n size of union %ld", sizeof(struct staff), sizeof(union student));
  
  strcpy(st1.fName,"Billy Bob");
  printf("\n%s",st1.fName);
  printf("\n%s",st1.lName);
  printf("\n%s",st1.course);
  printf("\n%d",st1.age);
  
  strcpy(st1.lName,"Dixon");
  printf("\n%s",st1.fName);
  printf("\n%s",st1.lName);
  printf("\n%s",st1.course);
  printf("\n%d",st1.age);
  
  st1.age = 35;
  printf("\n%s",st1.fName);
  printf("\n%s",st1.lName);
  printf("\n%s",st1.course);
  printf("\n%d",st1.age);

  return 0;
}

#include <stdio.h>

struct person{

  char name[20];

  int age;

};



int main()

{

  FILE *fPtr;

  struct person p1 = {"Sally Mae Brown",20};

  int i;

   

  fPtr = fopen("class.dat", "r+");

  if(fPtr == NULL)

   printf("ERROR!! File could not be opened");

  else{

    for(i=0;i<10;i++){

      fseek(fPtr, i * sizeof(struct person), SEEK_SET);

  //    fwrite(&p1, sizeof(struct person), 1, fPtr);

      fread(&p1, sizeof(struct person), 1, fPtr);

      printf("\n%s, %d", p1.name, p1.age+i);

    }

     

  }

  fclose(fPtr);

  return 0;

}

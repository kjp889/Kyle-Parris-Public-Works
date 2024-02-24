#include<stdio.h>
int main()
{
	char data[1000];
	
    FILE *file;
    
    if (file = fopen("demo.txt", "r")) 
    {
        fclose(file);
        printf("file exists");
    }
    else
    {
    	file = fopen("demo.txt", "w");
    	fclose(file);
        printf("file doesn't exist");
    }
    
    file = fopen("demo.txt", "a");
    
	printf("Enter contents to store in file : \n");    
    fgets(data, 1000, stdin);
    
    fputs(data, file);
    
    fclose(file);
    
    return 0;
}

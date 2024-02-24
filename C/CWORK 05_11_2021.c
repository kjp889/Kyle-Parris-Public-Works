#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>
#include <math.h>

struct Book{
	char title[50];
	char author[30];
	char ISBN[15];
	int YearOfPublication;
};

int main()
{
	struct Book requiredText={"C How to Program","Deitel & Deitel","0-13-299044-X",2013},favNovel[3];
	int i;
//	strcpy(favNovel.author,"Laurell K. Hamilton");
//	strcpy(favNovel.title,"Narcissus in Chains");
//	strcpy(favNovel.ISBN,"0-425-18168-5");
//	favNovel.YearOfPublication = 2001;
	
	for(i=0;i<3;i++)
	{
		printf("Enter the Title of your Favourate Book: ");
		gets(favNovel[i].title);
		printf("Enter the Author of %s: ",favNovel[i].title);
		gets(favNovel[i].author);
		printf("Enter the ISBN of %s: ",favNovel[i].title);
		gets(favNovel[i].ISBN);
		printf("Enter the year %s was published: ",favNovel[i].title);
		scanf("%d",&favNovel[i].YearOfPublication);
	}
	
	
	printf("\nRequired Books:\n");
	printf("----------------------------------------------------------------\n");
	printf("Author\t Title\t ISBN\t Year of Publication\n");
	printf("______________________________________________________________\n");
	printf("%s\t %s\t %s\t %d\n",requiredText.author,requiredText.title,requiredText.ISBN,requiredText.YearOfPublication);
	
	printf("\n\nFavourate Books:\n");
	printf("----------------------------------------------------------------\n");
	printf("Author\t Title\t ISBN\t Year of Publication\n");
	for(i=0;i<3;i++)
	{
		printf("______________________________________________________________\n");
		printf("%s\t %s\t %s\t %d\n",favNovel[i].author,favNovel[i].title,favNovel[i].ISBN,favNovel[i].YearOfPublication);
	}
	
	return 0;
}

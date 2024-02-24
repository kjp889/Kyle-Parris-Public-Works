//AUTHOR: Kyle Parris
//ID: 1804904
//DATE: 30/09/2021
//DESCRIPTION: Question 2.21

#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <string.h>

int main()
{
    int num;
    
    printf("*************************\n");
    printf("****1 for SQUARE*********\n");
    printf("****2 for OVAL***********\n");
    printf("****3 for ARROW**********\n");
    printf("****4 for DIAMOND********\n");
    printf("*************************\n");
    
    printf("Please select a shape: ");
    scanf("%d",&num);
    
    if (num == 1)
    {
        printf("*******\n*     *\n*     *\n*     *\n*     *\n*     *\n*******");
    }
    if (num == 2)
    {
        printf("  ***  \n *   * \n*     *\n*     *\n*     *\n *   * \n  ***  ");
    }
    if (num == 3)
    {
        printf("   *   \n  ***  \n ***** \n   *   \n   *   \n   *   \n   *   \n   *   ");
    }
    if (num == 4)
    {
        printf("   *   \n  * *  \n *   * \n*     *\n *   * \n  * *  \n   *   ");
    }
}

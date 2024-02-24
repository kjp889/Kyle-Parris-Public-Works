#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>

char ChildSectionSelection(int id);
char CareGiverSectionSelection(int id);

//needs to be saved to the file to keep count
int aCount,bCount,cCount,dCount,eCount,fCount,gCount,hCount,iCount;
int jCount,kCount,lCount,mCount,nCount,oCount,pCount,qCount,rCount,sCount,tCount,uCount;
int vCount,wCount,xCount,yCount,zCount;

//to be added to the add child function
int main()
{
	int id=1,i;
	char childSection;//<--would be saved to the child file
	
	childSection = ChildSectionSelection(id);
	printf("\nsection is :%c",childSection);	
		
}

char ChildSectionSelection(int id)
{
	int sectionKid[26][9];
	char section;
	
	do
	{
		printf("\nEnter the caregiver's section: ");
		section = getch();
		
		switch(section)
		{
			case 'A':
			case 'a':
				if(aCount==9)
				{
					printf("\nSection at max capacity chose another");
					break;
				}
				sectionKid[1][aCount]=id;
				aCount++;
				return 'A';
			case 'b':
			case 'B':
				if(bCount==9)
				{
					printf("Section at max capacity chose another");
					break;
				}
				sectionKid[2][bCount]=id;
				bCount++;
				return 'B';	
			case 'c':
			case 'C':
				if(cCount==9)
				{
					printf("Section at max capacity chose another");
					break;
				}
				sectionKid[3][cCount]=id;
				cCount++;
				return 'C';
			case 'D':
			case 'd':
				if(dCount==9)
				{
					printf("Section at max capacity chose another");
					break;
				}
				sectionKid[4][dCount]=id;
				dCount++;
				return 'D';
			case 'e':
			case 'E':
				if(eCount==9)
				{
					printf("Section at max capacity chose another");
					break;
				}
				sectionKid[5][eCount]=id;
				eCount++;
				return 'E';
			case 'f':
			case 'F':
				if(fCount==9)
				{
					printf("Section at max capacity chose another");
					break;
				}
				sectionKid[6][fCount]=id;
				fCount++;
				return 'F';
			case 'g':
			case 'G':
				if(gCount==9)
				{
					printf("Section at max capacity chose another");
					break;
				}
				sectionKid[7][gCount]=id;
				gCount++;
				return 'G';
			case 'h':
			case 'H':
				if(hCount==9)
				{
					printf("Section at max capacity chose another");
					break;
				}
				sectionKid[8][hCount]=id;
				hCount++;
				return 'H';
			case 'i':
			case 'I':
				if(iCount==9)
				{
					printf("Section at max capacity chose another");
					break;
				}
				sectionKid[9][iCount]=id;
				iCount++;
				return 'I';
			case 'j':
			case 'J':
				if(jCount==9)
				{
					printf("Section at max capacity chose another");
					break;
				}
				sectionKid[10][jCount]=id;
				jCount++;
				return 'J';
			case 'k':
			case 'K':
				if(kCount==9)
				{
					printf("Section at max capacity chose another");
					break;
				}
				sectionKid[11][kCount]=id;
				kCount++;
				return 'K';
			case 'l':
			case 'L':
				if(lCount==9)
				{
					printf("Section at max capacity chose another");
					break;
				}
				sectionKid[12][lCount]=id;
				lCount++;
				return 'L';
			case 'm':
			case 'M':
				if(mCount==9)
				{
					printf("Section at max capacity chose another");
					break;
				}
				sectionKid[13][mCount]=id;
				mCount++;
				return 'M';
			case 'n':
			case 'N':
				if(nCount==9)
				{
					printf("Section at max capacity chose another");
					break;
				}
				sectionKid[14][nCount]=id;
				nCount++;
				return 'N';	
			case 'o':
			case 'O':
				if(oCount==9)
				{
					printf("Section at max capacity chose another");
					break;
				}
				sectionKid[15][oCount]=id;
				oCount++;
				return 'O';
			case 'p':
			case 'P':
				if(pCount==9)
				{
					printf("Section at max capacity chose another");
					break;
				}
				sectionKid[16][pCount]=id;
				pCount++;
				return 'P';
			case 'q':
			case 'Q':
				if(qCount==9)
				{
					printf("Section at max capacity chose another");
					break;
				}
				sectionKid[17][qCount]=id;
				qCount++;
				return 'Q';
			case 'r':
			case 'R':
				if(rCount==9)
				{
					printf("Section at max capacity chose another");
					break;
				}
				sectionKid[18][rCount]=id;
				rCount++;
				return 'R';
			case 's':
			case 'S':
				if(sCount==9)
				{
					printf("Section at max capacity chose another");
					break;
				}
				sectionKid[19][sCount]=id;
				sCount++;
				return 'S';
			case 't':
			case 'T':
				if(tCount==9)
				{
					printf("Section at max capacity chose another");
					break;
				}
				sectionKid[20][tCount]=id;
				tCount++;
				return 'T';
			case 'u':
			case 'U':
				if(uCount==9)
				{
					printf("Section at max capacity chose another");
					break;
				}
				sectionKid[21][uCount]=id;
				uCount++;
				return 'U';
			case 'v':
			case 'V':
				if(vCount==9)
				{
					printf("Section at max capacity chose another");
					break;
				}
				sectionKid[22][vCount]=id;
				vCount++;
				return 'V';
			case 'w':
			case 'W':
				if(wCount==9)
				{
					printf("Section at max capacity chose another");
					break;
				}
				sectionKid[23][wCount]=id;
				wCount++;
				return 'W';	
			case 'x':
			case 'X':
				if(xCount==9)
				{
					printf("Section at max capacity chose another");
					break;
				}
				sectionKid[24][xCount]=id;
				xCount++;
				return 'X';
			case 'y':
			case 'Y':
				if(yCount==9)
				{
					printf("Section at max capacity chose another");
					break;
				}
				sectionKid[25][yCount]=id;
				yCount++;
				return 'Y';
			case 'z':
			case 'Z':
				if(zCount==9)
				{
					printf("Section at max capacity chose another");
					break;
				}
				sectionKid[26][zCount]=id;
				zCount++;
				return 'Z';
			default:
				printf("\nInvalid Selection");	
		}
	}while(section!='\0');
}


char CareGiverSectionSelection(int id)
{
	int sectionCareGiver[26][2];
	char section;
	
	do
	{
		printf("\nEnter the child's section: ");
		section = getch();
		
		switch(section)
		{
			case 'A':
			case 'a':
				if(aCount==2)
				{
					printf("\nSection at max capacity chose another");
					break;
				}
				sectionCareGiver[1][aCount]=id;
				aCount++;
				return 'A';
			case 'b':
			case 'B':
				if(bCount==2)
				{
					printf("Section at max capacity chose another");
					break;
				}
				sectionCareGiver[2][bCount]=id;
				bCount++;
				return 'B';	
			case 'c':
			case 'C':
				if(cCount==2)
				{
					printf("Section at max capacity chose another");
					break;
				}
				sectionCareGiver[3][cCount]=id;
				cCount++;
				return 'C';
			case 'D':
			case 'd':
				if(dCount==2)
				{
					printf("Section at max capacity chose another");
					break;
				}
				sectionCareGiver[4][dCount]=id;
				dCount++;
				return 'D';
			case 'e':
			case 'E':
				if(eCount==2)
				{
					printf("Section at max capacity chose another");
					break;
				}
				sectionCareGiver[5][eCount]=id;
				eCount++;
				return 'E';
			case 'f':
			case 'F':
				if(fCount==2)
				{
					printf("Section at max capacity chose another");
					break;
				}
				sectionCareGiver[6][fCount]=id;
				fCount++;
				return 'F';
			case 'g':
			case 'G':
				if(gCount==2)
				{
					printf("Section at max capacity chose another");
					break;
				}
				sectionCareGiver[7][gCount]=id;
				gCount++;
				return 'G';
			case 'h':
			case 'H':
				if(hCount==2)
				{
					printf("Section at max capacity chose another");
					break;
				}
				sectionCareGiver[8][hCount]=id;
				hCount++;
				return 'H';
			case 'i':
			case 'I':
				if(iCount==2)
				{
					printf("Section at max capacity chose another");
					break;
				}
				sectionCareGiver[9][iCount]=id;
				iCount++;
				return 'I';
			case 'j':
			case 'J':
				if(jCount==2)
				{
					printf("Section at max capacity chose another");
					break;
				}
				sectionCareGiver[10][jCount]=id;
				jCount++;
				return 'J';
			case 'k':
			case 'K':
				if(kCount==2)
				{
					printf("Section at max capacity chose another");
					break;
				}
				sectionCareGiver[11][kCount]=id;
				kCount++;
				return 'K';
			case 'l':
			case 'L':
				if(lCount==2)
				{
					printf("Section at max capacity chose another");
					break;
				}
				sectionCareGiver[12][lCount]=id;
				lCount++;
				return 'L';
			case 'm':
			case 'M':
				if(mCount==2)
				{
					printf("Section at max capacity chose another");
					break;
				}
				sectionCareGiver[13][mCount]=id;
				mCount++;
				return 'M';
			case 'n':
			case 'N':
				if(nCount==2)
				{
					printf("Section at max capacity chose another");
					break;
				}
				sectionCareGiver[14][nCount]=id;
				nCount++;
				return 'N';	
			case 'o':
			case 'O':
				if(oCount==2)
				{
					printf("Section at max capacity chose another");
					break;
				}
				sectionCareGiver[15][oCount]=id;
				oCount++;
				return 'O';
			case 'p':
			case 'P':
				if(pCount==2)
				{
					printf("Section at max capacity chose another");
					break;
				}
				sectionCareGiver[16][pCount]=id;
				pCount++;
				return 'P';
			case 'q':
			case 'Q':
				if(qCount==2)
				{
					printf("Section at max capacity chose another");
					break;
				}
				sectionCareGiver[17][qCount]=id;
				qCount++;
				return 'Q';
			case 'r':
			case 'R':
				if(rCount==2)
				{
					printf("Section at max capacity chose another");
					break;
				}
				sectionCareGiver[18][rCount]=id;
				rCount++;
				return 'R';
			case 's':
			case 'S':
				if(sCount==2)
				{
					printf("Section at max capacity chose another");
					break;
				}
				sectionCareGiver[19][sCount]=id;
				sCount++;
				return 'S';
			case 't':
			case 'T':
				if(tCount==2)
				{
					printf("Section at max capacity chose another");
					break;
				}
				sectionCareGiver[20][tCount]=id;
				tCount++;
				return 'T';
			case 'u':
			case 'U':
				if(uCount==2)
				{
					printf("Section at max capacity chose another");
					break;
				}
				sectionCareGiver[21][uCount]=id;
				uCount++;
				return 'U';
			case 'v':
			case 'V':
				if(vCount==2)
				{
					printf("Section at max capacity chose another");
					break;
				}
				sectionCareGiver[22][vCount]=id;
				vCount++;
				return 'V';
			case 'w':
			case 'W':
				if(wCount==2)
				{
					printf("Section at max capacity chose another");
					break;
				}
				sectionCareGiver[23][wCount]=id;
				wCount++;
				return 'W';	
			case 'x':
			case 'X':
				if(xCount==2)
				{
					printf("Section at max capacity chose another");
					break;
				}
				sectionCareGiver[24][xCount]=id;
				xCount++;
				return 'X';
			case 'y':
			case 'Y':
				if(yCount==2)
				{
					printf("Section at max capacity chose another");
					break;
				}
				sectionCareGiver[25][yCount]=id;
				yCount++;
				return 'Y';
			case 'z':
			case 'Z':
				if(zCount==2)
				{
					printf("Section at max capacity chose another");
					break;
				}
				sectionCareGiver[26][zCount]=id;
				zCount++;
				return 'Z';
			default:
				printf("\nInvalid Selection");	
		}
	}while(section!='\0');
}

#include <stdio.h>
#include <string.h>
#define Nmax 50

void print(char names[][41], char adds[][41], int * marks, int n)
{
	int i;
	for ( i = 0; i < n; i++)
		printf ("%-40s%-40s%4d\n", names[i], adds[i], marks[i]);
}

void readFile(char * filename, char names[][41], char adds[][41], int * marks, int *pn)
{
	*pn = 0;
	FILE * f = fopen(filename, "r");
	if (f != '\0')
	{
		while ( fscanf(f, "%40[^;];%40[^;];%d%*c", names[*pn], adds[*pn], &marks[*pn]) == 3 )
			(*pn)++;
		fclose(f);
	}
}

void sort (char names[][41], char adds[][41], int * marks, int n)
{
	int i, j;
	for (i = 0; i < n - 1; i++)
		for ( j = n - 1; j > i; j--)
			if (marks[j] > marks[j - 1])
				{
					char tName[41];
					strcpy(tName, names[j]);
					strcpy(names[j], names[j - 1]);
					strcpy(names[j - 1], tName);
					
					char tAdd[41];
					strcpy(tAdd, adds[j]);
					strcpy(adds[j], adds[j - 1]);
					strcpy(adds[j - 1], tAdd);
					
					int tMark = marks[j];
					marks[j] = marks[j - 1];
					marks[j - 1] = tMark;
				}
}

void writeFile(char * filename, char names[][41], char adds[][41], int * marks, int n)
{
	FILE * f = fopen(filename, "w");
	int i;
	for ( i = 0; i < n; i++)
		fprintf(f, "%s;%s;%d\n", names[i], adds[i], marks[i]);
	fclose(f);
}

main()
{
	char fileIn[] = "student.txt";
	char fileOut[] = "students_2.txt";
	char names[Nmax][41];
	char adds[Nmax][41];
	int marks[Nmax];
	int n = 0;
	readFile(fileIn,names,adds,marks,&n);
	sort(names,adds,marks,n);
	printf("Sorted List : \n\n");
	print(names,adds,marks,n);
	writeFile(fileOut,names,adds,marks,n);
	printf("\nResult file : %s \n", fileOut);
	getchar();
}
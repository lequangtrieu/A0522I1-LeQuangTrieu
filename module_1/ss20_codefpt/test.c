#include<stdio.h>

void add(char *arr[100][31]) {
	
	for(int i = 0; i < 100; i++) {
		if(*arr[i] == *arr[99]) {
			scanf("%[^\n]", &*arr[i]);
			printf("%s", *arr[i]);
			break;
		}
	}
}
int main() {
	char *students[100][31];
	int choice = -1;
		
	while(choice != 5) {
		printf("\nMenu: ");
		printf("\n1. add: ");
		printf("\n2. remove: ");
		printf("\n3. search: ");
		printf("\n4. print: ");
		printf("\n5. exit: ");
		printf("\nenter your choice: ");
		scanf("%d", &choice);
		
		switch(choice) {
			case 1: 
				add(*students);
				break;
				
		}
	}
}
#include <stdio.h>
#include <stdbool.h>

void Tbc() {
	int n;
	printf("enter the length of the array:\n");
	scanf("%d", &n);
	int arr[n];
	
	for(int i = 0; i < n; i++) {
		printf("enter the element %d of the array: ", (i+1));
		scanf("%d", &arr[i]);
	}
	
	printf("\nthe array is:\n");
	for(int i = 0; i < n; i++) {
		printf("%d  ", arr[i]);
	}
	
	int count = 0;
	int sum = 0;
	for(int i = 0; i < n; i++) {
		if(arr[i] % 2 == 1) {
			sum += arr[i];
			count++;
		}
	}
	
	double result = 0;
	result = sum / count;
	if(count == 0) {
		printf("have no odd in array\n");
	} else {
		printf("tbc is: %f", result);
	}
}

void Find() {
	int n;
	printf("enter the length of the array:\n");
	scanf("%d", &n);
	int arr[n];
	
	for(int i = 0; i < n; i++) {
		printf("enter the element %d of the array: ", (i+1));
		scanf("%d", &arr[i]);
	}
	
	printf("\nthe array is:\n");
	for(int i = 0; i < n; i++) {
		printf("%d  ", arr[i]);
	}
	
	int index = 0;
	printf("\nenter the number you wanna find: ");
	int number;
	scanf("%d", &number);
	bool flag = false;
	
	for(int i = 0; i < n; i++) {
		if(number == arr[i]) {
			index = i;
			flag = true;
		}
	}
	if(flag) {
		printf("\nthe number you wanna find is in the position: %d", index);
	} else {
		printf("\nthe number you wanna find is not exist in the array");
	}
}

void Add() {
	int n;
	printf("enter the length of the array:\n");
	scanf("%d", &n);
	int arr[n];
	
	for(int i = 0; i < n; i++) {
		printf("enter the element %d of the array: ", (i+1));
		scanf("%d", &arr[i]);
	}
	
	printf("\nthe array is:\n");
	for(int i = 0; i < n; i++) {
		printf("%d  ", arr[i]);
	}
	
	n++;
	int number;
	printf("\nenter the number you wanna add to array: ");
	scanf("%d", &number);
	
	int index;
	printf("enter the index you wanna add the number to the array: ");
	scanf("%d", &index);
	
	for(int i = n - 1; i > index; i--) {
		arr[i] = arr[i -1];
	}
	
	arr[index] = number;
	
	printf("\nthe array after add the number is:\n  ");
	for(int i = 0; i < n; i++) {
		printf("%d  ", arr[i]);
	}
}

void Remove() {
	int n;
	printf("enter the length of the array:\n");
	scanf("%d", &n);
	int arr[n];
	
	for(int i = 0; i < n; i++) {
		printf("enter the element %d of the array: ", (i+1));
		scanf("%d", &arr[i]);
	}
	
	printf("\nthe array is:\n");
	for(int i = 0; i < n; i++) {
		printf("%d  ", arr[i]);
	}
	
	int index;
	printf("\nenter the index you wanna remove the number in the array: ");
	scanf("%d", &index);
	
	for(int i = index; i < n; i++) {
		arr[i] = arr[i + 1];
	}
	n--;
	
	printf("\nthe array after remove the number is:\n  ");
	for(int i = 0; i < n; i++) {
		printf("%d  ", arr[i]);
	}
	
	}
int main() {
	int choice = -1;
	while(choice != 5) {	
	printf("\nMenu: ");
	printf("\n1. TBC");
	printf("\n2. Find");
	printf("\n3. Add");
	printf("\n4. Remove");
	printf("\n5. Exit");
	printf("\n1. Enter your choice: ");
	scanf("%d", &choice);
	
	switch(choice) {
		case 1: 
		Tbc(); break;
		case 2: 
		Find(); break;
		case 3: 
		Add(); break;
		case 4: 
		Remove(); break;
		case 5: 
		return 0;
		default: 
		printf("\nNo choice");
	}
	}
	
	return 0;
}
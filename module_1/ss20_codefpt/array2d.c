#include <stdio.h>

int main() {
	int row, col;
	printf("enter the row: ");
	scanf("%d", &row);
	
	printf("\nenter the col: ");
	scanf("%d", &col);
	
	int arr[row][col];
	
	for(int i = 0; i < row; i++) {
		for(int j = 0; j < col; j++) {
			printf("\nenter the elements in [%d, %d] of the array: ", i, j);
			scanf("%d", &arr[i][j]);
		}
	}
	
	printf("\n\nthe array is:\n");
	for(int i = 0; i < row; i++) {
		for(int j = 0; j < col; j++) {
			printf("%d ", arr[i][j]);
		}
		printf("\n");
	}
	
	int sum = 0;
	for(int i = 0; i < row; i++) {
		for(int j = 0; j < col; j++) {
			sum += arr[i][j];
		}
	}
	printf("\nsum is: %d", sum);
	
}
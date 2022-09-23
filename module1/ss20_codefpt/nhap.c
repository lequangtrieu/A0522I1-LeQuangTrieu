#include<stdio.h>

int main() {
    int arr[10];
    int sum = 0;
    for(int i = 0; i < 10; i++) {
        arr[i] = scanf("%d");
    }
    printf(arr[10]);
    return 0;
}
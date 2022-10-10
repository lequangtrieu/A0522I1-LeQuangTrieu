#include <stdio.h>
#include <stdbool.h>
int Fact(int n) {
	int result = 1;
	for(int i = 2; i <= n; i++) {
		result *= i;
	}
	return result;
} 

void Primes(int n) {
	for(int i = 2; i <= n; i++) {
		bool flag = true;
		for(int j = 2; j < i; j++) {
			if(i % j == 0) {
				flag = false;
			}
		}
		if(flag) {
			printf("\n %d", i);
		}
	}
}

void Perfect(int n) {
	int check = 0;
	
	for(int i = 3; i <= n; i++) {
		for(int j = 2; j <= i; j++) {
			if(i % j == 0) {
                    check += i / j;
            }
		}
		if(i == check) {
                printf("\n %d", i);
                check = 0;
        } else {
                check = 0;
        }
	}
}

void Fibonacci(int n) {
	int n1 = 1;
	int n2 = 2;
	int next;
	for(int i = 0; i <= n; i++) {
		printf("\n %d", n1);
		next = n1 + n2;
        n1 = n2;
        n2 = next;
        if(n1 > n) {
            break;
        }
	}
}
int main(){
	int choice=0;
	int n;
	printf("Nhap n = ");
	scanf("%d",&n);
	while(choice != 1 || choice != 2 || choice != 3){
		printf("\n\nWhat do you want to do? \n 1.Factorial \n 2.Primes \n 3.Perfect number \n 4.Fibonacci \n 5.Exit");
		printf("\nPlease choose a number: ");
		scanf("%d",&choice);
		switch(choice){
			case(1):	printf("\nFactorial of (%d) = %d",n,Fact(n));
						break;
			case(2):	printf("\nPrimes from 2 to %d: ",n);
						Primes(n);
						break;
			case(3):	printf("\nPerfect numbers from 1 to %d: ",n);
						Perfect(n);
						break;
			case(4):	printf("\nThe Fibonacci sequence from 1 to %d: ",n);
						Fibonacci(n);
						break;
			case(5): 	return 0;
			default:  	printf("Invalid number!");			
		}
	}
}

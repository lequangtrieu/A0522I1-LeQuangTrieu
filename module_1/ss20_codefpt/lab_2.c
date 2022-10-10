#include <stdio.h>
int main(){
	int a, b;
    char opera;
    printf("Nhap phep toan: ");
    scanf("%c", &opera);
    printf("Nhap vao 2 so a, b: ");
    scanf("%d%d", &a, &b);
	switch(opera){
		case '+':	
			printf("\n%d + %d = %d", a, b, a+b);
			break;
		case '-':	
			printf("\n%d - %d = %d", a, b, a-b);
			break;
		case '*':
			printf("\n%d * %d = %d", a, b, a*b);
			break;
		case '/':	
			if(b==0)
				printf("\nKhong the chia cho 0");
			else
				printf("\n%d / %d = %.2f", a, b, (float)a/b);
			break;	
		case '%': 
			printf("\n%d mod %d = %d", a, b, a%b);
			break;	
		default:
			printf("\nKhong co phep toan %c!",opera);
			break;											
	}
	return 0;
}
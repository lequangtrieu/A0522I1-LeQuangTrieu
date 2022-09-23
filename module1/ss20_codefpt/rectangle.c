#include <stdio.h>
int main(){
	int length, width;
	printf("Nhap 2 canh cua 1 hinh chu nhat: ");
	scanf("%d %d",&length,&width);
	printf("Dien tich hinh chu nhat: length * width = %d\n", length * width);
	printf("Chu vi hinh chu nhat: 2(lenghth + width) = %d", 2 * (length + width));
	return 0;
}


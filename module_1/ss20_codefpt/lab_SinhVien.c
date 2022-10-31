#include<stdio.h>
#include<conio.h>
#include<string.h>
typedef struct {
    char HoTen[50];

} Sinh_Vien;
void Nhap_ds(int *n,Sinh_Vien sv[100])
{
    printf("\nNhap so sinh vien: ");
    scanf("%d",n);
    for(int i=0;i<*n;i++)
    {
        printf("\nNhap thong tin sinh vien: %d",i+1);
        printf("\nNhap ho ten: ");
        fflush(stdin);
        gets(sv[i].HoTen);
    }
}
void In_ds(int n,Sinh_Vien sv[100])
{
    printf("\nDANH SACH SINH VIEN");
    printf("\nSTT     HO TEN    ");
    for(int i=0;i<n;i++)
    {
        printf("\n%d\t%s",i+1,sv[i].HoTen);
    }
}

void Xoa_sv(Sinh_Vien sv[100]) {
	int index;
	printf("enter the index you wanna remove: ");
	scanf("%d", &index);
	char s[100] = "sinh vien da bi xoa khoi danh sach";
	strcpy(sv[index].HoTen, s);
}

void Tim_ds(int n,Sinh_Vien sv[100])
{
    int i=0;
    printf("\nTIM KIEM SINH VIEN");
    char name[50];
    printf("\nNhap ten sinh vien: ");
    fflush(stdin);
    gets(name);
    for(i=0;i<n;i++){
        if(strcmp(sv[i].HoTen,name)==0){
        printf("\nDANH SACH SINH VIEN TIM THAY");
        printf("\nSTT     HO TEN    ");
        printf("\n%d\t%s",i+1,sv[i].HoTen);
            break; 
        }
    }
    if(i==n){
        printf("Khong tim thay");
    }
}
main()
{
    int c = -1;
    Sinh_Vien sv[100];
    int n;

    while(c != 5){
    	printf("\nMenu: ");
        printf("\n1. Them danh sach hoc sinh: ");
        printf("\n2. Xoa mot hoc sinh: ");
        printf("\n3. Tim kiem mot hoc sinh: ");
        printf("\n4. In danh sach hoc sinh: ");
        printf("\n5. Ket thuc");
        printf("\nMoi ban chon: ");
        scanf("%d",&c);
    switch(c){
        case 1:
            Nhap_ds(&n,sv);
            break;
        case 2: 
        	Xoa_sv(sv);
        	break;
        case 3:
            Tim_ds(n,sv);
            break;
        case 4:
            In_ds(n,sv);
            break;
        }
    }
}
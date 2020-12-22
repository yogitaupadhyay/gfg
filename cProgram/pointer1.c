#include<stdio.h>
#include<conio.h>
int main(){
	int arr={1,2,45,4,5};
	int *p=arr;
	printf("%d\n",p);
	
	int x;
	printf("%d\n",&x);
	printf("%p\n",&x);
	
	int y=10;
	printf("%d\n",y);
	
	return 0;
}

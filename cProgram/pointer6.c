#include<stdio.h>
#include<conio.h>
int main(){
	//pointer to array
	int arr[5];
//	printf("%d %d\n",arr,&arr);
//	printf("%d %d\n",arr+1,&arr+1);
	int *p=&arr;
	printf("%p\n",p);
	printf(" %p\n",p+1);
	int (*ptr)[5]=&arr;
	printf("%p\n",ptr);
	printf(" %p\n",ptr+1);
return 0;	
}

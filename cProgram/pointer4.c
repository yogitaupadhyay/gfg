#include<stdio.h>
#include<conio.h>
int main(){

	int arr[]={1,2,3,4,5,6,7};
		int *p;
	p=arr;
	int i;
	for(i=0;i<7;i++){
		printf("%d\n",p[i]);
		printf("%p\n",&p[i]);
		printf("%p\n",p);
		
	}
	
	
	
	return 0;
}

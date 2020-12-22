#include<stdio.h>
#include<conio.h>
int main(){
	int *p;
	int x=12;
	p=&x;
	printf("*p= %d\n",*p);
	printf("p= %p\n",p);
	printf("&p= %p\n",&p);
	*p=2334;
	
	printf("*p= %d\n",*p);
	
	
	
	
	return 0;
}

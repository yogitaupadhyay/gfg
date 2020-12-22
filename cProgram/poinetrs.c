#include<stdio.h>
#include<conio.h>
int main(){

	int arr[3][3]={{1,2,5},{3,4,8},{5,6,7}};
		int *p;
	p=&arr;
	int i;
	int j;
	for(i=0;i<9;i++){
	
				printf("%d\n",*(p+i));
		printf("%p\n",&p[i]);
		
	
	//	printf("%p\n",p);
		
	}
	printf("%p",p )
	
	
	return 0;
}

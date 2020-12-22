#include<stdio.h>
#include<conio.h>
int main(){
	//pointer array
	
	int arr[3][4]={
	{1,2,6,5}
	,{3,4,8,9},
	{5,7,9,46}
	};
	int i=0;
	int j;
	int (*p)[4]=arr;
	printf("%d",sizeof(p));
	printf("%d",sizeof(arr));
	for(i=0;i<3;i++){
		for(j=0;j<4;j++){
				printf("%d\n",*(*(arr+i)+j));
	//	printf("%s\n",*(p+i));
	 	
		}

	}
return 0;	
}

#include<stdio.h>
#include<conio.h>
int main(){
	int arr[3][3]={9,5,7,
	              32,6,3,
               	   7,2,6};
               	   int sum=0;
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){	
			if(i==j||i+j==2){
				printf("%d ",arr[i][j]);
				sum+=arr[i][j];
			}
			}
		}
	
	
	printf("%d ",sum);

	
	
	return 0;
}

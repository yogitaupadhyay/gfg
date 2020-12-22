#include<stdio.h>
#include<conio.h>
int main(){
	int arr[3][3]={9,5,7,
	              32,6,3,
               	   7,2,6};
               	   int tran[3][3];
               	   int sum=0;
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){	
		tran[j][i]=arr[i][j];
			}
		}
	
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){	
		printf("%d ",arr[i][j]);
			}
			printf("\n");
		}
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){	
		printf("%d ",tran[i][j]);
			}
			printf("\n");
		}
	
	
	return 0;
}

#include<stdio.h>
#include<conio.h>
int main(){
	int arr1[3][3],arr2[3][3];
               	   int sum=0;
               	   printf("enter the first matrix");
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){	
			scanf("%d",&arr1[i][j]);
			}
		}
		 printf("enter the second matrix");
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){	
			scanf("%d",&arr2[i][j]);
			}
		}
	
	int res[3][3];
	for(int i=0;i<3;i++){		
		for(int j=0;j<3;j++){
		res[i][j]=0;	
		for(int k=0;k<3;k++){
			res[i][j]=res[i][j]+arr1[i][k]*arr2[k][j];
		}
				printf("%d ",res[i][j]);
			}
			printf("\n");
	
		}
	
	
	return 0;
}

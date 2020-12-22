#include<stdio.h>
#include<conio.h>
int main(){
	
printf("enter first matrix");

int  arr[3][3];
for(int i=0;i<3;i++){
	for(int j=0;j<3;j++){
		scanf("%d",&arr[i][j]);
	}
}
printf("enter second matrix");

int  arr1[3][3];
for(int i=0;i<3;i++){
	for(int j=0;j<3;j++){
		scanf("%d",&arr1[i][j]);
	}
}
int res[3][3];
for(int i=0;i<3;i++){
	for(int j=0;j<3;j++){
		int sum=0;
		for(int k=0;k<3;k++){
	sum	=sum+arr[i][k]*arr[k][j];
		}
			res[i][j]=sum;
	}
}


//printing of res
for(int i=0;i<3;i++){
	for(int j=0;j<3;j++){
		printf(" %d  ",res[i][j]);
	}
	printf("\n");
}
return 0;
}

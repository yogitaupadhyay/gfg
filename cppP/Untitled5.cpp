#include<stdio.h>
#include<conio.h>
int main(){
	int arr[]={9,5,7,32,6,3,7,2,6,8};
	for(int i=0;i<10;i++){
		for(int j=0;j<9;j++){
			if(arr[j]>arr[j+1]){
				int t;
				t=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=t;
			}
		}
	}
		for(int i=0;i<10;i++){
	printf("%d ",arr[i]);
	}
	
	
	return 0;
}

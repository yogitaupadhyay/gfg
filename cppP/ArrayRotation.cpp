#include<iostream>
#include<string.h>
using namespace std;
int main(){
	int arr[10]={1,2,3,4,5,6,7,8,9,1};
	int temp1[10];
	int n;
	cout<<"enter the no of  element  that are to be rotated";cin>>n;
	for(int i=0;i<10;i++){
		cout<<arr[i];
		
	}
	cout<<"\n";
	if(n==0){
	for(int i=0;i<10;i++){
		cout<<arr[i];
		
	}
	
	exit(0);	
	}
	
	for(int i=0;i<n;i++){
		temp1[i]=arr[i];
	}
	for(int j=0;j<n;j++){
	for(int i=0;i<9;i++){
		int temp;
		temp=arr[i];
		arr[i]=arr[i+1];
		arr[i+1]=temp;
	}
}
	/*for(int j=10-n;j<10;j++){
		arr[j]=temp1[j-10+n];
	}*/
	for(int i=0;i<10;i++){
		cout<<arr[i];
		
	}
	cout<<"\n";
	return 0;
}

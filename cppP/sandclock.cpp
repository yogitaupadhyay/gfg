#include<iostream>
using namespace std;
int main(){
	int arr[6][6];
	
	int s;int max=-325;
	
	for(int i=0;i<6;i++){
		for(int j=0;j<6;j++)
		{
         cin>>arr[i][j];
			}
		}
		
	for(int i=0;i<6;i++){
		for(int j=0;j<6;j++)
		{
        if(arr[i][j]>9||arr[i][j]<-9){
        	exit(0);
		}
			}
		}
		
	for(int k=0;k<4;k++){
		for(int m=0;m<4;m++){
		
	s=0;
	for(int i=0+k;i<3+k;i++){
		for(int j=0+m;j<3+m;j++){
			if(i==1+k)
			{
		     	if(j==1+m){
		     	s=s+arr[i][j];	
			   }
	    	}
	    	else{
	    		s=s+arr[i][j];
			}
		}
	}
	if(max<s){
		max=s;
	}

}
cout<<"\n";
}
cout<<"maximum sum="<<max;	
	return 0;
}

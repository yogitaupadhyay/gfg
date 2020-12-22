#include<bits/stdc++.h>
using namespace std;
int main(){
int n;
cin>>n;

int *p=new int[n];
	
	for(int i=0;i<n;i++){
		p[i]=1;
		
	}

	int c=1;
	int count=0;
	int j=0;
	while (c!=n)
	{
	if(p[j]==1){
		count++;
			if(count==3){
			p[j]=0;
			c++;
		
			count=0;
			
		}
		if(j==n-1){
			j=0;
		
			
		}else{
			
				j++;
		}
	
	}	else{
			if(j==n-1){
			j=0;
		 }else{
			
				j++;
		}
	}
		
	}
	for(int i=0;i<n;i++){
		if(p[i]==1){
			cout<<i;
		}
	}
}

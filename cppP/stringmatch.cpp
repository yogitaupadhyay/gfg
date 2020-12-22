#include<iostream>
#include<string.h>
using namespace std;
void matchstring(char string[][20],int ns ,char query[][20],int nq){
	
	for(int i=0;i<nq;i++){
		int m=0;
		for(int j=0;j<ns;j++){
			int k=strcmp(query[i],string[j]);
			if(k==0){
				m++;
			}
		}
		cout<<m<<"\n";
	}
}

int main(){
	int ns,nq;
	char string[1000][20];
	char query[1000][20];
	cout<<"enter the no strings";
	cin>>ns;
	
	for(int i=0;i<ns;i++){
		cin>>string[i];
		
	}
	cout<<"enter the no of query";
	cin>>nq;
	for(int i=0;i<nq;i++){
	cin>>query[i];
	}
matchstring(string,ns,query,nq);
	return 0;
}

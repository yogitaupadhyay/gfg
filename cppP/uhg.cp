#include<bits/stdc++.h>
using namespace std;
  char* camelcase(int n, char*str){
  	str[0]=str[0];
  	int i=1;
  	while(i!=n){
  		if(str[i]==' '){
  			str[i+1]=int(str[i+1])+32;
  			str[i+1]=char(str[i+1]);
		  }
  		
	  }
  	return str;
  }
 
 
 int main(){
 	char *str;
 	int n;
cin>>n;
 	str=new char[n];
 	

for(int i=0;i<n;i++){
	cin>>str[i];
}
for(int i=0;i<n;i++){
	cout<<str[i];
}
str=camelcase(n,str);
for(int i=0;i<n;i++){
	cout<<str[i];
}
 return 0;	
 }

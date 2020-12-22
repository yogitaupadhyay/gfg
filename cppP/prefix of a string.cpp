#include<iostream>
#include<string.h>
using namespace std;
int main(){
	string s;
	
	cout<<"enter the string";
	cin>>s;
	int i=1;
	int le=s.length();
	while(i<=le){
		for(int j=0;j<i;j++){
			cout<<s[j];
		}
		i++;
		cout<<"\n";
	}
	return 0;
	
}

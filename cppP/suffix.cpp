#include<iostream>
#include<string.h>
using namespace std;
int main(){
	
string s;
cout<<"enter the string";
	cin>>s;
int le=s.length();
int i=le-1;
while(i>=0){
	for(int j=i;j<le;j++){
		cout<<s[j];
	}
	i--;
	cout<<"\n";
}
return 0;


}

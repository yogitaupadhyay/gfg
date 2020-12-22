#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
int camelcase(string s){
	int n;
	for(int i=0;i<s.length();i++){
		if(65<=s[i]&&s[i]<=90){
			n++;
		}
	}
	return n;
}
int main(){
	int a,n;
	string s;
	cin>>s;
	n=camelcase(s);
	cout<<n;
	return 0;
}

#include<iostream>
#include<vector>
#include<algorithm>
using namespace  std;
int main(){
	int n;
	cin>>n;
	 vector<char>s;
	 for(int i=0;i<n;i++){
	 	char a;cin>>a;
	 	s.push_back(a);
	 }
	 for(int i=0;i<n;i++){
	 	if(s[i]=='0'){
	 		s[i]=1;
		 }
		 else{
		 	s[i]=0;
		 }
	for(int i=0;i<n;i++){
		cout<<s[i];
	}
	cout<<"\n";
	 }
	 return 0;
}

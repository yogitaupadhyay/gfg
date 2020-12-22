#include<iostream>
#include<vector>
#include<algorithm>
using namespace  std;
int main(){
	int n,k;
	cin>>n>>k;
	 vector<vector<char> >res;
	 vector<char>s;
	 for(int i=0;i<n;i++){
	 	char a;cin>>a;
	 	s.push_back(a);
	 }
	
 int t=n-k;int x=0;
 while(x<t){
 	for(int y=0;y<k;y++){
	 	for(int i=x;i<x+y;i++){
 		if(s[i]=='1'){
 			s[i]='0';
		 }
	 }
	 
	 res.push_back(s);
}x++;
 }
 for(int i=0;i<res.size();i++){
 	for(int j=0;j<res[i].size();j++){
 			cout<<res[i][j];
	 }
 	cout<<" ";
 }
	 return 0;
}

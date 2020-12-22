#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
void swap(char &a,char &b){
char t;
	t=a;	a=b;	b=t;
	
}
 void permutation(string s,int l,int r){
 	if(l==r){
 		cout<<s<<"\n";
	 }
	 else{
	 	for(int i=l;i<=r;i++){
	 		swap(s[l],s[i]);
	 		permutation(s,l+1,r);
	 		swap(s[l],s[i]);
		 }
	 }
}
int main(){
	string s;
cin>>s;
 int l=s.length();
permutation(s,0,l-1);
return 0;
}

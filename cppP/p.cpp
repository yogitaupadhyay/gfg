#include<bits/stdc++.h>
using namespace std;
  void swap(string &s,int l,int i){
  
	int temp;
	temp=s.at(l);
	s.at(l)=s.at(i);
	s.at(i)=temp;
}
 void permutation(string s,int l,int r){
 	if(l==r){
 		cout<<s<<"\n";
	 }else{
	 	for(int i=l;i<=r;i++){
	 			cout<<"swwap1="<<l<<","<<i<<"\n";
	 		swap(s,l,i);
	 		
	 		permutation(s,l+1,r);
	 			cout<<"swwap2="<<l<<","<<i<<"\n";
	 		swap(s,l,i);
		 }
	 }
	 
 	
 }
int main(){
	string s;
	cin>>s;
	permutation(s,0,(s.length()-1));
	return 0;
	
}

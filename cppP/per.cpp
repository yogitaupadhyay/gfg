#include<iostream>
#include<string>
#include<vector>
#include<algorithm>
using namespace std;
 int factorial(int n){
 	if(n==0||n==1){
 		return 1;
	 }
	 else{
	 	return (n*factorial(n-1));
	 }
 }
int main(){
	vector<char>s;
	int n;
	cin>>n;
	for(int i=0;i<n;i++){
		char a;
		cin>>a;
		s.push_back(a);
	}

	int l=factorial(n);
	
	for(int i=0;i<l;i++){
		for(int j=0;j<n;j++){
	cout<<s[j];
	}
	next_permutation(s.begin(),s.end());
		cout<<"\n";
	}
	
return 0;	
}


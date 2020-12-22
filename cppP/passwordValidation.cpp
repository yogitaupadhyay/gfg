#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
struct password{
	int digit;
	int lowercase;
	int uppercase;
	int spchar;
};
int minimumNumber(char s[],int n){
	struct password p={0,0,0,0};int k=0;
	for(int i=0;i<n;i++){
		if(n<6){
			return (6-n);
		}
		if(48<=s[i]&&s[i]<=57){
			p.digit++;
		}
		if(65<=s[i]&&s[i]<=90){
			p.uppercase++;
		}
		if(97<=s[i]&&s[i]<=122){
			p.lowercase++;
		}
		if(35<=s[i]&&s[i]<=43||s[i]==33||s[i]==64||s[i]==94||s[i]==45){
			p.spchar++;
		}
	}
	if(p.digit==0){
		k++;
	}	
	if(p.uppercase==0){
		k++;
	}
	if(p.lowercase==0){
		k++;
	}
	if(p.spchar==0){
		k++;
	}
	return k;
	}
int main(){
	int n,m;
	cin>>n;
	char *s=new char[n];
	cin>>s;
	m=minimumNumber(s,n);
	cout<<m;	
	return 0;
}

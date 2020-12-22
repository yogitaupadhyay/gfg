#include<iostream>
#include<string.h>
using namespace std;
int main(){
	string s,p;int m=0,i=0;int j=0;
	cout<<"enter the string";
	cin>>s;
	cout<<"enter the pattern to be search";
	cin>>p;
	int pl=p.length();cout<<pl;
	int sl=s.length();cout<<sl;
	while(i<pl)
	{
		if(m==pl){
		break;}
		while(j<sl){
			if(p[i]==s[j]){
				i++;
				j++;
				m++;break;
			}
				else{
					if(m>0){m=0;
					}
			j++;
		}
		}
	
	
	}
	if(m==pl){
		cout<<"string is present at"<<j-pl;
	}
	else{
		cout<<"string is not present";
	}
///	cout<<"hello";
	
	return 0;
}

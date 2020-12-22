#include <bits/stdc++.h>

using namespace std;


void timeConversion(string &s) {
	

	if(s[8]=='p'||s[8]=='P'){
		if(s[1]<='9'&&s[0]=='0'){
			int m=s[1];
			m=m+2;
			s[1]=m;
			
			
			s[0]='1';
}
if(s[1]=='0'&&s[0]=='1'){
	s[1]=2;s[0]=2;
}
if(s[1]=='1'&&s[0]=='1'){
	s[1]=3;s[0]=2;
}	
if(s[1]=='2'&&s[0]=='1'){
	s[1]='0';s[0]='0';
}	
	}
for(int i=0;i<8;i++){
	cout<<s[i];
}

}

int main()
{
 string s;
cin>>s;
 timeConversion(s) ;
  return 0;
}


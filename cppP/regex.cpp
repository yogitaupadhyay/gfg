#include <bits/stdc++.h>
#include<string.h>
using namespace std;




int main()
{
    int n,k;
    cin >> n;
    vector<string>namelist;
    vector<string>emaillist;
    string name;
    string email;
    while(n-->0){
        cin>>name>>email;
       int pos= email.find('@');
    string s2=email.substr(pos);
    string s1="@gmail.com";
    k=0;
for(int i=0;i<s2.length();i++){
	if(s2[i]==s1[i]){
		k++;
	}else{
		break;
	}
}

   
    if(k==s2.length()){
    	namelist.push_back(name);
    	emaillist.push_back(email);
	}
}
	sort(namelist.begin(),namelist.end());
	sort(emaillist.begin(),emaillist.end());
	for(int i=0;i<namelist.size();i++){
		cout<<namelist[i]<<"\n";
	}
        
        
        
    
   return 0; 
}

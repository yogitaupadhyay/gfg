#include <bits/stdc++.h>

using namespace std;
vector<string>fname;
vector<string>email;

int main(){
    int t;
    cin>>t;
    for(int i=0;i<t;i++){
    	string f,e;
    	int k=0,s=0;
        cin>>f>>e;
		if(f.length()<=20&&e.length()<=50){
		 for(int i=0;i<f.length();i++){
        	if(f[i]>96&&f[i]<123){
        		 k++;
			}
		}
       if(k==f.length()){
       	fname.push_back(f);
       	for(int i=0;i<e.length();i++){
        	if(e[i]>96&&e[i]<123||e[i]=='@'||e[i]=='.'){
        		 s++;
			}
		}
       if(s==e.length()){
       email.push_back(e);
	   }
	   
	   }
	    
         }
}
sort(fname.begin(),fname.end());
for(int i=0;i<fname.size();i++){
	cout<<fname[i]<<"\n";
}
    return 0;
}


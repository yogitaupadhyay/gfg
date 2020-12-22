#include <bits/stdc++.h>
#include<vector>
using namespace std;

int main(){
    int n;
    cin>>n;
    vector<int>lb;
    for(int i=0;i<n;i++){
    	int k;
        cin>>k;
        lb.push_back(k);
    }
    int s;
    cin>>s;
    vector<int>alice;
    for(int i=0;i<s;i++){
       int k;
        cin>>k;
        alice.push_back(k);
    }
   lb.erase(unique(lb.begin(),lb.end()),lb.end());
    
    int j=lb.size()-1;int t;t=lb.size()+1;
    for(int i=0;i<s;i++){
    	
    		while(lb[j]<=alice[i]){
    			
    		t--;j--;
    			}
		cout<<t<<"\n";
    }
    return 0;
}

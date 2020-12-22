#include <bits/stdc++.h>
using namespace std;
int gcd(int a,int b){
    if(b==0){return a;}
    return gcd(b,a%b);
}
int flcm(int a,int b){
    if(a==0&&b==0){return 0;}
    int res;
    res=(a*b)/gcd(a,b);
    return res;
}
int main(){
    int n,m,t;int res=1;
    cin>>n>>m;
    vector<int>match;
    vector<int>match1;
    vector<int>a;
   vector<int>b;
    for(int i=0;i<n;i++){
        int k;cin>>k;a.push_back(k);
    }
    
     for(int i=0;i<m;i++){
    int k;cin>>k;b.push_back(k);
    }
    
for(int i=0;i<n;i++){
    res=flcm(res,a[i]);
}
   int max1=*max_element(b.begin(),b.end());
   int min2=*min_element(b.begin(),b.end());
   int c=1,res2;
   res2=res;
    while(res2<=max1){
         res2=res*c;
		 c++;
        match.push_back(res2);
    }

    for(int i=1;i<=min2;i++){
    int	p=0;
    	for(int j=0;j<m;j++){
    	if(b[j]%i==0){
    			p++;	}
		}
		if(p==m){
		match1.push_back(i);}
	}
	
     for(int i=0;i<match.size();i++){
         for(int j=0;j<match1.size();j++){
             if(match[i]==match1[j]){
                 t++;
             }
         }
     }
    cout<<t;;
    return 0;
}

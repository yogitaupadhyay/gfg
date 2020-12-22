#include <bits/stdc++.h>
using namespace std;
int main(){
	int m,c=0;cin>>m;
	vector<int>b;
	vector<int>f;
	 for(int i=0;i<m;i++){
    int k;cin>>k;b.push_back(k);
    }
    int min1=*min_element(b.begin(),b.end());
    cout<<"max="<<min1<<"\n";
    for(int i=1;i<=min1;i++){
    	c=0;
    	for(int j=0;j<m;j++){
    	if(b[j]%i==0){
    			c++;	}
		}
		if(c==m){
		f.push_back(i);}
	}
	for(int i=0;i<f.size();i++){
		cout<<"f="<<f[i];
	}
return 0;
}

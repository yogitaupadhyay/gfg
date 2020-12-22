#include<iostream>
#include<vector>
using namespace std;
int main(){
	int t;
	vector<int>res;
	cin>>t;
			while(t-->0)
{
	vector<int>minute;
	int n,k;
	cin>>n>>k;
/*	for(int i=0;i<n;i++){
		int a;
		cin>>a;
		minute.push_back(a);
	}*/
	if(k<=n){
	cout<<k;
	}else{
		int c;
		c=n;int j;int i;
		while(c!=k){
		for(i=1;i<=n;i++){
			for(j=1;j<=i;j++){
				if(i%j==0){
					
					if(c<k){
						c++;
						
					}
					if(c==k){
					break;
				}
				}
							}
			
		if(c==k){
			break;
		}
		}
		res.push_back(j);	
		}
			}
	}
	for(int i=0;i<res.size();i++){
		cout<<res[i]<<"\n";
	}
	res.clear();
			return 0;
}

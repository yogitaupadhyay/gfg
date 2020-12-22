#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
int main(){
    vector<int>toys;
    int n,k,d,t=0;int s=0;
    cin>>n>>k;
    while(n-->0){
        cin>>d;
        toys.push_back(d);
    }
    sort(toys.begin(),toys.end());
    for(int i=0;i<toys.size();i++){
	cout<<toys[i]<<"\n";
	}
	int i=0;
    while((s+toys[i])<=k){
	}
	cout<<"toys"<<toys[i]<<"\n";
            s=s+toys[i];
            t++;i++;
        }
		 cout<<t;
		 return 0;
}

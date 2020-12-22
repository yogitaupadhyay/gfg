#include <iostream>
using namespace std;

struct profile{
  int time;
  int energy;
};

void func(profile p[5],int i,int E,int D,int sum,int &ans){
    if(sum > ans || E<0 || i>=5){
    	return;
    }
    
    if(D<=0){
        ans = min(sum,ans);
        return;
    }
    
    func(p,i,E-(p[i].energy),D-1,sum+(p[i].time),ans);
    func(p,i+1,E,D,sum,ans);
}

int main(){
    int t;
    cin>>t;
    while(t--){
        int E,D;
        cin>>E>>D;
        profile p[5];
        for(int i=0;i<5;i++)
        {
            int min,sec;
            cin>>min>>sec>>p[i].energy;
            p[i].time=60*min + sec;
        }
        int ans=99999999;
        func(p,0,E,D,0,ans);
        cout<<ans/60 <<" "<<ans%60<<endl;
    }
}

#include <bits/stdc++.h>

using namespace std;
int main(){
    int n;
    cin>>n;
    int *arr=new int [n];
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    int d,m,res=0;
    cin>>d>>m;
    int t=n-m;int j=0;
    if(t==0){
        int k=0;
        for(int i=0;i<n;i++){
            k=k+arr[i];
        }
        if(k==d){
            res++;
        }
    }
    while(j<=t){
       int s=0;
        for(int i=j;i<j+m;i++){
       s=s+arr[i];
        }
        j++;
        if(s==d){
            res++;
        }
    }
    
    cout<<res;
    return 0;
}


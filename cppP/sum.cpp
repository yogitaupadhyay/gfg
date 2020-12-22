#include <bits/stdc++.h>

using namespace std;

int main(){
    int n,k,t=0;
    cin>>n>>k;
    int * arr=new int[n];
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    for(int i=0;i<n-1;i++){
      for(int j=i+1;j<n;j++){
          if((arr[i]+arr[j])%k==0){
            t++;
        }
      }
        
    }
    cout<<t;
    return 0;
}

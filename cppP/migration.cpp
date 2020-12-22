#include <bits/stdc++.h>

using namespace std;

int main(){
    int n;
    cin>>n;
    vector<int>bird;
    vector<int>res;
    for(int i=0;i<n;i++){
        int a;
        cin>>a;
        bird.push_back(a);
    }
    int max=0;int m=0;
    for(int i=1;i<=5;i++){
        res.push_back(i);
        m= count(bird.begin(),bird.end(),i);
        res.push_back(m);
        if(max<=m){
            max=m;
        }
 }
    for(int i=1;i<res.size();i=i+2){
 if(res[i]==max){
            cout<<res[i-1];
        }    }
    
    return 0;
}

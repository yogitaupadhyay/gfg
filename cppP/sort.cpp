#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;
int main(){
   int n,a;
    cin>>n;
    vector<int>vect(n);
    for(int i=0;i<n;i++){
        cin>>a;
        vect.at(i)=a;
         }
    
    sort(vect.begin(),vect.end());
    
    for(int i=0;i<n;i++){
        cout<<vect[i]<<" ";
    }
    return 0;
}

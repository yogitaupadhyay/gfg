#include<iostream>
using namespace std;

int balloon[100];

int getmaxpoint(int l,int r,int n){
    int maxscore = 0;
    for(int i=l+1 ; i<r ; i++){
        int current_sum = 0;
        current_sum = getmaxpoint(l,i,n) + getmaxpoint(i,r,n);

        if(l==0 && r==n+1){
            current_sum += balloon[i];
        }
        else{
            current_sum += (balloon[l]*balloon[r]);
        }

        if(current_sum > maxscore){
            maxscore=current_sum;
        }
    }
    return maxscore;
}

int main(){
    int t,n;
    cin>>t;
    while(t--){
        cin>>n;
        balloon[0]=1;
        balloon[n+1]=1;
        
        for(int i=1;i<=n;i++){
            cin>>balloon[i];
        }
        
        int ans = getmaxpoint(0,n+1,n);
        cout<<ans<<endl;
    }
    return 0;
}

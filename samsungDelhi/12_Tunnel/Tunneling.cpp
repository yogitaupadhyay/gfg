#include <iostream>
using namespace std;
#define LEFT 0
#define RIGHT 1

int s[15][500];
int c1, r1, c2, r2, m1, m2;
int N, H, V;
int cost[16];
int final_cost;
/**
//try all possible
void build(int left, int right, int last, int cost){
    if(left>=right){
        cout<<endl;
        return;
    }
    if(last == LEFT){
	//if last day left machine works
        cout<<s[left]<<" ";
        build(left+1, right, LEFT, cost + s[left+1]*c1+r1);
        build(left, right-1, RIGHT, cost + s[right-1]*c2);
    }else{
        cout<<s[right]<<" ";
        build(left, right-1, RIGHT, cost + s[right-1]*c2+r2);
        build(left+1, right, LEFT, cost + s[left+1]*c1);
    }   
}*/

int build(int n){
    int ans = -1;
    for(int i=0, mc2, mc1=0, extra, j, total_cost, count=0;i<=H;i++){
        mc2 = 0;
        if(i>0)
            mc1 += s[n][i-1]*c1;
        for(j=i+1, count=0;j<=H;j++,count++){
            mc2 += s[n][j-1]*c2;
        }
        //cout<<i<<" "<<H-i<<endl;
        //second works more
        if(H-i>i){
            extra = (H-i-i-1)*r2;
            //cout<<i<<" "<<extra<<endl;
        }
        //first works more
        else if(H-i<i){
            extra = (i-H+i-1)*r1;
            //cout<<i<<" "<<extra<<endl;
        }
        //cout<<mc1<<" "<<mc2<<" "<<extra<<endl;
        total_cost = mc1+mc2+extra;
        if(ans == -1) ans = total_cost;
        else ans = min(total_cost, ans);
    }
    return ans;
}

void findBest(int c, int start, int selected, int last){
    if(selected == N){
        if(final_cost == -1){
            final_cost = c;
        }else if(final_cost>c){
            final_cost = c;
        }
        return;
    }
    if(start >= V)
        return;
    int d = 0;
    if(last == -1){
        d = 0;
    }else{
        d = (start-last);
    }
    findBest(c+cost[start] + (m1*m1 + m2*m2)*d, start+2, selected+1, start);
    findBest(c, start+1, selected, last);
}

int solve(){
    cin>>N>>H>>V;
    for(int i=0; i<V; i++){
        for(int j=0; j<H; j++){
            cin>>s[i][j];
        }
    }
    cin>>c1>>r1>>m1;
    cin>>c2>>r2>>m2;
    final_cost = -1;
    for(int i=0;i<V;i++){
        cost[i] = build(i);
        //cout<<cost[i]<<" ";
    }
    findBest(0, 0, 0, -1);
    cout<<final_cost<<endl;
}

int main(){
    int T;
    cin>>T;
    while(T--){
        solve();
    }
    return 0;
}

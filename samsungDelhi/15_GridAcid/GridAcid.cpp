#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int a[3002][3002];
int v[3002][3002];
int p[3][10000000];


void solve(int n,int m,int x,int y,int& total,int& sp ,int c){
    int start=0,end=1;
    p[0][0]=x;
    p[1][0]=y;
    p[2][0]=1;
    int row[4]={-1,0,1,0};
    int col[4]={0,1,0,-1};
    int k=0;
    int c1=1;
    v[x][y]=1;
    
    while(start!=end)
    {
        int e=p[0][start],f=p[1][start],g=p[2][start];
        for(int i=0;i<4;i++){
            if(e+row[i]>=1 && e+row[i]<=n && f+col[i]>=1 && f+col[i]<=m){
                if(v[e+row[i]][f+col[i]]==0 && a[e+row[i]][f+col[i]]==1){
                    p[0][end]=e+row[i];
                    p[1][end]=f+col[i];
                    p[2][end]=g+1;
                    v[e+row[i]][f+col[i]]=1;
                    end++;
                    c1++;
                }
                else if(v[e+row[i]][f+col[i]]==0 && a[e+row[i]][f+col[i]]==2){
                    k++;
                    if(k==4){
                        sp=g;
                        c1++;
                    }
                }

                if(c==c1){
                    if(g!=sp)
                        total=g+1;
                    else
                        total=g;
                    return ;
                }
            }
        }
        start++;
    }
}
    
int main() {
    ios::sync_with_stdio(false);
    cin.tie(0);
    int t;
    cin>>t;
    int d=1;
    while(t--){
        int n,m;
        cin>>n>>m;
        int e,f;
        cin>>e>>f;
        int x,y;
        int c=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                cin>>a[i][j];
                if(a[i][j]==2){
                    x=i;y=j;
                }
                if(a[i][j]==1 || a[i][j]==2)
                    c++;
            }
        }
       
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++)
                v[i][j]=0;
        }
        
        int total=-1,sp=-1;
        if(x==1 || x==n || y==0 || y==m){
            cout<<"Case #"<<(d++)<<endl;
            cout<<-1<<" "<<-1<<endl;
            
        }
        else if(a[x-1][y]==0 || a[x][y+1]==0 || a[x+1][y]==0 || a[x][y-1]==0){
             cout<<"Case #"<<(d++)<<endl;
            cout<<-1<<" "<<-1<<endl;
        }
        else{
            solve(n,m,e,f,total,sp,c);
            cout<<"Case #"<<(d++)<<endl;
            cout<<sp<<" "<<total<<endl;
        }
    }
    return 0;
}
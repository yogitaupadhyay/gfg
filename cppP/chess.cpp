#include <bits/stdc++.h>

using namespace std;

int main(){
    int n,o;
    cin>>n>>o;
    int r,c;
    cin>>r>>c;
    int r1,c1;
    int **chess=new int*[n];
    for(int i=0;i<n;i++){
        chess[i]=new int[n];
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            chess[i][j]=1;
        }
    }
  
for(int i=0;i<o;i++){
    cin>>r1>>c1;
    chess[r1][c1]=0;
    cout<<"helo1";
    }
    //staight line trace
int i=r;int j=c;
    int steps=0;
      
    while(i<=n&&chess[i][j]==1){
    	 i++;
        steps++;
        cout<<"steps="<<steps<<"\n";
       
        }
        i=r;
    while(i>=1&&chess[i][j]==1){
        steps++;i--;
        cout<<"steps="<<steps<<"\n";
    }
    
    i=r;j=c;
    while(j<=n&&chess[i][j]==1){
        steps++;
        j++;
        }
        j=c;
    while(j>=1&&chess[i][j]==1){
        steps++;j--;
    }
     //diagonal trace
     i=r;j=c;
    while(i<=n&&j<=n&&chess[i][j]==1){
        steps++;
        i++;j++;
        }
    i=r;j=c;
    while(i>=1&&j>=1&&chess[i][j]==1){
        steps++;
        i++;j++;
    }
    //------------------------------------------------
     i=r;j=c;
    while(i<=n&&j<=n&&chess[i][j]==1){
        steps++;
        i--;j--;
        }
    i=r;j=c;
    while(i>=1&&j>=1&&chess[i][j]==1){
        steps++;
        i--;j--;
    }
    //------------------------------------------------
     i=r;j=c;
    while(i>=1&&j<=n&&chess[i][j]==1){
        steps++;
        i--;j++;
        }
    i=r;j=c;
    while(i<=n&&j>=1&&chess[i][j]==1){
        steps++;
        i++;j--;
    }
    //----------
    cout<<"steps=="<<steps;
    
    return 0;
}

#include <bits/stdc++.h>

using namespace std;

int main(){
    int lastans=0;
    int size=3;
int n,q;
    cin>>n>>q;
    vector<int>row;
    vector<vector<int> >seq;
    vector<vector<int> >p;
    for(int i=0;i<q;i++){
        for(int j=0;j<3;j++){
            int a;
        cin>>a;
        
        row.push_back(a);
        }
        p.push_back(row);
        
    }
 for(int i=0;i<q;i++){
 cout<<"heelo"<<"\n";
       if(p[i][0]==1){
           int n2=((p[i][1]^lastans)%n);
           cout<<"n2="<<n2<<"p="<<p[i][1]<<"p1="<<p[i][2];
seq[n2].push_back(p[i][2]);
for(int j=0;j<seq[n2].size();j++){
	cout<<seq[n2][j];
}
    }else{
     int n1=seq[((p[i][1]^lastans)%n)].size();
               
           lastans=p[i][2]%n1;
                 
           cout<<lastans<<"\n";    }}
    return 0;

}

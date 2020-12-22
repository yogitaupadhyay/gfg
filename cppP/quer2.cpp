#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
void matchstring(vector<vector<char> >&x,vector<vector<char> >&y){
    for(int i=0;i<y.size();i++){
        cout<<count(x.begin(),x.end(),y[i])<<"\n";
 }
}
int main(){
    int n,nq;char a[20],b[20];
    cin>>n;
    if(1>n||n>1000){exit(0);}
       vector<vector<char> >vect;
    vector<vector<char> >q;
    
    for(int i=0;i<n;i++){
    	for(int j=0;j<vect[i].size();j++){
    		cin>>vect[i][j];
    		
		}
        
         
    }
    for(int i=0;i<n;i++){
        if(1>vect[i].size()||vect.size()>20){
        	exit(0);
		}
          }
    cin>>nq;
    if(1>n||n>1000){exit(0);}
       
    for(int i=0;i<nq;i++){
    	for(int j=0;j<q.size();j++){
    		 cin>>q[i][j];
		}
       
          }
    for(int i=0;i<n;i++){
        if(1>q[i].size()||q.size()>20){
        	exit(0);
		}
         
    }
matchstring(vect,q);
    return 0;
}

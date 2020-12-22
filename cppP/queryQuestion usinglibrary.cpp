#include<iostream>
#include<cstdio>
#include<vector>
#include<algorithm>
using namespace std;
int main(){
int nseq,size,seq;
int nquery;
int lastans=0,a;
	cin>>nseq;
	cin>>nquery;
 vector<int>q;
vector<vector<int> >v(nseq,vector<int>());
for(int i=0;i<nquery;i++){
	for(int j=0;j<3;j++){
		cin>>a;
		q.push_back(a);
		
	}
	if(q[0]==1){
		v[(q[1]^lastans)%nseq].push_back(q[2]);
	}
	else{
		seq=(q[1]^lastans)%nseq;
		size=v[seq].size();
		lastans=v[seq][q[2]%size];
		cout<<lastans<<"\n";
	}
	q.clear();
	}

	
	return 0;
}

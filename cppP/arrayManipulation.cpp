#include<iostream>
#include<vector>
#include<algorithm>
//void arraymanipulation(int na,vector<vector<int>>q);//
using namespace std;
int main(){
	int na,nq;
	vector<int>arr;
	vector<vector<int> >query;
	cin>>na>>nq;
		for(int i=0;i<na;i++){
		arr[i]=0;
	}
	for(int i=0;i<nq;i++){
		vector<int>row;
		for(int j=0;j<3;j++){
			int a;
			cin>>a;
			row.push_back(a);
			}
			query.push_back(row);
	}
	
	return 0;
}

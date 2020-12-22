#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;
void arraymanipulation(int na,vector<vector<int> >&q);
int main(){
	int na,nq;
	
	vector<vector<int> >query;
	cin>>na>>nq;
		
	cout<<"a"<<" "<<"b"<<" "<<"k"<<"\n";
	for(int i=0;i<nq;i++){
		vector<int>row;
		for(int j=0;j<3;j++){
			int a;
			cin>>a;
			row.push_back(a);
			}
			query.push_back(row);
	}
	 arraymanipulation(na,query);
	return 0;
}
void arraymanipulation(int na,vector<vector<int> >&q){
	vector<int>arr;int m=0;
	for(int i=0;i<na;i++){
		arr.push_back(0);
	}
		
	for(int i=0;i<q.size();i++){
		for(int j=(q[i][0]-1);j<q[i][1];j++){
				m=arr[j]+q[i][2];
		arr.at(j)=m;
				}
			}
			sort(arr.begin(),arr.end());
			for(int i=0;i<na;i++){
				cout<<arr[i];
			}
			cout<<arr[na-1];
}

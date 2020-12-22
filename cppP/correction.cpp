#include<iostream>
#include<vector>
using namespace std;
bool isperiodic(string s){
	
	
}
int main(){
	int t,n,k;
	cin>>t;
	vector<vector<char> >s;
	for(int i=0;i<t;i++){
			cin>>n>>k;
			vector<char>row;
			for(int j=0;j<n;j++){
					char a;
				cin>>a;
				row.push_back(a);
			}
			s.push_back(row);
	}
for(int i=0;i<t;i++){
	l=s[i].size();
		vector<string>res;
		next_permutation(s[i].begin(),s[i].end());
    if(!isperiodic(m)){
    	res.push_back(m);
	}
	

}
	
	return 0;
}

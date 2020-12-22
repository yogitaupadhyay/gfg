#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
bool isperiodic(vector<char>s){
	int p;
	if(s.size()==count(s.begin(),s.end(),s[0])){
		return true;
	}
else if (s.size()%2!=0){
  return false;
}
	else{
		int j=2;int m=0;
	while(j!=s.size()){
		int y=s.size()/j;
		for(int k=0;k<y;k++){
			if(s[k]==s[k+y-1]){
				m++;
			}
		}
		if(m==j){
			return true;
			break;
		}
		j++;
	}
	}
	return false;
	

}
int factorial(int n){
	if(n==1||n==0){
		return 1;
	}
	else{
		return n*factorial(n-1);
	}
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
	int l=s[i].size();
	int x=0;
		vector<vector<char> >res;
	int m=factorial(s[i].size());
	for(int k=0;k<m;k++){
			next_permutation(s[i].begin(),s[i].end());
			for(int j=0;j<s[i].size();j++){
		cout<<s[i][j];
	}
	res.push_back(s[i]);

cout<<" ";
	}

res.erase(unique(res.begin(),res.end()),res.end());
for(int j=0;j<res[i].size();j++){
		if(!isperiodic(res[i])){
x++;
}
	}
	cout<<"x="<<x;	
cout<<"\n";
}
	
	return 0;
}

#include<iostream>
#include<vector>
#include<algorithm>
using namespace  std;
int main(){
	int n;
	cin>>n;
	 vector<char>s;
	 for(int i=0;i<n;i++){
	 	char a;cin>>a;
	 	s.push_back(a);
	 }
	if(s.size()==count(s.begin(),s.end(),s[0])){
		cout<<"yes";
	}
else if (s.size()%2!=0){
	cout<<"false";
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
			cout<<"yes";
			break;
		}
		j++;
	}
	}
	
	return 0;
}

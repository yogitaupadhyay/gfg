#include<iostream>
using namespace std;
int main(){
	int n;
	list<int>s;//list of socks color
	int input;int pairs=0;
	cin>>n;
	while(cin>>input){
		if(find(s.begin(),s.end(),input )!=s.send()){
			pairs++;
			s.remove(input);
			s.remove(input);
			continue;
		}
		
		s.push_back(input);
	}
	cout<<pairs;
	return 0;
	
	
	return 0;
}

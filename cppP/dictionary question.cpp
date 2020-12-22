#include<iostream>
#include<map>
#include<iterator> 
using namespace std;
int main(){
	int n;
	cin>>n;
	int num;string name;
	map<string,int>p;
	
	for(int i=0;i<n;i++){
		cin>>name;
		cin>>num;
		p[name]=num;
	}
	while(cin>>name){
		if(p.find(name)!=p.end()){
			cout<<name<"="<<p.find(name)->second<<"\n";
		}
		else{
			cout<<"not found"<<"\n";
		}
	}
	return 0;
}

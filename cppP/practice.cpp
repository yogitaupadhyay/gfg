#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <map>
#include<string>
using namespace std;
int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
	int n,t;
	string a;
	cin>>n; 
    map<std::string,int> p;
    for(int i=0;i<n;i++){
    	cin>>a>>t;
    		 p.insert(pair<string,int>(a,t));
	}
	
	for(int j=0;j<n;j++){
		cin>>s;
		vect.at(j)=s;m++;
	}
	map<string ,int>::iterator it1;
	for(int j=0;j<m;j++){
  for(it1=p.begin();it1!=p.end();++it1){
  	if(it1->first==vect[j])
{
	cout<<it1->first<<" "<<it1->second<<"\n";
  }  }
	
	}
    return 0;
}

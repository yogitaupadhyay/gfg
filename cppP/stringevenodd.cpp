#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include<string.h>
using namespace std;


int main() {
    int n;
	
	cin>>n;
	char **s=new char*[n];
	for(int i=0;i<n;i++){
		s[i]=new char[10000];
	}
	for(int i=0;i<n;i++){
		cin>>s[i];
	}
    for(int i=0;i<n;i++){
        for(int j=0;s[i][j]!='\0';j++){
            if(j%2==0){
                cout<<s[i][j];
            }
            }
            cout<<" ";
            for(int j=0;s[i][j]!='\0';j++){
            if(j%2!=0){
                cout<<s[i][j];
            }
            }
            cout<<"\n";
        }
    
    return 0;
}


#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {   
    int n,m,j;cin>>n;
    vector<int>number;                                                                   //30 1 4 9 16 25 36 49 64 81 100 121
                                                                                   // 144 169 196 225 256 289 324 361 400 441 484
                                                                                  // 529 576 625 676 729 78
    int d;bool p;
 while(n-->0){
        cin>>d;
        number.push_back(d);
     }
    for(int i=0;i<number.size();i++){
        if(number[i]==1){
            cout<<"Not prime"<<"\n";
       }else{
       	for(j=2;j*j<=number[i];j++){
            if(number[i]%j==0){
                cout<<"Not prime"<<"\n";
                break;
            }
        }
    if(j*j>number[i]){
        cout<<"Prime"<<"\n";
    }
	   }
 
        
        }  
    return 0;
}


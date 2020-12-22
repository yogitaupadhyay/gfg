#include<iostream>
#include<vector>
#include<algorithm>
using namespace  std;
int main(){
int r,g,y,p;
int pair=0;
cin>>r>>g>>y;
cin>>p;
int i=0;
int r1=0,g1=0,y1=0;
while(pair!=p){
	if(r1<r){	
			r1++;		
	i++;
	if((r1%2==0&&r1>0)){
		pair++;
	if(p==pair){
			cout<<i;
			exit(0);
			}
		}
	}

if(g1<g){
	g1++;
	i++;
	if((g1%2==0&&g1>0)){
		pair++;
			if(p==pair){
			cout<<i;
			exit(0);
			}
	}
}
	if(y1<y){
			y1++;
		i++;
		
			if((y1%2==0&&y1>0)){
		pair++;
	if(p==pair){
			cout<<i;
			exit(0);
			}
	}
	}
		}
	return 0;
}




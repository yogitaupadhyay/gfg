#include<iostream>
using namespace std;
int main(){
	int pn,fn,flag1,flag2;
	cout<<"enter the no of pages";cin>>pn;cout<<"enter the no frames";cin>>fn;
	int frame[5],page[20],tk;int k;
for(int j=0;j<fn;j++){
	frame[j]=-1;
}
cout<<"enter the pages";
for(int i=0;i<pn;i++){
cin>>page[i];
}
int i;int pf;
//algo main	
for(i=0;i<pn;i++){
	flag1=flag2=0;
	//if page is already in memory
	for(int j=0;j<fn;j++){
		if(frame[j]==page[i]){
			flag1=flag2=1;pf++; break;
		}
	}
	//if space in memory is free
	if(flag1==0){
		for(int j=0;j<fn;j++){
	if(frame[j]==-1){
		frame[j]=page[i];pf++;flag2=1;break;
	}
}
	}
	//memory is full
	if(flag2==0){
		if(k>fn-1){
			k=0;
		}
		if(k<=fn-1){
			frame[k]=page[i];pf++;k++;
		}
		
	}
	//print the result
	for(int j=0;j<fn;j++){
		cout<<frame[j];
	}
	cout<<"\n";
}
	return 0;
	
}

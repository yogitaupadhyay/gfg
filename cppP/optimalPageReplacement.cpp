#include<iostream>
using namespace std;
int main(){
	int pn,fn;
	int frame[5],page[20],tk;
	int k,i;
	int p[5],flag3,flag1,flag2,pos,max;
	//input from user
		cout<<"enter the no of pages";cin>>pn;cout<<"enter the no frames";cin>>fn;
		//set frame value to -1
for(int j=0;j<fn;j++){
	frame[j]=-1;
}
//input the string
cout<<"enter the pages";
for(int i=0;i<pn;i++){
cin>>page[i];
}
//main algo
int pf;
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
	if(flag2==0){
		flag3=0;
		//priority assign
		for(int j=0;j<fn;j++){
			p[j]=21;
			
		}
		for(int j=0;j<fn;j++){
			for(int k=i;k<pn;k++){
				if(frame[j]==page[k])
				{
					p[j]=k;
				}
			}
		}
		for(int j=0;j<fn;j++){
		if(p[j]==21){
			pos=j;flag3=1;break;
		}
		
		}
		//max priority
		if(flag3==0){
				max=p[0];pos=0;
		for(int j=0;j<fn;j++){
			if(p[j]>max){
				max=p[j];pos=j;
			}
		}
		
	}
	frame[pos]=page[i];pf++;
	}
	for(int j=0;j<fn;j++){
		cout<<frame[j];
		
	}
	cout<<"\n";
}
}

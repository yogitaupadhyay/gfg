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
	//page require replacement
	if(flag2==0){
		flag3=0;
		//setting priority to all frame member to -1
		for(int j=0;j<fn;j++){
			p[j]=-1;
			for(int k=i+1;k<pn;k++){
			if(frame[j]==page[k]){
				p[j]==k;
			}
		}
		}
		for(int j=i+1;j<pn;j++)
		{
			cout<<page[j]<<"\n";
		}
		for(int j=0;j<fn;j++)
		{
			cout<<p[j]<<"\n";
		}
		//if page will not occur in future
		for(int j=0;j<fn;j++){
			   if(p[j]==-1){
			   	pos=j;
				   flag3=1;
				   break;
			   }
		}
		
		//if page will cocur in future
		if(flag3==0){
			max = p[0];
			pos=0;
			for(int j=0;j<fn;j++){
				if(p[j]>max){
					max=p[j];pos=j;
				}
			}
		}
		cout<<"max"<<max;
			//assigning
			frame[pos]=page[i];pf++;
				}
				for(int j=0;j<fn;j++){
					cout<<frame[j];
				}
				cout<<"\n";
}
return 0;
}

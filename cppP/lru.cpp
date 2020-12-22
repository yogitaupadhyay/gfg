#include<iostream>
using namespace std;
int main(){
	int pn,fn,pf,pos,min;int p[5];
	int frame[5];int page[20];
	int i,flag1,flag2,flag3;
	cout<<"enter the no of pages";cin>>pn;
	cout<<"enter the no of frames";cin>>fn;
	cout<<"enter the pages";
	for(int i=0;i<pn;i++){
		cin>>page[i];
	}
	for(int j=0;j<fn;j++){
		frame[j]=-1;
	}
	///main algo
	for(int i=0;i<pn;i++){
		flag1=flag2=0;
		for(int j=0;j<fn;j++){
		if(frame[j]==page[i]){
		
			flag1=flag2=1;
			break;
		}
		
		}
		//page replacement is not required
		if(flag1==0){
			for(int j=0;j<fn;j++){
			if(frame[j]==-1){
				frame[j]=page[i];
				pf++;
				 flag2=1;break;
			}
			
			}
			
		}
		///page replacement is required
		if(flag2==0){
			//priority
			flag3=0;
				for(int j=0;j<fn;j++){
				p[j]=-1;
				
				}
					for(int j=0;j<fn;j++){
						
						for(int k=0;k<i;k++){
							if(frame[j]==page[k]){
								p[j]=k;
							}
						}
					}
					//positioning
					for(int j=0;j<fn;j++){
					if(p[j]==-1){
						pos=j;flag3=1;break;
					}
					
					}
					//max pri
				if(flag3==0){
				
					min=p[0];
					pos=0;
					for(int j=0;j<fn;j++){
						if(p[j]<min){
							min=p[j];pos=j;
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
	cout<<"no of page faults is="<<pf;
	return 0;
	
}

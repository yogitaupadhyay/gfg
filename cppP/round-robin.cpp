#include<iostream>
using namespace std;
class process{
	int bt; int al;
	public:
		void input(){
			cout<<"enter the burst time";cin>>bt;
				}
				void setalz(){
					al=0;
				}
				void setalt(int i){
					al=al+i;
				}
		int rbt()
		{
		return bt;
		}
};
int main(){
	process p[10];int n,t; int s;
	cout<<"enter the no of process";cin>>n;
	cout<<"enter the time quantum";cin>>t;
	for(int i=0;i<n;i++){
		p[i].input();
	}
	int bt1[10];
	for(int i=0;i<n;i++){
bt1[i]=p[i].rbt()	;
	}
	for(int i=0;i<n;i++){
		s=s+p[i].rbt();
	}
	while(s>0){
		for(int i=0;i<n;i++){
			if(t<=bt1[i]){
				p[i].setalt(t);
				cout<<"process p"<<i<<"="<<t;s=s-t;bt1[i]=bt1[i]-t;
			}
		else if(t>bt1[i]){
				p[i].setalt(bt1[i]);s=s-bt1[i];
				cout<<"process p"<<i<<"="<<bt1[i];
				bt1[i]=0;
			}
		}
		
	}
	return 0;
}
	

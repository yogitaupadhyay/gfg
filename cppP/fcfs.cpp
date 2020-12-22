#include<iostream>
using namespace std;
class process{
	
	int bt;
	public:
		void input(){
			cout<<"enter turn at,bt:";
			cin>>bt;
		};
		
		int rbt(){
			return bt;}
		void output(){
			cout<<bt<<" ";
		}
};
int main()
{
	int i;
	 
	int n;
	cout<<"enter the no of processes";
	cin>>n;
	process p[10];
	for(i=0;i<n;i++){
		p[i].input();
	}
	
	
	
	/*	for(i=0;i<n;i++)
	{
		
		cout<<atime[i]<<"\n";
	}
	*/
	/*	for(int i=0;i<n;i++){
			p[i].output();
			cout<<"\n";}*/
		
		int wt[10];wt[0]=0;int r=0;
		cout<<"wt of p0=0";
		for(int i=1;i<n;i++){
				for( int j=0;j<i;j++){
					r=r+p[j].rbt();
				
				}
			wt[i]=r;
				r=0;
				cout<<"wt of p"<<i<<wt[i]<<"\n";
				}
		
		
}

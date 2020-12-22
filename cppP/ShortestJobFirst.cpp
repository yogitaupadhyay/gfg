#include<iostream>
using namespace std;
class process{
	int at;
	int bt;
	int al;
	int rt;
	public:
		void input(){
			cout<<"enter turn at, bt:";
			cin>>at>>bt;
		};
		void setar(){
				al=0;
				rt=bt;
			}
		void setal(int t){
			al=al+t;
			rt=rt-al;
		}
		int rbt(){
			return bt;}
			
				int rat(){
			return at;}
			int ral(){
			return al;}
			
		void output(){
			cout<<al<<" "<<rt<<"\n";
		}
};
int main()
{
	int i; int s;
	 
	int n;
	cout<<"enter the no of processes";
	cin>>n;
	process p[10];
	for(i=0;i<n;i++){
		p[i].input();
	}
	int btime[10],atime[10];
	for(s=0;s<n;s++){
		btime[s]=p[s].rbt();
		
	}
		for(s=0;s<n;s++){
		atime[s]=p[s].rat();
		
	}
	for(int i=0;i<n-1;i++){
				for( int j=n-1;j>i;j--){
					if(btime[j]<btime[j-1]){
					
					int m;
					m=btime[j];
					btime[j]=btime[j-1];
					btime[j-1]=m;
					}
				}
				}
					for(int i=0;i<n-1;i++){
				for( int j=n-1;j>i;j--){
					if(atime[j]<atime[j-1]){
					
					int m;
					m=atime[j];
					atime[j]=atime[j-1];
					atime[j-1]=m;
					}
				}
				}
	
		for(int i=0;i<n;i++)
	{
		
		cout<<btime[i]<<"\n";
	}
	cout<<"at";
		for(int i=0;i<n;i++)
	{
		
		cout<<atime[i]<<"\n";
	}
		for(int i=0;i<n-1;i++){
				for( int j=0;j<n;j++){
				if(atime[i]==p[j].rbt())
				{
					process temp;
					temp=p[i];p[i]=p[j];p[j]=temp;
				}
				}
				}
								
	for(int i=0;i<n-1;i++){
		p[i].setar();}
				
	for(int i=0;i<n;i++){
	if(p[i].ral()<p[i].rbt()){
		int g=atime[i+1]-atime[i];
		p[i].setal(g);
	}
	}
	for(int i=0;i<n;i++){
	p[i].output();
	}
/*	for(int i=0;i<n-1;i++){
				for( int j=0;j<n;j++){
				if(btime[i]==p[j].rbt())
				{
					process temp;
					temp=p[i];p[i]=p[j];p[j]=temp;
				}
				}
				}
					int wt[10];wt[0]=0;int r=0;
		cout<<"wt of p0=0"<<"\n";
		for(int i=1;i<n;i++){
				for( int j=0;j<i;j++){
					r=r+p[j].rbt();
				
				}
			wt[i]=r;
				r=0;
				cout<<"wt of p"<<i<<"="<<wt[i]<<"\n";
}*/
return 0;
}

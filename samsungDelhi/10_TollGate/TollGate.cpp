#include<iostream>
using namespace std;
int h[20],c[20];

void func(int n,int i,int b3,int b2,int b1,int cost,int &min)
{
	int s=b3+b2+b1;

	if(i==n-1)
	{
		if(s<h[i])
			cost+=c[i];
		if(cost<min)
			min=cost;
		return;
	}
	func(n,i+1,b3,b2,b1,cost+c[i],min);
	func(n,i+1,b3+h[i],b2,b1,cost+(2*c[i]),min);
	if(s>=h[i])
	{
		if(h[i]>b2+b1)
		{
			b3=s-h[i];
			b2=b1=0;
		}	
		else if(h[i]>b1)
		{
			b2=(b1+b2)-h[i];
			b1=0;
		}	
		func(n,i+1,0,b3,b2,cost,min);
	}	
}

int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		int n;
		cin>>n;
		int cost=0,b3=0,b2=0,b1=0;
		int min=10000;
		for(int i=0;i<n;i++)
		{
			cin>>h[i];
			cin>>c[i];
		}
		func(n,0,b3,b2,b1,cost,min);
		cout<<min<<endl;	
	}
	return 0;
}
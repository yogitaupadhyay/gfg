
#include<iostream>
using namespace std;
int mat[100][20];
int n,m;

void toggle(int col)
{
	for(int i=0;i<n;i++)
	{
		if(mat[i][col]==1)
			mat[i][col]=0;
		else
			mat[i][col]=1;
	}
}

void func(int col,int k,int &ans)
{
	if(k%2==0)
	{
		int i,j,count=0;
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				if(mat[i][j]!=1)
					break;
			}
			if(j==m)
				count++;
		}
		if(count>ans)
		    ans=count;
	}
	if(col==m||k==0)
		return;
	toggle(col);
	func(col+1,k-1,ans);
	toggle(col);
	func(col+1,k,ans);
}

int main()
{
	int t;
	cin>>t;
	while(t--)
	{
	    int k;
	    int ans=0;
		cin>>n>>m>>k;
		for(int i=0;i<n;i++)
			for(int j=0;j<m;j++)
				cin>>mat[i][j];
		func(0,k,ans);
		cout<<ans<<endl;	
	}
	return 0;
}

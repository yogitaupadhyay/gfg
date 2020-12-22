#include<iostream>
using namespace std;

int mat[100][100];
bool vis[100][100];

void func(int r,int c,int mat[][100],bool vis[][100],int i,int j,int u,int &res)
{
	if(mat[i][j]==3)
	{
		if(u<res)
			res=u;
			return;
	}
	if(i>=r||j>=c||i<0||j<0)
		return;	
	if(i>0)
	{
	    if(mat[i-1][j]==1 && !vis[i-1][j])
	    {
	        vis[i-1][j]=1;
	        func(r,c,mat,vis,i-1,j,u,res);
	        vis[i-1][j]=0;
	    }
	    else
	    {
	        int ka=0;
			ka=i-1;
	        while(mat[ka][j]==0 && ka>=0)
	            ka--;
	        if(!vis[ka][j]==1)
	        {
	            vis[ka][j]=1;
	            func(r,c,mat,vis,ka,j,max(u,i-ka),res);
	            vis[ka][j]=0;
	        }
	    }
	}
	if(i<r-1)
	    {
	        if(mat[i+1][j]>0 && !vis[i+1][j])
	        {
	            vis[i+1][j]=1;
	            func(r,c,mat,vis,i+1,j,u,res);
	            vis[i+1][j]=0;
	        }
	        else
	        {
	            int k=i+1;
	            while(mat[k][j]==0 && k<=r)
	                k++;
	            if(!vis[k][j]==1)
	            {
	                vis[k][j]=1;    
	                func(r,c,mat,vis,k,j,u,res);   
	                vis[k][j]=0;
	            }
	        }
	    }	    
	if(j<c-1 && mat[i][j+1]>0 && !vis[i][j+1])
	{
	    vis[i][j+1]=1;
		func(r,c,mat,vis,i,j+1,u,res);
		vis[i][j+1]=0;
	}	
	if(j>0 && mat[i][j-1]>0 && !vis[i][j-1])
	{
	    vis[i][j-1]=1;
		func(r,c,mat,vis,i,j-1,u,res);
		vis[i][j-1]=0;
	}	
}
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		int r,c,u=1,res=1000;
		cin>>r>>c;
		for(int i=0;i<r;i++)
			for(int j=0;j<c;j++)
				cin>>mat[i][j];
		
		for(int i=0;i<r;i++)
			for(int j=0;j<c;j++)
			    vis[i][j]=0;
			    
		vis[r-1][0]=1;
		
		func(r,c,mat,vis,r-1,0,u,res);
		cout<<res<<endl;
	}
}
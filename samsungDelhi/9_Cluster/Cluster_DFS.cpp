#include<iostream>
using namespace std;

int grid[22][22];
bool vis[22][22];
int n;
int adj[6]={0};

void clear()
{
    for(int i=0;i<=5;i++)
       adj[i]=0;
       
       
    for(int i=0;i<22;i++)
    for(int j=0;j<22;j++)
    vis[i][j]=false;
}

int find_max()
{
    int ans=0;
    int in=0;
    for(int i=1;i<=5;i++)
    {
       
        if(adj[i]>=ans)
        {
            in=i;
            ans=adj[i];
        }    
    }
    
    return in;
}

void fill(int i,int j,int f,int val)
{
    if(i<0 || j<0 || i>=n || j>=n || grid[i][j]!=val)
        return ;
    
    grid[i][j]=f;
    
    fill(i+1,j,f,val);
    fill(i-1,j,f,val);
    fill(i,j-1,f,val);
    fill(i,j+1,f,val);

}

void dfs(int i,int j,int prev)
{
     if(i<0 || j<0 || i>=n || j>=n || grid[i][j]<0 || vis[i][j]==true)
        return ;
    
    if(prev!=0 && grid[i][j]!=prev)
        return ;
    
    
    vis[i][j]=true;
    int s=grid[i][j];
    adj[s]++;
    
    prev=grid[i][j];
    
    
    int f=prev;
    
    dfs(i+1,j,f);
    dfs(i-1,j,f);
    dfs(i,j-1,f);
    dfs(i,j+1,f);
    
}

int main()
{
    int t;
    cin>>t;
    
    while(t--)
    {
      cin>>n;
      
      	for(int i=0;i<n;i++)
        	for(int j=0;j<n;j++)
            	cin>>grid[i][j];
        
    	clear();
            
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<n;j++)
            {
                if(grid[i][j]==0)
                {
                   
                    clear();
                    dfs(i,j,0);
                    int f=find_max();
                    fill(i,j,-f,0);
                }
            }
     
      }
        
        
        
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
        	grid[i][j]=abs(grid[i][j]);    
        }   
    } 
    
    
    int count=0;    
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            
            if(grid[i][j]>0)
            {
                count++;
                fill(i,j,-20,grid[i][j]);
            }    
        }
    }
    
    cout<<count<<endl;
}

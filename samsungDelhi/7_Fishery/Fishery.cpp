#include<iostream>
using namespace std;
#define X 3
#define Y 2
#define MIN(a,b) (a<b)?a:b

int left(int start,int size,int vis[])
{
    int i=start;
    while(vis[i]!=0)
    {
        i--;
        if(i==-1)
            break;
    }
    return i;
}

int right(int start,int size,int vis[])
{
    int i=start;
    while(vis[i]!=0)
    {
        i++;
        if(i==size)
            break;
    }
    return i;
}

int calc(int start,int tot_men,int size,int vis[],int &p,int &ind1,int &ind2,int i)
{
    int dist=0;
    while(tot_men>0)
    {
        int x = left(start,size,vis);
        int y = right(start,size,vis);
        if(tot_men==1 && abs(x-start)==abs(y-start) && y!=size && x!=-1)
        {
            ind1=x;
            ind2=y;
            dist+=abs(x-start)+1;
            p=dist;
            return 2;
        }
        else
        {
            if(abs(x-start)>abs(y-start) && y!=size && x!=-1)
            {
                vis[y]=i;
                dist+=abs(y-start)+1;
            }
            else if(abs(x-start)<abs(y-start) && y!=size && x!=-1)
            {
                vis[x]=i;
                dist+=abs(x-start)+1;
            }
            else if(x==-1)
            {
                vis[y]=i;
                dist+=abs(y-start)+1;
            }
            else
            {
                vis[x]=i;
                dist+=abs(x-start)+1;
            }
        }
        tot_men--;
    }
    p=dist;
    return 1;
}
void clear(int vis[],int n,int k)
{
    for(int i=0;i<n;i++)
    {
        if(vis[i]==k)
            vis[i]=0;
    }
}
void func(int g[X][Y],int n,int vis_prem[],int vis[],int sum,int count,int &mini)
{
    if(sum>mini)
        return;
    if(count==3)
    {
        mini=MIN(mini,sum);
        return;
    }
    for(int i=0;i<3;i++)
    {
        if(vis_prem[i]==0)
        {
            vis_prem[i]=1;
            int index1=-1,index2=-1,z=0;
            int x=calc(g[i][0],g[i][1],n,vis,z,index1,index2,i+1);
            if(x==2)
            {
                vis[index1]=i+1;
				func(g,n,vis_prem,vis,sum+z,count+1,mini);
				vis[index1]=0;
				vis[index2]=i+1;
				func(g,n,vis_prem,vis,sum+z,count+1,mini);
				vis[index2]=0;
            }
			else
				func(g,n,vis_prem,vis,sum+z,count+1,mini);
			clear(vis,n,i+1);
			vis_prem[i]=0;
        }
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
        int g[X][Y];
        int vis_prem[3];
        for(int i=0;i<3;i++)
        {
            cin>>g[i][0];
            g[i][0] -= 1;
            cin>>g[i][1];
            vis_prem[i]=0;
        }
        int vis[n]={0};
        int mini=99999999;
        func(g,n,vis_prem,vis,0,0,mini);
        cout<<mini<<endl;
    }
}

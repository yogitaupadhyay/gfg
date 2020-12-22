#include<bits/stdc++.h>
using namespace std;
struct point{
    int x,y;
    point(int x1,int y1){
        x=x1;
        y=y1;
    }
};
bool issafe(int i,int j,int m,int n)
{
    if(i<0 || j<0 || i>=m || j>=n)
        return false;
    return true;
}
int findcluster(int arr[10][10],int m,int n)
{
    int ans=0;
    bool visited[10][10]={{0}};
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
            if(!visited[i][j])
            {
                queue<point>q;
                point p(i,j);
                q.push(p);
                while(!q.empty())
                {
                    point pp=q.front();
                    q.pop();
                    visited[pp.x][pp.y]=true;
                    if(issafe(pp.x + 1,pp.y,m,n) && !visited[pp.x + 1][pp.y] && arr[pp.x + 1][pp.y]==arr[pp.x][pp.y])
                    {
                        point p1(pp.x + 1,pp.y);
                        q.push(p1);
                    }
                    if(issafe(pp.x,pp.y + 1,m,n) && !visited[pp.x][pp.y + 1] && arr[pp.x][pp.y + 1]==arr[pp.x][pp.y])
                    {
                        point p1(pp.x,pp.y + 1);
                        q.push(p1);
                    }
                    if(issafe(pp.x - 1,pp.y,m,n) && !visited[pp.x - 1][pp.y] && arr[pp.x - 1][pp.y]==arr[pp.x][pp.y])
                    {
                        point p1(pp.x - 1,pp.y);
                        q.push(p1);
                    }
                    if(issafe(pp.x ,pp.y - 1,m,n) && !visited[pp.x][pp.y - 1] && arr[pp.x][pp.y - 1]==arr[pp.x][pp.y])
                    {
                        point p1(pp.x,pp.y - 1);
                        q.push(p1);
                    }
                }
                ans++;
            }
        }
    }
    return ans;
}
void fillzeroclusters(vector<point> v,int arr[10][10],int b[10][10],int m,int n)
{
    bool visited[10][10]={{0}};
    int n1=v.size();
    int a[6]={0};
    for(int i=0;i<n1;i++)
    {
        queue<point>q;
        q.push(v[i]);
        point pp=q.front();
        q.pop();
        visited[pp.x][pp.y]=true;
        if(issafe(pp.x + 1,pp.y,m,n) && !visited[pp.x + 1][pp.y] && arr[pp.x + 1][pp.y]!=0)
        {
            point p1(pp.x + 1,pp.y);
            q.push(p1);
        }
        if(issafe(pp.x,pp.y + 1,m,n) && !visited[pp.x][pp.y + 1] && arr[pp.x][pp.y + 1]!=0)
        {
            point p1(pp.x,pp.y + 1);
            q.push(p1);
        }
        if(issafe(pp.x - 1,pp.y,m,n) && !visited[pp.x - 1][pp.y] && arr[pp.x - 1][pp.y]!=0)
        {
            point p1(pp.x - 1,pp.y);
            q.push(p1);
        }
        if(issafe(pp.x ,pp.y - 1,m,n) && !visited[pp.x][pp.y - 1] && arr[pp.x][pp.y - 1]!=0)
        {
            point p1(pp.x,pp.y - 1);
            q.push(p1);
        }
        while(!q.empty())
        {
            point pp=q.front();
            q.pop();
            visited[pp.x][pp.y]=true;
            a[arr[pp.x][pp.y]]++;
            if(issafe(pp.x + 1,pp.y,m,n) && !visited[pp.x + 1][pp.y] && arr[pp.x + 1][pp.y]==arr[pp.x][pp.y])
            {
                point p1(pp.x + 1,pp.y);
                q.push(p1);
            }
            if(issafe(pp.x,pp.y + 1,m,n) && !visited[pp.x][pp.y + 1] && arr[pp.x][pp.y + 1]==arr[pp.x][pp.y])
            {
                point p1(pp.x,pp.y + 1);
                q.push(p1);
            }
            if(issafe(pp.x - 1,pp.y,m,n) && !visited[pp.x - 1][pp.y] && arr[pp.x - 1][pp.y]==arr[pp.x][pp.y])
            {
                point p1(pp.x - 1,pp.y);
                q.push(p1);
            }
            if(issafe(pp.x ,pp.y - 1,m,n) && !visited[pp.x][pp.y - 1] && arr[pp.x][pp.y - 1]==arr[pp.x][pp.y])
            {
                point p1(pp.x,pp.y - 1);
                q.push(p1);
            }
        }
    }
        int mx=1;
        for(int i=2;i<6;i++)
        {
            if(a[i]>=a[mx])
                mx=i;
        }
        for(int i=0;i<n1;i++)
        {
            b[v[i].x][v[i].y]=mx;
        }
}
void findzeroclusters(int i,int j,int arr[10][10],int b[10][10],int m,int n)
{
    vector<point>v;
    bool visited[10][10]={{0}};
    point p(i,j);
    queue<point>q;
    q.push(p);
    while(!q.empty())
    {
        point pp=q.front();
        q.pop();
        v.push_back(pp);
        visited[pp.x][pp.y]=true;
        if(issafe(pp.x + 1,pp.y,m,n) && !visited[pp.x + 1][pp.y] && arr[pp.x + 1][pp.y]==0)
        {
            point p1(pp.x + 1,pp.y);
            q.push(p1);
        }
        if(issafe(pp.x,pp.y + 1,m,n) && !visited[pp.x][pp.y + 1] && arr[pp.x][pp.y + 1]==0)
        {
            point p1(pp.x,pp.y + 1);
            q.push(p1);
        }
        if(issafe(pp.x - 1,pp.y,m,n) && !visited[pp.x - 1][pp.y] && arr[pp.x - 1][pp.y]==0)
        {
            point p1(pp.x - 1,pp.y);
            q.push(p1);
        }
        if(issafe(pp.x ,pp.y - 1,m,n) && !visited[pp.x][pp.y - 1] && arr[pp.x][pp.y - 1]==0)
        {
            point p1(pp.x,pp.y - 1);
            q.push(p1);
        }
    }
    fillzeroclusters(v,arr,b,m,n);
}
int main()
{
    int m,n;
    cin>>m>>n;
    int a[10][10],b[10][10];
    for(int i=0;i<m;i++)
        for(int j=0;j<n;j++)
            {
                cin>>a[i][j];
                b[i][j]=a[i][j];
            }
    for(int i=0;i<m;i++)
        for(int j=0;j<n;j++)
            if(b[i][j]==0)
            {
                findzeroclusters(i,j,a,b,m,n);
            }
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
            cout<<b[i][j]<<" ";
        cout<<endl;
    }
    cout<<findcluster(b,m,n)<<endl;
}
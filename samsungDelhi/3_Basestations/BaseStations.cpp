#include<iostream>
using namespace std;

int arr[15][15];
bool visited[15][15];
int n,m;

bool issafe(int i,int j){
    if(i<0 || j<0 || i>=m || j>=n){
        return false;
    }
    return true;
}

void func(int i, int j, int sum, int &ans, int k){
    if(k==0){
        ans=max(ans,sum);
        return;
    }
    if(i<0 || j<0 || i>=m || j>=n){
        return;
    }
    
    visited[i][j]=true;
    
    if(j%2==1){
        if(issafe(i-1,j) && !visited[i-1][j]){
            func(i-1,j,sum+arr[i-1][j],ans,k-1);
        }
            
        if(issafe(i+1,j) && !visited[i+1][j]){
            func(i+1,j,sum+arr[i+1][j],ans,k-1);
        }
            
        if(issafe(i,j+1) && !visited[i][j+1]){
            func(i,j+1,sum+arr[i][j+1],ans,k-1);
        }
            
        if(issafe(i,j-1) && !visited[i][j-1]){
            func(i,j-1,sum+arr[i][j-1],ans,k-1);
        }
            
        if(issafe(i+1,j-1) && !visited[i+1][j-1]){
            func(i+1,j-1,sum+arr[i+1][j-1],ans,k-1);
        }
            
        if(issafe(i+1,j+1) && !visited[i+1][j+1]){
            func(i+1,j+1,sum+arr[i+1][j+1],ans,k-1);
        }
    }
    else{
        if(issafe(i-1,j) && !visited[i-1][j]){
            func(i-1,j,sum+arr[i-1][j],ans,k-1);
        }
        
        if(issafe(i+1,j) && !visited[i+1][j]){
            func(i+1,j,sum+arr[i+1][j],ans,k-1);
        }
        
        if(issafe(i,j+1) && !visited[i][j+1]){
            func(i,j+1,sum+arr[i][j+1],ans,k-1);
        }
        
        if(issafe(i,j-1) && !visited[i][j-1]){
            func(i,j-1,sum+arr[i][j-1],ans,k-1);
        }
        
        if(issafe(i-1,j-1) && !visited[i-1][j-1]){
            func(i-1,j-1,sum+arr[i-1][j-1],ans,k-1);
        }
        
        if(issafe(i-1,j+1) && !visited[i-1][j+1]){
            func(i-1,j+1,sum+arr[i-1][j+1],ans,k-1);
        }
    }
    
    visited[i][j]=false;
}

void solve(){
	cin>>m>>n;
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            cin>>arr[i][j];
            visited[i][j]=false;
        }
    }
    
	int ans=0;
    for(int i=0;i<n;i++)
	{
        for(int j=0;j<n;j++)
		{
            func(i,j,arr[i][j],ans,3);
            int sum1=0,sum2=0,c1=0,c2=0;
            if(j%2==0){
            	if(issafe(i-1,j)){
                    sum1 += arr[i-1][j];
                    c1++;
                }
                if(issafe(i,j+1)){
                    sum1 += arr[i][j+1];
                    c1++;
                }
            	if(issafe(i,j-1)){
                    sum1 += arr[i][j-1];
                    c1++;
                }
            	if(issafe(i+1,j)){
                    sum2 += arr[i+1][j];
                    c2++;
                }
            	if(issafe(i-1,j-1)){
                    sum2 += arr[i-1][j-1];
                    c2++;
                }
            	if(issafe(i-1,j+1)){
                    sum2 += arr[i-1][j+1];
                    c2++;
                }
            }
            else{
            	if(issafe(i+1,j)){
                    sum1 += arr[i+1][j];
                    c1++;
                }
                if(issafe(i,j+1)){
                    sum1 += arr[i][j+1];
                    c1++;
                }
                if(issafe(i,j-1)){
                    sum1 += arr[i][j-1];
                    c1++;
                }
                if(issafe(i-1,j)){
                    sum2 += arr[i-1][j];
                    c2++;
                }
                if(issafe(i+1,j-1)){
                    sum2 += arr[i+1][j-1];
                    c2++;
                }
                if(issafe(i+1,j+1)){
                    sum2 += arr[i+1][j+1];
                    c2++;
                }
            }
            
            if(c1==3){
                ans = max(ans,sum1+arr[i][j]);
            }
            if(c2==3){
                ans = max(ans,sum2+arr[i][j]);
            }
        }
    }
    cout<<ans<<endl;
}

int main()
{
    int t;
    cin>>t;
    while(t--){
        solve();
    }
}

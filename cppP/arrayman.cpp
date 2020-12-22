#include <bits/stdc++.h>

using namespace std;

vector<string> split_string(string);
long max;
// Complete the arrayManipulation function below.
long arrayManipulation(int n, vector<vector<int> > queries) {
vector<long>arr;
    arr.assign(n,0);
   long max=0;
   vector<int>temp;
    for(int i=0;i<queries.size();i++){
    
       for(int j=queries[i][0]-1;j<queries[i][1];j++){
            arr[j]=arr[j]+queries[i][2];
            if(arr[j]>max){
                max=arr[j];
            }
        }
    
 

}
return max;}

int main(){
int n,m;
    cin>>n>>m;
    
   vector< vector<int> >queries;
    
    for(int i=0;i<m;i++){
        vector<int>row;
        for(int j=0;j<3;j++){
            int a;
            cin>>a;
            row.push_back(a);
        }
        queries.push_back(row);
    }
   long res= arrayManipulation( n, queries);
    cout<<res;
return 0;
}


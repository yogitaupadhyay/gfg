#include <bits/stdc++.h>

using namespace std;
vector<int> rotLeft(vector<int>&arr, int d) {
	int n=arr.size();
    vector<int>temp;
      
for(int i=d;i<arr.size();i++){
    temp.push_back(arr[i]);
      
}
for(int i=0;i<d;i++){
    temp.push_back(arr[i]);
     
}
    return temp;
}

int main()
{
    int n,d;
    cin>>n>>d;
    vector<int>arr;
    while(n-->0){
        int a;
        cin>>a;
        arr.push_back(a);
    }
    
    arr=rotLeft(arr,d);
    for(int i=0;i<arr.size();i++){
        cout<<arr[i];
    }
    return 0;
}

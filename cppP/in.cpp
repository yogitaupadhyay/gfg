#include <bits/stdc++.h>

using namespace std;
void insertionSort1(int n, vector<int> arr) {
    int j;
for(int i=n-1;i>=1;i--){
   int  key=arr[i];
    j=i-1;
    while(j>=0 && arr[j]>key){
        arr[j+1]=arr[j];
        j--;
       
        }
     arr[j]=key;
     for(int k=0;k<n;k++){
            cout<<arr[k]<<" ";
}
    }
   

}

int main()
{
   int n;
   cin>>n; 
    vector<int>arr;
    for(int i=0;i<n;i++){
    int a;
        cin>>a;
        arr.push_back(a);
        
    }
    for(int k=0;k<n;k++){
            cout<<arr[k]<<" ";
}

   insertionSort1(n,arr);
}



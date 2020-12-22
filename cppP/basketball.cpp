#include <bits/stdc++.h>

using namespace std;
int main(){
int n;
cin>>n;
int *arr=new int[n];
for(int i=0;i<n;i++){
    cin>>arr[i];
}
int max1,min1,x=0,y=0;
max1=arr[0];
min1=arr[0];
for(int i=1;i<n;i++){
    if(arr[i]>max1){
        x++;
        max1=arr[i];
    }
    if(arr[i]<min1){
        y++;
        min1=arr[i];
    }
}
cout<<x<<" "<<y;
return 0;}

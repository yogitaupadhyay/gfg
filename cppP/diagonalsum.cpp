#include<iostream>
using namespace std;
int main()
{
    int n;int s1=0,s2=0,s;
    cin>>n;
    int ** arr=new int*[n];
    for(int i=0;i<n;i++){
        arr[i]=new int[n];
    }
     for(int i=0;i<n;i++){
         for(int j=0;j<n;j++){
             if(i==j){
                s1=s1+arr[i][j]; 
             }
              }
     }
    cout<<"s1="<<s1;
    int j=n-1;
 for(int i=0;i<n;i++){
    s2=s2+arr[i][j];
     j--;
         }
    cout<<"s2="<<s2;
    s=s1-s2;
    if(s<0){
        s=-s;
    }
    cout<<s;
    return 0;
}


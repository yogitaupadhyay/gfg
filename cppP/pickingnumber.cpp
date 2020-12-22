#include <bits/stdc++.h>

using namespace std;
// Complete the pickingNumbers function below.
int pickingNumbers(vector<int> arr) {
    vector<int>res;
    vector<bool>flag;
     cout<<"hello";
   for(int i=0;i<arr.size();i++){
   	flag.push_back(false);
   }
  
   int max=0;int c;
   for(int i=0;i<arr.size();i++){
   	for(int j=i+1;j<arr.size();j++){
   		cout<<"diff="<<arr[i]<<"  -"<<arr[j]<<"\n";
   		if(flag[i]==false){
   			cout<<"diff="<<arr[i]<<"  -"<<arr[j]<<"\n";
   				c=0;flag[i]=true;
   		if(arr[i]-arr[j]==0||abs(arr[i]-arr[j])==1){
   			c++;flag[j]=true;
		   }
		   }
   	  }
	   if(c>max){
	   	max=c;
	   }
   }
  
    return max;
}

int main()
{
   int n;
    cin>>n;
    vector<int>arr;
    cout<<"heloo";
    while(n-->0){
        int a;
        cin>>a;
        arr.push_back(a);
    }
    cout<<"heloo";
  int res=pickingNumbers(arr);
  cout<<"heloo";
    cout<<res;
}


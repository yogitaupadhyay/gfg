#include <bits/stdc++.h>
#include<map>
#include<algorithm>
#include<iterator>
using namespace std;


// Complete the minimumSwaps function below.
int minimumSwaps(vector<int> arr) {
map<int ,int>mp; 
    vector<int>cycle;
    vector<bool>flag;
    map<int ,int>::iterator it;
    for(int i=0;i<arr.size();i++){
   mp.insert(pair<int ,int>(arr[i],i));
    }
    for(it=mp.begin();it!=mp.end();++it){
    	cout<<it->first<<"--"<<it->second<<"\n";
	}
    
    
	for(int i=0;i<arr.size();i++){
    	flag.push_back(false);
	}
	
	
    int j;int c=0;int i=0;int sum=0;
   for(it=mp.begin();it!=mp.end();++it){
   	if(flag[i]||it->second==i){
   		
   		i++;
		   cout<<"i1="<<i<<"\n";continue;
	   }
   	
	   j=i;
	   int k=0;
	   while(!flag[j]){
	   	flag[j]=true;
	   	j=it->second;
	   	it=it->second;
	   	cout<<"it=second"<<it->second<<"--"<<"j="<<j<<"\n";
	   	k++;
	   	}
	   	sum+=k-1;i++;
	   	cout<<"sum="<<sum<<"\n";
	   	 cout<<"i2="<<i<<"\n";
   }
    
    
	cout<<"sum="<<sum<<"\n";
return sum;
}

int main()
{

    int n;
    cin >> n;
    vector<int>arr;
    while(n-->0){
        int a;cin>>a;
        arr.push_back(a);
        
    }
    int m=minimumSwaps(arr);
}

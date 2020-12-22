#include <bits/stdc++.h>

using namespace std;
int sockMerchant(int n, vector<int> arr) {
    int res=0;int c;
    sort(arr.begin(),arr.end());
    for(int i=0;i<n;i++){
    	cout<<arr[i];
	}
	cout<<"\n";
    for(int i=arr.size()-1;i>=0;i--){
        c=count(arr.begin(),arr.end(),arr[i]);
        for(int j=0;j<c;j++){
        	arr.pop_back();
		}
        cout<<"count="<<c<<"\n";
            while(c>=2){
                c=c-2;
                res++;
                cout<<"res="<<res<<"\n";
            }
            
    }return res;
}

int main()
{
    int n; cin>>n;
    vector<int>arr;
    for(int i=0;i<n;i++){
        int a;
        cin>>a;
        arr.push_back(a);
    }
    int r=sockMerchant(n,arr);
    cout<<r;
    return 0;}

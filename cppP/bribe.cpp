#include <bits/stdc++.h>
#include<vector>
using namespace std;
int main()
{
    int t;
    cin >> t;
    int k;
    vector<vector<int> >arr;
    while(t-->0){
        int n;
        cin>>n;
        vector<int>row;
        for(int i=0;i<n;i++){
            int a;
            cin>>a;
            row.push_back(a);
        }
        arr.push_back(row);
     }
   
    for(int i=0;i<arr.size();i++){
    	int swap=0;
        for(int j=0;j<arr[i].size();j++){
            if((arr[i][j]-j)>3){
            	 k=1;
            	 cout<<"Too chaotic"<<"\n";
             break;
        }
        if((arr[i][j]-j)==2){
            swap++;
            cout<<"swap1="<<swap<<"\n";
             cout<<arr[i][j]<<" "<<j<<"\n";
          
        }
         if((arr[i][j]-j)==3){
            swap+=2;
            cout<<"swap2="<<swap<<"\n";
             cout<<arr[i][j]<<" "<<j<<"\n";
            
        }
        
        }
        if(k!=1){
        cout<<"wap="<<swap<<"\n";	
		}
        
       
    }

return 0;
}



#include <bits/stdc++.h>
#include<vector>
using namespace std;
int main()
{
    int t,n,k;
    cin >> t;
   std::vector<<std::vector<int> >b1; 
    vector<int>res;
    vector<int>row;
   while(t-->0){
       cin>>n>>k;
       for(int i=1;i<=n;i++){
           while(i>0){
               int b=i%2;
                row.push_back(b);
               i=i/2;
               reverse(row.begin(),row.end());
               for(int i=0;i<row.size();i++){
               	cout<<row[i]<<" ";
			   }
           }
           binary.push_back(row);
       }
       for(int i=0;i<n;i++){
           for(int j=i+1;j<n;j++){
               int res=binary[i]&binary[j];
               res.push_back(res);
           }
       }
   }
    
    return 0;
}



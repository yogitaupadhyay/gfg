#include <iostream>
#include<vector>
#include<algorithm>
using namespace std;
int main()
{
    int t,n,k;
    cin >> t;
   
vector<int>res;
    vector<int>fres;
 while(t-->0){
       cin>>n>>k;
       int m=0;
       for(int i=1;i<n;i++){
    for(int j=i+1;j<=n;j++){
               int res1=i&j;
               
            if(res1>m&&res1<k){
            	m=res1;
            
			}
           }
   }
   
    
   
  fres.push_back(m);
  
   res.clear();
}

    for(int i=0;i<fres.size();i++){
        cout<<fres[i]<<"\n";
    }
    return 0;
}



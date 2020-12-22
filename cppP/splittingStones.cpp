#include<bits/stdc++.h>
using namespace std;
int main()
{
   int t;
   cin>>t;
   if(t>100||t<0){
   exit(0);}
   vector<vector<int> >var;

	for(int i=0;i<t;i++){
		vector<int>row;
	     for(int i=0;i<5;i++){
            int a;
            cin>>a;
            row.push_back(a);
       }
	   var.push_back(row);	
	}

for(int i=0;i<t;i++){


int m=var[i][3]-var[i][1];
int n=var[i][4]-var[i][2];
int res=(m+n)-var[i][0];
     if(m<0||n<0){
     cout<<"NO"<<"\n";
     }else if(res==0){
   cout<<"YES"<<"\n";
   
   }else{
   cout<<"NO"<<"\n";


}

}
return 0;
}


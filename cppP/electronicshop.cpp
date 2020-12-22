#include <bits/stdc++.h>

using namespace std;


int getMoneySpent(vector<int> keyboards, vector<int> drives, int b) {
    sort(keyboards.begin(),keyboards.end());
    int min1=b;
     sort(drives.begin(),drives.end());
    if((keyboards[0]+drives[0])>b){
        return (-1);
    }
    
   for(int i=0;i<keyboards.size();i++){
   	
       for(int j=0;j<drives.size();j++){
       
         int k= b-(keyboards[i]+drives[j]);
         
           if(k>=0&&k<=(min1)){
               min1=k;
               
           }
                  }
   }
return (b-min1); 
}

int main()
{
    int money,nk,nm;
    cin>>money>>nk>>nm;
    vector<int>keyboard;
         vector<int>mouse;
    
    while(nk-->0){
        int a;
        cin>>a;
        keyboard.push_back(a);
          }
     while(nm-->0){
        int b;
        cin>>b;
     mouse.push_back(b);
    }
   int res= getMoneySpent(keyboard,mouse,money);
    cout<<res;
}

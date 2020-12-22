#include <bits/stdc++.h>

using namespace std;



int main()
{
   int t;int n;
    cin>>t;
    int *res=new int[t];
    for(int m=0;m<t;m++){
         cin>>n;
        int *arr=new int[n];
         for(int i=0;i<n;i++){
            cin>>arr[i];
         }
         int req;
         int four;
         int two;
        int one;
    
        req=0;
     four=0;
        two=0;
        one=0;
          for(int i=0;i<n;i++){
           int temp=arr[i];
            while((temp/4)>0){
                four++;  temp=temp%4;
                   }
            while((temp/2)>0){
                two++;  temp=temp%2;
            }
            while((temp/1)>0){
                one++;
               }
             }
             cout<<"one="<<one;
             cout<<"four="<<four;
             cout<<"two="<<two;
        if(four%2==0&&two%2==0&&one%2==0){
            res[m]=0;
        }else{
            //four pair
            if(four%2!=0){
                for(int j=0;j<n;j++){
                      if(arr[j]<4){
                          req=req+4;
                          break;
                      }
                     }
    }//two pair
           if(two%2!=0){  
            for(int j=0;j<n;j++){
                if(arr[j]<2||arr[j]%4==0||arr[j]%4==1){
                    req=req+2;
                
                    break;
                }
                
            }
           
           }//one pair
            
            if(one%2!=0){  
            for(int j=0;j<n;j++){
                if(arr[j]%2==0||arr[j]==1){
                	if(arr[j]==1){
                	req=req+3;
					}else{
						req=req+1;
					}
                
                    break;
                }
                
            }
           
           }
            res[m]=req;
        }
       
        
    }
    for(int k=0;k<t;k++){
        cout<<res[k]<<"\n";
    }
}


#include <bits/stdc++.h>

using namespace std;






int main()
{
   int t;int n;
    cin>>t;
    int *res=new int[t];
    for(int m=0;m<t;m++){
        int req=0;
    int four=0;
        int two=0;
        int one=0;
        cin>>n;
        int *arr=new int[n];
        for(int i=0;i<n;i++){
            cin>>arr[i];
            int temp=arr[i];
            if((temp/4)>0){
                four++;  temp=temp%4;
                   }
            if((temp/2)>0){
                two++;  temp=temp%2;
            }
            if((temp/1)>0){
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
                          arr[j]=arr[j]+4;
                          break;
                      }
                     }
    }//two pair
           if(two%2!=0){  
            for(int j=0;j<n;j++){
                if(arr[j]<2||arr[j]%4==0||arr[j]%4==1){
                    req=req+2;break;
                }
                
            }
           
           }//one pair
            
            if(one%2!=0){  
            while(one%2!=0){
            for(int j=0;j<n;j++){
                if(arr[j]%2==0){
                    req=req+1;
                    arr[j]=arr[j]
                    break;
                }	
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


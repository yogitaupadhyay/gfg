#include <bits/stdc++.h>

using namespace std;
int main()
{
int t=0,t1=0;
    int x1,x2,v1,v2;
    if(x2>x1&&v2>v1){
    	cout<<"hello";
          cout<<"NO";exit(0);
         }
         if(x1>x2&&v1>v2){
         	cout<<"NO";
		 exit(0);
		 }
    if(x1>x2){
    	int l1=(x1+v1*t);
    int	l2=(x2+v2*t);
        while(l1>=l2){
        	
            if(l1-l2>x1-x2){
                cout<<"NO";exit(0);
            }
            if(x1+v1*t==x2+v2*t){
                cout<<"YES";
                exit(0);
            }
            t++;
            l1=(x1+v1*t);
    l2=(x2+v2*t);
     }
       if(x1+v1*t<=x2+v2*t) {cout<<"NO";exit(0);}
        
    }
   if(x2>x1){
   	int l1=(x1+v1*t1);
    int	l2=(x2+v2*t1);
         while(l2>=l1){
             if(l2-l1>(x2-x1)){
                 cout<<"NO";exit(0);
             }
             if(l1==l2){
                cout<<"YES";
                exit(0);
            }
            t1++;
            l1=(x1+v1*t1);
    l2=(x2+v2*t1);
         }
        if(x1+v1*t>=x2+v2*t) {cout<<"NO";exit(0);}
    }
    
    return 0;}

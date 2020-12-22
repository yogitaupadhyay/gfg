#include <bits/stdc++.h>

using namespace std;

// Complete the solve function below.

int main()
{
int year;
    cin >> year;
    if(1700<=year&&year<=1917){
    if(year%400==0||(year%4==0&&year%100!=0)){
       cout<<"12.09."<<year;
        }else{
		cout<<"13.09."<<year;
    }
}
    if(year==1918){
    	cout<<"27.09."<<year;
}
if(1919<=year&&year<=2700){
    if(year%4==0){
    	cout<<"12.09."<<year;
    }
    else{
    cout<<"13.09."<<year;
}
}
  return 0;
}


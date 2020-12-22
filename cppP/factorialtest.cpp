#include<iostream>
using namespace std;
 int factorial( int n)
{if(n==0){
	return 1;
}
if(n==1){
	return 0;
}
return( factorial(n-1) + 2*factorial(n-2) + 2);
	

}
int main(){
	int n;
	cin>>n;
int m=factorial(n);
cout<<m<<"\n";
	return 0;
}

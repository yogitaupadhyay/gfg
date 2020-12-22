#include<iostream>
#include<vector>
#include<algorithm>
#include<iterator>           //for iterators
#include<numeric>              //for accumulation
using namespace std;
int main(){
	
	
	int arr[]={5,10,15,20,25,30,35,40,45,50,3,6,9};
	int n=sizeof(arr)/sizeof(arr[0]);
	vector <int> vect(arr, arr+n);  //can use vector<int>vect;vect.assign(arr,arr+n);
	
//1.iterator-begin and end	
	       vector<int>::iterator ptr;         //declaring iterator
	       for(ptr=vect.begin();ptr<vect.end();ptr++){
	       	cout<<"*ptr="<<*ptr<<"\n";
		   }
		   return 0;
	}

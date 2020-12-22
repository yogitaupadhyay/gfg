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
	vector<int>::iterator ptr=vect.begin();
		       vector<int>::iterator ftr=vect.begin();
		       auto it=next(ptr,3);
		        auto it1=prev(ftr,3);
		        cout<<"position of new iterator using next()";
		        cout<<*it<<" ";
		        cout<<"position of new iterator using prev()";
		        cout<<*it1<<" ";
		        return 0;
		    }

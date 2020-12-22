#include<iostream>
#include<vector>
#include<algorithm>
#include<iterator>           //for iterators
#include<numeric>              //for accumulation
using namespace std;
int main(){
		int arr[]={5,10,15,20,25,30,30,30,35,40,45,50,3,6,9};
	int n=sizeof(arr)/sizeof(arr[0]);
	vector <int> vect(arr, arr+n);  //can use vector<int>vect;vect.assign(arr,arr+n);
	


//1.sorting	       
	sort(vect.begin(),vect.end());  
	cout<<"sorted vector";
	for(int i=0;i<n;i++){
		cout<<vect[i]<<" ";
	}
//2.reverse	
	cout<<"\n"<<"reversed vector=";
	reverse(vect.begin(),vect.end());
	for(int i=0;i<n;i++){
		cout<<vect[i]<<" ";
	}
//2(a).reverse	
	cout<<"\n"<<"reversed vector=";
	reverse(vect.begin(),vect.end());
	for(int i=0;i<n;i++){
		cout<<vect[i]<<" ";
	}
//3.max element
cout<<"\n"<<"max element=";
	cout<<*max_element(vect.begin(),vect.end());
	
//4.min element
cout<<"\n"<<"min element=";
	cout<<*min_element(vect.begin(),vect.end());
//5.count
	cout<<"\n"<<"count no of 35=";
cout<<count(vect.begin(),vect.end(),35)<<"  ";
//6.summation
cout<<"\n"<<"sum=";
cout<<accumulate(vect.begin(),vect.end(),0);
//7.find
find(vect.begin(),vect.end(),20)!=vect.end()?cout<<"\n"<<"element  found":cout<<"\n"<<"element not found";
find(vect.begin(),vect.end(),29)!=vect.end()?cout<<"\n"<<"element  found":cout<<"\n"<<"element not found";
//manipulating algorithm
//8.arr.erasing
vect.erase(vect.begin()+1);
cout<<"\n"<<"erased array = ";
for(int i=0;i<vect.size();i++){
		cout<<vect[i]<<" ";
	}
//9.arr.duplicate removal
vect.erase(unique(vect.begin(),vect.end()),vect.end());
cout<<"\n"<<"vector after duplicate removal = ";
for(int i=0;i<vect.size();i++){
		cout<<vect[i]<<" ";
	}
//10.next permutation
	next_permutation(vect.begin(),vect.end());
	cout<<"\n"<<"vector next permutation=";
	for(int i=0;i<vect.size();i++){
		cout<<vect[i]<<" ";
	}
//11.next permutation
	prev_permutation(vect.begin(),vect.end());
	cout<<"\n"<<"vector prev permutation=";
	for(int i=0;i<vect.size();i++){
		cout<<vect[i]<<" ";
	}
//12.distance between two element
	cout<<"\n"<<"distance=";
	cout<<distance(vect.begin(),max_element(vect.begin(),vect.end()));
	return 0;
}

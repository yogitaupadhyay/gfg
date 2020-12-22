#include<iostream>
#include<string.h>
using namespace std;
class ReverseString{
	int size;
	int *arr;
	int top;
	public:
		//------------------setinitial value---------///
		ReverseString(int n){
		size=n;
		top=-1;
		arr=new int[size];
	}
		//---------------------push-------------------//
		
	void push(char x){
			if(top<size){
				top++;
				arr[top]=x;
			
			}
			else{
				cout<<"stackoverflow";
				exit(0);
			}
		}
		
		//--------------------------pop-----------------//
		
		char pop(){
			if(top>=0){
			
			char x=arr[top];
		
			top--;
			return x;
		}
		else{
			cout<<"stack underflow";
			exit(0);
		}
		}
};
int main(){
	char q[20];ReverseString s(20);char y;
	
	cout<<"enter the string";cin>>q;
	for(int i=0;i<strlen(q);i++){
		s.push(q[i]);
	}
	for(int i=0;i<strlen(q);i++){
	y=s.pop();
	cout<<y;
	}
}

#include<iostream>
#include<string.h>
using namespace std;
class balancepara{
	int size;
	int *arr;
	int top;
	public:
		//------------------setinitial value---------///
	balancepara(int n){
		size=n;
		top=-1;
		arr=new int[size];
	}
		//---------------------push-------------------//
		
	void push(char x){
			if(top<size){
				top++;
				arr[top]=x;
				cout<<x<<"is pushed";
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
			cout<<x<<"is poped";
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

	balancepara b(20);int n;char q[10][10];int m=0,k=0;char y;
	cout<<"enter the no test ques";
	cin>>n;
	cout<<"enter the questions";
	for(int i=0;i<n;i++){
		cin >>q[i];
	}
	///-------------main program-----------------//
	for(int i=0;i<n;i++){
		for(int j=0;j<strlen(q[i]);j++)
		{
			if(q[i][j]=='[' ||q[i][j]== '{'|| q[i][j]=='(')
			{
				b.push(q[i][j]);k++;	cout<<"hello i, j=="<<i<<j<<"\n";cout<<q[i][j]<<"\n";
			}
		
		else if(q[i][j]==']')
			{
				
			y=b.pop();	
		cout<<q[i][j];
			if(y!='['){
			
				cout<<"parenthesis is not balanced"<<"\n";
				exit(0);
					}else if(y=='['){
						m++;
					}
			}
			else if(q[i][j]=='}')
			{
				
			y=b.pop();	
		cout<<q[i][j];
			if(y!='{'){
			
				cout<<"parenthesis is not balanced"<<"\n";
				exit(0);
					}else if(y=='{'){
						m++;
					}
			}
			else if(q[i][j]==')')
			{
				
			y=b.pop();	
		cout<<q[i][j];
			if(y!='('){
			
				cout<<"parenthesis is not balanced"<<"\n";
				exit(0);
					}else if(y=='('){
						m++;
					}
			}
					}
					if(m==k){
					
		cout<<"parenthesis is balanced"<<"\n";}
	}
	return 0;
}

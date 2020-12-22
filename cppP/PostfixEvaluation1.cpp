#include<iostream>
#include<string.h>
using namespace std; 

class PostEvaluation{
	int *arr;
	int top;
	int size;
	public:
		//-----constructor----// 
		PostEvaluation(int n){
		size=n;
		top=-1;
		arr=new int[size];
	}
	 char returntop(){
	 	return arr[top];
	 }
	//-------push----------//
		void push(int x){
			if(top<size){
				top++;
				arr[top]=x;
				
			}
			else{
				cout<<"stackoverflow";
				exit(0);
			}
		}
		
		//------pop-------//
		
		int pop(){
			if(top>=0){
			
			int x=arr[top];
			
			top--;
			return x;
		}
		else{
			cout<<"stack underflow";
			exit(0);
		}
		}
};
int main()
{        int q[10];int n,m;char op[10];int y,z,res,s;PostEvaluation pe(10);
cout<<"enter the no of operand";cin>>n;
		cout<<"enter the postfix expression(operand only)";
for(int j=0;j<n;j++){
		cin>>q[j];
			pe.push(q[j]);
}
cout<<"enter the no of operator";cin>>m;
	cout<<"now enter the operator";
	for(int k=0;k<m;k++){
		cin>>op[k];
			y=pe.pop();
			z=pe.pop();
		switch(op[k]){
				case '+':res=z+y;break;
				case '-':res=z-y;break;
				case '*':res=z*y;break;
				case '/':res=z/y;break;
		}
			pe.push(res);
}
	
	s=pe.returntop();
cout<<"result="<<s;
	return 0;


}

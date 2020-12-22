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
		void push(char x){
			if(top<size){
				top++;
				arr[top]=x;
				cout<<x<<"is pushed"<<"\n";
			}
			else{
				cout<<"stackoverflow";
				exit(0);
			}
		}
		
		//------pop-------//
		
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
	char q[20];PostEvaluation pe(20);int i=0;char z,y,res, m;int n;
	
	cout<<"enter the postfix expression \n WARNING:IF EXPRESSION IS NOT POSTFIX PROGRAM WILL TERMINATE";

		cin>>q;
	


//--first symbol is operator-------//
	if(q[0]=='*'||q[0]=='+'||q[0]=='-'||q[0]=='/'){
		cout<<"expression is not postfix";exit(0);
	}
	for(int i=0;i<strlen(q);i++){
		cout<<q[i]<<"\n";
		if(q[i] != '+'&&q[i]!='-'&&q[i]!='*'&&q[i]!='/'){
			pe.push(q[i]);
		}
		else if(q[i]=='+'||q[i]=='-'||q[i]=='*'||q[i]=='/'){
			y=pe.pop();
			z=pe.pop();
			switch(q[i]){
				case '+':res=z+y;break;
				case '-':res=z-y;break;
				case '*':res=z*y;break;
				case '/':res=z/y;break;
			}
		
			pe.push(res);
		}
	}
	m=pe.returntop();
cout<<"result="<<m;
	return 0;
}

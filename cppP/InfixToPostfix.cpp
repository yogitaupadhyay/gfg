#include<iostream>
#include<string.h>
using namespace std;
enum p {
 -=0,
+=1,
*=2,
/=3};
class stack{
	int size;
	int *arr;
	int top;
	public:
		stack(int n){
			size=n;
			arr=new int [n];
			top=-1;
		}
		//-----return top----//
		char returntop(){
			return arr[top];
		}
		//-----push-----//
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
		//------pop-----//
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
	stack s(20);char q[20];char res[20];char y;
	cout<<"enter the expression";cin>>q;
	//--pushing leftmost symbol----//
	
	s.push('{');
	
	/*---if there is only one operator--*/
	
	if(strlen(q)==1){
		cout<<"postfix expression="<<q;
	}
	
	///--------------------main function--------//
	
	for(int i=0;i<strlen(q)+1;i++){
		//if operand encountered-------//
		if(47<q[i]&&q[i]<58){
			res[i]=q[i];
		}
		///----------------if operator encountered----------//
	else if(q[i]=='+'||q[i]=='-'||q[i]=='*'||q[i]=='/'){
			if( s.returntop!='{' && s.returntop()!='('){
				wlile(s.returntop()>q[i]){
					y=s.pop();
					res[i]=y;
				}
				s.push(q[i]);
				
			}
			
		}
		//-------( encountered====//
	else if(q[i]=='('){
			s.push(q[i]);
		}
		//===========) encountered========//
	else if(q[i]==')'){
		while(s.returntop()!='('){
			y=s.pop();
			res[i]=y;
		}
		s.pop();
	}
	//==============} is encountered========//
	else if(q[i]=='}')
	{
		while(s.returntop!='{'){
		y=	s.pop();
		res[i]=y;
		}
	}
		}
		return 0;
	}
	
	


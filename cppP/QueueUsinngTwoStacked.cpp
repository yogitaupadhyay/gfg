#include<iostream>
using namespace std;
 void enqueue(char x);
 char dequeue();
class stack{
	int size;
	int *arr;
	int top;
	public:
	int returntop(){
		return top;
	}
			//-------construcor--//
	stack(){
		size=20;
		top=-1;
		arr=new int[20];
	}
		//-------push---------//
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
		
		//-----pop-----//
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
	char x,y,p,m;
		int n,k=1;
		stack s0,s1;
 	//--while case--//
	while(k==1){
		cout<<"1.enqueue \n 2.dequeue ";cin>>n;
   switch(n){
	case 1:
	cout<<"enter the element to ennqueue = ";
	cin>>x;
 s0.push(x);
	break;
	case 2:
		if(s0.returntop()==-1&&s1.returntop()==-1){
			cout<<"error";exit(0);
		}
		if(s1.returntop()==-1){
			while(s0.returntop()!=-1){
			p=s0.pop();
			s1.push(p);
			}
				}
		y=s1.pop();
			cout<<"dequeue element = "<< y <<"\n";
	break;
	}
	
	cout<<"press 1 to continue";
cin>>k;
}
	return 0;
}

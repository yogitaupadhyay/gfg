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
		char q[20],x,y,p,m;
		int n,k=1;
		stack s0,s1;
 	cout<<"enter the string";
	cin>q;
	//--while case--//
	while(k==1){
		cout<<"1.enqueue \n 2.dequeue";cin>>n;
   switch(n){
	case 1:
	cout<<"enter the element to ennqueue";
	cin>>x;
		while(s0.returntop()!=-1){
 		m=s0.pop();
		 s1.push(m);
		 }
		 s0.push(x);
		 while(s1.returntop()!=-1){
		 p=s1.pop();
		 s0.push(p);
		 }
		 break;
case 2:
	if(s0.returntop()==-1){
			cout<<"error";exit(0);
		}
		 y=s0.pop();
		 cout<<"dequeue element="<<y<<"\n";
		 break;
}
cout<<"press 1 to continue";
cin>>k;
	}

return 0;
}

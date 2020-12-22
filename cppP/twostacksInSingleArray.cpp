#include<iostream>
using namespace std;
class twostack{
	int *arr;
	int top1,top2;
	int size;
	public:
		twostack(int n){
			size=n;
			arr=new int[n];
			top1=-1;
			top2=size;
			
		}
		void push1(int x){
			if(top1<top2-1){
				top1++;
				
				arr[top1]=x;
				
			}
			else{
				cout<<"stack overflow";
				exit(0);
			}
		}
			void push2(int x){
			if(top1<top2-1){
				top2--;
			
				arr[top2]=x;
				
			}
			else{
				cout<<"stack overflow";
				exit(0);
			}
		}
	int	pop1(){
		if(top1>=0){
			int x=arr[top1];
			top1--;
		
		return x;
	}else{
		cout<<"stack overflow";
		exit(0);
	}
	}
	int pop2(){
			if(top2<size){
			int x=arr[top2];
			top2++;
			
			return x;
		
	}else{
		cout<<"stack overflow";
		exit(0);
	}
	}
};
int main(){
	twostack p(5);
	
	
	p.push1(3);
	p.push2(4);
		p.push1(8);
		p.push1(5);
	p.push2(6);
int y=	p.pop1();
cout<<"y="<<y<<"\n";
int z=	p.pop2();
cout<<"z="<<z;
	return 0;
}

#include<iostream>
using namespace std;
class queue {
	int size;
	int * arr;
	int front, rear;
	public:
		queue(int n){
			size=n;
			arr=new int[n];
			front=-1;
			rear=-1;
		}
		void enqueue(int x){
			if(front==size){
				cout<<"queue is full";exit(0);
			}
			if(rear==-1&&front==-1){
			rear=0;
			front++;
				arr[front]=x;
			}
			else{
				front++;
				arr[front]=x;
			}
		
		}
		int dequeue(){
			int  y;
			if(front==-1&&rear==-1){
				cout<<"no element to dequeue";exit(0);
				
			}
			if(front==rear){
				y=arr[rear];
				rear=front=-1;
				return y;
			}
			else {
				y=arr[rear];
				rear++;
				return y;
			}
			
			}
			
		
	};
int main(){
	queue q(6);
	int k;int m=1,x,y;
	
	
	while(m==1){
	cout<<"1.enqueue \n 2.dequeue";cin>>k;
	switch(k){
		case 1:
			cout<<"enter the element to push  = "  ;cin>>x;
			q.enqueue(x);
			break;
		case 2:
			y=q.dequeue();
			cout<<"dequeue item = "<<y<<"\n";
			break;
		
	}
	cout<<"enter 1 to continue";cin>>m;
	}
		
}

#include<iostream>
using namespace std;

class nodes{
	public:
	char info;
char left;
	char right;
};
class stack{
	int size;
	int *arr;
	int top;
	public:
		//------------------setinitial value---------///
	stack(int n){
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
	int n,j,k;stack s(25);
	int root;int ptr;
	struct nodes n1[25];char y;
	cout<<"enter the no of nodes";cin>>n;
cout<<"enter the info, left,and right nodes";
	for(int i=0;i<n;i++){
		cout<<i<<"th obj"<<"\n";
		 cin>>n1[i].info>>n1[i].left>>n1[i].right;
		
	}
	for(int i=0;i<n;i++){
		cout<<n1[i].info<<"#"<<n1[i].left<<"#"<<n1[i].right<<"\n";
		}
		root=0;
		s.push('$');
			ptr=root;		
		while(y!='$'){
			cout<<n1[ptr].info;
			if(n1[ptr].right!='\0'){
				s.push(n1[ptr].right);
			}
			if(n1[ptr].left!='\0'){
					for(j=0;j<n;j++){
					if(n1[j].info==n1[ptr].left){
						break;
					}
				}
			
				ptr=j;
			}
		else{
		y=s.pop();
			for(k=0;k<n;k++){
					if(n1[k].info==y){
						break;
					}
				}
		ptr=k;
		
		}	
		}
	return 0;
}
 

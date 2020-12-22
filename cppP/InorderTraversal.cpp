include<iostream>
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
n1[0].info='#';
n1[0].left='#';
n1[0].right='#';
	for(int i=1;i<=n;i++){
		cout<<i<<"th obj"<<"\n";
		 cin>>n1[i].info>>n1[i].left>>n1[i].right;
		
	}
	for(int i=0;i<n;i++){
		cout<<n1[i].info<<"#"<<n1[i].left<<"#"<<n1[i].right<<"\n";
		}
		root=1;
		s.push('$');
			ptr=root;
			while(y!='$'){
				while(ptr!=0){
					s.push(n1[ptr].info);
					for(int j=0;j<=n;j++){
						if(n1[ptr].left==n1[i].info){
							breakl;
						}
					}
					ptr=i;
				}
			}
			y=s.pop();
			for(int j=0;j<=n;j++){
						if(y==n1[i].info){
							breakl;
						}
					}
			
			ptr=i;
			if(n1[ptr].right!=0)
			return 0;		
		}

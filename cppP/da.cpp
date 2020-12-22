#include<iostream>
#include<string.h>
using namespace std;
class sequence{
	int ** arr;
	int d1,d2;
	int* top;
	public:
		sequence(int x ){
			top=new int[x];
			d1=x;
			d2=x;
			for(int i=0;i<x;i++){
				top[i]=-1;
			}
			arr=new int*[d1];                 //creates an array pointer
			for(int i=0;i<d1;i++){
				arr[i]=new int[d2];                //create space for each row
			}
			for(int i=0;i<d1;i++){
				for(int j=0;j<d2;j++){
					arr[i][j]=0;
				}
		
		}
	}
	
	
		
		void input(int i,int x){
			top[i]++;
				arr[i][top[i]]=x;
		}
		int output(int i,int j){
			
			int item=arr[i][j];
			
			return item;
		}
};

class queue{
	int **arr;
	int d1,d2;
	public:
		queue(int x){
			d1=x;d2=3;
				arr=new int*[d1];              //creates an array pointer
			for(int i=0;i<d1;i++){
				arr[i]=new int[d2];           //create space for each row
			}
		}
		void input(){
			for(int i=0;i<d1;i++){
				for(int j=0;j<d2;j++){
					
						cin>>arr[i][j];
						
				}
			
			}
		for(int i=0;i<d1;i++){
				for(int j=1;j<d2;j++){
					
					if(arr[i][j]>1000000000||arr[i][j]<0){exit(0);}
						
				}
			
			}
		
		}
		int returnf1(int i){
			return arr[i][0];
		}
			int returnf2(int i){
			return arr[i][1];
		}
			int returnf3(int i){
			return arr[i][2];
		}
};
int main(){
	int n,q,index,p;
	int lastAnswer=0,seq;
		char m;
		cin>>n>>q;
    if(1>n||n>100000){exit(0);}
    if(1>q||n>100000){exit(0);}
		sequence s(n);
		queue t(q);

	t.input();
	for(int i=0;i<q;i++){
		//first query
			if(t.returnf1(i)==1){
					seq=(t.returnf2(i)^lastAnswer)%n;
				s.input(seq,t.returnf3(i));
					}
					//second query
		else if(t.returnf1(i)==2){
		seq=(t.returnf2(i)^lastAnswer)%n;
            int l=0;int c;c=seq;
            while(c){
            	c=c/10;
            	l++;
			}
		    index= t.returnf3(i)%l;
		    p=s.output(seq,index);
		    lastAnswer=p;
		     cout<<lastAnswer<<"\n";
		
		}
	}

	return 0;
}

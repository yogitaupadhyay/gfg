#include<iostream>
#include<vector>
#include<list>
using namespace std;
class edge; 
class node{
	public:
	int data;int status;	node *next;	edge *adj;	
	};
class edge{
	public:
	int data;	edge *link;
	};

int main(){
	int node_no;int *en;node *head;
	cout<<"no of nodes =";  cin>>node_no;
	node *n=new node[node_no]; 
		head=&n[0];
	edge **e=new edge*[node_no];
	en=new int[node_no];
	for(int i=0;i<node_no;i++){
		cout<< i+1 <<"node = ";
		cin>>n[i].data;
		if(i!=0){
			n[i-1].next=&n[i];
		}
		cout<<"no of adjacent node of "<< i+1 <<" node = ";
		cin>>en[i];
		 e[i]=new edge[en[i]];
		cout<<"edges = ";
		for(int j=0;j<en[i];j++){
			cin>>e[i][j].data;
			n[i].adj=&e[i][0];
			if(j!=0){
				e[i][j-1].link=&e[i][j];
			}
		}

	}
	//traversal;
	list<int>queue;
	int y,m,k,t;
	for(int i=0;i<node_no;i++){	n[i].status=1;	}
queue.push_back(n[0].data);
n[0].status=1;
	while(!queue.empty()){
	y=queue.front();
		cout<<"y="<<y<<" ";
		queue.pop_front();
		for(m=0;m<node_no;m++){
			if(n[m].data==y){
				n[m].status=3;
				break;
			}
		}
		for(k=0;k<en[m];k++){
			for(t=0;t<node_no;t++){
				if(e[m][k].data==n[t].data){
					break;
				}
			}
				if(n[t].status==1){
					queue.push_back(e[m][k].data);
					n[t].status=2;
					
				}
			
		}
	}
		return 0;	
}

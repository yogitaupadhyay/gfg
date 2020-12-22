#include<iostream>
using namespace std;
class edge; 
class node{
	public:
	int data;
	node *next;
	edge *adj;
	
};
class edge{
	public:
	int data;
	edge *link;
};
int main(){
	int node_no;int *en;node *head;
	cout<<"no of nodes =";cin>>node_no;
	node *n=new node[node_no];
	en=new int[node_no];
	head=&n[0];
	edge **e=new edge*[node_no];
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
		for(int i=0;i<node_no;i++){
	 cout<<n[i].data<<" -->";
	 for(int j=0;j<en[i];j++){
	 	cout<<e[i][j].data;
	 }
		cout<<"\n";
		}
	return 0;
}

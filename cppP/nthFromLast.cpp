#include<iostream>
using namespace std;

class Node{
	public:
	int data;
	Node *next;
};
void printnode(Node *head){
	while(head!=NULL){
	
		cout<<head->data;
		cout<<"\n";
		head=head->next;
	}
	
	
}
Node * insertFront(Node * head,int data){
	Node * newNODE=new Node();
	newNODE->data=data;
	newNODE->next=head;
	head=newNODE;
	return head;
}

void insertGiven(Node * prev,int data){
	Node * newNODE=new Node();
	newNODE->data=data;
	newNODE->next=prev->next;
	prev->next=newNODE;
	
}
Node * insertLast(Node * head,int data){
	Node * newNODE=new Node();
	newNODE->data=data;
	newNODE->next=NULL;
	Node * temp=head;
	while(temp->next!=NULL){
		temp=temp->next;
	}
	temp->next=newNODE;
	return head;
}

 void searchnode(Node *head,int n){
 	Node *mainp=head;
 	int count=0;
 	while(head!=NULL){
 	 		if(count>=n){
 			mainp=mainp->next;
 			}	
 				count++;
			head=head->next;
	 }
		 cout<<"data="<<mainp->data;
 	 }
	 
 int main(){
	Node *head;
	Node *first;
	Node *second;
	Node *third;
	first=new Node();
	second=new Node();
	third =new Node();

	head=first;
	first->data=1;
	first->next=second;
	
	second->data=2;
	second->next =third;
	
	third->data=3;
	third->next=NULL;
	
	
	head=insertFront(head,6);
		insertGiven(second,8);
		head=	insertLast(head,8);
		printnode(head);
	searchnode(head,2);
return 0;
}


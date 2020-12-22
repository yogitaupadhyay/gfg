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

 Node * deleteList(Node * head){
	Node *temp=head;
	while(temp!=NULL){
	Node *	next1=temp->next;
		delete temp;
		temp=next1;
	}
	return temp;
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
	
	printnode(head);
	printf("\n");
	head=insertFront(head,6);
	printnode(head);
	cout<<head;
	cout<<"\n";
		printf("\n");
		insertGiven(second,8);
		printnode(head);
			printf("\n");
	head=	insertLast(head,8);
		printnode(head);
	head=	deleteList(head);
	cout<<"after deleting list";
		printnode(head);
	return 0;
}

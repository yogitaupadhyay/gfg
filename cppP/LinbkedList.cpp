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
Node * deleteNode(Node * head,int ref_data){
	Node *temp=head;
	Node * prev=head;
	if(head->data==ref_data){
			Node *temp1=head;
		head=temp1->next;
		delete temp1;
		return head;
	}
	while(temp->data!=ref_data&&temp!=NULL){
		prev=temp;
		cout<<temp->data;
		cout<<"\n";
		temp=temp->next;
	}
	if(temp->data==ref_data){
		prev->next=temp->next;
	delete temp;
	}
	return head;
}

Node * deleteNodep(Node * head,int pos){
	Node *temp=head;
	Node * prev=head;
	if(pos==0){
		Node *temp1=head;
		head=temp1->next;
		delete temp1;
		return head;
		
	}
	for(int i=0;i<=pos;i++){
		prev=temp;
		temp=temp->next;
	}
	
		prev->next=temp->next;
	delete temp;
	
	return head;
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
		printf("\n");
		insertGiven(second,8);
		printnode(head);
			printf("\n");
	head=	insertLast(head,8);
		printnode(head);
		
			printf("\n");
			head=deleteNode(head,6);
			printnode(head);
			
				printf("\n");
			head=deleteNodep(head,0);
			printnode(head);
	return 0;
}

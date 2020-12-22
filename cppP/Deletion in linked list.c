#include<stdio.h>
#include<conio.h>
struct node{

	int data;
	struct node *next;
};

void push(struct node **headref,int newdata){
	struct node* newnode=(struct node*)malloc(size of (struct node));
	newnode->data=newdata;
	newnode->next=(*headref);                      //storing null to pointer variable of each node-as right now we don't know the address of next node 
	*headref=newnode;                        //storing address of created node at pointer variable of previous node
	}
	
	void delete node(struct node *headref,int key){
		struct node*temp=*headref,*prev;
		(temp!=null&&temp->data==key){
		*ref=temp->next;
		free(temp);
		return;
		}
	} 
	
	void main(){
		
	struct node * head=(struct node *)'\0';
	push(&head,7);
		push(&head,1);
		push(&head,2);
			push(&head,3);
			puts("created linked list");
	printlist(head);
	deletenode(&head,2);
	puts("\n  linkedlist after deletion ");
	printlist(head);
	getch();
	
}

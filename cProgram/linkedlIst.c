#include<stdio.h>
struct Node{
	int data;
	struct  Node* next;
};
void printnode(struct Node * head){
	while(head!=NULL){
		printf("%d",head->data);
		head=head->next;
	}
}
int main(){
struct Node*head=NULL;
struct Node*third=NULL;
struct Node*second=NULL;
head=(struct Node*)malloc(sizeof(struct Node));
third=(struct Node*)malloc(sizeof(struct Node));
second=(struct Node*)malloc(sizeof(struct Node));

(*head).data=1;
	head->next=second;
	
	
	second->data=2;
	second->next=third;
	
	third->data=3;
	third->next=NULL;
	printnode(head);
return 0;	
}

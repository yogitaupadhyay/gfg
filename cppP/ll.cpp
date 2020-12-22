#include<bits/stdc++.h>
using namespace std;
class linkedlist{
	public:
		int data;
		linkedlist*next;
		linkedlist(int data1){
			data=data1;
			next=NULL;
		}
};
class solution{
	public:
		linkedlist * insert(linkedlist*head,int data){
						linkedlist*node=new linkedlist(data);
							if(head==NULL){
				return node;
			}else{
				linkedlist* temp=head;
				while(temp->next!=NULL){
					temp=temp->next;
				}
				temp->next=node;
			}
			return head;
		}
		

		void print(linkedlist * head){
			linkedlist *temp=head;
			while(temp!=NULL){
				cout<<temp->data<<" ";
				temp=temp->next;
			}
		}
/*	void printreverse(linkedlist * head){
		//	linkedlist *temp=head;
		if(head==NULL){
			return;
		}
			printreverse(head->next);
			cout<<head->data<<" ";
			
		}*/
	linkedlist *reverse(linkedlist *head){
		linkedlist *prev=NULL;
		linkedlist *cur=head;
		linkedlist* n=NULL;
		while(cur!=NULL){
			n=cur->next;
			cur->next=prev;
			prev=cur;
			cur=n;
			
		}
		head=prev;
		return head;
		
		}
};
int main(){
	linkedlist*head=NULL;
	solution s;
	int t;
	cin>>t;

	int data;
	while(t-->0){
		cin>>data;
		head=s.insert(head,data);
	}

	s.print(head);
head=s.reverse(head);
cout<<"\nreverse";
	s.print(head);
	
	return 0;
}

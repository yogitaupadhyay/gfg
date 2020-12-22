#include <iostream>
#include <cstddef>
using namespace std;	
class Node
{
    public:
        int data;
        Node *next;
        Node(int d){
            data=d;
            next=NULL;
        }
};
class Solution{
    public:
	Node* insert(Node *head,int data)
      {  
          //Complete this method
          
          Node *s=new Node(data);
          if(head==NULL){
          	head=s;
		  }
		  else{
		  	Node *temp=head;
		  	while(temp->next!=NULL){
		  		temp=temp->next;
			  }
			  temp->next=s;
		  }
         return head;
	 }
      void display(Node *head)
      {
          Node *start=head;
          while(start)
          {
              cout<<start->data<<" ";
              start=start->next;
          }
      }
};
int main()
{
	Node* head=NULL;
  	Solution mylist;
    int T,data;
    cin>>T;
    while(T-->0){
        cin>>data;
        head=mylist.insert(head,data);
    }	
	mylist.display(head);
		
}

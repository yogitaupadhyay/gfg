 import java.util.*;
 class Node{
	int data;
	Node next;
 Node(int data){
	 this.data=data;
	 next=null;
 }
}
class Solution{
	Node addedge(Node head,int data){
		Node newnode=new Node(data);
		if(head==null){
		return newnode;
		}
		newnode.next=head;
		head=newnode;
		return head;
		 
	 }
	 void printnode(Node head){
		 Node temp=head;
		 while(temp!=null){
			 System.out.print(temp.data+" " );
			 temp=temp.next;
		 }
		 System.out.println("+++++++++++++++++++++++++");
	 }
	 void deletion(Node head,Node addre){
		 Node temp=head;
		 Node  save=head;
		 while(temp!=null&&temp!=addre){
			 save=temp;
			 temp=temp.next;
		 }
		 if(addre==temp){
			 save.next=temp.next;
		 }
		 
		 
	 }
	  Node duplicateRemove(Node head){
		Node temp=head;
		while(temp.next!=null){
			if(temp.data==temp.next.data){
				deletion(head,temp.next);
			}else{
				temp=temp.next;
			}
		}
		return head;
     }
}
public class SortedRemoval{
	public static void main(String args[]){
	  Node head=null;
	  Solution s=new Solution();
	  head=s.addedge(head,23);
	  head=s.addedge(head,23);
	  head=s.addedge(head,24);
	  head=s.addedge(head,24);
	  head=s.addedge(head,24);
	  head=s.addedge(head,25);
	  head=s.addedge(head,26);
	  s.printnode(head);
	  head=s.duplicateRemove(head);
	  s.printnode(head);
	  
	}
}
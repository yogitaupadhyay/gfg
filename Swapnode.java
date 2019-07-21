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
	  
	 Node swapNode(Node head,int data1,int data2 ){
		  Node temp=head;
		  Node save=head;
		  Node addr1=null;
		  Node preaddr1=null;
		  Node addr2=null;
		  Node preaddr2=null;
		 while(temp!=null){
			 if(temp.data==data1){
				 preaddr1=save;
				 addr1=temp;
			 }else if(temp.data==data2){
				 preaddr2=save;
				addr2=temp; 
			 }
			 save=temp;
			 temp=temp.next;
		 }
		 if(temp==null&&(addr1==null||addr2==null)){
			 return head;
		 }
		 Node t=null;
		 if(addr1==head){
			 head=addr2;
		 }else if(addr2==head){
			 head=addr1;
		 }
		 preaddr1.next=addr2;
		 t=addr2.next;
		 addr2.next=addr1.next;
		 preaddr2.next=addr1;
		 addr1.next=t;
		 return head;
	 }
}
public class Swapnode{
	public static void main(String args[]){
	  Node head=null;
	  Solution s=new Solution();
	  head=s.addedge(head,23);
	 
	  head=s.addedge(head,24);
	 
	 
	  head=s.addedge(head,25);
	  head=s.addedge(head,26);
	  s.printnode(head);
	  s.swapNode(head,26 ,25);
	  s.printnode(head);
	  
	}
}
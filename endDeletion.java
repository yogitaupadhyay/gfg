class Node{
int data;
Node next;
Node(int data){
	this.data=data;
	next=null;
}
}
public class endDeletion{
	Node head=null;
	public Node addNode(Node head,int data){
		Node newnode=new Node(data);
		newnode.next=head;
		head=newnode;
		return head;
	}
	public void print(Node head){
		if(head==null){return;}
		Node current=head;
		while(current.next!=null){
			System.out.print(current.data+"->");
			current=current.next;
		}
		System.out.print(current.data);
		
	}
	public Node delete(Node head){
		Node temp=head;Node save=head;
		while(temp.next!=null){
			save=temp;
			temp=temp.next;
		}
		save.next=null;
		return head;
	}
	public static void main(String args[]){
		endDeletion s=new endDeletion();
		Node head=null;
		head=s.addNode(head,1);
		head=s.addNode(head,2);
		head=s.addNode(head,3);
		head=s.addNode(head,4);
		head=s.addNode(head,5);
		head=s.addNode(head,6);
		s.print(head);
		head=s.delete(head);
		System.out.println();
		s.print(head);
	}
}
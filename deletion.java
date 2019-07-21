class Node{
int data;
Node next;
Node(int data){
	this.data=data;
	next=null;
}
}
public class deletion{
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
	public Node delete(Node head,int d){
		Node temp=head;
		Node save=head;
		
		while(temp.data!=d){
			save=temp;
			temp=temp.next;
		}
		save.next=temp.next;
		
		return head;
	}
	public static void main(String args[]){
		deletion s=new deletion
		();
		Node head=null;
		head=s.addNode(head,1);
		head=s.addNode(head,2);
		head=s.addNode(head,3);
		head=s.addNode(head,4);
		head=s.addNode(head,5);
		head=s.addNode(head,6);
		s.print(head);
		s.delete(head,3);
		System.out.println();
		s.print(head);
	}
}
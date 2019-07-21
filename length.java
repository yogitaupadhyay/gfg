class Node{
int data;
Node next;
Node(int data){
	this.data=data;
	next=null;
}
}
public class length{
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
	public int countloop(Node n){
		Node temp=n;
		int count=1;
		while(temp.next!=n){
			count++;
			temp=temp.next;
		}
		count++;
		return count;
	}
	public int  loopdetect(Node head){
		Node temp=head;
		Node slow_p=head;
		Node fast_p=head;
		
		while(slow_p!=null&&fast_p!=null&&fast_p.next!=null){
			slow_p=slow_p.next;
			fast_p=fast_p.next.next;
			if(slow_p==fast_p){
				System.out.println(slow_p.data);
				return countloop(slow_p);
			
		}	
	}
	return 0;
	}
	public static void main(String args[]){
		length s=new length();
		Node head=null;
		head=s.addNode(head,1);
		head=s.addNode(head,2);
		head=s.addNode(head,3);
		head=s.addNode(head,4);
		head=s.addNode(head,5);
		head=s.addNode(head,6);
		s.print(head);
		head.next.next.next.next.next=head;
		System.out.println("length"+s.loopdetect(head));	
	}
}
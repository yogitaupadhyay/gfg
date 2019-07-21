public class LinkedList{
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
		
	}
	static Node insert(Node head,int data){
			if (head==null){
				return new Node(data);
			}
			Node temp=head;
			while(temp.next!=null){
				temp=temp.next;
				//System.out.println("data="+temp.data);
			}
			temp.next=new Node(data);
		
			return head;
		}
		
		static void print(Node head){
			Node temp=head;
			while(temp!=null){
				System.out.println(temp.data);
				temp=temp.next;
			}
			
		}
		static Node delete(Node head,int count){
			int c=0;
			Node temp=head;
			Node seTemp=head;
			Node prev=head;
			while(temp!=null){
				temp=temp.next;
			if(c>=count){
				prev=seTemp;
				seTemp=seTemp.next;
				
			}
			c++;
			
			}
			
			prev.next=seTemp.next;
			seTemp=null;
			return head;
		}
		
	public static void main(String args[]){
		
		Node head=null;
		
		System.out.println("enter no of nodes");
		java.util.Scanner scan=new java.util.Scanner(System.in);
		int n=scan.nextInt();
		for(int i=0;i<n;i++){
			int a=scan.nextInt();
			head=insert(head,a);
		}
		print(head);
		System.out.println("delete node form end eneter count");
		int c=scan.nextInt();
		head=delete(head,c);
		print(head);
		
	}
}
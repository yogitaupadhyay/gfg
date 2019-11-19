package ama.com;

import java.util.Scanner;

public class LinkedList {
	static class Node{
		int data;
		Node next;
		public Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	static Node insert(Node root,int data){
		Node head=root;
		if(root==null){
			return new Node(data);
		}
		while(root.next!=null){
			root=root.next;
		}
		root.next=new Node(data);
		return head;
	}
	static void print(Node root){
		while(root!=null){
			System.out.print(root.data+" ");
			root=root.next;
		}
		System.out.println();
	}

	
	static Node removeDuplicates(Node root)
    {
	// Your code here	
	Node prev=root;
	Node curr=root;
	
	while(curr!=null){
	    if(curr.data==prev.data){
	        prev.next=curr.next;
	        curr=curr.next;
	    }else{
	         prev=curr;
	    curr=curr.next;
	    }
	    
	   
	}
	return root;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter n");
		int n=scan.nextInt();
		Node root=null;
		
		for(int i=0;i<n;i++){
			root=insert(root, scan.nextInt());
		}
		 print(root);
		
		root=removeDuplicates(root);
		
		print(root);

	}

}

package sis.com;

import java.util.Scanner;


public class Successor {

	static class Node{
		int data;
		Node left;
		Node right;
		Node parent;
		Node(int data){
			this.data=data;
			left=right=null;
		}
	}
	public static Node insert(Node root,int data){
		Node y=root;	
		Node parent=null;
		while(y!=null){
			parent=y;
			if(data<y.data){
				y=y.left;
			}else{
				y=y.right;
			}
		}
		if(parent==null){
			root=new Node(data);
			root.parent=parent;
					
		}else if(data<parent.data){
			parent.left=new Node(data);
			parent.left.parent=parent;
		}else{
			parent.right=new Node(data);
			parent.right.parent=parent;
		}
		return root;
	}
	static void inorder(Node root){
		if(root!=null){
		inorder(root.left);
		System.out.println(root.data);
		inorder(root.right);
		}
	}
	static Node search(Node root,int data){
		if(root==null){
			return root;
		}
		if(root.data==data){
			return root;
		}
		if(data<root.data){
			return search(root.left, data);
		}else{
			return search(root.right,data);
		}
	}
	static int min(Node root){
		Node temp=root;
		while(temp.left!=null){
			temp=temp.left;
		}
		return temp.data;
	}

	static int max(Node root){
		Node temp=root;
		while(temp.right!=null){
			temp=temp.right;
		}
		return temp.data;
	}
	static int successor(Node root,int data){
		Node node=search(root, data);
		Node y=null;
		if(node.right!=null){
			return min(node.right);
		}else{
			y=node.parent;
			while(y!=null&&node==y.right){
				node=y;
				y=y.parent;
			}
		}if(y!=null){
			return y.data;
		}else{
			return -1;
		}
		
	}
		public static void main(String[] args) {
		    System.out.println("enter the no of element");
		    Scanner scan=new Scanner(System.in);
		    int n=scan.nextInt();
		    Node root=null;
		    for(int i=0;i<n;i++){
		    	int data=scan.nextInt();
		    	root=insert(root, data);
		    System.out.println(successor(root, data));
		    }
		   
		}



}

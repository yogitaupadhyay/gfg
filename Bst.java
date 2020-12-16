package sis.com;

import java.util.Scanner;

public class Bst {
static class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data=data;
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
	}else if(data<parent.data){
		parent.left=new Node(data);
	}else{
		parent.right=new Node(data);
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
/*static int successor(Node root,int data){
	Node node=search(root, data);
	if(node.right!=null){
		return min(node.right,data);
	}else{
		y=p
	}
}*/
	public static void main(String[] args) {
	    System.out.println("enter the no of element");
	    Scanner scan=new Scanner(System.in);
	    int n=scan.nextInt();
	    Node root=null;
	    for(int i=0;i<n;i++){
	    	int data=scan.nextInt();
	    	root=insert(root, data);
	    }
	    inorder(root);
	    System.out.println(search(root, 89));
	    System.out.println(min(root));
	    System.out.println(max(root));
	}

}

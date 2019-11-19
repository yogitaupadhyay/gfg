package nit.com;

import java.util.Scanner;


public class CreateSumTree {
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
		System.out.print(root.data +" ");
		inorder(root.right);
		}
	}
	
	static public  int sumTree1(Node root){
	if(root==null){
		return 0;
	}
	int temp=root.data;
int left=sumTree1(root.left);
	int  right=sumTree1(root.right);
	root.data=left+right;
		return root.data+temp;
	}
	
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
		   System.out.println("----------------------");
		  sumTree1(root);
		  inorder(root);
		}

}

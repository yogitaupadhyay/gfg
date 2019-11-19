package sis.nit;

import java.util.Scanner;
public class Mirror {
	// TODO Auto-generated method stub
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
		static Node mirror (Node root){
				if(root==null){
					return root;
				}
				Node left=mirror(root.left);
				Node right=mirror(root.right);
				root.left=right;
				root.right=left;
				return root;
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("enter the no of element");
		    Scanner scan=new Scanner(System.in);
		    int n=scan.nextInt();
		    Node root=null;
		    
		    for(int i=0;i<n;i++){
		    	int data=scan.nextInt();
		    	root=insert(root, data);
		    	
		    
		    }
		  
		}
}

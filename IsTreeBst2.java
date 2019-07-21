import java.util.*;

public class IsTreeBst2{
	static class Tree{
		int data;
		Tree left;
		Tree right;
		Tree(int data){
			this.data=data;
		}
		
	
	}
		static Tree makeRoot(Tree root,int data){
			if(root==null){
				return new Tree(data);
			}
			return root;
			
		}
		static Tree search(Tree root,int data){
			if(root==null){
			return null;
			}
				if(root.data==data){
			       
				   return root;
				}
				 Tree l=search(root.left,data);
				Tree r=search(root.right,data);
				
			
			if(r!=null){
				return r;
			}else{
				return l;
			}
			
		}
		static Tree insert(Tree root,int parent,int child ,char LoR){
			Tree p=search( root, parent);
			System.out.println("p="+p);
			if(LoR=='L'){
				p.left=new Tree(child);
			}else{
				p.right=new Tree(child);
			}
			return root;
			
		}
		
		static void print(Tree root){
			if(root==null){return ;}
			print(root.left);
			System.out.println(root.data);
			print(root.right);
		}
		
		
			static ArrayList<Integer>inorder(Tree root,ArrayList<Integer>arr){
			if(root==null){return arr;}
			arr=inorder(root.left,arr);
			arr.add(root.data);
			arr=inorder(root.right,arr);
			return arr;
		}
		static boolean isBst(Tree root){
			ArrayList<Integer>arr=new ArrayList<Integer>();
			arr=inorder(root,arr);
			ArrayList<Integer>arr1=new ArrayList<Integer>(arr);
			Collections.sort(arr);
			if(arr.equals(arr1)==true){
				return true;
			}
			return false;
		}
	public static void main(String args[]){
		
		java.util.Scanner scan=new java.util.Scanner(System.in);
		System.out.println("enter no of test case");
		int t=scan.nextInt();
		for(int i=0;i<t;i++){
			System.out.println("enter no of element in array");
			int n=scan.nextInt();
			int[]left=new int[n];
			int[]right=new int[n];
			char []LoR=new char[n];
			Tree root=null;
			
			for(int j=0;j<n;j++){
				left[j]=scan.nextInt();
				right[j]=scan.nextInt();
		        LoR[j]=scan.next().charAt(0);
				
				if(j==0){
					root=makeRoot(root,left[j]);
					
				}
				root=insert(root,left[j],right[j],LoR[j]);
					
				
			}
			print(root);
			
			boolean res=isBst(root);
System.out.println("res="+res);		
	}//end of main
}
}//end of class
public class IsTreeBst{
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
		
		static int min(Tree root,int min1){
			if(root!=null){
				if(root.data<min1){
					min1=root.data;
				}
				min(root.left,min1);
				min(root.right,min1);
			}
			
			return min1;
		}
		static int max(Tree root,int max1){
			if(root!=null){
				if(root.data>max1){
					max1=root.data;
				}
				max(root.left,max1);
				max(root.right,max1);
			}
			
			return max1;
		}
		static boolean isBst(Tree root){
			if(max(root.left,0)<root.data&&min(root.right,50)>root.data){
				return true;
			}else{
				return false;
			}
			
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
			System.out.println(min(root,50));
			System.out.println(max(root,0));
			boolean res=isBst(root);
System.out.println("res="+res);		
	}//end of main
}
}//end of class
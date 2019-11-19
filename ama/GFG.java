package ama.com;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class GFG{
	static  class TreeNode {
		     int val;
		     TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
		  }	
	   static public List<TreeNode> generateTrees(int n) {
	         List<TreeNode> res = new ArrayList<TreeNode>();
	        if(n == 0)
	            return res;
	        res = generateChilds(1,n);
	        return res;
	    }
	   static  public List<TreeNode> generateChilds(int s,int l)
	    {
	        List<TreeNode> res = new ArrayList<TreeNode>();
	        if(s > l)                                                                                                                                                                                                    
	            return null;
	        if(s == l)
	            res.add(new TreeNode(s));
	        for(int i = s; i <= l;i++)
	        {
	            List<TreeNode> lchilds = generateChilds(s,i-1);
	            List<TreeNode> rchilds = generateChilds(i+1,l);
	            if(lchilds == null && rchilds != null)
	            {
	              for(TreeNode rchild : rchilds)
	                {
	                    TreeNode root = new TreeNode(i);
	                    root.left = null;
	                    root.right = rchild;
	                    res.add(root);
	                }
	            }else if (rchilds == null && lchilds != null)
	            {
	                for(TreeNode lchild : lchilds)
	                {
	                    TreeNode root = new TreeNode(i);
	                    root.right = null;
	                    root.left = lchild;
	                    res.add(root);
	                }
	            }else if(rchilds != null && lchilds != null){
	            for(TreeNode lchild : lchilds)
	                for(TreeNode rchild : rchilds)
	                {
	                    TreeNode root = new TreeNode(i);
	                    root.left = lchild;
	                    root.right = rchild;
	                    res.add(root);
	                }
	            }
	        }
	        return res;
	    }
	
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("enter n");
		int n=scan.nextInt();
		List<TreeNode>list=generateTrees(n);
		for(TreeNode node:list){
			System.out.print(node.val +" ");
		}
		
	}
}

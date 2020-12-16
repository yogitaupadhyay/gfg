package sis.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

import javax.xml.bind.annotation.XmlElementDecl.GLOBAL;

public class TravellingDOCTOR {
static 	class Node implements Comparator<Node>{
		int data;
		double probability;
		Node(){
			
		}
		Node(int data,double probability){
			this.data=data;
			this.probability=probability;
		}
		@Override
		public int compare(Node o1, Node o2) {
		// TODO Auto-generated method stub
		return (int)((o1.probability-o2.probability)*10);
		}
		
	}
	static class Graph{
		 int v;
		  LinkedList<Node>glist[];
		  Graph(int v){
			  this.v=v;
			  glist=new LinkedList[v];
			  for(int i=0;i<v;i++){
				  glist[i]=new LinkedList<Node>();
			  }
			  
		  }
	}
 static public void addEdge(Graph g,int src,int dest,double probability){
	Node n=new Node(dest,probability);
	 g.glist[src].add(n);
	 
 }
 
 static public  Node findDivision(Graph g,int count,double p,int n,double totalp,int t1,ArrayList<Node>res ){
	
	 	count++;
	 totalp=totalp+p;
	 	if(count==t1){
	 		System.out.println(n);
	 		Node n1=new Node(n,totalp);
	 		res.add(n1);
	 			return n1; 		
	 	}
	Iterator<Node>it=g.glist[n].iterator();
		 while(it.hasNext()){
		 Node node=it.next();
		 
			 findDivision(g,count,node.probability,node.data,totalp,t1,res);
			 p=p-node.probability;
		 
	 }
	 
	 Collections.sort(res,new Node());
	 return res.get(0);
 }
 
 
 static public void printg(Graph g){
	 for(int i=0;i<g.v;i++){
		 System.out.print(i+" ");
		 for(int j=0;j<g.glist[i].size();j++){
			 System.out.print(g.glist[i].get(j).data+" ");
		 }
		 System.out.println();
	 }
	 
 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("eneter no of test case");
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		
		for(int i=0;i<t;i++){
			System.out.println("enter n,e,t");
			int n=scan.nextInt();
			Graph g=new Graph(n);
			int e=scan.nextInt();
			int time=scan.nextInt();
			int t1=time/10;
			if(time>t1*10){
				t1=t1+1;
			}
			for(int j=0;j<e;j++){
				int s=scan.nextInt();
				int d=scan.nextInt();
				double p=scan.nextDouble();
				addEdge(g, s, d, p);
			}
			printg(g);
			//boolean visited[]=new boolean[n];
			double totalp=0.0;
			ArrayList<Node>res=new ArrayList<Node>();
			Node r=findDivision(g, 0, 0, 0, totalp,t1,res);
			System.out.println(r.data+"  "+r.probability);
		}
		

	}

}

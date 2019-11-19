package nit.com;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class KimsTravel {
	static class Node{
		int data;
		double p;
		Node(int data,double p){
			this.data=data;
			this.p=p;
		}
	}
	static class Graph{
		int v;
		LinkedList<Node>glist[]=null;
		public Graph(int v) {
			// TODO Auto-generated constructor stub
			this.v=v;
			glist=new LinkedList[v+1];
			for(int i=0;i<v+1;i++){
				glist[i]=new LinkedList<KimsTravel.Node>();
			}
					 
		}
	}
static void addEdge(Graph g,int src,int dest,double p){
	Node node= new Node(dest,p);
	g.glist[src].add(node);
	
	
}
static Node res=new Node(0,0);
static void travel(Graph g,int node,double p,int t,int T){
	System.out.println("NODE="+node+"p="+p+"t="+t);
	if(t>T){
		if(p>res.p){
			res=new Node(node,p);;
		}
		return ;
	}
	Iterator<Node>i=g.glist[node].iterator();
	//Node maxNode=new Node(0,0);
	while(i.hasNext()){
		Node k=i.next();
		System.out.println("k="+k.data);
		
		travel(g, k.data, p*k.p, t+10, T);
	
    
	}
	
	
}
static void printg(Graph g){
	for(int i=0;i<g.glist.length;i++){
		for(Node data:g.glist[i]){
			System.out.println(i+"--"+data.data+"  "+data.p);
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("ENTER N");
		int v=scan.nextInt();
		int e=scan.nextInt();
		int t=scan.nextInt();
		Graph g=new Graph(v);
		for(int i=0;i<e;i++){
			int s=scan.nextInt();
			int d=scan.nextInt();
			double p=scan.nextDouble();
			addEdge(g,s,d,p);
		}
		printg(g);
		travel(g, 1, 1, 10, t);
		System.out.println("RES="+res.data+"---"+res.p);

	}

}

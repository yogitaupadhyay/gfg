package sis.com;

import java.util.Arrays;
import java.util.LinkedList;
public class Graph {
	
	//make a node and assign values
		 class Node{
		 int vertex;
			 int weight;
			Node(int vertex,int weight){
				this.vertex=vertex;
				this.weight=weight;
			}
		} 

		int v;
	 LinkedList<Node> glist[];
		Graph(int v){
			this.v=v;
			glist=new LinkedList[v+1];
			for(int i=0;i<=v;i++){
				glist[i]=new LinkedList<Node>();
			}
			
		}
			void addEdge(int a,int b,int weight){
				Node node=new Node(b,weight);
					glist[a].add(node);
			}
			void print(){
				for(int i=1;i<=v;i++){
					LinkedList<Node>data=glist[i];
					for(int j=0;j<data.size();j++){
						System.out.print("-"+data.get(j).weight+"->"+data.get(j).vertex+"  ");
					}
					System.out.println("");
				}
			}
			
			void bellmanFord(int source){
				int res[]=new int[glist.length];
				Arrays.fill(res, Integer.MAX_VALUE);
				res[source]=0;
				for(int i=0;i<glist.length;i++){
					for(int j=0;j<glist.length;j++){
					System.out.println("HELLO");
					}
				}
				
			}
			
			public static void main(String args[]){
				System.out.println("enter no of vertex ");
				java.util.Scanner scan=new java.util.Scanner(System.in);
				int n=scan.nextInt();
				Graph g=new Graph(n);
				System.out.println("enter no of edges");
				int e=scan.nextInt();
				for(int i=0;i<e;i++){
					int a=scan.nextInt();
					int b=scan.nextInt();
					int w=scan.nextInt();
					g.addEdge(a,b,w);
					
				}
				
				g.print();
				
				
			}
}

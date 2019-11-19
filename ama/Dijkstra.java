package sis.com;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

import sis.com.Graph.Node;

public class Dijkstra {

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
	 Dijkstra(int v){
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
			
			void algo(int source){
				int dist[]=new int[glist.length];
				ArrayList<Integer>minTree=new ArrayList<Integer>();
				Arrays.fill(dist, Integer.MAX_VALUE);
				dist[source]=0;
				int min=0;//minimum distance
				int minIndex=source;//vertex with minimum distance
				
				while(minTree.size()!=glist.length){
					Iterator<Node>it=glist[minIndex].iterator();
					while(it.hasNext()){
						int weight=it.next().weight;	
						int vertex=it.next().vertex;
						if(dist[minIndex]+weight<dist[vertex]){
							dist[vertex]=dist[minIndex]+weight;
						}
						min=Integer.MAX_VALUE;
						if(dist[vertex]<min){
							min=dist[vertex];
							minIndex=vertex;
						}
						
					}
					minTree.add(minIndex);
				System.out.println(minIndex+" = "+min);
				}
				
				
				
			}
			
			public static void main(String args[]){
				System.out.println("enter no of vertex ");
				java.util.Scanner scan=new java.util.Scanner(System.in);
				int n=scan.nextInt();
			Dijkstra g=new Dijkstra(n);
				System.out.println("enter no of edges");
				int e=scan.nextInt();
				for(int i=0;i<e;i++){
					int a=scan.nextInt();
					int b=scan.nextInt();
					int w=scan.nextInt();
					g.addEdge(a,b,w);
					
				}
				
				g.print();
				
				g.algo(0);
			}

}

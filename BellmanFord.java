package sis.com;

import java.util.Arrays;
import java.util.Scanner;

public class BellmanFord{
	class Edge{
		int src;
		int dest;
		int weight;
		Edge(){
			this.src=0;
			this.dest=0;
			this.weight=0;
			
		}
	}
	
	int v;
	int e;
	Edge []edge;
	BellmanFord(int v,int e){
		this.v=v;
		this.e=e;
		edge=new Edge[e];
		for(int i=0;i<e;i++){
			edge[i]=new Edge();
		}
	}
	
	void algo(int source){
		int res[]=new int[v];
		Arrays.fill(res, Integer.MAX_VALUE);
		res[source]=0;
		//relaxation
		for(int i=0;i<v;i++){
			for(int j=0;j<e;j++){
				 int src=edge[j].src;
				 int dest=edge[j].dest;
				 int weight=edge[j].weight;
				 if(res[src]!=Integer.MAX_VALUE&&res[src]+weight<res[dest]){
					 res[dest]=res[src]+weight;
				 }
				
			}
		}
		int i=0;
		for(int data:res){
	System.out.println(i+" "+data);
		i++;
		}
		//negative weight check
		
			for(int j=0;j<e;j++){
				 int src=edge[j].src;
				 int dest=edge[j].dest;
				 int weight=edge[j].weight;
				 if(res[src]!=Integer.MAX_VALUE&&res[src]+weight<res[dest]){
					 System.out.println("NEGATIVE WEIGHT CYCLE");
					 System.exit(0);
				 }
			}		
		
	}
	
	public static void main(String args[]){
		System.out.println("ENTER no of egdes and vertex");
		Scanner scan=new Scanner(System.in);
		int e=scan.nextInt();
		int v=scan.nextInt();
		BellmanFord g=new BellmanFord(v, e);
		for(int i=0;i<e;i++){
			g.edge[i].src=scan.nextInt();
			g.edge[i].dest=scan.nextInt();
			g.edge[i].weight=scan.nextInt();
			
		}
		
	g.algo(0);
	}
}
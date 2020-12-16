package sis.com;

import java.util.LinkedList;
import java.util.Scanner;

import javax.management.Query;

public class IsBipartite {
 static boolean bipartite(int[][]graph,int v,int[]color){
	 LinkedList<Integer>q=new LinkedList<Integer>();
	 q.add(v);
	 color[v]=1;
	 System.out.println("V="+v);
	 while(q.isEmpty()==false){
		 for(int data:q){
			 System.out.print(data+" ");
		 }
		 System.out.println();
		 int u=q.removeFirst();
		 
		 if(graph[u][u]==1){
			 return false;
		 }
		 for(int i=0;i<graph.length;i++){
			 if(color[i]==-1&&graph[u][i]==1){
				 color[i]=1-color[u];
				 q.add(i);
			 }else if(color[i]==color[u]&&graph[u][i]==1){
				 return false;
			 }
			 
		 }
	 }
	 return true;
	 
	}
	static boolean  isBipartite(int [][]graph){
		int []color=new int[graph.length];
		
		for(int i=0;i<graph.length;i++){
			for(int j=0;j<color.length;j++){
				color[j]=-1;
			}
			if(bipartite(graph,i,color)==false){
				return false;
			}
		}
	return true;	
	}
	
	
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("enter no of vertices");
		int v=scan.nextInt();
		System.out.println("enter no of edges");
		int e=scan.nextInt();
		int graph[][]=new int[v][v];
		for(int i=0;i<e;i++){
			int a=scan.nextInt();
			int b=scan.nextInt();
			graph[a][b]=1;
			graph[b][a]=1;
		}
		for(int i=0;i<v;i++){
			for(int j=0;j<v;j++){
			System.out.print(graph[i][j]+" ");
			}
			System.out.println();
		}
		boolean res=isBipartite(graph);
		System.out.println(res);
		scan.close();
		
	}

}

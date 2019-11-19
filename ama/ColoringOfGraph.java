package sis.com;

import java.util.Scanner;

public class ColoringOfGraph{
	
	static boolean isSafe(int [][]graph,int[]color,int c,int v){
		for(int i=0;i<graph.length;i++){
			if(graph[v][i]==1&&color[i]==c){
				return false;
			}
		}
		//System.out.println("yes");
		return true;
	}
	
	static boolean colorUtil(int[][]graph,int v,int m,int []color){
		//System.out.println("V="+v);
		if(v==graph.length){
			return true;
		}
		for(int c=1;c<=m;c++){
		if(isSafe(graph,color,c,v)){
			//oSystem.out.println("C="+c);
			color[v]=c;
			if(colorUtil(graph, v+1, m, color)){
				return true;
			}
		}
		}
		return false;
		
	}
	
	static void  print(int[]color){
		for(int i=0;i<color.length;i++){
		System.out.print(color[i]+" ");
		}
	}
	static boolean ColorGraph(int graph[][],int m){
		int []color=new int [graph.length];
		if( colorUtil(graph,0,m,color)){
			print(color);
			return true;
		}
		return false;
		
	}
	
	public static void main(String args[]){				
		Scanner scan=new Scanner(System.in);
		System.out.println("enter no of vertices");
		int v=scan.nextInt();
			
		System.out.println("enter no of colors");
		int m=scan.nextInt();
		System.out.println("enter no of edges");
		int e=scan.nextInt();
		int graph[][]=new int[v][v];
		for(int i=0;i<e;i++){
			int a=scan.nextInt();
			int b=scan.nextInt();
			graph[a][b]=1;
			graph[b][a]=1;
		}
		/*for(int i=0;i<v;i++){
			for(int j=0;j<v;j++){
			System.out.print(graph[i][j]+" ");
			}
			System.out.println();
		}*/
		ColorGraph(graph, m);
		
		scan.close();
		
		
	}//END OF MAIN
}//end of class

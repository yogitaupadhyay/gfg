package nit.com;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Dijsktra {	
	class Point{
		int x;int y;
		Point(int x,int y){
			this.x=x;
			this.y=y;
		}
		
	}
	 static class Node implements Comparable<Node>{
	 int vertex;
		 int weight;
		Node(int vertex,int weight){
			this.vertex=vertex;
			this.weight=weight;
		}		
		@Override
		public int compareTo(Node ob2){
			return this.weight-ob2.weight;         			
		}
	} 
		public static  void algo(int [][] g,int node){
			HashMap<Integer,Integer>dis=new HashMap<Integer,Integer>();
		PriorityQueue<Node> q=new PriorityQueue<Node>();
		q.add(new Node(0,0));
			for(int i=1;i<g.length;i++){
				q.add(new Node(i,Integer.MAX_VALUE));
			}
			while(q.isEmpty()==false){
				Node o=q.poll();
				dis.put(o.vertex,o.weight);
				for(Node n:q){
					if(q.contains(n)){
					if((g[o.vertex][n.vertex]!=0&&n.weight>o.weight+g[o.vertex][n.vertex])){
						n.weight=o.weight+g[o.vertex][n.vertex];
					}
					}
				}
			}
			for(int k:dis.keySet()){
				System.out.println(k+" "+dis.get(k));
			}
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("enter no of vertex ");
			java.util.Scanner scan=new java.util.Scanner(System.in);
			int v=scan.nextInt();
			
			System.out.println("enter no of edges");
			int e=scan.nextInt();
			int g[][]=new int[v][v];
			for(int i=0;i<e;i++){
				int a=scan.nextInt();
				int b=scan.nextInt();
				int w=scan.nextInt();
				g[a][b]=w;
				g[b][a]=w;
			}
			
			//g.print(g);
			
			algo(g,0);
	}

}

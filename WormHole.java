/*package nit.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;
public class WormHole {
	static class Point{
		int x;int y;
		Point(int x,int y){
			this.x=x;
			this.y=y;
		}
		
	}
	 static class Node implements Comparable<Node>{
	 Point vertex;
		 int weight;
		Node(int x,int y,int weight){
			this.vertex=new Point(x,y);
			this.weight=weight;
		}		
		@Override
		public int compareTo(Node ob2){
			return this.weight-ob2.weight;         			
		}
	} 
		public static  void algo(int [][] g,ArrayList<Point>arr){
			System.out.println("G="+g.length+"arr="+arr.size());
			HashMap<Point,Integer>dis=new HashMap<Point,Integer>();
			int e=(g.length*(g.length-1))/2;
	for(int i=0;i<g.length;i++){
		for(int j=0;j<g.length;j++){
			if(j!=i){
			if((g[arr.indexOf(o.vertex)][arr.indexOf(n.vertex)]!=-1)){
				g[arr.indexOf(o.vertex)][arr.indexOf(n.vertex)]=Math.abs(n.vertex.x-o.vertex.x)+Math.abs(n.vertex.y-o.vertex.y);
			}
		if(n.weight>o.weight+g[arr.indexOf(o.vertex)][arr.indexOf(n.vertex)]){
			n.weight=o.weight+g[arr.indexOf(o.vertex)][arr.indexOf(n.vertex)];
		}
			}
		}
	}
			
			for(Point k:dis.keySet()){
				System.out.println("("+k.x+","+k.y+")=  "+dis.get(k));
			}
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner scan=new java.util.Scanner(System.in);
		System.out.println("enter s d ");
		int sx=scan.nextInt();
		int sy=scan.nextInt();
		int dx=scan.nextInt();
		int dy=scan.nextInt();
		System.out.println("enter no of worm hole ");
		int w=scan.nextInt();
		ArrayList<Point>arr=new  ArrayList<Point>();
		arr.add(new Point(sx,sy));
		arr.add(new Point(dx,dy));
		int g[][]=new int[2*w+2][2*w+2];
		for(int i=0;i<g.length;i++){
			for(int j=0;j<g.length;j++){
				g[i][j]=-1;
			}
		}
		g[0][1]=Math.abs(dx-sx)+Math.abs(dy-sy);
		for(int i=2;i+1<g.length;i=i+2){
			int a=scan.nextInt();
			int b=scan.nextInt();
			arr.add(new Point(a,b));
			int c=scan.nextInt();
			int d=scan.nextInt();
			arr.add(new Point(c,d));
			int e=scan.nextInt();
			if((Math.abs(c-a)+Math.abs(d-b))>e){
				g[i][i+1]=e;
				g[i+1][i]=e;
			}else{
				g[i][i+1]=Math.abs(c-a)+Math.abs(d-b);
				g[i+1][i]=Math.abs(c-a)+Math.abs(d-b);
			}
			
		}
		
		//g.print(g);
		
		algo(g,arr);
	}

}
*/
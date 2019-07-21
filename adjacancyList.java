import java.util.*;
public class graph2{
	static class graph1{
		static int v;
		static LinkedList<Integer>glist[];
		graph1(int v){
			this.v=v;
			glist=new LinkedList[v];
			for(int i=0;i<v;i++){
				glist[i]=new LinkedList<>();
			}
		}
	}
	public static void show(graph1 g){
		for(int i=0;i<g.v;i++){
			for(int data:g.glist[i]){
				System.out.print( data+"->");
			}
			System.out.println();
		}
	}
	public static void addedge(graph1 g,int src,int dest){
		g.glist[src].add(dest);
		g.glist[dest].add(src);
	}
	public static void main(String args[]){
		graph1 g=new graph1(5);
	addedge(g,0,1);
		addedge(g,0,4);
		addedge(g,1,3);
		addedge(g,4,1);
		addedge(g,4,3);
		addedge(g,1,2);
		addedge(g,3,2);
		show(g);
	}
}
import java.util.*;
public class graph1{
     static int v;
		
	
	public static void show(){ 
		for(int i=0;i<v;i++){
			for(int data:glist[i]){
				System.out.print( data+"->");
			}
			System.out.println();
		}
	}
	public static void addedge(graph1 g,int src,int dest){
		g.glist[src].add(dest);
		g.glist[dest].add(src);
	}
	public static void bfs(int s){
		boolean visited[]=new boolean[v];
		LinkedList<Integer>que=new LinkedList<Integer>();
		visited[s]=true;
		que.add(s);
		while(que.size()!=0){
			int i=que.poll();
			System.out.println(i+" ");
			Iterator<Integer> it=glist[i].listIterator();
			while(it.hasNext()){
				int k=it.next();
				if(visited[k]!=true){
					visited[k]=true;
				que.add(k);
				}
			}
		}
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
		bfs(2);
		show();
	}
}
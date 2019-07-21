import java.util.*;
public class DFS{
     static int v;
		static LinkedList<Integer>glist[];
		DFS(int v){
			this.v=v;
			glist=new LinkedList[v];
			for(int i=0;i<v;i++){
				glist[i]=new LinkedList<>();
			}
		}
	
	public static void show(){
		for(int i=0;i<v;i++){
			for(int data:glist[i]){
				System.out.print( data+"->");
			}
			System.out.println();
		}
	}
	public static void addedge(DFS g,int src,int dest){
		g.glist[src].add(dest);
		g.glist[dest].add(src);
	}
	public static void DFS1(int s,boolean visited[]){
		visited[s]=true;
		System.out.print(s+"  ");
		Iterator<Integer> it=glist[s].listIterator();
			while(it.hasNext()){
				int k=it.next();
				if(visited[k]!=true){
					DFS1(k,visited);
				}
			}
		}
	 public static void DFS2(int s){
		 boolean visited[]=new boolean[v];
		 DFS1(s,visited);
	 }
	public static void main(String args[]){
		DFS g=new DFS(5);
	addedge(g,0,1);
		addedge(g,0,4);
		addedge(g,1,3);
		addedge(g,4,1);
		addedge(g,4,3);
		addedge(g,1,2);
		addedge(g,3,2);
		DFS2(2);
		show();
	}
}
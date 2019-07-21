import java.util.*;
public class DFSPractice{
	static int v;
	static LinkedList<Integer>glist[];
	DFSPractice(int v){   //constructor can never be static
		this.v=v;
		glist=new LinkedList[v];
		for(int i=0;i<v;i++){
		glist[i]=new LinkedList<Integer>();
		}
	}
	public static void show(){
		for(int i=0;i<v;i++){
			for(int data:glist[i]){
				System.out.print(data+"->");
			}
			System.out.println();
		}
	}
	 static void DFS(boolean []visited,int n){
		visited[n]=true;
		System.out.println(n+"-");
		Iterator<Integer> it=glist[n].listIterator();
		while(it.hasNext()){
			int k=it.next();
			if(visited[k]==false){
				DFS(visited,k);
			}
		}
	}
	 static void DFS1(int n){
    boolean []visited=new boolean[v];
      DFS(visited,n);
	}
	public static void addedge(DFSPractice g,int src,int des){
		g.glist[src].add(des);
		g.glist[des].add(src);
	}
	public static void main(String args[]){
		DFSPractice g=new DFSPractice(5);
		addedge(g,0,1);
		addedge(g,0,4);
		addedge(g,1,3);
		addedge(g,4,1);
		addedge(g,4,3);
		addedge(g,1,2);
		addedge(g,3,2);
		show();
		DFS1(1);
	}
}
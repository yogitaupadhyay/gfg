import java.util.*;
public class ConnectedComponents{
	static int v;
	static LinkedList<Integer>glist[];
	ConnectedComponents(int v){  
		this.v=v;
		glist=new LinkedList[v];
		for(int i=0;i<v;i++){
		glist[i]=new LinkedList<Integer>();
		}
	}
	public static void show(){
		for(int i=0;i<v;i++){
				System.out.print(i+"->");
			
			for(int data:glist[i]){
				System.out.print(data+"->");
			}
			System.out.println();
		}
	}
	 static boolean[] DFS1(int n){
		boolean visited[]=new boolean[v];
		DFS(visited,n);
		return visited;
	 }
	 static boolean[] DFS(boolean[]visited,int n){
		visited[n]=true;
		Iterator<Integer> it=glist[n].listIterator();
		while(it.hasNext()){
			int k=it.next();
			if(visited[k]==false){
				DFS(visited,k);
			}
		}
		return visited;
	}
	
	public static void addedge(ConnectedComponents g,int src,int des){
		g.glist[src].add(des);
		g.glist[des].add(src);
	}
	
	public static void main(String args[]){
		ConnectedComponents g=new ConnectedComponents(5);
		addedge(g,1,0);
		addedge(g,1,2);
		addedge(g,3,4);
		int count=0;
		ArrayList<Integer>arr=new ArrayList<Integer>();
		boolean visited[]=new boolean[5];
		for(int i=0;i<v;i++){
			if(visited[i]==false){
				count++;
		arr.add(i);
				visited=DFS(visited,i);
			}
			else{
				continue;
			}
		}
		System.out.println("count="+count);
		for(int i=0;i<arr.size();i++){
		System.out.println(arr.get(i));
		}
		//DFS1(1);
	}
}
import java.util.*;
public class ConnectedComponent{
	static class Graph{
		int n;
		LinkedList<Integer>glist[]=null;
		Graph(int n){
		this.n=n;
		glist=new LinkedList[n+1];
		for(int i=0;i<n+1;i++){
			glist[i]=new LinkedList<Integer>();
		}
		}
		
		void addEdge(){
	java.util.Scanner scan=new java.util.Scanner(System.in);
		System.out.println("enter the no of edges");
		int edges=scan.nextInt();
		for(int i=0;i<edges;i++){
			int a=scan.nextInt();
			int b=scan.nextInt();
			glist[a].add(b);
			glist[b].add(a);
			
		}
		for(int i=0;i<n;i++){
			System.out.print((i)+"->");
			for(int data:glist[i]){
				System.out.print(data+"-> ");
			}
			System.out.println("");
		}
		 
		
	}
	int  dfs(int count,int node,boolean[]visited){
		
		//System.out.print(node+" ");
		count++;
		visited[node]=true;
		Iterator<Integer>it=glist[node].iterator();
			while(it.hasNext()){
				int a=it.next();
				if(visited[a]==false){
				count=dfs(count,a,visited);
				}
			}
	return count;
	}
	
	}
	
	
	
	
	public static void main(String args[]){
		
		System.out.println("enter the no of nodes");
		java.util.Scanner scan=new java.util.Scanner(System.in);
		int n=scan.nextInt();
		Graph g=new Graph(n);
		g.addEdge();
	 boolean []visited=new boolean[n+1];
	 int res=0;
	 int [] p=new int [n+1];
	 for(int i=1;i<=n;i++){
		 if(visited[i]==false){
			res=g.dfs(res,i,visited);
		 }
		 
		 for(int j=1;j<=n;j++){
			 if(visited[j]==true&&p[j]==0){
				 p[j]=res;
			 }
			 
		 }

		 res=0;
		 System.out.println(""); 
	 }
	 for(int i=1;i<=n;i++){
	 System.out.print(p[i]);
	 }
		
	}
}
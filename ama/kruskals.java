 package sis.com;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class kruskals {

	class Edge implements Comparator<Edge>{
		int src;
		int dest;
		int weight;
		Edge(){
			this.src=0;
			this.dest=0;
			this.weight=0;
			
		}
		@Override
	 public int compare(Edge obj1,Edge obj2){
			if(obj1.weight<obj2.weight){
				return -1;
			}else if(obj1.weight>obj2.weight){
				return 1;
			}else {
				return 0;
			}
			
		}
	}
	
	int v;
	int e;
	ArrayList<Edge>edge=null;
	kruskals(int v,int e){
		this.v=v;
		this.e=e;
		edge=new ArrayList<Edge>(e);
		for(int i=0;i<e;i++){
			edge.add(new Edge());
		}
	}
	
	void initialise(int arr[],int size[]){
		for(int i=0;i<arr.length;i++){
			arr[i]=i;
			size[i]=1;
		}
	}
	int root(int arr[],int i){
		while(arr[i]!=i){
			i=arr[i];
		}
		
		return i;
	}
	void union(int arr[],int size[],int a,int b){
		int root_a= root(arr,a);
		int root_b= root(arr,b);
		if(size[root_a]>size[root_b]){
			arr[root_b]=arr[root_a];
			size[root_a]=size[root_a]+size[root_b];
		}else{
			arr[root_a]=arr[root_b];
			size[root_b]=size[root_a]+size[root_b];
		}
		
	}
	void algo(){
	 ArrayList<Integer>res=new ArrayList<Integer>();
	 ArrayList<Edge>r=new ArrayList<Edge>();
		int arr[]=new int[v];
		int size[]=new int[v];
		Collections.sort(edge, new Edge());
		for(Edge e:edge){
			System.out.print(e.weight+" ");
		}
		initialise(arr, size);
		while(res.size()!=v){
			//System.out.println("res="+res.size());
		e=0;
		int src=edge.get(e).src;
		int dest=edge.get(e).dest;
		
		int x=root(arr,src);
		int y=root(arr,dest);
		if(x!=y){
			    r.add(edge.get(e));
			if(!res.contains(x)){
				res.add(x);
			}else if(!res.contains(y)){
				res.add(y);
			}
			union(arr,size,x,y);
		}
		e++;
		}
		for(int i=0;i<v;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0;i<v;i++){
			System.out.print(size[i]+" ");
		}
		
		for(Edge e:r){
			System.out.print(e.src+" "+e.dest+" " +e.weight+" ");
		}
	}		

	
	public static void main(String args[]){
		System.out.println("ENTER no of egdes and vertex");
		Scanner scan=new Scanner(System.in);
		int e=scan.nextInt();
		int v=scan.nextInt();
		kruskals g=new kruskals(v, e);
		for(int i=0;i<e;i++){
			g.edge.get(i).src=scan.nextInt();
			g.edge.get(i).dest=scan.nextInt();
			g.edge.get(i).weight=scan.nextInt();
			
		}
		
	g.algo();
	}

}

import java.util.*;
public class Solution1 {

public static class  graph{
     int n;
    LinkedList<Integer>list[];
     graph(int n){

    this.n=n;
list=new LinkedList[n];
for(int i=0;i<n;i++){
list[i]= new LinkedList<Integer>();
}

    }
 int dfs1(int node,int[] giftvalue){ 
       
	   int res=0;
	   boolean visited[]=new boolean[n];
        res=dfs(node,giftvalue,res, visited);		
        return res;
    }
	
    int dfs(int node,int giftvalue[],int res, boolean visited[]){ 
    visited[node]=true;
		res=res+giftvalue[node];
    Iterator<Integer> i=list[node].iterator();
    while(i.hasNext()){
        int k=i.next();
        if(visited[k]==false){
           res=dfs(k,giftvalue,res,visited);
        }
        
    }
      return  res; 
    }
    void addEdge(int startNode,int endNode){
list[startNode].add(endNode);

    }
    
}
public static void main(String args[]){
java.util.Scanner scan=new java.util.Scanner(System.in);
	int testcase=scan.nextInt();
	int res[]=new int[testcase];
	for(int t=0;t<testcase;t++){
	int noFriend=scan.nextInt();
		graph g=new graph(noFriend+1);
	int friend[]=new int[noFriend+1];
	int giftvalue[]=new int[noFriend+1];
	for(int i=1;i<=noFriend;i++){
		friend[i]=scan.nextInt();	
		g.addEdge(i,friend[i]);
		
	}
		for(int i=1;i<=noFriend;i++){	
		giftvalue[i]=scan.nextInt();
		
	}
	int max=0;
	for(int n=1;n<=noFriend;n++){
		
		res[t]=g.dfs1(n,giftvalue);
		if(res[t]>max){
			max=res[t];
		}
	}
	
	}
	for(int data:res){
		if(data<0){
			System.out.println("0");
		}else{
		System.out.println(data);
		}
	}
	
}


}
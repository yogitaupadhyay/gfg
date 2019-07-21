public class graphAdjacancy{
	public static void main(String args[]){
		java.util.Scanner scan=new java.util.Scanner(System.in);
	   System.out.println("enter the no vertex");
	   int n=scan.nextInt();
	   int graph[][]=new int[n][];
	   	addedge(graph,0,1);
	   addedge(graph,0,4);
	   addedge(graph,1,3);
	   addedge(graph,1,4);
	   addedge(graph,1,2);
	   addedge(graph,2,1);
	   addedge(graph,2,3);
	   addedge(graph,4,0);
	   addedge(graph,4,1);
	   addedge(graph,4,3);
	   for(int i=1;i<=n;i++){
		   for(int j=1;j<=n;j++){
			   System.out.printf("%3d",graph[i-1][j-1]);
			  
		   }
		   System.out.println();
	   } 
	  
	   
    }//end of main
	public static void addedge(int [][]graph,int a,int b){
		graph[a][b]=1;
	}
}//end of class
 private class listNode{
	 int data;
	 
 }
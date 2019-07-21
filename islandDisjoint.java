
//Initial Template for Java
import java.util.*;
import java.io.*;
import java.lang.*;
class island

{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int N = sc.nextInt();
            int M = sc.nextInt();
            
            ArrayList<ArrayList<Integer>> list = new ArrayList<>(N);
            
            // creating arraylist of arraylist
            for(int i = 0; i < N; i++)
            {
                ArrayList<Integer> temp = new ArrayList<>(M);
                list.add(i, temp);
            }
            
            // adding elements to the arraylist of arraylist
            for(int i = 0; i < N; i++)
            {
                for(int j = 0; j < M; j++)
                {
                    int val = sc.nextInt();
                    list.get(i).add(j, val);
                }
            }
            
            
            System.out.println(new Islands().findIslands(list, N, M));
            
        }
    }
}


/*This is a function problem.You only need to complete the function given below*/
//User function Template for Java
class Islands
{
	
	
	Node{
		int i;
		int j;
		Node(int i.intj){
			this.i=i;
			this.j=j;
		}
	}
    static ArrayList<Integer>getNeibour(ArrayList<ArrayList<Integer>> list,int i,int j){
		
		int n=list.size();
		int m=list.get(i).size();
        ArrayList<Integer>neibourIJ=new ArrayList<Integer>();
        if((i+1)<n&&list.get(i+1).get(j)==1){
        neibourIJ.add(i+1);
        neibourIJ.add(j);
        }
        
        if((i+1)<n&&(j+1)<m&&list.get(i+1).get(j+1)==1){
        neibourIJ.add(i+1);
        neibourIJ.add(j+1);
        }
        
        if((j+1)<m&&list.get(i).get(j+1)==1){
        neibourIJ.add(i);
        neibourIJ.add(j+1);
        }
        
         if((i-1)>=0&&(j+1)<m&&list.get(i-1).get(j+1)==1){
        neibourIJ.add(i-1);
        neibourIJ.add(j+1);
        }
        
         if((i-1)>=0&&list.get(i-1).get(j)==1){
        neibourIJ.add(i-1);
        neibourIJ.add(j);
        }
        
        if((i-1)>=0&&(j-1)>=0&&list.get(i-1).get(j-1)==1){
        neibourIJ.add(i-1);
        neibourIJ.add(j-1);
        }
        
         if((j-1)>=0&&list.get(i).get(j-1)==1){
        neibourIJ.add(i);
        neibourIJ.add(j-1);
        }
        
        
         if((i+1)<n&&(j-1)>=0&&list.get(i+1).get(j-1)==1){
        neibourIJ.add(i+1);
        neibourIJ.add(j-1);
        }
        return neibourIJ;
    }
	
	int root(ArrayList<Node>parent,){
		
	}
	
	
    static void Dfs(ArrayList<ArrayList<Integer>> list,int i,int j, boolean [][]visited){
        visited[i][j]=true;
        ArrayList<Integer> neibourIJ=getNeibour(list,i, j);
        Iterator<Integer>it=neibourIJ.iterator();
        while(it.hasNext()){
            int ni=it.next();
            int nj=it.next();
            if(visited[ni][nj]==false){
                  Dfs(list,ni,nj,visited);
            }
        }
    }
    // Function to find the number of island in the given list
    // N, M: size of list row and column respectively
    static int findIslands(ArrayList<ArrayList<Integer>> list, int N, int M)
    {
		ArrayList<Node>parent=new ArrayList<Node>();
		
		for(int i=0;i<N;i++){
          for(int j=0;j<M;j++){
			  if(list.get(i).get(j)==1){
				  parent.add(new Node(i,j));
			  }
			  
		  }
		}
		ArrayList<Integer>size=new ArrayList<Integer>(parent.size());
		for(int i=0;i<parent.size();i++){
			size.set(i,1);
		}
        boolean [][]visited=new boolean [N][M];
        int count=0;
      for(int i=0;i<N;i++){
          for(int j=0;j<M;j++){
             if(visited[i][j]==false&&list.get(i).get(j)==1){
				 System.out.println(count+" count");
				   for(int s=0;s<N;s++){
				   for(int t=0;t<M;t++){
					   
					   System.out.print(visited[s][t]+"  ");
				   }
				   System.out.println("");
				   }
				 
				 //System.out.println("island");
				  //System.out.print(list.get(i).get(j)+" ");
                  Dfs(list,i,j,visited);
                  count++;
             }
             
          }
      } 
      return count;  
    }
    
	
}
	

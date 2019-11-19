package nit.com;

import java.util.ArrayList;
import java.util.Scanner;

public class BaseStation {
 static int xEn[]={0, -1, -1 ,-1,0,1};
 static int yEn[]={+1, +1,0,-1,-1,0 };
 static int yOn[]={+1 , 0,-1,-1,0, +1};
 static int xOn[]={0 ,-1 ,0 ,+1,+1,+1};
	static int max=0;
	
	static void  profit(int [][]arr,int x,int y,int k,boolean [][]visited,int sum){
		sum=sum+arr[x][y];		
		 visited[x][y]=true;
		if(k==0){	
			if(max<sum){		
				max=sum;
					
			}	//System.out.println("================");		
			return;
		}		
		
		if(y%2==0){
			for(int i=0;i<xEn.length;i++){
				int nx=x+xEn[i];
				int ny=y+yEn[i];
				
				if(nx>=0&&nx<arr.length&&ny>=0&&ny<arr[0].length&&visited[nx][ny]==false){
					profit(arr, nx, ny, k-1,visited,sum);
					visited[nx][ny]=false;
				}
				
			}
		}else{
			for(int i=0;i<xOn.length;i++){
				int nx=x+xOn[i];
				int ny=y+yOn[i];
				if(nx>=0&&nx<arr.length&&ny>=0&&ny<arr[0].length&&visited[nx][ny]==false){
					//System.out.println("nx="+nx+" ny="+ny);
					profit(arr, nx, ny, k-1,visited, sum );
					visited[nx][ny]=false;
				}
				
			}
		}
		
	 }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 System.out.println("ENTER N AND M");
	        int n=sc.nextInt();
	        int m=sc.nextInt();
	       
	        int arr[][]=new int[n][m];
	        for(int i=0;i<n;i++)
	        {	        
	        for(int j=0;j<m;j++)
	        {
	        arr[i][j]=sc.nextInt();
	        }	            
	        }
	      
	        for(int i=0;i<n;i++)
	        {	        
	        for(int j=0;j<m;j++)
	        {
	        	 int sum=0;
	        	 boolean [][]visited=new boolean[n][m];
	        	 profit(arr, i, j,3,visited,sum);
	        }	            
	        }
	       // System.out.println("length="+arr[0].length);
	        System.out.println("RES="+max);
	       

	}

}

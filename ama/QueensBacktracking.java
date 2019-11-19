package sis.com;

import java.util.Scanner;

public class QueensBacktracking {
	
	static public boolean isSafe(int q,int col,int [][]arr){
		
		
		for(int i=0;i<arr.length;i++){
			if(arr[q][i]==1||arr[i][col]==1){
				//System.out.println("q="+q+"col="+i);
				return false;
			}
			for(int j=0;j<arr.length;j++){
				if(i+j==q+col&&arr[i][j]==1){
					//System.out.println("i="+q+"j="+i);
					return false;
				}
				if(i-j==q-col&&arr[i][j]==1){
					return false;
				}
			}
		}
		
		return true;
	}
	
	static public void printBoard(int [][]arr){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<(arr[i].length);j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
	
  static public boolean placeQueen(int q,int nq,int[][]arr){
	
	  System.out.println("q="+q);
	  if(q==nq){
		  printBoard(arr);
		  System.exit(0);
	  }
	 	 for(int i=0;i<arr.length;i++){
	 		  if(isSafe(q,i,arr)){
			 arr[q][i]=1;
			  System.out.println("q="+q+" col="+i);
			 	 printBoard(arr);
				  if(placeQueen(q+1, nq, arr)==true){
				  return true;
			  }else{
				  System.out.println("q="+q+" col="+i);
			  arr[q][i]=0;
			  }
		  }
		 
	  }
	  return false;
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ENETER the no n");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int [][]arr=new int[n][n];
	System.out.println("enter the no of queens");
	int nq=scan.nextInt();
		placeQueen(0,nq,arr);

	}

}

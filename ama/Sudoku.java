package ama.com;


import java.util.Scanner;

public class Sudoku {
	
 static class Cell{
	 int x;
	 int y;
	 int data;
	 Cell(int x,int y,int data){
		 this.x=x;
		 this.y=y;
		 this.data=data;
	 }
 }

 static void printsudoku(Cell sudoku[][]){
	 for(int i=0;i<sudoku.length;i++){
		   for(int j=0;j<sudoku.length;j++){
			   System.out.print(sudoku[i][j].data);
		   }
		   System.out.println();
	   }  
	 System.out.println("+++++++++++++++");
 }
 static boolean isSafe(Cell [][]sudoku,Cell u,int num){
	 for(int i=0;i<sudoku.length;i++){
		 if(sudoku[i][u.y].data==num||sudoku[u.x][i].data==num){
			 return false;
		 }
	 }
	 
	 int m=u.x-(u.x%(int)Math.sqrt(sudoku.length));
	 int n=u.y-(u.y%(int)Math.sqrt(sudoku.length));
	 for(int l=m;l<m+3;l++){
		 for(int j=n;j<n+3;j++){
			 if(sudoku[l][j].data==num){
				 return false;
			 }
		 }
	 }
	 
	 
	 
	 return true;
 }
 
	static boolean  solve(Cell [][]sudoku){
		int x=-1;
		int y=-1;
		boolean isEmpty=false;
		for(int i=0;i<sudoku.length;i++){
			for(int j=0;j<sudoku.length;j++){
				if(sudoku[i][j].data==0){
					x=i;
					y=j;
					isEmpty=true;
					break;
			}
			}
			if(isEmpty==true){
				break;
			}
		}
		if(isEmpty==false){
			return true;
		}
		
		for(int num =1;num<=9;num++){
			if(isSafe(sudoku, sudoku[x][y], num)){
				sudoku[x][y].data=num;
				if(solve(sudoku)){
					return true;
				}else{
					sudoku[x][y].data=0;
				}
			}
		}
			
		
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter prlm");
	 Cell sudoku[][]=new Cell[9][9];
	 for(int i=0;i<sudoku.length;i++){
		 for(int j=0;j<sudoku.length;j++){
			int d=scan.nextInt();
			 sudoku[i][j]=new Cell(i,j,d);
					 
		 }
	 }
  if( solve(sudoku)==true){
	  for(int i=0;i<sudoku.length;i++){
		   for(Cell c:sudoku[i]){
			   System.out.print(c.data+ " ");
		   }
		   System.out.println();
	   }  
  }else{
	  System.out.println("not possible");
  }
   
   scan.close();
	}

}

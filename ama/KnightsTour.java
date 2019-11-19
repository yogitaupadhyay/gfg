package sis.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class KnightsTour {
	
	public static ArrayList<Integer>getNeibour(int[][]visited,int x,int y){
		ArrayList<Integer>neibour=new ArrayList<Integer>();
		
		if(x+2<visited.length&&y+1<visited.length&&visited[x+2][y+1]==-1){
			neibour.add(x+2);
			neibour.add(y+1);
		}
		
		if(x+1<visited.length&&y+2<visited.length&&visited[x+1][y+2]==-1){
			neibour.add(x+1);
			neibour.add(y+2);
		}
		
		if(x-1>=0&&y+2<visited.length&&visited[x-1][y+2]==-1){
			neibour.add(x-1);
			neibour.add(y+2);
		}
		
		if(x-2>=0&&y+1<visited.length&&visited[x-2][y+1]==-1){
			neibour.add(x-2);
			neibour.add(y+1);
		}
		
		if(x-2>=0&&y-1>=0&&visited[x-2][y-1]==-1){
			neibour.add(x-2);
			neibour.add(y-1);
		}
		
		if(x-1>=0&&y-2>=0&&visited[x-1][y-2]==-1){
			neibour.add(x-1);
			neibour.add(y-2);
		}
		if(x+1<visited.length&&y-2>=0&&visited[x+1][y-2]==-1){
			neibour.add(x+1);
			neibour.add(y-2);
		}
		
		if(x+2<visited.length&&y-1>=0&&visited[x+2][y-1]==-1){
			neibour.add(x+2);
			neibour.add(y-1);
		}
		return neibour;
		
		
	}
	
	
	static public void printBoard(int [][]arr){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<(arr[i].length);j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
public static boolean tour(int arr[][],int row,int col,int count)throws Exception{
	//System.out.println("row="+row+"  col="+col+" count="+count);
	if(count==(arr.length*arr.length)){
		printBoard(arr);
		return true;
	}
	
	arr[row][col]=count;
	//System.out.println("row="+row+" col="+col+" count="+count);
	ArrayList<Integer>neibour=getNeibour(arr,row,col);
	Iterator<Integer>it=neibour.iterator();
	while(it.hasNext()){
		int nx=it.next();
		int ny=it.next();
		
		if(tour(arr, nx, ny, count+1)){
			return true;
		}else{
			arr[nx][ny]=-1;
			
		}
		
	}
	return false;
}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.out.println("enter the no of n");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int arr[][]=new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				arr[i][j]=-1;
			}
		}
		tour(arr,0,0,0);

	}

}

public class MaximumPoints{
	public static int move(int [][] matrix,int row,int col,int n,int points) {
		System.out.println((row)+" "+col+" "+points);
		if(row<0||col>n-1){
			return 0;	
		}
		points=points+matrix[row][col];
		if(row==0&&col==n-1){
			return points;
			
		}	
		int up=move(matrix,row-1,col,n,points);	
		int right=move(matrix,row,col+1,n,points);
		return Math.max(up,right);
		
	}
	
	public static void main(String args[]){
		java.util.Scanner scan=new java.util.Scanner(System.in);
		System.out.println("enter the no of row");
		int row=scan.nextInt();
		int col=scan.nextInt();
		int[][]arr=new int[row][col];
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
			arr[i][j]=scan.nextInt();	
			}
		}
	System.out.println(move(arr,row-1,0,col,0));	
	
	
	
	}
}
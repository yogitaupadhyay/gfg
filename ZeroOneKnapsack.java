import java.util.*;
public class ZeroOneKnapsack{
	public static void main(String args[]){
	java.util.Scanner scan=new java.util.Scanner(System.in);
		System.out.println("enter the max weigth");
		System.out.println("enter max weight");
		int maxvalue=scan.nextInt();
		System.out.println("enter no item");
		int noOfItem=scan.nextInt();
		ArrayList<Integer>amount=new ArrayList<Integer>();
		ArrayList<Integer>value=new ArrayList<Integer>();
		int[]res=new int[noOfItem];;
		System.out.println("enter weight-value");
		for(int i=0;i<noOfItem;i++){
			amount.add(scan.nextInt());
			value.add(scan.nextInt());
		    
	    }
		int matrix[][]=new int[noOfItem+1][maxvalue+1];
		int maxprofit=0;
		int maxrow=0;
		
		for(int i=0;i<=noOfItem;i++){
			for(int w=0;w<=maxvalue;w++){
			if(i==0||w==0){
				matrix[i][w]=0;
			}else if(amount.get(i-1)<=w){
				matrix[i][w]=Math.max(matrix[i-1][w],matrix[i-1][w-amount.get(i-1)]+value.get(i-1));
			}else{
				matrix[i][w]=matrix[i-1][w];
			}
			System.out.print(matrix[i][w]+" ");
			if(matrix[i][w]>maxprofit){
				  maxprofit=matrix[i][w];
				  maxrow=i;
				 
			  }
			}
			 System.out.println(""); 
	    }
		
		for(int i=noOfItem;i>0;i--){
			if(java.util.Arrays.binarySearch(matrix[i],maxprofit)>=0){
		if(java.util.Arrays.binarySearch(matrix[i-1],maxprofit)>=0){
			res[i-1]=0;
		}else{
			res[i-1]=1;
			maxprofit=maxprofit-value.get(i-1);
		}
			}else{
				res[i-1]=0;
			}
		}
		
		for(int i=0;i<noOfItem;i++){
			System.out.print(res[i]);
		}
		
		
	}
}
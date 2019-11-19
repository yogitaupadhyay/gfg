package nit.com;

import java.util.Scanner;

public class Amplification {
	static int max=0;
	static void toggle(int[][]arr,int col){
		for(int i=0;i<arr.length;i++){
			
				if(arr[i][col]==1){
					arr[i][col]=0;
				}else{
					arr[i][col]=1;
				}
				
			
		}
	}
	
	static void count(int arr[][]){
		int count=0;
		for(int i=0;i<arr.length;i++){
			int j=0;
			for(j=0;j<arr[0].length;j++){
				if(arr[i][j]!=1){
					break;
				}
				
			}
			if(j==arr[0].length){
				count++;
			}
		}
		if(count>max){
			max=count;
		}
		
	}
static void amplify(int [][]arr,int col,int k){
	//System.out.println("col="+col+"count="+max);
	if(k%2==0){
		count(arr);
	}
	if(col==arr[0].length||k==0){
		return;
	}
	toggle(arr, k);
	amplify(arr, col+1, k-1);
	toggle(arr, k);
	amplify(arr, col+1, k);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("ENTER N");
		int n=scan.nextInt();
		int m=scan.nextInt();
		int k=scan.nextInt();
		
		int arr[][]=new int[n][m];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				arr[i][j]=scan.nextInt();
			}
		}
		amplify(arr, 0, k);
		System.out.println("res="+max);
		

	}

}

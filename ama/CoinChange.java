package ama.com;

import java.util.Arrays;
import java.util.Scanner;

public class CoinChange {	
	static int number(int[] coin,int n,int v){
		int res=Integer.MAX_VALUE;
		int  arr[][]=new int[n][v+1];		
		for(int i=0;i<n;i++){	arr[i][0]=0;	}
		
		for(int i=0;i<arr.length;i++){
			for(int j=1;j<arr[0].length;j++){			
				if(coin[i]<=j){
					int k=j-coin[i];
					if(i>0){				
						arr[i][j]=Math.min(arr[i-1][j],arr[i][k]+1);
					}else{
						arr[i][j]=arr[i][k]+1;
					}
					if(j==v){						
						if(res>arr[i][j]){
							res=arr[i][j];
						}
					}
				}else{
					if(i>0){
						arr[i][j]=arr[i-1][j];
					}else{
						arr[i][j]=2*v+1;
					}
				}
			}
		}
		
		if(res<2*v+1){
		return res;
		}else{
			return -1;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("ENTER T");
		int t=scan.nextInt();
		for(int c=0;c<t;c++){
			int v=scan.nextInt();
			int n=scan.nextInt();
			int coin[]=new int[n];
			for(int i=0;i<n;i++){
				coin[i]=scan.nextInt();
			}
			Arrays.sort(coin);
		int res=number(coin, n, v);
		System.out.println(res);
	}

}
	}

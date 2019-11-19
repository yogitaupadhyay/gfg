package ama.com;

import java.util.Scanner;

public class AllPathMxn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter t");
		int t=scan.nextInt();
		for(int c=0;c<t;c++){
			int n=scan.nextInt();
			int m=scan.nextInt();
			int arr[][]=new int[n][m];
			for(int i=0;i<n;i++){
				arr[i][0]=1;
			}
			for(int i=0;i<m;i++){
				arr[0][i]=1;
			}
			for(int i=1;i<n;i++){
				for(int j=1;j<m;j++){
					arr[i][j]=arr[i-1][j]+arr[i][j-1];
				}
			}
			System.out.println(arr[n-1][m-1]);
		}
		

	}

}

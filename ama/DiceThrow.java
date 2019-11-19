package ama.com;

import java.util.Scanner;

public class DiceThrow {
 static int CountNumber(int m,int n,int sum){
	 if(n==1&&sum<=m){
		 return 1;
	 }else if((n==1&&sum>m)||m<1){
		 return 0;
	 }
	 int res=0;
	 for(int i=1;i<=m;i++){
		 res=res+CountNumber(m, n-1, sum-i);
	 }
	 
	 return res;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		for(int c=0;c<t;c++){
			int m=scan.nextInt();
			int n=scan.nextInt();
			int x=scan.nextInt();
			int res=CountNumber(m,n,x);
			System.out.println("RWES="+res);
		}

	}

}

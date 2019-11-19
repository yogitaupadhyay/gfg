package ama.com;

import java.util.Scanner;

public class SumOfDigits {
	static int count=0;
  static void func(int sum,int digits){
	  if(digits==1){
		  count++;
		  return ;
	  }
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter no");
		int n=scan.nextInt();
		int sum=scan.nextInt();		
     func(sum,n);
     System.out.println(count);
	}

}

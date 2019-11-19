package ama.com;

import java.security.acl.LastOwnerException;
import java.util.Scanner;

public class PermutaionWithSpaces {

	static void permutaion(String str,int k,int n){
		
		if(k==n){
			System.out.println(str);
			return;
		}
		String str1=null;
		if(str.indexOf(" ")<0){
 str1=str.substring(0,k)+" "+str.substring(k,str.length());
		}else{
			str1=str.substring(0,str.lastIndexOf(" ")+2)+" "+str.substring(str.lastIndexOf(" ")+2,str.length());
		}
	System.out.println("str="+str);
	System.out.println("str1="+str1);
	permutaion(str, k+1,n);
	permutaion(str1, k+1,n);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter no of t");
		Scanner scan=new Scanner(System.in);
       int t=Integer.parseInt(scan.nextLine());
       
  for(int i=0;i<t;i++){
	  String str=scan.nextLine();
	  //StringBuffer sb=new StringBuffer(str);
	  permutaion(str, 1,str.length());
  }
		
	}

}

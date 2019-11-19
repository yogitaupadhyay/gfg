package sis.com;

import java.util.Scanner;

public class ReverseStringIterative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter String");
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		String strrev="";
		
		for(int i=str.length()-1;i>=0;i--){
			strrev=strrev+str.charAt(i);
					
		}
			
		System.out.println(strrev);
		

	}

}

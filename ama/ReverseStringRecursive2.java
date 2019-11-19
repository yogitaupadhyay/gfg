package sis.com;

import java.util.Scanner;

public class ReverseStringRecursive2 {
  static  String reverse(String str){
    	if(str.length()<2){
    		return str;
    	}
    	return reverse(str.substring(1))+str.charAt(0);
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter String");
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		String strrev=reverse(str);
		
		
		System.out.println(strrev);
		

	}

}

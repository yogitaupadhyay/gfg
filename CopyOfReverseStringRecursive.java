package sis.com;

import java.util.Scanner;

public class CopyOfReverseStringRecursive {
  static  String reverse(String output,String input,int i){
    	if(output.length()==input.length()){
    		return output;
    	}
    	output=input.charAt(i)+output;
    	return reverse(output, input, i+1);
    	
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter String");
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		String strrev=reverse("", str, 0);
		
		
		System.out.println(strrev);
		

	}

}

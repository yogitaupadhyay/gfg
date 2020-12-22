/*
@Author:NIT DEV2
 */

  //Date  10/01/2019
 public class XDemo3{

	public static void main(String args[]){
	
	  java.util.Scanner scan  = new java.util.Scanner(System.in);

		try{
			  int a;
			  int b;
			  System.out.println("enter two in  number");
			  a = scan.nextInt();
			  b = scan.nextInt();
			  X ob  = new X();
			  int r1 = ob.div2(a,b);
			  System.out.println("div=" +r1);
	  }catch(ArithmeticException e){
	      System.out.println("Error : " + e.getMessage());
	  }
	  
	  
	  
	  System.out.println("Happy Ending...");
	  
	}//end main

}//end class
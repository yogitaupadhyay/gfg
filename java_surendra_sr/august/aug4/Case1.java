

  //Date  04/08/2018
 public class Case1 {

	public static void main(String args[]) throws Exception{
	 
	 java.util.Scanner scan  = new java.util.Scanner(System.in);
	 String name;
	 boolean isEngineer;
	 System.out.println("enter your name");
	 name  = scan.nextLine();
	 System.out.println("are you engineer ? true/false");
	 isEngineer  = scan.nextBoolean();
	 
	 
	 
	 System.out.println("hello user " + name);
	 
	 if(isEngineer==true){
		System.out.println("You are Engineer and Creator");
	 }
	  System.out.println("Have a good day! :) ");
	  
	  
	  
	}//end main

}//end class
/*
@Author:Surendra Kumar Sao
	>>Software Architect and Corporate Trainer
	>>+9 year exp in (mumbai,pune,hyd,bangaluru)
	>>Java Certified SCJP & SCWCD with 98%
	Trained more than 5k students and employees.
    MCA from (NIT)National Institute of Technology Raipur(C.G.)
	Email : sur.nit.mca@gmail.com
	Mobile 7987234544, 9009442844
	https://www.urbanpro.com/raipur/surendra-kumar-sao/reviews/7223178
	https://www.urbanpro.com/raipur/surendra-kumar-sao/1334109?_tp=
 */

  //Date  16/09/2018
 public class Greet2 {

	public static void main(String args[]){
	  String sisPassword="sis123";
	  String userPassword ;
	  //  java.util.Scanner scan  = new java.util.Scanner(System.in);
		java.io.Console con  = System.console();
		
		System.out.print("enter your password >> ");
	  //userPassword = scan.nextLine();
	  char [] arrPass = con.readPassword();
	  
	  userPassword = new String(arrPass);
	  
	  
	  if(sisPassword.equals(userPassword) ==false){
	    System.out.println("invalid password");
	    return;//main end 
	  }
	  
	
	
	
System.out.println("+++++++++++++++++++++++++++++++++");	
	  System.out.println("Welcome to Sis");
System.out.println("+++++++++++++++++++++++++++++++++");	
	  
	}//end main

}//end class
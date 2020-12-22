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

  //Date  01/09/2018
 public class SpeDemo1 {

	public static void main(String args[]){
	
	  // java.util.Scanner scan  = new java.util.Scanner(System.in);
	  java.io.Console  con  = System.console();
	   String str1; 
	   String str2;
	   //first part
	   System.out.print("enter your first word>>");
	     str1  = con.readLine();
	   //2 part
	   
	   System.out.print("enter your second word>>");
	   char [] temp  = con.readPassword();
	   str2  = new String(temp);
	   
	   System.out.println("++++++++++++++++++++++++++++");
	   System.out.println("your first word is " + str1);
	   System.out.println("your second word is " + str2);
	   
	   
	   
	   
	  
	}//end main

}//end class
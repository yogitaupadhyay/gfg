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
 public class ConsoleTest {

	public static void main(String args[]){
	 //java.io.Console con  =  new  java.io.Console();
	 java.io.Console con  =  System.console();
	 
	 System.out.println("enter your name");
	 
	 String name  =con.readLine();
	 
	 System.out.println("enter your password");
	 
	 char [] passArr  =   con.readPassword();
	 
 
	  
	}//end main

}//end class
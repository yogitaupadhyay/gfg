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

  //Date  20/10/2018
  import java.io.Console;
  import java.util.Date;
  //import java.util.*;
  //import java.sql.*;
  
 public class Test1 {

	public static void main(String args[]){
	
	 // java.util.Date  d1  = new 	  java.util.Date();
	    Date  d1  = new 	Date();
	  System.out.println(d1);
	   //java.io.Console con  = System.console();
	   Console con  = System.console();
	   System.out.println("enter your password");
	   char []arrPassword   = con.readPassword();
	   String password = new String(arrPassword);
	   
	   System.out.println("your password is " + password);
	   
	   
	   
	  
	}//end main

}//end class
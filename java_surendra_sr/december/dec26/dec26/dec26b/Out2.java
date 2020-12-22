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

  //Date  26/12/2018
  import java.util.*;
  
 public class Out2 {

	public static void main(String args[]){
	 
	Integer intRer  = new Integer(100);
	System.out.println( intRer);//100
	
	SisInteger sisIntRer  = new SisInteger(300);
	System.out.println( sisIntRer);//SisInteger@hexcode
	
	System.out.println("++++++++++++++++++++++++");
	
	String strRef  = new String("I Will Success");
	System.out.println(strRef);
	
	SisString sisStrRef  = new SisString("I Will Success");
	System.out.println(sisStrRef);//SisString@hexcode
	
	 System.out.println("++++++++++++++++++++++++");
	  Date d1  = new Date();
     System.out.println(d1);	  
	 Ball b1  = new Ball();
     System.out.println(b1);	  
	 Ball b2  = new Ball("pink","nit",1000,150);
	 System.out.println(b2);
	 
	  
	  System.out.println("++++++++++++++++++++");
	  
	  java.util.Scanner scan  = new java.util.Scanner(System.in);
	  java.util.Random rand  = new java.util.Random();
	  System.out.println(scan);
	  System.out.println(rand);
	  
	  
	  
	}//end main

}//end class
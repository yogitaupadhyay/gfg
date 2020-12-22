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

  //Date  20/08/2018
 public class Palindrom2 {

	public static void main(String args[]){
	java.util.Scanner scan  = new java.util.Scanner(System.in);
	 System.out.println("enter your Word to check Palindrom or not");
	   String str =scan.nextLine();
	   
	   StringBuffer sb  = new StringBuffer(str);
	   sb.reverse();
	   String rev=sb.toString();
	    
	   System.out.println("original string " + str);
	   System.out.println("reverse string " + rev);
	   
	   System.out.println(str.equals(rev) ? "Palindrom " : "NOT Palindrom");
	    
	  
	}//end main

}//end class
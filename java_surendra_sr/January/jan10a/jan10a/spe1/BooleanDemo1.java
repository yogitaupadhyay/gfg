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

  //Date  10/01/2019
 public class BooleanDemo1 {

	public static void main(String args[]){
	   
	    java.util.Scanner scan  = new java.util.Scanner(System.in);
		
		System.out.println("are your happy true/false");
		String str  = scan.nextLine();
		
		Boolean isHappy   =   Boolean.parseBoolean(str);
		
		System.out.println("+++++++++++++++++++++++++++++++++++");
		System.out.println(isHappy?"You are happy " : "You are now not happy");
		System.out.println("+++++++++++++++++++++++++++++++++++");
		System.out.println("Happy Ending...");
		
	  
	}//end main

}//end class
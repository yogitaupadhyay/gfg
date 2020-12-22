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

  //Date  08/01/2019
 public class Req1 {

	public static void main(String args[]){
	  java.util.Scanner scan  = new java.util.Scanner(System.in);
	  
	  Integer num  = null;
	  try{
	  System.out.println("Enter number");
	  num  = scan.nextInt();
	  }catch(java.util.InputMismatchException e){
	    System.out.println("invalid input : its not integer number");
	  }
	  
	  
	  System.out.println("your number is "+num);
	  
	  
	}//end main

}//end class
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

  //Date  30/07/2018
 public class InputDemo2 {

	public static void main(String args[]){
	 
	  java.util.Scanner scan  = new java.util.Scanner(System.in);
	 
	 String name;
	 int age;
	 float weight;
	 boolean isHappy;
	 
	 System.out.println("enter your name");
	 name  = scan.next();
	 
	System.out.println("enter your age");	 
	age  = scan.nextInt();
	
	System.out.println("enter your weight");	 
	weight  = scan.nextFloat();
		
	  System.out.println("are you happy ??true/false ");
	  isHappy = scan.nextBoolean();
	  
	  
	  System.out.println("+++++++++++++++++++++++++");
	  System.out.println(name);
	  System.out.println(age);
	  System.out.println(weight);
	  System.out.println(isHappy);
	  
	  
	  
	}//end main

}//end class
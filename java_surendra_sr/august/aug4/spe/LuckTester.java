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

  //Date  04/08/2018
 public class LuckTester {

	public static void main(String args[]){
	
	
	final int GENERATED_LUCK_NUMBER ;
	GENERATED_LUCK_NUMBER = (int)(Math.random()*100);
	
	java.util.Scanner scan  = new java.util.Scanner(System.in);
	int userLuckNumber;
	System.out.println("user enter your luck number to test it[ 0-99]");
	userLuckNumber = scan.nextInt();
	
	if(GENERATED_LUCK_NUMBER==userLuckNumber){
	
	   System.out.println("You  are Luck ,NO Need to Do anything ....");
	}else{
	    System.out.println("Don't believe on  luck");
		System.out.println("work on  you skill and career");
		System.out.println("all the best !");
	}
	   
	   System.out.println("*************************************************************");
	  System.out.println("Luck NUmber WAS  " + GENERATED_LUCK_NUMBER); 
	   System.out.println("*************************************************************");
	  
	}//end main

}//end class
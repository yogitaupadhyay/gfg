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

  //Date  19/08/2018
 public class Demo2 {

	public static void main(String args[]){
	
	java.util.Random rand  = new java.util.Random();
	
	   for(int task=1;task<=100;task++){
			  System.out.printf("%4d",rand.nextInt(101));
			  if(task%10==0){
			    System.out.print("\n");
			  }
			  
	   }//loop task

System.out.println("+++++++++++++++++++++++");

	   for(int task=101;task<=200;task++){
			  System.out.printf("%4s","*");
			  if(task%10==0){
			    System.out.print("\n");
			  }
			  
	   }//loop task

	   
	}//end main

}//end class
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

  //Date  14/12/2018
 public class BallDemo2 {

	public static void main(String args[]){
	
	  Ball b1   = new Ball();
	  Ball b2   = new Ball();
	  Ball b3   = new Ball();
	  System.out.println("+++++++++++++++++++++++++++++");
	  Ball b4   = new Ball("Green");
	  Ball b5   = new Ball("Blue");
	  System.out.println("+++++++++++++++++++++++++++++");
	  
	  	  Ball b6   = new Ball("yellow","glash",200);
	      Ball b7   = new Ball("lime","steel",250);
		
		System.out.println("_________________________________");
	 b1.showDetails();
	 b2.showDetails();
	 b3.showDetails();
		System.out.println("_________________________________");
	 b4.showDetails();
	 b5.showDetails();
		System.out.println("_________________________________");
	 b6.showDetails();
	 b7.showDetails();
	 
	  
	  
	}//end main

}//end class
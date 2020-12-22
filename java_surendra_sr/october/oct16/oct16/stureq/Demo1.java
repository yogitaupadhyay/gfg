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

  //Date  16/10/2018
 public class Demo1 {

	public static void main(String args[]){
	
	  Trainer javaTrainer  = new Trainer();
	  
	  Ball sirGivenBall1  = javaTrainer.getBall();
	  Ball sirGivenBall2  = javaTrainer.getBall();
	  System.out.println(sirGivenBall1);
	  System.out.println(sirGivenBall2);
	  System.out.println("++++++++++++++++++");
	  
	  
	  sirGivenBall1.roll();
	  System.out.println("++++++++++++++++++");
	  sirGivenBall2.bounce();
	  
	  
	  
	  
	  
	}//end main

}//end class
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
 public class Time {

	public static void main(String args[]) throws Exception{
	java.util.Date now   = new java.util.Date();
	  System.out.println(now);
	  
	  System.out.println(System.currentTimeMillis() +"ms");
	  System.out.println(System.nanoTime() +"ns");
	 
	 Thread.sleep(1000);
	  now   = new java.util.Date();
	  System.out.println(now);
	  System.out.println(System.currentTimeMillis() +"ms");
	  System.out.println(System.nanoTime() +"ns");
	 
	}//end main

}//end class
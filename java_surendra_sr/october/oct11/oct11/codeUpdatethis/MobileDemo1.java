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

  //Date  11/10/2018
 public class MobileDemo1 {

	public static void main(String args[]){
	
	  Mobile m1  = new Mobile();
	  Mobile m2  = new Mobile();
	  
	  System.out.println(m1);
	  System.out.println(m2);
	  
	  m1.showDetails();
	  m2.showDetails();
	  
	  System.out.println("_________________________");
	  m1.update("white", 70000);
	  m2.update("black", 75000);
	  
	  m1.showDetails();
	  m2.showDetails();
	  
	  
	  
	}//end main

}//end class
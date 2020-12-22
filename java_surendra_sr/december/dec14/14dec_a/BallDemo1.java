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
 public class BallDemo1 {

	public static void main(String args[]){
	
	  Ball b1  = null;
	    b1  = new Ball();
		
		
	  System.out.println(b1.getColor());
	  System.out.println(b1.getPrice());
	  System.out.println(b1.getType());
	  System.out.println(b1.getWeight());
	  
	  b1.setColor("red");
	  b1.setPrice(150);
	  b1.setType("plastic");
	  b1.setWeight(100);
	  
	  System.out.println("++++++++++++++++++++++++++++++");
	  
	  
	  System.out.println(b1.getColor());
	  System.out.println(b1.getPrice());
	  System.out.println(b1.getType());
	  System.out.println(b1.getWeight());
	  
	  
	}//end main

}//end class
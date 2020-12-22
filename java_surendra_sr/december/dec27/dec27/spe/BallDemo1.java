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

  //Date  27/12/2018
 public class BallDemo1 {

	public static void main(String args[]){
	
	  Ball b1  = new Ball("red","sis",100,150);
	  
	  Ball b2  = new Ball("red","nit",170,350);
	  Ball b3  = new Ball("green","nit",150,180);
	  Ball b4  = new Ball("red","sis",100,150);
	  Ball b5  =b1;
	  
	  System.out.println("b1 = " + b1.toString());
	  System.out.println("b2 = " + b2.toString());
	  System.out.println("b3 = " + b3.toString());
	  System.out.println("b4 = " + b4.toString());
	  System.out.println("b5 = " + b5.toString());
	  
	   System.out.println("b1.equals(b2) "  + b1.equals(b2) );//f
	   System.out.println("b1.equals(b3) "  + b1.equals(b3) );//f
	   System.out.println("b1.equals(b4) "  + b1.equals(b4) );//f
	   System.out.println("b1.equals(b4) "  + b1.equals(b5) );//T
	  
	  System.out.println("+++++++++++++++");
	  java.util.Random rand  = new java.util.Random();
	   System.out.println("b1.equals(null) "  + b1.equals(null) );//f
	   System.out.println("b1.equals(rand) "  + b1.equals(rand) );//f
	  
	}//end main

}//end class
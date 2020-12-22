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
 public class EqualDemo {

	public static void main(String args[]){
	
	  Ball b1  = new Ball("red","sis",100,150);
	  Ball b2  = new Ball("red","sis",100,150);
	  
	  SisInteger sisIntObj1  = new SisInteger(100);
	  SisInteger sisIntObj2  = new SisInteger(100);
	  
	  SisString sisStrObj1  = new SisString("happy");
	  SisString sisStrObj2  = new SisString("happy");
	  
	System.out.println("_______________________________________________");  
	  System.out.println("b1 = " + b1.toString());
	  System.out.println("b2 = " + b2.toString());
	  System.out.println("b1.equals(b2) "  + b1.equals(b2) );//false
	  
	System.out.println("_______________________________________________");  
	System.out.println("sisIntObj1 = " + sisIntObj1.toString());
	System.out.println("sisIntObj2 = " + sisIntObj2.toString());
	System.out.println("sisIntObj1.equals(sisIntObj2) "  + sisIntObj1.equals(sisIntObj2) );//false
	
	System.out.println("_______________________________________________");  
	System.out.println("sisStrObj1 = " + sisStrObj1.toString());
	System.out.println("sisStrObj2 = " + sisStrObj2.toString());
	System.out.println("sisStrObj1.equals(sisStrObj2) "  + sisStrObj1.equals(sisStrObj2) );//false
	
	}//end main

}//end class
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
 public class CowDemo1 {

	public static void main(String args[]){
	
	   Cow c1  = new Cow();
	     c1.name="rani";
		 c1.color="black";
		 c1.weight=200;
		
	   Cow c2  = new Cow("white","ganga",250);
	      c2.totalHorn=2;
     	
        c1.aboutMyCowObject();
        c2.aboutMyCowObject();
		System.out.println("+++++++++++++++++++++++");
		c1.eat();
		c2.eat();
		System.out.println("+++++++++++++++++++++++");
		c1.walk();
		c2.walk();
		 System.out.println("**************************");
		 
		 System.out.println(c1.name);
		 System.out.println(c2.name);
		 
		 System.out.println(c1.totalCow);
		 System.out.println(c2.totalCow);
		 System.out.println(Cow.totalCow);
	  
	  
	   System.out.println("+++++++++++++++++++");
	   
	   c1.aboutCow();
	   c2.aboutCow();
	   Cow.aboutCow();
	  
	}//end main

}//end class
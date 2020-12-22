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

  //Date  21/12/2018
 public class Child extends  Parent{ 

 
 
 
   void playVideoGame(){
    System.out.println("palying game " +this);
   }
 
   void developSoftware(){
    System.out.println("developSoftware   " +this);
   }
 
 //override
 void getMarry(){
       System.out.println("+++++++++++++++marry style"+this+"++++++++++++++++++");
     System.out.println("marry with only seen and educated");
	 System.out.println("DJ Chhahiye......");
    
 }
 
 void invalidAction(){
       badHabit1();
       badHabit2();
 }
 
 
 
 /*
 compile time error
 //override
 void greet(){
   System.out.println(" greet with Hi   and bye ");
 }
 */
 
 }//End of class 

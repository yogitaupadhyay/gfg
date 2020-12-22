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
 public class X{ 
     int a;
	 int b;
	 static int c;
	 static int d;
	 
	 void m1(){
	 }
	 void m2(){
	   System.out.println(a);
	   System.out.println(b);
	   System.out.println(c);
	   System.out.println(d);
	   m1();
	   m3();
	   m4();
	 
	 }
	 
	 static void m3(){
	 }
	 
	 
	 static void m4(){
	   System.out.println(a);//ERROR  CTE 
	   System.out.println(b);//ERROR  CTE 
	   m1();//ERROR  CTE 
	   m2();//ERROR  CTE 
	   
	   System.out.println(c);//OK
	   System.out.println(d);//OK
	    m3();//OK
	 }
	 
	 
	 
	 
	 
	 
  
  
  
  
  
  
  
 }//End of class 

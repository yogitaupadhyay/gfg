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
	System.out.println("main started......");
	   X  xob=null;
	   
	  //NPE  System.out.println(xob.a);//ERROR 
	   System.out.println(xob.b);//OK
	   System.out.println(X.b);//OK  //ClassName.staticVariable
	  
	  //NPE xob.m1();//ERROR
	  xob.m2();//OK
	  X.m2();//OK
	  
	  System.out.println("++++++++++++++++++++++++++++++");
	  xob =new X();
	  
	   System.out.println(xob.a);
	   System.out.println(xob.b);
	   xob.m1();
	   xob.m2();
	  
	  
	  
	  
	}//end main

}//end class
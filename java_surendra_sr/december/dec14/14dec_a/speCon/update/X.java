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
 public class X{ 
 int a;
 int b;
 int c;
 int d;
 int e;
 
 
 public X(int a){
       this.a=a;
	   System.out.println(this  +" 1 arg constructor called ");
 }
 
 
 public X(int a, int b){
       this.a=a;
       this.b=b;
	   System.out.println(this  +" 2 arg constructor called ");
 }
 
 
 public X(int a, int b, int c){
      this(a,b);
       /*this.a=a;
       this.b=b;*/
       this.c=c;
	   System.out.println(this  +" 3 arg constructor called ");
 }
 
 public X(int a, int b, int c,int d,int e){
    this(a,b,c);
 /*      this.a=a;
       this.b=b;
       this.c=c;*/
       this.d=d;
       this.e=e;
	   System.out.println(this  +" 5 arg constructor called ");
 }
 
 
 
 
 
 void show(){
 System.out.println("+++++++++++++++++++++++");
    System.out.println(this + " details");
	 System.out.println("a " + a);
	 System.out.println("b " + b);
	 System.out.println("c " + c);
	 System.out.println("d " + d);
	 System.out.println("e " + e);
 System.out.println("+++++++++++++++++++++++");
	 
 }
 
 
 
 }//End of class 

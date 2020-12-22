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
 public class Demo1 {

	public static void main(String args[]){
	
	   int a  = 10;
	   //how to conver primitive to object
	   Integer ref  =new Integer(a);
	   
	   System.out.println("a = " + a);
	   System.out.println("ref= " + ref);
	   
	   byte b  = ref.byteValue();
	   float c  = ref.floatValue();
	   double d  = ref.doubleValue();
	   System.out.println(b);
	   System.out.println(c);
	   System.out.println(d);
	   
	   
	  
	}//end main

}//end class
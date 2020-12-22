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
 public class XDemo1 {

	public static void main(String args[]){
	
	 X o1 = new X();
	 X o2 = new X();
	 X o3 = new X();
	 
	 System.out.println(o1+  " detals  ");
	   o1.show();
	 System.out.println(o2+  " detals  ");
	   o2.show();
	 System.out.println(o3+  " detals  ");
	   o3.show();
	 
	 
	  o1.update1(10,20);
	  o2.update2(10,20);
	  o3.update3(10,20);
	 
	 System.out.println("after update ++++++++++++++++++++");
	 
	 
	 
	 	 System.out.println(o1+  " detals  ");
	   o1.show();
	 System.out.println(o2+  " detals  ");
	   o2.show();
	 System.out.println(o3+  " detals  ");
	   o3.show();

	}//end main

}//end class
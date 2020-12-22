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
 public class Demo1 {

	public static void main(String args[]){
	
	 //CTE Table t1  = new Table();
	  Table t1  = new Table("brown","wood",4);
	 System.out.println(t1);
	 t1.info();
 

  System.out.println("++++++++set price and brand name++++++++++++++++++++");	 
	 
	 t1.setPrice(400);
	 t1.setBrandName("NilKamal");
	 t1.info();
	 
	  
	 
	}//end main

}//end class
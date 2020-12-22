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
	
	 Table t1  = new Table();
	 System.out.println(t1);
	 t1.info();
	 t1.setColor("red");
	 t1.setPrice(400);
	 t1.setNumberOfLegs(4);
	 t1.setMadeOf("steel");
	 t1.setBrandName("NilKamal");
  System.out.println("++++++++++++++++++++++++++++");	 
	 t1.info();
	 
	 System.out.println("++++++++++++++++++++++++++++");	 
	 
	 t1.fold();
	 t1.unFold();
	 
	}//end main

}//end class
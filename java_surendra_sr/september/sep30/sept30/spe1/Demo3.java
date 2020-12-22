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

  //Date  30/09/2018
 public class Demo3 {

	public static void main(String args[]){
	
	 Bulb myBulb =  new Bulb();

  //set values
  myBulb.brandName="bajaj";
  myBulb.price=150;
  myBulb.lightColor="white";
  myBulb.isOn =true;
  myBulb.walt=100;
  
  
	System.out.println("++++++++++after update values+++++++++++");
  
  System.out.println("brand name " + myBulb.brandName);
  System.out.println("price " + myBulb.price);
  System.out.println("light color = " +myBulb.lightColor);
  System.out.println("is bulb on ? " +myBulb.isOn);
  System.out.println("how many walt  ? " + myBulb.walt);
   
System.out.println("+++++++++++++++++++++++++++++++");

   myBulb.on();
   System.out.println("is bulb on ? " +myBulb.isOn);
   myBulb.off();
   System.out.println("is bulb on ? " +myBulb.isOn);
	 
	  
	}//end main

}//end class
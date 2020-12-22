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
 public class Demo2 {

	public static void main(String args[]){
	
	   Bulb b1  = new Bulb();
	   Bulb b2 = new Bulb();
	   
	   System.out.println("b1 = " + b1);
	   System.out.println("b2  = " + b2);
	   
			b1.brandName="bajaj";
			b1.price=150;
			b1.lightColor="white";
			b1.isOn =true;
			b1.walt=100;
	   
	   		b2.brandName="surya";
			b2.price=100;
			b2.lightColor="yellow";
			b2.isOn =true;
			b2.walt=40;

	   
	   System.out.println("bulb1 details ");
	   
  System.out.println("brand name " + b1.brandName);
  System.out.println("price " + b1.price);
  System.out.println("light color = " +b1.lightColor);
  System.out.println("is bulb on ? " +b1.isOn);
  System.out.println("how many walt  ? " + b1.walt);
   
	   System.out.println("+++++++++++++++++++++++++++");
	   
 System.out.println("bulb2 details ");
	   
  System.out.println("brand name " + b2.brandName);
  System.out.println("price " + b2.price);
  System.out.println("light color = " +b2.lightColor);
  System.out.println("is bulb on ? " +b2.isOn);
  System.out.println("how many walt  ? " + b2.walt);
   
	   
	   
	  
	}//end main

}//end class
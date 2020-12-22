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

  //Date  19/12/2018
 public class STvDemo2 {

	public static void main(String args[]){
	
	SmartTv t1  = new SmartTv();
	t1.price=50000;
	t1.brandName="LG";
	
 t1.on();
 System.out.println("____________________");
 t1.show();
 System.out.println("____________________");
 t1.volumeUp();
 t1.volumeUp();
 t1.volumeUp();
 System.out.println("____________________");
 t1.volumeDown();
 System.out.println("____________________");
 t1.details();
 System.out.println("____________________");
System.out.println("*************************************************");
t1.usbConnect();
t1.usbDisConnect();


t1.gameOption();


System.out.println("*************************************************");
 t1.off();
	
	
	  
	}//end main

}//end class
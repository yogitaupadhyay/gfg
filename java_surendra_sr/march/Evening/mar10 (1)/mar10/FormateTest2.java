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

  //Date  10/03/2019
  
  import java.text.*;
 public class FormateTest2{

	public static void main(String args[]){
	
	   java.util.Date d1  = new java.util.Date();
	   
	   
	  SimpleDateFormat sdf  =null;
	  sdf  = new  SimpleDateFormat("yyyy-dd-MM");
	  System.out.println(sdf.format(d1));
	  
	  sdf  = new  SimpleDateFormat("dd/MM/yyyy");
	  System.out.println(sdf.format(d1));

	  sdf.applyPattern("EEE");
	  
	  System.out.println(sdf.format(d1));
    	 sdf.applyPattern("EEEE");
	  System.out.println(sdf.format(d1));
System.out.println("________________");
	  sdf.applyPattern("EEE dd-MMM-yyyy");
	  System.out.println(sdf.format(d1));
	  
System.out.println("________________");
	  sdf.applyPattern("EEEE dd-MMMM-yyyy");
	  System.out.println(sdf.format(d1));
	}//end main

}//end class
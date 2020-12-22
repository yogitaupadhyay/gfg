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
 public class FormateTest {

	public static void main(String args[]){
	
	   java.util.Date d1  = new java.util.Date();
	   java.util.Date d2  = new java.util.Date(System.currentTimeMillis());
	   System.out.println(d1);
	   System.out.println(d2);
	   System.out.println("____________________________");
	   long t1Ms = d1.getTime();
	   long t2Ms = d2.getTime();
	   System.out.println(t1Ms);
	   System.out.println(t2Ms);
	   System.out.println("____________________________");
	   
	   //long to sql date
	   java.sql.Date sd1  = new java.sql.Date(System.currentTimeMillis());
	   //date-to_long   to sql Date
	   java.sql.Date sd2  = new java.sql.Date(d1.getTime());
	  
	  System.out.println(sd1);
	  System.out.println(sd2);
	   System.out.println("____________________________");
	   java.sql.Timestamp sts1  = new java.sql.Timestamp(System.currentTimeMillis());
	   java.sql.Timestamp sts2  = new java.sql.Timestamp(d1.getTime());
	   
	   System.out.println(sts1);
	   System.out.println(sts2);
	   System.out.println("____________________________");
	   
	}//end main

}//end class
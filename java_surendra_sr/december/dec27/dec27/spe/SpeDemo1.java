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
 public class SpeDemo1 {

	public static void main(String args[]){
	
	 Integer      jIntOb1  =  new Integer(100);
	 Integer      jIntOb2  =  new Integer(200);
	 Integer      jIntOb3  =  new Integer(100);
	 System.out.println("jIntOj1 " +jIntOb1); //100
	 System.out.println("jIntOj2 " +jIntOb2);//200
	 System.out.println("jIntOj3 " +jIntOb3);//100
	 System.out.println("jIntOj1.equals(jIntOb2) "  + jIntOb1.equals(jIntOb2) );//F	  
	  System.out.println("jIntOj1.equals(jIntOb3) "  + jIntOb1.equals(jIntOb3) )	;//T

System.out.println("+++++++++++++++++++++++++++++++++++++");
	 SisInteger sIntOb1  = new SisInteger(100);
	 SisInteger sIntOb2 = new SisInteger(200);
	 SisInteger sIntOb3 = new SisInteger(100);
	  System.out.println("sIntOj1 " +sIntOb1); //100
	 System.out.println("sIntOj2 " +sIntOb2);//200
	 System.out.println("sIntOj3 " +sIntOb3);//100
	 System.out.println("sIntOj1.equals(sIntOb2) "  +sIntOb1.equals(sIntOb2) );//F	  
	  System.out.println("sIntOj1.equals(sIntOb3) "  +sIntOb1.equals(sIntOb3) )	;//T

	   
	}//end main

}//end class
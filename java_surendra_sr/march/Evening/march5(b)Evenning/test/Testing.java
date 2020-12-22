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

  //Date  06/03/2019
 public class Testing {

	public static void main(String args[])throws Exception{
			
	String strClass = args[0];		
	Class c =  Class.forName(strClass);		
	 
      	 
	  SisDevice d  =  (SisDevice)c.newInstance();
	  d.open();
	  d.close();
	  
	  
	}//end main

}//end class
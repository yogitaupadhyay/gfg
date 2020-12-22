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

  //Date  01/09/2018
  import java.util.Arrays;
 public class Req5 {

	public static void main(String args[]){
	
		 boolean [] att = new boolean[25];

		 
		 /*
		 for(int stu=1;stu<=att.length;stu++){
			att[stu-1] = true;
		 }*/

		 Arrays.fill(att,true);
		 
		 for(int stu=1;stu<=att.length;stu++){
		  boolean result  = att[stu-1];
		  //System.out.println("sno" + stu   +" attend  " + result);
		  System.out.println("sno" + stu   +" attend  " + (result?"Yes":"No"));
		 }
		 
		 
		
		
		
		
	  
	}//end main

}//end class
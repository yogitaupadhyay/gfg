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

  //Date  20/08/2018
 public class SpeCase {

	public static void main(String args[]){
	
	  long startTime  = System.currentTimeMillis();
	   String str="";
	  for(int n=1;n<=2;n++){
	       str  = str+ (int)(Math.random()*100) +" "; 
	  }
	  long endTime  = System.currentTimeMillis();
	  System.out.println("total time " + (endTime-startTime));
	  System.out.println(str);
	  
	  
	  
	}//end main

}//end class
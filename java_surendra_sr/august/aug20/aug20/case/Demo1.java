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
 public class Demo1 {

	public static void main(String args[]){
	
	   String str ="ABCD";
	   String rev="";
	   
	   for(int pos=str.length();pos>=1;pos--){
	        char ch  = str.charAt(pos-1);
			//System.out.println( (pos-1) + "::" + pos  + " :" + ch);
	     rev= rev+ch;
	   }
	   
	   System.out.println("original string " + str);
	   System.out.println("reverse string " + rev);
	   
	   System.out.println(str.equals(rev));
	   
	   
	   
	   
	   
	  
	}//end main

}//end class
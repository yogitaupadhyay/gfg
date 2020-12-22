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

  //Date  02/09/2018
  import java.util.*;
 public class Cards {

	public static void main(String args[]){
	
	  String [] values ={
	   "2","3","4","5","6","7",  "8","9","10","J","Q","K","A"
	  };
	  
	  System.out.println(Arrays.toString(values));
	  java.util.Random rand  = new java.util.Random();
	  for(int c=1;c<=values.length;c++){
	        int pickIndex = rand.nextInt(values.length);// 13    0 12
			String temp  = values[c-1];
			values[c-1] = values[pickIndex];
			values[pickIndex] = temp;
	  }
	  
	  System.out.println("after suffle");
	  System.out.println(Arrays.toString(values));
	}//end main

}//end class
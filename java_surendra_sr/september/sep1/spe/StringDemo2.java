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
 public class StringDemo2 {

	public static void main(String args[]){
	
	char [] arr1={'j','a','v','a'};
	System.out.println(arr1.length);
	String str = "";
	for(int e=1;e<=arr1.length;e++){
	str  = str+arr1[e-1];
	}
	
	System.out.println(arr1);
	System.out.println("++++++++++++++++++");
	System.out.println(str);
	System.out.println(str.toUpperCase());
	
	System.out.println("++++++++++API+++++++++++");
	String str2  = new String(arr1);
	System.out.println(str2);
	System.out.println(str2.toUpperCase());
	
	
	  
	}//end main

}//end class
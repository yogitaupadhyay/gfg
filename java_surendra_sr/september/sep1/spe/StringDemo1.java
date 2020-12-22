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
 public class StringDemo1 {

	public static void main(String args[]){
	
	  //how to conver string to arr object
	  
	  String str  = new String("JAVA");
	  char []arr1 = new char[str.length()];
	  for(int e=1;e<=arr1.length;e++){
	    arr1[e-1] = str.charAt(e-1);
	  }
	  
	  System.out.println("str " + str);
	 System.out.println("+++++++++++++++++");
	  System.out.println("char"+ arr1);
	 System.out.println("+++++++++++++++++");
	  System.out.println( arr1);
	 System.out.println("+++++++++++++++++");
	 for(int e=1;e<=arr1.length;e++){
	   System.out.print(arr1[e-1]);
	  }
	  System.out.println();
	  
	  System.out.println("+++++++++API+++++++++++");
	  char []arr2 = str.toCharArray();
	  System.out.println(arr2.length);
	  System.out.println(arr2);
	  
	  
	  
	}//end main

}//end class
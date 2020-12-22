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

  //Date  16/09/2018
 public class SearchData {

	public static void main(String args[]){
	  
	  int [] list  = {66,77,44,11,22,33,55,88,99,9,45,232,65,7778,33,99};
	   
	   System.out.println(java.util.Arrays.toString(list));
	   
	   System.out.println("++++++++++++++++");
	   for(int value :list){
	    System.out.println(value);
	   }
	   
	   System.out.println("++++++++++++++++");
	   for(int e=1;e<=list.length;e++){
	     System.out.println("sno#"+e  +" = " + list[e-1]);
	   
	   }
	  
	  
	  System.out.println("++++++++++++++++++++++++++");
	  java.util.Scanner scan  = new java.util.Scanner(System.in);
	  System.out.println("which number you want to search ?");
	  int searchElement  = scan.nextInt();
	  
	   for(int e=1;e<=list.length;e++){
	      if(list[e-1] == searchElement){
		    System.out.println("element fount at " + e +" position");
			break;
		  }
	   
	   }
	  
	  
	  
	  
	  
	  
	  
	}//end main

}//end class
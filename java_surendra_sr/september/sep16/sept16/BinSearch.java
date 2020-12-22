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
 public class BinSearch {

	public static void main(String args[]){
	
	   int [] arr = {44,11,22,33,55,66,77,88,99};
	   
	   System.out.println(java.util.Arrays.toString(arr));
	   
	   java.util.Arrays.sort(arr);
	   System.out.println("after sorting......");
	   System.out.println(java.util.Arrays.toString(arr));
	   
	   System.out.println("++++++++++++++++++++++++");
	   System.out.println(java.util.Arrays.binarySearch(arr,1000));//
	   System.out.println(java.util.Arrays.binarySearch(arr,11));
	   System.out.println(java.util.Arrays.binarySearch(arr,44));
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	  
	}//end main

}//end class
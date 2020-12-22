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
 public class Req7 {

	public static void main(String args[]){
	 int arr1[] = {11,22,33,44,55,66};
    System.out.println(Arrays.toString(arr1));	 
	System.out.println("++++++++++++++++++++");
	
	long start1 = System.nanoTime();
	int []arr2  = Arrays.copyOf(arr1,arr1.length);//from 0 to 4      5
	long end1 = System.nanoTime();
	
	//int []arr2  = Arrays.copyOf(srcArr,size);//from 0 to 4      5
    System.out.println(Arrays.toString(arr2));	 
	
	System.out.println("++++++++++++++++++++");
	long start2 = System.nanoTime();
	
	int myarr[] = new int[arr1.length];
	for(int e=1;e<=arr1.length;e++){
	  myarr[e-1] = arr1[e-1];
	}
	long end2 = System.nanoTime();
	
	System.out.println("api " +(end1-start1));
	System.out.println("sis " +(end2-start2));
	
    System.out.println(Arrays.toString(myarr));	 
	
	}//end main

}//end class
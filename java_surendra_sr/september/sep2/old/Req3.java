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
 public class Req3 {

	public static void main(String args[]){
	
		int [] arr ={55,44,88,22,99,11,22,77};
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println(Arrays.binarySearch(arr,1000));
		System.out.println(Arrays.binarySearch(arr,55));
		System.out.println(Arrays.binarySearch(arr,33));
		
		Arrays.sort(arr);
		System.out.println("sort");
		System.out.println(Arrays.toString(arr));

		System.out.println(Arrays.binarySearch(arr,1000));
		System.out.println(Arrays.binarySearch(arr,55));
		System.out.println(Arrays.binarySearch(arr,33));
		
		
		/*
		java.util.Scanner scan  = new java.util.Scanner(System.in);
		System.out.println("enter search number");
		int searchNumber  = scan.nextInt();
		*/
		
		
		
	  
	}//end main

}//end class
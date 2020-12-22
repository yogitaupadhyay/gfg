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

  //Date  06/01/2019
 public class NumberDemo2 {

	public static void main(String args[]){
	  System.out.println("Happy Start");
	 java.util.Random rand  = new java.util.Random();
	 java.util.Scanner scan  = new java.util.Scanner(System.in);
	 
	 
	 //int requiredNumber = 5;;
	 int requiredNumber = Integer.MAX_VALUE;//2147483647 
	 
	 int arr[]  = new int[requiredNumber];
	 for(int e=1;e<=arr.length;e++){
	   arr[e-1]=rand.nextInt();
	 }
	 
	for(int e=1;e<=arr.length;e++){
				System.out.println("sno#"+e  +"  :  "  + arr[e-1]);
	 }
	 
	  System.out.println("Happy Ending");
	}//end main

}//end class
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
 public class Test1 {

	public static void main(String args[]){
	
	   int [][] arr  ={
							 {1,3,5,7,9},
							 {0,2,4,6,8,10,12},
							 {1,111,1111,11111,111111},
						};
	   
	   System.out.println("total series " + arr.length);
	   
	  for(int s=1;s<=arr.length;s++){
	   System.out.println("serie #"+s   +" total element  " + arr[s-1].length);
	   for(int n=1;n<=arr[s-1].length;n++){
	      System.out.println("sno"+n  +"  = " + arr[s-1][n-1]);
	   }
	   System.out.println("+++++++++++++++++++++++++++");
	   
	  }
	  
	  
	  
	}//end main

}//end class
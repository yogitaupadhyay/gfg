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

  //Date  12/09/2018
 public class Demo2 {

	public static void main(String args[])throws Exception{
	
     int [] arr  = {11,22,33,44,55,66,77};
	 java.util.Random rand  = new java.util.Random();
	 int pickIndex  = rand.nextInt(arr.length);// 0 - 6
	 int data  = arr[pickIndex];
	 System.out.println("your number is ");
	 int waitingTime  = rand.nextInt(10);
	 System.out.println("wait for " + waitingTime +" second");
	 Thread.sleep(waitingTime*1000);
	 System.out.println(data);
	 
	  
	}//end main

}//end class
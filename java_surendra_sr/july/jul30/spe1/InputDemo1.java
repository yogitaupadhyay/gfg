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

  //Date  30/07/2018
 public class InputDemo1 {

	public static void main(String args[]){
	
	 String inputData="1 ramesh 22 83.4 true ";
	 
	  java.util.Scanner scan  = new java.util.Scanner(inputData);
	 
	 byte id = scan.nextByte();
	 String name=scan.next();
	 int age=scan.nextInt();
	 float  per=scan.nextFloat();
	 boolean placed = scan.nextBoolean();
	 System.out.println("+++++++++++++++++++++++++++");
	 System.out.println(id);
	 System.out.println(name);
	 System.out.println(age);
	 System.out.println(per);
	 System.out.println(placed);
	 
	  
	}//end main

}//end class
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

  //Date  25/08/2018
 public class Demo1 {

	public static void main(String args[]){
	java.util.Random rand  = new java.util.Random;
	   String [] nameList = new String[rand.nextInt(6)+5];
	   
	   
	   System.out.println("total students " + nameList.length);
	   
	   java.util.Scanner scan  = new java.util.Scanner(System.in);
	   
	   for(int stu=1;stu<=nameList.length;stu++){
	    System.out.println("enter " +stu +"  name");
		String name  = scan.nextLine();
		nameList[stu-1] =name;
	   }
	   
	   System.out.println("++++++++++++++++++++++");
	   for(int stu=1;stu<=nameList.length;stu++){
	      System.out.println(stu +" = " + nameList[stu-1]);
	   
	   }
	   
	   
	   
	  
	}//end main

}//end class
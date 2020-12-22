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

  //Date  09/01/2019
 public class DynamicObjectCreationDemo0 {

	public static void main(String args[]) throws Exception{
	java.util.Scanner scan  = new java.util.Scanner(System.in);
	System.out.println("Which Class Object you want to Create");
	String className = scan.nextLine();
		Class c  = Class.forName(className);//ClassNotFoundException
		Object obj = c.newInstance();
	System.out.println("__________Happy Programming__________");
	
	
	
	
	
	
	
	
	
	   
	  
	}//end main

}//end class
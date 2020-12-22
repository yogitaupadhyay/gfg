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

//dynamic loading....

 public class LoadDemo3 {

	public static void main(String args[])throws Exception{
	  java.util.Scanner scan  = new java.util.Scanner(System.in);
	
	 
	  System.out.println("Which class you want to load for object creation");

	  String classNameStr = scan.nextLine();
		//1 load 
		Class c  = Class.forName(classNameStr);
		//2 create
	  Object obj  = c.newInstance();
	  
	  System.out.println(obj.toString());
	  
	  
	  
	}//end main

}//end class
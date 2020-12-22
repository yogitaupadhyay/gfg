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

 public class LoadDemo2 {

	public static void main(String args[])throws Exception{
	  java.util.Scanner scan  = new java.util.Scanner(System.in);
	
	  System.out.println("+++++++++++++++++++++++");
	   Apple a  = new Apple();
	  System.out.println("+++++++++++++++++++++++");
	  System.out.println("enter which Feature[Class] you want to load");
	  String classNameStr = scan.nextLine();
	  
	  Class c  = Class.forName(classNameStr);
	  
	  
	  
	}//end main

}//end class
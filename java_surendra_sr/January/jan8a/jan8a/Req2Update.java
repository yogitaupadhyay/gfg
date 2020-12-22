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

  //Date  08/01/2019
 public class Req2Update {

	public static void main(String args[]){
	   java.util.Scanner scan  = new java.util.Scanner(System.in);
	   
	   System.out.println("Enter your name");
		try{
	   String name = scan.nextLine();
	   
	  System.out.println(name);
	  System.out.println(name.toUpperCase());
	  System.out.println("total char" +name.length());
			System.out.println("3 position value  char  is " +name.charAt(3-1));
	  }catch(StringIndexOutOfBoundsException e){
	       System.out.println("3 positiong char not exist in your name ");
	  }catch(Exception e){
		System.out.println("Error : " + e.getMessage());
	  }	  

	  
	  System.out.println("happy ending");
	}//end main

}//end class
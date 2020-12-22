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

  //Date  28/12/2018
 public class SisAnimalApp {

	public static void main(String args[]) throws Exception{
	  java.util.Scanner scan  = new java.util.Scanner(System.in);
	  System.out.println("which Animal Object your want to Create");
	  String className = scan.nextLine();
	  
	  Class c  = Class.forName(className);
	  //create object
	  Object obj  =c.newInstance();
	  
	  if(obj instanceof Animal){
	     System.out.println("+++++++++++++++++++++++++++");
			Animal animal  =(Animal) obj;

			animal.eat();
			animal.sleep();
			animal.makeVoice();
	     System.out.println("+++++++++++++++++++++++++++");
	  }else{
	    System.out.println("given object not Animal " + obj.toString());
	  }
	  
	  
	  
	  
  	  
	  
	  
	  
	
  
	  
	}//end main

}//end class
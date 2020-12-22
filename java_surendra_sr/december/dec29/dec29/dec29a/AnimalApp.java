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

  //Date  29/12/2018
 public class AnimalApp {

	public static void main(String args[]) throws Exception{
	 System.out.println("++++++++++Sis Animal App Demo+++++++++++");
	java.util.Scanner scan  = new java.util.Scanner(System.in);
	System.out.println("Enter Animal Type");
		String type = scan.nextLine();
	Class c  = Class.forName(type);	
	Object obj  = c.newInstance();
	
	if(obj instanceof Animal){
	
	  Animal animal   = (Animal)obj;
     animal.eat();
	 animal.sleep();
	 animal.run();
	 animal.drink();
	 animal.makeSound();
	}else{
	  System.out.println(obj +" is  Not Animal Type");
	}

	
	}//end main

}//end class
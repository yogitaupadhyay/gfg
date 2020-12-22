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

  //Date  24/02/2019
  import java.util.*;
 public class DogDemo1Sol3 {

	public static void main(String args[]){
	
	    Dog d1  = new Dog("tiger");
	    Dog d2  = new Dog("romy");
	    Dog d3  = new Dog("seru");
	    Dog d4  = new Dog("tommy");
		
		
		
	   // ArrayList  dogList  = new	    ArrayList ();
	    ArrayList<Dog>  dogList  = new	    ArrayList <Dog>();
		
 
		dogList.add(d1);
		dogList.add(d2);
		dogList.add(d3);
		dogList.add(d4);
		
		System.out.println(dogList);
	 
		
		for(int dNo=1; dNo<=dogList.size();dNo++){
		  /*
		  Object obj  = dogList.get(dNo-1);
		  Dog dog  = (Dog)obj;
		  */
		  Dog dog  = dogList.get(dNo-1);
		  System.out.println( "sno "+dNo+"  ref = " +dog);
		   dog.bark();
		   dog.jump();
		   System.out.println("__________________");
		}
		
	  
	}//end main

}//end class
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

  //Date  30/09/2018
 public class HumanDemo1 {

	public static void main(String args[]){
	
	  Human myFriend1  = new Human();
	  System.out.println("myFriend1 "  + myFriend1);
	  
	  myFriend1.giveDetails();
	  
	  
	  //update info
	  myFriend1.color="fair";
	  myFriend1.name="ramesh";//"124"
	  myFriend1.age=22*12+6;
	  myFriend1.gender="male";
	  myFriend1.fit=true;
	  myFriend1.weight=56.4f;
	  
	  System.out.println("+++++++++++++++++++++++++");
	  System.out.println(myFriend1.name);
	  System.out.println( myFriend1.weight);
	  System.out.println( myFriend1.fit);
	  
	  System.out.println("++++++++++after update++++++++++++++++");
	  myFriend1.giveDetails();
	  
	  
	}//end main

}//end class
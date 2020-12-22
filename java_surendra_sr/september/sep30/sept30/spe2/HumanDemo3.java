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
 public class HumanDemo3 {

	public static void main(String args[]) throws Exception{
	
	  Human myFriend1  = new Human();
	  
	  myFriend1.name="ramesh";
	  myFriend1.age=22*12+6;
	  myFriend1.gender="male";
	  myFriend1.fit=true;
	  myFriend1.weight=56.4f;
	  System.out.println("i m going to get on number from " + myFriend1.name );
	  System.out.println("wait 5 second ");
	  
	  
	  double friendGiveNumber =  myFriend1.giveOneNumber();
	  
	  Thread.sleep(5000);
	  System.out.println("my friend given number is  " + friendGiveNumber);
	 
	  System.out.println("++++++++++++++++++++++++++++");
	String converedWord1  = myFriend1.converIntoWord(1);  
	String converedWord2  = myFriend1.converIntoWord(100);  
	
	System.out.println("1st word (1) " +converedWord1 );
	System.out.println("2nd word (100) " +converedWord2 );
	  
	  
	  
	  
	}//end main

}//end class
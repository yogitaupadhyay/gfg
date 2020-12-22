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

  //Date  18/10/2018
 public class Demo1 {

	public static void main(String args[]){
	
	   Sun  mySun = null;
	   Sun  chandaMama = null;
	   Sun  myFriendSun = null;
	   
	    
	      System.out.println("mySun  =" + mySun);
	      System.out.println("chandaMama  =" + chandaMama);
	      System.out.println("myFriendSun  =" + myFriendSun);
	   System.out.println("++++++++++++++++++++");
	  
    /*	  
	   mySun = new Sun();
	   chandaMama = new Sun();
	   myFriendSun = new Sun();
	 */  
	   
	   mySun =   Sun.getSun();
	   chandaMama = Sun.getSun();
	   myFriendSun = Sun.getSun();
	   
	      System.out.println("mySun  =" + mySun);
	      System.out.println("chandaMama  =" + chandaMama);
	      System.out.println("myFriendSun  =" + myFriendSun);
	  
	}//end main

}//end class
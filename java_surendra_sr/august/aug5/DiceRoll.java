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

  //Date  05/08/2018
 public class DiceRoll {

	public static void main(String args[]){
	
	    int tempNumber   = (int) ( Math.random() * 10);    //0-9
		tempNumber  = tempNumber%6  ;   // 0= 5
		int diceNumber  = tempNumber+1;
		
		
		System.out.println("your dice number is " + diceNumber);
		
		
		
	  
	}//end main

}//end class
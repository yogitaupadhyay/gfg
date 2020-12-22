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

  //Date  26/12/2018
 public class ToStringTest1 {

	public static void main(String args[]){
	
	  SisString sisStrRef  = new SisString("I Will Success");
	System.out.println(sisStrRef);//SisString@hexcode
	System.out.println(sisStrRef.toString());//SisString@hexcode
	
	  	SisInteger sisIntRer  = new SisInteger(300);
	System.out.println( sisIntRer);//SisInteger@hexcode
	System.out.println( sisIntRer.toString());//SisInteger@hexcode
	
	System.out.println("+++++++++++++++++++++++");
	 Ball myBall  = new Ball("pink","nit",1000,150);
	 System.out.println(myBall);
	 System.out.println(myBall.toString());
	
	}//end main

}//end class
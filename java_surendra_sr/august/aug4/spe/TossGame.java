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

  //Date  04/08/2018
 public class TossGame {

	public static void main(String args[]){
	
	 int temp  =   (int)(Math.random() *10)  ;   //0 -9
	 int tossNumber  = temp%2;   //0 1

	String coinFace;	
	if(tossNumber==1){
	   coinFace="Head";
	}else{
	   coinFace="Tail";
	
	}	

	
	//System.out.println(coinFace);
	java.util.Scanner scan  = new java.util.Scanner(System.in);
	System.out.println("choose your coin face   Head/Tail");
    String userInuput  = scan.nextLine();
	 if(coinFace.equalsIgnoreCase(userInuput)){
	  System.out.println("you WON THE MATCH");
	 }else{
	  System.out.println("you NOt WON");
	 
	 }
	

	 
	  
	}//end main

}//end class
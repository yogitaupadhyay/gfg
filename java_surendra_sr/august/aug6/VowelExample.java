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

  //Date  06/08/2018
 public class VowelExample {

	public static void main(String args[]){
	
	  java.util.Scanner scan  = new java.util.Scanner(System.in);
	  System.out.println("enter your alphabet");
	   String str  = scan.nextLine().toUpperCase();
	   char ch  = str.charAt(0);
	   if(ch=='A'){
			System.out.println("APPLE");
	   }else if(ch=='E'){
			System.out.println("Egg");
	   }else if(ch=='I'){
				System.out.println("Ice");
	   }else if(ch=='O'){
				System.out.println("Orange");
	   }else if(ch=='U'){
			System.out.println("Unique");
	   }else{
	     System.out.println("not vowel");
	   
	   }
	   
	   System.out.println("+++++++++++++++++++++++++");
	   
	   switch(ch){
	     case 'A': 
				System.out.println("APPLE");
		 break;
		 case 'E':	
				System.out.println("Egg");
		 break;
		 case 'I':
				System.out.println("Ice");
		 break;
		 case 'O':
					System.out.println("Orange");
		 break;
		 case 'U':
				System.out.println("Unique");
		 break;
		 
		 default :System.out.println("not vowel");
		 break;
	   
	   }//switch
	   
	   
	   
	   
	   
	}//end main

}//end class
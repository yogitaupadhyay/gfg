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
 public class Words {

	public static void main(String args[]){
	
	  java.util.Scanner scan  = new java.util.Scanner(System.in);
	 System.out.println("enter your word");
	  String  option = scan.nextLine();
	  
	  switch(option){
	  
		case "success":
		     System.out.println(" good service ");
		break;
		
	    case "happy": 
		  System.out.println(" role expert  money  important ");
		break;
			
		case "career": 
		  System.out.println("  high growth ");
		break;
				default  :   
		  System.out.println("invalid option");
		break;
	  }//eo switch
	  
	  
	  
	  
	}//end main

}//end class
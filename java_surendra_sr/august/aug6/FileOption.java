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
 public class FileOption {

	public static void main(String args[]){
	
	  java.util.Scanner scan  = new java.util.Scanner(System.in);
	  System.out.println("select your file option");
	  System.out.println("1:new 2:open  3:save 4:exit");
	  int option = scan.nextInt();
	  
	  switch(option){
	  
		case 1:
		     System.out.println("new file ");
			  //System.out.println("TODO"); 
			  
		break;
	    case 2: 
		  System.out.println("file Open");
		break;
			
		case 3: 
		  System.out.println(" file save");
		break;
	    case 4: 
		     System.out.println("exit ");
			System.exit(0);
		break;
			
		default  :   
		  System.out.println("invalid option");
		break;
	  }//eo switch
	  
	  
	  
	  
	}//end main

}//end class
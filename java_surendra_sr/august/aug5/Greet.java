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
 public class Greet {

	public static void main(String args[])throws Exception{
	
	  java.util.Scanner scan  = new java.util.Scanner(System.in);
	  
	  final String USER="nit";
	  final  String PASS_WORD="100%success";
	  
	  String loginId;
	  String loginPassword;
	  
	  System.out.print("enter login id>> ");
	  loginId = scan.nextLine();
	  
	  System.out.print("enter password >>");
	  loginPassword = scan.nextLine();
	  
	  boolean isLoginSuccess = false;
	  
	  if(USER.equals(loginId)){
					if(PASS_WORD.equals(loginPassword)){
					
					  isLoginSuccess =true;
	        }else{
			   System.out.println("invalid password");
			}
	  
	  }else{
	    System.out.println("invalid login id ");
	  }
	  
	  
	  if(isLoginSuccess==false){
	      //return ;
		  System.exit(0);
		  
	  }
	  
	  
	  //this below line must execute if login success
	  	  
	  System.out.println("+++++++++++++++++++++++++++++");
	  System.out.println("Loding......");
	  Thread.sleep(5000);
	  System.out.println("Welcome User " + USER);
	  System.out.println("+++++++++++++++++++++++++++++");
	  
	  
	  
	}//end main

}//end class
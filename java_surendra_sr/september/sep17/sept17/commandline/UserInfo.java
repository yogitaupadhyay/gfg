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

  //Date  17/09/2018
 public class UserInfo {

	public static void main(String args[]){
	
	if(args.length==0){
	  System.out.println("plz provide your name ");
	  System.out.println("example");
	  System.out.println("1 java UserInfo surendra");
	  System.out.println("2 java UserInfo surendra kumar ");
	  System.exit(0);
	}
	
	
	  String firstName="";
	  String lastName ="";
	  String fullName=null;
	  
	  if(args.length==2){
		  firstName =args[0];
		  lastName =args[1];
		  fullName = firstName +"_" + lastName;
	  }else{
		firstName =args[0];
		  fullName = firstName;
	  }
	  
	  
	  System.out.println("hello user " + fullName);
	  
	}//end main

}//end class
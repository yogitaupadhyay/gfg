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
 public class SisCalc {

	public static void main(String args[]){
	
	if(args.length<2){
	  System.out.println("must required 2 numbers");
	  System.exit(0);
	}
	 
	 String strNum1 = args[0];
	 String strNum2 = args[1];
	 System.out.println(strNum1 +strNum2);
	 System.out.println("++++++++++++++++++");
	/* int num1  = strNum1;
	 int num2  = strNum2;
	 */
	 int num1  = Integer.parseInt(strNum1);
	 int num2 = Integer.parseInt(strNum2);
	 
	 int sum = num1  + num2;
	 System.out.println("sum  = " + sum);
	 
	 
	 
	 
	 
	  
	  
	}//end main

}//end class
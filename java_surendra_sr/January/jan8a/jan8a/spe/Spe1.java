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

  //Date  08/01/2019
 public class Spe1 {

	public static void main(String args[]){
			java.util.Scanner scan  = new java.util.Scanner(System.in);
			System.out.println("How many time you want to display msg");
			
			int howManyTime =Integer.parseInt( scan.nextLine());//NPF
			System.out.println("how many second delay time required??");
			int delayTime =Integer.parseInt( scan.nextLine());//NFE
			
			for(int m=1;m<=howManyTime;m++){
				System.out.println("Success Is Sure If I want! ");
				Thread.sleep(delayTime*1000);//InterruptedException
			}
	   
	  
	}//end main

}//end class
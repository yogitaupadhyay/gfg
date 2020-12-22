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

  //Date  06/01/2019  
  //java SisCalc  10 5         // 10  + 5  = 15
 public class Req5 {

	public static void main(String args[]){
	System.out.println("Happy Starting.....");
	 String strNum1 = null;
	 String strNum2= null;
	 
	 Integer num1= null;
	 Integer num2= null;
	 try{
		strNum1  = args[0];//ArrayIndexOutOfBoundsException
		strNum2  = args[1];//ArrayIndexOutOfBoundsException
		num1 = Integer.parseInt(strNum1);//NumberFormatException
		num2 = Integer.parseInt(strNum2);//NumberFormatException
		
		 
		 int  sum  = num1  + num2;
		 int  sub  = num1   - num2;
		 int   mul  = num1  * num2;
		 int   div1  = num1  / num2;
		 int  mod  = num1  % num2;
		 float div2  = (float)num1  / num2;
		 double div3  = (double)num1  / num2;
		 System.out.println("+++++++++++++++++++++++++");
		  System.out.println(num1  +"  + "  + num2   +"  =  " + sum);
		  System.out.println(num1  +"  - "  + num2   +"  =  " + sub);
		  System.out.println(num1  +"  * "  + num2   +"  =  " + mul);
		  System.out.println(num1  +"  % "  + num2   +"  =  " + mod);
		  System.out.println(num1  +"  / "  + num2   +"  =  " + div1);
		  System.out.println(num1  +"  / "  + num2   +"  =  " + div2);
		  System.out.println(num1  +"  / "  + num2   +"  =  " + div3);
		 System.out.println("+++++++++++++++++++++++++");
		
	 }catch(ArrayIndexOutOfBoundsException e){
		  System.out.println("Plz pass 2 number");
	 }catch(NumberFormatException e){
	    System.out.println("Your both  argument must integer number");
	 
	 }


	 
	 System.out.println("Happy Ending");
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	  
	}//end main

}//end class
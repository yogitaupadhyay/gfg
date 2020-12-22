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

 public class Req5Update2 {

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
		  System.out.println(num1  +"  + "  + num2   +"  =  " + sum);
		 int  sub  = num1   - num2;
		  System.out.println(num1  +"  - "  + num2   +"  =  " + sub);
		 int   mul  = num1  * num2;
		  System.out.println(num1  +"  * "  + num2   +"  =  " + mul);
		 
		 int   div1  = num1  / num2;
		  System.out.println(num1  +"  / "  + num2   +"  =  " + div1);
		 int  mod  = num1  % num2;
		  System.out.println(num1  +"  % "  + num2   +"  =  " + mod);
		 
		 float div2  = (float)num1  / num2;
		  System.out.println(num1  +"  / "  + num2   +"  =  " + div2);
		 double div3  = (double)num1  / num2;
		  System.out.println(num1  +"  / "  + num2   +"  =  " + div3);
		
	 }catch(ArrayIndexOutOfBoundsException e){
		  System.out.println("Plz pass 2 number");
	 }catch(NumberFormatException e){
	    System.out.println("Your both  argument must integer number");
	 }catch(ArithmeticException e){
			System.out.println("second number must not be ZERO");
			System.out.println("Cannot divide by zero");
	 }


	 
	 System.out.println("Happy Ending");
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	  
	}//end main

}//end class
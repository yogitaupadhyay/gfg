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
 public class SisCalc2 {

	public static void main(String args[]){
	System.out.println("Happy Starting.....");
	 String strNum1 = null;
	 String strNum2= null;
	 
	 Integer num1= null;
	 Integer num2= null;
	 try{
		strNum1  = args[0];//ArrayIndexOutOfBoundsException
	 }catch(ArrayIndexOutOfBoundsException e){
	      //System.out.println("Problem Message " +e.getMessage());
		  //e.printStackTrace();
		  System.out.println("Plz pass first number");
		  return ;//System.exit(0);
	 }
	 
	try{	
		strNum2  = args[1];//ArrayIndexOutOfBoundsException
	 }catch(ArrayIndexOutOfBoundsException e){
	  System.out.println("Plz pass second number");
		  return ;//System.exit(0);
	}
	
	
	try{
	 num1 = Integer.parseInt(strNum1);//NumberFormatException
	 }catch(NumberFormatException e){
	    System.out.println("Your first argument must integer number");
		return;
	 }
	 
	 
	 try{
	 num2 = Integer.parseInt(strNum2);//NumberFormatException
	 }catch(NumberFormatException e){
	    System.out.println("Your 2nd argument must integer number");
		return;
	 }
	 
	 
	 int  sum  = num1  + num2;
	 System.out.println("+++++++++++++++++++++++++");
	  System.out.println(num1  +"  + "  + num2   +"  =  " + sum);
	 System.out.println("+++++++++++++++++++++++++");
	 
	 
	 System.out.println("Happy Ending");
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	  
	}//end main

}//end class
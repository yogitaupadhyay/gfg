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

  //Date  27/12/2018
 public class SpeDemo2 {

	public static void main(String args[]){
	
	 String s1  = new String("java");
	 String s2  = new String("sis");
	 String s3  = new String("java");
	 String s4  =s1;
	  
	  System.out.println("s1 " + s1);
	  System.out.println("s2 " + s2);
	  System.out.println("s3 " + s3);
	  System.out.println("s4 " + s4);

	   System.out.println("s1.equals(s2) "  + s1.equals(s2) )	  ;//F
	   System.out.println("s1.equals(s3) "  + s1.equals(s3) )	  ;//T
	   System.out.println("s1.equals(s4) "  + s1.equals(s4) )	  ;//T
	   
	   
	   System.out.println("+++++++++++++++++++++++++++++++++++++");

	SisString ss1  = new SisString("java");
	SisString ss2  = new SisString("sis");
	SisString ss3  = new SisString("java");
	SisString ss4  =ss1;
	  
	System.out.println("ss1 " + ss1);//java
	System.out.println("ss2 " + ss2);//sis
	System.out.println("ss3 " +ss3);//java
	System.out.println("ss4 " +ss4);//java

   System.out.println("ss1.equals(ss2) "  + ss1.equals(ss2) )	  ;//F
   System.out.println("ss1.equals(ss3) "  + ss1.equals(ss3) )	  ;//F
   System.out.println("ss1.equals(ss4) "  + ss1.equals(ss4) )	  ;//T
	  
	}//end main

}//end class
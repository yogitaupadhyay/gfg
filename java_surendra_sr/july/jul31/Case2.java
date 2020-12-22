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

  //Date  31/07/2018
 public class Case2 {

	public static void main(String args[]){
	
	 String s1 =new String ("java");
	 String s2 =new String ("cpp");
	 String s3 =new String ("java");
	 String s4 =new String ("JAVA");
	 
	 System.out.println("s1 = "+ s1);
	 System.out.println("s2 = "+ s2);
	 System.out.println("s3 = "+ s3);
	 System.out.println("s4 = "+ s4);
	 
	 System.out.println("s1==s2 " + (s1==s2));//F
	 System.out.println("s1.equals(s2) " + s1.equals(s2));//F
	 
	 System.out.println("s1==s3 " + (s1==s3));//F
	 System.out.println("s1.equals(s2) " + s1.equals(s3));//T
	 
	  System.out.println("s1==s4 " + (s1==s4));//F
	 System.out.println("s1.equals(s4) " + s1.equals(s4));//F
	 System.out.println("s1.equalsIgnoreCase(s4) " + s1.equalsIgnoreCase(s4));//T
	  
	}//end main

}//end class
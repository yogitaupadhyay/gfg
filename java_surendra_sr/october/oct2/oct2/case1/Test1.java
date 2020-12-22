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

  //Date  02/10/2018
 public class Test1 {

	public static void main(String args[]){
	
	   StringBuffer sb1  =null;
	   StringBuffer sb2  =null;
	   System.out.println("sb1= " + sb1);//null
	   System.out.println("sb2= " + sb2);//null
	   System.out.println("+++++++++++++++++++");
	   
	   sb1  = new StringBuffer();
	   sb1.append("sis");
	  
	  System.out.println("sb1= " + sb1);//sis
	   System.out.println("sb2= " + sb2);//null;
	   System.out.println("+++++++++++++++++++");
	   
	   sb2  = sb1;
	  
	  
	  System.out.println("sb1= " + sb1);//sis
	   System.out.println("sb2= " + sb2);//sis;
	   
	   System.out.println("+++++++++++++++++++");
	   sb2.append("java");
	  System.out.println("sb1= " + sb1);//sisjava
	   System.out.println("sb2= " + sb2);//sisjava
	   System.out.println("+++++++++++++++++++++++++");
	   sb2=null;
	  	  
	   System.out.println("sb1= " + sb1);//sisjava
	   System.out.println("sb2= " + sb2);//null;
	   System.out.println("+++++++++++++++++++++++++");
	   sb2  = new StringBuffer();
	   sb2.append("very happy");
	   
	   
	   System.out.println("sb1= " + sb1);//sisjava
	   System.out.println("sb2= " + sb2);//very happy
	   
	   
	}//end main

}//end class
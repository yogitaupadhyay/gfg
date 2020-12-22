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
 public class WrapperDemo1 {

	public static void main(String args[]){
	  int a=10;
	  int b=20;
	  int c=10;
	  System.out.println("a =" + a);
	  System.out.println("b =" + b);
	  System.out.println("c =" + c);
	  System.out.println("a==b"  + (a==b));//F
	  System.out.println("a==c"  + (a==c));//T
	  
	  System.out.println("++++++++++++++++++++");
	   Integer aObj= new Integer(10);
	   Integer bObj= new Integer(20);
	   Integer cObj= new Integer(10);
	   Integer dObj=  aObj;
	   
	  System.out.println("aObj =" + aObj);
	  System.out.println("aObj =" + aObj.toString());
	  System.out.println("bObj =" + bObj);
	  System.out.println("cObj =" + cObj);
	  System.out.println("dObj =" + dObj);
	  
	  System.out.println("aObj==bObj "  + (aObj==bObj));//F
	  System.out.println("aObj==cObj "  + (aObj==cObj));//F
	  System.out.println("aObj==dObj "  + (aObj==dObj));//T
	  
	  System.out.println("+++++++++++++++++++++++++++++++++++++");
	  
	   System.out.println("aObj.equals(bObj) "  + aObj.equals(bObj) );//F
	   System.out.println("aObj.equals(cObj) "  + aObj.equals(cObj) );//T
	   System.out.println("aObj.equals(dObj) "  + aObj.equals(dObj) );//T
	  
	  
	}//end main

}//end class
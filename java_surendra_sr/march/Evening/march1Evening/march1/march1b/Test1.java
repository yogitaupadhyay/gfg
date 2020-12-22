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

  //Date  01/03/2019
 public class Test1 {

	public static void main(String args[]){
	
	  Integer ob1  = new Integer(10);
	  Integer ob2  = new Integer(5);
	  Integer ob3  = new Integer(10);
	  Integer ob4 = new Integer(100);
	  System.out.println(ob1.compareTo(ob2));//1
	  System.out.println(ob1.compareTo(ob3));//0
	  System.out.println(ob1.compareTo(ob4));//-1
	  
	  System.out.println("_________________");
	  String s1 =new String("a");
	  String s2 =new String("b");
	  String s3 =new String("a");
	  String s4 =new String("z");
	  System.out.println(s1.compareTo(s2));//1
	  System.out.println(s1.compareTo(s3	));//0
	  System.out.println(s1.compareTo(s4	));//-25
	  
	  System.out.println("++++++++++++++");
	  String a ="ab";
	  String b ="ac";
	  
	  System.out.println(a.compareTo(b));
	  
	  
	  
	  
	}//end main

}//end class
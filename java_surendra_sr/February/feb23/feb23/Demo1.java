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

  import java.util.ArrayList;
  
  
 public class Demo1 {

	public static void main(String args[]){
	
	String s1  =new String("ramesh");
	String s2  =new String("gagan");
	String s3  =new String("ramesh");
	String s4  =new String("Rita");
	
	 ArrayList nameList  = new ArrayList();
	 
	 
	 System.out.println(nameList.size());
	 System.out.println(nameList.isEmpty());
	 nameList.add(s1);
	 nameList.add(s2);
	 nameList.add(s3);
	 nameList.add(s4);
	 	 
	 System.out.println(nameList.size());
	 System.out.println(nameList.isEmpty());
	 
	 for(int e=1;e<=nameList.size();e++){
	       Object obj  = nameList.get(e-1);
		   System.out.println( obj);
	 }
	 
	  
	}//end main

}//end class
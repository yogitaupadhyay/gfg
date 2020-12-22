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

  //Date  24/02/2019
  
  import java.util.*;
  
 public class Case1 {

	public static void main(String args[]){
	
	     ArrayList wordList  = new ArrayList();
		 System.out.println(wordList);
		 wordList.add("java");
		 System.out.println(wordList);
		 
		 String s1  = "cpp";
		 wordList.add(s1);
		 System.out.println(wordList);
		 wordList.add("mobile");
		 wordList.add("laptop");
		 wordList.add("success");
		 wordList.add("career");
		 wordList.add("job");
		 wordList.add("salary");
		 System.out.println(wordList);
		 System.out.println(wordList.size());
		 //
		 for(int w=1;w<=wordList.size();w++){
		   Object obj  = wordList.get(w-1);
		   String word  = (String)obj;//downcast narrowing manual explicitely
		   System.out.print("word#"+w ) ;
		   System.out.print(" = " + word.toUpperCase() );
		   System.out.print(" lenght "+word.length());
		   System.out.println();
		   
		 }
		 
		 
		 
		 
		 
		 
	  
	}//end main

}//end class
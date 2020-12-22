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

  //Date  15/09/2018
 public class Req4 {

	public static void main(String args[]){
	
	   String [][]catWordsList = null;
	   
	   System.out.println(catWordsList);//null
	   
	   catWordsList = new String [3][];
	   
	   System.out.println(catWordsList);
	   System.out.println("total category "  + catWordsList.length);//3
	   System.out.println("cat1 "+catWordsList[0]);
	   System.out.println("cat1 "+catWordsList[1]);
	   System.out.println("cat1 "+catWordsList[2]);
	
System.out.println("++++++++++++++++++++++++++++++++");	
	   
   //cat 1 how many word 4
       catWordsList[0] =new String[4];
	   System.out.println("cat1 "+catWordsList[0]);
	   System.out.println("cat1 "+catWordsList[1]);
	   System.out.println("cat1 "+catWordsList[2]);
 
	
System.out.println("++++++++++++++++++++++++++++++++");	
	  catWordsList[1] =new String[10];
	   System.out.println("cat1 "+catWordsList[0]);
	   System.out.println("cat2 "+catWordsList[1]);
	   System.out.println("cat3 "+catWordsList[2]);
 
	   
System.out.println("++++++++++++++++++++++++++++++++");	
	  catWordsList[2] =new String[7];
	   System.out.println("cat1 "+catWordsList[0]);
	   System.out.println("cat2 "+catWordsList[1]);
	   System.out.println("cat3 "+catWordsList[2]);
 
	   
	   
	   for(int cat=1;cat<=catWordsList.length;cat++){
	     for(int word=1;word<=catWordsList[cat-1].length;word++){
		   String text  = catWordsList[cat-1][word-1];
		   System.out.println("cat#"+cat+"  word #"+word);
		 }
	   System.out.println("+++++++++++++++++++++");
	   
	   }
	  
	}//end main

}//end class
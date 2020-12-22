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

  //Date  08/01/2019
 public class Req4 {

	public static void main(String args[]){
	      String [] wordList ={ "java",  "nit",	 null,  "sis",	   "success",	 "career"  };
		  show(wordList);
		  
	  
	}//end main
	
	
 private static void show(String [] wordList){
 
 		  for(int w=1;w<=wordList.length;w++){
			 String word  = wordList[w-1];
			 System.out.println("word#"+w   +" : " +word.toUpperCase() );
		  
		  }//for
 }//show

}//end class
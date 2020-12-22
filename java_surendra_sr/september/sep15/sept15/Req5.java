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
 public class Req5 {

	public static void main(String args[]){
	java.util.Scanner scan  = new java.util.Scanner(System.in);
	
	
	
	   String [][]catWordsList = null;
	  
	   System.out.println("how many cat required");
	   int totalCat = scan.nextInt();
	   catWordsList = new String [totalCat][];
	    System.out.println("total category created  "+ catWordsList.length);
	   for(int cat=1;cat<=catWordsList.length;cat++){
	       System.out.println("in cat #" + cat  +" how many words required");
		   int totalWords = scan.nextInt();
		   catWordsList [cat-1]  = new String[totalWords];
	   }
	   
	   //data filling 
	     for(int cat=1;cat<=catWordsList.length;cat++){
				 System.out.println("in cat#"+cat+" has total word " +   catWordsList[cat-1].length );
				
				for(int word=1;word<=catWordsList[cat-1].length;word++){
				   System.out.println("Enter word #"+word);
				   String text  = scan.next();
					catWordsList[cat-1][word-1]  =  text ;
				 }
	   }
	   
	   
	   
	   
	   //view reports 
	   System.out.println("++++++++++++++++++++++++++++++");
	   for(int cat=1;cat<=catWordsList.length;cat++){
		   System.out.println("in cat#"+cat+" has total word " 
		   +   catWordsList[cat-1].length );
	     
	     for(int word=1;word<=catWordsList[cat-1].length;word++){
		   String text  = catWordsList[cat-1][word-1];
		   System.out.println("cat#"+cat+"  word #"+word  +"  = "  + text);
		 }
	   System.out.println("+++++++++++++++++++++");
	   
	   }
	  
	}//end main

}//end class
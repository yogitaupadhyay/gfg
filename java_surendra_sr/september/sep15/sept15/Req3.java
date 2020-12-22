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
 public class Req3 {

	public static void main(String args[]){
	
	   String [][]catWordsList = null;
	   
	   System.out.println(catWordsList);
	   
	   catWordsList = new String [3][5];
	   
	   System.out.println(catWordsList);
	   System.out.println("total category "  + catWordsList.length);
	   System.out.println();
	   
	   
	   java.util.Scanner scan  = new java.util.Scanner(System.in);
	for(int cat=1;cat<=catWordsList.length;cat++){
	   System.out.println("in cat" +cat );
	
		for(int word=1;word<=catWordsList[cat-1].length;word++){
			System.out.println("enter your word "+word);
			String value =scan.nextLine();
			catWordsList[cat-1][word-1] =value;
		}//word
	}	//cat
	
	
	   
	   
	for(int cat=1;cat<=catWordsList.length;cat++){
	    System.out.println("cat#"+cat  +  catWordsList[cat-1]);
		System.out.println("it has total words  " +  catWordsList[cat-1].length );
		
		for(int word=1;word<=catWordsList[cat-1].length;word++){
		 String value = catWordsList[cat-1][word-1];
		  System.out.println("word#"+word  +" =  " + value);
		}
		
		System.out.println("+++++++++++++++++++++++++");
	}
		
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	  
	}//end main

}//end class
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

  //Date  01/10/2018
 public class Student{ 
    String name;
	
	
	
	int [] givesSomeNumbers(int totalRequiredNumbers){
			 int [] numbers  = new int[totalRequiredNumbers];
			 java.util.Random rand  = new java.util.Random();
			 
			 for(int n=1;n<=numbers.length;n++){
			   numbers[n-1] = rand.nextInt(1000)+1;
			 }//end of loop
	
	  return numbers;
	}
	
	String chooseWord(String [] wordList){
		java.util.Random rand  = new java.util.Random();
		int index  = rand.nextInt(wordList.length);// 0 to length-1
		String selectedWord  =  wordList[index];
	return selectedWord;
	}
	
	
	
 }//End of class 

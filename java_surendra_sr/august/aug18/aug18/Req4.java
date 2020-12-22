
 public class Req4 {

	public static void main(String args[]){
	
	  String allWordsInputs="";
	  String moreOption = null;
	  String inputWord = null;
	  
	  java.util.Scanner scan  = new java.util.Scanner(System.in);
	  
	  
	  do{
	     //todo1 
		   System.out.println("enter your word");
		    inputWord = scan.nextLine();
			
		 //todo2
			System.out.println("want to add more word yes or no");
		    moreOption = scan.nextLine();
		   
		   allWordsInputs = allWordsInputs + " "+ inputWord;
		 
	  }while("yes".equals(moreOption)==true);
	  
	  
	  System.out.println("++++++++++++++++++++++++++++++++");
	  System.out.println("your input word are " +allWordsInputs);
	  
	  
	  
	}//end main

}//end class
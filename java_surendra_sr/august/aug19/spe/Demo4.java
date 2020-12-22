
 public class Demo4 {

	public static void main(String args[]){
	
	 
	  int up=1;
	 for(int task=1001;task<=1010 ; task++){
	      //A
		  int sub=1;
		  for(int partA='A' ;  partA<=('A'+9) ;partA++){
		  //  System.out.printf("%s","*");
		    System.out.printf("%4s",sub*up);
			sub++;
		  }
	    //B
		System.out.println("\n+++++++++++++++++++++++++++++++++++++");
	     up++;
	 }
	  
	}//end main

}//end class
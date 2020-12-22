
 public class Req3 {

	public static void main(String args[]){
	
	  java.util.Scanner scan  = new java.util.Scanner(System.in);
	  
		int stopInput=-9999;
		int userInput=0;
		int sum =0;
		System.out.println("to stop enter -9999");
		while(stopInput!=userInput){
		   System.out.println("enter your number");
		  userInput = scan.nextInt();
		  
		  //sum  = sum  + userInput;
		  if(stopInput!=userInput){
			sum  += userInput;
		  } 
		  
		  
		  
		}
		
		System.out.println("sum"+ sum);
		System.out.println("done");
	}//end main

}//end class
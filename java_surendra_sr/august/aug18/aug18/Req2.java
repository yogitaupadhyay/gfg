
 public class Req2 {

	public static void main(String args[]){
	
	  java.util.Scanner scan  = new java.util.Scanner(System.in);
	  
	  int sum  = 0;
	  for(int totalInput=1;totalInput<=10;totalInput++){
	    System.out.println("enter no#"+totalInput);
	     int number  = scan.nextInt();
		 sum   = sum  + number;
	  }
	  
	  System.out.println("total sum " + sum);
	}//end main

}//end class
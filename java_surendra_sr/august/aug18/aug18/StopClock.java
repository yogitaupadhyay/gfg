
 public class StopClock {

	public static void main(String args[]) throws Exception{
	
	   java.util.Scanner scan  = new java.util.Scanner(System.in);
	   System.out.println("enter required second");
	   int howManySecond =scan.nextInt();
	   
	   for(int second=howManySecond;second>=1;second--){
		Thread.sleep(1000);
		if(second>=10){
	     System.out.print("\r"+second);
	   }else{
	     //System.out.print("\r"+second +" ");
	     System.out.print("\r"+ "0"+second );
	   }
	   
	}//end for
	   
	  
	}//end main

}//end class
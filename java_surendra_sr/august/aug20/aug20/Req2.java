
 public class Req2 {

	public static void main(String args[]){
	java.util.Random rand  = new java.util.Random();
	   for(int row=1;row<=10;row++){
	       for(int col=1;col<=10;col++){
					float value  = rand.nextInt(100000);
				System.out.printf("%010.1f   ",value);
		   }
	    System.out.println();
	   }
	  
	}//end main

}//end class
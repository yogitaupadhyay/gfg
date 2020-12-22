
 public class Req1 {

	public static void main(String args[]){
	
	   for(int row=1;row<=10;row++){
	       for(int col=1;col<=10;col++){
		        int value  = (10*(col-1)  )  + row;
				System.out.printf("%4d ",value);
		   }
	    System.out.println();
	   }
	  
	}//end main

}//end class
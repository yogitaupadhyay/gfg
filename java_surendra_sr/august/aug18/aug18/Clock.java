
 public class Clock {

	public static void main(String args[]) throws Exception{
		boolean runAlways =true;
	  while(runAlways){
	  
	     java.util.Date d1 = new java.util.Date();
		
		//System.out.println(d1);
		 System.out.print( "\r"+d1);
	    Thread.sleep(1000);
	  
	  }
	  
	}//end main

}//end class
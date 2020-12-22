
 public class Clock2 {

	public static void main(String args[]) throws Exception{
		boolean runAlways =true;
	  while(runAlways){
	  
	     java.util.Date d1 = new java.util.Date();
		
		        String str  = "" +d1;
		       System.out.print("\r"+ str.substring(8,19));
	    Thread.sleep(1000);
	  
	  }
	  
	}//end main

}//end class
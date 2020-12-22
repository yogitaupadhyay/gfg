
 public class Pattern {

	public static void main(String args[]){
	
	  for(int task=1;task<=10;task++){
	  
	   
		   for(int taskAx=1;taskAx<=task;taskAx++){
		     System.out.print(taskAx);
		   }
		
	   
		 for(int taskAy=1;taskAy<=10-task;taskAy++){
		  System.out.print("*");
		 }
		
		   
	  
	  
	   System.out.println();
	  }
	  
	}//end main

}//end class
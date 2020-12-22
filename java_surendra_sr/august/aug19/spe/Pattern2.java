
 public class Pattern2 {

	public static void main(String args[]){
	
	  for(int task=1;task<=10;task++){
	  
	  
		 for(int taskAy=1;taskAy<=10-task;taskAy++){
		  System.out.print("*");
		 }
	 
		   for(int taskAx=1;taskAx<=task;taskAx++){
		     System.out.print(taskAx);
		   }
		
	   
	   System.out.println();
	  }
	  
	  
	  
	  
	  
	  for(int task=1;task<=10;task++){
	  
	    //Ay
		 for(int taskAy=1;taskAy<=10-task;taskAy++){
		  System.out.print("*");
		 }
	    //A
	    //Ax
		   for(int taskAx=1;taskAx<=task;taskAx++){
		     System.out.print("+");
		   }
		
	   //B
	   System.out.println();
	  }
	  
	  
	  
	  
	}//end main

}//end class
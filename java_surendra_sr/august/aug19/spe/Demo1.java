
 public class Demo1 {

	public static void main(String args[]){
	
	java.util.Random rand  = new java.util.Random();
	
	   for(int task=1;task<=100;task++){
	           //System.out.print("*");
			   int option  = rand.nextInt(3);//0 1 2
			   switch(option){
			   case 0: 
			      System.out.printf("%4d",rand.nextInt(101));
			   break;
			   case 1: 
			      int ch1  = rand.nextInt(26) +65;
			      System.out.printf("%4c", (char)ch1);
			   break;
			   case 2: 
			      int ch2  = rand.nextInt(26) +97;
			      System.out.printf("%4c", (char)ch2);
			   break;
			   }//swich
			  
			  if(task%10==0){
			    System.out.print("\n");
			  }
			  
	   }//loop task
	  
	}//end main

}//end class
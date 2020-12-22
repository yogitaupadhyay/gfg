
 public class Demo3 {

	public static void main(String args[]){
	
	  
	int num =0;
	int temp=1;
	   for(int task=101;task<=200;task++){
			  System.out.printf("%4d",(num*10)+1);
			  num++;
			  if(task%10==0){
			    System.out.print("\n");
				num=0;
			  }
			  
			  
	   }//loop task

	   
	}//end main

}//end class
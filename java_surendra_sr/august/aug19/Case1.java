
 public class Case1 {

	public static void main(String args[]){
	
	  for(int i=1;i<=10;i++){
		for(int j=1;j<=10;j++){
		  //System.out.print(i*j+"\t");
		 // System.out.print(i*j+"\t");
		 int result  = i*j;
		 System.out.print(result);
		   if(result<=9){
		     System.out.print("   ");
		   }else   if(result<=99){
		     System.out.print("  ");
		   }
		 
		}
		System.out.println();
	  
	  }
	  
	}//end main

}//end class

  //Date  01/09/2018
 public class Demo1 {

	public static void main(String args[]){
	
	   int [] arr1 = {44,33,22,55,66,88,11,77};

	   for(  int e=1;  e<=arr1.length;  e++){
	     int data  = arr1[e-1];
		 System.out.print(data +" ");
	   }
	   System.out.println("\n+++++++++++++++++++");
	   for(int data:arr1){
	   System.out.print(data +" ");
	   }
	   
	   
	  
	}//end main

}//end class
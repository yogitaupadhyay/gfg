
  //Date  01/09/2018
 public class Demo2 {

	public static void main(String args[]){
	
	   int [] arr1 = {44,33,22,55,66,88,11,77};

	   for(  int e=1;  e<=arr1.length;  e++){
	     int data  = arr1[e-1];
		 System.out.println("sno#"+e +" = "+data +" ");
	   }
	   System.out.println("\n+++++++++++++++++++");
	   
	   int a=1;
	   for(int data:arr1){
		 System.out.println("sno#"+a +" = "+data +" ");
		 a++;
	   }
	   
	   
	  
	}//end main

}//end class
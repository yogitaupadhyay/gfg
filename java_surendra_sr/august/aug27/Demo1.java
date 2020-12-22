
 public class Demo1 {

	public static void main(String args[]){
	
    int []arr1 =null;
	System.out.println(arr1);//null;
             System.out.println(arr1.length);   //null-run time error;
	
	
	arr1 = new int[50];
	System.out.println(arr1);//null;
	System.out.println("total size"+arr1.length);//null;
	
	System.out.println("+++++++++++++++++++++++++");
    int [][]arr2 =null;
	System.out.println(arr2);
	arr2= new int[2][25];
	System.out.println(arr2);
	System.out.println(arr2.length);
	System.out.println("_____________________________");
	System.out.println(arr2[0]);
	System.out.println(arr2[0].length);
	System.out.println(arr2[0][0]);
	System.out.println(arr2[0][1]);
	System.out.println(arr2[0][2]);
	System.out.println("_____________________________");
	System.out.println(arr2[1]);
	System.out.println(arr2[1].length);
	System.out.println(arr2[1][0]);
	System.out.println(arr2[1][1]);
	System.out.println(arr2[1][2]);
	System.out.println(arr2[1][3]);

	  
	}//end main

}//end class
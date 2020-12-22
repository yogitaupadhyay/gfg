
 public class Demo1 {

	public static void main(String args[]){
	
	   java.util.Scanner scan  = new java.util.Scanner(System.in);
	   
	   
	   System.out.println("enter your birth date");
		int date  = scan.nextInt();
		int d1 = date%10;
		date = date/10;
		int d2 = date%10;
		
		int  num  = d1+d2;
		System.out.println("num " + num);
		if(num==1){
		
		}else if(num==2){
		
		}else if(num==3){
		}else{
		  System.out.println("");
		}
		
	   
	  
	}//end main

}//end class
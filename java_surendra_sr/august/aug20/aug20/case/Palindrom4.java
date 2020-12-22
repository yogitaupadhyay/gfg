
 public class Palindrom4 {
	public static void main(String args[]){
    	 System.out.println("enter your Word to check Palindrom or not");
	   String str =new java.util.Scanner(System.in).nextLine();
	   System.out.println(str.equals(new StringBuffer(str).reverse().toString()) ? "Palindrom " : "NOT Palindrom");
	}//end main

}//end class
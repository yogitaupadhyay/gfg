
 public class Palindrom3 {
	public static void main(String args[]){
    	 System.out.println("enter your Word to check Palindrom or not");
	   String str =new java.util.Scanner(System.in).nextLine();
	   String rev=new StringBuffer(str).reverse().toString();
	   System.out.println("original string " + str);
	   System.out.println("reverse string " + rev);
	   System.out.println(str.equals(rev) ? "Palindrom " : "NOT Palindrom");
	}//end main

}//end class
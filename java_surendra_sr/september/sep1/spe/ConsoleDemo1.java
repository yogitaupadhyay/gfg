
  //Date  01/09/2018
 public class ConsoleDemo1 {

	public static void main(String args[]){
	
	  java.io.Console con = System.console();
	  //String readLine();
	  String s1;
	  System.out.println("enter 1 string ");
	    s1  = con.readLine();
	  
	  System.out.println("enter 2 string ");
	  char []wordArr  = con.readPassword();
	  String s2 = new String(wordArr);
	  
	  
	  System.out.println("+++++++++++++++++++++++");
	  System.out.println("str1 " +s1);
	  System.out.println("str2 " +s2);
	  
	  
	  
	  
	  
	  
	  
	  
	}//end main

}//end class
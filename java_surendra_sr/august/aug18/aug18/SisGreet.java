
 public class SisGreet {

	public static void main(String args[])throws Exception{
	
	String preDefinePassword  = "success";
	String userPassword=null;
	java.util.Scanner scan  = new java.util.Scanner(System.in);
	
do{
  System.out.println("enter your password");
  userPassword = scan.nextLine();

}while(preDefinePassword.equals(userPassword)==false);

	
	

		//after success
	   
	   System.out.println("loading");
	   for(int totalStar=1;totalStar<=5;totalStar++){
	   Thread.sleep(500);
	   System.out.print("*");
	   }
	   System.out.println();
	     
	   
	   System.out.println("++++++++++++++++++++++++++");
	   System.out.println("welcome to Sis ");
	   System.out.println("today date " + new java.util.Date());
	   System.out.println("++++++++++++++++++++++++++");
	  
	}//end main

}//end class
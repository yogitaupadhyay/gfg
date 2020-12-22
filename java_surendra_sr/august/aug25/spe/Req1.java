
  import java.util.Scanner;
  import java.util.Date;
    
 public class Req1 {

	public static void main(String args[]){
	
	// java.util.Scanner scan  = new java.util.Scanner(System.in);
	Scanner scan  = new Scanner(System.in);
	 System.out.println("how many number required from student?");
	 final int size  = scan.nextInt(); 
	 
	 int [] studentNumbers = new int[size];
	 Date[] creationDateTimes = new Date[size];
	 
	 //OK for(int stu=1;stu<=size;stu++){
	 for(int stu=1;stu<=studentNumbers.length;stu++){
	    System.out.println( "student "+stu  +" enter your number");
		studentNumbers[stu-1] = scan.nextInt();
		creationDateTimes[stu-1] = new Date();
	 };
	 
	 
System.out.println("+++++++++++++++++++++++++++++++++++++++");	 
	 
	 for(int stu=1;stu<=studentNumbers.length;stu++){
		 System.out.printf("%4d",stu);
		 String msg  = studentNumbers[stu-1] +" : "+ creationDateTimes[stu-1];
		 System.out.printf("%s\n" ,msg );
		 System.out.println("________________________________________");
	 
	 }
	 
System.out.println("+++++++++++++++++++++++++++++++++++++++");	 
	 
		}//end main

}//end class
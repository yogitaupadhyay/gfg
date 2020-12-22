
 public class Req1 {

	public static void main(String args[]){
	
	   java.util.Scanner scan  = new java.util.Scanner(System.in);
	   //year wise student
	   String [][]yearWiseStuNames = null;

      System.out.println("how many years required");	   
      int totalYear  = scan.nextInt();
	  
	  yearWiseStuNames = new String[totalYear][];
	  
	  for(int year=1;year<=yearWiseStuNames.length;year++){
	   //System.out.println(" in Year" +year + "  : " + yearWiseStuNames[year-1] );
	   System.out.println(" in Year" +year + "  how many student required?");
	     int totalReqStudent  = scan.nextInt();
	   yearWiseStuNames[year-1] = new String[totalReqStudent];
	   
	  }
	   
	   
	 java.util.Scanner scan2  = new java.util.Scanner(System.in);
	     for(int year=1;year<=yearWiseStuNames.length;year++){
				System.out.println(" in Year" +year + "  : " + yearWiseStuNames[year-1].length );
				  for(int stu=1;stu<= yearWiseStuNames[year-1].length ;stu++){
				System.out.println("for year" +year  +" enter student "+ stu +" name");
				   String name  = scan2.nextLine();
				   yearWiseStuNames[year-1][stu-1] = name;
				}
		 }
	   
	   
	   System.out.println("++++++++++++++++++++++++++");
	     for(int year=1;year<=yearWiseStuNames.length;year++){
				System.out.println(" in Year" +year + "  : " + yearWiseStuNames[year-1].length );
				  for(int stu=1;stu<= yearWiseStuNames[year-1].length ;stu++){
				   String name  =yearWiseStuNames[year-1][stu-1];
				System.out.println("for year" +year  +" student "+ stu +" name is " + name);
				    
				}
		 }
	   
	   
	   
	   
	   
	  
	}//end main

}//end class
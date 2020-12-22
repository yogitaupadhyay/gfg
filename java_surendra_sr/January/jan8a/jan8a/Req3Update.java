/*
@Author:Surendra Kumar Sao
	>>Software Architect and Corporate Trainer
	>>+9 year exp in (mumbai,pune,hyd,bangaluru)
	>>Java Certified SCJP & SCWCD with 98%
	Trained more than 5k students and employees.
    MCA from (NIT)National Institute of Technology Raipur(C.G.)
	Email : sur.nit.mca@gmail.com
	Mobile 7987234544, 9009442844
	https://www.urbanpro.com/raipur/surendra-kumar-sao/reviews/7223178
	https://www.urbanpro.com/raipur/surendra-kumar-sao/1334109?_tp=
 */

  //Date  08/01/2019
 public class Req3Update {

	public static void main(String args[]){
	   java.util.Scanner scan  = new java.util.Scanner(System.in);
	  String [] studentNameList=null;
	  int totalRequiredStudent ;
	  
	  try{
	  System.out.println("How many student required");
		totalRequiredStudent = Integer.parseInt(scan.nextLine());
		studentNameList  = new String[totalRequiredStudent];
		//fillit
		  for(int stu=1;stu<=studentNameList.length;stu++){
				System.out.println("enter stu"+stu +"  name");
				studentNameList[stu-1] = scan.nextLine();
		  }
	  
	  //shpo
	    System.out.println("student name list are :");
	    for(int stu=1;stu<=studentNameList.length;stu++){
			System.out.println("Stu#"+stu +"  " +studentNameList[stu-1]);
		 }
	  }catch(NegativeArraySizeException e){
	     System.out.println("Array size can not be negative");
	  
	  }catch(NumberFormatException e){
	    System.out.println("invalid input : input must be integer");
	  }
	  
	  
	  System.out.println("happy ending");
	  
	}//end main

}//end class
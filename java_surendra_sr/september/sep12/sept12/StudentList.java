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

  //Date  12/09/2018
 public class StudentList {

	public static void main(String args[]){
	
	   boolean [] studentList = new boolean [20];
	   java.util.Random rand  = new java.util.Random();
	   
	   for(int stu=1;stu<=studentList.length;stu++){
			studentList[stu-1] = rand.nextBoolean();
	   }
	  
	  
	  
	   for(int stu=1;stu<=studentList.length;stu++){
		  //System.out.println("stu#" +stu  +" isSelected   " + studentList[stu-1]);
		    String result =  studentList[stu-1]?"Yes " : "no";
		  System.out.printf("%-25s ",  "stu#" +stu  +" isSelected   " );
		  System.out.printf("%-4s" , result);
		  System.out.println();
	   }
	}//end main

}//end class
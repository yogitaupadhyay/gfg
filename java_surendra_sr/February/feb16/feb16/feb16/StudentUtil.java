 
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
 
   CurrentYear 2019 
 */

public final class StudentUtil {

	public static void show(Student[] studentList) {

		for (Student stu : studentList) {
	    	  if(stu!=null) { 
				 System.out.printf("%-4d",stu.getId());
				 System.out.printf("%-4d",stu.getAge());
				 System.out.printf("%-15s",stu.getName());
				 System.out.printf("%-8s",stu.getGender());
				 System.out.printf("%-5.2f",stu.getWeight());
				 System.out.printf(" %-8s",stu.isFit());
				 System.out.println();
			 
	    	  }//end if
		}//loop
	}

	public static int getStudentCount(Student[] studentList) {
		int total=0;
		for (Student stu : studentList) {
	    	  if(stu!=null) { 
	    		  total++; 
	    	  }
		}
		return total;
	}

	public static int getTotalAge(Student[] studentList) {
		int totalAge=0;
		for (Student stu : studentList) {
	    	  if(stu!=null) { 
	    		  totalAge+= stu.getAge();
	    	  }
		}
		return totalAge;
	}

	 
	public static Student search(Student[] studentList, String nameSearch) {
		 Student stu  = null;
		 
		 for (Student s : studentList) {
	    	  if(s!=null && nameSearch.equalsIgnoreCase(s.getName())) { 
	    		  stu = s;
	    	  }
		}
		return stu;
	}

}

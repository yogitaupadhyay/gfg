
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
 
   CurrentYear 2018 
 */

public class StudentSelectionDem0 {

	 
	public static void main(String[] args) {
		 
		Student s1  = new Student("101","ramesh","male","mca","nit");
		Student s3  = new Student("103","rama","male","mca","nit");
		Student s2  = new Student("102","gita","female","mca","nit");
		
		Student s5  = new Student("105","mukesh","male","cse","nit");
		Student s4  = new Student("104","rita","female","cse","nit");
		Student s6  = new Student("106","reema","female","cse","nit");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		
	}

}

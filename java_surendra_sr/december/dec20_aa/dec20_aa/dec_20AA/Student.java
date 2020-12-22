
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

public class Student extends Human{
   int id;
   String collegeName;
   String branch;
   
   
   Student(int id, String branch,String name,String bloodGroup){
	   super(name,bloodGroup);
	   this.id=id;
	   this.branch =branch;
   }
   
   
  void show() {
	  System.out.println("_____________details_______________");
	  System.out.println(" name "+ name);
	  System.out.println(" age "+ age);
	  System.out.println(" bloodGroup "+ bloodGroup);
	  System.out.println(" id "+ id);
	  System.out.println(" branch "+ branch);
	  System.out.println(" college "+ collegeName);
	  
  } 
   
}

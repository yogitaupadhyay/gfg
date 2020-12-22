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

  //Date  22/10/2018
 public class HumanDemo{ 
   public static void main(String args[]){
       
	   Human h1  = new Human();
	   h1.name="gita";
	   h1.gender="female";
	   h1.age=22;
	   h1.eat();
	   h1.speak();
	   h1.walk();
	   
	   System.out.println("+++++++++++++++++++++++++");
	   
	   Student stu = new Student();
	   
	    stu.name="Deepak";
	    stu.gender="male";
	    stu.age=23;
	    
		stu.id="nit123";
		stu.branch="civil";
		stu.college="nit";
		
	   stu.eat();
	   stu.speak();
	   stu.walk();
	   stu.read();
	   stu.write();
	   
	   stu.showStudentDetail();
	   
	   
	   
	   
	   
	   
	   
	   
   }
 }//End of class 

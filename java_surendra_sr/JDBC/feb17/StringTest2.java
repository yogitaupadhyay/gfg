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

  //Date  17/02/2019
 public class StringTest2 {

	public static void main(String args[]){
	
		int id=1;
		String name="ramesh";
		String dob ="10-may-1999";
		int age=22;
	 
		   String sql = "insert into stu (id,name,age,dob)values(" +id+  ",\'"+name+"\',"+age+",\'"+dob+"\')";
		   
		   System.out.println(sql);
	  
	}//end main

}//end class
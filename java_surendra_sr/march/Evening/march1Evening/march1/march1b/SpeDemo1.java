
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
import java.util.*;

public class SpeDemo1 {
public static void main(String[] args) {
	Employee e1  = new Employee(104,"mahesh", 10, "jpmc");
	Employee e2  = new Employee(102,"ramesh", 20, "jpmc");
	Employee e3  = new Employee(101,"ganesh", 10, "jpmc");
	Employee e4  = new Employee(105,"suresh", 30, "jpmc");
	Employee e5  = new Employee(103,"nimesh", 30, "jpmc");
	List<Employee> list  = new ArrayList<Employee>();
	list.add(e1);
	list.add(e2);
	list.add(e3);
	list.add(e4);
	list.add(e5);
	
	System.out.println(list.size());
	for (Employee emp : list) {
		System.out.println(emp.toString());
	}
	
	Collections.sort(list);
	
	System.out.println("++++++++++++++after sort++++++++++++++");
	
	for (Employee emp : list) {
		System.out.println(emp.toString());
	}
		
	
	
	
	
	
}
}

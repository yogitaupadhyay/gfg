import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

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

public class EmployeeManagement {

	 
	public static void main(String[] args) {
	   
		
	Employee e1  = new Employee(104,"mahesh", 10, 63485F);
	Employee e2  = new Employee(102,"ramesh", 20, 45645F);
	Employee e3  = new Employee(101,"ganesh", 10, 87785F);
	Employee e4  = new Employee(105,"suresh", 30, 56785F);
	Employee e5  = new Employee(103,"nimesh", 30, 12785F);
	Employee e6  = new Employee(106,"gita", 20,  32785F);
	List<Employee> list  = new ArrayList<Employee>();
	list.add(e1);
	list.add(e2);
	list.add(e3);
	list.add(e4);
	list.add(e5);
	list.add(e6);
	
	showALlEmployees(list);
		
	Scanner scan = new Scanner(System.in);
	
	while(true) {
		System.out.println("1 : show order by ID ASC");
		System.out.println("2 : show order by ID Desc");
		System.out.println("3 : show order by name ASC");
		System.out.println("4 : show order by name Desc");
		System.out.println("5 : show order by salary ASC");
		System.out.println("6 : show order by salary Desc");
		System.out.println("7 : show order by dept Asc");
		System.out.println("8 : show order by dept Desc");
		System.out.println("9 : exit");
		System.out.println("10 : oder by dept and name");
		int option  = scan.nextInt();
		switch(option) {
		case 1 : 
		   Collections.sort(list);
		   System.out.println("after sort ");
		   showALlEmployees(list);
		break;	
		
		case 2 : 
			   Collections.sort(list,new EmployeeSortByIdDesc());
			   System.out.println("after sort ");
			   showALlEmployees(list);
		break;	
		case 3 : 
			   Collections.sort(list,new EmployeeSortByNameAsc());
			   System.out.println("after sort ");
			   showALlEmployees(list);
		break;	
		case 4: 
			Collections.sort(list,new EmployeeSortByNameDesc());
			System.out.println("after sort ");
			showALlEmployees(list);
			break;	
		case 5: 
			Collections.sort(list,new EmployeeSortBySalaryAsc());
			System.out.println("after sort ");
			showALlEmployees(list);
			break;	
		case 6: 
			Collections.sort(list,new EmployeeSortBySalaryDesc());
			System.out.println("after sort ");
			showALlEmployees(list);
			break;	
			
		case 7: 
			Collections.sort(list,new EmployeeSortByDeptAsc());
			System.out.println("after sort ");
			showALlEmployees(list);
			break;	
		case 8: 
			Collections.sort(list,new EmployeeSortByDeptDesc());
			System.out.println("after sort ");
			showALlEmployees(list);
			break;	
			
		case 10: 
			Collections.sort(list,new EmployeeSortByDeptAndNameAsc());
			System.out.println("after sort ");
			showALlEmployees(list);
			break;	
			
		case 9: System.out.println("bye");
		System.exit(0);
		break;
		default : System.out.println("invalid option");break;
		}
		
		
	}
	
	
	
	
	
		
		

	}

	private static void showALlEmployees(List<Employee> list) {
		System.out.println("+++++++++++++++++++++++++++++");
		System.out.println("total employee" + list.size());
		for (Employee emp : list) {
			System.out.println(emp.toString());
		}
		System.out.println("+++++++++++++++++++++++++++++");
	}

}

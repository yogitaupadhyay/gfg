     import java.io.Serializable;

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

public class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private int deptNumber ;
	private String companyName;
	private float salary;
	public Employee(int id, String name, int deptNumber, String companyName) {
		super();
		this.id = id;
		this.name = name;
		this.deptNumber = deptNumber;
		this.companyName = companyName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDeptNumber() {
		return deptNumber;
	}
	public void setDeptNumber(int deptNumber) {
		this.deptNumber = deptNumber;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id +
				", name=" + name 
				+ ", deptNumber=" 
				+ deptNumber + ", companyName=" 
				+ companyName
				+ ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee otherEmp) {
		/*if(this.id>otherEmp.getId()) {
			return +1;
		}else if(this.id<otherEmp.getId()) {
			return -1;
		}else {
			return 0;
		} */
		//asc
		int logic = this.name.compareTo(otherEmp.getName());
		//asc return logic*1;
		return logic*-1;//decs
		
		
	}
		
	
	
	
	
}

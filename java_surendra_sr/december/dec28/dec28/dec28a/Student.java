
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

public class Student {
  private String id;
  private String name;
  private int age;
  private float weight;
  private String gender;
  private String branch;
  private String email;
  private String mobile;
  private String college;
  private String address;

public Student() {
}

public Student(String id, String name, String gender, String branch, String college) {
	super();
	this.id = id;
	this.name = name;
	this.gender = gender;
	this.branch = branch;
	this.college = college;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public float getWeight() {
	return weight;
}

public void setWeight(float weight) {
	this.weight = weight;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public String getBranch() {
	return branch;
}

public void setBranch(String branch) {
	this.branch = branch;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getMobile() {
	return mobile;
}

public void setMobile(String mobile) {
	this.mobile = mobile;
}

public String getCollege() {
	return college;
}

public void setCollege(String college) {
	this.college = college;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", branch=" + branch + "]";
}	


	@Override
	public boolean equals(Object obj) {
			if(obj==null)return false;
			if(obj==this)return true;
		if(obj instanceof Student) {
		 Student other  = (Student) obj;
		 boolean c1  = gender.equals(other.getGender());	
		 boolean c2  = branch.equals(other.getBranch());	
		 return c1&&c2;
		}	
		
		
		return false;
	}





  
}

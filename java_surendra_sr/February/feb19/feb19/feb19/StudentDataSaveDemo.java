import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

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

public class StudentDataSaveDemo {
 
	public static void main(String[] args) throws Exception {
		
		Student s1 = new Student(101,98.6f, true);
		Student s3 = new Student(102,68.6f, true);
		Student s2 = new Student(103,78.6f, true);
		
		Student[]arr = {s1,s2,s3};
		
		DataOutputStream dos = null;
		dos  = new DataOutputStream(new FileOutputStream("student_data"));
		for(Student stu:arr) {
			dos.writeInt(stu.getId());
			dos.writeFloat(stu.getPer());
			dos.writeBoolean(stu.isPlaced());
		}
		dos.close();
		System.out.println("data saved.....");
		

	}

}

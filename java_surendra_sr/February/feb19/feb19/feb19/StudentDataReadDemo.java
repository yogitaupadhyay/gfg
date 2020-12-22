import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
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

public class StudentDataReadDemo {
 
	public static void main(String[] args) throws Exception {
		
		DataInputStream dis = null;
		dis  = new DataInputStream(new FileInputStream("student_data"));

		Student stuArr[] = new Student[3];
		 for(int s=1;s<=stuArr.length;s++) {
			//read
			 int id  =dis.readInt();
			 float per  = dis.readFloat();
			 boolean placed  = dis.readBoolean();
			//create empty container (POJO)
			Student stu  = new Student();
			//fill
			stu.setId(id);
			stu.setPer(per);
			stu.setPlaced(placed);
			//add into array
			stuArr[s-1] = stu;
			
		 }
		 for(Student stu:stuArr) {
		 System.out.printf("%10d",stu.getId() );
		 System.out.printf("%10.2f",stu.getPer());
		 System.out.printf("%10s",stu.isPlaced() );
		 System.out.println();
		 }
		
		
		dis.close();
		System.out.println("data read.....");
		

	}

}

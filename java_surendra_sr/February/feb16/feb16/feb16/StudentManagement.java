++++++++
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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

public class StudentManagement {

	 
	public static void main(String[] args) {
		 
		String fileName = "sis_stu.nit";
	     BufferedReader br  = null;
	     Student[] studentList = new Student[15];
	    // Student[] studentList = StudentUtil.loadRecords();
	     
	     try {
			br  = new BufferedReader(new FileReader(fileName));
			String line;
			int pos=1;
			while((line=br.readLine())!=null) {
			
				String[] studentFields = line.split("::");
				
				if(studentFields.length==6) {
					int id  = Integer.parseInt(studentFields[0]);
					String name  = studentFields[1];
					int age  = Integer.parseInt(studentFields[2]);
					String gender  = studentFields[3];
					float weight  = Float.parseFloat(studentFields[4]);
					boolean fit  = Boolean.parseBoolean(studentFields[5]);
				
				Student stu  = new Student();
							stu.setId(id);
							stu.setName(name);
							stu.setAge(age);
							stu.setGender(gender);
							stu.setWeight(weight);
							stu.setFit(fit);
				
				studentList[pos-1] = stu;
					pos++;
 				}else {
	               System.out.println("record field missing");
				}
			}
			
		} catch (IOException e ) {
			e.printStackTrace();
		} catch (Exception e ) {
			e.printStackTrace();
		}finally {
			if(br!=null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}//if
		}//finally
	     
	     int totalStudent  =  StudentUtil.getStudentCount(studentList);
	     
	     int totalAge  =  StudentUtil.getTotalAge(studentList);
		System.out.println("__________student report_________");
		StudentUtil.show(studentList);
		
		System.out.println("__________---------------_________");
		System.out.println("total Age" + totalAge);
		System.out.println("avg Age" + ((float)totalAge/totalStudent));
		
		System.out.println("which record you want search "
				+ "enter name for search");
		String nameSearch=new Scanner(System.in).nextLine();
		Student foundStudent  = StudentUtil.search(studentList,nameSearch);
		System.out.println((foundStudent==null)?"Not Found" :" found");
	}//main

}//class

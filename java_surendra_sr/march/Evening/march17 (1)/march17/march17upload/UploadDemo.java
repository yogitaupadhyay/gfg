import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
   
    create table nit_stu_img(
	id number primary key,
	stu_id number not null,
	file_name varchar2(50) ,
	file_data blob,
	when timestamp default sysdate
  );
  
  create sequence nsi_seq start with 1001;
  
  insert into nit_stu_img( ID, stu_id, file_name, file_data)
  values(nsi_seq.nextval,101,'test.jpg',null);
  
  select  ID, STU_ID, FILE_NAME from nit_stu_img;
 */

public class UploadDemo {

	public static void main(String[] args) {
		String uploadDir="E:\\stu_imgs\\";
	
		long stuId;
		String imageName=null;
		
		Scanner scan  = new Scanner(System.in);
		System.out.println("enter student id");
		stuId=Long.parseLong(scan.nextLine());
		System.out.println("enter image name");
		imageName  = scan.nextLine();
		
		
		 File  file  = new File(uploadDir +imageName);
		 //System.out.println(file);
		 if(file.exists()==false) {
			 System.out.println("given file not exist");
			 return;
		 }
		 
		 
		 
		 
		 FileInputStream fis  = null;
		 Connection con = null;
		 PreparedStatement  pstmt  = null;
		 try {
			 	fis = new FileInputStream(file);
			 	//file open
			 	//jdbc code
				Class.forName("oracle.jdbc.driver.OracleDriver");
				String url ="jdbc:oracle:thin:@localhost:1521:XE";
				con = DriverManager.getConnection(url,"system","root");
				String sql=" insert into nit_stu_img "
						+ "(ID, stu_id, file_name, file_data) "
						+ "values(nsi_seq.nextval,?,?,?)";
				pstmt = con.prepareStatement(sql);
				//set date
				pstmt.setLong(1, stuId);
				pstmt.setString(2, file.getName());
				//setBinaryStream(int pos, java.io.InputStream is, int length)
				pstmt.setBinaryStream(3, fis,(int) file.length());
				int r =pstmt.executeUpdate();
				System.out.println(r==1?"uploaded":" not uploaded");
			}catch(SQLException e){
				System.out.println("db Error : " + e.getMessage());
				e.printStackTrace();
			}catch(Exception e){
				System.out.println("Error : " + e.getMessage());
				e.printStackTrace();
			}finally{
				if(con!=null){
					try{
						con.close();
						System.out.println("db  closed");
					}catch(SQLException e){
						System.out.println("db close error " + e.getMessage());
						e.printStackTrace();
					}
				}//if not null
				
				if(fis!=null){
					try{
						fis.close();
					}catch(IOException e){
						System.out.println("file close error " + e.getMessage());
						e.printStackTrace();
					}
				}//if not null
			}//finally
			

	}

}

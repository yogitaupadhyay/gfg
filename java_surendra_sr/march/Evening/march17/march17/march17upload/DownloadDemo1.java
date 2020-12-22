import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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

public class DownloadDemo1 {

	public static void main(String[] args) {
		String donwloadDir="E:\\stu_imgs_download\\";
		long docId;
		
		Scanner scan  = new Scanner(System.in);
		System.out.println("enter doc id");
		docId=Long.parseLong(scan.nextLine());
		 
		 Connection con = null;
		 PreparedStatement  pstmt  = null;
		 ResultSet rs  =null;
		 InputStream dbInputStream = null;
		 FileOutputStream fos = null;
		 try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				String url ="jdbc:oracle:thin:@localhost:1521:XE";
				con = DriverManager.getConnection(url,"system","root");
				String sql="select * from nit_stu_img "
						+ " where id=?";
				pstmt = con.prepareStatement(sql);
				//set date
				pstmt.setLong(1, docId);
				rs  = pstmt.executeQuery();
				if(rs.next()) {
						long stuId =rs.getLong("stu_id");
						String fileName=rs.getString("file_name");
						dbInputStream  = rs.getBinaryStream("file_data");
						//save into local system
						File file  = new File(donwloadDir+fileName);
						fos = new FileOutputStream(file);
						//read write
						byte[]dataBuff  = new byte[1024];
						int readLength;
						while( (readLength = dbInputStream.read(dataBuff))!=-1) {
							fos.write(dataBuff, 0, readLength);
						}
						fos.close();
						//file must be close for permanent save
						System.out.println("file saved at "+ file.getAbsolutePath());
						dbInputStream.close();
					
				}else {
					System.out.println("no record found for doc id" +docId);
				}
				
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
				
			 
			}//finally
			

	}

}

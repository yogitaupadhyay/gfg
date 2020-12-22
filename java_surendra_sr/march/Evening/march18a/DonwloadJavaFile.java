import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

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

public class DonwloadJavaFile {

	// public static void main(String[] args) throws Exception{
	public static void main(String[] args) {
     Long studentId =null;
     String studentIdStr  = JOptionPane.showInputDialog("enter student id for file downlaod");
     studentId = Long.parseLong(studentIdStr);
		
	final String DOWNLOAD_DIR="E:\\java_download\\";	
		
	 Connection con = null;
	 PreparedStatement pstmt = null;
		try {
			 
			con = SisDbConnectionUtil.getConnection();
			String sql=" select * from  nit_stu_assignment "
					+ "where stu_id=? ";
			pstmt = con.prepareStatement(sql);
			pstmt.setLong(1, studentId);
			ResultSet rs  = pstmt.executeQuery();
			while(rs.next()) {
				//1_101_Greet.java
				 long id = rs.getLong("id");
				 String fileName = rs.getString("file_name");
				 Reader dbReader = rs.getCharacterStream("file_data");
				 //String saveFile=id+"_"+studentIdStr+"_"+fileName;
				 //String saveFile=System.currentTimeMillis()+"_"+fileName;
				 String saveFile=studentIdStr+"_"+System.currentTimeMillis()+"_"+fileName;
				 File file = new File(DOWNLOAD_DIR +saveFile);
				 FileWriter fw  = new FileWriter(file);
				 //read
				 int data;
				 while((data=dbReader.read())!=-1) {
					 fw.write(data);
				 }
				 //save
				 fw.close();
				 System.out.println("file saved "+ file.getAbsolutePath());
				 dbReader.close();
				//read  from db
				//save into 
				
			}
			
			
			
		} catch (SQLException e) {
			System.out.println("DB ERROR "+e.getMessage());

		} catch (Exception e) {
			System.out.println("other ERROR "+e.getMessage());
		} finally {
			try {
				SisDbConnectionUtil.closeConnection(con);
			} catch (SQLException e) {
				 System.out.println("DB Close ERROR "+e.getMessage());
			}
		}
	}

}

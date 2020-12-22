import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JFileChooser;
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

public class UploadJavaFile {

	// public static void main(String[] args) throws Exception{
	public static void main(String[] args) {
     Long studentId =null;
     File file  = null;
    String studentIdStr  = JOptionPane.showInputDialog("enter stu id");
     studentId = Long.parseLong(studentIdStr);
	JFileChooser chooser = new	JFileChooser();
	int returnCode = chooser.showOpenDialog(null);
	if(returnCode!=JFileChooser.APPROVE_OPTION) {
		System.out.println("file Not Selected...");
		return ;
	}
	file  = chooser.getSelectedFile();
	System.out.println(studentId);
	System.out.println(file);
		
		
		
		Connection con = null;
		PreparedStatement pstmt = null;
		FileReader fr = null;

		try {
			fr  = new FileReader(file);
			con = SisDbConnectionUtil.getConnection();
			String sql=" insert into nit_stu_assignment"
					+ "( ID, stu_id, file_name, file_data) "
					+ "values(nsa_seq.nextval,?,?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setLong(1, studentId);
			pstmt.setString(2, file.getName());
			pstmt.setCharacterStream(3, fr,(int)file.length());
			
			int r = pstmt.executeUpdate();
			if(r==1) {
				System.out.println("uploaded "+ file.getName() );
			}else {
				System.out.println("not uploaded");
			}
			//todo
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

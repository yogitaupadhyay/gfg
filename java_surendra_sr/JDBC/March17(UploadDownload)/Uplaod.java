import java.sql.*;
import java.util.*;
import java.io.*;

public class Upload{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("eneter stu_id");
		int stu_id=Integer.parseInt(scan.nextLine());
		JfileChooser chooser =new JFileChooser();
		int result=chooser.showOpenDialog(null);
		if(JFileChooser.APPROVE_OPTION!=result){
			System.out.println("no file choosen");
			System.exit();
		}
		File file=chooser.getSelectedFile();
		FileInputStream fis=null;
		Connection conn=null;
		PreparedStatement pstmt=null;
		int r;
		try{
			fis=new FileInputStream(file);
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:XE";
		 conn=DriverManager.getConnection(url,"System","Ig32mind$");
		 String sql="insert into stu_img1 (id,stu_id,f_name,f_data)values(seq.nextval,?,?,?)";
		 pstmt=conn.prepareStatement(sql);
		 pstmt.setInt(1,stu_id);
		 pstmt.setString(2,file.getName());
		 pstmt.setBinaryStream(3,fis,(int)file.length());
		 r=pstmt.executeUpdate();
		 System.out.println(r==1?"uploaded":"not uploaded");
		 
		 }catch(SQLException e){
			System.out.println("sql exception"+e.getMessage());
		}catch(Exception e){
		
			System.out.println("exception"+e.getMessage());
		}finally{
			try{
			if(conn!=null){
				conn.close();
			}
			}catch(SQLException e){
				System.out.println(e.getMessage());
			}
			try{
			if(fis!=null){
				fis.close();
			}	
			}catch(IOException e){
				System.out.println(e.getMessage());
			}
		}
		
		
		
	}
}
import java.sql.*;
import java.util.*;
import java.io.*;
import javax.swing.*;
public class Upload{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("eneter stu_id");
		long stu_id=Integer.parseInt(scan.nextLine());
		JFileChooser chooser =new JFileChooser();
		int result=chooser.showOpenDialog(null);
		if(JFileChooser.APPROVE_OPTION!=result){
			System.out.println("no file choosen");
			return;
		}
		File file=chooser.getSelectedFile();
		System.out.println(file);
		FileReader fr=null;
		Connection conn=null;
		PreparedStatement pstmt=null;
		int r;
		try{
			fr=new FileReader(file);
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:XE";
		 conn=DriverManager.getConnection(url,"System","Ig32mind$");
		 String sql="insert into stu_img2 (id,stu_id,f_name,f_data)values(seq.nextval,?,?,?)";
		 pstmt=conn.prepareStatement(sql);
		 pstmt.setLong(1,stu_id);
		 pstmt.setString(2,file.getName());
		 pstmt.setCharacterStream(3,fr,(int)file.length());
		 r=pstmt.executeUpdate();
		 System.out.println(r==1?"uploaded":"not uploaded");
		 
		 }catch(SQLException e){
			System.out.println("sql exception"+e.getMessage());
				e.printStackTrace();
		}catch(Exception e){
		
			System.out.println("exception"+e.getMessage());
				e.printStackTrace();
		}finally{
			try{
			if(conn!=null){
				conn.close();
			}
			}catch(SQLException e){
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			try{
			if(fr!=null){
				fr.close();
			}	
			}catch(IOException e){
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}
		
		
		
	}
}
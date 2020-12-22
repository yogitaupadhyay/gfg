import java.sql.*;
import java.util.*;
import java.io.*;

public class Download{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("eneter stu_id");
		int stu_id=Integer.parseInt(scan.nextLine());
		String downloadDir="C:\\Users\\pc\\Desktop\\yogita_upadhyay\\images\\download\\";
		
		
		FileWriter fw=null;
        Reader fr=null;
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:XE";
		 conn=DriverManager.getConnection(url,"System","Ig32mind$");
		 String sql="select * from stu_img2 where stu_id=?";
		 pstmt=conn.prepareStatement(sql);
		 pstmt.setInt(1,stu_id);		 
		 rs=pstmt.executeQuery();
		 while(rs.next()){
			 String name=rs.getString("f_name");
			fr=rs.getCharacterStream("f_data");//return java.io.inputStream
			File file=new File(downloadDir+name);
			fw=new FileWriter(file);
			int readdata;
			while((readdata=fr.read())!=-1){
				fw.write(readdata);
			}
			
		 }
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
			if(fr!=null){
				fr.close();
			}	
			}catch(IOException e){
				System.out.println(e.getMessage());
			
			}
			try{
			if(fw!=null){
				fw.close();
				System.out.println("file saved successfully");
			}	
			}catch(IOException e){
				System.out.println(e.getMessage());
			}
		}
		
		
		
	}
}
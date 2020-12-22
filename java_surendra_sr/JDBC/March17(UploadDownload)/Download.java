import java.sql.*;
import java.util.*;
import java.io.*;

public class Download{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("eneter stu_id");
		int stu_id=Integer.parseInt(scan.nextLine());
		String downloadDir="C:\\Users\\pc\\Desktop\\yogita_upadhyay\\images\\download\\";
		
		
		FileOutputStream fos=null;
		InputStream fis=null;
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:XE";
		 conn=DriverManager.getConnection(url,"System","Ig32mind$");
		 String sql="select * from stu_img1 where stu_id=?";
		 pstmt=conn.prepareStatement(sql);
		 pstmt.setInt(1,stu_id);		 
		 rs=pstmt.executeQuery();
		 while(rs.next()){
			 String name=rs.getString("f_name");
			fis=rs.getBinaryStream("f_data");//return java.io.inputStream
			File file=new File(downloadDir+name);
			fos=new FileOutputStream(file);
			byte bdata[]=new byte[1024*1024];
			int readsize;
			while((readsize=fis.read(bdata))!=-1){
				fos.write(bdata,0,readsize);
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
			if(fis!=null){
				fis.close();
			}	
			}catch(IOException e){
				System.out.println(e.getMessage());
			
			}
			try{
			if(fos!=null){
				fos.close();
				System.out.println("file saved successfully");
			}	
			}catch(IOException e){
				System.out.println(e.getMessage());
			}
		}
		
		
		
	}
}
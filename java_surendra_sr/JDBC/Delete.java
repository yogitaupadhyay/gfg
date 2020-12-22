import java.sql.*;
import java.util.*;

public class Delete{
	public static void main(String...sis)throws Exception{
		System.out.println("hellow");
		Connection con=null;
		Statement stmt=null;
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("driver loaded successfully");
		String url="jdbc:oracle:thin:@localhost:1521:XE";
		String user="System";
		String password="Ig32mind$";
		con=DriverManager.getConnection(url,user,password);
	    stmt=con.createStatement();
	   Scanner scan=new Scanner(System.in);
		System.out.println("enter delete  id");
		long id=Long.parseLong(scan.nextLine());
		
		String sql="delete from ball1 where id="+id;
	    int rs=stmt.executeUpdate(sql);
		System.out.println("total row updated : "+rs);
		}catch(SQLException e){
				System.out.println(" db error:"+e.getMessage());
			e.printStackTrace();
		} catch(Exception e){
				System.out.println("error:"+e.getMessage());
			
		}finally{
		
		if(con!=null){
			try{
			con.close();
			System.out.println("*****connection close*****");
			}catch(SQLException e){
				System.out.println("error:"+e.getMessage());
			}
		}
		}
		
		
		
		
	}
}

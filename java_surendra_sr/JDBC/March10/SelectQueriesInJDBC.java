import java.sql.*;
import java.util.*;


public class SelectQueriesInJDBC{
	public static void main(String args[]){
		
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:XE";
		 conn=DriverManager.getConnection(url,"System","Ig32mind$");
		 stmt=conn.createStatement();
		 String sql="select * from dept";
		 rs=stmt.executeQuery(sql);
		 while(rs.next()){
			 long id=rs.getLong("deptno");
			String name=rs.getString("dname");
			String location=rs.getString(3);
			
			System.out.printf("%10d",id);
			System.out.printf("%20s",name);
			System.out.printf("%10s",location);
			System.out.println();
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
		}
		
		
		
	}
}
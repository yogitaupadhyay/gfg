import java.sql.*;
import java.util.*;


public class SelectQueriesInJDBCDate{
	public static void main(String args[]){
		
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:XE";
		 conn=DriverManager.getConnection(url,"System","Ig32mind$");
		 stmt=conn.createStatement();
		 String sql="select * from emp";
		 rs=stmt.executeQuery(sql);
		 java.text.SimpleDateFormat sdf=new java.text.SimpleDateFormat("EEEE dd-MM-YYYY");
		 while(rs.next()){
			 long id=rs.getLong("empno");
			String name=rs.getString("ENAME");
			String job=rs.getString("JOB");
			java.sql.Date date=rs.getDate("HIREDATE");
			double salary=rs.getDouble("SAL");
			int deptno=rs.getInt("DEPTNO");
			String d=sdf.format(date);
			System.out.printf("%10d %15s %10s %27s %10s %10s",id,name,job,d,salary,deptno);
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
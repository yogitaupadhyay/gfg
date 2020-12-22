import java.sql.*;
import java.util.*;

public class  LoginSqlInjection{
	public static void main(String args[]){
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet r=null;
		Scanner scan=new Scanner(System.in);
		String username=null;
		char[] passwordchar=null;
		java.io.Console  console1=System.console();
		System.out.println("enter user name ");
		username=console1.readLine();
		System.out.println("enter user password ");
		passwordchar=console1.readPassword();
		String password=new String(passwordchar);
		
		 try{
		 Class.forName("oracle.jdbc.driver.OracleDriver");
		 String url="jdbc:oracle:thin:@localhost:1521:XE";
		 conn=DriverManager.getConnection(url,"System","Ig32mind$");
		 String sql="select * from login where username=? and  password=?";
	pstmt=conn.prepareStatement(sql); 
	pstmt.setString(1,username);
	pstmt.setString(2,password);
	 r=pstmt.executeQuery();
	if(r.next()){
		System.out.println("login successfull");
	}else{
		System.out.println("username or password wrong");
	}
		 }catch(SQLException e){
			 System.out.println("SQLException 1");
			e.printStackTrace();
		 }catch(Exception e){
			 System.out.println("Exception");
			 
		 }finally{
			 try{
			 if(conn!=null){
				 conn.close();
			 }
			 }catch(SQLException e){
				 System.out.println("SQLException ");
			 }
		 }
		 
		 
	}
}
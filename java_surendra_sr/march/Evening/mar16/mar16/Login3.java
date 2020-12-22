import java.sql.*;

public class Login3{

public static void main(String []args){


java.io.Console console1  = System.console();
System.out.print("enter login id>>");
String loginId  = console1.readLine();
System.out.print("enter login password>>");
char arrPass[] = console1.readPassword();
String loginPassword  = new String(arrPass);



Connection con = null;
 PreparedStatement  pstmt  = null;
 ResultSet rs  = null;
  try{
	  Class.forName("oracle.jdbc.driver.OracleDriver");
	  String url ="jdbc:oracle:thin:@localhost:1521:XE";
	  con = DriverManager.getConnection(url,"system","root");
	  String sql  = "select * from my_user where login_id=? and login_password=?";
	  pstmt  = con.prepareStatement(sql);
	  pstmt.setString(1,loginId);  
	  pstmt.setString(2,loginPassword);  
	  
	  rs  = pstmt.executeQuery();
	  if(rs.next()){
	     System.out.println("Login Success");
		 System.out.println("welcome user "+ rs.getString("user_name"));
	  }else{
	  System.out.println("invalid login id or password ");
	  
	  }
	  
	  
  }catch(SQLException e){
     System.out.println("db Error : " + e.getMessage());
	 e.printStackTrace();
  }catch(Exception e){
     System.out.println("Error : " + e.getMessage());
	 e.printStackTrace();
  }finally{
			  if(con!=null){
			       try{
						con.close();
						System.out.println("db  closed");
				  }catch(SQLException e){
						System.out.println("db close error " + e.getMessage());
						e.printStackTrace();
				  }
			  }//if not null
}//finally

}//main

}//class
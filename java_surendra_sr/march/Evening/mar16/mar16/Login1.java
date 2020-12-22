import java.sql.*;

public class Login1{

public static void main(String []args){

java.util.Scanner scan  = new java.util.Scanner(System.in);
System.out.println("enter login id");
String loginId  = scan.nextLine();
System.out.println("enter login password");
String loginPassword  = scan.nextLine();


Connection con = null;
 Statement  stmt  = null;
 ResultSet rs  = null;
  try{
	  Class.forName("oracle.jdbc.driver.OracleDriver");
	  String url ="jdbc:oracle:thin:@localhost:1521:XE";
	  con = DriverManager.getConnection(url,"system","root");
	  stmt  = con.createStatement();
	  String sql  = "select * from my_user where login_id=\'"+loginId+"\' and login_password=\'"+loginPassword+"\'";
	  System.out.println(sql);
	  rs  = stmt.executeQuery(sql);
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
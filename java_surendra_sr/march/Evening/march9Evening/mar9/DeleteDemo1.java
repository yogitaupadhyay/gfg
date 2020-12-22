import java.sql.*;

public class DeleteDemo1{

public static void main(String []args){

Connection con = null;
Statement stmt  = null;
java.util.Scanner scan  = new java.util.Scanner(System.in);
  try{
	  Class.forName("oracle.jdbc.driver.OracleDriver");
	  String url ="jdbc:oracle:thin:@localhost:1521:XE";
	  String user="system";
	  String password="root";
	  con = DriverManager.getConnection(url,user,password);
	  stmt  = con.createStatement();
	 System.out.println("enter id delete ball");
      long id=Long.parseLong(scan.nextLine());
	   String sql = "delete from ball where id =" + id;
	  int result  = stmt.executeUpdate(sql);
	  System.out.println("total row deleted = " + result);
	  
	  
	  System.out.println("+++OK+++");
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
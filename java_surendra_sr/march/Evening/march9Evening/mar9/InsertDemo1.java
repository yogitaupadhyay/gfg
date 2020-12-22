import java.sql.*;

public class InsertDemo1{

public static void main(String []args){

Connection con = null;
Statement stmt  = null;

  try{
	  Class.forName("oracle.jdbc.driver.OracleDriver");
	  String url ="jdbc:oracle:thin:@localhost:1521:XE";
	  String user="system";
	  String password="root";
	  con = DriverManager.getConnection(url,user,password);
	  stmt  = con.createStatement();
	  
	  //insert into ball(id,color,price)values(1,'red',50);
	  String sql = "insert into ball(id,color,price)values(2,'blue',150)";
	  int result  = stmt.executeUpdate(sql);
	  System.out.println("total row inserted = " + result);
	  
	  
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
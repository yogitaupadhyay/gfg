import java.sql.*;

public class Test1{

public static void main(String []args)throws Exception{

System.out.println("start");
Connection con = null;
Statement stmt  = null;

 Class.forName("oracle.jdbc.driver.OracleDriver");
 System.out.println("driver loaded ");
  
  String url ="jdbc:oracle:thin:@localhost:1521:XE";
  String user="system";
  String password="root";
  
  con = DriverManager.getConnection(url,user,password);
  System.out.println("db connected " +con);
  //step3 
  stmt  = con.createStatement();
  System.out.println("stmt created " + stmt);
  
  System.out.println("TODO");
  if(con!=null){
      con.close();
	  System.out.println("db dis-connected");
  }
 

}//main

}//class
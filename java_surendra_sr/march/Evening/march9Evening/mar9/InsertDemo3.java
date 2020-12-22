import java.sql.*;

public class InsertDemo3{

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
	  System.out.println("enter id");
      long id=Long.parseLong(scan.nextLine());
	  System.out.println("enter color");
	  String color=scan.nextLine();
	  System.out.println("enter price");
	  float price=Float.parseFloat(scan.nextLine());
	  // String sql = "insert into ball(id,color,price)values(2,'blue',150)";
	   String sql = "insert into ball(id,color,price)values("+id+",\'"+color+"\',"+price+")";
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
import java.sql.*;

public class InsertDeptDemo1{

public static void main(String []args){

java.util.Scanner scan  = new java.util.Scanner(System.in);
System.out.println("enter id");
long id =Long.parseLong( scan.nextLine());
System.out.println("enter name");
String name  = scan.nextLine();
System.out.println("enter location");
String location = scan.nextLine();


Connection con = null;
 Statement  stmt  = null;
 
  try{
	  Class.forName("oracle.jdbc.driver.OracleDriver");
	  String url ="jdbc:oracle:thin:@localhost:1521:XE";
	  con = DriverManager.getConnection(url,"system","root");
	  
	    stmt  = con.createStatement();
		String sql= "insert into dept (deptno,dname,loc)values("+id+",\'"+name+"\',\'"+location+"\')";
		int r  =stmt.executeUpdate(sql);
	  System.out.println("total record inserd "+r);
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
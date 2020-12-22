import java.sql.*;

public class InsertDeptDemo2{

public static void main(String []args){

java.util.Scanner scan  = new java.util.Scanner(System.in);
System.out.println("enter id");
long id =Long.parseLong( scan.nextLine());
System.out.println("enter name");
String name  = scan.nextLine();
System.out.println("enter location");
String location = scan.nextLine();


Connection con = null;
 PreparedStatement  pstmt  = null;
 
  try{
	  Class.forName("oracle.jdbc.driver.OracleDriver");
	  String url ="jdbc:oracle:thin:@localhost:1521:XE";
	  con = DriverManager.getConnection(url,"system","root");
	   
	   String sql= "insert into dept (deptno,dname,loc)values(?,?,?)";
	   pstmt  = con.prepareStatement(sql);
	   pstmt.setLong(1,id);
	   pstmt.setString(2,name);
	   pstmt.setString(3,location);
		int r  =pstmt.executeUpdate();
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
import java.sql.*;

public class SelectDemo4{

public static void main(String []args){

Connection con = null;
Statement stmt  = null;
ResultSet rs  = null;
  try{
	  Class.forName("oracle.jdbc.driver.OracleDriver");
	  String url ="jdbc:oracle:thin:@localhost:1521:XE";
	  con = DriverManager.getConnection(url,"system","root");
	  stmt  = con.createStatement();
	  String sql ="select empno,ename,job,sal,hiredate,deptno from emp ";
	  rs  =stmt.executeQuery(sql);
	  
	  java.text.SimpleDateFormat sdf = new  java.text.SimpleDateFormat();
	  sdf.applyPattern("EEE dd/MMM-yyyy");
	while(rs.next()){
		  long id = rs.getLong(1);
		  String name = rs.getString("ename");
		  java.sql.Date hireDate = rs.getDate("hiredate");
		  System.out.printf("%-5d",id);  
		  System.out.printf("%-20s",name);  
		  String strHireDate  = sdf.format(hireDate);
		  System.out.printf("%-25s",strHireDate);  
			
		System.out.println("____________________________________");
		  
		  
		  
		}//till end of records
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
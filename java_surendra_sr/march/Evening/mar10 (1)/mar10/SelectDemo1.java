import java.sql.*;

public class SelectDemo1{

public static void main(String []args){

Connection con = null;
Statement stmt  = null;
ResultSet rs  = null;
  try{
	  Class.forName("oracle.jdbc.driver.OracleDriver");
	  String url ="jdbc:oracle:thin:@localhost:1521:XE";
	  con = DriverManager.getConnection(url,"system","root");
	  stmt  = con.createStatement();
	  String sql ="select * from dept ";
	  rs  =stmt.executeQuery(sql);
	while(rs.next()){
		  long id = rs.getLong("deptno");
		  String name = rs.getString("dname");
		  String location = rs.getString(3);
		  //System.out.println(id+"\t"+name+"\t"+location);
		  System.out.printf("%-5d%-20s%-20s\n",id,name,location);
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
/*
@Author:Surendra Kumar Sao
	>>Software Architect and Corporate Trainer
	>>+9 year exp in (mumbai,pune,hyd,bangaluru)
	>>Java Certified SCJP & SCWCD with 98%
	Trained more than 5k students and employees.
    MCA from (NIT)National Institute of Technology Raipur(C.G.)
	Email : sur.nit.mca@gmail.com
	Mobile 7987234544, 9009442844
	https://www.urbanpro.com/raipur/surendra-kumar-sao/reviews/7223178
	https://www.urbanpro.com/raipur/surendra-kumar-sao/1334109?_tp=
 */

  //Date  16/02/2019
  
  import java.sql.Statement;
  import java.sql.Connection;
  import java.sql.DriverManager;
  import java.sql.SQLException;
  
  
 public class DropDemo {

	public static void main(String args[]){
	  Connection  con  = null;
	  Statement stmt  = null;
	  
	
	  try{
		Class.forName( "oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:XE";
		String user="system";
		String password="root";
	
			con  = DriverManager.getConnection(url,user,password);
	        stmt  = con.createStatement();
			String sql="drop  table ball";
			int result  = stmt.executeUpdate(sql);
			System.out.println("drop result " + result);
		
	  }catch(ClassNotFoundException e){
	      System.out.println("given driver class not loaded"); 
	  }catch(SQLException e){
	     System.out.println("SQL Error " +e.getMessage());
	  }catch(Exception e){
	     System.out.println("Error " +e.getMessage());
	  }finally{
	      if(con!=null){
		       try{
		       con.close();
			    System.out.println("db connection successfuly closed");
			   }catch(java.sql.SQLException e){
			       System.out.println("db  connection not cloased "+ e.getMessage());
			   }
			   
		  }
	  }
	  
	}//end main

}//end class
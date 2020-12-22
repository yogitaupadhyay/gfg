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
  
  import java.sql.Connection;
  import java.sql.DriverManager;
  import java.sql.SQLException;
  
  
 public class Jdbc1 {

	public static void main(String args[]){
	  Connection  con  = null;
	
	  try{
	    //Step 1 load driver
		Class.forName( "oracle.jdbc.driver.OracleDriver");
	    System.out.println("Driver Loaded successfuly");
		//step2 get connection
		String url="jdbc:oracle1:thin:@localhost:1521:XE";
		String user="system";
		String password="root";
		con  = DriverManager.getConnection(url,user,password);
		System.out.println("connected successfuly");
		  //todo
		
	  }catch(ClassNotFoundException e){
	      System.out.println("given driver class not loaded"); 
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
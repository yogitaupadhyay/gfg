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
  import java.sql.Statement;
  import java.sql.DriverManager;
  import java.sql.SQLException;
  
  
 public class Jdbc2 {

	public static void main(String args[])throws Exception{
   
		Class.forName( "oracle.jdbc.driver.OracleDriver");
		System.out.println("driver loaded");
		
		Connection  con  = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","root");
		System.out.println("connected" + con);
		
		Statement stmt = con.createStatement();
		System.out.println("statment object created" + stmt);
		
		 con.close();
	  System.out.println("done");
	}//end main

}//end class
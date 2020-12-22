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

  //Date  17/02/2019
  import java.sql.DriverManager;
  import java.sql.Connection;
  import java.sql.Statement;
  import java.sql.ResultSet;
  import java.sql.SQLException;
  
 public class Req1 {

	public static void main(String args[])throws Exception{
		Connection con = null;		Statement stmt= null;		ResultSet rs  = null;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","root");
		stmt  = con.createStatement();
		String sql = "select * from emp";
		rs  = stmt.executeQuery(sql);
				while(rs.next()){
					   int id  = rs.getInt("empno");
					   String name  = rs.getString("ename");
					   float salary  = rs.getFloat("sal");
					   java.sql.Date dob  = rs.getDate("HIREDATE");
					   System.out.println(id  +"\t"+name+"\t" +salary+"\t" +dob);
				}//end of while
		con.close();
	}//end main
}//end class
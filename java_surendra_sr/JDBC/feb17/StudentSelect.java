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
  
 public class StudentSelect {

	public static void main(String args[]){
	
	java.util.Scanner scan  = new java.util.Scanner(System.in);
	 
		
		Connection con = null;
		Statement stmt= null;
		ResultSet rs  = null;
		try{
		  Class.forName("oracle.jdbc.driver.OracleDriver");
		   con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","root");
		   stmt  = con.createStatement();
		   String sql = "select * from stu";
			rs  = stmt.executeQuery(sql);
		    while(rs.next()){
			   int id  = rs.getInt("id");
			   String name  = rs.getString("name");
			   int age  = rs.getInt("age");
			   //String dob  = rs.getString("dob");
			   java.sql.Date dob  = rs.getDate("dob");
			   System.out.println(id  +"\t"+name+"\t" +age+"\t" +dob);
			   
			}//end of while

			
		}catch(SQLException e){
		   System.out.println("db error "+ e.getMessage());
		   e.printStackTrace();
		}catch(Exception e){
		   System.out.println("ERROR "+ e.getMessage());
		   e.printStackTrace();
		}finally{
				if(con!=null){
				   try{
				      con.close();
				   }catch(Exception e){
				     System.out.println("connection closing problem " +e.getMessage());
				   }
				   
				}
		}
		
	  
	}//end main

}//end class
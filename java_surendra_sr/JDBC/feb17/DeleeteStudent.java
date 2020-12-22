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
  import java.sql.SQLException;
  
 public class DeleeteStudent {

	public static void main(String args[]){
	
	java.util.Scanner scan  = new java.util.Scanner(System.in);
		int id;
				
		System.out.println("enter  id  to delete record ");
		id  = Integer.parseInt(scan.nextLine());
		
		Connection con = null;
		Statement stmt= null;
		
		try{
		  Class.forName("oracle.jdbc.driver.OracleDriver");
		   con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","root");
		   stmt  = con.createStatement();
		   String sql = "delete  from stu  where id="+id;
		   int totalResult  = stmt.executeUpdate(sql);
		   System.out.println("total record deleted  " + totalResult);
		
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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.Scanner;

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
 
   CurrentYear 2019 
 */

public class SqlInject {
 
	public static void main(String[] args) {
		 
			Connection con = null;
			Statement stmt= null;
			ResultSet rs = null;
			try{
			  Class.forName("oracle.jdbc.driver.OracleDriver");
			   con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","root");
               stmt = con.createStatement();
               /*String id="sis1";
               String password="123";*/
               
               Scanner scan = new Scanner(System.in);
               System.out.println("enter user id");
               String id=scan.nextLine();
               System.out.println("enter user password");
               String password=scan.nextLine();
               
               String sql="select  * from sis_user where id=\'"+id+"\' and password=\'"+password+"\'";
			   rs = stmt.executeQuery(sql);
			   while(rs.next()) {
				   String role = rs.getString("role");
				   System.out.println("login success :your Role is  "+role );
			   }
			   
			   
			   
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

	}

}

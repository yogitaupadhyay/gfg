import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

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

public class Req1 {
 
	public static void main(String[] args) {
		 
			Connection con = null;
			Statement stmt= null;
			Random rand  = new Random();
			try{
			  Class.forName("oracle.jdbc.driver.OracleDriver");
			   con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","root");
			   stmt  = con.createStatement();
			   long start = System.currentTimeMillis();
			   for(int sno=1;sno<=10000;sno++) {
			   int num1= rand.nextInt(100000);
			        //for each time 
				   String sql = "insert into my_table(num)values("+num1+")";
				   int totalResult  = stmt.executeUpdate(sql);
			   }
			   
			   long end  = System.currentTimeMillis();
			   System.out.println("10000 record inserted in time "+(end-start)+"ms");
			   
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

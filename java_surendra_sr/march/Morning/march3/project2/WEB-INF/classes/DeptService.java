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

  //Date  03/03/2019
  import javax.servlet.*;
  import java.io.*;
  import java.sql.*;
  
 public class DeptService extends GenericServlet{ 
 public   void service(ServletRequest req, ServletResponse response) 
			throws  ServletException, IOException{
			 
			//html code
				PrintWriter  pw  = response.getWriter();
			  pw.print("<html>");
			  pw.print("<body >");
			  
			  
			    //------------start jdbc code
			  Connection con  = null;
			  Statement stmt  = null;
			  ResultSet rs  = null;
			   try{
			      Class.forName("oracle.jdbc.driver.OracleDriver");
				  String url ="jdbc:oracle:thin:@localhost:1521:XE";
				  con  = DriverManager.getConnection(url,"system","root");
			      stmt  = con.createStatement();
				  rs  = stmt.executeQuery("select * from dept");
					 
					 while(rs.next()){
						//System.out.print(rs.getLong("deptno") +" :: " + rs.getString("dname"));
						long id  =rs.getLong("deptno"); 
						String name  = rs.getString("dname");
						pw.print( id + " :: " + name  +  "<hr>");
					  }
			   
			   }catch(Exception e){
						pw.print("error : " + e.getMessage());
			   }finally{
			       try{
			            con.close();
					}catch(Exception e){
							pw.print("closing error  : " + e.getMessage());
					}
			   }//finally
			   
			    //-------------end jdbc code
			  
			  pw.print("</body>");
			  pw.print("</html>");
	}//service
 
 }//End of class 

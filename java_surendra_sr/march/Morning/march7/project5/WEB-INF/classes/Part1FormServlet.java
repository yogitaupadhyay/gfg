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
  import java.sql.*;
  import java.io.*;
  import javax.servlet.*;
  
 public class Part1FormServlet extends GenericServlet{ 
 public   void service(ServletRequest request, ServletResponse response) 
			throws  ServletException, IOException{
	 		
			 
			PrintWriter  pw  = response.getWriter();
			  pw.print("<html>");
			  pw.print("<body >");
			  pw.print("<h1>All Departement</h1>");
			  pw.print("<a href='sis.html' >back to home</a>");
			  
			  
			  pw.print("<form action='part2' >");
			  pw.print("<select name='dept_no'>");
			  
			  Connection con = null;
			  Statement stmt =null;
			  ResultSet rs = null;
			  try{
			      Class.forName("oracle.jdbc.driver.OracleDriver");
			      con  = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","root");
				  stmt = con.createStatement();
				  String sql  ="select * from dept";
				  rs  = stmt.executeQuery(sql);
				  
					  while(rs.next()){
						  long id =rs.getLong("deptno");
						  String name = rs.getString("dname");
						   pw.print("<option value=\'"+id+"\'>"+name+"</option>");
					  }
			   }catch(Exception e){
					     e.printStackTrace();
			   }finally{
			     
			        if(con!=null){
					   try{
						con.close();
					   }catch(Exception e){
					     e.printStackTrace();
					   }
					}
			   }	
			 
			  
			  
			  pw.print("</select >");
			  pw.print("<input type='submit' value='show employees'>");
			  pw.print("</form>");
			  pw.print("</body>");
			  pw.print("</html>");
	}//service
 
 }//End of class 

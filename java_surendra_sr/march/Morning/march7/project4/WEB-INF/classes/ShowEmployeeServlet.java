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
  
 public class ShowEmployeeServlet extends GenericServlet{ 
 public   void service(ServletRequest request, ServletResponse response) 
			throws  ServletException, IOException{
			
			PrintWriter  pw  = response.getWriter();
			  pw.print("<html>");
			  pw.print("<body >");
			  pw.print("<h1>All Employees</h1>");
			  pw.print("<a href='sis.html' >back to home</a>");
			  
			  pw.print("<table border='1'>");
			  pw.print("<tr>");
			  pw.print("<th>id</th>");
			  pw.print("<th>name</th>");
			  pw.print("<th>job</th>");
			  pw.print("<th>sal</th>");
			  pw.print("<th>dept no</th>");
			  pw.print("</tr>");
			  
			  Connection con = null;
			  Statement stmt =null;
			  ResultSet rs = null;
			  try{
			      Class.forName("oracle.jdbc.driver.OracleDriver");
			      con  = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","root");
				  stmt = con.createStatement();
				  String sql  ="select * from emp";
				  rs  = stmt.executeQuery(sql);
					  while(rs.next()){
						  long id =rs.getLong("empno");
						  String name = rs.getString("ename");
						  String job = rs.getString("job");
						  float salary  = rs.getFloat("sal");
						  long deptno =rs.getLong("deptno");
						  
						   pw.print("<tr>");
						  pw.print("<td>"+id+"</td>");
						  pw.print("<td>"+name+"</td>");
						  pw.print("<td>"+job+"</td>");
						  pw.print("<td>"+salary+"</td>");
						  pw.print("<td>"+deptno+"</td>");
						  pw.print("</tr>");
						  
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
			  pw.print("</table>");
			  
			  
			  pw.print("</body>");
			  pw.print("</html>");
	}//service
 
 }//End of class 

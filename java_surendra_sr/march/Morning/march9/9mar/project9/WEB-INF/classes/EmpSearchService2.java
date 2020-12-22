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
  
 public class EmpSearchService2 extends GenericServlet{ 
 public   void service(ServletRequest request, ServletResponse response) 
			throws  ServletException, IOException{
		  
			String searchText;
			searchText = request.getParameter("search_text");
			
			
			PrintWriter  pw  = response.getWriter();
			  pw.print("<html>");
			  pw.print("<body >");
			  pw.print("<a href='sis.html' >back to home</a><hr>");
			  pw.print("<form action=\"search2\">");
			  pw.print("<input name=\"search_text\"  required  autofocus=\"autofocus\" placeholder=\"enter emp name\">");
			  pw.print(" <input type=\"submit\" value=\"Search Employee\">");
			  pw.print("</form>");
			  
			  pw.print("<h1>All Employees</h1>");
			  pw.print("<table border='1'  width='100%' > ");
			  pw.print("<tr>");
			  pw.print("<th>id</th>");
			  pw.print("<th>name</th>");
			  pw.print("<th>job</th>");
			  pw.print("<th>salary</th>");
			  pw.print("<th>deptno</th>");
			  pw.print("<th>Action</th>");
			  pw.print("</tr>");
			  boolean foundRecord=false;
			  Connection con = null;
			  Statement stmt =null;
			  ResultSet rs = null;
			  try{
			      Class.forName("oracle.jdbc.driver.OracleDriver");
			      con  = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","root");
				  stmt = con.createStatement();
				  String sql  ="select * from emp  where  lower(ename) like lower('%"+searchText+"%')";
				  
				  rs  = stmt.executeQuery(sql);
					  while(rs.next()){
					  foundRecord =true;
						  long id =rs.getLong("empno");
						  String name = rs.getString("ename");
						  String job = rs.getString("job");
						  float salary = rs.getFloat("sal");
						  long deptno =rs.getLong("deptno");
						  
						  pw.print("<tr>");
						  pw.print("<td>"+id+"</td>");
						  pw.print("<td>"+name+"</td>");
						  pw.print("<td>"+job+"</td>");
						  pw.print("<td>"+salary+"</td>");
						  pw.print("<td>"+deptno+"</td>");
						  pw.print("<td>");
						  pw.print("<a href=\'#?id="+id+"\'>delete</a><br>");
						  pw.print("<a href=\'#?id="+id+"\'>update</a>");
						  pw.print("</td>");
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
			   
			   if(foundRecord==false){
						  pw.print("<tr>");
						  pw.print("<td colspan='6' align='center'><span style='font-size:50px;color:red;'>NO Record found</span></td>");
						  pw.print("</tr>");
			   }
			   
			  pw.print("</table>");
			  
			  
			  pw.print("</body>");
			  pw.print("</html>");
	}//service
 
 }//End of class 

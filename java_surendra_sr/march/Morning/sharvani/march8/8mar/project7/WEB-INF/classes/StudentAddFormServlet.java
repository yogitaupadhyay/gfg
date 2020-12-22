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
  
 public class StudentAddFormServlet extends GenericServlet{ 
 public   void service(ServletRequest request, ServletResponse response) 
			throws  ServletException, IOException{
		 
			
			PrintWriter  pw  = response.getWriter();
			  pw.print("<html>");
			  pw.print("<body >");
			  pw.print("<a href='sis.html' >back to home</a>");
			  pw.print("<h1>Student form</h1>");
			  pw.print("<h1>toda :" + new java.util.Date()+"</h1>");
			  pw.print("<form action='addstudent'>");
			  pw.print("id<input name='stu_id' ><br>");
			  pw.print("name<input name='stu_name' ><br>");
			  pw.print("age<input name='stu_age' ><br>");
			  pw.print("branch<input name='stu_branch' ><br>");
			  pw.print("<input type='submit' value='Add Student' ><br>");
			  pw.print("</form>");
			  
			  pw.print("</body>");
			  pw.print("</html>");
	}//service
 
 }//End of class 

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
  
 public class UpdateStudentFormServlet extends GenericServlet{ 
 public   void service(ServletRequest request, ServletResponse response) 
			throws  ServletException, IOException{
			
				  //get all parameter
		 String  stuIdStr= request.getParameter("id");
		 long id  = Long.parseLong(stuIdStr);
		 
			 
			  
			  	PrintWriter  pw  = response.getWriter();
			  pw.print("<html>");
			  pw.print("<body >");
			  pw.print("<h1>All Employees</h1>");
			  pw.print("<a href='sis.html' >back to home</a>");
			  pw.print("<a href='addform' >Add Student</a>");
			  
			 
			  Connection con = null;
			  Statement stmt =null;
			  ResultSet rs = null;
			  try{
			      Class.forName("oracle.jdbc.driver.OracleDriver");
			      con  = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","root");
				  stmt = con.createStatement();
				  String sql  ="select * from student where id="+id;
				  rs  = stmt.executeQuery(sql);
				 if(rs.next()){
						  //comes from user click //long id =rs.getLong("id");
						  String name = rs.getString("name");
						  String branch = rs.getString("branch");
						  int age  = rs.getInt("age");
						  
							pw.print("<form action='updateStudent'>");
							pw.print("id<input name='stu_id' value=\'"+id+"\' readonly='readonly'><br>");
							pw.print("name<input name='stu_name' value=\'"+name+"\'><br>");
							pw.print("age<input name='stu_age' value=\'"+age+"\'><br>");
							pw.print("branch<input name='stu_branch' value=\'"+branch+"\'><br>");
							pw.print("<input type='submit' value='Update Student' ><br>");
							pw.print("</form>");
					  }//end if 
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
			  
			  
			  
			  
	}//service
 
 }//End of class 

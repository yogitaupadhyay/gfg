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
  
 public class UpdateStudentServlet extends GenericServlet{ 
 public   void service(ServletRequest request, ServletResponse response) 
			throws  ServletException, IOException{
		 
		 
		 //get all parameter
		 String  idStr= request.getParameter("stu_id");
		 long id  = Long.parseLong(idStr);
		 
		 String  ageStr= request.getParameter("stu_age");
		  int age  =Integer.parseInt(ageStr);
		 String  name = request.getParameter("stu_name");
		 String  branch= request.getParameter("stu_branch");
		 
		 //insert into db 
		 //--update student set name=?,age=?,branch=?  where id=?
			PrintWriter  pw  = response.getWriter();
			  pw.print("<html>");
			  pw.print("<body >");
			  pw.print("<a href='sis.html' >back to home</a> ");
			  pw.print("<a href='addform' >Add Student</a> ");
			  pw.print("<a href='showall' >Show all student</a>");
			  
		 
			  
			  Connection con = null;
			  PreparedStatement pstmt =null;
			  ResultSet rs = null;
			  try{
			      Class.forName("oracle.jdbc.driver.OracleDriver");
			      con  = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","root");
				  String sql="update student set name=?,age=?,branch=?  where id=?"; 
				  pstmt = con.prepareStatement(sql);
				  pstmt.setString(1,name);
				  pstmt.setInt(2,age);
				  pstmt.setString(3,branch);
				  pstmt.setLong(4,id);
				  int result  = pstmt.executeUpdate();
				  if(result==1){
					pw.print("<h1>student ("+id+" "+name+") Updated successfuly</h1>");
				  }else{
				  pw.print("student NOT Update ");
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
			  
			  pw.print("</body>");
			  pw.print("</html>");
	}//service
 
 }//End of class 

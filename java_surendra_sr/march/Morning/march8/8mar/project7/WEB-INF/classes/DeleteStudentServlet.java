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
  
 public class DeleteStudentServlet extends GenericServlet{ 
 public   void service(ServletRequest request, ServletResponse response) 
			throws  ServletException, IOException{
		 
			  //get all parameter
		 String  stuIdStr= request.getParameter("id");
		 long id  = Long.parseLong(stuIdStr);
		 
		 
		 
		 //insert into db 
		 //--insert into student(id,name,branch,age)values(?,?,?,?)
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
				  String sql="delete from student where id=?"; 
				  pstmt = con.prepareStatement(sql);
				  pstmt.setLong(1,id);

				  int result  = pstmt.executeUpdate();
				  if(result==1){
					pw.print("<h1 style='color:green;'>student Deleted successfuly</h1>");
				  }else{
				  pw.print("<h1 style='color:red;'>student NOT NOT added </h1>");
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

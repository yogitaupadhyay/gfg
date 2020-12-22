 import java.io.*;
  import java.util.*;
  import java.sql.*;
  import javax.servlet.*;
  
 public class DepartmentShowController extends GenericServlet{ 
 public   void service(ServletRequest request, ServletResponse response) 
			throws  ServletException, IOException{
			 
			  java.util.List<Department> list = new ArrayList<Department>();
			 
			 //todo
			 Connection con  = null;
			 Statement stmt =null;
			 ResultSet rs  = null;
			 
			 try{
			    con  = SisDbConnectionUtil.getConnection();
				stmt  = con.createStatement();
				rs  = stmt.executeQuery("select * from dept");
				while(rs.next()){
				   long id  = rs.getLong(1);
				   String name = rs.getString(2);
				   String location = rs.getString("loc");
				   
				   Department  tempDept  = new Department();
									   tempDept.setId(id);
									   tempDept.setName(name);
									   tempDept.setLocation(location);
				list.add(tempDept);
				}
				
			 }catch(Exception  e ){
					    e.printStackTrace();
			 
			 }finally{
			    if(con !=null){
				     try{
					    con.close();
					 }catch(Exception e){
					    e.printStackTrace();
					 }
				}
			 
			 }
			 
			 
			 String type  = request.getParameter("type");
			 
			RequestDispatcher rd  = null;
			if("excel".equals(type)){
			rd  =  request.getRequestDispatcher("deptExcelView");
			}else{
				rd  =  request.getRequestDispatcher("deptView");
			}
			
			 
			request.setAttribute("deptlist" ,list);
			rd.forward(request,response);
			
			
			
			 
	}//service
 
 }//End of class 

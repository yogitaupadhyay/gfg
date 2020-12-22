<%@page import="sis.com.SisDbConnectionUtil"%>
<%@page import="java.sql.*"%>
 
	 <%
	 Long id  = Long.parseLong(request.getParameter("id"));
	 
	  Connection con = null;
	  Statement stmt = null;
	  ResultSet rs  = null;
	  boolean isDeleted =false;
	  try{
		  con  = SisDbConnectionUtil.getConnection();
		  stmt  = con.createStatement();
		  String sql  ="delete  from dept2 where deptno="+id;
			int r = stmt.executeUpdate(sql);
			if(r==1){isDeleted=true;}
	  }catch(Exception e){
			  out.print(e.getMessage());
	  }finally{
		  try{
		  SisDbConnectionUtil.closeConnection(con);
		  }catch(Exception e){
			  out.print(e.getMessage());
		  }
	  }
	  
	  
	  response.sendRedirect("show_all_dept.jsp?delete_msg="+isDeleted);
	  
	 %>
	 
	  
<%@page import="java.sql.*"%>
<%@page import="sis.com.SisDbConnectionUtil"%>
<%
long id= Long.parseLong(request.getParameter("dept_id"));
String name  = request.getParameter("dept_name");
String loc  = request.getParameter("dept_loc");


Connection con = null;
PreparedStatement pstmt = null;
ResultSet rs  = null;
boolean isUpdated =false;
try{
	  con  = SisDbConnectionUtil.getConnection();
	  String sql  ="update dept2 set dname=?,loc=? where deptno=?";
	  pstmt  = con.prepareStatement(sql);
	  pstmt.setString(1, name);
	  pstmt.setString(2, loc);
	  pstmt.setLong(3, id);
	   int r = pstmt.executeUpdate();
		if(r==1){isUpdated=true;}
	}catch(Exception e){
		  out.print(e.getMessage());
}finally{
	  try{
	  SisDbConnectionUtil.closeConnection(con);
	  }catch(Exception e){
		  out.print(e.getMessage());
	  }
}


response.sendRedirect("show_all_dept.jsp?update_msg="+isUpdated);


%>
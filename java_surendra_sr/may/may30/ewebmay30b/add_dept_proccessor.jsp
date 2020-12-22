<%@page import="java.sql.*"%>
<%@page import="sis.com.SisDbConnectionUtil"%>
<%
long id= Long.parseLong(request.getParameter("dept_id"));
String name  = request.getParameter("dept_name");
String loc  = request.getParameter("dept_loc");


Connection con = null;
PreparedStatement pstmt = null;
ResultSet rs  = null;
boolean isInserted =false;
try{
	  con  = SisDbConnectionUtil.getConnection();
	  String sql  ="insert into dept2 values(?,?,?)";
	  pstmt  = con.prepareStatement(sql);
	  pstmt.setLong(1, id);
	  pstmt.setString(2, name);
	  pstmt.setString(3, loc);
	   int r = pstmt.executeUpdate();
		if(r==1){isInserted=true;}
	}catch(Exception e){
		  out.print(e.getMessage());
}finally{
	  try{
	  SisDbConnectionUtil.closeConnection(con);
	  }catch(Exception e){
		  out.print(e.getMessage());
	  }
}


response.sendRedirect("show_all_dept.jsp?add_msg="+isInserted);


%>
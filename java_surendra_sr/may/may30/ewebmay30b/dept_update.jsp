<%@page import="java.sql.*"%>
<%@page import="sis.com.SisDbConnectionUtil"%>
<%@page import="sis.com.Department"%>
<%@include file="sis_header.jsp" %>
	<!-- context section start -->
	<div id="content_section">
	 
	 
	 <%
	 Long id  = Long.parseLong(request.getParameter("id"));
		
	 Department dept = null;
	  Connection con = null;
	  Statement stmt = null;
	  ResultSet rs  = null;
	  try{
		  con  = SisDbConnectionUtil.getConnection();
		  stmt  = con.createStatement();
		  String sql  ="Select * from dept2 where deptno="+id;
		  rs  = stmt.executeQuery(sql);
		  if(rs.next()){
			  //long id  = rs.getLong("deptno");
			  String name  = rs.getString("dname");
			  String location  = rs.getString("loc");
			  
			  dept  = new Department();
			  dept.setId(id);
			  dept.setName(name);
			  dept.setLocation(location);
		  }
	  }catch(Exception e){
			  out.print(e.getMessage());
	  }finally{
		  try{
		  SisDbConnectionUtil.closeConnection(con);
			  
		  }catch(Exception e){
			  out.print(e.getMessage());
		  }
	  }
	  
	 %>
	 
	 
	 <center>
	    <fieldset style="width: 50%;background-color: pink;">
	    
	    <legend>Update Department</legend>
	   <form action="update_dept_proccessor.jsp" method="post" >
	        <table>
	        
	         <tr>
	           <td>Dept ID</td>
	           <td>
	           <input type="text" name="dept_id"
	            value="<%=dept.getId()%>" readonly="readonly"
	           autofocus="autofocus"
	           style="background-color: #ddcfcf;"
	           ></td>
	         </tr>
	         
	         <tr>
	           <td>Dept name</td>
	           <td>
	           <input type="text" name="dept_name" 
	           value="<%=dept.getName()%>"
	           ></td>
	         </tr>
	         
	         <tr>
	           <td>Dept location</td>
	           <td><input type="text" name="dept_loc" value="<%=dept.getLocation()%>"></td>
	         </tr>
	        
	         <tr>
	           <td colspan="2" align="right">
	           <input type="submit" value="update dept"></td>
	         </tr>
	        </table>
	        
	   </form>
	    </fieldset>
	 
	</center>
	 
	
	</div>
	<!-- context section end -->
<%@include file="sis_footer.jsp" %>
	
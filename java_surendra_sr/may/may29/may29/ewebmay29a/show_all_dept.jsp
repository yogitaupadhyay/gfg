<%@page import="sis.com.SisDbConnectionUtil"%>
<%@page import="sis.com.Department"%>
<%@page import="java.util.*"%>
<%@page import="java.sql.*"%>
<%@include file="sis_header.jsp" %>
<%=application.getRealPath("/") %>
	<!-- context section start -->
	<div id="content_section">
	 <%
	  List<Department> deptList  = null;
	  deptList  = new ArrayList<Department>();
	  Connection con = null;
	  Statement stmt = null;
	  ResultSet rs  = null;
	  try{
		  con  = SisDbConnectionUtil.getConnection();
		  stmt  = con.createStatement();
		  String sql  ="Select * from dept";
		  rs  = stmt.executeQuery(sql);
		  while(rs.next()){
			  long id  = rs.getLong("deptno");
			  String name  = rs.getString("dname");
			  String location  = rs.getString("loc");
			  
			  Department dept  = new Department();
			  dept.setId(id);
			  dept.setName(name);
			  dept.setLocation(location);
			  deptList.add(dept);
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
	    
	    <legend>Search Department</legend>
	   <form action="#" >
	        <table>
	        
	         <tr>
	           
	           <td><input class="search" type="text" name="search_name" placeholder="Enter dept name"></td>
	           <td align="right"><input  class="search" type="submit" value="Search"></td>
	         </tr>
	         </tr>
	        </table>
	        
	   </form>
	    </fieldset>
	</center>
	 <hr style="background-color: red;" size="11">
	 
	<table width="100%" border="1" style="text-align: center;">
	 <tr>
	   <th>ID</th>
	   <th>NAME</th>
	   <th>Location</th>
	   <th>Action</th>
	 </tr>
	 
	 
	<%for(Department dept:deptList){ %>
	 <tr>
	   <td><%=dept.getId() %></td>
	   <td><%=dept.getName() %></td>
	   <td><%=dept.getLocation() %></td>
	   <td> 
	      <a href="deptupdate?id=<%=dept.getId()%>">update</a> &nbsp;&nbsp;
	      <a href="deptdelete?id=<%=dept.getId()%>" class="delete"> <img alt="" src="imgs/delete.png"> delete</a> 
	   </td>
	 </tr>
	 <%} %>
	 
	 	</table>
	
	
	
	</div>
	<!-- context section end -->
<%@include file="sis_footer.jsp" %>
	
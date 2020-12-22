<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="sis.com.Department"%>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<%
/* Department dept  = null;
    if(request.getAttribute("dept")!=null){
    	dept  = (Department)request.getAttribute("dept");
    }else{
    	dept = new Department();
    	
    }  */   
%>
<jsp:useBean id="dept" class="sis.com.Department" scope="request" />


<table border="1">
  <caption>Dept Details</caption>
   <tr>
    <td>ID</td>
    <td>
     <%-- <%if(dept!=null){ %> --%>
    	<%=dept.getId() %>
    <%-- <%} %> --%>
    
    </td>
   </tr> 
   <tr> 
    <td>Name</td><td><%=dept.getName() %></td>
   </tr> 
   
   <tr> 
    <td>Location</td><td><%=dept.getLocation() %></td>
   </tr>
</table>
<hr>

<table border="1">
  <caption>Dept Details</caption>
   <tr>
    <td>ID</td>
    <td>
      <jsp:getProperty property="id" name="dept"/>
    </td>
   </tr> 
   <tr> 
    <td>Name</td><td> <jsp:getProperty property="name" name="dept"/></td>
   </tr> 
   
   <tr> 
    <td>Location</td><td> <jsp:getProperty property="location" name="dept"/></td>
   </tr>
</table>

</body>
</html>
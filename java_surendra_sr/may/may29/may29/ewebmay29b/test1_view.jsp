<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.util.List"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
 List<Integer>list  = (List<Integer>)request.getAttribute("data");
%>

<%for(Integer ob: list){ %>
    <h1><%=ob %></h1>
   <hr>
  
<%} %>
</body>
</html>
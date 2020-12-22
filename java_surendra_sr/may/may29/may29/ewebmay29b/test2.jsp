<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="java.util.List"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <h1>main page1 </h1>
 
 <%-- <%
 RequestDispatcher rd  = request.getRequestDispatcher("test2_helper.jsp");
rd.include(request, response);
 %> --%>
 <!-- html comment -->
 <%-- jsp comment --%>
 <%-- <jsp:include page="test2_helper.jsp"/> --%>
 <jsp:include page="test2_helper.jsp">
    <jsp:param  name="p1"  value="success"/>
    <jsp:param  name="p2"  value="100"/>
 </jsp:include>
 
</body>
</html>
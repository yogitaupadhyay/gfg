<%@page import="java.util.*" %>
<html>
<head>
<title></title>
</head>

<body>
   
  <%
     	Date now  = new Date();
		out.print("today date & time = " + now);
	%>
<hr>
Today Date &  Time : <%=now%>
   
 </body>
</html>
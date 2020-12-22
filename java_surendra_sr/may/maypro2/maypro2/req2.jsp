<%@page import="java.util.*" %>
<html>
<head>
<title></title>
</head>

<body>
   
  <%
      response.setHeader("refresh","1");
  
		Date now  = new Date();
	%>

Today Date &  Time : <%=now%>
   
 </body>
</html>
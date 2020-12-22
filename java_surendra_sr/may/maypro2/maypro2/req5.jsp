
<html>
<head>
<title></title>
</head>
<%=getServletContext().getServerInfo()%>
<hr>
<%=application.getServerInfo()%>
<hr>
<%=application.getRealPath("/")%>
<hr>

<%=application.getContextPath()%><hr>
sis= <%=application.getInitParameter("sis")%><hr>
jsp  = <%=application.getInitParameter("jsp")%><hr>
sis+jsp  = <%=application.getInitParameter("sis")+application.getInitParameter("jsp")%><hr>
   
   <%
		String s1  = application.getInitParameter("sis");
		String s2  = application.getInitParameter("jsp");
   %>
 sis+ jsp  = <%=s1+s2%>   
   
 </body>
</html>
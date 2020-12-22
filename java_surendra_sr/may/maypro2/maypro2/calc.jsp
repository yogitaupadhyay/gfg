<html>
<head>
<title></title>
</head>
<%
    String str1 = request.getParameter("n1");
    String str2 = request.getParameter("n2");
     Integer  n1  = Integer.parseInt(str1);
     Integer  n2  = Integer.parseInt(str2);
	 Integer sum  = n1  + n2;
%>

<%=n1%> <b>+</b> <%=n2%> <b>=</b>  <%=sum%>

 </body>
</html>
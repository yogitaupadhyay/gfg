 <%@page  session="false"%>
<!DOCTYPE >
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<%=session%>
<%
session.invalidate();
%>

</body>
</html>
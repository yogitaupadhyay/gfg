<%@ page 
	language="java" 
	contentType="text/html;"
    pageEncoding="UTF-8"
    autoFlush="true"
    buffer="32kb"
    %>
    
<!--     buffer="8kb" -->
    <%
     /* out.flush(); */
    %>
<!DOCTYPE >
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<%for(int i=1;i<=10000000;i++) {%>
   <%=i%>,
   <%if(i%100==0){ %>
   <br>
   <%} %>
   
<%} %>

</body>
</html>
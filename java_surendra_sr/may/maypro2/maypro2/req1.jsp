<%@page import="java.util.Date"%>
<%@page import="java.util.Random"%>
<%@page import="java.sql.*"%>
<html>
<head>
<title></title>
</head>

<body>
   
  <%
     // java.util.Date now  = new java.util.Date();
      //java.util.Random rand  = new java.util.Random();
  
	 Date now  = new Date();
     Random rand  = new Random();
	 
     int n1 = rand.nextInt(100);
     int n2 = rand.nextInt(100);
	 int sum  = n1  + n2;
  %>
Today Date &  Time : <%=now%>
<hr>
  <%=n1%> +   <%=n2%>  = <%=sum%>
  
  
  
  
   
 </body>
</html>
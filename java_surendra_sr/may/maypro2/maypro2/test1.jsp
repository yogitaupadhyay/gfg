<html>
<head>
<title></title>
</head>
<body>
<%!
  int totalHit;
%>

<%!
   int m1(){
   return (int)(Math.random()*100);
   }

%>


     <%
	       double num1  ;
		   num1  = Math.random();
	 %>
	 
	 <%=num1%>
	 
	 <hr>
	 
	  <%
	       double num2  ;
		   num2  = Math.random();
	 %>
	 
	 <%=num2%>
	 
	 <fieldset>
	 <%=m1()%>
	 </fieldset> 
	 
	 <fieldset>
	 Total Hit = <span style='color:red;font-size:40px;'><%=++totalHit%><span>
	 </fieldset>
	 
 </body>
</html>
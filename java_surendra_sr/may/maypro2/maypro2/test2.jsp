<html>
<head>
<title></title>
</head>
<style>
tr:hover{
  background-color:#456;
}
</style>
<body>
   <table border='1' width='100%'>
     
	  <% for(int row=1;row<=10;row++){%>
	     <tr >
		           <%
				     for(int col=1;col<=10;col++){
				           int r = col*row;
				   %>
						<td> <%=row%> x <%=col%> = <%=r%></td>
					
					<%}%>	
	     </tr>
		 
	  <%}%>
   </table>
	 
 </body>
</html>
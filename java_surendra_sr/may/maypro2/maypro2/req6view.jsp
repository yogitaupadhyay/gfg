<html>
<head>
<title></title>
</head>
<body>
<%
String [] words =(String [])request.getAttribute("myWords");

%>


  <table border='3' width='50%'>
   <tr> 
      <th>sno</th>
	  <th>word</th>
   </tr>
   <%
      for(int w=1;w<=words.length;w++){
	    String word  = words[w-1];
   
   %>
   <tr> 
      <td><%=w%></td>
      <td><%=word%></td>
   </tr>
   <%}%>
   
   
 </table>
 </body>
</html>
Happy
<hr>

<%
String [] words ={"apple","mobile","ram","cpu","laptop"};
request.setAttribute("myWords",words);
request.getRequestDispatcher("req6view.jsp").forward(request,response);
//request.getRequestDispatcher("req6view.jsp").include(request,response);

%>
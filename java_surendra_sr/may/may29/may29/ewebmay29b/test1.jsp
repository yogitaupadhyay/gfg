<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%
List<Integer>list  = new ArrayList<>();
for(int i=1;i<=10;i++){
	list.add((int)(Math.random()*10000));
}

request.setAttribute("data", list);
/* RequestDispatcher rd  = request.getRequestDispatcher("test1_view.jsp");
rd.forward(request, response); */

%>
<jsp:forward page="test1_view.jsp" />

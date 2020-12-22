<%
//db based on id
sis.com.Department dept1 = null;
dept1  = new sis.com.Department();
//db filli t
dept1.setId(101);
dept1.setName("Civil");
dept1.setLocation("Raipur");
request.setAttribute("dept", dept1);

%>
<jsp:forward page="dept_view.jsp"/>


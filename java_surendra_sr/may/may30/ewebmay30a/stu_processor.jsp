<%@page import="sis.com.Student"%>
<%
String idStr  = request.getParameter("stu_id");
String name  = request.getParameter("stu_name");
String ageStr  = request.getParameter("stu_age");
String mobile  = request.getParameter("stu_mobile");
String email  = request.getParameter("stu_email");
String address  = request.getParameter("stu_address");

//parse
long id  = Long.parseLong(idStr);
int age  = Integer.parseInt(ageStr);

Student stu = new Student();
	stu.setId(id);
	stu.setName(name);
	stu.setAge(age);
	stu.setMobile(mobile);
	stu.setEmail(email);
	stu.setAddress(address);
  //todo insert into db 
request.setAttribute("stu1", stu);
%>
<jsp:forward page="stu_view.jsp"/>
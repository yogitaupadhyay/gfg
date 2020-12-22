<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<jsp:useBean 
		id="stu1" 
		class="sis.com.Student" 
		scope="request"/>
ID: <jsp:getProperty property="id" name="stu1"/>
<hr>
Name :<jsp:getProperty property="name" name="stu1"/>
<hr>
age :<jsp:getProperty property="age" name="stu1"/>
<hr> 
mobile :<jsp:getProperty property="mobile" name="stu1"/>
<hr>
email: <jsp:getProperty property="email" name="stu1"/>

<hr>
address :<jsp:getProperty property="address" name="stu1"/>
<hr>
formNumber :<jsp:getProperty property="formNumber" name="stu1"/>

</body>
</html>
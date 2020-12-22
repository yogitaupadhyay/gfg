<%@page import="sis.com.Student"%>
<jsp:useBean id="stu1"  
 class="sis.com.Student"
 scope="request"/>
 
<jsp:setProperty property="id"     param="stu_id"  name="stu1"/>
<jsp:setProperty property="age"    param="stu_age"  name="stu1"/>
<jsp:setProperty property="name"    param="stu_name"  name="stu1"/>
<jsp:setProperty property="mobile"  param="stu_mobile"  name="stu1"/>
<jsp:setProperty property="email"   param="stu_email"  name="stu1"/>
<jsp:setProperty property="address"  param="stu_address"  name="stu1"/>
<jsp:setProperty property="formNumber"  value="<%=System.currentTimeMillis() %>"  name="stu1"/>

<jsp:forward page="stu_view.jsp"/>
<%@page import="sis.com.Student"%>
<jsp:useBean id="stu1"  
 class="sis.com.Student"
 scope="request"/>
 <!-- pojo property and param name must same 
 then autometic set value
  -->
<jsp:setProperty property="*"  name="stu1"/>
<jsp:setProperty property="address" param="stu_address"    name="stu1"/>
<jsp:setProperty property="formNumber"  value="<%=System.currentTimeMillis() %>"  name="stu1"/>

<jsp:forward page="stu_view.jsp"/>
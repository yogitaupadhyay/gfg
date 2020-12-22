<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="css/sis_sm.css" rel="stylesheet" type="text/css">
</head>
<body>
	<!-- header section start -->
	<div id="header_section">
	  <!-- logo section start -->
	 <div id="header_logo" >
	   <a href="home.html">
	 <img alt="" src="imgs/sislogo.png" style="width: 100%;height: 150px;">
	 </a>
	 </div>
	 
	  <!-- logo section end -->
	 
	  <!-- title section start -->
	 <div id="header_title" style="text-align: center;">
	 	<marquee width="100%" behavior="alternate"
	 	style="font-size: 60px; "
	 	>
	 	Student Management
	 	</marquee>
	 </div>
	  <!-- title section end -->
	 
	  <!-- login section start -->
	 <div id="header_login">
	      <%if(false){ %>
	 		<a href="logout">Logout</a>
	 	 <%}else{ %>	
	 		<a href="login.jsp">Login</a>
	 	 <%} %>	
	 </div>
	  <!-- login section end -->
	 <div style="background-color: green;width:100%;height: 50px;">
	   <a href="student_list.jsp">show all student</a>
	   <a href="show_all_dept.jsp">show all dept</a>
	   <a href="#">link2</a>
	   <a href="#">link3</a>
	   <a href="#">link4</a>
	 </div>
	  
	</div>
	<!-- header section end -->

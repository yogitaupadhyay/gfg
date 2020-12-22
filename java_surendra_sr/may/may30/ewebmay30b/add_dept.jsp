<%@include file="sis_header.jsp" %>
	<!-- context section start -->
	<div id="content_section">
	 
	 
	 
	 
	 <center>
	    <fieldset style="width: 50%;background-color: pink;">
	    
	    <legend>Add Department</legend>
	   <form action="add_dept_proccessor.jsp" method="post" >
	        <table>
	        
	         <tr>
	           <td>Dept ID</td>
	           <td><input type="text" name="dept_id" autofocus="autofocus"></td>
	         </tr>
	         
	         <tr>
	           <td>Dept name</td>
	           <td><input type="text" name="dept_name" ></td>
	         </tr>
	         
	         <tr>
	           <td>Dept location</td>
	           <td><input type="text" name="dept_loc" ></td>
	         </tr>
	        
	         <tr>
	           <td colspan="2" align="right">
	           <input type="submit" value="add dept"></td>
	         </tr>
	        </table>
	        
	   </form>
	    </fieldset>
	 
	</center>
	 
	
	</div>
	<!-- context section end -->
<%@include file="sis_footer.jsp" %>
	
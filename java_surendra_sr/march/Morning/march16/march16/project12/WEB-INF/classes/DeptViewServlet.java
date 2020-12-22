  import java.util.*;
  import java.io.*;
  import javax.servlet.*;
  
 public class DeptViewServlet extends GenericServlet{ 
 public   void service(ServletRequest request, ServletResponse response) 
			throws  ServletException, IOException{

			 List<Department> allDeptList  = (List<Department>)request.getAttribute("deptlist");
			  
			  
			  
			StringBuffer htmlCode  = new StringBuffer();
			htmlCode.append("<html>");	
			htmlCode.append("<body>");	
			htmlCode.append("<table border='1' width='100%' >");	
			for(Department dept: allDeptList){
				htmlCode.append("<tr>");	
				htmlCode.append("<td>"+dept.getId()+"</td>");	
				htmlCode.append("<td>"+dept.getName()+"</td>");	
				htmlCode.append("<td>"+dept.getLocation()+"</td>");	
				htmlCode.append("</tr>");	
			}
			htmlCode.append("</table>");	
			
			htmlCode.append("<a href='sis.html'>back to home </a> ");	
			htmlCode.append("</body>");	
			htmlCode.append("</html>");	
			
			 PrintWriter  pw  = response.getWriter();
			 response.setContentType("text/html");
			 pw.print(htmlCode);
			 
			
			 
	}//service
 
 }//End of class 

 import java.util.*;
  import java.io.*;
  import javax.servlet.*;
  
 public class DeptViewExcelServlet extends GenericServlet{ 
 public   void service(ServletRequest request, ServletResponse response) 
			throws  ServletException, IOException{

			 List<Department> allDeptList  = (List<Department>)request.getAttribute("deptlist");
			StringBuffer htmlCode  = new StringBuffer();
			for(Department dept: allDeptList){
				htmlCode.append( dept.getId()+"\t");	
				htmlCode.append( dept.getName()+"\t");	
				htmlCode.append( dept.getLocation()+"\t");	
				htmlCode.append("\n");	
			}
			 PrintWriter  pw  = response.getWriter();
			 response.setContentType("application/vnd.ms-excel");
			 
			 pw.print(htmlCode);
			 
			
			 
	}//service
 
 }//End of class 

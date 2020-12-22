import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
@Author:Surendra Kumar Sao

	>>Software Architect and Corporate Trainer
	>>+9 year exp in (mumbai,pune,hyd,bangaluru)
	>>Java Certified SCJP & SCWCD with 98%
	Trained more than 5k students and employees.
    MCA from (NIT)National Institute of Technology Raipur(C.G.)
	Email : sur.nit.mca@gmail.com
	Mobile 7987234544, 9009442844
	https://www.urbanpro.com/raipur/surendra-kumar-sao/reviews/7223178
	https://www.urbanpro.com/raipur/surendra-kumar-sao/1334109?_tp=
 
   CurrentYear 2019 
 */

public class SearchEmployeeView extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		List<Employee> empList  = (List<Employee>)  request.getAttribute("allemplist");
		  //and generate response
		StringBuffer htmlCode = new StringBuffer();
		htmlCode.append("<html>");
		htmlCode.append("<head>");
		htmlCode.append("<title>emp</title>");
		htmlCode.append("</head>");
		htmlCode.append("<body>");
		
		htmlCode.append("<a href='sis.html'>back to home</a><hr>");
		htmlCode.append("<a href='emp_search_form.html'>back to emp search</a><hr>");
		htmlCode.append("<h1>Total Employee found"+empList.size()+"</h1>");
		
		htmlCode.append("<table width='100%' border='2'>");
		
		htmlCode.append("<tr>");
		htmlCode.append("<th>sno</th>");
		htmlCode.append("<th>id</th>");
		htmlCode.append("<th>name</th>");
		htmlCode.append("<th>job</th>");
		htmlCode.append("<th>salary</th>");
		htmlCode.append("<th>deptno</th>");
		htmlCode.append("</tr>");
		 
		for(int empSNO=1;empSNO<=empList.size();empSNO++) {
			Employee emp  = empList.get(empSNO-1);
			htmlCode.append("<tr>");
			htmlCode.append("<td>"+empSNO+"</td>");
			htmlCode.append("<td>"+emp.getId()+"</td>");
			htmlCode.append("<td>"+emp.getName()+"</td>");
			htmlCode.append("<td>"+emp.getJob()+"</td>");
			htmlCode.append("<td>"+emp.getSalary()+"</td>");
			htmlCode.append("<td>"+emp.getDeptno()+"</td>");
			htmlCode.append("</tr>");
		}
		htmlCode.append("</table>");
		htmlCode.append("</body>");
		htmlCode.append("</html>");
		
		
		
		
		//how to print into browser
		PrintWriter pw  = response.getWriter();
		response.setContentType("text/html");
		pw.print(htmlCode);
		
		
		
		
		
	}

}

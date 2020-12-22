import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
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

public class ShowAllInfoService extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		//get data from cookies
		Cookie[] allCookies = request.getCookies();
		 
		
        StringBuffer htmlCode = new StringBuffer();
		htmlCode.append("<html>");
		htmlCode.append("<head>");
		htmlCode.append("<title>Sis</title>");
		htmlCode.append("</head>");
		htmlCode.append("<body bgcolor=''>");
		htmlCode.append("<table border='1' width='100%'>");
		htmlCode.append("<tr>");
		htmlCode.append("<th>sno</th>");
		htmlCode.append("<th>word</th>");
		htmlCode.append("<th>details</th>");
		htmlCode.append("</tr>");
		if(allCookies==null) {
			htmlCode.append("<tr>");
			htmlCode.append("<td colspan='3'>No Info found</td>");
			htmlCode.append("</tr>");
		}else {
			for(int sno=1;sno<=allCookies.length;sno++) {
				Cookie c = allCookies[sno-1];
				htmlCode.append("<tr>");
				htmlCode.append("<td>"+sno+"</td>");
				htmlCode.append("<td>"+c.getName()+"</td>");
				htmlCode.append("<td>"+c.getValue()+"</td>");
				htmlCode.append("</tr>");
			}
			
			
		}
		
		htmlCode.append("</table>");
		 
		htmlCode.append("<a href='sis.html'>back to home</a><hr>");
		htmlCode.append("<a href='add_info.html'>add more info</a><hr>");
		htmlCode.append("</body>");
		htmlCode.append("</html>");
		
		
		
		
		//how to print into browser
		PrintWriter pw  = response.getWriter();
		response.setContentType("text/html");
		pw.print(htmlCode);
		
        
		
		
		
	}

}

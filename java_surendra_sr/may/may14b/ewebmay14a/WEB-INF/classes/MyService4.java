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

public class MyService4  extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		//get data from cookies
		Cookie[] allCookies = request.getCookies();
		String userName = null;
		String userTime  = null;
		
		//extract data from cookies
		if(allCookies!=null) {
			for(Cookie c: allCookies) {
				String name = c.getName();
				String value = c.getValue();
				
				if("client_name".equalsIgnoreCase(name)) {
					userName =value;
				}
				
				if("client_time".equalsIgnoreCase(name)) {
					userTime =value;
				}
			}
		}
		
		
        StringBuffer htmlCode = new StringBuffer();
		htmlCode.append("<html>");
		htmlCode.append("<head>");
		htmlCode.append("<title>Sis</title>");
		htmlCode.append("</head>");
		htmlCode.append("<body bgcolor='#345'>");
		htmlCode.append("<h1>This is Service4</h1><hr>");
		
		htmlCode.append("<h1>Hello user "+userName+"</h1><hr>");
		htmlCode.append("<h1>Hello entered time  "+userTime+"</h1><hr>");
		
		htmlCode.append("<a href='sis.html'>back to home</a><hr>");
		htmlCode.append("<a href='s2'>got to Service2</a><hr>");
		htmlCode.append("</body>");
		htmlCode.append("</html>");
		
		
		
		
		//how to print into browser
		PrintWriter pw  = response.getWriter();
		response.setContentType("text/html");
		pw.print(htmlCode);
		
        
		
		
		
	}


}

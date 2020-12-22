import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

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

public class DateAndTimeService extends HttpServlet{
 
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
   
	StringBuffer htmlCode = new StringBuffer();
	htmlCode.append("<html>");
	htmlCode.append("<head>");
	htmlCode.append("<title>dept</title>");
	htmlCode.append("</head>");
	htmlCode.append("<a href='sis.html'>go to home</a><hr>");
	htmlCode.append("<body >");
	htmlCode.append("<h1>Welcome TO Sis</h1><hr>");
	htmlCode.append("<h1>Date and time  ="+ new Date()+"</h1><hr>");
	htmlCode.append("</body>");
	htmlCode.append("</html>");
	//how to print into browser
	PrintWriter pw  = response.getWriter();
	response.setContentType("text/html");
	pw.print(htmlCode);
	
	//add header
	response.setHeader("refresh", "1");
	
	
	
	 
}	 
	

@Override
protected void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
	//int a =5/0;
   response.getWriter().print("do POst Called "+ new Date());
	 
}	 
	   
}

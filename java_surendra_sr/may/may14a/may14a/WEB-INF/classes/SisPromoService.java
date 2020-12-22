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

public class SisPromoService extends HttpServlet{
 
@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
   
	StringBuffer htmlCode = new StringBuffer();
	htmlCode.append("<html>");
	htmlCode.append("<head>");
	htmlCode.append("<title>dept</title>");
	htmlCode.append("</head>");
	htmlCode.append("<body >");
	
	htmlCode.append("<a href='dice'>skip</a><hr>");
	
	htmlCode.append("<img src='sispro.png'><hr>");
	htmlCode.append("<h1>new java batch start from 20th may 2019</h1><hr>");
	htmlCode.append("</body>");
	htmlCode.append("</html>"); 
	//how to print into browser
	PrintWriter pw  = response.getWriter();
	response.setContentType("text/html");
	pw.print(htmlCode);
	//add header
	//response.setHeader("refresh", "20");
	response.setHeader("refresh", "10; url='dice'");
	
	  
}	 
	  
	   
}
	
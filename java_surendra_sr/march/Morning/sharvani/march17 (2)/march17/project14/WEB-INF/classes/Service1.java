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
 */

 
  import java.util.*;
  import java.io.*;
  import javax.servlet.*;
  
 public class Service1 extends GenericServlet{ 
 
         
 
 
 public   void service(ServletRequest request, ServletResponse response) 
			throws  ServletException, IOException{
			  
			StringBuffer htmlCode  = new StringBuffer();
			htmlCode.append("<html>");	
			htmlCode.append("<body bgcolor='green'>");	
			htmlCode.append("<h1>Service1<h1>");	
			htmlCode.append("<h1>Hello user(ra) " +  request.getAttribute("clientName")+"<h1>");	
			htmlCode.append("<h1>Enterd Time(ra) " +   request.getAttribute("enteredTime")+"<h1>");	
			 htmlCode.append("<hr>");	
			  ServletContext context  = getServletContext();
			htmlCode.append("<h1>Hello user(ca) " +  context.getAttribute("clientName")+"<h1>");	
			htmlCode.append("<h1>Enterd Time(ca) " +   context.getAttribute("enteredTime")+"<h1>");	
			htmlCode.append("</body>");	
			htmlCode.append("</html>");	
			
			 PrintWriter  pw  = response.getWriter();
			 response.setContentType("text/html");
			 pw.print(htmlCode);
			 
			
			 
	}//service
 
 }//End of class 

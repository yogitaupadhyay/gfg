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
  
 public class HomeServletHelper extends GenericServlet{ 
 
         
 
 
 public   void service(ServletRequest request, ServletResponse response) 
			throws  ServletException, IOException{
			  
			StringBuffer htmlCode  = new StringBuffer();
			htmlCode.append("<html>");	
			htmlCode.append("<body>");	
			htmlCode.append("<h1>Hello user(RA) " +  request.getAttribute("clientName")+"<h1>");	
			htmlCode.append("<h1>Enterd Time(RA) " +   request.getAttribute("enteredTime")+"<h1>");	
			htmlCode.append("<hr>");	
			  ServletContext context  = getServletContext();
			htmlCode.append("<h1>Hello user(cA) " +  context.getAttribute("clientName")+"<h1>");	
			htmlCode.append("<h1>Enterd Time(cA) " +   context.getAttribute("enteredTime")+"<h1>");	
			
			htmlCode.append("<hr>");	
			htmlCode.append("<a href='s1'>service1 </a> ");	
			htmlCode.append("<a href='s2'>service2 </a> ");	
			htmlCode.append("<hr>");	
			 
			htmlCode.append("</body>");	
			htmlCode.append("</html>");	
			
			 PrintWriter  pw  = response.getWriter();
			 response.setContentType("text/html");
			 pw.print(htmlCode);
			 
			
			 
	}//service
 
 }//End of class 
